var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":183,"id":42557,"methods":[{"el":123,"sc":5,"sl":85},{"el":154,"sc":5,"sl":131},{"el":163,"sc":5,"sl":160},{"el":173,"sc":5,"sl":165},{"el":182,"sc":5,"sl":176}],"name":"TestViewSerialization","sl":14},{"el":24,"id":42557,"methods":[],"name":"TestViewSerialization.ViewA","sl":24},{"el":25,"id":42557,"methods":[],"name":"TestViewSerialization.ViewAA","sl":25},{"el":26,"id":42557,"methods":[],"name":"TestViewSerialization.ViewB","sl":26},{"el":27,"id":42557,"methods":[],"name":"TestViewSerialization.ViewBB","sl":27},{"el":39,"id":42557,"methods":[{"el":38,"sc":9,"sl":37}],"name":"TestViewSerialization.Bean","sl":29},{"el":52,"id":42559,"methods":[{"el":51,"sc":9,"sl":51}],"name":"TestViewSerialization.MixedBean","sl":46},{"el":62,"id":42561,"methods":[],"name":"TestViewSerialization.ImplicitBean","sl":59},{"el":69,"id":42561,"methods":[],"name":"TestViewSerialization.VisibilityBean","sl":64},{"el":72,"id":42561,"methods":[],"name":"TestViewSerialization.WebView","sl":72},{"el":73,"id":42561,"methods":[],"name":"TestViewSerialization.OtherView","sl":73},{"el":77,"id":42561,"methods":[{"el":76,"sc":9,"sl":75}],"name":"TestViewSerialization.Foo","sl":74}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1072":{"methods":[{"sl":160}],"name":"testImplicitAutoDetection","pass":true,"statements":[{"sl":162}]},"test_1425":{"methods":[{"sl":165}],"name":"testVisibility","pass":true,"statements":[{"sl":167},{"sl":168},{"sl":170},{"sl":172}]},"test_1570":{"methods":[{"sl":75},{"sl":176}],"name":"test","pass":true,"statements":[{"sl":76},{"sl":178},{"sl":179},{"sl":180},{"sl":181}]},"test_1699":{"methods":[{"sl":75},{"sl":176}],"name":"test","pass":true,"statements":[{"sl":76},{"sl":178},{"sl":179},{"sl":180},{"sl":181}]},"test_1748":{"methods":[{"sl":51},{"sl":131}],"name":"testDefaultExclusion","pass":true,"statements":[{"sl":51},{"sl":134},{"sl":135},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":146},{"sl":147},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153}]},"test_181":{"methods":[{"sl":37},{"sl":85}],"name":"testSimple","pass":true,"statements":[{"sl":38},{"sl":88},{"sl":89},{"sl":91},{"sl":92},{"sl":93},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":111},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122}]},"test_191":{"methods":[{"sl":165}],"name":"testVisibility","pass":true,"statements":[{"sl":167},{"sl":168},{"sl":170},{"sl":172}]},"test_2007":{"methods":[{"sl":160}],"name":"testImplicitAutoDetection","pass":true,"statements":[{"sl":162}]},"test_400":{"methods":[{"sl":37},{"sl":85}],"name":"testSimple","pass":true,"statements":[{"sl":38},{"sl":88},{"sl":89},{"sl":91},{"sl":92},{"sl":93},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":111},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122}]},"test_56":{"methods":[{"sl":51},{"sl":131}],"name":"testDefaultExclusion","pass":true,"statements":[{"sl":51},{"sl":134},{"sl":135},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":146},{"sl":147},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [181, 400], [181, 400], [], [], [], [], [], [], [], [], [], [], [], [], [1748, 56], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1699, 1570], [1699, 1570], [], [], [], [], [], [], [], [], [181, 400], [], [], [181, 400], [181, 400], [], [181, 400], [181, 400], [181, 400], [], [], [181, 400], [181, 400], [181, 400], [181, 400], [181, 400], [], [], [181, 400], [181, 400], [181, 400], [181, 400], [181, 400], [181, 400], [], [], [181, 400], [181, 400], [181, 400], [181, 400], [181, 400], [], [], [181, 400], [181, 400], [181, 400], [181, 400], [181, 400], [], [], [], [], [], [], [], [], [1748, 56], [], [], [1748, 56], [1748, 56], [], [1748, 56], [], [1748, 56], [1748, 56], [1748, 56], [1748, 56], [1748, 56], [], [], [1748, 56], [1748, 56], [], [1748, 56], [1748, 56], [1748, 56], [1748, 56], [1748, 56], [], [], [], [], [], [], [2007, 1072], [], [2007, 1072], [], [], [191, 1425], [], [191, 1425], [191, 1425], [], [191, 1425], [], [191, 1425], [], [], [], [1699, 1570], [], [1699, 1570], [1699, 1570], [1699, 1570], [1699, 1570], [], []]