var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":43091,"methods":[{"el":17,"sc":5,"sl":8},{"el":25,"sc":5,"sl":20}],"name":"TestGenericFieldInSubtype","sl":5},{"el":36,"id":43102,"methods":[],"name":"Result677","sl":29},{"el":35,"id":43102,"methods":[{"el":33,"sc":6,"sl":33},{"el":34,"sc":6,"sl":34}],"name":"Result677.Success677","sl":30},{"el":44,"id":43105,"methods":[],"name":"BaseType","sl":38},{"el":43,"id":43105,"methods":[],"name":"BaseType.SubType","sl":41}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1512":{"methods":[{"sl":20}],"name":"testInnerType","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24}]},"test_1694":{"methods":[{"sl":8},{"sl":34}],"name":"test677","pass":true,"statements":[{"sl":10},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":34}]},"test_1989":{"methods":[{"sl":8},{"sl":34}],"name":"test677","pass":true,"statements":[{"sl":10},{"sl":12},{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":34}]},"test_578":{"methods":[{"sl":20}],"name":"testInnerType","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [1989, 1694], [], [1989, 1694], [], [1989, 1694], [1989, 1694], [1989, 1694], [1989, 1694], [1989, 1694], [], [], [], [1512, 578], [], [1512, 578], [1512, 578], [1512, 578], [], [], [], [], [], [], [], [], [], [1989, 1694], [], [], [], [], [], [], [], [], [], []]
