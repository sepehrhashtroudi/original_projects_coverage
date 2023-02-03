var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":49,"id":41612,"methods":[{"el":48,"sc":5,"sl":36}],"name":"TestKeyDeserializers","sl":12},{"el":21,"id":41612,"methods":[{"el":20,"sc":9,"sl":16}],"name":"TestKeyDeserializers.FooKeyDeserializer","sl":14},{"el":27,"id":41614,"methods":[{"el":26,"sc":9,"sl":26}],"name":"TestKeyDeserializers.Foo","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1500":{"methods":[{"sl":16},{"sl":26},{"sl":36}],"name":"testKeyDeserializers","pass":true,"statements":[{"sl":19},{"sl":26},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":45},{"sl":46},{"sl":47}]},"test_420":{"methods":[{"sl":16},{"sl":26},{"sl":36}],"name":"testKeyDeserializers","pass":true,"statements":[{"sl":19},{"sl":26},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":44},{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1500, 420], [], [], [1500, 420], [], [], [], [], [], [], [1500, 420], [], [], [], [], [], [], [], [], [], [1500, 420], [], [1500, 420], [1500, 420], [1500, 420], [1500, 420], [1500, 420], [], [1500, 420], [1500, 420], [1500, 420], [1500, 420], [], []]
