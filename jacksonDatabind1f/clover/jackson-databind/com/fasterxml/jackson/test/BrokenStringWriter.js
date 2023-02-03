var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":44156,"methods":[{"el":13,"sc":5,"sl":10},{"el":19,"sc":5,"sl":15},{"el":25,"sc":5,"sl":21},{"el":31,"sc":5,"sl":27}],"name":"BrokenStringWriter","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1234":{"methods":[{"sl":10},{"sl":15}],"name":"testExceptionWithSimpleMapper","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":18}]},"test_1746":{"methods":[{"sl":10},{"sl":15}],"name":"testExceptionWithMapperAndGenerator","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":18}]},"test_2094":{"methods":[{"sl":10},{"sl":15}],"name":"testExceptionWithGeneratorMapping","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":18}]},"test_315":{"methods":[{"sl":10},{"sl":15}],"name":"testExceptionWithSimpleMapper","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":18}]},"test_464":{"methods":[{"sl":10},{"sl":15}],"name":"testExceptionWithGeneratorMapping","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":18}]},"test_657":{"methods":[{"sl":10},{"sl":15}],"name":"testExceptionWithMapperAndGenerator","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [1234, 2094, 1746, 464, 657, 315], [1234, 2094, 1746, 464, 657, 315], [1234, 2094, 1746, 464, 657, 315], [], [], [1234, 2094, 1746, 464, 657, 315], [], [], [1234, 2094, 1746, 464, 657, 315], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
