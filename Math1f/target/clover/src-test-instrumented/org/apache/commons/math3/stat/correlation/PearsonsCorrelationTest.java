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
package org.apache.commons.math3.stat.correlation;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class PearsonsCorrelationTest {static class __CLR4_4_129x629x6lb90pel4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final double[] longleyData = new double[] {
            60323,83.0,234289,2356,1590,107608,1947,
            61122,88.5,259426,2325,1456,108632,1948,
            60171,88.2,258054,3682,1616,109773,1949,
            61187,89.5,284599,3351,1650,110929,1950,
            63221,96.2,328975,2099,3099,112075,1951,
            63639,98.1,346999,1932,3594,113270,1952,
            64989,99.0,365385,1870,3547,115094,1953,
            63761,100.0,363112,3578,3350,116219,1954,
            66019,101.2,397469,2904,3048,117388,1955,
            67857,104.6,419180,2822,2857,118734,1956,
            68169,108.4,442769,2936,2798,120445,1957,
            66513,110.8,444546,4681,2637,121950,1958,
            68655,112.6,482704,3813,2552,123366,1959,
            69564,114.2,502601,3931,2514,125368,1960,
            69331,115.7,518173,4806,2572,127852,1961,
            70551,116.9,554894,4007,2827,130081,1962
        };

    protected final double[] swissData = new double[] {
            80.2,17.0,15,12,9.96,
            83.1,45.1,6,9,84.84,
            92.5,39.7,5,5,93.40,
            85.8,36.5,12,7,33.77,
            76.9,43.5,17,15,5.16,
            76.1,35.3,9,7,90.57,
            83.8,70.2,16,7,92.85,
            92.4,67.8,14,8,97.16,
            82.4,53.3,12,7,97.67,
            82.9,45.2,16,13,91.38,
            87.1,64.5,14,6,98.61,
            64.1,62.0,21,12,8.52,
            66.9,67.5,14,7,2.27,
            68.9,60.7,19,12,4.43,
            61.7,69.3,22,5,2.82,
            68.3,72.6,18,2,24.20,
            71.7,34.0,17,8,3.30,
            55.7,19.4,26,28,12.11,
            54.3,15.2,31,20,2.15,
            65.1,73.0,19,9,2.84,
            65.5,59.8,22,10,5.23,
            65.0,55.1,14,3,4.52,
            56.6,50.9,22,12,15.14,
            57.4,54.1,20,6,4.20,
            72.5,71.2,12,1,2.40,
            74.2,58.1,14,8,5.23,
            72.0,63.5,6,3,2.56,
            60.5,60.8,16,10,7.72,
            58.3,26.8,25,19,18.46,
            65.4,49.5,15,8,6.10,
            75.5,85.9,3,2,99.71,
            69.3,84.9,7,6,99.68,
            77.3,89.7,5,2,100.00,
            70.5,78.2,12,6,98.96,
            79.4,64.9,7,3,98.22,
            65.0,75.9,9,9,99.06,
            92.2,84.6,3,3,99.46,
            79.3,63.1,13,13,96.83,
            70.4,38.4,26,12,5.62,
            65.7,7.7,29,11,13.79,
            72.7,16.7,22,13,11.22,
            64.4,17.6,35,32,16.92,
            77.6,37.6,15,7,4.97,
            67.6,18.7,25,7,8.65,
            35.0,1.2,37,53,42.34,
            44.7,46.6,16,29,50.43,
            42.8,27.7,22,29,58.33
        };


    /**
     * Test Longley dataset against R.
     */
    @Test
    public void testLongly() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjv2zi29x6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testLongly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjv2zi29x6(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106170);
        __CLR4_4_129x629x6lb90pel4.R.inc(106171);RealMatrix matrix = createRealMatrix(longleyData, 16, 7);
        __CLR4_4_129x629x6lb90pel4.R.inc(106172);PearsonsCorrelation corrInstance = new PearsonsCorrelation(matrix);
        __CLR4_4_129x629x6lb90pel4.R.inc(106173);RealMatrix correlationMatrix = corrInstance.getCorrelationMatrix();
        __CLR4_4_129x629x6lb90pel4.R.inc(106174);double[] rData = new double[] {
                1.000000000000000, 0.9708985250610560, 0.9835516111796693, 0.5024980838759942,
                0.4573073999764817, 0.960390571594376, 0.9713294591921188,
                0.970898525061056, 1.0000000000000000, 0.9915891780247822, 0.6206333925590966,
                0.4647441876006747, 0.979163432977498, 0.9911491900672053,
                0.983551611179669, 0.9915891780247822, 1.0000000000000000, 0.6042609398895580,
                0.4464367918926265, 0.991090069458478, 0.9952734837647849,
                0.502498083875994, 0.6206333925590966, 0.6042609398895580, 1.0000000000000000,
                -0.1774206295018783, 0.686551516365312, 0.6682566045621746,
                0.457307399976482, 0.4647441876006747, 0.4464367918926265, -0.1774206295018783,
                1.0000000000000000, 0.364416267189032, 0.4172451498349454,
                0.960390571594376, 0.9791634329774981, 0.9910900694584777, 0.6865515163653120,
                0.3644162671890320, 1.000000000000000, 0.9939528462329257,
                0.971329459192119, 0.9911491900672053, 0.9952734837647849, 0.6682566045621746,
                0.4172451498349454, 0.993952846232926, 1.0000000000000000
        };
        __CLR4_4_129x629x6lb90pel4.R.inc(106175);TestUtils.assertEquals("correlation matrix", createRealMatrix(rData, 7, 7), correlationMatrix, 10E-15);

        __CLR4_4_129x629x6lb90pel4.R.inc(106176);double[] rPvalues = new double[] {
                4.38904690369668e-10,
                8.36353208910623e-12, 7.8159700933611e-14,
                0.0472894097790304, 0.01030636128354301, 0.01316878049026582,
                0.0749178049642416, 0.06971758330341182, 0.0830166169296545, 0.510948586323452,
                3.693245043123738e-09, 4.327782576751815e-11, 1.167954621905665e-13, 0.00331028281967516, 0.1652293725106684,
                3.95834476307755e-10, 1.114663916723657e-13, 1.332267629550188e-15, 0.00466039138541463, 0.1078477071581498, 7.771561172376096e-15
        };
        __CLR4_4_129x629x6lb90pel4.R.inc(106177);RealMatrix rPMatrix = createLowerTriangularRealMatrix(rPvalues, 7);
        __CLR4_4_129x629x6lb90pel4.R.inc(106178);fillUpper(rPMatrix, 0d);
        __CLR4_4_129x629x6lb90pel4.R.inc(106179);TestUtils.assertEquals("correlation p values", rPMatrix, corrInstance.getCorrelationPValues(), 10E-15);
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    /**
     * Test R Swiss fertility dataset against R.
     */
    @Test
    public void testSwissFertility() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q647sy29xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testSwissFertility",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q647sy29xg(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106180);
         __CLR4_4_129x629x6lb90pel4.R.inc(106181);RealMatrix matrix = createRealMatrix(swissData, 47, 5);
         __CLR4_4_129x629x6lb90pel4.R.inc(106182);PearsonsCorrelation corrInstance = new PearsonsCorrelation(matrix);
         __CLR4_4_129x629x6lb90pel4.R.inc(106183);RealMatrix correlationMatrix = corrInstance.getCorrelationMatrix();
         __CLR4_4_129x629x6lb90pel4.R.inc(106184);double[] rData = new double[] {
               1.0000000000000000, 0.3530791836199747, -0.6458827064572875, -0.6637888570350691,  0.4636847006517939,
                 0.3530791836199747, 1.0000000000000000,-0.6865422086171366, -0.6395225189483201, 0.4010950530487398,
                -0.6458827064572875, -0.6865422086171366, 1.0000000000000000, 0.6984152962884830, -0.5727418060641666,
                -0.6637888570350691, -0.6395225189483201, 0.6984152962884830, 1.0000000000000000, -0.1538589170909148,
                 0.4636847006517939, 0.4010950530487398, -0.5727418060641666, -0.1538589170909148, 1.0000000000000000
         };
         __CLR4_4_129x629x6lb90pel4.R.inc(106185);TestUtils.assertEquals("correlation matrix", createRealMatrix(rData, 5, 5), correlationMatrix, 10E-15);

         __CLR4_4_129x629x6lb90pel4.R.inc(106186);double[] rPvalues = new double[] {
                 0.01491720061472623,
                 9.45043734069043e-07, 9.95151527133974e-08,
                 3.658616965962355e-07, 1.304590105694471e-06, 4.811397236181847e-08,
                 0.001028523190118147, 0.005204433539191644, 2.588307925380906e-05, 0.301807756132683
         };
         __CLR4_4_129x629x6lb90pel4.R.inc(106187);RealMatrix rPMatrix = createLowerTriangularRealMatrix(rPvalues, 5);
         __CLR4_4_129x629x6lb90pel4.R.inc(106188);fillUpper(rPMatrix, 0d);
         __CLR4_4_129x629x6lb90pel4.R.inc(106189);TestUtils.assertEquals("correlation p values", rPMatrix, corrInstance.getCorrelationPValues(), 10E-15);
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    /**
     * Test p-value near 0. JIRA: MATH-371
     */
    @Test
    public void testPValueNearZero() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d6kgzu29xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testPValueNearZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d6kgzu29xq(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106190);
        /*
         * Create a dataset that has r -> 1, p -> 0 as dimension increases.
         * Prior to the fix for MATH-371, p vanished for dimension >= 14.
         * Post fix, p-values diminish smoothly, vanishing at dimension = 127.
         * Tested value is ~1E-303.
         */
        __CLR4_4_129x629x6lb90pel4.R.inc(106191);int dimension = 120;
        __CLR4_4_129x629x6lb90pel4.R.inc(106192);double[][] data = new double[dimension][2];
        __CLR4_4_129x629x6lb90pel4.R.inc(106193);for (int i = 0; (((i < dimension)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106194)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106195)==0&false)); i++) {{
            __CLR4_4_129x629x6lb90pel4.R.inc(106196);data[i][0] = i;
            __CLR4_4_129x629x6lb90pel4.R.inc(106197);data[i][1] = i + 1/((double)i + 1);
        }
        }__CLR4_4_129x629x6lb90pel4.R.inc(106198);PearsonsCorrelation corrInstance = new PearsonsCorrelation(data);
        __CLR4_4_129x629x6lb90pel4.R.inc(106199);Assert.assertTrue(corrInstance.getCorrelationPValues().getEntry(0, 1) > 0);
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}


    /**
     * Constant column
     */
    @Test
    public void testConstant() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v29y0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v29y0(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106200);
        __CLR4_4_129x629x6lb90pel4.R.inc(106201);double[] noVariance = new double[] {1, 1, 1, 1};
        __CLR4_4_129x629x6lb90pel4.R.inc(106202);double[] values = new double[] {1, 2, 3, 4};
        __CLR4_4_129x629x6lb90pel4.R.inc(106203);Assert.assertTrue(Double.isNaN(new PearsonsCorrelation().correlation(noVariance, values)));
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}


    /**
     * Insufficient data
     */

    @Test
    public void testInsufficientData() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xyn3a29y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testInsufficientData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xyn3a29y4(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106204);
        __CLR4_4_129x629x6lb90pel4.R.inc(106205);double[] one = new double[] {1};
        __CLR4_4_129x629x6lb90pel4.R.inc(106206);double[] two = new double[] {2};
        __CLR4_4_129x629x6lb90pel4.R.inc(106207);try {
            __CLR4_4_129x629x6lb90pel4.R.inc(106208);new PearsonsCorrelation().correlation(one, two);
            __CLR4_4_129x629x6lb90pel4.R.inc(106209);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_129x629x6lb90pel4.R.inc(106210);RealMatrix matrix = new BlockRealMatrix(new double[][] {{0},{1}});
        __CLR4_4_129x629x6lb90pel4.R.inc(106211);try {
            __CLR4_4_129x629x6lb90pel4.R.inc(106212);new PearsonsCorrelation(matrix);
            __CLR4_4_129x629x6lb90pel4.R.inc(106213);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    /**
     * Verify that direct t-tests using standard error estimates are consistent
     * with reported p-values
     */
    @Test
    public void testStdErrorConsistency() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unagrs29ye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testStdErrorConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unagrs29ye(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106214);
        __CLR4_4_129x629x6lb90pel4.R.inc(106215);TDistribution tDistribution = new TDistribution(45);
        __CLR4_4_129x629x6lb90pel4.R.inc(106216);RealMatrix matrix = createRealMatrix(swissData, 47, 5);
        __CLR4_4_129x629x6lb90pel4.R.inc(106217);PearsonsCorrelation corrInstance = new PearsonsCorrelation(matrix);
        __CLR4_4_129x629x6lb90pel4.R.inc(106218);RealMatrix rValues = corrInstance.getCorrelationMatrix();
        __CLR4_4_129x629x6lb90pel4.R.inc(106219);RealMatrix pValues = corrInstance.getCorrelationPValues();
        __CLR4_4_129x629x6lb90pel4.R.inc(106220);RealMatrix stdErrors = corrInstance.getCorrelationStandardErrors();
        __CLR4_4_129x629x6lb90pel4.R.inc(106221);for (int i = 0; (((i < 5)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106222)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106223)==0&false)); i++) {{
            __CLR4_4_129x629x6lb90pel4.R.inc(106224);for (int j = 0; (((j < i)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106225)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106226)==0&false)); j++) {{
                __CLR4_4_129x629x6lb90pel4.R.inc(106227);double t = FastMath.abs(rValues.getEntry(i, j)) / stdErrors.getEntry(i, j);
                __CLR4_4_129x629x6lb90pel4.R.inc(106228);double p = 2 * (1 - tDistribution.cumulativeProbability(t));
                __CLR4_4_129x629x6lb90pel4.R.inc(106229);Assert.assertEquals(p, pValues.getEntry(i, j), 10E-15);
            }
        }}
    }}finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    /**
     * Verify that creating correlation from covariance gives same results as
     * direct computation from the original matrix
     */
    @Test
    public void testCovarianceConsistency() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dudh7429yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testCovarianceConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dudh7429yu(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106230);
        __CLR4_4_129x629x6lb90pel4.R.inc(106231);RealMatrix matrix = createRealMatrix(longleyData, 16, 7);
        __CLR4_4_129x629x6lb90pel4.R.inc(106232);PearsonsCorrelation corrInstance = new PearsonsCorrelation(matrix);
        __CLR4_4_129x629x6lb90pel4.R.inc(106233);Covariance covInstance = new Covariance(matrix);
        __CLR4_4_129x629x6lb90pel4.R.inc(106234);PearsonsCorrelation corrFromCovInstance = new PearsonsCorrelation(covInstance);
        __CLR4_4_129x629x6lb90pel4.R.inc(106235);TestUtils.assertEquals("correlation values", corrInstance.getCorrelationMatrix(),
                corrFromCovInstance.getCorrelationMatrix(), 10E-15);
        __CLR4_4_129x629x6lb90pel4.R.inc(106236);TestUtils.assertEquals("p values", corrInstance.getCorrelationPValues(),
                corrFromCovInstance.getCorrelationPValues(), 10E-15);
        __CLR4_4_129x629x6lb90pel4.R.inc(106237);TestUtils.assertEquals("standard errors", corrInstance.getCorrelationStandardErrors(),
                corrFromCovInstance.getCorrelationStandardErrors(), 10E-15);

        __CLR4_4_129x629x6lb90pel4.R.inc(106238);PearsonsCorrelation corrFromCovInstance2 =
            new PearsonsCorrelation(covInstance.getCovarianceMatrix(), 16);
        __CLR4_4_129x629x6lb90pel4.R.inc(106239);TestUtils.assertEquals("correlation values", corrInstance.getCorrelationMatrix(),
                corrFromCovInstance2.getCorrelationMatrix(), 10E-15);
        __CLR4_4_129x629x6lb90pel4.R.inc(106240);TestUtils.assertEquals("p values", corrInstance.getCorrelationPValues(),
                corrFromCovInstance2.getCorrelationPValues(), 10E-15);
        __CLR4_4_129x629x6lb90pel4.R.inc(106241);TestUtils.assertEquals("standard errors", corrInstance.getCorrelationStandardErrors(),
                corrFromCovInstance2.getCorrelationStandardErrors(), 10E-15);
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}


    @Test
    public void testConsistency() {__CLR4_4_129x629x6lb90pel4.R.globalSliceStart(getClass().getName(),106242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tafanh29z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129x629x6lb90pel4.R.rethrow($CLV_t2$);}finally{__CLR4_4_129x629x6lb90pel4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest.testConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tafanh29z6(){try{__CLR4_4_129x629x6lb90pel4.R.inc(106242);
        __CLR4_4_129x629x6lb90pel4.R.inc(106243);RealMatrix matrix = createRealMatrix(longleyData, 16, 7);
        __CLR4_4_129x629x6lb90pel4.R.inc(106244);PearsonsCorrelation corrInstance = new PearsonsCorrelation(matrix);
        __CLR4_4_129x629x6lb90pel4.R.inc(106245);double[][] data = matrix.getData();
        __CLR4_4_129x629x6lb90pel4.R.inc(106246);double[] x = matrix.getColumn(0);
        __CLR4_4_129x629x6lb90pel4.R.inc(106247);double[] y = matrix.getColumn(1);
        __CLR4_4_129x629x6lb90pel4.R.inc(106248);Assert.assertEquals(new PearsonsCorrelation().correlation(x, y),
                corrInstance.getCorrelationMatrix().getEntry(0, 1), Double.MIN_VALUE);
        __CLR4_4_129x629x6lb90pel4.R.inc(106249);TestUtils.assertEquals("Correlation matrix", corrInstance.getCorrelationMatrix(),
                new PearsonsCorrelation().computeCorrelationMatrix(data), Double.MIN_VALUE);
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    protected RealMatrix createRealMatrix(double[] data, int nRows, int nCols) {try{__CLR4_4_129x629x6lb90pel4.R.inc(106250);
        __CLR4_4_129x629x6lb90pel4.R.inc(106251);double[][] matrixData = new double[nRows][nCols];
        __CLR4_4_129x629x6lb90pel4.R.inc(106252);int ptr = 0;
        __CLR4_4_129x629x6lb90pel4.R.inc(106253);for (int i = 0; (((i < nRows)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106254)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106255)==0&false)); i++) {{
            __CLR4_4_129x629x6lb90pel4.R.inc(106256);System.arraycopy(data, ptr, matrixData[i], 0, nCols);
            __CLR4_4_129x629x6lb90pel4.R.inc(106257);ptr += nCols;
        }
        }__CLR4_4_129x629x6lb90pel4.R.inc(106258);return new BlockRealMatrix(matrixData);
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    protected RealMatrix createLowerTriangularRealMatrix(double[] data, int dimension) {try{__CLR4_4_129x629x6lb90pel4.R.inc(106259);
        __CLR4_4_129x629x6lb90pel4.R.inc(106260);int ptr = 0;
        __CLR4_4_129x629x6lb90pel4.R.inc(106261);RealMatrix result = new BlockRealMatrix(dimension, dimension);
        __CLR4_4_129x629x6lb90pel4.R.inc(106262);for (int i = 1; (((i < dimension)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106263)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106264)==0&false)); i++) {{
            __CLR4_4_129x629x6lb90pel4.R.inc(106265);for (int j = 0; (((j < i)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106266)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106267)==0&false)); j++) {{
                __CLR4_4_129x629x6lb90pel4.R.inc(106268);result.setEntry(i, j, data[ptr]);
                __CLR4_4_129x629x6lb90pel4.R.inc(106269);ptr++;
            }
        }}
        }__CLR4_4_129x629x6lb90pel4.R.inc(106270);return result;
    }finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}

    protected void fillUpper(RealMatrix matrix, double diagonalValue) {try{__CLR4_4_129x629x6lb90pel4.R.inc(106271);
        __CLR4_4_129x629x6lb90pel4.R.inc(106272);int dimension = matrix.getColumnDimension();
        __CLR4_4_129x629x6lb90pel4.R.inc(106273);for (int i = 0; (((i < dimension)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106274)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106275)==0&false)); i++) {{
            __CLR4_4_129x629x6lb90pel4.R.inc(106276);matrix.setEntry(i, i, diagonalValue);
            __CLR4_4_129x629x6lb90pel4.R.inc(106277);for (int j = i+1; (((j < dimension)&&(__CLR4_4_129x629x6lb90pel4.R.iget(106278)!=0|true))||(__CLR4_4_129x629x6lb90pel4.R.iget(106279)==0&false)); j++) {{
                __CLR4_4_129x629x6lb90pel4.R.inc(106280);matrix.setEntry(i, j, matrix.getEntry(j, i));
            }
        }}
    }}finally{__CLR4_4_129x629x6lb90pel4.R.flushNeeded();}}
}
