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
package org.apache.commons.math3.stat.inference;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the OneWayAnovaImpl class.
 *
 * @version $Id$
 */

public class OneWayAnovaTest {static class __CLR4_4_12boy2boylb90pepu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,108526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected OneWayAnova testStatistic = new OneWayAnova();

    private double[] emptyArray = {};

    private double[] classA =
            {93.0, 103.0, 95.0, 101.0, 91.0, 105.0, 96.0, 94.0, 101.0 };
    private double[] classB =
            {99.0, 92.0, 102.0, 100.0, 102.0, 89.0 };
    private double[] classC =
            {110.0, 115.0, 111.0, 117.0, 128.0, 117.0 };

    @Test
    public void testAnovaFValue() {__CLR4_4_12boy2boylb90pepu.R.globalSliceStart(getClass().getName(),108466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11zc1pp2boy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12boy2boylb90pepu.R.rethrow($CLV_t2$);}finally{__CLR4_4_12boy2boylb90pepu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.OneWayAnovaTest.testAnovaFValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11zc1pp2boy(){try{__CLR4_4_12boy2boylb90pepu.R.inc(108466);
        // Target comparison values computed using R version 2.6.0 (Linux version)
        __CLR4_4_12boy2boylb90pepu.R.inc(108467);List<double[]> threeClasses = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108468);threeClasses.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108469);threeClasses.add(classB);
        __CLR4_4_12boy2boylb90pepu.R.inc(108470);threeClasses.add(classC);

        __CLR4_4_12boy2boylb90pepu.R.inc(108471);Assert.assertEquals("ANOVA F-value",  24.67361709460624,
                 testStatistic.anovaFValue(threeClasses), 1E-12);

        __CLR4_4_12boy2boylb90pepu.R.inc(108472);List<double[]> twoClasses = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108473);twoClasses.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108474);twoClasses.add(classB);

        __CLR4_4_12boy2boylb90pepu.R.inc(108475);Assert.assertEquals("ANOVA F-value",  0.0150579150579,
                 testStatistic.anovaFValue(twoClasses), 1E-12);

        __CLR4_4_12boy2boylb90pepu.R.inc(108476);List<double[]> emptyContents = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108477);emptyContents.add(emptyArray);
        __CLR4_4_12boy2boylb90pepu.R.inc(108478);emptyContents.add(classC);
        __CLR4_4_12boy2boylb90pepu.R.inc(108479);try {
            __CLR4_4_12boy2boylb90pepu.R.inc(108480);testStatistic.anovaFValue(emptyContents);
            __CLR4_4_12boy2boylb90pepu.R.inc(108481);Assert.fail("empty array for key classX, MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_12boy2boylb90pepu.R.inc(108482);List<double[]> tooFew = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108483);tooFew.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108484);try {
            __CLR4_4_12boy2boylb90pepu.R.inc(108485);testStatistic.anovaFValue(tooFew);
            __CLR4_4_12boy2boylb90pepu.R.inc(108486);Assert.fail("less than two classes, MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12boy2boylb90pepu.R.flushNeeded();}}


    @Test
    public void testAnovaPValue() {__CLR4_4_12boy2boylb90pepu.R.globalSliceStart(getClass().getName(),108487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8wgkd2bpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12boy2boylb90pepu.R.rethrow($CLV_t2$);}finally{__CLR4_4_12boy2boylb90pepu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.OneWayAnovaTest.testAnovaPValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8wgkd2bpj(){try{__CLR4_4_12boy2boylb90pepu.R.inc(108487);
        // Target comparison values computed using R version 2.6.0 (Linux version)
        __CLR4_4_12boy2boylb90pepu.R.inc(108488);List<double[]> threeClasses = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108489);threeClasses.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108490);threeClasses.add(classB);
        __CLR4_4_12boy2boylb90pepu.R.inc(108491);threeClasses.add(classC);

        __CLR4_4_12boy2boylb90pepu.R.inc(108492);Assert.assertEquals("ANOVA P-value", 6.959446E-06,
                 testStatistic.anovaPValue(threeClasses), 1E-12);

        __CLR4_4_12boy2boylb90pepu.R.inc(108493);List<double[]> twoClasses = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108494);twoClasses.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108495);twoClasses.add(classB);

        __CLR4_4_12boy2boylb90pepu.R.inc(108496);Assert.assertEquals("ANOVA P-value",  0.904212960464,
                 testStatistic.anovaPValue(twoClasses), 1E-12);

    }finally{__CLR4_4_12boy2boylb90pepu.R.flushNeeded();}}

    @Test
    public void testAnovaPValueSummaryStatistics() {__CLR4_4_12boy2boylb90pepu.R.globalSliceStart(getClass().getName(),108497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyd5g2bpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12boy2boylb90pepu.R.rethrow($CLV_t2$);}finally{__CLR4_4_12boy2boylb90pepu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.OneWayAnovaTest.testAnovaPValueSummaryStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyd5g2bpt(){try{__CLR4_4_12boy2boylb90pepu.R.inc(108497);
        // Target comparison values computed using R version 2.6.0 (Linux version)
        __CLR4_4_12boy2boylb90pepu.R.inc(108498);List<SummaryStatistics> threeClasses = new ArrayList<SummaryStatistics>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108499);SummaryStatistics statsA = new SummaryStatistics();
        __CLR4_4_12boy2boylb90pepu.R.inc(108500);for (double a : classA) {{
            __CLR4_4_12boy2boylb90pepu.R.inc(108501);statsA.addValue(a);
        }
        }__CLR4_4_12boy2boylb90pepu.R.inc(108502);threeClasses.add(statsA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108503);SummaryStatistics statsB = new SummaryStatistics();
        __CLR4_4_12boy2boylb90pepu.R.inc(108504);for (double b : classB) {{
            __CLR4_4_12boy2boylb90pepu.R.inc(108505);statsB.addValue(b);
        }
        }__CLR4_4_12boy2boylb90pepu.R.inc(108506);threeClasses.add(statsB);
        __CLR4_4_12boy2boylb90pepu.R.inc(108507);SummaryStatistics statsC = new SummaryStatistics();
        __CLR4_4_12boy2boylb90pepu.R.inc(108508);for (double c : classC) {{
            __CLR4_4_12boy2boylb90pepu.R.inc(108509);statsC.addValue(c);
        }
        }__CLR4_4_12boy2boylb90pepu.R.inc(108510);threeClasses.add(statsC);

        __CLR4_4_12boy2boylb90pepu.R.inc(108511);Assert.assertEquals("ANOVA P-value", 6.959446E-06,
                 testStatistic.anovaPValue(threeClasses, true), 1E-12);

        __CLR4_4_12boy2boylb90pepu.R.inc(108512);List<SummaryStatistics> twoClasses = new ArrayList<SummaryStatistics>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108513);twoClasses.add(statsA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108514);twoClasses.add(statsB);

        __CLR4_4_12boy2boylb90pepu.R.inc(108515);Assert.assertEquals("ANOVA P-value",  0.904212960464,
                 testStatistic.anovaPValue(twoClasses, false), 1E-12);

    }finally{__CLR4_4_12boy2boylb90pepu.R.flushNeeded();}}

    @Test
    public void testAnovaTest() {__CLR4_4_12boy2boylb90pepu.R.globalSliceStart(getClass().getName(),108516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gm3jbg2bqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12boy2boylb90pepu.R.rethrow($CLV_t2$);}finally{__CLR4_4_12boy2boylb90pepu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.inference.OneWayAnovaTest.testAnovaTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),108516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gm3jbg2bqc(){try{__CLR4_4_12boy2boylb90pepu.R.inc(108516);
        // Target comparison values computed using R version 2.3.1 (Linux version)
        __CLR4_4_12boy2boylb90pepu.R.inc(108517);List<double[]> threeClasses = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108518);threeClasses.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108519);threeClasses.add(classB);
        __CLR4_4_12boy2boylb90pepu.R.inc(108520);threeClasses.add(classC);

        __CLR4_4_12boy2boylb90pepu.R.inc(108521);Assert.assertTrue("ANOVA Test P<0.01", testStatistic.anovaTest(threeClasses, 0.01));

        __CLR4_4_12boy2boylb90pepu.R.inc(108522);List<double[]> twoClasses = new ArrayList<double[]>();
        __CLR4_4_12boy2boylb90pepu.R.inc(108523);twoClasses.add(classA);
        __CLR4_4_12boy2boylb90pepu.R.inc(108524);twoClasses.add(classB);

        __CLR4_4_12boy2boylb90pepu.R.inc(108525);Assert.assertFalse("ANOVA Test P>0.01", testStatistic.anovaTest(twoClasses, 0.01));
    }finally{__CLR4_4_12boy2boylb90pepu.R.flushNeeded();}}

}
