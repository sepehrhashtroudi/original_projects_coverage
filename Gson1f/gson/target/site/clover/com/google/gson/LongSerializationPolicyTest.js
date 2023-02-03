var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":4567,"methods":[{"el":37,"sc":3,"sl":29},{"el":47,"sc":3,"sl":39}],"name":"LongSerializationPolicyTest","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":39}],"name":"testStringLongSerialization","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]},"test_147":{"methods":[{"sl":29}],"name":"testDefaultLongSerialization","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [147], [147], [147], [], [147], [147], [147], [147], [], [], [123], [123], [123], [], [123], [123], [123], [123], [], []]
