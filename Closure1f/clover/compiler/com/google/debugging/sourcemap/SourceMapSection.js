var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":105,"id":17193,"methods":[{"el":53,"sc":3,"sl":47},{"el":61,"sc":3,"sl":55},{"el":65,"sc":3,"sl":63},{"el":69,"sc":3,"sl":67},{"el":73,"sc":3,"sl":71},{"el":83,"sc":3,"sl":79},{"el":90,"sc":3,"sl":88},{"el":97,"sc":3,"sl":95},{"el":104,"sc":3,"sl":102}],"name":"SourceMapSection","sl":23},{"el":37,"id":17193,"methods":[],"name":"SourceMapSection.SectionType","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_12719":{"methods":[{"sl":55},{"sl":63},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testWriteMetaMap2","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":64},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_13262":{"methods":[{"sl":55},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testParseSourceMetaMap","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_16568":{"methods":[{"sl":55},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testWriteMetaMap","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_2528":{"methods":[{"sl":55},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testWriteMetaMap","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_4030":{"methods":[{"sl":55},{"sl":63},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testWriteMetaMap2","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":64},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_4477":{"methods":[{"sl":55},{"sl":63},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testWriteMetaMap2","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":64},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_5121":{"methods":[{"sl":55},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testParseSourceMetaMap","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_5375":{"methods":[{"sl":55},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testWriteMetaMap","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]},"test_9568":{"methods":[{"sl":55},{"sl":67},{"sl":71},{"sl":88},{"sl":95},{"sl":102}],"name":"testParseSourceMetaMap","pass":true,"statements":[{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":68},{"sl":72},{"sl":89},{"sl":96},{"sl":103}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], [], [12719, 4477, 4030], [12719, 4477, 4030], [], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], [], [], [], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], [], [], [], [], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [12719, 2528, 13262, 5375, 5121, 16568, 9568, 4477, 4030], [], []]