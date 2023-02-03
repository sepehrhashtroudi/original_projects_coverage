var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":66,"id":5248,"methods":[{"el":41,"sc":3,"sl":36},{"el":49,"sc":3,"sl":43},{"el":57,"sc":3,"sl":51},{"el":65,"sc":3,"sl":59}],"name":"TypeInfoMapTest","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_535":{"methods":[{"sl":43}],"name":"testNonMapConstruction","pass":true,"statements":[{"sl":44},{"sl":45},{"sl":46}]},"test_548":{"methods":[{"sl":59}],"name":"testMapImplementations","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":63},{"sl":64}]},"test_615":{"methods":[{"sl":51}],"name":"testBasicGetters","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":55},{"sl":56}]},"test_645":{"methods":[{"sl":36}],"name":"testInvalidConstruction","pass":true,"statements":[{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [645], [645], [645], [], [], [], [], [535], [535], [535], [535], [], [], [], [], [615], [615], [615], [], [615], [615], [], [], [548], [548], [548], [], [548], [548], [], []]
