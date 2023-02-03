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
package org.apache.commons.math3.ode.events;

import org.junit.Assert;

import java.util.Arrays;

import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.junit.Test;

public class ReappearingEventTest {static class __CLR4_4_11z0m1z0mlb90pdjj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92066,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testDormandPrince()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11z0m1z0mlb90pdjj.R.globalSliceStart(getClass().getName(),92038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w9j2xb1z0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z0m1z0mlb90pdjj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z0m1z0mlb90pdjj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.ReappearingEventTest.testDormandPrince",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w9j2xb1z0m() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92038);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92039);double tEnd = test(1);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92040);Assert.assertEquals(10.0, tEnd, 1e-7);
    }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

    @Test
    public void testGragg()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11z0m1z0mlb90pdjj.R.globalSliceStart(getClass().getName(),92041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6acnf1z0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z0m1z0mlb90pdjj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z0m1z0mlb90pdjj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.ReappearingEventTest.testGragg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92041,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6acnf1z0p() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92041);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92042);double tEnd = test(2);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92043);Assert.assertEquals(10.0, tEnd, 1e-7);
    }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

    public double test(int integratorType)
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92044);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92045);double e = 1e-15;
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92046);FirstOrderIntegrator integrator;
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92047);integrator = ((((integratorType == 1)
                     )&&(__CLR4_4_11z0m1z0mlb90pdjj.R.iget(92048)!=0|true))||(__CLR4_4_11z0m1z0mlb90pdjj.R.iget(92049)==0&false))? new DormandPrince853Integrator(e, 100.0, 1e-7, 1e-7)
                     : new GraggBulirschStoerIntegrator(e, 100.0, 1e-7, 1e-7);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92050);PegasusSolver rootSolver = new PegasusSolver(e, e);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92051);integrator.addEventHandler(new Event(), 0.1, e, 1000, rootSolver);
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92052);double t0 = 6.0;
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92053);double tEnd = 10.0;
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92054);double[] y = {2.0, 2.0, 2.0, 4.0, 2.0, 7.0, 15.0};
        __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92055);return integrator.integrate(new Ode(), t0, y, tEnd, y);
    }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

    private static class Ode implements FirstOrderDifferentialEquations {
        public int getDimension() {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92056);
            __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92057);return 7;
        }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

        public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92058);
            __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92059);Arrays.fill(yDot, 1.0);
        }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}
    }

    /** State events for this unit test. */
    protected static class Event implements EventHandler {

        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92060);
        }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

        public double g(double t, double[] y) {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92061);
            __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92062);return y[6] - 15.0;
        }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

        public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92063);
            __CLR4_4_11z0m1z0mlb90pdjj.R.inc(92064);return Action.STOP;
        }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}

        public void resetState(double t, double[] y) {try{__CLR4_4_11z0m1z0mlb90pdjj.R.inc(92065);
            // Never called.
        }finally{__CLR4_4_11z0m1z0mlb90pdjj.R.flushNeeded();}}
    }
}
