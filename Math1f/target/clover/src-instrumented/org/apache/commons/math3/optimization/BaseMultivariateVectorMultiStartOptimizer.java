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

import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
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
 * {@link DifferentiableMultivariateVectorMultiStartOptimizer}.
 *
 * @param <FUNC> Type of the objective function to be optimized.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 3.0
 */
@Deprecated
public class BaseMultivariateVectorMultiStartOptimizer<FUNC extends MultivariateVectorFunction>
    implements BaseMultivariateVectorOptimizer<FUNC> {public static class __CLR4_4_1vpuvpulb90p9wj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,41175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying classical optimizer. */
    private final BaseMultivariateVectorOptimizer<FUNC> optimizer;
    /** Maximal number of evaluations allowed. */
    private int maxEvaluations;
    /** Number of evaluations already performed for all starts. */
    private int totalEvaluations;
    /** Number of starts to go. */
    private int starts;
    /** Random generator for multi-start. */
    private RandomVectorGenerator generator;
    /** Found optima. */
    private PointVectorValuePair[] optima;

    /**
     * Create a multi-start optimizer from a single-start optimizer.
     *
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform. If {@code starts == 1},
     * the {@link #optimize(int,MultivariateVectorFunction,double[],double[],double[])
     * optimize} will return the same solution as {@code optimizer} would.
     * @param generator Random vector generator to use for restarts.
     * @throws NullArgumentException if {@code optimizer} or {@code generator}
     * is {@code null}.
     * @throws NotStrictlyPositiveException if {@code starts < 1}.
     */
    protected BaseMultivariateVectorMultiStartOptimizer(final BaseMultivariateVectorOptimizer<FUNC> optimizer,
                                                           final int starts,
                                                           final RandomVectorGenerator generator) {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41106);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41107);if ((((optimizer == null ||
            generator == null)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41108)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41109)==0&false))) {{
            __CLR4_4_1vpuvpulb90p9wj.R.inc(41110);throw new NullArgumentException();
        }
        }__CLR4_4_1vpuvpulb90p9wj.R.inc(41111);if ((((starts < 1)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41112)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41113)==0&false))) {{
            __CLR4_4_1vpuvpulb90p9wj.R.inc(41114);throw new NotStrictlyPositiveException(starts);
        }

        }__CLR4_4_1vpuvpulb90p9wj.R.inc(41115);this.optimizer = optimizer;
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41116);this.starts = starts;
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41117);this.generator = generator;
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}

    /**
     * Get all the optima found during the last call to {@link
     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize}.
     * The optimizer stores all the optima found during a set of
     * restarts. The {@link #optimize(int,MultivariateVectorFunction,double[],double[],double[])
     * optimize} method returns the best point only. This method
     * returns all the points found at the end of each starts, including
     * the best one already returned by the {@link
     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize} method.
     * <br/>
     * The returned array as one element for each start as specified
     * in the constructor. It is ordered with the results from the
     * runs that did converge first, sorted from best to worst
     * objective value (i.e. in ascending order if minimizing and in
     * descending order if maximizing), followed by and null elements
     * corresponding to the runs that did not converge. This means all
     * elements will be null if the {@link
     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize} method did
     * throw a {@link ConvergenceException}). This also means that if
     * the first element is not {@code null}, it is the best point found
     * across all starts.
     *
     * @return array containing the optima
     * @throws MathIllegalStateException if {@link
     * #optimize(int,MultivariateVectorFunction,double[],double[],double[]) optimize} has not been
     * called.
     */
    public PointVectorValuePair[] getOptima() {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41118);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41119);if ((((optima == null)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41120)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41121)==0&false))) {{
            __CLR4_4_1vpuvpulb90p9wj.R.inc(41122);throw new MathIllegalStateException(LocalizedFormats.NO_OPTIMUM_COMPUTED_YET);
        }
        }__CLR4_4_1vpuvpulb90p9wj.R.inc(41123);return optima.clone();
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41124);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41125);return maxEvaluations;
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41126);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41127);return totalEvaluations;
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}

    /** {@inheritDoc} */
    public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker() {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41128);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41129);return optimizer.getConvergenceChecker();
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public PointVectorValuePair optimize(int maxEval, final FUNC f,
                                            double[] target, double[] weights,
                                            double[] startPoint) {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41130);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41131);maxEvaluations = maxEval;
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41132);RuntimeException lastException = null;
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41133);optima = new PointVectorValuePair[starts];
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41134);totalEvaluations = 0;

        // Multi-start loop.
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41135);for (int i = 0; (((i < starts)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41136)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41137)==0&false)); ++i) {{

            // CHECKSTYLE: stop IllegalCatch
            __CLR4_4_1vpuvpulb90p9wj.R.inc(41138);try {
                __CLR4_4_1vpuvpulb90p9wj.R.inc(41139);optima[i] = optimizer.optimize(maxEval - totalEvaluations, f, target, weights,
                                               (((i == 0 )&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41140)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41141)==0&false))? startPoint : generator.nextVector());
            } catch (ConvergenceException oe) {
                __CLR4_4_1vpuvpulb90p9wj.R.inc(41142);optima[i] = null;
            } catch (RuntimeException mue) {
                __CLR4_4_1vpuvpulb90p9wj.R.inc(41143);lastException = mue;
                __CLR4_4_1vpuvpulb90p9wj.R.inc(41144);optima[i] = null;
            }
            // CHECKSTYLE: resume IllegalCatch

            __CLR4_4_1vpuvpulb90p9wj.R.inc(41145);totalEvaluations += optimizer.getEvaluations();
        }

        }__CLR4_4_1vpuvpulb90p9wj.R.inc(41146);sortPairs(target, weights);

        __CLR4_4_1vpuvpulb90p9wj.R.inc(41147);if ((((optima[0] == null)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41148)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41149)==0&false))) {{
            __CLR4_4_1vpuvpulb90p9wj.R.inc(41150);throw lastException; // cannot be null if starts >=1
        }

        // Return the found point given the best objective function value.
        }__CLR4_4_1vpuvpulb90p9wj.R.inc(41151);return optima[0];
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}

    /**
     * Sort the optima from best to worst, followed by {@code null} elements.
     *
     * @param target Target value for the objective functions at optimum.
     * @param weights Weights for the least-squares cost computation.
     */
    private void sortPairs(final double[] target,
                           final double[] weights) {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41152);
        __CLR4_4_1vpuvpulb90p9wj.R.inc(41153);Arrays.sort(optima, new Comparator<PointVectorValuePair>() {
                public int compare(final PointVectorValuePair o1,
                                   final PointVectorValuePair o2) {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41154);
                    __CLR4_4_1vpuvpulb90p9wj.R.inc(41155);if ((((o1 == null)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41156)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41157)==0&false))) {{
                        __CLR4_4_1vpuvpulb90p9wj.R.inc(41158);return ((((o2 == null) )&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41159)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41160)==0&false))? 0 : 1;
                    } }else {__CLR4_4_1vpuvpulb90p9wj.R.inc(41161);if ((((o2 == null)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41162)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41163)==0&false))) {{
                        __CLR4_4_1vpuvpulb90p9wj.R.inc(41164);return -1;
                    }
                    }}__CLR4_4_1vpuvpulb90p9wj.R.inc(41165);return Double.compare(weightedResidual(o1), weightedResidual(o2));
                }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}
                private double weightedResidual(final PointVectorValuePair pv) {try{__CLR4_4_1vpuvpulb90p9wj.R.inc(41166);
                    __CLR4_4_1vpuvpulb90p9wj.R.inc(41167);final double[] value = pv.getValueRef();
                    __CLR4_4_1vpuvpulb90p9wj.R.inc(41168);double sum = 0;
                    __CLR4_4_1vpuvpulb90p9wj.R.inc(41169);for (int i = 0; (((i < value.length)&&(__CLR4_4_1vpuvpulb90p9wj.R.iget(41170)!=0|true))||(__CLR4_4_1vpuvpulb90p9wj.R.iget(41171)==0&false)); ++i) {{
                        __CLR4_4_1vpuvpulb90p9wj.R.inc(41172);final double ri = value[i] - target[i];
                        __CLR4_4_1vpuvpulb90p9wj.R.inc(41173);sum += weights[i] * ri * ri;
                    }
                    }__CLR4_4_1vpuvpulb90p9wj.R.inc(41174);return sum;
                }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}
            });
    }finally{__CLR4_4_1vpuvpulb90p9wj.R.flushNeeded();}}
}
