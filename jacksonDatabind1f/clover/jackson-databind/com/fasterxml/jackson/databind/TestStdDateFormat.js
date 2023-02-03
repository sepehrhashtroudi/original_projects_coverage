var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":26,"id":31487,"methods":[{"el":16,"sc":5,"sl":10},{"el":25,"sc":5,"sl":18}],"name":"TestStdDateFormat","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":10}],"name":"testFactories","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15}]},"test_156":{"methods":[{"sl":18}],"name":"testInvalid","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":23}]},"test_1629":{"methods":[{"sl":10}],"name":"testFactories","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":15}]},"test_1755":{"methods":[{"sl":18}],"name":"testInvalid","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [123, 1629], [123, 1629], [123, 1629], [123, 1629], [123, 1629], [123, 1629], [], [], [1755, 156], [1755, 156], [1755, 156], [1755, 156], [], [1755, 156], [], [], []]
