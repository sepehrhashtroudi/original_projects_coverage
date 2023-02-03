var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":40786,"methods":[{"el":43,"sc":5,"sl":31},{"el":64,"sc":5,"sl":46}],"name":"TestInferredMutators","sl":8},{"el":14,"id":40786,"methods":[{"el":13,"sc":9,"sl":13}],"name":"TestInferredMutators.Point","sl":10},{"el":22,"id":40788,"methods":[{"el":19,"sc":9,"sl":19},{"el":21,"sc":9,"sl":21}],"name":"TestInferredMutators.FixedPoint","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1083":{"methods":[{"sl":46}],"name":"testDeserializationInference","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":51},{"sl":52},{"sl":53},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":62}]},"test_1283":{"methods":[{"sl":19},{"sl":31}],"name":"testFinalFieldIgnoral","pass":true,"statements":[{"sl":19},{"sl":33},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":41}]},"test_1979":{"methods":[{"sl":19},{"sl":31}],"name":"testFinalFieldIgnoral","pass":true,"statements":[{"sl":19},{"sl":33},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":41}]},"test_384":{"methods":[{"sl":46}],"name":"testDeserializationInference","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":51},{"sl":52},{"sl":53},{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":62}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1979, 1283], [], [], [], [], [], [], [], [], [], [], [], [1979, 1283], [], [1979, 1283], [], [1979, 1283], [1979, 1283], [1979, 1283], [1979, 1283], [], [], [1979, 1283], [], [], [], [], [384, 1083], [], [384, 1083], [384, 1083], [], [384, 1083], [384, 1083], [384, 1083], [], [], [384, 1083], [384, 1083], [384, 1083], [384, 1083], [], [], [384, 1083], [], [], []]
