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
package org.joda.time.tz;

import org.joda.time.DateTimeZone;

/**
 * Basic DateTimeZone implementation that has a fixed name key and offsets.
 * <p>
 * FixedDateTimeZone is thread-safe and immutable.
 * 
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class FixedDateTimeZone extends DateTimeZone {public static class __CLR4_4_1g1tg1tlc8azts9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,20840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = -3513011772763289092L;

    private final String iNameKey;
    private final int iWallOffset;
    private final int iStandardOffset;

    public FixedDateTimeZone(String id, String nameKey,
                             int wallOffset, int standardOffset) {
        super(id);__CLR4_4_1g1tg1tlc8azts9.R.inc(20802);try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20801);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20803);iNameKey = nameKey;
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20804);iWallOffset = wallOffset;
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20805);iStandardOffset = standardOffset;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public String getNameKey(long instant) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20806);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20807);return iNameKey;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public int getOffset(long instant) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20808);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20809);return iWallOffset;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public int getStandardOffset(long instant) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20810);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20811);return iStandardOffset;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public int getOffsetFromLocal(long instantLocal) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20812);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20813);return iWallOffset;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public boolean isFixed() {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20814);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20815);return true;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public long nextTransition(long instant) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20816);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20817);return instant;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public long previousTransition(long instant) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20818);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20819);return instant;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    /**
     * Override to return the correct timzone instance.
     * @since 1.5
     */
    public java.util.TimeZone toTimeZone() {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20820);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20821);String id = getID();
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20822);if ((((id.length() == 6 && (id.startsWith("+") || id.startsWith("-")))&&(__CLR4_4_1g1tg1tlc8azts9.R.iget(20823)!=0|true))||(__CLR4_4_1g1tg1tlc8azts9.R.iget(20824)==0&false))) {{
            // standard format offset [+-]hh:mm
            // our ID is without any prefix, so we need to add the GMT back
            __CLR4_4_1g1tg1tlc8azts9.R.inc(20825);return java.util.TimeZone.getTimeZone("GMT" + getID());
        }
        // unusual offset, so setup a SimpleTimeZone as best we can
        }__CLR4_4_1g1tg1tlc8azts9.R.inc(20826);return new java.util.SimpleTimeZone(iWallOffset, getID());
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20827);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20828);if ((((this == obj)&&(__CLR4_4_1g1tg1tlc8azts9.R.iget(20829)!=0|true))||(__CLR4_4_1g1tg1tlc8azts9.R.iget(20830)==0&false))) {{
            __CLR4_4_1g1tg1tlc8azts9.R.inc(20831);return true;
        }
        }__CLR4_4_1g1tg1tlc8azts9.R.inc(20832);if ((((obj instanceof FixedDateTimeZone)&&(__CLR4_4_1g1tg1tlc8azts9.R.iget(20833)!=0|true))||(__CLR4_4_1g1tg1tlc8azts9.R.iget(20834)==0&false))) {{
            __CLR4_4_1g1tg1tlc8azts9.R.inc(20835);FixedDateTimeZone other = (FixedDateTimeZone) obj;
            __CLR4_4_1g1tg1tlc8azts9.R.inc(20836);return
                getID().equals(other.getID()) &&
                iStandardOffset == other.iStandardOffset &&
                iWallOffset == other.iWallOffset;
        }
        }__CLR4_4_1g1tg1tlc8azts9.R.inc(20837);return false;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1g1tg1tlc8azts9.R.inc(20838);
        __CLR4_4_1g1tg1tlc8azts9.R.inc(20839);return getID().hashCode() + 37 * iStandardOffset + 31 * iWallOffset;
    }finally{__CLR4_4_1g1tg1tlc8azts9.R.flushNeeded();}}

}
