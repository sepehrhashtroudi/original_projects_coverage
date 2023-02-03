var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":114,"id":2497,"methods":[{"el":30,"sc":3,"sl":30},{"el":56,"sc":3,"sl":40},{"el":62,"sc":3,"sl":58},{"el":72,"sc":3,"sl":70},{"el":77,"sc":3,"sl":74},{"el":95,"sc":3,"sl":88},{"el":113,"sc":3,"sl":106}],"name":"Primitives","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultDateDeserializationUsingBuilder","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_1":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomDeserializerReturnsNullForTopLevelObject","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_102":{"methods":[{"sl":74},{"sl":88}],"name":"testDeserializePrimitiveWrapperAsObjectField","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_106":{"methods":[{"sl":74},{"sl":88}],"name":"testStringFieldWithEmptyValueDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_108":{"methods":[{"sl":74},{"sl":88}],"name":"testNestedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_115":{"methods":[{"sl":74},{"sl":88}],"name":"testDoubleAsStringRepresentationDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_116":{"methods":[{"sl":74},{"sl":88}],"name":"testTopLevelNullObjectDeserializationWithReaderAndSerializeNulls","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_125":{"methods":[{"sl":74},{"sl":106}],"name":"testArrayOfObjectsAsFields","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":107},{"sl":110},{"sl":112}]},"test_130":{"methods":[{"sl":74},{"sl":88}],"name":"testTypeAdapterProperlyConvertsTypes","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_136":{"methods":[{"sl":74},{"sl":88}],"name":"testObjectFieldNamesWithoutQuotesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_14":{"methods":[{"sl":74},{"sl":88}],"name":"testDateDeserializationWithPattern","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_140":{"methods":[{"sl":74},{"sl":88}],"name":"testDoubleNaNDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_141":{"methods":[{"sl":74},{"sl":88}],"name":"testArrayOfPrimitivesAsObjectsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_144":{"methods":[{"sl":74},{"sl":88}],"name":"testSubClassDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_152":{"methods":[{"sl":74},{"sl":88}],"name":"testSingleQuoteInStringSerialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_157":{"methods":[{"sl":74},{"sl":88}],"name":"testReaderForDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_16":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testExplicitNullSetsFieldToNullDuringDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_161":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveBooleanAutoboxedInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_171":{"methods":[{"sl":74},{"sl":88}],"name":"testJavascriptKeywordsInStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_175":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultCalendarDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_177":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapingQuotesInStringSerialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_178":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultJavaSqlTimeDeserialization","pass":false,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_180":{"methods":[{"sl":74},{"sl":88}],"name":"testStringValueAsSingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_191":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testNullPrimitiveFieldsDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_193":{"methods":[{"sl":74},{"sl":88}],"name":"testSingleStringArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_196":{"methods":[{"sl":74},{"sl":88}],"name":"testMultiThreadDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_198":{"methods":[{"sl":74},{"sl":88}],"name":"testNoExposedFieldDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_205":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testPrimitive","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_206":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomDeserializerReturnsNullForTopLevelPrimitives","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_207":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveBooleanAutoboxedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_209":{"methods":[{"sl":74},{"sl":88}],"name":"testVersionedUntilDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_218":{"methods":[{"sl":74},{"sl":88}],"name":"testUrlDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_222":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapingQuotesInStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_227":{"methods":[{"sl":74},{"sl":88}],"name":"testNullDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_233":{"methods":[{"sl":74},{"sl":88}],"name":"testTopLevelEnumDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_235":{"methods":[{"sl":74},{"sl":88}],"name":"testOverridingDefaultPrimitiveSerialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_241":{"methods":[{"sl":74},{"sl":88}],"name":"testStringsWithUnicodeChineseCharactersDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_243":{"methods":[{"sl":74},{"sl":88}],"name":"testExposeAnnotationDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_245":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testExplicitDeserializationOfNulls","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_250":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomDeserializerReturnsNullForArrayElements","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_252":{"methods":[{"sl":74},{"sl":88}],"name":"testBigIntegerInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_255":{"methods":[{"sl":74},{"sl":88}],"name":"testGsonWithLowerCaseDashPolicyDeserialiation","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_256":{"methods":[{"sl":74},{"sl":88}],"name":"testBigDecimalPreservePrecisionDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_261":{"methods":[{"sl":74},{"sl":88}],"name":"testLocaleDeserializationWithLanguage","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_262":{"methods":[{"sl":74},{"sl":88}],"name":"testGsonWithSerializedNameFieldNamingPolicyDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_266":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testCustomDeserializerForLong","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_267":{"methods":[{"sl":74},{"sl":88}],"name":"testNegativeInfinityFloatDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_270":{"methods":[{"sl":74},{"sl":88}],"name":"testSingleThreadDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_273":{"methods":[{"sl":74},{"sl":88}],"name":"testExclusionStrategyDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_277":{"methods":[{"sl":74},{"sl":88}],"name":"testDirectedAcyclicGraphDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_28":{"methods":[{"sl":74},{"sl":88}],"name":"testSingletonLists","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_283":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testNullObjectFieldsDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_289":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testEnsureCustomDeserializerNotInvokedForNullValues","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_292":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testPrimitiveArray","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_295":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testObjectType","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_298":{"methods":[{"sl":74},{"sl":88}],"name":"testAssignmentCharDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_30":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomDeserializerReturnsNullForArrayElementsForArrayField","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_301":{"methods":[{"sl":40},{"sl":58},{"sl":74},{"sl":88}],"name":"testReadWriteTwoObjects","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":54},{"sl":55},{"sl":60},{"sl":61},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_311":{"methods":[{"sl":74},{"sl":88}],"name":"testLocaleDeserializationWithLanguageCountry","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_312":{"methods":[{"sl":74},{"sl":88}],"name":"testChangingCustomTreeAndDeserializing","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_313":{"methods":[{"sl":74},{"sl":88}],"name":"testEmptyCollectionInAnObjectDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_314":{"methods":[{"sl":74},{"sl":88}],"name":"testJsonWithNonExectuableTokenWithRegularGsonDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_317":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultConstructorNotCalledOnObject","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_318":{"methods":[{"sl":74},{"sl":88}],"name":"testIgnoreLaterVersionClassDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_321":{"methods":[{"sl":74},{"sl":88}],"name":"testNumberDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_322":{"methods":[{"sl":74},{"sl":88}],"name":"testBigDecimalAsStringRepresentationDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_325":{"methods":[{"sl":74},{"sl":88}],"name":"testArrayOfObjectsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_328":{"methods":[{"sl":74},{"sl":88}],"name":"testUuidDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_329":{"methods":[{"sl":74},{"sl":88}],"name":"testDeserializingCustomTree","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_335":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomTypeAdapterPassesNullDesrialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_339":{"methods":[{"sl":74},{"sl":88}],"name":"testInnerClassDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_349":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomDeserializers","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_356":{"methods":[{"sl":74},{"sl":88}],"name":"testSingle","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_360":{"methods":[{"sl":74},{"sl":88}],"name":"testNullFieldsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_367":{"methods":[{"sl":74},{"sl":88}],"name":"testJsonTypeFieldBasedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_370":{"methods":[{"sl":74},{"sl":88}],"name":"testInstanceCreatorReturnsSubTypeForField","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_371":{"methods":[{"sl":74},{"sl":88}],"name":"testLocaleDeserializationWithLanguageCountryVariant","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_372":{"methods":[{"sl":74},{"sl":88}],"name":"testNonExecutableJsonDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_38":{"methods":[{"sl":74},{"sl":88}],"name":"testVersionedGsonWithUnversionedClassesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_390":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapedBackslashInStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_393":{"methods":[{"sl":74},{"sl":88}],"name":"testClassWithTransientFieldsDeserializationTransientFieldsPassedInJsonAreIgnored","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_394":{"methods":[{"sl":74},{"sl":88}],"name":"testBagOfPrimitivesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_397":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testParameterizedTypeWithReaderDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_399":{"methods":[{"sl":74},{"sl":88}],"name":"testSubInterfacesOfCollectionDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_4":{"methods":[{"sl":74},{"sl":88}],"name":"testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_400":{"methods":[{"sl":74},{"sl":106}],"name":"testObjectArrayWithNonPrimitivesSerialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":107},{"sl":110},{"sl":112}]},"test_403":{"methods":[{"sl":74},{"sl":88}],"name":"testArrayOfPrimitivesWithCustomTypeAdapter","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_408":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultDateDeserialization","pass":false,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_411":{"methods":[{"sl":74},{"sl":88}],"name":"testJsonInSingleQuotesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_413":{"methods":[{"sl":74},{"sl":88}],"name":"testTopLevelNullObjectDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_416":{"methods":[{"sl":74},{"sl":88}],"name":"testBagOfPrimitiveWrappersDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_418":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testParameterizedTypesWithWriterSerialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_425":{"methods":[{"sl":74},{"sl":88}],"name":"testReadWriteTwoObjects","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_427":{"methods":[{"sl":74},{"sl":88}],"name":"testGsonWithUpperCamelCaseSpacesPolicyDeserialiation","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_435":{"methods":[{"sl":74},{"sl":88}],"name":"testVersionedGsonMixingSinceAndUntilDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_436":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomNestedDeserializers","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_439":{"methods":[{"sl":74},{"sl":88}],"name":"testLargeDoubleDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_442":{"methods":[{"sl":74},{"sl":88}],"name":"testInstanceCreatorReturnsBaseType","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_448":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testObject","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_45":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveDoubleAutoboxedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_451":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveLongAutoboxedInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_452":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveLongAutoboxedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_456":{"methods":[{"sl":74},{"sl":88}],"name":"testArrayOfStringsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_460":{"methods":[{"sl":74},{"sl":88}],"name":"testEnumSubclass","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_461":{"methods":[{"sl":74},{"sl":88}],"name":"testBigIntegerDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_47":{"methods":[{"sl":74},{"sl":88}],"name":"testTypeAdapterDoesNotAffectNonAdaptedTypes","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_471":{"methods":[{"sl":74},{"sl":88}],"name":"testGsonAcceptsEscapedAndNonEscapedJsonDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_472":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testCustomDeserializerReturnsNullForPrimitiveFields","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_475":{"methods":[{"sl":74},{"sl":88}],"name":"testInstanceCreatorReturnsSubTypeForTopLevelObject","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_483":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveArrayInAnObjectDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_486":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapedCtrlRInStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_487":{"methods":[{"sl":74},{"sl":88}],"name":"testUrlNullDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_493":{"methods":[{"sl":74},{"sl":88}],"name":"testBigDecimalInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_495":{"methods":[{"sl":74},{"sl":88}],"name":"testBigDecimalNoFractAsStringRepresentationDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_509":{"methods":[{"sl":74},{"sl":88}],"name":"testGsonWithNonDefaultFieldNamingPolicyDeserialiation","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_510":{"methods":[{"sl":74},{"sl":88}],"name":"testEmptyArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_513":{"methods":[{"sl":74},{"sl":88}],"name":"testCustomByteArrayDeserializerAndInstanceCreator","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_517":{"methods":[{"sl":74},{"sl":88}],"name":"testSingleQuoteInStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_521":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testPrimitiveWrapper","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_537":{"methods":[{"sl":74},{"sl":88}],"name":"testReadWriteTwoStrings","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_540":{"methods":[{"sl":74},{"sl":88}],"name":"testSingleNullInArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_542":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultJavaSqlTimestampDeserialization","pass":false,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_544":{"methods":[{"sl":74},{"sl":88}],"name":"testFloatNaNDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_546":{"methods":[{"sl":74},{"sl":88}],"name":"testStringsWithRawChineseCharactersDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_549":{"methods":[{"sl":74},{"sl":88}],"name":"testNegativeInfinityDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_553":{"methods":[{"sl":74},{"sl":88}],"name":"testEmptyStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_558":{"methods":[{"sl":74},{"sl":88}],"name":"testReturningDerivedClassesDuringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_563":{"methods":[{"sl":74},{"sl":88}],"name":"testDoubleInfinityDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_572":{"methods":[{"sl":74},{"sl":88}],"name":"testVersionedClassesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_575":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testNullArraysDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_587":{"methods":[{"sl":74},{"sl":88}],"name":"testStringValueDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_59":{"methods":[{"sl":74},{"sl":88}],"name":"testSmallValueForBigDecimalDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_591":{"methods":[{"sl":74},{"sl":88}],"name":"testPrivateNoArgConstructorDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_601":{"methods":[{"sl":74},{"sl":88}],"name":"testLongAsStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_606":{"methods":[{"sl":74},{"sl":88}],"name":"testTopLevelNullObjectDeserializationWithReader","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_610":{"methods":[{"sl":74},{"sl":88}],"name":"testStringFieldWithNumberValueDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_611":{"methods":[{"sl":74},{"sl":88}],"name":"testPropertiesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_612":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testParameterizedTypeDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_620":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveIntegerAutoboxedInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_626":{"methods":[{"sl":74},{"sl":88}],"name":"testStringWithEscapedSlashDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_634":{"methods":[{"sl":74},{"sl":88}],"name":"testReallyLongValuesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_636":{"methods":[{"sl":74},{"sl":88}],"name":"testUriDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_637":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapedCtrlNInStringDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_642":{"methods":[{"sl":74},{"sl":88}],"name":"testGsonWithLowerCaseUnderscorePolicyDeserialiation","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_647":{"methods":[{"sl":74},{"sl":88}],"name":"testDoubleNoFractAsStringRepresentationDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_65":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testCustomDeserializerReturnsNull","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_650":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testNullWrappedPrimitiveMemberDeserialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_652":{"methods":[{"sl":74},{"sl":88}],"name":"testJsonInMixedQuotesDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_653":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultConstructorNotCalledOnField","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_654":{"methods":[{"sl":74},{"sl":88}],"name":"testBigDecimalFieldDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_658":{"methods":[{"sl":74},{"sl":88}],"name":"testWildcardCollectionField","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_663":{"methods":[{"sl":74},{"sl":88}],"name":"testClassWithEnumFieldDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_664":{"methods":[{"sl":74},{"sl":88}],"name":"testTopLevelEnumInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_665":{"methods":[{"sl":74},{"sl":88}],"name":"testExposedInterfaceFieldDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_666":{"methods":[{"sl":70},{"sl":74},{"sl":88},{"sl":106}],"name":"testParameterizedTypesWithCustomDeserializer","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94},{"sl":107},{"sl":110},{"sl":112}]},"test_67":{"methods":[{"sl":74},{"sl":88}],"name":"testStringsWithUnicodeChineseCharactersEscapedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_670":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapingObjectFields","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_676":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveIntegerAutoboxedDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_689":{"methods":[{"sl":74},{"sl":106}],"name":"testParameterizedTypeWithCustomSerializer","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":107},{"sl":110},{"sl":112}]},"test_69":{"methods":[{"sl":74},{"sl":88}],"name":"testTopLevelArrayOfIntsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_693":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultJavaSqlDateDeserialization","pass":false,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_707":{"methods":[{"sl":74},{"sl":88}],"name":"testBigDecimalDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_711":{"methods":[{"sl":74},{"sl":88}],"name":"testClassWithTransientFieldsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_713":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveDoubleAutoboxedInASingleElementArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_714":{"methods":[{"sl":74},{"sl":88}],"name":"testClassWithNoFieldsDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_715":{"methods":[{"sl":74},{"sl":88}],"name":"testBigIntegerFieldDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_73":{"methods":[{"sl":74},{"sl":88}],"name":"testArrayOfArraysDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_81":{"methods":[{"sl":74},{"sl":88}],"name":"testFloatInfinityDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_85":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testParameterizedTypesSerialization","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_87":{"methods":[{"sl":74},{"sl":88}],"name":"testDefaultGregorianCalendarDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_88":{"methods":[{"sl":74},{"sl":88}],"name":"testEscapingQuotesInStringArray","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_90":{"methods":[{"sl":74},{"sl":88}],"name":"testNullsInArrayDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_92":{"methods":[{"sl":70},{"sl":74},{"sl":88}],"name":"testString","pass":true,"statements":[{"sl":71},{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_96":{"methods":[{"sl":74},{"sl":88}],"name":"testPrimitiveClassLiteral","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]},"test_99":{"methods":[{"sl":74},{"sl":88}],"name":"testSmallValueForBigIntegerDeserialization","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":89},{"sl":92},{"sl":94}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [301], [301], [301], [], [301], [301], [301], [301], [301], [301], [301], [301], [301], [], [301], [301], [], [], [301], [], [301], [301], [], [], [], [], [], [], [], [], [295, 16, 65, 245, 472, 612, 85, 205, 397, 191, 448, 283, 575, 292, 266, 666, 92, 289, 418, 650, 521], [295, 16, 65, 245, 472, 612, 85, 205, 397, 191, 448, 283, 575, 292, 266, 666, 92, 289, 418, 650, 521], [], [], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 400, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 125, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 689, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 400, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 125, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 689, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 400, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 125, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 689, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [], [], [], [], [], [], [], [], [], [], [], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [], [], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [], [399, 460, 295, 14, 313, 178, 509, 670, 715, 436, 175, 152, 4, 653, 270, 16, 1, 233, 141, 714, 250, 65, 654, 591, 245, 427, 487, 372, 218, 393, 367, 471, 572, 102, 553, 255, 634, 510, 642, 243, 517, 425, 157, 298, 647, 261, 161, 256, 658, 227, 59, 472, 475, 637, 115, 612, 85, 390, 108, 693, 87, 601, 626, 456, 370, 47, 356, 713, 495, 235, 314, 335, 28, 328, 205, 0, 301, 397, 311, 411, 191, 558, 416, 448, 546, 403, 241, 537, 493, 349, 360, 283, 452, 575, 563, 273, 408, 99, 252, 198, 69, 206, 451, 439, 292, 38, 116, 325, 277, 329, 711, 81, 442, 262, 663, 45, 318, 266, 540, 542, 144, 544, 394, 209, 136, 90, 587, 666, 106, 486, 67, 312, 483, 664, 413, 193, 92, 267, 96, 371, 321, 611, 289, 461, 222, 418, 707, 549, 676, 650, 140, 130, 610, 196, 652, 665, 317, 88, 177, 521, 171, 513, 339, 73, 207, 435, 636, 606, 180, 30, 620, 322], [], [], [], [], [], [], [], [], [], [], [], [400, 125, 666, 689], [400, 125, 666, 689], [], [], [400, 125, 666, 689], [], [400, 125, 666, 689], [], []]