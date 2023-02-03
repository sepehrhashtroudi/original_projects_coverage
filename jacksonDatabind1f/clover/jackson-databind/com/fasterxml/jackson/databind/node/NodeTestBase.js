var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":39654,"methods":[{"el":18,"sc":5,"sl":9},{"el":28,"sc":5,"sl":20}],"name":"NodeTestBase","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1002":{"methods":[{"sl":20}],"name":"testLong","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1087":{"methods":[{"sl":20}],"name":"testBigIntegerNode","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1113":{"methods":[{"sl":20}],"name":"testLong","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1172":{"methods":[{"sl":9},{"sl":20}],"name":"testPOJO","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_118":{"methods":[{"sl":9}],"name":"testBinary","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_1293":{"methods":[{"sl":20}],"name":"testDouble","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1476":{"methods":[{"sl":9},{"sl":20}],"name":"testText","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1499":{"methods":[{"sl":9}],"name":"testMissing","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_1640":{"methods":[{"sl":20}],"name":"testBoolean","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1658":{"methods":[{"sl":20}],"name":"testInt","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1726":{"methods":[{"sl":20}],"name":"testFloat","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1783":{"methods":[{"sl":20}],"name":"testShort","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_1834":{"methods":[{"sl":9}],"name":"testBasicsWithNullNode","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_1854":{"methods":[{"sl":20}],"name":"testDouble","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_2110":{"methods":[{"sl":20}],"name":"testDecimalNode","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_252":{"methods":[{"sl":20}],"name":"testFloat","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_414":{"methods":[{"sl":9},{"sl":20}],"name":"testPOJO","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_435":{"methods":[{"sl":9},{"sl":20}],"name":"testText","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_593":{"methods":[{"sl":9}],"name":"testBinary","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_640":{"methods":[{"sl":9}],"name":"testBasicsWithNullNode","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_667":{"methods":[{"sl":20}],"name":"testBoolean","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_704":{"methods":[{"sl":20}],"name":"testShort","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_723":{"methods":[{"sl":20}],"name":"testDecimalNode","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_73":{"methods":[{"sl":20}],"name":"testInt","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_796":{"methods":[{"sl":20}],"name":"testBigIntegerNode","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_958":{"methods":[{"sl":9}],"name":"testMissing","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [435, 640, 593, 1172, 118, 1499, 958, 1476, 1834, 414], [], [], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [435, 1113, 1726, 796, 1172, 1783, 1640, 1002, 1658, 667, 1087, 1854, 252, 723, 1293, 1476, 414, 2110, 73, 704], [], [], []]