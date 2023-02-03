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

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test for class {@link DSCompiler}.
 */
public class DSCompilerTest {static class __CLR4_4_11c3n1c3nlb90pbsl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,62645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSize() {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xx1221c3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xx1221c3n(){try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62339);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62340);for (int i = 0; (((i < 6)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62341)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62342)==0&false)); ++i) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62343);for (int j = 0; (((j < 6)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62344)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62345)==0&false)); ++j) {{
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62346);long expected = CombinatoricsUtils.binomialCoefficient(i + j, i);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62347);Assert.assertEquals(expected, DSCompiler.getCompiler(i, j).getSize());
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62348);Assert.assertEquals(expected, DSCompiler.getCompiler(j, i).getSize());
            }
        }}
    }}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    @Test
    public void testIndices() {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewj8o41c3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testIndices",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewj8o41c3x(){try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62349);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62350);DSCompiler c = DSCompiler.getCompiler(0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62351);checkIndices(c.getPartialDerivativeOrders(0), new int[0]);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62352);c = DSCompiler.getCompiler(0, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62353);checkIndices(c.getPartialDerivativeOrders(0), new int[0]);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62354);c = DSCompiler.getCompiler(1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62355);checkIndices(c.getPartialDerivativeOrders(0), 0);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62356);c = DSCompiler.getCompiler(1, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62357);checkIndices(c.getPartialDerivativeOrders(0), 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62358);checkIndices(c.getPartialDerivativeOrders(1), 1);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62359);c = DSCompiler.getCompiler(1, 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62360);checkIndices(c.getPartialDerivativeOrders(0), 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62361);checkIndices(c.getPartialDerivativeOrders(1), 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62362);checkIndices(c.getPartialDerivativeOrders(2), 2);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62363);c = DSCompiler.getCompiler(2, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62364);checkIndices(c.getPartialDerivativeOrders(0), 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62365);checkIndices(c.getPartialDerivativeOrders(1), 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62366);checkIndices(c.getPartialDerivativeOrders(2), 0, 1);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62367);c = DSCompiler.getCompiler(1, 3);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62368);checkIndices(c.getPartialDerivativeOrders(0), 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62369);checkIndices(c.getPartialDerivativeOrders(1), 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62370);checkIndices(c.getPartialDerivativeOrders(2), 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62371);checkIndices(c.getPartialDerivativeOrders(3), 3);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62372);c = DSCompiler.getCompiler(2, 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62373);checkIndices(c.getPartialDerivativeOrders(0), 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62374);checkIndices(c.getPartialDerivativeOrders(1), 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62375);checkIndices(c.getPartialDerivativeOrders(2), 2, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62376);checkIndices(c.getPartialDerivativeOrders(3), 0, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62377);checkIndices(c.getPartialDerivativeOrders(4), 1, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62378);checkIndices(c.getPartialDerivativeOrders(5), 0, 2);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62379);c = DSCompiler.getCompiler(3, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62380);checkIndices(c.getPartialDerivativeOrders(0), 0, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62381);checkIndices(c.getPartialDerivativeOrders(1), 1, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62382);checkIndices(c.getPartialDerivativeOrders(2), 0, 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62383);checkIndices(c.getPartialDerivativeOrders(3), 0, 0, 1);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62384);c = DSCompiler.getCompiler(1, 4);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62385);checkIndices(c.getPartialDerivativeOrders(0), 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62386);checkIndices(c.getPartialDerivativeOrders(1), 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62387);checkIndices(c.getPartialDerivativeOrders(2), 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62388);checkIndices(c.getPartialDerivativeOrders(3), 3);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62389);checkIndices(c.getPartialDerivativeOrders(4), 4);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62390);c = DSCompiler.getCompiler(2, 3);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62391);checkIndices(c.getPartialDerivativeOrders(0), 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62392);checkIndices(c.getPartialDerivativeOrders(1), 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62393);checkIndices(c.getPartialDerivativeOrders(2), 2, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62394);checkIndices(c.getPartialDerivativeOrders(3), 3, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62395);checkIndices(c.getPartialDerivativeOrders(4), 0, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62396);checkIndices(c.getPartialDerivativeOrders(5), 1, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62397);checkIndices(c.getPartialDerivativeOrders(6), 2, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62398);checkIndices(c.getPartialDerivativeOrders(7), 0, 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62399);checkIndices(c.getPartialDerivativeOrders(8), 1, 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62400);checkIndices(c.getPartialDerivativeOrders(9), 0, 3);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62401);c = DSCompiler.getCompiler(3, 2);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62402);checkIndices(c.getPartialDerivativeOrders(0), 0, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62403);checkIndices(c.getPartialDerivativeOrders(1), 1, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62404);checkIndices(c.getPartialDerivativeOrders(2), 2, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62405);checkIndices(c.getPartialDerivativeOrders(3), 0, 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62406);checkIndices(c.getPartialDerivativeOrders(4), 1, 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62407);checkIndices(c.getPartialDerivativeOrders(5), 0, 2, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62408);checkIndices(c.getPartialDerivativeOrders(6), 0, 0, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62409);checkIndices(c.getPartialDerivativeOrders(7), 1, 0, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62410);checkIndices(c.getPartialDerivativeOrders(8), 0, 1, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62411);checkIndices(c.getPartialDerivativeOrders(9), 0, 0, 2);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62412);c = DSCompiler.getCompiler(4, 1);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62413);checkIndices(c.getPartialDerivativeOrders(0), 0, 0, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62414);checkIndices(c.getPartialDerivativeOrders(1), 1, 0, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62415);checkIndices(c.getPartialDerivativeOrders(2), 0, 1, 0, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62416);checkIndices(c.getPartialDerivativeOrders(3), 0, 0, 1, 0);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62417);checkIndices(c.getPartialDerivativeOrders(4), 0, 0, 0, 1);

    }finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testIncompatibleParams() {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yews201c5u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,109,112,97,116,105,98,108,101,80,97,114,97,109,115,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testIncompatibleParams",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yews201c5u(){try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62418);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62419);DSCompiler.getCompiler(3, 2).checkCompatibility(DSCompiler.getCompiler(4, 2));
    }finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testIncompatibleOrder() {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5pqx61c5w();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,99,111,109,112,97,116,105,98,108,101,79,114,100,101,114,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testIncompatibleOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5pqx61c5w(){try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62420);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62421);DSCompiler.getCompiler(3, 3).checkCompatibility(DSCompiler.getCompiler(3, 2));
    }finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    @Test
    public void testSymmetry() {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15up88l1c5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testSymmetry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15up88l1c5y(){try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62422);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62423);for (int i = 0; (((i < 6)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62424)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62425)==0&false)); ++i) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62426);for (int j = 0; (((j < 6)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62427)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62428)==0&false)); ++j) {{
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62429);DSCompiler c = DSCompiler.getCompiler(i, j);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62430);for (int k = 0; (((k < c.getSize())&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62431)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62432)==0&false)); ++k) {{
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62433);Assert.assertEquals(k, c.getPartialDerivativeIndex(c.getPartialDerivativeOrders(k)));
                }
            }}
        }}
    }}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    @Test public void testMultiplicationRules()
        throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_158l8m1c6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testMultiplicationRules",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_158l8m1c6a() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62434);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62435);Map<String,String> referenceRules = new HashMap<String, String>();
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62436);referenceRules.put("(f*g)",          "f * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62437);referenceRules.put("d(f*g)/dx",      "f * dg/dx + df/dx * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62438);referenceRules.put("d(f*g)/dy",      referenceRules.get("d(f*g)/dx").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62439);referenceRules.put("d(f*g)/dz",      referenceRules.get("d(f*g)/dx").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62440);referenceRules.put("d(f*g)/dt",      referenceRules.get("d(f*g)/dx").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62441);referenceRules.put("d2(f*g)/dx2",    "f * d2g/dx2 + 2 * df/dx * dg/dx + d2f/dx2 * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62442);referenceRules.put("d2(f*g)/dy2",    referenceRules.get("d2(f*g)/dx2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62443);referenceRules.put("d2(f*g)/dz2",    referenceRules.get("d2(f*g)/dx2").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62444);referenceRules.put("d2(f*g)/dt2",    referenceRules.get("d2(f*g)/dx2").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62445);referenceRules.put("d2(f*g)/dxdy",   "f * d2g/dxdy + df/dy * dg/dx + df/dx * dg/dy + d2f/dxdy * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62446);referenceRules.put("d2(f*g)/dxdz",   referenceRules.get("d2(f*g)/dxdy").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62447);referenceRules.put("d2(f*g)/dxdt",   referenceRules.get("d2(f*g)/dxdy").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62448);referenceRules.put("d2(f*g)/dydz",   referenceRules.get("d2(f*g)/dxdz").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62449);referenceRules.put("d2(f*g)/dydt",   referenceRules.get("d2(f*g)/dxdt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62450);referenceRules.put("d2(f*g)/dzdt",   referenceRules.get("d2(f*g)/dxdt").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62451);referenceRules.put("d3(f*g)/dx3",    "f * d3g/dx3 +" +
                                             " 3 * df/dx * d2g/dx2 +" +
                                             " 3 * d2f/dx2 * dg/dx +" +
                                             " d3f/dx3 * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62452);referenceRules.put("d3(f*g)/dy3",   referenceRules.get("d3(f*g)/dx3").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62453);referenceRules.put("d3(f*g)/dz3",   referenceRules.get("d3(f*g)/dx3").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62454);referenceRules.put("d3(f*g)/dt3",   referenceRules.get("d3(f*g)/dx3").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62455);referenceRules.put("d3(f*g)/dx2dy",  "f * d3g/dx2dy +" +
                                             " df/dy * d2g/dx2 +" +
                                             " 2 * df/dx * d2g/dxdy +" +
                                             " 2 * d2f/dxdy * dg/dx +" +
                                             " d2f/dx2 * dg/dy +" +
                                             " d3f/dx2dy * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62456);referenceRules.put("d3(f*g)/dxdy2",  "f * d3g/dxdy2 +" +
                                             " 2 * df/dy * d2g/dxdy +" +
                                             " d2f/dy2 * dg/dx +" +
                                             " df/dx * d2g/dy2 +" +
                                             " 2 * d2f/dxdy * dg/dy +" +
                                             " d3f/dxdy2 * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62457);referenceRules.put("d3(f*g)/dx2dz",   referenceRules.get("d3(f*g)/dx2dy").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62458);referenceRules.put("d3(f*g)/dy2dz",   referenceRules.get("d3(f*g)/dx2dz").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62459);referenceRules.put("d3(f*g)/dxdz2",   referenceRules.get("d3(f*g)/dxdy2").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62460);referenceRules.put("d3(f*g)/dydz2",   referenceRules.get("d3(f*g)/dxdz2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62461);referenceRules.put("d3(f*g)/dx2dt",   referenceRules.get("d3(f*g)/dx2dz").replaceAll("z", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62462);referenceRules.put("d3(f*g)/dy2dt",   referenceRules.get("d3(f*g)/dx2dt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62463);referenceRules.put("d3(f*g)/dz2dt",   referenceRules.get("d3(f*g)/dx2dt").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62464);referenceRules.put("d3(f*g)/dxdt2",   referenceRules.get("d3(f*g)/dxdy2").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62465);referenceRules.put("d3(f*g)/dydt2",   referenceRules.get("d3(f*g)/dxdt2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62466);referenceRules.put("d3(f*g)/dzdt2",   referenceRules.get("d3(f*g)/dxdt2").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62467);referenceRules.put("d3(f*g)/dxdydz", "f * d3g/dxdydz +" +
                                             " df/dz * d2g/dxdy +" +
                                             " df/dy * d2g/dxdz +" +
                                             " d2f/dydz * dg/dx +" +
                                             " df/dx * d2g/dydz +" +
                                             " d2f/dxdz * dg/dy +" +
                                             " d2f/dxdy * dg/dz +" +
                                             " d3f/dxdydz * g");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62468);referenceRules.put("d3(f*g)/dxdydt", referenceRules.get("d3(f*g)/dxdydz").replaceAll("z", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62469);referenceRules.put("d3(f*g)/dxdzdt", referenceRules.get("d3(f*g)/dxdydt").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62470);referenceRules.put("d3(f*g)/dydzdt", referenceRules.get("d3(f*g)/dxdzdt").replaceAll("x", "y"));

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62471);Field multFieldArrayField = DSCompiler.class.getDeclaredField("multIndirection");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62472);multFieldArrayField.setAccessible(true);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62473);for (int i = 0; (((i < 5)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62474)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62475)==0&false)); ++i) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62476);for (int j = 0; (((j < 4)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62477)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62478)==0&false)); ++j) {{
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62479);DSCompiler compiler = DSCompiler.getCompiler(i, j);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62480);int[][][] multIndirection = (int[][][]) multFieldArrayField.get(compiler);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62481);for (int k = 0; (((k < multIndirection.length)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62482)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62483)==0&false)); ++k) {{
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62484);String product = ordersToString(compiler.getPartialDerivativeOrders(k),
                                                    "(f*g)", "x", "y", "z", "t");
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62485);StringBuilder rule = new StringBuilder();
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62486);for (int[] term : multIndirection[k]) {{
                        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62487);if ((((rule.length() > 0)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62488)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62489)==0&false))) {{
                            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62490);rule.append(" + ");
                        }
                        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62491);if ((((term[0] > 1)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62492)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62493)==0&false))) {{
                            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62494);rule.append(term[0]).append(" * ");
                        }
                        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62495);rule.append(ordersToString(compiler.getPartialDerivativeOrders(term[1]),
                                                   "f", "x", "y", "z", "t"));
                        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62496);rule.append(" * ");
                        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62497);rule.append(ordersToString(compiler.getPartialDerivativeOrders(term[2]),
                                                   "g", "x", "y", "z", "t"));
                    }
                    }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62498);Assert.assertEquals(product, referenceRules.get(product), rule.toString());
                }
            }}
        }}
    }}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    @Test public void testCompositionRules()
        throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceStart(getClass().getName(),62499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12z1abq1c83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11c3n1c3nlb90pbsl.R.rethrow($CLV_t2$);}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.DSCompilerTest.testCompositionRules",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),62499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12z1abq1c83() throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62499);

        // the following reference rules have all been computed independently from the library,
        // using only pencil and paper and some search and replace to handle symmetries
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62500);Map<String,String> referenceRules = new HashMap<String, String>();
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62501);referenceRules.put("(f(g))",              "(f(g))");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62502);referenceRules.put("d(f(g))/dx",          "d(f(g))/dg * dg/dx");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62503);referenceRules.put("d(f(g))/dy",          referenceRules.get("d(f(g))/dx").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62504);referenceRules.put("d(f(g))/dz",          referenceRules.get("d(f(g))/dx").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62505);referenceRules.put("d(f(g))/dt",          referenceRules.get("d(f(g))/dx").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62506);referenceRules.put("d2(f(g))/dx2",        "d2(f(g))/dg2 * dg/dx * dg/dx + d(f(g))/dg * d2g/dx2");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62507);referenceRules.put("d2(f(g))/dy2",        referenceRules.get("d2(f(g))/dx2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62508);referenceRules.put("d2(f(g))/dz2",        referenceRules.get("d2(f(g))/dx2").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62509);referenceRules.put("d2(f(g))/dt2",        referenceRules.get("d2(f(g))/dx2").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62510);referenceRules.put("d2(f(g))/dxdy",       "d2(f(g))/dg2 * dg/dx * dg/dy + d(f(g))/dg * d2g/dxdy");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62511);referenceRules.put("d2(f(g))/dxdz",       referenceRules.get("d2(f(g))/dxdy").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62512);referenceRules.put("d2(f(g))/dxdt",       referenceRules.get("d2(f(g))/dxdy").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62513);referenceRules.put("d2(f(g))/dydz",       referenceRules.get("d2(f(g))/dxdz").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62514);referenceRules.put("d2(f(g))/dydt",       referenceRules.get("d2(f(g))/dxdt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62515);referenceRules.put("d2(f(g))/dzdt",       referenceRules.get("d2(f(g))/dxdt").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62516);referenceRules.put("d3(f(g))/dx3",        "d3(f(g))/dg3 * dg/dx * dg/dx * dg/dx +" +
                                                  " 3 * d2(f(g))/dg2 * dg/dx * d2g/dx2 +" +
                                                  " d(f(g))/dg * d3g/dx3");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62517);referenceRules.put("d3(f(g))/dy3",        referenceRules.get("d3(f(g))/dx3").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62518);referenceRules.put("d3(f(g))/dz3",        referenceRules.get("d3(f(g))/dx3").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62519);referenceRules.put("d3(f(g))/dt3",        referenceRules.get("d3(f(g))/dx3").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62520);referenceRules.put("d3(f(g))/dxdy2",      "d3(f(g))/dg3 * dg/dx * dg/dy * dg/dy +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dy * d2g/dxdy +" +
                                                  " d2(f(g))/dg2 * dg/dx * d2g/dy2 +" +
                                                  " d(f(g))/dg * d3g/dxdy2");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62521);referenceRules.put("d3(f(g))/dxdz2",      referenceRules.get("d3(f(g))/dxdy2").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62522);referenceRules.put("d3(f(g))/dxdt2",      referenceRules.get("d3(f(g))/dxdy2").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62523);referenceRules.put("d3(f(g))/dydz2",      referenceRules.get("d3(f(g))/dxdz2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62524);referenceRules.put("d3(f(g))/dydt2",      referenceRules.get("d3(f(g))/dxdt2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62525);referenceRules.put("d3(f(g))/dzdt2",      referenceRules.get("d3(f(g))/dxdt2").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62526);referenceRules.put("d3(f(g))/dx2dy",      "d3(f(g))/dg3 * dg/dx * dg/dx * dg/dy +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dx * d2g/dxdy +" +
                                                  " d2(f(g))/dg2 * d2g/dx2 * dg/dy +" +
                                                  " d(f(g))/dg * d3g/dx2dy");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62527);referenceRules.put("d3(f(g))/dx2dz",      referenceRules.get("d3(f(g))/dx2dy").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62528);referenceRules.put("d3(f(g))/dx2dt",      referenceRules.get("d3(f(g))/dx2dy").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62529);referenceRules.put("d3(f(g))/dy2dz",      referenceRules.get("d3(f(g))/dx2dz").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62530);referenceRules.put("d3(f(g))/dy2dt",      referenceRules.get("d3(f(g))/dx2dt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62531);referenceRules.put("d3(f(g))/dz2dt",      referenceRules.get("d3(f(g))/dx2dt").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62532);referenceRules.put("d3(f(g))/dxdydz",     "d3(f(g))/dg3 * dg/dx * dg/dy * dg/dz +" +
                                                  " d2(f(g))/dg2 * dg/dy * d2g/dxdz +" +
                                                  " d2(f(g))/dg2 * dg/dx * d2g/dydz +" +
                                                  " d2(f(g))/dg2 * d2g/dxdy * dg/dz +" +
                                                  " d(f(g))/dg * d3g/dxdydz");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62533);referenceRules.put("d3(f(g))/dxdydt",     referenceRules.get("d3(f(g))/dxdydz").replaceAll("z", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62534);referenceRules.put("d3(f(g))/dxdzdt",     referenceRules.get("d3(f(g))/dxdydt").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62535);referenceRules.put("d3(f(g))/dydzdt",     referenceRules.get("d3(f(g))/dxdzdt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62536);referenceRules.put("d4(f(g))/dx4",        "d4(f(g))/dg4 * dg/dx * dg/dx * dg/dx * dg/dx +" +
                                                  " 6 * d3(f(g))/dg3 * dg/dx * dg/dx * d2g/dx2 +" +
                                                  " 3 * d2(f(g))/dg2 * d2g/dx2 * d2g/dx2 +" +
                                                  " 4 * d2(f(g))/dg2 * dg/dx * d3g/dx3 +" +
                                                  " d(f(g))/dg * d4g/dx4");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62537);referenceRules.put("d4(f(g))/dy4",        referenceRules.get("d4(f(g))/dx4").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62538);referenceRules.put("d4(f(g))/dz4",        referenceRules.get("d4(f(g))/dx4").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62539);referenceRules.put("d4(f(g))/dt4",        referenceRules.get("d4(f(g))/dx4").replaceAll("x", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62540);referenceRules.put("d4(f(g))/dx3dy",      "d4(f(g))/dg4 * dg/dx * dg/dx * dg/dx * dg/dy +" +
                                                  " 3 * d3(f(g))/dg3 * dg/dx * dg/dx * d2g/dxdy +" +
                                                  " 3 * d3(f(g))/dg3 * dg/dx * d2g/dx2 * dg/dy +" +
                                                  " 3 * d2(f(g))/dg2 * d2g/dx2 * d2g/dxdy +" +
                                                  " 3 * d2(f(g))/dg2 * dg/dx * d3g/dx2dy +" +
                                                  " d2(f(g))/dg2 * d3g/dx3 * dg/dy +" +
                                                  " d(f(g))/dg * d4g/dx3dy");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62541);referenceRules.put("d4(f(g))/dx3dz",      referenceRules.get("d4(f(g))/dx3dy").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62542);referenceRules.put("d4(f(g))/dx3dt",      referenceRules.get("d4(f(g))/dx3dy").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62543);referenceRules.put("d4(f(g))/dxdy3",      "d4(f(g))/dg4 * dg/dx * dg/dy * dg/dy * dg/dy +" +
                                                  " 3 * d3(f(g))/dg3 * dg/dy * dg/dy * d2g/dxdy +" +
                                                  " 3 * d3(f(g))/dg3 * dg/dx * dg/dy * d2g/dy2 +" +
                                                  " 3 * d2(f(g))/dg2 * d2g/dxdy * d2g/dy2 +" +
                                                  " 3 * d2(f(g))/dg2 * dg/dy * d3g/dxdy2 +" +
                                                  " d2(f(g))/dg2 * dg/dx * d3g/dy3 +" +
                                                  " d(f(g))/dg * d4g/dxdy3");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62544);referenceRules.put("d4(f(g))/dxdz3",      referenceRules.get("d4(f(g))/dxdy3").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62545);referenceRules.put("d4(f(g))/dxdt3",      referenceRules.get("d4(f(g))/dxdy3").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62546);referenceRules.put("d4(f(g))/dy3dz",      referenceRules.get("d4(f(g))/dx3dz").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62547);referenceRules.put("d4(f(g))/dy3dt",      referenceRules.get("d4(f(g))/dx3dt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62548);referenceRules.put("d4(f(g))/dydz3",      referenceRules.get("d4(f(g))/dxdz3").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62549);referenceRules.put("d4(f(g))/dydt3",      referenceRules.get("d4(f(g))/dxdt3").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62550);referenceRules.put("d4(f(g))/dz3dt",      referenceRules.get("d4(f(g))/dx3dt").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62551);referenceRules.put("d4(f(g))/dzdt3",      referenceRules.get("d4(f(g))/dxdt3").replaceAll("x", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62552);referenceRules.put("d4(f(g))/dx2dy2",     "d4(f(g))/dg4 * dg/dx * dg/dx * dg/dy * dg/dy +" +
                                                  " 4 * d3(f(g))/dg3 * dg/dx * dg/dy * d2g/dxdy +" +
                                                  " d3(f(g))/dg3 * dg/dx * dg/dx * d2g/dy2 +" +
                                                  " 2 * d2(f(g))/dg2 * d2g/dxdy * d2g/dxdy +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dx * d3g/dxdy2 +" +
                                                  " d3(f(g))/dg3 * d2g/dx2 * dg/dy * dg/dy +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dy * d3g/dx2dy +" +
                                                  " d2(f(g))/dg2 * d2g/dx2 * d2g/dy2 +" +
                                                  " d(f(g))/dg * d4g/dx2dy2");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62553);referenceRules.put("d4(f(g))/dx2dz2",     referenceRules.get("d4(f(g))/dx2dy2").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62554);referenceRules.put("d4(f(g))/dx2dt2",     referenceRules.get("d4(f(g))/dx2dy2").replaceAll("y", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62555);referenceRules.put("d4(f(g))/dy2dz2",     referenceRules.get("d4(f(g))/dx2dz2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62556);referenceRules.put("d4(f(g))/dy2dt2",     referenceRules.get("d4(f(g))/dx2dt2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62557);referenceRules.put("d4(f(g))/dz2dt2",     referenceRules.get("d4(f(g))/dx2dt2").replaceAll("x", "z"));

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62558);referenceRules.put("d4(f(g))/dx2dydz",    "d4(f(g))/dg4 * dg/dx * dg/dx * dg/dy * dg/dz +" +
                                                  " 2 * d3(f(g))/dg3 * dg/dx * dg/dy * d2g/dxdz +" +
                                                  " d3(f(g))/dg3 * dg/dx * dg/dx * d2g/dydz +" +
                                                  " 2 * d3(f(g))/dg3 * dg/dx * d2g/dxdy * dg/dz +" +
                                                  " 2 * d2(f(g))/dg2 * d2g/dxdy * d2g/dxdz +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dx * d3g/dxdydz +" +
                                                  " d3(f(g))/dg3 * d2g/dx2 * dg/dy * dg/dz +" +
                                                  " d2(f(g))/dg2 * dg/dy * d3g/dx2dz +" +
                                                  " d2(f(g))/dg2 * d2g/dx2 * d2g/dydz +" +
                                                  " d2(f(g))/dg2 * d3g/dx2dy * dg/dz +" +
                                                  " d(f(g))/dg * d4g/dx2dydz");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62559);referenceRules.put("d4(f(g))/dx2dydt",    referenceRules.get("d4(f(g))/dx2dydz").replaceAll("z", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62560);referenceRules.put("d4(f(g))/dx2dzdt",    referenceRules.get("d4(f(g))/dx2dydt").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62561);referenceRules.put("d4(f(g))/dxdy2dz",    "d4(f(g))/dg4 * dg/dx * dg/dy * dg/dy * dg/dz +" +
                                                  " d3(f(g))/dg3 * dg/dy * dg/dy * d2g/dxdz +" +
                                                  " 2 * d3(f(g))/dg3 * dg/dx * dg/dy * d2g/dydz +" +
                                                  " 2 * d3(f(g))/dg3 * dg/dy * d2g/dxdy * dg/dz +" +
                                                  " 2 * d2(f(g))/dg2 * d2g/dxdy * d2g/dydz +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dy * d3g/dxdydz +" +
                                                  " d3(f(g))/dg3 * dg/dx * d2g/dy2 * dg/dz +" +
                                                  " d2(f(g))/dg2 * d2g/dy2 * d2g/dxdz +" +
                                                  " d2(f(g))/dg2 * dg/dx * d3g/dy2dz +" +
                                                  " d2(f(g))/dg2 * d3g/dxdy2 * dg/dz +" +
                                                  " d(f(g))/dg * d4g/dxdy2dz");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62562);referenceRules.put("d4(f(g))/dxdy2dt",    referenceRules.get("d4(f(g))/dxdy2dz").replaceAll("z", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62563);referenceRules.put("d4(f(g))/dy2dzdt",    referenceRules.get("d4(f(g))/dx2dzdt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62564);referenceRules.put("d4(f(g))/dxdydz2",    "d4(f(g))/dg4 * dg/dx * dg/dy * dg/dz * dg/dz +" +
                                                  " 2 * d3(f(g))/dg3 * dg/dy * dg/dz * d2g/dxdz +" +
                                                  " 2 * d3(f(g))/dg3 * dg/dx * dg/dz * d2g/dydz +" +
                                                  " d3(f(g))/dg3 * dg/dx * dg/dy * d2g/dz2 +" +
                                                  " 2 * d2(f(g))/dg2 * d2g/dxdz * d2g/dydz +" +
                                                  " d2(f(g))/dg2 * dg/dy * d3g/dxdz2 +" +
                                                  " d2(f(g))/dg2 * dg/dx * d3g/dydz2 +" +
                                                  " d3(f(g))/dg3 * d2g/dxdy * dg/dz * dg/dz +" +
                                                  " 2 * d2(f(g))/dg2 * dg/dz * d3g/dxdydz +" +
                                                  " d2(f(g))/dg2 * d2g/dxdy * d2g/dz2 +" +
                                                  " d(f(g))/dg * d4g/dxdydz2");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62565);referenceRules.put("d4(f(g))/dxdz2dt",    referenceRules.get("d4(f(g))/dxdy2dt").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62566);referenceRules.put("d4(f(g))/dydz2dt",    referenceRules.get("d4(f(g))/dxdz2dt").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62567);referenceRules.put("d4(f(g))/dxdydt2",    referenceRules.get("d4(f(g))/dxdydz2").replaceAll("z", "t"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62568);referenceRules.put("d4(f(g))/dxdzdt2",    referenceRules.get("d4(f(g))/dxdydt2").replaceAll("y", "z"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62569);referenceRules.put("d4(f(g))/dydzdt2",    referenceRules.get("d4(f(g))/dxdzdt2").replaceAll("x", "y"));
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62570);referenceRules.put("d4(f(g))/dxdydzdt",   "d4(f(g))/dg4 * dg/dx * dg/dy * dg/dz * dg/dt +" +
                                                  " d3(f(g))/dg3 * dg/dy * dg/dz * d2g/dxdt +" +
                                                  " d3(f(g))/dg3 * dg/dx * dg/dz * d2g/dydt +" +
                                                  " d3(f(g))/dg3 * dg/dx * dg/dy * d2g/dzdt +" +
                                                  " d3(f(g))/dg3 * dg/dy * d2g/dxdz * dg/dt +" +
                                                  " d2(f(g))/dg2 * d2g/dxdz * d2g/dydt +" +
                                                  " d2(f(g))/dg2 * dg/dy * d3g/dxdzdt +" +
                                                  " d3(f(g))/dg3 * dg/dx * d2g/dydz * dg/dt +" +
                                                  " d2(f(g))/dg2 * d2g/dydz * d2g/dxdt +" +
                                                  " d2(f(g))/dg2 * dg/dx * d3g/dydzdt +" +
                                                  " d3(f(g))/dg3 * d2g/dxdy * dg/dz * dg/dt +" +
                                                  " d2(f(g))/dg2 * dg/dz * d3g/dxdydt +" +
                                                  " d2(f(g))/dg2 * d2g/dxdy * d2g/dzdt +" +
                                                  " d2(f(g))/dg2 * d3g/dxdydz * dg/dt +" +
                                                  " d(f(g))/dg * d4g/dxdydzdt");

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62571);Field compFieldArrayField = DSCompiler.class.getDeclaredField("compIndirection");
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62572);compFieldArrayField.setAccessible(true);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62573);for (int i = 0; (((i < 5)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62574)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62575)==0&false)); ++i) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62576);for (int j = 0; (((j < 5)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62577)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62578)==0&false)); ++j) {{
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62579);DSCompiler compiler = DSCompiler.getCompiler(i, j);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62580);int[][][] compIndirection = (int[][][]) compFieldArrayField.get(compiler);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62581);for (int k = 0; (((k < compIndirection.length)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62582)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62583)==0&false)); ++k) {{
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62584);String product = ordersToString(compiler.getPartialDerivativeOrders(k),
                                                    "(f(g))", "x", "y", "z", "t");
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62585);StringBuilder rule = new StringBuilder();
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62586);for (int[] term : compIndirection[k]) {{
                        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62587);if ((((rule.length() > 0)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62588)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62589)==0&false))) {{
                            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62590);rule.append(" + ");
                        }
                        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62591);if ((((term[0] > 1)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62592)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62593)==0&false))) {{
                            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62594);rule.append(term[0]).append(" * ");
                        }
                        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62595);rule.append(orderToString(term[1], "(f(g))", "g"));
                        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62596);for (int l = 2; (((l < term.length)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62597)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62598)==0&false)); ++l) {{
                            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62599);rule.append(" * ");
                            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62600);rule.append(ordersToString(compiler.getPartialDerivativeOrders(term[l]),
                                                       "g", "x", "y", "z", "t"));
                        }
                    }}
                    }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62601);Assert.assertEquals(product, referenceRules.get(product), rule.toString());
                }
            }}
        }}
    }}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    private void checkIndices(int[] indices, int ... expected) {try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62602);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62603);Assert.assertEquals(expected.length, indices.length);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62604);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62605)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62606)==0&false)); ++i) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62607);Assert.assertEquals(expected[i], indices[i]);
        }
    }}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    private String orderToString(int order, String functionName, String parameterName) {try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62608);
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62609);if ((((order == 0)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62610)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62611)==0&false))) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62612);return functionName;
        } }else {__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62613);if ((((order == 1)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62614)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62615)==0&false))) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62616);return "d" + functionName + "/d" + parameterName;
        } }else {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62617);return "d" + order + functionName + "/d" + parameterName + order;
        }
    }}}finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

    private String ordersToString(int[] orders, String functionName, String ... parametersNames) {try{__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62618);

        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62619);int sumOrders = 0;
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62620);for (int order : orders) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62621);sumOrders += order;
        }

        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62622);if ((((sumOrders == 0)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62623)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62624)==0&false))) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62625);return functionName;
        }

        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62626);StringBuilder builder = new StringBuilder();
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62627);builder.append('d');
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62628);if ((((sumOrders > 1)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62629)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62630)==0&false))) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62631);builder.append(sumOrders);
        }
        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62632);builder.append(functionName).append('/');
        __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62633);for (int i = 0; (((i < orders.length)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62634)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62635)==0&false)); ++i) {{
            __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62636);if ((((orders[i] > 0)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62637)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62638)==0&false))) {{
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62639);builder.append('d').append(parametersNames[i]);
                __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62640);if ((((orders[i] > 1)&&(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62641)!=0|true))||(__CLR4_4_11c3n1c3nlb90pbsl.R.iget(62642)==0&false))) {{
                    __CLR4_4_11c3n1c3nlb90pbsl.R.inc(62643);builder.append(orders[i]);
                }
            }}
        }}
        }__CLR4_4_11c3n1c3nlb90pbsl.R.inc(62644);return builder.toString();

    }finally{__CLR4_4_11c3n1c3nlb90pbsl.R.flushNeeded();}}

}
