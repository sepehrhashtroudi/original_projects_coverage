var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":183,"id":1416,"methods":[{"el":42,"sc":5,"sl":40},{"el":140,"sc":5,"sl":50},{"el":159,"sc":5,"sl":154},{"el":169,"sc":5,"sl":167},{"el":181,"sc":5,"sl":179}],"name":"Caverphone","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_120":{"methods":[{"sl":40},{"sl":50}],"name":"testSpecificationExamples","pass":true,"statements":[{"sl":41},{"sl":54},{"sl":59},{"sl":62},{"sl":65},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":121},{"sl":122},{"sl":123},{"sl":125},{"sl":131},{"sl":132},{"sl":133},{"sl":136},{"sl":139}]},"test_159":{"methods":[{"sl":40},{"sl":50},{"sl":154}],"name":"testEncodeEmpty","pass":true,"statements":[{"sl":41},{"sl":54},{"sl":55},{"sl":59},{"sl":62},{"sl":65},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":121},{"sl":122},{"sl":123},{"sl":125},{"sl":131},{"sl":132},{"sl":133},{"sl":136},{"sl":139},{"sl":155},{"sl":158}]},"test_33":{"methods":[{"sl":40},{"sl":50},{"sl":167}],"name":"testEncodeNull","pass":true,"statements":[{"sl":41},{"sl":54},{"sl":55},{"sl":168}]},"test_51":{"methods":[{"sl":40},{"sl":50},{"sl":167}],"name":"testLocaleIndependence","pass":true,"statements":[{"sl":41},{"sl":54},{"sl":59},{"sl":62},{"sl":65},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":121},{"sl":122},{"sl":123},{"sl":125},{"sl":131},{"sl":132},{"sl":133},{"sl":136},{"sl":139},{"sl":168}]},"test_97":{"methods":[{"sl":40},{"sl":154}],"name":"testEncodeWithInvalidObject","pass":true,"statements":[{"sl":41},{"sl":155},{"sl":156}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [159, 33, 97, 120, 51], [159, 33, 97, 120, 51], [], [], [], [], [], [], [], [], [159, 33, 120, 51], [], [], [], [159, 33, 120, 51], [159, 33], [], [], [], [159, 120, 51], [], [], [159, 120, 51], [], [], [159, 120, 51], [], [], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [], [], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [], [159, 120, 51], [159, 120, 51], [], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [159, 120, 51], [], [159, 120, 51], [159, 120, 51], [159, 120, 51], [], [159, 120, 51], [], [], [], [], [], [159, 120, 51], [159, 120, 51], [159, 120, 51], [], [], [159, 120, 51], [], [], [159, 120, 51], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [159, 97], [159, 97], [97], [], [159], [], [], [], [], [], [], [], [], [33, 51], [33, 51], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]