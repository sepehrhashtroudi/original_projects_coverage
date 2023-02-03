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

package org.apache.commons.math3.ode.sampling;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.util.FastMath;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StepNormalizerTest {static class __CLR4_4_120v420v4lb90pdos{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94479,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public StepNormalizerTest() {try{__CLR4_4_120v420v4lb90pdos.R.inc(94432);
    __CLR4_4_120v420v4lb90pdos.R.inc(94433);pb    = null;
    __CLR4_4_120v420v4lb90pdos.R.inc(94434);integ = null;
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  @Test
  public void testBoundaries()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120v420v4lb90pdos.R.globalSliceStart(getClass().getName(),94435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lisq6920v7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120v420v4lb90pdos.R.rethrow($CLV_t2$);}finally{__CLR4_4_120v420v4lb90pdos.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerTest.testBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lisq6920v7() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120v420v4lb90pdos.R.inc(94435);
    __CLR4_4_120v420v4lb90pdos.R.inc(94436);double range = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_120v420v4lb90pdos.R.inc(94437);setLastSeen(false);
    __CLR4_4_120v420v4lb90pdos.R.inc(94438);integ.addStepHandler(new StepNormalizer(range / 10.0,
                                       new FixedStepHandler() {
                                         private boolean firstCall = true;
                                         public void init(double t0, double[] y0, double t) {try{__CLR4_4_120v420v4lb90pdos.R.inc(94439);
                                         }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}
                                         public void handleStep(double t,
                                                                double[] y,
                                                                double[] yDot,
                                                                boolean isLast) {try{__CLR4_4_120v420v4lb90pdos.R.inc(94440);
                                           __CLR4_4_120v420v4lb90pdos.R.inc(94441);if ((((firstCall)&&(__CLR4_4_120v420v4lb90pdos.R.iget(94442)!=0|true))||(__CLR4_4_120v420v4lb90pdos.R.iget(94443)==0&false))) {{
                                             __CLR4_4_120v420v4lb90pdos.R.inc(94444);checkValue(t, pb.getInitialTime());
                                             __CLR4_4_120v420v4lb90pdos.R.inc(94445);firstCall = false;
                                           }
                                           }__CLR4_4_120v420v4lb90pdos.R.inc(94446);if ((((isLast)&&(__CLR4_4_120v420v4lb90pdos.R.iget(94447)!=0|true))||(__CLR4_4_120v420v4lb90pdos.R.iget(94448)==0&false))) {{
                                             __CLR4_4_120v420v4lb90pdos.R.inc(94449);setLastSeen(true);
                                             __CLR4_4_120v420v4lb90pdos.R.inc(94450);checkValue(t, pb.getFinalTime());
                                           }
                                         }}finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}
                                       }));
    __CLR4_4_120v420v4lb90pdos.R.inc(94451);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_120v420v4lb90pdos.R.inc(94452);Assert.assertTrue(lastSeen);
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  @Test
  public void testBeforeEnd()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120v420v4lb90pdos.R.globalSliceStart(getClass().getName(),94453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzr9n320vp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120v420v4lb90pdos.R.rethrow($CLV_t2$);}finally{__CLR4_4_120v420v4lb90pdos.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.StepNormalizerTest.testBeforeEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzr9n320vp() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120v420v4lb90pdos.R.inc(94453);
    __CLR4_4_120v420v4lb90pdos.R.inc(94454);final double range = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_120v420v4lb90pdos.R.inc(94455);setLastSeen(false);
    __CLR4_4_120v420v4lb90pdos.R.inc(94456);integ.addStepHandler(new StepNormalizer(range / 10.5,
                                       new FixedStepHandler() {
                                         public void init(double t0, double[] y0, double t) {try{__CLR4_4_120v420v4lb90pdos.R.inc(94457);
                                         }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}
                                         public void handleStep(double t,
                                                                double[] y,
                                                                double[] yDot,
                                                                boolean isLast) {try{__CLR4_4_120v420v4lb90pdos.R.inc(94458);
                                           __CLR4_4_120v420v4lb90pdos.R.inc(94459);if ((((isLast)&&(__CLR4_4_120v420v4lb90pdos.R.iget(94460)!=0|true))||(__CLR4_4_120v420v4lb90pdos.R.iget(94461)==0&false))) {{
                                             __CLR4_4_120v420v4lb90pdos.R.inc(94462);setLastSeen(true);
                                             __CLR4_4_120v420v4lb90pdos.R.inc(94463);checkValue(t,
                                                        pb.getFinalTime() - range / 21.0);
                                           }
                                         }}finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}
                                       }));
    __CLR4_4_120v420v4lb90pdos.R.inc(94464);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_120v420v4lb90pdos.R.inc(94465);Assert.assertTrue(lastSeen);
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  public void checkValue(double value, double reference) {try{__CLR4_4_120v420v4lb90pdos.R.inc(94466);
    __CLR4_4_120v420v4lb90pdos.R.inc(94467);Assert.assertTrue(FastMath.abs(value - reference) < 1.0e-10);
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  public void setLastSeen(boolean lastSeen) {try{__CLR4_4_120v420v4lb90pdos.R.inc(94468);
    __CLR4_4_120v420v4lb90pdos.R.inc(94469);this.lastSeen = lastSeen;
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  @Before
  public void setUp() {try{__CLR4_4_120v420v4lb90pdos.R.inc(94470);
    __CLR4_4_120v420v4lb90pdos.R.inc(94471);pb = new TestProblem3(0.9);
    __CLR4_4_120v420v4lb90pdos.R.inc(94472);double minStep = 0;
    __CLR4_4_120v420v4lb90pdos.R.inc(94473);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_120v420v4lb90pdos.R.inc(94474);integ = new DormandPrince54Integrator(minStep, maxStep, 10.e-8, 1.0e-8);
    __CLR4_4_120v420v4lb90pdos.R.inc(94475);lastSeen = false;
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  @After
  public void tearDown() {try{__CLR4_4_120v420v4lb90pdos.R.inc(94476);
    __CLR4_4_120v420v4lb90pdos.R.inc(94477);pb    = null;
    __CLR4_4_120v420v4lb90pdos.R.inc(94478);integ = null;
  }finally{__CLR4_4_120v420v4lb90pdos.R.flushNeeded();}}

  TestProblem3 pb;
  FirstOrderIntegrator integ;
  boolean lastSeen;

}
