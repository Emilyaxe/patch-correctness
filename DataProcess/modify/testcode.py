import json

from tqdm import tqdm

lst = ['trainSetS', 'testSetS']
for x in lst:
    data = json.loads(open('%s' % x, 'r').read())
    wf = open('%s.pkl' % x, 'wb')
    newdata = {}
    for patchid in tqdm(data):
        # if patchid != 'patch1-Closure-122-Kali-plausible.patch':
        #    continue
        datas = data[patchid]
        # if key1 != '642':
        #    continue
        codelines = datas[2].splitlines()
        oldcode = []
        addcode = []
        deletelines = {}
        addlines = {}
        normallines = {}
        for idx, code in enumerate(codelines):
            if len(code) == 0:
                addcode.append('')
                oldcode.append('')
                normallines[idx] = len(oldcode)
            elif code[0] == '+':
                addcode.append(code[1:])
                addlines[idx] = len(addcode)
            # elif '-    }'in code and idx == len(codelines) - 1:
            #    addcode.append(code[1:])

            elif code[0] == '-':
                oldcode.append(code[1:])
                deletelines[idx] = len(oldcode)
            else:
                oldcode.append(code)
                addcode.append(code)
                normallines[idx] = len(oldcode)
        # print("\n".join(oldcode), addcode)
        code = '\n'.join(oldcode)
        newcode = '\n'.join(addcode)
        try:
            tokens = javalang.tokenizer.tokenize(code)
            parser = javalang.parser.Parser(tokens)
            tree = parser.parse_member_declaration()
            root = getroottree(generateAST(tree))
            print('---------------\n')
            tokens = javalang.tokenizer.tokenize(newcode)
            parser = javalang.parser.Parser(tokens)
            tree = parser.parse_member_declaration()
            newroot = getroottree(generateAST(tree))
            turnposition(newroot)
            # print(root.printTreeWithLine(root))#print(code, newcode)
            changetree(root, newroot)
            # print('test1', root.printTreeWithLine(root))
            root = getroottreewithLine(root.printTreeWithLine(root).split())
            subroot = getModify(root)
            if 'dummyMethod' in root.getTreestr():
                subroot = root
            if subroot is None:
                print(root.printTree(root))
                assert (0)
            # print(root.printTreeWithLine(root))
            root, vardic, _ = solveLongTree(root, subroot, 1000)
            setProb(root)
            print(root.name)
            print(root.printTree(root))
            # assert(0)
            ##trace info
            filepre = '%s/%s/' % (x[:-1], patchid)
            if not os.path.exists(filepre):
                continue
            alineb = collectLine(root)
            alinef = collectLine2(root)
            lst = os.listdir(filepre)
            tcover = {}
            for xs in lst:
                cover = {}
                tmp = []
                if os.path.exists(filepre + xs + '/buggy'):

                    f = open(filepre + xs + '/buggy', 'r')

                    for line in f:
                        lst = line.split('#')
                        lineid = int(lst[1])
                        if lineid in normallines:
                            lineid = normallines[lineid]
                            if lineid not in alineb:
                                continue
                            node = getNodeById(root, lineid)
                        elif lineid in addlines:
                            assert (0)
                        elif lineid in deletelines:
                            lineid = deletelines[lineid]
                            if lineid not in alineb:
                                continue
                            node = getNodeById(root, lineid)
                        # print(lineid)
                        linenode, _ = getSubroot(node)
                        if linenode is None:
                            continue
                        # print(line, codelines[int(lst[1])])
                        # print(root.printTreeWithLine(root))
                        tmp.append(linenode.id)
                cover['buggy'] = tmp
                tmp = []
                if os.path.exists(filepre + xs + '/fixed'):

                    f = open(filepre + xs + '/fixed', 'r')

                    for line in f:
                        lst = line.split('#')
                        lineid = int(lst[1])
                        if lineid in normallines:
                            lineid = normallines[lineid]
                            if lineid not in alineb:
                                continue
                            node = getNodeById(root, lineid)
                        elif lineid in addlines:
                            lineid = addlines[lineid]
                            if lineid not in alinef:
                                continue
                            node = getNodeById2(root, lineid)
                        elif lineid in deletelines:
                            assert (0)
                        # node = getNodeById2(root, lineid)
                        linenode, _ = getSubroot(node)
                        if linenode is None:
                            continue
                        tmp.append(linenode.id)
                cover['fixed'] = tmp
                tcover[xs] = cover

            newdata[patchid] = (
                {'tree': root.printTreeWithVar(root, vardic), 'label': datas[0], 'prob': root.getTreeProb(root),
                 'cover': tcover})
            # assert(0)
            # if patchid == 'Math93b_Patch207':
            #    assert(0)
        except:
            print(datas[2])
            print(patchid)
            traceback.print_exc()
            if 'Closure-92' in patchid or 'Closure-93' in patchid:
                continue
            assert (0)
            # print(patchid[key1])
            # if patchid == 'patch1-Chart-4-SOFix.patch':

            pass
            errors.setdefault(x, []).append(patchid)
    wf.write(pickle.dumps(newdata, protocol=1))
print(errors)
print(fnames)
