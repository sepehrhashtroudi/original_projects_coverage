var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":380,"id":36233,"methods":[{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44},{"el":49,"sc":5,"sl":48},{"el":52,"sc":5,"sl":51},{"el":62,"sc":5,"sl":55},{"el":74,"sc":5,"sl":65},{"el":87,"sc":5,"sl":77},{"el":100,"sc":5,"sl":89},{"el":112,"sc":5,"sl":102},{"el":130,"sc":5,"sl":114},{"el":151,"sc":5,"sl":132},{"el":157,"sc":5,"sl":154},{"el":162,"sc":5,"sl":159},{"el":167,"sc":5,"sl":164},{"el":176,"sc":5,"sl":170},{"el":184,"sc":5,"sl":178},{"el":193,"sc":5,"sl":187},{"el":211,"sc":5,"sl":196},{"el":218,"sc":5,"sl":214},{"el":224,"sc":5,"sl":220},{"el":230,"sc":5,"sl":226},{"el":243,"sc":5,"sl":232},{"el":252,"sc":5,"sl":245},{"el":269,"sc":5,"sl":255},{"el":288,"sc":5,"sl":271},{"el":304,"sc":5,"sl":290},{"el":323,"sc":5,"sl":306},{"el":339,"sc":5,"sl":325},{"el":357,"sc":5,"sl":341},{"el":370,"sc":5,"sl":359},{"el":378,"sc":5,"sl":373}],"name":"TestMinutes","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1016":{"methods":[{"sl":102}],"name":"testFactory_minutesIn_RInterval","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_1101":{"methods":[{"sl":359}],"name":"testNegated","pass":true,"statements":[{"sl":360},{"sl":361},{"sl":362},{"sl":364},{"sl":365}]},"test_1146":{"methods":[{"sl":245}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":246},{"sl":247},{"sl":248},{"sl":250},{"sl":251}]},"test_1184":{"methods":[{"sl":255}],"name":"testPlus_int","pass":true,"statements":[{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":261},{"sl":263},{"sl":264}]},"test_1478":{"methods":[{"sl":220}],"name":"testToStandardDays","pass":true,"statements":[{"sl":221},{"sl":222},{"sl":223}]},"test_1497":{"methods":[{"sl":306}],"name":"testMinus_Minutes","pass":true,"statements":[{"sl":307},{"sl":308},{"sl":309},{"sl":310},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":317},{"sl":318}]},"test_1692":{"methods":[{"sl":187}],"name":"testToString","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":191},{"sl":192}]},"test_1856":{"methods":[{"sl":55}],"name":"testConstants","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_208":{"methods":[{"sl":178}],"name":"testIsLessThan","pass":true,"statements":[{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183}]},"test_248":{"methods":[{"sl":290}],"name":"testMinus_int","pass":true,"statements":[{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":296},{"sl":298},{"sl":299}]},"test_264":{"methods":[{"sl":132}],"name":"testFactory_parseMinutes_String","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":145},{"sl":146}]},"test_2771":{"methods":[{"sl":373}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":374},{"sl":375},{"sl":376},{"sl":377}]},"test_2814":{"methods":[{"sl":89}],"name":"testFactory_minutesBetween_RPartial","pass":true,"statements":[{"sl":90},{"sl":91},{"sl":92},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_291":{"methods":[{"sl":159}],"name":"testGetFieldType","pass":true,"statements":[{"sl":160},{"sl":161}]},"test_3031":{"methods":[{"sl":154}],"name":"testGetMethods","pass":true,"statements":[{"sl":155},{"sl":156}]},"test_3570":{"methods":[{"sl":226}],"name":"testToStandardHours","pass":true,"statements":[{"sl":227},{"sl":228},{"sl":229}]},"test_3669":{"methods":[{"sl":232}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":233},{"sl":234},{"sl":235},{"sl":237},{"sl":238}]},"test_3693":{"methods":[{"sl":325}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":332},{"sl":333},{"sl":334}]},"test_432":{"methods":[{"sl":65}],"name":"testFactory_minutes_int","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73}]},"test_465":{"methods":[{"sl":170}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175}]},"test_5":{"methods":[{"sl":164}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":165},{"sl":166}]},"test_524":{"methods":[{"sl":114}],"name":"testFactory_standardMinutesIn_RPeriod","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125}]},"test_775":{"methods":[{"sl":271}],"name":"testPlus_Minutes","pass":true,"statements":[{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":279},{"sl":280},{"sl":282},{"sl":283}]},"test_854":{"methods":[{"sl":77}],"name":"testFactory_minutesBetween_RInstant","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_870":{"methods":[{"sl":341}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":351},{"sl":352}]},"test_903":{"methods":[{"sl":196}],"name":"testSerialization","pass":true,"statements":[{"sl":197},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":210}]},"test_945":{"methods":[{"sl":214}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":215},{"sl":216},{"sl":217}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1856], [1856], [1856], [1856], [1856], [1856], [1856], [], [], [], [432], [432], [432], [432], [432], [432], [432], [432], [432], [], [], [], [854], [854], [854], [854], [], [854], [854], [854], [854], [854], [], [], [2814], [2814], [2814], [2814], [], [], [2814], [2814], [2814], [2814], [2814], [], [], [1016], [1016], [1016], [1016], [], [1016], [1016], [1016], [1016], [1016], [], [], [524], [524], [524], [524], [524], [524], [524], [524], [524], [524], [524], [524], [], [], [], [], [], [], [264], [264], [264], [264], [264], [264], [264], [264], [264], [], [], [], [], [264], [264], [], [], [], [], [], [], [], [3031], [3031], [3031], [], [], [291], [291], [291], [], [], [5], [5], [5], [], [], [], [465], [465], [465], [465], [465], [465], [], [], [208], [208], [208], [208], [208], [208], [], [], [], [1692], [1692], [1692], [], [1692], [1692], [], [], [], [903], [903], [], [903], [903], [903], [903], [903], [], [903], [903], [903], [903], [], [903], [], [], [], [945], [945], [945], [945], [], [], [1478], [1478], [1478], [1478], [], [], [3570], [3570], [3570], [3570], [], [], [3669], [3669], [3669], [3669], [], [3669], [3669], [], [], [], [], [], [], [1146], [1146], [1146], [1146], [], [1146], [1146], [], [], [], [1184], [1184], [1184], [1184], [1184], [], [1184], [], [1184], [1184], [], [], [], [], [], [], [775], [775], [775], [775], [775], [775], [775], [], [775], [775], [], [775], [775], [], [], [], [], [], [], [248], [248], [248], [248], [248], [], [248], [], [248], [248], [], [], [], [], [], [], [1497], [1497], [1497], [1497], [1497], [1497], [1497], [], [1497], [1497], [], [1497], [1497], [], [], [], [], [], [], [3693], [3693], [3693], [3693], [3693], [3693], [], [3693], [3693], [3693], [], [], [], [], [], [], [870], [870], [870], [870], [870], [870], [870], [870], [870], [], [870], [870], [], [], [], [], [], [], [1101], [1101], [1101], [1101], [], [1101], [1101], [], [], [], [], [], [], [], [2771], [2771], [2771], [2771], [2771], [], [], []]