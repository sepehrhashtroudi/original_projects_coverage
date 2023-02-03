var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":253,"id":1907,"methods":[{"el":32,"sc":5,"sl":30},{"el":37,"sc":5,"sl":34},{"el":131,"sc":5,"sl":39},{"el":136,"sc":5,"sl":133},{"el":145,"sc":5,"sl":138},{"el":156,"sc":5,"sl":147},{"el":165,"sc":5,"sl":158},{"el":174,"sc":5,"sl":167},{"el":184,"sc":5,"sl":176},{"el":191,"sc":5,"sl":186},{"el":220,"sc":5,"sl":193}],"name":"ValuesTest","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":193}],"name":"testCharSeparator","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219}]},"test_129":{"methods":[{"sl":167}],"name":"testTwoArgValues","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173}]},"test_155":{"methods":[{"sl":147}],"name":"testShortArgsWithValue","pass":true,"statements":[{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":155}]},"test_157":{"methods":[{"sl":138}],"name":"testShortArgs","pass":true,"statements":[{"sl":140},{"sl":141},{"sl":143},{"sl":144}]},"test_164":{"methods":[{"sl":138}],"name":"testShortArgs","pass":true,"statements":[{"sl":140},{"sl":141},{"sl":143},{"sl":144}]},"test_193":{"methods":[{"sl":167}],"name":"testTwoArgValues","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173}]},"test_214":{"methods":[{"sl":186}],"name":"testExtraArgs","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":190}]},"test_224":{"methods":[{"sl":147}],"name":"testShortArgsWithValue","pass":true,"statements":[{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":155}]},"test_232":{"methods":[{"sl":158}],"name":"testMultipleArgValues","pass":true,"statements":[{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164}]},"test_256":{"methods":[{"sl":176}],"name":"testComplexValues","pass":true,"statements":[{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183}]},"test_259":{"methods":[{"sl":193}],"name":"testCharSeparator","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219}]},"test_44":{"methods":[{"sl":193}],"name":"testCharSeparator","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":219}]},"test_5":{"methods":[{"sl":158}],"name":"testMultipleArgValues","pass":true,"statements":[{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164}]},"test_56":{"methods":[{"sl":158}],"name":"testMultipleArgValues","pass":true,"statements":[{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164}]},"test_68":{"methods":[{"sl":138}],"name":"testShortArgs","pass":true,"statements":[{"sl":140},{"sl":141},{"sl":143},{"sl":144}]},"test_73":{"methods":[{"sl":147}],"name":"testShortArgsWithValue","pass":true,"statements":[{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":155}]},"test_75":{"methods":[{"sl":186}],"name":"testExtraArgs","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":190}]},"test_81":{"methods":[{"sl":167}],"name":"testTwoArgValues","pass":true,"statements":[{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173}]},"test_85":{"methods":[{"sl":176}],"name":"testComplexValues","pass":true,"statements":[{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183}]},"test_90":{"methods":[{"sl":186}],"name":"testExtraArgs","pass":true,"statements":[{"sl":188},{"sl":189},{"sl":190}]},"test_94":{"methods":[{"sl":176}],"name":"testComplexValues","pass":true,"statements":[{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [68, 157, 164], [], [68, 157, 164], [68, 157, 164], [], [68, 157, 164], [68, 157, 164], [], [], [155, 224, 73], [], [155, 224, 73], [155, 224, 73], [155, 224, 73], [], [155, 224, 73], [155, 224, 73], [155, 224, 73], [], [], [232, 56, 5], [], [232, 56, 5], [232, 56, 5], [232, 56, 5], [232, 56, 5], [232, 56, 5], [], [], [129, 81, 193], [], [129, 81, 193], [129, 81, 193], [129, 81, 193], [129, 81, 193], [129, 81, 193], [], [], [94, 256, 85], [], [94, 256, 85], [94, 256, 85], [94, 256, 85], [94, 256, 85], [94, 256, 85], [94, 256, 85], [], [], [90, 75, 214], [], [90, 75, 214], [90, 75, 214], [90, 75, 214], [], [], [44, 259, 109], [], [], [], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [44, 259, 109], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]