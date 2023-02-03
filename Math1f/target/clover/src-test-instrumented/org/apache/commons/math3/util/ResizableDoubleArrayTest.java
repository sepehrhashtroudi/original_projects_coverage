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

import org.apache.commons.math3.distribution.IntegerDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * This class contains test cases for the ResizableDoubleArray.
 *
 * @version $Id$
 */
public class ResizableDoubleArrayTest extends DoubleArrayAbstractTest {static class __CLR4_4_12hcs2hcslb90pf7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,116159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @After
    public void tearDown() throws Exception {try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115804);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115805);da = null;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115806);ra = null;
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Before
    public void setUp() throws Exception {try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115807);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115808);da = new ResizableDoubleArray();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115809);ra = new ResizableDoubleArray();
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testConstructors() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe2hcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe2hcy(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115810);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115811);float defaultExpansionFactor = 2.0f;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115812);float defaultContractionCriteria = 2.5f;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115813);int defaultMode = ResizableDoubleArray.MULTIPLICATIVE_MODE;

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115814);ResizableDoubleArray testDa = new ResizableDoubleArray(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115815);Assert.assertEquals(0, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115816);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115817);Assert.assertEquals(defaultExpansionFactor, testDa.getExpansionFactor(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115818);Assert.assertEquals(defaultContractionCriteria, testDa.getContractionCriteria(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115819);Assert.assertEquals(defaultMode, testDa.getExpansionMode());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115820);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115821);da = new ResizableDoubleArray(-1);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115822);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115823);testDa = new ResizableDoubleArray((double[]) null);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115824);Assert.assertEquals(0, testDa.getNumElements());
        
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115825);double[] initialArray = new double[] { 0, 1, 2 };        
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115826);testDa = new ResizableDoubleArray(initialArray);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115827);Assert.assertEquals(3, testDa.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115828);testDa = new ResizableDoubleArray(2, 2.0f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115829);Assert.assertEquals(0, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115830);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115831);Assert.assertEquals(defaultExpansionFactor, testDa.getExpansionFactor(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115832);Assert.assertEquals(defaultContractionCriteria, testDa.getContractionCriteria(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115833);Assert.assertEquals(defaultMode, testDa.getExpansionMode());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115834);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115835);da = new ResizableDoubleArray(2, 0.5f);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115836);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115837);testDa = new ResizableDoubleArray(2, 3.0f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115838);Assert.assertEquals(3.0f, testDa.getExpansionFactor(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115839);Assert.assertEquals(3.5f, testDa.getContractionCriteria(), 0);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115840);testDa = new ResizableDoubleArray(2, 2.0f, 3.0f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115841);Assert.assertEquals(0, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115842);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115843);Assert.assertEquals(defaultExpansionFactor, testDa.getExpansionFactor(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115844);Assert.assertEquals(3.0f, testDa.getContractionCriteria(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115845);Assert.assertEquals(defaultMode, testDa.getExpansionMode());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115846);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115847);da = new ResizableDoubleArray(2, 2.0f, 1.5f);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115848);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115849);testDa = new ResizableDoubleArray(2, 2.0f, 3.0f,
                ResizableDoubleArray.ADDITIVE_MODE);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115850);Assert.assertEquals(0, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115851);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115852);Assert.assertEquals(defaultExpansionFactor, testDa.getExpansionFactor(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115853);Assert.assertEquals(3.0f, testDa.getContractionCriteria(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115854);Assert.assertEquals(ResizableDoubleArray.ADDITIVE_MODE,
                testDa.getExpansionMode());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115855);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115856);da = new ResizableDoubleArray(2, 2.0f, 2.5f, -1);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115857);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }

        // Copy constructor
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115858);testDa = new ResizableDoubleArray(2, 2.0f, 3.0f,
                ResizableDoubleArray.ADDITIVE_MODE);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115859);testDa.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115860);testDa.addElement(3.2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115861);ResizableDoubleArray copyDa = new ResizableDoubleArray(testDa);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115862);Assert.assertEquals(copyDa, testDa);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115863);Assert.assertEquals(testDa, copyDa);
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}


    @Test
    public void testSetElementArbitraryExpansion1() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v21ckh2heg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testSetElementArbitraryExpansion1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v21ckh2heg(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115864);

        // MULTIPLICATIVE_MODE
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115865);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115866);da.addElement(4.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115867);da.addElement(6.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115868);da.setElement(1, 3.0);

        // Expand the array arbitrarily to 1000 items
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115869);da.setElement(1000, 3.4);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115870);Assert.assertEquals( "The number of elements should now be 1001, it isn't",
                da.getNumElements(), 1001);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115871);Assert.assertEquals( "Uninitialized Elements are default value of 0.0, index 766 wasn't", 0.0,
                da.getElement( 760 ), Double.MIN_VALUE );

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115872);Assert.assertEquals( "The 1000th index should be 3.4, it isn't", 3.4, da.getElement(1000),
                Double.MIN_VALUE );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115873);Assert.assertEquals( "The 0th index should be 2.0, it isn't", 2.0, da.getElement(0),
                Double.MIN_VALUE);
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testSetElementArbitraryExpansion2() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rt1ds02heq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testSetElementArbitraryExpansion2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rt1ds02heq(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115874);
        // Make sure numElements and expansion work correctly for expansion boundary cases
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115875);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115876);da.addElement(4.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115877);da.addElement(6.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115878);Assert.assertEquals(16, ((ResizableDoubleArray) da).getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115879);Assert.assertEquals(3, da.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115880);da.setElement(3, 7.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115881);Assert.assertEquals(16, ((ResizableDoubleArray) da).getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115882);Assert.assertEquals(4, da.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115883);da.setElement(10, 10.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115884);Assert.assertEquals(16, ((ResizableDoubleArray) da).getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115885);Assert.assertEquals(11, da.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115886);da.setElement(9, 10.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115887);Assert.assertEquals(16, ((ResizableDoubleArray) da).getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115888);Assert.assertEquals(11, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115889);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115890);da.setElement(-2, 3);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115891);Assert.fail("Expecting ArrayIndexOutOfBoundsException for negative index");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // expected
        }

        // ADDITIVE_MODE

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115892);ResizableDoubleArray testDa = new ResizableDoubleArray(2, 2.0f, 3.0f,
                ResizableDoubleArray.ADDITIVE_MODE);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115893);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115894);testDa.addElement(1d);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115895);testDa.addElement(1d);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115896);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115897);testDa.addElement(1d);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115898);Assert.assertEquals(4, testDa.getCapacity());
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Override
    @Test
    public void testAdd1000() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d13w172hff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testAdd1000",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d13w172hff(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115899);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115900);super.testAdd1000();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115901);Assert.assertEquals("Internal Storage length should be 1024 if we started out with initial capacity of " +
                "16 and an expansion factor of 2.0",
                1024, ((ResizableDoubleArray) da).getCapacity());
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}
    
    @Test
    public void testAddElements() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yc150z2hfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testAddElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115902,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yc150z2hfi(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115902);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115903);ResizableDoubleArray testDa = new ResizableDoubleArray();
        
        // MULTIPLICATIVE_MODE
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115904);testDa.addElements(new double[] {4, 5, 6});
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115905);Assert.assertEquals(3, testDa.getNumElements(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115906);Assert.assertEquals(4, testDa.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115907);Assert.assertEquals(5, testDa.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115908);Assert.assertEquals(6, testDa.getElement(2), 0);
        
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115909);testDa.addElements(new double[] {4, 5, 6});
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115910);Assert.assertEquals(6, testDa.getNumElements());

        // ADDITIVE_MODE  (x's are occupied storage locations, 0's are open)
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115911);testDa = new ResizableDoubleArray(2, 2.0f, 2.5f,
                ResizableDoubleArray.ADDITIVE_MODE);        
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115912);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115913);testDa.addElements(new double[] { 1d }); // x,0
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115914);testDa.addElements(new double[] { 2d }); // x,x
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115915);testDa.addElements(new double[] { 3d }); // x,x,x,0 -- expanded
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115916);Assert.assertEquals(1d, testDa.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115917);Assert.assertEquals(2d, testDa.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115918);Assert.assertEquals(3d, testDa.getElement(2), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115919);Assert.assertEquals(4, testDa.getCapacity());  // x,x,x,0
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115920);Assert.assertEquals(3, testDa.getNumElements());
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Override
    @Test
    public void testAddElementRolling() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1wayp2hg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testAddElementRolling",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1wayp2hg1(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115921);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115922);super.testAddElementRolling();

        // MULTIPLICATIVE_MODE
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115923);da.clear();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115924);da.addElement(1);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115925);da.addElement(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115926);da.addElementRolling(3);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115927);Assert.assertEquals(3, da.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115928);da.addElementRolling(4);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115929);Assert.assertEquals(3, da.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115930);Assert.assertEquals(4, da.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115931);da.addElement(5);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115932);Assert.assertEquals(5, da.getElement(2), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115933);da.addElementRolling(6);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115934);Assert.assertEquals(4, da.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115935);Assert.assertEquals(5, da.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115936);Assert.assertEquals(6, da.getElement(2), 0);

        // ADDITIVE_MODE  (x's are occupied storage locations, 0's are open)
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115937);ResizableDoubleArray testDa = new ResizableDoubleArray(2, 2.0f, 2.5f,
                ResizableDoubleArray.ADDITIVE_MODE);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115938);Assert.assertEquals(2, testDa.getCapacity());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115939);testDa.addElement(1d); // x,0
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115940);testDa.addElement(2d); // x,x
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115941);testDa.addElement(3d); // x,x,x,0 -- expanded
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115942);Assert.assertEquals(1d, testDa.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115943);Assert.assertEquals(2d, testDa.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115944);Assert.assertEquals(3d, testDa.getElement(2), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115945);Assert.assertEquals(4, testDa.getCapacity());  // x,x,x,0
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115946);Assert.assertEquals(3, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115947);testDa.addElementRolling(4d);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115948);Assert.assertEquals(2d, testDa.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115949);Assert.assertEquals(3d, testDa.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115950);Assert.assertEquals(4d, testDa.getElement(2), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115951);Assert.assertEquals(4, testDa.getCapacity());  // 0,x,x,x
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115952);Assert.assertEquals(3, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115953);testDa.addElementRolling(5d);   // 0,0,x,x,x,0 -- time to contract
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115954);Assert.assertEquals(3d, testDa.getElement(0), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115955);Assert.assertEquals(4d, testDa.getElement(1), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115956);Assert.assertEquals(5d, testDa.getElement(2), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115957);Assert.assertEquals(4, testDa.getCapacity());  // contracted -- x,x,x,0
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115958);Assert.assertEquals(3, testDa.getNumElements());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115959);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115960);testDa.getElement(4);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115961);Assert.fail("Expecting ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // expected
        }
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115962);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115963);testDa.getElement(-1);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115964);Assert.fail("Expecting ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // expected
        }
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testSetNumberOfElements() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16xlcsu2hh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testSetNumberOfElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16xlcsu2hh9(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115965);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115966);da.addElement( 1.0 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115967);da.addElement( 1.0 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115968);da.addElement( 1.0 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115969);da.addElement( 1.0 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115970);da.addElement( 1.0 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115971);da.addElement( 1.0 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115972);Assert.assertEquals( "Number of elements should equal 6", da.getNumElements(), 6);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115973);((ResizableDoubleArray) da).setNumElements( 3 );
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115974);Assert.assertEquals( "Number of elements should equal 3", da.getNumElements(), 3);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115975);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115976);((ResizableDoubleArray) da).setNumElements( -3 );
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115977);Assert.fail( "Setting number of elements to negative should've thrown an exception");
        } catch( IllegalArgumentException iae ) {
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115978);((ResizableDoubleArray) da).setNumElements(1024);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115979);Assert.assertEquals( "Number of elements should now be 1024", da.getNumElements(), 1024);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115980);Assert.assertEquals( "Element 453 should be a default double", da.getElement( 453 ), 0.0, Double.MIN_VALUE);

    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testWithInitialCapacity() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12e77kd2hhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testWithInitialCapacity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12e77kd2hhp(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115981);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115982);ResizableDoubleArray eDA2 = new ResizableDoubleArray(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115983);Assert.assertEquals("Initial number of elements should be 0", 0, eDA2.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115984);final IntegerDistribution randomData = new UniformIntegerDistribution(100, 1000);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115985);final int iterations = randomData.sample();

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115986);for( int i = 0; (((i < iterations)&&(__CLR4_4_12hcs2hcslb90pf7d.R.iget(115987)!=0|true))||(__CLR4_4_12hcs2hcslb90pf7d.R.iget(115988)==0&false)); i++) {{
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(115989);eDA2.addElement( i );
        }

        }__CLR4_4_12hcs2hcslb90pf7d.R.inc(115990);Assert.assertEquals("Number of elements should be equal to " + iterations, iterations, eDA2.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115991);eDA2.addElement( 2.0 );

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115992);Assert.assertEquals("Number of elements should be equals to " + (iterations +1),
                iterations + 1 , eDA2.getNumElements() );
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testWithInitialCapacityAndExpansionFactor() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),115993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7015w2hi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testWithInitialCapacityAndExpansionFactor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),115993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7015w2hi1(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(115993);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115994);ResizableDoubleArray eDA3 = new ResizableDoubleArray(3, 3.0f, 3.5f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115995);Assert.assertEquals("Initial number of elements should be 0", 0, eDA3.getNumElements() );

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115996);final IntegerDistribution randomData = new UniformIntegerDistribution(100, 3000);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115997);final int iterations = randomData.sample();

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(115998);for( int i = 0; (((i < iterations)&&(__CLR4_4_12hcs2hcslb90pf7d.R.iget(115999)!=0|true))||(__CLR4_4_12hcs2hcslb90pf7d.R.iget(116000)==0&false)); i++) {{
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116001);eDA3.addElement( i );
        }

        }__CLR4_4_12hcs2hcslb90pf7d.R.inc(116002);Assert.assertEquals("Number of elements should be equal to " + iterations, iterations,eDA3.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116003);eDA3.addElement( 2.0 );

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116004);Assert.assertEquals("Number of elements should be equals to " + (iterations +1),
                iterations +1, eDA3.getNumElements() );

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116005);Assert.assertEquals("Expansion factor should equal 3.0", 3.0f, eDA3.getExpansionFactor(), Double.MIN_VALUE);
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testDiscard() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),116006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18he0s32hie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testDiscard",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116006,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18he0s32hie(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116006);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116007);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116008);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116009);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116010);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116011);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116012);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116013);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116014);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116015);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116016);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116017);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116018);Assert.assertEquals( "Number of elements should be 11", 11, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116019);((ResizableDoubleArray)da).discardFrontElements(5);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116020);Assert.assertEquals( "Number of elements should be 6", 6, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116021);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116022);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116023);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116024);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116025);Assert.assertEquals( "Number of elements should be 10", 10, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116026);((ResizableDoubleArray)da).discardMostRecentElements(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116027);Assert.assertEquals( "Number of elements should be 8", 8, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116028);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116029);((ResizableDoubleArray)da).discardFrontElements(-1);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116030);Assert.fail( "Trying to discard a negative number of element is not allowed");
        } catch( Exception e ){
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116031);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116032);((ResizableDoubleArray)da).discardMostRecentElements(-1);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116033);Assert.fail( "Trying to discard a negative number of element is not allowed");
        } catch( Exception e ){
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116034);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116035);((ResizableDoubleArray)da).discardFrontElements( 10000 );
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116036);Assert.fail( "You can't discard more elements than the array contains");
        } catch( Exception e ){
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116037);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116038);((ResizableDoubleArray)da).discardMostRecentElements( 10000 );
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116039);Assert.fail( "You can't discard more elements than the array contains");
        } catch( Exception e ){
        }

    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testSubstitute() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),116040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pb3o2b2hjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testSubstitute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pb3o2b2hjc(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116040);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116041);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116042);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116043);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116044);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116045);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116046);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116047);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116048);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116049);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116050);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116051);da.addElement(2.0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116052);Assert.assertEquals( "Number of elements should be 11", 11, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116053);((ResizableDoubleArray)da).substituteMostRecentElement(24);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116054);Assert.assertEquals( "Number of elements should be 11", 11, da.getNumElements());

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116055);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116056);((ResizableDoubleArray)da).discardMostRecentElements(10);
        } catch( Exception e ){
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116057);Assert.fail( "Trying to discard a negative number of element is not allowed");
        }

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116058);((ResizableDoubleArray)da).substituteMostRecentElement(24);

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116059);Assert.assertEquals( "Number of elements should be 1", 1, da.getNumElements());

    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testMutators() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),116060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhzphy2hjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testMutators",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhzphy2hjw(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116060);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116061);((ResizableDoubleArray)da).setContractionCriteria(10f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116062);Assert.assertEquals(10f, ((ResizableDoubleArray)da).getContractionCriteria(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116063);((ResizableDoubleArray)da).setExpansionFactor(8f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116064);Assert.assertEquals(8f, ((ResizableDoubleArray)da).getExpansionFactor(), 0);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116065);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116066);((ResizableDoubleArray)da).setExpansionFactor(11f);  // greater than contractionCriteria
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116067);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116068);((ResizableDoubleArray)da).setExpansionMode(
                ResizableDoubleArray.ADDITIVE_MODE);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116069);Assert.assertEquals(ResizableDoubleArray.ADDITIVE_MODE,
                ((ResizableDoubleArray)da).getExpansionMode());
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116070);try {
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116071);((ResizableDoubleArray)da).setExpansionMode(-1);
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116072);Assert.fail("Expecting IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testEqualsAndHashCode() throws Exception {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),116073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4n4w82hk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testEqualsAndHashCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4n4w82hk9() throws Exception{try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116073);

        // Wrong type
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116074);ResizableDoubleArray first = new ResizableDoubleArray();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116075);Double other = new Double(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116076);Assert.assertFalse(first.equals(other));

        // Null
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116077);other = null;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116078);Assert.assertFalse(first.equals(other));

        // Reflexive
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116079);Assert.assertTrue(first.equals(first));

        // Argumentless constructor
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116080);ResizableDoubleArray second = new ResizableDoubleArray();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116081);verifyEquality(first, second);

        // Equals iff same data, same properties
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116082);ResizableDoubleArray third = new ResizableDoubleArray(3, 2.0f, 2.0f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116083);verifyInequality(third, first);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116084);ResizableDoubleArray fourth = new ResizableDoubleArray(3, 2.0f, 2.0f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116085);ResizableDoubleArray fifth = new ResizableDoubleArray(2, 2.0f, 2.0f);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116086);verifyEquality(third, fourth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116087);verifyInequality(third, fifth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116088);third.addElement(4.1);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116089);third.addElement(4.2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116090);third.addElement(4.3);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116091);fourth.addElement(4.1);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116092);fourth.addElement(4.2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116093);fourth.addElement(4.3);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116094);verifyEquality(third, fourth);

        // expand
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116095);fourth.addElement(4.4);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116096);verifyInequality(third, fourth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116097);third.addElement(4.4);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116098);verifyEquality(third, fourth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116099);fourth.addElement(4.4);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116100);verifyInequality(third, fourth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116101);third.addElement(4.4);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116102);verifyEquality(third, fourth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116103);fourth.addElementRolling(4.5);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116104);third.addElementRolling(4.5);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116105);verifyEquality(third, fourth);

        // discard
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116106);third.discardFrontElements(1);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116107);verifyInequality(third, fourth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116108);fourth.discardFrontElements(1);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116109);verifyEquality(third, fourth);

        // discard recent
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116110);third.discardMostRecentElements(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116111);fourth.discardMostRecentElements(2);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116112);verifyEquality(third, fourth);

        // wrong order
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116113);third.addElement(18);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116114);fourth.addElement(17);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116115);third.addElement(17);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116116);fourth.addElement(18);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116117);verifyInequality(third, fourth);

        // copy
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116118);ResizableDoubleArray.copy(fourth, fifth);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116119);verifyEquality(fourth, fifth);

        // Copy constructor
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116120);verifyEquality(fourth, new ResizableDoubleArray(fourth));

        // Instance copy
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116121);verifyEquality(fourth, fourth.copy());

    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testGetArrayRef() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),116122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1npz3id2hlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testGetArrayRef",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1npz3id2hlm(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116122);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116123);final ResizableDoubleArray a = new ResizableDoubleArray();

        // Modify "a" through the public API.
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116124);final int index = 20;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116125);final double v1 = 1.2;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116126);a.setElement(index, v1);

        // Modify the internal storage through the protected API.
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116127);final double v2 = v1 + 3.4;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116128);final double[] aInternalArray = a.getArrayRef();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116129);aInternalArray[a.getStartIndex() + index] = v2;

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116130);Assert.assertEquals(v2, a.getElement(index), 0d);
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    @Test
    public void testCompute() {__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceStart(getClass().getName(),116131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pewang2hlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12hcs2hcslb90pf7d.R.rethrow($CLV_t2$);}finally{__CLR4_4_12hcs2hcslb90pf7d.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.ResizableDoubleArrayTest.testCompute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),116131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pewang2hlv(){try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116131);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116132);final ResizableDoubleArray a = new ResizableDoubleArray();
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116133);final int max = 20;
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116134);for (int i = 1; (((i <= max)&&(__CLR4_4_12hcs2hcslb90pf7d.R.iget(116135)!=0|true))||(__CLR4_4_12hcs2hcslb90pf7d.R.iget(116136)==0&false)); i++) {{
            __CLR4_4_12hcs2hcslb90pf7d.R.inc(116137);a.setElement(i, i);
        }

        }__CLR4_4_12hcs2hcslb90pf7d.R.inc(116138);final MathArrays.Function add = new MathArrays.Function() {
                public double evaluate(double[] a, int index, int num) {try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116139);
                    __CLR4_4_12hcs2hcslb90pf7d.R.inc(116140);double sum = 0;
                    __CLR4_4_12hcs2hcslb90pf7d.R.inc(116141);final int max = index + num;
                    __CLR4_4_12hcs2hcslb90pf7d.R.inc(116142);for (int i = index; (((i < max)&&(__CLR4_4_12hcs2hcslb90pf7d.R.iget(116143)!=0|true))||(__CLR4_4_12hcs2hcslb90pf7d.R.iget(116144)==0&false)); i++) {{
                        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116145);sum += a[i];
                    }
                    }__CLR4_4_12hcs2hcslb90pf7d.R.inc(116146);return sum;
                }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}
                public double evaluate(double[] a) {try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116147);
                    __CLR4_4_12hcs2hcslb90pf7d.R.inc(116148);return evaluate(a, 0, a.length);
                }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}
            };

        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116149);final double sum = a.compute(add);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116150);Assert.assertEquals(0.5 * max * (max + 1), sum, 0);
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    private void verifyEquality(ResizableDoubleArray a, ResizableDoubleArray b) {try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116151);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116152);Assert.assertTrue(b.equals(a));
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116153);Assert.assertTrue(a.equals(b));
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116154);Assert.assertEquals(a.hashCode(), b.hashCode());
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

    private void verifyInequality(ResizableDoubleArray a, ResizableDoubleArray b) {try{__CLR4_4_12hcs2hcslb90pf7d.R.inc(116155);
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116156);Assert.assertFalse(b.equals(a));
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116157);Assert.assertFalse(a.equals(b));
        __CLR4_4_12hcs2hcslb90pf7d.R.inc(116158);Assert.assertFalse(a.hashCode() == b.hashCode());
    }finally{__CLR4_4_12hcs2hcslb90pf7d.R.flushNeeded();}}

}
