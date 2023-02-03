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

import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class EventFilterTest {static class __CLR4_4_11yti1ytilb90pdiz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testHistoryIncreasingForward() {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sj64c51yti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testHistoryIncreasingForward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sj64c51yti(){try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91782);

        // start point: g > 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91783);testHistory(FilterType.TRIGGER_ONLY_INCREASING_EVENTS,
                    0.5 * FastMath.PI, 30.5 * FastMath.PI, FastMath.PI, -1);

        // start point: g = 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91784);testHistory(FilterType.TRIGGER_ONLY_INCREASING_EVENTS,
                    0, 30.5 * FastMath.PI, FastMath.PI, -1);

        // start point: g < 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91785);testHistory(FilterType.TRIGGER_ONLY_INCREASING_EVENTS,
                    1.5 * FastMath.PI, 30.5 * FastMath.PI, FastMath.PI, +1);

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    @Test
    public void testHistoryIncreasingBackward() {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h7mzcl1ytm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testHistoryIncreasingBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h7mzcl1ytm(){try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91786);

        // start point: g > 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91787);testHistory(FilterType.TRIGGER_ONLY_INCREASING_EVENTS,
                    0.5 * FastMath.PI, -30.5 * FastMath.PI, FastMath.PI, -1);

        // start point: g = 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91788);testHistory(FilterType.TRIGGER_ONLY_INCREASING_EVENTS,
                    0, -30.5 * FastMath.PI, FastMath.PI, +1);

        // start point: g < 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91789);testHistory(FilterType.TRIGGER_ONLY_INCREASING_EVENTS,
                    1.5 * FastMath.PI, -30.5 * FastMath.PI, FastMath.PI, -1);

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    @Test
    public void testHistoryDecreasingForward() {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0a7u71ytq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testHistoryDecreasingForward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0a7u71ytq(){try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91790);

        // start point: g > 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91791);testHistory(FilterType.TRIGGER_ONLY_DECREASING_EVENTS,
                    0.5 * FastMath.PI, 30.5 * FastMath.PI, 0, +1);

        // start point: g = 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91792);testHistory(FilterType.TRIGGER_ONLY_DECREASING_EVENTS,
                    0, 30.5 * FastMath.PI, 0, +1);

        // start point: g < 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91793);testHistory(FilterType.TRIGGER_ONLY_DECREASING_EVENTS,
                    1.5 * FastMath.PI, 30.5 * FastMath.PI, 0, +1);

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    @Test
    public void testHistoryDecreasingBackward() {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143xndl1ytu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testHistoryDecreasingBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143xndl1ytu(){try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91794);

        // start point: g > 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91795);testHistory(FilterType.TRIGGER_ONLY_DECREASING_EVENTS,
                    0.5 * FastMath.PI, -30.5 * FastMath.PI, 0, -1);

        // start point: g = 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91796);testHistory(FilterType.TRIGGER_ONLY_DECREASING_EVENTS,
                    0, -30.5 * FastMath.PI, 0, -1);

        // start point: g < 0
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91797);testHistory(FilterType.TRIGGER_ONLY_DECREASING_EVENTS,
                    1.5 * FastMath.PI, -30.5 * FastMath.PI, 0, +1);

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    public void testHistory(FilterType type, double t0, double t1, double refSwitch, double signEven) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91798);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91799);Event onlyIncreasing = new Event(false, true);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91800);EventFilter eventFilter =
                new EventFilter(onlyIncreasing, type);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91801);eventFilter.init(t0, new double[] {1.0,  0.0}, t1);

        // first pass to set up switches history for a long period
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91802);double h = FastMath.copySign(0.05, t1 - t0);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91803);double n = (int) FastMath.floor((t1 - t0) / h);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91804);for (int i = 0; (((i < n)&&(__CLR4_4_11yti1ytilb90pdiz.R.iget(91805)!=0|true))||(__CLR4_4_11yti1ytilb90pdiz.R.iget(91806)==0&false)); ++i) {{
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91807);double t = t0 + i * h;
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91808);eventFilter.g(t, new double[] { FastMath.sin(t), FastMath.cos(t) });
        }

        // verify old events are preserved, even if randomly accessed
        }__CLR4_4_11yti1ytilb90pdiz.R.inc(91809);RandomGenerator rng = new Well19937a(0xb0e7401265af8cd3l);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91810);for (int i = 0; (((i < 5000)&&(__CLR4_4_11yti1ytilb90pdiz.R.iget(91811)!=0|true))||(__CLR4_4_11yti1ytilb90pdiz.R.iget(91812)==0&false)); i++) {{
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91813);double t = t0 + (t1 - t0) * rng.nextDouble();
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91814);double g = eventFilter.g(t, new double[] { FastMath.sin(t), FastMath.cos(t) });
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91815);int turn = (int) FastMath.floor((t - refSwitch) / (2 * FastMath.PI));
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91816);if ((((turn % 2 == 0)&&(__CLR4_4_11yti1ytilb90pdiz.R.iget(91817)!=0|true))||(__CLR4_4_11yti1ytilb90pdiz.R.iget(91818)==0&false))) {{
                __CLR4_4_11yti1ytilb90pdiz.R.inc(91819);Assert.assertEquals( signEven * FastMath.sin(t), g, 1.0e-10);
            } }else {{
                __CLR4_4_11yti1ytilb90pdiz.R.inc(91820);Assert.assertEquals(-signEven * FastMath.sin(t), g, 1.0e-10);
            }
        }}

    }}finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    @Test
    public void testIncreasingOnly()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184my581yul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testIncreasingOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184my581yul() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91821);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91822);double e = 1e-15;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91823);FirstOrderIntegrator integrator;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91824);integrator = new DormandPrince853Integrator(1.0e-3, 100.0, 1e-7, 1e-7);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91825);Event allEvents = new Event(true, true);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91826);integrator.addEventHandler(allEvents, 0.1, e, 1000,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91827);Event onlyIncreasing = new Event(false, true);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91828);integrator.addEventHandler(new EventFilter(onlyIncreasing,
                                                   FilterType.TRIGGER_ONLY_INCREASING_EVENTS),
                                   0.1, e, 100,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91829);double t0 = 0.5 * FastMath.PI;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91830);double tEnd = 5.5 * FastMath.PI;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91831);double[] y = { 0.0, 1.0 };
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91832);Assert.assertEquals(tEnd,
                            integrator.integrate(new SineCosine(), t0, y, tEnd, y),
                            1.0e-7);

        __CLR4_4_11yti1ytilb90pdiz.R.inc(91833);Assert.assertEquals(5, allEvents.getEventCount());
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91834);Assert.assertEquals(2, onlyIncreasing.getEventCount());

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    @Test
    public void testDecreasingOnly()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14jjr7k1yuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testDecreasingOnly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14jjr7k1yuz() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91835);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91836);double e = 1e-15;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91837);FirstOrderIntegrator integrator;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91838);integrator = new DormandPrince853Integrator(1.0e-3, 100.0, 1e-7, 1e-7);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91839);Event allEvents = new Event(true, true);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91840);integrator.addEventHandler(allEvents, 0.1, e, 1000,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91841);Event onlyDecreasing = new Event(true, false);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91842);integrator.addEventHandler(new EventFilter(onlyDecreasing,
                                                   FilterType.TRIGGER_ONLY_DECREASING_EVENTS),
                                   0.1, e, 1000,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91843);double t0 = 0.5 * FastMath.PI;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91844);double tEnd = 5.5 * FastMath.PI;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91845);double[] y = { 0.0, 1.0 };
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91846);Assert.assertEquals(tEnd,
                            integrator.integrate(new SineCosine(), t0, y, tEnd, y),
                            1.0e-7);

        __CLR4_4_11yti1ytilb90pdiz.R.inc(91847);Assert.assertEquals(5, allEvents.getEventCount());
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91848);Assert.assertEquals(3, onlyDecreasing.getEventCount());

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    @Test
    public void testTwoOppositeFilters()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11yti1ytilb90pdiz.R.globalSliceStart(getClass().getName(),91849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12f05nj1yvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11yti1ytilb90pdiz.R.rethrow($CLV_t2$);}finally{__CLR4_4_11yti1ytilb90pdiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.events.EventFilterTest.testTwoOppositeFilters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12f05nj1yvd() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91849);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91850);double e = 1e-15;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91851);FirstOrderIntegrator integrator;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91852);integrator = new DormandPrince853Integrator(1.0e-3, 100.0, 1e-7, 1e-7);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91853);Event allEvents = new Event(true, true);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91854);integrator.addEventHandler(allEvents, 0.1, e, 1000,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91855);Event onlyIncreasing = new Event(false, true);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91856);integrator.addEventHandler(new EventFilter(onlyIncreasing,
                                                   FilterType.TRIGGER_ONLY_INCREASING_EVENTS),
                                   0.1, e, 1000,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91857);Event onlyDecreasing = new Event(true, false);
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91858);integrator.addEventHandler(new EventFilter(onlyDecreasing,
                                                   FilterType.TRIGGER_ONLY_DECREASING_EVENTS),
                                   0.1, e, 1000,
                                   new BracketingNthOrderBrentSolver(1.0e-7, 5));
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91859);double t0 = 0.5 * FastMath.PI;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91860);double tEnd = 5.5 * FastMath.PI;
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91861);double[] y = { 0.0, 1.0 };
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91862);Assert.assertEquals(tEnd,
                            integrator.integrate(new SineCosine(), t0, y, tEnd, y),
                            1.0e-7);

        __CLR4_4_11yti1ytilb90pdiz.R.inc(91863);Assert.assertEquals(5, allEvents.getEventCount());
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91864);Assert.assertEquals(2, onlyIncreasing.getEventCount());
        __CLR4_4_11yti1ytilb90pdiz.R.inc(91865);Assert.assertEquals(3, onlyDecreasing.getEventCount());

    }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    private static class SineCosine implements FirstOrderDifferentialEquations {
        public int getDimension() {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91866);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91867);return 2;
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

        public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91868);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91869);yDot[0] =  y[1];
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91870);yDot[1] = -y[0];
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}
    }

    /** State events for this unit test. */
    protected static class Event implements EventHandler {

        private final boolean expectDecreasing;
        private final boolean expectIncreasing;
        private int eventCount;

        public Event(boolean expectDecreasing, boolean expectIncreasing) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91871);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91872);this.expectDecreasing = expectDecreasing;
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91873);this.expectIncreasing = expectIncreasing;
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

        public int getEventCount() {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91874);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91875);return eventCount;
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91876);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91877);eventCount = 0;
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

        public double g(double t, double[] y) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91878);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91879);return y[0];
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

        public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91880);
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91881);if ((((increasing)&&(__CLR4_4_11yti1ytilb90pdiz.R.iget(91882)!=0|true))||(__CLR4_4_11yti1ytilb90pdiz.R.iget(91883)==0&false))) {{
                __CLR4_4_11yti1ytilb90pdiz.R.inc(91884);Assert.assertTrue(expectIncreasing);
            } }else {{
                __CLR4_4_11yti1ytilb90pdiz.R.inc(91885);Assert.assertTrue(expectDecreasing);
            }
            }__CLR4_4_11yti1ytilb90pdiz.R.inc(91886);eventCount++;
            __CLR4_4_11yti1ytilb90pdiz.R.inc(91887);return Action.RESET_STATE;
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

        public void resetState(double t, double[] y) {try{__CLR4_4_11yti1ytilb90pdiz.R.inc(91888);
            // in fact, we don't really reset anything for this test
        }finally{__CLR4_4_11yti1ytilb90pdiz.R.flushNeeded();}}

    }
}
