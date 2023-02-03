/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/**
 * DateTimeParserBucket is an advanced class, intended mainly for parser
 * implementations. It can also be used during normal parsing operations to
 * capture more information about the parse.
 * <p>
 * This class allows fields to be saved in any order, but be physically set in
 * a consistent order. This is useful for parsing against formats that allow
 * field values to contradict each other.
 * <p>
 * Field values are applied in an order where the "larger" fields are set
 * first, making their value less likely to stick.  A field is larger than
 * another when it's range duration is longer. If both ranges are the same,
 * then the larger field has the longer duration. If it cannot be determined
 * which field is larger, then the fields are set in the order they were saved.
 * <p>
 * For example, these fields were saved in this order: dayOfWeek, monthOfYear,
 * dayOfMonth, dayOfYear. When computeMillis is called, the fields are set in
 * this order: monthOfYear, dayOfYear, dayOfMonth, dayOfWeek.
 * <p>
 * DateTimeParserBucket is mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Fredrik Borgh
 * @since 1.0
 */
public class DateTimeParserBucket {public static class __CLR4_4_1d9dd9dlc8azthx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,17399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The chronology to use for parsing. */
    private final Chronology iChrono;
    private final long iMillis;
    
    /** The parsed zone, initialised to formatter zone. */
    private DateTimeZone iZone;
    /** The parsed offset. */
    private Integer iOffset;
    /** The locale to use for parsing. */
    private Locale iLocale;
    /** Used for parsing two-digit years. */
    private Integer iPivotYear;
    /** Used for parsing month/day without year. */
    private int iDefaultYear;

    private SavedField[] iSavedFields = new SavedField[8];
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    
    private Object iSavedState;

    /**
     * Constructs a bucket.
     * 
     * @param instantLocal  the initial millis from 1970-01-01T00:00:00, local time
     * @param chrono  the chronology to use
     * @param locale  the locale to use
     * @deprecated Use longer constructor
     */
    @Deprecated
    public DateTimeParserBucket(long instantLocal, Chronology chrono, Locale locale) {
        this(instantLocal, chrono, locale, null, 2000);__CLR4_4_1d9dd9dlc8azthx.R.inc(17186);try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17185);
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Constructs a bucket, with the option of specifying the pivot year for
     * two-digit year parsing.
     *
     * @param instantLocal  the initial millis from 1970-01-01T00:00:00, local time
     * @param chrono  the chronology to use
     * @param locale  the locale to use
     * @param pivotYear  the pivot year to use when parsing two-digit years
     * @since 1.1
     * @deprecated Use longer constructor
     */
    @Deprecated
    public DateTimeParserBucket(long instantLocal, Chronology chrono, Locale locale, Integer pivotYear) {
        this(instantLocal, chrono, locale, pivotYear, 2000);__CLR4_4_1d9dd9dlc8azthx.R.inc(17188);try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17187);
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Constructs a bucket, with the option of specifying the pivot year for
     * two-digit year parsing.
     *
     * @param instantLocal  the initial millis from 1970-01-01T00:00:00, local time
     * @param chrono  the chronology to use
     * @param locale  the locale to use
     * @param pivotYear  the pivot year to use when parsing two-digit years
     * @since 2.0
     */
    public DateTimeParserBucket(long instantLocal, Chronology chrono,
            Locale locale, Integer pivotYear, int defaultYear) {
        super();__CLR4_4_1d9dd9dlc8azthx.R.inc(17190);try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17189);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17191);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17192);iMillis = instantLocal;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17193);iZone = chrono.getZone();
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17194);iChrono = chrono.withUTC();
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17195);iLocale = ((((locale == null )&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17196)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17197)==0&false))? Locale.getDefault() : locale);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17198);iPivotYear = pivotYear;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17199);iDefaultYear = defaultYear;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the chronology of the bucket, which will be a local (UTC) chronology.
     */
    public Chronology getChronology() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17200);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17201);return iChrono;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the locale to be used during parsing.
     * 
     * @return the locale to use
     */
    public Locale getLocale() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17202);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17203);return iLocale;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the time zone used by computeMillis.
     */
    public DateTimeZone getZone() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17204);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17205);return iZone;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Set a time zone to be used when computeMillis is called.
     */
    public void setZone(DateTimeZone zone) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17206);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17207);iSavedState = null;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17208);iZone = zone;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the time zone offset in milliseconds used by computeMillis.
     * @deprecated use Integer version
     */
    @Deprecated
    public int getOffset() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17209);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17210);return ((((iOffset != null )&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17211)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17212)==0&false))? iOffset : 0);
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Returns the time zone offset in milliseconds used by computeMillis.
     */
    public Integer getOffsetInteger() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17213);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17214);return iOffset;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Set a time zone offset to be used when computeMillis is called.
     * @deprecated use Integer version
     */
    @Deprecated
    public void setOffset(int offset) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17215);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17216);iSavedState = null;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17217);iOffset = offset;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Set a time zone offset to be used when computeMillis is called.
     */
    public void setOffset(Integer offset) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17218);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17219);iSavedState = null;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17220);iOffset = offset;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the default year used when information is incomplete.
     * <p>
     * This is used for two-digit years and when the largest parsed field is
     * months or days.
     * <p>
     * A null value for two-digit years means to use the value from DateTimeFormatterBuilder.
     * A null value for month/day only parsing will cause the default of 2000 to be used.
     *
     * @return Integer value of the pivot year, null if not set
     * @since 1.1
     */
    public Integer getPivotYear() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17221);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17222);return iPivotYear;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Sets the pivot year to use when parsing two digit years.
     * <p>
     * If the value is set to null, this will indicate that default
     * behaviour should be used.
     *
     * @param pivotYear  the pivot year to use
     * @since 1.1
     */
    public void setPivotYear(Integer pivotYear) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17223);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17224);iPivotYear = pivotYear;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Saves a datetime field value.
     * 
     * @param field  the field, whose chronology must match that of this bucket
     * @param value  the value
     */
    public void saveField(DateTimeField field, int value) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17225);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17226);saveField(new SavedField(field, value));
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Saves a datetime field value.
     * 
     * @param fieldType  the field type
     * @param value  the value
     */
    public void saveField(DateTimeFieldType fieldType, int value) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17227);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17228);saveField(new SavedField(fieldType.getField(iChrono), value));
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Saves a datetime field text value.
     * 
     * @param fieldType  the field type
     * @param text  the text value
     * @param locale  the locale to use
     */
    public void saveField(DateTimeFieldType fieldType, String text, Locale locale) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17229);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17230);saveField(new SavedField(fieldType.getField(iChrono), text, locale));
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    private void saveField(SavedField field) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17231);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17232);SavedField[] savedFields = iSavedFields;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17233);int savedFieldsCount = iSavedFieldsCount;
        
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17234);if ((((savedFieldsCount == savedFields.length || iSavedFieldsShared)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17235)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17236)==0&false))) {{
            // Expand capacity or merely copy if saved fields are shared.
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17237);SavedField[] newArray = new SavedField
                [(((savedFieldsCount == savedFields.length )&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17238)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17239)==0&false))? savedFieldsCount * 2 : savedFields.length];
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17240);System.arraycopy(savedFields, 0, newArray, 0, savedFieldsCount);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17241);iSavedFields = savedFields = newArray;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17242);iSavedFieldsShared = false;
        }
        
        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17243);iSavedState = null;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17244);savedFields[savedFieldsCount] = field;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17245);iSavedFieldsCount = savedFieldsCount + 1;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Saves the state of this bucket, returning it in an opaque object. Call
     * restoreState to undo any changes that were made since the state was
     * saved. Calls to saveState may be nested.
     *
     * @return opaque saved state, which may be passed to restoreState
     */
    public Object saveState() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17246);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17247);if ((((iSavedState == null)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17248)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17249)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17250);iSavedState = new SavedState();
        }
        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17251);return iSavedState;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Restores the state of this bucket from a previously saved state. The
     * state object passed into this method is not consumed, and it can be used
     * later to restore to that state again.
     *
     * @param savedState opaque saved state, returned from saveState
     * @return true state object is valid and state restored
     */
    public boolean restoreState(Object savedState) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17252);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17253);if ((((savedState instanceof SavedState)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17254)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17255)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17256);if ((((((SavedState) savedState).restoreState(this))&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17257)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17258)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17259);iSavedState = savedState;
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17260);return true;
            }
        }}
        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17261);return false;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     */
    public long computeMillis() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17262);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17263);return computeMillis(false, null);
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @param resetFields false by default, but when true, unsaved field values are cleared
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     */
    public long computeMillis(boolean resetFields) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17264);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17265);return computeMillis(resetFields, null);
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    /**
     * Computes the parsed datetime by setting the saved fields.
     * This method is idempotent, but it is not thread-safe.
     *
     * @param resetFields false by default, but when true, unsaved field values are cleared
     * @param text optional text being parsed, to be included in any error message
     * @return milliseconds since 1970-01-01T00:00:00Z
     * @throws IllegalArgumentException if any field is out of range
     * @since 1.3
     */
    public long computeMillis(boolean resetFields, String text) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17266);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17267);SavedField[] savedFields = iSavedFields;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17268);int count = iSavedFieldsCount;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17269);if ((((iSavedFieldsShared)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17270)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17271)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17272);iSavedFields = savedFields = (SavedField[])iSavedFields.clone();
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17273);iSavedFieldsShared = false;
        }
        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17274);sort(savedFields, count);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17275);if ((((count > 0)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17276)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17277)==0&false))) {{
            // alter base year for parsing if first field is month or day
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17278);DurationField months = DurationFieldType.months().getField(iChrono);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17279);DurationField days = DurationFieldType.days().getField(iChrono);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17280);DurationField first = savedFields[0].iField.getDurationField();
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17281);if ((((compareReverse(first, months) >= 0 && compareReverse(first, days) <= 0)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17282)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17283)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17284);saveField(DateTimeFieldType.year(), iDefaultYear);
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17285);return computeMillis(resetFields, text);
            }
        }}

        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17286);long millis = iMillis;
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17287);try {
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17288);for (int i = 0; (((i < count)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17289)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17290)==0&false)); i++) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17291);millis = savedFields[i].set(millis, resetFields);
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17292);if ((((resetFields)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17293)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17294)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17295);for (int i = 0; (((i < count)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17296)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17297)==0&false)); i++) {{
                    __CLR4_4_1d9dd9dlc8azthx.R.inc(17298);millis = savedFields[i].set(millis, i == (count - 1));
                }
            }}
        }} catch (IllegalFieldValueException e) {
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17299);if ((((text != null)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17300)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17301)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17302);e.prependMessage("Cannot parse \"" + text + '"');
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17303);throw e;
        }
        
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17304);if ((((iOffset != null)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17305)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17306)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17307);millis -= iOffset;
        } }else {__CLR4_4_1d9dd9dlc8azthx.R.inc(17308);if ((((iZone != null)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17309)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17310)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17311);int offset = iZone.getOffsetFromLocal(millis);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17312);millis -= offset;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17313);if ((((offset != iZone.getOffset(millis))&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17314)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17315)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17316);String message = "Illegal instant due to time zone offset transition (" + iZone + ')';
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17317);if ((((text != null)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17318)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17319)==0&false))) {{
                    __CLR4_4_1d9dd9dlc8azthx.R.inc(17320);message = "Cannot parse \"" + text + "\": " + message;
                }
                }__CLR4_4_1d9dd9dlc8azthx.R.inc(17321);throw new IllegalInstantException(message);
            }
        }}
        
        }}__CLR4_4_1d9dd9dlc8azthx.R.inc(17322);return millis;
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    
    /**
     * Sorts elements [0,high). Calling java.util.Arrays isn't always the right
     * choice since it always creates an internal copy of the array, even if it
     * doesn't need to. If the array slice is small enough, an insertion sort
     * is chosen instead, but it doesn't need a copy!
     * <p>
     * This method has a modified version of that insertion sort, except it
     * doesn't create an unnecessary array copy. If high is over 10, then
     * java.util.Arrays is called, which will perform a merge sort, which is
     * faster than insertion sort on large lists.
     * <p>
     * The end result is much greater performance when computeMillis is called.
     * Since the amount of saved fields is small, the insertion sort is a
     * better choice. Additional performance is gained since there is no extra
     * array allocation and copying. Also, the insertion sort here does not
     * perform any casting operations. The version in java.util.Arrays performs
     * casts within the insertion sort loop.
     */
    private static void sort(SavedField[] array, int high) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17323);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17324);if ((((high > 10)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17325)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17326)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17327);Arrays.sort(array, 0, high);
        } }else {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17328);for (int i=0; (((i<high)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17329)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17330)==0&false)); i++) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17331);for (int j=i; (((j>0 && (array[j-1]).compareTo(array[j])>0)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17332)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17333)==0&false)); j--) {{
                    __CLR4_4_1d9dd9dlc8azthx.R.inc(17334);SavedField t = array[j];
                    __CLR4_4_1d9dd9dlc8azthx.R.inc(17335);array[j] = array[j-1];
                    __CLR4_4_1d9dd9dlc8azthx.R.inc(17336);array[j-1] = t;
                }
            }}
        }}
    }}finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}

    class SavedState {
        final DateTimeZone iZone;
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;
        
        SavedState() {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17337);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17338);this.iZone = DateTimeParserBucket.this.iZone;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17339);this.iOffset = DateTimeParserBucket.this.iOffset;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17340);this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17341);this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
        
        boolean restoreState(DateTimeParserBucket enclosing) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17342);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17343);if ((((enclosing != DateTimeParserBucket.this)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17344)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17345)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17346);return false;
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17347);enclosing.iZone = this.iZone;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17348);enclosing.iOffset = this.iOffset;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17349);enclosing.iSavedFields = this.iSavedFields;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17350);if ((((this.iSavedFieldsCount < enclosing.iSavedFieldsCount)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17351)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17352)==0&false))) {{
                // Since count is being restored to a lower count, the
                // potential exists for new saved fields to destroy data being
                // shared by another state. Set this flag such that the array
                // of saved fields is cloned prior to modification.
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17353);enclosing.iSavedFieldsShared = true;
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17354);enclosing.iSavedFieldsCount = this.iSavedFieldsCount;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17355);return true;
        }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    }
    
    static class SavedField implements Comparable<SavedField> {
        final DateTimeField iField;
        final int iValue;
        final String iText;
        final Locale iLocale;
        
        SavedField(DateTimeField field, int value) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17356);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17357);iField = field;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17358);iValue = value;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17359);iText = null;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17360);iLocale = null;
        }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
        
        SavedField(DateTimeField field, String text, Locale locale) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17361);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17362);iField = field;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17363);iValue = 0;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17364);iText = text;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17365);iLocale = locale;
        }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
        
        long set(long millis, boolean reset) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17366);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17367);if ((((iText == null)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17368)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17369)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17370);millis = iField.set(millis, iValue);
            } }else {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17371);millis = iField.set(millis, iText, iLocale);
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17372);if ((((reset)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17373)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17374)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17375);millis = iField.roundFloor(millis);
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17376);return millis;
        }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
        
        /**
         * The field with the longer range duration is ordered first, where
         * null is considered infinite. If the ranges match, then the field
         * with the longer duration is ordered first.
         */
        public int compareTo(SavedField obj) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17377);
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17378);DateTimeField other = obj.iField;
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17379);int result = compareReverse
                (iField.getRangeDurationField(), other.getRangeDurationField());
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17380);if ((((result != 0)&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17381)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17382)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17383);return result;
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17384);return compareReverse
                (iField.getDurationField(), other.getDurationField());
        }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
    }

    static int compareReverse(DurationField a, DurationField b) {try{__CLR4_4_1d9dd9dlc8azthx.R.inc(17385);
        __CLR4_4_1d9dd9dlc8azthx.R.inc(17386);if ((((a == null || !a.isSupported())&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17387)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17388)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17389);if ((((b == null || !b.isSupported())&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17390)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17391)==0&false))) {{
                __CLR4_4_1d9dd9dlc8azthx.R.inc(17392);return 0;
            }
            }__CLR4_4_1d9dd9dlc8azthx.R.inc(17393);return -1;
        }
        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17394);if ((((b == null || !b.isSupported())&&(__CLR4_4_1d9dd9dlc8azthx.R.iget(17395)!=0|true))||(__CLR4_4_1d9dd9dlc8azthx.R.iget(17396)==0&false))) {{
            __CLR4_4_1d9dd9dlc8azthx.R.inc(17397);return 1;
        }
        }__CLR4_4_1d9dd9dlc8azthx.R.inc(17398);return -a.compareTo(b);
    }finally{__CLR4_4_1d9dd9dlc8azthx.R.flushNeeded();}}
}
