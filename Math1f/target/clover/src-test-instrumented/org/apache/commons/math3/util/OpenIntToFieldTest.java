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
import java.util.Map.Entry;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.fraction.FractionField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


@SuppressWarnings("boxing")
public class OpenIntToFieldTest {static class __CLR4_4_12gws2gwslb90pf68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,115417,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<Integer, Fraction> javaMap = new HashMap<Integer, Fraction>();
    private FractionField field = FractionField.getInstance();

    @Before
    public void setUp() throws FractionConversionException {try{__CLR4_4_12gws2gwslb90pf68.R.inc(115228);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115229);javaMap.put(50, new Fraction(100.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115230);javaMap.put(75, new Fraction(75.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115231);javaMap.put(25, new Fraction(500.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115232);javaMap.put(Integer.MAX_VALUE, new Fraction(Integer.MAX_VALUE));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115233);javaMap.put(0, new Fraction(-1.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115234);javaMap.put(1, new Fraction(0.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115235);javaMap.put(33, new Fraction(-0.1));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115236);javaMap.put(23234234, new Fraction(-242343.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115237);javaMap.put(23321, new Fraction (Integer.MIN_VALUE));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115238);javaMap.put(-4444, new Fraction(332.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115239);javaMap.put(-1, new Fraction(-2323.0));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115240);javaMap.put(Integer.MIN_VALUE, new Fraction(44.0));

        /* Add a few more to cause the table to rehash */
        __CLR4_4_12gws2gwslb90pf68.R.inc(115241);javaMap.putAll(generate());

    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    private Map<Integer, Fraction> generate() {try{__CLR4_4_12gws2gwslb90pf68.R.inc(115242);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115243);Map<Integer, Fraction> map = new HashMap<Integer, Fraction>();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115244);Random r = new Random();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115245);double dd=0;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115246);for (int i = 0; (((i < 2000)&&(__CLR4_4_12gws2gwslb90pf68.R.iget(115247)!=0|true))||(__CLR4_4_12gws2gwslb90pf68.R.iget(115248)==0&false)); ++i)
            {__CLR4_4_12gws2gwslb90pf68.R.inc(115249);dd = r.nextDouble();
            }__CLR4_4_12gws2gwslb90pf68.R.inc(115250);try {
                __CLR4_4_12gws2gwslb90pf68.R.inc(115251);map.put(r.nextInt(), new Fraction(dd));
            } catch (FractionConversionException e) {
                __CLR4_4_12gws2gwslb90pf68.R.inc(115252);throw new IllegalStateException("Invalid :"+dd, e);
            }
        __CLR4_4_12gws2gwslb90pf68.R.inc(115253);return map;
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    private OpenIntToFieldHashMap<Fraction> createFromJavaMap(Field<Fraction> field) {try{__CLR4_4_12gws2gwslb90pf68.R.inc(115254);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115255);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115256);for (Map.Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115257);map.put(mapEntry.getKey(), mapEntry.getValue());
        }
        }__CLR4_4_12gws2gwslb90pf68.R.inc(115258);return map;
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testPutAndGetWith0ExpectedSize() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aooku2gxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutAndGetWith0ExpectedSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aooku2gxn(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115259);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115260);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field,0);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115261);assertPutAndGet(map);
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testPutAndGetWithExpectedSize() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hd7cjm2gxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutAndGetWithExpectedSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hd7cjm2gxq(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115262);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115263);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field,500);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115264);assertPutAndGet(map);
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testPutAndGet() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jxnel2gxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutAndGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jxnel2gxt(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115265);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115266);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115267);assertPutAndGet(map);
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    private void assertPutAndGet(OpenIntToFieldHashMap<Fraction> map) {try{__CLR4_4_12gws2gwslb90pf68.R.inc(115268);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115269);assertPutAndGet(map, 0, new HashSet<Integer>());
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    private void assertPutAndGet(OpenIntToFieldHashMap<Fraction> map, int mapSize,
            Set<Integer> keysInMap) {try{__CLR4_4_12gws2gwslb90pf68.R.inc(115270);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115271);Assert.assertEquals(mapSize, map.size());
        __CLR4_4_12gws2gwslb90pf68.R.inc(115272);for (Map.Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115273);map.put(mapEntry.getKey(), mapEntry.getValue());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115274);if ((((!keysInMap.contains(mapEntry.getKey()))&&(__CLR4_4_12gws2gwslb90pf68.R.iget(115275)!=0|true))||(__CLR4_4_12gws2gwslb90pf68.R.iget(115276)==0&false)))
                {__CLR4_4_12gws2gwslb90pf68.R.inc(115277);++mapSize;
            }__CLR4_4_12gws2gwslb90pf68.R.inc(115278);Assert.assertEquals(mapSize, map.size());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115279);Assert.assertEquals(mapEntry.getValue(), map.get(mapEntry.getKey()));
        }
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testPutAbsentOnExisting() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1809zvd2gy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutAbsentOnExisting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1809zvd2gy8(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115280);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115281);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115282);int size = javaMap.size();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115283);for (Map.Entry<Integer, Fraction> mapEntry : generateAbsent().entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115284);map.put(mapEntry.getKey(), mapEntry.getValue());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115285);Assert.assertEquals(++size, map.size());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115286);Assert.assertEquals(mapEntry.getValue(), map.get(mapEntry.getKey()));
        }
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testPutOnExisting() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7ndny2gyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutOnExisting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7ndny2gyf(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115287);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115288);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115289);for (Map.Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115290);map.put(mapEntry.getKey(), mapEntry.getValue());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115291);Assert.assertEquals(javaMap.size(), map.size());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115292);Assert.assertEquals(mapEntry.getValue(), map.get(mapEntry.getKey()));
        }
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testGetAbsent() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nuw50k2gyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testGetAbsent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nuw50k2gyl(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115293);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115294);Map<Integer, Fraction> generated = generateAbsent();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115295);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);

        __CLR4_4_12gws2gwslb90pf68.R.inc(115296);for (Map.Entry<Integer, Fraction> mapEntry : generated.entrySet())
            {__CLR4_4_12gws2gwslb90pf68.R.inc(115297);Assert.assertTrue(field.getZero().equals(map.get(mapEntry.getKey())));
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testGetFromEmpty() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13a5dly2gyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testGetFromEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13a5dly2gyq(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115298);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115299);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115300);Assert.assertTrue(field.getZero().equals(map.get(5)));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115301);Assert.assertTrue(field.getZero().equals(map.get(0)));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115302);Assert.assertTrue(field.getZero().equals(map.get(50)));
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testRemove() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn12gyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn12gyv(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115303);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115304);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115305);int mapSize = javaMap.size();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115306);Assert.assertEquals(mapSize, map.size());
        __CLR4_4_12gws2gwslb90pf68.R.inc(115307);for (Map.Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115308);map.remove(mapEntry.getKey());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115309);Assert.assertEquals(--mapSize, map.size());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115310);Assert.assertTrue(field.getZero().equals(map.get(mapEntry.getKey())));
        }

        /* Ensure that put and get still work correctly after removals */
        }__CLR4_4_12gws2gwslb90pf68.R.inc(115311);assertPutAndGet(map);
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    /* This time only remove some entries */
    @Test
    public void testRemove2() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14169dp2gz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testRemove2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14169dp2gz4(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115312);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115313);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115314);int mapSize = javaMap.size();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115315);int count = 0;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115316);Set<Integer> keysInMap = new HashSet<Integer>(javaMap.keySet());
        __CLR4_4_12gws2gwslb90pf68.R.inc(115317);for (Map.Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115318);keysInMap.remove(mapEntry.getKey());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115319);map.remove(mapEntry.getKey());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115320);Assert.assertEquals(--mapSize, map.size());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115321);Assert.assertTrue(field.getZero().equals(map.get(mapEntry.getKey())));
            __CLR4_4_12gws2gwslb90pf68.R.inc(115322);if ((((count++ > 5)&&(__CLR4_4_12gws2gwslb90pf68.R.iget(115323)!=0|true))||(__CLR4_4_12gws2gwslb90pf68.R.iget(115324)==0&false)))
                {__CLR4_4_12gws2gwslb90pf68.R.inc(115325);break;
        }}

        /* Ensure that put and get still work correctly after removals */
        }__CLR4_4_12gws2gwslb90pf68.R.inc(115326);assertPutAndGet(map, mapSize, keysInMap);
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testRemoveFromEmpty() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qto2i42gzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testRemoveFromEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qto2i42gzj(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115327);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115328);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115329);Assert.assertTrue(field.getZero().equals(map.remove(50)));
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testRemoveAbsent() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14181rq2gzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testRemoveAbsent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14181rq2gzm(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115330);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115331);Map<Integer, Fraction> generated = generateAbsent();

        __CLR4_4_12gws2gwslb90pf68.R.inc(115332);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115333);int mapSize = map.size();

        __CLR4_4_12gws2gwslb90pf68.R.inc(115334);for (Map.Entry<Integer, Fraction> mapEntry : generated.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115335);map.remove(mapEntry.getKey());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115336);Assert.assertEquals(mapSize, map.size());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115337);Assert.assertTrue(field.getZero().equals(map.get(mapEntry.getKey())));
        }
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    /**
     * Returns a map with at least 100 elements where each element is absent from javaMap.
     */
    private Map<Integer, Fraction> generateAbsent() {try{__CLR4_4_12gws2gwslb90pf68.R.inc(115338);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115339);Map<Integer, Fraction> generated = new HashMap<Integer, Fraction>();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115340);do {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115341);generated.putAll(generate());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115342);for (Integer key : javaMap.keySet())
                {__CLR4_4_12gws2gwslb90pf68.R.inc(115343);generated.remove(key);
        }} }while ((((generated.size() < 100)&&(__CLR4_4_12gws2gwslb90pf68.R.iget(115344)!=0|true))||(__CLR4_4_12gws2gwslb90pf68.R.iget(115345)==0&false)));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115346);return generated;
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testCopy() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ukax6a2h03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ukax6a2h03(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115347);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115348);OpenIntToFieldHashMap<Fraction> copy =
            new OpenIntToFieldHashMap<Fraction>(createFromJavaMap(field));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115349);Assert.assertEquals(javaMap.size(), copy.size());

        __CLR4_4_12gws2gwslb90pf68.R.inc(115350);for (Map.Entry<Integer, Fraction> mapEntry : javaMap.entrySet())
            {__CLR4_4_12gws2gwslb90pf68.R.inc(115351);Assert.assertEquals(mapEntry.getValue(), copy.get(mapEntry.getKey()));
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testContainsKey() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejstyj2h08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testContainsKey",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejstyj2h08(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115352);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115353);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115354);for (Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115355);Assert.assertTrue(map.containsKey(mapEntry.getKey()));
        }
        }__CLR4_4_12gws2gwslb90pf68.R.inc(115356);for (Map.Entry<Integer, Fraction> mapEntry : generateAbsent().entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115357);Assert.assertFalse(map.containsKey(mapEntry.getKey()));
        }
        }__CLR4_4_12gws2gwslb90pf68.R.inc(115358);for (Entry<Integer, Fraction> mapEntry : javaMap.entrySet()) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115359);int key = mapEntry.getKey();
            __CLR4_4_12gws2gwslb90pf68.R.inc(115360);Assert.assertTrue(map.containsKey(key));
            __CLR4_4_12gws2gwslb90pf68.R.inc(115361);map.remove(key);
            __CLR4_4_12gws2gwslb90pf68.R.inc(115362);Assert.assertFalse(map.containsKey(key));
        }
    }}finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicn2h0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicn2h0j(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115363);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115364);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115365);OpenIntToFieldHashMap<Fraction>.Iterator iterator = map.iterator();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115366);for (int i = 0; (((i < map.size())&&(__CLR4_4_12gws2gwslb90pf68.R.iget(115367)!=0|true))||(__CLR4_4_12gws2gwslb90pf68.R.iget(115368)==0&false)); ++i) {{
            __CLR4_4_12gws2gwslb90pf68.R.inc(115369);Assert.assertTrue(iterator.hasNext());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115370);iterator.advance();
            __CLR4_4_12gws2gwslb90pf68.R.inc(115371);int key = iterator.key();
            __CLR4_4_12gws2gwslb90pf68.R.inc(115372);Assert.assertTrue(map.containsKey(key));
            __CLR4_4_12gws2gwslb90pf68.R.inc(115373);Assert.assertEquals(javaMap.get(key), map.get(key));
            __CLR4_4_12gws2gwslb90pf68.R.inc(115374);Assert.assertEquals(javaMap.get(key), iterator.value());
            __CLR4_4_12gws2gwslb90pf68.R.inc(115375);Assert.assertTrue(javaMap.containsKey(key));
        }
        }__CLR4_4_12gws2gwslb90pf68.R.inc(115376);Assert.assertFalse(iterator.hasNext());
        __CLR4_4_12gws2gwslb90pf68.R.inc(115377);try {
            __CLR4_4_12gws2gwslb90pf68.R.inc(115378);iterator.advance();
            __CLR4_4_12gws2gwslb90pf68.R.inc(115379);Assert.fail("an exception should have been thrown");
        } catch (NoSuchElementException nsee) {
            // expected
        }
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    @Test
    public void testConcurrentModification() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yw09bo2h10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testConcurrentModification",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yw09bo2h10(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115380);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115381);OpenIntToFieldHashMap<Fraction> map = createFromJavaMap(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115382);OpenIntToFieldHashMap<Fraction>.Iterator iterator = map.iterator();
        __CLR4_4_12gws2gwslb90pf68.R.inc(115383);map.put(3, new Fraction(3));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115384);try {
            __CLR4_4_12gws2gwslb90pf68.R.inc(115385);iterator.advance();
            __CLR4_4_12gws2gwslb90pf68.R.inc(115386);Assert.fail("an exception should have been thrown");
        } catch (ConcurrentModificationException cme) {
            // expected
        }
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    /**
     * Regression test for a bug in findInsertionIndex where the hashing in the second probing
     * loop was inconsistent with the first causing duplicate keys after the right sequence
     * of puts and removes.
     */
    @Test
    public void testPutKeysWithCollisions() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18xgfgf2h17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutKeysWithCollisions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18xgfgf2h17(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115387);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115388);OpenIntToFieldHashMap<Fraction> map = new OpenIntToFieldHashMap<Fraction>(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115389);int key1 = -1996012590;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115390);Fraction value1 = new Fraction(1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115391);map.put(key1, value1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115392);int key2 = 835099822;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115393);map.put(key2, value1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115394);int key3 = 1008859686;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115395);map.put(key3, value1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115396);Assert.assertEquals(value1, map.get(key3));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115397);Assert.assertEquals(3, map.size());

        __CLR4_4_12gws2gwslb90pf68.R.inc(115398);map.remove(key2);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115399);Fraction value2 = new Fraction(2);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115400);map.put(key3, value2);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115401);Assert.assertEquals(value2, map.get(key3));
        __CLR4_4_12gws2gwslb90pf68.R.inc(115402);Assert.assertEquals(2, map.size());
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}

    /**
     * Similar to testPutKeysWithCollisions() but exercises the codepaths in a slightly
     * different manner.
     */
    @Test
    public void testPutKeysWithCollision2() {__CLR4_4_12gws2gwslb90pf68.R.globalSliceStart(getClass().getName(),115403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1arurz22h1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12gws2gwslb90pf68.R.rethrow($CLV_t2$);}finally{__CLR4_4_12gws2gwslb90pf68.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.OpenIntToFieldTest.testPutKeysWithCollision2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1arurz22h1n(){try{__CLR4_4_12gws2gwslb90pf68.R.inc(115403);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115404);OpenIntToFieldHashMap<Fraction>map = new OpenIntToFieldHashMap<Fraction>(field);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115405);int key1 = 837989881;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115406);Fraction value1 = new Fraction(1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115407);map.put(key1, value1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115408);int key2 = 476463321;
        __CLR4_4_12gws2gwslb90pf68.R.inc(115409);map.put(key2, value1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115410);Assert.assertEquals(2, map.size());
        __CLR4_4_12gws2gwslb90pf68.R.inc(115411);Assert.assertEquals(value1, map.get(key2));

        __CLR4_4_12gws2gwslb90pf68.R.inc(115412);map.remove(key1);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115413);Fraction value2 = new Fraction(2);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115414);map.put(key2, value2);
        __CLR4_4_12gws2gwslb90pf68.R.inc(115415);Assert.assertEquals(1, map.size());
        __CLR4_4_12gws2gwslb90pf68.R.inc(115416);Assert.assertEquals(value2, map.get(key2));
    }finally{__CLR4_4_12gws2gwslb90pf68.R.flushNeeded();}}


}
