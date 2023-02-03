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
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.TestProblem1;
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.TestProblem4;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.TestProblemHandler;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class HighamHall54IntegratorTest {static class __CLR4_4_1208m208mlb90pdng{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testWrongDerivative()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hf3l0p208m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testWrongDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hf3l0p208m() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93622);
      __CLR4_4_1208m208mlb90pdng.R.inc(93623);HighamHall54Integrator integrator =
          new HighamHall54Integrator(0.0, 1.0, 1.0e-10, 1.0e-10);
      __CLR4_4_1208m208mlb90pdng.R.inc(93624);FirstOrderDifferentialEquations equations =
          new FirstOrderDifferentialEquations() {
            public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93625);
            __CLR4_4_1208m208mlb90pdng.R.inc(93626);if ((((t < -0.5)&&(__CLR4_4_1208m208mlb90pdng.R.iget(93627)!=0|true))||(__CLR4_4_1208m208mlb90pdng.R.iget(93628)==0&false))) {{
                __CLR4_4_1208m208mlb90pdng.R.inc(93629);throw new LocalException();
            } }else {{
                __CLR4_4_1208m208mlb90pdng.R.inc(93630);throw new RuntimeException("oops");
           }
          }}finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
          public int getDimension() {try{__CLR4_4_1208m208mlb90pdng.R.inc(93631);
              __CLR4_4_1208m208mlb90pdng.R.inc(93632);return 1;
          }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
      };

      __CLR4_4_1208m208mlb90pdng.R.inc(93633);try  {
        __CLR4_4_1208m208mlb90pdng.R.inc(93634);integrator.integrate(equations, -1.0, new double[1], 0.0, new double[1]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93635);Assert.fail("an exception should have been thrown");
      } catch(LocalException de) {
        // expected behavior
      }

      __CLR4_4_1208m208mlb90pdng.R.inc(93636);try  {
        __CLR4_4_1208m208mlb90pdng.R.inc(93637);integrator.integrate(equations, 0.0, new double[1], 1.0, new double[1]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93638);Assert.fail("an exception should have been thrown");
      } catch(RuntimeException de) {
        // expected behavior
      }

  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test(expected=NumberIsTooSmallException.class)
  public void testMinStep()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13be1w32093();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,116,101,112,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testMinStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13be1w32093() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93639);

      __CLR4_4_1208m208mlb90pdng.R.inc(93640);TestProblem1 pb = new TestProblem1();
      __CLR4_4_1208m208mlb90pdng.R.inc(93641);double minStep = 0.1 * (pb.getFinalTime() - pb.getInitialTime());
      __CLR4_4_1208m208mlb90pdng.R.inc(93642);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_1208m208mlb90pdng.R.inc(93643);double[] vecAbsoluteTolerance = { 1.0e-15, 1.0e-16 };
      __CLR4_4_1208m208mlb90pdng.R.inc(93644);double[] vecRelativeTolerance = { 1.0e-15, 1.0e-16 };

      __CLR4_4_1208m208mlb90pdng.R.inc(93645);FirstOrderIntegrator integ = new HighamHall54Integrator(minStep, maxStep,
                                                              vecAbsoluteTolerance,
                                                              vecRelativeTolerance);
      __CLR4_4_1208m208mlb90pdng.R.inc(93646);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1208m208mlb90pdng.R.inc(93647);integ.addStepHandler(handler);
      __CLR4_4_1208m208mlb90pdng.R.inc(93648);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);
      __CLR4_4_1208m208mlb90pdng.R.inc(93649);Assert.fail("an exception should have been thrown");

  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test
  public void testIncreasingTolerance()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrawnx209e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testIncreasingTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrawnx209e() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93650);

    __CLR4_4_1208m208mlb90pdng.R.inc(93651);int previousCalls = Integer.MAX_VALUE;
    __CLR4_4_1208m208mlb90pdng.R.inc(93652);for (int i = -12; (((i < -2)&&(__CLR4_4_1208m208mlb90pdng.R.iget(93653)!=0|true))||(__CLR4_4_1208m208mlb90pdng.R.iget(93654)==0&false)); ++i) {{
      __CLR4_4_1208m208mlb90pdng.R.inc(93655);TestProblem1 pb = new TestProblem1();
      __CLR4_4_1208m208mlb90pdng.R.inc(93656);double minStep = 0;
      __CLR4_4_1208m208mlb90pdng.R.inc(93657);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_1208m208mlb90pdng.R.inc(93658);double scalAbsoluteTolerance = FastMath.pow(10.0, i);
      __CLR4_4_1208m208mlb90pdng.R.inc(93659);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_1208m208mlb90pdng.R.inc(93660);FirstOrderIntegrator integ = new HighamHall54Integrator(minStep, maxStep,
                                                              scalAbsoluteTolerance,
                                                              scalRelativeTolerance);
      __CLR4_4_1208m208mlb90pdng.R.inc(93661);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1208m208mlb90pdng.R.inc(93662);integ.addStepHandler(handler);
      __CLR4_4_1208m208mlb90pdng.R.inc(93663);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      // the 1.3 factor is only valid for this test
      // and has been obtained from trial and error
      // there is no general relation between local and global errors
      __CLR4_4_1208m208mlb90pdng.R.inc(93664);Assert.assertTrue(handler.getMaximalValueError() < (1.3 * scalAbsoluteTolerance));
      __CLR4_4_1208m208mlb90pdng.R.inc(93665);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);

      __CLR4_4_1208m208mlb90pdng.R.inc(93666);int calls = pb.getCalls();
      __CLR4_4_1208m208mlb90pdng.R.inc(93667);Assert.assertEquals(integ.getEvaluations(), calls);
      __CLR4_4_1208m208mlb90pdng.R.inc(93668);Assert.assertTrue(calls <= previousCalls);
      __CLR4_4_1208m208mlb90pdng.R.inc(93669);previousCalls = calls;

    }

  }}finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test
  public void testBackward()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9n5xg209y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testBackward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9n5xg209y() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93670);

      __CLR4_4_1208m208mlb90pdng.R.inc(93671);TestProblem5 pb = new TestProblem5();
      __CLR4_4_1208m208mlb90pdng.R.inc(93672);double minStep = 0;
      __CLR4_4_1208m208mlb90pdng.R.inc(93673);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_1208m208mlb90pdng.R.inc(93674);double scalAbsoluteTolerance = 1.0e-8;
      __CLR4_4_1208m208mlb90pdng.R.inc(93675);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_1208m208mlb90pdng.R.inc(93676);FirstOrderIntegrator integ = new HighamHall54Integrator(minStep, maxStep,
                                                              scalAbsoluteTolerance,
                                                              scalRelativeTolerance);
      __CLR4_4_1208m208mlb90pdng.R.inc(93677);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1208m208mlb90pdng.R.inc(93678);integ.addStepHandler(handler);
      __CLR4_4_1208m208mlb90pdng.R.inc(93679);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

      __CLR4_4_1208m208mlb90pdng.R.inc(93680);Assert.assertTrue(handler.getLastError() < 5.0e-7);
      __CLR4_4_1208m208mlb90pdng.R.inc(93681);Assert.assertTrue(handler.getMaximalValueError() < 5.0e-7);
      __CLR4_4_1208m208mlb90pdng.R.inc(93682);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-12);
      __CLR4_4_1208m208mlb90pdng.R.inc(93683);Assert.assertEquals("Higham-Hall 5(4)", integ.getName());
  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test
  public void testEvents()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13z71gy20ac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testEvents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13z71gy20ac() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93684);

    __CLR4_4_1208m208mlb90pdng.R.inc(93685);TestProblem4 pb = new TestProblem4();
    __CLR4_4_1208m208mlb90pdng.R.inc(93686);double minStep = 0;
    __CLR4_4_1208m208mlb90pdng.R.inc(93687);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_1208m208mlb90pdng.R.inc(93688);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_1208m208mlb90pdng.R.inc(93689);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

    __CLR4_4_1208m208mlb90pdng.R.inc(93690);FirstOrderIntegrator integ = new HighamHall54Integrator(minStep, maxStep,
                                                            scalAbsoluteTolerance,
                                                            scalRelativeTolerance);
    __CLR4_4_1208m208mlb90pdng.R.inc(93691);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_1208m208mlb90pdng.R.inc(93692);integ.addStepHandler(handler);
    __CLR4_4_1208m208mlb90pdng.R.inc(93693);EventHandler[] functions = pb.getEventsHandlers();
    __CLR4_4_1208m208mlb90pdng.R.inc(93694);double convergence = 1.0e-8 * maxStep;
    __CLR4_4_1208m208mlb90pdng.R.inc(93695);for (int l = 0; (((l < functions.length)&&(__CLR4_4_1208m208mlb90pdng.R.iget(93696)!=0|true))||(__CLR4_4_1208m208mlb90pdng.R.iget(93697)==0&false)); ++l) {{
      __CLR4_4_1208m208mlb90pdng.R.inc(93698);integ.addEventHandler(functions[l],
                                 Double.POSITIVE_INFINITY, convergence, 1000);
    }
    }__CLR4_4_1208m208mlb90pdng.R.inc(93699);Assert.assertEquals(functions.length, integ.getEventHandlers().size());
    __CLR4_4_1208m208mlb90pdng.R.inc(93700);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_1208m208mlb90pdng.R.inc(93701);Assert.assertTrue(handler.getMaximalValueError() < 1.0e-7);
    __CLR4_4_1208m208mlb90pdng.R.inc(93702);Assert.assertEquals(0, handler.getMaximalTimeError(), convergence);
    __CLR4_4_1208m208mlb90pdng.R.inc(93703);Assert.assertEquals(12.0, handler.getLastTime(), convergence);
    __CLR4_4_1208m208mlb90pdng.R.inc(93704);integ.clearEventHandlers();
    __CLR4_4_1208m208mlb90pdng.R.inc(93705);Assert.assertEquals(0, integ.getEventHandlers().size());

  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test(expected=LocalException.class)
  public void testEventsErrors()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wiomoz20ay();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,118,101,110,116,115,69,114,114,111,114,115,58,32,91,76,111,99,97,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof LocalException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testEventsErrors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wiomoz20ay() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93706);

      __CLR4_4_1208m208mlb90pdng.R.inc(93707);final TestProblem1 pb = new TestProblem1();
      __CLR4_4_1208m208mlb90pdng.R.inc(93708);double minStep = 0;
      __CLR4_4_1208m208mlb90pdng.R.inc(93709);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_1208m208mlb90pdng.R.inc(93710);double scalAbsoluteTolerance = 1.0e-8;
      __CLR4_4_1208m208mlb90pdng.R.inc(93711);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

      __CLR4_4_1208m208mlb90pdng.R.inc(93712);FirstOrderIntegrator integ =
          new HighamHall54Integrator(minStep, maxStep,
                                     scalAbsoluteTolerance, scalRelativeTolerance);
      __CLR4_4_1208m208mlb90pdng.R.inc(93713);TestProblemHandler handler = new TestProblemHandler(pb, integ);
      __CLR4_4_1208m208mlb90pdng.R.inc(93714);integ.addStepHandler(handler);

      __CLR4_4_1208m208mlb90pdng.R.inc(93715);integ.addEventHandler(new EventHandler() {
        public void init(double t0, double[] y0, double t) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93716);
        }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
        public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93717);
          __CLR4_4_1208m208mlb90pdng.R.inc(93718);return Action.CONTINUE;
        }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
        public double g(double t, double[] y) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93719);
          __CLR4_4_1208m208mlb90pdng.R.inc(93720);double middle = (pb.getInitialTime() + pb.getFinalTime()) / 2;
          __CLR4_4_1208m208mlb90pdng.R.inc(93721);double offset = t - middle;
          __CLR4_4_1208m208mlb90pdng.R.inc(93722);if ((((offset > 0)&&(__CLR4_4_1208m208mlb90pdng.R.iget(93723)!=0|true))||(__CLR4_4_1208m208mlb90pdng.R.iget(93724)==0&false))) {{
            __CLR4_4_1208m208mlb90pdng.R.inc(93725);throw new LocalException();
          }
          }__CLR4_4_1208m208mlb90pdng.R.inc(93726);return offset;
        }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
        public void resetState(double t, double[] y) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93727);
        }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
      }, Double.POSITIVE_INFINITY, 1.0e-8 * maxStep, 1000);

      __CLR4_4_1208m208mlb90pdng.R.inc(93728);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);

  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  private static class LocalException extends RuntimeException {
    private static final long serialVersionUID = 3041292643919807960L;
  }

  @Test
  public void testEventsNoConvergence()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0q3n820bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testEventsNoConvergence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0q3n820bl() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93729);

    __CLR4_4_1208m208mlb90pdng.R.inc(93730);final TestProblem1 pb = new TestProblem1();
    __CLR4_4_1208m208mlb90pdng.R.inc(93731);double minStep = 0;
    __CLR4_4_1208m208mlb90pdng.R.inc(93732);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_1208m208mlb90pdng.R.inc(93733);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_1208m208mlb90pdng.R.inc(93734);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

    __CLR4_4_1208m208mlb90pdng.R.inc(93735);FirstOrderIntegrator integ =
        new HighamHall54Integrator(minStep, maxStep,
                                   scalAbsoluteTolerance, scalRelativeTolerance);
    __CLR4_4_1208m208mlb90pdng.R.inc(93736);TestProblemHandler handler = new TestProblemHandler(pb, integ);
    __CLR4_4_1208m208mlb90pdng.R.inc(93737);integ.addStepHandler(handler);

    __CLR4_4_1208m208mlb90pdng.R.inc(93738);integ.addEventHandler(new EventHandler() {
      public void init(double t0, double[] y0, double t) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93739);
      }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
      public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93740);
        __CLR4_4_1208m208mlb90pdng.R.inc(93741);return Action.CONTINUE;
      }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
      public double g(double t, double[] y) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93742);
        __CLR4_4_1208m208mlb90pdng.R.inc(93743);double middle = (pb.getInitialTime() + pb.getFinalTime()) / 2;
        __CLR4_4_1208m208mlb90pdng.R.inc(93744);double offset = t - middle;
        __CLR4_4_1208m208mlb90pdng.R.inc(93745);return ((((offset > 0) )&&(__CLR4_4_1208m208mlb90pdng.R.iget(93746)!=0|true))||(__CLR4_4_1208m208mlb90pdng.R.iget(93747)==0&false))? (offset + 0.5) : (offset - 0.5);
      }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
      public void resetState(double t, double[] y) {try{__CLR4_4_1208m208mlb90pdng.R.inc(93748);
      }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}
    }, Double.POSITIVE_INFINITY, 1.0e-8 * maxStep, 3);

    __CLR4_4_1208m208mlb90pdng.R.inc(93749);try {
      __CLR4_4_1208m208mlb90pdng.R.inc(93750);integ.integrate(pb,
                      pb.getInitialTime(), pb.getInitialState(),
                      pb.getFinalTime(), new double[pb.getDimension()]);
      __CLR4_4_1208m208mlb90pdng.R.inc(93751);Assert.fail("an exception should have been thrown");
    } catch (TooManyEvaluationsException tmee) {
        // Expected.
    }

}finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test
  public void testSanityChecks()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hex3le20c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testSanityChecks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hex3le20c8() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93752);
      __CLR4_4_1208m208mlb90pdng.R.inc(93753);final TestProblem3 pb  = new TestProblem3(0.9);
      __CLR4_4_1208m208mlb90pdng.R.inc(93754);double minStep = 0;
      __CLR4_4_1208m208mlb90pdng.R.inc(93755);double maxStep = pb.getFinalTime() - pb.getInitialTime();

      __CLR4_4_1208m208mlb90pdng.R.inc(93756);try {
        __CLR4_4_1208m208mlb90pdng.R.inc(93757);FirstOrderIntegrator integ =
            new HighamHall54Integrator(minStep, maxStep, new double[4], new double[4]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93758);integ.integrate(pb, pb.getInitialTime(), new double[6],
                        pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93759);Assert.fail("an exception should have been thrown");
      } catch (DimensionMismatchException ie) {
        // expected behavior
      }

      __CLR4_4_1208m208mlb90pdng.R.inc(93760);try {
        __CLR4_4_1208m208mlb90pdng.R.inc(93761);FirstOrderIntegrator integ =
            new HighamHall54Integrator(minStep, maxStep, new double[4], new double[4]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93762);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                        pb.getFinalTime(), new double[6]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93763);Assert.fail("an exception should have been thrown");
      } catch (DimensionMismatchException ie) {
        // expected behavior
      }

      __CLR4_4_1208m208mlb90pdng.R.inc(93764);try {
        __CLR4_4_1208m208mlb90pdng.R.inc(93765);FirstOrderIntegrator integ =
            new HighamHall54Integrator(minStep, maxStep, new double[2], new double[4]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93766);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                        pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93767);Assert.fail("an exception should have been thrown");
      } catch (DimensionMismatchException ie) {
        // expected behavior
      }

      __CLR4_4_1208m208mlb90pdng.R.inc(93768);try {
        __CLR4_4_1208m208mlb90pdng.R.inc(93769);FirstOrderIntegrator integ =
            new HighamHall54Integrator(minStep, maxStep, new double[4], new double[2]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93770);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                        pb.getFinalTime(), new double[pb.getDimension()]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93771);Assert.fail("an exception should have been thrown");
      } catch (DimensionMismatchException ie) {
        // expected behavior
      }

      __CLR4_4_1208m208mlb90pdng.R.inc(93772);try {
        __CLR4_4_1208m208mlb90pdng.R.inc(93773);FirstOrderIntegrator integ =
            new HighamHall54Integrator(minStep, maxStep, new double[4], new double[4]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93774);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                        pb.getInitialTime(), new double[pb.getDimension()]);
        __CLR4_4_1208m208mlb90pdng.R.inc(93775);Assert.fail("an exception should have been thrown");
      } catch (NumberIsTooSmallException ie) {
        // expected behavior
      }

  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

  @Test
  public void testKepler()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_1208m208mlb90pdng.R.globalSliceStart(getClass().getName(),93776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v6e8rg20cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1208m208mlb90pdng.R.rethrow($CLV_t2$);}finally{__CLR4_4_1208m208mlb90pdng.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest.testKepler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v6e8rg20cw() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_1208m208mlb90pdng.R.inc(93776);

    __CLR4_4_1208m208mlb90pdng.R.inc(93777);final TestProblem3 pb  = new TestProblem3(0.9);
    __CLR4_4_1208m208mlb90pdng.R.inc(93778);double minStep = 0;
    __CLR4_4_1208m208mlb90pdng.R.inc(93779);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_1208m208mlb90pdng.R.inc(93780);double[] vecAbsoluteTolerance = { 1.0e-8, 1.0e-8, 1.0e-10, 1.0e-10 };
    __CLR4_4_1208m208mlb90pdng.R.inc(93781);double[] vecRelativeTolerance = { 1.0e-10, 1.0e-10, 1.0e-8, 1.0e-8 };

    __CLR4_4_1208m208mlb90pdng.R.inc(93782);FirstOrderIntegrator integ = new HighamHall54Integrator(minStep, maxStep,
                                                            vecAbsoluteTolerance,
                                                            vecRelativeTolerance);
    __CLR4_4_1208m208mlb90pdng.R.inc(93783);TestProblemHandler handler = new TestProblemHandler(pb, integ); 
    __CLR4_4_1208m208mlb90pdng.R.inc(93784);integ.addStepHandler(handler);
    __CLR4_4_1208m208mlb90pdng.R.inc(93785);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_1208m208mlb90pdng.R.inc(93786);Assert.assertEquals(0.0, handler.getMaximalValueError(), 1.5e-4);
    __CLR4_4_1208m208mlb90pdng.R.inc(93787);Assert.assertEquals("Higham-Hall 5(4)", integ.getName());
  }finally{__CLR4_4_1208m208mlb90pdng.R.flushNeeded();}}

}
