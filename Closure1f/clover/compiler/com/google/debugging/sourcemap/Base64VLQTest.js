var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":133,"id":92307,"methods":[{"el":42,"sc":3,"sl":38},{"el":51,"sc":3,"sl":44},{"el":57,"sc":3,"sl":53},{"el":72,"sc":3,"sl":59},{"el":97,"sc":3,"sl":97},{"el":130,"sc":3,"sl":119}],"name":"Base64VLQTest","sl":37},{"el":94,"id":92340,"methods":[{"el":83,"sc":5,"sl":79},{"el":88,"sc":5,"sl":85},{"el":93,"sc":5,"sl":90}],"name":"Base64VLQTest.CharIteratorImpl","sl":74}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10210":{"methods":[{"sl":53},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedSignedValues1","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_12271":{"methods":[{"sl":97}],"name":"testSpeed","pass":true,"statements":[]},"test_14595":{"methods":[{"sl":44},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedValues2","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_15448":{"methods":[{"sl":97}],"name":"testSpeed","pass":true,"statements":[]},"test_16420":{"methods":[{"sl":53},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedSignedValues1","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_16452":{"methods":[{"sl":59},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedSignedValues2","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_16768":{"methods":[{"sl":44},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedValues2","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_18266":{"methods":[{"sl":53},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedSignedValues1","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_18918":{"methods":[{"sl":38},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedValues1","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_1960":{"methods":[{"sl":59},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedSignedValues2","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_19608":{"methods":[{"sl":59},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedSignedValues2","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_2207":{"methods":[{"sl":44},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedValues2","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_7294":{"methods":[{"sl":97}],"name":"testSpeed","pass":true,"statements":[]},"test_8161":{"methods":[{"sl":38},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedValues1","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]},"test_872":{"methods":[{"sl":38},{"sl":79},{"sl":90},{"sl":119}],"name":"testBase64VLQSelectedValues1","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":80},{"sl":81},{"sl":82},{"sl":92},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [8161, 872, 18918], [8161, 872, 18918], [8161, 872, 18918], [], [], [], [16768, 14595, 2207], [16768, 14595, 2207], [16768, 14595, 2207], [16768, 14595, 2207], [16768, 14595, 2207], [16768, 14595, 2207], [], [], [], [10210, 16420, 18266], [10210, 16420, 18266], [10210, 16420, 18266], [], [], [], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [19608, 1960, 16452], [], [], [], [], [], [], [], [], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [], [], [], [], [], [], [], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [], [], [], [], [15448, 7294, 12271], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [10210, 16768, 16420, 19608, 14595, 1960, 8161, 16452, 872, 18918, 2207, 18266], [], [], [], [], [], [], []]