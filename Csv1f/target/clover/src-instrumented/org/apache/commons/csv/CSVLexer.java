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

class CSVLexer extends Lexer {public static class __CLR4_4_13c3cl6l8x0c5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906528L,8589935092L,254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ctor needs to be public so can be called dynamically by PerformanceTest class
    public CSVLexer(CSVFormat format, ExtendedBufferedReader in) {
        super(format, in);__CLR4_4_13c3cl6l8x0c5.R.inc(121);try{__CLR4_4_13c3cl6l8x0c5.R.inc(120);
    }finally{__CLR4_4_13c3cl6l8x0c5.R.flushNeeded();}}
    
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
    Token nextToken(Token tkn) throws IOException {try{__CLR4_4_13c3cl6l8x0c5.R.inc(122);

        // get the last read char (required for empty line detection)
        __CLR4_4_13c3cl6l8x0c5.R.inc(123);int lastChar = in.readAgain();

        //  read the next char and set eol
        /* note: unfortunately isEndOfLine may consumes a character silently.
        *       this has no effect outside of the method. so a simple workaround
        *       is to call 'readAgain' on the stream...
        */
        __CLR4_4_13c3cl6l8x0c5.R.inc(124);int c = in.read();
        __CLR4_4_13c3cl6l8x0c5.R.inc(125);boolean eol = isEndOfLine(c);
        __CLR4_4_13c3cl6l8x0c5.R.inc(126);c = in.readAgain();

        //  empty line detection: eol AND (last char was EOL or beginning)
        __CLR4_4_13c3cl6l8x0c5.R.inc(127);if ((((emptyLinesIgnored)&&(__CLR4_4_13c3cl6l8x0c5.R.iget(128)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(129)==0&false))) {{
            __CLR4_4_13c3cl6l8x0c5.R.inc(130);while ((((eol
                    && (lastChar == '\n' || lastChar == '\r' || lastChar == ExtendedBufferedReader.UNDEFINED)
                    && !isEndOfFile(lastChar))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(131)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(132)==0&false))) {{
                // go on char ahead ...
                __CLR4_4_13c3cl6l8x0c5.R.inc(133);lastChar = c;
                __CLR4_4_13c3cl6l8x0c5.R.inc(134);c = in.read();
                __CLR4_4_13c3cl6l8x0c5.R.inc(135);eol = isEndOfLine(c);
                __CLR4_4_13c3cl6l8x0c5.R.inc(136);c = in.readAgain();
                // reached end of file without any content (empty line at the end)
                __CLR4_4_13c3cl6l8x0c5.R.inc(137);if ((((isEndOfFile(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(138)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(139)==0&false))) {{
                    __CLR4_4_13c3cl6l8x0c5.R.inc(140);tkn.type = EOF;
                    // don't set tkn.isReady here because no content
                    __CLR4_4_13c3cl6l8x0c5.R.inc(141);return tkn;
                }
            }}
        }}

        // did we reach eof during the last iteration already ? EOF
        }__CLR4_4_13c3cl6l8x0c5.R.inc(142);if ((((isEndOfFile(lastChar) || (!isDelimiter(lastChar) && isEndOfFile(c)))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(143)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(144)==0&false))) {{
            __CLR4_4_13c3cl6l8x0c5.R.inc(145);tkn.type = EOF;
            // don't set tkn.isReady here because no content
            __CLR4_4_13c3cl6l8x0c5.R.inc(146);return tkn;
        }

        //  important: make sure a new char gets consumed in each iteration
        }__CLR4_4_13c3cl6l8x0c5.R.inc(147);while ((((tkn.type == INVALID)&&(__CLR4_4_13c3cl6l8x0c5.R.iget(148)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(149)==0&false))) {{
            // ignore whitespaces at beginning of a token
            __CLR4_4_13c3cl6l8x0c5.R.inc(150);if ((((surroundingSpacesIgnored)&&(__CLR4_4_13c3cl6l8x0c5.R.iget(151)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(152)==0&false))) {{
                __CLR4_4_13c3cl6l8x0c5.R.inc(153);while ((((isWhitespace(c) && !eol)&&(__CLR4_4_13c3cl6l8x0c5.R.iget(154)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(155)==0&false))) {{
                    __CLR4_4_13c3cl6l8x0c5.R.inc(156);c = in.read();
                    __CLR4_4_13c3cl6l8x0c5.R.inc(157);eol = isEndOfLine(c);
                }
            }}
            
            // ok, start of token reached: comment, encapsulated, or token
            }__CLR4_4_13c3cl6l8x0c5.R.inc(158);if ((((isCommentStart(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(159)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(160)==0&false))) {{
                // ignore everything till end of line and continue (incr linecount)
                __CLR4_4_13c3cl6l8x0c5.R.inc(161);in.readLine();
                __CLR4_4_13c3cl6l8x0c5.R.inc(162);tkn = nextToken(tkn.reset());
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(163);if ((((isDelimiter(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(164)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(165)==0&false))) {{
                // empty token return TOKEN("")
                __CLR4_4_13c3cl6l8x0c5.R.inc(166);tkn.type = TOKEN;
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(167);if ((((eol)&&(__CLR4_4_13c3cl6l8x0c5.R.iget(168)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(169)==0&false))) {{
                // empty token return EORECORD("")
                //noop: tkn.content.append("");
                __CLR4_4_13c3cl6l8x0c5.R.inc(170);tkn.type = EORECORD;
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(171);if ((((isEncapsulator(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(172)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(173)==0&false))) {{
                // consume encapsulated token
                __CLR4_4_13c3cl6l8x0c5.R.inc(174);encapsulatedTokenLexer(tkn, c);
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(175);if ((((isEndOfFile(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(176)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(177)==0&false))) {{
                // end of file return EOF()
                //noop: tkn.content.append("");
                __CLR4_4_13c3cl6l8x0c5.R.inc(178);tkn.type = EOF;
                __CLR4_4_13c3cl6l8x0c5.R.inc(179);tkn.isReady = true; // there is data at EOF
            } }else {{
                // next token must be a simple token
                // add removed blanks when not ignoring whitespace chars...
                __CLR4_4_13c3cl6l8x0c5.R.inc(180);simpleTokenLexer(tkn, c);
            }
        }}}}}}
        }__CLR4_4_13c3cl6l8x0c5.R.inc(181);return tkn;
    }finally{__CLR4_4_13c3cl6l8x0c5.R.flushNeeded();}}

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
    private Token simpleTokenLexer(Token tkn, int c) throws IOException {try{__CLR4_4_13c3cl6l8x0c5.R.inc(182);
        __CLR4_4_13c3cl6l8x0c5.R.inc(183);while (true) {{
            __CLR4_4_13c3cl6l8x0c5.R.inc(184);if ((((isEndOfLine(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(185)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(186)==0&false))) {{
                // end of record
                __CLR4_4_13c3cl6l8x0c5.R.inc(187);tkn.type = EORECORD;
                __CLR4_4_13c3cl6l8x0c5.R.inc(188);break;
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(189);if ((((isEndOfFile(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(190)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(191)==0&false))) {{
                // end of file
                __CLR4_4_13c3cl6l8x0c5.R.inc(192);tkn.type = EOF;
                __CLR4_4_13c3cl6l8x0c5.R.inc(193);tkn.isReady = true; // There is data at EOF
                __CLR4_4_13c3cl6l8x0c5.R.inc(194);break;
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(195);if ((((isDelimiter(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(196)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(197)==0&false))) {{
                // end of token
                __CLR4_4_13c3cl6l8x0c5.R.inc(198);tkn.type = TOKEN;
                __CLR4_4_13c3cl6l8x0c5.R.inc(199);break;
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(200);if ((((isEscape(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(201)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(202)==0&false))) {{
                __CLR4_4_13c3cl6l8x0c5.R.inc(203);tkn.content.append((char) readEscape(c));
            } }else {{
                __CLR4_4_13c3cl6l8x0c5.R.inc(204);tkn.content.append((char) c);
            }

            }}}}__CLR4_4_13c3cl6l8x0c5.R.inc(205);c = in.read();
        }

        }__CLR4_4_13c3cl6l8x0c5.R.inc(206);if ((((surroundingSpacesIgnored)&&(__CLR4_4_13c3cl6l8x0c5.R.iget(207)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(208)==0&false))) {{
            __CLR4_4_13c3cl6l8x0c5.R.inc(209);trimTrailingSpaces(tkn.content);
        }

        }__CLR4_4_13c3cl6l8x0c5.R.inc(210);return tkn;
    }finally{__CLR4_4_13c3cl6l8x0c5.R.flushNeeded();}}

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
    private Token encapsulatedTokenLexer(Token tkn, int c) throws IOException {try{__CLR4_4_13c3cl6l8x0c5.R.inc(211);
        // save current line
        __CLR4_4_13c3cl6l8x0c5.R.inc(212);int startLineNumber = getLineNumber();
        // ignore the given delimiter
        // assert c == delimiter;
        __CLR4_4_13c3cl6l8x0c5.R.inc(213);while (true) {{
            __CLR4_4_13c3cl6l8x0c5.R.inc(214);c = in.read();
            
            __CLR4_4_13c3cl6l8x0c5.R.inc(215);if ((((isEscape(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(216)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(217)==0&false))) {{
                __CLR4_4_13c3cl6l8x0c5.R.inc(218);tkn.content.append((char) readEscape(c));
            } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(219);if ((((isEncapsulator(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(220)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(221)==0&false))) {{
                __CLR4_4_13c3cl6l8x0c5.R.inc(222);if ((((isEncapsulator(in.lookAhead()))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(223)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(224)==0&false))) {{
                    // double or escaped encapsulator -> add single encapsulator to token
                    __CLR4_4_13c3cl6l8x0c5.R.inc(225);c = in.read();
                    __CLR4_4_13c3cl6l8x0c5.R.inc(226);tkn.content.append((char) c);
                } }else {{
                    // token finish mark (encapsulator) reached: ignore whitespace till delimiter
                    __CLR4_4_13c3cl6l8x0c5.R.inc(227);while (true) {{
                        __CLR4_4_13c3cl6l8x0c5.R.inc(228);c = in.read();
                        __CLR4_4_13c3cl6l8x0c5.R.inc(229);if ((((isDelimiter(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(230)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(231)==0&false))) {{
                            __CLR4_4_13c3cl6l8x0c5.R.inc(232);tkn.type = TOKEN;
                            __CLR4_4_13c3cl6l8x0c5.R.inc(233);return tkn;
                        } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(234);if ((((isEndOfFile(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(235)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(236)==0&false))) {{
                            __CLR4_4_13c3cl6l8x0c5.R.inc(237);tkn.type = EOF;
                            __CLR4_4_13c3cl6l8x0c5.R.inc(238);tkn.isReady = true; // There is data at EOF
                            __CLR4_4_13c3cl6l8x0c5.R.inc(239);return tkn;
                        } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(240);if ((((isEndOfLine(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(241)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(242)==0&false))) {{
                            // ok eo token reached
                            __CLR4_4_13c3cl6l8x0c5.R.inc(243);tkn.type = EORECORD;
                            __CLR4_4_13c3cl6l8x0c5.R.inc(244);return tkn;
                        } }else {__CLR4_4_13c3cl6l8x0c5.R.inc(245);if ((((!isWhitespace(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(246)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(247)==0&false))) {{
                            // error invalid char between token and next delimiter
                            __CLR4_4_13c3cl6l8x0c5.R.inc(248);throw new IOException("(line " + getLineNumber() + ") invalid char between encapsulated token and delimiter");
                        }
                    }}}}}
                }}
            }} }else {__CLR4_4_13c3cl6l8x0c5.R.inc(249);if ((((isEndOfFile(c))&&(__CLR4_4_13c3cl6l8x0c5.R.iget(250)!=0|true))||(__CLR4_4_13c3cl6l8x0c5.R.iget(251)==0&false))) {{
                // error condition (end of file before end of token)
                __CLR4_4_13c3cl6l8x0c5.R.inc(252);throw new IOException("(startline " + startLineNumber + ") EOF reached before encapsulated token finished");
            } }else {{
                // consume character
                __CLR4_4_13c3cl6l8x0c5.R.inc(253);tkn.content.append((char) c);
            }
        }}}}
    }}finally{__CLR4_4_13c3cl6l8x0c5.R.flushNeeded();}}

}