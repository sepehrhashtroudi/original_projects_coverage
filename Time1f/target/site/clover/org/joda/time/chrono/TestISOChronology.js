var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":456,"id":51808,"methods":[{"el":63,"sc":5,"sl":61},{"el":67,"sc":5,"sl":65},{"el":71,"sc":5,"sl":69},{"el":81,"sc":5,"sl":73},{"el":91,"sc":5,"sl":83},{"el":97,"sc":5,"sl":94},{"el":102,"sc":5,"sl":99},{"el":109,"sc":5,"sl":104},{"el":118,"sc":5,"sl":112},{"el":125,"sc":5,"sl":120},{"el":134,"sc":5,"sl":127},{"el":141,"sc":5,"sl":136},{"el":224,"sc":5,"sl":144},{"el":279,"sc":5,"sl":226},{"el":306,"sc":5,"sl":281},{"el":339,"sc":5,"sl":308},{"el":372,"sc":5,"sl":341},{"el":390,"sc":5,"sl":374},{"el":407,"sc":5,"sl":392},{"el":427,"sc":5,"sl":409},{"el":436,"sc":5,"sl":429},{"el":443,"sc":5,"sl":438},{"el":454,"sc":5,"sl":445}],"name":"TestISOChronology","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1239":{"methods":[{"sl":374},{"sl":409}],"name":"testCutoverAddYears","pass":true,"statements":[{"sl":375},{"sl":376},{"sl":377},{"sl":378},{"sl":379},{"sl":380},{"sl":381},{"sl":382},{"sl":383},{"sl":384},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":410},{"sl":411},{"sl":412},{"sl":413},{"sl":415},{"sl":416},{"sl":417},{"sl":419},{"sl":422},{"sl":423},{"sl":424},{"sl":425}]},"test_1388":{"methods":[{"sl":226}],"name":"testDateFields","pass":true,"statements":[{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":254},{"sl":255},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":267},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278}]},"test_1420":{"methods":[{"sl":438}],"name":"testPartialDayOfYearAdd","pass":true,"statements":[{"sl":439},{"sl":440},{"sl":441},{"sl":442}]},"test_1590":{"methods":[{"sl":136}],"name":"testToString","pass":true,"statements":[{"sl":137},{"sl":138},{"sl":139},{"sl":140}]},"test_2296":{"methods":[{"sl":308}],"name":"testMaxYear","pass":true,"statements":[{"sl":309},{"sl":310},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":317},{"sl":318},{"sl":319},{"sl":321},{"sl":323},{"sl":324},{"sl":326},{"sl":327},{"sl":332},{"sl":333},{"sl":338}]},"test_2405":{"methods":[{"sl":392},{"sl":409}],"name":"testAddMonths","pass":true,"statements":[{"sl":393},{"sl":394},{"sl":395},{"sl":396},{"sl":397},{"sl":398},{"sl":399},{"sl":400},{"sl":401},{"sl":402},{"sl":403},{"sl":404},{"sl":405},{"sl":406},{"sl":410},{"sl":411},{"sl":412},{"sl":413},{"sl":415},{"sl":416},{"sl":417},{"sl":419},{"sl":422},{"sl":423},{"sl":424},{"sl":425}]},"test_2494":{"methods":[{"sl":445}],"name":"testMaximumValue","pass":true,"statements":[{"sl":446},{"sl":447},{"sl":448},{"sl":449},{"sl":450},{"sl":451},{"sl":452}]},"test_2629":{"methods":[{"sl":99}],"name":"testFactory","pass":true,"statements":[{"sl":100},{"sl":101}]},"test_2709":{"methods":[{"sl":120}],"name":"testWithUTC","pass":true,"statements":[{"sl":121},{"sl":122},{"sl":123},{"sl":124}]},"test_285":{"methods":[{"sl":429}],"name":"testTimeOfDayAdd","pass":true,"statements":[{"sl":430},{"sl":431},{"sl":432},{"sl":433},{"sl":434},{"sl":435}]},"test_2892":{"methods":[{"sl":341}],"name":"testMinYear","pass":true,"statements":[{"sl":342},{"sl":343},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":351},{"sl":352},{"sl":354},{"sl":356},{"sl":357},{"sl":359},{"sl":360},{"sl":365},{"sl":366},{"sl":371}]},"test_3230":{"methods":[{"sl":281}],"name":"testTimeFields","pass":true,"statements":[{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":295},{"sl":296},{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":305}]},"test_3249":{"methods":[{"sl":112}],"name":"testEquality","pass":true,"statements":[{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117}]},"test_3501":{"methods":[{"sl":104}],"name":"testFactory_Zone","pass":true,"statements":[{"sl":105},{"sl":106},{"sl":107},{"sl":108}]},"test_3939":{"methods":[{"sl":94}],"name":"testFactoryUTC","pass":true,"statements":[{"sl":95},{"sl":96}]},"test_409":{"methods":[{"sl":144}],"name":"testDurationFields","pass":true,"statements":[{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":223}]},"test_618":{"methods":[{"sl":127}],"name":"testWithZone","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3939], [3939], [3939], [], [], [2629], [2629], [2629], [], [], [3501], [3501], [3501], [3501], [3501], [], [], [], [3249], [3249], [3249], [3249], [3249], [3249], [], [], [2709], [2709], [2709], [2709], [2709], [], [], [618], [618], [618], [618], [618], [618], [618], [], [], [1590], [1590], [1590], [1590], [1590], [], [], [], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [409], [], [], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [1388], [], [], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [3230], [], [], [2296], [2296], [2296], [], [2296], [2296], [2296], [2296], [2296], [2296], [2296], [2296], [], [2296], [], [2296], [2296], [], [2296], [2296], [], [], [], [], [2296], [2296], [], [], [], [], [2296], [], [], [2892], [2892], [2892], [], [2892], [2892], [2892], [2892], [2892], [2892], [2892], [2892], [], [2892], [], [2892], [2892], [], [2892], [2892], [], [], [], [], [2892], [2892], [], [], [], [], [2892], [], [], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [1239], [], [], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [2405], [], [], [2405, 1239], [2405, 1239], [2405, 1239], [2405, 1239], [2405, 1239], [], [2405, 1239], [2405, 1239], [2405, 1239], [], [2405, 1239], [], [], [2405, 1239], [2405, 1239], [2405, 1239], [2405, 1239], [], [], [], [285], [285], [285], [285], [285], [285], [285], [], [], [1420], [1420], [1420], [1420], [1420], [], [], [2494], [2494], [2494], [2494], [2494], [2494], [2494], [2494], [], [], [], []]