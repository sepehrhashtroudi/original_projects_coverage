var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":232,"id":61646,"methods":[{"el":66,"sc":5,"sl":64},{"el":70,"sc":5,"sl":68},{"el":74,"sc":5,"sl":72},{"el":85,"sc":5,"sl":76},{"el":96,"sc":5,"sl":87},{"el":102,"sc":5,"sl":99},{"el":116,"sc":5,"sl":105},{"el":130,"sc":5,"sl":119},{"el":141,"sc":5,"sl":133},{"el":151,"sc":5,"sl":143},{"el":184,"sc":5,"sl":153},{"el":195,"sc":5,"sl":187},{"el":204,"sc":5,"sl":197},{"el":215,"sc":5,"sl":207},{"el":230,"sc":5,"sl":218}],"name":"TestPeriodFormatter","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1316":{"methods":[{"sl":143}],"name":"testWithGetParseTypeMethods","pass":true,"statements":[{"sl":144},{"sl":145},{"sl":146},{"sl":148},{"sl":149},{"sl":150}]},"test_2733":{"methods":[{"sl":207}],"name":"testParseMutablePeriod_simple","pass":true,"statements":[{"sl":208},{"sl":209},{"sl":211},{"sl":212}]},"test_2776":{"methods":[{"sl":105}],"name":"testPrint_bufferMethods","pass":true,"statements":[{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":111},{"sl":112},{"sl":113}]},"test_3061":{"methods":[{"sl":187}],"name":"testParsePeriod_simple","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":191},{"sl":192}]},"test_3317":{"methods":[{"sl":197}],"name":"testParsePeriod_parseType","pass":true,"statements":[{"sl":198},{"sl":199},{"sl":200},{"sl":201}]},"test_378":{"methods":[{"sl":99}],"name":"testPrint_simple","pass":true,"statements":[{"sl":100},{"sl":101}]},"test_549":{"methods":[{"sl":153}],"name":"testPrinterParserMethods","pass":true,"statements":[{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":183}]},"test_87":{"methods":[{"sl":119}],"name":"testPrint_writerMethods","pass":true,"statements":[{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":125},{"sl":126},{"sl":127}]},"test_909":{"methods":[{"sl":133}],"name":"testWithGetLocaleMethods","pass":true,"statements":[{"sl":134},{"sl":135},{"sl":136},{"sl":138},{"sl":139},{"sl":140}]},"test_963":{"methods":[{"sl":218}],"name":"testParseInto_simple","pass":true,"statements":[{"sl":219},{"sl":220},{"sl":221},{"sl":222},{"sl":224},{"sl":225},{"sl":229}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [378], [378], [378], [], [], [], [2776], [2776], [2776], [2776], [2776], [], [2776], [2776], [2776], [], [], [], [], [], [87], [87], [87], [87], [87], [], [87], [87], [87], [], [], [], [], [], [909], [909], [909], [909], [], [909], [909], [909], [], [], [1316], [1316], [1316], [1316], [], [1316], [1316], [1316], [], [], [549], [549], [549], [549], [549], [549], [549], [549], [549], [], [549], [549], [549], [549], [549], [549], [549], [549], [], [], [], [549], [549], [549], [549], [549], [549], [549], [], [], [549], [], [], [], [3061], [3061], [3061], [], [3061], [3061], [], [], [], [], [3317], [3317], [3317], [3317], [3317], [], [], [], [], [], [2733], [2733], [2733], [], [2733], [2733], [], [], [], [], [], [963], [963], [963], [963], [963], [], [963], [963], [], [], [], [963], [], [], []]