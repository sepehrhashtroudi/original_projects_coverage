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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * ExtendedBufferedReader
 *
 * A special reader decorator which supports more
 * sophisticated access to the underlying reader object.
 *
 * In particular the reader supports a look-ahead option,
 * which allows you to see the next char returned by
 * next().
 */
class ExtendedBufferedReader extends BufferedReader {public static class __CLR4_4_1f9f9l6l8x0e6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,612,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The end of stream symbol */
    static final int END_OF_STREAM = -1;

    /** Undefined state for the lookahead char */
    static final int UNDEFINED = -2;

    /** The last char returned */
    private int lastChar = UNDEFINED;

    /** The line counter */
    private int lineCounter = 0;

    /**
     * Created extended buffered reader using default buffer-size
     */
    ExtendedBufferedReader(Reader r) {
        super(r);__CLR4_4_1f9f9l6l8x0e6.R.inc(550);try{__CLR4_4_1f9f9l6l8x0e6.R.inc(549);
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}

    @Override
    public int read() throws IOException {try{__CLR4_4_1f9f9l6l8x0e6.R.inc(551);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(552);int current = super.read();
        __CLR4_4_1f9f9l6l8x0e6.R.inc(553);if ((((current == '\r' || (current == '\n' && lastChar != '\r'))&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(554)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(555)==0&false))) {{
            __CLR4_4_1f9f9l6l8x0e6.R.inc(556);lineCounter++;
        }
        }__CLR4_4_1f9f9l6l8x0e6.R.inc(557);lastChar = current;
        __CLR4_4_1f9f9l6l8x0e6.R.inc(558);return lastChar;
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}

    /**
     * Returns the last character that was read as an integer (0 to 65535). This
     * will be the last character returned by any of the read methods. This will
     * not include a character read using the {@link #peek()} method. If no
     * character has been read then this will return {@link #UNDEFINED}. If the
     * end of the stream was reached on the last read then this will return
     * {@link #END_OF_STREAM}.
     * 
     * @return the last character that was read
     */
    int readAgain() {try{__CLR4_4_1f9f9l6l8x0e6.R.inc(559);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(560);return lastChar;
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}

    @Override
    public int read(char[] buf, int offset, int length) throws IOException {try{__CLR4_4_1f9f9l6l8x0e6.R.inc(561);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(562);if ((((length == 0)&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(563)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(564)==0&false))) {{
            __CLR4_4_1f9f9l6l8x0e6.R.inc(565);return 0;
        }
        
        }__CLR4_4_1f9f9l6l8x0e6.R.inc(566);int len = super.read(buf, offset, length);
        
        __CLR4_4_1f9f9l6l8x0e6.R.inc(567);if ((((len > 0)&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(568)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(569)==0&false))) {{

            __CLR4_4_1f9f9l6l8x0e6.R.inc(570);for (int i = offset; (((i < offset + len)&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(571)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(572)==0&false)); i++) {{
                __CLR4_4_1f9f9l6l8x0e6.R.inc(573);char ch = buf[i];
                __CLR4_4_1f9f9l6l8x0e6.R.inc(574);if ((((ch == '\n')&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(575)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(576)==0&false))) {{
                    __CLR4_4_1f9f9l6l8x0e6.R.inc(577);if (((('\r' != ((((i > 0 )&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(578)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(579)==0&false))? buf[i-1]: lastChar))&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(580)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(581)==0&false))) {{
                        __CLR4_4_1f9f9l6l8x0e6.R.inc(582);lineCounter++;                        
                    }
                }} }else {__CLR4_4_1f9f9l6l8x0e6.R.inc(583);if ((((ch == '\r')&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(584)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(585)==0&false))) {{
                    __CLR4_4_1f9f9l6l8x0e6.R.inc(586);lineCounter++;
                }
            }}}

            }__CLR4_4_1f9f9l6l8x0e6.R.inc(587);lastChar = buf[offset + len - 1];

        } }else {__CLR4_4_1f9f9l6l8x0e6.R.inc(588);if ((((len == -1)&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(589)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(590)==0&false))) {{
            __CLR4_4_1f9f9l6l8x0e6.R.inc(591);lastChar = END_OF_STREAM;
        }
        
        }}__CLR4_4_1f9f9l6l8x0e6.R.inc(592);return len;
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}

    /**
     * Calls {@link BufferedReader#readLine()} which drops the line terminator(s).
     * This method should only be called when processing a comment, otherwise
     * information can be lost.
     * <p>
     * Increments  {@link #lineCounter}
     * <p>
     * Sets {@link #lastChar} to {@link #END_OF_STREAM} at EOF, 
     * otherwise to last character on the line (won't be CR or LF) 
     * 
     * @return the line that was read, or null if reached EOF.
     */
    @Override
    public String readLine() throws IOException {try{__CLR4_4_1f9f9l6l8x0e6.R.inc(593);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(594);String line = super.readLine();

        __CLR4_4_1f9f9l6l8x0e6.R.inc(595);if ((((line != null)&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(596)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(597)==0&false))) {{
            __CLR4_4_1f9f9l6l8x0e6.R.inc(598);if ((((line.length() > 0)&&(__CLR4_4_1f9f9l6l8x0e6.R.iget(599)!=0|true))||(__CLR4_4_1f9f9l6l8x0e6.R.iget(600)==0&false))) {{
                __CLR4_4_1f9f9l6l8x0e6.R.inc(601);lastChar = line.charAt(line.length() - 1);
            }
            }__CLR4_4_1f9f9l6l8x0e6.R.inc(602);lineCounter++;
        } }else {{
            __CLR4_4_1f9f9l6l8x0e6.R.inc(603);lastChar = END_OF_STREAM;
        }

        }__CLR4_4_1f9f9l6l8x0e6.R.inc(604);return line;
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}

    /**
     * Returns the next character in the current reader without consuming it. So
     * the next call to {@link #read()} will still return this value.
     * 
     * @return the next character
     * 
     * @throws IOException if there is an error in reading
     */
    int lookAhead() throws IOException {try{__CLR4_4_1f9f9l6l8x0e6.R.inc(605);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(606);super.mark(1);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(607);int c = super.read();
        __CLR4_4_1f9f9l6l8x0e6.R.inc(608);super.reset();

        __CLR4_4_1f9f9l6l8x0e6.R.inc(609);return c;
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}

    /**
     * Returns the nof line read
     *
     * @return the current-line-number (or -1)
     */
    int getLineNumber() {try{__CLR4_4_1f9f9l6l8x0e6.R.inc(610);
        __CLR4_4_1f9f9l6l8x0e6.R.inc(611);return lineCounter;
    }finally{__CLR4_4_1f9f9l6l8x0e6.R.flushNeeded();}}
}
