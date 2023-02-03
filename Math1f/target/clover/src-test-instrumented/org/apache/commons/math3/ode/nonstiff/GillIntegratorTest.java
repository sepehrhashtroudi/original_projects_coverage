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

public class GillIntegratorTest {static class __CLR4_4_11zw71zw7lb90pdmf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(expected=DimensionMismatchException.class)
  public void testDimensionCheck()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qytkqj1zw7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testDimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qytkqj1zw7() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93175);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93176);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93177);new GillIntegrator(0.01).integrate(pb,
                                         0.0, new double[pb.getDimension()+10],
                                         1.0, new double[pb.getDimension()+10]);
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93178);Assert.fail("an exception should have been thrown");
  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  @Test
  public void testDecreasingSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186llun1zwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testDecreasingSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186llun1zwb() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93179);

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93180);TestProblemAbstract[] problems = TestProblemFactory.getProblems();
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93181);for (int k = 0; (((k < problems.length)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93182)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93183)==0&false)); ++k) {{

      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93184);double previousValueError = Double.NaN;
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93185);double previousTimeError = Double.NaN;
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93186);for (int i = 5; (((i < 10)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93187)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93188)==0&false)); ++i) {{

        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93189);TestProblemAbstract pb = problems[k].copy();
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93190);double step = (pb.getFinalTime() - pb.getInitialTime()) * FastMath.pow(2.0, -i);

        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93191);FirstOrderIntegrator integ = new GillIntegrator(step);
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93192);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93193);integ.addStepHandler(handler);
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93194);EventHandler[] functions = pb.getEventsHandlers();
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93195);for (int l = 0; (((l < functions.length)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93196)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93197)==0&false)); ++l) {{
          __CLR4_4_11zw71zw7lb90pdmf.R.inc(93198);integ.addEventHandler(functions[l],
                                     Double.POSITIVE_INFINITY, 1.0e-6 * step, 1000);
        }
        }__CLR4_4_11zw71zw7lb90pdmf.R.inc(93199);double stopTime = integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                                          pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93200);if ((((functions.length == 0)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93201)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93202)==0&false))) {{
            __CLR4_4_11zw71zw7lb90pdmf.R.inc(93203);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
        }

        }__CLR4_4_11zw71zw7lb90pdmf.R.inc(93204);double valueError = handler.getMaximalValueError();
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93205);if ((((i > 5)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93206)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93207)==0&false))) {{
          __CLR4_4_11zw71zw7lb90pdmf.R.inc(93208);Assert.assertTrue(valueError < 1.01 * FastMath.abs(previousValueError));
        }
        }__CLR4_4_11zw71zw7lb90pdmf.R.inc(93209);previousValueError = valueError;

        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93210);double timeError = handler.getMaximalTimeError();
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93211);if ((((i > 5)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93212)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93213)==0&false))) {{
          __CLR4_4_11zw71zw7lb90pdmf.R.inc(93214);Assert.assertTrue(timeError <= FastMath.abs(previousTimeError));
        }
        }__CLR4_4_11zw71zw7lb90pdmf.R.inc(93215);previousTimeError = timeError;

      }

    }}

  }}finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  @Test
  public void testSmallStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bahza01zxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testSmallStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bahza01zxc() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93216);

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93217);TestProblem1 pb = new TestProblem1();
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93218);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93219);FirstOrderIntegrator integ = new GillIntegrator(step);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93220);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93221);integ.addStepHandler(handler);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93222);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93223);Assert.assertTrue(handler.getLastError() < 2.0e-13);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93224);Assert.assertTrue(handler.getMaximalValueError() < 4.0e-12);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93225);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93226);Assert.assertEquals("Gill", integ.getName());

  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  @Test
  public void testBigStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160wohr1zxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testBigStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160wohr1zxn() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93227);

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93228);TestProblem1 pb = new TestProblem1();
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93229);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.2;

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93230);FirstOrderIntegrator integ = new GillIntegrator(step);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93231);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93232);integ.addStepHandler(handler);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93233);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93234);Assert.assertTrue(handler.getLastError() > 0.0004);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93235);Assert.assertTrue(handler.getMaximalValueError() > 0.005);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93236);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg1zxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg1zxx() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93237);

      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93238);TestProblem5 pb = new TestProblem5();
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93239);double step = FastMath.abs(pb.getFinalTime() - pb.getInitialTime()) * 0.001;

      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93240);FirstOrderIntegrator integ = new GillIntegrator(step);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93241);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93242);integ.addStepHandler(handler);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93243);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93244);Assert.assertTrue(handler.getLastError() < 5.0e-10);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93245);Assert.assertTrue(handler.getMaximalValueError() < 7.0e-10);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93246);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93247);Assert.assertEquals("Gill", integ.getName());
  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg1zy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg1zy8() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93248);

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93249);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93250);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.0003;

    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93251);FirstOrderIntegrator integ = new GillIntegrator(step);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93252);integ.addStepHandler(new KeplerStepHandler(pb));
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93253);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  @Test
  public void testUnstableDerivative()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e6z7o41zye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testUnstableDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e6z7o41zye() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93254);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93255);final StepProblem stepProblem = new StepProblem(0.0, 1.0, 2.0);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93256);FirstOrderIntegrator integ = new GillIntegrator(0.3);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93257);integ.addEventHandler(stepProblem, 1.0, 1.0e-12, 1000);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93258);double[] y = { Double.NaN };
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93259);integ.integrate(stepProblem, 0.0, new double[] { 0.0 }, 10.0, y);
    __CLR4_4_11zw71zw7lb90pdmf.R.inc(93260);Assert.assertEquals(8.0, y[0], 1.0e-12);
  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

  private static class KeplerStepHandler implements StepHandler {
    public KeplerStepHandler(TestProblem3 pb) {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93261);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93262);this.pb = pb;
    }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93263);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93264);maxError = 0;
    }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator, boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93265);

      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93266);double[] interpolatedY = interpolator.getInterpolatedState();
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93267);double[] theoreticalY  = pb.computeTheoreticalState(interpolator.getCurrentTime());
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93268);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93269);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93270);double error = dx * dx + dy * dy;
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93271);if ((((error > maxError)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93272)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93273)==0&false))) {{
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93274);maxError = error;
      }
      }__CLR4_4_11zw71zw7lb90pdmf.R.inc(93275);if ((((isLast)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93276)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93277)==0&false))) {{
        // even with more than 1000 evaluations per period,
        // RK4 is not able to integrate such an eccentric
        // orbit with a good accuracy
        __CLR4_4_11zw71zw7lb90pdmf.R.inc(93278);Assert.assertTrue(maxError > 0.001);
      }
    }}finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
    private double maxError;
    private TestProblem3 pb;
  }

  @Test
  public void testStepSize()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceStart(getClass().getName(),93279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxuh3a1zz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zw71zw7lb90pdmf.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zw71zw7lb90pdmf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.GillIntegratorTest.testStepSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxuh3a1zz3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93279);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93280);final double step = 1.23456;
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93281);FirstOrderIntegrator integ = new GillIntegrator(step);
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93282);integ.addStepHandler(new StepHandler() {
          public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93283);
              __CLR4_4_11zw71zw7lb90pdmf.R.inc(93284);if ((((! isLast)&&(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93285)!=0|true))||(__CLR4_4_11zw71zw7lb90pdmf.R.iget(93286)==0&false))) {{
                  __CLR4_4_11zw71zw7lb90pdmf.R.inc(93287);Assert.assertEquals(step,
                               interpolator.getCurrentTime() - interpolator.getPreviousTime(),
                               1.0e-12);
              }
          }}finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
          public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93288);
          }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
      });
      __CLR4_4_11zw71zw7lb90pdmf.R.inc(93289);integ.integrate(new FirstOrderDifferentialEquations() {
          public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93290);
              __CLR4_4_11zw71zw7lb90pdmf.R.inc(93291);dot[0] = 1.0;
          }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
          public int getDimension() {try{__CLR4_4_11zw71zw7lb90pdmf.R.inc(93292);
              __CLR4_4_11zw71zw7lb90pdmf.R.inc(93293);return 1;
          }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}
      }, 0.0, new double[] { 0.0 }, 5.0, new double[1]);
  }finally{__CLR4_4_11zw71zw7lb90pdmf.R.flushNeeded();}}

}
