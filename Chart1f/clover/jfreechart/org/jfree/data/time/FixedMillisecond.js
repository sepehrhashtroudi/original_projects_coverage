var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":290,"id":37216,"methods":[{"el":75,"sc":5,"sl":73},{"el":84,"sc":5,"sl":82},{"el":93,"sc":5,"sl":91},{"el":102,"sc":5,"sl":100},{"el":113,"sc":5,"sl":111},{"el":127,"sc":5,"sl":120},{"el":141,"sc":5,"sl":134},{"el":159,"sc":5,"sl":150},{"el":168,"sc":5,"sl":166},{"el":218,"sc":5,"sl":179},{"el":227,"sc":5,"sl":225},{"el":239,"sc":5,"sl":237},{"el":248,"sc":5,"sl":246},{"el":259,"sc":5,"sl":257},{"el":268,"sc":5,"sl":266},{"el":279,"sc":5,"sl":277},{"el":288,"sc":5,"sl":286}],"name":"FixedMillisecond","sl":61}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1379":{"methods":[{"sl":82},{"sl":91}],"name":"testNotCloneable","pass":true,"statements":[{"sl":83},{"sl":92}]},"test_2305":{"methods":[{"sl":82},{"sl":91}],"name":"testNotCloneable","pass":true,"statements":[{"sl":83},{"sl":92}]},"test_2307":{"methods":[{"sl":82},{"sl":91},{"sl":179}],"name":"testBug1075255","pass":true,"statements":[{"sl":83},{"sl":92},{"sl":181},{"sl":182},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":193},{"sl":197},{"sl":216}]},"test_2483":{"methods":[{"sl":91},{"sl":225}],"name":"testImmutability","pass":true,"statements":[{"sl":92},{"sl":226}]},"test_2574":{"methods":[{"sl":82},{"sl":91},{"sl":150},{"sl":166},{"sl":225}],"name":"testHashcode","pass":true,"statements":[{"sl":83},{"sl":92},{"sl":151},{"sl":152},{"sl":153},{"sl":167},{"sl":226}]},"test_2657":{"methods":[{"sl":73},{"sl":91},{"sl":150},{"sl":225}],"name":"testSerialization","pass":true,"statements":[{"sl":74},{"sl":92},{"sl":151},{"sl":152},{"sl":153},{"sl":226}]},"test_2946":{"methods":[{"sl":82},{"sl":91},{"sl":179}],"name":"testBug1075255","pass":true,"statements":[{"sl":83},{"sl":92},{"sl":181},{"sl":182},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":193},{"sl":197},{"sl":216}]},"test_3641":{"methods":[{"sl":73},{"sl":91},{"sl":150},{"sl":225}],"name":"testSerialization","pass":true,"statements":[{"sl":74},{"sl":92},{"sl":151},{"sl":152},{"sl":153},{"sl":226}]},"test_3913":{"methods":[{"sl":82},{"sl":91},{"sl":150},{"sl":166},{"sl":225}],"name":"testHashcode","pass":true,"statements":[{"sl":83},{"sl":92},{"sl":151},{"sl":152},{"sl":153},{"sl":167},{"sl":226}]},"test_4083":{"methods":[{"sl":91},{"sl":225}],"name":"testImmutability","pass":true,"statements":[{"sl":92},{"sl":226}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2657, 3641], [2657, 3641], [], [], [], [], [], [], [], [2946, 2305, 3913, 2307, 1379, 2574], [2946, 2305, 3913, 2307, 1379, 2574], [], [], [], [], [], [], [], [2946, 2305, 2483, 3913, 4083, 2307, 2657, 3641, 1379, 2574], [2946, 2305, 2483, 3913, 4083, 2307, 2657, 3641, 1379, 2574], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3913, 2657, 3641, 2574], [3913, 2657, 3641, 2574], [3913, 2657, 3641, 2574], [3913, 2657, 3641, 2574], [], [], [], [], [], [], [], [], [], [], [], [], [3913, 2574], [3913, 2574], [], [], [], [], [], [], [], [], [], [], [], [2946, 2307], [], [2946, 2307], [2946, 2307], [], [], [], [2946, 2307], [2946, 2307], [2946, 2307], [2946, 2307], [], [], [], [2946, 2307], [], [], [], [2946, 2307], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2946, 2307], [], [], [], [], [], [], [], [], [2483, 3913, 4083, 2657, 3641, 2574], [2483, 3913, 4083, 2657, 3641, 2574], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]