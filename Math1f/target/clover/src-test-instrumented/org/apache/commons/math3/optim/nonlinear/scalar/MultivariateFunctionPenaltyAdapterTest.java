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
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex;
import org.junit.Assert;
import org.junit.Test;

public class MultivariateFunctionPenaltyAdapterTest {static class __CLR4_4_121i021i0lb90pdrs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testStartSimplexInsideRange() {__CLR4_4_121i021i0lb90pdrs.R.globalSliceStart(getClass().getName(),95256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2j4c221i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121i021i0lb90pdrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_121i021i0lb90pdrs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest.testStartSimplexInsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2j4c221i0(){try{__CLR4_4_121i021i0lb90pdrs.R.inc(95256);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95257);final BiQuadratic biQuadratic = new BiQuadratic(2.0, 2.5, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95258);final MultivariateFunctionPenaltyAdapter wrapped
              = new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                       biQuadratic.getLower(),
                                                       biQuadratic.getUpper(),
                                                       1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95259);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95260);final AbstractSimplex simplex = new NelderMeadSimplex(new double[] { 1.0, 0.5 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95261);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(300),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { 1.5, 2.25 }));

        __CLR4_4_121i021i0lb90pdrs.R.inc(95262);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95263);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);
    }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

    @Test
    public void testStartSimplexOutsideRange() {__CLR4_4_121i021i0lb90pdrs.R.globalSliceStart(getClass().getName(),95264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ta43921i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121i021i0lb90pdrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_121i021i0lb90pdrs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest.testStartSimplexOutsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95264,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ta43921i8(){try{__CLR4_4_121i021i0lb90pdrs.R.inc(95264);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95265);final BiQuadratic biQuadratic = new BiQuadratic(2.0, 2.5, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95266);final MultivariateFunctionPenaltyAdapter wrapped
              = new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                       biQuadratic.getLower(),
                                                       biQuadratic.getUpper(),
                                                       1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95267);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95268);final AbstractSimplex simplex = new NelderMeadSimplex(new double[] { 1.0, 0.5 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95269);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(300),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { -1.5, 4.0 }));

        __CLR4_4_121i021i0lb90pdrs.R.inc(95270);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95271);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);
    }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

    @Test
    public void testOptimumOutsideRange() {__CLR4_4_121i021i0lb90pdrs.R.globalSliceStart(getClass().getName(),95272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tmtp821ig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121i021i0lb90pdrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_121i021i0lb90pdrs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest.testOptimumOutsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tmtp821ig(){try{__CLR4_4_121i021i0lb90pdrs.R.inc(95272);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95273);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95274);final MultivariateFunctionPenaltyAdapter wrapped
            =  new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                      biQuadratic.getLower(),
                                                      biQuadratic.getUpper(),
                                                      1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95275);SimplexOptimizer optimizer = new SimplexOptimizer(new SimplePointChecker<PointValuePair>(1.0e-11, 1.0e-20));
        __CLR4_4_121i021i0lb90pdrs.R.inc(95276);final AbstractSimplex simplex = new NelderMeadSimplex(new double[] { 1.0, 0.5 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95277);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(600),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { -1.5, 4.0 }));

        __CLR4_4_121i021i0lb90pdrs.R.inc(95278);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95279);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);
    }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

    @Test
    public void testUnbounded() {__CLR4_4_121i021i0lb90pdrs.R.globalSliceStart(getClass().getName(),95280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ospl321io();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121i021i0lb90pdrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_121i021i0lb90pdrs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest.testUnbounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ospl321io(){try{__CLR4_4_121i021i0lb90pdrs.R.inc(95280);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95281);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95282);final MultivariateFunctionPenaltyAdapter wrapped
            = new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                     biQuadratic.getLower(),
                                                     biQuadratic.getUpper(),
                                                     1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95283);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95284);final AbstractSimplex simplex = new NelderMeadSimplex(new double[] { 1.0, 0.5 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95285);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(300),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { -1.5, 4.0 }));

        __CLR4_4_121i021i0lb90pdrs.R.inc(95286);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95287);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);
    }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

    @Test
    public void testHalfBounded() {__CLR4_4_121i021i0lb90pdrs.R.globalSliceStart(getClass().getName(),95288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl3rcv21iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121i021i0lb90pdrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_121i021i0lb90pdrs.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapterTest.testHalfBounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl3rcv21iw(){try{__CLR4_4_121i021i0lb90pdrs.R.inc(95288);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95289);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 4.0,
                                                        1.0, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, 3.0);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95290);final MultivariateFunctionPenaltyAdapter wrapped
              = new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                       biQuadratic.getLower(),
                                                       biQuadratic.getUpper(),
                                                       1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95291);SimplexOptimizer optimizer = new SimplexOptimizer(new SimplePointChecker<PointValuePair>(1.0e-10, 1.0e-20));
        __CLR4_4_121i021i0lb90pdrs.R.inc(95292);final AbstractSimplex simplex = new NelderMeadSimplex(new double[] { 1.0, 0.5 });

        __CLR4_4_121i021i0lb90pdrs.R.inc(95293);final PointValuePair optimum
            = optimizer.optimize(new MaxEval(400),
                                 new ObjectiveFunction(wrapped),
                                 simplex,
                                 GoalType.MINIMIZE,
                                 new InitialGuess(new double[] { -1.5, 4.0 }));

        __CLR4_4_121i021i0lb90pdrs.R.inc(95294);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_121i021i0lb90pdrs.R.inc(95295);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);
    }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

    private static class BiQuadratic implements MultivariateFunction {

        private final double xOptimum;
        private final double yOptimum;

        private final double xMin;
        private final double xMax;
        private final double yMin;
        private final double yMax;

        public BiQuadratic(final double xOptimum, final double yOptimum,
                           final double xMin, final double xMax,
                           final double yMin, final double yMax) {try{__CLR4_4_121i021i0lb90pdrs.R.inc(95296);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95297);this.xOptimum = xOptimum;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95298);this.yOptimum = yOptimum;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95299);this.xMin     = xMin;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95300);this.xMax     = xMax;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95301);this.yMin     = yMin;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95302);this.yMax     = yMax;
        }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

        public double value(double[] point) {try{__CLR4_4_121i021i0lb90pdrs.R.inc(95303);
            // the function should never be called with out of range points
            __CLR4_4_121i021i0lb90pdrs.R.inc(95304);Assert.assertTrue(point[0] >= xMin);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95305);Assert.assertTrue(point[0] <= xMax);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95306);Assert.assertTrue(point[1] >= yMin);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95307);Assert.assertTrue(point[1] <= yMax);

            __CLR4_4_121i021i0lb90pdrs.R.inc(95308);final double dx = point[0] - xOptimum;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95309);final double dy = point[1] - yOptimum;
            __CLR4_4_121i021i0lb90pdrs.R.inc(95310);return dx * dx + dy * dy;

        }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

        public double[] getLower() {try{__CLR4_4_121i021i0lb90pdrs.R.inc(95311);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95312);return new double[] { xMin, yMin };
        }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

        public double[] getUpper() {try{__CLR4_4_121i021i0lb90pdrs.R.inc(95313);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95314);return new double[] { xMax, yMax };
        }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

        public double getBoundedXOptimum() {try{__CLR4_4_121i021i0lb90pdrs.R.inc(95315);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95316);return ((((xOptimum < xMin) )&&(__CLR4_4_121i021i0lb90pdrs.R.iget(95317)!=0|true))||(__CLR4_4_121i021i0lb90pdrs.R.iget(95318)==0&false))? xMin : (((((xOptimum > xMax) )&&(__CLR4_4_121i021i0lb90pdrs.R.iget(95319)!=0|true))||(__CLR4_4_121i021i0lb90pdrs.R.iget(95320)==0&false))? xMax : xOptimum);
        }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

        public double getBoundedYOptimum() {try{__CLR4_4_121i021i0lb90pdrs.R.inc(95321);
            __CLR4_4_121i021i0lb90pdrs.R.inc(95322);return ((((yOptimum < yMin) )&&(__CLR4_4_121i021i0lb90pdrs.R.iget(95323)!=0|true))||(__CLR4_4_121i021i0lb90pdrs.R.iget(95324)==0&false))? yMin : (((((yOptimum > yMax) )&&(__CLR4_4_121i021i0lb90pdrs.R.iget(95325)!=0|true))||(__CLR4_4_121i021i0lb90pdrs.R.iget(95326)==0&false))? yMax : yOptimum);
        }finally{__CLR4_4_121i021i0lb90pdrs.R.flushNeeded();}}

    }

}
