var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":72,"id":7087,"methods":[{"el":40,"sc":3,"sl":35},{"el":44,"sc":3,"sl":42},{"el":49,"sc":3,"sl":46}],"name":"InterfaceTest","sl":29},{"el":53,"id":7096,"methods":[],"name":"InterfaceTest.TestObjectInterface","sl":51},{"el":62,"id":7096,"methods":[{"el":61,"sc":5,"sl":59}],"name":"InterfaceTest.TestObject","sl":55},{"el":71,"id":7098,"methods":[{"el":70,"sc":5,"sl":68}],"name":"InterfaceTest.TestObjectWrapper","sl":64}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_294":{"methods":[{"sl":46},{"sl":68}],"name":"testSerializingInterfaceObjectField","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":69}]},"test_680":{"methods":[{"sl":42}],"name":"testSerializingObjectImplementingInterface","pass":true,"statements":[{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [680], [680], [], [], [294], [294], [294], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [294], [294], [], [], []]
