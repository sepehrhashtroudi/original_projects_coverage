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

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

/**
 * Estimates an ordinary least squares regression model
 * with one independent variable.
 * <p>
 * <code> y = intercept + slope * x  </code></p>
 * <p>
 * Standard errors for <code>intercept</code> and <code>slope</code> are
 * available as well as ANOVA, r-square and Pearson's r statistics.</p>
 * <p>
 * Observations (x,y pairs) can be added to the model one at a time or they
 * can be provided in a 2-dimensional array.  The observations are not stored
 * in memory, so there is no limit to the number of observations that can be
 * added to the model.</p>
 * <p>
 * <strong>Usage Notes</strong>: <ul>
 * <li> When there are fewer than two observations in the model, or when
 * there is no variation in the x values (i.e. all x values are the same)
 * all statistics return <code>NaN</code>. At least two observations with
 * different x coordinates are required to estimate a bivariate regression
 * model.
 * </li>
 * <li> Getters for the statistics always compute values based on the current
 * set of observations -- i.e., you can get statistics, then add more data
 * and get updated statistics without using a new instance.  There is no
 * "compute" method that updates all statistics.  Each of the getters performs
 * the necessary computations to return the requested statistic.
 * </li>
 * <li> The intercept term may be suppressed by passing {@code false} to
 * the {@link #SimpleRegression(boolean)} constructor.  When the
 * {@code hasIntercept} property is false, the model is estimated without a
 * constant term and {@link #getIntercept()} returns {@code 0}.</li>
 * </ul></p>
 *
 * @version $Id$
 */
public class SimpleRegression implements Serializable, UpdatingMultipleLinearRegression {public static class __CLR4_4_116b916b9lb90pasr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,55169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -3004689053607543335L;

    /** sum of x values */
    private double sumX = 0d;

    /** total variation in x (sum of squared deviations from xbar) */
    private double sumXX = 0d;

    /** sum of y values */
    private double sumY = 0d;

    /** total variation in y (sum of squared deviations from ybar) */
    private double sumYY = 0d;

    /** sum of products */
    private double sumXY = 0d;

    /** number of observations */
    private long n = 0;

    /** mean of accumulated x values, used in updating formulas */
    private double xbar = 0;

    /** mean of accumulated y values, used in updating formulas */
    private double ybar = 0;

    /** include an intercept or not */
    private final boolean hasIntercept;
    // ---------------------Public methods--------------------------------------

    /**
     * Create an empty SimpleRegression instance
     */
    public SimpleRegression() {
        this(true);__CLR4_4_116b916b9lb90pasr.R.inc(54838);try{__CLR4_4_116b916b9lb90pasr.R.inc(54837);
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}
    /**
    * Create a SimpleRegression instance, specifying whether or not to estimate
    * an intercept.
    *
    * <p>Use {@code false} to estimate a model with no intercept.  When the
    * {@code hasIntercept} property is false, the model is estimated without a
    * constant term and {@link #getIntercept()} returns {@code 0}.</p>
    *
    * @param includeIntercept whether or not to include an intercept term in
    * the regression model
    */
    public SimpleRegression(boolean includeIntercept) {
        super();__CLR4_4_116b916b9lb90pasr.R.inc(54840);try{__CLR4_4_116b916b9lb90pasr.R.inc(54839);
        __CLR4_4_116b916b9lb90pasr.R.inc(54841);hasIntercept = includeIntercept;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Adds the observation (x,y) to the regression data set.
     * <p>
     * Uses updating formulas for means and sums of squares defined in
     * "Algorithms for Computing the Sample Variance: Analysis and
     * Recommendations", Chan, T.F., Golub, G.H., and LeVeque, R.J.
     * 1983, American Statistician, vol. 37, pp. 242-247, referenced in
     * Weisberg, S. "Applied Linear Regression". 2nd Ed. 1985.</p>
     *
     *
     * @param x independent variable value
     * @param y dependent variable value
     */
    public void addData(final double x,final double y) {try{__CLR4_4_116b916b9lb90pasr.R.inc(54842);
        __CLR4_4_116b916b9lb90pasr.R.inc(54843);if ((((n == 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54844)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54845)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54846);xbar = x;
            __CLR4_4_116b916b9lb90pasr.R.inc(54847);ybar = y;
        } }else {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54848);if( (((hasIntercept )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54849)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54850)==0&false))){{
                __CLR4_4_116b916b9lb90pasr.R.inc(54851);final double fact1 = 1.0 + n;
                __CLR4_4_116b916b9lb90pasr.R.inc(54852);final double fact2 = n / (1.0 + n);
                __CLR4_4_116b916b9lb90pasr.R.inc(54853);final double dx = x - xbar;
                __CLR4_4_116b916b9lb90pasr.R.inc(54854);final double dy = y - ybar;
                __CLR4_4_116b916b9lb90pasr.R.inc(54855);sumXX += dx * dx * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54856);sumYY += dy * dy * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54857);sumXY += dx * dy * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54858);xbar += dx / fact1;
                __CLR4_4_116b916b9lb90pasr.R.inc(54859);ybar += dy / fact1;
            }
         }}
        }__CLR4_4_116b916b9lb90pasr.R.inc(54860);if( (((!hasIntercept )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54861)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54862)==0&false))){{
            __CLR4_4_116b916b9lb90pasr.R.inc(54863);sumXX += x * x ;
            __CLR4_4_116b916b9lb90pasr.R.inc(54864);sumYY += y * y ;
            __CLR4_4_116b916b9lb90pasr.R.inc(54865);sumXY += x * y ;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54866);sumX += x;
        __CLR4_4_116b916b9lb90pasr.R.inc(54867);sumY += y;
        __CLR4_4_116b916b9lb90pasr.R.inc(54868);n++;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Appends data from another regression calculation to this one.
     *
     * <p>The mean update formulae are based on a paper written by Philippe
     * P&eacute;bay:
     * <a
     * href="http://prod.sandia.gov/techlib/access-control.cgi/2008/086212.pdf">
     * Formulas for Robust, One-Pass Parallel Computation of Covariances and
     * Arbitrary-Order Statistical Moments</a>, 2008, Technical Report
     * SAND2008-6212, Sandia National Laboratories.</p>
     *
     * @param reg model to append data from
     */
    public void append(SimpleRegression reg) {try{__CLR4_4_116b916b9lb90pasr.R.inc(54869);
        __CLR4_4_116b916b9lb90pasr.R.inc(54870);if ((((n == 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54871)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54872)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54873);xbar = reg.xbar;
            __CLR4_4_116b916b9lb90pasr.R.inc(54874);ybar = reg.ybar;
            __CLR4_4_116b916b9lb90pasr.R.inc(54875);sumXX = reg.sumXX;
            __CLR4_4_116b916b9lb90pasr.R.inc(54876);sumYY = reg.sumYY;
            __CLR4_4_116b916b9lb90pasr.R.inc(54877);sumXY = reg.sumXY;
        } }else {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54878);if ((((hasIntercept)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54879)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54880)==0&false))) {{
                __CLR4_4_116b916b9lb90pasr.R.inc(54881);final double fact1 = reg.n / (double) (reg.n + n);
                __CLR4_4_116b916b9lb90pasr.R.inc(54882);final double fact2 = n * reg.n / (double) (reg.n + n);
                __CLR4_4_116b916b9lb90pasr.R.inc(54883);final double dx = reg.xbar - xbar;
                __CLR4_4_116b916b9lb90pasr.R.inc(54884);final double dy = reg.ybar - ybar;
                __CLR4_4_116b916b9lb90pasr.R.inc(54885);sumXX += reg.sumXX + dx * dx * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54886);sumYY += reg.sumYY + dy * dy * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54887);sumXY += reg.sumXY + dx * dy * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54888);xbar += dx * fact1;
                __CLR4_4_116b916b9lb90pasr.R.inc(54889);ybar += dy * fact1;
            }}else{{
                __CLR4_4_116b916b9lb90pasr.R.inc(54890);sumXX += reg.sumXX;
                __CLR4_4_116b916b9lb90pasr.R.inc(54891);sumYY += reg.sumYY;
                __CLR4_4_116b916b9lb90pasr.R.inc(54892);sumXY += reg.sumXY;
            }
        }}
        }__CLR4_4_116b916b9lb90pasr.R.inc(54893);sumX += reg.sumX;
        __CLR4_4_116b916b9lb90pasr.R.inc(54894);sumY += reg.sumY;
        __CLR4_4_116b916b9lb90pasr.R.inc(54895);n += reg.n;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Removes the observation (x,y) from the regression data set.
     * <p>
     * Mirrors the addData method.  This method permits the use of
     * SimpleRegression instances in streaming mode where the regression
     * is applied to a sliding "window" of observations, however the caller is
     * responsible for maintaining the set of observations in the window.</p>
     *
     * The method has no effect if there are no points of data (i.e. n=0)
     *
     * @param x independent variable value
     * @param y dependent variable value
     */
    public void removeData(final double x,final double y) {try{__CLR4_4_116b916b9lb90pasr.R.inc(54896);
        __CLR4_4_116b916b9lb90pasr.R.inc(54897);if ((((n > 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54898)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54899)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54900);if ((((hasIntercept)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54901)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54902)==0&false))) {{
                __CLR4_4_116b916b9lb90pasr.R.inc(54903);final double fact1 = n - 1.0;
                __CLR4_4_116b916b9lb90pasr.R.inc(54904);final double fact2 = n / (n - 1.0);
                __CLR4_4_116b916b9lb90pasr.R.inc(54905);final double dx = x - xbar;
                __CLR4_4_116b916b9lb90pasr.R.inc(54906);final double dy = y - ybar;
                __CLR4_4_116b916b9lb90pasr.R.inc(54907);sumXX -= dx * dx * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54908);sumYY -= dy * dy * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54909);sumXY -= dx * dy * fact2;
                __CLR4_4_116b916b9lb90pasr.R.inc(54910);xbar -= dx / fact1;
                __CLR4_4_116b916b9lb90pasr.R.inc(54911);ybar -= dy / fact1;
            } }else {{
                __CLR4_4_116b916b9lb90pasr.R.inc(54912);final double fact1 = n - 1.0;
                __CLR4_4_116b916b9lb90pasr.R.inc(54913);sumXX -= x * x;
                __CLR4_4_116b916b9lb90pasr.R.inc(54914);sumYY -= y * y;
                __CLR4_4_116b916b9lb90pasr.R.inc(54915);sumXY -= x * y;
                __CLR4_4_116b916b9lb90pasr.R.inc(54916);xbar -= x / fact1;
                __CLR4_4_116b916b9lb90pasr.R.inc(54917);ybar -= y / fact1;
            }
             }__CLR4_4_116b916b9lb90pasr.R.inc(54918);sumX -= x;
             __CLR4_4_116b916b9lb90pasr.R.inc(54919);sumY -= y;
             __CLR4_4_116b916b9lb90pasr.R.inc(54920);n--;
        }
    }}finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Adds the observations represented by the elements in
     * <code>data</code>.
     * <p>
     * <code>(data[0][0],data[0][1])</code> will be the first observation, then
     * <code>(data[1][0],data[1][1])</code>, etc.</p>
     * <p>
     * This method does not replace data that has already been added.  The
     * observations represented by <code>data</code> are added to the existing
     * dataset.</p>
     * <p>
     * To replace all data, use <code>clear()</code> before adding the new
     * data.</p>
     *
     * @param data array of observations to be added
     * @throws ModelSpecificationException if the length of {@code data[i]} is not
     * greater than or equal to 2
     */
    public void addData(final double[][] data) throws ModelSpecificationException {try{__CLR4_4_116b916b9lb90pasr.R.inc(54921);
        __CLR4_4_116b916b9lb90pasr.R.inc(54922);for (int i = 0; (((i < data.length)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54923)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54924)==0&false)); i++) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54925);if( (((data[i].length < 2 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54926)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54927)==0&false))){{
               __CLR4_4_116b916b9lb90pasr.R.inc(54928);throw new ModelSpecificationException(LocalizedFormats.INVALID_REGRESSION_OBSERVATION,
                    data[i].length, 2);
            }
            }__CLR4_4_116b916b9lb90pasr.R.inc(54929);addData(data[i][0], data[i][1]);
        }
    }}finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Adds one observation to the regression model.
     *
     * @param x the independent variables which form the design matrix
     * @param y the dependent or response variable
     * @throws ModelSpecificationException if the length of {@code x} does not equal
     * the number of independent variables in the model
     */
    public void addObservation(final double[] x,final double y)
    throws ModelSpecificationException {try{__CLR4_4_116b916b9lb90pasr.R.inc(54930);
        __CLR4_4_116b916b9lb90pasr.R.inc(54931);if( (((x == null || x.length == 0 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54932)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54933)==0&false))){{
            __CLR4_4_116b916b9lb90pasr.R.inc(54934);throw new ModelSpecificationException(LocalizedFormats.INVALID_REGRESSION_OBSERVATION,(((x!=null)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54935)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54936)==0&false))?x.length:0, 1);
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54937);addData( x[0], y );
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Adds a series of observations to the regression model. The lengths of
     * x and y must be the same and x must be rectangular.
     *
     * @param x a series of observations on the independent variables
     * @param y a series of observations on the dependent variable
     * The length of x and y must be the same
     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match
     * the length of {@code y} or does not contain sufficient data to estimate the model
     */
    public void addObservations(final double[][] x,final double[] y) throws ModelSpecificationException {try{__CLR4_4_116b916b9lb90pasr.R.inc(54938);
        __CLR4_4_116b916b9lb90pasr.R.inc(54939);if (((((x == null) || (y == null) || (x.length != y.length))&&(__CLR4_4_116b916b9lb90pasr.R.iget(54940)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54941)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54942);throw new ModelSpecificationException(
                  LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE,
                  ((((x == null) )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54943)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54944)==0&false))? 0 : x.length,
                  ((((y == null) )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54945)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54946)==0&false))? 0 : y.length);
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54947);boolean obsOk=true;
        __CLR4_4_116b916b9lb90pasr.R.inc(54948);for( int i = 0 ; (((i < x.length)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54949)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54950)==0&false)); i++){{
            __CLR4_4_116b916b9lb90pasr.R.inc(54951);if( (((x[i] == null || x[i].length == 0 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54952)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54953)==0&false))){{
                __CLR4_4_116b916b9lb90pasr.R.inc(54954);obsOk = false;
            }
        }}
        }__CLR4_4_116b916b9lb90pasr.R.inc(54955);if( (((!obsOk )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54956)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54957)==0&false))){{
            __CLR4_4_116b916b9lb90pasr.R.inc(54958);throw new ModelSpecificationException(
                  LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS,
                  0, 1);
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54959);for( int i = 0 ; (((i < x.length )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54960)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54961)==0&false)); i++){{
            __CLR4_4_116b916b9lb90pasr.R.inc(54962);addData( x[i][0], y[i] );
        }
    }}finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Removes observations represented by the elements in <code>data</code>.
      * <p>
     * If the array is larger than the current n, only the first n elements are
     * processed.  This method permits the use of SimpleRegression instances in
     * streaming mode where the regression is applied to a sliding "window" of
     * observations, however the caller is responsible for maintaining the set
     * of observations in the window.</p>
     * <p>
     * To remove all data, use <code>clear()</code>.</p>
     *
     * @param data array of observations to be removed
     */
    public void removeData(double[][] data) {try{__CLR4_4_116b916b9lb90pasr.R.inc(54963);
        __CLR4_4_116b916b9lb90pasr.R.inc(54964);for (int i = 0; (((i < data.length && n > 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54965)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54966)==0&false)); i++) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54967);removeData(data[i][0], data[i][1]);
        }
    }}finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Clears all data from the model.
     */
    public void clear() {try{__CLR4_4_116b916b9lb90pasr.R.inc(54968);
        __CLR4_4_116b916b9lb90pasr.R.inc(54969);sumX = 0d;
        __CLR4_4_116b916b9lb90pasr.R.inc(54970);sumXX = 0d;
        __CLR4_4_116b916b9lb90pasr.R.inc(54971);sumY = 0d;
        __CLR4_4_116b916b9lb90pasr.R.inc(54972);sumYY = 0d;
        __CLR4_4_116b916b9lb90pasr.R.inc(54973);sumXY = 0d;
        __CLR4_4_116b916b9lb90pasr.R.inc(54974);n = 0;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the number of observations that have been added to the model.
     *
     * @return n number of observations that have been added.
     */
    public long getN() {try{__CLR4_4_116b916b9lb90pasr.R.inc(54975);
        __CLR4_4_116b916b9lb90pasr.R.inc(54976);return n;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the "predicted" <code>y</code> value associated with the
     * supplied <code>x</code> value,  based on the data that has been
     * added to the model when this method is activated.
     * <p>
     * <code> predict(x) = intercept + slope * x </code></p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double,NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @param x input <code>x</code> value
     * @return predicted <code>y</code> value
     */
    public double predict(final double x) {try{__CLR4_4_116b916b9lb90pasr.R.inc(54977);
        __CLR4_4_116b916b9lb90pasr.R.inc(54978);final double b1 = getSlope();
        __CLR4_4_116b916b9lb90pasr.R.inc(54979);if ((((hasIntercept)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54980)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54981)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54982);return getIntercept(b1) + b1 * x;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54983);return b1 * x;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the intercept of the estimated regression line, if
     * {@link #hasIntercept()} is true; otherwise 0.
     * <p>
     * The least squares estimate of the intercept is computed using the
     * <a href="http://www.xycoon.com/estimation4.htm">normal equations</a>.
     * The intercept is sometimes denoted b0.</p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double,NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return the intercept of the regression line if the model includes an
     * intercept; 0 otherwise
     * @see #SimpleRegression(boolean)
     */
    public double getIntercept() {try{__CLR4_4_116b916b9lb90pasr.R.inc(54984);
        __CLR4_4_116b916b9lb90pasr.R.inc(54985);return (((hasIntercept )&&(__CLR4_4_116b916b9lb90pasr.R.iget(54986)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54987)==0&false))? getIntercept(getSlope()) : 0.0;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns true if the model includes an intercept term.
     *
     * @return true if the regression includes an intercept; false otherwise
     * @see #SimpleRegression(boolean)
     */
    public boolean hasIntercept() {try{__CLR4_4_116b916b9lb90pasr.R.inc(54988);
        __CLR4_4_116b916b9lb90pasr.R.inc(54989);return hasIntercept;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
    * Returns the slope of the estimated regression line.
    * <p>
    * The least squares estimate of the slope is computed using the
    * <a href="http://www.xycoon.com/estimation4.htm">normal equations</a>.
    * The slope is sometimes denoted b1.</p>
    * <p>
    * <strong>Preconditions</strong>: <ul>
    * <li>At least two observations (with at least two different x values)
    * must have been added before invoking this method. If this method is
    * invoked before a model can be estimated, <code>Double.NaN</code> is
    * returned.
    * </li></ul></p>
    *
    * @return the slope of the regression line
    */
    public double getSlope() {try{__CLR4_4_116b916b9lb90pasr.R.inc(54990);
        __CLR4_4_116b916b9lb90pasr.R.inc(54991);if ((((n < 2)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54992)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54993)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54994);return Double.NaN; //not enough data
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54995);if ((((FastMath.abs(sumXX) < 10 * Double.MIN_VALUE)&&(__CLR4_4_116b916b9lb90pasr.R.iget(54996)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(54997)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(54998);return Double.NaN; //not enough variation in x
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(54999);return sumXY / sumXX;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/SumOfSquares.htm">
     * sum of squared errors</a> (SSE) associated with the regression
     * model.
     * <p>
     * The sum is computed using the computational formula</p>
     * <p>
     * <code>SSE = SYY - (SXY * SXY / SXX)</code></p>
     * <p>
     * where <code>SYY</code> is the sum of the squared deviations of the y
     * values about their mean, <code>SXX</code> is similarly defined and
     * <code>SXY</code> is the sum of the products of x and y mean deviations.
     * </p><p>
     * The sums are accumulated using the updating algorithm referenced in
     * {@link #addData}.</p>
     * <p>
     * The return value is constrained to be non-negative - i.e., if due to
     * rounding errors the computational formula returns a negative result,
     * 0 is returned.</p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double,NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return sum of squared errors associated with the regression model
     */
    public double getSumSquaredErrors() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55000);
        __CLR4_4_116b916b9lb90pasr.R.inc(55001);return FastMath.max(0d, sumYY - sumXY * sumXY / sumXX);
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the sum of squared deviations of the y values about their mean.
     * <p>
     * This is defined as SSTO
     * <a href="http://www.xycoon.com/SumOfSquares.htm">here</a>.</p>
     * <p>
     * If <code>n < 2</code>, this returns <code>Double.NaN</code>.</p>
     *
     * @return sum of squared deviations of y values
     */
    public double getTotalSumSquares() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55002);
        __CLR4_4_116b916b9lb90pasr.R.inc(55003);if ((((n < 2)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55004)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55005)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55006);return Double.NaN;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55007);return sumYY;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the sum of squared deviations of the x values about their mean.
     *
     * If <code>n < 2</code>, this returns <code>Double.NaN</code>.</p>
     *
     * @return sum of squared deviations of x values
     */
    public double getXSumSquares() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55008);
        __CLR4_4_116b916b9lb90pasr.R.inc(55009);if ((((n < 2)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55010)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55011)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55012);return Double.NaN;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55013);return sumXX;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the sum of crossproducts, x<sub>i</sub>*y<sub>i</sub>.
     *
     * @return sum of cross products
     */
    public double getSumOfCrossProducts() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55014);
        __CLR4_4_116b916b9lb90pasr.R.inc(55015);return sumXY;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the sum of squared deviations of the predicted y values about
     * their mean (which equals the mean of y).
     * <p>
     * This is usually abbreviated SSR or SSM.  It is defined as SSM
     * <a href="http://www.xycoon.com/SumOfSquares.htm">here</a></p>
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double.NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return sum of squared deviations of predicted y values
     */
    public double getRegressionSumSquares() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55016);
        __CLR4_4_116b916b9lb90pasr.R.inc(55017);return getRegressionSumSquares(getSlope());
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the sum of squared errors divided by the degrees of freedom,
     * usually abbreviated MSE.
     * <p>
     * If there are fewer than <strong>three</strong> data pairs in the model,
     * or if there is no variation in <code>x</code>, this returns
     * <code>Double.NaN</code>.</p>
     *
     * @return sum of squared deviations of y values
     */
    public double getMeanSquareError() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55018);
        __CLR4_4_116b916b9lb90pasr.R.inc(55019);if ((((n < 3)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55020)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55021)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55022);return Double.NaN;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55023);return (((hasIntercept )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55024)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55025)==0&false))? (getSumSquaredErrors() / (n - 2)) : (getSumSquaredErrors() / (n - 1));
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns <a href="http://mathworld.wolfram.com/CorrelationCoefficient.html">
     * Pearson's product moment correlation coefficient</a>,
     * usually denoted r.
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double,NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return Pearson's r
     */
    public double getR() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55026);
        __CLR4_4_116b916b9lb90pasr.R.inc(55027);double b1 = getSlope();
        __CLR4_4_116b916b9lb90pasr.R.inc(55028);double result = FastMath.sqrt(getRSquare());
        __CLR4_4_116b916b9lb90pasr.R.inc(55029);if ((((b1 < 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55030)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55031)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55032);result = -result;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55033);return result;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/coefficient1.htm">
     * coefficient of determination</a>,
     * usually denoted r-square.
     * <p>
     * <strong>Preconditions</strong>: <ul>
     * <li>At least two observations (with at least two different x values)
     * must have been added before invoking this method. If this method is
     * invoked before a model can be estimated, <code>Double,NaN</code> is
     * returned.
     * </li></ul></p>
     *
     * @return r-square
     */
    public double getRSquare() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55034);
        __CLR4_4_116b916b9lb90pasr.R.inc(55035);double ssto = getTotalSumSquares();
        __CLR4_4_116b916b9lb90pasr.R.inc(55036);return (ssto - getSumSquaredErrors()) / ssto;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/standarderrorb0.htm">
     * standard error of the intercept estimate</a>,
     * usually denoted s(b0).
     * <p>
     * If there are fewer that <strong>three</strong> observations in the
     * model, or if there is no variation in x, this returns
     * <code>Double.NaN</code>.</p> Additionally, a <code>Double.NaN</code> is
     * returned when the intercept is constrained to be zero
     *
     * @return standard error associated with intercept estimate
     */
    public double getInterceptStdErr() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55037);
        __CLR4_4_116b916b9lb90pasr.R.inc(55038);if( (((!hasIntercept )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55039)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55040)==0&false))){{
            __CLR4_4_116b916b9lb90pasr.R.inc(55041);return Double.NaN;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55042);return FastMath.sqrt(
            getMeanSquareError() * ((1d / n) + (xbar * xbar) / sumXX));
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the <a href="http://www.xycoon.com/standerrorb(1).htm">standard
     * error of the slope estimate</a>,
     * usually denoted s(b1).
     * <p>
     * If there are fewer that <strong>three</strong> data pairs in the model,
     * or if there is no variation in x, this returns <code>Double.NaN</code>.
     * </p>
     *
     * @return standard error associated with slope estimate
     */
    public double getSlopeStdErr() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55043);
        __CLR4_4_116b916b9lb90pasr.R.inc(55044);return FastMath.sqrt(getMeanSquareError() / sumXX);
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the half-width of a 95% confidence interval for the slope
     * estimate.
     * <p>
     * The 95% confidence interval is</p>
     * <p>
     * <code>(getSlope() - getSlopeConfidenceInterval(),
     * getSlope() + getSlopeConfidenceInterval())</code></p>
     * <p>
     * If there are fewer that <strong>three</strong> observations in the
     * model, or if there is no variation in x, this returns
     * <code>Double.NaN</code>.</p>
     * <p>
     * <strong>Usage Note</strong>:<br>
     * The validity of this statistic depends on the assumption that the
     * observations included in the model are drawn from a
     * <a href="http://mathworld.wolfram.com/BivariateNormalDistribution.html">
     * Bivariate Normal Distribution</a>.</p>
     *
     * @return half-width of 95% confidence interval for the slope estimate
     * @throws OutOfRangeException if the confidence interval can not be computed.
     */
    public double getSlopeConfidenceInterval() throws OutOfRangeException {try{__CLR4_4_116b916b9lb90pasr.R.inc(55045);
        __CLR4_4_116b916b9lb90pasr.R.inc(55046);return getSlopeConfidenceInterval(0.05d);
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the half-width of a (100-100*alpha)% confidence interval for
     * the slope estimate.
     * <p>
     * The (100-100*alpha)% confidence interval is </p>
     * <p>
     * <code>(getSlope() - getSlopeConfidenceInterval(),
     * getSlope() + getSlopeConfidenceInterval())</code></p>
     * <p>
     * To request, for example, a 99% confidence interval, use
     * <code>alpha = .01</code></p>
     * <p>
     * <strong>Usage Note</strong>:<br>
     * The validity of this statistic depends on the assumption that the
     * observations included in the model are drawn from a
     * <a href="http://mathworld.wolfram.com/BivariateNormalDistribution.html">
     * Bivariate Normal Distribution</a>.</p>
     * <p>
     * <strong> Preconditions:</strong><ul>
     * <li>If there are fewer that <strong>three</strong> observations in the
     * model, or if there is no variation in x, this returns
     * <code>Double.NaN</code>.
     * </li>
     * <li><code>(0 < alpha < 1)</code>; otherwise an
     * <code>OutOfRangeException</code> is thrown.
     * </li></ul></p>
     *
     * @param alpha the desired significance level
     * @return half-width of 95% confidence interval for the slope estimate
     * @throws OutOfRangeException if the confidence interval can not be computed.
     */
    public double getSlopeConfidenceInterval(final double alpha)
    throws OutOfRangeException {try{__CLR4_4_116b916b9lb90pasr.R.inc(55047);
        __CLR4_4_116b916b9lb90pasr.R.inc(55048);if ((((n < 3)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55049)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55050)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55051);return Double.NaN;
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55052);if ((((alpha >= 1 || alpha <= 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55053)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55054)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55055);throw new OutOfRangeException(LocalizedFormats.SIGNIFICANCE_LEVEL,
                                          alpha, 0, 1);
        }
        // No advertised NotStrictlyPositiveException here - will return NaN above
        }__CLR4_4_116b916b9lb90pasr.R.inc(55056);TDistribution distribution = new TDistribution(n - 2);
        __CLR4_4_116b916b9lb90pasr.R.inc(55057);return getSlopeStdErr() *
            distribution.inverseCumulativeProbability(1d - alpha / 2d);
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Returns the significance level of the slope (equiv) correlation.
     * <p>
     * Specifically, the returned value is the smallest <code>alpha</code>
     * such that the slope confidence interval with significance level
     * equal to <code>alpha</code> does not include <code>0</code>.
     * On regression output, this is often denoted <code>Prob(|t| > 0)</code>
     * </p><p>
     * <strong>Usage Note</strong>:<br>
     * The validity of this statistic depends on the assumption that the
     * observations included in the model are drawn from a
     * <a href="http://mathworld.wolfram.com/BivariateNormalDistribution.html">
     * Bivariate Normal Distribution</a>.</p>
     * <p>
     * If there are fewer that <strong>three</strong> observations in the
     * model, or if there is no variation in x, this returns
     * <code>Double.NaN</code>.</p>
     *
     * @return significance level for slope/correlation
     * @throws org.apache.commons.math3.exception.MaxCountExceededException
     * if the significance level can not be computed.
     */
    public double getSignificance() {try{__CLR4_4_116b916b9lb90pasr.R.inc(55058);
        __CLR4_4_116b916b9lb90pasr.R.inc(55059);if ((((n < 3)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55060)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55061)==0&false))) {{
            __CLR4_4_116b916b9lb90pasr.R.inc(55062);return Double.NaN;
        }
        // No advertised NotStrictlyPositiveException here - will return NaN above
        }__CLR4_4_116b916b9lb90pasr.R.inc(55063);TDistribution distribution = new TDistribution(n - 2);
        __CLR4_4_116b916b9lb90pasr.R.inc(55064);return 2d * (1.0 - distribution.cumulativeProbability(
                    FastMath.abs(getSlope()) / getSlopeStdErr()));
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    // ---------------------Private methods-----------------------------------

    /**
    * Returns the intercept of the estimated regression line, given the slope.
    * <p>
    * Will return <code>NaN</code> if slope is <code>NaN</code>.</p>
    *
    * @param slope current slope
    * @return the intercept of the regression line
    */
    private double getIntercept(final double slope) {try{__CLR4_4_116b916b9lb90pasr.R.inc(55065);
      __CLR4_4_116b916b9lb90pasr.R.inc(55066);if( (((hasIntercept)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55067)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55068)==0&false))){{
        __CLR4_4_116b916b9lb90pasr.R.inc(55069);return (sumY - slope * sumX) / n;
      }
      }__CLR4_4_116b916b9lb90pasr.R.inc(55070);return 0.0;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Computes SSR from b1.
     *
     * @param slope regression slope estimate
     * @return sum of squared deviations of predicted y values
     */
    private double getRegressionSumSquares(final double slope) {try{__CLR4_4_116b916b9lb90pasr.R.inc(55071);
        __CLR4_4_116b916b9lb90pasr.R.inc(55072);return slope * slope * sumXX;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Performs a regression on data present in buffers and outputs a RegressionResults object.
     *
     * <p>If there are fewer than 3 observations in the model and {@code hasIntercept} is true
     * a {@code NoDataException} is thrown.  If there is no intercept term, the model must
     * contain at least 2 observations.</p>
     *
     * @return RegressionResults acts as a container of regression output
     * @throws ModelSpecificationException if the model is not correctly specified
     * @throws NoDataException if there is not sufficient data in the model to
     * estimate the regression parameters
     */
    public RegressionResults regress() throws ModelSpecificationException, NoDataException {try{__CLR4_4_116b916b9lb90pasr.R.inc(55073);
        __CLR4_4_116b916b9lb90pasr.R.inc(55074);if ((((hasIntercept)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55075)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55076)==0&false))) {{
          __CLR4_4_116b916b9lb90pasr.R.inc(55077);if( (((n < 3 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55078)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55079)==0&false))){{
              __CLR4_4_116b916b9lb90pasr.R.inc(55080);throw new NoDataException(LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION);
          }
          }__CLR4_4_116b916b9lb90pasr.R.inc(55081);if( (((FastMath.abs( sumXX ) > Precision.SAFE_MIN )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55082)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55083)==0&false))){{
              __CLR4_4_116b916b9lb90pasr.R.inc(55084);final double[] params = new double[]{ getIntercept(), getSlope() };
              __CLR4_4_116b916b9lb90pasr.R.inc(55085);final double mse = getMeanSquareError();
              __CLR4_4_116b916b9lb90pasr.R.inc(55086);final double _syy = sumYY + sumY * sumY / n;
              __CLR4_4_116b916b9lb90pasr.R.inc(55087);final double[] vcv = new double[]{
                mse * (xbar *xbar /sumXX + 1.0 / n),
                -xbar*mse/sumXX,
                mse/sumXX };
              __CLR4_4_116b916b9lb90pasr.R.inc(55088);return new RegressionResults(
                      params, new double[][]{vcv}, true, n, 2,
                      sumY, _syy, getSumSquaredErrors(),true,false);
          }}else{{
              __CLR4_4_116b916b9lb90pasr.R.inc(55089);final double[] params = new double[]{ sumY / n, Double.NaN };
              //final double mse = getMeanSquareError();
              __CLR4_4_116b916b9lb90pasr.R.inc(55090);final double[] vcv = new double[]{
                ybar / (n - 1.0),
                Double.NaN,
                Double.NaN };
              __CLR4_4_116b916b9lb90pasr.R.inc(55091);return new RegressionResults(
                      params, new double[][]{vcv}, true, n, 1,
                      sumY, sumYY, getSumSquaredErrors(),true,false);
          }
        }}}else{{
          __CLR4_4_116b916b9lb90pasr.R.inc(55092);if ((((n < 2)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55093)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55094)==0&false))) {{
              __CLR4_4_116b916b9lb90pasr.R.inc(55095);throw new NoDataException(LocalizedFormats.NOT_ENOUGH_DATA_REGRESSION);
          }
          }__CLR4_4_116b916b9lb90pasr.R.inc(55096);if( (((!Double.isNaN(sumXX) )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55097)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55098)==0&false))){{
          __CLR4_4_116b916b9lb90pasr.R.inc(55099);final double[] vcv = new double[]{ getMeanSquareError() / sumXX };
          __CLR4_4_116b916b9lb90pasr.R.inc(55100);final double[] params = new double[]{ sumXY/sumXX };
          __CLR4_4_116b916b9lb90pasr.R.inc(55101);return new RegressionResults(
                      params, new double[][]{vcv}, true, n, 1,
                      sumY, sumYY, getSumSquaredErrors(),false,false);
          }}else{{
          __CLR4_4_116b916b9lb90pasr.R.inc(55102);final double[] vcv = new double[]{Double.NaN };
          __CLR4_4_116b916b9lb90pasr.R.inc(55103);final double[] params = new double[]{ Double.NaN };
          __CLR4_4_116b916b9lb90pasr.R.inc(55104);return new RegressionResults(
                      params, new double[][]{vcv}, true, n, 1,
                      Double.NaN, Double.NaN, Double.NaN,false,false);
          }
        }}
    }}finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}

    /**
     * Performs a regression on data present in buffers including only regressors
     * indexed in variablesToInclude and outputs a RegressionResults object
     * @param variablesToInclude an array of indices of regressors to include
     * @return RegressionResults acts as a container of regression output
     * @throws MathIllegalArgumentException if the variablesToInclude array is null or zero length
     * @throws OutOfRangeException if a requested variable is not present in model
     */
    public RegressionResults regress(int[] variablesToInclude) throws MathIllegalArgumentException{try{__CLR4_4_116b916b9lb90pasr.R.inc(55105);
        __CLR4_4_116b916b9lb90pasr.R.inc(55106);if( (((variablesToInclude == null || variablesToInclude.length == 0)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55107)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55108)==0&false))){{
          __CLR4_4_116b916b9lb90pasr.R.inc(55109);throw new MathIllegalArgumentException(LocalizedFormats.ARRAY_ZERO_LENGTH_OR_NULL_NOT_ALLOWED);
        }
        }__CLR4_4_116b916b9lb90pasr.R.inc(55110);if( (((variablesToInclude.length > 2 || (variablesToInclude.length > 1 && !hasIntercept) )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55111)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55112)==0&false))){{
            __CLR4_4_116b916b9lb90pasr.R.inc(55113);throw new ModelSpecificationException(
                    LocalizedFormats.ARRAY_SIZE_EXCEEDS_MAX_VARIABLES,
                    ((((variablesToInclude.length > 1 && !hasIntercept) )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55114)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55115)==0&false))? 1 : 2);
        }

        }__CLR4_4_116b916b9lb90pasr.R.inc(55116);if( (((hasIntercept )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55117)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55118)==0&false))){{
            __CLR4_4_116b916b9lb90pasr.R.inc(55119);if( (((variablesToInclude.length == 2 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55120)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55121)==0&false))){{
                __CLR4_4_116b916b9lb90pasr.R.inc(55122);if( (((variablesToInclude[0] == 1 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55123)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55124)==0&false))){{
                    __CLR4_4_116b916b9lb90pasr.R.inc(55125);throw new ModelSpecificationException(LocalizedFormats.NOT_INCREASING_SEQUENCE);
                }}else {__CLR4_4_116b916b9lb90pasr.R.inc(55126);if( (((variablesToInclude[0] != 0 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55127)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55128)==0&false))){{
                    __CLR4_4_116b916b9lb90pasr.R.inc(55129);throw new OutOfRangeException( variablesToInclude[0], 0,1 );
                }
                }}__CLR4_4_116b916b9lb90pasr.R.inc(55130);if( (((variablesToInclude[1] != 1)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55131)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55132)==0&false))){{
                     __CLR4_4_116b916b9lb90pasr.R.inc(55133);throw new OutOfRangeException( variablesToInclude[0], 0,1 );
                }
                }__CLR4_4_116b916b9lb90pasr.R.inc(55134);return regress();
            }}else{{
                __CLR4_4_116b916b9lb90pasr.R.inc(55135);if( (((variablesToInclude[0] != 1 && variablesToInclude[0] != 0 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55136)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55137)==0&false))){{
                     __CLR4_4_116b916b9lb90pasr.R.inc(55138);throw new OutOfRangeException( variablesToInclude[0],0,1 );
                }
                }__CLR4_4_116b916b9lb90pasr.R.inc(55139);final double _mean = sumY * sumY / n;
                __CLR4_4_116b916b9lb90pasr.R.inc(55140);final double _syy = sumYY + _mean;
                __CLR4_4_116b916b9lb90pasr.R.inc(55141);if( (((variablesToInclude[0] == 0 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55142)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55143)==0&false))){{
                    //just the mean
                    __CLR4_4_116b916b9lb90pasr.R.inc(55144);final double[] vcv = new double[]{ sumYY/(((n-1)*n)) };
                    __CLR4_4_116b916b9lb90pasr.R.inc(55145);final double[] params = new double[]{ ybar };
                    __CLR4_4_116b916b9lb90pasr.R.inc(55146);return new RegressionResults(
                      params, new double[][]{vcv}, true, n, 1,
                      sumY, _syy+_mean, sumYY,true,false);

                }}else {__CLR4_4_116b916b9lb90pasr.R.inc(55147);if( (((variablesToInclude[0] == 1)&&(__CLR4_4_116b916b9lb90pasr.R.iget(55148)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55149)==0&false))){{
                    //final double _syy = sumYY + sumY * sumY / ((double) n);
                    __CLR4_4_116b916b9lb90pasr.R.inc(55150);final double _sxx = sumXX + sumX * sumX / n;
                    __CLR4_4_116b916b9lb90pasr.R.inc(55151);final double _sxy = sumXY + sumX * sumY / n;
                    __CLR4_4_116b916b9lb90pasr.R.inc(55152);final double _sse = FastMath.max(0d, _syy - _sxy * _sxy / _sxx);
                    __CLR4_4_116b916b9lb90pasr.R.inc(55153);final double _mse = _sse/((n-1));
                    __CLR4_4_116b916b9lb90pasr.R.inc(55154);if( (((!Double.isNaN(_sxx) )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55155)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55156)==0&false))){{
                        __CLR4_4_116b916b9lb90pasr.R.inc(55157);final double[] vcv = new double[]{ _mse / _sxx };
                        __CLR4_4_116b916b9lb90pasr.R.inc(55158);final double[] params = new double[]{ _sxy/_sxx };
                        __CLR4_4_116b916b9lb90pasr.R.inc(55159);return new RegressionResults(
                                    params, new double[][]{vcv}, true, n, 1,
                                    sumY, _syy, _sse,false,false);
                    }}else{{
                        __CLR4_4_116b916b9lb90pasr.R.inc(55160);final double[] vcv = new double[]{Double.NaN };
                        __CLR4_4_116b916b9lb90pasr.R.inc(55161);final double[] params = new double[]{ Double.NaN };
                        __CLR4_4_116b916b9lb90pasr.R.inc(55162);return new RegressionResults(
                                    params, new double[][]{vcv}, true, n, 1,
                                    Double.NaN, Double.NaN, Double.NaN,false,false);
                    }
                }}
            }}}
        }}}else{{
            __CLR4_4_116b916b9lb90pasr.R.inc(55163);if( (((variablesToInclude[0] != 0 )&&(__CLR4_4_116b916b9lb90pasr.R.iget(55164)!=0|true))||(__CLR4_4_116b916b9lb90pasr.R.iget(55165)==0&false))){{
                __CLR4_4_116b916b9lb90pasr.R.inc(55166);throw new OutOfRangeException(variablesToInclude[0],0,0);
            }
            }__CLR4_4_116b916b9lb90pasr.R.inc(55167);return regress();
        }

        }__CLR4_4_116b916b9lb90pasr.R.inc(55168);return null;
    }finally{__CLR4_4_116b916b9lb90pasr.R.flushNeeded();}}
}
