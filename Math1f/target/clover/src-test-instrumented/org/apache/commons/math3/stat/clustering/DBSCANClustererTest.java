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

import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

public class DBSCANClustererTest {static class __CLR4_4_129pg29pglb90pek1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,105939,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCluster() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16n3p9t29pg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testCluster",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105892,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16n3p9t29pg(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105892);
        // Test data generated using: http://people.cs.nctu.edu.tw/~rsliang/dbscan/testdatagen.html
        __CLR4_4_129pg29pglb90pek1.R.inc(105893);final EuclideanDoublePoint[] points = new EuclideanDoublePoint[] {
                new EuclideanDoublePoint(new double[] { 83.08303244924173, 58.83387754182331 }),
                new EuclideanDoublePoint(new double[] { 45.05445510940626, 23.469642649637535 }),
                new EuclideanDoublePoint(new double[] { 14.96417921432294, 69.0264096390456 }),
                new EuclideanDoublePoint(new double[] { 73.53189604333602, 34.896145021310076 }),
                new EuclideanDoublePoint(new double[] { 73.28498173551634, 33.96860806993209 }),
                new EuclideanDoublePoint(new double[] { 73.45828098873608, 33.92584423092194 }),
                new EuclideanDoublePoint(new double[] { 73.9657889183145, 35.73191006924026 }),
                new EuclideanDoublePoint(new double[] { 74.0074097183533, 36.81735596177168 }),
                new EuclideanDoublePoint(new double[] { 73.41247541410848, 34.27314856695011 }),
                new EuclideanDoublePoint(new double[] { 73.9156256353017, 36.83206791547127 }),
                new EuclideanDoublePoint(new double[] { 74.81499205809087, 37.15682749846019 }),
                new EuclideanDoublePoint(new double[] { 74.03144880081527, 37.57399178552441 }),
                new EuclideanDoublePoint(new double[] { 74.51870941207744, 38.674258946906775 }),
                new EuclideanDoublePoint(new double[] { 74.50754595105536, 35.58903978415765 }),
                new EuclideanDoublePoint(new double[] { 74.51322752749547, 36.030572259100154 }),
                new EuclideanDoublePoint(new double[] { 59.27900996617973, 46.41091720294207 }),
                new EuclideanDoublePoint(new double[] { 59.73744793841615, 46.20015558367595 }),
                new EuclideanDoublePoint(new double[] { 58.81134076672606, 45.71150126331486 }),
                new EuclideanDoublePoint(new double[] { 58.52225539437495, 47.416083617601544 }),
                new EuclideanDoublePoint(new double[] { 58.218626647023484, 47.36228902172297 }),
                new EuclideanDoublePoint(new double[] { 60.27139669447206, 46.606106348801404 }),
                new EuclideanDoublePoint(new double[] { 60.894962462363765, 46.976924697402865 }),
                new EuclideanDoublePoint(new double[] { 62.29048673878424, 47.66970563563518 }),
                new EuclideanDoublePoint(new double[] { 61.03857608977705, 46.212924720020965 }),
                new EuclideanDoublePoint(new double[] { 60.16916214139201, 45.18193661351688 }),
                new EuclideanDoublePoint(new double[] { 59.90036905976012, 47.555364347063005 }),
                new EuclideanDoublePoint(new double[] { 62.33003634144552, 47.83941489877179 }),
                new EuclideanDoublePoint(new double[] { 57.86035536718555, 47.31117930193432 }),
                new EuclideanDoublePoint(new double[] { 58.13715479685925, 48.985960494028404 }),
                new EuclideanDoublePoint(new double[] { 56.131923963548616, 46.8508904252667 }),
                new EuclideanDoublePoint(new double[] { 55.976329887053, 47.46384037658572 }),
                new EuclideanDoublePoint(new double[] { 56.23245975235477, 47.940035191131756 }),
                new EuclideanDoublePoint(new double[] { 58.51687048212625, 46.622885352699086 }),
                new EuclideanDoublePoint(new double[] { 57.85411081905477, 45.95394361577928 }),
                new EuclideanDoublePoint(new double[] { 56.445776311447844, 45.162093662656844 }),
                new EuclideanDoublePoint(new double[] { 57.36691949656233, 47.50097194337286 }),
                new EuclideanDoublePoint(new double[] { 58.243626387557015, 46.114052729681134 }),
                new EuclideanDoublePoint(new double[] { 56.27224595635198, 44.799080066150054 }),
                new EuclideanDoublePoint(new double[] { 57.606924816500396, 46.94291057763621 }),
                new EuclideanDoublePoint(new double[] { 30.18714230041951, 13.877149710431695 }),
                new EuclideanDoublePoint(new double[] { 30.449448810657486, 13.490778346545994 }),
                new EuclideanDoublePoint(new double[] { 30.295018390286714, 13.264889000216499 }),
                new EuclideanDoublePoint(new double[] { 30.160201832884923, 11.89278262341395 }),
                new EuclideanDoublePoint(new double[] { 31.341509791789576, 15.282655921997502 }),
                new EuclideanDoublePoint(new double[] { 31.68601630325429, 14.756873246748 }),
                new EuclideanDoublePoint(new double[] { 29.325963742565364, 12.097849250072613 }),
                new EuclideanDoublePoint(new double[] { 29.54820742388256, 13.613295356975868 }),
                new EuclideanDoublePoint(new double[] { 28.79359608888626, 10.36352064087987 }),
                new EuclideanDoublePoint(new double[] { 31.01284597092308, 12.788479208014905 }),
                new EuclideanDoublePoint(new double[] { 27.58509216737002, 11.47570110601373 }),
                new EuclideanDoublePoint(new double[] { 28.593799561727792, 10.780998203903437 }),
                new EuclideanDoublePoint(new double[] { 31.356105766724795, 15.080316198524088 }),
                new EuclideanDoublePoint(new double[] { 31.25948503636755, 13.674329151166603 }),
                new EuclideanDoublePoint(new double[] { 32.31590076372959, 14.95261758659035 }),
                new EuclideanDoublePoint(new double[] { 30.460413702763617, 15.88402809202671 }),
                new EuclideanDoublePoint(new double[] { 32.56178203062154, 14.586076852632686 }),
                new EuclideanDoublePoint(new double[] { 32.76138648530468, 16.239837325178087 }),
                new EuclideanDoublePoint(new double[] { 30.1829453331884, 14.709592407103628 }),
                new EuclideanDoublePoint(new double[] { 29.55088173528202, 15.0651247180067 }),
                new EuclideanDoublePoint(new double[] { 29.004155302187428, 14.089665298582986 }),
                new EuclideanDoublePoint(new double[] { 29.339624439831823, 13.29096065578051 }),
                new EuclideanDoublePoint(new double[] { 30.997460327576846, 14.551914158277214 }),
                new EuclideanDoublePoint(new double[] { 30.66784126125276, 16.269703107886016 })
        };

        __CLR4_4_129pg29pglb90pek1.R.inc(105894);final DBSCANClusterer<EuclideanDoublePoint> transformer =
                new DBSCANClusterer<EuclideanDoublePoint>(2.0, 5);
        __CLR4_4_129pg29pglb90pek1.R.inc(105895);final List<Cluster<EuclideanDoublePoint>> clusters = transformer.cluster(Arrays.asList(points));

        __CLR4_4_129pg29pglb90pek1.R.inc(105896);final List<EuclideanDoublePoint> clusterOne =
                Arrays.asList(points[3], points[4], points[5], points[6], points[7], points[8], points[9], points[10],
                              points[11], points[12], points[13], points[14]);
        __CLR4_4_129pg29pglb90pek1.R.inc(105897);final List<EuclideanDoublePoint> clusterTwo =
                Arrays.asList(points[15], points[16], points[17], points[18], points[19], points[20], points[21],
                              points[22], points[23], points[24], points[25], points[26], points[27], points[28],
                              points[29], points[30], points[31], points[32], points[33], points[34], points[35],
                              points[36], points[37], points[38]);
        __CLR4_4_129pg29pglb90pek1.R.inc(105898);final List<EuclideanDoublePoint> clusterThree =
                Arrays.asList(points[39], points[40], points[41], points[42], points[43], points[44], points[45],
                              points[46], points[47], points[48], points[49], points[50], points[51], points[52],
                              points[53], points[54], points[55], points[56], points[57], points[58], points[59],
                              points[60], points[61], points[62]);

        __CLR4_4_129pg29pglb90pek1.R.inc(105899);boolean cluster1Found = false;
        __CLR4_4_129pg29pglb90pek1.R.inc(105900);boolean cluster2Found = false;
        __CLR4_4_129pg29pglb90pek1.R.inc(105901);boolean cluster3Found = false;
        __CLR4_4_129pg29pglb90pek1.R.inc(105902);Assert.assertEquals(3, clusters.size());
        __CLR4_4_129pg29pglb90pek1.R.inc(105903);for (final Cluster<EuclideanDoublePoint> cluster : clusters) {{
            __CLR4_4_129pg29pglb90pek1.R.inc(105904);if ((((cluster.getPoints().containsAll(clusterOne))&&(__CLR4_4_129pg29pglb90pek1.R.iget(105905)!=0|true))||(__CLR4_4_129pg29pglb90pek1.R.iget(105906)==0&false))) {{
                __CLR4_4_129pg29pglb90pek1.R.inc(105907);cluster1Found = true;
            }
            }__CLR4_4_129pg29pglb90pek1.R.inc(105908);if ((((cluster.getPoints().containsAll(clusterTwo))&&(__CLR4_4_129pg29pglb90pek1.R.iget(105909)!=0|true))||(__CLR4_4_129pg29pglb90pek1.R.iget(105910)==0&false))) {{
                __CLR4_4_129pg29pglb90pek1.R.inc(105911);cluster2Found = true;
            }
            }__CLR4_4_129pg29pglb90pek1.R.inc(105912);if ((((cluster.getPoints().containsAll(clusterThree))&&(__CLR4_4_129pg29pglb90pek1.R.iget(105913)!=0|true))||(__CLR4_4_129pg29pglb90pek1.R.iget(105914)==0&false))) {{
                __CLR4_4_129pg29pglb90pek1.R.inc(105915);cluster3Found = true;
            }
        }}
        }__CLR4_4_129pg29pglb90pek1.R.inc(105916);Assert.assertTrue(cluster1Found);
        __CLR4_4_129pg29pglb90pek1.R.inc(105917);Assert.assertTrue(cluster2Found);
        __CLR4_4_129pg29pglb90pek1.R.inc(105918);Assert.assertTrue(cluster3Found);
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}

    @Test
    public void testSingleLink() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16klrh729q7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testSingleLink",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105919,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16klrh729q7(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105919);
        __CLR4_4_129pg29pglb90pek1.R.inc(105920);final EuclideanIntegerPoint[] points = {
                new EuclideanIntegerPoint(new int[] {10, 10}), // A
                new EuclideanIntegerPoint(new int[] {12, 9}),
                new EuclideanIntegerPoint(new int[] {10, 8}),
                new EuclideanIntegerPoint(new int[] {8, 8}),
                new EuclideanIntegerPoint(new int[] {8, 6}),
                new EuclideanIntegerPoint(new int[] {7, 7}),
                new EuclideanIntegerPoint(new int[] {5, 6}),  // B
                new EuclideanIntegerPoint(new int[] {14, 8}), // C
                new EuclideanIntegerPoint(new int[] {7, 15}), // N - Noise, should not be present
                new EuclideanIntegerPoint(new int[] {17, 8}), // D - single-link connected to C should not be present
                
        };
        
        __CLR4_4_129pg29pglb90pek1.R.inc(105921);final DBSCANClusterer<EuclideanIntegerPoint> clusterer = new DBSCANClusterer<EuclideanIntegerPoint>(3, 3);
        __CLR4_4_129pg29pglb90pek1.R.inc(105922);List<Cluster<EuclideanIntegerPoint>> clusters = clusterer.cluster(Arrays.asList(points));
        
        __CLR4_4_129pg29pglb90pek1.R.inc(105923);Assert.assertEquals(1, clusters.size());
        
        __CLR4_4_129pg29pglb90pek1.R.inc(105924);final List<EuclideanIntegerPoint> clusterOne =
                Arrays.asList(points[0], points[1], points[2], points[3], points[4], points[5], points[6], points[7]);
        __CLR4_4_129pg29pglb90pek1.R.inc(105925);Assert.assertTrue(clusters.get(0).getPoints().containsAll(clusterOne));
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}
    
    @Test
    public void testGetEps() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14iui3929qe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testGetEps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105926,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14iui3929qe(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105926);
        __CLR4_4_129pg29pglb90pek1.R.inc(105927);final DBSCANClusterer<EuclideanDoublePoint> transformer = new DBSCANClusterer<EuclideanDoublePoint>(2.0, 5);
        __CLR4_4_129pg29pglb90pek1.R.inc(105928);Assert.assertEquals(2.0, transformer.getEps(), 0.0);
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}

    @Test
    public void testGetMinPts() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l66src29qh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testGetMinPts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l66src29qh(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105929);
        __CLR4_4_129pg29pglb90pek1.R.inc(105930);final DBSCANClusterer<EuclideanDoublePoint> transformer = new DBSCANClusterer<EuclideanDoublePoint>(2.0, 5);
        __CLR4_4_129pg29pglb90pek1.R.inc(105931);Assert.assertEquals(5, transformer.getMinPts());
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}

    @Test(expected = MathIllegalArgumentException.class)
    public void testNegativeEps() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qptzs29qk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,103,97,116,105,118,101,69,112,115,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testNegativeEps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qptzs29qk(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105932);
        __CLR4_4_129pg29pglb90pek1.R.inc(105933);new DBSCANClusterer<EuclideanDoublePoint>(-2.0, 5);
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}

    @Test(expected = MathIllegalArgumentException.class)
    public void testNegativeMinPts() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p2tc8l29qm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,103,97,116,105,118,101,77,105,110,80,116,115,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testNegativeMinPts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p2tc8l29qm(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105934);
        __CLR4_4_129pg29pglb90pek1.R.inc(105935);new DBSCANClusterer<EuclideanDoublePoint>(2.0, -5);
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}

    @Test(expected = NullArgumentException.class)
    public void testNullDataset() {__CLR4_4_129pg29pglb90pek1.R.globalSliceStart(getClass().getName(),105936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfxuna29qo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,117,108,108,68,97,116,97,115,101,116,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129pg29pglb90pek1.R.rethrow($CLV_t2$);}finally{__CLR4_4_129pg29pglb90pek1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.clustering.DBSCANClustererTest.testNullDataset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfxuna29qo(){try{__CLR4_4_129pg29pglb90pek1.R.inc(105936);
        __CLR4_4_129pg29pglb90pek1.R.inc(105937);DBSCANClusterer<EuclideanDoublePoint> clusterer = new DBSCANClusterer<EuclideanDoublePoint>(2.0, 5);
        __CLR4_4_129pg29pglb90pek1.R.inc(105938);clusterer.cluster(null);
    }finally{__CLR4_4_129pg29pglb90pek1.R.flushNeeded();}}

}
