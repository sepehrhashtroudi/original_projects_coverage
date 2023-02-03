var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":592,"id":23684,"methods":[{"el":140,"sc":5,"sl":132},{"el":152,"sc":5,"sl":150},{"el":166,"sc":5,"sl":163},{"el":181,"sc":5,"sl":179},{"el":199,"sc":5,"sl":193},{"el":211,"sc":5,"sl":209},{"el":228,"sc":5,"sl":225},{"el":240,"sc":5,"sl":238},{"el":254,"sc":5,"sl":251},{"el":270,"sc":5,"sl":268},{"el":288,"sc":5,"sl":279},{"el":300,"sc":5,"sl":297},{"el":312,"sc":5,"sl":309},{"el":321,"sc":5,"sl":319},{"el":332,"sc":5,"sl":329},{"el":343,"sc":5,"sl":341},{"el":355,"sc":5,"sl":352},{"el":369,"sc":5,"sl":367},{"el":454,"sc":5,"sl":386},{"el":513,"sc":5,"sl":464},{"el":552,"sc":5,"sl":521},{"el":566,"sc":5,"sl":561},{"el":577,"sc":5,"sl":574},{"el":590,"sc":5,"sl":586}],"name":"ScatterRenderer","sl":86}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1436":{"methods":[{"sl":132}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139}]},"test_2429":{"methods":[{"sl":132},{"sl":521}],"name":"testHashcode","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":533},{"sl":536},{"sl":539},{"sl":542},{"sl":545},{"sl":548},{"sl":551}]},"test_3089":{"methods":[{"sl":132},{"sl":521}],"name":"testHashcode","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":533},{"sl":536},{"sl":539},{"sl":542},{"sl":545},{"sl":548},{"sl":551}]},"test_3894":{"methods":[{"sl":132},{"sl":521},{"sl":574},{"sl":586}],"name":"testSerialization","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":533},{"sl":536},{"sl":539},{"sl":542},{"sl":545},{"sl":548},{"sl":551},{"sl":575},{"sl":588}]},"test_4210":{"methods":[{"sl":132}],"name":"testPublicCloneable","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139}]},"test_4243":{"methods":[{"sl":132},{"sl":163},{"sl":225},{"sl":251},{"sl":309},{"sl":329},{"sl":352},{"sl":521}],"name":"testEquals","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":164},{"sl":165},{"sl":226},{"sl":227},{"sl":252},{"sl":253},{"sl":310},{"sl":311},{"sl":330},{"sl":331},{"sl":353},{"sl":354},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":531},{"sl":533},{"sl":534},{"sl":536},{"sl":537},{"sl":539},{"sl":540},{"sl":542},{"sl":543},{"sl":545},{"sl":546},{"sl":548},{"sl":551}]},"test_4246":{"methods":[{"sl":132},{"sl":309},{"sl":329},{"sl":521},{"sl":561}],"name":"testCloning","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":310},{"sl":311},{"sl":330},{"sl":331},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":531},{"sl":533},{"sl":534},{"sl":536},{"sl":539},{"sl":542},{"sl":545},{"sl":548},{"sl":551},{"sl":562},{"sl":563},{"sl":565}]},"test_75":{"methods":[{"sl":132},{"sl":163},{"sl":225},{"sl":251},{"sl":309},{"sl":329},{"sl":352},{"sl":521}],"name":"testEquals","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":164},{"sl":165},{"sl":226},{"sl":227},{"sl":252},{"sl":253},{"sl":310},{"sl":311},{"sl":330},{"sl":331},{"sl":353},{"sl":354},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":531},{"sl":533},{"sl":534},{"sl":536},{"sl":537},{"sl":539},{"sl":540},{"sl":542},{"sl":543},{"sl":545},{"sl":546},{"sl":548},{"sl":551}]},"test_897":{"methods":[{"sl":132},{"sl":309},{"sl":329},{"sl":521},{"sl":561}],"name":"testCloning","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":310},{"sl":311},{"sl":330},{"sl":331},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":531},{"sl":533},{"sl":534},{"sl":536},{"sl":539},{"sl":542},{"sl":545},{"sl":548},{"sl":551},{"sl":562},{"sl":563},{"sl":565}]},"test_952":{"methods":[{"sl":132},{"sl":521},{"sl":574},{"sl":586}],"name":"testSerialization","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":522},{"sl":525},{"sl":528},{"sl":529},{"sl":533},{"sl":536},{"sl":539},{"sl":542},{"sl":545},{"sl":548},{"sl":551},{"sl":575},{"sl":588}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [75, 3894, 1436, 3089, 897, 2429, 4210, 4246, 4243, 952], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 4243], [75, 4243], [75, 4243], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 4243], [75, 4243], [75, 4243], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 4243], [75, 4243], [75, 4243], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 897, 4246, 4243], [75, 897, 4246, 4243], [75, 897, 4246, 4243], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 897, 4246, 4243], [75, 897, 4246, 4243], [75, 897, 4246, 4243], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 4243], [75, 4243], [75, 4243], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [], [75, 897, 4246, 4243], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 897, 4246, 4243], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 4243], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 4243], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 4243], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [75, 4243], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [], [], [75, 3894, 3089, 897, 2429, 4246, 4243, 952], [], [], [], [], [], [], [], [], [], [897, 4246], [897, 4246], [897, 4246], [], [897, 4246], [], [], [], [], [], [], [], [], [3894, 952], [3894, 952], [], [], [], [], [], [], [], [], [], [], [3894, 952], [], [3894, 952], [], [], [], []]