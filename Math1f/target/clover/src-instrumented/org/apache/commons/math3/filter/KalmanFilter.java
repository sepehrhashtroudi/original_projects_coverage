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
package org.apache.commons.math3.filter;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.CholeskyDecomposition;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.MatrixDimensionMismatchException;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.SingularMatrixException;
import org.apache.commons.math3.util.MathUtils;

/**
 * Implementation of a Kalman filter to estimate the state <i>x<sub>k</sub></i>
 * of a discrete-time controlled process that is governed by the linear
 * stochastic difference equation:
 *
 * <pre>
 * <i>x<sub>k</sub></i> = <b>A</b><i>x<sub>k-1</sub></i> + <b>B</b><i>u<sub>k-1</sub></i> + <i>w<sub>k-1</sub></i>
 * </pre>
 *
 * with a measurement <i>x<sub>k</sub></i> that is
 *
 * <pre>
 * <i>z<sub>k</sub></i> = <b>H</b><i>x<sub>k</sub></i> + <i>v<sub>k</sub></i>.
 * </pre>
 *
 * <p>
 * The random variables <i>w<sub>k</sub></i> and <i>v<sub>k</sub></i> represent
 * the process and measurement noise and are assumed to be independent of each
 * other and distributed with normal probability (white noise).
 * <p>
 * The Kalman filter cycle involves the following steps:
 * <ol>
 * <li>predict: project the current state estimate ahead in time</li>
 * <li>correct: adjust the projected estimate by an actual measurement</li>
 * </ol>
 * <p>
 * The Kalman filter is initialized with a {@link ProcessModel} and a
 * {@link MeasurementModel}, which contain the corresponding transformation and
 * noise covariance matrices. The parameter names used in the respective models
 * correspond to the following names commonly used in the mathematical
 * literature:
 * <ul>
 * <li>A - state transition matrix</li>
 * <li>B - control input matrix</li>
 * <li>H - measurement matrix</li>
 * <li>Q - process noise covariance matrix</li>
 * <li>R - measurement noise covariance matrix</li>
 * <li>P - error covariance matrix</li>
 * </ul>
 *
 * @see <a href="http://www.cs.unc.edu/~welch/kalman/">Kalman filter
 *      resources</a>
 * @see <a href="http://www.cs.unc.edu/~welch/media/pdf/kalman_intro.pdf">An
 *      introduction to the Kalman filter by Greg Welch and Gary Bishop</a>
 * @see <a href="http://academic.csuohio.edu/simond/courses/eec644/kalman.pdf">
 *      Kalman filter example by Dan Simon</a>
 * @see ProcessModel
 * @see MeasurementModel
 * @since 3.0
 * @version $Id$
 */
public class KalmanFilter {public static class __CLR4_4_19v79v7lb90p7pu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The process model used by this filter instance. */
    private final ProcessModel processModel;
    /** The measurement model used by this filter instance. */
    private final MeasurementModel measurementModel;
    /** The transition matrix, equivalent to A. */
    private RealMatrix transitionMatrix;
    /** The transposed transition matrix. */
    private RealMatrix transitionMatrixT;
    /** The control matrix, equivalent to B. */
    private RealMatrix controlMatrix;
    /** The measurement matrix, equivalent to H. */
    private RealMatrix measurementMatrix;
    /** The transposed measurement matrix. */
    private RealMatrix measurementMatrixT;
    /** The internal state estimation vector, equivalent to x hat. */
    private RealVector stateEstimation;
    /** The error covariance matrix, equivalent to P. */
    private RealMatrix errorCovariance;

    /**
     * Creates a new Kalman filter with the given process and measurement models.
     *
     * @param process
     *            the model defining the underlying process dynamics
     * @param measurement
     *            the model defining the given measurement characteristics
     * @throws NullArgumentException
     *             if any of the given inputs is null (except for the control matrix)
     * @throws NonSquareMatrixException
     *             if the transition matrix is non square
     * @throws DimensionMismatchException
     *             if the column dimension of the transition matrix does not match the dimension of the
     *             initial state estimation vector
     * @throws MatrixDimensionMismatchException
     *             if the matrix dimensions do not fit together
     */
    public KalmanFilter(final ProcessModel process, final MeasurementModel measurement)
            throws NullArgumentException, NonSquareMatrixException, DimensionMismatchException,
                   MatrixDimensionMismatchException {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12787);

        __CLR4_4_19v79v7lb90p7pu.R.inc(12788);MathUtils.checkNotNull(process);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12789);MathUtils.checkNotNull(measurement);

        __CLR4_4_19v79v7lb90p7pu.R.inc(12790);this.processModel = process;
        __CLR4_4_19v79v7lb90p7pu.R.inc(12791);this.measurementModel = measurement;

        __CLR4_4_19v79v7lb90p7pu.R.inc(12792);transitionMatrix = processModel.getStateTransitionMatrix();
        __CLR4_4_19v79v7lb90p7pu.R.inc(12793);MathUtils.checkNotNull(transitionMatrix);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12794);transitionMatrixT = transitionMatrix.transpose();

        // create an empty matrix if no control matrix was given
        __CLR4_4_19v79v7lb90p7pu.R.inc(12795);if ((((processModel.getControlMatrix() == null)&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12796)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12797)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12798);controlMatrix = new Array2DRowRealMatrix();
        } }else {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12799);controlMatrix = processModel.getControlMatrix();
        }

        }__CLR4_4_19v79v7lb90p7pu.R.inc(12800);measurementMatrix = measurementModel.getMeasurementMatrix();
        __CLR4_4_19v79v7lb90p7pu.R.inc(12801);MathUtils.checkNotNull(measurementMatrix);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12802);measurementMatrixT = measurementMatrix.transpose();

        // check that the process and measurement noise matrices are not null
        // they will be directly accessed from the model as they may change
        // over time
        __CLR4_4_19v79v7lb90p7pu.R.inc(12803);RealMatrix processNoise = processModel.getProcessNoise();
        __CLR4_4_19v79v7lb90p7pu.R.inc(12804);MathUtils.checkNotNull(processNoise);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12805);RealMatrix measNoise = measurementModel.getMeasurementNoise();
        __CLR4_4_19v79v7lb90p7pu.R.inc(12806);MathUtils.checkNotNull(measNoise);

        // set the initial state estimate to a zero vector if it is not
        // available from the process model
        __CLR4_4_19v79v7lb90p7pu.R.inc(12807);if ((((processModel.getInitialStateEstimate() == null)&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12808)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12809)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12810);stateEstimation = new ArrayRealVector(transitionMatrix.getColumnDimension());
        } }else {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12811);stateEstimation = processModel.getInitialStateEstimate();
        }

        }__CLR4_4_19v79v7lb90p7pu.R.inc(12812);if ((((transitionMatrix.getColumnDimension() != stateEstimation.getDimension())&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12813)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12814)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12815);throw new DimensionMismatchException(transitionMatrix.getColumnDimension(),
                                                 stateEstimation.getDimension());
        }

        // initialize the error covariance to the process noise if it is not
        // available from the process model
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12816);if ((((processModel.getInitialErrorCovariance() == null)&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12817)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12818)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12819);errorCovariance = processNoise.copy();
        } }else {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12820);errorCovariance = processModel.getInitialErrorCovariance();
        }

        // sanity checks, the control matrix B may be null

        // A must be a square matrix
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12821);if ((((!transitionMatrix.isSquare())&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12822)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12823)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12824);throw new NonSquareMatrixException(
                    transitionMatrix.getRowDimension(),
                    transitionMatrix.getColumnDimension());
        }

        // row dimension of B must be equal to A
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12825);if ((((controlMatrix != null &&
            controlMatrix.getRowDimension() > 0 &&
            controlMatrix.getColumnDimension() > 0 &&
            (controlMatrix.getRowDimension() != transitionMatrix.getRowDimension() ||
             controlMatrix.getColumnDimension() != 1))&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12826)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12827)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12828);throw new MatrixDimensionMismatchException(controlMatrix.getRowDimension(),
                                                       controlMatrix.getColumnDimension(),
                                                       transitionMatrix.getRowDimension(), 1);
        }

        // Q must be equal to A
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12829);MatrixUtils.checkAdditionCompatible(transitionMatrix, processNoise);

        // column dimension of H must be equal to row dimension of A
        __CLR4_4_19v79v7lb90p7pu.R.inc(12830);if ((((measurementMatrix.getColumnDimension() != transitionMatrix.getRowDimension())&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12831)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12832)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12833);throw new MatrixDimensionMismatchException(measurementMatrix.getRowDimension(),
                                                       measurementMatrix.getColumnDimension(),
                                                       measurementMatrix.getRowDimension(),
                                                       transitionMatrix.getRowDimension());
        }

        // row dimension of R must be equal to row dimension of H
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12834);if ((((measNoise.getRowDimension() != measurementMatrix.getRowDimension() ||
            measNoise.getColumnDimension() != 1)&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12835)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12836)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12837);throw new MatrixDimensionMismatchException(measNoise.getRowDimension(),
                                                       measNoise.getColumnDimension(),
                                                       measurementMatrix.getRowDimension(), 1);
        }
    }}finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Returns the dimension of the state estimation vector.
     *
     * @return the state dimension
     */
    public int getStateDimension() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12838);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12839);return stateEstimation.getDimension();
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Returns the dimension of the measurement vector.
     *
     * @return the measurement vector dimension
     */
    public int getMeasurementDimension() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12840);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12841);return measurementMatrix.getRowDimension();
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Returns the current state estimation vector.
     *
     * @return the state estimation vector
     */
    public double[] getStateEstimation() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12842);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12843);return stateEstimation.toArray();
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Returns a copy of the current state estimation vector.
     *
     * @return the state estimation vector
     */
    public RealVector getStateEstimationVector() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12844);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12845);return stateEstimation.copy();
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Returns the current error covariance matrix.
     *
     * @return the error covariance matrix
     */
    public double[][] getErrorCovariance() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12846);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12847);return errorCovariance.getData();
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Returns a copy of the current error covariance matrix.
     *
     * @return the error covariance matrix
     */
    public RealMatrix getErrorCovarianceMatrix() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12848);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12849);return errorCovariance.copy();
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Predict the internal state estimation one time step ahead.
     */
    public void predict() {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12850);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12851);predict((RealVector) null);
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Predict the internal state estimation one time step ahead.
     *
     * @param u
     *            the control vector
     * @throws DimensionMismatchException
     *             if the dimension of the control vector does not fit
     */
    public void predict(final double[] u) throws DimensionMismatchException {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12852);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12853);predict(new ArrayRealVector(u));
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Predict the internal state estimation one time step ahead.
     *
     * @param u
     *            the control vector
     * @throws DimensionMismatchException
     *             if the dimension of the control vector does not match
     */
    public void predict(final RealVector u) throws DimensionMismatchException {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12854);
        // sanity checks
        __CLR4_4_19v79v7lb90p7pu.R.inc(12855);if ((((u != null &&
            u.getDimension() != controlMatrix.getColumnDimension())&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12856)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12857)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12858);throw new DimensionMismatchException(u.getDimension(),
                                                 controlMatrix.getColumnDimension());
        }

        // project the state estimation ahead (a priori state)
        // xHat(k)- = A * xHat(k-1) + B * u(k-1)
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12859);stateEstimation = transitionMatrix.operate(stateEstimation);

        // add control input if it is available
        __CLR4_4_19v79v7lb90p7pu.R.inc(12860);if ((((u != null)&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12861)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12862)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12863);stateEstimation = stateEstimation.add(controlMatrix.operate(u));
        }

        // project the error covariance ahead
        // P(k)- = A * P(k-1) * A' + Q
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12864);errorCovariance = transitionMatrix.multiply(errorCovariance)
                .multiply(transitionMatrixT)
                .add(processModel.getProcessNoise());
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Correct the current state estimate with an actual measurement.
     *
     * @param z
     *            the measurement vector
     * @throws NullArgumentException
     *             if the measurement vector is {@code null}
     * @throws DimensionMismatchException
     *             if the dimension of the measurement vector does not fit
     * @throws SingularMatrixException
     *             if the covariance matrix could not be inverted
     */
    public void correct(final double[] z)
            throws NullArgumentException, DimensionMismatchException, SingularMatrixException {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12865);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12866);correct(new ArrayRealVector(z));
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}

    /**
     * Correct the current state estimate with an actual measurement.
     *
     * @param z
     *            the measurement vector
     * @throws NullArgumentException
     *             if the measurement vector is {@code null}
     * @throws DimensionMismatchException
     *             if the dimension of the measurement vector does not fit
     * @throws SingularMatrixException
     *             if the covariance matrix could not be inverted
     */
    public void correct(final RealVector z)
            throws NullArgumentException, DimensionMismatchException, SingularMatrixException {try{__CLR4_4_19v79v7lb90p7pu.R.inc(12867);

        // sanity checks
        __CLR4_4_19v79v7lb90p7pu.R.inc(12868);MathUtils.checkNotNull(z);
        __CLR4_4_19v79v7lb90p7pu.R.inc(12869);if ((((z.getDimension() != measurementMatrix.getRowDimension())&&(__CLR4_4_19v79v7lb90p7pu.R.iget(12870)!=0|true))||(__CLR4_4_19v79v7lb90p7pu.R.iget(12871)==0&false))) {{
            __CLR4_4_19v79v7lb90p7pu.R.inc(12872);throw new DimensionMismatchException(z.getDimension(),
                                                 measurementMatrix.getRowDimension());
        }

        // S = H * P(k) - * H' + R
        }__CLR4_4_19v79v7lb90p7pu.R.inc(12873);RealMatrix s = measurementMatrix.multiply(errorCovariance)
            .multiply(measurementMatrixT)
            .add(measurementModel.getMeasurementNoise());

        // invert S
        // as the error covariance matrix is a symmetric positive
        // semi-definite matrix, we can use the cholesky decomposition
        __CLR4_4_19v79v7lb90p7pu.R.inc(12874);DecompositionSolver solver = new CholeskyDecomposition(s).getSolver();
        __CLR4_4_19v79v7lb90p7pu.R.inc(12875);RealMatrix invertedS = solver.getInverse();

        // Inn = z(k) - H * xHat(k)-
        __CLR4_4_19v79v7lb90p7pu.R.inc(12876);RealVector innovation = z.subtract(measurementMatrix.operate(stateEstimation));

        // calculate gain matrix
        // K(k) = P(k)- * H' * (H * P(k)- * H' + R)^-1
        // K(k) = P(k)- * H' * S^-1
        __CLR4_4_19v79v7lb90p7pu.R.inc(12877);RealMatrix kalmanGain = errorCovariance.multiply(measurementMatrixT).multiply(invertedS);

        // update estimate with measurement z(k)
        // xHat(k) = xHat(k)- + K * Inn
        __CLR4_4_19v79v7lb90p7pu.R.inc(12878);stateEstimation = stateEstimation.add(kalmanGain.operate(innovation));

        // update covariance of prediction error
        // P(k) = (I - K * H) * P(k)-
        __CLR4_4_19v79v7lb90p7pu.R.inc(12879);RealMatrix identity = MatrixUtils.createRealIdentityMatrix(kalmanGain.getRowDimension());
        __CLR4_4_19v79v7lb90p7pu.R.inc(12880);errorCovariance = identity.subtract(kalmanGain.multiply(measurementMatrix)).multiply(errorCovariance);
    }finally{__CLR4_4_19v79v7lb90p7pu.R.flushNeeded();}}
}
