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
package org.joda.time;

import java.io.Serializable;

/**
 * Identifies a duration field, such as years or minutes, in a chronology-neutral way.
 * <p>
 * A duration field type defines the type of the field, such as hours.
 * If does not directly enable any calculations, however it does provide a
 * {@link #getField(Chronology)} method that returns the actual calculation engine
 * for a particular chronology.
 * <p>
 * Instances of <code>DurationFieldType</code> are singletons.
 * They can be compared using <code>==</code>.
 * <p>
 * If required, you can create your own field, for example a quarters.
 * You must create a subclass of <code>DurationFieldType</code> that defines the field type.
 * This class returns the actual calculation engine from {@link #getField(Chronology)}.
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class DurationFieldType implements Serializable {public static class __CLR4_4_11hj1hjlc8azrw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,2032,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 8765135187319L;

    // Ordinals for standard field types.
    static final byte
        ERAS = 1,
        CENTURIES = 2,
        WEEKYEARS = 3,
        YEARS = 4,
        MONTHS = 5,
        WEEKS = 6,
        DAYS = 7,
        HALFDAYS = 8,
        HOURS = 9,
        MINUTES = 10,
        SECONDS = 11,
        MILLIS = 12;

    /** The eras field type. */
    static final DurationFieldType ERAS_TYPE = new StandardDurationFieldType("eras", ERAS);
    /** The centuries field type. */
    static final DurationFieldType CENTURIES_TYPE = new StandardDurationFieldType("centuries", CENTURIES);
    /** The weekyears field type. */
    static final DurationFieldType WEEKYEARS_TYPE = new StandardDurationFieldType("weekyears", WEEKYEARS);
    /** The years field type. */
    static final DurationFieldType YEARS_TYPE = new StandardDurationFieldType("years", YEARS);
    /** The months field type. */
    static final DurationFieldType MONTHS_TYPE = new StandardDurationFieldType("months", MONTHS);
    /** The weeks field type. */
    static final DurationFieldType WEEKS_TYPE = new StandardDurationFieldType("weeks", WEEKS);
    /** The days field type. */
    static final DurationFieldType DAYS_TYPE = new StandardDurationFieldType("days", DAYS);
    /** The halfdays field type. */
    static final DurationFieldType HALFDAYS_TYPE = new StandardDurationFieldType("halfdays", HALFDAYS);
    /** The hours field type. */
    static final DurationFieldType HOURS_TYPE = new StandardDurationFieldType("hours", HOURS);
    /** The minutes field type. */
    static final DurationFieldType MINUTES_TYPE = new StandardDurationFieldType("minutes", MINUTES);
    /** The seconds field type. */
    static final DurationFieldType SECONDS_TYPE = new StandardDurationFieldType("seconds", SECONDS);
    /** The millis field type. */
    static final DurationFieldType MILLIS_TYPE = new StandardDurationFieldType("millis", MILLIS);

    /** The name of the field type. */
    private final String iName;

    //-----------------------------------------------------------------------
    /**
     * Constructor.
     * 
     * @param name  the name to use, which by convention, are plural.
     */
    protected DurationFieldType(String name) {
        super();__CLR4_4_11hj1hjlc8azrw6.R.inc(1928);try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1927);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1929);iName = name;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the millis field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType millis() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1930);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1931);return MILLIS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the seconds field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType seconds() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1932);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1933);return SECONDS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the minutes field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType minutes() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1934);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1935);return MINUTES_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the hours field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType hours() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1936);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1937);return HOURS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the halfdays field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType halfdays() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1938);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1939);return HALFDAYS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the days field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType days() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1940);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1941);return DAYS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the weeks field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType weeks() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1942);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1943);return WEEKS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the weekyears field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType weekyears() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1944);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1945);return WEEKYEARS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the months field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType months() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1946);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1947);return MONTHS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the years field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType years() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1948);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1949);return YEARS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the centuries field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType centuries() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1950);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1951);return CENTURIES_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get the eras field type.
     * 
     * @return the DateTimeFieldType constant
     */
    public static DurationFieldType eras() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1952);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1953);return ERAS_TYPE;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Get the name of the field.
     * By convention, names are plural.
     * 
     * @return field name
     */
    public String getName() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1954);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1955);return iName;
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Gets a suitable field for this type from the given Chronology.
     *
     * @param chronology  the chronology to use, null means ISOChronology in default zone
     * @return a suitable field
     */
    public abstract DurationField getField(Chronology chronology);

    /**
     * Checks whether this field supported in the given Chronology.
     *
     * @param chronology  the chronology to use, null means ISOChronology in default zone
     * @return true if supported
     */
    public boolean isSupported(Chronology chronology) {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1956);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1957);return getField(chronology).isSupported();
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    /**
     * Get a suitable debug string.
     * 
     * @return debug string
     */
    public String toString() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1958);
        __CLR4_4_11hj1hjlc8azrw6.R.inc(1959);return getName();
    }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

    private static class StandardDurationFieldType extends DurationFieldType {
        /** Serialization version */
        private static final long serialVersionUID = 31156755687123L;

        /** The ordinal of the standard field type, for switch statements */
        private final byte iOrdinal;

        /**
         * Constructor.
         * 
         * @param name  the name to use
         */
        StandardDurationFieldType(String name, byte ordinal) {
            super(name);__CLR4_4_11hj1hjlc8azrw6.R.inc(1961);try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1960);
            __CLR4_4_11hj1hjlc8azrw6.R.inc(1962);iOrdinal = ordinal;
        }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

        /** @inheritdoc */
        @Override
        public boolean equals(Object obj) {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1963);
            __CLR4_4_11hj1hjlc8azrw6.R.inc(1964);if ((((this == obj)&&(__CLR4_4_11hj1hjlc8azrw6.R.iget(1965)!=0|true))||(__CLR4_4_11hj1hjlc8azrw6.R.iget(1966)==0&false))) {{
                __CLR4_4_11hj1hjlc8azrw6.R.inc(1967);return true;
            }
            }__CLR4_4_11hj1hjlc8azrw6.R.inc(1968);if ((((obj instanceof StandardDurationFieldType)&&(__CLR4_4_11hj1hjlc8azrw6.R.iget(1969)!=0|true))||(__CLR4_4_11hj1hjlc8azrw6.R.iget(1970)==0&false))) {{
                __CLR4_4_11hj1hjlc8azrw6.R.inc(1971);return iOrdinal == ((StandardDurationFieldType) obj).iOrdinal;
            }
            }__CLR4_4_11hj1hjlc8azrw6.R.inc(1972);return false;
        }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

        /** @inheritdoc */
        @Override
        public int hashCode() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1973);
            __CLR4_4_11hj1hjlc8azrw6.R.inc(1974);return (1 << iOrdinal);
        }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

        public DurationField getField(Chronology chronology) {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(1975);
            __CLR4_4_11hj1hjlc8azrw6.R.inc(1976);chronology = DateTimeUtils.getChronology(chronology);
            
            boolean __CLB4_4_1_bool0=false;__CLR4_4_11hj1hjlc8azrw6.R.inc(1977);switch (iOrdinal) {
                case ERAS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1978);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1979);return chronology.eras();
                case CENTURIES:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1980);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1981);return chronology.centuries();
                case WEEKYEARS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1982);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1983);return chronology.weekyears();
                case YEARS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1984);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1985);return chronology.years();
                case MONTHS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1986);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1987);return chronology.months();
                case WEEKS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1988);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1989);return chronology.weeks();
                case DAYS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1990);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1991);return chronology.days();
                case HALFDAYS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1992);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1993);return chronology.halfdays();
                case HOURS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1994);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1995);return chronology.hours();
                case MINUTES:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1996);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1997);return chronology.minutes();
                case SECONDS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(1998);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(1999);return chronology.seconds();
                case MILLIS:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2000);__CLB4_4_1_bool0=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2001);return chronology.millis();
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2002);__CLB4_4_1_bool0=true;}
                    // Shouldn't happen.
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2003);throw new InternalError();
            }
        }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}

        /**
         * Ensure a singleton is returned.
         * 
         * @return the singleton type
         */
        private Object readResolve() {try{__CLR4_4_11hj1hjlc8azrw6.R.inc(2004);
            boolean __CLB4_4_1_bool1=false;__CLR4_4_11hj1hjlc8azrw6.R.inc(2005);switch (iOrdinal) {
                case ERAS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2006);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2007);return ERAS_TYPE;
                case CENTURIES:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2008);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2009);return CENTURIES_TYPE;
                case WEEKYEARS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2010);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2011);return WEEKYEARS_TYPE;
                case YEARS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2012);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2013);return YEARS_TYPE;
                case MONTHS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2014);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2015);return MONTHS_TYPE;
                case WEEKS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2016);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2017);return WEEKS_TYPE;
                case DAYS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2018);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2019);return DAYS_TYPE;
                case HALFDAYS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2020);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2021);return HALFDAYS_TYPE;
                case HOURS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2022);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2023);return HOURS_TYPE;
                case MINUTES:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2024);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2025);return MINUTES_TYPE;
                case SECONDS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2026);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2027);return SECONDS_TYPE;
                case MILLIS:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2028);__CLB4_4_1_bool1=true;}
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2029);return MILLIS_TYPE;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_11hj1hjlc8azrw6.R.inc(2030);__CLB4_4_1_bool1=true;}
                    // Shouldn't happen.
                    __CLR4_4_11hj1hjlc8azrw6.R.inc(2031);return this;
            }
        }finally{__CLR4_4_11hj1hjlc8azrw6.R.flushNeeded();}}
    }
}
