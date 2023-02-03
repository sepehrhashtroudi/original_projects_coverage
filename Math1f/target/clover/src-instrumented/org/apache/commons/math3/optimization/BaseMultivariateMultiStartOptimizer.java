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

package org.apache.commons.math3.optimization;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomVectorGenerator;

/**
 * Base class for all implementations of a multi-start optimizer.
 *
 * This interface is mainly intended to enforce the internal coherence of
 * Commons-Math. Users of the API are advised to base their code on
 * {@link MultivariateMultiStartOptimizer} or on
 * {@link DifferentiableMultivariateMultiStartOptimizer}.
 *
 * @param <FUNC> Type of the objective function to be optimized.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public class BaseMultivariateMultiStartOptimizer<FUNC extends MultivariateFunction>
    implements BaseMultivariateOptimizer<FUNC> {public static class __CLR4_4_1vo3vo3lb90p9wa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,41106,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying classical optimizer. */
    private final BaseMultivariateOptimizer<FUNC> optimizer;
    /** Maximal number of evaluations allowed. */
    private int maxEvaluations;
    /** Number of evaluations already performed for all starts. */
    private int totalEvaluations;
    /** Number of starts to go. */
    private int starts;
    /** Random generator for multi-start. */
    private RandomVectorGenerator generator;
    /** Found optima. */
    private PointValuePair[] optima;

    /**
     * Create a multi-start optimizer from a single-start optimizer.
     *
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform. If {@code starts == 1},
     * the {@link #optimize(int,MultivariateFunction,GoalType,double[])
     * optimize} will return the same solution as {@code optimizer} would.
     * @param generator Random vector generator to use for restarts.
     * @throws NullArgumentException if {@code optimizer} or {@code generator}
     * is {@code null}.
     * @throws NotStrictlyPositiveException if {@code starts < 1}.
     */
    protected BaseMultivariateMultiStartOptimizer(final BaseMultivariateOptimizer<FUNC> optimizer,
                                                      final int starts,
                                                      final RandomVectorGenerator generator) {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41043);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41044);if ((((optimizer == null ||
            generator == null)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41045)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41046)==0&false))) {{
            __CLR4_4_1vo3vo3lb90p9wa.R.inc(41047);throw new NullArgumentException();
        }
        }__CLR4_4_1vo3vo3lb90p9wa.R.inc(41048);if ((((starts < 1)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41049)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41050)==0&false))) {{
            __CLR4_4_1vo3vo3lb90p9wa.R.inc(41051);throw new NotStrictlyPositiveException(starts);
        }

        }__CLR4_4_1vo3vo3lb90p9wa.R.inc(41052);this.optimizer = optimizer;
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41053);this.starts = starts;
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41054);this.generator = generator;
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}

    /**
     * Get all the optima found during the last call to {@link
     * #optimize(int,MultivariateFunction,GoalType,double[]) optimize}.
     * The optimizer stores all the optima found during a set of
     * restarts. The {@link #optimize(int,MultivariateFunction,GoalType,double[])
     * optimize} method returns the best point only. This method
     * returns all the points found at the end of each starts,
     * including the best one already returned by the {@link
     * #optimize(int,MultivariateFunction,GoalType,double[]) optimize} method.
     * <br/>
     * The returned array as one element for each start as specified
     * in the constructor. It is ordered with the results from the
     * runs that did converge first, sorted from best to worst
     * objective value (i.e in ascending order if minimizing and in
     * descending order if maximizing), followed by and null elements
     * corresponding to the runs that did not converge. This means all
     * elements will be null if the {@link #optimize(int,MultivariateFunction,GoalType,double[])
     * optimize} method did throw an exception.
     * This also means that if the first element is not {@code null}, it
     * is the best point found across all starts.
     *
     * @return an array containing the optima.
     * @throws MathIllegalStateException if {@link
     * #optimize(int,MultivariateFunction,GoalType,double[]) optimize}
     * has not been called.
     */
    public PointValuePair[] getOptima() {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41055);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41056);if ((((optima == null)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41057)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41058)==0&false))) {{
            __CLR4_4_1vo3vo3lb90p9wa.R.inc(41059);throw new MathIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
        }
        }__CLR4_4_1vo3vo3lb90p9wa.R.inc(41060);return optima.clone();
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41061);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41062);return maxEvaluations;
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41063);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41064);return totalEvaluations;
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ConvergenceChecker<PointValuePair> getConvergenceChecker() {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41065);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41066);return optimizer.getConvergenceChecker();
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public PointValuePair optimize(int maxEval, final FUNC f,
                                       final GoalType goal,
                                       double[] startPoint) {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41067);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41068);maxEvaluations = maxEval;
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41069);RuntimeException lastException = null;
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41070);optima = new PointValuePair[starts];
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41071);totalEvaluations = 0;

        // Multi-start loop.
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41072);for (int i = 0; (((i < starts)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41073)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41074)==0&false)); ++i) {{
            // CHECKSTYLE: stop IllegalCatch
            __CLR4_4_1vo3vo3lb90p9wa.R.inc(41075);try {
                __CLR4_4_1vo3vo3lb90p9wa.R.inc(41076);optima[i] = optimizer.optimize(maxEval - totalEvaluations, f, goal,
                                               (((i == 0 )&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41077)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41078)==0&false))? startPoint : generator.nextVector());
            } catch (RuntimeException mue) {
                __CLR4_4_1vo3vo3lb90p9wa.R.inc(41079);lastException = mue;
                __CLR4_4_1vo3vo3lb90p9wa.R.inc(41080);optima[i] = null;
            }
            // CHECKSTYLE: resume IllegalCatch

            __CLR4_4_1vo3vo3lb90p9wa.R.inc(41081);totalEvaluations += optimizer.getEvaluations();
        }

        }__CLR4_4_1vo3vo3lb90p9wa.R.inc(41082);sortPairs(goal);

        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41083);if ((((optima[0] == null)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41084)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41085)==0&false))) {{
            __CLR4_4_1vo3vo3lb90p9wa.R.inc(41086);throw lastException; // cannot be null if starts >=1
        }

        // Return the found point given the best objective function value.
        }__CLR4_4_1vo3vo3lb90p9wa.R.inc(41087);return optima[0];
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}

    /**
     * Sort the optima from best to worst, followed by {@code null} elements.
     *
     * @param goal Goal type.
     */
    private void sortPairs(final GoalType goal) {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41088);
        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41089);Arrays.sort(optima, new Comparator<PointValuePair>() {
                public int compare(final PointValuePair o1,
                                   final PointValuePair o2) {try{__CLR4_4_1vo3vo3lb90p9wa.R.inc(41090);
                    __CLR4_4_1vo3vo3lb90p9wa.R.inc(41091);if ((((o1 == null)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41092)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41093)==0&false))) {{
                        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41094);return ((((o2 == null) )&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41095)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41096)==0&false))? 0 : 1;
                    } }else {__CLR4_4_1vo3vo3lb90p9wa.R.inc(41097);if ((((o2 == null)&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41098)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41099)==0&false))) {{
                        __CLR4_4_1vo3vo3lb90p9wa.R.inc(41100);return -1;
                    }
                    }}__CLR4_4_1vo3vo3lb90p9wa.R.inc(41101);final double v1 = o1.getValue();
                    __CLR4_4_1vo3vo3lb90p9wa.R.inc(41102);final double v2 = o2.getValue();
                    __CLR4_4_1vo3vo3lb90p9wa.R.inc(41103);return ((((goal == GoalType.MINIMIZE) )&&(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41104)!=0|true))||(__CLR4_4_1vo3vo3lb90p9wa.R.iget(41105)==0&false))?
                        Double.compare(v1, v2) : Double.compare(v2, v1);
                }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}
            });
    }finally{__CLR4_4_1vo3vo3lb90p9wa.R.flushNeeded();}}
}
