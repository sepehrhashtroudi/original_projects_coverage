var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1084,"id":25515,"methods":[{"el":47,"sc":5,"sl":44},{"el":54,"sc":5,"sl":51},{"el":60,"sc":5,"sl":56},{"el":67,"sc":5,"sl":62},{"el":78,"sc":5,"sl":69},{"el":83,"sc":5,"sl":80},{"el":88,"sc":5,"sl":85},{"el":96,"sc":5,"sl":93},{"el":105,"sc":5,"sl":101},{"el":117,"sc":5,"sl":110},{"el":126,"sc":5,"sl":124},{"el":152,"sc":5,"sl":143},{"el":161,"sc":5,"sl":154},{"el":170,"sc":5,"sl":163},{"el":179,"sc":5,"sl":172},{"el":188,"sc":5,"sl":181},{"el":197,"sc":5,"sl":190},{"el":206,"sc":5,"sl":199},{"el":215,"sc":5,"sl":208},{"el":224,"sc":5,"sl":217},{"el":233,"sc":5,"sl":226},{"el":244,"sc":5,"sl":237},{"el":254,"sc":5,"sl":247},{"el":263,"sc":5,"sl":256},{"el":272,"sc":5,"sl":265},{"el":281,"sc":5,"sl":274},{"el":290,"sc":5,"sl":283},{"el":299,"sc":5,"sl":292},{"el":309,"sc":5,"sl":301},{"el":313,"sc":5,"sl":312},{"el":361,"sc":5,"sl":338},{"el":381,"sc":5,"sl":377},{"el":409,"sc":5,"sl":402},{"el":426,"sc":5,"sl":414},{"el":448,"sc":5,"sl":428},{"el":537,"sc":5,"sl":532},{"el":548,"sc":5,"sl":544},{"el":560,"sc":5,"sl":556},{"el":577,"sc":5,"sl":568},{"el":605,"sc":5,"sl":585},{"el":610,"sc":5,"sl":607},{"el":621,"sc":5,"sl":613},{"el":631,"sc":5,"sl":623},{"el":649,"sc":5,"sl":633},{"el":667,"sc":5,"sl":651},{"el":674,"sc":5,"sl":669},{"el":682,"sc":5,"sl":676},{"el":689,"sc":5,"sl":684},{"el":696,"sc":5,"sl":691},{"el":703,"sc":5,"sl":698},{"el":711,"sc":5,"sl":705},{"el":718,"sc":5,"sl":713},{"el":725,"sc":5,"sl":720},{"el":736,"sc":5,"sl":728},{"el":746,"sc":5,"sl":738},{"el":756,"sc":5,"sl":748},{"el":766,"sc":5,"sl":758},{"el":776,"sc":5,"sl":768},{"el":786,"sc":5,"sl":778},{"el":796,"sc":5,"sl":788},{"el":806,"sc":5,"sl":798},{"el":816,"sc":5,"sl":808},{"el":826,"sc":5,"sl":818},{"el":836,"sc":5,"sl":828},{"el":846,"sc":5,"sl":838},{"el":856,"sc":5,"sl":848},{"el":866,"sc":5,"sl":858},{"el":876,"sc":5,"sl":868},{"el":886,"sc":5,"sl":878},{"el":896,"sc":5,"sl":888},{"el":907,"sc":5,"sl":898},{"el":933,"sc":5,"sl":918},{"el":953,"sc":5,"sl":938},{"el":973,"sc":5,"sl":958},{"el":1002,"sc":5,"sl":1000},{"el":1013,"sc":5,"sl":1007},{"el":1027,"sc":5,"sl":1018},{"el":1062,"sc":5,"sl":1059},{"el":1082,"sc":5,"sl":1076}],"name":"ToStringBuilderTest","sl":36},{"el":368,"id":25682,"methods":[],"name":"ToStringBuilderTest.ReflectionTestFixtureA","sl":363},{"el":375,"id":25682,"methods":[],"name":"ToStringBuilderTest.ReflectionTestFixtureB","sl":370},{"el":395,"id":25685,"methods":[{"el":394,"sc":9,"sl":391}],"name":"ToStringBuilderTest.Outer","sl":383},{"el":390,"id":25685,"methods":[{"el":389,"sc":13,"sl":386}],"name":"ToStringBuilderTest.Outer.Inner","sl":385},{"el":460,"id":25708,"methods":[{"el":459,"sc":9,"sl":456}],"name":"ToStringBuilderTest.ReflectionTestCycleA","sl":453},{"el":472,"id":25710,"methods":[{"el":471,"sc":9,"sl":468}],"name":"ToStringBuilderTest.ReflectionTestCycleB","sl":465},{"el":491,"id":25712,"methods":[{"el":481,"sc":9,"sl":480},{"el":485,"sc":9,"sl":483},{"el":490,"sc":9,"sl":487}],"name":"ToStringBuilderTest.SimpleReflectionTestFixture","sl":477},{"el":505,"id":25717,"methods":[{"el":499,"sc":9,"sl":497},{"el":504,"sc":9,"sl":501}],"name":"ToStringBuilderTest.SelfInstanceVarReflectionTestFixture","sl":493},{"el":524,"id":25721,"methods":[{"el":514,"sc":9,"sl":512},{"el":518,"sc":9,"sl":516},{"el":523,"sc":9,"sl":520}],"name":"ToStringBuilderTest.SelfInstanceTwoVarsReflectionTestFixture","sl":507},{"el":916,"id":25952,"methods":[{"el":915,"sc":9,"sl":912}],"name":"ToStringBuilderTest.ObjectCycle","sl":909},{"el":1041,"id":25985,"methods":[],"name":"ToStringBuilderTest.ReflectionStaticFieldsFixture","sl":1032},{"el":1049,"id":25985,"methods":[],"name":"ToStringBuilderTest.SimpleReflectionStaticFieldsFixture","sl":1046},{"el":1057,"id":25985,"methods":[],"name":"ToStringBuilderTest.InheritedReflectionStaticFieldsFixture","sl":1054},{"el":1074,"id":25987,"methods":[{"el":1073,"sc":9,"sl":1070}],"name":"ToStringBuilderTest.MultiLineTestObject","sl":1068}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]