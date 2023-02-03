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

import java.util.Arrays;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class is a concrete implementation of the {@link UpdatingMultipleLinearRegression} interface.
 *
 * <p>The algorithm is described in: <pre>
 * Algorithm AS 274: Least Squares Routines to Supplement Those of Gentleman
 * Author(s): Alan J. Miller
 * Source: Journal of the Royal Statistical Society.
 * Series C (Applied Statistics), Vol. 41, No. 2
 * (1992), pp. 458-478
 * Published by: Blackwell Publishing for the Royal Statistical Society
 * Stable URL: http://www.jstor.org/stable/2347583 </pre></p>
 *
 * <p>This method for multiple regression forms the solution to the OLS problem
 * by updating the QR decomposition as described by Gentleman.</p>
 *
 * @version $Id$
 * @since 3.0
 */
public class MillerUpdatingRegression implements UpdatingMultipleLinearRegression {public static class __CLR4_4_115jf15jflb90parz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,54636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** number of variables in regression */
    private final int nvars;
    /** diagonals of cross products matrix */
    private final double[] d;
    /** the elements of the R`Y */
    private final double[] rhs;
    /** the off diagonal portion of the R matrix */
    private final double[] r;
    /** the tolerance for each of the variables */
    private final double[] tol;
    /** residual sum of squares for all nested regressions */
    private final double[] rss;
    /** order of the regressors */
    private final int[] vorder;
    /** scratch space for tolerance calc */
    private final double[] work_tolset;
    /** number of observations entered */
    private long nobs = 0;
    /** sum of squared errors of largest regression */
    private double sserr = 0.0;
    /** has rss been called? */
    private boolean rss_set = false;
    /** has the tolerance setting method been called */
    private boolean tol_set = false;
    /** flags for variables with linear dependency problems */
    private final boolean[] lindep;
    /** singular x values */
    private final double[] x_sing;
    /** workspace for singularity method */
    private final double[] work_sing;
    /** summation of Y variable */
    private double sumy = 0.0;
    /** summation of squared Y values */
    private double sumsqy = 0.0;
    /** boolean flag whether a regression constant is added */
    private boolean hasIntercept;
    /** zero tolerance */
    private final double epsilon;
    /**
     *  Set the default constructor to private access
     *  to prevent inadvertent instantiation
     */
    @SuppressWarnings("unused")
    private MillerUpdatingRegression() {
        this(-1, false, Double.NaN);__CLR4_4_115jf15jflb90parz.R.inc(53836);try{__CLR4_4_115jf15jflb90parz.R.inc(53835);
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * This is the augmented constructor for the MillerUpdatingRegression class.
     *
     * @param numberOfVariables number of regressors to expect, not including constant
     * @param includeConstant include a constant automatically
     * @param errorTolerance  zero tolerance, how machine zero is determined
     * @throws ModelSpecificationException if {@code numberOfVariables is less than 1}
     */
    public MillerUpdatingRegression(int numberOfVariables, boolean includeConstant, double errorTolerance)
    throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(53837);
        __CLR4_4_115jf15jflb90parz.R.inc(53838);if ((((numberOfVariables < 1)&&(__CLR4_4_115jf15jflb90parz.R.iget(53839)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53840)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53841);throw new ModelSpecificationException(LocalizedFormats.NO_REGRESSORS);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53842);if ((((includeConstant)&&(__CLR4_4_115jf15jflb90parz.R.iget(53843)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53844)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53845);this.nvars = numberOfVariables + 1;
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(53846);this.nvars = numberOfVariables;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53847);this.hasIntercept = includeConstant;
        __CLR4_4_115jf15jflb90parz.R.inc(53848);this.nobs = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(53849);this.d = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53850);this.rhs = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53851);this.r = new double[this.nvars * (this.nvars - 1) / 2];
        __CLR4_4_115jf15jflb90parz.R.inc(53852);this.tol = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53853);this.rss = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53854);this.vorder = new int[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53855);this.x_sing = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53856);this.work_sing = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53857);this.work_tolset = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53858);this.lindep = new boolean[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(53859);for (int i = 0; (((i < this.nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(53860)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53861)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53862);vorder[i] = i;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53863);if ((((errorTolerance > 0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53864)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53865)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53866);this.epsilon = errorTolerance;
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(53867);this.epsilon = -errorTolerance;
        }
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Primary constructor for the MillerUpdatingRegression.
     *
     * @param numberOfVariables maximum number of potential regressors
     * @param includeConstant include a constant automatically
     * @throws ModelSpecificationException if {@code numberOfVariables is less than 1}
     */
    public MillerUpdatingRegression(int numberOfVariables, boolean includeConstant)
    throws ModelSpecificationException {
        this(numberOfVariables, includeConstant, Precision.EPSILON);__CLR4_4_115jf15jflb90parz.R.inc(53869);try{__CLR4_4_115jf15jflb90parz.R.inc(53868);
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * A getter method which determines whether a constant is included.
     * @return true regression has an intercept, false no intercept
     */
    public boolean hasIntercept() {try{__CLR4_4_115jf15jflb90parz.R.inc(53870);
        __CLR4_4_115jf15jflb90parz.R.inc(53871);return this.hasIntercept;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Gets the number of observations added to the regression model.
     * @return number of observations
     */
    public long getN() {try{__CLR4_4_115jf15jflb90parz.R.inc(53872);
        __CLR4_4_115jf15jflb90parz.R.inc(53873);return this.nobs;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Adds an observation to the regression model.
     * @param x the array with regressor values
     * @param y  the value of dependent variable given these regressors
     * @exception ModelSpecificationException if the length of {@code x} does not equal
     * the number of independent variables in the model
     */
    public void addObservation(final double[] x, final double y)
    throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(53874);

        __CLR4_4_115jf15jflb90parz.R.inc(53875);if (((((!this.hasIntercept && x.length != nvars) ||
               (this.hasIntercept && x.length + 1 != nvars))&&(__CLR4_4_115jf15jflb90parz.R.iget(53876)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53877)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53878);throw new ModelSpecificationException(LocalizedFormats.INVALID_REGRESSION_OBSERVATION,
                    x.length, nvars);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53879);if ((((!this.hasIntercept)&&(__CLR4_4_115jf15jflb90parz.R.iget(53880)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53881)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53882);include(MathArrays.copyOf(x, x.length), 1.0, y);
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(53883);final double[] tmp = new double[x.length + 1];
            __CLR4_4_115jf15jflb90parz.R.inc(53884);System.arraycopy(x, 0, tmp, 1, x.length);
            __CLR4_4_115jf15jflb90parz.R.inc(53885);tmp[0] = 1.0;
            __CLR4_4_115jf15jflb90parz.R.inc(53886);include(tmp, 1.0, y);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53887);++nobs;

    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Adds multiple observations to the model.
     * @param x observations on the regressors
     * @param y observations on the regressand
     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match
     * the length of {@code y} or does not contain sufficient data to estimate the model
     */
    public void addObservations(double[][] x, double[] y) throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(53888);
        __CLR4_4_115jf15jflb90parz.R.inc(53889);if (((((x == null) || (y == null) || (x.length != y.length))&&(__CLR4_4_115jf15jflb90parz.R.iget(53890)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53891)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53892);throw new ModelSpecificationException(
                  LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE,
                  ((((x == null) )&&(__CLR4_4_115jf15jflb90parz.R.iget(53893)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53894)==0&false))? 0 : x.length,
                  ((((y == null) )&&(__CLR4_4_115jf15jflb90parz.R.iget(53895)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53896)==0&false))? 0 : y.length);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53897);if ((((x.length == 0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53898)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53899)==0&false))) {{  // Must be no y data either
            __CLR4_4_115jf15jflb90parz.R.inc(53900);throw new ModelSpecificationException(
                    LocalizedFormats.NO_DATA);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53901);if ((((x[0].length + 1 > x.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(53902)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53903)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53904);throw new ModelSpecificationException(
                  LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS,
                  x.length, x[0].length);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(53905);for (int i = 0; (((i < x.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(53906)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53907)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53908);addObservation(x[i], y[i]);
        }
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * The include method is where the QR decomposition occurs. This statement forms all
     * intermediate data which will be used for all derivative measures.
     * According to the miller paper, note that in the original implementation the x vector
     * is overwritten. In this implementation, the include method is passed a copy of the
     * original data vector so that there is no contamination of the data. Additionally,
     * this method differs slightly from Gentleman's method, in that the assumption is
     * of dense design matrices, there is some advantage in using the original gentleman algorithm
     * on sparse matrices.
     *
     * @param x observations on the regressors
     * @param wi weight of the this observation (-1,1)
     * @param yi observation on the regressand
     */
    private void include(final double[] x, final double wi, final double yi) {try{__CLR4_4_115jf15jflb90parz.R.inc(53909);
        __CLR4_4_115jf15jflb90parz.R.inc(53910);int nextr = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(53911);double w = wi;
        __CLR4_4_115jf15jflb90parz.R.inc(53912);double y = yi;
        __CLR4_4_115jf15jflb90parz.R.inc(53913);double xi;
        __CLR4_4_115jf15jflb90parz.R.inc(53914);double di;
        __CLR4_4_115jf15jflb90parz.R.inc(53915);double wxi;
        __CLR4_4_115jf15jflb90parz.R.inc(53916);double dpi;
        __CLR4_4_115jf15jflb90parz.R.inc(53917);double xk;
        __CLR4_4_115jf15jflb90parz.R.inc(53918);double _w;
        __CLR4_4_115jf15jflb90parz.R.inc(53919);this.rss_set = false;
        __CLR4_4_115jf15jflb90parz.R.inc(53920);sumy = smartAdd(yi, sumy);
        __CLR4_4_115jf15jflb90parz.R.inc(53921);sumsqy = smartAdd(sumsqy, yi * yi);
        __CLR4_4_115jf15jflb90parz.R.inc(53922);for (int i = 0; (((i < x.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(53923)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53924)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53925);if ((((w == 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53926)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53927)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53928);return;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(53929);xi = x[i];

            __CLR4_4_115jf15jflb90parz.R.inc(53930);if ((((xi == 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53931)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53932)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53933);nextr += nvars - i - 1;
                __CLR4_4_115jf15jflb90parz.R.inc(53934);continue;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(53935);di = d[i];
            __CLR4_4_115jf15jflb90parz.R.inc(53936);wxi = w * xi;
            __CLR4_4_115jf15jflb90parz.R.inc(53937);_w = w;
            __CLR4_4_115jf15jflb90parz.R.inc(53938);if ((((di != 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53939)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53940)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53941);dpi = smartAdd(di, wxi * xi);
                __CLR4_4_115jf15jflb90parz.R.inc(53942);final double tmp = wxi * xi / di;
                __CLR4_4_115jf15jflb90parz.R.inc(53943);if ((((FastMath.abs(tmp) > Precision.EPSILON)&&(__CLR4_4_115jf15jflb90parz.R.iget(53944)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53945)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(53946);w = (di * w) / dpi;
                }
            }} }else {{
                __CLR4_4_115jf15jflb90parz.R.inc(53947);dpi = wxi * xi;
                __CLR4_4_115jf15jflb90parz.R.inc(53948);w = 0.0;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(53949);d[i] = dpi;
            __CLR4_4_115jf15jflb90parz.R.inc(53950);for (int k = i + 1; (((k < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(53951)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53952)==0&false)); k++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53953);xk = x[k];
                __CLR4_4_115jf15jflb90parz.R.inc(53954);x[k] = smartAdd(xk, -xi * r[nextr]);
                __CLR4_4_115jf15jflb90parz.R.inc(53955);if ((((di != 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53956)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53957)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(53958);r[nextr] = smartAdd(di * r[nextr], (_w * xi) * xk) / dpi;
                } }else {{
                    __CLR4_4_115jf15jflb90parz.R.inc(53959);r[nextr] = xk / xi;
                }
                }__CLR4_4_115jf15jflb90parz.R.inc(53960);++nextr;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(53961);xk = y;
            __CLR4_4_115jf15jflb90parz.R.inc(53962);y = smartAdd(xk, -xi * rhs[i]);
            __CLR4_4_115jf15jflb90parz.R.inc(53963);if ((((di != 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(53964)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53965)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53966);rhs[i] = smartAdd(di * rhs[i], wxi * xk) / dpi;
            } }else {{
                __CLR4_4_115jf15jflb90parz.R.inc(53967);rhs[i] = xk / xi;
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(53968);sserr = smartAdd(sserr, w * y * y);
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Adds to number a and b such that the contamination due to
     * numerical smallness of one addend does not corrupt the sum.
     * @param a - an addend
     * @param b - an addend
     * @return the sum of the a and b
     */
    private double smartAdd(double a, double b) {try{__CLR4_4_115jf15jflb90parz.R.inc(53969);
        __CLR4_4_115jf15jflb90parz.R.inc(53970);final double _a = FastMath.abs(a);
        __CLR4_4_115jf15jflb90parz.R.inc(53971);final double _b = FastMath.abs(b);
        __CLR4_4_115jf15jflb90parz.R.inc(53972);if ((((_a > _b)&&(__CLR4_4_115jf15jflb90parz.R.iget(53973)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53974)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(53975);final double eps = _a * Precision.EPSILON;
            __CLR4_4_115jf15jflb90parz.R.inc(53976);if ((((_b > eps)&&(__CLR4_4_115jf15jflb90parz.R.iget(53977)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53978)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53979);return a + b;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(53980);return a;
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(53981);final double eps = _b * Precision.EPSILON;
            __CLR4_4_115jf15jflb90parz.R.inc(53982);if ((((_a > eps)&&(__CLR4_4_115jf15jflb90parz.R.iget(53983)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53984)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(53985);return a + b;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(53986);return b;
        }
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * As the name suggests,  clear wipes the internals and reorders everything in the
     * canonical order.
     */
    public void clear() {try{__CLR4_4_115jf15jflb90parz.R.inc(53987);
        __CLR4_4_115jf15jflb90parz.R.inc(53988);Arrays.fill(this.d, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53989);Arrays.fill(this.rhs, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53990);Arrays.fill(this.r, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53991);Arrays.fill(this.tol, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53992);Arrays.fill(this.rss, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53993);Arrays.fill(this.work_tolset, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53994);Arrays.fill(this.work_sing, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53995);Arrays.fill(this.x_sing, 0.0);
        __CLR4_4_115jf15jflb90parz.R.inc(53996);Arrays.fill(this.lindep, false);
        __CLR4_4_115jf15jflb90parz.R.inc(53997);for (int i = 0; (((i < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(53998)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(53999)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54000);this.vorder[i] = i;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54001);this.nobs = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54002);this.sserr = 0.0;
        __CLR4_4_115jf15jflb90parz.R.inc(54003);this.sumy = 0.0;
        __CLR4_4_115jf15jflb90parz.R.inc(54004);this.sumsqy = 0.0;
        __CLR4_4_115jf15jflb90parz.R.inc(54005);this.rss_set = false;
        __CLR4_4_115jf15jflb90parz.R.inc(54006);this.tol_set = false;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * This sets up tolerances for singularity testing.
     */
    private void tolset() {try{__CLR4_4_115jf15jflb90parz.R.inc(54007);
        __CLR4_4_115jf15jflb90parz.R.inc(54008);int pos;
        __CLR4_4_115jf15jflb90parz.R.inc(54009);double total;
        __CLR4_4_115jf15jflb90parz.R.inc(54010);final double eps = this.epsilon;
        __CLR4_4_115jf15jflb90parz.R.inc(54011);for (int i = 0; (((i < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54012)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54013)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54014);this.work_tolset[i] = Math.sqrt(d[i]);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54015);tol[0] = eps * this.work_tolset[0];
        __CLR4_4_115jf15jflb90parz.R.inc(54016);for (int col = 1; (((col < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54017)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54018)==0&false)); col++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54019);pos = col - 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54020);total = work_tolset[col];
            __CLR4_4_115jf15jflb90parz.R.inc(54021);for (int row = 0; (((row < col)&&(__CLR4_4_115jf15jflb90parz.R.iget(54022)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54023)==0&false)); row++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54024);total += Math.abs(r[pos]) * work_tolset[row];
                __CLR4_4_115jf15jflb90parz.R.inc(54025);pos += nvars - row - 2;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(54026);tol[col] = eps * total;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54027);tol_set = true;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * The regcf method conducts the linear regression and extracts the
     * parameter vector. Notice that the algorithm can do subset regression
     * with no alteration.
     *
     * @param nreq how many of the regressors to include (either in canonical
     * order, or in the current reordered state)
     * @return an array with the estimated slope coefficients
     * @throws ModelSpecificationException if {@code nreq} is less than 1
     * or greater than the number of independent variables
     */
    private double[] regcf(int nreq) throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(54028);
        __CLR4_4_115jf15jflb90parz.R.inc(54029);int nextr;
        __CLR4_4_115jf15jflb90parz.R.inc(54030);if ((((nreq < 1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54031)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54032)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54033);throw new ModelSpecificationException(LocalizedFormats.NO_REGRESSORS);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54034);if ((((nreq > this.nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54035)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54036)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54037);throw new ModelSpecificationException(
                    LocalizedFormats.TOO_MANY_REGRESSORS, nreq, this.nvars);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54038);if ((((!this.tol_set)&&(__CLR4_4_115jf15jflb90parz.R.iget(54039)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54040)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54041);tolset();
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54042);final double[] ret = new double[nreq];
        __CLR4_4_115jf15jflb90parz.R.inc(54043);boolean rankProblem = false;
        __CLR4_4_115jf15jflb90parz.R.inc(54044);for (int i = nreq - 1; (((i > -1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54045)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54046)==0&false)); i--) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54047);if ((((Math.sqrt(d[i]) < tol[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54048)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54049)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54050);ret[i] = 0.0;
                __CLR4_4_115jf15jflb90parz.R.inc(54051);d[i] = 0.0;
                __CLR4_4_115jf15jflb90parz.R.inc(54052);rankProblem = true;
            } }else {{
                __CLR4_4_115jf15jflb90parz.R.inc(54053);ret[i] = rhs[i];
                __CLR4_4_115jf15jflb90parz.R.inc(54054);nextr = i * (nvars + nvars - i - 1) / 2;
                __CLR4_4_115jf15jflb90parz.R.inc(54055);for (int j = i + 1; (((j < nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54056)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54057)==0&false)); j++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54058);ret[i] = smartAdd(ret[i], -r[nextr] * ret[j]);
                    __CLR4_4_115jf15jflb90parz.R.inc(54059);++nextr;
                }
            }}
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54060);if ((((rankProblem)&&(__CLR4_4_115jf15jflb90parz.R.iget(54061)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54062)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54063);for (int i = 0; (((i < nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54064)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54065)==0&false)); i++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54066);if ((((this.lindep[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54067)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54068)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54069);ret[i] = Double.NaN;
                }
            }}
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54070);return ret;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * The method which checks for singularities and then eliminates the offending
     * columns.
     */
    private void singcheck() {try{__CLR4_4_115jf15jflb90parz.R.inc(54071);
        __CLR4_4_115jf15jflb90parz.R.inc(54072);int pos;
        __CLR4_4_115jf15jflb90parz.R.inc(54073);for (int i = 0; (((i < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54074)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54075)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54076);work_sing[i] = Math.sqrt(d[i]);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54077);for (int col = 0; (((col < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54078)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54079)==0&false)); col++) {{
            // Set elements within R to zero if they are less than tol(col) in
            // absolute value after being scaled by the square root of their row
            // multiplier
            __CLR4_4_115jf15jflb90parz.R.inc(54080);final double temp = tol[col];
            __CLR4_4_115jf15jflb90parz.R.inc(54081);pos = col - 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54082);for (int row = 0; (((row < col - 1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54083)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54084)==0&false)); row++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54085);if ((((Math.abs(r[pos]) * work_sing[row] < temp)&&(__CLR4_4_115jf15jflb90parz.R.iget(54086)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54087)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54088);r[pos] = 0.0;
                }
                }__CLR4_4_115jf15jflb90parz.R.inc(54089);pos += nvars - row - 2;
            }
            // If diagonal element is near zero, set it to zero, set appropriate
            // element of LINDEP, and use INCLUD to augment the projections in
            // the lower rows of the orthogonalization.
            }__CLR4_4_115jf15jflb90parz.R.inc(54090);lindep[col] = false;
            __CLR4_4_115jf15jflb90parz.R.inc(54091);if ((((work_sing[col] < temp)&&(__CLR4_4_115jf15jflb90parz.R.iget(54092)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54093)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54094);lindep[col] = true;
                __CLR4_4_115jf15jflb90parz.R.inc(54095);if ((((col < nvars - 1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54096)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54097)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54098);Arrays.fill(x_sing, 0.0);
                    __CLR4_4_115jf15jflb90parz.R.inc(54099);int _pi = col * (nvars + nvars - col - 1) / 2;
                    __CLR4_4_115jf15jflb90parz.R.inc(54100);for (int _xi = col + 1; (((_xi < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54101)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54102)==0&false)); _xi++, _pi++) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54103);x_sing[_xi] = r[_pi];
                        __CLR4_4_115jf15jflb90parz.R.inc(54104);r[_pi] = 0.0;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54105);final double y = rhs[col];
                    __CLR4_4_115jf15jflb90parz.R.inc(54106);final double weight = d[col];
                    __CLR4_4_115jf15jflb90parz.R.inc(54107);d[col] = 0.0;
                    __CLR4_4_115jf15jflb90parz.R.inc(54108);rhs[col] = 0.0;
                    __CLR4_4_115jf15jflb90parz.R.inc(54109);this.include(x_sing, weight, y);
                } }else {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54110);sserr += d[col] * rhs[col] * rhs[col];
                }
            }}
        }}
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Calculates the sum of squared errors for the full regression
     * and all subsets in the following manner: <pre>
     * rss[] ={
     * ResidualSumOfSquares_allNvars,
     * ResidualSumOfSquares_FirstNvars-1,
     * ResidualSumOfSquares_FirstNvars-2,
     * ..., ResidualSumOfSquares_FirstVariable} </pre>
     */
    private void ss() {try{__CLR4_4_115jf15jflb90parz.R.inc(54111);
        __CLR4_4_115jf15jflb90parz.R.inc(54112);double total = sserr;
        __CLR4_4_115jf15jflb90parz.R.inc(54113);rss[nvars - 1] = sserr;
        __CLR4_4_115jf15jflb90parz.R.inc(54114);for (int i = nvars - 1; (((i > 0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54115)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54116)==0&false)); i--) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54117);total += d[i] * rhs[i] * rhs[i];
            __CLR4_4_115jf15jflb90parz.R.inc(54118);rss[i - 1] = total;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54119);rss_set = true;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Calculates the cov matrix assuming only the first nreq variables are
     * included in the calculation. The returned array contains a symmetric
     * matrix stored in lower triangular form. The matrix will have
     * ( nreq + 1 ) * nreq / 2 elements. For illustration <pre>
     * cov =
     * {
     *  cov_00,
     *  cov_10, cov_11,
     *  cov_20, cov_21, cov22,
     *  ...
     * } </pre>
     *
     * @param nreq how many of the regressors to include (either in canonical
     * order, or in the current reordered state)
     * @return an array with the variance covariance of the included
     * regressors in lower triangular form
     */
    private double[] cov(int nreq) {try{__CLR4_4_115jf15jflb90parz.R.inc(54120);
        __CLR4_4_115jf15jflb90parz.R.inc(54121);if ((((this.nobs <= nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54122)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54123)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54124);return null;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54125);double rnk = 0.0;
        __CLR4_4_115jf15jflb90parz.R.inc(54126);for (int i = 0; (((i < nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54127)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54128)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54129);if ((((!this.lindep[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54130)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54131)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54132);rnk += 1.0;
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54133);final double var = rss[nreq - 1] / (nobs - rnk);
        __CLR4_4_115jf15jflb90parz.R.inc(54134);final double[] rinv = new double[nreq * (nreq - 1) / 2];
        __CLR4_4_115jf15jflb90parz.R.inc(54135);inverse(rinv, nreq);
        __CLR4_4_115jf15jflb90parz.R.inc(54136);final double[] covmat = new double[nreq * (nreq + 1) / 2];
        __CLR4_4_115jf15jflb90parz.R.inc(54137);Arrays.fill(covmat, Double.NaN);
        __CLR4_4_115jf15jflb90parz.R.inc(54138);int pos2;
        __CLR4_4_115jf15jflb90parz.R.inc(54139);int pos1;
        __CLR4_4_115jf15jflb90parz.R.inc(54140);int start = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54141);double total = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54142);for (int row = 0; (((row < nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54143)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54144)==0&false)); row++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54145);pos2 = start;
            __CLR4_4_115jf15jflb90parz.R.inc(54146);if ((((!this.lindep[row])&&(__CLR4_4_115jf15jflb90parz.R.iget(54147)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54148)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54149);for (int col = row; (((col < nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54150)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54151)==0&false)); col++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54152);if ((((!this.lindep[col])&&(__CLR4_4_115jf15jflb90parz.R.iget(54153)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54154)==0&false))) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54155);pos1 = start + col - row;
                        __CLR4_4_115jf15jflb90parz.R.inc(54156);if ((((row == col)&&(__CLR4_4_115jf15jflb90parz.R.iget(54157)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54158)==0&false))) {{
                            __CLR4_4_115jf15jflb90parz.R.inc(54159);total = 1.0 / d[col];
                        } }else {{
                            __CLR4_4_115jf15jflb90parz.R.inc(54160);total = rinv[pos1 - 1] / d[col];
                        }
                        }__CLR4_4_115jf15jflb90parz.R.inc(54161);for (int k = col + 1; (((k < nreq)&&(__CLR4_4_115jf15jflb90parz.R.iget(54162)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54163)==0&false)); k++) {{
                            __CLR4_4_115jf15jflb90parz.R.inc(54164);if ((((!this.lindep[k])&&(__CLR4_4_115jf15jflb90parz.R.iget(54165)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54166)==0&false))) {{
                                __CLR4_4_115jf15jflb90parz.R.inc(54167);total += rinv[pos1] * rinv[pos2] / d[k];
                            }
                            }__CLR4_4_115jf15jflb90parz.R.inc(54168);++pos1;
                            __CLR4_4_115jf15jflb90parz.R.inc(54169);++pos2;
                        }
                        }__CLR4_4_115jf15jflb90parz.R.inc(54170);covmat[ (col + 1) * col / 2 + row] = total * var;
                    } }else {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54171);pos2 += nreq - col - 1;
                    }
                }}
            }}
            }__CLR4_4_115jf15jflb90parz.R.inc(54172);start += nreq - row - 1;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54173);return covmat;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * This internal method calculates the inverse of the upper-triangular portion
     * of the R matrix.
     * @param rinv  the storage for the inverse of r
     * @param nreq how many of the regressors to include (either in canonical
     * order, or in the current reordered state)
     */
    private void inverse(double[] rinv, int nreq) {try{__CLR4_4_115jf15jflb90parz.R.inc(54174);
        __CLR4_4_115jf15jflb90parz.R.inc(54175);int pos = nreq * (nreq - 1) / 2 - 1;
        __CLR4_4_115jf15jflb90parz.R.inc(54176);int pos1 = -1;
        __CLR4_4_115jf15jflb90parz.R.inc(54177);int pos2 = -1;
        __CLR4_4_115jf15jflb90parz.R.inc(54178);double total = 0.0;
        __CLR4_4_115jf15jflb90parz.R.inc(54179);Arrays.fill(rinv, Double.NaN);
        __CLR4_4_115jf15jflb90parz.R.inc(54180);for (int row = nreq - 1; (((row > 0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54181)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54182)==0&false)); --row) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54183);if ((((!this.lindep[row])&&(__CLR4_4_115jf15jflb90parz.R.iget(54184)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54185)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54186);final int start = (row - 1) * (nvars + nvars - row) / 2;
                __CLR4_4_115jf15jflb90parz.R.inc(54187);for (int col = nreq; (((col > row)&&(__CLR4_4_115jf15jflb90parz.R.iget(54188)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54189)==0&false)); --col) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54190);pos1 = start;
                    __CLR4_4_115jf15jflb90parz.R.inc(54191);pos2 = pos;
                    __CLR4_4_115jf15jflb90parz.R.inc(54192);total = 0.0;
                    __CLR4_4_115jf15jflb90parz.R.inc(54193);for (int k = row; (((k < col - 1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54194)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54195)==0&false)); k++) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54196);pos2 += nreq - k - 1;
                        __CLR4_4_115jf15jflb90parz.R.inc(54197);if ((((!this.lindep[k])&&(__CLR4_4_115jf15jflb90parz.R.iget(54198)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54199)==0&false))) {{
                            __CLR4_4_115jf15jflb90parz.R.inc(54200);total += -r[pos1] * rinv[pos2];
                        }
                        }__CLR4_4_115jf15jflb90parz.R.inc(54201);++pos1;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54202);rinv[pos] = total - r[pos1];
                    __CLR4_4_115jf15jflb90parz.R.inc(54203);--pos;
                }
            }} }else {{
                __CLR4_4_115jf15jflb90parz.R.inc(54204);pos -= nreq - row;
            }
        }}
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * In the original algorithm only the partial correlations of the regressors
     * is returned to the user. In this implementation, we have <pre>
     * corr =
     * {
     *   corrxx - lower triangular
     *   corrxy - bottom row of the matrix
     * }
     * Replaces subroutines PCORR and COR of:
     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2 </pre>
     *
     * <p>Calculate partial correlations after the variables in rows
     * 1, 2, ..., IN have been forced into the regression.
     * If IN = 1, and the first row of R represents a constant in the
     * model, then the usual simple correlations are returned.</p>
     *
     * <p>If IN = 0, the value returned in array CORMAT for the correlation
     * of variables Xi & Xj is: <pre>
     * sum ( Xi.Xj ) / Sqrt ( sum (Xi^2) . sum (Xj^2) )</pre></p>
     *
     * <p>On return, array CORMAT contains the upper triangle of the matrix of
     * partial correlations stored by rows, excluding the 1's on the diagonal.
     * e.g. if IN = 2, the consecutive elements returned are:
     * (3,4) (3,5) ... (3,ncol), (4,5) (4,6) ... (4,ncol), etc.
     * Array YCORR stores the partial correlations with the Y-variable
     * starting with YCORR(IN+1) = partial correlation with the variable in
     * position (IN+1). </p>
     *
     * @param in how many of the regressors to include (either in canonical
     * order, or in the current reordered state)
     * @return an array with the partial correlations of the remainder of
     * regressors with each other and the regressand, in lower triangular form
     */
    public double[] getPartialCorrelations(int in) {try{__CLR4_4_115jf15jflb90parz.R.inc(54205);
        __CLR4_4_115jf15jflb90parz.R.inc(54206);final double[] output = new double[(nvars - in + 1) * (nvars - in) / 2];
        __CLR4_4_115jf15jflb90parz.R.inc(54207);int pos;
        __CLR4_4_115jf15jflb90parz.R.inc(54208);int pos1;
        __CLR4_4_115jf15jflb90parz.R.inc(54209);int pos2;
        __CLR4_4_115jf15jflb90parz.R.inc(54210);final int rms_off = -in;
        __CLR4_4_115jf15jflb90parz.R.inc(54211);final int wrk_off = -(in + 1);
        __CLR4_4_115jf15jflb90parz.R.inc(54212);final double[] rms = new double[nvars - in];
        __CLR4_4_115jf15jflb90parz.R.inc(54213);final double[] work = new double[nvars - in - 1];
        __CLR4_4_115jf15jflb90parz.R.inc(54214);double sumxx;
        __CLR4_4_115jf15jflb90parz.R.inc(54215);double sumxy;
        __CLR4_4_115jf15jflb90parz.R.inc(54216);double sumyy;
        __CLR4_4_115jf15jflb90parz.R.inc(54217);final int offXX = (nvars - in) * (nvars - in - 1) / 2;
        __CLR4_4_115jf15jflb90parz.R.inc(54218);if ((((in < -1 || in >= nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54219)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54220)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54221);return null;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54222);final int nvm = nvars - 1;
        __CLR4_4_115jf15jflb90parz.R.inc(54223);final int base_pos = r.length - (nvm - in) * (nvm - in + 1) / 2;
        __CLR4_4_115jf15jflb90parz.R.inc(54224);if ((((d[in] > 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54225)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54226)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54227);rms[in + rms_off] = 1.0 / Math.sqrt(d[in]);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54228);for (int col = in + 1; (((col < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54229)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54230)==0&false)); col++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54231);pos = base_pos + col - 1 - in;
            __CLR4_4_115jf15jflb90parz.R.inc(54232);sumxx = d[col];
            __CLR4_4_115jf15jflb90parz.R.inc(54233);for (int row = in; (((row < col)&&(__CLR4_4_115jf15jflb90parz.R.iget(54234)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54235)==0&false)); row++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54236);sumxx += d[row] * r[pos] * r[pos];
                __CLR4_4_115jf15jflb90parz.R.inc(54237);pos += nvars - row - 2;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(54238);if ((((sumxx > 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54239)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54240)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54241);rms[col + rms_off] = 1.0 / Math.sqrt(sumxx);
            } }else {{
                __CLR4_4_115jf15jflb90parz.R.inc(54242);rms[col + rms_off] = 0.0;
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54243);sumyy = sserr;
        __CLR4_4_115jf15jflb90parz.R.inc(54244);for (int row = in; (((row < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54245)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54246)==0&false)); row++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54247);sumyy += d[row] * rhs[row] * rhs[row];
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54248);if ((((sumyy > 0.0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54249)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54250)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54251);sumyy = 1.0 / Math.sqrt(sumyy);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54252);pos = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54253);for (int col1 = in; (((col1 < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54254)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54255)==0&false)); col1++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54256);sumxy = 0.0;
            __CLR4_4_115jf15jflb90parz.R.inc(54257);Arrays.fill(work, 0.0);
            __CLR4_4_115jf15jflb90parz.R.inc(54258);pos1 = base_pos + col1 - in - 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54259);for (int row = in; (((row < col1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54260)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54261)==0&false)); row++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54262);pos2 = pos1 + 1;
                __CLR4_4_115jf15jflb90parz.R.inc(54263);for (int col2 = col1 + 1; (((col2 < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54264)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54265)==0&false)); col2++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54266);work[col2 + wrk_off] += d[row] * r[pos1] * r[pos2];
                    __CLR4_4_115jf15jflb90parz.R.inc(54267);pos2++;
                }
                }__CLR4_4_115jf15jflb90parz.R.inc(54268);sumxy += d[row] * r[pos1] * rhs[row];
                __CLR4_4_115jf15jflb90parz.R.inc(54269);pos1 += nvars - row - 2;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(54270);pos2 = pos1 + 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54271);for (int col2 = col1 + 1; (((col2 < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54272)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54273)==0&false)); col2++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54274);work[col2 + wrk_off] += d[col1] * r[pos2];
                __CLR4_4_115jf15jflb90parz.R.inc(54275);++pos2;
                __CLR4_4_115jf15jflb90parz.R.inc(54276);output[ (col2 - 1 - in) * (col2 - in) / 2 + col1 - in] =
                        work[col2 + wrk_off] * rms[col1 + rms_off] * rms[col2 + rms_off];
                __CLR4_4_115jf15jflb90parz.R.inc(54277);++pos;
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(54278);sumxy += d[col1] * rhs[col1];
            __CLR4_4_115jf15jflb90parz.R.inc(54279);output[col1 + rms_off + offXX] = sumxy * rms[col1 + rms_off] * sumyy;
        }

        }__CLR4_4_115jf15jflb90parz.R.inc(54280);return output;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * ALGORITHM AS274 APPL. STATIST. (1992) VOL.41, NO. 2.
     * Move variable from position FROM to position TO in an
     * orthogonal reduction produced by AS75.1.
     *
     * @param from initial position
     * @param to destination
     */
    private void vmove(int from, int to) {try{__CLR4_4_115jf15jflb90parz.R.inc(54281);
        __CLR4_4_115jf15jflb90parz.R.inc(54282);double d1;
        __CLR4_4_115jf15jflb90parz.R.inc(54283);double d2;
        __CLR4_4_115jf15jflb90parz.R.inc(54284);double X;
        __CLR4_4_115jf15jflb90parz.R.inc(54285);double d1new;
        __CLR4_4_115jf15jflb90parz.R.inc(54286);double d2new;
        __CLR4_4_115jf15jflb90parz.R.inc(54287);double cbar;
        __CLR4_4_115jf15jflb90parz.R.inc(54288);double sbar;
        __CLR4_4_115jf15jflb90parz.R.inc(54289);double Y;
        __CLR4_4_115jf15jflb90parz.R.inc(54290);int first;
        __CLR4_4_115jf15jflb90parz.R.inc(54291);int inc;
        __CLR4_4_115jf15jflb90parz.R.inc(54292);int m1;
        __CLR4_4_115jf15jflb90parz.R.inc(54293);int m2;
        __CLR4_4_115jf15jflb90parz.R.inc(54294);int mp1;
        __CLR4_4_115jf15jflb90parz.R.inc(54295);int pos;
        __CLR4_4_115jf15jflb90parz.R.inc(54296);boolean bSkipTo40 = false;
        __CLR4_4_115jf15jflb90parz.R.inc(54297);if ((((from == to)&&(__CLR4_4_115jf15jflb90parz.R.iget(54298)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54299)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54300);return;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54301);if ((((!this.rss_set)&&(__CLR4_4_115jf15jflb90parz.R.iget(54302)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54303)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54304);ss();
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54305);int count = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54306);if ((((from < to)&&(__CLR4_4_115jf15jflb90parz.R.iget(54307)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54308)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54309);first = from;
            __CLR4_4_115jf15jflb90parz.R.inc(54310);inc = 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54311);count = to - from;
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(54312);first = from - 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54313);inc = -1;
            __CLR4_4_115jf15jflb90parz.R.inc(54314);count = from - to;
        }

        }__CLR4_4_115jf15jflb90parz.R.inc(54315);int m = first;
        __CLR4_4_115jf15jflb90parz.R.inc(54316);int idx = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54317);while ((((idx < count)&&(__CLR4_4_115jf15jflb90parz.R.iget(54318)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54319)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54320);m1 = m * (nvars + nvars - m - 1) / 2;
            __CLR4_4_115jf15jflb90parz.R.inc(54321);m2 = m1 + nvars - m - 1;
            __CLR4_4_115jf15jflb90parz.R.inc(54322);mp1 = m + 1;

            __CLR4_4_115jf15jflb90parz.R.inc(54323);d1 = d[m];
            __CLR4_4_115jf15jflb90parz.R.inc(54324);d2 = d[mp1];
            // Special cases.
            __CLR4_4_115jf15jflb90parz.R.inc(54325);if ((((d1 > this.epsilon || d2 > this.epsilon)&&(__CLR4_4_115jf15jflb90parz.R.iget(54326)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54327)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54328);X = r[m1];
                __CLR4_4_115jf15jflb90parz.R.inc(54329);if ((((Math.abs(X) * Math.sqrt(d1) < tol[mp1])&&(__CLR4_4_115jf15jflb90parz.R.iget(54330)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54331)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54332);X = 0.0;
                }
                }__CLR4_4_115jf15jflb90parz.R.inc(54333);if ((((d1 < this.epsilon || Math.abs(X) < this.epsilon)&&(__CLR4_4_115jf15jflb90parz.R.iget(54334)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54335)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54336);d[m] = d2;
                    __CLR4_4_115jf15jflb90parz.R.inc(54337);d[mp1] = d1;
                    __CLR4_4_115jf15jflb90parz.R.inc(54338);r[m1] = 0.0;
                    __CLR4_4_115jf15jflb90parz.R.inc(54339);for (int col = m + 2; (((col < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54340)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54341)==0&false)); col++) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54342);++m1;
                        __CLR4_4_115jf15jflb90parz.R.inc(54343);X = r[m1];
                        __CLR4_4_115jf15jflb90parz.R.inc(54344);r[m1] = r[m2];
                        __CLR4_4_115jf15jflb90parz.R.inc(54345);r[m2] = X;
                        __CLR4_4_115jf15jflb90parz.R.inc(54346);++m2;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54347);X = rhs[m];
                    __CLR4_4_115jf15jflb90parz.R.inc(54348);rhs[m] = rhs[mp1];
                    __CLR4_4_115jf15jflb90parz.R.inc(54349);rhs[mp1] = X;
                    __CLR4_4_115jf15jflb90parz.R.inc(54350);bSkipTo40 = true;
                    //break;
                } }else {__CLR4_4_115jf15jflb90parz.R.inc(54351);if ((((d2 < this.epsilon)&&(__CLR4_4_115jf15jflb90parz.R.iget(54352)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54353)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54354);d[m] = d1 * X * X;
                    __CLR4_4_115jf15jflb90parz.R.inc(54355);r[m1] = 1.0 / X;
                    __CLR4_4_115jf15jflb90parz.R.inc(54356);for (int _i = m1 + 1; (((_i < m1 + nvars - m - 1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54357)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54358)==0&false)); _i++) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54359);r[_i] /= X;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54360);rhs[m] = rhs[m] / X;
                    __CLR4_4_115jf15jflb90parz.R.inc(54361);bSkipTo40 = true;
                    //break;
                }
                }}__CLR4_4_115jf15jflb90parz.R.inc(54362);if ((((!bSkipTo40)&&(__CLR4_4_115jf15jflb90parz.R.iget(54363)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54364)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54365);d1new = d2 + d1 * X * X;
                    __CLR4_4_115jf15jflb90parz.R.inc(54366);cbar = d2 / d1new;
                    __CLR4_4_115jf15jflb90parz.R.inc(54367);sbar = X * d1 / d1new;
                    __CLR4_4_115jf15jflb90parz.R.inc(54368);d2new = d1 * cbar;
                    __CLR4_4_115jf15jflb90parz.R.inc(54369);d[m] = d1new;
                    __CLR4_4_115jf15jflb90parz.R.inc(54370);d[mp1] = d2new;
                    __CLR4_4_115jf15jflb90parz.R.inc(54371);r[m1] = sbar;
                    __CLR4_4_115jf15jflb90parz.R.inc(54372);for (int col = m + 2; (((col < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54373)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54374)==0&false)); col++) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54375);++m1;
                        __CLR4_4_115jf15jflb90parz.R.inc(54376);Y = r[m1];
                        __CLR4_4_115jf15jflb90parz.R.inc(54377);r[m1] = cbar * r[m2] + sbar * Y;
                        __CLR4_4_115jf15jflb90parz.R.inc(54378);r[m2] = Y - X * r[m2];
                        __CLR4_4_115jf15jflb90parz.R.inc(54379);++m2;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54380);Y = rhs[m];
                    __CLR4_4_115jf15jflb90parz.R.inc(54381);rhs[m] = cbar * rhs[mp1] + sbar * Y;
                    __CLR4_4_115jf15jflb90parz.R.inc(54382);rhs[mp1] = Y - X * rhs[mp1];
                }
            }}
            }__CLR4_4_115jf15jflb90parz.R.inc(54383);if ((((m > 0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54384)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54385)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54386);pos = m;
                __CLR4_4_115jf15jflb90parz.R.inc(54387);for (int row = 0; (((row < m)&&(__CLR4_4_115jf15jflb90parz.R.iget(54388)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54389)==0&false)); row++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54390);X = r[pos];
                    __CLR4_4_115jf15jflb90parz.R.inc(54391);r[pos] = r[pos - 1];
                    __CLR4_4_115jf15jflb90parz.R.inc(54392);r[pos - 1] = X;
                    __CLR4_4_115jf15jflb90parz.R.inc(54393);pos += nvars - row - 2;
                }
            }}
            // Adjust variable order (VORDER), the tolerances (TOL) and
            // the vector of residual sums of squares (RSS).
            }__CLR4_4_115jf15jflb90parz.R.inc(54394);m1 = vorder[m];
            __CLR4_4_115jf15jflb90parz.R.inc(54395);vorder[m] = vorder[mp1];
            __CLR4_4_115jf15jflb90parz.R.inc(54396);vorder[mp1] = m1;
            __CLR4_4_115jf15jflb90parz.R.inc(54397);X = tol[m];
            __CLR4_4_115jf15jflb90parz.R.inc(54398);tol[m] = tol[mp1];
            __CLR4_4_115jf15jflb90parz.R.inc(54399);tol[mp1] = X;
            __CLR4_4_115jf15jflb90parz.R.inc(54400);rss[m] = rss[mp1] + d[mp1] * rhs[mp1] * rhs[mp1];

            __CLR4_4_115jf15jflb90parz.R.inc(54401);m += inc;
            __CLR4_4_115jf15jflb90parz.R.inc(54402);++idx;
        }
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2
     *
     * <p> Re-order the variables in an orthogonal reduction produced by
     * AS75.1 so that the N variables in LIST start at position POS1,
     * though will not necessarily be in the same order as in LIST.
     * Any variables in VORDER before position POS1 are not moved.
     * Auxiliary routine called: VMOVE. </p>
     *
     * <p>This internal method reorders the regressors.</p>
     *
     * @param list the regressors to move
     * @param pos1 where the list will be placed
     * @return -1 error, 0 everything ok
     */
    private int reorderRegressors(int[] list, int pos1) {try{__CLR4_4_115jf15jflb90parz.R.inc(54403);
        __CLR4_4_115jf15jflb90parz.R.inc(54404);int next;
        __CLR4_4_115jf15jflb90parz.R.inc(54405);int i;
        __CLR4_4_115jf15jflb90parz.R.inc(54406);int l;
        __CLR4_4_115jf15jflb90parz.R.inc(54407);if ((((list.length < 1 || list.length > nvars + 1 - pos1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54408)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54409)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54410);return -1;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54411);next = pos1;
        __CLR4_4_115jf15jflb90parz.R.inc(54412);i = pos1;
        __CLR4_4_115jf15jflb90parz.R.inc(54413);while ((((i < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54414)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54415)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54416);l = vorder[i];
            __CLR4_4_115jf15jflb90parz.R.inc(54417);for (int j = 0; (((j < list.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54418)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54419)==0&false)); j++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54420);if ((((l == list[j] && i > next)&&(__CLR4_4_115jf15jflb90parz.R.iget(54421)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54422)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54423);this.vmove(i, next);
                    __CLR4_4_115jf15jflb90parz.R.inc(54424);++next;
                    __CLR4_4_115jf15jflb90parz.R.inc(54425);if ((((next >= list.length + pos1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54426)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54427)==0&false))) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54428);return 0;
                    } }else {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54429);break;
                    }
                }}
            }}
            }__CLR4_4_115jf15jflb90parz.R.inc(54430);++i;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54431);return 0;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Gets the diagonal of the Hat matrix also known as the leverage matrix.
     *
     * @param  row_data returns the diagonal of the hat matrix for this observation
     * @return the diagonal element of the hatmatrix
     */
    public double getDiagonalOfHatMatrix(double[] row_data) {try{__CLR4_4_115jf15jflb90parz.R.inc(54432);
        __CLR4_4_115jf15jflb90parz.R.inc(54433);double[] wk = new double[this.nvars];
        __CLR4_4_115jf15jflb90parz.R.inc(54434);int pos;
        __CLR4_4_115jf15jflb90parz.R.inc(54435);double total;

        __CLR4_4_115jf15jflb90parz.R.inc(54436);if ((((row_data.length > nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54437)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54438)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54439);return Double.NaN;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54440);double[] xrow;
        __CLR4_4_115jf15jflb90parz.R.inc(54441);if ((((this.hasIntercept)&&(__CLR4_4_115jf15jflb90parz.R.iget(54442)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54443)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54444);xrow = new double[row_data.length + 1];
            __CLR4_4_115jf15jflb90parz.R.inc(54445);xrow[0] = 1.0;
            __CLR4_4_115jf15jflb90parz.R.inc(54446);System.arraycopy(row_data, 0, xrow, 1, row_data.length);
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(54447);xrow = row_data;
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54448);double hii = 0.0;
        __CLR4_4_115jf15jflb90parz.R.inc(54449);for (int col = 0; (((col < xrow.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54450)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54451)==0&false)); col++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54452);if ((((Math.sqrt(d[col]) < tol[col])&&(__CLR4_4_115jf15jflb90parz.R.iget(54453)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54454)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54455);wk[col] = 0.0;
            } }else {{
                __CLR4_4_115jf15jflb90parz.R.inc(54456);pos = col - 1;
                __CLR4_4_115jf15jflb90parz.R.inc(54457);total = xrow[col];
                __CLR4_4_115jf15jflb90parz.R.inc(54458);for (int row = 0; (((row < col)&&(__CLR4_4_115jf15jflb90parz.R.iget(54459)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54460)==0&false)); row++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54461);total = smartAdd(total, -wk[row] * r[pos]);
                    __CLR4_4_115jf15jflb90parz.R.inc(54462);pos += nvars - row - 2;
                }
                }__CLR4_4_115jf15jflb90parz.R.inc(54463);wk[col] = total;
                __CLR4_4_115jf15jflb90parz.R.inc(54464);hii = smartAdd(hii, (total * total) / d[col]);
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54465);return hii;
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Gets the order of the regressors, useful if some type of reordering
     * has been called. Calling regress with int[]{} args will trigger
     * a reordering.
     *
     * @return int[] with the current order of the regressors
     */
    public int[] getOrderOfRegressors(){try{__CLR4_4_115jf15jflb90parz.R.inc(54466);
        __CLR4_4_115jf15jflb90parz.R.inc(54467);return MathArrays.copyOf(vorder);
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Conducts a regression on the data in the model, using all regressors.
     *
     * @return RegressionResults the structure holding all regression results
     * @exception  ModelSpecificationException - thrown if number of observations is
     * less than the number of variables
     */
    public RegressionResults regress() throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(54468);
        __CLR4_4_115jf15jflb90parz.R.inc(54469);return regress(this.nvars);
    }finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Conducts a regression on the data in the model, using a subset of regressors.
     *
     * @param numberOfRegressors many of the regressors to include (either in canonical
     * order, or in the current reordered state)
     * @return RegressionResults the structure holding all regression results
     * @exception  ModelSpecificationException - thrown if number of observations is
     * less than the number of variables or number of regressors requested
     * is greater than the regressors in the model
     */
    public RegressionResults regress(int numberOfRegressors) throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(54470);
        __CLR4_4_115jf15jflb90parz.R.inc(54471);if ((((this.nobs <= numberOfRegressors)&&(__CLR4_4_115jf15jflb90parz.R.iget(54472)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54473)==0&false))) {{
           __CLR4_4_115jf15jflb90parz.R.inc(54474);throw new ModelSpecificationException(
                   LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS,
                   this.nobs, numberOfRegressors);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54475);if( (((numberOfRegressors > this.nvars )&&(__CLR4_4_115jf15jflb90parz.R.iget(54476)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54477)==0&false))){{
            __CLR4_4_115jf15jflb90parz.R.inc(54478);throw new ModelSpecificationException(
                    LocalizedFormats.TOO_MANY_REGRESSORS, numberOfRegressors, this.nvars);
        }

        }__CLR4_4_115jf15jflb90parz.R.inc(54479);tolset();
        __CLR4_4_115jf15jflb90parz.R.inc(54480);singcheck();

        __CLR4_4_115jf15jflb90parz.R.inc(54481);double[] beta = this.regcf(numberOfRegressors);

        __CLR4_4_115jf15jflb90parz.R.inc(54482);ss();

        __CLR4_4_115jf15jflb90parz.R.inc(54483);double[] cov = this.cov(numberOfRegressors);

        __CLR4_4_115jf15jflb90parz.R.inc(54484);int rnk = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54485);for (int i = 0; (((i < this.lindep.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54486)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54487)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54488);if ((((!this.lindep[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54489)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54490)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54491);++rnk;
            }
        }}

        }__CLR4_4_115jf15jflb90parz.R.inc(54492);boolean needsReorder = false;
        __CLR4_4_115jf15jflb90parz.R.inc(54493);for (int i = 0; (((i < numberOfRegressors)&&(__CLR4_4_115jf15jflb90parz.R.iget(54494)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54495)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54496);if ((((this.vorder[i] != i)&&(__CLR4_4_115jf15jflb90parz.R.iget(54497)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54498)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54499);needsReorder = true;
                __CLR4_4_115jf15jflb90parz.R.inc(54500);break;
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54501);if ((((!needsReorder)&&(__CLR4_4_115jf15jflb90parz.R.iget(54502)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54503)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54504);return new RegressionResults(
                    beta, new double[][]{cov}, true, this.nobs, rnk,
                    this.sumy, this.sumsqy, this.sserr, this.hasIntercept, false);
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(54505);double[] betaNew = new double[beta.length];
            __CLR4_4_115jf15jflb90parz.R.inc(54506);double[] covNew = new double[cov.length];

            __CLR4_4_115jf15jflb90parz.R.inc(54507);int[] newIndices = new int[beta.length];
            __CLR4_4_115jf15jflb90parz.R.inc(54508);for (int i = 0; (((i < nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54509)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54510)==0&false)); i++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54511);for (int j = 0; (((j < numberOfRegressors)&&(__CLR4_4_115jf15jflb90parz.R.iget(54512)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54513)==0&false)); j++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54514);if ((((this.vorder[j] == i)&&(__CLR4_4_115jf15jflb90parz.R.iget(54515)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54516)==0&false))) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54517);betaNew[i] = beta[ j];
                        __CLR4_4_115jf15jflb90parz.R.inc(54518);newIndices[i] = j;
                    }
                }}
            }}

            }__CLR4_4_115jf15jflb90parz.R.inc(54519);int idx1 = 0;
            __CLR4_4_115jf15jflb90parz.R.inc(54520);int idx2;
            __CLR4_4_115jf15jflb90parz.R.inc(54521);int _i;
            __CLR4_4_115jf15jflb90parz.R.inc(54522);int _j;
            __CLR4_4_115jf15jflb90parz.R.inc(54523);for (int i = 0; (((i < beta.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54524)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54525)==0&false)); i++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54526);_i = newIndices[i];
                __CLR4_4_115jf15jflb90parz.R.inc(54527);for (int j = 0; (((j <= i)&&(__CLR4_4_115jf15jflb90parz.R.iget(54528)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54529)==0&false)); j++, idx1++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54530);_j = newIndices[j];
                    __CLR4_4_115jf15jflb90parz.R.inc(54531);if ((((_i > _j)&&(__CLR4_4_115jf15jflb90parz.R.iget(54532)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54533)==0&false))) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54534);idx2 = _i * (_i + 1) / 2 + _j;
                    } }else {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54535);idx2 = _j * (_j + 1) / 2 + _i;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54536);covNew[idx1] = cov[idx2];
                }
            }}
            }__CLR4_4_115jf15jflb90parz.R.inc(54537);return new RegressionResults(
                    betaNew, new double[][]{covNew}, true, this.nobs, rnk,
                    this.sumy, this.sumsqy, this.sserr, this.hasIntercept, false);
        }
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}

    /**
     * Conducts a regression on the data in the model, using regressors in array
     * Calling this method will change the internal order of the regressors
     * and care is required in interpreting the hatmatrix.
     *
     * @param  variablesToInclude array of variables to include in regression
     * @return RegressionResults the structure holding all regression results
     * @exception  ModelSpecificationException - thrown if number of observations is
     * less than the number of variables, the number of regressors requested
     * is greater than the regressors in the model or a regressor index in
     * regressor array does not exist
     */
    public RegressionResults regress(int[] variablesToInclude) throws ModelSpecificationException {try{__CLR4_4_115jf15jflb90parz.R.inc(54538);
        __CLR4_4_115jf15jflb90parz.R.inc(54539);if ((((variablesToInclude.length > this.nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54540)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54541)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54542);throw new ModelSpecificationException(
                    LocalizedFormats.TOO_MANY_REGRESSORS, variablesToInclude.length, this.nvars);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54543);if ((((this.nobs <= this.nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54544)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54545)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54546);throw new ModelSpecificationException(
                    LocalizedFormats.NOT_ENOUGH_DATA_FOR_NUMBER_OF_PREDICTORS,
                    this.nobs, this.nvars);
        }
        }__CLR4_4_115jf15jflb90parz.R.inc(54547);Arrays.sort(variablesToInclude);
        __CLR4_4_115jf15jflb90parz.R.inc(54548);int iExclude = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54549);for (int i = 0; (((i < variablesToInclude.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54550)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54551)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54552);if ((((i >= this.nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54553)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54554)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54555);throw new ModelSpecificationException(
                        LocalizedFormats.INDEX_LARGER_THAN_MAX, i, this.nvars);
            }
            }__CLR4_4_115jf15jflb90parz.R.inc(54556);if ((((i > 0 && variablesToInclude[i] == variablesToInclude[i - 1])&&(__CLR4_4_115jf15jflb90parz.R.iget(54557)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54558)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54559);variablesToInclude[i] = -1;
                __CLR4_4_115jf15jflb90parz.R.inc(54560);++iExclude;
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54561);int[] series;
        __CLR4_4_115jf15jflb90parz.R.inc(54562);if ((((iExclude > 0)&&(__CLR4_4_115jf15jflb90parz.R.iget(54563)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54564)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54565);int j = 0;
            __CLR4_4_115jf15jflb90parz.R.inc(54566);series = new int[variablesToInclude.length - iExclude];
            __CLR4_4_115jf15jflb90parz.R.inc(54567);for (int i = 0; (((i < variablesToInclude.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54568)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54569)==0&false)); i++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54570);if ((((variablesToInclude[i] > -1)&&(__CLR4_4_115jf15jflb90parz.R.iget(54571)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54572)==0&false))) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54573);series[j] = variablesToInclude[i];
                    __CLR4_4_115jf15jflb90parz.R.inc(54574);++j;
                }
            }}
        }} }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(54575);series = variablesToInclude;
        }

        }__CLR4_4_115jf15jflb90parz.R.inc(54576);reorderRegressors(series, 0);
        __CLR4_4_115jf15jflb90parz.R.inc(54577);tolset();
        __CLR4_4_115jf15jflb90parz.R.inc(54578);singcheck();

        __CLR4_4_115jf15jflb90parz.R.inc(54579);double[] beta = this.regcf(series.length);

        __CLR4_4_115jf15jflb90parz.R.inc(54580);ss();

        __CLR4_4_115jf15jflb90parz.R.inc(54581);double[] cov = this.cov(series.length);

        __CLR4_4_115jf15jflb90parz.R.inc(54582);int rnk = 0;
        __CLR4_4_115jf15jflb90parz.R.inc(54583);for (int i = 0; (((i < this.lindep.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54584)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54585)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54586);if ((((!this.lindep[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54587)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54588)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54589);++rnk;
            }
        }}

        }__CLR4_4_115jf15jflb90parz.R.inc(54590);boolean needsReorder = false;
        __CLR4_4_115jf15jflb90parz.R.inc(54591);for (int i = 0; (((i < this.nvars)&&(__CLR4_4_115jf15jflb90parz.R.iget(54592)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54593)==0&false)); i++) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54594);if ((((this.vorder[i] != series[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54595)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54596)==0&false))) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54597);needsReorder = true;
                __CLR4_4_115jf15jflb90parz.R.inc(54598);break;
            }
        }}
        }__CLR4_4_115jf15jflb90parz.R.inc(54599);if ((((!needsReorder)&&(__CLR4_4_115jf15jflb90parz.R.iget(54600)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54601)==0&false))) {{
            __CLR4_4_115jf15jflb90parz.R.inc(54602);return new RegressionResults(
                    beta, new double[][]{cov}, true, this.nobs, rnk,
                    this.sumy, this.sumsqy, this.sserr, this.hasIntercept, false);
        } }else {{
            __CLR4_4_115jf15jflb90parz.R.inc(54603);double[] betaNew = new double[beta.length];
            __CLR4_4_115jf15jflb90parz.R.inc(54604);int[] newIndices = new int[beta.length];
            __CLR4_4_115jf15jflb90parz.R.inc(54605);for (int i = 0; (((i < series.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54606)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54607)==0&false)); i++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54608);for (int j = 0; (((j < this.vorder.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54609)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54610)==0&false)); j++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54611);if ((((this.vorder[j] == series[i])&&(__CLR4_4_115jf15jflb90parz.R.iget(54612)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54613)==0&false))) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54614);betaNew[i] = beta[ j];
                        __CLR4_4_115jf15jflb90parz.R.inc(54615);newIndices[i] = j;
                    }
                }}
            }}
            }__CLR4_4_115jf15jflb90parz.R.inc(54616);double[] covNew = new double[cov.length];
            __CLR4_4_115jf15jflb90parz.R.inc(54617);int idx1 = 0;
            __CLR4_4_115jf15jflb90parz.R.inc(54618);int idx2;
            __CLR4_4_115jf15jflb90parz.R.inc(54619);int _i;
            __CLR4_4_115jf15jflb90parz.R.inc(54620);int _j;
            __CLR4_4_115jf15jflb90parz.R.inc(54621);for (int i = 0; (((i < beta.length)&&(__CLR4_4_115jf15jflb90parz.R.iget(54622)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54623)==0&false)); i++) {{
                __CLR4_4_115jf15jflb90parz.R.inc(54624);_i = newIndices[i];
                __CLR4_4_115jf15jflb90parz.R.inc(54625);for (int j = 0; (((j <= i)&&(__CLR4_4_115jf15jflb90parz.R.iget(54626)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54627)==0&false)); j++, idx1++) {{
                    __CLR4_4_115jf15jflb90parz.R.inc(54628);_j = newIndices[j];
                    __CLR4_4_115jf15jflb90parz.R.inc(54629);if ((((_i > _j)&&(__CLR4_4_115jf15jflb90parz.R.iget(54630)!=0|true))||(__CLR4_4_115jf15jflb90parz.R.iget(54631)==0&false))) {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54632);idx2 = _i * (_i + 1) / 2 + _j;
                    } }else {{
                        __CLR4_4_115jf15jflb90parz.R.inc(54633);idx2 = _j * (_j + 1) / 2 + _i;
                    }
                    }__CLR4_4_115jf15jflb90parz.R.inc(54634);covNew[idx1] = cov[idx2];
                }
            }}
            }__CLR4_4_115jf15jflb90parz.R.inc(54635);return new RegressionResults(
                    betaNew, new double[][]{covNew}, true, this.nobs, rnk,
                    this.sumy, this.sumsqy, this.sserr, this.hasIntercept, false);
        }
    }}finally{__CLR4_4_115jf15jflb90parz.R.flushNeeded();}}
}
