/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.apache.commons.math3.filter;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.MatrixDimensionMismatchException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for {@link KalmanFilter}.
 *
 * @version $Id$
 */
public class KalmanFilterTest {static class __CLR4_4_11kuz1kuzlb90pch7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test(expected=MatrixDimensionMismatchException.class)
    public void testTransitionMeasurementMatrixMismatch() {__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceStart(getClass().getName(),73691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azyvm31kuz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,114,97,110,115,105,116,105,111,110,77,101,97,115,117,114,101,109,101,110,116,77,97,116,114,105,120,77,105,115,109,97,116,99,104,58,32,91,77,97,116,114,105,120,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MatrixDimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kuz1kuzlb90pch7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.filter.KalmanFilterTest.testTransitionMeasurementMatrixMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azyvm31kuz(){try{__CLR4_4_11kuz1kuzlb90pch7.R.inc(73691);
        
        // A and H matrix do not match in dimensions
        
        // A = [ 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73692);RealMatrix A = new Array2DRowRealMatrix(new double[] { 1d });
        // no control input
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73693);RealMatrix B = null;
        // H = [ 1 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73694);RealMatrix H = new Array2DRowRealMatrix(new double[] { 1d, 1d });
        // Q = [ 0 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73695);RealMatrix Q = new Array2DRowRealMatrix(new double[] { 0 });
        // R = [ 0 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73696);RealMatrix R = new Array2DRowRealMatrix(new double[] { 0 });

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73697);ProcessModel pm
            = new DefaultProcessModel(A, B, Q,
                                      new ArrayRealVector(new double[] { 0 }), null);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73698);MeasurementModel mm = new DefaultMeasurementModel(H, R);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73699);new KalmanFilter(pm, mm);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73700);Assert.fail("transition and measurement matrix should not be compatible");
    }finally{__CLR4_4_11kuz1kuzlb90pch7.R.flushNeeded();}}

    @Test(expected=MatrixDimensionMismatchException.class)
    public void testTransitionControlMatrixMismatch() {__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceStart(getClass().getName(),73701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4o8j81kv9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,114,97,110,115,105,116,105,111,110,67,111,110,116,114,111,108,77,97,116,114,105,120,77,105,115,109,97,116,99,104,58,32,91,77,97,116,114,105,120,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MatrixDimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kuz1kuzlb90pch7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.filter.KalmanFilterTest.testTransitionControlMatrixMismatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4o8j81kv9(){try{__CLR4_4_11kuz1kuzlb90pch7.R.inc(73701);
        
        // A and B matrix do not match in dimensions
        
        // A = [ 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73702);RealMatrix A = new Array2DRowRealMatrix(new double[] { 1d });
        // B = [ 1 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73703);RealMatrix B = new Array2DRowRealMatrix(new double[] { 1d, 1d });
        // H = [ 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73704);RealMatrix H = new Array2DRowRealMatrix(new double[] { 1d });
        // Q = [ 0 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73705);RealMatrix Q = new Array2DRowRealMatrix(new double[] { 0 });
        // R = [ 0 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73706);RealMatrix R = new Array2DRowRealMatrix(new double[] { 0 });

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73707);ProcessModel pm
            = new DefaultProcessModel(A, B, Q,
                                      new ArrayRealVector(new double[] { 0 }), null);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73708);MeasurementModel mm = new DefaultMeasurementModel(H, R);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73709);new KalmanFilter(pm, mm);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73710);Assert.fail("transition and control matrix should not be compatible");
    }finally{__CLR4_4_11kuz1kuzlb90pch7.R.flushNeeded();}}
    
    @Test
    public void testConstant() {__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceStart(getClass().getName(),73711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v1kvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kuz1kuzlb90pch7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.filter.KalmanFilterTest.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73711,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v1kvj(){try{__CLR4_4_11kuz1kuzlb90pch7.R.inc(73711);
        // simulates a simple process with a constant state and no control input
        
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73712);double constantValue = 10d;
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73713);double measurementNoise = 0.1d;
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73714);double processNoise = 1e-5d;

        // A = [ 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73715);RealMatrix A = new Array2DRowRealMatrix(new double[] { 1d });
        // no control input
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73716);RealMatrix B = null;
        // H = [ 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73717);RealMatrix H = new Array2DRowRealMatrix(new double[] { 1d });
        // x = [ 10 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73718);RealVector x = new ArrayRealVector(new double[] { constantValue });
        // Q = [ 1e-5 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73719);RealMatrix Q = new Array2DRowRealMatrix(new double[] { processNoise });
        // R = [ 0.1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73720);RealMatrix R = new Array2DRowRealMatrix(new double[] { measurementNoise });

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73721);ProcessModel pm
            = new DefaultProcessModel(A, B, Q,
                                      new ArrayRealVector(new double[] { constantValue }), null);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73722);MeasurementModel mm = new DefaultMeasurementModel(H, R);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73723);KalmanFilter filter = new KalmanFilter(pm, mm);

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73724);Assert.assertEquals(1, filter.getMeasurementDimension());
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73725);Assert.assertEquals(1, filter.getStateDimension());

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73726);assertMatrixEquals(Q.getData(), filter.getErrorCovariance());

        // check the initial state
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73727);double[] expectedInitialState = new double[] { constantValue };
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73728);assertVectorEquals(expectedInitialState, filter.getStateEstimation());

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73729);RealVector pNoise = new ArrayRealVector(1);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73730);RealVector mNoise = new ArrayRealVector(1);

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73731);RandomGenerator rand = new JDKRandomGenerator();
        // iterate 60 steps
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73732);for (int i = 0; (((i < 60)&&(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73733)!=0|true))||(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73734)==0&false)); i++) {{
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73735);filter.predict();

            // Simulate the process
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73736);pNoise.setEntry(0, processNoise * rand.nextGaussian());

            // x = A * x + p_noise
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73737);x = A.operate(x).add(pNoise);

            // Simulate the measurement
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73738);mNoise.setEntry(0, measurementNoise * rand.nextGaussian());

            // z = H * x + m_noise
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73739);RealVector z = H.operate(x).add(mNoise);

            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73740);filter.correct(z);

            // state estimate shouldn't be larger than measurement noise
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73741);double diff = Math.abs(constantValue - filter.getStateEstimation()[0]);
            // System.out.println(diff);
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73742);Assert.assertTrue(Precision.compareTo(diff, measurementNoise, 1e-6) < 0);
        }

        // error covariance should be already very low (< 0.02)
        }__CLR4_4_11kuz1kuzlb90pch7.R.inc(73743);Assert.assertTrue(Precision.compareTo(filter.getErrorCovariance()[0][0],
                                              0.02d, 1e-6) < 0);
    }finally{__CLR4_4_11kuz1kuzlb90pch7.R.flushNeeded();}}

    @Test
    public void testConstantAcceleration() {__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceStart(getClass().getName(),73744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t7bu6b1kwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11kuz1kuzlb90pch7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11kuz1kuzlb90pch7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.filter.KalmanFilterTest.testConstantAcceleration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t7bu6b1kwg(){try{__CLR4_4_11kuz1kuzlb90pch7.R.inc(73744);
        // simulates a vehicle, accelerating at a constant rate (0.1 m/s)

        // discrete time interval
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73745);double dt = 0.1d;
        // position measurement noise (meter)
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73746);double measurementNoise = 10d;
        // acceleration noise (meter/sec^2)
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73747);double accelNoise = 0.2d;

        // A = [ 1 dt ]
        //     [ 0  1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73748);RealMatrix A = new Array2DRowRealMatrix(new double[][] { { 1, dt }, { 0, 1 } });

        // B = [ dt^2/2 ]
        //     [ dt     ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73749);RealMatrix B = new Array2DRowRealMatrix(
                new double[][] { { Math.pow(dt, 2d) / 2d }, { dt } });

        // H = [ 1 0 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73750);RealMatrix H = new Array2DRowRealMatrix(new double[][] { { 1d, 0d } });

        // x = [ 0 0 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73751);RealVector x = new ArrayRealVector(new double[] { 0, 0 });

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73752);RealMatrix tmp = new Array2DRowRealMatrix(
                new double[][] { { Math.pow(dt, 4d) / 4d, Math.pow(dt, 3d) / 2d },
                                 { Math.pow(dt, 3d) / 2d, Math.pow(dt, 2d) } });

        // Q = [ dt^4/4 dt^3/2 ]
        //     [ dt^3/2 dt^2   ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73753);RealMatrix Q = tmp.scalarMultiply(Math.pow(accelNoise, 2));

        // P0 = [ 1 1 ]
        //      [ 1 1 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73754);RealMatrix P0 = new Array2DRowRealMatrix(new double[][] { { 1, 1 }, { 1, 1 } });

        // R = [ measurementNoise^2 ]
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73755);RealMatrix R = new Array2DRowRealMatrix(
                new double[] { Math.pow(measurementNoise, 2) });

        // constant control input, increase velocity by 0.1 m/s per cycle
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73756);RealVector u = new ArrayRealVector(new double[] { 0.1d });

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73757);ProcessModel pm = new DefaultProcessModel(A, B, Q, x, P0);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73758);MeasurementModel mm = new DefaultMeasurementModel(H, R);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73759);KalmanFilter filter = new KalmanFilter(pm, mm);

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73760);Assert.assertEquals(1, filter.getMeasurementDimension());
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73761);Assert.assertEquals(2, filter.getStateDimension());

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73762);assertMatrixEquals(P0.getData(), filter.getErrorCovariance());

        // check the initial state
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73763);double[] expectedInitialState = new double[] { 0.0, 0.0 };
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73764);assertVectorEquals(expectedInitialState, filter.getStateEstimation());

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73765);RandomGenerator rand = new JDKRandomGenerator();

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73766);RealVector tmpPNoise = new ArrayRealVector(
                new double[] { Math.pow(dt, 2d) / 2d, dt });

        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73767);RealVector mNoise = new ArrayRealVector(1);

        // iterate 60 steps
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73768);for (int i = 0; (((i < 60)&&(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73769)!=0|true))||(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73770)==0&false)); i++) {{
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73771);filter.predict(u);

            // Simulate the process
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73772);RealVector pNoise = tmpPNoise.mapMultiply(accelNoise * rand.nextGaussian());

            // x = A * x + B * u + pNoise
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73773);x = A.operate(x).add(B.operate(u)).add(pNoise);

            // Simulate the measurement
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73774);mNoise.setEntry(0, measurementNoise * rand.nextGaussian());

            // z = H * x + m_noise
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73775);RealVector z = H.operate(x).add(mNoise);

            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73776);filter.correct(z);

            // state estimate shouldn't be larger than the measurement noise
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73777);double diff = Math.abs(x.getEntry(0) - filter.getStateEstimation()[0]);
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73778);Assert.assertTrue(Precision.compareTo(diff, measurementNoise, 1e-6) < 0);
        }

        // error covariance of the velocity should be already very low (< 0.1)
        }__CLR4_4_11kuz1kuzlb90pch7.R.inc(73779);Assert.assertTrue(Precision.compareTo(filter.getErrorCovariance()[1][1],
                                              0.1d, 1e-6) < 0);
    }finally{__CLR4_4_11kuz1kuzlb90pch7.R.flushNeeded();}}
    
    private void assertVectorEquals(double[] expected, double[] result) {try{__CLR4_4_11kuz1kuzlb90pch7.R.inc(73780);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73781);Assert.assertEquals("Wrong number of rows.", expected.length,
                            result.length);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73782);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73783)!=0|true))||(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73784)==0&false)); i++) {{
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73785);Assert.assertEquals("Wrong value at position [" + i + "]",
                                expected[i], result[i], 1.0e-6);
        }
    }}finally{__CLR4_4_11kuz1kuzlb90pch7.R.flushNeeded();}}

    private void assertMatrixEquals(double[][] expected, double[][] result) {try{__CLR4_4_11kuz1kuzlb90pch7.R.inc(73786);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73787);Assert.assertEquals("Wrong number of rows.", expected.length,
                            result.length);
        __CLR4_4_11kuz1kuzlb90pch7.R.inc(73788);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73789)!=0|true))||(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73790)==0&false)); i++) {{
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73791);Assert.assertEquals("Wrong number of columns.", expected[i].length,
                                result[i].length);
            __CLR4_4_11kuz1kuzlb90pch7.R.inc(73792);for (int j = 0; (((j < expected[i].length)&&(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73793)!=0|true))||(__CLR4_4_11kuz1kuzlb90pch7.R.iget(73794)==0&false)); j++) {{
                __CLR4_4_11kuz1kuzlb90pch7.R.inc(73795);Assert.assertEquals("Wrong value at position [" + i + "," + j
                                    + "]", expected[i][j], result[i][j], 1.0e-6);
            }
        }}
    }}finally{__CLR4_4_11kuz1kuzlb90pch7.R.flushNeeded();}}
}
