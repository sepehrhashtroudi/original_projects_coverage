var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":35636,"methods":[{"el":31,"sc":5,"sl":22},{"el":39,"sc":5,"sl":33},{"el":52,"sc":5,"sl":45}],"name":"TestJSONP","sl":7},{"el":12,"id":35636,"methods":[],"name":"TestJSONP.Base","sl":10},{"el":20,"id":35636,"methods":[{"el":19,"sc":9,"sl":16}],"name":"TestJSONP.Impl","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1245":{"methods":[{"sl":22}],"name":"testSimpleScalars","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":27},{"sl":29}]},"test_168":{"methods":[{"sl":16},{"sl":45}],"name":"testWithType","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":47},{"sl":48},{"sl":49},{"sl":50}]},"test_1724":{"methods":[{"sl":22}],"name":"testSimpleScalars","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":27},{"sl":29}]},"test_747":{"methods":[{"sl":16},{"sl":45}],"name":"testWithType","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":47},{"sl":48},{"sl":49},{"sl":50}]},"test_755":{"methods":[{"sl":16},{"sl":33}],"name":"testSimpleBean","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":35},{"sl":36}]},"test_795":{"methods":[{"sl":16},{"sl":33}],"name":"testSimpleBean","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":35},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [168, 795, 755, 747], [168, 795, 755, 747], [168, 795, 755, 747], [], [], [], [1245, 1724], [], [1245, 1724], [1245, 1724], [], [1245, 1724], [], [1245, 1724], [], [], [], [795, 755], [], [795, 755], [795, 755], [], [], [], [], [], [], [], [], [168, 747], [], [168, 747], [168, 747], [168, 747], [168, 747], [], [], []]
