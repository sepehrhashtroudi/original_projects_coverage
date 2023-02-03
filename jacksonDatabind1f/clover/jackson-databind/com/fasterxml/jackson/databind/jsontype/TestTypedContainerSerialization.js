var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":159,"id":35866,"methods":[{"el":128,"sc":5,"sl":114},{"el":139,"sc":5,"sl":130},{"el":158,"sc":5,"sl":141}],"name":"TestTypedContainerSerialization","sl":19},{"el":37,"id":35866,"methods":[{"el":36,"sc":6,"sl":34}],"name":"TestTypedContainerSerialization.Animal","sl":31},{"el":55,"id":35868,"methods":[{"el":45,"sc":3,"sl":43},{"el":50,"sc":3,"sl":47},{"el":54,"sc":3,"sl":52}],"name":"TestTypedContainerSerialization.Dog","sl":40},{"el":74,"id":35874,"methods":[{"el":63,"sc":3,"sl":61},{"el":69,"sc":3,"sl":65},{"el":73,"sc":3,"sl":71}],"name":"TestTypedContainerSerialization.Cat","sl":58},{"el":86,"id":35881,"methods":[{"el":81,"sc":3,"sl":79},{"el":85,"sc":3,"sl":83}],"name":"TestTypedContainerSerialization.Container1","sl":76},{"el":100,"id":35885,"methods":[{"el":94,"sc":3,"sl":92},{"el":98,"sc":3,"sl":96}],"name":"TestTypedContainerSerialization.Container2","sl":88},{"el":103,"id":35889,"methods":[],"name":"TestTypedContainerSerialization.Issue508A","sl":103},{"el":104,"id":35889,"methods":[],"name":"TestTypedContainerSerialization.Issue508B","sl":104}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1788":{"methods":[{"sl":34},{"sl":47},{"sl":130}],"name":"testIssue329","pass":true,"statements":[{"sl":35},{"sl":49},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]},"test_1870":{"methods":[{"sl":34},{"sl":47},{"sl":52},{"sl":79},{"sl":83},{"sl":92},{"sl":96},{"sl":114}],"name":"testIssue265","pass":true,"statements":[{"sl":35},{"sl":49},{"sl":53},{"sl":80},{"sl":84},{"sl":93},{"sl":97},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_1902":{"methods":[{"sl":34},{"sl":47},{"sl":52},{"sl":79},{"sl":83},{"sl":92},{"sl":96},{"sl":114}],"name":"testIssue265","pass":true,"statements":[{"sl":35},{"sl":49},{"sl":53},{"sl":80},{"sl":84},{"sl":93},{"sl":97},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_1956":{"methods":[{"sl":34},{"sl":47},{"sl":130}],"name":"testIssue329","pass":true,"statements":[{"sl":35},{"sl":49},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]},"test_270":{"methods":[{"sl":141}],"name":"testIssue508","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157}]},"test_556":{"methods":[{"sl":141}],"name":"testIssue508","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1956, 1902, 1788, 1870], [1956, 1902, 1788, 1870], [], [], [], [], [], [], [], [], [], [], [], [1956, 1902, 1788, 1870], [], [1956, 1902, 1788, 1870], [], [], [1902, 1870], [1902, 1870], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1902, 1870], [1902, 1870], [], [], [1902, 1870], [1902, 1870], [], [], [], [], [], [], [], [1902, 1870], [1902, 1870], [], [], [1902, 1870], [1902, 1870], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1902, 1870], [], [1902, 1870], [1902, 1870], [1902, 1870], [1902, 1870], [1902, 1870], [1902, 1870], [], [1902, 1870], [1902, 1870], [1902, 1870], [1902, 1870], [], [], [], [1956, 1788], [], [1956, 1788], [1956, 1788], [1956, 1788], [1956, 1788], [1956, 1788], [], [], [], [], [270, 556], [], [270, 556], [270, 556], [270, 556], [270, 556], [270, 556], [270, 556], [], [270, 556], [270, 556], [270, 556], [270, 556], [270, 556], [270, 556], [270, 556], [270, 556], [], []]