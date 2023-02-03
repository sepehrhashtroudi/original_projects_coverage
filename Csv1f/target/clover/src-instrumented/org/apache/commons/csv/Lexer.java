/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.apache.commons.csv;

import java.io.IOException;

/**
 * Abstract lexer class; contains common utility routines shared by lexers
 */
@java.lang.SuppressWarnings({"fallthrough"}) abstract class Lexer {public static class __CLR4_4_1h0h0l6l8x0ej{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final boolean isEncapsulating;
    private final boolean isEscaping;
    private final boolean isCommentEnabled;
    
    private final char delimiter;
    private final char escape;
    private final char encapsulator;
    private final char commmentStart;
    
    final boolean surroundingSpacesIgnored;
    final boolean emptyLinesIgnored;
    
    final CSVFormat format;
    
    /** The input stream */
    final ExtendedBufferedReader in;

    Lexer(CSVFormat format, ExtendedBufferedReader in) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(612);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(613);this.format = format;
        __CLR4_4_1h0h0l6l8x0ej.R.inc(614);this.in = in;
        __CLR4_4_1h0h0l6l8x0ej.R.inc(615);this.isEncapsulating = format.isEncapsulating();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(616);this.isEscaping = format.isEscaping();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(617);this.isCommentEnabled = format.isCommentingEnabled();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(618);this.delimiter = format.getDelimiter();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(619);this.escape = format.getEscape();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(620);this.encapsulator = format.getEncapsulator();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(621);this.commmentStart = format.getCommentStart();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(622);this.surroundingSpacesIgnored = format.isSurroundingSpacesIgnored();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(623);this.emptyLinesIgnored = format.isEmptyLinesIgnored();
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    int getLineNumber() {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(624);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(625);return in.getLineNumber();
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    int readEscape(int c) throws IOException {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(626);
        // assume c is the escape char (normally a backslash)
        __CLR4_4_1h0h0l6l8x0ej.R.inc(627);c = in.read();
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1h0h0l6l8x0ej.R.inc(628);switch (c) {
            case 'r':if (!__CLB4_4_1_bool0) {__CLR4_4_1h0h0l6l8x0ej.R.inc(629);__CLB4_4_1_bool0=true;}
                __CLR4_4_1h0h0l6l8x0ej.R.inc(630);return '\r';
            case 'n':if (!__CLB4_4_1_bool0) {__CLR4_4_1h0h0l6l8x0ej.R.inc(631);__CLB4_4_1_bool0=true;}
                __CLR4_4_1h0h0l6l8x0ej.R.inc(632);return '\n';
            case 't':if (!__CLB4_4_1_bool0) {__CLR4_4_1h0h0l6l8x0ej.R.inc(633);__CLB4_4_1_bool0=true;}
                __CLR4_4_1h0h0l6l8x0ej.R.inc(634);return '\t';
            case 'b':if (!__CLB4_4_1_bool0) {__CLR4_4_1h0h0l6l8x0ej.R.inc(635);__CLB4_4_1_bool0=true;}
                __CLR4_4_1h0h0l6l8x0ej.R.inc(636);return '\b';
            case 'f':if (!__CLB4_4_1_bool0) {__CLR4_4_1h0h0l6l8x0ej.R.inc(637);__CLB4_4_1_bool0=true;}
                __CLR4_4_1h0h0l6l8x0ej.R.inc(638);return '\f';
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1h0h0l6l8x0ej.R.inc(639);__CLB4_4_1_bool0=true;}
                __CLR4_4_1h0h0l6l8x0ej.R.inc(640);return c;
        }
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    void trimTrailingSpaces(StringBuilder buffer) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(641);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(642);int length = buffer.length();
        __CLR4_4_1h0h0l6l8x0ej.R.inc(643);while ((((length > 0 && Character.isWhitespace(buffer.charAt(length - 1)))&&(__CLR4_4_1h0h0l6l8x0ej.R.iget(644)!=0|true))||(__CLR4_4_1h0h0l6l8x0ej.R.iget(645)==0&false))) {{
            __CLR4_4_1h0h0l6l8x0ej.R.inc(646);length = length - 1;
        }
        }__CLR4_4_1h0h0l6l8x0ej.R.inc(647);if ((((length != buffer.length())&&(__CLR4_4_1h0h0l6l8x0ej.R.iget(648)!=0|true))||(__CLR4_4_1h0h0l6l8x0ej.R.iget(649)==0&false))) {{
            __CLR4_4_1h0h0l6l8x0ej.R.inc(650);buffer.setLength(length);
        }
    }}finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    /**
     * @return true if the given char is a whitespace character
     */
    boolean isWhitespace(int c) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(651);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(652);return (c != format.getDelimiter()) && Character.isWhitespace((char) c);
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    /**
     * Greedy - accepts \n, \r and \r\n
     * This checker consumes silently the second control-character...
     *
     * @return true if the given character is a line-terminator
     */
    boolean isEndOfLine(int c) throws IOException {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(653);
        // check if we have \r\n...
        __CLR4_4_1h0h0l6l8x0ej.R.inc(654);if ((((c == '\r' && in.lookAhead() == '\n')&&(__CLR4_4_1h0h0l6l8x0ej.R.iget(655)!=0|true))||(__CLR4_4_1h0h0l6l8x0ej.R.iget(656)==0&false))) {{
            // note: does not change c outside of this method !!
            __CLR4_4_1h0h0l6l8x0ej.R.inc(657);c = in.read();
        }
        }__CLR4_4_1h0h0l6l8x0ej.R.inc(658);return (c == '\n' || c == '\r');
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    /**
     * @return true if the given character indicates end of file
     */
    boolean isEndOfFile(int c) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(659);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(660);return c == ExtendedBufferedReader.END_OF_STREAM;
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    abstract Token nextToken(Token reusableToken) throws IOException;
    
    boolean isDelimiter(int c) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(661);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(662);return c == delimiter;
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    boolean isEscape(int c) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(663);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(664);return isEscaping && c == escape;
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    boolean isEncapsulator(int c) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(665);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(666);return isEncapsulating && c == encapsulator;
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}

    boolean isCommentStart(int c) {try{__CLR4_4_1h0h0l6l8x0ej.R.inc(667);
        __CLR4_4_1h0h0l6l8x0ej.R.inc(668);return isCommentEnabled && c == commmentStart;
    }finally{__CLR4_4_1h0h0l6l8x0ej.R.flushNeeded();}}
}
