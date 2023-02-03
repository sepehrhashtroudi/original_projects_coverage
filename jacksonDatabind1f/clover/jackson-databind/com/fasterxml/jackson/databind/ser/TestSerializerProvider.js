var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":44388,"methods":[{"el":33,"sc":5,"sl":13}],"name":"TestSerializerProvider","sl":6},{"el":11,"id":44388,"methods":[{"el":10,"sc":9,"sl":10}],"name":"TestSerializerProvider.MyBean","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1592":{"methods":[{"sl":13}],"name":"testFindExplicit","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":29},{"sl":31},{"sl":32}]},"test_801":{"methods":[{"sl":13}],"name":"testFindExplicit","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":21},{"sl":22},{"sl":23},{"sl":25},{"sl":27},{"sl":29},{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1592, 801], [], [1592, 801], [1592, 801], [1592, 801], [1592, 801], [], [], [1592, 801], [1592, 801], [1592, 801], [], [1592, 801], [], [1592, 801], [], [1592, 801], [], [1592, 801], [1592, 801], [], []]
