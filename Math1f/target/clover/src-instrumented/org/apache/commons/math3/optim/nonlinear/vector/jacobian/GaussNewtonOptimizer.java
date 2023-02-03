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

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
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
 * <br/>
 * Constraints are not supported: the call to
 * {@link #optimize(OptimizationData[]) optimize} will throw
 * {@link MathUnsupportedOperationException} if bounds are passed to it.
 *
 * <p>
 * This class solve a least-square problem by solving the normal equations
 * of the linearized problem at each iteration. Either LU decomposition or
 * QR decomposition can be used to solve the normal equations. LU decomposition
 * is faster but QR decomposition is more robust for difficult problems.
 * </p>
 *
 * @version $Id$
 * @since 2.0
 * @deprecated All classes and interfaces in this package are deprecated.
 * The optimizers that were provided here were moved to the
 * {@link org.apache.commons.math3.fitting.leastsquares} package
 * (cf. MATH-1008).
 */
@Deprecated
public class GaussNewtonOptimizer extends AbstractLeastSquaresOptimizer {public static class __CLR4_4_1usyusylb90p9uf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,40002,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Indicator for using LU decomposition. */
    private final boolean useLU;

    /**
     * Simple constructor with default settings.
     * The normal equations will be solved using LU decomposition.
     *
     * @param checker Convergence checker.
     */
    public GaussNewtonOptimizer(ConvergenceChecker<PointVectorValuePair> checker) {
        this(true, checker);__CLR4_4_1usyusylb90p9uf.R.inc(39923);try{__CLR4_4_1usyusylb90p9uf.R.inc(39922);
    }finally{__CLR4_4_1usyusylb90p9uf.R.flushNeeded();}}

    /**
     * @param useLU If {@code true}, the normal equations will be solved
     * using LU decomposition, otherwise they will be solved using QR
     * decomposition.
     * @param checker Convergence checker.
     */
    public GaussNewtonOptimizer(final boolean useLU,
                                ConvergenceChecker<PointVectorValuePair> checker) {
        super(checker);__CLR4_4_1usyusylb90p9uf.R.inc(39925);try{__CLR4_4_1usyusylb90p9uf.R.inc(39924);
        __CLR4_4_1usyusylb90p9uf.R.inc(39926);this.useLU = useLU;
    }finally{__CLR4_4_1usyusylb90p9uf.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public PointVectorValuePair doOptimize() {try{__CLR4_4_1usyusylb90p9uf.R.inc(39927);
        __CLR4_4_1usyusylb90p9uf.R.inc(39928);checkParameters();

        __CLR4_4_1usyusylb90p9uf.R.inc(39929);final ConvergenceChecker<PointVectorValuePair> checker
            = getConvergenceChecker();

        // Computation will be useless without a checker (see "for-loop").
        __CLR4_4_1usyusylb90p9uf.R.inc(39930);if ((((checker == null)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39931)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39932)==0&false))) {{
            __CLR4_4_1usyusylb90p9uf.R.inc(39933);throw new NullArgumentException();
        }

        }__CLR4_4_1usyusylb90p9uf.R.inc(39934);final double[] targetValues = getTarget();
        __CLR4_4_1usyusylb90p9uf.R.inc(39935);final int nR = targetValues.length; // Number of observed data.

        __CLR4_4_1usyusylb90p9uf.R.inc(39936);final RealMatrix weightMatrix = getWeight();
        // Diagonal of the weight matrix.
        __CLR4_4_1usyusylb90p9uf.R.inc(39937);final double[] residualsWeights = new double[nR];
        __CLR4_4_1usyusylb90p9uf.R.inc(39938);for (int i = 0; (((i < nR)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39939)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39940)==0&false)); i++) {{
            __CLR4_4_1usyusylb90p9uf.R.inc(39941);residualsWeights[i] = weightMatrix.getEntry(i, i);
        }

        }__CLR4_4_1usyusylb90p9uf.R.inc(39942);final double[] currentPoint = getStartPoint();
        __CLR4_4_1usyusylb90p9uf.R.inc(39943);final int nC = currentPoint.length;

        // iterate until convergence is reached
        __CLR4_4_1usyusylb90p9uf.R.inc(39944);PointVectorValuePair current = null;
        __CLR4_4_1usyusylb90p9uf.R.inc(39945);for (boolean converged = false; (((!converged)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39946)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39947)==0&false));) {{
            __CLR4_4_1usyusylb90p9uf.R.inc(39948);incrementIterationCount();

            // evaluate the objective function and its jacobian
            __CLR4_4_1usyusylb90p9uf.R.inc(39949);PointVectorValuePair previous = current;
            // Value of the objective function at "currentPoint".
            __CLR4_4_1usyusylb90p9uf.R.inc(39950);final double[] currentObjective = computeObjectiveValue(currentPoint);
            __CLR4_4_1usyusylb90p9uf.R.inc(39951);final double[] currentResiduals = computeResiduals(currentObjective);
            __CLR4_4_1usyusylb90p9uf.R.inc(39952);final RealMatrix weightedJacobian = computeWeightedJacobian(currentPoint);
            __CLR4_4_1usyusylb90p9uf.R.inc(39953);current = new PointVectorValuePair(currentPoint, currentObjective);

            // build the linear problem
            __CLR4_4_1usyusylb90p9uf.R.inc(39954);final double[]   b = new double[nC];
            __CLR4_4_1usyusylb90p9uf.R.inc(39955);final double[][] a = new double[nC][nC];
            __CLR4_4_1usyusylb90p9uf.R.inc(39956);for (int i = 0; (((i < nR)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39957)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39958)==0&false)); ++i) {{

                __CLR4_4_1usyusylb90p9uf.R.inc(39959);final double[] grad   = weightedJacobian.getRow(i);
                __CLR4_4_1usyusylb90p9uf.R.inc(39960);final double weight   = residualsWeights[i];
                __CLR4_4_1usyusylb90p9uf.R.inc(39961);final double residual = currentResiduals[i];

                // compute the normal equation
                __CLR4_4_1usyusylb90p9uf.R.inc(39962);final double wr = weight * residual;
                __CLR4_4_1usyusylb90p9uf.R.inc(39963);for (int j = 0; (((j < nC)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39964)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39965)==0&false)); ++j) {{
                    __CLR4_4_1usyusylb90p9uf.R.inc(39966);b[j] += wr * grad[j];
                }

                // build the contribution matrix for measurement i
                }__CLR4_4_1usyusylb90p9uf.R.inc(39967);for (int k = 0; (((k < nC)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39968)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39969)==0&false)); ++k) {{
                    __CLR4_4_1usyusylb90p9uf.R.inc(39970);double[] ak = a[k];
                    __CLR4_4_1usyusylb90p9uf.R.inc(39971);double wgk = weight * grad[k];
                    __CLR4_4_1usyusylb90p9uf.R.inc(39972);for (int l = 0; (((l < nC)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39973)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39974)==0&false)); ++l) {{
                        __CLR4_4_1usyusylb90p9uf.R.inc(39975);ak[l] += wgk * grad[l];
                    }
                }}
            }}

            // Check convergence.
            }__CLR4_4_1usyusylb90p9uf.R.inc(39976);if ((((previous != null)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39977)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39978)==0&false))) {{
                __CLR4_4_1usyusylb90p9uf.R.inc(39979);converged = checker.converged(getIterations(), previous, current);
                __CLR4_4_1usyusylb90p9uf.R.inc(39980);if ((((converged)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39981)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39982)==0&false))) {{
                    __CLR4_4_1usyusylb90p9uf.R.inc(39983);setCost(computeCost(currentResiduals));
                    __CLR4_4_1usyusylb90p9uf.R.inc(39984);return current;
                }
            }}

            }__CLR4_4_1usyusylb90p9uf.R.inc(39985);try {
                // solve the linearized least squares problem
                __CLR4_4_1usyusylb90p9uf.R.inc(39986);RealMatrix mA = new BlockRealMatrix(a);
                __CLR4_4_1usyusylb90p9uf.R.inc(39987);DecompositionSolver solver = (((useLU )&&(__CLR4_4_1usyusylb90p9uf.R.iget(39988)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39989)==0&false))?
                        new LUDecomposition(mA).getSolver() :
                        new QRDecomposition(mA).getSolver();
                __CLR4_4_1usyusylb90p9uf.R.inc(39990);final double[] dX = solver.solve(new ArrayRealVector(b, false)).toArray();
                // update the estimated parameters
                __CLR4_4_1usyusylb90p9uf.R.inc(39991);for (int i = 0; (((i < nC)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39992)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(39993)==0&false)); ++i) {{
                    __CLR4_4_1usyusylb90p9uf.R.inc(39994);currentPoint[i] += dX[i];
                }
            }} catch (SingularMatrixException e) {
                __CLR4_4_1usyusylb90p9uf.R.inc(39995);throw new ConvergenceException(LocalizedFormats.UNABLE_TO_SOLVE_SINGULAR_PROBLEM);
            }
        }
        // Must never happen.
        }__CLR4_4_1usyusylb90p9uf.R.inc(39996);throw new MathInternalError();
    }finally{__CLR4_4_1usyusylb90p9uf.R.flushNeeded();}}

    /**
     * @throws MathUnsupportedOperationException if bounds were passed to the
     * {@link #optimize(OptimizationData[]) optimize} method.
     */
    private void checkParameters() {try{__CLR4_4_1usyusylb90p9uf.R.inc(39997);
        __CLR4_4_1usyusylb90p9uf.R.inc(39998);if ((((getLowerBound() != null ||
            getUpperBound() != null)&&(__CLR4_4_1usyusylb90p9uf.R.iget(39999)!=0|true))||(__CLR4_4_1usyusylb90p9uf.R.iget(40000)==0&false))) {{
            __CLR4_4_1usyusylb90p9uf.R.inc(40001);throw new MathUnsupportedOperationException(LocalizedFormats.CONSTRAINT);
        }
    }}finally{__CLR4_4_1usyusylb90p9uf.R.flushNeeded();}}
}
