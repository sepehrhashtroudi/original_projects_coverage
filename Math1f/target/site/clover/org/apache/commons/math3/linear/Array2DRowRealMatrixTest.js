var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1172,"id":81296,"methods":[{"el":112,"sc":5,"sl":102},{"el":123,"sc":5,"sl":115},{"el":139,"sc":5,"sl":126},{"el":152,"sc":5,"sl":142},{"el":161,"sc":5,"sl":155},{"el":170,"sc":5,"sl":164},{"el":185,"sc":5,"sl":173},{"el":210,"sc":5,"sl":188},{"el":224,"sc":5,"sl":218},{"el":278,"sc":5,"sl":226},{"el":292,"sc":5,"sl":281},{"el":300,"sc":5,"sl":295},{"el":317,"sc":5,"sl":303},{"el":330,"sc":5,"sl":320},{"el":342,"sc":5,"sl":333},{"el":359,"sc":5,"sl":345},{"el":385,"sc":5,"sl":361},{"el":404,"sc":5,"sl":387},{"el":416,"sc":5,"sl":406},{"el":450,"sc":5,"sl":419},{"el":471,"sc":5,"sl":453},{"el":495,"sc":5,"sl":473},{"el":519,"sc":5,"sl":497},{"el":545,"sc":5,"sl":521},{"el":575,"sc":5,"sl":547},{"el":605,"sc":5,"sl":577},{"el":613,"sc":5,"sl":607},{"el":636,"sc":5,"sl":615},{"el":657,"sc":5,"sl":638},{"el":680,"sc":5,"sl":659},{"el":701,"sc":5,"sl":682},{"el":722,"sc":5,"sl":703},{"el":743,"sc":5,"sl":724},{"el":764,"sc":5,"sl":745},{"el":785,"sc":5,"sl":766},{"el":793,"sc":5,"sl":787},{"el":812,"sc":5,"sl":795},{"el":832,"sc":5,"sl":814},{"el":853,"sc":5,"sl":834},{"el":874,"sc":5,"sl":855},{"el":882,"sc":5,"sl":876},{"el":889,"sc":5,"sl":884},{"el":903,"sc":5,"sl":891},{"el":913,"sc":5,"sl":905},{"el":990,"sc":5,"sl":915},{"el":1076,"sc":5,"sl":992},{"el":1082,"sc":5,"sl":1078},{"el":1139,"sc":5,"sl":1107},{"el":1160,"sc":5,"sl":1142}],"name":"Array2DRowRealMatrixTest","sl":38},{"el":1090,"id":81928,"methods":[{"el":1089,"sc":9,"sl":1086}],"name":"Array2DRowRealMatrixTest.SetVisitor","sl":1085},{"el":1102,"id":81930,"methods":[{"el":1098,"sc":9,"sl":1094},{"el":1101,"sc":9,"sl":1099}],"name":"Array2DRowRealMatrixTest.GetVisitor","sl":1092}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]