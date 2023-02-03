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

import org.apache.commons.math3.dfp.Dfp;
import org.apache.commons.math3.dfp.DfpField;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.junit.Assert;
import org.junit.Test;


public class FieldRotationDfpTest {static class __CLR4_4_11oq81oq8lb90pcrd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,79148,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testIdentity() {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ab1a2x1oq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testIdentity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ab1a2x1oq8(){try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78704);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78705);FieldRotation<Dfp> r = createRotation(1, 0, 0, 0, false);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78706);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(1, 0, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78707);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 1, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78708);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78709);checkAngle(r.getAngle(), 0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78710);r = createRotation(-1, 0, 0, 0, false);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78711);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(1, 0, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78712);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 1, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78713);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78714);checkAngle(r.getAngle(), 0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78715);r = createRotation(42, 0, 0, 0, true);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78716);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(1, 0, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78717);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 1, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78718);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78719);checkAngle(r.getAngle(), 0);

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testAxisAngle() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjsc5j1oqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testAxisAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjsc5j1oqo() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78720);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78721);FieldRotation<Dfp> r = new FieldRotation<Dfp>(createAxis(10, 10, 10), createAngle(2 * FastMath.PI / 3));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78722);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(0, 1, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78723);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78724);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(1, 0, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78725);double s = 1 / FastMath.sqrt(3);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78726);checkVector(r.getAxis(), createVector(s, s, s));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78727);checkAngle(r.getAngle(), 2 * FastMath.PI / 3);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78728);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78729);new FieldRotation<Dfp>(createAxis(0, 0, 0), createAngle(2 * FastMath.PI / 3));
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78730);Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
        }

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78731);r = new FieldRotation<Dfp>(createAxis(0, 0, 1), createAngle(1.5 * FastMath.PI));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78732);checkVector(r.getAxis(), createVector(0, 0, -1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78733);checkAngle(r.getAngle(), 0.5 * FastMath.PI);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78734);r = new FieldRotation<Dfp>(createAxis(0, 1, 0), createAngle(FastMath.PI));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78735);checkVector(r.getAxis(), createVector(0, 1, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78736);checkAngle(r.getAngle(), FastMath.PI);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78737);checkVector(createRotation(1, 0, 0, 0, false).getAxis(), createVector(1, 0, 0));

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testRevert() {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f9xul1or6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testRevert",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f9xul1or6(){try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78738);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78739);double a = 0.001;
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78740);double b = 0.36;
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78741);double c = 0.48;
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78742);double d = 0.8;
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78743);FieldRotation<Dfp> r = createRotation(a, b, c, d, true);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78744);FieldRotation<Dfp> reverted = r.revert();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78745);FieldRotation<Dfp> rrT = r.applyTo(reverted);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78746);checkRotationDS(rrT, 1, 0, 0, 0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78747);FieldRotation<Dfp> rTr = reverted.applyTo(r);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78748);checkRotationDS(rTr, 1, 0, 0, 0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78749);Assert.assertEquals(r.getAngle().getReal(), reverted.getAngle().getReal(), 1.0e-15);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78750);Assert.assertEquals(-1, FieldVector3D.dotProduct(r.getAxis(), reverted.getAxis()).getReal(), 1.0e-15);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testVectorOnePair() throws MathArithmeticException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc3tv21orj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testVectorOnePair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc3tv21orj() throws MathArithmeticException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78751);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78752);FieldVector3D<Dfp> u = createVector(3, 2, 1);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78753);FieldVector3D<Dfp> v = createVector(-4, 2, 2);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78754);FieldRotation<Dfp> r = new FieldRotation<Dfp>(u, v);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78755);checkVector(r.applyTo(u.scalarMultiply(v.getNorm())), v.scalarMultiply(u.getNorm()));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78756);checkAngle(new FieldRotation<Dfp>(u, u.negate()).getAngle(), FastMath.PI);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78757);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78758);new FieldRotation<Dfp>(u, createVector(0, 0, 0));
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78759);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException e) {
            // expected behavior
        }

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testVectorTwoPairs() throws MathArithmeticException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14a8o6v1ors();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testVectorTwoPairs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78760,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14a8o6v1ors() throws MathArithmeticException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78760);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78761);FieldVector3D<Dfp> u1 = createVector(3, 0, 0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78762);FieldVector3D<Dfp> u2 = createVector(0, 5, 0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78763);FieldVector3D<Dfp> v1 = createVector(0, 0, 2);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78764);FieldVector3D<Dfp> v2 = createVector(-2, 0, 2);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78765);FieldRotation<Dfp> r = new FieldRotation<Dfp>(u1, u2, v1, v2);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78766);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78767);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(-1, 0, 0));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78768);r = new FieldRotation<Dfp>(u1, u2, u1.negate(), u2.negate());
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78769);FieldVector3D<Dfp> axis = r.getAxis();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78770);if ((((FieldVector3D.dotProduct(axis, createVector(0, 0, 1)).getReal() > 0)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78771)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78772)==0&false))) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78773);checkVector(axis, createVector(0, 0, 1));
        } }else {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78774);checkVector(axis, createVector(0, 0, -1));
        }
        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(78775);checkAngle(r.getAngle(), FastMath.PI);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78776);double sqrt = FastMath.sqrt(2) / 2;
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78777);r = new FieldRotation<Dfp>(createVector(1, 0, 0),  createVector(0, 1, 0),
                           createVector(0.5, 0.5,  sqrt),
                           createVector(0.5, 0.5, -sqrt));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78778);checkRotationDS(r, sqrt, 0.5, 0.5, 0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78779);r = new FieldRotation<Dfp>(u1, u2, u1, FieldVector3D.crossProduct(u1, u2));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78780);checkRotationDS(r, sqrt, -sqrt, 0, 0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78781);checkRotationDS(new FieldRotation<Dfp>(u1, u2, u1, u2), 1, 0, 0, 0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78782);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78783);new FieldRotation<Dfp>(u1, u2, createVector(0, 0, 0), v2);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78784);Assert.fail("an exception should have been thrown");
        } catch (MathArithmeticException e) {
            // expected behavior
        }

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testMatrix()
            throws NotARotationMatrixException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt8ee21osh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt8ee21osh() throws NotARotationMatrixException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78785);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78786);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78787);createRotation(new double[][] {
                { 0.0, 1.0, 0.0 },
                { 1.0, 0.0, 0.0 }
            }, 1.0e-7);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78788);Assert.fail("Expecting NotARotationMatrixException");
        } catch (NotARotationMatrixException nrme) {
            // expected behavior
        }

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78789);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78790);createRotation(new double[][] {
                {  0.445888,  0.797184, -0.407040 },
                {  0.821760, -0.184320,  0.539200 },
                { -0.354816,  0.574912,  0.737280 }
            }, 1.0e-7);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78791);Assert.fail("Expecting NotARotationMatrixException");
        } catch (NotARotationMatrixException nrme) {
            // expected behavior
        }

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78792);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78793);createRotation(new double[][] {
                {  0.4,  0.8, -0.4 },
                { -0.4,  0.6,  0.7 },
                {  0.8, -0.2,  0.5 }
            }, 1.0e-15);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78794);Assert.fail("Expecting NotARotationMatrixException");
        } catch (NotARotationMatrixException nrme) {
            // expected behavior
        }

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78795);checkRotationDS(createRotation(new double[][] {
            {  0.445888,  0.797184, -0.407040 },
            { -0.354816,  0.574912,  0.737280 },
            {  0.821760, -0.184320,  0.539200 }
        }, 1.0e-10),
        0.8, 0.288, 0.384, 0.36);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78796);checkRotationDS(createRotation(new double[][] {
            {  0.539200,  0.737280,  0.407040 },
            {  0.184320, -0.574912,  0.797184 },
            {  0.821760, -0.354816, -0.445888 }
        }, 1.0e-10),
        0.36, 0.8, 0.288, 0.384);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78797);checkRotationDS(createRotation(new double[][] {
            { -0.445888,  0.797184, -0.407040 },
            {  0.354816,  0.574912,  0.737280 },
            {  0.821760,  0.184320, -0.539200 }
        }, 1.0e-10),
        0.384, 0.36, 0.8, 0.288);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78798);checkRotationDS(createRotation(new double[][] {
            { -0.539200,  0.737280,  0.407040 },
            { -0.184320, -0.574912,  0.797184 },
            {  0.821760,  0.354816,  0.445888 }
        }, 1.0e-10),
        0.288, 0.384, 0.36, 0.8);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78799);double[][] m1 = { { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 },
            { 1.0, 0.0, 0.0 } };
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78800);FieldRotation<Dfp> r = createRotation(m1, 1.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78801);checkVector(r.applyTo(createVector(1, 0, 0)), createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78802);checkVector(r.applyTo(createVector(0, 1, 0)), createVector(1, 0, 0));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78803);checkVector(r.applyTo(createVector(0, 0, 1)), createVector(0, 1, 0));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78804);double[][] m2 = { { 0.83203, -0.55012, -0.07139 },
            { 0.48293,  0.78164, -0.39474 },
            { 0.27296,  0.29396,  0.91602 } };
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78805);r = createRotation(m2, 1.0e-12);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78806);Dfp[][] m3 = r.getMatrix();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78807);double d00 = m2[0][0] - m3[0][0].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78808);double d01 = m2[0][1] - m3[0][1].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78809);double d02 = m2[0][2] - m3[0][2].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78810);double d10 = m2[1][0] - m3[1][0].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78811);double d11 = m2[1][1] - m3[1][1].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78812);double d12 = m2[1][2] - m3[1][2].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78813);double d20 = m2[2][0] - m3[2][0].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78814);double d21 = m2[2][1] - m3[2][1].getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78815);double d22 = m2[2][2] - m3[2][2].getReal();

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78816);Assert.assertTrue(FastMath.abs(d00) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78817);Assert.assertTrue(FastMath.abs(d01) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78818);Assert.assertTrue(FastMath.abs(d02) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78819);Assert.assertTrue(FastMath.abs(d10) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78820);Assert.assertTrue(FastMath.abs(d11) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78821);Assert.assertTrue(FastMath.abs(d12) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78822);Assert.assertTrue(FastMath.abs(d20) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78823);Assert.assertTrue(FastMath.abs(d21) < 6.0e-6);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78824);Assert.assertTrue(FastMath.abs(d22) < 6.0e-6);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78825);Assert.assertTrue(FastMath.abs(d00) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78826);Assert.assertTrue(FastMath.abs(d01) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78827);Assert.assertTrue(FastMath.abs(d02) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78828);Assert.assertTrue(FastMath.abs(d10) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78829);Assert.assertTrue(FastMath.abs(d11) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78830);Assert.assertTrue(FastMath.abs(d12) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78831);Assert.assertTrue(FastMath.abs(d20) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78832);Assert.assertTrue(FastMath.abs(d21) > 4.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78833);Assert.assertTrue(FastMath.abs(d22) > 4.0e-7);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78834);for (int i = 0; (((i < 3)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78835)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78836)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78837);for (int j = 0; (((j < 3)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78838)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78839)==0&false)); ++j) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78840);double m3tm3 = m3[i][0].getReal() * m3[j][0].getReal() +
                               m3[i][1].getReal() * m3[j][1].getReal() +
                               m3[i][2].getReal() * m3[j][2].getReal();
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78841);if ((((i == j)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78842)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78843)==0&false))) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78844);Assert.assertTrue(FastMath.abs(m3tm3 - 1.0) < 1.0e-10);
                } }else {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78845);Assert.assertTrue(FastMath.abs(m3tm3) < 1.0e-10);
                }
            }}
        }}

        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(78846);checkVector(r.applyTo(createVector(1, 0, 0)),
                    new FieldVector3D<Dfp>(m3[0][0], m3[1][0], m3[2][0]));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78847);checkVector(r.applyTo(createVector(0, 1, 0)),
                    new FieldVector3D<Dfp>(m3[0][1], m3[1][1], m3[2][1]));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78848);checkVector(r.applyTo(createVector(0, 0, 1)),
                    new FieldVector3D<Dfp>(m3[0][2], m3[1][2], m3[2][2]));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78849);double[][] m4 = { { 1.0,  0.0,  0.0 },
            { 0.0, -1.0,  0.0 },
            { 0.0,  0.0, -1.0 } };
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78850);r = createRotation(m4, 1.0e-7);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78851);checkAngle(r.getAngle(), FastMath.PI);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78852);try {
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78853);double[][] m5 = { { 0.0, 0.0, 1.0 },
                { 0.0, 1.0, 0.0 },
                { 1.0, 0.0, 0.0 } };
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78854);r = createRotation(m5, 1.0e-7);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78855);Assert.fail("got " + r + ", should have caught an exception");
        } catch (NotARotationMatrixException e) {
            // expected
        }

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testAngles()
            throws CardanEulerSingularityException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7bqrd1oug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testAngles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78856,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7bqrd1oug() throws CardanEulerSingularityException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78856);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78857);DfpField field = new DfpField(15);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78858);RotationOrder[] CardanOrders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78859);for (int i = 0; (((i < CardanOrders.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78860)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78861)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78862);for (double alpha1 = 0.1; (((alpha1 < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78863)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78864)==0&false)); alpha1 += 2.0) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78865);for (double alpha2 = -1.55; (((alpha2 < 1.55)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78866)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78867)==0&false)); alpha2 += 0.8) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78868);for (double alpha3 = 0.1; (((alpha3 < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78869)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78870)==0&false)); alpha3 += 2.0) {{
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78871);FieldRotation<Dfp> r = new FieldRotation<Dfp>(CardanOrders[i],
                                                                      field.newDfp(alpha1),
                                                                      field.newDfp(alpha2),
                                                                      field.newDfp(alpha3));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78872);Dfp[] angles = r.getAngles(CardanOrders[i]);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78873);checkAngle(angles[0], alpha1);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78874);checkAngle(angles[1], alpha2);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78875);checkAngle(angles[2], alpha3);
                    }
                }}
            }}
        }}

        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(78876);RotationOrder[] EulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78877);for (int i = 0; (((i < EulerOrders.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78878)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78879)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78880);for (double alpha1 = 0.1; (((alpha1 < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78881)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78882)==0&false)); alpha1 += 2.0) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78883);for (double alpha2 = 0.05; (((alpha2 < 3.1)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78884)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78885)==0&false)); alpha2 += 0.8) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78886);for (double alpha3 = 0.1; (((alpha3 < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78887)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78888)==0&false)); alpha3 += 2.0) {{
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78889);FieldRotation<Dfp> r = new FieldRotation<Dfp>(EulerOrders[i],
                                                                      field.newDfp(alpha1),
                                                                      field.newDfp(alpha2),
                                                                      field.newDfp(alpha3));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78890);Dfp[] angles = r.getAngles(EulerOrders[i]);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78891);checkAngle(angles[0], alpha1);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78892);checkAngle(angles[1], alpha2);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78893);checkAngle(angles[2], alpha3);
                    }
                }}
            }}
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testSingularities() {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrztrq1ovi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testSingularities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrztrq1ovi(){try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78894);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78895);DfpField field = new DfpField(20);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78896);RotationOrder[] CardanOrders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78897);double[] singularCardanAngle = { FastMath.PI / 2, -FastMath.PI / 2 };
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78898);for (int i = 0; (((i < CardanOrders.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78899)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78900)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78901);for (int j = 0; (((j < singularCardanAngle.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78902)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78903)==0&false)); ++j) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78904);FieldRotation<Dfp> r = new FieldRotation<Dfp>(CardanOrders[i],
                                                              field.newDfp(0.1),
                                                              field.newDfp(singularCardanAngle[j]),
                                                              field.newDfp(0.3));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78905);try {
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78906);r.getAngles(CardanOrders[i]);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78907);Assert.fail("an exception should have been caught");
                } catch (CardanEulerSingularityException cese) {
                    // expected behavior
                }
            }
        }}

        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(78908);RotationOrder[] EulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78909);double[] singularEulerAngle = { 0, FastMath.PI };
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78910);for (int i = 0; (((i < EulerOrders.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78911)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78912)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78913);for (int j = 0; (((j < singularEulerAngle.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78914)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78915)==0&false)); ++j) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78916);FieldRotation<Dfp> r = new FieldRotation<Dfp>(EulerOrders[i],
                                                              field.newDfp(0.1),
                                                              field.newDfp(singularEulerAngle[j]),
                                                              field.newDfp(0.3));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78917);try {
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78918);r.getAngles(EulerOrders[i]);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78919);Assert.fail("an exception should have been caught");
                } catch (CardanEulerSingularityException cese) {
                    // expected behavior
                }
            }
        }}


    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testQuaternion() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6eeh1ow8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6eeh1ow8() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78920);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78921);FieldRotation<Dfp> r1 = new FieldRotation<Dfp>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78922);double n = 23.5;
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78923);FieldRotation<Dfp> r2 = new FieldRotation<Dfp>(r1.getQ0().multiply(n), r1.getQ1().multiply(n),
                                       r1.getQ2().multiply(n), r1.getQ3().multiply(n),
                                       true);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78924);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78925)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78926)==0&false)); x += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78927);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78928)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78929)==0&false)); y += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78930);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78931)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78932)==0&false)); z += 0.2) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78933);FieldVector3D<Dfp> u = createVector(x, y, z);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78934);checkVector(r2.applyTo(u), r1.applyTo(u));
                }
            }}
        }}

        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(78935);r1 = createRotation(0.288,  0.384,  0.36,  0.8, false);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78936);checkRotationDS(r1,
                        -r1.getQ0().getReal(), -r1.getQ1().getReal(),
                        -r1.getQ2().getReal(), -r1.getQ3().getReal());

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testCompose() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i5jaf1owp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testCompose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78937,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i5jaf1owp() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78937);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78938);FieldRotation<Dfp> r1       = new FieldRotation<Dfp>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78939);FieldRotation<Dfp> r2       = new FieldRotation<Dfp>(createVector(-1, 3, 2), createAngle(0.3));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78940);FieldRotation<Dfp> r3       = r2.applyTo(r1);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78941);FieldRotation<Dfp> r3Double = r2.applyTo(new Rotation(r1.getQ0().getReal(),
                                                      r1.getQ1().getReal(),
                                                      r1.getQ2().getReal(),
                                                      r1.getQ3().getReal(),
                                                      false));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78942);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78943)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78944)==0&false)); x += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78945);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78946)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78947)==0&false)); y += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78948);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78949)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78950)==0&false)); z += 0.2) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78951);FieldVector3D<Dfp> u = createVector(x, y, z);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78952);checkVector(r2.applyTo(r1.applyTo(u)), r3.applyTo(u));
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78953);checkVector(r2.applyTo(r1.applyTo(u)), r3Double.applyTo(u));
                }
            }}
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testComposeInverse() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ni03av1ox6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testComposeInverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ni03av1ox6() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78954);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78955);FieldRotation<Dfp> r1 = new FieldRotation<Dfp>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78956);FieldRotation<Dfp> r2 = new FieldRotation<Dfp>(createVector(-1, 3, 2), createAngle(0.3));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78957);FieldRotation<Dfp> r3 = r2.applyInverseTo(r1);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78958);FieldRotation<Dfp> r3Double = r2.applyInverseTo(new Rotation(r1.getQ0().getReal(),
                                                             r1.getQ1().getReal(),
                                                             r1.getQ2().getReal(),
                                                             r1.getQ3().getReal(),
                                                             false));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78959);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78960)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78961)==0&false)); x += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78962);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78963)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78964)==0&false)); y += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78965);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78966)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78967)==0&false)); z += 0.2) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78968);FieldVector3D<Dfp> u = createVector(x, y, z);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78969);checkVector(r2.applyInverseTo(r1.applyTo(u)), r3.applyTo(u));
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78970);checkVector(r2.applyInverseTo(r1.applyTo(u)), r3Double.applyTo(u));
                }
            }}
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testDoubleVectors() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),78971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dyzado1oxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testDoubleVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dyzado1oxn() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(78971);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78972);Well1024a random = new Well1024a(0x180b41cfeeffaf67l);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78973);UnitSphereRandomVectorGenerator g = new UnitSphereRandomVectorGenerator(3, random);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78974);for (int i = 0; (((i < 10)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78975)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78976)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78977);double[] unit = g.nextVector();
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78978);FieldRotation<Dfp> r = new FieldRotation<Dfp>(createVector(unit[0], unit[1], unit[2]),
                                          createAngle(random.nextDouble()));

            __CLR4_4_11oq81oq8lb90pcrd.R.inc(78979);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78980)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78981)==0&false)); x += 0.4) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(78982);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78983)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78984)==0&false)); y += 0.4) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(78985);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78986)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(78987)==0&false)); z += 0.4) {{
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78988);FieldVector3D<Dfp> uds   = createVector(x, y, z);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78989);FieldVector3D<Dfp> ruds  = r.applyTo(uds);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78990);FieldVector3D<Dfp> rIuds = r.applyInverseTo(uds);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78991);Vector3D   u     = new Vector3D(x, y, z);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78992);FieldVector3D<Dfp> ru    = r.applyTo(u);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78993);FieldVector3D<Dfp> rIu   = r.applyInverseTo(u);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78994);Dfp[] ruArray = new Dfp[3];
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78995);r.applyTo(new double[] { x, y, z}, ruArray);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78996);Dfp[] rIuArray = new Dfp[3];
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78997);r.applyInverseTo(new double[] { x, y, z}, rIuArray);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78998);checkVector(ruds, ru);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(78999);checkVector(ruds, new FieldVector3D<Dfp>(ruArray));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79000);checkVector(rIuds, rIu);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79001);checkVector(rIuds, new FieldVector3D<Dfp>(rIuArray));
                    }
                }}
            }}
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testDoubleRotations() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),79002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_128nh891oyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testDoubleRotations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_128nh891oyi() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79002);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79003);DfpField field = new DfpField(20);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79004);Well1024a random = new Well1024a(0x180b41cfeeffaf67l);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79005);UnitSphereRandomVectorGenerator g = new UnitSphereRandomVectorGenerator(3, random);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79006);for (int i = 0; (((i < 10)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79007)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79008)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79009);double[] unit1 = g.nextVector();
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79010);Rotation r1 = new Rotation(new Vector3D(unit1[0], unit1[1], unit1[2]),
                                      random.nextDouble());
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79011);FieldRotation<Dfp> r1Prime = new FieldRotation<Dfp>(field.newDfp(r1.getQ0()),
                                                                field.newDfp(r1.getQ1()),
                                                                field.newDfp(r1.getQ2()),
                                                                field.newDfp(r1.getQ3()),
                                                                false);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79012);double[] unit2 = g.nextVector();
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79013);FieldRotation<Dfp> r2 = new FieldRotation<Dfp>(createVector(unit2[0], unit2[1], unit2[2]),
                                           createAngle(random.nextDouble()));

            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79014);FieldRotation<Dfp> rA = FieldRotation.applyTo(r1, r2);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79015);FieldRotation<Dfp> rB = r1Prime.applyTo(r2);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79016);FieldRotation<Dfp> rC = FieldRotation.applyInverseTo(r1, r2);
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79017);FieldRotation<Dfp> rD = r1Prime.applyInverseTo(r2);

            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79018);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79019)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79020)==0&false)); x += 0.4) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79021);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79022)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79023)==0&false)); y += 0.4) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79024);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79025)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79026)==0&false)); z += 0.4) {{

                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79027);FieldVector3D<Dfp> uds   = createVector(x, y, z);
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79028);checkVector(r1Prime.applyTo(uds), FieldRotation.applyTo(r1, uds));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79029);checkVector(r1Prime.applyInverseTo(uds), FieldRotation.applyInverseTo(r1, uds));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79030);checkVector(rA.applyTo(uds), rB.applyTo(uds));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79031);checkVector(rA.applyInverseTo(uds), rB.applyInverseTo(uds));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79032);checkVector(rC.applyTo(uds), rD.applyTo(uds));
                        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79033);checkVector(rC.applyInverseTo(uds), rD.applyInverseTo(uds));

                    }
                }}
            }}
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testArray() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),79034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzzhou1oze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzzhou1oze() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79034);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79035);FieldRotation<Dfp> r = new FieldRotation<Dfp>(createAxis(2, -3, 5), createAngle(1.7));

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79036);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79037)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79038)==0&false)); x += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79039);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79040)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79041)==0&false)); y += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79042);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79043)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79044)==0&false)); z += 0.2) {{
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79045);FieldVector3D<Dfp> u = createVector(x, y, z);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79046);FieldVector3D<Dfp> v = r.applyTo(u);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79047);Dfp[] out = new Dfp[3];
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79048);r.applyTo(new Dfp[] { u.getX(), u.getY(), u.getZ() }, out);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79049);Assert.assertEquals(v.getX().getReal(), out[0].getReal(), 1.0e-10);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79050);Assert.assertEquals(v.getY().getReal(), out[1].getReal(), 1.0e-10);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79051);Assert.assertEquals(v.getZ().getReal(), out[2].getReal(), 1.0e-10);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79052);r.applyInverseTo(out, out);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79053);Assert.assertEquals(u.getX().getReal(), out[0].getReal(), 1.0e-10);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79054);Assert.assertEquals(u.getY().getReal(), out[1].getReal(), 1.0e-10);
                    __CLR4_4_11oq81oq8lb90pcrd.R.inc(79055);Assert.assertEquals(u.getZ().getReal(), out[2].getReal(), 1.0e-10);
                }
            }}
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testApplyInverseTo() throws MathIllegalArgumentException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),79056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pwzh21p00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testApplyInverseTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pwzh21p00() throws MathIllegalArgumentException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79056);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79057);Dfp[] in      = new Dfp[3];
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79058);Dfp[] out     = new Dfp[3];
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79059);Dfp[] rebuilt = new Dfp[3];
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79060);FieldRotation<Dfp> r = new FieldRotation<Dfp>(createVector(2, -3, 5), createAngle(1.7));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79061);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79062)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79063)==0&false)); lambda += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79064);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79065)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79066)==0&false)); phi += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79067);FieldVector3D<Dfp> u = createVector(FastMath.cos(lambda) * FastMath.cos(phi),
                                          FastMath.sin(lambda) * FastMath.cos(phi),
                                          FastMath.sin(phi));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79068);r.applyInverseTo(r.applyTo(u));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79069);checkVector(u, r.applyInverseTo(r.applyTo(u)));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79070);checkVector(u, r.applyTo(r.applyInverseTo(u)));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79071);in[0] = u.getX();
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79072);in[1] = u.getY();
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79073);in[2] = u.getZ();
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79074);r.applyTo(in, out);
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79075);r.applyInverseTo(out, rebuilt);
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79076);Assert.assertEquals(in[0].getReal(), rebuilt[0].getReal(), 1.0e-12);
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79077);Assert.assertEquals(in[1].getReal(), rebuilt[1].getReal(), 1.0e-12);
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79078);Assert.assertEquals(in[2].getReal(), rebuilt[2].getReal(), 1.0e-12);
            }
        }}

        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(79079);r = createRotation(1, 0, 0, 0, false);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79080);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79081)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79082)==0&false)); lambda += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79083);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79084)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79085)==0&false)); phi += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79086);FieldVector3D<Dfp> u = createVector(FastMath.cos(lambda) * FastMath.cos(phi),
                                          FastMath.sin(lambda) * FastMath.cos(phi),
                                          FastMath.sin(phi));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79087);checkVector(u, r.applyInverseTo(r.applyTo(u)));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79088);checkVector(u, r.applyTo(r.applyInverseTo(u)));
            }
        }}

        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(79089);r = new FieldRotation<Dfp>(createVector(0, 0, 1), createAngle(FastMath.PI));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79090);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79091)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79092)==0&false)); lambda += 0.2) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79093);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79094)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79095)==0&false)); phi += 0.2) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79096);FieldVector3D<Dfp> u = createVector(FastMath.cos(lambda) * FastMath.cos(phi),
                                          FastMath.sin(lambda) * FastMath.cos(phi),
                                          FastMath.sin(phi));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79097);checkVector(u, r.applyInverseTo(r.applyTo(u)));
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79098);checkVector(u, r.applyTo(r.applyInverseTo(u)));
            }
        }}

    }}finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testIssue639() throws MathArithmeticException{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),79099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14selms1p17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testIssue639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14selms1p17() throws MathArithmeticException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79099);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79100);FieldVector3D<Dfp> u1 = createVector(-1321008684645961.0 /  268435456.0,
                                   -5774608829631843.0 /  268435456.0,
                                   -3822921525525679.0 / 4294967296.0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79101);FieldVector3D<Dfp> u2 =createVector( -5712344449280879.0 /    2097152.0,
                                   -2275058564560979.0 /    1048576.0,
                                   4423475992255071.0 /      65536.0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79102);FieldRotation<Dfp> rot = new FieldRotation<Dfp>(u1, u2, createVector(1, 0, 0),createVector(0, 0, 1));
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79103);Assert.assertEquals( 0.6228370359608200639829222, rot.getQ0().getReal(), 1.0e-15);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79104);Assert.assertEquals( 0.0257707621456498790029987, rot.getQ1().getReal(), 1.0e-15);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79105);Assert.assertEquals(-0.0000000002503012255839931, rot.getQ2().getReal(), 1.0e-15);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79106);Assert.assertEquals(-0.7819270390861109450724902, rot.getQ3().getReal(), 1.0e-15);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    @Test
    public void testIssue801() throws MathArithmeticException {__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceStart(getClass().getName(),79107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hujomx1p1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11oq81oq8lb90pcrd.R.rethrow($CLV_t2$);}finally{__CLR4_4_11oq81oq8lb90pcrd.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest.testIssue801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hujomx1p1f() throws MathArithmeticException{try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79107);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79108);FieldVector3D<Dfp> u1 = createVector(0.9999988431610581, -0.0015210774290851095, 0.0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79109);FieldVector3D<Dfp> u2 = createVector(0.0, 0.0, 1.0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79110);FieldVector3D<Dfp> v1 = createVector(0.9999999999999999, 0.0, 0.0);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79111);FieldVector3D<Dfp> v2 = createVector(0.0, 0.0, -1.0);

        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79112);FieldRotation<Dfp> quat = new FieldRotation<Dfp>(u1, u2, v1, v2);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79113);double q2 = quat.getQ0().getReal() * quat.getQ0().getReal() +
                    quat.getQ1().getReal() * quat.getQ1().getReal() +
                    quat.getQ2().getReal() * quat.getQ2().getReal() +
                    quat.getQ3().getReal() * quat.getQ3().getReal();
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79114);Assert.assertEquals(1.0, q2, 1.0e-14);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79115);Assert.assertEquals(0.0, FieldVector3D.angle(v1, quat.applyTo(u1)).getReal(), 1.0e-14);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79116);Assert.assertEquals(0.0, FieldVector3D.angle(v2, quat.applyTo(u2)).getReal(), 1.0e-14);

    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private void checkAngle(Dfp a1, double a2) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79117);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79118);Assert.assertEquals(a1.getReal(), MathUtils.normalizeAngle(a2, a1.getReal()), 1.0e-10);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private void checkRotationDS(FieldRotation<Dfp> r, double q0, double q1, double q2, double q3) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79119);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79120);FieldRotation<Dfp> rPrime = createRotation(q0, q1, q2, q3, false);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79121);Assert.assertEquals(0, FieldRotation.distance(r, rPrime).getReal(), 1.0e-12);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private FieldRotation<Dfp> createRotation(double q0, double q1, double q2, double q3,
                                      boolean needsNormalization) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79122);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79123);DfpField field = new DfpField(20);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79124);return new FieldRotation<Dfp>(field.newDfp(q0),
                                      field.newDfp(q1),
                                      field.newDfp(q2),
                                      field.newDfp(q3),
                                      needsNormalization);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private FieldRotation<Dfp> createRotation(double[][] m, double threshold) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79125);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79126);DfpField field = new DfpField(20);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79127);Dfp[][] mds = new Dfp[m.length][m[0].length];
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79128);for (int i = 0; (((i < m.length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79129)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79130)==0&false)); ++i) {{
            __CLR4_4_11oq81oq8lb90pcrd.R.inc(79131);for (int j = 0; (((j < m[i].length)&&(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79132)!=0|true))||(__CLR4_4_11oq81oq8lb90pcrd.R.iget(79133)==0&false)); ++j) {{
                __CLR4_4_11oq81oq8lb90pcrd.R.inc(79134);mds[i][j] = field.newDfp(m[i][j]);
            }
        }}
        }__CLR4_4_11oq81oq8lb90pcrd.R.inc(79135);return new FieldRotation<Dfp>(mds, threshold);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private FieldVector3D<Dfp> createVector(double x, double y, double z) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79136);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79137);DfpField field = new DfpField(20);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79138);return new FieldVector3D<Dfp>(field.newDfp(x), field.newDfp(y), field.newDfp(z));
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private FieldVector3D<Dfp> createAxis(double x, double y, double z) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79139);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79140);DfpField field = new DfpField(20);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79141);return new FieldVector3D<Dfp>(field.newDfp(x), field.newDfp(y), field.newDfp(z));
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private Dfp createAngle(double alpha) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79142);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79143);return new DfpField(20).newDfp(alpha);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

    private void checkVector(FieldVector3D<Dfp> u, FieldVector3D<Dfp> v) {try{__CLR4_4_11oq81oq8lb90pcrd.R.inc(79144);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79145);Assert.assertEquals(u.getX().getReal(), v.getX().getReal(), 1.0e-12);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79146);Assert.assertEquals(u.getY().getReal(), v.getY().getReal(), 1.0e-12);
        __CLR4_4_11oq81oq8lb90pcrd.R.inc(79147);Assert.assertEquals(u.getZ().getReal(), v.getZ().getReal(), 1.0e-12);
    }finally{__CLR4_4_11oq81oq8lb90pcrd.R.flushNeeded();}}

}
