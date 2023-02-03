var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":37506,"methods":[{"el":53,"sc":5,"sl":36}],"name":"TestNullHandling","sl":10},{"el":27,"id":37506,"methods":[{"el":23,"sc":9,"sl":20},{"el":26,"sc":9,"sl":25}],"name":"TestNullHandling.FunnyNullDeserializer","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1208":{"methods":[{"sl":25},{"sl":36}],"name":"testCustomRootNulls","pass":true,"statements":[{"sl":26},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44},{"sl":45},{"sl":46},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_645":{"methods":[{"sl":25},{"sl":36}],"name":"testCustomRootNulls","pass":true,"statements":[{"sl":26},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44},{"sl":45},{"sl":46},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [645, 1208], [645, 1208], [], [], [], [], [], [], [], [], [], [645, 1208], [], [645, 1208], [645, 1208], [645, 1208], [645, 1208], [], [], [645, 1208], [645, 1208], [645, 1208], [], [], [645, 1208], [645, 1208], [645, 1208], [645, 1208], [], []]
