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
package org.apache.commons.math3.stat.regression;

import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealVector;

/**
 * The GLS implementation of the multiple linear regression.
 *
 * GLS assumes a general covariance matrix Omega of the error
 * <pre>
 * u ~ N(0, Omega)
 * </pre>
 *
 * Estimated by GLS,
 * <pre>
 * b=(X' Omega^-1 X)^-1X'Omega^-1 y
 * </pre>
 * whose variance is
 * <pre>
 * Var(b)=(X' Omega^-1 X)^-1
 * </pre>
 * @version $Id$
 * @since 2.0
 */
public class GLSMultipleLinearRegression extends AbstractMultipleLinearRegression {public static class __CLR4_4_115im15imlb90pari{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,53835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Covariance matrix. */
    private RealMatrix Omega;

    /** Inverse of covariance matrix. */
    private RealMatrix OmegaInverse;

    /** Replace sample data, overriding any previous sample.
     * @param y y values of the sample
     * @param x x values of the sample
     * @param covariance array representing the covariance matrix
     */
    public void newSampleData(double[] y, double[][] x, double[][] covariance) {try{__CLR4_4_115im15imlb90pari.R.inc(53806);
        __CLR4_4_115im15imlb90pari.R.inc(53807);validateSampleData(x, y);
        __CLR4_4_115im15imlb90pari.R.inc(53808);newYSampleData(y);
        __CLR4_4_115im15imlb90pari.R.inc(53809);newXSampleData(x);
        __CLR4_4_115im15imlb90pari.R.inc(53810);validateCovarianceData(x, covariance);
        __CLR4_4_115im15imlb90pari.R.inc(53811);newCovarianceData(covariance);
    }finally{__CLR4_4_115im15imlb90pari.R.flushNeeded();}}

    /**
     * Add the covariance data.
     *
     * @param omega the [n,n] array representing the covariance
     */
    protected void newCovarianceData(double[][] omega){try{__CLR4_4_115im15imlb90pari.R.inc(53812);
        __CLR4_4_115im15imlb90pari.R.inc(53813);this.Omega = new Array2DRowRealMatrix(omega);
        __CLR4_4_115im15imlb90pari.R.inc(53814);this.OmegaInverse = null;
    }finally{__CLR4_4_115im15imlb90pari.R.flushNeeded();}}

    /**
     * Get the inverse of the covariance.
     * <p>The inverse of the covariance matrix is lazily evaluated and cached.</p>
     * @return inverse of the covariance
     */
    protected RealMatrix getOmegaInverse() {try{__CLR4_4_115im15imlb90pari.R.inc(53815);
        __CLR4_4_115im15imlb90pari.R.inc(53816);if ((((OmegaInverse == null)&&(__CLR4_4_115im15imlb90pari.R.iget(53817)!=0|true))||(__CLR4_4_115im15imlb90pari.R.iget(53818)==0&false))) {{
            __CLR4_4_115im15imlb90pari.R.inc(53819);OmegaInverse = new LUDecomposition(Omega).getSolver().getInverse();
        }
        }__CLR4_4_115im15imlb90pari.R.inc(53820);return OmegaInverse;
    }finally{__CLR4_4_115im15imlb90pari.R.flushNeeded();}}

    /**
     * Calculates beta by GLS.
     * <pre>
     *  b=(X' Omega^-1 X)^-1X'Omega^-1 y
     * </pre>
     * @return beta
     */
    @Override
    protected RealVector calculateBeta() {try{__CLR4_4_115im15imlb90pari.R.inc(53821);
        __CLR4_4_115im15imlb90pari.R.inc(53822);RealMatrix OI = getOmegaInverse();
        __CLR4_4_115im15imlb90pari.R.inc(53823);RealMatrix XT = getX().transpose();
        __CLR4_4_115im15imlb90pari.R.inc(53824);RealMatrix XTOIX = XT.multiply(OI).multiply(getX());
        __CLR4_4_115im15imlb90pari.R.inc(53825);RealMatrix inverse = new LUDecomposition(XTOIX).getSolver().getInverse();
        __CLR4_4_115im15imlb90pari.R.inc(53826);return inverse.multiply(XT).multiply(OI).operate(getY());
    }finally{__CLR4_4_115im15imlb90pari.R.flushNeeded();}}

    /**
     * Calculates the variance on the beta.
     * <pre>
     *  Var(b)=(X' Omega^-1 X)^-1
     * </pre>
     * @return The beta variance matrix
     */
    @Override
    protected RealMatrix calculateBetaVariance() {try{__CLR4_4_115im15imlb90pari.R.inc(53827);
        __CLR4_4_115im15imlb90pari.R.inc(53828);RealMatrix OI = getOmegaInverse();
        __CLR4_4_115im15imlb90pari.R.inc(53829);RealMatrix XTOIX = getX().transpose().multiply(OI).multiply(getX());
        __CLR4_4_115im15imlb90pari.R.inc(53830);return new LUDecomposition(XTOIX).getSolver().getInverse();
    }finally{__CLR4_4_115im15imlb90pari.R.flushNeeded();}}


    /**
     * Calculates the estimated variance of the error term using the formula
     * <pre>
     *  Var(u) = Tr(u' Omega^-1 u)/(n-k)
     * </pre>
     * where n and k are the row and column dimensions of the design
     * matrix X.
     *
     * @return error variance
     * @since 2.2
     */
    @Override
    protected double calculateErrorVariance() {try{__CLR4_4_115im15imlb90pari.R.inc(53831);
        __CLR4_4_115im15imlb90pari.R.inc(53832);RealVector residuals = calculateResiduals();
        __CLR4_4_115im15imlb90pari.R.inc(53833);double t = residuals.dotProduct(getOmegaInverse().operate(residuals));
        __CLR4_4_115im15imlb90pari.R.inc(53834);return t / (getX().getRowDimension() - getX().getColumnDimension());

    }finally{__CLR4_4_115im15imlb90pari.R.flushNeeded();}}

}
