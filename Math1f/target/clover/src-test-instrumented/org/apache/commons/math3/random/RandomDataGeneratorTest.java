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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.math3.Retry;
import org.apache.commons.math3.RetryRunner;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.distribution.BetaDistribution;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.BinomialDistributionTest;
import org.apache.commons.math3.distribution.CauchyDistribution;
import org.apache.commons.math3.distribution.ChiSquaredDistribution;
import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.distribution.GammaDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistributionTest;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PascalDistributionTest;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.distribution.WeibullDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.apache.commons.math3.distribution.ZipfDistributionTest;
import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.inference.ChiSquareTest;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test cases for the RandomDataGenerator class.
 *
 * @version $Id$
 */
@RunWith(RetryRunner.class)
public class RandomDataGeneratorTest {static class __CLR4_4_127n627n6lb90pe9y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public RandomDataGeneratorTest() {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103218);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103219);randomData = new RandomDataGenerator();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103220);randomData.reSeed(1000);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    protected final long smallSampleSize = 1000;
    protected final double[] expected = { 250, 250, 250, 250 };
    protected final int largeSampleSize = 10000;
    private final String[] hex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f" };
    protected RandomDataGenerator randomData = null;
    protected final ChiSquareTest testStatistic = new ChiSquareTest();

    @Test
    public void testNextIntExtremeValues() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aklid127n9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextIntExtremeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aklid127n9(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103221);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103222);int x = randomData.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103223);int y = randomData.nextInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103224);Assert.assertFalse(x == y);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextLongExtremeValues() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2h0vg27nd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextLongExtremeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2h0vg27nd(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103225);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103226);long x = randomData.nextLong(Long.MIN_VALUE, Long.MAX_VALUE);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103227);long y = randomData.nextLong(Long.MIN_VALUE, Long.MAX_VALUE);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103228);Assert.assertFalse(x == y);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextUniformExtremeValues() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f0ikze27nh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformExtremeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f0ikze27nh(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103229);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103230);double x = randomData.nextUniform(-Double.MAX_VALUE, Double.MAX_VALUE);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103231);double y = randomData.nextUniform(-Double.MAX_VALUE, Double.MAX_VALUE);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103232);Assert.assertFalse(x == y);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103233);Assert.assertFalse(Double.isNaN(x));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103234);Assert.assertFalse(Double.isNaN(y));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103235);Assert.assertFalse(Double.isInfinite(x));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103236);Assert.assertFalse(Double.isInfinite(y));
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextIntIAE() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13eqoqy27np();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextIntIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13eqoqy27np(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103237);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103238);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103239);randomData.nextInt(4, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103240);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextIntNegativeToPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pqpqhb27nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextIntNegativeToPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pqpqhb27nt(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103241);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103242);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103243)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103244)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103245);checkNextIntUniform(-3, 5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103246);checkNextIntUniform(-3, 6);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test 
    public void testNextIntNegativeRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19m1e8r27nz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextIntNegativeRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19m1e8r27nz(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103247);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103248);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103249)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103250)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103251);checkNextIntUniform(-7, -4);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103252);checkNextIntUniform(-15, -2);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103253);checkNextIntUniform(Integer.MIN_VALUE + 1, Integer.MIN_VALUE + 12);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test 
    public void testNextIntPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12m5t5t27o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextIntPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12m5t5t27o6(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103254);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103255);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103256)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103257)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103258);checkNextIntUniform(0, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103259);checkNextIntUniform(2, 12);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103260);checkNextIntUniform(1,2);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103261);checkNextIntUniform(Integer.MAX_VALUE - 12, Integer.MAX_VALUE - 1);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    private void checkNextIntUniform(int min, int max) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103262);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103263);final Frequency freq = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103264);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103265)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103266)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103267);final int value = randomData.nextInt(min, max);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103268);Assert.assertTrue("nextInt range", (value >= min) && (value <= max));
            __CLR4_4_127n627n6lb90pe9y.R.inc(103269);freq.addValue(value);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103270);final int len = max - min + 1;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103271);final long[] observed = new long[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103272);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103273)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103274)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103275);observed[i] = freq.getCount(min + i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103276);final double[] expected = new double[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103277);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103278)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103279)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103280);expected[i] = 1d / len;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103281);TestUtils.assertChiSquareAccept(expected, observed, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextIntWideRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pp26x327oy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextIntWideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pp26x327oy(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103282);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103283);int lower = -0x6543210F;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103284);int upper =  0x456789AB;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103285);int max   = Integer.MIN_VALUE;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103286);int min   = Integer.MAX_VALUE;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103287);for (int i = 0; (((i < 1000000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103288)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103289)==0&false)); ++i) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103290);int r = randomData.nextInt(lower, upper);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103291);max = FastMath.max(max, r);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103292);min = FastMath.min(min, r);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103293);Assert.assertTrue(r >= lower);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103294);Assert.assertTrue(r <= upper);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103295);double ratio = (((double) max)   - ((double) min)) /
                       (((double) upper) - ((double) lower));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103296);Assert.assertTrue(ratio > 0.99999);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextLongIAE() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s0t8k327pd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextLongIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s0t8k327pd(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103297);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103298);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103299);randomData.nextLong(4, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103300);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextLongNegativeToPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12kpm2i27ph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextLongNegativeToPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12kpm2i27ph(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103301);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103302);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103303)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103304)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103305);checkNextLongUniform(-3, 5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103306);checkNextLongUniform(-3, 6);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test 
    public void testNextLongNegativeRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3wwr627pn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextLongNegativeRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3wwr627pn(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103307);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103308);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103309)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103310)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103311);checkNextLongUniform(-7, -4);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103312);checkNextLongUniform(-15, -2);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103313);checkNextLongUniform(Long.MIN_VALUE + 1, Long.MIN_VALUE + 12);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test 
    public void testNextLongPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_124aane27pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextLongPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_124aane27pu(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103314);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103315);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103316)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103317)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103318);checkNextLongUniform(0, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103319);checkNextLongUniform(2, 12);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103320);checkNextLongUniform(Long.MAX_VALUE - 12, Long.MAX_VALUE - 1);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    private void checkNextLongUniform(long min, long max) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103321);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103322);final Frequency freq = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103323);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103324)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103325)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103326);final long value = randomData.nextLong(min, max);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103327);Assert.assertTrue("nextLong range: " + value + " " + min + " " + max,
                              (value >= min) && (value <= max));
            __CLR4_4_127n627n6lb90pe9y.R.inc(103328);freq.addValue(value);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103329);final int len = ((int) (max - min)) + 1;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103330);final long[] observed = new long[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103331);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103332)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103333)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103334);observed[i] = freq.getCount(min + i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103335);final double[] expected = new double[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103336);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103337)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103338)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103339);expected[i] = 1d / len;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103340);TestUtils.assertChiSquareAccept(expected, observed, 0.01);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextLongWideRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xdeir427ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextLongWideRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xdeir427ql(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103341);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103342);long lower = -0x6543210FEDCBA987L;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103343);long upper =  0x456789ABCDEF0123L;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103344);long max = Long.MIN_VALUE;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103345);long min = Long.MAX_VALUE;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103346);for (int i = 0; (((i < 10000000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103347)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103348)==0&false)); ++i) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103349);long r = randomData.nextLong(lower, upper);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103350);max = FastMath.max(max, r);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103351);min = FastMath.min(min, r);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103352);Assert.assertTrue(r >= lower);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103353);Assert.assertTrue(r <= upper);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103354);double ratio = (((double) max)   - ((double) min)) /
                       (((double) upper) - ((double) lower));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103355);Assert.assertTrue(ratio > 0.99999);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextSecureLongIAE() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfssas27r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureLongIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfssas27r0(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103356);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103357);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103358);randomData.nextSecureLong(4, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103359);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testNextSecureLongNegativeToPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tlcxwj27r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureLongNegativeToPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tlcxwj27r4(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103360);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103361);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103362)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103363)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103364);checkNextSecureLongUniform(-3, 5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103365);checkNextSecureLongUniform(-3, 6);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testNextSecureLongNegativeRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i45ka127ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureLongNegativeRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i45ka127ra(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103366);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103367);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103368)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103369)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103370);checkNextSecureLongUniform(-7, -4);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103371);checkNextSecureLongUniform(-15, -2);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testNextSecureLongPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vycvh27rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureLongPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vycvh27rg(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103372);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103373);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103374)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103375)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103376);checkNextSecureLongUniform(0, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103377);checkNextSecureLongUniform(2, 12);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    private void checkNextSecureLongUniform(int min, int max) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103378);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103379);final Frequency freq = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103380);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103381)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103382)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103383);final long value = randomData.nextSecureLong(min, max);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103384);Assert.assertTrue("nextLong range", (value >= min) && (value <= max));
            __CLR4_4_127n627n6lb90pe9y.R.inc(103385);freq.addValue(value);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103386);final int len = max - min + 1;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103387);final long[] observed = new long[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103388);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103389)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103390)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103391);observed[i] = freq.getCount(min + i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103392);final double[] expected = new double[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103393);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103394)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103395)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103396);expected[i] = 1d / len;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103397);TestUtils.assertChiSquareAccept(expected, observed, 0.0001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextSecureIntIAE() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16byd8h27s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureIntIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16byd8h27s6(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103398);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103399);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103400);randomData.nextSecureInt(4, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103401);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testNextSecureIntNegativeToPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tgbb4o27sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureIntNegativeToPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tgbb4o27sa(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103402);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103403);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103404)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103405)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103406);checkNextSecureIntUniform(-3, 5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103407);checkNextSecureIntUniform(-3, 6);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    @Retry(3)
    public void testNextSecureIntNegativeRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ar1tp827sg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureIntNegativeRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ar1tp827sg(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103408);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103409);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103410)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103411)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103412);checkNextSecureIntUniform(-7, -4);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103413);checkNextSecureIntUniform(-15, -2);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test 
    @Retry(3)
    public void testNextSecureIntPositiveRange() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz913s27sm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureIntPositiveRange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz913s27sm(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103414);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103415);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103416)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103417)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103418);checkNextSecureIntUniform(0, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103419);checkNextSecureIntUniform(2, 12);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
     
    private void checkNextSecureIntUniform(int min, int max) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103420);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103421);final Frequency freq = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103422);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103423)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103424)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103425);final int value = randomData.nextSecureInt(min, max);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103426);Assert.assertTrue("nextInt range", (value >= min) && (value <= max));
            __CLR4_4_127n627n6lb90pe9y.R.inc(103427);freq.addValue(value);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103428);final int len = max - min + 1;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103429);final long[] observed = new long[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103430);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103431)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103432)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103433);observed[i] = freq.getCount(min + i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103434);final double[] expected = new double[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103435);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103436)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103437)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103438);expected[i] = 1d / len;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103439);TestUtils.assertChiSquareAccept(expected, observed, 0.0001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    

    /**
     * Make sure that empirical distribution of random Poisson(4)'s has P(X <=
     * 5) close to actual cumulative Poisson probability and that nextPoisson
     * fails when mean is non-positive.
     */
    @Test
    public void testNextPoisson() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sua6t27tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextPoisson",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sua6t27tc(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103440);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103441);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103442);randomData.nextPoisson(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103443);Assert.fail("zero mean -- expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103444);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103445);randomData.nextPoisson(-1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103446);Assert.fail("negative mean supplied -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103447);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103448);randomData.nextPoisson(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103449);Assert.fail("0 mean supplied -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        
        __CLR4_4_127n627n6lb90pe9y.R.inc(103450);final double mean = 4.0d;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103451);final int len = 5;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103452);PoissonDistribution poissonDistribution = new PoissonDistribution(mean);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103453);Frequency f = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103454);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103455);for (int i = 0; (((i < largeSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103456)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103457)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103458);f.addValue(randomData.nextPoisson(mean));
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103459);final long[] observed = new long[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103460);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103461)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103462)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103463);observed[i] = f.getCount(i + 1);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103464);final double[] expected = new double[len];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103465);for (int i = 0; (((i < len)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103466)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103467)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103468);expected[i] = poissonDistribution.probability(i + 1) * largeSampleSize;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103469);TestUtils.assertChiSquareAccept(expected, observed, 0.0001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextPoissonConsistency() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jl104l27u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextPoissonConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jl104l27u6(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103470);

        // Small integral means
        __CLR4_4_127n627n6lb90pe9y.R.inc(103471);for (int i = 1; (((i < 100)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103472)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103473)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103474);checkNextPoissonConsistency(i);
        }
        // non-integer means
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103475);for (int i = 1; (((i < 10)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103476)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103477)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103478);checkNextPoissonConsistency(randomData.nextUniform(1, 1000));
        }
        // large means
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103479);for (int i = 1; (((i < 10)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103480)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103481)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103482);checkNextPoissonConsistency(randomData.nextUniform(1000, 10000));
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /**
     * Verifies that nextPoisson(mean) generates an empirical distribution of values
     * consistent with PoissonDistributionImpl by generating 1000 values, computing a
     * grouped frequency distribution of the observed values and comparing this distribution
     * to the corresponding expected distribution computed using PoissonDistributionImpl.
     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the
     * distributions are the same. If the null hypothesis can be rejected with confidence
     * 1 - alpha, the check fails.
     */
    public void checkNextPoissonConsistency(double mean) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103483);
        // Generate sample values
        __CLR4_4_127n627n6lb90pe9y.R.inc(103484);final int sampleSize = 1000;        // Number of deviates to generate
        __CLR4_4_127n627n6lb90pe9y.R.inc(103485);final int minExpectedCount = 7;     // Minimum size of expected bin count
        __CLR4_4_127n627n6lb90pe9y.R.inc(103486);long maxObservedValue = 0;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103487);final double alpha = 0.001;         // Probability of false failure
        __CLR4_4_127n627n6lb90pe9y.R.inc(103488);Frequency frequency = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103489);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103490)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103491)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103492);long value = randomData.nextPoisson(mean);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103493);if ((((value > maxObservedValue)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103494)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103495)==0&false))) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103496);maxObservedValue = value;
            }
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103497);frequency.addValue(value);
        }

        /*
         *  Set up bins for chi-square test.
         *  Ensure expected counts are all at least minExpectedCount.
         *  Start with upper and lower tail bins.
         *  Lower bin = [0, lower); Upper bin = [upper, +inf).
         */
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103498);PoissonDistribution poissonDistribution = new PoissonDistribution(mean);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103499);int lower = 1;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103500);while ((((poissonDistribution.cumulativeProbability(lower - 1) * sampleSize < minExpectedCount)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103501)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103502)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103503);lower++;
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103504);int upper = (int) (5 * mean);  // Even for mean = 1, not much mass beyond 5
        __CLR4_4_127n627n6lb90pe9y.R.inc(103505);while (((((1 - poissonDistribution.cumulativeProbability(upper - 1)) * sampleSize < minExpectedCount)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103506)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103507)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103508);upper--;
        }

        // Set bin width for interior bins.  For poisson, only need to look at end bins.
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103509);int binWidth = 0;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103510);boolean widthSufficient = false;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103511);double lowerBinMass = 0;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103512);double upperBinMass = 0;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103513);while ((((!widthSufficient)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103514)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103515)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103516);binWidth++;
            __CLR4_4_127n627n6lb90pe9y.R.inc(103517);lowerBinMass = poissonDistribution.cumulativeProbability(lower - 1, lower + binWidth - 1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103518);upperBinMass = poissonDistribution.cumulativeProbability(upper - binWidth - 1, upper - 1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103519);widthSufficient = FastMath.min(lowerBinMass, upperBinMass) * sampleSize >= minExpectedCount;
        }

        /*
         *  Determine interior bin bounds.  Bins are
         *  [1, lower = binBounds[0]), [lower, binBounds[1]), [binBounds[1], binBounds[2]), ... ,
         *    [binBounds[binCount - 2], upper = binBounds[binCount - 1]), [upper, +inf)
         *
         */
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103520);List<Integer> binBounds = new ArrayList<Integer>();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103521);binBounds.add(lower);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103522);int bound = lower + binWidth;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103523);while ((((bound < upper - binWidth)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103524)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103525)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103526);binBounds.add(bound);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103527);bound += binWidth;
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103528);binBounds.add(upper); // The size of bin [binBounds[binCount - 2], upper) satisfies binWidth <= size < 2*binWidth.

        // Compute observed and expected bin counts
        __CLR4_4_127n627n6lb90pe9y.R.inc(103529);final int binCount = binBounds.size() + 1;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103530);long[] observed = new long[binCount];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103531);double[] expected = new double[binCount];

        // Bottom bin
        __CLR4_4_127n627n6lb90pe9y.R.inc(103532);observed[0] = 0;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103533);for (int i = 0; (((i < lower)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103534)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103535)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103536);observed[0] += frequency.getCount(i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103537);expected[0] = poissonDistribution.cumulativeProbability(lower - 1) * sampleSize;

        // Top bin
        __CLR4_4_127n627n6lb90pe9y.R.inc(103538);observed[binCount - 1] = 0;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103539);for (int i = upper; (((i <= maxObservedValue)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103540)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103541)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103542);observed[binCount - 1] += frequency.getCount(i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103543);expected[binCount - 1] = (1 - poissonDistribution.cumulativeProbability(upper - 1)) * sampleSize;

        // Interior bins
        __CLR4_4_127n627n6lb90pe9y.R.inc(103544);for (int i = 1; (((i < binCount - 1)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103545)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103546)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103547);observed[i] = 0;
            __CLR4_4_127n627n6lb90pe9y.R.inc(103548);for (int j = binBounds.get(i - 1); (((j < binBounds.get(i))&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103549)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103550)==0&false)); j++) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103551);observed[i] += frequency.getCount(j);
            } // Expected count is (mass in [binBounds[i-1], binBounds[i])) * sampleSize
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103552);expected[i] = (poissonDistribution.cumulativeProbability(binBounds.get(i) - 1) -
                poissonDistribution.cumulativeProbability(binBounds.get(i - 1) -1)) * sampleSize;
        }

        // Use chisquare test to verify that generated values are poisson(mean)-distributed
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103553);ChiSquareTest chiSquareTest = new ChiSquareTest();
            // Fail if we can reject null hypothesis that distributions are the same
        __CLR4_4_127n627n6lb90pe9y.R.inc(103554);if ((((chiSquareTest.chiSquareTest(expected, observed, alpha))&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103555)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103556)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103557);StringBuilder msgBuffer = new StringBuilder();
            __CLR4_4_127n627n6lb90pe9y.R.inc(103558);DecimalFormat df = new DecimalFormat("#.##");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103559);msgBuffer.append("Chisquare test failed for mean = ");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103560);msgBuffer.append(mean);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103561);msgBuffer.append(" p-value = ");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103562);msgBuffer.append(chiSquareTest.chiSquareTest(expected, observed));
            __CLR4_4_127n627n6lb90pe9y.R.inc(103563);msgBuffer.append(" chisquare statistic = ");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103564);msgBuffer.append(chiSquareTest.chiSquare(expected, observed));
            __CLR4_4_127n627n6lb90pe9y.R.inc(103565);msgBuffer.append(". \n");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103566);msgBuffer.append("bin\t\texpected\tobserved\n");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103567);for (int i = 0; (((i < expected.length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103568)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103569)==0&false)); i++) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103570);msgBuffer.append("[");
                __CLR4_4_127n627n6lb90pe9y.R.inc(103571);msgBuffer.append((((i == 0 )&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103572)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103573)==0&false))? 1: binBounds.get(i - 1));
                __CLR4_4_127n627n6lb90pe9y.R.inc(103574);msgBuffer.append(",");
                __CLR4_4_127n627n6lb90pe9y.R.inc(103575);msgBuffer.append((((i == binBounds.size() )&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103576)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103577)==0&false))? "inf": binBounds.get(i));
                __CLR4_4_127n627n6lb90pe9y.R.inc(103578);msgBuffer.append(")");
                __CLR4_4_127n627n6lb90pe9y.R.inc(103579);msgBuffer.append("\t\t");
                __CLR4_4_127n627n6lb90pe9y.R.inc(103580);msgBuffer.append(df.format(expected[i]));
                __CLR4_4_127n627n6lb90pe9y.R.inc(103581);msgBuffer.append("\t\t");
                __CLR4_4_127n627n6lb90pe9y.R.inc(103582);msgBuffer.append(observed[i]);
                __CLR4_4_127n627n6lb90pe9y.R.inc(103583);msgBuffer.append("\n");
            }
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103584);msgBuffer.append("This test can fail randomly due to sampling error with probability ");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103585);msgBuffer.append(alpha);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103586);msgBuffer.append(".");
            __CLR4_4_127n627n6lb90pe9y.R.inc(103587);Assert.fail(msgBuffer.toString());
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** test dispersion and failure modes for nextHex() */
    @Test
    public void testNextHex() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m25e0z27xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextHex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m25e0z27xg(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103588);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103589);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103590);randomData.nextHexString(-1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103591);Assert.fail("negative length supplied -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103592);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103593);randomData.nextHexString(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103594);Assert.fail("zero length supplied -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103595);String hexString = randomData.nextHexString(3);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103596);if ((((hexString.length() != 3)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103597)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103598)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103599);Assert.fail("incorrect length for generated string");
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103600);hexString = randomData.nextHexString(1);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103601);if ((((hexString.length() != 1)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103602)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103603)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103604);Assert.fail("incorrect length for generated string");
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103605);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103606);hexString = randomData.nextHexString(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103607);Assert.fail("zero length requested -- expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103608);Frequency f = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103609);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103610)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103611)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103612);hexString = randomData.nextHexString(100);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103613);if ((((hexString.length() != 100)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103614)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103615)==0&false))) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103616);Assert.fail("incorrect length for generated string");
            }
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103617);for (int j = 0; (((j < hexString.length())&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103618)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103619)==0&false)); j++) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103620);f.addValue(hexString.substring(j, j + 1));
            }
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103621);double[] expected = new double[16];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103622);long[] observed = new long[16];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103623);for (int i = 0; (((i < 16)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103624)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103625)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103626);expected[i] = (double) smallSampleSize * 100 / 16;
            __CLR4_4_127n627n6lb90pe9y.R.inc(103627);observed[i] = f.getCount(hex[i]);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103628);TestUtils.assertChiSquareAccept(expected, observed, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** test dispersion and failure modes for nextHex() */
    @Test
    @Retry(3)
    public void testNextSecureHex() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lrf06227yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSecureHex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lrf06227yl(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103629);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103630);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103631);randomData.nextSecureHexString(-1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103632);Assert.fail("negative length -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103633);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103634);randomData.nextSecureHexString(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103635);Assert.fail("zero length -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103636);String hexString = randomData.nextSecureHexString(3);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103637);if ((((hexString.length() != 3)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103638)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103639)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103640);Assert.fail("incorrect length for generated string");
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103641);hexString = randomData.nextSecureHexString(1);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103642);if ((((hexString.length() != 1)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103643)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103644)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103645);Assert.fail("incorrect length for generated string");
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103646);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103647);hexString = randomData.nextSecureHexString(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103648);Assert.fail("zero length requested -- expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103649);Frequency f = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103650);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103651)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103652)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103653);hexString = randomData.nextSecureHexString(100);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103654);if ((((hexString.length() != 100)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103655)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103656)==0&false))) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103657);Assert.fail("incorrect length for generated string");
            }
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103658);for (int j = 0; (((j < hexString.length())&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103659)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103660)==0&false)); j++) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103661);f.addValue(hexString.substring(j, j + 1));
            }
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103662);double[] expected = new double[16];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103663);long[] observed = new long[16];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103664);for (int i = 0; (((i < 16)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103665)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103666)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103667);expected[i] = (double) smallSampleSize * 100 / 16;
            __CLR4_4_127n627n6lb90pe9y.R.inc(103668);observed[i] = f.getCount(hex[i]);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103669);TestUtils.assertChiSquareAccept(expected, observed, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextUniformIAE() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkg64b27zq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformIAE",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkg64b27zq(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103670);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103671);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103672);randomData.nextUniform(4, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103673);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103674);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103675);randomData.nextUniform(0, Double.POSITIVE_INFINITY);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103676);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103677);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103678);randomData.nextUniform(Double.NEGATIVE_INFINITY, 0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103679);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103680);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103681);randomData.nextUniform(0, Double.NaN);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103682);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103683);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103684);randomData.nextUniform(Double.NaN, 0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103685);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextUniformUniformPositiveBounds() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3pdx62806();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformUniformPositiveBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3pdx62806(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103686);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103687);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103688)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103689)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103690);checkNextUniformUniform(0, 10);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextUniformUniformNegativeToPositiveBounds() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_164wzpy280b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformUniformNegativeToPositiveBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_164wzpy280b(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103691);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103692);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103693)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103694)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103695);checkNextUniformUniform(-3, 5);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextUniformUniformNegaiveBounds() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t0ydxe280g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformUniformNegaiveBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t0ydxe280g(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103696);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103697);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103698)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103699)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103700);checkNextUniformUniform(-7, -3);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    @Test
    public void testNextUniformUniformMaximalInterval() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tbx2ze280l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformUniformMaximalInterval",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tbx2ze280l(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103701);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103702);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103703)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103704)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103705);checkNextUniformUniform(-Double.MAX_VALUE, Double.MAX_VALUE);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}
    
    private void checkNextUniformUniform(double min, double max) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103706);
        // Set up bin bounds - min, binBound[0], ..., binBound[binCount-2], max
        __CLR4_4_127n627n6lb90pe9y.R.inc(103707);final int binCount = 5;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103708);final double binSize = max / binCount - min/binCount; // Prevent overflow in extreme value case
        __CLR4_4_127n627n6lb90pe9y.R.inc(103709);final double[] binBounds = new double[binCount - 1];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103710);binBounds[0] = min + binSize;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103711);for (int i = 1; (((i < binCount - 1)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103712)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103713)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103714);binBounds[i] = binBounds[i - 1] + binSize;  // + instead of * to avoid overflow in extreme case
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103715);final Frequency freq = new Frequency();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103716);for (int i = 0; (((i < smallSampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103717)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103718)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103719);final double value = randomData.nextUniform(min, max);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103720);Assert.assertTrue("nextUniform range", (value > min) && (value < max));
            // Find bin
            __CLR4_4_127n627n6lb90pe9y.R.inc(103721);int j = 0;
            __CLR4_4_127n627n6lb90pe9y.R.inc(103722);while ((((j < binCount - 1 && value > binBounds[j])&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103723)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103724)==0&false))) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103725);j++;
            }
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103726);freq.addValue(j);
        }
       
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103727);final long[] observed = new long[binCount];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103728);for (int i = 0; (((i < binCount)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103729)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103730)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103731);observed[i] = freq.getCount(i);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103732);final double[] expected = new double[binCount];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103733);for (int i = 0; (((i < binCount)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103734)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103735)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103736);expected[i] = 1d / binCount;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103737);TestUtils.assertChiSquareAccept(expected, observed, 0.01);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** test exclusive endpoints of nextUniform **/
    @Test
    public void testNextUniformExclusiveEndpoints() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p5566u281m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextUniformExclusiveEndpoints",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p5566u281m(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103738);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103739);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103740)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103741)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103742);double u = randomData.nextUniform(0.99, 1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103743);Assert.assertTrue(u > 0.99 && u < 1);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** test failure modes and distribution of nextGaussian() */
    @Test
    public void testNextGaussian() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ccmsjd281s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextGaussian",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ccmsjd281s(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103744);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103745);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103746);randomData.nextGaussian(0, 0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103747);Assert.fail("zero sigma -- MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103748);double[] quartiles = TestUtils.getDistributionQuartiles(new NormalDistribution(0,1));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103749);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103750);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103751);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103752)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103753)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103754);double value = randomData.nextGaussian(0, 1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103755);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103756);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** test failure modes and distribution of nextExponential() */
    @Test
    public void testNextExponential() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t0sbd2825();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextExponential",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t0sbd2825(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103757);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103758);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103759);randomData.nextExponential(-1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103760);Assert.fail("negative mean -- expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103761);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103762);randomData.nextExponential(0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103763);Assert.fail("zero mean -- expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
        __CLR4_4_127n627n6lb90pe9y.R.inc(103764);double[] quartiles;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103765);long[] counts;

        // Mean 1
        __CLR4_4_127n627n6lb90pe9y.R.inc(103766);quartiles = TestUtils.getDistributionQuartiles(new ExponentialDistribution(1));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103767);counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103768);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103769);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103770)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103771)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103772);double value = randomData.nextExponential(1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103773);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103774);TestUtils.assertChiSquareAccept(expected, counts, 0.001);

        // Mean 5
        __CLR4_4_127n627n6lb90pe9y.R.inc(103775);quartiles = TestUtils.getDistributionQuartiles(new ExponentialDistribution(5));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103776);counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103777);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103778);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103779)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103780)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103781);double value = randomData.nextExponential(5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103782);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103783);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** test reseeding, algorithm/provider games */
    @Test
    public void testConfig() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ppny6d282w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testConfig",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ppny6d282w(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103784);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103785);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103786);double v = randomData.nextUniform(0, 1);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103787);randomData.reSeed();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103788);Assert.assertTrue("different seeds", Math
                .abs(v - randomData.nextUniform(0, 1)) > 10E-12);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103789);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103790);Assert.assertEquals("same seeds", v, randomData.nextUniform(0, 1), 10E-12);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103791);randomData.reSeedSecure(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103792);String hex = randomData.nextSecureHexString(40);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103793);randomData.reSeedSecure();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103794);Assert.assertTrue("different seeds", !hex.equals(randomData
                .nextSecureHexString(40)));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103795);randomData.reSeedSecure(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103796);Assert.assertTrue("same seeds", !hex
                .equals(randomData.nextSecureHexString(40)));

        /*
         * remove this test back soon, since it takes about 4 seconds
         *
         * try { randomData.setSecureAlgorithm("SHA1PRNG","SUN"); } catch
         * (NoSuchProviderException ex) { ; } Assert.assertTrue("different seeds",
         * !hex.equals(randomData.nextSecureHexString(40))); try {
         * randomData.setSecureAlgorithm("NOSUCHTHING","SUN");
         * Assert.fail("expecting NoSuchAlgorithmException"); } catch
         * (NoSuchProviderException ex) { ; } catch (NoSuchAlgorithmException
         * ex) { ; }
         *
         * try { randomData.setSecureAlgorithm("SHA1PRNG","NOSUCHPROVIDER");
         * Assert.fail("expecting NoSuchProviderException"); } catch
         * (NoSuchProviderException ex) { ; }
         */

        // test reseeding without first using the generators
        __CLR4_4_127n627n6lb90pe9y.R.inc(103797);RandomDataGenerator rd = new RandomDataGenerator();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103798);rd.reSeed(100);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103799);rd.nextLong(1, 2);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103800);RandomDataGenerator rd2 = new RandomDataGenerator();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103801);rd2.reSeedSecure(2000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103802);rd2.nextSecureLong(1, 2);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103803);rd = new RandomDataGenerator();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103804);rd.reSeed();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103805);rd.nextLong(1, 2);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103806);rd2 = new RandomDataGenerator();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103807);rd2.reSeedSecure();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103808);rd2.nextSecureLong(1, 2);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** tests for nextSample() sampling from Collection */
    @Test
    public void testNextSample() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dceqju283l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextSample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dceqju283l(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103809);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103810);Object[][] c = { { "0", "1" }, { "0", "2" }, { "0", "3" },
                { "0", "4" }, { "1", "2" }, { "1", "3" }, { "1", "4" },
                { "2", "3" }, { "2", "4" }, { "3", "4" } };
        __CLR4_4_127n627n6lb90pe9y.R.inc(103811);long[] observed = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        __CLR4_4_127n627n6lb90pe9y.R.inc(103812);double[] expected = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };

        __CLR4_4_127n627n6lb90pe9y.R.inc(103813);HashSet<Object> cPop = new HashSet<Object>(); // {0,1,2,3,4}
        __CLR4_4_127n627n6lb90pe9y.R.inc(103814);for (int i = 0; (((i < 5)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103815)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103816)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103817);cPop.add(Integer.toString(i));
        }

        }__CLR4_4_127n627n6lb90pe9y.R.inc(103818);Object[] sets = new Object[10]; // 2-sets from 5
        __CLR4_4_127n627n6lb90pe9y.R.inc(103819);for (int i = 0; (((i < 10)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103820)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103821)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103822);HashSet<Object> hs = new HashSet<Object>();
            __CLR4_4_127n627n6lb90pe9y.R.inc(103823);hs.add(c[i][0]);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103824);hs.add(c[i][1]);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103825);sets[i] = hs;
        }

        }__CLR4_4_127n627n6lb90pe9y.R.inc(103826);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103827)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103828)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103829);Object[] cSamp = randomData.nextSample(cPop, 2);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103830);observed[findSample(sets, cSamp)]++;
        }

        /*
         * Use ChiSquare dist with df = 10-1 = 9, alpha = .001 Change to 21.67
         * for alpha = .01
         */
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103831);Assert.assertTrue("chi-square test -- will fail about 1 in 1000 times",
                testStatistic.chiSquare(expected, observed) < 27.88);

        // Make sure sample of size = size of collection returns same collection
        __CLR4_4_127n627n6lb90pe9y.R.inc(103832);HashSet<Object> hs = new HashSet<Object>();
        __CLR4_4_127n627n6lb90pe9y.R.inc(103833);hs.add("one");
        __CLR4_4_127n627n6lb90pe9y.R.inc(103834);Object[] one = randomData.nextSample(hs, 1);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103835);String oneString = (String) one[0];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103836);if (((((one.length != 1) || !oneString.equals("one"))&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103837)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103838)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103839);Assert.fail("bad sample for set size = 1, sample size = 1");
        }

        // Make sure we fail for sample size > collection size
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103840);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103841);one = randomData.nextSample(hs, 2);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103842);Assert.fail("sample size > set size, expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }

        // Make sure we fail for empty collection
        __CLR4_4_127n627n6lb90pe9y.R.inc(103843);try {
            __CLR4_4_127n627n6lb90pe9y.R.inc(103844);hs = new HashSet<Object>();
            __CLR4_4_127n627n6lb90pe9y.R.inc(103845);one = randomData.nextSample(hs, 0);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103846);Assert.fail("n = k = 0, expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // ignored
        }
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private int findSample(Object[] u, Object[] samp) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103847);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103848);for (int i = 0; (((i < u.length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103849)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103850)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103851);HashSet<Object> set = (HashSet<Object>) u[i];
            __CLR4_4_127n627n6lb90pe9y.R.inc(103852);HashSet<Object> sampSet = new HashSet<Object>();
            __CLR4_4_127n627n6lb90pe9y.R.inc(103853);for (int j = 0; (((j < samp.length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103854)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103855)==0&false)); j++) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103856);sampSet.add(samp[j]);
            }
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103857);if ((((set.equals(sampSet))&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103858)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103859)==0&false))) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103860);return i;
            }
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103861);Assert.fail("sample not found:{" + samp[0] + "," + samp[1] + "}");
        __CLR4_4_127n627n6lb90pe9y.R.inc(103862);return -1;
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    /** tests for nextPermutation */
    @Test
    public void testNextPermutation() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p00aa02853();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextPermutation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p00aa02853(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103863);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103864);int[][] p = { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 0, 2 }, { 1, 2, 0 },
                { 2, 0, 1 }, { 2, 1, 0 } };
        __CLR4_4_127n627n6lb90pe9y.R.inc(103865);long[] observed = { 0, 0, 0, 0, 0, 0 };
        __CLR4_4_127n627n6lb90pe9y.R.inc(103866);double[] expected = { 100, 100, 100, 100, 100, 100 };

        __CLR4_4_127n627n6lb90pe9y.R.inc(103867);for (int i = 0; (((i < 600)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103868)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103869)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103870);int[] perm = randomData.nextPermutation(3, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103871);observed[findPerm(p, perm)]++;
        }
        
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103872);String[] labels = {"{0, 1, 2}", "{ 0, 2, 1 }", "{ 1, 0, 2 }",
                "{ 1, 2, 0 }", "{ 2, 0, 1 }", "{ 2, 1, 0 }"};
        __CLR4_4_127n627n6lb90pe9y.R.inc(103873);TestUtils.assertChiSquareAccept(labels, expected, observed, 0.001);

        // Check size = 1 boundary case
        __CLR4_4_127n627n6lb90pe9y.R.inc(103874);int[] perm = randomData.nextPermutation(1, 1);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103875);if (((((perm.length != 1) || (perm[0] != 0))&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103876)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103877)==0&false))) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103878);Assert.fail("bad permutation for n = 1, sample k = 1");

            // Make sure we fail for k size > n
            __CLR4_4_127n627n6lb90pe9y.R.inc(103879);try {
                __CLR4_4_127n627n6lb90pe9y.R.inc(103880);perm = randomData.nextPermutation(2, 3);
                __CLR4_4_127n627n6lb90pe9y.R.inc(103881);Assert.fail("permutation k > n, expecting MathIllegalArgumentException");
            } catch (MathIllegalArgumentException ex) {
                // ignored
            }

            // Make sure we fail for n = 0
            __CLR4_4_127n627n6lb90pe9y.R.inc(103882);try {
                __CLR4_4_127n627n6lb90pe9y.R.inc(103883);perm = randomData.nextPermutation(0, 0);
                __CLR4_4_127n627n6lb90pe9y.R.inc(103884);Assert.fail("permutation k = n = 0, expecting MathIllegalArgumentException");
            } catch (MathIllegalArgumentException ex) {
                // ignored
            }

            // Make sure we fail for k < n < 0
            __CLR4_4_127n627n6lb90pe9y.R.inc(103885);try {
                __CLR4_4_127n627n6lb90pe9y.R.inc(103886);perm = randomData.nextPermutation(-1, -3);
                __CLR4_4_127n627n6lb90pe9y.R.inc(103887);Assert.fail("permutation k < n < 0, expecting MathIllegalArgumentException");
            } catch (MathIllegalArgumentException ex) {
                // ignored
            }

        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    // Disable until we have equals
    //public void testSerial() {
    //    Assert.assertEquals(randomData, TestUtils.serializeAndRecover(randomData));
    //}

    private int findPerm(int[][] p, int[] samp) {try{__CLR4_4_127n627n6lb90pe9y.R.inc(103888);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103889);for (int i = 0; (((i < p.length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103890)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103891)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103892);boolean good = true;
            __CLR4_4_127n627n6lb90pe9y.R.inc(103893);for (int j = 0; (((j < samp.length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103894)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103895)==0&false)); j++) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103896);if ((((samp[j] != p[i][j])&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103897)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103898)==0&false))) {{
                    __CLR4_4_127n627n6lb90pe9y.R.inc(103899);good = false;
                }
            }}
            }__CLR4_4_127n627n6lb90pe9y.R.inc(103900);if ((((good)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103901)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103902)==0&false))) {{
                __CLR4_4_127n627n6lb90pe9y.R.inc(103903);return i;
            }
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103904);Assert.fail("permutation not found");
        __CLR4_4_127n627n6lb90pe9y.R.inc(103905);return -1;
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextInversionDeviate() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etm93r286a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextInversionDeviate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etm93r286a(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103906);
        // Set the seed for the default random generator
        __CLR4_4_127n627n6lb90pe9y.R.inc(103907);RandomGenerator rg = new Well19937c(100);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103908);RandomDataGenerator rdg = new RandomDataGenerator(rg);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103909);double[] quantiles = new double[10];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103910);for (int i = 0; (((i < 10)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103911)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103912)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103913);quantiles[i] = rdg.nextUniform(0, 1);
        }
        // Reseed again so the inversion generator gets the same sequence
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103914);rg.setSeed(100);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103915);BetaDistribution betaDistribution = new BetaDistribution(rg, 2, 4,
                                                                 BetaDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
        /*
         *  Generate a sequence of deviates using inversion - the distribution function
         *  evaluated at the random value from the distribution should match the uniform
         *  random value used to generate it, which is stored in the quantiles[] array.
         */
        __CLR4_4_127n627n6lb90pe9y.R.inc(103916);for (int i = 0; (((i < 10)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103917)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103918)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103919);double value = betaDistribution.sample();
            __CLR4_4_127n627n6lb90pe9y.R.inc(103920);Assert.assertEquals(betaDistribution.cumulativeProbability(value), quantiles[i], 10E-9);
        }
    }}finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextBeta() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12z8lb0286p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextBeta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12z8lb0286p(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103921);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103922);double[] quartiles = TestUtils.getDistributionQuartiles(new BetaDistribution(2,5));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103923);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103924);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103925);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103926)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103927)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103928);double value = randomData.nextBeta(2, 5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103929);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103930);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextCauchy() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rx254n286z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextCauchy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rx254n286z(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103931);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103932);double[] quartiles = TestUtils.getDistributionQuartiles(new CauchyDistribution(1.2, 2.1));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103933);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103934);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103935);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103936)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103937)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103938);double value = randomData.nextCauchy(1.2, 2.1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103939);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103940);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextChiSquare() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xqhe9v2879();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextChiSquare",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xqhe9v2879(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103941);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103942);double[] quartiles = TestUtils.getDistributionQuartiles(new ChiSquaredDistribution(12));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103943);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103944);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103945);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103946)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103947)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103948);double value = randomData.nextChiSquare(12);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103949);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103950);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextF() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wilwtk287j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wilwtk287j(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103951);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103952);double[] quartiles = TestUtils.getDistributionQuartiles(new FDistribution(12, 5));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103953);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103954);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103955);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103956)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103957)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103958);double value = randomData.nextF(12, 5);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103959);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103960);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextGamma() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sgt247287t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextGamma",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sgt247287t(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103961);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103962);double[] quartiles;
        __CLR4_4_127n627n6lb90pe9y.R.inc(103963);long[] counts;

        // Tests shape > 1, one case in the rejection sampling
        __CLR4_4_127n627n6lb90pe9y.R.inc(103964);quartiles = TestUtils.getDistributionQuartiles(new GammaDistribution(4, 2));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103965);counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103966);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103967);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103968)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103969)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103970);double value = randomData.nextGamma(4, 2);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103971);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103972);TestUtils.assertChiSquareAccept(expected, counts, 0.001);

        // Tests shape <= 1, another case in the rejection sampling
        __CLR4_4_127n627n6lb90pe9y.R.inc(103973);quartiles = TestUtils.getDistributionQuartiles(new GammaDistribution(0.3, 3));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103974);counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103975);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103976);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103977)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103978)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103979);double value = randomData.nextGamma(0.3, 3);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103980);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103981);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextT() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zhdx2288e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextT",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zhdx2288e(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103982);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103983);double[] quartiles = TestUtils.getDistributionQuartiles(new TDistribution(10));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103984);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103985);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103986);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103987)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103988)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103989);double value = randomData.nextT(10);
            __CLR4_4_127n627n6lb90pe9y.R.inc(103990);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(103991);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextWeibull() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),103992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iup2kw288o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextWeibull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103992,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iup2kw288o(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(103992);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103993);double[] quartiles = TestUtils.getDistributionQuartiles(new WeibullDistribution(1.2, 2.1));
        __CLR4_4_127n627n6lb90pe9y.R.inc(103994);long[] counts = new long[4];
        __CLR4_4_127n627n6lb90pe9y.R.inc(103995);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(103996);for (int i = 0; (((i < 1000)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(103997)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(103998)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(103999);double value = randomData.nextWeibull(1.2, 2.1);
            __CLR4_4_127n627n6lb90pe9y.R.inc(104000);TestUtils.updateCounts(value, counts, quartiles);
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104001);TestUtils.assertChiSquareAccept(expected, counts, 0.001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextBinomial() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),104002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjz2p1288y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextBinomial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjz2p1288y(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(104002);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104003);BinomialDistributionTest testInstance = new BinomialDistributionTest();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104004);int[] densityPoints = testInstance.makeDensityTestPoints();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104005);double[] densityValues = testInstance.makeDensityTestValues();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104006);int sampleSize = 1000;
        __CLR4_4_127n627n6lb90pe9y.R.inc(104007);int length = TestUtils.eliminateZeroMassPoints(densityPoints, densityValues);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104008);BinomialDistribution distribution = (BinomialDistribution) testInstance.makeDistribution();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104009);double[] expectedCounts = new double[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104010);long[] observedCounts = new long[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104011);for (int i = 0; (((i < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104012)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104013)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(104014);expectedCounts[i] = sampleSize * densityValues[i];
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104015);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104016);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104017)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104018)==0&false)); i++) {{
          __CLR4_4_127n627n6lb90pe9y.R.inc(104019);int value = randomData.nextBinomial(distribution.getNumberOfTrials(),
                  distribution.getProbabilityOfSuccess());
          __CLR4_4_127n627n6lb90pe9y.R.inc(104020);for (int j = 0; (((j < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104021)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104022)==0&false)); j++) {{
              __CLR4_4_127n627n6lb90pe9y.R.inc(104023);if ((((value == densityPoints[j])&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104024)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104025)==0&false))) {{
                  __CLR4_4_127n627n6lb90pe9y.R.inc(104026);observedCounts[j]++;
              }
          }}
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104027);TestUtils.assertChiSquareAccept(densityPoints, expectedCounts, observedCounts, .001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextHypergeometric() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),104028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pkgrc1289o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextHypergeometric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pkgrc1289o(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(104028);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104029);HypergeometricDistributionTest testInstance = new HypergeometricDistributionTest();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104030);int[] densityPoints = testInstance.makeDensityTestPoints();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104031);double[] densityValues = testInstance.makeDensityTestValues();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104032);int sampleSize = 1000;
        __CLR4_4_127n627n6lb90pe9y.R.inc(104033);int length = TestUtils.eliminateZeroMassPoints(densityPoints, densityValues);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104034);HypergeometricDistribution distribution = (HypergeometricDistribution) testInstance.makeDistribution();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104035);double[] expectedCounts = new double[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104036);long[] observedCounts = new long[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104037);for (int i = 0; (((i < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104038)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104039)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(104040);expectedCounts[i] = sampleSize * densityValues[i];
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104041);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104042);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104043)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104044)==0&false)); i++) {{
          __CLR4_4_127n627n6lb90pe9y.R.inc(104045);int value = randomData.nextHypergeometric(distribution.getPopulationSize(),
                  distribution.getNumberOfSuccesses(), distribution.getSampleSize());
          __CLR4_4_127n627n6lb90pe9y.R.inc(104046);for (int j = 0; (((j < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104047)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104048)==0&false)); j++) {{
              __CLR4_4_127n627n6lb90pe9y.R.inc(104049);if ((((value == densityPoints[j])&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104050)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104051)==0&false))) {{
                  __CLR4_4_127n627n6lb90pe9y.R.inc(104052);observedCounts[j]++;
              }
          }}
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104053);TestUtils.assertChiSquareAccept(densityPoints, expectedCounts, observedCounts, .001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextPascal() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),104054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r9caoo28ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextPascal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r9caoo28ae(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(104054);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104055);PascalDistributionTest testInstance = new PascalDistributionTest();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104056);int[] densityPoints = testInstance.makeDensityTestPoints();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104057);double[] densityValues = testInstance.makeDensityTestValues();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104058);int sampleSize = 1000;
        __CLR4_4_127n627n6lb90pe9y.R.inc(104059);int length = TestUtils.eliminateZeroMassPoints(densityPoints, densityValues);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104060);PascalDistribution distribution = (PascalDistribution) testInstance.makeDistribution();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104061);double[] expectedCounts = new double[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104062);long[] observedCounts = new long[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104063);for (int i = 0; (((i < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104064)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104065)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(104066);expectedCounts[i] = sampleSize * densityValues[i];
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104067);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104068);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104069)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104070)==0&false)); i++) {{
          __CLR4_4_127n627n6lb90pe9y.R.inc(104071);int value = randomData.nextPascal(distribution.getNumberOfSuccesses(), distribution.getProbabilityOfSuccess());
          __CLR4_4_127n627n6lb90pe9y.R.inc(104072);for (int j = 0; (((j < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104073)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104074)==0&false)); j++) {{
              __CLR4_4_127n627n6lb90pe9y.R.inc(104075);if ((((value == densityPoints[j])&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104076)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104077)==0&false))) {{
                  __CLR4_4_127n627n6lb90pe9y.R.inc(104078);observedCounts[j]++;
              }
          }}
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104079);TestUtils.assertChiSquareAccept(densityPoints, expectedCounts, observedCounts, .001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    public void testNextZipf() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),104080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189tinl28b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testNextZipf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189tinl28b4(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(104080);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104081);ZipfDistributionTest testInstance = new ZipfDistributionTest();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104082);int[] densityPoints = testInstance.makeDensityTestPoints();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104083);double[] densityValues = testInstance.makeDensityTestValues();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104084);int sampleSize = 1000;
        __CLR4_4_127n627n6lb90pe9y.R.inc(104085);int length = TestUtils.eliminateZeroMassPoints(densityPoints, densityValues);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104086);ZipfDistribution distribution = (ZipfDistribution) testInstance.makeDistribution();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104087);double[] expectedCounts = new double[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104088);long[] observedCounts = new long[length];
        __CLR4_4_127n627n6lb90pe9y.R.inc(104089);for (int i = 0; (((i < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104090)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104091)==0&false)); i++) {{
            __CLR4_4_127n627n6lb90pe9y.R.inc(104092);expectedCounts[i] = sampleSize * densityValues[i];
        }
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104093);randomData.reSeed(1000);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104094);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104095)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104096)==0&false)); i++) {{
          __CLR4_4_127n627n6lb90pe9y.R.inc(104097);int value = randomData.nextZipf(distribution.getNumberOfElements(), distribution.getExponent());
          __CLR4_4_127n627n6lb90pe9y.R.inc(104098);for (int j = 0; (((j < length)&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104099)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104100)==0&false)); j++) {{
              __CLR4_4_127n627n6lb90pe9y.R.inc(104101);if ((((value == densityPoints[j])&&(__CLR4_4_127n627n6lb90pe9y.R.iget(104102)!=0|true))||(__CLR4_4_127n627n6lb90pe9y.R.iget(104103)==0&false))) {{
                  __CLR4_4_127n627n6lb90pe9y.R.inc(104104);observedCounts[j]++;
              }
          }}
        }}
        }__CLR4_4_127n627n6lb90pe9y.R.inc(104105);TestUtils.assertChiSquareAccept(densityPoints, expectedCounts, observedCounts, .001);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

    @Test
    /**
     * MATH-720
     */
    public void testReseed() {__CLR4_4_127n627n6lb90pe9y.R.globalSliceStart(getClass().getName(),104106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ha8vmr28bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127n627n6lb90pe9y.R.rethrow($CLV_t2$);}finally{__CLR4_4_127n627n6lb90pe9y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.RandomDataGeneratorTest.testReseed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ha8vmr28bu(){try{__CLR4_4_127n627n6lb90pe9y.R.inc(104106);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104107);PoissonDistribution x = new PoissonDistribution(3.0);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104108);x.reseedRandomGenerator(0);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104109);final double u = x.sample();
        __CLR4_4_127n627n6lb90pe9y.R.inc(104110);PoissonDistribution y = new PoissonDistribution(3.0);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104111);y.reseedRandomGenerator(0);
        __CLR4_4_127n627n6lb90pe9y.R.inc(104112);Assert.assertEquals(u, y.sample(), 0);
    }finally{__CLR4_4_127n627n6lb90pe9y.R.flushNeeded();}}

}
