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
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

/**
 * This class implements inverses of Hilbert Matrices as
 * {@link RealLinearOperator}.
 */
public class InverseHilbertMatrix
    extends RealLinearOperator {public static class __CLR4_4_11uog1uoglb90pd75{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86458,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The size of the matrix. */
    private final int n;

    /**
     * Creates a new instance of this class.
     *
     * @param n Size of the matrix to be created.
     */
    public InverseHilbertMatrix(final int n) {try{__CLR4_4_11uog1uoglb90pd75.R.inc(86416);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86417);this.n = n;
    }finally{__CLR4_4_11uog1uoglb90pd75.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_11uog1uoglb90pd75.R.inc(86418);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86419);return n;
    }finally{__CLR4_4_11uog1uoglb90pd75.R.flushNeeded();}}

    /**
     * Returns the {@code (i, j)} entry of the inverse Hilbert matrix. Exact
     * arithmetic is used; in case of overflow, an exception is thrown.
     *
     * @param i Row index (starts at 0).
     * @param j Column index (starts at 0).
     * @return The coefficient of the inverse Hilbert matrix.
     */
    public long getEntry(final int i, final int j) {try{__CLR4_4_11uog1uoglb90pd75.R.inc(86420);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86421);long val = i + j + 1;
        __CLR4_4_11uog1uoglb90pd75.R.inc(86422);long aux = CombinatoricsUtils.binomialCoefficient(n + i, n - j - 1);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86423);val = ArithmeticUtils.mulAndCheck(val, aux);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86424);aux = CombinatoricsUtils.binomialCoefficient(n + j, n - i - 1);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86425);val = ArithmeticUtils.mulAndCheck(val, aux);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86426);aux = CombinatoricsUtils.binomialCoefficient(i + j, i);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86427);val = ArithmeticUtils.mulAndCheck(val, aux);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86428);val = ArithmeticUtils.mulAndCheck(val, aux);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86429);return (((((i + j) & 1) == 0 )&&(__CLR4_4_11uog1uoglb90pd75.R.iget(86430)!=0|true))||(__CLR4_4_11uog1uoglb90pd75.R.iget(86431)==0&false))? val : -val;
    }finally{__CLR4_4_11uog1uoglb90pd75.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_11uog1uoglb90pd75.R.inc(86432);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86433);return n;
    }finally{__CLR4_4_11uog1uoglb90pd75.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector operate(final RealVector x) {try{__CLR4_4_11uog1uoglb90pd75.R.inc(86434);
        __CLR4_4_11uog1uoglb90pd75.R.inc(86435);if ((((x.getDimension() != n)&&(__CLR4_4_11uog1uoglb90pd75.R.iget(86436)!=0|true))||(__CLR4_4_11uog1uoglb90pd75.R.iget(86437)==0&false))) {{
            __CLR4_4_11uog1uoglb90pd75.R.inc(86438);throw new DimensionMismatchException(x.getDimension(), n);
        }
        }__CLR4_4_11uog1uoglb90pd75.R.inc(86439);final double[] y = new double[n];
        __CLR4_4_11uog1uoglb90pd75.R.inc(86440);for (int i = 0; (((i < n)&&(__CLR4_4_11uog1uoglb90pd75.R.iget(86441)!=0|true))||(__CLR4_4_11uog1uoglb90pd75.R.iget(86442)==0&false)); i++) {{
            __CLR4_4_11uog1uoglb90pd75.R.inc(86443);double pos = 0.;
            __CLR4_4_11uog1uoglb90pd75.R.inc(86444);double neg = 0.;
            __CLR4_4_11uog1uoglb90pd75.R.inc(86445);for (int j = 0; (((j < n)&&(__CLR4_4_11uog1uoglb90pd75.R.iget(86446)!=0|true))||(__CLR4_4_11uog1uoglb90pd75.R.iget(86447)==0&false)); j++) {{
                __CLR4_4_11uog1uoglb90pd75.R.inc(86448);final double xj = x.getEntry(j);
                __CLR4_4_11uog1uoglb90pd75.R.inc(86449);final long coeff = getEntry(i, j);
                __CLR4_4_11uog1uoglb90pd75.R.inc(86450);final double daux = coeff * xj;
                // Positive and negative values are sorted out in order to limit
                // catastrophic cancellations (do not forget that Hilbert
                // matrices are *very* ill-conditioned!
                __CLR4_4_11uog1uoglb90pd75.R.inc(86451);if ((((daux > 0.)&&(__CLR4_4_11uog1uoglb90pd75.R.iget(86452)!=0|true))||(__CLR4_4_11uog1uoglb90pd75.R.iget(86453)==0&false))) {{
                    __CLR4_4_11uog1uoglb90pd75.R.inc(86454);pos += daux;
                } }else {{
                    __CLR4_4_11uog1uoglb90pd75.R.inc(86455);neg += daux;
                }
            }}
            }__CLR4_4_11uog1uoglb90pd75.R.inc(86456);y[i] = pos + neg;
        }
        }__CLR4_4_11uog1uoglb90pd75.R.inc(86457);return new ArrayRealVector(y, false);
    }finally{__CLR4_4_11uog1uoglb90pd75.R.flushNeeded();}}
}
