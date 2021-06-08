import pickle
f = pickle.load(open('correctSet.pkl', 'rb'))
f2 = pickle.load(open('trainSet.pkl', 'rb'))
for x in f:
    assert(x not in f2)
    f2[x] = f[x]
open('trainSet2.pkl', 'wb').write(pickle.dumps(f2))