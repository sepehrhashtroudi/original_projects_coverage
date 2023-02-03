var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":1990,"methods":[{"el":49,"sc":3,"sl":45}],"name":"LowerCaseNamingPolicy","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_133":{"methods":[{"sl":45}],"name":"testNameBeginsWithLowerCase","pass":true,"statements":[{"sl":48}]},"test_255":{"methods":[{"sl":45}],"name":"testGsonWithLowerCaseDashPolicyDeserialiation","pass":true,"statements":[{"sl":48}]},"test_263":{"methods":[{"sl":45}],"name":"testMixedCase","pass":true,"statements":[{"sl":48}]},"test_333":{"methods":[{"sl":45}],"name":"testNameBeginsWithUpperCase","pass":true,"statements":[{"sl":48}]},"test_341":{"methods":[{"sl":45}],"name":"testAllLowerCase","pass":true,"statements":[{"sl":48}]},"test_506":{"methods":[{"sl":45}],"name":"testAllUpperCase","pass":true,"statements":[{"sl":48}]},"test_519":{"methods":[{"sl":45}],"name":"testGsonWithLowerCaseDashPolicySerialization","pass":true,"statements":[{"sl":48}]},"test_607":{"methods":[{"sl":45}],"name":"testExceptionPossiblyIncorrectSeparation","pass":true,"statements":[{"sl":48}]},"test_642":{"methods":[{"sl":45}],"name":"testGsonWithLowerCaseUnderscorePolicyDeserialiation","pass":true,"statements":[{"sl":48}]},"test_643":{"methods":[{"sl":45}],"name":"testUsingDashesInstead","pass":true,"statements":[{"sl":48}]},"test_657":{"methods":[{"sl":45}],"name":"testGsonWithLowerCaseUnderscorePolicySerialization","pass":true,"statements":[{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [263, 607, 133, 255, 642, 643, 333, 519, 341, 657, 506], [], [], [263, 607, 133, 255, 642, 643, 333, 519, 341, 657, 506], [], []]
