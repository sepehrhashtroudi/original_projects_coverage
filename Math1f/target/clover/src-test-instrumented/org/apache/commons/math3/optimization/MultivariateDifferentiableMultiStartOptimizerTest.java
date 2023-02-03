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


import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.optimization.general.CircleScalar;
import org.apache.commons.math3.optimization.general.ConjugateGradientFormula;
import org.apache.commons.math3.optimization.general.NonLinearConjugateGradientOptimizer;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator;
import org.junit.Assert;
import org.junit.Test;

public class MultivariateDifferentiableMultiStartOptimizerTest {static class __CLR4_4_1241k241klb90pdy4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98583,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCircleFitting() {__CLR4_4_1241k241klb90pdy4.R.globalSliceStart(getClass().getName(),98552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcouro241k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1241k241klb90pdy4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1241k241klb90pdy4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.MultivariateDifferentiableMultiStartOptimizerTest.testCircleFitting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),98552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcouro241k(){try{__CLR4_4_1241k241klb90pdy4.R.inc(98552);
        __CLR4_4_1241k241klb90pdy4.R.inc(98553);CircleScalar circle = new CircleScalar();
        __CLR4_4_1241k241klb90pdy4.R.inc(98554);circle.addPoint( 30.0,  68.0);
        __CLR4_4_1241k241klb90pdy4.R.inc(98555);circle.addPoint( 50.0,  -6.0);
        __CLR4_4_1241k241klb90pdy4.R.inc(98556);circle.addPoint(110.0, -20.0);
        __CLR4_4_1241k241klb90pdy4.R.inc(98557);circle.addPoint( 35.0,  15.0);
        __CLR4_4_1241k241klb90pdy4.R.inc(98558);circle.addPoint( 45.0,  97.0);
        // TODO: the wrapper around NonLinearConjugateGradientOptimizer is a temporary hack for
        // version 3.1 of the library. It should be removed when NonLinearConjugateGradientOptimizer
        // will officially be declared as implementing MultivariateDifferentiableOptimizer
        __CLR4_4_1241k241klb90pdy4.R.inc(98559);MultivariateDifferentiableOptimizer underlying =
                new MultivariateDifferentiableOptimizer() {

            private final NonLinearConjugateGradientOptimizer cg =
                    new NonLinearConjugateGradientOptimizer(ConjugateGradientFormula.POLAK_RIBIERE,
                                                            new SimpleValueChecker(1.0e-10, 1.0e-10));
            public PointValuePair optimize(int maxEval,
                                           MultivariateDifferentiableFunction f,
                                           GoalType goalType,
                                           double[] startPoint) {try{__CLR4_4_1241k241klb90pdy4.R.inc(98560);
                __CLR4_4_1241k241klb90pdy4.R.inc(98561);return cg.optimize(maxEval, f, goalType, startPoint);
            }finally{__CLR4_4_1241k241klb90pdy4.R.flushNeeded();}}

            public int getMaxEvaluations() {try{__CLR4_4_1241k241klb90pdy4.R.inc(98562);
                __CLR4_4_1241k241klb90pdy4.R.inc(98563);return cg.getMaxEvaluations();
            }finally{__CLR4_4_1241k241klb90pdy4.R.flushNeeded();}}

            public int getEvaluations() {try{__CLR4_4_1241k241klb90pdy4.R.inc(98564);
                __CLR4_4_1241k241klb90pdy4.R.inc(98565);return cg.getEvaluations();
            }finally{__CLR4_4_1241k241klb90pdy4.R.flushNeeded();}}

            public ConvergenceChecker<PointValuePair> getConvergenceChecker() {try{__CLR4_4_1241k241klb90pdy4.R.inc(98566);
                __CLR4_4_1241k241klb90pdy4.R.inc(98567);return cg.getConvergenceChecker();
            }finally{__CLR4_4_1241k241klb90pdy4.R.flushNeeded();}}
        };
        __CLR4_4_1241k241klb90pdy4.R.inc(98568);JDKRandomGenerator g = new JDKRandomGenerator();
        __CLR4_4_1241k241klb90pdy4.R.inc(98569);g.setSeed(753289573253l);
        __CLR4_4_1241k241klb90pdy4.R.inc(98570);RandomVectorGenerator generator =
            new UncorrelatedRandomVectorGenerator(new double[] { 50.0, 50.0 }, new double[] { 10.0, 10.0 },
                                                  new GaussianRandomGenerator(g));
        __CLR4_4_1241k241klb90pdy4.R.inc(98571);MultivariateDifferentiableMultiStartOptimizer optimizer =
            new MultivariateDifferentiableMultiStartOptimizer(underlying, 10, generator);
        __CLR4_4_1241k241klb90pdy4.R.inc(98572);PointValuePair optimum =
            optimizer.optimize(200, circle, GoalType.MINIMIZE, new double[] { 98.680, 47.345 });
        __CLR4_4_1241k241klb90pdy4.R.inc(98573);Assert.assertEquals(200, optimizer.getMaxEvaluations());
        __CLR4_4_1241k241klb90pdy4.R.inc(98574);PointValuePair[] optima = optimizer.getOptima();
        __CLR4_4_1241k241klb90pdy4.R.inc(98575);for (PointValuePair o : optima) {{
            __CLR4_4_1241k241klb90pdy4.R.inc(98576);Vector2D center = new Vector2D(o.getPointRef()[0], o.getPointRef()[1]);
            __CLR4_4_1241k241klb90pdy4.R.inc(98577);Assert.assertEquals(69.960161753, circle.getRadius(center), 1.0e-8);
            __CLR4_4_1241k241klb90pdy4.R.inc(98578);Assert.assertEquals(96.075902096, center.getX(), 1.0e-8);
            __CLR4_4_1241k241klb90pdy4.R.inc(98579);Assert.assertEquals(48.135167894, center.getY(), 1.0e-8);
        }
        }__CLR4_4_1241k241klb90pdy4.R.inc(98580);Assert.assertTrue(optimizer.getEvaluations() > 70);
        __CLR4_4_1241k241klb90pdy4.R.inc(98581);Assert.assertTrue(optimizer.getEvaluations() < 90);
        __CLR4_4_1241k241klb90pdy4.R.inc(98582);Assert.assertEquals(3.1267527, optimum.getValue(), 1.0e-8);
    }finally{__CLR4_4_1241k241klb90pdy4.R.flushNeeded();}}

}
