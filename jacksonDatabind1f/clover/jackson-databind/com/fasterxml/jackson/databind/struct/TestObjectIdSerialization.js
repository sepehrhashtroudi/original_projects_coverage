var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":261,"id":31020,"methods":[{"el":172,"sc":5,"sl":160},{"el":188,"sc":5,"sl":177},{"el":210,"sc":5,"sl":198},{"el":225,"sc":5,"sl":214},{"el":231,"sc":5,"sl":227},{"el":244,"sc":5,"sl":233},{"el":260,"sc":5,"sl":252}],"name":"TestObjectIdSerialization","sl":13},{"el":26,"id":31020,"methods":[{"el":22,"sc":9,"sl":22},{"el":25,"sc":9,"sl":23}],"name":"TestObjectIdSerialization.Identifiable","sl":16},{"el":43,"id":31024,"methods":[{"el":38,"sc":9,"sl":38},{"el":42,"sc":9,"sl":39}],"name":"TestObjectIdSerialization.IdentifiableWithProp","sl":29},{"el":56,"id":31029,"methods":[{"el":52,"sc":9,"sl":52},{"el":55,"sc":9,"sl":53}],"name":"TestObjectIdSerialization.IdWrapper","sl":47},{"el":64,"id":31032,"methods":[{"el":62,"sc":9,"sl":62},{"el":63,"sc":9,"sl":63}],"name":"TestObjectIdSerialization.ValueNode","sl":58},{"el":77,"id":31036,"methods":[{"el":73,"sc":9,"sl":73},{"el":76,"sc":9,"sl":74}],"name":"TestObjectIdSerialization.IdWrapperCustom","sl":68},{"el":91,"id":31039,"methods":[{"el":84,"sc":9,"sl":84},{"el":86,"sc":9,"sl":86},{"el":90,"sc":9,"sl":87}],"name":"TestObjectIdSerialization.ValueNodeCustom","sl":79},{"el":102,"id":31046,"methods":[{"el":98,"sc":9,"sl":98},{"el":101,"sc":9,"sl":99}],"name":"TestObjectIdSerialization.AlwaysAsId","sl":94},{"el":114,"id":31050,"methods":[],"name":"TestObjectIdSerialization.AlwaysContainer","sl":106},{"el":118,"id":31050,"methods":[],"name":"TestObjectIdSerialization.Value","sl":116},{"el":138,"id":31050,"methods":[{"el":132,"sc":9,"sl":132},{"el":137,"sc":9,"sl":133}],"name":"TestObjectIdSerialization.TreeNode","sl":121},{"el":148,"id":31055,"methods":[],"name":"TestObjectIdSerialization.Broken","sl":144}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1118":{"methods":[{"sl":74},{"sl":84},{"sl":87},{"sl":214}],"name":"testCustomPropertyViaProperty","pass":true,"statements":[{"sl":75},{"sl":84},{"sl":88},{"sl":89},{"sl":216},{"sl":217},{"sl":220},{"sl":221},{"sl":223},{"sl":224}]},"test_13":{"methods":[{"sl":252}],"name":"testInvalidProp","pass":true,"statements":[{"sl":254},{"sl":255},{"sl":258}]},"test_1450":{"methods":[{"sl":99},{"sl":227}],"name":"testAlwaysAsId","pass":true,"statements":[{"sl":100},{"sl":229},{"sl":230}]},"test_1630":{"methods":[{"sl":252}],"name":"testInvalidProp","pass":true,"statements":[{"sl":254},{"sl":255},{"sl":258}]},"test_1734":{"methods":[{"sl":53},{"sl":63},{"sl":177}],"name":"testSimpleSerializationProperty","pass":true,"statements":[{"sl":54},{"sl":63},{"sl":179},{"sl":180},{"sl":183},{"sl":184},{"sl":186},{"sl":187}]},"test_1905":{"methods":[{"sl":39},{"sl":198}],"name":"testCustomPropertyForClass","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":200},{"sl":201},{"sl":204},{"sl":205},{"sl":208},{"sl":209}]},"test_2161":{"methods":[{"sl":74},{"sl":84},{"sl":87},{"sl":214}],"name":"testCustomPropertyViaProperty","pass":true,"statements":[{"sl":75},{"sl":84},{"sl":88},{"sl":89},{"sl":216},{"sl":217},{"sl":220},{"sl":221},{"sl":223},{"sl":224}]},"test_2183":{"methods":[{"sl":99},{"sl":227}],"name":"testAlwaysAsId","pass":true,"statements":[{"sl":100},{"sl":229},{"sl":230}]},"test_457":{"methods":[{"sl":23},{"sl":160}],"name":"testSimpleSerializationClass","pass":true,"statements":[{"sl":24},{"sl":162},{"sl":163},{"sl":166},{"sl":167},{"sl":170},{"sl":171}]},"test_564":{"methods":[{"sl":39},{"sl":198}],"name":"testCustomPropertyForClass","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":200},{"sl":201},{"sl":204},{"sl":205},{"sl":208},{"sl":209}]},"test_608":{"methods":[{"sl":23},{"sl":160}],"name":"testSimpleSerializationClass","pass":true,"statements":[{"sl":24},{"sl":162},{"sl":163},{"sl":166},{"sl":167},{"sl":170},{"sl":171}]},"test_754":{"methods":[{"sl":133},{"sl":233}],"name":"testAlwaysIdForTree","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":240}]},"test_757":{"methods":[{"sl":53},{"sl":63},{"sl":177}],"name":"testSimpleSerializationProperty","pass":true,"statements":[{"sl":54},{"sl":63},{"sl":179},{"sl":180},{"sl":183},{"sl":184},{"sl":186},{"sl":187}]},"test_784":{"methods":[{"sl":133},{"sl":233}],"name":"testAlwaysIdForTree","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":240}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [457, 608], [457, 608], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1905, 564], [1905, 564], [1905, 564], [], [], [], [], [], [], [], [], [], [], [], [1734, 757], [1734, 757], [], [], [], [], [], [], [], [], [1734, 757], [], [], [], [], [], [], [], [], [], [], [1118, 2161], [1118, 2161], [], [], [], [], [], [], [], [], [1118, 2161], [], [], [1118, 2161], [1118, 2161], [1118, 2161], [], [], [], [], [], [], [], [], [], [2183, 1450], [2183, 1450], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [784, 754], [784, 754], [784, 754], [784, 754], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [457, 608], [], [457, 608], [457, 608], [], [], [457, 608], [457, 608], [], [], [457, 608], [457, 608], [], [], [], [], [], [1734, 757], [], [1734, 757], [1734, 757], [], [], [1734, 757], [1734, 757], [], [1734, 757], [1734, 757], [], [], [], [], [], [], [], [], [], [], [1905, 564], [], [1905, 564], [1905, 564], [], [], [1905, 564], [1905, 564], [], [], [1905, 564], [1905, 564], [], [], [], [], [1118, 2161], [], [1118, 2161], [1118, 2161], [], [], [1118, 2161], [1118, 2161], [], [1118, 2161], [1118, 2161], [], [], [2183, 1450], [], [2183, 1450], [2183, 1450], [], [], [784, 754], [], [784, 754], [784, 754], [784, 754], [784, 754], [], [784, 754], [], [], [], [], [], [], [], [], [], [], [], [1630, 13], [], [1630, 13], [1630, 13], [], [], [1630, 13], [], [], []]