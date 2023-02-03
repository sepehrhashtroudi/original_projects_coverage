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
package org.apache.commons.math3.stat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;
import org.junit.Assert;
import org.junit.Test;

/**
 * Certified data test cases.
 * @version $Id$
 */
public class CertifiedDataTest {static class __CLR4_4_1298k298klb90peix{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,105357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected double mean = Double.NaN;

    protected double std = Double.NaN;

    /**
     * Test SummaryStatistics - implementations that do not store the data
     * and use single pass algorithms to compute statistics
    */
    @Test
    public void testSummaryStatistics() throws Exception {__CLR4_4_1298k298klb90peix.R.globalSliceStart(getClass().getName(),105284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1542p26298k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1298k298klb90peix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1298k298klb90peix.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.CertifiedDataTest.testSummaryStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1542p26298k() throws Exception{try{__CLR4_4_1298k298klb90peix.R.inc(105284);
        __CLR4_4_1298k298klb90peix.R.inc(105285);SummaryStatistics u = new SummaryStatistics();
        __CLR4_4_1298k298klb90peix.R.inc(105286);loadStats("data/PiDigits.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105287);Assert.assertEquals("PiDigits: std", std, u.getStandardDeviation(), 1E-13);
        __CLR4_4_1298k298klb90peix.R.inc(105288);Assert.assertEquals("PiDigits: mean", mean, u.getMean(), 1E-13);

        __CLR4_4_1298k298klb90peix.R.inc(105289);loadStats("data/Mavro.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105290);Assert.assertEquals("Mavro: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105291);Assert.assertEquals("Mavro: mean", mean, u.getMean(), 1E-14);

        __CLR4_4_1298k298klb90peix.R.inc(105292);loadStats("data/Michelso.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105293);Assert.assertEquals("Michelso: std", std, u.getStandardDeviation(), 1E-13);
        __CLR4_4_1298k298klb90peix.R.inc(105294);Assert.assertEquals("Michelso: mean", mean, u.getMean(), 1E-13);

        __CLR4_4_1298k298klb90peix.R.inc(105295);loadStats("data/NumAcc1.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105296);Assert.assertEquals("NumAcc1: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105297);Assert.assertEquals("NumAcc1: mean", mean, u.getMean(), 1E-14);

        __CLR4_4_1298k298klb90peix.R.inc(105298);loadStats("data/NumAcc2.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105299);Assert.assertEquals("NumAcc2: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105300);Assert.assertEquals("NumAcc2: mean", mean, u.getMean(), 1E-14);
    }finally{__CLR4_4_1298k298klb90peix.R.flushNeeded();}}

    /**
     * Test DescriptiveStatistics - implementations that store full array of
     * values and execute multi-pass algorithms
     */
    @Test
    public void testDescriptiveStatistics() throws Exception {__CLR4_4_1298k298klb90peix.R.globalSliceStart(getClass().getName(),105301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvdtbw2991();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1298k298klb90peix.R.rethrow($CLV_t2$);}finally{__CLR4_4_1298k298klb90peix.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.CertifiedDataTest.testDescriptiveStatistics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvdtbw2991() throws Exception{try{__CLR4_4_1298k298klb90peix.R.inc(105301);

        __CLR4_4_1298k298klb90peix.R.inc(105302);DescriptiveStatistics u = new DescriptiveStatistics();

        __CLR4_4_1298k298klb90peix.R.inc(105303);loadStats("data/PiDigits.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105304);Assert.assertEquals("PiDigits: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105305);Assert.assertEquals("PiDigits: mean", mean, u.getMean(), 1E-14);

        __CLR4_4_1298k298klb90peix.R.inc(105306);loadStats("data/Mavro.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105307);Assert.assertEquals("Mavro: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105308);Assert.assertEquals("Mavro: mean", mean, u.getMean(), 1E-14);

        __CLR4_4_1298k298klb90peix.R.inc(105309);loadStats("data/Michelso.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105310);Assert.assertEquals("Michelso: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105311);Assert.assertEquals("Michelso: mean", mean, u.getMean(), 1E-14);

        __CLR4_4_1298k298klb90peix.R.inc(105312);loadStats("data/NumAcc1.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105313);Assert.assertEquals("NumAcc1: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105314);Assert.assertEquals("NumAcc1: mean", mean, u.getMean(), 1E-14);

        __CLR4_4_1298k298klb90peix.R.inc(105315);loadStats("data/NumAcc2.txt", u);
        __CLR4_4_1298k298klb90peix.R.inc(105316);Assert.assertEquals("NumAcc2: std", std, u.getStandardDeviation(), 1E-14);
        __CLR4_4_1298k298klb90peix.R.inc(105317);Assert.assertEquals("NumAcc2: mean", mean, u.getMean(), 1E-14);
    }finally{__CLR4_4_1298k298klb90peix.R.flushNeeded();}}

    /**
     * loads a DescriptiveStatistics off of a test file
     * @param file
     * @param statistical summary
     */
    private void loadStats(String resource, Object u) throws Exception {try{__CLR4_4_1298k298klb90peix.R.inc(105318);

        __CLR4_4_1298k298klb90peix.R.inc(105319);DescriptiveStatistics d = null;
        __CLR4_4_1298k298klb90peix.R.inc(105320);SummaryStatistics s = null;
        __CLR4_4_1298k298klb90peix.R.inc(105321);if ((((u instanceof DescriptiveStatistics)&&(__CLR4_4_1298k298klb90peix.R.iget(105322)!=0|true))||(__CLR4_4_1298k298klb90peix.R.iget(105323)==0&false))) {{
            __CLR4_4_1298k298klb90peix.R.inc(105324);d = (DescriptiveStatistics) u;
        } }else {{
            __CLR4_4_1298k298klb90peix.R.inc(105325);s = (SummaryStatistics) u;
        }
        }__CLR4_4_1298k298klb90peix.R.inc(105326);u.getClass().getDeclaredMethod(
                "clear", new Class[]{}).invoke(u, new Object[]{});
        __CLR4_4_1298k298klb90peix.R.inc(105327);mean = Double.NaN;
        __CLR4_4_1298k298klb90peix.R.inc(105328);std = Double.NaN;

        __CLR4_4_1298k298klb90peix.R.inc(105329);InputStream resourceAsStream = CertifiedDataTest.class.getResourceAsStream(resource);
        __CLR4_4_1298k298klb90peix.R.inc(105330);Assert.assertNotNull("Could not find resource "+resource,resourceAsStream);
        __CLR4_4_1298k298klb90peix.R.inc(105331);BufferedReader in =
            new BufferedReader(
                    new InputStreamReader(
                            resourceAsStream));

        __CLR4_4_1298k298klb90peix.R.inc(105332);String line = null;

        __CLR4_4_1298k298klb90peix.R.inc(105333);for (int j = 0; (((j < 60)&&(__CLR4_4_1298k298klb90peix.R.iget(105334)!=0|true))||(__CLR4_4_1298k298klb90peix.R.iget(105335)==0&false)); j++) {{
            __CLR4_4_1298k298klb90peix.R.inc(105336);line = in.readLine();
            __CLR4_4_1298k298klb90peix.R.inc(105337);if ((((j == 40)&&(__CLR4_4_1298k298klb90peix.R.iget(105338)!=0|true))||(__CLR4_4_1298k298klb90peix.R.iget(105339)==0&false))) {{
                __CLR4_4_1298k298klb90peix.R.inc(105340);mean =
                    Double.parseDouble(
                            line.substring(line.lastIndexOf(":") + 1).trim());
            }
            }__CLR4_4_1298k298klb90peix.R.inc(105341);if ((((j == 41)&&(__CLR4_4_1298k298klb90peix.R.iget(105342)!=0|true))||(__CLR4_4_1298k298klb90peix.R.iget(105343)==0&false))) {{
                __CLR4_4_1298k298klb90peix.R.inc(105344);std =
                    Double.parseDouble(
                            line.substring(line.lastIndexOf(":") + 1).trim());
            }
        }}

        }__CLR4_4_1298k298klb90peix.R.inc(105345);line = in.readLine();

        __CLR4_4_1298k298klb90peix.R.inc(105346);while ((((line != null)&&(__CLR4_4_1298k298klb90peix.R.iget(105347)!=0|true))||(__CLR4_4_1298k298klb90peix.R.iget(105348)==0&false))) {{
            __CLR4_4_1298k298klb90peix.R.inc(105349);if ((((d != null)&&(__CLR4_4_1298k298klb90peix.R.iget(105350)!=0|true))||(__CLR4_4_1298k298klb90peix.R.iget(105351)==0&false))) {{
                __CLR4_4_1298k298klb90peix.R.inc(105352);d.addValue(Double.parseDouble(line.trim()));
            }  }else {{
                __CLR4_4_1298k298klb90peix.R.inc(105353);s.addValue(Double.parseDouble(line.trim()));
            }
            }__CLR4_4_1298k298klb90peix.R.inc(105354);line = in.readLine();
        }

        }__CLR4_4_1298k298klb90peix.R.inc(105355);resourceAsStream.close();
        __CLR4_4_1298k298klb90peix.R.inc(105356);in.close();
    }finally{__CLR4_4_1298k298klb90peix.R.flushNeeded();}}
}
