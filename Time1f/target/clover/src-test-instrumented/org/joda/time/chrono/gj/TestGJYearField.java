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
class TestGJYearField extends TestGJDateTimeField {static class __CLR4_4_115ak15aklc8azwu9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,53546,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public TestGJYearField(TestGJChronology chrono) {
        super(DateTimeFieldType.year(), chrono.millisPerYear(), chrono);__CLR4_4_115ak15aklc8azwu9.R.inc(53517);try{__CLR4_4_115ak15aklc8azwu9.R.inc(53516);
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public int get(long millis) {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53518);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53519);return iChronology.gjYearFromMillis(millis);
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public long set(long millis, int value) {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53520);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53521);int[] ymd = iChronology.gjFromMillis(millis);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53522);millis = iChronology.getTimeOnlyMillis(millis)
            + iChronology.millisFromGJ(value, ymd[1], ymd[2]);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53523);if ((((ymd[1] == 2 && ymd[2] == 29 && !iChronology.isLeapYear(value))&&(__CLR4_4_115ak15aklc8azwu9.R.iget(53524)!=0|true))||(__CLR4_4_115ak15aklc8azwu9.R.iget(53525)==0&false))) {{
            __CLR4_4_115ak15aklc8azwu9.R.inc(53526);millis = iChronology.dayOfYear().add(millis, -1);
        }
        }__CLR4_4_115ak15aklc8azwu9.R.inc(53527);return millis;
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public long add(long millis, long value) {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53528);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53529);return set(millis, (int)(get(millis) + value));
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public boolean isLeap(long millis) {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53530);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53531);return iChronology.isLeapYear(get(millis));
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public int getLeapAmount(long millis) {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53532);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53533);return (((isLeap(millis) )&&(__CLR4_4_115ak15aklc8azwu9.R.iget(53534)!=0|true))||(__CLR4_4_115ak15aklc8azwu9.R.iget(53535)==0&false))? 1 : 0;
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public DurationField getLeapDurationField() {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53536);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53537);return iChronology.days();
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53538);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53539);return null;
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53540);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53541);return -100000000;
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53542);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53543);return 100000000;
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}

    public long roundFloor(long millis) {try{__CLR4_4_115ak15aklc8azwu9.R.inc(53544);
        __CLR4_4_115ak15aklc8azwu9.R.inc(53545);return iChronology.millisFromGJ(get(millis), 1, 1);
    }finally{__CLR4_4_115ak15aklc8azwu9.R.flushNeeded();}}
}
