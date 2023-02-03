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

package org.apache.commons.math3.optimization.linear;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.util.Precision;
import org.junit.Test;

@java.lang.SuppressWarnings({"fallthrough"}) public class SimplexSolverTest {static class __CLR4_4_126kv26kvlb90pe5a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,102284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMath828() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_176ggqd26kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath828",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_176ggqd26kv(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101839);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101840);LinearObjectiveFunction f = new LinearObjectiveFunction(
                new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 0.0);
        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101841);ArrayList <LinearConstraint>constraints = new ArrayList<LinearConstraint>();

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101842);constraints.add(new LinearConstraint(new double[] {0.0, 39.0, 23.0, 96.0, 15.0, 48.0, 9.0, 21.0, 48.0, 36.0, 76.0, 19.0, 88.0, 17.0, 16.0, 36.0,}, Relationship.GEQ, 15.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101843);constraints.add(new LinearConstraint(new double[] {0.0, 59.0, 93.0, 12.0, 29.0, 78.0, 73.0, 87.0, 32.0, 70.0, 68.0, 24.0, 11.0, 26.0, 65.0, 25.0,}, Relationship.GEQ, 29.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101844);constraints.add(new LinearConstraint(new double[] {0.0, 74.0, 5.0, 82.0, 6.0, 97.0, 55.0, 44.0, 52.0, 54.0, 5.0, 93.0, 91.0, 8.0, 20.0, 97.0,}, Relationship.GEQ, 6.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101845);constraints.add(new LinearConstraint(new double[] {8.0, -3.0, -28.0, -72.0, -8.0, -31.0, -31.0, -74.0, -47.0, -59.0, -24.0, -57.0, -56.0, -16.0, -92.0, -59.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101846);constraints.add(new LinearConstraint(new double[] {25.0, -7.0, -99.0, -78.0, -25.0, -14.0, -16.0, -89.0, -39.0, -56.0, -53.0, -9.0, -18.0, -26.0, -11.0, -61.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101847);constraints.add(new LinearConstraint(new double[] {33.0, -95.0, -15.0, -4.0, -33.0, -3.0, -20.0, -96.0, -27.0, -13.0, -80.0, -24.0, -3.0, -13.0, -57.0, -76.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101848);constraints.add(new LinearConstraint(new double[] {7.0, -95.0, -39.0, -93.0, -7.0, -94.0, -94.0, -62.0, -76.0, -26.0, -53.0, -57.0, -31.0, -76.0, -53.0, -52.0,}, Relationship.GEQ, 0.0));
        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101849);double epsilon = 1e-6;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101850);PointValuePair solution = new SimplexSolver().optimize(f, constraints, GoalType.MINIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101851);Assert.assertEquals(1.0d, solution.getValue(), epsilon);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101852);Assert.assertTrue(validSolution(solution, constraints, epsilon));
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath828Cycle() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s58iev26l9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath828Cycle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101853,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s58iev26l9(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101853);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101854);LinearObjectiveFunction f = new LinearObjectiveFunction(
                new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, 0.0);
        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101855);ArrayList <LinearConstraint>constraints = new ArrayList<LinearConstraint>();

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101856);constraints.add(new LinearConstraint(new double[] {0.0, 16.0, 14.0, 69.0, 1.0, 85.0, 52.0, 43.0, 64.0, 97.0, 14.0, 74.0, 89.0, 28.0, 94.0, 58.0, 13.0, 22.0, 21.0, 17.0, 30.0, 25.0, 1.0, 59.0, 91.0, 78.0, 12.0, 74.0, 56.0, 3.0, 88.0,}, Relationship.GEQ, 91.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101857);constraints.add(new LinearConstraint(new double[] {0.0, 60.0, 40.0, 81.0, 71.0, 72.0, 46.0, 45.0, 38.0, 48.0, 40.0, 17.0, 33.0, 85.0, 64.0, 32.0, 84.0, 3.0, 54.0, 44.0, 71.0, 67.0, 90.0, 95.0, 54.0, 99.0, 99.0, 29.0, 52.0, 98.0, 9.0,}, Relationship.GEQ, 54.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101858);constraints.add(new LinearConstraint(new double[] {0.0, 41.0, 12.0, 86.0, 90.0, 61.0, 31.0, 41.0, 23.0, 89.0, 17.0, 74.0, 44.0, 27.0, 16.0, 47.0, 80.0, 32.0, 11.0, 56.0, 68.0, 82.0, 11.0, 62.0, 62.0, 53.0, 39.0, 16.0, 48.0, 1.0, 63.0,}, Relationship.GEQ, 62.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101859);constraints.add(new LinearConstraint(new double[] {83.0, -76.0, -94.0, -19.0, -15.0, -70.0, -72.0, -57.0, -63.0, -65.0, -22.0, -94.0, -22.0, -88.0, -86.0, -89.0, -72.0, -16.0, -80.0, -49.0, -70.0, -93.0, -95.0, -17.0, -83.0, -97.0, -31.0, -47.0, -31.0, -13.0, -23.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101860);constraints.add(new LinearConstraint(new double[] {41.0, -96.0, -41.0, -48.0, -70.0, -43.0, -43.0, -43.0, -97.0, -37.0, -85.0, -70.0, -45.0, -67.0, -87.0, -69.0, -94.0, -54.0, -54.0, -92.0, -79.0, -10.0, -35.0, -20.0, -41.0, -41.0, -65.0, -25.0, -12.0, -8.0, -46.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101861);constraints.add(new LinearConstraint(new double[] {27.0, -42.0, -65.0, -49.0, -53.0, -42.0, -17.0, -2.0, -61.0, -31.0, -76.0, -47.0, -8.0, -93.0, -86.0, -62.0, -65.0, -63.0, -22.0, -43.0, -27.0, -23.0, -32.0, -74.0, -27.0, -63.0, -47.0, -78.0, -29.0, -95.0, -73.0,}, Relationship.GEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101862);constraints.add(new LinearConstraint(new double[] {15.0, -46.0, -41.0, -83.0, -98.0, -99.0, -21.0, -35.0, -7.0, -14.0, -80.0, -63.0, -18.0, -42.0, -5.0, -34.0, -56.0, -70.0, -16.0, -18.0, -74.0, -61.0, -47.0, -41.0, -15.0, -79.0, -18.0, -47.0, -88.0, -68.0, -55.0,}, Relationship.GEQ, 0.0));
        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101863);double epsilon = 1e-6;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101864);PointValuePair solution = new SimplexSolver().optimize(f, constraints, GoalType.MINIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101865);Assert.assertEquals(1.0d, solution.getValue(), epsilon);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101866);Assert.assertTrue(validSolution(solution, constraints, epsilon));        
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath781() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gbrwd26ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath781",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gbrwd26ln(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101867);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101868);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 6, 7 }, 0);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101869);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101870);constraints.add(new LinearConstraint(new double[] { 1, 2, 1 }, Relationship.LEQ, 2));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101871);constraints.add(new LinearConstraint(new double[] { -1, 1, 1 }, Relationship.LEQ, -1));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101872);constraints.add(new LinearConstraint(new double[] { 2, -3, 1 }, Relationship.LEQ, -1));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101873);double epsilon = 1e-6;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101874);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101875);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101876);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0], 0.0d, epsilon) > 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101877);Assert.assertTrue(Precision.compareTo(solution.getPoint()[1], 0.0d, epsilon) > 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101878);Assert.assertTrue(Precision.compareTo(solution.getPoint()[2], 0.0d, epsilon) < 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101879);Assert.assertEquals(2.0d, solution.getValue(), epsilon);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath713NegativeVariable() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15x5t5j26m0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath713NegativeVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15x5t5j26m0(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101880);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101881);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1.0, 1.0}, 0.0d);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101882);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101883);constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.EQ, 1));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101884);double epsilon = 1e-6;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101885);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101886);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101887);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0], 0.0d, epsilon) >= 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101888);Assert.assertTrue(Precision.compareTo(solution.getPoint()[1], 0.0d, epsilon) >= 0);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath434NegativeVariable() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzrvwz26m9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath434NegativeVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzrvwz26m9(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101889);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101890);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0.0, 0.0, 1.0}, 0.0d);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101891);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101892);constraints.add(new LinearConstraint(new double[] {1, 1, 0}, Relationship.EQ, 5));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101893);constraints.add(new LinearConstraint(new double[] {0, 0, 1}, Relationship.GEQ, -10));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101894);double epsilon = 1e-6;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101895);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101896);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101897);Assert.assertEquals(5.0, solution.getPoint()[0] + solution.getPoint()[1], epsilon);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101898);Assert.assertEquals(-10.0, solution.getPoint()[2], epsilon);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101899);Assert.assertEquals(-10.0, solution.getValue(), epsilon);

    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test(expected = NoFeasibleSolutionException.class)
    public void testMath434UnfeasibleSolution() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yltto726mk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,52,51,52,85,110,102,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,58,32,91,78,111,70,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoFeasibleSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath434UnfeasibleSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yltto726mk(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101900);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101901);double epsilon = 1e-6;

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101902);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1.0, 0.0}, 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101903);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101904);constraints.add(new LinearConstraint(new double[] {epsilon/2, 0.5}, Relationship.EQ, 0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101905);constraints.add(new LinearConstraint(new double[] {1e-3, 0.1}, Relationship.EQ, 10));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101906);SimplexSolver solver = new SimplexSolver();
        // allowing only non-negative values, no feasible solution shall be found
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101907);solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath434PivotRowSelection() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_185wr9c26ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath434PivotRowSelection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_185wr9c26ms(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101908);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101909);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1.0}, 0.0);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101910);double epsilon = 1e-6;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101911);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101912);constraints.add(new LinearConstraint(new double[] {200}, Relationship.GEQ, 1));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101913);constraints.add(new LinearConstraint(new double[] {100}, Relationship.GEQ, 0.499900001));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101914);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101915);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);
        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101916);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0] * 200.d, 1.d, epsilon) >= 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101917);Assert.assertEquals(0.0050, solution.getValue(), epsilon);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath434PivotRowSelection2() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12skxi826n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath434PivotRowSelection2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12skxi826n2(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101918);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101919);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0.0d, 1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d}, 0.0d);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101920);ArrayList<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101921);constraints.add(new LinearConstraint(new double[] {1.0d, -0.1d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, Relationship.EQ, -0.1d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101922);constraints.add(new LinearConstraint(new double[] {1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, -1e-18d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101923);constraints.add(new LinearConstraint(new double[] {0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101924);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 0.0d, 1.0d, 0.0d, -0.0128588d, 1e-5d}, Relationship.EQ, 0.0d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101925);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 1e-5d, -0.0128586d}, Relationship.EQ, 1e-10d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101926);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101927);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, 1.0d, 0.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101928);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, 0.0d, -1.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101929);constraints.add(new LinearConstraint(new double[] {0.0d, 0.0d, 1.0d, 0.0d, 1.0d, 0.0d, 0.0d}, Relationship.GEQ, 0.0d));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101930);double epsilon = 1e-7;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101931);SimplexSolver simplex = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101932);PointValuePair solution = simplex.optimize(f, constraints, GoalType.MINIMIZE, false);
        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101933);Assert.assertTrue(Precision.compareTo(solution.getPoint()[0], -1e-18d, epsilon) >= 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101934);Assert.assertEquals(1.0d, solution.getPoint()[1], epsilon);        
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101935);Assert.assertEquals(0.0d, solution.getPoint()[2], epsilon);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101936);Assert.assertEquals(1.0d, solution.getValue(), epsilon);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}
    
    @Test
    public void testMath272() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17c9pja26nl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath272",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17c9pja26nl(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101937);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101938);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 2, 1 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101939);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101940);constraints.add(new LinearConstraint(new double[] { 1, 1, 0 }, Relationship.GEQ,  1));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101941);constraints.add(new LinearConstraint(new double[] { 1, 0, 1 }, Relationship.GEQ,  1));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101942);constraints.add(new LinearConstraint(new double[] { 0, 1, 0 }, Relationship.GEQ,  1));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101943);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101944);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101945);Assert.assertEquals(0.0, solution.getPoint()[0], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101946);Assert.assertEquals(1.0, solution.getPoint()[1], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101947);Assert.assertEquals(1.0, solution.getPoint()[2], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101948);Assert.assertEquals(3.0, solution.getValue(), .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath286() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zdl26526nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath286",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zdl26526nx(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101949);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101950);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0.8, 0.2, 0.7, 0.3, 0.6, 0.4 }, 0 );
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101951);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101952);constraints.add(new LinearConstraint(new double[] { 1, 0, 1, 0, 1, 0 }, Relationship.EQ, 23.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101953);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 1, 0, 1 }, Relationship.EQ, 23.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101954);constraints.add(new LinearConstraint(new double[] { 1, 0, 0, 0, 0, 0 }, Relationship.GEQ, 10.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101955);constraints.add(new LinearConstraint(new double[] { 0, 0, 1, 0, 0, 0 }, Relationship.GEQ, 8.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101956);constraints.add(new LinearConstraint(new double[] { 0, 0, 0, 0, 1, 0 }, Relationship.GEQ, 5.0));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101957);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101958);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101959);Assert.assertEquals(25.8, solution.getValue(), .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101960);Assert.assertEquals(23.0, solution.getPoint()[0] + solution.getPoint()[2] + solution.getPoint()[4], 0.0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101961);Assert.assertEquals(23.0, solution.getPoint()[1] + solution.getPoint()[3] + solution.getPoint()[5], 0.0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101962);Assert.assertTrue(solution.getPoint()[0] >= 10.0 - 0.0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101963);Assert.assertTrue(solution.getPoint()[2] >= 8.0 - 0.0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101964);Assert.assertTrue(solution.getPoint()[4] >= 5.0 - 0.0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testDegeneracy() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8ayfo26od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testDegeneracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8ayfo26od(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101965);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101966);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0.8, 0.7 }, 0 );
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101967);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101968);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 18.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101969);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 10.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101970);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 8.0));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101971);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101972);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101973);Assert.assertEquals(13.6, solution.getValue(), .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath288() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5j28126om();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath288",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5j28126om(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101974);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101975);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 7, 3, 0, 0 }, 0 );
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101976);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101977);constraints.add(new LinearConstraint(new double[] { 3, 0, -5, 0 }, Relationship.LEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101978);constraints.add(new LinearConstraint(new double[] { 2, 0, 0, -5 }, Relationship.LEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101979);constraints.add(new LinearConstraint(new double[] { 0, 3, 0, -5 }, Relationship.LEQ, 0.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101980);constraints.add(new LinearConstraint(new double[] { 1, 0, 0, 0 }, Relationship.LEQ, 1.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101981);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 0 }, Relationship.LEQ, 1.0));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(101982);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101983);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101984);Assert.assertEquals(10.0, solution.getValue(), .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath290GEQ() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8n3d726ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath290GEQ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101985,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8n3d726ox(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101985);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101986);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 5 }, 0 );
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101987);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101988);constraints.add(new LinearConstraint(new double[] { 2, 0 }, Relationship.GEQ, -1.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101989);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101990);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101991);Assert.assertEquals(0, solution.getValue(), .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101992);Assert.assertEquals(0, solution.getPoint()[0], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101993);Assert.assertEquals(0, solution.getPoint()[1], .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test(expected=NoFeasibleSolutionException.class)
    public void testMath290LEQ() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),101994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15kdn1s26p6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,50,57,48,76,69,81,58,32,91,78,111,70,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoFeasibleSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath290LEQ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15kdn1s26p6(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(101994);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101995);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 5 }, 0 );
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101996);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101997);constraints.add(new LinearConstraint(new double[] { 2, 0 }, Relationship.LEQ, -1.0));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101998);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(101999);solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMath293() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fonzmv26pc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMath293",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fonzmv26pc(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102000);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102001);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0.8, 0.2, 0.7, 0.3, 0.4, 0.6}, 0 );
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102002);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102003);constraints.add(new LinearConstraint(new double[] { 1, 0, 1, 0, 1, 0 }, Relationship.EQ, 30.0));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102004);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 1, 0, 1 }, Relationship.EQ, 30.0));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102005);constraints.add(new LinearConstraint(new double[] { 0.8, 0.2, 0.0, 0.0, 0.0, 0.0 }, Relationship.GEQ, 10.0));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102006);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.7, 0.3, 0.0, 0.0 }, Relationship.GEQ, 10.0));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102007);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.4, 0.6 }, Relationship.GEQ, 10.0));

      __CLR4_4_126kv26kvlb90pe5a.R.inc(102008);SimplexSolver solver = new SimplexSolver();
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102009);PointValuePair solution1 = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

      __CLR4_4_126kv26kvlb90pe5a.R.inc(102010);Assert.assertEquals(15.7143, solution1.getPoint()[0], .0001);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102011);Assert.assertEquals(0.0, solution1.getPoint()[1], .0001);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102012);Assert.assertEquals(14.2857, solution1.getPoint()[2], .0001);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102013);Assert.assertEquals(0.0, solution1.getPoint()[3], .0001);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102014);Assert.assertEquals(0.0, solution1.getPoint()[4], .0001);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102015);Assert.assertEquals(30.0, solution1.getPoint()[5], .0001);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102016);Assert.assertEquals(40.57143, solution1.getValue(), .0001);

      __CLR4_4_126kv26kvlb90pe5a.R.inc(102017);double valA = 0.8 * solution1.getPoint()[0] + 0.2 * solution1.getPoint()[1];
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102018);double valB = 0.7 * solution1.getPoint()[2] + 0.3 * solution1.getPoint()[3];
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102019);double valC = 0.4 * solution1.getPoint()[4] + 0.6 * solution1.getPoint()[5];

      __CLR4_4_126kv26kvlb90pe5a.R.inc(102020);f = new LinearObjectiveFunction(new double[] { 0.8, 0.2, 0.7, 0.3, 0.4, 0.6}, 0 );
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102021);constraints = new ArrayList<LinearConstraint>();
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102022);constraints.add(new LinearConstraint(new double[] { 1, 0, 1, 0, 1, 0 }, Relationship.EQ, 30.0));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102023);constraints.add(new LinearConstraint(new double[] { 0, 1, 0, 1, 0, 1 }, Relationship.EQ, 30.0));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102024);constraints.add(new LinearConstraint(new double[] { 0.8, 0.2, 0.0, 0.0, 0.0, 0.0 }, Relationship.GEQ, valA));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102025);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.7, 0.3, 0.0, 0.0 }, Relationship.GEQ, valB));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102026);constraints.add(new LinearConstraint(new double[] { 0.0, 0.0, 0.0, 0.0, 0.4, 0.6 }, Relationship.GEQ, valC));

      __CLR4_4_126kv26kvlb90pe5a.R.inc(102027);PointValuePair solution2 = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102028);Assert.assertEquals(40.57143, solution2.getValue(), .0001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testSimplexSolver() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilxy6q26q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testSimplexSolver",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilxy6q26q5(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102029);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102030);LinearObjectiveFunction f =
            new LinearObjectiveFunction(new double[] { 15, 10 }, 7);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102031);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102032);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102033);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102034);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102035);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102036);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102037);Assert.assertEquals(2.0, solution.getPoint()[0], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102038);Assert.assertEquals(2.0, solution.getPoint()[1], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102039);Assert.assertEquals(57.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testSingleVariableAndConstraint() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e7cmcl26qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testSingleVariableAndConstraint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e7cmcl26qg(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102040);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102041);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102042);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102043);constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 10));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102044);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102045);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102046);Assert.assertEquals(10.0, solution.getPoint()[0], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102047);Assert.assertEquals(30.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    /**
     * With no artificial variables needed (no equals and no greater than
     * constraints) we can go straight to Phase 2.
     */
    @Test
    public void testModelWithNoArtificialVars() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqy1qt26qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testModelWithNoArtificialVars",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqy1qt26qo(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102048);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102049);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15, 10 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102050);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102051);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102052);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102053);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102054);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102055);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102056);Assert.assertEquals(2.0, solution.getPoint()[0], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102057);Assert.assertEquals(2.0, solution.getPoint()[1], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102058);Assert.assertEquals(50.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testMinimization() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gncwnt26qz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testMinimization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gncwnt26qz(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102059);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102060);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, -5);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102061);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102062);constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 6));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102063);constraints.add(new LinearConstraint(new double[] { 3, 2 }, Relationship.LEQ, 12));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102064);constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 0));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102065);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102066);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102067);Assert.assertEquals(4.0, solution.getPoint()[0], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102068);Assert.assertEquals(0.0, solution.getPoint()[1], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102069);Assert.assertEquals(-13.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testSolutionWithNegativeDecisionVariable() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d34e326ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testSolutionWithNegativeDecisionVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d34e326ra(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102070);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102071);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102072);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102073);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 6));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102074);constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 14));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102075);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102076);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102077);Assert.assertEquals(-2.0, solution.getPoint()[0], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102078);Assert.assertEquals(8.0, solution.getPoint()[1], 0.0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102079);Assert.assertEquals(12.0, solution.getValue(), 0.0);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test(expected = NoFeasibleSolutionException.class)
    public void testInfeasibleSolution() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfuhy26rk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,102,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,58,32,91,78,111,70,101,97,115,105,98,108,101,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoFeasibleSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testInfeasibleSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfuhy26rk(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102080);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102081);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102082);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102083);constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 1));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102084);constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.GEQ, 3));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102085);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102086);solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test(expected = UnboundedSolutionException.class)
    public void testUnboundedSolution() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzpa7m26rr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,85,110,98,111,117,110,100,101,100,83,111,108,117,116,105,111,110,58,32,91,85,110,98,111,117,110,100,101,100,83,111,108,117,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnboundedSolutionException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testUnboundedSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzpa7m26rr(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102087);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102088);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15, 10 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102089);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102090);constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 2));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102091);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102092);solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testRestrictVariablesToNonNegative() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8ntad26rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testRestrictVariablesToNonNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8ntad26rx(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102093);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102094);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 409, 523, 70, 204, 339 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102095);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102096);constraints.add(new LinearConstraint(new double[] {    43,   56, 345,  56,    5 }, Relationship.LEQ,  4567456));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102097);constraints.add(new LinearConstraint(new double[] {    12,   45,   7,  56,   23 }, Relationship.LEQ,    56454));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102098);constraints.add(new LinearConstraint(new double[] {     8,  768,   0,  34, 7456 }, Relationship.LEQ,  1923421));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102099);constraints.add(new LinearConstraint(new double[] { 12342, 2342,  34, 678, 2342 }, Relationship.GEQ,     4356));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102100);constraints.add(new LinearConstraint(new double[] {    45,  678,  76,  52,   23 }, Relationship.EQ,    456356));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102101);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102102);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102103);Assert.assertEquals(2902.92783505155, solution.getPoint()[0], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102104);Assert.assertEquals(480.419243986254, solution.getPoint()[1], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102105);Assert.assertEquals(0.0, solution.getPoint()[2], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102106);Assert.assertEquals(0.0, solution.getPoint()[3], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102107);Assert.assertEquals(0.0, solution.getPoint()[4], .0000001);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102108);Assert.assertEquals(1438556.7491409, solution.getValue(), .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testEpsilon() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gxghr26sd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testEpsilon",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gxghr26sd(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102109);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102110);LinearObjectiveFunction f =
          new LinearObjectiveFunction(new double[] { 10, 5, 1 }, 0);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102111);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102112);constraints.add(new LinearConstraint(new double[] {  9, 8, 0 }, Relationship.EQ,  17));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102113);constraints.add(new LinearConstraint(new double[] {  0, 7, 8 }, Relationship.LEQ,  7));
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102114);constraints.add(new LinearConstraint(new double[] { 10, 0, 2 }, Relationship.LEQ, 10));

      __CLR4_4_126kv26kvlb90pe5a.R.inc(102115);SimplexSolver solver = new SimplexSolver();
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102116);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102117);Assert.assertEquals(1.0, solution.getPoint()[0], 0.0);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102118);Assert.assertEquals(1.0, solution.getPoint()[1], 0.0);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102119);Assert.assertEquals(0.0, solution.getPoint()[2], 0.0);
      __CLR4_4_126kv26kvlb90pe5a.R.inc(102120);Assert.assertEquals(15.0, solution.getValue(), 0.0);
  }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testTrivialModel() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7zkkn26sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testTrivialModel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7zkkn26sp(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102121);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102122);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102123);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102124);constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ,  0));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102125);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102126);PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102127);Assert.assertEquals(0, solution.getValue(), .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    @Test
    public void testLargeModel() {__CLR4_4_126kv26kvlb90pe5a.R.globalSliceStart(getClass().getName(),102128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13pde0726sw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_126kv26kvlb90pe5a.R.rethrow($CLV_t2$);}finally{__CLR4_4_126kv26kvlb90pe5a.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.linear.SimplexSolverTest.testLargeModel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13pde0726sw(){try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102128);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102129);double[] objective = new double[] {
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

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102130);LinearObjectiveFunction f = new LinearObjectiveFunction(objective, 0);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102131);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102132);constraints.add(equationFromString(objective.length, "x0 + x1 + x2 + x3 - x12 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102133);constraints.add(equationFromString(objective.length, "x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 - x13 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102134);constraints.add(equationFromString(objective.length, "x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 >= 49"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102135);constraints.add(equationFromString(objective.length, "x0 + x1 + x2 + x3 >= 42"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102136);constraints.add(equationFromString(objective.length, "x14 + x15 + x16 + x17 - x26 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102137);constraints.add(equationFromString(objective.length, "x18 + x19 + x20 + x21 + x22 + x23 + x24 + x25 - x27 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102138);constraints.add(equationFromString(objective.length, "x14 + x15 + x16 + x17 - x12 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102139);constraints.add(equationFromString(objective.length, "x18 + x19 + x20 + x21 + x22 + x23 + x24 + x25 - x13 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102140);constraints.add(equationFromString(objective.length, "x28 + x29 + x30 + x31 - x40 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102141);constraints.add(equationFromString(objective.length, "x32 + x33 + x34 + x35 + x36 + x37 + x38 + x39 - x41 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102142);constraints.add(equationFromString(objective.length, "x32 + x33 + x34 + x35 + x36 + x37 + x38 + x39 >= 49"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102143);constraints.add(equationFromString(objective.length, "x28 + x29 + x30 + x31 >= 42"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102144);constraints.add(equationFromString(objective.length, "x42 + x43 + x44 + x45 - x54 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102145);constraints.add(equationFromString(objective.length, "x46 + x47 + x48 + x49 + x50 + x51 + x52 + x53 - x55 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102146);constraints.add(equationFromString(objective.length, "x42 + x43 + x44 + x45 - x40 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102147);constraints.add(equationFromString(objective.length, "x46 + x47 + x48 + x49 + x50 + x51 + x52 + x53 - x41 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102148);constraints.add(equationFromString(objective.length, "x56 + x57 + x58 + x59 - x68 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102149);constraints.add(equationFromString(objective.length, "x60 + x61 + x62 + x63 + x64 + x65 + x66 + x67 - x69 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102150);constraints.add(equationFromString(objective.length, "x60 + x61 + x62 + x63 + x64 + x65 + x66 + x67 >= 51"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102151);constraints.add(equationFromString(objective.length, "x56 + x57 + x58 + x59 >= 44"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102152);constraints.add(equationFromString(objective.length, "x70 + x71 + x72 + x73 - x82 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102153);constraints.add(equationFromString(objective.length, "x74 + x75 + x76 + x77 + x78 + x79 + x80 + x81 - x83 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102154);constraints.add(equationFromString(objective.length, "x70 + x71 + x72 + x73 - x68 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102155);constraints.add(equationFromString(objective.length, "x74 + x75 + x76 + x77 + x78 + x79 + x80 + x81 - x69 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102156);constraints.add(equationFromString(objective.length, "x84 + x85 + x86 + x87 - x96 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102157);constraints.add(equationFromString(objective.length, "x88 + x89 + x90 + x91 + x92 + x93 + x94 + x95 - x97 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102158);constraints.add(equationFromString(objective.length, "x88 + x89 + x90 + x91 + x92 + x93 + x94 + x95 >= 51"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102159);constraints.add(equationFromString(objective.length, "x84 + x85 + x86 + x87 >= 44"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102160);constraints.add(equationFromString(objective.length, "x98 + x99 + x100 + x101 - x110 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102161);constraints.add(equationFromString(objective.length, "x102 + x103 + x104 + x105 + x106 + x107 + x108 + x109 - x111 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102162);constraints.add(equationFromString(objective.length, "x98 + x99 + x100 + x101 - x96 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102163);constraints.add(equationFromString(objective.length, "x102 + x103 + x104 + x105 + x106 + x107 + x108 + x109 - x97 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102164);constraints.add(equationFromString(objective.length, "x112 + x113 + x114 + x115 - x124 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102165);constraints.add(equationFromString(objective.length, "x116 + x117 + x118 + x119 + x120 + x121 + x122 + x123 - x125 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102166);constraints.add(equationFromString(objective.length, "x116 + x117 + x118 + x119 + x120 + x121 + x122 + x123 >= 49"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102167);constraints.add(equationFromString(objective.length, "x112 + x113 + x114 + x115 >= 42"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102168);constraints.add(equationFromString(objective.length, "x126 + x127 + x128 + x129 - x138 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102169);constraints.add(equationFromString(objective.length, "x130 + x131 + x132 + x133 + x134 + x135 + x136 + x137 - x139 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102170);constraints.add(equationFromString(objective.length, "x126 + x127 + x128 + x129 - x124 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102171);constraints.add(equationFromString(objective.length, "x130 + x131 + x132 + x133 + x134 + x135 + x136 + x137 - x125 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102172);constraints.add(equationFromString(objective.length, "x140 + x141 + x142 + x143 - x152 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102173);constraints.add(equationFromString(objective.length, "x144 + x145 + x146 + x147 + x148 + x149 + x150 + x151 - x153 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102174);constraints.add(equationFromString(objective.length, "x144 + x145 + x146 + x147 + x148 + x149 + x150 + x151 >= 59"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102175);constraints.add(equationFromString(objective.length, "x140 + x141 + x142 + x143 >= 42"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102176);constraints.add(equationFromString(objective.length, "x154 + x155 + x156 + x157 - x166 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102177);constraints.add(equationFromString(objective.length, "x158 + x159 + x160 + x161 + x162 + x163 + x164 + x165 - x167 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102178);constraints.add(equationFromString(objective.length, "x154 + x155 + x156 + x157 - x152 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102179);constraints.add(equationFromString(objective.length, "x158 + x159 + x160 + x161 + x162 + x163 + x164 + x165 - x153 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102180);constraints.add(equationFromString(objective.length, "x83 + x82 - x168 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102181);constraints.add(equationFromString(objective.length, "x111 + x110 - x169 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102182);constraints.add(equationFromString(objective.length, "x170 - x182 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102183);constraints.add(equationFromString(objective.length, "x171 - x183 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102184);constraints.add(equationFromString(objective.length, "x172 - x184 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102185);constraints.add(equationFromString(objective.length, "x173 - x185 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102186);constraints.add(equationFromString(objective.length, "x174 - x186 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102187);constraints.add(equationFromString(objective.length, "x175 + x176 - x187 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102188);constraints.add(equationFromString(objective.length, "x177 - x188 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102189);constraints.add(equationFromString(objective.length, "x178 - x189 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102190);constraints.add(equationFromString(objective.length, "x179 - x190 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102191);constraints.add(equationFromString(objective.length, "x180 - x191 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102192);constraints.add(equationFromString(objective.length, "x181 - x192 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102193);constraints.add(equationFromString(objective.length, "x170 - x26 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102194);constraints.add(equationFromString(objective.length, "x171 - x27 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102195);constraints.add(equationFromString(objective.length, "x172 - x54 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102196);constraints.add(equationFromString(objective.length, "x173 - x55 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102197);constraints.add(equationFromString(objective.length, "x174 - x168 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102198);constraints.add(equationFromString(objective.length, "x177 - x169 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102199);constraints.add(equationFromString(objective.length, "x178 - x138 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102200);constraints.add(equationFromString(objective.length, "x179 - x139 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102201);constraints.add(equationFromString(objective.length, "x180 - x166 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102202);constraints.add(equationFromString(objective.length, "x181 - x167 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102203);constraints.add(equationFromString(objective.length, "x193 - x205 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102204);constraints.add(equationFromString(objective.length, "x194 - x206 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102205);constraints.add(equationFromString(objective.length, "x195 - x207 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102206);constraints.add(equationFromString(objective.length, "x196 - x208 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102207);constraints.add(equationFromString(objective.length, "x197 - x209 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102208);constraints.add(equationFromString(objective.length, "x198 + x199 - x210 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102209);constraints.add(equationFromString(objective.length, "x200 - x211 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102210);constraints.add(equationFromString(objective.length, "x201 - x212 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102211);constraints.add(equationFromString(objective.length, "x202 - x213 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102212);constraints.add(equationFromString(objective.length, "x203 - x214 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102213);constraints.add(equationFromString(objective.length, "x204 - x215 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102214);constraints.add(equationFromString(objective.length, "x193 - x182 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102215);constraints.add(equationFromString(objective.length, "x194 - x183 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102216);constraints.add(equationFromString(objective.length, "x195 - x184 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102217);constraints.add(equationFromString(objective.length, "x196 - x185 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102218);constraints.add(equationFromString(objective.length, "x197 - x186 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102219);constraints.add(equationFromString(objective.length, "x198 + x199 - x187 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102220);constraints.add(equationFromString(objective.length, "x200 - x188 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102221);constraints.add(equationFromString(objective.length, "x201 - x189 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102222);constraints.add(equationFromString(objective.length, "x202 - x190 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102223);constraints.add(equationFromString(objective.length, "x203 - x191 = 0"));
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102224);constraints.add(equationFromString(objective.length, "x204 - x192 = 0"));

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102225);SimplexSolver solver = new SimplexSolver();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102226);PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102227);Assert.assertEquals(7518.0, solution.getValue(), .0000001);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    /**
     * Converts a test string to a {@link LinearConstraint}.
     * Ex: x0 + x1 + x2 + x3 - x12 = 0
     */
    private LinearConstraint equationFromString(int numCoefficients, String s) {try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102228);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102229);Relationship relationship;
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102230);if ((((s.contains(">="))&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102231)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102232)==0&false))) {{
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102233);relationship = Relationship.GEQ;
        } }else {__CLR4_4_126kv26kvlb90pe5a.R.inc(102234);if ((((s.contains("<="))&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102235)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102236)==0&false))) {{
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102237);relationship = Relationship.LEQ;
        } }else {__CLR4_4_126kv26kvlb90pe5a.R.inc(102238);if ((((s.contains("="))&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102239)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102240)==0&false))) {{
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102241);relationship = Relationship.EQ;
        } }else {{
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102242);throw new IllegalArgumentException();
        }

        }}}__CLR4_4_126kv26kvlb90pe5a.R.inc(102243);String[] equationParts = s.split("[>|<]?=");
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102244);double rhs = Double.parseDouble(equationParts[1].trim());

        __CLR4_4_126kv26kvlb90pe5a.R.inc(102245);double[] lhs = new double[numCoefficients];
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102246);String left = equationParts[0].replaceAll(" ?x", "");
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102247);String[] coefficients = left.split(" ");
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102248);for (String coefficient : coefficients) {{
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102249);double value = (((coefficient.charAt(0) == '-' )&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102250)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102251)==0&false))? -1 : 1;
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102252);int index = Integer.parseInt(coefficient.replaceFirst("[+|-]", "").trim());
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102253);lhs[index] = value;
        }
        }__CLR4_4_126kv26kvlb90pe5a.R.inc(102254);return new LinearConstraint(lhs, relationship, rhs);
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

    private static boolean validSolution(PointValuePair solution, List<LinearConstraint> constraints, double epsilon) {try{__CLR4_4_126kv26kvlb90pe5a.R.inc(102255);
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102256);double[] vals = solution.getPoint();
        __CLR4_4_126kv26kvlb90pe5a.R.inc(102257);for (LinearConstraint c : constraints) {{
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102258);double[] coeffs = c.getCoefficients().toArray();
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102259);double result = 0.0d;
            __CLR4_4_126kv26kvlb90pe5a.R.inc(102260);for (int i = 0; (((i < vals.length)&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102261)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102262)==0&false)); i++) {{
                __CLR4_4_126kv26kvlb90pe5a.R.inc(102263);result += vals[i] * coeffs[i];
            }
            
            }boolean __CLB4_4_1_bool0=false;__CLR4_4_126kv26kvlb90pe5a.R.inc(102264);switch (c.getRelationship()) {
            case EQ:if (!__CLB4_4_1_bool0) {__CLR4_4_126kv26kvlb90pe5a.R.inc(102265);__CLB4_4_1_bool0=true;}
                __CLR4_4_126kv26kvlb90pe5a.R.inc(102266);if ((((!Precision.equals(result, c.getValue(), epsilon))&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102267)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102268)==0&false))) {{
                    __CLR4_4_126kv26kvlb90pe5a.R.inc(102269);return false;
                }
                }__CLR4_4_126kv26kvlb90pe5a.R.inc(102270);break;
                
            case GEQ:if (!__CLB4_4_1_bool0) {__CLR4_4_126kv26kvlb90pe5a.R.inc(102271);__CLB4_4_1_bool0=true;}
                __CLR4_4_126kv26kvlb90pe5a.R.inc(102272);if ((((Precision.compareTo(result, c.getValue(), epsilon) < 0)&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102273)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102274)==0&false))) {{
                    __CLR4_4_126kv26kvlb90pe5a.R.inc(102275);return false;
                }
                }__CLR4_4_126kv26kvlb90pe5a.R.inc(102276);break;
                
            case LEQ:if (!__CLB4_4_1_bool0) {__CLR4_4_126kv26kvlb90pe5a.R.inc(102277);__CLB4_4_1_bool0=true;}
                __CLR4_4_126kv26kvlb90pe5a.R.inc(102278);if ((((Precision.compareTo(result, c.getValue(), epsilon) > 0)&&(__CLR4_4_126kv26kvlb90pe5a.R.iget(102279)!=0|true))||(__CLR4_4_126kv26kvlb90pe5a.R.iget(102280)==0&false))) {{
                    __CLR4_4_126kv26kvlb90pe5a.R.inc(102281);return false;
                }
                }__CLR4_4_126kv26kvlb90pe5a.R.inc(102282);break;
            }
        }
        
        }__CLR4_4_126kv26kvlb90pe5a.R.inc(102283);return true;
    }finally{__CLR4_4_126kv26kvlb90pe5a.R.flushNeeded();}}

}
