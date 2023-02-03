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

package org.apache.commons.csv;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;

/**
 * The format specification of a CSV file.
 *
 * This class is immutable.
 */
public class CSVFormat implements Serializable {public static class __CLR4_4_100l6l8x0ay{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** According to RFC 4180, line breaks are delimited by CRLF */
    private static final String CRLF = "\r\n";
    
    private final char delimiter;
    private final char encapsulator;
    private final char commentStart;
    private final char escape;
    private final boolean surroundingSpacesIgnored; // Should leading/trailing spaces be ignored around values?
    private final boolean emptyLinesIgnored;
    private final String lineSeparator; // for outputs
    private final String[] header;


    /**
     * Constant char to be used for disabling comments, escapes and encapsulation.
     * The value -2 is used because it won't be confused with an EOF signal (-1),
     * and because the unicode value FFFE would be encoded as two chars (using surrogates)
     * and thus there should never be a collision with a real text char.
     */
    static final char DISABLED = '\ufffe';

    /**
     * Starting format with no settings defined; used for creating other formats from scratch.
     */
    private static CSVFormat PRISTINE = new CSVFormat(DISABLED, DISABLED, DISABLED, DISABLED, false, false, null, null);

    /** 
     * Standard comma separated format, as for {@link #RFC4180} but allowing blank lines. 
     * <ul>
     * <li>withDelimiter(',')</li>
     * <li>withEncapsulator('"')</li>
     * <li>withEmptyLinesIgnored(true)</li>
     * <li>withLineSeparator(CRLF)</li>
     * </ul> 
     */
    public static final CSVFormat DEFAULT =
            PRISTINE.
            withDelimiter(',')
            .withEncapsulator('"')
            .withEmptyLinesIgnored(true)
            .withLineSeparator(CRLF);

    /**
     * Comma separated format as defined by <a href="http://tools.ietf.org/html/rfc4180">RFC 4180</a>.
     * <ul>
     * <li>withDelimiter(',')</li>
     * <li>withEncapsulator('"')</li>
     * <li>withLineSeparator(CRLF)</li>
     * <li></li>
     * </ul> 
     */
    public static final CSVFormat RFC4180 =
            PRISTINE.
            withDelimiter(',')
            .withEncapsulator('"')
            .withLineSeparator(CRLF);

    /**
     * Excel file format (using a comma as the value delimiter).
     * Note that the actual value delimiter used by Excel is locale dependent,
     * it might be necessary to customize this format to accomodate to your
     * regional settings.
     * <p/>
     * For example for parsing or generating a CSV file on a French system
     * the following format will be used:
     * 
     * <pre>CSVFormat fmt = CSVFormat.EXCEL.withDelimiter(';');</pre>
     */
    public static final CSVFormat EXCEL =
            PRISTINE
            .withDelimiter(',')
            .withEncapsulator('"')
            .withLineSeparator(CRLF);

    /** Tab-delimited format, with quote; leading and trailing spaces ignored. */
    public static final CSVFormat TDF =
            PRISTINE
            .withDelimiter('\t')
            .withEncapsulator('"')
            .withSurroundingSpacesIgnored(true)
            .withEmptyLinesIgnored(true)
            .withLineSeparator(CRLF);

    /**
     * Default MySQL format used by the <tt>SELECT INTO OUTFILE</tt> and
     * <tt>LOAD DATA INFILE</tt> operations. This is a tab-delimited
     * format with a LF character as the line separator. Values are not quoted
     * and special characters are escaped with '\'.
     * 
     * @see <a href="http://dev.mysql.com/doc/refman/5.1/en/load-data.html">http://dev.mysql.com/doc/refman/5.1/en/load-data.html</a>
     */
    public static final CSVFormat MYSQL =
            PRISTINE
            .withDelimiter('\t')
            .withEscape('\\')
            .withLineSeparator("\n");


    /**
     * Creates a customized CSV format.
     *
     * @param delimiter                 the char used for value separation
     * @param encapsulator              the char used as value encapsulation marker
     * @param commentStart              the char used for comment identification
     * @param escape                    the char used to escape special characters in values
     * @param surroundingSpacesIgnored  <tt>true</tt> when whitespaces enclosing values should be ignored
     * @param emptyLinesIgnored         <tt>true</tt> when the parser should skip emtpy lines
     * @param lineSeparator             the line separator to use for output
     * @param header                    the header
     */
    CSVFormat(
            char delimiter,
            char encapsulator,
            char commentStart,
            char escape,
            boolean surroundingSpacesIgnored,
            boolean emptyLinesIgnored,
            String lineSeparator,
            String[] header) {try{__CLR4_4_100l6l8x0ay.R.inc(0);
        __CLR4_4_100l6l8x0ay.R.inc(1);this.delimiter = delimiter;
        __CLR4_4_100l6l8x0ay.R.inc(2);this.encapsulator = encapsulator;
        __CLR4_4_100l6l8x0ay.R.inc(3);this.commentStart = commentStart;
        __CLR4_4_100l6l8x0ay.R.inc(4);this.escape = escape;
        __CLR4_4_100l6l8x0ay.R.inc(5);this.surroundingSpacesIgnored = surroundingSpacesIgnored;
        __CLR4_4_100l6l8x0ay.R.inc(6);this.emptyLinesIgnored = emptyLinesIgnored;
        __CLR4_4_100l6l8x0ay.R.inc(7);this.lineSeparator = lineSeparator;
        __CLR4_4_100l6l8x0ay.R.inc(8);this.header = header;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns true if the given character is a line break character.
     * 
     * @param c the character to check
     * 
     * @return true if <code>c</code> is a line break character
     */
    private static boolean isLineBreak(char c) {try{__CLR4_4_100l6l8x0ay.R.inc(9);
        __CLR4_4_100l6l8x0ay.R.inc(10);return c == '\n' || c == '\r';
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Verifies the consistency of the parameters and throws an IllegalArgumentException if necessary.
     */
    void validate() throws IllegalArgumentException {try{__CLR4_4_100l6l8x0ay.R.inc(11);
        __CLR4_4_100l6l8x0ay.R.inc(12);if ((((delimiter == encapsulator)&&(__CLR4_4_100l6l8x0ay.R.iget(13)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(14)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(15);throw new IllegalArgumentException("The encapsulator character and the delimiter cannot be the same (\"" + encapsulator + "\")");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(16);if ((((delimiter == escape)&&(__CLR4_4_100l6l8x0ay.R.iget(17)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(18)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(19);throw new IllegalArgumentException("The escape character and the delimiter cannot be the same (\"" + escape + "\")");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(20);if ((((delimiter == commentStart)&&(__CLR4_4_100l6l8x0ay.R.iget(21)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(22)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(23);throw new IllegalArgumentException("The comment start character and the delimiter cannot be the same (\"" + commentStart + "\")");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(24);if ((((encapsulator != DISABLED && encapsulator == commentStart)&&(__CLR4_4_100l6l8x0ay.R.iget(25)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(26)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(27);throw new IllegalArgumentException("The comment start character and the encapsulator cannot be the same (\"" + commentStart + "\")");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(28);if ((((escape != DISABLED && escape == commentStart)&&(__CLR4_4_100l6l8x0ay.R.iget(29)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(30)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(31);throw new IllegalArgumentException("The comment start and the escape character cannot be the same (\"" + commentStart + "\")");
        }
    }}finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns the character delimiting the values (typically ';', ',' or '\t').
     * 
     * @return the delimiter character
     */
    public char getDelimiter() {try{__CLR4_4_100l6l8x0ay.R.inc(32);
        __CLR4_4_100l6l8x0ay.R.inc(33);return delimiter;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format using the specified delimiter character.
     * 
     * @param delimiter the delimiter character
     * @return A copy of this format using the specified delimiter character
     * @throws IllegalArgumentException thrown if the specified character is a line break
     */
    public CSVFormat withDelimiter(char delimiter) {try{__CLR4_4_100l6l8x0ay.R.inc(34);
        __CLR4_4_100l6l8x0ay.R.inc(35);if ((((isLineBreak(delimiter))&&(__CLR4_4_100l6l8x0ay.R.iget(36)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(37)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(38);throw new IllegalArgumentException("The delimiter cannot be a line break");
        }

        }__CLR4_4_100l6l8x0ay.R.inc(39);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns the character used to encapsulate values containing special characters.
     * 
     * @return the encapsulator character
     */
    public char getEncapsulator() {try{__CLR4_4_100l6l8x0ay.R.inc(40);
        __CLR4_4_100l6l8x0ay.R.inc(41);return encapsulator;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format using the specified encapsulator character.
     * 
     * @param encapsulator the encapsulator character
     * @return A copy of this format using the specified encapsulator character
     * @throws IllegalArgumentException thrown if the specified character is a line break
     */
    public CSVFormat withEncapsulator(char encapsulator) {try{__CLR4_4_100l6l8x0ay.R.inc(42);
        __CLR4_4_100l6l8x0ay.R.inc(43);if ((((isLineBreak(encapsulator))&&(__CLR4_4_100l6l8x0ay.R.iget(44)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(45)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(46);throw new IllegalArgumentException("The encapsulator cannot be a line break");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(47);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    boolean isEncapsulating() {try{__CLR4_4_100l6l8x0ay.R.inc(48);
        __CLR4_4_100l6l8x0ay.R.inc(49);return this.encapsulator != DISABLED;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns the character marking the start of a line comment.
     * 
     * @return the comment start marker.
     */
    public char getCommentStart() {try{__CLR4_4_100l6l8x0ay.R.inc(50);
        __CLR4_4_100l6l8x0ay.R.inc(51);return commentStart;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format using the specified character as the comment start marker.
     * 
     * @param commentStart the comment start marker
     * @return A copy of this format using the specified character as the comment start marker
     * @throws IllegalArgumentException thrown if the specified character is a line break
     */
    public CSVFormat withCommentStart(char commentStart) {try{__CLR4_4_100l6l8x0ay.R.inc(52);
        __CLR4_4_100l6l8x0ay.R.inc(53);if ((((isLineBreak(commentStart))&&(__CLR4_4_100l6l8x0ay.R.iget(54)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(55)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(56);throw new IllegalArgumentException("The comment start character cannot be a line break");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(57);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Specifies whether comments are supported by this format.
     * 
     * @return <tt>true</tt> is comments are supported, <tt>false</tt> otherwise
     */
    public boolean isCommentingEnabled() {try{__CLR4_4_100l6l8x0ay.R.inc(58);
        __CLR4_4_100l6l8x0ay.R.inc(59);return this.commentStart != DISABLED;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns the escape character.
     * 
     * @return the escape character
     */
    public char getEscape() {try{__CLR4_4_100l6l8x0ay.R.inc(60);
        __CLR4_4_100l6l8x0ay.R.inc(61);return escape;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format using the specified escape character.
     * 
     * @param escape the escape character
     * @return A copy of this format using the specified escape character
     * @throws IllegalArgumentException thrown if the specified character is a line break
     */
    public CSVFormat withEscape(char escape) {try{__CLR4_4_100l6l8x0ay.R.inc(62);
        __CLR4_4_100l6l8x0ay.R.inc(63);if ((((isLineBreak(escape))&&(__CLR4_4_100l6l8x0ay.R.iget(64)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(65)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(66);throw new IllegalArgumentException("The escape character cannot be a line break");
        }
        
        }__CLR4_4_100l6l8x0ay.R.inc(67);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    boolean isEscaping() {try{__CLR4_4_100l6l8x0ay.R.inc(68);
        __CLR4_4_100l6l8x0ay.R.inc(69);return this.escape != DISABLED;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Specifies whether spaces around values are ignored when parsing input.
     * 
     * @return <tt>true</tt> if spaces around values are ignored, <tt>false</tt> if they are treated as part of the value.
     */
    public boolean isSurroundingSpacesIgnored() {try{__CLR4_4_100l6l8x0ay.R.inc(70);
        __CLR4_4_100l6l8x0ay.R.inc(71);return surroundingSpacesIgnored;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format with the specified trimming behavior.
     *
     * @param surroundingSpacesIgnored the trimming behavior, <tt>true</tt> to remove the surrounding spaces,
     *                                 <tt>false</tt> to leave the spaces as is.
     * @return A copy of this format with the specified trimming behavior.
     */
    public CSVFormat withSurroundingSpacesIgnored(boolean surroundingSpacesIgnored) {try{__CLR4_4_100l6l8x0ay.R.inc(72);
        __CLR4_4_100l6l8x0ay.R.inc(73);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Specifies whether empty lines between records are ignored when parsing input.
     * 
     * @return <tt>true</tt> if empty lines between records are ignored, <tt>false</tt> if they are turned into empty records.
     */
    public boolean isEmptyLinesIgnored() {try{__CLR4_4_100l6l8x0ay.R.inc(74);
        __CLR4_4_100l6l8x0ay.R.inc(75);return emptyLinesIgnored;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format with the specified empty line skipping behavior.
     *
     * @param emptyLinesIgnored the empty line skipping behavior, <tt>true</tt> to ignore the empty lines
     *                          between the records, <tt>false</tt> to translate empty lines to empty records.
     * @return A copy of this format  with the specified empty line skipping behavior.
     */
    public CSVFormat withEmptyLinesIgnored(boolean emptyLinesIgnored) {try{__CLR4_4_100l6l8x0ay.R.inc(76);
        __CLR4_4_100l6l8x0ay.R.inc(77);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns the line separator delimiting output records.
     * 
     * @return the line separator
     */
    public String getLineSeparator() {try{__CLR4_4_100l6l8x0ay.R.inc(78);
        __CLR4_4_100l6l8x0ay.R.inc(79);return lineSeparator;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format using the specified output line separator.
     * 
     * @param lineSeparator the line separator to be used for output.
     * 
     * @return A copy of this format using the specified output line separator
     */
    public CSVFormat withLineSeparator(String lineSeparator) {try{__CLR4_4_100l6l8x0ay.R.inc(80);
        __CLR4_4_100l6l8x0ay.R.inc(81);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    String[] getHeader() {try{__CLR4_4_100l6l8x0ay.R.inc(82);
        __CLR4_4_100l6l8x0ay.R.inc(83);return header;
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Returns a copy of this format using the specified header. The header can
     * either be parsed automatically from the input file with:
     *
     * <pre>CSVFormat format = CSVFormat.DEFAULT.withHeader();</pre>
     *
     * or specified manually with:
     *
     * <pre>CSVFormat format = CSVFormat.DEFAULT.withHeader("name", "email", "phone");</pre>
     *
     * @param header the header, <tt>null</tt> if disabled, empty if parsed automatically, user specified otherwise.
     *
     * @return A copy of this format using the specified header
     */
    public CSVFormat withHeader(String... header) {try{__CLR4_4_100l6l8x0ay.R.inc(84);
        __CLR4_4_100l6l8x0ay.R.inc(85);return new CSVFormat(delimiter, encapsulator, commentStart, escape, surroundingSpacesIgnored, emptyLinesIgnored, lineSeparator, header);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Parses the specified content.
     * 
     * @param in the input stream
     */
    public Iterable<CSVRecord> parse(Reader in) throws IOException {try{__CLR4_4_100l6l8x0ay.R.inc(86);
        __CLR4_4_100l6l8x0ay.R.inc(87);return new CSVParser(in, this);
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    /**
     * Format the specified values.
     * 
     * @param values the values to format
     */
    public String format(String... values) {try{__CLR4_4_100l6l8x0ay.R.inc(88);
        __CLR4_4_100l6l8x0ay.R.inc(89);StringWriter out = new StringWriter();
        __CLR4_4_100l6l8x0ay.R.inc(90);try {
            __CLR4_4_100l6l8x0ay.R.inc(91);new CSVPrinter(out, this).println(values);
        } catch (IOException e) {
            // should not happen
        }
        
        __CLR4_4_100l6l8x0ay.R.inc(92);return out.toString().trim();
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_100l6l8x0ay.R.inc(93);
        __CLR4_4_100l6l8x0ay.R.inc(94);StringBuilder sb = new StringBuilder();
        __CLR4_4_100l6l8x0ay.R.inc(95);sb.append("Delimiter=<").append(delimiter).append('>');
        __CLR4_4_100l6l8x0ay.R.inc(96);if ((((isEscaping())&&(__CLR4_4_100l6l8x0ay.R.iget(97)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(98)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(99);sb.append(' ');
            __CLR4_4_100l6l8x0ay.R.inc(100);sb.append("Escape=<").append(escape).append('>');
        }
        }__CLR4_4_100l6l8x0ay.R.inc(101);if ((((isEncapsulating())&&(__CLR4_4_100l6l8x0ay.R.iget(102)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(103)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(104);sb.append(' ');
            __CLR4_4_100l6l8x0ay.R.inc(105);sb.append("Encapsulator=<").append(encapsulator).append('>');            
        }
        }__CLR4_4_100l6l8x0ay.R.inc(106);if ((((isCommentingEnabled())&&(__CLR4_4_100l6l8x0ay.R.iget(107)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(108)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(109);sb.append(' ');
            __CLR4_4_100l6l8x0ay.R.inc(110);sb.append("CommentStart=<").append(commentStart).append('>');
        }
        }__CLR4_4_100l6l8x0ay.R.inc(111);if ((((isEmptyLinesIgnored())&&(__CLR4_4_100l6l8x0ay.R.iget(112)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(113)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(114);sb.append(" EmptyLines:ignored");            
        }
        }__CLR4_4_100l6l8x0ay.R.inc(115);if ((((isSurroundingSpacesIgnored())&&(__CLR4_4_100l6l8x0ay.R.iget(116)!=0|true))||(__CLR4_4_100l6l8x0ay.R.iget(117)==0&false))) {{
            __CLR4_4_100l6l8x0ay.R.inc(118);sb.append(" SurroundingSpaces:ignored");            
        }
        }__CLR4_4_100l6l8x0ay.R.inc(119);return sb.toString();
    }finally{__CLR4_4_100l6l8x0ay.R.flushNeeded();}}
    
}
