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
package org.apache.commons.math3.stat.descriptive.moment;

import org.junit.Assert;
import org.junit.Test;


/**
 * @version $Id$
 */
public class InteractionTest {static class __CLR4_4_12b442b44lb90peo2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,107730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected double mean = 12.40454545454550;
    protected double var = 10.00235930735930;
    protected double skew = 1.437423729196190;
    protected double kurt = 2.377191264804700;

    protected double tolerance = 10E-12;

    protected double[] testArray =
        {
            12.5,
            12,
            11.8,
            14.2,
            14.9,
            14.5,
            21,
            8.2,
            10.3,
            11.3,
            14.1,
            9.9,
            12.2,
            12,
            12.1,
            11,
            19.8,
            11,
            10,
            8.8,
            9,
            12.3 };

    @Test
    public void testInteraction() {__CLR4_4_12b442b44lb90peo2.R.globalSliceStart(getClass().getName(),107716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nfg4ux2b44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12b442b44lb90peo2.R.rethrow($CLV_t2$);}finally{__CLR4_4_12b442b44lb90peo2.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.stat.descriptive.moment.InteractionTest.testInteraction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),107716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nfg4ux2b44(){try{__CLR4_4_12b442b44lb90peo2.R.inc(107716);

        __CLR4_4_12b442b44lb90peo2.R.inc(107717);FourthMoment m4 = new FourthMoment();
        __CLR4_4_12b442b44lb90peo2.R.inc(107718);Mean m = new Mean(m4);
        __CLR4_4_12b442b44lb90peo2.R.inc(107719);Variance v = new Variance(m4);
        __CLR4_4_12b442b44lb90peo2.R.inc(107720);Skewness s= new Skewness(m4);
        __CLR4_4_12b442b44lb90peo2.R.inc(107721);Kurtosis k = new Kurtosis(m4);

        __CLR4_4_12b442b44lb90peo2.R.inc(107722);for (int i = 0; (((i < testArray.length)&&(__CLR4_4_12b442b44lb90peo2.R.iget(107723)!=0|true))||(__CLR4_4_12b442b44lb90peo2.R.iget(107724)==0&false)); i++){{
            __CLR4_4_12b442b44lb90peo2.R.inc(107725);m4.increment(testArray[i]);
        }

        }__CLR4_4_12b442b44lb90peo2.R.inc(107726);Assert.assertEquals(mean,m.getResult(),tolerance);
        __CLR4_4_12b442b44lb90peo2.R.inc(107727);Assert.assertEquals(var,v.getResult(),tolerance);
        __CLR4_4_12b442b44lb90peo2.R.inc(107728);Assert.assertEquals(skew ,s.getResult(),tolerance);
        __CLR4_4_12b442b44lb90peo2.R.inc(107729);Assert.assertEquals(kurt,k.getResult(),tolerance);

    }finally{__CLR4_4_12b442b44lb90peo2.R.flushNeeded();}}

}
