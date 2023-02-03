var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":300,"id":52711,"methods":[{"el":53,"sc":5,"sl":51},{"el":57,"sc":5,"sl":55},{"el":61,"sc":5,"sl":59},{"el":71,"sc":5,"sl":63},{"el":81,"sc":5,"sl":73},{"el":87,"sc":5,"sl":84},{"el":92,"sc":5,"sl":89},{"el":99,"sc":5,"sl":94},{"el":114,"sc":5,"sl":101},{"el":123,"sc":5,"sl":117},{"el":130,"sc":5,"sl":125},{"el":139,"sc":5,"sl":132},{"el":147,"sc":5,"sl":141},{"el":216,"sc":5,"sl":150},{"el":271,"sc":5,"sl":218},{"el":298,"sc":5,"sl":273}],"name":"TestJulianChronology","sl":33}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1638":{"methods":[{"sl":132}],"name":"testWithZone","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138}]},"test_218":{"methods":[{"sl":273}],"name":"testTimeFields","pass":true,"statements":[{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":296},{"sl":297}]},"test_2184":{"methods":[{"sl":141}],"name":"testToString","pass":true,"statements":[{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146}]},"test_2911":{"methods":[{"sl":89}],"name":"testFactory","pass":true,"statements":[{"sl":90},{"sl":91}]},"test_3147":{"methods":[{"sl":101}],"name":"testFactory_Zone_int","pass":true,"statements":[{"sl":102},{"sl":103},{"sl":104},{"sl":106},{"sl":107},{"sl":110},{"sl":111}]},"test_3364":{"methods":[{"sl":218}],"name":"testDateFields","pass":true,"statements":[{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":257},{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":270}]},"test_3507":{"methods":[{"sl":84}],"name":"testFactoryUTC","pass":true,"statements":[{"sl":85},{"sl":86}]},"test_3772":{"methods":[{"sl":117}],"name":"testEquality","pass":true,"statements":[{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122}]},"test_864":{"methods":[{"sl":94}],"name":"testFactory_Zone","pass":true,"statements":[{"sl":95},{"sl":96},{"sl":97},{"sl":98}]},"test_917":{"methods":[{"sl":150}],"name":"testDurationFields","pass":true,"statements":[{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215}]},"test_967":{"methods":[{"sl":125}],"name":"testWithUTC","pass":true,"statements":[{"sl":126},{"sl":127},{"sl":128},{"sl":129}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3507], [3507], [3507], [], [], [2911], [2911], [2911], [], [], [864], [864], [864], [864], [864], [], [], [3147], [3147], [3147], [3147], [], [3147], [3147], [], [], [3147], [3147], [], [], [], [], [], [3772], [3772], [3772], [3772], [3772], [3772], [], [], [967], [967], [967], [967], [967], [], [], [1638], [1638], [1638], [1638], [1638], [1638], [1638], [], [], [2184], [2184], [2184], [2184], [2184], [2184], [], [], [], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [917], [], [], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [3364], [], [], [218], [218], [218], [218], [218], [218], [218], [218], [218], [218], [218], [218], [218], [], [218], [218], [218], [218], [218], [218], [218], [218], [218], [218], [218], [], [], []]