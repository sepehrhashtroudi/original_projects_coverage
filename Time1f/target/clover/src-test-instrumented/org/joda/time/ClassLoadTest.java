/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import org.joda.time.base.AbstractDateTime;
import org.joda.time.base.AbstractInstant;

/**
 * This class displays what the ClassLoader is up to.
 * Run using JVM -verbose:class.
 *
 * @author Stephen Colebourne
 */
public class ClassLoadTest {static class __CLR4_4_1gmagmalc8azu12{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,21557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // run using JVM -verbose:class
    public static void main(String[] args) {try{__CLR4_4_1gmagmalc8azu12.R.inc(21538);
        __CLR4_4_1gmagmalc8azu12.R.inc(21539);System.out.println("-----------------------------------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21540);System.out.println("-----------AbstractInstant---------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21541);Class cls = AbstractInstant.class;
        __CLR4_4_1gmagmalc8azu12.R.inc(21542);System.out.println("-----------ReadableDateTime--------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21543);cls = ReadableDateTime.class;
        __CLR4_4_1gmagmalc8azu12.R.inc(21544);System.out.println("-----------AbstractDateTime--------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21545);cls = AbstractDateTime.class;
        __CLR4_4_1gmagmalc8azu12.R.inc(21546);System.out.println("-----------DateTime----------------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21547);cls = DateTime.class;
        __CLR4_4_1gmagmalc8azu12.R.inc(21548);System.out.println("-----------DateTimeZone------------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21549);cls = DateTimeZone.class;
        __CLR4_4_1gmagmalc8azu12.R.inc(21550);System.out.println("-----------new DateTime()----------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21551);DateTime dt = new DateTime();
        __CLR4_4_1gmagmalc8azu12.R.inc(21552);System.out.println("-----------new DateTime(ReadableInstant)-------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21553);dt = new DateTime(dt);
        __CLR4_4_1gmagmalc8azu12.R.inc(21554);System.out.println("-----------new DateTime(Long)------------------");
        __CLR4_4_1gmagmalc8azu12.R.inc(21555);dt = new DateTime(new Long(0));
        __CLR4_4_1gmagmalc8azu12.R.inc(21556);System.out.println("-----------------------------------------------");
    }finally{__CLR4_4_1gmagmalc8azu12.R.flushNeeded();}}
    
}
