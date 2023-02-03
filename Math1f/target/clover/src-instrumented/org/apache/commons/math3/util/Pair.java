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

/**
 * Generic pair.
 * <br/>
 * Although the instances of this class are immutable, it is impossible
 * to ensure that the references passed to the constructor will not be
 * modified by the caller.
 *
 * @param <K> Key type.
 * @param <V> Value type.
 *
 * @since 3.0
 * @version $Id$
 */
public class Pair<K, V> {public static class __CLR4_4_11ax71ax7lb90pbau{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,60848,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Key. */
    private final K key;
    /** Value. */
    private final V value;

    /**
     * Create an entry representing a mapping from the specified key to the
     * specified value.
     *
     * @param k Key (first element of the pair).
     * @param v Value (second element of the pair).
     */
    public Pair(K k, V v) {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60811);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60812);key = k;
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60813);value = v;
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Create an entry representing the same mapping as the specified entry.
     *
     * @param entry Entry to copy.
     */
    public Pair(Pair<? extends K, ? extends V> entry) {
        this(entry.getKey(), entry.getValue());__CLR4_4_11ax71ax7lb90pbau.R.inc(60815);try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60814);
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Get the key.
     *
     * @return the key (first element of the pair).
     */
    public K getKey() {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60816);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60817);return key;
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Get the value.
     *
     * @return the value (second element of the pair).
     */
    public V getValue() {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60818);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60819);return value;
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Get the first element of the pair.
     *
     * @return the first element of the pair.
     * @since 3.1
     */
    public K getFirst() {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60820);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60821);return key;
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Get the second element of the pair.
     *
     * @return the second element of the pair.
     * @since 3.1
     */
    public V getSecond() {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60822);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60823);return value;
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Compare the specified object with this entry for equality.
     *
     * @param o Object.
     * @return {@code true} if the given object is also a map entry and
     * the two entries represent the same mapping.
     */
    @Override
    public boolean equals(Object o) {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60824);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60825);if ((((this == o)&&(__CLR4_4_11ax71ax7lb90pbau.R.iget(60826)!=0|true))||(__CLR4_4_11ax71ax7lb90pbau.R.iget(60827)==0&false))) {{
            __CLR4_4_11ax71ax7lb90pbau.R.inc(60828);return true;
        }
        }__CLR4_4_11ax71ax7lb90pbau.R.inc(60829);if ((((!(o instanceof Pair))&&(__CLR4_4_11ax71ax7lb90pbau.R.iget(60830)!=0|true))||(__CLR4_4_11ax71ax7lb90pbau.R.iget(60831)==0&false))) {{
            __CLR4_4_11ax71ax7lb90pbau.R.inc(60832);return false;
        } }else {{
            __CLR4_4_11ax71ax7lb90pbau.R.inc(60833);Pair<?, ?> oP = (Pair<?, ?>) o;
            __CLR4_4_11ax71ax7lb90pbau.R.inc(60834);return ((((key == null )&&(__CLR4_4_11ax71ax7lb90pbau.R.iget(60835)!=0|true))||(__CLR4_4_11ax71ax7lb90pbau.R.iget(60836)==0&false))?
                    oP.key == null :
                    key.equals(oP.key)) &&
                ((((value == null )&&(__CLR4_4_11ax71ax7lb90pbau.R.iget(60837)!=0|true))||(__CLR4_4_11ax71ax7lb90pbau.R.iget(60838)==0&false))?
                 oP.value == null :
                 value.equals(oP.value));
        }
    }}finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}

    /**
     * Compute a hash code.
     *
     * @return the hash code value.
     */
    @Override
    public int hashCode() {try{__CLR4_4_11ax71ax7lb90pbau.R.inc(60839);
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60840);int result = (((key == null )&&(__CLR4_4_11ax71ax7lb90pbau.R.iget(60841)!=0|true))||(__CLR4_4_11ax71ax7lb90pbau.R.iget(60842)==0&false))? 0 : key.hashCode();

        __CLR4_4_11ax71ax7lb90pbau.R.inc(60843);final int h = (((value == null )&&(__CLR4_4_11ax71ax7lb90pbau.R.iget(60844)!=0|true))||(__CLR4_4_11ax71ax7lb90pbau.R.iget(60845)==0&false))? 0 : value.hashCode();
        __CLR4_4_11ax71ax7lb90pbau.R.inc(60846);result = 37 * result + h ^ (h >>> 16);

        __CLR4_4_11ax71ax7lb90pbau.R.inc(60847);return result;
    }finally{__CLR4_4_11ax71ax7lb90pbau.R.flushNeeded();}}
}
