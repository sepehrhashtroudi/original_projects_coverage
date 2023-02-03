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

/**
 * This class defines a linear operator operating on real ({@code double})
 * vector spaces. No direct access to the coefficients of the underlying matrix
 * is provided.
 *
 * The motivation for such an interface is well stated by
 * <a href="#BARR1994">Barrett et al. (1994)</a>:
 * <blockquote>
 *  We restrict ourselves to iterative methods, which work by repeatedly
 *  improving an approximate solution until it is accurate enough. These
 *  methods access the coefficient matrix A of the linear system only via the
 *  matrix-vector product y = A &middot; x
 *  (and perhaps z = A<sup>T</sup> &middot; x). Thus the user need only
 *  supply a subroutine for computing y (and perhaps z) given x, which permits
 *  full exploitation of the sparsity or other special structure of A.
 * </blockquote>
 * <br/>
 *
 * <dl>
 *  <dt><a name="BARR1994">Barret et al. (1994)</a></dt>
 *  <dd>
 *   R. Barrett, M. Berry, T. F. Chan, J. Demmel, J. M. Donato, J. Dongarra,
 *   V. Eijkhout, R. Pozo, C. Romine and H. Van der Vorst,
 *   <em>Templates for the Solution of Linear Systems: Building Blocks for
 *   Iterative Methods</em>, SIAM
 *  </dd>
 * </dl>
 *
 * @version $Id$
 * @since 3.0
 */
public abstract class RealLinearOperator {public static class __CLR4_4_1m8tm8tlb90p90s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,28833,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Returns the dimension of the codomain of this operator.
     *
     * @return the number of rows of the underlying matrix
     */
    public abstract int getRowDimension();

    /**
     * Returns the dimension of the domain of this operator.
     *
     * @return the number of columns of the underlying matrix
     */
    public abstract int getColumnDimension();

    /**
     * Returns the result of multiplying {@code this} by the vector {@code x}.
     *
     * @param x the vector to operate on
     * @return the product of {@code this} instance with {@code x}
     * @throws DimensionMismatchException if the column dimension does not match
     * the size of {@code x}
     */
    public abstract RealVector operate(final RealVector x)
        throws DimensionMismatchException;

    /**
     * Returns the result of multiplying the transpose of {@code this} operator
     * by the vector {@code x} (optional operation). The default implementation
     * throws an {@link UnsupportedOperationException}. Users overriding this
     * method must also override {@link #isTransposable()}.
     *
     * @param x the vector to operate on
     * @return the product of the transpose of {@code this} instance with
     * {@code x}
     * @throws org.apache.commons.math3.exception.DimensionMismatchException
     * if the row dimension does not match the size of {@code x}
     * @throws UnsupportedOperationException if this operation is not supported
     * by {@code this} operator
     */
    public RealVector operateTranspose(final RealVector x)
        throws DimensionMismatchException, UnsupportedOperationException {try{__CLR4_4_1m8tm8tlb90p90s.R.inc(28829);
        __CLR4_4_1m8tm8tlb90p90s.R.inc(28830);throw new UnsupportedOperationException();
    }finally{__CLR4_4_1m8tm8tlb90p90s.R.flushNeeded();}}

    /**
     * Returns {@code true} if this operator supports
     * {@link #operateTranspose(RealVector)}. If {@code true} is returned,
     * {@link #operateTranspose(RealVector)} should not throw
     * {@code UnsupportedOperationException}. The default implementation returns
     * {@code false}.
     *
     * @return {@code false}
     */
    public boolean isTransposable() {try{__CLR4_4_1m8tm8tlb90p90s.R.inc(28831);
        __CLR4_4_1m8tm8tlb90p90s.R.inc(28832);return false;
    }finally{__CLR4_4_1m8tm8tlb90p90s.R.flushNeeded();}}
}
