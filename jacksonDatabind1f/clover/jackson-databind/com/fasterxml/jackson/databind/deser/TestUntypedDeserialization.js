var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":94,"id":42272,"methods":[{"el":74,"sc":5,"sl":19},{"el":93,"sc":5,"sl":77}],"name":"TestUntypedDeserialization","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1013":{"methods":[{"sl":77}],"name":"testObjectSerializeWithLong","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81},{"sl":83},{"sl":85},{"sl":86},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92}]},"test_108":{"methods":[{"sl":19}],"name":"testSampleDoc","pass":true,"statements":[{"sl":23},{"sl":25},{"sl":30},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":48},{"sl":50},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":58},{"sl":60},{"sl":61},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_2018":{"methods":[{"sl":77}],"name":"testObjectSerializeWithLong","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81},{"sl":83},{"sl":85},{"sl":86},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92}]},"test_824":{"methods":[{"sl":19}],"name":"testSampleDoc","pass":true,"statements":[{"sl":23},{"sl":25},{"sl":30},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":48},{"sl":50},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":58},{"sl":60},{"sl":61},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [824, 108], [], [], [], [824, 108], [], [824, 108], [], [], [], [], [824, 108], [], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [], [824, 108], [824, 108], [824, 108], [], [824, 108], [824, 108], [824, 108], [], [824, 108], [], [], [824, 108], [824, 108], [824, 108], [824, 108], [], [824, 108], [], [824, 108], [824, 108], [], [], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [824, 108], [], [], [], [], [], [1013, 2018], [], [1013, 2018], [1013, 2018], [1013, 2018], [], [1013, 2018], [], [1013, 2018], [1013, 2018], [], [1013, 2018], [1013, 2018], [1013, 2018], [1013, 2018], [1013, 2018], [], []]