var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":6008,"methods":[{"el":29,"sc":2,"sl":27},{"el":33,"sc":2,"sl":31},{"el":38,"sc":2,"sl":35},{"el":43,"sc":2,"sl":40}],"name":"MemoryArchiveEntry","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_147":{"methods":[{"sl":27},{"sl":31}],"name":"testReading","pass":true,"statements":[{"sl":28},{"sl":32}]},"test_217":{"methods":[{"sl":27},{"sl":31}],"name":"testReading","pass":true,"statements":[{"sl":28},{"sl":32}]},"test_44":{"methods":[{"sl":27},{"sl":31}],"name":"testReading","pass":true,"statements":[{"sl":28},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [217, 44, 147], [217, 44, 147], [], [], [217, 44, 147], [217, 44, 147], [], [], [], [], [], [], [], [], [], [], [], [], []]
