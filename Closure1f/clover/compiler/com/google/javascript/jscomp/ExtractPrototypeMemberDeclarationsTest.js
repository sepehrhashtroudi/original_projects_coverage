var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":287,"id":110301,"methods":[{"el":34,"sc":3,"sl":29},{"el":39,"sc":3,"sl":36},{"el":46,"sc":3,"sl":41},{"el":52,"sc":3,"sl":48},{"el":62,"sc":3,"sl":54},{"el":76,"sc":3,"sl":64},{"el":83,"sc":3,"sl":78},{"el":90,"sc":3,"sl":85},{"el":100,"sc":3,"sl":92},{"el":119,"sc":3,"sl":102},{"el":165,"sc":3,"sl":121},{"el":183,"sc":3,"sl":167},{"el":217,"sc":3,"sl":185},{"el":237,"sc":3,"sl":219},{"el":245,"sc":3,"sl":239},{"el":253,"sc":3,"sl":247},{"el":263,"sc":3,"sl":255},{"el":268,"sc":3,"sl":265},{"el":282,"sc":3,"sl":270},{"el":286,"sc":3,"sl":284}],"name":"ExtractPrototypeMemberDeclarationsTest","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10203":{"methods":[{"sl":36},{"sl":92}],"name":"testInterweaved","pass":true,"statements":[{"sl":38},{"sl":93}]},"test_10276":{"methods":[{"sl":36},{"sl":121},{"sl":239},{"sl":247}],"name":"testWithDevirtualization","pass":true,"statements":[{"sl":38},{"sl":122},{"sl":142},{"sl":240},{"sl":241},{"sl":248},{"sl":249}]},"test_10761":{"methods":[{"sl":36},{"sl":185},{"sl":239},{"sl":247}],"name":"testAnonWithDevirtualization","pass":true,"statements":[{"sl":38},{"sl":186},{"sl":188},{"sl":201},{"sl":240},{"sl":243},{"sl":248},{"sl":251}]},"test_11780":{"methods":[{"sl":36},{"sl":121},{"sl":239},{"sl":247}],"name":"testWithDevirtualization","pass":true,"statements":[{"sl":38},{"sl":122},{"sl":142},{"sl":240},{"sl":241},{"sl":248},{"sl":249}]},"test_11814":{"methods":[{"sl":36},{"sl":85},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingPrototypeWithQName","pass":true,"statements":[{"sl":38},{"sl":86},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_12202":{"methods":[{"sl":36},{"sl":102},{"sl":239},{"sl":247}],"name":"testExtractingPrototypeWithNestedMembers","pass":true,"statements":[{"sl":38},{"sl":103},{"sl":240},{"sl":241},{"sl":248},{"sl":249}]},"test_12400":{"methods":[{"sl":36},{"sl":219}],"name":"testAnonWithSideFx","pass":true,"statements":[{"sl":38},{"sl":220},{"sl":221}]},"test_13158":{"methods":[{"sl":36},{"sl":54},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingTwoClassPrototype","pass":true,"statements":[{"sl":38},{"sl":55},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_13867":{"methods":[{"sl":36},{"sl":64},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingTwoClassPrototypeInDifferentBlocks","pass":true,"statements":[{"sl":38},{"sl":65},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_14139":{"methods":[{"sl":36},{"sl":41},{"sl":255},{"sl":265}],"name":"testNotEnoughPrototypeToExtract","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267}]},"test_14303":{"methods":[{"sl":36},{"sl":64},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingTwoClassPrototypeInDifferentBlocks","pass":true,"statements":[{"sl":38},{"sl":65},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_14481":{"methods":[{"sl":36},{"sl":64},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingTwoClassPrototypeInDifferentBlocks","pass":true,"statements":[{"sl":38},{"sl":65},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_14593":{"methods":[{"sl":36},{"sl":54},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingTwoClassPrototype","pass":true,"statements":[{"sl":38},{"sl":55},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_15064":{"methods":[{"sl":36},{"sl":167},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testAnonSimple","pass":true,"statements":[{"sl":38},{"sl":168},{"sl":170},{"sl":175},{"sl":176},{"sl":178},{"sl":240},{"sl":243},{"sl":248},{"sl":251},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":274},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_15689":{"methods":[{"sl":36},{"sl":41},{"sl":255},{"sl":265}],"name":"testNotEnoughPrototypeToExtract","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267}]},"test_16179":{"methods":[{"sl":36},{"sl":185},{"sl":239},{"sl":247}],"name":"testAnonWithDevirtualization","pass":true,"statements":[{"sl":38},{"sl":186},{"sl":188},{"sl":201},{"sl":240},{"sl":243},{"sl":248},{"sl":251}]},"test_16552":{"methods":[{"sl":36},{"sl":48},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingSingleClassPrototype","pass":true,"statements":[{"sl":38},{"sl":49},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_1697":{"methods":[{"sl":36},{"sl":92}],"name":"testInterweaved","pass":true,"statements":[{"sl":38},{"sl":93}]},"test_17694":{"methods":[{"sl":36},{"sl":54},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingTwoClassPrototype","pass":true,"statements":[{"sl":38},{"sl":55},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_19163":{"methods":[{"sl":36},{"sl":219}],"name":"testAnonWithSideFx","pass":true,"statements":[{"sl":38},{"sl":220},{"sl":221}]},"test_2382":{"methods":[{"sl":36},{"sl":85},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingPrototypeWithQName","pass":true,"statements":[{"sl":38},{"sl":86},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_4006":{"methods":[{"sl":36},{"sl":78}],"name":"testNoMemberDeclarations","pass":true,"statements":[{"sl":38},{"sl":79}]},"test_403":{"methods":[{"sl":36},{"sl":219}],"name":"testAnonWithSideFx","pass":true,"statements":[{"sl":38},{"sl":220},{"sl":221}]},"test_4040":{"methods":[{"sl":36},{"sl":92}],"name":"testInterweaved","pass":true,"statements":[{"sl":38},{"sl":93}]},"test_4093":{"methods":[{"sl":36},{"sl":102},{"sl":239},{"sl":247}],"name":"testExtractingPrototypeWithNestedMembers","pass":true,"statements":[{"sl":38},{"sl":103},{"sl":240},{"sl":241},{"sl":248},{"sl":249}]},"test_4758":{"methods":[{"sl":36},{"sl":78}],"name":"testNoMemberDeclarations","pass":true,"statements":[{"sl":38},{"sl":79}]},"test_4852":{"methods":[{"sl":36},{"sl":167},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testAnonSimple","pass":true,"statements":[{"sl":38},{"sl":168},{"sl":170},{"sl":175},{"sl":176},{"sl":178},{"sl":240},{"sl":243},{"sl":248},{"sl":251},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":274},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_4987":{"methods":[{"sl":36},{"sl":48},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingSingleClassPrototype","pass":true,"statements":[{"sl":38},{"sl":49},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_603":{"methods":[{"sl":36},{"sl":85},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingPrototypeWithQName","pass":true,"statements":[{"sl":38},{"sl":86},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_6450":{"methods":[{"sl":36},{"sl":102},{"sl":239},{"sl":247}],"name":"testExtractingPrototypeWithNestedMembers","pass":true,"statements":[{"sl":38},{"sl":103},{"sl":240},{"sl":241},{"sl":248},{"sl":249}]},"test_734":{"methods":[{"sl":36},{"sl":48},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testExtractingSingleClassPrototype","pass":true,"statements":[{"sl":38},{"sl":49},{"sl":240},{"sl":241},{"sl":248},{"sl":249},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_7394":{"methods":[{"sl":36},{"sl":185},{"sl":239},{"sl":247}],"name":"testAnonWithDevirtualization","pass":true,"statements":[{"sl":38},{"sl":186},{"sl":188},{"sl":201},{"sl":240},{"sl":243},{"sl":248},{"sl":251}]},"test_9736":{"methods":[{"sl":36},{"sl":41},{"sl":255},{"sl":265}],"name":"testNotEnoughPrototypeToExtract","pass":true,"statements":[{"sl":38},{"sl":43},{"sl":44},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267}]},"test_9801":{"methods":[{"sl":36},{"sl":78}],"name":"testNoMemberDeclarations","pass":true,"statements":[{"sl":38},{"sl":79}]},"test_9868":{"methods":[{"sl":36},{"sl":167},{"sl":239},{"sl":247},{"sl":255},{"sl":265},{"sl":270},{"sl":284}],"name":"testAnonSimple","pass":true,"statements":[{"sl":38},{"sl":168},{"sl":170},{"sl":175},{"sl":176},{"sl":178},{"sl":240},{"sl":243},{"sl":248},{"sl":251},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":262},{"sl":267},{"sl":271},{"sl":273},{"sl":274},{"sl":277},{"sl":278},{"sl":279},{"sl":281},{"sl":285}]},"test_9985":{"methods":[{"sl":36},{"sl":121},{"sl":239},{"sl":247}],"name":"testWithDevirtualization","pass":true,"statements":[{"sl":38},{"sl":122},{"sl":142},{"sl":240},{"sl":241},{"sl":248},{"sl":249}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [6450, 19163, 10276, 9868, 10203, 14303, 4093, 9985, 12400, 17694, 403, 14139, 15689, 13158, 7394, 4987, 4852, 15064, 734, 4040, 12202, 9736, 4758, 603, 14481, 4006, 11814, 10761, 9801, 16552, 2382, 1697, 11780, 13867, 16179, 14593], [], [6450, 19163, 10276, 9868, 10203, 14303, 4093, 9985, 12400, 17694, 403, 14139, 15689, 13158, 7394, 4987, 4852, 15064, 734, 4040, 12202, 9736, 4758, 603, 14481, 4006, 11814, 10761, 9801, 16552, 2382, 1697, 11780, 13867, 16179, 14593], [], [], [14139, 15689, 9736], [], [14139, 15689, 9736], [14139, 15689, 9736], [], [], [], [4987, 734, 16552], [4987, 734, 16552], [], [], [], [], [17694, 13158, 14593], [17694, 13158, 14593], [], [], [], [], [], [], [], [], [14303, 14481, 13867], [14303, 14481, 13867], [], [], [], [], [], [], [], [], [], [], [], [], [4758, 4006, 9801], [4758, 4006, 9801], [], [], [], [], [], [603, 11814, 2382], [603, 11814, 2382], [], [], [], [], [], [10203, 4040, 1697], [10203, 4040, 1697], [], [], [], [], [], [], [], [], [6450, 4093, 12202], [6450, 4093, 12202], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10276, 9985, 11780], [10276, 9985, 11780], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [10276, 9985, 11780], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [9868, 4852, 15064], [9868, 4852, 15064], [], [9868, 4852, 15064], [], [], [], [], [9868, 4852, 15064], [9868, 4852, 15064], [], [9868, 4852, 15064], [], [], [], [], [], [], [7394, 10761, 16179], [7394, 10761, 16179], [], [7394, 10761, 16179], [], [], [], [], [], [], [], [], [], [], [], [], [7394, 10761, 16179], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [19163, 12400, 403], [19163, 12400, 403], [19163, 12400, 403], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [6450, 10276, 9868, 14303, 4093, 9985, 17694, 13158, 7394, 4987, 4852, 15064, 734, 12202, 603, 14481, 11814, 10761, 16552, 2382, 11780, 13867, 16179, 14593], [6450, 10276, 9868, 14303, 4093, 9985, 17694, 13158, 7394, 4987, 4852, 15064, 734, 12202, 603, 14481, 11814, 10761, 16552, 2382, 11780, 13867, 16179, 14593], [6450, 10276, 14303, 4093, 9985, 17694, 13158, 4987, 734, 12202, 603, 14481, 11814, 16552, 2382, 11780, 13867, 14593], [], [9868, 7394, 4852, 15064, 10761, 16179], [], [], [], [6450, 10276, 9868, 14303, 4093, 9985, 17694, 13158, 7394, 4987, 4852, 15064, 734, 12202, 603, 14481, 11814, 10761, 16552, 2382, 11780, 13867, 16179, 14593], [6450, 10276, 9868, 14303, 4093, 9985, 17694, 13158, 7394, 4987, 4852, 15064, 734, 12202, 603, 14481, 11814, 10761, 16552, 2382, 11780, 13867, 16179, 14593], [6450, 10276, 14303, 4093, 9985, 17694, 13158, 4987, 734, 12202, 603, 14481, 11814, 16552, 2382, 11780, 13867, 14593], [], [9868, 7394, 4852, 15064, 10761, 16179], [], [], [], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [9868, 14303, 17694, 14139, 15689, 13158, 4987, 4852, 15064, 734, 9736, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 4852, 15064], [], [], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], [], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [9868, 14303, 17694, 13158, 4987, 4852, 15064, 734, 603, 14481, 11814, 16552, 2382, 13867, 14593], [], []]