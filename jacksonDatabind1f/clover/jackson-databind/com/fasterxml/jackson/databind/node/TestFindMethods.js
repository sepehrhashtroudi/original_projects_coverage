var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":42234,"methods":[{"el":25,"sc":5,"sl":13},{"el":39,"sc":5,"sl":27},{"el":64,"sc":5,"sl":41},{"el":72,"sc":5,"sl":66}],"name":"TestFindMethods","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_177":{"methods":[{"sl":41},{"sl":66}],"name":"testMatchingMultiple","pass":true,"statements":[{"sl":43},{"sl":45},{"sl":46},{"sl":48},{"sl":49},{"sl":51},{"sl":52},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":68},{"sl":71}]},"test_2014":{"methods":[{"sl":27},{"sl":66}],"name":"testMatchingSingle","pass":true,"statements":[{"sl":29},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":68},{"sl":71}]},"test_33":{"methods":[{"sl":41},{"sl":66}],"name":"testMatchingMultiple","pass":true,"statements":[{"sl":43},{"sl":45},{"sl":46},{"sl":48},{"sl":49},{"sl":51},{"sl":52},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":68},{"sl":71}]},"test_684":{"methods":[{"sl":27},{"sl":66}],"name":"testMatchingSingle","pass":true,"statements":[{"sl":29},{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":68},{"sl":71}]},"test_860":{"methods":[{"sl":13},{"sl":66}],"name":"testNonMatching","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":68},{"sl":71}]},"test_982":{"methods":[{"sl":13},{"sl":66}],"name":"testNonMatching","pass":true,"statements":[{"sl":15},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":68},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [982, 860], [], [982, 860], [], [982, 860], [982, 860], [982, 860], [982, 860], [982, 860], [], [982, 860], [982, 860], [], [], [684, 2014], [], [684, 2014], [], [684, 2014], [684, 2014], [684, 2014], [684, 2014], [684, 2014], [684, 2014], [684, 2014], [684, 2014], [], [], [33, 177], [], [33, 177], [], [33, 177], [33, 177], [], [33, 177], [33, 177], [], [33, 177], [33, 177], [], [33, 177], [33, 177], [33, 177], [33, 177], [], [], [33, 177], [33, 177], [33, 177], [33, 177], [], [], [33, 684, 2014, 177, 982, 860], [], [33, 684, 2014, 177, 982, 860], [], [], [33, 684, 2014, 177, 982, 860], [], []]