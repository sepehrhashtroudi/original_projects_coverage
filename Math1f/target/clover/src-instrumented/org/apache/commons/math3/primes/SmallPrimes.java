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


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.FastMath;

/**
 * Utility methods to work on primes within the <code>int</code> range.
 * @version $Id$
 * @since 3.2
 */
class SmallPrimes {public static class __CLR4_4_110bi10bilb90pa9h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The first 512 prime numbers.
     * <p>
     * It contains all primes smaller or equal to the cubic square of Integer.MAX_VALUE.
     * As a result, <code>int</code> numbers which are not reduced by those primes are guaranteed
     * to be either prime or semi prime.
     */
    public static final int[] PRIMES = {2,
            3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
            79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
            181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283,
            293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419,
            421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547,
            557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661,
            673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811,
            821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947,
            953, 967, 971, 977, 983, 991, 997, 1009, 1013, 1019, 1021, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087,
            1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229,
            1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381,
            1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499, 1511, 1523,
            1531, 1543, 1549, 1553, 1559, 1567, 1571, 1579, 1583, 1597, 1601, 1607, 1609, 1613, 1619, 1621, 1627, 1637, 1657, 1663,
            1667, 1669, 1693, 1697, 1699, 1709, 1721, 1723, 1733, 1741, 1747, 1753, 1759, 1777, 1783, 1787, 1789, 1801, 1811, 1823,
            1831, 1847, 1861, 1867, 1871, 1873, 1877, 1879, 1889, 1901, 1907, 1913, 1931, 1933, 1949, 1951, 1973, 1979, 1987, 1993,
            1997, 1999, 2003, 2011, 2017, 2027, 2029, 2039, 2053, 2063, 2069, 2081, 2083, 2087, 2089, 2099, 2111, 2113, 2129, 2131,
            2137, 2141, 2143, 2153, 2161, 2179, 2203, 2207, 2213, 2221, 2237, 2239, 2243, 2251, 2267, 2269, 2273, 2281, 2287, 2293,
            2297, 2309, 2311, 2333, 2339, 2341, 2347, 2351, 2357, 2371, 2377, 2381, 2383, 2389, 2393, 2399, 2411, 2417, 2423, 2437,
            2441, 2447, 2459, 2467, 2473, 2477, 2503, 2521, 2531, 2539, 2543, 2549, 2551, 2557, 2579, 2591, 2593, 2609, 2617, 2621,
            2633, 2647, 2657, 2659, 2663, 2671, 2677, 2683, 2687, 2689, 2693, 2699, 2707, 2711, 2713, 2719, 2729, 2731, 2741, 2749,
            2753, 2767, 2777, 2789, 2791, 2797, 2801, 2803, 2819, 2833, 2837, 2843, 2851, 2857, 2861, 2879, 2887, 2897, 2903, 2909,
            2917, 2927, 2939, 2953, 2957, 2963, 2969, 2971, 2999, 3001, 3011, 3019, 3023, 3037, 3041, 3049, 3061, 3067, 3079, 3083,
            3089, 3109, 3119, 3121, 3137, 3163, 3167, 3169, 3181, 3187, 3191, 3203, 3209, 3217, 3221, 3229, 3251, 3253, 3257, 3259,
            3271, 3299, 3301, 3307, 3313, 3319, 3323, 3329, 3331, 3343, 3347, 3359, 3361, 3371, 3373, 3389, 3391, 3407, 3413, 3433,
            3449, 3457, 3461, 3463, 3467, 3469, 3491, 3499, 3511, 3517, 3527, 3529, 3533, 3539, 3541, 3547, 3557, 3559, 3571, 3581,
            3583, 3593, 3607, 3613, 3617, 3623, 3631, 3637, 3643, 3659, 3671};

    /** The last number in PRIMES. */
    public static final int PRIMES_LAST = PRIMES[PRIMES.length - 1];

    /**
     * Hide utility class.
     */
    private SmallPrimes() {try{__CLR4_4_110bi10bilb90pa9h.R.inc(47070);
    }finally{__CLR4_4_110bi10bilb90pa9h.R.flushNeeded();}}

    /**
     * Extract small factors.
     * @param n the number to factor, must be &gt; 0.
     * @param factors the list where to add the factors.
     * @return the part of n which remains to be factored, it is either a prime or a semi-prime
     */
    public static int smallTrialDivision(int n, final List<Integer> factors) {try{__CLR4_4_110bi10bilb90pa9h.R.inc(47071);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47072);for (int p : PRIMES) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47073);while ((((0 == n % p)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47074)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47075)==0&false))) {{
                __CLR4_4_110bi10bilb90pa9h.R.inc(47076);n = n / p;
                __CLR4_4_110bi10bilb90pa9h.R.inc(47077);factors.add(p);
            }
        }}
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47078);return n;
    }finally{__CLR4_4_110bi10bilb90pa9h.R.flushNeeded();}}

    /**
     * Extract factors in the range <code>PRIME_LAST+2</code> to <code>maxFactors</code>.
     * @param n the number to factorize, must be >= PRIME_LAST+2 and must not contain any factor below PRIME_LAST+2
     * @param maxFactor the upper bound of trial division: if it is reached, the method gives up and returns n.
     * @param factors the list where to add the factors.
     * @return  n or 1 if factorization is completed.
     */
    public static int boundedTrialDivision(int n, int maxFactor, List<Integer> factors) {try{__CLR4_4_110bi10bilb90pa9h.R.inc(47079);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47080);int f = PRIMES_LAST + 2;
        // no check is done about n >= f
        __CLR4_4_110bi10bilb90pa9h.R.inc(47081);while ((((f <= maxFactor)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47082)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47083)==0&false))) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47084);if ((((0 == n % f)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47085)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47086)==0&false))) {{
                __CLR4_4_110bi10bilb90pa9h.R.inc(47087);n = n / f;
                __CLR4_4_110bi10bilb90pa9h.R.inc(47088);factors.add(f);
                __CLR4_4_110bi10bilb90pa9h.R.inc(47089);break;
            }
            }__CLR4_4_110bi10bilb90pa9h.R.inc(47090);f += 4;
            __CLR4_4_110bi10bilb90pa9h.R.inc(47091);if ((((0 == n % f)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47092)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47093)==0&false))) {{
                __CLR4_4_110bi10bilb90pa9h.R.inc(47094);n = n / f;
                __CLR4_4_110bi10bilb90pa9h.R.inc(47095);factors.add(f);
                __CLR4_4_110bi10bilb90pa9h.R.inc(47096);break;
            }
            }__CLR4_4_110bi10bilb90pa9h.R.inc(47097);f += 2;
        }
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47098);if ((((n != 1)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47099)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47100)==0&false))) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47101);factors.add(n);
        }
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47102);return n;
    }finally{__CLR4_4_110bi10bilb90pa9h.R.flushNeeded();}}

    /**
     * Factorization by trial division.
     * @param n the number to factor
     * @return the list of prime factors of n
     */
    public static List<Integer> trialDivision(int n){try{__CLR4_4_110bi10bilb90pa9h.R.inc(47103);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47104);final List<Integer> factors = new ArrayList<Integer>(32);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47105);n = smallTrialDivision(n, factors);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47106);if ((((1 == n)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47107)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47108)==0&false))) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47109);return factors;
        }
        // here we are sure that n is either a prime or a semi prime
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47110);final int bound = (int) FastMath.sqrt(n);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47111);boundedTrialDivision(n, bound, factors);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47112);return factors;
    }finally{__CLR4_4_110bi10bilb90pa9h.R.flushNeeded();}}

    /**
     * Miller-Rabin probabilistic primality test for int type, used in such a way that a result is always guaranteed.
     * <p>
     * It uses the prime numbers as successive base therefore it is guaranteed to be always correct.
     * (see Handbook of applied cryptography by Menezes, table 4.1)
     *
     * @param n number to test: an odd integer &ge; 3
     * @return true if n is prime. false if n is definitely composite.
     */
    public static boolean millerRabinPrimeTest(final int n) {try{__CLR4_4_110bi10bilb90pa9h.R.inc(47113);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47114);final int nMinus1 = n - 1;
        __CLR4_4_110bi10bilb90pa9h.R.inc(47115);final int s = Integer.numberOfTrailingZeros(nMinus1);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47116);final int r = nMinus1 >> s;
        //r must be odd, it is not checked here
        __CLR4_4_110bi10bilb90pa9h.R.inc(47117);int t = 1;
        __CLR4_4_110bi10bilb90pa9h.R.inc(47118);if ((((n >= 2047)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47119)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47120)==0&false))) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47121);t = 2;
        }
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47122);if ((((n >= 1373653)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47123)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47124)==0&false))) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47125);t = 3;
        }
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47126);if ((((n >= 25326001)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47127)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47128)==0&false))) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47129);t = 4;
        } // works up to 3.2 billion, int range stops at 2.7 so we are safe :-)
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47130);BigInteger br = BigInteger.valueOf(r);
        __CLR4_4_110bi10bilb90pa9h.R.inc(47131);BigInteger bn = BigInteger.valueOf(n);

        __CLR4_4_110bi10bilb90pa9h.R.inc(47132);for (int i = 0; (((i < t)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47133)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47134)==0&false)); i++) {{
            __CLR4_4_110bi10bilb90pa9h.R.inc(47135);BigInteger a = BigInteger.valueOf(SmallPrimes.PRIMES[i]);
            __CLR4_4_110bi10bilb90pa9h.R.inc(47136);BigInteger bPow = a.modPow(br, bn);
            __CLR4_4_110bi10bilb90pa9h.R.inc(47137);int y = bPow.intValue();
            __CLR4_4_110bi10bilb90pa9h.R.inc(47138);if (((((1 != y) && (y != nMinus1))&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47139)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47140)==0&false))) {{
                __CLR4_4_110bi10bilb90pa9h.R.inc(47141);int j = 1;
                __CLR4_4_110bi10bilb90pa9h.R.inc(47142);while (((((j <= s - 1) && (nMinus1 != y))&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47143)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47144)==0&false))) {{
                    __CLR4_4_110bi10bilb90pa9h.R.inc(47145);long square = ((long) y) * y;
                    __CLR4_4_110bi10bilb90pa9h.R.inc(47146);y = (int) (square % n);
                    __CLR4_4_110bi10bilb90pa9h.R.inc(47147);if ((((1 == y)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47148)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47149)==0&false))) {{
                        __CLR4_4_110bi10bilb90pa9h.R.inc(47150);return false;
                    } // definitely composite
                    }__CLR4_4_110bi10bilb90pa9h.R.inc(47151);j++;
                }
                }__CLR4_4_110bi10bilb90pa9h.R.inc(47152);if ((((nMinus1 != y)&&(__CLR4_4_110bi10bilb90pa9h.R.iget(47153)!=0|true))||(__CLR4_4_110bi10bilb90pa9h.R.iget(47154)==0&false))) {{
                    __CLR4_4_110bi10bilb90pa9h.R.inc(47155);return false;
                } // definitely composite
            }}
        }}
        }__CLR4_4_110bi10bilb90pa9h.R.inc(47156);return true; // definitely prime
    }finally{__CLR4_4_110bi10bilb90pa9h.R.flushNeeded();}}
}

