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
package org.apache.commons.math3.dfp;


import org.apache.commons.math3.analysis.solvers.AllowedSolution;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.util.MathUtils;

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
@java.lang.SuppressWarnings({"fallthrough"}) public class BracketingNthOrderBrentSolverDFP {public static class __CLR4_4_15cw5cwlb90p79v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,7140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

   /** Maximal aging triggering an attempt to balance the bracketing interval. */
    private static final int MAXIMAL_AGING = 2;

    /** Maximal order. */
    private final int maximalOrder;

    /** Function value accuracy. */
    private final Dfp functionValueAccuracy;

    /** Absolute accuracy. */
    private final Dfp absoluteAccuracy;

    /** Relative accuracy. */
    private final Dfp relativeAccuracy;

    /** Evaluations counter. */
    private final Incrementor evaluations = new Incrementor();

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     * @param functionValueAccuracy Function value accuracy.
     * @param maximalOrder maximal order.
     * @exception NumberIsTooSmallException if maximal order is lower than 2
     */
    public BracketingNthOrderBrentSolverDFP(final Dfp relativeAccuracy,
                                            final Dfp absoluteAccuracy,
                                            final Dfp functionValueAccuracy,
                                            final int maximalOrder)
        throws NumberIsTooSmallException {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6944);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6945);if ((((maximalOrder < 2)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(6946)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(6947)==0&false))) {{
            __CLR4_4_15cw5cwlb90p79v.R.inc(6948);throw new NumberIsTooSmallException(maximalOrder, 2, true);
        }
        }__CLR4_4_15cw5cwlb90p79v.R.inc(6949);this.maximalOrder = maximalOrder;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6950);this.absoluteAccuracy = absoluteAccuracy;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6951);this.relativeAccuracy = relativeAccuracy;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6952);this.functionValueAccuracy = functionValueAccuracy;
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /** Get the maximal order.
     * @return maximal order
     */
    public int getMaximalOrder() {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6953);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6954);return maximalOrder;
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Get the maximal number of function evaluations.
     *
     * @return the maximal number of function evaluations.
     */
    public int getMaxEvaluations() {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6955);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6956);return evaluations.getMaximalCount();
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Get the number of evaluations of the objective function.
     * The number of evaluations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getEvaluations() {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6957);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6958);return evaluations.getCount();
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Get the absolute accuracy.
     * @return absolute accuracy
     */
    public Dfp getAbsoluteAccuracy() {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6959);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6960);return absoluteAccuracy;
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Get the relative accuracy.
     * @return relative accuracy
     */
    public Dfp getRelativeAccuracy() {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6961);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6962);return relativeAccuracy;
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Get the function accuracy.
     * @return function accuracy
     */
    public Dfp getFunctionValueAccuracy() {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6963);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6964);return functionValueAccuracy;
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Solve for a zero in the given interval.
     * A solver may require that the interval brackets a single zero root.
     * Solvers that do require bracketing should be able to handle the case
     * where one of the endpoints is itself a root.
     *
     * @param maxEval Maximum number of evaluations.
     * @param f Function to solve.
     * @param min Lower bound for the interval.
     * @param max Upper bound for the interval.
     * @param allowedSolution The kind of solutions that the root-finding algorithm may
     * accept as solutions.
     * @return a value where the function is zero.
     * @exception NullArgumentException if f is null.
     * @exception NoBracketingException if root cannot be bracketed
     */
    public Dfp solve(final int maxEval, final UnivariateDfpFunction f,
                     final Dfp min, final Dfp max, final AllowedSolution allowedSolution)
        throws NullArgumentException, NoBracketingException {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6965);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6966);return solve(maxEval, f, min, max, min.add(max).divide(2), allowedSolution);
    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

    /**
     * Solve for a zero in the given interval, start at {@code startValue}.
     * A solver may require that the interval brackets a single zero root.
     * Solvers that do require bracketing should be able to handle the case
     * where one of the endpoints is itself a root.
     *
     * @param maxEval Maximum number of evaluations.
     * @param f Function to solve.
     * @param min Lower bound for the interval.
     * @param max Upper bound for the interval.
     * @param startValue Start value to use.
     * @param allowedSolution The kind of solutions that the root-finding algorithm may
     * accept as solutions.
     * @return a value where the function is zero.
     * @exception NullArgumentException if f is null.
     * @exception NoBracketingException if root cannot be bracketed
     */
    public Dfp solve(final int maxEval, final UnivariateDfpFunction f,
                     final Dfp min, final Dfp max, final Dfp startValue,
                     final AllowedSolution allowedSolution)
        throws NullArgumentException, NoBracketingException {try{__CLR4_4_15cw5cwlb90p79v.R.inc(6967);

        // Checks.
        __CLR4_4_15cw5cwlb90p79v.R.inc(6968);MathUtils.checkNotNull(f);

        // Reset.
        __CLR4_4_15cw5cwlb90p79v.R.inc(6969);evaluations.setMaximalCount(maxEval);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6970);evaluations.resetCount();
        __CLR4_4_15cw5cwlb90p79v.R.inc(6971);Dfp zero = startValue.getZero();
        __CLR4_4_15cw5cwlb90p79v.R.inc(6972);Dfp nan  = zero.newInstance((byte) 1, Dfp.QNAN);

        // prepare arrays with the first points
        __CLR4_4_15cw5cwlb90p79v.R.inc(6973);final Dfp[] x = new Dfp[maximalOrder + 1];
        __CLR4_4_15cw5cwlb90p79v.R.inc(6974);final Dfp[] y = new Dfp[maximalOrder + 1];
        __CLR4_4_15cw5cwlb90p79v.R.inc(6975);x[0] = min;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6976);x[1] = startValue;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6977);x[2] = max;

        // evaluate initial guess
        __CLR4_4_15cw5cwlb90p79v.R.inc(6978);evaluations.incrementCount();
        __CLR4_4_15cw5cwlb90p79v.R.inc(6979);y[1] = f.value(x[1]);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6980);if ((((y[1].isZero())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(6981)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(6982)==0&false))) {{
            // return the initial guess if it is a perfect root.
            __CLR4_4_15cw5cwlb90p79v.R.inc(6983);return x[1];
        }

        // evaluate first  endpoint
        }__CLR4_4_15cw5cwlb90p79v.R.inc(6984);evaluations.incrementCount();
        __CLR4_4_15cw5cwlb90p79v.R.inc(6985);y[0] = f.value(x[0]);
        __CLR4_4_15cw5cwlb90p79v.R.inc(6986);if ((((y[0].isZero())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(6987)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(6988)==0&false))) {{
            // return the first endpoint if it is a perfect root.
            __CLR4_4_15cw5cwlb90p79v.R.inc(6989);return x[0];
        }

        }__CLR4_4_15cw5cwlb90p79v.R.inc(6990);int nbPoints;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6991);int signChangeIndex;
        __CLR4_4_15cw5cwlb90p79v.R.inc(6992);if ((((y[0].multiply(y[1]).negativeOrNull())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(6993)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(6994)==0&false))) {{

            // reduce interval if it brackets the root
            __CLR4_4_15cw5cwlb90p79v.R.inc(6995);nbPoints        = 2;
            __CLR4_4_15cw5cwlb90p79v.R.inc(6996);signChangeIndex = 1;

        } }else {{

            // evaluate second endpoint
            __CLR4_4_15cw5cwlb90p79v.R.inc(6997);evaluations.incrementCount();
            __CLR4_4_15cw5cwlb90p79v.R.inc(6998);y[2] = f.value(x[2]);
            __CLR4_4_15cw5cwlb90p79v.R.inc(6999);if ((((y[2].isZero())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7000)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7001)==0&false))) {{
                // return the second endpoint if it is a perfect root.
                __CLR4_4_15cw5cwlb90p79v.R.inc(7002);return x[2];
            }

            }__CLR4_4_15cw5cwlb90p79v.R.inc(7003);if ((((y[1].multiply(y[2]).negativeOrNull())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7004)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7005)==0&false))) {{
                // use all computed point as a start sampling array for solving
                __CLR4_4_15cw5cwlb90p79v.R.inc(7006);nbPoints        = 3;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7007);signChangeIndex = 2;
            } }else {{
                __CLR4_4_15cw5cwlb90p79v.R.inc(7008);throw new NoBracketingException(x[0].toDouble(), x[2].toDouble(),
                                                y[0].toDouble(), y[2].toDouble());
            }

        }}

        // prepare a work array for inverse polynomial interpolation
        }__CLR4_4_15cw5cwlb90p79v.R.inc(7009);final Dfp[] tmpX = new Dfp[x.length];

        // current tightest bracketing of the root
        __CLR4_4_15cw5cwlb90p79v.R.inc(7010);Dfp xA    = x[signChangeIndex - 1];
        __CLR4_4_15cw5cwlb90p79v.R.inc(7011);Dfp yA    = y[signChangeIndex - 1];
        __CLR4_4_15cw5cwlb90p79v.R.inc(7012);Dfp absXA = xA.abs();
        __CLR4_4_15cw5cwlb90p79v.R.inc(7013);Dfp absYA = yA.abs();
        __CLR4_4_15cw5cwlb90p79v.R.inc(7014);int agingA   = 0;
        __CLR4_4_15cw5cwlb90p79v.R.inc(7015);Dfp xB    = x[signChangeIndex];
        __CLR4_4_15cw5cwlb90p79v.R.inc(7016);Dfp yB    = y[signChangeIndex];
        __CLR4_4_15cw5cwlb90p79v.R.inc(7017);Dfp absXB = xB.abs();
        __CLR4_4_15cw5cwlb90p79v.R.inc(7018);Dfp absYB = yB.abs();
        __CLR4_4_15cw5cwlb90p79v.R.inc(7019);int agingB   = 0;

        // search loop
        __CLR4_4_15cw5cwlb90p79v.R.inc(7020);while (true) {{

            // check convergence of bracketing interval
            __CLR4_4_15cw5cwlb90p79v.R.inc(7021);Dfp maxX = (((absXA.lessThan(absXB) )&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7022)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7023)==0&false))? absXB : absXA;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7024);Dfp maxY = (((absYA.lessThan(absYB) )&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7025)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7026)==0&false))? absYB : absYA;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7027);final Dfp xTol = absoluteAccuracy.add(relativeAccuracy.multiply(maxX));
            __CLR4_4_15cw5cwlb90p79v.R.inc(7028);if ((((xB.subtract(xA).subtract(xTol).negativeOrNull() ||
                maxY.lessThan(functionValueAccuracy))&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7029)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7030)==0&false))) {{
                boolean __CLB4_4_1_bool0=false;__CLR4_4_15cw5cwlb90p79v.R.inc(7031);switch (allowedSolution) {
                case ANY_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_15cw5cwlb90p79v.R.inc(7032);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7033);return (((absYA.lessThan(absYB) )&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7034)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7035)==0&false))? xA : xB;
                case LEFT_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_15cw5cwlb90p79v.R.inc(7036);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7037);return xA;
                case RIGHT_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_15cw5cwlb90p79v.R.inc(7038);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7039);return xB;
                case BELOW_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_15cw5cwlb90p79v.R.inc(7040);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7041);return (((yA.lessThan(zero) )&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7042)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7043)==0&false))? xA : xB;
                case ABOVE_SIDE :if (!__CLB4_4_1_bool0) {__CLR4_4_15cw5cwlb90p79v.R.inc(7044);__CLB4_4_1_bool0=true;}
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7045);return (((yA.lessThan(zero) )&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7046)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7047)==0&false))? xB : xA;
                default :if (!__CLB4_4_1_bool0) {__CLR4_4_15cw5cwlb90p79v.R.inc(7048);__CLB4_4_1_bool0=true;}
                    // this should never happen
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7049);throw new MathInternalError(null);
                }
            }

            // target for the next evaluation point
            }__CLR4_4_15cw5cwlb90p79v.R.inc(7050);Dfp targetY;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7051);if ((((agingA >= MAXIMAL_AGING)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7052)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7053)==0&false))) {{
                // we keep updating the high bracket, try to compensate this
                __CLR4_4_15cw5cwlb90p79v.R.inc(7054);targetY = yB.divide(16).negate();
            } }else {__CLR4_4_15cw5cwlb90p79v.R.inc(7055);if ((((agingB >= MAXIMAL_AGING)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7056)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7057)==0&false))) {{
                // we keep updating the low bracket, try to compensate this
                __CLR4_4_15cw5cwlb90p79v.R.inc(7058);targetY = yA.divide(16).negate();
            } }else {{
                // bracketing is balanced, try to find the root itself
                __CLR4_4_15cw5cwlb90p79v.R.inc(7059);targetY = zero;
            }

            // make a few attempts to guess a root,
            }}__CLR4_4_15cw5cwlb90p79v.R.inc(7060);Dfp nextX;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7061);int start = 0;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7062);int end   = nbPoints;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7063);do {{

                // guess a value for current target, using inverse polynomial interpolation
                __CLR4_4_15cw5cwlb90p79v.R.inc(7064);System.arraycopy(x, start, tmpX, start, end - start);
                __CLR4_4_15cw5cwlb90p79v.R.inc(7065);nextX = guessX(targetY, tmpX, y, start, end);

                __CLR4_4_15cw5cwlb90p79v.R.inc(7066);if ((((!(nextX.greaterThan(xA) && nextX.lessThan(xB)))&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7067)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7068)==0&false))) {{
                    // the guessed root is not strictly inside of the tightest bracketing interval

                    // the guessed root is either not strictly inside the interval or it
                    // is a NaN (which occurs when some sampling points share the same y)
                    // we try again with a lower interpolation order
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7069);if ((((signChangeIndex - start >= end - signChangeIndex)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7070)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7071)==0&false))) {{
                        // we have more points before the sign change, drop the lowest point
                        __CLR4_4_15cw5cwlb90p79v.R.inc(7072);++start;
                    } }else {{
                        // we have more points after sign change, drop the highest point
                        __CLR4_4_15cw5cwlb90p79v.R.inc(7073);--end;
                    }

                    // we need to do one more attempt
                    }__CLR4_4_15cw5cwlb90p79v.R.inc(7074);nextX = nan;

                }

            }} }while ((((nextX.isNaN() && (end - start > 1))&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7075)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7076)==0&false)));

            __CLR4_4_15cw5cwlb90p79v.R.inc(7077);if ((((nextX.isNaN())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7078)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7079)==0&false))) {{
                // fall back to bisection
                __CLR4_4_15cw5cwlb90p79v.R.inc(7080);nextX = xA.add(xB.subtract(xA).divide(2));
                __CLR4_4_15cw5cwlb90p79v.R.inc(7081);start = signChangeIndex - 1;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7082);end   = signChangeIndex;
            }

            // evaluate the function at the guessed root
            }__CLR4_4_15cw5cwlb90p79v.R.inc(7083);evaluations.incrementCount();
            __CLR4_4_15cw5cwlb90p79v.R.inc(7084);final Dfp nextY = f.value(nextX);
            __CLR4_4_15cw5cwlb90p79v.R.inc(7085);if ((((nextY.isZero())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7086)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7087)==0&false))) {{
                // we have found an exact root, since it is not an approximation
                // we don't need to bother about the allowed solutions setting
                __CLR4_4_15cw5cwlb90p79v.R.inc(7088);return nextX;
            }

            }__CLR4_4_15cw5cwlb90p79v.R.inc(7089);if (((((nbPoints > 2) && (end - start != nbPoints))&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7090)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7091)==0&false))) {{

                // we have been forced to ignore some points to keep bracketing,
                // they are probably too far from the root, drop them from now on
                __CLR4_4_15cw5cwlb90p79v.R.inc(7092);nbPoints = end - start;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7093);System.arraycopy(x, start, x, 0, nbPoints);
                __CLR4_4_15cw5cwlb90p79v.R.inc(7094);System.arraycopy(y, start, y, 0, nbPoints);
                __CLR4_4_15cw5cwlb90p79v.R.inc(7095);signChangeIndex -= start;

            } }else  {__CLR4_4_15cw5cwlb90p79v.R.inc(7096);if ((((nbPoints == x.length)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7097)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7098)==0&false))) {{

                // we have to drop one point in order to insert the new one
                __CLR4_4_15cw5cwlb90p79v.R.inc(7099);nbPoints--;

                // keep the tightest bracketing interval as centered as possible
                __CLR4_4_15cw5cwlb90p79v.R.inc(7100);if ((((signChangeIndex >= (x.length + 1) / 2)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7101)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7102)==0&false))) {{
                    // we drop the lowest point, we have to shift the arrays and the index
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7103);System.arraycopy(x, 1, x, 0, nbPoints);
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7104);System.arraycopy(y, 1, y, 0, nbPoints);
                    __CLR4_4_15cw5cwlb90p79v.R.inc(7105);--signChangeIndex;
                }

            }}

            // insert the last computed point
            //(by construction, we know it lies inside the tightest bracketing interval)
            }}__CLR4_4_15cw5cwlb90p79v.R.inc(7106);System.arraycopy(x, signChangeIndex, x, signChangeIndex + 1, nbPoints - signChangeIndex);
            __CLR4_4_15cw5cwlb90p79v.R.inc(7107);x[signChangeIndex] = nextX;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7108);System.arraycopy(y, signChangeIndex, y, signChangeIndex + 1, nbPoints - signChangeIndex);
            __CLR4_4_15cw5cwlb90p79v.R.inc(7109);y[signChangeIndex] = nextY;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7110);++nbPoints;

            // update the bracketing interval
            __CLR4_4_15cw5cwlb90p79v.R.inc(7111);if ((((nextY.multiply(yA).negativeOrNull())&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7112)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7113)==0&false))) {{
                // the sign change occurs before the inserted point
                __CLR4_4_15cw5cwlb90p79v.R.inc(7114);xB = nextX;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7115);yB = nextY;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7116);absYB = yB.abs();
                __CLR4_4_15cw5cwlb90p79v.R.inc(7117);++agingA;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7118);agingB = 0;
            } }else {{
                // the sign change occurs after the inserted point
                __CLR4_4_15cw5cwlb90p79v.R.inc(7119);xA = nextX;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7120);yA = nextY;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7121);absYA = yA.abs();
                __CLR4_4_15cw5cwlb90p79v.R.inc(7122);agingA = 0;
                __CLR4_4_15cw5cwlb90p79v.R.inc(7123);++agingB;

                // update the sign change index
                __CLR4_4_15cw5cwlb90p79v.R.inc(7124);signChangeIndex++;

            }

        }}

    }}finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

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
    private Dfp guessX(final Dfp targetY, final Dfp[] x, final Dfp[] y,
                       final int start, final int end) {try{__CLR4_4_15cw5cwlb90p79v.R.inc(7125);

        // compute Q Newton coefficients by divided differences
        __CLR4_4_15cw5cwlb90p79v.R.inc(7126);for (int i = start; (((i < end - 1)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7127)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7128)==0&false)); ++i) {{
            __CLR4_4_15cw5cwlb90p79v.R.inc(7129);final int delta = i + 1 - start;
            __CLR4_4_15cw5cwlb90p79v.R.inc(7130);for (int j = end - 1; (((j > i)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7131)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7132)==0&false)); --j) {{
                __CLR4_4_15cw5cwlb90p79v.R.inc(7133);x[j] = x[j].subtract(x[j-1]).divide(y[j].subtract(y[j - delta]));
            }
        }}

        // evaluate Q(targetY)
        }__CLR4_4_15cw5cwlb90p79v.R.inc(7134);Dfp x0 = targetY.getZero();
        __CLR4_4_15cw5cwlb90p79v.R.inc(7135);for (int j = end - 1; (((j >= start)&&(__CLR4_4_15cw5cwlb90p79v.R.iget(7136)!=0|true))||(__CLR4_4_15cw5cwlb90p79v.R.iget(7137)==0&false)); --j) {{
            __CLR4_4_15cw5cwlb90p79v.R.inc(7138);x0 = x[j].add(x0.multiply(targetY.subtract(y[j])));
        }

        }__CLR4_4_15cw5cwlb90p79v.R.inc(7139);return x0;

    }finally{__CLR4_4_15cw5cwlb90p79v.R.flushNeeded();}}

}
