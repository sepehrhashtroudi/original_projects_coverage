var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":33930,"methods":[{"el":35,"sc":5,"sl":29}],"name":"TestStatics","sl":11},{"el":21,"id":33930,"methods":[{"el":18,"sc":9,"sl":18},{"el":20,"sc":9,"sl":20}],"name":"TestStatics.Bean","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2176":{"methods":[{"sl":20},{"sl":29}],"name":"testSimpleIgnore","pass":true,"statements":[{"sl":20},{"sl":31},{"sl":33},{"sl":34}]},"test_496":{"methods":[{"sl":20},{"sl":29}],"name":"testSimpleIgnore","pass":true,"statements":[{"sl":20},{"sl":31},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [496, 2176], [], [], [], [], [], [], [], [], [496, 2176], [], [496, 2176], [], [496, 2176], [496, 2176], [], []]
