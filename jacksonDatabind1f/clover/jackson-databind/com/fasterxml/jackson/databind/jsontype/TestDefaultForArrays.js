var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":104,"id":34545,"methods":[{"el":41,"sc":5,"sl":32},{"el":53,"sc":5,"sl":44},{"el":68,"sc":5,"sl":56},{"el":83,"sc":5,"sl":71},{"el":103,"sc":5,"sl":91}],"name":"TestDefaultForArrays","sl":7},{"el":20,"id":34545,"methods":[{"el":18,"sc":9,"sl":18},{"el":19,"sc":9,"sl":19}],"name":"TestDefaultForArrays.ArrayBean","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_117":{"methods":[{"sl":71},{"sl":91}],"name":"testArraysOfArrays","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":76},{"sl":77},{"sl":80},{"sl":81},{"sl":82},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102}]},"test_1175":{"methods":[{"sl":18},{"sl":19},{"sl":44}],"name":"testArrayTypingNested","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_1411":{"methods":[{"sl":56}],"name":"testNodeInArray","pass":true,"statements":[{"sl":58},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67}]},"test_1464":{"methods":[{"sl":18},{"sl":19},{"sl":32}],"name":"testArrayTypingSimple","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_1673":{"methods":[{"sl":18},{"sl":19},{"sl":44}],"name":"testArrayTypingNested","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52}]},"test_207":{"methods":[{"sl":56}],"name":"testNodeInArray","pass":true,"statements":[{"sl":58},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67}]},"test_543":{"methods":[{"sl":18},{"sl":19},{"sl":32}],"name":"testArrayTypingSimple","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_881":{"methods":[{"sl":71},{"sl":91}],"name":"testArraysOfArrays","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":76},{"sl":77},{"sl":80},{"sl":81},{"sl":82},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1673, 543, 1464, 1175], [1673, 543, 1464, 1175], [], [], [], [], [], [], [], [], [], [], [], [], [543, 1464], [], [543, 1464], [543, 1464], [543, 1464], [543, 1464], [543, 1464], [543, 1464], [543, 1464], [], [], [], [1673, 1175], [], [1673, 1175], [1673, 1175], [1673, 1175], [1673, 1175], [1673, 1175], [1673, 1175], [1673, 1175], [], [], [], [1411, 207], [], [1411, 207], [], [1411, 207], [1411, 207], [1411, 207], [1411, 207], [1411, 207], [1411, 207], [1411, 207], [1411, 207], [], [], [], [881, 117], [], [881, 117], [881, 117], [], [881, 117], [881, 117], [], [], [881, 117], [881, 117], [881, 117], [], [], [], [], [], [], [], [], [881, 117], [], [], [881, 117], [881, 117], [881, 117], [881, 117], [881, 117], [881, 117], [881, 117], [881, 117], [881, 117], [], []]