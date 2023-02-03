var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":29449,"methods":[{"el":22,"sc":5,"sl":22},{"el":36,"sc":5,"sl":30},{"el":54,"sc":5,"sl":38}],"name":"NullifyingDeserializer","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1104":{"methods":[{"sl":30}],"name":"testDefaultAsNoClass","pass":true,"statements":[{"sl":34},{"sl":35}]},"test_1446":{"methods":[{"sl":30}],"name":"testBadTypeAsNull","pass":true,"statements":[{"sl":34},{"sl":35}]},"test_1916":{"methods":[{"sl":22},{"sl":30}],"name":"testBadTypeAsNull","pass":true,"statements":[{"sl":22},{"sl":34},{"sl":35}]},"test_2034":{"methods":[{"sl":22},{"sl":30}],"name":"testDefaultAsNoClass","pass":true,"statements":[{"sl":22},{"sl":34},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1916, 2034], [], [], [], [], [], [], [], [1916, 2034, 1104, 1446], [], [], [], [1916, 2034, 1104, 1446], [1916, 2034, 1104, 1446], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
