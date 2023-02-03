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

package org.apache.commons.math3.dfp;

/** Mathematical routines for use with {@link Dfp}.
 * The constants are defined in {@link DfpField}
 * @version $Id$
 * @since 2.2
 */
public class DfpMath {public static class __CLR4_4_178b78blb90p7f5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,9931,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Name for traps triggered by pow. */
    private static final String POW_TRAP = "pow";

    /**
     * Private Constructor.
     */
    private DfpMath() {try{__CLR4_4_178b78blb90p7f5.R.inc(9371);
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Breaks a string representation up into two dfp's.
     * <p>The two dfp are such that the sum of them is equivalent
     * to the input string, but has higher precision than using a
     * single dfp. This is useful for improving accuracy of
     * exponentiation and critical multiplies.
     * @param field field to which the Dfp must belong
     * @param a string representation to split
     * @return an array of two {@link Dfp} which sum is a
     */
    protected static Dfp[] split(final DfpField field, final String a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9372);
        __CLR4_4_178b78blb90p7f5.R.inc(9373);Dfp result[] = new Dfp[2];
        __CLR4_4_178b78blb90p7f5.R.inc(9374);char[] buf;
        __CLR4_4_178b78blb90p7f5.R.inc(9375);boolean leading = true;
        __CLR4_4_178b78blb90p7f5.R.inc(9376);int sp = 0;
        __CLR4_4_178b78blb90p7f5.R.inc(9377);int sig = 0;

        __CLR4_4_178b78blb90p7f5.R.inc(9378);buf = new char[a.length()];

        __CLR4_4_178b78blb90p7f5.R.inc(9379);for (int i = 0; (((i < buf.length)&&(__CLR4_4_178b78blb90p7f5.R.iget(9380)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9381)==0&false)); i++) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9382);buf[i] = a.charAt(i);

            __CLR4_4_178b78blb90p7f5.R.inc(9383);if ((((buf[i] >= '1' && buf[i] <= '9')&&(__CLR4_4_178b78blb90p7f5.R.iget(9384)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9385)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9386);leading = false;
            }

            }__CLR4_4_178b78blb90p7f5.R.inc(9387);if ((((buf[i] == '.')&&(__CLR4_4_178b78blb90p7f5.R.iget(9388)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9389)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9390);sig += (400 - sig) % 4;
                __CLR4_4_178b78blb90p7f5.R.inc(9391);leading = false;
            }

            }__CLR4_4_178b78blb90p7f5.R.inc(9392);if ((((sig == (field.getRadixDigits() / 2) * 4)&&(__CLR4_4_178b78blb90p7f5.R.iget(9393)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9394)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9395);sp = i;
                __CLR4_4_178b78blb90p7f5.R.inc(9396);break;
            }

            }__CLR4_4_178b78blb90p7f5.R.inc(9397);if ((((buf[i] >= '0' && buf[i] <= '9' && !leading)&&(__CLR4_4_178b78blb90p7f5.R.iget(9398)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9399)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9400);sig ++;
            }
        }}

        }__CLR4_4_178b78blb90p7f5.R.inc(9401);result[0] = field.newDfp(new String(buf, 0, sp));

        __CLR4_4_178b78blb90p7f5.R.inc(9402);for (int i = 0; (((i < buf.length)&&(__CLR4_4_178b78blb90p7f5.R.iget(9403)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9404)==0&false)); i++) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9405);buf[i] = a.charAt(i);
            __CLR4_4_178b78blb90p7f5.R.inc(9406);if ((((buf[i] >= '0' && buf[i] <= '9' && i < sp)&&(__CLR4_4_178b78blb90p7f5.R.iget(9407)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9408)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9409);buf[i] = '0';
            }
        }}

        }__CLR4_4_178b78blb90p7f5.R.inc(9410);result[1] = field.newDfp(new String(buf));

        __CLR4_4_178b78blb90p7f5.R.inc(9411);return result;
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Splits a {@link Dfp} into 2 {@link Dfp}'s such that their sum is equal to the input {@link Dfp}.
     * @param a number to split
     * @return two elements array containing the split number
     */
    protected static Dfp[] split(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9412);
        __CLR4_4_178b78blb90p7f5.R.inc(9413);final Dfp[] result = new Dfp[2];
        __CLR4_4_178b78blb90p7f5.R.inc(9414);final Dfp shift = a.multiply(a.power10K(a.getRadixDigits() / 2));
        __CLR4_4_178b78blb90p7f5.R.inc(9415);result[0] = a.add(shift).subtract(shift);
        __CLR4_4_178b78blb90p7f5.R.inc(9416);result[1] = a.subtract(result[0]);
        __CLR4_4_178b78blb90p7f5.R.inc(9417);return result;
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Multiply two numbers that are split in to two pieces that are
     *  meant to be added together.
     *  Use binomial multiplication so ab = a0 b0 + a0 b1 + a1 b0 + a1 b1
     *  Store the first term in result0, the rest in result1
     *  @param a first factor of the multiplication, in split form
     *  @param b second factor of the multiplication, in split form
     *  @return a &times; b, in split form
     */
    protected static Dfp[] splitMult(final Dfp[] a, final Dfp[] b) {try{__CLR4_4_178b78blb90p7f5.R.inc(9418);
        __CLR4_4_178b78blb90p7f5.R.inc(9419);final Dfp[] result = new Dfp[2];

        __CLR4_4_178b78blb90p7f5.R.inc(9420);result[1] = a[0].getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9421);result[0] = a[0].multiply(b[0]);

        /* If result[0] is infinite or zero, don't compute result[1].
         * Attempting to do so may produce NaNs.
         */

        __CLR4_4_178b78blb90p7f5.R.inc(9422);if ((((result[0].classify() == Dfp.INFINITE || result[0].equals(result[1]))&&(__CLR4_4_178b78blb90p7f5.R.iget(9423)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9424)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9425);return result;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9426);result[1] = a[0].multiply(b[1]).add(a[1].multiply(b[0])).add(a[1].multiply(b[1]));

        __CLR4_4_178b78blb90p7f5.R.inc(9427);return result;
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Divide two numbers that are split in to two pieces that are meant to be added together.
     * Inverse of split multiply above:
     *  (a+b) / (c+d) = (a/c) + ( (bc-ad)/(c**2+cd) )
     *  @param a dividend, in split form
     *  @param b divisor, in split form
     *  @return a / b, in split form
     */
    protected static Dfp[] splitDiv(final Dfp[] a, final Dfp[] b) {try{__CLR4_4_178b78blb90p7f5.R.inc(9428);
        __CLR4_4_178b78blb90p7f5.R.inc(9429);final Dfp[] result;

        __CLR4_4_178b78blb90p7f5.R.inc(9430);result = new Dfp[2];

        __CLR4_4_178b78blb90p7f5.R.inc(9431);result[0] = a[0].divide(b[0]);
        __CLR4_4_178b78blb90p7f5.R.inc(9432);result[1] = a[1].multiply(b[0]).subtract(a[0].multiply(b[1]));
        __CLR4_4_178b78blb90p7f5.R.inc(9433);result[1] = result[1].divide(b[0].multiply(b[0]).add(b[0].multiply(b[1])));

        __CLR4_4_178b78blb90p7f5.R.inc(9434);return result;
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Raise a split base to the a power.
     * @param base number to raise
     * @param a power
     * @return base<sup>a</sup>
     */
    protected static Dfp splitPow(final Dfp[] base, int a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9435);
        __CLR4_4_178b78blb90p7f5.R.inc(9436);boolean invert = false;

        __CLR4_4_178b78blb90p7f5.R.inc(9437);Dfp[] r = new Dfp[2];

        __CLR4_4_178b78blb90p7f5.R.inc(9438);Dfp[] result = new Dfp[2];
        __CLR4_4_178b78blb90p7f5.R.inc(9439);result[0] = base[0].getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9440);result[1] = base[0].getZero();

        __CLR4_4_178b78blb90p7f5.R.inc(9441);if ((((a == 0)&&(__CLR4_4_178b78blb90p7f5.R.iget(9442)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9443)==0&false))) {{
            // Special case a = 0
            __CLR4_4_178b78blb90p7f5.R.inc(9444);return result[0].add(result[1]);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9445);if ((((a < 0)&&(__CLR4_4_178b78blb90p7f5.R.iget(9446)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9447)==0&false))) {{
            // If a is less than zero
            __CLR4_4_178b78blb90p7f5.R.inc(9448);invert = true;
            __CLR4_4_178b78blb90p7f5.R.inc(9449);a = -a;
        }

        // Exponentiate by successive squaring
        }__CLR4_4_178b78blb90p7f5.R.inc(9450);do {{
            __CLR4_4_178b78blb90p7f5.R.inc(9451);r[0] = new Dfp(base[0]);
            __CLR4_4_178b78blb90p7f5.R.inc(9452);r[1] = new Dfp(base[1]);
            __CLR4_4_178b78blb90p7f5.R.inc(9453);int trial = 1;

            __CLR4_4_178b78blb90p7f5.R.inc(9454);int prevtrial;
            __CLR4_4_178b78blb90p7f5.R.inc(9455);while (true) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9456);prevtrial = trial;
                __CLR4_4_178b78blb90p7f5.R.inc(9457);trial = trial * 2;
                __CLR4_4_178b78blb90p7f5.R.inc(9458);if ((((trial > a)&&(__CLR4_4_178b78blb90p7f5.R.iget(9459)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9460)==0&false))) {{
                    __CLR4_4_178b78blb90p7f5.R.inc(9461);break;
                }
                }__CLR4_4_178b78blb90p7f5.R.inc(9462);r = splitMult(r, r);
            }

            }__CLR4_4_178b78blb90p7f5.R.inc(9463);trial = prevtrial;

            __CLR4_4_178b78blb90p7f5.R.inc(9464);a -= trial;
            __CLR4_4_178b78blb90p7f5.R.inc(9465);result = splitMult(result, r);

        } }while ((((a >= 1)&&(__CLR4_4_178b78blb90p7f5.R.iget(9466)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9467)==0&false)));

        __CLR4_4_178b78blb90p7f5.R.inc(9468);result[0] = result[0].add(result[1]);

        __CLR4_4_178b78blb90p7f5.R.inc(9469);if ((((invert)&&(__CLR4_4_178b78blb90p7f5.R.iget(9470)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9471)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9472);result[0] = base[0].getOne().divide(result[0]);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9473);return result[0];

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Raises base to the power a by successive squaring.
     * @param base number to raise
     * @param a power
     * @return base<sup>a</sup>
     */
    public static Dfp pow(Dfp base, int a)
    {try{__CLR4_4_178b78blb90p7f5.R.inc(9474);
        __CLR4_4_178b78blb90p7f5.R.inc(9475);boolean invert = false;

        __CLR4_4_178b78blb90p7f5.R.inc(9476);Dfp result = base.getOne();

        __CLR4_4_178b78blb90p7f5.R.inc(9477);if ((((a == 0)&&(__CLR4_4_178b78blb90p7f5.R.iget(9478)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9479)==0&false))) {{
            // Special case
            __CLR4_4_178b78blb90p7f5.R.inc(9480);return result;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9481);if ((((a < 0)&&(__CLR4_4_178b78blb90p7f5.R.iget(9482)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9483)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9484);invert = true;
            __CLR4_4_178b78blb90p7f5.R.inc(9485);a = -a;
        }

        // Exponentiate by successive squaring
        }__CLR4_4_178b78blb90p7f5.R.inc(9486);do {{
            __CLR4_4_178b78blb90p7f5.R.inc(9487);Dfp r = new Dfp(base);
            __CLR4_4_178b78blb90p7f5.R.inc(9488);Dfp prevr;
            __CLR4_4_178b78blb90p7f5.R.inc(9489);int trial = 1;
            __CLR4_4_178b78blb90p7f5.R.inc(9490);int prevtrial;

            __CLR4_4_178b78blb90p7f5.R.inc(9491);do {{
                __CLR4_4_178b78blb90p7f5.R.inc(9492);prevr = new Dfp(r);
                __CLR4_4_178b78blb90p7f5.R.inc(9493);prevtrial = trial;
                __CLR4_4_178b78blb90p7f5.R.inc(9494);r = r.multiply(r);
                __CLR4_4_178b78blb90p7f5.R.inc(9495);trial = trial * 2;
            } }while ((((a>trial)&&(__CLR4_4_178b78blb90p7f5.R.iget(9496)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9497)==0&false)));

            __CLR4_4_178b78blb90p7f5.R.inc(9498);r = prevr;
            __CLR4_4_178b78blb90p7f5.R.inc(9499);trial = prevtrial;

            __CLR4_4_178b78blb90p7f5.R.inc(9500);a = a - trial;
            __CLR4_4_178b78blb90p7f5.R.inc(9501);result = result.multiply(r);

        } }while ((((a >= 1)&&(__CLR4_4_178b78blb90p7f5.R.iget(9502)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9503)==0&false)));

        __CLR4_4_178b78blb90p7f5.R.inc(9504);if ((((invert)&&(__CLR4_4_178b78blb90p7f5.R.iget(9505)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9506)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9507);result = base.getOne().divide(result);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9508);return base.newInstance(result);

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Computes e to the given power.
     * a is broken into two parts, such that a = n+m  where n is an integer.
     * We use pow() to compute e<sup>n</sup> and a Taylor series to compute
     * e<sup>m</sup>.  We return e*<sup>n</sup> &times; e<sup>m</sup>
     * @param a power at which e should be raised
     * @return e<sup>a</sup>
     */
    public static Dfp exp(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9509);

        __CLR4_4_178b78blb90p7f5.R.inc(9510);final Dfp inta = a.rint();
        __CLR4_4_178b78blb90p7f5.R.inc(9511);final Dfp fraca = a.subtract(inta);

        __CLR4_4_178b78blb90p7f5.R.inc(9512);final int ia = inta.intValue();
        __CLR4_4_178b78blb90p7f5.R.inc(9513);if ((((ia > 2147483646)&&(__CLR4_4_178b78blb90p7f5.R.iget(9514)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9515)==0&false))) {{
            // return +Infinity
            __CLR4_4_178b78blb90p7f5.R.inc(9516);return a.newInstance((byte)1, Dfp.INFINITE);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9517);if ((((ia < -2147483646)&&(__CLR4_4_178b78blb90p7f5.R.iget(9518)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9519)==0&false))) {{
            // return 0;
            __CLR4_4_178b78blb90p7f5.R.inc(9520);return a.newInstance();
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9521);final Dfp einta = splitPow(a.getField().getESplit(), ia);
        __CLR4_4_178b78blb90p7f5.R.inc(9522);final Dfp efraca = expInternal(fraca);

        __CLR4_4_178b78blb90p7f5.R.inc(9523);return einta.multiply(efraca);
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Computes e to the given power.
     * Where -1 < a < 1.  Use the classic Taylor series.  1 + x**2/2! + x**3/3! + x**4/4!  ...
     * @param a power at which e should be raised
     * @return e<sup>a</sup>
     */
    protected static Dfp expInternal(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9524);
        __CLR4_4_178b78blb90p7f5.R.inc(9525);Dfp y = a.getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9526);Dfp x = a.getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9527);Dfp fact = a.getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9528);Dfp py = new Dfp(y);

        __CLR4_4_178b78blb90p7f5.R.inc(9529);for (int i = 1; (((i < 90)&&(__CLR4_4_178b78blb90p7f5.R.iget(9530)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9531)==0&false)); i++) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9532);x = x.multiply(a);
            __CLR4_4_178b78blb90p7f5.R.inc(9533);fact = fact.divide(i);
            __CLR4_4_178b78blb90p7f5.R.inc(9534);y = y.add(x.multiply(fact));
            __CLR4_4_178b78blb90p7f5.R.inc(9535);if ((((y.equals(py))&&(__CLR4_4_178b78blb90p7f5.R.iget(9536)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9537)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9538);break;
            }
            }__CLR4_4_178b78blb90p7f5.R.inc(9539);py = new Dfp(y);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9540);return y;
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Returns the natural logarithm of a.
     * a is first split into three parts such that  a = (10000^h)(2^j)k.
     * ln(a) is computed by ln(a) = ln(5)*h + ln(2)*(h+j) + ln(k)
     * k is in the range 2/3 < k <4/3 and is passed on to a series expansion.
     * @param a number from which logarithm is requested
     * @return log(a)
     */
    public static Dfp log(Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9541);
        __CLR4_4_178b78blb90p7f5.R.inc(9542);int lr;
        __CLR4_4_178b78blb90p7f5.R.inc(9543);Dfp x;
        __CLR4_4_178b78blb90p7f5.R.inc(9544);int ix;
        __CLR4_4_178b78blb90p7f5.R.inc(9545);int p2 = 0;

        // Check the arguments somewhat here
        __CLR4_4_178b78blb90p7f5.R.inc(9546);if ((((a.equals(a.getZero()) || a.lessThan(a.getZero()) || a.isNaN())&&(__CLR4_4_178b78blb90p7f5.R.iget(9547)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9548)==0&false))) {{
            // negative, zero or NaN
            __CLR4_4_178b78blb90p7f5.R.inc(9549);a.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_178b78blb90p7f5.R.inc(9550);return a.dotrap(DfpField.FLAG_INVALID, "ln", a, a.newInstance((byte)1, Dfp.QNAN));
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9551);if ((((a.classify() == Dfp.INFINITE)&&(__CLR4_4_178b78blb90p7f5.R.iget(9552)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9553)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9554);return a;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9555);x = new Dfp(a);
        __CLR4_4_178b78blb90p7f5.R.inc(9556);lr = x.log10K();

        __CLR4_4_178b78blb90p7f5.R.inc(9557);x = x.divide(pow(a.newInstance(10000), lr));  /* This puts x in the range 0-10000 */
        __CLR4_4_178b78blb90p7f5.R.inc(9558);ix = x.floor().intValue();

        __CLR4_4_178b78blb90p7f5.R.inc(9559);while ((((ix > 2)&&(__CLR4_4_178b78blb90p7f5.R.iget(9560)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9561)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9562);ix >>= 1;
            __CLR4_4_178b78blb90p7f5.R.inc(9563);p2++;
        }


        }__CLR4_4_178b78blb90p7f5.R.inc(9564);Dfp[] spx = split(x);
        __CLR4_4_178b78blb90p7f5.R.inc(9565);Dfp[] spy = new Dfp[2];
        __CLR4_4_178b78blb90p7f5.R.inc(9566);spy[0] = pow(a.getTwo(), p2);          // use spy[0] temporarily as a divisor
        __CLR4_4_178b78blb90p7f5.R.inc(9567);spx[0] = spx[0].divide(spy[0]);
        __CLR4_4_178b78blb90p7f5.R.inc(9568);spx[1] = spx[1].divide(spy[0]);

        __CLR4_4_178b78blb90p7f5.R.inc(9569);spy[0] = a.newInstance("1.33333");    // Use spy[0] for comparison
        __CLR4_4_178b78blb90p7f5.R.inc(9570);while ((((spx[0].add(spx[1]).greaterThan(spy[0]))&&(__CLR4_4_178b78blb90p7f5.R.iget(9571)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9572)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9573);spx[0] = spx[0].divide(2);
            __CLR4_4_178b78blb90p7f5.R.inc(9574);spx[1] = spx[1].divide(2);
            __CLR4_4_178b78blb90p7f5.R.inc(9575);p2++;
        }

        // X is now in the range of 2/3 < x < 4/3
        }__CLR4_4_178b78blb90p7f5.R.inc(9576);Dfp[] spz = logInternal(spx);

        __CLR4_4_178b78blb90p7f5.R.inc(9577);spx[0] = a.newInstance(new StringBuilder().append(p2+4*lr).toString());
        __CLR4_4_178b78blb90p7f5.R.inc(9578);spx[1] = a.getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9579);spy = splitMult(a.getField().getLn2Split(), spx);

        __CLR4_4_178b78blb90p7f5.R.inc(9580);spz[0] = spz[0].add(spy[0]);
        __CLR4_4_178b78blb90p7f5.R.inc(9581);spz[1] = spz[1].add(spy[1]);

        __CLR4_4_178b78blb90p7f5.R.inc(9582);spx[0] = a.newInstance(new StringBuilder().append(4*lr).toString());
        __CLR4_4_178b78blb90p7f5.R.inc(9583);spx[1] = a.getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9584);spy = splitMult(a.getField().getLn5Split(), spx);

        __CLR4_4_178b78blb90p7f5.R.inc(9585);spz[0] = spz[0].add(spy[0]);
        __CLR4_4_178b78blb90p7f5.R.inc(9586);spz[1] = spz[1].add(spy[1]);

        __CLR4_4_178b78blb90p7f5.R.inc(9587);return a.newInstance(spz[0].add(spz[1]));

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Computes the natural log of a number between 0 and 2.
     *  Let f(x) = ln(x),
     *
     *  We know that f'(x) = 1/x, thus from Taylor's theorum we have:
     *
     *           -----          n+1         n
     *  f(x) =   \           (-1)    (x - 1)
     *           /          ----------------    for 1 <= n <= infinity
     *           -----             n
     *
     *  or
     *                       2        3       4
     *                   (x-1)   (x-1)    (x-1)
     *  ln(x) =  (x-1) - ----- + ------ - ------ + ...
     *                     2       3        4
     *
     *  alternatively,
     *
     *                  2    3   4
     *                 x    x   x
     *  ln(x+1) =  x - -  + - - - + ...
     *                 2    3   4
     *
     *  This series can be used to compute ln(x), but it converges too slowly.
     *
     *  If we substitute -x for x above, we get
     *
     *                   2    3    4
     *                  x    x    x
     *  ln(1-x) =  -x - -  - -  - - + ...
     *                  2    3    4
     *
     *  Note that all terms are now negative.  Because the even powered ones
     *  absorbed the sign.  Now, subtract the series above from the previous
     *  one to get ln(x+1) - ln(1-x).  Note the even terms cancel out leaving
     *  only the odd ones
     *
     *                             3     5      7
     *                           2x    2x     2x
     *  ln(x+1) - ln(x-1) = 2x + --- + --- + ---- + ...
     *                            3     5      7
     *
     *  By the property of logarithms that ln(a) - ln(b) = ln (a/b) we have:
     *
     *                                3        5        7
     *      x+1           /          x        x        x          \
     *  ln ----- =   2 *  |  x  +   ----  +  ----  +  ---- + ...  |
     *      x-1           \          3        5        7          /
     *
     *  But now we want to find ln(a), so we need to find the value of x
     *  such that a = (x+1)/(x-1).   This is easily solved to find that
     *  x = (a-1)/(a+1).
     * @param a number from which logarithm is requested, in split form
     * @return log(a)
     */
    protected static Dfp[] logInternal(final Dfp a[]) {try{__CLR4_4_178b78blb90p7f5.R.inc(9588);

        /* Now we want to compute x = (a-1)/(a+1) but this is prone to
         * loss of precision.  So instead, compute x = (a/4 - 1/4) / (a/4 + 1/4)
         */
        __CLR4_4_178b78blb90p7f5.R.inc(9589);Dfp t = a[0].divide(4).add(a[1].divide(4));
        __CLR4_4_178b78blb90p7f5.R.inc(9590);Dfp x = t.add(a[0].newInstance("-0.25")).divide(t.add(a[0].newInstance("0.25")));

        __CLR4_4_178b78blb90p7f5.R.inc(9591);Dfp y = new Dfp(x);
        __CLR4_4_178b78blb90p7f5.R.inc(9592);Dfp num = new Dfp(x);
        __CLR4_4_178b78blb90p7f5.R.inc(9593);Dfp py = new Dfp(y);
        __CLR4_4_178b78blb90p7f5.R.inc(9594);int den = 1;
        __CLR4_4_178b78blb90p7f5.R.inc(9595);for (int i = 0; (((i < 10000)&&(__CLR4_4_178b78blb90p7f5.R.iget(9596)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9597)==0&false)); i++) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9598);num = num.multiply(x);
            __CLR4_4_178b78blb90p7f5.R.inc(9599);num = num.multiply(x);
            __CLR4_4_178b78blb90p7f5.R.inc(9600);den = den + 2;
            __CLR4_4_178b78blb90p7f5.R.inc(9601);t = num.divide(den);
            __CLR4_4_178b78blb90p7f5.R.inc(9602);y = y.add(t);
            __CLR4_4_178b78blb90p7f5.R.inc(9603);if ((((y.equals(py))&&(__CLR4_4_178b78blb90p7f5.R.iget(9604)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9605)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9606);break;
            }
            }__CLR4_4_178b78blb90p7f5.R.inc(9607);py = new Dfp(y);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9608);y = y.multiply(a[0].getTwo());

        __CLR4_4_178b78blb90p7f5.R.inc(9609);return split(y);

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Computes x to the y power.<p>
     *
     *  Uses the following method:<p>
     *
     *  <ol>
     *  <li> Set u = rint(y), v = y-u
     *  <li> Compute a = v * ln(x)
     *  <li> Compute b = rint( a/ln(2) )
     *  <li> Compute c = a - b*ln(2)
     *  <li> x<sup>y</sup> = x<sup>u</sup>  *   2<sup>b</sup> * e<sup>c</sup>
     *  </ol>
     *  if |y| > 1e8, then we compute by exp(y*ln(x))   <p>
     *
     *  <b>Special Cases</b><p>
     *  <ul>
     *  <li>  if y is 0.0 or -0.0 then result is 1.0
     *  <li>  if y is 1.0 then result is x
     *  <li>  if y is NaN then result is NaN
     *  <li>  if x is NaN and y is not zero then result is NaN
     *  <li>  if |x| > 1.0 and y is +Infinity then result is +Infinity
     *  <li>  if |x| < 1.0 and y is -Infinity then result is +Infinity
     *  <li>  if |x| > 1.0 and y is -Infinity then result is +0
     *  <li>  if |x| < 1.0 and y is +Infinity then result is +0
     *  <li>  if |x| = 1.0 and y is +/-Infinity then result is NaN
     *  <li>  if x = +0 and y > 0 then result is +0
     *  <li>  if x = +Inf and y < 0 then result is +0
     *  <li>  if x = +0 and y < 0 then result is +Inf
     *  <li>  if x = +Inf and y > 0 then result is +Inf
     *  <li>  if x = -0 and y > 0, finite, not odd integer then result is +0
     *  <li>  if x = -0 and y < 0, finite, and odd integer then result is -Inf
     *  <li>  if x = -Inf and y > 0, finite, and odd integer then result is -Inf
     *  <li>  if x = -0 and y < 0, not finite odd integer then result is +Inf
     *  <li>  if x = -Inf and y > 0, not finite odd integer then result is +Inf
     *  <li>  if x < 0 and y > 0, finite, and odd integer then result is -(|x|<sup>y</sup>)
     *  <li>  if x < 0 and y > 0, finite, and not integer then result is NaN
     *  </ul>
     *  @param x base to be raised
     *  @param y power to which base should be raised
     *  @return x<sup>y</sup>
     */
    public static Dfp pow(Dfp x, final Dfp y) {try{__CLR4_4_178b78blb90p7f5.R.inc(9610);

        // make sure we don't mix number with different precision
        __CLR4_4_178b78blb90p7f5.R.inc(9611);if ((((x.getField().getRadixDigits() != y.getField().getRadixDigits())&&(__CLR4_4_178b78blb90p7f5.R.iget(9612)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9613)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9614);x.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_178b78blb90p7f5.R.inc(9615);final Dfp result = x.newInstance(x.getZero());
            __CLR4_4_178b78blb90p7f5.R.inc(9616);result.nans = Dfp.QNAN;
            __CLR4_4_178b78blb90p7f5.R.inc(9617);return x.dotrap(DfpField.FLAG_INVALID, POW_TRAP, x, result);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9618);final Dfp zero = x.getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9619);final Dfp one  = x.getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9620);final Dfp two  = x.getTwo();
        __CLR4_4_178b78blb90p7f5.R.inc(9621);boolean invert = false;
        __CLR4_4_178b78blb90p7f5.R.inc(9622);int ui;

        /* Check for special cases */
        __CLR4_4_178b78blb90p7f5.R.inc(9623);if ((((y.equals(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9624)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9625)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9626);return x.newInstance(one);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9627);if ((((y.equals(one))&&(__CLR4_4_178b78blb90p7f5.R.iget(9628)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9629)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9630);if ((((x.isNaN())&&(__CLR4_4_178b78blb90p7f5.R.iget(9631)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9632)==0&false))) {{
                // Test for NaNs
                __CLR4_4_178b78blb90p7f5.R.inc(9633);x.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
                __CLR4_4_178b78blb90p7f5.R.inc(9634);return x.dotrap(DfpField.FLAG_INVALID, POW_TRAP, x, x);
            }
            }__CLR4_4_178b78blb90p7f5.R.inc(9635);return x;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9636);if ((((x.isNaN() || y.isNaN())&&(__CLR4_4_178b78blb90p7f5.R.iget(9637)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9638)==0&false))) {{
            // Test for NaNs
            __CLR4_4_178b78blb90p7f5.R.inc(9639);x.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_178b78blb90p7f5.R.inc(9640);return x.dotrap(DfpField.FLAG_INVALID, POW_TRAP, x, x.newInstance((byte)1, Dfp.QNAN));
        }

        // X == 0
        }__CLR4_4_178b78blb90p7f5.R.inc(9641);if ((((x.equals(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9642)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9643)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9644);if ((((Dfp.copysign(one, x).greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9645)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9646)==0&false))) {{
                // X == +0
                __CLR4_4_178b78blb90p7f5.R.inc(9647);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9648)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9649)==0&false))) {{
                    __CLR4_4_178b78blb90p7f5.R.inc(9650);return x.newInstance(zero);
                } }else {{
                    __CLR4_4_178b78blb90p7f5.R.inc(9651);return x.newInstance(x.newInstance((byte)1, Dfp.INFINITE));
                }
            }} }else {{
                // X == -0
                __CLR4_4_178b78blb90p7f5.R.inc(9652);if ((((y.classify() == Dfp.FINITE && y.rint().equals(y) && !y.remainder(two).equals(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9653)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9654)==0&false))) {{
                    // If y is odd integer
                    __CLR4_4_178b78blb90p7f5.R.inc(9655);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9656)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9657)==0&false))) {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9658);return x.newInstance(zero.negate());
                    } }else {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9659);return x.newInstance(x.newInstance((byte)-1, Dfp.INFINITE));
                    }
                }} }else {{
                    // Y is not odd integer
                    __CLR4_4_178b78blb90p7f5.R.inc(9660);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9661)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9662)==0&false))) {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9663);return x.newInstance(zero);
                    } }else {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9664);return x.newInstance(x.newInstance((byte)1, Dfp.INFINITE));
                    }
                }}
            }}
        }}

        }__CLR4_4_178b78blb90p7f5.R.inc(9665);if ((((x.lessThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9666)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9667)==0&false))) {{
            // Make x positive, but keep track of it
            __CLR4_4_178b78blb90p7f5.R.inc(9668);x = x.negate();
            __CLR4_4_178b78blb90p7f5.R.inc(9669);invert = true;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9670);if ((((x.greaterThan(one) && y.classify() == Dfp.INFINITE)&&(__CLR4_4_178b78blb90p7f5.R.iget(9671)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9672)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9673);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9674)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9675)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9676);return y;
            } }else {{
                __CLR4_4_178b78blb90p7f5.R.inc(9677);return x.newInstance(zero);
            }
        }}

        }__CLR4_4_178b78blb90p7f5.R.inc(9678);if ((((x.lessThan(one) && y.classify() == Dfp.INFINITE)&&(__CLR4_4_178b78blb90p7f5.R.iget(9679)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9680)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9681);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9682)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9683)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9684);return x.newInstance(zero);
            } }else {{
                __CLR4_4_178b78blb90p7f5.R.inc(9685);return x.newInstance(Dfp.copysign(y, one));
            }
        }}

        }__CLR4_4_178b78blb90p7f5.R.inc(9686);if ((((x.equals(one) && y.classify() == Dfp.INFINITE)&&(__CLR4_4_178b78blb90p7f5.R.iget(9687)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9688)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9689);x.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_178b78blb90p7f5.R.inc(9690);return x.dotrap(DfpField.FLAG_INVALID, POW_TRAP, x, x.newInstance((byte)1, Dfp.QNAN));
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9691);if ((((x.classify() == Dfp.INFINITE)&&(__CLR4_4_178b78blb90p7f5.R.iget(9692)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9693)==0&false))) {{
            // x = +/- inf
            __CLR4_4_178b78blb90p7f5.R.inc(9694);if ((((invert)&&(__CLR4_4_178b78blb90p7f5.R.iget(9695)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9696)==0&false))) {{
                // negative infinity
                __CLR4_4_178b78blb90p7f5.R.inc(9697);if ((((y.classify() == Dfp.FINITE && y.rint().equals(y) && !y.remainder(two).equals(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9698)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9699)==0&false))) {{
                    // If y is odd integer
                    __CLR4_4_178b78blb90p7f5.R.inc(9700);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9701)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9702)==0&false))) {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9703);return x.newInstance(x.newInstance((byte)-1, Dfp.INFINITE));
                    } }else {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9704);return x.newInstance(zero.negate());
                    }
                }} }else {{
                    // Y is not odd integer
                    __CLR4_4_178b78blb90p7f5.R.inc(9705);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9706)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9707)==0&false))) {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9708);return x.newInstance(x.newInstance((byte)1, Dfp.INFINITE));
                    } }else {{
                        __CLR4_4_178b78blb90p7f5.R.inc(9709);return x.newInstance(zero);
                    }
                }}
            }} }else {{
                // positive infinity
                __CLR4_4_178b78blb90p7f5.R.inc(9710);if ((((y.greaterThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9711)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9712)==0&false))) {{
                    __CLR4_4_178b78blb90p7f5.R.inc(9713);return x;
                } }else {{
                    __CLR4_4_178b78blb90p7f5.R.inc(9714);return x.newInstance(zero);
                }
            }}
        }}

        }__CLR4_4_178b78blb90p7f5.R.inc(9715);if ((((invert && !y.rint().equals(y))&&(__CLR4_4_178b78blb90p7f5.R.iget(9716)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9717)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9718);x.getField().setIEEEFlagsBits(DfpField.FLAG_INVALID);
            __CLR4_4_178b78blb90p7f5.R.inc(9719);return x.dotrap(DfpField.FLAG_INVALID, POW_TRAP, x, x.newInstance((byte)1, Dfp.QNAN));
        }

        // End special cases

        }__CLR4_4_178b78blb90p7f5.R.inc(9720);Dfp r;
        __CLR4_4_178b78blb90p7f5.R.inc(9721);if ((((y.lessThan(x.newInstance(100000000)) && y.greaterThan(x.newInstance(-100000000)))&&(__CLR4_4_178b78blb90p7f5.R.iget(9722)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9723)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9724);final Dfp u = y.rint();
            __CLR4_4_178b78blb90p7f5.R.inc(9725);ui = u.intValue();

            __CLR4_4_178b78blb90p7f5.R.inc(9726);final Dfp v = y.subtract(u);

            __CLR4_4_178b78blb90p7f5.R.inc(9727);if ((((v.unequal(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9728)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9729)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9730);final Dfp a = v.multiply(log(x));
                __CLR4_4_178b78blb90p7f5.R.inc(9731);final Dfp b = a.divide(x.getField().getLn2()).rint();

                __CLR4_4_178b78blb90p7f5.R.inc(9732);final Dfp c = a.subtract(b.multiply(x.getField().getLn2()));
                __CLR4_4_178b78blb90p7f5.R.inc(9733);r = splitPow(split(x), ui);
                __CLR4_4_178b78blb90p7f5.R.inc(9734);r = r.multiply(pow(two, b.intValue()));
                __CLR4_4_178b78blb90p7f5.R.inc(9735);r = r.multiply(exp(c));
            } }else {{
                __CLR4_4_178b78blb90p7f5.R.inc(9736);r = splitPow(split(x), ui);
            }
        }} }else {{
            // very large exponent.  |y| > 1e8
            __CLR4_4_178b78blb90p7f5.R.inc(9737);r = exp(log(x).multiply(y));
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9738);if ((((invert && y.rint().equals(y) && !y.remainder(two).equals(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9739)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9740)==0&false))) {{
            // if y is odd integer
            __CLR4_4_178b78blb90p7f5.R.inc(9741);r = r.negate();
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9742);return x.newInstance(r);

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Computes sin(a)  Used when 0 < a < pi/4.
     * Uses the classic Taylor series.  x - x**3/3! + x**5/5!  ...
     * @param a number from which sine is desired, in split form
     * @return sin(a)
     */
    protected static Dfp sinInternal(Dfp a[]) {try{__CLR4_4_178b78blb90p7f5.R.inc(9743);

        __CLR4_4_178b78blb90p7f5.R.inc(9744);Dfp c = a[0].add(a[1]);
        __CLR4_4_178b78blb90p7f5.R.inc(9745);Dfp y = c;
        __CLR4_4_178b78blb90p7f5.R.inc(9746);c = c.multiply(c);
        __CLR4_4_178b78blb90p7f5.R.inc(9747);Dfp x = y;
        __CLR4_4_178b78blb90p7f5.R.inc(9748);Dfp fact = a[0].getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9749);Dfp py = new Dfp(y);

        __CLR4_4_178b78blb90p7f5.R.inc(9750);for (int i = 3; (((i < 90)&&(__CLR4_4_178b78blb90p7f5.R.iget(9751)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9752)==0&false)); i += 2) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9753);x = x.multiply(c);
            __CLR4_4_178b78blb90p7f5.R.inc(9754);x = x.negate();

            __CLR4_4_178b78blb90p7f5.R.inc(9755);fact = fact.divide((i-1)*i);  // 1 over fact
            __CLR4_4_178b78blb90p7f5.R.inc(9756);y = y.add(x.multiply(fact));
            __CLR4_4_178b78blb90p7f5.R.inc(9757);if ((((y.equals(py))&&(__CLR4_4_178b78blb90p7f5.R.iget(9758)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9759)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9760);break;
            }
            }__CLR4_4_178b78blb90p7f5.R.inc(9761);py = new Dfp(y);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9762);return y;

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** Computes cos(a)  Used when 0 < a < pi/4.
     * Uses the classic Taylor series for cosine.  1 - x**2/2! + x**4/4!  ...
     * @param a number from which cosine is desired, in split form
     * @return cos(a)
     */
    protected static Dfp cosInternal(Dfp a[]) {try{__CLR4_4_178b78blb90p7f5.R.inc(9763);
        __CLR4_4_178b78blb90p7f5.R.inc(9764);final Dfp one = a[0].getOne();


        __CLR4_4_178b78blb90p7f5.R.inc(9765);Dfp x = one;
        __CLR4_4_178b78blb90p7f5.R.inc(9766);Dfp y = one;
        __CLR4_4_178b78blb90p7f5.R.inc(9767);Dfp c = a[0].add(a[1]);
        __CLR4_4_178b78blb90p7f5.R.inc(9768);c = c.multiply(c);

        __CLR4_4_178b78blb90p7f5.R.inc(9769);Dfp fact = one;
        __CLR4_4_178b78blb90p7f5.R.inc(9770);Dfp py = new Dfp(y);

        __CLR4_4_178b78blb90p7f5.R.inc(9771);for (int i = 2; (((i < 90)&&(__CLR4_4_178b78blb90p7f5.R.iget(9772)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9773)==0&false)); i += 2) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9774);x = x.multiply(c);
            __CLR4_4_178b78blb90p7f5.R.inc(9775);x = x.negate();

            __CLR4_4_178b78blb90p7f5.R.inc(9776);fact = fact.divide((i - 1) * i);  // 1 over fact

            __CLR4_4_178b78blb90p7f5.R.inc(9777);y = y.add(x.multiply(fact));
            __CLR4_4_178b78blb90p7f5.R.inc(9778);if ((((y.equals(py))&&(__CLR4_4_178b78blb90p7f5.R.iget(9779)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9780)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9781);break;
            }
            }__CLR4_4_178b78blb90p7f5.R.inc(9782);py = new Dfp(y);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9783);return y;

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the sine of the argument.
     * @param a number from which sine is desired
     * @return sin(a)
     */
    public static Dfp sin(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9784);
        __CLR4_4_178b78blb90p7f5.R.inc(9785);final Dfp pi = a.getField().getPi();
        __CLR4_4_178b78blb90p7f5.R.inc(9786);final Dfp zero = a.getField().getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9787);boolean neg = false;

        /* First reduce the argument to the range of +/- PI */
        __CLR4_4_178b78blb90p7f5.R.inc(9788);Dfp x = a.remainder(pi.multiply(2));

        /* if x < 0 then apply identity sin(-x) = -sin(x) */
        /* This puts x in the range 0 < x < PI            */
        __CLR4_4_178b78blb90p7f5.R.inc(9789);if ((((x.lessThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9790)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9791)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9792);x = x.negate();
            __CLR4_4_178b78blb90p7f5.R.inc(9793);neg = true;
        }

        /* Since sine(x) = sine(pi - x) we can reduce the range to
         * 0 < x < pi/2
         */

        }__CLR4_4_178b78blb90p7f5.R.inc(9794);if ((((x.greaterThan(pi.divide(2)))&&(__CLR4_4_178b78blb90p7f5.R.iget(9795)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9796)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9797);x = pi.subtract(x);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9798);Dfp y;
        __CLR4_4_178b78blb90p7f5.R.inc(9799);if ((((x.lessThan(pi.divide(4)))&&(__CLR4_4_178b78blb90p7f5.R.iget(9800)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9801)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9802);Dfp c[] = new Dfp[2];
            __CLR4_4_178b78blb90p7f5.R.inc(9803);c[0] = x;
            __CLR4_4_178b78blb90p7f5.R.inc(9804);c[1] = zero;

            //y = sinInternal(c);
            __CLR4_4_178b78blb90p7f5.R.inc(9805);y = sinInternal(split(x));
        } }else {{
            __CLR4_4_178b78blb90p7f5.R.inc(9806);final Dfp c[] = new Dfp[2];
            __CLR4_4_178b78blb90p7f5.R.inc(9807);final Dfp[] piSplit = a.getField().getPiSplit();
            __CLR4_4_178b78blb90p7f5.R.inc(9808);c[0] = piSplit[0].divide(2).subtract(x);
            __CLR4_4_178b78blb90p7f5.R.inc(9809);c[1] = piSplit[1].divide(2);
            __CLR4_4_178b78blb90p7f5.R.inc(9810);y = cosInternal(c);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9811);if ((((neg)&&(__CLR4_4_178b78blb90p7f5.R.iget(9812)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9813)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9814);y = y.negate();
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9815);return a.newInstance(y);

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the cosine of the argument.
     * @param a number from which cosine is desired
     * @return cos(a)
     */
    public static Dfp cos(Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9816);
        __CLR4_4_178b78blb90p7f5.R.inc(9817);final Dfp pi = a.getField().getPi();
        __CLR4_4_178b78blb90p7f5.R.inc(9818);final Dfp zero = a.getField().getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9819);boolean neg = false;

        /* First reduce the argument to the range of +/- PI */
        __CLR4_4_178b78blb90p7f5.R.inc(9820);Dfp x = a.remainder(pi.multiply(2));

        /* if x < 0 then apply identity cos(-x) = cos(x) */
        /* This puts x in the range 0 < x < PI           */
        __CLR4_4_178b78blb90p7f5.R.inc(9821);if ((((x.lessThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9822)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9823)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9824);x = x.negate();
        }

        /* Since cos(x) = -cos(pi - x) we can reduce the range to
         * 0 < x < pi/2
         */

        }__CLR4_4_178b78blb90p7f5.R.inc(9825);if ((((x.greaterThan(pi.divide(2)))&&(__CLR4_4_178b78blb90p7f5.R.iget(9826)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9827)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9828);x = pi.subtract(x);
            __CLR4_4_178b78blb90p7f5.R.inc(9829);neg = true;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9830);Dfp y;
        __CLR4_4_178b78blb90p7f5.R.inc(9831);if ((((x.lessThan(pi.divide(4)))&&(__CLR4_4_178b78blb90p7f5.R.iget(9832)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9833)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9834);Dfp c[] = new Dfp[2];
            __CLR4_4_178b78blb90p7f5.R.inc(9835);c[0] = x;
            __CLR4_4_178b78blb90p7f5.R.inc(9836);c[1] = zero;

            __CLR4_4_178b78blb90p7f5.R.inc(9837);y = cosInternal(c);
        } }else {{
            __CLR4_4_178b78blb90p7f5.R.inc(9838);final Dfp c[] = new Dfp[2];
            __CLR4_4_178b78blb90p7f5.R.inc(9839);final Dfp[] piSplit = a.getField().getPiSplit();
            __CLR4_4_178b78blb90p7f5.R.inc(9840);c[0] = piSplit[0].divide(2).subtract(x);
            __CLR4_4_178b78blb90p7f5.R.inc(9841);c[1] = piSplit[1].divide(2);
            __CLR4_4_178b78blb90p7f5.R.inc(9842);y = sinInternal(c);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9843);if ((((neg)&&(__CLR4_4_178b78blb90p7f5.R.iget(9844)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9845)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9846);y = y.negate();
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9847);return a.newInstance(y);

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the tangent of the argument.
     * @param a number from which tangent is desired
     * @return tan(a)
     */
    public static Dfp tan(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9848);
        __CLR4_4_178b78blb90p7f5.R.inc(9849);return sin(a).divide(cos(a));
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the arc-tangent of the argument.
     * @param a number from which arc-tangent is desired
     * @return atan(a)
     */
    protected static Dfp atanInternal(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9850);

        __CLR4_4_178b78blb90p7f5.R.inc(9851);Dfp y = new Dfp(a);
        __CLR4_4_178b78blb90p7f5.R.inc(9852);Dfp x = new Dfp(y);
        __CLR4_4_178b78blb90p7f5.R.inc(9853);Dfp py = new Dfp(y);

        __CLR4_4_178b78blb90p7f5.R.inc(9854);for (int i = 3; (((i < 90)&&(__CLR4_4_178b78blb90p7f5.R.iget(9855)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9856)==0&false)); i += 2) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9857);x = x.multiply(a);
            __CLR4_4_178b78blb90p7f5.R.inc(9858);x = x.multiply(a);
            __CLR4_4_178b78blb90p7f5.R.inc(9859);x = x.negate();
            __CLR4_4_178b78blb90p7f5.R.inc(9860);y = y.add(x.divide(i));
            __CLR4_4_178b78blb90p7f5.R.inc(9861);if ((((y.equals(py))&&(__CLR4_4_178b78blb90p7f5.R.iget(9862)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9863)==0&false))) {{
                __CLR4_4_178b78blb90p7f5.R.inc(9864);break;
            }
            }__CLR4_4_178b78blb90p7f5.R.inc(9865);py = new Dfp(y);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9866);return y;

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the arc tangent of the argument
     *
     *  Uses the typical taylor series
     *
     *  but may reduce arguments using the following identity
     * tan(x+y) = (tan(x) + tan(y)) / (1 - tan(x)*tan(y))
     *
     * since tan(PI/8) = sqrt(2)-1,
     *
     * atan(x) = atan( (x - sqrt(2) + 1) / (1+x*sqrt(2) - x) + PI/8.0
     * @param a number from which arc-tangent is desired
     * @return atan(a)
     */
    public static Dfp atan(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9867);
        __CLR4_4_178b78blb90p7f5.R.inc(9868);final Dfp   zero      = a.getField().getZero();
        __CLR4_4_178b78blb90p7f5.R.inc(9869);final Dfp   one       = a.getField().getOne();
        __CLR4_4_178b78blb90p7f5.R.inc(9870);final Dfp[] sqr2Split = a.getField().getSqr2Split();
        __CLR4_4_178b78blb90p7f5.R.inc(9871);final Dfp[] piSplit   = a.getField().getPiSplit();
        __CLR4_4_178b78blb90p7f5.R.inc(9872);boolean recp = false;
        __CLR4_4_178b78blb90p7f5.R.inc(9873);boolean neg = false;
        __CLR4_4_178b78blb90p7f5.R.inc(9874);boolean sub = false;

        __CLR4_4_178b78blb90p7f5.R.inc(9875);final Dfp ty = sqr2Split[0].subtract(one).add(sqr2Split[1]);

        __CLR4_4_178b78blb90p7f5.R.inc(9876);Dfp x = new Dfp(a);
        __CLR4_4_178b78blb90p7f5.R.inc(9877);if ((((x.lessThan(zero))&&(__CLR4_4_178b78blb90p7f5.R.iget(9878)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9879)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9880);neg = true;
            __CLR4_4_178b78blb90p7f5.R.inc(9881);x = x.negate();
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9882);if ((((x.greaterThan(one))&&(__CLR4_4_178b78blb90p7f5.R.iget(9883)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9884)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9885);recp = true;
            __CLR4_4_178b78blb90p7f5.R.inc(9886);x = one.divide(x);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9887);if ((((x.greaterThan(ty))&&(__CLR4_4_178b78blb90p7f5.R.iget(9888)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9889)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9890);Dfp sty[] = new Dfp[2];
            __CLR4_4_178b78blb90p7f5.R.inc(9891);sub = true;

            __CLR4_4_178b78blb90p7f5.R.inc(9892);sty[0] = sqr2Split[0].subtract(one);
            __CLR4_4_178b78blb90p7f5.R.inc(9893);sty[1] = sqr2Split[1];

            __CLR4_4_178b78blb90p7f5.R.inc(9894);Dfp[] xs = split(x);

            __CLR4_4_178b78blb90p7f5.R.inc(9895);Dfp[] ds = splitMult(xs, sty);
            __CLR4_4_178b78blb90p7f5.R.inc(9896);ds[0] = ds[0].add(one);

            __CLR4_4_178b78blb90p7f5.R.inc(9897);xs[0] = xs[0].subtract(sty[0]);
            __CLR4_4_178b78blb90p7f5.R.inc(9898);xs[1] = xs[1].subtract(sty[1]);

            __CLR4_4_178b78blb90p7f5.R.inc(9899);xs = splitDiv(xs, ds);
            __CLR4_4_178b78blb90p7f5.R.inc(9900);x = xs[0].add(xs[1]);

            //x = x.subtract(ty).divide(dfp.one.add(x.multiply(ty)));
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9901);Dfp y = atanInternal(x);

        __CLR4_4_178b78blb90p7f5.R.inc(9902);if ((((sub)&&(__CLR4_4_178b78blb90p7f5.R.iget(9903)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9904)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9905);y = y.add(piSplit[0].divide(8)).add(piSplit[1].divide(8));
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9906);if ((((recp)&&(__CLR4_4_178b78blb90p7f5.R.iget(9907)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9908)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9909);y = piSplit[0].divide(2).subtract(y).add(piSplit[1].divide(2));
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9910);if ((((neg)&&(__CLR4_4_178b78blb90p7f5.R.iget(9911)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9912)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9913);y = y.negate();
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9914);return a.newInstance(y);

    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the arc-sine of the argument.
     * @param a number from which arc-sine is desired
     * @return asin(a)
     */
    public static Dfp asin(final Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9915);
        __CLR4_4_178b78blb90p7f5.R.inc(9916);return atan(a.divide(a.getOne().subtract(a.multiply(a)).sqrt()));
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

    /** computes the arc-cosine of the argument.
     * @param a number from which arc-cosine is desired
     * @return acos(a)
     */
    public static Dfp acos(Dfp a) {try{__CLR4_4_178b78blb90p7f5.R.inc(9917);
        __CLR4_4_178b78blb90p7f5.R.inc(9918);Dfp result;
        __CLR4_4_178b78blb90p7f5.R.inc(9919);boolean negative = false;

        __CLR4_4_178b78blb90p7f5.R.inc(9920);if ((((a.lessThan(a.getZero()))&&(__CLR4_4_178b78blb90p7f5.R.iget(9921)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9922)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9923);negative = true;
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9924);a = Dfp.copysign(a, a.getOne());  // absolute value

        __CLR4_4_178b78blb90p7f5.R.inc(9925);result = atan(a.getOne().subtract(a.multiply(a)).sqrt().divide(a));

        __CLR4_4_178b78blb90p7f5.R.inc(9926);if ((((negative)&&(__CLR4_4_178b78blb90p7f5.R.iget(9927)!=0|true))||(__CLR4_4_178b78blb90p7f5.R.iget(9928)==0&false))) {{
            __CLR4_4_178b78blb90p7f5.R.inc(9929);result = a.getField().getPi().subtract(result);
        }

        }__CLR4_4_178b78blb90p7f5.R.inc(9930);return a.newInstance(result);
    }finally{__CLR4_4_178b78blb90p7f5.R.flushNeeded();}}

}
