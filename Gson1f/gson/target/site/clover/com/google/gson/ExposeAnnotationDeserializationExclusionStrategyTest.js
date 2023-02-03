var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":4084,"methods":[{"el":37,"sc":3,"sl":33},{"el":41,"sc":3,"sl":39},{"el":46,"sc":3,"sl":43},{"el":51,"sc":3,"sl":48},{"el":56,"sc":3,"sl":53},{"el":61,"sc":3,"sl":58}],"name":"ExposeAnnotationDeserializationExclusionStrategyTest","sl":30},{"el":75,"id":4101,"methods":[],"name":"ExposeAnnotationDeserializationExclusionStrategyTest.MockObject","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_111":{"methods":[{"sl":39}],"name":"testNeverSkipClasses","pass":true,"statements":[{"sl":40}]},"test_142":{"methods":[{"sl":53}],"name":"testNeverSkipExposedAnnotatedFields","pass":true,"statements":[{"sl":54},{"sl":55}]},"test_507":{"methods":[{"sl":43}],"name":"testSkipNonAnnotatedFields","pass":true,"statements":[{"sl":44},{"sl":45}]},"test_532":{"methods":[{"sl":48}],"name":"testSkipExplicitlySkippedFields","pass":true,"statements":[{"sl":49},{"sl":50}]},"test_679":{"methods":[{"sl":58}],"name":"testNeverSkipExplicitlyExposedAnnotatedFields","pass":true,"statements":[{"sl":59},{"sl":60}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [111], [111], [], [], [507], [507], [507], [], [], [532], [532], [532], [], [], [142], [142], [142], [], [], [679], [679], [679], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
