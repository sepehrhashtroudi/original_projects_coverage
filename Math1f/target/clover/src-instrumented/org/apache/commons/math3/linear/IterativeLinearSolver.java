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
package org.apache.commons.math3.linear;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.IterationManager;
import org.apache.commons.math3.util.MathUtils;

/**
 * This abstract class defines an iterative solver for the linear system A
 * &middot; x = b. In what follows, the <em>residual</em> r is defined as r = b
 * - A &middot; x, where A is the linear operator of the linear system, b is the
 * right-hand side vector, and x the current estimate of the solution.
 *
 * @version $Id$
 * @since 3.0
 */
public abstract class IterativeLinearSolver {public static class __CLR4_4_1kxakxalb90p8wx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27149,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The object in charge of managing the iterations. */
    private final IterationManager manager;

    /**
     * Creates a new instance of this class, with default iteration manager.
     *
     * @param maxIterations the maximum number of iterations
     */
    public IterativeLinearSolver(final int maxIterations) {try{__CLR4_4_1kxakxalb90p8wx.R.inc(27118);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27119);this.manager = new IterationManager(maxIterations);
    }finally{__CLR4_4_1kxakxalb90p8wx.R.flushNeeded();}}

    /**
     * Creates a new instance of this class, with custom iteration manager.
     *
     * @param manager the custom iteration manager
     * @throws NullArgumentException if {@code manager} is {@code null}
     */
    public IterativeLinearSolver(final IterationManager manager)
        throws NullArgumentException {try{__CLR4_4_1kxakxalb90p8wx.R.inc(27120);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27121);MathUtils.checkNotNull(manager);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27122);this.manager = manager;
    }finally{__CLR4_4_1kxakxalb90p8wx.R.flushNeeded();}}

    /**
     * Performs all dimension checks on the parameters of
     * {@link #solve(RealLinearOperator, RealVector, RealVector) solve} and
     * {@link #solveInPlace(RealLinearOperator, RealVector, RealVector) solveInPlace},
     * and throws an exception if one of the checks fails.
     *
     * @param a the linear operator A of the system
     * @param b the right-hand side vector
     * @param x0 the initial guess of the solution
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} is not square
     * @throws DimensionMismatchException if {@code b} or {@code x0} have
     * dimensions inconsistent with {@code a}
     */
    protected static void checkParameters(final RealLinearOperator a,
        final RealVector b, final RealVector x0) throws
        NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException {try{__CLR4_4_1kxakxalb90p8wx.R.inc(27123);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27124);MathUtils.checkNotNull(a);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27125);MathUtils.checkNotNull(b);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27126);MathUtils.checkNotNull(x0);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27127);if ((((a.getRowDimension() != a.getColumnDimension())&&(__CLR4_4_1kxakxalb90p8wx.R.iget(27128)!=0|true))||(__CLR4_4_1kxakxalb90p8wx.R.iget(27129)==0&false))) {{
            __CLR4_4_1kxakxalb90p8wx.R.inc(27130);throw new NonSquareOperatorException(a.getRowDimension(),
                                                       a.getColumnDimension());
        }
        }__CLR4_4_1kxakxalb90p8wx.R.inc(27131);if ((((b.getDimension() != a.getRowDimension())&&(__CLR4_4_1kxakxalb90p8wx.R.iget(27132)!=0|true))||(__CLR4_4_1kxakxalb90p8wx.R.iget(27133)==0&false))) {{
            __CLR4_4_1kxakxalb90p8wx.R.inc(27134);throw new DimensionMismatchException(b.getDimension(),
                                                 a.getRowDimension());
        }
        }__CLR4_4_1kxakxalb90p8wx.R.inc(27135);if ((((x0.getDimension() != a.getColumnDimension())&&(__CLR4_4_1kxakxalb90p8wx.R.iget(27136)!=0|true))||(__CLR4_4_1kxakxalb90p8wx.R.iget(27137)==0&false))) {{
            __CLR4_4_1kxakxalb90p8wx.R.inc(27138);throw new DimensionMismatchException(x0.getDimension(),
                                                 a.getColumnDimension());
        }
    }}finally{__CLR4_4_1kxakxalb90p8wx.R.flushNeeded();}}

    /**
     * Returns the iteration manager attached to this solver.
     *
     * @return the manager
     */
    public IterationManager getIterationManager() {try{__CLR4_4_1kxakxalb90p8wx.R.inc(27139);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27140);return manager;
    }finally{__CLR4_4_1kxakxalb90p8wx.R.flushNeeded();}}

    /**
     * Returns an estimate of the solution to the linear system A &middot; x =
     * b.
     *
     * @param a the linear operator A of the system
     * @param b the right-hand side vector
     * @return a new vector containing the solution
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} is not square
     * @throws DimensionMismatchException if {@code b} has dimensions
     * inconsistent with {@code a}
     * @throws MaxCountExceededException at exhaustion of the iteration count,
     * unless a custom
     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}
     * has been set at construction of the {@link IterationManager}
     */
    public RealVector solve(final RealLinearOperator a, final RealVector b)
        throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_1kxakxalb90p8wx.R.inc(27141);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27142);MathUtils.checkNotNull(a);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27143);final RealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_1kxakxalb90p8wx.R.inc(27144);x.set(0.);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27145);return solveInPlace(a, b, x);
    }finally{__CLR4_4_1kxakxalb90p8wx.R.flushNeeded();}}

    /**
     * Returns an estimate of the solution to the linear system A &middot; x =
     * b.
     *
     * @param a the linear operator A of the system
     * @param b the right-hand side vector
     * @param x0 the initial guess of the solution
     * @return a new vector containing the solution
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} is not square
     * @throws DimensionMismatchException if {@code b} or {@code x0} have
     * dimensions inconsistent with {@code a}
     * @throws MaxCountExceededException at exhaustion of the iteration count,
     * unless a custom
     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}
     * has been set at construction of the {@link IterationManager}
     */
    public RealVector solve(RealLinearOperator a, RealVector b, RealVector x0)
        throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, MaxCountExceededException {try{__CLR4_4_1kxakxalb90p8wx.R.inc(27146);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27147);MathUtils.checkNotNull(x0);
        __CLR4_4_1kxakxalb90p8wx.R.inc(27148);return solveInPlace(a, b, x0.copy());
    }finally{__CLR4_4_1kxakxalb90p8wx.R.flushNeeded();}}

    /**
     * Returns an estimate of the solution to the linear system A &middot; x =
     * b. The solution is computed in-place (initial guess is modified).
     *
     * @param a the linear operator A of the system
     * @param b the right-hand side vector
     * @param x0 initial guess of the solution
     * @return a reference to {@code x0} (shallow copy) updated with the
     * solution
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} is not square
     * @throws DimensionMismatchException if {@code b} or {@code x0} have
     * dimensions inconsistent with {@code a}
     * @throws MaxCountExceededException at exhaustion of the iteration count,
     * unless a custom
     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}
     * has been set at construction of the {@link IterationManager}
     */
    public abstract RealVector solveInPlace(RealLinearOperator a, RealVector b,
        RealVector x0) throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, MaxCountExceededException;
}
