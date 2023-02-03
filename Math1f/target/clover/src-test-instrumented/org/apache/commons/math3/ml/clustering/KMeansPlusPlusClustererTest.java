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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KMeansPlusPlusClustererTest {static class __CLR4_4_11y391y39lb90pdgu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,90915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private RandomGenerator random;

    @Before
    public void setUp() {try{__CLR4_4_11y391y39lb90pdgu.R.inc(90837);
        __CLR4_4_11y391y39lb90pdgu.R.inc(90838);random = new JDKRandomGenerator();
        __CLR4_4_11y391y39lb90pdgu.R.inc(90839);random.setSeed(1746432956321l);        
    }finally{__CLR4_4_11y391y39lb90pdgu.R.flushNeeded();}}

    /**
     * JIRA: MATH-305
     *
     * Two points, one cluster, one iteration
     */
    @Test
    public void testPerformClusterAnalysisDegenerate() {__CLR4_4_11y391y39lb90pdgu.R.globalSliceStart(getClass().getName(),90840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bai9a41y3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y391y39lb90pdgu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y391y39lb90pdgu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisDegenerate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bai9a41y3c(){try{__CLR4_4_11y391y39lb90pdgu.R.inc(90840);
        __CLR4_4_11y391y39lb90pdgu.R.inc(90841);KMeansPlusPlusClusterer<DoublePoint> transformer =
                new KMeansPlusPlusClusterer<DoublePoint>(1, 1);

        __CLR4_4_11y391y39lb90pdgu.R.inc(90842);DoublePoint[] points = new DoublePoint[] {
                new DoublePoint(new int[] { 1959, 325100 }),
                new DoublePoint(new int[] { 1960, 373200 }), };
        __CLR4_4_11y391y39lb90pdgu.R.inc(90843);List<? extends Cluster<DoublePoint>> clusters = transformer.cluster(Arrays.asList(points));
        __CLR4_4_11y391y39lb90pdgu.R.inc(90844);Assert.assertEquals(1, clusters.size());
        __CLR4_4_11y391y39lb90pdgu.R.inc(90845);Assert.assertEquals(2, (clusters.get(0).getPoints().size()));
        __CLR4_4_11y391y39lb90pdgu.R.inc(90846);DoublePoint pt1 = new DoublePoint(new int[] { 1959, 325100 });
        __CLR4_4_11y391y39lb90pdgu.R.inc(90847);DoublePoint pt2 = new DoublePoint(new int[] { 1960, 373200 });
        __CLR4_4_11y391y39lb90pdgu.R.inc(90848);Assert.assertTrue(clusters.get(0).getPoints().contains(pt1));
        __CLR4_4_11y391y39lb90pdgu.R.inc(90849);Assert.assertTrue(clusters.get(0).getPoints().contains(pt2));

    }finally{__CLR4_4_11y391y39lb90pdgu.R.flushNeeded();}}

    @Test
    public void testCertainSpace() {__CLR4_4_11y391y39lb90pdgu.R.globalSliceStart(getClass().getName(),90850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w6tvh1y3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y391y39lb90pdgu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y391y39lb90pdgu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testCertainSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w6tvh1y3m(){try{__CLR4_4_11y391y39lb90pdgu.R.inc(90850);
        __CLR4_4_11y391y39lb90pdgu.R.inc(90851);KMeansPlusPlusClusterer.EmptyClusterStrategy[] strategies = {
            KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE,
            KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER,
            KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT
        };
        __CLR4_4_11y391y39lb90pdgu.R.inc(90852);for (KMeansPlusPlusClusterer.EmptyClusterStrategy strategy : strategies) {{
            __CLR4_4_11y391y39lb90pdgu.R.inc(90853);int numberOfVariables = 27;
            // initialise testvalues
            __CLR4_4_11y391y39lb90pdgu.R.inc(90854);int position1 = 1;
            __CLR4_4_11y391y39lb90pdgu.R.inc(90855);int position2 = position1 + numberOfVariables;
            __CLR4_4_11y391y39lb90pdgu.R.inc(90856);int position3 = position2 + numberOfVariables;
            __CLR4_4_11y391y39lb90pdgu.R.inc(90857);int position4 = position3 + numberOfVariables;
            // testvalues will be multiplied
            __CLR4_4_11y391y39lb90pdgu.R.inc(90858);int multiplier = 1000000;

            __CLR4_4_11y391y39lb90pdgu.R.inc(90859);DoublePoint[] breakingPoints = new DoublePoint[numberOfVariables];
            // define the space which will break the cluster algorithm
            __CLR4_4_11y391y39lb90pdgu.R.inc(90860);for (int i = 0; (((i < numberOfVariables)&&(__CLR4_4_11y391y39lb90pdgu.R.iget(90861)!=0|true))||(__CLR4_4_11y391y39lb90pdgu.R.iget(90862)==0&false)); i++) {{
                __CLR4_4_11y391y39lb90pdgu.R.inc(90863);int points[] = { position1, position2, position3, position4 };
                // multiply the values
                __CLR4_4_11y391y39lb90pdgu.R.inc(90864);for (int j = 0; (((j < points.length)&&(__CLR4_4_11y391y39lb90pdgu.R.iget(90865)!=0|true))||(__CLR4_4_11y391y39lb90pdgu.R.iget(90866)==0&false)); j++) {{
                    __CLR4_4_11y391y39lb90pdgu.R.inc(90867);points[j] = points[j] * multiplier;
                }
                }__CLR4_4_11y391y39lb90pdgu.R.inc(90868);DoublePoint DoublePoint = new DoublePoint(points);
                __CLR4_4_11y391y39lb90pdgu.R.inc(90869);breakingPoints[i] = DoublePoint;
                __CLR4_4_11y391y39lb90pdgu.R.inc(90870);position1 = position1 + numberOfVariables;
                __CLR4_4_11y391y39lb90pdgu.R.inc(90871);position2 = position2 + numberOfVariables;
                __CLR4_4_11y391y39lb90pdgu.R.inc(90872);position3 = position3 + numberOfVariables;
                __CLR4_4_11y391y39lb90pdgu.R.inc(90873);position4 = position4 + numberOfVariables;
            }

            }__CLR4_4_11y391y39lb90pdgu.R.inc(90874);for (int n = 2; (((n < 27)&&(__CLR4_4_11y391y39lb90pdgu.R.iget(90875)!=0|true))||(__CLR4_4_11y391y39lb90pdgu.R.iget(90876)==0&false)); ++n) {{
                __CLR4_4_11y391y39lb90pdgu.R.inc(90877);KMeansPlusPlusClusterer<DoublePoint> transformer =
                    new KMeansPlusPlusClusterer<DoublePoint>(n, 100, new EuclideanDistance(), random, strategy);

                __CLR4_4_11y391y39lb90pdgu.R.inc(90878);List<? extends Cluster<DoublePoint>> clusters =
                        transformer.cluster(Arrays.asList(breakingPoints));

                __CLR4_4_11y391y39lb90pdgu.R.inc(90879);Assert.assertEquals(n, clusters.size());
                __CLR4_4_11y391y39lb90pdgu.R.inc(90880);int sum = 0;
                __CLR4_4_11y391y39lb90pdgu.R.inc(90881);for (Cluster<DoublePoint> cluster : clusters) {{
                    __CLR4_4_11y391y39lb90pdgu.R.inc(90882);sum += cluster.getPoints().size();
                }
                }__CLR4_4_11y391y39lb90pdgu.R.inc(90883);Assert.assertEquals(numberOfVariables, sum);
            }
        }}

    }}finally{__CLR4_4_11y391y39lb90pdgu.R.flushNeeded();}}

    /**
     * A helper class for testSmallDistances(). This class is similar to DoublePoint, but
     * it defines a different distanceFrom() method that tends to return distances less than 1.
     */
    private class CloseDistance extends EuclideanDistance {
        private static final long serialVersionUID = 1L;

        @Override
        public double compute(double[] a, double[] b) {try{__CLR4_4_11y391y39lb90pdgu.R.inc(90884);
            __CLR4_4_11y391y39lb90pdgu.R.inc(90885);return super.compute(a, b) * 0.001;
        }finally{__CLR4_4_11y391y39lb90pdgu.R.flushNeeded();}}
    }

    /**
     * Test points that are very close together. See issue MATH-546.
     */
    @Test
    public void testSmallDistances() {__CLR4_4_11y391y39lb90pdgu.R.globalSliceStart(getClass().getName(),90886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfgldc1y4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y391y39lb90pdgu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y391y39lb90pdgu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testSmallDistances",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfgldc1y4m(){try{__CLR4_4_11y391y39lb90pdgu.R.inc(90886);
        // Create a bunch of CloseDoublePoints. Most are identical, but one is different by a
        // small distance.
        __CLR4_4_11y391y39lb90pdgu.R.inc(90887);int[] repeatedArray = { 0 };
        __CLR4_4_11y391y39lb90pdgu.R.inc(90888);int[] uniqueArray = { 1 };
        __CLR4_4_11y391y39lb90pdgu.R.inc(90889);DoublePoint repeatedPoint = new DoublePoint(repeatedArray);
        __CLR4_4_11y391y39lb90pdgu.R.inc(90890);DoublePoint uniquePoint = new DoublePoint(uniqueArray);

        __CLR4_4_11y391y39lb90pdgu.R.inc(90891);Collection<DoublePoint> points = new ArrayList<DoublePoint>();
        __CLR4_4_11y391y39lb90pdgu.R.inc(90892);final int NUM_REPEATED_POINTS = 10 * 1000;
        __CLR4_4_11y391y39lb90pdgu.R.inc(90893);for (int i = 0; (((i < NUM_REPEATED_POINTS)&&(__CLR4_4_11y391y39lb90pdgu.R.iget(90894)!=0|true))||(__CLR4_4_11y391y39lb90pdgu.R.iget(90895)==0&false)); ++i) {{
            __CLR4_4_11y391y39lb90pdgu.R.inc(90896);points.add(repeatedPoint);
        }
        }__CLR4_4_11y391y39lb90pdgu.R.inc(90897);points.add(uniquePoint);

        // Ask a KMeansPlusPlusClusterer to run zero iterations (i.e., to simply choose initial
        // cluster centers).
        __CLR4_4_11y391y39lb90pdgu.R.inc(90898);final long RANDOM_SEED = 0;
        __CLR4_4_11y391y39lb90pdgu.R.inc(90899);final int NUM_CLUSTERS = 2;
        __CLR4_4_11y391y39lb90pdgu.R.inc(90900);final int NUM_ITERATIONS = 0;
        __CLR4_4_11y391y39lb90pdgu.R.inc(90901);random.setSeed(RANDOM_SEED);
        
        __CLR4_4_11y391y39lb90pdgu.R.inc(90902);KMeansPlusPlusClusterer<DoublePoint> clusterer =
            new KMeansPlusPlusClusterer<DoublePoint>(NUM_CLUSTERS, NUM_ITERATIONS,
                    new CloseDistance(), random);
        __CLR4_4_11y391y39lb90pdgu.R.inc(90903);List<CentroidCluster<DoublePoint>> clusters = clusterer.cluster(points);

        // Check that one of the chosen centers is the unique point.
        __CLR4_4_11y391y39lb90pdgu.R.inc(90904);boolean uniquePointIsCenter = false;
        __CLR4_4_11y391y39lb90pdgu.R.inc(90905);for (CentroidCluster<DoublePoint> cluster : clusters) {{
            __CLR4_4_11y391y39lb90pdgu.R.inc(90906);if ((((cluster.getCenter().equals(uniquePoint))&&(__CLR4_4_11y391y39lb90pdgu.R.iget(90907)!=0|true))||(__CLR4_4_11y391y39lb90pdgu.R.iget(90908)==0&false))) {{
                __CLR4_4_11y391y39lb90pdgu.R.inc(90909);uniquePointIsCenter = true;
            }
        }}
        }__CLR4_4_11y391y39lb90pdgu.R.inc(90910);Assert.assertTrue(uniquePointIsCenter);
    }finally{__CLR4_4_11y391y39lb90pdgu.R.flushNeeded();}}
    
    /**
     * 2 variables cannot be clustered into 3 clusters. See issue MATH-436.
     */
    @Test(expected=NumberIsTooSmallException.class)
    public void testPerformClusterAnalysisToManyClusters() {__CLR4_4_11y391y39lb90pdgu.R.globalSliceStart(getClass().getName(),90911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uaj7wh1y5b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,101,114,102,111,114,109,67,108,117,115,116,101,114,65,110,97,108,121,115,105,115,84,111,77,97,110,121,67,108,117,115,116,101,114,115,58,32,91,78,117,109,98,101,114,73,115,84,111,111,83,109,97,108,108,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooSmallException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y391y39lb90pdgu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y391y39lb90pdgu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.KMeansPlusPlusClustererTest.testPerformClusterAnalysisToManyClusters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uaj7wh1y5b(){try{__CLR4_4_11y391y39lb90pdgu.R.inc(90911);
        __CLR4_4_11y391y39lb90pdgu.R.inc(90912);KMeansPlusPlusClusterer<DoublePoint> transformer = 
            new KMeansPlusPlusClusterer<DoublePoint>(3, 1, new EuclideanDistance(), random);
        
        __CLR4_4_11y391y39lb90pdgu.R.inc(90913);DoublePoint[] points = new DoublePoint[] {
            new DoublePoint(new int[] {
                1959, 325100
            }), new DoublePoint(new int[] {
                1960, 373200
            })
        };
        
        __CLR4_4_11y391y39lb90pdgu.R.inc(90914);transformer.cluster(Arrays.asList(points));

    }finally{__CLR4_4_11y391y39lb90pdgu.R.flushNeeded();}}

}
