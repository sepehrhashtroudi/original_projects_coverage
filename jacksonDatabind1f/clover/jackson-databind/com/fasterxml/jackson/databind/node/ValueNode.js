var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":141,"id":29489,"methods":[{"el":20,"sc":5,"sl":20},{"el":28,"sc":5,"sl":26},{"el":40,"sc":5,"sl":32},{"el":49,"sc":5,"sl":48},{"el":61,"sc":5,"sl":57},{"el":67,"sc":5,"sl":63},{"el":73,"sc":5,"sl":69},{"el":79,"sc":5,"sl":75},{"el":85,"sc":5,"sl":81},{"el":91,"sc":5,"sl":87},{"el":97,"sc":5,"sl":93},{"el":103,"sc":5,"sl":99},{"el":115,"sc":5,"sl":111},{"el":122,"sc":5,"sl":118},{"el":128,"sc":5,"sl":124},{"el":134,"sc":5,"sl":130},{"el":140,"sc":5,"sl":136}],"name":"ValueNode","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":20}],"name":"testMultiple","pass":true,"statements":[]},"test_1002":{"methods":[{"sl":20}],"name":"testLong","pass":true,"statements":[]},"test_1006":{"methods":[{"sl":20}],"name":"testBasics","pass":true,"statements":[]},"test_1013":{"methods":[{"sl":20}],"name":"testObjectSerializeWithLong","pass":true,"statements":[]},"test_1019":{"methods":[{"sl":20}],"name":"testReadFromString","pass":true,"statements":[]},"test_1037":{"methods":[{"sl":20}],"name":"testArray","pass":true,"statements":[]},"test_1038":{"methods":[{"sl":20}],"name":"testEmbeddedObjectInObject","pass":true,"statements":[]},"test_1048":{"methods":[{"sl":20}],"name":"testNullChecking2","pass":true,"statements":[]},"test_1065":{"methods":[{"sl":20}],"name":"testEmbeddedObjectInArray","pass":true,"statements":[]},"test_1087":{"methods":[{"sl":20}],"name":"testBigIntegerNode","pass":true,"statements":[]},"test_1113":{"methods":[{"sl":20}],"name":"testLong","pass":true,"statements":[]},"test_1121":{"methods":[{"sl":20},{"sl":48}],"name":"testGeneratingJsonSchema","pass":true,"statements":[{"sl":49}]},"test_1140":{"methods":[{"sl":20},{"sl":48}],"name":"testFromMap","pass":true,"statements":[{"sl":49}]},"test_1159":{"methods":[{"sl":20}],"name":"testEmbeddedObject","pass":true,"statements":[]},"test_1170":{"methods":[{"sl":20}],"name":"testRetain","pass":true,"statements":[]},"test_1172":{"methods":[{"sl":20}],"name":"testPOJO","pass":true,"statements":[]},"test_118":{"methods":[{"sl":20}],"name":"testBinary","pass":true,"statements":[]},"test_1186":{"methods":[{"sl":57},{"sl":63},{"sl":81},{"sl":87}],"name":"testMissingNode","pass":true,"statements":[{"sl":60},{"sl":66},{"sl":84},{"sl":90}]},"test_1192":{"methods":[{"sl":20}],"name":"testAsInt","pass":true,"statements":[]},"test_121":{"methods":[{"sl":20},{"sl":26}],"name":"testWithArraySimple","pass":true,"statements":[{"sl":28}]},"test_1241":{"methods":[{"sl":20}],"name":"testPOJOIntArray","pass":true,"statements":[]},"test_1250":{"methods":[{"sl":20}],"name":"testReadFromString","pass":true,"statements":[]},"test_1257":{"methods":[{"sl":20}],"name":"testReadingArrayAsTree","pass":true,"statements":[]},"test_1258":{"methods":[{"sl":20}],"name":"testThatObjectsHaveNoItems","pass":true,"statements":[]},"test_1279":{"methods":[{"sl":20}],"name":"testBinaryNode","pass":true,"statements":[]},"test_1290":{"methods":[{"sl":20}],"name":"testSimple","pass":true,"statements":[]},"test_1293":{"methods":[{"sl":20}],"name":"testDouble","pass":true,"statements":[]},"test_130":{"methods":[{"sl":20}],"name":"testRetain","pass":true,"statements":[]},"test_1317":{"methods":[{"sl":20}],"name":"testNested","pass":true,"statements":[]},"test_1340":{"methods":[{"sl":20}],"name":"testSimpleObject","pass":true,"statements":[]},"test_1342":{"methods":[{"sl":20}],"name":"testTreeToValue","pass":true,"statements":[]},"test_1343":{"methods":[{"sl":20},{"sl":48}],"name":"testFromArray","pass":true,"statements":[{"sl":49}]},"test_1369":{"methods":[{"sl":20}],"name":"testArrayNodeEquality","pass":true,"statements":[]},"test_1379":{"methods":[{"sl":20}],"name":"testInt","pass":true,"statements":[]},"test_1398":{"methods":[{"sl":20}],"name":"testThatObjectsHaveNoItems","pass":true,"statements":[]},"test_1410":{"methods":[{"sl":20}],"name":"testGeneratingJsonSchemaWithFilters","pass":true,"statements":[]},"test_1411":{"methods":[{"sl":20}],"name":"testNodeInArray","pass":true,"statements":[]},"test_1417":{"methods":[{"sl":20}],"name":"testArray","pass":true,"statements":[]},"test_1418":{"methods":[{"sl":20}],"name":"testBasics","pass":true,"statements":[]},"test_1476":{"methods":[{"sl":20}],"name":"testText","pass":true,"statements":[]},"test_1486":{"methods":[{"sl":20}],"name":"testBoolean","pass":true,"statements":[]},"test_1491":{"methods":[{"sl":20}],"name":"testGeneratingJsonSchemaWithFilters","pass":true,"statements":[]},"test_1492":{"methods":[{"sl":20}],"name":"testLong","pass":true,"statements":[]},"test_1499":{"methods":[{"sl":20}],"name":"testMissing","pass":true,"statements":[]},"test_1502":{"methods":[{"sl":20}],"name":"testPOJOString","pass":true,"statements":[]},"test_1548":{"methods":[{"sl":20}],"name":"testSimpleArray","pass":true,"statements":[]},"test_1560":{"methods":[{"sl":20},{"sl":48}],"name":"testSmallNumbers","pass":true,"statements":[{"sl":49}]},"test_1568":{"methods":[{"sl":20}],"name":"testSimpleObject","pass":true,"statements":[]},"test_1573":{"methods":[{"sl":20}],"name":"testArrayNodeEquality","pass":true,"statements":[]},"test_1574":{"methods":[{"sl":20}],"name":"testRemove","pass":true,"statements":[]},"test_1599":{"methods":[{"sl":26}],"name":"testWithObjectSimple","pass":true,"statements":[{"sl":28}]},"test_1626":{"methods":[{"sl":20}],"name":"testSimpleArray","pass":true,"statements":[]},"test_1640":{"methods":[{"sl":20}],"name":"testBoolean","pass":true,"statements":[]},"test_1658":{"methods":[{"sl":20}],"name":"testInt","pass":true,"statements":[]},"test_1679":{"methods":[{"sl":20},{"sl":48}],"name":"testSmallNumbers","pass":true,"statements":[{"sl":49}]},"test_1691":{"methods":[{"sl":20}],"name":"testInvalidWithArray","pass":true,"statements":[]},"test_1713":{"methods":[{"sl":20}],"name":"testBase64Text","pass":true,"statements":[]},"test_1715":{"methods":[{"sl":20}],"name":"testRemove","pass":true,"statements":[]},"test_1726":{"methods":[{"sl":20}],"name":"testFloat","pass":true,"statements":[]},"test_1728":{"methods":[{"sl":20}],"name":"testIssue709","pass":true,"statements":[]},"test_1744":{"methods":[{"sl":20}],"name":"testDouble","pass":true,"statements":[]},"test_1757":{"methods":[{"sl":57},{"sl":63},{"sl":81},{"sl":87}],"name":"testMissingNode","pass":true,"statements":[{"sl":60},{"sl":66},{"sl":84},{"sl":90}]},"test_177":{"methods":[{"sl":20},{"sl":124},{"sl":130},{"sl":136}],"name":"testMatchingMultiple","pass":true,"statements":[{"sl":127},{"sl":133},{"sl":139}]},"test_1783":{"methods":[{"sl":20}],"name":"testShort","pass":true,"statements":[]},"test_1792":{"methods":[{"sl":20}],"name":"testPOJOBean","pass":true,"statements":[]},"test_1796":{"methods":[{"sl":20},{"sl":26}],"name":"testWithArraySimple","pass":true,"statements":[{"sl":28}]},"test_1826":{"methods":[{"sl":20}],"name":"testObjectNodeEquality","pass":true,"statements":[]},"test_1829":{"methods":[{"sl":20}],"name":"testDeserializeSimple","pass":true,"statements":[]},"test_1834":{"methods":[{"sl":20},{"sl":69},{"sl":87},{"sl":93}],"name":"testBasicsWithNullNode","pass":true,"statements":[{"sl":72},{"sl":90},{"sl":96}]},"test_1836":{"methods":[{"sl":20}],"name":"testBasics","pass":true,"statements":[]},"test_1840":{"methods":[{"sl":20}],"name":"testEmbeddedObjectInArray","pass":true,"statements":[]},"test_1846":{"methods":[{"sl":20}],"name":"testSchemaSerialization","pass":true,"statements":[]},"test_1852":{"methods":[{"sl":20}],"name":"testAsBoolean","pass":true,"statements":[]},"test_1854":{"methods":[{"sl":20}],"name":"testDouble","pass":true,"statements":[]},"test_1871":{"methods":[{"sl":20}],"name":"testMixed","pass":true,"statements":[]},"test_1872":{"methods":[{"sl":20}],"name":"testSimplePath","pass":true,"statements":[]},"test_1881":{"methods":[{"sl":20}],"name":"testNullChecking2","pass":true,"statements":[]},"test_1882":{"methods":[{"sl":20}],"name":"testArray","pass":true,"statements":[]},"test_1896":{"methods":[{"sl":20}],"name":"testNull","pass":true,"statements":[]},"test_1911":{"methods":[{"sl":20}],"name":"testDecimalNode","pass":true,"statements":[]},"test_1933":{"methods":[{"sl":20}],"name":"testNull","pass":true,"statements":[]},"test_1937":{"methods":[{"sl":20}],"name":"testDelegating","pass":true,"statements":[]},"test_1941":{"methods":[{"sl":20}],"name":"testPOJOIntArray","pass":true,"statements":[]},"test_1958":{"methods":[{"sl":20}],"name":"testSimple","pass":true,"statements":[]},"test_1965":{"methods":[{"sl":20}],"name":"testTextAsBinary","pass":true,"statements":[]},"test_197":{"methods":[{"sl":20},{"sl":48}],"name":"testGeneratingJsonSchema","pass":true,"statements":[{"sl":49}]},"test_1971":{"methods":[{"sl":20}],"name":"testNested","pass":true,"statements":[]},"test_1973":{"methods":[{"sl":20}],"name":"testBinaryNode","pass":true,"statements":[]},"test_1976":{"methods":[{"sl":20}],"name":"testEmbeddedObjectInObject","pass":true,"statements":[]},"test_1977":{"methods":[{"sl":20}],"name":"testSkipChildrenWrt370","pass":true,"statements":[]},"test_2014":{"methods":[{"sl":20},{"sl":111},{"sl":118}],"name":"testMatchingSingle","pass":true,"statements":[{"sl":114},{"sl":121}]},"test_2018":{"methods":[{"sl":20}],"name":"testObjectSerializeWithLong","pass":true,"statements":[]},"test_207":{"methods":[{"sl":20}],"name":"testNodeInArray","pass":true,"statements":[]},"test_2075":{"methods":[{"sl":20}],"name":"testMultiple","pass":true,"statements":[]},"test_2099":{"methods":[{"sl":20}],"name":"testSchemaSerialization","pass":true,"statements":[]},"test_2108":{"methods":[{"sl":20}],"name":"testAdds","pass":true,"statements":[]},"test_211":{"methods":[{"sl":20}],"name":"testDecimalNode","pass":true,"statements":[]},"test_2110":{"methods":[{"sl":20}],"name":"testDecimalNode","pass":true,"statements":[]},"test_252":{"methods":[{"sl":20}],"name":"testFloat","pass":true,"statements":[]},"test_28":{"methods":[{"sl":20}],"name":"testObjectNodeEquality","pass":true,"statements":[]},"test_282":{"methods":[{"sl":20}],"name":"testEmbeddedObject","pass":true,"statements":[]},"test_30":{"methods":[{"sl":20}],"name":"testPOJOString","pass":true,"statements":[]},"test_311":{"methods":[{"sl":20}],"name":"testBase64Text","pass":true,"statements":[]},"test_317":{"methods":[{"sl":20}],"name":"testParser","pass":true,"statements":[]},"test_323":{"methods":[{"sl":20}],"name":"testAsBoolean","pass":true,"statements":[]},"test_33":{"methods":[{"sl":20},{"sl":124},{"sl":130},{"sl":136}],"name":"testMatchingMultiple","pass":true,"statements":[{"sl":127},{"sl":133},{"sl":139}]},"test_340":{"methods":[{"sl":20}],"name":"testBasics","pass":true,"statements":[]},"test_38":{"methods":[{"sl":20}],"name":"testEOF","pass":true,"statements":[]},"test_386":{"methods":[{"sl":20}],"name":"testSkipChildrenWrt370","pass":true,"statements":[]},"test_408":{"methods":[{"sl":20}],"name":"testBinaryPojo","pass":true,"statements":[]},"test_412":{"methods":[{"sl":20}],"name":"testBinaryPojo","pass":true,"statements":[]},"test_414":{"methods":[{"sl":20}],"name":"testPOJO","pass":true,"statements":[]},"test_435":{"methods":[{"sl":20}],"name":"testText","pass":true,"statements":[]},"test_438":{"methods":[{"sl":20}],"name":"testSimpleViaObjectMapper","pass":true,"statements":[]},"test_444":{"methods":[{"sl":20}],"name":"testBinary","pass":true,"statements":[]},"test_461":{"methods":[{"sl":20}],"name":"testSpecDoc","pass":true,"statements":[]},"test_462":{"methods":[{"sl":20}],"name":"testInvalidWithArray","pass":true,"statements":[]},"test_463":{"methods":[{"sl":20}],"name":"testSimple","pass":true,"statements":[]},"test_473":{"methods":[{"sl":20}],"name":"testReadingArrayAsTree","pass":true,"statements":[]},"test_484":{"methods":[{"sl":20}],"name":"testIssue709","pass":true,"statements":[]},"test_489":{"methods":[{"sl":20}],"name":"testParser","pass":true,"statements":[]},"test_506":{"methods":[{"sl":20}],"name":"testInt","pass":true,"statements":[]},"test_526":{"methods":[{"sl":20}],"name":"testSchemaId","pass":true,"statements":[]},"test_541":{"methods":[{"sl":20},{"sl":48}],"name":"testFromArray","pass":true,"statements":[{"sl":49}]},"test_542":{"methods":[{"sl":20}],"name":"testNullChecking2","pass":true,"statements":[]},"test_548":{"methods":[{"sl":20},{"sl":26}],"name":"testWithNested","pass":true,"statements":[{"sl":28}]},"test_567":{"methods":[{"sl":20}],"name":"testDeserializeSimple","pass":true,"statements":[]},"test_57":{"methods":[{"sl":20}],"name":"testInvalidWith","pass":true,"statements":[]},"test_582":{"methods":[{"sl":20}],"name":"testNullChecking","pass":true,"statements":[]},"test_59":{"methods":[{"sl":20},{"sl":26}],"name":"testWithNested","pass":true,"statements":[{"sl":28}]},"test_593":{"methods":[{"sl":20}],"name":"testBinary","pass":true,"statements":[]},"test_595":{"methods":[{"sl":20}],"name":"testTreeToValue","pass":true,"statements":[]},"test_609":{"methods":[{"sl":20}],"name":"testDataBind","pass":true,"statements":[]},"test_610":{"methods":[{"sl":20}],"name":"testSimple","pass":true,"statements":[]},"test_613":{"methods":[{"sl":20}],"name":"testSpecDoc","pass":true,"statements":[]},"test_616":{"methods":[{"sl":20}],"name":"testLong","pass":true,"statements":[]},"test_618":{"methods":[{"sl":20}],"name":"testPOJOBean","pass":true,"statements":[]},"test_640":{"methods":[{"sl":20},{"sl":69},{"sl":87},{"sl":93}],"name":"testBasicsWithNullNode","pass":true,"statements":[{"sl":72},{"sl":90},{"sl":96}]},"test_66":{"methods":[{"sl":20}],"name":"testAdds","pass":true,"statements":[]},"test_667":{"methods":[{"sl":20}],"name":"testBoolean","pass":true,"statements":[]},"test_684":{"methods":[{"sl":20},{"sl":111},{"sl":118}],"name":"testMatchingSingle","pass":true,"statements":[{"sl":114},{"sl":121}]},"test_686":{"methods":[{"sl":20}],"name":"testDataBind","pass":true,"statements":[]},"test_687":{"methods":[{"sl":20}],"name":"testDouble","pass":true,"statements":[]},"test_691":{"methods":[{"sl":26}],"name":"testWithObjectSimple","pass":true,"statements":[{"sl":28}]},"test_697":{"methods":[{"sl":20},{"sl":48}],"name":"testFromMap","pass":true,"statements":[{"sl":49}]},"test_704":{"methods":[{"sl":20}],"name":"testShort","pass":true,"statements":[]},"test_717":{"methods":[{"sl":20}],"name":"testMixed","pass":true,"statements":[]},"test_723":{"methods":[{"sl":20}],"name":"testDecimalNode","pass":true,"statements":[]},"test_73":{"methods":[{"sl":20}],"name":"testInt","pass":true,"statements":[]},"test_732":{"methods":[{"sl":20}],"name":"testSimpleViaObjectMapper","pass":true,"statements":[]},"test_76":{"methods":[{"sl":20}],"name":"testNullChecking2","pass":true,"statements":[]},"test_782":{"methods":[{"sl":20}],"name":"testBinary","pass":true,"statements":[]},"test_796":{"methods":[{"sl":20}],"name":"testBigIntegerNode","pass":true,"statements":[]},"test_834":{"methods":[{"sl":20}],"name":"testArray","pass":true,"statements":[]},"test_860":{"methods":[{"sl":20},{"sl":111},{"sl":118},{"sl":124},{"sl":136}],"name":"testNonMatching","pass":true,"statements":[{"sl":114},{"sl":121},{"sl":127},{"sl":139}]},"test_863":{"methods":[{"sl":20}],"name":"testEOF","pass":true,"statements":[]},"test_864":{"methods":[{"sl":20}],"name":"testDelegating","pass":true,"statements":[]},"test_878":{"methods":[{"sl":20}],"name":"testTextAsBinary","pass":true,"statements":[]},"test_905":{"methods":[{"sl":20}],"name":"testAsInt","pass":true,"statements":[]},"test_924":{"methods":[{"sl":20}],"name":"testNullChecking","pass":true,"statements":[]},"test_929":{"methods":[{"sl":20}],"name":"testInvalidWith","pass":true,"statements":[]},"test_936":{"methods":[{"sl":20}],"name":"testSchemaId","pass":true,"statements":[]},"test_958":{"methods":[{"sl":20}],"name":"testMissing","pass":true,"statements":[]},"test_982":{"methods":[{"sl":20},{"sl":111},{"sl":118},{"sl":124},{"sl":136}],"name":"testNonMatching","pass":true,"statements":[{"sl":114},{"sl":121},{"sl":127},{"sl":139}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1290, 686, 1170, 1726, 1038, 1728, 121, 1852, 567, 506, 1019, 1882, 1911, 408, 118, 2014, 489, 929, 1317, 1973, 905, 1121, 1087, 1258, 59, 1691, 1854, 723, 484, 130, 1548, 717, 1834, 1792, 1379, 1192, 1279, 878, 412, 1492, 1574, 609, 1250, 2099, 1679, 1573, 1715, 1159, 211, 864, 1744, 732, 1411, 1896, 936, 28, 438, 1826, 982, 541, 1977, 1499, 1037, 1048, 386, 252, 924, 958, 1241, 863, 1013, 311, 610, 1796, 1568, 2110, 616, 1502, 435, 1846, 640, 593, 1958, 796, 1836, 463, 1172, 1783, 323, 30, 1343, 1398, 1491, 1658, 1941, 1140, 1257, 1713, 461, 1369, 1342, 1965, 33, 1410, 76, 207, 1476, 1881, 1829, 57, 613, 1840, 66, 782, 1340, 1486, 526, 582, 1113, 340, 1871, 595, 1976, 444, 1640, 1002, 1872, 1937, 462, 860, 548, 473, 1065, 2108, 1417, 667, 1560, 697, 282, 2018, 38, 687, 834, 317, 684, 1626, 618, 1006, 177, 1933, 100, 1293, 197, 1418, 414, 2075, 73, 1971, 542, 704], [], [], [], [], [], [691, 121, 59, 1599, 1796, 548], [], [691, 121, 59, 1599, 1796, 548], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1121, 1679, 541, 1343, 1140, 1560, 697, 197], [1121, 1679, 541, 1343, 1140, 1560, 697, 197], [], [], [], [], [], [], [], [1186, 1757], [], [], [1186, 1757], [], [], [1186, 1757], [], [], [1186, 1757], [], [], [1834, 640], [], [], [1834, 640], [], [], [], [], [], [], [], [], [1186, 1757], [], [], [1186, 1757], [], [], [1834, 1186, 640, 1757], [], [], [1834, 1186, 640, 1757], [], [], [1834, 640], [], [], [1834, 640], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2014, 982, 860, 684], [], [], [2014, 982, 860, 684], [], [], [], [2014, 982, 860, 684], [], [], [2014, 982, 860, 684], [], [], [982, 33, 860, 177], [], [], [982, 33, 860, 177], [], [], [33, 177], [], [], [33, 177], [], [], [982, 33, 860, 177], [], [], [982, 33, 860, 177], [], []]