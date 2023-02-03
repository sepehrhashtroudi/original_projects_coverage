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

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;

/**
 * Utility routines for {@link UnivariateSolver} objects.
 *
 * @version $Id$
 */
public class UnivariateSolverUtils {public static class __CLR4_4_14pq4pqlb90p773{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Class contains only static methods.
     */
    private UnivariateSolverUtils() {try{__CLR4_4_14pq4pqlb90p773.R.inc(6110);}finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Convenience method to find a zero of a univariate real function.  A default
     * solver is used.
     *
     * @param function Function.
     * @param x0 Lower bound for the interval.
     * @param x1 Upper bound for the interval.
     * @return a value where the function is zero.
     * @throws NoBracketingException if the function has the same sign at the
     * endpoints.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static double solve(UnivariateFunction function, double x0, double x1)
        throws NullArgumentException,
               NoBracketingException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6111);
        __CLR4_4_14pq4pqlb90p773.R.inc(6112);if ((((function == null)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6113)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6114)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6115);throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        }__CLR4_4_14pq4pqlb90p773.R.inc(6116);final UnivariateSolver solver = new BrentSolver();
        __CLR4_4_14pq4pqlb90p773.R.inc(6117);return solver.solve(Integer.MAX_VALUE, function, x0, x1);
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Convenience method to find a zero of a univariate real function.  A default
     * solver is used.
     *
     * @param function Function.
     * @param x0 Lower bound for the interval.
     * @param x1 Upper bound for the interval.
     * @param absoluteAccuracy Accuracy to be used by the solver.
     * @return a value where the function is zero.
     * @throws NoBracketingException if the function has the same sign at the
     * endpoints.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static double solve(UnivariateFunction function,
                               double x0, double x1,
                               double absoluteAccuracy)
        throws NullArgumentException,
               NoBracketingException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6118);
        __CLR4_4_14pq4pqlb90p773.R.inc(6119);if ((((function == null)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6120)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6121)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6122);throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        }__CLR4_4_14pq4pqlb90p773.R.inc(6123);final UnivariateSolver solver = new BrentSolver(absoluteAccuracy);
        __CLR4_4_14pq4pqlb90p773.R.inc(6124);return solver.solve(Integer.MAX_VALUE, function, x0, x1);
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /** Force a root found by a non-bracketing solver to lie on a specified side,
     * as if the solver was a bracketing one.
     * @param maxEval maximal number of new evaluations of the function
     * (evaluations already done for finding the root should have already been subtracted
     * from this number)
     * @param f function to solve
     * @param bracketing bracketing solver to use for shifting the root
     * @param baseRoot original root found by a previous non-bracketing solver
     * @param min minimal bound of the search interval
     * @param max maximal bound of the search interval
     * @param allowedSolution the kind of solutions that the root-finding algorithm may
     * accept as solutions.
     * @return a root approximation, on the specified side of the exact root
     * @throws NoBracketingException if the function has the same sign at the
     * endpoints.
     */
    public static double forceSide(final int maxEval, final UnivariateFunction f,
                                   final BracketedUnivariateSolver<UnivariateFunction> bracketing,
                                   final double baseRoot, final double min, final double max,
                                   final AllowedSolution allowedSolution)
        throws NoBracketingException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6125);

        __CLR4_4_14pq4pqlb90p773.R.inc(6126);if ((((allowedSolution == AllowedSolution.ANY_SIDE)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6127)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6128)==0&false))) {{
            // no further bracketing required
            __CLR4_4_14pq4pqlb90p773.R.inc(6129);return baseRoot;
        }

        // find a very small interval bracketing the root
        }__CLR4_4_14pq4pqlb90p773.R.inc(6130);final double step = FastMath.max(bracketing.getAbsoluteAccuracy(),
                                         FastMath.abs(baseRoot * bracketing.getRelativeAccuracy()));
        __CLR4_4_14pq4pqlb90p773.R.inc(6131);double xLo        = FastMath.max(min, baseRoot - step);
        __CLR4_4_14pq4pqlb90p773.R.inc(6132);double fLo        = f.value(xLo);
        __CLR4_4_14pq4pqlb90p773.R.inc(6133);double xHi        = FastMath.min(max, baseRoot + step);
        __CLR4_4_14pq4pqlb90p773.R.inc(6134);double fHi        = f.value(xHi);
        __CLR4_4_14pq4pqlb90p773.R.inc(6135);int remainingEval = maxEval - 2;
        __CLR4_4_14pq4pqlb90p773.R.inc(6136);while ((((remainingEval > 0)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6137)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6138)==0&false))) {{

            __CLR4_4_14pq4pqlb90p773.R.inc(6139);if (((((fLo >= 0 && fHi <= 0) || (fLo <= 0 && fHi >= 0))&&(__CLR4_4_14pq4pqlb90p773.R.iget(6140)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6141)==0&false))) {{
                // compute the root on the selected side
                __CLR4_4_14pq4pqlb90p773.R.inc(6142);return bracketing.solve(remainingEval, f, xLo, xHi, baseRoot, allowedSolution);
            }

            // try increasing the interval
            }__CLR4_4_14pq4pqlb90p773.R.inc(6143);boolean changeLo = false;
            __CLR4_4_14pq4pqlb90p773.R.inc(6144);boolean changeHi = false;
            __CLR4_4_14pq4pqlb90p773.R.inc(6145);if ((((fLo < fHi)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6146)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6147)==0&false))) {{
                // increasing function
                __CLR4_4_14pq4pqlb90p773.R.inc(6148);if ((((fLo >= 0)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6149)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6150)==0&false))) {{
                    __CLR4_4_14pq4pqlb90p773.R.inc(6151);changeLo = true;
                } }else {{
                    __CLR4_4_14pq4pqlb90p773.R.inc(6152);changeHi = true;
                }
            }} }else {__CLR4_4_14pq4pqlb90p773.R.inc(6153);if ((((fLo > fHi)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6154)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6155)==0&false))) {{
                // decreasing function
                __CLR4_4_14pq4pqlb90p773.R.inc(6156);if ((((fLo <= 0)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6157)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6158)==0&false))) {{
                    __CLR4_4_14pq4pqlb90p773.R.inc(6159);changeLo = true;
                } }else {{
                    __CLR4_4_14pq4pqlb90p773.R.inc(6160);changeHi = true;
                }
            }} }else {{
                // unknown variation
                __CLR4_4_14pq4pqlb90p773.R.inc(6161);changeLo = true;
                __CLR4_4_14pq4pqlb90p773.R.inc(6162);changeHi = true;
            }

            // update the lower bound
            }}__CLR4_4_14pq4pqlb90p773.R.inc(6163);if ((((changeLo)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6164)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6165)==0&false))) {{
                __CLR4_4_14pq4pqlb90p773.R.inc(6166);xLo = FastMath.max(min, xLo - step);
                __CLR4_4_14pq4pqlb90p773.R.inc(6167);fLo  = f.value(xLo);
                __CLR4_4_14pq4pqlb90p773.R.inc(6168);remainingEval--;
            }

            // update the higher bound
            }__CLR4_4_14pq4pqlb90p773.R.inc(6169);if ((((changeHi)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6170)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6171)==0&false))) {{
                __CLR4_4_14pq4pqlb90p773.R.inc(6172);xHi = FastMath.min(max, xHi + step);
                __CLR4_4_14pq4pqlb90p773.R.inc(6173);fHi  = f.value(xHi);
                __CLR4_4_14pq4pqlb90p773.R.inc(6174);remainingEval--;
            }

        }}

        }__CLR4_4_14pq4pqlb90p773.R.inc(6175);throw new NoBracketingException(LocalizedFormats.FAILED_BRACKETING,
                                        xLo, xHi, fLo, fHi,
                                        maxEval - remainingEval, maxEval, baseRoot,
                                        min, max);

    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * This method attempts to find two values a and b satisfying <ul>
     * <li> <code> lowerBound <= a < initial < b <= upperBound</code> </li>
     * <li> <code> f(a) * f(b) < 0 </code></li>
     * </ul>
     * If f is continuous on <code>[a,b],</code> this means that <code>a</code>
     * and <code>b</code> bracket a root of f.
     * <p>
     * The algorithm starts by setting
     * <code>a := initial -1; b := initial +1,</code> examines the value of the
     * function at <code>a</code> and <code>b</code> and keeps moving
     * the endpoints out by one unit each time through a loop that terminates
     * when one of the following happens: <ul>
     * <li> <code> f(a) * f(b) < 0 </code> --  success!</li>
     * <li> <code> a = lower </code> and <code> b = upper</code>
     * -- NoBracketingException </li>
     * <li> <code> Integer.MAX_VALUE</code> iterations elapse
     * -- NoBracketingException </li>
     * </ul></p>
     * <p>
     * <strong>Note: </strong> this method can take
     * <code>Integer.MAX_VALUE</code> iterations to throw a
     * <code>ConvergenceException.</code>  Unless you are confident that there
     * is a root between <code>lowerBound</code> and <code>upperBound</code>
     * near <code>initial,</code> it is better to use
     * {@link #bracket(UnivariateFunction, double, double, double, int)},
     * explicitly specifying the maximum number of iterations.</p>
     *
     * @param function Function.
     * @param initial Initial midpoint of interval being expanded to
     * bracket a root.
     * @param lowerBound Lower bound (a is never lower than this value)
     * @param upperBound Upper bound (b never is greater than this
     * value).
     * @return a two-element array holding a and b.
     * @throws NoBracketingException if a root cannot be bracketted.
     * @throws NotStrictlyPositiveException if {@code maximumIterations <= 0}.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static double[] bracket(UnivariateFunction function,
                                   double initial,
                                   double lowerBound, double upperBound)
        throws NullArgumentException,
               NotStrictlyPositiveException,
               NoBracketingException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6176);
        __CLR4_4_14pq4pqlb90p773.R.inc(6177);return bracket(function, initial, lowerBound, upperBound, Integer.MAX_VALUE);
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

     /**
     * This method attempts to find two values a and b satisfying <ul>
     * <li> <code> lowerBound <= a < initial < b <= upperBound</code> </li>
     * <li> <code> f(a) * f(b) <= 0 </code> </li>
     * </ul>
     * If f is continuous on <code>[a,b],</code> this means that <code>a</code>
     * and <code>b</code> bracket a root of f.
     * <p>
     * The algorithm starts by setting
     * <code>a := initial -1; b := initial +1,</code> examines the value of the
     * function at <code>a</code> and <code>b</code> and keeps moving
     * the endpoints out by one unit each time through a loop that terminates
     * when one of the following happens: <ul>
     * <li> <code> f(a) * f(b) <= 0 </code> --  success!</li>
     * <li> <code> a = lower </code> and <code> b = upper</code>
     * -- NoBracketingException </li>
     * <li> <code> maximumIterations</code> iterations elapse
     * -- NoBracketingException </li></ul></p>
     *
     * @param function Function.
     * @param initial Initial midpoint of interval being expanded to
     * bracket a root.
     * @param lowerBound Lower bound (a is never lower than this value).
     * @param upperBound Upper bound (b never is greater than this
     * value).
     * @param maximumIterations Maximum number of iterations to perform
     * @return a two element array holding a and b.
     * @throws NoBracketingException if the algorithm fails to find a and b
     * satisfying the desired conditions.
     * @throws NotStrictlyPositiveException if {@code maximumIterations <= 0}.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static double[] bracket(UnivariateFunction function,
                                   double initial,
                                   double lowerBound, double upperBound,
                                   int maximumIterations)
        throws NullArgumentException,
               NotStrictlyPositiveException,
               NoBracketingException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6178);
        __CLR4_4_14pq4pqlb90p773.R.inc(6179);if ((((function == null)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6180)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6181)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6182);throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        }__CLR4_4_14pq4pqlb90p773.R.inc(6183);if ((((maximumIterations <= 0)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6184)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6185)==0&false)))  {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6186);throw new NotStrictlyPositiveException(LocalizedFormats.INVALID_MAX_ITERATIONS, maximumIterations);
        }
        }__CLR4_4_14pq4pqlb90p773.R.inc(6187);verifySequence(lowerBound, initial, upperBound);

        __CLR4_4_14pq4pqlb90p773.R.inc(6188);double a = initial;
        __CLR4_4_14pq4pqlb90p773.R.inc(6189);double b = initial;
        __CLR4_4_14pq4pqlb90p773.R.inc(6190);double fa;
        __CLR4_4_14pq4pqlb90p773.R.inc(6191);double fb;
        __CLR4_4_14pq4pqlb90p773.R.inc(6192);int numIterations = 0;

        __CLR4_4_14pq4pqlb90p773.R.inc(6193);do {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6194);a = FastMath.max(a - 1.0, lowerBound);
            __CLR4_4_14pq4pqlb90p773.R.inc(6195);b = FastMath.min(b + 1.0, upperBound);
            __CLR4_4_14pq4pqlb90p773.R.inc(6196);fa = function.value(a);

            __CLR4_4_14pq4pqlb90p773.R.inc(6197);fb = function.value(b);
            __CLR4_4_14pq4pqlb90p773.R.inc(6198);++numIterations;
        } }while (((((fa * fb > 0.0) && (numIterations < maximumIterations) &&
                ((a > lowerBound) || (b < upperBound)))&&(__CLR4_4_14pq4pqlb90p773.R.iget(6199)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6200)==0&false)));

        __CLR4_4_14pq4pqlb90p773.R.inc(6201);if ((((fa * fb > 0.0)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6202)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6203)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6204);throw new NoBracketingException(LocalizedFormats.FAILED_BRACKETING,
                                            a, b, fa, fb,
                                            numIterations, maximumIterations, initial,
                                            lowerBound, upperBound);
        }

        }__CLR4_4_14pq4pqlb90p773.R.inc(6205);return new double[] {a, b};
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Compute the midpoint of two values.
     *
     * @param a first value.
     * @param b second value.
     * @return the midpoint.
     */
    public static double midpoint(double a, double b) {try{__CLR4_4_14pq4pqlb90p773.R.inc(6206);
        __CLR4_4_14pq4pqlb90p773.R.inc(6207);return (a + b) * 0.5;
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Check whether the interval bounds bracket a root. That is, if the
     * values at the endpoints are not equal to zero, then the function takes
     * opposite signs at the endpoints.
     *
     * @param function Function.
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @return {@code true} if the function values have opposite signs at the
     * given points.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static boolean isBracketing(UnivariateFunction function,
                                       final double lower,
                                       final double upper)
        throws NullArgumentException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6208);
        __CLR4_4_14pq4pqlb90p773.R.inc(6209);if ((((function == null)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6210)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6211)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6212);throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        }__CLR4_4_14pq4pqlb90p773.R.inc(6213);final double fLo = function.value(lower);
        __CLR4_4_14pq4pqlb90p773.R.inc(6214);final double fHi = function.value(upper);
        __CLR4_4_14pq4pqlb90p773.R.inc(6215);return (fLo >= 0 && fHi <= 0) || (fLo <= 0 && fHi >= 0);
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Check whether the arguments form a (strictly) increasing sequence.
     *
     * @param start First number.
     * @param mid Second number.
     * @param end Third number.
     * @return {@code true} if the arguments form an increasing sequence.
     */
    public static boolean isSequence(final double start,
                                     final double mid,
                                     final double end) {try{__CLR4_4_14pq4pqlb90p773.R.inc(6216);
        __CLR4_4_14pq4pqlb90p773.R.inc(6217);return (start < mid) && (mid < end);
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Check that the endpoints specify an interval.
     *
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @throws NumberIsTooLargeException if {@code lower >= upper}.
     */
    public static void verifyInterval(final double lower,
                                      final double upper)
        throws NumberIsTooLargeException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6218);
        __CLR4_4_14pq4pqlb90p773.R.inc(6219);if ((((lower >= upper)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6220)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6221)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6222);throw new NumberIsTooLargeException(LocalizedFormats.ENDPOINTS_NOT_AN_INTERVAL,
                                                lower, upper, false);
        }
    }}finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Check that {@code lower < initial < upper}.
     *
     * @param lower Lower endpoint.
     * @param initial Initial value.
     * @param upper Upper endpoint.
     * @throws NumberIsTooLargeException if {@code lower >= initial} or
     * {@code initial >= upper}.
     */
    public static void verifySequence(final double lower,
                                      final double initial,
                                      final double upper)
        throws NumberIsTooLargeException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6223);
        __CLR4_4_14pq4pqlb90p773.R.inc(6224);verifyInterval(lower, initial);
        __CLR4_4_14pq4pqlb90p773.R.inc(6225);verifyInterval(initial, upper);
    }finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}

    /**
     * Check that the endpoints specify an interval and the end points
     * bracket a root.
     *
     * @param function Function.
     * @param lower Lower endpoint.
     * @param upper Upper endpoint.
     * @throws NoBracketingException if the function has the same sign at the
     * endpoints.
     * @throws NullArgumentException if {@code function} is {@code null}.
     */
    public static void verifyBracketing(UnivariateFunction function,
                                        final double lower,
                                        final double upper)
        throws NullArgumentException,
               NoBracketingException {try{__CLR4_4_14pq4pqlb90p773.R.inc(6226);
        __CLR4_4_14pq4pqlb90p773.R.inc(6227);if ((((function == null)&&(__CLR4_4_14pq4pqlb90p773.R.iget(6228)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6229)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6230);throw new NullArgumentException(LocalizedFormats.FUNCTION);
        }
        }__CLR4_4_14pq4pqlb90p773.R.inc(6231);verifyInterval(lower, upper);
        __CLR4_4_14pq4pqlb90p773.R.inc(6232);if ((((!isBracketing(function, lower, upper))&&(__CLR4_4_14pq4pqlb90p773.R.iget(6233)!=0|true))||(__CLR4_4_14pq4pqlb90p773.R.iget(6234)==0&false))) {{
            __CLR4_4_14pq4pqlb90p773.R.inc(6235);throw new NoBracketingException(lower, upper,
                                            function.value(lower),
                                            function.value(upper));
        }
    }}finally{__CLR4_4_14pq4pqlb90p773.R.flushNeeded();}}
}
