var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":68,"id":37685,"methods":[{"el":67,"sc":5,"sl":39}],"name":"TestAbstractWithObjectId","sl":10},{"el":12,"id":37685,"methods":[],"name":"TestAbstractWithObjectId.BaseInterface","sl":12},{"el":23,"id":37685,"methods":[{"el":22,"sc":9,"sl":20}],"name":"TestAbstractWithObjectId.BaseInterfaceImpl","sl":15},{"el":37,"id":37687,"methods":[{"el":32,"sc":9,"sl":30},{"el":36,"sc":9,"sl":34}],"name":"TestAbstractWithObjectId.ListWrapper","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1355":{"methods":[{"sl":20},{"sl":30},{"sl":34},{"sl":39}],"name":"testIssue877","pass":true,"statements":[{"sl":21},{"sl":31},{"sl":35},{"sl":42},{"sl":43},{"sl":46},{"sl":47},{"sl":50},{"sl":51},{"sl":52},{"sl":55},{"sl":56},{"sl":59},{"sl":60},{"sl":62},{"sl":64},{"sl":66}]},"test_273":{"methods":[{"sl":20},{"sl":30},{"sl":34},{"sl":39}],"name":"testIssue877","pass":true,"statements":[{"sl":21},{"sl":31},{"sl":35},{"sl":42},{"sl":43},{"sl":46},{"sl":47},{"sl":50},{"sl":51},{"sl":52},{"sl":55},{"sl":56},{"sl":59},{"sl":60},{"sl":62},{"sl":64},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1355, 273], [1355, 273], [], [], [], [], [], [], [], [], [1355, 273], [1355, 273], [], [], [1355, 273], [1355, 273], [], [], [], [1355, 273], [], [], [1355, 273], [1355, 273], [], [], [1355, 273], [1355, 273], [], [], [1355, 273], [1355, 273], [1355, 273], [], [], [1355, 273], [1355, 273], [], [], [1355, 273], [1355, 273], [], [1355, 273], [], [1355, 273], [], [1355, 273], [], []]
