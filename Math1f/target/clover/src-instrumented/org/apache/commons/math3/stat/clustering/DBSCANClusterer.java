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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.MathUtils;

/**
 * DBSCAN (density-based spatial clustering of applications with noise) algorithm.
 * <p>
 * The DBSCAN algorithm forms clusters based on the idea of density connectivity, i.e.
 * a point p is density connected to another point q, if there exists a chain of
 * points p<sub>i</sub>, with i = 1 .. n and p<sub>1</sub> = p and p<sub>n</sub> = q,
 * such that each pair &lt;p<sub>i</sub>, p<sub>i+1</sub>&gt; is directly density-reachable.
 * A point q is directly density-reachable from point p if it is in the &epsilon;-neighborhood
 * of this point.
 * <p>
 * Any point that is not density-reachable from a formed cluster is treated as noise, and
 * will thus not be present in the result.
 * <p>
 * The algorithm requires two parameters:
 * <ul>
 *   <li>eps: the distance that defines the &epsilon;-neighborhood of a point
 *   <li>minPoints: the minimum number of density-connected points required to form a cluster
 * </ul>
 * <p>
 * <b>Note:</b> as DBSCAN is not a centroid-based clustering algorithm, the resulting
 * {@link Cluster} objects will have no defined center, i.e. {@link Cluster#getCenter()} will
 * return {@code null}.
 *
 * @param <T> type of the points to cluster
 * @see <a href="http://en.wikipedia.org/wiki/DBSCAN">DBSCAN (wikipedia)</a>
 * @see <a href="http://www.dbs.ifi.lmu.de/Publikationen/Papers/KDD-96.final.frame.pdf">
 * A Density-Based Algorithm for Discovering Clusters in Large Spatial Databases with Noise</a>
 * @version $Id$
 * @since 3.1
 * @deprecated As of 3.2 (to be removed in 4.0),
 * use {@link org.apache.commons.math3.ml.clustering.DBSCANClusterer} instead
 */
@Deprecated
public class DBSCANClusterer<T extends Clusterable<T>> {public static class __CLR4_4_112ef12eflb90pajs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Maximum radius of the neighborhood to be considered. */
    private final double              eps;

    /** Minimum number of points needed for a cluster. */
    private final int                 minPts;

    /** Status of a point during the clustering process. */
    private enum PointStatus {
        /** The point has is considered to be noise. */
        NOISE,
        /** The point is already part of a cluster. */
        PART_OF_CLUSTER
    }

    /**
     * Creates a new instance of a DBSCANClusterer.
     *
     * @param eps maximum radius of the neighborhood to be considered
     * @param minPts minimum number of points needed for a cluster
     * @throws NotPositiveException if {@code eps < 0.0} or {@code minPts < 0}
     */
    public DBSCANClusterer(final double eps, final int minPts)
        throws NotPositiveException {try{__CLR4_4_112ef12eflb90pajs.R.inc(49767);
        __CLR4_4_112ef12eflb90pajs.R.inc(49768);if ((((eps < 0.0d)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49769)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49770)==0&false))) {{
            __CLR4_4_112ef12eflb90pajs.R.inc(49771);throw new NotPositiveException(eps);
        }
        }__CLR4_4_112ef12eflb90pajs.R.inc(49772);if ((((minPts < 0)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49773)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49774)==0&false))) {{
            __CLR4_4_112ef12eflb90pajs.R.inc(49775);throw new NotPositiveException(minPts);
        }
        }__CLR4_4_112ef12eflb90pajs.R.inc(49776);this.eps = eps;
        __CLR4_4_112ef12eflb90pajs.R.inc(49777);this.minPts = minPts;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}

    /**
     * Returns the maximum radius of the neighborhood to be considered.
     *
     * @return maximum radius of the neighborhood
     */
    public double getEps() {try{__CLR4_4_112ef12eflb90pajs.R.inc(49778);
        __CLR4_4_112ef12eflb90pajs.R.inc(49779);return eps;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}

    /**
     * Returns the minimum number of points needed for a cluster.
     *
     * @return minimum number of points needed for a cluster
     */
    public int getMinPts() {try{__CLR4_4_112ef12eflb90pajs.R.inc(49780);
        __CLR4_4_112ef12eflb90pajs.R.inc(49781);return minPts;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}

    /**
     * Performs DBSCAN cluster analysis.
     * <p>
     * <b>Note:</b> as DBSCAN is not a centroid-based clustering algorithm, the resulting
     * {@link Cluster} objects will have no defined center, i.e. {@link Cluster#getCenter()} will
     * return {@code null}.
     *
     * @param points the points to cluster
     * @return the list of clusters
     * @throws NullArgumentException if the data points are null
     */
    public List<Cluster<T>> cluster(final Collection<T> points) throws NullArgumentException {try{__CLR4_4_112ef12eflb90pajs.R.inc(49782);

        // sanity checks
        __CLR4_4_112ef12eflb90pajs.R.inc(49783);MathUtils.checkNotNull(points);

        __CLR4_4_112ef12eflb90pajs.R.inc(49784);final List<Cluster<T>> clusters = new ArrayList<Cluster<T>>();
        __CLR4_4_112ef12eflb90pajs.R.inc(49785);final Map<Clusterable<T>, PointStatus> visited = new HashMap<Clusterable<T>, PointStatus>();

        __CLR4_4_112ef12eflb90pajs.R.inc(49786);for (final T point : points) {{
            __CLR4_4_112ef12eflb90pajs.R.inc(49787);if ((((visited.get(point) != null)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49788)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49789)==0&false))) {{
                __CLR4_4_112ef12eflb90pajs.R.inc(49790);continue;
            }
            }__CLR4_4_112ef12eflb90pajs.R.inc(49791);final List<T> neighbors = getNeighbors(point, points);
            __CLR4_4_112ef12eflb90pajs.R.inc(49792);if ((((neighbors.size() >= minPts)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49793)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49794)==0&false))) {{
                // DBSCAN does not care about center points
                __CLR4_4_112ef12eflb90pajs.R.inc(49795);final Cluster<T> cluster = new Cluster<T>(null);
                __CLR4_4_112ef12eflb90pajs.R.inc(49796);clusters.add(expandCluster(cluster, point, neighbors, points, visited));
            } }else {{
                __CLR4_4_112ef12eflb90pajs.R.inc(49797);visited.put(point, PointStatus.NOISE);
            }
        }}

        }__CLR4_4_112ef12eflb90pajs.R.inc(49798);return clusters;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}

    /**
     * Expands the cluster to include density-reachable items.
     *
     * @param cluster Cluster to expand
     * @param point Point to add to cluster
     * @param neighbors List of neighbors
     * @param points the data set
     * @param visited the set of already visited points
     * @return the expanded cluster
     */
    private Cluster<T> expandCluster(final Cluster<T> cluster,
                                     final T point,
                                     final List<T> neighbors,
                                     final Collection<T> points,
                                     final Map<Clusterable<T>, PointStatus> visited) {try{__CLR4_4_112ef12eflb90pajs.R.inc(49799);
        __CLR4_4_112ef12eflb90pajs.R.inc(49800);cluster.addPoint(point);
        __CLR4_4_112ef12eflb90pajs.R.inc(49801);visited.put(point, PointStatus.PART_OF_CLUSTER);

        __CLR4_4_112ef12eflb90pajs.R.inc(49802);List<T> seeds = new ArrayList<T>(neighbors);
        __CLR4_4_112ef12eflb90pajs.R.inc(49803);int index = 0;
        __CLR4_4_112ef12eflb90pajs.R.inc(49804);while ((((index < seeds.size())&&(__CLR4_4_112ef12eflb90pajs.R.iget(49805)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49806)==0&false))) {{
            __CLR4_4_112ef12eflb90pajs.R.inc(49807);final T current = seeds.get(index);
            __CLR4_4_112ef12eflb90pajs.R.inc(49808);PointStatus pStatus = visited.get(current);
            // only check non-visited points
            __CLR4_4_112ef12eflb90pajs.R.inc(49809);if ((((pStatus == null)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49810)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49811)==0&false))) {{
                __CLR4_4_112ef12eflb90pajs.R.inc(49812);final List<T> currentNeighbors = getNeighbors(current, points);
                __CLR4_4_112ef12eflb90pajs.R.inc(49813);if ((((currentNeighbors.size() >= minPts)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49814)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49815)==0&false))) {{
                    __CLR4_4_112ef12eflb90pajs.R.inc(49816);seeds = merge(seeds, currentNeighbors);
                }
            }}

            }__CLR4_4_112ef12eflb90pajs.R.inc(49817);if ((((pStatus != PointStatus.PART_OF_CLUSTER)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49818)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49819)==0&false))) {{
                __CLR4_4_112ef12eflb90pajs.R.inc(49820);visited.put(current, PointStatus.PART_OF_CLUSTER);
                __CLR4_4_112ef12eflb90pajs.R.inc(49821);cluster.addPoint(current);
            }

            }__CLR4_4_112ef12eflb90pajs.R.inc(49822);index++;
        }
        }__CLR4_4_112ef12eflb90pajs.R.inc(49823);return cluster;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}

    /**
     * Returns a list of density-reachable neighbors of a {@code point}.
     *
     * @param point the point to look for
     * @param points possible neighbors
     * @return the List of neighbors
     */
    private List<T> getNeighbors(final T point, final Collection<T> points) {try{__CLR4_4_112ef12eflb90pajs.R.inc(49824);
        __CLR4_4_112ef12eflb90pajs.R.inc(49825);final List<T> neighbors = new ArrayList<T>();
        __CLR4_4_112ef12eflb90pajs.R.inc(49826);for (final T neighbor : points) {{
            __CLR4_4_112ef12eflb90pajs.R.inc(49827);if ((((point != neighbor && neighbor.distanceFrom(point) <= eps)&&(__CLR4_4_112ef12eflb90pajs.R.iget(49828)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49829)==0&false))) {{
                __CLR4_4_112ef12eflb90pajs.R.inc(49830);neighbors.add(neighbor);
            }
        }}
        }__CLR4_4_112ef12eflb90pajs.R.inc(49831);return neighbors;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}

    /**
     * Merges two lists together.
     *
     * @param one first list
     * @param two second list
     * @return merged lists
     */
    private List<T> merge(final List<T> one, final List<T> two) {try{__CLR4_4_112ef12eflb90pajs.R.inc(49832);
        __CLR4_4_112ef12eflb90pajs.R.inc(49833);final Set<T> oneSet = new HashSet<T>(one);
        __CLR4_4_112ef12eflb90pajs.R.inc(49834);for (T item : two) {{
            __CLR4_4_112ef12eflb90pajs.R.inc(49835);if ((((!oneSet.contains(item))&&(__CLR4_4_112ef12eflb90pajs.R.iget(49836)!=0|true))||(__CLR4_4_112ef12eflb90pajs.R.iget(49837)==0&false))) {{
                __CLR4_4_112ef12eflb90pajs.R.inc(49838);one.add(item);
            }
        }}
        }__CLR4_4_112ef12eflb90pajs.R.inc(49839);return one;
    }finally{__CLR4_4_112ef12eflb90pajs.R.flushNeeded();}}
}
