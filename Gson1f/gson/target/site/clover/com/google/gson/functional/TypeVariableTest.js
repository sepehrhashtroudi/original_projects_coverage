var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":80,"id":8711,"methods":[{"el":46,"sc":3,"sl":33}],"name":"TypeVariableTest","sl":31},{"el":69,"id":8723,"methods":[{"el":56,"sc":5,"sl":53},{"el":68,"sc":5,"sl":58}],"name":"TypeVariableTest.Foo","sl":48},{"el":79,"id":8733,"methods":[{"el":74,"sc":5,"sl":72},{"el":78,"sc":5,"sl":76}],"name":"TypeVariableTest.Bar","sl":71}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_356":{"methods":[{"sl":33},{"sl":53},{"sl":58},{"sl":72},{"sl":76}],"name":"testSingle","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":45},{"sl":54},{"sl":55},{"sl":60},{"sl":63},{"sl":64},{"sl":73},{"sl":77}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [356], [356], [356], [356], [356], [356], [356], [356], [356], [356], [], [356], [356], [], [], [], [], [], [], [], [356], [356], [356], [], [], [356], [], [356], [], [], [356], [356], [], [], [], [], [], [], [], [356], [356], [], [], [356], [356], [], [], []]
