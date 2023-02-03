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
package org.apache.commons.math3.stat;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.util.MathUtils;

/**
 * Maintains a frequency distribution.
 * <p>
 * Accepts int, long, char or Comparable values.  New values added must be
 * comparable to those that have been added, otherwise the add method will
 * throw an IllegalArgumentException.</p>
 * <p>
 * Integer values (int, long, Integer, Long) are not distinguished by type --
 * i.e. <code>addValue(Long.valueOf(2)), addValue(2), addValue(2l)</code> all have
 * the same effect (similarly for arguments to <code>getCount,</code> etc.).</p>
 * <p>
 * char values are converted by <code>addValue</code> to Character instances.
 * As such, these values are not comparable to integral values, so attempts
 * to combine integral types with chars in a frequency distribution will fail.
 * </p>
 * <p>
 * Float is not coerced to Double.
 * Since they are not Comparable with each other the user must do any necessary coercion.
 * Float.NaN and Double.NaN are not treated specially; they may occur in input and will
 * occur in output if appropriate.
 * </b>
 * <p>
 * The values are ordered using the default (natural order), unless a
 * <code>Comparator</code> is supplied in the constructor.</p>
 *
 * @version $Id$
 */
public class Frequency implements Serializable {public static class __CLR4_4_1124e124elb90paix{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,49617,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -3845586908418844111L;

    /** underlying collection */
    private final TreeMap<Comparable<?>, Long> freqTable;

    /**
     * Default constructor.
     */
    public Frequency() {try{__CLR4_4_1124e124elb90paix.R.inc(49406);
        __CLR4_4_1124e124elb90paix.R.inc(49407);freqTable = new TreeMap<Comparable<?>, Long>();
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Constructor allowing values Comparator to be specified.
     *
     * @param comparator Comparator used to order values
     */
    @SuppressWarnings("unchecked") // TODO is the cast OK?
    public Frequency(Comparator<?> comparator) {try{__CLR4_4_1124e124elb90paix.R.inc(49408);
        __CLR4_4_1124e124elb90paix.R.inc(49409);freqTable = new TreeMap<Comparable<?>, Long>((Comparator<? super Comparable<?>>) comparator);
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Return a string representation of this frequency
     * distribution.
     *
     * @return a string representation.
     */
    @Override
    public String toString() {try{__CLR4_4_1124e124elb90paix.R.inc(49410);
        __CLR4_4_1124e124elb90paix.R.inc(49411);NumberFormat nf = NumberFormat.getPercentInstance();
        __CLR4_4_1124e124elb90paix.R.inc(49412);StringBuilder outBuffer = new StringBuilder();
        __CLR4_4_1124e124elb90paix.R.inc(49413);outBuffer.append("Value \t Freq. \t Pct. \t Cum Pct. \n");
        __CLR4_4_1124e124elb90paix.R.inc(49414);Iterator<Comparable<?>> iter = freqTable.keySet().iterator();
        __CLR4_4_1124e124elb90paix.R.inc(49415);while ((((iter.hasNext())&&(__CLR4_4_1124e124elb90paix.R.iget(49416)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49417)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49418);Comparable<?> value = iter.next();
            __CLR4_4_1124e124elb90paix.R.inc(49419);outBuffer.append(value);
            __CLR4_4_1124e124elb90paix.R.inc(49420);outBuffer.append('\t');
            __CLR4_4_1124e124elb90paix.R.inc(49421);outBuffer.append(getCount(value));
            __CLR4_4_1124e124elb90paix.R.inc(49422);outBuffer.append('\t');
            __CLR4_4_1124e124elb90paix.R.inc(49423);outBuffer.append(nf.format(getPct(value)));
            __CLR4_4_1124e124elb90paix.R.inc(49424);outBuffer.append('\t');
            __CLR4_4_1124e124elb90paix.R.inc(49425);outBuffer.append(nf.format(getCumPct(value)));
            __CLR4_4_1124e124elb90paix.R.inc(49426);outBuffer.append('\n');
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49427);return outBuffer.toString();
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Adds 1 to the frequency count for v.
     * <p>
     * If other objects have already been added to this Frequency, v must
     * be comparable to those that have already been added.
     * </p>
     *
     * @param v the value to add.
     * @throws MathIllegalArgumentException if <code>v</code> is not comparable with previous entries
     */
    public void addValue(Comparable<?> v) throws MathIllegalArgumentException {try{__CLR4_4_1124e124elb90paix.R.inc(49428);
        __CLR4_4_1124e124elb90paix.R.inc(49429);incrementValue(v, 1);
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Increments the frequency count for v.
     * <p>
     * If other objects have already been added to this Frequency, v must
     * be comparable to those that have already been added.
     * </p>
     *
     * @param v the value to add.
     * @param increment the amount by which the value should be incremented
     * @throws IllegalArgumentException if <code>v</code> is not comparable with previous entries
     * @since 3.1
     */
    public void incrementValue(Comparable<?> v, long increment){try{__CLR4_4_1124e124elb90paix.R.inc(49430);
        __CLR4_4_1124e124elb90paix.R.inc(49431);Comparable<?> obj = v;
        __CLR4_4_1124e124elb90paix.R.inc(49432);if ((((v instanceof Integer)&&(__CLR4_4_1124e124elb90paix.R.iget(49433)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49434)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49435);obj = Long.valueOf(((Integer) v).longValue());
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49436);try {
            __CLR4_4_1124e124elb90paix.R.inc(49437);Long count = freqTable.get(obj);
            __CLR4_4_1124e124elb90paix.R.inc(49438);if ((((count == null)&&(__CLR4_4_1124e124elb90paix.R.iget(49439)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49440)==0&false))) {{
                __CLR4_4_1124e124elb90paix.R.inc(49441);freqTable.put(obj, Long.valueOf(increment));
            } }else {{
                __CLR4_4_1124e124elb90paix.R.inc(49442);freqTable.put(obj, Long.valueOf(count.longValue() + increment));
            }
        }} catch (ClassCastException ex) {
            //TreeMap will throw ClassCastException if v is not comparable
            __CLR4_4_1124e124elb90paix.R.inc(49443);throw new MathIllegalArgumentException(
                  LocalizedFormats.INSTANCES_NOT_COMPARABLE_TO_EXISTING_VALUES,
                  v.getClass().getName());
        }
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Adds 1 to the frequency count for v.
     *
     * @param v the value to add.
     * @throws MathIllegalArgumentException if the table contains entries not
     * comparable to Integer
     */
    public void addValue(int v) throws MathIllegalArgumentException {try{__CLR4_4_1124e124elb90paix.R.inc(49444);
        __CLR4_4_1124e124elb90paix.R.inc(49445);addValue(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Adds 1 to the frequency count for v.
     *
     * @param v the value to add.
     * @throws MathIllegalArgumentException if the table contains entries not
     * comparable to Long
     */
    public void addValue(long v) throws MathIllegalArgumentException {try{__CLR4_4_1124e124elb90paix.R.inc(49446);
        __CLR4_4_1124e124elb90paix.R.inc(49447);addValue(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Adds 1 to the frequency count for v.
     *
     * @param v the value to add.
     * @throws MathIllegalArgumentException if the table contains entries not
     * comparable to Char
     */
    public void addValue(char v) throws MathIllegalArgumentException {try{__CLR4_4_1124e124elb90paix.R.inc(49448);
        __CLR4_4_1124e124elb90paix.R.inc(49449);addValue(Character.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /** Clears the frequency table */
    public void clear() {try{__CLR4_4_1124e124elb90paix.R.inc(49450);
        __CLR4_4_1124e124elb90paix.R.inc(49451);freqTable.clear();
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns an Iterator over the set of values that have been added.
     * <p>
     * If added values are integral (i.e., integers, longs, Integers, or Longs),
     * they are converted to Longs when they are added, so the objects returned
     * by the Iterator will in this case be Longs.</p>
     *
     * @return values Iterator
     */
    public Iterator<Comparable<?>> valuesIterator() {try{__CLR4_4_1124e124elb90paix.R.inc(49452);
        __CLR4_4_1124e124elb90paix.R.inc(49453);return freqTable.keySet().iterator();
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Return an Iterator over the set of keys and values that have been added.
     * Using the entry set to iterate is more efficient in the case where you
     * need to access respective counts as well as values, since it doesn't
     * require a "get" for every key...the value is provided in the Map.Entry.
     * <p>
     * If added values are integral (i.e., integers, longs, Integers, or Longs),
     * they are converted to Longs when they are added, so the values of the
     * map entries returned by the Iterator will in this case be Longs.</p>
     *
     * @return entry set Iterator
     * @since 3.1
     */
    public Iterator<Map.Entry<Comparable<?>, Long>> entrySetIterator() {try{__CLR4_4_1124e124elb90paix.R.inc(49454);
        __CLR4_4_1124e124elb90paix.R.inc(49455);return freqTable.entrySet().iterator();
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * Returns the sum of all frequencies.
     *
     * @return the total frequency count.
     */
    public long getSumFreq() {try{__CLR4_4_1124e124elb90paix.R.inc(49456);
        __CLR4_4_1124e124elb90paix.R.inc(49457);long result = 0;
        __CLR4_4_1124e124elb90paix.R.inc(49458);Iterator<Long> iterator = freqTable.values().iterator();
        __CLR4_4_1124e124elb90paix.R.inc(49459);while ((((iterator.hasNext())&&(__CLR4_4_1124e124elb90paix.R.iget(49460)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49461)==0&false)))  {{
            __CLR4_4_1124e124elb90paix.R.inc(49462);result += iterator.next().longValue();
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49463);return result;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the number of values equal to v.
     * Returns 0 if the value is not comparable.
     *
     * @param v the value to lookup.
     * @return the frequency of v.
     */
    public long getCount(Comparable<?> v) {try{__CLR4_4_1124e124elb90paix.R.inc(49464);
        __CLR4_4_1124e124elb90paix.R.inc(49465);if ((((v instanceof Integer)&&(__CLR4_4_1124e124elb90paix.R.iget(49466)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49467)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49468);return getCount(((Integer) v).longValue());
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49469);long result = 0;
        __CLR4_4_1124e124elb90paix.R.inc(49470);try {
            __CLR4_4_1124e124elb90paix.R.inc(49471);Long count =  freqTable.get(v);
            __CLR4_4_1124e124elb90paix.R.inc(49472);if ((((count != null)&&(__CLR4_4_1124e124elb90paix.R.iget(49473)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49474)==0&false))) {{
                __CLR4_4_1124e124elb90paix.R.inc(49475);result = count.longValue();
            }
        }} catch (ClassCastException ex) { // NOPMD
            // ignore and return 0 -- ClassCastException will be thrown if value is not comparable
        }
        __CLR4_4_1124e124elb90paix.R.inc(49476);return result;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the number of values equal to v.
     *
     * @param v the value to lookup.
     * @return the frequency of v.
     */
    public long getCount(int v) {try{__CLR4_4_1124e124elb90paix.R.inc(49477);
        __CLR4_4_1124e124elb90paix.R.inc(49478);return getCount(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the number of values equal to v.
     *
     * @param v the value to lookup.
     * @return the frequency of v.
     */
    public long getCount(long v) {try{__CLR4_4_1124e124elb90paix.R.inc(49479);
        __CLR4_4_1124e124elb90paix.R.inc(49480);return getCount(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the number of values equal to v.
     *
     * @param v the value to lookup.
     * @return the frequency of v.
     */
    public long getCount(char v) {try{__CLR4_4_1124e124elb90paix.R.inc(49481);
        __CLR4_4_1124e124elb90paix.R.inc(49482);return getCount(Character.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the number of values in the frequency table.
     *
     * @return the number of unique values that have been added to the frequency table.
     * @see #valuesIterator()
     */
    public int getUniqueCount(){try{__CLR4_4_1124e124elb90paix.R.inc(49483);
        __CLR4_4_1124e124elb90paix.R.inc(49484);return freqTable.keySet().size();
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the percentage of values that are equal to v
     * (as a proportion between 0 and 1).
     * <p>
     * Returns <code>Double.NaN</code> if no values have been added.
     * Returns 0 if at least one value has been added, but v is not comparable
     * to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public double getPct(Comparable<?> v) {try{__CLR4_4_1124e124elb90paix.R.inc(49485);
        __CLR4_4_1124e124elb90paix.R.inc(49486);final long sumFreq = getSumFreq();
        __CLR4_4_1124e124elb90paix.R.inc(49487);if ((((sumFreq == 0)&&(__CLR4_4_1124e124elb90paix.R.iget(49488)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49489)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49490);return Double.NaN;
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49491);return (double) getCount(v) / (double) sumFreq;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the percentage of values that are equal to v
     * (as a proportion between 0 and 1).
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public double getPct(int v) {try{__CLR4_4_1124e124elb90paix.R.inc(49492);
        __CLR4_4_1124e124elb90paix.R.inc(49493);return getPct(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the percentage of values that are equal to v
     * (as a proportion between 0 and 1).
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public double getPct(long v) {try{__CLR4_4_1124e124elb90paix.R.inc(49494);
        __CLR4_4_1124e124elb90paix.R.inc(49495);return getPct(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the percentage of values that are equal to v
     * (as a proportion between 0 and 1).
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public double getPct(char v) {try{__CLR4_4_1124e124elb90paix.R.inc(49496);
        __CLR4_4_1124e124elb90paix.R.inc(49497);return getPct(Character.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    //-----------------------------------------------------------------------------------------

    /**
     * Returns the cumulative frequency of values less than or equal to v.
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup.
     * @return the proportion of values equal to v
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public long getCumFreq(Comparable<?> v) {try{__CLR4_4_1124e124elb90paix.R.inc(49498);
        __CLR4_4_1124e124elb90paix.R.inc(49499);if ((((getSumFreq() == 0)&&(__CLR4_4_1124e124elb90paix.R.iget(49500)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49501)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49502);return 0;
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49503);if ((((v instanceof Integer)&&(__CLR4_4_1124e124elb90paix.R.iget(49504)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49505)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49506);return getCumFreq(((Integer) v).longValue());
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49507);Comparator<Comparable<?>> c = (Comparator<Comparable<?>>) freqTable.comparator();
        __CLR4_4_1124e124elb90paix.R.inc(49508);if ((((c == null)&&(__CLR4_4_1124e124elb90paix.R.iget(49509)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49510)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49511);c = new NaturalComparator();
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49512);long result = 0;

        __CLR4_4_1124e124elb90paix.R.inc(49513);try {
            __CLR4_4_1124e124elb90paix.R.inc(49514);Long value = freqTable.get(v);
            __CLR4_4_1124e124elb90paix.R.inc(49515);if ((((value != null)&&(__CLR4_4_1124e124elb90paix.R.iget(49516)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49517)==0&false))) {{
                __CLR4_4_1124e124elb90paix.R.inc(49518);result = value.longValue();
            }
        }} catch (ClassCastException ex) {
            __CLR4_4_1124e124elb90paix.R.inc(49519);return result;   // v is not comparable
        }

        __CLR4_4_1124e124elb90paix.R.inc(49520);if ((((c.compare(v, freqTable.firstKey()) < 0)&&(__CLR4_4_1124e124elb90paix.R.iget(49521)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49522)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49523);return 0;  // v is comparable, but less than first value
        }

        }__CLR4_4_1124e124elb90paix.R.inc(49524);if ((((c.compare(v, freqTable.lastKey()) >= 0)&&(__CLR4_4_1124e124elb90paix.R.iget(49525)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49526)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49527);return getSumFreq();    // v is comparable, but greater than the last value
        }

        }__CLR4_4_1124e124elb90paix.R.inc(49528);Iterator<Comparable<?>> values = valuesIterator();
        __CLR4_4_1124e124elb90paix.R.inc(49529);while ((((values.hasNext())&&(__CLR4_4_1124e124elb90paix.R.iget(49530)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49531)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49532);Comparable<?> nextValue = values.next();
            __CLR4_4_1124e124elb90paix.R.inc(49533);if ((((c.compare(v, nextValue) > 0)&&(__CLR4_4_1124e124elb90paix.R.iget(49534)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49535)==0&false))) {{
                __CLR4_4_1124e124elb90paix.R.inc(49536);result += getCount(nextValue);
            } }else {{
                __CLR4_4_1124e124elb90paix.R.inc(49537);return result;
            }
        }}
        }__CLR4_4_1124e124elb90paix.R.inc(49538);return result;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

     /**
     * Returns the cumulative frequency of values less than or equal to v.
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public long getCumFreq(int v) {try{__CLR4_4_1124e124elb90paix.R.inc(49539);
        __CLR4_4_1124e124elb90paix.R.inc(49540);return getCumFreq(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

     /**
     * Returns the cumulative frequency of values less than or equal to v.
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public long getCumFreq(long v) {try{__CLR4_4_1124e124elb90paix.R.inc(49541);
        __CLR4_4_1124e124elb90paix.R.inc(49542);return getCumFreq(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the cumulative frequency of values less than or equal to v.
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values equal to v
     */
    public long getCumFreq(char v) {try{__CLR4_4_1124e124elb90paix.R.inc(49543);
        __CLR4_4_1124e124elb90paix.R.inc(49544);return getCumFreq(Character.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    //----------------------------------------------------------------------------------------------

    /**
     * Returns the cumulative percentage of values less than or equal to v
     * (as a proportion between 0 and 1).
     * <p>
     * Returns <code>Double.NaN</code> if no values have been added.
     * Returns 0 if at least one value has been added, but v is not comparable
     * to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values less than or equal to v
     */
    public double getCumPct(Comparable<?> v) {try{__CLR4_4_1124e124elb90paix.R.inc(49545);
        __CLR4_4_1124e124elb90paix.R.inc(49546);final long sumFreq = getSumFreq();
        __CLR4_4_1124e124elb90paix.R.inc(49547);if ((((sumFreq == 0)&&(__CLR4_4_1124e124elb90paix.R.iget(49548)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49549)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49550);return Double.NaN;
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49551);return (double) getCumFreq(v) / (double) sumFreq;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the cumulative percentage of values less than or equal to v
     * (as a proportion between 0 and 1).
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values less than or equal to v
     */
    public double getCumPct(int v) {try{__CLR4_4_1124e124elb90paix.R.inc(49552);
        __CLR4_4_1124e124elb90paix.R.inc(49553);return getCumPct(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the cumulative percentage of values less than or equal to v
     * (as a proportion between 0 and 1).
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values less than or equal to v
     */
    public double getCumPct(long v) {try{__CLR4_4_1124e124elb90paix.R.inc(49554);
        __CLR4_4_1124e124elb90paix.R.inc(49555);return getCumPct(Long.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the cumulative percentage of values less than or equal to v
     * (as a proportion between 0 and 1).
     * <p>
     * Returns 0 if v is not comparable to the values set.</p>
     *
     * @param v the value to lookup
     * @return the proportion of values less than or equal to v
     */
    public double getCumPct(char v) {try{__CLR4_4_1124e124elb90paix.R.inc(49556);
        __CLR4_4_1124e124elb90paix.R.inc(49557);return getCumPct(Character.valueOf(v));
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Returns the mode value(s) in comparator order.
     *
     * @return a list containing the value(s) which appear most often.
     * @since 3.3
     */
    public List<Comparable<?>> getMode() {try{__CLR4_4_1124e124elb90paix.R.inc(49558);
        __CLR4_4_1124e124elb90paix.R.inc(49559);long mostPopular = 0; // frequencies are always positive

        // Get the max count first, so we avoid having to recreate the List each time
        __CLR4_4_1124e124elb90paix.R.inc(49560);for(Long l : freqTable.values()) {{
            __CLR4_4_1124e124elb90paix.R.inc(49561);long frequency = l.longValue();
            __CLR4_4_1124e124elb90paix.R.inc(49562);if ((((frequency > mostPopular)&&(__CLR4_4_1124e124elb90paix.R.iget(49563)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49564)==0&false))) {{
                __CLR4_4_1124e124elb90paix.R.inc(49565);mostPopular = frequency;
            }
        }}

        }__CLR4_4_1124e124elb90paix.R.inc(49566);List<Comparable<?>> modeList = new ArrayList<Comparable<?>>();
        __CLR4_4_1124e124elb90paix.R.inc(49567);for (Entry<Comparable<?>, Long> ent : freqTable.entrySet()) {{
            __CLR4_4_1124e124elb90paix.R.inc(49568);long frequency = ent.getValue().longValue();
            __CLR4_4_1124e124elb90paix.R.inc(49569);if ((((frequency == mostPopular)&&(__CLR4_4_1124e124elb90paix.R.iget(49570)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49571)==0&false))) {{
               __CLR4_4_1124e124elb90paix.R.inc(49572);modeList.add(ent.getKey());
            }
        }}
        }__CLR4_4_1124e124elb90paix.R.inc(49573);return modeList;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    //----------------------------------------------------------------------------------------------

    /**
     * Merge another Frequency object's counts into this instance.
     * This Frequency's counts will be incremented (or set when not already set)
     * by the counts represented by other.
     *
     * @param other the other {@link Frequency} object to be merged
     * @throws NullArgumentException if {@code other} is null
     * @since 3.1
     */
    public void merge(final Frequency other) throws NullArgumentException {try{__CLR4_4_1124e124elb90paix.R.inc(49574);
        __CLR4_4_1124e124elb90paix.R.inc(49575);MathUtils.checkNotNull(other, LocalizedFormats.NULL_NOT_ALLOWED);

        __CLR4_4_1124e124elb90paix.R.inc(49576);final Iterator<Map.Entry<Comparable<?>, Long>> iter = other.entrySetIterator();
        __CLR4_4_1124e124elb90paix.R.inc(49577);while ((((iter.hasNext())&&(__CLR4_4_1124e124elb90paix.R.iget(49578)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49579)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49580);final Map.Entry<Comparable<?>, Long> entry = iter.next();
            __CLR4_4_1124e124elb90paix.R.inc(49581);incrementValue(entry.getKey(), entry.getValue().longValue());
        }
    }}finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /**
     * Merge a {@link Collection} of {@link Frequency} objects into this instance.
     * This Frequency's counts will be incremented (or set when not already set)
     * by the counts represented by each of the others.
     *
     * @param others the other {@link Frequency} objects to be merged
     * @throws NullArgumentException if the collection is null
     * @since 3.1
     */
    public void merge(final Collection<Frequency> others) throws NullArgumentException {try{__CLR4_4_1124e124elb90paix.R.inc(49582);
        __CLR4_4_1124e124elb90paix.R.inc(49583);MathUtils.checkNotNull(others, LocalizedFormats.NULL_NOT_ALLOWED);

        __CLR4_4_1124e124elb90paix.R.inc(49584);for (final Frequency freq : others) {{
            __CLR4_4_1124e124elb90paix.R.inc(49585);merge(freq);
        }
    }}finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    //----------------------------------------------------------------------------------------------

    /**
     * A Comparator that compares comparable objects using the
     * natural order.  Copied from Commons Collections ComparableComparator.
     */
    private static class NaturalComparator<T extends Comparable<T>> implements Comparator<Comparable<T>>, Serializable {

        /** Serializable version identifier */
        private static final long serialVersionUID = -3852193713161395148L;

        /**
         * Compare the two {@link Comparable Comparable} arguments.
         * This method is equivalent to:
         * <pre>(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)</pre>
         *
         * @param  o1 the first object
         * @param  o2 the second object
         * @return  result of comparison
         * @throws NullPointerException when <i>o1</i> is <code>null</code>,
         *         or when <code>((Comparable)o1).compareTo(o2)</code> does
         * @throws ClassCastException when <i>o1</i> is not a {@link Comparable Comparable},
         *         or when <code>((Comparable)o1).compareTo(o2)</code> does
         */
        @SuppressWarnings("unchecked") // cast to (T) may throw ClassCastException, see Javadoc
        public int compare(Comparable<T> o1, Comparable<T> o2) {try{__CLR4_4_1124e124elb90paix.R.inc(49586);
            __CLR4_4_1124e124elb90paix.R.inc(49587);return o1.compareTo((T) o2);
        }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode() {try{__CLR4_4_1124e124elb90paix.R.inc(49588);
        __CLR4_4_1124e124elb90paix.R.inc(49589);final int prime = 31;
        __CLR4_4_1124e124elb90paix.R.inc(49590);int result = 1;
        __CLR4_4_1124e124elb90paix.R.inc(49591);result = prime * result +
                 (((((freqTable == null) )&&(__CLR4_4_1124e124elb90paix.R.iget(49592)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49593)==0&false))? 0 : freqTable.hashCode());
        __CLR4_4_1124e124elb90paix.R.inc(49594);return result;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1124e124elb90paix.R.inc(49595);
        __CLR4_4_1124e124elb90paix.R.inc(49596);if ((((this == obj)&&(__CLR4_4_1124e124elb90paix.R.iget(49597)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49598)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49599);return true;
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49600);if ((((!(obj instanceof Frequency))&&(__CLR4_4_1124e124elb90paix.R.iget(49601)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49602)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49603);return false;
        }
        }__CLR4_4_1124e124elb90paix.R.inc(49604);Frequency other = (Frequency) obj;
        __CLR4_4_1124e124elb90paix.R.inc(49605);if ((((freqTable == null)&&(__CLR4_4_1124e124elb90paix.R.iget(49606)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49607)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49608);if ((((other.freqTable != null)&&(__CLR4_4_1124e124elb90paix.R.iget(49609)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49610)==0&false))) {{
                __CLR4_4_1124e124elb90paix.R.inc(49611);return false;
            }
        }} }else {__CLR4_4_1124e124elb90paix.R.inc(49612);if ((((!freqTable.equals(other.freqTable))&&(__CLR4_4_1124e124elb90paix.R.iget(49613)!=0|true))||(__CLR4_4_1124e124elb90paix.R.iget(49614)==0&false))) {{
            __CLR4_4_1124e124elb90paix.R.inc(49615);return false;
        }
        }}__CLR4_4_1124e124elb90paix.R.inc(49616);return true;
    }finally{__CLR4_4_1124e124elb90paix.R.flushNeeded();}}

}
