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

import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;

/**
 * Provide a default implementation for several functions useful to generic
 * optimizers.
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.0
 */
@Deprecated
public abstract class BaseAbstractUnivariateOptimizer
    implements UnivariateOptimizer {public static class __CLR4_4_1zvezvelb90pa7c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Convergence checker. */
    private final ConvergenceChecker<UnivariatePointValuePair> checker;
    /** Evaluations counter. */
    private final Incrementor evaluations = new Incrementor();
    /** Optimization type */
    private GoalType goal;
    /** Lower end of search interval. */
    private double searchMin;
    /** Higher end of search interval. */
    private double searchMax;
    /** Initial guess . */
    private double searchStart;
    /** Function to optimize. */
    private UnivariateFunction function;

    /**
     * @param checker Convergence checking procedure.
     */
    protected BaseAbstractUnivariateOptimizer(ConvergenceChecker<UnivariatePointValuePair> checker) {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46490);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46491);this.checker = checker;
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getMaxEvaluations() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46492);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46493);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public int getEvaluations() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46494);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46495);return evaluations.getCount();
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /**
     * @return the optimization type.
     */
    public GoalType getGoalType() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46496);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46497);return goal;
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}
    /**
     * @return the lower end of the search interval.
     */
    public double getMin() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46498);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46499);return searchMin;
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}
    /**
     * @return the higher end of the search interval.
     */
    public double getMax() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46500);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46501);return searchMax;
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}
    /**
     * @return the initial guess.
     */
    public double getStartValue() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46502);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46503);return searchStart;
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /**
     * Compute the objective function value.
     *
     * @param point Point at which the objective function must be evaluated.
     * @return the objective function value at specified point.
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * is exceeded.
     */
    protected double computeObjectiveValue(double point) {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46504);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46505);try {
            __CLR4_4_1zvezvelb90pa7c.R.inc(46506);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_1zvezvelb90pa7c.R.inc(46507);throw new TooManyEvaluationsException(e.getMax());
        }
        __CLR4_4_1zvezvelb90pa7c.R.inc(46508);return function.value(point);
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public UnivariatePointValuePair optimize(int maxEval, UnivariateFunction f,
                                             GoalType goalType,
                                             double min, double max,
                                             double startValue) {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46509);
        // Checks.
        __CLR4_4_1zvezvelb90pa7c.R.inc(46510);if ((((f == null)&&(__CLR4_4_1zvezvelb90pa7c.R.iget(46511)!=0|true))||(__CLR4_4_1zvezvelb90pa7c.R.iget(46512)==0&false))) {{
            __CLR4_4_1zvezvelb90pa7c.R.inc(46513);throw new NullArgumentException();
        }
        }__CLR4_4_1zvezvelb90pa7c.R.inc(46514);if ((((goalType == null)&&(__CLR4_4_1zvezvelb90pa7c.R.iget(46515)!=0|true))||(__CLR4_4_1zvezvelb90pa7c.R.iget(46516)==0&false))) {{
            __CLR4_4_1zvezvelb90pa7c.R.inc(46517);throw new NullArgumentException();
        }

        // Reset.
        }__CLR4_4_1zvezvelb90pa7c.R.inc(46518);searchMin = min;
        __CLR4_4_1zvezvelb90pa7c.R.inc(46519);searchMax = max;
        __CLR4_4_1zvezvelb90pa7c.R.inc(46520);searchStart = startValue;
        __CLR4_4_1zvezvelb90pa7c.R.inc(46521);goal = goalType;
        __CLR4_4_1zvezvelb90pa7c.R.inc(46522);function = f;
        __CLR4_4_1zvezvelb90pa7c.R.inc(46523);evaluations.setMaximalCount(maxEval);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46524);evaluations.resetCount();

        // Perform computation.
        __CLR4_4_1zvezvelb90pa7c.R.inc(46525);return doOptimize();
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /** {@inheritDoc} */
    public UnivariatePointValuePair optimize(int maxEval,
                                             UnivariateFunction f,
                                             GoalType goalType,
                                             double min, double max){try{__CLR4_4_1zvezvelb90pa7c.R.inc(46526);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46527);return optimize(maxEval, f, goalType, min, max, min + 0.5 * (max - min));
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    public ConvergenceChecker<UnivariatePointValuePair> getConvergenceChecker() {try{__CLR4_4_1zvezvelb90pa7c.R.inc(46528);
        __CLR4_4_1zvezvelb90pa7c.R.inc(46529);return checker;
    }finally{__CLR4_4_1zvezvelb90pa7c.R.flushNeeded();}}

    /**
     * Method for implementing actual optimization algorithms in derived
     * classes.
     *
     * @return the optimum and its corresponding function value.
     * @throws TooManyEvaluationsException if the maximal number of evaluations
     * is exceeded.
     */
    protected abstract UnivariatePointValuePair doOptimize();
}
