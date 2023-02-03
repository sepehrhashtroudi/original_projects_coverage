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

package org.apache.commons.math3.analysis.differentiation;

import org.junit.Assert;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;


/**
 * Test for class {@link JacobianFunction}.
 */
public class JacobianFunctionTest {static class __CLR4_4_11diw1diwlb90pbwh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,64221,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSphere() {__CLR4_4_11diw1diwlb90pbwh.R.globalSliceStart(getClass().getName(),64184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ut81gm1diw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11diw1diwlb90pbwh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11diw1diwlb90pbwh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.analysis.differentiation.JacobianFunctionTest.testSphere",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ut81gm1diw(){try{__CLR4_4_11diw1diwlb90pbwh.R.inc(64184);
        __CLR4_4_11diw1diwlb90pbwh.R.inc(64185);SphereMapping    f = new SphereMapping(10.0);
        __CLR4_4_11diw1diwlb90pbwh.R.inc(64186);JacobianFunction j = new JacobianFunction(f);
        __CLR4_4_11diw1diwlb90pbwh.R.inc(64187);for (double latitude = -1.5; (((latitude < 1.5)&&(__CLR4_4_11diw1diwlb90pbwh.R.iget(64188)!=0|true))||(__CLR4_4_11diw1diwlb90pbwh.R.iget(64189)==0&false)); latitude += 0.1) {{
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64190);for (double longitude = -3.1; (((longitude < 3.1)&&(__CLR4_4_11diw1diwlb90pbwh.R.iget(64191)!=0|true))||(__CLR4_4_11diw1diwlb90pbwh.R.iget(64192)==0&false)); longitude += 0.1) {{
                __CLR4_4_11diw1diwlb90pbwh.R.inc(64193);double[] point = new double[] { latitude, longitude };
                __CLR4_4_11diw1diwlb90pbwh.R.inc(64194);double[][] referenceJacobian  = f.jacobian(point);
                __CLR4_4_11diw1diwlb90pbwh.R.inc(64195);double[][] testJacobian       = j.value(point);
                __CLR4_4_11diw1diwlb90pbwh.R.inc(64196);Assert.assertEquals(referenceJacobian.length, testJacobian.length);
                __CLR4_4_11diw1diwlb90pbwh.R.inc(64197);for (int i = 0; (((i < 3)&&(__CLR4_4_11diw1diwlb90pbwh.R.iget(64198)!=0|true))||(__CLR4_4_11diw1diwlb90pbwh.R.iget(64199)==0&false)); ++i) {{
                    __CLR4_4_11diw1diwlb90pbwh.R.inc(64200);TestUtils.assertEquals(referenceJacobian[i], testJacobian[i], 2.0e-15);
                }
            }}
        }}
    }}finally{__CLR4_4_11diw1diwlb90pbwh.R.flushNeeded();}}

    /* Maps (latitude, longitude) to (x, y, z) */
    private static class SphereMapping implements MultivariateDifferentiableVectorFunction {

        private final double radius;

        public SphereMapping(final double radius) {try{__CLR4_4_11diw1diwlb90pbwh.R.inc(64201);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64202);this.radius = radius;
        }finally{__CLR4_4_11diw1diwlb90pbwh.R.flushNeeded();}}
        
        public double[] value(double[] point) {try{__CLR4_4_11diw1diwlb90pbwh.R.inc(64203);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64204);final double cLat = FastMath.cos(point[0]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64205);final double sLat = FastMath.sin(point[0]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64206);final double cLon = FastMath.cos(point[1]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64207);final double sLon = FastMath.sin(point[1]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64208);return new double[] {
                radius * cLon * cLat,
                radius * sLon * cLat,
                radius * sLat
            };
        }finally{__CLR4_4_11diw1diwlb90pbwh.R.flushNeeded();}}
        
        public DerivativeStructure[] value(DerivativeStructure[] point) {try{__CLR4_4_11diw1diwlb90pbwh.R.inc(64209);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64210);final DerivativeStructure cLat = point[0].cos();
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64211);final DerivativeStructure sLat = point[0].sin();
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64212);final DerivativeStructure cLon = point[1].cos();
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64213);final DerivativeStructure sLon = point[1].sin();
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64214);return new DerivativeStructure[] {
                cLon.multiply(cLat).multiply(radius),
                sLon.multiply(cLat).multiply(radius),
                sLat.multiply(radius)
            };
        }finally{__CLR4_4_11diw1diwlb90pbwh.R.flushNeeded();}}

        public double[][] jacobian(double[] point) {try{__CLR4_4_11diw1diwlb90pbwh.R.inc(64215);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64216);final double cLat = FastMath.cos(point[0]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64217);final double sLat = FastMath.sin(point[0]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64218);final double cLon = FastMath.cos(point[1]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64219);final double sLon = FastMath.sin(point[1]);
            __CLR4_4_11diw1diwlb90pbwh.R.inc(64220);return new double[][] {
                { -radius * cLon * sLat, -radius * sLon * cLat },
                { -radius * sLon * sLat,  radius * cLon * cLat },
                {  radius * cLat,         0  }
            };
        }finally{__CLR4_4_11diw1diwlb90pbwh.R.flushNeeded();}}

    }

}
