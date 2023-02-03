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
package org.apache.commons.math3.complex;

import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


/**
 * Unit tests for the {@link RootsOfUnity} class.
 *
 * @version $Id$
 */
public class RootsOfUnityTest {static class __CLR4_4_11i4g1i4glb90pc7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,70189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(expected = MathIllegalStateException.class)
    public void testMathIllegalState1() {__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceStart(getClass().getName(),70144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j2zpqb1i4g();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,49,58,32,91,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i4g1i4glb90pc7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.RootsOfUnityTest.testMathIllegalState1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70144,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j2zpqb1i4g(){try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70144);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70145);final RootsOfUnity roots = new RootsOfUnity();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70146);roots.getReal(0);
    }finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}

    @Test(expected = MathIllegalStateException.class)
    public void testMathIllegalState2() {__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceStart(getClass().getName(),70147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mbzois1i4j();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,50,58,32,91,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i4g1i4glb90pc7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.RootsOfUnityTest.testMathIllegalState2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70147,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mbzois1i4j(){try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70147);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70148);final RootsOfUnity roots = new RootsOfUnity();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70149);roots.getImaginary(0);
    }finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}

    @Test(expected = MathIllegalStateException.class)
    public void testMathIllegalState3() {__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceStart(getClass().getName(),70150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pkznb91i4m();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,51,58,32,91,77,97,116,104,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MathIllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i4g1i4glb90pc7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.RootsOfUnityTest.testMathIllegalState3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pkznb91i4m(){try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70150);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70151);final RootsOfUnity roots = new RootsOfUnity();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70152);roots.isCounterClockWise();
    }finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}

    @Test(expected = ZeroException.class)
    public void testZeroNumberOfRoots() {__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceStart(getClass().getName(),70153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qfiua1i4p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,90,101,114,111,78,117,109,98,101,114,79,102,82,111,111,116,115,58,32,91,90,101,114,111,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ZeroException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i4g1i4glb90pc7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.RootsOfUnityTest.testZeroNumberOfRoots",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qfiua1i4p(){try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70153);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70154);final RootsOfUnity roots = new RootsOfUnity();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70155);roots.computeRoots(0);
    }finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}

    @Test
    public void testGetNumberOfRoots() {__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceStart(getClass().getName(),70156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18q5ub01i4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i4g1i4glb90pc7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.RootsOfUnityTest.testGetNumberOfRoots",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70156,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18q5ub01i4s(){try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70156);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70157);final RootsOfUnity roots = new RootsOfUnity();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70158);Assert.assertEquals("", 0, roots.getNumberOfRoots());
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70159);roots.computeRoots(5);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70160);Assert.assertEquals("", 5, roots.getNumberOfRoots());
        /*
         * Testing -5 right after 5 is important, as the roots in this case are
         * not recomputed.
         */
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70161);roots.computeRoots(-5);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70162);Assert.assertEquals("", 5, roots.getNumberOfRoots());
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70163);roots.computeRoots(6);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70164);Assert.assertEquals("", 6, roots.getNumberOfRoots());
    }finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}

    @Test
    public void testComputeRoots() {__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceStart(getClass().getName(),70165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vudopf1i51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11i4g1i4glb90pc7p.R.rethrow($CLV_t2$);}finally{__CLR4_4_11i4g1i4glb90pc7p.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.complex.RootsOfUnityTest.testComputeRoots",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vudopf1i51(){try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70165);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70166);final RootsOfUnity roots = new RootsOfUnity();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70167);for (int n = -10; (((n < 11)&&(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70168)!=0|true))||(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70169)==0&false)); n++) {{
            /*
             * Testing -n right after n is important, as the roots in this case
             * are not recomputed.
             */
            __CLR4_4_11i4g1i4glb90pc7p.R.inc(70170);if ((((n != 0)&&(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70171)!=0|true))||(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70172)==0&false))) {{
                __CLR4_4_11i4g1i4glb90pc7p.R.inc(70173);roots.computeRoots(n);
                __CLR4_4_11i4g1i4glb90pc7p.R.inc(70174);doTestComputeRoots(roots);
                __CLR4_4_11i4g1i4glb90pc7p.R.inc(70175);roots.computeRoots(-n);
                __CLR4_4_11i4g1i4glb90pc7p.R.inc(70176);doTestComputeRoots(roots);
            }
        }}
    }}finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}

    private void doTestComputeRoots(final RootsOfUnity roots) {try{__CLR4_4_11i4g1i4glb90pc7p.R.inc(70177);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70178);final int n = (((roots.isCounterClockWise() )&&(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70179)!=0|true))||(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70180)==0&false))? roots.getNumberOfRoots() :
            -roots.getNumberOfRoots();
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70181);final double tol = 10 * Math.ulp(1.0);
        __CLR4_4_11i4g1i4glb90pc7p.R.inc(70182);for (int k = 0; (((k < n)&&(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70183)!=0|true))||(__CLR4_4_11i4g1i4glb90pc7p.R.iget(70184)==0&false)); k++) {{
            __CLR4_4_11i4g1i4glb90pc7p.R.inc(70185);final double t = 2.0 * FastMath.PI * k / n;
            __CLR4_4_11i4g1i4glb90pc7p.R.inc(70186);@SuppressWarnings("boxing")
            final String msg = String.format("n = %d, k = %d", n, k);
            __CLR4_4_11i4g1i4glb90pc7p.R.inc(70187);Assert.assertEquals(msg, FastMath.cos(t), roots.getReal(k), tol);
            __CLR4_4_11i4g1i4glb90pc7p.R.inc(70188);Assert.assertEquals(msg, FastMath.sin(t), roots.getImaginary(k), tol);
        }
    }}finally{__CLR4_4_11i4g1i4glb90pc7p.R.flushNeeded();}}
}
