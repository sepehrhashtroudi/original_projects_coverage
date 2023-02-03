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
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.SumSincFunction;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link PowellOptimizer}.
 */
public class PowellOptimizerTest {static class __CLR4_4_1227p227plb90pdtg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,96300,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=MathUnsupportedOperationException.class)
    public void testBoundsUnsupported() {__CLR4_4_1227p227plb90pdtg.R.globalSliceStart(getClass().getName(),96181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198v7md227p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,111,117,110,100,115,85,110,115,117,112,112,111,114,116,101,100,58,32,91,77,97,116,104,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathUnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1227p227plb90pdtg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1227p227plb90pdtg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest.testBoundsUnsupported",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198v7md227p(){try{__CLR4_4_1227p227plb90pdtg.R.inc(96181);
        __CLR4_4_1227p227plb90pdtg.R.inc(96182);final MultivariateFunction func = new SumSincFunction(-1);
        __CLR4_4_1227p227plb90pdtg.R.inc(96183);final PowellOptimizer optim = new PowellOptimizer(1e-8, 1e-5,
                                                          1e-4, 1e-4);

        __CLR4_4_1227p227plb90pdtg.R.inc(96184);optim.optimize(new MaxEval(100),
                       new ObjectiveFunction(func),
                       GoalType.MINIMIZE,
                       new InitialGuess(new double[] { -3, 0 }),
                       new SimpleBounds(new double[] { -5, -1 },
                                        new double[] { 5, 1 }));
    }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}

    @Test
    public void testSumSinc() {__CLR4_4_1227p227plb90pdtg.R.globalSliceStart(getClass().getName(),96185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vfcfp227t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1227p227plb90pdtg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1227p227plb90pdtg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest.testSumSinc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vfcfp227t(){try{__CLR4_4_1227p227plb90pdtg.R.inc(96185);
        __CLR4_4_1227p227plb90pdtg.R.inc(96186);final MultivariateFunction func = new SumSincFunction(-1);

        __CLR4_4_1227p227plb90pdtg.R.inc(96187);int dim = 2;
        __CLR4_4_1227p227plb90pdtg.R.inc(96188);final double[] minPoint = new double[dim];
        __CLR4_4_1227p227plb90pdtg.R.inc(96189);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96190)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96191)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96192);minPoint[i] = 0;
        }

        }__CLR4_4_1227p227plb90pdtg.R.inc(96193);double[] init = new double[dim];

        // Initial is minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96194);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96195)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96196)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96197);init[i] = minPoint[i];
        }
        }__CLR4_4_1227p227plb90pdtg.R.inc(96198);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-9);

        // Initial is far from minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96199);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96200)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96201)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96202);init[i] = minPoint[i] + 3;
        }
        }__CLR4_4_1227p227plb90pdtg.R.inc(96203);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-5);
        // More stringent line search tolerance enhances the precision
        // of the result.
        __CLR4_4_1227p227plb90pdtg.R.inc(96204);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-9, 1e-7);
    }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}

    @Test
    public void testQuadratic() {__CLR4_4_1227p227plb90pdtg.R.globalSliceStart(getClass().getName(),96205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssocod228d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1227p227plb90pdtg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1227p227plb90pdtg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest.testQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssocod228d(){try{__CLR4_4_1227p227plb90pdtg.R.inc(96205);
        __CLR4_4_1227p227plb90pdtg.R.inc(96206);final MultivariateFunction func = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_1227p227plb90pdtg.R.inc(96207);
                    __CLR4_4_1227p227plb90pdtg.R.inc(96208);final double a = x[0] - 1;
                    __CLR4_4_1227p227plb90pdtg.R.inc(96209);final double b = x[1] - 1;
                    __CLR4_4_1227p227plb90pdtg.R.inc(96210);return a * a + b * b + 1;
                }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}
            };

        __CLR4_4_1227p227plb90pdtg.R.inc(96211);int dim = 2;
        __CLR4_4_1227p227plb90pdtg.R.inc(96212);final double[] minPoint = new double[dim];
        __CLR4_4_1227p227plb90pdtg.R.inc(96213);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96214)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96215)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96216);minPoint[i] = 1;
        }

        }__CLR4_4_1227p227plb90pdtg.R.inc(96217);double[] init = new double[dim];

        // Initial is minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96218);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96219)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96220)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96221);init[i] = minPoint[i];
        }
        }__CLR4_4_1227p227plb90pdtg.R.inc(96222);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-8);

        // Initial is far from minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96223);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96224)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96225)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96226);init[i] = minPoint[i] - 20;
        }
        }__CLR4_4_1227p227plb90pdtg.R.inc(96227);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-8);
    }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}

    @Test
    public void testMaximizeQuadratic() {__CLR4_4_1227p227plb90pdtg.R.globalSliceStart(getClass().getName(),96228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p48tkv2290();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1227p227plb90pdtg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1227p227plb90pdtg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest.testMaximizeQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p48tkv2290(){try{__CLR4_4_1227p227plb90pdtg.R.inc(96228);
        __CLR4_4_1227p227plb90pdtg.R.inc(96229);final MultivariateFunction func = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_1227p227plb90pdtg.R.inc(96230);
                    __CLR4_4_1227p227plb90pdtg.R.inc(96231);final double a = x[0] - 1;
                    __CLR4_4_1227p227plb90pdtg.R.inc(96232);final double b = x[1] - 1;
                    __CLR4_4_1227p227plb90pdtg.R.inc(96233);return -a * a - b * b + 1;
                }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}
            };

        __CLR4_4_1227p227plb90pdtg.R.inc(96234);int dim = 2;
        __CLR4_4_1227p227plb90pdtg.R.inc(96235);final double[] maxPoint = new double[dim];
        __CLR4_4_1227p227plb90pdtg.R.inc(96236);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96237)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96238)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96239);maxPoint[i] = 1;
        }

        }__CLR4_4_1227p227plb90pdtg.R.inc(96240);double[] init = new double[dim];

        // Initial is minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96241);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96242)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96243)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96244);init[i] = maxPoint[i];
        }
        }__CLR4_4_1227p227plb90pdtg.R.inc(96245);doTest(func, maxPoint, init,  GoalType.MAXIMIZE, 1e-9, 1e-8);

        // Initial is far from minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96246);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96247)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96248)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96249);init[i] = maxPoint[i] - 20;
        }
        }__CLR4_4_1227p227plb90pdtg.R.inc(96250);doTest(func, maxPoint, init, GoalType.MAXIMIZE, 1e-9, 1e-8);
    }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}

    /**
     * Ensure that we do not increase the number of function evaluations when
     * the function values are scaled up.
     * Note that the tolerances parameters passed to the constructor must
     * still hold sensible values because they are used to set the line search
     * tolerances.
     */
    @Test
    public void testRelativeToleranceOnScaledValues() {__CLR4_4_1227p227plb90pdtg.R.globalSliceStart(getClass().getName(),96251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1do3mmn229n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1227p227plb90pdtg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1227p227plb90pdtg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest.testRelativeToleranceOnScaledValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),96251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1do3mmn229n(){try{__CLR4_4_1227p227plb90pdtg.R.inc(96251);
        __CLR4_4_1227p227plb90pdtg.R.inc(96252);final MultivariateFunction func = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_1227p227plb90pdtg.R.inc(96253);
                    __CLR4_4_1227p227plb90pdtg.R.inc(96254);final double a = x[0] - 1;
                    __CLR4_4_1227p227plb90pdtg.R.inc(96255);final double b = x[1] - 1;
                    __CLR4_4_1227p227plb90pdtg.R.inc(96256);return a * a * FastMath.sqrt(FastMath.abs(a)) + b * b + 1;
                }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}
            };

        __CLR4_4_1227p227plb90pdtg.R.inc(96257);int dim = 2;
        __CLR4_4_1227p227plb90pdtg.R.inc(96258);final double[] minPoint = new double[dim];
        __CLR4_4_1227p227plb90pdtg.R.inc(96259);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96260)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96261)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96262);minPoint[i] = 1;
        }

        }__CLR4_4_1227p227plb90pdtg.R.inc(96263);double[] init = new double[dim];
        // Initial is far from minimum.
        __CLR4_4_1227p227plb90pdtg.R.inc(96264);for (int i = 0; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96265)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96266)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96267);init[i] = minPoint[i] - 20;
        }

        }__CLR4_4_1227p227plb90pdtg.R.inc(96268);final double relTol = 1e-10;

        __CLR4_4_1227p227plb90pdtg.R.inc(96269);final int maxEval = 1000;
        // Very small absolute tolerance to rely solely on the relative
        // tolerance as a stopping criterion
        __CLR4_4_1227p227plb90pdtg.R.inc(96270);final PowellOptimizer optim = new PowellOptimizer(relTol, 1e-100);

        __CLR4_4_1227p227plb90pdtg.R.inc(96271);final PointValuePair funcResult = optim.optimize(new MaxEval(maxEval),
                                                         new ObjectiveFunction(func),
                                                         GoalType.MINIMIZE,
                                                         new InitialGuess(init));
        __CLR4_4_1227p227plb90pdtg.R.inc(96272);final double funcValue = func.value(funcResult.getPoint());
        __CLR4_4_1227p227plb90pdtg.R.inc(96273);final int funcEvaluations = optim.getEvaluations();

        __CLR4_4_1227p227plb90pdtg.R.inc(96274);final double scale = 1e10;
        __CLR4_4_1227p227plb90pdtg.R.inc(96275);final MultivariateFunction funcScaled = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_1227p227plb90pdtg.R.inc(96276);
                    __CLR4_4_1227p227plb90pdtg.R.inc(96277);return scale * func.value(x);
                }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}
            };

        __CLR4_4_1227p227plb90pdtg.R.inc(96278);final PointValuePair funcScaledResult = optim.optimize(new MaxEval(maxEval),
                                                               new ObjectiveFunction(funcScaled),
                                                               GoalType.MINIMIZE,
                                                               new InitialGuess(init));
        __CLR4_4_1227p227plb90pdtg.R.inc(96279);final double funcScaledValue = funcScaled.value(funcScaledResult.getPoint());
        __CLR4_4_1227p227plb90pdtg.R.inc(96280);final int funcScaledEvaluations = optim.getEvaluations();

        // Check that both minima provide the same objective funciton values,
        // within the relative function tolerance.
        __CLR4_4_1227p227plb90pdtg.R.inc(96281);Assert.assertEquals(1, funcScaledValue / (scale * funcValue), relTol);

        // Check that the numbers of evaluations are the same.
        __CLR4_4_1227p227plb90pdtg.R.inc(96282);Assert.assertEquals(funcEvaluations, funcScaledEvaluations);
    }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}

    /**
     * @param func Function to optimize.
     * @param optimum Expected optimum.
     * @param init Starting point.
     * @param goal Minimization or maximization.
     * @param fTol Tolerance (relative error on the objective function) for
     * "Powell" algorithm.
     * @param pointTol Tolerance for checking that the optimum is correct.
     */
    private void doTest(MultivariateFunction func,
                        double[] optimum,
                        double[] init,
                        GoalType goal,
                        double fTol,
                        double pointTol) {try{__CLR4_4_1227p227plb90pdtg.R.inc(96283);
        __CLR4_4_1227p227plb90pdtg.R.inc(96284);final PowellOptimizer optim = new PowellOptimizer(fTol, Math.ulp(1d));

        __CLR4_4_1227p227plb90pdtg.R.inc(96285);final PointValuePair result = optim.optimize(new MaxEval(1000),
                                                     new ObjectiveFunction(func),
                                                     goal,
                                                     new InitialGuess(init));
        __CLR4_4_1227p227plb90pdtg.R.inc(96286);final double[] point = result.getPoint();

        __CLR4_4_1227p227plb90pdtg.R.inc(96287);for (int i = 0, dim = optimum.length; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96288)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96289)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96290);Assert.assertEquals("found[" + i + "]=" + point[i] + " value=" + result.getValue(),
                                optimum[i], point[i], pointTol);
        }
    }}finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}

    /**
     * @param func Function to optimize.
     * @param optimum Expected optimum.
     * @param init Starting point.
     * @param goal Minimization or maximization.
     * @param fTol Tolerance (relative error on the objective function) for
     * "Powell" algorithm.
     * @param fLineTol Tolerance (relative error on the objective function)
     * for the internal line search algorithm.
     * @param pointTol Tolerance for checking that the optimum is correct.
     */
    private void doTest(MultivariateFunction func,
                        double[] optimum,
                        double[] init,
                        GoalType goal,
                        double fTol,
                        double fLineTol,
                        double pointTol) {try{__CLR4_4_1227p227plb90pdtg.R.inc(96291);
        __CLR4_4_1227p227plb90pdtg.R.inc(96292);final PowellOptimizer optim = new PowellOptimizer(fTol, Math.ulp(1d),
                                                          fLineTol, Math.ulp(1d));

        __CLR4_4_1227p227plb90pdtg.R.inc(96293);final PointValuePair result = optim.optimize(new MaxEval(1000),
                                                     new ObjectiveFunction(func),
                                                     goal,
                                                     new InitialGuess(init));
        __CLR4_4_1227p227plb90pdtg.R.inc(96294);final double[] point = result.getPoint();

        __CLR4_4_1227p227plb90pdtg.R.inc(96295);for (int i = 0, dim = optimum.length; (((i < dim)&&(__CLR4_4_1227p227plb90pdtg.R.iget(96296)!=0|true))||(__CLR4_4_1227p227plb90pdtg.R.iget(96297)==0&false)); i++) {{
            __CLR4_4_1227p227plb90pdtg.R.inc(96298);Assert.assertEquals("found[" + i + "]=" + point[i] + " value=" + result.getValue(),
                                optimum[i], point[i], pointTol);
        }

        }__CLR4_4_1227p227plb90pdtg.R.inc(96299);Assert.assertTrue(optim.getIterations() > 0);
    }finally{__CLR4_4_1227p227plb90pdtg.R.flushNeeded();}}
}
