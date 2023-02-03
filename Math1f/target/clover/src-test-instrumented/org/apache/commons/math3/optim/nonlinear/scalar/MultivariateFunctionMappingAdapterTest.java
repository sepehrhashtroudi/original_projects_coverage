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
package org.apache.commons.math3.optim.nonlinear.scalar;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.junit.Assert;
import org.junit.Test;

public class MultivariateFunctionMappingAdapterTest {static class __CLR4_4_121g521g5lb90pdrn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95256,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testStartSimplexInsideRange() {__CLR4_4_121g521g5lb90pdrn.R.globalSliceStart(getClass().getName(),95189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2j4c221g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121g521g5lb90pdrn.R.rethrow($CLV_t2$);}finally{__CLR4_4_121g521g5lb90pdrn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest.testStartSimplexInsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2j4c221g5(){try{__CLR4_4_121g521g5lb90pdrn.R.inc(95189);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95190);final BiQuadratic biQuadratic = new BiQuadratic(2.0, 2.5, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95191);final MultivariateFunctionMappingAdapter wrapped
            = new MultivariateFunctionMappingAdapter(biQuadratic,
                                                     biQuadratic.getLower(),
                                                     biQuadratic.getUpper());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95192);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95193);final AbstractSimplex simplex = new NelderMeadSimplex(new double[][] {
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
                wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
            });

        __CLR4_4_121g521g5lb90pdrn.R.inc(95194);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(300),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 })));
        __CLR4_4_121g521g5lb90pdrn.R.inc(95195);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95196);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 2e-7);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95197);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 2e-7);
    }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

    @Test
    public void testOptimumOutsideRange() {__CLR4_4_121g521g5lb90pdrn.R.globalSliceStart(getClass().getName(),95198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tmtp821ge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121g521g5lb90pdrn.R.rethrow($CLV_t2$);}finally{__CLR4_4_121g521g5lb90pdrn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest.testOptimumOutsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tmtp821ge(){try{__CLR4_4_121g521g5lb90pdrn.R.inc(95198);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95199);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95200);final MultivariateFunctionMappingAdapter wrapped
            = new MultivariateFunctionMappingAdapter(biQuadratic,
                                                     biQuadratic.getLower(),
                                                     biQuadratic.getUpper());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95201);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95202);final AbstractSimplex simplex = new NelderMeadSimplex(new double[][] {
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
                wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
            });

        __CLR4_4_121g521g5lb90pdrn.R.inc(95203);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(100),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 })));
        __CLR4_4_121g521g5lb90pdrn.R.inc(95204);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95205);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 2e-7);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95206);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 2e-7);
    }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

    @Test
    public void testUnbounded() {__CLR4_4_121g521g5lb90pdrn.R.globalSliceStart(getClass().getName(),95207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ospl321gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121g521g5lb90pdrn.R.rethrow($CLV_t2$);}finally{__CLR4_4_121g521g5lb90pdrn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest.testUnbounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ospl321gn(){try{__CLR4_4_121g521g5lb90pdrn.R.inc(95207);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95208);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95209);final MultivariateFunctionMappingAdapter wrapped
            = new MultivariateFunctionMappingAdapter(biQuadratic,
                                                     biQuadratic.getLower(),
                                                     biQuadratic.getUpper());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95210);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95211);final AbstractSimplex simplex = new NelderMeadSimplex(new double[][] {
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
                wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
            });

        __CLR4_4_121g521g5lb90pdrn.R.inc(95212);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(300),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 })));
        __CLR4_4_121g521g5lb90pdrn.R.inc(95213);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95214);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 2e-7);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95215);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 2e-7);
    }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

    @Test
    public void testHalfBounded() {__CLR4_4_121g521g5lb90pdrn.R.globalSliceStart(getClass().getName(),95216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl3rcv21gw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121g521g5lb90pdrn.R.rethrow($CLV_t2$);}finally{__CLR4_4_121g521g5lb90pdrn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest.testHalfBounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl3rcv21gw(){try{__CLR4_4_121g521g5lb90pdrn.R.inc(95216);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95217);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 4.0,
                                                        1.0, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, 3.0);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95218);final MultivariateFunctionMappingAdapter wrapped
            = new MultivariateFunctionMappingAdapter(biQuadratic,
                                                     biQuadratic.getLower(),
                                                     biQuadratic.getUpper());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95219);SimplexOptimizer optimizer = new SimplexOptimizer(1e-13, 1e-30);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95220);final AbstractSimplex simplex = new NelderMeadSimplex(new double[][] {
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
                wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
                wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
            });

        __CLR4_4_121g521g5lb90pdrn.R.inc(95221);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(200),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 })));
        __CLR4_4_121g521g5lb90pdrn.R.inc(95222);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_121g521g5lb90pdrn.R.inc(95223);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 1e-7);
        __CLR4_4_121g521g5lb90pdrn.R.inc(95224);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 1e-7);
    }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

    private static class BiQuadratic implements MultivariateFunction {

        private final double xOptimum;
        private final double yOptimum;

        private final double xMin;
        private final double xMax;
        private final double yMin;
        private final double yMax;

        public BiQuadratic(final double xOptimum, final double yOptimum,
                           final double xMin, final double xMax,
                           final double yMin, final double yMax) {try{__CLR4_4_121g521g5lb90pdrn.R.inc(95225);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95226);this.xOptimum = xOptimum;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95227);this.yOptimum = yOptimum;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95228);this.xMin     = xMin;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95229);this.xMax     = xMax;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95230);this.yMin     = yMin;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95231);this.yMax     = yMax;
        }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

        public double value(double[] point) {try{__CLR4_4_121g521g5lb90pdrn.R.inc(95232);
            // the function should never be called with out of range points
            __CLR4_4_121g521g5lb90pdrn.R.inc(95233);Assert.assertTrue(point[0] >= xMin);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95234);Assert.assertTrue(point[0] <= xMax);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95235);Assert.assertTrue(point[1] >= yMin);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95236);Assert.assertTrue(point[1] <= yMax);

            __CLR4_4_121g521g5lb90pdrn.R.inc(95237);final double dx = point[0] - xOptimum;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95238);final double dy = point[1] - yOptimum;
            __CLR4_4_121g521g5lb90pdrn.R.inc(95239);return dx * dx + dy * dy;

        }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

        public double[] getLower() {try{__CLR4_4_121g521g5lb90pdrn.R.inc(95240);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95241);return new double[] { xMin, yMin };
        }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

        public double[] getUpper() {try{__CLR4_4_121g521g5lb90pdrn.R.inc(95242);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95243);return new double[] { xMax, yMax };
        }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

        public double getBoundedXOptimum() {try{__CLR4_4_121g521g5lb90pdrn.R.inc(95244);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95245);return ((((xOptimum < xMin) )&&(__CLR4_4_121g521g5lb90pdrn.R.iget(95246)!=0|true))||(__CLR4_4_121g521g5lb90pdrn.R.iget(95247)==0&false))? xMin : (((((xOptimum > xMax) )&&(__CLR4_4_121g521g5lb90pdrn.R.iget(95248)!=0|true))||(__CLR4_4_121g521g5lb90pdrn.R.iget(95249)==0&false))? xMax : xOptimum);
        }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}

        public double getBoundedYOptimum() {try{__CLR4_4_121g521g5lb90pdrn.R.inc(95250);
            __CLR4_4_121g521g5lb90pdrn.R.inc(95251);return ((((yOptimum < yMin) )&&(__CLR4_4_121g521g5lb90pdrn.R.iget(95252)!=0|true))||(__CLR4_4_121g521g5lb90pdrn.R.iget(95253)==0&false))? yMin : (((((yOptimum > yMax) )&&(__CLR4_4_121g521g5lb90pdrn.R.iget(95254)!=0|true))||(__CLR4_4_121g521g5lb90pdrn.R.iget(95255)==0&false))? yMax : yOptimum);
        }finally{__CLR4_4_121g521g5lb90pdrn.R.flushNeeded();}}
    }
}
