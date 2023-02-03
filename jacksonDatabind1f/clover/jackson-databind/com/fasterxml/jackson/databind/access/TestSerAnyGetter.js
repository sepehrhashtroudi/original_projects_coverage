var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":42669,"methods":[{"el":66,"sc":5,"sl":56},{"el":72,"sc":5,"sl":68}],"name":"TestSerAnyGetter","sl":12},{"el":35,"id":42669,"methods":[{"el":29,"sc":9,"sl":26},{"el":34,"sc":9,"sl":31}],"name":"TestSerAnyGetter.DynaBean","sl":21},{"el":46,"id":42673,"methods":[{"el":45,"sc":9,"sl":39}],"name":"TestSerAnyGetter.PrivateThing","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1515":{"methods":[{"sl":39},{"sl":68}],"name":"testPrivate","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":70},{"sl":71}]},"test_196":{"methods":[{"sl":26},{"sl":31},{"sl":56}],"name":"testDynaBean","pass":true,"statements":[{"sl":28},{"sl":33},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":63},{"sl":64},{"sl":65}]},"test_458":{"methods":[{"sl":26},{"sl":31},{"sl":56}],"name":"testDynaBean","pass":true,"statements":[{"sl":28},{"sl":33},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":63},{"sl":64},{"sl":65}]},"test_711":{"methods":[{"sl":39},{"sl":68}],"name":"testPrivate","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":70},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [458, 196], [], [458, 196], [], [], [458, 196], [], [458, 196], [], [], [], [], [], [711, 1515], [], [], [711, 1515], [711, 1515], [711, 1515], [], [], [], [], [], [], [], [], [], [], [], [458, 196], [], [458, 196], [458, 196], [458, 196], [458, 196], [], [458, 196], [458, 196], [458, 196], [], [], [711, 1515], [], [711, 1515], [711, 1515], [], []]
