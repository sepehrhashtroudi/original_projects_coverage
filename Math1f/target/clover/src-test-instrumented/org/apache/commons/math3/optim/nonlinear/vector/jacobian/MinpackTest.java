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

package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.util.Arrays;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
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
public class MinpackTest {static class __CLR4_4_123222322lb90pdws{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,97972,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMinpackLinearFullRank() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pva8w2322();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackLinearFullRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pva8w2322(){try{__CLR4_4_123222322lb90pdws.R.inc(97274);
        __CLR4_4_123222322lb90pdws.R.inc(97275);minpackTest(new LinearFullRankFunction(10, 5, 1.0,
                                               5.0, 2.23606797749979), false);
        __CLR4_4_123222322lb90pdws.R.inc(97276);minpackTest(new LinearFullRankFunction(50, 5, 1.0,
                                               8.06225774829855, 6.70820393249937), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackLinearRank1() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t15uoe2325();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackLinearRank1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t15uoe2325(){try{__CLR4_4_123222322lb90pdws.R.inc(97277);
        __CLR4_4_123222322lb90pdws.R.inc(97278);minpackTest(new LinearRank1Function(10, 5, 1.0,
                                            291.521868819476, 1.4638501094228), false);
        __CLR4_4_123222322lb90pdws.R.inc(97279);minpackTest(new LinearRank1Function(50, 5, 1.0,
                                            3101.60039334535, 3.48263016573496), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackLinearRank1ZeroColsAndRows() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vovekr2328();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackLinearRank1ZeroColsAndRows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vovekr2328(){try{__CLR4_4_123222322lb90pdws.R.inc(97280);
        __CLR4_4_123222322lb90pdws.R.inc(97281);minpackTest(new LinearRank1ZeroColsAndRowsFunction(10, 5, 1.0), false);
        __CLR4_4_123222322lb90pdws.R.inc(97282);minpackTest(new LinearRank1ZeroColsAndRowsFunction(50, 5, 1.0), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackRosenbrok() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnjetj232b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackRosenbrok",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnjetj232b(){try{__CLR4_4_123222322lb90pdws.R.inc(97283);
        __CLR4_4_123222322lb90pdws.R.inc(97284);minpackTest(new RosenbrockFunction(new double[] { -1.2, 1.0 },
                                           FastMath.sqrt(24.2)), false);
        __CLR4_4_123222322lb90pdws.R.inc(97285);minpackTest(new RosenbrockFunction(new double[] { -12.0, 10.0 },
                                           FastMath.sqrt(1795769.0)), false);
        __CLR4_4_123222322lb90pdws.R.inc(97286);minpackTest(new RosenbrockFunction(new double[] { -120.0, 100.0 },
                                           11.0 * FastMath.sqrt(169000121.0)), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackHelicalValley() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wcfkx232f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackHelicalValley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wcfkx232f(){try{__CLR4_4_123222322lb90pdws.R.inc(97287);
        __CLR4_4_123222322lb90pdws.R.inc(97288);minpackTest(new HelicalValleyFunction(new double[] { -1.0, 0.0, 0.0 },
                                              50.0), false);
        __CLR4_4_123222322lb90pdws.R.inc(97289);minpackTest(new HelicalValleyFunction(new double[] { -10.0, 0.0, 0.0 },
                                              102.95630140987), false);
        __CLR4_4_123222322lb90pdws.R.inc(97290);minpackTest(new HelicalValleyFunction(new double[] { -100.0, 0.0, 0.0},
                                              991.261822123701), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackPowellSingular() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwfzt0232j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackPowellSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwfzt0232j(){try{__CLR4_4_123222322lb90pdws.R.inc(97291);
        __CLR4_4_123222322lb90pdws.R.inc(97292);minpackTest(new PowellSingularFunction(new double[] { 3.0, -1.0, 0.0, 1.0 },
                                               14.6628782986152), false);
        __CLR4_4_123222322lb90pdws.R.inc(97293);minpackTest(new PowellSingularFunction(new double[] { 30.0, -10.0, 0.0, 10.0 },
                                               1270.9838708654), false);
        __CLR4_4_123222322lb90pdws.R.inc(97294);minpackTest(new PowellSingularFunction(new double[] { 300.0, -100.0, 0.0, 100.0 },
                                               126887.903284750), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackFreudensteinRoth() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qix62x232n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackFreudensteinRoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qix62x232n(){try{__CLR4_4_123222322lb90pdws.R.inc(97295);
        __CLR4_4_123222322lb90pdws.R.inc(97296);minpackTest(new FreudensteinRothFunction(new double[] { 0.5, -2.0 },
                                                 20.0124960961895, 6.99887517584575,
                                                 new double[] {
                                                     11.4124844654993,
                                                     -0.896827913731509
                                                 }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97297);minpackTest(new FreudensteinRothFunction(new double[] { 5.0, -20.0 },
                                                 12432.833948863, 6.9988751744895,
                                                 new double[] {
                                                     11.41300466147456,
                                                     -0.896796038685959
                                                 }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97298);minpackTest(new FreudensteinRothFunction(new double[] { 50.0, -200.0 },
                                                 11426454.595762, 6.99887517242903,
                                                 new double[] {
                                                     11.412781785788564,
                                                     -0.8968051074920405
                                                 }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackBard() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kddxt232r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackBard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kddxt232r(){try{__CLR4_4_123222322lb90pdws.R.inc(97299);
        __CLR4_4_123222322lb90pdws.R.inc(97300);minpackTest(new BardFunction(1.0, 6.45613629515967, 0.0906359603390466,
                                     new double[] {
                                         0.0824105765758334,
                                         1.1330366534715,
                                         2.34369463894115
                                     }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97301);minpackTest(new BardFunction(10.0, 36.1418531596785, 4.17476870138539,
                                     new double[] {
                                         0.840666673818329,
                                         -158848033.259565,
                                         -164378671.653535
                                     }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97302);minpackTest(new BardFunction(100.0, 384.114678637399, 4.17476870135969,
                                     new double[] {
                                         0.840666673867645,
                                         -158946167.205518,
                                         -164464906.857771
                                     }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackKowalikOsborne() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16etpew232v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackKowalikOsborne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16etpew232v(){try{__CLR4_4_123222322lb90pdws.R.inc(97303);
        __CLR4_4_123222322lb90pdws.R.inc(97304);minpackTest(new KowalikOsborneFunction(new double[] { 0.25, 0.39, 0.415, 0.39 },
                                               0.0728915102882945,
                                               0.017535837721129,
                                               new double[] {
                                                   0.192807810476249,
                                                   0.191262653354071,
                                                   0.123052801046931,
                                                   0.136053221150517
                                               }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97305);minpackTest(new KowalikOsborneFunction(new double[] { 2.5, 3.9, 4.15, 3.9 },
                                               2.97937007555202,
                                               0.032052192917937,
                                               new double[] {
                                                   728675.473768287,
                                                   -14.0758803129393,
                                                   -32977797.7841797,
                                                   -20571594.1977912
                                               }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97306);minpackTest(new KowalikOsborneFunction(new double[] { 25.0, 39.0, 41.5, 39.0 },
                                               29.9590617016037,
                                               0.0175364017658228,
                                               new double[] {
                                                   0.192948328597594,
                                                   0.188053165007911,
                                                   0.122430604321144,
                                                   0.134575665392506
                                               }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackMeyer() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qa0as232z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackMeyer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qa0as232z(){try{__CLR4_4_123222322lb90pdws.R.inc(97307);
        __CLR4_4_123222322lb90pdws.R.inc(97308);minpackTest(new MeyerFunction(new double[] { 0.02, 4000.0, 250.0 },
                                      41153.4665543031, 9.37794514651874,
                                      new double[] {
                                          0.00560963647102661,
                                          6181.34634628659,
                                          345.223634624144
                                      }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97309);minpackTest(new MeyerFunction(new double[] { 0.2, 40000.0, 2500.0 },
                                      4168216.89130846, 792.917871779501,
                                      new double[] {
                                          1.42367074157994e-11,
                                          33695.7133432541,
                                          901.268527953801
                                      }), true);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackWatson() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17b2kiw2332();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackWatson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17b2kiw2332(){try{__CLR4_4_123222322lb90pdws.R.inc(97310);
        __CLR4_4_123222322lb90pdws.R.inc(97311);minpackTest(new WatsonFunction(6, 0.0,
                                       5.47722557505166, 0.0478295939097601,
                                       new double[] {
                                           -0.0157249615083782, 1.01243488232965,
                                           -0.232991722387673,  1.26043101102818,
                                           -1.51373031394421,   0.99299727291842
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97312);minpackTest(new WatsonFunction(6, 10.0,
                                       6433.12578950026, 0.0478295939096951,
                                       new double[] {
                                           -0.0157251901386677, 1.01243485860105,
                                           -0.232991545843829,  1.26042932089163,
                                           -1.51372776706575,   0.99299573426328
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97313);minpackTest(new WatsonFunction(6, 100.0,
                                       674256.040605213, 0.047829593911544,
                                       new double[] {
                                           -0.0157247019712586, 1.01243490925658,
                                           -0.232991922761641,  1.26043292929555,
                                           -1.51373320452707,   0.99299901922322
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97314);minpackTest(new WatsonFunction(9, 0.0,
                                       5.47722557505166, 0.00118311459212420,
                                       new double[] {
                                           -0.153070644166722e-4, 0.999789703934597,
                                           0.0147639634910978,   0.146342330145992,
                                           1.00082109454817,    -2.61773112070507,
                                           4.10440313943354,    -3.14361226236241,
                                           1.05262640378759
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97315);minpackTest(new WatsonFunction(9, 10.0,
                                       12088.127069307, 0.00118311459212513,
                                       new double[] {
                                           -0.153071334849279e-4, 0.999789703941234,
                                           0.0147639629786217,   0.146342334818836,
                                           1.00082107321386,    -2.61773107084722,
                                           4.10440307655564,    -3.14361222178686,
                                           1.05262639322589
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97316);minpackTest(new WatsonFunction(9, 100.0,
                                       1269109.29043834, 0.00118311459212384,
                                       new double[] {
                                           -0.153069523352176e-4, 0.999789703958371,
                                           0.0147639625185392,   0.146342341096326,
                                           1.00082104729164,    -2.61773101573645,
                                           4.10440301427286,    -3.14361218602503,
                                           1.05262638516774
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97317);minpackTest(new WatsonFunction(12, 0.0,
                                       5.47722557505166, 0.217310402535861e-4,
                                       new double[] {
                                           -0.660266001396382e-8, 1.00000164411833,
                                           -0.000563932146980154, 0.347820540050756,
                                           -0.156731500244233,    1.05281515825593,
                                           -3.24727109519451,     7.2884347837505,
                                           -10.271848098614,       9.07411353715783,
                                           -4.54137541918194,     1.01201187975044
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97318);minpackTest(new WatsonFunction(12, 10.0,
                                       19220.7589790951, 0.217310402518509e-4,
                                       new double[] {
                                           -0.663710223017410e-8, 1.00000164411787,
                                           -0.000563932208347327, 0.347820540486998,
                                           -0.156731503955652,    1.05281517654573,
                                           -3.2472711515214,      7.28843489430665,
                                           -10.2718482369638,      9.07411364383733,
                                           -4.54137546533666,     1.01201188830857
                                       }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97319);minpackTest(new WatsonFunction(12, 100.0,
                                       2018918.04462367, 0.217310402539845e-4,
                                       new double[] {
                                           -0.663806046485249e-8, 1.00000164411786,
                                           -0.000563932210324959, 0.347820540503588,
                                           -0.156731504091375,    1.05281517718031,
                                           -3.24727115337025,     7.28843489775302,
                                           -10.2718482410813,      9.07411364688464,
                                           -4.54137546660822,     1.0120118885369
                                       }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackBox3Dimensional() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pza8g9233c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackBox3Dimensional",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pza8g9233c(){try{__CLR4_4_123222322lb90pdws.R.inc(97320);
        __CLR4_4_123222322lb90pdws.R.inc(97321);minpackTest(new Box3DimensionalFunction(10, new double[] { 0.0, 10.0, 20.0 },
                                                32.1115837449572), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackJennrichSampson() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urd5m0233e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackJennrichSampson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urd5m0233e(){try{__CLR4_4_123222322lb90pdws.R.inc(97322);
        __CLR4_4_123222322lb90pdws.R.inc(97323);minpackTest(new JennrichSampsonFunction(10, new double[] { 0.3, 0.4 },
                                                64.5856498144943, 11.1517793413499,
                                                new double[] {
//                                                     0.2578330049, 0.257829976764542
                                                    0.2578199266368004, 0.25782997676455244
                                                }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackBrownDennis() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7aek1233g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackBrownDennis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7aek1233g(){try{__CLR4_4_123222322lb90pdws.R.inc(97324);
        __CLR4_4_123222322lb90pdws.R.inc(97325);minpackTest(new BrownDennisFunction(20,
                                            new double[] { 25.0, 5.0, -5.0, -1.0 },
                                            2815.43839161816, 292.954288244866,
                                            new double[] {
                                                -11.59125141003, 13.2024883984741,
                                                -0.403574643314272, 0.236736269844604
                                            }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97326);minpackTest(new BrownDennisFunction(20,
                                            new double[] { 250.0, 50.0, -50.0, -10.0 },
                                            555073.354173069, 292.954270581415,
                                            new double[] {
                                                -11.5959274272203, 13.2041866926242,
                                                -0.403417362841545, 0.236771143410386
                                            }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97327);minpackTest(new BrownDennisFunction(20,
                                            new double[] { 2500.0, 500.0, -500.0, -100.0 },
                                            61211252.2338581, 292.954306151134,
                                            new double[] {
                                                -11.5902596937374, 13.2020628854665,
                                                -0.403688070279258, 0.236665033746463
                                            }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackChebyquad() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0caac233k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackChebyquad",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0caac233k(){try{__CLR4_4_123222322lb90pdws.R.inc(97328);
        __CLR4_4_123222322lb90pdws.R.inc(97329);minpackTest(new ChebyquadFunction(1, 8, 1.0,
                                          1.88623796907732, 1.88623796907732,
                                          new double[] { 0.5 }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97330);minpackTest(new ChebyquadFunction(1, 8, 10.0,
                                          5383344372.34005, 1.88424820499951,
                                          new double[] { 0.9817314924684 }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97331);minpackTest(new ChebyquadFunction(1, 8, 100.0,
                                          0.118088726698392e19, 1.88424820499347,
                                          new double[] { 0.9817314852934 }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97332);minpackTest(new ChebyquadFunction(8, 8, 1.0,
                                          0.196513862833975, 0.0593032355046727,
                                          new double[] {
                                              0.0431536648587336, 0.193091637843267,
                                              0.266328593812698,  0.499999334628884,
                                              0.500000665371116,  0.733671406187302,
                                              0.806908362156733,  0.956846335141266
                                          }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97333);minpackTest(new ChebyquadFunction(9, 9, 1.0,
                                          0.16994993465202, 0.0,
                                          new double[] {
                                              0.0442053461357828, 0.199490672309881,
                                              0.23561910847106,   0.416046907892598,
                                              0.5,                0.583953092107402,
                                              0.764380891528940,  0.800509327690119,
                                              0.955794653864217
                                          }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97334);minpackTest(new ChebyquadFunction(10, 10, 1.0,
                                          0.183747831178711, 0.0806471004038253,
                                          new double[] {
                                              0.0596202671753563, 0.166708783805937,
                                              0.239171018813509,  0.398885290346268,
                                              0.398883667870681,  0.601116332129320,
                                              0.60111470965373,   0.760828981186491,
                                              0.833291216194063,  0.940379732824644
                                          }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackBrownAlmostLinear() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0t5nt233r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackBrownAlmostLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0t5nt233r(){try{__CLR4_4_123222322lb90pdws.R.inc(97335);
        __CLR4_4_123222322lb90pdws.R.inc(97336);minpackTest(new BrownAlmostLinearFunction(10, 0.5,
                                                  16.5302162063499, 0.0,
                                                  new double[] {
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 0.979430303349862,
                                                      0.979430303349862, 1.20569696650138
                                                  }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97337);minpackTest(new BrownAlmostLinearFunction(10, 5.0,
                                                  9765624.00089211, 0.0,
                                                  new double[] {
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 0.979430303349865,
                                                      0.979430303349865, 1.20569696650135
                                                  }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97338);minpackTest(new BrownAlmostLinearFunction(10, 50.0,
                                                  0.9765625e17, 0.0,
                                                  new double[] {
                                                      1.0, 1.0, 1.0, 1.0, 1.0,
                                                      1.0, 1.0, 1.0, 1.0, 1.0
                                                  }), false);
        __CLR4_4_123222322lb90pdws.R.inc(97339);minpackTest(new BrownAlmostLinearFunction(30, 0.5,
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
        __CLR4_4_123222322lb90pdws.R.inc(97340);minpackTest(new BrownAlmostLinearFunction(40, 0.5,
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
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackOsborne1() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai3fnd233x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackOsborne1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai3fnd233x(){try{__CLR4_4_123222322lb90pdws.R.inc(97341);
        __CLR4_4_123222322lb90pdws.R.inc(97342);minpackTest(new Osborne1Function(new double[] { 0.5, 1.5, -1.0, 0.01, 0.02, },
                                         0.937564021037838, 0.00739249260904843,
                                         new double[] {
                                             0.375410049244025, 1.93584654543108,
                                             -1.46468676748716, 0.0128675339110439,
                                             0.0221227011813076
                                         }), false);
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    @Test
    public void testMinpackOsborne2() {__CLR4_4_123222322lb90pdws.R.globalSliceStart(getClass().getName(),97343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr3efu233z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_123222322lb90pdws.R.rethrow($CLV_t2$);}finally{__CLR4_4_123222322lb90pdws.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.vector.jacobian.MinpackTest.testMinpackOsborne2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),97343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr3efu233z(){try{__CLR4_4_123222322lb90pdws.R.inc(97343);
        __CLR4_4_123222322lb90pdws.R.inc(97344);minpackTest(new Osborne2Function(new double[] {
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
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

    private void minpackTest(MinpackFunction function, boolean exceptionExpected) {try{__CLR4_4_123222322lb90pdws.R.inc(97345);
        __CLR4_4_123222322lb90pdws.R.inc(97346);LevenbergMarquardtOptimizer optimizer
            = new LevenbergMarquardtOptimizer(FastMath.sqrt(2.22044604926e-16),
                                              FastMath.sqrt(2.22044604926e-16),
                                              2.22044604926e-16);
        __CLR4_4_123222322lb90pdws.R.inc(97347);try {
            __CLR4_4_123222322lb90pdws.R.inc(97348);PointVectorValuePair optimum
                = optimizer.optimize(new MaxEval(400 * (function.getN() + 1)),
                                     function.getModelFunction(),
                                     function.getModelFunctionJacobian(),
                                     new Target(function.getTarget()),
                                     new Weight(function.getWeight()),
                                     new InitialGuess(function.getStartPoint()));
            __CLR4_4_123222322lb90pdws.R.inc(97349);Assert.assertFalse(exceptionExpected);
            __CLR4_4_123222322lb90pdws.R.inc(97350);function.checkTheoreticalMinCost(optimizer.getRMS());
            __CLR4_4_123222322lb90pdws.R.inc(97351);function.checkTheoreticalMinParams(optimum);
        } catch (TooManyEvaluationsException e) {
            __CLR4_4_123222322lb90pdws.R.inc(97352);Assert.assertTrue(exceptionExpected);
        }
    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

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
                                  double[] theoreticalMinParams) {try{__CLR4_4_123222322lb90pdws.R.inc(97353);
            __CLR4_4_123222322lb90pdws.R.inc(97354);this.m = m;
            __CLR4_4_123222322lb90pdws.R.inc(97355);this.n = startParams.length;
            __CLR4_4_123222322lb90pdws.R.inc(97356);this.startParams          = startParams.clone();
            __CLR4_4_123222322lb90pdws.R.inc(97357);this.theoreticalMinCost   = theoreticalMinCost;
            __CLR4_4_123222322lb90pdws.R.inc(97358);this.theoreticalMinParams = theoreticalMinParams;
            __CLR4_4_123222322lb90pdws.R.inc(97359);this.costAccuracy         = 1.0e-8;
            __CLR4_4_123222322lb90pdws.R.inc(97360);this.paramsAccuracy       = 1.0e-5;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        protected static double[] buildArray(int n, double x) {try{__CLR4_4_123222322lb90pdws.R.inc(97361);
            __CLR4_4_123222322lb90pdws.R.inc(97362);double[] array = new double[n];
            __CLR4_4_123222322lb90pdws.R.inc(97363);Arrays.fill(array, x);
            __CLR4_4_123222322lb90pdws.R.inc(97364);return array;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public double[] getTarget() {try{__CLR4_4_123222322lb90pdws.R.inc(97365);
            __CLR4_4_123222322lb90pdws.R.inc(97366);return buildArray(m, 0.0);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public double[] getWeight() {try{__CLR4_4_123222322lb90pdws.R.inc(97367);
            __CLR4_4_123222322lb90pdws.R.inc(97368);return buildArray(m, 1.0);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public double[] getStartPoint() {try{__CLR4_4_123222322lb90pdws.R.inc(97369);
            __CLR4_4_123222322lb90pdws.R.inc(97370);return startParams.clone();
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        protected void setCostAccuracy(double costAccuracy) {try{__CLR4_4_123222322lb90pdws.R.inc(97371);
            __CLR4_4_123222322lb90pdws.R.inc(97372);this.costAccuracy = costAccuracy;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        protected void setParamsAccuracy(double paramsAccuracy) {try{__CLR4_4_123222322lb90pdws.R.inc(97373);
            __CLR4_4_123222322lb90pdws.R.inc(97374);this.paramsAccuracy = paramsAccuracy;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public int getN() {try{__CLR4_4_123222322lb90pdws.R.inc(97375);
            __CLR4_4_123222322lb90pdws.R.inc(97376);return startParams.length;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public void checkTheoreticalMinCost(double rms) {try{__CLR4_4_123222322lb90pdws.R.inc(97377);
            __CLR4_4_123222322lb90pdws.R.inc(97378);double threshold = costAccuracy * (1.0 + theoreticalMinCost);
            __CLR4_4_123222322lb90pdws.R.inc(97379);Assert.assertEquals(theoreticalMinCost, FastMath.sqrt(m) * rms, threshold);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public void checkTheoreticalMinParams(PointVectorValuePair optimum) {try{__CLR4_4_123222322lb90pdws.R.inc(97380);
            __CLR4_4_123222322lb90pdws.R.inc(97381);double[] params = optimum.getPointRef();
            __CLR4_4_123222322lb90pdws.R.inc(97382);if ((((theoreticalMinParams != null)&&(__CLR4_4_123222322lb90pdws.R.iget(97383)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97384)==0&false))) {{
                __CLR4_4_123222322lb90pdws.R.inc(97385);for (int i = 0; (((i < theoreticalMinParams.length)&&(__CLR4_4_123222322lb90pdws.R.iget(97386)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97387)==0&false)); ++i) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97388);double mi = theoreticalMinParams[i];
                    __CLR4_4_123222322lb90pdws.R.inc(97389);double vi = params[i];
                    __CLR4_4_123222322lb90pdws.R.inc(97390);Assert.assertEquals(mi, vi, paramsAccuracy * (1.0 + FastMath.abs(mi)));
                }
            }}
        }}finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public ModelFunction getModelFunction() {try{__CLR4_4_123222322lb90pdws.R.inc(97391);
            __CLR4_4_123222322lb90pdws.R.inc(97392);return new ModelFunction(new MultivariateVectorFunction() {
                    public double[] value(double[] point) {try{__CLR4_4_123222322lb90pdws.R.inc(97393);
                        __CLR4_4_123222322lb90pdws.R.inc(97394);return computeValue(point);
                    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
                });
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_123222322lb90pdws.R.inc(97395);
            __CLR4_4_123222322lb90pdws.R.inc(97396);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {try{__CLR4_4_123222322lb90pdws.R.inc(97397);
                        __CLR4_4_123222322lb90pdws.R.inc(97398);return computeJacobian(point);
                    }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
                });
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public abstract double[][] computeJacobian(double[] variables);
        public abstract double[] computeValue(double[] variables);
    }

    private static class LinearFullRankFunction extends MinpackFunction {
        public LinearFullRankFunction(int m, int n, double x0,
                                      double theoreticalStartCost,
                                      double theoreticalMinCost) {
            super(m, buildArray(n, x0), theoreticalMinCost,
                  buildArray(n, -1.0));__CLR4_4_123222322lb90pdws.R.inc(97400);try{__CLR4_4_123222322lb90pdws.R.inc(97399);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97401);
            __CLR4_4_123222322lb90pdws.R.inc(97402);double t = 2.0 / m;
            __CLR4_4_123222322lb90pdws.R.inc(97403);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97404);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97405)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97406)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97407);jacobian[i] = new double[n];
                __CLR4_4_123222322lb90pdws.R.inc(97408);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97409)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97410)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97411);jacobian[i][j] = ((((i == j) )&&(__CLR4_4_123222322lb90pdws.R.iget(97412)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97413)==0&false))? (1 - t) : -t;
                }
            }}
            }__CLR4_4_123222322lb90pdws.R.inc(97414);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97415);
            __CLR4_4_123222322lb90pdws.R.inc(97416);double sum = 0;
            __CLR4_4_123222322lb90pdws.R.inc(97417);for (int i = 0; (((i < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97418)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97419)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97420);sum += variables[i];
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97421);double t  = 1 + 2 * sum / m;
            __CLR4_4_123222322lb90pdws.R.inc(97422);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97423);for (int i = 0; (((i < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97424)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97425)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97426);f[i] = variables[i] - t;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97427);Arrays.fill(f, n, m, -t);
            __CLR4_4_123222322lb90pdws.R.inc(97428);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class LinearRank1Function extends MinpackFunction {
        public LinearRank1Function(int m, int n, double x0,
                                   double theoreticalStartCost,
                                   double theoreticalMinCost) {
            super(m, buildArray(n, x0), theoreticalMinCost, null);__CLR4_4_123222322lb90pdws.R.inc(97430);try{__CLR4_4_123222322lb90pdws.R.inc(97429);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97431);
            __CLR4_4_123222322lb90pdws.R.inc(97432);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97433);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97434)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97435)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97436);jacobian[i] = new double[n];
                __CLR4_4_123222322lb90pdws.R.inc(97437);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97438)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97439)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97440);jacobian[i][j] = (i + 1) * (j + 1);
                }
            }}
            }__CLR4_4_123222322lb90pdws.R.inc(97441);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97442);
            __CLR4_4_123222322lb90pdws.R.inc(97443);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97444);double sum = 0;
            __CLR4_4_123222322lb90pdws.R.inc(97445);for (int i = 0; (((i < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97446)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97447)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97448);sum += (i + 1) * variables[i];
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97449);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97450)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97451)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97452);f[i] = (i + 1) * sum - 1;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97453);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class LinearRank1ZeroColsAndRowsFunction extends MinpackFunction {
        public LinearRank1ZeroColsAndRowsFunction(int m, int n, double x0) {
            super(m, buildArray(n, x0),
                  FastMath.sqrt((m * (m + 3) - 6) / (2.0 * (2 * m - 3))),
                  null);__CLR4_4_123222322lb90pdws.R.inc(97455);try{__CLR4_4_123222322lb90pdws.R.inc(97454);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97456);
            __CLR4_4_123222322lb90pdws.R.inc(97457);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97458);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97459)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97460)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97461);jacobian[i] = new double[n];
                __CLR4_4_123222322lb90pdws.R.inc(97462);jacobian[i][0] = 0;
                __CLR4_4_123222322lb90pdws.R.inc(97463);for (int j = 1; (((j < (n - 1))&&(__CLR4_4_123222322lb90pdws.R.iget(97464)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97465)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97466);if ((((i == 0)&&(__CLR4_4_123222322lb90pdws.R.iget(97467)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97468)==0&false))) {{
                        __CLR4_4_123222322lb90pdws.R.inc(97469);jacobian[i][j] = 0;
                    } }else {__CLR4_4_123222322lb90pdws.R.inc(97470);if ((((i != (m - 1))&&(__CLR4_4_123222322lb90pdws.R.iget(97471)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97472)==0&false))) {{
                        __CLR4_4_123222322lb90pdws.R.inc(97473);jacobian[i][j] = i * (j + 1);
                    } }else {{
                        __CLR4_4_123222322lb90pdws.R.inc(97474);jacobian[i][j] = 0;
                    }
                }}}
                }__CLR4_4_123222322lb90pdws.R.inc(97475);jacobian[i][n - 1] = 0;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97476);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97477);
            __CLR4_4_123222322lb90pdws.R.inc(97478);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97479);double sum = 0;
            __CLR4_4_123222322lb90pdws.R.inc(97480);for (int i = 1; (((i < (n - 1))&&(__CLR4_4_123222322lb90pdws.R.iget(97481)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97482)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97483);sum += (i + 1) * variables[i];
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97484);for (int i = 0; (((i < (m - 1))&&(__CLR4_4_123222322lb90pdws.R.iget(97485)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97486)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97487);f[i] = i * sum - 1;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97488);f[m - 1] = -1;
            __CLR4_4_123222322lb90pdws.R.inc(97489);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class RosenbrockFunction extends MinpackFunction {
        public RosenbrockFunction(double[] startParams, double theoreticalStartCost) {
            super(2, startParams, 0.0, buildArray(2, 1.0));__CLR4_4_123222322lb90pdws.R.inc(97491);try{__CLR4_4_123222322lb90pdws.R.inc(97490);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97492);
            __CLR4_4_123222322lb90pdws.R.inc(97493);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97494);return new double[][] { { -20 * x1, 10 }, { -1, 0 } };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97495);
            __CLR4_4_123222322lb90pdws.R.inc(97496);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97497);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97498);return new double[] { 10 * (x2 - x1 * x1), 1 - x1 };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class HelicalValleyFunction extends MinpackFunction {
        public HelicalValleyFunction(double[] startParams,
                                     double theoreticalStartCost) {
            super(3, startParams, 0.0, new double[] { 1.0, 0.0, 0.0 });__CLR4_4_123222322lb90pdws.R.inc(97500);try{__CLR4_4_123222322lb90pdws.R.inc(97499);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97501);
            __CLR4_4_123222322lb90pdws.R.inc(97502);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97503);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97504);double tmpSquare = x1 * x1 + x2 * x2;
            __CLR4_4_123222322lb90pdws.R.inc(97505);double tmp1 = twoPi * tmpSquare;
            __CLR4_4_123222322lb90pdws.R.inc(97506);double tmp2 = FastMath.sqrt(tmpSquare);
            __CLR4_4_123222322lb90pdws.R.inc(97507);return new double[][] {
                {  100 * x2 / tmp1, -100 * x1 / tmp1, 10 },
                { 10 * x1 / tmp2, 10 * x2 / tmp2, 0 },
                { 0, 0, 1 }
            };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97508);
            __CLR4_4_123222322lb90pdws.R.inc(97509);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97510);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97511);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97512);double tmp1;
            __CLR4_4_123222322lb90pdws.R.inc(97513);if ((((x1 == 0)&&(__CLR4_4_123222322lb90pdws.R.iget(97514)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97515)==0&false))) {{
                __CLR4_4_123222322lb90pdws.R.inc(97516);tmp1 = ((((x2 >= 0) )&&(__CLR4_4_123222322lb90pdws.R.iget(97517)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97518)==0&false))? 0.25 : -0.25;
            } }else {{
                __CLR4_4_123222322lb90pdws.R.inc(97519);tmp1 = FastMath.atan(x2 / x1) / twoPi;
                __CLR4_4_123222322lb90pdws.R.inc(97520);if ((((x1 < 0)&&(__CLR4_4_123222322lb90pdws.R.iget(97521)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97522)==0&false))) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97523);tmp1 += 0.5;
                }
            }}
            }__CLR4_4_123222322lb90pdws.R.inc(97524);double tmp2 = FastMath.sqrt(x1 * x1 + x2 * x2);
            __CLR4_4_123222322lb90pdws.R.inc(97525);return new double[] {
                10.0 * (x3 - 10 * tmp1),
                10.0 * (tmp2 - 1),
                x3
            };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        private static final double twoPi = 2.0 * FastMath.PI;
    }

    private static class PowellSingularFunction extends MinpackFunction {
        public PowellSingularFunction(double[] startParams,
                                      double theoreticalStartCost) {
            super(4, startParams, 0.0, buildArray(4, 0.0));__CLR4_4_123222322lb90pdws.R.inc(97527);try{__CLR4_4_123222322lb90pdws.R.inc(97526);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97528);
            __CLR4_4_123222322lb90pdws.R.inc(97529);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97530);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97531);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97532);double x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97533);return new double[][] {
                { 1, 10, 0, 0 },
                { 0, 0, sqrt5, -sqrt5 },
                { 0, 2 * (x2 - 2 * x3), -4 * (x2 - 2 * x3), 0 },
                { 2 * sqrt10 * (x1 - x4), 0, 0, -2 * sqrt10 * (x1 - x4) }
            };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97534);
            __CLR4_4_123222322lb90pdws.R.inc(97535);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97536);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97537);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97538);double x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97539);return new double[] {
                x1 + 10 * x2,
                sqrt5 * (x3 - x4),
                (x2 - 2 * x3) * (x2 - 2 * x3),
                sqrt10 * (x1 - x4) * (x1 - x4)
            };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        private static final double sqrt5  = FastMath.sqrt( 5.0);
        private static final double sqrt10 = FastMath.sqrt(10.0);
  }

    private static class FreudensteinRothFunction extends MinpackFunction {
        public FreudensteinRothFunction(double[] startParams,
                                        double theoreticalStartCost,
                                        double theoreticalMinCost,
                                        double[] theoreticalMinParams) {
            super(2, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97541);try{__CLR4_4_123222322lb90pdws.R.inc(97540);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97542);
            __CLR4_4_123222322lb90pdws.R.inc(97543);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97544);return new double[][] {
                { 1, x2 * (10 - 3 * x2) -  2 },
                { 1, x2 * ( 2 + 3 * x2) - 14, }
            };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97545);
            __CLR4_4_123222322lb90pdws.R.inc(97546);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97547);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97548);return new double[] {
                -13.0 + x1 + ((5.0 - x2) * x2 -  2.0) * x2,
                -29.0 + x1 + ((1.0 + x2) * x2 - 14.0) * x2
            };
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class BardFunction extends MinpackFunction {
        public BardFunction(double x0,
                            double theoreticalStartCost,
                            double theoreticalMinCost,
                            double[] theoreticalMinParams) {
            super(15, buildArray(3, x0), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97550);try{__CLR4_4_123222322lb90pdws.R.inc(97549);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97551);
            __CLR4_4_123222322lb90pdws.R.inc(97552);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97553);double   x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97554);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97555);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97556)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97557)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97558);double tmp1 = i  + 1;
                __CLR4_4_123222322lb90pdws.R.inc(97559);double tmp2 = 15 - i;
                __CLR4_4_123222322lb90pdws.R.inc(97560);double tmp3 = ((((i <= 7) )&&(__CLR4_4_123222322lb90pdws.R.iget(97561)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97562)==0&false))? tmp1 : tmp2;
                __CLR4_4_123222322lb90pdws.R.inc(97563);double tmp4 = x2 * tmp2 + x3 * tmp3;
                __CLR4_4_123222322lb90pdws.R.inc(97564);tmp4 *= tmp4;
                __CLR4_4_123222322lb90pdws.R.inc(97565);jacobian[i] = new double[] { -1, tmp1 * tmp2 / tmp4, tmp1 * tmp3 / tmp4 };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97566);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97567);
            __CLR4_4_123222322lb90pdws.R.inc(97568);double   x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97569);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97570);double   x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97571);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97572);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97573)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97574)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97575);double tmp1 = i + 1;
                __CLR4_4_123222322lb90pdws.R.inc(97576);double tmp2 = 15 - i;
                __CLR4_4_123222322lb90pdws.R.inc(97577);double tmp3 = ((((i <= 7) )&&(__CLR4_4_123222322lb90pdws.R.iget(97578)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97579)==0&false))? tmp1 : tmp2;
                __CLR4_4_123222322lb90pdws.R.inc(97580);f[i] = y[i] - (x1 + tmp1 / (x2 * tmp2 + x3 * tmp3));
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97581);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        private static final double[] y = {
            0.14, 0.18, 0.22, 0.25, 0.29,
            0.32, 0.35, 0.39, 0.37, 0.58,
            0.73, 0.96, 1.34, 2.10, 4.39
        };
    }

    private static class KowalikOsborneFunction extends MinpackFunction {
        public KowalikOsborneFunction(double[] startParams,
                                      double theoreticalStartCost,
                                      double theoreticalMinCost,
                                      double[] theoreticalMinParams) {
            super(11, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97583);try{__CLR4_4_123222322lb90pdws.R.inc(97582);
            __CLR4_4_123222322lb90pdws.R.inc(97584);if ((((theoreticalStartCost > 20.0)&&(__CLR4_4_123222322lb90pdws.R.iget(97585)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97586)==0&false))) {{
                __CLR4_4_123222322lb90pdws.R.inc(97587);setCostAccuracy(2.0e-4);
                __CLR4_4_123222322lb90pdws.R.inc(97588);setParamsAccuracy(5.0e-3);
            }
        }}finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97589);
            __CLR4_4_123222322lb90pdws.R.inc(97590);double   x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97591);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97592);double   x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97593);double   x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97594);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97595);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97596)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97597)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97598);double tmp = v[i] * (v[i] + x3) + x4;
                __CLR4_4_123222322lb90pdws.R.inc(97599);double j1  = -v[i] * (v[i] + x2) / tmp;
                __CLR4_4_123222322lb90pdws.R.inc(97600);double j2  = -v[i] * x1 / tmp;
                __CLR4_4_123222322lb90pdws.R.inc(97601);double j3  = j1 * j2;
                __CLR4_4_123222322lb90pdws.R.inc(97602);double j4  = j3 / v[i];
                __CLR4_4_123222322lb90pdws.R.inc(97603);jacobian[i] = new double[] { j1, j2, j3, j4 };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97604);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97605);
            __CLR4_4_123222322lb90pdws.R.inc(97606);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97607);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97608);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97609);double x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97610);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97611);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97612)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97613)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97614);f[i] = y[i] - x1 * (v[i] * (v[i] + x2)) / (v[i] * (v[i] + x3) + x4);
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97615);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        private static final double[] v = {
            4.0, 2.0, 1.0, 0.5, 0.25, 0.167, 0.125, 0.1, 0.0833, 0.0714, 0.0625
        };

        private static final double[] y = {
            0.1957, 0.1947, 0.1735, 0.1600, 0.0844, 0.0627,
            0.0456, 0.0342, 0.0323, 0.0235, 0.0246
        };
    }

    private static class MeyerFunction extends MinpackFunction {
        public MeyerFunction(double[] startParams,
                             double theoreticalStartCost,
                             double theoreticalMinCost,
                             double[] theoreticalMinParams) {
            super(16, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97617);try{__CLR4_4_123222322lb90pdws.R.inc(97616);
            __CLR4_4_123222322lb90pdws.R.inc(97618);if ((((theoreticalStartCost > 1.0e6)&&(__CLR4_4_123222322lb90pdws.R.iget(97619)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97620)==0&false))) {{
                __CLR4_4_123222322lb90pdws.R.inc(97621);setCostAccuracy(7.0e-3);
                __CLR4_4_123222322lb90pdws.R.inc(97622);setParamsAccuracy(2.0e-2);
            }
        }}finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97623);
            __CLR4_4_123222322lb90pdws.R.inc(97624);double   x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97625);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97626);double   x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97627);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97628);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97629)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97630)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97631);double temp = 5.0 * (i + 1) + 45.0 + x3;
                __CLR4_4_123222322lb90pdws.R.inc(97632);double tmp1 = x2 / temp;
                __CLR4_4_123222322lb90pdws.R.inc(97633);double tmp2 = FastMath.exp(tmp1);
                __CLR4_4_123222322lb90pdws.R.inc(97634);double tmp3 = x1 * tmp2 / temp;
                __CLR4_4_123222322lb90pdws.R.inc(97635);jacobian[i] = new double[] { tmp2, tmp3, -tmp1 * tmp3 };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97636);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97637);
            __CLR4_4_123222322lb90pdws.R.inc(97638);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97639);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97640);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97641);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97642);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97643)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97644)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97645);f[i] = x1 * FastMath.exp(x2 / (5.0 * (i + 1) + 45.0 + x3)) - y[i];
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97646);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        private static final double[] y = {
            34780.0, 28610.0, 23650.0, 19630.0,
            16370.0, 13720.0, 11540.0,  9744.0,
            8261.0,  7030.0,  6005.0,  5147.0,
            4427.0,  3820.0,  3307.0,  2872.0
        };
    }

    private static class WatsonFunction extends MinpackFunction {
        public WatsonFunction(int n, double x0,
                              double theoreticalStartCost,
                              double theoreticalMinCost,
                              double[] theoreticalMinParams) {
            super(31, buildArray(n, x0), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97648);try{__CLR4_4_123222322lb90pdws.R.inc(97647);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97649);
            __CLR4_4_123222322lb90pdws.R.inc(97650);double[][] jacobian = new double[m][];

            __CLR4_4_123222322lb90pdws.R.inc(97651);for (int i = 0; (((i < (m - 2))&&(__CLR4_4_123222322lb90pdws.R.iget(97652)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97653)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97654);double div = (i + 1) / 29.0;
                __CLR4_4_123222322lb90pdws.R.inc(97655);double s2  = 0.0;
                __CLR4_4_123222322lb90pdws.R.inc(97656);double dx  = 1.0;
                __CLR4_4_123222322lb90pdws.R.inc(97657);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97658)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97659)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97660);s2 += dx * variables[j];
                    __CLR4_4_123222322lb90pdws.R.inc(97661);dx *= div;
                }
                }__CLR4_4_123222322lb90pdws.R.inc(97662);double temp= 2 * div * s2;
                __CLR4_4_123222322lb90pdws.R.inc(97663);dx = 1.0 / div;
                __CLR4_4_123222322lb90pdws.R.inc(97664);jacobian[i] = new double[n];
                __CLR4_4_123222322lb90pdws.R.inc(97665);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97666)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97667)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97668);jacobian[i][j] = dx * (j - temp);
                    __CLR4_4_123222322lb90pdws.R.inc(97669);dx *= div;
                }
            }}

            }__CLR4_4_123222322lb90pdws.R.inc(97670);jacobian[m - 2]    = new double[n];
            __CLR4_4_123222322lb90pdws.R.inc(97671);jacobian[m - 2][0] = 1;

            __CLR4_4_123222322lb90pdws.R.inc(97672);jacobian[m - 1]   = new double[n];
            __CLR4_4_123222322lb90pdws.R.inc(97673);jacobian[m - 1][0]= -2 * variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97674);jacobian[m - 1][1]= 1;

            __CLR4_4_123222322lb90pdws.R.inc(97675);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97676);
            __CLR4_4_123222322lb90pdws.R.inc(97677);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97678);for (int i = 0; (((i < (m - 2))&&(__CLR4_4_123222322lb90pdws.R.iget(97679)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97680)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97681);double div = (i + 1) / 29.0;
                __CLR4_4_123222322lb90pdws.R.inc(97682);double s1 = 0;
                __CLR4_4_123222322lb90pdws.R.inc(97683);double dx = 1;
                __CLR4_4_123222322lb90pdws.R.inc(97684);for (int j = 1; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97685)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97686)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97687);s1 += j * dx * variables[j];
                    __CLR4_4_123222322lb90pdws.R.inc(97688);dx *= div;
                }
                }__CLR4_4_123222322lb90pdws.R.inc(97689);double s2 = 0;
                __CLR4_4_123222322lb90pdws.R.inc(97690);dx = 1;
                __CLR4_4_123222322lb90pdws.R.inc(97691);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97692)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97693)==0&false)); ++j) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97694);s2 += dx * variables[j];
                    __CLR4_4_123222322lb90pdws.R.inc(97695);dx *= div;
                }
                }__CLR4_4_123222322lb90pdws.R.inc(97696);f[i] = s1 - s2 * s2 - 1;
            }

            }__CLR4_4_123222322lb90pdws.R.inc(97697);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97698);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97699);f[m - 2] = x1;
            __CLR4_4_123222322lb90pdws.R.inc(97700);f[m - 1] = x2 - x1 * x1 - 1;

            __CLR4_4_123222322lb90pdws.R.inc(97701);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class Box3DimensionalFunction extends MinpackFunction {
        public Box3DimensionalFunction(int m, double[] startParams,
                                       double theoreticalStartCost) {
            super(m, startParams, 0.0,
                  new double[] { 1.0, 10.0, 1.0 });__CLR4_4_123222322lb90pdws.R.inc(97703);try{__CLR4_4_123222322lb90pdws.R.inc(97702);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97704);
            __CLR4_4_123222322lb90pdws.R.inc(97705);double   x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97706);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97707);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97708);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97709)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97710)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97711);double tmp = (i + 1) / 10.0;
                __CLR4_4_123222322lb90pdws.R.inc(97712);jacobian[i] = new double[] {
                    -tmp * FastMath.exp(-tmp * x1),
                    tmp * FastMath.exp(-tmp * x2),
                    FastMath.exp(-i - 1) - FastMath.exp(-tmp)
                };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97713);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97714);
            __CLR4_4_123222322lb90pdws.R.inc(97715);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97716);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97717);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97718);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97719);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97720)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97721)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97722);double tmp = (i + 1) / 10.0;
                __CLR4_4_123222322lb90pdws.R.inc(97723);f[i] = FastMath.exp(-tmp * x1) - FastMath.exp(-tmp * x2)
                    + (FastMath.exp(-i - 1) - FastMath.exp(-tmp)) * x3;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97724);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class JennrichSampsonFunction extends MinpackFunction {
        public JennrichSampsonFunction(int m, double[] startParams,
                                       double theoreticalStartCost,
                                       double theoreticalMinCost,
                                       double[] theoreticalMinParams) {
            super(m, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97726);try{__CLR4_4_123222322lb90pdws.R.inc(97725);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97727);
            __CLR4_4_123222322lb90pdws.R.inc(97728);double   x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97729);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97730);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97731);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97732)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97733)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97734);double t = i + 1;
                __CLR4_4_123222322lb90pdws.R.inc(97735);jacobian[i] = new double[] { -t * FastMath.exp(t * x1), -t * FastMath.exp(t * x2) };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97736);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97737);
            __CLR4_4_123222322lb90pdws.R.inc(97738);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97739);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97740);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97741);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97742)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97743)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97744);double temp = i + 1;
                __CLR4_4_123222322lb90pdws.R.inc(97745);f[i] = 2 + 2 * temp - FastMath.exp(temp * x1) - FastMath.exp(temp * x2);
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97746);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class BrownDennisFunction extends MinpackFunction {
        public BrownDennisFunction(int m, double[] startParams,
                                   double theoreticalStartCost,
                                   double theoreticalMinCost,
                                   double[] theoreticalMinParams) {
            super(m, startParams, theoreticalMinCost,
                theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97748);try{__CLR4_4_123222322lb90pdws.R.inc(97747);
            __CLR4_4_123222322lb90pdws.R.inc(97749);setCostAccuracy(2.5e-8);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97750);
            __CLR4_4_123222322lb90pdws.R.inc(97751);double   x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97752);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97753);double   x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97754);double   x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97755);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97756);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97757)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97758)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97759);double temp = (i + 1) / 5.0;
                __CLR4_4_123222322lb90pdws.R.inc(97760);double ti   = FastMath.sin(temp);
                __CLR4_4_123222322lb90pdws.R.inc(97761);double tmp1 = x1 + temp * x2 - FastMath.exp(temp);
                __CLR4_4_123222322lb90pdws.R.inc(97762);double tmp2 = x3 + ti   * x4 - FastMath.cos(temp);
                __CLR4_4_123222322lb90pdws.R.inc(97763);jacobian[i] = new double[] {
                    2 * tmp1, 2 * temp * tmp1, 2 * tmp2, 2 * ti * tmp2
                };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97764);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97765);
            __CLR4_4_123222322lb90pdws.R.inc(97766);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97767);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97768);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97769);double x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97770);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97771);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97772)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97773)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97774);double temp = (i + 1) / 5.0;
                __CLR4_4_123222322lb90pdws.R.inc(97775);double tmp1 = x1 + temp * x2 - FastMath.exp(temp);
                __CLR4_4_123222322lb90pdws.R.inc(97776);double tmp2 = x3 + FastMath.sin(temp) * x4 - FastMath.cos(temp);
                __CLR4_4_123222322lb90pdws.R.inc(97777);f[i] = tmp1 * tmp1 + tmp2 * tmp2;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97778);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class ChebyquadFunction extends MinpackFunction {
        private static double[] buildChebyquadArray(int n, double factor) {try{__CLR4_4_123222322lb90pdws.R.inc(97779);
            __CLR4_4_123222322lb90pdws.R.inc(97780);double[] array = new double[n];
            __CLR4_4_123222322lb90pdws.R.inc(97781);double inv = factor / (n + 1);
            __CLR4_4_123222322lb90pdws.R.inc(97782);for (int i = 0; (((i < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97783)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97784)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97785);array[i] = (i + 1) * inv;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97786);return array;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        public ChebyquadFunction(int n, int m, double factor,
                                 double theoreticalStartCost,
                                 double theoreticalMinCost,
                                 double[] theoreticalMinParams) {
            super(m, buildChebyquadArray(n, factor), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97788);try{__CLR4_4_123222322lb90pdws.R.inc(97787);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97789);
            __CLR4_4_123222322lb90pdws.R.inc(97790);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97791);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97792)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97793)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97794);jacobian[i] = new double[n];
            }

            }__CLR4_4_123222322lb90pdws.R.inc(97795);double dx = 1.0 / n;
            __CLR4_4_123222322lb90pdws.R.inc(97796);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97797)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97798)==0&false)); ++j) {{
                __CLR4_4_123222322lb90pdws.R.inc(97799);double tmp1 = 1;
                __CLR4_4_123222322lb90pdws.R.inc(97800);double tmp2 = 2 * variables[j] - 1;
                __CLR4_4_123222322lb90pdws.R.inc(97801);double temp = 2 * tmp2;
                __CLR4_4_123222322lb90pdws.R.inc(97802);double tmp3 = 0;
                __CLR4_4_123222322lb90pdws.R.inc(97803);double tmp4 = 2;
                __CLR4_4_123222322lb90pdws.R.inc(97804);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97805)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97806)==0&false)); ++i) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97807);jacobian[i][j] = dx * tmp4;
                    __CLR4_4_123222322lb90pdws.R.inc(97808);double ti = 4 * tmp2 + temp * tmp4 - tmp3;
                    __CLR4_4_123222322lb90pdws.R.inc(97809);tmp3 = tmp4;
                    __CLR4_4_123222322lb90pdws.R.inc(97810);tmp4 = ti;
                    __CLR4_4_123222322lb90pdws.R.inc(97811);ti   = temp * tmp2 - tmp1;
                    __CLR4_4_123222322lb90pdws.R.inc(97812);tmp1 = tmp2;
                    __CLR4_4_123222322lb90pdws.R.inc(97813);tmp2 = ti;
                }
            }}

            }__CLR4_4_123222322lb90pdws.R.inc(97814);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97815);
            __CLR4_4_123222322lb90pdws.R.inc(97816);double[] f = new double[m];

            __CLR4_4_123222322lb90pdws.R.inc(97817);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97818)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97819)==0&false)); ++j) {{
                __CLR4_4_123222322lb90pdws.R.inc(97820);double tmp1 = 1;
                __CLR4_4_123222322lb90pdws.R.inc(97821);double tmp2 = 2 * variables[j] - 1;
                __CLR4_4_123222322lb90pdws.R.inc(97822);double temp = 2 * tmp2;
                __CLR4_4_123222322lb90pdws.R.inc(97823);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97824)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97825)==0&false)); ++i) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97826);f[i] += tmp2;
                    __CLR4_4_123222322lb90pdws.R.inc(97827);double ti = temp * tmp2 - tmp1;
                    __CLR4_4_123222322lb90pdws.R.inc(97828);tmp1 = tmp2;
                    __CLR4_4_123222322lb90pdws.R.inc(97829);tmp2 = ti;
                }
            }}

            }__CLR4_4_123222322lb90pdws.R.inc(97830);double dx = 1.0 / n;
            __CLR4_4_123222322lb90pdws.R.inc(97831);boolean iev = false;
            __CLR4_4_123222322lb90pdws.R.inc(97832);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97833)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97834)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97835);f[i] *= dx;
                __CLR4_4_123222322lb90pdws.R.inc(97836);if ((((iev)&&(__CLR4_4_123222322lb90pdws.R.iget(97837)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97838)==0&false))) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97839);f[i] += 1.0 / (i * (i + 2));
                }
                }__CLR4_4_123222322lb90pdws.R.inc(97840);iev = ! iev;
            }

            }__CLR4_4_123222322lb90pdws.R.inc(97841);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class BrownAlmostLinearFunction extends MinpackFunction {
        public BrownAlmostLinearFunction(int m, double factor,
                                         double theoreticalStartCost,
                                         double theoreticalMinCost,
                                         double[] theoreticalMinParams) {
            super(m, buildArray(m, factor), theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97843);try{__CLR4_4_123222322lb90pdws.R.inc(97842);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97844);
            __CLR4_4_123222322lb90pdws.R.inc(97845);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97846);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97847)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97848)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97849);jacobian[i] = new double[n];
            }

            }__CLR4_4_123222322lb90pdws.R.inc(97850);double prod = 1;
            __CLR4_4_123222322lb90pdws.R.inc(97851);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97852)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97853)==0&false)); ++j) {{
                __CLR4_4_123222322lb90pdws.R.inc(97854);prod *= variables[j];
                __CLR4_4_123222322lb90pdws.R.inc(97855);for (int i = 0; (((i < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97856)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97857)==0&false)); ++i) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97858);jacobian[i][j] = 1;
                }
                }__CLR4_4_123222322lb90pdws.R.inc(97859);jacobian[j][j] = 2;
            }

            }__CLR4_4_123222322lb90pdws.R.inc(97860);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97861)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97862)==0&false)); ++j) {{
                __CLR4_4_123222322lb90pdws.R.inc(97863);double temp = variables[j];
                __CLR4_4_123222322lb90pdws.R.inc(97864);if ((((temp == 0)&&(__CLR4_4_123222322lb90pdws.R.iget(97865)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97866)==0&false))) {{
                    __CLR4_4_123222322lb90pdws.R.inc(97867);temp = 1;
                    __CLR4_4_123222322lb90pdws.R.inc(97868);prod = 1;
                    __CLR4_4_123222322lb90pdws.R.inc(97869);for (int k = 0; (((k < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97870)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97871)==0&false)); ++k) {{
                        __CLR4_4_123222322lb90pdws.R.inc(97872);if ((((k != j)&&(__CLR4_4_123222322lb90pdws.R.iget(97873)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97874)==0&false))) {{
                            __CLR4_4_123222322lb90pdws.R.inc(97875);prod *= variables[k];
                        }
                    }}
                }}
                }__CLR4_4_123222322lb90pdws.R.inc(97876);jacobian[n - 1][j] = prod / temp;
            }

            }__CLR4_4_123222322lb90pdws.R.inc(97877);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97878);
            __CLR4_4_123222322lb90pdws.R.inc(97879);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97880);double sum  = -(n + 1);
            __CLR4_4_123222322lb90pdws.R.inc(97881);double prod = 1;
            __CLR4_4_123222322lb90pdws.R.inc(97882);for (int j = 0; (((j < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97883)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97884)==0&false)); ++j) {{
                __CLR4_4_123222322lb90pdws.R.inc(97885);sum  += variables[j];
                __CLR4_4_123222322lb90pdws.R.inc(97886);prod *= variables[j];
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97887);for (int i = 0; (((i < n)&&(__CLR4_4_123222322lb90pdws.R.iget(97888)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97889)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97890);f[i] = variables[i] + sum;
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97891);f[n - 1] = prod - 1;
            __CLR4_4_123222322lb90pdws.R.inc(97892);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
    }

    private static class Osborne1Function extends MinpackFunction {
        public Osborne1Function(double[] startParams,
                                double theoreticalStartCost,
                                double theoreticalMinCost,
                                double[] theoreticalMinParams) {
            super(33, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97894);try{__CLR4_4_123222322lb90pdws.R.inc(97893);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97895);
            __CLR4_4_123222322lb90pdws.R.inc(97896);double   x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97897);double   x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97898);double   x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97899);double   x5 = variables[4];
            __CLR4_4_123222322lb90pdws.R.inc(97900);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97901);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97902)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97903)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97904);double temp = 10.0 * i;
                __CLR4_4_123222322lb90pdws.R.inc(97905);double tmp1 = FastMath.exp(-temp * x4);
                __CLR4_4_123222322lb90pdws.R.inc(97906);double tmp2 = FastMath.exp(-temp * x5);
                __CLR4_4_123222322lb90pdws.R.inc(97907);jacobian[i] = new double[] {
                    -1, -tmp1, -tmp2, temp * x2 * tmp1, temp * x3 * tmp2
                };
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97908);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97909);
            __CLR4_4_123222322lb90pdws.R.inc(97910);double x1 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97911);double x2 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97912);double x3 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97913);double x4 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97914);double x5 = variables[4];
            __CLR4_4_123222322lb90pdws.R.inc(97915);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97916);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97917)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97918)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97919);double temp = 10.0 * i;
                __CLR4_4_123222322lb90pdws.R.inc(97920);double tmp1 = FastMath.exp(-temp * x4);
                __CLR4_4_123222322lb90pdws.R.inc(97921);double tmp2 = FastMath.exp(-temp * x5);
                __CLR4_4_123222322lb90pdws.R.inc(97922);f[i] = y[i] - (x1 + x2 * tmp1 + x3 * tmp2);
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97923);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}
        
        private static final double[] y = {
            0.844, 0.908, 0.932, 0.936, 0.925, 0.908, 0.881, 0.850, 0.818, 0.784, 0.751,
            0.718, 0.685, 0.658, 0.628, 0.603, 0.580, 0.558, 0.538, 0.522, 0.506, 0.490,
            0.478, 0.467, 0.457, 0.448, 0.438, 0.431, 0.424, 0.420, 0.414, 0.411, 0.406
        };
    }

    private static class Osborne2Function extends MinpackFunction {
        public Osborne2Function(double[] startParams,
                                double theoreticalStartCost,
                                double theoreticalMinCost,
                                double[] theoreticalMinParams) {
            super(65, startParams, theoreticalMinCost,
                  theoreticalMinParams);__CLR4_4_123222322lb90pdws.R.inc(97925);try{__CLR4_4_123222322lb90pdws.R.inc(97924);
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[][] computeJacobian(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97926);
            __CLR4_4_123222322lb90pdws.R.inc(97927);double   x01 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97928);double   x02 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97929);double   x03 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97930);double   x04 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97931);double   x05 = variables[4];
            __CLR4_4_123222322lb90pdws.R.inc(97932);double   x06 = variables[5];
            __CLR4_4_123222322lb90pdws.R.inc(97933);double   x07 = variables[6];
            __CLR4_4_123222322lb90pdws.R.inc(97934);double   x08 = variables[7];
            __CLR4_4_123222322lb90pdws.R.inc(97935);double   x09 = variables[8];
            __CLR4_4_123222322lb90pdws.R.inc(97936);double   x10 = variables[9];
            __CLR4_4_123222322lb90pdws.R.inc(97937);double   x11 = variables[10];
            __CLR4_4_123222322lb90pdws.R.inc(97938);double[][] jacobian = new double[m][];
            __CLR4_4_123222322lb90pdws.R.inc(97939);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97940)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97941)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97942);double temp = i / 10.0;
                __CLR4_4_123222322lb90pdws.R.inc(97943);double tmp1 = FastMath.exp(-x05 * temp);
                __CLR4_4_123222322lb90pdws.R.inc(97944);double tmp2 = FastMath.exp(-x06 * (temp - x09) * (temp - x09));
                __CLR4_4_123222322lb90pdws.R.inc(97945);double tmp3 = FastMath.exp(-x07 * (temp - x10) * (temp - x10));
                __CLR4_4_123222322lb90pdws.R.inc(97946);double tmp4 = FastMath.exp(-x08 * (temp - x11) * (temp - x11));
                __CLR4_4_123222322lb90pdws.R.inc(97947);jacobian[i] = new double[] {
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
            }__CLR4_4_123222322lb90pdws.R.inc(97948);return jacobian;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

        @Override
        public double[] computeValue(double[] variables) {try{__CLR4_4_123222322lb90pdws.R.inc(97949);
            __CLR4_4_123222322lb90pdws.R.inc(97950);double x01 = variables[0];
            __CLR4_4_123222322lb90pdws.R.inc(97951);double x02 = variables[1];
            __CLR4_4_123222322lb90pdws.R.inc(97952);double x03 = variables[2];
            __CLR4_4_123222322lb90pdws.R.inc(97953);double x04 = variables[3];
            __CLR4_4_123222322lb90pdws.R.inc(97954);double x05 = variables[4];
            __CLR4_4_123222322lb90pdws.R.inc(97955);double x06 = variables[5];
            __CLR4_4_123222322lb90pdws.R.inc(97956);double x07 = variables[6];
            __CLR4_4_123222322lb90pdws.R.inc(97957);double x08 = variables[7];
            __CLR4_4_123222322lb90pdws.R.inc(97958);double x09 = variables[8];
            __CLR4_4_123222322lb90pdws.R.inc(97959);double x10 = variables[9];
            __CLR4_4_123222322lb90pdws.R.inc(97960);double x11 = variables[10];
            __CLR4_4_123222322lb90pdws.R.inc(97961);double[] f = new double[m];
            __CLR4_4_123222322lb90pdws.R.inc(97962);for (int i = 0; (((i < m)&&(__CLR4_4_123222322lb90pdws.R.iget(97963)!=0|true))||(__CLR4_4_123222322lb90pdws.R.iget(97964)==0&false)); ++i) {{
                __CLR4_4_123222322lb90pdws.R.inc(97965);double temp = i / 10.0;
                __CLR4_4_123222322lb90pdws.R.inc(97966);double tmp1 = FastMath.exp(-x05 * temp);
                __CLR4_4_123222322lb90pdws.R.inc(97967);double tmp2 = FastMath.exp(-x06 * (temp - x09) * (temp - x09));
                __CLR4_4_123222322lb90pdws.R.inc(97968);double tmp3 = FastMath.exp(-x07 * (temp - x10) * (temp - x10));
                __CLR4_4_123222322lb90pdws.R.inc(97969);double tmp4 = FastMath.exp(-x08 * (temp - x11) * (temp - x11));
                __CLR4_4_123222322lb90pdws.R.inc(97970);f[i] = y[i] - (x01 * tmp1 + x02 * tmp2 + x03 * tmp3 + x04 * tmp4);
            }
            }__CLR4_4_123222322lb90pdws.R.inc(97971);return f;
        }finally{__CLR4_4_123222322lb90pdws.R.flushNeeded();}}

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
