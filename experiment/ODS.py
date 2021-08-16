import os


def obtain_feature():
    dir = '/home/emily/WorkSpace/Project/PatchCorrectness/patch-correctness/result/PairFiles'
    all_data = {'testSet', 'trainSet', 'validateSet'}
    for data in all_data:
        dataset = os.path.join(dir).join(all_data)
        l1 = os.listdir(dataset)
        os.system('mkdir dir1')
        for i in l1:
            os.system('rm -r ./dir1')
            os.system('mkdir dir1')
            s1 = 'cp -r ./test/' + i + ' ./test1'
            os.system(s1)
            s2 = 'java -classpath ./coming.jar fr.inria.coming.main.ComingMain -location ./dir1 -input files -mode features -output feature/' + dataset
            os.system(s2)


if __name__ == '__main__':
    obtain_feature()
