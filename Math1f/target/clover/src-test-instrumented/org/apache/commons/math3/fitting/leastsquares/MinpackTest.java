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

package org.apache.commons.math3.fitting.leastsquares;

import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p>Some of the unit tests are re-implementations of the MINPACK <a
 * href="http://www.netlib.org/minpack/ex/file17">file17</a> and <a
 * href="http://www.netlib.org/minpack/ex/file22">file22</a> test files.
 * The redistribution policy for MINPACK is available <a
 * href="http://www.netlib.org/minpack/disclaimer">here</a>, for
 * convenience, it is reproduced below.</p>

 * <table border="0" width="80%" cellpadding="10" align="center" bgcolor="#E0E0E0">
 * <tr><td>
 *    Minpack Copyright Notice (1999) University of Chicago.
 *    All rights reserved
 * </td></tr>
 * <tr><td>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * <ol>
 *  <li>Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.</li>
 * <li>Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.</li>
 * <li>The end-user documentation included with the redistribution, if any,
 *     must include the following acknowledgment:
 *     <code>This product includes software developed by the University of
 *           Chicago, as Operator of Argonne National Laboratory.</code>
 *     Alternately, this acknowledgment may appear in the software itself,
 *     if and wherever such third-party acknowledgments normally appear.</li>
 * <li><strong>WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED "AS IS"
 *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
 *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
 *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
 *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
 *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
 *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
 *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
 *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
 *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
 *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
 *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
 *     BE CORRECTED.</strong></li>
 * <li><strong>LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
 *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
 *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
 *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
 *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
 *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
 *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
 *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
 *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
 *     POSSIBILITY OF SUCH LOSS OR DAMAGES.</strong></li>
 * <ol></td></tr>
 * </table>

 * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)
 * @author Burton S. Garbow (original fortran minpack tests)
 * @author Kenneth E. Hillstrom (original fortran minpack tests)
 * @author Jorge J. More (original fortran minpack tests)
 * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)
 */
public class MinpackTest {static class __CLR4_4_11lxm1lxmlb90pcl6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,75782,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMinpackLinearFullRank() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pva8w1lxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackLinearFullRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pva8w1lxm(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75082);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75083);minpackTest(new LinearFullRankFunction(10, 5, 1.0,
                                               5.0, 2.23606797749979), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75084);minpackTest(new LinearFullRankFunction(50, 5, 1.0,
                                               8.06225774829855, 6.70820393249937), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackLinearRank1() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t15uoe1lxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackLinearRank1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75085,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t15uoe1lxp(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75085);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75086);minpackTest(new LinearRank1Function(10, 5, 1.0,
                                            291.521868819476, 1.4638501094228), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75087);minpackTest(new LinearRank1Function(50, 5, 1.0,
                                            3101.60039334535, 3.48263016573496), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackLinearRank1ZeroColsAndRows() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vovekr1lxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackLinearRank1ZeroColsAndRows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vovekr1lxs(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75088);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75089);minpackTest(new LinearRank1ZeroColsAndRowsFunction(10, 5, 1.0), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75090);minpackTest(new LinearRank1ZeroColsAndRowsFunction(50, 5, 1.0), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackRosenbrok() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnjetj1lxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackRosenbrok",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnjetj1lxv(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75091);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75092);minpackTest(new RosenbrockFunction(new double[] { -1.2, 1.0 },
                                           FastMath.sqrt(24.2)), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75093);minpackTest(new RosenbrockFunction(new double[] { -12.0, 10.0 },
                                           FastMath.sqrt(1795769.0)), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75094);minpackTest(new RosenbrockFunction(new double[] { -120.0, 100.0 },
                                           11.0 * FastMath.sqrt(169000121.0)), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackHelicalValley() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wcfkx1lxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackHelicalValley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wcfkx1lxz(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75095);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75096);minpackTest(new HelicalValleyFunction(new double[] { -1.0, 0.0, 0.0 },
                                              50.0), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75097);minpackTest(new HelicalValleyFunction(new double[] { -10.0, 0.0, 0.0 },
                                              102.95630140987), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75098);minpackTest(new HelicalValleyFunction(new double[] { -100.0, 0.0, 0.0},
                                              991.261822123701), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackPowellSingular() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwfzt01ly3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackPowellSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwfzt01ly3(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75099);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75100);minpackTest(new PowellSingularFunction(new double[] { 3.0, -1.0, 0.0, 1.0 },
                                               14.6628782986152), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75101);minpackTest(new PowellSingularFunction(new double[] { 30.0, -10.0, 0.0, 10.0 },
                                               1270.9838708654), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75102);minpackTest(new PowellSingularFunction(new double[] { 300.0, -100.0, 0.0, 100.0 },
                                               126887.903284750), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackFreudensteinRoth() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qix62x1ly7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackFreudensteinRoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qix62x1ly7(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75103);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75104);minpackTest(new FreudensteinRothFunction(new double[] { 0.5, -2.0 },
                                                 20.0124960961895, 6.99887517584575,
                                                 new double[] {
                                                     11.4124844654993,
                                                     -0.896827913731509
                                                 }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75105);minpackTest(new FreudensteinRothFunction(new double[] { 5.0, -20.0 },
                                                 12432.833948863, 6.9988751744895,
                                                 new double[] {
                                                     11.41300466147456,
                                                     -0.896796038685959
                                                 }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75106);minpackTest(new FreudensteinRothFunction(new double[] { 50.0, -200.0 },
                                                 11426454.595762, 6.99887517242903,
                                                 new double[] {
                                                     11.412781785788564,
                                                     -0.8968051074920405
                                                 }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackBard() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kddxt1lyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackBard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kddxt1lyb(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75107);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75108);minpackTest(new BardFunction(1.0, 6.45613629515967, 0.0906359603390466,
                                     new double[] {
                                         0.0824105765758334,
                                         1.1330366534715,
                                         2.34369463894115
                                     }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75109);minpackTest(new BardFunction(10.0, 36.1418531596785, 4.17476870138539,
                                     new double[] {
                                         0.840666673818329,
                                         -158848033.259565,
                                         -164378671.653535
                                     }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75110);minpackTest(new BardFunction(100.0, 384.114678637399, 4.17476870135969,
                                     new double[] {
                                         0.840666673867645,
                                         -158946167.205518,
                                         -164464906.857771
                                     }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackKowalikOsborne() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16etpew1lyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackKowalikOsborne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16etpew1lyf(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75111);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75112);minpackTest(new KowalikOsborneFunction(new double[] { 0.25, 0.39, 0.415, 0.39 },
                                               0.0728915102882945,
                                               0.017535837721129,
                                               new double[] {
                                                   0.192807810476249,
                                                   0.191262653354071,
                                                   0.123052801046931,
                                                   0.136053221150517
                                               }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75113);minpackTest(new KowalikOsborneFunction(new double[] { 2.5, 3.9, 4.15, 3.9 },
                                               2.97937007555202,
                                               0.032052192917937,
                                               new double[] {
                                                   728675.473768287,
                                                   -14.0758803129393,
                                                   -32977797.7841797,
                                                   -20571594.1977912
                                               }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75114);minpackTest(new KowalikOsborneFunction(new double[] { 25.0, 39.0, 41.5, 39.0 },
                                               29.9590617016037,
                                               0.0175364017658228,
                                               new double[] {
                                                   0.192948328597594,
                                                   0.188053165007911,
                                                   0.122430604321144,
                                                   0.134575665392506
                                               }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackMeyer() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qa0as1lyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackMeyer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qa0as1lyj(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75115);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75116);minpackTest(new MeyerFunction(new double[] { 0.02, 4000.0, 250.0 },
                                      41153.4665543031, 9.37794514651874,
                                      new double[] {
                                          0.00560963647102661,
                                          6181.34634628659,
                                          345.223634624144
                                      }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75117);minpackTest(new MeyerFunction(new double[] { 0.2, 40000.0, 2500.0 },
                                      4168216.89130846, 792.917871779501,
                                      new double[] {
                                          1.42367074157994e-11,
                                          33695.7133432541,
                                          901.268527953801
                                      }), true);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackWatson() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17b2kiw1lym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackWatson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17b2kiw1lym(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75118);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75119);minpackTest(new WatsonFunction(6, 0.0,
                                       5.47722557505166, 0.0478295939097601,
                                       new double[] {
                                           -0.0157249615083782, 1.01243488232965,
                                           -0.232991722387673,  1.26043101102818,
                                           -1.51373031394421,   0.99299727291842
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75120);minpackTest(new WatsonFunction(6, 10.0,
                                       6433.12578950026, 0.0478295939096951,
                                       new double[] {
                                           -0.0157251901386677, 1.01243485860105,
                                           -0.232991545843829,  1.26042932089163,
                                           -1.51372776706575,   0.99299573426328
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75121);minpackTest(new WatsonFunction(6, 100.0,
                                       674256.040605213, 0.047829593911544,
                                       new double[] {
                                           -0.0157247019712586, 1.01243490925658,
                                           -0.232991922761641,  1.26043292929555,
                                           -1.51373320452707,   0.99299901922322
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75122);minpackTest(new WatsonFunction(9, 0.0,
                                       5.47722557505166, 0.00118311459212420,
                                       new double[] {
                                           -0.153070644166722e-4, 0.999789703934597,
                                           0.0147639634910978,   0.146342330145992,
                                           1.00082109454817,    -2.61773112070507,
                                           4.10440313943354,    -3.14361226236241,
                                           1.05262640378759
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75123);minpackTest(new WatsonFunction(9, 10.0,
                                       12088.127069307, 0.00118311459212513,
                                       new double[] {
                                           -0.153071334849279e-4, 0.999789703941234,
                                           0.0147639629786217,   0.146342334818836,
                                           1.00082107321386,    -2.61773107084722,
                                           4.10440307655564,    -3.14361222178686,
                                           1.05262639322589
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75124);minpackTest(new WatsonFunction(9, 100.0,
                                       1269109.29043834, 0.00118311459212384,
                                       new double[] {
                                           -0.153069523352176e-4, 0.999789703958371,
                                           0.0147639625185392,   0.146342341096326,
                                           1.00082104729164,    -2.61773101573645,
                                           4.10440301427286,    -3.14361218602503,
                                           1.05262638516774
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75125);minpackTest(new WatsonFunction(12, 0.0,
                                       5.47722557505166, 0.217310402535861e-4,
                                       new double[] {
                                           -0.660266001396382e-8, 1.00000164411833,
                                           -0.000563932146980154, 0.347820540050756,
                                           -0.156731500244233,    1.05281515825593,
                                           -3.24727109519451,     7.2884347837505,
                                           -10.271848098614,       9.07411353715783,
                                           -4.54137541918194,     1.01201187975044
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75126);minpackTest(new WatsonFunction(12, 10.0,
                                       19220.7589790951, 0.217310402518509e-4,
                                       new double[] {
                                           -0.663710223017410e-8, 1.00000164411787,
                                           -0.000563932208347327, 0.347820540486998,
                                           -0.156731503955652,    1.05281517654573,
                                           -3.2472711515214,      7.28843489430665,
                                           -10.2718482369638,      9.07411364383733,
                                           -4.54137546533666,     1.01201188830857
                                       }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75127);minpackTest(new WatsonFunction(12, 100.0,
                                       2018918.04462367, 0.217310402539845e-4,
                                       new double[] {
                                           -0.663806046485249e-8, 1.00000164411786,
                                           -0.000563932210324959, 0.347820540503588,
                                           -0.156731504091375,    1.05281517718031,
                                           -3.24727115337025,     7.28843489775302,
                                           -10.2718482410813,      9.07411364688464,
                                           -4.54137546660822,     1.0120118885369
                                       }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackBox3Dimensional() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pza8g91lyw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackBox3Dimensional",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pza8g91lyw(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75128);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75129);minpackTest(new Box3DimensionalFunction(10, new double[] { 0.0, 10.0, 20.0 },
                                                32.1115837449572), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackJennrichSampson() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urd5m01lyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackJennrichSampson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urd5m01lyy(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75130);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75131);minpackTest(new JennrichSampsonFunction(10, new double[] { 0.3, 0.4 },
                                                64.5856498144943, 11.1517793413499,
                                                new double[] {
//                                                     0.2578330049, 0.257829976764542
                                                    0.2578199266368004, 0.25782997676455244
                                                }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackBrownDennis() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7aek11lz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackBrownDennis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7aek11lz0(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75132);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75133);minpackTest(new BrownDennisFunction(20,
                                            new double[] { 25.0, 5.0, -5.0, -1.0 },
                                            2815.43839161816, 292.954288244866,
                                            new double[] {
                                                -11.59125141003, 13.2024883984741,
                                                -0.403574643314272, 0.236736269844604
                                            }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75134);minpackTest(new BrownDennisFunction(20,
                                            new double[] { 250.0, 50.0, -50.0, -10.0 },
                                            555073.354173069, 292.954270581415,
                                            new double[] {
                                                -11.5959274272203, 13.2041866926242,
                                                -0.403417362841545, 0.236771143410386
                                            }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75135);minpackTest(new BrownDennisFunction(20,
                                            new double[] { 2500.0, 500.0, -500.0, -100.0 },
                                            61211252.2338581, 292.954306151134,
                                            new double[] {
                                                -11.5902596937374, 13.2020628854665,
                                                -0.403688070279258, 0.236665033746463
                                            }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackChebyquad() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0caac1lz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackChebyquad",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0caac1lz4(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75136);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75137);minpackTest(new ChebyquadFunction(1, 8, 1.0,
                                          1.88623796907732, 1.88623796907732,
                                          new double[] { 0.5 }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75138);minpackTest(new ChebyquadFunction(1, 8, 10.0,
                                          5383344372.34005, 1.88424820499951,
                                          new double[] { 0.9817314924684 }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75139);minpackTest(new ChebyquadFunction(1, 8, 100.0,
                                          0.118088726698392e19, 1.88424820499347,
                                          new double[] { 0.9817314852934 }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75140);minpackTest(new ChebyquadFunction(8, 8, 1.0,
                                          0.196513862833975, 0.0593032355046727,
                                          new double[] {
                                              0.0431536648587336, 0.193091637843267,
                                              0.266328593812698,  0.499999334628884,
                                              0.500000665371116,  0.733671406187302,
                                              0.806908362156733,  0.956846335141266
                                          }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75141);minpackTest(new ChebyquadFunction(9, 9, 1.0,
                                          0.16994993465202, 0.0,
                                          new double[] {
                                              0.0442053461357828, 0.199490672309881,
                                              0.23561910847106,   0.416046907892598,
                                              0.5,                0.583953092107402,
                                              0.764380891528940,  0.800509327690119,
                                              0.955794653864217
                                          }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75142);minpackTest(new ChebyquadFunction(10, 10, 1.0,
                                          0.183747831178711, 0.0806471004038253,
                                          new double[] {
                                              0.0596202671753563, 0.166708783805937,
                                              0.239171018813509,  0.398885290346268,
                                              0.398883667870681,  0.601116332129320,
                                              0.60111470965373,   0.760828981186491,
                                              0.833291216194063,  0.940379732824644
                                          }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackBrownAlmostLinear() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0t5nt1lzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackBrownAlmostLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0t5nt1lzb(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75143);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75144);minpackTest(new BrownAlmostLinearFunction(10, 0.5,
                                                  16.5302162063499, 0.0,
                                                  new double[] {
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 1.20569696650138
                                                  }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75145);minpackTest(new BrownAlmostLinearFunction(10, 5.0,
                                                  9765624.00089211, 0.0,
                                                  new double[] {
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 1.20569696650135
                                                  }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75146);minpackTest(new BrownAlmostLinearFunction(10, 50.0,
                                                  0.9765625e17, 0.0,
                                                  new double[] {
                                                      1.0, 1.0, 1.0, 1.0, 1.0,
                                                      1.0, 1.0, 1.0, 1.0, 1.0
                                                  }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75147);minpackTest(new BrownAlmostLinearFunction(30, 0.5,
                                                  83.476044467848, 0.0,
                                                  new double[] {
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 0.997754216442807,
                                                      0.997754216442807, 1.06737350671578
                                                  }), false);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75148);minpackTest(new BrownAlmostLinearFunction(40, 0.5,
                                                  128.026364472323, 0.0,
                                                  new double[] {
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      1.00000000000002, 1.00000000000002,
                                                      0.999999999999121
                                                  }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackOsborne1() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai3fnd1lzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackOsborne1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai3fnd1lzh(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75149);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75150);minpackTest(new Osborne1Function(new double[] { 0.5, 1.5, -1.0, 0.01, 0.02, },
                                         0.937564021037838, 0.00739249260904843,
                                         new double[] {
                                             0.375410049244025, 1.93584654543108,
                                             -1.46468676748716, 0.0128675339110439,
                                             0.0221227011813076
                                         }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    @Test
    public void testMinpackOsborne2() {__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceStart(getClass().getName(),75151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr3efu1lzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lxm1lxmlb90pcl6.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.leastsquares.MinpackTest.testMinpackOsborne2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),75151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr3efu1lzj(){try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75151);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75152);minpackTest(new Osborne2Function(new double[] {
                    1.3, 0.65, 0.65, 0.7, 0.6,
                    3.0, 5.0, 7.0, 2.0, 4.5, 5.5
                },
                1.44686540984712, 0.20034404483314,
                new double[] {
                    1.30997663810096,  0.43155248076,
                    0.633661261602859, 0.599428560991695,
                    0.754179768272449, 0.904300082378518,
                    1.36579949521007, 4.82373199748107,
                    2.39868475104871, 4.56887554791452,
                    5.67534206273052
                }), false);
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    private void minpackTest(MinpackFunction function, boolean exceptionExpected) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75153);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75154);final double tol = 2.22044604926e-16;
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75155);final double sqrtTol = FastMath.sqrt(tol);
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75156);LevenbergMarquardtOptimizer optimizer = LevenbergMarquardtOptimizer.create();
        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75157);optimizer = optimizer
            .withInitialStepBoundFactor(optimizer.getInitialStepBoundFactor())
            .withCostRelativeTolerance(sqrtTol)
            .withParameterRelativeTolerance(sqrtTol)
            .withOrthoTolerance(tol)
            .withRankingThreshold(optimizer.getRankingThreshold())
            .withMaxEvaluations(400 * (function.getN() + 1))
            .withMaxIterations(2000)
            .withModelAndJacobian(function.getModelFunction(),
                                  function.getModelFunctionJacobian())
            .withTarget(function.getTarget())
            .withWeight(new DiagonalMatrix(function.getWeight()))
            .withStartPoint(function.getStartPoint());

        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75158);try {
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75159);final double[] optimum = optimizer.optimize().getPoint();
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75160);Assert.assertFalse(exceptionExpected);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75161);function.checkTheoreticalMinCost(optimizer.computeRMS(optimum));
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75162);function.checkTheoreticalMinParams(optimum);
        } catch (TooManyEvaluationsException e) {
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75163);Assert.assertTrue(exceptionExpected);
        }
    }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

    private static abstract class MinpackFunction {
        protected int      n;
        protected int      m;
        protected double[] startParams;
        protected double   theoreticalMinCost;
        protected double[] theoreticalMinParams;
        protected double   costAccuracy;
        protected double   paramsAccuracy;

        protected MinpackFunction(int m, double[] startParams,
                                  double theoreticalMinCost,
                                  double[] theoreticalMinParams) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75164);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75165);this.m = m;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75166);this.n = startParams.length;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75167);this.startParams          = startParams.clone();
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75168);this.theoreticalMinCost   = theoreticalMinCost;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75169);this.theoreticalMinParams = theoreticalMinParams;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75170);this.costAccuracy         = 1.0e-8;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75171);this.paramsAccuracy       = 1.0e-5;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        protected static double[] buildArray(int n, double x) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75172);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75173);double[] array = new double[n];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75174);Arrays.fill(array, x);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75175);return array;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public double[] getTarget() {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75176);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75177);return buildArray(m, 0.0);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public double[] getWeight() {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75178);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75179);return buildArray(m, 1.0);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public double[] getStartPoint() {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75180);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75181);return startParams.clone();
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        protected void setCostAccuracy(double costAccuracy) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75182);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75183);this.costAccuracy = costAccuracy;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        protected void setParamsAccuracy(double paramsAccuracy) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75184);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75185);this.paramsAccuracy = paramsAccuracy;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public int getN() {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75186);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75187);return startParams.length;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public void checkTheoreticalMinCost(double rms) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75188);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75189);double threshold = costAccuracy * (1.0 + theoreticalMinCost);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75190);Assert.assertEquals(theoreticalMinCost, FastMath.sqrt(m) * rms, threshold);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public void checkTheoreticalMinParams(double[] params) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75191);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75192);if ((((theoreticalMinParams != null)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75193)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75194)==0&false))) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75195);for (int i = 0; (((i < theoreticalMinParams.length)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75196)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75197)==0&false)); ++i) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75198);double mi = theoreticalMinParams[i];
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75199);double vi = params[i];
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75200);Assert.assertEquals(mi, vi, paramsAccuracy * (1.0 + FastMath.abs(mi)));
                }
            }}
        }}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public MultivariateVectorFunction getModelFunction() {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75201);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75202);return new MultivariateVectorFunction() {
                public double[] value(double[] point) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75203);
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75204);return computeValue(point);
                }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public MultivariateMatrixFunction getModelFunctionJacobian() {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75205);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75206);return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75207);
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75208);return computeJacobian(point);
                }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public abstract double[][] computeJacobian(double[] variables);
        public abstract double[] computeValue(double[] variables);
    }

    private static class LinearFullRankFunction extends MinpackFunction {
        private static final long serialVersionUID = -9030323226268039536L;
        
        public LinearFullRankFunction(int m, int n, double x0,
                                      double theoreticalStartCost,
                                      double theoreticalMinCost) {
            super(m, buildArray(n, x0), theoreticalMinCost,
                  buildArray(n, -1.0));__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75210);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75209);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75211);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75212);double t = 2.0 / m;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75213);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75214);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75215)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75216)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75217);jacobian[i] = new double[n];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75218);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75219)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75220)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75221);jacobian[i][j] = ((((i == j) )&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75222)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75223)==0&false))? (1 - t) : -t;
                }
            }}
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75224);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75225);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75226);double sum = 0;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75227);for (int i = 0; (((i < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75228)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75229)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75230);sum += variables[i];
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75231);double t  = 1 + 2 * sum / m;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75232);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75233);for (int i = 0; (((i < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75234)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75235)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75236);f[i] = variables[i] - t;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75237);Arrays.fill(f, n, m, -t);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75238);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class LinearRank1Function extends MinpackFunction {
        private static final long serialVersionUID = 8494863245104608300L;

        public LinearRank1Function(int m, int n, double x0,
                                   double theoreticalStartCost,
                                   double theoreticalMinCost) {
            super(m, buildArray(n, x0), theoreticalMinCost, null);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75240);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75239);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75241);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75242);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75243);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75244)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75245)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75246);jacobian[i] = new double[n];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75247);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75248)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75249)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75250);jacobian[i][j] = (i + 1) * (j + 1);
                }
            }}
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75251);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75252);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75253);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75254);double sum = 0;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75255);for (int i = 0; (((i < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75256)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75257)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75258);sum += (i + 1) * variables[i];
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75259);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75260)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75261)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75262);f[i] = (i + 1) * sum - 1;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75263);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class LinearRank1ZeroColsAndRowsFunction extends MinpackFunction {
        private static final long serialVersionUID = -3316653043091995018L;

        public LinearRank1ZeroColsAndRowsFunction(int m, int n, double x0) {
            super(m, buildArray(n, x0),
                  FastMath.sqrt((m * (m + 3) - 6) / (2.0 * (2 * m - 3))),
                  null);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75265);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75264);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75266);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75267);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75268);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75269)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75270)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75271);jacobian[i] = new double[n];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75272);jacobian[i][0] = 0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75273);for (int j = 1; (((j < (n - 1))&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75274)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75275)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75276);if ((((i == 0)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75277)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75278)==0&false))) {{
                        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75279);jacobian[i][j] = 0;
                    } }else {__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75280);if ((((i != (m - 1))&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75281)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75282)==0&false))) {{
                        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75283);jacobian[i][j] = i * (j + 1);
                    } }else {{
                        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75284);jacobian[i][j] = 0;
                    }
                }}}
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75285);jacobian[i][n - 1] = 0;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75286);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75287);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75288);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75289);double sum = 0;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75290);for (int i = 1; (((i < (n - 1))&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75291)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75292)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75293);sum += (i + 1) * variables[i];
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75294);for (int i = 0; (((i < (m - 1))&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75295)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75296)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75297);f[i] = i * sum - 1;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75298);f[m - 1] = -1;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75299);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class RosenbrockFunction extends MinpackFunction {
        private static final long serialVersionUID = 2893438180956569134L;
        public RosenbrockFunction(double[] startParams, double theoreticalStartCost) {
            super(2, startParams, 0.0, buildArray(2, 1.0));__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75301);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75300);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75302);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75303);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75304);return new double[][] { { -20 * x1, 10 }, { -1, 0 } };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75305);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75306);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75307);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75308);return new double[] { 10 * (x2 - x1 * x1), 1 - x1 };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class HelicalValleyFunction extends MinpackFunction {
        private static final long serialVersionUID = 220613787843200102L;
        public HelicalValleyFunction(double[] startParams,
                                     double theoreticalStartCost) {
            super(3, startParams, 0.0, new double[] { 1.0, 0.0, 0.0 });__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75310);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75309);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75311);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75312);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75313);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75314);double tmpSquare = x1 * x1 + x2 * x2;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75315);double tmp1 = twoPi * tmpSquare;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75316);double tmp2 = FastMath.sqrt(tmpSquare);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75317);return new double[][] {
                {  100 * x2 / tmp1, -100 * x1 / tmp1, 10 },
                { 10 * x1 / tmp2, 10 * x2 / tmp2, 0 },
                { 0, 0, 1 }
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75318);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75319);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75320);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75321);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75322);double tmp1;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75323);if ((((x1 == 0)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75324)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75325)==0&false))) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75326);tmp1 = ((((x2 >= 0) )&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75327)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75328)==0&false))? 0.25 : -0.25;
            } }else {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75329);tmp1 = FastMath.atan(x2 / x1) / twoPi;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75330);if ((((x1 < 0)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75331)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75332)==0&false))) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75333);tmp1 += 0.5;
                }
            }}
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75334);double tmp2 = FastMath.sqrt(x1 * x1 + x2 * x2);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75335);return new double[] {
                10.0 * (x3 - 10 * tmp1),
                10.0 * (tmp2 - 1),
                x3
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        private static final double twoPi = 2.0 * FastMath.PI;
    }

    private static class PowellSingularFunction extends MinpackFunction {
        private static final long serialVersionUID = 7298364171208142405L;

        public PowellSingularFunction(double[] startParams,
                                      double theoreticalStartCost) {
            super(4, startParams, 0.0, buildArray(4, 0.0));__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75337);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75336);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75338);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75339);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75340);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75341);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75342);double x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75343);return new double[][] {
                { 1, 10, 0, 0 },
                { 0, 0, sqrt5, -sqrt5 },
                { 0, 2 * (x2 - 2 * x3), -4 * (x2 - 2 * x3), 0 },
                { 2 * sqrt10 * (x1 - x4), 0, 0, -2 * sqrt10 * (x1 - x4) }
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75344);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75345);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75346);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75347);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75348);double x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75349);return new double[] {
                x1 + 10 * x2,
                sqrt5 * (x3 - x4),
                (x2 - 2 * x3) * (x2 - 2 * x3),
                sqrt10 * (x1 - x4) * (x1 - x4)
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        private static final double sqrt5  = FastMath.sqrt( 5.0);
        private static final double sqrt10 = FastMath.sqrt(10.0);
  }

    private static class FreudensteinRothFunction extends MinpackFunction {
        private static final long serialVersionUID = 2892404999344244214L;

        public FreudensteinRothFunction(double[] startParams,
                                        double theoreticalStartCost,
                                        double theoreticalMinCost,
                                        double[] theoreticalMinParams) {
            super(2, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75351);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75350);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75352);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75353);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75354);return new double[][] {
                { 1, x2 * (10 - 3 * x2) -  2 },
                { 1, x2 * ( 2 + 3 * x2) - 14, }
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75355);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75356);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75357);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75358);return new double[] {
                -13.0 + x1 + ((5.0 - x2) * x2 -  2.0) * x2,
                -29.0 + x1 + ((1.0 + x2) * x2 - 14.0) * x2
            };
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class BardFunction extends MinpackFunction {
        private static final long serialVersionUID = 5990442612572087668L;

        public BardFunction(double x0,
                            double theoreticalStartCost,
                            double theoreticalMinCost,
                            double[] theoreticalMinParams) {
            super(15, buildArray(3, x0), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75360);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75359);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75361);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75362);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75363);double   x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75364);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75365);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75366)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75367)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75368);double tmp1 = i  + 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75369);double tmp2 = 15 - i;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75370);double tmp3 = ((((i <= 7) )&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75371)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75372)==0&false))? tmp1 : tmp2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75373);double tmp4 = x2 * tmp2 + x3 * tmp3;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75374);tmp4 *= tmp4;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75375);jacobian[i] = new double[] { -1, tmp1 * tmp2 / tmp4, tmp1 * tmp3 / tmp4 };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75376);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75377);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75378);double   x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75379);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75380);double   x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75381);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75382);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75383)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75384)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75385);double tmp1 = i + 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75386);double tmp2 = 15 - i;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75387);double tmp3 = ((((i <= 7) )&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75388)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75389)==0&false))? tmp1 : tmp2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75390);f[i] = y[i] - (x1 + tmp1 / (x2 * tmp2 + x3 * tmp3));
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75391);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        private static final double[] y = {
            0.14, 0.18, 0.22, 0.25, 0.29,
            0.32, 0.35, 0.39, 0.37, 0.58,
            0.73, 0.96, 1.34, 2.10, 4.39
        };
    }

    private static class KowalikOsborneFunction extends MinpackFunction {
        private static final long serialVersionUID = -4867445739880495801L;

        public KowalikOsborneFunction(double[] startParams,
                                      double theoreticalStartCost,
                                      double theoreticalMinCost,
                                      double[] theoreticalMinParams) {
            super(11, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75393);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75392);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75394);if ((((theoreticalStartCost > 20.0)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75395)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75396)==0&false))) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75397);setCostAccuracy(2.0e-4);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75398);setParamsAccuracy(5.0e-3);
            }
        }}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75399);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75400);double   x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75401);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75402);double   x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75403);double   x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75404);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75405);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75406)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75407)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75408);double tmp = v[i] * (v[i] + x3) + x4;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75409);double j1  = -v[i] * (v[i] + x2) / tmp;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75410);double j2  = -v[i] * x1 / tmp;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75411);double j3  = j1 * j2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75412);double j4  = j3 / v[i];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75413);jacobian[i] = new double[] { j1, j2, j3, j4 };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75414);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75415);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75416);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75417);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75418);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75419);double x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75420);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75421);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75422)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75423)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75424);f[i] = y[i] - x1 * (v[i] * (v[i] + x2)) / (v[i] * (v[i] + x3) + x4);
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75425);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        private static final double[] v = {
            4.0, 2.0, 1.0, 0.5, 0.25, 0.167, 0.125, 0.1, 0.0833, 0.0714, 0.0625
        };

        private static final double[] y = {
            0.1957, 0.1947, 0.1735, 0.1600, 0.0844, 0.0627,
            0.0456, 0.0342, 0.0323, 0.0235, 0.0246
        };
    }

    private static class MeyerFunction extends MinpackFunction {
        private static final long serialVersionUID = -838060619150131027L;

        public MeyerFunction(double[] startParams,
                             double theoreticalStartCost,
                             double theoreticalMinCost,
                             double[] theoreticalMinParams) {
            super(16, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75427);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75426);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75428);if ((((theoreticalStartCost > 1.0e6)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75429)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75430)==0&false))) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75431);setCostAccuracy(7.0e-3);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75432);setParamsAccuracy(2.0e-2);
            }
        }}finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75433);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75434);double   x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75435);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75436);double   x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75437);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75438);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75439)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75440)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75441);double temp = 5.0 * (i + 1) + 45.0 + x3;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75442);double tmp1 = x2 / temp;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75443);double tmp2 = FastMath.exp(tmp1);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75444);double tmp3 = x1 * tmp2 / temp;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75445);jacobian[i] = new double[] { tmp2, tmp3, -tmp1 * tmp3 };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75446);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75447);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75448);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75449);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75450);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75451);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75452);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75453)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75454)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75455);f[i] = x1 * FastMath.exp(x2 / (5.0 * (i + 1) + 45.0 + x3)) - y[i];
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75456);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        private static final double[] y = {
            34780.0, 28610.0, 23650.0, 19630.0,
            16370.0, 13720.0, 11540.0,  9744.0,
            8261.0,  7030.0,  6005.0,  5147.0,
            4427.0,  3820.0,  3307.0,  2872.0
        };
    }

    private static class WatsonFunction extends MinpackFunction {
        private static final long serialVersionUID = -9034759294980218927L;

        public WatsonFunction(int n, double x0,
                              double theoreticalStartCost,
                              double theoreticalMinCost,
                              double[] theoreticalMinParams) {
            super(31, buildArray(n, x0), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75458);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75457);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75459);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75460);double[][] jacobian = new double[m][];

            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75461);for (int i = 0; (((i < (m - 2))&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75462)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75463)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75464);double div = (i + 1) / 29.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75465);double s2  = 0.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75466);double dx  = 1.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75467);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75468)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75469)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75470);s2 += dx * variables[j];
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75471);dx *= div;
                }
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75472);double temp= 2 * div * s2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75473);dx = 1.0 / div;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75474);jacobian[i] = new double[n];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75475);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75476)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75477)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75478);jacobian[i][j] = dx * (j - temp);
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75479);dx *= div;
                }
            }}

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75480);jacobian[m - 2]    = new double[n];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75481);jacobian[m - 2][0] = 1;

            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75482);jacobian[m - 1]   = new double[n];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75483);jacobian[m - 1][0]= -2 * variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75484);jacobian[m - 1][1]= 1;

            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75485);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75486);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75487);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75488);for (int i = 0; (((i < (m - 2))&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75489)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75490)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75491);double div = (i + 1) / 29.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75492);double s1 = 0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75493);double dx = 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75494);for (int j = 1; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75495)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75496)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75497);s1 += j * dx * variables[j];
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75498);dx *= div;
                }
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75499);double s2 = 0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75500);dx = 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75501);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75502)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75503)==0&false)); ++j) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75504);s2 += dx * variables[j];
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75505);dx *= div;
                }
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75506);f[i] = s1 - s2 * s2 - 1;
            }

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75507);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75508);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75509);f[m - 2] = x1;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75510);f[m - 1] = x2 - x1 * x1 - 1;

            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75511);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class Box3DimensionalFunction extends MinpackFunction {
        private static final long serialVersionUID = 5511403858142574493L;

        public Box3DimensionalFunction(int m, double[] startParams,
                                       double theoreticalStartCost) {
            super(m, startParams, 0.0,
                  new double[] { 1.0, 10.0, 1.0 });__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75513);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75512);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75514);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75515);double   x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75516);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75517);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75518);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75519)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75520)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75521);double tmp = (i + 1) / 10.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75522);jacobian[i] = new double[] {
                    -tmp * FastMath.exp(-tmp * x1),
                    tmp * FastMath.exp(-tmp * x2),
                    FastMath.exp(-i - 1) - FastMath.exp(-tmp)
                };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75523);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75524);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75525);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75526);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75527);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75528);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75529);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75530)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75531)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75532);double tmp = (i + 1) / 10.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75533);f[i] = FastMath.exp(-tmp * x1) - FastMath.exp(-tmp * x2)
                    + (FastMath.exp(-i - 1) - FastMath.exp(-tmp)) * x3;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75534);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class JennrichSampsonFunction extends MinpackFunction {
        private static final long serialVersionUID = -2489165190443352947L;

        public JennrichSampsonFunction(int m, double[] startParams,
                                       double theoreticalStartCost,
                                       double theoreticalMinCost,
                                       double[] theoreticalMinParams) {
            super(m, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75536);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75535);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75537);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75538);double   x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75539);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75540);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75541);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75542)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75543)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75544);double t = i + 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75545);jacobian[i] = new double[] { -t * FastMath.exp(t * x1), -t * FastMath.exp(t * x2) };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75546);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75547);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75548);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75549);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75550);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75551);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75552)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75553)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75554);double temp = i + 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75555);f[i] = 2 + 2 * temp - FastMath.exp(temp * x1) - FastMath.exp(temp * x2);
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75556);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class BrownDennisFunction extends MinpackFunction {
        private static final long serialVersionUID = 8340018645694243910L;

        public BrownDennisFunction(int m, double[] startParams,
                                   double theoreticalStartCost,
                                   double theoreticalMinCost,
                                   double[] theoreticalMinParams) {
            super(m, startParams, theoreticalMinCost,
                theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75558);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75557);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75559);setCostAccuracy(2.5e-8);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75560);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75561);double   x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75562);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75563);double   x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75564);double   x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75565);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75566);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75567)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75568)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75569);double temp = (i + 1) / 5.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75570);double ti   = FastMath.sin(temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75571);double tmp1 = x1 + temp * x2 - FastMath.exp(temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75572);double tmp2 = x3 + ti   * x4 - FastMath.cos(temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75573);jacobian[i] = new double[] {
                    2 * tmp1, 2 * temp * tmp1, 2 * tmp2, 2 * ti * tmp2
                };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75574);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75575);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75576);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75577);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75578);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75579);double x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75580);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75581);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75582)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75583)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75584);double temp = (i + 1) / 5.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75585);double tmp1 = x1 + temp * x2 - FastMath.exp(temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75586);double tmp2 = x3 + FastMath.sin(temp) * x4 - FastMath.cos(temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75587);f[i] = tmp1 * tmp1 + tmp2 * tmp2;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75588);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class ChebyquadFunction extends MinpackFunction {
        private static final long serialVersionUID = -2394877275028008594L;

        private static double[] buildChebyquadArray(int n, double factor) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75589);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75590);double[] array = new double[n];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75591);double inv = factor / (n + 1);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75592);for (int i = 0; (((i < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75593)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75594)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75595);array[i] = (i + 1) * inv;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75596);return array;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        public ChebyquadFunction(int n, int m, double factor,
                                 double theoreticalStartCost,
                                 double theoreticalMinCost,
                                 double[] theoreticalMinParams) {
            super(m, buildChebyquadArray(n, factor), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75598);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75597);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75599);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75600);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75601);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75602)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75603)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75604);jacobian[i] = new double[n];
            }

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75605);double dx = 1.0 / n;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75606);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75607)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75608)==0&false)); ++j) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75609);double tmp1 = 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75610);double tmp2 = 2 * variables[j] - 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75611);double temp = 2 * tmp2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75612);double tmp3 = 0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75613);double tmp4 = 2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75614);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75615)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75616)==0&false)); ++i) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75617);jacobian[i][j] = dx * tmp4;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75618);double ti = 4 * tmp2 + temp * tmp4 - tmp3;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75619);tmp3 = tmp4;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75620);tmp4 = ti;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75621);ti   = temp * tmp2 - tmp1;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75622);tmp1 = tmp2;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75623);tmp2 = ti;
                }
            }}

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75624);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75625);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75626);double[] f = new double[m];

            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75627);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75628)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75629)==0&false)); ++j) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75630);double tmp1 = 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75631);double tmp2 = 2 * variables[j] - 1;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75632);double temp = 2 * tmp2;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75633);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75634)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75635)==0&false)); ++i) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75636);f[i] += tmp2;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75637);double ti = temp * tmp2 - tmp1;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75638);tmp1 = tmp2;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75639);tmp2 = ti;
                }
            }}

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75640);double dx = 1.0 / n;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75641);boolean iev = false;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75642);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75643)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75644)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75645);f[i] *= dx;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75646);if ((((iev)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75647)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75648)==0&false))) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75649);f[i] += 1.0 / (i * (i + 2));
                }
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75650);iev = ! iev;
            }

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75651);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class BrownAlmostLinearFunction extends MinpackFunction {
        private static final long serialVersionUID = 8239594490466964725L;

        public BrownAlmostLinearFunction(int m, double factor,
                                         double theoreticalStartCost,
                                         double theoreticalMinCost,
                                         double[] theoreticalMinParams) {
            super(m, buildArray(m, factor), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75653);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75652);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75654);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75655);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75656);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75657)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75658)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75659);jacobian[i] = new double[n];
            }

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75660);double prod = 1;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75661);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75662)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75663)==0&false)); ++j) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75664);prod *= variables[j];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75665);for (int i = 0; (((i < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75666)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75667)==0&false)); ++i) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75668);jacobian[i][j] = 1;
                }
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75669);jacobian[j][j] = 2;
            }

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75670);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75671)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75672)==0&false)); ++j) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75673);double temp = variables[j];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75674);if ((((temp == 0)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75675)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75676)==0&false))) {{
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75677);temp = 1;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75678);prod = 1;
                    __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75679);for (int k = 0; (((k < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75680)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75681)==0&false)); ++k) {{
                        __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75682);if ((((k != j)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75683)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75684)==0&false))) {{
                            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75685);prod *= variables[k];
                        }
                    }}
                }}
                }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75686);jacobian[n - 1][j] = prod / temp;
            }

            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75687);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75688);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75689);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75690);double sum  = -(n + 1);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75691);double prod = 1;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75692);for (int j = 0; (((j < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75693)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75694)==0&false)); ++j) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75695);sum  += variables[j];
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75696);prod *= variables[j];
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75697);for (int i = 0; (((i < n)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75698)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75699)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75700);f[i] = variables[i] + sum;
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75701);f[n - 1] = prod - 1;
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75702);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
    }

    private static class Osborne1Function extends MinpackFunction {
        private static final long serialVersionUID = 4006743521149849494L;

        public Osborne1Function(double[] startParams,
                                double theoreticalStartCost,
                                double theoreticalMinCost,
                                double[] theoreticalMinParams) {
            super(33, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75704);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75703);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75705);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75706);double   x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75707);double   x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75708);double   x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75709);double   x5 = variables[4];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75710);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75711);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75712)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75713)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75714);double temp = 10.0 * i;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75715);double tmp1 = FastMath.exp(-temp * x4);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75716);double tmp2 = FastMath.exp(-temp * x5);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75717);jacobian[i] = new double[] {
                    -1, -tmp1, -tmp2, temp * x2 * tmp1, temp * x3 * tmp2
                };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75718);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75719);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75720);double x1 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75721);double x2 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75722);double x3 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75723);double x4 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75724);double x5 = variables[4];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75725);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75726);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75727)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75728)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75729);double temp = 10.0 * i;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75730);double tmp1 = FastMath.exp(-temp * x4);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75731);double tmp2 = FastMath.exp(-temp * x5);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75732);f[i] = y[i] - (x1 + x2 * tmp1 + x3 * tmp2);
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75733);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}
        
        private static final double[] y = {
            0.844, 0.908, 0.932, 0.936, 0.925, 0.908, 0.881, 0.850, 0.818, 0.784, 0.751,
            0.718, 0.685, 0.658, 0.628, 0.603, 0.580, 0.558, 0.538, 0.522, 0.506, 0.490,
            0.478, 0.467, 0.457, 0.448, 0.438, 0.431, 0.424, 0.420, 0.414, 0.411, 0.406
        };
    }

    private static class Osborne2Function extends MinpackFunction {
        private static final long serialVersionUID = -8418268780389858746L;

        public Osborne2Function(double[] startParams,
                                double theoreticalStartCost,
                                double theoreticalMinCost,
                                double[] theoreticalMinParams) {
            super(65, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75735);try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75734);
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75736);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75737);double   x01 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75738);double   x02 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75739);double   x03 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75740);double   x04 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75741);double   x05 = variables[4];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75742);double   x06 = variables[5];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75743);double   x07 = variables[6];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75744);double   x08 = variables[7];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75745);double   x09 = variables[8];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75746);double   x10 = variables[9];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75747);double   x11 = variables[10];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75748);double[][] jacobian = new double[m][];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75749);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75750)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75751)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75752);double temp = i / 10.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75753);double tmp1 = FastMath.exp(-x05 * temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75754);double tmp2 = FastMath.exp(-x06 * (temp - x09) * (temp - x09));
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75755);double tmp3 = FastMath.exp(-x07 * (temp - x10) * (temp - x10));
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75756);double tmp4 = FastMath.exp(-x08 * (temp - x11) * (temp - x11));
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75757);jacobian[i] = new double[] {
                    -tmp1,
                    -tmp2,
                    -tmp3,
                    -tmp4,
                    temp * x01 * tmp1,
                    x02 * (temp - x09) * (temp - x09) * tmp2,
                    x03 * (temp - x10) * (temp - x10) * tmp3,
                    x04 * (temp - x11) * (temp - x11) * tmp4,
                    -2 * x02 * x06 * (temp - x09) * tmp2,
                    -2 * x03 * x07 * (temp - x10) * tmp3,
                    -2 * x04 * x08 * (temp - x11) * tmp4
                };
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75758);return jacobian;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75759);
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75760);double x01 = variables[0];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75761);double x02 = variables[1];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75762);double x03 = variables[2];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75763);double x04 = variables[3];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75764);double x05 = variables[4];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75765);double x06 = variables[5];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75766);double x07 = variables[6];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75767);double x08 = variables[7];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75768);double x09 = variables[8];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75769);double x10 = variables[9];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75770);double x11 = variables[10];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75771);double[] f = new double[m];
            __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75772);for (int i = 0; (((i < m)&&(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75773)!=0|true))||(__CLR4_4_11lxm1lxmlb90pcl6.R.iget(75774)==0&false)); ++i) {{
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75775);double temp = i / 10.0;
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75776);double tmp1 = FastMath.exp(-x05 * temp);
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75777);double tmp2 = FastMath.exp(-x06 * (temp - x09) * (temp - x09));
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75778);double tmp3 = FastMath.exp(-x07 * (temp - x10) * (temp - x10));
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75779);double tmp4 = FastMath.exp(-x08 * (temp - x11) * (temp - x11));
                __CLR4_4_11lxm1lxmlb90pcl6.R.inc(75780);f[i] = y[i] - (x01 * tmp1 + x02 * tmp2 + x03 * tmp3 + x04 * tmp4);
            }
            }__CLR4_4_11lxm1lxmlb90pcl6.R.inc(75781);return f;
        }finally{__CLR4_4_11lxm1lxmlb90pcl6.R.flushNeeded();}}

        private static final double[] y = {
            1.366, 1.191, 1.112, 1.013, 0.991,
            0.885, 0.831, 0.847, 0.786, 0.725,
            0.746, 0.679, 0.608, 0.655, 0.616,
            0.606, 0.602, 0.626, 0.651, 0.724,
            0.649, 0.649, 0.694, 0.644, 0.624,
            0.661, 0.612, 0.558, 0.533, 0.495,
            0.500, 0.423, 0.395, 0.375, 0.372,
            0.391, 0.396, 0.405, 0.428, 0.429,
            0.523, 0.562, 0.607, 0.653, 0.672,
            0.708, 0.633, 0.668, 0.645, 0.632,
            0.591, 0.559, 0.597, 0.625, 0.739,
            0.710, 0.729, 0.720, 0.636, 0.581,
            0.428, 0.292, 0.162, 0.098, 0.054
        };
    }
}
