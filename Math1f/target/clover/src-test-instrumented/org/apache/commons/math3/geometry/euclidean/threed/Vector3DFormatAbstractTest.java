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

package org.apache.commons.math3.geometry.euclidean.threed;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

import org.apache.commons.math3.exception.MathParseException;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormat;
import org.junit.Test;
import org.junit.Assert;

public abstract class Vector3DFormatAbstractTest {static class __CLR4_4_11q131q13lb90pcvn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,80538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Vector3DFormat vector3DFormat = null;
    Vector3DFormat vector3DFormatSquare = null;

    protected abstract Locale getLocale();

    protected abstract char getDecimalCharacter();

    protected Vector3DFormatAbstractTest() {try{__CLR4_4_11q131q13lb90pcvn.R.inc(80391);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80392);vector3DFormat = Vector3DFormat.getInstance(getLocale());
        __CLR4_4_11q131q13lb90pcvn.R.inc(80393);final NumberFormat nf = NumberFormat.getInstance(getLocale());
        __CLR4_4_11q131q13lb90pcvn.R.inc(80394);nf.setMaximumFractionDigits(2);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80395);vector3DFormatSquare = new Vector3DFormat("[", "]", " : ", nf);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testSimpleNoDecimals() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ff5zea1q18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ff5zea1q18(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80396);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80397);Vector3D c = new Vector3D(1, 1, 1);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80398);String expected = "{1; 1; 1}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80399);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80400);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimals() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ozljoz1q1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ozljoz1q1d(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80401);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80402);Vector3D c = new Vector3D(1.23, 1.43, 1.63);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80403);String expected =
            "{1"    + getDecimalCharacter() +
            "23; 1" + getDecimalCharacter() +
            "43; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80404);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80405);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testSimpleWithDecimalsTrunc() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j6olrb1q1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j6olrb1q1i(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80406);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80407);Vector3D c = new Vector3D(1.232323232323, 1.434343434343, 1.633333333333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80408);String expected =
            "{1"    + getDecimalCharacter() +
            "2323232323; 1" + getDecimalCharacter() +
            "4343434343; 1" + getDecimalCharacter() +
            "6333333333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80409);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80410);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testNegativeX() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14dlhmg1q1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testNegativeX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14dlhmg1q1n(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80411);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80412);Vector3D c = new Vector3D(-1.232323232323, 1.43, 1.63);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80413);String expected =
            "{-1"    + getDecimalCharacter() +
            "2323232323; 1" + getDecimalCharacter() +
            "43; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80414);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80415);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testNegativeY() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17mlgex1q1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testNegativeY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80416,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17mlgex1q1s(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80416);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80417);Vector3D c = new Vector3D(1.23, -1.434343434343, 1.63);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80418);String expected =
            "{1"    + getDecimalCharacter() +
            "23; -1" + getDecimalCharacter() +
            "4343434343; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80419);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80420);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testNegativeZ() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avlf7e1q1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testNegativeZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avlf7e1q1x(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80421);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80422);Vector3D c = new Vector3D(1.23, 1.43, -1.633333333333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80423);String expected =
            "{1"    + getDecimalCharacter() +
            "23; 1" + getDecimalCharacter() +
            "43; -1" + getDecimalCharacter() +
            "6333333333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80424);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80425);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testNonDefaultSetting() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2fwxb1q22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testNonDefaultSetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2fwxb1q22(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80426);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80427);Vector3D c = new Vector3D(1, 1, 1);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80428);String expected = "[1 : 1 : 1]";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80429);String actual = vector3DFormatSquare.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80430);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testDefaultFormatVector3D() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dcovy71q27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testDefaultFormatVector3D",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dcovy71q27(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80431);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80432);Locale defaultLocal = Locale.getDefault();
        __CLR4_4_11q131q13lb90pcvn.R.inc(80433);Locale.setDefault(getLocale());

        __CLR4_4_11q131q13lb90pcvn.R.inc(80434);Vector3D c = new Vector3D(232.22222222222, -342.3333333333, 432.44444444444);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80435);String expected =
            "{232"    + getDecimalCharacter() +
            "2222222222; -342" + getDecimalCharacter() +
            "3333333333; 432" + getDecimalCharacter() +
            "4444444444}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80436);String actual = (new Vector3DFormat()).format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80437);Assert.assertEquals(expected, actual);

        __CLR4_4_11q131q13lb90pcvn.R.inc(80438);Locale.setDefault(defaultLocal);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testNan() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1igd93k1q2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1igd93k1q2f(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80439);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80440);Vector3D c = Vector3D.NaN;
        __CLR4_4_11q131q13lb90pcvn.R.inc(80441);String expected = "{(NaN); (NaN); (NaN)}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80442);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80443);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testPositiveInfinity() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f6qvc61q2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testPositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f6qvc61q2k(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80444);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80445);Vector3D c = Vector3D.POSITIVE_INFINITY;
        __CLR4_4_11q131q13lb90pcvn.R.inc(80446);String expected = "{(Infinity); (Infinity); (Infinity)}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80447);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80448);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void tesNegativeInfinity() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s515y1q2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.tesNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s515y1q2p(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80449);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80450);Vector3D c = Vector3D.NEGATIVE_INFINITY;
        __CLR4_4_11q131q13lb90pcvn.R.inc(80451);String expected = "{(-Infinity); (-Infinity); (-Infinity)}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80452);String actual = vector3DFormat.format(c);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80453);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseSimpleNoDecimals() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y64rs31q2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseSimpleNoDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y64rs31q2u() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80454);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80455);String source = "{1; 1; 1}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80456);Vector3D expected = new Vector3D(1, 1, 1);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80457);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80458);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseIgnoredWhitespace() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbvjkb1q2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseIgnoredWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbvjkb1q2z(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80459);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80460);Vector3D expected = new Vector3D(1, 1, 1);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80461);ParsePosition pos1 = new ParsePosition(0);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80462);String source1 = "{1;1;1}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80463);Assert.assertEquals(expected, vector3DFormat.parse(source1, pos1));
        __CLR4_4_11q131q13lb90pcvn.R.inc(80464);Assert.assertEquals(source1.length(), pos1.getIndex());
        __CLR4_4_11q131q13lb90pcvn.R.inc(80465);ParsePosition pos2 = new ParsePosition(0);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80466);String source2 = " { 1 ; 1 ; 1 } ";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80467);Assert.assertEquals(expected, vector3DFormat.parse(source2, pos2));
        __CLR4_4_11q131q13lb90pcvn.R.inc(80468);Assert.assertEquals(source2.length() - 1, pos2.getIndex());
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimals() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m1k9321q39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseSimpleWithDecimals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m1k9321q39() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80469);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80470);String source =
            "{1" + getDecimalCharacter() +
            "23; 1" + getDecimalCharacter() +
            "43; 1" + getDecimalCharacter() +
            "63}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80471);Vector3D expected = new Vector3D(1.23, 1.43, 1.63);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80472);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80473);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseSimpleWithDecimalsTrunc() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1twhnjs1q3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseSimpleWithDecimalsTrunc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1twhnjs1q3e() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80474);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80475);String source =
            "{1" + getDecimalCharacter() +
            "2323; 1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80476);Vector3D expected = new Vector3D(1.2323, 1.4343, 1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80477);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80478);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNegativeX() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14kznb1q3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNegativeX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14kznb1q3j() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80479);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80480);String source =
            "{-1" + getDecimalCharacter() +
            "2323; 1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80481);Vector3D expected = new Vector3D(-1.2323, 1.4343, 1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80482);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80483);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNegativeY() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_134ez561q3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNegativeY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_134ez561q3o() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80484);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80485);String source =
            "{1" + getDecimalCharacter() +
            "2323; -1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80486);Vector3D expected = new Vector3D(1.2323, -1.4343, 1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80487);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80488);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNegativeZ() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16dexxn1q3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNegativeZ",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16dexxn1q3t() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80489);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80490);String source =
            "{1" + getDecimalCharacter() +
            "2323; 1" + getDecimalCharacter() +
            "4343; -1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80491);Vector3D expected = new Vector3D(1.2323, 1.4343, -1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80492);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80493);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNegativeAll() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1btdyxe1q3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNegativeAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1btdyxe1q3y() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80494);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80495);String source =
            "{-1" + getDecimalCharacter() +
            "2323; -1" + getDecimalCharacter() +
            "4343; -1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80496);Vector3D expected = new Vector3D(-1.2323, -1.4343, -1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80497);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80498);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseZeroX() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12twvje1q43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseZeroX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12twvje1q43() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80499);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80500);String source =
            "{0" + getDecimalCharacter() +
            "0; -1" + getDecimalCharacter() +
            "4343; 1" + getDecimalCharacter() +
            "6333}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80501);Vector3D expected = new Vector3D(0.0, -1.4343, 1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80502);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80503);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNonDefaultSetting() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r1hx0e1q48();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNonDefaultSetting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r1hx0e1q48() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80504);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80505);String source =
            "[1" + getDecimalCharacter() +
            "2323 : 1" + getDecimalCharacter() +
            "4343 : 1" + getDecimalCharacter() +
            "6333]";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80506);Vector3D expected = new Vector3D(1.2323, 1.4343, 1.6333);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80507);Vector3D actual = vector3DFormatSquare.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80508);Assert.assertEquals(expected, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNan() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1op47a71q4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1op47a71q4d() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80509);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80510);String source = "{(NaN); (NaN); (NaN)}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80511);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80512);Assert.assertEquals(Vector3D.NaN, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParsePositiveInfinity() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xxpnpz1q4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParsePositiveInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xxpnpz1q4h() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80513);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80514);String source = "{(Infinity); (Infinity); (Infinity)}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80515);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80516);Assert.assertEquals(Vector3D.POSITIVE_INFINITY, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testParseNegativeInfinity() throws MathParseException {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15q3hid1q4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testParseNegativeInfinity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80517,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15q3hid1q4l() throws MathParseException{try{__CLR4_4_11q131q13lb90pcvn.R.inc(80517);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80518);String source = "{(-Infinity); (-Infinity); (-Infinity)}";
        __CLR4_4_11q131q13lb90pcvn.R.inc(80519);Vector3D actual = vector3DFormat.parse(source);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80520);Assert.assertEquals(Vector3D.NEGATIVE_INFINITY, actual);
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testConstructorSingleFormat() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oybje61q4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testConstructorSingleFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oybje61q4p(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80521);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80522);NumberFormat nf = NumberFormat.getInstance();
        __CLR4_4_11q131q13lb90pcvn.R.inc(80523);Vector3DFormat cf = new Vector3DFormat(nf);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80524);Assert.assertNotNull(cf);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80525);Assert.assertEquals(nf, cf.getFormat());
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testForgottenPrefix() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cgstjz1q4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testForgottenPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cgstjz1q4u(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80526);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80527);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80528);Assert.assertNull(new Vector3DFormat().parse("1; 1; 1}", pos));
        __CLR4_4_11q131q13lb90pcvn.R.inc(80529);Assert.assertEquals(0, pos.getErrorIndex());
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testForgottenSeparator() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qfhsxw1q4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testForgottenSeparator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qfhsxw1q4y(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80530);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80531);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80532);Assert.assertNull(new Vector3DFormat().parse("{1; 1 1}", pos));
        __CLR4_4_11q131q13lb90pcvn.R.inc(80533);Assert.assertEquals(6, pos.getErrorIndex());
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

    @Test
    public void testForgottenSuffix() {__CLR4_4_11q131q13lb90pcvn.R.globalSliceStart(getClass().getName(),80534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpbayo1q52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11q131q13lb90pcvn.R.rethrow($CLV_t2$);}finally{__CLR4_4_11q131q13lb90pcvn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.Vector3DFormatAbstractTest.testForgottenSuffix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpbayo1q52(){try{__CLR4_4_11q131q13lb90pcvn.R.inc(80534);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80535);ParsePosition pos = new ParsePosition(0);
        __CLR4_4_11q131q13lb90pcvn.R.inc(80536);Assert.assertNull(new Vector3DFormat().parse("{1; 1; 1 ", pos));
        __CLR4_4_11q131q13lb90pcvn.R.inc(80537);Assert.assertEquals(8, pos.getErrorIndex());
    }finally{__CLR4_4_11q131q13lb90pcvn.R.flushNeeded();}}

}
