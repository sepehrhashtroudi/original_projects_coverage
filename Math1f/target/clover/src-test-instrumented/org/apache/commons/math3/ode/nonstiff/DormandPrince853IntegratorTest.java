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
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.TestProblem1;
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.TestProblem4;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.TestProblemHandler;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class DormandPrince853IntegratorTest {static class __CLR4_4_11zhy1zhylb90pdlj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testMissedEndEvent()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zba59v1zhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testMissedEndEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zba59v1zhy() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92662);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92663);final double   t0     = 1878250320.0000029;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92664);final double   tEvent = 1878250379.9999986;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92665);final double[] k  = { 1.0e-4, 1.0e-5, 1.0e-6 };
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92666);FirstOrderDifferentialEquations ode = new FirstOrderDifferentialEquations() {

          public int getDimension() {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92667);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92668);return k.length;
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

          public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92669);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92670);for (int i = 0; (((i < y.length)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92671)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92672)==0&false)); ++i) {{
                  __CLR4_4_11zhy1zhylb90pdlj.R.inc(92673);yDot[i] = k[i] * y[i];
              }
          }}finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
      };

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92674);DormandPrince853Integrator integrator = new DormandPrince853Integrator(0.0, 100.0,
                                                                             1.0e-10, 1.0e-10);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92675);double[] y0   = new double[k.length];
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92676);for (int i = 0; (((i < y0.length)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92677)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92678)==0&false)); ++i) {{
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92679);y0[i] = i + 1;
      }
      }__CLR4_4_11zhy1zhylb90pdlj.R.inc(92680);double[] y    = new double[k.length];

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92681);integrator.setInitialStepSize(60.0);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92682);double finalT = integrator.integrate(ode, t0, y0, tEvent, y);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92683);Assert.assertEquals(tEvent, finalT, 5.0e-6);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92684);for (int i = 0; (((i < y.length)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92685)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92686)==0&false)); ++i) {{
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92687);Assert.assertEquals(y0[i] * FastMath.exp(k[i] * (finalT - t0)), y[i], 1.0e-9);
      }

      }__CLR4_4_11zhy1zhylb90pdlj.R.inc(92688);integrator.setInitialStepSize(60.0);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92689);integrator.addEventHandler(new EventHandler() {

          public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92690);
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

          public void resetState(double t, double[] y) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92691);
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

          public double g(double t, double[] y) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92692);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92693);return t - tEvent;
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

          public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92694);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92695);Assert.assertEquals(tEvent, t, 5.0e-6);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92696);return Action.CONTINUE;
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
      }, Double.POSITIVE_INFINITY, 1.0e-20, 100);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92697);finalT = integrator.integrate(ode, t0, y0, tEvent + 120, y);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92698);Assert.assertEquals(tEvent + 120, finalT, 5.0e-6);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92699);for (int i = 0; (((i < y.length)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92700)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92701)==0&false)); ++i) {{
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92702);Assert.assertEquals(y0[i] * FastMath.exp(k[i] * (finalT - t0)), y[i], 1.0e-9);
      }

  }}finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj1zj3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj1zj3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92703);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92704);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92705);DormandPrince853Integrator integrator = new DormandPrince853Integrator(0.0, 1.0,
                                                                             1.0e-10, 1.0e-10);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92706);integrator.integrate(pb,
                           0.0, new double[pb.getDimension()+10],
                           1.0, new double[pb.getDimension()+10]);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92707);Assert.fail("an exception should have been thrown");
  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test(expected=NumberIsTooSmallException.class)
  public void testNullIntervalCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abyr9t1zj8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,73,110,116,101,114,118,97,108,67,104,101,99,107,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testNullIntervalCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92708,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abyr9t1zj8() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92708);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92709);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92710);DormandPrince853Integrator integrator = new DormandPrince853Integrator(0.0, 1.0,
                                                                             1.0e-10, 1.0e-10);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92711);integrator.integrate(pb,
                           0.0, new double[pb.getDimension()],
                           0.0, new double[pb.getDimension()]);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92712);Assert.fail("an exception should have been thrown");
  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test(expected=NumberIsTooSmallException.class)
  public void testMinStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13be1w31zjd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,116,101,112,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testMinStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13be1w31zjd() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92713);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92714);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92715);double minStep = 0.1 * (pb.getFinalTime() - pb.getInitialTime());
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92716);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92717);double[] vecAbsoluteTolerance = { 1.0e-15, 1.0e-16 };
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92718);double[] vecRelativeTolerance = { 1.0e-15, 1.0e-16 };

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92719);FirstOrderIntegrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                  vecAbsoluteTolerance,
                                                                  vecRelativeTolerance);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92720);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92721);integ.addStepHandler(handler);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92722);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92723);Assert.fail("an exception should have been thrown");

  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testIncreasingTolerance()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrawnx1zjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testIncreasingTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrawnx1zjo() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92724);

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92725);int previousCalls = Integer.MAX_VALUE;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92726);AdaptiveStepsizeIntegrator integ =
        new DormandPrince853Integrator(0, Double.POSITIVE_INFINITY,
                                       Double.NaN, Double.NaN);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92727);for (int i = -12; (((i < -2)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92728)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92729)==0&false)); ++i) {{
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92730);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92731);double minStep = 0;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92732);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92733);double scalAbsoluteTolerance = FastMath.pow(10.0, i);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92734);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92735);integ.setStepSizeControl(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92736);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92737);integ.addStepHandler(handler);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92738);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      // the 1.3 factor is only valid for this test
      // and has been obtained from trial and error
      // there is no general relation between local and global errors
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92739);Assert.assertTrue(handler.getMaximalValueError() < (1.3 * scalAbsoluteTolerance));
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92740);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92741);int calls = pb.getCalls();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92742);Assert.assertEquals(integ.getEvaluations(), calls);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92743);Assert.assertTrue(calls <= previousCalls);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92744);previousCalls = calls;

    }

  }}finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testTooLargeFirstStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bbj3q1zk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testTooLargeFirstStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bbj3q1zk9() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92745);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92746);AdaptiveStepsizeIntegrator integ =
              new DormandPrince853Integrator(0, Double.POSITIVE_INFINITY, Double.NaN, Double.NaN);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92747);final double start = 0.0;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92748);final double end   = 0.001;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92749);FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {

          public int getDimension() {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92750);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92751);return 1;
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

          public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92752);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92753);Assert.assertTrue(t >= FastMath.nextAfter(start, Double.NEGATIVE_INFINITY));
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92754);Assert.assertTrue(t <= FastMath.nextAfter(end,   Double.POSITIVE_INFINITY));
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92755);yDot[0] = -100.0 * y[0];
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      };

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92756);integ.setStepSizeControl(0, 1.0, 1.0e-6, 1.0e-8);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92757);integ.integrate(equations, start, new double[] { 1.0 }, end, new double[1]);

  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg1zkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg1zkm() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92758);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92759);TestProblem5 pb = new TestProblem5();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92760);double minStep = 0;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92761);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92762);double scalAbsoluteTolerance = 1.0e-8;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92763);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92764);FirstOrderIntegrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                  scalAbsoluteTolerance,
                                                                  scalRelativeTolerance);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92765);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92766);integ.addStepHandler(handler);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92767);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92768);Assert.assertTrue(handler.getLastError() < 1.1e-7);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92769);Assert.assertTrue(handler.getMaximalValueError() < 1.1e-7);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92770);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92771);Assert.assertEquals("Dormand-Prince 8 (5, 3)", integ.getName());
  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testEvents()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z71gy1zl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testEvents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z71gy1zl0() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92772);

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92773);TestProblem4 pb = new TestProblem4();
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92774);double minStep = 0;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92775);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92776);double scalAbsoluteTolerance = 1.0e-9;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92777);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92778);FirstOrderIntegrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                scalAbsoluteTolerance,
                                                                scalRelativeTolerance);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92779);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92780);integ.addStepHandler(handler);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92781);EventHandler[] functions = pb.getEventsHandlers();
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92782);double convergence = 1.0e-8 * maxStep;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92783);for (int l = 0; (((l < functions.length)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92784)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92785)==0&false)); ++l) {{
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92786);integ.addEventHandler(functions[l], Double.POSITIVE_INFINITY, convergence, 1000);
    }
    }__CLR4_4_11zhy1zhylb90pdlj.R.inc(92787);Assert.assertEquals(functions.length, integ.getEventHandlers().size());
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92788);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92789);Assert.assertEquals(0, handler.getMaximalValueError(), 2.1e-7);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92790);Assert.assertEquals(0, handler.getMaximalTimeError(), convergence);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92791);Assert.assertEquals(12.0, handler.getLastTime(), convergence);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92792);integ.clearEventHandlers();
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92793);Assert.assertEquals(0, integ.getEventHandlers().size());

  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg1zlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg1zlm() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92794);

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92795);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92796);double minStep = 0;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92797);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92798);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92799);double scalRelativeTolerance = scalAbsoluteTolerance;

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92800);FirstOrderIntegrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                scalAbsoluteTolerance,
                                                                scalRelativeTolerance);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92801);integ.addStepHandler(new KeplerHandler(pb));
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92802);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92803);Assert.assertEquals(integ.getEvaluations(), pb.getCalls());
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92804);Assert.assertTrue(pb.getCalls() < 3300);

  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testVariableSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khlqo01zlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testVariableSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khlqo01zlx() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92805);

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92806);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92807);double minStep = 0;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92808);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92809);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92810);double scalRelativeTolerance = scalAbsoluteTolerance;

    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92811);FirstOrderIntegrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                               scalAbsoluteTolerance,
                                                               scalRelativeTolerance);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92812);integ.addStepHandler(new VariableHandler());
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92813);double stopTime = integ.integrate(pb,
                                      pb.getInitialTime(), pb.getInitialState(),
                                      pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92814);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92815);Assert.assertEquals("Dormand-Prince 8 (5, 3)", integ.getName());
  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testUnstableDerivative()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6z7o41zm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testUnstableDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6z7o41zm8() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92816);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92817);final StepProblem stepProblem = new StepProblem(0.0, 1.0, 2.0);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92818);FirstOrderIntegrator integ =
      new DormandPrince853Integrator(0.1, 10, 1.0e-12, 0.0);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92819);integ.addEventHandler(stepProblem, 1.0, 1.0e-12, 1000);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92820);double[] y = { Double.NaN };
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92821);integ.integrate(stepProblem, 0.0, new double[] { 0.0 }, 10.0, y);
    __CLR4_4_11zhy1zhylb90pdlj.R.inc(92822);Assert.assertEquals(8.0, y[0], 1.0e-12);
  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  @Test
  public void testEventsScheduling() {__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceStart(getClass().getName(),92823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1to4hwm1zmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zhy1zhylb90pdlj.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zhy1zhylb90pdlj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest.testEventsScheduling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1to4hwm1zmf(){try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92823);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92824);FirstOrderDifferentialEquations sincos = new FirstOrderDifferentialEquations() {

          public int getDimension() {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92825);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92826);return 2;
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

          public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92827);
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92828);yDot[0] =  y[1];
              __CLR4_4_11zhy1zhylb90pdlj.R.inc(92829);yDot[1] = -y[0];
          }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      };

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92830);SchedulingChecker sinChecker = new SchedulingChecker(0); // events at 0, PI, 2PI ...
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92831);SchedulingChecker cosChecker = new SchedulingChecker(1); // events at PI/2, 3PI/2, 5PI/2 ...

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92832);FirstOrderIntegrator integ =
              new DormandPrince853Integrator(0.001, 1.0, 1.0e-12, 0.0);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92833);integ.addEventHandler(sinChecker, 0.01, 1.0e-7, 100);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92834);integ.addStepHandler(sinChecker);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92835);integ.addEventHandler(cosChecker, 0.01, 1.0e-7, 100);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92836);integ.addStepHandler(cosChecker);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92837);double   t0 = 0.5;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92838);double[] y0 = new double[] { FastMath.sin(t0), FastMath.cos(t0) };
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92839);double   t  = 10.0;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92840);double[] y  = new double[2];
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92841);integ.integrate(sincos, t0, y0, t, y);

  }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  private static class SchedulingChecker implements StepHandler, EventHandler {

      int index;
      double tMin;

      public SchedulingChecker(int index) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92842);
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92843);this.index = index;
      }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92844);
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92845);tMin = t0;
      }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92846);
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92847);tMin = interpolator.getCurrentTime();
      }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      public double g(double t, double[]  y) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92848);
          // once a step has been handled by handleStep,
          // events checking should only refer to dates after the step
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92849);Assert.assertTrue(t >= tMin);
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92850);return y[index];
      }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92851);
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92852);return Action.RESET_STATE;
      }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

      public void resetState(double t, double[] y) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92853);
          // in fact, we don't need to reset anything for the test
      }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}

  }

  private static class KeplerHandler implements StepHandler {
    public KeplerHandler(TestProblem3 pb) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92854);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92855);this.pb = pb;
    }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92856);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92857);nbSteps = 0;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92858);maxError = 0;
    }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator, boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92859);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92860);++nbSteps;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92861);for (int a = 1; (((a < 10)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92862)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92863)==0&false)); ++a) {{

        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92864);double prev   = interpolator.getPreviousTime();
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92865);double curr   = interpolator.getCurrentTime();
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92866);double interp = ((10 - a) * prev + a * curr) / 10;
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92867);interpolator.setInterpolatedTime(interp);

        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92868);double[] interpolatedY = interpolator.getInterpolatedState ();
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92869);double[] theoreticalY  = pb.computeTheoreticalState(interpolator.getInterpolatedTime());
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92870);double dx = interpolatedY[0] - theoreticalY[0];
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92871);double dy = interpolatedY[1] - theoreticalY[1];
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92872);double error = dx * dx + dy * dy;
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92873);if ((((error > maxError)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92874)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92875)==0&false))) {{
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92876);maxError = error;
        }
      }}
      }__CLR4_4_11zhy1zhylb90pdlj.R.inc(92877);if ((((isLast)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92878)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92879)==0&false))) {{
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92880);Assert.assertTrue(maxError < 2.4e-10);
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92881);Assert.assertTrue(nbSteps < 150);
      }
    }}finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
    private int nbSteps;
    private double maxError;
    private TestProblem3 pb;
  }

  private static class VariableHandler implements StepHandler {
    public VariableHandler() {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92882);
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92883);firstTime = true;
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92884);minStep = 0;
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92885);maxStep = 0;
    }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92886);
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92887);firstTime = true;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92888);minStep = 0;
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92889);maxStep = 0;
    }finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator,
                           boolean isLast) {try{__CLR4_4_11zhy1zhylb90pdlj.R.inc(92890);

      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92891);double step = FastMath.abs(interpolator.getCurrentTime()
                             - interpolator.getPreviousTime());
      __CLR4_4_11zhy1zhylb90pdlj.R.inc(92892);if ((((firstTime)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92893)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92894)==0&false))) {{
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92895);minStep   = FastMath.abs(step);
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92896);maxStep   = minStep;
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92897);firstTime = false;
      } }else {{
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92898);if ((((step < minStep)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92899)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92900)==0&false))) {{
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92901);minStep = step;
        }
        }__CLR4_4_11zhy1zhylb90pdlj.R.inc(92902);if ((((step > maxStep)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92903)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92904)==0&false))) {{
          __CLR4_4_11zhy1zhylb90pdlj.R.inc(92905);maxStep = step;
        }
      }}

      }__CLR4_4_11zhy1zhylb90pdlj.R.inc(92906);if ((((isLast)&&(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92907)!=0|true))||(__CLR4_4_11zhy1zhylb90pdlj.R.iget(92908)==0&false))) {{
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92909);Assert.assertTrue(minStep < (1.0 / 100.0));
        __CLR4_4_11zhy1zhylb90pdlj.R.inc(92910);Assert.assertTrue(maxStep > (1.0 / 2.0));
      }
    }}finally{__CLR4_4_11zhy1zhylb90pdlj.R.flushNeeded();}}
    private boolean firstTime = true;
    private double  minStep = 0;
    private double  maxStep = 0;
  }

}
