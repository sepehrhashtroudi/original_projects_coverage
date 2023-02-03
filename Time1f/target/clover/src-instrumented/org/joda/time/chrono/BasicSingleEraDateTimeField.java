/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.chrono;

import java.util.Locale;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

/**
 * Provides time calculations for the coptic era component of time.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.2, refactored from CopticEraDateTimeField
 */
final class BasicSingleEraDateTimeField extends BaseDateTimeField {public static class __CLR4_4_17di7dilc8azsuo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9596,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Value of the era, which will be the same as DateTimeConstants.CE.
     */
    private static final int ERA_VALUE = DateTimeConstants.CE;
    /**
     * Text value of the era.
     */
    private final String iEraText;

    /**
     * Restricted constructor.
     */
    BasicSingleEraDateTimeField(String text) {
        super(DateTimeFieldType.era());__CLR4_4_17di7dilc8azsuo.R.inc(9559);try{__CLR4_4_17di7dilc8azsuo.R.inc(9558);
        __CLR4_4_17di7dilc8azsuo.R.inc(9560);iEraText = text;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public boolean isLenient() {try{__CLR4_4_17di7dilc8azsuo.R.inc(9561);
        __CLR4_4_17di7dilc8azsuo.R.inc(9562);return false;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public int get(long instant) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9563);
        __CLR4_4_17di7dilc8azsuo.R.inc(9564);return ERA_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long set(long instant, int era) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9565);
        __CLR4_4_17di7dilc8azsuo.R.inc(9566);FieldUtils.verifyValueBounds(this, era, ERA_VALUE, ERA_VALUE);
        __CLR4_4_17di7dilc8azsuo.R.inc(9567);return instant;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long set(long instant, String text, Locale locale) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9568);
        __CLR4_4_17di7dilc8azsuo.R.inc(9569);if ((((iEraText.equals(text) == false && "1".equals(text) == false)&&(__CLR4_4_17di7dilc8azsuo.R.iget(9570)!=0|true))||(__CLR4_4_17di7dilc8azsuo.R.iget(9571)==0&false))) {{
            __CLR4_4_17di7dilc8azsuo.R.inc(9572);throw new IllegalFieldValueException(DateTimeFieldType.era(), text);
        }
        }__CLR4_4_17di7dilc8azsuo.R.inc(9573);return instant;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long roundFloor(long instant) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9574);
        __CLR4_4_17di7dilc8azsuo.R.inc(9575);return Long.MIN_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long roundCeiling(long instant) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9576);
        __CLR4_4_17di7dilc8azsuo.R.inc(9577);return Long.MAX_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long roundHalfFloor(long instant) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9578);
        __CLR4_4_17di7dilc8azsuo.R.inc(9579);return Long.MIN_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long roundHalfCeiling(long instant) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9580);
        __CLR4_4_17di7dilc8azsuo.R.inc(9581);return Long.MIN_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public long roundHalfEven(long instant) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9582);
        __CLR4_4_17di7dilc8azsuo.R.inc(9583);return Long.MIN_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public DurationField getDurationField() {try{__CLR4_4_17di7dilc8azsuo.R.inc(9584);
        __CLR4_4_17di7dilc8azsuo.R.inc(9585);return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public DurationField getRangeDurationField() {try{__CLR4_4_17di7dilc8azsuo.R.inc(9586);
        __CLR4_4_17di7dilc8azsuo.R.inc(9587);return null;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public int getMinimumValue() {try{__CLR4_4_17di7dilc8azsuo.R.inc(9588);
        __CLR4_4_17di7dilc8azsuo.R.inc(9589);return ERA_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public int getMaximumValue() {try{__CLR4_4_17di7dilc8azsuo.R.inc(9590);
        __CLR4_4_17di7dilc8azsuo.R.inc(9591);return ERA_VALUE;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public String getAsText(int fieldValue, Locale locale) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9592);
        __CLR4_4_17di7dilc8azsuo.R.inc(9593);return iEraText;
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

    /** @inheritDoc */
    public int getMaximumTextLength(Locale locale) {try{__CLR4_4_17di7dilc8azsuo.R.inc(9594);
        __CLR4_4_17di7dilc8azsuo.R.inc(9595);return iEraText.length();
    }finally{__CLR4_4_17di7dilc8azsuo.R.flushNeeded();}}

}
