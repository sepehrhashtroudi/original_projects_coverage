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
package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/**
 * ReadablePeriodConverter extracts milliseconds and chronology from a ReadablePeriod.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
class ReadablePeriodConverter extends AbstractConverter
        implements PeriodConverter {public static class __CLR4_4_19yn9ynlc8azt4k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final ReadablePeriodConverter INSTANCE = new ReadablePeriodConverter();

    /**
     * Restricted constructor.
     */
    protected ReadablePeriodConverter() {
        super();__CLR4_4_19yn9ynlc8azt4k.R.inc(12912);try{__CLR4_4_19yn9ynlc8azt4k.R.inc(12911);
    }finally{__CLR4_4_19yn9ynlc8azt4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Extracts duration values from an object of this converter's type, and
     * sets them into the given ReadWritablePeriod.
     *
     * @param duration duration to get modified
     * @param object  the object to convert, must not be null
     * @param chrono  the chronology to use
     * @throws NullPointerException if the duration or object is null
     * @throws ClassCastException if the object is an invalid type
     * @throws IllegalArgumentException if the object is invalid
     */
    public void setInto(ReadWritablePeriod duration, Object object, Chronology chrono) {try{__CLR4_4_19yn9ynlc8azt4k.R.inc(12913);
        __CLR4_4_19yn9ynlc8azt4k.R.inc(12914);duration.setPeriod((ReadablePeriod) object);
    }finally{__CLR4_4_19yn9ynlc8azt4k.R.flushNeeded();}}

    /**
     * Selects a suitable period type for the given object.
     *
     * @param object  the object to examine, must not be null
     * @return the period type from the readable duration
     * @throws NullPointerException if the object is null
     * @throws ClassCastException if the object is an invalid type
     */
    public PeriodType getPeriodType(Object object) {try{__CLR4_4_19yn9ynlc8azt4k.R.inc(12915);
        __CLR4_4_19yn9ynlc8azt4k.R.inc(12916);ReadablePeriod period = (ReadablePeriod) object;
        __CLR4_4_19yn9ynlc8azt4k.R.inc(12917);return period.getPeriodType();
    }finally{__CLR4_4_19yn9ynlc8azt4k.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns ReadablePeriod class.
     * 
     * @return ReadablePeriod.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_19yn9ynlc8azt4k.R.inc(12918);
        __CLR4_4_19yn9ynlc8azt4k.R.inc(12919);return ReadablePeriod.class;
    }finally{__CLR4_4_19yn9ynlc8azt4k.R.flushNeeded();}}

}
