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
import org.apache.commons.math3.util.IterationManager;

/**
 * <p>
 * This is an implementation of the conjugate gradient method for
 * {@link RealLinearOperator}. It follows closely the template by <a
 * href="#BARR1994">Barrett et al. (1994)</a> (figure 2.5). The linear system at
 * hand is A &middot; x = b, and the residual is r = b - A &middot; x.
 * </p>
 * <h3><a id="stopcrit">Default stopping criterion</a></h3>
 * <p>
 * A default stopping criterion is implemented. The iterations stop when || r ||
 * &le; &delta; || b ||, where b is the right-hand side vector, r the current
 * estimate of the residual, and &delta; a user-specified tolerance. It should
 * be noted that r is the so-called <em>updated</em> residual, which might
 * differ from the true residual due to rounding-off errors (see e.g. <a
 * href="#STRA2002">Strakos and Tichy, 2002</a>).
 * </p>
 * <h3>Iteration count</h3>
 * <p>
 * In the present context, an iteration should be understood as one evaluation
 * of the matrix-vector product A &middot; x. The initialization phase therefore
 * counts as one iteration.
 * </p>
 * <h3><a id="context">Exception context</a></h3>
 * <p>
 * Besides standard {@link DimensionMismatchException}, this class might throw
 * {@link NonPositiveDefiniteOperatorException} if the linear operator or
 * the preconditioner are not positive definite. In this case, the
 * {@link ExceptionContext} provides some more information
 * <ul>
 * <li>key {@code "operator"} points to the offending linear operator, say L,</li>
 * <li>key {@code "vector"} points to the offending vector, say x, such that
 * x<sup>T</sup> &middot; L &middot; x < 0.</li>
 * </ul>
 * </p>
 * <h3>References</h3>
 * <dl>
 * <dt><a id="BARR1994">Barret et al. (1994)</a></dt>
 * <dd>R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,
 * V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,
 * <a href="http://www.netlib.org/linalg/html_templates/Templates.html"><em>
 * Templates for the Solution of Linear Systems: Building Blocks for Iterative
 * Methods</em></a>, SIAM</dd>
 * <dt><a id="STRA2002">Strakos and Tichy (2002)
 * <dt>
 * <dd>Z. Strakos and P. Tichy, <a
 * href="http://etna.mcs.kent.edu/vol.13.2002/pp56-80.dir/pp56-80.pdf">
 * <em>On error estimation in the conjugate gradient method and why it works
 * in finite precision computations</em></a>, Electronic Transactions on
 * Numerical Analysis 13: 56-80, 2002</dd>
 * </dl>
 *
 * @version $Id$
 * @since 3.0
 */
public class ConjugateGradient
    extends PreconditionedIterativeLinearSolver {public static class __CLR4_4_1jz7jz7lb90p8u1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,25976,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Key for the <a href="#context">exception context</a>. */
    public static final String OPERATOR = "operator";

    /** Key for the <a href="#context">exception context</a>. */
    public static final String VECTOR = "vector";

    /**
     * {@code true} if positive-definiteness of matrix and preconditioner should
     * be checked.
     */
    private boolean check;

    /** The value of &delta;, for the default stopping criterion. */
    private final double delta;

    /**
     * Creates a new instance of this class, with <a href="#stopcrit">default
     * stopping criterion</a>.
     *
     * @param maxIterations the maximum number of iterations
     * @param delta the &delta; parameter for the default stopping criterion
     * @param check {@code true} if positive definiteness of both matrix and
     * preconditioner should be checked
     */
    public ConjugateGradient(final int maxIterations, final double delta,
                             final boolean check) {
        super(maxIterations);__CLR4_4_1jz7jz7lb90p8u1.R.inc(25892);try{__CLR4_4_1jz7jz7lb90p8u1.R.inc(25891);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25893);this.delta = delta;
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25894);this.check = check;
    }finally{__CLR4_4_1jz7jz7lb90p8u1.R.flushNeeded();}}

    /**
     * Creates a new instance of this class, with <a href="#stopcrit">default
     * stopping criterion</a> and custom iteration manager.
     *
     * @param manager the custom iteration manager
     * @param delta the &delta; parameter for the default stopping criterion
     * @param check {@code true} if positive definiteness of both matrix and
     * preconditioner should be checked
     * @throws NullArgumentException if {@code manager} is {@code null}
     */
    public ConjugateGradient(final IterationManager manager,
                             final double delta, final boolean check)
        throws NullArgumentException {
        super(manager);__CLR4_4_1jz7jz7lb90p8u1.R.inc(25896);try{__CLR4_4_1jz7jz7lb90p8u1.R.inc(25895);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25897);this.delta = delta;
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25898);this.check = check;
    }finally{__CLR4_4_1jz7jz7lb90p8u1.R.flushNeeded();}}

    /**
     * Returns {@code true} if positive-definiteness should be checked for both
     * matrix and preconditioner.
     *
     * @return {@code true} if the tests are to be performed
     */
    public final boolean getCheck() {try{__CLR4_4_1jz7jz7lb90p8u1.R.inc(25899);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25900);return check;
    }finally{__CLR4_4_1jz7jz7lb90p8u1.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * @throws NonPositiveDefiniteOperatorException if {@code a} or {@code m} is
     * not positive definite
     */
    @Override
    public RealVector solveInPlace(final RealLinearOperator a,
                                   final RealLinearOperator m,
                                   final RealVector b,
                                   final RealVector x0)
        throws NullArgumentException, NonPositiveDefiniteOperatorException,
        NonSquareOperatorException, DimensionMismatchException,
        MaxCountExceededException, NonPositiveDefiniteOperatorException {try{__CLR4_4_1jz7jz7lb90p8u1.R.inc(25901);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25902);checkParameters(a, m, b, x0);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25903);final IterationManager manager = getIterationManager();
        // Initialization of default stopping criterion
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25904);manager.resetIterationCount();
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25905);final double rmax = delta * b.getNorm();
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25906);final RealVector bro = RealVector.unmodifiableRealVector(b);

        // Initialization phase counts as one iteration.
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25907);manager.incrementIterationCount();
        // p and x are constructed as copies of x0, since presumably, the type
        // of x is optimized for the calculation of the matrix-vector product
        // A.x.
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25908);final RealVector x = x0;
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25909);final RealVector xro = RealVector.unmodifiableRealVector(x);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25910);final RealVector p = x.copy();
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25911);RealVector q = a.operate(p);

        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25912);final RealVector r = b.combine(1, -1, q);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25913);final RealVector rro = RealVector.unmodifiableRealVector(r);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25914);double rnorm = r.getNorm();
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25915);RealVector z;
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25916);if ((((m == null)&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25917)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25918)==0&false))) {{
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25919);z = r;
        } }else {{
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25920);z = null;
        }
        }__CLR4_4_1jz7jz7lb90p8u1.R.inc(25921);IterativeLinearSolverEvent evt;
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25922);evt = new DefaultIterativeLinearSolverEvent(this,
            manager.getIterations(), xro, bro, rro, rnorm);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25923);manager.fireInitializationEvent(evt);
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25924);if ((((rnorm <= rmax)&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25925)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25926)==0&false))) {{
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25927);manager.fireTerminationEvent(evt);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25928);return x;
        }
        }__CLR4_4_1jz7jz7lb90p8u1.R.inc(25929);double rhoPrev = 0.;
        __CLR4_4_1jz7jz7lb90p8u1.R.inc(25930);while (true) {{
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25931);manager.incrementIterationCount();
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25932);evt = new DefaultIterativeLinearSolverEvent(this,
                manager.getIterations(), xro, bro, rro, rnorm);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25933);manager.fireIterationStartedEvent(evt);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25934);if ((((m != null)&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25935)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25936)==0&false))) {{
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25937);z = m.operate(r);
            }
            }__CLR4_4_1jz7jz7lb90p8u1.R.inc(25938);final double rhoNext = r.dotProduct(z);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25939);if ((((check && (rhoNext <= 0.))&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25940)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25941)==0&false))) {{
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25942);final NonPositiveDefiniteOperatorException e;
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25943);e = new NonPositiveDefiniteOperatorException();
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25944);final ExceptionContext context = e.getContext();
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25945);context.setValue(OPERATOR, m);
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25946);context.setValue(VECTOR, r);
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25947);throw e;
            }
            }__CLR4_4_1jz7jz7lb90p8u1.R.inc(25948);if ((((manager.getIterations() == 2)&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25949)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25950)==0&false))) {{
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25951);p.setSubVector(0, z);
            } }else {{
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25952);p.combineToSelf(rhoNext / rhoPrev, 1., z);
            }
            }__CLR4_4_1jz7jz7lb90p8u1.R.inc(25953);q = a.operate(p);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25954);final double pq = p.dotProduct(q);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25955);if ((((check && (pq <= 0.))&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25956)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25957)==0&false))) {{
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25958);final NonPositiveDefiniteOperatorException e;
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25959);e = new NonPositiveDefiniteOperatorException();
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25960);final ExceptionContext context = e.getContext();
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25961);context.setValue(OPERATOR, a);
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25962);context.setValue(VECTOR, p);
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25963);throw e;
            }
            }__CLR4_4_1jz7jz7lb90p8u1.R.inc(25964);final double alpha = rhoNext / pq;
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25965);x.combineToSelf(1., alpha, p);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25966);r.combineToSelf(1., -alpha, q);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25967);rhoPrev = rhoNext;
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25968);rnorm = r.getNorm();
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25969);evt = new DefaultIterativeLinearSolverEvent(this,
                manager.getIterations(), xro, bro, rro, rnorm);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25970);manager.fireIterationPerformedEvent(evt);
            __CLR4_4_1jz7jz7lb90p8u1.R.inc(25971);if ((((rnorm <= rmax)&&(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25972)!=0|true))||(__CLR4_4_1jz7jz7lb90p8u1.R.iget(25973)==0&false))) {{
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25974);manager.fireTerminationEvent(evt);
                __CLR4_4_1jz7jz7lb90p8u1.R.inc(25975);return x;
            }
        }}
    }}finally{__CLR4_4_1jz7jz7lb90p8u1.R.flushNeeded();}}
}
