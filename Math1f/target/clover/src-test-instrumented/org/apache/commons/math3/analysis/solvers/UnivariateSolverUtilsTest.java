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

package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * @version $Id$
 */
public class UnivariateSolverUtilsTest {static class __CLR4_4_11h4h1h4hlb90pc5j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected UnivariateFunction sin = new Sin();

    @Test(expected=MathIllegalArgumentException.class)
    public void testSolveNull() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vd3ps51h4h();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,111,108,118,101,78,117,108,108,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vd3ps51h4h(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68849);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68850);UnivariateSolverUtils.solve(null, 0.0, 4.0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test(expected=MathIllegalArgumentException.class)
    public void testSolveBadEndpoints() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gx5fcd1h4j();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,111,108,118,101,66,97,100,69,110,100,112,111,105,110,116,115,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveBadEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gx5fcd1h4j(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68851);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68852);double root = UnivariateSolverUtils.solve(sin, 4.0, -0.1, 1e-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68853);System.out.println("root=" + root);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test
    public void testSolveBadAccuracy() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cq66uw1h4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveBadAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cq66uw1h4m(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68854);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68855);try { // bad accuracy
            __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68856);UnivariateSolverUtils.solve(sin, 0.0, 4.0, 0.0);
//             Assert.fail("Expecting MathIllegalArgumentException"); // TODO needs rework since convergence behaviour was changed
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test
    public void testSolveSin() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11xe6cy1h4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11xe6cy1h4p(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68857);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68858);double x = UnivariateSolverUtils.solve(sin, 1.0, 4.0);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68859);Assert.assertEquals(FastMath.PI, x, 1.0e-4);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test(expected=MathIllegalArgumentException.class)
    public void testSolveAccuracyNull()  {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cep4241h4s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,111,108,118,101,65,99,99,117,114,97,99,121,78,117,108,108,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveAccuracyNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cep4241h4s(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68860);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68861);double accuracy = 1.0e-6;
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68862);UnivariateSolverUtils.solve(null, 0.0, 4.0, accuracy);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test
    public void testSolveAccuracySin() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19evaqh1h4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveAccuracySin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19evaqh1h4v(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68863);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68864);double accuracy = 1.0e-6;
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68865);double x = UnivariateSolverUtils.solve(sin, 1.0,
                4.0, accuracy);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68866);Assert.assertEquals(FastMath.PI, x, accuracy);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test(expected=MathIllegalArgumentException.class)
    public void testSolveNoRoot() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1673xop1h4z();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,111,108,118,101,78,111,82,111,111,116,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testSolveNoRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1673xop1h4z(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68867);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68868);UnivariateSolverUtils.solve(sin, 1.0, 1.5);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test
    public void testBracketSin() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrmma11h51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testBracketSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68869,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrmma11h51(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68869);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68870);double[] result = UnivariateSolverUtils.bracket(sin,
                0.0, -2.0, 2.0);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68871);Assert.assertTrue(sin.value(result[0]) < 0);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68872);Assert.assertTrue(sin.value(result[1]) > 0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test
    public void testBracketEndpointRoot() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0vur01h55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testBracketEndpointRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0vur01h55(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68873);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68874);double[] result = UnivariateSolverUtils.bracket(sin, 1.5, 0, 2.0);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68875);Assert.assertEquals(0.0, sin.value(result[0]), 1.0e-15);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68876);Assert.assertTrue(sin.value(result[1]) > 0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test(expected=MathIllegalArgumentException.class)
    public void testNullFunction() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1c66w1h59();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,70,117,110,99,116,105,111,110,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testNullFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1c66w1h59(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68877);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68878);UnivariateSolverUtils.bracket(null, 1.5, 0, 2.0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}
    
    @Test(expected=MathIllegalArgumentException.class)
    public void testBadInitial() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tf5wko1h5b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,97,100,73,110,105,116,105,97,108,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testBadInitial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tf5wko1h5b(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68879);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68880);UnivariateSolverUtils.bracket(sin, 2.5, 0, 2.0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}
    
    @Test(expected=MathIllegalArgumentException.class)
    public void testBadEndpoints() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17uujqm1h5d();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,97,100,69,110,100,112,111,105,110,116,115,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testBadEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17uujqm1h5d(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68881);
        // endpoints not valid
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68882);UnivariateSolverUtils.bracket(sin, 1.5, 2.0, 1.0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}
    
    @Test(expected=MathIllegalArgumentException.class)
    public void testBadMaximumIterations() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n7b5oq1h5f();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,97,100,77,97,120,105,109,117,109,73,116,101,114,97,116,105,111,110,115,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testBadMaximumIterations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68883,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n7b5oq1h5f(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68883);
        // bad maximum iterations
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68884);UnivariateSolverUtils.bracket(sin, 1.5, 0, 2.0, 0);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}

    @Test
    public void testMisc() {__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceStart(getClass().getName(),68885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mluxnf1h5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h4h1h4hlb90pc5j.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h4h1h4hlb90pc5j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest.testMisc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mluxnf1h5h(){try{__CLR4_4_11h4h1h4hlb90pc5j.R.inc(68885);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68886);UnivariateFunction f = new QuinticFunction();
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68887);double result;
        // Static solve method
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68888);result = UnivariateSolverUtils.solve(f, -0.2, 0.2);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68889);Assert.assertEquals(result, 0, 1E-8);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68890);result = UnivariateSolverUtils.solve(f, -0.1, 0.3);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68891);Assert.assertEquals(result, 0, 1E-8);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68892);result = UnivariateSolverUtils.solve(f, -0.3, 0.45);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68893);Assert.assertEquals(result, 0, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68894);result = UnivariateSolverUtils.solve(f, 0.3, 0.7);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68895);Assert.assertEquals(result, 0.5, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68896);result = UnivariateSolverUtils.solve(f, 0.2, 0.6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68897);Assert.assertEquals(result, 0.5, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68898);result = UnivariateSolverUtils.solve(f, 0.05, 0.95);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68899);Assert.assertEquals(result, 0.5, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68900);result = UnivariateSolverUtils.solve(f, 0.85, 1.25);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68901);Assert.assertEquals(result, 1.0, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68902);result = UnivariateSolverUtils.solve(f, 0.8, 1.2);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68903);Assert.assertEquals(result, 1.0, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68904);result = UnivariateSolverUtils.solve(f, 0.85, 1.75);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68905);Assert.assertEquals(result, 1.0, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68906);result = UnivariateSolverUtils.solve(f, 0.55, 1.45);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68907);Assert.assertEquals(result, 1.0, 1E-6);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68908);result = UnivariateSolverUtils.solve(f, 0.85, 5);
        __CLR4_4_11h4h1h4hlb90pc5j.R.inc(68909);Assert.assertEquals(result, 1.0, 1E-6);
    }finally{__CLR4_4_11h4h1h4hlb90pc5j.R.flushNeeded();}}
}
