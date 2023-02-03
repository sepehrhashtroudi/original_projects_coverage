var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":596,"methods":[{"el":30,"sc":3,"sl":28},{"el":38,"sc":3,"sl":32}],"name":"ExposeAnnotationDeserializationExclusionStrategy","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_111":{"methods":[{"sl":28}],"name":"testNeverSkipClasses","pass":true,"statements":[{"sl":29}]},"test_142":{"methods":[{"sl":32}],"name":"testNeverSkipExposedAnnotatedFields","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":37}]},"test_198":{"methods":[{"sl":28},{"sl":32}],"name":"testNoExposedFieldDeserialization","pass":true,"statements":[{"sl":29},{"sl":33},{"sl":34},{"sl":35}]},"test_243":{"methods":[{"sl":28},{"sl":32}],"name":"testExposeAnnotationDeserialization","pass":true,"statements":[{"sl":29},{"sl":33},{"sl":34},{"sl":35},{"sl":37}]},"test_507":{"methods":[{"sl":32}],"name":"testSkipNonAnnotatedFields","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35}]},"test_532":{"methods":[{"sl":32}],"name":"testSkipExplicitlySkippedFields","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":37}]},"test_665":{"methods":[{"sl":28},{"sl":32}],"name":"testExposedInterfaceFieldDeserialization","pass":true,"statements":[{"sl":29},{"sl":33},{"sl":34},{"sl":37}]},"test_679":{"methods":[{"sl":32}],"name":"testNeverSkipExplicitlyExposedAnnotatedFields","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [111, 198, 243, 665], [111, 198, 243, 665], [], [], [679, 532, 142, 198, 507, 243, 665], [679, 532, 142, 198, 507, 243, 665], [679, 532, 142, 198, 507, 243, 665], [198, 507, 243], [], [679, 532, 142, 243, 665], [], []]
