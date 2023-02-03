var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":39115,"methods":[{"el":37,"sc":5,"sl":28}],"name":"TestAbstract","sl":10},{"el":15,"id":39115,"methods":[],"name":"TestAbstract.Abstract","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1843":{"methods":[{"sl":28}],"name":"testAbstractFailure","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":35}]},"test_656":{"methods":[{"sl":28}],"name":"testAbstractFailure","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [656, 1843], [], [656, 1843], [656, 1843], [656, 1843], [], [], [656, 1843], [], [], []]
