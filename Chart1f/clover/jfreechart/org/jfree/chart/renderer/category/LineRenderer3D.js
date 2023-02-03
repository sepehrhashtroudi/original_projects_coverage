var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":664,"id":62414,"methods":[{"el":127,"sc":5,"sl":122},{"el":139,"sc":5,"sl":137},{"el":151,"sc":5,"sl":149},{"el":164,"sc":5,"sl":161},{"el":177,"sc":5,"sl":174},{"el":189,"sc":5,"sl":187},{"el":206,"sc":5,"sl":200},{"el":287,"sc":5,"sl":215},{"el":327,"sc":5,"sl":296},{"el":370,"sc":5,"sl":339},{"el":428,"sc":5,"sl":383},{"el":494,"sc":5,"sl":439},{"el":609,"sc":5,"sl":513},{"el":636,"sc":5,"sl":618},{"el":648,"sc":5,"sl":645},{"el":662,"sc":5,"sl":658}],"name":"LineRenderer3D","sl":95}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2308":{"methods":[{"sl":122},{"sl":161},{"sl":174},{"sl":200},{"sl":618}],"name":"testEquals","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":162},{"sl":163},{"sl":175},{"sl":176},{"sl":201},{"sl":204},{"sl":205},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":627},{"sl":629},{"sl":630},{"sl":632},{"sl":633},{"sl":635}]},"test_2387":{"methods":[{"sl":122},{"sl":618},{"sl":645},{"sl":658}],"name":"testSerialization","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":629},{"sl":632},{"sl":635},{"sl":646},{"sl":647},{"sl":660},{"sl":661}]},"test_2889":{"methods":[{"sl":122},{"sl":618}],"name":"testHashcode","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":629},{"sl":632},{"sl":635}]},"test_2986":{"methods":[{"sl":122},{"sl":618},{"sl":645},{"sl":658}],"name":"testSerialization","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":629},{"sl":632},{"sl":635},{"sl":646},{"sl":647},{"sl":660},{"sl":661}]},"test_3113":{"methods":[{"sl":122},{"sl":161},{"sl":174},{"sl":200},{"sl":618}],"name":"testEquals","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":162},{"sl":163},{"sl":175},{"sl":176},{"sl":201},{"sl":204},{"sl":205},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":627},{"sl":629},{"sl":630},{"sl":632},{"sl":633},{"sl":635}]},"test_3615":{"methods":[{"sl":122}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_3875":{"methods":[{"sl":122},{"sl":618}],"name":"testHashcode","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":629},{"sl":632},{"sl":635}]},"test_3897":{"methods":[{"sl":122},{"sl":618}],"name":"testCloning","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":629},{"sl":632},{"sl":635}]},"test_693":{"methods":[{"sl":122},{"sl":618}],"name":"testCloning","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":619},{"sl":622},{"sl":625},{"sl":626},{"sl":629},{"sl":632},{"sl":635}]},"test_857":{"methods":[{"sl":122}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":123},{"sl":124},{"sl":125},{"sl":126}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [857, 3875, 3897, 3615, 2986, 3113, 693, 2889, 2387, 2308], [857, 3875, 3897, 3615, 2986, 3113, 693, 2889, 2387, 2308], [857, 3875, 3897, 3615, 2986, 3113, 693, 2889, 2387, 2308], [857, 3875, 3897, 3615, 2986, 3113, 693, 2889, 2387, 2308], [857, 3875, 3897, 3615, 2986, 3113, 693, 2889, 2387, 2308], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3113, 2308], [3113, 2308], [3113, 2308], [], [], [], [], [], [], [], [], [], [], [3113, 2308], [3113, 2308], [3113, 2308], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3113, 2308], [3113, 2308], [], [], [3113, 2308], [3113, 2308], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [], [], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [], [], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [3113, 2308], [], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [3113, 2308], [], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [3113, 2308], [], [3875, 3897, 2986, 3113, 693, 2889, 2387, 2308], [], [], [], [], [], [], [], [], [], [2986, 2387], [2986, 2387], [2986, 2387], [], [], [], [], [], [], [], [], [], [], [2986, 2387], [], [2986, 2387], [2986, 2387], [], [], []]