var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":655,"id":49022,"methods":[{"el":65,"sc":5,"sl":63},{"el":69,"sc":5,"sl":67},{"el":73,"sc":5,"sl":71},{"el":79,"sc":5,"sl":75},{"el":85,"sc":5,"sl":81},{"el":100,"sc":5,"sl":88},{"el":105,"sc":5,"sl":102},{"el":117,"sc":5,"sl":107},{"el":126,"sc":5,"sl":119},{"el":138,"sc":5,"sl":128},{"el":147,"sc":5,"sl":140},{"el":159,"sc":5,"sl":149},{"el":168,"sc":5,"sl":161},{"el":176,"sc":5,"sl":170},{"el":200,"sc":5,"sl":178},{"el":258,"sc":5,"sl":218},{"el":282,"sc":5,"sl":261},{"el":306,"sc":5,"sl":285},{"el":330,"sc":5,"sl":309},{"el":340,"sc":5,"sl":333},{"el":346,"sc":5,"sl":342},{"el":355,"sc":5,"sl":348},{"el":365,"sc":5,"sl":357},{"el":374,"sc":5,"sl":368},{"el":382,"sc":5,"sl":376},{"el":390,"sc":5,"sl":384},{"el":397,"sc":5,"sl":392},{"el":406,"sc":5,"sl":400},{"el":414,"sc":5,"sl":408},{"el":422,"sc":5,"sl":416},{"el":428,"sc":5,"sl":424},{"el":436,"sc":5,"sl":430},{"el":447,"sc":5,"sl":439},{"el":457,"sc":5,"sl":449},{"el":467,"sc":5,"sl":459},{"el":478,"sc":5,"sl":470},{"el":488,"sc":5,"sl":480},{"el":498,"sc":5,"sl":490},{"el":509,"sc":5,"sl":501},{"el":522,"sc":5,"sl":512},{"el":535,"sc":5,"sl":524},{"el":546,"sc":5,"sl":538},{"el":557,"sc":5,"sl":549},{"el":567,"sc":5,"sl":559},{"el":582,"sc":5,"sl":570},{"el":597,"sc":5,"sl":585},{"el":618,"sc":5,"sl":600},{"el":624,"sc":5,"sl":621},{"el":631,"sc":5,"sl":627},{"el":641,"sc":5,"sl":634},{"el":648,"sc":5,"sl":644},{"el":654,"sc":5,"sl":651}],"name":"TestYearMonth_Basics","sl":40},{"el":215,"id":49120,"methods":[{"el":205,"sc":9,"sl":203},{"el":211,"sc":9,"sl":206},{"el":214,"sc":9,"sl":212}],"name":"TestYearMonth_Basics.MockYM","sl":202}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1029":{"methods":[{"sl":88}],"name":"testGet","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":96},{"sl":97}]},"test_1163":{"methods":[{"sl":512},{"sl":651}],"name":"testToDateTime_RI","pass":true,"statements":[{"sl":513},{"sl":514},{"sl":516},{"sl":517},{"sl":518},{"sl":519},{"sl":520},{"sl":521},{"sl":652},{"sl":653}]},"test_1252":{"methods":[{"sl":170}],"name":"testIsSupported","pass":true,"statements":[{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175}]},"test_1278":{"methods":[{"sl":161}],"name":"testGetValues","pass":true,"statements":[{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167}]},"test_132":{"methods":[{"sl":449}],"name":"testPlusYears_int","pass":true,"statements":[{"sl":450},{"sl":451},{"sl":452},{"sl":453},{"sl":455},{"sl":456}]},"test_1366":{"methods":[{"sl":408}],"name":"testWithFieldAdded_nullField_zero","pass":true,"statements":[{"sl":409},{"sl":410},{"sl":411}]},"test_1407":{"methods":[{"sl":261}],"name":"testIsEqual_YM","pass":true,"statements":[{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":269},{"sl":270},{"sl":271},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":278},{"sl":279}]},"test_1419":{"methods":[{"sl":439}],"name":"testPlus_RP","pass":true,"statements":[{"sl":440},{"sl":441},{"sl":442},{"sl":443},{"sl":445},{"sl":446}]},"test_1458":{"methods":[{"sl":392}],"name":"testWithField_same","pass":true,"statements":[{"sl":393},{"sl":394},{"sl":395},{"sl":396}]},"test_1562":{"methods":[{"sl":140}],"name":"testGetFields","pass":true,"statements":[{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146}]},"test_1659":{"methods":[{"sl":430}],"name":"testWithFieldAdded_unknownField","pass":true,"statements":[{"sl":431},{"sl":432},{"sl":433}]},"test_1742":{"methods":[{"sl":585}],"name":"testProperty","pass":true,"statements":[{"sl":586},{"sl":587},{"sl":588},{"sl":589},{"sl":590},{"sl":593},{"sl":594}]},"test_1898":{"methods":[{"sl":538},{"sl":651}],"name":"testToInterval","pass":true,"statements":[{"sl":539},{"sl":540},{"sl":541},{"sl":542},{"sl":543},{"sl":544},{"sl":545},{"sl":652},{"sl":653}]},"test_1961":{"methods":[{"sl":342}],"name":"testWithChronologyRetainFields_sameChrono","pass":true,"statements":[{"sl":343},{"sl":344},{"sl":345}]},"test_1998":{"methods":[{"sl":368}],"name":"testWithField","pass":true,"statements":[{"sl":369},{"sl":370},{"sl":372},{"sl":373}]},"test_2044":{"methods":[{"sl":357}],"name":"testWithChronologyRetainFields_invalidInNewChrono","pass":true,"statements":[{"sl":358},{"sl":359},{"sl":360}]},"test_2283":{"methods":[{"sl":644}],"name":"testToString_DTFormatter","pass":true,"statements":[{"sl":645},{"sl":646},{"sl":647}]},"test_2393":{"methods":[{"sl":128}],"name":"testGetField","pass":true,"statements":[{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":135},{"sl":136}]},"test_2401":{"methods":[{"sl":501}],"name":"testToLocalDate","pass":true,"statements":[{"sl":502},{"sl":503},{"sl":504},{"sl":505},{"sl":506}]},"test_2433":{"methods":[{"sl":570},{"sl":651}],"name":"testWithers","pass":true,"statements":[{"sl":571},{"sl":572},{"sl":573},{"sl":574},{"sl":575},{"sl":578},{"sl":579},{"sl":652},{"sl":653}]},"test_2534":{"methods":[{"sl":285}],"name":"testIsBefore_YM","pass":true,"statements":[{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":293},{"sl":294},{"sl":295},{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":302},{"sl":303}]},"test_2675":{"methods":[{"sl":549},{"sl":651}],"name":"testToInterval_Zone","pass":true,"statements":[{"sl":550},{"sl":551},{"sl":552},{"sl":553},{"sl":554},{"sl":555},{"sl":556},{"sl":652},{"sl":653}]},"test_2684":{"methods":[{"sl":309}],"name":"testIsAfter_YM","pass":true,"statements":[{"sl":310},{"sl":311},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":317},{"sl":318},{"sl":319},{"sl":321},{"sl":322},{"sl":323},{"sl":324},{"sl":326},{"sl":327}]},"test_2779":{"methods":[{"sl":376}],"name":"testWithField_nullField","pass":true,"statements":[{"sl":377},{"sl":378},{"sl":379}]},"test_2799":{"methods":[{"sl":107}],"name":"testGetFieldType","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":114},{"sl":115}]},"test_2813":{"methods":[{"sl":627}],"name":"testToString_String","pass":true,"statements":[{"sl":628},{"sl":629},{"sl":630}]},"test_2910":{"methods":[{"sl":400}],"name":"testWithFieldAdded","pass":true,"statements":[{"sl":401},{"sl":402},{"sl":404},{"sl":405}]},"test_2959":{"methods":[{"sl":178},{"sl":203},{"sl":206},{"sl":212}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":197},{"sl":198},{"sl":199},{"sl":204},{"sl":207},{"sl":213}]},"test_3033":{"methods":[{"sl":348},{"sl":651}],"name":"testWithChronologyRetainFields_nullChrono","pass":true,"statements":[{"sl":349},{"sl":350},{"sl":351},{"sl":352},{"sl":353},{"sl":354},{"sl":652},{"sl":653}]},"test_3632":{"methods":[{"sl":459}],"name":"testPlusMonths_int","pass":true,"statements":[{"sl":460},{"sl":461},{"sl":462},{"sl":463},{"sl":465},{"sl":466}]},"test_3728":{"methods":[{"sl":149}],"name":"testGetValue","pass":true,"statements":[{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":156},{"sl":157}]},"test_3779":{"methods":[{"sl":490}],"name":"testMinusMonths_int","pass":true,"statements":[{"sl":491},{"sl":492},{"sl":493},{"sl":494},{"sl":496},{"sl":497}]},"test_3902":{"methods":[{"sl":102}],"name":"testSize","pass":true,"statements":[{"sl":103},{"sl":104}]},"test_3959":{"methods":[{"sl":470}],"name":"testMinus_RP","pass":true,"statements":[{"sl":471},{"sl":472},{"sl":473},{"sl":474},{"sl":476},{"sl":477}]},"test_3961":{"methods":[{"sl":218}],"name":"testCompareTo","pass":true,"statements":[{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":226},{"sl":227},{"sl":228},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":235},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":246},{"sl":247},{"sl":250},{"sl":254},{"sl":255}]},"test_418":{"methods":[{"sl":600}],"name":"testSerialization","pass":true,"statements":[{"sl":601},{"sl":603},{"sl":604},{"sl":605},{"sl":606},{"sl":607},{"sl":609},{"sl":610},{"sl":611},{"sl":612},{"sl":614},{"sl":615},{"sl":616},{"sl":617}]},"test_562":{"methods":[{"sl":384}],"name":"testWithField_unknownField","pass":true,"statements":[{"sl":385},{"sl":386},{"sl":387}]},"test_650":{"methods":[{"sl":480}],"name":"testMinusYears_int","pass":true,"statements":[{"sl":481},{"sl":482},{"sl":483},{"sl":484},{"sl":486},{"sl":487}]},"test_711":{"methods":[{"sl":621}],"name":"testToString","pass":true,"statements":[{"sl":622},{"sl":623}]},"test_729":{"methods":[{"sl":634}],"name":"testToString_String_Locale","pass":true,"statements":[{"sl":635},{"sl":636},{"sl":637},{"sl":638},{"sl":639},{"sl":640}]},"test_743":{"methods":[{"sl":119}],"name":"testGetFieldTypes","pass":true,"statements":[{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125}]},"test_784":{"methods":[{"sl":416}],"name":"testWithFieldAdded_nullField_nonZero","pass":true,"statements":[{"sl":417},{"sl":418},{"sl":419}]},"test_801":{"methods":[{"sl":333},{"sl":651}],"name":"testWithChronologyRetainFields_Chrono","pass":true,"statements":[{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":652},{"sl":653}]},"test_823":{"methods":[{"sl":524},{"sl":651}],"name":"testToDateTime_nullRI","pass":true,"statements":[{"sl":525},{"sl":526},{"sl":527},{"sl":529},{"sl":530},{"sl":531},{"sl":532},{"sl":533},{"sl":534},{"sl":652},{"sl":653}]},"test_844":{"methods":[{"sl":424}],"name":"testWithFieldAdded_zero","pass":true,"statements":[{"sl":425},{"sl":426},{"sl":427}]},"test_950":{"methods":[{"sl":559},{"sl":651}],"name":"testToInterval_nullZone","pass":true,"statements":[{"sl":560},{"sl":561},{"sl":562},{"sl":563},{"sl":564},{"sl":565},{"sl":566},{"sl":652},{"sl":653}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1029], [1029], [1029], [1029], [1029], [1029], [], [], [1029], [1029], [], [], [], [], [3902], [3902], [3902], [], [], [2799], [2799], [2799], [2799], [2799], [2799], [], [2799], [2799], [], [], [], [743], [743], [743], [743], [743], [743], [743], [], [], [2393], [2393], [2393], [2393], [2393], [2393], [], [2393], [2393], [], [], [], [1562], [1562], [1562], [1562], [1562], [1562], [1562], [], [], [3728], [3728], [3728], [3728], [3728], [3728], [], [3728], [3728], [], [], [], [1278], [1278], [1278], [1278], [1278], [1278], [1278], [], [], [1252], [1252], [1252], [1252], [1252], [1252], [], [], [2959], [2959], [2959], [2959], [2959], [2959], [2959], [2959], [2959], [2959], [], [2959], [2959], [2959], [2959], [2959], [2959], [2959], [], [2959], [2959], [2959], [], [], [], [2959], [2959], [], [2959], [2959], [], [], [], [], [2959], [2959], [], [], [], [], [3961], [3961], [3961], [3961], [3961], [3961], [3961], [], [3961], [3961], [3961], [], [3961], [3961], [3961], [3961], [], [3961], [], [], [], [3961], [3961], [3961], [3961], [3961], [], [], [3961], [3961], [], [], [3961], [], [], [], [3961], [3961], [], [], [], [], [], [1407], [1407], [1407], [1407], [1407], [1407], [1407], [], [1407], [1407], [1407], [], [1407], [1407], [1407], [1407], [], [1407], [1407], [], [], [], [], [], [2534], [2534], [2534], [2534], [2534], [2534], [2534], [], [2534], [2534], [2534], [], [2534], [2534], [2534], [2534], [], [2534], [2534], [], [], [], [], [], [2684], [2684], [2684], [2684], [2684], [2684], [2684], [], [2684], [2684], [2684], [], [2684], [2684], [2684], [2684], [], [2684], [2684], [], [], [], [], [], [801], [801], [801], [801], [801], [801], [801], [], [], [1961], [1961], [1961], [1961], [], [], [3033], [3033], [3033], [3033], [3033], [3033], [3033], [], [], [2044], [2044], [2044], [2044], [], [], [], [], [], [], [], [1998], [1998], [1998], [], [1998], [1998], [], [], [2779], [2779], [2779], [2779], [], [], [], [], [562], [562], [562], [562], [], [], [], [], [1458], [1458], [1458], [1458], [1458], [], [], [], [2910], [2910], [2910], [], [2910], [2910], [], [], [1366], [1366], [1366], [1366], [], [], [], [], [784], [784], [784], [784], [], [], [], [], [844], [844], [844], [844], [], [], [1659], [1659], [1659], [1659], [], [], [], [], [], [1419], [1419], [1419], [1419], [1419], [], [1419], [1419], [], [], [132], [132], [132], [132], [132], [], [132], [132], [], [], [3632], [3632], [3632], [3632], [3632], [], [3632], [3632], [], [], [], [3959], [3959], [3959], [3959], [3959], [], [3959], [3959], [], [], [650], [650], [650], [650], [650], [], [650], [650], [], [], [3779], [3779], [3779], [3779], [3779], [], [3779], [3779], [], [], [], [2401], [2401], [2401], [2401], [2401], [2401], [], [], [], [], [], [1163], [1163], [1163], [], [1163], [1163], [1163], [1163], [1163], [1163], [], [], [823], [823], [823], [823], [], [823], [823], [823], [823], [823], [823], [], [], [], [1898], [1898], [1898], [1898], [1898], [1898], [1898], [1898], [], [], [], [2675], [2675], [2675], [2675], [2675], [2675], [2675], [2675], [], [], [950], [950], [950], [950], [950], [950], [950], [950], [], [], [], [2433], [2433], [2433], [2433], [2433], [2433], [], [], [2433], [2433], [], [], [], [], [], [1742], [1742], [1742], [1742], [1742], [1742], [], [], [1742], [1742], [], [], [], [], [], [418], [418], [], [418], [418], [418], [418], [418], [], [418], [418], [418], [418], [], [418], [418], [418], [418], [], [], [], [711], [711], [711], [], [], [], [2813], [2813], [2813], [2813], [], [], [], [729], [729], [729], [729], [729], [729], [729], [], [], [], [2283], [2283], [2283], [2283], [], [], [], [801, 950, 3033, 823, 1163, 1898, 2675, 2433], [801, 950, 3033, 823, 1163, 1898, 2675, 2433], [801, 950, 3033, 823, 1163, 1898, 2675, 2433], [], []]