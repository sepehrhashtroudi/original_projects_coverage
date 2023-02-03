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
package org.apache.commons.math3.optim.linear;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.util.Precision;
import org.junit.Test;
import org.junit.Assert;

@java.lang.SuppressWarnings({"fallthrough"}) public class SimplexSolverTest {static class __CLR4_4_120yd20ydlb90pdr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95099,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MaxIter DEFAULT_MAX_ITER = new MaxIter(100);

    @Test
    public void testMath828() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176ggqd20yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176ggqd20yd(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94549);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94550);LinearObjectiveFunction f = new LinearObjectiveFunction(
                new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 0.0);
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94551);ArrayList <LinearConstraint>constraints = new ArrayList<LinearConstraint>();

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94552);constraints.add(new LinearConstraint(new double[] {0.0, 39.0, 23.0, 96.0, 15.0, 48.0, 9.0, 21.0, 48.0, 36.0, 76.0, 19.0, 88.0, 17.0, 16.0, 36.0,}, Relationship.GEQ, 15.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94553);constraints.add(new LinearConstraint(new double[] {0.0, 59.0, 93.0, 12.0, 29.0, 78.0, 73.0, 87.0, 32.0, 70.0, 68.0, 24.0, 11.0, 26.0, 65.0, 25.0,}, Relationship.GEQ, 29.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94554);constraints.add(new LinearConstraint(new double[] {0.0, 74.0, 5.0, 82.0, 6.0, 97.0, 55.0, 44.0, 52.0, 54.0, 5.0, 93.0, 91.0, 8.0, 20.0, 97.0,}, Relationship.GEQ, 6.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94555);constraints.add(new LinearConstraint(new double[] {8.0, -3.0, -28.0, -72.0, -8.0, -31.0, -31.0, -74.0, -47.0, -59.0, -24.0, -57.0, -56.0, -16.0, -92.0, -59.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94556);constraints.add(new LinearConstraint(new double[] {25.0, -7.0, -99.0, -78.0, -25.0, -14.0, -16.0, -89.0, -39.0, -56.0, -53.0, -9.0, -18.0, -26.0, -11.0, -61.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94557);constraints.add(new LinearConstraint(new double[] {33.0, -95.0, -15.0, -4.0, -33.0, -3.0, -20.0, -96.0, -27.0, -13.0, -80.0, -24.0, -3.0, -13.0, -57.0, -76.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94558);constraints.add(new LinearConstraint(new double[] {7.0, -95.0, -39.0, -93.0, -7.0, -94.0, -94.0, -62.0, -76.0, -26.0, -53.0, -57.0, -31.0, -76.0, -53.0, -52.0,}, Relationship.GEQ, 0.0));
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94559);double epsilon = 1e-6;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94560);PointValuePair solution = new SimplexSolver().optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                               GoalType.MINIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94561);Assert.assertEquals(1.0d, solution.getValue(), epsilon);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94562);Assert.assertTrue(validSolution(solution, constraints, epsilon));
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath828Cycle() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s58iev20yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath828Cycle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s58iev20yr(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94563);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94564);LinearObjectiveFunction f = new LinearObjectiveFunction(
                new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 0.0);
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94565);ArrayList <LinearConstraint>constraints = new ArrayList<LinearConstraint>();

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94566);constraints.add(new LinearConstraint(new double[] {0.0, 16.0, 14.0, 69.0, 1.0, 85.0, 52.0, 43.0, 64.0, 97.0, 14.0, 74.0, 89.0, 28.0, 94.0, 58.0, 13.0, 22.0, 21.0, 17.0, 30.0, 25.0, 1.0, 59.0, 91.0, 78.0, 12.0, 74.0, 56.0, 3.0, 88.0,}, Relationship.GEQ, 91.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94567);constraints.add(new LinearConstraint(new double[] {0.0, 60.0, 40.0, 81.0, 71.0, 72.0, 46.0, 45.0, 38.0, 48.0, 40.0, 17.0, 33.0, 85.0, 64.0, 32.0, 84.0, 3.0, 54.0, 44.0, 71.0, 67.0, 90.0, 95.0, 54.0, 99.0, 99.0, 29.0, 52.0, 98.0, 9.0,}, Relationship.GEQ, 54.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94568);constraints.add(new LinearConstraint(new double[] {0.0, 41.0, 12.0, 86.0, 90.0, 61.0, 31.0, 41.0, 23.0, 89.0, 17.0, 74.0, 44.0, 27.0, 16.0, 47.0, 80.0, 32.0, 11.0, 56.0, 68.0, 82.0, 11.0, 62.0, 62.0, 53.0, 39.0, 16.0, 48.0, 1.0, 63.0,}, Relationship.GEQ, 62.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94569);constraints.add(new LinearConstraint(new double[] {83.0, -76.0, -94.0, -19.0, -15.0, -70.0, -72.0, -57.0, -63.0, -65.0, -22.0, -94.0, -22.0, -88.0, -86.0, -89.0, -72.0, -16.0, -80.0, -49.0, -70.0, -93.0, -95.0, -17.0, -83.0, -97.0, -31.0, -47.0, -31.0, -13.0, -23.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94570);constraints.add(new LinearConstraint(new double[] {41.0, -96.0, -41.0, -48.0, -70.0, -43.0, -43.0, -43.0, -97.0, -37.0, -85.0, -70.0, -45.0, -67.0, -87.0, -69.0, -94.0, -54.0, -54.0, -92.0, -79.0, -10.0, -35.0, -20.0, -41.0, -41.0, -65.0, -25.0, -12.0, -8.0, -46.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94571);constraints.add(new LinearConstraint(new double[] {27.0, -42.0, -65.0, -49.0, -53.0, -42.0, -17.0, -2.0, -61.0, -31.0, -76.0, -47.0, -8.0, -93.0, -86.0, -62.0, -65.0, -63.0, -22.0, -43.0, -27.0, -23.0, -32.0, -74.0, -27.0, -63.0, -47.0, -78.0, -29.0, -95.0, -73.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94572);constraints.add(new LinearConstraint(new double[] {15.0, -46.0, -41.0, -83.0, -98.0, -99.0, -21.0, -35.0, -7.0, -14.0, -80.0, -63.0, -18.0, -42.0, -5.0, -34.0, -56.0, -70.0, -16.0, -18.0, -74.0, -61.0, -47.0, -41.0, -15.0, -79.0, -18.0, -47.0, -88.0, -68.0, -55.0,}, Relationship.GEQ, 0.0));
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94573);double epsilon = 1e-6;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94574);PointValuePair solution = new SimplexSolver().optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                               GoalType.MINIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94575);Assert.assertEquals(1.0d, solution.getValue(), epsilon);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94576);Assert.assertTrue(validSolution(solution, constraints, epsilon));        
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath781() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gbrwd20z5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath781",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gbrwd20z5(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94577);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94578);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 6, 7 }, 0);

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94579);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94580);constraints.add(new LinearConstraint(new double[] { 1, 2, 1 }, Relationship.LEQ, 2));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94581);constraints.add(new LinearConstraint(new double[] { -1, 1, 1 }, Relationship.LEQ, -1));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94582);constraints.add(new LinearConstraint(new double[] { 2, -3, 1 }, Relationship.LEQ, -1));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94583);double epsilon = 1e-6;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94584);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94585);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(false));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94586);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0], 0.0d, epsilon) > 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94587);Assert.assertTrue(Precision.compareTo(solution.getPoint()[1], 0.0d, epsilon) > 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94588);Assert.assertTrue(Precision.compareTo(solution.getPoint()[2], 0.0d, epsilon) < 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94589);Assert.assertEquals(2.0d, solution.getValue(), epsilon);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath713NegativeVariable() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x5t5j20zi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath713NegativeVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x5t5j20zi(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94590);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94591);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1.0, 1.0}, 0.0d);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94592);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94593);constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.EQ, 1));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94594);double epsilon = 1e-6;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94595);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94596);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(true));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94597);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0], 0.0d, epsilon) >= 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94598);Assert.assertTrue(Precision.compareTo(solution.getPoint()[1], 0.0d, epsilon) >= 0);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath434NegativeVariable() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzrvwz20zr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath434NegativeVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzrvwz20zr(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94599);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94600);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0.0, 0.0, 1.0}, 0.0d);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94601);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94602);constraints.add(new LinearConstraint(new double[] {1, 1, 0}, Relationship.EQ, 5));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94603);constraints.add(new LinearConstraint(new double[] {0, 0, 1}, Relationship.GEQ, -10));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94604);double epsilon = 1e-6;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94605);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94606);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(false));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94607);Assert.assertEquals(5.0, solution.getPoint()[0] + solution.getPoint()[1], epsilon);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94608);Assert.assertEquals(-10.0, solution.getPoint()[2], epsilon);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94609);Assert.assertEquals(-10.0, solution.getValue(), epsilon);

    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test(expected = NoFeasibleSolutionException.class)
    public void testMath434UnfeasibleSolution() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yltto72102();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,52,51,52,85,110,102,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,58,32,91,78,111,70,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoFeasibleSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath434UnfeasibleSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yltto72102(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94610);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94611);double epsilon = 1e-6;

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94612);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1.0, 0.0}, 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94613);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94614);constraints.add(new LinearConstraint(new double[] {epsilon/2, 0.5}, Relationship.EQ, 0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94615);constraints.add(new LinearConstraint(new double[] {1e-3, 0.1}, Relationship.EQ, 10));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94616);SimplexSolver solver = new SimplexSolver();
        // allowing only non-negative values, no feasible solution shall be found
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94617);solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                        GoalType.MINIMIZE, new NonNegativeConstraint(true));
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath434PivotRowSelection() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185wr9c210a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath434PivotRowSelection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185wr9c210a(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94618);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94619);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1.0}, 0.0);

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94620);double epsilon = 1e-6;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94621);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94622);constraints.add(new LinearConstraint(new double[] {200}, Relationship.GEQ, 1));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94623);constraints.add(new LinearConstraint(new double[] {100}, Relationship.GEQ, 0.499900001));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94624);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94625);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(false));
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94626);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0] * 200.d, 1.d, epsilon) >= 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94627);Assert.assertEquals(0.0050, solution.getValue(), epsilon);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath434PivotRowSelection2() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12skxi8210k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath434PivotRowSelection2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12skxi8210k(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94628);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94629);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0.0d, 1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d}, 0.0d);

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94630);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94631);constraints.add(new LinearConstraint(new double[] {1.0d, -0.1d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, Relationship.EQ, -0.1d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94632);constraints.add(new LinearConstraint(new double[] {1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, -1e-18d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94633);constraints.add(new LinearConstraint(new double[] {0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94634);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 0.0d, 1.0d, 0.0d, -0.0128588d, 1e-5d}, Relationship.EQ, 0.0d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94635);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 1e-5d, -0.0128586d}, Relationship.EQ, 1e-10d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94636);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94637);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, 1.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94638);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, 0.0d, -1.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94639);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, 0.0d, 1.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94640);double epsilon = 1e-7;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94641);SimplexSolver simplex = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94642);PointValuePair solution = simplex.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                   GoalType.MINIMIZE, new NonNegativeConstraint(false));
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94643);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0], -1e-18d, epsilon) >= 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94644);Assert.assertEquals(1.0d, solution.getPoint()[1], epsilon);        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94645);Assert.assertEquals(0.0d, solution.getPoint()[2], epsilon);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94646);Assert.assertEquals(1.0d, solution.getValue(), epsilon);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}
    
    @Test
    public void testMath272() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c9pja2113();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c9pja2113(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94647);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94648);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 2, 1 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94649);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94650);constraints.add(new LinearConstraint(new double[] { 1, 1, 0 }, Relationship.GEQ,  1));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94651);constraints.add(new LinearConstraint(new double[] { 1, 0, 1 }, Relationship.GEQ,  1));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94652);constraints.add(new LinearConstraint(new double[] { 0, 1, 0 }, Relationship.GEQ,  1));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94653);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94654);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(true));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94655);Assert.assertEquals(0.0, solution.getPoint()[0], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94656);Assert.assertEquals(1.0, solution.getPoint()[1], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94657);Assert.assertEquals(1.0, solution.getPoint()[2], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94658);Assert.assertEquals(3.0, solution.getValue(), .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath286() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdl265211f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdl265211f(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94659);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94660);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0.8, 0.2, 0.7, 0.3, 0.6, 0.4 }, 0 );
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94661);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94662);constraints.add(new LinearConstraint(new double[] { 1, 0, 1, 0, 1, 0 }, Relationship.EQ, 23.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94663);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 1, 0, 1 }, Relationship.EQ, 23.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94664);constraints.add(new LinearConstraint(new double[] { 1, 0, 0, 0, 0, 0 }, Relationship.GEQ, 10.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94665);constraints.add(new LinearConstraint(new double[] { 0, 0, 1, 0, 0, 0 }, Relationship.GEQ, 8.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94666);constraints.add(new LinearConstraint(new double[] { 0, 0, 0, 0, 1, 0 }, Relationship.GEQ, 5.0));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94667);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94668);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(true));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94669);Assert.assertEquals(25.8, solution.getValue(), .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94670);Assert.assertEquals(23.0, solution.getPoint()[0] + solution.getPoint()[2] + solution.getPoint()[4], 0.0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94671);Assert.assertEquals(23.0, solution.getPoint()[1] + solution.getPoint()[3] + solution.getPoint()[5], 0.0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94672);Assert.assertTrue(solution.getPoint()[0] >= 10.0 - 0.0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94673);Assert.assertTrue(solution.getPoint()[2] >= 8.0 - 0.0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94674);Assert.assertTrue(solution.getPoint()[4] >= 5.0 - 0.0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testDegeneracy() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8ayfo211v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testDegeneracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8ayfo211v(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94675);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94676);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0.8, 0.7 }, 0 );
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94677);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94678);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 18.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94679);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 10.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94680);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 8.0));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94681);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94682);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94683);Assert.assertEquals(13.6, solution.getValue(), .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath288() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5j2812124();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5j2812124(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94684);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94685);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 7, 3, 0, 0 }, 0 );
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94686);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94687);constraints.add(new LinearConstraint(new double[] { 3, 0, -5, 0 }, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94688);constraints.add(new LinearConstraint(new double[] { 2, 0, 0, -5 }, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94689);constraints.add(new LinearConstraint(new double[] { 0, 3, 0, -5 }, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94690);constraints.add(new LinearConstraint(new double[] { 1, 0, 0, 0 }, Relationship.LEQ, 1.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94691);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 0 }, Relationship.LEQ, 1.0));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94692);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94693);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94694);Assert.assertEquals(10.0, solution.getValue(), .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath290GEQ() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8n3d7212f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath290GEQ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8n3d7212f(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94695);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94696);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 5 }, 0 );
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94697);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94698);constraints.add(new LinearConstraint(new double[] { 2, 0 }, Relationship.GEQ, -1.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94699);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94700);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94701);Assert.assertEquals(0, solution.getValue(), .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94702);Assert.assertEquals(0, solution.getPoint()[0], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94703);Assert.assertEquals(0, solution.getPoint()[1], .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test(expected=NoFeasibleSolutionException.class)
    public void testMath290LEQ() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kdn1s212o();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,50,57,48,76,69,81,58,32,91,78,111,70,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoFeasibleSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath290LEQ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kdn1s212o(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94704);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94705);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 5 }, 0 );
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94706);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94707);constraints.add(new LinearConstraint(new double[] { 2, 0 }, Relationship.LEQ, -1.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94708);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94709);solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                        GoalType.MINIMIZE, new NonNegativeConstraint(true));
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath293() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fonzmv212u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fonzmv212u(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94710);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94711);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0.8, 0.2, 0.7, 0.3, 0.4, 0.6}, 0 );
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94712);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94713);constraints.add(new LinearConstraint(new double[] { 1, 0, 1, 0, 1, 0 }, Relationship.EQ, 30.0));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94714);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 1, 0, 1 }, Relationship.EQ, 30.0));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94715);constraints.add(new LinearConstraint(new double[] { 0.8, 0.2, 0.0, 0.0, 0.0, 0.0 }, Relationship.GEQ, 10.0));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94716);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.7, 0.3, 0.0, 0.0 }, Relationship.GEQ, 10.0));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94717);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.4, 0.6 }, Relationship.GEQ, 10.0));

      __CLR4_4_120yd20ydlb90pdr6.R.inc(94718);SimplexSolver solver = new SimplexSolver();
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94719);PointValuePair solution1 = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                 GoalType.MAXIMIZE, new NonNegativeConstraint(true));

      __CLR4_4_120yd20ydlb90pdr6.R.inc(94720);Assert.assertEquals(15.7143, solution1.getPoint()[0], .0001);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94721);Assert.assertEquals(0.0, solution1.getPoint()[1], .0001);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94722);Assert.assertEquals(14.2857, solution1.getPoint()[2], .0001);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94723);Assert.assertEquals(0.0, solution1.getPoint()[3], .0001);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94724);Assert.assertEquals(0.0, solution1.getPoint()[4], .0001);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94725);Assert.assertEquals(30.0, solution1.getPoint()[5], .0001);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94726);Assert.assertEquals(40.57143, solution1.getValue(), .0001);

      __CLR4_4_120yd20ydlb90pdr6.R.inc(94727);double valA = 0.8 * solution1.getPoint()[0] + 0.2 * solution1.getPoint()[1];
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94728);double valB = 0.7 * solution1.getPoint()[2] + 0.3 * solution1.getPoint()[3];
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94729);double valC = 0.4 * solution1.getPoint()[4] + 0.6 * solution1.getPoint()[5];

      __CLR4_4_120yd20ydlb90pdr6.R.inc(94730);f = new LinearObjectiveFunction(new double[] { 0.8, 0.2, 0.7, 0.3, 0.4, 0.6}, 0 );
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94731);constraints = new ArrayList<LinearConstraint>();
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94732);constraints.add(new LinearConstraint(new double[] { 1, 0, 1, 0, 1, 0 }, Relationship.EQ, 30.0));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94733);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 1, 0, 1 }, Relationship.EQ, 30.0));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94734);constraints.add(new LinearConstraint(new double[] { 0.8, 0.2, 0.0, 0.0, 0.0, 0.0 }, Relationship.GEQ, valA));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94735);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.7, 0.3, 0.0, 0.0 }, Relationship.GEQ, valB));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94736);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.4, 0.6 }, Relationship.GEQ, valC));

      __CLR4_4_120yd20ydlb90pdr6.R.inc(94737);PointValuePair solution2 = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                 GoalType.MAXIMIZE, new NonNegativeConstraint(true));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94738);Assert.assertEquals(40.57143, solution2.getValue(), .0001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMath930() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lfzdp213n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMath930",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lfzdp213n(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94739);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94740);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94741);constraints.add(new LinearConstraint(new double[] {1, -1, -1, 1, -1, 1, 1, -1, -1, 1, 1, -1, 1, -1, -1, 1, -1, 1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94742);constraints.add(new LinearConstraint(new double[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94743);constraints.add(new LinearConstraint(new double[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94744);constraints.add(new LinearConstraint(new double[] {0, 1, 0, -1, 0, -1, 0, 1, 0, -1, 0, 1, 0, 1, 0, -1, 0, -1, 0, 1, 0, 1, 0, -1, 0, 1, 0, -1, 0, -1, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94745);constraints.add(new LinearConstraint(new double[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.628803}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94746);constraints.add(new LinearConstraint(new double[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.676993}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94747);constraints.add(new LinearConstraint(new double[] {0, 0, 1, -1, 0, 0, -1, 1, 0, 0, -1, 1, 0, 0, 1, -1, 0, 0, -1, 1, 0, 0, 1, -1, 0, 0, 1, -1, 0, 0, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94748);constraints.add(new LinearConstraint(new double[] {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.136677}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94749);constraints.add(new LinearConstraint(new double[] {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.444434}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94750);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94751);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.254028}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94752);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.302218}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94753);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 1, -1, -1, 1, 0, 0, 0, 0, -1, 1, 1, -1, 0, 0, 0, 0, -1, 1, 1, -1, 0, 0, 0, 0, 1, -1, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94754);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.653981}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94755);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.690437}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94756);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 1, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94757);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.423786}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94758);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.486717}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94759);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94760);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.049232}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94761);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.304747}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94762);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94763);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.129826}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94764);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.205625}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94765);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 1, -1, 1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 1, -1, 1, -1, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94766);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.621944}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94767);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.764385}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94768);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 1, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94769);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.432572}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94770);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.480762}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94771);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0, 0, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94772);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.055983}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94773);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.11378}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94774);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94775);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.009607}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94776);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.057797}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94777);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94778);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.407308}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94779);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.452749}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94780);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94781);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.269677}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94782);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.321806}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94783);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94784);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.049232}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94785);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.06902}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94786);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94787);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94788);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.028754}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94789);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 1, -1, 1, 1, -1, -1, 1, 1, -1, 1, -1, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94790);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.484254}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94791);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.524607}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94792);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, -1, 0, 1, 0, 1, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94793);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.385492}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94794);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.430134}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94795);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, -1, 1, 0, 0, -1, 1, 0, 0, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94796);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.34983}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94797);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.375781}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94798);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94799);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.254028}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94800);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.281308}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94801);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 1, 0, 0, 0, 0, -1, 1, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94802);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.304995}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94803);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.345347}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94804);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94805);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.288899}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94806);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.332212}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94807);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 0, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94808);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.14351}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94809);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.17057}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94810);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94811);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.129826}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94812);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -0.157435}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94813);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 1, -1, 1, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94814);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94815);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94816);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94817);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -0.141071}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94818);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -0.232574}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94819);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 0, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94820);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94821);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94822);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94823);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, -0.009607}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94824);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, -0.057797}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94825);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94826);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94827);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94828);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94829);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -0.091644}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94830);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -0.203531}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94831);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94832);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94833);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94834);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94835);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, Relationship.GEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94836);constraints.add(new LinearConstraint(new double[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -0.028754}, Relationship.LEQ, 0.0));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94837);constraints.add(new LinearConstraint(new double[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, Relationship.EQ, 1.0));
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94838);double[] objFunctionCoeff = new double[33];
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94839);objFunctionCoeff[3] = 1;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94840);LinearObjectiveFunction f = new LinearObjectiveFunction(objFunctionCoeff, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94841);SimplexSolver solver = new SimplexSolver(1e-4, 10, 1e-6);
        
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94842);PointValuePair solution = solver.optimize(new MaxIter(1000), f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94843);Assert.assertEquals(0.3752298, solution.getValue(), 1e-4);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testSimplexSolver() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilxy6q216k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testSimplexSolver",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilxy6q216k(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94844);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94845);LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[] { 15, 10 }, 7);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94846);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94847);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94848);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94849);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94850);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94851);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94852);Assert.assertEquals(2.0, solution.getPoint()[0], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94853);Assert.assertEquals(2.0, solution.getPoint()[1], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94854);Assert.assertEquals(57.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testSingleVariableAndConstraint() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7cmcl216v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testSingleVariableAndConstraint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7cmcl216v(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94855);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94856);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94857);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94858);constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 10));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94859);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94860);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(false));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94861);Assert.assertEquals(10.0, solution.getPoint()[0], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94862);Assert.assertEquals(30.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    /**
     * With no artificial variables needed (no equals and no greater than
     * constraints) we can go straight to Phase 2.
     */
    @Test
    public void testModelWithNoArtificialVars() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqy1qt2173();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testModelWithNoArtificialVars",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqy1qt2173(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94863);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94864);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15, 10 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94865);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94866);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94867);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94868);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94869);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94870);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(false));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94871);Assert.assertEquals(2.0, solution.getPoint()[0], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94872);Assert.assertEquals(2.0, solution.getPoint()[1], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94873);Assert.assertEquals(50.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testMinimization() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gncwnt217e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testMinimization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gncwnt217e(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94874);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94875);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, -5);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94876);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94877);constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 6));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94878);constraints.add(new LinearConstraint(new double[] { 3, 2 }, Relationship.LEQ, 12));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94879);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94880);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94881);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(false));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94882);Assert.assertEquals(4.0, solution.getPoint()[0], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94883);Assert.assertEquals(0.0, solution.getPoint()[1], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94884);Assert.assertEquals(-13.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testSolutionWithNegativeDecisionVariable() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d34e3217p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testSolutionWithNegativeDecisionVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d34e3217p(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94885);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94886);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94887);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94888);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 6));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94889);constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 14));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94890);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94891);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(false));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94892);Assert.assertEquals(-2.0, solution.getPoint()[0], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94893);Assert.assertEquals(8.0, solution.getPoint()[1], 0.0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94894);Assert.assertEquals(12.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test(expected = NoFeasibleSolutionException.class)
    public void testInfeasibleSolution() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfuhy217z();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,102,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,58,32,91,78,111,70,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoFeasibleSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testInfeasibleSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94895,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfuhy217z(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94895);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94896);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94897);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94898);constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 1));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94899);constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.GEQ, 3));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94900);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94901);solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                        GoalType.MAXIMIZE, new NonNegativeConstraint(false));
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedSolution() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzpa7m2186();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,98,111,117,110,100,101,100,83,111,108,117,116,105,111,110,58,32,91,85,110,98,111,117,110,100,101,100,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnboundedSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testUnboundedSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzpa7m2186(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94902);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94903);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15, 10 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94904);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94905);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 2));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94906);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94907);solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                        GoalType.MAXIMIZE, new NonNegativeConstraint(false));
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testRestrictVariablesToNonNegative() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8ntad218c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testRestrictVariablesToNonNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8ntad218c(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94908);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94909);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 409, 523, 70, 204, 339 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94910);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94911);constraints.add(new LinearConstraint(new double[] {    43,   56, 345,  56,    5 }, Relationship.LEQ,  4567456));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94912);constraints.add(new LinearConstraint(new double[] {    12,   45,   7,  56,   23 }, Relationship.LEQ,    56454));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94913);constraints.add(new LinearConstraint(new double[] {     8,  768,   0,  34, 7456 }, Relationship.LEQ,  1923421));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94914);constraints.add(new LinearConstraint(new double[] { 12342, 2342,  34, 678, 2342 }, Relationship.GEQ,     4356));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94915);constraints.add(new LinearConstraint(new double[] {    45,  678,  76,  52,   23 }, Relationship.EQ,    456356));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94916);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94917);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94918);Assert.assertEquals(2902.92783505155, solution.getPoint()[0], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94919);Assert.assertEquals(480.419243986254, solution.getPoint()[1], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94920);Assert.assertEquals(0.0, solution.getPoint()[2], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94921);Assert.assertEquals(0.0, solution.getPoint()[3], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94922);Assert.assertEquals(0.0, solution.getPoint()[4], .0000001);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94923);Assert.assertEquals(1438556.7491409, solution.getValue(), .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testEpsilon() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gxghr218s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testEpsilon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gxghr218s(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94924);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94925);LinearObjectiveFunction f =
          new LinearObjectiveFunction(new double[] { 10, 5, 1 }, 0);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94926);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94927);constraints.add(new LinearConstraint(new double[] {  9, 8, 0 }, Relationship.EQ,  17));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94928);constraints.add(new LinearConstraint(new double[] {  0, 7, 8 }, Relationship.LEQ,  7));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94929);constraints.add(new LinearConstraint(new double[] { 10, 0, 2 }, Relationship.LEQ, 10));

      __CLR4_4_120yd20ydlb90pdr6.R.inc(94930);SimplexSolver solver = new SimplexSolver();
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94931);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                GoalType.MAXIMIZE, new NonNegativeConstraint(false));
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94932);Assert.assertEquals(1.0, solution.getPoint()[0], 0.0);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94933);Assert.assertEquals(1.0, solution.getPoint()[1], 0.0);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94934);Assert.assertEquals(0.0, solution.getPoint()[2], 0.0);
      __CLR4_4_120yd20ydlb90pdr6.R.inc(94935);Assert.assertEquals(15.0, solution.getValue(), 0.0);
  }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testTrivialModel() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7zkkn2194();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testTrivialModel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7zkkn2194(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94936);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94937);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94938);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94939);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ,  0));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94940);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94941);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MAXIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94942);Assert.assertEquals(0, solution.getValue(), .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    @Test
    public void testLargeModel() {__CLR4_4_120yd20ydlb90pdr6.R.globalSliceStart(getClass().getName(),94943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pde07219b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120yd20ydlb90pdr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_120yd20ydlb90pdr6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexSolverTest.testLargeModel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94943,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pde07219b(){try{__CLR4_4_120yd20ydlb90pdr6.R.inc(94943);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94944);double[] objective = new double[] {
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 12, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           12, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 12, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 12, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 12, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 12, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                                           1, 1, 1, 1, 1, 1};

        __CLR4_4_120yd20ydlb90pdr6.R.inc(94945);LinearObjectiveFunction f = new LinearObjectiveFunction(objective, 0);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94946);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94947);constraints.add(equationFromString(objective.length, "x0 + x1 + x2 + x3 - x12 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94948);constraints.add(equationFromString(objective.length, "x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 - x13 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94949);constraints.add(equationFromString(objective.length, "x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 >= 49"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94950);constraints.add(equationFromString(objective.length, "x0 + x1 + x2 + x3 >= 42"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94951);constraints.add(equationFromString(objective.length, "x14 + x15 + x16 + x17 - x26 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94952);constraints.add(equationFromString(objective.length, "x18 + x19 + x20 + x21 + x22 + x23 + x24 + x25 - x27 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94953);constraints.add(equationFromString(objective.length, "x14 + x15 + x16 + x17 - x12 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94954);constraints.add(equationFromString(objective.length, "x18 + x19 + x20 + x21 + x22 + x23 + x24 + x25 - x13 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94955);constraints.add(equationFromString(objective.length, "x28 + x29 + x30 + x31 - x40 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94956);constraints.add(equationFromString(objective.length, "x32 + x33 + x34 + x35 + x36 + x37 + x38 + x39 - x41 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94957);constraints.add(equationFromString(objective.length, "x32 + x33 + x34 + x35 + x36 + x37 + x38 + x39 >= 49"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94958);constraints.add(equationFromString(objective.length, "x28 + x29 + x30 + x31 >= 42"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94959);constraints.add(equationFromString(objective.length, "x42 + x43 + x44 + x45 - x54 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94960);constraints.add(equationFromString(objective.length, "x46 + x47 + x48 + x49 + x50 + x51 + x52 + x53 - x55 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94961);constraints.add(equationFromString(objective.length, "x42 + x43 + x44 + x45 - x40 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94962);constraints.add(equationFromString(objective.length, "x46 + x47 + x48 + x49 + x50 + x51 + x52 + x53 - x41 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94963);constraints.add(equationFromString(objective.length, "x56 + x57 + x58 + x59 - x68 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94964);constraints.add(equationFromString(objective.length, "x60 + x61 + x62 + x63 + x64 + x65 + x66 + x67 - x69 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94965);constraints.add(equationFromString(objective.length, "x60 + x61 + x62 + x63 + x64 + x65 + x66 + x67 >= 51"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94966);constraints.add(equationFromString(objective.length, "x56 + x57 + x58 + x59 >= 44"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94967);constraints.add(equationFromString(objective.length, "x70 + x71 + x72 + x73 - x82 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94968);constraints.add(equationFromString(objective.length, "x74 + x75 + x76 + x77 + x78 + x79 + x80 + x81 - x83 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94969);constraints.add(equationFromString(objective.length, "x70 + x71 + x72 + x73 - x68 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94970);constraints.add(equationFromString(objective.length, "x74 + x75 + x76 + x77 + x78 + x79 + x80 + x81 - x69 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94971);constraints.add(equationFromString(objective.length, "x84 + x85 + x86 + x87 - x96 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94972);constraints.add(equationFromString(objective.length, "x88 + x89 + x90 + x91 + x92 + x93 + x94 + x95 - x97 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94973);constraints.add(equationFromString(objective.length, "x88 + x89 + x90 + x91 + x92 + x93 + x94 + x95 >= 51"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94974);constraints.add(equationFromString(objective.length, "x84 + x85 + x86 + x87 >= 44"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94975);constraints.add(equationFromString(objective.length, "x98 + x99 + x100 + x101 - x110 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94976);constraints.add(equationFromString(objective.length, "x102 + x103 + x104 + x105 + x106 + x107 + x108 + x109 - x111 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94977);constraints.add(equationFromString(objective.length, "x98 + x99 + x100 + x101 - x96 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94978);constraints.add(equationFromString(objective.length, "x102 + x103 + x104 + x105 + x106 + x107 + x108 + x109 - x97 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94979);constraints.add(equationFromString(objective.length, "x112 + x113 + x114 + x115 - x124 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94980);constraints.add(equationFromString(objective.length, "x116 + x117 + x118 + x119 + x120 + x121 + x122 + x123 - x125 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94981);constraints.add(equationFromString(objective.length, "x116 + x117 + x118 + x119 + x120 + x121 + x122 + x123 >= 49"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94982);constraints.add(equationFromString(objective.length, "x112 + x113 + x114 + x115 >= 42"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94983);constraints.add(equationFromString(objective.length, "x126 + x127 + x128 + x129 - x138 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94984);constraints.add(equationFromString(objective.length, "x130 + x131 + x132 + x133 + x134 + x135 + x136 + x137 - x139 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94985);constraints.add(equationFromString(objective.length, "x126 + x127 + x128 + x129 - x124 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94986);constraints.add(equationFromString(objective.length, "x130 + x131 + x132 + x133 + x134 + x135 + x136 + x137 - x125 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94987);constraints.add(equationFromString(objective.length, "x140 + x141 + x142 + x143 - x152 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94988);constraints.add(equationFromString(objective.length, "x144 + x145 + x146 + x147 + x148 + x149 + x150 + x151 - x153 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94989);constraints.add(equationFromString(objective.length, "x144 + x145 + x146 + x147 + x148 + x149 + x150 + x151 >= 59"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94990);constraints.add(equationFromString(objective.length, "x140 + x141 + x142 + x143 >= 42"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94991);constraints.add(equationFromString(objective.length, "x154 + x155 + x156 + x157 - x166 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94992);constraints.add(equationFromString(objective.length, "x158 + x159 + x160 + x161 + x162 + x163 + x164 + x165 - x167 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94993);constraints.add(equationFromString(objective.length, "x154 + x155 + x156 + x157 - x152 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94994);constraints.add(equationFromString(objective.length, "x158 + x159 + x160 + x161 + x162 + x163 + x164 + x165 - x153 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94995);constraints.add(equationFromString(objective.length, "x83 + x82 - x168 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94996);constraints.add(equationFromString(objective.length, "x111 + x110 - x169 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94997);constraints.add(equationFromString(objective.length, "x170 - x182 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94998);constraints.add(equationFromString(objective.length, "x171 - x183 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(94999);constraints.add(equationFromString(objective.length, "x172 - x184 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95000);constraints.add(equationFromString(objective.length, "x173 - x185 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95001);constraints.add(equationFromString(objective.length, "x174 - x186 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95002);constraints.add(equationFromString(objective.length, "x175 + x176 - x187 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95003);constraints.add(equationFromString(objective.length, "x177 - x188 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95004);constraints.add(equationFromString(objective.length, "x178 - x189 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95005);constraints.add(equationFromString(objective.length, "x179 - x190 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95006);constraints.add(equationFromString(objective.length, "x180 - x191 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95007);constraints.add(equationFromString(objective.length, "x181 - x192 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95008);constraints.add(equationFromString(objective.length, "x170 - x26 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95009);constraints.add(equationFromString(objective.length, "x171 - x27 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95010);constraints.add(equationFromString(objective.length, "x172 - x54 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95011);constraints.add(equationFromString(objective.length, "x173 - x55 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95012);constraints.add(equationFromString(objective.length, "x174 - x168 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95013);constraints.add(equationFromString(objective.length, "x177 - x169 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95014);constraints.add(equationFromString(objective.length, "x178 - x138 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95015);constraints.add(equationFromString(objective.length, "x179 - x139 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95016);constraints.add(equationFromString(objective.length, "x180 - x166 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95017);constraints.add(equationFromString(objective.length, "x181 - x167 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95018);constraints.add(equationFromString(objective.length, "x193 - x205 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95019);constraints.add(equationFromString(objective.length, "x194 - x206 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95020);constraints.add(equationFromString(objective.length, "x195 - x207 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95021);constraints.add(equationFromString(objective.length, "x196 - x208 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95022);constraints.add(equationFromString(objective.length, "x197 - x209 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95023);constraints.add(equationFromString(objective.length, "x198 + x199 - x210 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95024);constraints.add(equationFromString(objective.length, "x200 - x211 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95025);constraints.add(equationFromString(objective.length, "x201 - x212 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95026);constraints.add(equationFromString(objective.length, "x202 - x213 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95027);constraints.add(equationFromString(objective.length, "x203 - x214 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95028);constraints.add(equationFromString(objective.length, "x204 - x215 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95029);constraints.add(equationFromString(objective.length, "x193 - x182 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95030);constraints.add(equationFromString(objective.length, "x194 - x183 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95031);constraints.add(equationFromString(objective.length, "x195 - x184 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95032);constraints.add(equationFromString(objective.length, "x196 - x185 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95033);constraints.add(equationFromString(objective.length, "x197 - x186 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95034);constraints.add(equationFromString(objective.length, "x198 + x199 - x187 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95035);constraints.add(equationFromString(objective.length, "x200 - x188 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95036);constraints.add(equationFromString(objective.length, "x201 - x189 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95037);constraints.add(equationFromString(objective.length, "x202 - x190 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95038);constraints.add(equationFromString(objective.length, "x203 - x191 = 0"));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95039);constraints.add(equationFromString(objective.length, "x204 - x192 = 0"));

        __CLR4_4_120yd20ydlb90pdr6.R.inc(95040);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95041);PointValuePair solution = solver.optimize(DEFAULT_MAX_ITER, f, new LinearConstraintSet(constraints),
                                                  GoalType.MINIMIZE, new NonNegativeConstraint(true));
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95042);Assert.assertEquals(7518.0, solution.getValue(), .0000001);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    /**
     * Converts a test string to a {@link LinearConstraint}.
     * Ex: x0 + x1 + x2 + x3 - x12 = 0
     */
    private LinearConstraint equationFromString(int numCoefficients, String s) {try{__CLR4_4_120yd20ydlb90pdr6.R.inc(95043);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95044);Relationship relationship;
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95045);if ((((s.contains(">="))&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95046)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95047)==0&false))) {{
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95048);relationship = Relationship.GEQ;
        } }else {__CLR4_4_120yd20ydlb90pdr6.R.inc(95049);if ((((s.contains("<="))&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95050)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95051)==0&false))) {{
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95052);relationship = Relationship.LEQ;
        } }else {__CLR4_4_120yd20ydlb90pdr6.R.inc(95053);if ((((s.contains("="))&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95054)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95055)==0&false))) {{
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95056);relationship = Relationship.EQ;
        } }else {{
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95057);throw new IllegalArgumentException();
        }

        }}}__CLR4_4_120yd20ydlb90pdr6.R.inc(95058);String[] equationParts = s.split("[>|<]?=");
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95059);double rhs = Double.parseDouble(equationParts[1].trim());

        __CLR4_4_120yd20ydlb90pdr6.R.inc(95060);double[] lhs = new double[numCoefficients];
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95061);String left = equationParts[0].replaceAll(" ?x", "");
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95062);String[] coefficients = left.split(" ");
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95063);for (String coefficient : coefficients) {{
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95064);double value = (((coefficient.charAt(0) == '-' )&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95065)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95066)==0&false))? -1 : 1;
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95067);int index = Integer.parseInt(coefficient.replaceFirst("[+|-]", "").trim());
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95068);lhs[index] = value;
        }
        }__CLR4_4_120yd20ydlb90pdr6.R.inc(95069);return new LinearConstraint(lhs, relationship, rhs);
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}

    private static boolean validSolution(PointValuePair solution, List<LinearConstraint> constraints, double epsilon) {try{__CLR4_4_120yd20ydlb90pdr6.R.inc(95070);
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95071);double[] vals = solution.getPoint();
        __CLR4_4_120yd20ydlb90pdr6.R.inc(95072);for (LinearConstraint c : constraints) {{
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95073);double[] coeffs = c.getCoefficients().toArray();
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95074);double result = 0.0d;
            __CLR4_4_120yd20ydlb90pdr6.R.inc(95075);for (int i = 0; (((i < vals.length)&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95076)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95077)==0&false)); i++) {{
                __CLR4_4_120yd20ydlb90pdr6.R.inc(95078);result += vals[i] * coeffs[i];
            }
            
            }boolean __CLB4_4_1_bool0=false;__CLR4_4_120yd20ydlb90pdr6.R.inc(95079);switch (c.getRelationship()) {
            case EQ:if (!__CLB4_4_1_bool0) {__CLR4_4_120yd20ydlb90pdr6.R.inc(95080);__CLB4_4_1_bool0=true;}
                __CLR4_4_120yd20ydlb90pdr6.R.inc(95081);if ((((!Precision.equals(result, c.getValue(), epsilon))&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95082)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95083)==0&false))) {{
                    __CLR4_4_120yd20ydlb90pdr6.R.inc(95084);return false;
                }
                }__CLR4_4_120yd20ydlb90pdr6.R.inc(95085);break;
                
            case GEQ:if (!__CLB4_4_1_bool0) {__CLR4_4_120yd20ydlb90pdr6.R.inc(95086);__CLB4_4_1_bool0=true;}
                __CLR4_4_120yd20ydlb90pdr6.R.inc(95087);if ((((Precision.compareTo(result, c.getValue(), epsilon) < 0)&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95088)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95089)==0&false))) {{
                    __CLR4_4_120yd20ydlb90pdr6.R.inc(95090);return false;
                }
                }__CLR4_4_120yd20ydlb90pdr6.R.inc(95091);break;
                
            case LEQ:if (!__CLB4_4_1_bool0) {__CLR4_4_120yd20ydlb90pdr6.R.inc(95092);__CLB4_4_1_bool0=true;}
                __CLR4_4_120yd20ydlb90pdr6.R.inc(95093);if ((((Precision.compareTo(result, c.getValue(), epsilon) > 0)&&(__CLR4_4_120yd20ydlb90pdr6.R.iget(95094)!=0|true))||(__CLR4_4_120yd20ydlb90pdr6.R.iget(95095)==0&false))) {{
                    __CLR4_4_120yd20ydlb90pdr6.R.inc(95096);return false;
                }
                }__CLR4_4_120yd20ydlb90pdr6.R.inc(95097);break;
            }
        }
        
        }__CLR4_4_120yd20ydlb90pdr6.R.inc(95098);return true;
    }finally{__CLR4_4_120yd20ydlb90pdr6.R.flushNeeded();}}
}
