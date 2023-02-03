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


import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * This class implements the <a href="http://mathworld.wolfram.com/BrentsMethod.html">
 * Brent algorithm</a> for finding zeros of real univariate functions.
 * The function should be continuous but not necessarily smooth.
 * The {@code solve} method returns a zero {@code x} of the function {@code f}
 * in the given interval {@code [a, b]} to within a tolerance
 * {@code 6 eps abs(x) + t} where {@code eps} is the relative accuracy and
 * {@code t} is the absolute accuracy.
 * The given interval must bracket the root.
 *
 * @version $Id$
 */
public class BrentSolver extends AbstractUnivariateSolver {public static class __CLR4_4_148x48xlb90p747{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /**
     * Construct a solver with default accuracy (1e-6).
     */
    public BrentSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_148x48xlb90p747.R.inc(5506);try{__CLR4_4_148x48xlb90p747.R.inc(5505);
    }finally{__CLR4_4_148x48xlb90p747.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public BrentSolver(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_148x48xlb90p747.R.inc(5508);try{__CLR4_4_148x48xlb90p747.R.inc(5507);
    }finally{__CLR4_4_148x48xlb90p747.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public BrentSolver(double relativeAccuracy,
                       double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_148x48xlb90p747.R.inc(5510);try{__CLR4_4_148x48xlb90p747.R.inc(5509);
    }finally{__CLR4_4_148x48xlb90p747.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param functionValueAccuracy Function value accuracy.
     */
    public BrentSolver(double relativeAccuracy,
                       double absoluteAccuracy,
                       double functionValueAccuracy) {
        super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);__CLR4_4_148x48xlb90p747.R.inc(5512);try{__CLR4_4_148x48xlb90p747.R.inc(5511);
    }finally{__CLR4_4_148x48xlb90p747.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws NoBracketingException,
               TooManyEvaluationsException,
               NumberIsTooLargeException {try{__CLR4_4_148x48xlb90p747.R.inc(5513);
        __CLR4_4_148x48xlb90p747.R.inc(5514);double min = getMin();
        __CLR4_4_148x48xlb90p747.R.inc(5515);double max = getMax();
        __CLR4_4_148x48xlb90p747.R.inc(5516);final double initial = getStartValue();
        __CLR4_4_148x48xlb90p747.R.inc(5517);final double functionValueAccuracy = getFunctionValueAccuracy();

        __CLR4_4_148x48xlb90p747.R.inc(5518);verifySequence(min, initial, max);

        // Return the initial guess if it is good enough.
        __CLR4_4_148x48xlb90p747.R.inc(5519);double yInitial = computeObjectiveValue(initial);
        __CLR4_4_148x48xlb90p747.R.inc(5520);if ((((FastMath.abs(yInitial) <= functionValueAccuracy)&&(__CLR4_4_148x48xlb90p747.R.iget(5521)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5522)==0&false))) {{
            __CLR4_4_148x48xlb90p747.R.inc(5523);return initial;
        }

        // Return the first endpoint if it is good enough.
        }__CLR4_4_148x48xlb90p747.R.inc(5524);double yMin = computeObjectiveValue(min);
        __CLR4_4_148x48xlb90p747.R.inc(5525);if ((((FastMath.abs(yMin) <= functionValueAccuracy)&&(__CLR4_4_148x48xlb90p747.R.iget(5526)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5527)==0&false))) {{
            __CLR4_4_148x48xlb90p747.R.inc(5528);return min;
        }

        // Reduce interval if min and initial bracket the root.
        }__CLR4_4_148x48xlb90p747.R.inc(5529);if ((((yInitial * yMin < 0)&&(__CLR4_4_148x48xlb90p747.R.iget(5530)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5531)==0&false))) {{
            __CLR4_4_148x48xlb90p747.R.inc(5532);return brent(min, initial, yMin, yInitial);
        }

        // Return the second endpoint if it is good enough.
        }__CLR4_4_148x48xlb90p747.R.inc(5533);double yMax = computeObjectiveValue(max);
        __CLR4_4_148x48xlb90p747.R.inc(5534);if ((((FastMath.abs(yMax) <= functionValueAccuracy)&&(__CLR4_4_148x48xlb90p747.R.iget(5535)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5536)==0&false))) {{
            __CLR4_4_148x48xlb90p747.R.inc(5537);return max;
        }

        // Reduce interval if initial and max bracket the root.
        }__CLR4_4_148x48xlb90p747.R.inc(5538);if ((((yInitial * yMax < 0)&&(__CLR4_4_148x48xlb90p747.R.iget(5539)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5540)==0&false))) {{
            __CLR4_4_148x48xlb90p747.R.inc(5541);return brent(initial, max, yInitial, yMax);
        }

        }__CLR4_4_148x48xlb90p747.R.inc(5542);throw new NoBracketingException(min, max, yMin, yMax);
    }finally{__CLR4_4_148x48xlb90p747.R.flushNeeded();}}

    /**
     * Search for a zero inside the provided interval.
     * This implementation is based on the algorithm described at page 58 of
     * the book
     * <quote>
     *  <b>Algorithms for Minimization Without Derivatives</b>
     *  <it>Richard P. Brent</it>
     *  Dover 0-486-41998-3
     * </quote>
     *
     * @param lo Lower bound of the search interval.
     * @param hi Higher bound of the search interval.
     * @param fLo Function value at the lower bound of the search interval.
     * @param fHi Function value at the higher bound of the search interval.
     * @return the value where the function is zero.
     */
    private double brent(double lo, double hi,
                         double fLo, double fHi) {try{__CLR4_4_148x48xlb90p747.R.inc(5543);
        __CLR4_4_148x48xlb90p747.R.inc(5544);double a = lo;
        __CLR4_4_148x48xlb90p747.R.inc(5545);double fa = fLo;
        __CLR4_4_148x48xlb90p747.R.inc(5546);double b = hi;
        __CLR4_4_148x48xlb90p747.R.inc(5547);double fb = fHi;
        __CLR4_4_148x48xlb90p747.R.inc(5548);double c = a;
        __CLR4_4_148x48xlb90p747.R.inc(5549);double fc = fa;
        __CLR4_4_148x48xlb90p747.R.inc(5550);double d = b - a;
        __CLR4_4_148x48xlb90p747.R.inc(5551);double e = d;

        __CLR4_4_148x48xlb90p747.R.inc(5552);final double t = getAbsoluteAccuracy();
        __CLR4_4_148x48xlb90p747.R.inc(5553);final double eps = getRelativeAccuracy();

        __CLR4_4_148x48xlb90p747.R.inc(5554);while (true) {{
            __CLR4_4_148x48xlb90p747.R.inc(5555);if ((((FastMath.abs(fc) < FastMath.abs(fb))&&(__CLR4_4_148x48xlb90p747.R.iget(5556)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5557)==0&false))) {{
                __CLR4_4_148x48xlb90p747.R.inc(5558);a = b;
                __CLR4_4_148x48xlb90p747.R.inc(5559);b = c;
                __CLR4_4_148x48xlb90p747.R.inc(5560);c = a;
                __CLR4_4_148x48xlb90p747.R.inc(5561);fa = fb;
                __CLR4_4_148x48xlb90p747.R.inc(5562);fb = fc;
                __CLR4_4_148x48xlb90p747.R.inc(5563);fc = fa;
            }

            }__CLR4_4_148x48xlb90p747.R.inc(5564);final double tol = 2 * eps * FastMath.abs(b) + t;
            __CLR4_4_148x48xlb90p747.R.inc(5565);final double m = 0.5 * (c - b);

            __CLR4_4_148x48xlb90p747.R.inc(5566);if ((((FastMath.abs(m) <= tol ||
                Precision.equals(fb, 0))&&(__CLR4_4_148x48xlb90p747.R.iget(5567)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5568)==0&false)))  {{
                __CLR4_4_148x48xlb90p747.R.inc(5569);return b;
            }
            }__CLR4_4_148x48xlb90p747.R.inc(5570);if ((((FastMath.abs(e) < tol ||
                FastMath.abs(fa) <= FastMath.abs(fb))&&(__CLR4_4_148x48xlb90p747.R.iget(5571)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5572)==0&false))) {{
                // Force bisection.
                __CLR4_4_148x48xlb90p747.R.inc(5573);d = m;
                __CLR4_4_148x48xlb90p747.R.inc(5574);e = d;
            } }else {{
                __CLR4_4_148x48xlb90p747.R.inc(5575);double s = fb / fa;
                __CLR4_4_148x48xlb90p747.R.inc(5576);double p;
                __CLR4_4_148x48xlb90p747.R.inc(5577);double q;
                // The equality test (a == c) is intentional,
                // it is part of the original Brent's method and
                // it should NOT be replaced by proximity test.
                __CLR4_4_148x48xlb90p747.R.inc(5578);if ((((a == c)&&(__CLR4_4_148x48xlb90p747.R.iget(5579)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5580)==0&false))) {{
                    // Linear interpolation.
                    __CLR4_4_148x48xlb90p747.R.inc(5581);p = 2 * m * s;
                    __CLR4_4_148x48xlb90p747.R.inc(5582);q = 1 - s;
                } }else {{
                    // Inverse quadratic interpolation.
                    __CLR4_4_148x48xlb90p747.R.inc(5583);q = fa / fc;
                    __CLR4_4_148x48xlb90p747.R.inc(5584);final double r = fb / fc;
                    __CLR4_4_148x48xlb90p747.R.inc(5585);p = s * (2 * m * q * (q - r) - (b - a) * (r - 1));
                    __CLR4_4_148x48xlb90p747.R.inc(5586);q = (q - 1) * (r - 1) * (s - 1);
                }
                }__CLR4_4_148x48xlb90p747.R.inc(5587);if ((((p > 0)&&(__CLR4_4_148x48xlb90p747.R.iget(5588)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5589)==0&false))) {{
                    __CLR4_4_148x48xlb90p747.R.inc(5590);q = -q;
                } }else {{
                    __CLR4_4_148x48xlb90p747.R.inc(5591);p = -p;
                }
                }__CLR4_4_148x48xlb90p747.R.inc(5592);s = e;
                __CLR4_4_148x48xlb90p747.R.inc(5593);e = d;
                __CLR4_4_148x48xlb90p747.R.inc(5594);if ((((p >= 1.5 * m * q - FastMath.abs(tol * q) ||
                    p >= FastMath.abs(0.5 * s * q))&&(__CLR4_4_148x48xlb90p747.R.iget(5595)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5596)==0&false))) {{
                    // Inverse quadratic interpolation gives a value
                    // in the wrong direction, or progress is slow.
                    // Fall back to bisection.
                    __CLR4_4_148x48xlb90p747.R.inc(5597);d = m;
                    __CLR4_4_148x48xlb90p747.R.inc(5598);e = d;
                } }else {{
                    __CLR4_4_148x48xlb90p747.R.inc(5599);d = p / q;
                }
            }}
            }__CLR4_4_148x48xlb90p747.R.inc(5600);a = b;
            __CLR4_4_148x48xlb90p747.R.inc(5601);fa = fb;

            __CLR4_4_148x48xlb90p747.R.inc(5602);if ((((FastMath.abs(d) > tol)&&(__CLR4_4_148x48xlb90p747.R.iget(5603)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5604)==0&false))) {{
                __CLR4_4_148x48xlb90p747.R.inc(5605);b += d;
            } }else {__CLR4_4_148x48xlb90p747.R.inc(5606);if ((((m > 0)&&(__CLR4_4_148x48xlb90p747.R.iget(5607)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5608)==0&false))) {{
                __CLR4_4_148x48xlb90p747.R.inc(5609);b += tol;
            } }else {{
                __CLR4_4_148x48xlb90p747.R.inc(5610);b -= tol;
            }
            }}__CLR4_4_148x48xlb90p747.R.inc(5611);fb = computeObjectiveValue(b);
            __CLR4_4_148x48xlb90p747.R.inc(5612);if (((((fb > 0 && fc > 0) ||
                (fb <= 0 && fc <= 0))&&(__CLR4_4_148x48xlb90p747.R.iget(5613)!=0|true))||(__CLR4_4_148x48xlb90p747.R.iget(5614)==0&false))) {{
                __CLR4_4_148x48xlb90p747.R.inc(5615);c = a;
                __CLR4_4_148x48xlb90p747.R.inc(5616);fc = fa;
                __CLR4_4_148x48xlb90p747.R.inc(5617);d = b - a;
                __CLR4_4_148x48xlb90p747.R.inc(5618);e = d;
            }
        }}
    }}finally{__CLR4_4_148x48xlb90p747.R.flushNeeded();}}
}
