var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":17433,"methods":[{"el":23,"sc":5,"sl":13},{"el":37,"sc":5,"sl":25},{"el":64,"sc":7,"sl":39}],"name":"TestTextBuffer","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_114":{"methods":[{"sl":13}],"name":"testSimple","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":22}]},"test_120":{"methods":[{"sl":25}],"name":"testLonger","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29},{"sl":31},{"sl":32},{"sl":33},{"sl":35},{"sl":36}]},"test_79":{"methods":[{"sl":39}],"name":"testLongAppend","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [114], [], [114], [114], [114], [114], [114], [114], [], [114], [], [], [120], [], [120], [120], [120], [], [120], [120], [120], [], [120], [120], [], [], [79], [], [79], [79], [79], [79], [], [79], [79], [], [], [79], [79], [79], [79], [79], [79], [], [], [79], [79], [79], [79], [79], [79], [], []]
