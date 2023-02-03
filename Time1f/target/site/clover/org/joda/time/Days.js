var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":491,"id":1681,"methods":[{"el":104,"sc":5,"sl":79},{"el":120,"sc":5,"sl":117},{"el":143,"sc":5,"sl":134},{"el":160,"sc":5,"sl":154},{"el":185,"sc":5,"sl":182},{"el":205,"sc":5,"sl":198},{"el":217,"sc":5,"sl":215},{"el":226,"sc":5,"sl":224},{"el":236,"sc":5,"sl":234},{"el":245,"sc":5,"sl":243},{"el":262,"sc":5,"sl":260},{"el":279,"sc":5,"sl":277},{"el":297,"sc":5,"sl":295},{"el":315,"sc":5,"sl":313},{"el":334,"sc":5,"sl":331},{"el":344,"sc":5,"sl":342},{"el":361,"sc":5,"sl":356},{"el":377,"sc":5,"sl":372},{"el":391,"sc":5,"sl":389},{"el":407,"sc":5,"sl":402},{"el":421,"sc":5,"sl":419},{"el":438,"sc":5,"sl":433},{"el":449,"sc":5,"sl":447},{"el":463,"sc":5,"sl":458},{"el":476,"sc":5,"sl":471},{"el":489,"sc":5,"sl":486}],"name":"Days","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1017":{"methods":[{"sl":79},{"sl":215},{"sl":486}],"name":"testToString","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":488}]},"test_1105":{"methods":[{"sl":79},{"sl":277}],"name":"testToStandardHours","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":278}]},"test_1165":{"methods":[{"sl":79},{"sl":154},{"sl":342}],"name":"testFactory_daysIn_RInterval","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":87},{"sl":88},{"sl":93},{"sl":94},{"sl":155},{"sl":156},{"sl":158},{"sl":159},{"sl":343}]},"test_1254":{"methods":[{"sl":79},{"sl":134},{"sl":215},{"sl":234},{"sl":342}],"name":"testFactory_daysBetween_RPartial_YearMonth","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":135},{"sl":141},{"sl":142},{"sl":216},{"sl":235},{"sl":343}]},"test_128":{"methods":[{"sl":79},{"sl":313}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":314}]},"test_1289":{"methods":[{"sl":79},{"sl":215},{"sl":458}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":459},{"sl":460},{"sl":462}]},"test_1296":{"methods":[{"sl":79},{"sl":215},{"sl":342},{"sl":356},{"sl":389}],"name":"testMinus_int","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":216},{"sl":343},{"sl":357},{"sl":358},{"sl":360},{"sl":390}]},"test_1314":{"methods":[{"sl":79},{"sl":215},{"sl":342},{"sl":356},{"sl":389},{"sl":402}],"name":"testMinus_Days","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":101},{"sl":102},{"sl":216},{"sl":343},{"sl":357},{"sl":358},{"sl":360},{"sl":390},{"sl":403},{"sl":404},{"sl":406}]},"test_1318":{"methods":[{"sl":79},{"sl":215},{"sl":331}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":332},{"sl":333}]},"test_1319":{"methods":[{"sl":79},{"sl":215},{"sl":342},{"sl":433}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":93},{"sl":94},{"sl":101},{"sl":102},{"sl":216},{"sl":343},{"sl":434},{"sl":435},{"sl":437}]},"test_1418":{"methods":[{"sl":79}],"name":"testToStandardDays","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86}]},"test_1428":{"methods":[{"sl":79},{"sl":134},{"sl":215},{"sl":234},{"sl":342}],"name":"testFactory_daysBetween_RPartial_MonthDay","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":101},{"sl":102},{"sl":135},{"sl":141},{"sl":142},{"sl":216},{"sl":235},{"sl":343}]},"test_1433":{"methods":[{"sl":79},{"sl":215},{"sl":243}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":244}]},"test_1465":{"methods":[{"sl":342}],"name":"testConstants","pass":true,"statements":[{"sl":343}]},"test_1478":{"methods":[{"sl":79}],"name":"testToStandardDays","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86}]},"test_1646":{"methods":[{"sl":79},{"sl":134},{"sl":215},{"sl":234},{"sl":342}],"name":"testFactory_daysBetween_RPartial_LocalDate","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":87},{"sl":88},{"sl":93},{"sl":94},{"sl":101},{"sl":102},{"sl":135},{"sl":136},{"sl":137},{"sl":139},{"sl":141},{"sl":142},{"sl":216},{"sl":235},{"sl":343}]},"test_1794":{"methods":[{"sl":79},{"sl":342}],"name":"testToStandardDays_years","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":343}]},"test_1799":{"methods":[{"sl":79},{"sl":342}],"name":"testToStandardDays_months","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":343}]},"test_1949":{"methods":[{"sl":79},{"sl":215},{"sl":243}],"name":"testToStandardDays","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":216},{"sl":244}]},"test_2080":{"methods":[{"sl":79},{"sl":215},{"sl":342}],"name":"testGetMethods","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":343}]},"test_2355":{"methods":[{"sl":79},{"sl":198},{"sl":486}],"name":"testDays","pass":true,"statements":[{"sl":80},{"sl":91},{"sl":92},{"sl":200},{"sl":203},{"sl":204},{"sl":488}]},"test_2372":{"methods":[{"sl":79},{"sl":215},{"sl":342},{"sl":419}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":93},{"sl":94},{"sl":101},{"sl":102},{"sl":216},{"sl":343},{"sl":420}]},"test_2429":{"methods":[{"sl":79},{"sl":295}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":296}]},"test_2529":{"methods":[{"sl":79},{"sl":224}],"name":"testSerialization","pass":true,"statements":[{"sl":80},{"sl":95},{"sl":96},{"sl":225}]},"test_2750":{"methods":[{"sl":79},{"sl":198},{"sl":215},{"sl":342}],"name":"testFactory_parseDays_String","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":200},{"sl":201},{"sl":203},{"sl":204},{"sl":216},{"sl":343}]},"test_2801":{"methods":[{"sl":79}],"name":"testToStandardDays","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86}]},"test_2986":{"methods":[{"sl":79},{"sl":182},{"sl":215},{"sl":342}],"name":"testFactory_standardDaysIn_RPeriod","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":183},{"sl":184},{"sl":216},{"sl":343}]},"test_3169":{"methods":[{"sl":79},{"sl":215},{"sl":342},{"sl":447}],"name":"testNegated","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":343},{"sl":448}]},"test_331":{"methods":[{"sl":79},{"sl":215},{"sl":243}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":244}]},"test_3440":{"methods":[{"sl":79},{"sl":342},{"sl":356}],"name":"testPlus_int","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":91},{"sl":92},{"sl":343},{"sl":357},{"sl":358},{"sl":360}]},"test_3467":{"methods":[{"sl":79},{"sl":215},{"sl":471}],"name":"testIsLessThan","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":472},{"sl":473},{"sl":475}]},"test_3528":{"methods":[{"sl":79},{"sl":117},{"sl":215},{"sl":342}],"name":"testFactory_daysBetween_RInstant","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":87},{"sl":88},{"sl":93},{"sl":94},{"sl":101},{"sl":102},{"sl":118},{"sl":119},{"sl":216},{"sl":343}]},"test_3662":{"methods":[{"sl":79},{"sl":215},{"sl":342}],"name":"testToStandardDays","pass":true,"statements":[{"sl":80},{"sl":83},{"sl":84},{"sl":89},{"sl":90},{"sl":97},{"sl":98},{"sl":101},{"sl":102},{"sl":216},{"sl":343}]},"test_376":{"methods":[{"sl":79},{"sl":215},{"sl":234}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":235}]},"test_3885":{"methods":[{"sl":79},{"sl":215},{"sl":234}],"name":"testGetFieldType","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":235}]},"test_3999":{"methods":[{"sl":79},{"sl":215},{"sl":342}],"name":"testFactory_days_int","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":216},{"sl":343}]},"test_590":{"methods":[{"sl":79},{"sl":215},{"sl":243}],"name":"testToStandardDays","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":244}]},"test_657":{"methods":[{"sl":79},{"sl":215},{"sl":260}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":80},{"sl":101},{"sl":102},{"sl":216},{"sl":261}]},"test_697":{"methods":[{"sl":79},{"sl":342},{"sl":356},{"sl":372}],"name":"testPlus_Days","pass":true,"statements":[{"sl":80},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":91},{"sl":92},{"sl":343},{"sl":357},{"sl":358},{"sl":360},{"sl":373},{"sl":374},{"sl":376}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1017, 1794, 3528, 1319, 1105, 697, 1478, 1314, 1296, 657, 3999, 2372, 1646, 590, 376, 1318, 1949, 2750, 2986, 1433, 2801, 1254, 2355, 128, 1418, 2429, 3169, 2529, 3467, 3440, 3885, 2080, 331, 3662, 1799, 1165, 1428, 1289], [1017, 1794, 3528, 1319, 1105, 697, 1478, 1314, 1296, 657, 3999, 2372, 1646, 590, 376, 1318, 1949, 2750, 2986, 1433, 2801, 1254, 2355, 128, 1418, 2429, 3169, 2529, 3467, 3440, 3885, 2080, 331, 3662, 1799, 1165, 1428, 1289], [1794, 3528, 3999, 1646, 1949, 2750, 2986, 1799, 1165, 1428], [1794, 3528, 3999, 1646, 1949, 2750, 2986, 1799, 1165, 1428], [3999, 1949, 2750, 2986, 3662, 1428], [3999, 1949, 2750, 2986, 3662, 1428], [1319, 1105, 697, 1478, 1314, 1296, 3999, 2372, 1949, 2750, 2986, 2801, 128, 1418, 2429, 3440], [1319, 1105, 697, 1478, 1314, 1296, 3999, 2372, 1949, 2750, 2986, 2801, 128, 1418, 2429, 3440], [3528, 1319, 697, 1314, 3999, 1646, 1165], [3528, 1319, 697, 1314, 3999, 1646, 1165], [1319, 3999, 3662], [1319, 3999, 3662], [697, 3999, 2355, 3440], [697, 3999, 2355, 3440], [3528, 1319, 3999, 2372, 1646, 1165], [3528, 1319, 3999, 2372, 1646, 1165], [3999, 2529], [3999, 2529], [3999, 3662], [3999, 3662], [3999], [3999], [1017, 3528, 1319, 1314, 1296, 657, 3999, 2372, 1646, 590, 376, 1318, 1949, 2750, 2986, 1433, 1254, 3169, 3467, 3885, 2080, 331, 3662, 1428, 1289], [1017, 3528, 1319, 1314, 1296, 657, 3999, 2372, 1646, 590, 376, 1318, 1949, 2750, 2986, 1433, 1254, 3169, 3467, 3885, 2080, 331, 3662, 1428, 1289], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3528], [3528], [3528], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1646, 1254, 1428], [1646, 1254, 1428], [1646], [1646], [], [1646], [], [1646, 1254, 1428], [1646, 1254, 1428], [], [], [], [], [], [], [], [], [], [], [], [1165], [1165], [1165], [], [1165], [1165], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2986], [2986], [2986], [], [], [], [], [], [], [], [], [], [], [], [], [], [2750, 2355], [], [2750, 2355], [2750], [], [2750, 2355], [2750, 2355], [], [], [], [], [], [], [], [], [], [], [1017, 3528, 1319, 1314, 1296, 657, 3999, 2372, 1646, 590, 376, 1318, 1949, 2750, 2986, 1433, 1254, 3169, 3467, 3885, 2080, 331, 3662, 1428, 1289], [1017, 3528, 1319, 1314, 1296, 657, 3999, 2372, 1646, 590, 376, 1318, 1949, 2750, 2986, 1433, 1254, 3169, 3467, 3885, 2080, 331, 3662, 1428, 1289], [], [], [], [], [], [], [], [2529], [2529], [], [], [], [], [], [], [], [], [1646, 376, 1254, 3885, 1428], [1646, 376, 1254, 3885, 1428], [], [], [], [], [], [], [], [590, 1949, 1433, 331], [590, 1949, 1433, 331], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [657], [657], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1105], [1105], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2429], [2429], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [128], [128], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1318], [1318], [1318], [], [], [], [], [], [], [], [], [1794, 3528, 1319, 697, 1314, 1465, 1296, 3999, 2372, 1646, 2750, 2986, 1254, 3169, 3440, 2080, 3662, 1799, 1165, 1428], [1794, 3528, 1319, 697, 1314, 1465, 1296, 3999, 2372, 1646, 2750, 2986, 1254, 3169, 3440, 2080, 3662, 1799, 1165, 1428], [], [], [], [], [], [], [], [], [], [], [], [], [697, 1314, 1296, 3440], [697, 1314, 1296, 3440], [697, 1314, 1296, 3440], [], [697, 1314, 1296, 3440], [], [], [], [], [], [], [], [], [], [], [], [697], [697], [697], [], [697], [], [], [], [], [], [], [], [], [], [], [], [], [1314, 1296], [1314, 1296], [], [], [], [], [], [], [], [], [], [], [], [1314], [1314], [1314], [], [1314], [], [], [], [], [], [], [], [], [], [], [], [], [2372], [2372], [], [], [], [], [], [], [], [], [], [], [], [], [1319], [1319], [1319], [], [1319], [], [], [], [], [], [], [], [], [], [3169], [3169], [], [], [], [], [], [], [], [], [], [1289], [1289], [1289], [], [1289], [], [], [], [], [], [], [], [], [3467], [3467], [3467], [], [3467], [], [], [], [], [], [], [], [], [], [], [1017, 2355], [], [1017, 2355], [], [], []]