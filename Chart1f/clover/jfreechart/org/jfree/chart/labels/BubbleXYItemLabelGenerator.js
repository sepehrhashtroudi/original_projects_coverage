var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":277,"id":24026,"methods":[{"el":95,"sc":5,"sl":91},{"el":116,"sc":5,"sl":109},{"el":137,"sc":5,"sl":130},{"el":146,"sc":5,"sl":144},{"el":155,"sc":5,"sl":153},{"el":168,"sc":5,"sl":166},{"el":190,"sc":5,"sl":179},{"el":236,"sc":5,"sl":202},{"el":263,"sc":5,"sl":245},{"el":275,"sc":5,"sl":270}],"name":"BubbleXYItemLabelGenerator","sl":66}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1715":{"methods":[{"sl":91},{"sl":109},{"sl":245},{"sl":270}],"name":"testHashCode","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":246},{"sl":249},{"sl":252},{"sl":255},{"sl":256},{"sl":259},{"sl":262},{"sl":271},{"sl":272},{"sl":273},{"sl":274}]},"test_1807":{"methods":[{"sl":91},{"sl":109},{"sl":245},{"sl":270}],"name":"testHashCode","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":246},{"sl":249},{"sl":252},{"sl":255},{"sl":256},{"sl":259},{"sl":262},{"sl":271},{"sl":272},{"sl":273},{"sl":274}]},"test_2252":{"methods":[{"sl":91},{"sl":109},{"sl":245}],"name":"testSerialization","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":246},{"sl":249},{"sl":252},{"sl":255},{"sl":256},{"sl":259},{"sl":262}]},"test_2625":{"methods":[{"sl":91},{"sl":109},{"sl":245}],"name":"testCloning","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":246},{"sl":249},{"sl":252},{"sl":255},{"sl":256},{"sl":259},{"sl":262}]},"test_3156":{"methods":[{"sl":91},{"sl":109},{"sl":166},{"sl":179}],"name":"testGenerateLabel","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":167},{"sl":180},{"sl":181},{"sl":182},{"sl":186},{"sl":188},{"sl":189}]},"test_3197":{"methods":[{"sl":91},{"sl":109},{"sl":245}],"name":"testCloning","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":246},{"sl":249},{"sl":252},{"sl":255},{"sl":256},{"sl":259},{"sl":262}]},"test_3802":{"methods":[{"sl":91},{"sl":109}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115}]},"test_393":{"methods":[{"sl":91},{"sl":109}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115}]},"test_4031":{"methods":[{"sl":109},{"sl":130},{"sl":245}],"name":"testEquals","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":115},{"sl":132},{"sl":133},{"sl":136},{"sl":246},{"sl":249},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":259},{"sl":260},{"sl":262}]},"test_4037":{"methods":[{"sl":91},{"sl":109},{"sl":166},{"sl":179}],"name":"testGenerateLabel","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":167},{"sl":180},{"sl":181},{"sl":182},{"sl":186},{"sl":188},{"sl":189}]},"test_538":{"methods":[{"sl":109},{"sl":130},{"sl":245}],"name":"testEquals","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":115},{"sl":132},{"sl":133},{"sl":136},{"sl":246},{"sl":249},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":259},{"sl":260},{"sl":262}]},"test_895":{"methods":[{"sl":91},{"sl":109},{"sl":245}],"name":"testSerialization","pass":true,"statements":[{"sl":92},{"sl":111},{"sl":112},{"sl":115},{"sl":246},{"sl":249},{"sl":252},{"sl":255},{"sl":256},{"sl":259},{"sl":262}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2625, 1807, 3802, 393, 2252, 4037, 3156, 1715, 3197, 895], [2625, 1807, 3802, 393, 2252, 4037, 3156, 1715, 3197, 895], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2625, 538, 1807, 4031, 3802, 393, 2252, 4037, 3156, 1715, 3197, 895], [], [2625, 538, 1807, 4031, 3802, 393, 2252, 4037, 3156, 1715, 3197, 895], [2625, 538, 1807, 4031, 3802, 393, 2252, 4037, 3156, 1715, 3197, 895], [], [], [2625, 538, 1807, 4031, 3802, 393, 2252, 4037, 3156, 1715, 3197, 895], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [538, 4031], [], [538, 4031], [538, 4031], [], [], [538, 4031], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4037, 3156], [4037, 3156], [], [], [], [], [], [], [], [], [], [], [], [4037, 3156], [4037, 3156], [4037, 3156], [4037, 3156], [], [], [], [4037, 3156], [], [4037, 3156], [4037, 3156], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [], [], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [], [], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [538, 4031], [], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [538, 4031], [], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [538, 4031], [], [2625, 538, 1807, 4031, 2252, 1715, 3197, 895], [], [], [], [], [], [], [], [1807, 1715], [1807, 1715], [1807, 1715], [1807, 1715], [1807, 1715], [], [], []]