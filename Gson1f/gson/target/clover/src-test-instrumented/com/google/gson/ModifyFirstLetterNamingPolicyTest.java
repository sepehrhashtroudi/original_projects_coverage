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
 * Unit test for the {@link com.google.gson.ModifyFirstLetterNamingPolicy} class.
 *
 * @author Joel Leitch
 */
public class ModifyFirstLetterNamingPolicyTest extends TestCase {static class __CLR4_4_13pc3pclck0y8uz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,4834,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public void testInvalidConstruction() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xv2m53pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testInvalidConstruction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xv2m53pc() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4800);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4801);try {
      __CLR4_4_13pc3pclck0y8uz.R.inc(4802);new ModifyFirstLetterNamingPolicy(null);
      __CLR4_4_13pc3pclck0y8uz.R.inc(4803);fail("Null values are not allowed as a constructor parameters");
    } catch (IllegalArgumentException expected) { }
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testLowerCaseFirstLetter() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e4ssjm3pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testLowerCaseFirstLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4804,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e4ssjm3pg() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4804);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4805);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.LOWER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4806);assertEquals("blah", policy.translateName("Blah", String.class, null));
    __CLR4_4_13pc3pclck0y8uz.R.inc(4807);assertEquals("blah", policy.translateName("blah", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testUpperCaseFirstLetter() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11rdzxf3pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testUpperCaseFirstLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11rdzxf3pk() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4808);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4809);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.UPPER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4810);assertEquals("Blah", policy.translateName("blah", String.class, null));
    __CLR4_4_13pc3pclck0y8uz.R.inc(4811);assertEquals("Blah", policy.translateName("Blah", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testSingleCharacterField() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oqo81a3po();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testSingleCharacterField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oqo81a3po() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4812);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4813);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.UPPER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4814);assertEquals("B", policy.translateName("b", String.class, null));
    __CLR4_4_13pc3pclck0y8uz.R.inc(4815);assertEquals("B", policy.translateName("B", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testFieldStartsWithUnderscore() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n4xb43ps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testFieldStartsWithUnderscore",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n4xb43ps() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4816);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4817);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.UPPER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4818);assertEquals("_Blah", policy.translateName("_blah", String.class, null));
    __CLR4_4_13pc3pclck0y8uz.R.inc(4819);assertEquals("_Blah", policy.translateName("_Blah", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testFieldStartsWithUnderscoreFollowedBySingleLetter() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yb5zp3pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testFieldStartsWithUnderscoreFollowedBySingleLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yb5zp3pw() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4820);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4821);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.UPPER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4822);assertEquals("_B", policy.translateName("_b", String.class, null));
    __CLR4_4_13pc3pclck0y8uz.R.inc(4823);assertEquals("_B", policy.translateName("_B", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testFieldHasSingleNonLetter() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19x9l1c3q0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testFieldHasSingleNonLetter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19x9l1c3q0() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4824);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4825);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.LOWER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4826);assertEquals("_", policy.translateName("_", String.class, null));

    __CLR4_4_13pc3pclck0y8uz.R.inc(4827);policy = new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.UPPER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4828);assertEquals("_", policy.translateName("_", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}

  public void testFieldHasNoLetters() throws Exception {__CLR4_4_13pc3pclck0y8uz.R.globalSliceStart(getClass().getName(),4829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13775xb3q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13pc3pclck0y8uz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13pc3pclck0y8uz.R.globalSliceEnd(getClass().getName(),"com.google.gson.ModifyFirstLetterNamingPolicyTest.testFieldHasNoLetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13775xb3q5() throws Exception{try{__CLR4_4_13pc3pclck0y8uz.R.inc(4829);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4830);ModifyFirstLetterNamingPolicy policy =
        new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.LOWER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4831);assertEquals("$_$", policy.translateName("$_$", String.class, null));

    __CLR4_4_13pc3pclck0y8uz.R.inc(4832);policy = new ModifyFirstLetterNamingPolicy(ModifyFirstLetterNamingPolicy.LetterModifier.UPPER);
    __CLR4_4_13pc3pclck0y8uz.R.inc(4833);assertEquals("$_$", policy.translateName("$_$", String.class, null));
  }finally{__CLR4_4_13pc3pclck0y8uz.R.flushNeeded();}}
}
