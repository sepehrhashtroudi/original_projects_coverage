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
package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Provides a generic means to evaluate continued fractions.  Subclasses simply
 * provided the a and b coefficients to evaluate the continued fraction.
 *
 * <p>
 * References:
 * <ul>
 * <li><a href="http://mathworld.wolfram.com/ContinuedFraction.html">
 * Continued Fraction</a></li>
 * </ul>
 * </p>
 *
 * @version $Id$
 */
public abstract class ContinuedFraction {public static class __CLR4_4_117mf17mflb90pave{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,56593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Maximum allowed numerical error. */
    private static final double DEFAULT_EPSILON = 10e-9;

    /**
     * Default constructor.
     */
    protected ContinuedFraction() {
        super();__CLR4_4_117mf17mflb90pave.R.inc(56536);try{__CLR4_4_117mf17mflb90pave.R.inc(56535);
    }finally{__CLR4_4_117mf17mflb90pave.R.flushNeeded();}}

    /**
     * Access the n-th a coefficient of the continued fraction.  Since a can be
     * a function of the evaluation point, x, that is passed in as well.
     * @param n the coefficient index to retrieve.
     * @param x the evaluation point.
     * @return the n-th a coefficient.
     */
    protected abstract double getA(int n, double x);

    /**
     * Access the n-th b coefficient of the continued fraction.  Since b can be
     * a function of the evaluation point, x, that is passed in as well.
     * @param n the coefficient index to retrieve.
     * @param x the evaluation point.
     * @return the n-th b coefficient.
     */
    protected abstract double getB(int n, double x);

    /**
     * Evaluates the continued fraction at the value x.
     * @param x the evaluation point.
     * @return the value of the continued fraction evaluated at x.
     * @throws ConvergenceException if the algorithm fails to converge.
     */
    public double evaluate(double x) throws ConvergenceException {try{__CLR4_4_117mf17mflb90pave.R.inc(56537);
        __CLR4_4_117mf17mflb90pave.R.inc(56538);return evaluate(x, DEFAULT_EPSILON, Integer.MAX_VALUE);
    }finally{__CLR4_4_117mf17mflb90pave.R.flushNeeded();}}

    /**
     * Evaluates the continued fraction at the value x.
     * @param x the evaluation point.
     * @param epsilon maximum error allowed.
     * @return the value of the continued fraction evaluated at x.
     * @throws ConvergenceException if the algorithm fails to converge.
     */
    public double evaluate(double x, double epsilon) throws ConvergenceException {try{__CLR4_4_117mf17mflb90pave.R.inc(56539);
        __CLR4_4_117mf17mflb90pave.R.inc(56540);return evaluate(x, epsilon, Integer.MAX_VALUE);
    }finally{__CLR4_4_117mf17mflb90pave.R.flushNeeded();}}

    /**
     * Evaluates the continued fraction at the value x.
     * @param x the evaluation point.
     * @param maxIterations maximum number of convergents
     * @return the value of the continued fraction evaluated at x.
     * @throws ConvergenceException if the algorithm fails to converge.
     * @throws MaxCountExceededException if maximal number of iterations is reached
     */
    public double evaluate(double x, int maxIterations)
        throws ConvergenceException, MaxCountExceededException {try{__CLR4_4_117mf17mflb90pave.R.inc(56541);
        __CLR4_4_117mf17mflb90pave.R.inc(56542);return evaluate(x, DEFAULT_EPSILON, maxIterations);
    }finally{__CLR4_4_117mf17mflb90pave.R.flushNeeded();}}

    /**
     * Evaluates the continued fraction at the value x.
     * <p>
     * The implementation of this method is based on the modified Lentz algorithm as described
     * on page 18 ff. in:
     * <ul>
     *   <li>
     *   I. J. Thompson,  A. R. Barnett. "Coulomb and Bessel Functions of Complex Arguments and Order."
     *   <a target="_blank" href="http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf">
     *   http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf</a>
     *   </li>
     * </ul>
     * <b>Note:</b> the implementation uses the terms a<sub>i</sub> and b<sub>i</sub> as defined in
     * <a href="http://mathworld.wolfram.com/ContinuedFraction.html">Continued Fraction @ MathWorld</a>.
     * </p>
     *
     * @param x the evaluation point.
     * @param epsilon maximum error allowed.
     * @param maxIterations maximum number of convergents
     * @return the value of the continued fraction evaluated at x.
     * @throws ConvergenceException if the algorithm fails to converge.
     * @throws MaxCountExceededException if maximal number of iterations is reached
     */
    public double evaluate(double x, double epsilon, int maxIterations)
        throws ConvergenceException, MaxCountExceededException {try{__CLR4_4_117mf17mflb90pave.R.inc(56543);
        __CLR4_4_117mf17mflb90pave.R.inc(56544);final double small = 1e-50;
        __CLR4_4_117mf17mflb90pave.R.inc(56545);double hPrev = getA(0, x);

        // use the value of small as epsilon criteria for zero checks
        __CLR4_4_117mf17mflb90pave.R.inc(56546);if ((((Precision.equals(hPrev, 0.0, small))&&(__CLR4_4_117mf17mflb90pave.R.iget(56547)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56548)==0&false))) {{
            __CLR4_4_117mf17mflb90pave.R.inc(56549);hPrev = small;
        }

        }__CLR4_4_117mf17mflb90pave.R.inc(56550);int n = 1;
        __CLR4_4_117mf17mflb90pave.R.inc(56551);double dPrev = 0.0;
        __CLR4_4_117mf17mflb90pave.R.inc(56552);double cPrev = hPrev;
        __CLR4_4_117mf17mflb90pave.R.inc(56553);double hN = hPrev;

        __CLR4_4_117mf17mflb90pave.R.inc(56554);while ((((n < maxIterations)&&(__CLR4_4_117mf17mflb90pave.R.iget(56555)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56556)==0&false))) {{
            __CLR4_4_117mf17mflb90pave.R.inc(56557);final double a = getA(n, x);
            __CLR4_4_117mf17mflb90pave.R.inc(56558);final double b = getB(n, x);

            __CLR4_4_117mf17mflb90pave.R.inc(56559);double dN = a + b * dPrev;
            __CLR4_4_117mf17mflb90pave.R.inc(56560);if ((((Precision.equals(dN, 0.0, small))&&(__CLR4_4_117mf17mflb90pave.R.iget(56561)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56562)==0&false))) {{
                __CLR4_4_117mf17mflb90pave.R.inc(56563);dN = small;
            }
            }__CLR4_4_117mf17mflb90pave.R.inc(56564);double cN = a + b / cPrev;
            __CLR4_4_117mf17mflb90pave.R.inc(56565);if ((((Precision.equals(cN, 0.0, small))&&(__CLR4_4_117mf17mflb90pave.R.iget(56566)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56567)==0&false))) {{
                __CLR4_4_117mf17mflb90pave.R.inc(56568);cN = small;
            }

            }__CLR4_4_117mf17mflb90pave.R.inc(56569);dN = 1 / dN;
            __CLR4_4_117mf17mflb90pave.R.inc(56570);final double deltaN = cN * dN;
            __CLR4_4_117mf17mflb90pave.R.inc(56571);hN = hPrev * deltaN;

            __CLR4_4_117mf17mflb90pave.R.inc(56572);if ((((Double.isInfinite(hN))&&(__CLR4_4_117mf17mflb90pave.R.iget(56573)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56574)==0&false))) {{
                __CLR4_4_117mf17mflb90pave.R.inc(56575);throw new ConvergenceException(LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE,
                                               x);
            }
            }__CLR4_4_117mf17mflb90pave.R.inc(56576);if ((((Double.isNaN(hN))&&(__CLR4_4_117mf17mflb90pave.R.iget(56577)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56578)==0&false))) {{
                __CLR4_4_117mf17mflb90pave.R.inc(56579);throw new ConvergenceException(LocalizedFormats.CONTINUED_FRACTION_NAN_DIVERGENCE,
                                               x);
            }

            }__CLR4_4_117mf17mflb90pave.R.inc(56580);if ((((FastMath.abs(deltaN - 1.0) < epsilon)&&(__CLR4_4_117mf17mflb90pave.R.iget(56581)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56582)==0&false))) {{
                __CLR4_4_117mf17mflb90pave.R.inc(56583);break;
            }

            }__CLR4_4_117mf17mflb90pave.R.inc(56584);dPrev = dN;
            __CLR4_4_117mf17mflb90pave.R.inc(56585);cPrev = cN;
            __CLR4_4_117mf17mflb90pave.R.inc(56586);hPrev = hN;
            __CLR4_4_117mf17mflb90pave.R.inc(56587);n++;
        }

        }__CLR4_4_117mf17mflb90pave.R.inc(56588);if ((((n >= maxIterations)&&(__CLR4_4_117mf17mflb90pave.R.iget(56589)!=0|true))||(__CLR4_4_117mf17mflb90pave.R.iget(56590)==0&false))) {{
            __CLR4_4_117mf17mflb90pave.R.inc(56591);throw new MaxCountExceededException(LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION,
                                                maxIterations, x);
        }

        }__CLR4_4_117mf17mflb90pave.R.inc(56592);return hN;
    }finally{__CLR4_4_117mf17mflb90pave.R.flushNeeded();}}

}
