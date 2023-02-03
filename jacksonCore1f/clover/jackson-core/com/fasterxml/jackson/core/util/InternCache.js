var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":10936,"methods":[{"el":33,"sc":5,"sl":31},{"el":39,"sc":5,"sl":35},{"el":49,"sc":5,"sl":41}],"name":"InternCache","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_108":{"methods":[{"sl":35},{"sl":41}],"name":"testNameEscaping","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_117":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testCurrentName","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_119":{"methods":[{"sl":41}],"name":"testInterningWithStreams","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":48}]},"test_127":{"methods":[{"sl":35},{"sl":41}],"name":"testSpecExampleFully","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_129":{"methods":[{"sl":35},{"sl":41}],"name":"testSharedSymbols","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_131":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testByteSymbolsWithEOF","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_138":{"methods":[{"sl":35},{"sl":41}],"name":"testSimpleUnquoted","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_147":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testNextValue","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_153":{"methods":[{"sl":41}],"name":"testSpecExampleSkipping","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":48}]},"test_154":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testLargeUnquoted","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_158":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testTabsEnabled","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_166":{"methods":[{"sl":35},{"sl":41}],"name":"testMisssingColon","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_175":{"methods":[{"sl":35},{"sl":41}],"name":"testIssue34","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_185":{"methods":[{"sl":35},{"sl":41}],"name":"testUtf8Name3Bytes","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_187":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testSurrogates","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_19":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testStreamReaderParser","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_191":{"methods":[{"sl":35},{"sl":41}],"name":"testLongText","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_193":{"methods":[{"sl":35},{"sl":41}],"name":"testSkipping","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_2":{"methods":[{"sl":35},{"sl":41}],"name":"testKeywords","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_23":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testSimple","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_29":{"methods":[{"sl":35},{"sl":41}],"name":"testNonStandardNameChars","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_41":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testStreaming","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_48":{"methods":[{"sl":35},{"sl":41}],"name":"testNextValueNested","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_49":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testSyntheticWithBytes","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_52":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testIsNextTokenName","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_54":{"methods":[{"sl":41}],"name":"testInvalidKeywordsStream","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":48}]},"test_57":{"methods":[{"sl":41}],"name":"testByteSymbolsWithClose","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":48}]},"test_72":{"methods":[{"sl":35},{"sl":41}],"name":"testLongerObjects","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_74":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testBinaryWrite","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_8":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testAuxMethods","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_87":{"methods":[{"sl":35},{"sl":41}],"name":"testSingleQuotesEnabled","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_9":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testUtf8Name2Bytes","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]},"test_96":{"methods":[{"sl":31},{"sl":35},{"sl":41}],"name":"testSimpleValidObject","pass":true,"statements":[{"sl":32},{"sl":38},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [41, 154, 23, 49, 74, 187, 158, 8, 117, 131, 96, 52, 147, 9, 19], [41, 154, 23, 49, 74, 187, 158, 8, 117, 131, 96, 52, 147, 9, 19], [], [], [41, 87, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 96, 175, 52, 2, 147, 185, 48, 9, 19], [], [], [41, 87, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 96, 175, 52, 2, 147, 185, 48, 9, 19], [], [], [41, 153, 87, 57, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 54, 96, 175, 52, 2, 147, 185, 119, 48, 9, 19], [], [41, 153, 87, 57, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 54, 96, 175, 52, 2, 147, 185, 119, 48, 9, 19], [41, 153, 87, 57, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 54, 96, 175, 52, 2, 147, 185, 119, 48, 9, 19], [41, 87, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 96, 175, 52, 2, 147, 185, 48, 9, 19], [41, 87, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 96, 175, 52, 2, 147, 185, 48, 9, 19], [], [41, 153, 87, 57, 166, 108, 138, 154, 23, 193, 49, 74, 187, 29, 158, 72, 8, 191, 117, 127, 131, 129, 54, 96, 175, 52, 2, 147, 185, 119, 48, 9, 19], [], [], [], [], []]