var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":3903,"methods":[{"el":42,"sc":3,"sl":32},{"el":49,"sc":3,"sl":44},{"el":56,"sc":3,"sl":51},{"el":62,"sc":3,"sl":58},{"el":68,"sc":3,"sl":64}],"name":"CamelCaseSeparatorNamingPolicyTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_23":{"methods":[{"sl":44}],"name":"testUnderscoreSeparator","pass":true,"statements":[{"sl":45},{"sl":47},{"sl":48}]},"test_260":{"methods":[{"sl":32}],"name":"testInvalidInstantiation","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":38},{"sl":39}]},"test_290":{"methods":[{"sl":58}],"name":"testNameBeginsWithCapital","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61}]},"test_34":{"methods":[{"sl":64}],"name":"testExceptionPossiblyIncorrectSeparation","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":67}]},"test_492":{"methods":[{"sl":51}],"name":"testMultiCharSeparator","pass":true,"statements":[{"sl":52},{"sl":54},{"sl":55}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [260], [260], [260], [], [], [], [260], [260], [], [], [], [], [23], [23], [], [23], [23], [], [], [492], [492], [], [492], [492], [], [], [290], [290], [290], [290], [], [], [34], [34], [34], [34], [], []]
