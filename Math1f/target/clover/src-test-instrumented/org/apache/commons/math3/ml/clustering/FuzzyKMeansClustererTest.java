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

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.ml.distance.CanberraDistance;
import org.apache.commons.math3.ml.distance.DistanceMeasure;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;

/**
 * Test cases for FuzzyKMeansClusterer.
 *
 * @version $Id$
 * @since 3.3
 */
public class FuzzyKMeansClustererTest {static class __CLR4_4_11y1y1y1ylb90pdgo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,90837,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCluster() {__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceStart(getClass().getName(),90790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n3p9t1y1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y1y1y1ylb90pdgo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest.testCluster",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n3p9t1y1y(){try{__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90790);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90791);final List<DoublePoint> points = new ArrayList<DoublePoint>();

        // create 10 data points: [1], ... [10]
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90792);for (int i = 1; (((i <= 10)&&(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90793)!=0|true))||(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90794)==0&false)); i++) {{
            __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90795);final DoublePoint p = new DoublePoint(new double[] { i } );
            __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90796);points.add(p);
        }

        }__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90797);final FuzzyKMeansClusterer<DoublePoint> transformer =
                new FuzzyKMeansClusterer<DoublePoint>(3, 2.0);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90798);final List<CentroidCluster<DoublePoint>> clusters = transformer.cluster(points);

        // we expect 3 clusters:
        //   [1], [2], [3]
        //   [4], [5], [6], [7]
        //   [8], [9], [10]
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90799);final List<DoublePoint> clusterOne = Arrays.asList(points.get(0), points.get(1), points.get(2));
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90800);final List<DoublePoint> clusterTwo = Arrays.asList(points.get(3), points.get(4), points.get(5), points.get(6));
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90801);final List<DoublePoint> clusterThree = Arrays.asList(points.get(7), points.get(8), points.get(9));

        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90802);boolean cluster1Found = false;
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90803);boolean cluster2Found = false;
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90804);boolean cluster3Found = false;
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90805);Assert.assertEquals(3, clusters.size());
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90806);for (final Cluster<DoublePoint> cluster : clusters) {{
            __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90807);if ((((cluster.getPoints().containsAll(clusterOne))&&(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90808)!=0|true))||(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90809)==0&false))) {{
                __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90810);cluster1Found = true;
            }
            }__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90811);if ((((cluster.getPoints().containsAll(clusterTwo))&&(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90812)!=0|true))||(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90813)==0&false))) {{
                __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90814);cluster2Found = true;
            }
            }__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90815);if ((((cluster.getPoints().containsAll(clusterThree))&&(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90816)!=0|true))||(__CLR4_4_11y1y1y1ylb90pdgo.R.iget(90817)==0&false))) {{
                __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90818);cluster3Found = true;
            }
        }}
        }__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90819);Assert.assertTrue(cluster1Found);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90820);Assert.assertTrue(cluster2Found);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90821);Assert.assertTrue(cluster3Found);
    }finally{__CLR4_4_11y1y1y1ylb90pdgo.R.flushNeeded();}}

    @Test(expected = MathIllegalArgumentException.class)
    public void testTooSmallFuzzynessFactor() {__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceStart(getClass().getName(),90822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16z38fm1y2u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,111,83,109,97,108,108,70,117,122,122,121,110,101,115,115,70,97,99,116,111,114,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y1y1y1ylb90pdgo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest.testTooSmallFuzzynessFactor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16z38fm1y2u(){try{__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90822);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90823);new FuzzyKMeansClusterer<DoublePoint>(3, 1.0);
    }finally{__CLR4_4_11y1y1y1ylb90pdgo.R.flushNeeded();}}

    @Test(expected = NullArgumentException.class)
    public void testNullDataset() {__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceStart(getClass().getName(),90824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfxuna1y2w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,68,97,116,97,115,101,116,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y1y1y1ylb90pdgo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest.testNullDataset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfxuna1y2w(){try{__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90824);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90825);final FuzzyKMeansClusterer<DoublePoint> clusterer = new FuzzyKMeansClusterer<DoublePoint>(3, 2.0);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90826);clusterer.cluster(null);
    }finally{__CLR4_4_11y1y1y1ylb90pdgo.R.flushNeeded();}}

    @Test
    public void testGetters() {__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceStart(getClass().getName(),90827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiqsv71y2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y1y1y1ylb90pdgo.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y1y1y1ylb90pdgo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest.testGetters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90827,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiqsv71y2z(){try{__CLR4_4_11y1y1y1ylb90pdgo.R.inc(90827);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90828);final DistanceMeasure measure = new CanberraDistance();
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90829);final RandomGenerator random = new JDKRandomGenerator();
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90830);final FuzzyKMeansClusterer<DoublePoint> clusterer =
                new FuzzyKMeansClusterer<DoublePoint>(3, 2.0, 100, measure, 1e-6, random);

        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90831);Assert.assertEquals(3, clusterer.getK());
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90832);Assert.assertEquals(2.0, clusterer.getFuzziness(), 1e-6);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90833);Assert.assertEquals(100, clusterer.getMaxIterations());
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90834);Assert.assertEquals(1e-6, clusterer.getEpsilon(), 1e-12);
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90835);Assert.assertThat(clusterer.getDistanceMeasure(), CoreMatchers.is(measure));
        __CLR4_4_11y1y1y1ylb90pdgo.R.inc(90836);Assert.assertThat(clusterer.getRandomGenerator(), CoreMatchers.is(random));
    }finally{__CLR4_4_11y1y1y1ylb90pdgo.R.flushNeeded();}}

}
