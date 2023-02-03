var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":42657,"methods":[{"el":43,"sc":5,"sl":36}],"name":"TestJsonSerialize3","sl":11},{"el":24,"id":42657,"methods":[{"el":23,"sc":9,"sl":15}],"name":"TestJsonSerialize3.FooToBarSerializer","sl":14},{"el":29,"id":42663,"methods":[],"name":"TestJsonSerialize3.MyObject","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1255":{"methods":[{"sl":15},{"sl":36}],"name":"testCustomContentSerializer","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42}]},"test_1639":{"methods":[{"sl":15},{"sl":36}],"name":"testCustomContentSerializer","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1639, 1255], [], [], [1639, 1255], [1639, 1255], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1639, 1255], [], [1639, 1255], [1639, 1255], [1639, 1255], [1639, 1255], [1639, 1255], [], []]
