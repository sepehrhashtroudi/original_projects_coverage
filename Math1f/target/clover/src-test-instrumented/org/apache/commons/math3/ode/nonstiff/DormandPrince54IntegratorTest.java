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

package org.apache.commons.math3.ode.nonstiff;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.TestProblem1;
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.TestProblem4;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.TestProblemAbstract;
import org.apache.commons.math3.ode.TestProblemHandler;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class DormandPrince54IntegratorTest {static class __CLR4_4_11zau1zaulb90pdkt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92587,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj1zau();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj1zau() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92406);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92407);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92408);DormandPrince54Integrator integrator = new DormandPrince54Integrator(0.0, 1.0,
                                                                           1.0e-10, 1.0e-10);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92409);integrator.integrate(pb,
                           0.0, new double[pb.getDimension()+10],
                           1.0, new double[pb.getDimension()+10]);
  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  @Test(expected=NumberIsTooSmallException.class)
  public void testMinStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13be1w31zay();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,116,101,112,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testMinStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13be1w31zay() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92410);

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92411);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92412);double minStep = 0.1 * (pb.getFinalTime() - pb.getInitialTime());
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92413);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92414);double[] vecAbsoluteTolerance = { 1.0e-15, 1.0e-16 };
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92415);double[] vecRelativeTolerance = { 1.0e-15, 1.0e-16 };

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92416);FirstOrderIntegrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                                 vecAbsoluteTolerance,
                                                                 vecRelativeTolerance);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92417);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92418);integ.addStepHandler(handler);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92419);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92420);Assert.fail("an exception should have been thrown");

  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  @Test
  public void testSmallLastStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhq93y1zb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testSmallLastStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhq93y1zb9() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92421);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92422);TestProblemAbstract pb = new TestProblem5();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92423);double minStep = 1.25;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92424);double maxStep = FastMath.abs(pb.getFinalTime() - pb.getInitialTime());
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92425);double scalAbsoluteTolerance = 6.0e-4;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92426);double scalRelativeTolerance = 6.0e-4;

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92427);AdaptiveStepsizeIntegrator integ =
      new DormandPrince54Integrator(minStep, maxStep,
                                    scalAbsoluteTolerance,
                                    scalRelativeTolerance);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92428);DP54SmallLastHandler handler = new DP54SmallLastHandler(minStep);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92429);integ.addStepHandler(handler);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92430);integ.setInitialStepSize(1.7);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92431);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92432);Assert.assertTrue(handler.wasLastSeen());
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92433);Assert.assertEquals("Dormand-Prince 5(4)", integ.getName());

  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg1zbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg1zbm() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92434);

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92435);TestProblem5 pb = new TestProblem5();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92436);double minStep = 0;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92437);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92438);double scalAbsoluteTolerance = 1.0e-8;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92439);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92440);FirstOrderIntegrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                                 scalAbsoluteTolerance,
                                                                 scalRelativeTolerance);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92441);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92442);integ.addStepHandler(handler);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92443);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92444);Assert.assertTrue(handler.getLastError() < 2.0e-7);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92445);Assert.assertTrue(handler.getMaximalValueError() < 2.0e-7);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92446);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92447);Assert.assertEquals("Dormand-Prince 5(4)", integ.getName());
  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  private static class DP54SmallLastHandler implements StepHandler {

    public DP54SmallLastHandler(double minStep) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92448);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92449);lastSeen = false;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92450);this.minStep = minStep;
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92451);
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

    public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92452);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92453);if ((((isLast)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92454)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92455)==0&false))) {{
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92456);lastSeen = true;
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92457);double h = interpolator.getCurrentTime() - interpolator.getPreviousTime();
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92458);Assert.assertTrue(FastMath.abs(h) < minStep);
      }
    }}finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

    public boolean wasLastSeen() {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92459);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92460);return lastSeen;
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

    private boolean lastSeen;
    private double  minStep;

  }

  @Test
  public void testIncreasingTolerance()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrawnx1zcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testIncreasingTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrawnx1zcd() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92461);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92462);int previousCalls = Integer.MAX_VALUE;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92463);for (int i = -12; (((i < -2)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92464)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92465)==0&false)); ++i) {{
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92466);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92467);double minStep = 0;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92468);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92469);double scalAbsoluteTolerance = FastMath.pow(10.0, i);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92470);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92471);EmbeddedRungeKuttaIntegrator integ =
          new DormandPrince54Integrator(minStep, maxStep,
                                        scalAbsoluteTolerance, scalRelativeTolerance);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92472);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92473);integ.setSafety(0.8);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92474);integ.setMaxGrowth(5.0);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92475);integ.setMinReduction(0.3);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92476);integ.addStepHandler(handler);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92477);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92478);Assert.assertEquals(0.8, integ.getSafety(), 1.0e-12);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92479);Assert.assertEquals(5.0, integ.getMaxGrowth(), 1.0e-12);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92480);Assert.assertEquals(0.3, integ.getMinReduction(), 1.0e-12);

      // the 0.7 factor is only valid for this test
      // and has been obtained from trial and error
      // there is no general relation between local and global errors
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92481);Assert.assertTrue(handler.getMaximalValueError() < (0.7 * scalAbsoluteTolerance));
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92482);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92483);int calls = pb.getCalls();
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92484);Assert.assertEquals(integ.getEvaluations(), calls);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92485);Assert.assertTrue(calls <= previousCalls);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92486);previousCalls = calls;

    }

  }}finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  @Test
  public void testEvents()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z71gy1zd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testEvents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z71gy1zd3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92487);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92488);TestProblem4 pb = new TestProblem4();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92489);double minStep = 0;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92490);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92491);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92492);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92493);FirstOrderIntegrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                               scalAbsoluteTolerance,
                                                               scalRelativeTolerance);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92494);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92495);integ.addStepHandler(handler);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92496);EventHandler[] functions = pb.getEventsHandlers();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92497);double convergence = 1.0e-8 * maxStep;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92498);for (int l = 0; (((l < functions.length)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92499)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92500)==0&false)); ++l) {{
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92501);integ.addEventHandler(functions[l],
                                 Double.POSITIVE_INFINITY, convergence, 1000);
    }
    }__CLR4_4_11zau1zaulb90pdkt.R.inc(92502);Assert.assertEquals(functions.length, integ.getEventHandlers().size());
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92503);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92504);Assert.assertTrue(handler.getMaximalValueError() < 5.0e-6);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92505);Assert.assertEquals(0, handler.getMaximalTimeError(), convergence);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92506);Assert.assertEquals(12.0, handler.getLastTime(), convergence);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92507);integ.clearEventHandlers();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92508);Assert.assertEquals(0, integ.getEventHandlers().size());

  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg1zdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg1zdp() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92509);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92510);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92511);double minStep = 0;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92512);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92513);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92514);double scalRelativeTolerance = scalAbsoluteTolerance;

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92515);FirstOrderIntegrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                               scalAbsoluteTolerance,
                                                               scalRelativeTolerance);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92516);integ.addStepHandler(new KeplerHandler(pb));
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92517);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92518);Assert.assertEquals(integ.getEvaluations(), pb.getCalls());
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92519);Assert.assertTrue(pb.getCalls() < 2800);

  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  @Test
  public void testVariableSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zau1zaulb90pdkt.R.globalSliceStart(getClass().getName(),92520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khlqo01ze0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zau1zaulb90pdkt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zau1zaulb90pdkt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest.testVariableSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khlqo01ze0() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92520);

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92521);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92522);double minStep = 0;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92523);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92524);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92525);double scalRelativeTolerance = scalAbsoluteTolerance;

    __CLR4_4_11zau1zaulb90pdkt.R.inc(92526);FirstOrderIntegrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                               scalAbsoluteTolerance,
                                                               scalRelativeTolerance);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92527);integ.addStepHandler(new VariableHandler());
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92528);double stopTime = integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                                      pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_11zau1zaulb90pdkt.R.inc(92529);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
  }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}

  private static class KeplerHandler implements StepHandler {
    public KeplerHandler(TestProblem3 pb) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92530);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92531);this.pb = pb;
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92532);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92533);nbSteps = 0;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92534);maxError = 0;
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator, boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92535);

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92536);++nbSteps;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92537);for (int a = 1; (((a < 10)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92538)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92539)==0&false)); ++a) {{

        __CLR4_4_11zau1zaulb90pdkt.R.inc(92540);double prev   = interpolator.getPreviousTime();
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92541);double curr   = interpolator.getCurrentTime();
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92542);double interp = ((10 - a) * prev + a * curr) / 10;
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92543);interpolator.setInterpolatedTime(interp);

        __CLR4_4_11zau1zaulb90pdkt.R.inc(92544);double[] interpolatedY = interpolator.getInterpolatedState ();
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92545);double[] theoreticalY  = pb.computeTheoreticalState(interpolator.getInterpolatedTime());
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92546);double dx = interpolatedY[0] - theoreticalY[0];
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92547);double dy = interpolatedY[1] - theoreticalY[1];
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92548);double error = dx * dx + dy * dy;
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92549);if ((((error > maxError)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92550)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92551)==0&false))) {{
          __CLR4_4_11zau1zaulb90pdkt.R.inc(92552);maxError = error;
        }
      }}
      }__CLR4_4_11zau1zaulb90pdkt.R.inc(92553);if ((((isLast)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92554)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92555)==0&false))) {{
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92556);Assert.assertTrue(maxError < 7.0e-10);
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92557);Assert.assertTrue(nbSteps < 400);
      }
    }}finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}
    private int nbSteps;
    private double maxError;
    private TestProblem3 pb;
  }

  private static class VariableHandler implements StepHandler {
    public VariableHandler() {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92558);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92559);firstTime = true;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92560);minStep = 0;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92561);maxStep = 0;
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92562);
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92563);firstTime = true;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92564);minStep = 0;
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92565);maxStep = 0;
    }finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator,
                           boolean isLast) {try{__CLR4_4_11zau1zaulb90pdkt.R.inc(92566);

      __CLR4_4_11zau1zaulb90pdkt.R.inc(92567);double step = FastMath.abs(interpolator.getCurrentTime()
                             - interpolator.getPreviousTime());
      __CLR4_4_11zau1zaulb90pdkt.R.inc(92568);if ((((firstTime)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92569)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92570)==0&false))) {{
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92571);minStep   = FastMath.abs(step);
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92572);maxStep   = minStep;
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92573);firstTime = false;
      } }else {{
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92574);if ((((step < minStep)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92575)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92576)==0&false))) {{
          __CLR4_4_11zau1zaulb90pdkt.R.inc(92577);minStep = step;
        }
        }__CLR4_4_11zau1zaulb90pdkt.R.inc(92578);if ((((step > maxStep)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92579)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92580)==0&false))) {{
          __CLR4_4_11zau1zaulb90pdkt.R.inc(92581);maxStep = step;
        }
      }}

      }__CLR4_4_11zau1zaulb90pdkt.R.inc(92582);if ((((isLast)&&(__CLR4_4_11zau1zaulb90pdkt.R.iget(92583)!=0|true))||(__CLR4_4_11zau1zaulb90pdkt.R.iget(92584)==0&false))) {{
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92585);Assert.assertTrue(minStep < (1.0 / 450.0));
        __CLR4_4_11zau1zaulb90pdkt.R.inc(92586);Assert.assertTrue(maxStep > (1.0 / 4.2));
      }
    }}finally{__CLR4_4_11zau1zaulb90pdkt.R.flushNeeded();}}
    private boolean firstTime;
    private double  minStep;
    private double  maxStep;
  }

}
