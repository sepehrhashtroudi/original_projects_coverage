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
package org.apache.commons.math3.optim;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

/**
 * Base class for implementing optimizers for multivariate functions.
 * It contains the boiler-plate code for initial guess and bounds
 * specifications.
 * <em>It is not a "user" class.</em>
 *
 * @param <PAIR> Type of the point/value pair returned by the optimization
 * algorithm.
 *
 * @version $Id$
 * @since 3.1
 */
public abstract class BaseMultivariateOptimizer<PAIR>
    extends BaseOptimizer<PAIR> {public static class __CLR4_4_1rghrghlb90p9ku{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Initial guess. */
    private double[] start;
    /** Lower bounds. */
    private double[] lowerBound;
    /** Upper bounds. */
    private double[] upperBound;

    /**
     * @param checker Convergence checker.
     */
    protected BaseMultivariateOptimizer(ConvergenceChecker<PAIR> checker) {
        super(checker);__CLR4_4_1rghrghlb90p9ku.R.inc(35586);try{__CLR4_4_1rghrghlb90p9ku.R.inc(35585);
    }finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param optData Optimization data. In addition to those documented in
     * {@link BaseOptimizer#parseOptimizationData(OptimizationData[]) BaseOptimizer},
     * this method will register the following data:
     * <ul>
     *  <li>{@link InitialGuess}</li>
     *  <li>{@link SimpleBounds}</li>
     * </ul>
     * @return {@inheritDoc}
     */
    @Override
    public PAIR optimize(OptimizationData... optData) {try{__CLR4_4_1rghrghlb90p9ku.R.inc(35587);
        // Perform optimization.
        __CLR4_4_1rghrghlb90p9ku.R.inc(35588);return super.optimize(optData);
    }finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data. The following data will be looked for:
     * <ul>
     *  <li>{@link InitialGuess}</li>
     *  <li>{@link SimpleBounds}</li>
     * </ul>
     */
    @Override
    protected void parseOptimizationData(OptimizationData... optData) {try{__CLR4_4_1rghrghlb90p9ku.R.inc(35589);
        // Allow base class to register its own data.
        __CLR4_4_1rghrghlb90p9ku.R.inc(35590);super.parseOptimizationData(optData);

        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        __CLR4_4_1rghrghlb90p9ku.R.inc(35591);for (OptimizationData data : optData) {{
            __CLR4_4_1rghrghlb90p9ku.R.inc(35592);if ((((data instanceof InitialGuess)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35593)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35594)==0&false))) {{
                __CLR4_4_1rghrghlb90p9ku.R.inc(35595);start = ((InitialGuess) data).getInitialGuess();
                __CLR4_4_1rghrghlb90p9ku.R.inc(35596);continue;
            }
            }__CLR4_4_1rghrghlb90p9ku.R.inc(35597);if ((((data instanceof SimpleBounds)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35598)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35599)==0&false))) {{
                __CLR4_4_1rghrghlb90p9ku.R.inc(35600);final SimpleBounds bounds = (SimpleBounds) data;
                __CLR4_4_1rghrghlb90p9ku.R.inc(35601);lowerBound = bounds.getLower();
                __CLR4_4_1rghrghlb90p9ku.R.inc(35602);upperBound = bounds.getUpper();
                __CLR4_4_1rghrghlb90p9ku.R.inc(35603);continue;
            }
        }}

        // Check input consistency.
        }__CLR4_4_1rghrghlb90p9ku.R.inc(35604);checkParameters();
    }finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}

    /**
     * Gets the initial guess.
     *
     * @return the initial guess, or {@code null} if not set.
     */
    public double[] getStartPoint() {try{__CLR4_4_1rghrghlb90p9ku.R.inc(35605);
        __CLR4_4_1rghrghlb90p9ku.R.inc(35606);return (((start == null )&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35607)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35608)==0&false))? null : start.clone();
    }finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}
    /**
     * @return the lower bounds, or {@code null} if not set.
     */
    public double[] getLowerBound() {try{__CLR4_4_1rghrghlb90p9ku.R.inc(35609);
        __CLR4_4_1rghrghlb90p9ku.R.inc(35610);return (((lowerBound == null )&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35611)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35612)==0&false))? null : lowerBound.clone();
    }finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}
    /**
     * @return the upper bounds, or {@code null} if not set.
     */
    public double[] getUpperBound() {try{__CLR4_4_1rghrghlb90p9ku.R.inc(35613);
        __CLR4_4_1rghrghlb90p9ku.R.inc(35614);return (((upperBound == null )&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35615)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35616)==0&false))? null : upperBound.clone();
    }finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}

    /**
     * Check parameters consistency.
     */
    private void checkParameters() {try{__CLR4_4_1rghrghlb90p9ku.R.inc(35617);
        __CLR4_4_1rghrghlb90p9ku.R.inc(35618);if ((((start != null)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35619)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35620)==0&false))) {{
            __CLR4_4_1rghrghlb90p9ku.R.inc(35621);final int dim = start.length;
            __CLR4_4_1rghrghlb90p9ku.R.inc(35622);if ((((lowerBound != null)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35623)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35624)==0&false))) {{
                __CLR4_4_1rghrghlb90p9ku.R.inc(35625);if ((((lowerBound.length != dim)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35626)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35627)==0&false))) {{
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35628);throw new DimensionMismatchException(lowerBound.length, dim);
                }
                }__CLR4_4_1rghrghlb90p9ku.R.inc(35629);for (int i = 0; (((i < dim)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35630)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35631)==0&false)); i++) {{
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35632);final double v = start[i];
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35633);final double lo = lowerBound[i];
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35634);if ((((v < lo)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35635)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35636)==0&false))) {{
                        __CLR4_4_1rghrghlb90p9ku.R.inc(35637);throw new NumberIsTooSmallException(v, lo, true);
                    }
                }}
            }}
            }__CLR4_4_1rghrghlb90p9ku.R.inc(35638);if ((((upperBound != null)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35639)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35640)==0&false))) {{
                __CLR4_4_1rghrghlb90p9ku.R.inc(35641);if ((((upperBound.length != dim)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35642)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35643)==0&false))) {{
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35644);throw new DimensionMismatchException(upperBound.length, dim);
                }
                }__CLR4_4_1rghrghlb90p9ku.R.inc(35645);for (int i = 0; (((i < dim)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35646)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35647)==0&false)); i++) {{
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35648);final double v = start[i];
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35649);final double hi = upperBound[i];
                    __CLR4_4_1rghrghlb90p9ku.R.inc(35650);if ((((v > hi)&&(__CLR4_4_1rghrghlb90p9ku.R.iget(35651)!=0|true))||(__CLR4_4_1rghrghlb90p9ku.R.iget(35652)==0&false))) {{
                        __CLR4_4_1rghrghlb90p9ku.R.inc(35653);throw new NumberIsTooLargeException(v, hi, true);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_4_1rghrghlb90p9ku.R.flushNeeded();}}
}
