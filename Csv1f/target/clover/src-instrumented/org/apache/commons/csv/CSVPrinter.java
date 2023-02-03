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

import java.io.Flushable;
import java.io.IOException;

/**
 * Print values as a comma separated list.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class CSVPrinter {public static class __CLR4_4_19r9rl6l8x0dh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The place that the values get written. */
    private final Appendable out;
    private final CSVFormat format;

    /** True if we just began a new line. */
    private boolean newLine = true;

    /**
     * Create a printer that will print values to the given stream following the CSVFormat.
     * <p/>
     * Currently, only a pure encapsulation format or a pure escaping format
     * is supported. Hybrid formats (encapsulation and escaping with a different character) are not supported.
     *
     * @param out    stream to which to print.
     * @param format the CSV format. If null the default format is used ({@link CSVFormat#DEFAULT})
     * @throws IllegalArgumentException thrown if the parameters of the format are inconsistent
     */
    public CSVPrinter(Appendable out, CSVFormat format) {try{__CLR4_4_19r9rl6l8x0dh.R.inc(351);
        __CLR4_4_19r9rl6l8x0dh.R.inc(352);this.out = out;
        __CLR4_4_19r9rl6l8x0dh.R.inc(353);this.format = (((format == null )&&(__CLR4_4_19r9rl6l8x0dh.R.iget(354)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(355)==0&false))? CSVFormat.DEFAULT : format;
        
        __CLR4_4_19r9rl6l8x0dh.R.inc(356);this.format.validate();
    }finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    // ======================================================
    //  printing implementation
    // ======================================================

    /**
     * Output a blank line
     */
    public void println() throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(357);
        __CLR4_4_19r9rl6l8x0dh.R.inc(358);out.append(format.getLineSeparator());
        __CLR4_4_19r9rl6l8x0dh.R.inc(359);newLine = true;
    }finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    /**
     * Flush the underlying stream.
     * 
     * @throws IOException
     */
    public void flush() throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(360);
        __CLR4_4_19r9rl6l8x0dh.R.inc(361);if ((((out instanceof Flushable)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(362)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(363)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(364);((Flushable) out).flush();
        }
    }}finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    /**
     * Print a single line of comma separated values.
     * The values will be quoted if needed.  Quotes and
     * newLine characters will be escaped.
     *
     * @param values values to be outputted.
     */
    public void println(String... values) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(365);
        __CLR4_4_19r9rl6l8x0dh.R.inc(366);for (String value : values) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(367);print(value);
        }
        }__CLR4_4_19r9rl6l8x0dh.R.inc(368);println();
    }finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}


    /**
     * Put a comment on a new line among the comma separated values. Comments
     * will always begin on a new line and occupy a least one full line. The
     * character specified to start comments and a space will be inserted at
     * the beginning of each new line in the comment.
     * <p/>
     * If comments are disabled in the current CSV format this method does nothing.
     *
     * @param comment the comment to output
     */
    public void printComment(String comment) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(369);
        __CLR4_4_19r9rl6l8x0dh.R.inc(370);if ((((!format.isCommentingEnabled())&&(__CLR4_4_19r9rl6l8x0dh.R.iget(371)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(372)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(373);return;
        }
        }__CLR4_4_19r9rl6l8x0dh.R.inc(374);if ((((!newLine)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(375)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(376)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(377);println();
        }
        }__CLR4_4_19r9rl6l8x0dh.R.inc(378);out.append(format.getCommentStart());
        __CLR4_4_19r9rl6l8x0dh.R.inc(379);out.append(' ');
        __CLR4_4_19r9rl6l8x0dh.R.inc(380);for (int i = 0; (((i < comment.length())&&(__CLR4_4_19r9rl6l8x0dh.R.iget(381)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(382)==0&false)); i++) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(383);char c = comment.charAt(i);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_19r9rl6l8x0dh.R.inc(384);switch (c) {
                case '\r':if (!__CLB4_4_1_bool0) {__CLR4_4_19r9rl6l8x0dh.R.inc(385);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19r9rl6l8x0dh.R.inc(386);if ((((i + 1 < comment.length() && comment.charAt(i + 1) == '\n')&&(__CLR4_4_19r9rl6l8x0dh.R.iget(387)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(388)==0&false))) {{
                        __CLR4_4_19r9rl6l8x0dh.R.inc(389);i++;
                    }
                //$FALL-THROUGH$ break intentionally excluded.
            }case '\n':if (!__CLB4_4_1_bool0) {__CLR4_4_19r9rl6l8x0dh.R.inc(390);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19r9rl6l8x0dh.R.inc(391);println();
                    __CLR4_4_19r9rl6l8x0dh.R.inc(392);out.append(format.getCommentStart());
                    __CLR4_4_19r9rl6l8x0dh.R.inc(393);out.append(' ');
                    __CLR4_4_19r9rl6l8x0dh.R.inc(394);break;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_19r9rl6l8x0dh.R.inc(395);__CLB4_4_1_bool0=true;}
                    __CLR4_4_19r9rl6l8x0dh.R.inc(396);out.append(c);
                    __CLR4_4_19r9rl6l8x0dh.R.inc(397);break;
            }
        }
        }__CLR4_4_19r9rl6l8x0dh.R.inc(398);println();
    }finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}


    private void print(CharSequence value, int offset, int len) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(399);        
        __CLR4_4_19r9rl6l8x0dh.R.inc(400);if ((((format.isEncapsulating())&&(__CLR4_4_19r9rl6l8x0dh.R.iget(401)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(402)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(403);printAndEncapsulate(value, offset, len);
        } }else {__CLR4_4_19r9rl6l8x0dh.R.inc(404);if ((((format.isEscaping())&&(__CLR4_4_19r9rl6l8x0dh.R.iget(405)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(406)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(407);printAndEscape(value, offset, len);
        } }else {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(408);printSep();
            __CLR4_4_19r9rl6l8x0dh.R.inc(409);out.append(value, offset, offset + len);
        }
    }}}finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    void printSep() throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(410);
        __CLR4_4_19r9rl6l8x0dh.R.inc(411);if ((((newLine)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(412)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(413)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(414);newLine = false;
        } }else {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(415);out.append(format.getDelimiter());
        }
    }}finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    void printAndEscape(CharSequence value, int offset, int len) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(416);
        __CLR4_4_19r9rl6l8x0dh.R.inc(417);int start = offset;
        __CLR4_4_19r9rl6l8x0dh.R.inc(418);int pos = offset;
        __CLR4_4_19r9rl6l8x0dh.R.inc(419);int end = offset + len;

        __CLR4_4_19r9rl6l8x0dh.R.inc(420);printSep();

        __CLR4_4_19r9rl6l8x0dh.R.inc(421);char delim = format.getDelimiter();
        __CLR4_4_19r9rl6l8x0dh.R.inc(422);char escape = format.getEscape();

        __CLR4_4_19r9rl6l8x0dh.R.inc(423);while ((((pos < end)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(424)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(425)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(426);char c = value.charAt(pos);
            __CLR4_4_19r9rl6l8x0dh.R.inc(427);if ((((c == '\r' || c == '\n' || c == delim || c == escape)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(428)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(429)==0&false))) {{
                // write out segment up until this char
                __CLR4_4_19r9rl6l8x0dh.R.inc(430);if ((((pos > start)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(431)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(432)==0&false))) {{
                    __CLR4_4_19r9rl6l8x0dh.R.inc(433);out.append(value, start, pos);
                }
                }__CLR4_4_19r9rl6l8x0dh.R.inc(434);if ((((c == '\n')&&(__CLR4_4_19r9rl6l8x0dh.R.iget(435)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(436)==0&false))) {{
                    __CLR4_4_19r9rl6l8x0dh.R.inc(437);c = 'n';
                } }else {__CLR4_4_19r9rl6l8x0dh.R.inc(438);if ((((c == '\r')&&(__CLR4_4_19r9rl6l8x0dh.R.iget(439)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(440)==0&false))) {{
                    __CLR4_4_19r9rl6l8x0dh.R.inc(441);c = 'r';
                }

                }}__CLR4_4_19r9rl6l8x0dh.R.inc(442);out.append(escape);
                __CLR4_4_19r9rl6l8x0dh.R.inc(443);out.append(c);

                __CLR4_4_19r9rl6l8x0dh.R.inc(444);start = pos + 1; // start on the current char after this one
            }

            }__CLR4_4_19r9rl6l8x0dh.R.inc(445);pos++;
        }

        // write last segment
        }__CLR4_4_19r9rl6l8x0dh.R.inc(446);if ((((pos > start)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(447)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(448)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(449);out.append(value, start, pos);
        }
    }}finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    void printAndEncapsulate(CharSequence value, int offset, int len) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(450);
        __CLR4_4_19r9rl6l8x0dh.R.inc(451);boolean first = newLine;  // is this the first value on this line?
        __CLR4_4_19r9rl6l8x0dh.R.inc(452);boolean quote = false;
        __CLR4_4_19r9rl6l8x0dh.R.inc(453);int start = offset;
        __CLR4_4_19r9rl6l8x0dh.R.inc(454);int pos = offset;
        __CLR4_4_19r9rl6l8x0dh.R.inc(455);int end = offset + len;

        __CLR4_4_19r9rl6l8x0dh.R.inc(456);printSep();

        __CLR4_4_19r9rl6l8x0dh.R.inc(457);char delim = format.getDelimiter();
        __CLR4_4_19r9rl6l8x0dh.R.inc(458);char encapsulator = format.getEncapsulator();

        __CLR4_4_19r9rl6l8x0dh.R.inc(459);if ((((len <= 0)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(460)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(461)==0&false))) {{
            // always quote an empty token that is the first
            // on the line, as it may be the only thing on the
            // line. If it were not quoted in that case,
            // an empty line has no tokens.
            __CLR4_4_19r9rl6l8x0dh.R.inc(462);if ((((first)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(463)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(464)==0&false))) {{
                __CLR4_4_19r9rl6l8x0dh.R.inc(465);quote = true;
            }
        }} }else {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(466);char c = value.charAt(pos);

            // Hmmm, where did this rule come from?
            __CLR4_4_19r9rl6l8x0dh.R.inc(467);if ((((first
                    && (c < '0'
                    || (c > '9' && c < 'A')
                    || (c > 'Z' && c < 'a')
                    || (c > 'z')))&&(__CLR4_4_19r9rl6l8x0dh.R.iget(468)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(469)==0&false))) {{
                __CLR4_4_19r9rl6l8x0dh.R.inc(470);quote = true;
                // } else if (c == ' ' || c == '\f' || c == '\t') {
            } }else {__CLR4_4_19r9rl6l8x0dh.R.inc(471);if ((((c <= '#')&&(__CLR4_4_19r9rl6l8x0dh.R.iget(472)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(473)==0&false))) {{
                // Some other chars at the start of a value caused the parser to fail, so for now
                // encapsulate if we start in anything less than '#'.  We are being conservative
                // by including the default comment char too.
                __CLR4_4_19r9rl6l8x0dh.R.inc(474);quote = true;
            } }else {{
                __CLR4_4_19r9rl6l8x0dh.R.inc(475);while ((((pos < end)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(476)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(477)==0&false))) {{
                    __CLR4_4_19r9rl6l8x0dh.R.inc(478);c = value.charAt(pos);
                    __CLR4_4_19r9rl6l8x0dh.R.inc(479);if ((((c == '\n' || c == '\r' || c == encapsulator || c == delim)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(480)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(481)==0&false))) {{
                        __CLR4_4_19r9rl6l8x0dh.R.inc(482);quote = true;
                        __CLR4_4_19r9rl6l8x0dh.R.inc(483);break;
                    }
                    }__CLR4_4_19r9rl6l8x0dh.R.inc(484);pos++;
                }

                }__CLR4_4_19r9rl6l8x0dh.R.inc(485);if ((((!quote)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(486)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(487)==0&false))) {{
                    __CLR4_4_19r9rl6l8x0dh.R.inc(488);pos = end - 1;
                    __CLR4_4_19r9rl6l8x0dh.R.inc(489);c = value.charAt(pos);
                    // if (c == ' ' || c == '\f' || c == '\t') {
                    // Some other chars at the end caused the parser to fail, so for now
                    // encapsulate if we end in anything less than ' '
                    __CLR4_4_19r9rl6l8x0dh.R.inc(490);if ((((c <= ' ')&&(__CLR4_4_19r9rl6l8x0dh.R.iget(491)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(492)==0&false))) {{
                        __CLR4_4_19r9rl6l8x0dh.R.inc(493);quote = true;
                    }
                }}
            }}
        }}}

        }__CLR4_4_19r9rl6l8x0dh.R.inc(494);if ((((!quote)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(495)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(496)==0&false))) {{
            // no encapsulation needed - write out the original value
            __CLR4_4_19r9rl6l8x0dh.R.inc(497);out.append(value, start, end);
            __CLR4_4_19r9rl6l8x0dh.R.inc(498);return;
        }

        // we hit something that needed encapsulation
        }__CLR4_4_19r9rl6l8x0dh.R.inc(499);out.append(encapsulator);

        // Pick up where we left off: pos should be positioned on the first character that caused
        // the need for encapsulation.
        __CLR4_4_19r9rl6l8x0dh.R.inc(500);while ((((pos < end)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(501)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(502)==0&false))) {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(503);char c = value.charAt(pos);
            __CLR4_4_19r9rl6l8x0dh.R.inc(504);if ((((c == encapsulator)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(505)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(506)==0&false))) {{
                // write out the chunk up until this point

                // add 1 to the length to write out the encapsulator also
                __CLR4_4_19r9rl6l8x0dh.R.inc(507);out.append(value, start, pos + 1);
                // put the next starting position on the encapsulator so we will
                // write it out again with the next string (effectively doubling it)
                __CLR4_4_19r9rl6l8x0dh.R.inc(508);start = pos;
            }
            }__CLR4_4_19r9rl6l8x0dh.R.inc(509);pos++;
        }

        // write the last segment
        }__CLR4_4_19r9rl6l8x0dh.R.inc(510);out.append(value, start, pos);
        __CLR4_4_19r9rl6l8x0dh.R.inc(511);out.append(encapsulator);
    }finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    /**
     * Print the string as the next value on the line. The value
     * will be escaped or encapsulated as needed if checkForEscape==true
     *
     * @param value value to be outputted.
     */
    public void print(String value, boolean checkForEscape) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(512);
        __CLR4_4_19r9rl6l8x0dh.R.inc(513);if ((((value == null)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(514)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(515)==0&false))) {{
            // null values are considered empty
            __CLR4_4_19r9rl6l8x0dh.R.inc(516);value = "";
        }
        
        }__CLR4_4_19r9rl6l8x0dh.R.inc(517);if ((((!checkForEscape)&&(__CLR4_4_19r9rl6l8x0dh.R.iget(518)!=0|true))||(__CLR4_4_19r9rl6l8x0dh.R.iget(519)==0&false))) {{
            // write directly from string
            __CLR4_4_19r9rl6l8x0dh.R.inc(520);printSep();
            __CLR4_4_19r9rl6l8x0dh.R.inc(521);out.append(value);
        } }else {{
            __CLR4_4_19r9rl6l8x0dh.R.inc(522);print(value, 0, value.length());
        }
    }}finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}

    /**
     * Print the string as the next value on the line. The value
     * will be escaped or encapsulated as needed.
     *
     * @param value value to be outputted.
     */
    public void print(String value) throws IOException {try{__CLR4_4_19r9rl6l8x0dh.R.inc(523);
        __CLR4_4_19r9rl6l8x0dh.R.inc(524);print(value, true);
    }finally{__CLR4_4_19r9rl6l8x0dh.R.flushNeeded();}}
}
