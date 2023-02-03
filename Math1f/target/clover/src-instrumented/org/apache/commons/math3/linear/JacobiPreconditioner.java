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

import org.apache.commons.math3.analysis.function.Sqrt;
import org.apache.commons.math3.util.MathArrays;

/**
 * This class implements the standard Jacobi (diagonal) preconditioner. For a
 * matrix A<sub>ij</sub>, this preconditioner is
 * M = diag(1 / A<sub>11</sub>, 1 / A<sub>22</sub>, &hellip;).
 *
 * @version $Id$
 * @since 3.0
 */
public class JacobiPreconditioner extends RealLinearOperator {public static class __CLR4_4_1kybkyblb90p8x4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,27195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The diagonal coefficients of the preconditioner. */
    private final ArrayRealVector diag;

    /**
     * Creates a new instance of this class.
     *
     * @param diag the diagonal coefficients of the linear operator to be
     * preconditioned
     * @param deep {@code true} if a deep copy of the above array should be
     * performed
     */
    public JacobiPreconditioner(final double[] diag, final boolean deep) {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27155);
        __CLR4_4_1kybkyblb90p8x4.R.inc(27156);this.diag = new ArrayRealVector(diag, deep);
    }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

    /**
     * Creates a new instance of this class. This method extracts the diagonal
     * coefficients of the specified linear operator. If {@code a} does not
     * extend {@link AbstractRealMatrix}, then the coefficients of the
     * underlying matrix are not accessible, coefficient extraction is made by
     * matrix-vector products with the basis vectors (and might therefore take
     * some time). With matrices, direct entry access is carried out.
     *
     * @param a the linear operator for which the preconditioner should be built
     * @return the diagonal preconditioner made of the inverse of the diagonal
     * coefficients of the specified linear operator
     * @throws NonSquareOperatorException if {@code a} is not square
     */
    public static JacobiPreconditioner create(final RealLinearOperator a)
        throws NonSquareOperatorException {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27157);
        __CLR4_4_1kybkyblb90p8x4.R.inc(27158);final int n = a.getColumnDimension();
        __CLR4_4_1kybkyblb90p8x4.R.inc(27159);if ((((a.getRowDimension() != n)&&(__CLR4_4_1kybkyblb90p8x4.R.iget(27160)!=0|true))||(__CLR4_4_1kybkyblb90p8x4.R.iget(27161)==0&false))) {{
            __CLR4_4_1kybkyblb90p8x4.R.inc(27162);throw new NonSquareOperatorException(a.getRowDimension(), n);
        }
        }__CLR4_4_1kybkyblb90p8x4.R.inc(27163);final double[] diag = new double[n];
        __CLR4_4_1kybkyblb90p8x4.R.inc(27164);if ((((a instanceof AbstractRealMatrix)&&(__CLR4_4_1kybkyblb90p8x4.R.iget(27165)!=0|true))||(__CLR4_4_1kybkyblb90p8x4.R.iget(27166)==0&false))) {{
            __CLR4_4_1kybkyblb90p8x4.R.inc(27167);final AbstractRealMatrix m = (AbstractRealMatrix) a;
            __CLR4_4_1kybkyblb90p8x4.R.inc(27168);for (int i = 0; (((i < n)&&(__CLR4_4_1kybkyblb90p8x4.R.iget(27169)!=0|true))||(__CLR4_4_1kybkyblb90p8x4.R.iget(27170)==0&false)); i++) {{
                __CLR4_4_1kybkyblb90p8x4.R.inc(27171);diag[i] = m.getEntry(i, i);
            }
        }} }else {{
            __CLR4_4_1kybkyblb90p8x4.R.inc(27172);final ArrayRealVector x = new ArrayRealVector(n);
            __CLR4_4_1kybkyblb90p8x4.R.inc(27173);for (int i = 0; (((i < n)&&(__CLR4_4_1kybkyblb90p8x4.R.iget(27174)!=0|true))||(__CLR4_4_1kybkyblb90p8x4.R.iget(27175)==0&false)); i++) {{
                __CLR4_4_1kybkyblb90p8x4.R.inc(27176);x.set(0.);
                __CLR4_4_1kybkyblb90p8x4.R.inc(27177);x.setEntry(i, 1.);
                __CLR4_4_1kybkyblb90p8x4.R.inc(27178);diag[i] = a.operate(x).getEntry(i);
            }
        }}
        }__CLR4_4_1kybkyblb90p8x4.R.inc(27179);return new JacobiPreconditioner(diag, false);
    }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27180);
        __CLR4_4_1kybkyblb90p8x4.R.inc(27181);return diag.getDimension();
    }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27182);
        __CLR4_4_1kybkyblb90p8x4.R.inc(27183);return diag.getDimension();
    }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector operate(final RealVector x) {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27184);
        // Dimension check is carried out by ebeDivide
        __CLR4_4_1kybkyblb90p8x4.R.inc(27185);return new ArrayRealVector(MathArrays.ebeDivide(x.toArray(),
                                                        diag.toArray()),
                                   false);
    }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

    /**
     * Returns the square root of {@code this} diagonal operator. More
     * precisely, this method returns
     * P = diag(1 / &radic;A<sub>11</sub>, 1 / &radic;A<sub>22</sub>, &hellip;).
     *
     * @return the square root of {@code this} preconditioner
     * @since 3.1
     */
    public RealLinearOperator sqrt() {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27186);
        __CLR4_4_1kybkyblb90p8x4.R.inc(27187);final RealVector sqrtDiag = diag.map(new Sqrt());
        __CLR4_4_1kybkyblb90p8x4.R.inc(27188);return new RealLinearOperator() {
            /** {@inheritDoc} */
            @Override
            public RealVector operate(final RealVector x) {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27189);
                __CLR4_4_1kybkyblb90p8x4.R.inc(27190);return new ArrayRealVector(MathArrays.ebeDivide(x.toArray(),
                                                                sqrtDiag.toArray()),
                                           false);
            }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public int getRowDimension() {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27191);
                __CLR4_4_1kybkyblb90p8x4.R.inc(27192);return sqrtDiag.getDimension();
            }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}

            /** {@inheritDoc} */
            @Override
            public int getColumnDimension() {try{__CLR4_4_1kybkyblb90p8x4.R.inc(27193);
                __CLR4_4_1kybkyblb90p8x4.R.inc(27194);return sqrtDiag.getDimension();
            }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}
        };
    }finally{__CLR4_4_1kybkyblb90p8x4.R.flushNeeded();}}
}
