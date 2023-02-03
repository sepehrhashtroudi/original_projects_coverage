var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1031,"id":72741,"methods":[{"el":144,"sc":5,"sl":142},{"el":155,"sc":5,"sl":152},{"el":166,"sc":5,"sl":164},{"el":179,"sc":5,"sl":176},{"el":194,"sc":5,"sl":192},{"el":212,"sc":5,"sl":209},{"el":594,"sc":5,"sl":227},{"el":970,"sc":5,"sl":610},{"el":979,"sc":5,"sl":977},{"el":992,"sc":5,"sl":990},{"el":1005,"sc":5,"sl":1003},{"el":1029,"sc":5,"sl":1014}],"name":"PiePlot3D","sl":122}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1022":{"methods":[{"sl":152},{"sl":1014}],"name":"testSerialization","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":1015},{"sl":1018},{"sl":1021},{"sl":1022},{"sl":1025},{"sl":1028}]},"test_1110":{"methods":[{"sl":152},{"sl":1014}],"name":"testSerialization2","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":1015},{"sl":1018},{"sl":1021},{"sl":1022},{"sl":1025},{"sl":1028}]},"test_1339":{"methods":[{"sl":152},{"sl":192},{"sl":227},{"sl":610},{"sl":990},{"sl":1003}],"name":"testNullValueInDataset","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":193},{"sl":232},{"sl":233},{"sl":235},{"sl":236},{"sl":241},{"sl":243},{"sl":244},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":252},{"sl":254},{"sl":256},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":274},{"sl":282},{"sl":286},{"sl":288},{"sl":290},{"sl":301},{"sl":302},{"sl":303},{"sl":306},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":316},{"sl":322},{"sl":323},{"sl":325},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":334},{"sl":335},{"sl":343},{"sl":358},{"sl":365},{"sl":367},{"sl":372},{"sl":373},{"sl":376},{"sl":377},{"sl":380},{"sl":381},{"sl":382},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":395},{"sl":396},{"sl":397},{"sl":398},{"sl":399},{"sl":401},{"sl":402},{"sl":406},{"sl":407},{"sl":408},{"sl":410},{"sl":412},{"sl":413},{"sl":420},{"sl":423},{"sl":425},{"sl":428},{"sl":431},{"sl":435},{"sl":438},{"sl":439},{"sl":440},{"sl":441},{"sl":442},{"sl":443},{"sl":445},{"sl":446},{"sl":448},{"sl":449},{"sl":452},{"sl":453},{"sl":454},{"sl":457},{"sl":458},{"sl":460},{"sl":461},{"sl":462},{"sl":464},{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":475},{"sl":478},{"sl":480},{"sl":482},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":488},{"sl":492},{"sl":493},{"sl":494},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":501},{"sl":502},{"sl":503},{"sl":504},{"sl":505},{"sl":506},{"sl":509},{"sl":513},{"sl":514},{"sl":515},{"sl":516},{"sl":517},{"sl":518},{"sl":519},{"sl":520},{"sl":521},{"sl":522},{"sl":525},{"sl":528},{"sl":531},{"sl":532},{"sl":534},{"sl":535},{"sl":536},{"sl":538},{"sl":542},{"sl":543},{"sl":544},{"sl":545},{"sl":546},{"sl":547},{"sl":548},{"sl":549},{"sl":550},{"sl":553},{"sl":576},{"sl":577},{"sl":581},{"sl":586},{"sl":590},{"sl":591},{"sl":592},{"sl":621},{"sl":629},{"sl":630},{"sl":631},{"sl":633},{"sl":636},{"sl":638},{"sl":640},{"sl":697},{"sl":698},{"sl":702},{"sl":703},{"sl":704},{"sl":705},{"sl":706},{"sl":709},{"sl":710},{"sl":714},{"sl":715},{"sl":716},{"sl":717},{"sl":718},{"sl":725},{"sl":779},{"sl":780},{"sl":784},{"sl":785},{"sl":786},{"sl":787},{"sl":788},{"sl":791},{"sl":792},{"sl":796},{"sl":797},{"sl":798},{"sl":799},{"sl":800},{"sl":991},{"sl":1004}]},"test_1417":{"methods":[{"sl":152},{"sl":192},{"sl":227},{"sl":610},{"sl":990},{"sl":1003}],"name":"testNullValueInDataset","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":193},{"sl":232},{"sl":233},{"sl":235},{"sl":236},{"sl":241},{"sl":243},{"sl":244},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":252},{"sl":254},{"sl":256},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":274},{"sl":282},{"sl":286},{"sl":288},{"sl":290},{"sl":301},{"sl":302},{"sl":303},{"sl":306},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":316},{"sl":322},{"sl":323},{"sl":325},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":334},{"sl":335},{"sl":343},{"sl":358},{"sl":365},{"sl":367},{"sl":372},{"sl":373},{"sl":376},{"sl":377},{"sl":380},{"sl":381},{"sl":382},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":395},{"sl":396},{"sl":397},{"sl":398},{"sl":399},{"sl":401},{"sl":402},{"sl":406},{"sl":407},{"sl":408},{"sl":410},{"sl":412},{"sl":413},{"sl":420},{"sl":423},{"sl":425},{"sl":428},{"sl":431},{"sl":435},{"sl":438},{"sl":439},{"sl":440},{"sl":441},{"sl":442},{"sl":443},{"sl":445},{"sl":446},{"sl":448},{"sl":449},{"sl":452},{"sl":453},{"sl":454},{"sl":457},{"sl":458},{"sl":460},{"sl":461},{"sl":462},{"sl":464},{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":475},{"sl":478},{"sl":480},{"sl":482},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":488},{"sl":492},{"sl":493},{"sl":494},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":501},{"sl":502},{"sl":503},{"sl":504},{"sl":505},{"sl":506},{"sl":509},{"sl":513},{"sl":514},{"sl":515},{"sl":516},{"sl":517},{"sl":518},{"sl":519},{"sl":520},{"sl":521},{"sl":522},{"sl":525},{"sl":528},{"sl":531},{"sl":532},{"sl":534},{"sl":535},{"sl":536},{"sl":538},{"sl":542},{"sl":543},{"sl":544},{"sl":545},{"sl":546},{"sl":547},{"sl":548},{"sl":549},{"sl":550},{"sl":553},{"sl":576},{"sl":577},{"sl":581},{"sl":586},{"sl":590},{"sl":591},{"sl":592},{"sl":621},{"sl":629},{"sl":630},{"sl":631},{"sl":633},{"sl":636},{"sl":638},{"sl":640},{"sl":697},{"sl":698},{"sl":702},{"sl":703},{"sl":704},{"sl":705},{"sl":706},{"sl":709},{"sl":710},{"sl":714},{"sl":715},{"sl":716},{"sl":717},{"sl":718},{"sl":725},{"sl":779},{"sl":780},{"sl":784},{"sl":785},{"sl":786},{"sl":787},{"sl":788},{"sl":791},{"sl":792},{"sl":796},{"sl":797},{"sl":798},{"sl":799},{"sl":800},{"sl":991},{"sl":1004}]},"test_1869":{"methods":[{"sl":1014}],"name":"testReplaceDatasetOnPieChart","pass":true,"statements":[{"sl":1015},{"sl":1016}]},"test_2246":{"methods":[{"sl":152},{"sl":1014}],"name":"testSerialization2","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":1015},{"sl":1018},{"sl":1021},{"sl":1022},{"sl":1025},{"sl":1028}]},"test_240":{"methods":[{"sl":142},{"sl":152},{"sl":176},{"sl":209},{"sl":1014}],"name":"testEquals","pass":true,"statements":[{"sl":143},{"sl":153},{"sl":154},{"sl":177},{"sl":178},{"sl":210},{"sl":211},{"sl":1015},{"sl":1018},{"sl":1021},{"sl":1022},{"sl":1023},{"sl":1025},{"sl":1026},{"sl":1028}]},"test_2503":{"methods":[{"sl":152},{"sl":1014}],"name":"testSerialization","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":1015},{"sl":1018},{"sl":1021},{"sl":1022},{"sl":1025},{"sl":1028}]},"test_3155":{"methods":[{"sl":152},{"sl":227}],"name":"testDrawWithNullDataset","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":232},{"sl":233},{"sl":235},{"sl":236},{"sl":241},{"sl":243},{"sl":244},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":252},{"sl":254},{"sl":256},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":274},{"sl":282},{"sl":286},{"sl":288},{"sl":290},{"sl":301},{"sl":302},{"sl":303},{"sl":306},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":316},{"sl":322},{"sl":323},{"sl":325},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339}]},"test_3797":{"methods":[{"sl":152},{"sl":227}],"name":"testDrawWithNullDataset","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":232},{"sl":233},{"sl":235},{"sl":236},{"sl":241},{"sl":243},{"sl":244},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":252},{"sl":254},{"sl":256},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":274},{"sl":282},{"sl":286},{"sl":288},{"sl":290},{"sl":301},{"sl":302},{"sl":303},{"sl":306},{"sl":311},{"sl":312},{"sl":314},{"sl":315},{"sl":316},{"sl":322},{"sl":323},{"sl":325},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339}]},"test_3873":{"methods":[{"sl":1014}],"name":"testReplaceDatasetOnPieChart","pass":true,"statements":[{"sl":1015},{"sl":1016}]},"test_529":{"methods":[{"sl":142},{"sl":152},{"sl":176},{"sl":209},{"sl":1014}],"name":"testEquals","pass":true,"statements":[{"sl":143},{"sl":153},{"sl":154},{"sl":177},{"sl":178},{"sl":210},{"sl":211},{"sl":1015},{"sl":1018},{"sl":1021},{"sl":1022},{"sl":1023},{"sl":1025},{"sl":1026},{"sl":1028}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [240, 529], [240, 529], [], [], [], [], [], [], [], [], [1339, 1110, 2503, 2246, 3155, 240, 529, 1417, 1022, 3797], [1339, 1110, 2503, 2246, 3155, 240, 529, 1417, 1022, 3797], [1339, 1110, 2503, 2246, 3155, 240, 529, 1417, 1022, 3797], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [240, 529], [240, 529], [240, 529], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [240, 529], [240, 529], [240, 529], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 3155, 1417, 3797], [], [], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [], [], [], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [], [], [], [], [], [], [], [], [], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [], [1339, 3155, 1417, 3797], [], [], [], [], [], [], [], [1339, 3155, 1417, 3797], [], [], [], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [], [], [], [], [], [], [], [], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [], [1339, 3155, 1417, 3797], [], [], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [], [], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [], [], [1339, 3155, 1417, 3797], [1339, 3155, 1417, 3797], [3155, 3797], [3155, 3797], [3155, 3797], [3155, 3797], [], [], [], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [], [], [], [], [], [], [1339, 1417], [], [1339, 1417], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [1339, 1417], [], [], [1339, 1417], [], [1339, 1417], [], [], [1339, 1417], [], [], [1339, 1417], [], [], [], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [], [], [1339, 1417], [], [1339, 1417], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [], [], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [], [], [], [], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [], [1339, 1417], [], [], [1339, 1417], [], [1339, 1417], [], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [1339, 1417], [1339, 1417], [], [], [], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [], [], [], [], [], [1339, 1417], [1339, 1417], [], [], [], [], [], [], [], [], [], [1110, 3873, 2503, 1869, 2246, 240, 529, 1022], [1110, 3873, 2503, 1869, 2246, 240, 529, 1022], [3873, 1869], [], [1110, 2503, 2246, 240, 529, 1022], [], [], [1110, 2503, 2246, 240, 529, 1022], [1110, 2503, 2246, 240, 529, 1022], [240, 529], [], [1110, 2503, 2246, 240, 529, 1022], [240, 529], [], [1110, 2503, 2246, 240, 529, 1022], [], [], []]