var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":62,"id":34886,"methods":[{"el":53,"sc":5,"sl":47},{"el":61,"sc":5,"sl":55}],"name":"TestStatics","sl":12},{"el":29,"id":34886,"methods":[],"name":"TestStatics.FieldBean","sl":21},{"el":39,"id":34886,"methods":[{"el":33,"sc":9,"sl":33},{"el":35,"sc":9,"sl":35},{"el":38,"sc":9,"sl":38}],"name":"TestStatics.GetterBean","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1239":{"methods":[{"sl":33},{"sl":55}],"name":"testStaticMethods","pass":true,"statements":[{"sl":33},{"sl":57},{"sl":58},{"sl":59},{"sl":60}]},"test_308":{"methods":[{"sl":47}],"name":"testStaticFields","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_644":{"methods":[{"sl":47}],"name":"testStaticFields","pass":true,"statements":[{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_817":{"methods":[{"sl":33},{"sl":55}],"name":"testStaticMethods","pass":true,"statements":[{"sl":33},{"sl":57},{"sl":58},{"sl":59},{"sl":60}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [817, 1239], [], [], [], [], [], [], [], [], [], [], [], [], [], [308, 644], [], [308, 644], [308, 644], [308, 644], [308, 644], [], [], [817, 1239], [], [817, 1239], [817, 1239], [817, 1239], [817, 1239], [], []]
