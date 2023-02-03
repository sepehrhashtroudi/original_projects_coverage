var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":4220,"methods":[{"el":40,"sc":3,"sl":34},{"el":45,"sc":3,"sl":42},{"el":50,"sc":3,"sl":47},{"el":55,"sc":3,"sl":52},{"el":60,"sc":3,"sl":57}],"name":"InnerClassExclusionStrategyTest","sl":28},{"el":63,"id":4237,"methods":[],"name":"InnerClassExclusionStrategyTest.InnerClass","sl":62},{"el":66,"id":4237,"methods":[],"name":"InnerClassExclusionStrategyTest.StaticNestedClass","sl":65}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_202":{"methods":[{"sl":42}],"name":"testExcludeInnerClassObject","pass":true,"statements":[{"sl":43},{"sl":44}]},"test_331":{"methods":[{"sl":57}],"name":"testIncludeStaticNestedClassField","pass":true,"statements":[{"sl":58},{"sl":59}]},"test_444":{"methods":[{"sl":47}],"name":"testExcludeInnerClassField","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_668":{"methods":[{"sl":52}],"name":"testIncludeStaticNestedClassObject","pass":true,"statements":[{"sl":53},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [202], [202], [202], [], [], [444], [444], [444], [], [], [668], [668], [668], [], [], [331], [331], [331], [], [], [], [], [], [], [], []]
