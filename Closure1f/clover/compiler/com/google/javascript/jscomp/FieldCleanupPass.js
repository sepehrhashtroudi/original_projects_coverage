var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":126,"id":7453,"methods":[{"el":42,"sc":3,"sl":40},{"el":50,"sc":3,"sl":44},{"el":55,"sc":3,"sl":52}],"name":"FieldCleanupPass","sl":36},{"el":125,"id":7460,"methods":[{"el":89,"sc":5,"sl":85},{"el":106,"sc":5,"sl":91},{"el":120,"sc":5,"sl":114},{"el":124,"sc":5,"sl":122}],"name":"FieldCleanupPass.QualifiedNameSearchTraversal","sl":80}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10769":{"methods":[{"sl":40}],"name":"testCleanupPassOrder","pass":true,"statements":[{"sl":41}]},"test_14363":{"methods":[{"sl":40}],"name":"testCleanupPassOrder","pass":true,"statements":[{"sl":41}]},"test_7146":{"methods":[{"sl":40}],"name":"testCleanupPassOrder","pass":true,"statements":[{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10769, 14363, 7146], [10769, 14363, 7146], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
