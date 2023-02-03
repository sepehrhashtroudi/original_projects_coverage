var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":5331,"methods":[{"el":34,"sc":3,"sl":30},{"el":39,"sc":3,"sl":36},{"el":44,"sc":3,"sl":41},{"el":49,"sc":3,"sl":46},{"el":54,"sc":3,"sl":51},{"el":59,"sc":3,"sl":56}],"name":"UpperCamelCaseSeparatorNamingPolicyTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_124":{"methods":[{"sl":51}],"name":"testAllUpperCaseStartingWithUnderscore","pass":true,"statements":[{"sl":52}]},"test_135":{"methods":[{"sl":36}],"name":"testAllLowerCase","pass":true,"statements":[{"sl":37}]},"test_274":{"methods":[{"sl":56}],"name":"testMixedCase","pass":true,"statements":[{"sl":57}]},"test_528":{"methods":[{"sl":46}],"name":"testAllUpperCaseExceptFirst","pass":true,"statements":[{"sl":47}]},"test_66":{"methods":[{"sl":41}],"name":"testAllUpperCase","pass":true,"statements":[{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [135], [135], [], [], [], [66], [66], [], [], [], [528], [528], [], [], [], [124], [124], [], [], [], [274], [274], [], [], []]
