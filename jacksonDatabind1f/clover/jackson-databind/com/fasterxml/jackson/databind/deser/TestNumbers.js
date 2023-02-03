var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":121,"id":37811,"methods":[{"el":67,"sc":5,"sl":62},{"el":77,"sc":5,"sl":69},{"el":89,"sc":5,"sl":80},{"el":98,"sc":5,"sl":93},{"el":109,"sc":5,"sl":100},{"el":120,"sc":5,"sl":111}],"name":"TestNumbers","sl":14},{"el":26,"id":37811,"methods":[],"name":"TestNumbers.MyBeanHolder","sl":23},{"el":31,"id":37811,"methods":[],"name":"TestNumbers.MyBeanDefaultValue","sl":28},{"el":38,"id":37811,"methods":[{"el":36,"sc":9,"sl":36},{"el":37,"sc":9,"sl":37}],"name":"TestNumbers.MyBeanValue","sl":34},{"el":54,"id":37815,"methods":[{"el":53,"sc":9,"sl":48}],"name":"TestNumbers.MyBeanDeserializer","sl":46}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1246":{"methods":[{"sl":69}],"name":"testDoubleInf","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":75},{"sl":76}]},"test_1327":{"methods":[{"sl":48},{"sl":111}],"name":"testDeserializeDecimalProperExceptionWhenIdSet","pass":true,"statements":[{"sl":52},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":118}]},"test_1544":{"methods":[{"sl":69}],"name":"testDoubleInf","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":75},{"sl":76}]},"test_1622":{"methods":[{"sl":62}],"name":"testFloatNaN","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66}]},"test_1888":{"methods":[{"sl":37},{"sl":48},{"sl":93}],"name":"testDeserializeDecimalHappyPath","pass":true,"statements":[{"sl":37},{"sl":52},{"sl":94},{"sl":95},{"sl":96},{"sl":97}]},"test_1980":{"methods":[{"sl":48},{"sl":111}],"name":"testDeserializeDecimalProperExceptionWhenIdSet","pass":true,"statements":[{"sl":52},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":118}]},"test_246":{"methods":[{"sl":62}],"name":"testFloatNaN","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66}]},"test_287":{"methods":[{"sl":37},{"sl":48},{"sl":93}],"name":"testDeserializeDecimalHappyPath","pass":true,"statements":[{"sl":37},{"sl":52},{"sl":94},{"sl":95},{"sl":96},{"sl":97}]},"test_620":{"methods":[{"sl":80}],"name":"testEmptyAsNumber","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88}]},"test_807":{"methods":[{"sl":48},{"sl":100}],"name":"testDeserializeDecimalProperException","pass":true,"statements":[{"sl":52},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":107}]},"test_931":{"methods":[{"sl":48},{"sl":100}],"name":"testDeserializeDecimalProperException","pass":true,"statements":[{"sl":52},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":107}]},"test_984":{"methods":[{"sl":80}],"name":"testEmptyAsNumber","pass":true,"statements":[{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [287, 1888], [], [], [], [], [], [], [], [], [], [], [287, 931, 1888, 807, 1327, 1980], [], [], [], [287, 931, 1888, 807, 1327, 1980], [], [], [], [], [], [], [], [], [], [246, 1622], [], [246, 1622], [246, 1622], [246, 1622], [], [], [1246, 1544], [], [1246, 1544], [1246, 1544], [1246, 1544], [], [1246, 1544], [1246, 1544], [], [], [], [620, 984], [], [620, 984], [620, 984], [620, 984], [620, 984], [620, 984], [620, 984], [620, 984], [], [], [], [], [287, 1888], [287, 1888], [287, 1888], [287, 1888], [287, 1888], [], [], [931, 807], [931, 807], [931, 807], [931, 807], [931, 807], [], [], [931, 807], [], [], [], [1327, 1980], [1327, 1980], [1327, 1980], [1327, 1980], [1327, 1980], [], [], [1327, 1980], [], [], []]