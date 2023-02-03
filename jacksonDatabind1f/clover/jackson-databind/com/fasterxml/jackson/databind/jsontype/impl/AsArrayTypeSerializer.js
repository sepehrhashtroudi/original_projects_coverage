var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":176,"id":13227,"methods":[{"el":23,"sc":5,"sl":20},{"el":29,"sc":5,"sl":25},{"el":32,"sc":5,"sl":31},{"el":47,"sc":5,"sl":40},{"el":57,"sc":5,"sl":49},{"el":66,"sc":5,"sl":59},{"el":76,"sc":5,"sl":68},{"el":85,"sc":5,"sl":78},{"el":95,"sc":5,"sl":87},{"el":109,"sc":5,"sl":103},{"el":118,"sc":5,"sl":111},{"el":126,"sc":5,"sl":120},{"el":140,"sc":5,"sl":134},{"el":149,"sc":5,"sl":142},{"el":157,"sc":5,"sl":151},{"el":163,"sc":5,"sl":159},{"el":169,"sc":5,"sl":165},{"el":175,"sc":5,"sl":171}],"name":"AsArrayTypeSerializer","sl":17}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1021":{"methods":[{"sl":20}],"name":"testTypeIdFromProperty","pass":true,"statements":[{"sl":22}]},"test_1047":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testTypeIdResolver","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1057":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testStringListAsProp","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1069":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSharedTypeInfo","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1090":{"methods":[{"sl":20}],"name":"testEmptyCollection","pass":true,"statements":[{"sl":22}]},"test_1106":{"methods":[{"sl":20}],"name":"testPolymorphicSerdeWithDelegate","pass":true,"statements":[{"sl":22}]},"test_1108":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSimpleMapMethod","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1109":{"methods":[{"sl":20}],"name":"testSubtypesViaModule","pass":true,"statements":[{"sl":22}]},"test_1110":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSimpleEnumBean","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1138":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testDateScalars","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_1145":{"methods":[{"sl":20}],"name":"testTypedMaps","pass":true,"statements":[{"sl":22}]},"test_1154":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testWithCreators","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1155":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testEnumPolymorphicSerializationTest","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1162":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testEnumInterface","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_117":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testArraysOfArrays","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1175":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testArrayTypingNested","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_119":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testEnumInterfaceList","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_12":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testEnumInterface","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1215":{"methods":[{"sl":20}],"name":"testListWithPolymorphic","pass":true,"statements":[{"sl":22}]},"test_1216":{"methods":[{"sl":20}],"name":"testJackson430","pass":true,"statements":[{"sl":22}]},"test_1217":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleListField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1221":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":78},{"sl":87},{"sl":111},{"sl":120}],"name":"testDateTypes","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":83},{"sl":84},{"sl":93},{"sl":94},{"sl":116},{"sl":117},{"sl":125}]},"test_1226":{"methods":[{"sl":20}],"name":"testFeature432","pass":true,"statements":[{"sl":22}]},"test_1237":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1260":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testNonFinalBean","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1268":{"methods":[{"sl":20}],"name":"testWrapperWithExplicitType","pass":true,"statements":[{"sl":22}]},"test_1280":{"methods":[{"sl":20}],"name":"testTypeIdFromProperty","pass":true,"statements":[{"sl":22}]},"test_1292":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testVisibleWithWrapperArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1298":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testIssue506WithNumber","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1310":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testTypeIdResolver","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1328":{"methods":[{"sl":20}],"name":"testPropertyWithSubtypes","pass":true,"statements":[{"sl":22}]},"test_1344":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleArrayMethod","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1347":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleArrayMethod","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1350":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":78},{"sl":87},{"sl":111},{"sl":120}],"name":"testDateTypes","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":83},{"sl":84},{"sl":93},{"sl":94},{"sl":116},{"sl":117},{"sl":125}]},"test_1355":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testIssue877","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1366":{"methods":[{"sl":20},{"sl":25},{"sl":103},{"sl":134},{"sl":159}],"name":"testTypeIdFromArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":107},{"sl":108},{"sl":137},{"sl":138},{"sl":139},{"sl":162}]},"test_1384":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testWithCreators","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1411":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testNodeInArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1421":{"methods":[{"sl":20}],"name":"testTypedMaps","pass":true,"statements":[{"sl":22}]},"test_1464":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testArrayTypingSimple","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1465":{"methods":[{"sl":20}],"name":"testEmptyCollection","pass":true,"statements":[{"sl":22}]},"test_1479":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testUntypedEnum","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1506":{"methods":[{"sl":20}],"name":"testAbstract368","pass":true,"statements":[{"sl":22}]},"test_1525":{"methods":[{"sl":20}],"name":"testAbstract368","pass":true,"statements":[{"sl":22}]},"test_1567":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testScalarArrays","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_157":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testNumericScalars","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_1612":{"methods":[{"sl":20}],"name":"testWrapperWithGetter","pass":true,"statements":[{"sl":22}]},"test_1620":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testAbstractBean","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1650":{"methods":[{"sl":20}],"name":"testSubTypesFor356","pass":true,"statements":[{"sl":22}]},"test_1668":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testScalarsWithTyping","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1671":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSimpleEnumsAsField","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1673":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testArrayTypingNested","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1678":{"methods":[{"sl":20}],"name":"testWrapperWithField","pass":true,"statements":[{"sl":22}]},"test_169":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSharedTypeInfoWithCtor","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1706":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testJackson667","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1735":{"methods":[{"sl":20}],"name":"testImproperExternalIdSerialization","pass":true,"statements":[{"sl":22}]},"test_1737":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testScalarArrays","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_1762":{"methods":[{"sl":20}],"name":"testIssue352","pass":true,"statements":[{"sl":22}]},"test_1770":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSharedTypeInfo","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1775":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleMapField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1776":{"methods":[{"sl":20}],"name":"testSerialization","pass":true,"statements":[{"sl":22}]},"test_1781":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testInnerClassWithType","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1788":{"methods":[{"sl":20}],"name":"testIssue329","pass":true,"statements":[{"sl":22}]},"test_1809":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testNonFinalBean","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1825":{"methods":[{"sl":20}],"name":"testPropertyWithSubtypes","pass":true,"statements":[{"sl":22}]},"test_1847":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testIntList","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1851":{"methods":[{"sl":20}],"name":"testJackson398","pass":true,"statements":[{"sl":22}]},"test_1866":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testTypeAsArray","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1870":{"methods":[{"sl":20}],"name":"testIssue265","pass":true,"statements":[{"sl":22}]},"test_1883":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testJackson428","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_1894":{"methods":[{"sl":20}],"name":"testWrapperWithGetter","pass":true,"statements":[{"sl":22}]},"test_1902":{"methods":[{"sl":20}],"name":"testIssue265","pass":true,"statements":[{"sl":22}]},"test_1903":{"methods":[{"sl":20}],"name":"testPolymorphicRoundtrip","pass":true,"statements":[{"sl":22}]},"test_1929":{"methods":[{"sl":20}],"name":"testNullValue","pass":true,"statements":[{"sl":22}]},"test_1945":{"methods":[{"sl":20}],"name":"testPolymorphicRoundtrip","pass":true,"statements":[{"sl":22}]},"test_1950":{"methods":[{"sl":20}],"name":"testInArray","pass":true,"statements":[{"sl":22}]},"test_1956":{"methods":[{"sl":20}],"name":"testIssue329","pass":true,"statements":[{"sl":22}]},"test_1962":{"methods":[{"sl":20}],"name":"testPolymorphicSerdeWithDelegate","pass":true,"statements":[{"sl":22}]},"test_1990":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testIssue506WithDate","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_1993":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleMethod","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_1996":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testTokenBuffer","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_2006":{"methods":[{"sl":20}],"name":"testJackson430","pass":true,"statements":[{"sl":22}]},"test_2026":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testStringListAsProp","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_2036":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testIssue811","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_2039":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testJackson311","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_2042":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testJackson628","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_2050":{"methods":[{"sl":20}],"name":"testFeature432","pass":true,"statements":[{"sl":22}]},"test_2054":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testIssue811","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_2062":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_207":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testNodeInArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_2088":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testTagList","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_210":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testIntList","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_2116":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleListField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_2135":{"methods":[{"sl":20},{"sl":40},{"sl":78},{"sl":103},{"sl":120}],"name":"testSimpleListMethod","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":83},{"sl":84},{"sl":107},{"sl":108},{"sl":125}]},"test_2139":{"methods":[{"sl":20}],"name":"testSerialization","pass":true,"statements":[{"sl":22}]},"test_2149":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testIssue506WithDate","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_2158":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testJackson387","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_2165":{"methods":[{"sl":20}],"name":"testIssue352","pass":true,"statements":[{"sl":22}]},"test_2168":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testUntypedEnum","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_2170":{"methods":[{"sl":20}],"name":"testSubtypesViaModule","pass":true,"statements":[{"sl":22}]},"test_218":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testEnumPolymorphicSerializationTest","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_2182":{"methods":[{"sl":20},{"sl":40},{"sl":78},{"sl":103},{"sl":120}],"name":"testSimpleArrayField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":83},{"sl":84},{"sl":107},{"sl":108},{"sl":125}]},"test_2187":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testEnumInterfaceList","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_230":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testJackson428","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_251":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testEmptyBean","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_253":{"methods":[{"sl":20}],"name":"testImproperExternalIdSerialization","pass":true,"statements":[{"sl":22}]},"test_254":{"methods":[{"sl":20}],"name":"testJackson398","pass":true,"statements":[{"sl":22}]},"test_270":{"methods":[{"sl":20}],"name":"testIssue508","pass":true,"statements":[{"sl":22}]},"test_273":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testIssue877","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_275":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSimpleEnumsAsField","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_322":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":78},{"sl":111},{"sl":120}],"name":"testListOfNumbers","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":83},{"sl":84},{"sl":116},{"sl":117},{"sl":125}]},"test_336":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testAbstractBean","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_346":{"methods":[{"sl":20}],"name":"testEmptyBean","pass":true,"statements":[{"sl":22}]},"test_371":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testIssue506WithNumber","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_382":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":78},{"sl":111},{"sl":120}],"name":"testListOfNumbers","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":83},{"sl":84},{"sl":116},{"sl":117},{"sl":125}]},"test_391":{"methods":[{"sl":20},{"sl":25}],"name":"testMiscScalars","pass":true,"statements":[{"sl":22},{"sl":27}]},"test_392":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testScalarsWithTyping","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_405":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testEnumMap","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_42":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testListOfLongs","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_446":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testVisibleWithWrapperArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_459":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testInnerClassWithType","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_468":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testEnumSet","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_477":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testSimpleEnumsInObjectArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_487":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testScalarsViaAbstractType","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_490":{"methods":[{"sl":20}],"name":"testSimpleClassAsProperty","pass":true,"statements":[{"sl":22}]},"test_495":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSharedTypeInfoWithCtor","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_504":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSimpleEnumBean","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_520":{"methods":[{"sl":20}],"name":"testVisibleWithProperty","pass":true,"statements":[{"sl":22}]},"test_528":{"methods":[{"sl":20}],"name":"testVisibleWithProperty","pass":true,"statements":[{"sl":22}]},"test_536":{"methods":[{"sl":20}],"name":"testEmptyBean","pass":true,"statements":[{"sl":22}]},"test_543":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testArrayTypingSimple","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":28},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_546":{"methods":[{"sl":20}],"name":"testListWithPolymorphic","pass":true,"statements":[{"sl":22}]},"test_55":{"methods":[{"sl":20}],"name":"testInArray","pass":true,"statements":[{"sl":22}]},"test_556":{"methods":[{"sl":20}],"name":"testIssue508","pass":true,"statements":[{"sl":22}]},"test_562":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testListOfLongs","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_581":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testSimpleEnumsInObjectArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_591":{"methods":[{"sl":20}],"name":"testNullValue","pass":true,"statements":[{"sl":22}]},"test_592":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testNumericScalars","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_602":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testEnumSet","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_623":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testDateScalars","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_68":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testJackson667","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_680":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testEnumAsObject","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_7":{"methods":[{"sl":20},{"sl":25}],"name":"testMiscScalars","pass":true,"statements":[{"sl":22},{"sl":27}]},"test_706":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testTypeAsArray","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_724":{"methods":[{"sl":20},{"sl":25},{"sl":103},{"sl":134},{"sl":159}],"name":"testTypeIdFromArray","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":107},{"sl":108},{"sl":137},{"sl":138},{"sl":139},{"sl":162}]},"test_766":{"methods":[{"sl":20}],"name":"testSubTypesFor356","pass":true,"statements":[{"sl":22}]},"test_787":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testTagList","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_810":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testScalarsViaAbstractType","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_825":{"methods":[{"sl":20}],"name":"testWrapperWithExplicitType","pass":true,"statements":[{"sl":22}]},"test_827":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testEmptyBean","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_854":{"methods":[{"sl":20}],"name":"testSimpleClassAsProperty","pass":true,"statements":[{"sl":22}]},"test_859":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testTokenBuffer","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_876":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleMethod","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_881":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testArraysOfArrays","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_884":{"methods":[{"sl":20}],"name":"testWrapperWithField","pass":true,"statements":[{"sl":22}]},"test_890":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testBeanAsObject","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_902":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testEnumMap","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_907":{"methods":[{"sl":20},{"sl":59},{"sl":111}],"name":"testJackson387","pass":true,"statements":[{"sl":22},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_930":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testBeanAsObject","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_935":{"methods":[{"sl":20},{"sl":25},{"sl":59},{"sl":111}],"name":"testJackson628","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":63},{"sl":64},{"sl":65},{"sl":116},{"sl":117}]},"test_947":{"methods":[{"sl":20},{"sl":25},{"sl":40},{"sl":103}],"name":"testJackson311","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]},"test_950":{"methods":[{"sl":20}],"name":"test417","pass":true,"statements":[{"sl":22}]},"test_959":{"methods":[{"sl":20},{"sl":78},{"sl":120}],"name":"testSimpleMapMethod","pass":true,"statements":[{"sl":22},{"sl":83},{"sl":84},{"sl":125}]},"test_965":{"methods":[{"sl":20},{"sl":25},{"sl":78},{"sl":120}],"name":"testEnumAsObject","pass":true,"statements":[{"sl":22},{"sl":27},{"sl":83},{"sl":84},{"sl":125}]},"test_966":{"methods":[{"sl":20},{"sl":40},{"sl":78},{"sl":103},{"sl":120}],"name":"testSimpleArrayField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":83},{"sl":84},{"sl":107},{"sl":108},{"sl":125}]},"test_969":{"methods":[{"sl":20}],"name":"test417","pass":true,"statements":[{"sl":22}]},"test_977":{"methods":[{"sl":20},{"sl":40},{"sl":78},{"sl":103},{"sl":120}],"name":"testSimpleListMethod","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":83},{"sl":84},{"sl":107},{"sl":108},{"sl":125}]},"test_98":{"methods":[{"sl":20},{"sl":40},{"sl":103}],"name":"testSimpleMapField","pass":true,"statements":[{"sl":22},{"sl":44},{"sl":45},{"sl":46},{"sl":107},{"sl":108}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [810, 1706, 890, 446, 1328, 1996, 2116, 495, 336, 275, 1506, 1902, 391, 1668, 1737, 459, 490, 859, 270, 1260, 1465, 854, 977, 1292, 1993, 1866, 1298, 68, 1226, 1154, 2054, 1347, 2036, 392, 1567, 1215, 724, 1929, 2026, 157, 254, 520, 1221, 1237, 371, 1762, 55, 1678, 2062, 1781, 12, 966, 1162, 1411, 1047, 468, 1106, 680, 1109, 382, 950, 623, 1069, 346, 581, 210, 1894, 592, 1870, 1268, 1735, 827, 947, 1108, 1110, 1175, 1945, 1851, 602, 42, 98, 1355, 907, 2165, 1962, 119, 556, 7, 504, 706, 218, 1903, 2088, 1883, 2042, 528, 1479, 253, 1217, 1421, 969, 405, 1384, 1650, 1956, 2168, 2187, 1350, 1310, 1620, 1612, 1809, 825, 2182, 207, 477, 169, 1057, 2158, 273, 546, 322, 881, 1525, 251, 1216, 884, 876, 2149, 2050, 959, 1671, 930, 2039, 902, 1090, 536, 1847, 787, 230, 1344, 2135, 1673, 543, 1464, 1990, 1825, 1145, 117, 2170, 562, 1021, 1280, 487, 591, 1788, 1775, 1155, 935, 1950, 1770, 965, 1366, 1776, 766, 2139, 2006, 1138], [], [810, 1706, 890, 446, 1328, 1996, 2116, 495, 336, 275, 1506, 1902, 391, 1668, 1737, 459, 490, 859, 270, 1260, 1465, 854, 977, 1292, 1993, 1866, 1298, 68, 1226, 1154, 2054, 1347, 2036, 392, 1567, 1215, 724, 1929, 2026, 157, 254, 520, 1221, 1237, 371, 1762, 55, 1678, 2062, 1781, 12, 966, 1162, 1411, 1047, 468, 1106, 680, 1109, 382, 950, 623, 1069, 346, 581, 210, 1894, 592, 1870, 1268, 1735, 827, 947, 1108, 1110, 1175, 1945, 1851, 602, 42, 98, 1355, 907, 2165, 1962, 119, 556, 7, 504, 706, 218, 1903, 2088, 1883, 2042, 528, 1479, 253, 1217, 1421, 969, 405, 1384, 1650, 1956, 2168, 2187, 1350, 1310, 1620, 1612, 1809, 825, 2182, 207, 477, 169, 1057, 2158, 273, 546, 322, 881, 1525, 251, 1216, 884, 876, 2149, 2050, 959, 1671, 930, 2039, 902, 1090, 536, 1847, 787, 230, 1344, 2135, 1673, 543, 1464, 1990, 1825, 1145, 117, 2170, 562, 1021, 1280, 487, 591, 1788, 1775, 1155, 935, 1950, 1770, 965, 1366, 1776, 766, 2139, 2006, 1138], [], [], [890, 446, 336, 391, 1737, 1260, 1292, 1154, 1567, 724, 157, 1221, 1411, 468, 680, 382, 623, 581, 210, 592, 827, 947, 1175, 602, 7, 2042, 405, 1384, 1350, 1620, 1809, 207, 477, 322, 251, 930, 2039, 902, 1847, 1673, 543, 1464, 935, 965, 1366, 1138], [], [890, 446, 336, 391, 1737, 1260, 1292, 1154, 1567, 724, 157, 1221, 1411, 468, 680, 382, 623, 581, 210, 592, 827, 947, 1175, 602, 7, 2042, 405, 1384, 1350, 1620, 1809, 207, 477, 322, 251, 930, 2039, 902, 1847, 1673, 543, 1464, 935, 965, 1366, 1138], [1221, 382, 1175, 1350, 322, 1673, 543, 1464], [], [], [], [], [], [], [], [], [], [], [], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775], [], [], [], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775], [], [], [], [], [], [], [], [], [], [], [], [], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [], [], [], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [], [], [], [], [], [], [], [], [], [], [], [], [810, 1996, 495, 275, 1668, 1737, 859, 977, 1298, 392, 1567, 157, 1221, 371, 12, 966, 1162, 680, 382, 623, 1069, 581, 592, 1108, 1110, 119, 504, 218, 2088, 1479, 2168, 2187, 1350, 2182, 477, 169, 322, 2149, 959, 1671, 787, 2135, 1990, 487, 1155, 1770, 965, 1138], [], [], [], [], [810, 1996, 495, 275, 1668, 1737, 859, 977, 1298, 392, 1567, 157, 1221, 371, 12, 966, 1162, 680, 382, 623, 1069, 581, 592, 1108, 1110, 119, 504, 218, 2088, 1479, 2168, 2187, 1350, 2182, 477, 169, 322, 2149, 959, 1671, 787, 2135, 1990, 487, 1155, 1770, 965, 1138], [810, 1996, 495, 275, 1668, 1737, 859, 977, 1298, 392, 1567, 157, 1221, 371, 12, 966, 1162, 680, 382, 623, 1069, 581, 592, 1108, 1110, 119, 504, 218, 2088, 1479, 2168, 2187, 1350, 2182, 477, 169, 322, 2149, 959, 1671, 787, 2135, 1990, 487, 1155, 1770, 965, 1138], [], [], [1221, 1350], [], [], [], [], [], [1221, 1350], [1221, 1350], [], [], [], [], [], [], [], [], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 724, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775, 1366], [], [], [], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 724, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775, 1366], [890, 446, 2116, 336, 459, 1260, 977, 1292, 1993, 1866, 1154, 1347, 724, 1237, 2062, 1781, 966, 1411, 1047, 827, 947, 98, 706, 1217, 405, 1384, 1310, 1620, 1809, 2182, 207, 251, 876, 930, 2039, 902, 1344, 2135, 1775, 1366], [], [], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [], [], [], [], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [1706, 68, 2054, 2036, 2026, 1221, 468, 382, 210, 1175, 602, 42, 1355, 907, 1883, 2042, 1350, 1057, 2158, 273, 322, 881, 1847, 230, 1673, 543, 1464, 117, 562, 935], [], [], [810, 1996, 495, 275, 1668, 1737, 859, 977, 1298, 392, 1567, 157, 1221, 371, 12, 966, 1162, 680, 382, 623, 1069, 581, 592, 1108, 1110, 119, 504, 218, 2088, 1479, 2168, 2187, 1350, 2182, 477, 169, 322, 2149, 959, 1671, 787, 2135, 1990, 487, 1155, 1770, 965, 1138], [], [], [], [], [810, 1996, 495, 275, 1668, 1737, 859, 977, 1298, 392, 1567, 157, 1221, 371, 12, 966, 1162, 680, 382, 623, 1069, 581, 592, 1108, 1110, 119, 504, 218, 2088, 1479, 2168, 2187, 1350, 2182, 477, 169, 322, 2149, 959, 1671, 787, 2135, 1990, 487, 1155, 1770, 965, 1138], [], [], [], [], [], [], [], [], [724, 1366], [], [], [724, 1366], [724, 1366], [724, 1366], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [724, 1366], [], [], [724, 1366], [], [], [], [], [], [], [], [], [], [], [], [], [], []]