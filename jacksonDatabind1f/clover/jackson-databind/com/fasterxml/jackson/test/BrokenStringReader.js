var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":43145,"methods":[{"el":14,"sc":5,"sl":10},{"el":25,"sc":5,"sl":16}],"name":"BrokenStringReader","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_499":{"methods":[{"sl":10},{"sl":16}],"name":"testExceptionWithIncomplete","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":20},{"sl":21},{"sl":22},{"sl":24}]},"test_923":{"methods":[{"sl":10},{"sl":16}],"name":"testExceptionWithIncomplete","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":20},{"sl":21},{"sl":22},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [499, 923], [], [499, 923], [499, 923], [], [], [499, 923], [], [], [], [499, 923], [499, 923], [499, 923], [], [499, 923], [], []]
