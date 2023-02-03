var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":18342,"methods":[{"el":14,"sc":5,"sl":9},{"el":38,"sc":5,"sl":22}],"name":"TestUnicode","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_187":{"methods":[{"sl":9},{"sl":22}],"name":"testSurrogates","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":24},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":32},{"sl":33},{"sl":34},{"sl":36},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [187], [], [187], [187], [187], [], [], [], [], [], [], [], [], [187], [], [187], [], [187], [187], [187], [187], [187], [], [187], [187], [187], [], [187], [187], [], []]
