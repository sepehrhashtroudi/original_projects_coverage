var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":329,"id":42111,"methods":[{"el":234,"sc":5,"sl":226},{"el":244,"sc":5,"sl":236},{"el":256,"sc":5,"sl":246},{"el":274,"sc":5,"sl":258},{"el":285,"sc":5,"sl":277},{"el":296,"sc":5,"sl":287},{"el":307,"sc":5,"sl":298},{"el":317,"sc":5,"sl":309},{"el":328,"sc":5,"sl":319}],"name":"TestBeanDeserializer","sl":18},{"el":35,"id":42111,"methods":[{"el":30,"sc":9,"sl":30},{"el":34,"sc":9,"sl":31}],"name":"TestBeanDeserializer.Bean","sl":26},{"el":55,"id":42115,"methods":[{"el":45,"sc":9,"sl":41},{"el":54,"sc":9,"sl":47}],"name":"TestBeanDeserializer.ModuleImpl","sl":37},{"el":69,"id":42124,"methods":[{"el":61,"sc":9,"sl":61},{"el":68,"sc":9,"sl":63}],"name":"TestBeanDeserializer.RemovingModifier","sl":57},{"el":82,"id":42129,"methods":[{"el":75,"sc":9,"sl":75},{"el":81,"sc":9,"sl":77}],"name":"TestBeanDeserializer.ReplacingModifier","sl":71},{"el":99,"id":42133,"methods":[{"el":91,"sc":9,"sl":88},{"el":98,"sc":9,"sl":93}],"name":"TestBeanDeserializer.BogusBeanDeserializer","sl":84},{"el":103,"id":42138,"methods":[],"name":"TestBeanDeserializer.Issue476Bean","sl":101},{"el":106,"id":42138,"methods":[],"name":"TestBeanDeserializer.Issue476Type","sl":104},{"el":122,"id":42138,"methods":[{"el":114,"sc":9,"sl":112},{"el":121,"sc":9,"sl":116}],"name":"TestBeanDeserializer.Issue476Deserializer","sl":107},{"el":132,"id":42143,"methods":[{"el":131,"sc":9,"sl":124}],"name":"TestBeanDeserializer.Issue476DeserializerModifier","sl":123},{"el":143,"id":42149,"methods":[{"el":137,"sc":9,"sl":135},{"el":142,"sc":9,"sl":139}],"name":"TestBeanDeserializer.Issue476Module","sl":133},{"el":147,"id":42153,"methods":[],"name":"TestBeanDeserializer.EnumABC","sl":147},{"el":160,"id":42153,"methods":[{"el":157,"sc":17,"sl":154},{"el":159,"sc":9,"sl":150}],"name":"TestBeanDeserializer.ArrayDeserializerModifier","sl":149},{"el":175,"id":42157,"methods":[{"el":172,"sc":17,"sl":167},{"el":174,"sc":9,"sl":163}],"name":"TestBeanDeserializer.CollectionDeserializerModifier","sl":162},{"el":190,"id":42163,"methods":[{"el":187,"sc":17,"sl":182},{"el":189,"sc":9,"sl":178}],"name":"TestBeanDeserializer.MapDeserializerModifier","sl":177},{"el":203,"id":42169,"methods":[{"el":200,"sc":17,"sl":197},{"el":202,"sc":9,"sl":193}],"name":"TestBeanDeserializer.EnumDeserializerModifier","sl":192},{"el":218,"id":42173,"methods":[{"el":215,"sc":17,"sl":210},{"el":217,"sc":9,"sl":206}],"name":"TestBeanDeserializer.KeyDeserializerModifier","sl":205}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1043":{"methods":[{"sl":258}],"name":"testPOJOFromEmptyString","pass":true,"statements":[{"sl":261},{"sl":262},{"sl":263},{"sl":266},{"sl":270},{"sl":271},{"sl":272},{"sl":273}]},"test_1323":{"methods":[{"sl":193},{"sl":197},{"sl":309}],"name":"testModifyEnumDeserializer","pass":true,"statements":[{"sl":196},{"sl":199},{"sl":311},{"sl":312},{"sl":315},{"sl":316}]},"test_1332":{"methods":[{"sl":178},{"sl":182},{"sl":298}],"name":"testModifyMapDeserializer","pass":true,"statements":[{"sl":181},{"sl":184},{"sl":185},{"sl":186},{"sl":300},{"sl":301},{"sl":304},{"sl":305},{"sl":306}]},"test_1395":{"methods":[{"sl":258}],"name":"testPOJOFromEmptyString","pass":true,"statements":[{"sl":261},{"sl":262},{"sl":263},{"sl":266},{"sl":270},{"sl":271},{"sl":272},{"sl":273}]},"test_1553":{"methods":[{"sl":150},{"sl":154},{"sl":277}],"name":"testModifyArrayDeserializer","pass":true,"statements":[{"sl":153},{"sl":156},{"sl":279},{"sl":280},{"sl":282},{"sl":283},{"sl":284}]},"test_180":{"methods":[{"sl":31},{"sl":41},{"sl":47},{"sl":75},{"sl":77},{"sl":88},{"sl":93},{"sl":236}],"name":"testDeserializerReplacement","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":43},{"sl":44},{"sl":50},{"sl":51},{"sl":52},{"sl":75},{"sl":80},{"sl":89},{"sl":90},{"sl":97},{"sl":238},{"sl":239},{"sl":240},{"sl":242},{"sl":243}]},"test_1839":{"methods":[{"sl":193},{"sl":197},{"sl":309}],"name":"testModifyEnumDeserializer","pass":true,"statements":[{"sl":196},{"sl":199},{"sl":311},{"sl":312},{"sl":315},{"sl":316}]},"test_2051":{"methods":[{"sl":31},{"sl":41},{"sl":47},{"sl":75},{"sl":77},{"sl":88},{"sl":93},{"sl":236}],"name":"testDeserializerReplacement","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":43},{"sl":44},{"sl":50},{"sl":51},{"sl":52},{"sl":75},{"sl":80},{"sl":89},{"sl":90},{"sl":97},{"sl":238},{"sl":239},{"sl":240},{"sl":242},{"sl":243}]},"test_2160":{"methods":[{"sl":30},{"sl":41},{"sl":47},{"sl":61},{"sl":63},{"sl":226}],"name":"testPropertyRemoval","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":50},{"sl":51},{"sl":52},{"sl":61},{"sl":66},{"sl":67},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":233}]},"test_366":{"methods":[{"sl":163},{"sl":167},{"sl":287}],"name":"testModifyCollectionDeserializer","pass":true,"statements":[{"sl":166},{"sl":169},{"sl":170},{"sl":171},{"sl":289},{"sl":290},{"sl":293},{"sl":294},{"sl":295}]},"test_39":{"methods":[{"sl":178},{"sl":182},{"sl":298}],"name":"testModifyMapDeserializer","pass":true,"statements":[{"sl":181},{"sl":184},{"sl":185},{"sl":186},{"sl":300},{"sl":301},{"sl":304},{"sl":305},{"sl":306}]},"test_393":{"methods":[{"sl":150},{"sl":154},{"sl":277}],"name":"testModifyArrayDeserializer","pass":true,"statements":[{"sl":153},{"sl":156},{"sl":279},{"sl":280},{"sl":282},{"sl":283},{"sl":284}]},"test_427":{"methods":[{"sl":112},{"sl":116},{"sl":124},{"sl":135},{"sl":139},{"sl":246}],"name":"testIssue476","pass":true,"statements":[{"sl":113},{"sl":119},{"sl":120},{"sl":127},{"sl":128},{"sl":130},{"sl":136},{"sl":141},{"sl":248},{"sl":250},{"sl":251},{"sl":252},{"sl":255}]},"test_454":{"methods":[{"sl":30},{"sl":41},{"sl":47},{"sl":61},{"sl":63},{"sl":226}],"name":"testPropertyRemoval","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":50},{"sl":51},{"sl":52},{"sl":61},{"sl":66},{"sl":67},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":233}]},"test_641":{"methods":[{"sl":112},{"sl":116},{"sl":124},{"sl":135},{"sl":139},{"sl":246}],"name":"testIssue476","pass":true,"statements":[{"sl":113},{"sl":119},{"sl":120},{"sl":127},{"sl":128},{"sl":130},{"sl":136},{"sl":141},{"sl":248},{"sl":250},{"sl":251},{"sl":252},{"sl":255}]},"test_779":{"methods":[{"sl":206},{"sl":210},{"sl":319}],"name":"testModifyKeyDeserializer","pass":true,"statements":[{"sl":209},{"sl":214},{"sl":321},{"sl":322},{"sl":325},{"sl":326},{"sl":327}]},"test_805":{"methods":[{"sl":163},{"sl":167},{"sl":287}],"name":"testModifyCollectionDeserializer","pass":true,"statements":[{"sl":166},{"sl":169},{"sl":170},{"sl":171},{"sl":289},{"sl":290},{"sl":293},{"sl":294},{"sl":295}]},"test_949":{"methods":[{"sl":206},{"sl":210},{"sl":319}],"name":"testModifyKeyDeserializer","pass":true,"statements":[{"sl":209},{"sl":214},{"sl":321},{"sl":322},{"sl":325},{"sl":326},{"sl":327}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2160, 454], [180, 2051], [180, 2051], [180, 2051], [], [], [], [], [], [], [], [180, 2160, 454, 2051], [], [180, 2160, 454, 2051], [180, 2160, 454, 2051], [], [], [180, 2160, 454, 2051], [], [], [180, 2160, 454, 2051], [180, 2160, 454, 2051], [180, 2160, 454, 2051], [], [], [], [], [], [], [], [], [2160, 454], [], [2160, 454], [], [], [2160, 454], [2160, 454], [], [], [], [], [], [], [], [180, 2051], [], [180, 2051], [], [], [180, 2051], [], [], [], [], [], [], [], [180, 2051], [180, 2051], [180, 2051], [], [], [180, 2051], [], [], [], [180, 2051], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [427, 641], [427, 641], [], [], [427, 641], [], [], [427, 641], [427, 641], [], [], [], [427, 641], [], [], [427, 641], [427, 641], [], [427, 641], [], [], [], [], [427, 641], [427, 641], [], [], [427, 641], [], [427, 641], [], [], [], [], [], [], [], [], [1553, 393], [], [], [1553, 393], [1553, 393], [], [1553, 393], [], [], [], [], [], [], [805, 366], [], [], [805, 366], [805, 366], [], [805, 366], [805, 366], [805, 366], [], [], [], [], [], [], [39, 1332], [], [], [39, 1332], [39, 1332], [], [39, 1332], [39, 1332], [39, 1332], [], [], [], [], [], [], [1323, 1839], [], [], [1323, 1839], [1323, 1839], [], [1323, 1839], [], [], [], [], [], [], [779, 949], [], [], [779, 949], [779, 949], [], [], [], [779, 949], [], [], [], [], [], [], [], [], [], [], [], [2160, 454], [], [2160, 454], [2160, 454], [2160, 454], [2160, 454], [], [2160, 454], [], [], [180, 2051], [], [180, 2051], [180, 2051], [180, 2051], [], [180, 2051], [180, 2051], [], [], [427, 641], [], [427, 641], [], [427, 641], [427, 641], [427, 641], [], [], [427, 641], [], [], [1043, 1395], [], [], [1043, 1395], [1043, 1395], [1043, 1395], [], [], [1043, 1395], [], [], [], [1043, 1395], [1043, 1395], [1043, 1395], [1043, 1395], [], [], [], [1553, 393], [], [1553, 393], [1553, 393], [], [1553, 393], [1553, 393], [1553, 393], [], [], [805, 366], [], [805, 366], [805, 366], [], [], [805, 366], [805, 366], [805, 366], [], [], [39, 1332], [], [39, 1332], [39, 1332], [], [], [39, 1332], [39, 1332], [39, 1332], [], [], [1323, 1839], [], [1323, 1839], [1323, 1839], [], [], [1323, 1839], [1323, 1839], [], [], [779, 949], [], [779, 949], [779, 949], [], [], [779, 949], [779, 949], [779, 949], [], []]