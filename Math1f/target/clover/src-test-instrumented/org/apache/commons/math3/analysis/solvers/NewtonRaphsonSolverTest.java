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
package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.analysis.QuinticFunction;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


/**
 * @version $Id$
 */
public final class NewtonRaphsonSolverTest {static class __CLR4_4_11gzw1gzwlb90pc53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,68719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     *
     */
    @Test
    public void testSinZero() {__CLR4_4_11gzw1gzwlb90pc53.R.globalSliceStart(getClass().getName(),68684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15u3fw51gzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gzw1gzwlb90pc53.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gzw1gzwlb90pc53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolverTest.testSinZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15u3fw51gzw(){try{__CLR4_4_11gzw1gzwlb90pc53.R.inc(68684);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68685);UnivariateDifferentiableFunction f = new Sin();
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68686);double result;

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68687);NewtonRaphsonSolver solver = new NewtonRaphsonSolver();
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68688);result = solver.solve(100, f, 3, 4);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68689);Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68690);result = solver.solve(100, f, 1, 4);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68691);Assert.assertEquals(result, FastMath.PI, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68692);Assert.assertTrue(solver.getEvaluations() > 0);
    }finally{__CLR4_4_11gzw1gzwlb90pc53.R.flushNeeded();}}

    /**
     *
     */
    @Test
    public void testQuinticZero() {__CLR4_4_11gzw1gzwlb90pc53.R.globalSliceStart(getClass().getName(),68693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z16axu1h05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11gzw1gzwlb90pc53.R.rethrow($CLV_t2$);}finally{__CLR4_4_11gzw1gzwlb90pc53.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolverTest.testQuinticZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),68693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z16axu1h05(){try{__CLR4_4_11gzw1gzwlb90pc53.R.inc(68693);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68694);final UnivariateDifferentiableFunction f = new QuinticFunction();
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68695);double result;

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68696);NewtonRaphsonSolver solver = new NewtonRaphsonSolver();
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68697);result = solver.solve(100, f, -0.2, 0.2);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68698);Assert.assertEquals(result, 0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68699);result = solver.solve(100, f, -0.1, 0.3);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68700);Assert.assertEquals(result, 0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68701);result = solver.solve(100, f, -0.3, 0.45);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68702);Assert.assertEquals(result, 0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68703);result = solver.solve(100, f, 0.3, 0.7);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68704);Assert.assertEquals(result, 0.5, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68705);result = solver.solve(100, f, 0.2, 0.6);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68706);Assert.assertEquals(result, 0.5, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68707);result = solver.solve(100, f, 0.05, 0.95);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68708);Assert.assertEquals(result, 0.5, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68709);result = solver.solve(100, f, 0.85, 1.25);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68710);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68711);result = solver.solve(100, f, 0.8, 1.2);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68712);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68713);result = solver.solve(100, f, 0.85, 1.75);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68714);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68715);result = solver.solve(100, f, 0.55, 1.45);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68716);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());

        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68717);result = solver.solve(100, f, 0.85, 5);
        __CLR4_4_11gzw1gzwlb90pc53.R.inc(68718);Assert.assertEquals(result, 1.0, solver.getAbsoluteAccuracy());
    }finally{__CLR4_4_11gzw1gzwlb90pc53.R.flushNeeded();}}
}
