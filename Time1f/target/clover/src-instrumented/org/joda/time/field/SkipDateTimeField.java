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
package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/**
 * Wraps another field such that a certain value is skipped.
 * <p>
 * This is most useful for years where you want to skip zero, so the
 * sequence runs ...,2,1,-1,-2,...
 * <p>
 * SkipDateTimeField is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public final class SkipDateTimeField extends DelegatedDateTimeField {public static class __CLR4_4_1b68b68lc8azta7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,14518,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version. */
    private static final long serialVersionUID = -8869148464118507846L;

    /** The chronology to wrap. */
    private final Chronology iChronology;
    /** The value to skip. */
    private final int iSkip;
    /** The calculated minimum value. */
    private transient int iMinValue;

    /**
     * Constructor that skips zero.
     * 
     * @param chronology  the chronoogy to use
     * @param field  the field to skip zero on
     */
    public SkipDateTimeField(Chronology chronology, DateTimeField field) {
        this(chronology, field, 0);__CLR4_4_1b68b68lc8azta7.R.inc(14481);try{__CLR4_4_1b68b68lc8azta7.R.inc(14480);
    }finally{__CLR4_4_1b68b68lc8azta7.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param chronology  the chronoogy to use
     * @param field  the field to skip zero on
     * @param skip  the value to skip
     */
    public SkipDateTimeField(Chronology chronology, DateTimeField field, int skip) {
        super(field);__CLR4_4_1b68b68lc8azta7.R.inc(14483);try{__CLR4_4_1b68b68lc8azta7.R.inc(14482);
        __CLR4_4_1b68b68lc8azta7.R.inc(14484);iChronology = chronology;
        __CLR4_4_1b68b68lc8azta7.R.inc(14485);int min = super.getMinimumValue();
        __CLR4_4_1b68b68lc8azta7.R.inc(14486);if ((((min < skip)&&(__CLR4_4_1b68b68lc8azta7.R.iget(14487)!=0|true))||(__CLR4_4_1b68b68lc8azta7.R.iget(14488)==0&false))) {{
            __CLR4_4_1b68b68lc8azta7.R.inc(14489);iMinValue = min - 1;
        } }else {__CLR4_4_1b68b68lc8azta7.R.inc(14490);if ((((min == skip)&&(__CLR4_4_1b68b68lc8azta7.R.iget(14491)!=0|true))||(__CLR4_4_1b68b68lc8azta7.R.iget(14492)==0&false))) {{
            __CLR4_4_1b68b68lc8azta7.R.inc(14493);iMinValue = skip + 1;
        } }else {{
            __CLR4_4_1b68b68lc8azta7.R.inc(14494);iMinValue = min;
        }
        }}__CLR4_4_1b68b68lc8azta7.R.inc(14495);iSkip = skip;
    }finally{__CLR4_4_1b68b68lc8azta7.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int get(long millis) {try{__CLR4_4_1b68b68lc8azta7.R.inc(14496);
        __CLR4_4_1b68b68lc8azta7.R.inc(14497);int value = super.get(millis);
        __CLR4_4_1b68b68lc8azta7.R.inc(14498);if ((((value <= iSkip)&&(__CLR4_4_1b68b68lc8azta7.R.iget(14499)!=0|true))||(__CLR4_4_1b68b68lc8azta7.R.iget(14500)==0&false))) {{
            __CLR4_4_1b68b68lc8azta7.R.inc(14501);value--;
        }
        }__CLR4_4_1b68b68lc8azta7.R.inc(14502);return value;
    }finally{__CLR4_4_1b68b68lc8azta7.R.flushNeeded();}}

    public long set(long millis, int value) {try{__CLR4_4_1b68b68lc8azta7.R.inc(14503);
        __CLR4_4_1b68b68lc8azta7.R.inc(14504);FieldUtils.verifyValueBounds(this, value, iMinValue, getMaximumValue());
        __CLR4_4_1b68b68lc8azta7.R.inc(14505);if ((((value <= iSkip)&&(__CLR4_4_1b68b68lc8azta7.R.iget(14506)!=0|true))||(__CLR4_4_1b68b68lc8azta7.R.iget(14507)==0&false))) {{
            __CLR4_4_1b68b68lc8azta7.R.inc(14508);if ((((value == iSkip)&&(__CLR4_4_1b68b68lc8azta7.R.iget(14509)!=0|true))||(__CLR4_4_1b68b68lc8azta7.R.iget(14510)==0&false))) {{
                __CLR4_4_1b68b68lc8azta7.R.inc(14511);throw new IllegalFieldValueException
                    (DateTimeFieldType.year(), Integer.valueOf(value), null, null);
            }
            }__CLR4_4_1b68b68lc8azta7.R.inc(14512);value++;
        }
        }__CLR4_4_1b68b68lc8azta7.R.inc(14513);return super.set(millis, value);
    }finally{__CLR4_4_1b68b68lc8azta7.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1b68b68lc8azta7.R.inc(14514);
        __CLR4_4_1b68b68lc8azta7.R.inc(14515);return iMinValue;
    }finally{__CLR4_4_1b68b68lc8azta7.R.flushNeeded();}}

    private Object readResolve() {try{__CLR4_4_1b68b68lc8azta7.R.inc(14516);
        __CLR4_4_1b68b68lc8azta7.R.inc(14517);return getType().getField(iChronology);
    }finally{__CLR4_4_1b68b68lc8azta7.R.flushNeeded();}}

}
