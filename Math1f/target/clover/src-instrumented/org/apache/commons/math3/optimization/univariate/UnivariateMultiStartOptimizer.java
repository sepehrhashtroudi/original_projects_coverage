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

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;

/**
 * Special implementation of the {@link UnivariateOptimizer} interface
 * adding multi-start features to an existing optimizer.
 *
 * This class wraps a classical optimizer to use it several times in
 * turn with different starting points in order to avoid being trapped
 * into a local extremum when looking for a global one.
 *
 * @param <FUNC> Type of the objective function to be optimized.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public class UnivariateMultiStartOptimizer<FUNC extends UnivariateFunction>
    implements BaseUnivariateOptimizer<FUNC> {public static class __CLR4_4_1105l105llb90pa84{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying classical optimizer. */
    private final BaseUnivariateOptimizer<FUNC> optimizer;
    /** Maximal number of evaluations allowed. */
    private int maxEvaluations;
    /** Number of evaluations already performed for all starts. */
    private int totalEvaluations;
    /** Number of starts to go. */
    private int starts;
    /** Random generator for multi-start. */
    private RandomGenerator generator;
    /** Found optima. */
    private UnivariatePointValuePair[] optima;

    /**
     * Create a multi-start optimizer from a single-start optimizer.
     *
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform. If {@code starts == 1},
     * the {@code optimize} methods will return the same solution as
     * {@code optimizer} would.
     * @param generator Random generator to use for restarts.
     * @throws NullArgumentException if {@code optimizer} or {@code generator}
     * is {@code null}.
     * @throws NotStrictlyPositiveException if {@code starts < 1}.
     */
    public UnivariateMultiStartOptimizer(final BaseUnivariateOptimizer<FUNC> optimizer,
                                             final int starts,
                                             final RandomGenerator generator) {try{__CLR4_4_1105l105llb90pa84.R.inc(46857);
        __CLR4_4_1105l105llb90pa84.R.inc(46858);if ((((optimizer == null ||
                generator == null)&&(__CLR4_4_1105l105llb90pa84.R.iget(46859)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46860)==0&false))) {{
                __CLR4_4_1105l105llb90pa84.R.inc(46861);throw new NullArgumentException();
        }
        }__CLR4_4_1105l105llb90pa84.R.inc(46862);if ((((starts < 1)&&(__CLR4_4_1105l105llb90pa84.R.iget(46863)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46864)==0&false))) {{
            __CLR4_4_1105l105llb90pa84.R.inc(46865);throw new NotStrictlyPositiveException(starts);
        }

        }__CLR4_4_1105l105llb90pa84.R.inc(46866);this.optimizer = optimizer;
        __CLR4_4_1105l105llb90pa84.R.inc(46867);this.starts = starts;
        __CLR4_4_1105l105llb90pa84.R.inc(46868);this.generator = generator;
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public ConvergenceChecker<UnivariatePointValuePair> getConvergenceChecker() {try{__CLR4_4_1105l105llb90pa84.R.inc(46869);
        __CLR4_4_1105l105llb90pa84.R.inc(46870);return optimizer.getConvergenceChecker();
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1105l105llb90pa84.R.inc(46871);
        __CLR4_4_1105l105llb90pa84.R.inc(46872);return maxEvaluations;
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1105l105llb90pa84.R.inc(46873);
        __CLR4_4_1105l105llb90pa84.R.inc(46874);return totalEvaluations;
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /**
     * Get all the optima found during the last call to {@link
     * #optimize(int,UnivariateFunction,GoalType,double,double) optimize}.
     * The optimizer stores all the optima found during a set of
     * restarts. The {@link #optimize(int,UnivariateFunction,GoalType,double,double) optimize}
     * method returns the best point only. This method returns all the points
     * found at the end of each starts, including the best one already
     * returned by the {@link #optimize(int,UnivariateFunction,GoalType,double,double) optimize}
     * method.
     * <br/>
     * The returned array as one element for each start as specified
     * in the constructor. It is ordered with the results from the
     * runs that did converge first, sorted from best to worst
     * objective value (i.e in ascending order if minimizing and in
     * descending order if maximizing), followed by {@code null} elements
     * corresponding to the runs that did not converge. This means all
     * elements will be {@code null} if the {@link
     * #optimize(int,UnivariateFunction,GoalType,double,double) optimize}
     * method did throw an exception.
     * This also means that if the first element is not {@code null}, it is
     * the best point found across all starts.
     *
     * @return an array containing the optima.
     * @throws MathIllegalStateException if {@link
     * #optimize(int,UnivariateFunction,GoalType,double,double) optimize}
     * has not been called.
     */
    public UnivariatePointValuePair[] getOptima() {try{__CLR4_4_1105l105llb90pa84.R.inc(46875);
        __CLR4_4_1105l105llb90pa84.R.inc(46876);if ((((optima == null)&&(__CLR4_4_1105l105llb90pa84.R.iget(46877)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46878)==0&false))) {{
            __CLR4_4_1105l105llb90pa84.R.inc(46879);throw new MathIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
        }
        }__CLR4_4_1105l105llb90pa84.R.inc(46880);return optima.clone();
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /** {@inheritDoc} */
    public UnivariatePointValuePair optimize(int maxEval, final FUNC f,
                                                 final GoalType goal,
                                                 final double min, final double max) {try{__CLR4_4_1105l105llb90pa84.R.inc(46881);
        __CLR4_4_1105l105llb90pa84.R.inc(46882);return optimize(maxEval, f, goal, min, max, min + 0.5 * (max - min));
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /** {@inheritDoc} */
    public UnivariatePointValuePair optimize(int maxEval, final FUNC f,
                                                 final GoalType goal,
                                                 final double min, final double max,
                                                 final double startValue) {try{__CLR4_4_1105l105llb90pa84.R.inc(46883);
        __CLR4_4_1105l105llb90pa84.R.inc(46884);RuntimeException lastException = null;
        __CLR4_4_1105l105llb90pa84.R.inc(46885);optima = new UnivariatePointValuePair[starts];
        __CLR4_4_1105l105llb90pa84.R.inc(46886);totalEvaluations = 0;

        // Multi-start loop.
        __CLR4_4_1105l105llb90pa84.R.inc(46887);for (int i = 0; (((i < starts)&&(__CLR4_4_1105l105llb90pa84.R.iget(46888)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46889)==0&false)); ++i) {{
            // CHECKSTYLE: stop IllegalCatch
            __CLR4_4_1105l105llb90pa84.R.inc(46890);try {
                __CLR4_4_1105l105llb90pa84.R.inc(46891);final double s = ((((i == 0) )&&(__CLR4_4_1105l105llb90pa84.R.iget(46892)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46893)==0&false))? startValue : min + generator.nextDouble() * (max - min);
                __CLR4_4_1105l105llb90pa84.R.inc(46894);optima[i] = optimizer.optimize(maxEval - totalEvaluations, f, goal, min, max, s);
            } catch (RuntimeException mue) {
                __CLR4_4_1105l105llb90pa84.R.inc(46895);lastException = mue;
                __CLR4_4_1105l105llb90pa84.R.inc(46896);optima[i] = null;
            }
            // CHECKSTYLE: resume IllegalCatch

            __CLR4_4_1105l105llb90pa84.R.inc(46897);totalEvaluations += optimizer.getEvaluations();
        }

        }__CLR4_4_1105l105llb90pa84.R.inc(46898);sortPairs(goal);

        __CLR4_4_1105l105llb90pa84.R.inc(46899);if ((((optima[0] == null)&&(__CLR4_4_1105l105llb90pa84.R.iget(46900)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46901)==0&false))) {{
            __CLR4_4_1105l105llb90pa84.R.inc(46902);throw lastException; // cannot be null if starts >=1
        }

        // Return the point with the best objective function value.
        }__CLR4_4_1105l105llb90pa84.R.inc(46903);return optima[0];
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}

    /**
     * Sort the optima from best to worst, followed by {@code null} elements.
     *
     * @param goal Goal type.
     */
    private void sortPairs(final GoalType goal) {try{__CLR4_4_1105l105llb90pa84.R.inc(46904);
        __CLR4_4_1105l105llb90pa84.R.inc(46905);Arrays.sort(optima, new Comparator<UnivariatePointValuePair>() {
                public int compare(final UnivariatePointValuePair o1,
                                   final UnivariatePointValuePair o2) {try{__CLR4_4_1105l105llb90pa84.R.inc(46906);
                    __CLR4_4_1105l105llb90pa84.R.inc(46907);if ((((o1 == null)&&(__CLR4_4_1105l105llb90pa84.R.iget(46908)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46909)==0&false))) {{
                        __CLR4_4_1105l105llb90pa84.R.inc(46910);return ((((o2 == null) )&&(__CLR4_4_1105l105llb90pa84.R.iget(46911)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46912)==0&false))? 0 : 1;
                    } }else {__CLR4_4_1105l105llb90pa84.R.inc(46913);if ((((o2 == null)&&(__CLR4_4_1105l105llb90pa84.R.iget(46914)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46915)==0&false))) {{
                        __CLR4_4_1105l105llb90pa84.R.inc(46916);return -1;
                    }
                    }}__CLR4_4_1105l105llb90pa84.R.inc(46917);final double v1 = o1.getValue();
                    __CLR4_4_1105l105llb90pa84.R.inc(46918);final double v2 = o2.getValue();
                    __CLR4_4_1105l105llb90pa84.R.inc(46919);return ((((goal == GoalType.MINIMIZE) )&&(__CLR4_4_1105l105llb90pa84.R.iget(46920)!=0|true))||(__CLR4_4_1105l105llb90pa84.R.iget(46921)==0&false))?
                        Double.compare(v1, v2) : Double.compare(v2, v1);
                }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}
            });
    }finally{__CLR4_4_1105l105llb90pa84.R.flushNeeded();}}
}
