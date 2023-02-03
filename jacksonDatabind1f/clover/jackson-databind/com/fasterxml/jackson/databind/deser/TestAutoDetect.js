var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":37442,"methods":[{"el":51,"sc":5,"sl":32}],"name":"TestAutoDetect","sl":9},{"el":24,"id":37442,"methods":[{"el":21,"sc":9,"sl":21},{"el":23,"sc":9,"sl":23}],"name":"TestAutoDetect.PrivateBean","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1161":{"methods":[{"sl":23},{"sl":32}],"name":"testPrivateCtor","pass":true,"statements":[{"sl":23},{"sl":35},{"sl":36},{"sl":37},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":49}]},"test_765":{"methods":[{"sl":23},{"sl":32}],"name":"testPrivateCtor","pass":true,"statements":[{"sl":23},{"sl":35},{"sl":36},{"sl":37},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [765, 1161], [], [], [], [], [], [], [], [], [765, 1161], [], [], [765, 1161], [765, 1161], [765, 1161], [], [], [765, 1161], [], [765, 1161], [765, 1161], [765, 1161], [765, 1161], [765, 1161], [], [], [765, 1161], [], [], [], []]
