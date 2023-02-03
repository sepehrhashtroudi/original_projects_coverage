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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.junit.Assert;
import org.junit.Test;


public class CovarianceTest {static class __CLR4_4_129va29valb90pekr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106170,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
     * Data Source: J. Longley (1967) "An Appraisal of Least Squares
     * Programs for the Electronic Computer from the Point of View of the User"
     * Journal of the American Statistical Association, vol. 62. September,
     * pp. 819-841.
     *
     * Data are from NIST:
     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat
     */
    @Test
    public void testLongly() {__CLR4_4_129va29valb90pekr.R.globalSliceStart(getClass().getName(),106102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjv2zi29va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129va29valb90pekr.R.rethrow($CLV_t2$);}finally{__CLR4_4_129va29valb90pekr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.CovarianceTest.testLongly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjv2zi29va(){try{__CLR4_4_129va29valb90pekr.R.inc(106102);
        __CLR4_4_129va29valb90pekr.R.inc(106103);RealMatrix matrix = createRealMatrix(longleyData, 16, 7);
        __CLR4_4_129va29valb90pekr.R.inc(106104);RealMatrix covarianceMatrix = new Covariance(matrix).getCovarianceMatrix();
        __CLR4_4_129va29valb90pekr.R.inc(106105);double[] rData = new double[] {
         12333921.73333333246, 3.679666000000000e+04, 343330206.333333313,
         1649102.666666666744, 1117681.066666666651, 23461965.733333334, 16240.93333333333248,
         36796.66000000000, 1.164576250000000e+02, 1063604.115416667,
         6258.666250000000, 3490.253750000000, 73503.000000000, 50.92333333333334,
         343330206.33333331347, 1.063604115416667e+06, 9879353659.329166412,
         56124369.854166664183, 30880428.345833335072, 685240944.600000024, 470977.90000000002328,
         1649102.66666666674, 6.258666250000000e+03, 56124369.854166664,
         873223.429166666698, -115378.762499999997, 4462741.533333333, 2973.03333333333330,
         1117681.06666666665, 3.490253750000000e+03, 30880428.345833335,
         -115378.762499999997, 484304.095833333326, 1764098.133333333, 1382.43333333333339,
         23461965.73333333433, 7.350300000000000e+04, 685240944.600000024,
         4462741.533333333209, 1764098.133333333302, 48387348.933333330, 32917.40000000000146,
         16240.93333333333, 5.092333333333334e+01, 470977.900000000,
         2973.033333333333, 1382.433333333333, 32917.40000000, 22.66666666666667
        };

        __CLR4_4_129va29valb90pekr.R.inc(106106);TestUtils.assertEquals("covariance matrix", createRealMatrix(rData, 7, 7), covarianceMatrix, 10E-9);

    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}

    /**
     * Test R Swiss fertility dataset against R.
     * Data Source: R datasets package
     */
    @Test
    public void testSwissFertility() {__CLR4_4_129va29valb90pekr.R.globalSliceStart(getClass().getName(),106107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q647sy29vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129va29valb90pekr.R.rethrow($CLV_t2$);}finally{__CLR4_4_129va29valb90pekr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.CovarianceTest.testSwissFertility",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q647sy29vf(){try{__CLR4_4_129va29valb90pekr.R.inc(106107);
         __CLR4_4_129va29valb90pekr.R.inc(106108);RealMatrix matrix = createRealMatrix(swissData, 47, 5);
         __CLR4_4_129va29valb90pekr.R.inc(106109);RealMatrix covarianceMatrix = new Covariance(matrix).getCovarianceMatrix();
         __CLR4_4_129va29valb90pekr.R.inc(106110);double[] rData = new double[] {
           156.0424976873265, 100.1691489361702, -64.36692876965772, -79.7295097132285, 241.5632030527289,
           100.169148936170251, 515.7994172062905, -124.39283071230344, -139.6574005550416, 379.9043755781684,
           -64.3669287696577, -124.3928307123034, 63.64662349676226, 53.5758556891767, -190.5606105457909,
           -79.7295097132285, -139.6574005550416, 53.57585568917669, 92.4560592044403, -61.6988297872340,
            241.5632030527289, 379.9043755781684, -190.56061054579092, -61.6988297872340, 1739.2945371877890
         };

         __CLR4_4_129va29valb90pekr.R.inc(106111);TestUtils.assertEquals("covariance matrix", createRealMatrix(rData, 5, 5), covarianceMatrix, 10E-13);
    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}

    /**
     * Constant column
     */
    @Test
    public void testConstant() {__CLR4_4_129va29valb90pekr.R.globalSliceStart(getClass().getName(),106112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v29vk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129va29valb90pekr.R.rethrow($CLV_t2$);}finally{__CLR4_4_129va29valb90pekr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.CovarianceTest.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v29vk(){try{__CLR4_4_129va29valb90pekr.R.inc(106112);
        __CLR4_4_129va29valb90pekr.R.inc(106113);double[] noVariance = new double[] {1, 1, 1, 1};
        __CLR4_4_129va29valb90pekr.R.inc(106114);double[] values = new double[] {1, 2, 3, 4};
        __CLR4_4_129va29valb90pekr.R.inc(106115);Assert.assertEquals(0d, new Covariance().covariance(noVariance, values, true), Double.MIN_VALUE);
        __CLR4_4_129va29valb90pekr.R.inc(106116);Assert.assertEquals(0d, new Covariance().covariance(noVariance, noVariance, true), Double.MIN_VALUE);
    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}

    /**
     * One column
     */
    @Test
    public void testOneColumn() {__CLR4_4_129va29valb90pekr.R.globalSliceStart(getClass().getName(),106117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq2ubz29vp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129va29valb90pekr.R.rethrow($CLV_t2$);}finally{__CLR4_4_129va29valb90pekr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.CovarianceTest.testOneColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq2ubz29vp(){try{__CLR4_4_129va29valb90pekr.R.inc(106117);
        __CLR4_4_129va29valb90pekr.R.inc(106118);RealMatrix cov = new Covariance(new double[][] {{1}, {2}}, false).getCovarianceMatrix();
        __CLR4_4_129va29valb90pekr.R.inc(106119);Assert.assertEquals(1, cov.getRowDimension());
        __CLR4_4_129va29valb90pekr.R.inc(106120);Assert.assertEquals(1, cov.getColumnDimension());
        __CLR4_4_129va29valb90pekr.R.inc(106121);Assert.assertEquals(0.25, cov.getEntry(0, 0), 1.0e-15);
    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}

    /**
     * Insufficient data
     */
    @Test
    public void testInsufficientData() {__CLR4_4_129va29valb90pekr.R.globalSliceStart(getClass().getName(),106122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xyn3a29vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129va29valb90pekr.R.rethrow($CLV_t2$);}finally{__CLR4_4_129va29valb90pekr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.CovarianceTest.testInsufficientData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xyn3a29vu(){try{__CLR4_4_129va29valb90pekr.R.inc(106122);
        __CLR4_4_129va29valb90pekr.R.inc(106123);double[] one = new double[] {1};
        __CLR4_4_129va29valb90pekr.R.inc(106124);double[] two = new double[] {2};
        __CLR4_4_129va29valb90pekr.R.inc(106125);try {
            __CLR4_4_129va29valb90pekr.R.inc(106126);new Covariance().covariance(one, two, false);
            __CLR4_4_129va29valb90pekr.R.inc(106127);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // Expected
        }
        __CLR4_4_129va29valb90pekr.R.inc(106128);try {
            __CLR4_4_129va29valb90pekr.R.inc(106129);new Covariance(new double[][] {{},{}});
            __CLR4_4_129va29valb90pekr.R.inc(106130);Assert.fail("Expecting NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException ex) {
            // Expected
        }
    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}

    /**
     * Verify that diagonal entries are consistent with Variance computation and matrix matches
     * column-by-column covariances
     */
    @Test
    public void testConsistency() {__CLR4_4_129va29valb90pekr.R.globalSliceStart(getClass().getName(),106131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tafanh29w3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129va29valb90pekr.R.rethrow($CLV_t2$);}finally{__CLR4_4_129va29valb90pekr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.correlation.CovarianceTest.testConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tafanh29w3(){try{__CLR4_4_129va29valb90pekr.R.inc(106131);
        __CLR4_4_129va29valb90pekr.R.inc(106132);final RealMatrix matrix = createRealMatrix(swissData, 47, 5);
        __CLR4_4_129va29valb90pekr.R.inc(106133);final RealMatrix covarianceMatrix = new Covariance(matrix).getCovarianceMatrix();

        // Variances on the diagonal
        __CLR4_4_129va29valb90pekr.R.inc(106134);Variance variance = new Variance();
        __CLR4_4_129va29valb90pekr.R.inc(106135);for (int i = 0; (((i < 5)&&(__CLR4_4_129va29valb90pekr.R.iget(106136)!=0|true))||(__CLR4_4_129va29valb90pekr.R.iget(106137)==0&false)); i++) {{
            __CLR4_4_129va29valb90pekr.R.inc(106138);Assert.assertEquals(variance.evaluate(matrix.getColumn(i)), covarianceMatrix.getEntry(i,i), 10E-14);
        }

        // Symmetry, column-consistency
        }__CLR4_4_129va29valb90pekr.R.inc(106139);Assert.assertEquals(covarianceMatrix.getEntry(2, 3),
                new Covariance().covariance(matrix.getColumn(2), matrix.getColumn(3), true), 10E-14);
        __CLR4_4_129va29valb90pekr.R.inc(106140);Assert.assertEquals(covarianceMatrix.getEntry(2, 3), covarianceMatrix.getEntry(3, 2), Double.MIN_VALUE);

        // All columns same -> all entries = column variance
        __CLR4_4_129va29valb90pekr.R.inc(106141);RealMatrix repeatedColumns = new Array2DRowRealMatrix(47, 3);
        __CLR4_4_129va29valb90pekr.R.inc(106142);for (int i = 0; (((i < 3)&&(__CLR4_4_129va29valb90pekr.R.iget(106143)!=0|true))||(__CLR4_4_129va29valb90pekr.R.iget(106144)==0&false)); i++) {{
            __CLR4_4_129va29valb90pekr.R.inc(106145);repeatedColumns.setColumnMatrix(i, matrix.getColumnMatrix(0));
        }
        }__CLR4_4_129va29valb90pekr.R.inc(106146);RealMatrix repeatedCovarianceMatrix = new Covariance(repeatedColumns).getCovarianceMatrix();
        __CLR4_4_129va29valb90pekr.R.inc(106147);double columnVariance = variance.evaluate(matrix.getColumn(0));
        __CLR4_4_129va29valb90pekr.R.inc(106148);for (int i = 0; (((i < 3)&&(__CLR4_4_129va29valb90pekr.R.iget(106149)!=0|true))||(__CLR4_4_129va29valb90pekr.R.iget(106150)==0&false)); i++) {{
            __CLR4_4_129va29valb90pekr.R.inc(106151);for (int j = 0; (((j < 3)&&(__CLR4_4_129va29valb90pekr.R.iget(106152)!=0|true))||(__CLR4_4_129va29valb90pekr.R.iget(106153)==0&false)); j++) {{
                __CLR4_4_129va29valb90pekr.R.inc(106154);Assert.assertEquals(columnVariance, repeatedCovarianceMatrix.getEntry(i, j), 10E-14);
            }
        }}

        // Check bias-correction defaults
        }__CLR4_4_129va29valb90pekr.R.inc(106155);double[][] data = matrix.getData();
        __CLR4_4_129va29valb90pekr.R.inc(106156);TestUtils.assertEquals("Covariances",
                covarianceMatrix, new Covariance().computeCovarianceMatrix(data),Double.MIN_VALUE);
        __CLR4_4_129va29valb90pekr.R.inc(106157);TestUtils.assertEquals("Covariances",
                covarianceMatrix, new Covariance().computeCovarianceMatrix(data, true),Double.MIN_VALUE);

        __CLR4_4_129va29valb90pekr.R.inc(106158);double[] x = data[0];
        __CLR4_4_129va29valb90pekr.R.inc(106159);double[] y = data[1];
        __CLR4_4_129va29valb90pekr.R.inc(106160);Assert.assertEquals(new Covariance().covariance(x, y),
                new Covariance().covariance(x, y, true), Double.MIN_VALUE);
    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}

    protected RealMatrix createRealMatrix(double[] data, int nRows, int nCols) {try{__CLR4_4_129va29valb90pekr.R.inc(106161);
        __CLR4_4_129va29valb90pekr.R.inc(106162);double[][] matrixData = new double[nRows][nCols];
        __CLR4_4_129va29valb90pekr.R.inc(106163);int ptr = 0;
        __CLR4_4_129va29valb90pekr.R.inc(106164);for (int i = 0; (((i < nRows)&&(__CLR4_4_129va29valb90pekr.R.iget(106165)!=0|true))||(__CLR4_4_129va29valb90pekr.R.iget(106166)==0&false)); i++) {{
            __CLR4_4_129va29valb90pekr.R.inc(106167);System.arraycopy(data, ptr, matrixData[i], 0, nCols);
            __CLR4_4_129va29valb90pekr.R.inc(106168);ptr += nCols;
        }
        }__CLR4_4_129va29valb90pekr.R.inc(106169);return new Array2DRowRealMatrix(matrixData);
    }finally{__CLR4_4_129va29valb90pekr.R.flushNeeded();}}
}
