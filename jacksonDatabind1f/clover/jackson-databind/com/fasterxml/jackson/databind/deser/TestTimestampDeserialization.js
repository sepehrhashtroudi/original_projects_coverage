var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":44629,"methods":[{"el":27,"sc":5,"sl":15},{"el":42,"sc":5,"sl":35}],"name":"TestTimestampDeserialization","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1251":{"methods":[{"sl":15},{"sl":35}],"name":"testTimestampUtil","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":21},{"sl":23},{"sl":24},{"sl":26},{"sl":40},{"sl":41}]},"test_2055":{"methods":[{"sl":15},{"sl":35}],"name":"testTimestampUtil","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":21},{"sl":23},{"sl":24},{"sl":26},{"sl":40},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2055, 1251], [], [2055, 1251], [2055, 1251], [], [], [2055, 1251], [], [2055, 1251], [2055, 1251], [], [2055, 1251], [], [], [], [], [], [], [], [], [2055, 1251], [], [], [], [], [2055, 1251], [2055, 1251], [], []]
