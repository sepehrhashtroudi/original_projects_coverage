var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":14645,"methods":[{"el":14,"sc":5,"sl":9},{"el":20,"sc":5,"sl":16},{"el":25,"sc":5,"sl":22},{"el":29,"sc":5,"sl":27}],"name":"TestVersionUtil","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_159":{"methods":[{"sl":22}],"name":"testMavenVersionParsing","pass":true,"statements":[{"sl":23}]},"test_34":{"methods":[{"sl":9}],"name":"testVersionPartParsing","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_37":{"methods":[{"sl":16}],"name":"testVersionParsing","pass":true,"statements":[{"sl":18}]},"test_47":{"methods":[{"sl":27}],"name":"testPackageVersionMatches","pass":true,"statements":[{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [34], [], [34], [34], [34], [], [], [37], [], [37], [], [], [], [159], [159], [], [], [], [47], [47], [], []]
