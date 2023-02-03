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
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.DimensionMismatchException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link Sigmoid}.
 */
public class SigmoidTest {static class __CLR4_4_11dul1dullb90pbxt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64652,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test
    public void testSomeValues() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mpbj1dul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testSomeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mpbj1dul(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64605);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64606);final UnivariateFunction f = new Sigmoid();

        __CLR4_4_11dul1dullb90pbxt.R.inc(64607);Assert.assertEquals(0.5, f.value(0), EPS);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64608);Assert.assertEquals(0, f.value(Double.NEGATIVE_INFINITY), EPS);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64609);Assert.assertEquals(1, f.value(Double.POSITIVE_INFINITY), EPS);
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test
    public void testDerivative() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115h6u81duq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115h6u81duq(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64610);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64611);final Sigmoid f = new Sigmoid();
        __CLR4_4_11dul1dullb90pbxt.R.inc(64612);final DerivativeStructure f0 = f.value(new DerivativeStructure(1, 1, 0, 0.0));

        __CLR4_4_11dul1dullb90pbxt.R.inc(64613);Assert.assertEquals(0.25, f0.getPartialDerivative(1), 0);
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test
    public void testDerivativesHighOrder() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s84yxz1duu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testDerivativesHighOrder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s84yxz1duu(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64614);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64615);DerivativeStructure s = new Sigmoid(1, 3).value(new DerivativeStructure(1, 5, 0, 1.2));
        __CLR4_4_11dul1dullb90pbxt.R.inc(64616);Assert.assertEquals(2.5370495669980352859, s.getPartialDerivative(0), 5.0e-16);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64617);Assert.assertEquals(0.35578888129361140441, s.getPartialDerivative(1), 6.0e-17);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64618);Assert.assertEquals(-0.19107626464144938116,  s.getPartialDerivative(2), 6.0e-17);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64619);Assert.assertEquals(-0.02396830286286711696,  s.getPartialDerivative(3), 4.0e-17);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64620);Assert.assertEquals(0.21682059798981049049,   s.getPartialDerivative(4), 3.0e-17);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64621);Assert.assertEquals(-0.19186320234632658055,  s.getPartialDerivative(5), 2.0e-16);
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test
    public void testDerivativeLargeArguments() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jtf0b1dv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testDerivativeLargeArguments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jtf0b1dv2(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64622);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64623);final Sigmoid f = new Sigmoid(1, 2);

        __CLR4_4_11dul1dullb90pbxt.R.inc(64624);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.NEGATIVE_INFINITY)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64625);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -Double.MAX_VALUE)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64626);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -1e50)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64627);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, -1e3)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64628);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, 1e3)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64629);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, 1e50)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64630);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.MAX_VALUE)).getPartialDerivative(1), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64631);Assert.assertEquals(0, f.value(new DerivativeStructure(1, 1, 0, Double.POSITIVE_INFINITY)).getPartialDerivative(1), 0);        
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage1() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxe6x1dvc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,49,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testParametricUsage1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxe6x1dvc(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64632);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64633);final Sigmoid.Parametric g = new Sigmoid.Parametric();
        __CLR4_4_11dul1dullb90pbxt.R.inc(64634);g.value(0, null);
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage2() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mxcze1dvf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testParametricUsage2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mxcze1dvf(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64635);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64636);final Sigmoid.Parametric g = new Sigmoid.Parametric();
        __CLR4_4_11dul1dullb90pbxt.R.inc(64637);g.value(0, new double[] {0});
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage3() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vxbrv1dvi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,51,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testParametricUsage3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vxbrv1dvi(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64638);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64639);final Sigmoid.Parametric g = new Sigmoid.Parametric();
        __CLR4_4_11dul1dullb90pbxt.R.inc(64640);g.gradient(0, null);
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage4() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4xakc1dvl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,52,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testParametricUsage4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4xakc1dvl(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64641);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64642);final Sigmoid.Parametric g = new Sigmoid.Parametric();
        __CLR4_4_11dul1dullb90pbxt.R.inc(64643);g.gradient(0, new double[] {0});
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}

    @Test
    public void testParametricValue() {__CLR4_4_11dul1dullb90pbxt.R.globalSliceStart(getClass().getName(),64644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqyhpy1dvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dul1dullb90pbxt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dul1dullb90pbxt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SigmoidTest.testParametricValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqyhpy1dvo(){try{__CLR4_4_11dul1dullb90pbxt.R.inc(64644);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64645);final double lo = 2;
        __CLR4_4_11dul1dullb90pbxt.R.inc(64646);final double hi = 3;
        __CLR4_4_11dul1dullb90pbxt.R.inc(64647);final Sigmoid f = new Sigmoid(lo, hi);

        __CLR4_4_11dul1dullb90pbxt.R.inc(64648);final Sigmoid.Parametric g = new Sigmoid.Parametric();
        __CLR4_4_11dul1dullb90pbxt.R.inc(64649);Assert.assertEquals(f.value(-1), g.value(-1, new double[] {lo, hi}), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64650);Assert.assertEquals(f.value(0), g.value(0, new double[] {lo, hi}), 0);
        __CLR4_4_11dul1dullb90pbxt.R.inc(64651);Assert.assertEquals(f.value(2), g.value(2, new double[] {lo, hi}), 0);
    }finally{__CLR4_4_11dul1dullb90pbxt.R.flushNeeded();}}
}
