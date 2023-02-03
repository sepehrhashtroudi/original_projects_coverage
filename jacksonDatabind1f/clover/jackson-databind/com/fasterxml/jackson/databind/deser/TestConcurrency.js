var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":98,"id":31636,"methods":[{"el":85,"sc":17,"sl":80},{"el":97,"sc":5,"sl":70}],"name":"TestConcurrency","sl":13},{"el":25,"id":31636,"methods":[],"name":"TestConcurrency.Bean","sl":22},{"el":62,"id":31636,"methods":[{"el":52,"sc":9,"sl":43},{"el":61,"sc":9,"sl":54}],"name":"TestConcurrency.BeanDeserializer","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1407":{"methods":[{"sl":43},{"sl":54},{"sl":70},{"sl":80}],"name":"testDeserializerResolution","pass":true,"statements":[{"sl":46},{"sl":49},{"sl":50},{"sl":51},{"sl":57},{"sl":58},{"sl":60},{"sl":75},{"sl":77},{"sl":78},{"sl":79},{"sl":82},{"sl":83},{"sl":87},{"sl":88},{"sl":90},{"sl":92},{"sl":94},{"sl":95}]},"test_1842":{"methods":[{"sl":43},{"sl":54},{"sl":70},{"sl":80}],"name":"testDeserializerResolution","pass":true,"statements":[{"sl":46},{"sl":49},{"sl":50},{"sl":51},{"sl":57},{"sl":58},{"sl":60},{"sl":75},{"sl":77},{"sl":78},{"sl":79},{"sl":82},{"sl":83},{"sl":87},{"sl":88},{"sl":90},{"sl":92},{"sl":94},{"sl":95}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1842, 1407], [], [], [1842, 1407], [], [], [1842, 1407], [1842, 1407], [1842, 1407], [], [], [1842, 1407], [], [], [1842, 1407], [1842, 1407], [], [1842, 1407], [], [], [], [], [], [], [], [], [], [1842, 1407], [], [], [], [], [1842, 1407], [], [1842, 1407], [1842, 1407], [1842, 1407], [1842, 1407], [], [1842, 1407], [1842, 1407], [], [], [], [1842, 1407], [1842, 1407], [], [1842, 1407], [], [1842, 1407], [], [1842, 1407], [1842, 1407], [], [], []]
