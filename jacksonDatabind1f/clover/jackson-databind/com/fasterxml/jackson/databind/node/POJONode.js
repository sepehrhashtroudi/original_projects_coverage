var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":153,"id":16665,"methods":[{"el":19,"sc":5,"sl":19},{"el":31,"sc":5,"sl":27},{"el":33,"sc":5,"sl":33},{"el":47,"sc":5,"sl":40},{"el":58,"sc":5,"sl":55},{"el":67,"sc":5,"sl":60},{"el":76,"sc":5,"sl":69},{"el":85,"sc":5,"sl":78},{"el":94,"sc":5,"sl":87},{"el":111,"sc":5,"sl":102},{"el":122,"sc":5,"sl":122},{"el":143,"sc":5,"sl":130},{"el":146,"sc":5,"sl":145},{"el":152,"sc":5,"sl":148}],"name":"POJONode","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1006":{"methods":[{"sl":19},{"sl":102}],"name":"testBasics","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_1038":{"methods":[{"sl":19},{"sl":27},{"sl":122}],"name":"testEmbeddedObjectInObject","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":122}]},"test_1065":{"methods":[{"sl":19},{"sl":27},{"sl":122}],"name":"testEmbeddedObjectInArray","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":122}]},"test_1172":{"methods":[{"sl":19},{"sl":27},{"sl":55},{"sl":69},{"sl":78},{"sl":87},{"sl":130},{"sl":145},{"sl":148}],"name":"testPOJO","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":57},{"sl":72},{"sl":73},{"sl":75},{"sl":81},{"sl":82},{"sl":84},{"sl":90},{"sl":91},{"sl":93},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":142},{"sl":146},{"sl":151}]},"test_1241":{"methods":[{"sl":19},{"sl":102}],"name":"testPOJOIntArray","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_1502":{"methods":[{"sl":19},{"sl":102}],"name":"testPOJOString","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_1792":{"methods":[{"sl":19},{"sl":102}],"name":"testPOJOBean","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_1840":{"methods":[{"sl":19},{"sl":27},{"sl":122}],"name":"testEmbeddedObjectInArray","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":122}]},"test_1852":{"methods":[{"sl":19},{"sl":60}],"name":"testAsBoolean","pass":true,"statements":[{"sl":19},{"sl":63},{"sl":64}]},"test_1941":{"methods":[{"sl":19},{"sl":102}],"name":"testPOJOIntArray","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_1976":{"methods":[{"sl":19},{"sl":27},{"sl":122}],"name":"testEmbeddedObjectInObject","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":122}]},"test_2108":{"methods":[{"sl":19}],"name":"testAdds","pass":true,"statements":[{"sl":19}]},"test_30":{"methods":[{"sl":19},{"sl":102}],"name":"testPOJOString","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_323":{"methods":[{"sl":19},{"sl":60}],"name":"testAsBoolean","pass":true,"statements":[{"sl":19},{"sl":63},{"sl":64}]},"test_340":{"methods":[{"sl":19},{"sl":102}],"name":"testBasics","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_408":{"methods":[{"sl":19},{"sl":27},{"sl":33},{"sl":40},{"sl":122}],"name":"testBinaryPojo","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":33},{"sl":43},{"sl":44},{"sl":122}]},"test_412":{"methods":[{"sl":19},{"sl":27},{"sl":33},{"sl":40},{"sl":122}],"name":"testBinaryPojo","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":33},{"sl":43},{"sl":44},{"sl":122}]},"test_414":{"methods":[{"sl":19},{"sl":27},{"sl":55},{"sl":69},{"sl":78},{"sl":87},{"sl":130},{"sl":145},{"sl":148}],"name":"testPOJO","pass":true,"statements":[{"sl":19},{"sl":30},{"sl":57},{"sl":72},{"sl":73},{"sl":75},{"sl":81},{"sl":82},{"sl":84},{"sl":90},{"sl":91},{"sl":93},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":138},{"sl":139},{"sl":140},{"sl":142},{"sl":146},{"sl":151}]},"test_618":{"methods":[{"sl":19},{"sl":102}],"name":"testPOJOBean","pass":true,"statements":[{"sl":19},{"sl":106},{"sl":109}]},"test_66":{"methods":[{"sl":19}],"name":"testAdds","pass":true,"statements":[{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1502, 1038, 1852, 1172, 323, 30, 1941, 408, 1792, 1840, 66, 412, 340, 1976, 1065, 2108, 618, 1006, 1241, 414], [], [], [], [], [], [], [], [1038, 1172, 408, 1840, 412, 1976, 1065, 414], [], [], [1038, 1172, 408, 1840, 412, 1976, 1065, 414], [], [], [408, 412], [], [], [], [], [], [], [408, 412], [], [], [408, 412], [408, 412], [], [], [], [], [], [], [], [], [], [], [1172, 414], [], [1172, 414], [], [], [1852, 323], [], [], [1852, 323], [1852, 323], [], [], [], [], [1172, 414], [], [], [1172, 414], [1172, 414], [], [1172, 414], [], [], [1172, 414], [], [], [1172, 414], [1172, 414], [], [1172, 414], [], [], [1172, 414], [], [], [1172, 414], [1172, 414], [], [1172, 414], [], [], [], [], [], [], [], [], [1502, 30, 1941, 1792, 340, 618, 1006, 1241], [], [], [], [1502, 30, 1941, 1792, 340, 618, 1006, 1241], [], [], [1502, 30, 1941, 1792, 340, 618, 1006, 1241], [], [], [], [], [], [], [], [], [], [], [], [], [1038, 408, 1840, 412, 1976, 1065], [], [], [], [], [], [], [], [1172, 414], [], [], [1172, 414], [1172, 414], [1172, 414], [1172, 414], [], [1172, 414], [1172, 414], [1172, 414], [], [1172, 414], [], [], [1172, 414], [1172, 414], [], [1172, 414], [], [], [1172, 414], [], []]