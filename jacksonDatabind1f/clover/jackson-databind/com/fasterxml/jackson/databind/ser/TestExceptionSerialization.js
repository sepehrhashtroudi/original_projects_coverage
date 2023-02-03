var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":37488,"methods":[{"el":41,"sc":5,"sl":19}],"name":"TestExceptionSerialization","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1086":{"methods":[{"sl":19}],"name":"testSimple","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":32},{"sl":33},{"sl":34},{"sl":37},{"sl":38}]},"test_1978":{"methods":[{"sl":19}],"name":"testSimple","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":32},{"sl":33},{"sl":34},{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1086, 1978], [], [1086, 1978], [1086, 1978], [1086, 1978], [], [1086, 1978], [1086, 1978], [1086, 1978], [], [], [], [], [1086, 1978], [1086, 1978], [1086, 1978], [], [], [1086, 1978], [1086, 1978], [], [], [], []]
