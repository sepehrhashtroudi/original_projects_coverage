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

import org.apache.commons.math3.util.IterationEvent;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;

/**
 * This is the base class for all events occurring during the iterations of a
 * {@link IterativeLinearSolver}.
 *
 * @version $Id$
 * @since 3.0
 */
public abstract class IterativeLinearSolverEvent
    extends IterationEvent {public static class __CLR4_4_1ky5ky5lb90p8x0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27155,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serialization identifier. */
    private static final long serialVersionUID = 20120129L;

    /**
     * Creates a new instance of this class.
     *
     * @param source the iterative algorithm on which the event initially
     * occurred
     * @param iterations the number of iterations performed at the time
     * {@code this} event is created
     */
    public IterativeLinearSolverEvent(final Object source, final int iterations) {
        super(source, iterations);__CLR4_4_1ky5ky5lb90p8x0.R.inc(27150);try{__CLR4_4_1ky5ky5lb90p8x0.R.inc(27149);
    }finally{__CLR4_4_1ky5ky5lb90p8x0.R.flushNeeded();}}

    /**
     * Returns the current right-hand side of the linear system to be solved.
     * This method should return an unmodifiable view, or a deep copy of the
     * actual right-hand side vector, in order not to compromise subsequent
     * iterations of the source {@link IterativeLinearSolver}.
     *
     * @return the right-hand side vector, b
     */
    public abstract RealVector getRightHandSideVector();

    /**
     * Returns the norm of the residual. The returned value is not required to
     * be <em>exact</em>. Instead, the norm of the so-called <em>updated</em>
     * residual (if available) should be returned. For example, the
     * {@link ConjugateGradient conjugate gradient} method computes a sequence
     * of residuals, the norm of which is cheap to compute. However, due to
     * accumulation of round-off errors, this residual might differ from the
     * true residual after some iterations. See e.g. A. Greenbaum and
     * Z. Strakos, <em>Predicting the Behavior of Finite Precision Lanzos and
     * Conjugate Gradient Computations</em>, Technical Report 538, Department of
     * Computer Science, New York University, 1991 (available
     * <a href="http://www.archive.org/details/predictingbehavi00gree">here</a>).
     *
     * @return the norm of the residual, ||r||
     */
    public abstract double getNormOfResidual();

    /**
     * <p>
     * Returns the residual. This is an optional operation, as all iterative
     * linear solvers do not provide cheap estimate of the updated residual
     * vector, in which case
     * </p>
     * <ul>
     * <li>this method should throw a
     * {@link MathUnsupportedOperationException},</li>
     * <li>{@link #providesResidual()} returns {@code false}.</li>
     * </ul>
     * <p>
     * The default implementation throws a
     * {@link MathUnsupportedOperationException}. If this method is overriden,
     * then {@link #providesResidual()} should be overriden as well.
     * </p>
     *
     * @return the updated residual, r
     */
    public RealVector getResidual() {try{__CLR4_4_1ky5ky5lb90p8x0.R.inc(27151);
        __CLR4_4_1ky5ky5lb90p8x0.R.inc(27152);throw new MathUnsupportedOperationException();
    }finally{__CLR4_4_1ky5ky5lb90p8x0.R.flushNeeded();}}

    /**
     * Returns the current estimate of the solution to the linear system to be
     * solved. This method should return an unmodifiable view, or a deep copy of
     * the actual current solution, in order not to compromise subsequent
     * iterations of the source {@link IterativeLinearSolver}.
     *
     * @return the solution, x
     */
    public abstract RealVector getSolution();

    /**
     * Returns {@code true} if {@link #getResidual()} is supported. The default
     * implementation returns {@code false}.
     *
     * @return {@code false} if {@link #getResidual()} throws a
     * {@link MathUnsupportedOperationException}
     */
    public boolean providesResidual() {try{__CLR4_4_1ky5ky5lb90p8x0.R.inc(27153);
        __CLR4_4_1ky5ky5lb90p8x0.R.inc(27154);return false;
    }finally{__CLR4_4_1ky5ky5lb90p8x0.R.flushNeeded();}}
}
