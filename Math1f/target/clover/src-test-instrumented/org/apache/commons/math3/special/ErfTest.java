/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.commons.math3.special;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;

import org.junit.Test;
import org.junit.Assert;

/**
 * @version $Id$
 */
public class ErfTest {static class __CLR4_4_129102910lb90pei9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,105142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testErf0() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jw5ao2910();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErf0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jw5ao2910(){try{__CLR4_4_129102910lb90pei9.R.inc(105012);
        __CLR4_4_129102910lb90pei9.R.inc(105013);double actual = Erf.erf(0.0);
        __CLR4_4_129102910lb90pei9.R.inc(105014);double expected = 0.0;
        __CLR4_4_129102910lb90pei9.R.inc(105015);Assert.assertEquals(expected, actual, 1.0e-15);
        __CLR4_4_129102910lb90pei9.R.inc(105016);Assert.assertEquals(1 - expected, Erf.erfc(0.0), 1.0e-15);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErf1960() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1afdonk2915();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErf1960",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1afdonk2915(){try{__CLR4_4_129102910lb90pei9.R.inc(105017);
        __CLR4_4_129102910lb90pei9.R.inc(105018);double x = 1.960 / FastMath.sqrt(2.0);
        __CLR4_4_129102910lb90pei9.R.inc(105019);double actual = Erf.erf(x);
        __CLR4_4_129102910lb90pei9.R.inc(105020);double expected = 0.95;
        __CLR4_4_129102910lb90pei9.R.inc(105021);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105022);Assert.assertEquals(1 - actual, Erf.erfc(x), 1.0e-15);

        __CLR4_4_129102910lb90pei9.R.inc(105023);actual = Erf.erf(-x);
        __CLR4_4_129102910lb90pei9.R.inc(105024);expected = -expected;
        __CLR4_4_129102910lb90pei9.R.inc(105025);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105026);Assert.assertEquals(1 - actual, Erf.erfc(-x), 1.0e-15);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErf2576() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iujmog291f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErf2576",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iujmog291f(){try{__CLR4_4_129102910lb90pei9.R.inc(105027);
        __CLR4_4_129102910lb90pei9.R.inc(105028);double x = 2.576 / FastMath.sqrt(2.0);
        __CLR4_4_129102910lb90pei9.R.inc(105029);double actual = Erf.erf(x);
        __CLR4_4_129102910lb90pei9.R.inc(105030);double expected = 0.99;
        __CLR4_4_129102910lb90pei9.R.inc(105031);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105032);Assert.assertEquals(1 - actual, Erf.erfc(x), 1e-15);

        __CLR4_4_129102910lb90pei9.R.inc(105033);actual = Erf.erf(-x);
        __CLR4_4_129102910lb90pei9.R.inc(105034);expected = -expected;
        __CLR4_4_129102910lb90pei9.R.inc(105035);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105036);Assert.assertEquals(1 - actual, Erf.erfc(-x), 1.0e-15);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErf2807() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gxrwcl291p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErf2807",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gxrwcl291p(){try{__CLR4_4_129102910lb90pei9.R.inc(105037);
        __CLR4_4_129102910lb90pei9.R.inc(105038);double x = 2.807 / FastMath.sqrt(2.0);
        __CLR4_4_129102910lb90pei9.R.inc(105039);double actual = Erf.erf(x);
        __CLR4_4_129102910lb90pei9.R.inc(105040);double expected = 0.995;
        __CLR4_4_129102910lb90pei9.R.inc(105041);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105042);Assert.assertEquals(1 - actual, Erf.erfc(x), 1.0e-15);

        __CLR4_4_129102910lb90pei9.R.inc(105043);actual = Erf.erf(-x);
        __CLR4_4_129102910lb90pei9.R.inc(105044);expected = -expected;
        __CLR4_4_129102910lb90pei9.R.inc(105045);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105046);Assert.assertEquals(1 - actual, Erf.erfc(-x), 1.0e-15);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErf3291() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zfozq3291z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErf3291",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zfozq3291z(){try{__CLR4_4_129102910lb90pei9.R.inc(105047);
        __CLR4_4_129102910lb90pei9.R.inc(105048);double x = 3.291 / FastMath.sqrt(2.0);
        __CLR4_4_129102910lb90pei9.R.inc(105049);double actual = Erf.erf(x);
        __CLR4_4_129102910lb90pei9.R.inc(105050);double expected = 0.999;
        __CLR4_4_129102910lb90pei9.R.inc(105051);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105052);Assert.assertEquals(1 - expected, Erf.erfc(x), 1.0e-5);

        __CLR4_4_129102910lb90pei9.R.inc(105053);actual = Erf.erf(-x);
        __CLR4_4_129102910lb90pei9.R.inc(105054);expected = -expected;
        __CLR4_4_129102910lb90pei9.R.inc(105055);Assert.assertEquals(expected, actual, 1.0e-5);
        __CLR4_4_129102910lb90pei9.R.inc(105056);Assert.assertEquals(1 - expected, Erf.erfc(-x), 1.0e-5);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}
    
    /**
     * MATH-301, MATH-456
     */
    @Test
    public void testLargeValues() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xuzv0u2929();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testLargeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xuzv0u2929(){try{__CLR4_4_129102910lb90pei9.R.inc(105057);
        __CLR4_4_129102910lb90pei9.R.inc(105058);for (int i = 1; (((i < 200)&&(__CLR4_4_129102910lb90pei9.R.iget(105059)!=0|true))||(__CLR4_4_129102910lb90pei9.R.iget(105060)==0&false)); i*=10) {{
            __CLR4_4_129102910lb90pei9.R.inc(105061);double result = Erf.erf(i);
            __CLR4_4_129102910lb90pei9.R.inc(105062);Assert.assertFalse(Double.isNaN(result));
            __CLR4_4_129102910lb90pei9.R.inc(105063);Assert.assertTrue(result > 0 && result <= 1);
            __CLR4_4_129102910lb90pei9.R.inc(105064);result = Erf.erf(-i);
            __CLR4_4_129102910lb90pei9.R.inc(105065);Assert.assertFalse(Double.isNaN(result));
            __CLR4_4_129102910lb90pei9.R.inc(105066);Assert.assertTrue(result >= -1 && result < 0);
            __CLR4_4_129102910lb90pei9.R.inc(105067);result = Erf.erfc(i);
            __CLR4_4_129102910lb90pei9.R.inc(105068);Assert.assertFalse(Double.isNaN(result));
            __CLR4_4_129102910lb90pei9.R.inc(105069);Assert.assertTrue(result >= 0 && result < 1);
            __CLR4_4_129102910lb90pei9.R.inc(105070);result = Erf.erfc(-i);
            __CLR4_4_129102910lb90pei9.R.inc(105071);Assert.assertFalse(Double.isNaN(result));
            __CLR4_4_129102910lb90pei9.R.inc(105072);Assert.assertTrue(result >= 1 && result <= 2);    
        }
        }__CLR4_4_129102910lb90pei9.R.inc(105073);Assert.assertEquals(-1, Erf.erf(Double.NEGATIVE_INFINITY), 0);
        __CLR4_4_129102910lb90pei9.R.inc(105074);Assert.assertEquals(1, Erf.erf(Double.POSITIVE_INFINITY), 0);
        __CLR4_4_129102910lb90pei9.R.inc(105075);Assert.assertEquals(2, Erf.erfc(Double.NEGATIVE_INFINITY), 0);
        __CLR4_4_129102910lb90pei9.R.inc(105076);Assert.assertEquals(0, Erf.erfc(Double.POSITIVE_INFINITY), 0);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}
    
    /**
     * Compare Erf.erf against reference values computed using GCC 4.2.1 (Apple OSX packaged version)
     * erfl (extended precision erf).
     */
    @Test
    public void testErfGnu() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sw7qi6292t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfGnu",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105077,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sw7qi6292t(){try{__CLR4_4_129102910lb90pei9.R.inc(105077);
        __CLR4_4_129102910lb90pei9.R.inc(105078);final double tol = 1E-15;
        __CLR4_4_129102910lb90pei9.R.inc(105079);final double[] gnuValues = new double[] {-1, -1, -1, -1, -1, 
        -1, -1, -1, -0.99999999999999997848, 
        -0.99999999999999264217, -0.99999999999846254017, -0.99999999980338395581, -0.99999998458274209971, 
        -0.9999992569016276586, -0.99997790950300141459, -0.99959304798255504108, -0.99532226501895273415, 
        -0.96610514647531072711, -0.84270079294971486948, -0.52049987781304653809,  0, 
         0.52049987781304653809, 0.84270079294971486948, 0.96610514647531072711, 0.99532226501895273415, 
         0.99959304798255504108, 0.99997790950300141459, 0.9999992569016276586, 0.99999998458274209971, 
         0.99999999980338395581, 0.99999999999846254017, 0.99999999999999264217, 0.99999999999999997848, 
         1,  1,  1,  1, 
         1,  1,  1,  1};
        __CLR4_4_129102910lb90pei9.R.inc(105080);double x = -10d;
        __CLR4_4_129102910lb90pei9.R.inc(105081);for (int i = 0; (((i < 41)&&(__CLR4_4_129102910lb90pei9.R.iget(105082)!=0|true))||(__CLR4_4_129102910lb90pei9.R.iget(105083)==0&false)); i++) {{
            __CLR4_4_129102910lb90pei9.R.inc(105084);Assert.assertEquals(gnuValues[i], Erf.erf(x), tol);
            __CLR4_4_129102910lb90pei9.R.inc(105085);x += 0.5d;
        }
    }}finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}
    
    /**
     * Compare Erf.erfc against reference values computed using GCC 4.2.1 (Apple OSX packaged version)
     * erfcl (extended precision erfc).
     */
    @Test
    public void testErfcGnu() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvnldl2932();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfcGnu",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvnldl2932(){try{__CLR4_4_129102910lb90pei9.R.inc(105086);
        __CLR4_4_129102910lb90pei9.R.inc(105087);final double tol = 1E-15;
        __CLR4_4_129102910lb90pei9.R.inc(105088);final double[] gnuValues = new double[] { 2,  2,  2,  2,  2, 
        2,  2,  2, 1.9999999999999999785, 
        1.9999999999999926422, 1.9999999999984625402, 1.9999999998033839558, 1.9999999845827420998, 
        1.9999992569016276586, 1.9999779095030014146, 1.9995930479825550411, 1.9953222650189527342, 
        1.9661051464753107271, 1.8427007929497148695, 1.5204998778130465381,  1, 
        0.47950012218695346194, 0.15729920705028513051, 0.033894853524689272893, 0.0046777349810472658333, 
        0.00040695201744495893941, 2.2090496998585441366E-05, 7.4309837234141274516E-07, 1.5417257900280018858E-08, 
        1.966160441542887477E-10, 1.5374597944280348501E-12, 7.3578479179743980661E-15, 2.1519736712498913103E-17, 
        3.8421483271206474691E-20, 4.1838256077794144006E-23, 2.7766493860305691016E-26, 1.1224297172982927079E-29, 
        2.7623240713337714448E-33, 4.1370317465138102353E-37, 3.7692144856548799402E-41, 2.0884875837625447567E-45};
        __CLR4_4_129102910lb90pei9.R.inc(105089);double x = -10d;
        __CLR4_4_129102910lb90pei9.R.inc(105090);for (int i = 0; (((i < 41)&&(__CLR4_4_129102910lb90pei9.R.iget(105091)!=0|true))||(__CLR4_4_129102910lb90pei9.R.iget(105092)==0&false)); i++) {{
            __CLR4_4_129102910lb90pei9.R.inc(105093);Assert.assertEquals(gnuValues[i], Erf.erfc(x), tol);
            __CLR4_4_129102910lb90pei9.R.inc(105094);x += 0.5d;
        }
    }}finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}
    
    /**
     * Tests erfc against reference data computed using Maple reported in Marsaglia, G,, 
     * "Evaluating the Normal Distribution," Journal of Statistical Software, July, 2004.
     * http//www.jstatsoft.org/v11/a05/paper
     */
    @Test
    public void testErfcMaple() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qux3ls293b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfcMaple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105095,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qux3ls293b(){try{__CLR4_4_129102910lb90pei9.R.inc(105095);
        __CLR4_4_129102910lb90pei9.R.inc(105096);double[][] ref = new double[][]
                        {{0.1, 4.60172162722971e-01},
                         {1.2, 1.15069670221708e-01},
                         {2.3, 1.07241100216758e-02},
                         {3.4, 3.36929265676881e-04},
                         {4.5, 3.39767312473006e-06},
                         {5.6, 1.07175902583109e-08}, 
                         {6.7, 1.04209769879652e-11},
                         {7.8, 3.09535877195870e-15},
                         {8.9, 2.79233437493966e-19},
                         {10.0, 7.61985302416053e-24},
                         {11.1, 6.27219439321703e-29},
                         {12.2, 1.55411978638959e-34}, 
                         {13.3, 1.15734162836904e-40},
                         {14.4, 2.58717592540226e-47},
                         {15.5, 1.73446079179387e-54},
                         {16.6, 3.48454651995041e-62}
        };
        __CLR4_4_129102910lb90pei9.R.inc(105097);for (int i = 0; (((i < 15)&&(__CLR4_4_129102910lb90pei9.R.iget(105098)!=0|true))||(__CLR4_4_129102910lb90pei9.R.iget(105099)==0&false)); i++) {{
            __CLR4_4_129102910lb90pei9.R.inc(105100);final double result = 0.5*Erf.erfc(ref[i][0]/Math.sqrt(2));
            __CLR4_4_129102910lb90pei9.R.inc(105101);Assert.assertEquals(ref[i][1], result, 1E-15);
            __CLR4_4_129102910lb90pei9.R.inc(105102);TestUtils.assertRelativelyEquals(ref[i][1], result, 1E-13);
        }
    }}finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}
    
    /**
     * Test the implementation of Erf.erf(double, double) for consistency with results
     * obtained from Erf.erf(double) and Erf.erfc(double).
     */
    @Test
    public void testTwoArgumentErf() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17p5gev293j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testTwoArgumentErf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17p5gev293j(){try{__CLR4_4_129102910lb90pei9.R.inc(105103);
        __CLR4_4_129102910lb90pei9.R.inc(105104);double[] xi = new double[]{-2.0, -1.0, -0.9, -0.1, 0.0, 0.1, 0.9, 1.0, 2.0};
        __CLR4_4_129102910lb90pei9.R.inc(105105);for(double x1 : xi) {{
            __CLR4_4_129102910lb90pei9.R.inc(105106);for(double x2 : xi) {{
                __CLR4_4_129102910lb90pei9.R.inc(105107);double a = Erf.erf(x1, x2);
                __CLR4_4_129102910lb90pei9.R.inc(105108);double b = Erf.erf(x2) - Erf.erf(x1);
                __CLR4_4_129102910lb90pei9.R.inc(105109);double c = Erf.erfc(x1) - Erf.erfc(x2);
                __CLR4_4_129102910lb90pei9.R.inc(105110);Assert.assertEquals(a, b, 1E-15);
                __CLR4_4_129102910lb90pei9.R.inc(105111);Assert.assertEquals(a, c, 1E-15);
            }
        }}
    }}finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErfInvNaN() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uudwoo293s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfInvNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uudwoo293s(){try{__CLR4_4_129102910lb90pei9.R.inc(105112);
        __CLR4_4_129102910lb90pei9.R.inc(105113);Assert.assertTrue(Double.isNaN(Erf.erfInv(-1.001)));
        __CLR4_4_129102910lb90pei9.R.inc(105114);Assert.assertTrue(Double.isNaN(Erf.erfInv(+1.001)));
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErfInvInfinite() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17qnemd293v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfInvInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17qnemd293v(){try{__CLR4_4_129102910lb90pei9.R.inc(105115);
        __CLR4_4_129102910lb90pei9.R.inc(105116);Assert.assertTrue(Double.isInfinite(Erf.erfInv(-1)));
        __CLR4_4_129102910lb90pei9.R.inc(105117);Assert.assertTrue(Erf.erfInv(-1) < 0);
        __CLR4_4_129102910lb90pei9.R.inc(105118);Assert.assertTrue(Double.isInfinite(Erf.erfInv(+1)));
        __CLR4_4_129102910lb90pei9.R.inc(105119);Assert.assertTrue(Erf.erfInv(+1) > 0);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErfInv() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvibkh2940();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfInv",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvibkh2940(){try{__CLR4_4_129102910lb90pei9.R.inc(105120);
        __CLR4_4_129102910lb90pei9.R.inc(105121);for (double x = -5.9; (((x < 5.9)&&(__CLR4_4_129102910lb90pei9.R.iget(105122)!=0|true))||(__CLR4_4_129102910lb90pei9.R.iget(105123)==0&false)); x += 0.01) {{
            __CLR4_4_129102910lb90pei9.R.inc(105124);final double y = Erf.erf(x);
            __CLR4_4_129102910lb90pei9.R.inc(105125);final double dydx = 2 * FastMath.exp(-x * x) / FastMath.sqrt(FastMath.PI);
            __CLR4_4_129102910lb90pei9.R.inc(105126);Assert.assertEquals(x, Erf.erfInv(y), 1.0e-15 / dydx);
        }
    }}finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErfcInvNaN() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwuskz2947();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfcInvNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwuskz2947(){try{__CLR4_4_129102910lb90pei9.R.inc(105127);
        __CLR4_4_129102910lb90pei9.R.inc(105128);Assert.assertTrue(Double.isNaN(Erf.erfcInv(-0.001)));
        __CLR4_4_129102910lb90pei9.R.inc(105129);Assert.assertTrue(Double.isNaN(Erf.erfcInv(+2.001)));
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErfcInvInfinite() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1szo8uo294a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfcInvInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1szo8uo294a(){try{__CLR4_4_129102910lb90pei9.R.inc(105130);
        __CLR4_4_129102910lb90pei9.R.inc(105131);Assert.assertTrue(Double.isInfinite(Erf.erfcInv(-0)));
        __CLR4_4_129102910lb90pei9.R.inc(105132);Assert.assertTrue(Erf.erfcInv( 0) > 0);
        __CLR4_4_129102910lb90pei9.R.inc(105133);Assert.assertTrue(Double.isInfinite(Erf.erfcInv(+2)));
        __CLR4_4_129102910lb90pei9.R.inc(105134);Assert.assertTrue(Erf.erfcInv(+2) < 0);
    }finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}

    @Test
    public void testErfcInv() {__CLR4_4_129102910lb90pei9.R.globalSliceStart(getClass().getName(),105135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tuy6fw294f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_129102910lb90pei9.R.rethrow($CLV_t2$);}finally{__CLR4_4_129102910lb90pei9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.special.ErfTest.testErfcInv",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),105135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tuy6fw294f(){try{__CLR4_4_129102910lb90pei9.R.inc(105135);
        __CLR4_4_129102910lb90pei9.R.inc(105136);for (double x = -5.85; (((x < 5.9)&&(__CLR4_4_129102910lb90pei9.R.iget(105137)!=0|true))||(__CLR4_4_129102910lb90pei9.R.iget(105138)==0&false)); x += 0.01) {{
            __CLR4_4_129102910lb90pei9.R.inc(105139);final double y = Erf.erfc(x);
            __CLR4_4_129102910lb90pei9.R.inc(105140);final double dydxAbs = 2 * FastMath.exp(-x * x) / FastMath.sqrt(FastMath.PI);
            __CLR4_4_129102910lb90pei9.R.inc(105141);Assert.assertEquals(x, Erf.erfcInv(y), 1.0e-15 / dydxAbs);
        }
    }}finally{__CLR4_4_129102910lb90pei9.R.flushNeeded();}}
}
