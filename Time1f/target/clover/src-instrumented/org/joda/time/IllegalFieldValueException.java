/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
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

/**
 * Exception thrown when attempting to set a field outside its supported range.
 *
 * @author Brian S O'Neill
 * @since 1.1
 */
public class IllegalFieldValueException extends IllegalArgumentException {public static class __CLR4_4_11ns1nslc8azrxn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,2285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Serialization lock. */
    private static final long serialVersionUID = 6305711765985447737L;

    /**
     * Creates a message for the exception.
     *
     * @param fieldName  the field name
     * @param value  the value rejected
     * @param lowerBound  the lower bound allowed
     * @param upperBound  the uppe bound allowed
     * @param explain  an explanation
     * @return the message
     */
    private static String createMessage(String fieldName, Number value,
                                        Number lowerBound, Number upperBound, String explain) {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2152);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2153);StringBuilder buf = new StringBuilder()
            .append("Value ").append(value).append(" for ").append(fieldName).append(' ');

        __CLR4_4_11ns1nslc8azrxn.R.inc(2154);if ((((lowerBound == null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2155)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2156)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2157);if ((((upperBound == null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2158)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2159)==0&false))) {{
                __CLR4_4_11ns1nslc8azrxn.R.inc(2160);buf.append("is not supported");
            } }else {{
                __CLR4_4_11ns1nslc8azrxn.R.inc(2161);buf.append("must not be larger than ").append(upperBound);
            }
        }} }else {__CLR4_4_11ns1nslc8azrxn.R.inc(2162);if ((((upperBound == null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2163)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2164)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2165);buf.append("must not be smaller than ").append(lowerBound);
        } }else {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2166);buf.append("must be in the range [")
                .append(lowerBound)
                .append(',')
                .append(upperBound)
                .append(']');
        }
        }}__CLR4_4_11ns1nslc8azrxn.R.inc(2167);if ((((explain != null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2168)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2169)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2170);buf.append(": ").append(explain);
        }

        }__CLR4_4_11ns1nslc8azrxn.R.inc(2171);return buf.toString();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Creates a message for the exception.
     *
     * @param fieldName  the field name
     * @param value  the value rejected
     * @return the message
     */
    private static String createMessage(String fieldName, String value) {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2172);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2173);StringBuffer buf = new StringBuffer().append("Value ");

        __CLR4_4_11ns1nslc8azrxn.R.inc(2174);if ((((value == null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2175)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2176)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2177);buf.append("null");
        } }else {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2178);buf.append('"');
            __CLR4_4_11ns1nslc8azrxn.R.inc(2179);buf.append(value);
            __CLR4_4_11ns1nslc8azrxn.R.inc(2180);buf.append('"');
        }

        }__CLR4_4_11ns1nslc8azrxn.R.inc(2181);buf.append(" for ").append(fieldName).append(' ').append("is not supported");
        
        __CLR4_4_11ns1nslc8azrxn.R.inc(2182);return buf.toString();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    private final DateTimeFieldType iDateTimeFieldType;
    private final DurationFieldType iDurationFieldType;
    private final String iFieldName;
    private final Number iNumberValue;
    private final String iStringValue;
    private final Number iLowerBound;
    private final Number iUpperBound;
    private String iMessage;

    /**
     * Constructor.
     * 
     * @param fieldType  type of field being set
     * @param value  illegal value being set
     * @param lowerBound  lower legal field value, or null if not applicable
     * @param upperBound  upper legal field value, or null if not applicable
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType,
                                      Number value, Number lowerBound, Number upperBound) {
        super(createMessage(fieldType.getName(), value, lowerBound, upperBound, null));__CLR4_4_11ns1nslc8azrxn.R.inc(2184);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2183);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2185);iDateTimeFieldType = fieldType;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2186);iDurationFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2187);iFieldName = fieldType.getName();
        __CLR4_4_11ns1nslc8azrxn.R.inc(2188);iNumberValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2189);iStringValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2190);iLowerBound = lowerBound;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2191);iUpperBound = upperBound;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2192);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param fieldType  type of field being set
     * @param value  illegal value being set
     * @param explain  an explanation
     * @since 1.5
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType,
                                      Number value, String explain) {
        super(createMessage(fieldType.getName(), value, null, null, explain));__CLR4_4_11ns1nslc8azrxn.R.inc(2194);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2193);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2195);iDateTimeFieldType = fieldType;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2196);iDurationFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2197);iFieldName = fieldType.getName();
        __CLR4_4_11ns1nslc8azrxn.R.inc(2198);iNumberValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2199);iStringValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2200);iLowerBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2201);iUpperBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2202);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param fieldType  type of field being set
     * @param value  illegal value being set
     * @param lowerBound  lower legal field value, or null if not applicable
     * @param upperBound  upper legal field value, or null if not applicable
     */
    public IllegalFieldValueException(DurationFieldType fieldType,
                                      Number value, Number lowerBound, Number upperBound) {
        super(createMessage(fieldType.getName(), value, lowerBound, upperBound, null));__CLR4_4_11ns1nslc8azrxn.R.inc(2204);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2203);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2205);iDateTimeFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2206);iDurationFieldType = fieldType;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2207);iFieldName = fieldType.getName();
        __CLR4_4_11ns1nslc8azrxn.R.inc(2208);iNumberValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2209);iStringValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2210);iLowerBound = lowerBound;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2211);iUpperBound = upperBound;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2212);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param fieldName  name of field being set
     * @param value  illegal value being set
     * @param lowerBound  lower legal field value, or null if not applicable
     * @param upperBound  upper legal field value, or null if not applicable
     */
    public IllegalFieldValueException(String fieldName,
                                      Number value, Number lowerBound, Number upperBound) {
        super(createMessage(fieldName, value, lowerBound, upperBound, null));__CLR4_4_11ns1nslc8azrxn.R.inc(2214);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2213);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2215);iDateTimeFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2216);iDurationFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2217);iFieldName = fieldName;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2218);iNumberValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2219);iStringValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2220);iLowerBound = lowerBound;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2221);iUpperBound = upperBound;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2222);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param fieldType  type of field being set
     * @param value  illegal value being set
     */
    public IllegalFieldValueException(DateTimeFieldType fieldType, String value) {
        super(createMessage(fieldType.getName(), value));__CLR4_4_11ns1nslc8azrxn.R.inc(2224);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2223);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2225);iDateTimeFieldType = fieldType;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2226);iDurationFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2227);iFieldName = fieldType.getName();
        __CLR4_4_11ns1nslc8azrxn.R.inc(2228);iStringValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2229);iNumberValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2230);iLowerBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2231);iUpperBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2232);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param fieldType  type of field being set
     * @param value  illegal value being set
     */
    public IllegalFieldValueException(DurationFieldType fieldType, String value) {
        super(createMessage(fieldType.getName(), value));__CLR4_4_11ns1nslc8azrxn.R.inc(2234);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2233);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2235);iDateTimeFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2236);iDurationFieldType = fieldType;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2237);iFieldName = fieldType.getName();
        __CLR4_4_11ns1nslc8azrxn.R.inc(2238);iStringValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2239);iNumberValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2240);iLowerBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2241);iUpperBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2242);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param fieldName  name of field being set
     * @param value  illegal value being set
     */
    public IllegalFieldValueException(String fieldName, String value) {
        super(createMessage(fieldName, value));__CLR4_4_11ns1nslc8azrxn.R.inc(2244);try{__CLR4_4_11ns1nslc8azrxn.R.inc(2243);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2245);iDateTimeFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2246);iDurationFieldType = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2247);iFieldName = fieldName;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2248);iStringValue = value;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2249);iNumberValue = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2250);iLowerBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2251);iUpperBound = null;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2252);iMessage = super.getMessage();
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the DateTimeFieldType whose value was invalid, or null if not applicable.
     * 
     * @return the datetime field type
     */
    public DateTimeFieldType getDateTimeFieldType() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2253);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2254);return iDateTimeFieldType;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the DurationFieldType whose value was invalid, or null if not applicable.
     * 
     * @return the duration field type
     */
    public DurationFieldType getDurationFieldType() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2255);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2256);return iDurationFieldType;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the name of the field whose value was invalid.
     * 
     * @return the field name
     */
    public String getFieldName() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2257);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2258);return iFieldName;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the illegal integer value assigned to the field, or null if not applicable.
     * 
     * @return the value
     */
    public Number getIllegalNumberValue() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2259);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2260);return iNumberValue;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the illegal string value assigned to the field, or null if not applicable.
     * 
     * @return the value
     */
    public String getIllegalStringValue() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2261);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2262);return iStringValue;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the illegal value assigned to the field as a non-null string.
     * 
     * @return the value
     */
    public String getIllegalValueAsString() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2263);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2264);String value = iStringValue;
        __CLR4_4_11ns1nslc8azrxn.R.inc(2265);if ((((value == null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2266)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2267)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2268);value = String.valueOf(iNumberValue);
        }
        }__CLR4_4_11ns1nslc8azrxn.R.inc(2269);return value;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the lower bound of the legal value range, or null if not applicable.
     * 
     * @return the lower bound
     */
    public Number getLowerBound() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2270);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2271);return iLowerBound;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Returns the upper bound of the legal value range, or null if not applicable.
     * 
     * @return the upper bound
     */
    public Number getUpperBound() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2272);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2273);return iUpperBound;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    public String getMessage() {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2274);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2275);return iMessage;
    }finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}

    /**
     * Provide additional detail by prepending a message to the existing message.
     * A colon is separator is automatically inserted between the messages.
     * @since 1.3
     */
    public void prependMessage(String message) {try{__CLR4_4_11ns1nslc8azrxn.R.inc(2276);
        __CLR4_4_11ns1nslc8azrxn.R.inc(2277);if ((((iMessage == null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2278)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2279)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2280);iMessage = message;
        } }else {__CLR4_4_11ns1nslc8azrxn.R.inc(2281);if ((((message != null)&&(__CLR4_4_11ns1nslc8azrxn.R.iget(2282)!=0|true))||(__CLR4_4_11ns1nslc8azrxn.R.iget(2283)==0&false))) {{
            __CLR4_4_11ns1nslc8azrxn.R.inc(2284);iMessage = message + ": " + iMessage;
        }
    }}}finally{__CLR4_4_11ns1nslc8azrxn.R.flushNeeded();}}
}
