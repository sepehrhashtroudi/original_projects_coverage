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

package org.apache.commons.math3.complex;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;
import org.junit.Assert;

/**
 * @version $Id$
 */
public class ComplexUtilsTest {static class __CLR4_4_11hvt1hvtlb90pc6y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,69881,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private double inf = Double.POSITIVE_INFINITY;
    private double negInf = Double.NEGATIVE_INFINITY;
    private double nan = Double.NaN;
    private double pi = FastMath.PI;

    private Complex negInfInf = new Complex(negInf, inf);
    private Complex infNegInf = new Complex(inf, negInf);
    private Complex infInf = new Complex(inf, inf);
    private Complex negInfNegInf = new Complex(negInf, negInf);
    private Complex infNaN = new Complex(inf, nan);

    @Test
    public void testPolar2Complex() {__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceStart(getClass().getName(),69833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j8r9r1hvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hvt1hvtlb90pc6y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexUtilsTest.testPolar2Complex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j8r9r1hvt(){try{__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69833);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69834);TestUtils.assertEquals(Complex.ONE,
                ComplexUtils.polar2Complex(1, 0), 10e-12);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69835);TestUtils.assertEquals(Complex.ZERO,
                ComplexUtils.polar2Complex(0, 1), 10e-12);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69836);TestUtils.assertEquals(Complex.ZERO,
                ComplexUtils.polar2Complex(0, -1), 10e-12);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69837);TestUtils.assertEquals(Complex.I,
                ComplexUtils.polar2Complex(1, pi/2), 10e-12);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69838);TestUtils.assertEquals(Complex.I.negate(),
                ComplexUtils.polar2Complex(1, -pi/2), 10e-12);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69839);double r = 0;
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69840);for (int i = 0; (((i < 5)&&(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69841)!=0|true))||(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69842)==0&false)); i++) {{
          __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69843);r += i;
          __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69844);double theta = 0;
          __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69845);for (int j =0; (((j < 20)&&(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69846)!=0|true))||(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69847)==0&false)); j++) {{
              __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69848);theta += pi / 6;
              __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69849);TestUtils.assertEquals(altPolar(r, theta),
                      ComplexUtils.polar2Complex(r, theta), 10e-12);
          }
          }__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69850);theta = -2 * pi;
          __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69851);for (int j =0; (((j < 20)&&(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69852)!=0|true))||(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69853)==0&false)); j++) {{
              __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69854);theta -= pi / 6;
              __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69855);TestUtils.assertEquals(altPolar(r, theta),
                      ComplexUtils.polar2Complex(r, theta), 10e-12);
          }
        }}
    }}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.flushNeeded();}}

    protected Complex altPolar(double r, double theta) {try{__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69856);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69857);return Complex.I.multiply(new Complex(theta, 0)).exp().multiply(new Complex(r, 0));
    }finally{__CLR4_4_11hvt1hvtlb90pc6y.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testPolar2ComplexIllegalModulus() {__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceStart(getClass().getName(),69858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12xzm9a1hwi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,111,108,97,114,50,67,111,109,112,108,101,120,73,108,108,101,103,97,108,77,111,100,117,108,117,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hvt1hvtlb90pc6y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexUtilsTest.testPolar2ComplexIllegalModulus",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12xzm9a1hwi(){try{__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69858);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69859);ComplexUtils.polar2Complex(-1, 0);
    }finally{__CLR4_4_11hvt1hvtlb90pc6y.R.flushNeeded();}}

    @Test
    public void testPolar2ComplexNaN() {__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceStart(getClass().getName(),69860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1523yzc1hwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hvt1hvtlb90pc6y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexUtilsTest.testPolar2ComplexNaN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69860,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1523yzc1hwk(){try{__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69860);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69861);TestUtils.assertSame(Complex.NaN, ComplexUtils.polar2Complex(nan, 1));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69862);TestUtils.assertSame(Complex.NaN, ComplexUtils.polar2Complex(1, nan));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69863);TestUtils.assertSame(Complex.NaN,
                ComplexUtils.polar2Complex(nan, nan));
    }finally{__CLR4_4_11hvt1hvtlb90pc6y.R.flushNeeded();}}

    @Test
    public void testPolar2ComplexInf() {__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceStart(getClass().getName(),69864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h5a0hu1hwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hvt1hvtlb90pc6y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexUtilsTest.testPolar2ComplexInf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h5a0hu1hwo(){try{__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69864);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69865);TestUtils.assertSame(Complex.NaN, ComplexUtils.polar2Complex(1, inf));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69866);TestUtils.assertSame(Complex.NaN,
                ComplexUtils.polar2Complex(1, negInf));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69867);TestUtils.assertSame(Complex.NaN, ComplexUtils.polar2Complex(inf, inf));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69868);TestUtils.assertSame(Complex.NaN,
                ComplexUtils.polar2Complex(inf, negInf));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69869);TestUtils.assertSame(infInf, ComplexUtils.polar2Complex(inf, pi/4));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69870);TestUtils.assertSame(infNaN, ComplexUtils.polar2Complex(inf, 0));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69871);TestUtils.assertSame(infNegInf, ComplexUtils.polar2Complex(inf, -pi/4));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69872);TestUtils.assertSame(negInfInf, ComplexUtils.polar2Complex(inf, 3*pi/4));
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69873);TestUtils.assertSame(negInfNegInf, ComplexUtils.polar2Complex(inf, 5*pi/4));
    }finally{__CLR4_4_11hvt1hvtlb90pc6y.R.flushNeeded();}}

    @Test
    public void testConvertToComplex() {__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceStart(getClass().getName(),69874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mzt7ej1hwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11hvt1hvtlb90pc6y.R.rethrow($CLV_t2$);}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.ComplexUtilsTest.testConvertToComplex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),69874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mzt7ej1hwy(){try{__CLR4_4_11hvt1hvtlb90pc6y.R.inc(69874);
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69875);final double[] real = new double[] { negInf, -123.45, 0, 1, 234.56, pi, inf };
        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69876);final Complex[] complex = ComplexUtils.convertToComplex(real);

        __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69877);for (int i = 0; (((i < real.length)&&(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69878)!=0|true))||(__CLR4_4_11hvt1hvtlb90pc6y.R.iget(69879)==0&false)); i++) {{
            __CLR4_4_11hvt1hvtlb90pc6y.R.inc(69880);Assert.assertEquals(real[i], complex[i].getReal(), 0d);
        }
    }}finally{__CLR4_4_11hvt1hvtlb90pc6y.R.flushNeeded();}}
}
