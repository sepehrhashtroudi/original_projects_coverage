var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":42038,"methods":[{"el":54,"sc":5,"sl":45}],"name":"TestMixinDeserForMethods","sl":10},{"el":28,"id":42038,"methods":[{"el":23,"sc":9,"sl":23},{"el":27,"sc":9,"sl":25}],"name":"TestMixinDeserForMethods.BaseClass","sl":19},{"el":33,"id":42041,"methods":[],"name":"TestMixinDeserForMethods.MixIn","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2084":{"methods":[{"sl":23},{"sl":25},{"sl":45}],"name":"testWithAnySetter","pass":true,"statements":[{"sl":26},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53}]},"test_334":{"methods":[{"sl":23},{"sl":25},{"sl":45}],"name":"testWithAnySetter","pass":true,"statements":[{"sl":26},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [334, 2084], [], [334, 2084], [334, 2084], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [334, 2084], [], [334, 2084], [334, 2084], [334, 2084], [334, 2084], [334, 2084], [334, 2084], [334, 2084], [], []]
