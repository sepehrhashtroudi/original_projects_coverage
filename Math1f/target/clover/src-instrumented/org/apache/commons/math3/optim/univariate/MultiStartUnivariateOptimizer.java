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

import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.OptimizationData;

/**
 * Special implementation of the {@link UnivariateOptimizer} interface
 * adding multi-start features to an existing optimizer.
 * <br/>
 * This class wraps an optimizer in order to use it several times in
 * turn with different starting points (trying to avoid being trapped
 * in a local extremum when looking for a global one).
 *
 * @version $Id$
 * @since 3.0
 */
public class MultiStartUnivariateOptimizer
    extends UnivariateOptimizer {public static class __CLR4_4_1viyviylb90p9vo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,40946,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying classical optimizer. */
    private final UnivariateOptimizer optimizer;
    /** Number of evaluations already performed for all starts. */
    private int totalEvaluations;
    /** Number of starts to go. */
    private int starts;
    /** Random generator for multi-start. */
    private RandomGenerator generator;
    /** Found optima. */
    private UnivariatePointValuePair[] optima;
    /** Optimization data. */
    private OptimizationData[] optimData;
    /**
     * Location in {@link #optimData} where the updated maximum
     * number of evaluations will be stored.
     */
    private int maxEvalIndex = -1;
    /**
     * Location in {@link #optimData} where the updated start value
     * will be stored.
     */
    private int searchIntervalIndex = -1;

    /**
     * Create a multi-start optimizer from a single-start optimizer.
     *
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform. If {@code starts == 1},
     * the {@code optimize} methods will return the same solution as
     * {@code optimizer} would.
     * @param generator Random generator to use for restarts.
     * @throws NotStrictlyPositiveException if {@code starts < 1}.
     */
    public MultiStartUnivariateOptimizer(final UnivariateOptimizer optimizer,
                                         final int starts,
                                         final RandomGenerator generator) {
        super(optimizer.getConvergenceChecker());__CLR4_4_1viyviylb90p9vo.R.inc(40859);try{__CLR4_4_1viyviylb90p9vo.R.inc(40858);

        __CLR4_4_1viyviylb90p9vo.R.inc(40860);if ((((starts < 1)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40861)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40862)==0&false))) {{
            __CLR4_4_1viyviylb90p9vo.R.inc(40863);throw new NotStrictlyPositiveException(starts);
        }

        }__CLR4_4_1viyviylb90p9vo.R.inc(40864);this.optimizer = optimizer;
        __CLR4_4_1viyviylb90p9vo.R.inc(40865);this.starts = starts;
        __CLR4_4_1viyviylb90p9vo.R.inc(40866);this.generator = generator;
    }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getEvaluations() {try{__CLR4_4_1viyviylb90p9vo.R.inc(40867);
        __CLR4_4_1viyviylb90p9vo.R.inc(40868);return totalEvaluations;
    }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}

    /**
     * Gets all the optima found during the last call to {@code optimize}.
     * The optimizer stores all the optima found during a set of
     * restarts. The {@code optimize} method returns the best point only.
     * This method returns all the points found at the end of each starts,
     * including the best one already returned by the {@code optimize} method.
     * <br/>
     * The returned array as one element for each start as specified
     * in the constructor. It is ordered with the results from the
     * runs that did converge first, sorted from best to worst
     * objective value (i.e in ascending order if minimizing and in
     * descending order if maximizing), followed by {@code null} elements
     * corresponding to the runs that did not converge. This means all
     * elements will be {@code null} if the {@code optimize} method did throw
     * an exception.
     * This also means that if the first element is not {@code null}, it is
     * the best point found across all starts.
     *
     * @return an array containing the optima.
     * @throws MathIllegalStateException if {@link #optimize(OptimizationData[])
     * optimize} has not been called.
     */
    public UnivariatePointValuePair[] getOptima() {try{__CLR4_4_1viyviylb90p9vo.R.inc(40869);
        __CLR4_4_1viyviylb90p9vo.R.inc(40870);if ((((optima == null)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40871)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40872)==0&false))) {{
            __CLR4_4_1viyviylb90p9vo.R.inc(40873);throw new MathIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
        }
        }__CLR4_4_1viyviylb90p9vo.R.inc(40874);return optima.clone();
    }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalStateException if {@code optData} does not contain an
     * instance of {@link MaxEval} or {@link SearchInterval}.
     */
    @Override
    public UnivariatePointValuePair optimize(OptimizationData... optData) {try{__CLR4_4_1viyviylb90p9vo.R.inc(40875);
        // Store arguments in order to pass them to the internal optimizer.
       __CLR4_4_1viyviylb90p9vo.R.inc(40876);optimData = optData;
        // Set up base class and perform computations.
        __CLR4_4_1viyviylb90p9vo.R.inc(40877);return super.optimize(optData);
    }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected UnivariatePointValuePair doOptimize() {try{__CLR4_4_1viyviylb90p9vo.R.inc(40878);
        // Remove all instances of "MaxEval" and "SearchInterval" from the
        // array that will be passed to the internal optimizer.
        // The former is to enforce smaller numbers of allowed evaluations
        // (according to how many have been used up already), and the latter
        // to impose a different start value for each start.
        __CLR4_4_1viyviylb90p9vo.R.inc(40879);for (int i = 0; (((i < optimData.length)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40880)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40881)==0&false)); i++) {{
            __CLR4_4_1viyviylb90p9vo.R.inc(40882);if ((((optimData[i] instanceof MaxEval)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40883)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40884)==0&false))) {{
                __CLR4_4_1viyviylb90p9vo.R.inc(40885);optimData[i] = null;
                __CLR4_4_1viyviylb90p9vo.R.inc(40886);maxEvalIndex = i;
                __CLR4_4_1viyviylb90p9vo.R.inc(40887);continue;
            }
            }__CLR4_4_1viyviylb90p9vo.R.inc(40888);if ((((optimData[i] instanceof SearchInterval)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40889)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40890)==0&false))) {{
                __CLR4_4_1viyviylb90p9vo.R.inc(40891);optimData[i] = null;
                __CLR4_4_1viyviylb90p9vo.R.inc(40892);searchIntervalIndex = i;
                __CLR4_4_1viyviylb90p9vo.R.inc(40893);continue;
            }
        }}
        }__CLR4_4_1viyviylb90p9vo.R.inc(40894);if ((((maxEvalIndex == -1)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40895)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40896)==0&false))) {{
            __CLR4_4_1viyviylb90p9vo.R.inc(40897);throw new MathIllegalStateException();
        }
        }__CLR4_4_1viyviylb90p9vo.R.inc(40898);if ((((searchIntervalIndex == -1)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40899)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40900)==0&false))) {{
            __CLR4_4_1viyviylb90p9vo.R.inc(40901);throw new MathIllegalStateException();
        }

        }__CLR4_4_1viyviylb90p9vo.R.inc(40902);RuntimeException lastException = null;
        __CLR4_4_1viyviylb90p9vo.R.inc(40903);optima = new UnivariatePointValuePair[starts];
        __CLR4_4_1viyviylb90p9vo.R.inc(40904);totalEvaluations = 0;

        __CLR4_4_1viyviylb90p9vo.R.inc(40905);final int maxEval = getMaxEvaluations();
        __CLR4_4_1viyviylb90p9vo.R.inc(40906);final double min = getMin();
        __CLR4_4_1viyviylb90p9vo.R.inc(40907);final double max = getMax();
        __CLR4_4_1viyviylb90p9vo.R.inc(40908);final double startValue = getStartValue();

        // Multi-start loop.
        __CLR4_4_1viyviylb90p9vo.R.inc(40909);for (int i = 0; (((i < starts)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40910)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40911)==0&false)); i++) {{
            // CHECKSTYLE: stop IllegalCatch
            __CLR4_4_1viyviylb90p9vo.R.inc(40912);try {
                // Decrease number of allowed evaluations.
                __CLR4_4_1viyviylb90p9vo.R.inc(40913);optimData[maxEvalIndex] = new MaxEval(maxEval - totalEvaluations);
                // New start value.
                __CLR4_4_1viyviylb90p9vo.R.inc(40914);final double s = ((((i == 0) )&&(__CLR4_4_1viyviylb90p9vo.R.iget(40915)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40916)==0&false))?
                    startValue :
                    min + generator.nextDouble() * (max - min);
                __CLR4_4_1viyviylb90p9vo.R.inc(40917);optimData[searchIntervalIndex] = new SearchInterval(min, max, s);
                // Optimize.
                __CLR4_4_1viyviylb90p9vo.R.inc(40918);optima[i] = optimizer.optimize(optimData);
            } catch (RuntimeException mue) {
                __CLR4_4_1viyviylb90p9vo.R.inc(40919);lastException = mue;
                __CLR4_4_1viyviylb90p9vo.R.inc(40920);optima[i] = null;
            }
            // CHECKSTYLE: resume IllegalCatch

            __CLR4_4_1viyviylb90p9vo.R.inc(40921);totalEvaluations += optimizer.getEvaluations();
        }

        }__CLR4_4_1viyviylb90p9vo.R.inc(40922);sortPairs(getGoalType());

        __CLR4_4_1viyviylb90p9vo.R.inc(40923);if ((((optima[0] == null)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40924)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40925)==0&false))) {{
            __CLR4_4_1viyviylb90p9vo.R.inc(40926);throw lastException; // Cannot be null if starts >= 1.
        }

        // Return the point with the best objective function value.
        }__CLR4_4_1viyviylb90p9vo.R.inc(40927);return optima[0];
    }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}

    /**
     * Sort the optima from best to worst, followed by {@code null} elements.
     *
     * @param goal Goal type.
     */
    private void sortPairs(final GoalType goal) {try{__CLR4_4_1viyviylb90p9vo.R.inc(40928);
        __CLR4_4_1viyviylb90p9vo.R.inc(40929);Arrays.sort(optima, new Comparator<UnivariatePointValuePair>() {
                public int compare(final UnivariatePointValuePair o1,
                                   final UnivariatePointValuePair o2) {try{__CLR4_4_1viyviylb90p9vo.R.inc(40930);
                    __CLR4_4_1viyviylb90p9vo.R.inc(40931);if ((((o1 == null)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40932)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40933)==0&false))) {{
                        __CLR4_4_1viyviylb90p9vo.R.inc(40934);return ((((o2 == null) )&&(__CLR4_4_1viyviylb90p9vo.R.iget(40935)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40936)==0&false))? 0 : 1;
                    } }else {__CLR4_4_1viyviylb90p9vo.R.inc(40937);if ((((o2 == null)&&(__CLR4_4_1viyviylb90p9vo.R.iget(40938)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40939)==0&false))) {{
                        __CLR4_4_1viyviylb90p9vo.R.inc(40940);return -1;
                    }
                    }}__CLR4_4_1viyviylb90p9vo.R.inc(40941);final double v1 = o1.getValue();
                    __CLR4_4_1viyviylb90p9vo.R.inc(40942);final double v2 = o2.getValue();
                    __CLR4_4_1viyviylb90p9vo.R.inc(40943);return ((((goal == GoalType.MINIMIZE) )&&(__CLR4_4_1viyviylb90p9vo.R.iget(40944)!=0|true))||(__CLR4_4_1viyviylb90p9vo.R.iget(40945)==0&false))?
                        Double.compare(v1, v2) : Double.compare(v2, v1);
                }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}
            });
    }finally{__CLR4_4_1viyviylb90p9vo.R.flushNeeded();}}
}
