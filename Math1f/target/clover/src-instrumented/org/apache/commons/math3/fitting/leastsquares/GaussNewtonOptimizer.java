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
package org.apache.commons.math3.fitting.leastsquares;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.PointVectorValuePair;

/**
 * Gauss-Newton least-squares solver.
 *
 * <p>
 * This class solve a least-square problem by solving the normal equations
 * of the linearized problem at each iteration. Either LU decomposition or
 * QR decomposition can be used to solve the normal equations. LU decomposition
 * is faster but QR decomposition is more robust for difficult problems.
 * </p>
 *
 * @version $Id$
 * @since 3.3
 */
public class GaussNewtonOptimizer extends AbstractLeastSquaresOptimizer<GaussNewtonOptimizer> {public static class __CLR4_4_1af2af2lb90p7sg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,13591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Indicator for using LU decomposition. */
    private boolean useLU = true;

    /**
     * Default constructor.
     */
    protected GaussNewtonOptimizer() {try{__CLR4_4_1af2af2lb90p7sg.R.inc(13502);}finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param other object to copy.
     */
    protected GaussNewtonOptimizer(GaussNewtonOptimizer other) {
        super(other);__CLR4_4_1af2af2lb90p7sg.R.inc(13504);try{__CLR4_4_1af2af2lb90p7sg.R.inc(13503);

        __CLR4_4_1af2af2lb90p7sg.R.inc(13505);this.useLU = other.useLU;
    }finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}

    /**
     * Creates a bare-bones instance.
     * Several calls to {@code withXxx} methods are necessary to obtain
     * an object with all necessary fields set to sensible values.
     * <br/>
     * The default for the algorithm is to solve the normal equations
     * using LU decomposition.
     *
     * @return an instance of this class.
     */
    public static GaussNewtonOptimizer create() {try{__CLR4_4_1af2af2lb90p7sg.R.inc(13506);
        __CLR4_4_1af2af2lb90p7sg.R.inc(13507);return new GaussNewtonOptimizer();
    }finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public GaussNewtonOptimizer shallowCopy() {try{__CLR4_4_1af2af2lb90p7sg.R.inc(13508);
        __CLR4_4_1af2af2lb90p7sg.R.inc(13509);return new GaussNewtonOptimizer(this);
    }finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}

    /**
     * @param newUseLU Whether to use LU decomposition.
     * @return this instance.
     */
    public GaussNewtonOptimizer withLU(boolean newUseLU) {try{__CLR4_4_1af2af2lb90p7sg.R.inc(13510);
        __CLR4_4_1af2af2lb90p7sg.R.inc(13511);this.useLU = newUseLU;
        __CLR4_4_1af2af2lb90p7sg.R.inc(13512);return self();
    }finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}

    /**
     * @return {@code true} if LU decomposition is used.
     */
    public boolean getLU() {try{__CLR4_4_1af2af2lb90p7sg.R.inc(13513);
        __CLR4_4_1af2af2lb90p7sg.R.inc(13514);return useLU;
    }finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public PointVectorValuePair doOptimize() {try{__CLR4_4_1af2af2lb90p7sg.R.inc(13515);
        __CLR4_4_1af2af2lb90p7sg.R.inc(13516);final ConvergenceChecker<PointVectorValuePair> checker
            = getConvergenceChecker();

        // Computation will be useless without a checker (see "for-loop").
        __CLR4_4_1af2af2lb90p7sg.R.inc(13517);if ((((checker == null)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13518)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13519)==0&false))) {{
            __CLR4_4_1af2af2lb90p7sg.R.inc(13520);throw new NullArgumentException();
        }

        }__CLR4_4_1af2af2lb90p7sg.R.inc(13521);final double[] targetValues = getTarget();
        __CLR4_4_1af2af2lb90p7sg.R.inc(13522);final int nR = targetValues.length; // Number of observed data.

        __CLR4_4_1af2af2lb90p7sg.R.inc(13523);final RealMatrix weightMatrix = getWeight();
        __CLR4_4_1af2af2lb90p7sg.R.inc(13524);if ((((weightMatrix.getRowDimension() != nR)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13525)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13526)==0&false))) {{
            __CLR4_4_1af2af2lb90p7sg.R.inc(13527);throw new DimensionMismatchException(weightMatrix.getRowDimension(), nR);
        }
        }__CLR4_4_1af2af2lb90p7sg.R.inc(13528);if ((((weightMatrix.getColumnDimension() != nR)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13529)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13530)==0&false))) {{
            __CLR4_4_1af2af2lb90p7sg.R.inc(13531);throw new DimensionMismatchException(weightMatrix.getColumnDimension(), nR);
        }

        // Diagonal of the weight matrix.
        }__CLR4_4_1af2af2lb90p7sg.R.inc(13532);final double[] residualsWeights = new double[nR];
        __CLR4_4_1af2af2lb90p7sg.R.inc(13533);for (int i = 0; (((i < nR)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13534)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13535)==0&false)); i++) {{
            __CLR4_4_1af2af2lb90p7sg.R.inc(13536);residualsWeights[i] = weightMatrix.getEntry(i, i);
        }

        }__CLR4_4_1af2af2lb90p7sg.R.inc(13537);final double[] currentPoint = getStart();
        __CLR4_4_1af2af2lb90p7sg.R.inc(13538);final int nC = currentPoint.length;

        // iterate until convergence is reached
        __CLR4_4_1af2af2lb90p7sg.R.inc(13539);PointVectorValuePair current = null;
        __CLR4_4_1af2af2lb90p7sg.R.inc(13540);for (boolean converged = false; (((!converged)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13541)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13542)==0&false));) {{
            __CLR4_4_1af2af2lb90p7sg.R.inc(13543);incrementIterationCount();

            // evaluate the objective function and its jacobian
            __CLR4_4_1af2af2lb90p7sg.R.inc(13544);PointVectorValuePair previous = current;
            // Value of the objective function at "currentPoint".
            __CLR4_4_1af2af2lb90p7sg.R.inc(13545);final double[] currentObjective = computeObjectiveValue(currentPoint);
            __CLR4_4_1af2af2lb90p7sg.R.inc(13546);final double[] currentResiduals = computeResiduals(currentObjective);
            __CLR4_4_1af2af2lb90p7sg.R.inc(13547);final RealMatrix weightedJacobian = computeWeightedJacobian(currentPoint);
            __CLR4_4_1af2af2lb90p7sg.R.inc(13548);current = new PointVectorValuePair(currentPoint, currentObjective);

            // build the linear problem
            __CLR4_4_1af2af2lb90p7sg.R.inc(13549);final double[]   b = new double[nC];
            __CLR4_4_1af2af2lb90p7sg.R.inc(13550);final double[][] a = new double[nC][nC];
            __CLR4_4_1af2af2lb90p7sg.R.inc(13551);for (int i = 0; (((i < nR)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13552)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13553)==0&false)); ++i) {{

                __CLR4_4_1af2af2lb90p7sg.R.inc(13554);final double[] grad   = weightedJacobian.getRow(i);
                __CLR4_4_1af2af2lb90p7sg.R.inc(13555);final double weight   = residualsWeights[i];
                __CLR4_4_1af2af2lb90p7sg.R.inc(13556);final double residual = currentResiduals[i];

                // compute the normal equation
                __CLR4_4_1af2af2lb90p7sg.R.inc(13557);final double wr = weight * residual;
                __CLR4_4_1af2af2lb90p7sg.R.inc(13558);for (int j = 0; (((j < nC)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13559)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13560)==0&false)); ++j) {{
                    __CLR4_4_1af2af2lb90p7sg.R.inc(13561);b[j] += wr * grad[j];
                }

                // build the contribution matrix for measurement i
                }__CLR4_4_1af2af2lb90p7sg.R.inc(13562);for (int k = 0; (((k < nC)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13563)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13564)==0&false)); ++k) {{
                    __CLR4_4_1af2af2lb90p7sg.R.inc(13565);double[] ak = a[k];
                    __CLR4_4_1af2af2lb90p7sg.R.inc(13566);double wgk = weight * grad[k];
                    __CLR4_4_1af2af2lb90p7sg.R.inc(13567);for (int l = 0; (((l < nC)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13568)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13569)==0&false)); ++l) {{
                        __CLR4_4_1af2af2lb90p7sg.R.inc(13570);ak[l] += wgk * grad[l];
                    }
                }}
            }}

            // Check convergence.
            }__CLR4_4_1af2af2lb90p7sg.R.inc(13571);if ((((previous != null)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13572)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13573)==0&false))) {{
                __CLR4_4_1af2af2lb90p7sg.R.inc(13574);converged = checker.converged(getIterations(), previous, current);
                __CLR4_4_1af2af2lb90p7sg.R.inc(13575);if ((((converged)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13576)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13577)==0&false))) {{
                    __CLR4_4_1af2af2lb90p7sg.R.inc(13578);return current;
                }
            }}

            }__CLR4_4_1af2af2lb90p7sg.R.inc(13579);try {
                // solve the linearized least squares problem
                __CLR4_4_1af2af2lb90p7sg.R.inc(13580);RealMatrix mA = new BlockRealMatrix(a);
                __CLR4_4_1af2af2lb90p7sg.R.inc(13581);DecompositionSolver solver = (((useLU )&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13582)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13583)==0&false))?
                        new LUDecomposition(mA).getSolver() :
                        new QRDecomposition(mA).getSolver();
                __CLR4_4_1af2af2lb90p7sg.R.inc(13584);final double[] dX = solver.solve(new ArrayRealVector(b, false)).toArray();
                // update the estimated parameters
                __CLR4_4_1af2af2lb90p7sg.R.inc(13585);for (int i = 0; (((i < nC)&&(__CLR4_4_1af2af2lb90p7sg.R.iget(13586)!=0|true))||(__CLR4_4_1af2af2lb90p7sg.R.iget(13587)==0&false)); ++i) {{
                    __CLR4_4_1af2af2lb90p7sg.R.inc(13588);currentPoint[i] += dX[i];
                }
            }} catch (SingularMatrixException e) {
                __CLR4_4_1af2af2lb90p7sg.R.inc(13589);throw new ConvergenceException(LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM);
            }
        }
        // Must never happen.
        }__CLR4_4_1af2af2lb90p7sg.R.inc(13590);throw new MathInternalError();
    }finally{__CLR4_4_1af2af2lb90p7sg.R.flushNeeded();}}
}
