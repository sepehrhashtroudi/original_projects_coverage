var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":934,"methods":[{"el":28,"sc":5,"sl":26},{"el":35,"sc":5,"sl":30},{"el":45,"sc":5,"sl":37},{"el":52,"sc":5,"sl":47},{"el":59,"sc":5,"sl":54}],"name":"RawSerializer","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1367":{"methods":[{"sl":26},{"sl":30}],"name":"testSimpleNonStringGetter","pass":true,"statements":[{"sl":27},{"sl":34}]},"test_163":{"methods":[{"sl":26},{"sl":30}],"name":"testSimpleStringGetter","pass":true,"statements":[{"sl":27},{"sl":34}]},"test_1672":{"methods":[{"sl":26}],"name":"testNullStringGetter","pass":true,"statements":[{"sl":27}]},"test_2131":{"methods":[{"sl":26},{"sl":30}],"name":"testSimpleStringGetter","pass":true,"statements":[{"sl":27},{"sl":34}]},"test_370":{"methods":[{"sl":26},{"sl":30}],"name":"testSimpleNonStringGetter","pass":true,"statements":[{"sl":27},{"sl":34}]},"test_451":{"methods":[{"sl":26}],"name":"testNullStringGetter","pass":true,"statements":[{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [451, 1367, 2131, 1672, 163, 370], [451, 1367, 2131, 1672, 163, 370], [], [], [1367, 2131, 163, 370], [], [], [], [1367, 2131, 163, 370], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
