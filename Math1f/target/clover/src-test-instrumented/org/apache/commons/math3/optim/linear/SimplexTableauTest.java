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
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.junit.Assert;
import org.junit.Test;

public class SimplexTableauTest {static class __CLR4_4_121dn21dnlb90pdrc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,95144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testInitialization() {__CLR4_4_121dn21dnlb90pdrc.R.globalSliceStart(getClass().getName(),95099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6r6jd21dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121dn21dnlb90pdrc.R.rethrow($CLV_t2$);}finally{__CLR4_4_121dn21dnlb90pdrc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexTableauTest.testInitialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6r6jd21dn(){try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95099);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95100);LinearObjectiveFunction f = createFunction();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95101);Collection<LinearConstraint> constraints = createConstraints();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95102);SimplexTableau tableau =
            new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95103);double[][] expectedInitialTableau = {
                                             {-1, 0,  -1,  -1,  2, 0, 0, 0, -4},
                                             { 0, 1, -15, -10, 25, 0, 0, 0,  0},
                                             { 0, 0,   1,   0, -1, 1, 0, 0,  2},
                                             { 0, 0,   0,   1, -1, 0, 1, 0,  3},
                                             { 0, 0,   1,   1, -2, 0, 0, 1,  4}
        };
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95104);assertMatrixEquals(expectedInitialTableau, tableau.getData());
    }finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}

    @Test
    public void testDropPhase1Objective() {__CLR4_4_121dn21dnlb90pdrc.R.globalSliceStart(getClass().getName(),95105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5rnkn21dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121dn21dnlb90pdrc.R.rethrow($CLV_t2$);}finally{__CLR4_4_121dn21dnlb90pdrc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexTableauTest.testDropPhase1Objective",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5rnkn21dt(){try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95105);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95106);LinearObjectiveFunction f = createFunction();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95107);Collection<LinearConstraint> constraints = createConstraints();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95108);SimplexTableau tableau =
            new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95109);double[][] expectedTableau = {
                                      { 1, -15, -10, 0, 0, 0, 0},
                                      { 0,   1,   0, 1, 0, 0, 2},
                                      { 0,   0,   1, 0, 1, 0, 3},
                                      { 0,   1,   1, 0, 0, 1, 4}
        };
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95110);tableau.dropPhase1Objective();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95111);assertMatrixEquals(expectedTableau, tableau.getData());
    }finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}

    @Test
    public void testTableauWithNoArtificialVars() {__CLR4_4_121dn21dnlb90pdrc.R.globalSliceStart(getClass().getName(),95112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8lcs21e0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121dn21dnlb90pdrc.R.rethrow($CLV_t2$);}finally{__CLR4_4_121dn21dnlb90pdrc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexTableauTest.testTableauWithNoArtificialVars",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8lcs21e0(){try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95112);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95113);LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {15, 10}, 0);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95114);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95115);constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95116);constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 3));
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95117);constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95118);SimplexTableau tableau =
            new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95119);double[][] initialTableau = {
                                     {1, -15, -10, 25, 0, 0, 0, 0},
                                     {0,   1,   0, -1, 1, 0, 0, 2},
                                     {0,   0,   1, -1, 0, 1, 0, 3},
                                     {0,   1,   1, -2, 0, 0, 1, 4}
        };
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95120);assertMatrixEquals(initialTableau, tableau.getData());
    }finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}

    @Test
    public void testSerial() {__CLR4_4_121dn21dnlb90pdrc.R.globalSliceStart(getClass().getName(),95121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv21e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_121dn21dnlb90pdrc.R.rethrow($CLV_t2$);}finally{__CLR4_4_121dn21dnlb90pdrc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.linear.SimplexTableauTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),95121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv21e9(){try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95121);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95122);LinearObjectiveFunction f = createFunction();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95123);Collection<LinearConstraint> constraints = createConstraints();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95124);SimplexTableau tableau =
            new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95125);Assert.assertEquals(tableau, TestUtils.serializeAndRecover(tableau));
    }finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}

    private LinearObjectiveFunction createFunction() {try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95126);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95127);return new LinearObjectiveFunction(new double[] {15, 10}, 0);
    }finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}

    private Collection<LinearConstraint> createConstraints() {try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95128);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95129);Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95130);constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95131);constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 3));
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95132);constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 4));
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95133);return constraints;
    }finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}

    private void assertMatrixEquals(double[][] expected, double[][] result) {try{__CLR4_4_121dn21dnlb90pdrc.R.inc(95134);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95135);Assert.assertEquals("Wrong number of rows.", expected.length, result.length);
        __CLR4_4_121dn21dnlb90pdrc.R.inc(95136);for (int i = 0; (((i < expected.length)&&(__CLR4_4_121dn21dnlb90pdrc.R.iget(95137)!=0|true))||(__CLR4_4_121dn21dnlb90pdrc.R.iget(95138)==0&false)); i++) {{
            __CLR4_4_121dn21dnlb90pdrc.R.inc(95139);Assert.assertEquals("Wrong number of columns.", expected[i].length, result[i].length);
            __CLR4_4_121dn21dnlb90pdrc.R.inc(95140);for (int j = 0; (((j < expected[i].length)&&(__CLR4_4_121dn21dnlb90pdrc.R.iget(95141)!=0|true))||(__CLR4_4_121dn21dnlb90pdrc.R.iget(95142)==0&false)); j++) {{
                __CLR4_4_121dn21dnlb90pdrc.R.inc(95143);Assert.assertEquals("Wrong value at position [" + i + "," + j + "]", expected[i][j], result[i][j], 1.0e-15);
            }
        }}
    }}finally{__CLR4_4_121dn21dnlb90pdrc.R.flushNeeded();}}
}
