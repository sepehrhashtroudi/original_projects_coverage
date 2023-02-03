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

package org.apache.commons.math3.random;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RectangularCholeskyDecomposition;

/**
 * A {@link RandomVectorGenerator} that generates vectors with with
 * correlated components.
 * <p>Random vectors with correlated components are built by combining
 * the uncorrelated components of another random vector in such a way that
 * the resulting correlations are the ones specified by a positive
 * definite covariance matrix.</p>
 * <p>The main use for correlated random vector generation is for Monte-Carlo
 * simulation of physical problems with several variables, for example to
 * generate error vectors to be added to a nominal vector. A particularly
 * interesting case is when the generated vector should be drawn from a <a
 * href="http://en.wikipedia.org/wiki/Multivariate_normal_distribution">
 * Multivariate Normal Distribution</a>. The approach using a Cholesky
 * decomposition is quite usual in this case. However, it can be extended
 * to other cases as long as the underlying random generator provides
 * {@link NormalizedRandomGenerator normalized values} like {@link
 * GaussianRandomGenerator} or {@link UniformRandomGenerator}.</p>
 * <p>Sometimes, the covariance matrix for a given simulation is not
 * strictly positive definite. This means that the correlations are
 * not all independent from each other. In this case, however, the non
 * strictly positive elements found during the Cholesky decomposition
 * of the covariance matrix should not be negative either, they
 * should be null. Another non-conventional extension handling this case
 * is used here. Rather than computing <code>C = U<sup>T</sup>.U</code>
 * where <code>C</code> is the covariance matrix and <code>U</code>
 * is an upper-triangular matrix, we compute <code>C = B.B<sup>T</sup></code>
 * where <code>B</code> is a rectangular matrix having
 * more rows than columns. The number of columns of <code>B</code> is
 * the rank of the covariance matrix, and it is the dimension of the
 * uncorrelated random vector that is needed to compute the component
 * of the correlated vector. This class handles this situation
 * automatically.</p>
 *
 * @version $Id$
 * @since 1.2
 */

public class CorrelatedRandomVectorGenerator
    implements RandomVectorGenerator {public static class __CLR4_4_110jd10jdlb90paab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Mean vector. */
    private final double[] mean;
    /** Underlying generator. */
    private final NormalizedRandomGenerator generator;
    /** Storage for the normalized vector. */
    private final double[] normalized;
    /** Root of the covariance matrix. */
    private final RealMatrix root;

    /**
     * Builds a correlated random vector generator from its mean
     * vector and covariance matrix.
     *
     * @param mean Expected mean values for all components.
     * @param covariance Covariance matrix.
     * @param small Diagonal elements threshold under which  column are
     * considered to be dependent on previous ones and are discarded
     * @param generator underlying generator for uncorrelated normalized
     * components.
     * @throws org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException
     * if the covariance matrix is not strictly positive definite.
     * @throws DimensionMismatchException if the mean and covariance
     * arrays dimensions do not match.
     */
    public CorrelatedRandomVectorGenerator(double[] mean,
                                           RealMatrix covariance, double small,
                                           NormalizedRandomGenerator generator) {try{__CLR4_4_110jd10jdlb90paab.R.inc(47353);
        __CLR4_4_110jd10jdlb90paab.R.inc(47354);int order = covariance.getRowDimension();
        __CLR4_4_110jd10jdlb90paab.R.inc(47355);if ((((mean.length != order)&&(__CLR4_4_110jd10jdlb90paab.R.iget(47356)!=0|true))||(__CLR4_4_110jd10jdlb90paab.R.iget(47357)==0&false))) {{
            __CLR4_4_110jd10jdlb90paab.R.inc(47358);throw new DimensionMismatchException(mean.length, order);
        }
        }__CLR4_4_110jd10jdlb90paab.R.inc(47359);this.mean = mean.clone();

        __CLR4_4_110jd10jdlb90paab.R.inc(47360);final RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(covariance, small);
        __CLR4_4_110jd10jdlb90paab.R.inc(47361);root = decomposition.getRootMatrix();

        __CLR4_4_110jd10jdlb90paab.R.inc(47362);this.generator = generator;
        __CLR4_4_110jd10jdlb90paab.R.inc(47363);normalized = new double[decomposition.getRank()];

    }finally{__CLR4_4_110jd10jdlb90paab.R.flushNeeded();}}

    /**
     * Builds a null mean random correlated vector generator from its
     * covariance matrix.
     *
     * @param covariance Covariance matrix.
     * @param small Diagonal elements threshold under which  column are
     * considered to be dependent on previous ones and are discarded.
     * @param generator Underlying generator for uncorrelated normalized
     * components.
     * @throws org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException
     * if the covariance matrix is not strictly positive definite.
     */
    public CorrelatedRandomVectorGenerator(RealMatrix covariance, double small,
                                           NormalizedRandomGenerator generator) {try{__CLR4_4_110jd10jdlb90paab.R.inc(47364);
        __CLR4_4_110jd10jdlb90paab.R.inc(47365);int order = covariance.getRowDimension();
        __CLR4_4_110jd10jdlb90paab.R.inc(47366);mean = new double[order];
        __CLR4_4_110jd10jdlb90paab.R.inc(47367);for (int i = 0; (((i < order)&&(__CLR4_4_110jd10jdlb90paab.R.iget(47368)!=0|true))||(__CLR4_4_110jd10jdlb90paab.R.iget(47369)==0&false)); ++i) {{
            __CLR4_4_110jd10jdlb90paab.R.inc(47370);mean[i] = 0;
        }

        }__CLR4_4_110jd10jdlb90paab.R.inc(47371);final RectangularCholeskyDecomposition decomposition =
            new RectangularCholeskyDecomposition(covariance, small);
        __CLR4_4_110jd10jdlb90paab.R.inc(47372);root = decomposition.getRootMatrix();

        __CLR4_4_110jd10jdlb90paab.R.inc(47373);this.generator = generator;
        __CLR4_4_110jd10jdlb90paab.R.inc(47374);normalized = new double[decomposition.getRank()];

    }finally{__CLR4_4_110jd10jdlb90paab.R.flushNeeded();}}

    /** Get the underlying normalized components generator.
     * @return underlying uncorrelated components generator
     */
    public NormalizedRandomGenerator getGenerator() {try{__CLR4_4_110jd10jdlb90paab.R.inc(47375);
        __CLR4_4_110jd10jdlb90paab.R.inc(47376);return generator;
    }finally{__CLR4_4_110jd10jdlb90paab.R.flushNeeded();}}

    /** Get the rank of the covariance matrix.
     * The rank is the number of independent rows in the covariance
     * matrix, it is also the number of columns of the root matrix.
     * @return rank of the square matrix.
     * @see #getRootMatrix()
     */
    public int getRank() {try{__CLR4_4_110jd10jdlb90paab.R.inc(47377);
        __CLR4_4_110jd10jdlb90paab.R.inc(47378);return normalized.length;
    }finally{__CLR4_4_110jd10jdlb90paab.R.flushNeeded();}}

    /** Get the root of the covariance matrix.
     * The root is the rectangular matrix <code>B</code> such that
     * the covariance matrix is equal to <code>B.B<sup>T</sup></code>
     * @return root of the square matrix
     * @see #getRank()
     */
    public RealMatrix getRootMatrix() {try{__CLR4_4_110jd10jdlb90paab.R.inc(47379);
        __CLR4_4_110jd10jdlb90paab.R.inc(47380);return root;
    }finally{__CLR4_4_110jd10jdlb90paab.R.flushNeeded();}}

    /** Generate a correlated random vector.
     * @return a random vector as an array of double. The returned array
     * is created at each call, the caller can do what it wants with it.
     */
    public double[] nextVector() {try{__CLR4_4_110jd10jdlb90paab.R.inc(47381);

        // generate uncorrelated vector
        __CLR4_4_110jd10jdlb90paab.R.inc(47382);for (int i = 0; (((i < normalized.length)&&(__CLR4_4_110jd10jdlb90paab.R.iget(47383)!=0|true))||(__CLR4_4_110jd10jdlb90paab.R.iget(47384)==0&false)); ++i) {{
            __CLR4_4_110jd10jdlb90paab.R.inc(47385);normalized[i] = generator.nextNormalizedDouble();
        }

        // compute correlated vector
        }__CLR4_4_110jd10jdlb90paab.R.inc(47386);double[] correlated = new double[mean.length];
        __CLR4_4_110jd10jdlb90paab.R.inc(47387);for (int i = 0; (((i < correlated.length)&&(__CLR4_4_110jd10jdlb90paab.R.iget(47388)!=0|true))||(__CLR4_4_110jd10jdlb90paab.R.iget(47389)==0&false)); ++i) {{
            __CLR4_4_110jd10jdlb90paab.R.inc(47390);correlated[i] = mean[i];
            __CLR4_4_110jd10jdlb90paab.R.inc(47391);for (int j = 0; (((j < root.getColumnDimension())&&(__CLR4_4_110jd10jdlb90paab.R.iget(47392)!=0|true))||(__CLR4_4_110jd10jdlb90paab.R.iget(47393)==0&false)); ++j) {{
                __CLR4_4_110jd10jdlb90paab.R.inc(47394);correlated[i] += root.getEntry(i, j) * normalized[j];
            }
        }}

        }__CLR4_4_110jd10jdlb90paab.R.inc(47395);return correlated;

    }finally{__CLR4_4_110jd10jdlb90paab.R.flushNeeded();}}

}
