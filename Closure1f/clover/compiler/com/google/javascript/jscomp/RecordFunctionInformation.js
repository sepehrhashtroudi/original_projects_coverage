var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":132,"id":49208,"methods":[{"el":52,"sc":3,"sl":46},{"el":59,"sc":3,"sl":57},{"el":73,"sc":9,"sl":70},{"el":80,"sc":3,"sl":61},{"el":104,"sc":3,"sl":82},{"el":131,"sc":3,"sl":117}],"name":"RecordFunctionInformation","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1036":{"methods":[{"sl":46},{"sl":57},{"sl":61},{"sl":70},{"sl":82},{"sl":117}],"name":"testModule","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":58},{"sl":63},{"sl":65},{"sl":69},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":84},{"sl":85},{"sl":88},{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":128}]},"test_17279":{"methods":[{"sl":46},{"sl":57},{"sl":61},{"sl":82},{"sl":117}],"name":"testFunction","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":58},{"sl":63},{"sl":65},{"sl":66},{"sl":84},{"sl":85},{"sl":88},{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":100},{"sl":118},{"sl":119},{"sl":120},{"sl":124},{"sl":125},{"sl":128}]},"test_18426":{"methods":[{"sl":46},{"sl":57},{"sl":61},{"sl":70},{"sl":82},{"sl":117}],"name":"testMotionPreservesOriginalSourceName","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":58},{"sl":63},{"sl":65},{"sl":69},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":84},{"sl":85},{"sl":88},{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":128}]},"test_2665":{"methods":[{"sl":46},{"sl":57},{"sl":61},{"sl":70},{"sl":82},{"sl":117}],"name":"testModule","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":58},{"sl":63},{"sl":65},{"sl":69},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":84},{"sl":85},{"sl":88},{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":128}]},"test_2754":{"methods":[{"sl":46},{"sl":57},{"sl":61},{"sl":82},{"sl":117}],"name":"testFunction","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":58},{"sl":63},{"sl":65},{"sl":66},{"sl":84},{"sl":85},{"sl":88},{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":100},{"sl":118},{"sl":119},{"sl":120},{"sl":124},{"sl":125},{"sl":128}]},"test_9278":{"methods":[{"sl":46},{"sl":57},{"sl":61},{"sl":70},{"sl":82},{"sl":117}],"name":"testMotionPreservesOriginalSourceName","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":58},{"sl":63},{"sl":65},{"sl":69},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":84},{"sl":85},{"sl":88},{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":128}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [], [], [], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [], [18426, 2665, 17279, 2754, 1036, 9278], [], [18426, 2665, 17279, 2754, 1036, 9278], [17279, 2754], [], [], [18426, 2665, 1036, 9278], [18426, 2665, 1036, 9278], [], [18426, 2665, 1036, 9278], [], [], [18426, 2665, 1036, 9278], [18426, 2665, 1036, 9278], [18426, 2665, 1036, 9278], [], [], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [], [], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [], [], [], [17279, 2754], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 17279, 2754, 1036, 9278], [18426, 2665, 1036, 9278], [18426, 2665, 1036, 9278], [], [17279, 2754], [17279, 2754], [], [], [18426, 2665, 17279, 2754, 1036, 9278], [], [], [], []]