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

package org.apache.commons.math3.fitting.leastsquares;

import java.io.IOException;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.junit.Test;
import org.junit.Assert;

/**
 * <p>Some of the unit tests are re-implementations of the MINPACK <a
 * href="http://www.netlib.org/minpack/ex/file17">file17</a> and <a
 * href="http://www.netlib.org/minpack/ex/file22">file22</a> test files.
 * The redistribution policy for MINPACK is available <a
 * href="http://www.netlib.org/minpack/disclaimer">here</a>/
 *
 * @version $Id$
 */
public class GaussNewtonOptimizerTest
    extends AbstractLeastSquaresOptimizerAbstractTest<GaussNewtonOptimizer> {static class __CLR4_4_11ls91ls9lb90pcjr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Override
    public GaussNewtonOptimizer createOptimizer() {try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74889);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74890);return GaussNewtonOptimizer.create()
            .withConvergenceChecker(new SimpleVectorValueChecker(1e-6, 1e-6));
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Override
    public int getMaxIterations() {try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74891);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74892);return 1000;
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Override
    @Test
    public void testShallowCopy() {__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceStart(getClass().getName(),74893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13s4a1u1lsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ls91ls9lb90pcjr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizerTest.testShallowCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13s4a1u1lsd(){try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74893);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74894);super.testShallowCopy(); // Test copy of parent.

        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74895);final boolean useLU1 = false;
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74896);final GaussNewtonOptimizer optim1 = createOptimizer()
            .withLU(useLU1);

        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74897);final GaussNewtonOptimizer optim2 = optim1.shallowCopy();

        // Check that all fields have the same values.
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74898);Assert.assertTrue(optim1.getLU() == optim2.getLU());

        // Change "optim2".
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74899);final boolean useLU2 = true;
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74900);optim2.withLU(useLU2);

        // Check that all fields now have different values.
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74901);Assert.assertFalse(optim1.getLU() == optim2.getLU());
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Override
    @Test(expected=ConvergenceException.class)
    public void testMoreEstimatedParametersSimple() {__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceStart(getClass().getName(),74902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ow9s81lsm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,111,114,101,69,115,116,105,109,97,116,101,100,80,97,114,97,109,101,116,101,114,115,83,105,109,112,108,101,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ls91ls9lb90pcjr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ow9s81lsm(){try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74902);
        /*
         * Exception is expected with this optimizer
         */
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74903);super.testMoreEstimatedParametersSimple();
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Override
    @Test(expected=ConvergenceException.class)
    public void testMoreEstimatedParametersUnsorted() {__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceStart(getClass().getName(),74904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopi41lso();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,111,114,101,69,115,116,105,109,97,116,101,100,80,97,114,97,109,101,116,101,114,115,85,110,115,111,114,116,101,100,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ls91ls9lb90pcjr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopi41lso(){try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74904);
        /*
         * Exception is expected with this optimizer
         */
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74905);super.testMoreEstimatedParametersUnsorted();
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Test(expected=TooManyEvaluationsException.class)
    public void testMaxEvaluations() throws Exception {__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceStart(getClass().getName(),74906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r7mzqs1lsq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,69,118,97,108,117,97,116,105,111,110,115,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ls91ls9lb90pcjr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizerTest.testMaxEvaluations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r7mzqs1lsq() throws Exception{try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74906);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74907);CircleVectorial circle = new CircleVectorial();
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74908);circle.addPoint( 30.0,  68.0);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74909);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74910);circle.addPoint(110.0, -20.0);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74911);circle.addPoint( 35.0,  15.0);
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74912);circle.addPoint( 45.0,  97.0);

        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74913);GaussNewtonOptimizer optimizer = createOptimizer()
            .withConvergenceChecker(new SimpleVectorValueChecker(1e-30, 1e-30))
            .withMaxIterations(Integer.MAX_VALUE)
            .withMaxEvaluations(100)
            .withModelAndJacobian(circle.getModelFunction(),
                                  circle.getModelFunctionJacobian())
            .withTarget(new double[] { 0, 0, 0, 0, 0 })
            .withWeight(new DiagonalMatrix(new double[] { 1, 1, 1, 1, 1 }))
            .withStartPoint(new double[] { 98.680, 47.345 });

        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74914);optimizer.optimize();
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Override
    @Test(expected=ConvergenceException.class)
    public void testCircleFittingBadInit() {__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceStart(getClass().getName(),74915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlbl5t1lsz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,105,114,99,108,101,70,105,116,116,105,110,103,66,97,100,73,110,105,116,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ls91ls9lb90pcjr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizerTest.testCircleFittingBadInit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlbl5t1lsz(){try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74915);
        /*
         * This test does not converge with this optimizer.
         */
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74916);super.testCircleFittingBadInit();
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}

    @Override
    @Test(expected=ConvergenceException.class)
    public void testHahn1()
        throws IOException {__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceStart(getClass().getName(),74917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ynumnb1lt1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,72,97,104,110,49,58,32,91,67,111,110,118,101,114,103,101,110,99,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ConvergenceException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ls91ls9lb90pcjr.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ls91ls9lb90pcjr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.GaussNewtonOptimizerTest.testHahn1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ynumnb1lt1() throws IOException{try{__CLR4_4_11ls91ls9lb90pcjr.R.inc(74917);
        /*
         * TODO This test leads to a singular problem with the Gauss-Newton
         * optimizer. This should be inquired.
         */
        __CLR4_4_11ls91ls9lb90pcjr.R.inc(74918);super.testHahn1();
    }finally{__CLR4_4_11ls91ls9lb90pcjr.R.flushNeeded();}}
}
