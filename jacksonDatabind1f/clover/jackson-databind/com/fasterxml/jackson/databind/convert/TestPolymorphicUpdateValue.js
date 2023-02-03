var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":43105,"methods":[{"el":44,"sc":5,"sl":35}],"name":"TestPolymorphicUpdateValue","sl":11},{"el":19,"id":43105,"methods":[],"name":"TestPolymorphicUpdateValue.Parent","sl":16},{"el":25,"id":43105,"methods":[],"name":"TestPolymorphicUpdateValue.Child","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1267":{"methods":[{"sl":35}],"name":"testPolymorphicTest","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_1588":{"methods":[{"sl":35}],"name":"testPolymorphicTest","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1267, 1588], [], [1267, 1588], [1267, 1588], [1267, 1588], [1267, 1588], [1267, 1588], [1267, 1588], [1267, 1588], [], []]
