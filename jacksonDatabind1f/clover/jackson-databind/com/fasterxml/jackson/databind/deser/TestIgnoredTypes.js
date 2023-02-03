var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":36878,"methods":[{"el":48,"sc":5,"sl":36}],"name":"TestIgnoredTypes","sl":10},{"el":21,"id":36878,"methods":[{"el":20,"sc":9,"sl":20}],"name":"TestIgnoredTypes.IgnoredType","sl":19},{"el":28,"id":36879,"methods":[],"name":"TestIgnoredTypes.NonIgnoredType","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1520":{"methods":[{"sl":36}],"name":"testIgnoredType","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":45},{"sl":46},{"sl":47}]},"test_535":{"methods":[{"sl":36}],"name":"testIgnoredType","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1520, 535], [], [], [1520, 535], [1520, 535], [1520, 535], [1520, 535], [], [], [1520, 535], [1520, 535], [1520, 535], [], []]
