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

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.JacobianMatrices.MismatchedEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class JacobianMatricesTest {static class __CLR4_4_11ybe1ybelb90pdi2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testLowAccuracyExternalDifferentiation()
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException {__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceStart(getClass().getName(),91130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1stakm1ybe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ybe1ybelb90pdi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.JacobianMatricesTest.testLowAccuracyExternalDifferentiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1stakm1ybe() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91130);
        // this test does not really test JacobianMatrices,
        // it only shows that WITHOUT this class, attempting to recover
        // the jacobians from external differentiation on simple integration
        // results with low accuracy gives very poor results. In fact,
        // the curves dy/dp = g(b) when b varies from 2.88 to 3.08 are
        // essentially noise.
        // This test is taken from Hairer, Norsett and Wanner book
        // Solving Ordinary Differential Equations I (Nonstiff problems),
        // the curves dy/dp = g(b) are in figure 6.5
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91131);FirstOrderIntegrator integ =
            new DormandPrince54Integrator(1.0e-8, 100.0, new double[] { 1.0e-4, 1.0e-4 }, new double[] { 1.0e-4, 1.0e-4 });
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91132);double hP = 1.0e-12;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91133);SummaryStatistics residualsP0 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91134);SummaryStatistics residualsP1 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91135);for (double b = 2.88; (((b < 3.08)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91136)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91137)==0&false)); b += 0.001) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91138);Brusselator brusselator = new Brusselator(b);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91139);double[] y = { 1.3, b };
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91140);integ.integrate(brusselator, 0, y, 20.0, y);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91141);double[] yP = { 1.3, b + hP };
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91142);integ.integrate(brusselator, 0, yP, 20.0, yP);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91143);residualsP0.addValue((yP[0] - y[0]) / hP - brusselator.dYdP0());
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91144);residualsP1.addValue((yP[1] - y[1]) / hP - brusselator.dYdP1());
        }
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91145);Assert.assertTrue((residualsP0.getMax() - residualsP0.getMin()) > 500);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91146);Assert.assertTrue(residualsP0.getStandardDeviation() > 30);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91147);Assert.assertTrue((residualsP1.getMax() - residualsP1.getMin()) > 700);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91148);Assert.assertTrue(residualsP1.getStandardDeviation() > 40);
    }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    @Test
    public void testHighAccuracyExternalDifferentiation()
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException, UnknownParameterException {__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceStart(getClass().getName(),91149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12jmpt81ybx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ybe1ybelb90pdi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.JacobianMatricesTest.testHighAccuracyExternalDifferentiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12jmpt81ybx() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException, UnknownParameterException{try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91149);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91150);FirstOrderIntegrator integ =
            new DormandPrince54Integrator(1.0e-8, 100.0, new double[] { 1.0e-10, 1.0e-10 }, new double[] { 1.0e-10, 1.0e-10 });
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91151);double hP = 1.0e-12;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91152);SummaryStatistics residualsP0 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91153);SummaryStatistics residualsP1 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91154);for (double b = 2.88; (((b < 3.08)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91155)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91156)==0&false)); b += 0.001) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91157);ParamBrusselator brusselator = new ParamBrusselator(b);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91158);double[] y = { 1.3, b };
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91159);integ.integrate(brusselator, 0, y, 20.0, y);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91160);double[] yP = { 1.3, b + hP };
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91161);brusselator.setParameter("b", b + hP);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91162);integ.integrate(brusselator, 0, yP, 20.0, yP);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91163);residualsP0.addValue((yP[0] - y[0]) / hP - brusselator.dYdP0());
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91164);residualsP1.addValue((yP[1] - y[1]) / hP - brusselator.dYdP1());
        }
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91165);Assert.assertTrue((residualsP0.getMax() - residualsP0.getMin()) > 0.02);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91166);Assert.assertTrue((residualsP0.getMax() - residualsP0.getMin()) < 0.03);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91167);Assert.assertTrue(residualsP0.getStandardDeviation() > 0.003);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91168);Assert.assertTrue(residualsP0.getStandardDeviation() < 0.004);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91169);Assert.assertTrue((residualsP1.getMax() - residualsP1.getMin()) > 0.04);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91170);Assert.assertTrue((residualsP1.getMax() - residualsP1.getMin()) < 0.05);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91171);Assert.assertTrue(residualsP1.getStandardDeviation() > 0.007);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91172);Assert.assertTrue(residualsP1.getStandardDeviation() < 0.008);
    }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    @Test
    public void testInternalDifferentiation()
        throws NumberIsTooSmallException, DimensionMismatchException,
               MaxCountExceededException, NoBracketingException,
               UnknownParameterException, MismatchedEquations {__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceStart(getClass().getName(),91173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18jsp8d1ycl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ybe1ybelb90pdi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.JacobianMatricesTest.testInternalDifferentiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18jsp8d1ycl() throws NumberIsTooSmallException, DimensionMismatchException, MaxCountExceededException, NoBracketingException, UnknownParameterException, MismatchedEquations{try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91173);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91174);AbstractIntegrator integ =
            new DormandPrince54Integrator(1.0e-8, 100.0, new double[] { 1.0e-4, 1.0e-4 }, new double[] { 1.0e-4, 1.0e-4 });
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91175);double hP = 1.0e-12;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91176);double hY = 1.0e-12;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91177);SummaryStatistics residualsP0 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91178);SummaryStatistics residualsP1 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91179);for (double b = 2.88; (((b < 3.08)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91180)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91181)==0&false)); b += 0.001) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91182);ParamBrusselator brusselator = new ParamBrusselator(b);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91183);brusselator.setParameter(ParamBrusselator.B, b);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91184);double[] z = { 1.3, b };
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91185);double[][] dZdZ0 = new double[2][2];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91186);double[]   dZdP  = new double[2];

            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91187);JacobianMatrices jacob = new JacobianMatrices(brusselator, new double[] { hY, hY }, ParamBrusselator.B);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91188);jacob.setParameterizedODE(brusselator);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91189);jacob.setParameterStep(ParamBrusselator.B, hP);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91190);jacob.setInitialParameterJacobian(ParamBrusselator.B, new double[] { 0.0, 1.0 });

            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91191);ExpandableStatefulODE efode = new ExpandableStatefulODE(brusselator);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91192);efode.setTime(0);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91193);efode.setPrimaryState(z);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91194);jacob.registerVariationalEquations(efode);

            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91195);integ.setMaxEvaluations(5000);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91196);integ.integrate(efode, 20.0);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91197);jacob.getCurrentMainSetJacobian(dZdZ0);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91198);jacob.getCurrentParameterJacobian(ParamBrusselator.B, dZdP);
//            Assert.assertEquals(5000, integ.getMaxEvaluations());
//            Assert.assertTrue(integ.getEvaluations() > 1500);
//            Assert.assertTrue(integ.getEvaluations() < 2100);
//            Assert.assertEquals(4 * integ.getEvaluations(), integ.getEvaluations());
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91199);residualsP0.addValue(dZdP[0] - brusselator.dYdP0());
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91200);residualsP1.addValue(dZdP[1] - brusselator.dYdP1());
        }
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91201);Assert.assertTrue((residualsP0.getMax() - residualsP0.getMin()) < 0.02);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91202);Assert.assertTrue(residualsP0.getStandardDeviation() < 0.003);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91203);Assert.assertTrue((residualsP1.getMax() - residualsP1.getMin()) < 0.05);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91204);Assert.assertTrue(residualsP1.getStandardDeviation() < 0.01);
    }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    @Test
    public void testAnalyticalDifferentiation()
        throws MaxCountExceededException, DimensionMismatchException,
               NumberIsTooSmallException, NoBracketingException,
               UnknownParameterException, MismatchedEquations {__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceStart(getClass().getName(),91205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xl4kn61ydh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ybe1ybelb90pdi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.JacobianMatricesTest.testAnalyticalDifferentiation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xl4kn61ydh() throws MaxCountExceededException, DimensionMismatchException, NumberIsTooSmallException, NoBracketingException, UnknownParameterException, MismatchedEquations{try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91205);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91206);AbstractIntegrator integ =
            new DormandPrince54Integrator(1.0e-8, 100.0, new double[] { 1.0e-4, 1.0e-4 }, new double[] { 1.0e-4, 1.0e-4 });
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91207);SummaryStatistics residualsP0 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91208);SummaryStatistics residualsP1 = new SummaryStatistics();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91209);for (double b = 2.88; (((b < 3.08)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91210)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91211)==0&false)); b += 0.001) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91212);Brusselator brusselator = new Brusselator(b);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91213);double[] z = { 1.3, b };
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91214);double[][] dZdZ0 = new double[2][2];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91215);double[]   dZdP  = new double[2];

            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91216);JacobianMatrices jacob = new JacobianMatrices(brusselator, Brusselator.B);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91217);jacob.addParameterJacobianProvider(brusselator);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91218);jacob.setInitialParameterJacobian(Brusselator.B, new double[] { 0.0, 1.0 });

            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91219);ExpandableStatefulODE efode = new ExpandableStatefulODE(brusselator);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91220);efode.setTime(0);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91221);efode.setPrimaryState(z);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91222);jacob.registerVariationalEquations(efode);

            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91223);integ.setMaxEvaluations(5000);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91224);integ.integrate(efode, 20.0);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91225);jacob.getCurrentMainSetJacobian(dZdZ0);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91226);jacob.getCurrentParameterJacobian(Brusselator.B, dZdP);
//            Assert.assertEquals(5000, integ.getMaxEvaluations());
//            Assert.assertTrue(integ.getEvaluations() > 350);
//            Assert.assertTrue(integ.getEvaluations() < 510);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91227);residualsP0.addValue(dZdP[0] - brusselator.dYdP0());
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91228);residualsP1.addValue(dZdP[1] - brusselator.dYdP1());
        }
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91229);Assert.assertTrue((residualsP0.getMax() - residualsP0.getMin()) < 0.014);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91230);Assert.assertTrue(residualsP0.getStandardDeviation() < 0.003);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91231);Assert.assertTrue((residualsP1.getMax() - residualsP1.getMin()) < 0.05);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91232);Assert.assertTrue(residualsP1.getStandardDeviation() < 0.01);
    }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    @Test
    public void testFinalResult()
        throws MaxCountExceededException, DimensionMismatchException,
               NumberIsTooSmallException, NoBracketingException,
               UnknownParameterException, MismatchedEquations {__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceStart(getClass().getName(),91233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3jno81ye9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ybe1ybelb90pdi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.JacobianMatricesTest.testFinalResult",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3jno81ye9() throws MaxCountExceededException, DimensionMismatchException, NumberIsTooSmallException, NoBracketingException, UnknownParameterException, MismatchedEquations{try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91233);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91234);AbstractIntegrator integ =
            new DormandPrince54Integrator(1.0e-8, 100.0, new double[] { 1.0e-10, 1.0e-10 }, new double[] { 1.0e-10, 1.0e-10 });
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91235);double[] y = new double[] { 0.0, 1.0 };
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91236);Circle circle = new Circle(y, 1.0, 1.0, 0.1);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91237);JacobianMatrices jacob = new JacobianMatrices(circle, Circle.CX, Circle.CY, Circle.OMEGA);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91238);jacob.addParameterJacobianProvider(circle);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91239);jacob.setInitialMainStateJacobian(circle.exactDyDy0(0));
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91240);jacob.setInitialParameterJacobian(Circle.CX, circle.exactDyDcx(0));
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91241);jacob.setInitialParameterJacobian(Circle.CY, circle.exactDyDcy(0));
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91242);jacob.setInitialParameterJacobian(Circle.OMEGA, circle.exactDyDom(0));

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91243);ExpandableStatefulODE efode = new ExpandableStatefulODE(circle);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91244);efode.setTime(0);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91245);efode.setPrimaryState(y);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91246);jacob.registerVariationalEquations(efode);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91247);integ.setMaxEvaluations(5000);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91248);double t = 18 * FastMath.PI;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91249);integ.integrate(efode, t);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91250);y = efode.getPrimaryState();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91251);for (int i = 0; (((i < y.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91252)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91253)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91254);Assert.assertEquals(circle.exactY(t)[i], y[i], 1.0e-9);
        }

        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91255);double[][] dydy0 = new double[2][2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91256);jacob.getCurrentMainSetJacobian(dydy0);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91257);for (int i = 0; (((i < dydy0.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91258)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91259)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91260);for (int j = 0; (((j < dydy0[i].length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91261)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91262)==0&false)); ++j) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91263);Assert.assertEquals(circle.exactDyDy0(t)[i][j], dydy0[i][j], 1.0e-9);
            }
        }}
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91264);double[] dydcx = new double[2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91265);jacob.getCurrentParameterJacobian(Circle.CX, dydcx);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91266);for (int i = 0; (((i < dydcx.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91267)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91268)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91269);Assert.assertEquals(circle.exactDyDcx(t)[i], dydcx[i], 1.0e-7);
        }
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91270);double[] dydcy = new double[2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91271);jacob.getCurrentParameterJacobian(Circle.CY, dydcy);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91272);for (int i = 0; (((i < dydcy.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91273)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91274)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91275);Assert.assertEquals(circle.exactDyDcy(t)[i], dydcy[i], 1.0e-7);
        }
        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91276);double[] dydom = new double[2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91277);jacob.getCurrentParameterJacobian(Circle.OMEGA, dydom);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91278);for (int i = 0; (((i < dydom.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91279)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91280)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91281);Assert.assertEquals(circle.exactDyDom(t)[i], dydom[i], 1.0e-7);
        }
    }}finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    @Test
    public void testParameterizable()
        throws MaxCountExceededException, DimensionMismatchException,
               NumberIsTooSmallException, NoBracketingException,
               UnknownParameterException, MismatchedEquations {__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceStart(getClass().getName(),91282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14uwg7d1yfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ybe1ybelb90pdi2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ybe1ybelb90pdi2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.JacobianMatricesTest.testParameterizable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14uwg7d1yfm() throws MaxCountExceededException, DimensionMismatchException, NumberIsTooSmallException, NoBracketingException, UnknownParameterException, MismatchedEquations{try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91282);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91283);AbstractIntegrator integ =
            new DormandPrince54Integrator(1.0e-8, 100.0, new double[] { 1.0e-10, 1.0e-10 }, new double[] { 1.0e-10, 1.0e-10 });
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91284);double[] y = new double[] { 0.0, 1.0 };
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91285);ParameterizedCircle pcircle = new ParameterizedCircle(y, 1.0, 1.0, 0.1);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91286);double hP = 1.0e-12;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91287);double hY = 1.0e-12;

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91288);JacobianMatrices jacob = new JacobianMatrices(pcircle, new double[] { hY, hY },
                                                      ParameterizedCircle.CX, ParameterizedCircle.CY,
                                                      ParameterizedCircle.OMEGA);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91289);jacob.setParameterizedODE(pcircle);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91290);jacob.setParameterStep(ParameterizedCircle.CX,    hP);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91291);jacob.setParameterStep(ParameterizedCircle.CY,    hP);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91292);jacob.setParameterStep(ParameterizedCircle.OMEGA, hP);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91293);jacob.setInitialMainStateJacobian(pcircle.exactDyDy0(0));
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91294);jacob.setInitialParameterJacobian(ParameterizedCircle.CX, pcircle.exactDyDcx(0));
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91295);jacob.setInitialParameterJacobian(ParameterizedCircle.CY, pcircle.exactDyDcy(0));
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91296);jacob.setInitialParameterJacobian(ParameterizedCircle.OMEGA, pcircle.exactDyDom(0));

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91297);ExpandableStatefulODE efode = new ExpandableStatefulODE(pcircle);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91298);efode.setTime(0);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91299);efode.setPrimaryState(y);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91300);jacob.registerVariationalEquations(efode);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91301);integ.setMaxEvaluations(50000);

        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91302);double t = 18 * FastMath.PI;
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91303);integ.integrate(efode, t);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91304);y = efode.getPrimaryState();
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91305);for (int i = 0; (((i < y.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91306)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91307)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91308);Assert.assertEquals(pcircle.exactY(t)[i], y[i], 1.0e-9);
        }

        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91309);double[][] dydy0 = new double[2][2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91310);jacob.getCurrentMainSetJacobian(dydy0);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91311);for (int i = 0; (((i < dydy0.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91312)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91313)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91314);for (int j = 0; (((j < dydy0[i].length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91315)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91316)==0&false)); ++j) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91317);Assert.assertEquals(pcircle.exactDyDy0(t)[i][j], dydy0[i][j], 5.0e-4);
            }
        }}

        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91318);double[] dydp0 = new double[2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91319);jacob.getCurrentParameterJacobian(ParameterizedCircle.CX, dydp0);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91320);for (int i = 0; (((i < dydp0.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91321)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91322)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91323);Assert.assertEquals(pcircle.exactDyDcx(t)[i], dydp0[i], 5.0e-4);
        }

        }__CLR4_4_11ybe1ybelb90pdi2.R.inc(91324);double[] dydp1 = new double[2];
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91325);jacob.getCurrentParameterJacobian(ParameterizedCircle.OMEGA, dydp1);
        __CLR4_4_11ybe1ybelb90pdi2.R.inc(91326);for (int i = 0; (((i < dydp1.length)&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91327)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91328)==0&false)); ++i) {{
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91329);Assert.assertEquals(pcircle.exactDyDom(t)[i], dydp1[i], 1.0e-2);
        }
    }}finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    private static class Brusselator extends AbstractParameterizable
        implements MainStateJacobianProvider, ParameterJacobianProvider {

        public static final String B = "b";

        private double b;

        public Brusselator(double b) {
            super(B);__CLR4_4_11ybe1ybelb90pdi2.R.inc(91331);try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91330);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91332);this.b = b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public int getDimension() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91333);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91334);return 2;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91335);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91336);double prod = y[0] * y[0] * y[1];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91337);yDot[0] = 1 + prod - (b + 1) * y[0];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91338);yDot[1] = b * y[0] - prod;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeMainStateJacobian(double t, double[] y, double[] yDot,
                                             double[][] dFdY) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91339);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91340);double p = 2 * y[0] * y[1];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91341);double y02 = y[0] * y[0];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91342);dFdY[0][0] = p - (1 + b);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91343);dFdY[0][1] = y02;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91344);dFdY[1][0] = b - p;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91345);dFdY[1][1] = -y02;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeParameterJacobian(double t, double[] y, double[] yDot,
                                             String paramName, double[] dFdP) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91346);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91347);if ((((isSupported(paramName))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91348)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91349)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91350);dFdP[0] = -y[0];
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91351);dFdP[1] = y[0];
            } }else {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91352);dFdP[0] = 0;
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91353);dFdP[1] = 0;
            }
        }}finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double dYdP0() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91354);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91355);return -1088.232716447743 + (1050.775747149553 + (-339.012934631828 + 36.52917025056327 * b) * b) * b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double dYdP1() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91356);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91357);return 1502.824469929139 + (-1438.6974831849952 + (460.959476642384 - 49.43847385647082 * b) * b) * b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    }

    private static class ParamBrusselator extends AbstractParameterizable
        implements FirstOrderDifferentialEquations, ParameterizedODE {

        public static final String B = "b";

        private double b;

        public ParamBrusselator(double b) {
            super(B);__CLR4_4_11ybe1ybelb90pdi2.R.inc(91359);try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91358);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91360);this.b = b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public int getDimension() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91361);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91362);return 2;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double getParameter(final String name)
            throws UnknownParameterException {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91363);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91364);complainIfNotSupported(name);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91365);return b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        /** {@inheritDoc} */
        public void setParameter(final String name, final double value)
            throws UnknownParameterException {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91366);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91367);complainIfNotSupported(name);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91368);b = value;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91369);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91370);double prod = y[0] * y[0] * y[1];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91371);yDot[0] = 1 + prod - (b + 1) * y[0];
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91372);yDot[1] = b * y[0] - prod;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double dYdP0() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91373);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91374);return -1088.232716447743 + (1050.775747149553 + (-339.012934631828 + 36.52917025056327 * b) * b) * b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double dYdP1() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91375);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91376);return 1502.824469929139 + (-1438.6974831849952 + (460.959476642384 - 49.43847385647082 * b) * b) * b;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    }

    /** ODE representing a point moving on a circle with provided center and angular rate. */
    private static class Circle extends AbstractParameterizable
        implements MainStateJacobianProvider, ParameterJacobianProvider {

        public static final String CX = "cx";
        public static final String CY = "cy";
        public static final String OMEGA = "omega";

        private final double[] y0;
        private double cx;
        private double cy;
        private double omega;

        public Circle(double[] y0, double cx, double cy, double omega) {
            super(CX,CY,OMEGA);__CLR4_4_11ybe1ybelb90pdi2.R.inc(91378);try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91377);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91379);this.y0    = y0.clone();
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91380);this.cx    = cx;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91381);this.cy    = cy;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91382);this.omega = omega;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public int getDimension() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91383);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91384);return 2;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91385);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91386);yDot[0] = omega * (cy - y[1]);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91387);yDot[1] = omega * (y[0] - cx);
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeMainStateJacobian(double t, double[] y,
                                             double[] yDot, double[][] dFdY) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91388);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91389);dFdY[0][0] = 0;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91390);dFdY[0][1] = -omega;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91391);dFdY[1][0] = omega;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91392);dFdY[1][1] = 0;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeParameterJacobian(double t, double[] y, double[] yDot,
                                             String paramName, double[] dFdP)
            throws UnknownParameterException {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91393);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91394);complainIfNotSupported(paramName);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91395);if ((((paramName.equals(CX))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91396)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91397)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91398);dFdP[0] = 0;
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91399);dFdP[1] = -omega;
            } }else {__CLR4_4_11ybe1ybelb90pdi2.R.inc(91400);if ((((paramName.equals(CY))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91401)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91402)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91403);dFdP[0] = omega;
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91404);dFdP[1] = 0;
            }  }else {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91405);dFdP[0] = cy - y[1];
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91406);dFdP[1] = y[0] - cx;
            }           
        }}}finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactY(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91407);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91408);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91409);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91410);double dx0 = y0[0] - cx;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91411);double dy0 = y0[1] - cy;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91412);return new double[] {
                cx + cos * dx0 - sin * dy0,
                cy + sin * dx0 + cos * dy0
            };
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[][] exactDyDy0(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91413);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91414);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91415);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91416);return new double[][] {
                { cos, -sin },
                { sin,  cos }
            };
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactDyDcx(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91417);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91418);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91419);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91420);return new double[] {1 - cos, -sin};
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactDyDcy(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91421);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91422);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91423);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91424);return new double[] {sin, 1 - cos};
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactDyDom(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91425);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91426);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91427);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91428);double dx0 = y0[0] - cx;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91429);double dy0 = y0[1] - cy;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91430);return new double[] { -t * (sin * dx0 + cos * dy0) , t * (cos * dx0 - sin * dy0) };
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    }

    /** ODE representing a point moving on a circle with provided center and angular rate. */
    private static class ParameterizedCircle extends AbstractParameterizable
        implements FirstOrderDifferentialEquations, ParameterizedODE {

        public static final String CX = "cx";
        public static final String CY = "cy";
        public static final String OMEGA = "omega";

        private final double[] y0;
        private double cx;
        private double cy;
        private double omega;

        public ParameterizedCircle(double[] y0, double cx, double cy, double omega) {
            super(CX,CY,OMEGA);__CLR4_4_11ybe1ybelb90pdi2.R.inc(91432);try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91431);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91433);this.y0    = y0.clone();
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91434);this.cx    = cx;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91435);this.cy    = cy;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91436);this.omega = omega;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public int getDimension() {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91437);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91438);return 2;
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void computeDerivatives(double t, double[] y, double[] yDot) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91439);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91440);yDot[0] = omega * (cy - y[1]);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91441);yDot[1] = omega * (y[0] - cx);
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double getParameter(final String name)
            throws UnknownParameterException {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91442);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91443);if ((((name.equals(CX))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91444)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91445)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91446);return cx;
            } }else {__CLR4_4_11ybe1ybelb90pdi2.R.inc(91447);if ((((name.equals(CY))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91448)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91449)==0&false))) {{
                    __CLR4_4_11ybe1ybelb90pdi2.R.inc(91450);return cy;
            } }else {__CLR4_4_11ybe1ybelb90pdi2.R.inc(91451);if ((((name.equals(OMEGA))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91452)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91453)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91454);return omega;
            } }else {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91455);throw new UnknownParameterException(name);
            }
        }}}}finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public void setParameter(final String name, final double value)
            throws UnknownParameterException {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91456);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91457);if ((((name.equals(CX))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91458)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91459)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91460);cx = value;
            } }else {__CLR4_4_11ybe1ybelb90pdi2.R.inc(91461);if ((((name.equals(CY))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91462)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91463)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91464);cy = value;
            } }else {__CLR4_4_11ybe1ybelb90pdi2.R.inc(91465);if ((((name.equals(OMEGA))&&(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91466)!=0|true))||(__CLR4_4_11ybe1ybelb90pdi2.R.iget(91467)==0&false))) {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91468);omega = value;
            } }else {{
                __CLR4_4_11ybe1ybelb90pdi2.R.inc(91469);throw new UnknownParameterException(name);
            }
        }}}}finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactY(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91470);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91471);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91472);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91473);double dx0 = y0[0] - cx;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91474);double dy0 = y0[1] - cy;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91475);return new double[] {
                cx + cos * dx0 - sin * dy0,
                cy + sin * dx0 + cos * dy0
            };
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[][] exactDyDy0(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91476);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91477);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91478);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91479);return new double[][] {
                { cos, -sin },
                { sin,  cos }
            };
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactDyDcx(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91480);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91481);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91482);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91483);return new double[] {1 - cos, -sin};
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactDyDcy(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91484);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91485);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91486);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91487);return new double[] {sin, 1 - cos};
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

        public double[] exactDyDom(double t) {try{__CLR4_4_11ybe1ybelb90pdi2.R.inc(91488);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91489);double cos = FastMath.cos(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91490);double sin = FastMath.sin(omega * t);
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91491);double dx0 = y0[0] - cx;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91492);double dy0 = y0[1] - cy;
            __CLR4_4_11ybe1ybelb90pdi2.R.inc(91493);return new double[] { -t * (sin * dx0 + cos * dy0) , t * (cos * dx0 - sin * dy0) };
        }finally{__CLR4_4_11ybe1ybelb90pdi2.R.flushNeeded();}}

    }

}
