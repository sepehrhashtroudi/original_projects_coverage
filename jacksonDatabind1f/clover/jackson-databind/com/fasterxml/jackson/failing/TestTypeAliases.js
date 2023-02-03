var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":34336,"methods":[{"el":41,"sc":5,"sl":33}],"name":"TestTypeAliases","sl":7},{"el":15,"id":34336,"methods":[],"name":"TestTypeAliases.Base","sl":13},{"el":19,"id":34336,"methods":[],"name":"TestTypeAliases.BaseData","sl":17},{"el":23,"id":34336,"methods":[],"name":"TestTypeAliases.Child","sl":21},{"el":22,"id":34336,"methods":[],"name":"TestTypeAliases.Child.ChildData","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
