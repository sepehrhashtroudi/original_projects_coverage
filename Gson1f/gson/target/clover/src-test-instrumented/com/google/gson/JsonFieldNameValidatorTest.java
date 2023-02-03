/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson;

import junit.framework.TestCase;

/**
 * Unit tests for the {@link JsonFieldNameValidator} class.
 *
 * @author Joel Leitch
 */
public class JsonFieldNameValidatorTest extends TestCase {static class __CLR4_4_13ao3aolck0y8s9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  private JsonFieldNameValidator validator;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_13ao3aolck0y8s9.R.inc(4272);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4273);super.setUp();
    __CLR4_4_13ao3aolck0y8s9.R.inc(4274);validator = new JsonFieldNameValidator();
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testValidFieldBeginsWithDollarSign() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1napqhs3ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testValidFieldBeginsWithDollarSign",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1napqhs3ar() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4275);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4276);String fieldName = "$abc";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4277);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testValidFieldBeginsWithUnderscore() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1qo2p3au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testValidFieldBeginsWithUnderscore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1qo2p3au() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4278);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4279);String fieldName = "_abc";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4280);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testValidFieldBeginsWithLetter() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h16ab73ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testValidFieldBeginsWithLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h16ab73ax() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4281);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4282);String fieldName = "abc";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4283);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testValidFieldMixingLetter() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhpg773b0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testValidFieldMixingLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhpg773b0() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4284);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4285);String fieldName = "$abc_12v$34";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4286);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testInvalidFieldStartingWithNumbers() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1viwfw63b3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testInvalidFieldStartingWithNumbers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1viwfw63b3() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4287);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4288);try {
      __CLR4_4_13ao3aolck0y8s9.R.inc(4289);validator.validate("1abc");
      __CLR4_4_13ao3aolck0y8s9.R.inc(4290);fail("Json field name can not start with a number");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testInvalidFieldStartingTwoDollarSigns() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgv80m3b7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testInvalidFieldStartingTwoDollarSigns",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgv80m3b7() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4291);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4292);try {
      __CLR4_4_13ao3aolck0y8s9.R.inc(4293);validator.validate("$$abc");
      __CLR4_4_13ao3aolck0y8s9.R.inc(4294);fail("Json field name can not start with a double dollar sign");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testInvalidFieldStartingTwoUnderscores() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1grtn0p3bb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testInvalidFieldStartingTwoUnderscores",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1grtn0p3bb() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4295);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4296);try {
      __CLR4_4_13ao3aolck0y8s9.R.inc(4297);validator.validate("__abc");
      __CLR4_4_13ao3aolck0y8s9.R.inc(4298);fail("Json field name can not start with a double underscore");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testInvalidFieldStartingDollarUnderscore() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a7lfxu3bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testInvalidFieldStartingDollarUnderscore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a7lfxu3bf() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4299);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4300);try {
      __CLR4_4_13ao3aolck0y8s9.R.inc(4301);validator.validate("$_abc");
      __CLR4_4_13ao3aolck0y8s9.R.inc(4302);fail("Json field name can not start with two non-alphabet characters");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testJavaAndJsKeywordAsFieldName() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ifzbkz3bj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testJavaAndJsKeywordAsFieldName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ifzbkz3bj() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4303);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4304);String fieldName = "break";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4305);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}

  public void testInvalidCharacters() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dmt0om3bm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testInvalidCharacters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dmt0om3bm() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4306);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4307);try {
      __CLR4_4_13ao3aolck0y8s9.R.inc(4308);validator.validate("abc.123");
      __CLR4_4_13ao3aolck0y8s9.R.inc(4309);fail("Json field name can not contain a period character");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}
  
  public void testDashesInFieldName() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11t2o1h3bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testDashesInFieldName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11t2o1h3bq() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4310);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4311);String fieldName = "test-field-name";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4312);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}
  
  public void testSpacesInFieldName() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o5b4943bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testSpacesInFieldName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o5b4943bt() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4313);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4314);String fieldName = "test field name";
    __CLR4_4_13ao3aolck0y8s9.R.inc(4315);assertEquals(fieldName, validator.validate(fieldName));
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}
  
  public void testSpacesInBeginningOfName() throws Exception {__CLR4_4_13ao3aolck0y8s9.R.globalSliceStart(getClass().getName(),4316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jtxew23bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ao3aolck0y8s9.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ao3aolck0y8s9.R.globalSliceEnd(getClass().getName(),"com.google.gson.JsonFieldNameValidatorTest.testSpacesInBeginningOfName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jtxew23bw() throws Exception{try{__CLR4_4_13ao3aolck0y8s9.R.inc(4316);
    __CLR4_4_13ao3aolck0y8s9.R.inc(4317);try {
      __CLR4_4_13ao3aolck0y8s9.R.inc(4318);validator.validate(" testFieldName");
      __CLR4_4_13ao3aolck0y8s9.R.inc(4319);fail("Json field name can not contain a period character");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13ao3aolck0y8s9.R.flushNeeded();}}
}
