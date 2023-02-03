var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":203,"id":36328,"methods":[{"el":97,"sc":5,"sl":88},{"el":115,"sc":5,"sl":102},{"el":137,"sc":5,"sl":120},{"el":177,"sc":5,"sl":148},{"el":187,"sc":5,"sl":182},{"el":202,"sc":5,"sl":192}],"name":"TestTypedSerialization","sl":12},{"el":29,"id":36328,"methods":[{"el":28,"sc":9,"sl":28}],"name":"TestTypedSerialization.Animal","sl":25},{"el":41,"id":36330,"methods":[{"el":36,"sc":9,"sl":36},{"el":40,"sc":9,"sl":37}],"name":"TestTypedSerialization.Dog","sl":32},{"el":53,"id":36335,"methods":[{"el":48,"sc":9,"sl":48},{"el":52,"sc":9,"sl":49}],"name":"TestTypedSerialization.Cat","sl":44},{"el":59,"id":36340,"methods":[{"el":58,"sc":9,"sl":58}],"name":"TestTypedSerialization.AnimalWrapper","sl":55},{"el":62,"id":36342,"methods":[],"name":"TestTypedSerialization.TypeWithWrapper","sl":62},{"el":65,"id":36342,"methods":[],"name":"TestTypedSerialization.TypeWithArray","sl":65},{"el":69,"id":36342,"methods":[],"name":"TestTypedSerialization.Empty","sl":69},{"el":72,"id":36342,"methods":[],"name":"TestTypedSerialization.Super","sl":72},{"el":73,"id":36342,"methods":[],"name":"TestTypedSerialization.A","sl":73},{"el":74,"id":36342,"methods":[],"name":"TestTypedSerialization.B","sl":74}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1145":{"methods":[{"sl":192}],"name":"testTypedMaps","pass":true,"statements":[{"sl":194},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201}]},"test_1421":{"methods":[{"sl":192}],"name":"testTypedMaps","pass":true,"statements":[{"sl":194},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":201}]},"test_1866":{"methods":[{"sl":28},{"sl":37},{"sl":58},{"sl":120}],"name":"testTypeAsArray","pass":true,"statements":[{"sl":28},{"sl":38},{"sl":39},{"sl":58},{"sl":122},{"sl":123},{"sl":125},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]},"test_1942":{"methods":[{"sl":28},{"sl":49},{"sl":102}],"name":"testTypeAsWrapper","pass":true,"statements":[{"sl":28},{"sl":50},{"sl":51},{"sl":104},{"sl":105},{"sl":106},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":114}]},"test_1950":{"methods":[{"sl":28},{"sl":37},{"sl":49},{"sl":148}],"name":"testInArray","pass":true,"statements":[{"sl":28},{"sl":38},{"sl":39},{"sl":50},{"sl":51},{"sl":152},{"sl":154},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_221":{"methods":[{"sl":28},{"sl":49},{"sl":102}],"name":"testTypeAsWrapper","pass":true,"statements":[{"sl":28},{"sl":50},{"sl":51},{"sl":104},{"sl":105},{"sl":106},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113},{"sl":114}]},"test_346":{"methods":[{"sl":182}],"name":"testEmptyBean","pass":true,"statements":[{"sl":184},{"sl":185},{"sl":186}]},"test_490":{"methods":[{"sl":28},{"sl":49},{"sl":88}],"name":"testSimpleClassAsProperty","pass":true,"statements":[{"sl":28},{"sl":50},{"sl":51},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":95},{"sl":96}]},"test_536":{"methods":[{"sl":182}],"name":"testEmptyBean","pass":true,"statements":[{"sl":184},{"sl":185},{"sl":186}]},"test_55":{"methods":[{"sl":28},{"sl":37},{"sl":49},{"sl":148}],"name":"testInArray","pass":true,"statements":[{"sl":28},{"sl":38},{"sl":39},{"sl":50},{"sl":51},{"sl":152},{"sl":154},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176}]},"test_706":{"methods":[{"sl":28},{"sl":37},{"sl":58},{"sl":120}],"name":"testTypeAsArray","pass":true,"statements":[{"sl":28},{"sl":38},{"sl":39},{"sl":58},{"sl":122},{"sl":123},{"sl":125},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136}]},"test_854":{"methods":[{"sl":28},{"sl":49},{"sl":88}],"name":"testSimpleClassAsProperty","pass":true,"statements":[{"sl":28},{"sl":50},{"sl":51},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":95},{"sl":96}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [221, 854, 1950, 1942, 1866, 490, 706, 55], [], [], [], [], [], [], [], [], [1950, 1866, 706, 55], [1950, 1866, 706, 55], [1950, 1866, 706, 55], [], [], [], [], [], [], [], [], [], [221, 854, 1950, 1942, 490, 55], [221, 854, 1950, 1942, 490, 55], [221, 854, 1950, 1942, 490, 55], [], [], [], [], [], [], [1866, 706], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [854, 490], [], [854, 490], [854, 490], [854, 490], [854, 490], [], [854, 490], [854, 490], [], [], [], [], [], [221, 1942], [], [221, 1942], [221, 1942], [221, 1942], [], [221, 1942], [], [221, 1942], [221, 1942], [221, 1942], [221, 1942], [221, 1942], [], [], [], [], [], [1866, 706], [], [1866, 706], [1866, 706], [], [1866, 706], [], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [1866, 706], [], [], [], [], [], [], [], [], [], [], [], [1950, 55], [], [], [], [1950, 55], [], [1950, 55], [], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [], [], [], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [1950, 55], [], [], [], [], [], [346, 536], [], [346, 536], [346, 536], [346, 536], [], [], [], [], [], [1145, 1421], [], [1145, 1421], [], [1145, 1421], [1145, 1421], [1145, 1421], [1145, 1421], [1145, 1421], [1145, 1421], [], [], []]