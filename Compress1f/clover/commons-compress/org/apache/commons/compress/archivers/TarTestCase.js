var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":111,"id":6475,"methods":[{"el":50,"sc":5,"sl":33},{"el":98,"sc":5,"sl":52},{"el":109,"sc":5,"sl":100}],"name":"TarTestCase","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":100}],"name":"testTarUnarchive","pass":true,"statements":[{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108}]},"test_128":{"methods":[{"sl":100}],"name":"testTarUnarchive","pass":true,"statements":[{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108}]},"test_177":{"methods":[{"sl":52}],"name":"testTarArchiveLongNameCreation","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92},{"sl":94},{"sl":95}]},"test_186":{"methods":[{"sl":52}],"name":"testTarArchiveLongNameCreation","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92},{"sl":94},{"sl":95}]},"test_193":{"methods":[{"sl":52}],"name":"testTarArchiveLongNameCreation","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":92},{"sl":94},{"sl":95}]},"test_22":{"methods":[{"sl":33}],"name":"testTarArchiveCreation","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]},"test_27":{"methods":[{"sl":33}],"name":"testTarArchiveCreation","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]},"test_71":{"methods":[{"sl":33}],"name":"testTarArchiveCreation","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49}]},"test_75":{"methods":[{"sl":100}],"name":"testTarUnarchive","pass":true,"statements":[{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":108}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [71, 22, 27], [], [], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [], [], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [186, 193, 177], [], [], [186, 193, 177], [], [186, 193, 177], [186, 193, 177], [], [], [], [], [128, 75, 121], [128, 75, 121], [128, 75, 121], [128, 75, 121], [128, 75, 121], [128, 75, 121], [128, 75, 121], [128, 75, 121], [128, 75, 121], [], [], []]