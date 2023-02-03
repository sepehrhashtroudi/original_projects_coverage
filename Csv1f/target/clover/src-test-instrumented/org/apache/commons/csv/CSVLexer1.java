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

import static org.apache.commons.csv.Token.Type.*;

class CSVLexer1 extends Lexer {public static class __CLR4_4_1kvkvl6l8x0h8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,897,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final StringBuilder wsBuf = new StringBuilder();
    
    // ctor needs to be public so can be called dynamically by PerformanceTest class
    public CSVLexer1(CSVFormat format, ExtendedBufferedReader in) {
        super(format, in);__CLR4_4_1kvkvl6l8x0h8.R.inc(752);try{__CLR4_4_1kvkvl6l8x0h8.R.inc(751);
    }finally{__CLR4_4_1kvkvl6l8x0h8.R.flushNeeded();}}
    
    /**
     * Returns the next token.
     * <p/>
     * A token corresponds to a term, a record change or an end-of-file indicator.
     *
     * @param tkn an existing Token object to reuse. The caller is responsible to initialize the Token.
     * @return the next token found
     * @throws java.io.IOException on stream access error
     */
    @Override
    Token nextToken(Token tkn) throws IOException {try{__CLR4_4_1kvkvl6l8x0h8.R.inc(753);
        __CLR4_4_1kvkvl6l8x0h8.R.inc(754);wsBuf.setLength(0); // reuse

        // get the last read char (required for empty line detection)
        __CLR4_4_1kvkvl6l8x0h8.R.inc(755);int lastChar = in.readAgain();

        //  read the next char and set eol
        /* note: unfortunately isEndOfLine may consumes a character silently.
        *       this has no effect outside of the method. so a simple workaround
        *       is to call 'readAgain' on the stream...
        */
        __CLR4_4_1kvkvl6l8x0h8.R.inc(756);int c = in.read();
        __CLR4_4_1kvkvl6l8x0h8.R.inc(757);boolean eol = isEndOfLine(c);
        __CLR4_4_1kvkvl6l8x0h8.R.inc(758);c = in.readAgain();

        //  empty line detection: eol AND (last char was EOL or beginning)
        __CLR4_4_1kvkvl6l8x0h8.R.inc(759);if ((((format.isEmptyLinesIgnored())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(760)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(761)==0&false))) {{
            __CLR4_4_1kvkvl6l8x0h8.R.inc(762);while ((((eol
                    && (lastChar == '\n' || lastChar == '\r' || lastChar == ExtendedBufferedReader.UNDEFINED)
                    && !isEndOfFile(lastChar))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(763)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(764)==0&false))) {{
                // go on char ahead ...
                __CLR4_4_1kvkvl6l8x0h8.R.inc(765);lastChar = c;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(766);c = in.read();
                __CLR4_4_1kvkvl6l8x0h8.R.inc(767);eol = isEndOfLine(c);
                __CLR4_4_1kvkvl6l8x0h8.R.inc(768);c = in.readAgain();
                // reached end of file without any content (empty line at the end)
                __CLR4_4_1kvkvl6l8x0h8.R.inc(769);if ((((isEndOfFile(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(770)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(771)==0&false))) {{
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(772);tkn.type = EOF;
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(773);return tkn;
                }
            }}
        }}

        // did we reach eof during the last iteration already ? EOF
        }__CLR4_4_1kvkvl6l8x0h8.R.inc(774);if ((((isEndOfFile(lastChar) || (lastChar != format.getDelimiter() && isEndOfFile(c)))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(775)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(776)==0&false))) {{
            __CLR4_4_1kvkvl6l8x0h8.R.inc(777);tkn.type = EOF;
            __CLR4_4_1kvkvl6l8x0h8.R.inc(778);return tkn;
        }

        //  important: make sure a new char gets consumed in each iteration
        }__CLR4_4_1kvkvl6l8x0h8.R.inc(779);while ((((!tkn.isReady && tkn.type != EOF)&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(780)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(781)==0&false))) {{
            // ignore whitespaces at beginning of a token
            __CLR4_4_1kvkvl6l8x0h8.R.inc(782);if ((((format.isSurroundingSpacesIgnored())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(783)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(784)==0&false))) {{
                __CLR4_4_1kvkvl6l8x0h8.R.inc(785);while ((((isWhitespace(c) && !eol)&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(786)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(787)==0&false))) {{
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(788);wsBuf.append((char) c);
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(789);c = in.read();
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(790);eol = isEndOfLine(c);
                }
            }}
            
            // ok, start of token reached: comment, encapsulated, or token
            }__CLR4_4_1kvkvl6l8x0h8.R.inc(791);if ((((c == format.getCommentStart())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(792)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(793)==0&false))) {{
                // ignore everything till end of line and continue (incr linecount)
                __CLR4_4_1kvkvl6l8x0h8.R.inc(794);in.readLine();
                __CLR4_4_1kvkvl6l8x0h8.R.inc(795);tkn = nextToken(tkn.reset());
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(796);if ((((c == format.getDelimiter())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(797)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(798)==0&false))) {{
                // empty token return TOKEN("")
                __CLR4_4_1kvkvl6l8x0h8.R.inc(799);tkn.type = TOKEN;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(800);tkn.isReady = true;
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(801);if ((((eol)&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(802)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(803)==0&false))) {{
                // empty token return EORECORD("")
                //noop: tkn.content.append("");
                __CLR4_4_1kvkvl6l8x0h8.R.inc(804);tkn.type = EORECORD;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(805);tkn.isReady = true;
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(806);if ((((c == format.getEncapsulator())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(807)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(808)==0&false))) {{
                // consume encapsulated token
                __CLR4_4_1kvkvl6l8x0h8.R.inc(809);encapsulatedTokenLexer(tkn, c);
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(810);if ((((isEndOfFile(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(811)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(812)==0&false))) {{
                // end of file return EOF()
                //noop: tkn.content.append("");
                __CLR4_4_1kvkvl6l8x0h8.R.inc(813);tkn.type = EOF;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(814);tkn.isReady = true;
            } }else {{
                // next token must be a simple token
                // add removed blanks when not ignoring whitespace chars...
                __CLR4_4_1kvkvl6l8x0h8.R.inc(815);if ((((!format.isSurroundingSpacesIgnored())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(816)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(817)==0&false))) {{
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(818);tkn.content.append(wsBuf);
                }
                }__CLR4_4_1kvkvl6l8x0h8.R.inc(819);simpleTokenLexer(tkn, c);
            }
        }}}}}}
        }__CLR4_4_1kvkvl6l8x0h8.R.inc(820);return tkn;
    }finally{__CLR4_4_1kvkvl6l8x0h8.R.flushNeeded();}}

    /**
     * A simple token lexer
     * <p/>
     * Simple token are tokens which are not surrounded by encapsulators.
     * A simple token might contain escaped delimiters (as \, or \;). The
     * token is finished when one of the following conditions become true:
     * <ul>
     *   <li>end of line has been reached (EORECORD)</li>
     *   <li>end of stream has been reached (EOF)</li>
     *   <li>an unescaped delimiter has been reached (TOKEN)</li>
     * </ul>
     *
     * @param tkn the current token
     * @param c   the current character
     * @return the filled token
     * @throws IOException on stream access error
     */
    private Token simpleTokenLexer(Token tkn, int c) throws IOException {try{__CLR4_4_1kvkvl6l8x0h8.R.inc(821);
        __CLR4_4_1kvkvl6l8x0h8.R.inc(822);while (true) {{
            __CLR4_4_1kvkvl6l8x0h8.R.inc(823);if ((((isEndOfLine(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(824)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(825)==0&false))) {{
                // end of record
                __CLR4_4_1kvkvl6l8x0h8.R.inc(826);tkn.type = EORECORD;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(827);tkn.isReady = true;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(828);break;
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(829);if ((((isEndOfFile(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(830)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(831)==0&false))) {{
                // end of file
                __CLR4_4_1kvkvl6l8x0h8.R.inc(832);tkn.type = EOF;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(833);tkn.isReady = true;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(834);break;
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(835);if ((((c == format.getDelimiter())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(836)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(837)==0&false))) {{
                // end of token
                __CLR4_4_1kvkvl6l8x0h8.R.inc(838);tkn.type = TOKEN;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(839);tkn.isReady = true;
                __CLR4_4_1kvkvl6l8x0h8.R.inc(840);break;
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(841);if ((((c == format.getEscape())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(842)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(843)==0&false))) {{
                __CLR4_4_1kvkvl6l8x0h8.R.inc(844);tkn.content.append((char) readEscape(c));
            } }else {{
                __CLR4_4_1kvkvl6l8x0h8.R.inc(845);tkn.content.append((char) c);
            }

            }}}}__CLR4_4_1kvkvl6l8x0h8.R.inc(846);c = in.read();
        }

        }__CLR4_4_1kvkvl6l8x0h8.R.inc(847);if ((((format.isSurroundingSpacesIgnored())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(848)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(849)==0&false))) {{
            __CLR4_4_1kvkvl6l8x0h8.R.inc(850);trimTrailingSpaces(tkn.content);
        }

        }__CLR4_4_1kvkvl6l8x0h8.R.inc(851);return tkn;
    }finally{__CLR4_4_1kvkvl6l8x0h8.R.flushNeeded();}}

    /**
     * An encapsulated token lexer
     * <p/>
     * Encapsulated tokens are surrounded by the given encapsulating-string.
     * The encapsulator itself might be included in the token using a
     * doubling syntax (as "", '') or using escaping (as in \", \').
     * Whitespaces before and after an encapsulated token are ignored.
     *
     * @param tkn the current token
     * @param c   the current character
     * @return a valid token object
     * @throws IOException on invalid state
     */
    private Token encapsulatedTokenLexer(Token tkn, int c) throws IOException {try{__CLR4_4_1kvkvl6l8x0h8.R.inc(852);
        // save current line
        __CLR4_4_1kvkvl6l8x0h8.R.inc(853);int startLineNumber = getLineNumber();
        // ignore the given delimiter
        // assert c == delimiter;
        __CLR4_4_1kvkvl6l8x0h8.R.inc(854);while (true) {{
            __CLR4_4_1kvkvl6l8x0h8.R.inc(855);c = in.read();
            
            __CLR4_4_1kvkvl6l8x0h8.R.inc(856);if ((((c == format.getEscape())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(857)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(858)==0&false))) {{
                __CLR4_4_1kvkvl6l8x0h8.R.inc(859);tkn.content.append((char) readEscape(c));
            } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(860);if ((((c == format.getEncapsulator())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(861)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(862)==0&false))) {{
                __CLR4_4_1kvkvl6l8x0h8.R.inc(863);if ((((in.lookAhead() == format.getEncapsulator())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(864)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(865)==0&false))) {{
                    // double or escaped encapsulator -> add single encapsulator to token
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(866);c = in.read();
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(867);tkn.content.append((char) c);
                } }else {{
                    // token finish mark (encapsulator) reached: ignore whitespace till delimiter
                    __CLR4_4_1kvkvl6l8x0h8.R.inc(868);while (true) {{
                        __CLR4_4_1kvkvl6l8x0h8.R.inc(869);c = in.read();
                        __CLR4_4_1kvkvl6l8x0h8.R.inc(870);if ((((c == format.getDelimiter())&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(871)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(872)==0&false))) {{
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(873);tkn.type = TOKEN;
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(874);tkn.isReady = true;
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(875);return tkn;
                        } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(876);if ((((isEndOfFile(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(877)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(878)==0&false))) {{
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(879);tkn.type = EOF;
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(880);tkn.isReady = true;
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(881);return tkn;
                        } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(882);if ((((isEndOfLine(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(883)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(884)==0&false))) {{
                            // ok eo token reached
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(885);tkn.type = EORECORD;
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(886);tkn.isReady = true;
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(887);return tkn;
                        } }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(888);if ((((!isWhitespace(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(889)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(890)==0&false))) {{
                            // error invalid char between token and next delimiter
                            __CLR4_4_1kvkvl6l8x0h8.R.inc(891);throw new IOException("(line " + getLineNumber() + ") invalid char between encapsulated token and delimiter");
                        }
                    }}}}}
                }}
            }} }else {__CLR4_4_1kvkvl6l8x0h8.R.inc(892);if ((((isEndOfFile(c))&&(__CLR4_4_1kvkvl6l8x0h8.R.iget(893)!=0|true))||(__CLR4_4_1kvkvl6l8x0h8.R.iget(894)==0&false))) {{
                // error condition (end of file before end of token)
                __CLR4_4_1kvkvl6l8x0h8.R.inc(895);throw new IOException("(startline " + startLineNumber + ") EOF reached before encapsulated token finished");
            } }else {{
                // consume character
                __CLR4_4_1kvkvl6l8x0h8.R.inc(896);tkn.content.append((char) c);
            }
        }}}}
    }}finally{__CLR4_4_1kvkvl6l8x0h8.R.flushNeeded();}}

}