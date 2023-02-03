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
package org.apache.commons.math3.linear;

import java.util.Arrays;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.IterationEvent;
import org.apache.commons.math3.util.IterationListener;
import org.junit.Assert;
import org.junit.Test;

public class SymmLQTest {static class __CLR4_4_11xdf1xdflb90pdf0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,90350,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void saundersTest(final int n, final boolean goodb,
                             final boolean precon, final double shift,
                             final double pertbn) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89907);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89908);final RealLinearOperator a = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89909);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(89910);if ((((x.getDimension() != n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89911)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89912)==0&false))) {{
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(89913);throw new DimensionMismatchException(x.getDimension(), n);
                }
                }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89914);final double[] y = new double[n];
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(89915);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89916)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89917)==0&false)); i++) {{
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(89918);y[i] = (i + 1) * 1.1 / n * x.getEntry(i);
                }
                }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89919);return new ArrayRealVector(y, false);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89920);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(89921);return n;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89922);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(89923);return n;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89924);final double shiftm = shift;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89925);final double pertm = FastMath.abs(pertbn);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89926);final RealLinearOperator minv;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89927);if ((((precon)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89928)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89929)==0&false))) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89930);minv = new RealLinearOperator() {
                @Override
                public int getRowDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89931);
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(89932);return n;
                }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

                @Override
                public int getColumnDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89933);
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(89934);return n;
                }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

                @Override
                public RealVector operate(final RealVector x) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89935);
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(89936);if ((((x.getDimension() != n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89937)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89938)==0&false))) {{
                        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89939);throw new DimensionMismatchException(x.getDimension(),
                                                             n);
                    }
                    }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89940);final double[] y = new double[n];
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(89941);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89942)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89943)==0&false)); i++) {{
                        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89944);double d = (i + 1) * 1.1 / n;
                        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89945);d = FastMath.abs(d - shiftm);
                        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89946);if ((((i % 10 == 0)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89947)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89948)==0&false))) {{
                            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89949);d += pertm;
                        }
                        }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89950);y[i] = x.getEntry(i) / d;
                    }
                    }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89951);return new ArrayRealVector(y, false);
                }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
            };
        } }else {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89952);minv = null;
        }
        }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89953);final RealVector xtrue = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89954);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89955)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89956)==0&false)); i++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89957);xtrue.setEntry(i, n - i);
        }
        }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89958);final RealVector b = a.operate(xtrue);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89959);b.combineToSelf(1.0, -shift, xtrue);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89960);final SymmLQ solver = new SymmLQ(2 * n, 1E-12, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89961);final RealVector x = solver.solve(a, minv, b, goodb, shift);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89962);final RealVector y = a.operate(x);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89963);final RealVector r1 = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89964);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89965)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(89966)==0&false)); i++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89967);final double bi = b.getEntry(i);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89968);final double yi = y.getEntry(i);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89969);final double xi = x.getEntry(i);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(89970);r1.setEntry(i, bi - yi + shift * xi);
        }
        }__CLR4_4_11xdf1xdflb90pdf0.R.inc(89971);final double enorm = x.subtract(xtrue).getNorm() / xtrue.getNorm();
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89972);final double etol = 1E-5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89973);Assert.assertTrue("enorm=" + enorm + ", " +
        solver.getIterationManager().getIterations(), enorm <= etol);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders1() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169vj3y1xfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169vj3y1xfa(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89974);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89975);saundersTest(1, false, false, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders2() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_130vkbh1xfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_130vkbh1xfc(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89976);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89977);saundersTest(2, false, false, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders3() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184eh01xfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184eh01xfe(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89978);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89979);saundersTest(1, false, true, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders4() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13h4d9h1xfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89980,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13h4d9h1xfg(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89980);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89981);saundersTest(2, false, true, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders5() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16q4c1y1xfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16q4c1y1xfi(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89982);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89983);saundersTest(5, false, true, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders6() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19z4auf1xfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19z4auf1xfk(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89984);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89985);saundersTest(5, false, true, 0.25, 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders7() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d849mw1xfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d849mw1xfm(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89986);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89987);saundersTest(50, false, false, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders8() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gh48fd1xfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gh48fd1xfo(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89988);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89989);saundersTest(50, false, false, 0.25, 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders9() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jq477u1xfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jq477u1xfq(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89990);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89991);saundersTest(50, false, true, 0., 0.10);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders10() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g5h1es1xfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g5h1es1xfs(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89992);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89993);saundersTest(50, false, true, 0.25, 0.10);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders11() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwh2mb1xfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwh2mb1xfu(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89994);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89995);saundersTest(1, true, false, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders12() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19nh3tu1xfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19nh3tu1xfw(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89996);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89997);saundersTest(2, true, false, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders13() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),89998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16eh51d1xfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89998,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16eh51d1xfy(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(89998);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(89999);saundersTest(1, true, true, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders14() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_135h68w1xg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_135h68w1xg0(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90000);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90001);saundersTest(2, true, true, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders15() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13isjl1xg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13isjl1xg2(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90002);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90003);saundersTest(5, true, true, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders16() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13circ21xg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13circ21xg4(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90004);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90005);saundersTest(5, true, true, 0.25, 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders17() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16liq4j1xg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16liq4j1xg6(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90006);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90007);saundersTest(50, true, false, 0., 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders18() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19uiox01xg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19uiox01xg8(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90008);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90009);saundersTest(50, true, false, 0.25, 0.);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders19() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3inph1xga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3inph1xga(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90010);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90011);saundersTest(50, true, true, 0., 0.10);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testSolveSaunders20() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dkdv4r1xgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testSolveSaunders20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dkdv4r1xgc(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90012);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90013);saundersTest(50, true, true, 0.25, 0.10);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = NonSquareOperatorException.class)
    public void testNonSquareOperator() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pige3n1xge();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,113,117,97,114,101,79,112,101,114,97,116,111,114,58,32,91,78,111,110,83,113,117,97,114,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSquareOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testNonSquareOperator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pige3n1xge(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90014);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90015);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 3);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90016);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90017);solver = new SymmLQ(10, 0., false);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90018);final ArrayRealVector b = new ArrayRealVector(a.getRowDimension());
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90019);final ArrayRealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90020);solver.solve(a, b, x);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testDimensionMismatchRightHandSide() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18igp211xgl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,82,105,103,104,116,72,97,110,100,83,105,100,101,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testDimensionMismatchRightHandSide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18igp211xgl(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90021);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90022);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(3, 3);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90023);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90024);solver = new SymmLQ(10, 0., false);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90025);final ArrayRealVector b = new ArrayRealVector(2);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90026);solver.solve(a, b);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testDimensionMismatchSolution() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wcbote1xgr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,83,111,108,117,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testDimensionMismatchSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wcbote1xgr(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90027);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90028);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(3, 3);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90029);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90030);solver = new SymmLQ(10, 0., false);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90031);final ArrayRealVector b = new ArrayRealVector(3);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90032);final ArrayRealVector x = new ArrayRealVector(2);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90033);solver.solve(a, b, x);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedSolution() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19me16q1xgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testUnpreconditionedSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19me16q1xgy(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90034);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90035);final int n = 5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90036);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90037);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90038);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90039);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90040);solver = new SymmLQ(maxIterations, 1E-10, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90041);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90042);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90043)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90044)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90045);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90046);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90047);final RealVector x = solver.solve(a, b);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90048);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90049)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90050)==0&false)); i++) {{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90051);final double actual = x.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90052);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90053);final double delta = 1E-6 * Math.abs(expected);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90054);final String msg = String.format("entry[%d][%d]", i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90055);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedInPlaceSolutionWithInitialGuess() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngu32x1xhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testUnpreconditionedInPlaceSolutionWithInitialGuess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngu32x1xhk(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90056);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90057);final int n = 5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90058);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90059);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90060);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90061);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90062);solver = new SymmLQ(maxIterations, 1E-10, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90063);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90064);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90065)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90066)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90067);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90068);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90069);final RealVector x0 = new ArrayRealVector(n);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90070);x0.set(1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90071);final RealVector x = solver.solveInPlace(a, b, x0);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90072);Assert.assertSame("x should be a reference to x0", x0, x);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90073);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90074)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90075)==0&false)); i++) {{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90076);final double actual = x.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90077);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90078);final double delta = 1E-6 * Math.abs(expected);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90079);final String msg = String.format("entry[%d][%d)", i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90080);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedSolutionWithInitialGuess() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jgtwb1xi9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testUnpreconditionedSolutionWithInitialGuess",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jgtwb1xi9(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90081);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90082);final int n = 5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90083);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90084);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90085);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90086);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90087);solver = new SymmLQ(maxIterations, 1E-10, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90088);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90089);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90090)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90091)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90092);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90093);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90094);final RealVector x0 = new ArrayRealVector(n);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90095);x0.set(1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90096);final RealVector x = solver.solve(a, b, x0);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90097);Assert.assertNotSame("x should not be a reference to x0", x0, x);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90098);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90099)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90100)==0&false)); i++) {{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90101);final double actual = x.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90102);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90103);final double delta = 1E-6 * Math.abs(expected);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90104);final String msg = String.format("entry[%d][%d]", i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90105);Assert.assertEquals(msg, expected, actual, delta);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90106);Assert.assertEquals(msg, x0.getEntry(i), 1., Math.ulp(1.));
            }
        }}
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = NonSquareOperatorException.class)
    public void testNonSquarePreconditioner() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cvaeak1xiz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,113,117,97,114,101,80,114,101,99,111,110,100,105,116,105,111,110,101,114,58,32,91,78,111,110,83,113,117,97,114,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSquareOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testNonSquarePreconditioner",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cvaeak1xiz(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90107);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90108);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90109);final RealLinearOperator m = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90110);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90111);throw new UnsupportedOperationException();
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90112);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90113);return 2;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90114);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90115);return 3;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90116);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90117);solver = new SymmLQ(10, 0., false);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90118);final ArrayRealVector b = new ArrayRealVector(a.getRowDimension());
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90119);solver.solve(a, m, b);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = DimensionMismatchException.class)
    public void testMismatchedOperatorDimensions() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng9mzt1xjc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,115,109,97,116,99,104,101,100,79,112,101,114,97,116,111,114,68,105,109,101,110,115,105,111,110,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testMismatchedOperatorDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng9mzt1xjc(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90120);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90121);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90122);final RealLinearOperator m = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90123);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90124);throw new UnsupportedOperationException();
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90125);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90126);return 3;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90127);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90128);return 3;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90129);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90130);solver = new SymmLQ(10, 0d, false);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90131);final ArrayRealVector b = new ArrayRealVector(a.getRowDimension());
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90132);solver.solve(a, m, b);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = NonPositiveDefiniteOperatorException.class)
    public void testNonPositiveDefinitePreconditioner() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyf1ao1xjp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,80,114,101,99,111,110,100,105,116,105,111,110,101,114,58,32,91,78,111,110,80,111,115,105,116,105,118,101,68,101,102,105,110,105,116,101,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonPositiveDefiniteOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testNonPositiveDefinitePreconditioner",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyf1ao1xjp(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90133);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90134);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(2, 2);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90135);a.setEntry(0, 0, 1d);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90136);a.setEntry(0, 1, 2d);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90137);a.setEntry(1, 0, 3d);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90138);a.setEntry(1, 1, 4d);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90139);final RealLinearOperator m = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90140);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90141);final ArrayRealVector y = new ArrayRealVector(2);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90142);y.setEntry(0, -x.getEntry(0));
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90143);y.setEntry(1, -x.getEntry(1));
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90144);return y;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90145);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90146);return 2;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90147);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90148);return 2;
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90149);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90150);solver = new SymmLQ(10, 0d, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90151);final ArrayRealVector b = new ArrayRealVector(2);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90152);b.setEntry(0, -1d);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90153);b.setEntry(1, -1d);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90154);solver.solve(a, m, b);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testPreconditionedSolution() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h3mwmv1xkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testPreconditionedSolution",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h3mwmv1xkb(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90155);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90156);final int n = 8;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90157);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90158);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90159);final InverseHilbertMatrix ainv = new InverseHilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90160);final RealLinearOperator m = JacobiPreconditioner.create(a);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90161);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90162);solver = new SymmLQ(maxIterations, 1E-15, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90163);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90164);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90165)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90166)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90167);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90168);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90169);final RealVector x = solver.solve(a, m, b);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90170);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90171)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90172)==0&false)); i++) {{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90173);final double actual = x.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90174);final double expected = ainv.getEntry(i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90175);final double delta = 1E-6 * Math.abs(expected);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90176);final String msg = String.format("coefficient (%d, %d)", i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90177);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testPreconditionedSolution2() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19viirb1xky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testPreconditionedSolution2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19viirb1xky(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90178);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90179);final int n = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90180);final int maxIterations = 100000;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90181);final Array2DRowRealMatrix a = new Array2DRowRealMatrix(n, n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90182);double daux = 1.;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90183);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90184)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90185)==0&false)); i++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90186);a.setEntry(i, i, daux);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90187);daux *= 1.2;
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90188);for (int j = i + 1; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90189)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90190)==0&false)); j++) {{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90191);if ((((i == j)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90192)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90193)==0&false))) {{
                } }else {{
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(90194);final double value = 1.0;
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(90195);a.setEntry(i, j, value);
                    __CLR4_4_11xdf1xdflb90pdf0.R.inc(90196);a.setEntry(j, i, value);
                }
            }}
        }}
        }__CLR4_4_11xdf1xdflb90pdf0.R.inc(90197);final RealLinearOperator m = JacobiPreconditioner.create(a);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90198);final PreconditionedIterativeLinearSolver prec;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90199);final IterativeLinearSolver unprec;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90200);prec = new SymmLQ(maxIterations, 1E-15, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90201);unprec = new SymmLQ(maxIterations, 1E-15, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90202);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90203);final String pattern = "preconditioned SymmLQ (%d iterations) should"
                               + " have been faster than unpreconditioned (%d iterations)";
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90204);String msg;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90205);for (int j = 0; (((j < 1)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90206)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90207)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90208);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90209);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90210);final RealVector px = prec.solve(a, m, b);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90211);final RealVector x = unprec.solve(a, b);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90212);final int np = prec.getIterationManager().getIterations();
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90213);final int nup = unprec.getIterationManager().getIterations();
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90214);msg = String.format(pattern, np, nup);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90215);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90216)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90217)==0&false)); i++) {{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90218);msg = String.format("row %d, column %d", i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90219);final double expected = x.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90220);final double actual = px.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90221);final double delta = 5E-5 * Math.abs(expected);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90222);Assert.assertEquals(msg, expected, actual, delta);
            }
        }}
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testEventManagement() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bpoinm1xm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testEventManagement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bpoinm1xm7(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90223);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90224);final int n = 5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90225);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90226);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90227);final IterativeLinearSolver solver;
        /*
         * count[0] = number of calls to initializationPerformed
         * count[1] = number of calls to iterationStarted
         * count[2] = number of calls to iterationPerformed
         * count[3] = number of calls to terminationPerformed
         */
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90228);final int[] count = new int[] {0, 0, 0, 0};
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90229);final RealVector xFromListener = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90230);final IterationListener listener = new IterationListener() {

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90231);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90232);++count[0];
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90233);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90234);++count[2];
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90235);Assert.assertEquals("iteration performed",
                                    count[2],
                                    e.getIterations() - 1);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90236);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90237);++count[1];
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90238);Assert.assertEquals("iteration started",
                                    count[1],
                                    e.getIterations() - 1);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90239);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90240);++count[3];
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90241);final IterativeLinearSolverEvent ilse;
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90242);ilse = (IterativeLinearSolverEvent) e;
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90243);xFromListener.setSubVector(0, ilse.getSolution());
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90244);solver = new SymmLQ(maxIterations, 1E-10, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90245);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90246);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90247);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90248)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90249)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90250);Arrays.fill(count, 0);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90251);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90252);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90253);final RealVector xFromSolver = solver.solve(a, b);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90254);String msg = String.format("column %d (initialization)", j);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90255);Assert.assertEquals(msg, 1, count[0]);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90256);msg = String.format("column %d (finalization)", j);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90257);Assert.assertEquals(msg, 1, count[3]);
            /*
             *  Check that solution is not "over-refined". When the last
             *  iteration has occurred, no further refinement should be
             *  performed.
             */
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90258);for (int i = 0; (((i < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90259)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90260)==0&false)); i++){{
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90261);msg = String.format("row %d, column %d", i, j);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90262);final double expected = xFromSolver.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90263);final double actual = xFromListener.getEntry(i);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90264);Assert.assertEquals(msg, expected, actual, 0.0);
            }
        }}
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = NonSelfAdjointOperatorException.class)
    public void testNonSelfAdjointOperator() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k3pjwr1xnd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,101,108,102,65,100,106,111,105,110,116,79,112,101,114,97,116,111,114,58,32,91,78,111,110,83,101,108,102,65,100,106,111,105,110,116,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSelfAdjointOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testNonSelfAdjointOperator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k3pjwr1xnd(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90265);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90266);final RealLinearOperator a;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90267);a = new Array2DRowRealMatrix(new double[][] {
            {1., 2., 3.},
            {2., 4., 5.},
            {2.999, 5., 6.}
        });
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90268);final RealVector b;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90269);b = new ArrayRealVector(new double[] {1., 1., 1.});
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90270);new SymmLQ(100, 1., true).solve(a, b);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test(expected = NonSelfAdjointOperatorException.class)
    public void testNonSelfAdjointPreconditioner() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nq7v0s1xnj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,111,110,83,101,108,102,65,100,106,111,105,110,116,80,114,101,99,111,110,100,105,116,105,111,110,101,114,58,32,91,78,111,110,83,101,108,102,65,100,106,111,105,110,116,79,112,101,114,97,116,111,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NonSelfAdjointOperatorException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testNonSelfAdjointPreconditioner",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nq7v0s1xnj(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90271);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90272);final RealLinearOperator a = new Array2DRowRealMatrix(new double[][] {
            {1., 2., 3.},
            {2., 4., 5.},
            {3., 5., 6.}
        });
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90273);final Array2DRowRealMatrix mMat;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90274);mMat = new Array2DRowRealMatrix(new double[][] {
            {1., 0., 1.},
            {0., 1., 0.},
            {0., 0., 1.}
        });
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90275);final DecompositionSolver mSolver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90276);mSolver = new LUDecomposition(mMat).getSolver();
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90277);final RealLinearOperator minv = new RealLinearOperator() {

            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90278);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90279);return mSolver.solve(x);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getRowDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90280);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90281);return mMat.getRowDimension();
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            @Override
            public int getColumnDimension() {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90282);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90283);return mMat.getColumnDimension();
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90284);final RealVector b = new ArrayRealVector(new double[] {
            1., 1., 1.
        });
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90285);new SymmLQ(100, 1., true).solve(a, minv, b);
    }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testUnpreconditionedNormOfResidual() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryaibl1xny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testUnpreconditionedNormOfResidual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryaibl1xny(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90286);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90287);final int n = 5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90288);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90289);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90290);final IterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90291);final IterationListener listener = new IterationListener() {

            private void doTestNormOfResidual(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90292);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90293);final IterativeLinearSolverEvent evt;
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90294);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90295);final RealVector x = evt.getSolution();
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90296);final RealVector b = evt.getRightHandSideVector();
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90297);final RealVector r = b.subtract(a.operate(x));
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90298);final double rnorm = r.getNorm();
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90299);Assert.assertEquals("iteration performed (residual)",
                    rnorm, evt.getNormOfResidual(),
                    FastMath.max(1E-5 * rnorm, 1E-10));
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90300);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90301);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90302);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90303);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90304);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90305);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90306);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90307);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90308);solver = new SymmLQ(maxIterations, 1E-10, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90309);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90310);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90311);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90312)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90313)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90314);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90315);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90316);solver.solve(a, b);
        }
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

    @Test
    public void testPreconditionedNormOfResidual() {__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceStart(getClass().getName(),90317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q6q56w1xot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11xdf1xdflb90pdf0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11xdf1xdflb90pdf0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SymmLQTest.testPreconditionedNormOfResidual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q6q56w1xot(){try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90317);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90318);final int n = 5;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90319);final int maxIterations = 100;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90320);final RealLinearOperator a = new HilbertMatrix(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90321);final JacobiPreconditioner m = JacobiPreconditioner.create(a);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90322);final RealLinearOperator p = m.sqrt();
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90323);final PreconditionedIterativeLinearSolver solver;
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90324);final IterationListener listener = new IterationListener() {

            private void doTestNormOfResidual(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90325);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90326);final IterativeLinearSolverEvent evt;
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90327);evt = (IterativeLinearSolverEvent) e;
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90328);final RealVector x = evt.getSolution();
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90329);final RealVector b = evt.getRightHandSideVector();
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90330);final RealVector r = b.subtract(a.operate(x));
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90331);final double rnorm = p.operate(r).getNorm();
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90332);Assert.assertEquals("iteration performed (residual)",
                    rnorm, evt.getNormOfResidual(),
                    FastMath.max(1E-5 * rnorm, 1E-10));
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void initializationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90333);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90334);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void iterationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90335);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90336);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void iterationStarted(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90337);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90338);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}

            public void terminationPerformed(final IterationEvent e) {try{__CLR4_4_11xdf1xdflb90pdf0.R.inc(90339);
                __CLR4_4_11xdf1xdflb90pdf0.R.inc(90340);doTestNormOfResidual(e);
            }finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
        };
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90341);solver = new SymmLQ(maxIterations, 1E-10, true);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90342);solver.getIterationManager().addIterationListener(listener);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90343);final RealVector b = new ArrayRealVector(n);
        __CLR4_4_11xdf1xdflb90pdf0.R.inc(90344);for (int j = 0; (((j < n)&&(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90345)!=0|true))||(__CLR4_4_11xdf1xdflb90pdf0.R.iget(90346)==0&false)); j++) {{
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90347);b.set(0.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90348);b.setEntry(j, 1.);
            __CLR4_4_11xdf1xdflb90pdf0.R.inc(90349);solver.solve(a, m, b);
        }
    }}finally{__CLR4_4_11xdf1xdflb90pdf0.R.flushNeeded();}}
}

