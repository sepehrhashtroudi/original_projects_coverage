var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":115,"id":15918,"methods":[{"el":97,"sc":5,"sl":72},{"el":114,"sc":5,"sl":99}],"name":"TestDecorators","sl":17},{"el":45,"id":15918,"methods":[{"el":32,"sc":9,"sl":27},{"el":39,"sc":9,"sl":34},{"el":44,"sc":9,"sl":41}],"name":"TestDecorators.SimpleInputDecorator","sl":25},{"el":64,"id":15924,"methods":[{"el":55,"sc":9,"sl":49},{"el":63,"sc":9,"sl":57}],"name":"TestDecorators.SimpleOutputDecorator","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_104":{"methods":[{"sl":49},{"sl":57},{"sl":99}],"name":"testOutputDecoration","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":54},{"sl":60},{"sl":61},{"sl":62},{"sl":101},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":110},{"sl":111},{"sl":112},{"sl":113}]},"test_67":{"methods":[{"sl":27},{"sl":34},{"sl":41},{"sl":72}],"name":"testInputDecoration","pass":true,"statements":[{"sl":31},{"sl":38},{"sl":43},{"sl":74},{"sl":75},{"sl":76},{"sl":78},{"sl":80},{"sl":81},{"sl":82},{"sl":85},{"sl":87},{"sl":88},{"sl":89},{"sl":92},{"sl":94},{"sl":95},{"sl":96}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [67], [], [], [], [67], [], [], [67], [], [], [], [67], [], [], [67], [], [67], [], [], [], [], [], [104], [], [], [104], [104], [104], [], [], [104], [], [], [104], [104], [104], [], [], [], [], [], [], [], [], [], [67], [], [67], [67], [67], [], [67], [], [67], [67], [67], [], [], [67], [], [67], [67], [67], [], [], [67], [], [67], [67], [67], [], [], [104], [], [104], [104], [104], [], [104], [104], [104], [104], [], [104], [104], [104], [104], [], []]
