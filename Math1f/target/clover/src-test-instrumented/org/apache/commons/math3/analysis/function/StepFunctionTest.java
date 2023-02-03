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

package org.apache.commons.math3.analysis.function;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NoDataException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link StepFunction}.
 */
public class StepFunctionTest {static class __CLR4_4_11dyj1dyjlb90pbyd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test(expected=NullArgumentException.class)
    public void testPreconditions1() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1dyj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1dyj(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64747);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64748);new StepFunction(null, new double[] {0, -1, -2});
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testPreconditions2() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muisw1dyl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,50,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testPreconditions2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muisw1dyl(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64749);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64750);new StepFunction(new double[] {0, 1}, null);
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test(expected=NoDataException.class)
    public void testPreconditions3() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11duk0f1dyn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,51,58,32,91,78,111,68,97,116,97,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoDataException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testPreconditions3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11duk0f1dyn(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64751);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64752);new StepFunction(new double[] {0}, new double[] {});
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test(expected=NoDataException.class)
    public void testPreconditions4() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v5es21dyp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,52,58,32,91,78,111,68,97,116,97,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoDataException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testPreconditions4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v5es21dyp(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64753);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64754);new StepFunction(new double[] {}, new double[] {0});
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testPreconditions5() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1545dkj1dyr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,53,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testPreconditions5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1545dkj1dyr(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64755);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64756);new StepFunction(new double[] {0, 1}, new double[] {0, -1, -2});
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test(expected=NonMonotonicSequenceException.class)
    public void testPreconditions6() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d5cd01dyt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,54,58,32,91,78,111,110,77,111,110,111,116,111,110,105,99,83,101,113,117,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonMonotonicSequenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testPreconditions6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d5cd01dyt(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64757);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64758);new StepFunction(new double[] {1, 0, 1}, new double[] {0, -1, -2});
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test
    public void testSomeValues() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mpbj1dyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testSomeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mpbj1dyv(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64759);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64760);final double[] x = { -2, -0.5, 0, 1.9, 7.4, 21.3 };
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64761);final double[] y = { 4, -1, -5.5, 0.4, 5.8, 51.2 };

        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64762);final UnivariateFunction f = new StepFunction(x, y);

        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64763);Assert.assertEquals(4, f.value(Double.NEGATIVE_INFINITY), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64764);Assert.assertEquals(4, f.value(-10), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64765);Assert.assertEquals(-1, f.value(-0.4), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64766);Assert.assertEquals(-5.5, f.value(0), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64767);Assert.assertEquals(0.4, f.value(2), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64768);Assert.assertEquals(5.8, f.value(10), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64769);Assert.assertEquals(51.2, f.value(30), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64770);Assert.assertEquals(51.2, f.value(Double.POSITIVE_INFINITY), EPS);
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}
    
    @Test
    public void testEndpointBehavior() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170feao1dz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testEndpointBehavior",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170feao1dz7(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64771);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64772);final double[] x = {0, 1, 2, 3};
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64773);final double[] xp = {-8, 1, 2, 3};
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64774);final double[] y = {1, 2, 3, 4};
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64775);final UnivariateFunction f = new StepFunction(x, y);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64776);final UnivariateFunction fp = new StepFunction(xp, y);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64777);Assert.assertEquals(f.value(-8), fp.value(-8), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64778);Assert.assertEquals(f.value(-10), fp.value(-10), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64779);Assert.assertEquals(f.value(0), fp.value(0), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64780);Assert.assertEquals(f.value(0.5), fp.value(0.5), EPS);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64781);for (int i = 0; (((i < x.length)&&(__CLR4_4_11dyj1dyjlb90pbyd.R.iget(64782)!=0|true))||(__CLR4_4_11dyj1dyjlb90pbyd.R.iget(64783)==0&false)); i++) {{
           __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64784);Assert.assertEquals(y[i], f.value(x[i]), EPS);
           __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64785);if ((((i > 0)&&(__CLR4_4_11dyj1dyjlb90pbyd.R.iget(64786)!=0|true))||(__CLR4_4_11dyj1dyjlb90pbyd.R.iget(64787)==0&false))) {{
               __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64788);Assert.assertEquals(y[i - 1], f.value(x[i] - 0.5), EPS); 
           } }else {{
               __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64789);Assert.assertEquals(y[0], f.value(x[i] - 0.5), EPS); 
           }
        }}
    }}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}

    @Test
    public void testHeaviside() {__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceStart(getClass().getName(),64790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wojf311dzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dyj1dyjlb90pbyd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dyj1dyjlb90pbyd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.StepFunctionTest.testHeaviside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wojf311dzq(){try{__CLR4_4_11dyj1dyjlb90pbyd.R.inc(64790);   
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64791);final UnivariateFunction h = new StepFunction(new double[] {-1, 0},
                                                          new double[] {0, 1});

        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64792);Assert.assertEquals(0, h.value(Double.NEGATIVE_INFINITY), 0);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64793);Assert.assertEquals(0, h.value(-Double.MAX_VALUE), 0);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64794);Assert.assertEquals(0, h.value(-2), 0);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64795);Assert.assertEquals(0, h.value(-Double.MIN_VALUE), 0);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64796);Assert.assertEquals(1, h.value(0), 0);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64797);Assert.assertEquals(1, h.value(2), 0);
        __CLR4_4_11dyj1dyjlb90pbyd.R.inc(64798);Assert.assertEquals(1, h.value(Double.POSITIVE_INFINITY), 0);
    }finally{__CLR4_4_11dyj1dyjlb90pbyd.R.flushNeeded();}}
}
