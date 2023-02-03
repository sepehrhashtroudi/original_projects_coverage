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

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/**
 * <code>DelegatedDurationField</code> delegates each method call to the
 * duration field it wraps.
 * <p>
 * DelegatedDurationField is thread-safe and immutable, and its subclasses must
 * be as well.
 *
 * @author Brian S O'Neill
 * @see DecoratedDurationField
 * @since 1.0
 */
public class DelegatedDurationField extends DurationField implements Serializable {public static class __CLR4_4_1alyalylc8azt78{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization lock. */
    private static final long serialVersionUID = -5576443481242007829L;

    /** The DurationField being wrapped */
    private final DurationField iField;
    /** The field type */
    private final DurationFieldType iType;

    /**
     * Constructor.
     * 
     * @param field  the base field
     */
    protected DelegatedDurationField(DurationField field) {
        this(field, null);__CLR4_4_1alyalylc8azt78.R.inc(13751);try{__CLR4_4_1alyalylc8azt78.R.inc(13750);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param field  the base field
     * @param type  the field type to use
     */
    protected DelegatedDurationField(DurationField field, DurationFieldType type) {
        super();__CLR4_4_1alyalylc8azt78.R.inc(13753);try{__CLR4_4_1alyalylc8azt78.R.inc(13752);
        __CLR4_4_1alyalylc8azt78.R.inc(13754);if ((((field == null)&&(__CLR4_4_1alyalylc8azt78.R.iget(13755)!=0|true))||(__CLR4_4_1alyalylc8azt78.R.iget(13756)==0&false))) {{
            __CLR4_4_1alyalylc8azt78.R.inc(13757);throw new IllegalArgumentException("The field must not be null");
        }
        }__CLR4_4_1alyalylc8azt78.R.inc(13758);iField = field;
        __CLR4_4_1alyalylc8azt78.R.inc(13759);iType = ((((type == null )&&(__CLR4_4_1alyalylc8azt78.R.iget(13760)!=0|true))||(__CLR4_4_1alyalylc8azt78.R.iget(13761)==0&false))? field.getType() : type);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the wrapped duration field.
     * 
     * @return the wrapped DurationField
     */
    public final DurationField getWrappedField() {try{__CLR4_4_1alyalylc8azt78.R.inc(13762);
        __CLR4_4_1alyalylc8azt78.R.inc(13763);return iField;
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public DurationFieldType getType() {try{__CLR4_4_1alyalylc8azt78.R.inc(13764);
        __CLR4_4_1alyalylc8azt78.R.inc(13765);return iType;
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_1alyalylc8azt78.R.inc(13766);
        __CLR4_4_1alyalylc8azt78.R.inc(13767);return iType.getName();
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    /**
     * Returns true if this field is supported.
     */
    public boolean isSupported() {try{__CLR4_4_1alyalylc8azt78.R.inc(13768);
        __CLR4_4_1alyalylc8azt78.R.inc(13769);return iField.isSupported();
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public boolean isPrecise() {try{__CLR4_4_1alyalylc8azt78.R.inc(13770);
        __CLR4_4_1alyalylc8azt78.R.inc(13771);return iField.isPrecise();
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}
    
    public int getValue(long duration) {try{__CLR4_4_1alyalylc8azt78.R.inc(13772);
        __CLR4_4_1alyalylc8azt78.R.inc(13773);return iField.getValue(duration);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getValueAsLong(long duration) {try{__CLR4_4_1alyalylc8azt78.R.inc(13774);
        __CLR4_4_1alyalylc8azt78.R.inc(13775);return iField.getValueAsLong(duration);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public int getValue(long duration, long instant) {try{__CLR4_4_1alyalylc8azt78.R.inc(13776);
        __CLR4_4_1alyalylc8azt78.R.inc(13777);return iField.getValue(duration, instant);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getValueAsLong(long duration, long instant) {try{__CLR4_4_1alyalylc8azt78.R.inc(13778);
        __CLR4_4_1alyalylc8azt78.R.inc(13779);return iField.getValueAsLong(duration, instant);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getMillis(int value) {try{__CLR4_4_1alyalylc8azt78.R.inc(13780);
        __CLR4_4_1alyalylc8azt78.R.inc(13781);return iField.getMillis(value);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getMillis(long value) {try{__CLR4_4_1alyalylc8azt78.R.inc(13782);
        __CLR4_4_1alyalylc8azt78.R.inc(13783);return iField.getMillis(value);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getMillis(int value, long instant) {try{__CLR4_4_1alyalylc8azt78.R.inc(13784);
        __CLR4_4_1alyalylc8azt78.R.inc(13785);return iField.getMillis(value, instant);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getMillis(long value, long instant) {try{__CLR4_4_1alyalylc8azt78.R.inc(13786);
        __CLR4_4_1alyalylc8azt78.R.inc(13787);return iField.getMillis(value, instant);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long add(long instant, int value) {try{__CLR4_4_1alyalylc8azt78.R.inc(13788);
        __CLR4_4_1alyalylc8azt78.R.inc(13789);return iField.add(instant, value);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_1alyalylc8azt78.R.inc(13790);
        __CLR4_4_1alyalylc8azt78.R.inc(13791);return iField.add(instant, value);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public int getDifference(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1alyalylc8azt78.R.inc(13792);
        __CLR4_4_1alyalylc8azt78.R.inc(13793);return iField.getDifference(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_1alyalylc8azt78.R.inc(13794);
        __CLR4_4_1alyalylc8azt78.R.inc(13795);return iField.getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public long getUnitMillis() {try{__CLR4_4_1alyalylc8azt78.R.inc(13796);
        __CLR4_4_1alyalylc8azt78.R.inc(13797);return iField.getUnitMillis();
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public int compareTo(DurationField durationField) {try{__CLR4_4_1alyalylc8azt78.R.inc(13798);
        __CLR4_4_1alyalylc8azt78.R.inc(13799);return iField.compareTo(durationField);
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1alyalylc8azt78.R.inc(13800);
        __CLR4_4_1alyalylc8azt78.R.inc(13801);if ((((obj instanceof DelegatedDurationField)&&(__CLR4_4_1alyalylc8azt78.R.iget(13802)!=0|true))||(__CLR4_4_1alyalylc8azt78.R.iget(13803)==0&false))) {{
            __CLR4_4_1alyalylc8azt78.R.inc(13804);return iField.equals(((DelegatedDurationField) obj).iField);
        }
        }__CLR4_4_1alyalylc8azt78.R.inc(13805);return false;
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1alyalylc8azt78.R.inc(13806);
        __CLR4_4_1alyalylc8azt78.R.inc(13807);return iField.hashCode() ^ iType.hashCode();
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

    public String toString() {try{__CLR4_4_1alyalylc8azt78.R.inc(13808);
        __CLR4_4_1alyalylc8azt78.R.inc(13809);return ((((iType == null) )&&(__CLR4_4_1alyalylc8azt78.R.iget(13810)!=0|true))||(__CLR4_4_1alyalylc8azt78.R.iget(13811)==0&false))? iField.toString() :
            ("DurationField[" + iType + ']');
    }finally{__CLR4_4_1alyalylc8azt78.R.flushNeeded();}}

}
