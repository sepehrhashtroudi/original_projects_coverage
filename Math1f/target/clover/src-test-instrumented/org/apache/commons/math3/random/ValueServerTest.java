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

import java.net.URL;
import java.util.Arrays;

import org.apache.commons.math3.RetryRunner;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test cases for the ValueServer class.
 *
 * @version $Id$
 */

@RunWith(RetryRunner.class)
public final class ValueServerTest {static class __CLR4_4_128qj28qjlb90peba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,104762,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ValueServer vs = new ValueServer(new Well19937c(100));

    @Before
    public void setUp() {try{__CLR4_4_128qj28qjlb90peba.R.inc(104635);
        __CLR4_4_128qj28qjlb90peba.R.inc(104636);vs.setMode(ValueServer.DIGEST_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104637);URL url = getClass().getResource("testData.txt");
        __CLR4_4_128qj28qjlb90peba.R.inc(104638);vs.setValuesFileURL(url);
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    /**
      * Generate 1000 random values and make sure they look OK.<br>
      * Note that there is a non-zero (but very small) probability that
      * these tests will fail even if the code is working as designed.
      */
    @Test
    public void testNextDigest() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmxpu828qn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testNextDigest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmxpu828qn() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104639);
        __CLR4_4_128qj28qjlb90peba.R.inc(104640);double next = 0.0;
        __CLR4_4_128qj28qjlb90peba.R.inc(104641);double tolerance = 0.1;
        __CLR4_4_128qj28qjlb90peba.R.inc(104642);vs.computeDistribution();
        __CLR4_4_128qj28qjlb90peba.R.inc(104643);Assert.assertTrue("empirical distribution property",
            vs.getEmpiricalDistribution() != null);
        __CLR4_4_128qj28qjlb90peba.R.inc(104644);SummaryStatistics stats = new SummaryStatistics();
        __CLR4_4_128qj28qjlb90peba.R.inc(104645);for (int i = 1; (((i < 1000)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104646)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104647)==0&false)); i++) {{
            __CLR4_4_128qj28qjlb90peba.R.inc(104648);next = vs.getNext();
            __CLR4_4_128qj28qjlb90peba.R.inc(104649);stats.addValue(next);
        }
        }__CLR4_4_128qj28qjlb90peba.R.inc(104650);Assert.assertEquals("mean", 5.069831575018909, stats.getMean(), tolerance);
        __CLR4_4_128qj28qjlb90peba.R.inc(104651);Assert.assertEquals("std dev", 1.0173699343977738, stats.getStandardDeviation(),
            tolerance);

        __CLR4_4_128qj28qjlb90peba.R.inc(104652);vs.computeDistribution(500);
        __CLR4_4_128qj28qjlb90peba.R.inc(104653);stats = new SummaryStatistics();
        __CLR4_4_128qj28qjlb90peba.R.inc(104654);for (int i = 1; (((i < 1000)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104655)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104656)==0&false)); i++) {{
            __CLR4_4_128qj28qjlb90peba.R.inc(104657);next = vs.getNext();
            __CLR4_4_128qj28qjlb90peba.R.inc(104658);stats.addValue(next);
        }
        }__CLR4_4_128qj28qjlb90peba.R.inc(104659);Assert.assertEquals("mean", 5.069831575018909, stats.getMean(), tolerance);
        __CLR4_4_128qj28qjlb90peba.R.inc(104660);Assert.assertEquals("std dev", 1.0173699343977738, stats.getStandardDeviation(),
            tolerance);
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}
    
    /**
     * Verify that when provided with fixed seeds, stochastic modes
     * generate fixed sequences.  Verifies the fix for MATH-654.
     */
    @Test 
    public void testFixedSeed() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gnr79628r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testFixedSeed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gnr79628r9() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104661);
        __CLR4_4_128qj28qjlb90peba.R.inc(104662);ValueServer valueServer = new ValueServer();
        __CLR4_4_128qj28qjlb90peba.R.inc(104663);URL url = getClass().getResource("testData.txt");
        __CLR4_4_128qj28qjlb90peba.R.inc(104664);valueServer.setValuesFileURL(url);
        __CLR4_4_128qj28qjlb90peba.R.inc(104665);valueServer.computeDistribution();
        __CLR4_4_128qj28qjlb90peba.R.inc(104666);checkFixedSeed(valueServer, ValueServer.DIGEST_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104667);checkFixedSeed(valueServer, ValueServer.EXPONENTIAL_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104668);checkFixedSeed(valueServer, ValueServer.GAUSSIAN_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104669);checkFixedSeed(valueServer, ValueServer.UNIFORM_MODE);
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}
    
    /**
     * Do the check for {@link #testFixedSeed()}
     * @param mode ValueServer mode
     */
    private void checkFixedSeed(ValueServer valueServer, int mode) throws Exception {try{__CLR4_4_128qj28qjlb90peba.R.inc(104670);
        __CLR4_4_128qj28qjlb90peba.R.inc(104671);valueServer.reSeed(1000);
        __CLR4_4_128qj28qjlb90peba.R.inc(104672);valueServer.setMode(mode);
        __CLR4_4_128qj28qjlb90peba.R.inc(104673);double[][] values = new double[2][100];
        __CLR4_4_128qj28qjlb90peba.R.inc(104674);for (int i = 0; (((i < 100)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104675)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104676)==0&false)); i++) {{
            __CLR4_4_128qj28qjlb90peba.R.inc(104677);values[0][i] = valueServer.getNext();
        }
        }__CLR4_4_128qj28qjlb90peba.R.inc(104678);valueServer.reSeed(1000);
        __CLR4_4_128qj28qjlb90peba.R.inc(104679);for (int i = 0; (((i < 100)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104680)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104681)==0&false)); i++) {{
            __CLR4_4_128qj28qjlb90peba.R.inc(104682);values[1][i] = valueServer.getNext();
        }
        }__CLR4_4_128qj28qjlb90peba.R.inc(104683);Assert.assertTrue(Arrays.equals(values[0], values[1])); 
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    /**
      * Make sure exception thrown if digest getNext is attempted
      * before loading empiricalDistribution.
      */
    @Test
    public void testNextDigestFail() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lfjcpe28rw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testNextDigestFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lfjcpe28rw() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104684);
        __CLR4_4_128qj28qjlb90peba.R.inc(104685);try {
            __CLR4_4_128qj28qjlb90peba.R.inc(104686);vs.getNext();
            __CLR4_4_128qj28qjlb90peba.R.inc(104687);Assert.fail("Expecting IllegalStateException");
        } catch (IllegalStateException ex) {}
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    @Test
    public void testEmptyReplayFile() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160732328s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testEmptyReplayFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104688,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160732328s0() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104688);
        __CLR4_4_128qj28qjlb90peba.R.inc(104689);try {
            __CLR4_4_128qj28qjlb90peba.R.inc(104690);URL url = getClass().getResource("emptyFile.txt");
            __CLR4_4_128qj28qjlb90peba.R.inc(104691);vs.setMode(ValueServer.REPLAY_MODE);
            __CLR4_4_128qj28qjlb90peba.R.inc(104692);vs.setValuesFileURL(url);
            __CLR4_4_128qj28qjlb90peba.R.inc(104693);vs.getNext();
            __CLR4_4_128qj28qjlb90peba.R.inc(104694);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalStateException mise) {
            // expected behavior
        }
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    @Test
    public void testEmptyDigestFile() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de1l6q28s7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testEmptyDigestFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de1l6q28s7() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104695);
        __CLR4_4_128qj28qjlb90peba.R.inc(104696);try {
            __CLR4_4_128qj28qjlb90peba.R.inc(104697);URL url = getClass().getResource("emptyFile.txt");
            __CLR4_4_128qj28qjlb90peba.R.inc(104698);vs.setMode(ValueServer.DIGEST_MODE);
            __CLR4_4_128qj28qjlb90peba.R.inc(104699);vs.setValuesFileURL(url);
            __CLR4_4_128qj28qjlb90peba.R.inc(104700);vs.computeDistribution();
            __CLR4_4_128qj28qjlb90peba.R.inc(104701);Assert.fail("an exception should have been thrown");
        } catch (ZeroException ze) {
            // expected behavior
        }
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    /**
     * Test ValueServer REPLAY_MODE using values in testData file.<br>
     * Check that the values 1,2,1001,1002 match data file values 1 and 2.
     * the sample data file.
     */
    @Test
    public void testReplay() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdlww028se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testReplay",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdlww028se() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104702);
        __CLR4_4_128qj28qjlb90peba.R.inc(104703);double firstDataValue = 4.038625496201205;
        __CLR4_4_128qj28qjlb90peba.R.inc(104704);double secondDataValue = 3.6485326248346936;
        __CLR4_4_128qj28qjlb90peba.R.inc(104705);double tolerance = 10E-15;
        __CLR4_4_128qj28qjlb90peba.R.inc(104706);double compareValue = 0.0d;
        __CLR4_4_128qj28qjlb90peba.R.inc(104707);vs.setMode(ValueServer.REPLAY_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104708);vs.resetReplayFile();
        __CLR4_4_128qj28qjlb90peba.R.inc(104709);compareValue = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104710);Assert.assertEquals(compareValue,firstDataValue,tolerance);
        __CLR4_4_128qj28qjlb90peba.R.inc(104711);compareValue = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104712);Assert.assertEquals(compareValue,secondDataValue,tolerance);
        __CLR4_4_128qj28qjlb90peba.R.inc(104713);for (int i = 3; (((i < 1001)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104714)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104715)==0&false)); i++) {{
           __CLR4_4_128qj28qjlb90peba.R.inc(104716);compareValue = vs.getNext();
        }
        }__CLR4_4_128qj28qjlb90peba.R.inc(104717);compareValue = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104718);Assert.assertEquals(compareValue,firstDataValue,tolerance);
        __CLR4_4_128qj28qjlb90peba.R.inc(104719);compareValue = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104720);Assert.assertEquals(compareValue,secondDataValue,tolerance);
        __CLR4_4_128qj28qjlb90peba.R.inc(104721);vs.closeReplayFile();
        // make sure no NPE
        __CLR4_4_128qj28qjlb90peba.R.inc(104722);vs.closeReplayFile();
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    /**
     * Test other ValueServer modes
     */
    @Test
    public void testModes() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxxe1128sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testModes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxxe1128sz() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104723);
        __CLR4_4_128qj28qjlb90peba.R.inc(104724);vs.setMode(ValueServer.CONSTANT_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104725);vs.setMu(0);
        __CLR4_4_128qj28qjlb90peba.R.inc(104726);Assert.assertEquals("constant mode test",vs.getMu(),vs.getNext(),Double.MIN_VALUE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104727);vs.setMode(ValueServer.UNIFORM_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104728);vs.setMu(2);
        __CLR4_4_128qj28qjlb90peba.R.inc(104729);double val = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104730);Assert.assertTrue(val > 0 && val < 4);
        __CLR4_4_128qj28qjlb90peba.R.inc(104731);vs.setSigma(1);
        __CLR4_4_128qj28qjlb90peba.R.inc(104732);vs.setMode(ValueServer.GAUSSIAN_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104733);val = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104734);Assert.assertTrue("gaussian value close enough to mean",
            val < vs.getMu() + 100*vs.getSigma());
        __CLR4_4_128qj28qjlb90peba.R.inc(104735);vs.setMode(ValueServer.EXPONENTIAL_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104736);val = vs.getNext();
        __CLR4_4_128qj28qjlb90peba.R.inc(104737);Assert.assertTrue(val > 0);
        __CLR4_4_128qj28qjlb90peba.R.inc(104738);try {
            __CLR4_4_128qj28qjlb90peba.R.inc(104739);vs.setMode(1000);
            __CLR4_4_128qj28qjlb90peba.R.inc(104740);vs.getNext();
            __CLR4_4_128qj28qjlb90peba.R.inc(104741);Assert.fail("bad mode, expecting IllegalStateException");
        } catch (IllegalStateException ex) {
            // ignored
        }
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    /**
     * Test fill
     */
    @Test
    public void testFill() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m9bwv828ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testFill",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m9bwv828ti() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104742);
        __CLR4_4_128qj28qjlb90peba.R.inc(104743);vs.setMode(ValueServer.CONSTANT_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104744);vs.setMu(2);
        __CLR4_4_128qj28qjlb90peba.R.inc(104745);double[] val = new double[5];
        __CLR4_4_128qj28qjlb90peba.R.inc(104746);vs.fill(val);
        __CLR4_4_128qj28qjlb90peba.R.inc(104747);for (int i = 0; (((i < 5)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104748)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104749)==0&false)); i++) {{
            __CLR4_4_128qj28qjlb90peba.R.inc(104750);Assert.assertEquals("fill test in place",2,val[i],Double.MIN_VALUE);
        }
        }__CLR4_4_128qj28qjlb90peba.R.inc(104751);double v2[] = vs.fill(3);
        __CLR4_4_128qj28qjlb90peba.R.inc(104752);for (int i = 0; (((i < 3)&&(__CLR4_4_128qj28qjlb90peba.R.iget(104753)!=0|true))||(__CLR4_4_128qj28qjlb90peba.R.iget(104754)==0&false)); i++) {{
            __CLR4_4_128qj28qjlb90peba.R.inc(104755);Assert.assertEquals("fill test in place",2,v2[i],Double.MIN_VALUE);
        }
    }}finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

    /**
     * Test getters to make Clover happy
     */
    @Test
    public void testProperties() throws Exception {__CLR4_4_128qj28qjlb90peba.R.globalSliceStart(getClass().getName(),104756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nnb6d028tw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_128qj28qjlb90peba.R.rethrow($CLV_t2$);}finally{__CLR4_4_128qj28qjlb90peba.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.ValueServerTest.testProperties",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),104756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nnb6d028tw() throws Exception{try{__CLR4_4_128qj28qjlb90peba.R.inc(104756);
        __CLR4_4_128qj28qjlb90peba.R.inc(104757);vs.setMode(ValueServer.CONSTANT_MODE);
        __CLR4_4_128qj28qjlb90peba.R.inc(104758);Assert.assertEquals("mode test",ValueServer.CONSTANT_MODE,vs.getMode());
        __CLR4_4_128qj28qjlb90peba.R.inc(104759);vs.setValuesFileURL("http://www.apache.org");
        __CLR4_4_128qj28qjlb90peba.R.inc(104760);URL url = vs.getValuesFileURL();
        __CLR4_4_128qj28qjlb90peba.R.inc(104761);Assert.assertEquals("valuesFileURL test","http://www.apache.org",url.toString());
    }finally{__CLR4_4_128qj28qjlb90peba.R.flushNeeded();}}

}
