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
package org.apache.commons.math3;

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathArrays;
import org.junit.Assert;
import org.junit.Test;

public abstract class ExtendedFieldElementAbstractTest<T extends RealFieldElement<T>> {static class __CLR4_4_11bci1bcilb90pbpt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,61758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected abstract T build(double x);

    @Test
    public void testAddField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ma9o21bci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAddField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ma9o21bci(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61362);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61363);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61364)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61365)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61366);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61367)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61368)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61369);checkRelative(x + y, build(x).add(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAddDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvnyop1bcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAddDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61370,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvnyop1bcq(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61370);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61371);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61372)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61373)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61374);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61375)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61376)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61377);checkRelative(x + y, build(x).add(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testSubtractField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g96kkb1bcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testSubtractField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g96kkb1bcy(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61378);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61379);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61380)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61381)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61382);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61383)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61384)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61385);checkRelative(x - y, build(x).subtract(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testSubtractDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cpp76m1bd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testSubtractDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61386,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cpp76m1bd6(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61386);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61387);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61388)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61389)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61390);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61391)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61392)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61393);checkRelative(x - y, build(x).subtract(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testMultiplyField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvxfn91bde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testMultiplyField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvxfn91bde(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61394);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61395);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61396)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61397)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61398);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61399)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61400)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61401);checkRelative(x * y, build(x).multiply(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testMultiplyDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bebma1bdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testMultiplyDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61402,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bebma1bdm(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61402);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61403);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61404)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61405)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61406);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61407)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61408)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61409);checkRelative(x * y, build(x).multiply(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testMultiplyInt() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jci0f41bdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testMultiplyInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jci0f41bdu(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61410);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61411);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61412)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61413)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61414);for (int y = -10; (((y < 10)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61415)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61416)==0&false)); y += 1) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61417);checkRelative(x * y, build(x).multiply(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testDivideField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5zngq1be2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testDivideField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5zngq1be2(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61418);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61419);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61420)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61421)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61422);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61423)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61424)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61425);checkRelative(x / y, build(x).divide(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testDivideDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p9ldsz1bea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testDivideDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p9ldsz1bea(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61426);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61427);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61428)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61429)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61430);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61431)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61432)==0&false)); y += 0.2) {{
                    __CLR4_4_11bci1bcilb90pbpt.R.inc(61433);checkRelative(x / y, build(x).divide(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testRemainderField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hu31xu1bei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testRemainderField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61434,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hu31xu1bei(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61434);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61435);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61436)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61437)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61438);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61439)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61440)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61441);checkRelative(FastMath.IEEEremainder(x, y), build(x).remainder(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testRemainderDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ld3n6z1beq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testRemainderDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ld3n6z1beq(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61442);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61443);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61444)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61445)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61446);for (double y = -3.2; (((y < 3.2)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61447)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61448)==0&false)); y += 0.25) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61449);checkRelative(FastMath.IEEEremainder(x, y), build(x).remainder(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testCos() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mz11ok1bey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testCos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mz11ok1bey(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61450);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61451);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61452)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61453)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61454);checkRelative(FastMath.cos(x), build(x).cos());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAcos() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_175tfgf1bf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAcos",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_175tfgf1bf3(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61455);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61456);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61457)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61458)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61459);checkRelative(FastMath.acos(x), build(x).acos());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testSin() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wfmv711bf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testSin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wfmv711bf8(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61460);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61461);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61462)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61463)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61464);checkRelative(FastMath.sin(x), build(x).sin());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAsin() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18gmpn41bfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAsin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18gmpn41bfd(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61465);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61466);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61467)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61468)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61469);checkRelative(FastMath.asin(x), build(x).asin());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testTan() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15n93x21bfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testTan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15n93x21bfi(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61470);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61471);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61472)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61473)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61474);checkRelative(FastMath.tan(x), build(x).tan());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAtan() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z90gx31bfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAtan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z90gx31bfn(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61475);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61476);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61477)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61478)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61479);checkRelative(FastMath.atan(x), build(x).atan());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAtan2() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhqhrb1bfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAtan2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhqhrb1bfs(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61480);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61481);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61482)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61483)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61484);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61485)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61486)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61487);checkRelative(FastMath.atan2(x, y), build(x).atan2(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testCosh() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13cad0a1bg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testCosh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13cad0a1bg0(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61488);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61489);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61490)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61491)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61492);checkRelative(FastMath.cosh(x), build(x).cosh());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAcosh() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e42elz1bg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAcosh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e42elz1bg5(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61493);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61494);for (double x = 1.1; (((x < 5.0)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61495)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61496)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61497);checkRelative(FastMath.acosh(x), build(x).acosh());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testSinh() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g86csp1bga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testSinh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g86csp1bga(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61498);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61499);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61500)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61501)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61502);checkRelative(FastMath.sinh(x), build(x).sinh());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAsinh() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzyeee1bgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAsinh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzyeee1bgf(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61503);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61504);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61505)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61506)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61507);checkRelative(FastMath.asinh(x), build(x).asinh());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testTanh() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wvfj281bgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testTanh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wvfj281bgk(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61508);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61509);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61510)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61511)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61512);checkRelative(FastMath.tanh(x), build(x).tanh());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testAtanh() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m3nhgj1bgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAtanh",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m3nhgj1bgp(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61513);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61514);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61515)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61516)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61517);checkRelative(FastMath.atanh(x), build(x).atanh());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testSqrt() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eyjxll1bgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testSqrt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eyjxll1bgu(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61518);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61519);for (double x = 0.01; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61520)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61521)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61522);checkRelative(FastMath.sqrt(x), build(x).sqrt());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testCbrt() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1unm0sm1bgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testCbrt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1unm0sm1bgz(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61523);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61524);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61525)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61526)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61527);checkRelative(FastMath.cbrt(x), build(x).cbrt());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testHypot() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qcoyex1bh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testHypot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qcoyex1bh4(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61528);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61529);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61530)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61531)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61532);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61533)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61534)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61535);checkRelative(FastMath.hypot(x, y), build(x).hypot(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testRootN() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmvp6p1bhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testRootN",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmvp6p1bhc(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61536);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61537);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61538)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61539)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61540);for (int n = 1; (((n < 5)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61541)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61542)==0&false)); ++n) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61543);if ((((x < 0)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61544)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61545)==0&false))) {{
                    __CLR4_4_11bci1bcilb90pbpt.R.inc(61546);if ((((n % 2 == 1)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61547)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61548)==0&false))) {{
                        __CLR4_4_11bci1bcilb90pbpt.R.inc(61549);checkRelative(-FastMath.pow(-x, 1.0 / n), build(x).rootN(n));
                    }
                }} }else {{
                    __CLR4_4_11bci1bcilb90pbpt.R.inc(61550);checkRelative(FastMath.pow(x, 1.0 / n), build(x).rootN(n));
                }
            }}
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testPowField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1milmt1bhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testPowField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1milmt1bhr(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61551);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61552);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61553)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61554)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61555);for (double y = 0.1; (((y < 4)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61556)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61557)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61558);checkRelative(FastMath.pow(x, y), build(x).pow(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testPowDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dd6r421bhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testPowDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dd6r421bhz(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61559);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61560);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61561)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61562)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61563);for (double y = 0.1; (((y < 4)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61564)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61565)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61566);checkRelative(FastMath.pow(x, y), build(x).pow(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testPowInt() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmd58w1bi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testPowInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmd58w1bi7(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61567);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61568);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61569)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61570)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61571);for (int n = 0; (((n < 5)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61572)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61573)==0&false)); ++n) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61574);checkRelative(FastMath.pow(x, n), build(x).pow(n));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testExp() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hdnn6a1bif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testExp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hdnn6a1bif(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61575);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61576);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61577)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61578)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61579);checkRelative(FastMath.exp(x), build(x).exp());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testExpm1() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ctcfq1bik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testExpm1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ctcfq1bik(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61580);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61581);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61582)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61583)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61584);checkRelative(FastMath.expm1(x), build(x).expm1());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLog() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5ksyv1bip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLog",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5ksyv1bip(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61585);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61586);for (double x = 0.01; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61587)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61588)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61589);checkRelative(FastMath.log(x), build(x).log());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLog1p() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lr7qs81biu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLog1p",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61590,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lr7qs81biu(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61590);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61591);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61592)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61593)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61594);checkRelative(FastMath.log1p(x), build(x).log1p());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

//  TODO: add this test in 4.0, as it is not possible to do it in 3.2
//  due to incompatibility of the return type in the Dfp class
//    @Test
//    public void testLog10() {
//        for (double x = -0.9; x < 0.9; x += 0.05) {
//            checkRelative(FastMath.log10(x), build(x).log10());
//        }
//    }

    @Test
    public void testAbs() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l56wuf1biz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testAbs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l56wuf1biz(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61595);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61596);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61597)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61598)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61599);checkRelative(FastMath.abs(x), build(x).abs());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testCeil() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omoba61bj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testCeil",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omoba61bj4(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61600);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61601);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61602)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61603)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61604);checkRelative(FastMath.ceil(x), build(x).ceil());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testFloor() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7rmw11bj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testFloor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7rmw11bj9(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61605);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61606);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61607)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61608)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61609);checkRelative(FastMath.floor(x), build(x).floor());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testRint() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1knmqwa1bje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testRint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61610,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1knmqwa1bje(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61610);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61611);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61612)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61613)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61614);checkRelative(FastMath.rint(x), build(x).rint());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testRound() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyajvh1bjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testRound",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyajvh1bjj(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61615);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61616);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61617)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61618)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61619);Assert.assertEquals(FastMath.round(x), build(x).round());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testSignum() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17nnk9e1bjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testSignum",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17nnk9e1bjo(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61620);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61621);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61622)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61623)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61624);checkRelative(FastMath.signum(x), build(x).signum());
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testCopySignField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xdhlp1bjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testCopySignField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xdhlp1bjt(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61625);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61626);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61627)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61628)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61629);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61630)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61631)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61632);checkRelative(FastMath.copySign(x, y), build(x).copySign(build(y)));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testCopySignDouble() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wd06p01bk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testCopySignDouble",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wd06p01bk1(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61633);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61634);for (double x = -3; (((x < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61635)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61636)==0&false)); x += 0.2) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61637);for (double y = -3; (((y < 3)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61638)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61639)==0&false)); y += 0.2) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61640);checkRelative(FastMath.copySign(x, y), build(x).copySign(y));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testScalb() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x12a9w1bk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testScalb",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x12a9w1bk9(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61641);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61642);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61643)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61644)==0&false)); x += 0.05) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61645);for (int n = -100; (((n < 100)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61646)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61647)==0&false)); ++n) {{
                __CLR4_4_11bci1bcilb90pbpt.R.inc(61648);checkRelative(FastMath.scalb(x, n), build(x).scalb(n));
            }
        }}
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationFaFa() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1czvtl71bkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationFaFa",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1czvtl71bkh(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61649);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61650);RandomGenerator r = new Well1024a(0xfafal);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61651);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61652)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61653)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61654);double[] aD = generateDouble(r, 10);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61655);double[] bD = generateDouble(r, 10);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61656);T[] aF      = toFieldArray(aD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61657);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61658);checkRelative(MathArrays.linearCombination(aD, bD),
                          aF[0].linearCombination(aF, bF));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationDaFa() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mp94091bkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationDaFa",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mp94091bkr(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61659);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61660);RandomGenerator r = new Well1024a(0xdafal);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61661);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61662)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61663)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61664);double[] aD = generateDouble(r, 10);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61665);double[] bD = generateDouble(r, 10);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61666);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61667);checkRelative(MathArrays.linearCombination(aD, bD),
                          bF[0].linearCombination(aD, bF));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationFF2() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aajgxr1bl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationFF2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aajgxr1bl0(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61668);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61669);RandomGenerator r = new Well1024a(0xff2l);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61670);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61671)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61672)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61673);double[] aD = generateDouble(r, 2);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61674);double[] bD = generateDouble(r, 2);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61675);T[] aF      = toFieldArray(aD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61676);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61677);checkRelative(MathArrays.linearCombination(aD[0], bD[0], aD[1], bD[1]),
                          aF[0].linearCombination(aF[0], bF[0], aF[1], bF[1]));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationDF2() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160u37l1bla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationDF2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61678,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160u37l1bla(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61678);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61679);RandomGenerator r = new Well1024a(0xdf2l);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61680);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61681)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61682)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61683);double[] aD = generateDouble(r, 2);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61684);double[] bD = generateDouble(r, 2);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61685);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61686);checkRelative(MathArrays.linearCombination(aD[0], bD[0], aD[1], bD[1]),
                          bF[0].linearCombination(aD[0], bF[0], aD[1], bF[1]));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationFF3() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_171ji5a1blj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationFF3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_171ji5a1blj(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61687);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61688);RandomGenerator r = new Well1024a(0xff3l);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61689);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61690)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61691)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61692);double[] aD = generateDouble(r, 3);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61693);double[] bD = generateDouble(r, 3);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61694);T[] aF      = toFieldArray(aD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61695);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61696);checkRelative(MathArrays.linearCombination(aD[0], bD[0], aD[1], bD[1], aD[2], bD[2]),
                          aF[0].linearCombination(aF[0], bF[0], aF[1], bF[1], aF[2], bF[2]));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationDF3() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ru4f41blt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationDF3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ru4f41blt(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61697);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61698);RandomGenerator r = new Well1024a(0xdf3l);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61699);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61700)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61701)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61702);double[] aD = generateDouble(r, 3);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61703);double[] bD = generateDouble(r, 3);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61704);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61705);checkRelative(MathArrays.linearCombination(aD[0], bD[0], aD[1], bD[1], aD[2], bD[2]),
                          bF[0].linearCombination(aD[0], bF[0], aD[1], bF[1], aD[2], bF[2]));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationFF4() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13sjjct1bm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationFF4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13sjjct1bm2(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61706);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61707);RandomGenerator r = new Well1024a(0xff4l);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61708);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61709)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61710)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61711);double[] aD = generateDouble(r, 4);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61712);double[] bD = generateDouble(r, 4);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61713);T[] aF      = toFieldArray(aD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61714);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61715);checkRelative(MathArrays.linearCombination(aD[0], bD[0], aD[1], bD[1], aD[2], bD[2], aD[3], bD[3]),
                          aF[0].linearCombination(aF[0], bF[0], aF[1], bF[1], aF[2], bF[2], aF[3], bF[3]));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testLinearCombinationDF4() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h5udd1bmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testLinearCombinationDF4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h5udd1bmc(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61716);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61717);RandomGenerator r = new Well1024a(0xdf4l);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61718);for (int i = 0; (((i < 50)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61719)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61720)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61721);double[] aD = generateDouble(r, 4);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61722);double[] bD = generateDouble(r, 4);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61723);T[] bF      = toFieldArray(bD);
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61724);checkRelative(MathArrays.linearCombination(aD[0], bD[0], aD[1], bD[1], aD[2], bD[2], aD[3], bD[3]),
                          bF[0].linearCombination(aD[0], bF[0], aD[1], bF[1], aD[2], bF[2], aD[3], bF[3]));
        }
    }}finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testGetField() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lx8n7n1bml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testGetField",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lx8n7n1bml(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61725);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61726);checkRelative(1.0, build(-10).getField().getOne());
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61727);checkRelative(0.0, build(-10).getField().getZero());
    }finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    private void checkRelative(double expected, T obtained) {try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61728);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61729);Assert.assertEquals(expected, obtained.getReal(), 1.0e-15 * (1 + FastMath.abs(expected)));
    }finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s4e6081bmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s4e6081bmq(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61730);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61731);T t1a = build(1.0);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61732);T t1b = build(1.0);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61733);T t2  = build(2.0);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61734);Assert.assertTrue(t1a.equals(t1a));
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61735);Assert.assertTrue(t1a.equals(t1b));
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61736);Assert.assertFalse(t1a.equals(t2));
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61737);Assert.assertFalse(t1a.equals(new Object()));
    }finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    @Test
    public void testHash() {__CLR4_4_11bci1bcilb90pbpt.R.globalSliceStart(getClass().getName(),61738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1djgsu11bmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11bci1bcilb90pbpt.R.rethrow($CLV_t2$);}finally{__CLR4_4_11bci1bcilb90pbpt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ExtendedFieldElementAbstractTest.testHash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),61738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1djgsu11bmy(){try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61738);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61739);T t1a = build(1.0);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61740);T t1b = build(1.0);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61741);T t2  = build(2.0);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61742);Assert.assertEquals(t1a.hashCode(), t1b.hashCode());
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61743);Assert.assertTrue(t1a.hashCode() != t2.hashCode());
    }finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    private double[] generateDouble (final RandomGenerator r, int n) {try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61744);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61745);double[] a = new double[n];
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61746);for (int i = 0; (((i < n)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61747)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61748)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61749);a[i] = r.nextDouble();
        }
        }__CLR4_4_11bci1bcilb90pbpt.R.inc(61750);return a;
    }finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

    private T[] toFieldArray (double[] a) {try{__CLR4_4_11bci1bcilb90pbpt.R.inc(61751);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61752);T[] f = MathArrays.buildArray(build(0).getField(), a.length);
        __CLR4_4_11bci1bcilb90pbpt.R.inc(61753);for (int i = 0; (((i < a.length)&&(__CLR4_4_11bci1bcilb90pbpt.R.iget(61754)!=0|true))||(__CLR4_4_11bci1bcilb90pbpt.R.iget(61755)==0&false)); ++i) {{
            __CLR4_4_11bci1bcilb90pbpt.R.inc(61756);f[i] = build(a[i]);
        }
        }__CLR4_4_11bci1bcilb90pbpt.R.inc(61757);return f;
    }finally{__CLR4_4_11bci1bcilb90pbpt.R.flushNeeded();}}

}
