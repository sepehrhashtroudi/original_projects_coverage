var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":267,"id":37948,"methods":[{"el":236,"sc":5,"sl":230},{"el":245,"sc":5,"sl":238},{"el":252,"sc":5,"sl":247},{"el":265,"sc":5,"sl":254}],"name":"TestHandlerInstantiation","sl":25},{"el":41,"id":37948,"methods":[{"el":39,"sc":9,"sl":39},{"el":40,"sc":9,"sl":40}],"name":"TestHandlerInstantiation.MyBean","sl":35},{"el":45,"id":37952,"methods":[],"name":"TestHandlerInstantiation.MyMap","sl":45},{"el":54,"id":37952,"methods":[{"el":52,"sc":9,"sl":52},{"el":53,"sc":9,"sl":53}],"name":"TestHandlerInstantiation.TypeIdBean","sl":49},{"el":61,"id":37955,"methods":[{"el":59,"sc":9,"sl":59},{"el":60,"sc":9,"sl":60}],"name":"TestHandlerInstantiation.TypeIdBeanWrapper","sl":56},{"el":83,"id":37959,"methods":[{"el":75,"sc":9,"sl":73},{"el":82,"sc":9,"sl":77}],"name":"TestHandlerInstantiation.MyBeanDeserializer","sl":69},{"el":95,"id":37963,"methods":[{"el":87,"sc":9,"sl":87},{"el":94,"sc":9,"sl":89}],"name":"TestHandlerInstantiation.MyKeyDeserializer","sl":85},{"el":111,"id":37966,"methods":[{"el":103,"sc":9,"sl":101},{"el":110,"sc":9,"sl":105}],"name":"TestHandlerInstantiation.MyBeanSerializer","sl":97},{"el":158,"id":37970,"methods":[{"el":122,"sc":9,"sl":120},{"el":127,"sc":9,"sl":124},{"el":135,"sc":9,"sl":128},{"el":139,"sc":9,"sl":136},{"el":145,"sc":9,"sl":140},{"el":153,"sc":9,"sl":146},{"el":157,"sc":9,"sl":154}],"name":"TestHandlerInstantiation.CustomIdResolver","sl":114},{"el":222,"id":37995,"methods":[{"el":172,"sc":9,"sl":170},{"el":183,"sc":9,"sl":174},{"el":194,"sc":9,"sl":185},{"el":204,"sc":9,"sl":196},{"el":214,"sc":9,"sl":206},{"el":221,"sc":9,"sl":216}],"name":"TestHandlerInstantiation.MyInstantiator","sl":166}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1047":{"methods":[{"sl":52},{"sl":53},{"sl":59},{"sl":60},{"sl":120},{"sl":128},{"sl":140},{"sl":146},{"sl":170},{"sl":206},{"sl":254}],"name":"testTypeIdResolver","pass":true,"statements":[{"sl":53},{"sl":59},{"sl":60},{"sl":121},{"sl":131},{"sl":132},{"sl":142},{"sl":149},{"sl":150},{"sl":171},{"sl":210},{"sl":211},{"sl":256},{"sl":257},{"sl":258},{"sl":260},{"sl":262},{"sl":263},{"sl":264}]},"test_1078":{"methods":[{"sl":40},{"sl":101},{"sl":105},{"sl":170},{"sl":196},{"sl":247}],"name":"testSerializer","pass":true,"statements":[{"sl":40},{"sl":102},{"sl":109},{"sl":171},{"sl":200},{"sl":201},{"sl":249},{"sl":250},{"sl":251}]},"test_1310":{"methods":[{"sl":52},{"sl":53},{"sl":59},{"sl":60},{"sl":120},{"sl":128},{"sl":140},{"sl":146},{"sl":170},{"sl":206},{"sl":254}],"name":"testTypeIdResolver","pass":true,"statements":[{"sl":53},{"sl":59},{"sl":60},{"sl":121},{"sl":131},{"sl":132},{"sl":142},{"sl":149},{"sl":150},{"sl":171},{"sl":210},{"sl":211},{"sl":256},{"sl":257},{"sl":258},{"sl":260},{"sl":262},{"sl":263},{"sl":264}]},"test_1378":{"methods":[{"sl":40},{"sl":73},{"sl":77},{"sl":170},{"sl":174},{"sl":230}],"name":"testDeserializer","pass":true,"statements":[{"sl":40},{"sl":74},{"sl":81},{"sl":171},{"sl":179},{"sl":180},{"sl":232},{"sl":233},{"sl":234},{"sl":235}]},"test_1561":{"methods":[{"sl":87},{"sl":89},{"sl":170},{"sl":185},{"sl":238}],"name":"testKeyDeserializer","pass":true,"statements":[{"sl":93},{"sl":171},{"sl":189},{"sl":190},{"sl":240},{"sl":241},{"sl":242},{"sl":244}]},"test_2045":{"methods":[{"sl":40},{"sl":73},{"sl":77},{"sl":170},{"sl":174},{"sl":230}],"name":"testDeserializer","pass":true,"statements":[{"sl":40},{"sl":74},{"sl":81},{"sl":171},{"sl":179},{"sl":180},{"sl":232},{"sl":233},{"sl":234},{"sl":235}]},"test_292":{"methods":[{"sl":40},{"sl":101},{"sl":105},{"sl":170},{"sl":196},{"sl":247}],"name":"testSerializer","pass":true,"statements":[{"sl":40},{"sl":102},{"sl":109},{"sl":171},{"sl":200},{"sl":201},{"sl":249},{"sl":250},{"sl":251}]},"test_74":{"methods":[{"sl":87},{"sl":89},{"sl":170},{"sl":185},{"sl":238}],"name":"testKeyDeserializer","pass":true,"statements":[{"sl":93},{"sl":171},{"sl":189},{"sl":190},{"sl":240},{"sl":241},{"sl":242},{"sl":244}]},"test_970":{"methods":[{"sl":40},{"sl":73},{"sl":77},{"sl":170},{"sl":174},{"sl":230}],"name":"testDeserializer","pass":true,"statements":[{"sl":40},{"sl":74},{"sl":81},{"sl":171},{"sl":179},{"sl":180},{"sl":232},{"sl":233},{"sl":234},{"sl":235}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [292, 2045, 970, 1078, 1378], [], [], [], [], [], [], [], [], [], [], [], [1310, 1047], [1310, 1047], [], [], [], [], [], [1310, 1047], [1310, 1047], [], [], [], [], [], [], [], [], [], [], [], [], [2045, 970, 1378], [2045, 970, 1378], [], [], [2045, 970, 1378], [], [], [], [2045, 970, 1378], [], [], [], [], [], [74, 1561], [], [74, 1561], [], [], [], [74, 1561], [], [], [], [], [], [], [], [292, 1078], [292, 1078], [], [], [292, 1078], [], [], [], [292, 1078], [], [], [], [], [], [], [], [], [], [], [1310, 1047], [1310, 1047], [], [], [], [], [], [], [1310, 1047], [], [], [1310, 1047], [1310, 1047], [], [], [], [], [], [], [], [1310, 1047], [], [1310, 1047], [], [], [], [1310, 1047], [], [], [1310, 1047], [1310, 1047], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [292, 2045, 970, 1310, 1078, 74, 1047, 1561, 1378], [292, 2045, 970, 1310, 1078, 74, 1047, 1561, 1378], [], [], [2045, 970, 1378], [], [], [], [], [2045, 970, 1378], [2045, 970, 1378], [], [], [], [], [74, 1561], [], [], [], [74, 1561], [74, 1561], [], [], [], [], [], [292, 1078], [], [], [], [292, 1078], [292, 1078], [], [], [], [], [1310, 1047], [], [], [], [1310, 1047], [1310, 1047], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2045, 970, 1378], [], [2045, 970, 1378], [2045, 970, 1378], [2045, 970, 1378], [2045, 970, 1378], [], [], [74, 1561], [], [74, 1561], [74, 1561], [74, 1561], [], [74, 1561], [], [], [292, 1078], [], [292, 1078], [292, 1078], [292, 1078], [], [], [1310, 1047], [], [1310, 1047], [1310, 1047], [1310, 1047], [], [1310, 1047], [], [1310, 1047], [1310, 1047], [1310, 1047], [], [], []]