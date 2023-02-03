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
package org.apache.commons.math3.distribution;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.RombergIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

/** Various tests related to MATH-699. */
public class AbstractRealDistributionTest {static class __CLR4_4_11j3a1j3alb90pcan{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,71539,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testContinuous() {__CLR4_4_11j3a1j3alb90pcan.R.globalSliceStart(getClass().getName(),71398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_167vkpk1j3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j3a1j3alb90pcan.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j3a1j3alb90pcan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.AbstractRealDistributionTest.testContinuous",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_167vkpk1j3a(){try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71398);
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71399);final double x0 = 0.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71400);final double x1 = 1.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71401);final double x2 = 2.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71402);final double x3 = 3.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71403);final double p12 = 0.5;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71404);final AbstractRealDistribution distribution;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71405);distribution = new AbstractRealDistribution(null) {
            private static final long serialVersionUID = 1L;

            public double cumulativeProbability(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71406);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71407);if (((((x < x0) || (x > x3))&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71408)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71409)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71410);throw new OutOfRangeException(x, x0, x3);
                }
                }__CLR4_4_11j3a1j3alb90pcan.R.inc(71411);if ((((x <= x1)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71412)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71413)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71414);return p12 * (x - x0) / (x1 - x0);
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71415);if ((((x <= x2)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71416)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71417)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71418);return p12;
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71419);if ((((x <= x3)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71420)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71421)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71422);return p12 + (1.0 - p12) * (x - x2) / (x3 - x2);
                }
                }}}__CLR4_4_11j3a1j3alb90pcan.R.inc(71423);return 0.0;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double density(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71424);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71425);if (((((x < x0) || (x > x3))&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71426)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71427)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71428);throw new OutOfRangeException(x, x0, x3);
                }
                }__CLR4_4_11j3a1j3alb90pcan.R.inc(71429);if ((((x <= x1)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71430)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71431)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71432);return p12 / (x1 - x0);
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71433);if ((((x <= x2)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71434)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71435)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71436);return 0.0;
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71437);if ((((x <= x3)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71438)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71439)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71440);return (1.0 - p12) / (x3 - x2);
                }
                }}}__CLR4_4_11j3a1j3alb90pcan.R.inc(71441);return 0.0;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getNumericalMean() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71442);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71443);return ((x0 + x1) * p12 + (x2 + x3) * (1.0 - p12)) / 2.0;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getNumericalVariance() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71444);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71445);final double meanX = getNumericalMean();
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71446);final double meanX2;
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71447);meanX2 = ((x0 * x0 + x0 * x1 + x1 * x1) * p12 + (x2 * x2 + x2
                        * x3 + x3 * x3)
                        * (1.0 - p12)) / 3.0;
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71448);return meanX2 - meanX * meanX;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getSupportLowerBound() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71449);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71450);return x0;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getSupportUpperBound() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71451);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71452);return x3;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public boolean isSupportConnected() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71453);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71454);return false;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71455);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71456);return true;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71457);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71458);return true;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            @Override
            public double probability(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71459);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71460);throw new UnsupportedOperationException();
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}
        };
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71461);final double expected = x1;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71462);final double actual = distribution.inverseCumulativeProbability(p12);
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71463);Assert.assertEquals("", expected, actual,
                distribution.getSolverAbsoluteAccuracy());
    }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

    @Test
    public void testDiscontinuous() {__CLR4_4_11j3a1j3alb90pcan.R.globalSliceStart(getClass().getName(),71464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i28a5q1j54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11j3a1j3alb90pcan.R.rethrow($CLV_t2$);}finally{__CLR4_4_11j3a1j3alb90pcan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.distribution.AbstractRealDistributionTest.testDiscontinuous",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),71464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i28a5q1j54(){try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71464);
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71465);final double x0 = 0.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71466);final double x1 = 0.25;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71467);final double x2 = 0.5;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71468);final double x3 = 0.75;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71469);final double x4 = 1.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71470);final double p12 = 1.0 / 3.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71471);final double p23 = 2.0 / 3.0;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71472);final AbstractRealDistribution distribution;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71473);distribution = new AbstractRealDistribution(null) {
            private static final long serialVersionUID = 1L;

            public double cumulativeProbability(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71474);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71475);if (((((x < x0) || (x > x4))&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71476)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71477)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71478);throw new OutOfRangeException(x, x0, x4);
                }
                }__CLR4_4_11j3a1j3alb90pcan.R.inc(71479);if ((((x <= x1)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71480)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71481)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71482);return p12 * (x - x0) / (x1 - x0);
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71483);if ((((x <= x2)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71484)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71485)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71486);return p12;
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71487);if ((((x <= x3)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71488)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71489)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71490);return p23;
                } }else {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71491);return (1.0 - p23) * (x - x3) / (x4 - x3) + p23;
                }
            }}}}finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double density(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71492);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71493);if (((((x < x0) || (x > x4))&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71494)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71495)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71496);throw new OutOfRangeException(x, x0, x4);
                }
                }__CLR4_4_11j3a1j3alb90pcan.R.inc(71497);if ((((x <= x1)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71498)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71499)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71500);return p12 / (x1 - x0);
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71501);if ((((x <= x2)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71502)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71503)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71504);return 0.0;
                } }else {__CLR4_4_11j3a1j3alb90pcan.R.inc(71505);if ((((x <= x3)&&(__CLR4_4_11j3a1j3alb90pcan.R.iget(71506)!=0|true))||(__CLR4_4_11j3a1j3alb90pcan.R.iget(71507)==0&false))) {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71508);return 0.0;
                } }else {{
                    __CLR4_4_11j3a1j3alb90pcan.R.inc(71509);return (1.0 - p23) / (x4 - x3);
                }
            }}}}finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getNumericalMean() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71510);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71511);final UnivariateFunction f = new UnivariateFunction() {

                    public double value(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71512);
                        __CLR4_4_11j3a1j3alb90pcan.R.inc(71513);return x * density(x);
                    }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}
                };
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71514);final UnivariateIntegrator integrator = new RombergIntegrator();
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71515);return integrator.integrate(Integer.MAX_VALUE, f, x0, x4);
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getNumericalVariance() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71516);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71517);final double meanX = getNumericalMean();
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71518);final UnivariateFunction f = new UnivariateFunction() {

                    public double value(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71519);
                        __CLR4_4_11j3a1j3alb90pcan.R.inc(71520);return x * x * density(x);
                    }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}
                };
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71521);final UnivariateIntegrator integrator = new RombergIntegrator();
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71522);final double meanX2 = integrator.integrate(Integer.MAX_VALUE,
                        f, x0, x4);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71523);return meanX2 - meanX * meanX;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getSupportLowerBound() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71524);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71525);return x0;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public double getSupportUpperBound() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71526);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71527);return x4;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public boolean isSupportConnected() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71528);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71529);return false;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71530);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71531);return true;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71532);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71533);return true;
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}

            @Override
            public double probability(final double x) {try{__CLR4_4_11j3a1j3alb90pcan.R.inc(71534);
                __CLR4_4_11j3a1j3alb90pcan.R.inc(71535);throw new UnsupportedOperationException();
            }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}
        };
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71536);final double expected = x2;
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71537);final double actual = distribution.inverseCumulativeProbability(p23);
        __CLR4_4_11j3a1j3alb90pcan.R.inc(71538);Assert.assertEquals("", expected, actual,
                distribution.getSolverAbsoluteAccuracy());

    }finally{__CLR4_4_11j3a1j3alb90pcan.R.flushNeeded();}}
}
