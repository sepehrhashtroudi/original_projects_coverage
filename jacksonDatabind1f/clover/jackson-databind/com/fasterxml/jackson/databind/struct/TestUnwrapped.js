var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":187,"id":35420,"methods":[{"el":84,"sc":5,"sl":80},{"el":89,"sc":5,"sl":85},{"el":106,"sc":5,"sl":97},{"el":120,"sc":5,"sl":108},{"el":133,"sc":5,"sl":122},{"el":144,"sc":5,"sl":135}],"name":"TestUnwrapped","sl":10},{"el":22,"id":35420,"methods":[{"el":17,"sc":9,"sl":17},{"el":21,"sc":9,"sl":18}],"name":"TestUnwrapped.Unwrapping","sl":12},{"el":33,"id":35424,"methods":[{"el":29,"sc":9,"sl":29},{"el":32,"sc":9,"sl":30}],"name":"TestUnwrapped.DeepUnwrapping","sl":24},{"el":45,"id":35427,"methods":[{"el":44,"sc":9,"sl":41}],"name":"TestUnwrapped.UnwrappingWithCreator","sl":35},{"el":56,"id":35429,"methods":[{"el":51,"sc":9,"sl":51},{"el":55,"sc":9,"sl":52}],"name":"TestUnwrapped.Location","sl":47},{"el":66,"id":35433,"methods":[{"el":65,"sc":9,"sl":65}],"name":"TestUnwrapped.TwoUnwrappedProperties","sl":59},{"el":70,"id":35434,"methods":[],"name":"TestUnwrapped.Name","sl":68}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1081":{"methods":[{"sl":18},{"sl":30},{"sl":52},{"sl":85}],"name":"testDeepUnwrappingSerialize","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":31},{"sl":53},{"sl":54},{"sl":87}]},"test_1326":{"methods":[{"sl":41},{"sl":51},{"sl":135}],"name":"testUnwrappedDeserializeWithCreator","pass":true,"statements":[{"sl":43},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143}]},"test_1409":{"methods":[{"sl":17},{"sl":29},{"sl":51},{"sl":122}],"name":"testDeepUnwrapping","pass":true,"statements":[{"sl":124},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132}]},"test_1862":{"methods":[{"sl":18},{"sl":30},{"sl":52},{"sl":85}],"name":"testDeepUnwrappingSerialize","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":31},{"sl":53},{"sl":54},{"sl":87}]},"test_1898":{"methods":[{"sl":18},{"sl":52},{"sl":80}],"name":"testSimpleUnwrappingSerialize","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":53},{"sl":54},{"sl":82}]},"test_1925":{"methods":[{"sl":18},{"sl":52},{"sl":80}],"name":"testSimpleUnwrappingSerialize","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":53},{"sl":54},{"sl":82}]},"test_2024":{"methods":[{"sl":17},{"sl":51},{"sl":97}],"name":"testSimpleUnwrappedDeserialize","pass":true,"statements":[{"sl":99},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105}]},"test_599":{"methods":[{"sl":51},{"sl":65},{"sl":108}],"name":"testDoubleUnwrapping","pass":true,"statements":[{"sl":110},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119}]},"test_702":{"methods":[{"sl":41},{"sl":51},{"sl":135}],"name":"testUnwrappedDeserializeWithCreator","pass":true,"statements":[{"sl":43},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143}]},"test_81":{"methods":[{"sl":17},{"sl":51},{"sl":97}],"name":"testSimpleUnwrappedDeserialize","pass":true,"statements":[{"sl":99},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105}]},"test_97":{"methods":[{"sl":17},{"sl":29},{"sl":51},{"sl":122}],"name":"testDeepUnwrapping","pass":true,"statements":[{"sl":124},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132}]},"test_996":{"methods":[{"sl":51},{"sl":65},{"sl":108}],"name":"testDoubleUnwrapping","pass":true,"statements":[{"sl":110},{"sl":112},{"sl":113},{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1409, 97, 81, 2024], [1862, 1898, 1081, 1925], [1862, 1898, 1081, 1925], [1862, 1898, 1081, 1925], [], [], [], [], [], [], [], [], [1409, 97], [1862, 1081], [1862, 1081], [], [], [], [], [], [], [], [], [], [1326, 702], [], [1326, 702], [], [], [], [], [], [], [], [1326, 1409, 996, 702, 97, 81, 599, 2024], [1862, 1898, 1081, 1925], [1862, 1898, 1081, 1925], [1862, 1898, 1081, 1925], [], [], [], [], [], [], [], [], [], [], [996, 599], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1898, 1925], [], [1898, 1925], [], [], [1862, 1081], [], [1862, 1081], [], [], [], [], [], [], [], [], [], [81, 2024], [], [81, 2024], [], [81, 2024], [81, 2024], [81, 2024], [81, 2024], [81, 2024], [], [], [996, 599], [], [996, 599], [], [996, 599], [996, 599], [996, 599], [996, 599], [996, 599], [996, 599], [996, 599], [996, 599], [], [], [1409, 97], [], [1409, 97], [], [1409, 97], [1409, 97], [1409, 97], [1409, 97], [1409, 97], [1409, 97], [1409, 97], [], [], [1326, 702], [], [1326, 702], [], [1326, 702], [1326, 702], [1326, 702], [1326, 702], [1326, 702], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]