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
package org.joda.time.chrono.gj;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/**
 * 
 * @author Brian S O'Neill
 */
class TestGJMonthOfYearField extends TestGJDateTimeField {static class __CLR4_4_1157q157qlc8azwtu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,53461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public TestGJMonthOfYearField(TestGJChronology chrono) {
        super(DateTimeFieldType.monthOfYear(), chrono.millisPerMonth(), chrono);__CLR4_4_1157q157qlc8azwtu.R.inc(53415);try{__CLR4_4_1157q157qlc8azwtu.R.inc(53414);
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public int get(long millis) {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53416);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53417);return iChronology.gjFromMillis(millis)[1];
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public long set(long millis, int value) {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53418);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53419);long timeOnlyMillis = iChronology.getTimeOnlyMillis(millis);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53420);int[] ymd = iChronology.gjFromMillis(millis);
        // First set to start of month...
        __CLR4_4_1157q157qlc8azwtu.R.inc(53421);millis = iChronology.millisFromGJ(ymd[0], value, 1);
        // ...and use dayOfMonth field to check range.
        __CLR4_4_1157q157qlc8azwtu.R.inc(53422);int maxDay = iChronology.dayOfMonth().getMaximumValue(millis);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53423);if ((((ymd[2] > maxDay)&&(__CLR4_4_1157q157qlc8azwtu.R.iget(53424)!=0|true))||(__CLR4_4_1157q157qlc8azwtu.R.iget(53425)==0&false))) {{
            __CLR4_4_1157q157qlc8azwtu.R.inc(53426);ymd[2] = maxDay;
        }
        }__CLR4_4_1157q157qlc8azwtu.R.inc(53427);return timeOnlyMillis + iChronology.millisFromGJ(ymd[0], value, ymd[2]);
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public long add(long millis, long value) {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53428);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53429);int newYear = iChronology.year().get(millis)
            + (int)TestGJChronology.div(value, 12);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53430);int newMonth = get(millis) + (int)TestGJChronology.mod(value, 12);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53431);if ((((newMonth > 12)&&(__CLR4_4_1157q157qlc8azwtu.R.iget(53432)!=0|true))||(__CLR4_4_1157q157qlc8azwtu.R.iget(53433)==0&false))) {{
            __CLR4_4_1157q157qlc8azwtu.R.inc(53434);newYear++;
            __CLR4_4_1157q157qlc8azwtu.R.inc(53435);newMonth -= 12;
        }
        }__CLR4_4_1157q157qlc8azwtu.R.inc(53436);int newDay = iChronology.dayOfMonth().get(millis);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53437);millis = iChronology.getTimeOnlyMillis(millis) 
            + iChronology.millisFromGJ(newYear, newMonth, newDay);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53438);while ((((get(millis) != newMonth)&&(__CLR4_4_1157q157qlc8azwtu.R.iget(53439)!=0|true))||(__CLR4_4_1157q157qlc8azwtu.R.iget(53440)==0&false))) {{
            __CLR4_4_1157q157qlc8azwtu.R.inc(53441);millis = iChronology.dayOfYear().add(millis, -1);
        }
        }__CLR4_4_1157q157qlc8azwtu.R.inc(53442);return millis;
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public boolean isLeap(long millis) {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53443);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53444);int[] ymd = iChronology.gjFromMillis(millis);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53445);return ymd[1] == 2 && iChronology.isLeapYear(ymd[0]);
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public int getLeapAmount(long millis) {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53446);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53447);return (((isLeap(millis) )&&(__CLR4_4_1157q157qlc8azwtu.R.iget(53448)!=0|true))||(__CLR4_4_1157q157qlc8azwtu.R.iget(53449)==0&false))? 1 : 0;
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53450);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53451);return iChronology.days();
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53452);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53453);return iChronology.years();
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53454);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53455);return 1;
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53456);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53457);return 12;
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}

    public long roundFloor(long millis) {try{__CLR4_4_1157q157qlc8azwtu.R.inc(53458);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53459);int[] ymd = iChronology.gjFromMillis(millis);
        __CLR4_4_1157q157qlc8azwtu.R.inc(53460);return iChronology.millisFromGJ(ymd[0], ymd[1], 1);
    }finally{__CLR4_4_1157q157qlc8azwtu.R.flushNeeded();}}
}
