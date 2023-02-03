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
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link HarmonicOscillator}.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class HarmonicOscillatorTest {static class __CLR4_4_11dm51dm5lb90pbww{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final double EPS = Math.ulp(1d);

    @Test
    public void testSomeValues() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h1mpbj1dm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testSomeValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h1mpbj1dm5(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64301);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64302);final double a = -1.2;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64303);final double w = 0.34;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64304);final double p = 5.6;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64305);final UnivariateFunction f = new HarmonicOscillator(a, w, p);

        __CLR4_4_11dm51dm5lb90pbww.R.inc(64306);final double d = 0.12345;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64307);for (int i = 0; (((i < 10)&&(__CLR4_4_11dm51dm5lb90pbww.R.iget(64308)!=0|true))||(__CLR4_4_11dm51dm5lb90pbww.R.iget(64309)==0&false)); i++) {{
            __CLR4_4_11dm51dm5lb90pbww.R.inc(64310);final double v = i * d;
            __CLR4_4_11dm51dm5lb90pbww.R.inc(64311);Assert.assertEquals(a * FastMath.cos(w * v + p), f.value(v), 0);
        }
    }}finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test
    public void testDerivative() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_115h6u81dmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testDerivative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_115h6u81dmg(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64312);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64313);final double a = -1.2;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64314);final double w = 0.34;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64315);final double p = 5.6;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64316);final HarmonicOscillator f = new HarmonicOscillator(a, w, p);

        __CLR4_4_11dm51dm5lb90pbww.R.inc(64317);for (int maxOrder = 0; (((maxOrder < 6)&&(__CLR4_4_11dm51dm5lb90pbww.R.iget(64318)!=0|true))||(__CLR4_4_11dm51dm5lb90pbww.R.iget(64319)==0&false)); ++maxOrder) {{
            __CLR4_4_11dm51dm5lb90pbww.R.inc(64320);final double d = 0.12345;
            __CLR4_4_11dm51dm5lb90pbww.R.inc(64321);for (int i = 0; (((i < 10)&&(__CLR4_4_11dm51dm5lb90pbww.R.iget(64322)!=0|true))||(__CLR4_4_11dm51dm5lb90pbww.R.iget(64323)==0&false)); i++) {{
                __CLR4_4_11dm51dm5lb90pbww.R.inc(64324);final double v = i * d;
                __CLR4_4_11dm51dm5lb90pbww.R.inc(64325);final DerivativeStructure h = f.value(new DerivativeStructure(1, maxOrder, 0, v));
                __CLR4_4_11dm51dm5lb90pbww.R.inc(64326);for (int k = 0; (((k <= maxOrder)&&(__CLR4_4_11dm51dm5lb90pbww.R.iget(64327)!=0|true))||(__CLR4_4_11dm51dm5lb90pbww.R.iget(64328)==0&false)); ++k) {{
                    __CLR4_4_11dm51dm5lb90pbww.R.inc(64329);final double trigo;
                    boolean __CLB4_4_1_bool0=false;__CLR4_4_11dm51dm5lb90pbww.R.inc(64330);switch (k % 4) {
                        case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_11dm51dm5lb90pbww.R.inc(64331);__CLB4_4_1_bool0=true;}
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64332);trigo = +FastMath.cos(w * v + p);
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64333);break;
                        case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_11dm51dm5lb90pbww.R.inc(64334);__CLB4_4_1_bool0=true;}
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64335);trigo = -FastMath.sin(w * v + p);
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64336);break;
                        case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_11dm51dm5lb90pbww.R.inc(64337);__CLB4_4_1_bool0=true;}
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64338);trigo = -FastMath.cos(w * v + p);
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64339);break;
                        default:if (!__CLB4_4_1_bool0) {__CLR4_4_11dm51dm5lb90pbww.R.inc(64340);__CLB4_4_1_bool0=true;}
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64341);trigo = +FastMath.sin(w * v + p);
                            __CLR4_4_11dm51dm5lb90pbww.R.inc(64342);break;
                    }
                    __CLR4_4_11dm51dm5lb90pbww.R.inc(64343);Assert.assertEquals(a * FastMath.pow(w, k) * trigo,
                                        h.getPartialDerivative(k),
                                        Precision.EPSILON);
                }
            }}
        }}
    }}finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage1() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxe6x1dnc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,49,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testParametricUsage1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxe6x1dnc(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64344);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64345);final HarmonicOscillator.Parametric g = new HarmonicOscillator.Parametric();
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64346);g.value(0, null);
    }finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage2() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13mxcze1dnf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,50,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testParametricUsage2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13mxcze1dnf(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64347);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64348);final HarmonicOscillator.Parametric g = new HarmonicOscillator.Parametric();
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64349);g.value(0, new double[] {0});
    }finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test(expected=NullArgumentException.class)
    public void testParametricUsage3() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vxbrv1dni();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,51,58,32,91,78,117,108,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testParametricUsage3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vxbrv1dni(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64350);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64351);final HarmonicOscillator.Parametric g = new HarmonicOscillator.Parametric();
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64352);g.gradient(0, null);
    }finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test(expected=DimensionMismatchException.class)
    public void testParametricUsage4() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4xakc1dnl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,97,109,101,116,114,105,99,85,115,97,103,101,52,58,32,91,68,105,109,101,110,115,105,111,110,77,105,115,109,97,116,99,104,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof DimensionMismatchException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testParametricUsage4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4xakc1dnl(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64353);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64354);final HarmonicOscillator.Parametric g = new HarmonicOscillator.Parametric();
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64355);g.gradient(0, new double[] {0});
    }finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test
    public void testParametricValue() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqyhpy1dno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testParametricValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqyhpy1dno(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64356);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64357);final double amplitude = 2;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64358);final double omega = 3;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64359);final double phase = 4;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64360);final HarmonicOscillator f = new HarmonicOscillator(amplitude, omega, phase);

        __CLR4_4_11dm51dm5lb90pbww.R.inc(64361);final HarmonicOscillator.Parametric g = new HarmonicOscillator.Parametric();
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64362);Assert.assertEquals(f.value(-1), g.value(-1, new double[] {amplitude, omega, phase}), 0);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64363);Assert.assertEquals(f.value(0), g.value(0, new double[] {amplitude, omega, phase}), 0);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64364);Assert.assertEquals(f.value(2), g.value(2, new double[] {amplitude, omega, phase}), 0);
    }finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}

    @Test
    public void testParametricGradient() {__CLR4_4_11dm51dm5lb90pbww.R.globalSliceStart(getClass().getName(),64365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6qrdl1dnx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dm51dm5lb90pbww.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dm51dm5lb90pbww.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.HarmonicOscillatorTest.testParametricGradient",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6qrdl1dnx(){try{__CLR4_4_11dm51dm5lb90pbww.R.inc(64365);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64366);final double amplitude = 2;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64367);final double omega = 3;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64368);final double phase = 4;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64369);final HarmonicOscillator.Parametric f = new HarmonicOscillator.Parametric();

        __CLR4_4_11dm51dm5lb90pbww.R.inc(64370);final double x = 1;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64371);final double[] grad = f.gradient(1, new double[] {amplitude, omega, phase});
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64372);final double xTimesOmegaPlusPhase = omega * x + phase;
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64373);final double a = FastMath.cos(xTimesOmegaPlusPhase);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64374);Assert.assertEquals(a, grad[0], EPS);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64375);final double w = -amplitude * x * FastMath.sin(xTimesOmegaPlusPhase);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64376);Assert.assertEquals(w, grad[1], EPS);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64377);final double p = -amplitude * FastMath.sin(xTimesOmegaPlusPhase);
        __CLR4_4_11dm51dm5lb90pbww.R.inc(64378);Assert.assertEquals(p, grad[2], EPS);
    }finally{__CLR4_4_11dm51dm5lb90pbww.R.flushNeeded();}}
}
