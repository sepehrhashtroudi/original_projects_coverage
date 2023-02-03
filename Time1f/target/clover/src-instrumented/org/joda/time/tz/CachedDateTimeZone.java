/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2012 Stephen Colebourne
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
 * Improves the performance of requesting time zone offsets and name keys by
 * caching the results. Time zones that have simple rules or are fixed should
 * not be cached, as it is unlikely to improve performance.
 * <p>
 * CachedDateTimeZone is thread-safe and immutable.
 * 
 * @author Brian S O'Neill
 * @since 1.0
 */
public class CachedDateTimeZone extends DateTimeZone {public static class __CLR4_4_1f3xf3xlc8aztp0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,19694,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 5472298452022250685L;

    private static final int cInfoCacheMask;

    static {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19581);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19582);Integer i;
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19583);try {
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19584);i = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException e) {
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19585);i = null;
        }

        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19586);int cacheSize;
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19587);if ((((i == null)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19588)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19589)==0&false))) {{
            // With a cache size of 512, dates that lie within any 69.7 year
            // period have no cache collisions.
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19590);cacheSize = 512; // (1 << 9)
        } }else {{
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19591);cacheSize = i.intValue();
            // Ensure cache size is even power of 2.
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19592);cacheSize--;
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19593);int shift = 0;
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19594);while ((((cacheSize > 0)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19595)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19596)==0&false))) {{
                __CLR4_4_1f3xf3xlc8aztp0.R.inc(19597);shift++;
                __CLR4_4_1f3xf3xlc8aztp0.R.inc(19598);cacheSize >>= 1;
            }
            }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19599);cacheSize = 1 << shift;
        }

        }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19600);cInfoCacheMask = cacheSize - 1;
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    /**
     * Returns a new CachedDateTimeZone unless given zone is already cached.
     */
    public static CachedDateTimeZone forZone(DateTimeZone zone) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19601);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19602);if ((((zone instanceof CachedDateTimeZone)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19603)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19604)==0&false))) {{
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19605);return (CachedDateTimeZone)zone;
        }
        }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19606);return new CachedDateTimeZone(zone);
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    /*
     * Caching is performed by breaking timeline down into periods of 2^32
     * milliseconds, or about 49.7 days. A year has about 7.3 periods, usually
     * with only 2 time zone offset periods. Most of the 49.7 day periods will
     * have no transition, about one quarter have one transition, and very rare
     * cases have multiple transitions.
     */

    private final DateTimeZone iZone;

    private final transient Info[] iInfoCache = new Info[cInfoCacheMask + 1];

    private CachedDateTimeZone(DateTimeZone zone) {
        super(zone.getID());__CLR4_4_1f3xf3xlc8aztp0.R.inc(19608);try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19607);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19609);iZone = zone;
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    /**
     * Returns the DateTimeZone being wrapped.
     */
    public DateTimeZone getUncachedZone() {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19610);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19611);return iZone;
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public String getNameKey(long instant) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19612);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19613);return getInfo(instant).getNameKey(instant);
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public int getOffset(long instant) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19614);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19615);return getInfo(instant).getOffset(instant);
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public int getStandardOffset(long instant) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19616);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19617);return getInfo(instant).getStandardOffset(instant);
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public boolean isFixed() {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19618);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19619);return iZone.isFixed();
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public long nextTransition(long instant) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19620);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19621);return iZone.nextTransition(instant);
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public long previousTransition(long instant) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19622);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19623);return iZone.previousTransition(instant);
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19624);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19625);return iZone.hashCode();
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19626);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19627);if ((((this == obj)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19628)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19629)==0&false))) {{
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19630);return true;
        }
        }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19631);if ((((obj instanceof CachedDateTimeZone)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19632)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19633)==0&false))) {{
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19634);return iZone.equals(((CachedDateTimeZone)obj).iZone);
        }
        }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19635);return false;
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    // Although accessed by multiple threads, this method doesn't need to be
    // synchronized.

    private Info getInfo(long millis) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19636);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19637);int period = (int)(millis >> 32);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19638);Info[] cache = iInfoCache;
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19639);int index = period & cInfoCacheMask;
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19640);Info info = cache[index];
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19641);if ((((info == null || (int)((info.iPeriodStart >> 32)) != period)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19642)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19643)==0&false))) {{
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19644);info = createInfo(millis);
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19645);cache[index] = info;
        }
        }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19646);return info;
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    private Info createInfo(long millis) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19647);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19648);long periodStart = millis & (0xffffffffL << 32);
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19649);Info info = new Info(iZone, periodStart);
        
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19650);long end = periodStart | 0xffffffffL;
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19651);Info chain = info;
        __CLR4_4_1f3xf3xlc8aztp0.R.inc(19652);while (true) {{
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19653);long next = iZone.nextTransition(periodStart);
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19654);if ((((next == periodStart || next > end)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19655)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19656)==0&false))) {{
                __CLR4_4_1f3xf3xlc8aztp0.R.inc(19657);break;
            }
            }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19658);periodStart = next;
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19659);chain = (chain.iNextInfo = new Info(iZone, periodStart));
        }

        }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19660);return info;
    }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

    private final static class Info {
        // For first Info in chain, iPeriodStart's lower 32 bits are clear.
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;

        Info iNextInfo;

        private String iNameKey;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        Info(DateTimeZone zone, long periodStart) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19661);
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19662);iPeriodStart = periodStart;
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19663);iZoneRef = zone;
        }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

        public String getNameKey(long millis) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19664);
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19665);if ((((iNextInfo == null || millis < iNextInfo.iPeriodStart)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19666)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19667)==0&false))) {{
                __CLR4_4_1f3xf3xlc8aztp0.R.inc(19668);if ((((iNameKey == null)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19669)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19670)==0&false))) {{
                    __CLR4_4_1f3xf3xlc8aztp0.R.inc(19671);iNameKey = iZoneRef.getNameKey(iPeriodStart);
                }
                }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19672);return iNameKey;
            }
            }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19673);return iNextInfo.getNameKey(millis);
        }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

        public int getOffset(long millis) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19674);
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19675);if ((((iNextInfo == null || millis < iNextInfo.iPeriodStart)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19676)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19677)==0&false))) {{
                __CLR4_4_1f3xf3xlc8aztp0.R.inc(19678);if ((((iOffset == Integer.MIN_VALUE)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19679)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19680)==0&false))) {{
                    __CLR4_4_1f3xf3xlc8aztp0.R.inc(19681);iOffset = iZoneRef.getOffset(iPeriodStart);
                }
                }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19682);return iOffset;
            }
            }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19683);return iNextInfo.getOffset(millis);
        }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}

        public int getStandardOffset(long millis) {try{__CLR4_4_1f3xf3xlc8aztp0.R.inc(19684);
            __CLR4_4_1f3xf3xlc8aztp0.R.inc(19685);if ((((iNextInfo == null || millis < iNextInfo.iPeriodStart)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19686)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19687)==0&false))) {{
                __CLR4_4_1f3xf3xlc8aztp0.R.inc(19688);if ((((iStandardOffset == Integer.MIN_VALUE)&&(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19689)!=0|true))||(__CLR4_4_1f3xf3xlc8aztp0.R.iget(19690)==0&false))) {{
                    __CLR4_4_1f3xf3xlc8aztp0.R.inc(19691);iStandardOffset = iZoneRef.getStandardOffset(iPeriodStart);
                }
                }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19692);return iStandardOffset;
            }
            }__CLR4_4_1f3xf3xlc8aztp0.R.inc(19693);return iNextInfo.getStandardOffset(millis);
        }finally{__CLR4_4_1f3xf3xlc8aztp0.R.flushNeeded();}}
    }
}
