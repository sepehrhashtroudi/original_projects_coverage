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

package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.GradientMultivariateOptimizer;
import org.apache.commons.math3.util.FastMath;

/**
 * Non-linear conjugate gradient optimizer.
 * <br/>
 * This class supports both the Fletcher-Reeves and the Polak-Ribi\u00e8re
 * update formulas for the conjugate search directions.
 * It also supports optional preconditioning.
 * <br/>
 * Constraints are not supported: the call to
 * {@link #optimize(OptimizationData[]) optimize} will throw
 * {@link MathUnsupportedOperationException} if bounds are passed to it.
 *
 * @version $Id$
 * @since 2.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NonLinearConjugateGradientOptimizer
    extends GradientMultivariateOptimizer {public static class __CLR4_4_1sa4sa4lb90p9o8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,36791,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Update formula for the beta parameter. */
    private final Formula updateFormula;
    /** Preconditioner (may be null). */
    private final Preconditioner preconditioner;
    /** solver to use in the line search (may be null). */
    private final UnivariateSolver solver;
    /** Initial step used to bracket the optimum in line search. */
    private double initialStep = 1;

    /**
     * Constructor with default {@link BrentSolver line search solver} and
     * {@link IdentityPreconditioner preconditioner}.
     *
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link Formula#FLETCHER_REEVES} or
     * {@link Formula#POLAK_RIBIERE}.
     * @param checker Convergence checker.
     */
    public NonLinearConjugateGradientOptimizer(final Formula updateFormula,
                                               ConvergenceChecker<PointValuePair> checker) {
        this(updateFormula,
             checker,
             new BrentSolver(),
             new IdentityPreconditioner());__CLR4_4_1sa4sa4lb90p9o8.R.inc(36653);try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36652);
    }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /**
     * Available choices of update formulas for the updating the parameter
     * that is used to compute the successive conjugate search directions.
     * For non-linear conjugate gradients, there are
     * two formulas:
     * <ul>
     *   <li>Fletcher-Reeves formula</li>
     *   <li>Polak-Ribi\u00e8re formula</li>
     * </ul>
     *
     * On the one hand, the Fletcher-Reeves formula is guaranteed to converge
     * if the start point is close enough of the optimum whether the
     * Polak-Ribi\u00e8re formula may not converge in rare cases. On the
     * other hand, the Polak-Ribi\u00e8re formula is often faster when it
     * does converge. Polak-Ribi\u00e8re is often used.
     *
     * @since 2.0
     */
    public static enum Formula {
        /** Fletcher-Reeves formula. */
        FLETCHER_REEVES,
        /** Polak-Ribi\u00e8re formula. */
        POLAK_RIBIERE
    }

    /**
     * The initial step is a factor with respect to the search direction
     * (which itself is roughly related to the gradient of the function).
     * <br/>
     * It is used to find an interval that brackets the optimum in line
     * search.
     *
     * @since 3.1
     */
    public static class BracketingStep implements OptimizationData {
        /** Initial step. */
        private final double initialStep;

        /**
         * @param step Initial step for the bracket search.
         */
        public BracketingStep(double step) {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36654);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36655);initialStep = step;
        }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

        /**
         * Gets the initial step.
         *
         * @return the initial step.
         */
        public double getBracketingStep() {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36656);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36657);return initialStep;
        }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}
    }

    /**
     * Constructor with default {@link IdentityPreconditioner preconditioner}.
     *
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link Formula#FLETCHER_REEVES} or
     * {@link Formula#POLAK_RIBIERE}.
     * @param checker Convergence checker.
     * @param lineSearchSolver Solver to use during line search.
     */
    public NonLinearConjugateGradientOptimizer(final Formula updateFormula,
                                               ConvergenceChecker<PointValuePair> checker,
                                               final UnivariateSolver lineSearchSolver) {
        this(updateFormula,
             checker,
             lineSearchSolver,
             new IdentityPreconditioner());__CLR4_4_1sa4sa4lb90p9o8.R.inc(36659);try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36658);
    }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /**
     * @param updateFormula formula to use for updating the &beta; parameter,
     * must be one of {@link Formula#FLETCHER_REEVES} or
     * {@link Formula#POLAK_RIBIERE}.
     * @param checker Convergence checker.
     * @param lineSearchSolver Solver to use during line search.
     * @param preconditioner Preconditioner.
     */
    public NonLinearConjugateGradientOptimizer(final Formula updateFormula,
                                               ConvergenceChecker<PointValuePair> checker,
                                               final UnivariateSolver lineSearchSolver,
                                               final Preconditioner preconditioner) {
        super(checker);__CLR4_4_1sa4sa4lb90p9o8.R.inc(36661);try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36660);

        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36662);this.updateFormula = updateFormula;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36663);solver = lineSearchSolver;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36664);this.preconditioner = preconditioner;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36665);initialStep = 1;
    }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link GradientMultivariateOptimizer#parseOptimizationData(OptimizationData[])
     * GradientMultivariateOptimizer}, this method will register the following data:
     * <ul>
     *  <li>{@link BracketingStep}</li>
     * </ul>
     * @return {@inheritDoc}
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations (of the objective function) is exceeded.
     */
    @Override
    public PointValuePair optimize(OptimizationData... optData)
        throws TooManyEvaluationsException {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36666);
        // Set up base class and perform computation.
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36667);return super.optimize(optData);
    }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PointValuePair doOptimize() {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36668);
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36669);final ConvergenceChecker<PointValuePair> checker = getConvergenceChecker();
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36670);final double[] point = getStartPoint();
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36671);final GoalType goal = getGoalType();
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36672);final int n = point.length;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36673);double[] r = computeObjectiveGradient(point);
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36674);if ((((goal == GoalType.MINIMIZE)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36675)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36676)==0&false))) {{
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36677);for (int i = 0; (((i < n)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36678)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36679)==0&false)); i++) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36680);r[i] = -r[i];
            }
        }}

        // Initial search direction.
        }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36681);double[] steepestDescent = preconditioner.precondition(point, r);
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36682);double[] searchDirection = steepestDescent.clone();

        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36683);double delta = 0;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36684);for (int i = 0; (((i < n)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36685)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36686)==0&false)); ++i) {{
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36687);delta += r[i] * searchDirection[i];
        }

        }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36688);PointValuePair current = null;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36689);int maxEval = getMaxEvaluations();
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36690);while (true) {{
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36691);incrementIterationCount();

            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36692);final double objective = computeObjectiveValue(point);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36693);PointValuePair previous = current;
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36694);current = new PointValuePair(point, objective);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36695);if ((((previous != null && checker.converged(getIterations(), previous, current))&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36696)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36697)==0&false))) {{
                // We have found an optimum.
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36698);return current;
            }

            // Find the optimal step in the search direction.
            }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36699);final UnivariateFunction lsf = new LineSearchFunction(point, searchDirection);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36700);final double uB = findUpperBound(lsf, 0, initialStep);
            // XXX Last parameters is set to a value close to zero in order to
            // work around the divergence problem in the "testCircleFitting"
            // unit test (see MATH-439).
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36701);final double step = solver.solve(maxEval, lsf, 0, uB, 1e-15);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36702);maxEval -= solver.getEvaluations(); // Subtract used up evaluations.

            // Validate new point.
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36703);for (int i = 0; (((i < point.length)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36704)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36705)==0&false)); ++i) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36706);point[i] += step * searchDirection[i];
            }

            }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36707);r = computeObjectiveGradient(point);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36708);if ((((goal == GoalType.MINIMIZE)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36709)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36710)==0&false))) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36711);for (int i = 0; (((i < n)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36712)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36713)==0&false)); ++i) {{
                    __CLR4_4_1sa4sa4lb90p9o8.R.inc(36714);r[i] = -r[i];
                }
            }}

            // Compute beta.
            }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36715);final double deltaOld = delta;
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36716);final double[] newSteepestDescent = preconditioner.precondition(point, r);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36717);delta = 0;
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36718);for (int i = 0; (((i < n)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36719)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36720)==0&false)); ++i) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36721);delta += r[i] * newSteepestDescent[i];
            }

            }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36722);final double beta;
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1sa4sa4lb90p9o8.R.inc(36723);switch (updateFormula) {
            case FLETCHER_REEVES:if (!__CLB4_4_1_bool0) {__CLR4_4_1sa4sa4lb90p9o8.R.inc(36724);__CLB4_4_1_bool0=true;}
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36725);beta = delta / deltaOld;
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36726);break;
            case POLAK_RIBIERE:if (!__CLB4_4_1_bool0) {__CLR4_4_1sa4sa4lb90p9o8.R.inc(36727);__CLB4_4_1_bool0=true;}
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36728);double deltaMid = 0;
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36729);for (int i = 0; (((i < r.length)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36730)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36731)==0&false)); ++i) {{
                    __CLR4_4_1sa4sa4lb90p9o8.R.inc(36732);deltaMid += r[i] * steepestDescent[i];
                }
                }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36733);beta = (delta - deltaMid) / deltaOld;
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36734);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1sa4sa4lb90p9o8.R.inc(36735);__CLB4_4_1_bool0=true;}
                // Should never happen.
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36736);throw new MathInternalError();
            }
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36737);steepestDescent = newSteepestDescent;

            // Compute conjugate search direction.
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36738);if ((((getIterations() % n == 0 ||
                beta < 0)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36739)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36740)==0&false))) {{
                // Break conjugation: reset search direction.
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36741);searchDirection = steepestDescent.clone();
            } }else {{
                // Compute new conjugate search direction.
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36742);for (int i = 0; (((i < n)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36743)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36744)==0&false)); ++i) {{
                    __CLR4_4_1sa4sa4lb90p9o8.R.inc(36745);searchDirection[i] = steepestDescent[i] + beta * searchDirection[i];
                }
            }}
        }}
    }}finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data.
     * The following data will be looked for:
     * <ul>
     *  <li>{@link BracketingStep}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36746);
        // Allow base class to register its own data.
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36747);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36748);for (OptimizationData data : optData) {{
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36749);if  ((((data instanceof BracketingStep)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36750)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36751)==0&false))) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36752);initialStep = ((BracketingStep) data).getBracketingStep();
                // If more data must be parsed, this statement _must_ be
                // changed to "continue".
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36753);break;
            }
        }}

        }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36754);checkParameters();
    }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /**
     * Finds the upper bound b ensuring bracketing of a root between a and b.
     *
     * @param f function whose root must be bracketed.
     * @param a lower bound of the interval.
     * @param h initial step to try.
     * @return b such that f(a) and f(b) have opposite signs.
     * @throws MathIllegalStateException if no bracket can be found.
     */
    private double findUpperBound(final UnivariateFunction f,
                                  final double a, final double h) {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36755);
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36756);final double yA = f.value(a);
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36757);double yB = yA;
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36758);for (double step = h; (((step < Double.MAX_VALUE)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36759)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36760)==0&false)); step *= FastMath.max(2, yA / yB)) {{
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36761);final double b = a + step;
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36762);yB = f.value(b);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36763);if ((((yA * yB <= 0)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36764)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36765)==0&false))) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36766);return b;
            }
        }}
        }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36767);throw new MathIllegalStateException(LocalizedFormats.UNABLE_TO_BRACKET_OPTIMUM_IN_LINE_SEARCH);
    }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

    /** Default identity preconditioner. */
    public static class IdentityPreconditioner implements Preconditioner {
        /** {@inheritDoc} */
        public double[] precondition(double[] variables, double[] r) {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36768);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36769);return r.clone();
        }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}
    }

    /**
     * Internal class for line search.
     * <p>
     * The function represented by this class is the dot product of
     * the objective function gradient and the search direction. Its
     * value is zero when the gradient is orthogonal to the search
     * direction, i.e. when the objective function value is a local
     * extremum along the search direction.
     * </p>
     */
    private class LineSearchFunction implements UnivariateFunction {
        /** Current point. */
        private final double[] currentPoint;
        /** Search direction. */
        private final double[] searchDirection;

        /**
         * @param point Current point.
         * @param direction Search direction.
         */
        public LineSearchFunction(double[] point,
                                  double[] direction) {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36770);
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36771);currentPoint = point.clone();
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36772);searchDirection = direction.clone();
        }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}

        /** {@inheritDoc} */
        public double value(double x) {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36773);
            // current point in the search direction
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36774);final double[] shiftedPoint = currentPoint.clone();
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36775);for (int i = 0; (((i < shiftedPoint.length)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36776)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36777)==0&false)); ++i) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36778);shiftedPoint[i] += x * searchDirection[i];
            }

            // gradient of the objective function
            }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36779);final double[] gradient = computeObjectiveGradient(shiftedPoint);

            // dot product with the search direction
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36780);double dotProduct = 0;
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36781);for (int i = 0; (((i < gradient.length)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36782)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36783)==0&false)); ++i) {{
                __CLR4_4_1sa4sa4lb90p9o8.R.inc(36784);dotProduct += gradient[i] * searchDirection[i];
            }

            }__CLR4_4_1sa4sa4lb90p9o8.R.inc(36785);return dotProduct;
        }finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}
    }

    /**
     * @throws MathUnsupportedOperationException if bounds were passed to the
     * {@link #optimize(OptimizationData[]) optimize} method.
     */
    private void checkParameters() {try{__CLR4_4_1sa4sa4lb90p9o8.R.inc(36786);
        __CLR4_4_1sa4sa4lb90p9o8.R.inc(36787);if ((((getLowerBound() != null ||
            getUpperBound() != null)&&(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36788)!=0|true))||(__CLR4_4_1sa4sa4lb90p9o8.R.iget(36789)==0&false))) {{
            __CLR4_4_1sa4sa4lb90p9o8.R.inc(36790);throw new MathUnsupportedOperationException(LocalizedFormats.CONSTRAINT);
        }
    }}finally{__CLR4_4_1sa4sa4lb90p9o8.R.flushNeeded();}}
}
