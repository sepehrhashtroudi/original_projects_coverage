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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.junit.Assert;
import org.junit.Test;

public class KMeansPlusPlusClustererTest {static class __CLR4_4_129rx29rxlb90pekf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void dimension2() {__CLR4_4_129rx29rxlb90pekf.R.globalSliceStart(getClass().getName(),105981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sb25p29rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rx29rxlb90pekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rx29rxlb90pekf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.dimension2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sb25p29rx(){try{__CLR4_4_129rx29rxlb90pekf.R.inc(105981);
        __CLR4_4_129rx29rxlb90pekf.R.inc(105982);KMeansPlusPlusClusterer<EuclideanIntegerPoint> transformer =
            new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(new Random(1746432956321l));
        __CLR4_4_129rx29rxlb90pekf.R.inc(105983);EuclideanIntegerPoint[] points = new EuclideanIntegerPoint[] {

                // first expected cluster
                new EuclideanIntegerPoint(new int[] { -15,  3 }),
                new EuclideanIntegerPoint(new int[] { -15,  4 }),
                new EuclideanIntegerPoint(new int[] { -15,  5 }),
                new EuclideanIntegerPoint(new int[] { -14,  3 }),
                new EuclideanIntegerPoint(new int[] { -14,  5 }),
                new EuclideanIntegerPoint(new int[] { -13,  3 }),
                new EuclideanIntegerPoint(new int[] { -13,  4 }),
                new EuclideanIntegerPoint(new int[] { -13,  5 }),

                // second expected cluster
                new EuclideanIntegerPoint(new int[] { -1,  0 }),
                new EuclideanIntegerPoint(new int[] { -1, -1 }),
                new EuclideanIntegerPoint(new int[] {  0, -1 }),
                new EuclideanIntegerPoint(new int[] {  1, -1 }),
                new EuclideanIntegerPoint(new int[] {  1, -2 }),

                // third expected cluster
                new EuclideanIntegerPoint(new int[] { 13,  3 }),
                new EuclideanIntegerPoint(new int[] { 13,  4 }),
                new EuclideanIntegerPoint(new int[] { 14,  4 }),
                new EuclideanIntegerPoint(new int[] { 14,  7 }),
                new EuclideanIntegerPoint(new int[] { 16,  5 }),
                new EuclideanIntegerPoint(new int[] { 16,  6 }),
                new EuclideanIntegerPoint(new int[] { 17,  4 }),
                new EuclideanIntegerPoint(new int[] { 17,  7 })

        };
        __CLR4_4_129rx29rxlb90pekf.R.inc(105984);List<Cluster<EuclideanIntegerPoint>> clusters =
            transformer.cluster(Arrays.asList(points), 3, 5, 10);

        __CLR4_4_129rx29rxlb90pekf.R.inc(105985);Assert.assertEquals(3, clusters.size());
        __CLR4_4_129rx29rxlb90pekf.R.inc(105986);boolean cluster1Found = false;
        __CLR4_4_129rx29rxlb90pekf.R.inc(105987);boolean cluster2Found = false;
        __CLR4_4_129rx29rxlb90pekf.R.inc(105988);boolean cluster3Found = false;
        __CLR4_4_129rx29rxlb90pekf.R.inc(105989);for (Cluster<EuclideanIntegerPoint> cluster : clusters) {{
            __CLR4_4_129rx29rxlb90pekf.R.inc(105990);int[] center = cluster.getCenter().getPoint();
            __CLR4_4_129rx29rxlb90pekf.R.inc(105991);if ((((center[0] < 0)&&(__CLR4_4_129rx29rxlb90pekf.R.iget(105992)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(105993)==0&false))) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(105994);cluster1Found = true;
                __CLR4_4_129rx29rxlb90pekf.R.inc(105995);Assert.assertEquals(8, cluster.getPoints().size());
                __CLR4_4_129rx29rxlb90pekf.R.inc(105996);Assert.assertEquals(-14, center[0]);
                __CLR4_4_129rx29rxlb90pekf.R.inc(105997);Assert.assertEquals( 4, center[1]);
            } }else {__CLR4_4_129rx29rxlb90pekf.R.inc(105998);if ((((center[1] < 0)&&(__CLR4_4_129rx29rxlb90pekf.R.iget(105999)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106000)==0&false))) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106001);cluster2Found = true;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106002);Assert.assertEquals(5, cluster.getPoints().size());
                __CLR4_4_129rx29rxlb90pekf.R.inc(106003);Assert.assertEquals( 0, center[0]);
                __CLR4_4_129rx29rxlb90pekf.R.inc(106004);Assert.assertEquals(-1, center[1]);
            } }else {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106005);cluster3Found = true;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106006);Assert.assertEquals(8, cluster.getPoints().size());
                __CLR4_4_129rx29rxlb90pekf.R.inc(106007);Assert.assertEquals(15, center[0]);
                __CLR4_4_129rx29rxlb90pekf.R.inc(106008);Assert.assertEquals(5, center[1]);
            }
        }}}
        }__CLR4_4_129rx29rxlb90pekf.R.inc(106009);Assert.assertTrue(cluster1Found);
        __CLR4_4_129rx29rxlb90pekf.R.inc(106010);Assert.assertTrue(cluster2Found);
        __CLR4_4_129rx29rxlb90pekf.R.inc(106011);Assert.assertTrue(cluster3Found);

    }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

    /**
     * JIRA: MATH-305
     *
     * Two points, one cluster, one iteration
     */
    @Test
    public void testPerformClusterAnalysisDegenerate() {__CLR4_4_129rx29rxlb90pekf.R.globalSliceStart(getClass().getName(),106012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bai9a429ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rx29rxlb90pekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rx29rxlb90pekf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisDegenerate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bai9a429ss(){try{__CLR4_4_129rx29rxlb90pekf.R.inc(106012);
        __CLR4_4_129rx29rxlb90pekf.R.inc(106013);KMeansPlusPlusClusterer<EuclideanIntegerPoint> transformer = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(
                new Random(1746432956321l));
        __CLR4_4_129rx29rxlb90pekf.R.inc(106014);EuclideanIntegerPoint[] points = new EuclideanIntegerPoint[] {
                new EuclideanIntegerPoint(new int[] { 1959, 325100 }),
                new EuclideanIntegerPoint(new int[] { 1960, 373200 }), };
        __CLR4_4_129rx29rxlb90pekf.R.inc(106015);List<Cluster<EuclideanIntegerPoint>> clusters = transformer.cluster(Arrays.asList(points), 1, 1);
        __CLR4_4_129rx29rxlb90pekf.R.inc(106016);Assert.assertEquals(1, clusters.size());
        __CLR4_4_129rx29rxlb90pekf.R.inc(106017);Assert.assertEquals(2, (clusters.get(0).getPoints().size()));
        __CLR4_4_129rx29rxlb90pekf.R.inc(106018);EuclideanIntegerPoint pt1 = new EuclideanIntegerPoint(new int[] { 1959, 325100 });
        __CLR4_4_129rx29rxlb90pekf.R.inc(106019);EuclideanIntegerPoint pt2 = new EuclideanIntegerPoint(new int[] { 1960, 373200 });
        __CLR4_4_129rx29rxlb90pekf.R.inc(106020);Assert.assertTrue(clusters.get(0).getPoints().contains(pt1));
        __CLR4_4_129rx29rxlb90pekf.R.inc(106021);Assert.assertTrue(clusters.get(0).getPoints().contains(pt2));

    }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

    @Test
    public void testCertainSpace() {__CLR4_4_129rx29rxlb90pekf.R.globalSliceStart(getClass().getName(),106022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w6tvh29t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rx29rxlb90pekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rx29rxlb90pekf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testCertainSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w6tvh29t2(){try{__CLR4_4_129rx29rxlb90pekf.R.inc(106022);
        __CLR4_4_129rx29rxlb90pekf.R.inc(106023);KMeansPlusPlusClusterer.EmptyClusterStrategy[] strategies = {
            KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE,
            KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER,
            KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT
        };
        __CLR4_4_129rx29rxlb90pekf.R.inc(106024);for (KMeansPlusPlusClusterer.EmptyClusterStrategy strategy : strategies) {{
            __CLR4_4_129rx29rxlb90pekf.R.inc(106025);KMeansPlusPlusClusterer<EuclideanIntegerPoint> transformer =
                new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(new Random(1746432956321l), strategy);
            __CLR4_4_129rx29rxlb90pekf.R.inc(106026);int numberOfVariables = 27;
            // initialise testvalues
            __CLR4_4_129rx29rxlb90pekf.R.inc(106027);int position1 = 1;
            __CLR4_4_129rx29rxlb90pekf.R.inc(106028);int position2 = position1 + numberOfVariables;
            __CLR4_4_129rx29rxlb90pekf.R.inc(106029);int position3 = position2 + numberOfVariables;
            __CLR4_4_129rx29rxlb90pekf.R.inc(106030);int position4 = position3 + numberOfVariables;
            // testvalues will be multiplied
            __CLR4_4_129rx29rxlb90pekf.R.inc(106031);int multiplier = 1000000;

            __CLR4_4_129rx29rxlb90pekf.R.inc(106032);EuclideanIntegerPoint[] breakingPoints = new EuclideanIntegerPoint[numberOfVariables];
            // define the space which will break the cluster algorithm
            __CLR4_4_129rx29rxlb90pekf.R.inc(106033);for (int i = 0; (((i < numberOfVariables)&&(__CLR4_4_129rx29rxlb90pekf.R.iget(106034)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106035)==0&false)); i++) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106036);int points[] = { position1, position2, position3, position4 };
                // multiply the values
                __CLR4_4_129rx29rxlb90pekf.R.inc(106037);for (int j = 0; (((j < points.length)&&(__CLR4_4_129rx29rxlb90pekf.R.iget(106038)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106039)==0&false)); j++) {{
                    __CLR4_4_129rx29rxlb90pekf.R.inc(106040);points[j] = points[j] * multiplier;
                }
                }__CLR4_4_129rx29rxlb90pekf.R.inc(106041);EuclideanIntegerPoint euclideanIntegerPoint = new EuclideanIntegerPoint(points);
                __CLR4_4_129rx29rxlb90pekf.R.inc(106042);breakingPoints[i] = euclideanIntegerPoint;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106043);position1 = position1 + numberOfVariables;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106044);position2 = position2 + numberOfVariables;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106045);position3 = position3 + numberOfVariables;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106046);position4 = position4 + numberOfVariables;
            }

            }__CLR4_4_129rx29rxlb90pekf.R.inc(106047);for (int n = 2; (((n < 27)&&(__CLR4_4_129rx29rxlb90pekf.R.iget(106048)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106049)==0&false)); ++n) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106050);List<Cluster<EuclideanIntegerPoint>> clusters =
                    transformer.cluster(Arrays.asList(breakingPoints), n, 100);
                __CLR4_4_129rx29rxlb90pekf.R.inc(106051);Assert.assertEquals(n, clusters.size());
                __CLR4_4_129rx29rxlb90pekf.R.inc(106052);int sum = 0;
                __CLR4_4_129rx29rxlb90pekf.R.inc(106053);for (Cluster<EuclideanIntegerPoint> cluster : clusters) {{
                    __CLR4_4_129rx29rxlb90pekf.R.inc(106054);sum += cluster.getPoints().size();
                }
                }__CLR4_4_129rx29rxlb90pekf.R.inc(106055);Assert.assertEquals(numberOfVariables, sum);
            }
        }}

    }}finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

    /**
     * A helper class for testSmallDistances(). This class is similar to EuclideanIntegerPoint, but
     * it defines a different distanceFrom() method that tends to return distances less than 1.
     */
    private class CloseIntegerPoint implements Clusterable<CloseIntegerPoint> {
        public CloseIntegerPoint(EuclideanIntegerPoint point) {try{__CLR4_4_129rx29rxlb90pekf.R.inc(106056);
            __CLR4_4_129rx29rxlb90pekf.R.inc(106057);euclideanPoint = point;
        }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

        public double distanceFrom(CloseIntegerPoint p) {try{__CLR4_4_129rx29rxlb90pekf.R.inc(106058);
            __CLR4_4_129rx29rxlb90pekf.R.inc(106059);return euclideanPoint.distanceFrom(p.euclideanPoint) * 0.001;
        }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

        public CloseIntegerPoint centroidOf(Collection<CloseIntegerPoint> p) {try{__CLR4_4_129rx29rxlb90pekf.R.inc(106060);
            __CLR4_4_129rx29rxlb90pekf.R.inc(106061);Collection<EuclideanIntegerPoint> euclideanPoints =
                new ArrayList<EuclideanIntegerPoint>();
            __CLR4_4_129rx29rxlb90pekf.R.inc(106062);for (CloseIntegerPoint point : p) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106063);euclideanPoints.add(point.euclideanPoint);
            }
            }__CLR4_4_129rx29rxlb90pekf.R.inc(106064);return new CloseIntegerPoint(euclideanPoint.centroidOf(euclideanPoints));
        }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_4_129rx29rxlb90pekf.R.inc(106065);
            __CLR4_4_129rx29rxlb90pekf.R.inc(106066);if ((((!(o instanceof CloseIntegerPoint))&&(__CLR4_4_129rx29rxlb90pekf.R.iget(106067)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106068)==0&false))) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106069);return false;
            }
            }__CLR4_4_129rx29rxlb90pekf.R.inc(106070);CloseIntegerPoint p = (CloseIntegerPoint) o;

            __CLR4_4_129rx29rxlb90pekf.R.inc(106071);return euclideanPoint.equals(p.euclideanPoint);
        }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_129rx29rxlb90pekf.R.inc(106072);
            __CLR4_4_129rx29rxlb90pekf.R.inc(106073);return euclideanPoint.hashCode();
        }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

        private EuclideanIntegerPoint euclideanPoint;
    }

    /**
     * Test points that are very close together. See issue MATH-546.
     */
    @Test
    public void testSmallDistances() {__CLR4_4_129rx29rxlb90pekf.R.globalSliceStart(getClass().getName(),106074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfgldc29ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rx29rxlb90pekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rx29rxlb90pekf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testSmallDistances",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106074,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfgldc29ui(){try{__CLR4_4_129rx29rxlb90pekf.R.inc(106074);
        // Create a bunch of CloseIntegerPoints. Most are identical, but one is different by a
        // small distance.
        __CLR4_4_129rx29rxlb90pekf.R.inc(106075);int[] repeatedArray = { 0 };
        __CLR4_4_129rx29rxlb90pekf.R.inc(106076);int[] uniqueArray = { 1 };
        __CLR4_4_129rx29rxlb90pekf.R.inc(106077);CloseIntegerPoint repeatedPoint =
            new CloseIntegerPoint(new EuclideanIntegerPoint(repeatedArray));
        __CLR4_4_129rx29rxlb90pekf.R.inc(106078);CloseIntegerPoint uniquePoint =
            new CloseIntegerPoint(new EuclideanIntegerPoint(uniqueArray));

        __CLR4_4_129rx29rxlb90pekf.R.inc(106079);Collection<CloseIntegerPoint> points = new ArrayList<CloseIntegerPoint>();
        __CLR4_4_129rx29rxlb90pekf.R.inc(106080);final int NUM_REPEATED_POINTS = 10 * 1000;
        __CLR4_4_129rx29rxlb90pekf.R.inc(106081);for (int i = 0; (((i < NUM_REPEATED_POINTS)&&(__CLR4_4_129rx29rxlb90pekf.R.iget(106082)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106083)==0&false)); ++i) {{
            __CLR4_4_129rx29rxlb90pekf.R.inc(106084);points.add(repeatedPoint);
        }
        }__CLR4_4_129rx29rxlb90pekf.R.inc(106085);points.add(uniquePoint);

        // Ask a KMeansPlusPlusClusterer to run zero iterations (i.e., to simply choose initial
        // cluster centers).
        __CLR4_4_129rx29rxlb90pekf.R.inc(106086);final long RANDOM_SEED = 0;
        __CLR4_4_129rx29rxlb90pekf.R.inc(106087);final int NUM_CLUSTERS = 2;
        __CLR4_4_129rx29rxlb90pekf.R.inc(106088);final int NUM_ITERATIONS = 0;
        __CLR4_4_129rx29rxlb90pekf.R.inc(106089);KMeansPlusPlusClusterer<CloseIntegerPoint> clusterer =
            new KMeansPlusPlusClusterer<CloseIntegerPoint>(new Random(RANDOM_SEED));
        __CLR4_4_129rx29rxlb90pekf.R.inc(106090);List<Cluster<CloseIntegerPoint>> clusters =
            clusterer.cluster(points, NUM_CLUSTERS, NUM_ITERATIONS);

        // Check that one of the chosen centers is the unique point.
        __CLR4_4_129rx29rxlb90pekf.R.inc(106091);boolean uniquePointIsCenter = false;
        __CLR4_4_129rx29rxlb90pekf.R.inc(106092);for (Cluster<CloseIntegerPoint> cluster : clusters) {{
            __CLR4_4_129rx29rxlb90pekf.R.inc(106093);if ((((cluster.getCenter().equals(uniquePoint))&&(__CLR4_4_129rx29rxlb90pekf.R.iget(106094)!=0|true))||(__CLR4_4_129rx29rxlb90pekf.R.iget(106095)==0&false))) {{
                __CLR4_4_129rx29rxlb90pekf.R.inc(106096);uniquePointIsCenter = true;
            }
        }}
        }__CLR4_4_129rx29rxlb90pekf.R.inc(106097);Assert.assertTrue(uniquePointIsCenter);
    }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}
    
    /**
     * 2 variables cannot be clustered into 3 clusters. See issue MATH-436.
     */
    @Test(expected=NumberIsTooSmallException.class)
    public void testPerformClusterAnalysisToManyClusters() {__CLR4_4_129rx29rxlb90pekf.R.globalSliceStart(getClass().getName(),106098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uaj7wh29v6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,101,114,102,111,114,109,67,108,117,115,116,101,114,65,110,97,108,121,115,105,115,84,111,77,97,110,121,67,108,117,115,116,101,114,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129rx29rxlb90pekf.R.rethrow($CLV_t2$);}finally{__CLR4_4_129rx29rxlb90pekf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisToManyClusters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uaj7wh29v6(){try{__CLR4_4_129rx29rxlb90pekf.R.inc(106098);
        __CLR4_4_129rx29rxlb90pekf.R.inc(106099);KMeansPlusPlusClusterer<EuclideanIntegerPoint> transformer = 
            new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(
                    new Random(1746432956321l));
        
        __CLR4_4_129rx29rxlb90pekf.R.inc(106100);EuclideanIntegerPoint[] points = new EuclideanIntegerPoint[] {
            new EuclideanIntegerPoint(new int[] {
                1959, 325100
            }), new EuclideanIntegerPoint(new int[] {
                1960, 373200
            })
        };
        
        __CLR4_4_129rx29rxlb90pekf.R.inc(106101);transformer.cluster(Arrays.asList(points), 3, 1);

    }finally{__CLR4_4_129rx29rxlb90pekf.R.flushNeeded();}}

}
