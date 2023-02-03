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


import java.util.HashSet;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.junit.Assert;
import org.junit.Test;

public class PrimesTest {static class __CLR4_4_127552755lb90pe61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,102650,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final int[] PRIMES = {//primes here have been verified one by one using Dario Alejandro Alpern's tool, see http://www.alpertron.com.ar/ECM.HTM
            2,3,5,7,11,13,17,19,23,29,31,43,47,53,71,73,79,89,97,
            107,137,151,157,271,293,331,409,607,617,683,829,
            1049,1103,1229,1657,
            2039,2053,//around first boundary in miller-rabin
            2251,2389,2473,2699,3271,3389,3449,5653,6449,6869,9067,9091,
            11251,12433,12959,22961,41047,46337,65413,80803,91577,92693,
            118423,656519,795659,
            1373639,1373677,//around second boundary in miller-rabin
            588977,952381,
            1013041,1205999,2814001,
            22605091,
            25325981,25326023,//around third boundary in miller-rabin
            100000007,715827881,
            2147483647//Integer.MAX_VALUE
            };

    public static final int[] NOT_PRIMES = {//composite chosen at random + particular values used in algorithms such as boundaries for millerRabin
            4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,
            275,
            2037,2041,2045,2046,2047,2048,2049,2051,2055,//around first boundary in miller-rabin
            9095,
            463465,
            1373637,1373641,1373651,1373652,1373653,1373654,1373655,1373673,1373675,1373679,//around second boundary in miller-rabin
            25325979,25325983,25325993,25325997,25325999,25326001,25326003,25326007,25326009,25326011,25326021,25326025,//around third boundary in miller-rabin
            100000005,
            1073741341,1073741823,2147473649,2147483641,2147483643,2147483645,2147483646};

    public static final int[] BELOW_2 = {
            Integer.MIN_VALUE,-1,0,1};

    void assertPrimeFactorsException(int n, Throwable expected) {try{__CLR4_4_127552755lb90pe61.R.inc(102569);
        __CLR4_4_127552755lb90pe61.R.inc(102570);try {
            __CLR4_4_127552755lb90pe61.R.inc(102571);Primes.primeFactors(n);
            __CLR4_4_127552755lb90pe61.R.inc(102572);Assert.fail("Exception not thrown");
        } catch (Throwable e) {
            __CLR4_4_127552755lb90pe61.R.inc(102573);Assert.assertEquals(expected.getClass(), e.getClass());
            __CLR4_4_127552755lb90pe61.R.inc(102574);if ((((expected.getMessage() != null)&&(__CLR4_4_127552755lb90pe61.R.iget(102575)!=0|true))||(__CLR4_4_127552755lb90pe61.R.iget(102576)==0&false))) {{
                __CLR4_4_127552755lb90pe61.R.inc(102577);Assert.assertEquals(expected.getMessage(), e.getMessage());
            }
        }}
    }finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}
    void assertNextPrimeException(int n, Throwable expected){try{__CLR4_4_127552755lb90pe61.R.inc(102578);
        __CLR4_4_127552755lb90pe61.R.inc(102579);try {
            __CLR4_4_127552755lb90pe61.R.inc(102580);Primes.nextPrime(n);
            __CLR4_4_127552755lb90pe61.R.inc(102581);Assert.fail("Exception not thrown");
        } catch(Throwable e) {
            __CLR4_4_127552755lb90pe61.R.inc(102582);Assert.assertEquals(expected.getClass(), e.getClass());
            __CLR4_4_127552755lb90pe61.R.inc(102583);if ((((expected.getMessage() != null)&&(__CLR4_4_127552755lb90pe61.R.iget(102584)!=0|true))||(__CLR4_4_127552755lb90pe61.R.iget(102585)==0&false))) {{
                __CLR4_4_127552755lb90pe61.R.inc(102586);Assert.assertEquals(expected.getMessage(), e.getMessage());
            }
        }}
    }finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}

    @Test
    public void testNextPrime() {__CLR4_4_127552755lb90pe61.R.globalSliceStart(getClass().getName(),102587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18qzaw1275n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127552755lb90pe61.R.rethrow($CLV_t2$);}finally{__CLR4_4_127552755lb90pe61.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.primes.PrimesTest.testNextPrime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102587,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18qzaw1275n(){try{__CLR4_4_127552755lb90pe61.R.inc(102587);

        __CLR4_4_127552755lb90pe61.R.inc(102588);Assert.assertEquals(2, Primes.nextPrime(0));
        __CLR4_4_127552755lb90pe61.R.inc(102589);Assert.assertEquals(2, Primes.nextPrime(1));
        __CLR4_4_127552755lb90pe61.R.inc(102590);Assert.assertEquals(2, Primes.nextPrime(2));
        __CLR4_4_127552755lb90pe61.R.inc(102591);Assert.assertEquals(3, Primes.nextPrime(3));
        __CLR4_4_127552755lb90pe61.R.inc(102592);Assert.assertEquals(5, Primes.nextPrime(4));
        __CLR4_4_127552755lb90pe61.R.inc(102593);Assert.assertEquals(5, Primes.nextPrime(5));

        __CLR4_4_127552755lb90pe61.R.inc(102594);for (int i = 0; (((i < SmallPrimes.PRIMES.length - 1)&&(__CLR4_4_127552755lb90pe61.R.iget(102595)!=0|true))||(__CLR4_4_127552755lb90pe61.R.iget(102596)==0&false)); i++) {{
            __CLR4_4_127552755lb90pe61.R.inc(102597);for (int j = SmallPrimes.PRIMES[i] + 1; (((j <= SmallPrimes.PRIMES[i + 1])&&(__CLR4_4_127552755lb90pe61.R.iget(102598)!=0|true))||(__CLR4_4_127552755lb90pe61.R.iget(102599)==0&false)); j++) {{
                __CLR4_4_127552755lb90pe61.R.inc(102600);Assert.assertEquals(SmallPrimes.PRIMES[i+1], Primes.nextPrime(j));
            }
        }}

        }__CLR4_4_127552755lb90pe61.R.inc(102601);Assert.assertEquals(25325981, Primes.nextPrime(25325981));
        __CLR4_4_127552755lb90pe61.R.inc(102602);for (int i = 25325981 + 1; (((i <= 25326023)&&(__CLR4_4_127552755lb90pe61.R.iget(102603)!=0|true))||(__CLR4_4_127552755lb90pe61.R.iget(102604)==0&false)); i++) {{
            __CLR4_4_127552755lb90pe61.R.inc(102605);Assert.assertEquals(25326023, Primes.nextPrime(i));
        }

        }__CLR4_4_127552755lb90pe61.R.inc(102606);Assert.assertEquals(Integer.MAX_VALUE, Primes.nextPrime(Integer.MAX_VALUE - 10));
        __CLR4_4_127552755lb90pe61.R.inc(102607);Assert.assertEquals(Integer.MAX_VALUE, Primes.nextPrime(Integer.MAX_VALUE - 1));
        __CLR4_4_127552755lb90pe61.R.inc(102608);Assert.assertEquals(Integer.MAX_VALUE, Primes.nextPrime(Integer.MAX_VALUE));

        __CLR4_4_127552755lb90pe61.R.inc(102609);assertNextPrimeException(Integer.MIN_VALUE, new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL,Integer.MIN_VALUE,0));
        __CLR4_4_127552755lb90pe61.R.inc(102610);assertNextPrimeException(-1, new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL,-1,0));
        __CLR4_4_127552755lb90pe61.R.inc(102611);assertNextPrimeException(-13, new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL,-13,0));
    }finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}

    @Test
    public void testIsPrime() throws Exception {__CLR4_4_127552755lb90pe61.R.globalSliceStart(getClass().getName(),102612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cn7ogm276c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127552755lb90pe61.R.rethrow($CLV_t2$);}finally{__CLR4_4_127552755lb90pe61.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.primes.PrimesTest.testIsPrime",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cn7ogm276c() throws Exception{try{__CLR4_4_127552755lb90pe61.R.inc(102612);
        __CLR4_4_127552755lb90pe61.R.inc(102613);for (int i : BELOW_2) {{
            __CLR4_4_127552755lb90pe61.R.inc(102614);Assert.assertFalse(Primes.isPrime(i));
        }
        }__CLR4_4_127552755lb90pe61.R.inc(102615);for (int i:NOT_PRIMES) {{
            __CLR4_4_127552755lb90pe61.R.inc(102616);Assert.assertFalse(Primes.isPrime(i));
        }
        }__CLR4_4_127552755lb90pe61.R.inc(102617);for (int i:PRIMES) {{
            __CLR4_4_127552755lb90pe61.R.inc(102618);Assert.assertTrue(Primes.isPrime(i));
        }
    }}finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}

    static int sum(List<Integer> numbers){try{__CLR4_4_127552755lb90pe61.R.inc(102619);
        __CLR4_4_127552755lb90pe61.R.inc(102620);int out = 0;
        __CLR4_4_127552755lb90pe61.R.inc(102621);for (int i:numbers) {{
            __CLR4_4_127552755lb90pe61.R.inc(102622);out += i;
        }
        }__CLR4_4_127552755lb90pe61.R.inc(102623);return out;
    }finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}
    static int product(List<Integer> numbers) {try{__CLR4_4_127552755lb90pe61.R.inc(102624);
        __CLR4_4_127552755lb90pe61.R.inc(102625);int out = 1;
        __CLR4_4_127552755lb90pe61.R.inc(102626);for (int i : numbers) {{
            __CLR4_4_127552755lb90pe61.R.inc(102627);out *= i;
        }
        }__CLR4_4_127552755lb90pe61.R.inc(102628);return out;
    }finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}
    static final HashSet<Integer> PRIMES_SET = new HashSet<Integer>();
    static {try{__CLR4_4_127552755lb90pe61.R.inc(102629);
        __CLR4_4_127552755lb90pe61.R.inc(102630);for (int p : PRIMES) {{
            __CLR4_4_127552755lb90pe61.R.inc(102631);PRIMES_SET.add(p);
        }
    }}finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}
    static void checkPrimeFactors(List<Integer> factors){try{__CLR4_4_127552755lb90pe61.R.inc(102632);
        __CLR4_4_127552755lb90pe61.R.inc(102633);for (int p : factors) {{
            __CLR4_4_127552755lb90pe61.R.inc(102634);if ((((!PRIMES_SET.contains(p))&&(__CLR4_4_127552755lb90pe61.R.iget(102635)!=0|true))||(__CLR4_4_127552755lb90pe61.R.iget(102636)==0&false))) {{
                __CLR4_4_127552755lb90pe61.R.inc(102637);Assert.fail("Not found in primes list: " + p);
            }
        }}
    }}finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}

    @Test
    public void testPrimeFactors() throws Exception {__CLR4_4_127552755lb90pe61.R.globalSliceStart(getClass().getName(),102638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16q128u2772();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127552755lb90pe61.R.rethrow($CLV_t2$);}finally{__CLR4_4_127552755lb90pe61.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.primes.PrimesTest.testPrimeFactors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16q128u2772() throws Exception{try{__CLR4_4_127552755lb90pe61.R.inc(102638);
        __CLR4_4_127552755lb90pe61.R.inc(102639);for (int i : BELOW_2) {{
            __CLR4_4_127552755lb90pe61.R.inc(102640);assertPrimeFactorsException(i, new MathIllegalArgumentException(LocalizedFormats.NUMBER_TOO_SMALL,i,2));
        }
        }__CLR4_4_127552755lb90pe61.R.inc(102641);for (int i : NOT_PRIMES) {{
            __CLR4_4_127552755lb90pe61.R.inc(102642);List<Integer> factors = Primes.primeFactors(i);
            __CLR4_4_127552755lb90pe61.R.inc(102643);checkPrimeFactors(factors);
            __CLR4_4_127552755lb90pe61.R.inc(102644);int prod = product(factors);
            __CLR4_4_127552755lb90pe61.R.inc(102645);Assert.assertEquals(i, prod);
        }
        }__CLR4_4_127552755lb90pe61.R.inc(102646);for (int i : PRIMES) {{
            __CLR4_4_127552755lb90pe61.R.inc(102647);List<Integer> factors = Primes.primeFactors(i);
            __CLR4_4_127552755lb90pe61.R.inc(102648);Assert.assertEquals(i, (int)factors.get(0));
            __CLR4_4_127552755lb90pe61.R.inc(102649);Assert.assertEquals(1, factors.size());
        }
    }}finally{__CLR4_4_127552755lb90pe61.R.flushNeeded();}}
}