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
package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

/**
 * Utility methods used by formatters.
 * <p>
 * FormatUtils is thread-safe and immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public class FormatUtils {public static class __CLR4_4_1dfbdfblc8aztjj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,17652,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final double LOG_10 = Math.log(10);

    /**
     * Restricted constructor.
     */
    private FormatUtils() {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17399);
    }finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf receives integer converted to a string
     * @param value value to convert to a string
     * @param size minumum amount of digits to append
     */
    public static void appendPaddedInteger(StringBuffer buf, int value, int size) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17400);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17401);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17402)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17403)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17404);buf.append('-');
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17405);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17406)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17407)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17408);value = -value;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17409);for (; (((size > 10)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17410)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17411)==0&false)); size--) {{
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17412);buf.append('0');
                }
                }__CLR4_4_1dfbdfblc8aztjj.R.inc(17413);buf.append("" + -(long)Integer.MIN_VALUE);
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17414);return;
            }
        }}
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17415);if ((((value < 10)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17416)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17417)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17418);for (; (((size > 1)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17419)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17420)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17421);buf.append('0');
            }
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17422);buf.append((char)(value + '0'));
        } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17423);if ((((value < 100)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17424)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17425)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17426);for (; (((size > 2)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17427)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17428)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17429);buf.append('0');
            }
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17430);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17431);buf.append((char) (d + '0'));
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17432);buf.append((char) (value - (d << 3) - (d << 1) + '0'));
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17433);int digits;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17434);if ((((value < 1000)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17435)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17436)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17437);digits = 3;
            } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17438);if ((((value < 10000)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17439)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17440)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17441);digits = 4;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17442);digits = (int)(Math.log(value) / LOG_10) + 1;
            }
            }}__CLR4_4_1dfbdfblc8aztjj.R.inc(17443);for (; (((size > digits)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17444)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17445)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17446);buf.append('0');
            }
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17447);buf.append(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf receives integer converted to a string
     * @param value value to convert to a string
     * @param size minumum amount of digits to append
     */
    public static void appendPaddedInteger(StringBuffer buf, long value, int size) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17448);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17449);int intValue = (int)value;
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17450);if ((((intValue == value)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17451)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17452)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17453);appendPaddedInteger(buf, intValue, size);
        } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17454);if ((((size <= 19)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17455)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17456)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17457);buf.append(Long.toString(value));
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17458);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17459)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17460)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17461);buf.append('-');
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17462);if ((((value != Long.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17463)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17464)==0&false))) {{
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17465);value = -value;
                } }else {{
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17466);for (; (((size > 19)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17467)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17468)==0&false)); size--) {{
                        __CLR4_4_1dfbdfblc8aztjj.R.inc(17469);buf.append('0');
                    }
                    }__CLR4_4_1dfbdfblc8aztjj.R.inc(17470);buf.append("9223372036854775808");
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17471);return;
                }
            }}
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17472);int digits = (int)(Math.log(value) / LOG_10) + 1;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17473);for (; (((size > digits)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17474)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17475)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17476);buf.append('0');
            }
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17477);buf.append(Long.toString(value));
        }
    }}}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out receives integer converted to a string
     * @param value value to convert to a string
     * @param size minumum amount of digits to append
     */
    public static void writePaddedInteger(Writer out, int value, int size)
        throws IOException
    {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17478);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17479);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17480)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17481)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17482);out.write('-');
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17483);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17484)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17485)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17486);value = -value;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17487);for (; (((size > 10)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17488)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17489)==0&false)); size--) {{
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17490);out.write('0');
                }
                }__CLR4_4_1dfbdfblc8aztjj.R.inc(17491);out.write("" + -(long)Integer.MIN_VALUE);
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17492);return;
            }
        }}
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17493);if ((((value < 10)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17494)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17495)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17496);for (; (((size > 1)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17497)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17498)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17499);out.write('0');
            }
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17500);out.write(value + '0');
        } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17501);if ((((value < 100)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17502)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17503)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17504);for (; (((size > 2)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17505)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17506)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17507);out.write('0');
            }
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17508);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17509);out.write(d + '0');
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17510);out.write(value - (d << 3) - (d << 1) + '0');
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17511);int digits;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17512);if ((((value < 1000)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17513)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17514)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17515);digits = 3;
            } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17516);if ((((value < 10000)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17517)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17518)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17519);digits = 4;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17520);digits = (int)(Math.log(value) / LOG_10) + 1;
            }
            }}__CLR4_4_1dfbdfblc8aztjj.R.inc(17521);for (; (((size > digits)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17522)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17523)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17524);out.write('0');
            }
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17525);out.write(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, prepended with a variable amount of '0'
     * pad characters, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out receives integer converted to a string
     * @param value value to convert to a string
     * @param size minumum amount of digits to append
     */
    public static void writePaddedInteger(Writer out, long value, int size)
        throws IOException
    {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17526);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17527);int intValue = (int)value;
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17528);if ((((intValue == value)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17529)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17530)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17531);writePaddedInteger(out, intValue, size);
        } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17532);if ((((size <= 19)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17533)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17534)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17535);out.write(Long.toString(value));
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17536);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17537)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17538)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17539);out.write('-');
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17540);if ((((value != Long.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17541)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17542)==0&false))) {{
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17543);value = -value;
                } }else {{
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17544);for (; (((size > 19)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17545)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17546)==0&false)); size--) {{
                        __CLR4_4_1dfbdfblc8aztjj.R.inc(17547);out.write('0');
                    }
                    }__CLR4_4_1dfbdfblc8aztjj.R.inc(17548);out.write("9223372036854775808");
                    __CLR4_4_1dfbdfblc8aztjj.R.inc(17549);return;
                }
            }}
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17550);int digits = (int)(Math.log(value) / LOG_10) + 1;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17551);for (; (((size > digits)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17552)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17553)==0&false)); size--) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17554);out.write('0');
            }
            }__CLR4_4_1dfbdfblc8aztjj.R.inc(17555);out.write(Long.toString(value));
        }
    }}}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void appendUnpaddedInteger(StringBuffer buf, int value) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17556);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17557);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17558)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17559)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17560);buf.append('-');
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17561);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17562)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17563)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17564);value = -value;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17565);buf.append("" + -(long)Integer.MIN_VALUE);
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17566);return;
            }
        }}
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17567);if ((((value < 10)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17568)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17569)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17570);buf.append((char)(value + '0'));
        } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17571);if ((((value < 100)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17572)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17573)==0&false))) {{
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17574);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17575);buf.append((char) (d + '0'));
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17576);buf.append((char) (value - (d << 3) - (d << 1) + '0'));
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17577);buf.append(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and appends it to the given buffer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param buf receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void appendUnpaddedInteger(StringBuffer buf, long value) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17578);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17579);int intValue = (int)value;
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17580);if ((((intValue == value)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17581)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17582)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17583);appendUnpaddedInteger(buf, intValue);
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17584);buf.append(Long.toString(value));
        }
    }}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void writeUnpaddedInteger(Writer out, int value)
        throws IOException
    {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17585);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17586);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17587)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17588)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17589);out.write('-');
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17590);if ((((value != Integer.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17591)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17592)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17593);value = -value;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17594);out.write("" + -(long)Integer.MIN_VALUE);
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17595);return;
            }
        }}
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17596);if ((((value < 10)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17597)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17598)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17599);out.write(value + '0');
        } }else {__CLR4_4_1dfbdfblc8aztjj.R.inc(17600);if ((((value < 100)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17601)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17602)==0&false))) {{
            // Calculate value div/mod by 10 without using two expensive
            // division operations. (2 ^ 27) / 10 = 13421772. Add one to
            // value to correct rounding error.
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17603);int d = ((value + 1) * 13421772) >> 27;
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17604);out.write(d + '0');
            // Append remainder by calculating (value - d * 10).
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17605);out.write(value - (d << 3) - (d << 1) + '0');
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17606);out.write(Integer.toString(value));
        }
    }}}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Converts an integer to a string, and writes it to the given writer.
     *
     * <p>This method is optimized for converting small values to strings.
     *
     * @param out receives integer converted to a string
     * @param value value to convert to a string
     */
    public static void writeUnpaddedInteger(Writer out, long value)
        throws IOException
    {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17607);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17608);int intValue = (int)value;
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17609);if ((((intValue == value)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17610)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17611)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17612);writeUnpaddedInteger(out, intValue);
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17613);out.write(Long.toString(value));
        }
    }}finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    /**
     * Calculates the number of decimal digits for the given value,
     * including the sign.
     */
    public static int calculateDigitCount(long value) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17614);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17615);if ((((value < 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17616)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17617)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17618);if ((((value != Long.MIN_VALUE)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17619)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17620)==0&false))) {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17621);return calculateDigitCount(-value) + 1;
            } }else {{
                __CLR4_4_1dfbdfblc8aztjj.R.inc(17622);return 20;
            }
        }}
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17623);return 
            ((((value < 10 )&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17624)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17625)==0&false))? 1 :
             ((((value < 100 )&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17626)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17627)==0&false))? 2 :
              ((((value < 1000 )&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17628)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17629)==0&false))? 3 :
               ((((value < 10000 )&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17630)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17631)==0&false))? 4 :
                ((int)(Math.log(value) / LOG_10) + 1)))));
    }finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    static int parseTwoDigits(String text, int position) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17632);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17633);int value = text.charAt(position) - '0';
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17634);return ((value << 3) + (value << 1)) + text.charAt(position + 1) - '0';
    }finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

    static String createErrorMessage(final String text, final int errorPos) {try{__CLR4_4_1dfbdfblc8aztjj.R.inc(17635);
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17636);int sampleLen = errorPos + 32;
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17637);String sampleText;
        __CLR4_4_1dfbdfblc8aztjj.R.inc(17638);if ((((text.length() <= sampleLen + 3)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17639)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17640)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17641);sampleText = text;
        } }else {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17642);sampleText = text.substring(0, sampleLen).concat("...");
        }
        
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17643);if ((((errorPos <= 0)&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17644)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17645)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17646);return "Invalid format: \"" + sampleText + '"';
        }
        
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17647);if ((((errorPos >= text.length())&&(__CLR4_4_1dfbdfblc8aztjj.R.iget(17648)!=0|true))||(__CLR4_4_1dfbdfblc8aztjj.R.iget(17649)==0&false))) {{
            __CLR4_4_1dfbdfblc8aztjj.R.inc(17650);return "Invalid format: \"" + sampleText + "\" is too short";
        }
        
        }__CLR4_4_1dfbdfblc8aztjj.R.inc(17651);return "Invalid format: \"" + sampleText + "\" is malformed at \"" +
            sampleText.substring(errorPos) + '"';
    }finally{__CLR4_4_1dfbdfblc8aztjj.R.flushNeeded();}}

}
