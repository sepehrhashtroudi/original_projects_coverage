/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.util;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.random.Well1024a;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link MathArrays} class.
 *
 * @version $Id$
 */
public class MathArraysTest {static class __CLR4_4_12g7m2g7mlb90pf5d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,114789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Test
    public void testScale() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1na2dwh2g7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testScale",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1na2dwh2g7m(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114322);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114323);final double[] test = new double[] { -2.5, -1, 0, 1, 2.5 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114324);final double[] correctTest = MathArrays.copyOf(test);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114325);final double[] correctScaled = new double[]{5.25, 2.1, 0, -2.1, -5.25};
        
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114326);final double[] scaled = MathArrays.scale(-2.1, test);

        // Make sure test has not changed
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114327);for (int i = 0; (((i < test.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114328)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114329)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114330);Assert.assertEquals(correctTest[i], test[i], 0);
        }

        // Test scaled values
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114331);for (int i = 0; (((i < scaled.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114332)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114333)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114334);Assert.assertEquals(correctScaled[i], scaled[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testScaleInPlace() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g9u9692g7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testScaleInPlace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g9u9692g7z(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114335);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114336);final double[] test = new double[] { -2.5, -1, 0, 1, 2.5 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114337);final double[] correctScaled = new double[]{5.25, 2.1, 0, -2.1, -5.25};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114338);MathArrays.scaleInPlace(-2.1, test);

        // Make sure test has changed
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114339);for (int i = 0; (((i < test.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114340)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114341)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114342);Assert.assertEquals(correctScaled[i], test[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test(expected=DimensionMismatchException.class)
    public void testEbeAddPrecondition() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lkgbsa2g87();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,98,101,65,100,100,80,114,101,99,111,110,100,105,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeAddPrecondition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114343,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lkgbsa2g87(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114343);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114344);MathArrays.ebeAdd(new double[3], new double[4]);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    @Test(expected=DimensionMismatchException.class)
    public void testEbeSubtractPrecondition() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s2t8if2g89();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,98,101,83,117,98,116,114,97,99,116,80,114,101,99,111,110,100,105,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeSubtractPrecondition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s2t8if2g89(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114345);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114346);MathArrays.ebeSubtract(new double[3], new double[4]);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    @Test(expected=DimensionMismatchException.class)
    public void testEbeMultiplyPrecondition() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gbnt32g8b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,98,101,77,117,108,116,105,112,108,121,80,114,101,99,111,110,100,105,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeMultiplyPrecondition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gbnt32g8b(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114347);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114348);MathArrays.ebeMultiply(new double[3], new double[4]);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    @Test(expected=DimensionMismatchException.class)
    public void testEbeDividePrecondition() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f09tv22g8d();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,69,98,101,68,105,118,105,100,101,80,114,101,99,111,110,100,105,116,105,111,110,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeDividePrecondition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f09tv22g8d(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114349);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114350);MathArrays.ebeDivide(new double[3], new double[4]);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testEbeAdd() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n66x1q2g8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114351,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n66x1q2g8f(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114351);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114352);final double[] a = { 0, 1, 2 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114353);final double[] b = { 3, 5, 7 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114354);final double[] r = MathArrays.ebeAdd(a, b);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114355);for (int i = 0; (((i < a.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114356)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114357)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114358);Assert.assertEquals(a[i] + b[i], r[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    @Test
    public void testEbeSubtract() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yd2f1t2g8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yd2f1t2g8n(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114359);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114360);final double[] a = { 0, 1, 2 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114361);final double[] b = { 3, 5, 7 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114362);final double[] r = MathArrays.ebeSubtract(a, b);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114363);for (int i = 0; (((i < a.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114364)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114365)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114366);Assert.assertEquals(a[i] - b[i], r[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    @Test
    public void testEbeMultiply() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1epltfj2g8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114367,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1epltfj2g8v(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114367);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114368);final double[] a = { 0, 1, 2 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114369);final double[] b = { 3, 5, 7 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114370);final double[] r = MathArrays.ebeMultiply(a, b);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114371);for (int i = 0; (((i < a.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114372)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114373)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114374);Assert.assertEquals(a[i] * b[i], r[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    @Test
    public void testEbeDivide() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dh69i2g93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testEbeDivide",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114375,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dh69i2g93(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114375);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114376);final double[] a = { 0, 1, 2 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114377);final double[] b = { 3, 5, 7 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114378);final double[] r = MathArrays.ebeDivide(a, b);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114379);for (int i = 0; (((i < a.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114380)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114381)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114382);Assert.assertEquals(a[i] / b[i], r[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testL1DistanceDouble() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q2nig42g9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testL1DistanceDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114383,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q2nig42g9b(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114383);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114384);double[] p1 = { 2.5,  0.0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114385);double[] p2 = { -0.5, 4.0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114386);Assert.assertTrue(Precision.equals(7.0, MathArrays.distance1(p1, p2), 1));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testL1DistanceInt() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175bsra2g9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testL1DistanceInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175bsra2g9f(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114387);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114388);int[] p1 = { 3, 0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114389);int[] p2 = { 0, 4 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114390);Assert.assertEquals(7, MathArrays.distance1(p1, p2));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testL2DistanceDouble() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r6jp6t2g9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testL2DistanceDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r6jp6t2g9j(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114391);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114392);double[] p1 = { 2.5,  0.0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114393);double[] p2 = { -0.5, 4.0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114394);Assert.assertTrue(Precision.equals(5.0, MathArrays.distance(p1, p2), 1));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testL2DistanceInt() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1an5s5z2g9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testL2DistanceInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1an5s5z2g9n(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114395);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114396);int[] p1 = { 3, 0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114397);int[] p2 = { 0, 4 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114398);Assert.assertTrue(Precision.equals(5, MathArrays.distance(p1, p2), 1));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testLInfDistanceDouble() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ohlu42g9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testLInfDistanceDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ohlu42g9r(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114399);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114400);double[] p1 = { 2.5,  0.0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114401);double[] p2 = { -0.5, 4.0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114402);Assert.assertTrue(Precision.equals(4.0, MathArrays.distanceInf(p1, p2), 1));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testLInfDistanceInt() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dogn6u2g9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testLInfDistanceInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dogn6u2g9v(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114403);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114404);int[] p1 = { 3, 0 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114405);int[] p2 = { 0, 4 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114406);Assert.assertEquals(4, MathArrays.distanceInf(p1, p2));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCheckOrder() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19qv9nj2g9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCheckOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19qv9nj2g9z(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114407);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114408);MathArrays.checkOrder(new double[] {-15, -5.5, -1, 2, 15},
                             MathArrays.OrderDirection.INCREASING, true);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114409);MathArrays.checkOrder(new double[] {-15, -5.5, -1, 2, 2},
                             MathArrays.OrderDirection.INCREASING, false);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114410);MathArrays.checkOrder(new double[] {3, -5.5, -11, -27.5},
                             MathArrays.OrderDirection.DECREASING, true);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114411);MathArrays.checkOrder(new double[] {3, 0, 0, -5.5, -11, -27.5},
                             MathArrays.OrderDirection.DECREASING, false);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114412);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114413);MathArrays.checkOrder(new double[] {-15, -5.5, -1, -1, 2, 15},
                                 MathArrays.OrderDirection.INCREASING, true);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114414);Assert.fail("an exception should have been thrown");
        } catch (NonMonotonicSequenceException e) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114415);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114416);MathArrays.checkOrder(new double[] {-15, -5.5, -1, -2, 2},
                                 MathArrays.OrderDirection.INCREASING, false);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114417);Assert.fail("an exception should have been thrown");
        } catch (NonMonotonicSequenceException e) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114418);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114419);MathArrays.checkOrder(new double[] {3, 3, -5.5, -11, -27.5},
                                 MathArrays.OrderDirection.DECREASING, true);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114420);Assert.fail("an exception should have been thrown");
        } catch (NonMonotonicSequenceException e) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114421);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114422);MathArrays.checkOrder(new double[] {3, -1, 0, -5.5, -11, -27.5},
                                 MathArrays.OrderDirection.DECREASING, false);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114423);Assert.fail("an exception should have been thrown");
        } catch (NonMonotonicSequenceException e) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114424);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114425);MathArrays.checkOrder(new double[] {3, 0, -5.5, -11, -10},
                                 MathArrays.OrderDirection.DECREASING, false);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114426);Assert.fail("an exception should have been thrown");
        } catch (NonMonotonicSequenceException e) {
            // Expected
        }
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testIsMonotonic() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vmxjgr2gaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testIsMonotonic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vmxjgr2gaj(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114427);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114428);Assert.assertFalse(MathArrays.isMonotonic(new double[] { -15, -5.5, -1, -1, 2, 15 },
                                                  MathArrays.OrderDirection.INCREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114429);Assert.assertTrue(MathArrays.isMonotonic(new double[] { -15, -5.5, -1, 0, 2, 15 },
                                                 MathArrays.OrderDirection.INCREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114430);Assert.assertFalse(MathArrays.isMonotonic(new double[] { -15, -5.5, -1, -2, 2 },
                                                  MathArrays.OrderDirection.INCREASING, false));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114431);Assert.assertTrue(MathArrays.isMonotonic(new double[] { -15, -5.5, -1, -1, 2 },
                                                 MathArrays.OrderDirection.INCREASING, false));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114432);Assert.assertFalse(MathArrays.isMonotonic(new double[] { 3, 3, -5.5, -11, -27.5 },
                                                  MathArrays.OrderDirection.DECREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114433);Assert.assertTrue(MathArrays.isMonotonic(new double[] { 3, 2, -5.5, -11, -27.5 },
                                                 MathArrays.OrderDirection.DECREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114434);Assert.assertFalse(MathArrays.isMonotonic(new double[] { 3, -1, 0, -5.5, -11, -27.5 },
                                                  MathArrays.OrderDirection.DECREASING, false));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114435);Assert.assertTrue(MathArrays.isMonotonic(new double[] { 3, 0, 0, -5.5, -11, -27.5 },
                                                 MathArrays.OrderDirection.DECREASING, false));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testIsMonotonicComparable() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jwk292gas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testIsMonotonicComparable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jwk292gas(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114436);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114437);Assert.assertFalse(MathArrays.isMonotonic(new Double[] { new Double(-15),
                                                                 new Double(-5.5),
                                                                 new Double(-1),
                                                                 new Double(-1),
                                                                 new Double(2),
                                                                 new Double(15) },
                MathArrays.OrderDirection.INCREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114438);Assert.assertTrue(MathArrays.isMonotonic(new Double[] { new Double(-15),
                                                                new Double(-5.5),
                                                                new Double(-1),
                                                                new Double(0),
                                                                new Double(2),
                                                                new Double(15) },
                MathArrays.OrderDirection.INCREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114439);Assert.assertFalse(MathArrays.isMonotonic(new Double[] { new Double(-15),
                                                                 new Double(-5.5),
                                                                 new Double(-1),
                                                                 new Double(-2),
                                                                 new Double(2) },
                MathArrays.OrderDirection.INCREASING, false));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114440);Assert.assertTrue(MathArrays.isMonotonic(new Double[] { new Double(-15),
                                                                new Double(-5.5),
                                                                new Double(-1),
                                                                new Double(-1),
                                                                new Double(2) },
                MathArrays.OrderDirection.INCREASING, false));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114441);Assert.assertFalse(MathArrays.isMonotonic(new Double[] { new Double(3),
                                                                 new Double(3),
                                                                 new Double(-5.5),
                                                                 new Double(-11),
                                                                 new Double(-27.5) },
                MathArrays.OrderDirection.DECREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114442);Assert.assertTrue(MathArrays.isMonotonic(new Double[] { new Double(3),
                                                                new Double(2),
                                                                new Double(-5.5),
                                                                new Double(-11),
                                                                new Double(-27.5) },
                MathArrays.OrderDirection.DECREASING, true));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114443);Assert.assertFalse(MathArrays.isMonotonic(new Double[] { new Double(3),
                                                                 new Double(-1),
                                                                 new Double(0),
                                                                 new Double(-5.5),
                                                                 new Double(-11),
                                                                 new Double(-27.5) },
                MathArrays.OrderDirection.DECREASING, false));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114444);Assert.assertTrue(MathArrays.isMonotonic(new Double[] { new Double(3),
                                                                new Double(0),
                                                                new Double(0),
                                                                new Double(-5.5),
                                                                new Double(-11),
                                                                new Double(-27.5) },
                MathArrays.OrderDirection.DECREASING, false));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testCheckRectangular() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ydkjz2gb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCheckRectangular",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ydkjz2gb1(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114445);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114446);final long[][] rect = new long[][] {{0, 1}, {2, 3}};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114447);final long[][] ragged = new long[][] {{0, 1}, {2}};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114448);final long[][] nullArray = null;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114449);final long[][] empty = new long[][] {};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114450);MathArrays.checkRectangular(rect);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114451);MathArrays.checkRectangular(empty);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114452);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114453);MathArrays.checkRectangular(ragged);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114454);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114455);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114456);MathArrays.checkRectangular(nullArray);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114457);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // Expected
        } 
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testCheckPositive() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kohaei2gbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCheckPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kohaei2gbe(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114458);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114459);final double[] positive = new double[] {1, 2, 3};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114460);final double[] nonNegative = new double[] {0, 1, 2};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114461);final double[] nullArray = null;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114462);final double[] empty = new double[] {};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114463);MathArrays.checkPositive(positive);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114464);MathArrays.checkPositive(empty);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114465);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114466);MathArrays.checkPositive(nullArray);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114467);Assert.fail("Expecting NullPointerException");
        } catch (NullPointerException ex) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114468);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114469);MathArrays.checkPositive(nonNegative);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114470);Assert.fail("Expecting NotStrictlyPositiveException");
        } catch (NotStrictlyPositiveException ex) {
            // Expected
        }
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testCheckNonNegative() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvblvx2gbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCheckNonNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvblvx2gbr(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114471);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114472);final long[] nonNegative = new long[] {0, 1};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114473);final long[] hasNegative = new long[] {-1};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114474);final long[] nullArray = null;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114475);final long[] empty = new long[] {};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114476);MathArrays.checkNonNegative(nonNegative);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114477);MathArrays.checkNonNegative(empty);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114478);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114479);MathArrays.checkNonNegative(nullArray);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114480);Assert.fail("Expecting NullPointerException");
        } catch (NullPointerException ex) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114481);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114482);MathArrays.checkNonNegative(hasNegative);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114483);Assert.fail("Expecting NotPositiveException");
        } catch (NotPositiveException ex) {
            // Expected
        }
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testCheckNonNegative2D() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11h74hn2gc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCheckNonNegative2D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11h74hn2gc4(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114484);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114485);final long[][] nonNegative = new long[][] {{0, 1}, {1, 0}};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114486);final long[][] hasNegative = new long[][] {{-1}, {0}};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114487);final long[][] nullArray = null;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114488);final long[][] empty = new long[][] {};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114489);MathArrays.checkNonNegative(nonNegative);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114490);MathArrays.checkNonNegative(empty);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114491);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114492);MathArrays.checkNonNegative(nullArray);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114493);Assert.fail("Expecting NullPointerException");
        } catch (NullPointerException ex) {
            // Expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114494);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114495);MathArrays.checkNonNegative(hasNegative);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114496);Assert.fail("Expecting NotPositiveException");
        } catch (NotPositiveException ex) {
            // Expected
        }
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testSortInPlace() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fd8z952gch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testSortInPlace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fd8z952gch(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114497);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114498);final double[] x1 = {2,   5,  -3, 1,  4};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114499);final double[] x2 = {4,  25,   9, 1, 16};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114500);final double[] x3 = {8, 125, -27, 1, 64};

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114501);MathArrays.sortInPlace(x1, x2, x3);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114502);Assert.assertEquals(-3,  x1[0], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114503);Assert.assertEquals(9,   x2[0], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114504);Assert.assertEquals(-27, x3[0], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114505);Assert.assertEquals(1, x1[1], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114506);Assert.assertEquals(1, x2[1], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114507);Assert.assertEquals(1, x3[1], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114508);Assert.assertEquals(2, x1[2], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114509);Assert.assertEquals(4, x2[2], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114510);Assert.assertEquals(8, x3[2], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114511);Assert.assertEquals(4,  x1[3], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114512);Assert.assertEquals(16, x2[3], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114513);Assert.assertEquals(64, x3[3], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114514);Assert.assertEquals(5,   x1[4], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114515);Assert.assertEquals(25,  x2[4], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114516);Assert.assertEquals(125, x3[4], Math.ulp(1d));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testSortInPlaceDecresasingOrder() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsqgqz2gd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testSortInPlaceDecresasingOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsqgqz2gd1(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114517);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114518);final double[] x1 = {2,   5,  -3, 1,  4};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114519);final double[] x2 = {4,  25,   9, 1, 16};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114520);final double[] x3 = {8, 125, -27, 1, 64};

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114521);MathArrays.sortInPlace(x1,
                               MathArrays.OrderDirection.DECREASING,
                               x2, x3);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114522);Assert.assertEquals(-3,  x1[4], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114523);Assert.assertEquals(9,   x2[4], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114524);Assert.assertEquals(-27, x3[4], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114525);Assert.assertEquals(1, x1[3], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114526);Assert.assertEquals(1, x2[3], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114527);Assert.assertEquals(1, x3[3], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114528);Assert.assertEquals(2, x1[2], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114529);Assert.assertEquals(4, x2[2], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114530);Assert.assertEquals(8, x3[2], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114531);Assert.assertEquals(4,  x1[1], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114532);Assert.assertEquals(16, x2[1], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114533);Assert.assertEquals(64, x3[1], Math.ulp(1d));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114534);Assert.assertEquals(5,   x1[0], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114535);Assert.assertEquals(25,  x2[0], Math.ulp(1d));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114536);Assert.assertEquals(125, x3[0], Math.ulp(1d));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    /** Example in javadoc */
    public void testSortInPlaceExample() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nieodb2gdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testSortInPlaceExample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nieodb2gdl(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114537);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114538);final double[] x = {3, 1, 2};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114539);final double[] y = {1, 2, 3};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114540);final double[] z = {0, 5, 7};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114541);MathArrays.sortInPlace(x, y, z);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114542);final double[] sx = {1, 2, 3};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114543);final double[] sy = {2, 3, 1};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114544);final double[] sz = {5, 7, 0};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114545);Assert.assertTrue(Arrays.equals(sx, x));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114546);Assert.assertTrue(Arrays.equals(sy, y));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114547);Assert.assertTrue(Arrays.equals(sz, z));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testSortInPlaceFailures() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11p77aa2gdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testSortInPlaceFailures",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11p77aa2gdw(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114548);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114549);final double[] nullArray = null;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114550);final double[] one = {1};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114551);final double[] two = {1, 2};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114552);final double[] onep = {2};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114553);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114554);MathArrays.sortInPlace(one, two);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114555);Assert.fail("Expecting DimensionMismatchException");
        } catch (DimensionMismatchException ex) {
            // expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114556);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114557);MathArrays.sortInPlace(one, nullArray);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114558);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114559);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114560);MathArrays.sortInPlace(one, onep, nullArray);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114561);Assert.fail("Expecting NullArgumentException");
        } catch (NullArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCopyOfInt() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8z2ug2gea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCopyOfInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8z2ug2gea(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114562);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114563);final int[] source = { Integer.MIN_VALUE,
                               -1, 0, 1, 3, 113, 4769,
                               Integer.MAX_VALUE };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114564);final int[] dest = MathArrays.copyOf(source);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114565);Assert.assertEquals(dest.length, source.length);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114566);for (int i = 0; (((i < source.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114567)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114568)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114569);Assert.assertEquals(source[i], dest[i]);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCopyOfInt2() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltazp42gei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCopyOfInt2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltazp42gei(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114570);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114571);final int[] source = { Integer.MIN_VALUE,
                               -1, 0, 1, 3, 113, 4769,
                               Integer.MAX_VALUE };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114572);final int offset = 3;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114573);final int[] dest = MathArrays.copyOf(source, source.length - offset);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114574);Assert.assertEquals(dest.length, source.length - offset);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114575);for (int i = 0; (((i < source.length - offset)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114576)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114577)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114578);Assert.assertEquals(source[i], dest[i]);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCopyOfInt3() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikb0wn2ger();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCopyOfInt3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikb0wn2ger(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114579);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114580);final int[] source = { Integer.MIN_VALUE,
                               -1, 0, 1, 3, 113, 4769,
                               Integer.MAX_VALUE };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114581);final int offset = 3;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114582);final int[] dest = MathArrays.copyOf(source, source.length + offset);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114583);Assert.assertEquals(dest.length, source.length + offset);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114584);for (int i = 0; (((i < source.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114585)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114586)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114587);Assert.assertEquals(source[i], dest[i]);
        }
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114588);for (int i = source.length; (((i < source.length + offset)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114589)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114590)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114591);Assert.assertEquals(0, dest[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCopyOfDouble() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hicth22gf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCopyOfDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hicth22gf4(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114592);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114593);final double[] source = { Double.NEGATIVE_INFINITY,
                                  -Double.MAX_VALUE,
                                  -1, 0,
                                  Double.MIN_VALUE,
                                  Math.ulp(1d),
                                  1, 3, 113, 4769,
                                  Double.MAX_VALUE,
                                  Double.POSITIVE_INFINITY };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114594);final double[] dest = MathArrays.copyOf(source);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114595);Assert.assertEquals(dest.length, source.length);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114596);for (int i = 0; (((i < source.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114597)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114598)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114599);Assert.assertEquals(source[i], dest[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCopyOfDouble2() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcl6i22gfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCopyOfDouble2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcl6i22gfc(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114600);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114601);final double[] source = { Double.NEGATIVE_INFINITY,
                                  -Double.MAX_VALUE,
                                  -1, 0,
                                  Double.MIN_VALUE,
                                  Math.ulp(1d),
                                  1, 3, 113, 4769,
                                  Double.MAX_VALUE,
                                  Double.POSITIVE_INFINITY };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114602);final int offset = 3;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114603);final double[] dest = MathArrays.copyOf(source, source.length - offset);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114604);Assert.assertEquals(dest.length, source.length - offset);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114605);for (int i = 0; (((i < source.length - offset)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114606)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114607)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114608);Assert.assertEquals(source[i], dest[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testCopyOfDouble3() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kll5aj2gfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testCopyOfDouble3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kll5aj2gfl(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114609);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114610);final double[] source = { Double.NEGATIVE_INFINITY,
                                  -Double.MAX_VALUE,
                                  -1, 0,
                                  Double.MIN_VALUE,
                                  Math.ulp(1d),
                                  1, 3, 113, 4769,
                                  Double.MAX_VALUE,
                                  Double.POSITIVE_INFINITY };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114611);final int offset = 3;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114612);final double[] dest = MathArrays.copyOf(source, source.length + offset);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114613);Assert.assertEquals(dest.length, source.length + offset);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114614);for (int i = 0; (((i < source.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114615)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114616)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114617);Assert.assertEquals(source[i], dest[i], 0);
        }
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114618);for (int i = source.length; (((i < source.length + offset)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114619)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114620)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114621);Assert.assertEquals(0, dest[i], 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    // MATH-1005
    @Test
    public void testLinearCombinationWithSingleElementArray() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbhi8a2gfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testLinearCombinationWithSingleElementArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbhi8a2gfy(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114622);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114623);final double[] a = { 1.23456789 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114624);final double[] b = { 98765432.1 };

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114625);Assert.assertEquals(a[0] * b[0], MathArrays.linearCombination(a, b), 0d);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testLinearCombination1() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qka742gg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testLinearCombination1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qka742gg2(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114626);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114627);final double[] a = new double[] {
            -1321008684645961.0 / 268435456.0,
            -5774608829631843.0 / 268435456.0,
            -7645843051051357.0 / 8589934592.0
        };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114628);final double[] b = new double[] {
            -5712344449280879.0 / 2097152.0,
            -4550117129121957.0 / 2097152.0,
            8846951984510141.0 / 131072.0
        };

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114629);final double abSumInline = MathArrays.linearCombination(a[0], b[0],
                                                                a[1], b[1],
                                                                a[2], b[2]);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114630);final double abSumArray = MathArrays.linearCombination(a, b);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114631);Assert.assertEquals(abSumInline, abSumArray, 0);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114632);Assert.assertEquals(-1.8551294182586248737720779899, abSumInline, 1.0e-15);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114633);final double naive = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114634);Assert.assertTrue(FastMath.abs(naive - abSumInline) > 1.5);

    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testLinearCombination2() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13hkben2ggb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testLinearCombination2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13hkben2ggb(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114635);
        // we compare accurate versus naive dot product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114636);Well1024a random = new Well1024a(553267312521321234l);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114637);for (int i = 0; (((i < 10000)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114638)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114639)==0&false)); ++i) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114640);final double ux = 1e17 * random.nextDouble();
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114641);final double uy = 1e17 * random.nextDouble();
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114642);final double uz = 1e17 * random.nextDouble();
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114643);final double vx = 1e17 * random.nextDouble();
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114644);final double vy = 1e17 * random.nextDouble();
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114645);final double vz = 1e17 * random.nextDouble();
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114646);final double sInline = MathArrays.linearCombination(ux, vx,
                                                                uy, vy,
                                                                uz, vz);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114647);final double sArray = MathArrays.linearCombination(new double[] {ux, uy, uz},
                                                               new double[] {vx, vy, vz});
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114648);Assert.assertEquals(sInline, sArray, 0);
        }
    }}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testLinearCombinationInfinite() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pljthp2ggp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testLinearCombinationInfinite",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pljthp2ggp(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114649);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114650);final double[][] a = new double[][] {
            { 1, 2, 3, 4},
            { 1, Double.POSITIVE_INFINITY, 3, 4},
            { 1, 2, Double.POSITIVE_INFINITY, 4},
            { 1, Double.POSITIVE_INFINITY, 3, Double.NEGATIVE_INFINITY},
            { 1, 2, 3, 4},
            { 1, 2, 3, 4},
            { 1, 2, 3, 4},
            { 1, 2, 3, 4}
        };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114651);final double[][] b = new double[][] {
            { 1, -2, 3, 4},
            { 1, -2, 3, 4},
            { 1, -2, 3, 4},
            { 1, -2, 3, 4},
            { 1, Double.POSITIVE_INFINITY, 3, 4},
            { 1, -2, Double.POSITIVE_INFINITY, 4},
            { 1, Double.POSITIVE_INFINITY, 3, Double.NEGATIVE_INFINITY},
            { Double.NaN, -2, 3, 4}
        };

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114652);Assert.assertEquals(-3,
                            MathArrays.linearCombination(a[0][0], b[0][0],
                                                         a[0][1], b[0][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114653);Assert.assertEquals(6,
                            MathArrays.linearCombination(a[0][0], b[0][0],
                                                         a[0][1], b[0][1],
                                                         a[0][2], b[0][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114654);Assert.assertEquals(22,
                            MathArrays.linearCombination(a[0][0], b[0][0],
                                                         a[0][1], b[0][1],
                                                         a[0][2], b[0][2],
                                                         a[0][3], b[0][3]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114655);Assert.assertEquals(22, MathArrays.linearCombination(a[0], b[0]), 1.0e-10);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114656);Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            MathArrays.linearCombination(a[1][0], b[1][0],
                                                         a[1][1], b[1][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114657);Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            MathArrays.linearCombination(a[1][0], b[1][0],
                                                         a[1][1], b[1][1],
                                                         a[1][2], b[1][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114658);Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            MathArrays.linearCombination(a[1][0], b[1][0],
                                                         a[1][1], b[1][1],
                                                         a[1][2], b[1][2],
                                                         a[1][3], b[1][3]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114659);Assert.assertEquals(Double.NEGATIVE_INFINITY, MathArrays.linearCombination(a[1], b[1]), 1.0e-10);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114660);Assert.assertEquals(-3,
                            MathArrays.linearCombination(a[2][0], b[2][0],
                                                         a[2][1], b[2][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114661);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[2][0], b[2][0],
                                                         a[2][1], b[2][1],
                                                         a[2][2], b[2][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114662);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[2][0], b[2][0],
                                                         a[2][1], b[2][1],
                                                         a[2][2], b[2][2],
                                                         a[2][3], b[2][3]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114663);Assert.assertEquals(Double.POSITIVE_INFINITY, MathArrays.linearCombination(a[2], b[2]), 1.0e-10);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114664);Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            MathArrays.linearCombination(a[3][0], b[3][0],
                                                         a[3][1], b[3][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114665);Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            MathArrays.linearCombination(a[3][0], b[3][0],
                                                         a[3][1], b[3][1],
                                                         a[3][2], b[3][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114666);Assert.assertEquals(Double.NEGATIVE_INFINITY,
                            MathArrays.linearCombination(a[3][0], b[3][0],
                                                         a[3][1], b[3][1],
                                                         a[3][2], b[3][2],
                                                         a[3][3], b[3][3]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114667);Assert.assertEquals(Double.NEGATIVE_INFINITY, MathArrays.linearCombination(a[3], b[3]), 1.0e-10);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114668);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[4][0], b[4][0],
                                                         a[4][1], b[4][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114669);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[4][0], b[4][0],
                                                         a[4][1], b[4][1],
                                                         a[4][2], b[4][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114670);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[4][0], b[4][0],
                                                         a[4][1], b[4][1],
                                                         a[4][2], b[4][2],
                                                         a[4][3], b[4][3]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114671);Assert.assertEquals(Double.POSITIVE_INFINITY, MathArrays.linearCombination(a[4], b[4]), 1.0e-10);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114672);Assert.assertEquals(-3,
                            MathArrays.linearCombination(a[5][0], b[5][0],
                                                         a[5][1], b[5][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114673);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[5][0], b[5][0],
                                                         a[5][1], b[5][1],
                                                         a[5][2], b[5][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114674);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[5][0], b[5][0],
                                                         a[5][1], b[5][1],
                                                         a[5][2], b[5][2],
                                                         a[5][3], b[5][3]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114675);Assert.assertEquals(Double.POSITIVE_INFINITY, MathArrays.linearCombination(a[5], b[5]), 1.0e-10);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114676);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[6][0], b[6][0],
                                                         a[6][1], b[6][1]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114677);Assert.assertEquals(Double.POSITIVE_INFINITY,
                            MathArrays.linearCombination(a[6][0], b[6][0],
                                                         a[6][1], b[6][1],
                                                         a[6][2], b[6][2]),
                            1.0e-10);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114678);Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a[6][0], b[6][0],
                                                                    a[6][1], b[6][1],
                                                                    a[6][2], b[6][2],
                                                                    a[6][3], b[6][3])));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114679);Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a[6], b[6])));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114680);Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a[7][0], b[7][0],
                                                                    a[7][1], b[7][1])));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114681);Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a[7][0], b[7][0],
                                                                    a[7][1], b[7][1],
                                                                    a[7][2], b[7][2])));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114682);Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a[7][0], b[7][0],
                                                                    a[7][1], b[7][1],
                                                                    a[7][2], b[7][2],
                                                                    a[7][3], b[7][3])));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114683);Assert.assertTrue(Double.isNaN(MathArrays.linearCombination(a[7], b[7])));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testArrayEquals() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15sx05p2gho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testArrayEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15sx05p2gho(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114684);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114685);Assert.assertFalse(MathArrays.equals(new double[] { 1d }, null));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114686);Assert.assertFalse(MathArrays.equals(null, new double[] { 1d }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114687);Assert.assertTrue(MathArrays.equals((double[]) null, (double[]) null));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114688);Assert.assertFalse(MathArrays.equals(new double[] { 1d }, new double[0]));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114689);Assert.assertTrue(MathArrays.equals(new double[] { 1d }, new double[] { 1d }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114690);Assert.assertTrue(MathArrays.equals(new double[] { Double.POSITIVE_INFINITY,
                                                           Double.NEGATIVE_INFINITY, 1d, 0d },
                                            new double[] { Double.POSITIVE_INFINITY,
                                                           Double.NEGATIVE_INFINITY, 1d, 0d }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114691);Assert.assertFalse(MathArrays.equals(new double[] { Double.NaN },
                                             new double[] { Double.NaN }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114692);Assert.assertFalse(MathArrays.equals(new double[] { Double.POSITIVE_INFINITY },
                                             new double[] { Double.NEGATIVE_INFINITY }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114693);Assert.assertFalse(MathArrays.equals(new double[] { 1d },
                                             new double[] { FastMath.nextAfter(FastMath.nextAfter(1d, 2d), 2d) }));

    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testArrayEqualsIncludingNaN() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1m0g32ghy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testArrayEqualsIncludingNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1m0g32ghy(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114694);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114695);Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[] { 1d }, null));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114696);Assert.assertFalse(MathArrays.equalsIncludingNaN(null, new double[] { 1d }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114697);Assert.assertTrue(MathArrays.equalsIncludingNaN((double[]) null, (double[]) null));

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114698);Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[] { 1d }, new double[0]));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114699);Assert.assertTrue(MathArrays.equalsIncludingNaN(new double[] { 1d }, new double[] { 1d }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114700);Assert.assertTrue(MathArrays.equalsIncludingNaN(new double[] { Double.NaN, Double.POSITIVE_INFINITY,
                                                                       Double.NEGATIVE_INFINITY, 1d, 0d },
                                                        new double[] { Double.NaN, Double.POSITIVE_INFINITY,
                                                                       Double.NEGATIVE_INFINITY, 1d, 0d }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114701);Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[] { Double.POSITIVE_INFINITY },
                                                         new double[] { Double.NEGATIVE_INFINITY }));
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114702);Assert.assertFalse(MathArrays.equalsIncludingNaN(new double[] { 1d },
                                                         new double[] { FastMath.nextAfter(FastMath.nextAfter(1d, 2d), 2d) }));
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testNormalizeArray() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1opji32gi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testNormalizeArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114703,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1opji32gi7(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114703);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114704);double[] testValues1 = new double[] {1, 1, 2};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114705);TestUtils.assertEquals( new double[] {.25, .25, .5},
                                MathArrays.normalizeArray(testValues1, 1),
                                Double.MIN_VALUE);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114706);double[] testValues2 = new double[] {-1, -1, 1};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114707);TestUtils.assertEquals( new double[] {1, 1, -1},
                                MathArrays.normalizeArray(testValues2, 1),
                                Double.MIN_VALUE);

        // Ignore NaNs
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114708);double[] testValues3 = new double[] {-1, -1, Double.NaN, 1, Double.NaN};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114709);TestUtils.assertEquals( new double[] {1, 1,Double.NaN, -1, Double.NaN},
                                MathArrays.normalizeArray(testValues3, 1),
                                Double.MIN_VALUE);

        // Zero sum -> MathArithmeticException
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114710);double[] zeroSum = new double[] {-1, 1};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114711);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114712);MathArrays.normalizeArray(zeroSum, 1);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114713);Assert.fail("expecting MathArithmeticException");
        } catch (MathArithmeticException ex) {}

        // Infinite elements -> MathArithmeticException
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114714);double[] hasInf = new double[] {1, 2, 1, Double.NEGATIVE_INFINITY};
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114715);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114716);MathArrays.normalizeArray(hasInf, 1);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114717);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}

        // Infinite target -> MathIllegalArgumentException
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114718);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114719);MathArrays.normalizeArray(testValues1, Double.POSITIVE_INFINITY);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114720);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}

        // NaN target -> MathIllegalArgumentException
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114721);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114722);MathArrays.normalizeArray(testValues1, Double.NaN);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114723);Assert.fail("expecting MathIllegalArgumentException");
        } catch (MathIllegalArgumentException ex) {}
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
    
    @Test
    public void testConvolve() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4krax2gis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testConvolve",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4krax2gis(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114724);
        /* Test Case (obtained via SciPy)
         * x=[1.2,-1.8,1.4]
         * h=[1,0.8,0.5,0.3]
         * convolve(x,h) -> array([ 1.2 , -0.84,  0.56,  0.58,  0.16,  0.42])
         */
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114725);double[] x1 = { 1.2, -1.8, 1.4 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114726);double[] h1 = { 1, 0.8, 0.5, 0.3 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114727);double[] y1 = { 1.2, -0.84, 0.56, 0.58, 0.16, 0.42 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114728);double tolerance = 1e-13;

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114729);double[] yActual = MathArrays.convolve(x1, h1);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114730);Assert.assertArrayEquals(y1, yActual, tolerance);

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114731);double[] x2 = { 1, 2, 3 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114732);double[] h2 = { 0, 1, 0.5 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114733);double[] y2 = { 0, 1, 2.5, 4, 1.5 };
        
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114734);yActual = MathArrays.convolve(x2, h2);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114735);Assert.assertArrayEquals(y2, yActual, tolerance);
                
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114736);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114737);MathArrays.convolve(new double[]{1, 2}, null);
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114738);Assert.fail("an exception should have been thrown");
        } catch (NullArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114739);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114740);MathArrays.convolve(null, new double[]{1, 2});
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114741);Assert.fail("an exception should have been thrown");
        } catch (NullArgumentException e) {
            // expected behavior
        }

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114742);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114743);MathArrays.convolve(new double[]{1, 2}, new double[]{});
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114744);Assert.fail("an exception should have been thrown");
        } catch (NoDataException e) {
            // expected behavior
        }

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114745);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114746);MathArrays.convolve(new double[]{}, new double[]{1, 2});
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114747);Assert.fail("an exception should have been thrown");
        } catch (NoDataException e) {
            // expected behavior
        }

        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114748);try {
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114749);MathArrays.convolve(new double[]{}, new double[]{});
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114750);Assert.fail("an exception should have been thrown");
        } catch (NoDataException e) {
            // expected behavior
        }
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testShuffleTail() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1x86a2gjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testShuffleTail",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1x86a2gjj(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114751);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114752);final int[] orig = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114753);final int[] list = orig.clone();
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114754);final int start = 4;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114755);MathArrays.shuffle(list, start, MathArrays.Position.TAIL, new Well1024a(7654321L));

        // Ensure that all entries below index "start" did not move.
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114756);for (int i = 0; (((i < start)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114757)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114758)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114759);Assert.assertEquals(orig[i], list[i]);
        }

        // Ensure that at least one entry has moved.
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114760);boolean ok = false;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114761);for (int i = start; (((i < orig.length - 1)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114762)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114763)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114764);if ((((orig[i] != list[i])&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114765)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114766)==0&false))) {{
                __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114767);ok = true;
                __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114768);break;
            }
        }}
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114769);Assert.assertTrue(ok);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}

    @Test
    public void testShuffleHead() {__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceStart(getClass().getName(),114770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17l5l2m2gk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g7m2g7mlb90pf5d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g7m2g7mlb90pf5d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.MathArraysTest.testShuffleHead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17l5l2m2gk2(){try{__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114770);
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114771);final int[] orig = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114772);final int[] list = orig.clone();
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114773);final int start = 4;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114774);MathArrays.shuffle(list, start, MathArrays.Position.HEAD, new Well1024a(1234567L));

        // Ensure that all entries above index "start" did not move.
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114775);for (int i = start + 1; (((i < orig.length)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114776)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114777)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114778);Assert.assertEquals(orig[i], list[i]);
        }

        // Ensure that at least one entry has moved.
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114779);boolean ok = false;
        __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114780);for (int i = 0; (((i <= start)&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114781)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114782)==0&false)); i++) {{
            __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114783);if ((((orig[i] != list[i])&&(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114784)!=0|true))||(__CLR4_4_12g7m2g7mlb90pf5d.R.iget(114785)==0&false))) {{
                __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114786);ok = true;
                __CLR4_4_12g7m2g7mlb90pf5d.R.inc(114787);break;
            }
        }}
        }__CLR4_4_12g7m2g7mlb90pf5d.R.inc(114788);Assert.assertTrue(ok);
    }finally{__CLR4_4_12g7m2g7mlb90pf5d.R.flushNeeded();}}
}
