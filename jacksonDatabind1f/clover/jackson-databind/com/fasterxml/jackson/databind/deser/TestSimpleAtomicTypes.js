var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":32961,"methods":[{"el":15,"sc":5,"sl":10},{"el":22,"sc":5,"sl":17},{"el":29,"sc":5,"sl":24},{"el":44,"sc":5,"sl":31}],"name":"TestSimpleAtomicTypes","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_175":{"methods":[{"sl":24}],"name":"testAtomicLong","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_1782":{"methods":[{"sl":17}],"name":"testAtomicInt","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_1828":{"methods":[{"sl":17}],"name":"testAtomicInt","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21}]},"test_1895":{"methods":[{"sl":10}],"name":"testAtomicBoolean","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_1951":{"methods":[{"sl":24}],"name":"testAtomicLong","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28}]},"test_331":{"methods":[{"sl":31}],"name":"testAtomicReference","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_441":{"methods":[{"sl":31}],"name":"testAtomicReference","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_912":{"methods":[{"sl":10}],"name":"testAtomicBoolean","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [912, 1895], [], [912, 1895], [912, 1895], [912, 1895], [], [], [1782, 1828], [], [1782, 1828], [1782, 1828], [1782, 1828], [], [], [175, 1951], [], [175, 1951], [175, 1951], [175, 1951], [], [], [441, 331], [], [441, 331], [441, 331], [], [441, 331], [441, 331], [441, 331], [441, 331], [441, 331], [441, 331], [441, 331], [441, 331], [], []]
