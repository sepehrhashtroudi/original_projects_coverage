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
import org.apache.commons.math3.exception.util.ExceptionContext;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.IterationManager;
import org.apache.commons.math3.util.MathUtils;

/**
 * <p>
 * Implementation of the SYMMLQ iterative linear solver proposed by <a
 * href="#PAIG1975">Paige and Saunders (1975)</a>. This implementation is
 * largely based on the FORTRAN code by Pr. Michael A. Saunders, available <a
 * href="http://www.stanford.edu/group/SOL/software/symmlq/f77/">here</a>.
 * </p>
 * <p>
 * SYMMLQ is designed to solve the system of linear equations A &middot; x = b
 * where A is an n &times; n self-adjoint linear operator (defined as a
 * {@link RealLinearOperator}), and b is a given vector. The operator A is not
 * required to be positive definite. If A is known to be definite, the method of
 * conjugate gradients might be preferred, since it will require about the same
 * number of iterations as SYMMLQ but slightly less work per iteration.
 * </p>
 * <p>
 * SYMMLQ is designed to solve the system (A - shift &middot; I) &middot; x = b,
 * where shift is a specified scalar value. If shift and b are suitably chosen,
 * the computed vector x may approximate an (unnormalized) eigenvector of A, as
 * in the methods of inverse iteration and/or Rayleigh-quotient iteration.
 * Again, the linear operator (A - shift &middot; I) need not be positive
 * definite (but <em>must</em> be self-adjoint). The work per iteration is very
 * slightly less if shift = 0.
 * </p>
 * <h3>Preconditioning</h3>
 * <p>
 * Preconditioning may reduce the number of iterations required. The solver may
 * be provided with a positive definite preconditioner
 * M = P<sup>T</sup> &middot; P
 * that is known to approximate
 * (A - shift &middot; I)<sup>-1</sup> in some sense, where matrix-vector
 * products of the form M &middot; y = x can be computed efficiently. Then
 * SYMMLQ will implicitly solve the system of equations
 * P &middot; (A - shift &middot; I) &middot; P<sup>T</sup> &middot;
 * x<sub>hat</sub> = P &middot; b, i.e.
 * A<sub>hat</sub> &middot; x<sub>hat</sub> = b<sub>hat</sub>,
 * where
 * A<sub>hat</sub> = P &middot; (A - shift &middot; I) &middot; P<sup>T</sup>,
 * b<sub>hat</sub> = P &middot; b,
 * and return the solution
 * x = P<sup>T</sup> &middot; x<sub>hat</sub>.
 * The associated residual is
 * r<sub>hat</sub> = b<sub>hat</sub> - A<sub>hat</sub> &middot; x<sub>hat</sub>
 *                 = P &middot; [b - (A - shift &middot; I) &middot; x]
 *                 = P &middot; r.
 * </p>
 * <p>
 * In the case of preconditioning, the {@link IterativeLinearSolverEvent}s that
 * this solver fires are such that
 * {@link IterativeLinearSolverEvent#getNormOfResidual()} returns the norm of
 * the <em>preconditioned</em>, updated residual, ||P &middot; r||, not the norm
 * of the <em>true</em> residual ||r||.
 * </p>
 * <h3><a id="stopcrit">Default stopping criterion</a></h3>
 * <p>
 * A default stopping criterion is implemented. The iterations stop when || rhat
 * || &le; &delta; || Ahat || || xhat ||, where xhat is the current estimate of
 * the solution of the transformed system, rhat the current estimate of the
 * corresponding residual, and &delta; a user-specified tolerance.
 * </p>
 * <h3>Iteration count</h3>
 * <p>
 * In the present context, an iteration should be understood as one evaluation
 * of the matrix-vector product A &middot; x. The initialization phase therefore
 * counts as one iteration. If the user requires checks on the symmetry of A,
 * this entails one further matrix-vector product in the initial phase. This
 * further product is <em>not</em> accounted for in the iteration count. In
 * other words, the number of iterations required to reach convergence will be
 * identical, whether checks have been required or not.
 * </p>
 * <p>
 * The present definition of the iteration count differs from that adopted in
 * the original FOTRAN code, where the initialization phase was <em>not</em>
 * taken into account.
 * </p>
 * <h3><a id="initguess">Initial guess of the solution</a></h3>
 * <p>
 * The {@code x} parameter in
 * <ul>
 * <li>{@link #solve(RealLinearOperator, RealVector, RealVector)},</li>
 * <li>{@link #solve(RealLinearOperator, RealLinearOperator, RealVector, RealVector)}},</li>
 * <li>{@link #solveInPlace(RealLinearOperator, RealVector, RealVector)},</li>
 * <li>{@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector)},</li>
 * <li>{@link #solveInPlace(RealLinearOperator, RealLinearOperator, RealVector, RealVector, boolean, double)},</li>
 * </ul>
 * should not be considered as an initial guess, as it is set to zero in the
 * initial phase. If x<sub>0</sub> is known to be a good approximation to x, one
 * should compute r<sub>0</sub> = b - A &middot; x, solve A &middot; dx = r0,
 * and set x = x<sub>0</sub> + dx.
 * </p>
 * <h3><a id="context">Exception context</a></h3>
 * <p>
 * Besides standard {@link DimensionMismatchException}, this class might throw
 * {@link NonSelfAdjointOperatorException} if the linear operator or the
 * preconditioner are not symmetric. In this case, the {@link ExceptionContext}
 * provides more information
 * <ul>
 * <li>key {@code "operator"} points to the offending linear operator, say L,</li>
 * <li>key {@code "vector1"} points to the first offending vector, say x,
 * <li>key {@code "vector2"} points to the second offending vector, say y, such
 * that x<sup>T</sup> &middot; L &middot; y &ne; y<sup>T</sup> &middot; L
 * &middot; x (within a certain accuracy).</li>
 * </ul>
 * </p>
 * <p>
 * {@link NonPositiveDefiniteOperatorException} might also be thrown in case the
 * preconditioner is not positive definite. The relevant keys to the
 * {@link ExceptionContext} are
 * <ul>
 * <li>key {@code "operator"}, which points to the offending linear operator,
 * say L,</li>
 * <li>key {@code "vector"}, which points to the offending vector, say x, such
 * that x<sup>T</sup> &middot; L &middot; x < 0.</li>
 * </ul>
 * </p>
 * <h3>References</h3>
 * <dl>
 * <dt><a id="PAIG1975">Paige and Saunders (1975)</a></dt>
 * <dd>C. C. Paige and M. A. Saunders, <a
 * href="http://www.stanford.edu/group/SOL/software/symmlq/PS75.pdf"><em>
 * Solution of Sparse Indefinite Systems of Linear Equations</em></a>, SIAM
 * Journal on Numerical Analysis 12(4): 617-629, 1975</dd>
 * </dl>
 *
 * @version $Id$
 * @since 3.0
 */
public class SymmLQ
    extends PreconditionedIterativeLinearSolver {public static class __CLR4_4_1nrynrylb90p96q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * IMPLEMENTATION NOTES
     * --------------------
     * The implementation follows as closely as possible the notations of Paige
     * and Saunders (1975). Attention must be paid to the fact that some
     * quantities which are relevant to iteration k can only be computed in
     * iteration (k+1). Therefore, minute attention must be paid to the index of
     * each state variable of this algorithm.
     *
     * 1. Preconditioning
     *    ---------------
     * The Lanczos iterations associated with Ahat and bhat read
     *   beta[1] = ||P * b||
     *   v[1] = P * b / beta[1]
     *   beta[k+1] * v[k+1] = Ahat * v[k] - alpha[k] * v[k] - beta[k] * v[k-1]
     *                      = P * (A - shift * I) * P' * v[k] - alpha[k] * v[k]
     *                        - beta[k] * v[k-1]
     * Multiplying both sides by P', we get
     *   beta[k+1] * (P' * v)[k+1] = M * (A - shift * I) * (P' * v)[k]
     *                               - alpha[k] * (P' * v)[k]
     *                               - beta[k] * (P' * v[k-1]),
     * and
     *   alpha[k+1] = v[k+1]' * Ahat * v[k+1]
     *              = v[k+1]' * P * (A - shift * I) * P' * v[k+1]
     *              = (P' * v)[k+1]' * (A - shift * I) * (P' * v)[k+1].
     *
     * In other words, the Lanczos iterations are unchanged, except for the fact
     * that we really compute (P' * v) instead of v. It can easily be checked
     * that all other formulas are unchanged. It must be noted that P is never
     * explicitly used, only matrix-vector products involving are invoked.
     *
     * 2. Accounting for the shift parameter
     *    ----------------------------------
     * Is trivial: each time A.operate(x) is invoked, one must subtract shift * x
     * to the result.
     *
     * 3. Accounting for the goodb flag
     *    -----------------------------
     * When goodb is set to true, the component of xL along b is computed
     * separately. From Paige and Saunders (1975), equation (5.9), we have
     *   wbar[k+1] = s[k] * wbar[k] - c[k] * v[k+1],
     *   wbar[1] = v[1].
     * Introducing wbar2[k] = wbar[k] - s[1] * ... * s[k-1] * v[1], it can
     * easily be verified by induction that wbar2 follows the same recursive
     * relation
     *   wbar2[k+1] = s[k] * wbar2[k] - c[k] * v[k+1],
     *   wbar2[1] = 0,
     * and we then have
     *   w[k] = c[k] * wbar2[k] + s[k] * v[k+1]
     *          + s[1] * ... * s[k-1] * c[k] * v[1].
     * Introducing w2[k] = w[k] - s[1] * ... * s[k-1] * c[k] * v[1], we find,
     * from (5.10)
     *   xL[k] = zeta[1] * w[1] + ... + zeta[k] * w[k]
     *         = zeta[1] * w2[1] + ... + zeta[k] * w2[k]
     *           + (s[1] * c[2] * zeta[2] + ...
     *           + s[1] * ... * s[k-1] * c[k] * zeta[k]) * v[1]
     *         = xL2[k] + bstep[k] * v[1],
     * where xL2[k] is defined by
     *   xL2[0] = 0,
     *   xL2[k+1] = xL2[k] + zeta[k+1] * w2[k+1],
     * and bstep is defined by
     *   bstep[1] = 0,
     *   bstep[k] = bstep[k-1] + s[1] * ... * s[k-1] * c[k] * zeta[k].
     * We also have, from (5.11)
     *   xC[k] = xL[k-1] + zbar[k] * wbar[k]
     *         = xL2[k-1] + zbar[k] * wbar2[k]
     *           + (bstep[k-1] + s[1] * ... * s[k-1] * zbar[k]) * v[1].
     */

    /**
     * <p>
     * A simple container holding the non-final variables used in the
     * iterations. Making the current state of the solver visible from the
     * outside is necessary, because during the iterations, {@code x} does not
     * <em>exactly</em> hold the current estimate of the solution. Indeed,
     * {@code x} needs in general to be moved from the LQ point to the CG point.
     * Besides, additional upudates must be carried out in case {@code goodb} is
     * set to {@code true}.
     * </p>
     * <p>
     * In all subsequent comments, the description of the state variables refer
     * to their value after a call to {@link #update()}. In these comments, k is
     * the current number of evaluations of matrix-vector products.
     * </p>
     */
    private static class State {
        /** The cubic root of {@link #MACH_PREC}. */
        static final double CBRT_MACH_PREC;

        /** The machine precision. */
        static final double MACH_PREC;

        /** Reference to the linear operator. */
        private final RealLinearOperator a;

        /** Reference to the right-hand side vector. */
        private final RealVector b;

        /** {@code true} if symmetry of matrix and conditioner must be checked. */
        private final boolean check;

        /**
         * The value of the custom tolerance &delta; for the default stopping
         * criterion.
         */
        private final double delta;

        /** The value of beta[k+1]. */
        private double beta;

        /** The value of beta[1]. */
        private double beta1;

        /** The value of bstep[k-1]. */
        private double bstep;

        /** The estimate of the norm of P * rC[k]. */
        private double cgnorm;

        /** The value of dbar[k+1] = -beta[k+1] * c[k-1]. */
        private double dbar;

        /**
         * The value of gamma[k] * zeta[k]. Was called {@code rhs1} in the
         * initial code.
         */
        private double gammaZeta;

        /** The value of gbar[k]. */
        private double gbar;

        /** The value of max(|alpha[1]|, gamma[1], ..., gamma[k-1]). */
        private double gmax;

        /** The value of min(|alpha[1]|, gamma[1], ..., gamma[k-1]). */
        private double gmin;

        /** Copy of the {@code goodb} parameter. */
        private final boolean goodb;

        /** {@code true} if the default convergence criterion is verified. */
        private boolean hasConverged;

        /** The estimate of the norm of P * rL[k-1]. */
        private double lqnorm;

        /** Reference to the preconditioner, M. */
        private final RealLinearOperator m;

        /**
         * The value of (-eps[k+1] * zeta[k-1]). Was called {@code rhs2} in the
         * initial code.
         */
        private double minusEpsZeta;

        /** The value of M * b. */
        private final RealVector mb;

        /** The value of beta[k]. */
        private double oldb;

        /** The value of beta[k] * M^(-1) * P' * v[k]. */
        private RealVector r1;

        /** The value of beta[k+1] * M^(-1) * P' * v[k+1]. */
        private RealVector r2;

        /**
         * The value of the updated, preconditioned residual P * r. This value is
         * given by {@code min(}{@link #cgnorm}{@code , }{@link #lqnorm}{@code )}.
         */
        private double rnorm;

        /** Copy of the {@code shift} parameter. */
        private final double shift;

        /** The value of s[1] * ... * s[k-1]. */
        private double snprod;

        /**
         * An estimate of the square of the norm of A * V[k], based on Paige and
         * Saunders (1975), equation (3.3).
         */
        private double tnorm;

        /**
         * The value of P' * wbar[k] or P' * (wbar[k] - s[1] * ... * s[k-1] *
         * v[1]) if {@code goodb} is {@code true}. Was called {@code w} in the
         * initial code.
         */
        private RealVector wbar;

        /**
         * A reference to the vector to be updated with the solution. Contains
         * the value of xL[k-1] if {@code goodb} is {@code false}, (xL[k-1] -
         * bstep[k-1] * v[1]) otherwise.
         */
        private final RealVector xL;

        /** The value of beta[k+1] * P' * v[k+1]. */
        private RealVector y;

        /** The value of zeta[1]^2 + ... + zeta[k-1]^2. */
        private double ynorm2;

        /** The value of {@code b == 0} (exact floating-point equality). */
        private boolean bIsNull;

        static {try{__CLR4_4_1nrynrylb90p96q.R.inc(30814);
            __CLR4_4_1nrynrylb90p96q.R.inc(30815);MACH_PREC = FastMath.ulp(1.);
            __CLR4_4_1nrynrylb90p96q.R.inc(30816);CBRT_MACH_PREC = FastMath.cbrt(MACH_PREC);
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Creates and inits to k = 1 a new instance of this class.
         *
         * @param a the linear operator A of the system
         * @param m the preconditioner, M (can be {@code null})
         * @param b the right-hand side vector
         * @param goodb usually {@code false}, except if {@code x} is expected
         * to contain a large multiple of {@code b}
         * @param shift the amount to be subtracted to all diagonal elements of
         * A
         * @param delta the &delta; parameter for the default stopping criterion
         * @param check {@code true} if self-adjointedness of both matrix and
         * preconditioner should be checked
         */
        public State(final RealLinearOperator a,
            final RealLinearOperator m,
            final RealVector b,
            final boolean goodb,
            final double shift,
            final double delta,
            final boolean check) {try{__CLR4_4_1nrynrylb90p96q.R.inc(30817);
            __CLR4_4_1nrynrylb90p96q.R.inc(30818);this.a = a;
            __CLR4_4_1nrynrylb90p96q.R.inc(30819);this.m = m;
            __CLR4_4_1nrynrylb90p96q.R.inc(30820);this.b = b;
            __CLR4_4_1nrynrylb90p96q.R.inc(30821);this.xL = new ArrayRealVector(b.getDimension());
            __CLR4_4_1nrynrylb90p96q.R.inc(30822);this.goodb = goodb;
            __CLR4_4_1nrynrylb90p96q.R.inc(30823);this.shift = shift;
            __CLR4_4_1nrynrylb90p96q.R.inc(30824);this.mb = (((m == null )&&(__CLR4_4_1nrynrylb90p96q.R.iget(30825)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30826)==0&false))? b : m.operate(b);
            __CLR4_4_1nrynrylb90p96q.R.inc(30827);this.hasConverged = false;
            __CLR4_4_1nrynrylb90p96q.R.inc(30828);this.check = check;
            __CLR4_4_1nrynrylb90p96q.R.inc(30829);this.delta = delta;
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Performs a symmetry check on the specified linear operator, and throws an
         * exception in case this check fails. Given a linear operator L, and a
         * vector x, this method checks that
         * x' &middot; L &middot; y = y' &middot; L &middot; x
         * (within a given accuracy), where y = L &middot; x.
         *
         * @param l the linear operator L
         * @param x the candidate vector x
         * @param y the candidate vector y = L &middot; x
         * @param z the vector z = L &middot; y
         * @throws NonSelfAdjointOperatorException when the test fails
         */
        private static void checkSymmetry(final RealLinearOperator l,
            final RealVector x, final RealVector y, final RealVector z)
            throws NonSelfAdjointOperatorException {try{__CLR4_4_1nrynrylb90p96q.R.inc(30830);
            __CLR4_4_1nrynrylb90p96q.R.inc(30831);final double s = y.dotProduct(y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30832);final double t = x.dotProduct(z);
            __CLR4_4_1nrynrylb90p96q.R.inc(30833);final double epsa = (s + MACH_PREC) * CBRT_MACH_PREC;
            __CLR4_4_1nrynrylb90p96q.R.inc(30834);if ((((FastMath.abs(s - t) > epsa)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30835)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30836)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30837);final NonSelfAdjointOperatorException e;
                __CLR4_4_1nrynrylb90p96q.R.inc(30838);e = new NonSelfAdjointOperatorException();
                __CLR4_4_1nrynrylb90p96q.R.inc(30839);final ExceptionContext context = e.getContext();
                __CLR4_4_1nrynrylb90p96q.R.inc(30840);context.setValue(SymmLQ.OPERATOR, l);
                __CLR4_4_1nrynrylb90p96q.R.inc(30841);context.setValue(SymmLQ.VECTOR1, x);
                __CLR4_4_1nrynrylb90p96q.R.inc(30842);context.setValue(SymmLQ.VECTOR2, y);
                __CLR4_4_1nrynrylb90p96q.R.inc(30843);context.setValue(SymmLQ.THRESHOLD, Double.valueOf(epsa));
                __CLR4_4_1nrynrylb90p96q.R.inc(30844);throw e;
            }
        }}finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Throws a new {@link NonPositiveDefiniteOperatorException} with
         * appropriate context.
         *
         * @param l the offending linear operator
         * @param v the offending vector
         * @throws NonPositiveDefiniteOperatorException in any circumstances
         */
        private static void throwNPDLOException(final RealLinearOperator l,
            final RealVector v) throws NonPositiveDefiniteOperatorException {try{__CLR4_4_1nrynrylb90p96q.R.inc(30845);
            __CLR4_4_1nrynrylb90p96q.R.inc(30846);final NonPositiveDefiniteOperatorException e;
            __CLR4_4_1nrynrylb90p96q.R.inc(30847);e = new NonPositiveDefiniteOperatorException();
            __CLR4_4_1nrynrylb90p96q.R.inc(30848);final ExceptionContext context = e.getContext();
            __CLR4_4_1nrynrylb90p96q.R.inc(30849);context.setValue(OPERATOR, l);
            __CLR4_4_1nrynrylb90p96q.R.inc(30850);context.setValue(VECTOR, v);
            __CLR4_4_1nrynrylb90p96q.R.inc(30851);throw e;
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * A clone of the BLAS {@code DAXPY} function, which carries out the
         * operation y &larr; a &middot; x + y. This is for internal use only: no
         * dimension checks are provided.
         *
         * @param a the scalar by which {@code x} is to be multiplied
         * @param x the vector to be added to {@code y}
         * @param y the vector to be incremented
         */
        private static void daxpy(final double a, final RealVector x,
            final RealVector y) {try{__CLR4_4_1nrynrylb90p96q.R.inc(30852);
            __CLR4_4_1nrynrylb90p96q.R.inc(30853);final int n = x.getDimension();
            __CLR4_4_1nrynrylb90p96q.R.inc(30854);for (int i = 0; (((i < n)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30855)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30856)==0&false)); i++) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30857);y.setEntry(i, a * x.getEntry(i) + y.getEntry(i));
            }
        }}finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * A BLAS-like function, for the operation z &larr; a &middot; x + b
         * &middot; y + z. This is for internal use only: no dimension checks are
         * provided.
         *
         * @param a the scalar by which {@code x} is to be multiplied
         * @param x the first vector to be added to {@code z}
         * @param b the scalar by which {@code y} is to be multiplied
         * @param y the second vector to be added to {@code z}
         * @param z the vector to be incremented
         */
        private static void daxpbypz(final double a, final RealVector x,
            final double b, final RealVector y, final RealVector z) {try{__CLR4_4_1nrynrylb90p96q.R.inc(30858);
            __CLR4_4_1nrynrylb90p96q.R.inc(30859);final int n = z.getDimension();
            __CLR4_4_1nrynrylb90p96q.R.inc(30860);for (int i = 0; (((i < n)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30861)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30862)==0&false)); i++) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30863);final double zi;
                __CLR4_4_1nrynrylb90p96q.R.inc(30864);zi = a * x.getEntry(i) + b * y.getEntry(i) + z.getEntry(i);
                __CLR4_4_1nrynrylb90p96q.R.inc(30865);z.setEntry(i, zi);
            }
        }}finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * <p>
         * Move to the CG point if it seems better. In this version of SYMMLQ,
         * the convergence tests involve only cgnorm, so we're unlikely to stop
         * at an LQ point, except if the iteration limit interferes.
         * </p>
         * <p>
         * Additional upudates are also carried out in case {@code goodb} is set
         * to {@code true}.
         * </p>
         *
         * @param x the vector to be updated with the refined value of xL
         */
         void refineSolution(final RealVector x) {try{__CLR4_4_1nrynrylb90p96q.R.inc(30866);
            __CLR4_4_1nrynrylb90p96q.R.inc(30867);final int n = this.xL.getDimension();
            __CLR4_4_1nrynrylb90p96q.R.inc(30868);if ((((lqnorm < cgnorm)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30869)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30870)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30871);if ((((!goodb)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30872)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30873)==0&false))) {{
                    __CLR4_4_1nrynrylb90p96q.R.inc(30874);x.setSubVector(0, this.xL);
                } }else {{
                    __CLR4_4_1nrynrylb90p96q.R.inc(30875);final double step = bstep / beta1;
                    __CLR4_4_1nrynrylb90p96q.R.inc(30876);for (int i = 0; (((i < n)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30877)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30878)==0&false)); i++) {{
                        __CLR4_4_1nrynrylb90p96q.R.inc(30879);final double bi = mb.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30880);final double xi = this.xL.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30881);x.setEntry(i, xi + step * bi);
                    }
                }}
            }} }else {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30882);final double anorm = FastMath.sqrt(tnorm);
                __CLR4_4_1nrynrylb90p96q.R.inc(30883);final double diag = (((gbar == 0. )&&(__CLR4_4_1nrynrylb90p96q.R.iget(30884)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30885)==0&false))? anorm * MACH_PREC : gbar;
                __CLR4_4_1nrynrylb90p96q.R.inc(30886);final double zbar = gammaZeta / diag;
                __CLR4_4_1nrynrylb90p96q.R.inc(30887);final double step = (bstep + snprod * zbar) / beta1;
                // ynorm = FastMath.sqrt(ynorm2 + zbar * zbar);
                __CLR4_4_1nrynrylb90p96q.R.inc(30888);if ((((!goodb)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30889)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30890)==0&false))) {{
                    __CLR4_4_1nrynrylb90p96q.R.inc(30891);for (int i = 0; (((i < n)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30892)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30893)==0&false)); i++) {{
                        __CLR4_4_1nrynrylb90p96q.R.inc(30894);final double xi = this.xL.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30895);final double wi = wbar.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30896);x.setEntry(i, xi + zbar * wi);
                    }
                }} }else {{
                    __CLR4_4_1nrynrylb90p96q.R.inc(30897);for (int i = 0; (((i < n)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30898)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30899)==0&false)); i++) {{
                        __CLR4_4_1nrynrylb90p96q.R.inc(30900);final double xi = this.xL.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30901);final double wi = wbar.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30902);final double bi = mb.getEntry(i);
                        __CLR4_4_1nrynrylb90p96q.R.inc(30903);x.setEntry(i, xi + zbar * wi + step * bi);
                    }
                }}
            }}
        }}finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Performs the initial phase of the SYMMLQ algorithm. On return, the
         * value of the state variables of {@code this} object correspond to k =
         * 1.
         */
         void init() {try{__CLR4_4_1nrynrylb90p96q.R.inc(30904);
            __CLR4_4_1nrynrylb90p96q.R.inc(30905);this.xL.set(0.);
            /*
             * Set up y for the first Lanczos vector. y and beta1 will be zero
             * if b = 0.
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30906);this.r1 = this.b.copy();
            __CLR4_4_1nrynrylb90p96q.R.inc(30907);this.y = (((this.m == null )&&(__CLR4_4_1nrynrylb90p96q.R.iget(30908)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30909)==0&false))? this.b.copy() : this.m.operate(this.r1);
            __CLR4_4_1nrynrylb90p96q.R.inc(30910);if (((((this.m != null) && this.check)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30911)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30912)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30913);checkSymmetry(this.m, this.r1, this.y, this.m.operate(this.y));
            }

            }__CLR4_4_1nrynrylb90p96q.R.inc(30914);this.beta1 = this.r1.dotProduct(this.y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30915);if ((((this.beta1 < 0.)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30916)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30917)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30918);throwNPDLOException(this.m, this.y);
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30919);if ((((this.beta1 == 0.)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30920)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30921)==0&false))) {{
                /* If b = 0 exactly, stop with x = 0. */
                __CLR4_4_1nrynrylb90p96q.R.inc(30922);this.bIsNull = true;
                __CLR4_4_1nrynrylb90p96q.R.inc(30923);return;
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30924);this.bIsNull = false;
            __CLR4_4_1nrynrylb90p96q.R.inc(30925);this.beta1 = FastMath.sqrt(this.beta1);
            /* At this point
             *   r1 = b,
             *   y = M * b,
             *   beta1 = beta[1].
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30926);final RealVector v = this.y.mapMultiply(1. / this.beta1);
            __CLR4_4_1nrynrylb90p96q.R.inc(30927);this.y = this.a.operate(v);
            __CLR4_4_1nrynrylb90p96q.R.inc(30928);if ((((this.check)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30929)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30930)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30931);checkSymmetry(this.a, v, this.y, this.a.operate(this.y));
            }
            /*
             * Set up y for the second Lanczos vector. y and beta will be zero
             * or very small if b is an eigenvector.
             */
            }__CLR4_4_1nrynrylb90p96q.R.inc(30932);daxpy(-this.shift, v, this.y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30933);final double alpha = v.dotProduct(this.y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30934);daxpy(-alpha / this.beta1, this.r1, this.y);
            /*
             * At this point
             *   alpha = alpha[1]
             *   y     = beta[2] * M^(-1) * P' * v[2]
             */
            /* Make sure r2 will be orthogonal to the first v. */
            __CLR4_4_1nrynrylb90p96q.R.inc(30935);final double vty = v.dotProduct(this.y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30936);final double vtv = v.dotProduct(v);
            __CLR4_4_1nrynrylb90p96q.R.inc(30937);daxpy(-vty / vtv, v, this.y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30938);this.r2 = this.y.copy();
            __CLR4_4_1nrynrylb90p96q.R.inc(30939);if ((((this.m != null)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30940)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30941)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30942);this.y = this.m.operate(this.r2);
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30943);this.oldb = this.beta1;
            __CLR4_4_1nrynrylb90p96q.R.inc(30944);this.beta = this.r2.dotProduct(this.y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30945);if ((((this.beta < 0.)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30946)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30947)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30948);throwNPDLOException(this.m, this.y);
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30949);this.beta = FastMath.sqrt(this.beta);
            /*
             * At this point
             *   oldb = beta[1]
             *   beta = beta[2]
             *   y  = beta[2] * P' * v[2]
             *   r2 = beta[2] * M^(-1) * P' * v[2]
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30950);this.cgnorm = this.beta1;
            __CLR4_4_1nrynrylb90p96q.R.inc(30951);this.gbar = alpha;
            __CLR4_4_1nrynrylb90p96q.R.inc(30952);this.dbar = this.beta;
            __CLR4_4_1nrynrylb90p96q.R.inc(30953);this.gammaZeta = this.beta1;
            __CLR4_4_1nrynrylb90p96q.R.inc(30954);this.minusEpsZeta = 0.;
            __CLR4_4_1nrynrylb90p96q.R.inc(30955);this.bstep = 0.;
            __CLR4_4_1nrynrylb90p96q.R.inc(30956);this.snprod = 1.;
            __CLR4_4_1nrynrylb90p96q.R.inc(30957);this.tnorm = alpha * alpha + this.beta * this.beta;
            __CLR4_4_1nrynrylb90p96q.R.inc(30958);this.ynorm2 = 0.;
            __CLR4_4_1nrynrylb90p96q.R.inc(30959);this.gmax = FastMath.abs(alpha) + MACH_PREC;
            __CLR4_4_1nrynrylb90p96q.R.inc(30960);this.gmin = this.gmax;

            __CLR4_4_1nrynrylb90p96q.R.inc(30961);if ((((this.goodb)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30962)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30963)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30964);this.wbar = new ArrayRealVector(this.a.getRowDimension());
                __CLR4_4_1nrynrylb90p96q.R.inc(30965);this.wbar.set(0.);
            } }else {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30966);this.wbar = v;
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30967);updateNorms();
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Performs the next iteration of the algorithm. The iteration count
         * should be incremented prior to calling this method. On return, the
         * value of the state variables of {@code this} object correspond to the
         * current iteration count {@code k}.
         */
        void update() {try{__CLR4_4_1nrynrylb90p96q.R.inc(30968);
            __CLR4_4_1nrynrylb90p96q.R.inc(30969);final RealVector v = y.mapMultiply(1. / beta);
            __CLR4_4_1nrynrylb90p96q.R.inc(30970);y = a.operate(v);
            __CLR4_4_1nrynrylb90p96q.R.inc(30971);daxpbypz(-shift, v, -beta / oldb, r1, y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30972);final double alpha = v.dotProduct(y);
            /*
             * At this point
             *   v     = P' * v[k],
             *   y     = (A - shift * I) * P' * v[k] - beta[k] * M^(-1) * P' * v[k-1],
             *   alpha = v'[k] * P * (A - shift * I) * P' * v[k]
             *           - beta[k] * v[k]' * P * M^(-1) * P' * v[k-1]
             *         = v'[k] * P * (A - shift * I) * P' * v[k]
             *           - beta[k] * v[k]' * v[k-1]
             *         = alpha[k].
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30973);daxpy(-alpha / beta, r2, y);
            /*
             * At this point
             *   y = (A - shift * I) * P' * v[k] - alpha[k] * M^(-1) * P' * v[k]
             *       - beta[k] * M^(-1) * P' * v[k-1]
             *     = M^(-1) * P' * (P * (A - shift * I) * P' * v[k] -alpha[k] * v[k]
             *       - beta[k] * v[k-1])
             *     = beta[k+1] * M^(-1) * P' * v[k+1],
             * from Paige and Saunders (1975), equation (3.2).
             *
             * WATCH-IT: the two following lines work only because y is no longer
             * updated up to the end of the present iteration, and is
             * reinitialized at the beginning of the next iteration.
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30974);r1 = r2;
            __CLR4_4_1nrynrylb90p96q.R.inc(30975);r2 = y;
            __CLR4_4_1nrynrylb90p96q.R.inc(30976);if ((((m != null)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30977)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30978)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30979);y = m.operate(r2);
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30980);oldb = beta;
            __CLR4_4_1nrynrylb90p96q.R.inc(30981);beta = r2.dotProduct(y);
            __CLR4_4_1nrynrylb90p96q.R.inc(30982);if ((((beta < 0.)&&(__CLR4_4_1nrynrylb90p96q.R.iget(30983)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(30984)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(30985);throwNPDLOException(m, y);
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(30986);beta = FastMath.sqrt(beta);
            /*
             * At this point
             *   r1 = beta[k] * M^(-1) * P' * v[k],
             *   r2 = beta[k+1] * M^(-1) * P' * v[k+1],
             *   y  = beta[k+1] * P' * v[k+1],
             *   oldb = beta[k],
             *   beta = beta[k+1].
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30987);tnorm += alpha * alpha + oldb * oldb + beta * beta;
            /*
             * Compute the next plane rotation for Q. See Paige and Saunders
             * (1975), equation (5.6), with
             *   gamma = gamma[k-1],
             *   c     = c[k-1],
             *   s     = s[k-1].
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30988);final double gamma = FastMath.sqrt(gbar * gbar + oldb * oldb);
            __CLR4_4_1nrynrylb90p96q.R.inc(30989);final double c = gbar / gamma;
            __CLR4_4_1nrynrylb90p96q.R.inc(30990);final double s = oldb / gamma;
            /*
             * The relations
             *   gbar[k] = s[k-1] * (-c[k-2] * beta[k]) - c[k-1] * alpha[k]
             *           = s[k-1] * dbar[k] - c[k-1] * alpha[k],
             *   delta[k] = c[k-1] * dbar[k] + s[k-1] * alpha[k],
             * are not stated in Paige and Saunders (1975), but can be retrieved
             * by expanding the (k, k-1) and (k, k) coefficients of the matrix in
             * equation (5.5).
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30991);final double deltak = c * dbar + s * alpha;
            __CLR4_4_1nrynrylb90p96q.R.inc(30992);gbar = s * dbar - c * alpha;
            __CLR4_4_1nrynrylb90p96q.R.inc(30993);final double eps = s * beta;
            __CLR4_4_1nrynrylb90p96q.R.inc(30994);dbar = -c * beta;
            __CLR4_4_1nrynrylb90p96q.R.inc(30995);final double zeta = gammaZeta / gamma;
            /*
             * At this point
             *   gbar   = gbar[k]
             *   deltak = delta[k]
             *   eps    = eps[k+1]
             *   dbar   = dbar[k+1]
             *   zeta   = zeta[k-1]
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(30996);final double zetaC = zeta * c;
            __CLR4_4_1nrynrylb90p96q.R.inc(30997);final double zetaS = zeta * s;
            __CLR4_4_1nrynrylb90p96q.R.inc(30998);final int n = xL.getDimension();
            __CLR4_4_1nrynrylb90p96q.R.inc(30999);for (int i = 0; (((i < n)&&(__CLR4_4_1nrynrylb90p96q.R.iget(31000)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31001)==0&false)); i++) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(31002);final double xi = xL.getEntry(i);
                __CLR4_4_1nrynrylb90p96q.R.inc(31003);final double vi = v.getEntry(i);
                __CLR4_4_1nrynrylb90p96q.R.inc(31004);final double wi = wbar.getEntry(i);
                __CLR4_4_1nrynrylb90p96q.R.inc(31005);xL.setEntry(i, xi + wi * zetaC + vi * zetaS);
                __CLR4_4_1nrynrylb90p96q.R.inc(31006);wbar.setEntry(i, wi * s - vi * c);
            }
            /*
             * At this point
             *   x = xL[k-1],
             *   ptwbar = P' wbar[k],
             * see Paige and Saunders (1975), equations (5.9) and (5.10).
             */
            }__CLR4_4_1nrynrylb90p96q.R.inc(31007);bstep += snprod * c * zeta;
            __CLR4_4_1nrynrylb90p96q.R.inc(31008);snprod *= s;
            __CLR4_4_1nrynrylb90p96q.R.inc(31009);gmax = FastMath.max(gmax, gamma);
            __CLR4_4_1nrynrylb90p96q.R.inc(31010);gmin = FastMath.min(gmin, gamma);
            __CLR4_4_1nrynrylb90p96q.R.inc(31011);ynorm2 += zeta * zeta;
            __CLR4_4_1nrynrylb90p96q.R.inc(31012);gammaZeta = minusEpsZeta - deltak * zeta;
            __CLR4_4_1nrynrylb90p96q.R.inc(31013);minusEpsZeta = -eps * zeta;
            /*
             * At this point
             *   snprod       = s[1] * ... * s[k-1],
             *   gmax         = max(|alpha[1]|, gamma[1], ..., gamma[k-1]),
             *   gmin         = min(|alpha[1]|, gamma[1], ..., gamma[k-1]),
             *   ynorm2       = zeta[1]^2 + ... + zeta[k-1]^2,
             *   gammaZeta    = gamma[k] * zeta[k],
             *   minusEpsZeta = -eps[k+1] * zeta[k-1].
             * The relation for gammaZeta can be retrieved from Paige and
             * Saunders (1975), equation (5.4a), last line of the vector
             * gbar[k] * zbar[k] = -eps[k] * zeta[k-2] - delta[k] * zeta[k-1].
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(31014);updateNorms();
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Computes the norms of the residuals, and checks for convergence.
         * Updates {@link #lqnorm} and {@link #cgnorm}.
         */
        private void updateNorms() {try{__CLR4_4_1nrynrylb90p96q.R.inc(31015);
            __CLR4_4_1nrynrylb90p96q.R.inc(31016);final double anorm = FastMath.sqrt(tnorm);
            __CLR4_4_1nrynrylb90p96q.R.inc(31017);final double ynorm = FastMath.sqrt(ynorm2);
            __CLR4_4_1nrynrylb90p96q.R.inc(31018);final double epsa = anorm * MACH_PREC;
            __CLR4_4_1nrynrylb90p96q.R.inc(31019);final double epsx = anorm * ynorm * MACH_PREC;
            __CLR4_4_1nrynrylb90p96q.R.inc(31020);final double epsr = anorm * ynorm * delta;
            __CLR4_4_1nrynrylb90p96q.R.inc(31021);final double diag = (((gbar == 0. )&&(__CLR4_4_1nrynrylb90p96q.R.iget(31022)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31023)==0&false))? epsa : gbar;
            __CLR4_4_1nrynrylb90p96q.R.inc(31024);lqnorm = FastMath.sqrt(gammaZeta * gammaZeta +
                                   minusEpsZeta * minusEpsZeta);
            __CLR4_4_1nrynrylb90p96q.R.inc(31025);final double qrnorm = snprod * beta1;
            __CLR4_4_1nrynrylb90p96q.R.inc(31026);cgnorm = qrnorm * beta / FastMath.abs(diag);

            /*
             * Estimate cond(A). In this version we look at the diagonals of L
             * in the factorization of the tridiagonal matrix, T = L * Q.
             * Sometimes, T[k] can be misleadingly ill-conditioned when T[k+1]
             * is not, so we must be careful not to overestimate acond.
             */
            __CLR4_4_1nrynrylb90p96q.R.inc(31027);final double acond;
            __CLR4_4_1nrynrylb90p96q.R.inc(31028);if ((((lqnorm <= cgnorm)&&(__CLR4_4_1nrynrylb90p96q.R.iget(31029)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31030)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(31031);acond = gmax / gmin;
            } }else {{
                __CLR4_4_1nrynrylb90p96q.R.inc(31032);acond = gmax / FastMath.min(gmin, FastMath.abs(diag));
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(31033);if ((((acond * MACH_PREC >= 0.1)&&(__CLR4_4_1nrynrylb90p96q.R.iget(31034)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31035)==0&false))) {{
                __CLR4_4_1nrynrylb90p96q.R.inc(31036);throw new IllConditionedOperatorException(acond);
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(31037);if ((((beta1 <= epsx)&&(__CLR4_4_1nrynrylb90p96q.R.iget(31038)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31039)==0&false))) {{
                /*
                 * x has converged to an eigenvector of A corresponding to the
                 * eigenvalue shift.
                 */
                __CLR4_4_1nrynrylb90p96q.R.inc(31040);throw new SingularOperatorException();
            }
            }__CLR4_4_1nrynrylb90p96q.R.inc(31041);rnorm = FastMath.min(cgnorm, lqnorm);
            __CLR4_4_1nrynrylb90p96q.R.inc(31042);hasConverged = (cgnorm <= epsx) || (cgnorm <= epsr);
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Returns {@code true} if the default stopping criterion is fulfilled.
         *
         * @return {@code true} if convergence of the iterations has occurred
         */
        boolean hasConverged() {try{__CLR4_4_1nrynrylb90p96q.R.inc(31043);
            __CLR4_4_1nrynrylb90p96q.R.inc(31044);return hasConverged;
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Returns {@code true} if the right-hand side vector is zero exactly.
         *
         * @return the boolean value of {@code b == 0}
         */
        boolean bEqualsNullVector() {try{__CLR4_4_1nrynrylb90p96q.R.inc(31045);
            __CLR4_4_1nrynrylb90p96q.R.inc(31046);return bIsNull;
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Returns {@code true} if {@code beta} is essentially zero. This method
         * is used to check for early stop of the iterations.
         *
         * @return {@code true} if {@code beta < }{@link #MACH_PREC}
         */
        boolean betaEqualsZero() {try{__CLR4_4_1nrynrylb90p96q.R.inc(31047);
            __CLR4_4_1nrynrylb90p96q.R.inc(31048);return beta < MACH_PREC;
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

        /**
         * Returns the norm of the updated, preconditioned residual.
         *
         * @return the norm of the residual, ||P * r||
         */
        double getNormOfResidual() {try{__CLR4_4_1nrynrylb90p96q.R.inc(31049);
            __CLR4_4_1nrynrylb90p96q.R.inc(31050);return rnorm;
        }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}
    }

    /** Key for the exception context. */
    private static final String OPERATOR = "operator";

    /** Key for the exception context. */
    private static final String THRESHOLD = "threshold";

    /** Key for the exception context. */
    private static final String VECTOR = "vector";

    /** Key for the exception context. */
    private static final String VECTOR1 = "vector1";

    /** Key for the exception context. */
    private static final String VECTOR2 = "vector2";

    /** {@code true} if symmetry of matrix and conditioner must be checked. */
    private final boolean check;

    /**
     * The value of the custom tolerance &delta; for the default stopping
     * criterion.
     */
    private final double delta;

    /**
     * Creates a new instance of this class, with <a href="#stopcrit">default
     * stopping criterion</a>. Note that setting {@code check} to {@code true}
     * entails an extra matrix-vector product in the initial phase.
     *
     * @param maxIterations the maximum number of iterations
     * @param delta the &delta; parameter for the default stopping criterion
     * @param check {@code true} if self-adjointedness of both matrix and
     * preconditioner should be checked
     */
    public SymmLQ(final int maxIterations, final double delta,
                  final boolean check) {
        super(maxIterations);__CLR4_4_1nrynrylb90p96q.R.inc(31052);try{__CLR4_4_1nrynrylb90p96q.R.inc(31051);
        __CLR4_4_1nrynrylb90p96q.R.inc(31053);this.delta = delta;
        __CLR4_4_1nrynrylb90p96q.R.inc(31054);this.check = check;
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * Creates a new instance of this class, with <a href="#stopcrit">default
     * stopping criterion</a> and custom iteration manager. Note that setting
     * {@code check} to {@code true} entails an extra matrix-vector product in
     * the initial phase.
     *
     * @param manager the custom iteration manager
     * @param delta the &delta; parameter for the default stopping criterion
     * @param check {@code true} if self-adjointedness of both matrix and
     * preconditioner should be checked
     */
    public SymmLQ(final IterationManager manager, final double delta,
                  final boolean check) {
        super(manager);__CLR4_4_1nrynrylb90p96q.R.inc(31056);try{__CLR4_4_1nrynrylb90p96q.R.inc(31055);
        __CLR4_4_1nrynrylb90p96q.R.inc(31057);this.delta = delta;
        __CLR4_4_1nrynrylb90p96q.R.inc(31058);this.check = check;
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * Returns {@code true} if symmetry of the matrix, and symmetry as well as
     * positive definiteness of the preconditioner should be checked.
     *
     * @return {@code true} if the tests are to be performed
     */
    public final boolean getCheck() {try{__CLR4_4_1nrynrylb90p96q.R.inc(31059);
        __CLR4_4_1nrynrylb90p96q.R.inc(31060);return check;
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} or {@code m} is not self-adjoint
     * @throws NonPositiveDefiniteOperatorException if {@code m} is not
     * positive definite
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    @Override
    public RealVector solve(final RealLinearOperator a,
        final RealLinearOperator m, final RealVector b) throws
        NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, MaxCountExceededException,
        NonSelfAdjointOperatorException, NonPositiveDefiniteOperatorException,
        IllConditionedOperatorException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31061);
        __CLR4_4_1nrynrylb90p96q.R.inc(31062);MathUtils.checkNotNull(a);
        __CLR4_4_1nrynrylb90p96q.R.inc(31063);final RealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_1nrynrylb90p96q.R.inc(31064);return solveInPlace(a, m, b, x, false, 0.);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * Returns an estimate of the solution to the linear system (A - shift
     * &middot; I) &middot; x = b.
     * <p>
     * If the solution x is expected to contain a large multiple of {@code b}
     * (as in Rayleigh-quotient iteration), then better precision may be
     * achieved with {@code goodb} set to {@code true}; this however requires an
     * extra call to the preconditioner.
     * </p>
     * <p>
     * {@code shift} should be zero if the system A &middot; x = b is to be
     * solved. Otherwise, it could be an approximation to an eigenvalue of A,
     * such as the Rayleigh quotient b<sup>T</sup> &middot; A &middot; b /
     * (b<sup>T</sup> &middot; b) corresponding to the vector b. If b is
     * sufficiently like an eigenvector corresponding to an eigenvalue near
     * shift, then the computed x may have very large components. When
     * normalized, x may be closer to an eigenvector than b.
     * </p>
     *
     * @param a the linear operator A of the system
     * @param m the preconditioner, M (can be {@code null})
     * @param b the right-hand side vector
     * @param goodb usually {@code false}, except if {@code x} is expected to
     * contain a large multiple of {@code b}
     * @param shift the amount to be subtracted to all diagonal elements of A
     * @return a reference to {@code x} (shallow copy)
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} or {@code m} is not square
     * @throws DimensionMismatchException if {@code m} or {@code b} have dimensions
     * inconsistent with {@code a}
     * @throws MaxCountExceededException at exhaustion of the iteration count,
     * unless a custom
     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}
     * has been set at construction of the {@link IterationManager}
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} or {@code m} is not self-adjoint
     * @throws NonPositiveDefiniteOperatorException if {@code m} is not
     * positive definite
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    public RealVector solve(final RealLinearOperator a,
        final RealLinearOperator m, final RealVector b, final boolean goodb,
        final double shift) throws NullArgumentException,
        NonSquareOperatorException, DimensionMismatchException,
        MaxCountExceededException, NonSelfAdjointOperatorException,
        NonPositiveDefiniteOperatorException, IllConditionedOperatorException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31065);
        __CLR4_4_1nrynrylb90p96q.R.inc(31066);MathUtils.checkNotNull(a);
        __CLR4_4_1nrynrylb90p96q.R.inc(31067);final RealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_1nrynrylb90p96q.R.inc(31068);return solveInPlace(a, m, b, x, goodb, shift);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param x not meaningful in this implementation; should not be considered
     * as an initial guess (<a href="#initguess">more</a>)
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} or {@code m} is not self-adjoint
     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive
     * definite
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    @Override
    public RealVector solve(final RealLinearOperator a,
        final RealLinearOperator m, final RealVector b, final RealVector x)
        throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, NonSelfAdjointOperatorException,
        NonPositiveDefiniteOperatorException, IllConditionedOperatorException,
        MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31069);
        __CLR4_4_1nrynrylb90p96q.R.inc(31070);MathUtils.checkNotNull(x);
        __CLR4_4_1nrynrylb90p96q.R.inc(31071);return solveInPlace(a, m, b, x.copy(), false, 0.);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} is not self-adjoint
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    @Override
    public RealVector solve(final RealLinearOperator a, final RealVector b)
        throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, NonSelfAdjointOperatorException,
        IllConditionedOperatorException, MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31072);
        __CLR4_4_1nrynrylb90p96q.R.inc(31073);MathUtils.checkNotNull(a);
        __CLR4_4_1nrynrylb90p96q.R.inc(31074);final RealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_1nrynrylb90p96q.R.inc(31075);x.set(0.);
        __CLR4_4_1nrynrylb90p96q.R.inc(31076);return solveInPlace(a, null, b, x, false, 0.);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * Returns the solution to the system (A - shift &middot; I) &middot; x = b.
     * <p>
     * If the solution x is expected to contain a large multiple of {@code b}
     * (as in Rayleigh-quotient iteration), then better precision may be
     * achieved with {@code goodb} set to {@code true}.
     * </p>
     * <p>
     * {@code shift} should be zero if the system A &middot; x = b is to be
     * solved. Otherwise, it could be an approximation to an eigenvalue of A,
     * such as the Rayleigh quotient b<sup>T</sup> &middot; A &middot; b /
     * (b<sup>T</sup> &middot; b) corresponding to the vector b. If b is
     * sufficiently like an eigenvector corresponding to an eigenvalue near
     * shift, then the computed x may have very large components. When
     * normalized, x may be closer to an eigenvector than b.
     * </p>
     *
     * @param a the linear operator A of the system
     * @param b the right-hand side vector
     * @param goodb usually {@code false}, except if {@code x} is expected to
     * contain a large multiple of {@code b}
     * @param shift the amount to be subtracted to all diagonal elements of A
     * @return a reference to {@code x}
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} is not square
     * @throws DimensionMismatchException if {@code b} has dimensions
     * inconsistent with {@code a}
     * @throws MaxCountExceededException at exhaustion of the iteration count,
     * unless a custom
     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}
     * has been set at construction of the {@link IterationManager}
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} is not self-adjoint
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    public RealVector solve(final RealLinearOperator a, final RealVector b,
        final boolean goodb, final double shift) throws NullArgumentException,
        NonSquareOperatorException, DimensionMismatchException,
        NonSelfAdjointOperatorException, IllConditionedOperatorException,
        MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31077);
        __CLR4_4_1nrynrylb90p96q.R.inc(31078);MathUtils.checkNotNull(a);
        __CLR4_4_1nrynrylb90p96q.R.inc(31079);final RealVector x = new ArrayRealVector(a.getColumnDimension());
        __CLR4_4_1nrynrylb90p96q.R.inc(31080);return solveInPlace(a, null, b, x, goodb, shift);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param x not meaningful in this implementation; should not be considered
     * as an initial guess (<a href="#initguess">more</a>)
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} is not self-adjoint
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    @Override
    public RealVector solve(final RealLinearOperator a, final RealVector b,
        final RealVector x) throws NullArgumentException,
        NonSquareOperatorException, DimensionMismatchException,
        NonSelfAdjointOperatorException, IllConditionedOperatorException,
        MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31081);
        __CLR4_4_1nrynrylb90p96q.R.inc(31082);MathUtils.checkNotNull(x);
        __CLR4_4_1nrynrylb90p96q.R.inc(31083);return solveInPlace(a, null, b, x.copy(), false, 0.);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param x the vector to be updated with the solution; {@code x} should
     * not be considered as an initial guess (<a href="#initguess">more</a>)
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} or {@code m} is not self-adjoint
     * @throws NonPositiveDefiniteOperatorException if {@code m} is not
     * positive definite
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    @Override
    public RealVector solveInPlace(final RealLinearOperator a,
        final RealLinearOperator m, final RealVector b, final RealVector x)
        throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, NonSelfAdjointOperatorException,
        NonPositiveDefiniteOperatorException, IllConditionedOperatorException,
        MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31084);
        __CLR4_4_1nrynrylb90p96q.R.inc(31085);return solveInPlace(a, m, b, x, false, 0.);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * Returns an estimate of the solution to the linear system (A - shift
     * &middot; I) &middot; x = b. The solution is computed in-place.
     * <p>
     * If the solution x is expected to contain a large multiple of {@code b}
     * (as in Rayleigh-quotient iteration), then better precision may be
     * achieved with {@code goodb} set to {@code true}; this however requires an
     * extra call to the preconditioner.
     * </p>
     * <p>
     * {@code shift} should be zero if the system A &middot; x = b is to be
     * solved. Otherwise, it could be an approximation to an eigenvalue of A,
     * such as the Rayleigh quotient b<sup>T</sup> &middot; A &middot; b /
     * (b<sup>T</sup> &middot; b) corresponding to the vector b. If b is
     * sufficiently like an eigenvector corresponding to an eigenvalue near
     * shift, then the computed x may have very large components. When
     * normalized, x may be closer to an eigenvector than b.
     * </p>
     *
     * @param a the linear operator A of the system
     * @param m the preconditioner, M (can be {@code null})
     * @param b the right-hand side vector
     * @param x the vector to be updated with the solution; {@code x} should
     * not be considered as an initial guess (<a href="#initguess">more</a>)
     * @param goodb usually {@code false}, except if {@code x} is expected to
     * contain a large multiple of {@code b}
     * @param shift the amount to be subtracted to all diagonal elements of A
     * @return a reference to {@code x} (shallow copy).
     * @throws NullArgumentException if one of the parameters is {@code null}
     * @throws NonSquareOperatorException if {@code a} or {@code m} is not square
     * @throws DimensionMismatchException if {@code m}, {@code b} or {@code x}
     * have dimensions inconsistent with {@code a}.
     * @throws MaxCountExceededException at exhaustion of the iteration count,
     * unless a custom
     * {@link org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback callback}
     * has been set at construction of the {@link IterationManager}
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} or {@code m} is not self-adjoint
     * @throws NonPositiveDefiniteOperatorException if {@code m} is not positive
     * definite
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    public RealVector solveInPlace(final RealLinearOperator a,
        final RealLinearOperator m, final RealVector b,
        final RealVector x, final boolean goodb, final double shift)
        throws NullArgumentException, NonSquareOperatorException,
        DimensionMismatchException, NonSelfAdjointOperatorException,
        NonPositiveDefiniteOperatorException, IllConditionedOperatorException,
        MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31086);
        __CLR4_4_1nrynrylb90p96q.R.inc(31087);checkParameters(a, m, b, x);

        __CLR4_4_1nrynrylb90p96q.R.inc(31088);final IterationManager manager = getIterationManager();
        /* Initialization counts as an iteration. */
        __CLR4_4_1nrynrylb90p96q.R.inc(31089);manager.resetIterationCount();
        __CLR4_4_1nrynrylb90p96q.R.inc(31090);manager.incrementIterationCount();

        __CLR4_4_1nrynrylb90p96q.R.inc(31091);final State state;
        __CLR4_4_1nrynrylb90p96q.R.inc(31092);state = new State(a, m, b, goodb, shift, delta, check);
        __CLR4_4_1nrynrylb90p96q.R.inc(31093);state.init();
        __CLR4_4_1nrynrylb90p96q.R.inc(31094);state.refineSolution(x);
        __CLR4_4_1nrynrylb90p96q.R.inc(31095);IterativeLinearSolverEvent event;
        __CLR4_4_1nrynrylb90p96q.R.inc(31096);event = new DefaultIterativeLinearSolverEvent(this,
                                                      manager.getIterations(),
                                                      x,
                                                      b,
                                                      state.getNormOfResidual());
        __CLR4_4_1nrynrylb90p96q.R.inc(31097);if ((((state.bEqualsNullVector())&&(__CLR4_4_1nrynrylb90p96q.R.iget(31098)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31099)==0&false))) {{
            /* If b = 0 exactly, stop with x = 0. */
            __CLR4_4_1nrynrylb90p96q.R.inc(31100);manager.fireTerminationEvent(event);
            __CLR4_4_1nrynrylb90p96q.R.inc(31101);return x;
        }
        /* Cause termination if beta is essentially zero. */
        }__CLR4_4_1nrynrylb90p96q.R.inc(31102);final boolean earlyStop;
        __CLR4_4_1nrynrylb90p96q.R.inc(31103);earlyStop = state.betaEqualsZero() || state.hasConverged();
        __CLR4_4_1nrynrylb90p96q.R.inc(31104);manager.fireInitializationEvent(event);
        __CLR4_4_1nrynrylb90p96q.R.inc(31105);if ((((!earlyStop)&&(__CLR4_4_1nrynrylb90p96q.R.iget(31106)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31107)==0&false))) {{
            __CLR4_4_1nrynrylb90p96q.R.inc(31108);do {{
                __CLR4_4_1nrynrylb90p96q.R.inc(31109);manager.incrementIterationCount();
                __CLR4_4_1nrynrylb90p96q.R.inc(31110);event = new DefaultIterativeLinearSolverEvent(this,
                                                              manager.getIterations(),
                                                              x,
                                                              b,
                                                              state.getNormOfResidual());
                __CLR4_4_1nrynrylb90p96q.R.inc(31111);manager.fireIterationStartedEvent(event);
                __CLR4_4_1nrynrylb90p96q.R.inc(31112);state.update();
                __CLR4_4_1nrynrylb90p96q.R.inc(31113);state.refineSolution(x);
                __CLR4_4_1nrynrylb90p96q.R.inc(31114);event = new DefaultIterativeLinearSolverEvent(this,
                                                              manager.getIterations(),
                                                              x,
                                                              b,
                                                              state.getNormOfResidual());
                __CLR4_4_1nrynrylb90p96q.R.inc(31115);manager.fireIterationPerformedEvent(event);
            } }while ((((!state.hasConverged())&&(__CLR4_4_1nrynrylb90p96q.R.iget(31116)!=0|true))||(__CLR4_4_1nrynrylb90p96q.R.iget(31117)==0&false)));
        }
        }__CLR4_4_1nrynrylb90p96q.R.inc(31118);event = new DefaultIterativeLinearSolverEvent(this,
                                                      manager.getIterations(),
                                                      x,
                                                      b,
                                                      state.getNormOfResidual());
        __CLR4_4_1nrynrylb90p96q.R.inc(31119);manager.fireTerminationEvent(event);
        __CLR4_4_1nrynrylb90p96q.R.inc(31120);return x;
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @param x the vector to be updated with the solution; {@code x} should
     * not be considered as an initial guess (<a href="#initguess">more</a>)
     * @throws NonSelfAdjointOperatorException if {@link #getCheck()} is
     * {@code true}, and {@code a} is not self-adjoint
     * @throws IllConditionedOperatorException if {@code a} is ill-conditioned
     */
    @Override
    public RealVector solveInPlace(final RealLinearOperator a,
        final RealVector b, final RealVector x) throws NullArgumentException,
        NonSquareOperatorException, DimensionMismatchException,
        NonSelfAdjointOperatorException, IllConditionedOperatorException,
        MaxCountExceededException {try{__CLR4_4_1nrynrylb90p96q.R.inc(31121);
        __CLR4_4_1nrynrylb90p96q.R.inc(31122);return solveInPlace(a, null, b, x, false, 0.);
    }finally{__CLR4_4_1nrynrylb90p96q.R.flushNeeded();}}
}
