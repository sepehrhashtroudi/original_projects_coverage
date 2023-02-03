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
package org.apache.commons.math3.geometry.euclidean.twod;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

import java.awt.geom.AffineTransform;

public class LineTest {static class __CLR4_4_11qbb1qbblb90pcwa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,80820,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testContains() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y9zhfs1qbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y9zhfs1qbb(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80759);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80760);Line l = new Line(new Vector2D(0, 1), new Vector2D(1, 2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80761);Assert.assertTrue(l.contains(new Vector2D(0, 1)));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80762);Assert.assertTrue(l.contains(new Vector2D(1, 2)));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80763);Assert.assertTrue(l.contains(new Vector2D(7, 8)));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80764);Assert.assertTrue(! l.contains(new Vector2D(8, 7)));
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testAbscissa() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1plzdqa1qbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testAbscissa",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1plzdqa1qbh(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80765);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80766);Line l = new Line(new Vector2D(2, 1), new Vector2D(-2, -2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80767);Assert.assertEquals(0.0,
                            (l.toSubSpace(new Vector2D(-3,  4))).getX(),
                            1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80768);Assert.assertEquals(0.0,
                            (l.toSubSpace(new Vector2D( 3, -4))).getX(),
                            1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80769);Assert.assertEquals(-5.0,
                            (l.toSubSpace(new Vector2D( 7, -1))).getX(),
                            1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80770);Assert.assertEquals( 5.0,
                             (l.toSubSpace(new Vector2D(-1, -7))).getX(),
                             1.0e-10);
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testOffset() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owkm0c1qbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owkm0c1qbn(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80771);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80772);Line l = new Line(new Vector2D(2, 1), new Vector2D(-2, -2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80773);Assert.assertEquals(-5.0, l.getOffset(new Vector2D(5, -3)), 1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80774);Assert.assertEquals(+5.0, l.getOffset(new Vector2D(-5, 2)), 1.0e-10);
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testDistance() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o82ia61qbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testDistance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o82ia61qbr(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80775);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80776);Line l = new Line(new Vector2D(2, 1), new Vector2D(-2, -2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80777);Assert.assertEquals(+5.0, l.distance(new Vector2D(5, -3)), 1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80778);Assert.assertEquals(+5.0, l.distance(new Vector2D(-5, 2)), 1.0e-10);
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testPointAt() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4smaw1qbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testPointAt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4smaw1qbv(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80779);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80780);Line l = new Line(new Vector2D(2, 1), new Vector2D(-2, -2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80781);for (double a = -2.0; (((a < 2.0)&&(__CLR4_4_11qbb1qbblb90pcwa.R.iget(80782)!=0|true))||(__CLR4_4_11qbb1qbblb90pcwa.R.iget(80783)==0&false)); a += 0.2) {{
            __CLR4_4_11qbb1qbblb90pcwa.R.inc(80784);Vector1D pA = new Vector1D(a);
            __CLR4_4_11qbb1qbblb90pcwa.R.inc(80785);Vector2D point = l.toSpace(pA);
            __CLR4_4_11qbb1qbblb90pcwa.R.inc(80786);Assert.assertEquals(a, (l.toSubSpace(point)).getX(), 1.0e-10);
            __CLR4_4_11qbb1qbblb90pcwa.R.inc(80787);Assert.assertEquals(0.0, l.getOffset(point),   1.0e-10);
            __CLR4_4_11qbb1qbblb90pcwa.R.inc(80788);for (double o = -2.0; (((o < 2.0)&&(__CLR4_4_11qbb1qbblb90pcwa.R.iget(80789)!=0|true))||(__CLR4_4_11qbb1qbblb90pcwa.R.iget(80790)==0&false)); o += 0.2) {{
                __CLR4_4_11qbb1qbblb90pcwa.R.inc(80791);point = l.getPointAt(pA, o);
                __CLR4_4_11qbb1qbblb90pcwa.R.inc(80792);Assert.assertEquals(a, (l.toSubSpace(point)).getX(), 1.0e-10);
                __CLR4_4_11qbb1qbblb90pcwa.R.inc(80793);Assert.assertEquals(o, l.getOffset(point),   1.0e-10);
            }
        }}
    }}finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testOriginOffset() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vq65f61qca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testOriginOffset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80794,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vq65f61qca(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80794);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80795);Line l1 = new Line(new Vector2D(0, 1), new Vector2D(1, 2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80796);Assert.assertEquals(FastMath.sqrt(0.5), l1.getOriginOffset(), 1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80797);Line l2 = new Line(new Vector2D(1, 2), new Vector2D(0, 1));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80798);Assert.assertEquals(-FastMath.sqrt(0.5), l2.getOriginOffset(), 1.0e-10);
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testParallel() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lvafq81qcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testParallel",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lvafq81qcf(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80799);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80800);Line l1 = new Line(new Vector2D(0, 1), new Vector2D(1, 2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80801);Line l2 = new Line(new Vector2D(2, 2), new Vector2D(3, 3));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80802);Assert.assertTrue(l1.isParallelTo(l2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80803);Line l3 = new Line(new Vector2D(1, 0), new Vector2D(0.5, -0.5));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80804);Assert.assertTrue(l1.isParallelTo(l3));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80805);Line l4 = new Line(new Vector2D(1, 0), new Vector2D(0.5, -0.51));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80806);Assert.assertTrue(! l1.isParallelTo(l4));
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testTransform() throws MathIllegalArgumentException {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q98ef51qcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testTransform",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q98ef51qcn() throws MathIllegalArgumentException{try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80807);

        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80808);Line l1 = new Line(new Vector2D(1.0 ,1.0), new Vector2D(4.0 ,1.0));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80809);Transform<Euclidean2D, Euclidean1D> t1 =
            Line.getTransform(new AffineTransform(0.0, 0.5, -1.0, 0.0, 1.0, 1.5));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80810);Assert.assertEquals(0.5 * FastMath.PI,
                            ((Line) t1.apply(l1)).getAngle(),
                            1.0e-10);

        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80811);Line l2 = new Line(new Vector2D(0.0, 0.0), new Vector2D(1.0, 1.0));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80812);Transform<Euclidean2D, Euclidean1D> t2 =
            Line.getTransform(new AffineTransform(0.0, 0.5, -1.0, 0.0, 1.0, 1.5));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80813);Assert.assertEquals(FastMath.atan2(1.0, -2.0),
                            ((Line) t2.apply(l2)).getAngle(),
                            1.0e-10);

    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

    @Test
    public void testIntersection() {__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceStart(getClass().getName(),80814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g463i1qcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11qbb1qbblb90pcwa.R.rethrow($CLV_t2$);}finally{__CLR4_4_11qbb1qbblb90pcwa.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.twod.LineTest.testIntersection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g463i1qcu(){try{__CLR4_4_11qbb1qbblb90pcwa.R.inc(80814);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80815);Line    l1 = new Line(new Vector2D( 0, 1), new Vector2D(1, 2));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80816);Line    l2 = new Line(new Vector2D(-1, 2), new Vector2D(2, 1));
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80817);Vector2D p  = l1.intersection(l2);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80818);Assert.assertEquals(0.5, p.getX(), 1.0e-10);
        __CLR4_4_11qbb1qbblb90pcwa.R.inc(80819);Assert.assertEquals(1.5, p.getY(), 1.0e-10);
    }finally{__CLR4_4_11qbb1qbblb90pcwa.R.flushNeeded();}}

}
