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
package org.apache.commons.math3.stat.descriptive.moment;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * Returns the covariance matrix of the available vectors.
 * @since 1.2
 * @version $Id$
 */
public class VectorialCovariance implements Serializable {public static class __CLR4_4_114a014a0lb90paof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,52283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = 4118372414238930270L;

    /** Sums for each component. */
    private final double[] sums;

    /** Sums of products for each component. */
    private final double[] productsSums;

    /** Indicator for bias correction. */
    private final boolean isBiasCorrected;

    /** Number of vectors in the sample. */
    private long n;

    /** Constructs a VectorialCovariance.
     * @param dimension vectors dimension
     * @param isBiasCorrected if true, computed the unbiased sample covariance,
     * otherwise computes the biased population covariance
     */
    public VectorialCovariance(int dimension, boolean isBiasCorrected) {try{__CLR4_4_114a014a0lb90paof.R.inc(52200);
        __CLR4_4_114a014a0lb90paof.R.inc(52201);sums         = new double[dimension];
        __CLR4_4_114a014a0lb90paof.R.inc(52202);productsSums = new double[dimension * (dimension + 1) / 2];
        __CLR4_4_114a014a0lb90paof.R.inc(52203);n            = 0;
        __CLR4_4_114a014a0lb90paof.R.inc(52204);this.isBiasCorrected = isBiasCorrected;
    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

    /**
     * Add a new vector to the sample.
     * @param v vector to add
     * @throws DimensionMismatchException if the vector does not have the right dimension
     */
    public void increment(double[] v) throws DimensionMismatchException {try{__CLR4_4_114a014a0lb90paof.R.inc(52205);
        __CLR4_4_114a014a0lb90paof.R.inc(52206);if ((((v.length != sums.length)&&(__CLR4_4_114a014a0lb90paof.R.iget(52207)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52208)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52209);throw new DimensionMismatchException(v.length, sums.length);
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52210);int k = 0;
        __CLR4_4_114a014a0lb90paof.R.inc(52211);for (int i = 0; (((i < v.length)&&(__CLR4_4_114a014a0lb90paof.R.iget(52212)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52213)==0&false)); ++i) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52214);sums[i] += v[i];
            __CLR4_4_114a014a0lb90paof.R.inc(52215);for (int j = 0; (((j <= i)&&(__CLR4_4_114a014a0lb90paof.R.iget(52216)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52217)==0&false)); ++j) {{
                __CLR4_4_114a014a0lb90paof.R.inc(52218);productsSums[k++] += v[i] * v[j];
            }
        }}
        }__CLR4_4_114a014a0lb90paof.R.inc(52219);n++;
    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

    /**
     * Get the covariance matrix.
     * @return covariance matrix
     */
    public RealMatrix getResult() {try{__CLR4_4_114a014a0lb90paof.R.inc(52220);

        __CLR4_4_114a014a0lb90paof.R.inc(52221);int dimension = sums.length;
        __CLR4_4_114a014a0lb90paof.R.inc(52222);RealMatrix result = MatrixUtils.createRealMatrix(dimension, dimension);

        __CLR4_4_114a014a0lb90paof.R.inc(52223);if ((((n > 1)&&(__CLR4_4_114a014a0lb90paof.R.iget(52224)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52225)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52226);double c = 1.0 / (n * ((((isBiasCorrected )&&(__CLR4_4_114a014a0lb90paof.R.iget(52227)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52228)==0&false))? (n - 1) : n));
            __CLR4_4_114a014a0lb90paof.R.inc(52229);int k = 0;
            __CLR4_4_114a014a0lb90paof.R.inc(52230);for (int i = 0; (((i < dimension)&&(__CLR4_4_114a014a0lb90paof.R.iget(52231)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52232)==0&false)); ++i) {{
                __CLR4_4_114a014a0lb90paof.R.inc(52233);for (int j = 0; (((j <= i)&&(__CLR4_4_114a014a0lb90paof.R.iget(52234)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52235)==0&false)); ++j) {{
                    __CLR4_4_114a014a0lb90paof.R.inc(52236);double e = c * (n * productsSums[k++] - sums[i] * sums[j]);
                    __CLR4_4_114a014a0lb90paof.R.inc(52237);result.setEntry(i, j, e);
                    __CLR4_4_114a014a0lb90paof.R.inc(52238);result.setEntry(j, i, e);
                }
            }}
        }}

        }__CLR4_4_114a014a0lb90paof.R.inc(52239);return result;

    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

    /**
     * Get the number of vectors in the sample.
     * @return number of vectors in the sample
     */
    public long getN() {try{__CLR4_4_114a014a0lb90paof.R.inc(52240);
        __CLR4_4_114a014a0lb90paof.R.inc(52241);return n;
    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

    /**
     * Clears the internal state of the Statistic
     */
    public void clear() {try{__CLR4_4_114a014a0lb90paof.R.inc(52242);
        __CLR4_4_114a014a0lb90paof.R.inc(52243);n = 0;
        __CLR4_4_114a014a0lb90paof.R.inc(52244);Arrays.fill(sums, 0.0);
        __CLR4_4_114a014a0lb90paof.R.inc(52245);Arrays.fill(productsSums, 0.0);
    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_114a014a0lb90paof.R.inc(52246);
        __CLR4_4_114a014a0lb90paof.R.inc(52247);final int prime = 31;
        __CLR4_4_114a014a0lb90paof.R.inc(52248);int result = 1;
        __CLR4_4_114a014a0lb90paof.R.inc(52249);result = prime * result + ((((isBiasCorrected )&&(__CLR4_4_114a014a0lb90paof.R.iget(52250)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52251)==0&false))? 1231 : 1237);
        __CLR4_4_114a014a0lb90paof.R.inc(52252);result = prime * result + (int) (n ^ (n >>> 32));
        __CLR4_4_114a014a0lb90paof.R.inc(52253);result = prime * result + Arrays.hashCode(productsSums);
        __CLR4_4_114a014a0lb90paof.R.inc(52254);result = prime * result + Arrays.hashCode(sums);
        __CLR4_4_114a014a0lb90paof.R.inc(52255);return result;
    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_114a014a0lb90paof.R.inc(52256);
        __CLR4_4_114a014a0lb90paof.R.inc(52257);if ((((this == obj)&&(__CLR4_4_114a014a0lb90paof.R.iget(52258)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52259)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52260);return true;
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52261);if ((((!(obj instanceof VectorialCovariance))&&(__CLR4_4_114a014a0lb90paof.R.iget(52262)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52263)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52264);return false;
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52265);VectorialCovariance other = (VectorialCovariance) obj;
        __CLR4_4_114a014a0lb90paof.R.inc(52266);if ((((isBiasCorrected != other.isBiasCorrected)&&(__CLR4_4_114a014a0lb90paof.R.iget(52267)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52268)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52269);return false;
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52270);if ((((n != other.n)&&(__CLR4_4_114a014a0lb90paof.R.iget(52271)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52272)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52273);return false;
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52274);if ((((!Arrays.equals(productsSums, other.productsSums))&&(__CLR4_4_114a014a0lb90paof.R.iget(52275)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52276)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52277);return false;
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52278);if ((((!Arrays.equals(sums, other.sums))&&(__CLR4_4_114a014a0lb90paof.R.iget(52279)!=0|true))||(__CLR4_4_114a014a0lb90paof.R.iget(52280)==0&false))) {{
            __CLR4_4_114a014a0lb90paof.R.inc(52281);return false;
        }
        }__CLR4_4_114a014a0lb90paof.R.inc(52282);return true;
    }finally{__CLR4_4_114a014a0lb90paof.R.flushNeeded();}}

}
