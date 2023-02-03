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

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.junit.Assert;
import org.junit.Test;


public class FieldRotationDSTest {static class __CLR4_4_11ob51ob5lb90pcqk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,78704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIdentity() {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ab1a2x1ob5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testIdentity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ab1a2x1ob5(){try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78161);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78162);FieldRotation<DerivativeStructure> r = createRotation(1, 0, 0, 0, false);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78163);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(1, 0, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78164);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 1, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78165);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78166);checkAngle(r.getAngle(), 0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78167);r = createRotation(-1, 0, 0, 0, false);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78168);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(1, 0, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78169);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 1, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78170);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78171);checkAngle(r.getAngle(), 0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78172);r = createRotation(42, 0, 0, 0, true);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78173);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(1, 0, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78174);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 1, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78175);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78176);checkAngle(r.getAngle(), 0);

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testAxisAngle() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjsc5j1obl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testAxisAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjsc5j1obl() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78177);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78178);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(createAxis(10, 10, 10), createAngle(2 * FastMath.PI / 3));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78179);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(0, 1, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78180);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78181);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(1, 0, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78182);double s = 1 / FastMath.sqrt(3);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78183);checkVector(r.getAxis(), createVector(s, s, s));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78184);checkAngle(r.getAngle(), 2 * FastMath.PI / 3);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78185);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78186);new FieldRotation<DerivativeStructure>(createAxis(0, 0, 0), createAngle(2 * FastMath.PI / 3));
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78187);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
        }

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78188);r = new FieldRotation<DerivativeStructure>(createAxis(0, 0, 1), createAngle(1.5 * FastMath.PI));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78189);checkVector(r.getAxis(), createVector(0, 0, -1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78190);checkAngle(r.getAngle(), 0.5 * FastMath.PI);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78191);r = new FieldRotation<DerivativeStructure>(createAxis(0, 1, 0), createAngle(FastMath.PI));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78192);checkVector(r.getAxis(), createVector(0, 1, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78193);checkAngle(r.getAngle(), FastMath.PI);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78194);checkVector(createRotation(1, 0, 0, 0, false).getAxis(), createVector(1, 0, 0));

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testRevert() {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f9xul1oc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testRevert",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f9xul1oc3(){try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78195);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78196);double a = 0.001;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78197);double b = 0.36;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78198);double c = 0.48;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78199);double d = 0.8;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78200);FieldRotation<DerivativeStructure> r = createRotation(a, b, c, d, true);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78201);double a2 = a * a;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78202);double b2 = b * b;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78203);double c2 = c * c;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78204);double d2 = d * d;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78205);double den = (a2 + b2 + c2 + d2) * FastMath.sqrt(a2 + b2 + c2 + d2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78206);Assert.assertEquals((b2 + c2 + d2) / den, r.getQ0().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78207);Assert.assertEquals(-a * b / den, r.getQ0().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78208);Assert.assertEquals(-a * c / den, r.getQ0().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78209);Assert.assertEquals(-a * d / den, r.getQ0().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78210);Assert.assertEquals(-b * a / den, r.getQ1().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78211);Assert.assertEquals((a2 + c2 + d2) / den, r.getQ1().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78212);Assert.assertEquals(-b * c / den, r.getQ1().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78213);Assert.assertEquals(-b * d / den, r.getQ1().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78214);Assert.assertEquals(-c * a / den, r.getQ2().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78215);Assert.assertEquals(-c * b / den, r.getQ2().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78216);Assert.assertEquals((a2 + b2 + d2) / den, r.getQ2().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78217);Assert.assertEquals(-c * d / den, r.getQ2().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78218);Assert.assertEquals(-d * a / den, r.getQ3().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78219);Assert.assertEquals(-d * b / den, r.getQ3().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78220);Assert.assertEquals(-d * c / den, r.getQ3().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78221);Assert.assertEquals((a2 + b2 + c2) / den, r.getQ3().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78222);FieldRotation<DerivativeStructure> reverted = r.revert();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78223);FieldRotation<DerivativeStructure> rrT = r.applyTo(reverted);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78224);checkRotationDS(rrT, 1, 0, 0, 0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78225);Assert.assertEquals(0, rrT.getQ0().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78226);Assert.assertEquals(0, rrT.getQ0().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78227);Assert.assertEquals(0, rrT.getQ0().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78228);Assert.assertEquals(0, rrT.getQ0().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78229);Assert.assertEquals(0, rrT.getQ1().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78230);Assert.assertEquals(0, rrT.getQ1().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78231);Assert.assertEquals(0, rrT.getQ1().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78232);Assert.assertEquals(0, rrT.getQ1().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78233);Assert.assertEquals(0, rrT.getQ2().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78234);Assert.assertEquals(0, rrT.getQ2().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78235);Assert.assertEquals(0, rrT.getQ2().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78236);Assert.assertEquals(0, rrT.getQ2().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78237);Assert.assertEquals(0, rrT.getQ3().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78238);Assert.assertEquals(0, rrT.getQ3().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78239);Assert.assertEquals(0, rrT.getQ3().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78240);Assert.assertEquals(0, rrT.getQ3().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78241);FieldRotation<DerivativeStructure> rTr = reverted.applyTo(r);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78242);checkRotationDS(rTr, 1, 0, 0, 0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78243);Assert.assertEquals(0, rTr.getQ0().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78244);Assert.assertEquals(0, rTr.getQ0().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78245);Assert.assertEquals(0, rTr.getQ0().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78246);Assert.assertEquals(0, rTr.getQ0().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78247);Assert.assertEquals(0, rTr.getQ1().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78248);Assert.assertEquals(0, rTr.getQ1().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78249);Assert.assertEquals(0, rTr.getQ1().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78250);Assert.assertEquals(0, rTr.getQ1().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78251);Assert.assertEquals(0, rTr.getQ2().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78252);Assert.assertEquals(0, rTr.getQ2().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78253);Assert.assertEquals(0, rTr.getQ2().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78254);Assert.assertEquals(0, rTr.getQ2().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78255);Assert.assertEquals(0, rTr.getQ3().getPartialDerivative(1, 0, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78256);Assert.assertEquals(0, rTr.getQ3().getPartialDerivative(0, 1, 0, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78257);Assert.assertEquals(0, rTr.getQ3().getPartialDerivative(0, 0, 1, 0), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78258);Assert.assertEquals(0, rTr.getQ3().getPartialDerivative(0, 0, 0, 1), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78259);Assert.assertEquals(r.getAngle().getReal(), reverted.getAngle().getReal(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78260);Assert.assertEquals(-1, FieldVector3D.dotProduct(r.getAxis(), reverted.getAxis()).getReal(), 1.0e-15);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testVectorOnePair() throws MathArithmeticException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc3tv21odx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testVectorOnePair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc3tv21odx() throws MathArithmeticException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78261);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78262);FieldVector3D<DerivativeStructure> u = createVector(3, 2, 1);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78263);FieldVector3D<DerivativeStructure> v = createVector(-4, 2, 2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78264);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(u, v);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78265);checkVector(r.applyTo(u.scalarMultiply(v.getNorm())), v.scalarMultiply(u.getNorm()));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78266);checkAngle(new FieldRotation<DerivativeStructure>(u, u.negate()).getAngle(), FastMath.PI);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78267);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78268);new FieldRotation<DerivativeStructure>(u, createVector(0, 0, 0));
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78269);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException e) {
            // expected behavior
        }

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testVectorTwoPairs() throws MathArithmeticException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14a8o6v1oe6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testVectorTwoPairs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14a8o6v1oe6() throws MathArithmeticException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78270);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78271);FieldVector3D<DerivativeStructure> u1 = createVector(3, 0, 0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78272);FieldVector3D<DerivativeStructure> u2 = createVector(0, 5, 0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78273);FieldVector3D<DerivativeStructure> v1 = createVector(0, 0, 2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78274);FieldVector3D<DerivativeStructure> v2 = createVector(-2, 0, 2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78275);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(u1, u2, v1, v2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78276);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78277);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(-1, 0, 0));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78278);r = new FieldRotation<DerivativeStructure>(u1, u2, u1.negate(), u2.negate());
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78279);FieldVector3D<DerivativeStructure> axis = r.getAxis();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78280);if ((((FieldVector3D.dotProduct(axis, createVector(0, 0, 1)).getReal() > 0)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78281)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78282)==0&false))) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78283);checkVector(axis, createVector(0, 0, 1));
        } }else {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78284);checkVector(axis, createVector(0, 0, -1));
        }
        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78285);checkAngle(r.getAngle(), FastMath.PI);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78286);double sqrt = FastMath.sqrt(2) / 2;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78287);r = new FieldRotation<DerivativeStructure>(createVector(1, 0, 0),  createVector(0, 1, 0),
                           createVector(0.5, 0.5,  sqrt),
                           createVector(0.5, 0.5, -sqrt));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78288);checkRotationDS(r, sqrt, 0.5, 0.5, 0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78289);r = new FieldRotation<DerivativeStructure>(u1, u2, u1, FieldVector3D.crossProduct(u1, u2));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78290);checkRotationDS(r, sqrt, -sqrt, 0, 0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78291);checkRotationDS(new FieldRotation<DerivativeStructure>(u1, u2, u1, u2), 1, 0, 0, 0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78292);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78293);new FieldRotation<DerivativeStructure>(u1, u2, createVector(0, 0, 0), v2);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78294);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException e) {
            // expected behavior
        }

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testMatrix()
            throws NotARotationMatrixException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt8ee21oev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt8ee21oev() throws NotARotationMatrixException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78295);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78296);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78297);createRotation(new double[][] {
                { 0.0, 1.0, 0.0 },
                { 1.0, 0.0, 0.0 }
            }, 1.0e-7);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78298);Assert.fail("Expecting NotARotationMatrixException");
        } catch (NotARotationMatrixException nrme) {
            // expected behavior
        }

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78299);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78300);createRotation(new double[][] {
                {  0.445888,  0.797184, -0.407040 },
                {  0.821760, -0.184320,  0.539200 },
                { -0.354816,  0.574912,  0.737280 }
            }, 1.0e-7);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78301);Assert.fail("Expecting NotARotationMatrixException");
        } catch (NotARotationMatrixException nrme) {
            // expected behavior
        }

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78302);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78303);createRotation(new double[][] {
                {  0.4,  0.8, -0.4 },
                { -0.4,  0.6,  0.7 },
                {  0.8, -0.2,  0.5 }
            }, 1.0e-15);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78304);Assert.fail("Expecting NotARotationMatrixException");
        } catch (NotARotationMatrixException nrme) {
            // expected behavior
        }

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78305);checkRotationDS(createRotation(new double[][] {
            {  0.445888,  0.797184, -0.407040 },
            { -0.354816,  0.574912,  0.737280 },
            {  0.821760, -0.184320,  0.539200 }
        }, 1.0e-10),
        0.8, 0.288, 0.384, 0.36);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78306);checkRotationDS(createRotation(new double[][] {
            {  0.539200,  0.737280,  0.407040 },
            {  0.184320, -0.574912,  0.797184 },
            {  0.821760, -0.354816, -0.445888 }
        }, 1.0e-10),
        0.36, 0.8, 0.288, 0.384);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78307);checkRotationDS(createRotation(new double[][] {
            { -0.445888,  0.797184, -0.407040 },
            {  0.354816,  0.574912,  0.737280 },
            {  0.821760,  0.184320, -0.539200 }
        }, 1.0e-10),
        0.384, 0.36, 0.8, 0.288);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78308);checkRotationDS(createRotation(new double[][] {
            { -0.539200,  0.737280,  0.407040 },
            { -0.184320, -0.574912,  0.797184 },
            {  0.821760,  0.354816,  0.445888 }
        }, 1.0e-10),
        0.288, 0.384, 0.36, 0.8);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78309);double[][] m1 = { { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 },
            { 1.0, 0.0, 0.0 } };
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78310);FieldRotation<DerivativeStructure> r = createRotation(m1, 1.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78311);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78312);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(1, 0, 0));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78313);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 1, 0));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78314);double[][] m2 = { { 0.83203, -0.55012, -0.07139 },
            { 0.48293,  0.78164, -0.39474 },
            { 0.27296,  0.29396,  0.91602 } };
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78315);r = createRotation(m2, 1.0e-12);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78316);DerivativeStructure[][] m3 = r.getMatrix();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78317);double d00 = m2[0][0] - m3[0][0].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78318);double d01 = m2[0][1] - m3[0][1].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78319);double d02 = m2[0][2] - m3[0][2].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78320);double d10 = m2[1][0] - m3[1][0].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78321);double d11 = m2[1][1] - m3[1][1].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78322);double d12 = m2[1][2] - m3[1][2].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78323);double d20 = m2[2][0] - m3[2][0].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78324);double d21 = m2[2][1] - m3[2][1].getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78325);double d22 = m2[2][2] - m3[2][2].getReal();

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78326);Assert.assertTrue(FastMath.abs(d00) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78327);Assert.assertTrue(FastMath.abs(d01) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78328);Assert.assertTrue(FastMath.abs(d02) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78329);Assert.assertTrue(FastMath.abs(d10) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78330);Assert.assertTrue(FastMath.abs(d11) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78331);Assert.assertTrue(FastMath.abs(d12) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78332);Assert.assertTrue(FastMath.abs(d20) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78333);Assert.assertTrue(FastMath.abs(d21) < 6.0e-6);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78334);Assert.assertTrue(FastMath.abs(d22) < 6.0e-6);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78335);Assert.assertTrue(FastMath.abs(d00) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78336);Assert.assertTrue(FastMath.abs(d01) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78337);Assert.assertTrue(FastMath.abs(d02) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78338);Assert.assertTrue(FastMath.abs(d10) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78339);Assert.assertTrue(FastMath.abs(d11) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78340);Assert.assertTrue(FastMath.abs(d12) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78341);Assert.assertTrue(FastMath.abs(d20) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78342);Assert.assertTrue(FastMath.abs(d21) > 4.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78343);Assert.assertTrue(FastMath.abs(d22) > 4.0e-7);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78344);for (int i = 0; (((i < 3)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78345)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78346)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78347);for (int j = 0; (((j < 3)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78348)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78349)==0&false)); ++j) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78350);double m3tm3 = m3[i][0].getReal() * m3[j][0].getReal() +
                               m3[i][1].getReal() * m3[j][1].getReal() +
                               m3[i][2].getReal() * m3[j][2].getReal();
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78351);if ((((i == j)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78352)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78353)==0&false))) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78354);Assert.assertTrue(FastMath.abs(m3tm3 - 1.0) < 1.0e-10);
                } }else {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78355);Assert.assertTrue(FastMath.abs(m3tm3) < 1.0e-10);
                }
            }}
        }}

        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78356);checkVector(r.applyTo(createVector(1, 0, 0)),
                    new FieldVector3D<DerivativeStructure>(m3[0][0], m3[1][0], m3[2][0]));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78357);checkVector(r.applyTo(createVector(0, 1, 0)),
                    new FieldVector3D<DerivativeStructure>(m3[0][1], m3[1][1], m3[2][1]));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78358);checkVector(r.applyTo(createVector(0, 0, 1)),
                    new FieldVector3D<DerivativeStructure>(m3[0][2], m3[1][2], m3[2][2]));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78359);double[][] m4 = { { 1.0,  0.0,  0.0 },
            { 0.0, -1.0,  0.0 },
            { 0.0,  0.0, -1.0 } };
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78360);r = createRotation(m4, 1.0e-7);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78361);checkAngle(r.getAngle(), FastMath.PI);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78362);try {
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78363);double[][] m5 = { { 0.0, 0.0, 1.0 },
                { 0.0, 1.0, 0.0 },
                { 1.0, 0.0, 0.0 } };
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78364);r = createRotation(m5, 1.0e-7);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78365);Assert.fail("got " + r + ", should have caught an exception");
        } catch (NotARotationMatrixException e) {
            // expected
        }

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testAngles()
            throws CardanEulerSingularityException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7bqrd1ogu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testAngles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7bqrd1ogu() throws CardanEulerSingularityException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78366);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78367);RotationOrder[] CardanOrders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78368);for (int i = 0; (((i < CardanOrders.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78369)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78370)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78371);for (double alpha1 = 0.1; (((alpha1 < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78372)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78373)==0&false)); alpha1 += 0.3) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78374);for (double alpha2 = -1.55; (((alpha2 < 1.55)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78375)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78376)==0&false)); alpha2 += 0.3) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78377);for (double alpha3 = 0.1; (((alpha3 < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78378)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78379)==0&false)); alpha3 += 0.3) {{
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78380);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(CardanOrders[i],
                                                      new DerivativeStructure(3, 1, 0, alpha1),
                                                      new DerivativeStructure(3, 1, 1, alpha2),
                                                      new DerivativeStructure(3, 1, 2, alpha3));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78381);DerivativeStructure[] angles = r.getAngles(CardanOrders[i]);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78382);checkAngle(angles[0], alpha1);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78383);checkAngle(angles[1], alpha2);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78384);checkAngle(angles[2], alpha3);
                    }
                }}
            }}
        }}

        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78385);RotationOrder[] EulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78386);for (int i = 0; (((i < EulerOrders.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78387)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78388)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78389);for (double alpha1 = 0.1; (((alpha1 < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78390)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78391)==0&false)); alpha1 += 0.3) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78392);for (double alpha2 = 0.05; (((alpha2 < 3.1)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78393)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78394)==0&false)); alpha2 += 0.3) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78395);for (double alpha3 = 0.1; (((alpha3 < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78396)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78397)==0&false)); alpha3 += 0.3) {{
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78398);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(EulerOrders[i],
                                                      new DerivativeStructure(3, 1, 0, alpha1),
                                                      new DerivativeStructure(3, 1, 1, alpha2),
                                                      new DerivativeStructure(3, 1, 2, alpha3));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78399);DerivativeStructure[] angles = r.getAngles(EulerOrders[i]);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78400);checkAngle(angles[0], alpha1);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78401);checkAngle(angles[1], alpha2);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78402);checkAngle(angles[2], alpha3);
                    }
                }}
            }}
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testSingularities() {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrztrq1ohv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testSingularities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrztrq1ohv(){try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78403);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78404);RotationOrder[] CardanOrders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78405);double[] singularCardanAngle = { FastMath.PI / 2, -FastMath.PI / 2 };
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78406);for (int i = 0; (((i < CardanOrders.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78407)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78408)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78409);for (int j = 0; (((j < singularCardanAngle.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78410)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78411)==0&false)); ++j) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78412);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(CardanOrders[i],
                                              new DerivativeStructure(3, 1, 0, 0.1),
                                              new DerivativeStructure(3, 1, 1, singularCardanAngle[j]),
                                              new DerivativeStructure(3, 1, 2, 0.3));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78413);try {
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78414);r.getAngles(CardanOrders[i]);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78415);Assert.fail("an exception should have been caught");
                } catch (CardanEulerSingularityException cese) {
                    // expected behavior
                }
            }
        }}

        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78416);RotationOrder[] EulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78417);double[] singularEulerAngle = { 0, FastMath.PI };
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78418);for (int i = 0; (((i < EulerOrders.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78419)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78420)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78421);for (int j = 0; (((j < singularEulerAngle.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78422)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78423)==0&false)); ++j) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78424);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(EulerOrders[i],
                                              new DerivativeStructure(3, 1, 0, 0.1),
                                              new DerivativeStructure(3, 1, 1, singularEulerAngle[j]),
                                              new DerivativeStructure(3, 1, 2, 0.3));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78425);try {
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78426);r.getAngles(EulerOrders[i]);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78427);Assert.fail("an exception should have been caught");
                } catch (CardanEulerSingularityException cese) {
                    // expected behavior
                }
            }
        }}


    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testQuaternion() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6eeh1oik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6eeh1oik() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78428);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78429);FieldRotation<DerivativeStructure> r1 = new FieldRotation<DerivativeStructure>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78430);double n = 23.5;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78431);FieldRotation<DerivativeStructure> r2 = new FieldRotation<DerivativeStructure>(r1.getQ0().multiply(n), r1.getQ1().multiply(n),
                                       r1.getQ2().multiply(n), r1.getQ3().multiply(n),
                                       true);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78432);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78433)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78434)==0&false)); x += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78435);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78436)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78437)==0&false)); y += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78438);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78439)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78440)==0&false)); z += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78441);FieldVector3D<DerivativeStructure> u = createVector(x, y, z);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78442);checkVector(r2.applyTo(u), r1.applyTo(u));
                }
            }}
        }}

        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78443);r1 = createRotation(0.288,  0.384,  0.36,  0.8, false);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78444);checkRotationDS(r1,
                        -r1.getQ0().getReal(), -r1.getQ1().getReal(),
                        -r1.getQ2().getReal(), -r1.getQ3().getReal());
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78445);Assert.assertEquals(0.288, r1.toRotation().getQ0(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78446);Assert.assertEquals(0.384, r1.toRotation().getQ1(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78447);Assert.assertEquals(0.36,  r1.toRotation().getQ2(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78448);Assert.assertEquals(0.8,   r1.toRotation().getQ3(), 1.0e-15);

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testCompose() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i5jaf1oj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testCompose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78449,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i5jaf1oj5() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78449);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78450);FieldRotation<DerivativeStructure> r1       = new FieldRotation<DerivativeStructure>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78451);FieldRotation<DerivativeStructure> r2       = new FieldRotation<DerivativeStructure>(createVector(-1, 3, 2), createAngle(0.3));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78452);FieldRotation<DerivativeStructure> r3       = r2.applyTo(r1);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78453);FieldRotation<DerivativeStructure> r3Double = r2.applyTo(new Rotation(r1.getQ0().getReal(),
                                                      r1.getQ1().getReal(),
                                                      r1.getQ2().getReal(),
                                                      r1.getQ3().getReal(),
                                                      false));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78454);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78455)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78456)==0&false)); x += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78457);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78458)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78459)==0&false)); y += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78460);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78461)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78462)==0&false)); z += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78463);FieldVector3D<DerivativeStructure> u = createVector(x, y, z);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78464);checkVector(r2.applyTo(r1.applyTo(u)), r3.applyTo(u));
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78465);checkVector(r2.applyTo(r1.applyTo(u)), r3Double.applyTo(u));
                }
            }}
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testComposeInverse() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ni03av1ojm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testComposeInverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ni03av1ojm() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78466);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78467);FieldRotation<DerivativeStructure> r1 = new FieldRotation<DerivativeStructure>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78468);FieldRotation<DerivativeStructure> r2 = new FieldRotation<DerivativeStructure>(createVector(-1, 3, 2), createAngle(0.3));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78469);FieldRotation<DerivativeStructure> r3 = r2.applyInverseTo(r1);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78470);FieldRotation<DerivativeStructure> r3Double = r2.applyInverseTo(new Rotation(r1.getQ0().getReal(),
                                                             r1.getQ1().getReal(),
                                                             r1.getQ2().getReal(),
                                                             r1.getQ3().getReal(),
                                                             false));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78471);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78472)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78473)==0&false)); x += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78474);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78475)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78476)==0&false)); y += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78477);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78478)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78479)==0&false)); z += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78480);FieldVector3D<DerivativeStructure> u = createVector(x, y, z);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78481);checkVector(r2.applyInverseTo(r1.applyTo(u)), r3.applyTo(u));
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78482);checkVector(r2.applyInverseTo(r1.applyTo(u)), r3Double.applyTo(u));
                }
            }}
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testDoubleVectors() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyzado1ok3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testDoubleVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyzado1ok3() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78483);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78484);Well1024a random = new Well1024a(0x180b41cfeeffaf67l);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78485);UnitSphereRandomVectorGenerator g = new UnitSphereRandomVectorGenerator(3, random);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78486);for (int i = 0; (((i < 10)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78487)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78488)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78489);double[] unit = g.nextVector();
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78490);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(createVector(unit[0], unit[1], unit[2]),
                                          createAngle(random.nextDouble()));

            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78491);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78492)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78493)==0&false)); x += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78494);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78495)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78496)==0&false)); y += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78497);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78498)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78499)==0&false)); z += 0.2) {{
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78500);FieldVector3D<DerivativeStructure> uds   = createVector(x, y, z);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78501);FieldVector3D<DerivativeStructure> ruds  = r.applyTo(uds);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78502);FieldVector3D<DerivativeStructure> rIuds = r.applyInverseTo(uds);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78503);Vector3D   u     = new Vector3D(x, y, z);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78504);FieldVector3D<DerivativeStructure> ru    = r.applyTo(u);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78505);FieldVector3D<DerivativeStructure> rIu   = r.applyInverseTo(u);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78506);DerivativeStructure[] ruArray = new DerivativeStructure[3];
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78507);r.applyTo(new double[] { x, y, z}, ruArray);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78508);DerivativeStructure[] rIuArray = new DerivativeStructure[3];
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78509);r.applyInverseTo(new double[] { x, y, z}, rIuArray);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78510);checkVector(ruds, ru);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78511);checkVector(ruds, new FieldVector3D<DerivativeStructure>(ruArray));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78512);checkVector(rIuds, rIu);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78513);checkVector(rIuds, new FieldVector3D<DerivativeStructure>(rIuArray));
                    }
                }}
            }}
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testDoubleRotations() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128nh891oky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testDoubleRotations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78514,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128nh891oky() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78514);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78515);Well1024a random = new Well1024a(0x180b41cfeeffaf67l);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78516);UnitSphereRandomVectorGenerator g = new UnitSphereRandomVectorGenerator(3, random);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78517);for (int i = 0; (((i < 10)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78518)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78519)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78520);double[] unit1 = g.nextVector();
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78521);Rotation r1 = new Rotation(new Vector3D(unit1[0], unit1[1], unit1[2]),
                                      random.nextDouble());
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78522);FieldRotation<DerivativeStructure> r1Prime = new FieldRotation<DerivativeStructure>(new DerivativeStructure(4, 1, 0, r1.getQ0()),
                                                new DerivativeStructure(4, 1, 1, r1.getQ1()),
                                                new DerivativeStructure(4, 1, 2, r1.getQ2()),
                                                new DerivativeStructure(4, 1, 3, r1.getQ3()),
                                                false);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78523);double[] unit2 = g.nextVector();
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78524);FieldRotation<DerivativeStructure> r2 = new FieldRotation<DerivativeStructure>(createVector(unit2[0], unit2[1], unit2[2]),
                                           createAngle(random.nextDouble()));

            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78525);FieldRotation<DerivativeStructure> rA = FieldRotation.applyTo(r1, r2);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78526);FieldRotation<DerivativeStructure> rB = r1Prime.applyTo(r2);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78527);FieldRotation<DerivativeStructure> rC = FieldRotation.applyInverseTo(r1, r2);
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78528);FieldRotation<DerivativeStructure> rD = r1Prime.applyInverseTo(r2);

            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78529);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78530)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78531)==0&false)); x += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78532);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78533)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78534)==0&false)); y += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78535);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78536)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78537)==0&false)); z += 0.2) {{

                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78538);FieldVector3D<DerivativeStructure> uds   = createVector(x, y, z);
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78539);checkVector(r1Prime.applyTo(uds), FieldRotation.applyTo(r1, uds));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78540);checkVector(r1Prime.applyInverseTo(uds), FieldRotation.applyInverseTo(r1, uds));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78541);checkVector(rA.applyTo(uds), rB.applyTo(uds));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78542);checkVector(rA.applyInverseTo(uds), rB.applyInverseTo(uds));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78543);checkVector(rC.applyTo(uds), rD.applyTo(uds));
                        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78544);checkVector(rC.applyInverseTo(uds), rD.applyInverseTo(uds));

                    }
                }}
            }}
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testDerivatives() {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mqq5d1olt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testDerivatives",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mqq5d1olt(){try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78545);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78546);double eps      = 5.0e-16;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78547);double kx       = 2;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78548);double ky       = -3;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78549);double kz       = 5;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78550);double n2       = kx * kx + ky * ky + kz * kz;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78551);double n        = FastMath.sqrt(n2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78552);double theta    = 1.7;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78553);double cosTheta = FastMath.cos(theta);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78554);double sinTheta = FastMath.sin(theta);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78555);FieldRotation<DerivativeStructure> r    = new FieldRotation<DerivativeStructure>(createAxis(kx, ky, kz), createAngle(theta));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78556);Vector3D a      = new Vector3D(kx / n, ky / n, kz / n);

        // Jacobian of the normalized rotation axis a with respect to the Cartesian vector k
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78557);RealMatrix dadk = MatrixUtils.createRealMatrix(new double[][] {
            { (ky * ky + kz * kz) / ( n * n2),            -kx * ky / ( n * n2),            -kx * kz / ( n * n2) },
            {            -kx * ky / ( n * n2), (kx * kx + kz * kz) / ( n * n2),            -ky * kz / ( n * n2) },
            {            -kx * kz / ( n * n2),            -ky * kz / ( n * n2), (kx * kx + ky * ky) / ( n * n2) }
        });

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78558);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78559)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78560)==0&false)); x += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78561);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78562)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78563)==0&false)); y += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78564);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78565)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78566)==0&false)); z += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78567);Vector3D   u = new Vector3D(x, y, z);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78568);FieldVector3D<DerivativeStructure> v = r.applyTo(createVector(x, y, z));

                    // explicit formula for rotation of vector u around axis a with angle theta
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78569);double dot     = Vector3D.dotProduct(u, a);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78570);Vector3D cross = Vector3D.crossProduct(a, u);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78571);double c1      = 1 - cosTheta;
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78572);double c2      = c1 * dot;
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78573);Vector3D rt    = new Vector3D(cosTheta, u, c2, a, sinTheta, cross);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78574);Assert.assertEquals(rt.getX(), v.getX().getReal(), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78575);Assert.assertEquals(rt.getY(), v.getY().getReal(), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78576);Assert.assertEquals(rt.getZ(), v.getZ().getReal(), eps);

                    // Jacobian of the image v = r(u) with respect to rotation axis a
                    // (analytical differentiation of the explicit formula)
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78577);RealMatrix dvda = MatrixUtils.createRealMatrix(new double[][] {
                        { c1 * x * a.getX() + c2,           c1 * y * a.getX() + sinTheta * z, c1 * z * a.getX() - sinTheta * y },
                        { c1 * x * a.getY() - sinTheta * z, c1 * y * a.getY() + c2,           c1 * z * a.getY() + sinTheta * x },
                        { c1 * x * a.getZ() + sinTheta * y, c1 * y * a.getZ() - sinTheta * x, c1 * z * a.getZ() + c2           }
                    });

                    // compose Jacobians
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78578);RealMatrix dvdk = dvda.multiply(dadk);

                    // derivatives with respect to un-normalized axis
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78579);Assert.assertEquals(dvdk.getEntry(0, 0), v.getX().getPartialDerivative(1, 0, 0, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78580);Assert.assertEquals(dvdk.getEntry(0, 1), v.getX().getPartialDerivative(0, 1, 0, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78581);Assert.assertEquals(dvdk.getEntry(0, 2), v.getX().getPartialDerivative(0, 0, 1, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78582);Assert.assertEquals(dvdk.getEntry(1, 0), v.getY().getPartialDerivative(1, 0, 0, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78583);Assert.assertEquals(dvdk.getEntry(1, 1), v.getY().getPartialDerivative(0, 1, 0, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78584);Assert.assertEquals(dvdk.getEntry(1, 2), v.getY().getPartialDerivative(0, 0, 1, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78585);Assert.assertEquals(dvdk.getEntry(2, 0), v.getZ().getPartialDerivative(1, 0, 0, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78586);Assert.assertEquals(dvdk.getEntry(2, 1), v.getZ().getPartialDerivative(0, 1, 0, 0), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78587);Assert.assertEquals(dvdk.getEntry(2, 2), v.getZ().getPartialDerivative(0, 0, 1, 0), eps);

                    // derivative with respect to rotation angle
                    // (analytical differentiation of the explicit formula)
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78588);Vector3D dvdTheta =
                            new Vector3D(-sinTheta, u, sinTheta * dot, a, cosTheta, cross);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78589);Assert.assertEquals(dvdTheta.getX(), v.getX().getPartialDerivative(0, 0, 0, 1), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78590);Assert.assertEquals(dvdTheta.getY(), v.getY().getPartialDerivative(0, 0, 0, 1), eps);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78591);Assert.assertEquals(dvdTheta.getZ(), v.getZ().getPartialDerivative(0, 0, 0, 1), eps);

                }
            }}
        }}
     }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testArray() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzzhou1on4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78592,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzzhou1on4() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78592);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78593);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(createAxis(2, -3, 5), createAngle(1.7));

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78594);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78595)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78596)==0&false)); x += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78597);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78598)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78599)==0&false)); y += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78600);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78601)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78602)==0&false)); z += 0.2) {{
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78603);FieldVector3D<DerivativeStructure> u = createVector(x, y, z);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78604);FieldVector3D<DerivativeStructure> v = r.applyTo(u);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78605);DerivativeStructure[] out = new DerivativeStructure[3];
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78606);r.applyTo(new DerivativeStructure[] { u.getX(), u.getY(), u.getZ() }, out);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78607);Assert.assertEquals(v.getX().getReal(), out[0].getReal(), 1.0e-10);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78608);Assert.assertEquals(v.getY().getReal(), out[1].getReal(), 1.0e-10);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78609);Assert.assertEquals(v.getZ().getReal(), out[2].getReal(), 1.0e-10);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78610);r.applyInverseTo(out, out);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78611);Assert.assertEquals(u.getX().getReal(), out[0].getReal(), 1.0e-10);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78612);Assert.assertEquals(u.getY().getReal(), out[1].getReal(), 1.0e-10);
                    __CLR4_4_11ob51ob5lb90pcqk.R.inc(78613);Assert.assertEquals(u.getZ().getReal(), out[2].getReal(), 1.0e-10);
                }
            }}
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testApplyInverseTo() throws MathIllegalArgumentException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pwzh21onq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testApplyInverseTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pwzh21onq() throws MathIllegalArgumentException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78614);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78615);DerivativeStructure[] in      = new DerivativeStructure[3];
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78616);DerivativeStructure[] out     = new DerivativeStructure[3];
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78617);DerivativeStructure[] rebuilt = new DerivativeStructure[3];
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78618);FieldRotation<DerivativeStructure> r = new FieldRotation<DerivativeStructure>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78619);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78620)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78621)==0&false)); lambda += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78622);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78623)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78624)==0&false)); phi += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78625);FieldVector3D<DerivativeStructure> u = createVector(FastMath.cos(lambda) * FastMath.cos(phi),
                                          FastMath.sin(lambda) * FastMath.cos(phi),
                                          FastMath.sin(phi));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78626);r.applyInverseTo(r.applyTo(u));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78627);checkVector(u, r.applyInverseTo(r.applyTo(u)));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78628);checkVector(u, r.applyTo(r.applyInverseTo(u)));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78629);in[0] = u.getX();
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78630);in[1] = u.getY();
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78631);in[2] = u.getZ();
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78632);r.applyTo(in, out);
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78633);r.applyInverseTo(out, rebuilt);
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78634);Assert.assertEquals(in[0].getReal(), rebuilt[0].getReal(), 1.0e-12);
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78635);Assert.assertEquals(in[1].getReal(), rebuilt[1].getReal(), 1.0e-12);
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78636);Assert.assertEquals(in[2].getReal(), rebuilt[2].getReal(), 1.0e-12);
            }
        }}

        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78637);r = createRotation(1, 0, 0, 0, false);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78638);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78639)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78640)==0&false)); lambda += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78641);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78642)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78643)==0&false)); phi += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78644);FieldVector3D<DerivativeStructure> u = createVector(FastMath.cos(lambda) * FastMath.cos(phi),
                                          FastMath.sin(lambda) * FastMath.cos(phi),
                                          FastMath.sin(phi));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78645);checkVector(u, r.applyInverseTo(r.applyTo(u)));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78646);checkVector(u, r.applyTo(r.applyInverseTo(u)));
            }
        }}

        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78647);r = new FieldRotation<DerivativeStructure>(createVector(0, 0, 1), createAngle(FastMath.PI));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78648);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78649)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78650)==0&false)); lambda += 0.2) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78651);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78652)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78653)==0&false)); phi += 0.2) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78654);FieldVector3D<DerivativeStructure> u = createVector(FastMath.cos(lambda) * FastMath.cos(phi),
                                          FastMath.sin(lambda) * FastMath.cos(phi),
                                          FastMath.sin(phi));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78655);checkVector(u, r.applyInverseTo(r.applyTo(u)));
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78656);checkVector(u, r.applyTo(r.applyInverseTo(u)));
            }
        }}

    }}finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testIssue639() throws MathArithmeticException{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14selms1oox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testIssue639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78657,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14selms1oox() throws MathArithmeticException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78657);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78658);FieldVector3D<DerivativeStructure> u1 = createVector(-1321008684645961.0 /  268435456.0,
                                   -5774608829631843.0 /  268435456.0,
                                   -3822921525525679.0 / 4294967296.0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78659);FieldVector3D<DerivativeStructure> u2 =createVector( -5712344449280879.0 /    2097152.0,
                                   -2275058564560979.0 /    1048576.0,
                                   4423475992255071.0 /      65536.0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78660);FieldRotation<DerivativeStructure> rot = new FieldRotation<DerivativeStructure>(u1, u2, createVector(1, 0, 0),createVector(0, 0, 1));
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78661);Assert.assertEquals( 0.6228370359608200639829222, rot.getQ0().getReal(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78662);Assert.assertEquals( 0.0257707621456498790029987, rot.getQ1().getReal(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78663);Assert.assertEquals(-0.0000000002503012255839931, rot.getQ2().getReal(), 1.0e-15);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78664);Assert.assertEquals(-0.7819270390861109450724902, rot.getQ3().getReal(), 1.0e-15);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    @Test
    public void testIssue801() throws MathArithmeticException {__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceStart(getClass().getName(),78665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hujomx1op5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ob51ob5lb90pcqk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ob51ob5lb90pcqk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDSTest.testIssue801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hujomx1op5() throws MathArithmeticException{try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78665);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78666);FieldVector3D<DerivativeStructure> u1 = createVector(0.9999988431610581, -0.0015210774290851095, 0.0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78667);FieldVector3D<DerivativeStructure> u2 = createVector(0.0, 0.0, 1.0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78668);FieldVector3D<DerivativeStructure> v1 = createVector(0.9999999999999999, 0.0, 0.0);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78669);FieldVector3D<DerivativeStructure> v2 = createVector(0.0, 0.0, -1.0);

        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78670);FieldRotation<DerivativeStructure> quat = new FieldRotation<DerivativeStructure>(u1, u2, v1, v2);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78671);double q2 = quat.getQ0().getReal() * quat.getQ0().getReal() +
                    quat.getQ1().getReal() * quat.getQ1().getReal() +
                    quat.getQ2().getReal() * quat.getQ2().getReal() +
                    quat.getQ3().getReal() * quat.getQ3().getReal();
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78672);Assert.assertEquals(1.0, q2, 1.0e-14);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78673);Assert.assertEquals(0.0, FieldVector3D.angle(v1, quat.applyTo(u1)).getReal(), 1.0e-14);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78674);Assert.assertEquals(0.0, FieldVector3D.angle(v2, quat.applyTo(u2)).getReal(), 1.0e-14);

    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private void checkAngle(DerivativeStructure a1, double a2) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78675);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78676);Assert.assertEquals(a1.getReal(), MathUtils.normalizeAngle(a2, a1.getReal()), 1.0e-10);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private void checkRotationDS(FieldRotation<DerivativeStructure> r, double q0, double q1, double q2, double q3) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78677);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78678);FieldRotation<DerivativeStructure> rPrime = createRotation(q0, q1, q2, q3, false);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78679);Assert.assertEquals(0, FieldRotation.distance(r, rPrime).getReal(), 1.0e-12);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private FieldRotation<DerivativeStructure> createRotation(double q0, double q1, double q2, double q3,
                                      boolean needsNormalization) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78680);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78681);return new FieldRotation<DerivativeStructure>(new DerivativeStructure(4, 1, 0, q0),
                              new DerivativeStructure(4, 1, 1, q1),
                              new DerivativeStructure(4, 1, 2, q2),
                              new DerivativeStructure(4, 1, 3, q3),
                              needsNormalization);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private FieldRotation<DerivativeStructure> createRotation(double[][] m, double threshold) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78682);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78683);DerivativeStructure[][] mds = new DerivativeStructure[m.length][m[0].length];
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78684);int index = 0;
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78685);for (int i = 0; (((i < m.length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78686)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78687)==0&false)); ++i) {{
            __CLR4_4_11ob51ob5lb90pcqk.R.inc(78688);for (int j = 0; (((j < m[i].length)&&(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78689)!=0|true))||(__CLR4_4_11ob51ob5lb90pcqk.R.iget(78690)==0&false)); ++j) {{
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78691);mds[i][j] = new DerivativeStructure(4, 1, index, m[i][j]);
                __CLR4_4_11ob51ob5lb90pcqk.R.inc(78692);index = (index + 1) % 4;
            }
        }}
        }__CLR4_4_11ob51ob5lb90pcqk.R.inc(78693);return new FieldRotation<DerivativeStructure>(mds, threshold);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private FieldVector3D<DerivativeStructure> createVector(double x, double y, double z) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78694);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78695);return new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, x),
                              new DerivativeStructure(4, 1, y),
                              new DerivativeStructure(4, 1, z));
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private FieldVector3D<DerivativeStructure> createAxis(double x, double y, double z) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78696);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78697);return new FieldVector3D<DerivativeStructure>(new DerivativeStructure(4, 1, 0, x),
                              new DerivativeStructure(4, 1, 1, y),
                              new DerivativeStructure(4, 1, 2, z));
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private DerivativeStructure createAngle(double alpha) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78698);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78699);return new DerivativeStructure(4, 1, 3, alpha);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

    private void checkVector(FieldVector3D<DerivativeStructure> u, FieldVector3D<DerivativeStructure> v) {try{__CLR4_4_11ob51ob5lb90pcqk.R.inc(78700);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78701);Assert.assertEquals(u.getX().getReal(), v.getX().getReal(), 1.0e-12);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78702);Assert.assertEquals(u.getY().getReal(), v.getY().getReal(), 1.0e-12);
        __CLR4_4_11ob51ob5lb90pcqk.R.inc(78703);Assert.assertEquals(u.getZ().getReal(), v.getZ().getReal(), 1.0e-12);
    }finally{__CLR4_4_11ob51ob5lb90pcqk.R.flushNeeded();}}

}
