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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer;
import org.apache.commons.math3.optim.univariate.BracketFinder;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.commons.math3.optim.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.optim.univariate.SearchInterval;
import org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction;

/**
 * Powell's algorithm.
 * This code is translated and adapted from the Python version of this
 * algorithm (as implemented in module {@code optimize.py} v0.5 of
 * <em>SciPy</em>).
 * <br/>
 * The default stopping criterion is based on the differences of the
 * function value between two successive iterations. It is however possible
 * to define a custom convergence checker that might terminate the algorithm
 * earlier.
 * <br/>
 * The internal line search optimizer is a {@link BrentOptimizer} with a
 * convergence checker set to {@link SimpleUnivariateValueChecker}.
 * <br/>
 * Constraints are not supported: the call to
 * {@link #optimize(OptimizationData[]) optimize} will throw
 * {@link MathUnsupportedOperationException} if bounds are passed to it.
 * In order to impose simple constraints, the objective function must be
 * wrapped in an adapter like
 * {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapter
 * MultivariateFunctionMappingAdapter} or
 * {@link org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionPenaltyAdapter
 * MultivariateFunctionPenaltyAdapter}.
 *
 * @version $Id$
 * @since 2.2
 */
public class PowellOptimizer
    extends MultivariateOptimizer {public static class __CLR4_4_1uizuizlb90p9tm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,39699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Minimum relative tolerance.
     */
    private static final double MIN_RELATIVE_TOLERANCE = 2 * FastMath.ulp(1d);
    /**
     * Relative threshold.
     */
    private final double relativeThreshold;
    /**
     * Absolute threshold.
     */
    private final double absoluteThreshold;
    /**
     * Line search.
     */
    private final LineSearch line;

    /**
     * This constructor allows to specify a user-defined convergence checker,
     * in addition to the parameters that control the default convergence
     * checking procedure.
     * <br/>
     * The internal line search tolerances are set to the square-root of their
     * corresponding value in the multivariate optimizer.
     *
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     * @param checker Convergence checker.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     */
    public PowellOptimizer(double rel,
                           double abs,
                           ConvergenceChecker<PointValuePair> checker) {
        this(rel, abs, FastMath.sqrt(rel), FastMath.sqrt(abs), checker);__CLR4_4_1uizuizlb90p9tm.R.inc(39564);try{__CLR4_4_1uizuizlb90p9tm.R.inc(39563);
    }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

    /**
     * This constructor allows to specify a user-defined convergence checker,
     * in addition to the parameters that control the default convergence
     * checking procedure and the line search tolerances.
     *
     * @param rel Relative threshold for this optimizer.
     * @param abs Absolute threshold for this optimizer.
     * @param lineRel Relative threshold for the internal line search optimizer.
     * @param lineAbs Absolute threshold for the internal line search optimizer.
     * @param checker Convergence checker.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     */
    public PowellOptimizer(double rel,
                           double abs,
                           double lineRel,
                           double lineAbs,
                           ConvergenceChecker<PointValuePair> checker) {
        super(checker);__CLR4_4_1uizuizlb90p9tm.R.inc(39566);try{__CLR4_4_1uizuizlb90p9tm.R.inc(39565);

        __CLR4_4_1uizuizlb90p9tm.R.inc(39567);if ((((rel < MIN_RELATIVE_TOLERANCE)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39568)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39569)==0&false))) {{
            __CLR4_4_1uizuizlb90p9tm.R.inc(39570);throw new NumberIsTooSmallException(rel, MIN_RELATIVE_TOLERANCE, true);
        }
        }__CLR4_4_1uizuizlb90p9tm.R.inc(39571);if ((((abs <= 0)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39572)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39573)==0&false))) {{
            __CLR4_4_1uizuizlb90p9tm.R.inc(39574);throw new NotStrictlyPositiveException(abs);
        }
        }__CLR4_4_1uizuizlb90p9tm.R.inc(39575);relativeThreshold = rel;
        __CLR4_4_1uizuizlb90p9tm.R.inc(39576);absoluteThreshold = abs;

        // Create the line search optimizer.
        __CLR4_4_1uizuizlb90p9tm.R.inc(39577);line = new LineSearch(lineRel,
                              lineAbs);
    }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

    /**
     * The parameters control the default convergence checking procedure.
     * <br/>
     * The internal line search tolerances are set to the square-root of their
     * corresponding value in the multivariate optimizer.
     *
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     */
    public PowellOptimizer(double rel,
                           double abs) {
        this(rel, abs, null);__CLR4_4_1uizuizlb90p9tm.R.inc(39579);try{__CLR4_4_1uizuizlb90p9tm.R.inc(39578);
    }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

    /**
     * Builds an instance with the default convergence checking procedure.
     *
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     * @param lineRel Relative threshold for the internal line search optimizer.
     * @param lineAbs Absolute threshold for the internal line search optimizer.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     */
    public PowellOptimizer(double rel,
                           double abs,
                           double lineRel,
                           double lineAbs) {
        this(rel, abs, lineRel, lineAbs, null);__CLR4_4_1uizuizlb90p9tm.R.inc(39581);try{__CLR4_4_1uizuizlb90p9tm.R.inc(39580);
    }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1uizuizlb90p9tm.R.inc(39582);
        __CLR4_4_1uizuizlb90p9tm.R.inc(39583);checkParameters();

        __CLR4_4_1uizuizlb90p9tm.R.inc(39584);final GoalType goal = getGoalType();
        __CLR4_4_1uizuizlb90p9tm.R.inc(39585);final double[] guess = getStartPoint();
        __CLR4_4_1uizuizlb90p9tm.R.inc(39586);final int n = guess.length;

        __CLR4_4_1uizuizlb90p9tm.R.inc(39587);final double[][] direc = new double[n][n];
        __CLR4_4_1uizuizlb90p9tm.R.inc(39588);for (int i = 0; (((i < n)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39589)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39590)==0&false)); i++) {{
            __CLR4_4_1uizuizlb90p9tm.R.inc(39591);direc[i][i] = 1;
        }

        }__CLR4_4_1uizuizlb90p9tm.R.inc(39592);final ConvergenceChecker<PointValuePair> checker
            = getConvergenceChecker();

        __CLR4_4_1uizuizlb90p9tm.R.inc(39593);double[] x = guess;
        __CLR4_4_1uizuizlb90p9tm.R.inc(39594);double fVal = computeObjectiveValue(x);
        __CLR4_4_1uizuizlb90p9tm.R.inc(39595);double[] x1 = x.clone();
        __CLR4_4_1uizuizlb90p9tm.R.inc(39596);while (true) {{
            __CLR4_4_1uizuizlb90p9tm.R.inc(39597);incrementIterationCount();

            __CLR4_4_1uizuizlb90p9tm.R.inc(39598);double fX = fVal;
            __CLR4_4_1uizuizlb90p9tm.R.inc(39599);double fX2 = 0;
            __CLR4_4_1uizuizlb90p9tm.R.inc(39600);double delta = 0;
            __CLR4_4_1uizuizlb90p9tm.R.inc(39601);int bigInd = 0;
            __CLR4_4_1uizuizlb90p9tm.R.inc(39602);double alphaMin = 0;

            __CLR4_4_1uizuizlb90p9tm.R.inc(39603);for (int i = 0; (((i < n)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39604)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39605)==0&false)); i++) {{
                __CLR4_4_1uizuizlb90p9tm.R.inc(39606);final double[] d = MathArrays.copyOf(direc[i]);

                __CLR4_4_1uizuizlb90p9tm.R.inc(39607);fX2 = fVal;

                __CLR4_4_1uizuizlb90p9tm.R.inc(39608);final UnivariatePointValuePair optimum = line.search(x, d);
                __CLR4_4_1uizuizlb90p9tm.R.inc(39609);fVal = optimum.getValue();
                __CLR4_4_1uizuizlb90p9tm.R.inc(39610);alphaMin = optimum.getPoint();
                __CLR4_4_1uizuizlb90p9tm.R.inc(39611);final double[][] result = newPointAndDirection(x, d, alphaMin);
                __CLR4_4_1uizuizlb90p9tm.R.inc(39612);x = result[0];

                __CLR4_4_1uizuizlb90p9tm.R.inc(39613);if (((((fX2 - fVal) > delta)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39614)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39615)==0&false))) {{
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39616);delta = fX2 - fVal;
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39617);bigInd = i;
                }
            }}

            // Default convergence check.
            }__CLR4_4_1uizuizlb90p9tm.R.inc(39618);boolean stop = 2 * (fX - fVal) <=
                (relativeThreshold * (FastMath.abs(fX) + FastMath.abs(fVal)) +
                 absoluteThreshold);

            __CLR4_4_1uizuizlb90p9tm.R.inc(39619);final PointValuePair previous = new PointValuePair(x1, fX);
            __CLR4_4_1uizuizlb90p9tm.R.inc(39620);final PointValuePair current = new PointValuePair(x, fVal);
            __CLR4_4_1uizuizlb90p9tm.R.inc(39621);if ((((!stop && checker != null)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39622)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39623)==0&false))) {{ // User-defined stopping criteria.
                __CLR4_4_1uizuizlb90p9tm.R.inc(39624);stop = checker.converged(getIterations(), previous, current);
            }
            }__CLR4_4_1uizuizlb90p9tm.R.inc(39625);if ((((stop)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39626)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39627)==0&false))) {{
                __CLR4_4_1uizuizlb90p9tm.R.inc(39628);if ((((goal == GoalType.MINIMIZE)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39629)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39630)==0&false))) {{
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39631);return ((((fVal < fX) )&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39632)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39633)==0&false))? current : previous;
                } }else {{
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39634);return ((((fVal > fX) )&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39635)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39636)==0&false))? current : previous;
                }
            }}

            }__CLR4_4_1uizuizlb90p9tm.R.inc(39637);final double[] d = new double[n];
            __CLR4_4_1uizuizlb90p9tm.R.inc(39638);final double[] x2 = new double[n];
            __CLR4_4_1uizuizlb90p9tm.R.inc(39639);for (int i = 0; (((i < n)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39640)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39641)==0&false)); i++) {{
                __CLR4_4_1uizuizlb90p9tm.R.inc(39642);d[i] = x[i] - x1[i];
                __CLR4_4_1uizuizlb90p9tm.R.inc(39643);x2[i] = 2 * x[i] - x1[i];
            }

            }__CLR4_4_1uizuizlb90p9tm.R.inc(39644);x1 = x.clone();
            __CLR4_4_1uizuizlb90p9tm.R.inc(39645);fX2 = computeObjectiveValue(x2);

            __CLR4_4_1uizuizlb90p9tm.R.inc(39646);if ((((fX > fX2)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39647)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39648)==0&false))) {{
                __CLR4_4_1uizuizlb90p9tm.R.inc(39649);double t = 2 * (fX + fX2 - 2 * fVal);
                __CLR4_4_1uizuizlb90p9tm.R.inc(39650);double temp = fX - fVal - delta;
                __CLR4_4_1uizuizlb90p9tm.R.inc(39651);t *= temp * temp;
                __CLR4_4_1uizuizlb90p9tm.R.inc(39652);temp = fX - fX2;
                __CLR4_4_1uizuizlb90p9tm.R.inc(39653);t -= delta * temp * temp;

                __CLR4_4_1uizuizlb90p9tm.R.inc(39654);if ((((t < 0.0)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39655)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39656)==0&false))) {{
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39657);final UnivariatePointValuePair optimum = line.search(x, d);
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39658);fVal = optimum.getValue();
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39659);alphaMin = optimum.getPoint();
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39660);final double[][] result = newPointAndDirection(x, d, alphaMin);
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39661);x = result[0];

                    __CLR4_4_1uizuizlb90p9tm.R.inc(39662);final int lastInd = n - 1;
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39663);direc[bigInd] = direc[lastInd];
                    __CLR4_4_1uizuizlb90p9tm.R.inc(39664);direc[lastInd] = result[1];
                }
            }}
        }}
    }}finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

    /**
     * Compute a new point (in the original space) and a new direction
     * vector, resulting from the line search.
     *
     * @param p Point used in the line search.
     * @param d Direction used in the line search.
     * @param optimum Optimum found by the line search.
     * @return a 2-element array containing the new point (at index 0) and
     * the new direction (at index 1).
     */
    private double[][] newPointAndDirection(double[] p,
                                            double[] d,
                                            double optimum) {try{__CLR4_4_1uizuizlb90p9tm.R.inc(39665);
        __CLR4_4_1uizuizlb90p9tm.R.inc(39666);final int n = p.length;
        __CLR4_4_1uizuizlb90p9tm.R.inc(39667);final double[] nP = new double[n];
        __CLR4_4_1uizuizlb90p9tm.R.inc(39668);final double[] nD = new double[n];
        __CLR4_4_1uizuizlb90p9tm.R.inc(39669);for (int i = 0; (((i < n)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39670)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39671)==0&false)); i++) {{
            __CLR4_4_1uizuizlb90p9tm.R.inc(39672);nD[i] = d[i] * optimum;
            __CLR4_4_1uizuizlb90p9tm.R.inc(39673);nP[i] = p[i] + nD[i];
        }

        }__CLR4_4_1uizuizlb90p9tm.R.inc(39674);final double[][] result = new double[2][];
        __CLR4_4_1uizuizlb90p9tm.R.inc(39675);result[0] = nP;
        __CLR4_4_1uizuizlb90p9tm.R.inc(39676);result[1] = nD;

        __CLR4_4_1uizuizlb90p9tm.R.inc(39677);return result;
    }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

    /**
     * Class for finding the minimum of the objective function along a given
     * direction.
     */
    private class LineSearch extends BrentOptimizer {
        /**
         * Value that will pass the precondition check for {@link BrentOptimizer}
         * but will not pass the convergence check, so that the custom checker
         * will always decide when to stop the line search.
         */
        private static final double REL_TOL_UNUSED = 1e-15;
        /**
         * Value that will pass the precondition check for {@link BrentOptimizer}
         * but will not pass the convergence check, so that the custom checker
         * will always decide when to stop the line search.
         */
        private static final double ABS_TOL_UNUSED = Double.MIN_VALUE;
        /**
         * Automatic bracketing.
         */
        private final BracketFinder bracket = new BracketFinder();

        /**
         * The "BrentOptimizer" default stopping criterion uses the tolerances
         * to check the domain (point) values, not the function values.
         * We thus create a custom checker to use function values.
         *
         * @param rel Relative threshold.
         * @param abs Absolute threshold.
         */
        LineSearch(double rel,
                   double abs) {
            super(REL_TOL_UNUSED,
                  ABS_TOL_UNUSED,
                  new SimpleUnivariateValueChecker(rel, abs));__CLR4_4_1uizuizlb90p9tm.R.inc(39679);try{__CLR4_4_1uizuizlb90p9tm.R.inc(39678);
        }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}

        /**
         * Find the minimum of the function {@code f(p + alpha * d)}.
         *
         * @param p Starting point.
         * @param d Search direction.
         * @return the optimum.
         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
         * if the number of evaluations is exceeded.
         */
        public UnivariatePointValuePair search(final double[] p, final double[] d) {try{__CLR4_4_1uizuizlb90p9tm.R.inc(39680);
            __CLR4_4_1uizuizlb90p9tm.R.inc(39681);final int n = p.length;
            __CLR4_4_1uizuizlb90p9tm.R.inc(39682);final UnivariateFunction f = new UnivariateFunction() {
                    public double value(double alpha) {try{__CLR4_4_1uizuizlb90p9tm.R.inc(39683);
                        __CLR4_4_1uizuizlb90p9tm.R.inc(39684);final double[] x = new double[n];
                        __CLR4_4_1uizuizlb90p9tm.R.inc(39685);for (int i = 0; (((i < n)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39686)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39687)==0&false)); i++) {{
                            __CLR4_4_1uizuizlb90p9tm.R.inc(39688);x[i] = p[i] + alpha * d[i];
                        }
                        }__CLR4_4_1uizuizlb90p9tm.R.inc(39689);final double obj = PowellOptimizer.this.computeObjectiveValue(x);
                        __CLR4_4_1uizuizlb90p9tm.R.inc(39690);return obj;
                    }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}
                };

            __CLR4_4_1uizuizlb90p9tm.R.inc(39691);final GoalType goal = PowellOptimizer.this.getGoalType();
            __CLR4_4_1uizuizlb90p9tm.R.inc(39692);bracket.search(f, goal, 0, 1);
            // Passing "MAX_VALUE" as a dummy value because it is the enclosing
            // class that counts the number of evaluations (and will eventually
            // generate the exception).
            __CLR4_4_1uizuizlb90p9tm.R.inc(39693);return optimize(new MaxEval(Integer.MAX_VALUE),
                            new UnivariateObjectiveFunction(f),
                            goal,
                            new SearchInterval(bracket.getLo(),
                                               bracket.getHi(),
                                               bracket.getMid()));
        }finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}
    }

    /**
     * @throws MathUnsupportedOperationException if bounds were passed to the
     * {@link #optimize(OptimizationData[]) optimize} method.
     */
    private void checkParameters() {try{__CLR4_4_1uizuizlb90p9tm.R.inc(39694);
        __CLR4_4_1uizuizlb90p9tm.R.inc(39695);if ((((getLowerBound() != null ||
            getUpperBound() != null)&&(__CLR4_4_1uizuizlb90p9tm.R.iget(39696)!=0|true))||(__CLR4_4_1uizuizlb90p9tm.R.iget(39697)==0&false))) {{
            __CLR4_4_1uizuizlb90p9tm.R.inc(39698);throw new MathUnsupportedOperationException(LocalizedFormats.CONSTRAINT);
        }
    }}finally{__CLR4_4_1uizuizlb90p9tm.R.flushNeeded();}}
}
