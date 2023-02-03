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
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * This class implements a modification of the <a
 * href="http://mathworld.wolfram.com/BrentsMethod.html"> Brent algorithm</a>.
 * <p>
 * The changes with respect to the original Brent algorithm are:
 * <ul>
 *   <li>the returned value is chosen in the current interval according
 *   to user specified {@link AllowedSolution},</li>
 *   <li>the maximal order for the invert polynomial root search is
 *   user-specified instead of being invert quadratic only</li>
 * </ul>
 * </p>
 * The given interval must bracket the root.
 *
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class BracketingNthOrderBrentSolver
    extends AbstractUnivariateSolver
    implements BracketedUnivariateSolver<UnivariateFunction> {public static class __CLR4_4_143g43glb90p73v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,5505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /** Default maximal order. */
    private static final int DEFAULT_MAXIMAL_ORDER = 5;

    /** Maximal aging triggering an attempt to balance the bracketing interval. */
    private static final int MAXIMAL_AGING = 2;

    /** Reduction factor for attempts to balance the bracketing interval. */
    private static final double REDUCTION_FACTOR = 1.0 / 16.0;

    /** Maximal order. */
    private final int maximalOrder;

    /** The kinds of solutions that the algorithm may accept. */
    private AllowedSolution allowed;

    /**
     * Construct a solver with default accuracy and maximal order (1e-6 and 5 respectively)
     */
    public BracketingNthOrderBrentSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY, DEFAULT_MAXIMAL_ORDER);__CLR4_4_143g43glb90p73v.R.inc(5309);try{__CLR4_4_143g43glb90p73v.R.inc(5308);
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     * @param maximalOrder maximal order.
     * @exception NumberIsTooSmallException if maximal order is lower than 2
     */
    public BracketingNthOrderBrentSolver(final double absoluteAccuracy,
                                         final int maximalOrder)
        throws NumberIsTooSmallException {
        super(absoluteAccuracy);__CLR4_4_143g43glb90p73v.R.inc(5311);try{__CLR4_4_143g43glb90p73v.R.inc(5310);
        __CLR4_4_143g43glb90p73v.R.inc(5312);if ((((maximalOrder < 2)&&(__CLR4_4_143g43glb90p73v.R.iget(5313)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5314)==0&false))) {{
            __CLR4_4_143g43glb90p73v.R.inc(5315);throw new NumberIsTooSmallException(maximalOrder, 2, true);
        }
        }__CLR4_4_143g43glb90p73v.R.inc(5316);this.maximalOrder = maximalOrder;
        __CLR4_4_143g43glb90p73v.R.inc(5317);this.allowed = AllowedSolution.ANY_SIDE;
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param maximalOrder maximal order.
     * @exception NumberIsTooSmallException if maximal order is lower than 2
     */
    public BracketingNthOrderBrentSolver(final double relativeAccuracy,
                                         final double absoluteAccuracy,
                                         final int maximalOrder)
        throws NumberIsTooSmallException {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_143g43glb90p73v.R.inc(5319);try{__CLR4_4_143g43glb90p73v.R.inc(5318);
        __CLR4_4_143g43glb90p73v.R.inc(5320);if ((((maximalOrder < 2)&&(__CLR4_4_143g43glb90p73v.R.iget(5321)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5322)==0&false))) {{
            __CLR4_4_143g43glb90p73v.R.inc(5323);throw new NumberIsTooSmallException(maximalOrder, 2, true);
        }
        }__CLR4_4_143g43glb90p73v.R.inc(5324);this.maximalOrder = maximalOrder;
        __CLR4_4_143g43glb90p73v.R.inc(5325);this.allowed = AllowedSolution.ANY_SIDE;
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param functionValueAccuracy Function value accuracy.
     * @param maximalOrder maximal order.
     * @exception NumberIsTooSmallException if maximal order is lower than 2
     */
    public BracketingNthOrderBrentSolver(final double relativeAccuracy,
                                         final double absoluteAccuracy,
                                         final double functionValueAccuracy,
                                         final int maximalOrder)
        throws NumberIsTooSmallException {
        super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy);__CLR4_4_143g43glb90p73v.R.inc(5327);try{__CLR4_4_143g43glb90p73v.R.inc(5326);
        __CLR4_4_143g43glb90p73v.R.inc(5328);if ((((maximalOrder < 2)&&(__CLR4_4_143g43glb90p73v.R.iget(5329)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5330)==0&false))) {{
            __CLR4_4_143g43glb90p73v.R.inc(5331);throw new NumberIsTooSmallException(maximalOrder, 2, true);
        }
        }__CLR4_4_143g43glb90p73v.R.inc(5332);this.maximalOrder = maximalOrder;
        __CLR4_4_143g43glb90p73v.R.inc(5333);this.allowed = AllowedSolution.ANY_SIDE;
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /** Get the maximal order.
     * @return maximal order
     */
    public int getMaximalOrder() {try{__CLR4_4_143g43glb90p73v.R.inc(5334);
        __CLR4_4_143g43glb90p73v.R.inc(5335);return maximalOrder;
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws TooManyEvaluationsException,
               NumberIsTooLargeException,
               NoBracketingException {try{__CLR4_4_143g43glb90p73v.R.inc(5336);
        // prepare arrays with the first points
        __CLR4_4_143g43glb90p73v.R.inc(5337);final double[] x = new double[maximalOrder + 1];
        __CLR4_4_143g43glb90p73v.R.inc(5338);final double[] y = new double[maximalOrder + 1];
        __CLR4_4_143g43glb90p73v.R.inc(5339);x[0] = getMin();
        __CLR4_4_143g43glb90p73v.R.inc(5340);x[1] = getStartValue();
        __CLR4_4_143g43glb90p73v.R.inc(5341);x[2] = getMax();
        __CLR4_4_143g43glb90p73v.R.inc(5342);verifySequence(x[0], x[1], x[2]);

        // evaluate initial guess
        __CLR4_4_143g43glb90p73v.R.inc(5343);y[1] = computeObjectiveValue(x[1]);
        __CLR4_4_143g43glb90p73v.R.inc(5344);if ((((Precision.equals(y[1], 0.0, 1))&&(__CLR4_4_143g43glb90p73v.R.iget(5345)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5346)==0&false))) {{
            // return the initial guess if it is a perfect root.
            __CLR4_4_143g43glb90p73v.R.inc(5347);return x[1];
        }

        // evaluate first  endpoint
        }__CLR4_4_143g43glb90p73v.R.inc(5348);y[0] = computeObjectiveValue(x[0]);
        __CLR4_4_143g43glb90p73v.R.inc(5349);if ((((Precision.equals(y[0], 0.0, 1))&&(__CLR4_4_143g43glb90p73v.R.iget(5350)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5351)==0&false))) {{
            // return the first endpoint if it is a perfect root.
            __CLR4_4_143g43glb90p73v.R.inc(5352);return x[0];
        }

        }__CLR4_4_143g43glb90p73v.R.inc(5353);int nbPoints;
        __CLR4_4_143g43glb90p73v.R.inc(5354);int signChangeIndex;
        __CLR4_4_143g43glb90p73v.R.inc(5355);if ((((y[0] * y[1] < 0)&&(__CLR4_4_143g43glb90p73v.R.iget(5356)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5357)==0&false))) {{

            // reduce interval if it brackets the root
            __CLR4_4_143g43glb90p73v.R.inc(5358);nbPoints        = 2;
            __CLR4_4_143g43glb90p73v.R.inc(5359);signChangeIndex = 1;

        } }else {{

            // evaluate second endpoint
            __CLR4_4_143g43glb90p73v.R.inc(5360);y[2] = computeObjectiveValue(x[2]);
            __CLR4_4_143g43glb90p73v.R.inc(5361);if ((((Precision.equals(y[2], 0.0, 1))&&(__CLR4_4_143g43glb90p73v.R.iget(5362)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5363)==0&false))) {{
                // return the second endpoint if it is a perfect root.
                __CLR4_4_143g43glb90p73v.R.inc(5364);return x[2];
            }

            }__CLR4_4_143g43glb90p73v.R.inc(5365);if ((((y[1] * y[2] < 0)&&(__CLR4_4_143g43glb90p73v.R.iget(5366)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5367)==0&false))) {{
                // use all computed point as a start sampling array for solving
                __CLR4_4_143g43glb90p73v.R.inc(5368);nbPoints        = 3;
                __CLR4_4_143g43glb90p73v.R.inc(5369);signChangeIndex = 2;
            } }else {{
                __CLR4_4_143g43glb90p73v.R.inc(5370);throw new NoBracketingException(x[0], x[2], y[0], y[2]);
            }

        }}

        // prepare a work array for inverse polynomial interpolation
        }__CLR4_4_143g43glb90p73v.R.inc(5371);final double[] tmpX = new double[x.length];

        // current tightest bracketing of the root
        __CLR4_4_143g43glb90p73v.R.inc(5372);double xA    = x[signChangeIndex - 1];
        __CLR4_4_143g43glb90p73v.R.inc(5373);double yA    = y[signChangeIndex - 1];
        __CLR4_4_143g43glb90p73v.R.inc(5374);double absYA = FastMath.abs(yA);
        __CLR4_4_143g43glb90p73v.R.inc(5375);int agingA   = 0;
        __CLR4_4_143g43glb90p73v.R.inc(5376);double xB    = x[signChangeIndex];
        __CLR4_4_143g43glb90p73v.R.inc(5377);double yB    = y[signChangeIndex];
        __CLR4_4_143g43glb90p73v.R.inc(5378);double absYB = FastMath.abs(yB);
        __CLR4_4_143g43glb90p73v.R.inc(5379);int agingB   = 0;

        // search loop
        __CLR4_4_143g43glb90p73v.R.inc(5380);while (true) {{

            // check convergence of bracketing interval
            __CLR4_4_143g43glb90p73v.R.inc(5381);final double xTol = getAbsoluteAccuracy() +
                                getRelativeAccuracy() * FastMath.max(FastMath.abs(xA), FastMath.abs(xB));
            __CLR4_4_143g43glb90p73v.R.inc(5382);if ((((((xB - xA) <= xTol) || (FastMath.max(absYA, absYB) < getFunctionValueAccuracy()))&&(__CLR4_4_143g43glb90p73v.R.iget(5383)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5384)==0&false))) {{
                boolean __CLB4_4_1_bool0=false;__CLR4_4_143g43glb90p73v.R.inc(5385);switch (allowed) {
                case ANY_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_143g43glb90p73v.R.inc(5386);__CLB4_4_1_bool0=true;}
                    __CLR4_4_143g43glb90p73v.R.inc(5387);return (((absYA < absYB )&&(__CLR4_4_143g43glb90p73v.R.iget(5388)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5389)==0&false))? xA : xB;
                case LEFT_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_143g43glb90p73v.R.inc(5390);__CLB4_4_1_bool0=true;}
                    __CLR4_4_143g43glb90p73v.R.inc(5391);return xA;
                case RIGHT_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_143g43glb90p73v.R.inc(5392);__CLB4_4_1_bool0=true;}
                    __CLR4_4_143g43glb90p73v.R.inc(5393);return xB;
                case BELOW_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_143g43glb90p73v.R.inc(5394);__CLB4_4_1_bool0=true;}
                    __CLR4_4_143g43glb90p73v.R.inc(5395);return ((((yA <= 0) )&&(__CLR4_4_143g43glb90p73v.R.iget(5396)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5397)==0&false))? xA : xB;
                case ABOVE_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_143g43glb90p73v.R.inc(5398);__CLB4_4_1_bool0=true;}
                    __CLR4_4_143g43glb90p73v.R.inc(5399);return ((((yA <  0) )&&(__CLR4_4_143g43glb90p73v.R.iget(5400)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5401)==0&false))? xB : xA;
                default :if (!__CLB4_4_1_bool0) {__CLR4_4_143g43glb90p73v.R.inc(5402);__CLB4_4_1_bool0=true;}
                    // this should never happen
                    __CLR4_4_143g43glb90p73v.R.inc(5403);throw new MathInternalError();
                }
            }

            // target for the next evaluation point
            }__CLR4_4_143g43glb90p73v.R.inc(5404);double targetY;
            __CLR4_4_143g43glb90p73v.R.inc(5405);if ((((agingA >= MAXIMAL_AGING)&&(__CLR4_4_143g43glb90p73v.R.iget(5406)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5407)==0&false))) {{
                // we keep updating the high bracket, try to compensate this
                __CLR4_4_143g43glb90p73v.R.inc(5408);final int p = agingA - MAXIMAL_AGING;
                __CLR4_4_143g43glb90p73v.R.inc(5409);final double weightA = (1 << p) - 1;
                __CLR4_4_143g43glb90p73v.R.inc(5410);final double weightB = p + 1;
                __CLR4_4_143g43glb90p73v.R.inc(5411);targetY = (weightA * yA - weightB * REDUCTION_FACTOR * yB) / (weightA + weightB);
            } }else {__CLR4_4_143g43glb90p73v.R.inc(5412);if ((((agingB >= MAXIMAL_AGING)&&(__CLR4_4_143g43glb90p73v.R.iget(5413)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5414)==0&false))) {{
                // we keep updating the low bracket, try to compensate this
                __CLR4_4_143g43glb90p73v.R.inc(5415);final int p = agingB - MAXIMAL_AGING;
                __CLR4_4_143g43glb90p73v.R.inc(5416);final double weightA = p + 1;
                __CLR4_4_143g43glb90p73v.R.inc(5417);final double weightB = (1 << p) - 1;
                __CLR4_4_143g43glb90p73v.R.inc(5418);targetY = (weightB * yB - weightA * REDUCTION_FACTOR * yA) / (weightA + weightB);
            } }else {{
                // bracketing is balanced, try to find the root itself
                __CLR4_4_143g43glb90p73v.R.inc(5419);targetY = 0;
            }

            // make a few attempts to guess a root,
            }}__CLR4_4_143g43glb90p73v.R.inc(5420);double nextX;
            __CLR4_4_143g43glb90p73v.R.inc(5421);int start = 0;
            __CLR4_4_143g43glb90p73v.R.inc(5422);int end   = nbPoints;
            __CLR4_4_143g43glb90p73v.R.inc(5423);do {{

                // guess a value for current target, using inverse polynomial interpolation
                __CLR4_4_143g43glb90p73v.R.inc(5424);System.arraycopy(x, start, tmpX, start, end - start);
                __CLR4_4_143g43glb90p73v.R.inc(5425);nextX = guessX(targetY, tmpX, y, start, end);

                __CLR4_4_143g43glb90p73v.R.inc(5426);if ((((!((nextX > xA) && (nextX < xB)))&&(__CLR4_4_143g43glb90p73v.R.iget(5427)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5428)==0&false))) {{
                    // the guessed root is not strictly inside of the tightest bracketing interval

                    // the guessed root is either not strictly inside the interval or it
                    // is a NaN (which occurs when some sampling points share the same y)
                    // we try again with a lower interpolation order
                    __CLR4_4_143g43glb90p73v.R.inc(5429);if ((((signChangeIndex - start >= end - signChangeIndex)&&(__CLR4_4_143g43glb90p73v.R.iget(5430)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5431)==0&false))) {{
                        // we have more points before the sign change, drop the lowest point
                        __CLR4_4_143g43glb90p73v.R.inc(5432);++start;
                    } }else {{
                        // we have more points after sign change, drop the highest point
                        __CLR4_4_143g43glb90p73v.R.inc(5433);--end;
                    }

                    // we need to do one more attempt
                    }__CLR4_4_143g43glb90p73v.R.inc(5434);nextX = Double.NaN;

                }

            }} }while ((((Double.isNaN(nextX) && (end - start > 1))&&(__CLR4_4_143g43glb90p73v.R.iget(5435)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5436)==0&false)));

            __CLR4_4_143g43glb90p73v.R.inc(5437);if ((((Double.isNaN(nextX))&&(__CLR4_4_143g43glb90p73v.R.iget(5438)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5439)==0&false))) {{
                // fall back to bisection
                __CLR4_4_143g43glb90p73v.R.inc(5440);nextX = xA + 0.5 * (xB - xA);
                __CLR4_4_143g43glb90p73v.R.inc(5441);start = signChangeIndex - 1;
                __CLR4_4_143g43glb90p73v.R.inc(5442);end   = signChangeIndex;
            }

            // evaluate the function at the guessed root
            }__CLR4_4_143g43glb90p73v.R.inc(5443);final double nextY = computeObjectiveValue(nextX);
            __CLR4_4_143g43glb90p73v.R.inc(5444);if ((((Precision.equals(nextY, 0.0, 1))&&(__CLR4_4_143g43glb90p73v.R.iget(5445)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5446)==0&false))) {{
                // we have found an exact root, since it is not an approximation
                // we don't need to bother about the allowed solutions setting
                __CLR4_4_143g43glb90p73v.R.inc(5447);return nextX;
            }

            }__CLR4_4_143g43glb90p73v.R.inc(5448);if (((((nbPoints > 2) && (end - start != nbPoints))&&(__CLR4_4_143g43glb90p73v.R.iget(5449)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5450)==0&false))) {{

                // we have been forced to ignore some points to keep bracketing,
                // they are probably too far from the root, drop them from now on
                __CLR4_4_143g43glb90p73v.R.inc(5451);nbPoints = end - start;
                __CLR4_4_143g43glb90p73v.R.inc(5452);System.arraycopy(x, start, x, 0, nbPoints);
                __CLR4_4_143g43glb90p73v.R.inc(5453);System.arraycopy(y, start, y, 0, nbPoints);
                __CLR4_4_143g43glb90p73v.R.inc(5454);signChangeIndex -= start;

            } }else  {__CLR4_4_143g43glb90p73v.R.inc(5455);if ((((nbPoints == x.length)&&(__CLR4_4_143g43glb90p73v.R.iget(5456)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5457)==0&false))) {{

                // we have to drop one point in order to insert the new one
                __CLR4_4_143g43glb90p73v.R.inc(5458);nbPoints--;

                // keep the tightest bracketing interval as centered as possible
                __CLR4_4_143g43glb90p73v.R.inc(5459);if ((((signChangeIndex >= (x.length + 1) / 2)&&(__CLR4_4_143g43glb90p73v.R.iget(5460)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5461)==0&false))) {{
                    // we drop the lowest point, we have to shift the arrays and the index
                    __CLR4_4_143g43glb90p73v.R.inc(5462);System.arraycopy(x, 1, x, 0, nbPoints);
                    __CLR4_4_143g43glb90p73v.R.inc(5463);System.arraycopy(y, 1, y, 0, nbPoints);
                    __CLR4_4_143g43glb90p73v.R.inc(5464);--signChangeIndex;
                }

            }}

            // insert the last computed point
            //(by construction, we know it lies inside the tightest bracketing interval)
            }}__CLR4_4_143g43glb90p73v.R.inc(5465);System.arraycopy(x, signChangeIndex, x, signChangeIndex + 1, nbPoints - signChangeIndex);
            __CLR4_4_143g43glb90p73v.R.inc(5466);x[signChangeIndex] = nextX;
            __CLR4_4_143g43glb90p73v.R.inc(5467);System.arraycopy(y, signChangeIndex, y, signChangeIndex + 1, nbPoints - signChangeIndex);
            __CLR4_4_143g43glb90p73v.R.inc(5468);y[signChangeIndex] = nextY;
            __CLR4_4_143g43glb90p73v.R.inc(5469);++nbPoints;

            // update the bracketing interval
            __CLR4_4_143g43glb90p73v.R.inc(5470);if ((((nextY * yA <= 0)&&(__CLR4_4_143g43glb90p73v.R.iget(5471)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5472)==0&false))) {{
                // the sign change occurs before the inserted point
                __CLR4_4_143g43glb90p73v.R.inc(5473);xB = nextX;
                __CLR4_4_143g43glb90p73v.R.inc(5474);yB = nextY;
                __CLR4_4_143g43glb90p73v.R.inc(5475);absYB = FastMath.abs(yB);
                __CLR4_4_143g43glb90p73v.R.inc(5476);++agingA;
                __CLR4_4_143g43glb90p73v.R.inc(5477);agingB = 0;
            } }else {{
                // the sign change occurs after the inserted point
                __CLR4_4_143g43glb90p73v.R.inc(5478);xA = nextX;
                __CLR4_4_143g43glb90p73v.R.inc(5479);yA = nextY;
                __CLR4_4_143g43glb90p73v.R.inc(5480);absYA = FastMath.abs(yA);
                __CLR4_4_143g43glb90p73v.R.inc(5481);agingA = 0;
                __CLR4_4_143g43glb90p73v.R.inc(5482);++agingB;

                // update the sign change index
                __CLR4_4_143g43glb90p73v.R.inc(5483);signChangeIndex++;

            }

        }}

    }}finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /** Guess an x value by n<sup>th</sup> order inverse polynomial interpolation.
     * <p>
     * The x value is guessed by evaluating polynomial Q(y) at y = targetY, where Q
     * is built such that for all considered points (x<sub>i</sub>, y<sub>i</sub>),
     * Q(y<sub>i</sub>) = x<sub>i</sub>.
     * </p>
     * @param targetY target value for y
     * @param x reference points abscissas for interpolation,
     * note that this array <em>is</em> modified during computation
     * @param y reference points ordinates for interpolation
     * @param start start index of the points to consider (inclusive)
     * @param end end index of the points to consider (exclusive)
     * @return guessed root (will be a NaN if two points share the same y)
     */
    private double guessX(final double targetY, final double[] x, final double[] y,
                          final int start, final int end) {try{__CLR4_4_143g43glb90p73v.R.inc(5484);

        // compute Q Newton coefficients by divided differences
        __CLR4_4_143g43glb90p73v.R.inc(5485);for (int i = start; (((i < end - 1)&&(__CLR4_4_143g43glb90p73v.R.iget(5486)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5487)==0&false)); ++i) {{
            __CLR4_4_143g43glb90p73v.R.inc(5488);final int delta = i + 1 - start;
            __CLR4_4_143g43glb90p73v.R.inc(5489);for (int j = end - 1; (((j > i)&&(__CLR4_4_143g43glb90p73v.R.iget(5490)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5491)==0&false)); --j) {{
                __CLR4_4_143g43glb90p73v.R.inc(5492);x[j] = (x[j] - x[j-1]) / (y[j] - y[j - delta]);
            }
        }}

        // evaluate Q(targetY)
        }__CLR4_4_143g43glb90p73v.R.inc(5493);double x0 = 0;
        __CLR4_4_143g43glb90p73v.R.inc(5494);for (int j = end - 1; (((j >= start)&&(__CLR4_4_143g43glb90p73v.R.iget(5495)!=0|true))||(__CLR4_4_143g43glb90p73v.R.iget(5496)==0&false)); --j) {{
            __CLR4_4_143g43glb90p73v.R.inc(5497);x0 = x[j] + x0 * (targetY - y[j]);
        }

        }__CLR4_4_143g43glb90p73v.R.inc(5498);return x0;

    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(int maxEval, UnivariateFunction f, double min,
                        double max, AllowedSolution allowedSolution)
        throws TooManyEvaluationsException,
               NumberIsTooLargeException,
               NoBracketingException {try{__CLR4_4_143g43glb90p73v.R.inc(5499);
        __CLR4_4_143g43glb90p73v.R.inc(5500);this.allowed = allowedSolution;
        __CLR4_4_143g43glb90p73v.R.inc(5501);return super.solve(maxEval, f, min, max);
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double solve(int maxEval, UnivariateFunction f, double min,
                        double max, double startValue,
                        AllowedSolution allowedSolution)
        throws TooManyEvaluationsException,
               NumberIsTooLargeException,
               NoBracketingException {try{__CLR4_4_143g43glb90p73v.R.inc(5502);
        __CLR4_4_143g43glb90p73v.R.inc(5503);this.allowed = allowedSolution;
        __CLR4_4_143g43glb90p73v.R.inc(5504);return super.solve(maxEval, f, min, max, startValue);
    }finally{__CLR4_4_143g43glb90p73v.R.flushNeeded();}}

}
