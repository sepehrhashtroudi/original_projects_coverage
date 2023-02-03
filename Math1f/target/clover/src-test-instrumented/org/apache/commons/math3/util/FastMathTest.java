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
package org.apache.commons.math3.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpField;
import org.apache.commons.math3.dfp.DfpMath;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FastMathTest {static class __CLR4_4_12f4x2f4xlb90pf23{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,113602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final double MAX_ERROR_ULP = 0.51;
    private static final int NUMBER_OF_TRIALS = 1000;


    private DfpField field;
    private RandomGenerator generator;

    @Before
    public void setUp() {try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112929);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112930);field = new DfpField(40);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112931);generator = new MersenneTwister(6176597458463500194l);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testMinMaxDouble() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13365j02f50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testMinMaxDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112932,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13365j02f50(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112932);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112933);double[][] pairs = {
            { -50.0, 50.0 },
            {  Double.POSITIVE_INFINITY, 1.0 },
            {  Double.NEGATIVE_INFINITY, 1.0 },
            {  Double.NaN, 1.0 },
            {  Double.POSITIVE_INFINITY, 0.0 },
            {  Double.NEGATIVE_INFINITY, 0.0 },
            {  Double.NaN, 0.0 },
            {  Double.NaN, Double.NEGATIVE_INFINITY },
            {  Double.NaN, Double.POSITIVE_INFINITY },
            { Precision.SAFE_MIN, Precision.EPSILON }
        };
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112934);for (double[] pair : pairs) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112935);Assert.assertEquals("min(" + pair[0] + ", " + pair[1] + ")",
                                Math.min(pair[0], pair[1]),
                                FastMath.min(pair[0], pair[1]),
                                Precision.EPSILON);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112936);Assert.assertEquals("min(" + pair[1] + ", " + pair[0] + ")",
                                Math.min(pair[1], pair[0]),
                                FastMath.min(pair[1], pair[0]),
                                Precision.EPSILON);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112937);Assert.assertEquals("max(" + pair[0] + ", " + pair[1] + ")",
                                Math.max(pair[0], pair[1]),
                                FastMath.max(pair[0], pair[1]),
                                Precision.EPSILON);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112938);Assert.assertEquals("max(" + pair[1] + ", " + pair[0] + ")",
                                Math.max(pair[1], pair[0]),
                                FastMath.max(pair[1], pair[0]),
                                Precision.EPSILON);
        }
    }}finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testMinMaxFloat() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ttyo0v2f57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testMinMaxFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ttyo0v2f57(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112939);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112940);float[][] pairs = {
            { -50.0f, 50.0f },
            {  Float.POSITIVE_INFINITY, 1.0f },
            {  Float.NEGATIVE_INFINITY, 1.0f },
            {  Float.NaN, 1.0f },
            {  Float.POSITIVE_INFINITY, 0.0f },
            {  Float.NEGATIVE_INFINITY, 0.0f },
            {  Float.NaN, 0.0f },
            {  Float.NaN, Float.NEGATIVE_INFINITY },
            {  Float.NaN, Float.POSITIVE_INFINITY }
        };
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112941);for (float[] pair : pairs) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112942);Assert.assertEquals("min(" + pair[0] + ", " + pair[1] + ")",
                                Math.min(pair[0], pair[1]),
                                FastMath.min(pair[0], pair[1]),
                                Precision.EPSILON);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112943);Assert.assertEquals("min(" + pair[1] + ", " + pair[0] + ")",
                                Math.min(pair[1], pair[0]),
                                FastMath.min(pair[1], pair[0]),
                                Precision.EPSILON);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112944);Assert.assertEquals("max(" + pair[0] + ", " + pair[1] + ")",
                                Math.max(pair[0], pair[1]),
                                FastMath.max(pair[0], pair[1]),
                                Precision.EPSILON);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112945);Assert.assertEquals("max(" + pair[1] + ", " + pair[0] + ")",
                                Math.max(pair[1], pair[0]),
                                FastMath.max(pair[1], pair[0]),
                                Precision.EPSILON);
        }
    }}finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testConstants() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15epzlw2f5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testConstants",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112946,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15epzlw2f5e(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112946);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112947);Assert.assertEquals(Math.PI, FastMath.PI, 1.0e-20);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112948);Assert.assertEquals(Math.E, FastMath.E, 1.0e-20);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testAtan2() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhqhrb2f5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAtan2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhqhrb2f5h(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112949);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112950);double y1 = 1.2713504628280707e10;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112951);double x1 = -5.674940885228782e-10;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112952);Assert.assertEquals(Math.atan2(y1, x1), FastMath.atan2(y1, x1), 2 * Precision.EPSILON);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112953);double y2 = 0.0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112954);double x2 = Double.POSITIVE_INFINITY;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112955);Assert.assertEquals(Math.atan2(y2, x2), FastMath.atan2(y2, x2), Precision.SAFE_MIN);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testHyperbolic() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcsqme2f5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testHyperbolic",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcsqme2f5o(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112956);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112957);double maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112958);for (double x = -30; (((x < 30)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112959)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112960)==0&false)); x += 0.001) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112961);double tst = FastMath.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112962);double ref = Math.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112963);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(112964);Assert.assertEquals(0, maxErr, 2);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112965);maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112966);for (double x = -30; (((x < 30)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112967)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112968)==0&false)); x += 0.001) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112969);double tst = FastMath.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112970);double ref = Math.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112971);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(112972);Assert.assertEquals(0, maxErr, 2);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112973);maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112974);for (double x = -0.5; (((x < 0.5)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112975)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112976)==0&false)); x += 0.001) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112977);double tst = FastMath.tanh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112978);double ref = Math.tanh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112979);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(112980);Assert.assertEquals(0, maxErr, 4);

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testMath904() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1apwrva2f6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testMath904",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1apwrva2f6d(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112981);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112982);final double x = -1;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112983);final double y = (5 + 1e-15) * 1e15;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112984);Assert.assertEquals(Math.pow(x, y),
                            FastMath.pow(x, y), 0);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112985);Assert.assertEquals(Math.pow(x, -y),
                            FastMath.pow(x, -y), 0);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testMath905LargePositive() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),112986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18lf7rd2f6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testMath905LargePositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112986,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18lf7rd2f6i(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(112986);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112987);final double start = StrictMath.log(Double.MAX_VALUE);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112988);final double endT = StrictMath.sqrt(2) * StrictMath.sqrt(Double.MAX_VALUE);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112989);final double end = 2 * StrictMath.log(endT);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112990);double maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112991);for (double x = start; (((x < end)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112992)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112993)==0&false)); x += 1e-3) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112994);final double tst = FastMath.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112995);final double ref = Math.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(112996);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));            
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(112997);Assert.assertEquals(0, maxErr, 3);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(112998);for (double x = start; (((x < end)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(112999)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113000)==0&false)); x += 1e-3) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113001);final double tst = FastMath.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113002);final double ref = Math.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113003);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));            
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113004);Assert.assertEquals(0, maxErr, 3);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testMath905LargeNegative() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t26ix92f71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testMath905LargeNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t26ix92f71(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113005);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113006);final double start = -StrictMath.log(Double.MAX_VALUE);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113007);final double endT = StrictMath.sqrt(2) * StrictMath.sqrt(Double.MAX_VALUE);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113008);final double end = -2 * StrictMath.log(endT);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113009);double maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113010);for (double x = start; (((x > end)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113011)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113012)==0&false)); x -= 1e-3) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113013);final double tst = FastMath.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113014);final double ref = Math.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113015);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));            
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113016);Assert.assertEquals(0, maxErr, 3);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113017);for (double x = start; (((x > end)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113018)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113019)==0&false)); x -= 1e-3) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113020);final double tst = FastMath.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113021);final double ref = Math.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113022);maxErr = FastMath.max(maxErr, FastMath.abs(ref - tst) / FastMath.ulp(ref));            
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113023);Assert.assertEquals(0, maxErr, 3);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testHyperbolicInverses() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ck38dz2f7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testHyperbolicInverses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ck38dz2f7k(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113024);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113025);double maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113026);for (double x = -30; (((x < 30)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113027)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113028)==0&false)); x += 0.01) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113029);maxErr = FastMath.max(maxErr, FastMath.abs(x - FastMath.sinh(FastMath.asinh(x))) / (2 * FastMath.ulp(x)));
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113030);Assert.assertEquals(0, maxErr, 3);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113031);maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113032);for (double x = 1; (((x < 30)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113033)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113034)==0&false)); x += 0.01) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113035);maxErr = FastMath.max(maxErr, FastMath.abs(x - FastMath.cosh(FastMath.acosh(x))) / (2 * FastMath.ulp(x)));
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113036);Assert.assertEquals(0, maxErr, 2);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113037);maxErr = 0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113038);for (double x = -1 + Precision.EPSILON; (((x < 1 - Precision.EPSILON)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113039)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113040)==0&false)); x += 0.0001) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113041);maxErr = FastMath.max(maxErr, FastMath.abs(x - FastMath.tanh(FastMath.atanh(x))) / (2 * FastMath.ulp(x)));
        }
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113042);Assert.assertEquals(0, maxErr, 2);

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testLogAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lgew1a2f83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testLogAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lgew1a2f83(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113043);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113044);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113045);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113046)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113047)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113048);double x = Math.exp(generator.nextDouble() * 1416.0 - 708.0) * generator.nextDouble();
            // double x = generator.nextDouble()*2.0;
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113049);double tst = FastMath.log(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113050);double ref = DfpMath.log(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113051);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113052);if ((((err != 0.0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113053)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113054)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113055);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double
                                          .doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113056);double errulp = field.newDfp(tst).subtract(DfpMath.log(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113057);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113058);Assert.assertTrue("log() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testLog10Accuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1llqrcf2f8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testLog10Accuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1llqrcf2f8j(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113059);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113060);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113061);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113062)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113063)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113064);double x = Math.exp(generator.nextDouble() * 1416.0 - 708.0) * generator.nextDouble();
            // double x = generator.nextDouble()*2.0;
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113065);double tst = FastMath.log10(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113066);double ref = DfpMath.log(field.newDfp(x)).divide(DfpMath.log(field.newDfp("10"))).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113067);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113068);if ((((err != 0.0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113069)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113070)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113071);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113072);double errulp = field.newDfp(tst).subtract(DfpMath.log(field.newDfp(x)).divide(DfpMath.log(field.newDfp("10")))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113073);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113074);Assert.assertTrue("log10() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testLog1pAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vq1g332f8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testLog1pAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vq1g332f8z(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113075);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113076);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113077);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113078)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113079)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113080);double x = Math.exp(generator.nextDouble() * 10.0 - 5.0) * generator.nextDouble();
            // double x = generator.nextDouble()*2.0;
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113081);double tst = FastMath.log1p(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113082);double ref = DfpMath.log(field.newDfp(x).add(field.getOne())).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113083);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113084);if ((((err != 0.0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113085)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113086)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113087);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113088);double errulp = field.newDfp(tst).subtract(DfpMath.log(field.newDfp(x).add(field.getOne()))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113089);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113090);Assert.assertTrue("log1p() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testLog1pSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1or7ose2f9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testLog1pSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113091,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1or7ose2f9f(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113091);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113092);Assert.assertTrue("Logp of -1.0 should be -Inf", Double.isInfinite(FastMath.log1p(-1.0)));

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testLogSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ambfwj2f9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testLogSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ambfwj2f9h(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113093);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113094);Assert.assertTrue("Log of zero should be -Inf", Double.isInfinite(FastMath.log(0.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113095);Assert.assertTrue("Log of -zero should be -Inf", Double.isInfinite(FastMath.log(-0.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113096);Assert.assertTrue("Log of NaN should be NaN", Double.isNaN(FastMath.log(Double.NaN)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113097);Assert.assertTrue("Log of negative number should be NaN", Double.isNaN(FastMath.log(-1.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113098);Assert.assertEquals("Log of Double.MIN_VALUE should be -744.4400719213812", -744.4400719213812, FastMath.log(Double.MIN_VALUE), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113099);Assert.assertTrue("Log of infinity should be infinity", Double.isInfinite(FastMath.log(Double.POSITIVE_INFINITY)));
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}
    @Test
    public void testExpSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4f0ck2f9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testExpSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4f0ck2f9o(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113100);

        // Smallest value that will round up to Double.MIN_VALUE
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113101);Assert.assertEquals(Double.MIN_VALUE, FastMath.exp(-745.1332191019411), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113102);Assert.assertEquals("exp(-745.1332191019412) should be 0.0", 0.0, FastMath.exp(-745.1332191019412), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113103);Assert.assertTrue("exp of NaN should be NaN", Double.isNaN(FastMath.exp(Double.NaN)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113104);Assert.assertTrue("exp of infinity should be infinity", Double.isInfinite(FastMath.exp(Double.POSITIVE_INFINITY)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113105);Assert.assertEquals("exp of -infinity should be 0.0", 0.0, FastMath.exp(Double.NEGATIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113106);Assert.assertEquals("exp(1) should be Math.E", Math.E, FastMath.exp(1.0), Precision.EPSILON);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testPowSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwic6h2f9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testPowSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwic6h2f9v(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113107);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113108);Assert.assertEquals("pow(-1, 0) should be 1.0", 1.0, FastMath.pow(-1.0, 0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113109);Assert.assertEquals("pow(-1, -0) should be 1.0", 1.0, FastMath.pow(-1.0, -0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113110);Assert.assertEquals("pow(PI, 1.0) should be PI", FastMath.PI, FastMath.pow(FastMath.PI, 1.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113111);Assert.assertEquals("pow(-PI, 1.0) should be -PI", -FastMath.PI, FastMath.pow(-FastMath.PI, 1.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113112);Assert.assertTrue("pow(PI, NaN) should be NaN", Double.isNaN(FastMath.pow(Math.PI, Double.NaN)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113113);Assert.assertTrue("pow(NaN, PI) should be NaN", Double.isNaN(FastMath.pow(Double.NaN, Math.PI)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113114);Assert.assertTrue("pow(2.0, Infinity) should be Infinity", Double.isInfinite(FastMath.pow(2.0, Double.POSITIVE_INFINITY)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113115);Assert.assertTrue("pow(0.5, -Infinity) should be Infinity", Double.isInfinite(FastMath.pow(0.5, Double.NEGATIVE_INFINITY)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113116);Assert.assertEquals("pow(0.5, Infinity) should be 0.0", 0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113117);Assert.assertEquals("pow(2.0, -Infinity) should be 0.0", 0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113118);Assert.assertEquals("pow(0.0, 0.5) should be 0.0", 0.0, FastMath.pow(0.0, 0.5), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113119);Assert.assertEquals("pow(Infinity, -0.5) should be 0.0", 0.0, FastMath.pow(Double.POSITIVE_INFINITY, -0.5), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113120);Assert.assertTrue("pow(0.0, -0.5) should be Inf", Double.isInfinite(FastMath.pow(0.0, -0.5)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113121);Assert.assertTrue("pow(Inf, 0.5) should be Inf", Double.isInfinite(FastMath.pow(Double.POSITIVE_INFINITY, 0.5)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113122);Assert.assertTrue("pow(-0.0, -3.0) should be -Inf", Double.isInfinite(FastMath.pow(-0.0, -3.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113123);Assert.assertTrue("pow(-Inf, -3.0) should be -Inf", Double.isInfinite(FastMath.pow(Double.NEGATIVE_INFINITY, 3.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113124);Assert.assertTrue("pow(-0.0, -3.5) should be Inf", Double.isInfinite(FastMath.pow(-0.0, -3.5)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113125);Assert.assertTrue("pow(Inf, 3.5) should be Inf", Double.isInfinite(FastMath.pow(Double.POSITIVE_INFINITY, 3.5)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113126);Assert.assertEquals("pow(-2.0, 3.0) should be -8.0", -8.0, FastMath.pow(-2.0, 3.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113127);Assert.assertTrue("pow(-2.0, 3.5) should be NaN", Double.isNaN(FastMath.pow(-2.0, 3.5)));

        // Added tests for a 100% coverage

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113128);Assert.assertTrue("pow(+Inf, NaN) should be NaN", Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113129);Assert.assertTrue("pow(1.0, +Inf) should be NaN", Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113130);Assert.assertTrue("pow(-Inf, NaN) should be NaN", Double.isNaN(FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113131);Assert.assertEquals("pow(-Inf, -1.0) should be 0.0", 0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -1.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113132);Assert.assertEquals("pow(-Inf, -2.0) should be 0.0", 0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113133);Assert.assertTrue("pow(-Inf, 1.0) should be -Inf", Double.isInfinite(FastMath.pow(Double.NEGATIVE_INFINITY, 1.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113134);Assert.assertTrue("pow(-Inf, 2.0) should be +Inf", Double.isInfinite(FastMath.pow(Double.NEGATIVE_INFINITY, 2.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113135);Assert.assertTrue("pow(1.0, -Inf) should be NaN", Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testAtan2SpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13438332fao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAtan2SpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13438332fao(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113136);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113137);Assert.assertTrue("atan2(NaN, 0.0) should be NaN", Double.isNaN(FastMath.atan2(Double.NaN, 0.0)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113138);Assert.assertTrue("atan2(0.0, NaN) should be NaN", Double.isNaN(FastMath.atan2(0.0, Double.NaN)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113139);Assert.assertEquals("atan2(0.0, 0.0) should be 0.0", 0.0, FastMath.atan2(0.0, 0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113140);Assert.assertEquals("atan2(0.0, 0.001) should be 0.0", 0.0, FastMath.atan2(0.0, 0.001), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113141);Assert.assertEquals("atan2(0.1, +Inf) should be 0.0", 0.0, FastMath.atan2(0.1, Double.POSITIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113142);Assert.assertEquals("atan2(-0.0, 0.0) should be -0.0", -0.0, FastMath.atan2(-0.0, 0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113143);Assert.assertEquals("atan2(-0.0, 0.001) should be -0.0", -0.0, FastMath.atan2(-0.0, 0.001), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113144);Assert.assertEquals("atan2(-0.0, +Inf) should be -0.0", -0.0, FastMath.atan2(-0.1, Double.POSITIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113145);Assert.assertEquals("atan2(0.0, -0.0) should be PI", FastMath.PI, FastMath.atan2(0.0, -0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113146);Assert.assertEquals("atan2(0.1, -Inf) should be PI", FastMath.PI, FastMath.atan2(0.1, Double.NEGATIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113147);Assert.assertEquals("atan2(-0.0, -0.0) should be -PI", -FastMath.PI, FastMath.atan2(-0.0, -0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113148);Assert.assertEquals("atan2(0.1, -Inf) should be -PI", -FastMath.PI, FastMath.atan2(-0.1, Double.NEGATIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113149);Assert.assertEquals("atan2(0.1, 0.0) should be PI/2", FastMath.PI / 2.0, FastMath.atan2(0.1, 0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113150);Assert.assertEquals("atan2(0.1, -0.0) should be PI/2", FastMath.PI / 2.0, FastMath.atan2(0.1, -0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113151);Assert.assertEquals("atan2(Inf, 0.1) should be PI/2", FastMath.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 0.1), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113152);Assert.assertEquals("atan2(Inf, -0.1) should be PI/2", FastMath.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, -0.1), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113153);Assert.assertEquals("atan2(-0.1, 0.0) should be -PI/2", -FastMath.PI / 2.0, FastMath.atan2(-0.1, 0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113154);Assert.assertEquals("atan2(-0.1, -0.0) should be -PI/2", -FastMath.PI / 2.0, FastMath.atan2(-0.1, -0.0), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113155);Assert.assertEquals("atan2(-Inf, 0.1) should be -PI/2", -FastMath.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 0.1), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113156);Assert.assertEquals("atan2(-Inf, -0.1) should be -PI/2", -FastMath.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, -0.1), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113157);Assert.assertEquals("atan2(Inf, Inf) should be PI/4", FastMath.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY),
                Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113158);Assert.assertEquals("atan2(Inf, -Inf) should be PI * 3/4", FastMath.PI * 3.0 / 4.0,
                FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113159);Assert.assertEquals("atan2(-Inf, Inf) should be -PI/4", -FastMath.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY),
                Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113160);Assert.assertEquals("atan2(-Inf, -Inf) should be -PI * 3/4", - FastMath.PI * 3.0 / 4.0,
                FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), Precision.EPSILON);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testPowAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ep5hju2fbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testPowAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ep5hju2fbd(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113161);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113162);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113163);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113164)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113165)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113166);double x = (generator.nextDouble() * 2.0 + 0.25);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113167);double y = (generator.nextDouble() * 1200.0 - 600.0) * generator.nextDouble();
            /*
             * double x = FastMath.floor(generator.nextDouble()*1024.0 - 512.0); double
             * y; if (x != 0) y = FastMath.floor(512.0 / FastMath.abs(x)); else
             * y = generator.nextDouble()*1200.0; y = y - y/2; x = FastMath.pow(2.0, x) *
             * generator.nextDouble(); y = y * generator.nextDouble();
             */

            // double x = generator.nextDouble()*2.0;
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113168);double tst = FastMath.pow(x, y);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113169);double ref = DfpMath.pow(field.newDfp(x), field.newDfp(y)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113170);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113171);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113172)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113173)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113174);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double
                                          .doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113175);double errulp = field.newDfp(tst).subtract(DfpMath.pow(field.newDfp(x), field.newDfp(y))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + y + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113176);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113177);Assert.assertTrue("pow() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testExpAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17rwjxx2fbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testExpAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17rwjxx2fbu(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113178);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113179);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113180);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113181)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113182)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113183);double x = ((generator.nextDouble() * 1416.0) - 708.0) * generator.nextDouble();
            // double x = (generator.nextDouble() * 20.0) - 10.0;
            // double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113184);double tst = FastMath.exp(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113185);double ref = DfpMath.exp(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113186);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113187);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113188)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113189)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113190);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113191);double errulp = field.newDfp(tst).subtract(DfpMath.exp(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113192);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113193);Assert.assertTrue("exp() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testSinAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1diy0t62fca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testSinAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1diy0t62fca(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113194);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113195);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113196);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113197)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113198)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            // double x = ((generator.nextDouble() * 1416.0) - 708.0) * generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113199);double x = ((generator.nextDouble() * Math.PI) - Math.PI / 2.0) *
                       Math.pow(2, 21) * generator.nextDouble();
            // double x = (generator.nextDouble() * 20.0) - 10.0;
            // double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113200);double tst = FastMath.sin(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113201);double ref = DfpMath.sin(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113202);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113203);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113204)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113205)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113206);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113207);double errulp = field.newDfp(tst).subtract(DfpMath.sin(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113208);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113209);Assert.assertTrue("sin() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testCosAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhp1or2fcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testCosAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhp1or2fcq(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113210);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113211);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113212);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113213)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113214)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            // double x = ((generator.nextDouble() * 1416.0) - 708.0) * generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113215);double x = ((generator.nextDouble() * Math.PI) - Math.PI / 2.0) *
                       Math.pow(2, 21) * generator.nextDouble();
            // double x = (generator.nextDouble() * 20.0) - 10.0;
            // double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113216);double tst = FastMath.cos(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113217);double ref = DfpMath.cos(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113218);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113219);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113220)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113221)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113222);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113223);double errulp = field.newDfp(tst).subtract(DfpMath.cos(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113224);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113225);Assert.assertTrue("cos() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testTanAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nkgwlr2fd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testTanAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nkgwlr2fd6(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113226);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113227);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113228);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113229)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113230)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            // double x = ((generator.nextDouble() * 1416.0) - 708.0) * generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113231);double x = ((generator.nextDouble() * Math.PI) - Math.PI / 2.0) *
                       Math.pow(2, 12) * generator.nextDouble();
            // double x = (generator.nextDouble() * 20.0) - 10.0;
            // double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113232);double tst = FastMath.tan(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113233);double ref = DfpMath.tan(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113234);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113235);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113236)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113237)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113238);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113239);double errulp = field.newDfp(tst).subtract(DfpMath.tan(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113240);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113241);Assert.assertTrue("tan() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testAtanAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c922xe2fdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAtanAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c922xe2fdm(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113242);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113243);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113244);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113245)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113246)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            // double x = ((generator.nextDouble() * 1416.0) - 708.0) * generator.nextDouble();
            // double x = ((generator.nextDouble() * Math.PI) - Math.PI/2.0) *
            // generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113247);double x = ((generator.nextDouble() * 16.0) - 8.0) * generator.nextDouble();

            // double x = (generator.nextDouble() * 20.0) - 10.0;
            // double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113248);double tst = FastMath.atan(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113249);double ref = DfpMath.atan(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113250);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113251);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113252)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113253)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113254);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113255);double errulp = field.newDfp(tst).subtract(DfpMath.atan(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113256);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113257);Assert.assertTrue("atan() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testAtan2Accuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18b689s2fe2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAtan2Accuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18b689s2fe2(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113258);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113259);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113260);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113261)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113262)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            // double x = ((generator.nextDouble() * 1416.0) - 708.0) * generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113263);double x = generator.nextDouble() - 0.5;
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113264);double y = generator.nextDouble() - 0.5;
            // double x = (generator.nextDouble() * 20.0) - 10.0;
            // double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113265);double tst = FastMath.atan2(y, x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113266);Dfp refdfp = DfpMath.atan(field.newDfp(y)
                .divide(field.newDfp(x)));
            /* Make adjustments for sign */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113267);if ((((x < 0.0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113268)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113269)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113270);if ((((y > 0.0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113271)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113272)==0&false)))
                    {__CLR4_4_12f4x2f4xlb90pf23.R.inc(113273);refdfp = field.getPi().add(refdfp);
                }else
                    {__CLR4_4_12f4x2f4xlb90pf23.R.inc(113274);refdfp = refdfp.subtract(field.getPi());
            }}

            }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113275);double ref = refdfp.toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113276);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113277);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113278)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113279)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113280);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double
                                          .doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113281);double errulp = field.newDfp(tst).subtract(refdfp).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + y + "\t" + tst + "\t" + ref + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113282);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113283);Assert.assertTrue("atan2() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testExpm1Accuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz88up2fes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testExpm1Accuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113284,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz88up2fes(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113284);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113285);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113286);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113287)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113288)==0&false)); i++) {{
            /* double x = 1.0 + i/1024.0/2.0; */
            // double x = (generator.nextDouble() * 20.0) - 10.0;
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113289);double x = ((generator.nextDouble() * 16.0) - 8.0) * generator.nextDouble();
            /* double x = 3.0 / 512.0 * i - 3.0; */
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113290);double tst = FastMath.expm1(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113291);double ref = DfpMath.exp(field.newDfp(x)).subtract(field.getOne()).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113292);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113293);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113294)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113295)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113296);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double
                                          .doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113297);double errulp = field.newDfp(tst).subtract(DfpMath.exp(field.newDfp(x)).subtract(field.getOne())).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113298);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113299);Assert.assertTrue("expm1() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testAsinAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oucuhj2ff8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAsinAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oucuhj2ff8(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113300);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113301);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113302);for (int i=0; (((i<10000)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113303)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113304)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113305);double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113306);double tst = FastMath.asin(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113307);double ref = DfpMath.asin(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113308);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113309);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113310)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113311)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113312);double ulp = Math.abs(ref - Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113313);double errulp = field.newDfp(tst).subtract(DfpMath.asin(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
                //System.out.println(x+"\t"+tst+"\t"+ref+"\t"+err+"\t"+errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113314);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113315);Assert.assertTrue("asin() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testAcosAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x806m02ffo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAcosAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x806m02ffo(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113316);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113317);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113318);for (int i=0; (((i<10000)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113319)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113320)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113321);double x = ((generator.nextDouble() * 2.0) - 1.0) * generator.nextDouble();

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113322);double tst = FastMath.acos(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113323);double ref = DfpMath.acos(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113324);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113325);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113326)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113327)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113328);double ulp = Math.abs(ref - Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113329);double errulp = field.newDfp(tst).subtract(DfpMath.acos(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
                //System.out.println(x+"\t"+tst+"\t"+ref+"\t"+err+"\t"+errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113330);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113331);Assert.assertTrue("acos() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    /**
     * Added tests for a 100% coverage of acos().
     */
    @Test
    public void testAcosSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6univ2fg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAcosSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6univ2fg4(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113332);
        
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113333);Assert.assertTrue("acos(NaN) should be NaN", Double.isNaN(FastMath.acos(Double.NaN)));
        
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113334);Assert.assertTrue("acos(-1.1) should be NaN", Double.isNaN(FastMath.acos(-1.1)));

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113335);Assert.assertTrue("acos(-1.1) should be NaN", Double.isNaN(FastMath.acos(1.1)));
        
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113336);Assert.assertEquals("acos(-1.0) should be PI", FastMath.acos(-1.0), FastMath.PI, Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113337);Assert.assertEquals("acos(1.0) should be 0.0", FastMath.acos(1.0), 0.0, Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113338);Assert.assertEquals("acos(0.0) should be PI/2", FastMath.acos(0.0), FastMath.PI / 2.0, Precision.EPSILON);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    /**
     * Added tests for a 100% coverage of asin().
     */
    @Test
    public void testAsinSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sk51cq2fgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testAsinSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sk51cq2fgb(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113339);
   
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113340);Assert.assertTrue("asin(NaN) should be NaN", Double.isNaN(FastMath.asin(Double.NaN)));
        
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113341);Assert.assertTrue("asin(1.1) should be NaN", Double.isNaN(FastMath.asin(1.1)));
        
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113342);Assert.assertTrue("asin(-1.1) should be NaN", Double.isNaN(FastMath.asin(-1.1)));
        
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113343);Assert.assertEquals("asin(1.0) should be PI/2", FastMath.asin(1.0), FastMath.PI / 2.0, Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113344);Assert.assertEquals("asin(-1.0) should be -PI/2", FastMath.asin(-1.0), -FastMath.PI / 2.0, Precision.EPSILON);

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113345);Assert.assertEquals("asin(0.0) should be 0.0", FastMath.asin(0.0), 0.0, Precision.EPSILON);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    private Dfp cosh(Dfp x) {try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113346);
      __CLR4_4_12f4x2f4xlb90pf23.R.inc(113347);return DfpMath.exp(x).add(DfpMath.exp(x.negate())).divide(2);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    private Dfp sinh(Dfp x) {try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113348);
      __CLR4_4_12f4x2f4xlb90pf23.R.inc(113349);return DfpMath.exp(x).subtract(DfpMath.exp(x.negate())).divide(2);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    private Dfp tanh(Dfp x) {try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113350);
      __CLR4_4_12f4x2f4xlb90pf23.R.inc(113351);return sinh(x).divide(cosh(x));
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testSinhAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm1vsy2fgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testSinhAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm1vsy2fgo(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113352);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113353);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113354);for (int i=0; (((i<10000)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113355)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113356)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113357);double x = ((generator.nextDouble() * 16.0) - 8.0) * generator.nextDouble();

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113358);double tst = FastMath.sinh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113359);double ref = sinh(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113360);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113361);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113362)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113363)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113364);double ulp = Math.abs(ref - Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113365);double errulp = field.newDfp(tst).subtract(sinh(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
                //System.out.println(x+"\t"+tst+"\t"+ref+"\t"+err+"\t"+errulp);
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113366);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113367);Assert.assertTrue("sinh() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testCoshAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5nlil2fh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testCoshAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113368,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5nlil2fh4(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113368);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113369);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113370);for (int i=0; (((i<10000)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113371)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113372)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113373);double x = ((generator.nextDouble() * 16.0) - 8.0) * generator.nextDouble();

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113374);double tst = FastMath.cosh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113375);double ref = cosh(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113376);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113377);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113378)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113379)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113380);double ulp = Math.abs(ref - Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113381);double errulp = field.newDfp(tst).subtract(cosh(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
                //System.out.println(x+"\t"+tst+"\t"+ref+"\t"+err+"\t"+errulp);
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113382);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113383);Assert.assertTrue("cosh() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testTanhAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz09xj2fhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testTanhAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz09xj2fhk(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113384);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113385);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113386);for (int i=0; (((i<10000)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113387)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113388)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113389);double x = ((generator.nextDouble() * 16.0) - 8.0) * generator.nextDouble();

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113390);double tst = FastMath.tanh(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113391);double ref = tanh(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113392);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113393);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113394)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113395)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113396);double ulp = Math.abs(ref - Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113397);double errulp = field.newDfp(tst).subtract(tanh(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
                //System.out.println(x+"\t"+tst+"\t"+ref+"\t"+err+"\t"+errulp);
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113398);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113399);Assert.assertTrue("tanh() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testCbrtAccuracy() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16ts8z72fi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testCbrtAccuracy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16ts8z72fi0(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113400);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113401);double maxerrulp = 0.0;

        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113402);for (int i=0; (((i<10000)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113403)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113404)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113405);double x = ((generator.nextDouble() * 200.0) - 100.0) * generator.nextDouble();

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113406);double tst = FastMath.cbrt(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113407);double ref = cbrt(field.newDfp(x)).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113408);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113409);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113410)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113411)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113412);double ulp = Math.abs(ref - Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113413);double errulp = field.newDfp(tst).subtract(cbrt(field.newDfp(x))).divide(field.newDfp(ulp)).toDouble();
                //System.out.println(x+"\t"+tst+"\t"+ref+"\t"+err+"\t"+errulp);
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113414);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}

        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113415);Assert.assertTrue("cbrt() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    private Dfp cbrt(Dfp x) {try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113416);
      __CLR4_4_12f4x2f4xlb90pf23.R.inc(113417);boolean negative=false;

      __CLR4_4_12f4x2f4xlb90pf23.R.inc(113418);if ((((x.lessThan(field.getZero()))&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113419)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113420)==0&false))) {{
          __CLR4_4_12f4x2f4xlb90pf23.R.inc(113421);negative = true;
          __CLR4_4_12f4x2f4xlb90pf23.R.inc(113422);x = x.negate();
      }

      }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113423);Dfp y = DfpMath.pow(x, field.getOne().divide(3));

      __CLR4_4_12f4x2f4xlb90pf23.R.inc(113424);if ((((negative)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113425)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113426)==0&false))) {{
          __CLR4_4_12f4x2f4xlb90pf23.R.inc(113427);y = y.negate();
      }

      }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113428);return y;
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testToDegrees() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ujba672fit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testToDegrees",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ujba672fit(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113429);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113430);double maxerrulp = 0.0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113431);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113432)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113433)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113434);double x = generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113435);double tst = field.newDfp(x).multiply(180).divide(field.getPi()).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113436);double ref = FastMath.toDegrees(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113437);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113438);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113439)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113440)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113441);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double.doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113442);double errulp = field.newDfp(tst).subtract(DfpMath.exp(field.newDfp(x)).subtract(field.getOne())).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113443);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113444);Assert.assertTrue("toDegrees() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testToRadians() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vjclsk2fj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testToRadians",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vjclsk2fj9(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113445);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113446);double maxerrulp = 0.0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113447);for (int i = 0; (((i < NUMBER_OF_TRIALS)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113448)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113449)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113450);double x = generator.nextDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113451);double tst = field.newDfp(x).multiply(field.getPi()).divide(180).toDouble();
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113452);double ref = FastMath.toRadians(x);
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113453);double err = (tst - ref) / ref;

            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113454);if ((((err != 0)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113455)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113456)==0&false))) {{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113457);double ulp = Math.abs(ref -
                                      Double.longBitsToDouble((Double
                                          .doubleToLongBits(ref) ^ 1)));
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113458);double errulp = field.newDfp(tst).subtract(DfpMath.exp(field.newDfp(x)).subtract(field.getOne())).divide(field.newDfp(ulp)).toDouble();
//                System.out.println(x + "\t" + tst + "\t" + ref + "\t" + err + "\t" + errulp);

                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113459);maxerrulp = Math.max(maxerrulp, Math.abs(errulp));
            }
        }}
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113460);Assert.assertTrue("toRadians() had errors in excess of " + MAX_ERROR_ULP + " ULP", maxerrulp < MAX_ERROR_ULP);

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testNextAfter() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wb8hpa2fjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testNextAfter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113461,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wb8hpa2fjp(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113461);
        // 0x402fffffffffffff 0x404123456789abcd -> 4030000000000000
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113462);Assert.assertEquals(16.0, FastMath.nextAfter(15.999999999999998, 34.27555555555555), 0.0);

        // 0xc02fffffffffffff 0x404123456789abcd -> c02ffffffffffffe
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113463);Assert.assertEquals(-15.999999999999996, FastMath.nextAfter(-15.999999999999998, 34.27555555555555), 0.0);

        // 0x402fffffffffffff 0x400123456789abcd -> 402ffffffffffffe
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113464);Assert.assertEquals(15.999999999999996, FastMath.nextAfter(15.999999999999998, 2.142222222222222), 0.0);

        // 0xc02fffffffffffff 0x400123456789abcd -> c02ffffffffffffe
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113465);Assert.assertEquals(-15.999999999999996, FastMath.nextAfter(-15.999999999999998, 2.142222222222222), 0.0);

        // 0x4020000000000000 0x404123456789abcd -> 4020000000000001
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113466);Assert.assertEquals(8.000000000000002, FastMath.nextAfter(8.0, 34.27555555555555), 0.0);

        // 0xc020000000000000 0x404123456789abcd -> c01fffffffffffff
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113467);Assert.assertEquals(-7.999999999999999, FastMath.nextAfter(-8.0, 34.27555555555555), 0.0);

        // 0x4020000000000000 0x400123456789abcd -> 401fffffffffffff
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113468);Assert.assertEquals(7.999999999999999, FastMath.nextAfter(8.0, 2.142222222222222), 0.0);

        // 0xc020000000000000 0x400123456789abcd -> c01fffffffffffff
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113469);Assert.assertEquals(-7.999999999999999, FastMath.nextAfter(-8.0, 2.142222222222222), 0.0);

        // 0x3f2e43753d36a223 0x3f2e43753d36a224 -> 3f2e43753d36a224
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113470);Assert.assertEquals(2.308922399667661E-4, FastMath.nextAfter(2.3089223996676606E-4, 2.308922399667661E-4), 0.0);

        // 0x3f2e43753d36a223 0x3f2e43753d36a223 -> 3f2e43753d36a223
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113471);Assert.assertEquals(2.3089223996676606E-4, FastMath.nextAfter(2.3089223996676606E-4, 2.3089223996676606E-4), 0.0);

        // 0x3f2e43753d36a223 0x3f2e43753d36a222 -> 3f2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113472);Assert.assertEquals(2.3089223996676603E-4, FastMath.nextAfter(2.3089223996676606E-4, 2.3089223996676603E-4), 0.0);

        // 0x3f2e43753d36a223 0xbf2e43753d36a224 -> 3f2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113473);Assert.assertEquals(2.3089223996676603E-4, FastMath.nextAfter(2.3089223996676606E-4, -2.308922399667661E-4), 0.0);

        // 0x3f2e43753d36a223 0xbf2e43753d36a223 -> 3f2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113474);Assert.assertEquals(2.3089223996676603E-4, FastMath.nextAfter(2.3089223996676606E-4, -2.3089223996676606E-4), 0.0);

        // 0x3f2e43753d36a223 0xbf2e43753d36a222 -> 3f2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113475);Assert.assertEquals(2.3089223996676603E-4, FastMath.nextAfter(2.3089223996676606E-4, -2.3089223996676603E-4), 0.0);

        // 0xbf2e43753d36a223 0x3f2e43753d36a224 -> bf2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113476);Assert.assertEquals(-2.3089223996676603E-4, FastMath.nextAfter(-2.3089223996676606E-4, 2.308922399667661E-4), 0.0);

        // 0xbf2e43753d36a223 0x3f2e43753d36a223 -> bf2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113477);Assert.assertEquals(-2.3089223996676603E-4, FastMath.nextAfter(-2.3089223996676606E-4, 2.3089223996676606E-4), 0.0);

        // 0xbf2e43753d36a223 0x3f2e43753d36a222 -> bf2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113478);Assert.assertEquals(-2.3089223996676603E-4, FastMath.nextAfter(-2.3089223996676606E-4, 2.3089223996676603E-4), 0.0);

        // 0xbf2e43753d36a223 0xbf2e43753d36a224 -> bf2e43753d36a224
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113479);Assert.assertEquals(-2.308922399667661E-4, FastMath.nextAfter(-2.3089223996676606E-4, -2.308922399667661E-4), 0.0);

        // 0xbf2e43753d36a223 0xbf2e43753d36a223 -> bf2e43753d36a223
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113480);Assert.assertEquals(-2.3089223996676606E-4, FastMath.nextAfter(-2.3089223996676606E-4, -2.3089223996676606E-4), 0.0);

        // 0xbf2e43753d36a223 0xbf2e43753d36a222 -> bf2e43753d36a222
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113481);Assert.assertEquals(-2.3089223996676603E-4, FastMath.nextAfter(-2.3089223996676606E-4, -2.3089223996676603E-4), 0.0);

    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testDoubleNextAfterSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxdg7r2fka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testDoubleNextAfterSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxdg7r2fka(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113482);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113483);Assert.assertEquals(-Double.MAX_VALUE,FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0D), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113484);Assert.assertEquals(Double.MAX_VALUE,FastMath.nextAfter(Double.POSITIVE_INFINITY, 0D), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113485);Assert.assertEquals(Double.NaN,FastMath.nextAfter(Double.NaN, 0D), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113486);Assert.assertEquals(Double.POSITIVE_INFINITY,FastMath.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113487);Assert.assertEquals(Double.NEGATIVE_INFINITY,FastMath.nextAfter(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113488);Assert.assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0D, 1D), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113489);Assert.assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0D, -1D), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113490);Assert.assertEquals(0D, FastMath.nextAfter(Double.MIN_VALUE, -1), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113491);Assert.assertEquals(0D, FastMath.nextAfter(-Double.MIN_VALUE, 1), 0D);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testFloatNextAfterSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n2b54g2fkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testFloatNextAfterSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113492,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n2b54g2fkk(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113492);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113493);Assert.assertEquals(-Float.MAX_VALUE,FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0F), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113494);Assert.assertEquals(Float.MAX_VALUE,FastMath.nextAfter(Float.POSITIVE_INFINITY, 0F), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113495);Assert.assertEquals(Float.NaN,FastMath.nextAfter(Float.NaN, 0F), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113496);Assert.assertEquals(Float.POSITIVE_INFINITY,FastMath.nextAfter(Float.MAX_VALUE, Float.POSITIVE_INFINITY), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113497);Assert.assertEquals(Float.NEGATIVE_INFINITY,FastMath.nextAfter(-Float.MAX_VALUE, Float.NEGATIVE_INFINITY), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113498);Assert.assertEquals(Float.MIN_VALUE, FastMath.nextAfter(0F, 1F), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113499);Assert.assertEquals(-Float.MIN_VALUE, FastMath.nextAfter(0F, -1F), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113500);Assert.assertEquals(0F, FastMath.nextAfter(Float.MIN_VALUE, -1F), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113501);Assert.assertEquals(0F, FastMath.nextAfter(-Float.MIN_VALUE, 1F), 0F);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testDoubleScalbSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tcx1o52fku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testDoubleScalbSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113502,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tcx1o52fku(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113502);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113503);Assert.assertEquals(2.5269841324701218E-175,  FastMath.scalb(2.2250738585072014E-308, 442), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113504);Assert.assertEquals(1.307993905256674E297,    FastMath.scalb(1.1102230246251565E-16, 1040), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113505);Assert.assertEquals(7.2520887996488946E-217,  FastMath.scalb(Double.MIN_VALUE,        356), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113506);Assert.assertEquals(8.98846567431158E307,     FastMath.scalb(Double.MIN_VALUE,       2097), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113507);Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.MIN_VALUE,       2098), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113508);Assert.assertEquals(1.1125369292536007E-308,  FastMath.scalb(2.225073858507201E-308,   -1), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113509);Assert.assertEquals(1.0E-323,                 FastMath.scalb(Double.MAX_VALUE,      -2097), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113510);Assert.assertEquals(Double.MIN_VALUE,         FastMath.scalb(Double.MAX_VALUE,      -2098), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113511);Assert.assertEquals(0,                        FastMath.scalb(Double.MAX_VALUE,      -2099), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113512);Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, -1000000), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113513);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.1102230246251565E-16, 1078), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113514);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.1102230246251565E-16,  1079), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113515);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-2.2250738585072014E-308, 2047), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113516);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-2.2250738585072014E-308, 2048), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113517);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.7976931348623157E308,  2147483647), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113518);Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb( 1.7976931348623157E308,  2147483647), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113519);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.1102230246251565E-16,  2147483647), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113520);Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb( 1.1102230246251565E-16,  2147483647), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113521);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-2.2250738585072014E-308, 2147483647), 0D);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113522);Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb( 2.2250738585072014E-308, 2147483647), 0D);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testFloatScalbSpecialCases() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qoqnaq2flf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testFloatScalbSpecialCases",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qoqnaq2flf(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113523);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113524);Assert.assertEquals(0f,                       FastMath.scalb(Float.MIN_VALUE,  -30), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113525);Assert.assertEquals(2 * Float.MIN_VALUE,      FastMath.scalb(Float.MIN_VALUE,    1), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113526);Assert.assertEquals(7.555786e22f,             FastMath.scalb(Float.MAX_VALUE,  -52), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113527);Assert.assertEquals(1.7014118e38f,            FastMath.scalb(Float.MIN_VALUE,  276), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113528);Assert.assertEquals(Float.POSITIVE_INFINITY,  FastMath.scalb(Float.MIN_VALUE,  277), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113529);Assert.assertEquals(5.8774718e-39f,           FastMath.scalb(1.1754944e-38f,    -1), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113530);Assert.assertEquals(2 * Float.MIN_VALUE,      FastMath.scalb(Float.MAX_VALUE, -276), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113531);Assert.assertEquals(Float.MIN_VALUE,          FastMath.scalb(Float.MAX_VALUE, -277), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113532);Assert.assertEquals(0,                        FastMath.scalb(Float.MAX_VALUE, -278), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113533);Assert.assertEquals(Float.POSITIVE_INFINITY,  FastMath.scalb(Float.POSITIVE_INFINITY, -1000000), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113534);Assert.assertEquals(-3.13994498e38f,          FastMath.scalb(-1.1e-7f,         151), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113535);Assert.assertEquals(Float.NEGATIVE_INFINITY,  FastMath.scalb(-1.1e-7f,         152), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113536);Assert.assertEquals(Float.POSITIVE_INFINITY,  FastMath.scalb(3.4028235E38f,  2147483647), 0F);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113537);Assert.assertEquals(Float.NEGATIVE_INFINITY,  FastMath.scalb(-3.4028235E38f, 2147483647), 0F);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    private boolean compareClassMethods(Class<?> class1, Class<?> class2){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113538);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113539);boolean allfound = true;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113540);for(Method method1 : class1.getDeclaredMethods()){{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113541);if ((((Modifier.isPublic(method1.getModifiers()))&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113542)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113543)==0&false))){{
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113544);Type []params = method1.getGenericParameterTypes();
                __CLR4_4_12f4x2f4xlb90pf23.R.inc(113545);try {
                    __CLR4_4_12f4x2f4xlb90pf23.R.inc(113546);class2.getDeclaredMethod(method1.getName(), (Class[]) params);
                } catch (NoSuchMethodException e) {
                    __CLR4_4_12f4x2f4xlb90pf23.R.inc(113547);allfound = false;
                    __CLR4_4_12f4x2f4xlb90pf23.R.inc(113548);System.out.println(class2.getSimpleName()+" does not implement: "+method1);
                }
            }
        }}
        }__CLR4_4_12f4x2f4xlb90pf23.R.inc(113549);return allfound;
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void checkMissingFastMathClasses() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlgw2d2fm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.checkMissingFastMathClasses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlgw2d2fm6(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113550);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void checkMissingFastMathClasses() {
//         boolean ok = compareClassMethods(StrictMath.class, FastMath.class);
//         Assert.assertTrue("FastMath should implement all StrictMath methods", ok);
//     }

    @Ignore
    @Test
    public void checkExtraFastMathClasses() {try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113551);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113552);compareClassMethods( FastMath.class, StrictMath.class);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testSignumDouble() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u2q88v2fm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testSignumDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113553,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u2q88v2fm9(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113553);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113554);final double delta = 0.0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113555);Assert.assertEquals(1.0, FastMath.signum(2.0), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113556);Assert.assertEquals(0.0, FastMath.signum(0.0), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113557);Assert.assertEquals(-1.0, FastMath.signum(-2.0), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113558);TestUtils.assertSame(-0. / 0., FastMath.signum(Double.NaN));
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testSignumFloat() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1enw2rg2fmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testSignumFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1enw2rg2fmf(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113559);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113560);final float delta = 0.0F;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113561);Assert.assertEquals(1.0F, FastMath.signum(2.0F), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113562);Assert.assertEquals(0.0F, FastMath.signum(0.0F), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113563);Assert.assertEquals(-1.0F, FastMath.signum(-2.0F), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113564);TestUtils.assertSame(Float.NaN, FastMath.signum(Float.NaN));
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testLogWithBase() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y86tsg2fml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testLogWithBase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y86tsg2fml(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113565);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113566);Assert.assertEquals(2.0, FastMath.log(2, 4), 0);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113567);Assert.assertEquals(3.0, FastMath.log(2, 8), 0);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113568);Assert.assertTrue(Double.isNaN(FastMath.log(-1, 1)));
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113569);Assert.assertTrue(Double.isNaN(FastMath.log(1, -1)));
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113570);Assert.assertTrue(Double.isNaN(FastMath.log(0, 0)));
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113571);Assert.assertEquals(0, FastMath.log(0, 10), 0);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113572);Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(10, 0), 0);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testIndicatorDouble() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n0a3x12fmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testIndicatorDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n0a3x12fmt(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113573);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113574);double delta = 0.0;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113575);Assert.assertEquals(1.0, FastMath.copySign(1d, 2.0), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113576);Assert.assertEquals(1.0, FastMath.copySign(1d, 0.0), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113577);Assert.assertEquals(-1.0, FastMath.copySign(1d, -0.0), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113578);Assert.assertEquals(1.0, FastMath.copySign(1d, Double.POSITIVE_INFINITY), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113579);Assert.assertEquals(-1.0, FastMath.copySign(1d, Double.NEGATIVE_INFINITY), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113580);Assert.assertEquals(1.0, FastMath.copySign(1d, Double.NaN), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113581);Assert.assertEquals(-1.0, FastMath.copySign(1d, -2.0), delta);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testIndicatorFloat() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d260gq2fn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testIndicatorFloat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113582,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d260gq2fn2(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113582);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113583);float delta = 0.0F;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113584);Assert.assertEquals(1.0F, FastMath.copySign(1d, 2.0F), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113585);Assert.assertEquals(1.0F, FastMath.copySign(1d, 0.0F), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113586);Assert.assertEquals(-1.0F, FastMath.copySign(1d, -0.0F), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113587);Assert.assertEquals(1.0F, FastMath.copySign(1d, Float.POSITIVE_INFINITY), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113588);Assert.assertEquals(-1.0F, FastMath.copySign(1d, Float.NEGATIVE_INFINITY), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113589);Assert.assertEquals(1.0F, FastMath.copySign(1d, Float.NaN), delta);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113590);Assert.assertEquals(-1.0F, FastMath.copySign(1d, -2.0F), delta);
    }finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

    @Test
    public void testIntPow() {__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceStart(getClass().getName(),113591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jc8e0u2fnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f4x2f4xlb90pf23.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f4x2f4xlb90pf23.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathTest.testIntPow",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113591,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jc8e0u2fnb(){try{__CLR4_4_12f4x2f4xlb90pf23.R.inc(113591);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113592);final int maxExp = 300;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113593);DfpField field = new DfpField(40);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113594);final double base = 1.23456789;
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113595);Dfp baseDfp = field.newDfp(base);
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113596);Dfp dfpPower = field.getOne();
        __CLR4_4_12f4x2f4xlb90pf23.R.inc(113597);for (int i = 0; (((i < maxExp)&&(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113598)!=0|true))||(__CLR4_4_12f4x2f4xlb90pf23.R.iget(113599)==0&false)); i++) {{
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113600);Assert.assertEquals("exp=" + i, dfpPower.toDouble(), FastMath.pow(base, i),
                                0.6 * FastMath.ulp(dfpPower.toDouble()));
            __CLR4_4_12f4x2f4xlb90pf23.R.inc(113601);dfpPower = dfpPower.multiply(baseDfp);
        }
    }}finally{__CLR4_4_12f4x2f4xlb90pf23.R.flushNeeded();}}

}
