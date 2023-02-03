var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":4834,"methods":[{"el":33,"sc":3,"sl":29},{"el":37,"sc":3,"sl":35},{"el":42,"sc":3,"sl":39}],"name":"NullExclusionStrategyTest","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_557":{"methods":[{"sl":35}],"name":"testNeverSkipsClass","pass":true,"statements":[{"sl":36}]},"test_627":{"methods":[{"sl":39}],"name":"testNeverSkipsField","pass":true,"statements":[{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [557], [557], [], [], [627], [627], [], [], []]
