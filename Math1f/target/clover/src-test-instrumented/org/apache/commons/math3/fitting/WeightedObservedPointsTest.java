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
package org.apache.commons.math3.fitting;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.math3.util.Precision;

/**
 * Tests {@link WeightedObservedPoints}.
 *
 * @version $Id$
 */
public class WeightedObservedPointsTest {static class __CLR4_4_11lbo1lbolb90pcij{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,74345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testAdd1() {__CLR4_4_11lbo1lbolb90pcij.R.globalSliceStart(getClass().getName(),74292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvhg891lbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lbo1lbolb90pcij.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lbo1lbolb90pcij.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.WeightedObservedPointsTest.testAdd1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvhg891lbo(){try{__CLR4_4_11lbo1lbolb90pcij.R.inc(74292);
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74293);final WeightedObservedPoints store = new WeightedObservedPoints();

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74294);final double x = 1.2;
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74295);final double y = 34.56;
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74296);final double w = 0.789;

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74297);store.add(w, x, y);

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74298);Assert.assertTrue(lastElementIsSame(store, new WeightedObservedPoint(w, x, y)));
    }finally{__CLR4_4_11lbo1lbolb90pcij.R.flushNeeded();}}

    @Test
    public void testAdd2() {__CLR4_4_11lbo1lbolb90pcij.R.globalSliceStart(getClass().getName(),74299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4hf0q1lbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lbo1lbolb90pcij.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lbo1lbolb90pcij.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.WeightedObservedPointsTest.testAdd2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4hf0q1lbv(){try{__CLR4_4_11lbo1lbolb90pcij.R.inc(74299);
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74300);final WeightedObservedPoints store = new WeightedObservedPoints();

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74301);final double x = 1.2;
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74302);final double y = 34.56;
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74303);final double w = 0.789;

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74304);store.add(new WeightedObservedPoint(w, x, y));

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74305);Assert.assertTrue(lastElementIsSame(store, new WeightedObservedPoint(w, x, y)));
    }finally{__CLR4_4_11lbo1lbolb90pcij.R.flushNeeded();}}

    @Test
    public void testAdd3() {__CLR4_4_11lbo1lbolb90pcij.R.globalSliceStart(getClass().getName(),74306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnmo5x1lc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lbo1lbolb90pcij.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lbo1lbolb90pcij.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.WeightedObservedPointsTest.testAdd3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnmo5x1lc2(){try{__CLR4_4_11lbo1lbolb90pcij.R.inc(74306);
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74307);final WeightedObservedPoints store = new WeightedObservedPoints();

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74308);final double x = 1.2;
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74309);final double y = 34.56;

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74310);store.add(x, y);

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74311);Assert.assertTrue(lastElementIsSame(store, new WeightedObservedPoint(1, x, y)));
    }finally{__CLR4_4_11lbo1lbolb90pcij.R.flushNeeded();}}

    @Test
    public void testClear() {__CLR4_4_11lbo1lbolb90pcij.R.globalSliceStart(getClass().getName(),74312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jlyl6q1lc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lbo1lbolb90pcij.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lbo1lbolb90pcij.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.WeightedObservedPointsTest.testClear",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jlyl6q1lc8(){try{__CLR4_4_11lbo1lbolb90pcij.R.inc(74312);
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74313);final WeightedObservedPoints store = new WeightedObservedPoints();

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74314);store.add(new WeightedObservedPoint(1, 2, 3));
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74315);store.add(new WeightedObservedPoint(2, -1, -2));
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74316);Assert.assertTrue(store.toList().size() == 2);

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74317);store.clear();
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74318);Assert.assertTrue(store.toList().size() == 0);
    }finally{__CLR4_4_11lbo1lbolb90pcij.R.flushNeeded();}}

    // Ensure that an instance returned by "toList()" is independent from
    // the original container.
    @Test
    public void testToListCopy() {__CLR4_4_11lbo1lbolb90pcij.R.globalSliceStart(getClass().getName(),74319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qq8d6h1lcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11lbo1lbolb90pcij.R.rethrow($CLV_t2$);}finally{__CLR4_4_11lbo1lbolb90pcij.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.fitting.WeightedObservedPointsTest.testToListCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qq8d6h1lcf(){try{__CLR4_4_11lbo1lbolb90pcij.R.inc(74319);
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74320);final WeightedObservedPoints store = new WeightedObservedPoints();

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74321);store.add(new WeightedObservedPoint(1, 2, 3));
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74322);store.add(new WeightedObservedPoint(2, -3, -4));

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74323);final List<WeightedObservedPoint> list = store.toList();
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74324);Assert.assertTrue(list.size() == 2);

        // Adding an element to "list" has no impact on "store".
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74325);list.add(new WeightedObservedPoint(1.2, 3.4, 5.6));
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74326);Assert.assertFalse(list.size() == store.toList().size());

        // Clearing "store" has no impact on "list".
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74327);store.clear();
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74328);Assert.assertFalse(list.size() == 0);
    }finally{__CLR4_4_11lbo1lbolb90pcij.R.flushNeeded();}}

    /**
     * Checks that the contents of the last element is equal to the
     * contents of {@code p}.
     *
     * @param store Container.
     * @param point Observation.
     * @return {@code true} if both elements have the same contents.
     */
    private boolean lastElementIsSame(WeightedObservedPoints store,
                                      WeightedObservedPoint point) {try{__CLR4_4_11lbo1lbolb90pcij.R.inc(74329);
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74330);final List<WeightedObservedPoint> list = store.toList();
        __CLR4_4_11lbo1lbolb90pcij.R.inc(74331);final WeightedObservedPoint lastPoint = list.get(list.size() - 1);

        __CLR4_4_11lbo1lbolb90pcij.R.inc(74332);if ((((!Precision.equals(lastPoint.getX(), point.getX()))&&(__CLR4_4_11lbo1lbolb90pcij.R.iget(74333)!=0|true))||(__CLR4_4_11lbo1lbolb90pcij.R.iget(74334)==0&false))) {{
            __CLR4_4_11lbo1lbolb90pcij.R.inc(74335);return false;
        }
        }__CLR4_4_11lbo1lbolb90pcij.R.inc(74336);if ((((!Precision.equals(lastPoint.getY(), point.getY()))&&(__CLR4_4_11lbo1lbolb90pcij.R.iget(74337)!=0|true))||(__CLR4_4_11lbo1lbolb90pcij.R.iget(74338)==0&false))) {{
            __CLR4_4_11lbo1lbolb90pcij.R.inc(74339);return false;
        }
        }__CLR4_4_11lbo1lbolb90pcij.R.inc(74340);if ((((!Precision.equals(lastPoint.getWeight(), point.getWeight()))&&(__CLR4_4_11lbo1lbolb90pcij.R.iget(74341)!=0|true))||(__CLR4_4_11lbo1lbolb90pcij.R.iget(74342)==0&false))) {{
            __CLR4_4_11lbo1lbolb90pcij.R.inc(74343);return false;
        }

        }__CLR4_4_11lbo1lbolb90pcij.R.inc(74344);return true;
    }finally{__CLR4_4_11lbo1lbolb90pcij.R.flushNeeded();}}
}
