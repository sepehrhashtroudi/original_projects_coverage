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

package org.apache.commons.math3.analysis.function;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link Gaussian}.
 */
public class GaussianTest {static class __CLR4_4_11djx1djxlb90pbwp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64301,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test(expected=NotStrictlyPositiveException.class)
    public void testPreconditions() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1juz2k01djx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,114,101,99,111,110,100,105,116,105,111,110,115,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testPreconditions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1juz2k01djx(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64221);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64222);new Gaussian(1, 2, -1);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testSomeValues() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mpbj1djz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testSomeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mpbj1djz(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64223);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64224);final UnivariateFunction f = new Gaussian();

        __CLR4_4_11djx1djxlb90pbwp.R.inc(64225);Assert.assertEquals(1 / FastMath.sqrt(2 * Math.PI), f.value(0), EPS);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testLargeArguments() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x028cs1dk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testLargeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x028cs1dk2(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64226);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64227);final UnivariateFunction f = new Gaussian();

        __CLR4_4_11djx1djxlb90pbwp.R.inc(64228);Assert.assertEquals(0, f.value(Double.NEGATIVE_INFINITY), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64229);Assert.assertEquals(0, f.value(-Double.MAX_VALUE), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64230);Assert.assertEquals(0, f.value(-1e2), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64231);Assert.assertEquals(0, f.value(1e2), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64232);Assert.assertEquals(0, f.value(Double.MAX_VALUE), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64233);Assert.assertEquals(0, f.value(Double.POSITIVE_INFINITY), 0);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testDerivatives() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mqq5d1dka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testDerivatives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mqq5d1dka(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64234);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64235);final UnivariateDifferentiableFunction gaussian = new Gaussian(2.0, 0.9, 3.0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64236);final DerivativeStructure dsX = new DerivativeStructure(1, 4, 0, 1.1);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64237);final DerivativeStructure dsY = gaussian.value(dsX);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64238);Assert.assertEquals( 1.9955604901712128349,   dsY.getValue(),              EPS);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64239);Assert.assertEquals(-0.044345788670471396332, dsY.getPartialDerivative(1), EPS);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64240);Assert.assertEquals(-0.22074348138190206174,  dsY.getPartialDerivative(2), EPS);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64241);Assert.assertEquals( 0.014760030401924800557, dsY.getPartialDerivative(3), EPS);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64242);Assert.assertEquals( 0.073253159785035691678, dsY.getPartialDerivative(4), EPS);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testDerivativeLargeArguments() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jtf0b1dkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testDerivativeLargeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jtf0b1dkj(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64243);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64244);final Gaussian f = new Gaussian(0, 1e-50);

        __CLR4_4_11djx1djxlb90pbwp.R.inc(64245);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.NEGATIVE_INFINITY)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64246);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -Double.MAX_VALUE)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64247);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -1e50)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64248);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -1e2)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64249);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, 1e2)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64250);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, 1e50)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64251);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.MAX_VALUE)).getPartialDerivative(1), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64252);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.POSITIVE_INFINITY)).getPartialDerivative(1), 0);        
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testDerivativesNaN() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmjch41dkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testDerivativesNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmjch41dkt(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64253);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64254);final Gaussian f = new Gaussian(0, 1e-50);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64255);final DerivativeStructure fx = f.value(new DerivativeStructure(1, 5, 0, Double.NaN));
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64256);for (int i = 0; (((i <= fx.getOrder())&&(__CLR4_4_11djx1djxlb90pbwp.R.iget(64257)!=0|true))||(__CLR4_4_11djx1djxlb90pbwp.R.iget(64258)==0&false)); ++i) {{
            __CLR4_4_11djx1djxlb90pbwp.R.inc(64259);Assert.assertTrue(Double.isNaN(fx.getPartialDerivative(i)));
        }
    }}finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage1() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxe6x1dl0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,49,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricUsage1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxe6x1dl0(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64260);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64261);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64262);g.value(0, null);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage2() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mxcze1dl3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricUsage2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mxcze1dl3(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64263);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64264);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64265);g.value(0, new double[] {0});
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testParametricUsage3() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vxbrv1dl6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,51,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricUsage3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vxbrv1dl6(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64266);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64267);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64268);g.value(0, new double[] {0, 1, 0});
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage4() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4xakc1dl9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,52,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricUsage4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4xakc1dl9(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64269);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64270);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64271);g.gradient(0, null);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage5() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ddx9ct1dlc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,53,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricUsage5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ddx9ct1dlc(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64272);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64273);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64274);g.gradient(0, new double[] {0});
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test(expected=NotStrictlyPositiveException.class)
    public void testParametricUsage6() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gmx85a1dlf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,54,58,32,91,78,111,116,83,116,114,105,99,116,108,121,80,111,115,105,116,105,118,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NotStrictlyPositiveException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricUsage6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64275,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gmx85a1dlf(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64275);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64276);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64277);g.gradient(0, new double[] {0, 1, 0});
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testParametricValue() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqyhpy1dli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqyhpy1dli(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64278);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64279);final double norm = 2;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64280);final double mean = 3;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64281);final double sigma = 4;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64282);final Gaussian f = new Gaussian(norm, mean, sigma);

        __CLR4_4_11djx1djxlb90pbwp.R.inc(64283);final Gaussian.Parametric g = new Gaussian.Parametric();
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64284);Assert.assertEquals(f.value(-1), g.value(-1, new double[] {norm, mean, sigma}), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64285);Assert.assertEquals(f.value(0), g.value(0, new double[] {norm, mean, sigma}), 0);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64286);Assert.assertEquals(f.value(2), g.value(2, new double[] {norm, mean, sigma}), 0);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}

    @Test
    public void testParametricGradient() {__CLR4_4_11djx1djxlb90pbwp.R.globalSliceStart(getClass().getName(),64287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6qrdl1dlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11djx1djxlb90pbwp.R.rethrow($CLV_t2$);}finally{__CLR4_4_11djx1djxlb90pbwp.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.GaussianTest.testParametricGradient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6qrdl1dlr(){try{__CLR4_4_11djx1djxlb90pbwp.R.inc(64287);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64288);final double norm = 2;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64289);final double mean = 3;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64290);final double sigma = 4;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64291);final Gaussian.Parametric f = new Gaussian.Parametric();

        __CLR4_4_11djx1djxlb90pbwp.R.inc(64292);final double x = 1;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64293);final double[] grad = f.gradient(1, new double[] {norm, mean, sigma});
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64294);final double diff = x - mean;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64295);final double n = FastMath.exp(-diff * diff / (2 * sigma * sigma));
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64296);Assert.assertEquals(n, grad[0], EPS);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64297);final double m = norm * n * diff / (sigma * sigma);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64298);Assert.assertEquals(m, grad[1], EPS);
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64299);final double s = m * diff / sigma;
        __CLR4_4_11djx1djxlb90pbwp.R.inc(64300);Assert.assertEquals(s, grad[2], EPS);
    }finally{__CLR4_4_11djx1djxlb90pbwp.R.flushNeeded();}}
}
