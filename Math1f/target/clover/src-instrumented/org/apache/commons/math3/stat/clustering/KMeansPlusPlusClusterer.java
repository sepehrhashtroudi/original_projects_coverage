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

package org.apache.commons.math3.stat.clustering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.util.MathUtils;

/**
 * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.
 * @param <T> type of the points to cluster
 * @see <a href="http://en.wikipedia.org/wiki/K-means%2B%2B">K-means++ (wikipedia)</a>
 * @version $Id$
 * @since 2.0
 * @deprecated As of 3.2 (to be removed in 4.0),
 * use {@link org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer} instead
 */
@java.lang.SuppressWarnings({"fallthrough"}) @Deprecated
public class KMeansPlusPlusClusterer<T extends Clusterable<T>> {public static class __CLR4_4_112i012i0lb90pakd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,50133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    /** Random generator for choosing initial centers. */
    private final Random random;

    /** Selected strategy for empty clusters. */
    private final EmptyClusterStrategy emptyStrategy;

    /** Build a clusterer.
     * <p>
     * The default strategy for handling empty clusters that may appear during
     * algorithm iterations is to split the cluster with largest distance variance.
     * </p>
     * @param random random generator to use for choosing initial centers
     */
    public KMeansPlusPlusClusterer(final Random random) {
        this(random, EmptyClusterStrategy.LARGEST_VARIANCE);__CLR4_4_112i012i0lb90pakd.R.inc(49897);try{__CLR4_4_112i012i0lb90pakd.R.inc(49896);
    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /** Build a clusterer.
     * @param random random generator to use for choosing initial centers
     * @param emptyStrategy strategy to use for handling empty clusters that
     * may appear during algorithm iterations
     * @since 2.2
     */
    public KMeansPlusPlusClusterer(final Random random, final EmptyClusterStrategy emptyStrategy) {try{__CLR4_4_112i012i0lb90pakd.R.inc(49898);
        __CLR4_4_112i012i0lb90pakd.R.inc(49899);this.random        = random;
        __CLR4_4_112i012i0lb90pakd.R.inc(49900);this.emptyStrategy = emptyStrategy;
    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Runs the K-means++ clustering algorithm.
     *
     * @param points the points to cluster
     * @param k the number of clusters to split the data into
     * @param numTrials number of trial runs
     * @param maxIterationsPerTrial the maximum number of iterations to run the algorithm
     *     for at each trial run.  If negative, no maximum will be used
     * @return a list of clusters containing the points
     * @throws MathIllegalArgumentException if the data points are null or the number
     *     of clusters is larger than the number of data points
     * @throws ConvergenceException if an empty cluster is encountered and the
     * {@link #emptyStrategy} is set to {@code ERROR}
     */
    public List<Cluster<T>> cluster(final Collection<T> points, final int k,
                                    int numTrials, int maxIterationsPerTrial)
        throws MathIllegalArgumentException, ConvergenceException {try{__CLR4_4_112i012i0lb90pakd.R.inc(49901);

        // at first, we have not found any clusters list yet
        __CLR4_4_112i012i0lb90pakd.R.inc(49902);List<Cluster<T>> best = null;
        __CLR4_4_112i012i0lb90pakd.R.inc(49903);double bestVarianceSum = Double.POSITIVE_INFINITY;

        // do several clustering trials
        __CLR4_4_112i012i0lb90pakd.R.inc(49904);for (int i = 0; (((i < numTrials)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49905)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49906)==0&false)); ++i) {{

            // compute a clusters list
            __CLR4_4_112i012i0lb90pakd.R.inc(49907);List<Cluster<T>> clusters = cluster(points, k, maxIterationsPerTrial);

            // compute the variance of the current list
            __CLR4_4_112i012i0lb90pakd.R.inc(49908);double varianceSum = 0.0;
            __CLR4_4_112i012i0lb90pakd.R.inc(49909);for (final Cluster<T> cluster : clusters) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(49910);if ((((!cluster.getPoints().isEmpty())&&(__CLR4_4_112i012i0lb90pakd.R.iget(49911)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49912)==0&false))) {{

                    // compute the distance variance of the current cluster
                    __CLR4_4_112i012i0lb90pakd.R.inc(49913);final T center = cluster.getCenter();
                    __CLR4_4_112i012i0lb90pakd.R.inc(49914);final Variance stat = new Variance();
                    __CLR4_4_112i012i0lb90pakd.R.inc(49915);for (final T point : cluster.getPoints()) {{
                        __CLR4_4_112i012i0lb90pakd.R.inc(49916);stat.increment(point.distanceFrom(center));
                    }
                    }__CLR4_4_112i012i0lb90pakd.R.inc(49917);varianceSum += stat.getResult();

                }
            }}

            }__CLR4_4_112i012i0lb90pakd.R.inc(49918);if ((((varianceSum <= bestVarianceSum)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49919)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49920)==0&false))) {{
                // this one is the best we have found so far, remember it
                __CLR4_4_112i012i0lb90pakd.R.inc(49921);best            = clusters;
                __CLR4_4_112i012i0lb90pakd.R.inc(49922);bestVarianceSum = varianceSum;
            }

        }}

        // return the best clusters list found
        }__CLR4_4_112i012i0lb90pakd.R.inc(49923);return best;

    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Runs the K-means++ clustering algorithm.
     *
     * @param points the points to cluster
     * @param k the number of clusters to split the data into
     * @param maxIterations the maximum number of iterations to run the algorithm
     *     for.  If negative, no maximum will be used
     * @return a list of clusters containing the points
     * @throws MathIllegalArgumentException if the data points are null or the number
     *     of clusters is larger than the number of data points
     * @throws ConvergenceException if an empty cluster is encountered and the
     * {@link #emptyStrategy} is set to {@code ERROR}
     */
    public List<Cluster<T>> cluster(final Collection<T> points, final int k,
                                    final int maxIterations)
        throws MathIllegalArgumentException, ConvergenceException {try{__CLR4_4_112i012i0lb90pakd.R.inc(49924);

        // sanity checks
        __CLR4_4_112i012i0lb90pakd.R.inc(49925);MathUtils.checkNotNull(points);

        // number of clusters has to be smaller or equal the number of data points
        __CLR4_4_112i012i0lb90pakd.R.inc(49926);if ((((points.size() < k)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49927)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49928)==0&false))) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(49929);throw new NumberIsTooSmallException(points.size(), k, false);
        }

        // create the initial clusters
        }__CLR4_4_112i012i0lb90pakd.R.inc(49930);List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);

        // create an array containing the latest assignment of a point to a cluster
        // no need to initialize the array, as it will be filled with the first assignment
        __CLR4_4_112i012i0lb90pakd.R.inc(49931);int[] assignments = new int[points.size()];
        __CLR4_4_112i012i0lb90pakd.R.inc(49932);assignPointsToClusters(clusters, points, assignments);

        // iterate through updating the centers until we're done
        __CLR4_4_112i012i0lb90pakd.R.inc(49933);final int max = ((((maxIterations < 0) )&&(__CLR4_4_112i012i0lb90pakd.R.iget(49934)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49935)==0&false))? Integer.MAX_VALUE : maxIterations;
        __CLR4_4_112i012i0lb90pakd.R.inc(49936);for (int count = 0; (((count < max)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49937)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49938)==0&false)); count++) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(49939);boolean emptyCluster = false;
            __CLR4_4_112i012i0lb90pakd.R.inc(49940);List<Cluster<T>> newClusters = new ArrayList<Cluster<T>>();
            __CLR4_4_112i012i0lb90pakd.R.inc(49941);for (final Cluster<T> cluster : clusters) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(49942);final T newCenter;
                __CLR4_4_112i012i0lb90pakd.R.inc(49943);if ((((cluster.getPoints().isEmpty())&&(__CLR4_4_112i012i0lb90pakd.R.iget(49944)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49945)==0&false))) {{
                    boolean __CLB4_4_1_bool0=false;__CLR4_4_112i012i0lb90pakd.R.inc(49946);switch (emptyStrategy) {
                        case LARGEST_VARIANCE :if (!__CLB4_4_1_bool0) {__CLR4_4_112i012i0lb90pakd.R.inc(49947);__CLB4_4_1_bool0=true;}
                            __CLR4_4_112i012i0lb90pakd.R.inc(49948);newCenter = getPointFromLargestVarianceCluster(clusters);
                            __CLR4_4_112i012i0lb90pakd.R.inc(49949);break;
                        case LARGEST_POINTS_NUMBER :if (!__CLB4_4_1_bool0) {__CLR4_4_112i012i0lb90pakd.R.inc(49950);__CLB4_4_1_bool0=true;}
                            __CLR4_4_112i012i0lb90pakd.R.inc(49951);newCenter = getPointFromLargestNumberCluster(clusters);
                            __CLR4_4_112i012i0lb90pakd.R.inc(49952);break;
                        case FARTHEST_POINT :if (!__CLB4_4_1_bool0) {__CLR4_4_112i012i0lb90pakd.R.inc(49953);__CLB4_4_1_bool0=true;}
                            __CLR4_4_112i012i0lb90pakd.R.inc(49954);newCenter = getFarthestPoint(clusters);
                            __CLR4_4_112i012i0lb90pakd.R.inc(49955);break;
                        default :if (!__CLB4_4_1_bool0) {__CLR4_4_112i012i0lb90pakd.R.inc(49956);__CLB4_4_1_bool0=true;}
                            __CLR4_4_112i012i0lb90pakd.R.inc(49957);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
                    }
                    __CLR4_4_112i012i0lb90pakd.R.inc(49958);emptyCluster = true;
                } }else {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(49959);newCenter = cluster.getCenter().centroidOf(cluster.getPoints());
                }
                }__CLR4_4_112i012i0lb90pakd.R.inc(49960);newClusters.add(new Cluster<T>(newCenter));
            }
            }__CLR4_4_112i012i0lb90pakd.R.inc(49961);int changes = assignPointsToClusters(newClusters, points, assignments);
            __CLR4_4_112i012i0lb90pakd.R.inc(49962);clusters = newClusters;

            // if there were no more changes in the point-to-cluster assignment
            // and there are no empty clusters left, return the current clusters
            __CLR4_4_112i012i0lb90pakd.R.inc(49963);if ((((changes == 0 && !emptyCluster)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49964)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49965)==0&false))) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(49966);return clusters;
            }
        }}
        }__CLR4_4_112i012i0lb90pakd.R.inc(49967);return clusters;
    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Adds the given points to the closest {@link Cluster}.
     *
     * @param <T> type of the points to cluster
     * @param clusters the {@link Cluster}s to add the points to
     * @param points the points to add to the given {@link Cluster}s
     * @param assignments points assignments to clusters
     * @return the number of points assigned to different clusters as the iteration before
     */
    private static <T extends Clusterable<T>> int
        assignPointsToClusters(final List<Cluster<T>> clusters, final Collection<T> points,
                               final int[] assignments) {try{__CLR4_4_112i012i0lb90pakd.R.inc(49968);
        __CLR4_4_112i012i0lb90pakd.R.inc(49969);int assignedDifferently = 0;
        __CLR4_4_112i012i0lb90pakd.R.inc(49970);int pointIndex = 0;
        __CLR4_4_112i012i0lb90pakd.R.inc(49971);for (final T p : points) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(49972);int clusterIndex = getNearestCluster(clusters, p);
            __CLR4_4_112i012i0lb90pakd.R.inc(49973);if ((((clusterIndex != assignments[pointIndex])&&(__CLR4_4_112i012i0lb90pakd.R.iget(49974)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49975)==0&false))) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(49976);assignedDifferently++;
            }

            }__CLR4_4_112i012i0lb90pakd.R.inc(49977);Cluster<T> cluster = clusters.get(clusterIndex);
            __CLR4_4_112i012i0lb90pakd.R.inc(49978);cluster.addPoint(p);
            __CLR4_4_112i012i0lb90pakd.R.inc(49979);assignments[pointIndex++] = clusterIndex;
        }

        }__CLR4_4_112i012i0lb90pakd.R.inc(49980);return assignedDifferently;
    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Use K-means++ to choose the initial centers.
     *
     * @param <T> type of the points to cluster
     * @param points the points to choose the initial centers from
     * @param k the number of centers to choose
     * @param random random generator to use
     * @return the initial centers
     */
    private static <T extends Clusterable<T>> List<Cluster<T>>
        chooseInitialCenters(final Collection<T> points, final int k, final Random random) {try{__CLR4_4_112i012i0lb90pakd.R.inc(49981);

        // Convert to list for indexed access. Make it unmodifiable, since removal of items
        // would screw up the logic of this method.
        __CLR4_4_112i012i0lb90pakd.R.inc(49982);final List<T> pointList = Collections.unmodifiableList(new ArrayList<T> (points));

        // The number of points in the list.
        __CLR4_4_112i012i0lb90pakd.R.inc(49983);final int numPoints = pointList.size();

        // Set the corresponding element in this array to indicate when
        // elements of pointList are no longer available.
        __CLR4_4_112i012i0lb90pakd.R.inc(49984);final boolean[] taken = new boolean[numPoints];

        // The resulting list of initial centers.
        __CLR4_4_112i012i0lb90pakd.R.inc(49985);final List<Cluster<T>> resultSet = new ArrayList<Cluster<T>>();

        // Choose one center uniformly at random from among the data points.
        __CLR4_4_112i012i0lb90pakd.R.inc(49986);final int firstPointIndex = random.nextInt(numPoints);

        __CLR4_4_112i012i0lb90pakd.R.inc(49987);final T firstPoint = pointList.get(firstPointIndex);

        __CLR4_4_112i012i0lb90pakd.R.inc(49988);resultSet.add(new Cluster<T>(firstPoint));

        // Must mark it as taken
        __CLR4_4_112i012i0lb90pakd.R.inc(49989);taken[firstPointIndex] = true;

        // To keep track of the minimum distance squared of elements of
        // pointList to elements of resultSet.
        __CLR4_4_112i012i0lb90pakd.R.inc(49990);final double[] minDistSquared = new double[numPoints];

        // Initialize the elements.  Since the only point in resultSet is firstPoint,
        // this is very easy.
        __CLR4_4_112i012i0lb90pakd.R.inc(49991);for (int i = 0; (((i < numPoints)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49992)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49993)==0&false)); i++) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(49994);if ((((i != firstPointIndex)&&(__CLR4_4_112i012i0lb90pakd.R.iget(49995)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(49996)==0&false))) {{ // That point isn't considered
                __CLR4_4_112i012i0lb90pakd.R.inc(49997);double d = firstPoint.distanceFrom(pointList.get(i));
                __CLR4_4_112i012i0lb90pakd.R.inc(49998);minDistSquared[i] = d*d;
            }
        }}

        }__CLR4_4_112i012i0lb90pakd.R.inc(49999);while ((((resultSet.size() < k)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50000)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50001)==0&false))) {{

            // Sum up the squared distances for the points in pointList not
            // already taken.
            __CLR4_4_112i012i0lb90pakd.R.inc(50002);double distSqSum = 0.0;

            __CLR4_4_112i012i0lb90pakd.R.inc(50003);for (int i = 0; (((i < numPoints)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50004)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50005)==0&false)); i++) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(50006);if ((((!taken[i])&&(__CLR4_4_112i012i0lb90pakd.R.iget(50007)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50008)==0&false))) {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(50009);distSqSum += minDistSquared[i];
                }
            }}

            // Add one new data point as a center. Each point x is chosen with
            // probability proportional to D(x)2
            }__CLR4_4_112i012i0lb90pakd.R.inc(50010);final double r = random.nextDouble() * distSqSum;

            // The index of the next point to be added to the resultSet.
            __CLR4_4_112i012i0lb90pakd.R.inc(50011);int nextPointIndex = -1;

            // Sum through the squared min distances again, stopping when
            // sum >= r.
            __CLR4_4_112i012i0lb90pakd.R.inc(50012);double sum = 0.0;
            __CLR4_4_112i012i0lb90pakd.R.inc(50013);for (int i = 0; (((i < numPoints)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50014)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50015)==0&false)); i++) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(50016);if ((((!taken[i])&&(__CLR4_4_112i012i0lb90pakd.R.iget(50017)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50018)==0&false))) {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(50019);sum += minDistSquared[i];
                    __CLR4_4_112i012i0lb90pakd.R.inc(50020);if ((((sum >= r)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50021)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50022)==0&false))) {{
                        __CLR4_4_112i012i0lb90pakd.R.inc(50023);nextPointIndex = i;
                        __CLR4_4_112i012i0lb90pakd.R.inc(50024);break;
                    }
                }}
            }}

            // If it's not set to >= 0, the point wasn't found in the previous
            // for loop, probably because distances are extremely small.  Just pick
            // the last available point.
            }__CLR4_4_112i012i0lb90pakd.R.inc(50025);if ((((nextPointIndex == -1)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50026)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50027)==0&false))) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(50028);for (int i = numPoints - 1; (((i >= 0)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50029)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50030)==0&false)); i--) {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(50031);if ((((!taken[i])&&(__CLR4_4_112i012i0lb90pakd.R.iget(50032)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50033)==0&false))) {{
                        __CLR4_4_112i012i0lb90pakd.R.inc(50034);nextPointIndex = i;
                        __CLR4_4_112i012i0lb90pakd.R.inc(50035);break;
                    }
                }}
            }}

            // We found one.
            }__CLR4_4_112i012i0lb90pakd.R.inc(50036);if ((((nextPointIndex >= 0)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50037)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50038)==0&false))) {{

                __CLR4_4_112i012i0lb90pakd.R.inc(50039);final T p = pointList.get(nextPointIndex);

                __CLR4_4_112i012i0lb90pakd.R.inc(50040);resultSet.add(new Cluster<T> (p));

                // Mark it as taken.
                __CLR4_4_112i012i0lb90pakd.R.inc(50041);taken[nextPointIndex] = true;

                __CLR4_4_112i012i0lb90pakd.R.inc(50042);if ((((resultSet.size() < k)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50043)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50044)==0&false))) {{
                    // Now update elements of minDistSquared.  We only have to compute
                    // the distance to the new center to do this.
                    __CLR4_4_112i012i0lb90pakd.R.inc(50045);for (int j = 0; (((j < numPoints)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50046)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50047)==0&false)); j++) {{
                        // Only have to worry about the points still not taken.
                        __CLR4_4_112i012i0lb90pakd.R.inc(50048);if ((((!taken[j])&&(__CLR4_4_112i012i0lb90pakd.R.iget(50049)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50050)==0&false))) {{
                            __CLR4_4_112i012i0lb90pakd.R.inc(50051);double d = p.distanceFrom(pointList.get(j));
                            __CLR4_4_112i012i0lb90pakd.R.inc(50052);double d2 = d * d;
                            __CLR4_4_112i012i0lb90pakd.R.inc(50053);if ((((d2 < minDistSquared[j])&&(__CLR4_4_112i012i0lb90pakd.R.iget(50054)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50055)==0&false))) {{
                                __CLR4_4_112i012i0lb90pakd.R.inc(50056);minDistSquared[j] = d2;
                            }
                        }}
                    }}
                }}

            }} }else {{
                // None found --
                // Break from the while loop to prevent
                // an infinite loop.
                __CLR4_4_112i012i0lb90pakd.R.inc(50057);break;
            }
        }}

        }__CLR4_4_112i012i0lb90pakd.R.inc(50058);return resultSet;
    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Get a random point from the {@link Cluster} with the largest distance variance.
     *
     * @param clusters the {@link Cluster}s to search
     * @return a random point from the selected cluster
     * @throws ConvergenceException if clusters are all empty
     */
    private T getPointFromLargestVarianceCluster(final Collection<Cluster<T>> clusters)
    throws ConvergenceException {try{__CLR4_4_112i012i0lb90pakd.R.inc(50059);

        __CLR4_4_112i012i0lb90pakd.R.inc(50060);double maxVariance = Double.NEGATIVE_INFINITY;
        __CLR4_4_112i012i0lb90pakd.R.inc(50061);Cluster<T> selected = null;
        __CLR4_4_112i012i0lb90pakd.R.inc(50062);for (final Cluster<T> cluster : clusters) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(50063);if ((((!cluster.getPoints().isEmpty())&&(__CLR4_4_112i012i0lb90pakd.R.iget(50064)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50065)==0&false))) {{

                // compute the distance variance of the current cluster
                __CLR4_4_112i012i0lb90pakd.R.inc(50066);final T center = cluster.getCenter();
                __CLR4_4_112i012i0lb90pakd.R.inc(50067);final Variance stat = new Variance();
                __CLR4_4_112i012i0lb90pakd.R.inc(50068);for (final T point : cluster.getPoints()) {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(50069);stat.increment(point.distanceFrom(center));
                }
                }__CLR4_4_112i012i0lb90pakd.R.inc(50070);final double variance = stat.getResult();

                // select the cluster with the largest variance
                __CLR4_4_112i012i0lb90pakd.R.inc(50071);if ((((variance > maxVariance)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50072)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50073)==0&false))) {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(50074);maxVariance = variance;
                    __CLR4_4_112i012i0lb90pakd.R.inc(50075);selected = cluster;
                }

            }}
        }}

        // did we find at least one non-empty cluster ?
        }__CLR4_4_112i012i0lb90pakd.R.inc(50076);if ((((selected == null)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50077)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50078)==0&false))) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(50079);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        // extract a random point from the cluster
        }__CLR4_4_112i012i0lb90pakd.R.inc(50080);final List<T> selectedPoints = selected.getPoints();
        __CLR4_4_112i012i0lb90pakd.R.inc(50081);return selectedPoints.remove(random.nextInt(selectedPoints.size()));

    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Get a random point from the {@link Cluster} with the largest number of points
     *
     * @param clusters the {@link Cluster}s to search
     * @return a random point from the selected cluster
     * @throws ConvergenceException if clusters are all empty
     */
    private T getPointFromLargestNumberCluster(final Collection<Cluster<T>> clusters) throws ConvergenceException {try{__CLR4_4_112i012i0lb90pakd.R.inc(50082);

        __CLR4_4_112i012i0lb90pakd.R.inc(50083);int maxNumber = 0;
        __CLR4_4_112i012i0lb90pakd.R.inc(50084);Cluster<T> selected = null;
        __CLR4_4_112i012i0lb90pakd.R.inc(50085);for (final Cluster<T> cluster : clusters) {{

            // get the number of points of the current cluster
            __CLR4_4_112i012i0lb90pakd.R.inc(50086);final int number = cluster.getPoints().size();

            // select the cluster with the largest number of points
            __CLR4_4_112i012i0lb90pakd.R.inc(50087);if ((((number > maxNumber)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50088)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50089)==0&false))) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(50090);maxNumber = number;
                __CLR4_4_112i012i0lb90pakd.R.inc(50091);selected = cluster;
            }

        }}

        // did we find at least one non-empty cluster ?
        }__CLR4_4_112i012i0lb90pakd.R.inc(50092);if ((((selected == null)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50093)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50094)==0&false))) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(50095);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        // extract a random point from the cluster
        }__CLR4_4_112i012i0lb90pakd.R.inc(50096);final List<T> selectedPoints = selected.getPoints();
        __CLR4_4_112i012i0lb90pakd.R.inc(50097);return selectedPoints.remove(random.nextInt(selectedPoints.size()));

    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Get the point farthest to its cluster center
     *
     * @param clusters the {@link Cluster}s to search
     * @return point farthest to its cluster center
     * @throws ConvergenceException if clusters are all empty
     */
    private T getFarthestPoint(final Collection<Cluster<T>> clusters) throws ConvergenceException {try{__CLR4_4_112i012i0lb90pakd.R.inc(50098);

        __CLR4_4_112i012i0lb90pakd.R.inc(50099);double maxDistance = Double.NEGATIVE_INFINITY;
        __CLR4_4_112i012i0lb90pakd.R.inc(50100);Cluster<T> selectedCluster = null;
        __CLR4_4_112i012i0lb90pakd.R.inc(50101);int selectedPoint = -1;
        __CLR4_4_112i012i0lb90pakd.R.inc(50102);for (final Cluster<T> cluster : clusters) {{

            // get the farthest point
            __CLR4_4_112i012i0lb90pakd.R.inc(50103);final T center = cluster.getCenter();
            __CLR4_4_112i012i0lb90pakd.R.inc(50104);final List<T> points = cluster.getPoints();
            __CLR4_4_112i012i0lb90pakd.R.inc(50105);for (int i = 0; (((i < points.size())&&(__CLR4_4_112i012i0lb90pakd.R.iget(50106)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50107)==0&false)); ++i) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(50108);final double distance = points.get(i).distanceFrom(center);
                __CLR4_4_112i012i0lb90pakd.R.inc(50109);if ((((distance > maxDistance)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50110)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50111)==0&false))) {{
                    __CLR4_4_112i012i0lb90pakd.R.inc(50112);maxDistance     = distance;
                    __CLR4_4_112i012i0lb90pakd.R.inc(50113);selectedCluster = cluster;
                    __CLR4_4_112i012i0lb90pakd.R.inc(50114);selectedPoint   = i;
                }
            }}

        }}

        // did we find at least one non-empty cluster ?
        }__CLR4_4_112i012i0lb90pakd.R.inc(50115);if ((((selectedCluster == null)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50116)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50117)==0&false))) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(50118);throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        }__CLR4_4_112i012i0lb90pakd.R.inc(50119);return selectedCluster.getPoints().remove(selectedPoint);

    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

    /**
     * Returns the nearest {@link Cluster} to the given point
     *
     * @param <T> type of the points to cluster
     * @param clusters the {@link Cluster}s to search
     * @param point the point to find the nearest {@link Cluster} for
     * @return the index of the nearest {@link Cluster} to the given point
     */
    private static <T extends Clusterable<T>> int
        getNearestCluster(final Collection<Cluster<T>> clusters, final T point) {try{__CLR4_4_112i012i0lb90pakd.R.inc(50120);
        __CLR4_4_112i012i0lb90pakd.R.inc(50121);double minDistance = Double.MAX_VALUE;
        __CLR4_4_112i012i0lb90pakd.R.inc(50122);int clusterIndex = 0;
        __CLR4_4_112i012i0lb90pakd.R.inc(50123);int minCluster = 0;
        __CLR4_4_112i012i0lb90pakd.R.inc(50124);for (final Cluster<T> c : clusters) {{
            __CLR4_4_112i012i0lb90pakd.R.inc(50125);final double distance = point.distanceFrom(c.getCenter());
            __CLR4_4_112i012i0lb90pakd.R.inc(50126);if ((((distance < minDistance)&&(__CLR4_4_112i012i0lb90pakd.R.iget(50127)!=0|true))||(__CLR4_4_112i012i0lb90pakd.R.iget(50128)==0&false))) {{
                __CLR4_4_112i012i0lb90pakd.R.inc(50129);minDistance = distance;
                __CLR4_4_112i012i0lb90pakd.R.inc(50130);minCluster = clusterIndex;
            }
            }__CLR4_4_112i012i0lb90pakd.R.inc(50131);clusterIndex++;
        }
        }__CLR4_4_112i012i0lb90pakd.R.inc(50132);return minCluster;
    }finally{__CLR4_4_112i012i0lb90pakd.R.flushNeeded();}}

}
