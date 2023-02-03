/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link Incrementor}.
 */
public class IncrementorTest {static class __CLR4_4_12g5r2g5rlb90pf3x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,114322,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testConstructor1() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kibo7k2g5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testConstructor1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kibo7k2g5r(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114255);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114256);final Incrementor i = new Incrementor();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114257);Assert.assertEquals(0, i.getMaximalCount());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114258);Assert.assertEquals(0, i.getCount());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testConstructor2() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nrbn012g5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testConstructor2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nrbn012g5v(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114259);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114260);final Incrementor i = new Incrementor(10);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114261);Assert.assertEquals(10, i.getMaximalCount());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114262);Assert.assertEquals(0, i.getCount());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testCanIncrement1() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a2qo492g5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testCanIncrement1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a2qo492g5z(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114263);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114264);final Incrementor i = new Incrementor(3);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114265);Assert.assertTrue(i.canIncrement());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114266);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114267);Assert.assertTrue(i.canIncrement());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114268);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114269);Assert.assertTrue(i.canIncrement());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114270);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114271);Assert.assertFalse(i.canIncrement());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testCanIncrement2() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tqpbs2g68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testCanIncrement2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tqpbs2g68(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114272);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114273);final Incrementor i = new Incrementor(3);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114274);while ((((i.canIncrement())&&(__CLR4_4_12g5r2g5rlb90pf3x.R.iget(114275)!=0|true))||(__CLR4_4_12g5r2g5rlb90pf3x.R.iget(114276)==0&false))) {{
            __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114277);i.incrementCount();
        }

        // Must keep try/catch because the exception must be generated here,
        // and not in the previous loop.
        }__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114278);try {
            __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114279);i.incrementCount();
            __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114280);Assert.fail("MaxCountExceededException expected");
        } catch (MaxCountExceededException e) {
            // Expected.
        }
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testAccessor() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18eknq82g6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testAccessor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114281,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18eknq82g6h(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114281);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114282);final Incrementor i = new Incrementor();

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114283);i.setMaximalCount(10);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114284);Assert.assertEquals(10, i.getMaximalCount());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114285);Assert.assertEquals(0, i.getCount());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testBelowMaxCount() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189jl732g6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testBelowMaxCount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189jl732g6m(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114286);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114287);final Incrementor i = new Incrementor();

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114288);i.setMaximalCount(3);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114289);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114290);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114291);i.incrementCount();

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114292);Assert.assertEquals(3, i.getCount());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test(expected=MaxCountExceededException.class)
    public void testAboveMaxCount() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12u68kd2g6t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,98,111,118,101,77,97,120,67,111,117,110,116,58,32,91,77,97,120,67,111,117,110,116,69,120,99,101,101,100,101,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof MaxCountExceededException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testAboveMaxCount",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12u68kd2g6t(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114293);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114294);final Incrementor i = new Incrementor();

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114295);i.setMaximalCount(3);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114296);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114297);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114298);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114299);i.incrementCount();
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test(expected=TooManyEvaluationsException.class)
    public void testAlternateException() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oupy8e2g70();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,108,116,101,114,110,97,116,101,69,120,99,101,112,116,105,111,110,58,32,91,84,111,111,77,97,110,121,69,118,97,108,117,97,116,105,111,110,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof TooManyEvaluationsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testAlternateException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oupy8e2g70(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114300);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114301);final Incrementor.MaxCountExceededCallback cb
            = new Incrementor.MaxCountExceededCallback() {
                    /** {@inheritDoc} */
                    public void trigger(int max) {try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114302);
                        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114303);throw new TooManyEvaluationsException(max);
                    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}
                };

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114304);final Incrementor i = new Incrementor(0, cb);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114305);i.incrementCount();
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testReset() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16jq2kc2g76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16jq2kc2g76(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114306);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114307);final Incrementor i = new Incrementor();

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114308);i.setMaximalCount(3);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114309);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114310);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114311);i.incrementCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114312);Assert.assertEquals(3, i.getCount());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114313);i.resetCount();
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114314);Assert.assertEquals(0, i.getCount());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}

    @Test
    public void testBulkIncrement() {__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceStart(getClass().getName(),114315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gqjv22g7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12g5r2g5rlb90pf3x.R.rethrow($CLV_t2$);}finally{__CLR4_4_12g5r2g5rlb90pf3x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.util.IncrementorTest.testBulkIncrement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),114315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gqjv22g7f(){try{__CLR4_4_12g5r2g5rlb90pf3x.R.inc(114315);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114316);final Incrementor i = new Incrementor();

        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114317);i.setMaximalCount(3);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114318);i.incrementCount(2);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114319);Assert.assertEquals(2, i.getCount());
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114320);i.incrementCount(1);
        __CLR4_4_12g5r2g5rlb90pf3x.R.inc(114321);Assert.assertEquals(3, i.getCount());
    }finally{__CLR4_4_12g5r2g5rlb90pf3x.R.flushNeeded();}}
}