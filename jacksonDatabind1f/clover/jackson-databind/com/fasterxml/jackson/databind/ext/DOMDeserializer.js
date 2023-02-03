var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":4465,"methods":[{"el":28,"sc":5,"sl":24},{"el":30,"sc":5,"sl":30},{"el":42,"sc":5,"sl":35}],"name":"DOMDeserializer","sl":19},{"el":58,"id":4474,"methods":[{"el":53,"sc":9,"sl":53},{"el":57,"sc":9,"sl":54}],"name":"DOMDeserializer.NodeDeserializer","sl":50},{"el":68,"id":4478,"methods":[{"el":63,"sc":9,"sl":63},{"el":67,"sc":9,"sl":64}],"name":"DOMDeserializer.DocumentDeserializer","sl":60}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1068":{"methods":[{"sl":24},{"sl":30},{"sl":35},{"sl":63},{"sl":64}],"name":"testDeserializeNonNS","pass":true,"statements":[{"sl":25},{"sl":27},{"sl":30},{"sl":37},{"sl":38},{"sl":63},{"sl":66}]},"test_1370":{"methods":[{"sl":30},{"sl":35},{"sl":63},{"sl":64}],"name":"testDeserializeNS","pass":true,"statements":[{"sl":30},{"sl":37},{"sl":38},{"sl":63},{"sl":66}]},"test_1645":{"methods":[{"sl":30},{"sl":35},{"sl":63},{"sl":64}],"name":"testDeserializeNS","pass":true,"statements":[{"sl":30},{"sl":37},{"sl":38},{"sl":63},{"sl":66}]},"test_975":{"methods":[{"sl":24},{"sl":30},{"sl":35},{"sl":63},{"sl":64}],"name":"testDeserializeNonNS","pass":true,"statements":[{"sl":25},{"sl":27},{"sl":30},{"sl":37},{"sl":38},{"sl":63},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1068, 975], [1068, 975], [], [1068, 975], [], [], [1370, 1068, 1645, 975], [], [], [], [], [1370, 1068, 1645, 975], [], [1370, 1068, 1645, 975], [1370, 1068, 1645, 975], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1370, 1068, 1645, 975], [1370, 1068, 1645, 975], [], [1370, 1068, 1645, 975], [], [], []]
