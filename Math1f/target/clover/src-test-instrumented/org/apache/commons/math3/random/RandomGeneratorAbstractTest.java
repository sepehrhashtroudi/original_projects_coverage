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
package org.apache.commons.math3.random;

import java.util.Arrays;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.MathIllegalArgumentException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Base class for RandomGenerator tests.
 *
 * Tests RandomGenerator methods directly and also executes RandomDataTest
 * test cases against a RandomDataImpl created using the provided generator.
 *
 * RandomGenerator test classes should extend this class, implementing
 * makeGenerator() to provide a concrete generator to test. The generator
 * returned by makeGenerator should be seeded with a fixed seed.
 *
 * @version $Id$
 */

public abstract class RandomGeneratorAbstractTest extends RandomDataGeneratorTest {static class __CLR4_4_128c128c1lb90peac{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** RandomGenerator under test */
    protected RandomGenerator generator;

    /**
     * Override this method in subclasses to provide a concrete generator to test.
     * Return a generator seeded with a fixed seed.
     */
    protected abstract RandomGenerator makeGenerator();

    /**
     * Initialize generator and randomData instance in superclass.
     */
    public RandomGeneratorAbstractTest() {try{__CLR4_4_128c128c1lb90peac.R.inc(104113);
        __CLR4_4_128c128c1lb90peac.R.inc(104114);generator = makeGenerator();
        __CLR4_4_128c128c1lb90peac.R.inc(104115);randomData = new RandomDataGenerator(generator);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    /**
     * Set a fixed seed for the tests
     */
    @Before
    public void setUp() {try{__CLR4_4_128c128c1lb90peac.R.inc(104116);
        __CLR4_4_128c128c1lb90peac.R.inc(104117);generator = makeGenerator();
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    
    // Omit secureXxx tests, since they do not use the provided generator
    @Override
    public void testNextSecureLongIAE() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfssas28c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfssas28c6(){try{__CLR4_4_128c128c1lb90peac.R.inc(104118);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureLongNegativeToPositiveRange() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlcxwj28c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongNegativeToPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlcxwj28c7(){try{__CLR4_4_128c128c1lb90peac.R.inc(104119);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureLongNegativeRange() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i45ka128c8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongNegativeRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i45ka128c8(){try{__CLR4_4_128c128c1lb90peac.R.inc(104120);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureLongPositiveRange() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vycvh28c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureLongPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vycvh28c9(){try{__CLR4_4_128c128c1lb90peac.R.inc(104121);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureIntIAE() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16byd8h28ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16byd8h28ca(){try{__CLR4_4_128c128c1lb90peac.R.inc(104122);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureIntNegativeToPositiveRange() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgbb4o28cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntNegativeToPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgbb4o28cb(){try{__CLR4_4_128c128c1lb90peac.R.inc(104123);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureIntNegativeRange() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ar1tp828cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntNegativeRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ar1tp828cc(){try{__CLR4_4_128c128c1lb90peac.R.inc(104124);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureIntPositiveRange() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz913s28cd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureIntPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz913s28cd(){try{__CLR4_4_128c128c1lb90peac.R.inc(104125);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}
    @Override
    public void testNextSecureHex() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrf06228ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextSecureHex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrf06228ce(){try{__CLR4_4_128c128c1lb90peac.R.inc(104126);}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    /**
     * Tests uniformity of nextInt(int) distribution by generating 1000
     * samples for each of 10 test values and for each sample performing
     * a chi-square test of homogeneity of the observed distribution with
     * the expected uniform distribution.  Tests are performed at the .01
     * level and an average failure rate higher than 2% (i.e. more than 20
     * null hypothesis rejections) causes the test case to fail.
     *
     * All random values are generated using the generator instance used by
     * other tests and the generator is not reseeded, so this is a fixed seed
     * test.
     */
    public void testNextIntDirect() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lri2di28cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntDirect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lri2di28cf(){try{__CLR4_4_128c128c1lb90peac.R.inc(104127);
        // Set up test values - end of the array filled randomly
        __CLR4_4_128c128c1lb90peac.R.inc(104128);int[] testValues = new int[] {4, 10, 12, 32, 100, 10000, 0, 0, 0, 0};
        __CLR4_4_128c128c1lb90peac.R.inc(104129);for (int i = 6; (((i < 10)&&(__CLR4_4_128c128c1lb90peac.R.iget(104130)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104131)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104132);final int val = generator.nextInt();
            __CLR4_4_128c128c1lb90peac.R.inc(104133);testValues[i] = (((val < 0 )&&(__CLR4_4_128c128c1lb90peac.R.iget(104134)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104135)==0&false))? -val : val + 1;
        }

        }__CLR4_4_128c128c1lb90peac.R.inc(104136);final int numTests = 1000;
        __CLR4_4_128c128c1lb90peac.R.inc(104137);for (int i = 0; (((i < testValues.length)&&(__CLR4_4_128c128c1lb90peac.R.iget(104138)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104139)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104140);final int n = testValues[i];
            // Set up bins
            __CLR4_4_128c128c1lb90peac.R.inc(104141);int[] binUpperBounds;
            __CLR4_4_128c128c1lb90peac.R.inc(104142);if ((((n < 32)&&(__CLR4_4_128c128c1lb90peac.R.iget(104143)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104144)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104145);binUpperBounds = new int[n];
                __CLR4_4_128c128c1lb90peac.R.inc(104146);for (int k = 0; (((k < n)&&(__CLR4_4_128c128c1lb90peac.R.iget(104147)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104148)==0&false)); k++) {{
                    __CLR4_4_128c128c1lb90peac.R.inc(104149);binUpperBounds[k] = k;
                }
            }} }else {{
                __CLR4_4_128c128c1lb90peac.R.inc(104150);binUpperBounds = new int[10];
                __CLR4_4_128c128c1lb90peac.R.inc(104151);final int step = n / 10;
                __CLR4_4_128c128c1lb90peac.R.inc(104152);for (int k = 0; (((k < 9)&&(__CLR4_4_128c128c1lb90peac.R.iget(104153)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104154)==0&false)); k++) {{
                    __CLR4_4_128c128c1lb90peac.R.inc(104155);binUpperBounds[k] = (k + 1) * step;
                }
                }__CLR4_4_128c128c1lb90peac.R.inc(104156);binUpperBounds[9] = n - 1;
            }
            // Run the tests
            }__CLR4_4_128c128c1lb90peac.R.inc(104157);int numFailures = 0;
            __CLR4_4_128c128c1lb90peac.R.inc(104158);final int binCount = binUpperBounds.length;
            __CLR4_4_128c128c1lb90peac.R.inc(104159);final long[] observed = new long[binCount];
            __CLR4_4_128c128c1lb90peac.R.inc(104160);final double[] expected = new double[binCount];
            __CLR4_4_128c128c1lb90peac.R.inc(104161);expected[0] = (((binUpperBounds[0] == 0 )&&(__CLR4_4_128c128c1lb90peac.R.iget(104162)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104163)==0&false))? (double) smallSampleSize / (double) n :
                (double) ((binUpperBounds[0] + 1) * smallSampleSize) / (double) n;
            __CLR4_4_128c128c1lb90peac.R.inc(104164);for (int k = 1; (((k < binCount)&&(__CLR4_4_128c128c1lb90peac.R.iget(104165)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104166)==0&false)); k++) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104167);expected[k] = (double) smallSampleSize *
                (double) (binUpperBounds[k] - binUpperBounds[k - 1]) / n;
            }
            }__CLR4_4_128c128c1lb90peac.R.inc(104168);for (int j = 0; (((j < numTests)&&(__CLR4_4_128c128c1lb90peac.R.iget(104169)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104170)==0&false)); j++) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104171);Arrays.fill(observed, 0);
                __CLR4_4_128c128c1lb90peac.R.inc(104172);for (int k = 0; (((k < smallSampleSize)&&(__CLR4_4_128c128c1lb90peac.R.iget(104173)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104174)==0&false)); k++) {{
                    __CLR4_4_128c128c1lb90peac.R.inc(104175);final int value = generator.nextInt(n);
                    __CLR4_4_128c128c1lb90peac.R.inc(104176);Assert.assertTrue("nextInt range",(value >= 0) && (value < n));
                    __CLR4_4_128c128c1lb90peac.R.inc(104177);for (int l = 0; (((l < binCount)&&(__CLR4_4_128c128c1lb90peac.R.iget(104178)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104179)==0&false)); l++) {{
                        __CLR4_4_128c128c1lb90peac.R.inc(104180);if ((((binUpperBounds[l] >= value)&&(__CLR4_4_128c128c1lb90peac.R.iget(104181)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104182)==0&false))) {{
                            __CLR4_4_128c128c1lb90peac.R.inc(104183);observed[l]++;
                            __CLR4_4_128c128c1lb90peac.R.inc(104184);break;
                        }
                    }}
                }}
                }__CLR4_4_128c128c1lb90peac.R.inc(104185);if ((((testStatistic.chiSquareTest(expected, observed) < 0.01)&&(__CLR4_4_128c128c1lb90peac.R.iget(104186)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104187)==0&false))) {{
                    __CLR4_4_128c128c1lb90peac.R.inc(104188);numFailures++;
                }
            }}
            }__CLR4_4_128c128c1lb90peac.R.inc(104189);if (((((double) numFailures / (double) numTests > 0.02)&&(__CLR4_4_128c128c1lb90peac.R.iget(104190)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104191)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104192);Assert.fail("Too many failures for n = " + n +
                " " + numFailures + " out of " + numTests + " tests failed.");
            }
        }}
    }}finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNextIntIAE2() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f7fva28e9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntIAE2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f7fva28e9(){try{__CLR4_4_128c128c1lb90peac.R.inc(104193);
        __CLR4_4_128c128c1lb90peac.R.inc(104194);try {
            __CLR4_4_128c128c1lb90peac.R.inc(104195);generator.nextInt(-1);
            __CLR4_4_128c128c1lb90peac.R.inc(104196);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_128c128c1lb90peac.R.inc(104197);try {
            __CLR4_4_128c128c1lb90peac.R.inc(104198);generator.nextInt(0);
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNextLongDirect() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pktn8v28ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextLongDirect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104199,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pktn8v28ef(){try{__CLR4_4_128c128c1lb90peac.R.inc(104199);
        __CLR4_4_128c128c1lb90peac.R.inc(104200);long q1 = Long.MAX_VALUE/4;
        __CLR4_4_128c128c1lb90peac.R.inc(104201);long q2 = 2 *  q1;
        __CLR4_4_128c128c1lb90peac.R.inc(104202);long q3 = 3 * q1;

        __CLR4_4_128c128c1lb90peac.R.inc(104203);Frequency freq = new Frequency();
        __CLR4_4_128c128c1lb90peac.R.inc(104204);long val = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104205);int value = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104206);for (int i=0; (((i<smallSampleSize)&&(__CLR4_4_128c128c1lb90peac.R.iget(104207)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104208)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104209);val = generator.nextLong();
            __CLR4_4_128c128c1lb90peac.R.inc(104210);val = (((val < 0 )&&(__CLR4_4_128c128c1lb90peac.R.iget(104211)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104212)==0&false))? -val : val;
            __CLR4_4_128c128c1lb90peac.R.inc(104213);if ((((val < q1)&&(__CLR4_4_128c128c1lb90peac.R.iget(104214)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104215)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104216);value = 0;
            } }else {__CLR4_4_128c128c1lb90peac.R.inc(104217);if ((((val < q2)&&(__CLR4_4_128c128c1lb90peac.R.iget(104218)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104219)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104220);value = 1;
            } }else {__CLR4_4_128c128c1lb90peac.R.inc(104221);if ((((val < q3)&&(__CLR4_4_128c128c1lb90peac.R.iget(104222)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104223)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104224);value = 2;
            } }else {{
                __CLR4_4_128c128c1lb90peac.R.inc(104225);value = 3;
            }
            }}}__CLR4_4_128c128c1lb90peac.R.inc(104226);freq.addValue(value);
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104227);long[] observed = new long[4];
        __CLR4_4_128c128c1lb90peac.R.inc(104228);for (int i=0; (((i<4)&&(__CLR4_4_128c128c1lb90peac.R.iget(104229)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104230)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104231);observed[i] = freq.getCount(i);
        }

        /* Use ChiSquare dist with df = 4-1 = 3, alpha = .001
         * Change to 11.34 for alpha = .01
         */
        }__CLR4_4_128c128c1lb90peac.R.inc(104232);Assert.assertTrue("chi-square test -- will fail about 1 in 1000 times",
                testStatistic.chiSquare(expected,observed) < 16.27);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNextBooleanDirect() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1veso8d28fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextBooleanDirect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1veso8d28fd(){try{__CLR4_4_128c128c1lb90peac.R.inc(104233);
        __CLR4_4_128c128c1lb90peac.R.inc(104234);long halfSampleSize = smallSampleSize / 2;
        __CLR4_4_128c128c1lb90peac.R.inc(104235);double[] expected = {halfSampleSize, halfSampleSize};
        __CLR4_4_128c128c1lb90peac.R.inc(104236);long[] observed = new long[2];
        __CLR4_4_128c128c1lb90peac.R.inc(104237);for (int i=0; (((i<smallSampleSize)&&(__CLR4_4_128c128c1lb90peac.R.iget(104238)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104239)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104240);if ((((generator.nextBoolean())&&(__CLR4_4_128c128c1lb90peac.R.iget(104241)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104242)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104243);observed[0]++;
            } }else {{
                __CLR4_4_128c128c1lb90peac.R.inc(104244);observed[1]++;
            }
        }}
        /* Use ChiSquare dist with df = 2-1 = 1, alpha = .001
         * Change to 6.635 for alpha = .01
         */
        }__CLR4_4_128c128c1lb90peac.R.inc(104245);Assert.assertTrue("chi-square test -- will fail about 1 in 1000 times",
                testStatistic.chiSquare(expected,observed) < 10.828);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNextFloatDirect() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd6o1l28fq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextFloatDirect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd6o1l28fq(){try{__CLR4_4_128c128c1lb90peac.R.inc(104246);
        __CLR4_4_128c128c1lb90peac.R.inc(104247);Frequency freq = new Frequency();
        __CLR4_4_128c128c1lb90peac.R.inc(104248);float val = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104249);int value = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104250);for (int i=0; (((i<smallSampleSize)&&(__CLR4_4_128c128c1lb90peac.R.iget(104251)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104252)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104253);val = generator.nextFloat();
            __CLR4_4_128c128c1lb90peac.R.inc(104254);if ((((val < 0.25)&&(__CLR4_4_128c128c1lb90peac.R.iget(104255)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104256)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104257);value = 0;
            } }else {__CLR4_4_128c128c1lb90peac.R.inc(104258);if ((((val < 0.5)&&(__CLR4_4_128c128c1lb90peac.R.iget(104259)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104260)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104261);value = 1;
            } }else {__CLR4_4_128c128c1lb90peac.R.inc(104262);if ((((val < 0.75)&&(__CLR4_4_128c128c1lb90peac.R.iget(104263)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104264)==0&false))) {{
                __CLR4_4_128c128c1lb90peac.R.inc(104265);value = 2;
            } }else {{
                __CLR4_4_128c128c1lb90peac.R.inc(104266);value = 3;
            }
            }}}__CLR4_4_128c128c1lb90peac.R.inc(104267);freq.addValue(value);
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104268);long[] observed = new long[4];
        __CLR4_4_128c128c1lb90peac.R.inc(104269);for (int i=0; (((i<4)&&(__CLR4_4_128c128c1lb90peac.R.iget(104270)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104271)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104272);observed[i] = freq.getCount(i);
        }

        /* Use ChiSquare dist with df = 4-1 = 3, alpha = .001
         * Change to 11.34 for alpha = .01
         */
        }__CLR4_4_128c128c1lb90peac.R.inc(104273);Assert.assertTrue("chi-square test -- will fail about 1 in 1000 times",
                testStatistic.chiSquare(expected,observed) < 16.27);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testDoubleDirect() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z8izxp28gi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testDoubleDirect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z8izxp28gi(){try{__CLR4_4_128c128c1lb90peac.R.inc(104274);
        __CLR4_4_128c128c1lb90peac.R.inc(104275);SummaryStatistics sample = new SummaryStatistics();
        __CLR4_4_128c128c1lb90peac.R.inc(104276);final int N = 10000;
        __CLR4_4_128c128c1lb90peac.R.inc(104277);for (int i = 0; (((i < N)&&(__CLR4_4_128c128c1lb90peac.R.iget(104278)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104279)==0&false)); ++i) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104280);sample.addValue(generator.nextDouble());
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104281);Assert.assertEquals("Note: This test will fail randomly about 1 in 100 times.",
                0.5, sample.getMean(), FastMath.sqrt(N/12.0) * 2.576);
        __CLR4_4_128c128c1lb90peac.R.inc(104282);Assert.assertEquals(1.0 / (2.0 * FastMath.sqrt(3.0)),
                     sample.getStandardDeviation(), 0.01);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testFloatDirect() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w2rnmi28gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testFloatDirect",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w2rnmi28gr(){try{__CLR4_4_128c128c1lb90peac.R.inc(104283);
        __CLR4_4_128c128c1lb90peac.R.inc(104284);SummaryStatistics sample = new SummaryStatistics();
        __CLR4_4_128c128c1lb90peac.R.inc(104285);final int N = 1000;
        __CLR4_4_128c128c1lb90peac.R.inc(104286);for (int i = 0; (((i < N)&&(__CLR4_4_128c128c1lb90peac.R.iget(104287)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104288)==0&false)); ++i) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104289);sample.addValue(generator.nextFloat());
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104290);Assert.assertEquals("Note: This test will fail randomly about 1 in 100 times.",
                0.5, sample.getMean(), FastMath.sqrt(N/12.0) * 2.576);
        __CLR4_4_128c128c1lb90peac.R.inc(104291);Assert.assertEquals(1.0 / (2.0 * FastMath.sqrt(3.0)),
                     sample.getStandardDeviation(), 0.01);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test(expected=MathIllegalArgumentException.class)
    public void testNextIntNeg() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yfkaqb28h0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,78,101,120,116,73,110,116,78,101,103,58,32,91,77,97,116,104,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextIntNeg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yfkaqb28h0(){try{__CLR4_4_128c128c1lb90peac.R.inc(104292);
        __CLR4_4_128c128c1lb90peac.R.inc(104293);generator.nextInt(-1);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNextInt2() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171mkrz28h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171mkrz28h2(){try{__CLR4_4_128c128c1lb90peac.R.inc(104294);
        __CLR4_4_128c128c1lb90peac.R.inc(104295);int walk = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104296);final int N = 10000;
        __CLR4_4_128c128c1lb90peac.R.inc(104297);for (int k = 0; (((k < N)&&(__CLR4_4_128c128c1lb90peac.R.iget(104298)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104299)==0&false)); ++k) {{
           __CLR4_4_128c128c1lb90peac.R.inc(104300);if ((((generator.nextInt() >= 0)&&(__CLR4_4_128c128c1lb90peac.R.iget(104301)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104302)==0&false))) {{
               __CLR4_4_128c128c1lb90peac.R.inc(104303);++walk;
           } }else {{
               __CLR4_4_128c128c1lb90peac.R.inc(104304);--walk;
           }
        }}
        }__CLR4_4_128c128c1lb90peac.R.inc(104305);Assert.assertTrue("Walked too far astray: " + walk + "\nNote: This " +
                "test will fail randomly about 1 in 100 times.",
                FastMath.abs(walk) < FastMath.sqrt(N) * 2.576);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNextLong2() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w7912w28he();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNextLong2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w7912w28he(){try{__CLR4_4_128c128c1lb90peac.R.inc(104306);
        __CLR4_4_128c128c1lb90peac.R.inc(104307);int walk = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104308);final int N = 1000;
        __CLR4_4_128c128c1lb90peac.R.inc(104309);for (int k = 0; (((k < N)&&(__CLR4_4_128c128c1lb90peac.R.iget(104310)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104311)==0&false)); ++k) {{
           __CLR4_4_128c128c1lb90peac.R.inc(104312);if ((((generator.nextLong() >= 0)&&(__CLR4_4_128c128c1lb90peac.R.iget(104313)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104314)==0&false))) {{
               __CLR4_4_128c128c1lb90peac.R.inc(104315);++walk;
           } }else {{
               __CLR4_4_128c128c1lb90peac.R.inc(104316);--walk;
           }
        }}
        }__CLR4_4_128c128c1lb90peac.R.inc(104317);Assert.assertTrue("Walked too far astray: " + walk + "\nNote: This " +
                "test will fail randomly about 1 in 100 times.",
                FastMath.abs(walk) < FastMath.sqrt(N) * 2.576);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNexBoolean2() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cdb94w28hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNexBoolean2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cdb94w28hq(){try{__CLR4_4_128c128c1lb90peac.R.inc(104318);
        __CLR4_4_128c128c1lb90peac.R.inc(104319);int walk = 0;
        __CLR4_4_128c128c1lb90peac.R.inc(104320);final int N = 10000;
        __CLR4_4_128c128c1lb90peac.R.inc(104321);for (int k = 0; (((k < N)&&(__CLR4_4_128c128c1lb90peac.R.iget(104322)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104323)==0&false)); ++k) {{
           __CLR4_4_128c128c1lb90peac.R.inc(104324);if ((((generator.nextBoolean())&&(__CLR4_4_128c128c1lb90peac.R.iget(104325)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104326)==0&false))) {{
               __CLR4_4_128c128c1lb90peac.R.inc(104327);++walk;
           } }else {{
               __CLR4_4_128c128c1lb90peac.R.inc(104328);--walk;
           }
        }}
        }__CLR4_4_128c128c1lb90peac.R.inc(104329);Assert.assertTrue("Walked too far astray: " + walk + "\nNote: This " +
                "test will fail randomly about 1 in 100 times.",
                FastMath.abs(walk) < FastMath.sqrt(N) * 2.576);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testNexBytes() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ra66b28i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testNexBytes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ra66b28i2(){try{__CLR4_4_128c128c1lb90peac.R.inc(104330);
        __CLR4_4_128c128c1lb90peac.R.inc(104331);long[] count = new long[256];
        __CLR4_4_128c128c1lb90peac.R.inc(104332);byte[] bytes = new byte[10];
        __CLR4_4_128c128c1lb90peac.R.inc(104333);double[] expected = new double[256];
        __CLR4_4_128c128c1lb90peac.R.inc(104334);final int sampleSize = 100000;

        __CLR4_4_128c128c1lb90peac.R.inc(104335);for (int i = 0; (((i < 256)&&(__CLR4_4_128c128c1lb90peac.R.iget(104336)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104337)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104338);expected[i] = (double) sampleSize / 265f;
        }

        }__CLR4_4_128c128c1lb90peac.R.inc(104339);for (int k = 0; (((k < sampleSize)&&(__CLR4_4_128c128c1lb90peac.R.iget(104340)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104341)==0&false)); ++k) {{
           __CLR4_4_128c128c1lb90peac.R.inc(104342);generator.nextBytes(bytes);
           __CLR4_4_128c128c1lb90peac.R.inc(104343);for (byte b : bytes) {{
               __CLR4_4_128c128c1lb90peac.R.inc(104344);++count[b + 128];
           }
        }}

        }__CLR4_4_128c128c1lb90peac.R.inc(104345);TestUtils.assertChiSquareAccept(expected, count, 0.001);

    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    @Test
    public void testSeeding() {__CLR4_4_128c128c1lb90peac.R.globalSliceStart(getClass().getName(),104346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jis3e28ii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128c128c1lb90peac.R.rethrow($CLV_t2$);}finally{__CLR4_4_128c128c1lb90peac.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomGeneratorAbstractTest.testSeeding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jis3e28ii(){try{__CLR4_4_128c128c1lb90peac.R.inc(104346);
        // makeGenerator initializes with fixed seed
        __CLR4_4_128c128c1lb90peac.R.inc(104347);RandomGenerator gen = makeGenerator();
        __CLR4_4_128c128c1lb90peac.R.inc(104348);RandomGenerator gen1 = makeGenerator();
        __CLR4_4_128c128c1lb90peac.R.inc(104349);checkSameSequence(gen, gen1);
        // reseed, but recreate the second one
        // verifies MATH-723
        __CLR4_4_128c128c1lb90peac.R.inc(104350);gen.setSeed(100);
        __CLR4_4_128c128c1lb90peac.R.inc(104351);gen1 = makeGenerator();
        __CLR4_4_128c128c1lb90peac.R.inc(104352);gen1.setSeed(100);
        __CLR4_4_128c128c1lb90peac.R.inc(104353);checkSameSequence(gen, gen1);
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

    private void checkSameSequence(RandomGenerator gen1, RandomGenerator gen2) {try{__CLR4_4_128c128c1lb90peac.R.inc(104354);
        __CLR4_4_128c128c1lb90peac.R.inc(104355);final int len = 11;  // Needs to be an odd number to check MATH-723
        __CLR4_4_128c128c1lb90peac.R.inc(104356);final double[][] values = new double[2][len];
        __CLR4_4_128c128c1lb90peac.R.inc(104357);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104358)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104359)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104360);values[0][i] = gen1.nextDouble();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104361);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104362)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104363)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104364);values[1][i] = gen2.nextDouble();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104365);Assert.assertTrue(Arrays.equals(values[0], values[1]));
        __CLR4_4_128c128c1lb90peac.R.inc(104366);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104367)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104368)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104369);values[0][i] = gen1.nextFloat();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104370);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104371)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104372)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104373);values[1][i] = gen2.nextFloat();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104374);Assert.assertTrue(Arrays.equals(values[0], values[1]));
        __CLR4_4_128c128c1lb90peac.R.inc(104375);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104376)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104377)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104378);values[0][i] = gen1.nextInt();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104379);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104380)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104381)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104382);values[1][i] = gen2.nextInt();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104383);Assert.assertTrue(Arrays.equals(values[0], values[1]));
        __CLR4_4_128c128c1lb90peac.R.inc(104384);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104385)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104386)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104387);values[0][i] = gen1.nextLong();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104388);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104389)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104390)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104391);values[1][i] = gen2.nextLong();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104392);Assert.assertTrue(Arrays.equals(values[0], values[1]));
        __CLR4_4_128c128c1lb90peac.R.inc(104393);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104394)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104395)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104396);values[0][i] = gen1.nextInt(len);
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104397);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104398)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104399)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104400);values[1][i] = gen2.nextInt(len);
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104401);Assert.assertTrue(Arrays.equals(values[0], values[1]));
        __CLR4_4_128c128c1lb90peac.R.inc(104402);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104403)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104404)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104405);values[0][i] = (((gen1.nextBoolean() )&&(__CLR4_4_128c128c1lb90peac.R.iget(104406)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104407)==0&false))? 1 : 0;
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104408);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104409)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104410)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104411);values[1][i] = (((gen2.nextBoolean() )&&(__CLR4_4_128c128c1lb90peac.R.iget(104412)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104413)==0&false))? 1 : 0;
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104414);Assert.assertTrue(Arrays.equals(values[0], values[1]));
        __CLR4_4_128c128c1lb90peac.R.inc(104415);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104416)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104417)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104418);values[0][i] = gen1.nextGaussian();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104419);for (int i = 0; (((i < len)&&(__CLR4_4_128c128c1lb90peac.R.iget(104420)!=0|true))||(__CLR4_4_128c128c1lb90peac.R.iget(104421)==0&false)); i++) {{
            __CLR4_4_128c128c1lb90peac.R.inc(104422);values[1][i] = gen2.nextGaussian();
        }
        }__CLR4_4_128c128c1lb90peac.R.inc(104423);Assert.assertTrue(Arrays.equals(values[0], values[1]));
    }finally{__CLR4_4_128c128c1lb90peac.R.flushNeeded();}}

}
