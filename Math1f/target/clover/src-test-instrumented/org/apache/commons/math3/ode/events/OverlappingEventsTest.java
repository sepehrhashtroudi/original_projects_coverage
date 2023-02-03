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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.junit.Assert;
import org.junit.Test;

/** Tests for overlapping state events. Also tests an event function that does
 * not converge to zero, but does have values of opposite sign around its root.
 */
public class OverlappingEventsTest implements FirstOrderDifferentialEquations {static class __CLR4_4_11yyz1yyzlb90pdjf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92038,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Expected event times for first event. */
    private static final double[] EVENT_TIMES1 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0,
                                                  7.0, 8.0, 9.0};

    /** Expected event times for second event. */
    private static final double[] EVENT_TIMES2 = {0.5, 1.0, 1.5, 2.0, 2.5, 3.0,
                                                  3.5, 4.0, 4.5, 5.0, 5.5, 6.0,
                                                  6.5, 7.0, 7.5, 8.0, 8.5, 9.0,
                                                  9.5};

    /** Test for events that occur at the exact same time, but due to numerical
     * calculations occur very close together instead. Uses event type 0. See
     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])
     * EventHandler.g(double, double[])}.
     */
    @Test
    public void testOverlappingEvents0()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11yyz1yyzlb90pdjf.R.globalSliceStart(getClass().getName(),91979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjfgvr1yyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yyz1yyzlb90pdjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yyz1yyzlb90pdjf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.OverlappingEventsTest.testOverlappingEvents0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjfgvr1yyz() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(91979);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91980);test(0);
    }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

    /** Test for events that occur at the exact same time, but due to numerical
     * calculations occur very close together instead. Uses event type 1. See
     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])
     * EventHandler.g(double, double[])}.
     */
    @Test
    public void testOverlappingEvents1()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11yyz1yyzlb90pdjf.R.globalSliceStart(getClass().getName(),91981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8omaw1yz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yyz1yyzlb90pdjf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yyz1yyzlb90pdjf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.OverlappingEventsTest.testOverlappingEvents1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8omaw1yz1() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(91981);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91982);test(1);
    }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

    /** Test for events that occur at the exact same time, but due to numerical
     * calculations occur very close together instead.
     * @param eventType the type of events to use. See
     * {@link org.apache.commons.math3.ode.events.EventHandler#g(double, double[])
     * EventHandler.g(double, double[])}.
     */
    public void test(int eventType)
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(91983);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91984);double e = 1e-15;
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91985);FirstOrderIntegrator integrator = new DormandPrince853Integrator(e, 100.0, 1e-7, 1e-7);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91986);BaseSecantSolver rootSolver = new PegasusSolver(e, e);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91987);EventHandler evt1 = new Event(0, eventType);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91988);EventHandler evt2 = new Event(1, eventType);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91989);integrator.addEventHandler(evt1, 0.1, e, 999, rootSolver);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91990);integrator.addEventHandler(evt2, 0.1, e, 999, rootSolver);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91991);double t = 0.0;
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91992);double tEnd = 10.0;
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91993);double[] y = {0.0, 0.0};
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91994);List<Double> events1 = new ArrayList<Double>();
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91995);List<Double> events2 = new ArrayList<Double>();
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91996);while ((((t < tEnd)&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(91997)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(91998)==0&false))) {{
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(91999);t = integrator.integrate(this, t, y, tEnd, y);
            //System.out.println("t=" + t + ",\t\ty=[" + y[0] + "," + y[1] + "]");

            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92000);if ((((y[0] >= 1.0)&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92001)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92002)==0&false))) {{
                __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92003);y[0] = 0.0;
                __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92004);events1.add(t);
                //System.out.println("Event 1 @ t=" + t);
            }
            }__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92005);if ((((y[1] >= 1.0)&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92006)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92007)==0&false))) {{
                __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92008);y[1] = 0.0;
                __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92009);events2.add(t);
                //System.out.println("Event 2 @ t=" + t);
            }
        }}
        }__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92010);Assert.assertEquals(EVENT_TIMES1.length, events1.size());
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92011);Assert.assertEquals(EVENT_TIMES2.length, events2.size());
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92012);for(int i = 0; (((i < EVENT_TIMES1.length)&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92013)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92014)==0&false)); i++) {{
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92015);Assert.assertEquals(EVENT_TIMES1[i], events1.get(i), 1e-7);
        }
        }__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92016);for(int i = 0; (((i < EVENT_TIMES2.length)&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92017)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92018)==0&false)); i++) {{
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92019);Assert.assertEquals(EVENT_TIMES2[i], events2.get(i), 1e-7);
        }
        //System.out.println();
    }}finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getDimension() {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92020);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92021);return 2;
    }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

    /** {@inheritDoc} */
    public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92022);
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92023);yDot[0] = 1.0;
        __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92024);yDot[1] = 2.0;
    }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

    /** State events for this unit test. */
    private class Event implements EventHandler {
        /** The index of the continuous variable to use. */
        private final int idx;

        /** The event type to use. See {@link #g}. */
        private final int eventType;

        /** Constructor for the {@link Event} class.
         * @param idx the index of the continuous variable to use
         * @param eventType the type of event to use. See {@link #g}
         */
        public Event(int idx, int eventType) {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92025);
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92026);this.idx = idx;
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92027);this.eventType = eventType;
        }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92028);
        }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double g(double t, double[] y) {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92029);
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92030);return ((((eventType == 0) )&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92031)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92032)==0&false))? (((y[idx] >= 1.0 )&&(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92033)!=0|true))||(__CLR4_4_11yyz1yyzlb90pdjf.R.iget(92034)==0&false))? 1.0 : -1.0
                                    : y[idx] - 1.0;
        }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

        /** {@inheritDoc} */
        public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92035);
            __CLR4_4_11yyz1yyzlb90pdjf.R.inc(92036);return Action.STOP;
        }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void resetState(double t, double[] y) {try{__CLR4_4_11yyz1yyzlb90pdjf.R.inc(92037);
            // Never called.
        }finally{__CLR4_4_11yyz1yyzlb90pdjf.R.flushNeeded();}}
    }
}
