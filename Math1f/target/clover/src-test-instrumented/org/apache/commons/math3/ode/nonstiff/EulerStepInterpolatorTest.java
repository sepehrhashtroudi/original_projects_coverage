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


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.ContinuousOutputModel;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.TestProblem1;
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolatorTestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class EulerStepInterpolatorTest {static class __CLR4_4_11zte1ztelb90pdm9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void noReset() throws MaxCountExceededException {__CLR4_4_11zte1ztelb90pdm9.R.globalSliceStart(getClass().getName(),93074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12lbt631zte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zte1ztelb90pdm9.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zte1ztelb90pdm9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest.noReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12lbt631zte() throws MaxCountExceededException{try{__CLR4_4_11zte1ztelb90pdm9.R.inc(93074);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93075);double[]   y    =   { 0.0, 1.0, -2.0 };
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93076);double[][] yDot = { { 1.0, 2.0, -2.0 } };
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93077);EulerStepInterpolator interpolator = new EulerStepInterpolator();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93078);interpolator.reinitialize(new DummyIntegrator(interpolator), y, yDot, true,
                              new EquationsMapper(0, y.length),
                              new EquationsMapper[0]);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93079);interpolator.storeTime(0);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93080);interpolator.shift();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93081);interpolator.storeTime(1);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93082);double[] result = interpolator.getInterpolatedState();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93083);for (int i = 0; (((i < result.length)&&(__CLR4_4_11zte1ztelb90pdm9.R.iget(93084)!=0|true))||(__CLR4_4_11zte1ztelb90pdm9.R.iget(93085)==0&false)); ++i) {{
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93086);Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10);
    }

  }}finally{__CLR4_4_11zte1ztelb90pdm9.R.flushNeeded();}}

  @Test
  public void interpolationAtBounds() throws MaxCountExceededException {__CLR4_4_11zte1ztelb90pdm9.R.globalSliceStart(getClass().getName(),93087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18yaf1p1ztr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zte1ztelb90pdm9.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zte1ztelb90pdm9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest.interpolationAtBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18yaf1p1ztr() throws MaxCountExceededException{try{__CLR4_4_11zte1ztelb90pdm9.R.inc(93087);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93088);double   t0 = 0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93089);double[] y0 = {0.0, 1.0, -2.0};

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93090);double[] y = y0.clone();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93091);double[][] yDot = { new double[y0.length] };
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93092);EulerStepInterpolator interpolator = new EulerStepInterpolator();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93093);interpolator.reinitialize(new DummyIntegrator(interpolator), y, yDot, true,
                              new EquationsMapper(0, y.length),
                              new EquationsMapper[0]);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93094);interpolator.storeTime(t0);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93095);double dt = 1.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93096);interpolator.shift();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93097);y[0] =  1.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93098);y[1] =  3.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93099);y[2] = -4.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93100);yDot[0][0] = (y[0] - y0[0]) / dt;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93101);yDot[0][1] = (y[1] - y0[1]) / dt;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93102);yDot[0][2] = (y[2] - y0[2]) / dt;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93103);interpolator.storeTime(t0 + dt);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93104);interpolator.setInterpolatedTime(interpolator.getPreviousTime());
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93105);double[] result = interpolator.getInterpolatedState();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93106);for (int i = 0; (((i < result.length)&&(__CLR4_4_11zte1ztelb90pdm9.R.iget(93107)!=0|true))||(__CLR4_4_11zte1ztelb90pdm9.R.iget(93108)==0&false)); ++i) {{
        __CLR4_4_11zte1ztelb90pdm9.R.inc(93109);Assert.assertTrue(FastMath.abs(result[i] - y0[i]) < 1.0e-10);
    }

    }__CLR4_4_11zte1ztelb90pdm9.R.inc(93110);interpolator.setInterpolatedTime(interpolator.getCurrentTime());
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93111);result = interpolator.getInterpolatedState();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93112);for (int i = 0; (((i < result.length)&&(__CLR4_4_11zte1ztelb90pdm9.R.iget(93113)!=0|true))||(__CLR4_4_11zte1ztelb90pdm9.R.iget(93114)==0&false)); ++i) {{
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93115);Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10);
    }

  }}finally{__CLR4_4_11zte1ztelb90pdm9.R.flushNeeded();}}

  @Test
  public void interpolationInside() throws MaxCountExceededException {__CLR4_4_11zte1ztelb90pdm9.R.globalSliceStart(getClass().getName(),93116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xttdzb1zuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zte1ztelb90pdm9.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zte1ztelb90pdm9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest.interpolationInside",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xttdzb1zuk() throws MaxCountExceededException{try{__CLR4_4_11zte1ztelb90pdm9.R.inc(93116);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93117);double[]   y    =   { 0.0, 1.0, -2.0 };
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93118);double[][] yDot = { { 1.0, 2.0, -2.0 } };
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93119);EulerStepInterpolator interpolator = new EulerStepInterpolator();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93120);interpolator.reinitialize(new DummyIntegrator(interpolator), y, yDot, true,
                              new EquationsMapper(0, y.length),
                              new EquationsMapper[0]);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93121);interpolator.storeTime(0);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93122);interpolator.shift();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93123);y[0] =  1.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93124);y[1] =  3.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93125);y[2] = -4.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93126);interpolator.storeTime(1);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93127);interpolator.setInterpolatedTime(0.1);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93128);double[] result = interpolator.getInterpolatedState();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93129);Assert.assertTrue(FastMath.abs(result[0] - 0.1) < 1.0e-10);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93130);Assert.assertTrue(FastMath.abs(result[1] - 1.2) < 1.0e-10);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93131);Assert.assertTrue(FastMath.abs(result[2] + 2.2) < 1.0e-10);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93132);interpolator.setInterpolatedTime(0.5);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93133);result = interpolator.getInterpolatedState();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93134);Assert.assertTrue(FastMath.abs(result[0] - 0.5) < 1.0e-10);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93135);Assert.assertTrue(FastMath.abs(result[1] - 2.0) < 1.0e-10);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93136);Assert.assertTrue(FastMath.abs(result[2] + 3.0) < 1.0e-10);

  }finally{__CLR4_4_11zte1ztelb90pdm9.R.flushNeeded();}}

  @Test
  public void derivativesConsistency()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zte1ztelb90pdm9.R.globalSliceStart(getClass().getName(),93137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170j2ib1zv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zte1ztelb90pdm9.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zte1ztelb90pdm9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest.derivativesConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170j2ib1zv5() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zte1ztelb90pdm9.R.inc(93137);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93138);TestProblem3 pb = new TestProblem3();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93139);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93140);EulerIntegrator integ = new EulerIntegrator(step);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93141);StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 1.0e-10);
  }finally{__CLR4_4_11zte1ztelb90pdm9.R.flushNeeded();}}

  @Test
  public void serialization()
    throws IOException, ClassNotFoundException,
           DimensionMismatchException, NumberIsTooSmallException,
           MaxCountExceededException, NoBracketingException {__CLR4_4_11zte1ztelb90pdm9.R.globalSliceStart(getClass().getName(),93142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lxy5z1zva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zte1ztelb90pdm9.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zte1ztelb90pdm9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest.serialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lxy5z1zva() throws IOException, ClassNotFoundException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zte1ztelb90pdm9.R.inc(93142);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93143);TestProblem1 pb = new TestProblem1();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93144);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93145);EulerIntegrator integ = new EulerIntegrator(step);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93146);integ.addStepHandler(new ContinuousOutputModel());
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93147);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93148);ByteArrayOutputStream bos = new ByteArrayOutputStream();
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93149);ObjectOutputStream    oos = new ObjectOutputStream(bos);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93150);for (StepHandler handler : integ.getStepHandlers()) {{
        __CLR4_4_11zte1ztelb90pdm9.R.inc(93151);oos.writeObject(handler);
    }

    }__CLR4_4_11zte1ztelb90pdm9.R.inc(93152);ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93153);ObjectInputStream     ois = new ObjectInputStream(bis);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93154);ContinuousOutputModel cm  = (ContinuousOutputModel) ois.readObject();

    __CLR4_4_11zte1ztelb90pdm9.R.inc(93155);Random random = new Random(347588535632l);
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93156);double maxError = 0.0;
    __CLR4_4_11zte1ztelb90pdm9.R.inc(93157);for (int i = 0; (((i < 1000)&&(__CLR4_4_11zte1ztelb90pdm9.R.iget(93158)!=0|true))||(__CLR4_4_11zte1ztelb90pdm9.R.iget(93159)==0&false)); ++i) {{
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93160);double r = random.nextDouble();
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93161);double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime();
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93162);cm.setInterpolatedTime(time);
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93163);double[] interpolatedY = cm.getInterpolatedState ();
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93164);double[] theoreticalY  = pb.computeTheoreticalState(time);
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93165);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93166);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93167);double error = dx * dx + dy * dy;
      __CLR4_4_11zte1ztelb90pdm9.R.inc(93168);if ((((error > maxError)&&(__CLR4_4_11zte1ztelb90pdm9.R.iget(93169)!=0|true))||(__CLR4_4_11zte1ztelb90pdm9.R.iget(93170)==0&false))) {{
        __CLR4_4_11zte1ztelb90pdm9.R.inc(93171);maxError = error;
      }
    }}
    }__CLR4_4_11zte1ztelb90pdm9.R.inc(93172);Assert.assertTrue(maxError < 0.001);

  }finally{__CLR4_4_11zte1ztelb90pdm9.R.flushNeeded();}}

  private static class DummyIntegrator extends RungeKuttaIntegrator {


      protected DummyIntegrator(RungeKuttaStepInterpolator prototype) {
          super("dummy", new double[0], new double[0][0], new double[0], prototype, Double.NaN);__CLR4_4_11zte1ztelb90pdm9.R.inc(93174);try{__CLR4_4_11zte1ztelb90pdm9.R.inc(93173);
      }finally{__CLR4_4_11zte1ztelb90pdm9.R.flushNeeded();}}

  }

}
