var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":31664,"methods":[{"el":34,"sc":5,"sl":27},{"el":46,"sc":5,"sl":36}],"name":"TestFormatDetection","sl":7},{"el":19,"id":31664,"methods":[{"el":14,"sc":9,"sl":14},{"el":18,"sc":9,"sl":15}],"name":"TestFormatDetection.POJO","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1922":{"methods":[{"sl":14},{"sl":27}],"name":"testSimpleWithJSON","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_2028":{"methods":[{"sl":14},{"sl":27}],"name":"testSimpleWithJSON","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_621":{"methods":[{"sl":36}],"name":"testInvalid","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44}]},"test_692":{"methods":[{"sl":36}],"name":"testInvalid","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [2028, 1922], [], [], [], [], [], [], [], [], [], [], [], [], [2028, 1922], [], [2028, 1922], [2028, 1922], [2028, 1922], [2028, 1922], [2028, 1922], [], [], [692, 621], [], [692, 621], [692, 621], [692, 621], [692, 621], [], [], [692, 621], [], [], []]
