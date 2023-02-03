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
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/**
 * Provides time calculations for the week of the weekyear component of time.
 *
 * @author Guy Allard
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.1, refactored from GJWeekyearDateTimeField
 */
final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField {public static class __CLR4_4_17fs7fslc8azsv4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,9733,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @SuppressWarnings("unused")
    private static final long serialVersionUID = 6215066916806820644L;

    private static final long WEEK_53 = (53L - 1) * DateTimeConstants.MILLIS_PER_WEEK;

    private final BasicChronology iChronology;

    /**
     * Restricted constructor
     */
    BasicWeekyearDateTimeField(BasicChronology chronology) {
        super(DateTimeFieldType.weekyear(), chronology.getAverageMillisPerYear());__CLR4_4_17fs7fslc8azsv4.R.inc(9641);try{__CLR4_4_17fs7fslc8azsv4.R.inc(9640);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9642);iChronology = chronology;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public boolean isLenient() {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9643);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9644);return false;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    /**
     * Get the Year of a week based year component of the specified time instant.
     * 
     * @see org.joda.time.DateTimeField#get
     * @param instant  the time instant in millis to query.
     * @return the year extracted from the input.
     */
    public int get(long instant) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9645);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9646);return iChronology.getWeekyear(instant);
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    /**
     * Add the specified years to the specified time instant.
     * 
     * @see org.joda.time.DateTimeField#add
     * @param instant  the time instant in millis to update.
     * @param years  the years to add (can be negative).
     * @return the updated time instant.
     */
    public long add(long instant, int years) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9647);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9648);if ((((years == 0)&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9649)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9650)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9651);return instant;
        }
        }__CLR4_4_17fs7fslc8azsv4.R.inc(9652);return set(instant, get(instant) + years);
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public long add(long instant, long value) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9653);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9654);return add(instant, FieldUtils.safeToInt(value));
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    /**
     * Add to the year component of the specified time instant
     * wrapping around within that component if necessary.
     * 
     * @see org.joda.time.DateTimeField#addWrapField
     * @param instant  the time instant in millis to update.
     * @param years  the years to add (can be negative).
     * @return the updated time instant.
     */
    public long addWrapField(long instant, int years) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9655);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9656);return add(instant, years);
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9657);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9658);if ((((minuendInstant < subtrahendInstant)&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9659)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9660)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9661);return -getDifference(subtrahendInstant, minuendInstant);
        }

        }__CLR4_4_17fs7fslc8azsv4.R.inc(9662);int minuendWeekyear = get(minuendInstant);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9663);int subtrahendWeekyear = get(subtrahendInstant);

        __CLR4_4_17fs7fslc8azsv4.R.inc(9664);long minuendRem = remainder(minuendInstant);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9665);long subtrahendRem = remainder(subtrahendInstant);

        // Balance leap weekyear differences on remainders.
        __CLR4_4_17fs7fslc8azsv4.R.inc(9666);if ((((subtrahendRem >= WEEK_53 && iChronology.getWeeksInYear(minuendWeekyear) <= 52)&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9667)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9668)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9669);subtrahendRem -= DateTimeConstants.MILLIS_PER_WEEK;
        }

        }__CLR4_4_17fs7fslc8azsv4.R.inc(9670);int difference = minuendWeekyear - subtrahendWeekyear;
        __CLR4_4_17fs7fslc8azsv4.R.inc(9671);if ((((minuendRem < subtrahendRem)&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9672)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9673)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9674);difference--;
        }
        }__CLR4_4_17fs7fslc8azsv4.R.inc(9675);return difference;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    /**
     * Set the Year of a week based year component of the specified time instant.
     *
     * @see org.joda.time.DateTimeField#set
     * @param instant  the time instant in millis to update.
     * @param year  the year (-9999,9999) to set the date to.
     * @return the updated DateTime.
     * @throws IllegalArgumentException  if year is invalid.
     */
    public long set(long instant, int year) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9676);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9677);FieldUtils.verifyValueBounds(this, Math.abs(year),
                                     iChronology.getMinYear(), iChronology.getMaxYear());
        //
        // Do nothing if no real change is requested.
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9678);int thisWeekyear = get( instant );
        __CLR4_4_17fs7fslc8azsv4.R.inc(9679);if ( (((thisWeekyear == year )&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9680)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9681)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9682);return instant;
        }
        //
        // Calculate the DayOfWeek (to be preserved).
        //
        }__CLR4_4_17fs7fslc8azsv4.R.inc(9683);int thisDow = iChronology.getDayOfWeek(instant);
        //
        // Calculate the maximum weeks in the target year.
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9684);int weeksInFromYear = iChronology.getWeeksInYear( thisWeekyear );
        __CLR4_4_17fs7fslc8azsv4.R.inc(9685);int weeksInToYear = iChronology.getWeeksInYear( year );
        __CLR4_4_17fs7fslc8azsv4.R.inc(9686);int maxOutWeeks = ((((weeksInToYear < weeksInFromYear) )&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9687)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9688)==0&false))?
            weeksInToYear : weeksInFromYear;
        //
        // Get the current week of the year. This will be preserved in
        // the output unless it is greater than the maximum possible
        // for the target weekyear.  In that case it is adjusted
        // to the maximum possible.
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9689);int setToWeek = iChronology.getWeekOfWeekyear(instant);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9690);if ( (((setToWeek > maxOutWeeks )&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9691)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9692)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9693);setToWeek = maxOutWeeks;
        }
        //
        // Get a wroking copy of the current date-time.
        // This can be a convenience for debugging.
        //
        }__CLR4_4_17fs7fslc8azsv4.R.inc(9694);long workInstant = instant; // Get a copy
        //
        // Attempt to get close to the proper weekyear.
        // Note - we cannot currently call ourself, so we just call
        // set for the year.  This at least gets us close.
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9695);workInstant = iChronology.setYear( workInstant, year );
        //
        // Calculate the weekyear number for the get close to value
        // (which might not be equal to the year just set).
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9696);int workWoyYear = get( workInstant );

        //
        // At most we are off by one year, which can be "fixed" by
        // adding/subtracting a week.
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9697);if ( (((workWoyYear < year )&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9698)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9699)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9700);workInstant += DateTimeConstants.MILLIS_PER_WEEK;
        } }else {__CLR4_4_17fs7fslc8azsv4.R.inc(9701);if ( (((workWoyYear > year )&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9702)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9703)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9704);workInstant -= DateTimeConstants.MILLIS_PER_WEEK;
        }
        //
        // Set the proper week in the current weekyear.
        //

        // BEGIN: possible set WeekOfWeekyear logic.
        }}__CLR4_4_17fs7fslc8azsv4.R.inc(9705);int currentWoyWeek = iChronology.getWeekOfWeekyear(workInstant);
        // No range check required (we already know it is OK).
        __CLR4_4_17fs7fslc8azsv4.R.inc(9706);workInstant = workInstant + (setToWeek - currentWoyWeek)
            * (long)DateTimeConstants.MILLIS_PER_WEEK;
        // END: possible set WeekOfWeekyear logic.

        //
        // Reset DayOfWeek to previous value.
        //
        // Note: This works fine, but it ideally shouldn't invoke other
        // fields from within a field.
        __CLR4_4_17fs7fslc8azsv4.R.inc(9707);workInstant = iChronology.dayOfWeek().set( workInstant, thisDow );
        //
        // Return result.
        //
        __CLR4_4_17fs7fslc8azsv4.R.inc(9708);return workInstant;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9709);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9710);return null;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public boolean isLeap(long instant) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9711);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9712);return iChronology.getWeeksInYear(iChronology.getWeekyear(instant)) > 52;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public int getLeapAmount(long instant) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9713);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9714);return iChronology.getWeeksInYear(iChronology.getWeekyear(instant)) - 52;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9715);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9716);return iChronology.weeks();
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9717);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9718);return iChronology.getMinYear();
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9719);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9720);return iChronology.getMaxYear();
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public long roundFloor(long instant) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9721);
        // Note: This works fine, but it ideally shouldn't invoke other
        // fields from within a field.
        __CLR4_4_17fs7fslc8azsv4.R.inc(9722);instant = iChronology.weekOfWeekyear().roundFloor(instant);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9723);int wow = iChronology.getWeekOfWeekyear(instant);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9724);if ((((wow > 1)&&(__CLR4_4_17fs7fslc8azsv4.R.iget(9725)!=0|true))||(__CLR4_4_17fs7fslc8azsv4.R.iget(9726)==0&false))) {{
            __CLR4_4_17fs7fslc8azsv4.R.inc(9727);instant -= ((long) DateTimeConstants.MILLIS_PER_WEEK) * (wow - 1);
        }
        }__CLR4_4_17fs7fslc8azsv4.R.inc(9728);return instant;
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    public long remainder(long instant) {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9729);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9730);return instant - roundFloor(instant);
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}

    /**
     * Serialization singleton
     */
    private Object readResolve() {try{__CLR4_4_17fs7fslc8azsv4.R.inc(9731);
        __CLR4_4_17fs7fslc8azsv4.R.inc(9732);return iChronology.weekyear();
    }finally{__CLR4_4_17fs7fslc8azsv4.R.flushNeeded();}}
}
