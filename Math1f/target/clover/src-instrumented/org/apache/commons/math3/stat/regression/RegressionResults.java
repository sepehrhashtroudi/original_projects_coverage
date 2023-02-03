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

import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.exception.OutOfRangeException;

/**
 * Results of a Multiple Linear Regression model fit.
 *
 * @version $Id$
 * @since 3.0
 */
public class RegressionResults implements Serializable {public static class __CLR4_4_116771677lb90pasf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,54837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** INDEX of Sum of Squared Errors */
    private static final int SSE_IDX = 0;
    /** INDEX of Sum of Squares of Model */
    private static final int SST_IDX = 1;
    /** INDEX of R-Squared of regression */
    private static final int RSQ_IDX = 2;
    /** INDEX of Mean Squared Error */
    private static final int MSE_IDX = 3;
    /** INDEX of Adjusted R Squared */
    private static final int ADJRSQ_IDX = 4;
    /** UID */
    private static final long serialVersionUID = 1l;
    /** regression slope parameters */
    private final double[] parameters;
    /** variance covariance matrix of parameters */
    private final double[][] varCovData;
    /** boolean flag for variance covariance matrix in symm compressed storage */
    private final boolean isSymmetricVCD;
    /** rank of the solution */
    @SuppressWarnings("unused")
    private final int rank;
    /** number of observations on which results are based */
    private final long nobs;
    /** boolean flag indicator of whether a constant was included*/
    private final boolean containsConstant;
    /** array storing global results, SSE, MSE, RSQ, adjRSQ */
    private final double[] globalFitInfo;

    /**
     *  Set the default constructor to private access
     *  to prevent inadvertent instantiation
     */
    @SuppressWarnings("unused")
    private RegressionResults() {try{__CLR4_4_116771677lb90pasf.R.inc(54691);
        __CLR4_4_116771677lb90pasf.R.inc(54692);this.parameters = null;
        __CLR4_4_116771677lb90pasf.R.inc(54693);this.varCovData = null;
        __CLR4_4_116771677lb90pasf.R.inc(54694);this.rank = -1;
        __CLR4_4_116771677lb90pasf.R.inc(54695);this.nobs = -1;
        __CLR4_4_116771677lb90pasf.R.inc(54696);this.containsConstant = false;
        __CLR4_4_116771677lb90pasf.R.inc(54697);this.isSymmetricVCD = false;
        __CLR4_4_116771677lb90pasf.R.inc(54698);this.globalFitInfo = null;
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * Constructor for Regression Results.
     *
     * @param parameters a double array with the regression slope estimates
     * @param varcov the variance covariance matrix, stored either in a square matrix
     * or as a compressed
     * @param isSymmetricCompressed a flag which denotes that the variance covariance
     * matrix is in symmetric compressed format
     * @param nobs the number of observations of the regression estimation
     * @param rank the number of independent variables in the regression
     * @param sumy the sum of the independent variable
     * @param sumysq the sum of the squared independent variable
     * @param sse sum of squared errors
     * @param containsConstant true model has constant,  false model does not have constant
     * @param copyData if true a deep copy of all input data is made, if false only references
     * are copied and the RegressionResults become mutable
     */
    public RegressionResults(
            final double[] parameters, final double[][] varcov,
            final boolean isSymmetricCompressed,
            final long nobs, final int rank,
            final double sumy, final double sumysq, final double sse,
            final boolean containsConstant,
            final boolean copyData) {try{__CLR4_4_116771677lb90pasf.R.inc(54699);
        __CLR4_4_116771677lb90pasf.R.inc(54700);if ((((copyData)&&(__CLR4_4_116771677lb90pasf.R.iget(54701)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54702)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54703);this.parameters = MathArrays.copyOf(parameters);
            __CLR4_4_116771677lb90pasf.R.inc(54704);this.varCovData = new double[varcov.length][];
            __CLR4_4_116771677lb90pasf.R.inc(54705);for (int i = 0; (((i < varcov.length)&&(__CLR4_4_116771677lb90pasf.R.iget(54706)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54707)==0&false)); i++) {{
                __CLR4_4_116771677lb90pasf.R.inc(54708);this.varCovData[i] = MathArrays.copyOf(varcov[i]);
            }
        }} }else {{
            __CLR4_4_116771677lb90pasf.R.inc(54709);this.parameters = parameters;
            __CLR4_4_116771677lb90pasf.R.inc(54710);this.varCovData = varcov;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54711);this.isSymmetricVCD = isSymmetricCompressed;
        __CLR4_4_116771677lb90pasf.R.inc(54712);this.nobs = nobs;
        __CLR4_4_116771677lb90pasf.R.inc(54713);this.rank = rank;
        __CLR4_4_116771677lb90pasf.R.inc(54714);this.containsConstant = containsConstant;
        __CLR4_4_116771677lb90pasf.R.inc(54715);this.globalFitInfo = new double[5];
        __CLR4_4_116771677lb90pasf.R.inc(54716);Arrays.fill(this.globalFitInfo, Double.NaN);

        __CLR4_4_116771677lb90pasf.R.inc(54717);if ((((rank > 0)&&(__CLR4_4_116771677lb90pasf.R.iget(54718)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54719)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54720);this.globalFitInfo[SST_IDX] = (((containsConstant )&&(__CLR4_4_116771677lb90pasf.R.iget(54721)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54722)==0&false))?
                    (sumysq - sumy * sumy / nobs) : sumysq;
        }

        }__CLR4_4_116771677lb90pasf.R.inc(54723);this.globalFitInfo[SSE_IDX] = sse;
        __CLR4_4_116771677lb90pasf.R.inc(54724);this.globalFitInfo[MSE_IDX] = this.globalFitInfo[SSE_IDX] /
                (nobs - rank);
        __CLR4_4_116771677lb90pasf.R.inc(54725);this.globalFitInfo[RSQ_IDX] = 1.0 -
                this.globalFitInfo[SSE_IDX] /
                this.globalFitInfo[SST_IDX];

        __CLR4_4_116771677lb90pasf.R.inc(54726);if ((((!containsConstant)&&(__CLR4_4_116771677lb90pasf.R.iget(54727)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54728)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54729);this.globalFitInfo[ADJRSQ_IDX] = 1.0-
                    (1.0 - this.globalFitInfo[RSQ_IDX]) *
                    ( (double) nobs / ( (double) (nobs - rank)));
        } }else {{
            __CLR4_4_116771677lb90pasf.R.inc(54730);this.globalFitInfo[ADJRSQ_IDX] = 1.0 - (sse * (nobs - 1.0)) /
                    (globalFitInfo[SST_IDX] * (nobs - rank));
        }
    }}finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the parameter estimate for the regressor at the given index.</p>
     *
     * <p>A redundant regressor will have its redundancy flag set, as well as
     *  a parameters estimated equal to {@code Double.NaN}</p>
     *
     * @param index Index.
     * @return the parameters estimated for regressor at index.
     * @throws OutOfRangeException if {@code index} is not in the interval
     * {@code [0, number of parameters)}.
     */
    public double getParameterEstimate(int index) throws OutOfRangeException {try{__CLR4_4_116771677lb90pasf.R.inc(54731);
        __CLR4_4_116771677lb90pasf.R.inc(54732);if ((((parameters == null)&&(__CLR4_4_116771677lb90pasf.R.iget(54733)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54734)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54735);return Double.NaN;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54736);if ((((index < 0 || index >= this.parameters.length)&&(__CLR4_4_116771677lb90pasf.R.iget(54737)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54738)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54739);throw new OutOfRangeException(index, 0, this.parameters.length - 1);
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54740);return this.parameters[index];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns a copy of the regression parameters estimates.</p>
     *
     * <p>The parameter estimates are returned in the natural order of the data.</p>
     *
     * <p>A redundant regressor will have its redundancy flag set, as will
     *  a parameter estimate equal to {@code Double.NaN}.</p>
     *
     * @return array of parameter estimates, null if no estimation occurred
     */
    public double[] getParameterEstimates() {try{__CLR4_4_116771677lb90pasf.R.inc(54741);
        __CLR4_4_116771677lb90pasf.R.inc(54742);if ((((this.parameters == null)&&(__CLR4_4_116771677lb90pasf.R.iget(54743)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54744)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54745);return null;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54746);return MathArrays.copyOf(parameters);
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/standerrorb(1).htm">standard
     * error of the parameter estimate at index</a>,
     * usually denoted s(b<sub>index</sub>).
     *
     * @param index Index.
     * @return the standard errors associated with parameters estimated at index.
     * @throws OutOfRangeException if {@code index} is not in the interval
     * {@code [0, number of parameters)}.
     */
    public double getStdErrorOfEstimate(int index) throws OutOfRangeException {try{__CLR4_4_116771677lb90pasf.R.inc(54747);
        __CLR4_4_116771677lb90pasf.R.inc(54748);if ((((parameters == null)&&(__CLR4_4_116771677lb90pasf.R.iget(54749)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54750)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54751);return Double.NaN;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54752);if ((((index < 0 || index >= this.parameters.length)&&(__CLR4_4_116771677lb90pasf.R.iget(54753)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54754)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54755);throw new OutOfRangeException(index, 0, this.parameters.length - 1);
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54756);double var = this.getVcvElement(index, index);
        __CLR4_4_116771677lb90pasf.R.inc(54757);if ((((!Double.isNaN(var) && var > Double.MIN_VALUE)&&(__CLR4_4_116771677lb90pasf.R.iget(54758)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54759)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54760);return FastMath.sqrt(var);
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54761);return Double.NaN;
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the <a href="http://www.xycoon.com/standerrorb(1).htm">standard
     * error of the parameter estimates</a>,
     * usually denoted s(b<sub>i</sub>).</p>
     *
     * <p>If there are problems with an ill conditioned design matrix then the regressor
     * which is redundant will be assigned <code>Double.NaN</code>. </p>
     *
     * @return an array standard errors associated with parameters estimates,
     *  null if no estimation occurred
     */
    public double[] getStdErrorOfEstimates() {try{__CLR4_4_116771677lb90pasf.R.inc(54762);
        __CLR4_4_116771677lb90pasf.R.inc(54763);if ((((parameters == null)&&(__CLR4_4_116771677lb90pasf.R.iget(54764)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54765)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54766);return null;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54767);double[] se = new double[this.parameters.length];
        __CLR4_4_116771677lb90pasf.R.inc(54768);for (int i = 0; (((i < this.parameters.length)&&(__CLR4_4_116771677lb90pasf.R.iget(54769)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54770)==0&false)); i++) {{
            __CLR4_4_116771677lb90pasf.R.inc(54771);double var = this.getVcvElement(i, i);
            __CLR4_4_116771677lb90pasf.R.inc(54772);if ((((!Double.isNaN(var) && var > Double.MIN_VALUE)&&(__CLR4_4_116771677lb90pasf.R.iget(54773)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54774)==0&false))) {{
                __CLR4_4_116771677lb90pasf.R.inc(54775);se[i] = FastMath.sqrt(var);
                __CLR4_4_116771677lb90pasf.R.inc(54776);continue;
            }
            }__CLR4_4_116771677lb90pasf.R.inc(54777);se[i] = Double.NaN;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54778);return se;
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the covariance between regression parameters i and j.</p>
     *
     * <p>If there are problems with an ill conditioned design matrix then the covariance
     * which involves redundant columns will be assigned {@code Double.NaN}. </p>
     *
     * @param i {@code i}th regression parameter.
     * @param j {@code j}th regression parameter.
     * @return the covariance of the parameter estimates.
     * @throws OutOfRangeException if {@code i} or {@code j} is not in the
     * interval {@code [0, number of parameters)}.
     */
    public double getCovarianceOfParameters(int i, int j) throws OutOfRangeException {try{__CLR4_4_116771677lb90pasf.R.inc(54779);
        __CLR4_4_116771677lb90pasf.R.inc(54780);if ((((parameters == null)&&(__CLR4_4_116771677lb90pasf.R.iget(54781)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54782)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54783);return Double.NaN;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54784);if ((((i < 0 || i >= this.parameters.length)&&(__CLR4_4_116771677lb90pasf.R.iget(54785)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54786)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54787);throw new OutOfRangeException(i, 0, this.parameters.length - 1);
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54788);if ((((j < 0 || j >= this.parameters.length)&&(__CLR4_4_116771677lb90pasf.R.iget(54789)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54790)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54791);throw new OutOfRangeException(j, 0, this.parameters.length - 1);
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54792);return this.getVcvElement(i, j);
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the number of parameters estimated in the model.</p>
     *
     * <p>This is the maximum number of regressors, some techniques may drop
     * redundant parameters</p>
     *
     * @return number of regressors, -1 if not estimated
     */
    public int getNumberOfParameters() {try{__CLR4_4_116771677lb90pasf.R.inc(54793);
        __CLR4_4_116771677lb90pasf.R.inc(54794);if ((((this.parameters == null)&&(__CLR4_4_116771677lb90pasf.R.iget(54795)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54796)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54797);return -1;
        }
        }__CLR4_4_116771677lb90pasf.R.inc(54798);return this.parameters.length;
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * Returns the number of observations added to the regression model.
     *
     * @return Number of observations, -1 if an error condition prevents estimation
     */
    public long getN() {try{__CLR4_4_116771677lb90pasf.R.inc(54799);
        __CLR4_4_116771677lb90pasf.R.inc(54800);return this.nobs;
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the sum of squared deviations of the y values about their mean.</p>
     *
     * <p>This is defined as SSTO
     * <a href="http://www.xycoon.com/SumOfSquares.htm">here</a>.</p>
     *
     * <p>If {@code n < 2}, this returns {@code Double.NaN}.</p>
     *
     * @return sum of squared deviations of y values
     */
    public double getTotalSumSquares() {try{__CLR4_4_116771677lb90pasf.R.inc(54801);
        __CLR4_4_116771677lb90pasf.R.inc(54802);return this.globalFitInfo[SST_IDX];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the sum of squared deviations of the predicted y values about
     * their mean (which equals the mean of y).</p>
     *
     * <p>This is usually abbreviated SSR or SSM.  It is defined as SSM
     * <a href="http://www.xycoon.com/SumOfSquares.htm">here</a></p>
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double.NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return sum of squared deviations of predicted y values
     */
    public double getRegressionSumSquares() {try{__CLR4_4_116771677lb90pasf.R.inc(54803);
        __CLR4_4_116771677lb90pasf.R.inc(54804);return this.globalFitInfo[SST_IDX] - this.globalFitInfo[SSE_IDX];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the <a href="http://www.xycoon.com/SumOfSquares.htm">
     * sum of squared errors</a> (SSE) associated with the regression
     * model.</p>
     *
     * <p>The return value is constrained to be non-negative - i.e., if due to
     * rounding errors the computational formula returns a negative result,
     * 0 is returned.</p>
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>numberOfParameters data pairs
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double,NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return sum of squared errors associated with the regression model
     */
    public double getErrorSumSquares() {try{__CLR4_4_116771677lb90pasf.R.inc(54805);
        __CLR4_4_116771677lb90pasf.R.inc(54806);return this.globalFitInfo[ SSE_IDX];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the sum of squared errors divided by the degrees of freedom,
     * usually abbreviated MSE.</p>
     *
     * <p>If there are fewer than <strong>numberOfParameters + 1</strong> data pairs in the model,
     * or if there is no variation in <code>x</code>, this returns
     * <code>Double.NaN</code>.</p>
     *
     * @return sum of squared deviations of y values
     */
    public double getMeanSquareError() {try{__CLR4_4_116771677lb90pasf.R.inc(54807);
        __CLR4_4_116771677lb90pasf.R.inc(54808);return this.globalFitInfo[ MSE_IDX];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the <a href="http://www.xycoon.com/coefficient1.htm">
     * coefficient of multiple determination</a>,
     * usually denoted r-square.</p>
     *
     * <p><strong>Preconditions</strong>: <ul>
     * <li>At least numberOfParameters observations (with at least numberOfParameters different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, {@code Double,NaN} is
     * returned.
     * </li></ul></p>
     *
     * @return r-square, a double in the interval [0, 1]
     */
    public double getRSquared() {try{__CLR4_4_116771677lb90pasf.R.inc(54809);
        __CLR4_4_116771677lb90pasf.R.inc(54810);return this.globalFitInfo[ RSQ_IDX];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * <p>Returns the adjusted R-squared statistic, defined by the formula <pre>
     * R<sup>2</sup><sub>adj</sub> = 1 - [SSR (n - 1)] / [SSTO (n - p)]
     * </pre>
     * where SSR is the sum of squared residuals},
     * SSTO is the total sum of squares}, n is the number
     * of observations and p is the number of parameters estimated (including the intercept).</p>
     *
     * <p>If the regression is estimated without an intercept term, what is returned is <pre>
     * <code> 1 - (1 - {@link #getRSquared()} ) * (n / (n - p)) </code>
     * </pre></p>
     *
     * @return adjusted R-Squared statistic
     */
    public double getAdjustedRSquared() {try{__CLR4_4_116771677lb90pasf.R.inc(54811);
        __CLR4_4_116771677lb90pasf.R.inc(54812);return this.globalFitInfo[ ADJRSQ_IDX];
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * Returns true if the regression model has been computed including an intercept.
     * In this case, the coefficient of the intercept is the first element of the
     * {@link #getParameterEstimates() parameter estimates}.
     * @return true if the model has an intercept term
     */
    public boolean hasIntercept() {try{__CLR4_4_116771677lb90pasf.R.inc(54813);
        __CLR4_4_116771677lb90pasf.R.inc(54814);return this.containsConstant;
    }finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}

    /**
     * Gets the i-jth element of the variance-covariance matrix.
     *
     * @param i first variable index
     * @param j second variable index
     * @return the requested variance-covariance matrix entry
     */
    private double getVcvElement(int i, int j) {try{__CLR4_4_116771677lb90pasf.R.inc(54815);
        __CLR4_4_116771677lb90pasf.R.inc(54816);if ((((this.isSymmetricVCD)&&(__CLR4_4_116771677lb90pasf.R.iget(54817)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54818)==0&false))) {{
            __CLR4_4_116771677lb90pasf.R.inc(54819);if ((((this.varCovData.length > 1)&&(__CLR4_4_116771677lb90pasf.R.iget(54820)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54821)==0&false))) {{
                //could be stored in upper or lower triangular
                __CLR4_4_116771677lb90pasf.R.inc(54822);if ((((i == j)&&(__CLR4_4_116771677lb90pasf.R.iget(54823)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54824)==0&false))) {{
                    __CLR4_4_116771677lb90pasf.R.inc(54825);return varCovData[i][i];
                } }else {__CLR4_4_116771677lb90pasf.R.inc(54826);if ((((i >= varCovData[j].length)&&(__CLR4_4_116771677lb90pasf.R.iget(54827)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54828)==0&false))) {{
                    __CLR4_4_116771677lb90pasf.R.inc(54829);return varCovData[i][j];
                } }else {{
                    __CLR4_4_116771677lb90pasf.R.inc(54830);return varCovData[j][i];
                }
            }}} }else {{//could be in single array
                __CLR4_4_116771677lb90pasf.R.inc(54831);if ((((i > j)&&(__CLR4_4_116771677lb90pasf.R.iget(54832)!=0|true))||(__CLR4_4_116771677lb90pasf.R.iget(54833)==0&false))) {{
                    __CLR4_4_116771677lb90pasf.R.inc(54834);return varCovData[0][(i + 1) * i / 2 + j];
                } }else {{
                    __CLR4_4_116771677lb90pasf.R.inc(54835);return varCovData[0][(j + 1) * j / 2 + i];
                }
            }}
        }} }else {{
            __CLR4_4_116771677lb90pasf.R.inc(54836);return this.varCovData[i][j];
        }
    }}finally{__CLR4_4_116771677lb90pasf.R.flushNeeded();}}
}
