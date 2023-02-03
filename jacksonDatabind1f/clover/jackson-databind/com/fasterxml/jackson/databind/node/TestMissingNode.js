var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":28,"id":43064,"methods":[{"el":27,"sc":5,"sl":7}],"name":"TestMissingNode","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1499":{"methods":[{"sl":7}],"name":"testMissing","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":13},{"sl":14},{"sl":15},{"sl":20},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_958":{"methods":[{"sl":7}],"name":"testMissing","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":13},{"sl":14},{"sl":15},{"sl":20},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [958, 1499], [], [958, 1499], [958, 1499], [958, 1499], [], [958, 1499], [958, 1499], [958, 1499], [], [], [], [], [958, 1499], [], [], [958, 1499], [958, 1499], [958, 1499], [958, 1499], [], []]
