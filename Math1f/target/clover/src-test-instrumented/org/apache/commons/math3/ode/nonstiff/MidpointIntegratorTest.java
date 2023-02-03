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

public class MidpointIntegratorTest {static class __CLR4_4_120fb20fblb90pdnq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120fb20fblb90pdnq.R.globalSliceStart(getClass().getName(),93863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj20fb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120fb20fblb90pdnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_120fb20fblb90pdnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj20fb() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120fb20fblb90pdnq.R.inc(93863);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93864);TestProblem1 pb = new TestProblem1();
      __CLR4_4_120fb20fblb90pdnq.R.inc(93865);new MidpointIntegrator(0.01).integrate(pb,
                                             0.0, new double[pb.getDimension()+10],
                                             1.0, new double[pb.getDimension()+10]);
        __CLR4_4_120fb20fblb90pdnq.R.inc(93866);Assert.fail("an exception should have been thrown");
  }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}

  @Test
  public void testDecreasingSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120fb20fblb90pdnq.R.globalSliceStart(getClass().getName(),93867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186llun20ff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120fb20fblb90pdnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_120fb20fblb90pdnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest.testDecreasingSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186llun20ff() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120fb20fblb90pdnq.R.inc(93867);

    __CLR4_4_120fb20fblb90pdnq.R.inc(93868);TestProblemAbstract[] problems = TestProblemFactory.getProblems();
    __CLR4_4_120fb20fblb90pdnq.R.inc(93869);for (int k = 0; (((k < problems.length)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93870)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93871)==0&false)); ++k) {{

      __CLR4_4_120fb20fblb90pdnq.R.inc(93872);double previousValueError = Double.NaN;
      __CLR4_4_120fb20fblb90pdnq.R.inc(93873);double previousTimeError = Double.NaN;
      __CLR4_4_120fb20fblb90pdnq.R.inc(93874);for (int i = 4; (((i < 10)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93875)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93876)==0&false)); ++i) {{

        __CLR4_4_120fb20fblb90pdnq.R.inc(93877);TestProblemAbstract pb = problems[k].copy();
        __CLR4_4_120fb20fblb90pdnq.R.inc(93878);double step = (pb.getFinalTime() - pb.getInitialTime()) * FastMath.pow(2.0, -i);
        __CLR4_4_120fb20fblb90pdnq.R.inc(93879);FirstOrderIntegrator integ = new MidpointIntegrator(step);
        __CLR4_4_120fb20fblb90pdnq.R.inc(93880);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_120fb20fblb90pdnq.R.inc(93881);integ.addStepHandler(handler);
        __CLR4_4_120fb20fblb90pdnq.R.inc(93882);EventHandler[] functions = pb.getEventsHandlers();
        __CLR4_4_120fb20fblb90pdnq.R.inc(93883);for (int l = 0; (((l < functions.length)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93884)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93885)==0&false)); ++l) {{
          __CLR4_4_120fb20fblb90pdnq.R.inc(93886);integ.addEventHandler(functions[l],
                                     Double.POSITIVE_INFINITY, 1.0e-6 * step, 1000);
        }
        }__CLR4_4_120fb20fblb90pdnq.R.inc(93887);double stopTime = integ.integrate(pb,
                                          pb.getInitialTime(), pb.getInitialState(),
                                          pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_120fb20fblb90pdnq.R.inc(93888);if ((((functions.length == 0)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93889)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93890)==0&false))) {{
            __CLR4_4_120fb20fblb90pdnq.R.inc(93891);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
        }

        }__CLR4_4_120fb20fblb90pdnq.R.inc(93892);double valueError = handler.getMaximalValueError();
        __CLR4_4_120fb20fblb90pdnq.R.inc(93893);if ((((i > 4)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93894)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93895)==0&false))) {{
          __CLR4_4_120fb20fblb90pdnq.R.inc(93896);Assert.assertTrue(valueError < FastMath.abs(previousValueError));
        }
        }__CLR4_4_120fb20fblb90pdnq.R.inc(93897);previousValueError = valueError;

        __CLR4_4_120fb20fblb90pdnq.R.inc(93898);double timeError = handler.getMaximalTimeError();
        __CLR4_4_120fb20fblb90pdnq.R.inc(93899);if ((((i > 4)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93900)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93901)==0&false))) {{
          __CLR4_4_120fb20fblb90pdnq.R.inc(93902);Assert.assertTrue(timeError <= FastMath.abs(previousTimeError));
        }
        }__CLR4_4_120fb20fblb90pdnq.R.inc(93903);previousTimeError = timeError;

      }

    }}

  }}finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}

  @Test
  public void testSmallStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120fb20fblb90pdnq.R.globalSliceStart(getClass().getName(),93904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bahza020gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120fb20fblb90pdnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_120fb20fblb90pdnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest.testSmallStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bahza020gg() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120fb20fblb90pdnq.R.inc(93904);

    __CLR4_4_120fb20fblb90pdnq.R.inc(93905);TestProblem1 pb  = new TestProblem1();
    __CLR4_4_120fb20fblb90pdnq.R.inc(93906);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;

    __CLR4_4_120fb20fblb90pdnq.R.inc(93907);FirstOrderIntegrator integ = new MidpointIntegrator(step);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93908);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93909);integ.addStepHandler(handler);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93910);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_120fb20fblb90pdnq.R.inc(93911);Assert.assertTrue(handler.getLastError() < 2.0e-7);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93912);Assert.assertTrue(handler.getMaximalValueError() < 1.0e-6);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93913);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93914);Assert.assertEquals("midpoint", integ.getName());

  }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}

  @Test
  public void testBigStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120fb20fblb90pdnq.R.globalSliceStart(getClass().getName(),93915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160wohr20gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120fb20fblb90pdnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_120fb20fblb90pdnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest.testBigStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160wohr20gr() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120fb20fblb90pdnq.R.inc(93915);

    __CLR4_4_120fb20fblb90pdnq.R.inc(93916);TestProblem1 pb  = new TestProblem1();
    __CLR4_4_120fb20fblb90pdnq.R.inc(93917);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.2;

    __CLR4_4_120fb20fblb90pdnq.R.inc(93918);FirstOrderIntegrator integ = new MidpointIntegrator(step);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93919);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93920);integ.addStepHandler(handler);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93921);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_120fb20fblb90pdnq.R.inc(93922);Assert.assertTrue(handler.getLastError() > 0.01);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93923);Assert.assertTrue(handler.getMaximalValueError() > 0.05);
    __CLR4_4_120fb20fblb90pdnq.R.inc(93924);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

  }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120fb20fblb90pdnq.R.globalSliceStart(getClass().getName(),93925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg20h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120fb20fblb90pdnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_120fb20fblb90pdnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93925,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg20h1() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120fb20fblb90pdnq.R.inc(93925);

      __CLR4_4_120fb20fblb90pdnq.R.inc(93926);TestProblem5 pb = new TestProblem5();
      __CLR4_4_120fb20fblb90pdnq.R.inc(93927);double step = FastMath.abs(pb.getFinalTime() - pb.getInitialTime()) * 0.001;

      __CLR4_4_120fb20fblb90pdnq.R.inc(93928);FirstOrderIntegrator integ = new MidpointIntegrator(step);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93929);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93930);integ.addStepHandler(handler);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93931);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_120fb20fblb90pdnq.R.inc(93932);Assert.assertTrue(handler.getLastError() < 6.0e-4);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93933);Assert.assertTrue(handler.getMaximalValueError() < 6.0e-4);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93934);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93935);Assert.assertEquals("midpoint", integ.getName());
  }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}

  @Test
  public void testStepSize()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120fb20fblb90pdnq.R.globalSliceStart(getClass().getName(),93936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxuh3a20hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120fb20fblb90pdnq.R.rethrow($CLV_t2$);}finally{__CLR4_4_120fb20fblb90pdnq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest.testStepSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxuh3a20hc() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120fb20fblb90pdnq.R.inc(93936);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93937);final double step = 1.23456;
      __CLR4_4_120fb20fblb90pdnq.R.inc(93938);FirstOrderIntegrator integ = new MidpointIntegrator(step);
      __CLR4_4_120fb20fblb90pdnq.R.inc(93939);integ.addStepHandler(new StepHandler() {
          public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_120fb20fblb90pdnq.R.inc(93940);
              __CLR4_4_120fb20fblb90pdnq.R.inc(93941);if ((((! isLast)&&(__CLR4_4_120fb20fblb90pdnq.R.iget(93942)!=0|true))||(__CLR4_4_120fb20fblb90pdnq.R.iget(93943)==0&false))) {{
                  __CLR4_4_120fb20fblb90pdnq.R.inc(93944);Assert.assertEquals(step,
                               interpolator.getCurrentTime() - interpolator.getPreviousTime(),
                               1.0e-12);
              }
          }}finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}
          public void init(double t0, double[] y0, double t) {try{__CLR4_4_120fb20fblb90pdnq.R.inc(93945);
          }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}
      });
      __CLR4_4_120fb20fblb90pdnq.R.inc(93946);integ.integrate(new FirstOrderDifferentialEquations() {
          public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_120fb20fblb90pdnq.R.inc(93947);
              __CLR4_4_120fb20fblb90pdnq.R.inc(93948);dot[0] = 1.0;
          }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}
          public int getDimension() {try{__CLR4_4_120fb20fblb90pdnq.R.inc(93949);
              __CLR4_4_120fb20fblb90pdnq.R.inc(93950);return 1;
          }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}
      }, 0.0, new double[] { 0.0 }, 5.0, new double[1]);
  }finally{__CLR4_4_120fb20fblb90pdnq.R.flushNeeded();}}

}
