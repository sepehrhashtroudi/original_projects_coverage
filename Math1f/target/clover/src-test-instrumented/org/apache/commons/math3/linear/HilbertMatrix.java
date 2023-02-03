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

/** This class implements Hilbert Matrices as {@link RealLinearOperator}. */
public class HilbertMatrix
    extends RealLinearOperator {public static class __CLR4_4_11unn1unnlb90pd73{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,86416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The size of the matrix. */
    private final int n;

    /**
     * Creates a new instance of this class.
     *
     * @param n Size of the matrix to be created..
     */
    public HilbertMatrix(final int n) {try{__CLR4_4_11unn1unnlb90pd73.R.inc(86387);
        __CLR4_4_11unn1unnlb90pd73.R.inc(86388);this.n = n;
    }finally{__CLR4_4_11unn1unnlb90pd73.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_11unn1unnlb90pd73.R.inc(86389);
        __CLR4_4_11unn1unnlb90pd73.R.inc(86390);return n;
    }finally{__CLR4_4_11unn1unnlb90pd73.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_11unn1unnlb90pd73.R.inc(86391);
        __CLR4_4_11unn1unnlb90pd73.R.inc(86392);return n;
    }finally{__CLR4_4_11unn1unnlb90pd73.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public RealVector operate(final RealVector x) {try{__CLR4_4_11unn1unnlb90pd73.R.inc(86393);
        __CLR4_4_11unn1unnlb90pd73.R.inc(86394);if ((((x.getDimension() != n)&&(__CLR4_4_11unn1unnlb90pd73.R.iget(86395)!=0|true))||(__CLR4_4_11unn1unnlb90pd73.R.iget(86396)==0&false))) {{
            __CLR4_4_11unn1unnlb90pd73.R.inc(86397);throw new DimensionMismatchException(x.getDimension(), n);
        }
        }__CLR4_4_11unn1unnlb90pd73.R.inc(86398);final double[] y = new double[n];
        __CLR4_4_11unn1unnlb90pd73.R.inc(86399);for (int i = 0; (((i < n)&&(__CLR4_4_11unn1unnlb90pd73.R.iget(86400)!=0|true))||(__CLR4_4_11unn1unnlb90pd73.R.iget(86401)==0&false)); i++) {{
            __CLR4_4_11unn1unnlb90pd73.R.inc(86402);double pos = 0.;
            __CLR4_4_11unn1unnlb90pd73.R.inc(86403);double neg = 0.;
            __CLR4_4_11unn1unnlb90pd73.R.inc(86404);for (int j = 0; (((j < n)&&(__CLR4_4_11unn1unnlb90pd73.R.iget(86405)!=0|true))||(__CLR4_4_11unn1unnlb90pd73.R.iget(86406)==0&false)); j++) {{
                __CLR4_4_11unn1unnlb90pd73.R.inc(86407);final double xj = x.getEntry(j);
                __CLR4_4_11unn1unnlb90pd73.R.inc(86408);final double coeff = 1. / (i + j + 1.);
                // Positive and negative values are sorted out in order to limit
                // catastrophic cancellations (do not forget that Hilbert
                // matrices are *very* ill-conditioned!
                __CLR4_4_11unn1unnlb90pd73.R.inc(86409);if ((((xj > 0.)&&(__CLR4_4_11unn1unnlb90pd73.R.iget(86410)!=0|true))||(__CLR4_4_11unn1unnlb90pd73.R.iget(86411)==0&false))) {{
                    __CLR4_4_11unn1unnlb90pd73.R.inc(86412);pos += coeff * xj;
                } }else {{
                    __CLR4_4_11unn1unnlb90pd73.R.inc(86413);neg += coeff * xj;
                }
            }}
            }__CLR4_4_11unn1unnlb90pd73.R.inc(86414);y[i] = pos + neg;
        }
        }__CLR4_4_11unn1unnlb90pd73.R.inc(86415);return new ArrayRealVector(y, false);
    }finally{__CLR4_4_11unn1unnlb90pd73.R.flushNeeded();}}
}
