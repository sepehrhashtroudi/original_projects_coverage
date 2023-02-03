var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":48,"id":2888,"methods":[{"el":47,"sc":3,"sl":44}],"name":"UpperCaseNamingPolicy","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_194":{"methods":[{"sl":44}],"name":"testMixedCase","pass":true,"statements":[{"sl":46}]},"test_249":{"methods":[{"sl":44}],"name":"testAllUpperCase","pass":true,"statements":[{"sl":46}]},"test_586":{"methods":[{"sl":44}],"name":"testAllLowerCase","pass":true,"statements":[{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [586, 194, 249], [], [586, 194, 249], [], []]
