# patch-correctness

## 文件记录

1. result/combineInfo/testSet_unpurify.bak 文件存储了所有补丁不去除包名的信息，Math93b_Patch207 记录第一处修改的信息
2. result/combineInfo/testSet_unpurify 存储了所有包含包名的信息 Math93b_Patch207 记录第二处修改的信息
3. result/combineInfo/testSet_unpurify1 存储了 Math93b_Patch207 跟 Lang58b_Patch26 的randoop 测试用例信息

4. result/dataSetPartition :   按照 cross bug来划分的数据集，其中 list表示trace为list信息
5. result/crossbug: 按照crossbug 划分 无validate set
6. result/crosspatch 按照139个测试集划分，有 validate set
7. result/crosspatch2 按照139个测试集划分，无validate set 8 result/crosspatch3 随机划分了100个测试集，无validate set
   
## 代码记录

1. service/BuildJsonResult 从dynamic trace 和 static中构造 combineinfo
2. script/DataPartition 从combineInfo中划分出来trainSet testSet validateSet
3. entity.PatchJson 读取 combineInfo的 数据格式