var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1167,"id":43178,"methods":[{"el":110,"sc":5,"sl":101},{"el":116,"sc":5,"sl":112},{"el":123,"sc":5,"sl":118},{"el":128,"sc":5,"sl":125},{"el":148,"sc":5,"sl":130},{"el":167,"sc":5,"sl":150},{"el":181,"sc":5,"sl":169},{"el":204,"sc":5,"sl":183},{"el":233,"sc":5,"sl":215},{"el":247,"sc":5,"sl":245},{"el":262,"sc":5,"sl":249},{"el":277,"sc":5,"sl":264},{"el":292,"sc":5,"sl":279},{"el":299,"sc":5,"sl":294},{"el":317,"sc":5,"sl":301},{"el":332,"sc":5,"sl":319},{"el":345,"sc":5,"sl":334},{"el":358,"sc":5,"sl":347},{"el":371,"sc":5,"sl":360},{"el":384,"sc":5,"sl":373},{"el":397,"sc":5,"sl":386},{"el":418,"sc":5,"sl":399},{"el":439,"sc":5,"sl":420},{"el":449,"sc":5,"sl":441},{"el":476,"sc":5,"sl":451},{"el":503,"sc":5,"sl":478},{"el":530,"sc":5,"sl":505},{"el":557,"sc":5,"sl":532},{"el":584,"sc":5,"sl":559},{"el":611,"sc":5,"sl":586},{"el":638,"sc":5,"sl":613},{"el":665,"sc":5,"sl":640},{"el":692,"sc":5,"sl":667},{"el":716,"sc":5,"sl":694},{"el":740,"sc":5,"sl":718},{"el":764,"sc":5,"sl":742},{"el":788,"sc":5,"sl":766},{"el":812,"sc":5,"sl":790},{"el":836,"sc":5,"sl":814},{"el":860,"sc":5,"sl":838},{"el":884,"sc":5,"sl":862},{"el":912,"sc":5,"sl":886},{"el":938,"sc":5,"sl":914},{"el":965,"sc":5,"sl":940},{"el":990,"sc":5,"sl":967},{"el":1015,"sc":5,"sl":992},{"el":1040,"sc":5,"sl":1017},{"el":1065,"sc":5,"sl":1042},{"el":1090,"sc":5,"sl":1067},{"el":1115,"sc":5,"sl":1092},{"el":1140,"sc":5,"sl":1117},{"el":1165,"sc":5,"sl":1142}],"name":"CompareToBuilderTest","sl":31},{"el":68,"id":43178,"methods":[{"el":39,"sc":9,"sl":37},{"el":50,"sc":9,"sl":40},{"el":55,"sc":9,"sl":52},{"el":59,"sc":9,"sl":57},{"el":63,"sc":9,"sl":61},{"el":67,"sc":9,"sl":64}],"name":"CompareToBuilderTest.TestObject","sl":35},{"el":90,"id":43203,"methods":[{"el":74,"sc":9,"sl":72},{"el":78,"sc":9,"sl":75},{"el":89,"sc":9,"sl":79}],"name":"CompareToBuilderTest.TestSubObject","sl":70},{"el":99,"id":43219,"methods":[{"el":98,"sc":9,"sl":95}],"name":"CompareToBuilderTest.TestTransientSubObject","sl":92}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]