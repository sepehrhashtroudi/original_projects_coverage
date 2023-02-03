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
import org.apache.commons.math3.ode.TestProblem1;
import org.apache.commons.math3.ode.TestProblem3;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolatorTestUtils;
import org.junit.Assert;
import org.junit.Test;

public class MidpointStepInterpolatorTest {static class __CLR4_4_120hr20hrlb90pdnt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,93989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testDerivativesConsistency()
      throws DimensionMismatchException, NumberIsTooSmallException,
             MaxCountExceededException, NoBracketingException {__CLR4_4_120hr20hrlb90pdnt.R.globalSliceStart(getClass().getName(),93951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hipsbf20hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120hr20hrlb90pdnt.R.rethrow($CLV_t2$);}finally{__CLR4_4_120hr20hrlb90pdnt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolatorTest.testDerivativesConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hipsbf20hr() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120hr20hrlb90pdnt.R.inc(93951);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93952);TestProblem3 pb = new TestProblem3();
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93953);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93954);MidpointIntegrator integ = new MidpointIntegrator(step);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93955);StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 1.0e-10);
  }finally{__CLR4_4_120hr20hrlb90pdnt.R.flushNeeded();}}

  @Test
  public void serialization()
    throws IOException, ClassNotFoundException,
           DimensionMismatchException, NumberIsTooSmallException,
           MaxCountExceededException, NoBracketingException {__CLR4_4_120hr20hrlb90pdnt.R.globalSliceStart(getClass().getName(),93956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lxy5z20hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120hr20hrlb90pdnt.R.rethrow($CLV_t2$);}finally{__CLR4_4_120hr20hrlb90pdnt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolatorTest.serialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),93956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lxy5z20hw() throws IOException, ClassNotFoundException, DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120hr20hrlb90pdnt.R.inc(93956);

    __CLR4_4_120hr20hrlb90pdnt.R.inc(93957);TestProblem1 pb = new TestProblem1();
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93958);double step = (pb.getFinalTime() - pb.getInitialTime()) * 0.001;
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93959);MidpointIntegrator integ = new MidpointIntegrator(step);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93960);integ.addStepHandler(new ContinuousOutputModel());
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93961);integ.integrate(pb,
                    pb.getInitialTime(), pb.getInitialState(),
                    pb.getFinalTime(), new double[pb.getDimension()]);

    __CLR4_4_120hr20hrlb90pdnt.R.inc(93962);ByteArrayOutputStream bos = new ByteArrayOutputStream();
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93963);ObjectOutputStream    oos = new ObjectOutputStream(bos);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93964);for (StepHandler handler : integ.getStepHandlers()) {{
        __CLR4_4_120hr20hrlb90pdnt.R.inc(93965);oos.writeObject(handler);
    }

    }__CLR4_4_120hr20hrlb90pdnt.R.inc(93966);Assert.assertTrue(bos.size () > 135000);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93967);Assert.assertTrue(bos.size () < 145000);

    __CLR4_4_120hr20hrlb90pdnt.R.inc(93968);ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93969);ObjectInputStream     ois = new ObjectInputStream(bis);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93970);ContinuousOutputModel cm  = (ContinuousOutputModel) ois.readObject();

    __CLR4_4_120hr20hrlb90pdnt.R.inc(93971);Random random = new Random(347588535632l);
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93972);double maxError = 0.0;
    __CLR4_4_120hr20hrlb90pdnt.R.inc(93973);for (int i = 0; (((i < 1000)&&(__CLR4_4_120hr20hrlb90pdnt.R.iget(93974)!=0|true))||(__CLR4_4_120hr20hrlb90pdnt.R.iget(93975)==0&false)); ++i) {{
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93976);double r = random.nextDouble();
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93977);double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime();
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93978);cm.setInterpolatedTime(time);
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93979);double[] interpolatedY = cm.getInterpolatedState ();
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93980);double[] theoreticalY  = pb.computeTheoreticalState(time);
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93981);double dx = interpolatedY[0] - theoreticalY[0];
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93982);double dy = interpolatedY[1] - theoreticalY[1];
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93983);double error = dx * dx + dy * dy;
      __CLR4_4_120hr20hrlb90pdnt.R.inc(93984);if ((((error > maxError)&&(__CLR4_4_120hr20hrlb90pdnt.R.iget(93985)!=0|true))||(__CLR4_4_120hr20hrlb90pdnt.R.iget(93986)==0&false))) {{
        __CLR4_4_120hr20hrlb90pdnt.R.inc(93987);maxError = error;
      }
    }}

    }__CLR4_4_120hr20hrlb90pdnt.R.inc(93988);Assert.assertTrue(maxError < 1.0e-6);

  }finally{__CLR4_4_120hr20hrlb90pdnt.R.flushNeeded();}}

}
