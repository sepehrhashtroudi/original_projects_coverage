var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":260,"id":38552,"methods":[{"el":174,"sc":5,"sl":167},{"el":181,"sc":5,"sl":176},{"el":189,"sc":5,"sl":184},{"el":202,"sc":5,"sl":195},{"el":213,"sc":5,"sl":208},{"el":227,"sc":5,"sl":219},{"el":236,"sc":5,"sl":229},{"el":251,"sc":5,"sl":238},{"el":259,"sc":5,"sl":253}],"name":"TestAnnotations","sl":17},{"el":36,"id":38552,"methods":[{"el":29,"sc":9,"sl":29},{"el":30,"sc":9,"sl":30},{"el":32,"sc":9,"sl":32},{"el":35,"sc":9,"sl":35}],"name":"TestAnnotations.SizeClassGetter","sl":27},{"el":43,"id":38560,"methods":[{"el":42,"sc":9,"sl":42}],"name":"TestAnnotations.SizeClassGetter2","sl":39},{"el":50,"id":38562,"methods":[{"el":49,"sc":9,"sl":49}],"name":"TestAnnotations.SizeClassGetter3","sl":46},{"el":59,"id":38564,"methods":[],"name":"TestAnnotations.ClassSerializer","sl":58},{"el":72,"id":38564,"methods":[{"el":68,"sc":9,"sl":68},{"el":71,"sc":9,"sl":70}],"name":"TestAnnotations.ClassMethodSerializer","sl":65},{"el":86,"id":38568,"methods":[{"el":81,"sc":9,"sl":81},{"el":85,"sc":9,"sl":84}],"name":"TestAnnotations.InactiveClassMethodSerializer","sl":78},{"el":96,"id":38572,"methods":[{"el":93,"sc":9,"sl":93},{"el":95,"sc":9,"sl":94}],"name":"TestAnnotations.BaseBean","sl":92},{"el":100,"id":38576,"methods":[{"el":99,"sc":9,"sl":99}],"name":"TestAnnotations.SubClassBean","sl":98},{"el":123,"id":38578,"methods":[{"el":109,"sc":9,"sl":108},{"el":112,"sc":9,"sl":112},{"el":115,"sc":9,"sl":115},{"el":118,"sc":9,"sl":118},{"el":119,"sc":9,"sl":119},{"el":122,"sc":9,"sl":122}],"name":"TestAnnotations.GettersWithoutSetters","sl":104},{"el":130,"id":38588,"methods":[{"el":129,"sc":9,"sl":128}],"name":"TestAnnotations.GettersWithoutSetters2","sl":126},{"el":146,"id":38590,"methods":[{"el":145,"sc":9,"sl":140}],"name":"TestAnnotations.BogusSerializer","sl":138},{"el":157,"id":38592,"methods":[{"el":155,"sc":9,"sl":150}],"name":"TestAnnotations.StringSerializer","sl":148}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1091":{"methods":[{"sl":68},{"sl":70},{"sl":150},{"sl":219}],"name":"testActiveMethodSerializer","pass":true,"statements":[{"sl":68},{"sl":71},{"sl":154},{"sl":221},{"sl":222},{"sl":226}]},"test_1177":{"methods":[{"sl":140},{"sl":208}],"name":"testClassSerializer","pass":true,"statements":[{"sl":144},{"sl":210},{"sl":211},{"sl":212}]},"test_1308":{"methods":[{"sl":108},{"sl":112},{"sl":115},{"sl":118},{"sl":122},{"sl":238}],"name":"testGettersWithoutSetters","pass":true,"statements":[{"sl":112},{"sl":115},{"sl":118},{"sl":122},{"sl":240},{"sl":241},{"sl":242},{"sl":245},{"sl":248},{"sl":249},{"sl":250}]},"test_139":{"methods":[{"sl":128},{"sl":253}],"name":"testGettersWithoutSettersOverride","pass":true,"statements":[{"sl":129},{"sl":255},{"sl":256},{"sl":257},{"sl":258}]},"test_1392":{"methods":[{"sl":29},{"sl":30},{"sl":32},{"sl":167}],"name":"testSimpleGetter","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":32},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173}]},"test_1397":{"methods":[{"sl":93},{"sl":94},{"sl":99},{"sl":195}],"name":"testGetterInheritance","pass":true,"statements":[{"sl":93},{"sl":95},{"sl":99},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201}]},"test_1412":{"methods":[{"sl":29},{"sl":30},{"sl":32},{"sl":167}],"name":"testSimpleGetter","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":32},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173}]},"test_1704":{"methods":[{"sl":81},{"sl":84},{"sl":229}],"name":"testInactiveMethodSerializer","pass":true,"statements":[{"sl":81},{"sl":85},{"sl":231},{"sl":235}]},"test_1709":{"methods":[{"sl":128},{"sl":253}],"name":"testGettersWithoutSettersOverride","pass":true,"statements":[{"sl":129},{"sl":255},{"sl":256},{"sl":257},{"sl":258}]},"test_1822":{"methods":[{"sl":68},{"sl":70},{"sl":150},{"sl":219}],"name":"testActiveMethodSerializer","pass":true,"statements":[{"sl":68},{"sl":71},{"sl":154},{"sl":221},{"sl":222},{"sl":226}]},"test_1924":{"methods":[{"sl":42},{"sl":176}],"name":"testSimpleGetter2","pass":true,"statements":[{"sl":42},{"sl":178},{"sl":179},{"sl":180}]},"test_1940":{"methods":[{"sl":140},{"sl":208}],"name":"testClassSerializer","pass":true,"statements":[{"sl":144},{"sl":210},{"sl":211},{"sl":212}]},"test_2011":{"methods":[{"sl":42},{"sl":176}],"name":"testSimpleGetter2","pass":true,"statements":[{"sl":42},{"sl":178},{"sl":179},{"sl":180}]},"test_2157":{"methods":[{"sl":49},{"sl":184}],"name":"testSimpleGetter3","pass":true,"statements":[{"sl":49},{"sl":186},{"sl":187},{"sl":188}]},"test_260":{"methods":[{"sl":81},{"sl":84},{"sl":229}],"name":"testInactiveMethodSerializer","pass":true,"statements":[{"sl":81},{"sl":85},{"sl":231},{"sl":235}]},"test_516":{"methods":[{"sl":93},{"sl":94},{"sl":99},{"sl":195}],"name":"testGetterInheritance","pass":true,"statements":[{"sl":93},{"sl":95},{"sl":99},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201}]},"test_611":{"methods":[{"sl":49},{"sl":184}],"name":"testSimpleGetter3","pass":true,"statements":[{"sl":49},{"sl":186},{"sl":187},{"sl":188}]},"test_885":{"methods":[{"sl":108},{"sl":112},{"sl":115},{"sl":118},{"sl":122},{"sl":238}],"name":"testGettersWithoutSetters","pass":true,"statements":[{"sl":112},{"sl":115},{"sl":118},{"sl":122},{"sl":240},{"sl":241},{"sl":242},{"sl":245},{"sl":248},{"sl":249},{"sl":250}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1392, 1412], [1392, 1412], [], [1392, 1412], [], [], [], [], [], [], [], [], [], [1924, 2011], [], [], [], [], [], [], [2157, 611], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1822, 1091], [], [1822, 1091], [1822, 1091], [], [], [], [], [], [], [], [], [], [1704, 260], [], [], [1704, 260], [1704, 260], [], [], [], [], [], [], [], [516, 1397], [516, 1397], [516, 1397], [], [], [], [516, 1397], [], [], [], [], [], [], [], [], [1308, 885], [], [], [], [1308, 885], [], [], [1308, 885], [], [], [1308, 885], [], [], [], [1308, 885], [], [], [], [], [], [139, 1709], [139, 1709], [], [], [], [], [], [], [], [], [], [], [1940, 1177], [], [], [], [1940, 1177], [], [], [], [], [], [1822, 1091], [], [], [], [1822, 1091], [], [], [], [], [], [], [], [], [], [], [], [], [1392, 1412], [], [1392, 1412], [1392, 1412], [1392, 1412], [1392, 1412], [1392, 1412], [], [], [1924, 2011], [], [1924, 2011], [1924, 2011], [1924, 2011], [], [], [], [2157, 611], [], [2157, 611], [2157, 611], [2157, 611], [], [], [], [], [], [], [516, 1397], [], [516, 1397], [516, 1397], [516, 1397], [516, 1397], [516, 1397], [], [], [], [], [], [], [1940, 1177], [], [1940, 1177], [1940, 1177], [1940, 1177], [], [], [], [], [], [], [1822, 1091], [], [1822, 1091], [1822, 1091], [], [], [], [1822, 1091], [], [], [1704, 260], [], [1704, 260], [], [], [], [1704, 260], [], [], [1308, 885], [], [1308, 885], [1308, 885], [1308, 885], [], [], [1308, 885], [], [], [1308, 885], [1308, 885], [1308, 885], [], [], [139, 1709], [], [139, 1709], [139, 1709], [139, 1709], [139, 1709], [], []]