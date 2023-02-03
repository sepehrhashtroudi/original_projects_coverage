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
import org.apache.commons.math3.ode.TestProblemAbstract;
import org.apache.commons.math3.ode.TestProblemHandler;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class GraggBulirschStoerIntegratorTest {static class __CLR4_4_1200k200klb90pdn0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj200k();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj200k() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93332);
      __CLR4_4_1200k200klb90pdn0.R.inc(93333);TestProblem1 pb = new TestProblem1();
      __CLR4_4_1200k200klb90pdn0.R.inc(93334);AdaptiveStepsizeIntegrator integrator =
        new GraggBulirschStoerIntegrator(0.0, 1.0, 1.0e-10, 1.0e-10);
      __CLR4_4_1200k200klb90pdn0.R.inc(93335);integrator.integrate(pb,
                           0.0, new double[pb.getDimension()+10],
                           1.0, new double[pb.getDimension()+10]);
  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test(expected=NumberIsTooSmallException.class)
  public void testNullIntervalCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abyr9t200o();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,73,110,116,101,114,118,97,108,67,104,101,99,107,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testNullIntervalCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abyr9t200o() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93336);
      __CLR4_4_1200k200klb90pdn0.R.inc(93337);TestProblem1 pb = new TestProblem1();
      __CLR4_4_1200k200klb90pdn0.R.inc(93338);GraggBulirschStoerIntegrator integrator =
        new GraggBulirschStoerIntegrator(0.0, 1.0, 1.0e-10, 1.0e-10);
      __CLR4_4_1200k200klb90pdn0.R.inc(93339);integrator.integrate(pb,
                           0.0, new double[pb.getDimension()],
                           0.0, new double[pb.getDimension()]);
  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test(expected=NumberIsTooSmallException.class)
  public void testMinStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13be1w3200s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,116,101,112,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testMinStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13be1w3200s() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93340);

      __CLR4_4_1200k200klb90pdn0.R.inc(93341);TestProblem5 pb  = new TestProblem5();
      __CLR4_4_1200k200klb90pdn0.R.inc(93342);double minStep   = 0.1 * FastMath.abs(pb.getFinalTime() - pb.getInitialTime());
      __CLR4_4_1200k200klb90pdn0.R.inc(93343);double maxStep   = FastMath.abs(pb.getFinalTime() - pb.getInitialTime());
      __CLR4_4_1200k200klb90pdn0.R.inc(93344);double[] vecAbsoluteTolerance = { 1.0e-20, 1.0e-21 };
      __CLR4_4_1200k200klb90pdn0.R.inc(93345);double[] vecRelativeTolerance = { 1.0e-20, 1.0e-21 };

      __CLR4_4_1200k200klb90pdn0.R.inc(93346);FirstOrderIntegrator integ =
        new GraggBulirschStoerIntegrator(minStep, maxStep,
                                         vecAbsoluteTolerance, vecRelativeTolerance);
      __CLR4_4_1200k200klb90pdn0.R.inc(93347);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1200k200klb90pdn0.R.inc(93348);integ.addStepHandler(handler);
      __CLR4_4_1200k200klb90pdn0.R.inc(93349);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg2012();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg2012() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93350);

      __CLR4_4_1200k200klb90pdn0.R.inc(93351);TestProblem5 pb = new TestProblem5();
      __CLR4_4_1200k200klb90pdn0.R.inc(93352);double minStep = 0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93353);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_1200k200klb90pdn0.R.inc(93354);double scalAbsoluteTolerance = 1.0e-8;
      __CLR4_4_1200k200klb90pdn0.R.inc(93355);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_1200k200klb90pdn0.R.inc(93356);FirstOrderIntegrator integ = new GraggBulirschStoerIntegrator(minStep, maxStep,
                                                                    scalAbsoluteTolerance,
                                                                    scalRelativeTolerance);
      __CLR4_4_1200k200klb90pdn0.R.inc(93357);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1200k200klb90pdn0.R.inc(93358);integ.addStepHandler(handler);
      __CLR4_4_1200k200klb90pdn0.R.inc(93359);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_1200k200klb90pdn0.R.inc(93360);Assert.assertTrue(handler.getLastError() < 7.5e-9);
      __CLR4_4_1200k200klb90pdn0.R.inc(93361);Assert.assertTrue(handler.getMaximalValueError() < 8.1e-9);
      __CLR4_4_1200k200klb90pdn0.R.inc(93362);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_1200k200klb90pdn0.R.inc(93363);Assert.assertEquals("Gragg-Bulirsch-Stoer", integ.getName());
  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testIncreasingTolerance()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrawnx201g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testIncreasingTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrawnx201g() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93364);

    __CLR4_4_1200k200klb90pdn0.R.inc(93365);int previousCalls = Integer.MAX_VALUE;
    __CLR4_4_1200k200klb90pdn0.R.inc(93366);for (int i = -12; (((i < -4)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93367)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93368)==0&false)); ++i) {{
      __CLR4_4_1200k200klb90pdn0.R.inc(93369);TestProblem1 pb     = new TestProblem1();
      __CLR4_4_1200k200klb90pdn0.R.inc(93370);double minStep      = 0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93371);double maxStep      = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_1200k200klb90pdn0.R.inc(93372);double absTolerance = FastMath.pow(10.0, i);
      __CLR4_4_1200k200klb90pdn0.R.inc(93373);double relTolerance = absTolerance;

      __CLR4_4_1200k200klb90pdn0.R.inc(93374);FirstOrderIntegrator integ =
        new GraggBulirschStoerIntegrator(minStep, maxStep,
                                         absTolerance, relTolerance);
      __CLR4_4_1200k200klb90pdn0.R.inc(93375);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1200k200klb90pdn0.R.inc(93376);integ.addStepHandler(handler);
      __CLR4_4_1200k200klb90pdn0.R.inc(93377);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      // the coefficients are only valid for this test
      // and have been obtained from trial and error
      // there is no general relation between local and global errors
      __CLR4_4_1200k200klb90pdn0.R.inc(93378);double ratio =  handler.getMaximalValueError() / absTolerance;
      __CLR4_4_1200k200klb90pdn0.R.inc(93379);Assert.assertTrue(ratio < 2.4);
      __CLR4_4_1200k200klb90pdn0.R.inc(93380);Assert.assertTrue(ratio > 0.02);
      __CLR4_4_1200k200klb90pdn0.R.inc(93381);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

      __CLR4_4_1200k200klb90pdn0.R.inc(93382);int calls = pb.getCalls();
      __CLR4_4_1200k200klb90pdn0.R.inc(93383);Assert.assertEquals(integ.getEvaluations(), calls);
      __CLR4_4_1200k200klb90pdn0.R.inc(93384);Assert.assertTrue(calls <= previousCalls);
      __CLR4_4_1200k200klb90pdn0.R.inc(93385);previousCalls = calls;

    }

  }}finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testIntegratorControls()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19t0j5y2022();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testIntegratorControls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19t0j5y2022() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93386);

    __CLR4_4_1200k200klb90pdn0.R.inc(93387);TestProblem3 pb = new TestProblem3(0.999);
    __CLR4_4_1200k200klb90pdn0.R.inc(93388);GraggBulirschStoerIntegrator integ =
        new GraggBulirschStoerIntegrator(0, pb.getFinalTime() - pb.getInitialTime(),
                1.0e-8, 1.0e-10);

    __CLR4_4_1200k200klb90pdn0.R.inc(93389);double errorWithDefaultSettings = getMaxError(integ, pb);

    // stability control
    __CLR4_4_1200k200klb90pdn0.R.inc(93390);integ.setStabilityCheck(true, 2, 1, 0.99);
    __CLR4_4_1200k200klb90pdn0.R.inc(93391);Assert.assertTrue(errorWithDefaultSettings < getMaxError(integ, pb));
    __CLR4_4_1200k200klb90pdn0.R.inc(93392);integ.setStabilityCheck(true, -1, -1, -1);

    __CLR4_4_1200k200klb90pdn0.R.inc(93393);integ.setControlFactors(0.5, 0.99, 0.1, 2.5);
    __CLR4_4_1200k200klb90pdn0.R.inc(93394);Assert.assertTrue(errorWithDefaultSettings < getMaxError(integ, pb));
    __CLR4_4_1200k200klb90pdn0.R.inc(93395);integ.setControlFactors(-1, -1, -1, -1);

    __CLR4_4_1200k200klb90pdn0.R.inc(93396);integ.setOrderControl(10, 0.7, 0.95);
    __CLR4_4_1200k200klb90pdn0.R.inc(93397);Assert.assertTrue(errorWithDefaultSettings < getMaxError(integ, pb));
    __CLR4_4_1200k200klb90pdn0.R.inc(93398);integ.setOrderControl(-1, -1, -1);

    __CLR4_4_1200k200klb90pdn0.R.inc(93399);integ.setInterpolationControl(true, 3);
    __CLR4_4_1200k200klb90pdn0.R.inc(93400);Assert.assertTrue(errorWithDefaultSettings < getMaxError(integ, pb));
    __CLR4_4_1200k200klb90pdn0.R.inc(93401);integ.setInterpolationControl(true, -1);

  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  private double getMaxError(FirstOrderIntegrator integrator, TestProblemAbstract pb)
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {try{__CLR4_4_1200k200klb90pdn0.R.inc(93402);
      __CLR4_4_1200k200klb90pdn0.R.inc(93403);TestProblemHandler handler = new TestProblemHandler(pb, integrator);
      __CLR4_4_1200k200klb90pdn0.R.inc(93404);integrator.addStepHandler(handler);
      __CLR4_4_1200k200klb90pdn0.R.inc(93405);integrator.integrate(pb,
                           pb.getInitialTime(), pb.getInitialState(),
                           pb.getFinalTime(), new double[pb.getDimension()]);
      __CLR4_4_1200k200klb90pdn0.R.inc(93406);return handler.getMaximalValueError();
  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testEvents()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z71gy202n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testEvents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z71gy202n() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93407);

    __CLR4_4_1200k200klb90pdn0.R.inc(93408);TestProblem4 pb = new TestProblem4();
    __CLR4_4_1200k200klb90pdn0.R.inc(93409);double minStep = 0;
    __CLR4_4_1200k200klb90pdn0.R.inc(93410);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_1200k200klb90pdn0.R.inc(93411);double scalAbsoluteTolerance = 1.0e-10;
    __CLR4_4_1200k200klb90pdn0.R.inc(93412);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

    __CLR4_4_1200k200klb90pdn0.R.inc(93413);FirstOrderIntegrator integ = new GraggBulirschStoerIntegrator(minStep, maxStep,
                                                                  scalAbsoluteTolerance,
                                                                  scalRelativeTolerance);
    __CLR4_4_1200k200klb90pdn0.R.inc(93414);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_1200k200klb90pdn0.R.inc(93415);integ.addStepHandler(handler);
    __CLR4_4_1200k200klb90pdn0.R.inc(93416);EventHandler[] functions = pb.getEventsHandlers();
    __CLR4_4_1200k200klb90pdn0.R.inc(93417);double convergence = 1.0e-8 * maxStep;
    __CLR4_4_1200k200klb90pdn0.R.inc(93418);for (int l = 0; (((l < functions.length)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93419)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93420)==0&false)); ++l) {{
      __CLR4_4_1200k200klb90pdn0.R.inc(93421);integ.addEventHandler(functions[l], Double.POSITIVE_INFINITY, convergence, 1000);
    }
    }__CLR4_4_1200k200klb90pdn0.R.inc(93422);Assert.assertEquals(functions.length, integ.getEventHandlers().size());
    __CLR4_4_1200k200klb90pdn0.R.inc(93423);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_1200k200klb90pdn0.R.inc(93424);Assert.assertTrue(handler.getMaximalValueError() < 4.0e-7);
    __CLR4_4_1200k200klb90pdn0.R.inc(93425);Assert.assertEquals(0, handler.getMaximalTimeError(), convergence);
    __CLR4_4_1200k200klb90pdn0.R.inc(93426);Assert.assertEquals(12.0, handler.getLastTime(), convergence);
    __CLR4_4_1200k200klb90pdn0.R.inc(93427);integ.clearEventHandlers();
    __CLR4_4_1200k200klb90pdn0.R.inc(93428);Assert.assertEquals(0, integ.getEventHandlers().size());

  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg2039();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg2039() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93429);

    __CLR4_4_1200k200klb90pdn0.R.inc(93430);final TestProblem3 pb = new TestProblem3(0.9);
    __CLR4_4_1200k200klb90pdn0.R.inc(93431);double minStep        = 0;
    __CLR4_4_1200k200klb90pdn0.R.inc(93432);double maxStep        = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_1200k200klb90pdn0.R.inc(93433);double absTolerance   = 1.0e-6;
    __CLR4_4_1200k200klb90pdn0.R.inc(93434);double relTolerance   = 1.0e-6;

    __CLR4_4_1200k200klb90pdn0.R.inc(93435);FirstOrderIntegrator integ =
      new GraggBulirschStoerIntegrator(minStep, maxStep,
                                       absTolerance, relTolerance);
    __CLR4_4_1200k200klb90pdn0.R.inc(93436);integ.addStepHandler(new KeplerStepHandler(pb));
    __CLR4_4_1200k200klb90pdn0.R.inc(93437);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_1200k200klb90pdn0.R.inc(93438);Assert.assertEquals(integ.getEvaluations(), pb.getCalls());
    __CLR4_4_1200k200klb90pdn0.R.inc(93439);Assert.assertTrue(pb.getCalls() < 2150);

  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testVariableSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khlqo0203k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testVariableSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khlqo0203k() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93440);

    __CLR4_4_1200k200klb90pdn0.R.inc(93441);final TestProblem3 pb = new TestProblem3(0.9);
    __CLR4_4_1200k200klb90pdn0.R.inc(93442);double minStep        = 0;
    __CLR4_4_1200k200klb90pdn0.R.inc(93443);double maxStep        = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_1200k200klb90pdn0.R.inc(93444);double absTolerance   = 1.0e-8;
    __CLR4_4_1200k200klb90pdn0.R.inc(93445);double relTolerance   = 1.0e-8;
    __CLR4_4_1200k200klb90pdn0.R.inc(93446);FirstOrderIntegrator integ =
      new GraggBulirschStoerIntegrator(minStep, maxStep,
                                       absTolerance, relTolerance);
    __CLR4_4_1200k200klb90pdn0.R.inc(93447);integ.addStepHandler(new VariableStepHandler());
    __CLR4_4_1200k200klb90pdn0.R.inc(93448);double stopTime = integ.integrate(pb,
                                      pb.getInitialTime(), pb.getInitialState(),
                                      pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_1200k200klb90pdn0.R.inc(93449);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
    __CLR4_4_1200k200klb90pdn0.R.inc(93450);Assert.assertEquals("Gragg-Bulirsch-Stoer", integ.getName());
  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testTooLargeFirstStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19bbj3q203v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testTooLargeFirstStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19bbj3q203v() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93451);

      __CLR4_4_1200k200klb90pdn0.R.inc(93452);AdaptiveStepsizeIntegrator integ =
              new GraggBulirschStoerIntegrator(0, Double.POSITIVE_INFINITY, Double.NaN, Double.NaN);
      __CLR4_4_1200k200klb90pdn0.R.inc(93453);final double start = 0.0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93454);final double end   = 0.001;
      __CLR4_4_1200k200klb90pdn0.R.inc(93455);FirstOrderDifferentialEquations equations = new FirstOrderDifferentialEquations() {

          public int getDimension() {try{__CLR4_4_1200k200klb90pdn0.R.inc(93456);
              __CLR4_4_1200k200klb90pdn0.R.inc(93457);return 1;
          }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

          public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93458);
              __CLR4_4_1200k200klb90pdn0.R.inc(93459);Assert.assertTrue(t >= FastMath.nextAfter(start, Double.NEGATIVE_INFINITY));
              __CLR4_4_1200k200klb90pdn0.R.inc(93460);Assert.assertTrue(t <= FastMath.nextAfter(end,   Double.POSITIVE_INFINITY));
              __CLR4_4_1200k200klb90pdn0.R.inc(93461);yDot[0] = -100.0 * y[0];
          }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

      };

      __CLR4_4_1200k200klb90pdn0.R.inc(93462);integ.setStepSizeControl(0, 1.0, 1.0e-6, 1.0e-8);
      __CLR4_4_1200k200klb90pdn0.R.inc(93463);integ.integrate(equations, start, new double[] { 1.0 }, end, new double[1]);

  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testUnstableDerivative()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6z7o42048();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testUnstableDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6z7o42048() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93464);
    __CLR4_4_1200k200klb90pdn0.R.inc(93465);final StepProblem stepProblem = new StepProblem(0.0, 1.0, 2.0);
    __CLR4_4_1200k200klb90pdn0.R.inc(93466);FirstOrderIntegrator integ =
      new GraggBulirschStoerIntegrator(0.1, 10, 1.0e-12, 0.0);
    __CLR4_4_1200k200klb90pdn0.R.inc(93467);integ.addEventHandler(stepProblem, 1.0, 1.0e-12, 1000);
    __CLR4_4_1200k200klb90pdn0.R.inc(93468);double[] y = { Double.NaN };
    __CLR4_4_1200k200klb90pdn0.R.inc(93469);integ.integrate(stepProblem, 0.0, new double[] { 0.0 }, 10.0, y);
    __CLR4_4_1200k200klb90pdn0.R.inc(93470);Assert.assertEquals(8.0, y[0], 1.0e-12);
  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  @Test
  public void testIssue596()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1200k200klb90pdn0.R.globalSliceStart(getClass().getName(),93471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nudi5u204f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1200k200klb90pdn0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1200k200klb90pdn0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegratorTest.testIssue596",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nudi5u204f() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1200k200klb90pdn0.R.inc(93471);
    __CLR4_4_1200k200klb90pdn0.R.inc(93472);FirstOrderIntegrator integ = new GraggBulirschStoerIntegrator(1e-10, 100.0, 1e-7, 1e-7);
      __CLR4_4_1200k200klb90pdn0.R.inc(93473);integ.addStepHandler(new StepHandler() {

          public void init(double t0, double[] y0, double t) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93474);
          }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

          public void handleStep(StepInterpolator interpolator, boolean isLast)
              throws MaxCountExceededException {try{__CLR4_4_1200k200klb90pdn0.R.inc(93475);
              __CLR4_4_1200k200klb90pdn0.R.inc(93476);double t = interpolator.getCurrentTime();
              __CLR4_4_1200k200klb90pdn0.R.inc(93477);interpolator.setInterpolatedTime(t);
              __CLR4_4_1200k200klb90pdn0.R.inc(93478);double[] y = interpolator.getInterpolatedState();
              __CLR4_4_1200k200klb90pdn0.R.inc(93479);double[] yDot = interpolator.getInterpolatedDerivatives();
              __CLR4_4_1200k200klb90pdn0.R.inc(93480);Assert.assertEquals(3.0 * t - 5.0, y[0], 1.0e-14);
              __CLR4_4_1200k200klb90pdn0.R.inc(93481);Assert.assertEquals(3.0, yDot[0], 1.0e-14);
          }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
      });
      __CLR4_4_1200k200klb90pdn0.R.inc(93482);double[] y = {4.0};
      __CLR4_4_1200k200klb90pdn0.R.inc(93483);double t0 = 3.0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93484);double tend = 10.0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93485);integ.integrate(new FirstOrderDifferentialEquations() {
          public int getDimension() {try{__CLR4_4_1200k200klb90pdn0.R.inc(93486);
              __CLR4_4_1200k200klb90pdn0.R.inc(93487);return 1;
          }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

          public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93488);
              __CLR4_4_1200k200klb90pdn0.R.inc(93489);yDot[0] = 3.0;
          }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
      }, t0, y, tend, y);

  }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}

  private static class KeplerStepHandler implements StepHandler {
    public KeplerStepHandler(TestProblem3 pb) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93490);
      __CLR4_4_1200k200klb90pdn0.R.inc(93491);this.pb = pb;
    }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93492);
      __CLR4_4_1200k200klb90pdn0.R.inc(93493);nbSteps = 0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93494);maxError = 0;
    }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator, boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_1200k200klb90pdn0.R.inc(93495);

      __CLR4_4_1200k200klb90pdn0.R.inc(93496);++nbSteps;
      __CLR4_4_1200k200klb90pdn0.R.inc(93497);for (int a = 1; (((a < 100)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93498)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93499)==0&false)); ++a) {{

        __CLR4_4_1200k200klb90pdn0.R.inc(93500);double prev   = interpolator.getPreviousTime();
        __CLR4_4_1200k200klb90pdn0.R.inc(93501);double curr   = interpolator.getCurrentTime();
        __CLR4_4_1200k200klb90pdn0.R.inc(93502);double interp = ((100 - a) * prev + a * curr) / 100;
        __CLR4_4_1200k200klb90pdn0.R.inc(93503);interpolator.setInterpolatedTime(interp);

        __CLR4_4_1200k200klb90pdn0.R.inc(93504);double[] interpolatedY = interpolator.getInterpolatedState ();
        __CLR4_4_1200k200klb90pdn0.R.inc(93505);double[] theoreticalY  = pb.computeTheoreticalState(interpolator.getInterpolatedTime());
        __CLR4_4_1200k200klb90pdn0.R.inc(93506);double dx = interpolatedY[0] - theoreticalY[0];
        __CLR4_4_1200k200klb90pdn0.R.inc(93507);double dy = interpolatedY[1] - theoreticalY[1];
        __CLR4_4_1200k200klb90pdn0.R.inc(93508);double error = dx * dx + dy * dy;
        __CLR4_4_1200k200klb90pdn0.R.inc(93509);if ((((error > maxError)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93510)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93511)==0&false))) {{
          __CLR4_4_1200k200klb90pdn0.R.inc(93512);maxError = error;
        }
      }}
      }__CLR4_4_1200k200klb90pdn0.R.inc(93513);if ((((isLast)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93514)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93515)==0&false))) {{
        __CLR4_4_1200k200klb90pdn0.R.inc(93516);Assert.assertTrue(maxError < 2.7e-6);
        __CLR4_4_1200k200klb90pdn0.R.inc(93517);Assert.assertTrue(nbSteps < 80);
      }
    }}finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
    private int nbSteps;
    private double maxError;
    private TestProblem3 pb;
  }

  public static class VariableStepHandler implements StepHandler {
    public VariableStepHandler() {try{__CLR4_4_1200k200klb90pdn0.R.inc(93518);
        __CLR4_4_1200k200klb90pdn0.R.inc(93519);firstTime = true;
        __CLR4_4_1200k200klb90pdn0.R.inc(93520);minStep = 0;
        __CLR4_4_1200k200klb90pdn0.R.inc(93521);maxStep = 0;
    }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93522);
      __CLR4_4_1200k200klb90pdn0.R.inc(93523);firstTime = true;
      __CLR4_4_1200k200klb90pdn0.R.inc(93524);minStep = 0;
      __CLR4_4_1200k200klb90pdn0.R.inc(93525);maxStep = 0;
    }finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator,
                           boolean isLast) {try{__CLR4_4_1200k200klb90pdn0.R.inc(93526);

      __CLR4_4_1200k200klb90pdn0.R.inc(93527);double step = FastMath.abs(interpolator.getCurrentTime()
                             - interpolator.getPreviousTime());
      __CLR4_4_1200k200klb90pdn0.R.inc(93528);if ((((firstTime)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93529)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93530)==0&false))) {{
        __CLR4_4_1200k200klb90pdn0.R.inc(93531);minStep   = FastMath.abs(step);
        __CLR4_4_1200k200klb90pdn0.R.inc(93532);maxStep   = minStep;
        __CLR4_4_1200k200klb90pdn0.R.inc(93533);firstTime = false;
      } }else {{
        __CLR4_4_1200k200klb90pdn0.R.inc(93534);if ((((step < minStep)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93535)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93536)==0&false))) {{
          __CLR4_4_1200k200klb90pdn0.R.inc(93537);minStep = step;
        }
        }__CLR4_4_1200k200klb90pdn0.R.inc(93538);if ((((step > maxStep)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93539)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93540)==0&false))) {{
          __CLR4_4_1200k200klb90pdn0.R.inc(93541);maxStep = step;
        }
      }}

      }__CLR4_4_1200k200klb90pdn0.R.inc(93542);if ((((isLast)&&(__CLR4_4_1200k200klb90pdn0.R.iget(93543)!=0|true))||(__CLR4_4_1200k200klb90pdn0.R.iget(93544)==0&false))) {{
        __CLR4_4_1200k200klb90pdn0.R.inc(93545);Assert.assertTrue(minStep < 8.2e-3);
        __CLR4_4_1200k200klb90pdn0.R.inc(93546);Assert.assertTrue(maxStep > 1.5);
      }
    }}finally{__CLR4_4_1200k200klb90pdn0.R.flushNeeded();}}
    private boolean firstTime;
    private double  minStep;
    private double  maxStep;
  }

}
