var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":33326,"methods":[{"el":37,"sc":5,"sl":29},{"el":53,"sc":5,"sl":39}],"name":"TestTypeResolution","sl":13},{"el":15,"id":33326,"methods":[],"name":"TestTypeResolution.LongValuedMap","sl":15},{"el":17,"id":33326,"methods":[],"name":"TestTypeResolution.GenericList","sl":17},{"el":18,"id":33326,"methods":[],"name":"TestTypeResolution.GenericList2","sl":18},{"el":20,"id":33326,"methods":[],"name":"TestTypeResolution.LongList","sl":20},{"el":21,"id":33326,"methods":[],"name":"TestTypeResolution.MyLongList","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2163":{"methods":[{"sl":29}],"name":"testMaps","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_517":{"methods":[{"sl":39}],"name":"testList","pass":true,"statements":[{"sl":41},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_675":{"methods":[{"sl":39}],"name":"testList","pass":true,"statements":[{"sl":41},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_802":{"methods":[{"sl":29}],"name":"testMaps","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2163, 802], [], [2163, 802], [2163, 802], [2163, 802], [2163, 802], [2163, 802], [2163, 802], [], [], [675, 517], [], [675, 517], [], [675, 517], [675, 517], [675, 517], [675, 517], [675, 517], [], [675, 517], [675, 517], [675, 517], [675, 517], [], []]
