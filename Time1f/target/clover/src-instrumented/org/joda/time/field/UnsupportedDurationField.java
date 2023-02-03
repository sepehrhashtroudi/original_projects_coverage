/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2009 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * A placeholder implementation to use when a duration field is not supported.
 * <p>
 * UnsupportedDurationField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class UnsupportedDurationField extends DurationField implements Serializable {public static class __CLR4_4_1bcebcelc8aztb0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock. */
    private static final long serialVersionUID = -6390301302770925357L;

    /** The cache of unsupported duration field instances */
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache;

    /**
     * Gets an instance of UnsupportedDurationField for a specific named field.
     * The returned instance is cached.
     * 
     * @param type  the type to obtain
     * @return the instance
     */
    public static synchronized UnsupportedDurationField getInstance(DurationFieldType type) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14702);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14703);UnsupportedDurationField field;
        __CLR4_4_1bcebcelc8aztb0.R.inc(14704);if ((((cCache == null)&&(__CLR4_4_1bcebcelc8aztb0.R.iget(14705)!=0|true))||(__CLR4_4_1bcebcelc8aztb0.R.iget(14706)==0&false))) {{
            __CLR4_4_1bcebcelc8aztb0.R.inc(14707);cCache = new HashMap<DurationFieldType, UnsupportedDurationField>(7);
            __CLR4_4_1bcebcelc8aztb0.R.inc(14708);field = null;
        } }else {{
            __CLR4_4_1bcebcelc8aztb0.R.inc(14709);field = cCache.get(type);
        }
        }__CLR4_4_1bcebcelc8aztb0.R.inc(14710);if ((((field == null)&&(__CLR4_4_1bcebcelc8aztb0.R.iget(14711)!=0|true))||(__CLR4_4_1bcebcelc8aztb0.R.iget(14712)==0&false))) {{
            __CLR4_4_1bcebcelc8aztb0.R.inc(14713);field = new UnsupportedDurationField(type);
            __CLR4_4_1bcebcelc8aztb0.R.inc(14714);cCache.put(type, field);
        }
        }__CLR4_4_1bcebcelc8aztb0.R.inc(14715);return field;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /** The name of the field */
    private final DurationFieldType iType;

    /**
     * Constructor.
     * 
     * @param type  the type to use
     */
    private UnsupportedDurationField(DurationFieldType type) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14716);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14717);iType = type;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // Design note: Simple Accessors return a suitable value, but methods
    // intended to perform calculations throw an UnsupportedOperationException.

    public final DurationFieldType getType() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14718);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14719);return iType;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14720);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14721);return iType.getName();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * This field is not supported.
     *
     * @return false always
     */
    public boolean isSupported() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14722);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14723);return false;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * This field is precise.
     * 
     * @return true always
     */
    public boolean isPrecise() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14724);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14725);return true;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getValue(long duration) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14726);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14727);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getValueAsLong(long duration) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14728);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14729);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getValue(long duration, long instant) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14730);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14731);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14732);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14733);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(int value) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14734);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14735);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(long value) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14736);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14737);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(int value, long instant) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14738);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14739);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getMillis(long value, long instant) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14740);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14741);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long add(long instant, int value) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14742);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14743);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long add(long instant, long value) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14744);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14745);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14746);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14747);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always throws UnsupportedOperationException
     *
     * @throws UnsupportedOperationException
     */
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14748);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14749);throw unsupported();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always returns zero.
     *
     * @return zero always
     */
    public long getUnitMillis() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14750);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14751);return 0;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Always returns zero, indicating that sort order is not relevent.
     *
     * @return zero always
     */
    public int compareTo(DurationField durationField) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14752);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14753);return 0;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    //------------------------------------------------------------------------
    /**
     * Compares this duration field to another.
     * 
     * @param obj  the object to compare to
     * @return true if equal
     */
    public boolean equals(Object obj) {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14754);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14755);if ((((this == obj)&&(__CLR4_4_1bcebcelc8aztb0.R.iget(14756)!=0|true))||(__CLR4_4_1bcebcelc8aztb0.R.iget(14757)==0&false))) {{
            __CLR4_4_1bcebcelc8aztb0.R.inc(14758);return true;
        } }else {__CLR4_4_1bcebcelc8aztb0.R.inc(14759);if ((((obj instanceof UnsupportedDurationField)&&(__CLR4_4_1bcebcelc8aztb0.R.iget(14760)!=0|true))||(__CLR4_4_1bcebcelc8aztb0.R.iget(14761)==0&false))) {{
            __CLR4_4_1bcebcelc8aztb0.R.inc(14762);UnsupportedDurationField other = (UnsupportedDurationField) obj;
            __CLR4_4_1bcebcelc8aztb0.R.inc(14763);if ((((other.getName() == null)&&(__CLR4_4_1bcebcelc8aztb0.R.iget(14764)!=0|true))||(__CLR4_4_1bcebcelc8aztb0.R.iget(14765)==0&false))) {{
                __CLR4_4_1bcebcelc8aztb0.R.inc(14766);return (getName() == null);
            }
            }__CLR4_4_1bcebcelc8aztb0.R.inc(14767);return (other.getName().equals(getName()));
        }
        }}__CLR4_4_1bcebcelc8aztb0.R.inc(14768);return false;
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Gets a suitable hashcode.
     * 
     * @return the hashcode
     */
    public int hashCode() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14769);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14770);return getName().hashCode();
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14771);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14772);return "UnsupportedDurationField[" + getName() + ']';
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    /**
     * Ensure proper singleton serialization
     */
    private Object readResolve() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14773);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14774);return getInstance(iType);
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

    private UnsupportedOperationException unsupported() {try{__CLR4_4_1bcebcelc8aztb0.R.inc(14775);
        __CLR4_4_1bcebcelc8aztb0.R.inc(14776);return new UnsupportedOperationException(iType + " field is unsupported");
    }finally{__CLR4_4_1bcebcelc8aztb0.R.flushNeeded();}}

}
