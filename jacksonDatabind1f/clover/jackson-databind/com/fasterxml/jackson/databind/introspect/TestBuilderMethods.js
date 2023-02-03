var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":43076,"methods":[{"el":40,"sc":5,"sl":30},{"el":54,"sc":5,"sl":48}],"name":"TestBuilderMethods","sl":10},{"el":20,"id":43076,"methods":[{"el":19,"sc":6,"sl":16}],"name":"TestBuilderMethods.SimpleBuilder","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1318":{"methods":[{"sl":30},{"sl":48}],"name":"testSimple","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":50},{"sl":52}]},"test_880":{"methods":[{"sl":30},{"sl":48}],"name":"testSimple","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":50},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [880, 1318], [], [880, 1318], [880, 1318], [880, 1318], [880, 1318], [880, 1318], [880, 1318], [880, 1318], [880, 1318], [], [], [], [], [], [], [], [], [880, 1318], [], [880, 1318], [], [880, 1318], [], [], [], []]
