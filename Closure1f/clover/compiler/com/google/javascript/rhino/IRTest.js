var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":206,"id":110897,"methods":[{"el":52,"sc":3,"sl":50},{"el":60,"sc":3,"sl":54},{"el":75,"sc":3,"sl":62},{"el":90,"sc":3,"sl":77},{"el":105,"sc":3,"sl":92},{"el":115,"sc":3,"sl":107},{"el":126,"sc":3,"sl":117},{"el":135,"sc":3,"sl":128},{"el":141,"sc":3,"sl":137},{"el":147,"sc":3,"sl":143},{"el":160,"sc":3,"sl":149},{"el":171,"sc":3,"sl":162},{"el":186,"sc":3,"sl":173},{"el":201,"sc":3,"sl":188},{"el":205,"sc":3,"sl":203}],"name":"IRTest","sl":48}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10242":{"methods":[{"sl":137},{"sl":203}],"name":"testThrow","pass":true,"statements":[{"sl":138},{"sl":204}]},"test_10615":{"methods":[{"sl":107}],"name":"testScriptThrows","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":114}]},"test_10999":{"methods":[{"sl":77},{"sl":203}],"name":"testBlock","pass":true,"statements":[{"sl":78},{"sl":81},{"sl":86},{"sl":204}]},"test_11478":{"methods":[{"sl":107}],"name":"testScriptThrows","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":114}]},"test_12923":{"methods":[{"sl":149},{"sl":203}],"name":"testIf","pass":true,"statements":[{"sl":150},{"sl":155},{"sl":204}]},"test_12987":{"methods":[{"sl":188},{"sl":203}],"name":"testIssue727_3","pass":true,"statements":[{"sl":189},{"sl":204}]},"test_13267":{"methods":[{"sl":137},{"sl":203}],"name":"testThrow","pass":true,"statements":[{"sl":138},{"sl":204}]},"test_13668":{"methods":[{"sl":143},{"sl":203}],"name":"testExprResult","pass":true,"statements":[{"sl":144},{"sl":204}]},"test_13816":{"methods":[{"sl":149},{"sl":203}],"name":"testIf","pass":true,"statements":[{"sl":150},{"sl":155},{"sl":204}]},"test_14882":{"methods":[{"sl":128},{"sl":203}],"name":"testReturn","pass":true,"statements":[{"sl":129},{"sl":132},{"sl":204}]},"test_15645":{"methods":[{"sl":173},{"sl":203}],"name":"testIssue727_2","pass":true,"statements":[{"sl":174},{"sl":204}]},"test_15776":{"methods":[{"sl":92},{"sl":203}],"name":"testScript","pass":true,"statements":[{"sl":93},{"sl":96},{"sl":101},{"sl":204}]},"test_16095":{"methods":[{"sl":92},{"sl":203}],"name":"testScript","pass":true,"statements":[{"sl":93},{"sl":96},{"sl":101},{"sl":204}]},"test_16399":{"methods":[{"sl":173},{"sl":203}],"name":"testIssue727_2","pass":true,"statements":[{"sl":174},{"sl":204}]},"test_16667":{"methods":[{"sl":54},{"sl":203}],"name":"testFunction","pass":true,"statements":[{"sl":55},{"sl":204}]},"test_17101":{"methods":[{"sl":162},{"sl":203}],"name":"testIssue727_1","pass":true,"statements":[{"sl":163},{"sl":204}]},"test_17703":{"methods":[{"sl":62},{"sl":203}],"name":"testParamList","pass":true,"statements":[{"sl":63},{"sl":66},{"sl":71},{"sl":204}]},"test_18584":{"methods":[{"sl":162},{"sl":203}],"name":"testIssue727_1","pass":true,"statements":[{"sl":163},{"sl":204}]},"test_19037":{"methods":[{"sl":62},{"sl":203}],"name":"testParamList","pass":true,"statements":[{"sl":63},{"sl":66},{"sl":71},{"sl":204}]},"test_19038":{"methods":[{"sl":128},{"sl":203}],"name":"testReturn","pass":true,"statements":[{"sl":129},{"sl":132},{"sl":204}]},"test_19408":{"methods":[{"sl":54},{"sl":203}],"name":"testFunction","pass":true,"statements":[{"sl":55},{"sl":204}]},"test_19482":{"methods":[{"sl":50},{"sl":203}],"name":"testEmpty","pass":true,"statements":[{"sl":51},{"sl":204}]},"test_19626":{"methods":[{"sl":117},{"sl":203}],"name":"testVar","pass":true,"statements":[{"sl":118},{"sl":122},{"sl":204}]},"test_2494":{"methods":[{"sl":50},{"sl":203}],"name":"testEmpty","pass":true,"statements":[{"sl":51},{"sl":204}]},"test_3967":{"methods":[{"sl":143},{"sl":203}],"name":"testExprResult","pass":true,"statements":[{"sl":144},{"sl":204}]},"test_4652":{"methods":[{"sl":117},{"sl":203}],"name":"testVar","pass":true,"statements":[{"sl":118},{"sl":122},{"sl":204}]},"test_8700":{"methods":[{"sl":188},{"sl":203}],"name":"testIssue727_3","pass":true,"statements":[{"sl":189},{"sl":204}]},"test_8880":{"methods":[{"sl":77},{"sl":203}],"name":"testBlock","pass":true,"statements":[{"sl":78},{"sl":81},{"sl":86},{"sl":204}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [19482, 2494], [19482, 2494], [], [], [16667, 19408], [16667, 19408], [], [], [], [], [], [], [17703, 19037], [17703, 19037], [], [], [17703, 19037], [], [], [], [], [17703, 19037], [], [], [], [], [], [10999, 8880], [10999, 8880], [], [], [10999, 8880], [], [], [], [], [10999, 8880], [], [], [], [], [], [16095, 15776], [16095, 15776], [], [], [16095, 15776], [], [], [], [], [16095, 15776], [], [], [], [], [], [10615, 11478], [10615, 11478], [10615, 11478], [10615, 11478], [], [10615, 11478], [], [10615, 11478], [], [], [19626, 4652], [19626, 4652], [], [], [], [19626, 4652], [], [], [], [], [], [19038, 14882], [19038, 14882], [], [], [19038, 14882], [], [], [], [], [13267, 10242], [13267, 10242], [], [], [], [], [3967, 13668], [3967, 13668], [], [], [], [], [13816, 12923], [13816, 12923], [], [], [], [], [13816, 12923], [], [], [], [], [], [], [17101, 18584], [17101, 18584], [], [], [], [], [], [], [], [], [], [15645, 16399], [15645, 16399], [], [], [], [], [], [], [], [], [], [], [], [], [], [12987, 8700], [12987, 8700], [], [], [], [], [], [], [], [], [], [], [], [], [], [19038, 19482, 13816, 16095, 15776, 16667, 19408, 19626, 15645, 4652, 3967, 16399, 10999, 2494, 13267, 12923, 17703, 14882, 17101, 8880, 12987, 10242, 13668, 19037, 18584, 8700], [19038, 19482, 13816, 16095, 15776, 16667, 19408, 19626, 15645, 4652, 3967, 16399, 10999, 2494, 13267, 12923, 17703, 14882, 17101, 8880, 12987, 10242, 13668, 19037, 18584, 8700], [], []]