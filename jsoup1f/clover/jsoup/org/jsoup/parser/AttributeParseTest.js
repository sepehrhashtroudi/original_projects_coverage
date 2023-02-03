var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":2247,"methods":[{"el":30,"sc":5,"sl":16},{"el":37,"sc":5,"sl":32},{"el":44,"sc":5,"sl":39}],"name":"AttributeParseTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_128":{"methods":[{"sl":32}],"name":"parsesEmptyString","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_45":{"methods":[{"sl":16}],"name":"parsesRoughAttributeString","pass":true,"statements":[{"sl":17},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_88":{"methods":[{"sl":39}],"name":"emptyOnNoKey","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [45], [45], [], [], [45], [45], [45], [45], [45], [45], [45], [45], [45], [45], [], [], [128], [128], [128], [128], [128], [], [], [88], [88], [88], [88], [88], [], []]
