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
package org.apache.commons.math3.stat.correlation;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

/**
 * Bivariate Covariance implementation that does not require input data to be
 * stored in memory.
 *
 * <p>This class is based on a paper written by Philippe P&eacute;bay:
 * <a href="http://prod.sandia.gov/techlib/access-control.cgi/2008/086212.pdf">
 * Formulas for Robust, One-Pass Parallel Computation of Covariances and
 * Arbitrary-Order Statistical Moments</a>, 2008, Technical Report SAND2008-6212,
 * Sandia National Laboratories. It computes the covariance for a pair of variables.
 * Use {@link StorelessCovariance} to estimate an entire covariance matrix.</p>
 *
 * <p>Note: This class is package private as it is only used internally in
 * the {@link StorelessCovariance} class.</p>
 *
 * @version $Id$
 * @since 3.0
 */
class StorelessBivariateCovariance {public static class __CLR4_4_112w212w2lb90pal9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** the mean of variable x */
    private double meanX;

    /** the mean of variable y */
    private double meanY;

    /** number of observations */
    private double n;

    /** the running covariance estimate */
    private double covarianceNumerator;

    /** flag for bias correction */
    private boolean biasCorrected;

    /**
     * Create an empty {@link StorelessBivariateCovariance} instance with
     * bias correction.
     */
    public StorelessBivariateCovariance() {
        this(true);__CLR4_4_112w212w2lb90pal9.R.inc(50403);try{__CLR4_4_112w212w2lb90pal9.R.inc(50402);
    }finally{__CLR4_4_112w212w2lb90pal9.R.flushNeeded();}}

    /**
     * Create an empty {@link StorelessBivariateCovariance} instance.
     *
     * @param biasCorrection if <code>true</code> the covariance estimate is corrected
     * for bias, i.e. n-1 in the denominator, otherwise there is no bias correction,
     * i.e. n in the denominator.
     */
    public StorelessBivariateCovariance(final boolean biasCorrection) {try{__CLR4_4_112w212w2lb90pal9.R.inc(50404);
        __CLR4_4_112w212w2lb90pal9.R.inc(50405);meanX = meanY = 0.0;
        __CLR4_4_112w212w2lb90pal9.R.inc(50406);n = 0;
        __CLR4_4_112w212w2lb90pal9.R.inc(50407);covarianceNumerator = 0.0;
        __CLR4_4_112w212w2lb90pal9.R.inc(50408);biasCorrected = biasCorrection;
    }finally{__CLR4_4_112w212w2lb90pal9.R.flushNeeded();}}

    /**
     * Update the covariance estimation with a pair of variables (x, y).
     *
     * @param x the x value
     * @param y the y value
     */
    public void increment(final double x, final double y) {try{__CLR4_4_112w212w2lb90pal9.R.inc(50409);
        __CLR4_4_112w212w2lb90pal9.R.inc(50410);n++;
        __CLR4_4_112w212w2lb90pal9.R.inc(50411);final double deltaX = x - meanX;
        __CLR4_4_112w212w2lb90pal9.R.inc(50412);final double deltaY = y - meanY;
        __CLR4_4_112w212w2lb90pal9.R.inc(50413);meanX += deltaX / n;
        __CLR4_4_112w212w2lb90pal9.R.inc(50414);meanY += deltaY / n;
        __CLR4_4_112w212w2lb90pal9.R.inc(50415);covarianceNumerator += ((n - 1.0) / n) * deltaX * deltaY;
    }finally{__CLR4_4_112w212w2lb90pal9.R.flushNeeded();}}

    /**
     * Appends another bivariate covariance calculation to this.
     * After this operation, statistics returned should be close to what would
     * have been obtained by by performing all of the {@link #increment(double, double)}
     * operations in {@code cov} directly on this.
     *
     * @param cov StorelessBivariateCovariance instance to append.
     */
    public void append(StorelessBivariateCovariance cov) {try{__CLR4_4_112w212w2lb90pal9.R.inc(50416);
        __CLR4_4_112w212w2lb90pal9.R.inc(50417);double oldN = n;
        __CLR4_4_112w212w2lb90pal9.R.inc(50418);n += cov.n;
        __CLR4_4_112w212w2lb90pal9.R.inc(50419);final double deltaX = cov.meanX - meanX;
        __CLR4_4_112w212w2lb90pal9.R.inc(50420);final double deltaY = cov.meanY - meanY;
        __CLR4_4_112w212w2lb90pal9.R.inc(50421);meanX += deltaX * cov.n / n;
        __CLR4_4_112w212w2lb90pal9.R.inc(50422);meanY += deltaY * cov.n / n;
        __CLR4_4_112w212w2lb90pal9.R.inc(50423);covarianceNumerator += cov.covarianceNumerator + oldN * cov.n / n * deltaX * deltaY;
    }finally{__CLR4_4_112w212w2lb90pal9.R.flushNeeded();}}

    /**
     * Returns the number of observations.
     *
     * @return number of observations
     */
    public double getN() {try{__CLR4_4_112w212w2lb90pal9.R.inc(50424);
        __CLR4_4_112w212w2lb90pal9.R.inc(50425);return n;
    }finally{__CLR4_4_112w212w2lb90pal9.R.flushNeeded();}}

    /**
     * Return the current covariance estimate.
     *
     * @return the current covariance
     * @throws NumberIsTooSmallException if the number of observations
     * is &lt; 2
     */
    public double getResult() throws NumberIsTooSmallException {try{__CLR4_4_112w212w2lb90pal9.R.inc(50426);
        __CLR4_4_112w212w2lb90pal9.R.inc(50427);if ((((n < 2)&&(__CLR4_4_112w212w2lb90pal9.R.iget(50428)!=0|true))||(__CLR4_4_112w212w2lb90pal9.R.iget(50429)==0&false))) {{
            __CLR4_4_112w212w2lb90pal9.R.inc(50430);throw new NumberIsTooSmallException(LocalizedFormats.INSUFFICIENT_DIMENSION,
                                                n, 2, true);
        }
        }__CLR4_4_112w212w2lb90pal9.R.inc(50431);if ((((biasCorrected)&&(__CLR4_4_112w212w2lb90pal9.R.iget(50432)!=0|true))||(__CLR4_4_112w212w2lb90pal9.R.iget(50433)==0&false))) {{
            __CLR4_4_112w212w2lb90pal9.R.inc(50434);return covarianceNumerator / (n - 1d);
        } }else {{
            __CLR4_4_112w212w2lb90pal9.R.inc(50435);return covarianceNumerator / n;
        }
    }}finally{__CLR4_4_112w212w2lb90pal9.R.flushNeeded();}}
}

