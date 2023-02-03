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
import org.apache.commons.math3.analysis.FunctionUtils;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.FastMath;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link Logit}.
 */
public class LogitTest {static class __CLR4_4_11dr61dr6lb90pbxm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test(expected=OutOfRangeException.class)
    public void testPreconditions1() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuhld1dr6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,49,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testPreconditions1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuhld1dr6(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64482);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64483);final double lo = -1;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64484);final double hi = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64485);final UnivariateFunction f = new Logit(lo, hi);

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64486);f.value(lo - 1);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testPreconditions2() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14muisw1drb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,50,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testPreconditions2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14muisw1drb(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64487);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64488);final double lo = -1;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64489);final double hi = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64490);final UnivariateFunction f = new Logit(lo, hi);

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64491);f.value(hi + 1);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testSomeValues() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mpbj1drg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testSomeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mpbj1drg(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64492);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64493);final double lo = 1;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64494);final double hi = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64495);final UnivariateFunction f = new Logit(lo, hi);

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64496);Assert.assertEquals(Double.NEGATIVE_INFINITY, f.value(1), EPS);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64497);Assert.assertEquals(Double.POSITIVE_INFINITY, f.value(2), EPS);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64498);Assert.assertEquals(0, f.value(1.5), EPS);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testDerivative() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115h6u81drn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115h6u81drn(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64499);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64500);final double lo = 1;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64501);final double hi = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64502);final Logit f = new Logit(lo, hi);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64503);final DerivativeStructure f15 = f.value(new DerivativeStructure(1, 1, 0, 1.5));

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64504);Assert.assertEquals(4, f15.getPartialDerivative(1), EPS);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testDerivativeLargeArguments() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jtf0b1drt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testDerivativeLargeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jtf0b1drt(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64505);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64506);final Logit f = new Logit(1, 2);

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64507);for (double arg : new double[] {
            Double.NEGATIVE_INFINITY, -Double.MAX_VALUE, -1e155, 1e155, Double.MAX_VALUE, Double.POSITIVE_INFINITY
            }) {{
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64508);try {
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64509);f.value(new DerivativeStructure(1, 1, 0, arg));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64510);Assert.fail("an exception should have been thrown");
            } catch (OutOfRangeException ore) {
                // expected
            } catch (Exception e) {
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64511);Assert.fail("wrong exception caught: " + e.getMessage());
            }
        }
    }}finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testDerivativesHighOrder() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s84yxz1ds0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testDerivativesHighOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s84yxz1ds0(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64512);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64513);DerivativeStructure l = new Logit(1, 3).value(new DerivativeStructure(1, 5, 0, 1.2));
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64514);Assert.assertEquals(-2.1972245773362193828, l.getPartialDerivative(0), 1.0e-16);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64515);Assert.assertEquals(5.5555555555555555555,  l.getPartialDerivative(1), 9.0e-16);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64516);Assert.assertEquals(-24.691358024691358025, l.getPartialDerivative(2), 2.0e-14);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64517);Assert.assertEquals(250.34293552812071331,  l.getPartialDerivative(3), 2.0e-13);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64518);Assert.assertEquals(-3749.4284407864654778, l.getPartialDerivative(4), 4.0e-12);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64519);Assert.assertEquals(75001.270131585632282,  l.getPartialDerivative(5), 8.0e-11);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage1() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxe6x1ds8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,49,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricUsage1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxe6x1ds8(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64520);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64521);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64522);g.value(0, null);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage2() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mxcze1dsb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricUsage2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mxcze1dsb(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64523);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64524);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64525);g.value(0, new double[] {0});
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage3() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vxbrv1dse();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,51,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricUsage3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vxbrv1dse(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64526);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64527);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64528);g.gradient(0, null);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage4() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4xakc1dsh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,52,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricUsage4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4xakc1dsh(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64529);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64530);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64531);g.gradient(0, new double[] {0});
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testParametricUsage5() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddx9ct1dsk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,53,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricUsage5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddx9ct1dsk(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64532);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64533);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64534);g.value(-1, new double[] {0, 1});
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test(expected=OutOfRangeException.class)
    public void testParametricUsage6() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmx85a1dsn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,54,58,32,91,79,117,116,79,102,82,97,110,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof OutOfRangeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricUsage6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64535,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmx85a1dsn(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64535);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64536);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64537);g.value(2, new double[] {0, 1});
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testParametricValue() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqyhpy1dsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testParametricValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqyhpy1dsq(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64538);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64539);final double lo = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64540);final double hi = 3;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64541);final Logit f = new Logit(lo, hi);

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64542);final Logit.Parametric g = new Logit.Parametric();
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64543);Assert.assertEquals(f.value(2), g.value(2, new double[] {lo, hi}), 0);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64544);Assert.assertEquals(f.value(2.34567), g.value(2.34567, new double[] {lo, hi}), 0);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64545);Assert.assertEquals(f.value(3), g.value(3, new double[] {lo, hi}), 0);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testValueWithInverseFunction() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ofe0pi1dsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testValueWithInverseFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ofe0pi1dsy(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64546);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64547);final double lo = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64548);final double hi = 3;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64549);final Logit f = new Logit(lo, hi);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64550);final Sigmoid g = new Sigmoid(lo, hi);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64551);RandomGenerator random = new Well1024a(0x49914cdd9f0b8db5l);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64552);final UnivariateDifferentiableFunction id = FunctionUtils.compose((UnivariateDifferentiableFunction) g,
                                                                (UnivariateDifferentiableFunction) f);

        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64553);for (int i = 0; (((i < 10)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64554)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64555)==0&false)); i++) {{
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64556);final double x = lo + random.nextDouble() * (hi - lo);
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64557);Assert.assertEquals(x, id.value(new DerivativeStructure(1, 1, 0, x)).getValue(), EPS);
        }

        }__CLR4_4_11dr61dr6lb90pbxm.R.inc(64558);Assert.assertEquals(lo, id.value(new DerivativeStructure(1, 1, 0, lo)).getValue(), EPS);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64559);Assert.assertEquals(hi, id.value(new DerivativeStructure(1, 1, 0, hi)).getValue(), EPS);
    }finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}

    @Test
    public void testDerivativesWithInverseFunction() {__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceStart(getClass().getName(),64560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13stl731dtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dr61dr6lb90pbxm.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dr61dr6lb90pbxm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.LogitTest.testDerivativesWithInverseFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13stl731dtc(){try{__CLR4_4_11dr61dr6lb90pbxm.R.inc(64560);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64561);double[] epsilon = new double[] { 1.0e-20, 4.0e-16, 3.0e-15, 2.0e-11, 3.0e-9, 1.0e-6 };
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64562);final double lo = 2;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64563);final double hi = 3;
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64564);final Logit f = new Logit(lo, hi);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64565);final Sigmoid g = new Sigmoid(lo, hi);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64566);RandomGenerator random = new Well1024a(0x96885e9c1f81cea5l);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64567);final UnivariateDifferentiableFunction id =
                FunctionUtils.compose((UnivariateDifferentiableFunction) g, (UnivariateDifferentiableFunction) f);
        __CLR4_4_11dr61dr6lb90pbxm.R.inc(64568);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64569)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64570)==0&false)); ++maxOrder) {{
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64571);double max = 0;
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64572);for (int i = 0; (((i < 10)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64573)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64574)==0&false)); i++) {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64575);final double x = lo + random.nextDouble() * (hi - lo);
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64576);final DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64577);max = FastMath.max(max, FastMath.abs(dsX.getPartialDerivative(maxOrder) -
                                                     id.value(dsX).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64578);Assert.assertEquals(dsX.getPartialDerivative(maxOrder),
                                    id.value(dsX).getPartialDerivative(maxOrder),
                                    epsilon[maxOrder]);
            }

            // each function evaluates correctly near boundaries,
            // but combination leads to NaN as some intermediate point is infinite
            }__CLR4_4_11dr61dr6lb90pbxm.R.inc(64579);final DerivativeStructure dsLo = new DerivativeStructure(1, maxOrder, 0, lo);
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64580);if ((((maxOrder == 0)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64581)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64582)==0&false))) {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64583);Assert.assertTrue(Double.isInfinite(f.value(dsLo).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64584);Assert.assertEquals(lo, id.value(dsLo).getPartialDerivative(maxOrder), epsilon[maxOrder]);
            } }else {__CLR4_4_11dr61dr6lb90pbxm.R.inc(64585);if ((((maxOrder == 1)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64586)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64587)==0&false))) {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64588);Assert.assertTrue(Double.isInfinite(f.value(dsLo).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64589);Assert.assertTrue(Double.isNaN(id.value(dsLo).getPartialDerivative(maxOrder)));
            } }else {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64590);Assert.assertTrue(Double.isNaN(f.value(dsLo).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64591);Assert.assertTrue(Double.isNaN(id.value(dsLo).getPartialDerivative(maxOrder)));
            }

            }}__CLR4_4_11dr61dr6lb90pbxm.R.inc(64592);final DerivativeStructure dsHi = new DerivativeStructure(1, maxOrder, 0, hi);
            __CLR4_4_11dr61dr6lb90pbxm.R.inc(64593);if ((((maxOrder == 0)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64594)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64595)==0&false))) {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64596);Assert.assertTrue(Double.isInfinite(f.value(dsHi).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64597);Assert.assertEquals(hi, id.value(dsHi).getPartialDerivative(maxOrder), epsilon[maxOrder]);
            } }else {__CLR4_4_11dr61dr6lb90pbxm.R.inc(64598);if ((((maxOrder == 1)&&(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64599)!=0|true))||(__CLR4_4_11dr61dr6lb90pbxm.R.iget(64600)==0&false))) {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64601);Assert.assertTrue(Double.isInfinite(f.value(dsHi).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64602);Assert.assertTrue(Double.isNaN(id.value(dsHi).getPartialDerivative(maxOrder)));
            } }else {{
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64603);Assert.assertTrue(Double.isNaN(f.value(dsHi).getPartialDerivative(maxOrder)));
                __CLR4_4_11dr61dr6lb90pbxm.R.inc(64604);Assert.assertTrue(Double.isNaN(id.value(dsHi).getPartialDerivative(maxOrder)));
            }

        }}}
    }}finally{__CLR4_4_11dr61dr6lb90pbxm.R.flushNeeded();}}
}
