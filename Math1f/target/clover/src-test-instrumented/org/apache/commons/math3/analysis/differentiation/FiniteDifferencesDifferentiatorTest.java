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

package org.apache.commons.math3.analysis.differentiation;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.UnivariateMatrixFunction;
import org.apache.commons.math3.analysis.UnivariateVectorFunction;
import org.apache.commons.math3.analysis.function.Gaussian;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link FiniteDifferencesDifferentiator}.
 */
public class FiniteDifferencesDifferentiatorTest {static class __CLR4_4_11dbc1dbclb90pbw7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=NumberIsTooSmallException.class)
    public void testWrongNumberOfPoints() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151g6l71dbc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,78,117,109,98,101,114,79,102,80,111,105,110,116,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testWrongNumberOfPoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151g6l71dbc(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63912);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63913);new FiniteDifferencesDifferentiator(1, 1.0);
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test(expected=NotPositiveException.class)
    public void testWrongStepSize() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lc71pt1dbe();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,83,116,101,112,83,105,122,101,58,32,91,78,111,116,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testWrongStepSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lc71pt1dbe(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63914);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63915);new FiniteDifferencesDifferentiator(3, 0.0);
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testSerialization() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91dbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91dbg(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63916);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63917);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(3, 1.0e-3);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63918);FiniteDifferencesDifferentiator recovered =
                (FiniteDifferencesDifferentiator) TestUtils.serializeAndRecover(differentiator);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63919);Assert.assertEquals(differentiator.getNbPoints(), recovered.getNbPoints());
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63920);Assert.assertEquals(differentiator.getStepSize(), recovered.getStepSize(), 1.0e-15);
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testConstant() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v1dbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v1dbl(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63921);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63922);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(5, 0.01);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63923);UnivariateDifferentiableFunction f =
                differentiator.differentiate(new UnivariateFunction() {
                    public double value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63924);
                        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63925);return 42.0;
                    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
                });
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63926);for (double x = -10; (((x < 10)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63927)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63928)==0&false)); x += 0.1) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63929);DerivativeStructure y = f.value(new DerivativeStructure(1, 2, 0, x));
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63930);Assert.assertEquals(42.0, y.getValue(), 1.0e-15);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63931);Assert.assertEquals( 0.0, y.getPartialDerivative(1), 1.0e-15);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63932);Assert.assertEquals( 0.0, y.getPartialDerivative(2), 1.0e-15);
        }
    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testLinear() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12wwc3m1dbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12wwc3m1dbx(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63933);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63934);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(5, 0.01);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63935);UnivariateDifferentiableFunction f =
                differentiator.differentiate(new UnivariateFunction() {
                    public double value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63936);
                        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63937);return 2 - 3 * x;
                    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
                });
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63938);for (double x = -10; (((x < 10)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63939)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63940)==0&false)); x += 0.1) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63941);DerivativeStructure y = f.value(new DerivativeStructure(1, 2, 0, x));
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63942);Assert.assertEquals("" + (2 - 3 * x - y.getValue()), 2 - 3 * x, y.getValue(), 2.0e-15);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63943);Assert.assertEquals(-3.0, y.getPartialDerivative(1), 4.0e-13);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63944);Assert.assertEquals( 0.0, y.getPartialDerivative(2), 9.0e-11);
        }
    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testGaussian() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttx0vg1dc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testGaussian",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttx0vg1dc9(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63945);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63946);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(9, 0.02);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63947);UnivariateDifferentiableFunction gaussian = new Gaussian(1.0, 2.0);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63948);UnivariateDifferentiableFunction f =
                differentiator.differentiate(gaussian);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63949);double[] expectedError = new double[] {
            6.939e-18, 1.284e-15, 2.477e-13, 1.168e-11, 2.840e-9, 7.971e-8
        };
       __CLR4_4_11dbc1dbclb90pbw7.R.inc(63950);double[] maxError = new double[expectedError.length];
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63951);for (double x = -10; (((x < 10)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63952)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63953)==0&false)); x += 0.1) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63954);DerivativeStructure dsX  = new DerivativeStructure(1, maxError.length - 1, 0, x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63955);DerivativeStructure yRef = gaussian.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63956);DerivativeStructure y    = f.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63957);Assert.assertEquals(f.value(dsX.getValue()), f.value(dsX).getValue(), 1.0e-15);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63958);for (int order = 0; (((order <= yRef.getOrder())&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63959)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63960)==0&false)); ++order) {{
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(63961);maxError[order] = FastMath.max(maxError[order],
                                        FastMath.abs(yRef.getPartialDerivative(order) -
                                                     y.getPartialDerivative(order)));
            }
        }}
        }__CLR4_4_11dbc1dbclb90pbw7.R.inc(63962);for (int i = 0; (((i < maxError.length)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63963)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63964)==0&false)); ++i) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63965);Assert.assertEquals(expectedError[i], maxError[i], 0.01 * expectedError[i]);
        }
    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testStepSizeUnstability() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_123ov941dcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testStepSizeUnstability",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_123ov941dcu(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63966);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63967);UnivariateDifferentiableFunction quintic = new QuinticFunction();
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63968);UnivariateDifferentiableFunction goodStep =
                new FiniteDifferencesDifferentiator(7, 0.25).differentiate(quintic);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63969);UnivariateDifferentiableFunction badStep =
                new FiniteDifferencesDifferentiator(7, 1.0e-6).differentiate(quintic);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63970);double[] maxErrorGood = new double[7];
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63971);double[] maxErrorBad  = new double[7];
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63972);for (double x = -10; (((x < 10)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63973)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63974)==0&false)); x += 0.1) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63975);DerivativeStructure dsX  = new DerivativeStructure(1, 6, 0, x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63976);DerivativeStructure yRef  = quintic.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63977);DerivativeStructure yGood = goodStep.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63978);DerivativeStructure yBad  = badStep.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63979);for (int order = 0; (((order <= 6)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63980)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63981)==0&false)); ++order) {{
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(63982);maxErrorGood[order] = FastMath.max(maxErrorGood[order],
                                                   FastMath.abs(yRef.getPartialDerivative(order) -
                                                                yGood.getPartialDerivative(order)));
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(63983);maxErrorBad[order]  = FastMath.max(maxErrorBad[order],
                                                   FastMath.abs(yRef.getPartialDerivative(order) -
                                                                yBad.getPartialDerivative(order)));
            }
        }}

        // the 0.25 step size is good for finite differences in the quintic on this abscissa range for 7 points
        // the errors are fair
        }__CLR4_4_11dbc1dbclb90pbw7.R.inc(63984);final double[] expectedGood = new double[] {
            7.276e-12, 7.276e-11, 9.968e-10, 3.092e-9, 5.432e-8, 8.196e-8, 1.818e-6
        };

        // the 1.0e-6 step size is far too small for finite differences in the quintic on this abscissa range for 7 points
        // the errors are huge!
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63985);final double[] expectedBad = new double[] {
            2.910e-11, 2.087e-5, 147.7, 3.820e7, 6.354e14, 6.548e19, 1.543e27            
        };

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63986);for (int i = 0; (((i < maxErrorGood.length)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63987)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(63988)==0&false)); ++i) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63989);Assert.assertEquals(expectedGood[i], maxErrorGood[i], 0.01 * expectedGood[i]);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(63990);Assert.assertEquals(expectedBad[i],  maxErrorBad[i],  0.01 * expectedBad[i]);
        }

    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testWrongOrder() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ffuiu1ddj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,79,114,100,101,114,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testWrongOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63991,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ffuiu1ddj(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63991);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63992);UnivariateDifferentiableFunction f =
                new FiniteDifferencesDifferentiator(3, 0.01).differentiate(new UnivariateFunction() {
                    public double value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63993);
                        // this exception should not be thrown because wrong order
                        // should be detected before function call
                        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63994);throw new MathInternalError();
                    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
                });
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63995);f.value(new DerivativeStructure(1, 3, 0, 1.0));
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testWrongOrderVector() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),63996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8kxvh1ddo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,79,114,100,101,114,86,101,99,116,111,114,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testWrongOrderVector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8kxvh1ddo(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63996);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63997);UnivariateDifferentiableVectorFunction f =
                new FiniteDifferencesDifferentiator(3, 0.01).differentiate(new UnivariateVectorFunction() {
                    public double[] value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(63998);
                        // this exception should not be thrown because wrong order
                        // should be detected before function call
                        __CLR4_4_11dbc1dbclb90pbw7.R.inc(63999);throw new MathInternalError();
                    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
                });
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64000);f.value(new DerivativeStructure(1, 3, 0, 1.0));
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testWrongOrderMatrix() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xfcn91ddt();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,79,114,100,101,114,77,97,116,114,105,120,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testWrongOrderMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xfcn91ddt(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64001);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64002);UnivariateDifferentiableMatrixFunction f =
                new FiniteDifferencesDifferentiator(3, 0.01).differentiate(new UnivariateMatrixFunction() {
                    public double[][] value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64003);
                        // this exception should not be thrown because wrong order
                        // should be detected before function call
                        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64004);throw new MathInternalError();
                    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
                });
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64005);f.value(new DerivativeStructure(1, 3, 0, 1.0));
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testTooLargeStep() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gbtl9w1ddy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,111,76,97,114,103,101,83,116,101,112,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testTooLargeStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gbtl9w1ddy(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64006);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64007);new FiniteDifferencesDifferentiator(3, 2.5, 0.0, 1.0);
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testBounds() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mgbrg21de0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mgbrg21de0(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64008);

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64009);final double slope = 2.5;
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64010);UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64011);
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64012);if ((((x < 0)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64013)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64014)==0&false))) {{
                    __CLR4_4_11dbc1dbclb90pbw7.R.inc(64015);throw new NumberIsTooSmallException(x, 0, true);
                } }else {__CLR4_4_11dbc1dbclb90pbw7.R.inc(64016);if ((((x > 1)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64017)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64018)==0&false))) {{
                    __CLR4_4_11dbc1dbclb90pbw7.R.inc(64019);throw new NumberIsTooLargeException(x, 1, true);
                } }else {{
                    __CLR4_4_11dbc1dbclb90pbw7.R.inc(64020);return slope * x;
                }
            }}}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
        };

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64021);UnivariateDifferentiableFunction missingBounds =
                new FiniteDifferencesDifferentiator(3, 0.1).differentiate(f);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64022);UnivariateDifferentiableFunction properlyBounded =
                new FiniteDifferencesDifferentiator(3, 0.1, 0.0, 1.0).differentiate(f);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64023);DerivativeStructure tLow  = new DerivativeStructure(1, 1, 0, 0.05);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64024);DerivativeStructure tHigh = new DerivativeStructure(1, 1, 0, 0.95);

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64025);try {
            // here, we did not set the bounds, so the differences are evaluated out of domain
            // using f(-0.05), f(0.05), f(0.15)
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64026);missingBounds.value(tLow);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64027);Assert.fail("an exception should have been thrown");
        } catch (NumberIsTooSmallException nse) {
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64028);Assert.assertEquals(-0.05, nse.getArgument().doubleValue(), 1.0e-10);
        } catch (Exception e) {
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64029);Assert.fail("wrong exception caught: " + e.getClass().getName());
        }

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64030);try {
            // here, we did not set the bounds, so the differences are evaluated out of domain
            // using f(0.85), f(0.95), f(1.05)
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64031);missingBounds.value(tHigh);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64032);Assert.fail("an exception should have been thrown");
        } catch (NumberIsTooLargeException nle) {
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64033);Assert.assertEquals(1.05, nle.getArgument().doubleValue(), 1.0e-10);
        } catch (Exception e) {
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64034);Assert.fail("wrong exception caught: " + e.getClass().getName());
        }

        // here, we did set the bounds, so evaluations are done within domain
        // using f(0.0), f(0.1), f(0.2)
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64035);Assert.assertEquals(slope, properlyBounded.value(tLow).getPartialDerivative(1), 1.0e-10);
        
        // here, we did set the bounds, so evaluations are done within domain
        // using f(0.8), f(0.9), f(1.0)
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64036);Assert.assertEquals(slope, properlyBounded.value(tHigh).getPartialDerivative(1), 1.0e-10);
        
    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testBoundedSqrt() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mn3s8e1det();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testBoundedSqrt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mn3s8e1det(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64037);

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64038);UnivariateFunctionDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(9, 1.0 / 32, 0.0, Double.POSITIVE_INFINITY);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64039);UnivariateDifferentiableFunction sqrt = differentiator.differentiate(new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64040);
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64041);return FastMath.sqrt(x);
            }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
        });

        // we are able to compute derivative near 0, but the accuracy is much poorer there
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64042);DerivativeStructure t001 = new DerivativeStructure(1, 1, 0, 0.01);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64043);Assert.assertEquals(0.5 / FastMath.sqrt(t001.getValue()), sqrt.value(t001).getPartialDerivative(1), 1.6);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64044);DerivativeStructure t01 = new DerivativeStructure(1, 1, 0, 0.1);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64045);Assert.assertEquals(0.5 / FastMath.sqrt(t01.getValue()), sqrt.value(t01).getPartialDerivative(1), 7.0e-3);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64046);DerivativeStructure t03 = new DerivativeStructure(1, 1, 0, 0.3);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64047);Assert.assertEquals(0.5 / FastMath.sqrt(t03.getValue()), sqrt.value(t03).getPartialDerivative(1), 2.1e-7);

    }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testVectorFunction() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yguy981df4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testVectorFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yguy981df4(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64048);

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64049);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(7, 0.01);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64050);UnivariateDifferentiableVectorFunction f =
                differentiator.differentiate(new UnivariateVectorFunction() {
            
            public double[] value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64051);
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64052);return new double[] { FastMath.cos(x), FastMath.sin(x) };
            }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
            
        });

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64053);for (double x = -10; (((x < 10)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64054)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64055)==0&false)); x += 0.1) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64056);DerivativeStructure dsX = new DerivativeStructure(1, 2, 0, x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64057);DerivativeStructure[] y = f.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64058);double cos = FastMath.cos(x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64059);double sin = FastMath.sin(x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64060);double[] f1 = f.value(dsX.getValue());
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64061);DerivativeStructure[] f2 = f.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64062);Assert.assertEquals(f1.length, f2.length);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64063);for (int i = 0; (((i < f1.length)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64064)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64065)==0&false)); ++i) {{
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64066);Assert.assertEquals(f1[i], f2[i].getValue(), 1.0e-15);
            }
            }__CLR4_4_11dbc1dbclb90pbw7.R.inc(64067);Assert.assertEquals( cos, y[0].getValue(), 7.0e-16);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64068);Assert.assertEquals( sin, y[1].getValue(), 7.0e-16);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64069);Assert.assertEquals(-sin, y[0].getPartialDerivative(1), 6.0e-14);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64070);Assert.assertEquals( cos, y[1].getPartialDerivative(1), 6.0e-14);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64071);Assert.assertEquals(-cos, y[0].getPartialDerivative(2), 2.0e-11);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64072);Assert.assertEquals(-sin, y[1].getPartialDerivative(2), 2.0e-11);
        }

    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testMatrixFunction() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7p0ia1dft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testMatrixFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7p0ia1dft(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64073);

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64074);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(7, 0.01);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64075);UnivariateDifferentiableMatrixFunction f =
                differentiator.differentiate(new UnivariateMatrixFunction() {
            
            public double[][] value(double x) {try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64076);
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64077);return new double[][] {
                    { FastMath.cos(x),  FastMath.sin(x)  },
                    { FastMath.cosh(x), FastMath.sinh(x) }
                };
            }finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}
            
        });

        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64078);for (double x = -1; (((x < 1)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64079)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64080)==0&false)); x += 0.02) {{
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64081);DerivativeStructure dsX = new DerivativeStructure(1, 2, 0, x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64082);DerivativeStructure[][] y = f.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64083);double cos = FastMath.cos(x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64084);double sin = FastMath.sin(x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64085);double cosh = FastMath.cosh(x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64086);double sinh = FastMath.sinh(x);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64087);double[][] f1 = f.value(dsX.getValue());
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64088);DerivativeStructure[][] f2 = f.value(dsX);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64089);Assert.assertEquals(f1.length, f2.length);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64090);for (int i = 0; (((i < f1.length)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64091)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64092)==0&false)); ++i) {{
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64093);Assert.assertEquals(f1[i].length, f2[i].length);
                __CLR4_4_11dbc1dbclb90pbw7.R.inc(64094);for (int j = 0; (((j < f1[i].length)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64095)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64096)==0&false)); ++j) {{
                    __CLR4_4_11dbc1dbclb90pbw7.R.inc(64097);Assert.assertEquals(f1[i][j], f2[i][j].getValue(), 1.0e-15);
                }
            }}
            }__CLR4_4_11dbc1dbclb90pbw7.R.inc(64098);Assert.assertEquals(cos,   y[0][0].getValue(), 7.0e-18);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64099);Assert.assertEquals(sin,   y[0][1].getValue(), 6.0e-17);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64100);Assert.assertEquals(cosh,  y[1][0].getValue(), 3.0e-16);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64101);Assert.assertEquals(sinh,  y[1][1].getValue(), 3.0e-16);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64102);Assert.assertEquals(-sin,  y[0][0].getPartialDerivative(1), 2.0e-14);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64103);Assert.assertEquals( cos,  y[0][1].getPartialDerivative(1), 2.0e-14);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64104);Assert.assertEquals( sinh, y[1][0].getPartialDerivative(1), 3.0e-14);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64105);Assert.assertEquals( cosh, y[1][1].getPartialDerivative(1), 3.0e-14);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64106);Assert.assertEquals(-cos,  y[0][0].getPartialDerivative(2), 3.0e-12);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64107);Assert.assertEquals(-sin,  y[0][1].getPartialDerivative(2), 3.0e-12);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64108);Assert.assertEquals( cosh, y[1][0].getPartialDerivative(2), 6.0e-12);
            __CLR4_4_11dbc1dbclb90pbw7.R.inc(64109);Assert.assertEquals( sinh, y[1][1].getPartialDerivative(2), 6.0e-12);
        }

    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

    @Test
    public void testSeveralFreeParameters() {__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceStart(getClass().getName(),64110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r3p1g91dgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dbc1dbclb90pbw7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dbc1dbclb90pbw7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.FiniteDifferencesDifferentiatorTest.testSeveralFreeParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r3p1g91dgu(){try{__CLR4_4_11dbc1dbclb90pbw7.R.inc(64110);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64111);FiniteDifferencesDifferentiator differentiator =
                new FiniteDifferencesDifferentiator(5, 0.001);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64112);UnivariateDifferentiableFunction sine = new Sin();
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64113);UnivariateDifferentiableFunction f =
                differentiator.differentiate(sine);
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64114);double[] expectedError = new double[] {
            6.696e-16, 1.371e-12, 2.007e-8, 1.754e-5
        };
        __CLR4_4_11dbc1dbclb90pbw7.R.inc(64115);double[] maxError = new double[expectedError.length];
       __CLR4_4_11dbc1dbclb90pbw7.R.inc(64116);for (double x = -2; (((x < 2)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64117)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64118)==0&false)); x += 0.1) {{
           __CLR4_4_11dbc1dbclb90pbw7.R.inc(64119);for (double y = -2; (((y < 2)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64120)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64121)==0&false)); y += 0.1) {{
               __CLR4_4_11dbc1dbclb90pbw7.R.inc(64122);DerivativeStructure dsX  = new DerivativeStructure(2, maxError.length - 1, 0, x);
               __CLR4_4_11dbc1dbclb90pbw7.R.inc(64123);DerivativeStructure dsY  = new DerivativeStructure(2, maxError.length - 1, 1, y);
               __CLR4_4_11dbc1dbclb90pbw7.R.inc(64124);DerivativeStructure dsT  = dsX.multiply(3).subtract(dsY.multiply(2));
               __CLR4_4_11dbc1dbclb90pbw7.R.inc(64125);DerivativeStructure sRef = sine.value(dsT);
               __CLR4_4_11dbc1dbclb90pbw7.R.inc(64126);DerivativeStructure s    = f.value(dsT);
               __CLR4_4_11dbc1dbclb90pbw7.R.inc(64127);for (int xOrder = 0; (((xOrder <= sRef.getOrder())&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64128)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64129)==0&false)); ++xOrder) {{
                   __CLR4_4_11dbc1dbclb90pbw7.R.inc(64130);for (int yOrder = 0; (((yOrder <= sRef.getOrder())&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64131)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64132)==0&false)); ++yOrder) {{
                       __CLR4_4_11dbc1dbclb90pbw7.R.inc(64133);if ((((xOrder + yOrder <= sRef.getOrder())&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64134)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64135)==0&false))) {{
                           __CLR4_4_11dbc1dbclb90pbw7.R.inc(64136);maxError[xOrder +yOrder] = FastMath.max(maxError[xOrder + yOrder],
                                                                    FastMath.abs(sRef.getPartialDerivative(xOrder, yOrder) -
                                                                                 s.getPartialDerivative(xOrder, yOrder)));
                       }
                   }}
               }}
           }}
       }}
       }__CLR4_4_11dbc1dbclb90pbw7.R.inc(64137);for (int i = 0; (((i < maxError.length)&&(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64138)!=0|true))||(__CLR4_4_11dbc1dbclb90pbw7.R.iget(64139)==0&false)); ++i) {{
           __CLR4_4_11dbc1dbclb90pbw7.R.inc(64140);Assert.assertEquals(expectedError[i], maxError[i], 0.01 * expectedError[i]);
       }
    }}finally{__CLR4_4_11dbc1dbclb90pbw7.R.flushNeeded();}}

}
