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

package org.apache.commons.math3.optimization.direct;


import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.LeastSquaresConverter;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SimplexOptimizerNelderMeadTest {static class __CLR4_4_124zf24zflb90pe08{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testMinimize1() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mcvso24zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testMinimize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mcvso24zf(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99771);
        __CLR4_4_124zf24zflb90pe08.R.inc(99772);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124zf24zflb90pe08.R.inc(99773);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124zf24zflb90pe08.R.inc(99774);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124zf24zflb90pe08.R.inc(99775);final PointValuePair optimum
            = optimizer.optimize(100, fourExtrema, GoalType.MINIMIZE, new double[] { -3, 0 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99776);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 2e-7);
        __CLR4_4_124zf24zflb90pe08.R.inc(99777);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 2e-5);
        __CLR4_4_124zf24zflb90pe08.R.inc(99778);Assert.assertEquals(fourExtrema.valueXmYp, optimum.getValue(), 6e-12);
        __CLR4_4_124zf24zflb90pe08.R.inc(99779);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99780);Assert.assertTrue(optimizer.getEvaluations() < 90);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testMinimize2() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dcx0724zp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testMinimize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dcx0724zp(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99781);
        __CLR4_4_124zf24zflb90pe08.R.inc(99782);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124zf24zflb90pe08.R.inc(99783);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124zf24zflb90pe08.R.inc(99784);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124zf24zflb90pe08.R.inc(99785);final PointValuePair optimum
            = optimizer.optimize(100, fourExtrema, GoalType.MINIMIZE, new double[] { 1, 0 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99786);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 5e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99787);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 6e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99788);Assert.assertEquals(fourExtrema.valueXpYm, optimum.getValue(), 1e-11);
        __CLR4_4_124zf24zflb90pe08.R.inc(99789);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99790);Assert.assertTrue(optimizer.getEvaluations() < 90);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testMaximize1() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ex7q24zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testMaximize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ex7q24zz(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99791);
        __CLR4_4_124zf24zflb90pe08.R.inc(99792);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124zf24zflb90pe08.R.inc(99793);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124zf24zflb90pe08.R.inc(99794);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124zf24zflb90pe08.R.inc(99795);final PointValuePair optimum
            = optimizer.optimize(100, fourExtrema, GoalType.MAXIMIZE, new double[] { -3, 0 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99796);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 1e-5);
        __CLR4_4_124zf24zflb90pe08.R.inc(99797);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 3e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99798);Assert.assertEquals(fourExtrema.valueXmYm, optimum.getValue(), 3e-12);
        __CLR4_4_124zf24zflb90pe08.R.inc(99799);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99800);Assert.assertTrue(optimizer.getEvaluations() < 90);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testMaximize2() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0eyf92509();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testMaximize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99801,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0eyf92509(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99801);
        __CLR4_4_124zf24zflb90pe08.R.inc(99802);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124zf24zflb90pe08.R.inc(99803);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124zf24zflb90pe08.R.inc(99804);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124zf24zflb90pe08.R.inc(99805);final PointValuePair optimum
            = optimizer.optimize(100, fourExtrema, GoalType.MAXIMIZE, new double[] { 1, 0 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99806);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 4e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99807);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 5e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99808);Assert.assertEquals(fourExtrema.valueXpYp, optimum.getValue(), 7e-12);
        __CLR4_4_124zf24zflb90pe08.R.inc(99809);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99810);Assert.assertTrue(optimizer.getEvaluations() < 90);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testRosenbrock() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glvc69250j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testRosenbrock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glvc69250j(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99811);

        __CLR4_4_124zf24zflb90pe08.R.inc(99812);Rosenbrock rosenbrock = new Rosenbrock();
        __CLR4_4_124zf24zflb90pe08.R.inc(99813);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_124zf24zflb90pe08.R.inc(99814);optimizer.setSimplex(new NelderMeadSimplex(new double[][] {
                    { -1.2,  1 }, { 0.9, 1.2 } , {  3.5, -2.3 }
                }));
        __CLR4_4_124zf24zflb90pe08.R.inc(99815);PointValuePair optimum =
            optimizer.optimize(100, rosenbrock, GoalType.MINIMIZE, new double[] { -1.2, 1 });

        __CLR4_4_124zf24zflb90pe08.R.inc(99816);Assert.assertEquals(rosenbrock.getCount(), optimizer.getEvaluations());
        __CLR4_4_124zf24zflb90pe08.R.inc(99817);Assert.assertTrue(optimizer.getEvaluations() > 40);
        __CLR4_4_124zf24zflb90pe08.R.inc(99818);Assert.assertTrue(optimizer.getEvaluations() < 50);
        __CLR4_4_124zf24zflb90pe08.R.inc(99819);Assert.assertTrue(optimum.getValue() < 8e-4);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testPowell() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh0dly250s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testPowell",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh0dly250s(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99820);

        __CLR4_4_124zf24zflb90pe08.R.inc(99821);Powell powell = new Powell();
        __CLR4_4_124zf24zflb90pe08.R.inc(99822);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_124zf24zflb90pe08.R.inc(99823);optimizer.setSimplex(new NelderMeadSimplex(4));
        __CLR4_4_124zf24zflb90pe08.R.inc(99824);PointValuePair optimum =
            optimizer.optimize(200, powell, GoalType.MINIMIZE, new double[] { 3, -1, 0, 1 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99825);Assert.assertEquals(powell.getCount(), optimizer.getEvaluations());
        __CLR4_4_124zf24zflb90pe08.R.inc(99826);Assert.assertTrue(optimizer.getEvaluations() > 110);
        __CLR4_4_124zf24zflb90pe08.R.inc(99827);Assert.assertTrue(optimizer.getEvaluations() < 130);
        __CLR4_4_124zf24zflb90pe08.R.inc(99828);Assert.assertTrue(optimum.getValue() < 2e-3);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testLeastSquares1() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11g03532511();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testLeastSquares1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11g03532511(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99829);

        __CLR4_4_124zf24zflb90pe08.R.inc(99830);final RealMatrix factors =
            new Array2DRowRealMatrix(new double[][] {
                    { 1, 0 },
                    { 0, 1 }
                }, false);
        __CLR4_4_124zf24zflb90pe08.R.inc(99831);LeastSquaresConverter ls = new LeastSquaresConverter(new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_124zf24zflb90pe08.R.inc(99832);
                    __CLR4_4_124zf24zflb90pe08.R.inc(99833);return factors.operate(variables);
                }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}
            }, new double[] { 2.0, -3.0 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99834);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99835);optimizer.setSimplex(new NelderMeadSimplex(2));
        __CLR4_4_124zf24zflb90pe08.R.inc(99836);PointValuePair optimum =
            optimizer.optimize(200, ls, GoalType.MINIMIZE, new double[] { 10, 10 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99837);Assert.assertEquals( 2, optimum.getPointRef()[0], 3e-5);
        __CLR4_4_124zf24zflb90pe08.R.inc(99838);Assert.assertEquals(-3, optimum.getPointRef()[1], 4e-4);
        __CLR4_4_124zf24zflb90pe08.R.inc(99839);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99840);Assert.assertTrue(optimizer.getEvaluations() < 80);
        __CLR4_4_124zf24zflb90pe08.R.inc(99841);Assert.assertTrue(optimum.getValue() < 1.0e-6);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testLeastSquares2() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11szvne251e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testLeastSquares2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11szvne251e(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99842);

        __CLR4_4_124zf24zflb90pe08.R.inc(99843);final RealMatrix factors =
            new Array2DRowRealMatrix(new double[][] {
                    { 1, 0 },
                    { 0, 1 }
                }, false);
        __CLR4_4_124zf24zflb90pe08.R.inc(99844);LeastSquaresConverter ls = new LeastSquaresConverter(new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_124zf24zflb90pe08.R.inc(99845);
                    __CLR4_4_124zf24zflb90pe08.R.inc(99846);return factors.operate(variables);
                }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}
            }, new double[] { 2, -3 }, new double[] { 10, 0.1 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99847);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99848);optimizer.setSimplex(new NelderMeadSimplex(2));
        __CLR4_4_124zf24zflb90pe08.R.inc(99849);PointValuePair optimum =
            optimizer.optimize(200, ls, GoalType.MINIMIZE, new double[] { 10, 10 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99850);Assert.assertEquals( 2, optimum.getPointRef()[0], 5e-5);
        __CLR4_4_124zf24zflb90pe08.R.inc(99851);Assert.assertEquals(-3, optimum.getPointRef()[1], 8e-4);
        __CLR4_4_124zf24zflb90pe08.R.inc(99852);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99853);Assert.assertTrue(optimizer.getEvaluations() < 80);
        __CLR4_4_124zf24zflb90pe08.R.inc(99854);Assert.assertTrue(optimum.getValue() < 1e-6);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test
    public void testLeastSquares3() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_151zufv251r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testLeastSquares3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_151zufv251r(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99855);

        __CLR4_4_124zf24zflb90pe08.R.inc(99856);final RealMatrix factors =
            new Array2DRowRealMatrix(new double[][] {
                    { 1, 0 },
                    { 0, 1 }
                }, false);
        __CLR4_4_124zf24zflb90pe08.R.inc(99857);LeastSquaresConverter ls = new LeastSquaresConverter(new MultivariateVectorFunction() {
                public double[] value(double[] variables) {try{__CLR4_4_124zf24zflb90pe08.R.inc(99858);
                    __CLR4_4_124zf24zflb90pe08.R.inc(99859);return factors.operate(variables);
                }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}
            }, new double[] { 2, -3 }, new Array2DRowRealMatrix(new double [][] {
                    { 1, 1.2 }, { 1.2, 2 }
                }));
        __CLR4_4_124zf24zflb90pe08.R.inc(99860);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-6);
        __CLR4_4_124zf24zflb90pe08.R.inc(99861);optimizer.setSimplex(new NelderMeadSimplex(2));
        __CLR4_4_124zf24zflb90pe08.R.inc(99862);PointValuePair optimum =
            optimizer.optimize(200, ls, GoalType.MINIMIZE, new double[] { 10, 10 });
        __CLR4_4_124zf24zflb90pe08.R.inc(99863);Assert.assertEquals( 2, optimum.getPointRef()[0], 2e-3);
        __CLR4_4_124zf24zflb90pe08.R.inc(99864);Assert.assertEquals(-3, optimum.getPointRef()[1], 8e-4);
        __CLR4_4_124zf24zflb90pe08.R.inc(99865);Assert.assertTrue(optimizer.getEvaluations() > 60);
        __CLR4_4_124zf24zflb90pe08.R.inc(99866);Assert.assertTrue(optimizer.getEvaluations() < 80);
        __CLR4_4_124zf24zflb90pe08.R.inc(99867);Assert.assertTrue(optimum.getValue() < 1e-6);
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxIterations() {__CLR4_4_124zf24zflb90pe08.R.globalSliceStart(getClass().getName(),99868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7jz4f2524();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,116,101,114,97,116,105,111,110,115,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124zf24zflb90pe08.R.rethrow($CLV_t2$);}finally{__CLR4_4_124zf24zflb90pe08.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerNelderMeadTest.testMaxIterations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7jz4f2524(){try{__CLR4_4_124zf24zflb90pe08.R.inc(99868);
        __CLR4_4_124zf24zflb90pe08.R.inc(99869);Powell powell = new Powell();
        __CLR4_4_124zf24zflb90pe08.R.inc(99870);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_124zf24zflb90pe08.R.inc(99871);optimizer.setSimplex(new NelderMeadSimplex(4));
        __CLR4_4_124zf24zflb90pe08.R.inc(99872);optimizer.optimize(20, powell, GoalType.MINIMIZE, new double[] { 3, -1, 0, 1 });
    }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

    private static class FourExtrema implements MultivariateFunction {
        // The following function has 4 local extrema.
        final double xM = -3.841947088256863675365;
        final double yM = -1.391745200270734924416;
        final double xP =  0.2286682237349059125691;
        final double yP = -yM;
        final double valueXmYm = 0.2373295333134216789769; // Local maximum.
        final double valueXmYp = -valueXmYm; // Local minimum.
        final double valueXpYm = -0.7290400707055187115322; // Global minimum.
        final double valueXpYp = -valueXpYm; // Global maximum.

        public double value(double[] variables) {try{__CLR4_4_124zf24zflb90pe08.R.inc(99873);
            __CLR4_4_124zf24zflb90pe08.R.inc(99874);final double x = variables[0];
            __CLR4_4_124zf24zflb90pe08.R.inc(99875);final double y = variables[1];
            __CLR4_4_124zf24zflb90pe08.R.inc(99876);return ((((x == 0 || y == 0) )&&(__CLR4_4_124zf24zflb90pe08.R.iget(99877)!=0|true))||(__CLR4_4_124zf24zflb90pe08.R.iget(99878)==0&false))? 0 :
                FastMath.atan(x) * FastMath.atan(x + 2) * FastMath.atan(y) * FastMath.atan(y) / (x * y);
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}
    }

    private static class Rosenbrock implements MultivariateFunction {
        private int count;

        public Rosenbrock() {try{__CLR4_4_124zf24zflb90pe08.R.inc(99879);
            __CLR4_4_124zf24zflb90pe08.R.inc(99880);count = 0;
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124zf24zflb90pe08.R.inc(99881);
            __CLR4_4_124zf24zflb90pe08.R.inc(99882);++count;
            __CLR4_4_124zf24zflb90pe08.R.inc(99883);double a = x[1] - x[0] * x[0];
            __CLR4_4_124zf24zflb90pe08.R.inc(99884);double b = 1.0 - x[0];
            __CLR4_4_124zf24zflb90pe08.R.inc(99885);return 100 * a * a + b * b;
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

        public int getCount() {try{__CLR4_4_124zf24zflb90pe08.R.inc(99886);
            __CLR4_4_124zf24zflb90pe08.R.inc(99887);return count;
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}
    }

    private static class Powell implements MultivariateFunction {
        private int count;

        public Powell() {try{__CLR4_4_124zf24zflb90pe08.R.inc(99888);
            __CLR4_4_124zf24zflb90pe08.R.inc(99889);count = 0;
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

        public double value(double[] x) {try{__CLR4_4_124zf24zflb90pe08.R.inc(99890);
            __CLR4_4_124zf24zflb90pe08.R.inc(99891);++count;
            __CLR4_4_124zf24zflb90pe08.R.inc(99892);double a = x[0] + 10 * x[1];
            __CLR4_4_124zf24zflb90pe08.R.inc(99893);double b = x[2] - x[3];
            __CLR4_4_124zf24zflb90pe08.R.inc(99894);double c = x[1] - 2 * x[2];
            __CLR4_4_124zf24zflb90pe08.R.inc(99895);double d = x[0] - x[3];
            __CLR4_4_124zf24zflb90pe08.R.inc(99896);return a * a + 5 * b * b + c * c * c * c + 10 * d * d * d * d;
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}

        public int getCount() {try{__CLR4_4_124zf24zflb90pe08.R.inc(99897);
            __CLR4_4_124zf24zflb90pe08.R.inc(99898);return count;
        }finally{__CLR4_4_124zf24zflb90pe08.R.flushNeeded();}}
    }
}
