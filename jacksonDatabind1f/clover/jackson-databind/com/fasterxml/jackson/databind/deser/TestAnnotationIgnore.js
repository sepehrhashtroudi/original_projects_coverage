var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":41971,"methods":[{"el":52,"sc":5,"sl":43}],"name":"TestAnnotationIgnore","sl":11},{"el":35,"id":41971,"methods":[{"el":26,"sc":9,"sl":26},{"el":27,"sc":9,"sl":27},{"el":34,"sc":9,"sl":32}],"name":"TestAnnotationIgnore.SizeClassIgnore","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1581":{"methods":[{"sl":26},{"sl":32},{"sl":43}],"name":"testSimpleIgnore","pass":true,"statements":[{"sl":26},{"sl":33},{"sl":45},{"sl":46},{"sl":50},{"sl":51}]},"test_1655":{"methods":[{"sl":26},{"sl":32},{"sl":43}],"name":"testSimpleIgnore","pass":true,"statements":[{"sl":26},{"sl":33},{"sl":45},{"sl":46},{"sl":50},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1655, 1581], [], [], [], [], [], [1655, 1581], [1655, 1581], [], [], [], [], [], [], [], [], [], [1655, 1581], [], [1655, 1581], [1655, 1581], [], [], [], [1655, 1581], [1655, 1581], [], [], []]
