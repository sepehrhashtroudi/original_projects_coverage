var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":190,"id":28887,"methods":[{"el":84,"sc":5,"sl":82},{"el":93,"sc":5,"sl":91},{"el":105,"sc":5,"sl":102},{"el":129,"sc":5,"sl":116},{"el":161,"sc":5,"sl":140},{"el":189,"sc":5,"sl":170}],"name":"StandardPieURLGenerator","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1278":{"methods":[{"sl":102},{"sl":116},{"sl":140}],"name":"testURL","pass":true,"statements":[{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":150},{"sl":154},{"sl":156},{"sl":157},{"sl":160}]},"test_1497":{"methods":[{"sl":91},{"sl":102},{"sl":116},{"sl":170}],"name":"testEquals","pass":true,"statements":[{"sl":92},{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":171},{"sl":174},{"sl":175},{"sl":177},{"sl":178},{"sl":181},{"sl":184},{"sl":188}]},"test_1836":{"methods":[{"sl":102},{"sl":116},{"sl":170}],"name":"testSerialization","pass":true,"statements":[{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":171},{"sl":174},{"sl":177},{"sl":178},{"sl":181},{"sl":184},{"sl":188}]},"test_2513":{"methods":[{"sl":102},{"sl":116}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128}]},"test_2652":{"methods":[{"sl":82},{"sl":91},{"sl":102},{"sl":116},{"sl":170}],"name":"testEquals","pass":true,"statements":[{"sl":83},{"sl":92},{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":171},{"sl":174},{"sl":177},{"sl":178},{"sl":179},{"sl":181},{"sl":182},{"sl":184},{"sl":186},{"sl":188}]},"test_3154":{"methods":[{"sl":91},{"sl":102},{"sl":116},{"sl":170}],"name":"testEquals","pass":true,"statements":[{"sl":92},{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":171},{"sl":174},{"sl":175},{"sl":177},{"sl":178},{"sl":181},{"sl":184},{"sl":188}]},"test_3374":{"methods":[{"sl":82},{"sl":91},{"sl":102},{"sl":116},{"sl":170}],"name":"testEquals","pass":true,"statements":[{"sl":83},{"sl":92},{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":171},{"sl":174},{"sl":177},{"sl":178},{"sl":179},{"sl":181},{"sl":182},{"sl":184},{"sl":186},{"sl":188}]},"test_3945":{"methods":[{"sl":102},{"sl":116},{"sl":170}],"name":"testSerialization","pass":true,"statements":[{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":171},{"sl":174},{"sl":177},{"sl":178},{"sl":181},{"sl":184},{"sl":188}]},"test_4109":{"methods":[{"sl":102},{"sl":116},{"sl":140}],"name":"testURL","pass":true,"statements":[{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128},{"sl":142},{"sl":143},{"sl":144},{"sl":145},{"sl":150},{"sl":154},{"sl":156},{"sl":157},{"sl":160}]},"test_632":{"methods":[{"sl":102},{"sl":116}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":104},{"sl":119},{"sl":122},{"sl":126},{"sl":127},{"sl":128}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2652, 3374], [2652, 3374], [], [], [], [], [], [], [], [3154, 2652, 1497, 3374], [3154, 2652, 1497, 3374], [], [], [], [], [], [], [], [], [], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [], [], [], [], [], [], [], [], [], [], [], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [], [], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [], [], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [], [], [], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [2513, 3154, 2652, 1836, 1278, 632, 1497, 3945, 4109, 3374], [], [], [], [], [], [], [], [], [], [], [], [1278, 4109], [], [1278, 4109], [1278, 4109], [1278, 4109], [1278, 4109], [], [], [], [], [1278, 4109], [], [], [], [1278, 4109], [], [1278, 4109], [1278, 4109], [], [], [1278, 4109], [], [], [], [], [], [], [], [], [], [3154, 2652, 1836, 1497, 3945, 3374], [3154, 2652, 1836, 1497, 3945, 3374], [], [], [3154, 2652, 1836, 1497, 3945, 3374], [3154, 1497], [], [3154, 2652, 1836, 1497, 3945, 3374], [3154, 2652, 1836, 1497, 3945, 3374], [2652, 3374], [], [3154, 2652, 1836, 1497, 3945, 3374], [2652, 3374], [], [3154, 2652, 1836, 1497, 3945, 3374], [], [2652, 3374], [], [3154, 2652, 1836, 1497, 3945, 3374], [], []]