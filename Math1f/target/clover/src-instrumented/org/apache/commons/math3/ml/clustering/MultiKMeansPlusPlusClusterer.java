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

import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

/**
 * A wrapper around a k-means++ clustering algorithm which performs multiple trials
 * and returns the best solution.
 * @param <T> type of the points to cluster
 * @version $Id$
 * @since 3.2
 */
public class MultiKMeansPlusPlusClusterer<T extends Clusterable> extends Clusterer<T> {public static class __CLR4_4_1oinoinlb90p98g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,31806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The underlying k-means clusterer. */
    private final KMeansPlusPlusClusterer<T> clusterer;

    /** The number of trial runs. */
    private final int numTrials;

    /** Build a clusterer.
     * @param clusterer the k-means clusterer to use
     * @param numTrials number of trial runs
     */
    public MultiKMeansPlusPlusClusterer(final KMeansPlusPlusClusterer<T> clusterer,
                                        final int numTrials) {
        super(clusterer.getDistanceMeasure());__CLR4_4_1oinoinlb90p98g.R.inc(31776);try{__CLR4_4_1oinoinlb90p98g.R.inc(31775);
        __CLR4_4_1oinoinlb90p98g.R.inc(31777);this.clusterer = clusterer;
        __CLR4_4_1oinoinlb90p98g.R.inc(31778);this.numTrials = numTrials;
    }finally{__CLR4_4_1oinoinlb90p98g.R.flushNeeded();}}

    /**
     * Returns the embedded k-means clusterer used by this instance.
     * @return the embedded clusterer
     */
    public KMeansPlusPlusClusterer<T> getClusterer() {try{__CLR4_4_1oinoinlb90p98g.R.inc(31779);
        __CLR4_4_1oinoinlb90p98g.R.inc(31780);return clusterer;
    }finally{__CLR4_4_1oinoinlb90p98g.R.flushNeeded();}}

    /**
     * Returns the number of trials this instance will do.
     * @return the number of trials
     */
    public int getNumTrials() {try{__CLR4_4_1oinoinlb90p98g.R.inc(31781);
        __CLR4_4_1oinoinlb90p98g.R.inc(31782);return numTrials;
    }finally{__CLR4_4_1oinoinlb90p98g.R.flushNeeded();}}

    /**
     * Runs the K-means++ clustering algorithm.
     *
     * @param points the points to cluster
     * @return a list of clusters containing the points
     * @throws MathIllegalArgumentException if the data points are null or the number
     *   of clusters is larger than the number of data points
     * @throws ConvergenceException if an empty cluster is encountered and the
     *   underlying {@link KMeansPlusPlusClusterer} has its
     *   {@link KMeansPlusPlusClusterer.EmptyClusterStrategy} is set to {@code ERROR}.
     */
    @Override
    public List<CentroidCluster<T>> cluster(final Collection<T> points)
        throws MathIllegalArgumentException, ConvergenceException {try{__CLR4_4_1oinoinlb90p98g.R.inc(31783);

        // at first, we have not found any clusters list yet
        __CLR4_4_1oinoinlb90p98g.R.inc(31784);List<CentroidCluster<T>> best = null;
        __CLR4_4_1oinoinlb90p98g.R.inc(31785);double bestVarianceSum = Double.POSITIVE_INFINITY;

        // do several clustering trials
        __CLR4_4_1oinoinlb90p98g.R.inc(31786);for (int i = 0; (((i < numTrials)&&(__CLR4_4_1oinoinlb90p98g.R.iget(31787)!=0|true))||(__CLR4_4_1oinoinlb90p98g.R.iget(31788)==0&false)); ++i) {{

            // compute a clusters list
            __CLR4_4_1oinoinlb90p98g.R.inc(31789);List<CentroidCluster<T>> clusters = clusterer.cluster(points);

            // compute the variance of the current list
            __CLR4_4_1oinoinlb90p98g.R.inc(31790);double varianceSum = 0.0;
            __CLR4_4_1oinoinlb90p98g.R.inc(31791);for (final CentroidCluster<T> cluster : clusters) {{
                __CLR4_4_1oinoinlb90p98g.R.inc(31792);if ((((!cluster.getPoints().isEmpty())&&(__CLR4_4_1oinoinlb90p98g.R.iget(31793)!=0|true))||(__CLR4_4_1oinoinlb90p98g.R.iget(31794)==0&false))) {{

                    // compute the distance variance of the current cluster
                    __CLR4_4_1oinoinlb90p98g.R.inc(31795);final Clusterable center = cluster.getCenter();
                    __CLR4_4_1oinoinlb90p98g.R.inc(31796);final Variance stat = new Variance();
                    __CLR4_4_1oinoinlb90p98g.R.inc(31797);for (final T point : cluster.getPoints()) {{
                        __CLR4_4_1oinoinlb90p98g.R.inc(31798);stat.increment(distance(point, center));
                    }
                    }__CLR4_4_1oinoinlb90p98g.R.inc(31799);varianceSum += stat.getResult();

                }
            }}

            }__CLR4_4_1oinoinlb90p98g.R.inc(31800);if ((((varianceSum <= bestVarianceSum)&&(__CLR4_4_1oinoinlb90p98g.R.iget(31801)!=0|true))||(__CLR4_4_1oinoinlb90p98g.R.iget(31802)==0&false))) {{
                // this one is the best we have found so far, remember it
                __CLR4_4_1oinoinlb90p98g.R.inc(31803);best            = clusters;
                __CLR4_4_1oinoinlb90p98g.R.inc(31804);bestVarianceSum = varianceSum;
            }

        }}

        // return the best clusters list found
        }__CLR4_4_1oinoinlb90p98g.R.inc(31805);return best;

    }finally{__CLR4_4_1oinoinlb90p98g.R.flushNeeded();}}

}
