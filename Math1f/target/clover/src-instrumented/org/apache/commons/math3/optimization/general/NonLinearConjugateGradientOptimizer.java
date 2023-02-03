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

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.util.FastMath;

/**
 * Non-linear conjugate gradient optimizer.
 * <p>
 * This class supports both the Fletcher-Reeves and the Polak-Ribi&egrave;re
 * update formulas for the conjugate search directions. It also supports
 * optional preconditioning.
 * </p>
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 *
 */
@Deprecated
public class NonLinearConjugateGradientOptimizer
    extends AbstractScalarDifferentiableOptimizer {public static class __CLR4_4_1zdgzdglb90pa5q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,45967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Update formula for the beta parameter. */
    private final ConjugateGradientFormula updateFormula;
    /** Preconditioner (may be null). */
    private final Preconditioner preconditioner;
    /** solver to use in the line search (may be null). */
    private final UnivariateSolver solver;
    /** Initial step used to bracket the optimum in line search. */
    private double initialStep;
    /** Current point. */
    private double[] point;

    /**
     * Constructor with default {@link SimpleValueChecker checker},
     * {@link BrentSolver line search solver} and
     * {@link IdentityPreconditioner preconditioner}.
     *
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link
     * ConjugateGradientFormula#POLAK_RIBIERE}.
     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}
     */
    @Deprecated
    public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula) {
        this(updateFormula,
             new SimpleValueChecker());__CLR4_4_1zdgzdglb90pa5q.R.inc(45845);try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45844);
    }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

    /**
     * Constructor with default {@link BrentSolver line search solver} and
     * {@link IdentityPreconditioner preconditioner}.
     *
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link
     * ConjugateGradientFormula#POLAK_RIBIERE}.
     * @param checker Convergence checker.
     */
    public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula,
                                               ConvergenceChecker<PointValuePair> checker) {
        this(updateFormula,
             checker,
             new BrentSolver(),
             new IdentityPreconditioner());__CLR4_4_1zdgzdglb90pa5q.R.inc(45847);try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45846);
    }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}


    /**
     * Constructor with default {@link IdentityPreconditioner preconditioner}.
     *
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link
     * ConjugateGradientFormula#POLAK_RIBIERE}.
     * @param checker Convergence checker.
     * @param lineSearchSolver Solver to use during line search.
     */
    public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula,
                                               ConvergenceChecker<PointValuePair> checker,
                                               final UnivariateSolver lineSearchSolver) {
        this(updateFormula,
             checker,
             lineSearchSolver,
             new IdentityPreconditioner());__CLR4_4_1zdgzdglb90pa5q.R.inc(45849);try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45848);
    }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

    /**
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link ConjugateGradientFormula#FLETCHER_REEVES} or {@link
     * ConjugateGradientFormula#POLAK_RIBIERE}.
     * @param checker Convergence checker.
     * @param lineSearchSolver Solver to use during line search.
     * @param preconditioner Preconditioner.
     */
    public NonLinearConjugateGradientOptimizer(final ConjugateGradientFormula updateFormula,
                                               ConvergenceChecker<PointValuePair> checker,
                                               final UnivariateSolver lineSearchSolver,
                                               final Preconditioner preconditioner) {
        super(checker);__CLR4_4_1zdgzdglb90pa5q.R.inc(45851);try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45850);

        __CLR4_4_1zdgzdglb90pa5q.R.inc(45852);this.updateFormula = updateFormula;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45853);solver = lineSearchSolver;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45854);this.preconditioner = preconditioner;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45855);initialStep = 1.0;
    }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

    /**
     * Set the initial step used to bracket the optimum in line search.
     * <p>
     * The initial step is a factor with respect to the search direction,
     * which itself is roughly related to the gradient of the function
     * </p>
     * @param initialStep initial step used to bracket the optimum in line search,
     * if a non-positive value is used, the initial step is reset to its
     * default value of 1.0
     */
    public void setInitialStep(final double initialStep) {try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45856);
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45857);if ((((initialStep <= 0)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45858)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45859)==0&false))) {{
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45860);this.initialStep = 1.0;
        } }else {{
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45861);this.initialStep = initialStep;
        }
    }}finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45862);
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45863);final ConvergenceChecker<PointValuePair> checker = getConvergenceChecker();
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45864);point = getStartPoint();
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45865);final GoalType goal = getGoalType();
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45866);final int n = point.length;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45867);double[] r = computeObjectiveGradient(point);
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45868);if ((((goal == GoalType.MINIMIZE)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45869)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45870)==0&false))) {{
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45871);for (int i = 0; (((i < n)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45872)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45873)==0&false)); ++i) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45874);r[i] = -r[i];
            }
        }}

        // Initial search direction.
        }__CLR4_4_1zdgzdglb90pa5q.R.inc(45875);double[] steepestDescent = preconditioner.precondition(point, r);
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45876);double[] searchDirection = steepestDescent.clone();

        __CLR4_4_1zdgzdglb90pa5q.R.inc(45877);double delta = 0;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45878);for (int i = 0; (((i < n)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45879)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45880)==0&false)); ++i) {{
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45881);delta += r[i] * searchDirection[i];
        }

        }__CLR4_4_1zdgzdglb90pa5q.R.inc(45882);PointValuePair current = null;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45883);int iter = 0;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45884);int maxEval = getMaxEvaluations();
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45885);while (true) {{
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45886);++iter;

            __CLR4_4_1zdgzdglb90pa5q.R.inc(45887);final double objective = computeObjectiveValue(point);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45888);PointValuePair previous = current;
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45889);current = new PointValuePair(point, objective);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45890);if ((((previous != null && checker.converged(iter, previous, current))&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45891)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45892)==0&false))) {{
                // We have found an optimum.
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45893);return current;
            }

            // Find the optimal step in the search direction.
            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45894);final UnivariateFunction lsf = new LineSearchFunction(searchDirection);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45895);final double uB = findUpperBound(lsf, 0, initialStep);
            // XXX Last parameters is set to a value close to zero in order to
            // work around the divergence problem in the "testCircleFitting"
            // unit test (see MATH-439).
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45896);final double step = solver.solve(maxEval, lsf, 0, uB, 1e-15);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45897);maxEval -= solver.getEvaluations(); // Subtract used up evaluations.

            // Validate new point.
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45898);for (int i = 0; (((i < point.length)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45899)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45900)==0&false)); ++i) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45901);point[i] += step * searchDirection[i];
            }

            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45902);r = computeObjectiveGradient(point);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45903);if ((((goal == GoalType.MINIMIZE)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45904)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45905)==0&false))) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45906);for (int i = 0; (((i < n)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45907)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45908)==0&false)); ++i) {{
                    __CLR4_4_1zdgzdglb90pa5q.R.inc(45909);r[i] = -r[i];
                }
            }}

            // Compute beta.
            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45910);final double deltaOld = delta;
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45911);final double[] newSteepestDescent = preconditioner.precondition(point, r);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45912);delta = 0;
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45913);for (int i = 0; (((i < n)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45914)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45915)==0&false)); ++i) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45916);delta += r[i] * newSteepestDescent[i];
            }

            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45917);final double beta;
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45918);if ((((updateFormula == ConjugateGradientFormula.FLETCHER_REEVES)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45919)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45920)==0&false))) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45921);beta = delta / deltaOld;
            } }else {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45922);double deltaMid = 0;
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45923);for (int i = 0; (((i < r.length)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45924)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45925)==0&false)); ++i) {{
                    __CLR4_4_1zdgzdglb90pa5q.R.inc(45926);deltaMid += r[i] * steepestDescent[i];
                }
                }__CLR4_4_1zdgzdglb90pa5q.R.inc(45927);beta = (delta - deltaMid) / deltaOld;
            }
            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45928);steepestDescent = newSteepestDescent;

            // Compute conjugate search direction.
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45929);if ((((iter % n == 0 ||
                beta < 0)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45930)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45931)==0&false))) {{
                // Break conjugation: reset search direction.
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45932);searchDirection = steepestDescent.clone();
            } }else {{
                // Compute new conjugate search direction.
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45933);for (int i = 0; (((i < n)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45934)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45935)==0&false)); ++i) {{
                    __CLR4_4_1zdgzdglb90pa5q.R.inc(45936);searchDirection[i] = steepestDescent[i] + beta * searchDirection[i];
                }
            }}
        }}
    }}finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

    /**
     * Find the upper bound b ensuring bracketing of a root between a and b.
     *
     * @param f function whose root must be bracketed.
     * @param a lower bound of the interval.
     * @param h initial step to try.
     * @return b such that f(a) and f(b) have opposite signs.
     * @throws MathIllegalStateException if no bracket can be found.
     */
    private double findUpperBound(final UnivariateFunction f,
                                  final double a, final double h) {try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45937);
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45938);final double yA = f.value(a);
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45939);double yB = yA;
        __CLR4_4_1zdgzdglb90pa5q.R.inc(45940);for (double step = h; (((step < Double.MAX_VALUE)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45941)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45942)==0&false)); step *= FastMath.max(2, yA / yB)) {{
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45943);final double b = a + step;
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45944);yB = f.value(b);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45945);if ((((yA * yB <= 0)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45946)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45947)==0&false))) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45948);return b;
            }
        }}
        }__CLR4_4_1zdgzdglb90pa5q.R.inc(45949);throw new MathIllegalStateException(LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
    }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

    /** Default identity preconditioner. */
    public static class IdentityPreconditioner implements Preconditioner {

        /** {@inheritDoc} */
        public double[] precondition(double[] variables, double[] r) {try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45950);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45951);return r.clone();
        }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}
    }

    /** Internal class for line search.
     * <p>
     * The function represented by this class is the dot product of
     * the objective function gradient and the search direction. Its
     * value is zero when the gradient is orthogonal to the search
     * direction, i.e. when the objective function value is a local
     * extremum along the search direction.
     * </p>
     */
    private class LineSearchFunction implements UnivariateFunction {
        /** Search direction. */
        private final double[] searchDirection;

        /** Simple constructor.
         * @param searchDirection search direction
         */
        public LineSearchFunction(final double[] searchDirection) {try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45952);
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45953);this.searchDirection = searchDirection;
        }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double value(double x) {try{__CLR4_4_1zdgzdglb90pa5q.R.inc(45954);
            // current point in the search direction
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45955);final double[] shiftedPoint = point.clone();
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45956);for (int i = 0; (((i < shiftedPoint.length)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45957)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45958)==0&false)); ++i) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45959);shiftedPoint[i] += x * searchDirection[i];
            }

            // gradient of the objective function
            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45960);final double[] gradient = computeObjectiveGradient(shiftedPoint);

            // dot product with the search direction
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45961);double dotProduct = 0;
            __CLR4_4_1zdgzdglb90pa5q.R.inc(45962);for (int i = 0; (((i < gradient.length)&&(__CLR4_4_1zdgzdglb90pa5q.R.iget(45963)!=0|true))||(__CLR4_4_1zdgzdglb90pa5q.R.iget(45964)==0&false)); ++i) {{
                __CLR4_4_1zdgzdglb90pa5q.R.inc(45965);dotProduct += gradient[i] * searchDirection[i];
            }

            }__CLR4_4_1zdgzdglb90pa5q.R.inc(45966);return dotProduct;
        }finally{__CLR4_4_1zdgzdglb90pa5q.R.flushNeeded();}}
    }
}
