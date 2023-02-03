var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":37866,"methods":[{"el":21,"sc":5,"sl":16},{"el":28,"sc":5,"sl":23},{"el":34,"sc":5,"sl":30},{"el":41,"sc":5,"sl":36}],"name":"TestSimpleAtomicTypes","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1111":{"methods":[{"sl":36}],"name":"testAtomicReference","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]},"test_1173":{"methods":[{"sl":16}],"name":"testAtomicBoolean","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_1351":{"methods":[{"sl":23}],"name":"testAtomicInteger","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_1482":{"methods":[{"sl":30}],"name":"testAtomicLong","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_165":{"methods":[{"sl":30}],"name":"testAtomicLong","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_1696":{"methods":[{"sl":23}],"name":"testAtomicInteger","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27}]},"test_2174":{"methods":[{"sl":16}],"name":"testAtomicBoolean","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_540":{"methods":[{"sl":36}],"name":"testAtomicReference","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2174, 1173], [], [2174, 1173], [2174, 1173], [2174, 1173], [], [], [1696, 1351], [], [1696, 1351], [1696, 1351], [1696, 1351], [], [], [1482, 165], [], [1482, 165], [1482, 165], [], [], [1111, 540], [], [1111, 540], [1111, 540], [1111, 540], [], []]
