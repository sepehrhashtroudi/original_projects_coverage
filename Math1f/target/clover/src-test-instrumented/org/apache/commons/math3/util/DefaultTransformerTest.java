/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math3.util;

import java.math.BigDecimal;


import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

/**
 * @version $Id$
 */
public class DefaultTransformerTest {static class __CLR4_4_12eyn2eynlb90pey5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    @Test
    public void testTransformDouble() throws Exception {__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjvnte2eyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testTransformDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjvnte2eyn() throws Exception{try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112703);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112704);double expected = 1.0;
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112705);Double input = Double.valueOf(expected);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112706);DefaultTransformer t = new DefaultTransformer();
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112707);Assert.assertEquals(expected, t.transform(input), 1.0e-4);
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testTransformNull() throws Exception {__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iyf5k2eys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testTransformNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iyf5k2eys() throws Exception{try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112708);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112709);DefaultTransformer t = new DefaultTransformer();
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112710);try {
            __CLR4_4_12eyn2eynlb90pey5.R.inc(112711);t.transform(null);
            __CLR4_4_12eyn2eynlb90pey5.R.inc(112712);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testTransformInteger() throws Exception {__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pc6qaz2eyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testTransformInteger",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pc6qaz2eyx() throws Exception{try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112713);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112714);double expected = 1.0;
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112715);Integer input = Integer.valueOf(1);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112716);DefaultTransformer t = new DefaultTransformer();
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112717);Assert.assertEquals(expected, t.transform(input), 1.0e-4);
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testTransformBigDecimal() throws Exception {__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8k88i2ez2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testTransformBigDecimal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112718,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8k88i2ez2() throws Exception{try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112718);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112719);double expected = 1.0;
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112720);BigDecimal input = new BigDecimal("1.0");
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112721);DefaultTransformer t = new DefaultTransformer();
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112722);Assert.assertEquals(expected, t.transform(input), 1.0e-4);
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testTransformString() throws Exception {__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lxn82a2ez7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testTransformString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lxn82a2ez7() throws Exception{try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112723);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112724);double expected = 1.0;
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112725);String input = "1.0";
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112726);DefaultTransformer t = new DefaultTransformer();
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112727);Assert.assertEquals(expected, t.transform(input), 1.0e-4);
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

    /**
     *
     */
    @Test(expected=MathIllegalArgumentException.class)
    public void testTransformObject(){__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bdz85c2ezc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,114,97,110,115,102,111,114,109,79,98,106,101,99,116,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testTransformObject",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bdz85c2ezc(){try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112728);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112729);Boolean input = Boolean.TRUE;
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112730);DefaultTransformer t = new DefaultTransformer();
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112731);t.transform(input);
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_12eyn2eynlb90pey5.R.globalSliceStart(getClass().getName(),112732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv2ezg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12eyn2eynlb90pey5.R.rethrow($CLV_t2$);}finally{__CLR4_4_12eyn2eynlb90pey5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DefaultTransformerTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv2ezg(){try{__CLR4_4_12eyn2eynlb90pey5.R.inc(112732);
        __CLR4_4_12eyn2eynlb90pey5.R.inc(112733);Assert.assertEquals(new DefaultTransformer(), TestUtils.serializeAndRecover(new DefaultTransformer()));
    }finally{__CLR4_4_12eyn2eynlb90pey5.R.flushNeeded();}}

}
