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
package org.apache.commons.math3.ml.clustering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.ml.distance.DistanceMeasure;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.MathUtils;

/**
 * Fuzzy K-Means clustering algorithm.
 * <p>
 * The Fuzzy K-Means algorithm is a variation of the classical K-Means algorithm, with the
 * major difference that a single data point is not uniquely assigned to a single cluster.
 * Instead, each point i has a set of weights u<sub>ij</sub> which indicate the degree of membership
 * to the cluster j.
 * <p>
 * The algorithm then tries to minimize the objective function:
 * <pre>
 * J = &#8721;<sub>i=1..C</sub>&#8721;<sub>k=1..N</sub> u<sub>ik</sub><sup>m</sup>d<sub>ik</sub><sup>2</sup>
 * </pre>
 * with d<sub>ik</sub> being the distance between data point i and the cluster center k.
 * <p>
 * The algorithm requires two parameters:
 * <ul>
 *   <li>k: the number of clusters
 *   <li>fuzziness: determines the level of cluster fuzziness, larger values lead to fuzzier clusters
 * </ul>
 * Additional, optional parameters:
 * <ul>
 *   <li>maxIterations: the maximum number of iterations
 *   <li>epsilon: the convergence criteria, default is 1e-3
 * </ul>
 * <p>
 * The fuzzy variant of the K-Means algorithm is more robust with regard to the selection
 * of the initial cluster centers.
 *
 * @param <T> type of the points to cluster
 * @version $Id$
 * @since 3.3
 */
public class FuzzyKMeansClusterer<T extends Clusterable> extends Clusterer<T> {public static class __CLR4_4_1o7jo7jlb90p97w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31531,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The default value for the convergence criteria. */
    private static final double DEFAULT_EPSILON = 1e-3;

    /** The number of clusters. */
    private final int k;

    /** The maximum number of iterations. */
    private final int maxIterations;

    /** The fuzziness factor. */
    private final double fuzziness;

    /** The convergence criteria. */
    private final double epsilon;

    /** Random generator for choosing initial centers. */
    private final RandomGenerator random;

    /** The membership matrix. */
    private double[][] membershipMatrix;

    /** The list of points used in the last call to {@link #cluster(Collection)}. */
    private List<T> points;

    /** The list of clusters resulting from the last call to {@link #cluster(Collection)}. */
    private List<CentroidCluster<T>> clusters;

    /**
     * Creates a new instance of a FuzzyKMeansClusterer.
     * <p>
     * The euclidean distance will be used as default distance measure.
     *
     * @param k the number of clusters to split the data into
     * @param fuzziness the fuzziness factor, must be &gt; 1.0
     * @throws NumberIsTooSmallException if {@code fuzziness <= 1.0}
     */
    public FuzzyKMeansClusterer(final int k, final double fuzziness) throws NumberIsTooSmallException {
        this(k, fuzziness, -1, new EuclideanDistance());__CLR4_4_1o7jo7jlb90p97w.R.inc(31376);try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31375);
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Creates a new instance of a FuzzyKMeansClusterer.
     *
     * @param k the number of clusters to split the data into
     * @param fuzziness the fuzziness factor, must be &gt; 1.0
     * @param maxIterations the maximum number of iterations to run the algorithm for.
     *   If negative, no maximum will be used.
     * @param measure the distance measure to use
     * @throws NumberIsTooSmallException if {@code fuzziness <= 1.0}
     */
    public FuzzyKMeansClusterer(final int k, final double fuzziness,
                                final int maxIterations, final DistanceMeasure measure)
            throws NumberIsTooSmallException {
        this(k, fuzziness, maxIterations, measure, DEFAULT_EPSILON, new JDKRandomGenerator());__CLR4_4_1o7jo7jlb90p97w.R.inc(31378);try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31377);
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Creates a new instance of a FuzzyKMeansClusterer.
     *
     * @param k the number of clusters to split the data into
     * @param fuzziness the fuzziness factor, must be &gt; 1.0
     * @param maxIterations the maximum number of iterations to run the algorithm for.
     *   If negative, no maximum will be used.
     * @param measure the distance measure to use
     * @param epsilon the convergence criteria (default is 1e-3)
     * @param random random generator to use for choosing initial centers
     * @throws NumberIsTooSmallException if {@code fuzziness <= 1.0}
     */
    public FuzzyKMeansClusterer(final int k, final double fuzziness,
                                final int maxIterations, final DistanceMeasure measure,
                                final double epsilon, final RandomGenerator random)
            throws NumberIsTooSmallException {

        super(measure);__CLR4_4_1o7jo7jlb90p97w.R.inc(31380);try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31379);

        __CLR4_4_1o7jo7jlb90p97w.R.inc(31381);if ((((fuzziness <= 1.0d)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31382)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31383)==0&false))) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31384);throw new NumberIsTooSmallException(fuzziness, 1.0, false);
        }
        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31385);this.k = k;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31386);this.fuzziness = fuzziness;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31387);this.maxIterations = maxIterations;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31388);this.epsilon = epsilon;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31389);this.random = random;

        __CLR4_4_1o7jo7jlb90p97w.R.inc(31390);this.membershipMatrix = null;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31391);this.points = null;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31392);this.clusters = null;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Return the number of clusters this instance will use.
     * @return the number of clusters
     */
    public int getK() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31393);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31394);return k;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns the fuzziness factor used by this instance.
     * @return the fuzziness factor
     */
    public double getFuzziness() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31395);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31396);return fuzziness;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns the maximum number of iterations this instance will use.
     * @return the maximum number of iterations, or -1 if no maximum is set
     */
    public int getMaxIterations() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31397);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31398);return maxIterations;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns the convergence criteria used by this instance.
     * @return the convergence criteria
     */
    public double getEpsilon() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31399);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31400);return epsilon;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns the random generator this instance will use.
     * @return the random generator
     */
    public RandomGenerator getRandomGenerator() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31401);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31402);return random;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns the {@code nxk} membership matrix, where {@code n} is the number
     * of data points and {@code k} the number of clusters.
     * <p>
     * The element U<sub>i,j</sub> represents the membership value for data point {@code i}
     * to cluster {@code j}.
     *
     * @return the membership matrix
     * @throws MathIllegalStateException if {@link #cluster(Collection)} has not been called before
     */
    public RealMatrix getMembershipMatrix() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31403);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31404);if ((((membershipMatrix == null)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31405)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31406)==0&false))) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31407);throw new MathIllegalStateException();
        }
        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31408);return MatrixUtils.createRealMatrix(membershipMatrix);
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns an unmodifiable list of the data points used in the last
     * call to {@link #cluster(Collection)}.
     * @return the list of data points, or {@code null} if {@link #cluster(Collection)} has
     *   not been called before.
     */
    public List<T> getDataPoints() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31409);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31410);return points;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Returns the list of clusters resulting from the last call to {@link #cluster(Collection)}.
     * @return the list of clusters, or {@code null} if {@link #cluster(Collection)} has
     *   not been called before.
     */
    public List<CentroidCluster<T>> getClusters() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31411);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31412);return clusters;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Get the value of the objective function.
     * @return the objective function evaluation as double value
     * @throws MathIllegalStateException if {@link #cluster(Collection)} has not been called before
     */
    public double getObjectiveFunctionValue() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31413);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31414);if ((((points == null || clusters == null)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31415)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31416)==0&false))) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31417);throw new MathIllegalStateException();
        }

        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31418);int i = 0;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31419);double objFunction = 0.0;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31420);for (final T point : points) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31421);int j = 0;
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31422);for (final CentroidCluster<T> cluster : clusters) {{
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31423);final double dist = distance(point, cluster.getCenter());
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31424);objFunction += (dist * dist) * FastMath.pow(membershipMatrix[i][j], fuzziness);
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31425);j++;
            }
            }__CLR4_4_1o7jo7jlb90p97w.R.inc(31426);i++;
        }
        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31427);return objFunction;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Performs Fuzzy K-Means cluster analysis.
     *
     * @param dataPoints the points to cluster
     * @return the list of clusters
     * @throws MathIllegalArgumentException if the data points are null or the number
     *     of clusters is larger than the number of data points
     */
    @Override
    public List<CentroidCluster<T>> cluster(final Collection<T> dataPoints)
            throws MathIllegalArgumentException {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31428);

        // sanity checks
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31429);MathUtils.checkNotNull(dataPoints);

        __CLR4_4_1o7jo7jlb90p97w.R.inc(31430);final int size = dataPoints.size();

        // number of clusters has to be smaller or equal the number of data points
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31431);if ((((size < k)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31432)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31433)==0&false))) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31434);throw new NumberIsTooSmallException(size, k, false);
        }

        // copy the input collection to an unmodifiable list with indexed access
        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31435);points = Collections.unmodifiableList(new ArrayList<T>(dataPoints));
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31436);clusters = new ArrayList<CentroidCluster<T>>();
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31437);membershipMatrix = new double[size][k];
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31438);final double[][] oldMatrix = new double[size][k];

        // if no points are provided, return an empty list of clusters
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31439);if ((((size == 0)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31440)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31441)==0&false))) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31442);return clusters;
        }

        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31443);initializeMembershipMatrix();

        // there is at least one point
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31444);final int pointDimension = points.get(0).getPoint().length;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31445);for (int i = 0; (((i < k)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31446)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31447)==0&false)); i++) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31448);clusters.add(new CentroidCluster<T>(new DoublePoint(new double[pointDimension])));
        }

        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31449);int iteration = 0;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31450);final int max = ((((maxIterations < 0) )&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31451)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31452)==0&false))? Integer.MAX_VALUE : maxIterations;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31453);double difference = 0.0;

        __CLR4_4_1o7jo7jlb90p97w.R.inc(31454);do {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31455);saveMembershipMatrix(oldMatrix);
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31456);updateClusterCenters();
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31457);updateMembershipMatrix();
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31458);difference = calculateMaxMembershipChange(oldMatrix);
        } }while ((((difference > epsilon && ++iteration < max)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31459)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31460)==0&false)));

        __CLR4_4_1o7jo7jlb90p97w.R.inc(31461);return clusters;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Update the cluster centers.
     */
    private void updateClusterCenters() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31462);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31463);int j = 0;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31464);final List<CentroidCluster<T>> newClusters = new ArrayList<CentroidCluster<T>>(k);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31465);for (final CentroidCluster<T> cluster : clusters) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31466);final Clusterable center = cluster.getCenter();
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31467);int i = 0;
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31468);double[] arr = new double[center.getPoint().length];
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31469);double sum = 0.0;
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31470);for (final T point : points) {{
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31471);final double u = FastMath.pow(membershipMatrix[i][j], fuzziness);
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31472);final double[] pointArr = point.getPoint();
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31473);for (int idx = 0; (((idx < arr.length)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31474)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31475)==0&false)); idx++) {{
                    __CLR4_4_1o7jo7jlb90p97w.R.inc(31476);arr[idx] += u * pointArr[idx];
                }
                }__CLR4_4_1o7jo7jlb90p97w.R.inc(31477);sum += u;
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31478);i++;
            }
            }__CLR4_4_1o7jo7jlb90p97w.R.inc(31479);MathArrays.scaleInPlace(1.0 / sum, arr);
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31480);newClusters.add(new CentroidCluster<T>(new DoublePoint(arr)));
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31481);j++;
        }
        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31482);clusters.clear();
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31483);clusters = newClusters;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Updates the membership matrix and assigns the points to the cluster with
     * the highest membership.
     */
    private void updateMembershipMatrix() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31484);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31485);for (int i = 0; (((i < points.size())&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31486)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31487)==0&false)); i++) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31488);final T point = points.get(i);
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31489);double maxMembership = 0.0;
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31490);int newCluster = -1;
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31491);for (int j = 0; (((j < clusters.size())&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31492)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31493)==0&false)); j++) {{
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31494);double sum = 0.0;
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31495);final double distA = FastMath.abs(distance(point, clusters.get(j).getCenter()));

                __CLR4_4_1o7jo7jlb90p97w.R.inc(31496);for (final CentroidCluster<T> c : clusters) {{
                    __CLR4_4_1o7jo7jlb90p97w.R.inc(31497);final double distB = FastMath.abs(distance(point, c.getCenter()));
                    __CLR4_4_1o7jo7jlb90p97w.R.inc(31498);sum += FastMath.pow(distA / distB, 2.0 / (fuzziness - 1.0));
                }

                }__CLR4_4_1o7jo7jlb90p97w.R.inc(31499);membershipMatrix[i][j] = 1.0 / sum;

                __CLR4_4_1o7jo7jlb90p97w.R.inc(31500);if ((((membershipMatrix[i][j] > maxMembership)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31501)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31502)==0&false))) {{
                    __CLR4_4_1o7jo7jlb90p97w.R.inc(31503);maxMembership = membershipMatrix[i][j];
                    __CLR4_4_1o7jo7jlb90p97w.R.inc(31504);newCluster = j;
                }
            }}
            }__CLR4_4_1o7jo7jlb90p97w.R.inc(31505);clusters.get(newCluster).addPoint(point);
        }
    }}finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Initialize the membership matrix with random values.
     */
    private void initializeMembershipMatrix() {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31506);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31507);for (int i = 0; (((i < points.size())&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31508)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31509)==0&false)); i++) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31510);for (int j = 0; (((j < k)&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31511)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31512)==0&false)); j++) {{
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31513);membershipMatrix[i][j] = random.nextDouble();
            }
            }__CLR4_4_1o7jo7jlb90p97w.R.inc(31514);membershipMatrix[i] = MathArrays.normalizeArray(membershipMatrix[i], 1.0);
        }
    }}finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Calculate the maximum element-by-element change of the membership matrix
     * for the current iteration.
     *
     * @param matrix the membership matrix of the previous iteration
     * @return the maximum membership matrix change
     */
    private double calculateMaxMembershipChange(final double[][] matrix) {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31515);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31516);double maxMembership = 0.0;
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31517);for (int i = 0; (((i < points.size())&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31518)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31519)==0&false)); i++) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31520);for (int j = 0; (((j < clusters.size())&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31521)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31522)==0&false)); j++) {{
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31523);double v = FastMath.abs(membershipMatrix[i][j] - matrix[i][j]);
                __CLR4_4_1o7jo7jlb90p97w.R.inc(31524);maxMembership = FastMath.max(v, maxMembership);
            }
        }}
        }__CLR4_4_1o7jo7jlb90p97w.R.inc(31525);return maxMembership;
    }finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

    /**
     * Copy the membership matrix into the provided matrix.
     *
     * @param matrix the place to store the membership matrix
     */
    private void saveMembershipMatrix(final double[][] matrix) {try{__CLR4_4_1o7jo7jlb90p97w.R.inc(31526);
        __CLR4_4_1o7jo7jlb90p97w.R.inc(31527);for (int i = 0; (((i < points.size())&&(__CLR4_4_1o7jo7jlb90p97w.R.iget(31528)!=0|true))||(__CLR4_4_1o7jo7jlb90p97w.R.iget(31529)==0&false)); i++) {{
            __CLR4_4_1o7jo7jlb90p97w.R.inc(31530);System.arraycopy(membershipMatrix[i], 0, matrix[i], 0, clusters.size());
        }
    }}finally{__CLR4_4_1o7jo7jlb90p97w.R.flushNeeded();}}

}
