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
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.TestProblemAbstract;
import org.apache.commons.math3.ode.TestProblemFactory;
import org.apache.commons.math3.ode.TestProblemHandler;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class EulerIntegratorTest {static class __CLR4_4_11zqy1zqylb90pdm1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceStart(getClass().getName(),92986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj1zqy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zqy1zqylb90pdm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj1zqy() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(92986);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(92987);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(92988);new EulerIntegrator(0.01).integrate(pb,
                                          0.0, new double[pb.getDimension()+10],
                                          1.0, new double[pb.getDimension()+10]);
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(92989);Assert.fail("an exception should have been thrown");
  }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}

  @Test
  public void testDecreasingSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceStart(getClass().getName(),92990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186llun1zr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zqy1zqylb90pdm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest.testDecreasingSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186llun1zr2() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(92990);

    __CLR4_4_11zqy1zqylb90pdm1.R.inc(92991);TestProblemAbstract[] problems = TestProblemFactory.getProblems();
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(92992);for (int k = 0; (((k < problems.length)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(92993)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(92994)==0&false)); ++k) {{

      __CLR4_4_11zqy1zqylb90pdm1.R.inc(92995);double previousValueError = Double.NaN;
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(92996);double previousTimeError = Double.NaN;
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(92997);for (int i = 4; (((i < 8)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(92998)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(92999)==0&false)); ++i) {{

        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93000);TestProblemAbstract pb  = problems[k].copy();
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93001);double step = (pb.getFinalTime() - pb.getInitialTime()) * FastMath.pow(2.0, -i);

        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93002);FirstOrderIntegrator integ = new EulerIntegrator(step);
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93003);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93004);integ.addStepHandler(handler);
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93005);EventHandler[] functions = pb.getEventsHandlers();
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93006);for (int l = 0; (((l < functions.length)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93007)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93008)==0&false)); ++l) {{
          __CLR4_4_11zqy1zqylb90pdm1.R.inc(93009);integ.addEventHandler(functions[l],
                                     Double.POSITIVE_INFINITY, 1.0e-6 * step, 1000);
        }
        }__CLR4_4_11zqy1zqylb90pdm1.R.inc(93010);double stopTime = integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                                          pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93011);if ((((functions.length == 0)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93012)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93013)==0&false))) {{
            __CLR4_4_11zqy1zqylb90pdm1.R.inc(93014);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
        }

        }__CLR4_4_11zqy1zqylb90pdm1.R.inc(93015);double valueError = handler.getMaximalValueError();
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93016);if ((((i > 4)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93017)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93018)==0&false))) {{
          __CLR4_4_11zqy1zqylb90pdm1.R.inc(93019);Assert.assertTrue(valueError < FastMath.abs(previousValueError));
        }
        }__CLR4_4_11zqy1zqylb90pdm1.R.inc(93020);previousValueError = valueError;

        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93021);double timeError = handler.getMaximalTimeError();
        __CLR4_4_11zqy1zqylb90pdm1.R.inc(93022);if ((((i > 4)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93023)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93024)==0&false))) {{
          __CLR4_4_11zqy1zqylb90pdm1.R.inc(93025);Assert.assertTrue(timeError <= FastMath.abs(previousTimeError));
        }
        }__CLR4_4_11zqy1zqylb90pdm1.R.inc(93026);previousTimeError = timeError;

      }

    }}

  }}finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}

  @Test
  public void testSmallStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceStart(getClass().getName(),93027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bahza01zs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zqy1zqylb90pdm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest.testSmallStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bahza01zs3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93027);

    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93028);TestProblem1 pb  = new TestProblem1();
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93029);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;

    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93030);FirstOrderIntegrator integ = new EulerIntegrator(step);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93031);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93032);integ.addStepHandler(handler);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93033);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

   __CLR4_4_11zqy1zqylb90pdm1.R.inc(93034);Assert.assertTrue(handler.getLastError() < 2.0e-4);
   __CLR4_4_11zqy1zqylb90pdm1.R.inc(93035);Assert.assertTrue(handler.getMaximalValueError() < 1.0e-3);
   __CLR4_4_11zqy1zqylb90pdm1.R.inc(93036);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
   __CLR4_4_11zqy1zqylb90pdm1.R.inc(93037);Assert.assertEquals("Euler", integ.getName());

  }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}

  @Test
  public void testBigStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceStart(getClass().getName(),93038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160wohr1zse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zqy1zqylb90pdm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest.testBigStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160wohr1zse() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93038);

    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93039);TestProblem1 pb  = new TestProblem1();
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93040);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.2;

    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93041);FirstOrderIntegrator integ = new EulerIntegrator(step);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93042);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93043);integ.addStepHandler(handler);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93044);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93045);Assert.assertTrue(handler.getLastError() > 0.01);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93046);Assert.assertTrue(handler.getMaximalValueError() > 0.2);
    __CLR4_4_11zqy1zqylb90pdm1.R.inc(93047);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

  }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceStart(getClass().getName(),93048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg1zso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zqy1zqylb90pdm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg1zso() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93048);

      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93049);TestProblem5 pb = new TestProblem5();
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93050);double step = FastMath.abs(pb.getFinalTime() - pb.getInitialTime()) * 0.001;

      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93051);FirstOrderIntegrator integ = new EulerIntegrator(step);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93052);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93053);integ.addStepHandler(handler);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93054);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93055);Assert.assertTrue(handler.getLastError() < 0.45);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93056);Assert.assertTrue(handler.getMaximalValueError() < 0.45);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93057);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93058);Assert.assertEquals("Euler", integ.getName());
  }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}

  @Test
  public void testStepSize()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceStart(getClass().getName(),93059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxuh3a1zsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zqy1zqylb90pdm1.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zqy1zqylb90pdm1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerIntegratorTest.testStepSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxuh3a1zsz() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93059);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93060);final double step = 1.23456;
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93061);FirstOrderIntegrator integ = new EulerIntegrator(step);
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93062);integ.addStepHandler(new StepHandler() {
        public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93063);
            __CLR4_4_11zqy1zqylb90pdm1.R.inc(93064);if ((((! isLast)&&(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93065)!=0|true))||(__CLR4_4_11zqy1zqylb90pdm1.R.iget(93066)==0&false))) {{
                __CLR4_4_11zqy1zqylb90pdm1.R.inc(93067);Assert.assertEquals(step,
                             interpolator.getCurrentTime() - interpolator.getPreviousTime(),
                             1.0e-12);
            }
        }}finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}
        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93068);
        }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}
      });
      __CLR4_4_11zqy1zqylb90pdm1.R.inc(93069);integ.integrate(new FirstOrderDifferentialEquations() {
                          public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93070);
                              __CLR4_4_11zqy1zqylb90pdm1.R.inc(93071);dot[0] = 1.0;
                          }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}
                          public int getDimension() {try{__CLR4_4_11zqy1zqylb90pdm1.R.inc(93072);
                              __CLR4_4_11zqy1zqylb90pdm1.R.inc(93073);return 1;
                          }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}
                      }, 0.0, new double[] { 0.0 }, 5.0, new double[1]);
  }finally{__CLR4_4_11zqy1zqylb90pdm1.R.flushNeeded();}}

}
