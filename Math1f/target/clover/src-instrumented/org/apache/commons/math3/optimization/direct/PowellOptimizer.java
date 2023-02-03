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

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.MultivariateOptimizer;
import org.apache.commons.math3.optimization.univariate.BracketFinder;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker;

/**
 * Powell algorithm.
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
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.2
 */
@Deprecated
public class PowellOptimizer
    extends BaseAbstractMultivariateOptimizer<MultivariateFunction>
    implements MultivariateOptimizer {public static class __CLR4_4_1ycsycslb90pa2s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,44655,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        this(rel, abs, FastMath.sqrt(rel), FastMath.sqrt(abs), checker);__CLR4_4_1ycsycslb90pa2s.R.inc(44525);try{__CLR4_4_1ycsycslb90pa2s.R.inc(44524);
    }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

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
        super(checker);__CLR4_4_1ycsycslb90pa2s.R.inc(44527);try{__CLR4_4_1ycsycslb90pa2s.R.inc(44526);

        __CLR4_4_1ycsycslb90pa2s.R.inc(44528);if ((((rel < MIN_RELATIVE_TOLERANCE)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44529)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44530)==0&false))) {{
            __CLR4_4_1ycsycslb90pa2s.R.inc(44531);throw new NumberIsTooSmallException(rel, MIN_RELATIVE_TOLERANCE, true);
        }
        }__CLR4_4_1ycsycslb90pa2s.R.inc(44532);if ((((abs <= 0)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44533)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44534)==0&false))) {{
            __CLR4_4_1ycsycslb90pa2s.R.inc(44535);throw new NotStrictlyPositiveException(abs);
        }
        }__CLR4_4_1ycsycslb90pa2s.R.inc(44536);relativeThreshold = rel;
        __CLR4_4_1ycsycslb90pa2s.R.inc(44537);absoluteThreshold = abs;

        // Create the line search optimizer.
        __CLR4_4_1ycsycslb90pa2s.R.inc(44538);line = new LineSearch(lineRel,
                              lineAbs);
    }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

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
        this(rel, abs, null);__CLR4_4_1ycsycslb90pa2s.R.inc(44540);try{__CLR4_4_1ycsycslb90pa2s.R.inc(44539);
    }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

    /**
     * Builds an instance with the default convergence checking procedure.
     *
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     * @param lineRel Relative threshold for the internal line search optimizer.
     * @param lineAbs Absolute threshold for the internal line search optimizer.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     * @since 3.1
     */
    public PowellOptimizer(double rel,
                           double abs,
                           double lineRel,
                           double lineAbs) {
        this(rel, abs, lineRel, lineAbs, null);__CLR4_4_1ycsycslb90pa2s.R.inc(44542);try{__CLR4_4_1ycsycslb90pa2s.R.inc(44541);
    }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1ycsycslb90pa2s.R.inc(44543);
        __CLR4_4_1ycsycslb90pa2s.R.inc(44544);final GoalType goal = getGoalType();
        __CLR4_4_1ycsycslb90pa2s.R.inc(44545);final double[] guess = getStartPoint();
        __CLR4_4_1ycsycslb90pa2s.R.inc(44546);final int n = guess.length;

        __CLR4_4_1ycsycslb90pa2s.R.inc(44547);final double[][] direc = new double[n][n];
        __CLR4_4_1ycsycslb90pa2s.R.inc(44548);for (int i = 0; (((i < n)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44549)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44550)==0&false)); i++) {{
            __CLR4_4_1ycsycslb90pa2s.R.inc(44551);direc[i][i] = 1;
        }

        }__CLR4_4_1ycsycslb90pa2s.R.inc(44552);final ConvergenceChecker<PointValuePair> checker
            = getConvergenceChecker();

        __CLR4_4_1ycsycslb90pa2s.R.inc(44553);double[] x = guess;
        __CLR4_4_1ycsycslb90pa2s.R.inc(44554);double fVal = computeObjectiveValue(x);
        __CLR4_4_1ycsycslb90pa2s.R.inc(44555);double[] x1 = x.clone();
        __CLR4_4_1ycsycslb90pa2s.R.inc(44556);int iter = 0;
        __CLR4_4_1ycsycslb90pa2s.R.inc(44557);while (true) {{
            __CLR4_4_1ycsycslb90pa2s.R.inc(44558);++iter;

            __CLR4_4_1ycsycslb90pa2s.R.inc(44559);double fX = fVal;
            __CLR4_4_1ycsycslb90pa2s.R.inc(44560);double fX2 = 0;
            __CLR4_4_1ycsycslb90pa2s.R.inc(44561);double delta = 0;
            __CLR4_4_1ycsycslb90pa2s.R.inc(44562);int bigInd = 0;
            __CLR4_4_1ycsycslb90pa2s.R.inc(44563);double alphaMin = 0;

            __CLR4_4_1ycsycslb90pa2s.R.inc(44564);for (int i = 0; (((i < n)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44565)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44566)==0&false)); i++) {{
                __CLR4_4_1ycsycslb90pa2s.R.inc(44567);final double[] d = MathArrays.copyOf(direc[i]);

                __CLR4_4_1ycsycslb90pa2s.R.inc(44568);fX2 = fVal;

                __CLR4_4_1ycsycslb90pa2s.R.inc(44569);final UnivariatePointValuePair optimum = line.search(x, d);
                __CLR4_4_1ycsycslb90pa2s.R.inc(44570);fVal = optimum.getValue();
                __CLR4_4_1ycsycslb90pa2s.R.inc(44571);alphaMin = optimum.getPoint();
                __CLR4_4_1ycsycslb90pa2s.R.inc(44572);final double[][] result = newPointAndDirection(x, d, alphaMin);
                __CLR4_4_1ycsycslb90pa2s.R.inc(44573);x = result[0];

                __CLR4_4_1ycsycslb90pa2s.R.inc(44574);if (((((fX2 - fVal) > delta)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44575)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44576)==0&false))) {{
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44577);delta = fX2 - fVal;
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44578);bigInd = i;
                }
            }}

            // Default convergence check.
            }__CLR4_4_1ycsycslb90pa2s.R.inc(44579);boolean stop = 2 * (fX - fVal) <=
                (relativeThreshold * (FastMath.abs(fX) + FastMath.abs(fVal)) +
                 absoluteThreshold);

            __CLR4_4_1ycsycslb90pa2s.R.inc(44580);final PointValuePair previous = new PointValuePair(x1, fX);
            __CLR4_4_1ycsycslb90pa2s.R.inc(44581);final PointValuePair current = new PointValuePair(x, fVal);
            __CLR4_4_1ycsycslb90pa2s.R.inc(44582);if ((((!stop && checker != null)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44583)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44584)==0&false))) {{
                __CLR4_4_1ycsycslb90pa2s.R.inc(44585);stop = checker.converged(iter, previous, current);
            }
            }__CLR4_4_1ycsycslb90pa2s.R.inc(44586);if ((((stop)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44587)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44588)==0&false))) {{
                __CLR4_4_1ycsycslb90pa2s.R.inc(44589);if ((((goal == GoalType.MINIMIZE)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44590)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44591)==0&false))) {{
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44592);return ((((fVal < fX) )&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44593)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44594)==0&false))? current : previous;
                } }else {{
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44595);return ((((fVal > fX) )&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44596)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44597)==0&false))? current : previous;
                }
            }}

            }__CLR4_4_1ycsycslb90pa2s.R.inc(44598);final double[] d = new double[n];
            __CLR4_4_1ycsycslb90pa2s.R.inc(44599);final double[] x2 = new double[n];
            __CLR4_4_1ycsycslb90pa2s.R.inc(44600);for (int i = 0; (((i < n)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44601)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44602)==0&false)); i++) {{
                __CLR4_4_1ycsycslb90pa2s.R.inc(44603);d[i] = x[i] - x1[i];
                __CLR4_4_1ycsycslb90pa2s.R.inc(44604);x2[i] = 2 * x[i] - x1[i];
            }

            }__CLR4_4_1ycsycslb90pa2s.R.inc(44605);x1 = x.clone();
            __CLR4_4_1ycsycslb90pa2s.R.inc(44606);fX2 = computeObjectiveValue(x2);

            __CLR4_4_1ycsycslb90pa2s.R.inc(44607);if ((((fX > fX2)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44608)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44609)==0&false))) {{
                __CLR4_4_1ycsycslb90pa2s.R.inc(44610);double t = 2 * (fX + fX2 - 2 * fVal);
                __CLR4_4_1ycsycslb90pa2s.R.inc(44611);double temp = fX - fVal - delta;
                __CLR4_4_1ycsycslb90pa2s.R.inc(44612);t *= temp * temp;
                __CLR4_4_1ycsycslb90pa2s.R.inc(44613);temp = fX - fX2;
                __CLR4_4_1ycsycslb90pa2s.R.inc(44614);t -= delta * temp * temp;

                __CLR4_4_1ycsycslb90pa2s.R.inc(44615);if ((((t < 0.0)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44616)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44617)==0&false))) {{
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44618);final UnivariatePointValuePair optimum = line.search(x, d);
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44619);fVal = optimum.getValue();
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44620);alphaMin = optimum.getPoint();
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44621);final double[][] result = newPointAndDirection(x, d, alphaMin);
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44622);x = result[0];

                    __CLR4_4_1ycsycslb90pa2s.R.inc(44623);final int lastInd = n - 1;
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44624);direc[bigInd] = direc[lastInd];
                    __CLR4_4_1ycsycslb90pa2s.R.inc(44625);direc[lastInd] = result[1];
                }
            }}
        }}
    }}finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

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
                                            double optimum) {try{__CLR4_4_1ycsycslb90pa2s.R.inc(44626);
        __CLR4_4_1ycsycslb90pa2s.R.inc(44627);final int n = p.length;
        __CLR4_4_1ycsycslb90pa2s.R.inc(44628);final double[] nP = new double[n];
        __CLR4_4_1ycsycslb90pa2s.R.inc(44629);final double[] nD = new double[n];
        __CLR4_4_1ycsycslb90pa2s.R.inc(44630);for (int i = 0; (((i < n)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44631)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44632)==0&false)); i++) {{
            __CLR4_4_1ycsycslb90pa2s.R.inc(44633);nD[i] = d[i] * optimum;
            __CLR4_4_1ycsycslb90pa2s.R.inc(44634);nP[i] = p[i] + nD[i];
        }

        }__CLR4_4_1ycsycslb90pa2s.R.inc(44635);final double[][] result = new double[2][];
        __CLR4_4_1ycsycslb90pa2s.R.inc(44636);result[0] = nP;
        __CLR4_4_1ycsycslb90pa2s.R.inc(44637);result[1] = nD;

        __CLR4_4_1ycsycslb90pa2s.R.inc(44638);return result;
    }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

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
                  new SimpleUnivariateValueChecker(rel, abs));__CLR4_4_1ycsycslb90pa2s.R.inc(44640);try{__CLR4_4_1ycsycslb90pa2s.R.inc(44639);
        }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}

        /**
         * Find the minimum of the function {@code f(p + alpha * d)}.
         *
         * @param p Starting point.
         * @param d Search direction.
         * @return the optimum.
         * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
         * if the number of evaluations is exceeded.
         */
        public UnivariatePointValuePair search(final double[] p, final double[] d) {try{__CLR4_4_1ycsycslb90pa2s.R.inc(44641);
            __CLR4_4_1ycsycslb90pa2s.R.inc(44642);final int n = p.length;
            __CLR4_4_1ycsycslb90pa2s.R.inc(44643);final UnivariateFunction f = new UnivariateFunction() {
                    public double value(double alpha) {try{__CLR4_4_1ycsycslb90pa2s.R.inc(44644);
                        __CLR4_4_1ycsycslb90pa2s.R.inc(44645);final double[] x = new double[n];
                        __CLR4_4_1ycsycslb90pa2s.R.inc(44646);for (int i = 0; (((i < n)&&(__CLR4_4_1ycsycslb90pa2s.R.iget(44647)!=0|true))||(__CLR4_4_1ycsycslb90pa2s.R.iget(44648)==0&false)); i++) {{
                            __CLR4_4_1ycsycslb90pa2s.R.inc(44649);x[i] = p[i] + alpha * d[i];
                        }
                        }__CLR4_4_1ycsycslb90pa2s.R.inc(44650);final double obj = PowellOptimizer.this.computeObjectiveValue(x);
                        __CLR4_4_1ycsycslb90pa2s.R.inc(44651);return obj;
                    }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}
                };

            __CLR4_4_1ycsycslb90pa2s.R.inc(44652);final GoalType goal = PowellOptimizer.this.getGoalType();
            __CLR4_4_1ycsycslb90pa2s.R.inc(44653);bracket.search(f, goal, 0, 1);
            // Passing "MAX_VALUE" as a dummy value because it is the enclosing
            // class that counts the number of evaluations (and will eventually
            // generate the exception).
            __CLR4_4_1ycsycslb90pa2s.R.inc(44654);return optimize(Integer.MAX_VALUE, f, goal,
                            bracket.getLo(), bracket.getHi(), bracket.getMid());
        }finally{__CLR4_4_1ycsycslb90pa2s.R.flushNeeded();}}
    }
}
