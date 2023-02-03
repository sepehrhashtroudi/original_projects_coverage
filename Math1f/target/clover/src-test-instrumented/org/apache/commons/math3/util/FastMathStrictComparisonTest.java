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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test to compare FastMath results against StrictMath results for boundary values.
 * <p>
 * Running all tests independently: <br/>
 * {@code mvn test -Dtest=FastMathStrictComparisonTest}<br/>
 * or just run tests against a single method (e.g. scalb):<br/>
 * {@code mvn test -Dtest=FastMathStrictComparisonTest -DargLine="-DtestMethod=scalb"}
 */
@SuppressWarnings("boxing")
@RunWith(Parameterized.class)
public class FastMathStrictComparisonTest {static class __CLR4_4_12f0s2f0slb90peyk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112929,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    // Values which often need special handling
    private static final Double[] DOUBLE_SPECIAL_VALUES = {
        -0.0, +0.0,                                         // 1,2
        Double.NaN,                                         // 3
        Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, // 4,5
        -Double.MAX_VALUE, Double.MAX_VALUE,                // 6,7
        // decreasing order of absolute value to help catch first failure
        -Precision.EPSILON, Precision.EPSILON,              // 8,9
        -Precision.SAFE_MIN, Precision.SAFE_MIN,            // 10,11
        -Double.MIN_VALUE, Double.MIN_VALUE,                // 12,13
    };

    private static final Float [] FLOAT_SPECIAL_VALUES = {
        -0.0f, +0.0f,                                       // 1,2
        Float.NaN,                                          // 3
        Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY,   // 4,5
        Float.MIN_VALUE, Float.MAX_VALUE,                   // 6,7
        -Float.MIN_VALUE, -Float.MAX_VALUE,                 // 8,9
    };

    private static final Object [] LONG_SPECIAL_VALUES = {
        -1,0,1,                                             // 1,2,3
        Long.MIN_VALUE, Long.MAX_VALUE,                     // 4,5
    };

    private static final Object[] INT_SPECIAL_VALUES = {
        -1,0,1,                                             // 1,2,3
        Integer.MIN_VALUE, Integer.MAX_VALUE,               // 4,5
    };

    private final Method mathMethod;
    private final Method fastMethod;
    private final Type[] types;
    private final Object[][] valueArrays;

    public FastMathStrictComparisonTest(Method m, Method f, Type[] types, Object[][] data) throws Exception{try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112780);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112781);this.mathMethod=m;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112782);this.fastMethod=f;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112783);this.types=types;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112784);this.valueArrays=data;
    }finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}

    @Test
    public void test1() throws Exception{__CLR4_4_12f0s2f0slb90peyk.R.globalSliceStart(getClass().getName(),112785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beu2f0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12f0s2f0slb90peyk.R.rethrow($CLV_t2$);}finally{__CLR4_4_12f0s2f0slb90peyk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.FastMathStrictComparisonTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beu2f0x() throws Exception{try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112785);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112786);setupMethodCall(mathMethod, fastMethod, types, valueArrays);
    }finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}
    private static boolean isNumber(Double d) {try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112787);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112788);return !(d.isInfinite() || d.isNaN());
    }finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}

    private static boolean isNumber(Float f) {try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112789);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112790);return !(f.isInfinite() || f.isNaN());
    }finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}

    private static void reportFailedResults(Method mathMethod, Object[] params, Object expected, Object actual, int[] entries){try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112791);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112792);final String methodName = mathMethod.getName();
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112793);String format = null;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112794);long actL=0;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112795);long expL=0;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112796);if ((((expected instanceof Double)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112797)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112798)==0&false))) {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112799);Double exp = (Double) expected;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112800);Double act = (Double) actual;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112801);if ((((isNumber(exp) && isNumber(act) && exp != 0)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112802)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112803)==0&false))) {{ // show difference as hex
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112804);actL = Double.doubleToLongBits(act);
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112805);expL = Double.doubleToLongBits(exp);
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112806);if ((((Math.abs(actL-expL)==1)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112807)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112808)==0&false))) {{
                    // Not 100% sure off-by-one errors are allowed everywhere, so only allow for these methods
                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112809);if ((((methodName.equals("toRadians") || methodName.equals("atan2"))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112810)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112811)==0&false))) {{
                        __CLR4_4_12f0s2f0slb90peyk.R.inc(112812);return;
                    }
                }}
                }__CLR4_4_12f0s2f0slb90peyk.R.inc(112813);format = "%016x";
            }
        }} }else {__CLR4_4_12f0s2f0slb90peyk.R.inc(112814);if ((((expected instanceof Float )&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112815)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112816)==0&false))){{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112817);Float exp = (Float) expected;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112818);Float act = (Float) actual;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112819);if ((((isNumber(exp) && isNumber(act) && exp != 0)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112820)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112821)==0&false))) {{ // show difference as hex
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112822);actL = Float.floatToIntBits(act);
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112823);expL = Float.floatToIntBits(exp);
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112824);format = "%08x";
            }
        }}
        }}__CLR4_4_12f0s2f0slb90peyk.R.inc(112825);StringBuilder sb = new StringBuilder();
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112826);sb.append(mathMethod.getReturnType().getSimpleName());
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112827);sb.append(" ");
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112828);sb.append(methodName);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112829);sb.append("(");
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112830);String sep = "";
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112831);for(Object o : params){{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112832);sb.append(sep);
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112833);sb.append(o);
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112834);sep=", ";
        }
        }__CLR4_4_12f0s2f0slb90peyk.R.inc(112835);sb.append(") expected ");
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112836);if ((((format != null)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112837)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112838)==0&false))){{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112839);sb.append(String.format(format, expL));
        } }else {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112840);sb.append(expected);
        }
        }__CLR4_4_12f0s2f0slb90peyk.R.inc(112841);sb.append(" actual ");
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112842);if ((((format != null)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112843)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112844)==0&false))){{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112845);sb.append(String.format(format, actL));
        } }else {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112846);sb.append(actual);
        }
        }__CLR4_4_12f0s2f0slb90peyk.R.inc(112847);sb.append(" entries ");
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112848);sb.append(Arrays.toString(entries));
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112849);String message = sb.toString();
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112850);final boolean fatal = true;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112851);if ((((fatal)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112852)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112853)==0&false))) {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112854);Assert.fail(message);
        } }else {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112855);System.out.println(message);
        }
    }}finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}

    private static void callMethods(Method mathMethod, Method fastMethod,
            Object[] params, int[] entries) throws IllegalAccessException,
            InvocationTargetException {try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112856);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112857);try {
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112858);Object expected = mathMethod.invoke(mathMethod, params);
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112859);Object actual = fastMethod.invoke(mathMethod, params);
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112860);if ((((!expected.equals(actual))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112861)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112862)==0&false))) {{
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112863);reportFailedResults(mathMethod, params, expected, actual, entries);
            }
        }} catch (IllegalArgumentException e) {
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112864);Assert.fail(mathMethod+" "+e);
        }
    }finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}

    private static void setupMethodCall(Method mathMethod, Method fastMethod,
            Type[] types, Object[][] valueArrays) throws Exception {try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112865);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112866);Object[] params = new Object[types.length];
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112867);int entry1 = 0;
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112868);int[] entries = new int[types.length];
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112869);for(Object d : valueArrays[0]) {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112870);entry1++;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112871);params[0] = d;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112872);entries[0] = entry1;
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112873);if ((((params.length > 1)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112874)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112875)==0&false))){{
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112876);int entry2 = 0;
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112877);for(Object d1 : valueArrays[1]) {{
                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112878);entry2++;
                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112879);params[1] = d1;
                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112880);entries[1] = entry2;
                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112881);callMethods(mathMethod, fastMethod, params, entries);
                }
            }} }else {{
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112882);callMethods(mathMethod, fastMethod, params, entries);
            }
        }}
    }}finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}

    @Parameters
    public static List<Object[]> data() throws Exception {try{__CLR4_4_12f0s2f0slb90peyk.R.inc(112883);
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112884);String singleMethod = System.getProperty("testMethod");
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112885);List<Object[]> list = new ArrayList<Object[]>();
        __CLR4_4_12f0s2f0slb90peyk.R.inc(112886);for(Method mathMethod : StrictMath.class.getDeclaredMethods()) {{
            __CLR4_4_12f0s2f0slb90peyk.R.inc(112887);method:
            if ((((Modifier.isPublic(mathMethod.getModifiers()))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112888)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112889)==0&false))){{// Only test public methods
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112890);Type []types = mathMethod.getGenericParameterTypes();
                __CLR4_4_12f0s2f0slb90peyk.R.inc(112891);if ((((types.length >=1)&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112892)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112893)==0&false))) {{ // Only check methods with at least one parameter
                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112894);try {
                        // Get the corresponding FastMath method
                        __CLR4_4_12f0s2f0slb90peyk.R.inc(112895);Method fastMethod = FastMath.class.getDeclaredMethod(mathMethod.getName(), (Class[]) types);
                        __CLR4_4_12f0s2f0slb90peyk.R.inc(112896);if ((((Modifier.isPublic(fastMethod.getModifiers()))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112897)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112898)==0&false))) {{ // It must be public too
                            __CLR4_4_12f0s2f0slb90peyk.R.inc(112899);if ((((singleMethod != null && !fastMethod.getName().equals(singleMethod))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112900)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112901)==0&false))) {{
                                __CLR4_4_12f0s2f0slb90peyk.R.inc(112902);break method;
                            }
                            }__CLR4_4_12f0s2f0slb90peyk.R.inc(112903);Object [][] values = new Object[types.length][];
                            __CLR4_4_12f0s2f0slb90peyk.R.inc(112904);int index = 0;
                            __CLR4_4_12f0s2f0slb90peyk.R.inc(112905);for(Type t : types) {{
                                __CLR4_4_12f0s2f0slb90peyk.R.inc(112906);if ((((t.equals(double.class))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112907)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112908)==0&false))){{
                                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112909);values[index]=DOUBLE_SPECIAL_VALUES;
                                } }else {__CLR4_4_12f0s2f0slb90peyk.R.inc(112910);if ((((t.equals(float.class))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112911)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112912)==0&false))) {{
                                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112913);values[index]=FLOAT_SPECIAL_VALUES;
                                } }else {__CLR4_4_12f0s2f0slb90peyk.R.inc(112914);if ((((t.equals(long.class))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112915)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112916)==0&false))) {{
                                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112917);values[index]=LONG_SPECIAL_VALUES;
                                } }else {__CLR4_4_12f0s2f0slb90peyk.R.inc(112918);if ((((t.equals(int.class))&&(__CLR4_4_12f0s2f0slb90peyk.R.iget(112919)!=0|true))||(__CLR4_4_12f0s2f0slb90peyk.R.iget(112920)==0&false))) {{
                                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112921);values[index]=INT_SPECIAL_VALUES;
                                } }else {{
                                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112922);System.out.println("Cannot handle class "+t+" for "+mathMethod);
                                    __CLR4_4_12f0s2f0slb90peyk.R.inc(112923);break method;
                                }
                                }}}}__CLR4_4_12f0s2f0slb90peyk.R.inc(112924);index++;
                            }
//                            System.out.println(fastMethod);
                            /*
                             * The current implementation runs each method as a separate test.
                             * Could be amended to run each value as a separate test
                             */
                            }__CLR4_4_12f0s2f0slb90peyk.R.inc(112925);list.add(new Object[]{mathMethod, fastMethod, types, values});
//                            setupMethodCall(mathMethod, fastMethod, params, data);
                        } }else {{
                            __CLR4_4_12f0s2f0slb90peyk.R.inc(112926);System.out.println("Cannot find public FastMath method corresponding to: "+mathMethod);
                        }
                    }} catch (NoSuchMethodException e) {
                        __CLR4_4_12f0s2f0slb90peyk.R.inc(112927);System.out.println("Cannot find FastMath method corresponding to: "+mathMethod);
                    }
                }
            }}
        }}
        }__CLR4_4_12f0s2f0slb90peyk.R.inc(112928);return list;
    }finally{__CLR4_4_12f0s2f0slb90peyk.R.flushNeeded();}}
}
