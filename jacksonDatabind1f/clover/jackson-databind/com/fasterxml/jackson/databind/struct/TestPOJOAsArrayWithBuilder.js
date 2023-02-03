var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":63,"id":41462,"methods":[{"el":62,"sc":5,"sl":56}],"name":"TestPOJOAsArrayWithBuilder","sl":13},{"el":26,"id":41462,"methods":[{"el":25,"sc":9,"sl":22}],"name":"TestPOJOAsArrayWithBuilder.ValueClassXY","sl":18},{"el":46,"id":41465,"methods":[{"el":36,"sc":9,"sl":33},{"el":41,"sc":9,"sl":38},{"el":45,"sc":9,"sl":43}],"name":"TestPOJOAsArrayWithBuilder.SimpleBuilderXY","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1324":{"methods":[{"sl":22},{"sl":33},{"sl":38},{"sl":43},{"sl":56}],"name":"testSimpleBuilder","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":34},{"sl":35},{"sl":39},{"sl":40},{"sl":44},{"sl":59},{"sl":60},{"sl":61}]},"test_741":{"methods":[{"sl":22},{"sl":33},{"sl":38},{"sl":43},{"sl":56}],"name":"testSimpleBuilder","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":34},{"sl":35},{"sl":39},{"sl":40},{"sl":44},{"sl":59},{"sl":60},{"sl":61}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1324, 741], [1324, 741], [1324, 741], [], [], [], [], [], [], [], [], [1324, 741], [1324, 741], [1324, 741], [], [], [1324, 741], [1324, 741], [1324, 741], [], [], [1324, 741], [1324, 741], [], [], [], [], [], [], [], [], [], [], [], [1324, 741], [], [], [1324, 741], [1324, 741], [1324, 741], [], []]
