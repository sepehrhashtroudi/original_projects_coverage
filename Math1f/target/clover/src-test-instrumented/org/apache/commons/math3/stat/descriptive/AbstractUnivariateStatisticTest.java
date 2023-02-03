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
package org.apache.commons.math3.stat.descriptive;


import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for AbstractUnivariateStatistic
 *
 * @version $Id$
 */
public class AbstractUnivariateStatisticTest {static class __CLR4_4_12a632a63lb90pelx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106528,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected double[] testArray = {0, 1, 2, 3, 4, 5};
    protected double[] testWeightsArray = {0.3, 0.2, 1.3, 1.1, 1.0, 1.8};
    protected double[] testNegativeWeightsArray = {-0.3, 0.2, -1.3, 1.1, 1.0, 1.8};
    protected double[] nullArray = null;
    protected double[] singletonArray = {0};
    protected Mean testStatistic = new Mean();

    @Test
    public void testTestPositive() {__CLR4_4_12a632a63lb90pelx.R.globalSliceStart(getClass().getName(),106491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oeoohw2a63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a632a63lb90pelx.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a632a63lb90pelx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatisticTest.testTestPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oeoohw2a63(){try{__CLR4_4_12a632a63lb90pelx.R.inc(106491);
        __CLR4_4_12a632a63lb90pelx.R.inc(106492);for (int j = 0; (((j < 6)&&(__CLR4_4_12a632a63lb90pelx.R.iget(106493)!=0|true))||(__CLR4_4_12a632a63lb90pelx.R.iget(106494)==0&false)); j++) {{
            __CLR4_4_12a632a63lb90pelx.R.inc(106495);for (int i = 1; (((i < (7 - j))&&(__CLR4_4_12a632a63lb90pelx.R.iget(106496)!=0|true))||(__CLR4_4_12a632a63lb90pelx.R.iget(106497)==0&false)); i++) {{
                __CLR4_4_12a632a63lb90pelx.R.inc(106498);Assert.assertTrue(testStatistic.test(testArray, 0, i));
            }
        }}
        }__CLR4_4_12a632a63lb90pelx.R.inc(106499);Assert.assertTrue(testStatistic.test(singletonArray, 0, 1));
        __CLR4_4_12a632a63lb90pelx.R.inc(106500);Assert.assertTrue(testStatistic.test(singletonArray, 0, 0, true));
    }finally{__CLR4_4_12a632a63lb90pelx.R.flushNeeded();}}

    @Test
    public void testTestNegative() {__CLR4_4_12a632a63lb90pelx.R.globalSliceStart(getClass().getName(),106501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13xxdc02a6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12a632a63lb90pelx.R.rethrow($CLV_t2$);}finally{__CLR4_4_12a632a63lb90pelx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatisticTest.testTestNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13xxdc02a6d(){try{__CLR4_4_12a632a63lb90pelx.R.inc(106501);
        __CLR4_4_12a632a63lb90pelx.R.inc(106502);Assert.assertFalse(testStatistic.test(singletonArray, 0, 0));
        __CLR4_4_12a632a63lb90pelx.R.inc(106503);Assert.assertFalse(testStatistic.test(testArray, 0, 0));
        __CLR4_4_12a632a63lb90pelx.R.inc(106504);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106505);testStatistic.test(singletonArray, 2, 1);  // start past end
            __CLR4_4_12a632a63lb90pelx.R.inc(106506);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106507);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106508);testStatistic.test(testArray, 0, 7);  // end past end
            __CLR4_4_12a632a63lb90pelx.R.inc(106509);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106510);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106511);testStatistic.test(testArray, -1, 1);  // start negative
            __CLR4_4_12a632a63lb90pelx.R.inc(106512);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106513);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106514);testStatistic.test(testArray, 0, -1);  // length negative
            __CLR4_4_12a632a63lb90pelx.R.inc(106515);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106516);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106517);testStatistic.test(nullArray, 0, 1);  // null array
            __CLR4_4_12a632a63lb90pelx.R.inc(106518);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106519);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106520);testStatistic.test(testArray, nullArray, 0, 1);  // null weights array
            __CLR4_4_12a632a63lb90pelx.R.inc(106521);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106522);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106523);testStatistic.test(singletonArray, testWeightsArray, 0, 1);  // weights.length != value.length
            __CLR4_4_12a632a63lb90pelx.R.inc(106524);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12a632a63lb90pelx.R.inc(106525);try {
            __CLR4_4_12a632a63lb90pelx.R.inc(106526);testStatistic.test(testArray, testNegativeWeightsArray, 0, 6);  // can't have negative weights
            __CLR4_4_12a632a63lb90pelx.R.inc(106527);Assert.fail("Expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12a632a63lb90pelx.R.flushNeeded();}}
}
