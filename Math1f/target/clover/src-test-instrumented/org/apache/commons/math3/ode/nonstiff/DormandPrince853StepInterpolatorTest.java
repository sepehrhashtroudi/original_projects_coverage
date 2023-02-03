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

public class DormandPrince853StepInterpolatorTest {static class __CLR4_4_11zov1zovlb90pdlu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void derivativesConsistency()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zov1zovlb90pdlu.R.globalSliceStart(getClass().getName(),92911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170j2ib1zov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zov1zovlb90pdlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zov1zovlb90pdlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolatorTest.derivativesConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170j2ib1zov() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zov1zovlb90pdlu.R.inc(92911);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92912);TestProblem3 pb = new TestProblem3(0.1);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92913);double minStep = 0;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92914);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92915);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92916);double scalRelativeTolerance = scalAbsoluteTolerance;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92917);DormandPrince853Integrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                      scalAbsoluteTolerance,
                                                                      scalRelativeTolerance);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92918);StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 1.0e-10);
  }finally{__CLR4_4_11zov1zovlb90pdlu.R.flushNeeded();}}

  @Test
  public void serialization()
    throws IOException, ClassNotFoundException,
           DimensionMismatchException, NumberIsTooSmallException,
           MaxCountExceededException, NoBracketingException {__CLR4_4_11zov1zovlb90pdlu.R.globalSliceStart(getClass().getName(),92919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lxy5z1zp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zov1zovlb90pdlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zov1zovlb90pdlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolatorTest.serialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lxy5z1zp3() throws IOException, ClassNotFoundException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zov1zovlb90pdlu.R.inc(92919);

    __CLR4_4_11zov1zovlb90pdlu.R.inc(92920);TestProblem3 pb = new TestProblem3(0.9);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92921);double minStep = 0;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92922);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92923);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92924);double scalRelativeTolerance = scalAbsoluteTolerance;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92925);DormandPrince853Integrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                      scalAbsoluteTolerance,
                                                                      scalRelativeTolerance);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92926);integ.addStepHandler(new ContinuousOutputModel());
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92927);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_11zov1zovlb90pdlu.R.inc(92928);ByteArrayOutputStream bos = new ByteArrayOutputStream();
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92929);ObjectOutputStream    oos = new ObjectOutputStream(bos);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92930);for (StepHandler handler : integ.getStepHandlers()) {{
        __CLR4_4_11zov1zovlb90pdlu.R.inc(92931);oos.writeObject(handler);
    }

    }__CLR4_4_11zov1zovlb90pdlu.R.inc(92932);Assert.assertTrue(bos.size () > 90000);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92933);Assert.assertTrue(bos.size () < 100000);

    __CLR4_4_11zov1zovlb90pdlu.R.inc(92934);ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92935);ObjectInputStream     ois = new ObjectInputStream(bis);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92936);ContinuousOutputModel cm  = (ContinuousOutputModel) ois.readObject();

    __CLR4_4_11zov1zovlb90pdlu.R.inc(92937);Random random = new Random(347588535632l);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92938);double maxError = 0.0;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92939);for (int i = 0; (((i < 1000)&&(__CLR4_4_11zov1zovlb90pdlu.R.iget(92940)!=0|true))||(__CLR4_4_11zov1zovlb90pdlu.R.iget(92941)==0&false)); ++i) {{
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92942);double r = random.nextDouble();
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92943);double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime();
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92944);cm.setInterpolatedTime(time);
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92945);double[] interpolatedY = cm.getInterpolatedState ();
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92946);double[] theoreticalY  = pb.computeTheoreticalState(time);
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92947);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92948);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92949);double error = dx * dx + dy * dy;
      __CLR4_4_11zov1zovlb90pdlu.R.inc(92950);if ((((error > maxError)&&(__CLR4_4_11zov1zovlb90pdlu.R.iget(92951)!=0|true))||(__CLR4_4_11zov1zovlb90pdlu.R.iget(92952)==0&false))) {{
        __CLR4_4_11zov1zovlb90pdlu.R.inc(92953);maxError = error;
      }
    }}

    }__CLR4_4_11zov1zovlb90pdlu.R.inc(92954);Assert.assertTrue(maxError < 2.4e-10);

  }finally{__CLR4_4_11zov1zovlb90pdlu.R.flushNeeded();}}

  @Test
  public void checklone()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_11zov1zovlb90pdlu.R.globalSliceStart(getClass().getName(),92955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bec8n1zq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11zov1zovlb90pdlu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11zov1zovlb90pdlu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolatorTest.checklone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92955,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bec8n1zq3() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11zov1zovlb90pdlu.R.inc(92955);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92956);TestProblem3 pb = new TestProblem3(0.9);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92957);double minStep = 0;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92958);double maxStep = pb.getFinalTime() - pb.getInitialTime();
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92959);double scalAbsoluteTolerance = 1.0e-8;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92960);double scalRelativeTolerance = scalAbsoluteTolerance;
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92961);DormandPrince853Integrator integ = new DormandPrince853Integrator(minStep, maxStep,
                                                                      scalAbsoluteTolerance,
                                                                      scalRelativeTolerance);
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92962);integ.addStepHandler(new StepHandler() {
        public void handleStep(StepInterpolator interpolator, boolean isLast)
            throws MaxCountExceededException {try{__CLR4_4_11zov1zovlb90pdlu.R.inc(92963);
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92964);StepInterpolator cloned = interpolator.copy();
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92965);double tA = cloned.getPreviousTime();
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92966);double tB = cloned.getCurrentTime();
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92967);double halfStep = FastMath.abs(tB - tA) / 2;
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92968);Assert.assertEquals(interpolator.getPreviousTime(), tA, 1.0e-12);
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92969);Assert.assertEquals(interpolator.getCurrentTime(), tB, 1.0e-12);
            __CLR4_4_11zov1zovlb90pdlu.R.inc(92970);for (int i = 0; (((i < 10)&&(__CLR4_4_11zov1zovlb90pdlu.R.iget(92971)!=0|true))||(__CLR4_4_11zov1zovlb90pdlu.R.iget(92972)==0&false)); ++i) {{
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92973);double t = (i * tB + (9 - i) * tA) / 9;
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92974);interpolator.setInterpolatedTime(t);
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92975);Assert.assertTrue(FastMath.abs(cloned.getInterpolatedTime() - t) > (halfStep / 10));
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92976);cloned.setInterpolatedTime(t);
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92977);Assert.assertEquals(t, cloned.getInterpolatedTime(), 1.0e-12);
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92978);double[] referenceState = interpolator.getInterpolatedState();
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92979);double[] cloneState     = cloned.getInterpolatedState();
                __CLR4_4_11zov1zovlb90pdlu.R.inc(92980);for (int j = 0; (((j < referenceState.length)&&(__CLR4_4_11zov1zovlb90pdlu.R.iget(92981)!=0|true))||(__CLR4_4_11zov1zovlb90pdlu.R.iget(92982)==0&false)); ++j) {{
                    __CLR4_4_11zov1zovlb90pdlu.R.inc(92983);Assert.assertEquals(referenceState[j], cloneState[j], 1.0e-12);
                }
            }}
        }}finally{__CLR4_4_11zov1zovlb90pdlu.R.flushNeeded();}}
        public void init(double t0, double[] y0, double t) {try{__CLR4_4_11zov1zovlb90pdlu.R.inc(92984);
        }finally{__CLR4_4_11zov1zovlb90pdlu.R.flushNeeded();}}
    });
    __CLR4_4_11zov1zovlb90pdlu.R.inc(92985);integ.integrate(pb,
            pb.getInitialTime(), pb.getInitialState(),
            pb.getFinalTime(), new double[pb.getDimension()]);

  }finally{__CLR4_4_11zov1zovlb90pdlu.R.flushNeeded();}}

}
