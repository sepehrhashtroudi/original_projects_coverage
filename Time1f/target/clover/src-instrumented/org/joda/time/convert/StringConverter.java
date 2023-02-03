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
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/**
 * StringConverter converts from a String to an instant, partial,
 * duration, period or interval..
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
class StringConverter extends AbstractConverter
        implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {public static class __CLR4_4_19yw9ywlc8azt4w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,13058,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance.
     */
    static final StringConverter INSTANCE = new StringConverter();

    /**
     * Restricted constructor.
     */
    protected StringConverter() {
        super();__CLR4_4_19yw9ywlc8azt4w.R.inc(12921);try{__CLR4_4_19yw9ywlc8azt4w.R.inc(12920);
    }finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the millis, which is the ISO parsed string value.
     * 
     * @param object  the String to convert, must not be null
     * @param chrono  the chronology to use, non-null result of getChronology
     * @return the millisecond value
     * @throws IllegalArgumentException if the value if invalid
     */
    public long getInstantMillis(Object object, Chronology chrono) {try{__CLR4_4_19yw9ywlc8azt4w.R.inc(12922);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12923);String str = (String) object;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12924);DateTimeFormatter p = ISODateTimeFormat.dateTimeParser();
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12925);return p.withChronology(chrono).parseMillis(str);
    }finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

    /**
     * Extracts the values of the partial from an object of this converter's type.
     * This method checks if the parser has a zone, and uses it if present.
     * This is most useful for parsing local times with UTC.
     * 
     * @param fieldSource  a partial that provides access to the fields.
     *  This partial may be incomplete and only getFieldType(int) should be used
     * @param object  the object to convert
     * @param chrono  the chronology to use, which is the non-null result of getChronology()
     * @param parser the parser to use, may be null
     * @return the array of field values that match the fieldSource, must be non-null valid
     * @throws ClassCastException if the object is invalid
     * @throws IllegalArgumentException if the value if invalid
     * @since 1.3
     */
    public int[] getPartialValues(ReadablePartial fieldSource, Object object, Chronology chrono, DateTimeFormatter parser) {try{__CLR4_4_19yw9ywlc8azt4w.R.inc(12926);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12927);if ((((parser.getZone() != null)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12928)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12929)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12930);chrono = chrono.withZone(parser.getZone());
        }
        }__CLR4_4_19yw9ywlc8azt4w.R.inc(12931);long millis = parser.withChronology(chrono).parseMillis((String) object);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12932);return chrono.get(fieldSource, millis);
    }finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the duration of the string using the standard type.
     * This matches the toString() method of ReadableDuration.
     * 
     * @param object  the String to convert, must not be null
     * @throws ClassCastException if the object is invalid
     */
    public long getDurationMillis(Object object) {try{__CLR4_4_19yw9ywlc8azt4w.R.inc(12933);
        // parse here because duration could be bigger than the int supported
        // by the period parser
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12934);String original = (String) object;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12935);String str = original;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12936);int len = str.length();
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12937);if ((((len >= 4 &&
            (str.charAt(0) == 'P' || str.charAt(0) == 'p') &&
            (str.charAt(1) == 'T' || str.charAt(1) == 't') &&
            (str.charAt(len - 1) == 'S' || str.charAt(len - 1) == 's'))&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12938)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12939)==0&false))) {{
            // ok
        } }else {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12940);throw new IllegalArgumentException("Invalid format: \"" + original + '"');
        }
        }__CLR4_4_19yw9ywlc8azt4w.R.inc(12941);str = str.substring(2, len - 1);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12942);int dot = -1;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12943);boolean negative = false;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12944);for (int i = 0; (((i < str.length())&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12945)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12946)==0&false)); i++) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12947);if ((((str.charAt(i) >= '0' && str.charAt(i) <= '9')&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12948)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12949)==0&false))) {{
                // ok
            } }else {__CLR4_4_19yw9ywlc8azt4w.R.inc(12950);if ((((i == 0 && str.charAt(0) == '-')&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12951)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12952)==0&false))) {{
            	// ok
            	__CLR4_4_19yw9ywlc8azt4w.R.inc(12953);negative = true;
            } }else {__CLR4_4_19yw9ywlc8azt4w.R.inc(12954);if ((((i > ((((negative )&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12955)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12956)==0&false))? 1 : 0) && str.charAt(i) == '.' && dot == -1)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12957)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12958)==0&false))) {{
                // ok
                __CLR4_4_19yw9ywlc8azt4w.R.inc(12959);dot = i;
            } }else {{
                __CLR4_4_19yw9ywlc8azt4w.R.inc(12960);throw new IllegalArgumentException("Invalid format: \"" + original + '"');
            }
        }}}}
        }__CLR4_4_19yw9ywlc8azt4w.R.inc(12961);long millis = 0, seconds = 0;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12962);int firstDigit = (((negative )&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12963)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12964)==0&false))? 1 : 0;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12965);if ((((dot > 0)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12966)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12967)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12968);seconds = Long.parseLong(str.substring(firstDigit, dot));
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12969);str = str.substring(dot + 1);
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12970);if ((((str.length() != 3)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12971)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12972)==0&false))) {{
                __CLR4_4_19yw9ywlc8azt4w.R.inc(12973);str = (str + "000").substring(0, 3);
            }
            }__CLR4_4_19yw9ywlc8azt4w.R.inc(12974);millis = Integer.parseInt(str);
        } }else {__CLR4_4_19yw9ywlc8azt4w.R.inc(12975);if ((((negative)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12976)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12977)==0&false))) {{
        	__CLR4_4_19yw9ywlc8azt4w.R.inc(12978);seconds = Long.parseLong(str.substring(firstDigit, str.length()));
        } }else {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12979);seconds = Long.parseLong(str);
        }
        }}__CLR4_4_19yw9ywlc8azt4w.R.inc(12980);if ((((negative)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12981)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12982)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12983);return FieldUtils.safeAdd(FieldUtils.safeMultiply(-seconds, 1000), -millis);
        } }else {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12984);return FieldUtils.safeAdd(FieldUtils.safeMultiply(seconds, 1000), millis);
        }
    }}finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Extracts duration values from an object of this converter's type, and
     * sets them into the given ReadWritableDuration.
     *
     * @param period  period to get modified
     * @param object  the String to convert, must not be null
     * @param chrono  the chronology to use
     * @return the millisecond duration
     * @throws ClassCastException if the object is invalid
     */
    public void setInto(ReadWritablePeriod period, Object object, Chronology chrono) {try{__CLR4_4_19yw9ywlc8azt4w.R.inc(12985);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12986);String str = (String) object;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12987);PeriodFormatter parser = ISOPeriodFormat.standard();
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12988);period.clear();
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12989);int pos = parser.parseInto(period, str, 0);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12990);if ((((pos < str.length())&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12991)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12992)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(12993);if ((((pos < 0)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(12994)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(12995)==0&false))) {{
                // Parse again to get a better exception thrown.
                __CLR4_4_19yw9ywlc8azt4w.R.inc(12996);parser.withParseType(period.getPeriodType()).parseMutablePeriod(str);
            }
            }__CLR4_4_19yw9ywlc8azt4w.R.inc(12997);throw new IllegalArgumentException("Invalid format: \"" + str + '"');
        }
    }}finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Sets the value of the mutable interval from the string.
     * 
     * @param writableInterval  the interval to set
     * @param object  the String to convert, must not be null
     * @param chrono  the chronology to use, may be null
     */
    public void setInto(ReadWritableInterval writableInterval, Object object, Chronology chrono) {try{__CLR4_4_19yw9ywlc8azt4w.R.inc(12998);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(12999);String str = (String) object;

        __CLR4_4_19yw9ywlc8azt4w.R.inc(13000);int separator = str.indexOf('/');
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13001);if ((((separator < 0)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13002)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13003)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13004);throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }

        }__CLR4_4_19yw9ywlc8azt4w.R.inc(13005);String leftStr = str.substring(0, separator);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13006);if ((((leftStr.length() <= 0)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13007)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13008)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13009);throw new IllegalArgumentException("Format invalid: " + str);
        }
        }__CLR4_4_19yw9ywlc8azt4w.R.inc(13010);String rightStr = str.substring(separator + 1);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13011);if ((((rightStr.length() <= 0)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13012)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13013)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13014);throw new IllegalArgumentException("Format invalid: " + str);
        }

        }__CLR4_4_19yw9ywlc8azt4w.R.inc(13015);DateTimeFormatter dateTimeParser = ISODateTimeFormat.dateTimeParser();
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13016);dateTimeParser = dateTimeParser.withChronology(chrono);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13017);PeriodFormatter periodParser = ISOPeriodFormat.standard();
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13018);long startInstant = 0, endInstant = 0;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13019);Period period = null;
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13020);Chronology parsedChrono = null;
        
        // before slash
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13021);char c = leftStr.charAt(0);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13022);if ((((c == 'P' || c == 'p')&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13023)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13024)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13025);period = periodParser.withParseType(getPeriodType(leftStr)).parsePeriod(leftStr);
        } }else {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13026);DateTime start = dateTimeParser.parseDateTime(leftStr);
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13027);startInstant = start.getMillis();
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13028);parsedChrono = start.getChronology();
        }
        
        // after slash
        }__CLR4_4_19yw9ywlc8azt4w.R.inc(13029);c = rightStr.charAt(0);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13030);if ((((c == 'P' || c == 'p')&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13031)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13032)==0&false))) {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13033);if ((((period != null)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13034)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13035)==0&false))) {{
                __CLR4_4_19yw9ywlc8azt4w.R.inc(13036);throw new IllegalArgumentException("Interval composed of two durations: " + str);
            }
            }__CLR4_4_19yw9ywlc8azt4w.R.inc(13037);period = periodParser.withParseType(getPeriodType(rightStr)).parsePeriod(rightStr);
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13038);chrono = ((((chrono != null )&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13039)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13040)==0&false))? chrono : parsedChrono);
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13041);endInstant = chrono.add(period, startInstant, 1);
        } }else {{
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13042);DateTime end = dateTimeParser.parseDateTime(rightStr);
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13043);endInstant = end.getMillis();
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13044);parsedChrono = ((((parsedChrono != null )&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13045)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13046)==0&false))? parsedChrono : end.getChronology());
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13047);chrono = ((((chrono != null )&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13048)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13049)==0&false))? chrono : parsedChrono);
            __CLR4_4_19yw9ywlc8azt4w.R.inc(13050);if ((((period != null)&&(__CLR4_4_19yw9ywlc8azt4w.R.iget(13051)!=0|true))||(__CLR4_4_19yw9ywlc8azt4w.R.iget(13052)==0&false))) {{
                __CLR4_4_19yw9ywlc8azt4w.R.inc(13053);startInstant = chrono.add(period, endInstant, -1);
            }
        }}
        
        }__CLR4_4_19yw9ywlc8azt4w.R.inc(13054);writableInterval.setInterval(startInstant, endInstant);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13055);writableInterval.setChronology(chrono);
    }finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns String.class.
     * 
     * @return String.class
     */
    public Class<?> getSupportedType() {try{__CLR4_4_19yw9ywlc8azt4w.R.inc(13056);
        __CLR4_4_19yw9ywlc8azt4w.R.inc(13057);return String.class;
    }finally{__CLR4_4_19yw9ywlc8azt4w.R.flushNeeded();}}

}
