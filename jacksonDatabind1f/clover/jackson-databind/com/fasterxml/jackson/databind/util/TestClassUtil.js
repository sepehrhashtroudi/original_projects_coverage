var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":140,"id":31681,"methods":[{"el":65,"sc":5,"sl":55},{"el":75,"sc":5,"sl":67},{"el":82,"sc":5,"sl":77},{"el":94,"sc":5,"sl":84},{"el":116,"sc":5,"sl":96},{"el":139,"sc":5,"sl":118}],"name":"TestClassUtil","sl":11},{"el":27,"id":31681,"methods":[{"el":26,"sc":9,"sl":26}],"name":"TestClassUtil.BaseClass","sl":23},{"el":29,"id":31682,"methods":[],"name":"TestClassUtil.BaseInt","sl":29},{"el":31,"id":31682,"methods":[],"name":"TestClassUtil.SubInt","sl":31},{"el":33,"id":31682,"methods":[],"name":"TestClassUtil.TestEnum","sl":33},{"el":35,"id":31682,"methods":[],"name":"TestClassUtil.InnerNonStatic","sl":35},{"el":41,"id":31682,"methods":[{"el":40,"sc":9,"sl":38}],"name":"TestClassUtil.Inner","sl":37},{"el":47,"id":31684,"methods":[{"el":46,"sc":9,"sl":46}],"name":"TestClassUtil.SubClass","sl":43}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1027":{"methods":[{"sl":84}],"name":"testCanBeABeanType","pass":true,"statements":[{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93}]},"test_1220":{"methods":[{"sl":84}],"name":"testCanBeABeanType","pass":true,"statements":[{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93}]},"test_144":{"methods":[{"sl":38},{"sl":118}],"name":"testFailedCreateInstance","pass":true,"statements":[{"sl":39},{"sl":120},{"sl":121},{"sl":123},{"sl":126},{"sl":128},{"sl":130},{"sl":134},{"sl":135},{"sl":137}]},"test_1452":{"methods":[{"sl":96}],"name":"testExceptionHelpers","pass":true,"statements":[{"sl":98},{"sl":99},{"sl":101},{"sl":103},{"sl":104},{"sl":107},{"sl":110},{"sl":111},{"sl":114}]},"test_2043":{"methods":[{"sl":55}],"name":"testSuperTypes","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":64}]},"test_209":{"methods":[{"sl":67}],"name":"testSuperInterfaces","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":71},{"sl":74}]},"test_503":{"methods":[{"sl":77}],"name":"testIsConcrete","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81}]},"test_666":{"methods":[{"sl":96}],"name":"testExceptionHelpers","pass":true,"statements":[{"sl":98},{"sl":99},{"sl":101},{"sl":103},{"sl":104},{"sl":107},{"sl":110},{"sl":111},{"sl":114}]},"test_679":{"methods":[{"sl":38},{"sl":118}],"name":"testFailedCreateInstance","pass":true,"statements":[{"sl":39},{"sl":120},{"sl":121},{"sl":123},{"sl":126},{"sl":128},{"sl":130},{"sl":134},{"sl":135},{"sl":137}]},"test_797":{"methods":[{"sl":77}],"name":"testIsConcrete","pass":true,"statements":[{"sl":79},{"sl":80},{"sl":81}]},"test_826":{"methods":[{"sl":67}],"name":"testSuperInterfaces","pass":true,"statements":[{"sl":69},{"sl":70},{"sl":71},{"sl":74}]},"test_953":{"methods":[{"sl":55}],"name":"testSuperTypes","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [144, 679], [144, 679], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2043, 953], [], [2043, 953], [2043, 953], [2043, 953], [], [], [], [], [2043, 953], [], [], [209, 826], [], [209, 826], [209, 826], [209, 826], [], [], [209, 826], [], [], [797, 503], [], [797, 503], [797, 503], [797, 503], [], [], [1027, 1220], [], [1027, 1220], [1027, 1220], [1027, 1220], [1027, 1220], [1027, 1220], [], [1027, 1220], [1027, 1220], [], [], [1452, 666], [], [1452, 666], [1452, 666], [], [1452, 666], [], [1452, 666], [1452, 666], [], [], [1452, 666], [], [], [1452, 666], [1452, 666], [], [], [1452, 666], [], [], [], [144, 679], [], [144, 679], [144, 679], [], [144, 679], [], [], [144, 679], [], [144, 679], [], [144, 679], [], [], [], [144, 679], [144, 679], [], [144, 679], [], [], []]