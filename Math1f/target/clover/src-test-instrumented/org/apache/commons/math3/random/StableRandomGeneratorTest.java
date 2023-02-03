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

import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.junit.Assert;
import org.junit.Test;

/**
 * The class <code>StableRandomGeneratorTest</code> contains tests for the class
 * {@link StableRandomGenerator}
 * 
 * @version $Revision$
 */
public class StableRandomGeneratorTest {static class __CLR4_4_128lr28lrlb90peam{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private RandomGenerator rg = new Well19937c(100);
    private final static int sampleSize = 10000;

    /**
     * Run the double nextDouble() method test Due to leptokurtic property the
     * acceptance range is widened.
     * 
     * TODO: verify that tolerance this wide is really OK
     */
    @Test
    public void testNextDouble() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lul2ub28lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testNextDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lul2ub28lr(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104463);
        __CLR4_4_128lr28lrlb90peam.R.inc(104464);StableRandomGenerator generator = new StableRandomGenerator(rg, 1.3,
                0.1);
        __CLR4_4_128lr28lrlb90peam.R.inc(104465);double[] sample = new double[2 * sampleSize];
        __CLR4_4_128lr28lrlb90peam.R.inc(104466);for (int i = 0; (((i < sample.length)&&(__CLR4_4_128lr28lrlb90peam.R.iget(104467)!=0|true))||(__CLR4_4_128lr28lrlb90peam.R.iget(104468)==0&false)); ++i) {{
            __CLR4_4_128lr28lrlb90peam.R.inc(104469);sample[i] = generator.nextNormalizedDouble();
        }
        }__CLR4_4_128lr28lrlb90peam.R.inc(104470);Assert.assertEquals(0.0, StatUtils.mean(sample), 0.3);
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}

    /**
     * If alpha = 2, than it must be Gaussian distribution
     */
    @Test
    public void testGaussianCase() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urplng28lz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testGaussianCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urplng28lz(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104471);
        __CLR4_4_128lr28lrlb90peam.R.inc(104472);StableRandomGenerator generator = new StableRandomGenerator(rg, 2d, 0.0);

        __CLR4_4_128lr28lrlb90peam.R.inc(104473);double[] sample = new double[sampleSize];
        __CLR4_4_128lr28lrlb90peam.R.inc(104474);for (int i = 0; (((i < sample.length)&&(__CLR4_4_128lr28lrlb90peam.R.iget(104475)!=0|true))||(__CLR4_4_128lr28lrlb90peam.R.iget(104476)==0&false)); ++i) {{
            __CLR4_4_128lr28lrlb90peam.R.inc(104477);sample[i] = generator.nextNormalizedDouble();
        }
        }__CLR4_4_128lr28lrlb90peam.R.inc(104478);Assert.assertEquals(0.0, StatUtils.mean(sample), 0.02);
        __CLR4_4_128lr28lrlb90peam.R.inc(104479);Assert.assertEquals(1.0, StatUtils.variance(sample), 0.02);
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}

    /**
     * If alpha = 1, than it must be Cauchy distribution
     */
    @Test
    public void testCauchyCase() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rqg0ey28m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testCauchyCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rqg0ey28m8(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104480);
        __CLR4_4_128lr28lrlb90peam.R.inc(104481);StableRandomGenerator generator = new StableRandomGenerator(rg, 1d, 0.0);
        __CLR4_4_128lr28lrlb90peam.R.inc(104482);DescriptiveStatistics summary = new DescriptiveStatistics();

        __CLR4_4_128lr28lrlb90peam.R.inc(104483);for (int i = 0; (((i < sampleSize)&&(__CLR4_4_128lr28lrlb90peam.R.iget(104484)!=0|true))||(__CLR4_4_128lr28lrlb90peam.R.iget(104485)==0&false)); ++i) {{
            __CLR4_4_128lr28lrlb90peam.R.inc(104486);double sample = generator.nextNormalizedDouble();
            __CLR4_4_128lr28lrlb90peam.R.inc(104487);summary.addValue(sample);
        }

        // Standard Cauchy distribution should have zero median and mode
        }__CLR4_4_128lr28lrlb90peam.R.inc(104488);double median = summary.getPercentile(50);
        __CLR4_4_128lr28lrlb90peam.R.inc(104489);Assert.assertEquals(0.0, median, 0.2);
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}

    /**
     * Input parameter range tests
     */
    @Test
    public void testAlphaRangeBelowZero() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nosjjl28mi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testAlphaRangeBelowZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nosjjl28mi(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104490);
        __CLR4_4_128lr28lrlb90peam.R.inc(104491);try {
            __CLR4_4_128lr28lrlb90peam.R.inc(104492);new StableRandomGenerator(rg,
                    -1.0, 0.0);
            __CLR4_4_128lr28lrlb90peam.R.inc(104493);Assert.fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            __CLR4_4_128lr28lrlb90peam.R.inc(104494);Assert.assertEquals(-1.0, e.getArgument());
        }
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}

    @Test
    public void testAlphaRangeAboveTwo() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mjcp28mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testAlphaRangeAboveTwo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mjcp28mn(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104495);
        __CLR4_4_128lr28lrlb90peam.R.inc(104496);try {
            __CLR4_4_128lr28lrlb90peam.R.inc(104497);new StableRandomGenerator(rg,
                    3.0, 0.0);
            __CLR4_4_128lr28lrlb90peam.R.inc(104498);Assert.fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            __CLR4_4_128lr28lrlb90peam.R.inc(104499);Assert.assertEquals(3.0, e.getArgument());
        }
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}

    @Test
    public void testBetaRangeBelowMinusOne() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlwx7128ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testBetaRangeBelowMinusOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlwx7128ms(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104500);
        __CLR4_4_128lr28lrlb90peam.R.inc(104501);try {
            __CLR4_4_128lr28lrlb90peam.R.inc(104502);new StableRandomGenerator(rg,
                    1.0, -2.0);
            __CLR4_4_128lr28lrlb90peam.R.inc(104503);Assert.fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            __CLR4_4_128lr28lrlb90peam.R.inc(104504);Assert.assertEquals(-2.0, e.getArgument());
        }
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}

    @Test
    public void testBetaRangeAboveOne() {__CLR4_4_128lr28lrlb90peam.R.globalSliceStart(getClass().getName(),104505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_159syzv28mx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128lr28lrlb90peam.R.rethrow($CLV_t2$);}finally{__CLR4_4_128lr28lrlb90peam.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.StableRandomGeneratorTest.testBetaRangeAboveOne",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_159syzv28mx(){try{__CLR4_4_128lr28lrlb90peam.R.inc(104505);
        __CLR4_4_128lr28lrlb90peam.R.inc(104506);try {
            __CLR4_4_128lr28lrlb90peam.R.inc(104507);new StableRandomGenerator(rg,
                    1.0, 2.0);
            __CLR4_4_128lr28lrlb90peam.R.inc(104508);Assert.fail("Expected OutOfRangeException");
        } catch (OutOfRangeException e) {
            __CLR4_4_128lr28lrlb90peam.R.inc(104509);Assert.assertEquals(2.0, e.getArgument());
        }
    }finally{__CLR4_4_128lr28lrlb90peam.R.flushNeeded();}}
}