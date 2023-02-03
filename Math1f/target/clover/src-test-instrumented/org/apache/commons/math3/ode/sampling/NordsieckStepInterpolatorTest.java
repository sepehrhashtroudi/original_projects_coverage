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

package org.apache.commons.math3.ode.sampling;


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
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.junit.Assert;
import org.junit.Test;

public class NordsieckStepInterpolatorTest {static class __CLR4_4_120q920q9lb90pdoa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94293,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void derivativesConsistency()
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_120q920q9lb90pdoa.R.globalSliceStart(getClass().getName(),94257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170j2ib20q9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120q920q9lb90pdoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_120q920q9lb90pdoa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.NordsieckStepInterpolatorTest.derivativesConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170j2ib20q9() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120q920q9lb90pdoa.R.inc(94257);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94258);TestProblem3 pb = new TestProblem3();
        __CLR4_4_120q920q9lb90pdoa.R.inc(94259);AdamsBashforthIntegrator integ = new AdamsBashforthIntegrator(4, 0.0, 1.0, 1.0e-10, 1.0e-10);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94260);StepInterpolatorTestUtils.checkDerivativesConsistency(integ, pb, 5e-9);
    }finally{__CLR4_4_120q920q9lb90pdoa.R.flushNeeded();}}

    @Test
    public void serialization()
    throws IOException, ClassNotFoundException,
           NumberIsTooSmallException, DimensionMismatchException,
           MaxCountExceededException, NoBracketingException {__CLR4_4_120q920q9lb90pdoa.R.globalSliceStart(getClass().getName(),94261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lxy5z20qd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120q920q9lb90pdoa.R.rethrow($CLV_t2$);}finally{__CLR4_4_120q920q9lb90pdoa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.NordsieckStepInterpolatorTest.serialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lxy5z20qd() throws IOException, ClassNotFoundException, NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_120q920q9lb90pdoa.R.inc(94261);

        __CLR4_4_120q920q9lb90pdoa.R.inc(94262);TestProblem1 pb = new TestProblem1();
        __CLR4_4_120q920q9lb90pdoa.R.inc(94263);AdamsBashforthIntegrator integ = new AdamsBashforthIntegrator(4, 0.0, 1.0, 1.0e-10, 1.0e-10);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94264);integ.addStepHandler(new ContinuousOutputModel());
        __CLR4_4_120q920q9lb90pdoa.R.inc(94265);integ.integrate(pb,
                        pb.getInitialTime(), pb.getInitialState(),
                        pb.getFinalTime(), new double[pb.getDimension()]);

        __CLR4_4_120q920q9lb90pdoa.R.inc(94266);ByteArrayOutputStream bos = new ByteArrayOutputStream();
        __CLR4_4_120q920q9lb90pdoa.R.inc(94267);ObjectOutputStream    oos = new ObjectOutputStream(bos);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94268);for (StepHandler handler : integ.getStepHandlers()) {{
            __CLR4_4_120q920q9lb90pdoa.R.inc(94269);oos.writeObject(handler);
        }

        }__CLR4_4_120q920q9lb90pdoa.R.inc(94270);Assert.assertTrue(bos.size () >  25500);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94271);Assert.assertTrue(bos.size () <  26500);

        __CLR4_4_120q920q9lb90pdoa.R.inc(94272);ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
        __CLR4_4_120q920q9lb90pdoa.R.inc(94273);ObjectInputStream     ois = new ObjectInputStream(bis);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94274);ContinuousOutputModel cm  = (ContinuousOutputModel) ois.readObject();

        __CLR4_4_120q920q9lb90pdoa.R.inc(94275);Random random = new Random(347588535632l);
        __CLR4_4_120q920q9lb90pdoa.R.inc(94276);double maxError = 0.0;
        __CLR4_4_120q920q9lb90pdoa.R.inc(94277);for (int i = 0; (((i < 1000)&&(__CLR4_4_120q920q9lb90pdoa.R.iget(94278)!=0|true))||(__CLR4_4_120q920q9lb90pdoa.R.iget(94279)==0&false)); ++i) {{
            __CLR4_4_120q920q9lb90pdoa.R.inc(94280);double r = random.nextDouble();
            __CLR4_4_120q920q9lb90pdoa.R.inc(94281);double time = r * pb.getInitialTime() + (1.0 - r) * pb.getFinalTime();
            __CLR4_4_120q920q9lb90pdoa.R.inc(94282);cm.setInterpolatedTime(time);
            __CLR4_4_120q920q9lb90pdoa.R.inc(94283);double[] interpolatedY = cm.getInterpolatedState ();
            __CLR4_4_120q920q9lb90pdoa.R.inc(94284);double[] theoreticalY  = pb.computeTheoreticalState(time);
            __CLR4_4_120q920q9lb90pdoa.R.inc(94285);double dx = interpolatedY[0] - theoreticalY[0];
            __CLR4_4_120q920q9lb90pdoa.R.inc(94286);double dy = interpolatedY[1] - theoreticalY[1];
            __CLR4_4_120q920q9lb90pdoa.R.inc(94287);double error = dx * dx + dy * dy;
            __CLR4_4_120q920q9lb90pdoa.R.inc(94288);if ((((error > maxError)&&(__CLR4_4_120q920q9lb90pdoa.R.iget(94289)!=0|true))||(__CLR4_4_120q920q9lb90pdoa.R.iget(94290)==0&false))) {{
                __CLR4_4_120q920q9lb90pdoa.R.inc(94291);maxError = error;
            }
        }}

        }__CLR4_4_120q920q9lb90pdoa.R.inc(94292);Assert.assertTrue(maxError < 1.0e-6);

    }finally{__CLR4_4_120q920q9lb90pdoa.R.flushNeeded();}}

}
