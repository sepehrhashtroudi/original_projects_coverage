var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":4581,"methods":[{"el":37,"sc":3,"sl":33},{"el":42,"sc":3,"sl":39},{"el":47,"sc":3,"sl":44},{"el":52,"sc":3,"sl":49},{"el":58,"sc":3,"sl":54}],"name":"LowerCamelCaseSeparatorNamingPolicyTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_133":{"methods":[{"sl":39}],"name":"testNameBeginsWithLowerCase","pass":true,"statements":[{"sl":40},{"sl":41}]},"test_333":{"methods":[{"sl":44}],"name":"testNameBeginsWithUpperCase","pass":true,"statements":[{"sl":45},{"sl":46}]},"test_607":{"methods":[{"sl":49}],"name":"testExceptionPossiblyIncorrectSeparation","pass":true,"statements":[{"sl":50},{"sl":51}]},"test_643":{"methods":[{"sl":54}],"name":"testUsingDashesInstead","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [133], [133], [133], [], [], [333], [333], [333], [], [], [607], [607], [607], [], [], [643], [643], [643], [643], [], []]
