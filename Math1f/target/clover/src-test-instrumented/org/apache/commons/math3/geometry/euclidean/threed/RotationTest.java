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

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;
import org.junit.Assert;
import org.junit.Test;


public class RotationTest {static class __CLR4_4_11pmg1pmglb90pcun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,80197,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testIdentity() {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),79864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ab1a2x1pmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testIdentity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ab1a2x1pmg(){try{__CLR4_4_11pmg1pmglb90pcun.R.inc(79864);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79865);Rotation r = Rotation.IDENTITY;
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79866);checkVector(r.applyTo(Vector3D.PLUS_I), Vector3D.PLUS_I);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79867);checkVector(r.applyTo(Vector3D.PLUS_J), Vector3D.PLUS_J);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79868);checkVector(r.applyTo(Vector3D.PLUS_K), Vector3D.PLUS_K);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79869);checkAngle(r.getAngle(), 0);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79870);r = new Rotation(-1, 0, 0, 0, false);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79871);checkVector(r.applyTo(Vector3D.PLUS_I), Vector3D.PLUS_I);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79872);checkVector(r.applyTo(Vector3D.PLUS_J), Vector3D.PLUS_J);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79873);checkVector(r.applyTo(Vector3D.PLUS_K), Vector3D.PLUS_K);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79874);checkAngle(r.getAngle(), 0);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79875);r = new Rotation(42, 0, 0, 0, true);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79876);checkVector(r.applyTo(Vector3D.PLUS_I), Vector3D.PLUS_I);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79877);checkVector(r.applyTo(Vector3D.PLUS_J), Vector3D.PLUS_J);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79878);checkVector(r.applyTo(Vector3D.PLUS_K), Vector3D.PLUS_K);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79879);checkAngle(r.getAngle(), 0);

  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testAxisAngle() throws MathIllegalArgumentException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),79880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kjsc5j1pmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testAxisAngle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kjsc5j1pmw() throws MathIllegalArgumentException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(79880);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79881);Rotation r = new Rotation(new Vector3D(10, 10, 10), 2 * FastMath.PI / 3);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79882);checkVector(r.applyTo(Vector3D.PLUS_I), Vector3D.PLUS_J);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79883);checkVector(r.applyTo(Vector3D.PLUS_J), Vector3D.PLUS_K);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79884);checkVector(r.applyTo(Vector3D.PLUS_K), Vector3D.PLUS_I);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79885);double s = 1 / FastMath.sqrt(3);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79886);checkVector(r.getAxis(), new Vector3D(s, s, s));
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79887);checkAngle(r.getAngle(), 2 * FastMath.PI / 3);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79888);try {
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79889);new Rotation(new Vector3D(0, 0, 0), 2 * FastMath.PI / 3);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79890);Assert.fail("an exception should have been thrown");
    } catch (MathIllegalArgumentException e) {
    }

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79891);r = new Rotation(Vector3D.PLUS_K, 1.5 * FastMath.PI);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79892);checkVector(r.getAxis(), new Vector3D(0, 0, -1));
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79893);checkAngle(r.getAngle(), 0.5 * FastMath.PI);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79894);r = new Rotation(Vector3D.PLUS_J, FastMath.PI);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79895);checkVector(r.getAxis(), Vector3D.PLUS_J);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79896);checkAngle(r.getAngle(), FastMath.PI);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79897);checkVector(Rotation.IDENTITY.getAxis(), Vector3D.PLUS_I);

  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testRevert() {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),79898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19f9xul1pne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testRevert",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19f9xul1pne(){try{__CLR4_4_11pmg1pmglb90pcun.R.inc(79898);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79899);Rotation r = new Rotation(0.001, 0.36, 0.48, 0.8, true);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79900);Rotation reverted = r.revert();
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79901);checkRotation(r.applyTo(reverted), 1, 0, 0, 0);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79902);checkRotation(reverted.applyTo(r), 1, 0, 0, 0);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79903);Assert.assertEquals(r.getAngle(), reverted.getAngle(), 1.0e-12);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79904);Assert.assertEquals(-1, Vector3D.dotProduct(r.getAxis(), reverted.getAxis()), 1.0e-12);
  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testVectorOnePair() throws MathArithmeticException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),79905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oc3tv21pnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testVectorOnePair",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79905,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oc3tv21pnl() throws MathArithmeticException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(79905);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79906);Vector3D u = new Vector3D(3, 2, 1);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79907);Vector3D v = new Vector3D(-4, 2, 2);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79908);Rotation r = new Rotation(u, v);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79909);checkVector(r.applyTo(u.scalarMultiply(v.getNorm())), v.scalarMultiply(u.getNorm()));

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79910);checkAngle(new Rotation(u, u.negate()).getAngle(), FastMath.PI);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79911);try {
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79912);new Rotation(u, Vector3D.ZERO);
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79913);Assert.fail("an exception should have been thrown");
    } catch (MathArithmeticException e) {
        // expected behavior
    }

  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testVectorTwoPairs() throws MathArithmeticException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),79914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14a8o6v1pnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testVectorTwoPairs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14a8o6v1pnu() throws MathArithmeticException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(79914);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79915);Vector3D u1 = new Vector3D(3, 0, 0);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79916);Vector3D u2 = new Vector3D(0, 5, 0);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79917);Vector3D v1 = new Vector3D(0, 0, 2);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79918);Vector3D v2 = new Vector3D(-2, 0, 2);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79919);Rotation r = new Rotation(u1, u2, v1, v2);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79920);checkVector(r.applyTo(Vector3D.PLUS_I), Vector3D.PLUS_K);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79921);checkVector(r.applyTo(Vector3D.PLUS_J), Vector3D.MINUS_I);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79922);r = new Rotation(u1, u2, u1.negate(), u2.negate());
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79923);Vector3D axis = r.getAxis();
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79924);if ((((Vector3D.dotProduct(axis, Vector3D.PLUS_K) > 0)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(79925)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(79926)==0&false))) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79927);checkVector(axis, Vector3D.PLUS_K);
    } }else {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79928);checkVector(axis, Vector3D.MINUS_K);
    }
    }__CLR4_4_11pmg1pmglb90pcun.R.inc(79929);checkAngle(r.getAngle(), FastMath.PI);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79930);double sqrt = FastMath.sqrt(2) / 2;
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79931);r = new Rotation(Vector3D.PLUS_I,  Vector3D.PLUS_J,
                     new Vector3D(0.5, 0.5,  sqrt),
                     new Vector3D(0.5, 0.5, -sqrt));
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79932);checkRotation(r, sqrt, 0.5, 0.5, 0);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79933);r = new Rotation(u1, u2, u1, Vector3D.crossProduct(u1, u2));
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79934);checkRotation(r, sqrt, -sqrt, 0, 0);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79935);checkRotation(new Rotation(u1, u2, u1, u2), 1, 0, 0, 0);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79936);try {
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79937);new Rotation(u1, u2, Vector3D.ZERO, v2);
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79938);Assert.fail("an exception should have been thrown");
    } catch (MathArithmeticException e) {
      // expected behavior
    }

  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testMatrix()
    throws NotARotationMatrixException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),79939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lt8ee21poj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testMatrix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lt8ee21poj() throws NotARotationMatrixException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(79939);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79940);try {
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79941);new Rotation(new double[][] {
                     { 0.0, 1.0, 0.0 },
                     { 1.0, 0.0, 0.0 }
                   }, 1.0e-7);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79942);Assert.fail("Expecting NotARotationMatrixException");
    } catch (NotARotationMatrixException nrme) {
      // expected behavior
    }

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79943);try {
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79944);new Rotation(new double[][] {
                     {  0.445888,  0.797184, -0.407040 },
                     {  0.821760, -0.184320,  0.539200 },
                     { -0.354816,  0.574912,  0.737280 }
                   }, 1.0e-7);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79945);Assert.fail("Expecting NotARotationMatrixException");
    } catch (NotARotationMatrixException nrme) {
      // expected behavior
    }

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79946);try {
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79947);new Rotation(new double[][] {
                       {  0.4,  0.8, -0.4 },
                       { -0.4,  0.6,  0.7 },
                       {  0.8, -0.2,  0.5 }
                     }, 1.0e-15);
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79948);Assert.fail("Expecting NotARotationMatrixException");
      } catch (NotARotationMatrixException nrme) {
        // expected behavior
      }

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79949);checkRotation(new Rotation(new double[][] {
                                 {  0.445888,  0.797184, -0.407040 },
                                 { -0.354816,  0.574912,  0.737280 },
                                 {  0.821760, -0.184320,  0.539200 }
                               }, 1.0e-10),
                  0.8, 0.288, 0.384, 0.36);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79950);checkRotation(new Rotation(new double[][] {
                                 {  0.539200,  0.737280,  0.407040 },
                                 {  0.184320, -0.574912,  0.797184 },
                                 {  0.821760, -0.354816, -0.445888 }
                              }, 1.0e-10),
                  0.36, 0.8, 0.288, 0.384);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79951);checkRotation(new Rotation(new double[][] {
                                 { -0.445888,  0.797184, -0.407040 },
                                 {  0.354816,  0.574912,  0.737280 },
                                 {  0.821760,  0.184320, -0.539200 }
                               }, 1.0e-10),
                  0.384, 0.36, 0.8, 0.288);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79952);checkRotation(new Rotation(new double[][] {
                                 { -0.539200,  0.737280,  0.407040 },
                                 { -0.184320, -0.574912,  0.797184 },
                                 {  0.821760,  0.354816,  0.445888 }
                               }, 1.0e-10),
                  0.288, 0.384, 0.36, 0.8);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79953);double[][] m1 = { { 0.0, 1.0, 0.0 },
                      { 0.0, 0.0, 1.0 },
                      { 1.0, 0.0, 0.0 } };
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79954);Rotation r = new Rotation(m1, 1.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79955);checkVector(r.applyTo(Vector3D.PLUS_I), Vector3D.PLUS_K);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79956);checkVector(r.applyTo(Vector3D.PLUS_J), Vector3D.PLUS_I);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79957);checkVector(r.applyTo(Vector3D.PLUS_K), Vector3D.PLUS_J);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79958);double[][] m2 = { { 0.83203, -0.55012, -0.07139 },
                      { 0.48293,  0.78164, -0.39474 },
                      { 0.27296,  0.29396,  0.91602 } };
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79959);r = new Rotation(m2, 1.0e-12);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79960);double[][] m3 = r.getMatrix();
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79961);double d00 = m2[0][0] - m3[0][0];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79962);double d01 = m2[0][1] - m3[0][1];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79963);double d02 = m2[0][2] - m3[0][2];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79964);double d10 = m2[1][0] - m3[1][0];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79965);double d11 = m2[1][1] - m3[1][1];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79966);double d12 = m2[1][2] - m3[1][2];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79967);double d20 = m2[2][0] - m3[2][0];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79968);double d21 = m2[2][1] - m3[2][1];
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79969);double d22 = m2[2][2] - m3[2][2];

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79970);Assert.assertTrue(FastMath.abs(d00) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79971);Assert.assertTrue(FastMath.abs(d01) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79972);Assert.assertTrue(FastMath.abs(d02) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79973);Assert.assertTrue(FastMath.abs(d10) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79974);Assert.assertTrue(FastMath.abs(d11) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79975);Assert.assertTrue(FastMath.abs(d12) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79976);Assert.assertTrue(FastMath.abs(d20) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79977);Assert.assertTrue(FastMath.abs(d21) < 6.0e-6);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79978);Assert.assertTrue(FastMath.abs(d22) < 6.0e-6);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79979);Assert.assertTrue(FastMath.abs(d00) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79980);Assert.assertTrue(FastMath.abs(d01) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79981);Assert.assertTrue(FastMath.abs(d02) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79982);Assert.assertTrue(FastMath.abs(d10) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79983);Assert.assertTrue(FastMath.abs(d11) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79984);Assert.assertTrue(FastMath.abs(d12) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79985);Assert.assertTrue(FastMath.abs(d20) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79986);Assert.assertTrue(FastMath.abs(d21) > 4.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(79987);Assert.assertTrue(FastMath.abs(d22) > 4.0e-7);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(79988);for (int i = 0; (((i < 3)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(79989)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(79990)==0&false)); ++i) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(79991);for (int j = 0; (((j < 3)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(79992)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(79993)==0&false)); ++j) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79994);double m3tm3 = m3[i][0] * m3[j][0]
                     + m3[i][1] * m3[j][1]
                     + m3[i][2] * m3[j][2];
        __CLR4_4_11pmg1pmglb90pcun.R.inc(79995);if ((((i == j)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(79996)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(79997)==0&false))) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(79998);Assert.assertTrue(FastMath.abs(m3tm3 - 1.0) < 1.0e-10);
        } }else {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(79999);Assert.assertTrue(FastMath.abs(m3tm3) < 1.0e-10);
        }
      }}
    }}

    }__CLR4_4_11pmg1pmglb90pcun.R.inc(80000);checkVector(r.applyTo(Vector3D.PLUS_I),
                new Vector3D(m3[0][0], m3[1][0], m3[2][0]));
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80001);checkVector(r.applyTo(Vector3D.PLUS_J),
                new Vector3D(m3[0][1], m3[1][1], m3[2][1]));
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80002);checkVector(r.applyTo(Vector3D.PLUS_K),
                new Vector3D(m3[0][2], m3[1][2], m3[2][2]));

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80003);double[][] m4 = { { 1.0,  0.0,  0.0 },
                      { 0.0, -1.0,  0.0 },
                      { 0.0,  0.0, -1.0 } };
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80004);r = new Rotation(m4, 1.0e-7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80005);checkAngle(r.getAngle(), FastMath.PI);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80006);try {
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80007);double[][] m5 = { { 0.0, 0.0, 1.0 },
                        { 0.0, 1.0, 0.0 },
                        { 1.0, 0.0, 0.0 } };
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80008);r = new Rotation(m5, 1.0e-7);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80009);Assert.fail("got " + r + ", should have caught an exception");
    } catch (NotARotationMatrixException e) {
      // expected
    }

  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testAngles()
    throws CardanEulerSingularityException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7bqrd1pqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testAngles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7bqrd1pqi() throws CardanEulerSingularityException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80010);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80011);RotationOrder[] CardanOrders = {
      RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
      RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
    };

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80012);for (int i = 0; (((i < CardanOrders.length)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80013)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80014)==0&false)); ++i) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80015);for (double alpha1 = 0.1; (((alpha1 < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80016)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80017)==0&false)); alpha1 += 0.3) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80018);for (double alpha2 = -1.55; (((alpha2 < 1.55)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80019)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80020)==0&false)); alpha2 += 0.3) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80021);for (double alpha3 = 0.1; (((alpha3 < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80022)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80023)==0&false)); alpha3 += 0.3) {{
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80024);Rotation r = new Rotation(CardanOrders[i], alpha1, alpha2, alpha3);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80025);double[] angles = r.getAngles(CardanOrders[i]);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80026);checkAngle(angles[0], alpha1);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80027);checkAngle(angles[1], alpha2);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80028);checkAngle(angles[2], alpha3);
          }
        }}
      }}
    }}

    }__CLR4_4_11pmg1pmglb90pcun.R.inc(80029);RotationOrder[] EulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
          };

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80030);for (int i = 0; (((i < EulerOrders.length)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80031)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80032)==0&false)); ++i) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80033);for (double alpha1 = 0.1; (((alpha1 < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80034)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80035)==0&false)); alpha1 += 0.3) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80036);for (double alpha2 = 0.05; (((alpha2 < 3.1)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80037)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80038)==0&false)); alpha2 += 0.3) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80039);for (double alpha3 = 0.1; (((alpha3 < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80040)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80041)==0&false)); alpha3 += 0.3) {{
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80042);Rotation r = new Rotation(EulerOrders[i],
                                      alpha1, alpha2, alpha3);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80043);double[] angles = r.getAngles(EulerOrders[i]);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80044);checkAngle(angles[0], alpha1);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80045);checkAngle(angles[1], alpha2);
            __CLR4_4_11pmg1pmglb90pcun.R.inc(80046);checkAngle(angles[2], alpha3);
          }
        }}
      }}
    }}

  }}finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testSingularities() {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rrztrq1prj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testSingularities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rrztrq1prj(){try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80047);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80048);RotationOrder[] CardanOrders = {
      RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
      RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
    };

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80049);double[] singularCardanAngle = { FastMath.PI / 2, -FastMath.PI / 2 };
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80050);for (int i = 0; (((i < CardanOrders.length)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80051)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80052)==0&false)); ++i) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80053);for (int j = 0; (((j < singularCardanAngle.length)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80054)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80055)==0&false)); ++j) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80056);Rotation r = new Rotation(CardanOrders[i], 0.1, singularCardanAngle[j], 0.3);
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80057);try {
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80058);r.getAngles(CardanOrders[i]);
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80059);Assert.fail("an exception should have been caught");
        } catch (CardanEulerSingularityException cese) {
          // expected behavior
        }
      }
    }}

    }__CLR4_4_11pmg1pmglb90pcun.R.inc(80060);RotationOrder[] EulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
          };

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80061);double[] singularEulerAngle = { 0, FastMath.PI };
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80062);for (int i = 0; (((i < EulerOrders.length)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80063)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80064)==0&false)); ++i) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80065);for (int j = 0; (((j < singularEulerAngle.length)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80066)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80067)==0&false)); ++j) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80068);Rotation r = new Rotation(EulerOrders[i], 0.1, singularEulerAngle[j], 0.3);
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80069);try {
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80070);r.getAngles(EulerOrders[i]);
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80071);Assert.fail("an exception should have been caught");
        } catch (CardanEulerSingularityException cese) {
          // expected behavior
        }
      }
    }}


  }}finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testQuaternion() throws MathIllegalArgumentException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6eeh1ps8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testQuaternion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6eeh1ps8() throws MathIllegalArgumentException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80072);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80073);Rotation r1 = new Rotation(new Vector3D(2, -3, 5), 1.7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80074);double n = 23.5;
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80075);Rotation r2 = new Rotation(n * r1.getQ0(), n * r1.getQ1(),
                               n * r1.getQ2(), n * r1.getQ3(),
                               true);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80076);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80077)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80078)==0&false)); x += 0.2) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80079);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80080)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80081)==0&false)); y += 0.2) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80082);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80083)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80084)==0&false)); z += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80085);Vector3D u = new Vector3D(x, y, z);
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80086);checkVector(r2.applyTo(u), r1.applyTo(u));
        }
      }}
    }}

    }__CLR4_4_11pmg1pmglb90pcun.R.inc(80087);r1 = new Rotation( 0.288,  0.384,  0.36,  0.8, false);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80088);checkRotation(r1, -r1.getQ0(), -r1.getQ1(), -r1.getQ2(), -r1.getQ3());

  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testCompose() throws MathIllegalArgumentException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18i5jaf1psp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testCompose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18i5jaf1psp() throws MathIllegalArgumentException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80089);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80090);Rotation r1 = new Rotation(new Vector3D(2, -3, 5), 1.7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80091);Rotation r2 = new Rotation(new Vector3D(-1, 3, 2), 0.3);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80092);Rotation r3 = r2.applyTo(r1);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80093);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80094)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80095)==0&false)); x += 0.2) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80096);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80097)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80098)==0&false)); y += 0.2) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80099);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80100)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80101)==0&false)); z += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80102);Vector3D u = new Vector3D(x, y, z);
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80103);checkVector(r2.applyTo(r1.applyTo(u)), r3.applyTo(u));
        }
      }}
    }}

  }}finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testComposeInverse() throws MathIllegalArgumentException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ni03av1pt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testComposeInverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ni03av1pt4() throws MathIllegalArgumentException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80104);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80105);Rotation r1 = new Rotation(new Vector3D(2, -3, 5), 1.7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80106);Rotation r2 = new Rotation(new Vector3D(-1, 3, 2), 0.3);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80107);Rotation r3 = r2.applyInverseTo(r1);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80108);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80109)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80110)==0&false)); x += 0.2) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80111);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80112)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80113)==0&false)); y += 0.2) {{
        __CLR4_4_11pmg1pmglb90pcun.R.inc(80114);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80115)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80116)==0&false)); z += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80117);Vector3D u = new Vector3D(x, y, z);
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80118);checkVector(r2.applyInverseTo(r1.applyTo(u)), r3.applyTo(u));
        }
      }}
    }}

  }}finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testArray() throws MathIllegalArgumentException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qzzhou1ptj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qzzhou1ptj() throws MathIllegalArgumentException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80119);

      __CLR4_4_11pmg1pmglb90pcun.R.inc(80120);Rotation r = new Rotation(new Vector3D(2, -3, 5), 1.7);

      __CLR4_4_11pmg1pmglb90pcun.R.inc(80121);for (double x = -0.9; (((x < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80122)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80123)==0&false)); x += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80124);for (double y = -0.9; (((y < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80125)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80126)==0&false)); y += 0.2) {{
              __CLR4_4_11pmg1pmglb90pcun.R.inc(80127);for (double z = -0.9; (((z < 0.9)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80128)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80129)==0&false)); z += 0.2) {{
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80130);Vector3D u = new Vector3D(x, y, z);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80131);Vector3D v = r.applyTo(u);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80132);double[] inOut = new double[] { x, y, z };
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80133);r.applyTo(inOut, inOut);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80134);Assert.assertEquals(v.getX(), inOut[0], 1.0e-10);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80135);Assert.assertEquals(v.getY(), inOut[1], 1.0e-10);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80136);Assert.assertEquals(v.getZ(), inOut[2], 1.0e-10);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80137);r.applyInverseTo(inOut, inOut);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80138);Assert.assertEquals(u.getX(), inOut[0], 1.0e-10);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80139);Assert.assertEquals(u.getY(), inOut[1], 1.0e-10);
                  __CLR4_4_11pmg1pmglb90pcun.R.inc(80140);Assert.assertEquals(u.getZ(), inOut[2], 1.0e-10);
              }
          }}
      }}

  }}finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testApplyInverseTo() throws MathIllegalArgumentException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17pwzh21pu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testApplyInverseTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17pwzh21pu5() throws MathIllegalArgumentException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80141);

    __CLR4_4_11pmg1pmglb90pcun.R.inc(80142);Rotation r = new Rotation(new Vector3D(2, -3, 5), 1.7);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80143);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80144)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80145)==0&false)); lambda += 0.2) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80146);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80147)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80148)==0&false)); phi += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80149);Vector3D u = new Vector3D(FastMath.cos(lambda) * FastMath.cos(phi),
                                    FastMath.sin(lambda) * FastMath.cos(phi),
                                    FastMath.sin(phi));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80150);r.applyInverseTo(r.applyTo(u));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80151);checkVector(u, r.applyInverseTo(r.applyTo(u)));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80152);checkVector(u, r.applyTo(r.applyInverseTo(u)));
      }
    }}

    }__CLR4_4_11pmg1pmglb90pcun.R.inc(80153);r = Rotation.IDENTITY;
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80154);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80155)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80156)==0&false)); lambda += 0.2) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80157);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80158)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80159)==0&false)); phi += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80160);Vector3D u = new Vector3D(FastMath.cos(lambda) * FastMath.cos(phi),
                                    FastMath.sin(lambda) * FastMath.cos(phi),
                                    FastMath.sin(phi));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80161);checkVector(u, r.applyInverseTo(r.applyTo(u)));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80162);checkVector(u, r.applyTo(r.applyInverseTo(u)));
      }
    }}

    }__CLR4_4_11pmg1pmglb90pcun.R.inc(80163);r = new Rotation(Vector3D.PLUS_K, FastMath.PI);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80164);for (double lambda = 0; (((lambda < 6.2)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80165)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80166)==0&false)); lambda += 0.2) {{
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80167);for (double phi = -1.55; (((phi < 1.55)&&(__CLR4_4_11pmg1pmglb90pcun.R.iget(80168)!=0|true))||(__CLR4_4_11pmg1pmglb90pcun.R.iget(80169)==0&false)); phi += 0.2) {{
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80170);Vector3D u = new Vector3D(FastMath.cos(lambda) * FastMath.cos(phi),
                                    FastMath.sin(lambda) * FastMath.cos(phi),
                                    FastMath.sin(phi));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80171);checkVector(u, r.applyInverseTo(r.applyTo(u)));
          __CLR4_4_11pmg1pmglb90pcun.R.inc(80172);checkVector(u, r.applyTo(r.applyInverseTo(u)));
      }
    }}

  }}finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testIssue639() throws MathArithmeticException{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14selms1pv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testIssue639",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14selms1pv1() throws MathArithmeticException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80173);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80174);Vector3D u1 = new Vector3D(-1321008684645961.0 /  268435456.0,
                                 -5774608829631843.0 /  268435456.0,
                                 -3822921525525679.0 / 4294967296.0);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80175);Vector3D u2 =new Vector3D( -5712344449280879.0 /    2097152.0,
                                 -2275058564560979.0 /    1048576.0,
                                  4423475992255071.0 /      65536.0);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80176);Rotation rot = new Rotation(u1, u2, Vector3D.PLUS_I,Vector3D.PLUS_K);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80177);Assert.assertEquals( 0.6228370359608200639829222, rot.getQ0(), 1.0e-15);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80178);Assert.assertEquals( 0.0257707621456498790029987, rot.getQ1(), 1.0e-15);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80179);Assert.assertEquals(-0.0000000002503012255839931, rot.getQ2(), 1.0e-15);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80180);Assert.assertEquals(-0.7819270390861109450724902, rot.getQ3(), 1.0e-15);
  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  @Test
  public void testIssue801() throws MathArithmeticException {__CLR4_4_11pmg1pmglb90pcun.R.globalSliceStart(getClass().getName(),80181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hujomx1pv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11pmg1pmglb90pcun.R.rethrow($CLV_t2$);}finally{__CLR4_4_11pmg1pmglb90pcun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.geometry.euclidean.threed.RotationTest.testIssue801",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),80181,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hujomx1pv9() throws MathArithmeticException{try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80181);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80182);Vector3D u1 = new Vector3D(0.9999988431610581, -0.0015210774290851095, 0.0);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80183);Vector3D u2 = new Vector3D(0.0, 0.0, 1.0);

      __CLR4_4_11pmg1pmglb90pcun.R.inc(80184);Vector3D v1 = new Vector3D(0.9999999999999999, 0.0, 0.0);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80185);Vector3D v2 = new Vector3D(0.0, 0.0, -1.0);

      __CLR4_4_11pmg1pmglb90pcun.R.inc(80186);Rotation quat = new Rotation(u1, u2, v1, v2);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80187);double q2 = quat.getQ0() * quat.getQ0() +
                  quat.getQ1() * quat.getQ1() +
                  quat.getQ2() * quat.getQ2() +
                  quat.getQ3() * quat.getQ3();
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80188);Assert.assertEquals(1.0, q2, 1.0e-14);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80189);Assert.assertEquals(0.0, Vector3D.angle(v1, quat.applyTo(u1)), 1.0e-14);
      __CLR4_4_11pmg1pmglb90pcun.R.inc(80190);Assert.assertEquals(0.0, Vector3D.angle(v2, quat.applyTo(u2)), 1.0e-14);
      
  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  private void checkVector(Vector3D v1, Vector3D v2) {try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80191);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80192);Assert.assertTrue(v1.subtract(v2).getNorm() < 1.0e-10);
  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  private void checkAngle(double a1, double a2) {try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80193);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80194);Assert.assertEquals(a1, MathUtils.normalizeAngle(a2, a1), 1.0e-10);
  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

  private void checkRotation(Rotation r, double q0, double q1, double q2, double q3) {try{__CLR4_4_11pmg1pmglb90pcun.R.inc(80195);
    __CLR4_4_11pmg1pmglb90pcun.R.inc(80196);Assert.assertEquals(0, Rotation.distance(r, new Rotation(q0, q1, q2, q3, false)), 1.0e-12);
  }finally{__CLR4_4_11pmg1pmglb90pcun.R.flushNeeded();}}

}
