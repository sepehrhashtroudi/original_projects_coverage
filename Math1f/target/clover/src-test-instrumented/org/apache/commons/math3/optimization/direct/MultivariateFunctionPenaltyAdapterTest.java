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
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.junit.Assert;
import org.junit.Test;

public class MultivariateFunctionPenaltyAdapterTest {static class __CLR4_4_124rg24rglb90pdzp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99555,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testStartSimplexInsideRange() {__CLR4_4_124rg24rglb90pdzp.R.globalSliceStart(getClass().getName(),99484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f2j4c224rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124rg24rglb90pdzp.R.rethrow($CLV_t2$);}finally{__CLR4_4_124rg24rglb90pdzp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest.testStartSimplexInsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f2j4c224rg(){try{__CLR4_4_124rg24rglb90pdzp.R.inc(99484);

        __CLR4_4_124rg24rglb90pdzp.R.inc(99485);final BiQuadratic biQuadratic = new BiQuadratic(2.0, 2.5, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99486);final MultivariateFunctionPenaltyAdapter wrapped =
                new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper(),
                                                           1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99487);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99488);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 1.0, 0.5 }));

        __CLR4_4_124rg24rglb90pdzp.R.inc(99489);final PointValuePair optimum
            = optimizer.optimize(300, wrapped, GoalType.MINIMIZE, new double[] { 1.5, 2.25 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99490);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99491);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);

    }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

    @Test
    public void testStartSimplexOutsideRange() {__CLR4_4_124rg24rglb90pdzp.R.globalSliceStart(getClass().getName(),99492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ta43924ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124rg24rglb90pdzp.R.rethrow($CLV_t2$);}finally{__CLR4_4_124rg24rglb90pdzp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest.testStartSimplexOutsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ta43924ro(){try{__CLR4_4_124rg24rglb90pdzp.R.inc(99492);

        __CLR4_4_124rg24rglb90pdzp.R.inc(99493);final BiQuadratic biQuadratic = new BiQuadratic(2.0, 2.5, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99494);final MultivariateFunctionPenaltyAdapter wrapped =
                new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper(),
                                                           1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99495);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99496);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 1.0, 0.5 }));

        __CLR4_4_124rg24rglb90pdzp.R.inc(99497);final PointValuePair optimum
            = optimizer.optimize(300, wrapped, GoalType.MINIMIZE, new double[] { -1.5, 4.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99498);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99499);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);

    }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

    @Test
    public void testOptimumOutsideRange() {__CLR4_4_124rg24rglb90pdzp.R.globalSliceStart(getClass().getName(),99500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14tmtp824rw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124rg24rglb90pdzp.R.rethrow($CLV_t2$);}finally{__CLR4_4_124rg24rglb90pdzp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest.testOptimumOutsideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14tmtp824rw(){try{__CLR4_4_124rg24rglb90pdzp.R.inc(99500);

        __CLR4_4_124rg24rglb90pdzp.R.inc(99501);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0, 1.0, 3.0, 2.0, 3.0);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99502);final MultivariateFunctionPenaltyAdapter wrapped =
                new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper(),
                                                           1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99503);SimplexOptimizer optimizer = new SimplexOptimizer(new SimplePointChecker<PointValuePair>(1.0e-11, 1.0e-20));
        __CLR4_4_124rg24rglb90pdzp.R.inc(99504);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 1.0, 0.5 }));

        __CLR4_4_124rg24rglb90pdzp.R.inc(99505);final PointValuePair optimum
            = optimizer.optimize(600, wrapped, GoalType.MINIMIZE, new double[] { -1.5, 4.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99506);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99507);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);

    }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

    @Test
    public void testUnbounded() {__CLR4_4_124rg24rglb90pdzp.R.globalSliceStart(getClass().getName(),99508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ospl324s4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124rg24rglb90pdzp.R.rethrow($CLV_t2$);}finally{__CLR4_4_124rg24rglb90pdzp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest.testUnbounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ospl324s4(){try{__CLR4_4_124rg24rglb90pdzp.R.inc(99508);

        __CLR4_4_124rg24rglb90pdzp.R.inc(99509);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 0.0,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99510);final MultivariateFunctionPenaltyAdapter wrapped =
                new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper(),
                                                           1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99511);SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-30);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99512);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 1.0, 0.5 }));

        __CLR4_4_124rg24rglb90pdzp.R.inc(99513);final PointValuePair optimum
            = optimizer.optimize(300, wrapped, GoalType.MINIMIZE, new double[] { -1.5, 4.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99514);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99515);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);

    }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

    @Test
    public void testHalfBounded() {__CLR4_4_124rg24rglb90pdzp.R.globalSliceStart(getClass().getName(),99516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vl3rcv24sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124rg24rglb90pdzp.R.rethrow($CLV_t2$);}finally{__CLR4_4_124rg24rglb90pdzp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.MultivariateFunctionPenaltyAdapterTest.testHalfBounded",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vl3rcv24sc(){try{__CLR4_4_124rg24rglb90pdzp.R.inc(99516);

        __CLR4_4_124rg24rglb90pdzp.R.inc(99517);final BiQuadratic biQuadratic = new BiQuadratic(4.0, 4.0,
                                                        1.0, Double.POSITIVE_INFINITY,
                                                        Double.NEGATIVE_INFINITY, 3.0);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99518);final MultivariateFunctionPenaltyAdapter wrapped =
                new MultivariateFunctionPenaltyAdapter(biQuadratic,
                                                           biQuadratic.getLower(),
                                                           biQuadratic.getUpper(),
                                                           1000.0, new double[] { 100.0, 100.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99519);SimplexOptimizer optimizer = new SimplexOptimizer(new SimplePointChecker<PointValuePair>(1.0e-10, 1.0e-20));
        __CLR4_4_124rg24rglb90pdzp.R.inc(99520);optimizer.setSimplex(new NelderMeadSimplex(new double[] { 1.0, 0.5 }));

        __CLR4_4_124rg24rglb90pdzp.R.inc(99521);final PointValuePair optimum
            = optimizer.optimize(400, wrapped, GoalType.MINIMIZE, new double[] { -1.5, 4.0 });

        __CLR4_4_124rg24rglb90pdzp.R.inc(99522);Assert.assertEquals(biQuadratic.getBoundedXOptimum(), optimum.getPoint()[0], 2e-7);
        __CLR4_4_124rg24rglb90pdzp.R.inc(99523);Assert.assertEquals(biQuadratic.getBoundedYOptimum(), optimum.getPoint()[1], 2e-7);

    }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

    private static class BiQuadratic implements MultivariateFunction {

        private final double xOptimum;
        private final double yOptimum;

        private final double xMin;
        private final double xMax;
        private final double yMin;
        private final double yMax;

        public BiQuadratic(final double xOptimum, final double yOptimum,
                           final double xMin, final double xMax,
                           final double yMin, final double yMax) {try{__CLR4_4_124rg24rglb90pdzp.R.inc(99524);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99525);this.xOptimum = xOptimum;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99526);this.yOptimum = yOptimum;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99527);this.xMin     = xMin;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99528);this.xMax     = xMax;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99529);this.yMin     = yMin;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99530);this.yMax     = yMax;
        }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

        public double value(double[] point) {try{__CLR4_4_124rg24rglb90pdzp.R.inc(99531);

            // the function should never be called with out of range points
            __CLR4_4_124rg24rglb90pdzp.R.inc(99532);Assert.assertTrue(point[0] >= xMin);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99533);Assert.assertTrue(point[0] <= xMax);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99534);Assert.assertTrue(point[1] >= yMin);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99535);Assert.assertTrue(point[1] <= yMax);

            __CLR4_4_124rg24rglb90pdzp.R.inc(99536);final double dx = point[0] - xOptimum;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99537);final double dy = point[1] - yOptimum;
            __CLR4_4_124rg24rglb90pdzp.R.inc(99538);return dx * dx + dy * dy;

        }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

        public double[] getLower() {try{__CLR4_4_124rg24rglb90pdzp.R.inc(99539);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99540);return new double[] { xMin, yMin };
        }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

        public double[] getUpper() {try{__CLR4_4_124rg24rglb90pdzp.R.inc(99541);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99542);return new double[] { xMax, yMax };
        }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

        public double getBoundedXOptimum() {try{__CLR4_4_124rg24rglb90pdzp.R.inc(99543);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99544);return ((((xOptimum < xMin) )&&(__CLR4_4_124rg24rglb90pdzp.R.iget(99545)!=0|true))||(__CLR4_4_124rg24rglb90pdzp.R.iget(99546)==0&false))? xMin : (((((xOptimum > xMax) )&&(__CLR4_4_124rg24rglb90pdzp.R.iget(99547)!=0|true))||(__CLR4_4_124rg24rglb90pdzp.R.iget(99548)==0&false))? xMax : xOptimum);
        }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

        public double getBoundedYOptimum() {try{__CLR4_4_124rg24rglb90pdzp.R.inc(99549);
            __CLR4_4_124rg24rglb90pdzp.R.inc(99550);return ((((yOptimum < yMin) )&&(__CLR4_4_124rg24rglb90pdzp.R.iget(99551)!=0|true))||(__CLR4_4_124rg24rglb90pdzp.R.iget(99552)==0&false))? yMin : (((((yOptimum > yMax) )&&(__CLR4_4_124rg24rglb90pdzp.R.iget(99553)!=0|true))||(__CLR4_4_124rg24rglb90pdzp.R.iget(99554)==0&false))? yMax : yOptimum);
        }finally{__CLR4_4_124rg24rglb90pdzp.R.flushNeeded();}}

    }

}
