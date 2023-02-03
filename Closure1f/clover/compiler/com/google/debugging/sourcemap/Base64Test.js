var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":110940,"methods":[{"el":29,"sc":3,"sl":25},{"el":37,"sc":3,"sl":31},{"el":41,"sc":3,"sl":39}],"name":"Base64Test","sl":24}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10126":{"methods":[{"sl":25},{"sl":39}],"name":"testBase64","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":40}]},"test_11030":{"methods":[{"sl":31}],"name":"testBase64EncodeInt","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_11161":{"methods":[{"sl":31}],"name":"testBase64EncodeInt","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_17205":{"methods":[{"sl":25},{"sl":39}],"name":"testBase64","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":40}]},"test_17567":{"methods":[{"sl":31}],"name":"testBase64EncodeInt","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_7226":{"methods":[{"sl":25},{"sl":39}],"name":"testBase64","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [17205, 10126, 7226], [17205, 10126, 7226], [17205, 10126, 7226], [], [], [], [11030, 11161, 17567], [11030, 11161, 17567], [11030, 11161, 17567], [11030, 11161, 17567], [11030, 11161, 17567], [11030, 11161, 17567], [], [], [17205, 10126, 7226], [17205, 10126, 7226], [], []]
