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
package org.apache.commons.math3.stat.regression;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * MillerUpdatingRegression tests.
 */
public class MillerUpdatingRegressionTest {static class __CLR4_4_12caj2cajlb90perz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,109836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public MillerUpdatingRegressionTest() {try{__CLR4_4_12caj2cajlb90perz.R.inc(109243);
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}
    /* This is the Greene Airline Cost data. 
     * The data can be downloaded from http://www.indiana.edu/~statmath/stat/all/panel/airline.csv
     */ 
    private final static double[][] airdata = {
        /*"I",*/new double[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
        /*"T",*/ new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
        /*"C",*/ new double[]{1140640, 1215690, 1309570, 1511530, 1676730, 1823740, 2022890, 2314760, 2639160, 3247620, 3787750, 3867750, 3996020, 4282880, 4748320, 569292, 640614, 777655, 999294, 1203970, 1358100, 1501350, 1709270, 2025400, 2548370, 3137740, 3557700, 3717740, 3962370, 4209390, 286298, 309290, 342056, 374595, 450037, 510412, 575347, 669331, 783799, 913883, 1041520, 1125800, 1096070, 1198930, 1170470, 145167, 170192, 247506, 309391, 354338, 373941, 420915, 474017, 532590, 676771, 880438, 1052020, 1193680, 1303390, 1436970, 91361, 95428, 98187, 115967, 138382, 156228, 183169, 210212, 274024, 356915, 432344, 524294, 530924, 581447, 610257, 68978, 74904, 83829, 98148, 118449, 133161, 145062, 170711, 199775, 276797, 381478, 506969, 633388, 804388, 1009500},
        /*"Q",*/ new double[]{0.952757, 0.986757, 1.09198, 1.17578, 1.16017, 1.17376, 1.29051, 1.39067, 1.61273, 1.82544, 1.54604, 1.5279, 1.6602, 1.82231, 1.93646, 0.520635, 0.534627, 0.655192, 0.791575, 0.842945, 0.852892, 0.922843, 1, 1.19845, 1.34067, 1.32624, 1.24852, 1.25432, 1.37177, 1.38974, 0.262424, 0.266433, 0.306043, 0.325586, 0.345706, 0.367517, 0.409937, 0.448023, 0.539595, 0.539382, 0.467967, 0.450544, 0.468793, 0.494397, 0.493317, 0.086393, 0.09674, 0.1415, 0.169715, 0.173805, 0.164272, 0.170906, 0.17784, 0.192248, 0.242469, 0.256505, 0.249657, 0.273923, 0.371131, 0.421411, 0.051028, 0.052646, 0.056348, 0.066953, 0.070308, 0.073961, 0.084946, 0.095474, 0.119814, 0.150046, 0.144014, 0.1693, 0.172761, 0.18667, 0.213279, 0.037682, 0.039784, 0.044331, 0.050245, 0.055046, 0.052462, 0.056977, 0.06149, 0.069027, 0.092749, 0.11264, 0.154154, 0.186461, 0.246847, 0.304013},
        /*"PF",*/ new double[]{106650, 110307, 110574, 121974, 196606, 265609, 263451, 316411, 384110, 569251, 871636, 997239, 938002, 859572, 823411, 103795, 111477, 118664, 114797, 215322, 281704, 304818, 348609, 374579, 544109, 853356, 1003200, 941977, 856533, 821361, 118788, 123798, 122882, 131274, 222037, 278721, 306564, 356073, 378311, 555267, 850322, 1015610, 954508, 886999, 844079, 114987, 120501, 121908, 127220, 209405, 263148, 316724, 363598, 389436, 547376, 850418, 1011170, 951934, 881323, 831374, 118222, 116223, 115853, 129372, 243266, 277930, 317273, 358794, 397667, 566672, 848393, 1005740, 958231, 872924, 844622, 117112, 119420, 116087, 122997, 194309, 307923, 323595, 363081, 386422, 564867, 874818, 1013170, 930477, 851676, 819476},
        /*"LF",*/ new double[]{0.534487, 0.532328, 0.547736, 0.540846, 0.591167, 0.575417, 0.594495, 0.597409, 0.638522, 0.676287, 0.605735, 0.61436, 0.633366, 0.650117, 0.625603, 0.490851, 0.473449, 0.503013, 0.512501, 0.566782, 0.558133, 0.558799, 0.57207, 0.624763, 0.628706, 0.58915, 0.532612, 0.526652, 0.540163, 0.528775, 0.524334, 0.537185, 0.582119, 0.579489, 0.606592, 0.60727, 0.582425, 0.573972, 0.654256, 0.631055, 0.56924, 0.589682, 0.587953, 0.565388, 0.577078, 0.432066, 0.439669, 0.488932, 0.484181, 0.529925, 0.532723, 0.549067, 0.55714, 0.611377, 0.645319, 0.611734, 0.580884, 0.572047, 0.59457, 0.585525, 0.442875, 0.462473, 0.519118, 0.529331, 0.557797, 0.556181, 0.569327, 0.583465, 0.631818, 0.604723, 0.587921, 0.616159, 0.605868, 0.594688, 0.635545, 0.448539, 0.475889, 0.500562, 0.500344, 0.528897, 0.495361, 0.510342, 0.518296, 0.546723, 0.554276, 0.517766, 0.580049, 0.556024, 0.537791, 0.525775}
    };

    /**
     * Test of hasIntercept method, of class MillerUpdatingRegression.
     */
    @Test
    public void testHasIntercept() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpz6rj2cak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testHasIntercept",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpz6rj2cak(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109244);
        __CLR4_4_12caj2cajlb90perz.R.inc(109245);MillerUpdatingRegression instance = new MillerUpdatingRegression(10, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109246);if ((((instance.hasIntercept())&&(__CLR4_4_12caj2cajlb90perz.R.iget(109247)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109248)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109249);Assert.fail("Should not have intercept");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109250);instance = new MillerUpdatingRegression(10, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109251);if ((((!instance.hasIntercept())&&(__CLR4_4_12caj2cajlb90perz.R.iget(109252)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109253)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109254);Assert.fail("Should have intercept");
        }
    }}finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    /**
     * Test of getN method, of class MillerUpdatingRegression.
     */
    @Test
    public void testAddObsGetNClear() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pn0ay32cav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testAddObsGetNClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pn0ay32cav(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109255);
        __CLR4_4_12caj2cajlb90perz.R.inc(109256);MillerUpdatingRegression instance = new MillerUpdatingRegression(3, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109257);double[][] xAll = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109258);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109259);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109260)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109261)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109262);xAll[i] = new double[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109263);xAll[i][0] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109264);xAll[i][1] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109265);xAll[i][2] = airdata[5][i];
            __CLR4_4_12caj2cajlb90perz.R.inc(109266);y[i] = Math.log(airdata[2][i]);
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109267);instance.addObservations(xAll, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109268);if ((((instance.getN() != xAll.length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109269)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109270)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109271);Assert.fail("Number of observations not correct in bulk addition");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109272);instance.clear();
        __CLR4_4_12caj2cajlb90perz.R.inc(109273);for (int i = 0; (((i < xAll.length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109274)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109275)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109276);instance.addObservation(xAll[i], y[i]);
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109277);if ((((instance.getN() != xAll.length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109278)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109279)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109280);Assert.fail("Number of observations not correct in drip addition");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109281);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testNegativeTestAddObs() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vrc672cbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testNegativeTestAddObs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vrc672cbm(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109282);
        __CLR4_4_12caj2cajlb90perz.R.inc(109283);MillerUpdatingRegression instance = new MillerUpdatingRegression(3, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109284);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109285);instance.addObservation(new double[]{1.0}, 0.0);
            __CLR4_4_12caj2cajlb90perz.R.inc(109286);Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109287);Assert.fail("Should throw IllegalArgumentException");
        }
        __CLR4_4_12caj2cajlb90perz.R.inc(109288);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109289);instance.addObservation(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, 0.0);
            __CLR4_4_12caj2cajlb90perz.R.inc(109290);Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109291);Assert.fail("Should throw IllegalArgumentException");
        }
        __CLR4_4_12caj2cajlb90perz.R.inc(109292);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109293);instance.addObservation(new double[]{1.0, 1.0, 1.0}, 0.0);
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109294);Assert.fail("Should throw IllegalArgumentException");
        }

        //now we try it without an intercept
        __CLR4_4_12caj2cajlb90perz.R.inc(109295);instance = new MillerUpdatingRegression(3, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109296);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109297);instance.addObservation(new double[]{1.0}, 0.0);
            __CLR4_4_12caj2cajlb90perz.R.inc(109298);Assert.fail("Should throw IllegalArgumentException [NOINTERCEPT]");
        } catch (IllegalArgumentException iae) {
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109299);Assert.fail("Should throw IllegalArgumentException [NOINTERCEPT]");
        }
        __CLR4_4_12caj2cajlb90perz.R.inc(109300);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109301);instance.addObservation(new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, 0.0);
            __CLR4_4_12caj2cajlb90perz.R.inc(109302);Assert.fail("Should throw IllegalArgumentException [NOINTERCEPT]");
        } catch (IllegalArgumentException iae) {
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109303);Assert.fail("Should throw IllegalArgumentException [NOINTERCEPT]");
        }
        __CLR4_4_12caj2cajlb90perz.R.inc(109304);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109305);instance.addObservation(new double[]{1.0, 1.0, 1.0}, 0.0);
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109306);Assert.fail("Should throw IllegalArgumentException [NOINTERCEPT]");
        }
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testNegativeTestAddMultipleObs() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3uuhd2ccb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testNegativeTestAddMultipleObs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3uuhd2ccb(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109307);
        __CLR4_4_12caj2cajlb90perz.R.inc(109308);MillerUpdatingRegression instance = new MillerUpdatingRegression(3, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109309);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109310);double[][] tst = {{1.0, 1.0, 1.0}, {1.20, 2.0, 2.1}};
            __CLR4_4_12caj2cajlb90perz.R.inc(109311);double[] y = {1.0};
            __CLR4_4_12caj2cajlb90perz.R.inc(109312);instance.addObservations(tst, y);

            __CLR4_4_12caj2cajlb90perz.R.inc(109313);Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109314);Assert.fail("Should throw IllegalArgumentException");
        }

        __CLR4_4_12caj2cajlb90perz.R.inc(109315);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109316);double[][] tst = {{1.0, 1.0, 1.0}, {1.20, 2.0, 2.1}};
            __CLR4_4_12caj2cajlb90perz.R.inc(109317);double[] y = {1.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
            __CLR4_4_12caj2cajlb90perz.R.inc(109318);instance.addObservations(tst, y);

            __CLR4_4_12caj2cajlb90perz.R.inc(109319);Assert.fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException iae) {
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109320);Assert.fail("Should throw IllegalArgumentException");
        }
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    /* Results can be found at http://www.indiana.edu/~statmath/stat/all/panel/panel4.html
     * This test concerns a known data set
     */
    @Test
    public void testRegressAirlineConstantExternal() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mlooan2ccp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testRegressAirlineConstantExternal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mlooan2ccp(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109321);
        __CLR4_4_12caj2cajlb90perz.R.inc(109322);MillerUpdatingRegression instance = new MillerUpdatingRegression(4, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109323);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109324);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109325);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109326)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109327)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109328);x[i] = new double[4];
            __CLR4_4_12caj2cajlb90perz.R.inc(109329);x[i][0] = 1.0;
            __CLR4_4_12caj2cajlb90perz.R.inc(109330);x[i][1] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109331);x[i][2] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109332);x[i][3] = airdata[5][i];
            __CLR4_4_12caj2cajlb90perz.R.inc(109333);y[i] = Math.log(airdata[2][i]);
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109334);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109335);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109336);RegressionResults result = instance.regress();
            __CLR4_4_12caj2cajlb90perz.R.inc(109337);Assert.assertNotNull("The test case is a prototype.", result);
            __CLR4_4_12caj2cajlb90perz.R.inc(109338);TestUtils.assertEquals(
                    new double[]{9.5169, 0.8827, 0.4540, -1.6275},
                    result.getParameterEstimates(), 1e-4);


            __CLR4_4_12caj2cajlb90perz.R.inc(109339);TestUtils.assertEquals(
                    new double[]{.2292445, .0132545, .0203042, .345302},
                    result.getStdErrorOfEstimates(), 1.0e-4);

            __CLR4_4_12caj2cajlb90perz.R.inc(109340);TestUtils.assertEquals(0.01552839, result.getMeanSquareError(), 1.0e-8);
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109341);Assert.fail("Should not throw exception but does");
        }
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testRegressAirlineConstantInternal() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19akwgf2cda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testRegressAirlineConstantInternal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19akwgf2cda(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109342);
        __CLR4_4_12caj2cajlb90perz.R.inc(109343);MillerUpdatingRegression instance = new MillerUpdatingRegression(3, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109344);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109345);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109346);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109347)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109348)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109349);x[i] = new double[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109350);x[i][0] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109351);x[i][1] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109352);x[i][2] = airdata[5][i];
            __CLR4_4_12caj2cajlb90perz.R.inc(109353);y[i] = Math.log(airdata[2][i]);
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109354);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109355);try {
            __CLR4_4_12caj2cajlb90perz.R.inc(109356);RegressionResults result = instance.regress();
            __CLR4_4_12caj2cajlb90perz.R.inc(109357);Assert.assertNotNull("The test case is a prototype.", result);
            __CLR4_4_12caj2cajlb90perz.R.inc(109358);TestUtils.assertEquals(
                    new double[]{9.5169, 0.8827, 0.4540, -1.6275},
                    result.getParameterEstimates(), 1e-4);


            __CLR4_4_12caj2cajlb90perz.R.inc(109359);TestUtils.assertEquals(
                    new double[]{.2292445, .0132545, .0203042, .345302},
                    result.getStdErrorOfEstimates(), 1.0e-4);

            __CLR4_4_12caj2cajlb90perz.R.inc(109360);TestUtils.assertEquals(0.9883, result.getRSquared(), 1.0e-4);
            __CLR4_4_12caj2cajlb90perz.R.inc(109361);TestUtils.assertEquals(0.01552839, result.getMeanSquareError(), 1.0e-8);
        } catch (Exception e) {
            __CLR4_4_12caj2cajlb90perz.R.inc(109362);Assert.fail("Should not throw exception but does");
        }
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testFilippelli() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_113fqsj2cdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testFilippelli",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_113fqsj2cdv(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109363);
        __CLR4_4_12caj2cajlb90perz.R.inc(109364);double[] data = new double[]{
            0.8116, -6.860120914,
            0.9072, -4.324130045,
            0.9052, -4.358625055,
            0.9039, -4.358426747,
            0.8053, -6.955852379,
            0.8377, -6.661145254,
            0.8667, -6.355462942,
            0.8809, -6.118102026,
            0.7975, -7.115148017,
            0.8162, -6.815308569,
            0.8515, -6.519993057,
            0.8766, -6.204119983,
            0.8885, -5.853871964,
            0.8859, -6.109523091,
            0.8959, -5.79832982,
            0.8913, -5.482672118,
            0.8959, -5.171791386,
            0.8971, -4.851705903,
            0.9021, -4.517126416,
            0.909, -4.143573228,
            0.9139, -3.709075441,
            0.9199, -3.499489089,
            0.8692, -6.300769497,
            0.8872, -5.953504836,
            0.89, -5.642065153,
            0.891, -5.031376979,
            0.8977, -4.680685696,
            0.9035, -4.329846955,
            0.9078, -3.928486195,
            0.7675, -8.56735134,
            0.7705, -8.363211311,
            0.7713, -8.107682739,
            0.7736, -7.823908741,
            0.7775, -7.522878745,
            0.7841, -7.218819279,
            0.7971, -6.920818754,
            0.8329, -6.628932138,
            0.8641, -6.323946875,
            0.8804, -5.991399828,
            0.7668, -8.781464495,
            0.7633, -8.663140179,
            0.7678, -8.473531488,
            0.7697, -8.247337057,
            0.77, -7.971428747,
            0.7749, -7.676129393,
            0.7796, -7.352812702,
            0.7897, -7.072065318,
            0.8131, -6.774174009,
            0.8498, -6.478861916,
            0.8741, -6.159517513,
            0.8061, -6.835647144,
            0.846, -6.53165267,
            0.8751, -6.224098421,
            0.8856, -5.910094889,
            0.8919, -5.598599459,
            0.8934, -5.290645224,
            0.894, -4.974284616,
            0.8957, -4.64454848,
            0.9047, -4.290560426,
            0.9129, -3.885055584,
            0.9209, -3.408378962,
            0.9219, -3.13200249,
            0.7739, -8.726767166,
            0.7681, -8.66695597,
            0.7665, -8.511026475,
            0.7703, -8.165388579,
            0.7702, -7.886056648,
            0.7761, -7.588043762,
            0.7809, -7.283412422,
            0.7961, -6.995678626,
            0.8253, -6.691862621,
            0.8602, -6.392544977,
            0.8809, -6.067374056,
            0.8301, -6.684029655,
            0.8664, -6.378719832,
            0.8834, -6.065855188,
            0.8898, -5.752272167,
            0.8964, -5.132414673,
            0.8963, -4.811352704,
            0.9074, -4.098269308,
            0.9119, -3.66174277,
            0.9228, -3.2644011
        };
        __CLR4_4_12caj2cajlb90perz.R.inc(109365);MillerUpdatingRegression model = new MillerUpdatingRegression(10, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109366);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109367);double[] tmp = new double[10];
        __CLR4_4_12caj2cajlb90perz.R.inc(109368);int nobs = 82;
        __CLR4_4_12caj2cajlb90perz.R.inc(109369);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109370)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109371)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109372);tmp[0] = data[off + 1];
//            tmp[1] = tmp[0] * tmp[0];
//            tmp[2] = tmp[0] * tmp[1]; //^3
//            tmp[3] = tmp[1] * tmp[1]; //^4
//            tmp[4] = tmp[2] * tmp[1]; //^5
//            tmp[5] = tmp[2] * tmp[2]; //^6
//            tmp[6] = tmp[2] * tmp[3]; //^7
//            tmp[7] = tmp[3] * tmp[3]; //^8
//            tmp[8] = tmp[4] * tmp[3]; //^9
//            tmp[9] = tmp[4] * tmp[4]; //^10           
            __CLR4_4_12caj2cajlb90perz.R.inc(109373);tmp[1] = tmp[0] * tmp[0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109374);tmp[2] = tmp[0] * tmp[1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109375);tmp[3] = tmp[0] * tmp[2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109376);tmp[4] = tmp[0] * tmp[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109377);tmp[5] = tmp[0] * tmp[4];
            __CLR4_4_12caj2cajlb90perz.R.inc(109378);tmp[6] = tmp[0] * tmp[5];
            __CLR4_4_12caj2cajlb90perz.R.inc(109379);tmp[7] = tmp[0] * tmp[6];
            __CLR4_4_12caj2cajlb90perz.R.inc(109380);tmp[8] = tmp[0] * tmp[7];
            __CLR4_4_12caj2cajlb90perz.R.inc(109381);tmp[9] = tmp[0] * tmp[8];
            __CLR4_4_12caj2cajlb90perz.R.inc(109382);model.addObservation(tmp, data[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109383);off += 2;
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109384);RegressionResults result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109385);double[] betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109386);TestUtils.assertEquals(betaHat,
                new double[]{
                    -1467.48961422980,
                    -2772.17959193342,
                    -2316.37108160893,
                    -1127.97394098372,
                    -354.478233703349,
                    -75.1242017393757,
                    -10.8753180355343,
                    -1.06221498588947,
                    -0.670191154593408E-01,
                    -0.246781078275479E-02,
                    -0.402962525080404E-04
                }, 1E-5); //
//
        __CLR4_4_12caj2cajlb90perz.R.inc(109387);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109388);TestUtils.assertEquals(se,
                new double[]{
                    298.084530995537,
                    559.779865474950,
                    466.477572127796,
                    227.204274477751,
                    71.6478660875927,
                    15.2897178747400,
                    2.23691159816033,
                    0.221624321934227,
                    0.142363763154724E-01,
                    0.535617408889821E-03,
                    0.896632837373868E-05
                }, 1E-5); //

        __CLR4_4_12caj2cajlb90perz.R.inc(109389);TestUtils.assertEquals(0.996727416185620, result.getRSquared(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109390);TestUtils.assertEquals(0.112091743968020E-04, result.getMeanSquareError(), 1.0e-10);
        __CLR4_4_12caj2cajlb90perz.R.inc(109391);TestUtils.assertEquals(0.795851382172941E-03, result.getErrorSumSquares(), 1.0e-10);

    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testWampler1() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131wh8i2ceo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testWampler1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109392,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131wh8i2ceo(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109392);
        __CLR4_4_12caj2cajlb90perz.R.inc(109393);double[] data = new double[]{
            1, 0,
            6, 1,
            63, 2,
            364, 3,
            1365, 4,
            3906, 5,
            9331, 6,
            19608, 7,
            37449, 8,
            66430, 9,
            111111, 10,
            177156, 11,
            271453, 12,
            402234, 13,
            579195, 14,
            813616, 15,
            1118481, 16,
            1508598, 17,
            2000719, 18,
            2613660, 19,
            3368421, 20};

        __CLR4_4_12caj2cajlb90perz.R.inc(109394);MillerUpdatingRegression model = new MillerUpdatingRegression(5, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109395);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109396);double[] tmp = new double[5];
        __CLR4_4_12caj2cajlb90perz.R.inc(109397);int nobs = 21;
        __CLR4_4_12caj2cajlb90perz.R.inc(109398);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109399)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109400)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109401);tmp[0] = data[off + 1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109402);tmp[1] = tmp[0] * tmp[0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109403);tmp[2] = tmp[0] * tmp[1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109404);tmp[3] = tmp[0] * tmp[2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109405);tmp[4] = tmp[0] * tmp[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109406);model.addObservation(tmp, data[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109407);off += 2;
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109408);RegressionResults result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109409);double[] betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109410);TestUtils.assertEquals(betaHat,
                new double[]{1.0,
                    1.0, 1.0,
                    1.0, 1.0,
                    1.0}, 1E-8); //
//
        __CLR4_4_12caj2cajlb90perz.R.inc(109411);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109412);TestUtils.assertEquals(se,
                new double[]{0.0,
                    0.0, 0.0,
                    0.0, 0.0,
                    0.0}, 1E-8); //

        __CLR4_4_12caj2cajlb90perz.R.inc(109413);TestUtils.assertEquals(1.0, result.getRSquared(), 1.0e-10);
        __CLR4_4_12caj2cajlb90perz.R.inc(109414);TestUtils.assertEquals(0, result.getMeanSquareError(), 1.0e-7);
        __CLR4_4_12caj2cajlb90perz.R.inc(109415);TestUtils.assertEquals(0.00, result.getErrorSumSquares(), 1.0e-6);

        __CLR4_4_12caj2cajlb90perz.R.inc(109416);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testWampler2() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173hjz2cfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testWampler2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173hjz2cfd(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109417);
        __CLR4_4_12caj2cajlb90perz.R.inc(109418);double[] data = new double[]{
            1.00000, 0,
            1.11111, 1,
            1.24992, 2,
            1.42753, 3,
            1.65984, 4,
            1.96875, 5,
            2.38336, 6,
            2.94117, 7,
            3.68928, 8,
            4.68559, 9,
            6.00000, 10,
            7.71561, 11,
            9.92992, 12,
            12.75603, 13,
            16.32384, 14,
            20.78125, 15,
            26.29536, 16,
            33.05367, 17,
            41.26528, 18,
            51.16209, 19,
            63.00000, 20};

        __CLR4_4_12caj2cajlb90perz.R.inc(109419);MillerUpdatingRegression model = new MillerUpdatingRegression(5, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109420);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109421);double[] tmp = new double[5];
        __CLR4_4_12caj2cajlb90perz.R.inc(109422);int nobs = 21;
        __CLR4_4_12caj2cajlb90perz.R.inc(109423);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109424)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109425)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109426);tmp[0] = data[off + 1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109427);tmp[1] = tmp[0] * tmp[0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109428);tmp[2] = tmp[0] * tmp[1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109429);tmp[3] = tmp[0] * tmp[2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109430);tmp[4] = tmp[0] * tmp[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109431);model.addObservation(tmp, data[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109432);off += 2;
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109433);RegressionResults result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109434);double[] betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109435);TestUtils.assertEquals(betaHat,
                new double[]{1.0,
                    1.0e-1, 1.0e-2,
                    1.0e-3, 1.0e-4,
                    1.0e-5}, 1E-8); //
//
        __CLR4_4_12caj2cajlb90perz.R.inc(109436);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109437);TestUtils.assertEquals(se,
                new double[]{0.0,
                    0.0, 0.0,
                    0.0, 0.0,
                    0.0}, 1E-8); //

        __CLR4_4_12caj2cajlb90perz.R.inc(109438);TestUtils.assertEquals(1.0, result.getRSquared(), 1.0e-10);
        __CLR4_4_12caj2cajlb90perz.R.inc(109439);TestUtils.assertEquals(0, result.getMeanSquareError(), 1.0e-7);
        __CLR4_4_12caj2cajlb90perz.R.inc(109440);TestUtils.assertEquals(0.00, result.getErrorSumSquares(), 1.0e-6);
        __CLR4_4_12caj2cajlb90perz.R.inc(109441);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testWampler3() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g3gcg2cg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testWampler3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g3gcg2cg2(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109442);
        __CLR4_4_12caj2cajlb90perz.R.inc(109443);double[] data = new double[]{
            760, 0,
            -2042, 1,
            2111, 2,
            -1684, 3,
            3888, 4,
            1858, 5,
            11379, 6,
            17560, 7,
            39287, 8,
            64382, 9,
            113159, 10,
            175108, 11,
            273291, 12,
            400186, 13,
            581243, 14,
            811568, 15,
            1121004, 16,
            1506550, 17,
            2002767, 18,
            2611612, 19,
            3369180, 20};
        __CLR4_4_12caj2cajlb90perz.R.inc(109444);MillerUpdatingRegression model = new MillerUpdatingRegression(5, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109445);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109446);double[] tmp = new double[5];
        __CLR4_4_12caj2cajlb90perz.R.inc(109447);int nobs = 21;
        __CLR4_4_12caj2cajlb90perz.R.inc(109448);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109449)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109450)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109451);tmp[0] = data[off + 1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109452);tmp[1] = tmp[0] * tmp[0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109453);tmp[2] = tmp[0] * tmp[1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109454);tmp[3] = tmp[0] * tmp[2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109455);tmp[4] = tmp[0] * tmp[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109456);model.addObservation(tmp, data[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109457);off += 2;
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109458);RegressionResults result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109459);double[] betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109460);TestUtils.assertEquals(betaHat,
                new double[]{1.0,
                    1.0, 1.0,
                    1.0, 1.0,
                    1.0}, 1E-8); //
        __CLR4_4_12caj2cajlb90perz.R.inc(109461);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109462);TestUtils.assertEquals(se,
                new double[]{2152.32624678170,
                    2363.55173469681, 779.343524331583,
                    101.475507550350, 5.64566512170752,
                    0.112324854679312}, 1E-8); //

        __CLR4_4_12caj2cajlb90perz.R.inc(109463);TestUtils.assertEquals(.999995559025820, result.getRSquared(), 1.0e-10);
        __CLR4_4_12caj2cajlb90perz.R.inc(109464);TestUtils.assertEquals(5570284.53333333, result.getMeanSquareError(), 1.0e-7);
        __CLR4_4_12caj2cajlb90perz.R.inc(109465);TestUtils.assertEquals(83554268.0000000, result.getErrorSumSquares(), 1.0e-6);
        __CLR4_4_12caj2cajlb90perz.R.inc(109466);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    //@Test
    public void testWampler4() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16p3f4x2cgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testWampler4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16p3f4x2cgr(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109467);
        __CLR4_4_12caj2cajlb90perz.R.inc(109468);double[] data = new double[]{
            75901, 0,
            -204794, 1,
            204863, 2,
            -204436, 3,
            253665, 4,
            -200894, 5,
            214131, 6,
            -185192, 7,
            221249, 8,
            -138370, 9,
            315911, 10,
            -27644, 11,
            455253, 12,
            197434, 13,
            783995, 14,
            608816, 15,
            1370781, 16,
            1303798, 17,
            2205519, 18,
            2408860, 19,
            3444321, 20};
        __CLR4_4_12caj2cajlb90perz.R.inc(109469);MillerUpdatingRegression model = new MillerUpdatingRegression(5, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109470);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109471);double[] tmp = new double[5];
        __CLR4_4_12caj2cajlb90perz.R.inc(109472);int nobs = 21;
        __CLR4_4_12caj2cajlb90perz.R.inc(109473);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109474)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109475)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109476);tmp[0] = data[off + 1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109477);tmp[1] = tmp[0] * tmp[0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109478);tmp[2] = tmp[0] * tmp[1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109479);tmp[3] = tmp[0] * tmp[2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109480);tmp[4] = tmp[0] * tmp[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109481);model.addObservation(tmp, data[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109482);off += 2;
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109483);RegressionResults result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109484);double[] betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109485);TestUtils.assertEquals(betaHat,
                new double[]{1.0,
                    1.0, 1.0,
                    1.0, 1.0,
                    1.0}, 1E-8); //
//
        __CLR4_4_12caj2cajlb90perz.R.inc(109486);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109487);TestUtils.assertEquals(se,
                new double[]{215232.624678170,
                    236355.173469681, 77934.3524331583,
                    10147.5507550350, 564.566512170752,
                    11.2324854679312}, 1E-8); //

        __CLR4_4_12caj2cajlb90perz.R.inc(109488);TestUtils.assertEquals(.957478440825662, result.getRSquared(), 1.0e-10);
        __CLR4_4_12caj2cajlb90perz.R.inc(109489);TestUtils.assertEquals(55702845333.3333, result.getMeanSquareError(), 1.0e-4);
        __CLR4_4_12caj2cajlb90perz.R.inc(109490);TestUtils.assertEquals(835542680000.000, result.getErrorSumSquares(), 1.0e-3);

        __CLR4_4_12caj2cajlb90perz.R.inc(109491);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    /**
     * Test Longley dataset against certified values provided by NIST.
     * Data Source: J. Longley (1967) "An Appraisal of Least Squares
     * Programs for the Electronic Computer from the Point of View of the User"
     * Journal of the American Statistical Association, vol. 62. September,
     * pp. 819-841.
     *
     * Certified values (and data) are from NIST:
     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Longley.dat
     */
    @Test
    public void testLongly() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjv2zi2chg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testLongly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjv2zi2chg(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109492);
        // Y values are first, then independent vars
        // Each row is one observation
        __CLR4_4_12caj2cajlb90perz.R.inc(109493);double[] design = new double[]{
            60323, 83.0, 234289, 2356, 1590, 107608, 1947,
            61122, 88.5, 259426, 2325, 1456, 108632, 1948,
            60171, 88.2, 258054, 3682, 1616, 109773, 1949,
            61187, 89.5, 284599, 3351, 1650, 110929, 1950,
            63221, 96.2, 328975, 2099, 3099, 112075, 1951,
            63639, 98.1, 346999, 1932, 3594, 113270, 1952,
            64989, 99.0, 365385, 1870, 3547, 115094, 1953,
            63761, 100.0, 363112, 3578, 3350, 116219, 1954,
            66019, 101.2, 397469, 2904, 3048, 117388, 1955,
            67857, 104.6, 419180, 2822, 2857, 118734, 1956,
            68169, 108.4, 442769, 2936, 2798, 120445, 1957,
            66513, 110.8, 444546, 4681, 2637, 121950, 1958,
            68655, 112.6, 482704, 3813, 2552, 123366, 1959,
            69564, 114.2, 502601, 3931, 2514, 125368, 1960,
            69331, 115.7, 518173, 4806, 2572, 127852, 1961,
            70551, 116.9, 554894, 4007, 2827, 130081, 1962
        };

        __CLR4_4_12caj2cajlb90perz.R.inc(109494);final int nobs = 16;
        __CLR4_4_12caj2cajlb90perz.R.inc(109495);final int nvars = 6;

        // Estimate the model
        __CLR4_4_12caj2cajlb90perz.R.inc(109496);MillerUpdatingRegression model = new MillerUpdatingRegression(6, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109497);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109498);double[] tmp = new double[6];
        __CLR4_4_12caj2cajlb90perz.R.inc(109499);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109500)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109501)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109502);System.arraycopy(design, off + 1, tmp, 0, nvars);
            __CLR4_4_12caj2cajlb90perz.R.inc(109503);model.addObservation(tmp, design[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109504);off += nvars + 1;
        }

        // Check expected beta values from NIST
        }__CLR4_4_12caj2cajlb90perz.R.inc(109505);RegressionResults result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109506);double[] betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109507);TestUtils.assertEquals(betaHat,
                new double[]{-3482258.63459582, 15.0618722713733,
                    -0.358191792925910E-01, -2.02022980381683,
                    -1.03322686717359, -0.511041056535807E-01,
                    1829.15146461355}, 1E-8); //

        // Check standard errors from NIST
        __CLR4_4_12caj2cajlb90perz.R.inc(109508);double[] errors = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109509);TestUtils.assertEquals(new double[]{890420.383607373,
                    84.9149257747669,
                    0.334910077722432E-01,
                    0.488399681651699,
                    0.214274163161675,
                    0.226073200069370,
                    455.478499142212}, errors, 1E-6);
//        
        // Check R-Square statistics against R
        __CLR4_4_12caj2cajlb90perz.R.inc(109510);TestUtils.assertEquals(0.995479004577296, result.getRSquared(), 1E-12);
        __CLR4_4_12caj2cajlb90perz.R.inc(109511);TestUtils.assertEquals(0.992465007628826, result.getAdjustedRSquared(), 1E-12);
//        
//        
//        // Estimate model without intercept
        __CLR4_4_12caj2cajlb90perz.R.inc(109512);model = new MillerUpdatingRegression(6, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109513);off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109514);for (int i = 0; (((i < nobs)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109515)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109516)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109517);System.arraycopy(design, off + 1, tmp, 0, nvars);
            __CLR4_4_12caj2cajlb90perz.R.inc(109518);model.addObservation(tmp, design[off]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109519);off += nvars + 1;
        }
        // Check expected beta values from R
        }__CLR4_4_12caj2cajlb90perz.R.inc(109520);result = model.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109521);betaHat = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109522);TestUtils.assertEquals(betaHat,
                new double[]{-52.99357013868291, 0.07107319907358,
                    -0.42346585566399, -0.57256866841929,
                    -0.41420358884978, 48.41786562001326}, 1E-11);
//        
        // Check standard errors from R
        __CLR4_4_12caj2cajlb90perz.R.inc(109523);errors = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109524);TestUtils.assertEquals(new double[]{129.54486693117232, 0.03016640003786,
                    0.41773654056612, 0.27899087467676, 0.32128496193363,
                    17.68948737819961}, errors, 1E-11);
//        

//        // Check R-Square statistics against R
        __CLR4_4_12caj2cajlb90perz.R.inc(109525);TestUtils.assertEquals(0.9999670130706, result.getRSquared(), 1E-12);
        __CLR4_4_12caj2cajlb90perz.R.inc(109526);TestUtils.assertEquals(0.999947220913, result.getAdjustedRSquared(), 1E-12);

    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

//    @Test
//    public void testRegressReorder() {
//        // System.out.println("testRegressReorder");
//        MillerUpdatingRegression instance = new MillerUpdatingRegression(4, false);
//        double[][] x = new double[airdata[0].length][];
//        double[] y = new double[airdata[0].length];
//        for (int i = 0; i < airdata[0].length; i++) {
//            x[i] = new double[4];
//            x[i][0] = 1.0;
//            x[i][1] = Math.log(airdata[3][i]);
//            x[i][2] = Math.log(airdata[4][i]);
//            x[i][3] = airdata[5][i];
//            y[i] = Math.log(airdata[2][i]);
//        }
//
//        instance.addObservations(x, y);
//        RegressionResults result = instance.regress();
//        if (result == null) {
//            Assert.fail("Null result....");
//        }
//
//        instance.reorderRegressors(new int[]{3, 2}, 0);
//        RegressionResults resultInverse = instance.regress();
//
//        double[] beta = result.getParameterEstimates();
//        double[] betar = resultInverse.getParameterEstimates();
//        if (Math.abs(beta[0] - betar[0]) > 1.0e-14) {
//            Assert.fail("Parameters not correct after reorder (0,3)");
//        }
//        if (Math.abs(beta[1] - betar[1]) > 1.0e-14) {
//            Assert.fail("Parameters not correct after reorder (1,2)");
//        }
//        if (Math.abs(beta[2] - betar[2]) > 1.0e-14) {
//            Assert.fail("Parameters not correct after reorder (2,1)");
//        }
//        if (Math.abs(beta[3] - betar[3]) > 1.0e-14) {
//            Assert.fail("Parameters not correct after reorder (3,0)");
//        }
//    }

    @Test
    public void testOneRedundantColumn() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nt3itm2cif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testOneRedundantColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nt3itm2cif(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109527);
        __CLR4_4_12caj2cajlb90perz.R.inc(109528);MillerUpdatingRegression instance = new MillerUpdatingRegression(4, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109529);MillerUpdatingRegression instance2 = new MillerUpdatingRegression(5, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109530);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109531);double[][] x2 = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109532);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109533);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109534)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109535)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109536);x[i] = new double[4];
            __CLR4_4_12caj2cajlb90perz.R.inc(109537);x2[i] = new double[5];
            __CLR4_4_12caj2cajlb90perz.R.inc(109538);x[i][0] = 1.0;
            __CLR4_4_12caj2cajlb90perz.R.inc(109539);x[i][1] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109540);x[i][2] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109541);x[i][3] = airdata[5][i];

            __CLR4_4_12caj2cajlb90perz.R.inc(109542);x2[i][0] = x[i][0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109543);x2[i][1] = x[i][1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109544);x2[i][2] = x[i][2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109545);x2[i][3] = x[i][3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109546);x2[i][4] = x[i][3];

            __CLR4_4_12caj2cajlb90perz.R.inc(109547);y[i] = Math.log(airdata[2][i]);
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109548);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109549);RegressionResults result = instance.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109550);Assert.assertNotNull("Could not estimate initial regression", result);

        __CLR4_4_12caj2cajlb90perz.R.inc(109551);instance2.addObservations(x2, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109552);RegressionResults resultRedundant = instance2.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109553);Assert.assertNotNull("Could not estimate redundant regression", resultRedundant);
        __CLR4_4_12caj2cajlb90perz.R.inc(109554);double[] beta = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109555);double[] betar = resultRedundant.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109556);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109557);double[] ser = resultRedundant.getStdErrorOfEstimates();

        __CLR4_4_12caj2cajlb90perz.R.inc(109558);for (int i = 0; (((i < beta.length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109559)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109560)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109561);if ((((Math.abs(beta[i] - betar[i]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109562)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109563)==0&false))) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109564);Assert.fail("Parameters not correctly estimated");
            }
            }__CLR4_4_12caj2cajlb90perz.R.inc(109565);if ((((Math.abs(se[i] - ser[i]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109566)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109567)==0&false))) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109568);Assert.fail("Standard errors not correctly estimated");
            }
            }__CLR4_4_12caj2cajlb90perz.R.inc(109569);for (int j = 0; (((j < i)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109570)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109571)==0&false)); j++) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109572);if ((((Math.abs(result.getCovarianceOfParameters(i, j)
                        - resultRedundant.getCovarianceOfParameters(i, j)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109573)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109574)==0&false))) {{
                    __CLR4_4_12caj2cajlb90perz.R.inc(109575);Assert.fail("Variance Covariance not correct");
                }
            }}
        }}


        }__CLR4_4_12caj2cajlb90perz.R.inc(109576);TestUtils.assertEquals(result.getAdjustedRSquared(), resultRedundant.getAdjustedRSquared(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109577);TestUtils.assertEquals(result.getErrorSumSquares(), resultRedundant.getErrorSumSquares(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109578);TestUtils.assertEquals(result.getMeanSquareError(), resultRedundant.getMeanSquareError(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109579);TestUtils.assertEquals(result.getRSquared(), resultRedundant.getRSquared(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109580);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testThreeRedundantColumn() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmvn7i2cjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testThreeRedundantColumn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmvn7i2cjx(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109581);

        __CLR4_4_12caj2cajlb90perz.R.inc(109582);MillerUpdatingRegression instance = new MillerUpdatingRegression(4, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109583);MillerUpdatingRegression instance2 = new MillerUpdatingRegression(7, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109584);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109585);double[][] x2 = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109586);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109587);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109588)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109589)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109590);x[i] = new double[4];
            __CLR4_4_12caj2cajlb90perz.R.inc(109591);x2[i] = new double[7];
            __CLR4_4_12caj2cajlb90perz.R.inc(109592);x[i][0] = 1.0;
            __CLR4_4_12caj2cajlb90perz.R.inc(109593);x[i][1] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109594);x[i][2] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109595);x[i][3] = airdata[5][i];

            __CLR4_4_12caj2cajlb90perz.R.inc(109596);x2[i][0] = x[i][0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109597);x2[i][1] = x[i][0];
            __CLR4_4_12caj2cajlb90perz.R.inc(109598);x2[i][2] = x[i][1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109599);x2[i][3] = x[i][2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109600);x2[i][4] = x[i][1];
            __CLR4_4_12caj2cajlb90perz.R.inc(109601);x2[i][5] = x[i][3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109602);x2[i][6] = x[i][2];

            __CLR4_4_12caj2cajlb90perz.R.inc(109603);y[i] = Math.log(airdata[2][i]);
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109604);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109605);RegressionResults result = instance.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109606);Assert.assertNotNull("Could not estimate initial regression", result);

        __CLR4_4_12caj2cajlb90perz.R.inc(109607);instance2.addObservations(x2, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109608);RegressionResults resultRedundant = instance2.regress();
        __CLR4_4_12caj2cajlb90perz.R.inc(109609);Assert.assertNotNull("Could not estimate redundant regression", resultRedundant);
        __CLR4_4_12caj2cajlb90perz.R.inc(109610);double[] beta = result.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109611);double[] betar = resultRedundant.getParameterEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109612);double[] se = result.getStdErrorOfEstimates();
        __CLR4_4_12caj2cajlb90perz.R.inc(109613);double[] ser = resultRedundant.getStdErrorOfEstimates();

        __CLR4_4_12caj2cajlb90perz.R.inc(109614);if ((((Math.abs(beta[0] - betar[0]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109615)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109616)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109617);Assert.fail("Parameters not correct after reorder (0,3)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109618);if ((((Math.abs(beta[1] - betar[2]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109619)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109620)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109621);Assert.fail("Parameters not correct after reorder (1,2)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109622);if ((((Math.abs(beta[2] - betar[3]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109623)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109624)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109625);Assert.fail("Parameters not correct after reorder (2,1)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109626);if ((((Math.abs(beta[3] - betar[5]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109627)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109628)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109629);Assert.fail("Parameters not correct after reorder (3,0)");
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109630);if ((((Math.abs(se[0] - ser[0]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109631)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109632)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109633);Assert.fail("Se not correct after reorder (0,3)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109634);if ((((Math.abs(se[1] - ser[2]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109635)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109636)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109637);Assert.fail("Se not correct after reorder (1,2)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109638);if ((((Math.abs(se[2] - ser[3]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109639)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109640)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109641);Assert.fail("Se not correct after reorder (2,1)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109642);if ((((Math.abs(se[3] - ser[5]) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109643)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109644)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109645);Assert.fail("Se not correct after reorder (3,0)");
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109646);if ((((Math.abs(result.getCovarianceOfParameters(0, 0)
                - resultRedundant.getCovarianceOfParameters(0, 0)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109647)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109648)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109649);Assert.fail("VCV not correct after reorder (0,0)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109650);if ((((Math.abs(result.getCovarianceOfParameters(0, 1)
                - resultRedundant.getCovarianceOfParameters(0, 2)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109651)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109652)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109653);Assert.fail("VCV not correct after reorder (0,1)<->(0,2)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109654);if ((((Math.abs(result.getCovarianceOfParameters(0, 2)
                - resultRedundant.getCovarianceOfParameters(0, 3)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109655)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109656)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109657);Assert.fail("VCV not correct after reorder (0,2)<->(0,1)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109658);if ((((Math.abs(result.getCovarianceOfParameters(0, 3)
                - resultRedundant.getCovarianceOfParameters(0, 5)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109659)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109660)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109661);Assert.fail("VCV not correct after reorder (0,3)<->(0,3)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109662);if ((((Math.abs(result.getCovarianceOfParameters(1, 0)
                - resultRedundant.getCovarianceOfParameters(2, 0)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109663)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109664)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109665);Assert.fail("VCV not correct after reorder (1,0)<->(2,0)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109666);if ((((Math.abs(result.getCovarianceOfParameters(1, 1)
                - resultRedundant.getCovarianceOfParameters(2, 2)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109667)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109668)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109669);Assert.fail("VCV not correct  (1,1)<->(2,1)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109670);if ((((Math.abs(result.getCovarianceOfParameters(1, 2)
                - resultRedundant.getCovarianceOfParameters(2, 3)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109671)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109672)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109673);Assert.fail("VCV not correct  (1,2)<->(2,2)");
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109674);if ((((Math.abs(result.getCovarianceOfParameters(2, 0)
                - resultRedundant.getCovarianceOfParameters(3, 0)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109675)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109676)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109677);Assert.fail("VCV not correct  (2,0)<->(1,0)");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109678);if ((((Math.abs(result.getCovarianceOfParameters(2, 1)
                - resultRedundant.getCovarianceOfParameters(3, 2)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109679)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109680)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109681);Assert.fail("VCV not correct  (2,1)<->(1,2)");
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109682);if ((((Math.abs(result.getCovarianceOfParameters(3, 3)
                - resultRedundant.getCovarianceOfParameters(5, 5)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109683)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109684)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109685);Assert.fail("VCV not correct  (3,3)<->(3,2)");
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109686);TestUtils.assertEquals(result.getAdjustedRSquared(), resultRedundant.getAdjustedRSquared(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109687);TestUtils.assertEquals(result.getErrorSumSquares(), resultRedundant.getErrorSumSquares(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109688);TestUtils.assertEquals(result.getMeanSquareError(), resultRedundant.getMeanSquareError(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109689);TestUtils.assertEquals(result.getRSquared(), resultRedundant.getRSquared(), 1.0e-8);
        __CLR4_4_12caj2cajlb90perz.R.inc(109690);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testPCorr() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyrbqn2cmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testPCorr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyrbqn2cmz(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109691);
        __CLR4_4_12caj2cajlb90perz.R.inc(109692);MillerUpdatingRegression instance = new MillerUpdatingRegression(4, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109693);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109694);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109695);double[] cp = new double[10];
        __CLR4_4_12caj2cajlb90perz.R.inc(109696);double[] yxcorr = new double[4];
        __CLR4_4_12caj2cajlb90perz.R.inc(109697);double[] diag = new double[4];
        __CLR4_4_12caj2cajlb90perz.R.inc(109698);double sumysq = 0.0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109699);int off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109700);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109701)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109702)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109703);x[i] = new double[4];
            __CLR4_4_12caj2cajlb90perz.R.inc(109704);x[i][0] = 1.0;
            __CLR4_4_12caj2cajlb90perz.R.inc(109705);x[i][1] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109706);x[i][2] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109707);x[i][3] = airdata[5][i];
            __CLR4_4_12caj2cajlb90perz.R.inc(109708);y[i] = Math.log(airdata[2][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109709);off = 0;
            __CLR4_4_12caj2cajlb90perz.R.inc(109710);for (int j = 0; (((j < 4)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109711)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109712)==0&false)); j++) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109713);double tmp = x[i][j];
                __CLR4_4_12caj2cajlb90perz.R.inc(109714);for (int k = 0; (((k <= j)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109715)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109716)==0&false)); k++, off++) {{
                    __CLR4_4_12caj2cajlb90perz.R.inc(109717);cp[off] += tmp * x[i][k];
                }
                }__CLR4_4_12caj2cajlb90perz.R.inc(109718);yxcorr[j] += tmp * y[i];
            }
            }__CLR4_4_12caj2cajlb90perz.R.inc(109719);sumysq += y[i] * y[i];
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109720);PearsonsCorrelation pearson = new PearsonsCorrelation(x);
        __CLR4_4_12caj2cajlb90perz.R.inc(109721);RealMatrix corr = pearson.getCorrelationMatrix();
        __CLR4_4_12caj2cajlb90perz.R.inc(109722);off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109723);for (int i = 0; (((i < 4)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109724)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109725)==0&false)); i++, off += (i + 1)) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109726);diag[i] = FastMath.sqrt(cp[off]);
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109727);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109728);double[] pc = instance.getPartialCorrelations(0);
        __CLR4_4_12caj2cajlb90perz.R.inc(109729);int idx = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109730);off = 0;
        __CLR4_4_12caj2cajlb90perz.R.inc(109731);int off2 = 6;
        __CLR4_4_12caj2cajlb90perz.R.inc(109732);for (int i = 0; (((i < 4)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109733)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109734)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109735);for (int j = 0; (((j < i)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109736)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109737)==0&false)); j++) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109738);if ((((Math.abs(pc[idx] - cp[off] / (diag[i] * diag[j])) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109739)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109740)==0&false))) {{
                    __CLR4_4_12caj2cajlb90perz.R.inc(109741);Assert.fail("Failed cross products... i = " + i + " j = " + j);
                }
                }__CLR4_4_12caj2cajlb90perz.R.inc(109742);++idx;
                __CLR4_4_12caj2cajlb90perz.R.inc(109743);++off;
            }
            }__CLR4_4_12caj2cajlb90perz.R.inc(109744);++off;
            __CLR4_4_12caj2cajlb90perz.R.inc(109745);if ((((Math.abs(pc[i+off2] - yxcorr[ i] / (FastMath.sqrt(sumysq) * diag[i])) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109746)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109747)==0&false))) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109748);Assert.fail("Assert.failed cross product i = " + i + " y");
            }
        }}
        }__CLR4_4_12caj2cajlb90perz.R.inc(109749);double[] pc2 = instance.getPartialCorrelations(1);

        __CLR4_4_12caj2cajlb90perz.R.inc(109750);idx = 0;

        __CLR4_4_12caj2cajlb90perz.R.inc(109751);for (int i = 1; (((i < 4)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109752)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109753)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109754);for (int j = 1; (((j < i)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109755)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109756)==0&false)); j++) {{
                __CLR4_4_12caj2cajlb90perz.R.inc(109757);if ((((Math.abs(pc2[idx] - corr.getEntry(j, i)) > 1.0e-8)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109758)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109759)==0&false))) {{
                    __CLR4_4_12caj2cajlb90perz.R.inc(109760);Assert.fail("Failed cross products... i = " + i + " j = " + j);
                }
                }__CLR4_4_12caj2cajlb90perz.R.inc(109761);++idx;
            }
        }}
        }__CLR4_4_12caj2cajlb90perz.R.inc(109762);double[] pc3 = instance.getPartialCorrelations(2);
        __CLR4_4_12caj2cajlb90perz.R.inc(109763);if ((((pc3 == null)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109764)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109765)==0&false))) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109766);Assert.fail("Should not be null");
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109767);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}

    @Test
    public void testHdiag() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1loxkzc2cp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testHdiag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109768,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1loxkzc2cp4(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109768);
        __CLR4_4_12caj2cajlb90perz.R.inc(109769);MillerUpdatingRegression instance = new MillerUpdatingRegression(4, false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109770);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109771);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109772);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109773)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109774)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109775);x[i] = new double[4];
            __CLR4_4_12caj2cajlb90perz.R.inc(109776);x[i][0] = 1.0;
            __CLR4_4_12caj2cajlb90perz.R.inc(109777);x[i][1] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109778);x[i][2] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109779);x[i][3] = airdata[5][i];
            __CLR4_4_12caj2cajlb90perz.R.inc(109780);y[i] = Math.log(airdata[2][i]);
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109781);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109782);OLSMultipleLinearRegression ols = new OLSMultipleLinearRegression();
        __CLR4_4_12caj2cajlb90perz.R.inc(109783);ols.setNoIntercept(true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109784);ols.newSampleData(y, x);

        __CLR4_4_12caj2cajlb90perz.R.inc(109785);RealMatrix rm = ols.calculateHat();
        __CLR4_4_12caj2cajlb90perz.R.inc(109786);for (int i = 0; (((i < x.length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109787)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109788)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109789);TestUtils.assertEquals(instance.getDiagonalOfHatMatrix(x[i]), rm.getEntry(i, i), 1.0e-8);
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109790);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}
    @Test
    public void testHdiagConstant() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13w4th02cpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testHdiagConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13w4th02cpr(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109791);
        __CLR4_4_12caj2cajlb90perz.R.inc(109792);MillerUpdatingRegression instance = new MillerUpdatingRegression(3, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109793);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109794);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109795);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109796)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109797)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109798);x[i] = new double[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109799);x[i][0] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109800);x[i][1] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109801);x[i][2] = airdata[5][i];
            __CLR4_4_12caj2cajlb90perz.R.inc(109802);y[i] = Math.log(airdata[2][i]);
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109803);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109804);OLSMultipleLinearRegression ols = new OLSMultipleLinearRegression();
        __CLR4_4_12caj2cajlb90perz.R.inc(109805);ols.setNoIntercept(false);
        __CLR4_4_12caj2cajlb90perz.R.inc(109806);ols.newSampleData(y, x);

        __CLR4_4_12caj2cajlb90perz.R.inc(109807);RealMatrix rm = ols.calculateHat();
        __CLR4_4_12caj2cajlb90perz.R.inc(109808);for (int i = 0; (((i < x.length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109809)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109810)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109811);TestUtils.assertEquals(instance.getDiagonalOfHatMatrix(x[i]), rm.getEntry(i, i), 1.0e-8);
        }
        }__CLR4_4_12caj2cajlb90perz.R.inc(109812);return;
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}
    
    
    @Test
    public void testSubsetRegression() {__CLR4_4_12caj2cajlb90perz.R.globalSliceStart(getClass().getName(),109813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1horq42cqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12caj2cajlb90perz.R.rethrow($CLV_t2$);}finally{__CLR4_4_12caj2cajlb90perz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.regression.MillerUpdatingRegressionTest.testSubsetRegression",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),109813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1horq42cqd(){try{__CLR4_4_12caj2cajlb90perz.R.inc(109813);
        
        __CLR4_4_12caj2cajlb90perz.R.inc(109814);MillerUpdatingRegression instance = new MillerUpdatingRegression(3, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109815);MillerUpdatingRegression redRegression = new MillerUpdatingRegression(2, true);
        __CLR4_4_12caj2cajlb90perz.R.inc(109816);double[][] x = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109817);double[][] xReduced = new double[airdata[0].length][];
        __CLR4_4_12caj2cajlb90perz.R.inc(109818);double[] y = new double[airdata[0].length];
        __CLR4_4_12caj2cajlb90perz.R.inc(109819);for (int i = 0; (((i < airdata[0].length)&&(__CLR4_4_12caj2cajlb90perz.R.iget(109820)!=0|true))||(__CLR4_4_12caj2cajlb90perz.R.iget(109821)==0&false)); i++) {{
            __CLR4_4_12caj2cajlb90perz.R.inc(109822);x[i] = new double[3];
            __CLR4_4_12caj2cajlb90perz.R.inc(109823);x[i][0] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109824);x[i][1] = Math.log(airdata[4][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109825);x[i][2] = airdata[5][i];
            
            __CLR4_4_12caj2cajlb90perz.R.inc(109826);xReduced[i] = new double[2];
            __CLR4_4_12caj2cajlb90perz.R.inc(109827);xReduced[i][0] = Math.log(airdata[3][i]);
            __CLR4_4_12caj2cajlb90perz.R.inc(109828);xReduced[i][1] = Math.log(airdata[4][i]);
            
            __CLR4_4_12caj2cajlb90perz.R.inc(109829);y[i] = Math.log(airdata[2][i]);
        }

        }__CLR4_4_12caj2cajlb90perz.R.inc(109830);instance.addObservations(x, y);
        __CLR4_4_12caj2cajlb90perz.R.inc(109831);redRegression.addObservations(xReduced, y);
        
        __CLR4_4_12caj2cajlb90perz.R.inc(109832);RegressionResults resultsInstance = instance.regress( new int[]{0,1,2} );
        __CLR4_4_12caj2cajlb90perz.R.inc(109833);RegressionResults resultsReduced = redRegression.regress();
        
        __CLR4_4_12caj2cajlb90perz.R.inc(109834);TestUtils.assertEquals(resultsInstance.getParameterEstimates(), resultsReduced.getParameterEstimates(), 1.0e-12);
        __CLR4_4_12caj2cajlb90perz.R.inc(109835);TestUtils.assertEquals(resultsInstance.getStdErrorOfEstimates(), resultsReduced.getStdErrorOfEstimates(), 1.0e-12);
    }finally{__CLR4_4_12caj2cajlb90perz.R.flushNeeded();}}
    
    
}
