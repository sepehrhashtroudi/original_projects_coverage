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

package org.apache.commons.math3.analysis.differentiation;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.ExtendedFieldElementAbstractTest;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link DerivativeStructure}.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DerivativeStructureTest extends ExtendedFieldElementAbstractTest<DerivativeStructure> {static class __CLR4_4_11cc51cc5lb90pbv7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,63912,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    protected DerivativeStructure build(final double x) {try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62645);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62646);return new DerivativeStructure(2, 1, 0, x);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testWrongVariableIndex() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u4kduq1cc7();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,87,114,111,110,103,86,97,114,105,97,98,108,101,73,110,100,101,120,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testWrongVariableIndex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u4kduq1cc7(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62647);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62648);new DerivativeStructure(3, 1, 3, 1.0);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testMissingOrders() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kxyjq81cc9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,115,115,105,110,103,79,114,100,101,114,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testMissingOrders",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kxyjq81cc9(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62649);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62650);new DerivativeStructure(3, 1, 0, 1.0).getPartialDerivative(0, 1);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testTooLargeOrder() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyz7uk1ccb();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,111,111,76,97,114,103,101,79,114,100,101,114,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTooLargeOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyz7uk1ccb(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62651);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62652);new DerivativeStructure(3, 1, 0, 1.0).getPartialDerivative(1, 1, 2);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testVariableWithoutDerivative0() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2tvl61ccd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testVariableWithoutDerivative0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2tvl61ccd(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62653);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62654);DerivativeStructure v = new DerivativeStructure(1, 0, 0, 1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62655);Assert.assertEquals(1.0, v.getValue(), 1.0e-15);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test(expected=NumberIsTooLargeException.class)
    public void testVariableWithoutDerivative1() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tttwsp1ccg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,86,97,114,105,97,98,108,101,87,105,116,104,111,117,116,68,101,114,105,118,97,116,105,118,101,49,58,32,91,78,117,109,98,101,114,73,115,84,111,111,76,97,114,103,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberIsTooLargeException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testVariableWithoutDerivative1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tttwsp1ccg(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62656);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62657);DerivativeStructure v = new DerivativeStructure(1, 0, 0, 1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62658);Assert.assertEquals(1.0, v.getPartialDerivative(1), 1.0e-15);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testVariable() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171ruiz1ccj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testVariable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171ruiz1ccj(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62659);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62660);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62661)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62662)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62663);checkF0F1(new DerivativeStructure(3, maxOrder, 0, 1.0),
                      1.0, 1.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62664);checkF0F1(new DerivativeStructure(3, maxOrder, 1, 2.0),
                      2.0, 0.0, 1.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62665);checkF0F1(new DerivativeStructure(3, maxOrder, 2, 3.0),
                      3.0, 0.0, 0.0, 1.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testConstant() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1159o9v1ccq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62666,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1159o9v1ccq(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62666);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62667);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62668)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62669)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62670);checkF0F1(new DerivativeStructure(3, maxOrder, FastMath.PI),
                      FastMath.PI, 0.0, 0.0, 0.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCreateConstant() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wozoqh1ccv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCreateConstant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wozoqh1ccv(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62671);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62672);DerivativeStructure a = new DerivativeStructure(3, 2, 0, 1.3);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62673);DerivativeStructure b = a.createConstant(2.5);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62674);Assert.assertEquals(a.getFreeParameters(), b.getFreeParameters());
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62675);Assert.assertEquals(a.getOrder(), b.getOrder());
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62676);checkEquals(a.getField().getOne().multiply(2.5), b, 1.0e-15);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPrimitiveAdd() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wc4dvx1cd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPrimitiveAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wc4dvx1cd1(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62677);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62678);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62679)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62680)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62681);checkF0F1(new DerivativeStructure(3, maxOrder, 0, 1.0).add(5), 6.0, 1.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62682);checkF0F1(new DerivativeStructure(3, maxOrder, 1, 2.0).add(5), 7.0, 0.0, 1.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62683);checkF0F1(new DerivativeStructure(3, maxOrder, 2, 3.0).add(5), 8.0, 0.0, 0.0, 1.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testAdd() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vtx82e1cd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testAdd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vtx82e1cd8(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62684);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62685);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62686)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62687)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62688);DerivativeStructure x = new DerivativeStructure(3, maxOrder, 0, 1.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62689);DerivativeStructure y = new DerivativeStructure(3, maxOrder, 1, 2.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62690);DerivativeStructure z = new DerivativeStructure(3, maxOrder, 2, 3.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62691);DerivativeStructure xyz = x.add(y.add(z));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62692);checkF0F1(xyz, x.getValue() + y.getValue() + z.getValue(), 1.0, 1.0, 1.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPrimitiveSubtract() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1tu4w1cdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPrimitiveSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1tu4w1cdh(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62693);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62694);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62695)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62696)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62697);checkF0F1(new DerivativeStructure(3, maxOrder, 0, 1.0).subtract(5), -4.0, 1.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62698);checkF0F1(new DerivativeStructure(3, maxOrder, 1, 2.0).subtract(5), -3.0, 0.0, 1.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62699);checkF0F1(new DerivativeStructure(3, maxOrder, 2, 3.0).subtract(5), -2.0, 0.0, 0.0, 1.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSubtract() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hib6tp1cdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSubtract",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hib6tp1cdo(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62700);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62701);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62702)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62703)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62704);DerivativeStructure x = new DerivativeStructure(3, maxOrder, 0, 1.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62705);DerivativeStructure y = new DerivativeStructure(3, maxOrder, 1, 2.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62706);DerivativeStructure z = new DerivativeStructure(3, maxOrder, 2, 3.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62707);DerivativeStructure xyz = x.subtract(y.subtract(z));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62708);checkF0F1(xyz, x.getValue() - (y.getValue() - z.getValue()), 1.0, -1.0, 1.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPrimitiveMultiply() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0uecg1cdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPrimitiveMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0uecg1cdx(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62709);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62710);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62711)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62712)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62713);checkF0F1(new DerivativeStructure(3, maxOrder, 0, 1.0).multiply(5),  5.0, 5.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62714);checkF0F1(new DerivativeStructure(3, maxOrder, 1, 2.0).multiply(5), 10.0, 0.0, 5.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62715);checkF0F1(new DerivativeStructure(3, maxOrder, 2, 3.0).multiply(5), 15.0, 0.0, 0.0, 5.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testMultiply() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkd1nn1ce4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testMultiply",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkd1nn1ce4(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62716);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62717);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62718)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62719)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62720);DerivativeStructure x = new DerivativeStructure(3, maxOrder, 0, 1.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62721);DerivativeStructure y = new DerivativeStructure(3, maxOrder, 1, 2.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62722);DerivativeStructure z = new DerivativeStructure(3, maxOrder, 2, 3.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62723);DerivativeStructure xyz = x.multiply(y.multiply(z));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62724);for (int i = 0; (((i <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62725)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62726)==0&false)); ++i) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62727);for (int j = 0; (((j <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62728)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62729)==0&false)); ++j) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62730);for (int k = 0; (((k <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62731)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62732)==0&false)); ++k) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62733);if ((((i + j + k <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62734)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62735)==0&false))) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62736);Assert.assertEquals(((((i == 0 )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62737)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62738)==0&false))? x.getValue() : ((((i == 1 )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62739)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62740)==0&false))? 1.0 : 0.0)) *
                                                ((((j == 0 )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62741)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62742)==0&false))? y.getValue() : ((((j == 1 )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62743)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62744)==0&false))? 1.0 : 0.0)) *
                                                ((((k == 0 )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62745)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62746)==0&false))? z.getValue() : ((((k == 1 )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62747)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62748)==0&false))? 1.0 : 0.0)),
                                                xyz.getPartialDerivative(i, j, k),
                                                1.0e-15);
                        }
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testNegate() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffqfwl1cf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testNegate",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffqfwl1cf1(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62749);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62750);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62751)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62752)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62753);checkF0F1(new DerivativeStructure(3, maxOrder, 0, 1.0).negate(), -1.0, -1.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62754);checkF0F1(new DerivativeStructure(3, maxOrder, 1, 2.0).negate(), -2.0, 0.0, -1.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62755);checkF0F1(new DerivativeStructure(3, maxOrder, 2, 3.0).negate(), -3.0, 0.0, 0.0, -1.0);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testReciprocal() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11r5n8t1cf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testReciprocal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11r5n8t1cf8(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62756);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62757);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62758)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62759)==0&false)); x += 0.1) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62760);DerivativeStructure r = new DerivativeStructure(1, 6, 0, x).reciprocal();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62761);Assert.assertEquals(1 / x, r.getValue(), 1.0e-15);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62762);for (int i = 1; (((i < r.getOrder())&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62763)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62764)==0&false)); ++i) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62765);double expected = ArithmeticUtils.pow(-1, i) * CombinatoricsUtils.factorial(i) /
                                  FastMath.pow(x, i + 1);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62766);Assert.assertEquals(expected, r.getPartialDerivative(i), 1.0e-15 * FastMath.abs(expected));
            }
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPow() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xazw8d1cfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xazw8d1cfj(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62767);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62768);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62769)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62770)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62771);for (int n = 0; (((n < 10)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62772)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62773)==0&false)); ++n) {{

                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62774);DerivativeStructure x = new DerivativeStructure(3, maxOrder, 0, 1.0);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62775);DerivativeStructure y = new DerivativeStructure(3, maxOrder, 1, 2.0);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62776);DerivativeStructure z = new DerivativeStructure(3, maxOrder, 2, 3.0);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62777);List<DerivativeStructure> list = Arrays.asList(x, y, z,
                                                               x.add(y).add(z),
                                                               x.multiply(y).multiply(z));

                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62778);if ((((n == 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62779)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62780)==0&false))) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62781);for (DerivativeStructure ds : list) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62782);checkEquals(ds.getField().getOne(), ds.pow(n), 1.0e-15);
                    }
                }} }else {__CLR4_4_11cc51cc5lb90pbv7.R.inc(62783);if ((((n == 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62784)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62785)==0&false))) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62786);for (DerivativeStructure ds : list) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62787);checkEquals(ds, ds.pow(n), 1.0e-15);
                    }
                }} }else {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62788);for (DerivativeStructure ds : list) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62789);DerivativeStructure p = ds.getField().getOne();
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62790);for (int i = 0; (((i < n)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62791)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62792)==0&false)); ++i) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62793);p = p.multiply(ds);
                        }
                        }__CLR4_4_11cc51cc5lb90pbv7.R.inc(62794);checkEquals(p, ds.pow(n), 1.0e-15);
                    }
                }}
            }}}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPowDoubleDS() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5tgkt1cgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPowDoubleDS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5tgkt1cgb(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62795);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62796);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62797)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62798)==0&false)); ++maxOrder) {{

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62799);DerivativeStructure x = new DerivativeStructure(3, maxOrder, 0, 0.1);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62800);DerivativeStructure y = new DerivativeStructure(3, maxOrder, 1, 0.2);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62801);DerivativeStructure z = new DerivativeStructure(3, maxOrder, 2, 0.3);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62802);List<DerivativeStructure> list = Arrays.asList(x, y, z,
                                                           x.add(y).add(z),
                                                           x.multiply(y).multiply(z));

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62803);for (DerivativeStructure ds : list) {{
                // the special case a = 0 is included here
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62804);for (double a : new double[] { 0.0, 0.1, 1.0, 2.0, 5.0 }) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62805);DerivativeStructure reference = ((((a == 0) )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62806)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62807)==0&false))?
                                                    x.getField().getZero() :
                                                    new DerivativeStructure(3, maxOrder, a).pow(ds);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62808);DerivativeStructure result = DerivativeStructure.pow(a, ds);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62809);checkEquals(reference, result, 1.0e-15);
                }

            }}

            // negative base: -1^x can be evaluated for integers only, so value is sometimes OK, derivatives are always NaN
            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(62810);DerivativeStructure negEvenInteger = DerivativeStructure.pow(-2.0, new DerivativeStructure(3,  maxOrder, 0, 2.0));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62811);Assert.assertEquals(4.0, negEvenInteger.getValue(), 1.0e-15);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62812);Assert.assertTrue(Double.isNaN(negEvenInteger.getPartialDerivative(1, 0, 0)));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62813);DerivativeStructure negOddInteger = DerivativeStructure.pow(-2.0, new DerivativeStructure(3,  maxOrder, 0, 3.0));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62814);Assert.assertEquals(-8.0, negOddInteger.getValue(), 1.0e-15);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62815);Assert.assertTrue(Double.isNaN(negOddInteger.getPartialDerivative(1, 0, 0)));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62816);DerivativeStructure negNonInteger = DerivativeStructure.pow(-2.0, new DerivativeStructure(3,  maxOrder, 0, 2.001));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62817);Assert.assertTrue(Double.isNaN(negNonInteger.getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62818);Assert.assertTrue(Double.isNaN(negNonInteger.getPartialDerivative(1, 0, 0)));

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62819);DerivativeStructure zeroNeg = DerivativeStructure.pow(0.0, new DerivativeStructure(3,  maxOrder, 0, -1.0));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62820);Assert.assertTrue(Double.isNaN(zeroNeg.getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62821);Assert.assertTrue(Double.isNaN(zeroNeg.getPartialDerivative(1, 0, 0)));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62822);DerivativeStructure posNeg = DerivativeStructure.pow(2.0, new DerivativeStructure(3,  maxOrder, 0, -2.0));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62823);Assert.assertEquals(1.0 / 4.0, posNeg.getValue(), 1.0e-15);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62824);Assert.assertEquals(FastMath.log(2.0) / 4.0, posNeg.getPartialDerivative(1, 0, 0), 1.0e-15);

            // very special case: a = 0 and power = 0
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62825);DerivativeStructure zeroZero = DerivativeStructure.pow(0.0, new DerivativeStructure(3,  maxOrder, 0, 0.0));

            // this should be OK for simple first derivative with one variable only ...
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62826);Assert.assertEquals(1.0, zeroZero.getValue(), 1.0e-15);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62827);Assert.assertEquals(Double.NEGATIVE_INFINITY, zeroZero.getPartialDerivative(1, 0, 0), 1.0e-15);

            // the following checks show a LIMITATION of the current implementation
            // we have no way to tell x is a pure linear variable x = 0
            // we only say: "x is a structure with value = 0.0,
            // first derivative with respect to x = 1.0, and all other derivatives
            // (first order with respect to y and z and higher derivatives) all 0.0.
            // Wa have function f(x) = a^x root and x = 0 so we compute:
            // f(0) = 1, f'(0) = ln(a), f''(0) = ln(a)^2. The limit of these values
            // when a converges to 0 implies all derivatives keep switching between
            // +infinity and -infinity.
            //
            // Function composition rule for first derivatives is:
            // d[f(g(x,y,z))]/dy = f'(g(x,y,z)) * dg(x,y,z)/dy
            // so given that in our case x represents g and does not depend
            // on y or z, we have dg(x,y,z)/dy = 0
            // applying the composition rules gives:
            // d[f(g(x,y,z))]/dy = f'(g(x,y,z)) * dg(x,y,z)/dy
            //                 = -infinity * 0
            //                 = NaN
            // if we knew x is really the x variable and not the identity
            // function applied to x, we would not have computed f'(g(x,y,z)) * dg(x,y,z)/dy
            // and we would have found that the result was 0 and not NaN
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62828);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(0, 1, 0)));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62829);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(0, 0, 1)));

            // Function composition rule for second derivatives is:
            // d2[f(g(x))]/dx2 = f''(g(x)) * [g'(x)]^2 + f'(g(x)) * g''(x)
            // when function f is the a^x root and x = 0 we have:
            // f(0) = 1, f'(0) = ln(a), f''(0) = ln(a)^2 which for a = 0 implies
            // all derivatives keep switching between +infinity and -infinity
            // so given that in our case x represents g, we have g(x) = 0,
            // g'(x) = 1 and g''(x) = 0
            // applying the composition rules gives:
            // d2[f(g(x))]/dx2 = f''(g(x)) * [g'(x)]^2 + f'(g(x)) * g''(x)
            //                 = +infinity * 1^2 + -infinity * 0
            //                 = +infinity + NaN
            //                 = NaN
            // if we knew x is really the x variable and not the identity
            // function applied to x, we would not have computed f'(g(x)) * g''(x)
            // and we would have found that the result was +infinity and not NaN
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62830);if ((((maxOrder > 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62831)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62832)==0&false))) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62833);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(2, 0, 0)));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62834);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(0, 2, 0)));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62835);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(0, 0, 2)));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62836);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(1, 1, 0)));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62837);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(0, 1, 1)));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62838);Assert.assertTrue(Double.isNaN(zeroZero.getPartialDerivative(1, 1, 0)));
            }

        }}

    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testExpression() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1chb9671chj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testExpression",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1chb9671chj(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62839);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62840);double epsilon = 2.5e-13;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62841);for (double x = 0; (((x < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62842)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62843)==0&false)); x += 0.2) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62844);DerivativeStructure dsX = new DerivativeStructure(3, 5, 0, x);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62845);for (double y = 0; (((y < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62846)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62847)==0&false)); y += 0.2) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62848);DerivativeStructure dsY = new DerivativeStructure(3, 5, 1, y);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62849);for (double z = 0; (((z >- 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62850)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62851)==0&false)); z -= 0.2) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62852);DerivativeStructure dsZ = new DerivativeStructure(3, 5, 2, z);

                    // f(x, y, z) = x + 5 x y - 2 z + (8 z x - y)^3
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62853);DerivativeStructure ds =
                            new DerivativeStructure(1, dsX,
                                                    5, dsX.multiply(dsY),
                                                    -2, dsZ,
                                                    1, new DerivativeStructure(8, dsZ.multiply(dsX),
                                                                               -1, dsY).pow(3));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62854);DerivativeStructure dsOther =
                            new DerivativeStructure(1, dsX,
                                                    5, dsX.multiply(dsY),
                                                    -2, dsZ).add(new DerivativeStructure(8, dsZ.multiply(dsX),
                                                                                         -1, dsY).pow(3));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62855);double f = x + 5 * x * y - 2 * z + FastMath.pow(8 * z * x - y, 3);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62856);Assert.assertEquals(f, ds.getValue(),
                                        FastMath.abs(epsilon * f));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62857);Assert.assertEquals(f, dsOther.getValue(),
                                        FastMath.abs(epsilon * f));

                    // df/dx = 1 + 5 y + 24 (8 z x - y)^2 z
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62858);double dfdx = 1 + 5 * y + 24 * z * FastMath.pow(8 * z * x - y, 2);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62859);Assert.assertEquals(dfdx, ds.getPartialDerivative(1, 0, 0),
                                        FastMath.abs(epsilon * dfdx));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62860);Assert.assertEquals(dfdx, dsOther.getPartialDerivative(1, 0, 0),
                                        FastMath.abs(epsilon * dfdx));

                    // df/dxdy = 5 + 48 z*(y - 8 z x)
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62861);double dfdxdy = 5 + 48 * z * (y - 8 * z * x);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62862);Assert.assertEquals(dfdxdy, ds.getPartialDerivative(1, 1, 0),
                                        FastMath.abs(epsilon * dfdxdy));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62863);Assert.assertEquals(dfdxdy, dsOther.getPartialDerivative(1, 1, 0),
                                        FastMath.abs(epsilon * dfdxdy));

                    // df/dxdydz = 48 (y - 16 z x)
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62864);double dfdxdydz = 48 * (y - 16 * z * x);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62865);Assert.assertEquals(dfdxdydz, ds.getPartialDerivative(1, 1, 1),
                                        FastMath.abs(epsilon * dfdxdydz));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62866);Assert.assertEquals(dfdxdydz, dsOther.getPartialDerivative(1, 1, 1),
                                        FastMath.abs(epsilon * dfdxdydz));

                }
                
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCompositionOneVariableX() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mldl71cib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCompositionOneVariableX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mldl71cib(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62867);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62868);double epsilon = 1.0e-13;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62869);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62870)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62871)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62872);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62873)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62874)==0&false)); x += 0.1) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62875);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62876);for (double y = 0.1; (((y < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62877)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62878)==0&false)); y += 0.1) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62879);DerivativeStructure dsY = new DerivativeStructure(1, maxOrder, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62880);DerivativeStructure f = dsX.divide(dsY).sqrt();
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62881);double f0 = FastMath.sqrt(x / y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62882);Assert.assertEquals(f0, f.getValue(), FastMath.abs(epsilon * f0));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62883);if ((((f.getOrder() > 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62884)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62885)==0&false))) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62886);double f1 = 1 / (2 * FastMath.sqrt(x * y));
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62887);Assert.assertEquals(f1, f.getPartialDerivative(1), FastMath.abs(epsilon * f1));
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62888);if ((((f.getOrder() > 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62889)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62890)==0&false))) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62891);double f2 = -f1 / (2 * x); 
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62892);Assert.assertEquals(f2, f.getPartialDerivative(2), FastMath.abs(epsilon * f2));
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62893);if ((((f.getOrder() > 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62894)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62895)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62896);double f3 = (f0 + x / (2 * y * f0)) / (4 * x * x * x); 
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62897);Assert.assertEquals(f3, f.getPartialDerivative(3), FastMath.abs(epsilon * f3));
                            }
                        }}
                    }}
                }}
            }}
        }}        
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTrigo() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149t5yw1cj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTrigo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149t5yw1cj6(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62898);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62899);double epsilon = 2.0e-12;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62900);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62901)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62902)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62903);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62904)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62905)==0&false)); x += 0.1) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62906);DerivativeStructure dsX = new DerivativeStructure(3, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62907);for (double y = 0.1; (((y < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62908)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62909)==0&false)); y += 0.1) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62910);DerivativeStructure dsY = new DerivativeStructure(3, maxOrder, 1, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62911);for (double z = 0.1; (((z < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62912)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62913)==0&false)); z += 0.1) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62914);DerivativeStructure dsZ = new DerivativeStructure(3, maxOrder, 2, z);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62915);DerivativeStructure f = dsX.divide(dsY.cos().add(dsZ.tan())).sin();
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62916);double a = FastMath.cos(y) + FastMath.tan(z);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62917);double f0 = FastMath.sin(x / a);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62918);Assert.assertEquals(f0, f.getValue(), FastMath.abs(epsilon * f0));
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62919);if ((((f.getOrder() > 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62920)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62921)==0&false))) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62922);double dfdx = FastMath.cos(x / a) / a;
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62923);Assert.assertEquals(dfdx, f.getPartialDerivative(1, 0, 0), FastMath.abs(epsilon * dfdx));
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62924);double dfdy =  x * FastMath.sin(y) * dfdx / a;
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62925);Assert.assertEquals(dfdy, f.getPartialDerivative(0, 1, 0), FastMath.abs(epsilon * dfdy));
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62926);double cz = FastMath.cos(z);
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62927);double cz2 = cz * cz;
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62928);double dfdz = -x * dfdx / (a * cz2);
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62929);Assert.assertEquals(dfdz, f.getPartialDerivative(0, 0, 1), FastMath.abs(epsilon * dfdz));
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62930);if ((((f.getOrder() > 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62931)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62932)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62933);double df2dx2 = -(f0 / (a * a));
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62934);Assert.assertEquals(df2dx2, f.getPartialDerivative(2, 0, 0), FastMath.abs(epsilon * df2dx2));
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62935);double df2dy2 = x * FastMath.cos(y) * dfdx / a -
                                                x * x * FastMath.sin(y) * FastMath.sin(y) * f0 / (a * a * a * a) +
                                                2 * FastMath.sin(y) * dfdy / a;
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62936);Assert.assertEquals(df2dy2, f.getPartialDerivative(0, 2, 0), FastMath.abs(epsilon * df2dy2));
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62937);double c4 = cz2 * cz2;
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62938);double df2dz2 = x * (2 * a * (1 - a * cz * FastMath.sin(z)) * dfdx - x * f0 / a ) / (a * a * a * c4);
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62939);Assert.assertEquals(df2dz2, f.getPartialDerivative(0, 0, 2), FastMath.abs(epsilon * df2dz2));
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62940);double df2dxdy = dfdy / x  - x * FastMath.sin(y) * f0 / (a * a * a);
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62941);Assert.assertEquals(df2dxdy, f.getPartialDerivative(1, 1, 0), FastMath.abs(epsilon * df2dxdy));
                            }
                        }}
                    }}
                }}
            }}        
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSqrtDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ldtnw1cke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSqrtDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ldtnw1cke(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62942);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62943);double[] epsilon = new double[] { 5.0e-16, 5.0e-16, 2.0e-15, 5.0e-14, 2.0e-12 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62944);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62945)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62946)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62947);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62948)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62949)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62950);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62951);DerivativeStructure sqrt1 = dsX.pow(0.5);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62952);DerivativeStructure sqrt2 = dsX.sqrt();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62953);DerivativeStructure zero = sqrt1.subtract(sqrt2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62954);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62955)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62956)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62957);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testRootNSingularity() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13aua101cku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testRootNSingularity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13aua101cku(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62958);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62959);for (int n = 2; (((n < 10)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62960)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62961)==0&false)); ++n) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62962);for (int maxOrder = 0; (((maxOrder < 12)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62963)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62964)==0&false)); ++maxOrder) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62965);DerivativeStructure dsZero = new DerivativeStructure(1, maxOrder, 0, 0.0);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62966);DerivativeStructure rootN  = dsZero.rootN(n);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62967);Assert.assertEquals(0.0, rootN.getValue(), 1.0e-20);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62968);if ((((maxOrder > 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62969)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62970)==0&false))) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62971);Assert.assertTrue(Double.isInfinite(rootN.getPartialDerivative(1)));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62972);Assert.assertTrue(rootN.getPartialDerivative(1) > 0);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62973);for (int order = 2; (((order <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62974)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62975)==0&false)); ++order) {{
                        // the following checks shows a LIMITATION of the current implementation
                        // we have no way to tell dsZero is a pure linear variable x = 0
                        // we only say: "dsZero is a structure with value = 0.0,
                        // first derivative = 1.0, second and higher derivatives = 0.0".
                        // Function composition rule for second derivatives is:
                        // d2[f(g(x))]/dx2 = f''(g(x)) * [g'(x)]^2 + f'(g(x)) * g''(x)
                        // when function f is the nth root and x = 0 we have:
                        // f(0) = 0, f'(0) = +infinity, f''(0) = -infinity (and higher
                        // derivatives keep switching between +infinity and -infinity)
                        // so given that in our case dsZero represents g, we have g(x) = 0,
                        // g'(x) = 1 and g''(x) = 0
                        // applying the composition rules gives:
                        // d2[f(g(x))]/dx2 = f''(g(x)) * [g'(x)]^2 + f'(g(x)) * g''(x)
                        //                 = -infinity * 1^2 + +infinity * 0
                        //                 = -infinity + NaN
                        //                 = NaN
                        // if we knew dsZero is really the x variable and not the identity
                        // function applied to x, we would not have computed f'(g(x)) * g''(x)
                        // and we would have found that the result was -infinity and not NaN
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62976);Assert.assertTrue(Double.isNaN(rootN.getPartialDerivative(order)));
                    }
                }}

                // the following shows that the limitation explained above is NOT a bug...
                // if we set up the higher order derivatives for g appropriately, we do
                // compute the higher order derivatives of the composition correctly
                }__CLR4_4_11cc51cc5lb90pbv7.R.inc(62977);double[] gDerivatives = new double[ 1 + maxOrder];
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62978);gDerivatives[0] = 0.0;
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62979);for (int k = 1; (((k <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62980)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62981)==0&false)); ++k) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62982);gDerivatives[k] = FastMath.pow(-1.0, k + 1);
                }
                }__CLR4_4_11cc51cc5lb90pbv7.R.inc(62983);DerivativeStructure correctRoot = new DerivativeStructure(1, maxOrder, gDerivatives).rootN(n);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62984);Assert.assertEquals(0.0, correctRoot.getValue(), 1.0e-20);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(62985);if ((((maxOrder > 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62986)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62987)==0&false))) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62988);Assert.assertTrue(Double.isInfinite(correctRoot.getPartialDerivative(1)));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62989);Assert.assertTrue(correctRoot.getPartialDerivative(1) > 0);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(62990);for (int order = 2; (((order <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62991)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62992)==0&false)); ++order) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62993);Assert.assertTrue(Double.isInfinite(correctRoot.getPartialDerivative(order)));
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(62994);if (((((order % 2) == 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62995)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(62996)==0&false))) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62997);Assert.assertTrue(correctRoot.getPartialDerivative(order) < 0);
                        } }else {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(62998);Assert.assertTrue(correctRoot.getPartialDerivative(order) > 0);
                        }
                    }}
                }}

            }}

        }}

    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSqrtPow2() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),62999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h333al1clz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSqrtPow2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h333al1clz(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(62999);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63000);double[] epsilon = new double[] { 1.0e-16, 3.0e-16, 2.0e-15, 6.0e-14, 6.0e-12 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63001);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63002)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63003)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63004);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63005)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63006)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63007);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63008);DerivativeStructure rebuiltX = dsX.multiply(dsX).sqrt();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63009);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63010);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63011)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63012)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63013);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCbrtDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tjve431cme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCbrtDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tjve431cme(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63014);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63015);double[] epsilon = new double[] { 4.0e-16, 9.0e-16, 6.0e-15, 2.0e-13, 4.0e-12 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63016);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63017)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63018)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63019);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63020)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63021)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63022);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63023);DerivativeStructure cbrt1 = dsX.pow(1.0 / 3.0);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63024);DerivativeStructure cbrt2 = dsX.cbrt();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63025);DerivativeStructure zero = cbrt1.subtract(cbrt2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63026);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63027)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63028)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63029);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCbrtPow3() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14iswb91cmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCbrtPow3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14iswb91cmu(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63030);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63031);double[] epsilon = new double[] { 1.0e-16, 5.0e-16, 8.0e-15, 3.0e-13, 4.0e-11 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63032);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63033)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63034)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63035);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63036)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63037)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63038);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63039);DerivativeStructure rebuiltX = dsX.multiply(dsX.multiply(dsX)).cbrt();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63040);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63041);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63042)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63043)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63044);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPowReciprocalPow() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qz2yzl1cn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPowReciprocalPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qz2yzl1cn9(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63045);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63046);double[] epsilon = new double[] { 2.0e-15, 2.0e-14, 3.0e-13, 8.0e-12, 3.0e-10 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63047);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63048)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63049)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63050);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63051)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63052)==0&false)); x += 0.01) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63053);DerivativeStructure dsX = new DerivativeStructure(2, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63054);for (double y = 0.1; (((y < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63055)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63056)==0&false)); y += 0.01) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63057);DerivativeStructure dsY = new DerivativeStructure(2, maxOrder, 1, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63058);DerivativeStructure rebuiltX = dsX.pow(dsY).pow(dsY.reciprocal());
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63059);DerivativeStructure zero = rebuiltX.subtract(dsX);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63060);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63061)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63062)==0&false)); ++n) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63063);for (int m = 0; (((m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63064)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63065)==0&false)); ++m) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63066);if ((((n + m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63067)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63068)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63069);Assert.assertEquals(0.0, zero.getPartialDerivative(n, m), epsilon[n + m]);
                            }
                        }}
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testHypotDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o7n1h01cny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testHypotDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o7n1h01cny(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63070);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63071);double epsilon = 1.0e-20;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63072);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63073)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63074)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63075);for (double x = -1.7; (((x < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63076)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63077)==0&false)); x += 0.2) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63078);DerivativeStructure dsX = new DerivativeStructure(2, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63079);for (double y = -1.7; (((y < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63080)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63081)==0&false)); y += 0.2) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63082);DerivativeStructure dsY = new DerivativeStructure(2, maxOrder, 1, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63083);DerivativeStructure hypot = DerivativeStructure.hypot(dsY, dsX);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63084);DerivativeStructure ref = dsX.multiply(dsX).add(dsY.multiply(dsY)).sqrt();
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63085);DerivativeStructure zero = hypot.subtract(ref);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63086);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63087)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63088)==0&false)); ++n) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63089);for (int m = 0; (((m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63090)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63091)==0&false)); ++m) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63092);if ((((n + m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63093)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63094)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63095);Assert.assertEquals(0, zero.getPartialDerivative(n, m), epsilon);
                            }
                        }}
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testHypotNoOverflow() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mxmli41coo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testHypotNoOverflow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mxmli41coo(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63096);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63097);DerivativeStructure dsX = new DerivativeStructure(2, 5, 0, +3.0e250);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63098);DerivativeStructure dsY = new DerivativeStructure(2, 5, 1, -4.0e250);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63099);DerivativeStructure hypot = DerivativeStructure.hypot(dsX, dsY);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63100);Assert.assertEquals(5.0e250, hypot.getValue(), 1.0e235);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63101);Assert.assertEquals(dsX.getValue() / hypot.getValue(), hypot.getPartialDerivative(1, 0), 1.0e-10);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63102);Assert.assertEquals(dsY.getValue() / hypot.getValue(), hypot.getPartialDerivative(0, 1), 1.0e-10);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63103);DerivativeStructure sqrt  = dsX.multiply(dsX).add(dsY.multiply(dsY)).sqrt();
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63104);Assert.assertTrue(Double.isInfinite(sqrt.getValue()));

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testHypotNeglectible() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e1x43l1cox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testHypotNeglectible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e1x43l1cox(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63105);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63106);DerivativeStructure dsSmall = new DerivativeStructure(2, 5, 0, +3.0e-10);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63107);DerivativeStructure dsLarge = new DerivativeStructure(2, 5, 1, -4.0e25);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63108);Assert.assertEquals(dsLarge.abs().getValue(),
                            DerivativeStructure.hypot(dsSmall, dsLarge).getValue(),
                            1.0e-10);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63109);Assert.assertEquals(0,
                            DerivativeStructure.hypot(dsSmall, dsLarge).getPartialDerivative(1, 0),
                            1.0e-10);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63110);Assert.assertEquals(-1,
                            DerivativeStructure.hypot(dsSmall, dsLarge).getPartialDerivative(0, 1),
                            1.0e-10);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63111);Assert.assertEquals(dsLarge.abs().getValue(),
                            DerivativeStructure.hypot(dsLarge, dsSmall).getValue(),
                            1.0e-10);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63112);Assert.assertEquals(0,
                            DerivativeStructure.hypot(dsLarge, dsSmall).getPartialDerivative(1, 0),
                            1.0e-10);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63113);Assert.assertEquals(-1,
                            DerivativeStructure.hypot(dsLarge, dsSmall).getPartialDerivative(0, 1),
                            1.0e-10);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testHypotSpecial() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbw87i1cp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testHypotSpecial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbw87i1cp6(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63114);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63115);Assert.assertTrue(Double.isNaN(DerivativeStructure.hypot(new DerivativeStructure(2, 5, 0, Double.NaN),
                                                                 new DerivativeStructure(2, 5, 0, +3.0e250)).getValue()));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63116);Assert.assertTrue(Double.isNaN(DerivativeStructure.hypot(new DerivativeStructure(2, 5, 0, +3.0e250),
                                                                 new DerivativeStructure(2, 5, 0, Double.NaN)).getValue()));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63117);Assert.assertTrue(Double.isInfinite(DerivativeStructure.hypot(new DerivativeStructure(2, 5, 0, Double.POSITIVE_INFINITY),
                                                                      new DerivativeStructure(2, 5, 0, +3.0e250)).getValue()));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63118);Assert.assertTrue(Double.isInfinite(DerivativeStructure.hypot(new DerivativeStructure(2, 5, 0, +3.0e250),
                                                                      new DerivativeStructure(2, 5, 0, Double.POSITIVE_INFINITY)).getValue()));
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testPrimitiveRemainder() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y86qa11cpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testPrimitiveRemainder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y86qa11cpb(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63119);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63120);double epsilon = 1.0e-15;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63121);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63122)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63123)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63124);for (double x = -1.7; (((x < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63125)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63126)==0&false)); x += 0.2) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63127);DerivativeStructure dsX = new DerivativeStructure(2, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63128);for (double y = -1.7; (((y < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63129)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63130)==0&false)); y += 0.2) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63131);DerivativeStructure remainder = dsX.remainder(y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63132);DerivativeStructure ref = dsX.subtract(x - FastMath.IEEEremainder(x, y));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63133);DerivativeStructure zero = remainder.subtract(ref);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63134);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63135)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63136)==0&false)); ++n) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63137);for (int m = 0; (((m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63138)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63139)==0&false)); ++m) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63140);if ((((n + m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63141)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63142)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63143);Assert.assertEquals(0, zero.getPartialDerivative(n, m), epsilon);
                            }
                        }}
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testRemainder() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5fixm1cq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testRemainder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5fixm1cq0(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63144);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63145);double epsilon = 2.0e-15;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63146);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63147)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63148)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63149);for (double x = -1.7; (((x < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63150)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63151)==0&false)); x += 0.2) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63152);DerivativeStructure dsX = new DerivativeStructure(2, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63153);for (double y = -1.7; (((y < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63154)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63155)==0&false)); y += 0.2) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63156);DerivativeStructure dsY = new DerivativeStructure(2, maxOrder, 1, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63157);DerivativeStructure remainder = dsX.remainder(dsY);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63158);DerivativeStructure ref = dsX.subtract(dsY.multiply((x - FastMath.IEEEremainder(x, y)) / y));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63159);DerivativeStructure zero = remainder.subtract(ref);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63160);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63161)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63162)==0&false)); ++n) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63163);for (int m = 0; (((m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63164)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63165)==0&false)); ++m) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63166);if ((((n + m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63167)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63168)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63169);Assert.assertEquals(0, zero.getPartialDerivative(n, m), epsilon);
                            }
                        }}
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Override
    @Test
    public void testExp() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdnn6a1cqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testExp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdnn6a1cqq(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63170);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63171);double[] epsilon = new double[] { 1.0e-16, 1.0e-16, 1.0e-16, 1.0e-16, 1.0e-16 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63172);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63173)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63174)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63175);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63176)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63177)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63178);double refExp = FastMath.exp(x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63179);DerivativeStructure exp = new DerivativeStructure(1, maxOrder, 0, x).exp();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63180);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63181)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63182)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63183);Assert.assertEquals(refExp, exp.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testExpm1Definition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrwnlj1cr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testExpm1Definition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrwnlj1cr4(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63184);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63185);double epsilon = 3.0e-16;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63186);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63187)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63188)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63189);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63190)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63191)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63192);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63193);DerivativeStructure expm11 = dsX.expm1();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63194);DerivativeStructure expm12 = dsX.exp().subtract(dsX.getField().getOne());
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63195);DerivativeStructure zero = expm11.subtract(expm12);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63196);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63197)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63198)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63199);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Override
    @Test
    public void testLog() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5ksyv1crk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLog",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5ksyv1crk(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63200);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63201);double[] epsilon = new double[] { 1.0e-16, 1.0e-16, 3.0e-14, 7.0e-13, 3.0e-11 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63202);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63203)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63204)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63205);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63206)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63207)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63208);DerivativeStructure log = new DerivativeStructure(1, maxOrder, 0, x).log();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63209);Assert.assertEquals(FastMath.log(x), log.getValue(), epsilon[0]);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63210);for (int n = 1; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63211)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63212)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63213);double refDer = -CombinatoricsUtils.factorial(n - 1) / FastMath.pow(-x, n);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63214);Assert.assertEquals(refDer, log.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLog1pDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11d776z1crz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLog1pDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63215,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11d776z1crz(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63215);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63216);double epsilon = 3.0e-16;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63217);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63218)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63219)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63220);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63221)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63222)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63223);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63224);DerivativeStructure log1p1 = dsX.log1p();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63225);DerivativeStructure log1p2 = dsX.add(dsX.getField().getOne()).log();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63226);DerivativeStructure zero = log1p1.subtract(log1p2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63227);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63228)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63229)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63230);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLog10Definition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_155xvkl1csf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLog10Definition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_155xvkl1csf(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63231);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63232);double[] epsilon = new double[] { 3.0e-16, 3.0e-16, 8.0e-15, 3.0e-13, 8.0e-12 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63233);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63234)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63235)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63236);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63237)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63238)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63239);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63240);DerivativeStructure log101 = dsX.log10();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63241);DerivativeStructure log102 = dsX.log().divide(FastMath.log(10.0));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63242);DerivativeStructure zero = log101.subtract(log102);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63243);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63244)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63245)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63246);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLogExp() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mpx8ku1csv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLogExp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mpx8ku1csv(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63247);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63248);double[] epsilon = new double[] { 2.0e-16, 2.0e-16, 3.0e-16, 2.0e-15, 6.0e-15 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63249);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63250)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63251)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63252);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63253)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63254)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63255);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63256);DerivativeStructure rebuiltX = dsX.exp().log();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63257);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63258);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63259)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63260)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63261);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLog1pExpm1() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vum02f1cta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLog1pExpm1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vum02f1cta(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63262);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63263);double[] epsilon = new double[] { 6.0e-17, 3.0e-16, 5.0e-16, 9.0e-16, 6.0e-15 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63264);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63265)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63266)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63267);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63268)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63269)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63270);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63271);DerivativeStructure rebuiltX = dsX.expm1().log1p();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63272);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63273);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63274)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63275)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63276);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLog10Power() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nlmjf1ctp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLog10Power",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63277,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nlmjf1ctp(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63277);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63278);double[] epsilon = new double[] { 3.0e-16, 3.0e-16, 9.0e-16, 6.0e-15, 6.0e-14 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63279);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63280)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63281)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63282);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63283)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63284)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63285);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63286);DerivativeStructure rebuiltX = new DerivativeStructure(1, maxOrder, 10.0).pow(dsX).log10();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63287);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63288);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63289)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63290)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63291);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSinCos() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ubr2so1cu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSinCos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ubr2so1cu4(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63292);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63293);double epsilon = 5.0e-16;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63294);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63295)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63296)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63297);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63298)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63299)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63300);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63301);DerivativeStructure sin = dsX.sin();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63302);DerivativeStructure cos = dsX.cos();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63303);double s = FastMath.sin(x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63304);double c = FastMath.cos(x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63305);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63306)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63307)==0&false)); ++n) {{
                    boolean __CLB4_4_1_bool0=false;__CLR4_4_11cc51cc5lb90pbv7.R.inc(63308);switch (n % 4) {
                    case 0 :if (!__CLB4_4_1_bool0) {__CLR4_4_11cc51cc5lb90pbv7.R.inc(63309);__CLB4_4_1_bool0=true;}
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63310);Assert.assertEquals( s, sin.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63311);Assert.assertEquals( c, cos.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63312);break;
                    case 1 :if (!__CLB4_4_1_bool0) {__CLR4_4_11cc51cc5lb90pbv7.R.inc(63313);__CLB4_4_1_bool0=true;}
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63314);Assert.assertEquals( c, sin.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63315);Assert.assertEquals(-s, cos.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63316);break;
                    case 2 :if (!__CLB4_4_1_bool0) {__CLR4_4_11cc51cc5lb90pbv7.R.inc(63317);__CLB4_4_1_bool0=true;}
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63318);Assert.assertEquals(-s, sin.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63319);Assert.assertEquals(-c, cos.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63320);break;
                    default :if (!__CLB4_4_1_bool0) {__CLR4_4_11cc51cc5lb90pbv7.R.inc(63321);__CLB4_4_1_bool0=true;}
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63322);Assert.assertEquals(-c, sin.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63323);Assert.assertEquals( s, cos.getPartialDerivative(n), epsilon);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63324);break;
                    }
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSinAsin() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3zvr81cv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSinAsin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3zvr81cv1(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63325);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63326);double[] epsilon = new double[] { 3.0e-16, 5.0e-16, 3.0e-15, 2.0e-14, 4.0e-13 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63327);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63328)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63329)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63330);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63331)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63332)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63333);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63334);DerivativeStructure rebuiltX = dsX.sin().asin();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63335);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63336);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63337)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63338)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63339);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCosAcos() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_141x55q1cvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCosAcos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_141x55q1cvg(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63340);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63341);double[] epsilon = new double[] { 6.0e-16, 6.0e-15, 2.0e-13, 4.0e-12, 2.0e-10 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63342);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63343)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63344)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63345);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63346)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63347)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63348);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63349);DerivativeStructure rebuiltX = dsX.cos().acos();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63350);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63351);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63352)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63353)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63354);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTanAtan() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvaze21cvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTanAtan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63355,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvaze21cvv(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63355);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63356);double[] epsilon = new double[] { 6.0e-17, 2.0e-16, 2.0e-15, 4.0e-14, 2.0e-12 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63357);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63358)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63359)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63360);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63361)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63362)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63363);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63364);DerivativeStructure rebuiltX = dsX.tan().atan();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63365);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63366);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63367)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63368)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63369);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTangentDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m2jk3x1cwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTangentDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m2jk3x1cwa(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63370);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63371);double[] epsilon = new double[] { 5.0e-16, 2.0e-15, 3.0e-14, 5.0e-13, 2.0e-11 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63372);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63373)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63374)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63375);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63376)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63377)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63378);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63379);DerivativeStructure tan1 = dsX.sin().divide(dsX.cos());
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63380);DerivativeStructure tan2 = dsX.tan();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63381);DerivativeStructure zero = tan1.subtract(tan2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63382);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63383)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63384)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63385);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Override
    @Test
    public void testAtan2() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhqhrb1cwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testAtan2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhqhrb1cwq(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63386);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63387);double[] epsilon = new double[] { 5.0e-16, 3.0e-15, 2.2e-14, 1.0e-12, 8.0e-11 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63388);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63389)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63390)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63391);for (double x = -1.7; (((x < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63392)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63393)==0&false)); x += 0.2) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63394);DerivativeStructure dsX = new DerivativeStructure(2, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63395);for (double y = -1.7; (((y < 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63396)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63397)==0&false)); y += 0.2) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63398);DerivativeStructure dsY = new DerivativeStructure(2, maxOrder, 1, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63399);DerivativeStructure atan2 = DerivativeStructure.atan2(dsY, dsX);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63400);DerivativeStructure ref = dsY.divide(dsX).atan();
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63401);if ((((x < 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63402)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63403)==0&false))) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63404);ref = ((((y < 0) )&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63405)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63406)==0&false))? ref.subtract(FastMath.PI) : ref.add(FastMath.PI);
                    }
                    }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63407);DerivativeStructure zero = atan2.subtract(ref);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63408);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63409)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63410)==0&false)); ++n) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63411);for (int m = 0; (((m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63412)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63413)==0&false)); ++m) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63414);if ((((n + m <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63415)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63416)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63417);Assert.assertEquals(0, zero.getPartialDerivative(n, m), epsilon[n + m]);
                            }
                        }}
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testAtan2SpecialCases() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13438331cxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testAtan2SpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13438331cxm(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63418);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63419);DerivativeStructure pp =
                DerivativeStructure.atan2(new DerivativeStructure(2, 2, 1, +0.0),
                                          new DerivativeStructure(2, 2, 1, +0.0));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63420);Assert.assertEquals(0, pp.getValue(), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63421);Assert.assertEquals(+1, FastMath.copySign(1, pp.getValue()), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63422);DerivativeStructure pn =
                DerivativeStructure.atan2(new DerivativeStructure(2, 2, 1, +0.0),
                                          new DerivativeStructure(2, 2, 1, -0.0));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63423);Assert.assertEquals(FastMath.PI, pn.getValue(), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63424);DerivativeStructure np =
                DerivativeStructure.atan2(new DerivativeStructure(2, 2, 1, -0.0),
                                          new DerivativeStructure(2, 2, 1, +0.0));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63425);Assert.assertEquals(0, np.getValue(), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63426);Assert.assertEquals(-1, FastMath.copySign(1, np.getValue()), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63427);DerivativeStructure nn =
                DerivativeStructure.atan2(new DerivativeStructure(2, 2, 1, -0.0),
                                          new DerivativeStructure(2, 2, 1, -0.0));
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63428);Assert.assertEquals(-FastMath.PI, nn.getValue(), 1.0e-15);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSinhDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1my6tb01cxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSinhDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1my6tb01cxx(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63429);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63430);double[] epsilon = new double[] { 3.0e-16, 3.0e-16, 5.0e-16, 2.0e-15, 6.0e-15 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63431);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63432)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63433)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63434);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63435)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63436)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63437);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63438);DerivativeStructure sinh1 = dsX.exp().subtract(dsX.exp().reciprocal()).multiply(0.5);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63439);DerivativeStructure sinh2 = dsX.sinh();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63440);DerivativeStructure zero = sinh1.subtract(sinh2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63441);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63442)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63443)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63444);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCoshDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5tv0z1cyd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCoshDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5tv0z1cyd(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63445);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63446);double[] epsilon = new double[] { 3.0e-16, 3.0e-16, 5.0e-16, 2.0e-15, 6.0e-15 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63447);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63448)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63449)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63450);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63451)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63452)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63453);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63454);DerivativeStructure cosh1 = dsX.exp().add(dsX.exp().reciprocal()).multiply(0.5);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63455);DerivativeStructure cosh2 = dsX.cosh();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63456);DerivativeStructure zero = cosh1.subtract(cosh2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63457);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63458)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63459)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63460);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTanhDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guager1cyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTanhDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guager1cyt(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63461);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63462);double[] epsilon = new double[] { 3.0e-16, 5.0e-16, 7.0e-16, 3.0e-15, 2.0e-14 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63463);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63464)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63465)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63466);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63467)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63468)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63469);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63470);DerivativeStructure tanh1 = dsX.exp().subtract(dsX.exp().reciprocal()).divide(dsX.exp().add(dsX.exp().reciprocal()));
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63471);DerivativeStructure tanh2 = dsX.tanh();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63472);DerivativeStructure zero = tanh1.subtract(tanh2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63473);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63474)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63475)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63476);Assert.assertEquals(0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSinhAsinh() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16qart61cz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSinhAsinh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16qart61cz9(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63477);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63478);double[] epsilon = new double[] { 3.0e-16, 3.0e-16, 4.0e-16, 7.0e-16, 3.0e-15, 8.0e-15 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63479);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63480)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63481)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63482);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63483)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63484)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63485);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63486);DerivativeStructure rebuiltX = dsX.sinh().asinh();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63487);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63488);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63489)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63490)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63491);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCoshAcosh() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kda65m1czo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCoshAcosh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kda65m1czo(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63492);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63493);double[] epsilon = new double[] { 2.0e-15, 1.0e-14, 2.0e-13, 6.0e-12, 3.0e-10, 2.0e-8 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63494);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63495)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63496)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63497);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63498)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63499)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63500);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63501);DerivativeStructure rebuiltX = dsX.cosh().acosh();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63502);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63503);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63504)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63505)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63506);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTanhAtanh() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12cp23u1d03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTanhAtanh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12cp23u1d03(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63507);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63508);double[] epsilon = new double[] { 3.0e-16, 2.0e-16, 7.0e-16, 4.0e-15, 3.0e-14, 4.0e-13 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63509);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63510)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63511)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63512);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63513)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63514)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63515);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63516);DerivativeStructure rebuiltX = dsX.tanh().atanh();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63517);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63518);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63519)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63520)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63521);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCompositionOneVariableY() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12dlesq1d0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCompositionOneVariableY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12dlesq1d0i(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63522);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63523);double epsilon = 1.0e-13;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63524);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63525)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63526)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63527);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63528)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63529)==0&false)); x += 0.1) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63530);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63531);for (double y = 0.1; (((y < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63532)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63533)==0&false)); y += 0.1) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63534);DerivativeStructure dsY = new DerivativeStructure(1, maxOrder, 0, y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63535);DerivativeStructure f = dsX.divide(dsY).sqrt();
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63536);double f0 = FastMath.sqrt(x / y);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63537);Assert.assertEquals(f0, f.getValue(), FastMath.abs(epsilon * f0));
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63538);if ((((f.getOrder() > 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63539)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63540)==0&false))) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63541);double f1 = -x / (2 * y * y * f0);
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63542);Assert.assertEquals(f1, f.getPartialDerivative(1), FastMath.abs(epsilon * f1));
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63543);if ((((f.getOrder() > 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63544)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63545)==0&false))) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63546);double f2 = (f0 - x / (4 * y * f0)) / (y * y); 
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63547);Assert.assertEquals(f2, f.getPartialDerivative(2), FastMath.abs(epsilon * f2));
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63548);if ((((f.getOrder() > 2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63549)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63550)==0&false))) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63551);double f3 = (x / (8 * y * f0) - 2 * f0) / (y * y * y); 
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63552);Assert.assertEquals(f3, f.getPartialDerivative(3), FastMath.abs(epsilon * f3));
                            }
                        }}
                    }}
                }}
            }}
        }}        
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTaylorPolynomial() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kywxjk1d1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTaylorPolynomial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kywxjk1d1d(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63553);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63554);for (double x = 0; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63555)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63556)==0&false)); x += 0.1) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63557);DerivativeStructure dsX = new DerivativeStructure(3, 4, 0, x);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63558);for (double y = 0; (((y < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63559)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63560)==0&false)); y += 0.2) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63561);DerivativeStructure dsY = new DerivativeStructure(3, 4, 1, y);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63562);for (double z = 0; (((z < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63563)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63564)==0&false)); z += 0.2) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63565);DerivativeStructure dsZ = new DerivativeStructure(3, 4, 2, z);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63566);DerivativeStructure f = dsX.multiply(dsY).add(dsZ).multiply(dsX).multiply(dsY);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63567);for (double dx = -0.2; (((dx < 0.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63568)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63569)==0&false)); dx += 0.2) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63570);for (double dy = -0.2; (((dy < 0.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63571)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63572)==0&false)); dy += 0.1) {{
                            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63573);for (double dz = -0.2; (((dz < 0.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63574)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63575)==0&false)); dz += 0.1) {{
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63576);double ref = (x + dx) * (y + dy) * ((x + dx) * (y + dy) + (z + dz));
                                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63577);Assert.assertEquals(ref, f.taylor(dx, dy, dz), 2.0e-15);
                            }
                        }}
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testTaylorAtan2() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19fg4yk1d22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testTaylorAtan2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19fg4yk1d22(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63578);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63579);double[] expected = new double[] { 0.214, 0.0241, 0.00422, 6.48e-4, 8.04e-5 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63580);double x0 =  0.1;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63581);double y0 = -0.3;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63582);for (int maxOrder = 0; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63583)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63584)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63585);DerivativeStructure dsX   = new DerivativeStructure(2, maxOrder, 0, x0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63586);DerivativeStructure dsY   = new DerivativeStructure(2, maxOrder, 1, y0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63587);DerivativeStructure atan2 = DerivativeStructure.atan2(dsY, dsX);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63588);double maxError = 0;
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63589);for (double dx = -0.05; (((dx < 0.05)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63590)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63591)==0&false)); dx += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63592);for (double dy = -0.05; (((dy < 0.05)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63593)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63594)==0&false)); dy += 0.001) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63595);double ref = FastMath.atan2(y0 + dy, x0 + dx);
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63596);maxError = FastMath.max(maxError, FastMath.abs(ref - atan2.taylor(dx, dy)));
                }
            }}
            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63597);Assert.assertEquals(0.0, expected[maxOrder] - maxError, 0.01 * expected[maxOrder]);
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Override
    @Test
    public void testAbs() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wuf1d2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wuf1d2m(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63598);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63599);DerivativeStructure minusOne = new DerivativeStructure(1, 1, 0, -1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63600);Assert.assertEquals(+1.0, minusOne.abs().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63601);Assert.assertEquals(-1.0, minusOne.abs().getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63602);DerivativeStructure plusOne = new DerivativeStructure(1, 1, 0, +1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63603);Assert.assertEquals(+1.0, plusOne.abs().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63604);Assert.assertEquals(+1.0, plusOne.abs().getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63605);DerivativeStructure minusZero = new DerivativeStructure(1, 1, 0, -0.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63606);Assert.assertEquals(+0.0, minusZero.abs().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63607);Assert.assertEquals(-1.0, minusZero.abs().getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63608);DerivativeStructure plusZero = new DerivativeStructure(1, 1, 0, +0.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63609);Assert.assertEquals(+0.0, plusZero.abs().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63610);Assert.assertEquals(+1.0, plusZero.abs().getPartialDerivative(1), 1.0e-15);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Override
    @Test
    public void testSignum() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17nnk9e1d2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSignum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17nnk9e1d2z(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63611);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63612);DerivativeStructure minusOne = new DerivativeStructure(1, 1, 0, -1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63613);Assert.assertEquals(-1.0, minusOne.signum().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63614);Assert.assertEquals( 0.0, minusOne.signum().getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63615);DerivativeStructure plusOne = new DerivativeStructure(1, 1, 0, +1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63616);Assert.assertEquals(+1.0, plusOne.signum().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63617);Assert.assertEquals( 0.0, plusOne.signum().getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63618);DerivativeStructure minusZero = new DerivativeStructure(1, 1, 0, -0.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63619);Assert.assertEquals(-0.0, minusZero.signum().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63620);Assert.assertTrue(Double.doubleToLongBits(minusZero.signum().getValue()) < 0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63621);Assert.assertEquals( 0.0, minusZero.signum().getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63622);DerivativeStructure plusZero = new DerivativeStructure(1, 1, 0, +0.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63623);Assert.assertEquals(+0.0, plusZero.signum().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63624);Assert.assertTrue(Double.doubleToLongBits(plusZero.signum().getValue()) == 0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63625);Assert.assertEquals( 0.0, plusZero.signum().getPartialDerivative(1), 1.0e-15);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCeilFloorRintLong() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c52ro51d3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCeilFloorRintLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c52ro51d3e(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63626);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63627);DerivativeStructure x = new DerivativeStructure(1, 1, 0, -1.5);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63628);Assert.assertEquals(-1.5, x.getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63629);Assert.assertEquals(+1.0, x.getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63630);Assert.assertEquals(-1.0, x.ceil().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63631);Assert.assertEquals(+0.0, x.ceil().getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63632);Assert.assertEquals(-2.0, x.floor().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63633);Assert.assertEquals(+0.0, x.floor().getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63634);Assert.assertEquals(-2.0, x.rint().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63635);Assert.assertEquals(+0.0, x.rint().getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63636);Assert.assertEquals(-2.0, x.subtract(x.getField().getOne()).rint().getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63637);Assert.assertEquals(-1l, x.round());

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCopySign() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kluukr1d3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCopySign",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kluukr1d3q(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63638);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63639);DerivativeStructure minusOne = new DerivativeStructure(1, 1, 0, -1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63640);Assert.assertEquals(+1.0, minusOne.copySign(+1.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63641);Assert.assertEquals(-1.0, minusOne.copySign(+1.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63642);Assert.assertEquals(-1.0, minusOne.copySign(-1.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63643);Assert.assertEquals(+1.0, minusOne.copySign(-1.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63644);Assert.assertEquals(+1.0, minusOne.copySign(+0.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63645);Assert.assertEquals(-1.0, minusOne.copySign(+0.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63646);Assert.assertEquals(-1.0, minusOne.copySign(-0.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63647);Assert.assertEquals(+1.0, minusOne.copySign(-0.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63648);Assert.assertEquals(+1.0, minusOne.copySign(Double.NaN).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63649);Assert.assertEquals(-1.0, minusOne.copySign(Double.NaN).getPartialDerivative(1), 1.0e-15);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63650);DerivativeStructure plusOne = new DerivativeStructure(1, 1, 0, +1.0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63651);Assert.assertEquals(+1.0, plusOne.copySign(+1.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63652);Assert.assertEquals(+1.0, plusOne.copySign(+1.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63653);Assert.assertEquals(-1.0, plusOne.copySign(-1.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63654);Assert.assertEquals(-1.0, plusOne.copySign(-1.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63655);Assert.assertEquals(+1.0, plusOne.copySign(+0.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63656);Assert.assertEquals(+1.0, plusOne.copySign(+0.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63657);Assert.assertEquals(-1.0, plusOne.copySign(-0.0).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63658);Assert.assertEquals(-1.0, plusOne.copySign(-0.0).getPartialDerivative(1), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63659);Assert.assertEquals(+1.0, plusOne.copySign(Double.NaN).getPartialDerivative(0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63660);Assert.assertEquals(+1.0, plusOne.copySign(Double.NaN).getPartialDerivative(1), 1.0e-15);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testToDegreesDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbvqs41d4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testToDegreesDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbvqs41d4d(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63661);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63662);double epsilon = 3.0e-16;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63663);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63664)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63665)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63666);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63667)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63668)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63669);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63670);Assert.assertEquals(FastMath.toDegrees(x), dsX.toDegrees().getValue(), epsilon);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63671);for (int n = 1; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63672)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63673)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63674);if ((((n == 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63675)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63676)==0&false))) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63677);Assert.assertEquals(180 / FastMath.PI, dsX.toDegrees().getPartialDerivative(1), epsilon);
                    } }else {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63678);Assert.assertEquals(0.0, dsX.toDegrees().getPartialDerivative(n), epsilon);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testToRadiansDefinition() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zgs9z31d4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testToRadiansDefinition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zgs9z31d4v(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63679);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63680);double epsilon = 3.0e-16;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63681);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63682)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63683)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63684);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63685)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63686)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63687);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63688);Assert.assertEquals(FastMath.toRadians(x), dsX.toRadians().getValue(), epsilon);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63689);for (int n = 1; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63690)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63691)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63692);if ((((n == 1)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63693)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63694)==0&false))) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63695);Assert.assertEquals(FastMath.PI / 180, dsX.toRadians().getPartialDerivative(1), epsilon);
                    } }else {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63696);Assert.assertEquals(0.0, dsX.toRadians().getPartialDerivative(n), epsilon);
                    }
                }}
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testDegRad() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hv8by01d5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testDegRad",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hv8by01d5d(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63697);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63698);double epsilon = 3.0e-16;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63699);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63700)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63701)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63702);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63703)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63704)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63705);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63706);DerivativeStructure rebuiltX = dsX.toDegrees().toRadians();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63707);DerivativeStructure zero = rebuiltX.subtract(dsX);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63708);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63709)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63710)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63711);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testComposeMismatchedDimensions() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgc8tb1d5s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,111,115,101,77,105,115,109,97,116,99,104,101,100,68,105,109,101,110,115,105,111,110,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testComposeMismatchedDimensions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63712,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgc8tb1d5s(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63712);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63713);new DerivativeStructure(1, 3, 0, 1.2).compose(new double[3]);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testCompose() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i5jaf1d5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testCompose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i5jaf1d5u(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63714);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63715);double[] epsilon = new double[] { 1.0e-20, 5.0e-14, 2.0e-13, 3.0e-13, 2.0e-13, 1.0e-20 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63716);PolynomialFunction poly =
                new PolynomialFunction(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 });
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63717);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63718)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63719)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63720);PolynomialFunction[] p = new PolynomialFunction[maxOrder + 1];
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63721);p[0] = poly;
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63722);for (int i = 1; (((i <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63723)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63724)==0&false)); ++i) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63725);p[i] = p[i - 1].polynomialDerivative();
            }
            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63726);for (double x = 0.1; (((x < 1.2)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63727)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63728)==0&false)); x += 0.001) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63729);DerivativeStructure dsX = new DerivativeStructure(1, maxOrder, 0, x);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63730);DerivativeStructure dsY1 = dsX.getField().getZero();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63731);for (int i = poly.degree(); (((i >= 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63732)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63733)==0&false)); --i) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63734);dsY1 = dsY1.multiply(dsX).add(poly.getCoefficients()[i]);
                }
                }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63735);double[] f = new double[maxOrder + 1];
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63736);for (int i = 0; (((i < f.length)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63737)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63738)==0&false)); ++i) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63739);f[i] = p[i].value(x);
                }
                }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63740);DerivativeStructure dsY2 = dsX.compose(f);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63741);DerivativeStructure zero = dsY1.subtract(dsY2);
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63742);for (int n = 0; (((n <= maxOrder)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63743)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63744)==0&false)); ++n) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63745);Assert.assertEquals(0.0, zero.getPartialDerivative(n), epsilon[n]);
                }
            }}
        }}
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testField() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rewh5b1d6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rewh5b1d6q(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63746);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63747);for (int maxOrder = 1; (((maxOrder < 5)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63748)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63749)==0&false)); ++maxOrder) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63750);DerivativeStructure x = new DerivativeStructure(3, maxOrder, 0, 1.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63751);checkF0F1(x.getField().getZero(), 0.0, 0.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63752);checkF0F1(x.getField().getOne(), 1.0, 0.0, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63753);Assert.assertEquals(maxOrder, x.getField().getZero().getOrder());
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63754);Assert.assertEquals(3, x.getField().getZero().getFreeParameters());
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63755);Assert.assertEquals(DerivativeStructure.class, x.getField().getRuntimeClass());
        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testOneParameterConstructor() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g63odw1d70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testOneParameterConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g63odw1d70(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63756);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63757);double x = 1.2;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63758);double cos = FastMath.cos(x);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63759);double sin = FastMath.sin(x);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63760);DerivativeStructure yRef = new DerivativeStructure(1, 4, 0, x).cos();
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63761);try {
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63762);new DerivativeStructure(1, 4, 0.0, 0.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63763);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException dme) {
            // expected
        } catch (Exception e) {
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63764);Assert.fail("wrong exceptionc caught " + e.getClass().getName());
        }
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63765);double[] derivatives = new double[] { cos, -sin, -cos, sin, cos };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63766);DerivativeStructure y = new DerivativeStructure(1,  4, derivatives);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63767);checkEquals(yRef, y, 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63768);TestUtils.assertEquals(derivatives, y.getAllDerivatives(), 1.0e-15);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testOneOrderConstructor() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bgmdeh1d7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testOneOrderConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bgmdeh1d7d(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63769);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63770);double x =  1.2;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63771);double y =  2.4;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63772);double z = 12.5;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63773);DerivativeStructure xRef = new DerivativeStructure(3, 1, 0, x);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63774);DerivativeStructure yRef = new DerivativeStructure(3, 1, 1, y);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63775);DerivativeStructure zRef = new DerivativeStructure(3, 1, 2, z);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63776);try {
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63777);new DerivativeStructure(3, 1, x + y - z, 1.0, 1.0);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63778);Assert.fail("an exception should have been thrown");
        } catch (DimensionMismatchException dme) {
            // expected
        } catch (Exception e) {
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63779);Assert.fail("wrong exceptionc caught " + e.getClass().getName());
        }
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63780);double[] derivatives = new double[] { x + y - z, 1.0, 1.0, -1.0 };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63781);DerivativeStructure t = new DerivativeStructure(3, 1, derivatives);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63782);checkEquals(xRef.add(yRef.subtract(zRef)), t, 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63783);TestUtils.assertEquals(derivatives, xRef.add(yRef.subtract(zRef)).getAllDerivatives(), 1.0e-15);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLinearCombination1DSDS() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwmiri1d7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLinearCombination1DSDS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwmiri1d7s(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63784);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63785);final DerivativeStructure[] a = new DerivativeStructure[] {
            new DerivativeStructure(6, 1, 0, -1321008684645961.0 / 268435456.0),
            new DerivativeStructure(6, 1, 1, -5774608829631843.0 / 268435456.0),
            new DerivativeStructure(6, 1, 2, -7645843051051357.0 / 8589934592.0)
        };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63786);final DerivativeStructure[] b = new DerivativeStructure[] {
            new DerivativeStructure(6, 1, 3, -5712344449280879.0 / 2097152.0),
            new DerivativeStructure(6, 1, 4, -4550117129121957.0 / 2097152.0),
            new DerivativeStructure(6, 1, 5, 8846951984510141.0 / 131072.0)
        };

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63787);final DerivativeStructure abSumInline = a[0].linearCombination(a[0], b[0], a[1], b[1], a[2], b[2]);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63788);final DerivativeStructure abSumArray = a[0].linearCombination(a, b);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63789);Assert.assertEquals(abSumInline.getValue(), abSumArray.getValue(), 0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63790);Assert.assertEquals(-1.8551294182586248737720779899, abSumInline.getValue(), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63791);Assert.assertEquals(b[0].getValue(), abSumInline.getPartialDerivative(1, 0, 0, 0, 0, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63792);Assert.assertEquals(b[1].getValue(), abSumInline.getPartialDerivative(0, 1, 0, 0, 0, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63793);Assert.assertEquals(b[2].getValue(), abSumInline.getPartialDerivative(0, 0, 1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63794);Assert.assertEquals(a[0].getValue(), abSumInline.getPartialDerivative(0, 0, 0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63795);Assert.assertEquals(a[1].getValue(), abSumInline.getPartialDerivative(0, 0, 0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63796);Assert.assertEquals(a[2].getValue(), abSumInline.getPartialDerivative(0, 0, 0, 0, 0, 1), 1.0e-15);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLinearCombination1DoubleDS() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17boin41d85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLinearCombination1DoubleDS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17boin41d85(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63797);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63798);final double[] a = new double[] {
            -1321008684645961.0 / 268435456.0,
            -5774608829631843.0 / 268435456.0,
            -7645843051051357.0 / 8589934592.0
        };
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63799);final DerivativeStructure[] b = new DerivativeStructure[] {
            new DerivativeStructure(3, 1, 0, -5712344449280879.0 / 2097152.0),
            new DerivativeStructure(3, 1, 1, -4550117129121957.0 / 2097152.0),
            new DerivativeStructure(3, 1, 2, 8846951984510141.0 / 131072.0)
        };

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63800);final DerivativeStructure abSumInline = b[0].linearCombination(a[0], b[0],
                                                                       a[1], b[1],
                                                                       a[2], b[2]);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63801);final DerivativeStructure abSumArray = b[0].linearCombination(a, b);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63802);Assert.assertEquals(abSumInline.getValue(), abSumArray.getValue(), 0);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63803);Assert.assertEquals(-1.8551294182586248737720779899, abSumInline.getValue(), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63804);Assert.assertEquals(a[0], abSumInline.getPartialDerivative(1, 0, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63805);Assert.assertEquals(a[1], abSumInline.getPartialDerivative(0, 1, 0), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63806);Assert.assertEquals(a[2], abSumInline.getPartialDerivative(0, 0, 1), 1.0e-15);

    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLinearCombination2DSDS() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trhnoh1d8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLinearCombination2DSDS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trhnoh1d8f(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63807);
        // we compare accurate versus naive dot product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63808);Well1024a random = new Well1024a(0xc6af886975069f11l);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63809);for (int i = 0; (((i < 10000)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63810)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63811)==0&false)); ++i) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63812);final DerivativeStructure[] u = new DerivativeStructure[4];
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63813);final DerivativeStructure[] v = new DerivativeStructure[4];
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63814);for (int j = 0; (((j < u.length)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63815)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63816)==0&false)); ++j) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63817);u[j] = new DerivativeStructure(u.length, 1, j, 1e17 * random.nextDouble());
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63818);v[j] = new DerivativeStructure(u.length, 1, 1e17 * random.nextDouble());
            }

            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63819);DerivativeStructure lin = u[0].linearCombination(u[0], v[0], u[1], v[1]);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63820);double ref = u[0].getValue() * v[0].getValue() +
                         u[1].getValue() * v[1].getValue();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63821);Assert.assertEquals(ref, lin.getValue(), 1.0e-15 * FastMath.abs(ref));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63822);Assert.assertEquals(v[0].getValue(), lin.getPartialDerivative(1, 0, 0, 0), 1.0e-15 * FastMath.abs(v[0].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63823);Assert.assertEquals(v[1].getValue(), lin.getPartialDerivative(0, 1, 0, 0), 1.0e-15 * FastMath.abs(v[1].getValue()));

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63824);lin = u[0].linearCombination(u[0], v[0], u[1], v[1], u[2], v[2]);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63825);ref = u[0].getValue() * v[0].getValue() +
                  u[1].getValue() * v[1].getValue() +
                  u[2].getValue() * v[2].getValue();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63826);Assert.assertEquals(ref, lin.getValue(), 1.0e-15 * FastMath.abs(ref));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63827);Assert.assertEquals(v[0].getValue(), lin.getPartialDerivative(1, 0, 0, 0), 1.0e-15 * FastMath.abs(v[0].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63828);Assert.assertEquals(v[1].getValue(), lin.getPartialDerivative(0, 1, 0, 0), 1.0e-15 * FastMath.abs(v[1].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63829);Assert.assertEquals(v[2].getValue(), lin.getPartialDerivative(0, 0, 1, 0), 1.0e-15 * FastMath.abs(v[2].getValue()));

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63830);lin = u[0].linearCombination(u[0], v[0], u[1], v[1], u[2], v[2], u[3], v[3]);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63831);ref = u[0].getValue() * v[0].getValue() +
                  u[1].getValue() * v[1].getValue() +
                  u[2].getValue() * v[2].getValue() +
                  u[3].getValue() * v[3].getValue();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63832);Assert.assertEquals(ref, lin.getValue(), 1.0e-15 * FastMath.abs(ref));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63833);Assert.assertEquals(v[0].getValue(), lin.getPartialDerivative(1, 0, 0, 0), 1.0e-15 * FastMath.abs(v[0].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63834);Assert.assertEquals(v[1].getValue(), lin.getPartialDerivative(0, 1, 0, 0), 1.0e-15 * FastMath.abs(v[1].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63835);Assert.assertEquals(v[2].getValue(), lin.getPartialDerivative(0, 0, 1, 0), 1.0e-15 * FastMath.abs(v[2].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63836);Assert.assertEquals(v[3].getValue(), lin.getPartialDerivative(0, 0, 0, 1), 1.0e-15 * FastMath.abs(v[3].getValue()));

        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testLinearCombination2DoubleDS() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195y7b51d99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testLinearCombination2DoubleDS",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195y7b51d99(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63837);
        // we compare accurate versus naive dot product implementations
        // on regular vectors (i.e. not extreme cases like in the previous test)
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63838);Well1024a random = new Well1024a(0xc6af886975069f11l);

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63839);for (int i = 0; (((i < 10000)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63840)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63841)==0&false)); ++i) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63842);final double[] u = new double[4];
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63843);final DerivativeStructure[] v = new DerivativeStructure[4];
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63844);for (int j = 0; (((j < u.length)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63845)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63846)==0&false)); ++j) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63847);u[j] = 1e17 * random.nextDouble();
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63848);v[j] = new DerivativeStructure(u.length, 1, j, 1e17 * random.nextDouble());
            }

            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63849);DerivativeStructure lin = v[0].linearCombination(u[0], v[0], u[1], v[1]);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63850);double ref = u[0] * v[0].getValue() +
                         u[1] * v[1].getValue();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63851);Assert.assertEquals(ref, lin.getValue(), 1.0e-15 * FastMath.abs(ref));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63852);Assert.assertEquals(u[0], lin.getPartialDerivative(1, 0, 0, 0), 1.0e-15 * FastMath.abs(v[0].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63853);Assert.assertEquals(u[1], lin.getPartialDerivative(0, 1, 0, 0), 1.0e-15 * FastMath.abs(v[1].getValue()));

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63854);lin = v[0].linearCombination(u[0], v[0], u[1], v[1], u[2], v[2]);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63855);ref = u[0] * v[0].getValue() +
                  u[1] * v[1].getValue() +
                  u[2] * v[2].getValue();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63856);Assert.assertEquals(ref, lin.getValue(), 1.0e-15 * FastMath.abs(ref));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63857);Assert.assertEquals(u[0], lin.getPartialDerivative(1, 0, 0, 0), 1.0e-15 * FastMath.abs(v[0].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63858);Assert.assertEquals(u[1], lin.getPartialDerivative(0, 1, 0, 0), 1.0e-15 * FastMath.abs(v[1].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63859);Assert.assertEquals(u[2], lin.getPartialDerivative(0, 0, 1, 0), 1.0e-15 * FastMath.abs(v[2].getValue()));

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63860);lin = v[0].linearCombination(u[0], v[0], u[1], v[1], u[2], v[2], u[3], v[3]);
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63861);ref = u[0] * v[0].getValue() +
                  u[1] * v[1].getValue() +
                  u[2] * v[2].getValue() +
                  u[3] * v[3].getValue();
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63862);Assert.assertEquals(ref, lin.getValue(), 1.0e-15 * FastMath.abs(ref));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63863);Assert.assertEquals(u[0], lin.getPartialDerivative(1, 0, 0, 0), 1.0e-15 * FastMath.abs(v[0].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63864);Assert.assertEquals(u[1], lin.getPartialDerivative(0, 1, 0, 0), 1.0e-15 * FastMath.abs(v[1].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63865);Assert.assertEquals(u[2], lin.getPartialDerivative(0, 0, 1, 0), 1.0e-15 * FastMath.abs(v[2].getValue()));
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63866);Assert.assertEquals(u[3], lin.getPartialDerivative(0, 0, 0, 1), 1.0e-15 * FastMath.abs(v[3].getValue()));

        }
    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    @Test
    public void testSerialization() {__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceStart(getClass().getName(),63867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on91da3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11cc51cc5lb90pbv7.R.rethrow($CLV_t2$);}finally{__CLR4_4_11cc51cc5lb90pbv7.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),63867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on91da3(){try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63867);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63868);DerivativeStructure a = new DerivativeStructure(3, 2, 0, 1.3);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63869);DerivativeStructure b = (DerivativeStructure) TestUtils.serializeAndRecover(a);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63870);Assert.assertEquals(a.getFreeParameters(), b.getFreeParameters());
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63871);Assert.assertEquals(a.getOrder(), b.getOrder());
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63872);checkEquals(a, b, 1.0e-15);
    }finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    private void checkF0F1(DerivativeStructure ds, double value, double...derivatives) {try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63873);

        // check dimension
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63874);Assert.assertEquals(derivatives.length, ds.getFreeParameters());

        // check value, directly and also as 0th order derivative
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63875);Assert.assertEquals(value, ds.getValue(), 1.0e-15);
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63876);Assert.assertEquals(value, ds.getPartialDerivative(new int[ds.getFreeParameters()]), 1.0e-15);

        // check first order derivatives
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63877);for (int i = 0; (((i < derivatives.length)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63878)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63879)==0&false)); ++i) {{
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63880);int[] orders = new int[derivatives.length];
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63881);orders[i] = 1;
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63882);Assert.assertEquals(derivatives[i], ds.getPartialDerivative(orders), 1.0e-15);
        }

    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

    private void checkEquals(DerivativeStructure ds1, DerivativeStructure ds2, double epsilon) {try{__CLR4_4_11cc51cc5lb90pbv7.R.inc(63883);

        // check dimension
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63884);Assert.assertEquals(ds1.getFreeParameters(), ds2.getFreeParameters());
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63885);Assert.assertEquals(ds1.getOrder(), ds2.getOrder());

        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63886);int[] derivatives = new int[ds1.getFreeParameters()];
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63887);int sum = 0;
        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63888);while (true) {{

            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63889);if ((((sum <= ds1.getOrder())&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63890)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63891)==0&false))) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63892);Assert.assertEquals(ds1.getPartialDerivative(derivatives),
                                    ds2.getPartialDerivative(derivatives),
                                    epsilon);
            }

            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63893);boolean increment = true;
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63894);sum = 0;
            __CLR4_4_11cc51cc5lb90pbv7.R.inc(63895);for (int i = derivatives.length - 1; (((i >= 0)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63896)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63897)==0&false)); --i) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63898);if ((((increment)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63899)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63900)==0&false))) {{
                    __CLR4_4_11cc51cc5lb90pbv7.R.inc(63901);if ((((derivatives[i] == ds1.getOrder())&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63902)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63903)==0&false))) {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63904);derivatives[i] = 0;
                    } }else {{
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63905);derivatives[i]++;
                        __CLR4_4_11cc51cc5lb90pbv7.R.inc(63906);increment = false;
                    }
                }}
                }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63907);sum += derivatives[i];
            }
            }__CLR4_4_11cc51cc5lb90pbv7.R.inc(63908);if ((((increment)&&(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63909)!=0|true))||(__CLR4_4_11cc51cc5lb90pbv7.R.iget(63910)==0&false))) {{
                __CLR4_4_11cc51cc5lb90pbv7.R.inc(63911);return;
            }

        }}

    }}finally{__CLR4_4_11cc51cc5lb90pbv7.R.flushNeeded();}}

}
