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
package org.joda.time.chrono;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/**
 * Provides time calculations for the month of the year component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.2, refactored from GJMonthOfYearDateTimeField
 */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {public static class __CLR4_4_178p78plc8azsui{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    @SuppressWarnings("unused")
    private static final long serialVersionUID = -8258715387168736L;

    private static final int MIN = DateTimeConstants.JANUARY;

    private final BasicChronology iChronology;
    private final int iMax;
    private final int iLeapMonth;

    /**
     * Restricted constructor.
     * 
     * @param leapMonth the month of year that leaps
     */
    BasicMonthOfYearDateTimeField(BasicChronology chronology, int leapMonth) {
        super(DateTimeFieldType.monthOfYear(), chronology.getAverageMillisPerMonth());__CLR4_4_178p78plc8azsui.R.inc(9386);try{__CLR4_4_178p78plc8azsui.R.inc(9385);
        __CLR4_4_178p78plc8azsui.R.inc(9387);iChronology = chronology;
        __CLR4_4_178p78plc8azsui.R.inc(9388);iMax = iChronology.getMaxMonth();
        __CLR4_4_178p78plc8azsui.R.inc(9389);iLeapMonth = leapMonth;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public boolean isLenient() {try{__CLR4_4_178p78plc8azsui.R.inc(9390);
        __CLR4_4_178p78plc8azsui.R.inc(9391);return false;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the Month component of the specified time instant.
     *
     * @see org.joda.time.DateTimeField#get(long)
     * @see org.joda.time.ReadableDateTime#getMonthOfYear()
     * @param instant  the time instant in millis to query.
     * @return the month extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_178p78plc8azsui.R.inc(9392);
        __CLR4_4_178p78plc8azsui.R.inc(9393);return iChronology.getMonthOfYear(instant);
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Add the specified month to the specified time instant.
     * The amount added may be negative.<p>
     * If the new month has less total days than the specified
     * day of the month, this value is coerced to the nearest
     * sane value. e.g.<p>
     * 07-31 - (1 month) = 06-30<p>
     * 03-31 - (1 month) = 02-28 or 02-29 depending<p>
     * 
     * @see org.joda.time.DateTimeField#add
     * @see org.joda.time.ReadWritableDateTime#addMonths(int)
     * @param instant  the time instant in millis to update.
     * @param months  the months to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, int months) {try{__CLR4_4_178p78plc8azsui.R.inc(9394);
        __CLR4_4_178p78plc8azsui.R.inc(9395);if ((((months == 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9396)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9397)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9398);return instant; // the easy case
        }
        //
        // Save time part first.
        //
        }__CLR4_4_178p78plc8azsui.R.inc(9399);long timePart = iChronology.getMillisOfDay(instant);
        //
        //
        // Get this year and month.
        //
        __CLR4_4_178p78plc8azsui.R.inc(9400);int thisYear = iChronology.getYear(instant);
        __CLR4_4_178p78plc8azsui.R.inc(9401);int thisMonth = iChronology.getMonthOfYear(instant, thisYear);
        // ----------------------------------------------------------
        //
        // Do not refactor without careful consideration.
        // Order of calculation is important.
        //
        __CLR4_4_178p78plc8azsui.R.inc(9402);int yearToUse;
        // Initially, monthToUse is zero-based
        __CLR4_4_178p78plc8azsui.R.inc(9403);int monthToUse = thisMonth - 1 + months;
        __CLR4_4_178p78plc8azsui.R.inc(9404);if ((((monthToUse >= 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9405)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9406)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9407);yearToUse = thisYear + (monthToUse / iMax);
            __CLR4_4_178p78plc8azsui.R.inc(9408);monthToUse = (monthToUse % iMax) + 1;
        } }else {{
            __CLR4_4_178p78plc8azsui.R.inc(9409);yearToUse = thisYear + (monthToUse / iMax) - 1;
            __CLR4_4_178p78plc8azsui.R.inc(9410);monthToUse = Math.abs(monthToUse);
            __CLR4_4_178p78plc8azsui.R.inc(9411);int remMonthToUse = monthToUse % iMax;
            // Take care of the boundary condition
            __CLR4_4_178p78plc8azsui.R.inc(9412);if ((((remMonthToUse == 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9413)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9414)==0&false))) {{
                __CLR4_4_178p78plc8azsui.R.inc(9415);remMonthToUse = iMax;
            }
            }__CLR4_4_178p78plc8azsui.R.inc(9416);monthToUse = iMax - remMonthToUse + 1;
            // Take care of the boundary condition
            __CLR4_4_178p78plc8azsui.R.inc(9417);if ((((monthToUse == 1)&&(__CLR4_4_178p78plc8azsui.R.iget(9418)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9419)==0&false))) {{
                __CLR4_4_178p78plc8azsui.R.inc(9420);yearToUse += 1;
            }
        }}
        // End of do not refactor.
        // ----------------------------------------------------------

        //
        // Quietly force DOM to nearest sane value.
        //
        }__CLR4_4_178p78plc8azsui.R.inc(9421);int dayToUse = iChronology.getDayOfMonth(instant, thisYear, thisMonth);
        __CLR4_4_178p78plc8azsui.R.inc(9422);int maxDay = iChronology.getDaysInYearMonth(yearToUse, monthToUse);
        __CLR4_4_178p78plc8azsui.R.inc(9423);if ((((dayToUse > maxDay)&&(__CLR4_4_178p78plc8azsui.R.iget(9424)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9425)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9426);dayToUse = maxDay;
        }
        //
        // get proper date part, and return result
        //
        }__CLR4_4_178p78plc8azsui.R.inc(9427);long datePart =
            iChronology.getYearMonthDayMillis(yearToUse, monthToUse, dayToUse);
        __CLR4_4_178p78plc8azsui.R.inc(9428);return datePart + timePart;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long add(long instant, long months) {try{__CLR4_4_178p78plc8azsui.R.inc(9429);
        __CLR4_4_178p78plc8azsui.R.inc(9430);int i_months = (int)months;
        __CLR4_4_178p78plc8azsui.R.inc(9431);if ((((i_months == months)&&(__CLR4_4_178p78plc8azsui.R.iget(9432)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9433)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9434);return add(instant, i_months);
        }

        // Copied from add(long, int) and modified slightly:

        }__CLR4_4_178p78plc8azsui.R.inc(9435);long timePart = iChronology.getMillisOfDay(instant);

        __CLR4_4_178p78plc8azsui.R.inc(9436);int thisYear = iChronology.getYear(instant);
        __CLR4_4_178p78plc8azsui.R.inc(9437);int thisMonth = iChronology.getMonthOfYear(instant, thisYear);

        __CLR4_4_178p78plc8azsui.R.inc(9438);long yearToUse;
        __CLR4_4_178p78plc8azsui.R.inc(9439);long monthToUse = thisMonth - 1 + months;
        __CLR4_4_178p78plc8azsui.R.inc(9440);if ((((monthToUse >= 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9441)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9442)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9443);yearToUse = thisYear + (monthToUse / iMax);
            __CLR4_4_178p78plc8azsui.R.inc(9444);monthToUse = (monthToUse % iMax) + 1;
        } }else {{
            __CLR4_4_178p78plc8azsui.R.inc(9445);yearToUse = thisYear + (monthToUse / iMax) - 1;
            __CLR4_4_178p78plc8azsui.R.inc(9446);monthToUse = Math.abs(monthToUse);
            __CLR4_4_178p78plc8azsui.R.inc(9447);int remMonthToUse = (int)(monthToUse % iMax);
            __CLR4_4_178p78plc8azsui.R.inc(9448);if ((((remMonthToUse == 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9449)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9450)==0&false))) {{
                __CLR4_4_178p78plc8azsui.R.inc(9451);remMonthToUse = iMax;
            }
            }__CLR4_4_178p78plc8azsui.R.inc(9452);monthToUse = iMax - remMonthToUse + 1;
            __CLR4_4_178p78plc8azsui.R.inc(9453);if ((((monthToUse == 1)&&(__CLR4_4_178p78plc8azsui.R.iget(9454)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9455)==0&false))) {{
                __CLR4_4_178p78plc8azsui.R.inc(9456);yearToUse += 1;
            }
        }}

        }__CLR4_4_178p78plc8azsui.R.inc(9457);if ((((yearToUse < iChronology.getMinYear() ||
            yearToUse > iChronology.getMaxYear())&&(__CLR4_4_178p78plc8azsui.R.iget(9458)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9459)==0&false))) {{

            __CLR4_4_178p78plc8azsui.R.inc(9460);throw new IllegalArgumentException
                ("Magnitude of add amount is too large: " + months);
        }

        }__CLR4_4_178p78plc8azsui.R.inc(9461);int i_yearToUse = (int)yearToUse;
        __CLR4_4_178p78plc8azsui.R.inc(9462);int i_monthToUse = (int)monthToUse;

        __CLR4_4_178p78plc8azsui.R.inc(9463);int dayToUse = iChronology.getDayOfMonth(instant, thisYear, thisMonth);
        __CLR4_4_178p78plc8azsui.R.inc(9464);int maxDay = iChronology.getDaysInYearMonth(i_yearToUse, i_monthToUse);
        __CLR4_4_178p78plc8azsui.R.inc(9465);if ((((dayToUse > maxDay)&&(__CLR4_4_178p78plc8azsui.R.iget(9466)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9467)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9468);dayToUse = maxDay;
        }

        }__CLR4_4_178p78plc8azsui.R.inc(9469);long datePart =
            iChronology.getYearMonthDayMillis(i_yearToUse, i_monthToUse, dayToUse);
        __CLR4_4_178p78plc8azsui.R.inc(9470);return datePart + timePart;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int[] add(ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd) {try{__CLR4_4_178p78plc8azsui.R.inc(9471);
        // overridden as superclass algorithm can't handle
        // 2004-02-29 + 48 months -> 2008-02-29 type dates
        __CLR4_4_178p78plc8azsui.R.inc(9472);if ((((valueToAdd == 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9473)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9474)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9475);return values;
        }
        }__CLR4_4_178p78plc8azsui.R.inc(9476);if ((((partial.size() > 0 && partial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && fieldIndex == 0)&&(__CLR4_4_178p78plc8azsui.R.iget(9477)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9478)==0&false))) {{
            // month is largest field and being added to, such as month-day
            __CLR4_4_178p78plc8azsui.R.inc(9479);int curMonth0 = partial.getValue(0) - 1;
            __CLR4_4_178p78plc8azsui.R.inc(9480);int newMonth = ((curMonth0 + (valueToAdd % 12) + 12) % 12) + 1;
            __CLR4_4_178p78plc8azsui.R.inc(9481);return set(partial, 0, values, newMonth);
        }
        }__CLR4_4_178p78plc8azsui.R.inc(9482);if ((((DateTimeUtils.isContiguous(partial))&&(__CLR4_4_178p78plc8azsui.R.iget(9483)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9484)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9485);long instant = 0L;
            __CLR4_4_178p78plc8azsui.R.inc(9486);for (int i = 0, isize = partial.size(); (((i < isize)&&(__CLR4_4_178p78plc8azsui.R.iget(9487)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9488)==0&false)); i++) {{
                __CLR4_4_178p78plc8azsui.R.inc(9489);instant = partial.getFieldType(i).getField(iChronology).set(instant, values[i]);
            }
            }__CLR4_4_178p78plc8azsui.R.inc(9490);instant = add(instant, valueToAdd);
            __CLR4_4_178p78plc8azsui.R.inc(9491);return iChronology.get(partial, instant);
        } }else {{
            __CLR4_4_178p78plc8azsui.R.inc(9492);return super.add(partial, fieldIndex, values, valueToAdd);
        }
    }}finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Add to the Month component of the specified time instant
     * wrapping around within that component if necessary.
     * 
     * @see org.joda.time.DateTimeField#addWrapField
     * @param instant  the time instant in millis to update.
     * @param months  the months to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int months) {try{__CLR4_4_178p78plc8azsui.R.inc(9493);
        __CLR4_4_178p78plc8azsui.R.inc(9494);return set(instant, FieldUtils.getWrappedValue(get(instant), months, MIN, iMax));
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_178p78plc8azsui.R.inc(9495);
        __CLR4_4_178p78plc8azsui.R.inc(9496);if ((((minuendInstant < subtrahendInstant)&&(__CLR4_4_178p78plc8azsui.R.iget(9497)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9498)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9499);return -getDifference(subtrahendInstant, minuendInstant);
        }

        }__CLR4_4_178p78plc8azsui.R.inc(9500);int minuendYear = iChronology.getYear(minuendInstant);
        __CLR4_4_178p78plc8azsui.R.inc(9501);int minuendMonth = iChronology.getMonthOfYear(minuendInstant, minuendYear);
        __CLR4_4_178p78plc8azsui.R.inc(9502);int subtrahendYear = iChronology.getYear(subtrahendInstant);
        __CLR4_4_178p78plc8azsui.R.inc(9503);int subtrahendMonth = iChronology.getMonthOfYear(subtrahendInstant, subtrahendYear);

        __CLR4_4_178p78plc8azsui.R.inc(9504);long difference = (minuendYear - subtrahendYear) * ((long) iMax) + minuendMonth - subtrahendMonth;

        // Before adjusting for remainder, account for special case of add
        // where the day-of-month is forced to the nearest sane value.
        __CLR4_4_178p78plc8azsui.R.inc(9505);int minuendDom = iChronology.getDayOfMonth
            (minuendInstant, minuendYear, minuendMonth);
        __CLR4_4_178p78plc8azsui.R.inc(9506);if ((((minuendDom == iChronology.getDaysInYearMonth(minuendYear, minuendMonth))&&(__CLR4_4_178p78plc8azsui.R.iget(9507)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9508)==0&false))) {{
            // Last day of the minuend month...
            __CLR4_4_178p78plc8azsui.R.inc(9509);int subtrahendDom = iChronology.getDayOfMonth
                (subtrahendInstant, subtrahendYear, subtrahendMonth);
            __CLR4_4_178p78plc8azsui.R.inc(9510);if ((((subtrahendDom > minuendDom)&&(__CLR4_4_178p78plc8azsui.R.iget(9511)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9512)==0&false))) {{
                // ...and day of subtrahend month is larger.
                // Note: This works fine, but it ideally shouldn't invoke other
                // fields from within a field.
                __CLR4_4_178p78plc8azsui.R.inc(9513);subtrahendInstant = iChronology.dayOfMonth().set(subtrahendInstant, minuendDom);
            }
        }}

        // Inlined remainder method to avoid duplicate calls.
        }__CLR4_4_178p78plc8azsui.R.inc(9514);long minuendRem = minuendInstant
            - iChronology.getYearMonthMillis(minuendYear, minuendMonth);
        __CLR4_4_178p78plc8azsui.R.inc(9515);long subtrahendRem = subtrahendInstant
            - iChronology.getYearMonthMillis(subtrahendYear, subtrahendMonth);

        __CLR4_4_178p78plc8azsui.R.inc(9516);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_178p78plc8azsui.R.iget(9517)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9518)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9519);difference--;
        }

        }__CLR4_4_178p78plc8azsui.R.inc(9520);return difference;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Set the Month component of the specified time instant.<p>
     * If the new month has less total days than the specified
     * day of the month, this value is coerced to the nearest
     * sane value. e.g.<p>
     * 07-31 to month 6 = 06-30<p>
     * 03-31 to month 2 = 02-28 or 02-29 depending<p>
     * 
     * @param instant  the time instant in millis to update.
     * @param month  the month (1,12) to update the time to.
     * @return the updated time instant.
     * @throws IllegalArgumentException  if month is invalid
     */
    public long set(long instant, int month) {try{__CLR4_4_178p78plc8azsui.R.inc(9521);
        __CLR4_4_178p78plc8azsui.R.inc(9522);FieldUtils.verifyValueBounds(this, month, MIN, iMax);
        //
        __CLR4_4_178p78plc8azsui.R.inc(9523);int thisYear = iChronology.getYear(instant);
        //
        __CLR4_4_178p78plc8azsui.R.inc(9524);int thisDom = iChronology.getDayOfMonth(instant, thisYear);
        __CLR4_4_178p78plc8azsui.R.inc(9525);int maxDom = iChronology.getDaysInYearMonth(thisYear, month);
        __CLR4_4_178p78plc8azsui.R.inc(9526);if ((((thisDom > maxDom)&&(__CLR4_4_178p78plc8azsui.R.iget(9527)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9528)==0&false))) {{
            // Quietly force DOM to nearest sane value.
            __CLR4_4_178p78plc8azsui.R.inc(9529);thisDom = maxDom;
        }
        // Return newly calculated millis value
        }__CLR4_4_178p78plc8azsui.R.inc(9530);return iChronology.getYearMonthDayMillis(thisYear, month, thisDom) +
            iChronology.getMillisOfDay(instant);
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public DurationField getRangeDurationField() {try{__CLR4_4_178p78plc8azsui.R.inc(9531);
        __CLR4_4_178p78plc8azsui.R.inc(9532);return iChronology.years();
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public boolean isLeap(long instant) {try{__CLR4_4_178p78plc8azsui.R.inc(9533);
        __CLR4_4_178p78plc8azsui.R.inc(9534);int thisYear = iChronology.getYear(instant);
        __CLR4_4_178p78plc8azsui.R.inc(9535);if ((((iChronology.isLeapYear(thisYear))&&(__CLR4_4_178p78plc8azsui.R.iget(9536)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9537)==0&false))) {{
            __CLR4_4_178p78plc8azsui.R.inc(9538);return (iChronology.getMonthOfYear(instant, thisYear) == iLeapMonth);
        }
        }__CLR4_4_178p78plc8azsui.R.inc(9539);return false;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int getLeapAmount(long instant) {try{__CLR4_4_178p78plc8azsui.R.inc(9540);
        __CLR4_4_178p78plc8azsui.R.inc(9541);return (((isLeap(instant) )&&(__CLR4_4_178p78plc8azsui.R.iget(9542)!=0|true))||(__CLR4_4_178p78plc8azsui.R.iget(9543)==0&false))? 1 : 0;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public DurationField getLeapDurationField() {try{__CLR4_4_178p78plc8azsui.R.inc(9544);
        __CLR4_4_178p78plc8azsui.R.inc(9545);return iChronology.days();
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int getMinimumValue() {try{__CLR4_4_178p78plc8azsui.R.inc(9546);
        __CLR4_4_178p78plc8azsui.R.inc(9547);return MIN;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public int getMaximumValue() {try{__CLR4_4_178p78plc8azsui.R.inc(9548);
        __CLR4_4_178p78plc8azsui.R.inc(9549);return iMax;
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long roundFloor(long instant) {try{__CLR4_4_178p78plc8azsui.R.inc(9550);
        __CLR4_4_178p78plc8azsui.R.inc(9551);int year = iChronology.getYear(instant);
        __CLR4_4_178p78plc8azsui.R.inc(9552);int month = iChronology.getMonthOfYear(instant, year);
        __CLR4_4_178p78plc8azsui.R.inc(9553);return iChronology.getYearMonthMillis(year, month);
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public long remainder(long instant) {try{__CLR4_4_178p78plc8azsui.R.inc(9554);
        __CLR4_4_178p78plc8azsui.R.inc(9555);return instant - roundFloor(instant);
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_178p78plc8azsui.R.inc(9556);
        __CLR4_4_178p78plc8azsui.R.inc(9557);return iChronology.monthOfYear();
    }finally{__CLR4_4_178p78plc8azsui.R.flushNeeded();}}
}
