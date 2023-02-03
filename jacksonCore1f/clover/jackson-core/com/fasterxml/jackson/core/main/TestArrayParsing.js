var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":15642,"methods":[{"el":21,"sc":5,"sl":12},{"el":37,"sc":5,"sl":23},{"el":53,"sc":5,"sl":39},{"el":71,"sc":5,"sl":55}],"name":"TestArrayParsing","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_189":{"methods":[{"sl":12}],"name":"testValidEmpty","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20}]},"test_56":{"methods":[{"sl":39}],"name":"testInvalidMissingFieldName","pass":true,"statements":[{"sl":41},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":50},{"sl":52}]},"test_66":{"methods":[{"sl":55}],"name":"testInvalidExtraComma","pass":true,"statements":[{"sl":57},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":64},{"sl":65},{"sl":68},{"sl":70}]},"test_93":{"methods":[{"sl":23}],"name":"testInvalidEmptyMissingClose","pass":true,"statements":[{"sl":25},{"sl":27},{"sl":28},{"sl":30},{"sl":31},{"sl":34},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [189], [], [189], [], [189], [189], [189], [189], [189], [], [], [93], [], [93], [], [93], [93], [], [93], [93], [], [], [93], [], [93], [], [], [56], [], [56], [], [56], [56], [], [56], [56], [], [], [56], [], [56], [], [], [66], [], [66], [], [66], [66], [66], [66], [], [66], [66], [], [], [66], [], [66], [], []]
