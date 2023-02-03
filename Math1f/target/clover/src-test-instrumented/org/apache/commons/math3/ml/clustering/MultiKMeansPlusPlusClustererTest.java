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


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MultiKMeansPlusPlusClustererTest {static class __CLR4_4_11y5f1y5flb90pdh0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,90948,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void dimension2() {__CLR4_4_11y5f1y5flb90pdh0.R.globalSliceStart(getClass().getName(),90915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sb25p1y5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11y5f1y5flb90pdh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11y5f1y5flb90pdh0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClustererTest.dimension2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),90915,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sb25p1y5f(){try{__CLR4_4_11y5f1y5flb90pdh0.R.inc(90915);
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90916);MultiKMeansPlusPlusClusterer<DoublePoint> transformer =
            new MultiKMeansPlusPlusClusterer<DoublePoint>(
                    new KMeansPlusPlusClusterer<DoublePoint>(3, 10), 5);
        
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90917);DoublePoint[] points = new DoublePoint[] {

                // first expected cluster
                new DoublePoint(new int[] { -15,  3 }),
                new DoublePoint(new int[] { -15,  4 }),
                new DoublePoint(new int[] { -15,  5 }),
                new DoublePoint(new int[] { -14,  3 }),
                new DoublePoint(new int[] { -14,  5 }),
                new DoublePoint(new int[] { -13,  3 }),
                new DoublePoint(new int[] { -13,  4 }),
                new DoublePoint(new int[] { -13,  5 }),

                // second expected cluster
                new DoublePoint(new int[] { -1,  0 }),
                new DoublePoint(new int[] { -1, -1 }),
                new DoublePoint(new int[] {  0, -1 }),
                new DoublePoint(new int[] {  1, -1 }),
                new DoublePoint(new int[] {  1, -2 }),

                // third expected cluster
                new DoublePoint(new int[] { 13,  3 }),
                new DoublePoint(new int[] { 13,  4 }),
                new DoublePoint(new int[] { 14,  4 }),
                new DoublePoint(new int[] { 14,  7 }),
                new DoublePoint(new int[] { 16,  5 }),
                new DoublePoint(new int[] { 16,  6 }),
                new DoublePoint(new int[] { 17,  4 }),
                new DoublePoint(new int[] { 17,  7 })

        };
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90918);List<CentroidCluster<DoublePoint>> clusters = transformer.cluster(Arrays.asList(points));

        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90919);Assert.assertEquals(3, clusters.size());
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90920);boolean cluster1Found = false;
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90921);boolean cluster2Found = false;
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90922);boolean cluster3Found = false;
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90923);double epsilon = 1e-6;
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90924);for (CentroidCluster<DoublePoint> cluster : clusters) {{
            __CLR4_4_11y5f1y5flb90pdh0.R.inc(90925);Clusterable center = cluster.getCenter();
            __CLR4_4_11y5f1y5flb90pdh0.R.inc(90926);double[] point = center.getPoint();
            __CLR4_4_11y5f1y5flb90pdh0.R.inc(90927);if ((((point[0] < 0)&&(__CLR4_4_11y5f1y5flb90pdh0.R.iget(90928)!=0|true))||(__CLR4_4_11y5f1y5flb90pdh0.R.iget(90929)==0&false))) {{
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90930);cluster1Found = true;
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90931);Assert.assertEquals(8, cluster.getPoints().size());
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90932);Assert.assertEquals(-14, point[0], epsilon);
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90933);Assert.assertEquals( 4, point[1], epsilon);
            } }else {__CLR4_4_11y5f1y5flb90pdh0.R.inc(90934);if ((((point[1] < 0)&&(__CLR4_4_11y5f1y5flb90pdh0.R.iget(90935)!=0|true))||(__CLR4_4_11y5f1y5flb90pdh0.R.iget(90936)==0&false))) {{
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90937);cluster2Found = true;
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90938);Assert.assertEquals(5, cluster.getPoints().size());
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90939);Assert.assertEquals( 0, point[0], epsilon);
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90940);Assert.assertEquals(-1, point[1], epsilon);
            } }else {{
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90941);cluster3Found = true;
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90942);Assert.assertEquals(8, cluster.getPoints().size());
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90943);Assert.assertEquals(15, point[0], epsilon);
                __CLR4_4_11y5f1y5flb90pdh0.R.inc(90944);Assert.assertEquals(5, point[1], epsilon);
            }
        }}}
        }__CLR4_4_11y5f1y5flb90pdh0.R.inc(90945);Assert.assertTrue(cluster1Found);
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90946);Assert.assertTrue(cluster2Found);
        __CLR4_4_11y5f1y5flb90pdh0.R.inc(90947);Assert.assertTrue(cluster3Found);

    }finally{__CLR4_4_11y5f1y5flb90pdh0.R.flushNeeded();}}

}
