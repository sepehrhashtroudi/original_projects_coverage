var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":209,"id":7459,"methods":[{"el":49,"sc":3,"sl":45},{"el":58,"sc":3,"sl":51},{"el":64,"sc":3,"sl":60},{"el":72,"sc":3,"sl":66},{"el":78,"sc":3,"sl":74},{"el":85,"sc":3,"sl":80},{"el":95,"sc":3,"sl":90},{"el":105,"sc":3,"sl":100},{"el":112,"sc":3,"sl":107},{"el":119,"sc":3,"sl":114},{"el":128,"sc":3,"sl":121},{"el":139,"sc":3,"sl":130},{"el":150,"sc":3,"sl":141},{"el":177,"sc":3,"sl":172},{"el":185,"sc":11,"sl":182},{"el":191,"sc":3,"sl":179},{"el":199,"sc":11,"sl":196},{"el":204,"sc":3,"sl":193}],"name":"NullObjectAndFieldTest","sl":42},{"el":154,"id":7530,"methods":[],"name":"NullObjectAndFieldTest.ClassWithNullWrappedPrimitive","sl":152},{"el":161,"id":7530,"methods":[],"name":"NullObjectAndFieldTest.ClassWithMembers","sl":157},{"el":170,"id":7530,"methods":[{"el":169,"sc":5,"sl":164}],"name":"NullObjectAndFieldTest.ClassWithObjectsSerializer","sl":163},{"el":208,"id":7554,"methods":[],"name":"NullObjectAndFieldTest.ObjectWithField","sl":206}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_16":{"methods":[{"sl":172}],"name":"testExplicitNullSetsFieldToNullDuringDeserialization","pass":true,"statements":[{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_217":{"methods":[{"sl":51}],"name":"testTopLevelNullObjectSerialization","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54},{"sl":56},{"sl":57}]},"test_219":{"methods":[{"sl":66}],"name":"testExplicitSerializationOfNulls","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_245":{"methods":[{"sl":74}],"name":"testExplicitDeserializationOfNulls","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77}]},"test_335":{"methods":[{"sl":193},{"sl":196}],"name":"testCustomTypeAdapterPassesNullDesrialization","pass":true,"statements":[{"sl":194},{"sl":198},{"sl":201},{"sl":202},{"sl":203}]},"test_382":{"methods":[{"sl":141}],"name":"testPrintPrintingArraysWithNulls","pass":true,"statements":[{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":148},{"sl":149}]},"test_413":{"methods":[{"sl":60}],"name":"testTopLevelNullObjectDeserialization","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63}]},"test_414":{"methods":[{"sl":80}],"name":"testExplicitSerializationOfNullArrayMembers","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84}]},"test_431":{"methods":[{"sl":90}],"name":"testNullWrappedPrimitiveMemberSerialization","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94}]},"test_468":{"methods":[{"sl":130}],"name":"testPrintPrintingObjectWithNulls","pass":true,"statements":[{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":136},{"sl":137},{"sl":138}]},"test_491":{"methods":[{"sl":114}],"name":"testExplicitSerializationOfNullStringMembers","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118}]},"test_556":{"methods":[{"sl":179},{"sl":182}],"name":"testCustomTypeAdapterPassesNullSerialization","pass":true,"statements":[{"sl":180},{"sl":184},{"sl":187},{"sl":188},{"sl":189},{"sl":190}]},"test_592":{"methods":[{"sl":121},{"sl":164}],"name":"testCustomSerializationOfNulls","pass":true,"statements":[{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":166},{"sl":167},{"sl":168}]},"test_618":{"methods":[{"sl":107}],"name":"testExplicitSerializationOfNullCollectionMembers","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_650":{"methods":[{"sl":100}],"name":"testNullWrappedPrimitiveMemberDeserialization","pass":true,"statements":[{"sl":101},{"sl":102},{"sl":103},{"sl":104}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [217], [217], [217], [217], [], [217], [217], [], [], [413], [413], [413], [413], [], [], [219], [219], [219], [219], [219], [219], [], [], [245], [245], [245], [245], [], [], [414], [414], [414], [414], [414], [], [], [], [], [], [431], [431], [431], [431], [431], [], [], [], [], [], [650], [650], [650], [650], [650], [], [], [618], [618], [618], [618], [618], [], [], [491], [491], [491], [491], [491], [], [], [592], [592], [592], [592], [592], [592], [592], [], [], [468], [468], [468], [468], [468], [], [468], [468], [468], [], [], [382], [382], [382], [382], [382], [], [382], [382], [382], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [592], [], [592], [592], [592], [], [], [], [16], [16], [16], [16], [16], [], [], [556], [556], [], [556], [], [556], [], [], [556], [556], [556], [556], [], [], [335], [335], [], [335], [], [335], [], [], [335], [335], [335], [], [], [], [], [], []]