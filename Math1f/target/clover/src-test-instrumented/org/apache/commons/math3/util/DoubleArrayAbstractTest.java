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

import org.apache.commons.math3.stat.StatUtils;
import org.junit.Assert;
import org.junit.Test;


/**
 * This class contains test cases for the ExpandableDoubleArray.
 *
 * @version $Id$
 */
public abstract class DoubleArrayAbstractTest {static class __CLR4_4_12ezi2ezilb90pey9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,112780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected DoubleArray da = null;

    // Array used to test rolling
    protected DoubleArray ra = null;

    @Test
    public void testAdd1000() {__CLR4_4_12ezi2ezilb90pey9.R.globalSliceStart(getClass().getName(),112734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d13w172ezi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ezi2ezilb90pey9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ezi2ezilb90pey9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DoubleArrayAbstractTest.testAdd1000",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d13w172ezi(){try{__CLR4_4_12ezi2ezilb90pey9.R.inc(112734);

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112735);for (int i = 0; (((i < 1000)&&(__CLR4_4_12ezi2ezilb90pey9.R.iget(112736)!=0|true))||(__CLR4_4_12ezi2ezilb90pey9.R.iget(112737)==0&false)); i++) {{
            __CLR4_4_12ezi2ezilb90pey9.R.inc(112738);da.addElement(i);
        }

        }__CLR4_4_12ezi2ezilb90pey9.R.inc(112739);Assert.assertEquals(
            "Number of elements should be equal to 1000 after adding 1000 values",
            1000,
            da.getNumElements());

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112740);Assert.assertEquals(
            "The element at the 56th index should be 56",
            56.0,
            da.getElement(56),
            Double.MIN_VALUE);

    }finally{__CLR4_4_12ezi2ezilb90pey9.R.flushNeeded();}}

    @Test
    public void testGetValues() {__CLR4_4_12ezi2ezilb90pey9.R.globalSliceStart(getClass().getName(),112741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gduel2ezp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ezi2ezilb90pey9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ezi2ezilb90pey9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DoubleArrayAbstractTest.testGetValues",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gduel2ezp(){try{__CLR4_4_12ezi2ezilb90pey9.R.inc(112741);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112742);double[] controlArray = { 2.0, 4.0, 6.0 };

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112743);da.addElement(2.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112744);da.addElement(4.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112745);da.addElement(6.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112746);double[] testArray = da.getElements();

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112747);for (int i = 0; (((i < da.getNumElements())&&(__CLR4_4_12ezi2ezilb90pey9.R.iget(112748)!=0|true))||(__CLR4_4_12ezi2ezilb90pey9.R.iget(112749)==0&false)); i++) {{
            __CLR4_4_12ezi2ezilb90pey9.R.inc(112750);Assert.assertEquals(
                "The testArray values should equal the controlArray values, index i: "
                    + i
                    + " does not match",
                testArray[i],
                controlArray[i],
                Double.MIN_VALUE);
        }

    }}finally{__CLR4_4_12ezi2ezilb90pey9.R.flushNeeded();}}

    @Test
    public void testAddElementRolling() {__CLR4_4_12ezi2ezilb90pey9.R.globalSliceStart(getClass().getName(),112751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1wayp2ezz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ezi2ezilb90pey9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ezi2ezilb90pey9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DoubleArrayAbstractTest.testAddElementRolling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1wayp2ezz(){try{__CLR4_4_12ezi2ezilb90pey9.R.inc(112751);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112752);ra.addElement(0.5);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112753);ra.addElement(1.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112754);ra.addElement(1.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112755);ra.addElement(1.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112756);ra.addElement(1.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112757);ra.addElement(1.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112758);ra.addElementRolling(2.0);

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112759);Assert.assertEquals(
            "There should be 6 elements in the eda",
            6,
            ra.getNumElements());
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112760);Assert.assertEquals(
            "The max element should be 2.0",
            2.0,
            StatUtils.max(ra.getElements()),
            Double.MIN_VALUE);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112761);Assert.assertEquals(
            "The min element should be 1.0",
            1.0,
            StatUtils.min(ra.getElements()),
            Double.MIN_VALUE);

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112762);for (int i = 0; (((i < 1024)&&(__CLR4_4_12ezi2ezilb90pey9.R.iget(112763)!=0|true))||(__CLR4_4_12ezi2ezilb90pey9.R.iget(112764)==0&false)); i++) {{
            __CLR4_4_12ezi2ezilb90pey9.R.inc(112765);ra.addElementRolling(i);
        }

        }__CLR4_4_12ezi2ezilb90pey9.R.inc(112766);Assert.assertEquals(
            "We just inserted 1024 rolling elements, num elements should still be 6",
            6,
            ra.getNumElements());
    }finally{__CLR4_4_12ezi2ezilb90pey9.R.flushNeeded();}}

    @Test
    public void testMinMax() {__CLR4_4_12ezi2ezilb90pey9.R.globalSliceStart(getClass().getName(),112767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s543112f0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ezi2ezilb90pey9.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ezi2ezilb90pey9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.DoubleArrayAbstractTest.testMinMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),112767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s543112f0f(){try{__CLR4_4_12ezi2ezilb90pey9.R.inc(112767);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112768);da.addElement(2.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112769);da.addElement(22.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112770);da.addElement(-2.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112771);da.addElement(21.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112772);da.addElement(22.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112773);da.addElement(42.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112774);da.addElement(62.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112775);da.addElement(22.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112776);da.addElement(122.0);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112777);da.addElement(1212.0);

        __CLR4_4_12ezi2ezilb90pey9.R.inc(112778);Assert.assertEquals("Min should be -2.0", -2.0, StatUtils.min(da.getElements()), Double.MIN_VALUE);
        __CLR4_4_12ezi2ezilb90pey9.R.inc(112779);Assert.assertEquals(
            "Max should be 1212.0",
            1212.0,
            StatUtils.max(da.getElements()),
            Double.MIN_VALUE);
    }finally{__CLR4_4_12ezi2ezilb90pey9.R.flushNeeded();}}

}
