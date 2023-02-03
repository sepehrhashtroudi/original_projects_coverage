/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.commons.math3.distribution.fitting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution;
import org.apache.commons.math3.distribution.MultivariateNormalDistribution;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.util.Pair;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test that demonstrates the use of
 * {@link MultivariateNormalMixtureExpectationMaximization}.
 */
public class MultivariateNormalMixtureExpectationMaximizationTest {static class __CLR4_4_11ko81ko8lb90pcg8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = NotStrictlyPositiveException.class)
    public void testNonEmptyData() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1as73r71ko8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,69,109,112,116,121,68,97,116,97,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testNonEmptyData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1as73r71ko8(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73448);
        // Should not accept empty data
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73449);new MultivariateNormalMixtureExpectationMaximization(new double[][] {});
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testNonJaggedData() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jdw2si1koa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,74,97,103,103,101,100,68,97,116,97,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testNonJaggedData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jdw2si1koa(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73450);
        // Reject data with nonconstant numbers of columns
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73451);double[][] data = new double[][] {
                { 1, 2, 3 },
                { 4, 5, 6, 7 },
        };
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73452);new MultivariateNormalMixtureExpectationMaximization(data);
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test(expected = NumberIsTooSmallException.class)
    public void testMultipleColumnsRequired() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fvzwh1kod();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,117,108,116,105,112,108,101,67,111,108,117,109,110,115,82,101,113,117,105,114,101,100,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testMultipleColumnsRequired",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fvzwh1kod(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73453);
        // Data should have at least 2 columns
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73454);double[][] data = new double[][] {
                { 1 }, { 2 }
        };
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73455);new MultivariateNormalMixtureExpectationMaximization(data);
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test(expected = NotStrictlyPositiveException.class)
    public void testMaxIterationsPositive() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kr2du01kog();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,116,101,114,97,116,105,111,110,115,80,111,115,105,116,105,118,101,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testMaxIterationsPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kr2du01kog(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73456);
        // Maximum iterations for fit must be positive integer
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73457);double[][] data = getTestSamples();
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73458);MultivariateNormalMixtureExpectationMaximization fitter =
                new MultivariateNormalMixtureExpectationMaximization(data);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73459);MixtureMultivariateNormalDistribution
            initialMix = MultivariateNormalMixtureExpectationMaximization.estimate(data, 2);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73460);fitter.fit(initialMix, 0, 1E-5);
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test(expected = NotStrictlyPositiveException.class)
    public void testThresholdPositive() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bbnenb1kol();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,101,115,104,111,108,100,80,111,115,105,116,105,118,101,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testThresholdPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bbnenb1kol(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73461);
        // Maximum iterations for fit must be positive
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73462);double[][] data = getTestSamples();
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73463);MultivariateNormalMixtureExpectationMaximization fitter =
                new MultivariateNormalMixtureExpectationMaximization(
                    data);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73464);MixtureMultivariateNormalDistribution
            initialMix = MultivariateNormalMixtureExpectationMaximization.estimate(data, 2);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73465);fitter.fit(initialMix, 1000, 0);
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test(expected = ConvergenceException.class)
    public void testConvergenceException() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w234891koq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testConvergenceException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w234891koq(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73466);
        // ConvergenceException thrown if fit terminates before threshold met
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73467);double[][] data = getTestSamples();
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73468);MultivariateNormalMixtureExpectationMaximization fitter
            = new MultivariateNormalMixtureExpectationMaximization(data);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73469);MixtureMultivariateNormalDistribution
            initialMix = MultivariateNormalMixtureExpectationMaximization.estimate(data, 2);

        // 5 iterations not enough to meet convergence threshold
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73470);fitter.fit(initialMix, 5, 1E-5);
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testIncompatibleIntialMixture() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7d86f1kov();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,109,112,97,116,105,98,108,101,73,110,116,105,97,108,77,105,120,116,117,114,101,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testIncompatibleIntialMixture",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7d86f1kov(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73471);
        // Data has 3 columns
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73472);double[][] data = new double[][] {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        };
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73473);double[] weights = new double[] { 0.5, 0.5 };

        // These distributions are compatible with 2-column data, not 3-column
        // data
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73474);MultivariateNormalDistribution[] mvns = new MultivariateNormalDistribution[2];

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73475);mvns[0] = new MultivariateNormalDistribution(new double[] {
                        -0.0021722935000328823, 3.5432892936887908 },
                        new double[][] {
                                { 4.537422569229048, 3.5266152281729304 },
                                { 3.5266152281729304, 6.175448814169779 } });
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73476);mvns[1] = new MultivariateNormalDistribution(new double[] {
                        5.090902706507635, 8.68540656355283 }, new double[][] {
                        { 2.886778573963039, 1.5257474543463154 },
                        { 1.5257474543463154, 3.3794567673616918 } });

        // Create components and mixture
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73477);List<Pair<Double, MultivariateNormalDistribution>> components =
                new ArrayList<Pair<Double, MultivariateNormalDistribution>>();
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73478);components.add(new Pair<Double, MultivariateNormalDistribution>(
                weights[0], mvns[0]));
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73479);components.add(new Pair<Double, MultivariateNormalDistribution>(
                weights[1], mvns[1]));

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73480);MixtureMultivariateNormalDistribution badInitialMix
            = new MixtureMultivariateNormalDistribution(components);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73481);MultivariateNormalMixtureExpectationMaximization fitter
            = new MultivariateNormalMixtureExpectationMaximization(data);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73482);fitter.fit(badInitialMix);
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test
    public void testInitialMixture() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_180zbtx1kp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testInitialMixture",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_180zbtx1kp7(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73483);
        // Testing initial mixture estimated from data
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73484);final double[] correctWeights = new double[] { 0.5, 0.5 };

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73485);final double[][] correctMeans = new double[][] {
            {-0.0021722935000328823, 3.5432892936887908},
            {5.090902706507635, 8.68540656355283},
        };

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73486);final RealMatrix[] correctCovMats = new Array2DRowRealMatrix[2];

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73487);correctCovMats[0] = new Array2DRowRealMatrix(new double[][] {
                { 4.537422569229048, 3.5266152281729304 },
                { 3.5266152281729304, 6.175448814169779 } });

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73488);correctCovMats[1] = new Array2DRowRealMatrix( new double[][] {
                { 2.886778573963039, 1.5257474543463154 },
                { 1.5257474543463154, 3.3794567673616918 } });

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73489);final MultivariateNormalDistribution[] correctMVNs = new
                MultivariateNormalDistribution[2];

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73490);correctMVNs[0] = new MultivariateNormalDistribution(correctMeans[0],
                correctCovMats[0].getData());

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73491);correctMVNs[1] = new MultivariateNormalDistribution(correctMeans[1],
                correctCovMats[1].getData());

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73492);final MixtureMultivariateNormalDistribution initialMix
            = MultivariateNormalMixtureExpectationMaximization.estimate(getTestSamples(), 2);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73493);int i = 0;
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73494);for (Pair<Double, MultivariateNormalDistribution> component : initialMix
                .getComponents()) {{
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73495);Assert.assertEquals(correctWeights[i], component.getFirst(),
                    Math.ulp(1d));
            
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73496);final double[] means = component.getValue().getMeans();
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73497);Assert.assertTrue(Arrays.equals(correctMeans[i], means));
            
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73498);final RealMatrix covMat = component.getValue().getCovariances();
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73499);Assert.assertEquals(correctCovMats[i], covMat);
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73500);i++;
        }
    }}finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    @Test
    public void testFit() {__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceStart(getClass().getName(),73501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18nll6u1kpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ko81ko8lb90pcg8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ko81ko8lb90pcg8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest.testFit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18nll6u1kpp(){try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73501);
        // Test that the loglikelihood, weights, and models are determined and
        // fitted correctly
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73502);final double[][] data = getTestSamples();
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73503);final double correctLogLikelihood = -4.292431006791994;
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73504);final double[] correctWeights = new double[] { 0.2962324189652912, 0.7037675810347089 };
        
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73505);final double[][] correctMeans = new double[][]{
            {-1.4213112715121132, 1.6924690505757753},
            {4.213612224374709, 7.975621325853645}
        };
        
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73506);final RealMatrix[] correctCovMats = new Array2DRowRealMatrix[2];
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73507);correctCovMats[0] = new Array2DRowRealMatrix(new double[][] {
            { 1.739356907285747, -0.5867644251487614 },
            { -0.5867644251487614, 1.0232932029324642 } }
                );
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73508);correctCovMats[1] = new Array2DRowRealMatrix(new double[][] {
            { 4.245384898007161, 2.5797798966382155 },
            { 2.5797798966382155, 3.9200272522448367 } });
        
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73509);final MultivariateNormalDistribution[] correctMVNs = new MultivariateNormalDistribution[2];
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73510);correctMVNs[0] = new MultivariateNormalDistribution(correctMeans[0], correctCovMats[0].getData());
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73511);correctMVNs[1] = new MultivariateNormalDistribution(correctMeans[1], correctCovMats[1].getData());

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73512);MultivariateNormalMixtureExpectationMaximization fitter
            = new MultivariateNormalMixtureExpectationMaximization(data);

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73513);MixtureMultivariateNormalDistribution initialMix
            = MultivariateNormalMixtureExpectationMaximization.estimate(data, 2);
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73514);fitter.fit(initialMix);
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73515);MixtureMultivariateNormalDistribution fittedMix = fitter.getFittedModel();
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73516);List<Pair<Double, MultivariateNormalDistribution>> components = fittedMix.getComponents();

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73517);Assert.assertEquals(correctLogLikelihood,
                            fitter.getLogLikelihood(),
                            Math.ulp(1d));

        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73518);int i = 0;
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73519);for (Pair<Double, MultivariateNormalDistribution> component : components) {{
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73520);final double weight = component.getFirst();
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73521);final MultivariateNormalDistribution mvn = component.getSecond();
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73522);final double[] mean = mvn.getMeans();
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73523);final RealMatrix covMat = mvn.getCovariances();
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73524);Assert.assertEquals(correctWeights[i], weight, Math.ulp(1d));
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73525);Assert.assertTrue(Arrays.equals(correctMeans[i], mean));
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73526);Assert.assertEquals(correctCovMats[i], covMat);
            __CLR4_4_11ko81ko8lb90pcg8.R.inc(73527);i++;
        }
    }}finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}

    private double[][] getTestSamples() {try{__CLR4_4_11ko81ko8lb90pcg8.R.inc(73528);
        // generated using R Mixtools rmvnorm with mean vectors [-1.5, 2] and
        // [4, 8.2]
        __CLR4_4_11ko81ko8lb90pcg8.R.inc(73529);return new double[][] { { 7.358553610469948, 11.31260831446758 },
                { 7.175770420124739, 8.988812210204454 },
                { 4.324151905768422, 6.837727899051482 },
                { 2.157832219173036, 6.317444585521968 },
                { -1.890157421896651, 1.74271202875498 },
                { 0.8922409354455803, 1.999119343923781 },
                { 3.396949764787055, 6.813170372579068 },
                { -2.057498232686068, -0.002522983830852255 },
                { 6.359932157365045, 8.343600029975851 },
                { 3.353102234276168, 7.087541882898689 },
                { -1.763877221595639, 0.9688890460330644 },
                { 6.151457185125111, 9.075011757431174 },
                { 4.281597398048899, 5.953270070976117 },
                { 3.549576703974894, 8.616038155992861 },
                { 6.004706732349854, 8.959423391087469 },
                { 2.802915014676262, 6.285676742173564 },
                { -0.6029879029880616, 1.083332958357485 },
                { 3.631827105398369, 6.743428504049444 },
                { 6.161125014007315, 9.60920569689001 },
                { -1.049582894255342, 0.2020017892080281 },
                { 3.910573022688315, 8.19609909534937 },
                { 8.180454017634863, 7.861055769719962 },
                { 1.488945440439716, 8.02699903761247 },
                { 4.813750847823778, 12.34416881332515 },
                { 0.0443208501259158, 5.901148093240691 },
                { 4.416417235068346, 4.465243084006094 },
                { 4.0002433603072, 6.721937850166174 },
                { 3.190113818788205, 10.51648348411058 },
                { 4.493600914967883, 7.938224231022314 },
                { -3.675669533266189, 4.472845076673303 },
                { 6.648645511703989, 12.03544085965724 },
                { -1.330031331404445, 1.33931042964811 },
                { -3.812111460708707, 2.50534195568356 },
                { 5.669339356648331, 6.214488981177026 },
                { 1.006596727153816, 1.51165463112716 },
                { 5.039466365033024, 7.476532610478689 },
                { 4.349091929968925, 7.446356406259756 },
                { -1.220289665119069, 3.403926955951437 },
                { 5.553003979122395, 6.886518211202239 },
                { 2.274487732222856, 7.009541508533196 },
                { 4.147567059965864, 7.34025244349202 },
                { 4.083882618965819, 6.362852861075623 },
                { 2.203122344647599, 7.260295257904624 },
                { -2.147497550770442, 1.262293431529498 },
                { 2.473700950426512, 6.558900135505638 },
                { 8.267081298847554, 12.10214104577748 },
                { 6.91977329776865, 9.91998488301285 },
                { 0.1680479852730894, 6.28286034168897 },
                { -1.268578659195158, 2.326711221485755 },
                { 1.829966451374701, 6.254187605304518 },
                { 5.648849025754848, 9.330002040750291 },
                { -2.302874793257666, 3.585545172776065 },
                { -2.629218791709046, 2.156215538500288 },
                { 4.036618140700114, 10.2962785719958 },
                { 0.4616386422783874, 0.6782756325806778 },
                { -0.3447896073408363, 0.4999834691645118 },
                { -0.475281453118318, 1.931470384180492 },
                { 2.382509690609731, 6.071782429815853 },
                { -3.203934441889096, 2.572079552602468 },
                { 8.465636032165087, 13.96462998683518 },
                { 2.36755660870416, 5.7844595007273 },
                { 0.5935496528993371, 1.374615871358943 },
                { -2.467481505748694, 2.097224634713005 },
                { 4.27867444328542, 10.24772361238549 },
                { -2.013791907543137, 2.013799426047639 },
                { 6.424588084404173, 9.185334939684516 },
                { -0.8448238876802175, 0.5447382022282812 },
                { 1.342955703473923, 8.645456317633556 },
                { 3.108712208751979, 8.512156853800064 },
                { 4.343205178315472, 8.056869549234374 },
                { -2.971767642212396, 3.201180146824761 },
                { 2.583820931523672, 5.459873414473854 },
                { 4.209139115268925, 8.171098193546225 },
                { 0.4064909057902746, 1.454390775518743 },
                { 3.068642411145223, 6.959485153620035 },
                { 6.085968972900461, 7.391429799500965 },
                { -1.342265795764202, 1.454550012997143 },
                { 6.249773274516883, 6.290269880772023 },
                { 4.986225847822566, 7.75266344868907 },
                { 7.642443254378944, 10.19914817500263 },
                { 6.438181159163673, 8.464396764810347 },
                { 2.520859761025108, 7.68222425260111 },
                { 2.883699944257541, 6.777960331348503 },
                { 2.788004550956599, 6.634735386652733 },
                { 3.331661231995638, 5.794191300046592 },
                { 3.526172276645504, 6.710802266815884 },
                { 3.188298528138741, 10.34495528210205 },
                { 0.7345539486114623, 5.807604004180681 },
                { 1.165044595880125, 7.830121829295257 },
                { 7.146962523500671, 11.62995162065415 },
                { 7.813872137162087, 10.62827008714735 },
                { 3.118099164870063, 8.286003148186371 },
                { -1.708739286262571, 1.561026755374264 },
                { 1.786163047580084, 4.172394388214604 },
                { 3.718506403232386, 7.807752990130349 },
                { 6.167414046828899, 10.01104941031293 },
                { -1.063477247689196, 1.61176085846339 },
                { -3.396739609433642, 0.7127911050002151 },
                { 2.438885945896797, 7.353011138689225 },
                { -0.2073204144780931, 0.850771146627012 }, };
    }finally{__CLR4_4_11ko81ko8lb90pcg8.R.flushNeeded();}}
}
