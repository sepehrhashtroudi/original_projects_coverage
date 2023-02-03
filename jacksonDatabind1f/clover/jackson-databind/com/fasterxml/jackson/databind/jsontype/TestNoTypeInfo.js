var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":41453,"methods":[{"el":39,"sc":5,"sl":26}],"name":"TestNoTypeInfo","sl":8},{"el":13,"id":41453,"methods":[],"name":"TestNoTypeInfo.NoTypeInterface","sl":12},{"el":17,"id":41453,"methods":[],"name":"TestNoTypeInfo.NoType","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2128":{"methods":[{"sl":26}],"name":"testWithIdNone","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":31},{"sl":32},{"sl":35},{"sl":36},{"sl":37},{"sl":38}]},"test_673":{"methods":[{"sl":26}],"name":"testWithIdNone","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":31},{"sl":32},{"sl":35},{"sl":36},{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2128, 673], [], [2128, 673], [2128, 673], [], [2128, 673], [2128, 673], [], [], [2128, 673], [2128, 673], [2128, 673], [2128, 673], [], []]
