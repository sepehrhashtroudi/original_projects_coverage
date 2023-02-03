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


import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math3.ode.sampling.DummyStepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EventStateTest {static class __CLR4_4_11ywh1ywhlb90pdj8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // JIRA: MATH-322
    @Test
    public void closeEvents() throws MaxCountExceededException, NoBracketingException {__CLR4_4_11ywh1ywhlb90pdj8.R.globalSliceStart(getClass().getName(),91889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vlxzrs1ywh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ywh1ywhlb90pdj8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ywh1ywhlb90pdj8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventStateTest.closeEvents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91889,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vlxzrs1ywh() throws MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91889);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91890);final double r1  = 90.0;
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91891);final double r2  = 135.0;
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91892);final double gap = r2 - r1;
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91893);EventHandler closeEventsGenerator = new EventHandler() {
            public void init(double t0, double[] y0, double t) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91894);
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            public void resetState(double t, double[] y) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91895);
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            public double g(double t, double[] y) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91896);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91897);return (t - r1) * (r2 - t);
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91898);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91899);return Action.CONTINUE;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
        };

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91900);final double tolerance = 0.1;
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91901);EventState es = new EventState(closeEventsGenerator, 1.5 * gap,
                                       tolerance, 100,
                                       new BrentSolver(tolerance));
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91902);es.setExpandable(new ExpandableStatefulODE(new FirstOrderDifferentialEquations() {
            public int getDimension() {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91903);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91904);return 0;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91905);
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
        }));

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91906);AbstractStepInterpolator interpolator =
            new DummyStepInterpolator(new double[0], new double[0], true);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91907);interpolator.storeTime(r1 - 2.5 * gap);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91908);interpolator.shift();
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91909);interpolator.storeTime(r1 - 1.5 * gap);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91910);es.reinitializeBegin(interpolator);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91911);interpolator.shift();
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91912);interpolator.storeTime(r1 - 0.5 * gap);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91913);Assert.assertFalse(es.evaluateStep(interpolator));

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91914);interpolator.shift();
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91915);interpolator.storeTime(0.5 * (r1 + r2));
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91916);Assert.assertTrue(es.evaluateStep(interpolator));
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91917);Assert.assertEquals(r1, es.getEventTime(), tolerance);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91918);es.stepAccepted(es.getEventTime(), new double[0]);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91919);interpolator.shift();
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91920);interpolator.storeTime(r2 + 0.4 * gap);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91921);Assert.assertTrue(es.evaluateStep(interpolator));
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91922);Assert.assertEquals(r2, es.getEventTime(), tolerance);

    }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

    // Jira: MATH-695
    @Test
    public void testIssue695()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11ywh1ywhlb90pdj8.R.globalSliceStart(getClass().getName(),91923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igiuia1yxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ywh1ywhlb90pdj8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ywh1ywhlb90pdj8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventStateTest.testIssue695",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91923,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igiuia1yxf() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91923);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91924);FirstOrderDifferentialEquations equation = new FirstOrderDifferentialEquations() {
            
            public int getDimension() {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91925);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91926);return 1;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            
            public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91927);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91928);yDot[0] = 1.0;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
        };

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91929);DormandPrince853Integrator integrator = new DormandPrince853Integrator(0.001, 1000, 1.0e-14, 1.0e-14);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91930);integrator.addEventHandler(new ResettingEvent(10.99), 0.1, 1.0e-9, 1000);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91931);integrator.addEventHandler(new ResettingEvent(11.01), 0.1, 1.0e-9, 1000);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91932);integrator.setInitialStepSize(3.0);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91933);double target = 30.0;
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91934);double[] y = new double[1];
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91935);double tEnd = integrator.integrate(equation, 0.0, y, target, y);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91936);Assert.assertEquals(target, tEnd, 1.0e-10);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91937);Assert.assertEquals(32.0, y[0], 1.0e-10);

    }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

    private static class ResettingEvent implements EventHandler {

        private static double lastTriggerTime = Double.NEGATIVE_INFINITY;
        private final double tEvent;

        public ResettingEvent(final double tEvent) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91938);
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91939);this.tEvent = tEvent;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91940);
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public double g(double t, double[] y) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91941);
            // the bug corresponding to issue 695 causes the g function
            // to be called at obsolete times t despite an event
            // occurring later has already been triggered.
            // When this occurs, the following assertion is violated
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91942);Assert.assertTrue("going backard in time! (" + t + " < " + lastTriggerTime + ")",
                              t >= lastTriggerTime);
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91943);return t - tEvent;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91944);
            // remember in a class variable when the event was triggered
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91945);lastTriggerTime = t;
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91946);return Action.RESET_STATE;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public void resetState(double t, double[] y) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91947);
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91948);y[0] += 1.0;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

    }

    // Jira: MATH-965
    @Test
    public void testIssue965()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11ywh1ywhlb90pdj8.R.globalSliceStart(getClass().getName(),91949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162hvqg1yy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ywh1ywhlb90pdj8.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ywh1ywhlb90pdj8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventStateTest.testIssue965",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162hvqg1yy5() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91949);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91950);ExpandableStatefulODE equation =
                new ExpandableStatefulODE(new FirstOrderDifferentialEquations() {
            
            public int getDimension() {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91951);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91952);return 1;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            
            public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91953);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91954);yDot[0] = 2.0;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
        });
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91955);equation.setTime(0.0);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91956);equation.setPrimaryState(new double[1]);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91957);equation.addSecondaryEquations(new SecondaryEquations() {
            
            public int getDimension() {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91958);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91959);return 1;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
            
            public void computeDerivatives(double t, double[] primary,
                                           double[] primaryDot, double[] secondary,
                                           double[] secondaryDot) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91960);
                __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91961);secondaryDot[0] = -3.0;
            }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}
        });
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91962);int index = equation.getSecondaryMappers()[0].getFirstIndex();

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91963);DormandPrince853Integrator integrator = new DormandPrince853Integrator(0.001, 1000, 1.0e-14, 1.0e-14);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91964);integrator.addEventHandler(new SecondaryStateEvent(index, -3.0), 0.1, 1.0e-9, 1000);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91965);integrator.setInitialStepSize(3.0);

        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91966);integrator.integrate(equation, 30.0);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91967);Assert.assertEquals( 1.0, equation.getTime(), 1.0e-10);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91968);Assert.assertEquals( 2.0, equation.getPrimaryState()[0], 1.0e-10);
        __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91969);Assert.assertEquals(-3.0, equation.getSecondaryState(0)[0], 1.0e-10);

    }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

    private static class SecondaryStateEvent implements EventHandler {

        private int index;
        private final double target;

        public SecondaryStateEvent(final int index, final double target) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91970);
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91971);this.index  = index;
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91972);this.target = target;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91973);
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public double g(double t, double[] y) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91974);
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91975);return y[index] - target;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91976);
            __CLR4_4_11ywh1ywhlb90pdj8.R.inc(91977);return Action.STOP;
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

        public void resetState(double t, double[] y) {try{__CLR4_4_11ywh1ywhlb90pdj8.R.inc(91978);
        }finally{__CLR4_4_11ywh1ywhlb90pdj8.R.flushNeeded();}}

    }

}
