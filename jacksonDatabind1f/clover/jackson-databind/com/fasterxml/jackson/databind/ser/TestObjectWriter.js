var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":40701,"methods":[{"el":36,"sc":5,"sl":16},{"el":44,"sc":5,"sl":38}],"name":"TestObjectWriter","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1571":{"methods":[{"sl":16}],"name":"testPrettyPrinter","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":24},{"sl":27},{"sl":30},{"sl":31},{"sl":34},{"sl":35}]},"test_238":{"methods":[{"sl":38}],"name":"testPrefetch","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":43}]},"test_703":{"methods":[{"sl":16}],"name":"testPrettyPrinter","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":24},{"sl":27},{"sl":30},{"sl":31},{"sl":34},{"sl":35}]},"test_993":{"methods":[{"sl":38}],"name":"testPrefetch","pass":true,"statements":[{"sl":40},{"sl":41},{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1571, 703], [], [1571, 703], [1571, 703], [1571, 703], [1571, 703], [], [], [1571, 703], [], [], [1571, 703], [], [], [1571, 703], [1571, 703], [], [], [1571, 703], [1571, 703], [], [], [238, 993], [], [238, 993], [238, 993], [238, 993], [238, 993], [], []]
