var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":244,"id":93175,"methods":[{"el":51,"sc":3,"sl":42},{"el":98,"sc":3,"sl":53},{"el":119,"sc":3,"sl":100},{"el":139,"sc":3,"sl":121},{"el":159,"sc":3,"sl":141},{"el":174,"sc":3,"sl":161},{"el":186,"sc":3,"sl":176},{"el":230,"sc":11,"sl":224},{"el":232,"sc":11,"sl":231},{"el":237,"sc":11,"sl":235},{"el":240,"sc":11,"sl":238},{"el":242,"sc":3,"sl":217}],"name":"GillIntegratorTest","sl":40},{"el":215,"id":93261,"methods":[{"el":191,"sc":5,"sl":189},{"el":194,"sc":5,"sl":192},{"el":212,"sc":5,"sl":195}],"name":"GillIntegratorTest.KeplerStepHandler","sl":188}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]