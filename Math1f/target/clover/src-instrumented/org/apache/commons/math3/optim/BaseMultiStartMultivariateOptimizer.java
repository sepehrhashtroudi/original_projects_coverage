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

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.random.RandomVectorGenerator;

/**
 * Base class multi-start optimizer for a multivariate function.
 * <br/>
 * This class wraps an optimizer in order to use it several times in
 * turn with different starting points (trying to avoid being trapped
 * in a local extremum when looking for a global one).
 * <em>It is not a "user" class.</em>
 *
 * @param <PAIR> Type of the point/value pair returned by the optimization
 * algorithm.
 *
 * @version $Id$
 * @since 3.0
 */
public abstract class BaseMultiStartMultivariateOptimizer<PAIR>
    extends BaseMultivariateOptimizer<PAIR> {public static class __CLR4_4_1re8re8lb90p9kq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,35585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Underlying classical optimizer. */
    private final BaseMultivariateOptimizer<PAIR> optimizer;
    /** Number of evaluations already performed for all starts. */
    private int totalEvaluations;
    /** Number of starts to go. */
    private int starts;
    /** Random generator for multi-start. */
    private RandomVectorGenerator generator;
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
    private int initialGuessIndex = -1;

    /**
     * Create a multi-start optimizer from a single-start optimizer.
     * <p>
     * Note that if there are bounds constraints (see {@link #getLowerBound()}
     * and {@link #getUpperBound()}), then a simple rejection algorithm is used
     * at each restart. This implies that the random vector generator should have
     * a good probability to generate vectors in the bounded domain, otherwise the
     * rejection algorithm will hit the {@link #getMaxEvaluations()} count without
     * generating a proper restart point. Users must be take great care of the <a
     * href="http://en.wikipedia.org/wiki/Curse_of_dimensionality">curse of dimensionality</a>.
     * </p>
     * @param optimizer Single-start optimizer to wrap.
     * @param starts Number of starts to perform. If {@code starts == 1},
     * the {@link #optimize(OptimizationData[]) optimize} will return the
     * same solution as the given {@code optimizer} would return.
     * @param generator Random vector generator to use for restarts.
     * @throws NotStrictlyPositiveException if {@code starts < 1}.
     */
    public BaseMultiStartMultivariateOptimizer(final BaseMultivariateOptimizer<PAIR> optimizer,
                                               final int starts,
                                               final RandomVectorGenerator generator) {
        super(optimizer.getConvergenceChecker());__CLR4_4_1re8re8lb90p9kq.R.inc(35505);try{__CLR4_4_1re8re8lb90p9kq.R.inc(35504);

        __CLR4_4_1re8re8lb90p9kq.R.inc(35506);if ((((starts < 1)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35507)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35508)==0&false))) {{
            __CLR4_4_1re8re8lb90p9kq.R.inc(35509);throw new NotStrictlyPositiveException(starts);
        }

        }__CLR4_4_1re8re8lb90p9kq.R.inc(35510);this.optimizer = optimizer;
        __CLR4_4_1re8re8lb90p9kq.R.inc(35511);this.starts = starts;
        __CLR4_4_1re8re8lb90p9kq.R.inc(35512);this.generator = generator;
    }finally{__CLR4_4_1re8re8lb90p9kq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getEvaluations() {try{__CLR4_4_1re8re8lb90p9kq.R.inc(35513);
        __CLR4_4_1re8re8lb90p9kq.R.inc(35514);return totalEvaluations;
    }finally{__CLR4_4_1re8re8lb90p9kq.R.flushNeeded();}}

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
     * <br/>
     * The behaviour is undefined if this method is called before
     * {@code optimize}; it will likely throw {@code NullPointerException}.
     *
     * @return an array containing the optima sorted from best to worst.
     */
    public abstract PAIR[] getOptima();

    /**
     * {@inheritDoc}
     *
     * @throws MathIllegalStateException if {@code optData} does not contain an
     * instance of {@link MaxEval} or {@link InitialGuess}.
     */
    @Override
    public PAIR optimize(OptimizationData... optData) {try{__CLR4_4_1re8re8lb90p9kq.R.inc(35515);
        // Store arguments in order to pass them to the internal optimizer.
       __CLR4_4_1re8re8lb90p9kq.R.inc(35516);optimData = optData;
        // Set up base class and perform computations.
        __CLR4_4_1re8re8lb90p9kq.R.inc(35517);return super.optimize(optData);
    }finally{__CLR4_4_1re8re8lb90p9kq.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    protected PAIR doOptimize() {try{__CLR4_4_1re8re8lb90p9kq.R.inc(35518);
        // Remove all instances of "MaxEval" and "InitialGuess" from the
        // array that will be passed to the internal optimizer.
        // The former is to enforce smaller numbers of allowed evaluations
        // (according to how many have been used up already), and the latter
        // to impose a different start value for each start.
        __CLR4_4_1re8re8lb90p9kq.R.inc(35519);for (int i = 0; (((i < optimData.length)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35520)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35521)==0&false)); i++) {{
            __CLR4_4_1re8re8lb90p9kq.R.inc(35522);if ((((optimData[i] instanceof MaxEval)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35523)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35524)==0&false))) {{
                __CLR4_4_1re8re8lb90p9kq.R.inc(35525);optimData[i] = null;
                __CLR4_4_1re8re8lb90p9kq.R.inc(35526);maxEvalIndex = i;
            }
            }__CLR4_4_1re8re8lb90p9kq.R.inc(35527);if ((((optimData[i] instanceof InitialGuess)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35528)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35529)==0&false))) {{
                __CLR4_4_1re8re8lb90p9kq.R.inc(35530);optimData[i] = null;
                __CLR4_4_1re8re8lb90p9kq.R.inc(35531);initialGuessIndex = i;
                __CLR4_4_1re8re8lb90p9kq.R.inc(35532);continue;
            }
        }}
        }__CLR4_4_1re8re8lb90p9kq.R.inc(35533);if ((((maxEvalIndex == -1)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35534)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35535)==0&false))) {{
            __CLR4_4_1re8re8lb90p9kq.R.inc(35536);throw new MathIllegalStateException();
        }
        }__CLR4_4_1re8re8lb90p9kq.R.inc(35537);if ((((initialGuessIndex == -1)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35538)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35539)==0&false))) {{
            __CLR4_4_1re8re8lb90p9kq.R.inc(35540);throw new MathIllegalStateException();
        }

        }__CLR4_4_1re8re8lb90p9kq.R.inc(35541);RuntimeException lastException = null;
        __CLR4_4_1re8re8lb90p9kq.R.inc(35542);totalEvaluations = 0;
        __CLR4_4_1re8re8lb90p9kq.R.inc(35543);clear();

        __CLR4_4_1re8re8lb90p9kq.R.inc(35544);final int maxEval = getMaxEvaluations();
        __CLR4_4_1re8re8lb90p9kq.R.inc(35545);final double[] min = getLowerBound();
        __CLR4_4_1re8re8lb90p9kq.R.inc(35546);final double[] max = getUpperBound();
        __CLR4_4_1re8re8lb90p9kq.R.inc(35547);final double[] startPoint = getStartPoint();

        // Multi-start loop.
        __CLR4_4_1re8re8lb90p9kq.R.inc(35548);for (int i = 0; (((i < starts)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35549)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35550)==0&false)); i++) {{
            // CHECKSTYLE: stop IllegalCatch
            __CLR4_4_1re8re8lb90p9kq.R.inc(35551);try {
                // Decrease number of allowed evaluations.
                __CLR4_4_1re8re8lb90p9kq.R.inc(35552);optimData[maxEvalIndex] = new MaxEval(maxEval - totalEvaluations);
                // New start value.
                __CLR4_4_1re8re8lb90p9kq.R.inc(35553);double[] s = null;
                __CLR4_4_1re8re8lb90p9kq.R.inc(35554);if ((((i == 0)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35555)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35556)==0&false))) {{
                    __CLR4_4_1re8re8lb90p9kq.R.inc(35557);s = startPoint;
                } }else {{
                    __CLR4_4_1re8re8lb90p9kq.R.inc(35558);int attempts = 0;
                    __CLR4_4_1re8re8lb90p9kq.R.inc(35559);while ((((s == null)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35560)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35561)==0&false))) {{
                        __CLR4_4_1re8re8lb90p9kq.R.inc(35562);if ((((attempts++ >= getMaxEvaluations())&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35563)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35564)==0&false))) {{
                            __CLR4_4_1re8re8lb90p9kq.R.inc(35565);throw new TooManyEvaluationsException(getMaxEvaluations());
                        }
                        }__CLR4_4_1re8re8lb90p9kq.R.inc(35566);s = generator.nextVector();
                        __CLR4_4_1re8re8lb90p9kq.R.inc(35567);for (int k = 0; (((s != null && k < s.length)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35568)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35569)==0&false)); ++k) {{
                            __CLR4_4_1re8re8lb90p9kq.R.inc(35570);if (((((min != null && s[k] < min[k]) || (max != null && s[k] > max[k]))&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35571)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35572)==0&false))) {{
                                // reject the vector
                                __CLR4_4_1re8re8lb90p9kq.R.inc(35573);s = null;
                            }
                        }}
                    }}
                }}
                }__CLR4_4_1re8re8lb90p9kq.R.inc(35574);optimData[initialGuessIndex] = new InitialGuess(s);
                // Optimize.
                __CLR4_4_1re8re8lb90p9kq.R.inc(35575);final PAIR result = optimizer.optimize(optimData);
                __CLR4_4_1re8re8lb90p9kq.R.inc(35576);store(result);
            } catch (RuntimeException mue) {
                __CLR4_4_1re8re8lb90p9kq.R.inc(35577);lastException = mue;
            }
            // CHECKSTYLE: resume IllegalCatch

            __CLR4_4_1re8re8lb90p9kq.R.inc(35578);totalEvaluations += optimizer.getEvaluations();
        }

        }__CLR4_4_1re8re8lb90p9kq.R.inc(35579);final PAIR[] optima = getOptima();
        __CLR4_4_1re8re8lb90p9kq.R.inc(35580);if ((((optima.length == 0)&&(__CLR4_4_1re8re8lb90p9kq.R.iget(35581)!=0|true))||(__CLR4_4_1re8re8lb90p9kq.R.iget(35582)==0&false))) {{
            // All runs failed.
            __CLR4_4_1re8re8lb90p9kq.R.inc(35583);throw lastException; // Cannot be null if starts >= 1.
        }

        // Return the best optimum.
        }__CLR4_4_1re8re8lb90p9kq.R.inc(35584);return optima[0];
    }finally{__CLR4_4_1re8re8lb90p9kq.R.flushNeeded();}}

    /**
     * Method that will be called in order to store each found optimum.
     *
     * @param optimum Result of an optimization run.
     */
    protected abstract void store(PAIR optimum);
    /**
     * Method that will called in order to clear all stored optima.
     */
    protected abstract void clear();
}
