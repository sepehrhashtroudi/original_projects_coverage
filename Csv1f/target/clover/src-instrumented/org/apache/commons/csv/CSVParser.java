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
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;


import static org.apache.commons.csv.Token.Type.*;

/**
 * Parses CSV files according to the specified configuration.
 *
 * Because CSV appears in many different dialects, the parser supports many
 * configuration settings by allowing the specification of a {@link CSVFormat}.
 *
 * <p>Parsing of a csv-string having tabs as separators,
 * '"' as an optional value encapsulator, and comments starting with '#':</p>
 * <pre>
 * CSVFormat format = new CSVFormat('\t', '"', '#');
 * Reader in = new StringReader("a\tb\nc\td");
 * List&lt;CSVRecord> records = new CSVParser(in, format).getRecords();
 * </pre>
 *
 * <p>Parsing of a csv-string in Excel CSV format, using a for-each loop:</p>
 * <pre>
 * Reader in = new StringReader("a;b\nc;d");
 * CSVParser parser = new CSVParser(in, CSVFormat.EXCEL);
 * for (CSVRecord record : parser) {
 *     ...
 * }
 * </pre>
 *
 * <p>
 * Internal parser state is completely covered by the format
 * and the reader-state.</p>
 *
 * <p>see <a href="package-summary.html">package documentation</a>
 * for more details</p>
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class CSVParser implements Iterable<CSVRecord> {public static class __CLR4_4_17272l6l8x0cu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,351,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Lexer lexer;
    private final Map<String, Integer> headerMapping;

    // the following objects are shared to reduce garbage
    
    /** A record buffer for getRecord(). Grows as necessary and is reused. */
    private final List<String> record = new ArrayList<String>();
    private final Token reusableToken = new Token();

    /**
     * CSV parser using the default {@link CSVFormat}.
     *
     * @param input a Reader containing "csv-formatted" input
     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent
     */
    public CSVParser(Reader input) throws IOException {
        this(input, CSVFormat.DEFAULT);__CLR4_4_17272l6l8x0cu.R.inc(255);try{__CLR4_4_17272l6l8x0cu.R.inc(254);
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

    /**
     * Customized CSV parser using the given {@link CSVFormat}
     *
     * @param input    a Reader containing "csv-formatted" input
     * @param format the CSVFormat used for CSV parsing
     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent
     */
    public CSVParser(Reader input, CSVFormat format) throws IOException {try{__CLR4_4_17272l6l8x0cu.R.inc(256);
        __CLR4_4_17272l6l8x0cu.R.inc(257);format.validate();
        
        __CLR4_4_17272l6l8x0cu.R.inc(258);this.lexer = new CSVLexer(format, new ExtendedBufferedReader(input));
        
        __CLR4_4_17272l6l8x0cu.R.inc(259);this.headerMapping = initializeHeader(format);
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

    /**
     * Customized CSV parser using the given {@link CSVFormat}
     *
     * @param input    a String containing "csv-formatted" input
     * @param format the CSVFormat used for CSV parsing
     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent
     */
    public CSVParser(String input, CSVFormat format) throws IOException{
        this(new StringReader(input), format);__CLR4_4_17272l6l8x0cu.R.inc(261);try{__CLR4_4_17272l6l8x0cu.R.inc(260);
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}


    /**
     * Parses the CSV input according to the given format and returns the content
     * as an array of {@link CSVRecord} entries.
     * <p/>
     * The returned content starts at the current parse-position in the stream.
     *
     * @return list of {@link CSVRecord} entries, may be empty
     * @throws IOException on parse error or input read-failure
     */
    public List<CSVRecord> getRecords() throws IOException {try{__CLR4_4_17272l6l8x0cu.R.inc(262);
        __CLR4_4_17272l6l8x0cu.R.inc(263);List<CSVRecord> records = new ArrayList<CSVRecord>();
        __CLR4_4_17272l6l8x0cu.R.inc(264);CSVRecord rec;
        __CLR4_4_17272l6l8x0cu.R.inc(265);while ((rec = getRecord()) != null) {{
            __CLR4_4_17272l6l8x0cu.R.inc(268);records.add(rec);
        }
        }__CLR4_4_17272l6l8x0cu.R.inc(269);return records;
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

    /**
     * Parses the next record from the current point in the stream.
     *
     * @return the record as an array of values, or <tt>null</tt> if the end of the stream has been reached
     * @throws IOException on parse error or input read-failure
     */
    CSVRecord getRecord() throws IOException {try{__CLR4_4_17272l6l8x0cu.R.inc(270);
        __CLR4_4_17272l6l8x0cu.R.inc(271);CSVRecord result = new CSVRecord(null, headerMapping);
        __CLR4_4_17272l6l8x0cu.R.inc(272);record.clear();
        __CLR4_4_17272l6l8x0cu.R.inc(273);do {{
            __CLR4_4_17272l6l8x0cu.R.inc(274);reusableToken.reset();
            __CLR4_4_17272l6l8x0cu.R.inc(275);lexer.nextToken(reusableToken);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_17272l6l8x0cu.R.inc(276);switch (reusableToken.type) {
                case TOKEN:if (!__CLB4_4_1_bool0) {__CLR4_4_17272l6l8x0cu.R.inc(277);__CLB4_4_1_bool0=true;}
                    __CLR4_4_17272l6l8x0cu.R.inc(278);record.add(reusableToken.content.toString());
                    __CLR4_4_17272l6l8x0cu.R.inc(279);break;
                case EORECORD:if (!__CLB4_4_1_bool0) {__CLR4_4_17272l6l8x0cu.R.inc(280);__CLB4_4_1_bool0=true;}
                    __CLR4_4_17272l6l8x0cu.R.inc(281);record.add(reusableToken.content.toString());
                    __CLR4_4_17272l6l8x0cu.R.inc(282);break;
                case EOF:if (!__CLB4_4_1_bool0) {__CLR4_4_17272l6l8x0cu.R.inc(283);__CLB4_4_1_bool0=true;}
                    __CLR4_4_17272l6l8x0cu.R.inc(284);if ((((reusableToken.isReady)&&(__CLR4_4_17272l6l8x0cu.R.iget(285)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(286)==0&false))) {{
                        __CLR4_4_17272l6l8x0cu.R.inc(287);record.add(reusableToken.content.toString());
                    } }else {{
                        __CLR4_4_17272l6l8x0cu.R.inc(288);result = null;
                    }
                    }__CLR4_4_17272l6l8x0cu.R.inc(289);break;
                case INVALID:if (!__CLB4_4_1_bool0) {__CLR4_4_17272l6l8x0cu.R.inc(290);__CLB4_4_1_bool0=true;}
                    __CLR4_4_17272l6l8x0cu.R.inc(291);throw new IOException("(line " + getLineNumber() + ") invalid parse sequence");
            }
        } }while ((((reusableToken.type == TOKEN)&&(__CLR4_4_17272l6l8x0cu.R.iget(292)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(293)==0&false)));
        
        __CLR4_4_17272l6l8x0cu.R.inc(294);if ((((!record.isEmpty())&&(__CLR4_4_17272l6l8x0cu.R.iget(295)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(296)==0&false))) {{
            __CLR4_4_17272l6l8x0cu.R.inc(297);result = new CSVRecord(record.toArray(new String[record.size()]), headerMapping);
        }
        }__CLR4_4_17272l6l8x0cu.R.inc(298);return result;
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

    /**
     * Initializes the name to index mapping if the format defines a header.
     */
    private Map<String, Integer> initializeHeader(CSVFormat format) throws IOException {try{__CLR4_4_17272l6l8x0cu.R.inc(299);
        __CLR4_4_17272l6l8x0cu.R.inc(300);Map<String, Integer> hdrMap = null;
        __CLR4_4_17272l6l8x0cu.R.inc(301);if ((((format.getHeader() != null)&&(__CLR4_4_17272l6l8x0cu.R.iget(302)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(303)==0&false))) {{
            __CLR4_4_17272l6l8x0cu.R.inc(304);hdrMap = new HashMap<String, Integer>();

            __CLR4_4_17272l6l8x0cu.R.inc(305);String[] header = null;
            __CLR4_4_17272l6l8x0cu.R.inc(306);if ((((format.getHeader().length == 0)&&(__CLR4_4_17272l6l8x0cu.R.iget(307)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(308)==0&false))) {{
                // read the header from the first line of the file
                __CLR4_4_17272l6l8x0cu.R.inc(309);CSVRecord rec = getRecord();
                __CLR4_4_17272l6l8x0cu.R.inc(310);if ((((rec != null)&&(__CLR4_4_17272l6l8x0cu.R.iget(311)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(312)==0&false))) {{
                    __CLR4_4_17272l6l8x0cu.R.inc(313);header = rec.values();
                }
            }} }else {{
                __CLR4_4_17272l6l8x0cu.R.inc(314);header = format.getHeader();
            }

            // build the name to index mappings
            }__CLR4_4_17272l6l8x0cu.R.inc(315);if ((((header != null)&&(__CLR4_4_17272l6l8x0cu.R.iget(316)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(317)==0&false))) {{
                __CLR4_4_17272l6l8x0cu.R.inc(318);for (int i = 0; (((i < header.length)&&(__CLR4_4_17272l6l8x0cu.R.iget(319)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(320)==0&false)); i++) {{
                    __CLR4_4_17272l6l8x0cu.R.inc(321);hdrMap.put(header[i], Integer.valueOf(i));
                }
            }}
        }}
        }__CLR4_4_17272l6l8x0cu.R.inc(322);return hdrMap;
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

    /**
     * Returns an iterator on the records. IOExceptions occuring
     * during the iteration are wrapped in a RuntimeException.
     */
    public Iterator<CSVRecord> iterator() {try{__CLR4_4_17272l6l8x0cu.R.inc(323);
        __CLR4_4_17272l6l8x0cu.R.inc(324);return new Iterator<CSVRecord>() {
            private CSVRecord current;
            
            public boolean hasNext() {try{__CLR4_4_17272l6l8x0cu.R.inc(325);
                __CLR4_4_17272l6l8x0cu.R.inc(326);if ((((current == null)&&(__CLR4_4_17272l6l8x0cu.R.iget(327)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(328)==0&false))) {{
                    __CLR4_4_17272l6l8x0cu.R.inc(329);current = getNextRecord();
                }
                
                }__CLR4_4_17272l6l8x0cu.R.inc(330);return current != null;
            }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

            public CSVRecord next() {try{__CLR4_4_17272l6l8x0cu.R.inc(331);
                __CLR4_4_17272l6l8x0cu.R.inc(332);CSVRecord next = current;
                __CLR4_4_17272l6l8x0cu.R.inc(333);current = null;

                __CLR4_4_17272l6l8x0cu.R.inc(334);if ((((next == null)&&(__CLR4_4_17272l6l8x0cu.R.iget(335)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(336)==0&false))) {{
                    // hasNext() wasn't called before
                    __CLR4_4_17272l6l8x0cu.R.inc(337);next = getNextRecord();
                    __CLR4_4_17272l6l8x0cu.R.inc(338);if ((((next == null)&&(__CLR4_4_17272l6l8x0cu.R.iget(339)!=0|true))||(__CLR4_4_17272l6l8x0cu.R.iget(340)==0&false))) {{
                        __CLR4_4_17272l6l8x0cu.R.inc(341);throw new NoSuchElementException("No more CSV records available");
                    }
                }}
                
                }__CLR4_4_17272l6l8x0cu.R.inc(342);return next;
            }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}
            
            private CSVRecord getNextRecord() {try{__CLR4_4_17272l6l8x0cu.R.inc(343);
                __CLR4_4_17272l6l8x0cu.R.inc(344);try {
                    __CLR4_4_17272l6l8x0cu.R.inc(345);return getRecord();
                } catch (IOException e) {
                    __CLR4_4_17272l6l8x0cu.R.inc(346);throw new RuntimeException(e);
                }
            }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

            public void remove() {try{__CLR4_4_17272l6l8x0cu.R.inc(347);
                __CLR4_4_17272l6l8x0cu.R.inc(348);throw new UnsupportedOperationException();
            }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}
        };
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}

    /**
     * Returns the current line number in the input stream.
     * <p/>
     * ATTENTION: in case your csv has multiline-values the returned
     * number does not correspond to the record-number
     *
     * @return current line number
     */
    public int getLineNumber() {try{__CLR4_4_17272l6l8x0cu.R.inc(349);
        __CLR4_4_17272l6l8x0cu.R.inc(350);return lexer.getLineNumber();
    }finally{__CLR4_4_17272l6l8x0cu.R.flushNeeded();}}
}
