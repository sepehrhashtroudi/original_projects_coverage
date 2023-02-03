var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":4101,"methods":[{"el":37,"sc":3,"sl":33},{"el":41,"sc":3,"sl":39},{"el":46,"sc":3,"sl":43},{"el":51,"sc":3,"sl":48},{"el":56,"sc":3,"sl":53},{"el":61,"sc":3,"sl":58}],"name":"ExposeAnnotationSerializationExclusionStrategyTest","sl":30},{"el":75,"id":4118,"methods":[],"name":"ExposeAnnotationSerializationExclusionStrategyTest.MockObject","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_128":{"methods":[{"sl":53}],"name":"testNeverSkipExposedAnnotatedFields","pass":true,"statements":[{"sl":54},{"sl":55}]},"test_232":{"methods":[{"sl":58}],"name":"testNeverSkipExplicitlyExposedAnnotatedFields","pass":true,"statements":[{"sl":59},{"sl":60}]},"test_437":{"methods":[{"sl":48}],"name":"testSkipExplicitlySkippedFields","pass":true,"statements":[{"sl":49},{"sl":50}]},"test_469":{"methods":[{"sl":43}],"name":"testSkipNonAnnotatedFields","pass":true,"statements":[{"sl":44},{"sl":45}]},"test_499":{"methods":[{"sl":39}],"name":"testNeverSkipClasses","pass":true,"statements":[{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [499], [499], [], [], [469], [469], [469], [], [], [437], [437], [437], [], [], [128], [128], [128], [], [], [232], [232], [232], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
