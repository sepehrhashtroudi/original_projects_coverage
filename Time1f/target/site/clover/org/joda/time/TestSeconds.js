var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":370,"id":45791,"methods":[{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44},{"el":49,"sc":5,"sl":48},{"el":52,"sc":5,"sl":51},{"el":62,"sc":5,"sl":55},{"el":74,"sc":5,"sl":65},{"el":87,"sc":5,"sl":77},{"el":100,"sc":5,"sl":89},{"el":112,"sc":5,"sl":102},{"el":127,"sc":5,"sl":114},{"el":148,"sc":5,"sl":129},{"el":154,"sc":5,"sl":151},{"el":159,"sc":5,"sl":156},{"el":164,"sc":5,"sl":161},{"el":173,"sc":5,"sl":167},{"el":181,"sc":5,"sl":175},{"el":190,"sc":5,"sl":184},{"el":208,"sc":5,"sl":193},{"el":215,"sc":5,"sl":211},{"el":221,"sc":5,"sl":217},{"el":227,"sc":5,"sl":223},{"el":233,"sc":5,"sl":229},{"el":242,"sc":5,"sl":235},{"el":259,"sc":5,"sl":245},{"el":278,"sc":5,"sl":261},{"el":294,"sc":5,"sl":280},{"el":313,"sc":5,"sl":296},{"el":329,"sc":5,"sl":315},{"el":347,"sc":5,"sl":331},{"el":360,"sc":5,"sl":349},{"el":368,"sc":5,"sl":363}],"name":"TestSeconds","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":55}],"name":"testConstants","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61}]},"test_1035":{"methods":[{"sl":280}],"name":"testMinus_int","pass":true,"statements":[{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":286},{"sl":288},{"sl":289}]},"test_106":{"methods":[{"sl":235}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":236},{"sl":237},{"sl":238},{"sl":240},{"sl":241}]},"test_1104":{"methods":[{"sl":151}],"name":"testGetMethods","pass":true,"statements":[{"sl":152},{"sl":153}]},"test_1354":{"methods":[{"sl":331}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":341},{"sl":342}]},"test_1395":{"methods":[{"sl":261}],"name":"testPlus_Seconds","pass":true,"statements":[{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":269},{"sl":270},{"sl":272},{"sl":273}]},"test_1418":{"methods":[{"sl":217}],"name":"testToStandardDays","pass":true,"statements":[{"sl":218},{"sl":219},{"sl":220}]},"test_147":{"methods":[{"sl":315}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":316},{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":322},{"sl":323},{"sl":324}]},"test_2117":{"methods":[{"sl":65}],"name":"testFactory_seconds_int","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73}]},"test_2165":{"methods":[{"sl":229}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":230},{"sl":231},{"sl":232}]},"test_2312":{"methods":[{"sl":184}],"name":"testToString","pass":true,"statements":[{"sl":185},{"sl":186},{"sl":188},{"sl":189}]},"test_2705":{"methods":[{"sl":349}],"name":"testNegated","pass":true,"statements":[{"sl":350},{"sl":351},{"sl":352},{"sl":354},{"sl":355}]},"test_2943":{"methods":[{"sl":102}],"name":"testFactory_secondsIn_RInterval","pass":true,"statements":[{"sl":103},{"sl":104},{"sl":105},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":111}]},"test_2995":{"methods":[{"sl":77}],"name":"testFactory_secondsBetween_RInstant","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":80},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_3000":{"methods":[{"sl":175}],"name":"testIsLessThan","pass":true,"statements":[{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180}]},"test_3085":{"methods":[{"sl":129}],"name":"testFactory_parseSeconds_String","pass":true,"statements":[{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":142},{"sl":143}]},"test_387":{"methods":[{"sl":156}],"name":"testGetFieldType","pass":true,"statements":[{"sl":157},{"sl":158}]},"test_3957":{"methods":[{"sl":211}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":212},{"sl":213},{"sl":214}]},"test_4013":{"methods":[{"sl":245}],"name":"testPlus_int","pass":true,"statements":[{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":251},{"sl":253},{"sl":254}]},"test_4026":{"methods":[{"sl":223}],"name":"testToStandardHours","pass":true,"statements":[{"sl":224},{"sl":225},{"sl":226}]},"test_704":{"methods":[{"sl":114}],"name":"testFactory_standardSecondsIn_RPeriod","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122}]},"test_78":{"methods":[{"sl":167}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172}]},"test_79":{"methods":[{"sl":193}],"name":"testSerialization","pass":true,"statements":[{"sl":194},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207}]},"test_800":{"methods":[{"sl":89}],"name":"testFactory_secondsBetween_RPartial","pass":true,"statements":[{"sl":90},{"sl":91},{"sl":92},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99}]},"test_850":{"methods":[{"sl":296}],"name":"testMinus_Seconds","pass":true,"statements":[{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":301},{"sl":302},{"sl":304},{"sl":305},{"sl":307},{"sl":308}]},"test_890":{"methods":[{"sl":161}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":162},{"sl":163}]},"test_974":{"methods":[{"sl":363}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":364},{"sl":365},{"sl":366},{"sl":367}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [10], [10], [10], [10], [10], [10], [], [], [], [2117], [2117], [2117], [2117], [2117], [2117], [2117], [2117], [2117], [], [], [], [2995], [2995], [2995], [2995], [], [2995], [2995], [2995], [2995], [2995], [], [], [800], [800], [800], [800], [], [], [800], [800], [800], [800], [800], [], [], [2943], [2943], [2943], [2943], [], [2943], [2943], [2943], [2943], [2943], [], [], [704], [704], [704], [704], [704], [704], [704], [704], [704], [], [], [], [], [], [], [3085], [3085], [3085], [3085], [3085], [3085], [3085], [3085], [3085], [], [], [], [], [3085], [3085], [], [], [], [], [], [], [], [1104], [1104], [1104], [], [], [387], [387], [387], [], [], [890], [890], [890], [], [], [], [78], [78], [78], [78], [78], [78], [], [], [3000], [3000], [3000], [3000], [3000], [3000], [], [], [], [2312], [2312], [2312], [], [2312], [2312], [], [], [], [79], [79], [], [79], [79], [79], [79], [79], [], [79], [79], [79], [79], [], [79], [], [], [], [3957], [3957], [3957], [3957], [], [], [1418], [1418], [1418], [1418], [], [], [4026], [4026], [4026], [4026], [], [], [2165], [2165], [2165], [2165], [], [], [106], [106], [106], [106], [], [106], [106], [], [], [], [4013], [4013], [4013], [4013], [4013], [], [4013], [], [4013], [4013], [], [], [], [], [], [], [1395], [1395], [1395], [1395], [1395], [1395], [1395], [], [1395], [1395], [], [1395], [1395], [], [], [], [], [], [], [1035], [1035], [1035], [1035], [1035], [], [1035], [], [1035], [1035], [], [], [], [], [], [], [850], [850], [850], [850], [850], [850], [850], [], [850], [850], [], [850], [850], [], [], [], [], [], [], [147], [147], [147], [147], [147], [147], [], [147], [147], [147], [], [], [], [], [], [], [1354], [1354], [1354], [1354], [1354], [1354], [1354], [1354], [1354], [], [1354], [1354], [], [], [], [], [], [], [2705], [2705], [2705], [2705], [], [2705], [2705], [], [], [], [], [], [], [], [974], [974], [974], [974], [974], [], [], []]