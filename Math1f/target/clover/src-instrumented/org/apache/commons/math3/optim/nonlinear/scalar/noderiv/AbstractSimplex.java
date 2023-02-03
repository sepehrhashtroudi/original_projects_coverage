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

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import java.util.Arrays;
import java.util.Comparator;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.OptimizationData;

/**
 * This class implements the simplex concept.
 * It is intended to be used in conjunction with {@link SimplexOptimizer}.
 * <br/>
 * The initial configuration of the simplex is set by the constructors
 * {@link #AbstractSimplex(double[])} or {@link #AbstractSimplex(double[][])}.
 * The other {@link #AbstractSimplex(int) constructor} will set all steps
 * to 1, thus building a default configuration from a unit hypercube.
 * <br/>
 * Users <em>must</em> call the {@link #build(double[]) build} method in order
 * to create the data structure that will be acted on by the other methods of
 * this class.
 *
 * @see SimplexOptimizer
 * @version $Id$
 * @since 3.0
 */
public abstract class AbstractSimplex implements OptimizationData {public static class __CLR4_4_1sdzsdzlb90p9oj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,36931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Simplex. */
    private PointValuePair[] simplex;
    /** Start simplex configuration. */
    private double[][] startConfiguration;
    /** Simplex dimension (must be equal to {@code simplex.length - 1}). */
    private final int dimension;

    /**
     * Build a unit hypercube simplex.
     *
     * @param n Dimension of the simplex.
     */
    protected AbstractSimplex(int n) {
        this(n, 1d);__CLR4_4_1sdzsdzlb90p9oj.R.inc(36792);try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36791);
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Build a hypercube simplex with the given side length.
     *
     * @param n Dimension of the simplex.
     * @param sideLength Length of the sides of the hypercube.
     */
    protected AbstractSimplex(int n,
                              double sideLength) {
        this(createHypercubeSteps(n, sideLength));__CLR4_4_1sdzsdzlb90p9oj.R.inc(36794);try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36793);
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * The start configuration for simplex is built from a box parallel to
     * the canonical axes of the space. The simplex is the subset of vertices
     * of a box parallel to the canonical axes. It is built as the path followed
     * while traveling from one vertex of the box to the diagonally opposite
     * vertex moving only along the box edges. The first vertex of the box will
     * be located at the start point of the optimization.
     * As an example, in dimension 3 a simplex has 4 vertices. Setting the
     * steps to (1, 10, 2) and the start point to (1, 1, 1) would imply the
     * start simplex would be: { (1, 1, 1), (2, 1, 1), (2, 11, 1), (2, 11, 3) }.
     * The first vertex would be set to the start point at (1, 1, 1) and the
     * last vertex would be set to the diagonally opposite vertex at (2, 11, 3).
     *
     * @param steps Steps along the canonical axes representing box edges. They
     * may be negative but not zero.
     * @throws NullArgumentException if {@code steps} is {@code null}.
     * @throws ZeroException if one of the steps is zero.
     */
    protected AbstractSimplex(final double[] steps) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36795);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36796);if ((((steps == null)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36797)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36798)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36799);throw new NullArgumentException();
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36800);if ((((steps.length == 0)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36801)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36802)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36803);throw new ZeroException();
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36804);dimension = steps.length;

        // Only the relative position of the n final vertices with respect
        // to the first one are stored.
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36805);startConfiguration = new double[dimension][dimension];
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36806);for (int i = 0; (((i < dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36807)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36808)==0&false)); i++) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36809);final double[] vertexI = startConfiguration[i];
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36810);for (int j = 0; (((j < i + 1)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36811)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36812)==0&false)); j++) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36813);if ((((steps[j] == 0)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36814)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36815)==0&false))) {{
                    __CLR4_4_1sdzsdzlb90p9oj.R.inc(36816);throw new ZeroException(LocalizedFormats.EQUAL_VERTICES_IN_SIMPLEX);
                }
                }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36817);System.arraycopy(steps, 0, vertexI, 0, j + 1);
            }
        }}
    }}finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * The real initial simplex will be set up by moving the reference
     * simplex such that its first point is located at the start point of the
     * optimization.
     *
     * @param referenceSimplex Reference simplex.
     * @throws NotStrictlyPositiveException if the reference simplex does not
     * contain at least one point.
     * @throws DimensionMismatchException if there is a dimension mismatch
     * in the reference simplex.
     * @throws IllegalArgumentException if one of its vertices is duplicated.
     */
    protected AbstractSimplex(final double[][] referenceSimplex) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36818);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36819);if ((((referenceSimplex.length <= 0)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36820)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36821)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36822);throw new NotStrictlyPositiveException(LocalizedFormats.SIMPLEX_NEED_ONE_POINT,
                                                   referenceSimplex.length);
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36823);dimension = referenceSimplex.length - 1;

        // Only the relative position of the n final vertices with respect
        // to the first one are stored.
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36824);startConfiguration = new double[dimension][dimension];
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36825);final double[] ref0 = referenceSimplex[0];

        // Loop over vertices.
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36826);for (int i = 0; (((i < referenceSimplex.length)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36827)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36828)==0&false)); i++) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36829);final double[] refI = referenceSimplex[i];

            // Safety checks.
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36830);if ((((refI.length != dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36831)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36832)==0&false))) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36833);throw new DimensionMismatchException(refI.length, dimension);
            }
            }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36834);for (int j = 0; (((j < i)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36835)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36836)==0&false)); j++) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36837);final double[] refJ = referenceSimplex[j];
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36838);boolean allEquals = true;
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36839);for (int k = 0; (((k < dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36840)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36841)==0&false)); k++) {{
                    __CLR4_4_1sdzsdzlb90p9oj.R.inc(36842);if ((((refI[k] != refJ[k])&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36843)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36844)==0&false))) {{
                        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36845);allEquals = false;
                        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36846);break;
                    }
                }}
                }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36847);if ((((allEquals)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36848)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36849)==0&false))) {{
                    __CLR4_4_1sdzsdzlb90p9oj.R.inc(36850);throw new MathIllegalArgumentException(LocalizedFormats.EQUAL_VERTICES_IN_SIMPLEX,
                                                           i, j);
                }
            }}

            // Store vertex i position relative to vertex 0 position.
            }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36851);if ((((i > 0)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36852)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36853)==0&false))) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36854);final double[] confI = startConfiguration[i - 1];
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36855);for (int k = 0; (((k < dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36856)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36857)==0&false)); k++) {{
                    __CLR4_4_1sdzsdzlb90p9oj.R.inc(36858);confI[k] = refI[k] - ref0[k];
                }
            }}
        }}
    }}finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Get simplex dimension.
     *
     * @return the dimension of the simplex.
     */
    public int getDimension() {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36859);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36860);return dimension;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Get simplex size.
     * After calling the {@link #build(double[]) build} method, this method will
     * will be equivalent to {@code getDimension() + 1}.
     *
     * @return the size of the simplex.
     */
    public int getSize() {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36861);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36862);return simplex.length;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Compute the next simplex of the algorithm.
     *
     * @param evaluationFunction Evaluation function.
     * @param comparator Comparator to use to sort simplex vertices from best
     * to worst.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the algorithm fails to converge.
     */
    public abstract void iterate(final MultivariateFunction evaluationFunction,
                                 final Comparator<PointValuePair> comparator);

    /**
     * Build an initial simplex.
     *
     * @param startPoint First point of the simplex.
     * @throws DimensionMismatchException if the start point does not match
     * simplex dimension.
     */
    public void build(final double[] startPoint) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36863);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36864);if ((((dimension != startPoint.length)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36865)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36866)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36867);throw new DimensionMismatchException(dimension, startPoint.length);
        }

        // Set first vertex.
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36868);simplex = new PointValuePair[dimension + 1];
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36869);simplex[0] = new PointValuePair(startPoint, Double.NaN);

        // Set remaining vertices.
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36870);for (int i = 0; (((i < dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36871)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36872)==0&false)); i++) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36873);final double[] confI = startConfiguration[i];
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36874);final double[] vertexI = new double[dimension];
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36875);for (int k = 0; (((k < dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36876)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36877)==0&false)); k++) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36878);vertexI[k] = startPoint[k] + confI[k];
            }
            }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36879);simplex[i + 1] = new PointValuePair(vertexI, Double.NaN);
        }
    }}finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Evaluate all the non-evaluated points of the simplex.
     *
     * @param evaluationFunction Evaluation function.
     * @param comparator Comparator to use to sort simplex vertices from best to worst.
     * @throws org.apache.commons.math3.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     */
    public void evaluate(final MultivariateFunction evaluationFunction,
                         final Comparator<PointValuePair> comparator) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36880);
        // Evaluate the objective function at all non-evaluated simplex points.
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36881);for (int i = 0; (((i < simplex.length)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36882)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36883)==0&false)); i++) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36884);final PointValuePair vertex = simplex[i];
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36885);final double[] point = vertex.getPointRef();
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36886);if ((((Double.isNaN(vertex.getValue()))&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36887)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36888)==0&false))) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36889);simplex[i] = new PointValuePair(point, evaluationFunction.value(point), false);
            }
        }}

        // Sort the simplex from best to worst.
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36890);Arrays.sort(simplex, comparator);
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Replace the worst point of the simplex by a new point.
     *
     * @param pointValuePair Point to insert.
     * @param comparator Comparator to use for sorting the simplex vertices
     * from best to worst.
     */
    protected void replaceWorstPoint(PointValuePair pointValuePair,
                                     final Comparator<PointValuePair> comparator) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36891);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36892);for (int i = 0; (((i < dimension)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36893)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36894)==0&false)); i++) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36895);if ((((comparator.compare(simplex[i], pointValuePair) > 0)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36896)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36897)==0&false))) {{
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36898);PointValuePair tmp = simplex[i];
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36899);simplex[i] = pointValuePair;
                __CLR4_4_1sdzsdzlb90p9oj.R.inc(36900);pointValuePair = tmp;
            }
        }}
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36901);simplex[dimension] = pointValuePair;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Get the points of the simplex.
     *
     * @return all the simplex points.
     */
    public PointValuePair[] getPoints() {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36902);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36903);final PointValuePair[] copy = new PointValuePair[simplex.length];
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36904);System.arraycopy(simplex, 0, copy, 0, simplex.length);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36905);return copy;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Get the simplex point stored at the requested {@code index}.
     *
     * @param index Location.
     * @return the point at location {@code index}.
     */
    public PointValuePair getPoint(int index) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36906);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36907);if ((((index < 0 ||
            index >= simplex.length)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36908)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36909)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36910);throw new OutOfRangeException(index, 0, simplex.length - 1);
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36911);return simplex[index];
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Store a new point at location {@code index}.
     * Note that no deep-copy of {@code point} is performed.
     *
     * @param index Location.
     * @param point New value.
     */
    protected void setPoint(int index, PointValuePair point) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36912);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36913);if ((((index < 0 ||
            index >= simplex.length)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36914)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36915)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36916);throw new OutOfRangeException(index, 0, simplex.length - 1);
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36917);simplex[index] = point;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Replace all points.
     * Note that no deep-copy of {@code points} is performed.
     *
     * @param points New Points.
     */
    protected void setPoints(PointValuePair[] points) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36918);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36919);if ((((points.length != simplex.length)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36920)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36921)==0&false))) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36922);throw new DimensionMismatchException(points.length, simplex.length);
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36923);simplex = points;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}

    /**
     * Create steps for a unit hypercube.
     *
     * @param n Dimension of the hypercube.
     * @param sideLength Length of the sides of the hypercube.
     * @return the steps.
     */
    private static double[] createHypercubeSteps(int n,
                                                 double sideLength) {try{__CLR4_4_1sdzsdzlb90p9oj.R.inc(36924);
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36925);final double[] steps = new double[n];
        __CLR4_4_1sdzsdzlb90p9oj.R.inc(36926);for (int i = 0; (((i < n)&&(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36927)!=0|true))||(__CLR4_4_1sdzsdzlb90p9oj.R.iget(36928)==0&false)); i++) {{
            __CLR4_4_1sdzsdzlb90p9oj.R.inc(36929);steps[i] = sideLength;
        }
        }__CLR4_4_1sdzsdzlb90p9oj.R.inc(36930);return steps;
    }finally{__CLR4_4_1sdzsdzlb90p9oj.R.flushNeeded();}}
}
