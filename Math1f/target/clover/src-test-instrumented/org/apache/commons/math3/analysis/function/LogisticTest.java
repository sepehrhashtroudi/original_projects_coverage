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
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link Logistic}.
 */
public class LogisticTest {static class __CLR4_4_11dob1doblb90pbx5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions1() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1dob();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1dob(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64379);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64380);new Logistic(1, 0, 1, 1, 0, -1);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions2() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muisw1dod();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,50,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testPreconditions2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muisw1dod(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64381);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64382);new Logistic(1, 0, 1, 1, 0, 0);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test
    public void testCompareSigmoid() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14w27zy1dof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testCompareSigmoid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14w27zy1dof(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64383);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64384);final UnivariateFunction sig = new Sigmoid();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64385);final UnivariateFunction sigL = new Logistic(1, 0, 1, 1, 0, 1);

        __CLR4_4_11dob1doblb90pbx5.R.inc(64386);final double min = -2;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64387);final double max = 2;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64388);final int n = 100;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64389);final double delta = (max - min) / n;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64390);for (int i = 0; (((i < n)&&(__CLR4_4_11dob1doblb90pbx5.R.iget(64391)!=0|true))||(__CLR4_4_11dob1doblb90pbx5.R.iget(64392)==0&false)); i++) {{
            __CLR4_4_11dob1doblb90pbx5.R.inc(64393);final double x = min + i * delta;
            __CLR4_4_11dob1doblb90pbx5.R.inc(64394);Assert.assertEquals("x=" + x, sig.value(x), sigL.value(x), EPS);
        }
    }}finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test
    public void testSomeValues() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mpbj1dor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testSomeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mpbj1dor(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64395);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64396);final double k = 4;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64397);final double m = 5;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64398);final double b = 2;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64399);final double q = 3;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64400);final double a = -1;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64401);final double n = 2;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64402);final UnivariateFunction f = new Logistic(k, m, b, q, a, n);

        __CLR4_4_11dob1doblb90pbx5.R.inc(64403);double x;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64404);x = m;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64405);Assert.assertEquals("x=" + x, a + (k - a) / FastMath.sqrt(1 + q), f.value(x), EPS);

        __CLR4_4_11dob1doblb90pbx5.R.inc(64406);x = Double.NEGATIVE_INFINITY;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64407);Assert.assertEquals("x=" + x, a, f.value(x), EPS);

        __CLR4_4_11dob1doblb90pbx5.R.inc(64408);x = Double.POSITIVE_INFINITY;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64409);Assert.assertEquals("x=" + x, k, f.value(x), EPS);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test
    public void testCompareDerivativeSigmoid() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqo1r91dp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testCompareDerivativeSigmoid",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqo1r91dp6(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64410);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64411);final double k = 3;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64412);final double a = 2;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64413);final Logistic f = new Logistic(k, 0, 1, 1, a, 1);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64414);final Sigmoid g = new Sigmoid(a, k);
        
        __CLR4_4_11dob1doblb90pbx5.R.inc(64415);final double min = -10;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64416);final double max = 10;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64417);final double n = 20;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64418);final double delta = (max - min) / n;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64419);for (int i = 0; (((i < n)&&(__CLR4_4_11dob1doblb90pbx5.R.iget(64420)!=0|true))||(__CLR4_4_11dob1doblb90pbx5.R.iget(64421)==0&false)); i++) {{
            __CLR4_4_11dob1doblb90pbx5.R.inc(64422);final DerivativeStructure x = new DerivativeStructure(1, 5, 0, min + i * delta);
            __CLR4_4_11dob1doblb90pbx5.R.inc(64423);for (int order = 0; (((order <= x.getOrder())&&(__CLR4_4_11dob1doblb90pbx5.R.iget(64424)!=0|true))||(__CLR4_4_11dob1doblb90pbx5.R.iget(64425)==0&false)); ++order) {{
                __CLR4_4_11dob1doblb90pbx5.R.inc(64426);Assert.assertEquals("x=" + x.getValue(),
                                    g.value(x).getPartialDerivative(order),
                                    f.value(x).getPartialDerivative(order),
                                    3.0e-15);
            }
        }}
    }}finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage1() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxe6x1dpn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,49,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testParametricUsage1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxe6x1dpn(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64427);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64428);final Logistic.Parametric g = new Logistic.Parametric();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64429);g.value(0, null);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage2() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mxcze1dpq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testParametricUsage2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mxcze1dpq(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64430);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64431);final Logistic.Parametric g = new Logistic.Parametric();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64432);g.value(0, new double[] {0});
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage3() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vxbrv1dpt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,51,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testParametricUsage3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vxbrv1dpt(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64433);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64434);final Logistic.Parametric g = new Logistic.Parametric();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64435);g.gradient(0, null);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage4() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4xakc1dpw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,52,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testParametricUsage4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4xakc1dpw(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64436);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64437);final Logistic.Parametric g = new Logistic.Parametric();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64438);g.gradient(0, new double[] {0});
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testParametricUsage5() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddx9ct1dpz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,53,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testParametricUsage5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddx9ct1dpz(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64439);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64440);final Logistic.Parametric g = new Logistic.Parametric();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64441);g.value(0, new double[] {1, 0, 1, 1, 0 ,0});
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testParametricUsage6() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmx85a1dq2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,54,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testParametricUsage6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmx85a1dq2(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64442);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64443);final Logistic.Parametric g = new Logistic.Parametric();
        __CLR4_4_11dob1doblb90pbx5.R.inc(64444);g.gradient(0, new double[] {1, 0, 1, 1, 0 ,0});
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test
    public void testGradientComponent0Component4() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arm3tf1dq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testGradientComponent0Component4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arm3tf1dq5(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64445);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64446);final double k = 3;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64447);final double a = 2;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64448);final Logistic.Parametric f = new Logistic.Parametric();
        // Compare using the "Sigmoid" function.
        __CLR4_4_11dob1doblb90pbx5.R.inc(64449);final Sigmoid.Parametric g = new Sigmoid.Parametric();
        
        __CLR4_4_11dob1doblb90pbx5.R.inc(64450);final double x = 0.12345;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64451);final double[] gf = f.gradient(x, new double[] {k, 0, 1, 1, a, 1});
        __CLR4_4_11dob1doblb90pbx5.R.inc(64452);final double[] gg = g.gradient(x, new double[] {a, k});

        __CLR4_4_11dob1doblb90pbx5.R.inc(64453);Assert.assertEquals(gg[0], gf[4], EPS);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64454);Assert.assertEquals(gg[1], gf[0], EPS);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test
    public void testGradientComponent5() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16um9gh1dqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testGradientComponent5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16um9gh1dqf(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64455);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64456);final double m = 1.2;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64457);final double k = 3.4;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64458);final double a = 2.3;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64459);final double q = 0.567;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64460);final double b = -FastMath.log(q);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64461);final double n = 3.4;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64462);final Logistic.Parametric f = new Logistic.Parametric();
        
        __CLR4_4_11dob1doblb90pbx5.R.inc(64463);final double x = m - 1;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64464);final double qExp1 = 2;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64465);final double[] gf = f.gradient(x, new double[] {k, m, b, q, a, n});

        __CLR4_4_11dob1doblb90pbx5.R.inc(64466);Assert.assertEquals((k - a) * FastMath.log(qExp1) / (n * n * FastMath.pow(qExp1, 1 / n)),
                            gf[5], EPS);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}

    @Test
    public void testGradientComponent1Component2Component3() {__CLR4_4_11dob1doblb90pbx5.R.globalSliceStart(getClass().getName(),64467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19xcoiw1dqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dob1doblb90pbx5.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dob1doblb90pbx5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogisticTest.testGradientComponent1Component2Component3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19xcoiw1dqr(){try{__CLR4_4_11dob1doblb90pbx5.R.inc(64467);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64468);final double m = 1.2;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64469);final double k = 3.4;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64470);final double a = 2.3;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64471);final double b = 0.567;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64472);final double q = 1 / FastMath.exp(b * m);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64473);final double n = 3.4;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64474);final Logistic.Parametric f = new Logistic.Parametric();
        
        __CLR4_4_11dob1doblb90pbx5.R.inc(64475);final double x = 0;
        __CLR4_4_11dob1doblb90pbx5.R.inc(64476);final double qExp1 = 2;

        __CLR4_4_11dob1doblb90pbx5.R.inc(64477);final double[] gf = f.gradient(x, new double[] {k, m, b, q, a, n});

        __CLR4_4_11dob1doblb90pbx5.R.inc(64478);final double factor = (a - k) / (n * FastMath.pow(qExp1, 1 / n + 1));
        __CLR4_4_11dob1doblb90pbx5.R.inc(64479);Assert.assertEquals(factor * b, gf[1], EPS);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64480);Assert.assertEquals(factor * m, gf[2], EPS);
        __CLR4_4_11dob1doblb90pbx5.R.inc(64481);Assert.assertEquals(factor / q, gf[3], EPS);
    }finally{__CLR4_4_11dob1doblb90pbx5.R.flushNeeded();}}
}
