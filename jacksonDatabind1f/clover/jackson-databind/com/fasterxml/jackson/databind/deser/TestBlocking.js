var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":41156,"methods":[{"el":39,"sc":5,"sl":22}],"name":"TestBlocking","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1938":{"methods":[{"sl":22}],"name":"testEagerAdvance","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":30},{"sl":31},{"sl":34},{"sl":35},{"sl":37}]},"test_883":{"methods":[{"sl":22}],"name":"testEagerAdvance","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":30},{"sl":31},{"sl":34},{"sl":35},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [883, 1938], [], [883, 1938], [883, 1938], [883, 1938], [883, 1938], [], [], [883, 1938], [883, 1938], [], [], [883, 1938], [883, 1938], [], [883, 1938], [], [], []]
