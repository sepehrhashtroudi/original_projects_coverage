var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":83,"id":18096,"methods":[{"el":32,"sc":5,"sl":12},{"el":47,"sc":5,"sl":34},{"el":54,"sc":5,"sl":49},{"el":81,"sc":5,"sl":57}],"name":"TestNumberParsing","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":34}],"name":"testIntParsingWithStrings","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]},"test_121":{"methods":[{"sl":57}],"name":"testLongBoundsChecks","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80}]},"test_183":{"methods":[{"sl":49}],"name":"testLongParsing","pass":true,"statements":[{"sl":51},{"sl":53}]},"test_60":{"methods":[{"sl":12}],"name":"testIntParsing","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":29},{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [60], [], [60], [], [60], [60], [60], [60], [60], [60], [60], [], [60], [60], [60], [60], [], [60], [60], [60], [], [], [10], [], [10], [10], [10], [10], [10], [10], [10], [10], [10], [10], [10], [], [], [183], [], [183], [], [183], [], [], [], [121], [], [121], [121], [121], [121], [], [121], [121], [121], [121], [121], [121], [], [121], [121], [121], [121], [121], [121], [121], [121], [121], [121], [], [], []]
