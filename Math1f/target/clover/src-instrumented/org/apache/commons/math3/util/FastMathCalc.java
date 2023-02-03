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
package org.apache.commons.math3.util;

import java.io.PrintStream;

import org.apache.commons.math3.exception.DimensionMismatchException;

/** Class used to compute the classical functions tables.
 * @version $Id$
 * @since 3.0
 */
class FastMathCalc {public static class __CLR4_4_119ig19iglb90pb1u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,59320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * 0x40000000 - used to split a double into two parts, both with the low order bits cleared.
     * Equivalent to 2^30.
     */
    private static final long HEX_40000000 = 0x40000000L; // 1073741824L

    /** Factorial table, for Taylor series expansions. 0!, 1!, 2!, ... 19! */
    private static final double FACT[] = new double[]
        {
        +1.0d,                        // 0
        +1.0d,                        // 1
        +2.0d,                        // 2
        +6.0d,                        // 3
        +24.0d,                       // 4
        +120.0d,                      // 5
        +720.0d,                      // 6
        +5040.0d,                     // 7
        +40320.0d,                    // 8
        +362880.0d,                   // 9
        +3628800.0d,                  // 10
        +39916800.0d,                 // 11
        +479001600.0d,                // 12
        +6227020800.0d,               // 13
        +87178291200.0d,              // 14
        +1307674368000.0d,            // 15
        +20922789888000.0d,           // 16
        +355687428096000.0d,          // 17
        +6402373705728000.0d,         // 18
        +121645100408832000.0d,       // 19
        };

    /** Coefficients for slowLog. */
    private static final double LN_SPLIT_COEF[][] = {
        {2.0, 0.0},
        {0.6666666269302368, 3.9736429850260626E-8},
        {0.3999999761581421, 2.3841857910019882E-8},
        {0.2857142686843872, 1.7029898543501842E-8},
        {0.2222222089767456, 1.3245471311735498E-8},
        {0.1818181574344635, 2.4384203044354907E-8},
        {0.1538461446762085, 9.140260083262505E-9},
        {0.13333332538604736, 9.220590270857665E-9},
        {0.11764700710773468, 1.2393345855018391E-8},
        {0.10526403784751892, 8.251545029714408E-9},
        {0.0952233225107193, 1.2675934823758863E-8},
        {0.08713622391223907, 1.1430250008909141E-8},
        {0.07842259109020233, 2.404307984052299E-9},
        {0.08371849358081818, 1.176342548272881E-8},
        {0.030589580535888672, 1.2958646899018938E-9},
        {0.14982303977012634, 1.225743062930824E-8},
    };

    /** Table start declaration. */
    private static final String TABLE_START_DECL = "    {";

    /** Table end declaration. */
    private static final String TABLE_END_DECL   = "    };";

    /**
     * Private Constructor.
     */
    private FastMathCalc() {try{__CLR4_4_119ig19iglb90pb1u.R.inc(58984);
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Build the sine and cosine tables.
     * @param SINE_TABLE_A table of the most significant part of the sines
     * @param SINE_TABLE_B table of the least significant part of the sines
     * @param COSINE_TABLE_A table of the most significant part of the cosines
     * @param COSINE_TABLE_B table of the most significant part of the cosines
     * @param SINE_TABLE_LEN length of the tables
     * @param TANGENT_TABLE_A table of the most significant part of the tangents
     * @param TANGENT_TABLE_B table of the most significant part of the tangents
     */
    @SuppressWarnings("unused")
    private static void buildSinCosTables(double[] SINE_TABLE_A, double[] SINE_TABLE_B,
                                          double[] COSINE_TABLE_A, double[] COSINE_TABLE_B,
                                          int SINE_TABLE_LEN, double[] TANGENT_TABLE_A, double[] TANGENT_TABLE_B) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(58985);
        __CLR4_4_119ig19iglb90pb1u.R.inc(58986);final double result[] = new double[2];

        /* Use taylor series for 0 <= x <= 6/8 */
        __CLR4_4_119ig19iglb90pb1u.R.inc(58987);for (int i = 0; (((i < 7)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(58988)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(58989)==0&false)); i++) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(58990);double x = i / 8.0;

            __CLR4_4_119ig19iglb90pb1u.R.inc(58991);slowSin(x, result);
            __CLR4_4_119ig19iglb90pb1u.R.inc(58992);SINE_TABLE_A[i] = result[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(58993);SINE_TABLE_B[i] = result[1];

            __CLR4_4_119ig19iglb90pb1u.R.inc(58994);slowCos(x, result);
            __CLR4_4_119ig19iglb90pb1u.R.inc(58995);COSINE_TABLE_A[i] = result[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(58996);COSINE_TABLE_B[i] = result[1];
        }

        /* Use angle addition formula to complete table to 13/8, just beyond pi/2 */
        }__CLR4_4_119ig19iglb90pb1u.R.inc(58997);for (int i = 7; (((i < SINE_TABLE_LEN)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(58998)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(58999)==0&false)); i++) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59000);double xs[] = new double[2];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59001);double ys[] = new double[2];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59002);double as[] = new double[2];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59003);double bs[] = new double[2];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59004);double temps[] = new double[2];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59005);if ( ((((i & 1) == 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59006)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59007)==0&false))) {{
                // Even, use double angle
                __CLR4_4_119ig19iglb90pb1u.R.inc(59008);xs[0] = SINE_TABLE_A[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59009);xs[1] = SINE_TABLE_B[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59010);ys[0] = COSINE_TABLE_A[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59011);ys[1] = COSINE_TABLE_B[i/2];

                /* compute sine */
                __CLR4_4_119ig19iglb90pb1u.R.inc(59012);splitMult(xs, ys, result);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59013);SINE_TABLE_A[i] = result[0] * 2.0;
                __CLR4_4_119ig19iglb90pb1u.R.inc(59014);SINE_TABLE_B[i] = result[1] * 2.0;

                /* Compute cosine */
                __CLR4_4_119ig19iglb90pb1u.R.inc(59015);splitMult(ys, ys, as);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59016);splitMult(xs, xs, temps);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59017);temps[0] = -temps[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59018);temps[1] = -temps[1];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59019);splitAdd(as, temps, result);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59020);COSINE_TABLE_A[i] = result[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59021);COSINE_TABLE_B[i] = result[1];
            } }else {{
                __CLR4_4_119ig19iglb90pb1u.R.inc(59022);xs[0] = SINE_TABLE_A[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59023);xs[1] = SINE_TABLE_B[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59024);ys[0] = COSINE_TABLE_A[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59025);ys[1] = COSINE_TABLE_B[i/2];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59026);as[0] = SINE_TABLE_A[i/2+1];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59027);as[1] = SINE_TABLE_B[i/2+1];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59028);bs[0] = COSINE_TABLE_A[i/2+1];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59029);bs[1] = COSINE_TABLE_B[i/2+1];

                /* compute sine */
                __CLR4_4_119ig19iglb90pb1u.R.inc(59030);splitMult(xs, bs, temps);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59031);splitMult(ys, as, result);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59032);splitAdd(result, temps, result);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59033);SINE_TABLE_A[i] = result[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59034);SINE_TABLE_B[i] = result[1];

                /* Compute cosine */
                __CLR4_4_119ig19iglb90pb1u.R.inc(59035);splitMult(ys, bs, result);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59036);splitMult(xs, as, temps);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59037);temps[0] = -temps[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59038);temps[1] = -temps[1];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59039);splitAdd(result, temps, result);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59040);COSINE_TABLE_A[i] = result[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59041);COSINE_TABLE_B[i] = result[1];
            }
        }}

        /* Compute tangent = sine/cosine */
        }__CLR4_4_119ig19iglb90pb1u.R.inc(59042);for (int i = 0; (((i < SINE_TABLE_LEN)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59043)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59044)==0&false)); i++) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59045);double xs[] = new double[2];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59046);double ys[] = new double[2];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59047);double as[] = new double[2];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59048);as[0] = COSINE_TABLE_A[i];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59049);as[1] = COSINE_TABLE_B[i];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59050);splitReciprocal(as, ys);

            __CLR4_4_119ig19iglb90pb1u.R.inc(59051);xs[0] = SINE_TABLE_A[i];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59052);xs[1] = SINE_TABLE_B[i];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59053);splitMult(xs, ys, as);

            __CLR4_4_119ig19iglb90pb1u.R.inc(59054);TANGENT_TABLE_A[i] = as[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59055);TANGENT_TABLE_B[i] = as[1];
        }

    }}finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /**
     *  For x between 0 and pi/4 compute cosine using Talor series
     *  cos(x) = 1 - x^2/2! + x^4/4! ...
     * @param x number from which cosine is requested
     * @param result placeholder where to put the result in extended precision
     * (may be null)
     * @return cos(x)
     */
    static double slowCos(final double x, final double result[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59056);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59057);final double xs[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59058);final double ys[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59059);final double facts[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59060);final double as[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59061);split(x, xs);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59062);ys[0] = ys[1] = 0.0;

        __CLR4_4_119ig19iglb90pb1u.R.inc(59063);for (int i = FACT.length-1; (((i >= 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59064)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59065)==0&false)); i--) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59066);splitMult(xs, ys, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59067);ys[0] = as[0]; __CLR4_4_119ig19iglb90pb1u.R.inc(59068);ys[1] = as[1];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59069);if ( ((((i & 1) != 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59070)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59071)==0&false))) {{ // skip odd entries
                __CLR4_4_119ig19iglb90pb1u.R.inc(59072);continue;
            }

            }__CLR4_4_119ig19iglb90pb1u.R.inc(59073);split(FACT[i], as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59074);splitReciprocal(as, facts);

            __CLR4_4_119ig19iglb90pb1u.R.inc(59075);if ( ((((i & 2) != 0 )&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59076)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59077)==0&false))) {{ // alternate terms are negative
                __CLR4_4_119ig19iglb90pb1u.R.inc(59078);facts[0] = -facts[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59079);facts[1] = -facts[1];
            }

            }__CLR4_4_119ig19iglb90pb1u.R.inc(59080);splitAdd(ys, facts, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59081);ys[0] = as[0]; __CLR4_4_119ig19iglb90pb1u.R.inc(59082);ys[1] = as[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59083);if ((((result != null)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59084)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59085)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59086);result[0] = ys[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59087);result[1] = ys[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59088);return ys[0] + ys[1];
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /**
     * For x between 0 and pi/4 compute sine using Taylor expansion:
     * sin(x) = x - x^3/3! + x^5/5! - x^7/7! ...
     * @param x number from which sine is requested
     * @param result placeholder where to put the result in extended precision
     * (may be null)
     * @return sin(x)
     */
    static double slowSin(final double x, final double result[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59089);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59090);final double xs[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59091);final double ys[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59092);final double facts[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59093);final double as[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59094);split(x, xs);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59095);ys[0] = ys[1] = 0.0;

        __CLR4_4_119ig19iglb90pb1u.R.inc(59096);for (int i = FACT.length-1; (((i >= 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59097)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59098)==0&false)); i--) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59099);splitMult(xs, ys, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59100);ys[0] = as[0]; __CLR4_4_119ig19iglb90pb1u.R.inc(59101);ys[1] = as[1];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59102);if ( ((((i & 1) == 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59103)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59104)==0&false))) {{ // Ignore even numbers
                __CLR4_4_119ig19iglb90pb1u.R.inc(59105);continue;
            }

            }__CLR4_4_119ig19iglb90pb1u.R.inc(59106);split(FACT[i], as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59107);splitReciprocal(as, facts);

            __CLR4_4_119ig19iglb90pb1u.R.inc(59108);if ( ((((i & 2) != 0 )&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59109)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59110)==0&false))) {{ // alternate terms are negative
                __CLR4_4_119ig19iglb90pb1u.R.inc(59111);facts[0] = -facts[0];
                __CLR4_4_119ig19iglb90pb1u.R.inc(59112);facts[1] = -facts[1];
            }

            }__CLR4_4_119ig19iglb90pb1u.R.inc(59113);splitAdd(ys, facts, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59114);ys[0] = as[0]; __CLR4_4_119ig19iglb90pb1u.R.inc(59115);ys[1] = as[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59116);if ((((result != null)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59117)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59118)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59119);result[0] = ys[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59120);result[1] = ys[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59121);return ys[0] + ys[1];
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}


    /**
     *  For x between 0 and 1, returns exp(x), uses extended precision
     *  @param x argument of exponential
     *  @param result placeholder where to place exp(x) split in two terms
     *  for extra precision (i.e. exp(x) = result[0] + result[1]
     *  @return exp(x)
     */
    static double slowexp(final double x, final double result[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59122);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59123);final double xs[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59124);final double ys[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59125);final double facts[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59126);final double as[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59127);split(x, xs);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59128);ys[0] = ys[1] = 0.0;

        __CLR4_4_119ig19iglb90pb1u.R.inc(59129);for (int i = FACT.length-1; (((i >= 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59130)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59131)==0&false)); i--) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59132);splitMult(xs, ys, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59133);ys[0] = as[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59134);ys[1] = as[1];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59135);split(FACT[i], as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59136);splitReciprocal(as, facts);

            __CLR4_4_119ig19iglb90pb1u.R.inc(59137);splitAdd(ys, facts, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59138);ys[0] = as[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59139);ys[1] = as[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59140);if ((((result != null)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59141)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59142)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59143);result[0] = ys[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59144);result[1] = ys[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59145);return ys[0] + ys[1];
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Compute split[0], split[1] such that their sum is equal to d,
     * and split[0] has its 30 least significant bits as zero.
     * @param d number to split
     * @param split placeholder where to place the result
     */
    private static void split(final double d, final double split[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59146);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59147);if ((((d < 8e298 && d > -8e298)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59148)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59149)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59150);final double a = d * HEX_40000000;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59151);split[0] = (d + a) - a;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59152);split[1] = d - split[0];
        } }else {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59153);final double a = d * 9.31322574615478515625E-10;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59154);split[0] = (d + a - d) * HEX_40000000;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59155);split[1] = d - split[0];
        }
    }}finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Recompute a split.
     * @param a input/out array containing the split, changed
     * on output
     */
    private static void resplit(final double a[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59156);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59157);final double c = a[0] + a[1];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59158);final double d = -(c - a[0] - a[1]);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59159);if ((((c < 8e298 && c > -8e298)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59160)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59161)==0&false))) {{ // MAGIC NUMBER
            __CLR4_4_119ig19iglb90pb1u.R.inc(59162);double z = c * HEX_40000000;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59163);a[0] = (c + z) - z;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59164);a[1] = c - a[0] + d;
        } }else {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59165);double z = c * 9.31322574615478515625E-10;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59166);a[0] = (c + z - c) * HEX_40000000;
            __CLR4_4_119ig19iglb90pb1u.R.inc(59167);a[1] = c - a[0] + d;
        }
    }}finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Multiply two numbers in split form.
     * @param a first term of multiplication
     * @param b second term of multiplication
     * @param ans placeholder where to put the result
     */
    private static void splitMult(double a[], double b[], double ans[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59168);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59169);ans[0] = a[0] * b[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59170);ans[1] = a[0] * b[1] + a[1] * b[0] + a[1] * b[1];

        /* Resplit */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59171);resplit(ans);
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Add two numbers in split form.
     * @param a first term of addition
     * @param b second term of addition
     * @param ans placeholder where to put the result
     */
    private static void splitAdd(final double a[], final double b[], final double ans[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59172);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59173);ans[0] = a[0] + b[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59174);ans[1] = a[1] + b[1];

        __CLR4_4_119ig19iglb90pb1u.R.inc(59175);resplit(ans);
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Compute the reciprocal of in.  Use the following algorithm.
     *  in = c + d.
     *  want to find x + y such that x+y = 1/(c+d) and x is much
     *  larger than y and x has several zero bits on the right.
     *
     *  Set b = 1/(2^22),  a = 1 - b.  Thus (a+b) = 1.
     *  Use following identity to compute (a+b)/(c+d)
     *
     *  (a+b)/(c+d)  =   a/c   +    (bc - ad) / (c^2 + cd)
     *  set x = a/c  and y = (bc - ad) / (c^2 + cd)
     *  This will be close to the right answer, but there will be
     *  some rounding in the calculation of X.  So by carefully
     *  computing 1 - (c+d)(x+y) we can compute an error and
     *  add that back in.   This is done carefully so that terms
     *  of similar size are subtracted first.
     *  @param in initial number, in split form
     *  @param result placeholder where to put the result
     */
    static void splitReciprocal(final double in[], final double result[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59176);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59177);final double b = 1.0/4194304.0;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59178);final double a = 1.0 - b;

        __CLR4_4_119ig19iglb90pb1u.R.inc(59179);if ((((in[0] == 0.0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59180)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59181)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59182);in[0] = in[1];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59183);in[1] = 0.0;
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59184);result[0] = a / in[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59185);result[1] = (b*in[0]-a*in[1]) / (in[0]*in[0] + in[0]*in[1]);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59186);if ((((result[1] != result[1])&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59187)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59188)==0&false))) {{ // can happen if result[1] is NAN
            __CLR4_4_119ig19iglb90pb1u.R.inc(59189);result[1] = 0.0;
        }

        /* Resplit */
        }__CLR4_4_119ig19iglb90pb1u.R.inc(59190);resplit(result);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59191);for (int i = 0; (((i < 2)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59192)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59193)==0&false)); i++) {{
            /* this may be overkill, probably once is enough */
            __CLR4_4_119ig19iglb90pb1u.R.inc(59194);double err = 1.0 - result[0] * in[0] - result[0] * in[1] -
            result[1] * in[0] - result[1] * in[1];
            /*err = 1.0 - err; */
            __CLR4_4_119ig19iglb90pb1u.R.inc(59195);err = err * (result[0] + result[1]);
            /*printf("err = %16e\n", err); */
            __CLR4_4_119ig19iglb90pb1u.R.inc(59196);result[1] += err;
        }
    }}finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Compute (a[0] + a[1]) * (b[0] + b[1]) in extended precision.
     * @param a first term of the multiplication
     * @param b second term of the multiplication
     * @param result placeholder where to put the result
     */
    private static void quadMult(final double a[], final double b[], final double result[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59197);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59198);final double xs[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59199);final double ys[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59200);final double zs[] = new double[2];

        /* a[0] * b[0] */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59201);split(a[0], xs);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59202);split(b[0], ys);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59203);splitMult(xs, ys, zs);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59204);result[0] = zs[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59205);result[1] = zs[1];

        /* a[0] * b[1] */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59206);split(b[1], ys);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59207);splitMult(xs, ys, zs);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59208);double tmp = result[0] + zs[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59209);result[1] = result[1] - (tmp - result[0] - zs[0]);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59210);result[0] = tmp;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59211);tmp = result[0] + zs[1];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59212);result[1] = result[1] - (tmp - result[0] - zs[1]);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59213);result[0] = tmp;

        /* a[1] * b[0] */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59214);split(a[1], xs);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59215);split(b[0], ys);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59216);splitMult(xs, ys, zs);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59217);tmp = result[0] + zs[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59218);result[1] = result[1] - (tmp - result[0] - zs[0]);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59219);result[0] = tmp;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59220);tmp = result[0] + zs[1];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59221);result[1] = result[1] - (tmp - result[0] - zs[1]);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59222);result[0] = tmp;

        /* a[1] * b[0] */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59223);split(a[1], xs);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59224);split(b[1], ys);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59225);splitMult(xs, ys, zs);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59226);tmp = result[0] + zs[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59227);result[1] = result[1] - (tmp - result[0] - zs[0]);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59228);result[0] = tmp;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59229);tmp = result[0] + zs[1];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59230);result[1] = result[1] - (tmp - result[0] - zs[1]);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59231);result[0] = tmp;
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Compute exp(p) for a integer p in extended precision.
     * @param p integer whose exponential is requested
     * @param result placeholder where to put the result in extended precision
     * @return exp(p) in standard precision (equal to result[0] + result[1])
     */
    static double expint(int p, final double result[]) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59232);
        //double x = M_E;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59233);final double xs[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59234);final double as[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59235);final double ys[] = new double[2];
        //split(x, xs);
        //xs[1] = (double)(2.7182818284590452353602874713526625L - xs[0]);
        //xs[0] = 2.71827697753906250000;
        //xs[1] = 4.85091998273542816811e-06;
        //xs[0] = Double.longBitsToDouble(0x4005bf0800000000L);
        //xs[1] = Double.longBitsToDouble(0x3ed458a2bb4a9b00L);

        /* E */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59236);xs[0] = 2.718281828459045;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59237);xs[1] = 1.4456468917292502E-16;

        __CLR4_4_119ig19iglb90pb1u.R.inc(59238);split(1.0, ys);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59239);while ((((p > 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59240)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59241)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59242);if (((((p & 1) != 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59243)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59244)==0&false))) {{
                __CLR4_4_119ig19iglb90pb1u.R.inc(59245);quadMult(ys, xs, as);
                __CLR4_4_119ig19iglb90pb1u.R.inc(59246);ys[0] = as[0]; __CLR4_4_119ig19iglb90pb1u.R.inc(59247);ys[1] = as[1];
            }

            }__CLR4_4_119ig19iglb90pb1u.R.inc(59248);quadMult(xs, xs, as);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59249);xs[0] = as[0]; __CLR4_4_119ig19iglb90pb1u.R.inc(59250);xs[1] = as[1];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59251);p >>= 1;
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59252);if ((((result != null)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59253)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59254)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59255);result[0] = ys[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59256);result[1] = ys[1];

            __CLR4_4_119ig19iglb90pb1u.R.inc(59257);resplit(result);
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59258);return ys[0] + ys[1];
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}
    /** xi in the range of [1, 2].
     *                                3        5        7
     *      x+1           /          x        x        x          \
     *  ln ----- =   2 *  |  x  +   ----  +  ----  +  ---- + ...  |
     *      1-x           \          3        5        7          /
     *
     * So, compute a Remez approximation of the following function
     *
     *  ln ((sqrt(x)+1)/(1-sqrt(x)))  /  x
     *
     * This will be an even function with only positive coefficents.
     * x is in the range [0 - 1/3].
     *
     * Transform xi for input to the above function by setting
     * x = (xi-1)/(xi+1).   Input to the polynomial is x^2, then
     * the result is multiplied by x.
     * @param xi number from which log is requested
     * @return log(xi)
     */
    static double[] slowLog(double xi) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59259);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59260);double x[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59261);double x2[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59262);double y[] = new double[2];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59263);double a[] = new double[2];

        __CLR4_4_119ig19iglb90pb1u.R.inc(59264);split(xi, x);

        /* Set X = (x-1)/(x+1) */
        __CLR4_4_119ig19iglb90pb1u.R.inc(59265);x[0] += 1.0;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59266);resplit(x);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59267);splitReciprocal(x, a);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59268);x[0] -= 2.0;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59269);resplit(x);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59270);splitMult(x, a, y);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59271);x[0] = y[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59272);x[1] = y[1];

        /* Square X -> X2*/
        __CLR4_4_119ig19iglb90pb1u.R.inc(59273);splitMult(x, x, x2);


        //x[0] -= 1.0;
        //resplit(x);

        __CLR4_4_119ig19iglb90pb1u.R.inc(59274);y[0] = LN_SPLIT_COEF[LN_SPLIT_COEF.length-1][0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59275);y[1] = LN_SPLIT_COEF[LN_SPLIT_COEF.length-1][1];

        __CLR4_4_119ig19iglb90pb1u.R.inc(59276);for (int i = LN_SPLIT_COEF.length-2; (((i >= 0)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59277)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59278)==0&false)); i--) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59279);splitMult(y, x2, a);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59280);y[0] = a[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59281);y[1] = a[1];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59282);splitAdd(y, LN_SPLIT_COEF[i], a);
            __CLR4_4_119ig19iglb90pb1u.R.inc(59283);y[0] = a[0];
            __CLR4_4_119ig19iglb90pb1u.R.inc(59284);y[1] = a[1];
        }

        }__CLR4_4_119ig19iglb90pb1u.R.inc(59285);splitMult(y, x, a);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59286);y[0] = a[0];
        __CLR4_4_119ig19iglb90pb1u.R.inc(59287);y[1] = a[1];

        __CLR4_4_119ig19iglb90pb1u.R.inc(59288);return y;
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}


    /**
     * Print an array.
     * @param out text output stream where output should be printed
     * @param name array name
     * @param expectedLen expected length of the array
     * @param array2d array data
     */
    static void printarray(PrintStream out, String name, int expectedLen, double[][] array2d) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59289);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59290);out.println(name);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59291);checkLen(expectedLen, array2d.length);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59292);out.println(TABLE_START_DECL + " ");
        __CLR4_4_119ig19iglb90pb1u.R.inc(59293);int i = 0;
        __CLR4_4_119ig19iglb90pb1u.R.inc(59294);for(double[] array : array2d) {{ // "double array[]" causes PMD parsing error
            __CLR4_4_119ig19iglb90pb1u.R.inc(59295);out.print("        {");
            __CLR4_4_119ig19iglb90pb1u.R.inc(59296);for(double d : array) {{ // assume inner array has very few entries
                __CLR4_4_119ig19iglb90pb1u.R.inc(59297);out.printf("%-25.25s", format(d)); // multiple entries per line
            }
            }__CLR4_4_119ig19iglb90pb1u.R.inc(59298);out.println("}, // " + i++);
        }
        }__CLR4_4_119ig19iglb90pb1u.R.inc(59299);out.println(TABLE_END_DECL);
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /**
     * Print an array.
     * @param out text output stream where output should be printed
     * @param name array name
     * @param expectedLen expected length of the array
     * @param array array data
     */
    static void printarray(PrintStream out, String name, int expectedLen, double[] array) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59300);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59301);out.println(name + "=");
        __CLR4_4_119ig19iglb90pb1u.R.inc(59302);checkLen(expectedLen, array.length);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59303);out.println(TABLE_START_DECL);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59304);for(double d : array){{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59305);out.printf("        %s%n", format(d)); // one entry per line
        }
        }__CLR4_4_119ig19iglb90pb1u.R.inc(59306);out.println(TABLE_END_DECL);
    }finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /** Format a double.
     * @param d double number to format
     * @return formatted number
     */
    static String format(double d) {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59307);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59308);if ((((d != d)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59309)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59310)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59311);return "Double.NaN,";
        } }else {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59312);return (((((d >= 0) )&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59313)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59314)==0&false))? "+" : "") + Double.toString(d) + "d,";
        }
    }}finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

    /**
     * Check two lengths are equal.
     * @param expectedLen expected length
     * @param actual actual length
     * @exception DimensionMismatchException if the two lengths are not equal
     */
    private static void checkLen(int expectedLen, int actual)
        throws DimensionMismatchException {try{__CLR4_4_119ig19iglb90pb1u.R.inc(59315);
        __CLR4_4_119ig19iglb90pb1u.R.inc(59316);if ((((expectedLen != actual)&&(__CLR4_4_119ig19iglb90pb1u.R.iget(59317)!=0|true))||(__CLR4_4_119ig19iglb90pb1u.R.iget(59318)==0&false))) {{
            __CLR4_4_119ig19iglb90pb1u.R.inc(59319);throw new DimensionMismatchException(actual, expectedLen);
        }
    }}finally{__CLR4_4_119ig19iglb90pb1u.R.flushNeeded();}}

}
