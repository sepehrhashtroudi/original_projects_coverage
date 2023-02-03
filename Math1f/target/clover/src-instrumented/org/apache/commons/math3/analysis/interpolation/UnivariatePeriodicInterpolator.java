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
package org.apache.commons.math3.analysis.interpolation;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.MathUtils;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;

/**
 * Adapter for classes implementing the {@link UnivariateInterpolator}
 * interface.
 * The data to be interpolated is assumed to be periodic. Thus values that are
 * outside of the range can be passed to the interpolation function: They will
 * be wrapped into the initial range before being passed to the class that
 * actually computes the interpolation.
 *
 * @version $Id$
 */
public class UnivariatePeriodicInterpolator
    implements UnivariateInterpolator {public static class __CLR4_4_13f23f2lb90p6yx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,4466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Default number of extension points of the samples array. */
    public static final int DEFAULT_EXTEND = 5;
    /** Interpolator. */
    private final UnivariateInterpolator interpolator;
    /** Period. */
    private final double period;
    /** Number of extension points. */
    private final int extend;

    /**
     * Builds an interpolator.
     *
     * @param interpolator Interpolator.
     * @param period Period.
     * @param extend Number of points to be appended at the beginning and
     * end of the sample arrays in order to avoid interpolation failure at
     * the (periodic) boundaries of the orginal interval. The value is the
     * number of sample points which the original {@code interpolator} needs
     * on each side of the interpolated point.
     */
    public UnivariatePeriodicInterpolator(UnivariateInterpolator interpolator,
                                          double period,
                                          int extend) {try{__CLR4_4_13f23f2lb90p6yx.R.inc(4430);
        __CLR4_4_13f23f2lb90p6yx.R.inc(4431);this.interpolator = interpolator;
        __CLR4_4_13f23f2lb90p6yx.R.inc(4432);this.period = period;
        __CLR4_4_13f23f2lb90p6yx.R.inc(4433);this.extend = extend;
    }finally{__CLR4_4_13f23f2lb90p6yx.R.flushNeeded();}}

    /**
     * Builds an interpolator.
     * Uses {@link #DEFAULT_EXTEND} as the number of extension points on each side
     * of the original abscissae range.
     *
     * @param interpolator Interpolator.
     * @param period Period.
     */
    public UnivariatePeriodicInterpolator(UnivariateInterpolator interpolator,
                                          double period) {
        this(interpolator, period, DEFAULT_EXTEND);__CLR4_4_13f23f2lb90p6yx.R.inc(4435);try{__CLR4_4_13f23f2lb90p6yx.R.inc(4434);
    }finally{__CLR4_4_13f23f2lb90p6yx.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws NumberIsTooSmallException if the number of extension points
     * is larger than the size of {@code xval}.
     */
    public UnivariateFunction interpolate(double[] xval,
                                          double[] yval)
        throws NumberIsTooSmallException, NonMonotonicSequenceException {try{__CLR4_4_13f23f2lb90p6yx.R.inc(4436);
        __CLR4_4_13f23f2lb90p6yx.R.inc(4437);if ((((xval.length < extend)&&(__CLR4_4_13f23f2lb90p6yx.R.iget(4438)!=0|true))||(__CLR4_4_13f23f2lb90p6yx.R.iget(4439)==0&false))) {{
            __CLR4_4_13f23f2lb90p6yx.R.inc(4440);throw new NumberIsTooSmallException(xval.length, extend, true);
        }

        }__CLR4_4_13f23f2lb90p6yx.R.inc(4441);MathArrays.checkOrder(xval);
        __CLR4_4_13f23f2lb90p6yx.R.inc(4442);final double offset = xval[0];

        __CLR4_4_13f23f2lb90p6yx.R.inc(4443);final int len = xval.length + extend * 2;
        __CLR4_4_13f23f2lb90p6yx.R.inc(4444);final double[] x = new double[len];
        __CLR4_4_13f23f2lb90p6yx.R.inc(4445);final double[] y = new double[len];
        __CLR4_4_13f23f2lb90p6yx.R.inc(4446);for (int i = 0; (((i < xval.length)&&(__CLR4_4_13f23f2lb90p6yx.R.iget(4447)!=0|true))||(__CLR4_4_13f23f2lb90p6yx.R.iget(4448)==0&false)); i++) {{
            __CLR4_4_13f23f2lb90p6yx.R.inc(4449);final int index = i + extend;
            __CLR4_4_13f23f2lb90p6yx.R.inc(4450);x[index] = MathUtils.reduce(xval[i], period, offset);
            __CLR4_4_13f23f2lb90p6yx.R.inc(4451);y[index] = yval[i];
        }

        // Wrap to enable interpolation at the boundaries.
        }__CLR4_4_13f23f2lb90p6yx.R.inc(4452);for (int i = 0; (((i < extend)&&(__CLR4_4_13f23f2lb90p6yx.R.iget(4453)!=0|true))||(__CLR4_4_13f23f2lb90p6yx.R.iget(4454)==0&false)); i++) {{
            __CLR4_4_13f23f2lb90p6yx.R.inc(4455);int index = xval.length - extend + i;
            __CLR4_4_13f23f2lb90p6yx.R.inc(4456);x[i] = MathUtils.reduce(xval[index], period, offset) - period;
            __CLR4_4_13f23f2lb90p6yx.R.inc(4457);y[i] = yval[index];

            __CLR4_4_13f23f2lb90p6yx.R.inc(4458);index = len - extend + i;
            __CLR4_4_13f23f2lb90p6yx.R.inc(4459);x[index] = MathUtils.reduce(xval[i], period, offset) + period;
            __CLR4_4_13f23f2lb90p6yx.R.inc(4460);y[index] = yval[i];
        }

        }__CLR4_4_13f23f2lb90p6yx.R.inc(4461);MathArrays.sortInPlace(x, y);

        __CLR4_4_13f23f2lb90p6yx.R.inc(4462);final UnivariateFunction f = interpolator.interpolate(x, y);
        __CLR4_4_13f23f2lb90p6yx.R.inc(4463);return new UnivariateFunction() {
            public double value(final double x) throws MathIllegalArgumentException {try{__CLR4_4_13f23f2lb90p6yx.R.inc(4464);
                __CLR4_4_13f23f2lb90p6yx.R.inc(4465);return f.value(MathUtils.reduce(x, period, offset));
            }finally{__CLR4_4_13f23f2lb90p6yx.R.flushNeeded();}}
        };
    }finally{__CLR4_4_13f23f2lb90p6yx.R.flushNeeded();}}
}
