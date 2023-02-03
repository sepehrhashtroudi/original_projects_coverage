var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":442,"id":44188,"methods":[{"el":78,"sc":5,"sl":63},{"el":95,"sc":5,"sl":80},{"el":114,"sc":5,"sl":97},{"el":129,"sc":5,"sl":116},{"el":143,"sc":5,"sl":131},{"el":153,"sc":5,"sl":149},{"el":177,"sc":5,"sl":165},{"el":190,"sc":5,"sl":179},{"el":203,"sc":5,"sl":192},{"el":214,"sc":5,"sl":205},{"el":227,"sc":5,"sl":216},{"el":240,"sc":5,"sl":229},{"el":268,"sc":5,"sl":247},{"el":290,"sc":5,"sl":270},{"el":317,"sc":5,"sl":293},{"el":329,"sc":5,"sl":324},{"el":336,"sc":5,"sl":331},{"el":342,"sc":5,"sl":338},{"el":349,"sc":5,"sl":344},{"el":356,"sc":5,"sl":351},{"el":391,"sc":5,"sl":358},{"el":409,"sc":5,"sl":393},{"el":415,"sc":5,"sl":411},{"el":441,"sc":5,"sl":427}],"name":"TestSimpleTypes","sl":20},{"el":28,"id":44188,"methods":[{"el":27,"sc":9,"sl":27}],"name":"TestSimpleTypes.BooleanBean","sl":25},{"el":33,"id":44190,"methods":[{"el":32,"sc":9,"sl":32}],"name":"TestSimpleTypes.IntBean","sl":30},{"el":38,"id":44192,"methods":[{"el":37,"sc":9,"sl":37}],"name":"TestSimpleTypes.DoubleBean","sl":35},{"el":43,"id":44194,"methods":[{"el":42,"sc":9,"sl":42}],"name":"TestSimpleTypes.FloatBean","sl":40},{"el":53,"id":44196,"methods":[{"el":52,"sc":9,"sl":51}],"name":"TestSimpleTypes.IntBean2","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1007":{"methods":[{"sl":411}],"name":"testURI","pass":true,"statements":[{"sl":413},{"sl":414}]},"test_1031":{"methods":[{"sl":27},{"sl":63}],"name":"testBooleanPrimitive","pass":true,"statements":[{"sl":27},{"sl":66},{"sl":67},{"sl":69},{"sl":70},{"sl":71},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_1059":{"methods":[{"sl":37},{"sl":116}],"name":"testDoublePrimitiveNonNumeric","pass":true,"statements":[{"sl":37},{"sl":120},{"sl":121},{"sl":122},{"sl":125},{"sl":126},{"sl":127},{"sl":128}]},"test_1135":{"methods":[{"sl":331}],"name":"testNull","pass":true,"statements":[{"sl":334},{"sl":335}]},"test_1200":{"methods":[{"sl":192}],"name":"testShortWrapper","pass":true,"statements":[{"sl":194},{"sl":195},{"sl":198},{"sl":199},{"sl":201},{"sl":202}]},"test_1205":{"methods":[{"sl":37},{"sl":97}],"name":"testDoublePrimitive","pass":true,"statements":[{"sl":37},{"sl":101},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":107},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_127":{"methods":[{"sl":351}],"name":"testBigInteger","pass":true,"statements":[{"sl":353},{"sl":354},{"sl":355}]},"test_1281":{"methods":[{"sl":338}],"name":"testClass","pass":true,"statements":[{"sl":340},{"sl":341}]},"test_1306":{"methods":[{"sl":247}],"name":"testFloatWrapper","pass":true,"statements":[{"sl":250},{"sl":254},{"sl":255},{"sl":256},{"sl":258},{"sl":260},{"sl":261},{"sl":265},{"sl":266}]},"test_1314":{"methods":[{"sl":293}],"name":"testBase64Variants","pass":true,"statements":[{"sl":295},{"sl":298},{"sl":301},{"sl":302},{"sl":307},{"sl":310},{"sl":314}]},"test_1320":{"methods":[{"sl":324}],"name":"testSingleString","pass":true,"statements":[{"sl":326},{"sl":327},{"sl":328}]},"test_1385":{"methods":[{"sl":358}],"name":"testUUID","pass":true,"statements":[{"sl":360},{"sl":361},{"sl":366},{"sl":367},{"sl":368},{"sl":369},{"sl":372},{"sl":373},{"sl":374},{"sl":378},{"sl":379},{"sl":380},{"sl":381},{"sl":382},{"sl":383},{"sl":385},{"sl":387},{"sl":389},{"sl":390}]},"test_14":{"methods":[{"sl":411}],"name":"testURI","pass":true,"statements":[{"sl":413},{"sl":414}]},"test_1405":{"methods":[{"sl":192}],"name":"testShortWrapper","pass":true,"statements":[{"sl":194},{"sl":195},{"sl":198},{"sl":199},{"sl":201},{"sl":202}]},"test_1433":{"methods":[{"sl":324}],"name":"testSingleString","pass":true,"statements":[{"sl":326},{"sl":327},{"sl":328}]},"test_151":{"methods":[{"sl":32},{"sl":51},{"sl":149}],"name":"testIntWithOverride","pass":true,"statements":[{"sl":32},{"sl":52},{"sl":151},{"sl":152}]},"test_1522":{"methods":[{"sl":42},{"sl":131}],"name":"testFloatPrimitiveNonNumeric","pass":true,"statements":[{"sl":42},{"sl":134},{"sl":135},{"sl":136},{"sl":139},{"sl":140},{"sl":141},{"sl":142}]},"test_1531":{"methods":[{"sl":37},{"sl":97}],"name":"testDoublePrimitive","pass":true,"statements":[{"sl":37},{"sl":101},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":107},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_1556":{"methods":[{"sl":331}],"name":"testNull","pass":true,"statements":[{"sl":334},{"sl":335}]},"test_160":{"methods":[{"sl":165}],"name":"testBooleanWrapper","pass":true,"statements":[{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_1614":{"methods":[{"sl":27},{"sl":63}],"name":"testBooleanPrimitive","pass":true,"statements":[{"sl":27},{"sl":66},{"sl":67},{"sl":69},{"sl":70},{"sl":71},{"sl":74},{"sl":75},{"sl":76},{"sl":77}]},"test_1814":{"methods":[{"sl":229}],"name":"testLongWrapper","pass":true,"statements":[{"sl":231},{"sl":232},{"sl":235},{"sl":236},{"sl":238},{"sl":239}]},"test_1856":{"methods":[{"sl":216}],"name":"testIntWrapper","pass":true,"statements":[{"sl":218},{"sl":219},{"sl":222},{"sl":223},{"sl":225},{"sl":226}]},"test_1858":{"methods":[{"sl":37},{"sl":116}],"name":"testDoublePrimitiveNonNumeric","pass":true,"statements":[{"sl":37},{"sl":120},{"sl":121},{"sl":122},{"sl":125},{"sl":126},{"sl":127},{"sl":128}]},"test_1926":{"methods":[{"sl":427}],"name":"testSequenceOfInts","pass":true,"statements":[{"sl":429},{"sl":431},{"sl":432},{"sl":433},{"sl":434},{"sl":436},{"sl":437},{"sl":438},{"sl":439}]},"test_206":{"methods":[{"sl":32},{"sl":80}],"name":"testIntPrimitive","pass":true,"statements":[{"sl":32},{"sl":83},{"sl":84},{"sl":86},{"sl":87},{"sl":88},{"sl":91},{"sl":92},{"sl":93},{"sl":94}]},"test_2065":{"methods":[{"sl":351}],"name":"testBigInteger","pass":true,"statements":[{"sl":353},{"sl":354},{"sl":355}]},"test_2073":{"methods":[{"sl":229}],"name":"testLongWrapper","pass":true,"statements":[{"sl":231},{"sl":232},{"sl":235},{"sl":236},{"sl":238},{"sl":239}]},"test_2130":{"methods":[{"sl":179}],"name":"testByteWrapper","pass":true,"statements":[{"sl":181},{"sl":182},{"sl":185},{"sl":186},{"sl":188},{"sl":189}]},"test_2137":{"methods":[{"sl":247}],"name":"testFloatWrapper","pass":true,"statements":[{"sl":250},{"sl":254},{"sl":255},{"sl":256},{"sl":258},{"sl":260},{"sl":261},{"sl":265},{"sl":266}]},"test_2144":{"methods":[{"sl":165}],"name":"testBooleanWrapper","pass":true,"statements":[{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_220":{"methods":[{"sl":32},{"sl":80}],"name":"testIntPrimitive","pass":true,"statements":[{"sl":32},{"sl":83},{"sl":84},{"sl":86},{"sl":87},{"sl":88},{"sl":91},{"sl":92},{"sl":93},{"sl":94}]},"test_268":{"methods":[{"sl":338}],"name":"testClass","pass":true,"statements":[{"sl":340},{"sl":341}]},"test_37":{"methods":[{"sl":42},{"sl":131}],"name":"testFloatPrimitiveNonNumeric","pass":true,"statements":[{"sl":42},{"sl":134},{"sl":135},{"sl":136},{"sl":139},{"sl":140},{"sl":141},{"sl":142}]},"test_439":{"methods":[{"sl":393}],"name":"testURL","pass":true,"statements":[{"sl":395},{"sl":396},{"sl":399},{"sl":400},{"sl":401},{"sl":402},{"sl":405},{"sl":406},{"sl":407},{"sl":408}]},"test_467":{"methods":[{"sl":344}],"name":"testBigDecimal","pass":true,"statements":[{"sl":346},{"sl":347},{"sl":348}]},"test_483":{"methods":[{"sl":270}],"name":"testDoubleWrapper","pass":true,"statements":[{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":282},{"sl":283},{"sl":284},{"sl":287},{"sl":288}]},"test_515":{"methods":[{"sl":270}],"name":"testDoubleWrapper","pass":true,"statements":[{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":282},{"sl":283},{"sl":284},{"sl":287},{"sl":288}]},"test_54":{"methods":[{"sl":205}],"name":"testCharacterWrapper","pass":true,"statements":[{"sl":208},{"sl":209},{"sl":212},{"sl":213}]},"test_569":{"methods":[{"sl":344}],"name":"testBigDecimal","pass":true,"statements":[{"sl":346},{"sl":347},{"sl":348}]},"test_601":{"methods":[{"sl":293}],"name":"testBase64Variants","pass":true,"statements":[{"sl":295},{"sl":298},{"sl":301},{"sl":302},{"sl":307},{"sl":310},{"sl":314}]},"test_649":{"methods":[{"sl":393}],"name":"testURL","pass":true,"statements":[{"sl":395},{"sl":396},{"sl":399},{"sl":400},{"sl":401},{"sl":402},{"sl":405},{"sl":406},{"sl":407},{"sl":408}]},"test_67":{"methods":[{"sl":205}],"name":"testCharacterWrapper","pass":true,"statements":[{"sl":208},{"sl":209},{"sl":212},{"sl":213}]},"test_737":{"methods":[{"sl":216}],"name":"testIntWrapper","pass":true,"statements":[{"sl":218},{"sl":219},{"sl":222},{"sl":223},{"sl":225},{"sl":226}]},"test_898":{"methods":[{"sl":358}],"name":"testUUID","pass":true,"statements":[{"sl":360},{"sl":361},{"sl":366},{"sl":367},{"sl":368},{"sl":369},{"sl":372},{"sl":373},{"sl":374},{"sl":378},{"sl":379},{"sl":380},{"sl":381},{"sl":382},{"sl":383},{"sl":385},{"sl":387},{"sl":389},{"sl":390}]},"test_93":{"methods":[{"sl":32},{"sl":51},{"sl":149}],"name":"testIntWithOverride","pass":true,"statements":[{"sl":32},{"sl":52},{"sl":151},{"sl":152}]},"test_973":{"methods":[{"sl":427}],"name":"testSequenceOfInts","pass":true,"statements":[{"sl":429},{"sl":431},{"sl":432},{"sl":433},{"sl":434},{"sl":436},{"sl":437},{"sl":438},{"sl":439}]},"test_988":{"methods":[{"sl":179}],"name":"testByteWrapper","pass":true,"statements":[{"sl":181},{"sl":182},{"sl":185},{"sl":186},{"sl":188},{"sl":189}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1614, 1031], [], [], [], [], [220, 151, 206, 93], [], [], [], [], [1858, 1205, 1059, 1531], [], [], [], [], [1522, 37], [], [], [], [], [], [], [], [], [151, 93], [151, 93], [], [], [], [], [], [], [], [], [], [], [1614, 1031], [], [], [1614, 1031], [1614, 1031], [], [1614, 1031], [1614, 1031], [1614, 1031], [], [], [1614, 1031], [1614, 1031], [1614, 1031], [1614, 1031], [], [], [220, 206], [], [], [220, 206], [220, 206], [], [220, 206], [220, 206], [220, 206], [], [], [220, 206], [220, 206], [220, 206], [220, 206], [], [], [1205, 1531], [], [], [], [1205, 1531], [1205, 1531], [1205, 1531], [], [1205, 1531], [1205, 1531], [1205, 1531], [], [], [1205, 1531], [1205, 1531], [1205, 1531], [1205, 1531], [], [], [1858, 1059], [], [], [], [1858, 1059], [1858, 1059], [1858, 1059], [], [], [1858, 1059], [1858, 1059], [1858, 1059], [1858, 1059], [], [], [1522, 37], [], [], [1522, 37], [1522, 37], [1522, 37], [], [], [1522, 37], [1522, 37], [1522, 37], [1522, 37], [], [], [], [], [], [], [151, 93], [], [151, 93], [151, 93], [], [], [], [], [], [], [], [], [], [], [], [], [160, 2144], [], [160, 2144], [160, 2144], [160, 2144], [160, 2144], [], [], [160, 2144], [160, 2144], [160, 2144], [160, 2144], [], [], [988, 2130], [], [988, 2130], [988, 2130], [], [], [988, 2130], [988, 2130], [], [988, 2130], [988, 2130], [], [], [1200, 1405], [], [1200, 1405], [1200, 1405], [], [], [1200, 1405], [1200, 1405], [], [1200, 1405], [1200, 1405], [], [], [67, 54], [], [], [67, 54], [67, 54], [], [], [67, 54], [67, 54], [], [], [1856, 737], [], [1856, 737], [1856, 737], [], [], [1856, 737], [1856, 737], [], [1856, 737], [1856, 737], [], [], [1814, 2073], [], [1814, 2073], [1814, 2073], [], [], [1814, 2073], [1814, 2073], [], [1814, 2073], [1814, 2073], [], [], [], [], [], [], [], [2137, 1306], [], [], [2137, 1306], [], [], [], [2137, 1306], [2137, 1306], [2137, 1306], [], [2137, 1306], [], [2137, 1306], [2137, 1306], [], [], [], [2137, 1306], [2137, 1306], [], [], [], [515, 483], [], [], [515, 483], [], [], [], [515, 483], [515, 483], [515, 483], [], [], [515, 483], [515, 483], [515, 483], [], [], [515, 483], [515, 483], [], [], [], [], [1314, 601], [], [1314, 601], [], [], [1314, 601], [], [], [1314, 601], [1314, 601], [], [], [], [], [1314, 601], [], [], [1314, 601], [], [], [], [1314, 601], [], [], [], [], [], [], [], [], [], [1433, 1320], [], [1433, 1320], [1433, 1320], [1433, 1320], [], [], [1135, 1556], [], [], [1135, 1556], [1135, 1556], [], [], [268, 1281], [], [268, 1281], [268, 1281], [], [], [569, 467], [], [569, 467], [569, 467], [569, 467], [], [], [127, 2065], [], [127, 2065], [127, 2065], [127, 2065], [], [], [1385, 898], [], [1385, 898], [1385, 898], [], [], [], [], [1385, 898], [1385, 898], [1385, 898], [1385, 898], [], [], [1385, 898], [1385, 898], [1385, 898], [], [], [], [1385, 898], [1385, 898], [1385, 898], [1385, 898], [1385, 898], [1385, 898], [], [1385, 898], [], [1385, 898], [], [1385, 898], [1385, 898], [], [], [649, 439], [], [649, 439], [649, 439], [], [], [649, 439], [649, 439], [649, 439], [649, 439], [], [], [649, 439], [649, 439], [649, 439], [649, 439], [], [], [14, 1007], [], [14, 1007], [14, 1007], [], [], [], [], [], [], [], [], [], [], [], [], [1926, 973], [], [1926, 973], [], [1926, 973], [1926, 973], [1926, 973], [1926, 973], [], [1926, 973], [1926, 973], [1926, 973], [1926, 973], [], [], [], []]