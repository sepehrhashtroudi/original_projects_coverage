var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":86,"id":8601,"methods":[{"el":42,"sc":3,"sl":38},{"el":48,"sc":3,"sl":44},{"el":55,"sc":3,"sl":50},{"el":61,"sc":3,"sl":57},{"el":72,"sc":3,"sl":67},{"el":85,"sc":3,"sl":78}],"name":"SecurityTest","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_314":{"methods":[{"sl":67}],"name":"testJsonWithNonExectuableTokenWithRegularGsonDeserialization","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_372":{"methods":[{"sl":50}],"name":"testNonExecutableJsonDeserialization","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":53},{"sl":54}]},"test_4":{"methods":[{"sl":78}],"name":"testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84}]},"test_438":{"methods":[{"sl":57}],"name":"testJsonWithNonExectuableTokenSerialization","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60}]},"test_687":{"methods":[{"sl":44}],"name":"testNonExecutableJsonSerialization","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [687], [687], [687], [687], [], [], [372], [372], [372], [372], [372], [], [], [438], [438], [438], [438], [], [], [], [], [], [], [314], [314], [314], [314], [314], [], [], [], [], [], [], [4], [], [4], [4], [4], [4], [4], [], []]
