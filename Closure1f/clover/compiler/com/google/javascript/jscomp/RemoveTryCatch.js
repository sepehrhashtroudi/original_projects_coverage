var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":114,"id":12441,"methods":[{"el":40,"sc":3,"sl":37},{"el":48,"sc":3,"sl":45}],"name":"RemoveTryCatch","sl":33},{"el":113,"id":12446,"methods":[{"el":112,"sc":5,"sl":51}],"name":"RemoveTryCatch.RemoveTryCatchCode","sl":50}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_14350":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testRemoveTryFinally","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":95},{"sl":97},{"sl":98}]},"test_14932":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testPreserveTryBlockContainingReturnStatement","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":70},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":107},{"sl":110}]},"test_15259":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testIfTryFinally","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":95},{"sl":97},{"sl":98}]},"test_16252":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testPreserveAnnotatedTryBlock","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":59}]},"test_1640":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testIfTryCatch","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":75},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":97},{"sl":98}]},"test_18573":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testRemoveTryCatchFinally","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":75},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":95},{"sl":97},{"sl":98}]},"test_3335":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testRemoveTryCatchFinally","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":75},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":95},{"sl":97},{"sl":98}]},"test_4317":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testIfTryCatch","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":75},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":97},{"sl":98}]},"test_6323":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testIfTryFinally","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":95},{"sl":97},{"sl":98}]},"test_6347":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testRemoveTryCatch","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":75},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":97},{"sl":98}]},"test_735":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testPreserveTryBlockContainingReturnStatement","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":70},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":107},{"sl":110}]},"test_7417":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testRemoveTryFinally","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":95},{"sl":97},{"sl":98}]},"test_8544":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testRemoveTryCatch","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":62},{"sl":63},{"sl":64},{"sl":68},{"sl":74},{"sl":75},{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":94},{"sl":97},{"sl":98}]},"test_9315":{"methods":[{"sl":37},{"sl":45},{"sl":51}],"name":"testPreserveAnnotatedTryBlock","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":47},{"sl":53},{"sl":54},{"sl":57},{"sl":58},{"sl":59}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [], [], [], [], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [], [], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 9315, 15259, 16252], [9315, 16252], [], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [], [], [], [7417, 14932, 14350, 6347, 735, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [], [14932, 735], [], [], [], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [6347, 8544, 1640, 4317, 18573, 3335], [], [], [], [], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [], [], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [], [], [], [], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [], [], [], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [7417, 14350, 6323, 18573, 3335, 15259], [], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [7417, 14350, 6347, 8544, 1640, 4317, 6323, 18573, 3335, 15259], [], [14932, 735], [14932, 735], [14932, 735], [14932, 735], [], [14932, 735], [14932, 735], [14932, 735], [], [], [14932, 735], [], [], [], []]