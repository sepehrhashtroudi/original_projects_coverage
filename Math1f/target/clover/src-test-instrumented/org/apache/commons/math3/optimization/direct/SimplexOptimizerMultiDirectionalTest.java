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

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SimplexOptimizerMultiDirectionalTest {static class __CLR4_4_124wl24wllb90pdzz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99771,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testMinimize1() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19mcvso24wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testMinimize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19mcvso24wl(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99669);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99670);SimplexOptimizer optimizer = new SimplexOptimizer(1e-11, 1e-30);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99671);optimizer.setSimplex(new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99672);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124wl24wllb90pdzz.R.inc(99673);final PointValuePair optimum
            = optimizer.optimize(200, fourExtrema, GoalType.MINIMIZE, new double[] { -3, 0 });
        __CLR4_4_124wl24wllb90pdzz.R.inc(99674);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 4e-6);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99675);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 3e-6);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99676);Assert.assertEquals(fourExtrema.valueXmYp, optimum.getValue(), 8e-13);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99677);Assert.assertTrue(optimizer.getEvaluations() > 120);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99678);Assert.assertTrue(optimizer.getEvaluations() < 150);
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

    @Test
    public void testMinimize2() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dcx0724wv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testMinimize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dcx0724wv(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99679);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99680);SimplexOptimizer optimizer = new SimplexOptimizer(1e-11, 1e-30);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99681);optimizer.setSimplex(new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99682);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124wl24wllb90pdzz.R.inc(99683);final PointValuePair optimum
            =  optimizer.optimize(200, fourExtrema, GoalType.MINIMIZE, new double[] { 1, 0 });
        __CLR4_4_124wl24wllb90pdzz.R.inc(99684);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 2e-8);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99685);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 3e-6);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99686);Assert.assertEquals(fourExtrema.valueXpYm, optimum.getValue(), 2e-12);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99687);Assert.assertTrue(optimizer.getEvaluations() > 120);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99688);Assert.assertTrue(optimizer.getEvaluations() < 150);
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

    @Test
    public void testMaximize1() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u9ex7q24x5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testMaximize1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u9ex7q24x5(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99689);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99690);SimplexOptimizer optimizer = new SimplexOptimizer(1e-11, 1e-30);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99691);optimizer.setSimplex(new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99692);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124wl24wllb90pdzz.R.inc(99693);final PointValuePair optimum
            = optimizer.optimize(200, fourExtrema, GoalType.MAXIMIZE, new double[] { -3.0, 0.0 });
        __CLR4_4_124wl24wllb90pdzz.R.inc(99694);Assert.assertEquals(fourExtrema.xM, optimum.getPoint()[0], 7e-7);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99695);Assert.assertEquals(fourExtrema.yM, optimum.getPoint()[1], 3e-7);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99696);Assert.assertEquals(fourExtrema.valueXmYm, optimum.getValue(), 2e-14);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99697);Assert.assertTrue(optimizer.getEvaluations() > 120);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99698);Assert.assertTrue(optimizer.getEvaluations() < 150);
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

    @Test
    public void testMaximize2() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r0eyf924xf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testMaximize2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r0eyf924xf(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99699);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99700);SimplexOptimizer optimizer = new SimplexOptimizer(new SimpleValueChecker(1e-15, 1e-30));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99701);optimizer.setSimplex(new MultiDirectionalSimplex(new double[] { 0.2, 0.2 }));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99702);final FourExtrema fourExtrema = new FourExtrema();

        __CLR4_4_124wl24wllb90pdzz.R.inc(99703);final PointValuePair optimum
            = optimizer.optimize(200, fourExtrema, GoalType.MAXIMIZE, new double[] { 1, 0 });
        __CLR4_4_124wl24wllb90pdzz.R.inc(99704);Assert.assertEquals(fourExtrema.xP, optimum.getPoint()[0], 2e-8);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99705);Assert.assertEquals(fourExtrema.yP, optimum.getPoint()[1], 3e-6);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99706);Assert.assertEquals(fourExtrema.valueXpYp, optimum.getValue(), 2e-12);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99707);Assert.assertTrue(optimizer.getEvaluations() > 180);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99708);Assert.assertTrue(optimizer.getEvaluations() < 220);
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

    @Test
    public void testRosenbrock() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1glvc6924xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testRosenbrock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1glvc6924xp(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99709);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99710);MultivariateFunction rosenbrock =
            new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99711);
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99712);++count;
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99713);double a = x[1] - x[0] * x[0];
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99714);double b = 1.0 - x[0];
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99715);return 100 * a * a + b * b;
                }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}
            };

        __CLR4_4_124wl24wllb90pdzz.R.inc(99716);count = 0;
        __CLR4_4_124wl24wllb90pdzz.R.inc(99717);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99718);optimizer.setSimplex(new MultiDirectionalSimplex(new double[][] {
                    { -1.2,  1.0 }, { 0.9, 1.2 } , {  3.5, -2.3 }
                }));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99719);PointValuePair optimum =
            optimizer.optimize(100, rosenbrock, GoalType.MINIMIZE, new double[] { -1.2, 1 });

        __CLR4_4_124wl24wllb90pdzz.R.inc(99720);Assert.assertEquals(count, optimizer.getEvaluations());
        __CLR4_4_124wl24wllb90pdzz.R.inc(99721);Assert.assertTrue(optimizer.getEvaluations() > 50);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99722);Assert.assertTrue(optimizer.getEvaluations() < 100);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99723);Assert.assertTrue(optimum.getValue() > 1e-2);
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

    @Test
    public void testPowell() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh0dly24y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testPowell",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh0dly24y4(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99724);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99725);MultivariateFunction powell =
            new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99726);
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99727);++count;
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99728);double a = x[0] + 10 * x[1];
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99729);double b = x[2] - x[3];
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99730);double c = x[1] - 2 * x[2];
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99731);double d = x[0] - x[3];
                    __CLR4_4_124wl24wllb90pdzz.R.inc(99732);return a * a + 5 * b * b + c * c * c * c + 10 * d * d * d * d;
                }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}
            };

        __CLR4_4_124wl24wllb90pdzz.R.inc(99733);count = 0;
        __CLR4_4_124wl24wllb90pdzz.R.inc(99734);SimplexOptimizer optimizer = new SimplexOptimizer(-1, 1e-3);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99735);optimizer.setSimplex(new MultiDirectionalSimplex(4));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99736);PointValuePair optimum =
            optimizer.optimize(1000, powell, GoalType.MINIMIZE, new double[] { 3, -1, 0, 1 });
        __CLR4_4_124wl24wllb90pdzz.R.inc(99737);Assert.assertEquals(count, optimizer.getEvaluations());
        __CLR4_4_124wl24wllb90pdzz.R.inc(99738);Assert.assertTrue(optimizer.getEvaluations() > 800);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99739);Assert.assertTrue(optimizer.getEvaluations() < 900);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99740);Assert.assertTrue(optimum.getValue() > 1e-2);
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

    @Test
    public void testMath283() {__CLR4_4_124wl24wllb90pdzz.R.globalSliceStart(getClass().getName(),99741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pml5sq24yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124wl24wllb90pdzz.R.rethrow($CLV_t2$);}finally{__CLR4_4_124wl24wllb90pdzz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest.testMath283",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pml5sq24yl(){try{__CLR4_4_124wl24wllb90pdzz.R.inc(99741);
        // fails because MultiDirectional.iterateSimplex is looping forever
        // the while(true) should be replaced with a convergence check
        __CLR4_4_124wl24wllb90pdzz.R.inc(99742);SimplexOptimizer optimizer = new SimplexOptimizer(1e-14, 1e-14);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99743);optimizer.setSimplex(new MultiDirectionalSimplex(2));
        __CLR4_4_124wl24wllb90pdzz.R.inc(99744);final Gaussian2D function = new Gaussian2D(0, 0, 1);
        __CLR4_4_124wl24wllb90pdzz.R.inc(99745);PointValuePair estimate = optimizer.optimize(1000, function,
                                                         GoalType.MAXIMIZE, function.getMaximumPosition());
        __CLR4_4_124wl24wllb90pdzz.R.inc(99746);final double EPSILON = 1e-5;
        __CLR4_4_124wl24wllb90pdzz.R.inc(99747);final double expectedMaximum = function.getMaximum();
        __CLR4_4_124wl24wllb90pdzz.R.inc(99748);final double actualMaximum = estimate.getValue();
        __CLR4_4_124wl24wllb90pdzz.R.inc(99749);Assert.assertEquals(expectedMaximum, actualMaximum, EPSILON);

        __CLR4_4_124wl24wllb90pdzz.R.inc(99750);final double[] expectedPosition = function.getMaximumPosition();
        __CLR4_4_124wl24wllb90pdzz.R.inc(99751);final double[] actualPosition = estimate.getPoint();
        __CLR4_4_124wl24wllb90pdzz.R.inc(99752);Assert.assertEquals(expectedPosition[0], actualPosition[0], EPSILON );
        __CLR4_4_124wl24wllb90pdzz.R.inc(99753);Assert.assertEquals(expectedPosition[1], actualPosition[1], EPSILON );
    }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

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

        public double value(double[] variables) {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99754);
            __CLR4_4_124wl24wllb90pdzz.R.inc(99755);final double x = variables[0];
            __CLR4_4_124wl24wllb90pdzz.R.inc(99756);final double y = variables[1];
            __CLR4_4_124wl24wllb90pdzz.R.inc(99757);return ((((x == 0 || y == 0) )&&(__CLR4_4_124wl24wllb90pdzz.R.iget(99758)!=0|true))||(__CLR4_4_124wl24wllb90pdzz.R.iget(99759)==0&false))? 0 :
                FastMath.atan(x) * FastMath.atan(x + 2) * FastMath.atan(y) * FastMath.atan(y) / (x * y);
        }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}
    }

    private static class Gaussian2D implements MultivariateFunction {
        private final double[] maximumPosition;
        private final double std;

        public Gaussian2D(double xOpt, double yOpt, double std) {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99760);
            __CLR4_4_124wl24wllb90pdzz.R.inc(99761);maximumPosition = new double[] { xOpt, yOpt };
            __CLR4_4_124wl24wllb90pdzz.R.inc(99762);this.std = std;
        }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

        public double getMaximum() {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99763);
            __CLR4_4_124wl24wllb90pdzz.R.inc(99764);return value(maximumPosition);
        }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

        public double[] getMaximumPosition() {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99765);
            __CLR4_4_124wl24wllb90pdzz.R.inc(99766);return maximumPosition.clone();
        }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}

        public double value(double[] point) {try{__CLR4_4_124wl24wllb90pdzz.R.inc(99767);
            __CLR4_4_124wl24wllb90pdzz.R.inc(99768);final double x = point[0], y = point[1];
            __CLR4_4_124wl24wllb90pdzz.R.inc(99769);final double twoS2 = 2.0 * std * std;
            __CLR4_4_124wl24wllb90pdzz.R.inc(99770);return 1.0 / (twoS2 * FastMath.PI) * FastMath.exp(-(x * x + y * y) / twoS2);
        }finally{__CLR4_4_124wl24wllb90pdzz.R.flushNeeded();}}
    }

    private int count;
}
