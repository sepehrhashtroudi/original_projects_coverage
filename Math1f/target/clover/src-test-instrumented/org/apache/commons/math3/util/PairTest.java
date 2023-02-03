/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link Pair}.
 */
public class PairTest {static class __CLR4_4_12h212h21lb90pf6b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,115456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAccessor() {__CLR4_4_12h212h21lb90pf6b.R.globalSliceStart(getClass().getName(),115417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18eknq82h21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h212h21lb90pf6b.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h212h21lb90pf6b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PairTest.testAccessor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18eknq82h21(){try{__CLR4_4_12h212h21lb90pf6b.R.inc(115417);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115418);final Pair<Integer, Double> p
            = new Pair<Integer, Double>(new Integer(1), new Double(2));
        __CLR4_4_12h212h21lb90pf6b.R.inc(115419);Assert.assertEquals(new Integer(1), p.getKey());
        __CLR4_4_12h212h21lb90pf6b.R.inc(115420);Assert.assertEquals(2, p.getValue().doubleValue(), Math.ulp(1d));
    }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

    @Test
    public void testAccessor2() {__CLR4_4_12h212h21lb90pf6b.R.globalSliceStart(getClass().getName(),115421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7sgao2h25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h212h21lb90pf6b.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h212h21lb90pf6b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PairTest.testAccessor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7sgao2h25(){try{__CLR4_4_12h212h21lb90pf6b.R.inc(115421);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115422);final Pair<Integer, Double> p
            = new Pair<Integer, Double>(new Integer(1), new Double(2));

        // Check that both APIs refer to the same data.

        __CLR4_4_12h212h21lb90pf6b.R.inc(115423);Assert.assertTrue(p.getFirst() == p.getKey());
        __CLR4_4_12h212h21lb90pf6b.R.inc(115424);Assert.assertTrue(p.getSecond() == p.getValue());
    }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_12h212h21lb90pf6b.R.globalSliceStart(getClass().getName(),115425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6082h29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h212h21lb90pf6b.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h212h21lb90pf6b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PairTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6082h29(){try{__CLR4_4_12h212h21lb90pf6b.R.inc(115425);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115426);Pair<Integer, Double> p1 = new Pair<Integer, Double>(null, null);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115427);Assert.assertFalse(p1.equals(null));

        __CLR4_4_12h212h21lb90pf6b.R.inc(115428);Pair<Integer, Double> p2 = new Pair<Integer, Double>(null, null);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115429);Assert.assertTrue(p1.equals(p2));

        __CLR4_4_12h212h21lb90pf6b.R.inc(115430);p1 = new Pair<Integer, Double>(new Integer(1), new Double(2));
        __CLR4_4_12h212h21lb90pf6b.R.inc(115431);Assert.assertFalse(p1.equals(p2));

        __CLR4_4_12h212h21lb90pf6b.R.inc(115432);p2 = new Pair<Integer, Double>(new Integer(1), new Double(2));
        __CLR4_4_12h212h21lb90pf6b.R.inc(115433);Assert.assertTrue(p1.equals(p2));

        __CLR4_4_12h212h21lb90pf6b.R.inc(115434);Pair<Integer, Float> p3 = new Pair<Integer, Float>(new Integer(1), new Float(2));
        __CLR4_4_12h212h21lb90pf6b.R.inc(115435);Assert.assertFalse(p1.equals(p3));
    }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_4_12h212h21lb90pf6b.R.globalSliceStart(getClass().getName(),115436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zkhv82h2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12h212h21lb90pf6b.R.rethrow($CLV_t2$);}finally{__CLR4_4_12h212h21lb90pf6b.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.PairTest.testHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zkhv82h2k(){try{__CLR4_4_12h212h21lb90pf6b.R.inc(115436);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115437);final MyInteger m1 = new MyInteger(1);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115438);final MyInteger m2 = new MyInteger(1);

        __CLR4_4_12h212h21lb90pf6b.R.inc(115439);final Pair<MyInteger, MyInteger> p1 = new Pair<MyInteger, MyInteger>(m1, m1);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115440);final Pair<MyInteger, MyInteger> p2 = new Pair<MyInteger, MyInteger>(m2, m2);
        // Same contents, same hash code.
        __CLR4_4_12h212h21lb90pf6b.R.inc(115441);Assert.assertTrue(p1.hashCode() == p2.hashCode());

        // Different contents, different hash codes.
        __CLR4_4_12h212h21lb90pf6b.R.inc(115442);m2.set(2);
        __CLR4_4_12h212h21lb90pf6b.R.inc(115443);Assert.assertFalse(p1.hashCode() == p2.hashCode());
    }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

    /**
     * A mutable integer.
     */
    private static class MyInteger {
        private int i;

        public MyInteger(int i) {try{__CLR4_4_12h212h21lb90pf6b.R.inc(115444);
            __CLR4_4_12h212h21lb90pf6b.R.inc(115445);this.i = i;
        }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

        public void set(int i) {try{__CLR4_4_12h212h21lb90pf6b.R.inc(115446);
            __CLR4_4_12h212h21lb90pf6b.R.inc(115447);this.i = i;
        }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

        @Override
        public boolean equals(Object o) {try{__CLR4_4_12h212h21lb90pf6b.R.inc(115448);
            __CLR4_4_12h212h21lb90pf6b.R.inc(115449);if ((((!(o instanceof MyInteger))&&(__CLR4_4_12h212h21lb90pf6b.R.iget(115450)!=0|true))||(__CLR4_4_12h212h21lb90pf6b.R.iget(115451)==0&false))) {{
                __CLR4_4_12h212h21lb90pf6b.R.inc(115452);return false;
            } }else {{
                __CLR4_4_12h212h21lb90pf6b.R.inc(115453);return i == ((MyInteger) o).i;
            }
        }}finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_12h212h21lb90pf6b.R.inc(115454);
            __CLR4_4_12h212h21lb90pf6b.R.inc(115455);return i;
        }finally{__CLR4_4_12h212h21lb90pf6b.R.flushNeeded();}}
    }
}
