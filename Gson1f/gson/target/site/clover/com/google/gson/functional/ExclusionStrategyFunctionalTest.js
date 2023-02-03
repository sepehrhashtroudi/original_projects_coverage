var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":112,"id":6782,"methods":[{"el":52,"sc":3,"sl":44},{"el":59,"sc":3,"sl":54},{"el":73,"sc":3,"sl":61}],"name":"ExclusionStrategyFunctionalTest","sl":40},{"el":79,"id":6800,"methods":[],"name":"ExclusionStrategyFunctionalTest.Foo","sl":77},{"el":95,"id":6800,"methods":[{"el":94,"sc":5,"sl":89}],"name":"ExclusionStrategyFunctionalTest.SampleObjectForTest","sl":82},{"el":111,"id":6805,"methods":[{"el":102,"sc":5,"sl":100},{"el":106,"sc":5,"sl":104},{"el":110,"sc":5,"sl":108}],"name":"ExclusionStrategyFunctionalTest.MyExclusionStrategy","sl":97}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_273":{"methods":[{"sl":61},{"sl":89},{"sl":104},{"sl":108}],"name":"testExclusionStrategyDeserialization","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":105},{"sl":109}]},"test_589":{"methods":[{"sl":54},{"sl":104},{"sl":108}],"name":"testExclusionStrategySerialization","pass":true,"statements":[{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":105},{"sl":109}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [589], [589], [589], [589], [589], [], [], [273], [273], [273], [273], [273], [], [273], [273], [], [], [273], [273], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [273], [273], [273], [273], [273], [], [], [], [], [], [], [], [], [], [], [589, 273], [589, 273], [], [], [589, 273], [589, 273], [], [], []]
