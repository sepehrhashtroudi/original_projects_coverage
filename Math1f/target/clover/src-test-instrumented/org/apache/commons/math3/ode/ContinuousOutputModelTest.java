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

package org.apache.commons.math3.ode;

import java.util.Random;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.util.FastMath;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContinuousOutputModelTest {static class __CLR4_4_11y7o1y7olb90pdhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  public ContinuousOutputModelTest() {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(90996);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(90997);pb    = null;
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(90998);integ = null;
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  @Test
  public void testBoundaries() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException {__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceStart(getClass().getName(),90999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lisq691y7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y7o1y7olb90pdhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.ContinuousOutputModelTest.testBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lisq691y7r() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(90999);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91000);integ.addStepHandler(new ContinuousOutputModel());
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91001);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91002);ContinuousOutputModel cm = (ContinuousOutputModel) integ.getStepHandlers().iterator().next();
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91003);cm.setInterpolatedTime(2.0 * pb.getInitialTime() - pb.getFinalTime());
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91004);cm.setInterpolatedTime(2.0 * pb.getFinalTime() - pb.getInitialTime());
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91005);cm.setInterpolatedTime(0.5 * (pb.getFinalTime() + pb.getInitialTime()));
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  @Test
  public void testRandomAccess() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException {__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceStart(getClass().getName(),91006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w7ozds1y7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y7o1y7olb90pdhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.ContinuousOutputModelTest.testRandomAccess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w7ozds1y7y() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91006);

    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91007);ContinuousOutputModel cm = new ContinuousOutputModel();
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91008);integ.addStepHandler(cm);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91009);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91010);Random random = new Random(347588535632l);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91011);double maxError = 0.0;
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91012);for (int i = 0; (((i < 1000)&&(__CLR4_4_11y7o1y7olb90pdhg.R.iget(91013)!=0|true))||(__CLR4_4_11y7o1y7olb90pdhg.R.iget(91014)==0&false)); ++i) {{
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91015);double r = random.nextDouble();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91016);double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91017);cm.setInterpolatedTime(time);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91018);double[] interpolatedY = cm.getInterpolatedState ();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91019);double[] theoreticalY  = pb.computeTheoreticalState(time);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91020);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91021);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91022);double error = dx * dx + dy * dy;
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91023);if ((((error > maxError)&&(__CLR4_4_11y7o1y7olb90pdhg.R.iget(91024)!=0|true))||(__CLR4_4_11y7o1y7olb90pdhg.R.iget(91025)==0&false))) {{
        __CLR4_4_11y7o1y7olb90pdhg.R.inc(91026);maxError = error;
      }
    }}

    }__CLR4_4_11y7o1y7olb90pdhg.R.inc(91027);Assert.assertTrue(maxError < 1.0e-9);

  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  @Test
  public void testModelsMerging() throws MaxCountExceededException, MathIllegalArgumentException {__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceStart(getClass().getName(),91028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sejt281y8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y7o1y7olb90pdhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.ContinuousOutputModelTest.testModelsMerging",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sejt281y8k() throws MaxCountExceededException, MathIllegalArgumentException{try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91028);

      // theoretical solution: y[0] = cos(t), y[1] = sin(t)
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91029);FirstOrderDifferentialEquations problem =
          new FirstOrderDifferentialEquations() {
              public void computeDerivatives(double t, double[] y, double[] dot) {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91030);
                  __CLR4_4_11y7o1y7olb90pdhg.R.inc(91031);dot[0] = -y[1];
                  __CLR4_4_11y7o1y7olb90pdhg.R.inc(91032);dot[1] =  y[0];
              }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}
              public int getDimension() {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91033);
                  __CLR4_4_11y7o1y7olb90pdhg.R.inc(91034);return 2;
              }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}
          };

      // integrate backward from &pi; to 0;
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91035);ContinuousOutputModel cm1 = new ContinuousOutputModel();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91036);FirstOrderIntegrator integ1 =
          new DormandPrince853Integrator(0, 1.0, 1.0e-8, 1.0e-8);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91037);integ1.addStepHandler(cm1);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91038);integ1.integrate(problem, FastMath.PI, new double[] { -1.0, 0.0 },
                       0, new double[2]);

      // integrate backward from 2&pi; to &pi;
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91039);ContinuousOutputModel cm2 = new ContinuousOutputModel();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91040);FirstOrderIntegrator integ2 =
          new DormandPrince853Integrator(0, 0.1, 1.0e-12, 1.0e-12);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91041);integ2.addStepHandler(cm2);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91042);integ2.integrate(problem, 2.0 * FastMath.PI, new double[] { 1.0, 0.0 },
                       FastMath.PI, new double[2]);

      // merge the two half circles
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91043);ContinuousOutputModel cm = new ContinuousOutputModel();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91044);cm.append(cm2);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91045);cm.append(new ContinuousOutputModel());
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91046);cm.append(cm1);

      // check circle
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91047);Assert.assertEquals(2.0 * FastMath.PI, cm.getInitialTime(), 1.0e-12);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91048);Assert.assertEquals(0, cm.getFinalTime(), 1.0e-12);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91049);Assert.assertEquals(cm.getFinalTime(), cm.getInterpolatedTime(), 1.0e-12);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91050);for (double t = 0; (((t < 2.0 * FastMath.PI)&&(__CLR4_4_11y7o1y7olb90pdhg.R.iget(91051)!=0|true))||(__CLR4_4_11y7o1y7olb90pdhg.R.iget(91052)==0&false)); t += 0.1) {{
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91053);cm.setInterpolatedTime(t);
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91054);double[] y = cm.getInterpolatedState();
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91055);Assert.assertEquals(FastMath.cos(t), y[0], 1.0e-7);
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91056);Assert.assertEquals(FastMath.sin(t), y[1], 1.0e-7);
      }

  }}finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  @Test
  public void testErrorConditions() throws MaxCountExceededException, MathIllegalArgumentException {__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceStart(getClass().getName(),91057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0841h1y9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y7o1y7olb90pdhg.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y7o1y7olb90pdhg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.ContinuousOutputModelTest.testErrorConditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0841h1y9d() throws MaxCountExceededException, MathIllegalArgumentException{try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91057);

      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91058);ContinuousOutputModel cm = new ContinuousOutputModel();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91059);cm.handleStep(buildInterpolator(0, new double[] { 0.0, 1.0, -2.0 }, 1), true);

      // dimension mismatch
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91060);Assert.assertTrue(checkAppendError(cm, 1.0, new double[] { 0.0, 1.0 }, 2.0));

      // hole between time ranges
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91061);Assert.assertTrue(checkAppendError(cm, 10.0, new double[] { 0.0, 1.0, -2.0 }, 20.0));

      // propagation direction mismatch
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91062);Assert.assertTrue(checkAppendError(cm, 1.0, new double[] { 0.0, 1.0, -2.0 }, 0.0));

      // no errors
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91063);Assert.assertFalse(checkAppendError(cm, 1.0, new double[] { 0.0, 1.0, -2.0 }, 2.0));

  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  private boolean checkAppendError(ContinuousOutputModel cm,
                                   double t0, double[] y0, double t1)
      throws MaxCountExceededException, MathIllegalArgumentException {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91064);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91065);try {
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91066);ContinuousOutputModel otherCm = new ContinuousOutputModel();
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91067);otherCm.handleStep(buildInterpolator(t0, y0, t1), true);
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91068);cm.append(otherCm);
      } catch(IllegalArgumentException iae) {
          __CLR4_4_11y7o1y7olb90pdhg.R.inc(91069);return true; // there was an allowable error
      }
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91070);return false; // no allowable error
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  private StepInterpolator buildInterpolator(double t0, double[] y0, double t1) {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91071);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91072);DummyStepInterpolator interpolator  = new DummyStepInterpolator(y0, new double[y0.length], t1 >= t0);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91073);interpolator.storeTime(t0);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91074);interpolator.shift();
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91075);interpolator.storeTime(t1);
      __CLR4_4_11y7o1y7olb90pdhg.R.inc(91076);return interpolator;
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  public void checkValue(double value, double reference) {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91077);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91078);Assert.assertTrue(FastMath.abs(value - reference) < 1.0e-10);
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  @Before
  public void setUp() {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91079);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91080);pb = new TestProblem3(0.9);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91081);double minStep = 0;
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91082);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91083);integ = new DormandPrince54Integrator(minStep, maxStep, 1.0e-8, 1.0e-8);
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  @After
  public void tearDown() {try{__CLR4_4_11y7o1y7olb90pdhg.R.inc(91084);
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91085);pb    = null;
    __CLR4_4_11y7o1y7olb90pdhg.R.inc(91086);integ = null;
  }finally{__CLR4_4_11y7o1y7olb90pdhg.R.flushNeeded();}}

  TestProblem3 pb;
  FirstOrderIntegrator integ;

}
