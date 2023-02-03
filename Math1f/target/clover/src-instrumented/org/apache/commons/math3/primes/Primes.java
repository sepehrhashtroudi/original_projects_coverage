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
package org.apache.commons.math3.primes;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

import java.util.List;


/**
 * Methods related to prime numbers in the range of <code>int</code>:
 * <ul>
 * <li>primality test</li>
 * <li>prime number generation</li>
 * <li>factorization</li>
 * </ul>
 *
 * @version $Id$
 * @since 3.2
 */
public class Primes {public static class __CLR4_4_1109y109ylb90pa8i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Hide utility class.
     */
    private Primes() {try{__CLR4_4_1109y109ylb90pa8i.R.inc(47014);
    }finally{__CLR4_4_1109y109ylb90pa8i.R.flushNeeded();}}

    /**
     * Primality test: tells if the argument is a (provable) prime or not.
     * <p>
     * It uses the Miller-Rabin probabilistic test in such a way that a result is guaranteed:
     * it uses the firsts prime numbers as successive base (see Handbook of applied cryptography
     * by Menezes, table 4.1).
     *
     * @param n number to test.
     * @return true if n is prime. (All numbers &lt; 2 return false).
     */
    public static boolean isPrime(int n) {try{__CLR4_4_1109y109ylb90pa8i.R.inc(47015);
        __CLR4_4_1109y109ylb90pa8i.R.inc(47016);if ((((n < 2)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47017)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47018)==0&false))) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47019);return false;
        }

        }__CLR4_4_1109y109ylb90pa8i.R.inc(47020);for (int p : SmallPrimes.PRIMES) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47021);if ((((0 == (n % p))&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47022)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47023)==0&false))) {{
                __CLR4_4_1109y109ylb90pa8i.R.inc(47024);return n == p;
            }
        }}
        }__CLR4_4_1109y109ylb90pa8i.R.inc(47025);return SmallPrimes.millerRabinPrimeTest(n);
    }finally{__CLR4_4_1109y109ylb90pa8i.R.flushNeeded();}}

    /**
     * Return the smallest prime greater than or equal to n.
     *
     * @param n a positive number.
     * @return the smallest prime greater than or equal to n.
     * @throws MathIllegalArgumentException if n &lt; 0.
     */
    public static int nextPrime(int n) {try{__CLR4_4_1109y109ylb90pa8i.R.inc(47026);
        __CLR4_4_1109y109ylb90pa8i.R.inc(47027);if ((((n < 0)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47028)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47029)==0&false))) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47030);throw new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL, n, 0);
        }
        }__CLR4_4_1109y109ylb90pa8i.R.inc(47031);if ((((n == 2)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47032)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47033)==0&false))) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47034);return 2;
        }
        }__CLR4_4_1109y109ylb90pa8i.R.inc(47035);n = n | 1;//make sure n is odd
        __CLR4_4_1109y109ylb90pa8i.R.inc(47036);if ((((n == 1)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47037)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47038)==0&false))) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47039);return 2;
        }

        }__CLR4_4_1109y109ylb90pa8i.R.inc(47040);if ((((isPrime(n))&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47041)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47042)==0&false))) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47043);return n;
        }

        // prepare entry in the +2, +4 loop:
        // n should not be a multiple of 3
        }__CLR4_4_1109y109ylb90pa8i.R.inc(47044);final int rem = n % 3;
        __CLR4_4_1109y109ylb90pa8i.R.inc(47045);if ((((0 == rem)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47046)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47047)==0&false))) {{ // if n % 3 == 0
            __CLR4_4_1109y109ylb90pa8i.R.inc(47048);n += 2; // n % 3 == 2
        } }else {__CLR4_4_1109y109ylb90pa8i.R.inc(47049);if ((((1 == rem)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47050)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47051)==0&false))) {{ // if n % 3 == 1
            // if (isPrime(n)) return n;
            __CLR4_4_1109y109ylb90pa8i.R.inc(47052);n += 4; // n % 3 == 2
        }
        }}__CLR4_4_1109y109ylb90pa8i.R.inc(47053);while (true) {{ // this loop skips all multiple of 3
            __CLR4_4_1109y109ylb90pa8i.R.inc(47054);if ((((isPrime(n))&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47055)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47056)==0&false))) {{
                __CLR4_4_1109y109ylb90pa8i.R.inc(47057);return n;
            }
            }__CLR4_4_1109y109ylb90pa8i.R.inc(47058);n += 2; // n % 3 == 1
            __CLR4_4_1109y109ylb90pa8i.R.inc(47059);if ((((isPrime(n))&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47060)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47061)==0&false))) {{
                __CLR4_4_1109y109ylb90pa8i.R.inc(47062);return n;
            }
            }__CLR4_4_1109y109ylb90pa8i.R.inc(47063);n += 4; // n % 3 == 2
        }
    }}finally{__CLR4_4_1109y109ylb90pa8i.R.flushNeeded();}}

    /**
     * Prime factors decomposition
     *
     * @param n number to factorize: must be &ge; 2
     * @return list of prime factors of n
     * @throws MathIllegalArgumentException if n &lt; 2.
     */
    public static List<Integer> primeFactors(int n) {try{__CLR4_4_1109y109ylb90pa8i.R.inc(47064);

        __CLR4_4_1109y109ylb90pa8i.R.inc(47065);if ((((n < 2)&&(__CLR4_4_1109y109ylb90pa8i.R.iget(47066)!=0|true))||(__CLR4_4_1109y109ylb90pa8i.R.iget(47067)==0&false))) {{
            __CLR4_4_1109y109ylb90pa8i.R.inc(47068);throw new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL, n, 2);
        }
        // slower than trial div unless we do an awful lot of computation
        // (then it finally gets JIT-compiled efficiently
        // List<Integer> out = PollardRho.primeFactors(n);
        }__CLR4_4_1109y109ylb90pa8i.R.inc(47069);return SmallPrimes.trialDivision(n);

    }finally{__CLR4_4_1109y109ylb90pa8i.R.flushNeeded();}}

}
