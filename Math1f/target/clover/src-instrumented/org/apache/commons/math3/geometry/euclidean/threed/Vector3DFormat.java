/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.VectorFormat;
import org.apache.commons.math3.util.CompositeFormat;

/**
 * Formats a 3D vector in components list format "{x; y; z}".
 * <p>The prefix and suffix "{" and "}" and the separator "; " can be replaced by
 * any user-defined strings. The number format for components can be configured.</p>
 * <p>White space is ignored at parse time, even if it is in the prefix, suffix
 * or separator specifications. So even if the default separator does include a space
 * character that is used at format time, both input string "{1;1;1}" and
 * " { 1 ; 1 ; 1 } " will be parsed without error and the same vector will be
 * returned. In the second case, however, the parse position after parsing will be
 * just after the closing curly brace, i.e. just before the trailing space.</p>
 * <p><b>Note:</b> using "," as a separator may interfere with the grouping separator
 * of the default {@link NumberFormat} for the current locale. Thus it is advised
 * to use a {@link NumberFormat} instance with disabled grouping in such a case.</p>
 *
 * @version $Id$
 */
public class Vector3DFormat extends VectorFormat<Euclidean3D> {public static class __CLR4_4_1e69e69lb90p8ci{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,18399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Create an instance with default settings.
     * <p>The instance uses the default prefix, suffix and separator:
     * "{", "}", and "; " and the default number format for components.</p>
     */
    public Vector3DFormat() {
        super(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_SEPARATOR,
              CompositeFormat.getDefaultNumberFormat());__CLR4_4_1e69e69lb90p8ci.R.inc(18370);try{__CLR4_4_1e69e69lb90p8ci.R.inc(18369);
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Create an instance with a custom number format for components.
     * @param format the custom format for components.
     */
    public Vector3DFormat(final NumberFormat format) {
        super(DEFAULT_PREFIX, DEFAULT_SUFFIX, DEFAULT_SEPARATOR, format);__CLR4_4_1e69e69lb90p8ci.R.inc(18372);try{__CLR4_4_1e69e69lb90p8ci.R.inc(18371);
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Create an instance with custom prefix, suffix and separator.
     * @param prefix prefix to use instead of the default "{"
     * @param suffix suffix to use instead of the default "}"
     * @param separator separator to use instead of the default "; "
     */
    public Vector3DFormat(final String prefix, final String suffix,
                         final String separator) {
        super(prefix, suffix, separator, CompositeFormat.getDefaultNumberFormat());__CLR4_4_1e69e69lb90p8ci.R.inc(18374);try{__CLR4_4_1e69e69lb90p8ci.R.inc(18373);
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Create an instance with custom prefix, suffix, separator and format
     * for components.
     * @param prefix prefix to use instead of the default "{"
     * @param suffix suffix to use instead of the default "}"
     * @param separator separator to use instead of the default "; "
     * @param format the custom format for components.
     */
    public Vector3DFormat(final String prefix, final String suffix,
                         final String separator, final NumberFormat format) {
        super(prefix, suffix, separator, format);__CLR4_4_1e69e69lb90p8ci.R.inc(18376);try{__CLR4_4_1e69e69lb90p8ci.R.inc(18375);
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Returns the default 3D vector format for the current locale.
     * @return the default 3D vector format.
     */
    public static Vector3DFormat getInstance() {try{__CLR4_4_1e69e69lb90p8ci.R.inc(18377);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18378);return getInstance(Locale.getDefault());
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Returns the default 3D vector format for the given locale.
     * @param locale the specific locale used by the format.
     * @return the 3D vector format specific to the given locale.
     */
    public static Vector3DFormat getInstance(final Locale locale) {try{__CLR4_4_1e69e69lb90p8ci.R.inc(18379);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18380);return new Vector3DFormat(CompositeFormat.getDefaultNumberFormat(locale));
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Formats a {@link Vector3D} object to produce a string.
     * @param vector the object to format.
     * @param toAppendTo where the text is to be appended
     * @param pos On input: an alignment field, if desired. On output: the
     *            offsets of the alignment field
     * @return the value passed in as toAppendTo.
     */
    @Override
    public StringBuffer format(final Vector<Euclidean3D> vector, final StringBuffer toAppendTo,
                               final FieldPosition pos) {try{__CLR4_4_1e69e69lb90p8ci.R.inc(18381);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18382);final Vector3D v3 = (Vector3D) vector;
        __CLR4_4_1e69e69lb90p8ci.R.inc(18383);return format(toAppendTo, pos, v3.getX(), v3.getY(), v3.getZ());
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Vector3D} object.
     * @param source the string to parse
     * @return the parsed {@link Vector3D} object.
     * @throws MathParseException if the beginning of the specified string
     * cannot be parsed.
     */
    @Override
    public Vector3D parse(final String source) throws MathParseException {try{__CLR4_4_1e69e69lb90p8ci.R.inc(18384);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18385);ParsePosition parsePosition = new ParsePosition(0);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18386);Vector3D result = parse(source, parsePosition);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18387);if ((((parsePosition.getIndex() == 0)&&(__CLR4_4_1e69e69lb90p8ci.R.iget(18388)!=0|true))||(__CLR4_4_1e69e69lb90p8ci.R.iget(18389)==0&false))) {{
            __CLR4_4_1e69e69lb90p8ci.R.inc(18390);throw new MathParseException(source,
                                         parsePosition.getErrorIndex(),
                                         Vector3D.class);
        }
        }__CLR4_4_1e69e69lb90p8ci.R.inc(18391);return result;
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

    /**
     * Parses a string to produce a {@link Vector3D} object.
     * @param source the string to parse
     * @param pos input/ouput parsing parameter.
     * @return the parsed {@link Vector3D} object.
     */
    @Override
    public Vector3D parse(final String source, final ParsePosition pos) {try{__CLR4_4_1e69e69lb90p8ci.R.inc(18392);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18393);final double[] coordinates = parseCoordinates(3, source, pos);
        __CLR4_4_1e69e69lb90p8ci.R.inc(18394);if ((((coordinates == null)&&(__CLR4_4_1e69e69lb90p8ci.R.iget(18395)!=0|true))||(__CLR4_4_1e69e69lb90p8ci.R.iget(18396)==0&false))) {{
            __CLR4_4_1e69e69lb90p8ci.R.inc(18397);return null;
        }
        }__CLR4_4_1e69e69lb90p8ci.R.inc(18398);return new Vector3D(coordinates[0], coordinates[1], coordinates[2]);
    }finally{__CLR4_4_1e69e69lb90p8ci.R.flushNeeded();}}

}
