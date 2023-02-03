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
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optimization.GoalType;

/**
 * Provide an interval that brackets a local optimum of a function.
 * This code is based on a Python implementation (from <em>SciPy</em>,
 * module {@code optimize.py} v0.5).
 *
 * @version $Id$
 * @deprecated As of 3.1 (to be removed in 4.0).
 * @since 2.2
 */
@Deprecated
public class BracketFinder {public static class __CLR4_4_1zwizwilb90pa7k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,46663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        this(100, 50);__CLR4_4_1zwizwilb90pa7k.R.inc(46531);try{__CLR4_4_1zwizwilb90pa7k.R.inc(46530);
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * Create a bracketing interval finder.
     *
     * @param growLimit Expanding factor.
     * @param maxEvaluations Maximum number of evaluations allowed for finding
     * a bracketing interval.
     */
    public BracketFinder(double growLimit,
                         int maxEvaluations) {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46532);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46533);if ((((growLimit <= 0)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46534)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46535)==0&false))) {{
            __CLR4_4_1zwizwilb90pa7k.R.inc(46536);throw new NotStrictlyPositiveException(growLimit);
        }
        }__CLR4_4_1zwizwilb90pa7k.R.inc(46537);if ((((maxEvaluations <= 0)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46538)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46539)==0&false))) {{
            __CLR4_4_1zwizwilb90pa7k.R.inc(46540);throw new NotStrictlyPositiveException(maxEvaluations);
        }

        }__CLR4_4_1zwizwilb90pa7k.R.inc(46541);this.growLimit = growLimit;
        __CLR4_4_1zwizwilb90pa7k.R.inc(46542);evaluations.setMaximalCount(maxEvaluations);
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

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
    public void search(UnivariateFunction func, GoalType goal, double xA, double xB) {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46543);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46544);evaluations.resetCount();
        __CLR4_4_1zwizwilb90pa7k.R.inc(46545);final boolean isMinim = goal == GoalType.MINIMIZE;

        __CLR4_4_1zwizwilb90pa7k.R.inc(46546);double fA = eval(func, xA);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46547);double fB = eval(func, xB);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46548);if (((((((isMinim )&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46549)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46550)==0&false))?
            fA < fB :
            fA > fB)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46551)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46552)==0&false))) {{

            __CLR4_4_1zwizwilb90pa7k.R.inc(46553);double tmp = xA;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46554);xA = xB;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46555);xB = tmp;

            __CLR4_4_1zwizwilb90pa7k.R.inc(46556);tmp = fA;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46557);fA = fB;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46558);fB = tmp;
        }

        }__CLR4_4_1zwizwilb90pa7k.R.inc(46559);double xC = xB + GOLD * (xB - xA);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46560);double fC = eval(func, xC);

        __CLR4_4_1zwizwilb90pa7k.R.inc(46561);while (((((((isMinim )&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46562)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46563)==0&false))? fC < fB : fC > fB)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46564)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46565)==0&false))) {{
            __CLR4_4_1zwizwilb90pa7k.R.inc(46566);double tmp1 = (xB - xA) * (fB - fC);
            __CLR4_4_1zwizwilb90pa7k.R.inc(46567);double tmp2 = (xB - xC) * (fB - fA);

            __CLR4_4_1zwizwilb90pa7k.R.inc(46568);double val = tmp2 - tmp1;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46569);double denom = (((Math.abs(val) < EPS_MIN )&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46570)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46571)==0&false))? 2 * EPS_MIN : 2 * val;

            __CLR4_4_1zwizwilb90pa7k.R.inc(46572);double w = xB - ((xB - xC) * tmp2 - (xB - xA) * tmp1) / denom;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46573);double wLim = xB + growLimit * (xC - xB);

            __CLR4_4_1zwizwilb90pa7k.R.inc(46574);double fW;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46575);if (((((w - xC) * (xB - w) > 0)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46576)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46577)==0&false))) {{
                __CLR4_4_1zwizwilb90pa7k.R.inc(46578);fW = eval(func, w);
                __CLR4_4_1zwizwilb90pa7k.R.inc(46579);if (((((((isMinim )&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46580)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46581)==0&false))?
                    fW < fC :
                    fW > fC)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46582)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46583)==0&false))) {{
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46584);xA = xB;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46585);xB = w;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46586);fA = fB;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46587);fB = fW;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46588);break;
                } }else {__CLR4_4_1zwizwilb90pa7k.R.inc(46589);if (((((((isMinim )&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46590)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46591)==0&false))?
                           fW > fB :
                           fW < fB)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46592)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46593)==0&false))) {{
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46594);xC = w;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46595);fC = fW;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46596);break;
                }
                }}__CLR4_4_1zwizwilb90pa7k.R.inc(46597);w = xC + GOLD * (xC - xB);
                __CLR4_4_1zwizwilb90pa7k.R.inc(46598);fW = eval(func, w);
            } }else {__CLR4_4_1zwizwilb90pa7k.R.inc(46599);if (((((w - wLim) * (wLim - xC) >= 0)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46600)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46601)==0&false))) {{
                __CLR4_4_1zwizwilb90pa7k.R.inc(46602);w = wLim;
                __CLR4_4_1zwizwilb90pa7k.R.inc(46603);fW = eval(func, w);
            } }else {__CLR4_4_1zwizwilb90pa7k.R.inc(46604);if (((((w - wLim) * (xC - w) > 0)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46605)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46606)==0&false))) {{
                __CLR4_4_1zwizwilb90pa7k.R.inc(46607);fW = eval(func, w);
                __CLR4_4_1zwizwilb90pa7k.R.inc(46608);if (((((((isMinim )&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46609)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46610)==0&false))?
                    fW < fC :
                    fW > fC)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46611)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46612)==0&false))) {{
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46613);xB = xC;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46614);xC = w;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46615);w = xC + GOLD * (xC - xB);
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46616);fB = fC;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46617);fC =fW;
                    __CLR4_4_1zwizwilb90pa7k.R.inc(46618);fW = eval(func, w);
                }
            }} }else {{
                __CLR4_4_1zwizwilb90pa7k.R.inc(46619);w = xC + GOLD * (xC - xB);
                __CLR4_4_1zwizwilb90pa7k.R.inc(46620);fW = eval(func, w);
            }

            }}}__CLR4_4_1zwizwilb90pa7k.R.inc(46621);xA = xB;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46622);fA = fB;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46623);xB = xC;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46624);fB = fC;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46625);xC = w;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46626);fC = fW;
        }

        }__CLR4_4_1zwizwilb90pa7k.R.inc(46627);lo = xA;
        __CLR4_4_1zwizwilb90pa7k.R.inc(46628);fLo = fA;
        __CLR4_4_1zwizwilb90pa7k.R.inc(46629);mid = xB;
        __CLR4_4_1zwizwilb90pa7k.R.inc(46630);fMid = fB;
        __CLR4_4_1zwizwilb90pa7k.R.inc(46631);hi = xC;
        __CLR4_4_1zwizwilb90pa7k.R.inc(46632);fHi = fC;

        __CLR4_4_1zwizwilb90pa7k.R.inc(46633);if ((((lo > hi)&&(__CLR4_4_1zwizwilb90pa7k.R.iget(46634)!=0|true))||(__CLR4_4_1zwizwilb90pa7k.R.iget(46635)==0&false))) {{
            __CLR4_4_1zwizwilb90pa7k.R.inc(46636);double tmp = lo;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46637);lo = hi;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46638);hi = tmp;

            __CLR4_4_1zwizwilb90pa7k.R.inc(46639);tmp = fLo;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46640);fLo = fHi;
            __CLR4_4_1zwizwilb90pa7k.R.inc(46641);fHi = tmp;
        }
    }}finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * @return the number of evalutations.
     */
    public int getMaxEvaluations() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46642);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46643);return evaluations.getMaximalCount();
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * @return the number of evalutations.
     */
    public int getEvaluations() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46644);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46645);return evaluations.getCount();
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * @return the lower bound of the bracket.
     * @see #getFLo()
     */
    public double getLo() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46646);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46647);return lo;
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * Get function value at {@link #getLo()}.
     * @return function value at {@link #getLo()}
     */
    public double getFLo() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46648);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46649);return fLo;
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * @return the higher bound of the bracket.
     * @see #getFHi()
     */
    public double getHi() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46650);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46651);return hi;
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * Get function value at {@link #getHi()}.
     * @return function value at {@link #getHi()}
     */
    public double getFHi() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46652);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46653);return fHi;
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * @return a point in the middle of the bracket.
     * @see #getFMid()
     */
    public double getMid() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46654);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46655);return mid;
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * Get function value at {@link #getMid()}.
     * @return function value at {@link #getMid()}
     */
    public double getFMid() {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46656);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46657);return fMid;
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}

    /**
     * @param f Function.
     * @param x Argument.
     * @return {@code f(x)}
     * @throws TooManyEvaluationsException if the maximal number of evaluations is
     * exceeded.
     */
    private double eval(UnivariateFunction f, double x) {try{__CLR4_4_1zwizwilb90pa7k.R.inc(46658);
        __CLR4_4_1zwizwilb90pa7k.R.inc(46659);try {
            __CLR4_4_1zwizwilb90pa7k.R.inc(46660);evaluations.incrementCount();
        } catch (MaxCountExceededException e) {
            __CLR4_4_1zwizwilb90pa7k.R.inc(46661);throw new TooManyEvaluationsException(e.getMax());
        }
        __CLR4_4_1zwizwilb90pa7k.R.inc(46662);return f.value(x);
    }finally{__CLR4_4_1zwizwilb90pa7k.R.flushNeeded();}}
}
