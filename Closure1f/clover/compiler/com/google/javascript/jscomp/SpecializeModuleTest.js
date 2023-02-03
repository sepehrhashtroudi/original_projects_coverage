var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":523,"id":101003,"methods":[{"el":35,"sc":3,"sl":33},{"el":43,"sc":5,"sl":39},{"el":51,"sc":5,"sl":48},{"el":59,"sc":5,"sl":56},{"el":75,"sc":7,"sl":69},{"el":77,"sc":3,"sl":62},{"el":84,"sc":3,"sl":79},{"el":115,"sc":3,"sl":86},{"el":141,"sc":3,"sl":117},{"el":172,"sc":3,"sl":143},{"el":198,"sc":3,"sl":174},{"el":223,"sc":3,"sl":200},{"el":243,"sc":3,"sl":225},{"el":268,"sc":3,"sl":245},{"el":295,"sc":3,"sl":270},{"el":320,"sc":3,"sl":297},{"el":352,"sc":3,"sl":322},{"el":380,"sc":3,"sl":354},{"el":401,"sc":3,"sl":382}],"name":"SpecializeModuleTest","sl":29},{"el":522,"id":101057,"methods":[{"el":432,"sc":9,"sl":419},{"el":434,"sc":5,"sl":413},{"el":453,"sc":5,"sl":436},{"el":473,"sc":5,"sl":455},{"el":494,"sc":5,"sl":475},{"el":501,"sc":5,"sl":496}],"name":"SpecializeModuleTest.SpecializeModuleSpecializationStateTest","sl":406},{"el":521,"id":101100,"methods":[{"el":512,"sc":7,"sl":510},{"el":520,"sc":7,"sl":514}],"name":"SpecializeModuleTest.SpecializeModuleSpecializationStateTest.FunctionFinder","sl":506}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1071":{"methods":[{"sl":413},{"sl":419},{"sl":455},{"sl":496},{"sl":510},{"sl":514}],"name":"testSpecializedFunctions","pass":true,"statements":[{"sl":415},{"sl":417},{"sl":421},{"sl":424},{"sl":426},{"sl":429},{"sl":431},{"sl":456},{"sl":458},{"sl":460},{"sl":462},{"sl":463},{"sl":466},{"sl":468},{"sl":469},{"sl":472},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":511},{"sl":516},{"sl":518}]},"test_10923":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":117}],"name":"testSpecializeCascadedInline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":118},{"sl":129}]},"test_11560":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":174}],"name":"testSpecializeInlineWithNamespaces","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":175},{"sl":186}]},"test_12024":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":117}],"name":"testSpecializeCascadedInline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":118},{"sl":129}]},"test_12259":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":143}],"name":"testSpecializeInlineWithMultipleDependents","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":144},{"sl":157}]},"test_12289":{"methods":[{"sl":413},{"sl":419},{"sl":475},{"sl":496},{"sl":510},{"sl":514}],"name":"testCanFixupFunction","pass":true,"statements":[{"sl":415},{"sl":417},{"sl":421},{"sl":424},{"sl":426},{"sl":429},{"sl":431},{"sl":476},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":490},{"sl":493},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":511},{"sl":516},{"sl":518}]},"test_13892":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":86}],"name":"testSpecializeInline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":87},{"sl":101}]},"test_14269":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":86}],"name":"testSpecializeInline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":87},{"sl":101}]},"test_15250":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":297}],"name":"testDontSpecializeAliasedFunctions_inline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":298},{"sl":309}]},"test_15432":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":225}],"name":"testDontSpecializeLocalNonAnonymousFunctions","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":227},{"sl":229},{"sl":236}]},"test_15558":{"methods":[{"sl":413},{"sl":419},{"sl":455},{"sl":496},{"sl":510},{"sl":514}],"name":"testSpecializedFunctions","pass":true,"statements":[{"sl":415},{"sl":417},{"sl":421},{"sl":424},{"sl":426},{"sl":429},{"sl":431},{"sl":456},{"sl":458},{"sl":460},{"sl":462},{"sl":463},{"sl":466},{"sl":468},{"sl":469},{"sl":472},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":511},{"sl":516},{"sl":518}]},"test_15739":{"methods":[{"sl":413},{"sl":419},{"sl":436},{"sl":496},{"sl":510},{"sl":514}],"name":"testRemovedFunctions","pass":true,"statements":[{"sl":415},{"sl":417},{"sl":421},{"sl":424},{"sl":426},{"sl":429},{"sl":431},{"sl":437},{"sl":439},{"sl":441},{"sl":443},{"sl":444},{"sl":446},{"sl":448},{"sl":449},{"sl":452},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":511},{"sl":516},{"sl":518}]},"test_16337":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":382}],"name":"testSpecializeDevirtualizePrototypeMethodsWithInline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":383},{"sl":393}]},"test_16389":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":200}],"name":"testSpecializeInlineWithRegularFunctions","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":201},{"sl":211}]},"test_18945":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":297}],"name":"testDontSpecializeAliasedFunctions_inline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":298},{"sl":309}]},"test_18975":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":354}],"name":"testSpecializeDevirtualizePrototypeMethods","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":355},{"sl":366}]},"test_19244":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":245}],"name":"testAddDummyVarsForRemovedFunctions","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":246},{"sl":257}]},"test_19671":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":143}],"name":"testSpecializeInlineWithMultipleDependents","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":144},{"sl":157}]},"test_19685":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":225}],"name":"testDontSpecializeLocalNonAnonymousFunctions","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":227},{"sl":229},{"sl":236}]},"test_2578":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":382}],"name":"testSpecializeDevirtualizePrototypeMethodsWithInline","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":383},{"sl":393}]},"test_3210":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":200}],"name":"testSpecializeInlineWithRegularFunctions","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":201},{"sl":211}]},"test_438":{"methods":[{"sl":413},{"sl":419},{"sl":436},{"sl":496},{"sl":510},{"sl":514}],"name":"testRemovedFunctions","pass":true,"statements":[{"sl":415},{"sl":417},{"sl":421},{"sl":424},{"sl":426},{"sl":429},{"sl":431},{"sl":437},{"sl":439},{"sl":441},{"sl":443},{"sl":444},{"sl":446},{"sl":448},{"sl":449},{"sl":452},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":511},{"sl":516},{"sl":518}]},"test_5046":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":322}],"name":"testDontSpecializeAliasedFunctions_remove_unused_properties","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":323},{"sl":338}]},"test_5259":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":354}],"name":"testSpecializeDevirtualizePrototypeMethods","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":355},{"sl":366}]},"test_5738":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":270}],"name":"testSpecializeRemoveUnusedProperties","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":271},{"sl":284}]},"test_7113":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":174}],"name":"testSpecializeInlineWithNamespaces","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":175},{"sl":186}]},"test_7505":{"methods":[{"sl":413},{"sl":419},{"sl":475},{"sl":496},{"sl":510},{"sl":514}],"name":"testCanFixupFunction","pass":true,"statements":[{"sl":415},{"sl":417},{"sl":421},{"sl":424},{"sl":426},{"sl":429},{"sl":431},{"sl":476},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":490},{"sl":493},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":511},{"sl":516},{"sl":518}]},"test_7755":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":245}],"name":"testAddDummyVarsForRemovedFunctions","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":246},{"sl":257}]},"test_8714":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":270}],"name":"testSpecializeRemoveUnusedProperties","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":271},{"sl":284}]},"test_9410":{"methods":[{"sl":39},{"sl":48},{"sl":56},{"sl":62},{"sl":69},{"sl":322}],"name":"testDontSpecializeAliasedFunctions_remove_unused_properties","pass":true,"statements":[{"sl":41},{"sl":50},{"sl":58},{"sl":64},{"sl":68},{"sl":71},{"sl":74},{"sl":323},{"sl":338}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [], [], [], [], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [], [], [], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [], [7755, 12024, 16337, 15432, 18975, 12259, 19671, 10923, 15250, 5046, 8714, 5738, 11560, 9410, 13892, 7113, 19685, 14269, 2578, 16389, 19244, 5259, 18945, 3210], [], [], [], [], [], [], [], [], [], [], [], [13892, 14269], [13892, 14269], [], [], [], [], [], [], [], [], [], [], [], [], [], [13892, 14269], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [12024, 10923], [12024, 10923], [], [], [], [], [], [], [], [], [], [], [12024, 10923], [], [], [], [], [], [], [], [], [], [], [], [], [], [12259, 19671], [12259, 19671], [], [], [], [], [], [], [], [], [], [], [], [], [12259, 19671], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [11560, 7113], [11560, 7113], [], [], [], [], [], [], [], [], [], [], [11560, 7113], [], [], [], [], [], [], [], [], [], [], [], [], [], [16389, 3210], [16389, 3210], [], [], [], [], [], [], [], [], [], [16389, 3210], [], [], [], [], [], [], [], [], [], [], [], [], [], [15432, 19685], [], [15432, 19685], [], [15432, 19685], [], [], [], [], [], [], [15432, 19685], [], [], [], [], [], [], [], [], [7755, 19244], [7755, 19244], [], [], [], [], [], [], [], [], [], [], [7755, 19244], [], [], [], [], [], [], [], [], [], [], [], [], [8714, 5738], [8714, 5738], [], [], [], [], [], [], [], [], [], [], [], [], [8714, 5738], [], [], [], [], [], [], [], [], [], [], [], [], [15250, 18945], [15250, 18945], [], [], [], [], [], [], [], [], [], [], [15250, 18945], [], [], [], [], [], [], [], [], [], [], [], [], [5046, 9410], [5046, 9410], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5046, 9410], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [18975, 5259], [18975, 5259], [], [], [], [], [], [], [], [], [], [], [18975, 5259], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [16337, 2578], [16337, 2578], [], [], [], [], [], [], [], [], [], [16337, 2578], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [], [], [], [15739, 438], [15739, 438], [], [15739, 438], [], [15739, 438], [], [15739, 438], [15739, 438], [], [15739, 438], [], [15739, 438], [15739, 438], [], [], [15739, 438], [], [], [15558, 1071], [15558, 1071], [], [15558, 1071], [], [15558, 1071], [], [15558, 1071], [15558, 1071], [], [], [15558, 1071], [], [15558, 1071], [15558, 1071], [], [], [15558, 1071], [], [], [7505, 12289], [7505, 12289], [], [], [], [], [], [], [7505, 12289], [7505, 12289], [7505, 12289], [7505, 12289], [7505, 12289], [], [], [7505, 12289], [], [], [7505, 12289], [], [], [15739, 15558, 7505, 438, 1071, 12289], [15739, 15558, 7505, 438, 1071, 12289], [15739, 15558, 7505, 438, 1071, 12289], [15739, 15558, 7505, 438, 1071, 12289], [15739, 15558, 7505, 438, 1071, 12289], [], [], [], [], [], [], [], [], [], [15739, 15558, 7505, 438, 1071, 12289], [15739, 15558, 7505, 438, 1071, 12289], [], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [15739, 15558, 7505, 438, 1071, 12289], [], [], [], [], []]