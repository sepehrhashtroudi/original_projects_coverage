/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2011 Stephen Colebourne
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
package org.joda.time.base;

import java.io.Serializable;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

/**
 * BasePeriod is an abstract implementation of ReadablePeriod that stores
 * data in a <code>PeriodType</code> and an <code>int[]</code>.
 * <p>
 * This class should generally not be used directly by API users.
 * The {@link ReadablePeriod} interface should be used when different 
 * kinds of period objects are to be referenced.
 * <p>
 * BasePeriod subclasses may be mutable and not thread-safe.
 *
 * @author Brian S O'Neill
 * @author Stephen Colebourne
 * @since 1.0
 */
public abstract class BasePeriod
        extends AbstractPeriod
        implements ReadablePeriod, Serializable {public static class __CLR4_4_163q63qlc8azspu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,8138,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = -2110953284060001145L;
    /** Serialization version */
    private static final ReadablePeriod DUMMY_PERIOD = new AbstractPeriod() {
        public int getValue(int index) {try{__CLR4_4_163q63qlc8azspu.R.inc(7910);
            __CLR4_4_163q63qlc8azspu.R.inc(7911);return 0;
        }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}
        public PeriodType getPeriodType() {try{__CLR4_4_163q63qlc8azspu.R.inc(7912);
            __CLR4_4_163q63qlc8azspu.R.inc(7913);return PeriodType.time();
        }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}
    };

    /** The type of period */
    private final PeriodType iType;
    /** The values */
    private final int[] iValues;

    //-----------------------------------------------------------------------
    /**
     * Creates a period from a set of field values.
     *
     * @param years  amount of years in this period, which must be zero if unsupported
     * @param months  amount of months in this period, which must be zero if unsupported
     * @param weeks  amount of weeks in this period, which must be zero if unsupported
     * @param days  amount of days in this period, which must be zero if unsupported
     * @param hours  amount of hours in this period, which must be zero if unsupported
     * @param minutes  amount of minutes in this period, which must be zero if unsupported
     * @param seconds  amount of seconds in this period, which must be zero if unsupported
     * @param millis  amount of milliseconds in this period, which must be zero if unsupported
     * @param type  which set of fields this period supports
     * @throws IllegalArgumentException if period type is invalid
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected BasePeriod(int years, int months, int weeks, int days,
                         int hours, int minutes, int seconds, int millis,
                         PeriodType type) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7915);try{__CLR4_4_163q63qlc8azspu.R.inc(7914);
        __CLR4_4_163q63qlc8azspu.R.inc(7916);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(7917);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(7918);iValues = setPeriodInternal(years, months, weeks, days, hours, minutes, seconds, millis); // internal method
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     *
     * @param startInstant  interval start, in milliseconds
     * @param endInstant  interval end, in milliseconds
     * @param type  which set of fields this period supports, null means standard
     * @param chrono  the chronology to use, null means ISO default
     * @throws IllegalArgumentException if period type is invalid
     */
    protected BasePeriod(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7920);try{__CLR4_4_163q63qlc8azspu.R.inc(7919);
        __CLR4_4_163q63qlc8azspu.R.inc(7921);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(7922);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_163q63qlc8azspu.R.inc(7923);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(7924);iValues = chrono.get(this, startInstant, endInstant);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given interval endpoints.
     *
     * @param startInstant  interval start, null means now
     * @param endInstant  interval end, null means now
     * @param type  which set of fields this period supports, null means standard
     * @throws IllegalArgumentException if period type is invalid
     */
    protected BasePeriod(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7926);try{__CLR4_4_163q63qlc8azspu.R.inc(7925);
        __CLR4_4_163q63qlc8azspu.R.inc(7927);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(7928);if ((((startInstant == null && endInstant == null)&&(__CLR4_4_163q63qlc8azspu.R.iget(7929)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7930)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(7931);iType = type;
            __CLR4_4_163q63qlc8azspu.R.inc(7932);iValues = new int[size()];
        } }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(7933);long startMillis = DateTimeUtils.getInstantMillis(startInstant);
            __CLR4_4_163q63qlc8azspu.R.inc(7934);long endMillis = DateTimeUtils.getInstantMillis(endInstant);
            __CLR4_4_163q63qlc8azspu.R.inc(7935);Chronology chrono = DateTimeUtils.getIntervalChronology(startInstant, endInstant);
            __CLR4_4_163q63qlc8azspu.R.inc(7936);iType = type;
            __CLR4_4_163q63qlc8azspu.R.inc(7937);iValues = chrono.get(this, startMillis, endMillis);
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given duration and end point.
     * <p>
     * The two partials must contain the same fields, thus you can
     * specify two <code>LocalDate</code> objects, or two <code>LocalTime</code>
     * objects, but not one of each.
     * As these are Partial objects, time zones have no effect on the result.
     * <p>
     * The two partials must also both be contiguous - see
     * {@link DateTimeUtils#isContiguous(ReadablePartial)} for a
     * definition. Both <code>LocalDate</code> and <code>LocalTime</code> are contiguous.
     *
     * @param start  the start of the period, must not be null
     * @param end  the end of the period, must not be null
     * @param type  which set of fields this period supports, null means standard
     * @throws IllegalArgumentException if the partials are null or invalid
     * @since 1.1
     */
    protected BasePeriod(ReadablePartial start, ReadablePartial end, PeriodType type) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7939);try{__CLR4_4_163q63qlc8azspu.R.inc(7938);
        __CLR4_4_163q63qlc8azspu.R.inc(7940);if ((((start == null || end == null)&&(__CLR4_4_163q63qlc8azspu.R.iget(7941)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7942)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(7943);throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        }__CLR4_4_163q63qlc8azspu.R.inc(7944);if ((((start instanceof BaseLocal && end instanceof BaseLocal && start.getClass() == end.getClass())&&(__CLR4_4_163q63qlc8azspu.R.iget(7945)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7946)==0&false))) {{
            // for performance
            __CLR4_4_163q63qlc8azspu.R.inc(7947);type = checkPeriodType(type);
            __CLR4_4_163q63qlc8azspu.R.inc(7948);long startMillis = ((BaseLocal) start).getLocalMillis();
            __CLR4_4_163q63qlc8azspu.R.inc(7949);long endMillis = ((BaseLocal) end).getLocalMillis();
            __CLR4_4_163q63qlc8azspu.R.inc(7950);Chronology chrono = start.getChronology();
            __CLR4_4_163q63qlc8azspu.R.inc(7951);chrono = DateTimeUtils.getChronology(chrono);
            __CLR4_4_163q63qlc8azspu.R.inc(7952);iType = type;
            __CLR4_4_163q63qlc8azspu.R.inc(7953);iValues = chrono.get(this, startMillis, endMillis);
        } }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(7954);if ((((start.size() != end.size())&&(__CLR4_4_163q63qlc8azspu.R.iget(7955)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7956)==0&false))) {{
                __CLR4_4_163q63qlc8azspu.R.inc(7957);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
            }__CLR4_4_163q63qlc8azspu.R.inc(7958);for (int i = 0, isize = start.size(); (((i < isize)&&(__CLR4_4_163q63qlc8azspu.R.iget(7959)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7960)==0&false)); i++) {{
                __CLR4_4_163q63qlc8azspu.R.inc(7961);if ((((start.getFieldType(i) != end.getFieldType(i))&&(__CLR4_4_163q63qlc8azspu.R.iget(7962)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7963)==0&false))) {{
                    __CLR4_4_163q63qlc8azspu.R.inc(7964);throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }}
            }__CLR4_4_163q63qlc8azspu.R.inc(7965);if ((((DateTimeUtils.isContiguous(start) == false)&&(__CLR4_4_163q63qlc8azspu.R.iget(7966)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(7967)==0&false))) {{
                __CLR4_4_163q63qlc8azspu.R.inc(7968);throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
            }__CLR4_4_163q63qlc8azspu.R.inc(7969);iType = checkPeriodType(type);
            __CLR4_4_163q63qlc8azspu.R.inc(7970);Chronology chrono = DateTimeUtils.getChronology(start.getChronology()).withUTC();
            __CLR4_4_163q63qlc8azspu.R.inc(7971);iValues = chrono.get(this, chrono.set(start, 0L), chrono.set(end, 0L));
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given start point and duration.
     *
     * @param startInstant  the interval start, null means now
     * @param duration  the duration of the interval, null means zero-length
     * @param type  which set of fields this period supports, null means standard
     */
    protected BasePeriod(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7973);try{__CLR4_4_163q63qlc8azspu.R.inc(7972);
        __CLR4_4_163q63qlc8azspu.R.inc(7974);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(7975);long startMillis = DateTimeUtils.getInstantMillis(startInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(7976);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_163q63qlc8azspu.R.inc(7977);long endMillis = FieldUtils.safeAdd(startMillis, durationMillis);
        __CLR4_4_163q63qlc8azspu.R.inc(7978);Chronology chrono = DateTimeUtils.getInstantChronology(startInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(7979);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(7980);iValues = chrono.get(this, startMillis, endMillis);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given duration and end point.
     *
     * @param duration  the duration of the interval, null means zero-length
     * @param endInstant  the interval end, null means now
     * @param type  which set of fields this period supports, null means standard
     */
    protected BasePeriod(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7982);try{__CLR4_4_163q63qlc8azspu.R.inc(7981);
        __CLR4_4_163q63qlc8azspu.R.inc(7983);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(7984);long durationMillis = DateTimeUtils.getDurationMillis(duration);
        __CLR4_4_163q63qlc8azspu.R.inc(7985);long endMillis = DateTimeUtils.getInstantMillis(endInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(7986);long startMillis = FieldUtils.safeSubtract(endMillis, durationMillis);
        __CLR4_4_163q63qlc8azspu.R.inc(7987);Chronology chrono = DateTimeUtils.getInstantChronology(endInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(7988);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(7989);iValues = chrono.get(this, startMillis, endMillis);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given millisecond duration with the standard period type
     * and ISO rules, ensuring that the calculation is performed with the time-only period type.
     * <p>
     * The calculation uses the hour, minute, second and millisecond fields.
     *
     * @param duration  the duration, in milliseconds
     */
    protected BasePeriod(long duration) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7991);try{__CLR4_4_163q63qlc8azspu.R.inc(7990);
        // bug [3264409]
        // calculation uses period type from a period object (bad design)
        // thus we use a dummy period object with the time type
        __CLR4_4_163q63qlc8azspu.R.inc(7992);iType = PeriodType.standard();
        __CLR4_4_163q63qlc8azspu.R.inc(7993);int[] values = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, duration);
        __CLR4_4_163q63qlc8azspu.R.inc(7994);iValues = new int[8];
        __CLR4_4_163q63qlc8azspu.R.inc(7995);System.arraycopy(values, 0, iValues, 4, 4);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a period from the given millisecond duration, which is only really
     * suitable for durations less than one day.
     * <p>
     * Only fields that are precise will be used.
     * Thus the largest precise field may have a large value.
     *
     * @param duration  the duration, in milliseconds
     * @param type  which set of fields this period supports, null means standard
     * @param chrono  the chronology to use, null means ISO default
     * @throws IllegalArgumentException if period type is invalid
     */
    protected BasePeriod(long duration, PeriodType type, Chronology chrono) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(7997);try{__CLR4_4_163q63qlc8azspu.R.inc(7996);
        __CLR4_4_163q63qlc8azspu.R.inc(7998);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(7999);chrono = DateTimeUtils.getChronology(chrono);
        __CLR4_4_163q63qlc8azspu.R.inc(8000);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(8001);iValues = chrono.get(this, duration);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Creates a new period based on another using the {@link ConverterManager}.
     *
     * @param period  the period to convert
     * @param type  which set of fields this period supports, null means use type from object
     * @param chrono  the chronology to use, null means ISO default
     * @throws IllegalArgumentException if period is invalid
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected BasePeriod(Object period, PeriodType type, Chronology chrono) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(8003);try{__CLR4_4_163q63qlc8azspu.R.inc(8002);
        __CLR4_4_163q63qlc8azspu.R.inc(8004);PeriodConverter converter = ConverterManager.getInstance().getPeriodConverter(period);
        __CLR4_4_163q63qlc8azspu.R.inc(8005);type = ((((type == null )&&(__CLR4_4_163q63qlc8azspu.R.iget(8006)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8007)==0&false))? converter.getPeriodType(period) : type);
        __CLR4_4_163q63qlc8azspu.R.inc(8008);type = checkPeriodType(type);
        __CLR4_4_163q63qlc8azspu.R.inc(8009);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(8010);if ((((this instanceof ReadWritablePeriod)&&(__CLR4_4_163q63qlc8azspu.R.iget(8011)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8012)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8013);iValues = new int[size()];
            __CLR4_4_163q63qlc8azspu.R.inc(8014);chrono = DateTimeUtils.getChronology(chrono);
            __CLR4_4_163q63qlc8azspu.R.inc(8015);converter.setInto((ReadWritablePeriod) this, period, chrono);
        } }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(8016);iValues = new MutablePeriod(period, type, chrono).getValues();
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Constructor used when we trust ourselves.
     * Do not expose publically.
     *
     * @param values  the values to use, not null, not cloned
     * @param type  which set of fields this period supports, not null
     */
    protected BasePeriod(int[] values, PeriodType type) {
        super();__CLR4_4_163q63qlc8azspu.R.inc(8018);try{__CLR4_4_163q63qlc8azspu.R.inc(8017);
        __CLR4_4_163q63qlc8azspu.R.inc(8019);iType = type;
        __CLR4_4_163q63qlc8azspu.R.inc(8020);iValues = values;
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Validates a period type, converting nulls to a default value and
     * checking the type is suitable for this instance.
     * 
     * @param type  the type to check, may be null
     * @return the validated type to use, not null
     * @throws IllegalArgumentException if the period type is invalid
     */
    protected PeriodType checkPeriodType(PeriodType type) {try{__CLR4_4_163q63qlc8azspu.R.inc(8021);
        __CLR4_4_163q63qlc8azspu.R.inc(8022);return DateTimeUtils.getPeriodType(type);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the period type.
     *
     * @return the period type
     */
    public PeriodType getPeriodType() {try{__CLR4_4_163q63qlc8azspu.R.inc(8023);
        __CLR4_4_163q63qlc8azspu.R.inc(8024);return iType;
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Gets the value at the specified index.
     *
     * @param index  the index to retrieve
     * @return the value of the field at the specified index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public int getValue(int index) {try{__CLR4_4_163q63qlc8azspu.R.inc(8025);
        __CLR4_4_163q63qlc8azspu.R.inc(8026);return iValues[index];
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the total millisecond duration of this period relative to a start instant.
     * <p>
     * This method adds the period to the specified instant in order to
     * calculate the duration.
     * <p>
     * An instant must be supplied as the duration of a period varies.
     * For example, a period of 1 month could vary between the equivalent of
     * 28 and 31 days in milliseconds due to different length months.
     * Similarly, a day can vary at Daylight Savings cutover, typically between
     * 23 and 25 hours.
     *
     * @param startInstant  the instant to add the period to, thus obtaining the duration
     * @return the total length of the period as a duration relative to the start instant
     * @throws ArithmeticException if the millis exceeds the capacity of the duration
     */
    public Duration toDurationFrom(ReadableInstant startInstant) {try{__CLR4_4_163q63qlc8azspu.R.inc(8027);
        __CLR4_4_163q63qlc8azspu.R.inc(8028);long startMillis = DateTimeUtils.getInstantMillis(startInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(8029);Chronology chrono = DateTimeUtils.getInstantChronology(startInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(8030);long endMillis = chrono.add(this, startMillis, 1);
        __CLR4_4_163q63qlc8azspu.R.inc(8031);return new Duration(startMillis, endMillis);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Gets the total millisecond duration of this period relative to an
     * end instant.
     * <p>
     * This method subtracts the period from the specified instant in order
     * to calculate the duration.
     * <p>
     * An instant must be supplied as the duration of a period varies.
     * For example, a period of 1 month could vary between the equivalent of
     * 28 and 31 days in milliseconds due to different length months.
     * Similarly, a day can vary at Daylight Savings cutover, typically between
     * 23 and 25 hours.
     *
     * @param endInstant  the instant to subtract the period from, thus obtaining the duration
     * @return the total length of the period as a duration relative to the end instant
     * @throws ArithmeticException if the millis exceeds the capacity of the duration
     */
    public Duration toDurationTo(ReadableInstant endInstant) {try{__CLR4_4_163q63qlc8azspu.R.inc(8032);
        __CLR4_4_163q63qlc8azspu.R.inc(8033);long endMillis = DateTimeUtils.getInstantMillis(endInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(8034);Chronology chrono = DateTimeUtils.getInstantChronology(endInstant);
        __CLR4_4_163q63qlc8azspu.R.inc(8035);long startMillis = chrono.add(this, endMillis, -1);
        __CLR4_4_163q63qlc8azspu.R.inc(8036);return new Duration(startMillis, endMillis);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks whether a field type is supported, and if so adds the new value
     * to the relevant index in the specified array.
     * 
     * @param type  the field type
     * @param values  the array to update
     * @param newValue  the new value to store if successful
     */
    private void checkAndUpdate(DurationFieldType type, int[] values, int newValue) {try{__CLR4_4_163q63qlc8azspu.R.inc(8037);
        __CLR4_4_163q63qlc8azspu.R.inc(8038);int index = indexOf(type);
        __CLR4_4_163q63qlc8azspu.R.inc(8039);if ((((index == -1)&&(__CLR4_4_163q63qlc8azspu.R.iget(8040)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8041)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8042);if ((((newValue != 0)&&(__CLR4_4_163q63qlc8azspu.R.iget(8043)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8044)==0&false))) {{
                __CLR4_4_163q63qlc8azspu.R.inc(8045);throw new IllegalArgumentException(
                    "Period does not support field '" + type.getName() + "'");
            }
        }} }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(8046);values[index] = newValue;
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets all the fields of this period from another.
     * 
     * @param period  the period to copy from, not null
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected void setPeriod(ReadablePeriod period) {try{__CLR4_4_163q63qlc8azspu.R.inc(8047);
        __CLR4_4_163q63qlc8azspu.R.inc(8048);if ((((period == null)&&(__CLR4_4_163q63qlc8azspu.R.iget(8049)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8050)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8051);setValues(new int[size()]);
        } }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(8052);setPeriodInternal(period);
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Private method called from constructor.
     */
    private void setPeriodInternal(ReadablePeriod period) {try{__CLR4_4_163q63qlc8azspu.R.inc(8053);
        __CLR4_4_163q63qlc8azspu.R.inc(8054);int[] newValues = new int[size()];
        __CLR4_4_163q63qlc8azspu.R.inc(8055);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_163q63qlc8azspu.R.iget(8056)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8057)==0&false)); i++) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8058);DurationFieldType type = period.getFieldType(i);
            __CLR4_4_163q63qlc8azspu.R.inc(8059);int value = period.getValue(i);
            __CLR4_4_163q63qlc8azspu.R.inc(8060);checkAndUpdate(type, newValues, value);
        }
        }__CLR4_4_163q63qlc8azspu.R.inc(8061);setValues(newValues);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Sets the eight standard the fields in one go.
     * 
     * @param years  amount of years in this period, which must be zero if unsupported
     * @param months  amount of months in this period, which must be zero if unsupported
     * @param weeks  amount of weeks in this period, which must be zero if unsupported
     * @param days  amount of days in this period, which must be zero if unsupported
     * @param hours  amount of hours in this period, which must be zero if unsupported
     * @param minutes  amount of minutes in this period, which must be zero if unsupported
     * @param seconds  amount of seconds in this period, which must be zero if unsupported
     * @param millis  amount of milliseconds in this period, which must be zero if unsupported
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected void setPeriod(int years, int months, int weeks, int days,
                             int hours, int minutes, int seconds, int millis) {try{__CLR4_4_163q63qlc8azspu.R.inc(8062);
        __CLR4_4_163q63qlc8azspu.R.inc(8063);int[] newValues = setPeriodInternal(years, months, weeks, days, hours, minutes, seconds, millis);
        __CLR4_4_163q63qlc8azspu.R.inc(8064);setValues(newValues);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Private method called from constructor.
     */
    private int[] setPeriodInternal(int years, int months, int weeks, int days,
                                   int hours, int minutes, int seconds, int millis) {try{__CLR4_4_163q63qlc8azspu.R.inc(8065);
        __CLR4_4_163q63qlc8azspu.R.inc(8066);int[] newValues = new int[size()];
        __CLR4_4_163q63qlc8azspu.R.inc(8067);checkAndUpdate(DurationFieldType.years(), newValues, years);
        __CLR4_4_163q63qlc8azspu.R.inc(8068);checkAndUpdate(DurationFieldType.months(), newValues, months);
        __CLR4_4_163q63qlc8azspu.R.inc(8069);checkAndUpdate(DurationFieldType.weeks(), newValues, weeks);
        __CLR4_4_163q63qlc8azspu.R.inc(8070);checkAndUpdate(DurationFieldType.days(), newValues, days);
        __CLR4_4_163q63qlc8azspu.R.inc(8071);checkAndUpdate(DurationFieldType.hours(), newValues, hours);
        __CLR4_4_163q63qlc8azspu.R.inc(8072);checkAndUpdate(DurationFieldType.minutes(), newValues, minutes);
        __CLR4_4_163q63qlc8azspu.R.inc(8073);checkAndUpdate(DurationFieldType.seconds(), newValues, seconds);
        __CLR4_4_163q63qlc8azspu.R.inc(8074);checkAndUpdate(DurationFieldType.millis(), newValues, millis);
        __CLR4_4_163q63qlc8azspu.R.inc(8075);return newValues;
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the value of a field in this period.
     * 
     * @param field  the field to set
     * @param value  the value to set
     * @throws IllegalArgumentException if field is is null or not supported.
     */
    protected void setField(DurationFieldType field, int value) {try{__CLR4_4_163q63qlc8azspu.R.inc(8076);
        __CLR4_4_163q63qlc8azspu.R.inc(8077);setFieldInto(iValues, field, value);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Sets the value of a field in this period.
     * 
     * @param values  the array of values to update
     * @param field  the field to set
     * @param value  the value to set
     * @throws IllegalArgumentException if field is null or not supported.
     */
    protected void setFieldInto(int[] values, DurationFieldType field, int value) {try{__CLR4_4_163q63qlc8azspu.R.inc(8078);
        __CLR4_4_163q63qlc8azspu.R.inc(8079);int index = indexOf(field);
        __CLR4_4_163q63qlc8azspu.R.inc(8080);if ((((index == -1)&&(__CLR4_4_163q63qlc8azspu.R.iget(8081)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8082)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8083);if ((((value != 0 || field == null)&&(__CLR4_4_163q63qlc8azspu.R.iget(8084)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8085)==0&false))) {{
                __CLR4_4_163q63qlc8azspu.R.inc(8086);throw new IllegalArgumentException(
                    "Period does not support field '" + field + "'");
            }
        }} }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(8087);values[index] = value;
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Adds the value of a field in this period.
     * 
     * @param field  the field to set
     * @param value  the value to set
     * @throws IllegalArgumentException if field is is null or not supported.
     */
    protected void addField(DurationFieldType field, int value) {try{__CLR4_4_163q63qlc8azspu.R.inc(8088);
        __CLR4_4_163q63qlc8azspu.R.inc(8089);addFieldInto(iValues, field, value);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Adds the value of a field in this period.
     * 
     * @param values  the array of values to update
     * @param field  the field to set
     * @param value  the value to set
     * @throws IllegalArgumentException if field is is null or not supported.
     */
    protected void addFieldInto(int[] values, DurationFieldType field, int value) {try{__CLR4_4_163q63qlc8azspu.R.inc(8090);
        __CLR4_4_163q63qlc8azspu.R.inc(8091);int index = indexOf(field);
        __CLR4_4_163q63qlc8azspu.R.inc(8092);if ((((index == -1)&&(__CLR4_4_163q63qlc8azspu.R.iget(8093)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8094)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8095);if ((((value != 0 || field == null)&&(__CLR4_4_163q63qlc8azspu.R.iget(8096)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8097)==0&false))) {{
                __CLR4_4_163q63qlc8azspu.R.inc(8098);throw new IllegalArgumentException(
                    "Period does not support field '" + field + "'");
            }
        }} }else {{
            __CLR4_4_163q63qlc8azspu.R.inc(8099);values[index] = FieldUtils.safeAdd(values[index], value);
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Merges the fields from another period.
     * 
     * @param period  the period to add from, not null
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected void mergePeriod(ReadablePeriod period) {try{__CLR4_4_163q63qlc8azspu.R.inc(8100);
        __CLR4_4_163q63qlc8azspu.R.inc(8101);if ((((period != null)&&(__CLR4_4_163q63qlc8azspu.R.iget(8102)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8103)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8104);setValues(mergePeriodInto(getValues(), period));
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Merges the fields from another period.
     * 
     * @param values  the array of values to update
     * @param period  the period to add from, not null
     * @return the updated values
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected int[] mergePeriodInto(int[] values, ReadablePeriod period) {try{__CLR4_4_163q63qlc8azspu.R.inc(8105);
        __CLR4_4_163q63qlc8azspu.R.inc(8106);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_163q63qlc8azspu.R.iget(8107)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8108)==0&false)); i++) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8109);DurationFieldType type = period.getFieldType(i);
            __CLR4_4_163q63qlc8azspu.R.inc(8110);int value = period.getValue(i);
            __CLR4_4_163q63qlc8azspu.R.inc(8111);checkAndUpdate(type, values, value);
        }
        }__CLR4_4_163q63qlc8azspu.R.inc(8112);return values;
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Adds the fields from another period.
     * 
     * @param period  the period to add from, not null
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected void addPeriod(ReadablePeriod period) {try{__CLR4_4_163q63qlc8azspu.R.inc(8113);
        __CLR4_4_163q63qlc8azspu.R.inc(8114);if ((((period != null)&&(__CLR4_4_163q63qlc8azspu.R.iget(8115)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8116)==0&false))) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8117);setValues(addPeriodInto(getValues(), period));
        }
    }}finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Adds the fields from another period.
     * 
     * @param values  the array of values to update
     * @param period  the period to add from, not null
     * @return the updated values
     * @throws IllegalArgumentException if an unsupported field's value is non-zero
     */
    protected int[] addPeriodInto(int[] values, ReadablePeriod period) {try{__CLR4_4_163q63qlc8azspu.R.inc(8118);
        __CLR4_4_163q63qlc8azspu.R.inc(8119);for (int i = 0, isize = period.size(); (((i < isize)&&(__CLR4_4_163q63qlc8azspu.R.iget(8120)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8121)==0&false)); i++) {{
            __CLR4_4_163q63qlc8azspu.R.inc(8122);DurationFieldType type = period.getFieldType(i);
            __CLR4_4_163q63qlc8azspu.R.inc(8123);int value = period.getValue(i);
            __CLR4_4_163q63qlc8azspu.R.inc(8124);if ((((value != 0)&&(__CLR4_4_163q63qlc8azspu.R.iget(8125)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8126)==0&false))) {{
                __CLR4_4_163q63qlc8azspu.R.inc(8127);int index = indexOf(type);
                __CLR4_4_163q63qlc8azspu.R.inc(8128);if ((((index == -1)&&(__CLR4_4_163q63qlc8azspu.R.iget(8129)!=0|true))||(__CLR4_4_163q63qlc8azspu.R.iget(8130)==0&false))) {{
                    __CLR4_4_163q63qlc8azspu.R.inc(8131);throw new IllegalArgumentException(
                        "Period does not support field '" + type.getName() + "'");
                } }else {{
                    __CLR4_4_163q63qlc8azspu.R.inc(8132);values[index] = FieldUtils.safeAdd(getValue(index), value);
                }
            }}
        }}
        }__CLR4_4_163q63qlc8azspu.R.inc(8133);return values;
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the value of the field at the specified index.
     * 
     * @param index  the index
     * @param value  the value to set
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    protected void setValue(int index, int value) {try{__CLR4_4_163q63qlc8azspu.R.inc(8134);
        __CLR4_4_163q63qlc8azspu.R.inc(8135);iValues[index] = value;
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

    /**
     * Sets the values of all fields.
     * <p>
     * In version 2.0 and later, this method copies the array into the original.
     * This is because the instance variable has been changed to be final to satisfy the Java Memory Model.
     * This only impacts subclasses that are mutable.
     * 
     * @param values  the array of values
     */
    protected void setValues(int[] values) {try{__CLR4_4_163q63qlc8azspu.R.inc(8136);
        __CLR4_4_163q63qlc8azspu.R.inc(8137);System.arraycopy(values, 0, iValues, 0, iValues.length);
    }finally{__CLR4_4_163q63qlc8azspu.R.flushNeeded();}}

}
