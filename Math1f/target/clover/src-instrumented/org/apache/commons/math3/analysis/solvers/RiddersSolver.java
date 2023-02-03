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
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;

/**
 * Implements the <a href="http://mathworld.wolfram.com/RiddersMethod.html">
 * Ridders' Method</a> for root finding of real univariate functions. For
 * reference, see C. Ridders, <i>A new algorithm for computing a single root
 * of a real continuous function </i>, IEEE Transactions on Circuits and
 * Systems, 26 (1979), 979 - 980.
 * <p>
 * The function should be continuous but not necessarily smooth.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class RiddersSolver extends AbstractUnivariateSolver {public static class __CLR4_4_14mo4molb90p76e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,6068,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default absolute accuracy. */
    private static final double DEFAULT_ABSOLUTE_ACCURACY = 1e-6;

    /**
     * Construct a solver with default accuracy (1e-6).
     */
    public RiddersSolver() {
        this(DEFAULT_ABSOLUTE_ACCURACY);__CLR4_4_14mo4molb90p76e.R.inc(6001);try{__CLR4_4_14mo4molb90p76e.R.inc(6000);
    }finally{__CLR4_4_14mo4molb90p76e.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy Absolute accuracy.
     */
    public RiddersSolver(double absoluteAccuracy) {
        super(absoluteAccuracy);__CLR4_4_14mo4molb90p76e.R.inc(6003);try{__CLR4_4_14mo4molb90p76e.R.inc(6002);
    }finally{__CLR4_4_14mo4molb90p76e.R.flushNeeded();}}
    /**
     * Construct a solver.
     *
     * @param relativeAccuracy Relative accuracy.
     * @param absoluteAccuracy Absolute accuracy.
     */
    public RiddersSolver(double relativeAccuracy,
                         double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy);__CLR4_4_14mo4molb90p76e.R.inc(6005);try{__CLR4_4_14mo4molb90p76e.R.inc(6004);
    }finally{__CLR4_4_14mo4molb90p76e.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    protected double doSolve()
        throws TooManyEvaluationsException,
               NoBracketingException {try{__CLR4_4_14mo4molb90p76e.R.inc(6006);
        __CLR4_4_14mo4molb90p76e.R.inc(6007);double min = getMin();
        __CLR4_4_14mo4molb90p76e.R.inc(6008);double max = getMax();
        // [x1, x2] is the bracketing interval in each iteration
        // x3 is the midpoint of [x1, x2]
        // x is the new root approximation and an endpoint of the new interval
        __CLR4_4_14mo4molb90p76e.R.inc(6009);double x1 = min;
        __CLR4_4_14mo4molb90p76e.R.inc(6010);double y1 = computeObjectiveValue(x1);
        __CLR4_4_14mo4molb90p76e.R.inc(6011);double x2 = max;
        __CLR4_4_14mo4molb90p76e.R.inc(6012);double y2 = computeObjectiveValue(x2);

        // check for zeros before verifying bracketing
        __CLR4_4_14mo4molb90p76e.R.inc(6013);if ((((y1 == 0)&&(__CLR4_4_14mo4molb90p76e.R.iget(6014)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6015)==0&false))) {{
            __CLR4_4_14mo4molb90p76e.R.inc(6016);return min;
        }
        }__CLR4_4_14mo4molb90p76e.R.inc(6017);if ((((y2 == 0)&&(__CLR4_4_14mo4molb90p76e.R.iget(6018)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6019)==0&false))) {{
            __CLR4_4_14mo4molb90p76e.R.inc(6020);return max;
        }
        }__CLR4_4_14mo4molb90p76e.R.inc(6021);verifyBracketing(min, max);

        __CLR4_4_14mo4molb90p76e.R.inc(6022);final double absoluteAccuracy = getAbsoluteAccuracy();
        __CLR4_4_14mo4molb90p76e.R.inc(6023);final double functionValueAccuracy = getFunctionValueAccuracy();
        __CLR4_4_14mo4molb90p76e.R.inc(6024);final double relativeAccuracy = getRelativeAccuracy();

        __CLR4_4_14mo4molb90p76e.R.inc(6025);double oldx = Double.POSITIVE_INFINITY;
        __CLR4_4_14mo4molb90p76e.R.inc(6026);while (true) {{
            // calculate the new root approximation
            __CLR4_4_14mo4molb90p76e.R.inc(6027);final double x3 = 0.5 * (x1 + x2);
            __CLR4_4_14mo4molb90p76e.R.inc(6028);final double y3 = computeObjectiveValue(x3);
            __CLR4_4_14mo4molb90p76e.R.inc(6029);if ((((FastMath.abs(y3) <= functionValueAccuracy)&&(__CLR4_4_14mo4molb90p76e.R.iget(6030)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6031)==0&false))) {{
                __CLR4_4_14mo4molb90p76e.R.inc(6032);return x3;
            }
            }__CLR4_4_14mo4molb90p76e.R.inc(6033);final double delta = 1 - (y1 * y2) / (y3 * y3);  // delta > 1 due to bracketing
            __CLR4_4_14mo4molb90p76e.R.inc(6034);final double correction = (FastMath.signum(y2) * FastMath.signum(y3)) *
                                      (x3 - x1) / FastMath.sqrt(delta);
            __CLR4_4_14mo4molb90p76e.R.inc(6035);final double x = x3 - correction;                // correction != 0
            __CLR4_4_14mo4molb90p76e.R.inc(6036);final double y = computeObjectiveValue(x);

            // check for convergence
            __CLR4_4_14mo4molb90p76e.R.inc(6037);final double tolerance = FastMath.max(relativeAccuracy * FastMath.abs(x), absoluteAccuracy);
            __CLR4_4_14mo4molb90p76e.R.inc(6038);if ((((FastMath.abs(x - oldx) <= tolerance)&&(__CLR4_4_14mo4molb90p76e.R.iget(6039)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6040)==0&false))) {{
                __CLR4_4_14mo4molb90p76e.R.inc(6041);return x;
            }
            }__CLR4_4_14mo4molb90p76e.R.inc(6042);if ((((FastMath.abs(y) <= functionValueAccuracy)&&(__CLR4_4_14mo4molb90p76e.R.iget(6043)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6044)==0&false))) {{
                __CLR4_4_14mo4molb90p76e.R.inc(6045);return x;
            }

            // prepare the new interval for next iteration
            // Ridders' method guarantees x1 < x < x2
            }__CLR4_4_14mo4molb90p76e.R.inc(6046);if ((((correction > 0.0)&&(__CLR4_4_14mo4molb90p76e.R.iget(6047)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6048)==0&false))) {{             // x1 < x < x3
                __CLR4_4_14mo4molb90p76e.R.inc(6049);if ((((FastMath.signum(y1) + FastMath.signum(y) == 0.0)&&(__CLR4_4_14mo4molb90p76e.R.iget(6050)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6051)==0&false))) {{
                    __CLR4_4_14mo4molb90p76e.R.inc(6052);x2 = x;
                    __CLR4_4_14mo4molb90p76e.R.inc(6053);y2 = y;
                } }else {{
                    __CLR4_4_14mo4molb90p76e.R.inc(6054);x1 = x;
                    __CLR4_4_14mo4molb90p76e.R.inc(6055);x2 = x3;
                    __CLR4_4_14mo4molb90p76e.R.inc(6056);y1 = y;
                    __CLR4_4_14mo4molb90p76e.R.inc(6057);y2 = y3;
                }
            }} }else {{                            // x3 < x < x2
                __CLR4_4_14mo4molb90p76e.R.inc(6058);if ((((FastMath.signum(y2) + FastMath.signum(y) == 0.0)&&(__CLR4_4_14mo4molb90p76e.R.iget(6059)!=0|true))||(__CLR4_4_14mo4molb90p76e.R.iget(6060)==0&false))) {{
                    __CLR4_4_14mo4molb90p76e.R.inc(6061);x1 = x;
                    __CLR4_4_14mo4molb90p76e.R.inc(6062);y1 = y;
                } }else {{
                    __CLR4_4_14mo4molb90p76e.R.inc(6063);x1 = x3;
                    __CLR4_4_14mo4molb90p76e.R.inc(6064);x2 = x;
                    __CLR4_4_14mo4molb90p76e.R.inc(6065);y1 = y3;
                    __CLR4_4_14mo4molb90p76e.R.inc(6066);y2 = y;
                }
            }}
            }__CLR4_4_14mo4molb90p76e.R.inc(6067);oldx = x;
        }
    }}finally{__CLR4_4_14mo4molb90p76e.R.flushNeeded();}}
}
