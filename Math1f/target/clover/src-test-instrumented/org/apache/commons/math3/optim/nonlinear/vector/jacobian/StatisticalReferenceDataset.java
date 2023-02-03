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
package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class gives access to the statistical reference datasets provided by the
 * NIST (available
 * <a href="http://www.itl.nist.gov/div898/strd/general/dataarchive.html">here</a>).
 * Instances of this class can be created by invocation of the
 * {@link StatisticalReferenceDatasetFactory}.
 */
public abstract class StatisticalReferenceDataset {public static class __CLR4_4_123mg23mglb90pdx4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,98143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The name of this dataset. */
    private final String name;

    /** The total number of observations (data points). */
    private final int numObservations;

    /** The total number of parameters. */
    private final int numParameters;

    /** The total number of starting points for the optimizations. */
    private final int numStartingPoints;

    /** The values of the predictor. */
    private final double[] x;

    /** The values of the response. */
    private final double[] y;

    /**
     * The starting values. {@code startingValues[j][i]} is the value of the
     * {@code i}-th parameter in the {@code j}-th set of starting values.
     */
    private final double[][] startingValues;

    /** The certified values of the parameters. */
    private final double[] a;

    /** The certified values of the standard deviation of the parameters. */
    private final double[] sigA;

    /** The certified value of the residual sum of squares. */
    private double residualSumOfSquares;

    /** The least-squares problem. */
    private final LeastSquaresProblem problem;

    /**
     * Creates a new instance of this class from the specified data file. The
     * file must follow the StRD format.
     *
     * @param in the data file
     * @throws IOException if an I/O error occurs
     */
    public StatisticalReferenceDataset(final BufferedReader in)
        throws IOException {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98008);

        __CLR4_4_123mg23mglb90pdx4.R.inc(98009);final ArrayList<String> lines = new ArrayList<String>();
        __CLR4_4_123mg23mglb90pdx4.R.inc(98010);for (String line = in.readLine(); (((line != null)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98011)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98012)==0&false)); line = in.readLine()) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98013);lines.add(line);
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98014);int[] index = findLineNumbers("Data", lines);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98015);if ((((index == null)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98016)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98017)==0&false))) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98018);throw new AssertionError("could not find line indices for data");
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98019);this.numObservations = index[1] - index[0] + 1;
        __CLR4_4_123mg23mglb90pdx4.R.inc(98020);this.x = new double[this.numObservations];
        __CLR4_4_123mg23mglb90pdx4.R.inc(98021);this.y = new double[this.numObservations];
        __CLR4_4_123mg23mglb90pdx4.R.inc(98022);for (int i = 0; (((i < this.numObservations)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98023)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98024)==0&false)); i++) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98025);final String line = lines.get(index[0] + i - 1);
            __CLR4_4_123mg23mglb90pdx4.R.inc(98026);final String[] tokens = line.trim().split(" ++");
            // Data columns are in reverse order!!!
            __CLR4_4_123mg23mglb90pdx4.R.inc(98027);this.y[i] = Double.parseDouble(tokens[0]);
            __CLR4_4_123mg23mglb90pdx4.R.inc(98028);this.x[i] = Double.parseDouble(tokens[1]);
        }

        }__CLR4_4_123mg23mglb90pdx4.R.inc(98029);index = findLineNumbers("Starting Values", lines);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98030);if ((((index == null)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98031)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98032)==0&false))) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98033);throw new AssertionError(
                                     "could not find line indices for starting values");
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98034);this.numParameters = index[1] - index[0] + 1;

        __CLR4_4_123mg23mglb90pdx4.R.inc(98035);double[][] start = null;
        __CLR4_4_123mg23mglb90pdx4.R.inc(98036);this.a = new double[numParameters];
        __CLR4_4_123mg23mglb90pdx4.R.inc(98037);this.sigA = new double[numParameters];
        __CLR4_4_123mg23mglb90pdx4.R.inc(98038);for (int i = 0; (((i < numParameters)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98039)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98040)==0&false)); i++) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98041);final String line = lines.get(index[0] + i - 1);
            __CLR4_4_123mg23mglb90pdx4.R.inc(98042);final String[] tokens = line.trim().split(" ++");
            __CLR4_4_123mg23mglb90pdx4.R.inc(98043);if ((((start == null)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98044)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98045)==0&false))) {{
                __CLR4_4_123mg23mglb90pdx4.R.inc(98046);start = new double[tokens.length - 4][numParameters];
            }
            }__CLR4_4_123mg23mglb90pdx4.R.inc(98047);for (int j = 2; (((j < tokens.length - 2)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98048)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98049)==0&false)); j++) {{
                __CLR4_4_123mg23mglb90pdx4.R.inc(98050);start[j - 2][i] = Double.parseDouble(tokens[j]);
            }
            }__CLR4_4_123mg23mglb90pdx4.R.inc(98051);this.a[i] = Double.parseDouble(tokens[tokens.length - 2]);
            __CLR4_4_123mg23mglb90pdx4.R.inc(98052);this.sigA[i] = Double.parseDouble(tokens[tokens.length - 1]);
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98053);if ((((start == null)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98054)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98055)==0&false))) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98056);throw new IOException("could not find starting values");
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98057);this.numStartingPoints = start.length;
        __CLR4_4_123mg23mglb90pdx4.R.inc(98058);this.startingValues = start;

        __CLR4_4_123mg23mglb90pdx4.R.inc(98059);double dummyDouble = Double.NaN;
        __CLR4_4_123mg23mglb90pdx4.R.inc(98060);String dummyString = null;
        __CLR4_4_123mg23mglb90pdx4.R.inc(98061);for (String line : lines) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98062);if ((((line.contains("Dataset Name:"))&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98063)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98064)==0&false))) {{
                __CLR4_4_123mg23mglb90pdx4.R.inc(98065);dummyString = line
                    .substring(line.indexOf("Dataset Name:") + 13,
                               line.indexOf("(")).trim();
            }
            }__CLR4_4_123mg23mglb90pdx4.R.inc(98066);if ((((line.contains("Residual Sum of Squares"))&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98067)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98068)==0&false))) {{
                __CLR4_4_123mg23mglb90pdx4.R.inc(98069);final String[] tokens = line.split(" ++");
                __CLR4_4_123mg23mglb90pdx4.R.inc(98070);dummyDouble = Double.parseDouble(tokens[4].trim());
            }
        }}
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98071);if ((((Double.isNaN(dummyDouble))&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98072)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98073)==0&false))) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98074);throw new IOException(
                                  "could not find certified value of residual sum of squares");
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98075);this.residualSumOfSquares = dummyDouble;

        __CLR4_4_123mg23mglb90pdx4.R.inc(98076);if ((((dummyString == null)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98077)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98078)==0&false))) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98079);throw new IOException("could not find dataset name");
        }
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98080);this.name = dummyString;

        __CLR4_4_123mg23mglb90pdx4.R.inc(98081);this.problem = new LeastSquaresProblem();
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    class LeastSquaresProblem {
        public ModelFunction getModelFunction() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98082);
            __CLR4_4_123mg23mglb90pdx4.R.inc(98083);return new ModelFunction(new MultivariateVectorFunction() {
                    public double[] value(final double[] a) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98084);
                        __CLR4_4_123mg23mglb90pdx4.R.inc(98085);final int n = getNumObservations();
                        __CLR4_4_123mg23mglb90pdx4.R.inc(98086);final double[] yhat = new double[n];
                        __CLR4_4_123mg23mglb90pdx4.R.inc(98087);for (int i = 0; (((i < n)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98088)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98089)==0&false)); i++) {{
                            __CLR4_4_123mg23mglb90pdx4.R.inc(98090);yhat[i] = getModelValue(getX(i), a);
                        }
                        }__CLR4_4_123mg23mglb90pdx4.R.inc(98091);return yhat;
                    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}
                });
        }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

        public ModelFunctionJacobian getModelFunctionJacobian() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98092);
            __CLR4_4_123mg23mglb90pdx4.R.inc(98093);return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                    public double[][] value(final double[] a)
                        throws IllegalArgumentException {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98094);
                        __CLR4_4_123mg23mglb90pdx4.R.inc(98095);final int n = getNumObservations();
                        __CLR4_4_123mg23mglb90pdx4.R.inc(98096);final double[][] j = new double[n][];
                        __CLR4_4_123mg23mglb90pdx4.R.inc(98097);for (int i = 0; (((i < n)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98098)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98099)==0&false)); i++) {{
                            __CLR4_4_123mg23mglb90pdx4.R.inc(98100);j[i] = getModelDerivatives(getX(i), a);
                        }
                        }__CLR4_4_123mg23mglb90pdx4.R.inc(98101);return j;
                    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}
                });
        }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}
    }

    /**
     * Returns the name of this dataset.
     *
     * @return the name of the dataset
     */
    public String getName() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98102);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98103);return name;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the total number of observations (data points).
     *
     * @return the number of observations
     */
    public int getNumObservations() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98104);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98105);return numObservations;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns a copy of the data arrays. The data is laid out as follows <li>
     * {@code data[0][i] = x[i]},</li> <li>{@code data[1][i] = y[i]},</li>
     *
     * @return the array of data points.
     */
    public double[][] getData() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98106);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98107);return new double[][] {
            MathArrays.copyOf(x), MathArrays.copyOf(y)
        };
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the x-value of the {@code i}-th data point.
     *
     * @param i the index of the data point
     * @return the x-value
     */
    public double getX(final int i) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98108);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98109);return x[i];
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the y-value of the {@code i}-th data point.
     *
     * @param i the index of the data point
     * @return the y-value
     */
    public double getY(final int i) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98110);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98111);return y[i];
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the total number of parameters.
     *
     * @return the number of parameters
     */
    public int getNumParameters() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98112);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98113);return numParameters;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the certified values of the paramters.
     *
     * @return the values of the parameters
     */
    public double[] getParameters() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98114);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98115);return MathArrays.copyOf(a);
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the certified value of the {@code i}-th parameter.
     *
     * @param i the index of the parameter
     * @return the value of the parameter
     */
    public double getParameter(final int i) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98116);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98117);return a[i];
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Reurns the certified values of the standard deviations of the parameters.
     *
     * @return the standard deviations of the parameters
     */
    public double[] getParametersStandardDeviations() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98118);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98119);return MathArrays.copyOf(sigA);
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the certified value of the standard deviation of the {@code i}-th
     * parameter.
     *
     * @param i the index of the parameter
     * @return the standard deviation of the parameter
     */
    public double getParameterStandardDeviation(final int i) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98120);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98121);return sigA[i];
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the certified value of the residual sum of squares.
     *
     * @return the residual sum of squares
     */
    public double getResidualSumOfSquares() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98122);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98123);return residualSumOfSquares;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the total number of starting points (initial guesses for the
     * optimization process).
     *
     * @return the number of starting points
     */
    public int getNumStartingPoints() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98124);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98125);return numStartingPoints;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the {@code i}-th set of initial values of the parameters.
     *
     * @param i the index of the starting point
     * @return the starting point
     */
    public double[] getStartingPoint(final int i) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98126);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98127);return MathArrays.copyOf(startingValues[i]);
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the least-squares problem corresponding to fitting the model to
     * the specified data.
     *
     * @return the least-squares problem
     */
    public LeastSquaresProblem getLeastSquaresProblem() {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98128);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98129);return problem;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}

    /**
     * Returns the value of the model for the specified values of the predictor
     * variable and the parameters.
     *
     * @param x the predictor variable
     * @param a the parameters
     * @return the value of the model
     */
    public abstract double getModelValue(final double x, final double[] a);

    /**
     * Returns the values of the partial derivatives of the model with respect
     * to the parameters.
     *
     * @param x the predictor variable
     * @param a the parameters
     * @return the partial derivatives
     */
    public abstract double[] getModelDerivatives(final double x,
                                                 final double[] a);

    /**
     * <p>
     * Parses the specified text lines, and extracts the indices of the first
     * and last lines of the data defined by the specified {@code key}. This key
     * must be one of
     * </p>
     * <ul>
     * <li>{@code "Starting Values"},</li>
     * <li>{@code "Certified Values"},</li>
     * <li>{@code "Data"}.</li>
     * </ul>
     * <p>
     * In the NIST data files, the line indices are separated by the keywords
     * {@code "lines"} and {@code "to"}.
     * </p>
     *
     * @param lines the line of text to be parsed
     * @return an array of two {@code int}s. First value is the index of the
     *         first line, second value is the index of the last line.
     *         {@code null} if the line could not be parsed.
     */
    private static int[] findLineNumbers(final String key,
                                         final Iterable<String> lines) {try{__CLR4_4_123mg23mglb90pdx4.R.inc(98130);
        __CLR4_4_123mg23mglb90pdx4.R.inc(98131);for (String text : lines) {{
            __CLR4_4_123mg23mglb90pdx4.R.inc(98132);boolean flag = text.contains(key) && text.contains("lines") &&
                           text.contains("to") && text.contains(")");
            __CLR4_4_123mg23mglb90pdx4.R.inc(98133);if ((((flag)&&(__CLR4_4_123mg23mglb90pdx4.R.iget(98134)!=0|true))||(__CLR4_4_123mg23mglb90pdx4.R.iget(98135)==0&false))) {{
                __CLR4_4_123mg23mglb90pdx4.R.inc(98136);final int[] numbers = new int[2];
                __CLR4_4_123mg23mglb90pdx4.R.inc(98137);final String from = text.substring(text.indexOf("lines") + 5,
                                                   text.indexOf("to"));
                __CLR4_4_123mg23mglb90pdx4.R.inc(98138);numbers[0] = Integer.parseInt(from.trim());
                __CLR4_4_123mg23mglb90pdx4.R.inc(98139);final String to = text.substring(text.indexOf("to") + 2,
                                                 text.indexOf(")"));
                __CLR4_4_123mg23mglb90pdx4.R.inc(98140);numbers[1] = Integer.parseInt(to.trim());
                __CLR4_4_123mg23mglb90pdx4.R.inc(98141);return numbers;
            }
        }}
        }__CLR4_4_123mg23mglb90pdx4.R.inc(98142);return null;
    }finally{__CLR4_4_123mg23mglb90pdx4.R.flushNeeded();}}
}
