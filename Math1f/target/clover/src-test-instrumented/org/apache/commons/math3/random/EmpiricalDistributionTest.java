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

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.BaseAbstractUnivariateIntegrator;
import org.apache.commons.math3.analysis.integration.IterativeLegendreGaussIntegrator;
import org.apache.commons.math3.distribution.AbstractRealDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.RealDistributionAbstractTest;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for the EmpiricalDistribution class
 *
 * @version $Id$
 */

public final class EmpiricalDistributionTest extends RealDistributionAbstractTest {static class __CLR4_4_127b127b1lb90pe6l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,103086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected EmpiricalDistribution empiricalDistribution = null;
    protected EmpiricalDistribution empiricalDistribution2 = null;
    protected File file = null;
    protected URL url = null;
    protected double[] dataArray = null;
    protected final int n = 10000;

    @Override
    @Before
    public void setUp() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102781);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102782);super.setUp();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102783);empiricalDistribution = new EmpiricalDistribution(100);
//         empiricalDistribution = new EmpiricalDistribution(100, new RandomDataImpl()); // XXX Deprecated API
        __CLR4_4_127b127b1lb90pe6l.R.inc(102784);url = getClass().getResource("testData.txt");
        __CLR4_4_127b127b1lb90pe6l.R.inc(102785);final ArrayList<Double> list = new ArrayList<Double>();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102786);try {
            __CLR4_4_127b127b1lb90pe6l.R.inc(102787);empiricalDistribution2 = new EmpiricalDistribution(100);
//             empiricalDistribution2 = new EmpiricalDistribution(100, new RandomDataImpl()); // XXX Deprecated API
            __CLR4_4_127b127b1lb90pe6l.R.inc(102788);BufferedReader in =
                new BufferedReader(new InputStreamReader(
                        url.openStream()));
            __CLR4_4_127b127b1lb90pe6l.R.inc(102789);String str = null;
            __CLR4_4_127b127b1lb90pe6l.R.inc(102790);while ((str = in.readLine()) != null) {{
                __CLR4_4_127b127b1lb90pe6l.R.inc(102793);list.add(Double.valueOf(str));
            }
            }__CLR4_4_127b127b1lb90pe6l.R.inc(102794);in.close();
            __CLR4_4_127b127b1lb90pe6l.R.inc(102795);in = null;
        } catch (IOException ex) {
            __CLR4_4_127b127b1lb90pe6l.R.inc(102796);Assert.fail("IOException " + ex);
        }

        __CLR4_4_127b127b1lb90pe6l.R.inc(102797);dataArray = new double[list.size()];
        __CLR4_4_127b127b1lb90pe6l.R.inc(102798);int i = 0;
        __CLR4_4_127b127b1lb90pe6l.R.inc(102799);for (Double data : list) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102800);dataArray[i] = data.doubleValue();
            __CLR4_4_127b127b1lb90pe6l.R.inc(102801);i++;
        }
    }}finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
     * Test EmpiricalDistrbution.load() using sample data file.<br>
     * Check that the sampleCount, mu and sigma match data in
     * the sample data file. Also verify that load is idempotent.
     */
    @Test
    public void testLoad() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13p7l7l27bm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testLoad",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13p7l7l27bm() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102802);
        // Load from a URL
        __CLR4_4_127b127b1lb90pe6l.R.inc(102803);empiricalDistribution.load(url);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102804);checkDistribution();
        
        // Load again from a file (also verifies idempotency of load)
        __CLR4_4_127b127b1lb90pe6l.R.inc(102805);File file = new File(url.toURI());
        __CLR4_4_127b127b1lb90pe6l.R.inc(102806);empiricalDistribution.load(file);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102807);checkDistribution();
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    private void checkDistribution() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102808);
        // testData File has 10000 values, with mean ~ 5.0, std dev ~ 1
        // Make sure that loaded distribution matches this
        __CLR4_4_127b127b1lb90pe6l.R.inc(102809);Assert.assertEquals(empiricalDistribution.getSampleStats().getN(),1000,10E-7);
        //TODO: replace with statistical tests
        __CLR4_4_127b127b1lb90pe6l.R.inc(102810);Assert.assertEquals(empiricalDistribution.getSampleStats().getMean(),
                5.069831575018909,10E-7);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102811);Assert.assertEquals(empiricalDistribution.getSampleStats().getStandardDeviation(),
                1.0173699343977738,10E-7);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
     * Test EmpiricalDistrbution.load(double[]) using data taken from
     * sample data file.<br>
     * Check that the sampleCount, mu and sigma match data in
     * the sample data file.
     */
    @Test
    public void testDoubleLoad() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eg9xe827bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testDoubleLoad",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eg9xe827bw() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102812);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102813);empiricalDistribution2.load(dataArray);
        // testData File has 10000 values, with mean ~ 5.0, std dev ~ 1
        // Make sure that loaded distribution matches this
        __CLR4_4_127b127b1lb90pe6l.R.inc(102814);Assert.assertEquals(empiricalDistribution2.getSampleStats().getN(),1000,10E-7);
        //TODO: replace with statistical tests
        __CLR4_4_127b127b1lb90pe6l.R.inc(102815);Assert.assertEquals(empiricalDistribution2.getSampleStats().getMean(),
                5.069831575018909,10E-7);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102816);Assert.assertEquals(empiricalDistribution2.getSampleStats().getStandardDeviation(),
                1.0173699343977738,10E-7);

        __CLR4_4_127b127b1lb90pe6l.R.inc(102817);double[] bounds = empiricalDistribution2.getGeneratorUpperBounds();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102818);Assert.assertEquals(bounds.length, 100);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102819);Assert.assertEquals(bounds[99], 1.0, 10e-12);

    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
      * Generate 1000 random values and make sure they look OK.<br>
      * Note that there is a non-zero (but very small) probability that
      * these tests will fail even if the code is working as designed.
      */
    @Test
    public void testNext() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igtqr827c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igtqr827c4() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102820);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102821);tstGen(0.1);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102822);tstDoubleGen(0.1);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
      * Make sure exception thrown if digest getNext is attempted
      * before loading empiricalDistribution.
     */
    @Test
    public void testNexFail() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15o64mk27c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testNexFail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15o64mk27c7(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(102823);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102824);try {
            __CLR4_4_127b127b1lb90pe6l.R.inc(102825);empiricalDistribution.getNextValue();
            __CLR4_4_127b127b1lb90pe6l.R.inc(102826);empiricalDistribution2.getNextValue();
            __CLR4_4_127b127b1lb90pe6l.R.inc(102827);Assert.fail("Expecting IllegalStateException");
        } catch (IllegalStateException ex) {
            // expected
        }
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
     * Make sure we can handle a grid size that is too fine
     */
    @Test
    public void testGridTooFine() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vuoo327cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFine",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vuoo327cc() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102828);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102829);empiricalDistribution = new EmpiricalDistribution(1001);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102830);tstGen(0.1);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102831);empiricalDistribution2 = new EmpiricalDistribution(1001);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102832);tstDoubleGen(0.1);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
     * How about too fat?
     */
    @Test
    public void testGridTooFat() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144obfo27ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144obfo27ch() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102833);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102834);empiricalDistribution = new EmpiricalDistribution(1);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102835);tstGen(5); // ridiculous tolerance; but ridiculous grid size
                   // really just checking to make sure we do not bomb
        __CLR4_4_127b127b1lb90pe6l.R.inc(102836);empiricalDistribution2 = new EmpiricalDistribution(1);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102837);tstDoubleGen(5);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
     * Test bin index overflow problem (BZ 36450)
     */
    @Test
    public void testBinIndexOverflow() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jkvgsa27cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testBinIndexOverflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jkvgsa27cm() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102838);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102839);double[] x = new double[] {9474.94326071674, 2080107.8865462579};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102840);new EmpiricalDistribution().load(x);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    @Test
    public void testSerialization() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on927cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on927cp(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(102841);
        // Empty
        __CLR4_4_127b127b1lb90pe6l.R.inc(102842);EmpiricalDistribution dist = new EmpiricalDistribution();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102843);EmpiricalDistribution dist2 = (EmpiricalDistribution) TestUtils.serializeAndRecover(dist);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102844);verifySame(dist, dist2);

        // Loaded
        __CLR4_4_127b127b1lb90pe6l.R.inc(102845);empiricalDistribution2.load(dataArray);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102846);dist2 = (EmpiricalDistribution) TestUtils.serializeAndRecover(empiricalDistribution2);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102847);verifySame(empiricalDistribution2, dist2);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testLoadNullDoubleArray() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19iaxlc27cw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,111,97,100,78,117,108,108,68,111,117,98,108,101,65,114,114,97,121,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullDoubleArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102848,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19iaxlc27cw(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(102848);
       __CLR4_4_127b127b1lb90pe6l.R.inc(102849);new EmpiricalDistribution().load((double[]) null);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testLoadNullURL() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cyfsaf27cy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,111,97,100,78,117,108,108,85,82,76,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullURL",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cyfsaf27cy() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102850);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102851);new EmpiricalDistribution().load((URL) null);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testLoadNullFile() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ioc5s227d0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,111,97,100,78,117,108,108,70,105,108,101,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ioc5s227d0() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102852);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102853);new EmpiricalDistribution().load((File) null);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    /**
     * MATH-298
     */
    @Test
    public void testGetBinUpperBounds() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rklv3v27d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testGetBinUpperBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rklv3v27d2(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(102854);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102855);double[] testData = {0, 1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102856);EmpiricalDistribution dist = new EmpiricalDistribution(5);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102857);dist.load(testData);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102858);double[] expectedBinUpperBounds = {2, 4, 6, 8, 10};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102859);double[] expectedGeneratorUpperBounds = {4d/13d, 7d/13d, 9d/13d, 11d/13d, 1};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102860);double tol = 10E-12;
        __CLR4_4_127b127b1lb90pe6l.R.inc(102861);TestUtils.assertEquals(expectedBinUpperBounds, dist.getUpperBounds(), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102862);TestUtils.assertEquals(expectedGeneratorUpperBounds, dist.getGeneratorUpperBounds(), tol);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    @Test
    public void testGeneratorConfig() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ya4nq27db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testGeneratorConfig",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ya4nq27db(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(102863);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102864);double[] testData = {0, 1, 2, 3, 4};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102865);RandomGenerator generator = new RandomAdaptorTest.ConstantGenerator(0.5);
        
        __CLR4_4_127b127b1lb90pe6l.R.inc(102866);EmpiricalDistribution dist = new EmpiricalDistribution(5, generator);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102867);dist.load(testData);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102868);for (int i = 0; (((i < 5)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102869)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102870)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102871);Assert.assertEquals(2.0, dist.getNextValue(), 0d);
        }
        
        // Verify no NPE with null generator argument
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102872);dist = new EmpiricalDistribution(5, (RandomGenerator) null);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102873);dist.load(testData);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102874);dist.getNextValue();
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    @Test
    public void testReSeed() throws Exception {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhxedf27dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testReSeed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhxedf27dn() throws Exception{try{__CLR4_4_127b127b1lb90pe6l.R.inc(102875);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102876);empiricalDistribution.load(url);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102877);empiricalDistribution.reSeed(100);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102878);final double [] values = new double[10];
        __CLR4_4_127b127b1lb90pe6l.R.inc(102879);for (int i = 0; (((i < 10)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102880)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102881)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102882);values[i] = empiricalDistribution.getNextValue();
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102883);empiricalDistribution.reSeed(100);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102884);for (int i = 0; (((i < 10)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102885)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102886)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102887);Assert.assertEquals(values[i],empiricalDistribution.getNextValue(), 0d);
        }
    }}finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    private void verifySame(EmpiricalDistribution d1, EmpiricalDistribution d2) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102888);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102889);Assert.assertEquals(d1.isLoaded(), d2.isLoaded());
        __CLR4_4_127b127b1lb90pe6l.R.inc(102890);Assert.assertEquals(d1.getBinCount(), d2.getBinCount());
        __CLR4_4_127b127b1lb90pe6l.R.inc(102891);Assert.assertEquals(d1.getSampleStats(), d2.getSampleStats());
        __CLR4_4_127b127b1lb90pe6l.R.inc(102892);if ((((d1.isLoaded())&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102893)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102894)==0&false))) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102895);for (int i = 0;  (((i < d1.getUpperBounds().length)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102896)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102897)==0&false)); i++) {{
                __CLR4_4_127b127b1lb90pe6l.R.inc(102898);Assert.assertEquals(d1.getUpperBounds()[i], d2.getUpperBounds()[i], 0);
            }
            }__CLR4_4_127b127b1lb90pe6l.R.inc(102899);Assert.assertEquals(d1.getBinStats(), d2.getBinStats());
        }
    }}finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    private void tstGen(double tolerance)throws Exception {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102900);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102901);empiricalDistribution.load(url);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102902);empiricalDistribution.reSeed(1000);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102903);SummaryStatistics stats = new SummaryStatistics();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102904);for (int i = 1; (((i < 1000)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102905)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102906)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102907);stats.addValue(empiricalDistribution.getNextValue());
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102908);Assert.assertEquals("mean", 5.069831575018909, stats.getMean(),tolerance);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102909);Assert.assertEquals("std dev", 1.0173699343977738, stats.getStandardDeviation(),tolerance);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    private void tstDoubleGen(double tolerance)throws Exception {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102910);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102911);empiricalDistribution2.load(dataArray);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102912);empiricalDistribution2.reSeed(1000);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102913);SummaryStatistics stats = new SummaryStatistics();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102914);for (int i = 1; (((i < 1000)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102915)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102916)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102917);stats.addValue(empiricalDistribution2.getNextValue());
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102918);Assert.assertEquals("mean", 5.069831575018909, stats.getMean(), tolerance);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102919);Assert.assertEquals("std dev", 1.0173699343977738, stats.getStandardDeviation(), tolerance);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
   
    //  Setup for distribution tests
    
    @Override
    public RealDistribution makeDistribution() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102920);
        // Create a uniform distribution on [0, 10,000]
        __CLR4_4_127b127b1lb90pe6l.R.inc(102921);final double[] sourceData = new double[n + 1];
        __CLR4_4_127b127b1lb90pe6l.R.inc(102922);for (int i = 0; (((i < n + 1)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102923)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102924)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102925);sourceData[i] = i;
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102926);EmpiricalDistribution dist = new EmpiricalDistribution();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102927);dist.load(sourceData);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102928);return dist;
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    /** Uniform bin mass = 10/10001 == mass of all but the first bin */
    private final double binMass = 10d / (n + 1);
    
    /** Mass of first bin = 11/10001 */
    private final double firstBinMass = 11d / (n + 1);

    @Override
    public double[] makeCumulativeTestPoints() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102929);
       __CLR4_4_127b127b1lb90pe6l.R.inc(102930);final double[] testPoints = new double[] {9, 10, 15, 1000, 5004, 9999};
       __CLR4_4_127b127b1lb90pe6l.R.inc(102931);return testPoints;
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    

    @Override
    public double[] makeCumulativeTestValues() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102932);
        /* 
         * Bins should be [0, 10], (10, 20], ..., (9990, 10000]
         * Kernels should be N(4.5, 3.02765), N(14.5, 3.02765)...
         * Each bin should have mass 10/10000 = .001
         */
        __CLR4_4_127b127b1lb90pe6l.R.inc(102933);final double[] testPoints = getCumulativeTestPoints();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102934);final double[] cumValues = new double[testPoints.length];
        __CLR4_4_127b127b1lb90pe6l.R.inc(102935);final EmpiricalDistribution empiricalDistribution = (EmpiricalDistribution) makeDistribution();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102936);final double[] binBounds = empiricalDistribution.getUpperBounds();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102937);for (int i = 0; (((i < testPoints.length)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102938)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102939)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102940);final int bin = findBin(testPoints[i]);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102941);final double lower = (((bin == 0 )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102942)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102943)==0&false))? empiricalDistribution.getSupportLowerBound() :
                binBounds[bin - 1];
            __CLR4_4_127b127b1lb90pe6l.R.inc(102944);final double upper = binBounds[bin];
            // Compute bMinus = sum or mass of bins below the bin containing the point
            // First bin has mass 11 / 10000, the rest have mass 10 / 10000.
            __CLR4_4_127b127b1lb90pe6l.R.inc(102945);final double bMinus = (((bin == 0 )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102946)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102947)==0&false))? 0 : (bin - 1) * binMass + firstBinMass;
            __CLR4_4_127b127b1lb90pe6l.R.inc(102948);final RealDistribution kernel = findKernel(lower, upper);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102949);final double withinBinKernelMass = kernel.cumulativeProbability(lower, upper);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102950);final double kernelCum = kernel.cumulativeProbability(lower, testPoints[i]);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102951);cumValues[i] = bMinus + ((((bin == 0 )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102952)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102953)==0&false))? firstBinMass : binMass) * kernelCum/withinBinKernelMass;
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102954);return cumValues;
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

    @Override
    public double[] makeDensityTestValues() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102955);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102956);final double[] testPoints = getCumulativeTestPoints();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102957);final double[] densityValues = new double[testPoints.length];
        __CLR4_4_127b127b1lb90pe6l.R.inc(102958);final EmpiricalDistribution empiricalDistribution = (EmpiricalDistribution) makeDistribution();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102959);final double[] binBounds = empiricalDistribution.getUpperBounds();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102960);for (int i = 0; (((i < testPoints.length)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102961)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102962)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102963);final int bin = findBin(testPoints[i]);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102964);final double lower = (((bin == 0 )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102965)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102966)==0&false))? empiricalDistribution.getSupportLowerBound() :
                binBounds[bin - 1];
            __CLR4_4_127b127b1lb90pe6l.R.inc(102967);final double upper = binBounds[bin];
            __CLR4_4_127b127b1lb90pe6l.R.inc(102968);final RealDistribution kernel = findKernel(lower, upper);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102969);final double withinBinKernelMass = kernel.cumulativeProbability(lower, upper);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102970);final double density = kernel.density(testPoints[i]);
            __CLR4_4_127b127b1lb90pe6l.R.inc(102971);densityValues[i] = density * ((((bin == 0 )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102972)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102973)==0&false))? firstBinMass : binMass) / withinBinKernelMass;   
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(102974);return densityValues;
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    /** 
     * Modify test integration bounds from the default. Because the distribution
     * has discontinuities at bin boundaries, integrals spanning multiple bins
     * will face convergence problems.  Only test within-bin integrals and spans
     * across no more than 3 bin boundaries.
     */
    @Override
    @Test
    public void testDensityIntegrals() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),102975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy9wq027gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testDensityIntegrals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),102975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy9wq027gf(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(102975);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102976);final RealDistribution distribution = makeDistribution();
        __CLR4_4_127b127b1lb90pe6l.R.inc(102977);final double tol = 1.0e-9;
        __CLR4_4_127b127b1lb90pe6l.R.inc(102978);final BaseAbstractUnivariateIntegrator integrator =
            new IterativeLegendreGaussIntegrator(5, 1.0e-12, 1.0e-10);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102979);final UnivariateFunction d = new UnivariateFunction() {
            public double value(double x) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102980);
                __CLR4_4_127b127b1lb90pe6l.R.inc(102981);return distribution.density(x);
            }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        };
        __CLR4_4_127b127b1lb90pe6l.R.inc(102982);final double[] lower = {0, 5, 1000, 5001, 9995};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102983);final double[] upper = {5, 12, 1030, 5010, 10000};
        __CLR4_4_127b127b1lb90pe6l.R.inc(102984);for (int i = 1; (((i < 5)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102985)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102986)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102987);Assert.assertEquals(
                    distribution.cumulativeProbability( 
                            lower[i], upper[i]),
                            integrator.integrate(
                                    1000000, // Triangle integrals are very slow to converge
                                    d, lower[i], upper[i]), tol);
        }
    }}finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    /**
     * Find the bin that x belongs (relative to {@link #makeDistribution()}).
     */
    private int findBin(double x) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102988);
        // Number of bins below x should be trunc(x/10)
        __CLR4_4_127b127b1lb90pe6l.R.inc(102989);final double nMinus = Math.floor(x / 10);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102990);final int bin =  (int) Math.round(nMinus);
        // If x falls on a bin boundary, it is in the lower bin
        __CLR4_4_127b127b1lb90pe6l.R.inc(102991);return (((Math.floor(x / 10) == x / 10 )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102992)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102993)==0&false))? bin - 1 : bin;
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    /**
     * Find the within-bin kernel for the bin with lower bound lower
     * and upper bound upper. All bins other than the first contain 10 points
     * exclusive of the lower bound and are centered at (lower + upper + 1) / 2.
     * The first bin includes its lower bound, 0, so has different mean and
     * standard deviation.
     */
    private RealDistribution findKernel(double lower, double upper) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(102994);
        __CLR4_4_127b127b1lb90pe6l.R.inc(102995);if ((((lower < 1)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(102996)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(102997)==0&false))) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102998);return new NormalDistribution(5d, 3.3166247903554);
        } }else {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(102999);return new NormalDistribution((upper + lower + 1) / 2d, 3.0276503540974917); 
        }
    }}finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    @Test
    public void testKernelOverrideConstant() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),103000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kdcq6e27h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testKernelOverrideConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103000,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kdcq6e27h4(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(103000);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103001);final EmpiricalDistribution dist = new ConstantKernelEmpiricalDistribution(5);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103002);final double[] data = {1d,2d,3d, 4d,5d,6d, 7d,8d,9d, 10d,11d,12d, 13d,14d,15d};
        __CLR4_4_127b127b1lb90pe6l.R.inc(103003);dist.load(data);
        // Bin masses concentrated on 2, 5, 8, 11, 14 <- effectively discrete uniform distribution over these
        __CLR4_4_127b127b1lb90pe6l.R.inc(103004);double[] values = {2d, 5d, 8d, 11d, 14d};
        __CLR4_4_127b127b1lb90pe6l.R.inc(103005);for (int i = 0; (((i < 20)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(103006)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(103007)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(103008);Assert.assertTrue(Arrays.binarySearch(values, dist.sample()) >= 0);
        }
        }__CLR4_4_127b127b1lb90pe6l.R.inc(103009);final double tol = 10E-12;
        __CLR4_4_127b127b1lb90pe6l.R.inc(103010);Assert.assertEquals(0.0, dist.cumulativeProbability(1), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103011);Assert.assertEquals(0.2, dist.cumulativeProbability(2), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103012);Assert.assertEquals(0.6, dist.cumulativeProbability(10), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103013);Assert.assertEquals(0.8, dist.cumulativeProbability(12), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103014);Assert.assertEquals(0.8, dist.cumulativeProbability(13), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103015);Assert.assertEquals(1.0, dist.cumulativeProbability(15), tol);

        __CLR4_4_127b127b1lb90pe6l.R.inc(103016);Assert.assertEquals(2.0, dist.inverseCumulativeProbability(0.1), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103017);Assert.assertEquals(2.0, dist.inverseCumulativeProbability(0.2), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103018);Assert.assertEquals(5.0, dist.inverseCumulativeProbability(0.3), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103019);Assert.assertEquals(5.0, dist.inverseCumulativeProbability(0.4), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103020);Assert.assertEquals(8.0, dist.inverseCumulativeProbability(0.5), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103021);Assert.assertEquals(8.0, dist.inverseCumulativeProbability(0.6), tol);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    @Test
    public void testKernelOverrideUniform() {__CLR4_4_127b127b1lb90pe6l.R.globalSliceStart(getClass().getName(),103022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iq37y827hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_127b127b1lb90pe6l.R.rethrow($CLV_t2$);}finally{__CLR4_4_127b127b1lb90pe6l.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.random.EmpiricalDistributionTest.testKernelOverrideUniform",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),103022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iq37y827hq(){try{__CLR4_4_127b127b1lb90pe6l.R.inc(103022);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103023);final EmpiricalDistribution dist = new UniformKernelEmpiricalDistribution(5);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103024);final double[] data = {1d,2d,3d, 4d,5d,6d, 7d,8d,9d, 10d,11d,12d, 13d,14d,15d};
        __CLR4_4_127b127b1lb90pe6l.R.inc(103025);dist.load(data);
        // Kernels are uniform distributions on [1,3], [4,6], [7,9], [10,12], [13,15]
        __CLR4_4_127b127b1lb90pe6l.R.inc(103026);final double bounds[] = {3d, 6d, 9d, 12d};
        __CLR4_4_127b127b1lb90pe6l.R.inc(103027);final double tol = 10E-12; 
        __CLR4_4_127b127b1lb90pe6l.R.inc(103028);for (int i = 0; (((i < 20)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(103029)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(103030)==0&false)); i++) {{
            __CLR4_4_127b127b1lb90pe6l.R.inc(103031);final double v = dist.sample();
            // Make sure v is not in the excluded range between bins - that is (bounds[i], bounds[i] + 1)
            __CLR4_4_127b127b1lb90pe6l.R.inc(103032);for (int j = 0; (((j < bounds.length)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(103033)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(103034)==0&false)); j++) {{
                __CLR4_4_127b127b1lb90pe6l.R.inc(103035);Assert.assertFalse(v > bounds[j] + tol && v < bounds[j] + 1 - tol);
            }
        }}   
        }__CLR4_4_127b127b1lb90pe6l.R.inc(103036);Assert.assertEquals(0.0, dist.cumulativeProbability(1), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103037);Assert.assertEquals(0.1, dist.cumulativeProbability(2), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103038);Assert.assertEquals(0.6, dist.cumulativeProbability(10), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103039);Assert.assertEquals(0.8, dist.cumulativeProbability(12), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103040);Assert.assertEquals(0.8, dist.cumulativeProbability(13), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103041);Assert.assertEquals(1.0, dist.cumulativeProbability(15), tol);

        __CLR4_4_127b127b1lb90pe6l.R.inc(103042);Assert.assertEquals(2.0, dist.inverseCumulativeProbability(0.1), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103043);Assert.assertEquals(3.0, dist.inverseCumulativeProbability(0.2), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103044);Assert.assertEquals(5.0, dist.inverseCumulativeProbability(0.3), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103045);Assert.assertEquals(6.0, dist.inverseCumulativeProbability(0.4), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103046);Assert.assertEquals(8.0, dist.inverseCumulativeProbability(0.5), tol);
        __CLR4_4_127b127b1lb90pe6l.R.inc(103047);Assert.assertEquals(9.0, dist.inverseCumulativeProbability(0.6), tol);
    }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    
    
    /**
     * Empirical distribution using a constant smoothing kernel.
     */
    private class ConstantKernelEmpiricalDistribution extends EmpiricalDistribution {
        private static final long serialVersionUID = 1L;
        public ConstantKernelEmpiricalDistribution(int i) {
            super(i);__CLR4_4_127b127b1lb90pe6l.R.inc(103049);try{__CLR4_4_127b127b1lb90pe6l.R.inc(103048);
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        // Use constant distribution equal to bin mean within bin
        @Override
        protected RealDistribution getKernel(SummaryStatistics bStats) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103050);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103051);return new ConstantDistribution(bStats.getMean());
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    }
    
    /**
     * Empirical distribution using a uniform smoothing kernel.
     */
    private class UniformKernelEmpiricalDistribution extends EmpiricalDistribution {
        private static final long serialVersionUID = 2963149194515159653L;
        public UniformKernelEmpiricalDistribution(int i) {
            super(i);__CLR4_4_127b127b1lb90pe6l.R.inc(103053);try{__CLR4_4_127b127b1lb90pe6l.R.inc(103052);
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        @Override
        protected RealDistribution getKernel(SummaryStatistics bStats) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103054);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103055);return new UniformRealDistribution(randomData.getRandomGenerator(), bStats.getMin(), bStats.getMax(),
                    UniformRealDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY);
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
    }
    
    /**
     * Distribution that takes just one value.
     */
    private class ConstantDistribution extends AbstractRealDistribution {
        private static final long serialVersionUID = 1L;
        
        /** Singleton value in the sample space */
        private final double c;
        
        public ConstantDistribution(double c) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103056);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103057);this.c = c;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        
        public double density(double x) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103058);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103059);return 0;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public double cumulativeProbability(double x) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103060);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103061);return (((x < c )&&(__CLR4_4_127b127b1lb90pe6l.R.iget(103062)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(103063)==0&false))? 0 : 1;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        
        @Override
        public double inverseCumulativeProbability(double p) {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103064);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103065);if ((((p < 0.0 || p > 1.0)&&(__CLR4_4_127b127b1lb90pe6l.R.iget(103066)!=0|true))||(__CLR4_4_127b127b1lb90pe6l.R.iget(103067)==0&false))) {{
                __CLR4_4_127b127b1lb90pe6l.R.inc(103068);throw new OutOfRangeException(p, 0, 1);
            }
            }__CLR4_4_127b127b1lb90pe6l.R.inc(103069);return c;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public double getNumericalMean() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103070);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103071);return c;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public double getNumericalVariance() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103072);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103073);return 0;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public double getSupportLowerBound() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103074);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103075);return c;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public double getSupportUpperBound() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103076);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103077);return c;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public boolean isSupportLowerBoundInclusive() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103078);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103079);return false;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public boolean isSupportUpperBoundInclusive() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103080);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103081);return true;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}

        public boolean isSupportConnected() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103082);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103083);return true;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        
        @Override
        public double sample() {try{__CLR4_4_127b127b1lb90pe6l.R.inc(103084);
            __CLR4_4_127b127b1lb90pe6l.R.inc(103085);return c;
        }finally{__CLR4_4_127b127b1lb90pe6l.R.flushNeeded();}}
        
    }
}
