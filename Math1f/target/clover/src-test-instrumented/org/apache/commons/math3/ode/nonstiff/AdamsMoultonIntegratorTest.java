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
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.TestProblem1;
import org.apache.commons.math3.ode.TestProblem5;
import org.apache.commons.math3.ode.TestProblem6;
import org.apache.commons.math3.ode.TestProblemHandler;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class AdamsMoultonIntegratorTest {static class __CLR4_4_11z3b1z3blb90pdjy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,92204,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected=DimensionMismatchException.class)
    public void dimensionCheck()
        throws DimensionMismatchException, NumberIsTooSmallException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceStart(getClass().getName(),92135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvlrux1z3b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,100,105,109,101,110,115,105,111,110,67,104,101,99,107,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z3b1z3blb90pdjy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegratorTest.dimensionCheck",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvlrux1z3b() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z3b1z3blb90pdjy.R.inc(92135);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92136);TestProblem1 pb = new TestProblem1();
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92137);FirstOrderIntegrator integ =
            new AdamsMoultonIntegrator(2, 0.0, 1.0, 1.0e-10, 1.0e-10);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92138);integ.integrate(pb,
                        0.0, new double[pb.getDimension()+10],
                        1.0, new double[pb.getDimension()+10]);
    }finally{__CLR4_4_11z3b1z3blb90pdjy.R.flushNeeded();}}

    @Test(expected=NumberIsTooSmallException.class)
    public void testMinStep()
            throws DimensionMismatchException, NumberIsTooSmallException,
            MaxCountExceededException, NoBracketingException {__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceStart(getClass().getName(),92139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13be1w31z3f();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,116,101,112,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z3b1z3blb90pdjy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegratorTest.testMinStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13be1w31z3f() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z3b1z3blb90pdjy.R.inc(92139);

          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92140);TestProblem1 pb = new TestProblem1();
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92141);double minStep = 0.1 * (pb.getFinalTime() - pb.getInitialTime());
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92142);double maxStep = pb.getFinalTime() - pb.getInitialTime();
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92143);double[] vecAbsoluteTolerance = { 1.0e-15, 1.0e-16 };
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92144);double[] vecRelativeTolerance = { 1.0e-15, 1.0e-16 };

          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92145);FirstOrderIntegrator integ = new AdamsMoultonIntegrator(4, minStep, maxStep,
                                                                  vecAbsoluteTolerance,
                                                                  vecRelativeTolerance);
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92146);TestProblemHandler handler = new TestProblemHandler(pb, integ);
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92147);integ.addStepHandler(handler);
          __CLR4_4_11z3b1z3blb90pdjy.R.inc(92148);integ.integrate(pb,
                          pb.getInitialTime(), pb.getInitialState(),
                          pb.getFinalTime(), new double[pb.getDimension()]);

    }finally{__CLR4_4_11z3b1z3blb90pdjy.R.flushNeeded();}}

    @Test
    public void testIncreasingTolerance()
            throws DimensionMismatchException, NumberIsTooSmallException,
            MaxCountExceededException, NoBracketingException {__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceStart(getClass().getName(),92149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrawnx1z3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z3b1z3blb90pdjy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegratorTest.testIncreasingTolerance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrawnx1z3p() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z3b1z3blb90pdjy.R.inc(92149);

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92150);int previousCalls = Integer.MAX_VALUE;
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92151);for (int i = -12; (((i < -2)&&(__CLR4_4_11z3b1z3blb90pdjy.R.iget(92152)!=0|true))||(__CLR4_4_11z3b1z3blb90pdjy.R.iget(92153)==0&false)); ++i) {{
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92154);TestProblem1 pb = new TestProblem1();
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92155);double minStep = 0;
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92156);double maxStep = pb.getFinalTime() - pb.getInitialTime();
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92157);double scalAbsoluteTolerance = FastMath.pow(10.0, i);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92158);double scalRelativeTolerance = 0.01 * scalAbsoluteTolerance;

            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92159);FirstOrderIntegrator integ = new AdamsMoultonIntegrator(4, minStep, maxStep,
                                                                    scalAbsoluteTolerance,
                                                                    scalRelativeTolerance);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92160);TestProblemHandler handler = new TestProblemHandler(pb, integ);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92161);integ.addStepHandler(handler);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92162);integ.integrate(pb,
                            pb.getInitialTime(), pb.getInitialState(),
                            pb.getFinalTime(), new double[pb.getDimension()]);

            // the 0.5 and 11.0 factors are only valid for this test
            // and has been obtained from trial and error
            // there is no general relation between local and global errors
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92163);Assert.assertTrue(handler.getMaximalValueError() > ( 0.5 * scalAbsoluteTolerance));
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92164);Assert.assertTrue(handler.getMaximalValueError() < (11.0 * scalAbsoluteTolerance));
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92165);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-16);

            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92166);int calls = pb.getCalls();
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92167);Assert.assertEquals(integ.getEvaluations(), calls);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92168);Assert.assertTrue(calls <= previousCalls);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92169);previousCalls = calls;

        }

    }}finally{__CLR4_4_11z3b1z3blb90pdjy.R.flushNeeded();}}

    @Test(expected = MaxCountExceededException.class)
    public void exceedMaxEvaluations()
            throws DimensionMismatchException, NumberIsTooSmallException,
            MaxCountExceededException, NoBracketingException {__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceStart(getClass().getName(),92170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fotbla1z4a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,101,120,99,101,101,100,77,97,120,69,118,97,108,117,97,116,105,111,110,115,58,32,91,77,97,120,67,111,117,110,116,69,120,99,101,101,100,101,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MaxCountExceededException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z3b1z3blb90pdjy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegratorTest.exceedMaxEvaluations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fotbla1z4a() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z3b1z3blb90pdjy.R.inc(92170);

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92171);TestProblem1 pb  = new TestProblem1();
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92172);double range = pb.getFinalTime() - pb.getInitialTime();

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92173);AdamsMoultonIntegrator integ = new AdamsMoultonIntegrator(2, 0, range, 1.0e-12, 1.0e-12);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92174);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92175);integ.addStepHandler(handler);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92176);integ.setMaxEvaluations(650);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92177);integ.integrate(pb,
                        pb.getInitialTime(), pb.getInitialState(),
                        pb.getFinalTime(), new double[pb.getDimension()]);

    }finally{__CLR4_4_11z3b1z3blb90pdjy.R.flushNeeded();}}

    @Test
    public void backward()
            throws DimensionMismatchException, NumberIsTooSmallException,
            MaxCountExceededException, NoBracketingException {__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceStart(getClass().getName(),92178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6oeru1z4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z3b1z3blb90pdjy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegratorTest.backward",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6oeru1z4i() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z3b1z3blb90pdjy.R.inc(92178);

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92179);TestProblem5 pb = new TestProblem5();
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92180);double range = FastMath.abs(pb.getFinalTime() - pb.getInitialTime());

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92181);FirstOrderIntegrator integ = new AdamsMoultonIntegrator(4, 0, range, 1.0e-12, 1.0e-12);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92182);TestProblemHandler handler = new TestProblemHandler(pb, integ);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92183);integ.addStepHandler(handler);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92184);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                        pb.getFinalTime(), new double[pb.getDimension()]);

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92185);Assert.assertTrue(handler.getLastError() < 1.0e-9);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92186);Assert.assertTrue(handler.getMaximalValueError() < 1.0e-9);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92187);Assert.assertEquals(0, handler.getMaximalTimeError(), 1.0e-16);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92188);Assert.assertEquals("Adams-Moulton", integ.getName());
    }finally{__CLR4_4_11z3b1z3blb90pdjy.R.flushNeeded();}}

    @Test
    public void polynomial()
            throws DimensionMismatchException, NumberIsTooSmallException,
            MaxCountExceededException, NoBracketingException {__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceStart(getClass().getName(),92189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s73dd11z4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11z3b1z3blb90pdjy.R.rethrow($CLV_t2$);}finally{__CLR4_4_11z3b1z3blb90pdjy.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegratorTest.polynomial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),92189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s73dd11z4t() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11z3b1z3blb90pdjy.R.inc(92189);
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92190);TestProblem6 pb = new TestProblem6();
        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92191);double range = FastMath.abs(pb.getFinalTime() - pb.getInitialTime());

        __CLR4_4_11z3b1z3blb90pdjy.R.inc(92192);for (int nSteps = 2; (((nSteps < 8)&&(__CLR4_4_11z3b1z3blb90pdjy.R.iget(92193)!=0|true))||(__CLR4_4_11z3b1z3blb90pdjy.R.iget(92194)==0&false)); ++nSteps) {{
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92195);AdamsMoultonIntegrator integ =
                new AdamsMoultonIntegrator(nSteps, 1.0e-6 * range, 0.1 * range, 1.0e-5, 1.0e-5);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92196);TestProblemHandler handler = new TestProblemHandler(pb, integ);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92197);integ.addStepHandler(handler);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92198);integ.integrate(pb, pb.getInitialTime(), pb.getInitialState(),
                            pb.getFinalTime(), new double[pb.getDimension()]);
            __CLR4_4_11z3b1z3blb90pdjy.R.inc(92199);if ((((nSteps < 4)&&(__CLR4_4_11z3b1z3blb90pdjy.R.iget(92200)!=0|true))||(__CLR4_4_11z3b1z3blb90pdjy.R.iget(92201)==0&false))) {{
                __CLR4_4_11z3b1z3blb90pdjy.R.inc(92202);Assert.assertTrue(handler.getMaximalValueError() > 7.0e-04);
            } }else {{
                __CLR4_4_11z3b1z3blb90pdjy.R.inc(92203);Assert.assertTrue(handler.getMaximalValueError() < 3.0e-13);
            }
        }}

    }}finally{__CLR4_4_11z3b1z3blb90pdjy.R.flushNeeded();}}

}
