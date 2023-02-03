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
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpField;
import org.apache.commons.math3.dfp.DfpMath;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class SincTest {static class __CLR4_4_11dvw1dvwlb90pby2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64717,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

   @Test
   public void testShortcut() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysi4751dvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testShortcut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysi4751dvw(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64652);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64653);final Sinc s = new Sinc();
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64654);final UnivariateFunction f = new UnivariateFunction() {
           public double value(double x) {try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64655);
               __CLR4_4_11dvw1dvwlb90pby2.R.inc(64656);Dfp dfpX = new DfpField(25).newDfp(x);
               __CLR4_4_11dvw1dvwlb90pby2.R.inc(64657);return DfpMath.sin(dfpX).divide(dfpX).toDouble();
           }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}
       };

       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64658);for (double x = 1e-30; (((x < 1e10)&&(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64659)!=0|true))||(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64660)==0&false)); x *= 2) {{
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64661);final double fX = f.value(x);
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64662);final double sX = s.value(x);
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64663);Assert.assertEquals("x=" + x, fX, sX, 2.0e-16);
       }
   }}finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testCrossings() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h0hzwm1dw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testCrossings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h0hzwm1dw8(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64664);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64665);final Sinc s = new Sinc(true);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64666);final int numCrossings = 1000;
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64667);final double tol = 2e-16;
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64668);for (int i = 1; (((i <= numCrossings)&&(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64669)!=0|true))||(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64670)==0&false)); i++) {{
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64671);Assert.assertEquals("i=" + i, 0, s.value(i), tol);
       }
   }}finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testZero() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i71dwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i71dwg(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64672);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64673);final Sinc s = new Sinc();
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64674);Assert.assertEquals(1d, s.value(0), 0);
   }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testEuler() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5r8o21dwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testEuler",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64675,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5r8o21dwj(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64675);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64676);final Sinc s = new Sinc();
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64677);final double x = 123456.789;
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64678);double prod = 1;
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64679);double xOverPow2 = x / 2;
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64680);while ((((xOverPow2 > 0)&&(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64681)!=0|true))||(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64682)==0&false))) {{
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64683);prod *= FastMath.cos(xOverPow2);
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64684);xOverPow2 /= 2;
       }
       }__CLR4_4_11dvw1dvwlb90pby2.R.inc(64685);Assert.assertEquals(prod, s.value(x), 1e-13);
   }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testDerivativeZero() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xjes481dwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testDerivativeZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xjes481dwu(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64686);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64687);final DerivativeStructure s0 = new Sinc(true).value(new DerivativeStructure(1, 1, 0, 0.0));
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64688);Assert.assertEquals(0, s0.getPartialDerivative(1), 0);
   }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testDerivatives1Dot2Unnormalized() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5622x1dwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testDerivatives1Dot2Unnormalized",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5622x1dwx(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64689);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64690);DerivativeStructure s = new Sinc(false).value(new DerivativeStructure(1, 5, 0, 1.2));
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64691);Assert.assertEquals( 0.77669923830602195806, s.getPartialDerivative(0), 1.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64692);Assert.assertEquals(-0.34528456985779031701, s.getPartialDerivative(1), 1.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64693);Assert.assertEquals(-0.2012249552097047631,  s.getPartialDerivative(2), 1.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64694);Assert.assertEquals( 0.2010975926270339262,  s.getPartialDerivative(3), 4.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64695);Assert.assertEquals( 0.106373929549242204,   s.getPartialDerivative(4), 1.0e-15);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64696);Assert.assertEquals(-0.1412599110579478695,  s.getPartialDerivative(5), 3.0e-15);
   }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testDerivatives1Dot2Normalized() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_184nvpe1dx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testDerivatives1Dot2Normalized",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_184nvpe1dx5(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64697);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64698);DerivativeStructure s = new Sinc(true).value(new DerivativeStructure(1, 5, 0, 1.2));
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64699);Assert.assertEquals(-0.15591488063143983888, s.getPartialDerivative(0), 6.0e-17);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64700);Assert.assertEquals(-0.54425176145292298767, s.getPartialDerivative(1), 2.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64701);Assert.assertEquals(2.4459044611635856107,   s.getPartialDerivative(2), 9.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64702);Assert.assertEquals(0.5391369206235909586,   s.getPartialDerivative(3), 7.0e-16);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64703);Assert.assertEquals(-16.984649869728849865,  s.getPartialDerivative(4), 8.0e-15);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64704);Assert.assertEquals(5.0980327462666316586,   s.getPartialDerivative(5), 9.0e-15);
   }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}

   @Test
   public void testDerivativeShortcut() {__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceStart(getClass().getName(),64705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g80d521dxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11dvw1dvwlb90pby2.R.rethrow($CLV_t2$);}finally{__CLR4_4_11dvw1dvwlb90pby2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.function.SincTest.testDerivativeShortcut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g80d521dxd(){try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64705);
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64706);final Sinc sinc = new Sinc();
       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64707);final UnivariateFunction f = new UnivariateFunction() {
               public double value(double x) {try{__CLR4_4_11dvw1dvwlb90pby2.R.inc(64708);
                   __CLR4_4_11dvw1dvwlb90pby2.R.inc(64709);Dfp dfpX = new DfpField(25).newDfp(x);
                   __CLR4_4_11dvw1dvwlb90pby2.R.inc(64710);return DfpMath.cos(dfpX).subtract(DfpMath.sin(dfpX).divide(dfpX)).divide(dfpX).toDouble();
               }finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}
           };

       __CLR4_4_11dvw1dvwlb90pby2.R.inc(64711);for (double x = 1e-30; (((x < 1e10)&&(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64712)!=0|true))||(__CLR4_4_11dvw1dvwlb90pby2.R.iget(64713)==0&false)); x *= 2) {{
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64714);final double fX = f.value(x);
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64715);final DerivativeStructure sX = sinc.value(new DerivativeStructure(1, 1, 0, x));
           __CLR4_4_11dvw1dvwlb90pby2.R.inc(64716);Assert.assertEquals("x=" + x, fX, sX.getPartialDerivative(1), 3.0e-13);
       }
   }}finally{__CLR4_4_11dvw1dvwlb90pby2.R.flushNeeded();}}
}
