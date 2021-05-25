import pickle
f = pickle.load(open('correctSet4kui.pkl', 'rb'))
f2 = pickle.load(open('TrainSet4kui.pkl', 'rb'))
for x in f:
    assert(x not in f2)
    f2[x] = f[x]
open('TrainSet4kui.pkl', 'wb').write(pickle.dumps(f2))