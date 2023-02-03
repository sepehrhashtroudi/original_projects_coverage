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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.FastMath;

/**
 * Implementation of the Pollard's rho factorization algorithm.
 * @version $Id$
 * @since 3.2
 */
class PollardRho {public static class __CLR4_4_1107l107llb90pa8e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,47014,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Hide utility class.
     */
    private PollardRho() {try{__CLR4_4_1107l107llb90pa8e.R.inc(46929);
    }finally{__CLR4_4_1107l107llb90pa8e.R.flushNeeded();}}

    /**
     * Factorization using Pollard's rho algorithm.
     * @param n number to factors, must be &gt; 0
     * @return the list of prime factors of n.
     */
    public static List<Integer> primeFactors(int n) {try{__CLR4_4_1107l107llb90pa8e.R.inc(46930);
        __CLR4_4_1107l107llb90pa8e.R.inc(46931);final List<Integer> factors = new ArrayList<Integer>();

        __CLR4_4_1107l107llb90pa8e.R.inc(46932);n = SmallPrimes.smallTrialDivision(n, factors);
        __CLR4_4_1107l107llb90pa8e.R.inc(46933);if ((((1 == n)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46934)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46935)==0&false))) {{
            __CLR4_4_1107l107llb90pa8e.R.inc(46936);return factors;
        }

        }__CLR4_4_1107l107llb90pa8e.R.inc(46937);if ((((SmallPrimes.millerRabinPrimeTest(n))&&(__CLR4_4_1107l107llb90pa8e.R.iget(46938)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46939)==0&false))) {{
            __CLR4_4_1107l107llb90pa8e.R.inc(46940);factors.add(n);
            __CLR4_4_1107l107llb90pa8e.R.inc(46941);return factors;
        }

        }__CLR4_4_1107l107llb90pa8e.R.inc(46942);int divisor = rhoBrent(n);
        __CLR4_4_1107l107llb90pa8e.R.inc(46943);factors.add(divisor);
        __CLR4_4_1107l107llb90pa8e.R.inc(46944);factors.add(n / divisor);
        __CLR4_4_1107l107llb90pa8e.R.inc(46945);return factors;
    }finally{__CLR4_4_1107l107llb90pa8e.R.flushNeeded();}}

    /**
     * Implementation of the Pollard's rho factorization algorithm.
     * <p>
     * This implementation follows the paper "An improved Monte Carlo factorization algorithm"
     * by Richard P. Brent. This avoids the triple computation of f(x) typically found in Pollard's
     * rho implementations. It also batches several gcd computation into 1.
     * <p>
     * The backtracking is not implemented as we deal only with semi-primes.
     *
     * @param n number to factor, must be semi-prime.
     * @return a prime factor of n.
     */
    static int rhoBrent(final int n) {try{__CLR4_4_1107l107llb90pa8e.R.inc(46946);
        __CLR4_4_1107l107llb90pa8e.R.inc(46947);final int x0 = 2;
        __CLR4_4_1107l107llb90pa8e.R.inc(46948);final int m = 25;
        __CLR4_4_1107l107llb90pa8e.R.inc(46949);int cst = SmallPrimes.PRIMES_LAST;
        __CLR4_4_1107l107llb90pa8e.R.inc(46950);int y = x0;
        __CLR4_4_1107l107llb90pa8e.R.inc(46951);int r = 1;
        __CLR4_4_1107l107llb90pa8e.R.inc(46952);do {{
            __CLR4_4_1107l107llb90pa8e.R.inc(46953);int x = y;
            __CLR4_4_1107l107llb90pa8e.R.inc(46954);for (int i = 0; (((i < r)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46955)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46956)==0&false)); i++) {{
                __CLR4_4_1107l107llb90pa8e.R.inc(46957);final long y2 = ((long) y) * y;
                __CLR4_4_1107l107llb90pa8e.R.inc(46958);y = (int) ((y2 + cst) % n);
            }
            }__CLR4_4_1107l107llb90pa8e.R.inc(46959);int k = 0;
            __CLR4_4_1107l107llb90pa8e.R.inc(46960);do {{
                __CLR4_4_1107l107llb90pa8e.R.inc(46961);final int bound = FastMath.min(m, r - k);
                __CLR4_4_1107l107llb90pa8e.R.inc(46962);int q = 1;
                __CLR4_4_1107l107llb90pa8e.R.inc(46963);for (int i = -3; (((i < bound)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46964)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46965)==0&false)); i++) {{ //start at -3 to ensure we enter this loop at least 3 times
                    __CLR4_4_1107l107llb90pa8e.R.inc(46966);final long y2 = ((long) y) * y;
                    __CLR4_4_1107l107llb90pa8e.R.inc(46967);y = (int) ((y2 + cst) % n);
                    __CLR4_4_1107l107llb90pa8e.R.inc(46968);final long divisor = FastMath.abs(x - y);
                    __CLR4_4_1107l107llb90pa8e.R.inc(46969);if ((((0 == divisor)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46970)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46971)==0&false))) {{
                        __CLR4_4_1107l107llb90pa8e.R.inc(46972);cst += SmallPrimes.PRIMES_LAST;
                        __CLR4_4_1107l107llb90pa8e.R.inc(46973);k = -m;
                        __CLR4_4_1107l107llb90pa8e.R.inc(46974);y = x0;
                        __CLR4_4_1107l107llb90pa8e.R.inc(46975);r = 1;
                        __CLR4_4_1107l107llb90pa8e.R.inc(46976);break;
                    }
                    }__CLR4_4_1107l107llb90pa8e.R.inc(46977);final long prod = divisor * q;
                    __CLR4_4_1107l107llb90pa8e.R.inc(46978);q = (int) (prod % n);
                    __CLR4_4_1107l107llb90pa8e.R.inc(46979);if ((((0 == q)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46980)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46981)==0&false))) {{
                        __CLR4_4_1107l107llb90pa8e.R.inc(46982);return gcdPositive(FastMath.abs((int) divisor), n);
                    }
                }}
                }__CLR4_4_1107l107llb90pa8e.R.inc(46983);final int out = gcdPositive(FastMath.abs(q), n);
                __CLR4_4_1107l107llb90pa8e.R.inc(46984);if ((((1 != out)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46985)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46986)==0&false))) {{
                    __CLR4_4_1107l107llb90pa8e.R.inc(46987);return out;
                }
                }__CLR4_4_1107l107llb90pa8e.R.inc(46988);k = k + m;
            } }while ((((k < r)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46989)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46990)==0&false)));
            __CLR4_4_1107l107llb90pa8e.R.inc(46991);r = 2 * r;
        } }while (true);
    }finally{__CLR4_4_1107l107llb90pa8e.R.flushNeeded();}}

    /**
     * Gcd between two positive numbers.
     * <p>
     * Gets the greatest common divisor of two numbers, using the "binary gcd" method,
     * which avoids division and modulo operations. See Knuth 4.5.2 algorithm B.
     * This algorithm is due to Josef Stein (1961).
     * </p>
     * Special cases:
     * <ul>
     * <li>The result of {@code gcd(x, x)}, {@code gcd(0, x)} and {@code gcd(x, 0)} is the value of {@code x}.</li>
     * <li>The invocation {@code gcd(0, 0)} is the only one which returns {@code 0}.</li>
     * </ul>
     *
     * @param a first number, must be &ge; 0
     * @param b second number, must be &ge; 0
     * @return gcd(a,b)
     */
    static int gcdPositive(int a, int b){try{__CLR4_4_1107l107llb90pa8e.R.inc(46992);
        // both a and b must be positive, it is not checked here
        // gdc(a,0) = a
        __CLR4_4_1107l107llb90pa8e.R.inc(46993);if ((((a == 0)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46994)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46995)==0&false))) {{
            __CLR4_4_1107l107llb90pa8e.R.inc(46996);return b;
        } }else {__CLR4_4_1107l107llb90pa8e.R.inc(46997);if ((((b == 0)&&(__CLR4_4_1107l107llb90pa8e.R.iget(46998)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(46999)==0&false))) {{
            __CLR4_4_1107l107llb90pa8e.R.inc(47000);return a;
        }

        // make a and b odd, keep in mind the common power of twos
        }}__CLR4_4_1107l107llb90pa8e.R.inc(47001);final int aTwos = Integer.numberOfTrailingZeros(a);
        __CLR4_4_1107l107llb90pa8e.R.inc(47002);a >>= aTwos;
        __CLR4_4_1107l107llb90pa8e.R.inc(47003);final int bTwos = Integer.numberOfTrailingZeros(b);
        __CLR4_4_1107l107llb90pa8e.R.inc(47004);b >>= bTwos;
        __CLR4_4_1107l107llb90pa8e.R.inc(47005);final int shift = FastMath.min(aTwos, bTwos);

        // a and b >0
        // if a > b then gdc(a,b) = gcd(a-b,b)
        // if a < b then gcd(a,b) = gcd(b-a,a)
        // so next a is the absolute difference and next b is the minimum of current values
        __CLR4_4_1107l107llb90pa8e.R.inc(47006);while ((((a != b)&&(__CLR4_4_1107l107llb90pa8e.R.iget(47007)!=0|true))||(__CLR4_4_1107l107llb90pa8e.R.iget(47008)==0&false))) {{
            __CLR4_4_1107l107llb90pa8e.R.inc(47009);final int delta = a - b;
            __CLR4_4_1107l107llb90pa8e.R.inc(47010);b = FastMath.min(a, b);
            __CLR4_4_1107l107llb90pa8e.R.inc(47011);a = FastMath.abs(delta);
            // for speed optimization:
            // remove any power of two in a as b is guaranteed to be odd throughout all iterations
            __CLR4_4_1107l107llb90pa8e.R.inc(47012);a >>= Integer.numberOfTrailingZeros(a);
        }

        // gcd(a,a) = a, just "add" the common power of twos
        }__CLR4_4_1107l107llb90pa8e.R.inc(47013);return a << shift;
    }finally{__CLR4_4_1107l107llb90pa8e.R.flushNeeded();}}
}
