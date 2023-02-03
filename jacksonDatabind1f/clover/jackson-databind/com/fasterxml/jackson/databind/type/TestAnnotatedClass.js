var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":87,"id":36944,"methods":[{"el":86,"sc":5,"sl":74}],"name":"TestAnnotatedClass","sl":13},{"el":29,"id":36944,"methods":[{"el":26,"sc":9,"sl":26},{"el":28,"sc":9,"sl":28}],"name":"TestAnnotatedClass.BaseClass","sl":22},{"el":37,"id":36947,"methods":[{"el":33,"sc":9,"sl":33},{"el":34,"sc":9,"sl":34},{"el":36,"sc":9,"sl":36}],"name":"TestAnnotatedClass.SubClass","sl":31},{"el":42,"id":36953,"methods":[],"name":"TestAnnotatedClass.GenericBase","sl":39},{"el":49,"id":36953,"methods":[{"el":48,"sc":9,"sl":47}],"name":"TestAnnotatedClass.NumberBean","sl":44},{"el":66,"id":36954,"methods":[],"name":"TestAnnotatedClass.FieldBean","sl":56}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1265":{"methods":[{"sl":74}],"name":"testFieldIntrospection","pass":true,"statements":[{"sl":77},{"sl":79},{"sl":80},{"sl":81},{"sl":82}]},"test_188":{"methods":[{"sl":74}],"name":"testFieldIntrospection","pass":true,"statements":[{"sl":77},{"sl":79},{"sl":80},{"sl":81},{"sl":82}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [188, 1265], [], [], [188, 1265], [], [188, 1265], [188, 1265], [188, 1265], [188, 1265], [], [], [], [], []]
