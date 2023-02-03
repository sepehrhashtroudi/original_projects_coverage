var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":231,"id":39754,"methods":[{"el":144,"sc":5,"sl":133},{"el":154,"sc":5,"sl":146},{"el":167,"sc":5,"sl":156},{"el":188,"sc":5,"sl":169},{"el":197,"sc":5,"sl":190},{"el":206,"sc":5,"sl":199},{"el":215,"sc":5,"sl":208},{"el":223,"sc":5,"sl":217},{"el":229,"sc":5,"sl":225}],"name":"TestJsonSerialize","sl":16},{"el":27,"id":39754,"methods":[],"name":"TestJsonSerialize.ValueInterface","sl":25},{"el":35,"id":39754,"methods":[{"el":33,"sc":9,"sl":32},{"el":34,"sc":9,"sl":34}],"name":"TestJsonSerialize.ValueClass","sl":29},{"el":47,"id":39758,"methods":[{"el":46,"sc":9,"sl":43}],"name":"TestJsonSerialize.WrapperClassForAs","sl":41},{"el":56,"id":39760,"methods":[{"el":55,"sc":9,"sl":53}],"name":"TestJsonSerialize.WrapperClassForStaticTyping","sl":51},{"el":69,"id":39762,"methods":[{"el":63,"sc":9,"sl":60},{"el":68,"sc":9,"sl":65}],"name":"TestJsonSerialize.WrapperClassForStaticTyping2","sl":58},{"el":81,"id":39766,"methods":[{"el":80,"sc":9,"sl":77}],"name":"TestJsonSerialize.BrokenClass","sl":74},{"el":84,"id":39768,"methods":[],"name":"TestJsonSerialize.ValueMap","sl":84},{"el":86,"id":39768,"methods":[],"name":"TestJsonSerialize.ValueList","sl":86},{"el":88,"id":39768,"methods":[],"name":"TestJsonSerialize.ValueLinkedList","sl":88},{"el":102,"id":39768,"methods":[{"el":97,"sc":9,"sl":97},{"el":101,"sc":9,"sl":98}],"name":"TestJsonSerialize.Foo294","sl":91},{"el":115,"id":39772,"methods":[{"el":108,"sc":9,"sl":108},{"el":111,"sc":9,"sl":109},{"el":113,"sc":9,"sl":113},{"el":114,"sc":9,"sl":114}],"name":"TestJsonSerialize.Bar294","sl":104},{"el":125,"id":39779,"methods":[{"el":124,"sc":9,"sl":119}],"name":"TestJsonSerialize.Bar294Serializer","sl":117}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1071":{"methods":[{"sl":32},{"sl":53},{"sl":156}],"name":"testStaticTypingForClass","pass":true,"statements":[{"sl":33},{"sl":54},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166}]},"test_1122":{"methods":[{"sl":146}],"name":"testBrokenAnnotation","pass":true,"statements":[{"sl":148},{"sl":149},{"sl":150},{"sl":152}]},"test_1182":{"methods":[{"sl":32},{"sl":34},{"sl":60},{"sl":65},{"sl":169}],"name":"testMixedTypingForClass","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":62},{"sl":67},{"sl":172},{"sl":173},{"sl":174},{"sl":176},{"sl":178},{"sl":179},{"sl":180},{"sl":182},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_1223":{"methods":[{"sl":98},{"sl":109},{"sl":119},{"sl":225}],"name":"testProblem294","pass":true,"statements":[{"sl":99},{"sl":100},{"sl":110},{"sl":123},{"sl":227}]},"test_133":{"methods":[{"sl":146}],"name":"testBrokenAnnotation","pass":true,"statements":[{"sl":148},{"sl":149},{"sl":150},{"sl":152}]},"test_1330":{"methods":[{"sl":32},{"sl":199}],"name":"testStaticTypingWithArrayList","pass":true,"statements":[{"sl":33},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205}]},"test_1430":{"methods":[{"sl":32},{"sl":199}],"name":"testStaticTypingWithArrayList","pass":true,"statements":[{"sl":33},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205}]},"test_1505":{"methods":[{"sl":32},{"sl":217}],"name":"testStaticTypingWithArray","pass":true,"statements":[{"sl":33},{"sl":219},{"sl":220},{"sl":221},{"sl":222}]},"test_1527":{"methods":[{"sl":32},{"sl":53},{"sl":156}],"name":"testStaticTypingForClass","pass":true,"statements":[{"sl":33},{"sl":54},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166}]},"test_1759":{"methods":[{"sl":32},{"sl":43},{"sl":133}],"name":"testSimpleValueDefinition","pass":true,"statements":[{"sl":33},{"sl":45},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143}]},"test_1807":{"methods":[{"sl":32},{"sl":217}],"name":"testStaticTypingWithArray","pass":true,"statements":[{"sl":33},{"sl":219},{"sl":220},{"sl":221},{"sl":222}]},"test_1953":{"methods":[{"sl":32},{"sl":34},{"sl":60},{"sl":65},{"sl":169}],"name":"testMixedTypingForClass","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":62},{"sl":67},{"sl":172},{"sl":173},{"sl":174},{"sl":176},{"sl":178},{"sl":179},{"sl":180},{"sl":182},{"sl":184},{"sl":185},{"sl":186},{"sl":187}]},"test_404":{"methods":[{"sl":98},{"sl":109},{"sl":119},{"sl":225}],"name":"testProblem294","pass":true,"statements":[{"sl":99},{"sl":100},{"sl":110},{"sl":123},{"sl":227}]},"test_508":{"methods":[{"sl":32},{"sl":208}],"name":"testStaticTypingWithLinkedList","pass":true,"statements":[{"sl":33},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214}]},"test_571":{"methods":[{"sl":32},{"sl":190}],"name":"testStaticTypingWithMap","pass":true,"statements":[{"sl":33},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196}]},"test_650":{"methods":[{"sl":32},{"sl":43},{"sl":133}],"name":"testSimpleValueDefinition","pass":true,"statements":[{"sl":33},{"sl":45},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":141},{"sl":142},{"sl":143}]},"test_823":{"methods":[{"sl":32},{"sl":208}],"name":"testStaticTypingWithLinkedList","pass":true,"statements":[{"sl":33},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214}]},"test_900":{"methods":[{"sl":32},{"sl":190}],"name":"testStaticTypingWithMap","pass":true,"statements":[{"sl":33},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1505, 1807, 1430, 1759, 650, 1330, 1953, 508, 900, 823, 1182, 1071, 571, 1527], [1505, 1807, 1430, 1759, 650, 1330, 1953, 508, 900, 823, 1182, 1071, 571, 1527], [1953, 1182], [], [], [], [], [], [], [], [], [1759, 650], [], [1759, 650], [], [], [], [], [], [], [], [1071, 1527], [1071, 1527], [], [], [], [], [], [1953, 1182], [], [1953, 1182], [], [], [1953, 1182], [], [1953, 1182], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1223, 404], [1223, 404], [1223, 404], [], [], [], [], [], [], [], [], [1223, 404], [1223, 404], [], [], [], [], [], [], [], [], [1223, 404], [], [], [], [1223, 404], [], [], [], [], [], [], [], [], [], [1759, 650], [], [], [1759, 650], [1759, 650], [1759, 650], [1759, 650], [], [1759, 650], [1759, 650], [1759, 650], [], [], [133, 1122], [], [133, 1122], [133, 1122], [133, 1122], [], [133, 1122], [], [], [], [1071, 1527], [], [], [1071, 1527], [1071, 1527], [1071, 1527], [1071, 1527], [], [1071, 1527], [1071, 1527], [1071, 1527], [], [], [1953, 1182], [], [], [1953, 1182], [1953, 1182], [1953, 1182], [], [1953, 1182], [], [1953, 1182], [1953, 1182], [1953, 1182], [], [1953, 1182], [], [1953, 1182], [1953, 1182], [1953, 1182], [1953, 1182], [], [], [900, 571], [], [900, 571], [900, 571], [900, 571], [900, 571], [900, 571], [], [], [1430, 1330], [], [1430, 1330], [1430, 1330], [1430, 1330], [1430, 1330], [1430, 1330], [], [], [508, 823], [], [508, 823], [508, 823], [508, 823], [508, 823], [508, 823], [], [], [1505, 1807], [], [1505, 1807], [1505, 1807], [1505, 1807], [1505, 1807], [], [], [1223, 404], [], [1223, 404], [], [], [], []]