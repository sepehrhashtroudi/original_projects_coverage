var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":675,"methods":[{"el":32,"sc":3,"sl":29},{"el":37,"sc":3,"sl":34}],"name":"FieldNamingStrategy2Adapter","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":29},{"sl":34}],"name":"testDeprecatedNamingStrategy","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":36}]},"test_373":{"methods":[{"sl":29},{"sl":34}],"name":"testSimpleAdapter","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [103, 373], [103, 373], [103, 373], [], [], [103, 373], [], [103, 373], [], []]
