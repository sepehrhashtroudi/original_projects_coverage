var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":92,"id":14203,"methods":[{"el":32,"sc":5,"sl":12},{"el":55,"sc":5,"sl":34},{"el":77,"sc":5,"sl":61},{"el":90,"sc":5,"sl":79}],"name":"TestJsonFormatDetection","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_14":{"methods":[{"sl":12}],"name":"testSimpleValidArray","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":19},{"sl":20},{"sl":21},{"sl":23},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31}]},"test_140":{"methods":[{"sl":61}],"name":"testSimpleValidString","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76}]},"test_70":{"methods":[{"sl":79}],"name":"testSimpleInvalid","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":85},{"sl":87},{"sl":89}]},"test_96":{"methods":[{"sl":34}],"name":"testSimpleValidObject","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":41},{"sl":42},{"sl":43},{"sl":45},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":53},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [14], [], [14], [14], [14], [14], [], [14], [14], [14], [], [14], [], [14], [14], [14], [14], [14], [14], [14], [], [], [96], [], [96], [96], [96], [96], [], [96], [96], [96], [], [96], [], [96], [96], [96], [96], [96], [96], [96], [96], [], [], [], [], [], [], [140], [], [140], [140], [140], [140], [], [140], [140], [140], [140], [140], [140], [140], [140], [140], [], [], [70], [], [70], [70], [70], [], [70], [], [70], [], [70], [], [], []]
