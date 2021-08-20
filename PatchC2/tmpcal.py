from __future__ import division


def calculate():
    with open('patchsimre.txt', 'r') as resultfile:
        result = resultfile.read()
    resultfile.close()
    TP = 0
    TN = 0
    FP = 0
    FN = 0
    for line in result.split('\n'):
        patchname, pred, real = line.split('\t')
        if not pred.strip() == '':
            if pred == '0' and real == '0':
                TP = TP + 1
            elif pred == '1' and real == '1':
                TN = TN + 1
            elif pred == '0' and real == '1':
                FN = FN + 1
            elif pred == '1' and real == '0':
                FP = FP + 1

    precision = TP / (TP + FP)
    recall = TP / (TP + FN)

    print('precision %f, recall %f' % (precision, recall))


if __name__ == '__main__':
    calculate()
