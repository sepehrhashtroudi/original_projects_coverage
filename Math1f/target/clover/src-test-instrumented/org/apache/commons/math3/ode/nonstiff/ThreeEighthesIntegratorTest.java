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

public class ThreeEighthesIntegratorTest {static class __CLR4_4_120ja20jalb90pdo0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj20ja();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj20ja() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94006);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94007);TestProblem1 pb = new TestProblem1();
      __CLR4_4_120ja20jalb90pdo0.R.inc(94008);new ThreeEighthesIntegrator(0.01).integrate(pb,
                                                  0.0, new double[pb.getDimension()+10],
                                                  1.0, new double[pb.getDimension()+10]);
        __CLR4_4_120ja20jalb90pdo0.R.inc(94009);Assert.fail("an exception should have been thrown");
  }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

  @Test
  public void testDecreasingSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186llun20je();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testDecreasingSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186llun20je() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94010);

    __CLR4_4_120ja20jalb90pdo0.R.inc(94011);TestProblemAbstract[] problems = TestProblemFactory.getProblems();
    __CLR4_4_120ja20jalb90pdo0.R.inc(94012);for (int k = 0; (((k < problems.length)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94013)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94014)==0&false)); ++k) {{

      __CLR4_4_120ja20jalb90pdo0.R.inc(94015);double previousValueError = Double.NaN;
      __CLR4_4_120ja20jalb90pdo0.R.inc(94016);double previousTimeError = Double.NaN;
      __CLR4_4_120ja20jalb90pdo0.R.inc(94017);for (int i = 4; (((i < 10)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94018)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94019)==0&false)); ++i) {{

        __CLR4_4_120ja20jalb90pdo0.R.inc(94020);TestProblemAbstract pb = problems[k].copy();
        __CLR4_4_120ja20jalb90pdo0.R.inc(94021);double step = (pb.getFinalTime() - pb.getInitialTime()) * FastMath.pow(2.0, -i);

        __CLR4_4_120ja20jalb90pdo0.R.inc(94022);FirstOrderIntegrator integ = new ThreeEighthesIntegrator(step);
        __CLR4_4_120ja20jalb90pdo0.R.inc(94023);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_120ja20jalb90pdo0.R.inc(94024);integ.addStepHandler(handler);
        __CLR4_4_120ja20jalb90pdo0.R.inc(94025);EventHandler[] functions = pb.getEventsHandlers();
        __CLR4_4_120ja20jalb90pdo0.R.inc(94026);for (int l = 0; (((l < functions.length)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94027)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94028)==0&false)); ++l) {{
          __CLR4_4_120ja20jalb90pdo0.R.inc(94029);integ.addEventHandler(functions[l],
                                     Double.POSITIVE_INFINITY, 1.0e-6 * step, 1000);
        }
        }__CLR4_4_120ja20jalb90pdo0.R.inc(94030);double stopTime = integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                                          pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_120ja20jalb90pdo0.R.inc(94031);if ((((functions.length == 0)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94032)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94033)==0&false))) {{
            __CLR4_4_120ja20jalb90pdo0.R.inc(94034);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
        }

        }__CLR4_4_120ja20jalb90pdo0.R.inc(94035);double error = handler.getMaximalValueError();
        __CLR4_4_120ja20jalb90pdo0.R.inc(94036);if ((((i > 4)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94037)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94038)==0&false))) {{
          __CLR4_4_120ja20jalb90pdo0.R.inc(94039);Assert.assertTrue(error < 1.01 * FastMath.abs(previousValueError));
        }
        }__CLR4_4_120ja20jalb90pdo0.R.inc(94040);previousValueError = error;

        __CLR4_4_120ja20jalb90pdo0.R.inc(94041);double timeError = handler.getMaximalTimeError();
        __CLR4_4_120ja20jalb90pdo0.R.inc(94042);if ((((i > 4)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94043)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94044)==0&false))) {{
          __CLR4_4_120ja20jalb90pdo0.R.inc(94045);Assert.assertTrue(timeError <= FastMath.abs(previousTimeError));
        }
        }__CLR4_4_120ja20jalb90pdo0.R.inc(94046);previousTimeError = timeError;

      }

    }}

  }}finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

 @Test
 public void testSmallStep()
     throws DimensionMismatchException, NumberIsTooSmallException,
            MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bahza020kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testSmallStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bahza020kf() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94047);

    __CLR4_4_120ja20jalb90pdo0.R.inc(94048);TestProblem1 pb = new TestProblem1();
    __CLR4_4_120ja20jalb90pdo0.R.inc(94049);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;

    __CLR4_4_120ja20jalb90pdo0.R.inc(94050);FirstOrderIntegrator integ = new ThreeEighthesIntegrator(step);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94051);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94052);integ.addStepHandler(handler);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94053);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_120ja20jalb90pdo0.R.inc(94054);Assert.assertTrue(handler.getLastError() < 2.0e-13);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94055);Assert.assertTrue(handler.getMaximalValueError() < 4.0e-12);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94056);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94057);Assert.assertEquals("3/8", integ.getName());

  }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

  @Test
  public void testBigStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160wohr20kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testBigStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160wohr20kq() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94058);

    __CLR4_4_120ja20jalb90pdo0.R.inc(94059);TestProblem1 pb = new TestProblem1();
    __CLR4_4_120ja20jalb90pdo0.R.inc(94060);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.2;

    __CLR4_4_120ja20jalb90pdo0.R.inc(94061);FirstOrderIntegrator integ = new ThreeEighthesIntegrator(step);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94062);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94063);integ.addStepHandler(handler);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94064);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_120ja20jalb90pdo0.R.inc(94065);Assert.assertTrue(handler.getLastError() > 0.0004);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94066);Assert.assertTrue(handler.getMaximalValueError() > 0.005);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94067);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

  }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg20l0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94068,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg20l0() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94068);

      __CLR4_4_120ja20jalb90pdo0.R.inc(94069);TestProblem5 pb = new TestProblem5();
      __CLR4_4_120ja20jalb90pdo0.R.inc(94070);double step = FastMath.abs(pb.getFinalTime() - pb.getInitialTime()) * 0.001;

      __CLR4_4_120ja20jalb90pdo0.R.inc(94071);FirstOrderIntegrator integ = new ThreeEighthesIntegrator(step);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94072);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94073);integ.addStepHandler(handler);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94074);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_120ja20jalb90pdo0.R.inc(94075);Assert.assertTrue(handler.getLastError() < 5.0e-10);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94076);Assert.assertTrue(handler.getMaximalValueError() < 7.0e-10);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94077);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94078);Assert.assertEquals("3/8", integ.getName());
  }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg20lb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg20lb() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94079);

    __CLR4_4_120ja20jalb90pdo0.R.inc(94080);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94081);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.0003;

    __CLR4_4_120ja20jalb90pdo0.R.inc(94082);FirstOrderIntegrator integ = new ThreeEighthesIntegrator(step);
    __CLR4_4_120ja20jalb90pdo0.R.inc(94083);integ.addStepHandler(new KeplerHandler(pb));
    __CLR4_4_120ja20jalb90pdo0.R.inc(94084);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
  }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

  private static class KeplerHandler implements StepHandler {

    public KeplerHandler(TestProblem3 pb) {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94085);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94086);this.pb = pb;
      __CLR4_4_120ja20jalb90pdo0.R.inc(94087);maxError = 0;
    }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

    public void init(double t0, double[] y0, double t) {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94088);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94089);maxError = 0;
    }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

    public void handleStep(StepInterpolator interpolator, boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94090);

      __CLR4_4_120ja20jalb90pdo0.R.inc(94091);double[] interpolatedY = interpolator.getInterpolatedState();
      __CLR4_4_120ja20jalb90pdo0.R.inc(94092);double[] theoreticalY  = pb.computeTheoreticalState(interpolator.getCurrentTime());
      __CLR4_4_120ja20jalb90pdo0.R.inc(94093);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_120ja20jalb90pdo0.R.inc(94094);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_120ja20jalb90pdo0.R.inc(94095);double error = dx * dx + dy * dy;
      __CLR4_4_120ja20jalb90pdo0.R.inc(94096);if ((((error > maxError)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94097)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94098)==0&false))) {{
        __CLR4_4_120ja20jalb90pdo0.R.inc(94099);maxError = error;
      }
      }__CLR4_4_120ja20jalb90pdo0.R.inc(94100);if ((((isLast)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94101)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94102)==0&false))) {{
        // even with more than 1000 evaluations per period,
        // RK4 is not able to integrate such an eccentric
        // orbit with a good accuracy
        __CLR4_4_120ja20jalb90pdo0.R.inc(94103);Assert.assertTrue(maxError > 0.005);
      }
    }}finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

    private TestProblem3 pb;
    private double maxError = 0;

  }

  @Test
  public void testStepSize()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120ja20jalb90pdo0.R.globalSliceStart(getClass().getName(),94104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxuh3a20m0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120ja20jalb90pdo0.R.rethrow($CLV_t2$);}finally{__CLR4_4_120ja20jalb90pdo0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegratorTest.testStepSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxuh3a20m0() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120ja20jalb90pdo0.R.inc(94104);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94105);final double step = 1.23456;
      __CLR4_4_120ja20jalb90pdo0.R.inc(94106);FirstOrderIntegrator integ = new ThreeEighthesIntegrator(step);
      __CLR4_4_120ja20jalb90pdo0.R.inc(94107);integ.addStepHandler(new StepHandler() {
          public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94108);
              __CLR4_4_120ja20jalb90pdo0.R.inc(94109);if ((((! isLast)&&(__CLR4_4_120ja20jalb90pdo0.R.iget(94110)!=0|true))||(__CLR4_4_120ja20jalb90pdo0.R.iget(94111)==0&false))) {{
                  __CLR4_4_120ja20jalb90pdo0.R.inc(94112);Assert.assertEquals(step,
                               interpolator.getCurrentTime() - interpolator.getPreviousTime(),
                               1.0e-12);
              }
          }}finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}
          public void init(double t0, double[] y0, double t) {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94113);
          }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}
      });
      __CLR4_4_120ja20jalb90pdo0.R.inc(94114);integ.integrate(new FirstOrderDifferentialEquations() {
          public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94115);
              __CLR4_4_120ja20jalb90pdo0.R.inc(94116);dot[0] = 1.0;
          }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}
          public int getDimension() {try{__CLR4_4_120ja20jalb90pdo0.R.inc(94117);
              __CLR4_4_120ja20jalb90pdo0.R.inc(94118);return 1;
          }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}
      }, 0.0, new double[] { 0.0 }, 5.0, new double[1]);
  }finally{__CLR4_4_120ja20jalb90pdo0.R.flushNeeded();}}

}
