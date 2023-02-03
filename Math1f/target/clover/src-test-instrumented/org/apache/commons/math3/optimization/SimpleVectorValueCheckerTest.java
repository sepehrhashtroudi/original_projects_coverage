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
package org.apache.commons.math3.optimization;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.junit.Test;
import org.junit.Assert;

public class SimpleVectorValueCheckerTest {static class __CLR4_4_1246e246elb90pdyk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=NotStrictlyPositiveException.class)
    public void testIterationCheckPrecondition() {__CLR4_4_1246e246elb90pdyk.R.globalSliceStart(getClass().getName(),98726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zffu6c246e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,116,101,114,97,116,105,111,110,67,104,101,99,107,80,114,101,99,111,110,100,105,116,105,111,110,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246e246elb90pdyk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246e246elb90pdyk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.SimpleVectorValueCheckerTest.testIterationCheckPrecondition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98726,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zffu6c246e(){try{__CLR4_4_1246e246elb90pdyk.R.inc(98726);
        __CLR4_4_1246e246elb90pdyk.R.inc(98727);new SimpleVectorValueChecker(1e-1, 1e-2, 0);
    }finally{__CLR4_4_1246e246elb90pdyk.R.flushNeeded();}}

    @Test
    public void testIterationCheck() {__CLR4_4_1246e246elb90pdyk.R.globalSliceStart(getClass().getName(),98728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1whvytg246g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246e246elb90pdyk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246e246elb90pdyk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.SimpleVectorValueCheckerTest.testIterationCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1whvytg246g(){try{__CLR4_4_1246e246elb90pdyk.R.inc(98728);
        __CLR4_4_1246e246elb90pdyk.R.inc(98729);final int max = 10;
        __CLR4_4_1246e246elb90pdyk.R.inc(98730);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(1e-1, 1e-2, max);
        __CLR4_4_1246e246elb90pdyk.R.inc(98731);Assert.assertTrue(checker.converged(max, null, null));
        __CLR4_4_1246e246elb90pdyk.R.inc(98732);Assert.assertTrue(checker.converged(max + 1, null, null));
    }finally{__CLR4_4_1246e246elb90pdyk.R.flushNeeded();}}

    @Test
    public void testIterationCheckDisabled() {__CLR4_4_1246e246elb90pdyk.R.globalSliceStart(getClass().getName(),98733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yi58o0246l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1246e246elb90pdyk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1246e246elb90pdyk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.SimpleVectorValueCheckerTest.testIterationCheckDisabled",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98733,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yi58o0246l(){try{__CLR4_4_1246e246elb90pdyk.R.inc(98733);
        __CLR4_4_1246e246elb90pdyk.R.inc(98734);final SimpleVectorValueChecker checker = new SimpleVectorValueChecker(1e-8, 1e-8);

        __CLR4_4_1246e246elb90pdyk.R.inc(98735);final PointVectorValuePair a = new PointVectorValuePair(new double[] { 1d },
                                                                new double[] { 1d });
        __CLR4_4_1246e246elb90pdyk.R.inc(98736);final PointVectorValuePair b = new PointVectorValuePair(new double[] { 10d },
                                                                new double[] { 10d });

        __CLR4_4_1246e246elb90pdyk.R.inc(98737);Assert.assertFalse(checker.converged(-1, a, b));
        __CLR4_4_1246e246elb90pdyk.R.inc(98738);Assert.assertFalse(checker.converged(0, a, b));
        __CLR4_4_1246e246elb90pdyk.R.inc(98739);Assert.assertFalse(checker.converged(1000000, a, b));

        __CLR4_4_1246e246elb90pdyk.R.inc(98740);Assert.assertTrue(checker.converged(-1, a, a));
        __CLR4_4_1246e246elb90pdyk.R.inc(98741);Assert.assertTrue(checker.converged(-1, b, b));
    }finally{__CLR4_4_1246e246elb90pdyk.R.flushNeeded();}}

}
