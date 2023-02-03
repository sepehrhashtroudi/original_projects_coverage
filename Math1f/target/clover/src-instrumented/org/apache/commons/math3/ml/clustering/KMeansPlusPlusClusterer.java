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

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.ml.distance.DistanceMeasure;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.util.MathUtils;

/**
 * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.
 * @param <T> type of the points to cluster
 * @see <a href="http://en.wikipedia.org/wiki/K-means%2B%2B">K-means++ (wikipedia)</a>
 * @version $Id$
 * @since 3.2
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class KMeansPlusPlusClusterer<T extends Clusterable> extends Clusterer<T> {public static class __CLR4_4_1obvobvlb90p98b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31775,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Strategies to use for replacing an empty cluster. */
    public static enum EmptyClusterStrategy {

        /** Split the cluster with largest distance variance. */
        LARGEST_VARIANCE,

        /** Split the cluster with largest number of points. */
        LARGEST_POINTS_NUMBER,

        /** Create a cluster around the point farthest from its centroid. */
        FARTHEST_POINT,

        /** Generate an error. */
        ERROR

    }

    /** The number of clusters. */
    private final int k;

    /** The maximum number of iterations. */
    private final int maxIterations;

    /** Random generator for choosing initial centers. */
    private final RandomGenerator random;

    /** Selected strategy for empty clusters. */
    private final EmptyClusterStrategy emptyStrategy;

    /** Build a clusterer.
     * <p>
     * The default strategy for handling empty clusters that may appear during
     * algorithm iterations is to split the cluster with largest distance variance.
     * <p>
     * The euclidean distance will be used as default distance measure.
     *
     * @param k the number of clusters to split the data into
     */
    public KMeansPlusPlusClusterer(final int k) {
        this(k, -1);__CLR4_4_1obvobvlb90p98b.R.inc(31532);try{__CLR4_4_1obvobvlb90p98b.R.inc(31531);
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /** Build a clusterer.
     * <p>
     * The default strategy for handling empty clusters that may appear during
     * algorithm iterations is to split the cluster with largest distance variance.
     * <p>
     * The euclidean distance will be used as default distance measure.
     *
     * @param k the number of clusters to split the data into
     * @param maxIterations the maximum number of iterations to run the algorithm for.
     *   If negative, no maximum will be used.
     */
    public KMeansPlusPlusClusterer(final int k, final int maxIterations) {
        this(k, maxIterations, new EuclideanDistance());__CLR4_4_1obvobvlb90p98b.R.inc(31534);try{__CLR4_4_1obvobvlb90p98b.R.inc(31533);
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /** Build a clusterer.
     * <p>
     * The default strategy for handling empty clusters that may appear during
     * algorithm iterations is to split the cluster with largest distance variance.
     *
     * @param k the number of clusters to split the data into
     * @param maxIterations the maximum number of iterations to run the algorithm for.
     *   If negative, no maximum will be used.
     * @param measure the distance measure to use
     */
    public KMeansPlusPlusClusterer(final int k, final int maxIterations, final DistanceMeasure measure) {
        this(k, maxIterations, measure, new JDKRandomGenerator());__CLR4_4_1obvobvlb90p98b.R.inc(31536);try{__CLR4_4_1obvobvlb90p98b.R.inc(31535);
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /** Build a clusterer.
     * <p>
     * The default strategy for handling empty clusters that may appear during
     * algorithm iterations is to split the cluster with largest distance variance.
     *
     * @param k the number of clusters to split the data into
     * @param maxIterations the maximum number of iterations to run the algorithm for.
     *   If negative, no maximum will be used.
     * @param measure the distance measure to use
     * @param random random generator to use for choosing initial centers
     */
    public KMeansPlusPlusClusterer(final int k, final int maxIterations,
                                   final DistanceMeasure measure,
                                   final RandomGenerator random) {
        this(k, maxIterations, measure, random, EmptyClusterStrategy.LARGEST_VARIANCE);__CLR4_4_1obvobvlb90p98b.R.inc(31538);try{__CLR4_4_1obvobvlb90p98b.R.inc(31537);
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /** Build a clusterer.
     *
     * @param k the number of clusters to split the data into
     * @param maxIterations the maximum number of iterations to run the algorithm for.
     *   If negative, no maximum will be used.
     * @param measure the distance measure to use
     * @param random random generator to use for choosing initial centers
     * @param emptyStrategy strategy to use for handling empty clusters that
     * may appear during algorithm iterations
     */
    public KMeansPlusPlusClusterer(final int k, final int maxIterations,
                                   final DistanceMeasure measure,
                                   final RandomGenerator random,
                                   final EmptyClusterStrategy emptyStrategy) {
        super(measure);__CLR4_4_1obvobvlb90p98b.R.inc(31540);try{__CLR4_4_1obvobvlb90p98b.R.inc(31539);
        __CLR4_4_1obvobvlb90p98b.R.inc(31541);this.k             = k;
        __CLR4_4_1obvobvlb90p98b.R.inc(31542);this.maxIterations = maxIterations;
        __CLR4_4_1obvobvlb90p98b.R.inc(31543);this.random        = random;
        __CLR4_4_1obvobvlb90p98b.R.inc(31544);this.emptyStrategy = emptyStrategy;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Return the number of clusters this instance will use.
     * @return the number of clusters
     */
    public int getK() {try{__CLR4_4_1obvobvlb90p98b.R.inc(31545);
        __CLR4_4_1obvobvlb90p98b.R.inc(31546);return k;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Returns the maximum number of iterations this instance will use.
     * @return the maximum number of iterations, or -1 if no maximum is set
     */
    public int getMaxIterations() {try{__CLR4_4_1obvobvlb90p98b.R.inc(31547);
        __CLR4_4_1obvobvlb90p98b.R.inc(31548);return maxIterations;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Returns the random generator this instance will use.
     * @return the random generator
     */
    public RandomGenerator getRandomGenerator() {try{__CLR4_4_1obvobvlb90p98b.R.inc(31549);
        __CLR4_4_1obvobvlb90p98b.R.inc(31550);return random;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Returns the {@link EmptyClusterStrategy} used by this instance.
     * @return the {@link EmptyClusterStrategy}
     */
    public EmptyClusterStrategy getEmptyClusterStrategy() {try{__CLR4_4_1obvobvlb90p98b.R.inc(31551);
        __CLR4_4_1obvobvlb90p98b.R.inc(31552);return emptyStrategy;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Runs the K-means++ clustering algorithm.
     *
     * @param points the points to cluster
     * @return a list of clusters containing the points
     * @throws MathIllegalArgumentException if the data points are null or the number
     *     of clusters is larger than the number of data points
     * @throws ConvergenceException if an empty cluster is encountered and the
     * {@link #emptyStrategy} is set to {@code ERROR}
     */
    @Override
    public List<CentroidCluster<T>> cluster(final Collection<T> points)
        throws MathIllegalArgumentException, ConvergenceException {try{__CLR4_4_1obvobvlb90p98b.R.inc(31553);

        // sanity checks
        __CLR4_4_1obvobvlb90p98b.R.inc(31554);MathUtils.checkNotNull(points);

        // number of clusters has to be smaller or equal the number of data points
        __CLR4_4_1obvobvlb90p98b.R.inc(31555);if ((((points.size() < k)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31556)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31557)==0&false))) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31558);throw new NumberIsTooSmallException(points.size(), k, false);
        }

        // create the initial clusters
        }__CLR4_4_1obvobvlb90p98b.R.inc(31559);List<CentroidCluster<T>> clusters = chooseInitialCenters(points);

        // create an array containing the latest assignment of a point to a cluster
        // no need to initialize the array, as it will be filled with the first assignment
        __CLR4_4_1obvobvlb90p98b.R.inc(31560);int[] assignments = new int[points.size()];
        __CLR4_4_1obvobvlb90p98b.R.inc(31561);assignPointsToClusters(clusters, points, assignments);

        // iterate through updating the centers until we're done
        __CLR4_4_1obvobvlb90p98b.R.inc(31562);final int max = ((((maxIterations < 0) )&&(__CLR4_4_1obvobvlb90p98b.R.iget(31563)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31564)==0&false))? Integer.MAX_VALUE : maxIterations;
        __CLR4_4_1obvobvlb90p98b.R.inc(31565);for (int count = 0; (((count < max)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31566)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31567)==0&false)); count++) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31568);boolean emptyCluster = false;
            __CLR4_4_1obvobvlb90p98b.R.inc(31569);List<CentroidCluster<T>> newClusters = new ArrayList<CentroidCluster<T>>();
            __CLR4_4_1obvobvlb90p98b.R.inc(31570);for (final CentroidCluster<T> cluster : clusters) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31571);final Clusterable newCenter;
                __CLR4_4_1obvobvlb90p98b.R.inc(31572);if ((((cluster.getPoints().isEmpty())&&(__CLR4_4_1obvobvlb90p98b.R.iget(31573)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31574)==0&false))) {{
                    boolean __CLB4_4_1_bool0=false;__CLR4_4_1obvobvlb90p98b.R.inc(31575);switch (emptyStrategy) {
                        case LARGEST_VARIANCE :if (!__CLB4_4_1_bool0) {__CLR4_4_1obvobvlb90p98b.R.inc(31576);__CLB4_4_1_bool0=true;}
                            __CLR4_4_1obvobvlb90p98b.R.inc(31577);newCenter = getPointFromLargestVarianceCluster(clusters);
                            __CLR4_4_1obvobvlb90p98b.R.inc(31578);break;
                        case LARGEST_POINTS_NUMBER :if (!__CLB4_4_1_bool0) {__CLR4_4_1obvobvlb90p98b.R.inc(31579);__CLB4_4_1_bool0=true;}
                            __CLR4_4_1obvobvlb90p98b.R.inc(31580);newCenter = getPointFromLargestNumberCluster(clusters);
                            __CLR4_4_1obvobvlb90p98b.R.inc(31581);break;
                        case FARTHEST_POINT :if (!__CLB4_4_1_bool0) {__CLR4_4_1obvobvlb90p98b.R.inc(31582);__CLB4_4_1_bool0=true;}
                            __CLR4_4_1obvobvlb90p98b.R.inc(31583);newCenter = getFarthestPoint(clusters);
                            __CLR4_4_1obvobvlb90p98b.R.inc(31584);break;
                        default :if (!__CLB4_4_1_bool0) {__CLR4_4_1obvobvlb90p98b.R.inc(31585);__CLB4_4_1_bool0=true;}
                            __CLR4_4_1obvobvlb90p98b.R.inc(31586);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
                    }
                    __CLR4_4_1obvobvlb90p98b.R.inc(31587);emptyCluster = true;
                } }else {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31588);newCenter = centroidOf(cluster.getPoints(), cluster.getCenter().getPoint().length);
                }
                }__CLR4_4_1obvobvlb90p98b.R.inc(31589);newClusters.add(new CentroidCluster<T>(newCenter));
            }
            }__CLR4_4_1obvobvlb90p98b.R.inc(31590);int changes = assignPointsToClusters(newClusters, points, assignments);
            __CLR4_4_1obvobvlb90p98b.R.inc(31591);clusters = newClusters;

            // if there were no more changes in the point-to-cluster assignment
            // and there are no empty clusters left, return the current clusters
            __CLR4_4_1obvobvlb90p98b.R.inc(31592);if ((((changes == 0 && !emptyCluster)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31593)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31594)==0&false))) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31595);return clusters;
            }
        }}
        }__CLR4_4_1obvobvlb90p98b.R.inc(31596);return clusters;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Adds the given points to the closest {@link Cluster}.
     *
     * @param clusters the {@link Cluster}s to add the points to
     * @param points the points to add to the given {@link Cluster}s
     * @param assignments points assignments to clusters
     * @return the number of points assigned to different clusters as the iteration before
     */
    private int assignPointsToClusters(final List<CentroidCluster<T>> clusters,
                                       final Collection<T> points,
                                       final int[] assignments) {try{__CLR4_4_1obvobvlb90p98b.R.inc(31597);
        __CLR4_4_1obvobvlb90p98b.R.inc(31598);int assignedDifferently = 0;
        __CLR4_4_1obvobvlb90p98b.R.inc(31599);int pointIndex = 0;
        __CLR4_4_1obvobvlb90p98b.R.inc(31600);for (final T p : points) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31601);int clusterIndex = getNearestCluster(clusters, p);
            __CLR4_4_1obvobvlb90p98b.R.inc(31602);if ((((clusterIndex != assignments[pointIndex])&&(__CLR4_4_1obvobvlb90p98b.R.iget(31603)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31604)==0&false))) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31605);assignedDifferently++;
            }

            }__CLR4_4_1obvobvlb90p98b.R.inc(31606);CentroidCluster<T> cluster = clusters.get(clusterIndex);
            __CLR4_4_1obvobvlb90p98b.R.inc(31607);cluster.addPoint(p);
            __CLR4_4_1obvobvlb90p98b.R.inc(31608);assignments[pointIndex++] = clusterIndex;
        }

        }__CLR4_4_1obvobvlb90p98b.R.inc(31609);return assignedDifferently;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Use K-means++ to choose the initial centers.
     *
     * @param points the points to choose the initial centers from
     * @return the initial centers
     */
    private List<CentroidCluster<T>> chooseInitialCenters(final Collection<T> points) {try{__CLR4_4_1obvobvlb90p98b.R.inc(31610);

        // Convert to list for indexed access. Make it unmodifiable, since removal of items
        // would screw up the logic of this method.
        __CLR4_4_1obvobvlb90p98b.R.inc(31611);final List<T> pointList = Collections.unmodifiableList(new ArrayList<T> (points));

        // The number of points in the list.
        __CLR4_4_1obvobvlb90p98b.R.inc(31612);final int numPoints = pointList.size();

        // Set the corresponding element in this array to indicate when
        // elements of pointList are no longer available.
        __CLR4_4_1obvobvlb90p98b.R.inc(31613);final boolean[] taken = new boolean[numPoints];

        // The resulting list of initial centers.
        __CLR4_4_1obvobvlb90p98b.R.inc(31614);final List<CentroidCluster<T>> resultSet = new ArrayList<CentroidCluster<T>>();

        // Choose one center uniformly at random from among the data points.
        __CLR4_4_1obvobvlb90p98b.R.inc(31615);final int firstPointIndex = random.nextInt(numPoints);

        __CLR4_4_1obvobvlb90p98b.R.inc(31616);final T firstPoint = pointList.get(firstPointIndex);

        __CLR4_4_1obvobvlb90p98b.R.inc(31617);resultSet.add(new CentroidCluster<T>(firstPoint));

        // Must mark it as taken
        __CLR4_4_1obvobvlb90p98b.R.inc(31618);taken[firstPointIndex] = true;

        // To keep track of the minimum distance squared of elements of
        // pointList to elements of resultSet.
        __CLR4_4_1obvobvlb90p98b.R.inc(31619);final double[] minDistSquared = new double[numPoints];

        // Initialize the elements.  Since the only point in resultSet is firstPoint,
        // this is very easy.
        __CLR4_4_1obvobvlb90p98b.R.inc(31620);for (int i = 0; (((i < numPoints)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31621)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31622)==0&false)); i++) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31623);if ((((i != firstPointIndex)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31624)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31625)==0&false))) {{ // That point isn't considered
                __CLR4_4_1obvobvlb90p98b.R.inc(31626);double d = distance(firstPoint, pointList.get(i));
                __CLR4_4_1obvobvlb90p98b.R.inc(31627);minDistSquared[i] = d*d;
            }
        }}

        }__CLR4_4_1obvobvlb90p98b.R.inc(31628);while ((((resultSet.size() < k)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31629)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31630)==0&false))) {{

            // Sum up the squared distances for the points in pointList not
            // already taken.
            __CLR4_4_1obvobvlb90p98b.R.inc(31631);double distSqSum = 0.0;

            __CLR4_4_1obvobvlb90p98b.R.inc(31632);for (int i = 0; (((i < numPoints)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31633)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31634)==0&false)); i++) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31635);if ((((!taken[i])&&(__CLR4_4_1obvobvlb90p98b.R.iget(31636)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31637)==0&false))) {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31638);distSqSum += minDistSquared[i];
                }
            }}

            // Add one new data point as a center. Each point x is chosen with
            // probability proportional to D(x)2
            }__CLR4_4_1obvobvlb90p98b.R.inc(31639);final double r = random.nextDouble() * distSqSum;

            // The index of the next point to be added to the resultSet.
            __CLR4_4_1obvobvlb90p98b.R.inc(31640);int nextPointIndex = -1;

            // Sum through the squared min distances again, stopping when
            // sum >= r.
            __CLR4_4_1obvobvlb90p98b.R.inc(31641);double sum = 0.0;
            __CLR4_4_1obvobvlb90p98b.R.inc(31642);for (int i = 0; (((i < numPoints)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31643)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31644)==0&false)); i++) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31645);if ((((!taken[i])&&(__CLR4_4_1obvobvlb90p98b.R.iget(31646)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31647)==0&false))) {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31648);sum += minDistSquared[i];
                    __CLR4_4_1obvobvlb90p98b.R.inc(31649);if ((((sum >= r)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31650)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31651)==0&false))) {{
                        __CLR4_4_1obvobvlb90p98b.R.inc(31652);nextPointIndex = i;
                        __CLR4_4_1obvobvlb90p98b.R.inc(31653);break;
                    }
                }}
            }}

            // If it's not set to >= 0, the point wasn't found in the previous
            // for loop, probably because distances are extremely small.  Just pick
            // the last available point.
            }__CLR4_4_1obvobvlb90p98b.R.inc(31654);if ((((nextPointIndex == -1)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31655)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31656)==0&false))) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31657);for (int i = numPoints - 1; (((i >= 0)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31658)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31659)==0&false)); i--) {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31660);if ((((!taken[i])&&(__CLR4_4_1obvobvlb90p98b.R.iget(31661)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31662)==0&false))) {{
                        __CLR4_4_1obvobvlb90p98b.R.inc(31663);nextPointIndex = i;
                        __CLR4_4_1obvobvlb90p98b.R.inc(31664);break;
                    }
                }}
            }}

            // We found one.
            }__CLR4_4_1obvobvlb90p98b.R.inc(31665);if ((((nextPointIndex >= 0)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31666)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31667)==0&false))) {{

                __CLR4_4_1obvobvlb90p98b.R.inc(31668);final T p = pointList.get(nextPointIndex);

                __CLR4_4_1obvobvlb90p98b.R.inc(31669);resultSet.add(new CentroidCluster<T> (p));

                // Mark it as taken.
                __CLR4_4_1obvobvlb90p98b.R.inc(31670);taken[nextPointIndex] = true;

                __CLR4_4_1obvobvlb90p98b.R.inc(31671);if ((((resultSet.size() < k)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31672)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31673)==0&false))) {{
                    // Now update elements of minDistSquared.  We only have to compute
                    // the distance to the new center to do this.
                    __CLR4_4_1obvobvlb90p98b.R.inc(31674);for (int j = 0; (((j < numPoints)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31675)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31676)==0&false)); j++) {{
                        // Only have to worry about the points still not taken.
                        __CLR4_4_1obvobvlb90p98b.R.inc(31677);if ((((!taken[j])&&(__CLR4_4_1obvobvlb90p98b.R.iget(31678)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31679)==0&false))) {{
                            __CLR4_4_1obvobvlb90p98b.R.inc(31680);double d = distance(p, pointList.get(j));
                            __CLR4_4_1obvobvlb90p98b.R.inc(31681);double d2 = d * d;
                            __CLR4_4_1obvobvlb90p98b.R.inc(31682);if ((((d2 < minDistSquared[j])&&(__CLR4_4_1obvobvlb90p98b.R.iget(31683)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31684)==0&false))) {{
                                __CLR4_4_1obvobvlb90p98b.R.inc(31685);minDistSquared[j] = d2;
                            }
                        }}
                    }}
                }}

            }} }else {{
                // None found --
                // Break from the while loop to prevent
                // an infinite loop.
                __CLR4_4_1obvobvlb90p98b.R.inc(31686);break;
            }
        }}

        }__CLR4_4_1obvobvlb90p98b.R.inc(31687);return resultSet;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Get a random point from the {@link Cluster} with the largest distance variance.
     *
     * @param clusters the {@link Cluster}s to search
     * @return a random point from the selected cluster
     * @throws ConvergenceException if clusters are all empty
     */
    private T getPointFromLargestVarianceCluster(final Collection<CentroidCluster<T>> clusters)
            throws ConvergenceException {try{__CLR4_4_1obvobvlb90p98b.R.inc(31688);

        __CLR4_4_1obvobvlb90p98b.R.inc(31689);double maxVariance = Double.NEGATIVE_INFINITY;
        __CLR4_4_1obvobvlb90p98b.R.inc(31690);Cluster<T> selected = null;
        __CLR4_4_1obvobvlb90p98b.R.inc(31691);for (final CentroidCluster<T> cluster : clusters) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31692);if ((((!cluster.getPoints().isEmpty())&&(__CLR4_4_1obvobvlb90p98b.R.iget(31693)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31694)==0&false))) {{

                // compute the distance variance of the current cluster
                __CLR4_4_1obvobvlb90p98b.R.inc(31695);final Clusterable center = cluster.getCenter();
                __CLR4_4_1obvobvlb90p98b.R.inc(31696);final Variance stat = new Variance();
                __CLR4_4_1obvobvlb90p98b.R.inc(31697);for (final T point : cluster.getPoints()) {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31698);stat.increment(distance(point, center));
                }
                }__CLR4_4_1obvobvlb90p98b.R.inc(31699);final double variance = stat.getResult();

                // select the cluster with the largest variance
                __CLR4_4_1obvobvlb90p98b.R.inc(31700);if ((((variance > maxVariance)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31701)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31702)==0&false))) {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31703);maxVariance = variance;
                    __CLR4_4_1obvobvlb90p98b.R.inc(31704);selected = cluster;
                }

            }}
        }}

        // did we find at least one non-empty cluster ?
        }__CLR4_4_1obvobvlb90p98b.R.inc(31705);if ((((selected == null)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31706)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31707)==0&false))) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31708);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        // extract a random point from the cluster
        }__CLR4_4_1obvobvlb90p98b.R.inc(31709);final List<T> selectedPoints = selected.getPoints();
        __CLR4_4_1obvobvlb90p98b.R.inc(31710);return selectedPoints.remove(random.nextInt(selectedPoints.size()));

    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Get a random point from the {@link Cluster} with the largest number of points
     *
     * @param clusters the {@link Cluster}s to search
     * @return a random point from the selected cluster
     * @throws ConvergenceException if clusters are all empty
     */
    private T getPointFromLargestNumberCluster(final Collection<? extends Cluster<T>> clusters)
            throws ConvergenceException {try{__CLR4_4_1obvobvlb90p98b.R.inc(31711);

        __CLR4_4_1obvobvlb90p98b.R.inc(31712);int maxNumber = 0;
        __CLR4_4_1obvobvlb90p98b.R.inc(31713);Cluster<T> selected = null;
        __CLR4_4_1obvobvlb90p98b.R.inc(31714);for (final Cluster<T> cluster : clusters) {{

            // get the number of points of the current cluster
            __CLR4_4_1obvobvlb90p98b.R.inc(31715);final int number = cluster.getPoints().size();

            // select the cluster with the largest number of points
            __CLR4_4_1obvobvlb90p98b.R.inc(31716);if ((((number > maxNumber)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31717)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31718)==0&false))) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31719);maxNumber = number;
                __CLR4_4_1obvobvlb90p98b.R.inc(31720);selected = cluster;
            }

        }}

        // did we find at least one non-empty cluster ?
        }__CLR4_4_1obvobvlb90p98b.R.inc(31721);if ((((selected == null)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31722)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31723)==0&false))) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31724);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        // extract a random point from the cluster
        }__CLR4_4_1obvobvlb90p98b.R.inc(31725);final List<T> selectedPoints = selected.getPoints();
        __CLR4_4_1obvobvlb90p98b.R.inc(31726);return selectedPoints.remove(random.nextInt(selectedPoints.size()));

    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Get the point farthest to its cluster center
     *
     * @param clusters the {@link Cluster}s to search
     * @return point farthest to its cluster center
     * @throws ConvergenceException if clusters are all empty
     */
    private T getFarthestPoint(final Collection<CentroidCluster<T>> clusters) throws ConvergenceException {try{__CLR4_4_1obvobvlb90p98b.R.inc(31727);

        __CLR4_4_1obvobvlb90p98b.R.inc(31728);double maxDistance = Double.NEGATIVE_INFINITY;
        __CLR4_4_1obvobvlb90p98b.R.inc(31729);Cluster<T> selectedCluster = null;
        __CLR4_4_1obvobvlb90p98b.R.inc(31730);int selectedPoint = -1;
        __CLR4_4_1obvobvlb90p98b.R.inc(31731);for (final CentroidCluster<T> cluster : clusters) {{

            // get the farthest point
            __CLR4_4_1obvobvlb90p98b.R.inc(31732);final Clusterable center = cluster.getCenter();
            __CLR4_4_1obvobvlb90p98b.R.inc(31733);final List<T> points = cluster.getPoints();
            __CLR4_4_1obvobvlb90p98b.R.inc(31734);for (int i = 0; (((i < points.size())&&(__CLR4_4_1obvobvlb90p98b.R.iget(31735)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31736)==0&false)); ++i) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31737);final double distance = distance(points.get(i), center);
                __CLR4_4_1obvobvlb90p98b.R.inc(31738);if ((((distance > maxDistance)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31739)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31740)==0&false))) {{
                    __CLR4_4_1obvobvlb90p98b.R.inc(31741);maxDistance     = distance;
                    __CLR4_4_1obvobvlb90p98b.R.inc(31742);selectedCluster = cluster;
                    __CLR4_4_1obvobvlb90p98b.R.inc(31743);selectedPoint   = i;
                }
            }}

        }}

        // did we find at least one non-empty cluster ?
        }__CLR4_4_1obvobvlb90p98b.R.inc(31744);if ((((selectedCluster == null)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31745)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31746)==0&false))) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31747);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        }__CLR4_4_1obvobvlb90p98b.R.inc(31748);return selectedCluster.getPoints().remove(selectedPoint);

    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Returns the nearest {@link Cluster} to the given point
     *
     * @param clusters the {@link Cluster}s to search
     * @param point the point to find the nearest {@link Cluster} for
     * @return the index of the nearest {@link Cluster} to the given point
     */
    private int getNearestCluster(final Collection<CentroidCluster<T>> clusters, final T point) {try{__CLR4_4_1obvobvlb90p98b.R.inc(31749);
        __CLR4_4_1obvobvlb90p98b.R.inc(31750);double minDistance = Double.MAX_VALUE;
        __CLR4_4_1obvobvlb90p98b.R.inc(31751);int clusterIndex = 0;
        __CLR4_4_1obvobvlb90p98b.R.inc(31752);int minCluster = 0;
        __CLR4_4_1obvobvlb90p98b.R.inc(31753);for (final CentroidCluster<T> c : clusters) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31754);final double distance = distance(point, c.getCenter());
            __CLR4_4_1obvobvlb90p98b.R.inc(31755);if ((((distance < minDistance)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31756)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31757)==0&false))) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31758);minDistance = distance;
                __CLR4_4_1obvobvlb90p98b.R.inc(31759);minCluster = clusterIndex;
            }
            }__CLR4_4_1obvobvlb90p98b.R.inc(31760);clusterIndex++;
        }
        }__CLR4_4_1obvobvlb90p98b.R.inc(31761);return minCluster;
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

    /**
     * Computes the centroid for a set of points.
     *
     * @param points the set of points
     * @param dimension the point dimension
     * @return the computed centroid for the set of points
     */
    private Clusterable centroidOf(final Collection<T> points, final int dimension) {try{__CLR4_4_1obvobvlb90p98b.R.inc(31762);
        __CLR4_4_1obvobvlb90p98b.R.inc(31763);final double[] centroid = new double[dimension];
        __CLR4_4_1obvobvlb90p98b.R.inc(31764);for (final T p : points) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31765);final double[] point = p.getPoint();
            __CLR4_4_1obvobvlb90p98b.R.inc(31766);for (int i = 0; (((i < centroid.length)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31767)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31768)==0&false)); i++) {{
                __CLR4_4_1obvobvlb90p98b.R.inc(31769);centroid[i] += point[i];
            }
        }}
        }__CLR4_4_1obvobvlb90p98b.R.inc(31770);for (int i = 0; (((i < centroid.length)&&(__CLR4_4_1obvobvlb90p98b.R.iget(31771)!=0|true))||(__CLR4_4_1obvobvlb90p98b.R.iget(31772)==0&false)); i++) {{
            __CLR4_4_1obvobvlb90p98b.R.inc(31773);centroid[i] /= points.size();
        }
        }__CLR4_4_1obvobvlb90p98b.R.inc(31774);return new DoublePoint(centroid);
    }finally{__CLR4_4_1obvobvlb90p98b.R.flushNeeded();}}

}
