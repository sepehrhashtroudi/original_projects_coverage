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

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;

/**
 * <p>Implements ordinary least squares (OLS) to estimate the parameters of a
 * multiple linear regression model.</p>
 *
 * <p>The regression coefficients, <code>b</code>, satisfy the normal equations:
 * <pre><code> X<sup>T</sup> X b = X<sup>T</sup> y </code></pre></p>
 *
 * <p>To solve the normal equations, this implementation uses QR decomposition
 * of the <code>X</code> matrix. (See {@link QRDecomposition} for details on the
 * decomposition algorithm.) The <code>X</code> matrix, also known as the <i>design matrix,</i>
 * has rows corresponding to sample observations and columns corresponding to independent
 * variables.  When the model is estimated using an intercept term (i.e. when
 * {@link #isNoIntercept() isNoIntercept} is false as it is by default), the <code>X</code>
 * matrix includes an initial column identically equal to 1.  We solve the normal equations
 * as follows:
 * <pre><code> X<sup>T</sup>X b = X<sup>T</sup> y
 * (QR)<sup>T</sup> (QR) b = (QR)<sup>T</sup>y
 * R<sup>T</sup> (Q<sup>T</sup>Q) R b = R<sup>T</sup> Q<sup>T</sup> y
 * R<sup>T</sup> R b = R<sup>T</sup> Q<sup>T</sup> y
 * (R<sup>T</sup>)<sup>-1</sup> R<sup>T</sup> R b = (R<sup>T</sup>)<sup>-1</sup> R<sup>T</sup> Q<sup>T</sup> y
 * R b = Q<sup>T</sup> y </code></pre></p>
 *
 * <p>Given <code>Q</code> and <code>R</code>, the last equation is solved by back-substitution.</p>
 *
 * @version $Id$
 * @since 2.0
 */
public class OLSMultipleLinearRegression extends AbstractMultipleLinearRegression {public static class __CLR4_4_1165q165qlb90pas8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,54691,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Cached QR decomposition of X matrix */
    private QRDecomposition qr = null;

    /**
     * Loads model x and y sample data, overriding any previous sample.
     *
     * Computes and caches QR decomposition of the X matrix.
     * @param y the [n,1] array representing the y sample
     * @param x the [n,k] array representing the x sample
     * @throws MathIllegalArgumentException if the x and y array data are not
     *             compatible for the regression
     */
    public void newSampleData(double[] y, double[][] x) throws MathIllegalArgumentException {try{__CLR4_4_1165q165qlb90pas8.R.inc(54638);
        __CLR4_4_1165q165qlb90pas8.R.inc(54639);validateSampleData(x, y);
        __CLR4_4_1165q165qlb90pas8.R.inc(54640);newYSampleData(y);
        __CLR4_4_1165q165qlb90pas8.R.inc(54641);newXSampleData(x);
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>This implementation computes and caches the QR decomposition of the X matrix.</p>
     */
    @Override
    public void newSampleData(double[] data, int nobs, int nvars) {try{__CLR4_4_1165q165qlb90pas8.R.inc(54642);
        __CLR4_4_1165q165qlb90pas8.R.inc(54643);super.newSampleData(data, nobs, nvars);
        __CLR4_4_1165q165qlb90pas8.R.inc(54644);qr = new QRDecomposition(getX());
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * <p>Compute the "hat" matrix.
     * </p>
     * <p>The hat matrix is defined in terms of the design matrix X
     *  by X(X<sup>T</sup>X)<sup>-1</sup>X<sup>T</sup>
     * </p>
     * <p>The implementation here uses the QR decomposition to compute the
     * hat matrix as Q I<sub>p</sub>Q<sup>T</sup> where I<sub>p</sub> is the
     * p-dimensional identity matrix augmented by 0's.  This computational
     * formula is from "The Hat Matrix in Regression and ANOVA",
     * David C. Hoaglin and Roy E. Welsch,
     * <i>The American Statistician</i>, Vol. 32, No. 1 (Feb., 1978), pp. 17-22.
     * </p>
     * <p>Data for the model must have been successfully loaded using one of
     * the {@code newSampleData} methods before invoking this method; otherwise
     * a {@code NullPointerException} will be thrown.</p>
     *
     * @return the hat matrix
     */
    public RealMatrix calculateHat() {try{__CLR4_4_1165q165qlb90pas8.R.inc(54645);
        // Create augmented identity matrix
        __CLR4_4_1165q165qlb90pas8.R.inc(54646);RealMatrix Q = qr.getQ();
        __CLR4_4_1165q165qlb90pas8.R.inc(54647);final int p = qr.getR().getColumnDimension();
        __CLR4_4_1165q165qlb90pas8.R.inc(54648);final int n = Q.getColumnDimension();
        // No try-catch or advertised NotStrictlyPositiveException - NPE above if n < 3
        __CLR4_4_1165q165qlb90pas8.R.inc(54649);Array2DRowRealMatrix augI = new Array2DRowRealMatrix(n, n);
        __CLR4_4_1165q165qlb90pas8.R.inc(54650);double[][] augIData = augI.getDataRef();
        __CLR4_4_1165q165qlb90pas8.R.inc(54651);for (int i = 0; (((i < n)&&(__CLR4_4_1165q165qlb90pas8.R.iget(54652)!=0|true))||(__CLR4_4_1165q165qlb90pas8.R.iget(54653)==0&false)); i++) {{
            __CLR4_4_1165q165qlb90pas8.R.inc(54654);for (int j =0; (((j < n)&&(__CLR4_4_1165q165qlb90pas8.R.iget(54655)!=0|true))||(__CLR4_4_1165q165qlb90pas8.R.iget(54656)==0&false)); j++) {{
                __CLR4_4_1165q165qlb90pas8.R.inc(54657);if ((((i == j && i < p)&&(__CLR4_4_1165q165qlb90pas8.R.iget(54658)!=0|true))||(__CLR4_4_1165q165qlb90pas8.R.iget(54659)==0&false))) {{
                    __CLR4_4_1165q165qlb90pas8.R.inc(54660);augIData[i][j] = 1d;
                } }else {{
                    __CLR4_4_1165q165qlb90pas8.R.inc(54661);augIData[i][j] = 0d;
                }
            }}
        }}

        // Compute and return Hat matrix
        // No DME advertised - args valid if we get here
        }__CLR4_4_1165q165qlb90pas8.R.inc(54662);return Q.multiply(augI).multiply(Q.transpose());
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * <p>Returns the sum of squared deviations of Y from its mean.</p>
     *
     * <p>If the model has no intercept term, <code>0</code> is used for the
     * mean of Y - i.e., what is returned is the sum of the squared Y values.</p>
     *
     * <p>The value returned by this method is the SSTO value used in
     * the {@link #calculateRSquared() R-squared} computation.</p>
     *
     * @return SSTO - the total sum of squares
     * @throws MathIllegalArgumentException if the sample has not been set or does
     * not contain at least 3 observations
     * @see #isNoIntercept()
     * @since 2.2
     */
    public double calculateTotalSumOfSquares() throws MathIllegalArgumentException {try{__CLR4_4_1165q165qlb90pas8.R.inc(54663);
        __CLR4_4_1165q165qlb90pas8.R.inc(54664);if ((((isNoIntercept())&&(__CLR4_4_1165q165qlb90pas8.R.iget(54665)!=0|true))||(__CLR4_4_1165q165qlb90pas8.R.iget(54666)==0&false))) {{
            __CLR4_4_1165q165qlb90pas8.R.inc(54667);return StatUtils.sumSq(getY().toArray());
        } }else {{
            __CLR4_4_1165q165qlb90pas8.R.inc(54668);return new SecondMoment().evaluate(getY().toArray());
        }
    }}finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * Returns the sum of squared residuals.
     *
     * @return residual sum of squares
     * @since 2.2
     */
    public double calculateResidualSumOfSquares() {try{__CLR4_4_1165q165qlb90pas8.R.inc(54669);
        __CLR4_4_1165q165qlb90pas8.R.inc(54670);final RealVector residuals = calculateResiduals();
        // No advertised DME, args are valid
        __CLR4_4_1165q165qlb90pas8.R.inc(54671);return residuals.dotProduct(residuals);
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * Returns the R-Squared statistic, defined by the formula <pre>
     * R<sup>2</sup> = 1 - SSR / SSTO
     * </pre>
     * where SSR is the {@link #calculateResidualSumOfSquares() sum of squared residuals}
     * and SSTO is the {@link #calculateTotalSumOfSquares() total sum of squares}
     *
     * @return R-square statistic
     * @throws MathIllegalArgumentException if the sample has not been set or does
     * not contain at least 3 observations
     * @since 2.2
     */
    public double calculateRSquared() throws MathIllegalArgumentException {try{__CLR4_4_1165q165qlb90pas8.R.inc(54672);
        __CLR4_4_1165q165qlb90pas8.R.inc(54673);return 1 - calculateResidualSumOfSquares() / calculateTotalSumOfSquares();
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * <p>Returns the adjusted R-squared statistic, defined by the formula <pre>
     * R<sup>2</sup><sub>adj</sub> = 1 - [SSR (n - 1)] / [SSTO (n - p)]
     * </pre>
     * where SSR is the {@link #calculateResidualSumOfSquares() sum of squared residuals},
     * SSTO is the {@link #calculateTotalSumOfSquares() total sum of squares}, n is the number
     * of observations and p is the number of parameters estimated (including the intercept).</p>
     *
     * <p>If the regression is estimated without an intercept term, what is returned is <pre>
     * <code> 1 - (1 - {@link #calculateRSquared()}) * (n / (n - p)) </code>
     * </pre></p>
     *
     * @return adjusted R-Squared statistic
     * @throws MathIllegalArgumentException if the sample has not been set or does
     * not contain at least 3 observations
     * @see #isNoIntercept()
     * @since 2.2
     */
    public double calculateAdjustedRSquared() throws MathIllegalArgumentException {try{__CLR4_4_1165q165qlb90pas8.R.inc(54674);
        __CLR4_4_1165q165qlb90pas8.R.inc(54675);final double n = getX().getRowDimension();
        __CLR4_4_1165q165qlb90pas8.R.inc(54676);if ((((isNoIntercept())&&(__CLR4_4_1165q165qlb90pas8.R.iget(54677)!=0|true))||(__CLR4_4_1165q165qlb90pas8.R.iget(54678)==0&false))) {{
            __CLR4_4_1165q165qlb90pas8.R.inc(54679);return 1 - (1 - calculateRSquared()) * (n / (n - getX().getColumnDimension()));
        } }else {{
            __CLR4_4_1165q165qlb90pas8.R.inc(54680);return 1 - (calculateResidualSumOfSquares() * (n - 1)) /
                (calculateTotalSumOfSquares() * (n - getX().getColumnDimension()));
        }
    }}finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     * <p>This implementation computes and caches the QR decomposition of the X matrix
     * once it is successfully loaded.</p>
     */
    @Override
    protected void newXSampleData(double[][] x) {try{__CLR4_4_1165q165qlb90pas8.R.inc(54681);
        __CLR4_4_1165q165qlb90pas8.R.inc(54682);super.newXSampleData(x);
        __CLR4_4_1165q165qlb90pas8.R.inc(54683);qr = new QRDecomposition(getX());
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * Calculates the regression coefficients using OLS.
     *
     * <p>Data for the model must have been successfully loaded using one of
     * the {@code newSampleData} methods before invoking this method; otherwise
     * a {@code NullPointerException} will be thrown.</p>
     *
     * @return beta
     */
    @Override
    protected RealVector calculateBeta() {try{__CLR4_4_1165q165qlb90pas8.R.inc(54684);
        __CLR4_4_1165q165qlb90pas8.R.inc(54685);return qr.getSolver().solve(getY());
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

    /**
     * <p>Calculates the variance-covariance matrix of the regression parameters.
     * </p>
     * <p>Var(b) = (X<sup>T</sup>X)<sup>-1</sup>
     * </p>
     * <p>Uses QR decomposition to reduce (X<sup>T</sup>X)<sup>-1</sup>
     * to (R<sup>T</sup>R)<sup>-1</sup>, with only the top p rows of
     * R included, where p = the length of the beta vector.</p>
     *
     * <p>Data for the model must have been successfully loaded using one of
     * the {@code newSampleData} methods before invoking this method; otherwise
     * a {@code NullPointerException} will be thrown.</p>
     *
     * @return The beta variance-covariance matrix
     */
    @Override
    protected RealMatrix calculateBetaVariance() {try{__CLR4_4_1165q165qlb90pas8.R.inc(54686);
        __CLR4_4_1165q165qlb90pas8.R.inc(54687);int p = getX().getColumnDimension();
        __CLR4_4_1165q165qlb90pas8.R.inc(54688);RealMatrix Raug = qr.getR().getSubMatrix(0, p - 1 , 0, p - 1);
        __CLR4_4_1165q165qlb90pas8.R.inc(54689);RealMatrix Rinv = new LUDecomposition(Raug).getSolver().getInverse();
        __CLR4_4_1165q165qlb90pas8.R.inc(54690);return Rinv.multiply(Rinv.transpose());
    }finally{__CLR4_4_1165q165qlb90pas8.R.flushNeeded();}}

}
