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

public class ClassicalRungeKuttaIntegratorTest {static class __CLR4_4_11z581z58lb90pdkd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testMissedEndEvent()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zba59v1z58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testMissedEndEvent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zba59v1z58() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92204);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92205);final double   t0     = 1878250320.0000029;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92206);final double   tEvent = 1878250379.9999986;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92207);final double[] k      = { 1.0e-4, 1.0e-5, 1.0e-6 };
      __CLR4_4_11z581z58lb90pdkd.R.inc(92208);FirstOrderDifferentialEquations ode = new FirstOrderDifferentialEquations() {

          public int getDimension() {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92209);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92210);return k.length;
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

          public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92211);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92212);for (int i = 0; (((i < y.length)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92213)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92214)==0&false)); ++i) {{
                  __CLR4_4_11z581z58lb90pdkd.R.inc(92215);yDot[i] = k[i] * y[i];
              }
          }}finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
      };

      __CLR4_4_11z581z58lb90pdkd.R.inc(92216);ClassicalRungeKuttaIntegrator integrator = new ClassicalRungeKuttaIntegrator(60.0);

      __CLR4_4_11z581z58lb90pdkd.R.inc(92217);double[] y0   = new double[k.length];
      __CLR4_4_11z581z58lb90pdkd.R.inc(92218);for (int i = 0; (((i < y0.length)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92219)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92220)==0&false)); ++i) {{
          __CLR4_4_11z581z58lb90pdkd.R.inc(92221);y0[i] = i + 1;
      }
      }__CLR4_4_11z581z58lb90pdkd.R.inc(92222);double[] y    = new double[k.length];

      __CLR4_4_11z581z58lb90pdkd.R.inc(92223);double finalT = integrator.integrate(ode, t0, y0, tEvent, y);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92224);Assert.assertEquals(tEvent, finalT, 5.0e-6);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92225);for (int i = 0; (((i < y.length)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92226)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92227)==0&false)); ++i) {{
          __CLR4_4_11z581z58lb90pdkd.R.inc(92228);Assert.assertEquals(y0[i] * FastMath.exp(k[i] * (finalT - t0)), y[i], 1.0e-9);
      }

      }__CLR4_4_11z581z58lb90pdkd.R.inc(92229);integrator.addEventHandler(new EventHandler() {

          public void init(double t0, double[] y0, double t) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92230);
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

          public void resetState(double t, double[] y) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92231);
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

          public double g(double t, double[] y) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92232);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92233);return t - tEvent;
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

          public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92234);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92235);Assert.assertEquals(tEvent, t, 5.0e-6);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92236);return Action.CONTINUE;
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
      }, Double.POSITIVE_INFINITY, 1.0e-20, 100);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92237);finalT = integrator.integrate(ode, t0, y0, tEvent + 120, y);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92238);Assert.assertEquals(tEvent + 120, finalT, 5.0e-6);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92239);for (int i = 0; (((i < y.length)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92240)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92241)==0&false)); ++i) {{
          __CLR4_4_11z581z58lb90pdkd.R.inc(92242);Assert.assertEquals(y0[i] * FastMath.exp(k[i] * (finalT - t0)), y[i], 1.0e-9);
      }

  }}finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  @Test
  public void testSanityChecks()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hex3le1z6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testSanityChecks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hex3le1z6b() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92243);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92244);try  {
      __CLR4_4_11z581z58lb90pdkd.R.inc(92245);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11z581z58lb90pdkd.R.inc(92246);new ClassicalRungeKuttaIntegrator(0.01).integrate(pb,
                                                        0.0, new double[pb.getDimension()+10],
                                                        1.0, new double[pb.getDimension()]);
        __CLR4_4_11z581z58lb90pdkd.R.inc(92247);Assert.fail("an exception should have been thrown");
    } catch(DimensionMismatchException ie) {
    }
    __CLR4_4_11z581z58lb90pdkd.R.inc(92248);try  {
        __CLR4_4_11z581z58lb90pdkd.R.inc(92249);TestProblem1 pb = new TestProblem1();
        __CLR4_4_11z581z58lb90pdkd.R.inc(92250);new ClassicalRungeKuttaIntegrator(0.01).integrate(pb,
                                                          0.0, new double[pb.getDimension()],
                                                          1.0, new double[pb.getDimension()+10]);
          __CLR4_4_11z581z58lb90pdkd.R.inc(92251);Assert.fail("an exception should have been thrown");
      } catch(DimensionMismatchException ie) {
      }
    __CLR4_4_11z581z58lb90pdkd.R.inc(92252);try  {
      __CLR4_4_11z581z58lb90pdkd.R.inc(92253);TestProblem1 pb = new TestProblem1();
      __CLR4_4_11z581z58lb90pdkd.R.inc(92254);new ClassicalRungeKuttaIntegrator(0.01).integrate(pb,
                                                        0.0, new double[pb.getDimension()],
                                                        0.0, new double[pb.getDimension()]);
        __CLR4_4_11z581z58lb90pdkd.R.inc(92255);Assert.fail("an exception should have been thrown");
    } catch(NumberIsTooSmallException ie) {
    }
  }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  @Test
  public void testDecreasingSteps()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186llun1z6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testDecreasingSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186llun1z6o() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92256);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92257);TestProblemAbstract[] problems = TestProblemFactory.getProblems();
    __CLR4_4_11z581z58lb90pdkd.R.inc(92258);for (int k = 0; (((k < problems.length)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92259)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92260)==0&false)); ++k) {{

      __CLR4_4_11z581z58lb90pdkd.R.inc(92261);double previousValueError = Double.NaN;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92262);double previousTimeError = Double.NaN;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92263);for (int i = 4; (((i < 10)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92264)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92265)==0&false)); ++i) {{

        __CLR4_4_11z581z58lb90pdkd.R.inc(92266);TestProblemAbstract pb = problems[k].copy();
        __CLR4_4_11z581z58lb90pdkd.R.inc(92267);double step = (pb.getFinalTime() - pb.getInitialTime()) * FastMath.pow(2.0, -i);

        __CLR4_4_11z581z58lb90pdkd.R.inc(92268);FirstOrderIntegrator integ = new ClassicalRungeKuttaIntegrator(step);
        __CLR4_4_11z581z58lb90pdkd.R.inc(92269);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_11z581z58lb90pdkd.R.inc(92270);integ.addStepHandler(handler);
        __CLR4_4_11z581z58lb90pdkd.R.inc(92271);EventHandler[] functions = pb.getEventsHandlers();
        __CLR4_4_11z581z58lb90pdkd.R.inc(92272);for (int l = 0; (((l < functions.length)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92273)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92274)==0&false)); ++l) {{
          __CLR4_4_11z581z58lb90pdkd.R.inc(92275);integ.addEventHandler(functions[l],
                                     Double.POSITIVE_INFINITY, 1.0e-6 * step, 1000);
        }
        }__CLR4_4_11z581z58lb90pdkd.R.inc(92276);Assert.assertEquals(functions.length, integ.getEventHandlers().size());
        __CLR4_4_11z581z58lb90pdkd.R.inc(92277);double stopTime = integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                                          pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_11z581z58lb90pdkd.R.inc(92278);if ((((functions.length == 0)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92279)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92280)==0&false))) {{
            __CLR4_4_11z581z58lb90pdkd.R.inc(92281);Assert.assertEquals(pb.getFinalTime(), stopTime, 1.0e-10);
        }

        }__CLR4_4_11z581z58lb90pdkd.R.inc(92282);double error = handler.getMaximalValueError();
        __CLR4_4_11z581z58lb90pdkd.R.inc(92283);if ((((i > 4)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92284)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92285)==0&false))) {{
          __CLR4_4_11z581z58lb90pdkd.R.inc(92286);Assert.assertTrue(error < 1.01 * FastMath.abs(previousValueError));
        }
        }__CLR4_4_11z581z58lb90pdkd.R.inc(92287);previousValueError = error;

        __CLR4_4_11z581z58lb90pdkd.R.inc(92288);double timeError = handler.getMaximalTimeError();
        __CLR4_4_11z581z58lb90pdkd.R.inc(92289);if ((((i > 4)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92290)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92291)==0&false))) {{
          __CLR4_4_11z581z58lb90pdkd.R.inc(92292);Assert.assertTrue(timeError <= FastMath.abs(previousTimeError));
        }
        }__CLR4_4_11z581z58lb90pdkd.R.inc(92293);previousTimeError = timeError;

        __CLR4_4_11z581z58lb90pdkd.R.inc(92294);integ.clearEventHandlers();
        __CLR4_4_11z581z58lb90pdkd.R.inc(92295);Assert.assertEquals(0, integ.getEventHandlers().size());
      }

    }}

  }}finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  @Test
  public void testSmallStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bahza01z7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testSmallStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bahza01z7s() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92296);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92297);TestProblem1 pb = new TestProblem1();
    __CLR4_4_11z581z58lb90pdkd.R.inc(92298);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;

    __CLR4_4_11z581z58lb90pdkd.R.inc(92299);FirstOrderIntegrator integ = new ClassicalRungeKuttaIntegrator(step);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92300);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92301);integ.addStepHandler(handler);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92302);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92303);Assert.assertTrue(handler.getLastError() < 2.0e-13);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92304);Assert.assertTrue(handler.getMaximalValueError() < 4.0e-12);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92305);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92306);Assert.assertEquals("classical Runge-Kutta", integ.getName());
  }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  @Test
  public void testBigStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160wohr1z83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testBigStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160wohr1z83() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92307);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92308);TestProblem1 pb = new TestProblem1();
    __CLR4_4_11z581z58lb90pdkd.R.inc(92309);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.2;

    __CLR4_4_11z581z58lb90pdkd.R.inc(92310);FirstOrderIntegrator integ = new ClassicalRungeKuttaIntegrator(step);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92311);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92312);integ.addStepHandler(handler);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92313);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92314);Assert.assertTrue(handler.getLastError() > 0.0004);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92315);Assert.assertTrue(handler.getMaximalValueError() > 0.005);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92316);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

  }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg1z8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg1z8d() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92317);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92318);TestProblem5 pb = new TestProblem5();
    __CLR4_4_11z581z58lb90pdkd.R.inc(92319);double step = FastMath.abs(pb.getFinalTime() - pb.getInitialTime()) * 0.001;

    __CLR4_4_11z581z58lb90pdkd.R.inc(92320);FirstOrderIntegrator integ = new ClassicalRungeKuttaIntegrator(step);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92321);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92322);integ.addStepHandler(handler);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92323);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92324);Assert.assertTrue(handler.getLastError() < 5.0e-10);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92325);Assert.assertTrue(handler.getMaximalValueError() < 7.0e-10);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92326);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92327);Assert.assertEquals("classical Runge-Kutta", integ.getName());
  }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg1z8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg1z8o() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92328);

    __CLR4_4_11z581z58lb90pdkd.R.inc(92329);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92330);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.0003;

    __CLR4_4_11z581z58lb90pdkd.R.inc(92331);FirstOrderIntegrator integ = new ClassicalRungeKuttaIntegrator(step);
    __CLR4_4_11z581z58lb90pdkd.R.inc(92332);integ.addStepHandler(new KeplerHandler(pb));
    __CLR4_4_11z581z58lb90pdkd.R.inc(92333);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
  }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

  private static class KeplerHandler implements StepHandler {
    public KeplerHandler(TestProblem3 pb) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92334);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92335);this.pb = pb;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92336);maxError = 0;
    }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92337);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92338);maxError = 0;
    }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
    public void handleStep(StepInterpolator interpolator, boolean isLast)
        throws MaxCountExceededException {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92339);

      __CLR4_4_11z581z58lb90pdkd.R.inc(92340);double[] interpolatedY = interpolator.getInterpolatedState ();
      __CLR4_4_11z581z58lb90pdkd.R.inc(92341);double[] theoreticalY  = pb.computeTheoreticalState(interpolator.getCurrentTime());
      __CLR4_4_11z581z58lb90pdkd.R.inc(92342);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_11z581z58lb90pdkd.R.inc(92343);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_11z581z58lb90pdkd.R.inc(92344);double error = dx * dx + dy * dy;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92345);if ((((error > maxError)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92346)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92347)==0&false))) {{
        __CLR4_4_11z581z58lb90pdkd.R.inc(92348);maxError = error;
      }
      }__CLR4_4_11z581z58lb90pdkd.R.inc(92349);if ((((isLast)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92350)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92351)==0&false))) {{
        // even with more than 1000 evaluations per period,
        // RK4 is not able to integrate such an eccentric
        // orbit with a good accuracy
        __CLR4_4_11z581z58lb90pdkd.R.inc(92352);Assert.assertTrue(maxError > 0.005);
      }
    }}finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
    private double maxError = 0;
    private TestProblem3 pb;
  }

  @Test
  public void testStepSize()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11z581z58lb90pdkd.R.globalSliceStart(getClass().getName(),92353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxuh3a1z9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z581z58lb90pdkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z581z58lb90pdkd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest.testStepSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxuh3a1z9d() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z581z58lb90pdkd.R.inc(92353);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92354);final double step = 1.23456;
      __CLR4_4_11z581z58lb90pdkd.R.inc(92355);FirstOrderIntegrator integ = new ClassicalRungeKuttaIntegrator(step);
      __CLR4_4_11z581z58lb90pdkd.R.inc(92356);integ.addStepHandler(new StepHandler() {
          public void handleStep(StepInterpolator interpolator, boolean isLast) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92357);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92358);if ((((! isLast)&&(__CLR4_4_11z581z58lb90pdkd.R.iget(92359)!=0|true))||(__CLR4_4_11z581z58lb90pdkd.R.iget(92360)==0&false))) {{
                  __CLR4_4_11z581z58lb90pdkd.R.inc(92361);Assert.assertEquals(step,
                               interpolator.getCurrentTime() - interpolator.getPreviousTime(),
                               1.0e-12);
              }
          }}finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
          public void init(double t0, double[] y0, double t) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92362);
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
      });
      __CLR4_4_11z581z58lb90pdkd.R.inc(92363);integ.integrate(new FirstOrderDifferentialEquations() {
          public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92364);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92365);dot[0] = 1.0;
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
          public int getDimension() {try{__CLR4_4_11z581z58lb90pdkd.R.inc(92366);
              __CLR4_4_11z581z58lb90pdkd.R.inc(92367);return 1;
          }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}
      }, 0.0, new double[] { 0.0 }, 5.0, new double[1]);
  }finally{__CLR4_4_11z581z58lb90pdkd.R.flushNeeded();}}

}
