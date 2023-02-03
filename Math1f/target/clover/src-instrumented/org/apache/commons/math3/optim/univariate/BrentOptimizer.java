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
package org.apache.commons.math3.optim.univariate;

import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

/**
 * For a function defined on some interval {@code (lo, hi)}, this class
 * finds an approximation {@code x} to the point at which the function
 * attains its minimum.
 * It implements Richard Brent's algorithm (from his book "Algorithms for
 * Minimization without Derivatives", p. 79) for finding minima of real
 * univariate functions.
 * <br/>
 * This code is an adaptation, partly based on the Python code from SciPy
 * (module "optimize.py" v0.5); the original algorithm is also modified
 * <ul>
 *  <li>to use an initial guess provided by the user,</li>
 *  <li>to ensure that the best point encountered is the one returned.</li>
 * </ul>
 *
 * @version $Id$
 * @since 2.0
 */
public class BrentOptimizer extends UnivariateOptimizer {public static class __CLR4_4_1ve6ve6lb90p9vh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,40858,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Golden section.
     */
    private static final double GOLDEN_SECTION = 0.5 * (3 - FastMath.sqrt(5));
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
     * The arguments are used implement the original stopping criterion
     * of Brent's algorithm.
     * {@code abs} and {@code rel} define a tolerance
     * {@code tol = rel |x| + abs}. {@code rel} should be no smaller than
     * <em>2 macheps</em> and preferably not much less than <em>sqrt(macheps)</em>,
     * where <em>macheps</em> is the relative machine precision. {@code abs} must
     * be positive.
     *
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     * @param checker Additional, user-defined, convergence checking
     * procedure.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     */
    public BrentOptimizer(double rel,
                          double abs,
                          ConvergenceChecker<UnivariatePointValuePair> checker) {
        super(checker);__CLR4_4_1ve6ve6lb90p9vh.R.inc(40687);try{__CLR4_4_1ve6ve6lb90p9vh.R.inc(40686);

        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40688);if ((((rel < MIN_RELATIVE_TOLERANCE)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40689)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40690)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40691);throw new NumberIsTooSmallException(rel, MIN_RELATIVE_TOLERANCE, true);
        }
        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40692);if ((((abs <= 0)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40693)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40694)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40695);throw new NotStrictlyPositiveException(abs);
        }

        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40696);relativeThreshold = rel;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40697);absoluteThreshold = abs;
    }finally{__CLR4_4_1ve6ve6lb90p9vh.R.flushNeeded();}}

    /**
     * The arguments are used for implementing the original stopping criterion
     * of Brent's algorithm.
     * {@code abs} and {@code rel} define a tolerance
     * {@code tol = rel |x| + abs}. {@code rel} should be no smaller than
     * <em>2 macheps</em> and preferably not much less than <em>sqrt(macheps)</em>,
     * where <em>macheps</em> is the relative machine precision. {@code abs} must
     * be positive.
     *
     * @param rel Relative threshold.
     * @param abs Absolute threshold.
     * @throws NotStrictlyPositiveException if {@code abs <= 0}.
     * @throws NumberIsTooSmallException if {@code rel < 2 * Math.ulp(1d)}.
     */
    public BrentOptimizer(double rel,
                          double abs) {
        this(rel, abs, null);__CLR4_4_1ve6ve6lb90p9vh.R.inc(40699);try{__CLR4_4_1ve6ve6lb90p9vh.R.inc(40698);
    }finally{__CLR4_4_1ve6ve6lb90p9vh.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected UnivariatePointValuePair doOptimize() {try{__CLR4_4_1ve6ve6lb90p9vh.R.inc(40700);
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40701);final boolean isMinim = getGoalType() == GoalType.MINIMIZE;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40702);final double lo = getMin();
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40703);final double mid = getStartValue();
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40704);final double hi = getMax();

        // Optional additional convergence criteria.
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40705);final ConvergenceChecker<UnivariatePointValuePair> checker
            = getConvergenceChecker();

        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40706);double a;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40707);double b;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40708);if ((((lo < hi)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40709)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40710)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40711);a = lo;
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40712);b = hi;
        } }else {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40713);a = hi;
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40714);b = lo;
        }

        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40715);double x = mid;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40716);double v = x;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40717);double w = x;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40718);double d = 0;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40719);double e = 0;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40720);double fx = computeObjectiveValue(x);
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40721);if ((((!isMinim)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40722)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40723)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40724);fx = -fx;
        }
        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40725);double fv = fx;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40726);double fw = fx;

        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40727);UnivariatePointValuePair previous = null;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40728);UnivariatePointValuePair current
            = new UnivariatePointValuePair(x, (((isMinim )&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40729)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40730)==0&false))? fx : -fx);
        // Best point encountered so far (which is the initial guess).
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40731);UnivariatePointValuePair best = current;

        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40732);int iter = 0;
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40733);while (true) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40734);final double m = 0.5 * (a + b);
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40735);final double tol1 = relativeThreshold * FastMath.abs(x) + absoluteThreshold;
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40736);final double tol2 = 2 * tol1;

            // Default stopping criterion.
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40737);final boolean stop = FastMath.abs(x - m) <= tol2 - 0.5 * (b - a);
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40738);if ((((!stop)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40739)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40740)==0&false))) {{
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40741);double p = 0;
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40742);double q = 0;
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40743);double r = 0;
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40744);double u = 0;

                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40745);if ((((FastMath.abs(e) > tol1)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40746)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40747)==0&false))) {{ // Fit parabola.
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40748);r = (x - w) * (fx - fv);
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40749);q = (x - v) * (fx - fw);
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40750);p = (x - v) * q - (x - w) * r;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40751);q = 2 * (q - r);

                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40752);if ((((q > 0)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40753)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40754)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40755);p = -p;
                    } }else {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40756);q = -q;
                    }

                    }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40757);r = e;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40758);e = d;

                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40759);if ((((p > q * (a - x) &&
                        p < q * (b - x) &&
                        FastMath.abs(p) < FastMath.abs(0.5 * q * r))&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40760)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40761)==0&false))) {{
                        // Parabolic interpolation step.
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40762);d = p / q;
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40763);u = x + d;

                        // f must not be evaluated too close to a or b.
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40764);if ((((u - a < tol2 || b - u < tol2)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40765)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40766)==0&false))) {{
                            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40767);if ((((x <= m)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40768)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40769)==0&false))) {{
                                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40770);d = tol1;
                            } }else {{
                                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40771);d = -tol1;
                            }
                        }}
                    }} }else {{
                        // Golden section step.
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40772);if ((((x < m)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40773)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40774)==0&false))) {{
                            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40775);e = b - x;
                        } }else {{
                            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40776);e = a - x;
                        }
                        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40777);d = GOLDEN_SECTION * e;
                    }
                }} }else {{
                    // Golden section step.
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40778);if ((((x < m)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40779)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40780)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40781);e = b - x;
                    } }else {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40782);e = a - x;
                    }
                    }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40783);d = GOLDEN_SECTION * e;
                }

                // Update by at least "tol1".
                }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40784);if ((((FastMath.abs(d) < tol1)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40785)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40786)==0&false))) {{
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40787);if ((((d >= 0)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40788)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40789)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40790);u = x + tol1;
                    } }else {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40791);u = x - tol1;
                    }
                }} }else {{
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40792);u = x + d;
                }

                }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40793);double fu = computeObjectiveValue(u);
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40794);if ((((!isMinim)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40795)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40796)==0&false))) {{
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40797);fu = -fu;
                }

                // User-defined convergence checker.
                }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40798);previous = current;
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40799);current = new UnivariatePointValuePair(u, (((isMinim )&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40800)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40801)==0&false))? fu : -fu);
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40802);best = best(best,
                            best(previous,
                                 current,
                                 isMinim),
                            isMinim);

                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40803);if ((((checker != null && checker.converged(iter, previous, current))&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40804)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40805)==0&false))) {{
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40806);return best;
                }

                // Update a, b, v, w and x.
                }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40807);if ((((fu <= fx)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40808)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40809)==0&false))) {{
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40810);if ((((u < x)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40811)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40812)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40813);b = x;
                    } }else {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40814);a = x;
                    }
                    }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40815);v = w;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40816);fv = fw;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40817);w = x;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40818);fw = fx;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40819);x = u;
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40820);fx = fu;
                } }else {{
                    __CLR4_4_1ve6ve6lb90p9vh.R.inc(40821);if ((((u < x)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40822)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40823)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40824);a = u;
                    } }else {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40825);b = u;
                    }
                    }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40826);if ((((fu <= fw ||
                        Precision.equals(w, x))&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40827)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40828)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40829);v = w;
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40830);fv = fw;
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40831);w = u;
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40832);fw = fu;
                    } }else {__CLR4_4_1ve6ve6lb90p9vh.R.inc(40833);if ((((fu <= fv ||
                               Precision.equals(v, x) ||
                               Precision.equals(v, w))&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40834)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40835)==0&false))) {{
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40836);v = u;
                        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40837);fv = fu;
                    }
                }}}
            }} }else {{ // Default termination (Brent's criterion).
                __CLR4_4_1ve6ve6lb90p9vh.R.inc(40838);return best(best,
                            best(previous,
                                 current,
                                 isMinim),
                            isMinim);
            }
            }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40839);++iter;
        }
    }}finally{__CLR4_4_1ve6ve6lb90p9vh.R.flushNeeded();}}

    /**
     * Selects the best of two points.
     *
     * @param a Point and value.
     * @param b Point and value.
     * @param isMinim {@code true} if the selected point must be the one with
     * the lowest value.
     * @return the best point, or {@code null} if {@code a} and {@code b} are
     * both {@code null}. When {@code a} and {@code b} have the same function
     * value, {@code a} is returned.
     */
    private UnivariatePointValuePair best(UnivariatePointValuePair a,
                                          UnivariatePointValuePair b,
                                          boolean isMinim) {try{__CLR4_4_1ve6ve6lb90p9vh.R.inc(40840);
        __CLR4_4_1ve6ve6lb90p9vh.R.inc(40841);if ((((a == null)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40842)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40843)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40844);return b;
        }
        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40845);if ((((b == null)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40846)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40847)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40848);return a;
        }

        }__CLR4_4_1ve6ve6lb90p9vh.R.inc(40849);if ((((isMinim)&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40850)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40851)==0&false))) {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40852);return (((a.getValue() <= b.getValue() )&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40853)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40854)==0&false))? a : b;
        } }else {{
            __CLR4_4_1ve6ve6lb90p9vh.R.inc(40855);return (((a.getValue() >= b.getValue() )&&(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40856)!=0|true))||(__CLR4_4_1ve6ve6lb90p9vh.R.iget(40857)==0&false))? a : b;
        }
    }}finally{__CLR4_4_1ve6ve6lb90p9vh.R.flushNeeded();}}
}
