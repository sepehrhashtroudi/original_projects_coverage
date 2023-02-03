var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":714,"id":4157,"methods":[{"el":39,"sc":5,"sl":37},{"el":50,"sc":5,"sl":45},{"el":57,"sc":5,"sl":55},{"el":65,"sc":5,"sl":62},{"el":70,"sc":5,"sl":67},{"el":75,"sc":5,"sl":72},{"el":87,"sc":5,"sl":78},{"el":99,"sc":5,"sl":90},{"el":106,"sc":5,"sl":104},{"el":113,"sc":5,"sl":111},{"el":221,"sc":5,"sl":115},{"el":329,"sc":5,"sl":223},{"el":396,"sc":5,"sl":331},{"el":463,"sc":5,"sl":398},{"el":473,"sc":5,"sl":465},{"el":482,"sc":5,"sl":475},{"el":511,"sc":2,"sl":484},{"el":515,"sc":2,"sl":513},{"el":526,"sc":5,"sl":517},{"el":542,"sc":5,"sl":528},{"el":558,"sc":5,"sl":544},{"el":574,"sc":5,"sl":560},{"el":590,"sc":5,"sl":576},{"el":612,"sc":5,"sl":592},{"el":639,"sc":5,"sl":614},{"el":648,"sc":5,"sl":641},{"el":657,"sc":5,"sl":650},{"el":668,"sc":5,"sl":659},{"el":684,"sc":5,"sl":670},{"el":688,"sc":5,"sl":686},{"el":701,"sc":5,"sl":692},{"el":712,"sc":5,"sl":710}],"name":"Base64Test","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":90},{"sl":710}],"name":"testEncodeDecodeRandom","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":711}]},"test_106":{"methods":[{"sl":475}],"name":"testKnownDecodings","pass":true,"statements":[{"sl":476},{"sl":477},{"sl":478},{"sl":479},{"sl":480},{"sl":481}]},"test_112":{"methods":[{"sl":55}],"name":"testDecodePadMarkerIndex2","pass":true,"statements":[{"sl":56}]},"test_118":{"methods":[{"sl":659}],"name":"testCodeInteger3","pass":true,"statements":[{"sl":660},{"sl":662},{"sl":666},{"sl":667}]},"test_127":{"methods":[{"sl":331}],"name":"testTriplets","pass":true,"statements":[{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":340},{"sl":341},{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":351},{"sl":352},{"sl":353},{"sl":354},{"sl":355},{"sl":356},{"sl":357},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":365},{"sl":366},{"sl":367},{"sl":368},{"sl":369},{"sl":370},{"sl":371},{"sl":372},{"sl":373},{"sl":374},{"sl":375},{"sl":376},{"sl":377},{"sl":378},{"sl":379},{"sl":380},{"sl":381},{"sl":382},{"sl":383},{"sl":384},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":391},{"sl":392},{"sl":393},{"sl":394},{"sl":395}]},"test_13":{"methods":[{"sl":45}],"name":"testBase64","pass":true,"statements":[{"sl":46},{"sl":47},{"sl":48},{"sl":49}]},"test_135":{"methods":[{"sl":650}],"name":"testCodeInteger2","pass":true,"statements":[{"sl":651},{"sl":652},{"sl":655},{"sl":656}]},"test_14":{"methods":[{"sl":513}],"name":"testIgnoringNonBase64InDecode","pass":true,"statements":[{"sl":514}]},"test_160":{"methods":[{"sl":104}],"name":"testRfc2045Section2Dot1CrLfDefinition","pass":true,"statements":[{"sl":105}]},"test_166":{"methods":[{"sl":223}],"name":"testSingletonsChunked","pass":true,"statements":[{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":270},{"sl":271},{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":307},{"sl":308},{"sl":309},{"sl":310},{"sl":311},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":316},{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":321},{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328}]},"test_171":{"methods":[{"sl":398}],"name":"testTripletsChunked","pass":true,"statements":[{"sl":399},{"sl":400},{"sl":401},{"sl":402},{"sl":403},{"sl":404},{"sl":405},{"sl":406},{"sl":407},{"sl":408},{"sl":409},{"sl":410},{"sl":411},{"sl":412},{"sl":413},{"sl":414},{"sl":415},{"sl":416},{"sl":417},{"sl":418},{"sl":419},{"sl":420},{"sl":421},{"sl":422},{"sl":423},{"sl":424},{"sl":425},{"sl":426},{"sl":427},{"sl":428},{"sl":429},{"sl":430},{"sl":431},{"sl":432},{"sl":433},{"sl":434},{"sl":435},{"sl":436},{"sl":437},{"sl":438},{"sl":439},{"sl":440},{"sl":441},{"sl":442},{"sl":443},{"sl":444},{"sl":445},{"sl":446},{"sl":447},{"sl":448},{"sl":449},{"sl":450},{"sl":451},{"sl":452},{"sl":453},{"sl":454},{"sl":455},{"sl":456},{"sl":457},{"sl":458},{"sl":459},{"sl":460},{"sl":461},{"sl":462}]},"test_183":{"methods":[{"sl":592}],"name":"testDecodeWithWhitespace","pass":true,"statements":[{"sl":594},{"sl":596},{"sl":597},{"sl":600},{"sl":601},{"sl":602},{"sl":603},{"sl":605},{"sl":606},{"sl":608},{"sl":610}]},"test_19":{"methods":[{"sl":670}],"name":"testCodeInteger4","pass":true,"statements":[{"sl":671},{"sl":675},{"sl":682},{"sl":683}]},"test_197":{"methods":[{"sl":686}],"name":"testCodeIntegerEdgeCases","pass":true,"statements":[]},"test_198":{"methods":[{"sl":111}],"name":"testRfc2045Section6Dot8ChunkSizeDefinition","pass":true,"statements":[{"sl":112}]},"test_202":{"methods":[{"sl":528}],"name":"testObjectDecodeWithInvalidParameter","pass":true,"statements":[{"sl":529},{"sl":531},{"sl":533},{"sl":534},{"sl":535},{"sl":537},{"sl":540}]},"test_205":{"methods":[{"sl":67}],"name":"testDecodePadOnly","pass":true,"statements":[{"sl":68},{"sl":69}]},"test_23":{"methods":[{"sl":62}],"name":"testDecodePadMarkerIndex3","pass":true,"statements":[{"sl":63},{"sl":64}]},"test_24":{"methods":[{"sl":544}],"name":"testObjectDecodeWithValidParameter","pass":true,"statements":[{"sl":546},{"sl":547},{"sl":549},{"sl":551},{"sl":552},{"sl":553},{"sl":554},{"sl":556}]},"test_30":{"methods":[{"sl":78},{"sl":692},{"sl":710}],"name":"testEncodeDecodeSmall","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":693},{"sl":694},{"sl":695},{"sl":696},{"sl":697},{"sl":700},{"sl":711}]},"test_31":{"methods":[{"sl":560}],"name":"testObjectEncodeWithInvalidParameter","pass":true,"statements":[{"sl":561},{"sl":563},{"sl":565},{"sl":566},{"sl":567},{"sl":569},{"sl":572}]},"test_32":{"methods":[{"sl":576}],"name":"testObjectEncodeWithValidParameter","pass":true,"statements":[{"sl":578},{"sl":579},{"sl":580},{"sl":582},{"sl":583},{"sl":584},{"sl":586},{"sl":588}]},"test_43":{"methods":[{"sl":641}],"name":"testCodeInteger1","pass":true,"statements":[{"sl":642},{"sl":643},{"sl":646},{"sl":647}]},"test_46":{"methods":[{"sl":115}],"name":"testSingletons","pass":true,"statements":[{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219},{"sl":220}]},"test_5":{"methods":[{"sl":484}],"name":"testNonBase64Test","pass":true,"statements":[{"sl":486},{"sl":488},{"sl":492},{"sl":494},{"sl":495},{"sl":496},{"sl":498},{"sl":505}]},"test_54":{"methods":[{"sl":614}],"name":"testDiscardWhitespace","pass":true,"statements":[{"sl":616},{"sl":618},{"sl":619},{"sl":622},{"sl":623},{"sl":624},{"sl":625},{"sl":627},{"sl":628},{"sl":629},{"sl":630},{"sl":632},{"sl":633},{"sl":635},{"sl":637}]},"test_56":{"methods":[{"sl":517}],"name":"testIsArrayByteBase64","pass":true,"statements":[{"sl":518},{"sl":519},{"sl":520},{"sl":521},{"sl":522},{"sl":523},{"sl":524},{"sl":525}]},"test_76":{"methods":[{"sl":465}],"name":"testKnownEncodings","pass":true,"statements":[{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472}]},"test_99":{"methods":[{"sl":72}],"name":"testDecodePadOnlyChunked","pass":true,"statements":[{"sl":73},{"sl":74}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [13], [13], [13], [13], [13], [], [], [], [], [], [112], [112], [], [], [], [], [], [23], [23], [23], [], [], [205], [205], [205], [], [], [99], [99], [99], [], [], [], [30], [30], [30], [30], [30], [30], [30], [30], [], [], [], [], [1], [1], [1], [1], [1], [1], [1], [1], [], [], [], [], [], [], [160], [160], [], [], [], [], [], [198], [198], [], [], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [46], [], [], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [166], [], [], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [127], [], [], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [171], [], [], [76], [76], [76], [76], [76], [76], [76], [76], [], [], [106], [106], [106], [106], [106], [106], [106], [], [], [5], [], [5], [], [5], [], [], [], [5], [], [5], [5], [5], [], [5], [], [], [], [], [], [], [5], [], [], [], [], [], [], [], [14], [14], [], [], [56], [56], [56], [56], [56], [56], [56], [56], [56], [], [], [202], [202], [], [202], [], [202], [202], [202], [], [202], [], [], [202], [], [], [], [24], [], [24], [24], [], [24], [], [24], [24], [24], [24], [], [24], [], [], [], [31], [31], [], [31], [], [31], [31], [31], [], [31], [], [], [31], [], [], [], [32], [], [32], [32], [32], [], [32], [32], [32], [], [32], [], [32], [], [], [], [183], [], [183], [], [183], [183], [], [], [183], [183], [183], [183], [], [183], [183], [], [183], [], [183], [], [], [], [54], [], [54], [], [54], [54], [], [], [54], [54], [54], [54], [], [54], [54], [54], [54], [], [54], [54], [], [54], [], [54], [], [], [], [43], [43], [43], [], [], [43], [43], [], [], [135], [135], [135], [], [], [135], [135], [], [], [118], [118], [], [118], [], [], [], [118], [118], [], [], [19], [19], [], [], [], [19], [], [], [], [], [], [], [19], [19], [], [], [197], [], [], [], [], [], [30], [30], [30], [30], [30], [30], [], [], [30], [], [], [], [], [], [], [], [], [], [30, 1], [30, 1], [], [], []]