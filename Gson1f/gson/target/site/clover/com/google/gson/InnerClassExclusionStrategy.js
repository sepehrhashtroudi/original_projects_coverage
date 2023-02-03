var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":1006,"methods":[{"el":30,"sc":3,"sl":28},{"el":34,"sc":3,"sl":32},{"el":38,"sc":3,"sl":36},{"el":42,"sc":3,"sl":40}],"name":"InnerClassExclusionStrategy","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_156":{"methods":[{"sl":32},{"sl":36},{"sl":40}],"name":"testInnerClassExclusion","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41}]},"test_202":{"methods":[{"sl":32},{"sl":36},{"sl":40}],"name":"testExcludeInnerClassObject","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41}]},"test_331":{"methods":[{"sl":28},{"sl":36},{"sl":40}],"name":"testIncludeStaticNestedClassField","pass":true,"statements":[{"sl":29},{"sl":37},{"sl":41}]},"test_444":{"methods":[{"sl":28},{"sl":36},{"sl":40}],"name":"testExcludeInnerClassField","pass":true,"statements":[{"sl":29},{"sl":37},{"sl":41}]},"test_668":{"methods":[{"sl":32},{"sl":36},{"sl":40}],"name":"testIncludeStaticNestedClassObject","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [331, 444], [331, 444], [], [], [202, 668, 156], [202, 668, 156], [], [], [331, 202, 668, 444, 156], [331, 202, 668, 444, 156], [], [], [331, 202, 668, 444, 156], [331, 202, 668, 444, 156], [], []]
