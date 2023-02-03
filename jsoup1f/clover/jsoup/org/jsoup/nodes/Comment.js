var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":1629,"methods":[{"el":18,"sc":5,"sl":15},{"el":22,"sc":5,"sl":20},{"el":30,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":39,"sc":5,"sl":37}],"name":"Comment","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":15},{"sl":28}],"name":"parsesComments","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":29}]},"test_126":{"methods":[{"sl":15}],"name":"testYahooJp","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_35":{"methods":[{"sl":15}],"name":"testGoogleSearchIpod","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_43":{"methods":[{"sl":15}],"name":"testDropComments","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_62":{"methods":[{"sl":15},{"sl":28},{"sl":32}],"name":"testOuterHtml","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":29},{"sl":33},{"sl":34}]},"test_82":{"methods":[{"sl":15}],"name":"testSmhBizArticle","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_84":{"methods":[{"sl":15}],"name":"testNewsHomepage","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_98":{"methods":[{"sl":15},{"sl":28}],"name":"parsesUnterminatedComments","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [35, 84, 98, 82, 101, 43, 62, 126], [35, 84, 98, 82, 101, 43, 62, 126], [35, 84, 98, 82, 101, 43, 62, 126], [], [], [], [], [], [], [], [], [], [], [98, 101, 62], [98, 101, 62], [], [], [62], [62], [62], [], [], [], [], [], []]
