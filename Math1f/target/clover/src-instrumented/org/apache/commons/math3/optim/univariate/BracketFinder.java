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

import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;

/**
 * Provide an interval that brackets a local optimum of a function.
 * This code is based on a Python implementation (from <em>SciPy</em>,
 * module {@code optimize.py} v0.5).
 *
 * @version $Id$
 * @since 2.2
 */
public class BracketFinder {public static class __CLR4_4_1vahvahlb90p9vb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,40686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Tolerance to avoid division by zero. */
    private static final double EPS_MIN = 1e-21;
    /**
     * Golden section.
     */
    private static final double GOLD = 1.618034;
    /**
     * Factor for expanding the interval.
     */
    private final double growLimit;
    /**
     * Counter for function evaluations.
     */
    private final Incrementor evaluations = new Incrementor();
    /**
     * Lower bound of the bracket.
     */
    private double lo;
    /**
     * Higher bound of the bracket.
     */
    private double hi;
    /**
     * Point inside the bracket.
     */
    private double mid;
    /**
     * Function value at {@link #lo}.
     */
    private double fLo;
    /**
     * Function value at {@link #hi}.
     */
    private double fHi;
    /**
     * Function value at {@link #mid}.
     */
    private double fMid;

    /**
     * Constructor with default values {@code 100, 50} (see the
     * {@link #BracketFinder(double,int) other constructor}).
     */
    public BracketFinder() {
        this(100, 50);__CLR4_4_1vahvahlb90p9vb.R.inc(40554);try{__CLR4_4_1vahvahlb90p9vb.R.inc(40553);
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * Create a bracketing interval finder.
     *
     * @param growLimit Expanding factor.
     * @param maxEvaluations Maximum number of evaluations allowed for finding
     * a bracketing interval.
     */
    public BracketFinder(double growLimit,
                         int maxEvaluations) {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40555);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40556);if ((((growLimit <= 0)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40557)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40558)==0&false))) {{
            __CLR4_4_1vahvahlb90p9vb.R.inc(40559);throw new NotStrictlyPositiveException(growLimit);
        }
        }__CLR4_4_1vahvahlb90p9vb.R.inc(40560);if ((((maxEvaluations <= 0)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40561)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40562)==0&false))) {{
            __CLR4_4_1vahvahlb90p9vb.R.inc(40563);throw new NotStrictlyPositiveException(maxEvaluations);
        }

        }__CLR4_4_1vahvahlb90p9vb.R.inc(40564);this.growLimit = growLimit;
        __CLR4_4_1vahvahlb90p9vb.R.inc(40565);evaluations.setMaximalCount(maxEvaluations);
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * Search new points that bracket a local optimum of the function.
     *
     * @param func Function whose optimum should be bracketed.
     * @param goal {@link GoalType Goal type}.
     * @param xA Initial point.
     * @param xB Initial point.
     * @throws TooManyEvaluationsException if the maximum number of evaluations
     * is exceeded.
     */
    public void search(UnivariateFunction func, GoalType goal, double xA, double xB) {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40566);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40567);evaluations.resetCount();
        __CLR4_4_1vahvahlb90p9vb.R.inc(40568);final boolean isMinim = goal == GoalType.MINIMIZE;

        __CLR4_4_1vahvahlb90p9vb.R.inc(40569);double fA = eval(func, xA);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40570);double fB = eval(func, xB);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40571);if (((((((isMinim )&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40572)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40573)==0&false))?
            fA < fB :
            fA > fB)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40574)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40575)==0&false))) {{

            __CLR4_4_1vahvahlb90p9vb.R.inc(40576);double tmp = xA;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40577);xA = xB;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40578);xB = tmp;

            __CLR4_4_1vahvahlb90p9vb.R.inc(40579);tmp = fA;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40580);fA = fB;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40581);fB = tmp;
        }

        }__CLR4_4_1vahvahlb90p9vb.R.inc(40582);double xC = xB + GOLD * (xB - xA);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40583);double fC = eval(func, xC);

        __CLR4_4_1vahvahlb90p9vb.R.inc(40584);while (((((((isMinim )&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40585)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40586)==0&false))? fC < fB : fC > fB)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40587)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40588)==0&false))) {{
            __CLR4_4_1vahvahlb90p9vb.R.inc(40589);double tmp1 = (xB - xA) * (fB - fC);
            __CLR4_4_1vahvahlb90p9vb.R.inc(40590);double tmp2 = (xB - xC) * (fB - fA);

            __CLR4_4_1vahvahlb90p9vb.R.inc(40591);double val = tmp2 - tmp1;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40592);double denom = (((Math.abs(val) < EPS_MIN )&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40593)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40594)==0&false))? 2 * EPS_MIN : 2 * val;

            __CLR4_4_1vahvahlb90p9vb.R.inc(40595);double w = xB - ((xB - xC) * tmp2 - (xB - xA) * tmp1) / denom;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40596);double wLim = xB + growLimit * (xC - xB);

            __CLR4_4_1vahvahlb90p9vb.R.inc(40597);double fW;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40598);if (((((w - xC) * (xB - w) > 0)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40599)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40600)==0&false))) {{
                __CLR4_4_1vahvahlb90p9vb.R.inc(40601);fW = eval(func, w);
                __CLR4_4_1vahvahlb90p9vb.R.inc(40602);if (((((((isMinim )&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40603)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40604)==0&false))?
                    fW < fC :
                    fW > fC)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40605)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40606)==0&false))) {{
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40607);xA = xB;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40608);xB = w;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40609);fA = fB;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40610);fB = fW;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40611);break;
                } }else {__CLR4_4_1vahvahlb90p9vb.R.inc(40612);if (((((((isMinim )&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40613)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40614)==0&false))?
                           fW > fB :
                           fW < fB)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40615)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40616)==0&false))) {{
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40617);xC = w;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40618);fC = fW;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40619);break;
                }
                }}__CLR4_4_1vahvahlb90p9vb.R.inc(40620);w = xC + GOLD * (xC - xB);
                __CLR4_4_1vahvahlb90p9vb.R.inc(40621);fW = eval(func, w);
            } }else {__CLR4_4_1vahvahlb90p9vb.R.inc(40622);if (((((w - wLim) * (wLim - xC) >= 0)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40623)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40624)==0&false))) {{
                __CLR4_4_1vahvahlb90p9vb.R.inc(40625);w = wLim;
                __CLR4_4_1vahvahlb90p9vb.R.inc(40626);fW = eval(func, w);
            } }else {__CLR4_4_1vahvahlb90p9vb.R.inc(40627);if (((((w - wLim) * (xC - w) > 0)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40628)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40629)==0&false))) {{
                __CLR4_4_1vahvahlb90p9vb.R.inc(40630);fW = eval(func, w);
                __CLR4_4_1vahvahlb90p9vb.R.inc(40631);if (((((((isMinim )&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40632)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40633)==0&false))?
                    fW < fC :
                    fW > fC)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40634)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40635)==0&false))) {{
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40636);xB = xC;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40637);xC = w;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40638);w = xC + GOLD * (xC - xB);
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40639);fB = fC;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40640);fC =fW;
                    __CLR4_4_1vahvahlb90p9vb.R.inc(40641);fW = eval(func, w);
                }
            }} }else {{
                __CLR4_4_1vahvahlb90p9vb.R.inc(40642);w = xC + GOLD * (xC - xB);
                __CLR4_4_1vahvahlb90p9vb.R.inc(40643);fW = eval(func, w);
            }

            }}}__CLR4_4_1vahvahlb90p9vb.R.inc(40644);xA = xB;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40645);fA = fB;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40646);xB = xC;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40647);fB = fC;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40648);xC = w;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40649);fC = fW;
        }

        }__CLR4_4_1vahvahlb90p9vb.R.inc(40650);lo = xA;
        __CLR4_4_1vahvahlb90p9vb.R.inc(40651);fLo = fA;
        __CLR4_4_1vahvahlb90p9vb.R.inc(40652);mid = xB;
        __CLR4_4_1vahvahlb90p9vb.R.inc(40653);fMid = fB;
        __CLR4_4_1vahvahlb90p9vb.R.inc(40654);hi = xC;
        __CLR4_4_1vahvahlb90p9vb.R.inc(40655);fHi = fC;

        __CLR4_4_1vahvahlb90p9vb.R.inc(40656);if ((((lo > hi)&&(__CLR4_4_1vahvahlb90p9vb.R.iget(40657)!=0|true))||(__CLR4_4_1vahvahlb90p9vb.R.iget(40658)==0&false))) {{
            __CLR4_4_1vahvahlb90p9vb.R.inc(40659);double tmp = lo;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40660);lo = hi;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40661);hi = tmp;

            __CLR4_4_1vahvahlb90p9vb.R.inc(40662);tmp = fLo;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40663);fLo = fHi;
            __CLR4_4_1vahvahlb90p9vb.R.inc(40664);fHi = tmp;
        }
    }}finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * @return the number of evalutations.
     */
    public int getMaxEvaluations() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40665);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40666);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * @return the number of evalutations.
     */
    public int getEvaluations() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40667);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40668);return evaluations.getCount();
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * @return the lower bound of the bracket.
     * @see #getFLo()
     */
    public double getLo() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40669);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40670);return lo;
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * Get function value at {@link #getLo()}.
     * @return function value at {@link #getLo()}
     */
    public double getFLo() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40671);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40672);return fLo;
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * @return the higher bound of the bracket.
     * @see #getFHi()
     */
    public double getHi() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40673);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40674);return hi;
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * Get function value at {@link #getHi()}.
     * @return function value at {@link #getHi()}
     */
    public double getFHi() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40675);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40676);return fHi;
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * @return a point in the middle of the bracket.
     * @see #getFMid()
     */
    public double getMid() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40677);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40678);return mid;
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * Get function value at {@link #getMid()}.
     * @return function value at {@link #getMid()}
     */
    public double getFMid() {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40679);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40680);return fMid;
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}

    /**
     * @param f Function.
     * @param x Argument.
     * @return {@code f(x)}
     * @throws TooManyEvaluationsException if the maximal number of evaluations is
     * exceeded.
     */
    private double eval(UnivariateFunction f, double x) {try{__CLR4_4_1vahvahlb90p9vb.R.inc(40681);
        __CLR4_4_1vahvahlb90p9vb.R.inc(40682);try {
            __CLR4_4_1vahvahlb90p9vb.R.inc(40683);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_1vahvahlb90p9vb.R.inc(40684);throw new TooManyEvaluationsException(e.getMax());
        }
        __CLR4_4_1vahvahlb90p9vb.R.inc(40685);return f.value(x);
    }finally{__CLR4_4_1vahvahlb90p9vb.R.flushNeeded();}}
}
