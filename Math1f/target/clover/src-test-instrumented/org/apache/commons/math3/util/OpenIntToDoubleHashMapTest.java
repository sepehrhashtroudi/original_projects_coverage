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
package org.apache.commons.math3.util;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Test cases for the {@link OpenIntToDoubleHashMap}.
 */
@SuppressWarnings("boxing")
public class OpenIntToDoubleHashMapTest {static class __CLR4_4_12grn2grnlb90pf5z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,115228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<Integer, Double> javaMap = new HashMap<Integer, Double>();

    @Before
    public void setUp() throws Exception {try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115043);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115044);javaMap.put(50, 100.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115045);javaMap.put(75, 75.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115046);javaMap.put(25, 500.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115047);javaMap.put(Integer.MAX_VALUE, Double.MAX_VALUE);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115048);javaMap.put(0, -1.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115049);javaMap.put(1, 0.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115050);javaMap.put(33, -0.1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115051);javaMap.put(23234234, -242343.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115052);javaMap.put(23321, Double.MIN_VALUE);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115053);javaMap.put(-4444, 332.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115054);javaMap.put(-1, -2323.0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115055);javaMap.put(Integer.MIN_VALUE, 44.0);

        /* Add a few more to cause the table to rehash */
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115056);javaMap.putAll(generate());

    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    private Map<Integer, Double> generate() {try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115057);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115058);Map<Integer, Double> map = new HashMap<Integer, Double>();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115059);Random r = new Random();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115060);for (int i = 0; (((i < 2000)&&(__CLR4_4_12grn2grnlb90pf5z.R.iget(115061)!=0|true))||(__CLR4_4_12grn2grnlb90pf5z.R.iget(115062)==0&false)); ++i)
            {__CLR4_4_12grn2grnlb90pf5z.R.inc(115063);map.put(r.nextInt(), r.nextDouble());
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115064);return map;
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    private OpenIntToDoubleHashMap createFromJavaMap() {try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115065);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115066);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115067);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115068);map.put(mapEntry.getKey(), mapEntry.getValue());
        }
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115069);return map;
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testPutAndGetWith0ExpectedSize() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aooku2gse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutAndGetWith0ExpectedSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aooku2gse(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115070);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115071);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(0);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115072);assertPutAndGet(map);
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testPutAndGetWithExpectedSize() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd7cjm2gsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutAndGetWithExpectedSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd7cjm2gsh(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115073);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115074);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(500);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115075);assertPutAndGet(map);
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testPutAndGet() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jxnel2gsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutAndGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jxnel2gsk(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115076);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115077);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115078);assertPutAndGet(map);
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    private void assertPutAndGet(OpenIntToDoubleHashMap map) {try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115079);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115080);assertPutAndGet(map, 0, new HashSet<Integer>());
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    private void assertPutAndGet(OpenIntToDoubleHashMap map, int mapSize,
            Set<Integer> keysInMap) {try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115081);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115082);Assert.assertEquals(mapSize, map.size());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115083);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115084);map.put(mapEntry.getKey(), mapEntry.getValue());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115085);if ((((!keysInMap.contains(mapEntry.getKey()))&&(__CLR4_4_12grn2grnlb90pf5z.R.iget(115086)!=0|true))||(__CLR4_4_12grn2grnlb90pf5z.R.iget(115087)==0&false)))
                {__CLR4_4_12grn2grnlb90pf5z.R.inc(115088);++mapSize;
            }__CLR4_4_12grn2grnlb90pf5z.R.inc(115089);Assert.assertEquals(mapSize, map.size());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115090);Assert.assertTrue(Precision.equals(mapEntry.getValue(), map.get(mapEntry.getKey()), 1));
        }
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testPutAbsentOnExisting() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1809zvd2gsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutAbsentOnExisting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1809zvd2gsz(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115091);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115092);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115093);int size = javaMap.size();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115094);for (Map.Entry<Integer, Double> mapEntry : generateAbsent().entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115095);map.put(mapEntry.getKey(), mapEntry.getValue());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115096);Assert.assertEquals(++size, map.size());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115097);Assert.assertTrue(Precision.equals(mapEntry.getValue(), map.get(mapEntry.getKey()), 1));
        }
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testPutOnExisting() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7ndny2gt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutOnExisting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7ndny2gt6(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115098);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115099);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115100);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115101);map.put(mapEntry.getKey(), mapEntry.getValue());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115102);Assert.assertEquals(javaMap.size(), map.size());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115103);Assert.assertTrue(Precision.equals(mapEntry.getValue(), map.get(mapEntry.getKey()), 1));
        }
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testGetAbsent() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuw50k2gtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testGetAbsent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuw50k2gtc(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115104);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115105);Map<Integer, Double> generated = generateAbsent();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115106);OpenIntToDoubleHashMap map = createFromJavaMap();

        __CLR4_4_12grn2grnlb90pf5z.R.inc(115107);for (Map.Entry<Integer, Double> mapEntry : generated.entrySet())
            {__CLR4_4_12grn2grnlb90pf5z.R.inc(115108);Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey())));
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testGetFromEmpty() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13a5dly2gth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testGetFromEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13a5dly2gth(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115109);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115110);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115111);Assert.assertTrue(Double.isNaN(map.get(5)));
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115112);Assert.assertTrue(Double.isNaN(map.get(0)));
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115113);Assert.assertTrue(Double.isNaN(map.get(50)));
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testRemove() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn12gtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn12gtm(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115114);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115115);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115116);int mapSize = javaMap.size();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115117);Assert.assertEquals(mapSize, map.size());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115118);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115119);map.remove(mapEntry.getKey());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115120);Assert.assertEquals(--mapSize, map.size());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115121);Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey())));
        }

        /* Ensure that put and get still work correctly after removals */
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115122);assertPutAndGet(map);
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    /* This time only remove some entries */
    @Test
    public void testRemove2() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14169dp2gtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testRemove2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14169dp2gtv(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115123);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115124);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115125);int mapSize = javaMap.size();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115126);int count = 0;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115127);Set<Integer> keysInMap = new HashSet<Integer>(javaMap.keySet());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115128);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115129);keysInMap.remove(mapEntry.getKey());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115130);map.remove(mapEntry.getKey());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115131);Assert.assertEquals(--mapSize, map.size());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115132);Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey())));
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115133);if ((((count++ > 5)&&(__CLR4_4_12grn2grnlb90pf5z.R.iget(115134)!=0|true))||(__CLR4_4_12grn2grnlb90pf5z.R.iget(115135)==0&false)))
                {__CLR4_4_12grn2grnlb90pf5z.R.inc(115136);break;
        }}

        /* Ensure that put and get still work correctly after removals */
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115137);assertPutAndGet(map, mapSize, keysInMap);
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testRemoveFromEmpty() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qto2i42gua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testRemoveFromEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qto2i42gua(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115138);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115139);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115140);Assert.assertTrue(Double.isNaN(map.remove(50)));
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testRemoveAbsent() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14181rq2gud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testRemoveAbsent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14181rq2gud(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115141);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115142);Map<Integer, Double> generated = generateAbsent();

        __CLR4_4_12grn2grnlb90pf5z.R.inc(115143);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115144);int mapSize = map.size();

        __CLR4_4_12grn2grnlb90pf5z.R.inc(115145);for (Map.Entry<Integer, Double> mapEntry : generated.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115146);map.remove(mapEntry.getKey());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115147);Assert.assertEquals(mapSize, map.size());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115148);Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey())));
        }
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    /**
     * Returns a map with at least 100 elements where each element is absent from javaMap.
     */
    private Map<Integer, Double> generateAbsent() {try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115149);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115150);Map<Integer, Double> generated = new HashMap<Integer, Double>();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115151);do {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115152);generated.putAll(generate());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115153);for (Integer key : javaMap.keySet())
                {__CLR4_4_12grn2grnlb90pf5z.R.inc(115154);generated.remove(key);
        }} }while ((((generated.size() < 100)&&(__CLR4_4_12grn2grnlb90pf5z.R.iget(115155)!=0|true))||(__CLR4_4_12grn2grnlb90pf5z.R.iget(115156)==0&false)));
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115157);return generated;
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a2guu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115158,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a2guu(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115158);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115159);OpenIntToDoubleHashMap copy =
            new OpenIntToDoubleHashMap(createFromJavaMap());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115160);Assert.assertEquals(javaMap.size(), copy.size());

        __CLR4_4_12grn2grnlb90pf5z.R.inc(115161);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet())
            {__CLR4_4_12grn2grnlb90pf5z.R.inc(115162);Assert.assertTrue(Precision.equals(mapEntry.getValue(), copy.get(mapEntry.getKey()), 1));
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testContainsKey() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejstyj2guz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testContainsKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejstyj2guz(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115163);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115164);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115165);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115166);Assert.assertTrue(map.containsKey(mapEntry.getKey()));
        }
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115167);for (Map.Entry<Integer, Double> mapEntry : generateAbsent().entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115168);Assert.assertFalse(map.containsKey(mapEntry.getKey()));
        }
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115169);for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115170);int key = mapEntry.getKey();
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115171);Assert.assertTrue(map.containsKey(key));
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115172);map.remove(key);
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115173);Assert.assertFalse(map.containsKey(key));
        }
    }}finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicn2gva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicn2gva(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115174);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115175);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115176);OpenIntToDoubleHashMap.Iterator iterator = map.iterator();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115177);for (int i = 0; (((i < map.size())&&(__CLR4_4_12grn2grnlb90pf5z.R.iget(115178)!=0|true))||(__CLR4_4_12grn2grnlb90pf5z.R.iget(115179)==0&false)); ++i) {{
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115180);Assert.assertTrue(iterator.hasNext());
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115181);iterator.advance();
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115182);int key = iterator.key();
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115183);Assert.assertTrue(map.containsKey(key));
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115184);Assert.assertEquals(javaMap.get(key), map.get(key), 0);
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115185);Assert.assertEquals(javaMap.get(key), iterator.value(), 0);
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115186);Assert.assertTrue(javaMap.containsKey(key));
        }
        }__CLR4_4_12grn2grnlb90pf5z.R.inc(115187);Assert.assertFalse(iterator.hasNext());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115188);try {
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115189);iterator.advance();
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115190);Assert.fail("an exception should have been thrown");
        } catch (NoSuchElementException nsee) {
            // expected
        }
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    @Test
    public void testConcurrentModification() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw09bo2gvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testConcurrentModification",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115191,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw09bo2gvr(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115191);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115192);OpenIntToDoubleHashMap map = createFromJavaMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115193);OpenIntToDoubleHashMap.Iterator iterator = map.iterator();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115194);map.put(3, 3);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115195);try {
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115196);iterator.advance();
            __CLR4_4_12grn2grnlb90pf5z.R.inc(115197);Assert.fail("an exception should have been thrown");
        } catch (ConcurrentModificationException cme) {
            // expected
        }
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    /**
     * Regression test for a bug in findInsertionIndex where the hashing in the second probing
     * loop was inconsistent with the first causing duplicate keys after the right sequence
     * of puts and removes.
     */
    @Test
    public void testPutKeysWithCollisions() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xgfgf2gvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutKeysWithCollisions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xgfgf2gvy(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115198);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115199);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115200);int key1 = -1996012590;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115201);double value1 = 1.0;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115202);map.put(key1, value1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115203);int key2 = 835099822;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115204);map.put(key2, value1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115205);int key3 = 1008859686;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115206);map.put(key3, value1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115207);Assert.assertTrue(Precision.equals(value1, map.get(key3), 1));
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115208);Assert.assertEquals(3, map.size());

        __CLR4_4_12grn2grnlb90pf5z.R.inc(115209);map.remove(key2);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115210);double value2 = 2.0;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115211);map.put(key3, value2);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115212);Assert.assertTrue(Precision.equals(value2, map.get(key3), 1));
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115213);Assert.assertEquals(2, map.size());
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

    /**
     * Similar to testPutKeysWithCollisions() but exercises the codepaths in a slightly
     * different manner.
     */
    @Test
    public void testPutKeysWithCollision2() {__CLR4_4_12grn2grnlb90pf5z.R.globalSliceStart(getClass().getName(),115214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arurz22gwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12grn2grnlb90pf5z.R.rethrow($CLV_t2$);}finally{__CLR4_4_12grn2grnlb90pf5z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToDoubleHashMapTest.testPutKeysWithCollision2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arurz22gwe(){try{__CLR4_4_12grn2grnlb90pf5z.R.inc(115214);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115215);OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap();
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115216);int key1 = 837989881;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115217);double value1 = 1.0;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115218);map.put(key1, value1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115219);int key2 = 476463321;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115220);map.put(key2, value1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115221);Assert.assertEquals(2, map.size());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115222);Assert.assertTrue(Precision.equals(value1, map.get(key2), 1));

        __CLR4_4_12grn2grnlb90pf5z.R.inc(115223);map.remove(key1);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115224);double value2 = 2.0;
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115225);map.put(key2, value2);
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115226);Assert.assertEquals(1, map.size());
        __CLR4_4_12grn2grnlb90pf5z.R.inc(115227);Assert.assertTrue(Precision.equals(value2, map.get(key2), 1));
    }finally{__CLR4_4_12grn2grnlb90pf5z.R.flushNeeded();}}

}
