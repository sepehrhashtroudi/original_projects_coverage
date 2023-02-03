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
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
import org.apache.commons.math3.ode.sampling.StepInterpolatorTestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class DormandPrince54StepInterpolatorTest {static class __CLR4_4_11zfv1zfvlb90pdl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92662,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void derivativesConsistency()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zfv1zfvlb90pdl2.R.globalSliceStart(getClass().getName(),92587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170j2ib1zfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zfv1zfvlb90pdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zfv1zfvlb90pdl2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest.derivativesConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170j2ib1zfv() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92587);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92588);TestProblem3 pb = new TestProblem3(0.1);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92589);double minStep = 0;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92590);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92591);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92592);double scalRelativeTolerance = scalAbsoluteTolerance;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92593);DormandPrince54Integrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                                    scalAbsoluteTolerance,
                                                                    scalRelativeTolerance);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92594);StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 1.0e-10);
  }finally{__CLR4_4_11zfv1zfvlb90pdl2.R.flushNeeded();}}

  @Test
  public void serialization()
    throws IOException, ClassNotFoundException,
           DimensionMismatchException, NumberIsTooSmallException,
           MaxCountExceededException, NoBracketingException  {__CLR4_4_11zfv1zfvlb90pdl2.R.globalSliceStart(getClass().getName(),92595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lxy5z1zg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zfv1zfvlb90pdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zfv1zfvlb90pdl2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest.serialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lxy5z1zg3() throws IOException, ClassNotFoundException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92595);

    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92596);TestProblem3 pb = new TestProblem3(0.9);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92597);double minStep = 0;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92598);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92599);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92600);double scalRelativeTolerance = scalAbsoluteTolerance;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92601);DormandPrince54Integrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                                    scalAbsoluteTolerance,
                                                                    scalRelativeTolerance);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92602);integ.addStepHandler(new ContinuousOutputModel());
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92603);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92604);ByteArrayOutputStream bos = new ByteArrayOutputStream();
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92605);ObjectOutputStream    oos = new ObjectOutputStream(bos);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92606);for (StepHandler handler : integ.getStepHandlers()) {{
        __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92607);oos.writeObject(handler);
    }

    }__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92608);Assert.assertTrue(bos.size () > 135000);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92609);Assert.assertTrue(bos.size () < 145000);

    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92610);ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92611);ObjectInputStream     ois = new ObjectInputStream(bis);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92612);ContinuousOutputModel cm  = (ContinuousOutputModel) ois.readObject();

    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92613);Random random = new Random(347588535632l);
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92614);double maxError = 0.0;
    __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92615);for (int i = 0; (((i < 1000)&&(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92616)!=0|true))||(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92617)==0&false)); ++i) {{
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92618);double r = random.nextDouble();
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92619);double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime();
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92620);cm.setInterpolatedTime(time);
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92621);double[] interpolatedY = cm.getInterpolatedState ();
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92622);double[] theoreticalY  = pb.computeTheoreticalState(time);
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92623);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92624);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92625);double error = dx * dx + dy * dy;
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92626);if ((((error > maxError)&&(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92627)!=0|true))||(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92628)==0&false))) {{
        __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92629);maxError = error;
      }
    }}

    }__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92630);Assert.assertTrue(maxError < 7.0e-10);

  }finally{__CLR4_4_11zfv1zfvlb90pdl2.R.flushNeeded();}}

  @Test
  public void checkClone()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zfv1zfvlb90pdl2.R.globalSliceStart(getClass().getName(),92631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hazew41zh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zfv1zfvlb90pdl2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zfv1zfvlb90pdl2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest.checkClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hazew41zh3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92631);
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92632);TestProblem3 pb = new TestProblem3(0.9);
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92633);double minStep = 0;
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92634);double maxStep = pb.getFinalTime() - pb.getInitialTime();
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92635);double scalAbsoluteTolerance = 1.0e-8;
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92636);double scalRelativeTolerance = scalAbsoluteTolerance;
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92637);DormandPrince54Integrator integ = new DormandPrince54Integrator(minStep, maxStep,
                                                                      scalAbsoluteTolerance,
                                                                      scalRelativeTolerance);
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92638);integ.addStepHandler(new StepHandler() {
          public void handleStep(StepInterpolator interpolator, boolean isLast)
              throws MaxCountExceededException {try{__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92639);
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92640);StepInterpolator cloned = interpolator.copy();
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92641);double tA = cloned.getPreviousTime();
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92642);double tB = cloned.getCurrentTime();
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92643);double halfStep = FastMath.abs(tB - tA) / 2;
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92644);Assert.assertEquals(interpolator.getPreviousTime(), tA, 1.0e-12);
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92645);Assert.assertEquals(interpolator.getCurrentTime(), tB, 1.0e-12);
              __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92646);for (int i = 0; (((i < 10)&&(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92647)!=0|true))||(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92648)==0&false)); ++i) {{
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92649);double t = (i * tB + (9 - i) * tA) / 9;
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92650);interpolator.setInterpolatedTime(t);
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92651);Assert.assertTrue(FastMath.abs(cloned.getInterpolatedTime() - t) > (halfStep / 10));
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92652);cloned.setInterpolatedTime(t);
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92653);Assert.assertEquals(t, cloned.getInterpolatedTime(), 1.0e-12);
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92654);double[] referenceState = interpolator.getInterpolatedState();
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92655);double[] cloneState     = cloned.getInterpolatedState();
                  __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92656);for (int j = 0; (((j < referenceState.length)&&(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92657)!=0|true))||(__CLR4_4_11zfv1zfvlb90pdl2.R.iget(92658)==0&false)); ++j) {{
                      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92659);Assert.assertEquals(referenceState[j], cloneState[j], 1.0e-12);
                  }
              }}
          }}finally{__CLR4_4_11zfv1zfvlb90pdl2.R.flushNeeded();}}
          public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zfv1zfvlb90pdl2.R.inc(92660);
          }finally{__CLR4_4_11zfv1zfvlb90pdl2.R.flushNeeded();}}
      });
      __CLR4_4_11zfv1zfvlb90pdl2.R.inc(92661);integ.integrate(pb,
              pb.getInitialTime(), pb.getInitialState(),
              pb.getFinalTime(), new double[pb.getDimension()]);

  }finally{__CLR4_4_11zfv1zfvlb90pdl2.R.flushNeeded();}}

}
