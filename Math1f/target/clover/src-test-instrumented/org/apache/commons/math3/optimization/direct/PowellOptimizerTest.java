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
package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.SumSincFunction;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link PowellOptimizer}.
 */
public class PowellOptimizerTest {static class __CLR4_4_124tf24tflb90pdzt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,99669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSumSinc() {__CLR4_4_124tf24tflb90pdzt.R.globalSliceStart(getClass().getName(),99555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vfcfp24tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124tf24tflb90pdzt.R.rethrow($CLV_t2$);}finally{__CLR4_4_124tf24tflb90pdzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.PowellOptimizerTest.testSumSinc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vfcfp24tf(){try{__CLR4_4_124tf24tflb90pdzt.R.inc(99555);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99556);final MultivariateFunction func = new SumSincFunction(-1);

        __CLR4_4_124tf24tflb90pdzt.R.inc(99557);int dim = 2;
        __CLR4_4_124tf24tflb90pdzt.R.inc(99558);final double[] minPoint = new double[dim];
        __CLR4_4_124tf24tflb90pdzt.R.inc(99559);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99560)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99561)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99562);minPoint[i] = 0;
        }

        }__CLR4_4_124tf24tflb90pdzt.R.inc(99563);double[] init = new double[dim];

        // Initial is minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99564);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99565)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99566)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99567);init[i] = minPoint[i];
        }
        }__CLR4_4_124tf24tflb90pdzt.R.inc(99568);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-9);

        // Initial is far from minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99569);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99570)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99571)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99572);init[i] = minPoint[i] + 3;
        }
        }__CLR4_4_124tf24tflb90pdzt.R.inc(99573);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-5);
        // More stringent line search tolerance enhances the precision
        // of the result.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99574);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-9, 1e-7);
    }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}

    @Test
    public void testQuadratic() {__CLR4_4_124tf24tflb90pdzt.R.globalSliceStart(getClass().getName(),99575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ssocod24tz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124tf24tflb90pdzt.R.rethrow($CLV_t2$);}finally{__CLR4_4_124tf24tflb90pdzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.PowellOptimizerTest.testQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ssocod24tz(){try{__CLR4_4_124tf24tflb90pdzt.R.inc(99575);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99576);final MultivariateFunction func = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_124tf24tflb90pdzt.R.inc(99577);
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99578);final double a = x[0] - 1;
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99579);final double b = x[1] - 1;
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99580);return a * a + b * b + 1;
                }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}
            };

        __CLR4_4_124tf24tflb90pdzt.R.inc(99581);int dim = 2;
        __CLR4_4_124tf24tflb90pdzt.R.inc(99582);final double[] minPoint = new double[dim];
        __CLR4_4_124tf24tflb90pdzt.R.inc(99583);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99584)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99585)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99586);minPoint[i] = 1;
        }

        }__CLR4_4_124tf24tflb90pdzt.R.inc(99587);double[] init = new double[dim];

        // Initial is minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99588);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99589)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99590)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99591);init[i] = minPoint[i];
        }
        }__CLR4_4_124tf24tflb90pdzt.R.inc(99592);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-8);

        // Initial is far from minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99593);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99594)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99595)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99596);init[i] = minPoint[i] - 20;
        }
        }__CLR4_4_124tf24tflb90pdzt.R.inc(99597);doTest(func, minPoint, init, GoalType.MINIMIZE, 1e-9, 1e-8);
    }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}

    @Test
    public void testMaximizeQuadratic() {__CLR4_4_124tf24tflb90pdzt.R.globalSliceStart(getClass().getName(),99598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p48tkv24um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124tf24tflb90pdzt.R.rethrow($CLV_t2$);}finally{__CLR4_4_124tf24tflb90pdzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.PowellOptimizerTest.testMaximizeQuadratic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p48tkv24um(){try{__CLR4_4_124tf24tflb90pdzt.R.inc(99598);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99599);final MultivariateFunction func = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_124tf24tflb90pdzt.R.inc(99600);
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99601);final double a = x[0] - 1;
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99602);final double b = x[1] - 1;
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99603);return -a * a - b * b + 1;
                }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}
            };

        __CLR4_4_124tf24tflb90pdzt.R.inc(99604);int dim = 2;
        __CLR4_4_124tf24tflb90pdzt.R.inc(99605);final double[] maxPoint = new double[dim];
        __CLR4_4_124tf24tflb90pdzt.R.inc(99606);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99607)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99608)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99609);maxPoint[i] = 1;
        }

        }__CLR4_4_124tf24tflb90pdzt.R.inc(99610);double[] init = new double[dim];

        // Initial is minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99611);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99612)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99613)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99614);init[i] = maxPoint[i];
        }
        }__CLR4_4_124tf24tflb90pdzt.R.inc(99615);doTest(func, maxPoint, init,  GoalType.MAXIMIZE, 1e-9, 1e-8);

        // Initial is far from minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99616);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99617)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99618)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99619);init[i] = maxPoint[i] - 20;
        }
        }__CLR4_4_124tf24tflb90pdzt.R.inc(99620);doTest(func, maxPoint, init, GoalType.MAXIMIZE, 1e-9, 1e-8);
    }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}

    /**
     * Ensure that we do not increase the number of function evaluations when
     * the function values are scaled up.
     * Note that the tolerances parameters passed to the constructor must
     * still hold sensible values because they are used to set the line search
     * tolerances.
     */
    @Test
    public void testRelativeToleranceOnScaledValues() {__CLR4_4_124tf24tflb90pdzt.R.globalSliceStart(getClass().getName(),99621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1do3mmn24v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_124tf24tflb90pdzt.R.rethrow($CLV_t2$);}finally{__CLR4_4_124tf24tflb90pdzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.optimization.direct.PowellOptimizerTest.testRelativeToleranceOnScaledValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),99621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1do3mmn24v9(){try{__CLR4_4_124tf24tflb90pdzt.R.inc(99621);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99622);final MultivariateFunction func = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_124tf24tflb90pdzt.R.inc(99623);
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99624);final double a = x[0] - 1;
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99625);final double b = x[1] - 1;
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99626);return a * a * FastMath.sqrt(FastMath.abs(a)) + b * b + 1;
                }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}
            };

        __CLR4_4_124tf24tflb90pdzt.R.inc(99627);int dim = 2;
        __CLR4_4_124tf24tflb90pdzt.R.inc(99628);final double[] minPoint = new double[dim];
        __CLR4_4_124tf24tflb90pdzt.R.inc(99629);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99630)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99631)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99632);minPoint[i] = 1;
        }

        }__CLR4_4_124tf24tflb90pdzt.R.inc(99633);double[] init = new double[dim];
        // Initial is far from minimum.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99634);for (int i = 0; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99635)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99636)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99637);init[i] = minPoint[i] - 20;
        }

        }__CLR4_4_124tf24tflb90pdzt.R.inc(99638);final double relTol = 1e-10;

        __CLR4_4_124tf24tflb90pdzt.R.inc(99639);final int maxEval = 1000;
        // Very small absolute tolerance to rely solely on the relative
        // tolerance as a stopping criterion
        __CLR4_4_124tf24tflb90pdzt.R.inc(99640);final MultivariateOptimizer optim = new PowellOptimizer(relTol, 1e-100);

        __CLR4_4_124tf24tflb90pdzt.R.inc(99641);final PointValuePair funcResult = optim.optimize(maxEval, func, GoalType.MINIMIZE, init);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99642);final double funcValue = func.value(funcResult.getPoint());
        __CLR4_4_124tf24tflb90pdzt.R.inc(99643);final int funcEvaluations = optim.getEvaluations();

        __CLR4_4_124tf24tflb90pdzt.R.inc(99644);final double scale = 1e10;
        __CLR4_4_124tf24tflb90pdzt.R.inc(99645);final MultivariateFunction funcScaled = new MultivariateFunction() {
                public double value(double[] x) {try{__CLR4_4_124tf24tflb90pdzt.R.inc(99646);
                    __CLR4_4_124tf24tflb90pdzt.R.inc(99647);return scale * func.value(x);
                }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}
            };

        __CLR4_4_124tf24tflb90pdzt.R.inc(99648);final PointValuePair funcScaledResult = optim.optimize(maxEval, funcScaled, GoalType.MINIMIZE, init);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99649);final double funcScaledValue = funcScaled.value(funcScaledResult.getPoint());
        __CLR4_4_124tf24tflb90pdzt.R.inc(99650);final int funcScaledEvaluations = optim.getEvaluations();

        // Check that both minima provide the same objective funciton values,
        // within the relative function tolerance.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99651);Assert.assertEquals(1, funcScaledValue / (scale * funcValue), relTol);

        // Check that the numbers of evaluations are the same.
        __CLR4_4_124tf24tflb90pdzt.R.inc(99652);Assert.assertEquals(funcEvaluations, funcScaledEvaluations);
    }finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}

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
                        double pointTol) {try{__CLR4_4_124tf24tflb90pdzt.R.inc(99653);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99654);final MultivariateOptimizer optim = new PowellOptimizer(fTol, Math.ulp(1d));

        __CLR4_4_124tf24tflb90pdzt.R.inc(99655);final PointValuePair result = optim.optimize(1000, func, goal, init);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99656);final double[] point = result.getPoint();

        __CLR4_4_124tf24tflb90pdzt.R.inc(99657);for (int i = 0, dim = optimum.length; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99658)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99659)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99660);Assert.assertEquals("found[" + i + "]=" + point[i] + " value=" + result.getValue(),
                                optimum[i], point[i], pointTol);
        }
    }}finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}

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
                        double pointTol) {try{__CLR4_4_124tf24tflb90pdzt.R.inc(99661);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99662);final MultivariateOptimizer optim = new PowellOptimizer(fTol, Math.ulp(1d),
                                                                fLineTol, Math.ulp(1d));

        __CLR4_4_124tf24tflb90pdzt.R.inc(99663);final PointValuePair result = optim.optimize(1000, func, goal, init);
        __CLR4_4_124tf24tflb90pdzt.R.inc(99664);final double[] point = result.getPoint();

        __CLR4_4_124tf24tflb90pdzt.R.inc(99665);for (int i = 0, dim = optimum.length; (((i < dim)&&(__CLR4_4_124tf24tflb90pdzt.R.iget(99666)!=0|true))||(__CLR4_4_124tf24tflb90pdzt.R.iget(99667)==0&false)); i++) {{
            __CLR4_4_124tf24tflb90pdzt.R.inc(99668);Assert.assertEquals("found[" + i + "]=" + point[i] + " value=" + result.getValue(),
                                optimum[i], point[i], pointTol);
        }
    }}finally{__CLR4_4_124tf24tflb90pdzt.R.flushNeeded();}}
}
