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

package org.apache.commons.math3.analysis.solvers;

import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathInternalError;

/**
 * Base class for all bracketing <em>Secant</em>-based methods for root-finding
 * (approximating a zero of a univariate real function).
 *
 * <p>Implementation of the {@link RegulaFalsiSolver <em>Regula Falsi</em>} and
 * {@link IllinoisSolver <em>Illinois</em>} methods is based on the
 * following article: M. Dowell and P. Jarratt,
 * <em>A modified regula falsi method for computing the root of an
 * equation</em>, BIT Numerical Mathematics, volume 11, number 2,
 * pages 168-174, Springer, 1971.</p>
 *
 * <p>Implementation of the {@link PegasusSolver <em>Pegasus</em>} method is
 * based on the following article: M. Dowell and P. Jarratt,
 * <em>The "Pegasus" method for computing the root of an equation</em>,
 * BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,
 * 1972.</p>
 *
 * <p>The {@link SecantSolver <em>Secant</em>} method is <em>not</em> a
 * bracketing method, so it is not implemented here. It has a separate
 * implementation.</p>
 *
 * @since 3.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class BaseSecantSolver
    extends AbstractUnivariateSolver
    implements BracketedUnivariateSolver<UnivariateFunction> {public static class __CLR4_4_13z93z9lb90p72r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    protected static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /** The kinds of solutions that the algorithm may accept. */
    private AllowedSolution allowed;

    /** The <em>Secant</em>-based root-finding method to use. */
    private final Method method;

    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     * @param method <em>Secant</em>-based root-finding method to use.
     */
    protected BaseSecantSolver(final double absoluteAccuracy, final Method method) {
        super(absoluteAccuracy);__CLR4_4_13z93z9lb90p72r.R.inc(5158);try{__CLR4_4_13z93z9lb90p72r.R.inc(5157);
        __CLR4_4_13z93z9lb90p72r.R.inc(5159);this.allowed = AllowedSolution.ANY_SIDE;
        __CLR4_4_13z93z9lb90p72r.R.inc(5160);this.method = method;
    }finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param method <em>Secant</em>-based root-finding method to use.
     */
    protected BaseSecantSolver(final double relativeAccuracy,
                               final double absoluteAccuracy,
                               final Method method) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_13z93z9lb90p72r.R.inc(5162);try{__CLR4_4_13z93z9lb90p72r.R.inc(5161);
        __CLR4_4_13z93z9lb90p72r.R.inc(5163);this.allowed = AllowedSolution.ANY_SIDE;
        __CLR4_4_13z93z9lb90p72r.R.inc(5164);this.method = method;
    }finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Maximum relative error.
     * @param absoluteAccuracy Maximum absolute error.
     * @param functionValueAccuracy Maximum function value error.
     * @param method <em>Secant</em>-based root-finding method to use
     */
    protected BaseSecantSolver(final double relativeAccuracy,
                               final double absoluteAccuracy,
                               final double functionValueAccuracy,
                               final Method method) {
        super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);__CLR4_4_13z93z9lb90p72r.R.inc(5166);try{__CLR4_4_13z93z9lb90p72r.R.inc(5165);
        __CLR4_4_13z93z9lb90p72r.R.inc(5167);this.allowed = AllowedSolution.ANY_SIDE;
        __CLR4_4_13z93z9lb90p72r.R.inc(5168);this.method = method;
    }finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(final int maxEval, final UnivariateFunction f,
                        final double min, final double max,
                        final AllowedSolution allowedSolution) {try{__CLR4_4_13z93z9lb90p72r.R.inc(5169);
        __CLR4_4_13z93z9lb90p72r.R.inc(5170);return solve(maxEval, f, min, max, min + 0.5 * (max - min), allowedSolution);
    }finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(final int maxEval, final UnivariateFunction f,
                        final double min, final double max, final double startValue,
                        final AllowedSolution allowedSolution) {try{__CLR4_4_13z93z9lb90p72r.R.inc(5171);
        __CLR4_4_13z93z9lb90p72r.R.inc(5172);this.allowed = allowedSolution;
        __CLR4_4_13z93z9lb90p72r.R.inc(5173);return super.solve(maxEval, f, min, max, startValue);
    }finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double solve(final int maxEval, final UnivariateFunction f,
                        final double min, final double max, final double startValue) {try{__CLR4_4_13z93z9lb90p72r.R.inc(5174);
        __CLR4_4_13z93z9lb90p72r.R.inc(5175);return solve(maxEval, f, min, max, startValue, AllowedSolution.ANY_SIDE);
    }finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws ConvergenceException if the algorithm failed due to finite
     * precision.
     */
    @Override
    protected final double doSolve()
        throws ConvergenceException {try{__CLR4_4_13z93z9lb90p72r.R.inc(5176);
        // Get initial solution
        __CLR4_4_13z93z9lb90p72r.R.inc(5177);double x0 = getMin();
        __CLR4_4_13z93z9lb90p72r.R.inc(5178);double x1 = getMax();
        __CLR4_4_13z93z9lb90p72r.R.inc(5179);double f0 = computeObjectiveValue(x0);
        __CLR4_4_13z93z9lb90p72r.R.inc(5180);double f1 = computeObjectiveValue(x1);

        // If one of the bounds is the exact root, return it. Since these are
        // not under-approximations or over-approximations, we can return them
        // regardless of the allowed solutions.
        __CLR4_4_13z93z9lb90p72r.R.inc(5181);if ((((f0 == 0.0)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5182)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5183)==0&false))) {{
            __CLR4_4_13z93z9lb90p72r.R.inc(5184);return x0;
        }
        }__CLR4_4_13z93z9lb90p72r.R.inc(5185);if ((((f1 == 0.0)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5186)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5187)==0&false))) {{
            __CLR4_4_13z93z9lb90p72r.R.inc(5188);return x1;
        }

        // Verify bracketing of initial solution.
        }__CLR4_4_13z93z9lb90p72r.R.inc(5189);verifyBracketing(x0, x1);

        // Get accuracies.
        __CLR4_4_13z93z9lb90p72r.R.inc(5190);final double ftol = getFunctionValueAccuracy();
        __CLR4_4_13z93z9lb90p72r.R.inc(5191);final double atol = getAbsoluteAccuracy();
        __CLR4_4_13z93z9lb90p72r.R.inc(5192);final double rtol = getRelativeAccuracy();

        // Keep track of inverted intervals, meaning that the left bound is
        // larger than the right bound.
        __CLR4_4_13z93z9lb90p72r.R.inc(5193);boolean inverted = false;

        // Keep finding better approximations.
        __CLR4_4_13z93z9lb90p72r.R.inc(5194);while (true) {{
            // Calculate the next approximation.
            __CLR4_4_13z93z9lb90p72r.R.inc(5195);final double x = x1 - ((f1 * (x1 - x0)) / (f1 - f0));
            __CLR4_4_13z93z9lb90p72r.R.inc(5196);final double fx = computeObjectiveValue(x);

            // If the new approximation is the exact root, return it. Since
            // this is not an under-approximation or an over-approximation,
            // we can return it regardless of the allowed solutions.
            __CLR4_4_13z93z9lb90p72r.R.inc(5197);if ((((fx == 0.0)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5198)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5199)==0&false))) {{
                __CLR4_4_13z93z9lb90p72r.R.inc(5200);return x;
            }

            // Update the bounds with the new approximation.
            }__CLR4_4_13z93z9lb90p72r.R.inc(5201);if ((((f1 * fx < 0)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5202)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5203)==0&false))) {{
                // The value of x1 has switched to the other bound, thus inverting
                // the interval.
                __CLR4_4_13z93z9lb90p72r.R.inc(5204);x0 = x1;
                __CLR4_4_13z93z9lb90p72r.R.inc(5205);f0 = f1;
                __CLR4_4_13z93z9lb90p72r.R.inc(5206);inverted = !inverted;
            } }else {{
                boolean __CLB4_4_1_bool0=false;__CLR4_4_13z93z9lb90p72r.R.inc(5207);switch (method) {
                case ILLINOIS:if (!__CLB4_4_1_bool0) {__CLR4_4_13z93z9lb90p72r.R.inc(5208);__CLB4_4_1_bool0=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5209);f0 *= 0.5;
                    __CLR4_4_13z93z9lb90p72r.R.inc(5210);break;
                case PEGASUS:if (!__CLB4_4_1_bool0) {__CLR4_4_13z93z9lb90p72r.R.inc(5211);__CLB4_4_1_bool0=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5212);f0 *= f1 / (f1 + fx);
                    __CLR4_4_13z93z9lb90p72r.R.inc(5213);break;
                case REGULA_FALSI:if (!__CLB4_4_1_bool0) {__CLR4_4_13z93z9lb90p72r.R.inc(5214);__CLB4_4_1_bool0=true;}
                    // Detect early that algorithm is stuck, instead of waiting
                    // for the maximum number of iterations to be exceeded.
                    __CLR4_4_13z93z9lb90p72r.R.inc(5215);if ((((x == x1)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5216)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5217)==0&false))) {{
                        __CLR4_4_13z93z9lb90p72r.R.inc(5218);throw new ConvergenceException();
                    }
                    }__CLR4_4_13z93z9lb90p72r.R.inc(5219);break;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_13z93z9lb90p72r.R.inc(5220);__CLB4_4_1_bool0=true;}
                    // Should never happen.
                    __CLR4_4_13z93z9lb90p72r.R.inc(5221);throw new MathInternalError();
                }
            }
            // Update from [x0, x1] to [x0, x].
            }__CLR4_4_13z93z9lb90p72r.R.inc(5222);x1 = x;
            __CLR4_4_13z93z9lb90p72r.R.inc(5223);f1 = fx;

            // If the function value of the last approximation is too small,
            // given the function value accuracy, then we can't get closer to
            // the root than we already are.
            __CLR4_4_13z93z9lb90p72r.R.inc(5224);if ((((FastMath.abs(f1) <= ftol)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5225)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5226)==0&false))) {{
                boolean __CLB4_4_1_bool1=false;__CLR4_4_13z93z9lb90p72r.R.inc(5227);switch (allowed) {
                case ANY_SIDE:if (!__CLB4_4_1_bool1) {__CLR4_4_13z93z9lb90p72r.R.inc(5228);__CLB4_4_1_bool1=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5229);return x1;
                case LEFT_SIDE:if (!__CLB4_4_1_bool1) {__CLR4_4_13z93z9lb90p72r.R.inc(5230);__CLB4_4_1_bool1=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5231);if ((((inverted)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5232)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5233)==0&false))) {{
                        __CLR4_4_13z93z9lb90p72r.R.inc(5234);return x1;
                    }
                    }__CLR4_4_13z93z9lb90p72r.R.inc(5235);break;
                case RIGHT_SIDE:if (!__CLB4_4_1_bool1) {__CLR4_4_13z93z9lb90p72r.R.inc(5236);__CLB4_4_1_bool1=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5237);if ((((!inverted)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5238)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5239)==0&false))) {{
                        __CLR4_4_13z93z9lb90p72r.R.inc(5240);return x1;
                    }
                    }__CLR4_4_13z93z9lb90p72r.R.inc(5241);break;
                case BELOW_SIDE:if (!__CLB4_4_1_bool1) {__CLR4_4_13z93z9lb90p72r.R.inc(5242);__CLB4_4_1_bool1=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5243);if ((((f1 <= 0)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5244)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5245)==0&false))) {{
                        __CLR4_4_13z93z9lb90p72r.R.inc(5246);return x1;
                    }
                    }__CLR4_4_13z93z9lb90p72r.R.inc(5247);break;
                case ABOVE_SIDE:if (!__CLB4_4_1_bool1) {__CLR4_4_13z93z9lb90p72r.R.inc(5248);__CLB4_4_1_bool1=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5249);if ((((f1 >= 0)&&(__CLR4_4_13z93z9lb90p72r.R.iget(5250)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5251)==0&false))) {{
                        __CLR4_4_13z93z9lb90p72r.R.inc(5252);return x1;
                    }
                    }__CLR4_4_13z93z9lb90p72r.R.inc(5253);break;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_13z93z9lb90p72r.R.inc(5254);__CLB4_4_1_bool1=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5255);throw new MathInternalError();
                }
            }

            // If the current interval is within the given accuracies, we
            // are satisfied with the current approximation.
            }__CLR4_4_13z93z9lb90p72r.R.inc(5256);if ((((FastMath.abs(x1 - x0) < FastMath.max(rtol * FastMath.abs(x1),
                                                     atol))&&(__CLR4_4_13z93z9lb90p72r.R.iget(5257)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5258)==0&false))) {{
                boolean __CLB4_4_1_bool2=false;__CLR4_4_13z93z9lb90p72r.R.inc(5259);switch (allowed) {
                case ANY_SIDE:if (!__CLB4_4_1_bool2) {__CLR4_4_13z93z9lb90p72r.R.inc(5260);__CLB4_4_1_bool2=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5261);return x1;
                case LEFT_SIDE:if (!__CLB4_4_1_bool2) {__CLR4_4_13z93z9lb90p72r.R.inc(5262);__CLB4_4_1_bool2=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5263);return (((inverted )&&(__CLR4_4_13z93z9lb90p72r.R.iget(5264)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5265)==0&false))? x1 : x0;
                case RIGHT_SIDE:if (!__CLB4_4_1_bool2) {__CLR4_4_13z93z9lb90p72r.R.inc(5266);__CLB4_4_1_bool2=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5267);return (((inverted )&&(__CLR4_4_13z93z9lb90p72r.R.iget(5268)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5269)==0&false))? x0 : x1;
                case BELOW_SIDE:if (!__CLB4_4_1_bool2) {__CLR4_4_13z93z9lb90p72r.R.inc(5270);__CLB4_4_1_bool2=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5271);return ((((f1 <= 0) )&&(__CLR4_4_13z93z9lb90p72r.R.iget(5272)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5273)==0&false))? x1 : x0;
                case ABOVE_SIDE:if (!__CLB4_4_1_bool2) {__CLR4_4_13z93z9lb90p72r.R.inc(5274);__CLB4_4_1_bool2=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5275);return ((((f1 >= 0) )&&(__CLR4_4_13z93z9lb90p72r.R.iget(5276)!=0|true))||(__CLR4_4_13z93z9lb90p72r.R.iget(5277)==0&false))? x1 : x0;
                default:if (!__CLB4_4_1_bool2) {__CLR4_4_13z93z9lb90p72r.R.inc(5278);__CLB4_4_1_bool2=true;}
                    __CLR4_4_13z93z9lb90p72r.R.inc(5279);throw new MathInternalError();
                }
            }
        }}
    }}finally{__CLR4_4_13z93z9lb90p72r.R.flushNeeded();}}

    /** <em>Secant</em>-based root-finding methods. */
    protected enum Method {

        /**
         * The {@link RegulaFalsiSolver <em>Regula Falsi</em>} or
         * <em>False Position</em> method.
         */
        REGULA_FALSI,

        /** The {@link IllinoisSolver <em>Illinois</em>} method. */
        ILLINOIS,

        /** The {@link PegasusSolver <em>Pegasus</em>} method. */
        PEGASUS;

    }
}
