var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":248,"id":85291,"methods":[{"el":40,"sc":3,"sl":34},{"el":57,"sc":3,"sl":42},{"el":66,"sc":3,"sl":59},{"el":78,"sc":3,"sl":68},{"el":100,"sc":3,"sl":80},{"el":110,"sc":3,"sl":102},{"el":123,"sc":3,"sl":112},{"el":128,"sc":3,"sl":125},{"el":133,"sc":3,"sl":130},{"el":138,"sc":3,"sl":135},{"el":147,"sc":3,"sl":140},{"el":153,"sc":3,"sl":149},{"el":175,"sc":7,"sl":168},{"el":182,"sc":3,"sl":161},{"el":203,"sc":7,"sl":197},{"el":210,"sc":3,"sl":190},{"el":220,"sc":3,"sl":213}],"name":"VariableVisibilityAnalysisTest","sl":29},{"el":247,"id":85366,"methods":[{"el":234,"sc":5,"sl":232},{"el":246,"sc":5,"sl":235}],"name":"VariableVisibilityAnalysisTest.LabeledVariableSearcher","sl":228}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11188":{"methods":[{"sl":34},{"sl":59},{"sl":112},{"sl":135},{"sl":149},{"sl":213},{"sl":232},{"sl":235}],"name":"testGlobals","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":60},{"sl":63},{"sl":65},{"sl":114},{"sl":116},{"sl":120},{"sl":122},{"sl":136},{"sl":150},{"sl":152},{"sl":214},{"sl":216},{"sl":217},{"sl":219},{"sl":233},{"sl":237},{"sl":244}]},"test_12888":{"methods":[{"sl":34},{"sl":80},{"sl":102},{"sl":149},{"sl":190},{"sl":197}],"name":"testFunctions","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":81},{"sl":90},{"sl":92},{"sl":95},{"sl":98},{"sl":105},{"sl":106},{"sl":108},{"sl":109},{"sl":150},{"sl":152},{"sl":191},{"sl":193},{"sl":195},{"sl":199},{"sl":201},{"sl":206},{"sl":209}]},"test_14251":{"methods":[{"sl":34},{"sl":42},{"sl":112},{"sl":125},{"sl":130},{"sl":149},{"sl":213},{"sl":232},{"sl":235}],"name":"testCapturedVariables","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":43},{"sl":53},{"sl":55},{"sl":56},{"sl":114},{"sl":116},{"sl":120},{"sl":122},{"sl":126},{"sl":131},{"sl":150},{"sl":152},{"sl":214},{"sl":216},{"sl":217},{"sl":219},{"sl":233},{"sl":237},{"sl":244}]},"test_14330":{"methods":[{"sl":34},{"sl":80},{"sl":102},{"sl":149},{"sl":190},{"sl":197}],"name":"testFunctions","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":81},{"sl":90},{"sl":92},{"sl":95},{"sl":98},{"sl":105},{"sl":106},{"sl":108},{"sl":109},{"sl":150},{"sl":152},{"sl":191},{"sl":193},{"sl":195},{"sl":199},{"sl":201},{"sl":206},{"sl":209}]},"test_15726":{"methods":[{"sl":34},{"sl":68},{"sl":140},{"sl":149},{"sl":161},{"sl":168}],"name":"testParameters","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":69},{"sl":73},{"sl":75},{"sl":76},{"sl":77},{"sl":141},{"sl":143},{"sl":145},{"sl":150},{"sl":152},{"sl":162},{"sl":164},{"sl":166},{"sl":170},{"sl":173},{"sl":178},{"sl":181}]},"test_17394":{"methods":[{"sl":34},{"sl":42},{"sl":112},{"sl":125},{"sl":130},{"sl":149},{"sl":213},{"sl":232},{"sl":235}],"name":"testCapturedVariables","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":43},{"sl":53},{"sl":55},{"sl":56},{"sl":114},{"sl":116},{"sl":120},{"sl":122},{"sl":126},{"sl":131},{"sl":150},{"sl":152},{"sl":214},{"sl":216},{"sl":217},{"sl":219},{"sl":233},{"sl":237},{"sl":244}]},"test_5054":{"methods":[{"sl":34},{"sl":68},{"sl":140},{"sl":149},{"sl":161},{"sl":168}],"name":"testParameters","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":69},{"sl":73},{"sl":75},{"sl":76},{"sl":77},{"sl":141},{"sl":143},{"sl":145},{"sl":150},{"sl":152},{"sl":162},{"sl":164},{"sl":166},{"sl":170},{"sl":173},{"sl":178},{"sl":181}]},"test_5342":{"methods":[{"sl":34},{"sl":59},{"sl":112},{"sl":135},{"sl":149},{"sl":213},{"sl":232},{"sl":235}],"name":"testGlobals","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":39},{"sl":60},{"sl":63},{"sl":65},{"sl":114},{"sl":116},{"sl":120},{"sl":122},{"sl":136},{"sl":150},{"sl":152},{"sl":214},{"sl":216},{"sl":217},{"sl":219},{"sl":233},{"sl":237},{"sl":244}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [], [], [17394, 14251], [17394, 14251], [], [], [], [], [], [], [], [], [], [17394, 14251], [], [17394, 14251], [17394, 14251], [], [], [11188, 5342], [11188, 5342], [], [], [11188, 5342], [], [11188, 5342], [], [], [5054, 15726], [5054, 15726], [], [], [], [5054, 15726], [], [5054, 15726], [5054, 15726], [5054, 15726], [], [], [14330, 12888], [14330, 12888], [], [], [], [], [], [], [], [], [14330, 12888], [], [14330, 12888], [], [], [14330, 12888], [], [], [14330, 12888], [], [], [], [14330, 12888], [], [], [14330, 12888], [14330, 12888], [], [14330, 12888], [14330, 12888], [], [], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [], [], [], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [], [], [17394, 14251], [17394, 14251], [], [], [], [17394, 14251], [17394, 14251], [], [], [], [11188, 5342], [11188, 5342], [], [], [], [5054, 15726], [5054, 15726], [], [5054, 15726], [], [5054, 15726], [], [], [], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [], [5054, 11188, 17394, 5342, 14330, 15726, 12888, 14251], [], [], [], [], [], [], [], [], [5054, 15726], [5054, 15726], [], [5054, 15726], [], [5054, 15726], [], [5054, 15726], [], [5054, 15726], [], [], [5054, 15726], [], [], [], [], [5054, 15726], [], [], [5054, 15726], [], [], [], [], [], [], [], [], [14330, 12888], [14330, 12888], [], [14330, 12888], [], [14330, 12888], [], [14330, 12888], [], [14330, 12888], [], [14330, 12888], [], [], [], [], [14330, 12888], [], [], [14330, 12888], [], [], [], [11188, 17394, 5342, 14251], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [], [], [], [], [], [], [], [], [], [], [], [], [11188, 17394, 5342, 14251], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [], [11188, 17394, 5342, 14251], [], [], [], [], [], [], [11188, 17394, 5342, 14251], [], [], [], []]