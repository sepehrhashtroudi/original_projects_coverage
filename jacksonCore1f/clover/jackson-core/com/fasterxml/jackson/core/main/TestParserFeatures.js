var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":107,"id":16591,"methods":[{"el":20,"sc":5,"sl":12},{"el":26,"sc":5,"sl":22},{"el":35,"sc":5,"sl":31},{"el":41,"sc":5,"sl":37},{"el":67,"sc":5,"sl":49},{"el":87,"sc":5,"sl":71},{"el":106,"sc":5,"sl":89}],"name":"TestParserFeatures","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_106":{"methods":[{"sl":12}],"name":"testDefaultSettings","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_134":{"methods":[{"sl":22},{"sl":49}],"name":"testQuotesRequired","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":59},{"sl":60},{"sl":61},{"sl":63},{"sl":65}]},"test_158":{"methods":[{"sl":37},{"sl":89}],"name":"testTabsEnabled","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":91},{"sl":92},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105}]},"test_84":{"methods":[{"sl":31},{"sl":71}],"name":"testTabsDefault","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":73},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":83},{"sl":85}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [106], [], [106], [106], [106], [106], [106], [106], [], [], [134], [], [134], [134], [], [], [], [], [], [84], [], [84], [84], [], [], [158], [], [158], [158], [], [], [], [], [], [], [], [], [134], [], [134], [134], [134], [134], [], [], [], [], [134], [134], [134], [], [134], [], [134], [], [], [], [], [], [84], [], [84], [], [84], [84], [84], [84], [84], [84], [], [], [84], [], [84], [], [], [], [158], [], [158], [158], [], [158], [158], [158], [158], [], [158], [158], [158], [158], [158], [158], [158], [], []]
