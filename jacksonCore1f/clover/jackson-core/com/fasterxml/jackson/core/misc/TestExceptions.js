var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":15912,"methods":[{"el":16,"sc":5,"sl":9}],"name":"TestExceptions","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_145":{"methods":[{"sl":9}],"name":"testOriginalMesssage","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [145], [], [145], [145], [145], [145], [145], [], []]
