var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":164,"id":44403,"methods":[{"el":133,"sc":5,"sl":113},{"el":163,"sc":5,"sl":135}],"name":"TestObjectIdWithPolymorphic","sl":14},{"el":28,"id":44403,"methods":[{"el":24,"sc":9,"sl":24},{"el":27,"sc":9,"sl":25}],"name":"TestObjectIdWithPolymorphic.Base","sl":18},{"el":39,"id":44407,"methods":[{"el":34,"sc":9,"sl":34},{"el":38,"sc":9,"sl":35}],"name":"TestObjectIdWithPolymorphic.Impl","sl":30},{"el":58,"id":44412,"methods":[{"el":48,"sc":9,"sl":48},{"el":57,"sc":9,"sl":49}],"name":"TestObjectIdWithPolymorphic.Base811","sl":44},{"el":65,"id":44421,"methods":[{"el":64,"sc":9,"sl":64}],"name":"TestObjectIdWithPolymorphic.Process","sl":60},{"el":76,"id":44423,"methods":[{"el":72,"sc":9,"sl":69},{"el":75,"sc":9,"sl":73}],"name":"TestObjectIdWithPolymorphic.Activity","sl":67},{"el":86,"id":44428,"methods":[{"el":82,"sc":9,"sl":80},{"el":85,"sc":9,"sl":83}],"name":"TestObjectIdWithPolymorphic.Scope","sl":78},{"el":96,"id":44432,"methods":[{"el":93,"sc":9,"sl":91},{"el":95,"sc":9,"sl":95}],"name":"TestObjectIdWithPolymorphic.FaultHandler","sl":88},{"el":103,"id":44435,"methods":[{"el":101,"sc":9,"sl":99},{"el":102,"sc":9,"sl":102}],"name":"TestObjectIdWithPolymorphic.Catch","sl":98}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1903":{"methods":[{"sl":25},{"sl":34},{"sl":35},{"sl":113}],"name":"testPolymorphicRoundtrip","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":36},{"sl":37},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132}]},"test_1945":{"methods":[{"sl":25},{"sl":34},{"sl":35},{"sl":113}],"name":"testPolymorphicRoundtrip","pass":true,"statements":[{"sl":26},{"sl":34},{"sl":36},{"sl":37},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132}]},"test_2036":{"methods":[{"sl":48},{"sl":49},{"sl":64},{"sl":69},{"sl":73},{"sl":80},{"sl":83},{"sl":91},{"sl":95},{"sl":99},{"sl":102},{"sl":135}],"name":"testIssue811","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52},{"sl":54},{"sl":55},{"sl":64},{"sl":70},{"sl":71},{"sl":74},{"sl":81},{"sl":84},{"sl":92},{"sl":100},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":154},{"sl":155},{"sl":156},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162}]},"test_2054":{"methods":[{"sl":48},{"sl":49},{"sl":64},{"sl":69},{"sl":73},{"sl":80},{"sl":83},{"sl":91},{"sl":95},{"sl":99},{"sl":102},{"sl":135}],"name":"testIssue811","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52},{"sl":54},{"sl":55},{"sl":64},{"sl":70},{"sl":71},{"sl":74},{"sl":81},{"sl":84},{"sl":92},{"sl":100},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":143},{"sl":144},{"sl":145},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":154},{"sl":155},{"sl":156},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1903, 1945], [1903, 1945], [], [], [], [], [], [], [], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [], [], [], [], [], [], [], [], [], [], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [], [], [], [], [], [], [], [], [2036, 2054], [], [], [], [], [2036, 2054], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [], [], [], [], [], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [], [], [], [], [], [], [2036, 2054], [2036, 2054], [], [], [2036, 2054], [], [], [], [2036, 2054], [2036, 2054], [], [2036, 2054], [], [], [], [], [], [], [], [], [], [], [1903, 1945], [], [], [1903, 1945], [1903, 1945], [1903, 1945], [], [1903, 1945], [], [], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [1903, 1945], [], [], [2036, 2054], [], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [2036, 2054], [], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [2036, 2054], [], []]