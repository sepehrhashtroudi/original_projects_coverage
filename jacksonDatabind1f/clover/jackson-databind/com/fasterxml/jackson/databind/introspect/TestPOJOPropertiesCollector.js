var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":417,"id":41689,"methods":[{"el":204,"sc":5,"sl":193},{"el":218,"sc":5,"sl":206},{"el":231,"sc":5,"sl":220},{"el":241,"sc":5,"sl":235},{"el":257,"sc":5,"sl":246},{"el":270,"sc":5,"sl":259},{"el":283,"sc":5,"sl":272},{"el":296,"sc":5,"sl":285},{"el":309,"sc":5,"sl":298},{"el":319,"sc":5,"sl":311},{"el":332,"sc":5,"sl":321},{"el":343,"sc":5,"sl":334},{"el":364,"sc":5,"sl":345},{"el":376,"sc":5,"sl":367},{"el":389,"sc":5,"sl":378},{"el":397,"sc":5,"sl":391},{"el":416,"sc":5,"sl":405}],"name":"TestPOJOPropertiesCollector","sl":11},{"el":22,"id":41689,"methods":[{"el":18,"sc":9,"sl":17},{"el":21,"sc":9,"sl":20}],"name":"TestPOJOPropertiesCollector.Simple","sl":14},{"el":27,"id":41693,"methods":[],"name":"TestPOJOPropertiesCollector.SimpleFieldDeser","sl":24},{"el":34,"id":41693,"methods":[{"el":30,"sc":9,"sl":30},{"el":31,"sc":9,"sl":31},{"el":33,"sc":9,"sl":32}],"name":"TestPOJOPropertiesCollector.SimpleGetterVisibility","sl":29},{"el":44,"id":41699,"methods":[{"el":40,"sc":9,"sl":40},{"el":43,"sc":9,"sl":42}],"name":"TestPOJOPropertiesCollector.Empty","sl":37},{"el":54,"id":41703,"methods":[{"el":51,"sc":9,"sl":50},{"el":53,"sc":9,"sl":53}],"name":"TestPOJOPropertiesCollector.IgnoredSetter","sl":46},{"el":60,"id":41707,"methods":[{"el":58,"sc":9,"sl":58}],"name":"TestPOJOPropertiesCollector.ImplicitIgnores","sl":56},{"el":66,"id":41708,"methods":[{"el":64,"sc":9,"sl":64},{"el":65,"sc":9,"sl":65}],"name":"TestPOJOPropertiesCollector.IgnoredRenamedSetter","sl":63},{"el":76,"id":41710,"methods":[{"el":73,"sc":9,"sl":73},{"el":75,"sc":9,"sl":75}],"name":"TestPOJOPropertiesCollector.RenamedProperties","sl":69},{"el":83,"id":41714,"methods":[{"el":81,"sc":9,"sl":80},{"el":82,"sc":9,"sl":82}],"name":"TestPOJOPropertiesCollector.RenamedProperties2","sl":78},{"el":91,"id":41717,"methods":[{"el":90,"sc":9,"sl":89}],"name":"TestPOJOPropertiesCollector.MergedProperties","sl":86},{"el":102,"id":41719,"methods":[{"el":100,"sc":9,"sl":100},{"el":101,"sc":9,"sl":101}],"name":"TestPOJOPropertiesCollector.SortedProperties","sl":95},{"el":114,"id":41721,"methods":[{"el":110,"sc":9,"sl":109},{"el":113,"sc":9,"sl":113}],"name":"TestPOJOPropertiesCollector.TypeTestBean","sl":105},{"el":125,"id":41724,"methods":[{"el":122,"sc":9,"sl":120},{"el":124,"sc":9,"sl":124}],"name":"TestPOJOPropertiesCollector.Jackson703","sl":116},{"el":142,"id":41728,"methods":[{"el":135,"sc":9,"sl":133},{"el":137,"sc":9,"sl":137},{"el":139,"sc":9,"sl":139},{"el":141,"sc":9,"sl":141}],"name":"TestPOJOPropertiesCollector.FoodOrgLocation","sl":127},{"el":151,"id":41734,"methods":[{"el":148,"sc":9,"sl":148},{"el":150,"sc":9,"sl":150}],"name":"TestPOJOPropertiesCollector.Location","sl":144},{"el":160,"id":41736,"methods":[{"el":157,"sc":9,"sl":157},{"el":159,"sc":9,"sl":159}],"name":"TestPOJOPropertiesCollector.Issue701Bean","sl":153},{"el":183,"id":41740,"methods":[{"el":170,"sc":9,"sl":166},{"el":174,"sc":9,"sl":172},{"el":177,"sc":9,"sl":176},{"el":182,"sc":9,"sl":179}],"name":"TestPOJOPropertiesCollector.Issue744Bean","sl":162}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1009":{"methods":[{"sl":193},{"sl":405}],"name":"testSimple","pass":true,"statements":[{"sl":195},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":408},{"sl":410},{"sl":411}]},"test_101":{"methods":[{"sl":298},{"sl":405}],"name":"testSimpleIgnoreAndRename","pass":true,"statements":[{"sl":300},{"sl":302},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":307},{"sl":308},{"sl":408},{"sl":410},{"sl":411}]},"test_1249":{"methods":[{"sl":235},{"sl":405}],"name":"testEmpty","pass":true,"statements":[{"sl":237},{"sl":239},{"sl":240},{"sl":408},{"sl":410},{"sl":411}]},"test_1259":{"methods":[{"sl":272},{"sl":405}],"name":"testSimpleRenamed2","pass":true,"statements":[{"sl":274},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":408},{"sl":410},{"sl":411}]},"test_1286":{"methods":[{"sl":367}],"name":"testInnerClassWithAnnotationsInCreator","pass":true,"statements":[{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":375}]},"test_1388":{"methods":[{"sl":334},{"sl":405}],"name":"testSimpleOrderingForDeserialization","pass":true,"statements":[{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":340},{"sl":341},{"sl":342},{"sl":408},{"sl":410},{"sl":414}]},"test_1389":{"methods":[{"sl":321},{"sl":405}],"name":"testCollectionOfIgnored","pass":true,"statements":[{"sl":323},{"sl":325},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":408},{"sl":410},{"sl":414}]},"test_1390":{"methods":[{"sl":391}],"name":"testJackson744","pass":true,"statements":[{"sl":393},{"sl":394},{"sl":395},{"sl":396}]},"test_1485":{"methods":[{"sl":298},{"sl":405}],"name":"testSimpleIgnoreAndRename","pass":true,"statements":[{"sl":300},{"sl":302},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":307},{"sl":308},{"sl":408},{"sl":410},{"sl":411}]},"test_1517":{"methods":[{"sl":311},{"sl":405}],"name":"testGlobalVisibilityForGetters","pass":true,"statements":[{"sl":313},{"sl":314},{"sl":315},{"sl":317},{"sl":318},{"sl":408},{"sl":410},{"sl":411}]},"test_1540":{"methods":[{"sl":246},{"sl":405}],"name":"testPartialIgnore","pass":true,"statements":[{"sl":248},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":408},{"sl":410},{"sl":411}]},"test_1596":{"methods":[{"sl":246},{"sl":405}],"name":"testPartialIgnore","pass":true,"statements":[{"sl":248},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":408},{"sl":410},{"sl":411}]},"test_161":{"methods":[{"sl":334},{"sl":405}],"name":"testSimpleOrderingForDeserialization","pass":true,"statements":[{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":340},{"sl":341},{"sl":342},{"sl":408},{"sl":410},{"sl":414}]},"test_1670":{"methods":[{"sl":206},{"sl":405}],"name":"testSimpleFieldVisibility","pass":true,"statements":[{"sl":209},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":408},{"sl":410},{"sl":414}]},"test_1972":{"methods":[{"sl":120},{"sl":124},{"sl":133},{"sl":141},{"sl":148},{"sl":378}],"name":"testJackson703","pass":true,"statements":[{"sl":121},{"sl":124},{"sl":134},{"sl":141},{"sl":381},{"sl":382},{"sl":383},{"sl":384},{"sl":386},{"sl":387},{"sl":388}]},"test_2025":{"methods":[{"sl":259},{"sl":405}],"name":"testSimpleRenamed","pass":true,"statements":[{"sl":261},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":408},{"sl":410},{"sl":411}]},"test_2122":{"methods":[{"sl":345},{"sl":405}],"name":"testSimpleWithType","pass":true,"statements":[{"sl":348},{"sl":349},{"sl":350},{"sl":351},{"sl":352},{"sl":353},{"sl":354},{"sl":357},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363},{"sl":408},{"sl":410},{"sl":411},{"sl":414}]},"test_2167":{"methods":[{"sl":311},{"sl":405}],"name":"testGlobalVisibilityForGetters","pass":true,"statements":[{"sl":313},{"sl":314},{"sl":315},{"sl":317},{"sl":318},{"sl":408},{"sl":410},{"sl":411}]},"test_281":{"methods":[{"sl":391}],"name":"testJackson744","pass":true,"statements":[{"sl":393},{"sl":394},{"sl":395},{"sl":396}]},"test_31":{"methods":[{"sl":272},{"sl":405}],"name":"testSimpleRenamed2","pass":true,"statements":[{"sl":274},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":408},{"sl":410},{"sl":411}]},"test_318":{"methods":[{"sl":285},{"sl":405}],"name":"testMergeWithRename","pass":true,"statements":[{"sl":287},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":408},{"sl":410},{"sl":411}]},"test_337":{"methods":[{"sl":321},{"sl":405}],"name":"testCollectionOfIgnored","pass":true,"statements":[{"sl":323},{"sl":325},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":408},{"sl":410},{"sl":414}]},"test_378":{"methods":[{"sl":367}],"name":"testInnerClassWithAnnotationsInCreator","pass":true,"statements":[{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":375}]},"test_399":{"methods":[{"sl":120},{"sl":124},{"sl":133},{"sl":141},{"sl":148},{"sl":378}],"name":"testJackson703","pass":true,"statements":[{"sl":121},{"sl":124},{"sl":134},{"sl":141},{"sl":381},{"sl":382},{"sl":383},{"sl":384},{"sl":386},{"sl":387},{"sl":388}]},"test_430":{"methods":[{"sl":220},{"sl":405}],"name":"testSimpleGetterVisibility","pass":true,"statements":[{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":408},{"sl":410},{"sl":411}]},"test_497":{"methods":[{"sl":285},{"sl":405}],"name":"testMergeWithRename","pass":true,"statements":[{"sl":287},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":408},{"sl":410},{"sl":411}]},"test_596":{"methods":[{"sl":259},{"sl":405}],"name":"testSimpleRenamed","pass":true,"statements":[{"sl":261},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":408},{"sl":410},{"sl":411}]},"test_633":{"methods":[{"sl":220},{"sl":405}],"name":"testSimpleGetterVisibility","pass":true,"statements":[{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":408},{"sl":410},{"sl":411}]},"test_639":{"methods":[{"sl":345},{"sl":405}],"name":"testSimpleWithType","pass":true,"statements":[{"sl":348},{"sl":349},{"sl":350},{"sl":351},{"sl":352},{"sl":353},{"sl":354},{"sl":357},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363},{"sl":408},{"sl":410},{"sl":411},{"sl":414}]},"test_654":{"methods":[{"sl":193},{"sl":405}],"name":"testSimple","pass":true,"statements":[{"sl":195},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":408},{"sl":410},{"sl":411}]},"test_8":{"methods":[{"sl":235},{"sl":405}],"name":"testEmpty","pass":true,"statements":[{"sl":237},{"sl":239},{"sl":240},{"sl":408},{"sl":410},{"sl":411}]},"test_870":{"methods":[{"sl":206},{"sl":405}],"name":"testSimpleFieldVisibility","pass":true,"statements":[{"sl":209},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":408},{"sl":410},{"sl":414}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1972, 399], [1972, 399], [], [], [1972, 399], [], [], [], [], [], [], [], [], [1972, 399], [1972, 399], [], [], [], [], [], [], [1972, 399], [], [], [], [], [], [], [1972, 399], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1009, 654], [], [1009, 654], [], [1009, 654], [1009, 654], [1009, 654], [1009, 654], [1009, 654], [1009, 654], [1009, 654], [], [], [870, 1670], [], [], [870, 1670], [], [870, 1670], [870, 1670], [870, 1670], [870, 1670], [870, 1670], [870, 1670], [870, 1670], [], [], [430, 633], [], [430, 633], [], [430, 633], [430, 633], [430, 633], [430, 633], [430, 633], [430, 633], [430, 633], [], [], [], [], [8, 1249], [], [8, 1249], [], [8, 1249], [8, 1249], [], [], [], [], [], [1540, 1596], [], [1540, 1596], [], [1540, 1596], [1540, 1596], [1540, 1596], [1540, 1596], [1540, 1596], [1540, 1596], [1540, 1596], [], [], [596, 2025], [], [596, 2025], [], [596, 2025], [596, 2025], [596, 2025], [596, 2025], [596, 2025], [596, 2025], [596, 2025], [], [], [1259, 31], [], [1259, 31], [], [1259, 31], [1259, 31], [1259, 31], [1259, 31], [1259, 31], [1259, 31], [1259, 31], [], [], [497, 318], [], [497, 318], [], [497, 318], [497, 318], [497, 318], [497, 318], [497, 318], [497, 318], [497, 318], [], [], [1485, 101], [], [1485, 101], [], [1485, 101], [1485, 101], [1485, 101], [1485, 101], [1485, 101], [1485, 101], [1485, 101], [], [], [1517, 2167], [], [1517, 2167], [1517, 2167], [1517, 2167], [], [1517, 2167], [1517, 2167], [], [], [1389, 337], [], [1389, 337], [], [1389, 337], [1389, 337], [], [1389, 337], [1389, 337], [1389, 337], [1389, 337], [], [], [161, 1388], [], [161, 1388], [161, 1388], [161, 1388], [161, 1388], [161, 1388], [161, 1388], [161, 1388], [], [], [639, 2122], [], [], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [], [], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [639, 2122], [], [], [], [378, 1286], [], [378, 1286], [], [378, 1286], [378, 1286], [], [378, 1286], [378, 1286], [], [], [1972, 399], [], [], [1972, 399], [1972, 399], [1972, 399], [1972, 399], [], [1972, 399], [1972, 399], [1972, 399], [], [], [1390, 281], [], [1390, 281], [1390, 281], [1390, 281], [1390, 281], [], [], [], [], [], [], [], [], [870, 1517, 1009, 1485, 161, 596, 639, 8, 2167, 497, 1540, 654, 1259, 1389, 1670, 31, 101, 337, 1388, 430, 2025, 633, 1249, 2122, 1596, 318], [], [], [870, 1517, 1009, 1485, 161, 596, 639, 8, 2167, 497, 1540, 654, 1259, 1389, 1670, 31, 101, 337, 1388, 430, 2025, 633, 1249, 2122, 1596, 318], [], [870, 1517, 1009, 1485, 161, 596, 639, 8, 2167, 497, 1540, 654, 1259, 1389, 1670, 31, 101, 337, 1388, 430, 2025, 633, 1249, 2122, 1596, 318], [1517, 1009, 1485, 596, 639, 8, 2167, 497, 1540, 654, 1259, 31, 101, 430, 2025, 633, 1249, 2122, 1596, 318], [], [], [870, 161, 639, 1389, 1670, 337, 1388, 2122], [], [], []]