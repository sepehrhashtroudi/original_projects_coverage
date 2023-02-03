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
package org.apache.commons.math3.optimization.univariate;

import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;

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
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public class BrentOptimizer extends BaseAbstractUnivariateOptimizer {public static class __CLR4_4_110071007lb90pa7u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        super(checker);__CLR4_4_110071007lb90pa7u.R.inc(46664);try{__CLR4_4_110071007lb90pa7u.R.inc(46663);

        __CLR4_4_110071007lb90pa7u.R.inc(46665);if ((((rel < MIN_RELATIVE_TOLERANCE)&&(__CLR4_4_110071007lb90pa7u.R.iget(46666)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46667)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46668);throw new NumberIsTooSmallException(rel, MIN_RELATIVE_TOLERANCE, true);
        }
        }__CLR4_4_110071007lb90pa7u.R.inc(46669);if ((((abs <= 0)&&(__CLR4_4_110071007lb90pa7u.R.iget(46670)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46671)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46672);throw new NotStrictlyPositiveException(abs);
        }

        }__CLR4_4_110071007lb90pa7u.R.inc(46673);relativeThreshold = rel;
        __CLR4_4_110071007lb90pa7u.R.inc(46674);absoluteThreshold = abs;
    }finally{__CLR4_4_110071007lb90pa7u.R.flushNeeded();}}

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
        this(rel, abs, null);__CLR4_4_110071007lb90pa7u.R.inc(46676);try{__CLR4_4_110071007lb90pa7u.R.inc(46675);
    }finally{__CLR4_4_110071007lb90pa7u.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected UnivariatePointValuePair doOptimize() {try{__CLR4_4_110071007lb90pa7u.R.inc(46677);
        __CLR4_4_110071007lb90pa7u.R.inc(46678);final boolean isMinim = getGoalType() == GoalType.MINIMIZE;
        __CLR4_4_110071007lb90pa7u.R.inc(46679);final double lo = getMin();
        __CLR4_4_110071007lb90pa7u.R.inc(46680);final double mid = getStartValue();
        __CLR4_4_110071007lb90pa7u.R.inc(46681);final double hi = getMax();

        // Optional additional convergence criteria.
        __CLR4_4_110071007lb90pa7u.R.inc(46682);final ConvergenceChecker<UnivariatePointValuePair> checker
            = getConvergenceChecker();

        __CLR4_4_110071007lb90pa7u.R.inc(46683);double a;
        __CLR4_4_110071007lb90pa7u.R.inc(46684);double b;
        __CLR4_4_110071007lb90pa7u.R.inc(46685);if ((((lo < hi)&&(__CLR4_4_110071007lb90pa7u.R.iget(46686)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46687)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46688);a = lo;
            __CLR4_4_110071007lb90pa7u.R.inc(46689);b = hi;
        } }else {{
            __CLR4_4_110071007lb90pa7u.R.inc(46690);a = hi;
            __CLR4_4_110071007lb90pa7u.R.inc(46691);b = lo;
        }

        }__CLR4_4_110071007lb90pa7u.R.inc(46692);double x = mid;
        __CLR4_4_110071007lb90pa7u.R.inc(46693);double v = x;
        __CLR4_4_110071007lb90pa7u.R.inc(46694);double w = x;
        __CLR4_4_110071007lb90pa7u.R.inc(46695);double d = 0;
        __CLR4_4_110071007lb90pa7u.R.inc(46696);double e = 0;
        __CLR4_4_110071007lb90pa7u.R.inc(46697);double fx = computeObjectiveValue(x);
        __CLR4_4_110071007lb90pa7u.R.inc(46698);if ((((!isMinim)&&(__CLR4_4_110071007lb90pa7u.R.iget(46699)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46700)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46701);fx = -fx;
        }
        }__CLR4_4_110071007lb90pa7u.R.inc(46702);double fv = fx;
        __CLR4_4_110071007lb90pa7u.R.inc(46703);double fw = fx;

        __CLR4_4_110071007lb90pa7u.R.inc(46704);UnivariatePointValuePair previous = null;
        __CLR4_4_110071007lb90pa7u.R.inc(46705);UnivariatePointValuePair current
            = new UnivariatePointValuePair(x, (((isMinim )&&(__CLR4_4_110071007lb90pa7u.R.iget(46706)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46707)==0&false))? fx : -fx);
        // Best point encountered so far (which is the initial guess).
        __CLR4_4_110071007lb90pa7u.R.inc(46708);UnivariatePointValuePair best = current;

        __CLR4_4_110071007lb90pa7u.R.inc(46709);int iter = 0;
        __CLR4_4_110071007lb90pa7u.R.inc(46710);while (true) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46711);final double m = 0.5 * (a + b);
            __CLR4_4_110071007lb90pa7u.R.inc(46712);final double tol1 = relativeThreshold * FastMath.abs(x) + absoluteThreshold;
            __CLR4_4_110071007lb90pa7u.R.inc(46713);final double tol2 = 2 * tol1;

            // Default stopping criterion.
            __CLR4_4_110071007lb90pa7u.R.inc(46714);final boolean stop = FastMath.abs(x - m) <= tol2 - 0.5 * (b - a);
            __CLR4_4_110071007lb90pa7u.R.inc(46715);if ((((!stop)&&(__CLR4_4_110071007lb90pa7u.R.iget(46716)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46717)==0&false))) {{
                __CLR4_4_110071007lb90pa7u.R.inc(46718);double p = 0;
                __CLR4_4_110071007lb90pa7u.R.inc(46719);double q = 0;
                __CLR4_4_110071007lb90pa7u.R.inc(46720);double r = 0;
                __CLR4_4_110071007lb90pa7u.R.inc(46721);double u = 0;

                __CLR4_4_110071007lb90pa7u.R.inc(46722);if ((((FastMath.abs(e) > tol1)&&(__CLR4_4_110071007lb90pa7u.R.iget(46723)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46724)==0&false))) {{ // Fit parabola.
                    __CLR4_4_110071007lb90pa7u.R.inc(46725);r = (x - w) * (fx - fv);
                    __CLR4_4_110071007lb90pa7u.R.inc(46726);q = (x - v) * (fx - fw);
                    __CLR4_4_110071007lb90pa7u.R.inc(46727);p = (x - v) * q - (x - w) * r;
                    __CLR4_4_110071007lb90pa7u.R.inc(46728);q = 2 * (q - r);

                    __CLR4_4_110071007lb90pa7u.R.inc(46729);if ((((q > 0)&&(__CLR4_4_110071007lb90pa7u.R.iget(46730)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46731)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46732);p = -p;
                    } }else {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46733);q = -q;
                    }

                    }__CLR4_4_110071007lb90pa7u.R.inc(46734);r = e;
                    __CLR4_4_110071007lb90pa7u.R.inc(46735);e = d;

                    __CLR4_4_110071007lb90pa7u.R.inc(46736);if ((((p > q * (a - x) &&
                        p < q * (b - x) &&
                        FastMath.abs(p) < FastMath.abs(0.5 * q * r))&&(__CLR4_4_110071007lb90pa7u.R.iget(46737)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46738)==0&false))) {{
                        // Parabolic interpolation step.
                        __CLR4_4_110071007lb90pa7u.R.inc(46739);d = p / q;
                        __CLR4_4_110071007lb90pa7u.R.inc(46740);u = x + d;

                        // f must not be evaluated too close to a or b.
                        __CLR4_4_110071007lb90pa7u.R.inc(46741);if ((((u - a < tol2 || b - u < tol2)&&(__CLR4_4_110071007lb90pa7u.R.iget(46742)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46743)==0&false))) {{
                            __CLR4_4_110071007lb90pa7u.R.inc(46744);if ((((x <= m)&&(__CLR4_4_110071007lb90pa7u.R.iget(46745)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46746)==0&false))) {{
                                __CLR4_4_110071007lb90pa7u.R.inc(46747);d = tol1;
                            } }else {{
                                __CLR4_4_110071007lb90pa7u.R.inc(46748);d = -tol1;
                            }
                        }}
                    }} }else {{
                        // Golden section step.
                        __CLR4_4_110071007lb90pa7u.R.inc(46749);if ((((x < m)&&(__CLR4_4_110071007lb90pa7u.R.iget(46750)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46751)==0&false))) {{
                            __CLR4_4_110071007lb90pa7u.R.inc(46752);e = b - x;
                        } }else {{
                            __CLR4_4_110071007lb90pa7u.R.inc(46753);e = a - x;
                        }
                        }__CLR4_4_110071007lb90pa7u.R.inc(46754);d = GOLDEN_SECTION * e;
                    }
                }} }else {{
                    // Golden section step.
                    __CLR4_4_110071007lb90pa7u.R.inc(46755);if ((((x < m)&&(__CLR4_4_110071007lb90pa7u.R.iget(46756)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46757)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46758);e = b - x;
                    } }else {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46759);e = a - x;
                    }
                    }__CLR4_4_110071007lb90pa7u.R.inc(46760);d = GOLDEN_SECTION * e;
                }

                // Update by at least "tol1".
                }__CLR4_4_110071007lb90pa7u.R.inc(46761);if ((((FastMath.abs(d) < tol1)&&(__CLR4_4_110071007lb90pa7u.R.iget(46762)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46763)==0&false))) {{
                    __CLR4_4_110071007lb90pa7u.R.inc(46764);if ((((d >= 0)&&(__CLR4_4_110071007lb90pa7u.R.iget(46765)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46766)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46767);u = x + tol1;
                    } }else {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46768);u = x - tol1;
                    }
                }} }else {{
                    __CLR4_4_110071007lb90pa7u.R.inc(46769);u = x + d;
                }

                }__CLR4_4_110071007lb90pa7u.R.inc(46770);double fu = computeObjectiveValue(u);
                __CLR4_4_110071007lb90pa7u.R.inc(46771);if ((((!isMinim)&&(__CLR4_4_110071007lb90pa7u.R.iget(46772)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46773)==0&false))) {{
                    __CLR4_4_110071007lb90pa7u.R.inc(46774);fu = -fu;
                }

                // User-defined convergence checker.
                }__CLR4_4_110071007lb90pa7u.R.inc(46775);previous = current;
                __CLR4_4_110071007lb90pa7u.R.inc(46776);current = new UnivariatePointValuePair(u, (((isMinim )&&(__CLR4_4_110071007lb90pa7u.R.iget(46777)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46778)==0&false))? fu : -fu);
                __CLR4_4_110071007lb90pa7u.R.inc(46779);best = best(best,
                            best(previous,
                                 current,
                                 isMinim),
                            isMinim);

                __CLR4_4_110071007lb90pa7u.R.inc(46780);if ((((checker != null && checker.converged(iter, previous, current))&&(__CLR4_4_110071007lb90pa7u.R.iget(46781)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46782)==0&false))) {{
                    __CLR4_4_110071007lb90pa7u.R.inc(46783);return best;
                }

                // Update a, b, v, w and x.
                }__CLR4_4_110071007lb90pa7u.R.inc(46784);if ((((fu <= fx)&&(__CLR4_4_110071007lb90pa7u.R.iget(46785)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46786)==0&false))) {{
                    __CLR4_4_110071007lb90pa7u.R.inc(46787);if ((((u < x)&&(__CLR4_4_110071007lb90pa7u.R.iget(46788)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46789)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46790);b = x;
                    } }else {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46791);a = x;
                    }
                    }__CLR4_4_110071007lb90pa7u.R.inc(46792);v = w;
                    __CLR4_4_110071007lb90pa7u.R.inc(46793);fv = fw;
                    __CLR4_4_110071007lb90pa7u.R.inc(46794);w = x;
                    __CLR4_4_110071007lb90pa7u.R.inc(46795);fw = fx;
                    __CLR4_4_110071007lb90pa7u.R.inc(46796);x = u;
                    __CLR4_4_110071007lb90pa7u.R.inc(46797);fx = fu;
                } }else {{
                    __CLR4_4_110071007lb90pa7u.R.inc(46798);if ((((u < x)&&(__CLR4_4_110071007lb90pa7u.R.iget(46799)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46800)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46801);a = u;
                    } }else {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46802);b = u;
                    }
                    }__CLR4_4_110071007lb90pa7u.R.inc(46803);if ((((fu <= fw ||
                        Precision.equals(w, x))&&(__CLR4_4_110071007lb90pa7u.R.iget(46804)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46805)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46806);v = w;
                        __CLR4_4_110071007lb90pa7u.R.inc(46807);fv = fw;
                        __CLR4_4_110071007lb90pa7u.R.inc(46808);w = u;
                        __CLR4_4_110071007lb90pa7u.R.inc(46809);fw = fu;
                    } }else {__CLR4_4_110071007lb90pa7u.R.inc(46810);if ((((fu <= fv ||
                               Precision.equals(v, x) ||
                               Precision.equals(v, w))&&(__CLR4_4_110071007lb90pa7u.R.iget(46811)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46812)==0&false))) {{
                        __CLR4_4_110071007lb90pa7u.R.inc(46813);v = u;
                        __CLR4_4_110071007lb90pa7u.R.inc(46814);fv = fu;
                    }
                }}}
            }} }else {{ // Default termination (Brent's criterion).
                __CLR4_4_110071007lb90pa7u.R.inc(46815);return best(best,
                            best(previous,
                                 current,
                                 isMinim),
                            isMinim);
            }
            }__CLR4_4_110071007lb90pa7u.R.inc(46816);++iter;
        }
    }}finally{__CLR4_4_110071007lb90pa7u.R.flushNeeded();}}

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
                                          boolean isMinim) {try{__CLR4_4_110071007lb90pa7u.R.inc(46817);
        __CLR4_4_110071007lb90pa7u.R.inc(46818);if ((((a == null)&&(__CLR4_4_110071007lb90pa7u.R.iget(46819)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46820)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46821);return b;
        }
        }__CLR4_4_110071007lb90pa7u.R.inc(46822);if ((((b == null)&&(__CLR4_4_110071007lb90pa7u.R.iget(46823)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46824)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46825);return a;
        }

        }__CLR4_4_110071007lb90pa7u.R.inc(46826);if ((((isMinim)&&(__CLR4_4_110071007lb90pa7u.R.iget(46827)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46828)==0&false))) {{
            __CLR4_4_110071007lb90pa7u.R.inc(46829);return (((a.getValue() <= b.getValue() )&&(__CLR4_4_110071007lb90pa7u.R.iget(46830)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46831)==0&false))? a : b;
        } }else {{
            __CLR4_4_110071007lb90pa7u.R.inc(46832);return (((a.getValue() >= b.getValue() )&&(__CLR4_4_110071007lb90pa7u.R.iget(46833)!=0|true))||(__CLR4_4_110071007lb90pa7u.R.iget(46834)==0&false))? a : b;
        }
    }}finally{__CLR4_4_110071007lb90pa7u.R.flushNeeded();}}
}
