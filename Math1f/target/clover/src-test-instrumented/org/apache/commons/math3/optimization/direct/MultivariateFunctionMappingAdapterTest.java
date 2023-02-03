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
import org.junit.Assert;
import org.junit.Test;

public class MultivariateFunctionMappingAdapterTest {static class __CLR4_4_124pl24pllb90pdzk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99484,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testStartSimplexInsideRange() {__CLR4_4_124pl24pllb90pdzk.R.globalSliceStart(getClass().getName(),99417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2j4c224pl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124pl24pllb90pdzk.R.rethrow($CLV_t2$);}finally{__CLR4_4_124pl24pllb90pdzk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapterTest.testStartSimplexInsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2j4c224pl(){try{__CLR4_4_124pl24pllb90pdzk.R.inc(99417);

        __CLR4_4_124pl24pllb90pdzk.R.inc(99418);final BiQuadratic biQuadratic = new BiQuadratic(2.0, 2.5, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99419);final MultivariateFunctionMappingAdapter wrapped =
                new MultivariateFunctionMappingAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99420);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99421);optimizer.setSimplex(new NelderMeadSimplex(new double[][] {
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
            wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
        }));

        __CLR4_4_124pl24pllb90pdzk.R.inc(99422);final PointValuePair optimum
            = optimizer.optimize(300, wrapped, GoalType.MINIMIZE,
                                 wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 }));
        __CLR4_4_124pl24pllb90pdzk.R.inc(99423);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99424);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 2e-7);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99425);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 2e-7);

    }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

    @Test
    public void testOptimumOutsideRange() {__CLR4_4_124pl24pllb90pdzk.R.globalSliceStart(getClass().getName(),99426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tmtp824pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124pl24pllb90pdzk.R.rethrow($CLV_t2$);}finally{__CLR4_4_124pl24pllb90pdzk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapterTest.testOptimumOutsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tmtp824pu(){try{__CLR4_4_124pl24pllb90pdzk.R.inc(99426);

        __CLR4_4_124pl24pllb90pdzk.R.inc(99427);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99428);final MultivariateFunctionMappingAdapter wrapped =
                new MultivariateFunctionMappingAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99429);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99430);optimizer.setSimplex(new NelderMeadSimplex(new double[][] {
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
            wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
        }));

        __CLR4_4_124pl24pllb90pdzk.R.inc(99431);final PointValuePair optimum
            = optimizer.optimize(100, wrapped, GoalType.MINIMIZE,
                                 wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 }));
        __CLR4_4_124pl24pllb90pdzk.R.inc(99432);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99433);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 2e-7);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99434);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 2e-7);

    }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

    @Test
    public void testUnbounded() {__CLR4_4_124pl24pllb90pdzk.R.globalSliceStart(getClass().getName(),99435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ospl324q3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124pl24pllb90pdzk.R.rethrow($CLV_t2$);}finally{__CLR4_4_124pl24pllb90pdzk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapterTest.testUnbounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ospl324q3(){try{__CLR4_4_124pl24pllb90pdzk.R.inc(99435);

        __CLR4_4_124pl24pllb90pdzk.R.inc(99436);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99437);final MultivariateFunctionMappingAdapter wrapped =
                new MultivariateFunctionMappingAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99438);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99439);optimizer.setSimplex(new NelderMeadSimplex(new double[][] {
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
            wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
        }));

        __CLR4_4_124pl24pllb90pdzk.R.inc(99440);final PointValuePair optimum
            = optimizer.optimize(300, wrapped, GoalType.MINIMIZE,
                                 wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 }));
        __CLR4_4_124pl24pllb90pdzk.R.inc(99441);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99442);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 2e-7);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99443);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 2e-7);

    }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

    @Test
    public void testHalfBounded() {__CLR4_4_124pl24pllb90pdzk.R.globalSliceStart(getClass().getName(),99444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl3rcv24qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124pl24pllb90pdzk.R.rethrow($CLV_t2$);}finally{__CLR4_4_124pl24pllb90pdzk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionMappingAdapterTest.testHalfBounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl3rcv24qc(){try{__CLR4_4_124pl24pllb90pdzk.R.inc(99444);

        __CLR4_4_124pl24pllb90pdzk.R.inc(99445);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 4.0,
                                                        1.0, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, 3.0);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99446);final MultivariateFunctionMappingAdapter wrapped =
                new MultivariateFunctionMappingAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99447);SimplexOptimizer optimizer = new SimplexOptimizer(1e-13, 1e-30);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99448);optimizer.setSimplex(new NelderMeadSimplex(new double[][] {
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.75 }),
            wrapped.boundedToUnbounded(new double[] { 1.5, 2.95 }),
            wrapped.boundedToUnbounded(new double[] { 1.7, 2.90 })
        }));

        __CLR4_4_124pl24pllb90pdzk.R.inc(99449);final PointValuePair optimum
            = optimizer.optimize(200, wrapped, GoalType.MINIMIZE,
                                 wrapped.boundedToUnbounded(new double[] { 1.5, 2.25 }));
        __CLR4_4_124pl24pllb90pdzk.R.inc(99450);final double[] bounded = wrapped.unboundedToBounded(optimum.getPoint());

        __CLR4_4_124pl24pllb90pdzk.R.inc(99451);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), bounded[0], 1e-7);
        __CLR4_4_124pl24pllb90pdzk.R.inc(99452);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), bounded[1], 1e-7);

    }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

    private static class BiQuadratic implements MultivariateFunction {

        private final double xOptimum;
        private final double yOptimum;

        private final double xMin;
        private final double xMax;
        private final double yMin;
        private final double yMax;

        public BiQuadratic(final double xOptimum, final double yOptimum,
                           final double xMin, final double xMax,
                           final double yMin, final double yMax) {try{__CLR4_4_124pl24pllb90pdzk.R.inc(99453);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99454);this.xOptimum = xOptimum;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99455);this.yOptimum = yOptimum;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99456);this.xMin     = xMin;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99457);this.xMax     = xMax;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99458);this.yMin     = yMin;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99459);this.yMax     = yMax;
        }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

        public double value(double[] point) {try{__CLR4_4_124pl24pllb90pdzk.R.inc(99460);

            // the function should never be called with out of range points
            __CLR4_4_124pl24pllb90pdzk.R.inc(99461);Assert.assertTrue(point[0] >= xMin);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99462);Assert.assertTrue(point[0] <= xMax);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99463);Assert.assertTrue(point[1] >= yMin);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99464);Assert.assertTrue(point[1] <= yMax);

            __CLR4_4_124pl24pllb90pdzk.R.inc(99465);final double dx = point[0] - xOptimum;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99466);final double dy = point[1] - yOptimum;
            __CLR4_4_124pl24pllb90pdzk.R.inc(99467);return dx * dx + dy * dy;

        }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

        public double[] getLower() {try{__CLR4_4_124pl24pllb90pdzk.R.inc(99468);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99469);return new double[] { xMin, yMin };
        }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

        public double[] getUpper() {try{__CLR4_4_124pl24pllb90pdzk.R.inc(99470);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99471);return new double[] { xMax, yMax };
        }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

        public double getBoundedXOptimum() {try{__CLR4_4_124pl24pllb90pdzk.R.inc(99472);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99473);return ((((xOptimum < xMin) )&&(__CLR4_4_124pl24pllb90pdzk.R.iget(99474)!=0|true))||(__CLR4_4_124pl24pllb90pdzk.R.iget(99475)==0&false))? xMin : (((((xOptimum > xMax) )&&(__CLR4_4_124pl24pllb90pdzk.R.iget(99476)!=0|true))||(__CLR4_4_124pl24pllb90pdzk.R.iget(99477)==0&false))? xMax : xOptimum);
        }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

        public double getBoundedYOptimum() {try{__CLR4_4_124pl24pllb90pdzk.R.inc(99478);
            __CLR4_4_124pl24pllb90pdzk.R.inc(99479);return ((((yOptimum < yMin) )&&(__CLR4_4_124pl24pllb90pdzk.R.iget(99480)!=0|true))||(__CLR4_4_124pl24pllb90pdzk.R.iget(99481)==0&false))? yMin : (((((yOptimum > yMax) )&&(__CLR4_4_124pl24pllb90pdzk.R.iget(99482)!=0|true))||(__CLR4_4_124pl24pllb90pdzk.R.iget(99483)==0&false))? yMax : yOptimum);
        }finally{__CLR4_4_124pl24pllb90pdzk.R.flushNeeded();}}

    }

}
