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

import org.apache.commons.math3.exception.MathUnsupportedOperationException;

/**
 * A default concrete implementation of the abstract class
 * {@link IterativeLinearSolverEvent}.
 *
 * @version $Id$
 */
public class DefaultIterativeLinearSolverEvent extends IterativeLinearSolverEvent {public static class __CLR4_4_1k1xk1xlb90p8u9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,26015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** */
    private static final long serialVersionUID = 20120129L;

    /** The right-hand side vector. */
    private final RealVector b;

    /** The current estimate of the residual. */
    private final RealVector r;

    /** The current estimate of the norm of the residual. */
    private final double rnorm;

    /** The current estimate of the solution. */
    private final RealVector x;

    /**
     * Creates a new instance of this class. This implementation does
     * <em>not</em> deep copy the specified vectors {@code x}, {@code b},
     * {@code r}. Therefore the user must make sure that these vectors are
     * either unmodifiable views or deep copies of the same vectors actually
     * used by the {@code source}. Failure to do so may compromise subsequent
     * iterations of the {@code source}. If the residual vector {@code r} is
     * {@code null}, then {@link #getResidual()} throws a
     * {@link MathUnsupportedOperationException}, and
     * {@link #providesResidual()} returns {@code false}.
     *
     * @param source the iterative solver which fired this event
     * @param iterations the number of iterations performed at the time
     * {@code this} event is created
     * @param x the current estimate of the solution
     * @param b the right-hand side vector
     * @param r the current estimate of the residual (can be {@code null})
     * @param rnorm the norm of the current estimate of the residual
     */
    public DefaultIterativeLinearSolverEvent(final Object source, final int iterations,
        final RealVector x, final RealVector b, final RealVector r,
        final double rnorm) {
        super(source, iterations);__CLR4_4_1k1xk1xlb90p8u9.R.inc(25990);try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(25989);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25991);this.x = x;
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25992);this.b = b;
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25993);this.r = r;
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25994);this.rnorm = rnorm;
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}

    /**
     * Creates a new instance of this class. This implementation does
     * <em>not</em> deep copy the specified vectors {@code x}, {@code b}.
     * Therefore the user must make sure that these vectors are either
     * unmodifiable views or deep copies of the same vectors actually used by
     * the {@code source}. Failure to do so may compromise subsequent iterations
     * of the {@code source}. Callling {@link #getResidual()} on instances
     * returned by this constructor throws a
     * {@link MathUnsupportedOperationException}, while
     * {@link #providesResidual()} returns {@code false}.
     *
     * @param source the iterative solver which fired this event
     * @param iterations the number of iterations performed at the time
     * {@code this} event is created
     * @param x the current estimate of the solution
     * @param b the right-hand side vector
     * @param rnorm the norm of the current estimate of the residual
     */
    public DefaultIterativeLinearSolverEvent(final Object source, final int iterations,
        final RealVector x, final RealVector b, final double rnorm) {
        super(source, iterations);__CLR4_4_1k1xk1xlb90p8u9.R.inc(25996);try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(25995);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25997);this.x = x;
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25998);this.b = b;
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(25999);this.r = null;
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(26000);this.rnorm = rnorm;
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getNormOfResidual() {try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(26001);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(26002);return rnorm;
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * This implementation throws an {@link MathUnsupportedOperationException}
     * if no residual vector {@code r} was provided at construction time.
     */
    @Override
    public RealVector getResidual() {try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(26003);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(26004);if ((((r != null)&&(__CLR4_4_1k1xk1xlb90p8u9.R.iget(26005)!=0|true))||(__CLR4_4_1k1xk1xlb90p8u9.R.iget(26006)==0&false))) {{
            __CLR4_4_1k1xk1xlb90p8u9.R.inc(26007);return r;
        }
        }__CLR4_4_1k1xk1xlb90p8u9.R.inc(26008);throw new MathUnsupportedOperationException();
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector getRightHandSideVector() {try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(26009);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(26010);return b;
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector getSolution() {try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(26011);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(26012);return x;
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * This implementation returns {@code true} if a non-{@code null} value was
     * specified for the residual vector {@code r} at construction time.
     *
     * @return {@code true} if {@code r != null}
     */
    @Override
    public boolean providesResidual() {try{__CLR4_4_1k1xk1xlb90p8u9.R.inc(26013);
        __CLR4_4_1k1xk1xlb90p8u9.R.inc(26014);return r != null;
    }finally{__CLR4_4_1k1xk1xlb90p8u9.R.flushNeeded();}}
}
