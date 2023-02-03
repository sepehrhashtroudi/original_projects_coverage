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

package org.apache.commons.math3.optimization.general;

import java.io.Serializable;
import java.util.Arrays;


import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.optimization.PointVectorValuePair;
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
public class MinpackTest {static class __CLR4_4_125x925x9lb90pe3b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,101423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testMinpackLinearFullRank() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),100989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19pva8w25x9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackLinearFullRank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19pva8w25x9(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(100989);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100990);minpackTest(new LinearFullRankFunction(10, 5, 1.0,
                                           5.0, 2.23606797749979), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100991);minpackTest(new LinearFullRankFunction(50, 5, 1.0,
                                           8.06225774829855, 6.70820393249937), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackLinearRank1() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),100992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t15uoe25xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackLinearRank1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t15uoe25xc(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(100992);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100993);minpackTest(new LinearRank1Function(10, 5, 1.0,
                                        291.521868819476, 1.4638501094228), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100994);minpackTest(new LinearRank1Function(50, 5, 1.0,
                                        3101.60039334535, 3.48263016573496), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackLinearRank1ZeroColsAndRows() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),100995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vovekr25xf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackLinearRank1ZeroColsAndRows",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vovekr25xf(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(100995);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100996);minpackTest(new LinearRank1ZeroColsAndRowsFunction(10, 5, 1.0), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100997);minpackTest(new LinearRank1ZeroColsAndRowsFunction(50, 5, 1.0), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackRosenbrok() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),100998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnjetj25xi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackRosenbrok",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),100998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnjetj25xi(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(100998);
    __CLR4_4_125x925x9lb90pe3b.R.inc(100999);minpackTest(new RosenbrockFunction(new double[] { -1.2, 1.0 },
                                       FastMath.sqrt(24.2)), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101000);minpackTest(new RosenbrockFunction(new double[] { -12.0, 10.0 },
                                       FastMath.sqrt(1795769.0)), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101001);minpackTest(new RosenbrockFunction(new double[] { -120.0, 100.0 },
                                       11.0 * FastMath.sqrt(169000121.0)), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackHelicalValley() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wcfkx25xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackHelicalValley",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wcfkx25xm(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101002);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101003);minpackTest(new HelicalValleyFunction(new double[] { -1.0, 0.0, 0.0 },
                                          50.0), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101004);minpackTest(new HelicalValleyFunction(new double[] { -10.0, 0.0, 0.0 },
                                          102.95630140987), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101005);minpackTest(new HelicalValleyFunction(new double[] { -100.0, 0.0, 0.0},
                                          991.261822123701), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackPowellSingular() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwfzt025xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackPowellSingular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwfzt025xq(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101006);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101007);minpackTest(new PowellSingularFunction(new double[] { 3.0, -1.0, 0.0, 1.0 },
                                           14.6628782986152), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101008);minpackTest(new PowellSingularFunction(new double[] { 30.0, -10.0, 0.0, 10.0 },
                                           1270.9838708654), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101009);minpackTest(new PowellSingularFunction(new double[] { 300.0, -100.0, 0.0, 100.0 },
                                           126887.903284750), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackFreudensteinRoth() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qix62x25xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackFreudensteinRoth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qix62x25xu(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101010);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101011);minpackTest(new FreudensteinRothFunction(new double[] { 0.5, -2.0 },
                                             20.0124960961895, 6.99887517584575,
                                             new double[] {
                                               11.4124844654993,
                                               -0.896827913731509
                                             }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101012);minpackTest(new FreudensteinRothFunction(new double[] { 5.0, -20.0 },
                                             12432.833948863, 6.9988751744895,
                                             new double[] {
                                                11.41300466147456,
                                                -0.896796038685959
                                             }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101013);minpackTest(new FreudensteinRothFunction(new double[] { 50.0, -200.0 },
                                             11426454.595762, 6.99887517242903,
                                             new double[] {
                                                 11.412781785788564,
                                                 -0.8968051074920405
                                             }), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackBard() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kddxt25xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackBard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kddxt25xy(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101014);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101015);minpackTest(new BardFunction(1.0, 6.45613629515967, 0.0906359603390466,
                                 new double[] {
                                   0.0824105765758334,
                                   1.1330366534715,
                                   2.34369463894115
                                 }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101016);minpackTest(new BardFunction(10.0, 36.1418531596785, 4.17476870138539,
                                 new double[] {
                                   0.840666673818329,
                                   -158848033.259565,
                                   -164378671.653535
                                 }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101017);minpackTest(new BardFunction(100.0, 384.114678637399, 4.17476870135969,
                                 new double[] {
                                   0.840666673867645,
                                   -158946167.205518,
                                   -164464906.857771
                                 }), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackKowalikOsborne() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16etpew25y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackKowalikOsborne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16etpew25y2(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101018);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101019);minpackTest(new KowalikOsborneFunction(new double[] { 0.25, 0.39, 0.415, 0.39 },
                                           0.0728915102882945,
                                           0.017535837721129,
                                           new double[] {
                                             0.192807810476249,
                                             0.191262653354071,
                                             0.123052801046931,
                                             0.136053221150517
                                           }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101020);minpackTest(new KowalikOsborneFunction(new double[] { 2.5, 3.9, 4.15, 3.9 },
                                           2.97937007555202,
                                           0.032052192917937,
                                           new double[] {
                                             728675.473768287,
                                             -14.0758803129393,
                                             -32977797.7841797,
                                             -20571594.1977912
                                           }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101021);minpackTest(new KowalikOsborneFunction(new double[] { 25.0, 39.0, 41.5, 39.0 },
                                           29.9590617016037,
                                           0.0175364017658228,
                                           new double[] {
                                             0.192948328597594,
                                             0.188053165007911,
                                             0.122430604321144,
                                             0.134575665392506
                                           }), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackMeyer() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qa0as25y6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackMeyer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qa0as25y6(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101022);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101023);minpackTest(new MeyerFunction(new double[] { 0.02, 4000.0, 250.0 },
                                  41153.4665543031, 9.37794514651874,
                                  new double[] {
                                    0.00560963647102661,
                                    6181.34634628659,
                                    345.223634624144
                                  }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101024);minpackTest(new MeyerFunction(new double[] { 0.2, 40000.0, 2500.0 },
                                  4168216.89130846, 792.917871779501,
                                  new double[] {
                                    1.42367074157994e-11,
                                    33695.7133432541,
                                    901.268527953801
                                  }), true);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackWatson() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17b2kiw25y9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackWatson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17b2kiw25y9(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101025);

    __CLR4_4_125x925x9lb90pe3b.R.inc(101026);minpackTest(new WatsonFunction(6, 0.0,
                                   5.47722557505166, 0.0478295939097601,
                                   new double[] {
                                     -0.0157249615083782, 1.01243488232965,
                                     -0.232991722387673,  1.26043101102818,
                                     -1.51373031394421,   0.99299727291842
                                   }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101027);minpackTest(new WatsonFunction(6, 10.0,
                                   6433.12578950026, 0.0478295939096951,
                                   new double[] {
                                     -0.0157251901386677, 1.01243485860105,
                                     -0.232991545843829,  1.26042932089163,
                                     -1.51372776706575,   0.99299573426328
                                   }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101028);minpackTest(new WatsonFunction(6, 100.0,
                                   674256.040605213, 0.047829593911544,
                                   new double[] {
                                    -0.0157247019712586, 1.01243490925658,
                                    -0.232991922761641,  1.26043292929555,
                                    -1.51373320452707,   0.99299901922322
                                   }), false);

    __CLR4_4_125x925x9lb90pe3b.R.inc(101029);minpackTest(new WatsonFunction(9, 0.0,
                                   5.47722557505166, 0.00118311459212420,
                                   new double[] {
                                    -0.153070644166722e-4, 0.999789703934597,
                                     0.0147639634910978,   0.146342330145992,
                                     1.00082109454817,    -2.61773112070507,
                                     4.10440313943354,    -3.14361226236241,
                                     1.05262640378759
                                   }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101030);minpackTest(new WatsonFunction(9, 10.0,
                                   12088.127069307, 0.00118311459212513,
                                   new double[] {
                                   -0.153071334849279e-4, 0.999789703941234,
                                    0.0147639629786217,   0.146342334818836,
                                    1.00082107321386,    -2.61773107084722,
                                    4.10440307655564,    -3.14361222178686,
                                    1.05262639322589
                                   }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101031);minpackTest(new WatsonFunction(9, 100.0,
                                   1269109.29043834, 0.00118311459212384,
                                   new double[] {
                                    -0.153069523352176e-4, 0.999789703958371,
                                     0.0147639625185392,   0.146342341096326,
                                     1.00082104729164,    -2.61773101573645,
                                     4.10440301427286,    -3.14361218602503,
                                     1.05262638516774
                                   }), false);

    __CLR4_4_125x925x9lb90pe3b.R.inc(101032);minpackTest(new WatsonFunction(12, 0.0,
                                   5.47722557505166, 0.217310402535861e-4,
                                   new double[] {
                                    -0.660266001396382e-8, 1.00000164411833,
                                    -0.000563932146980154, 0.347820540050756,
                                    -0.156731500244233,    1.05281515825593,
                                    -3.24727109519451,     7.2884347837505,
                                   -10.271848098614,       9.07411353715783,
                                    -4.54137541918194,     1.01201187975044
                                   }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101033);minpackTest(new WatsonFunction(12, 10.0,
                                   19220.7589790951, 0.217310402518509e-4,
                                   new double[] {
                                    -0.663710223017410e-8, 1.00000164411787,
                                    -0.000563932208347327, 0.347820540486998,
                                    -0.156731503955652,    1.05281517654573,
                                    -3.2472711515214,      7.28843489430665,
                                   -10.2718482369638,      9.07411364383733,
                                    -4.54137546533666,     1.01201188830857
                                   }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101034);minpackTest(new WatsonFunction(12, 100.0,
                                   2018918.04462367, 0.217310402539845e-4,
                                   new double[] {
                                    -0.663806046485249e-8, 1.00000164411786,
                                    -0.000563932210324959, 0.347820540503588,
                                    -0.156731504091375,    1.05281517718031,
                                    -3.24727115337025,     7.28843489775302,
                                   -10.2718482410813,      9.07411364688464,
                                    -4.54137546660822,     1.0120118885369
                                   }), false);

  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackBox3Dimensional() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pza8g925yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackBox3Dimensional",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pza8g925yj(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101035);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101036);minpackTest(new Box3DimensionalFunction(10, new double[] { 0.0, 10.0, 20.0 },
                                            32.1115837449572), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackJennrichSampson() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urd5m025yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackJennrichSampson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urd5m025yl(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101037);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101038);minpackTest(new JennrichSampsonFunction(10, new double[] { 0.3, 0.4 },
                                            64.5856498144943, 11.1517793413499,
                                            new double[] {
 //                                            0.2578330049, 0.257829976764542
                                               0.2578199266368004, 0.25782997676455244
                                            }), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackBrownDennis() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f7aek125yn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackBrownDennis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f7aek125yn(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101039);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101040);minpackTest(new BrownDennisFunction(20,
                                        new double[] { 25.0, 5.0, -5.0, -1.0 },
                                        2815.43839161816, 292.954288244866,
                                        new double[] {
                                         -11.59125141003, 13.2024883984741,
                                         -0.403574643314272, 0.236736269844604
                                        }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101041);minpackTest(new BrownDennisFunction(20,
                                        new double[] { 250.0, 50.0, -50.0, -10.0 },
                                        555073.354173069, 292.954270581415,
                                        new double[] {
                                         -11.5959274272203, 13.2041866926242,
                                         -0.403417362841545, 0.236771143410386
                                       }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101042);minpackTest(new BrownDennisFunction(20,
                                        new double[] { 2500.0, 500.0, -500.0, -100.0 },
                                        61211252.2338581, 292.954306151134,
                                        new double[] {
                                         -11.5902596937374, 13.2020628854665,
                                         -0.403688070279258, 0.236665033746463
                                        }), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackChebyquad() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l0caac25yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackChebyquad",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l0caac25yr(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101043);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101044);minpackTest(new ChebyquadFunction(1, 8, 1.0,
                                      1.88623796907732, 1.88623796907732,
                                      new double[] { 0.5 }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101045);minpackTest(new ChebyquadFunction(1, 8, 10.0,
                                      5383344372.34005, 1.88424820499951,
                                      new double[] { 0.9817314924684 }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101046);minpackTest(new ChebyquadFunction(1, 8, 100.0,
                                      0.118088726698392e19, 1.88424820499347,
                                      new double[] { 0.9817314852934 }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101047);minpackTest(new ChebyquadFunction(8, 8, 1.0,
                                      0.196513862833975, 0.0593032355046727,
                                      new double[] {
                                        0.0431536648587336, 0.193091637843267,
                                        0.266328593812698,  0.499999334628884,
                                        0.500000665371116,  0.733671406187302,
                                        0.806908362156733,  0.956846335141266
                                      }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101048);minpackTest(new ChebyquadFunction(9, 9, 1.0,
                                      0.16994993465202, 0.0,
                                      new double[] {
                                        0.0442053461357828, 0.199490672309881,
                                        0.23561910847106,   0.416046907892598,
                                        0.5,                0.583953092107402,
                                        0.764380891528940,  0.800509327690119,
                                        0.955794653864217
                                      }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101049);minpackTest(new ChebyquadFunction(10, 10, 1.0,
                                      0.183747831178711, 0.0806471004038253,
                                      new double[] {
                                        0.0596202671753563, 0.166708783805937,
                                        0.239171018813509,  0.398885290346268,
                                        0.398883667870681,  0.601116332129320,
                                        0.60111470965373,   0.760828981186491,
                                        0.833291216194063,  0.940379732824644
                                      }), false);
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackBrownAlmostLinear() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m0t5nt25yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackBrownAlmostLinear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m0t5nt25yy(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101050);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101051);minpackTest(new BrownAlmostLinearFunction(10, 0.5,
                                              16.5302162063499, 0.0,
                                              new double[] {
                                                0.979430303349862, 0.979430303349862,
                                                0.979430303349862, 0.979430303349862,
                                                0.979430303349862, 0.979430303349862,
                                                0.979430303349862, 0.979430303349862,
                                                0.979430303349862, 1.20569696650138
                                              }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101052);minpackTest(new BrownAlmostLinearFunction(10, 5.0,
                                              9765624.00089211, 0.0,
                                              new double[] {
                                               0.979430303349865, 0.979430303349865,
                                               0.979430303349865, 0.979430303349865,
                                               0.979430303349865, 0.979430303349865,
                                               0.979430303349865, 0.979430303349865,
                                               0.979430303349865, 1.20569696650135
                                              }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101053);minpackTest(new BrownAlmostLinearFunction(10, 50.0,
                                              0.9765625e17, 0.0,
                                              new double[] {
                                                1.0, 1.0, 1.0, 1.0, 1.0,
                                                1.0, 1.0, 1.0, 1.0, 1.0
                                              }), false);
    __CLR4_4_125x925x9lb90pe3b.R.inc(101054);minpackTest(new BrownAlmostLinearFunction(30, 0.5,
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
    __CLR4_4_125x925x9lb90pe3b.R.inc(101055);minpackTest(new BrownAlmostLinearFunction(40, 0.5,
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
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackOsborne1() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ai3fnd25z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackOsborne1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ai3fnd25z4(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101056);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101057);minpackTest(new Osborne1Function(new double[] { 0.5, 1.5, -1.0, 0.01, 0.02, },
                                       0.937564021037838, 0.00739249260904843,
                                       new double[] {
                                         0.375410049244025, 1.93584654543108,
                                        -1.46468676748716, 0.0128675339110439,
                                         0.0221227011813076
                                       }), false);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  @Test
  public void testMinpackOsborne2() {__CLR4_4_125x925x9lb90pe3b.R.globalSliceStart(getClass().getName(),101058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dr3efu25z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_125x925x9lb90pe3b.R.rethrow($CLV_t2$);}finally{__CLR4_4_125x925x9lb90pe3b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.general.MinpackTest.testMinpackOsborne2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),101058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dr3efu25z6(){try{__CLR4_4_125x925x9lb90pe3b.R.inc(101058);

    __CLR4_4_125x925x9lb90pe3b.R.inc(101059);minpackTest(new Osborne2Function(new double[] {
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
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  private void minpackTest(MinpackFunction function, boolean exceptionExpected) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101060);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101061);LevenbergMarquardtOptimizer optimizer
          = new LevenbergMarquardtOptimizer(FastMath.sqrt(2.22044604926e-16),
                                            FastMath.sqrt(2.22044604926e-16),
                                            2.22044604926e-16);
//      Assert.assertTrue(function.checkTheoreticalStartCost(optimizer.getRMS()));
      __CLR4_4_125x925x9lb90pe3b.R.inc(101062);try {
          __CLR4_4_125x925x9lb90pe3b.R.inc(101063);PointVectorValuePair optimum =
              optimizer.optimize(400 * (function.getN() + 1), function,
                                 function.getTarget(), function.getWeight(),
                                 function.getStartPoint());
          __CLR4_4_125x925x9lb90pe3b.R.inc(101064);Assert.assertFalse(exceptionExpected);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101065);function.checkTheoreticalMinCost(optimizer.getRMS());
          __CLR4_4_125x925x9lb90pe3b.R.inc(101066);function.checkTheoreticalMinParams(optimum);
      } catch (TooManyEvaluationsException e) {
          __CLR4_4_125x925x9lb90pe3b.R.inc(101067);Assert.assertTrue(exceptionExpected);
      }
  }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  private static abstract class MinpackFunction
      implements MultivariateDifferentiableVectorFunction, Serializable {

      private static final long serialVersionUID = -6209760235478794233L;
      protected int      n;
      protected int      m;
      protected double[] startParams;
      protected double   theoreticalMinCost;
      protected double[] theoreticalMinParams;
      protected double   costAccuracy;
      protected double   paramsAccuracy;

      protected MinpackFunction(int m, double[] startParams,
                                double theoreticalMinCost, double[] theoreticalMinParams) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101068);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101069);this.m = m;
          __CLR4_4_125x925x9lb90pe3b.R.inc(101070);this.n = startParams.length;
          __CLR4_4_125x925x9lb90pe3b.R.inc(101071);this.startParams          = startParams.clone();
          __CLR4_4_125x925x9lb90pe3b.R.inc(101072);this.theoreticalMinCost   = theoreticalMinCost;
          __CLR4_4_125x925x9lb90pe3b.R.inc(101073);this.theoreticalMinParams = theoreticalMinParams;
          __CLR4_4_125x925x9lb90pe3b.R.inc(101074);this.costAccuracy         = 1.0e-8;
          __CLR4_4_125x925x9lb90pe3b.R.inc(101075);this.paramsAccuracy       = 1.0e-5;
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      protected static double[] buildArray(int n, double x) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101076);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101077);double[] array = new double[n];
          __CLR4_4_125x925x9lb90pe3b.R.inc(101078);Arrays.fill(array, x);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101079);return array;
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public double[] getTarget() {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101080);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101081);return buildArray(m, 0.0);
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public double[] getWeight() {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101082);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101083);return buildArray(m, 1.0);
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public double[] getStartPoint() {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101084);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101085);return startParams.clone();
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      protected void setCostAccuracy(double costAccuracy) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101086);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101087);this.costAccuracy = costAccuracy;
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      protected void setParamsAccuracy(double paramsAccuracy) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101088);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101089);this.paramsAccuracy = paramsAccuracy;
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public int getN() {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101090);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101091);return startParams.length;
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public void checkTheoreticalMinCost(double rms) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101092);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101093);double threshold = costAccuracy * (1.0 + theoreticalMinCost);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101094);Assert.assertEquals(theoreticalMinCost, FastMath.sqrt(m) * rms, threshold);
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public void checkTheoreticalMinParams(PointVectorValuePair optimum) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101095);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101096);double[] params = optimum.getPointRef();
          __CLR4_4_125x925x9lb90pe3b.R.inc(101097);if ((((theoreticalMinParams != null)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101098)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101099)==0&false))) {{
              __CLR4_4_125x925x9lb90pe3b.R.inc(101100);for (int i = 0; (((i < theoreticalMinParams.length)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101101)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101102)==0&false)); ++i) {{
                  __CLR4_4_125x925x9lb90pe3b.R.inc(101103);double mi = theoreticalMinParams[i];
                  __CLR4_4_125x925x9lb90pe3b.R.inc(101104);double vi = params[i];
                  __CLR4_4_125x925x9lb90pe3b.R.inc(101105);Assert.assertEquals(mi, vi, paramsAccuracy * (1.0 + FastMath.abs(mi)));
              }
          }}
      }}finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public double[] value(double[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101106);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101107);DerivativeStructure[] dsV = new DerivativeStructure[variables.length];
          __CLR4_4_125x925x9lb90pe3b.R.inc(101108);for (int i = 0; (((i < variables.length)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101109)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101110)==0&false)); ++i) {{
              __CLR4_4_125x925x9lb90pe3b.R.inc(101111);dsV[i] = new DerivativeStructure(0, 0, variables[i]);
          }
          }__CLR4_4_125x925x9lb90pe3b.R.inc(101112);DerivativeStructure[] dsY = value(dsV);
          __CLR4_4_125x925x9lb90pe3b.R.inc(101113);double[] y = new double[dsY.length];
          __CLR4_4_125x925x9lb90pe3b.R.inc(101114);for (int i = 0; (((i < dsY.length)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101115)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101116)==0&false)); ++i) {{
              __CLR4_4_125x925x9lb90pe3b.R.inc(101117);y[i] = dsY[i].getValue();
          }
          }__CLR4_4_125x925x9lb90pe3b.R.inc(101118);return y;
      }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

      public abstract DerivativeStructure[] value(DerivativeStructure[] variables);

  }

  private static class LinearFullRankFunction extends MinpackFunction {

    private static final long serialVersionUID = -9030323226268039536L;

    public LinearFullRankFunction(int m, int n, double x0,
                                  double theoreticalStartCost,
                                  double theoreticalMinCost) {
      super(m, buildArray(n, x0), theoreticalMinCost,
            buildArray(n, -1.0));__CLR4_4_125x925x9lb90pe3b.R.inc(101120);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101119);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101121);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101122);DerivativeStructure sum = variables[0].getField().getZero();
      __CLR4_4_125x925x9lb90pe3b.R.inc(101123);for (int i = 0; (((i < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101124)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101125)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101126);sum = sum.add(variables[i]);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101127);DerivativeStructure t  = sum.multiply(2.0 / m).add(1);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101128);DerivativeStructure[] f = new DerivativeStructure[m];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101129);for (int i = 0; (((i < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101130)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101131)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101132);f[i] = variables[i].subtract(t);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101133);Arrays.fill(f, n, m, t.negate());
      __CLR4_4_125x925x9lb90pe3b.R.inc(101134);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class LinearRank1Function extends MinpackFunction {

    private static final long serialVersionUID = 8494863245104608300L;

    public LinearRank1Function(int m, int n, double x0,
                                  double theoreticalStartCost,
                                  double theoreticalMinCost) {
      super(m, buildArray(n, x0), theoreticalMinCost, null);__CLR4_4_125x925x9lb90pe3b.R.inc(101136);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101135);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101137);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101138);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101139);DerivativeStructure sum = variables[0].getField().getZero();
        __CLR4_4_125x925x9lb90pe3b.R.inc(101140);for (int i = 0; (((i < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101141)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101142)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101143);sum = sum.add(variables[i].multiply(i + 1));
        }
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101144);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101145)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101146)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101147);f[i] = sum.multiply(i + 1).subtract(1);
        }
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101148);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class LinearRank1ZeroColsAndRowsFunction extends MinpackFunction {

    private static final long serialVersionUID = -3316653043091995018L;

    public LinearRank1ZeroColsAndRowsFunction(int m, int n, double x0) {
      super(m, buildArray(n, x0),
            FastMath.sqrt((m * (m + 3) - 6) / (2.0 * (2 * m - 3))),
            null);__CLR4_4_125x925x9lb90pe3b.R.inc(101150);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101149);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101151);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101152);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101153);DerivativeStructure sum = variables[0].getField().getZero();
      __CLR4_4_125x925x9lb90pe3b.R.inc(101154);for (int i = 1; (((i < (n - 1))&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101155)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101156)==0&false)); ++i) {{
          __CLR4_4_125x925x9lb90pe3b.R.inc(101157);sum = sum.add(variables[i].multiply(i + 1));
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101158);for (int i = 0; (((i < (m - 1))&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101159)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101160)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101161);f[i] = sum.multiply(i).subtract(1);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101162);f[m - 1] = variables[0].getField().getOne().negate();
      __CLR4_4_125x925x9lb90pe3b.R.inc(101163);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class RosenbrockFunction extends MinpackFunction {

    private static final long serialVersionUID = 2893438180956569134L;

    public RosenbrockFunction(double[] startParams, double theoreticalStartCost) {
      super(2, startParams, 0.0, buildArray(2, 1.0));__CLR4_4_125x925x9lb90pe3b.R.inc(101165);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101164);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101166);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101167);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101168);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101169);return new DerivativeStructure[] {
            x2.subtract(x1.multiply(x1)).multiply(10),
            x1.negate().add(1)
        };
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class HelicalValleyFunction extends MinpackFunction {

    private static final long serialVersionUID = 220613787843200102L;

    public HelicalValleyFunction(double[] startParams,
                                 double theoreticalStartCost) {
      super(3, startParams, 0.0, new double[] { 1.0, 0.0, 0.0 });__CLR4_4_125x925x9lb90pe3b.R.inc(101171);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101170);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101172);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101173);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101174);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101175);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101176);DerivativeStructure tmp1 = variables[0].getField().getZero();
        __CLR4_4_125x925x9lb90pe3b.R.inc(101177);if ((((x1.getValue() == 0)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101178)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101179)==0&false))) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101180);tmp1 = tmp1.add(((((x2.getValue() >= 0) )&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101181)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101182)==0&false))? 0.25 : -0.25);
        } }else {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101183);tmp1 = x2.divide(x1).atan().divide(twoPi);
            __CLR4_4_125x925x9lb90pe3b.R.inc(101184);if ((((x1.getValue() < 0)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101185)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101186)==0&false))) {{
                __CLR4_4_125x925x9lb90pe3b.R.inc(101187);tmp1 = tmp1.add(0.5);
            }
        }}
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101188);DerivativeStructure tmp2 = x1.multiply(x1).add(x2.multiply(x2)).sqrt();
        __CLR4_4_125x925x9lb90pe3b.R.inc(101189);return new DerivativeStructure[] {
            x3.subtract(tmp1.multiply(10)).multiply(10),
            tmp2.subtract(1).multiply(10),
            x3
        };
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    private static final double twoPi = 2.0 * FastMath.PI;

  }

  private static class PowellSingularFunction extends MinpackFunction {

    private static final long serialVersionUID = 7298364171208142405L;

    public PowellSingularFunction(double[] startParams,
                                  double theoreticalStartCost) {
      super(4, startParams, 0.0, buildArray(4, 0.0));__CLR4_4_125x925x9lb90pe3b.R.inc(101191);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101190);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101192);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101193);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101194);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101195);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101196);DerivativeStructure x4 = variables[3];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101197);return new DerivativeStructure[] {
        x1.add(x2.multiply(10)),
        x3.subtract(x4).multiply(sqrt5),
        x2.subtract(x3.multiply(2)).multiply(x2.subtract(x3.multiply(2))),
        x1.subtract(x4).multiply(x1.subtract(x4)).multiply(sqrt10)
      };
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

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
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101199);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101198);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101200);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101201);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101202);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101203);return new DerivativeStructure[] {
            x1.subtract(13.0).add(x2.negate().add(5.0).multiply(x2).subtract(2).multiply(x2)),
            x1.subtract(29.0).add(x2.add(1).multiply(x2).subtract(14).multiply(x2))
        };
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class BardFunction extends MinpackFunction {

    private static final long serialVersionUID = 5990442612572087668L;

    public BardFunction(double x0,
                        double theoreticalStartCost,
                        double theoreticalMinCost,
                        double[] theoreticalMinParams) {
      super(15, buildArray(3, x0), theoreticalMinCost,
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101205);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101204);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101206);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101207);DerivativeStructure   x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101208);DerivativeStructure   x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101209);DerivativeStructure   x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101210);DerivativeStructure[] f = new DerivativeStructure[m];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101211);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101212)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101213)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101214);double tmp1 = i + 1;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101215);double tmp2 = 15 - i;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101216);double tmp3 = ((((i <= 7) )&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101217)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101218)==0&false))? tmp1 : tmp2;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101219);f[i] = x1.add(x2.multiply(tmp2).add(x3.multiply(tmp3)).reciprocal().multiply(tmp1)).negate().add(y[i]);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101220);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

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
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101222);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101221);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101223);if ((((theoreticalStartCost > 20.0)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101224)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101225)==0&false))) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101226);setCostAccuracy(2.0e-4);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101227);setParamsAccuracy(5.0e-3);
      }
    }}finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101228);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101229);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101230);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101231);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101232);DerivativeStructure x4 = variables[3];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101233);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101234);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101235)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101236)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101237);f[i] = x1.multiply(x2.add(v[i]).multiply(v[i])).divide(x4.add(x3.add(v[i]).multiply(v[i]))).negate().add(y[i]);
        }
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101238);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

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
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101240);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101239);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101241);if ((((theoreticalStartCost > 1.0e6)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101242)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101243)==0&false))) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101244);setCostAccuracy(7.0e-3);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101245);setParamsAccuracy(2.0e-2);
      }
    }}finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101246);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101247);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101248);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101249);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101250);DerivativeStructure[] f = new DerivativeStructure[m];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101251);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101252)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101253)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101254);f[i] = x1.multiply(x2.divide(x3.add(5.0 * (i + 1) + 45.0)).exp()).subtract(y[i]);
      }
     }__CLR4_4_125x925x9lb90pe3b.R.inc(101255);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

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
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101257);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101256);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101258);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101259);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101260);for (int i = 0; (((i < (m - 2))&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101261)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101262)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101263);double div = (i + 1) / 29.0;
            __CLR4_4_125x925x9lb90pe3b.R.inc(101264);DerivativeStructure s1 = variables[0].getField().getZero();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101265);DerivativeStructure dx = variables[0].getField().getOne();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101266);for (int j = 1; (((j < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101267)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101268)==0&false)); ++j) {{
                __CLR4_4_125x925x9lb90pe3b.R.inc(101269);s1 = s1.add(dx.multiply(j).multiply(variables[j]));
                __CLR4_4_125x925x9lb90pe3b.R.inc(101270);dx = dx.multiply(div);
            }
            }__CLR4_4_125x925x9lb90pe3b.R.inc(101271);DerivativeStructure s2 = variables[0].getField().getZero();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101272);dx = variables[0].getField().getOne();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101273);for (int j = 0; (((j < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101274)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101275)==0&false)); ++j) {{
                __CLR4_4_125x925x9lb90pe3b.R.inc(101276);s2 = s2.add(dx.multiply(variables[j]));
                __CLR4_4_125x925x9lb90pe3b.R.inc(101277);dx = dx.multiply(div);
            }
            }__CLR4_4_125x925x9lb90pe3b.R.inc(101278);f[i] = s1.subtract(s2.multiply(s2)).subtract(1);
        }

        }__CLR4_4_125x925x9lb90pe3b.R.inc(101279);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101280);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101281);f[m - 2] = x1;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101282);f[m - 1] = x2.subtract(x1.multiply(x1)).subtract(1);

        __CLR4_4_125x925x9lb90pe3b.R.inc(101283);return f;

    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class Box3DimensionalFunction extends MinpackFunction {

    private static final long serialVersionUID = 5511403858142574493L;

    public Box3DimensionalFunction(int m, double[] startParams,
                                   double theoreticalStartCost) {
      super(m, startParams, 0.0,
            new double[] { 1.0, 10.0, 1.0 });__CLR4_4_125x925x9lb90pe3b.R.inc(101285);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101284);
   }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101286);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101287);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101288);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101289);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101290);DerivativeStructure[] f = new DerivativeStructure[m];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101291);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101292)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101293)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101294);double tmp = (i + 1) / 10.0;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101295);f[i] = x1.multiply(-tmp).exp().subtract(x2.multiply(-tmp).exp()).add(
                  x3.multiply(FastMath.exp(-i - 1) - FastMath.exp(-tmp)));
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101296);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class JennrichSampsonFunction extends MinpackFunction {

    private static final long serialVersionUID = -2489165190443352947L;

    public JennrichSampsonFunction(int m, double[] startParams,
                                   double theoreticalStartCost,
                                   double theoreticalMinCost,
                                   double[] theoreticalMinParams) {
      super(m, startParams, theoreticalMinCost,
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101298);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101297);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101299);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101300);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101301);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101302);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101303);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101304)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101305)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101306);double temp = i + 1;
            __CLR4_4_125x925x9lb90pe3b.R.inc(101307);f[i] = x1.multiply(temp).exp().add(x2.multiply(temp).exp()).subtract(2 + 2 * temp).negate();
        }
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101308);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class BrownDennisFunction extends MinpackFunction {

    private static final long serialVersionUID = 8340018645694243910L;

    public BrownDennisFunction(int m, double[] startParams,
                               double theoreticalStartCost,
                               double theoreticalMinCost,
                               double[] theoreticalMinParams) {
      super(m, startParams, theoreticalMinCost,
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101310);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101309);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101311);setCostAccuracy(2.5e-8);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101312);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101313);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101314);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101315);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101316);DerivativeStructure x4 = variables[3];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101317);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101318);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101319)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101320)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101321);double temp = (i + 1) / 5.0;
            __CLR4_4_125x925x9lb90pe3b.R.inc(101322);DerivativeStructure tmp1 = x1.add(x2.multiply(temp)).subtract(FastMath.exp(temp));
            __CLR4_4_125x925x9lb90pe3b.R.inc(101323);DerivativeStructure tmp2 = x3.add(x4.multiply(FastMath.sin(temp))).subtract(FastMath.cos(temp));
            __CLR4_4_125x925x9lb90pe3b.R.inc(101324);f[i] = tmp1.multiply(tmp1).add(tmp2.multiply(tmp2));
        }
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101325);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class ChebyquadFunction extends MinpackFunction {

    private static final long serialVersionUID = -2394877275028008594L;

    private static double[] buildChebyquadArray(int n, double factor) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101326);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101327);double[] array = new double[n];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101328);double inv = factor / (n + 1);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101329);for (int i = 0; (((i < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101330)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101331)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101332);array[i] = (i + 1) * inv;
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101333);return array;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    public ChebyquadFunction(int n, int m, double factor,
                             double theoreticalStartCost,
                             double theoreticalMinCost,
                             double[] theoreticalMinParams) {
      super(m, buildChebyquadArray(n, factor), theoreticalMinCost,
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101335);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101334);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101336);

        __CLR4_4_125x925x9lb90pe3b.R.inc(101337);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101338);Arrays.fill(f, variables[0].getField().getZero());

        __CLR4_4_125x925x9lb90pe3b.R.inc(101339);for (int j = 0; (((j < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101340)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101341)==0&false)); ++j) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101342);DerivativeStructure tmp1 = variables[0].getField().getOne();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101343);DerivativeStructure tmp2 = variables[j].multiply(2).subtract(1);
            __CLR4_4_125x925x9lb90pe3b.R.inc(101344);DerivativeStructure temp = tmp2.multiply(2);
            __CLR4_4_125x925x9lb90pe3b.R.inc(101345);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101346)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101347)==0&false)); ++i) {{
                __CLR4_4_125x925x9lb90pe3b.R.inc(101348);f[i] = f[i].add(tmp2);
                __CLR4_4_125x925x9lb90pe3b.R.inc(101349);DerivativeStructure ti = temp.multiply(tmp2).subtract(tmp1);
                __CLR4_4_125x925x9lb90pe3b.R.inc(101350);tmp1 = tmp2;
                __CLR4_4_125x925x9lb90pe3b.R.inc(101351);tmp2 = ti;
            }
        }}

        }__CLR4_4_125x925x9lb90pe3b.R.inc(101352);double dx = 1.0 / n;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101353);boolean iev = false;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101354);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101355)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101356)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101357);f[i] = f[i].multiply(dx);
            __CLR4_4_125x925x9lb90pe3b.R.inc(101358);if ((((iev)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101359)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101360)==0&false))) {{
                __CLR4_4_125x925x9lb90pe3b.R.inc(101361);f[i] = f[i].add(1.0 / (i * (i + 2)));
            }
            }__CLR4_4_125x925x9lb90pe3b.R.inc(101362);iev = ! iev;
        }

        }__CLR4_4_125x925x9lb90pe3b.R.inc(101363);return f;

    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class BrownAlmostLinearFunction extends MinpackFunction {

    private static final long serialVersionUID = 8239594490466964725L;

    public BrownAlmostLinearFunction(int m, double factor,
                                     double theoreticalStartCost,
                                     double theoreticalMinCost,
                                     double[] theoreticalMinParams) {
      super(m, buildArray(m, factor), theoreticalMinCost,
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101365);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101364);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101366);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101367);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101368);DerivativeStructure sum  = variables[0].getField().getZero().subtract(n + 1);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101369);DerivativeStructure prod = variables[0].getField().getOne();
      __CLR4_4_125x925x9lb90pe3b.R.inc(101370);for (int j = 0; (((j < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101371)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101372)==0&false)); ++j) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101373);sum  = sum.add(variables[j]);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101374);prod = prod.multiply(variables[j]);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101375);for (int i = 0; (((i < n)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101376)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101377)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101378);f[i] = variables[i].add(sum);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101379);f[n - 1] = prod.subtract(1);
      __CLR4_4_125x925x9lb90pe3b.R.inc(101380);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

  }

  private static class Osborne1Function extends MinpackFunction {

    private static final long serialVersionUID = 4006743521149849494L;

    public Osborne1Function(double[] startParams,
                            double theoreticalStartCost,
                            double theoreticalMinCost,
                            double[] theoreticalMinParams) {
      super(33, startParams, theoreticalMinCost,
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101382);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101381);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101383);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101384);DerivativeStructure x1 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101385);DerivativeStructure x2 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101386);DerivativeStructure x3 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101387);DerivativeStructure x4 = variables[3];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101388);DerivativeStructure x5 = variables[4];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101389);DerivativeStructure[] f = new DerivativeStructure[m];
      __CLR4_4_125x925x9lb90pe3b.R.inc(101390);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101391)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101392)==0&false)); ++i) {{
        __CLR4_4_125x925x9lb90pe3b.R.inc(101393);double temp = 10.0 * i;
        __CLR4_4_125x925x9lb90pe3b.R.inc(101394);DerivativeStructure tmp1 = x4.multiply(-temp).exp();
        __CLR4_4_125x925x9lb90pe3b.R.inc(101395);DerivativeStructure tmp2 = x5.multiply(-temp).exp();
        __CLR4_4_125x925x9lb90pe3b.R.inc(101396);f[i] = x1.add(x2.multiply(tmp1)).add(x3.multiply(tmp2)).negate().add(y[i]);
      }
      }__CLR4_4_125x925x9lb90pe3b.R.inc(101397);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

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
            theoreticalMinParams);__CLR4_4_125x925x9lb90pe3b.R.inc(101399);try{__CLR4_4_125x925x9lb90pe3b.R.inc(101398);
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

    @Override
    public DerivativeStructure[] value(DerivativeStructure[] variables) {try{__CLR4_4_125x925x9lb90pe3b.R.inc(101400);
        __CLR4_4_125x925x9lb90pe3b.R.inc(101401);DerivativeStructure x01 = variables[0];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101402);DerivativeStructure x02 = variables[1];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101403);DerivativeStructure x03 = variables[2];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101404);DerivativeStructure x04 = variables[3];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101405);DerivativeStructure x05 = variables[4];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101406);DerivativeStructure x06 = variables[5];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101407);DerivativeStructure x07 = variables[6];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101408);DerivativeStructure x08 = variables[7];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101409);DerivativeStructure x09 = variables[8];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101410);DerivativeStructure x10 = variables[9];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101411);DerivativeStructure x11 = variables[10];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101412);DerivativeStructure[] f = new DerivativeStructure[m];
        __CLR4_4_125x925x9lb90pe3b.R.inc(101413);for (int i = 0; (((i < m)&&(__CLR4_4_125x925x9lb90pe3b.R.iget(101414)!=0|true))||(__CLR4_4_125x925x9lb90pe3b.R.iget(101415)==0&false)); ++i) {{
            __CLR4_4_125x925x9lb90pe3b.R.inc(101416);double temp = i / 10.0;
            __CLR4_4_125x925x9lb90pe3b.R.inc(101417);DerivativeStructure tmp1 = x05.multiply(-temp).exp();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101418);DerivativeStructure tmp2 = x06.negate().multiply(x09.subtract(temp).multiply(x09.subtract(temp))).exp();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101419);DerivativeStructure tmp3 = x07.negate().multiply(x10.subtract(temp).multiply(x10.subtract(temp))).exp();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101420);DerivativeStructure tmp4 = x08.negate().multiply(x11.subtract(temp).multiply(x11.subtract(temp))).exp();
            __CLR4_4_125x925x9lb90pe3b.R.inc(101421);f[i] = x01.multiply(tmp1).add(x02.multiply(tmp2)).add(x03.multiply(tmp3)).add(x04.multiply(tmp4)).negate().add(y[i]);
        }
        }__CLR4_4_125x925x9lb90pe3b.R.inc(101422);return f;
    }finally{__CLR4_4_125x925x9lb90pe3b.R.flushNeeded();}}

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
