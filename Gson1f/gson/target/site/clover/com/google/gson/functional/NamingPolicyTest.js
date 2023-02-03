var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":163,"id":7388,"methods":[{"el":44,"sc":3,"sl":40},{"el":51,"sc":3,"sl":46},{"el":58,"sc":3,"sl":53},{"el":65,"sc":3,"sl":60},{"el":72,"sc":3,"sl":67},{"el":80,"sc":3,"sl":74},{"el":88,"sc":3,"sl":82},{"el":95,"sc":3,"sl":90},{"el":103,"sc":3,"sl":97},{"el":114,"sc":3,"sl":105},{"el":122,"sc":3,"sl":116},{"el":130,"sc":3,"sl":124},{"el":137,"sc":3,"sl":132}],"name":"NamingPolicyTest","sl":36},{"el":143,"id":7450,"methods":[{"el":142,"sc":5,"sl":140}],"name":"NamingPolicyTest.UpperCaseNamingStrategy","sl":139},{"el":162,"id":7452,"methods":[{"el":152,"sc":5,"sl":150},{"el":156,"sc":5,"sl":154},{"el":161,"sc":5,"sl":158}],"name":"NamingPolicyTest.ClassWithDuplicateFields","sl":146}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":132},{"sl":140},{"sl":150},{"sl":158}],"name":"testDeprecatedNamingStrategy","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":141},{"sl":151},{"sl":159},{"sl":160}]},"test_151":{"methods":[{"sl":90}],"name":"testGsonWithSerializedNameFieldNamingPolicySerialization","pass":true,"statements":[{"sl":91},{"sl":92},{"sl":93},{"sl":94}]},"test_195":{"methods":[{"sl":105},{"sl":150},{"sl":154},{"sl":158}],"name":"testGsonDuplicateNameUsingSerializedNameFieldNamingPolicySerialization","pass":true,"statements":[{"sl":106},{"sl":107},{"sl":108},{"sl":109},{"sl":111},{"sl":112},{"sl":113},{"sl":151},{"sl":155},{"sl":159},{"sl":160}]},"test_214":{"methods":[{"sl":116}],"name":"testGsonWithUpperCamelCaseSpacesPolicySerialiation","pass":true,"statements":[{"sl":117},{"sl":119},{"sl":120}]},"test_255":{"methods":[{"sl":67}],"name":"testGsonWithLowerCaseDashPolicyDeserialiation","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":70},{"sl":71}]},"test_262":{"methods":[{"sl":97}],"name":"testGsonWithSerializedNameFieldNamingPolicyDeserialization","pass":true,"statements":[{"sl":98},{"sl":99},{"sl":100},{"sl":102}]},"test_427":{"methods":[{"sl":124}],"name":"testGsonWithUpperCamelCaseSpacesPolicyDeserialiation","pass":true,"statements":[{"sl":125},{"sl":127},{"sl":128},{"sl":129}]},"test_430":{"methods":[{"sl":46}],"name":"testGsonWithNonDefaultFieldNamingPolicySerialization","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49}]},"test_509":{"methods":[{"sl":53}],"name":"testGsonWithNonDefaultFieldNamingPolicyDeserialiation","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":57}]},"test_519":{"methods":[{"sl":60}],"name":"testGsonWithLowerCaseDashPolicySerialization","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":63}]},"test_642":{"methods":[{"sl":82}],"name":"testGsonWithLowerCaseUnderscorePolicyDeserialiation","pass":true,"statements":[{"sl":83},{"sl":85},{"sl":86},{"sl":87}]},"test_657":{"methods":[{"sl":74}],"name":"testGsonWithLowerCaseUnderscorePolicySerialization","pass":true,"statements":[{"sl":75},{"sl":77},{"sl":78}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [430], [430], [430], [430], [], [], [], [509], [509], [509], [509], [509], [], [], [519], [519], [519], [519], [], [], [], [255], [255], [255], [255], [255], [], [], [657], [657], [], [657], [657], [], [], [], [642], [642], [], [642], [642], [642], [], [], [151], [151], [151], [151], [151], [], [], [262], [262], [262], [262], [], [262], [], [], [195], [195], [195], [195], [195], [], [195], [195], [195], [], [], [214], [214], [], [214], [214], [], [], [], [427], [427], [], [427], [427], [427], [], [], [103], [103], [103], [103], [103], [], [], [], [103], [103], [], [], [], [], [], [], [], [], [103, 195], [103, 195], [], [], [195], [195], [], [], [103, 195], [103, 195], [103, 195], [], [], []]