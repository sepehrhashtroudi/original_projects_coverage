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
package org.apache.commons.math3.exception.util;

import java.util.Locale;
import java.util.Arrays;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link ExceptionContext}.
 * 
 * @version $Id$
 */
public class ExceptionContextTest {static class __CLR4_4_11ks91ks9lb90pcgx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testMessageChain() {__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceStart(getClass().getName(),73593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_117ietp1ks9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ks91ks9lb90pcgx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.ExceptionContextTest.testMessageChain",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_117ietp1ks9(){try{__CLR4_4_11ks91ks9lb90pcgx.R.inc(73593);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73594);final ExceptionContext c = new ExceptionContext(new Exception("oops"));
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73595);final String sep = " | "; // Non-default separator.
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73596);final String m1 = "column index (0)";
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73597);c.addMessage(LocalizedFormats.COLUMN_INDEX, 0);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73598);final String m2 = "got 1x2 but expected 3x4";
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73599);c.addMessage(LocalizedFormats.DIMENSIONS_MISMATCH_2x2, 1, 2, 3, 4);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73600);final String m3 = "It didn't work out";
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73601);c.addMessage(LocalizedFormats.SIMPLE_MESSAGE, m3);

        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73602);Assert.assertEquals(c.getMessage(Locale.US, sep),
                            m1 + sep + m2 + sep + m3);
    }finally{__CLR4_4_11ks91ks9lb90pcgx.R.flushNeeded();}}

    @Test
    public void testNoArgAddMessage() {__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceStart(getClass().getName(),73603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doi70w1ksj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ks91ks9lb90pcgx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.ExceptionContextTest.testNoArgAddMessage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doi70w1ksj(){try{__CLR4_4_11ks91ks9lb90pcgx.R.inc(73603);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73604);final ExceptionContext c = new ExceptionContext(new Exception("hello"));
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73605);c.addMessage(LocalizedFormats.SIMPLE_MESSAGE);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73606);Assert.assertEquals(c.getMessage(), "{0}");
    }finally{__CLR4_4_11ks91ks9lb90pcgx.R.flushNeeded();}}

    @Test
    public void testContext() {__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceStart(getClass().getName(),73607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t5rb181ksn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ks91ks9lb90pcgx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.ExceptionContextTest.testContext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t5rb181ksn(){try{__CLR4_4_11ks91ks9lb90pcgx.R.inc(73607);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73608);final ExceptionContext c = new ExceptionContext(new Exception("bye"));

        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73609);final String[] keys = {"Key 1", "Key 2"};
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73610);final Object[] values = {"Value 1", Integer.valueOf(2)};

        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73611);for (int i = 0; (((i < keys.length)&&(__CLR4_4_11ks91ks9lb90pcgx.R.iget(73612)!=0|true))||(__CLR4_4_11ks91ks9lb90pcgx.R.iget(73613)==0&false)); i++) {{
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73614);c.setValue(keys[i], values[i]);
        }

        // Check that all keys are present.
        }__CLR4_4_11ks91ks9lb90pcgx.R.inc(73615);Assert.assertTrue(c.getKeys().containsAll(Arrays.asList(keys)));

        // Check that all values are correctly stored.
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73616);for (int i = 0; (((i < keys.length)&&(__CLR4_4_11ks91ks9lb90pcgx.R.iget(73617)!=0|true))||(__CLR4_4_11ks91ks9lb90pcgx.R.iget(73618)==0&false)); i++) {{
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73619);Assert.assertEquals(values[i], c.getValue(keys[i]));
        }

        // Check behaviour on missing key.
        }__CLR4_4_11ks91ks9lb90pcgx.R.inc(73620);Assert.assertNull(c.getValue("xyz"));
    }finally{__CLR4_4_11ks91ks9lb90pcgx.R.flushNeeded();}}

    @Test
    public void testSerialize()
        throws IOException,
               ClassNotFoundException {__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceStart(getClass().getName(),73621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wt9p851kt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ks91ks9lb90pcgx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.ExceptionContextTest.testSerialize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wt9p851kt1() throws IOException, ClassNotFoundException{try{__CLR4_4_11ks91ks9lb90pcgx.R.inc(73621);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73622);final ExceptionContext cOut = new ExceptionContext(new Exception("Apache"));
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73623);cOut.addMessage(LocalizedFormats.COLUMN_INDEX, 0);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73624);cOut.setValue("Key 1", Integer.valueOf(0));

        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73625);ByteArrayOutputStream bos = new ByteArrayOutputStream();
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73626);ObjectOutputStream oos = new ObjectOutputStream(bos);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73627);oos.writeObject(cOut);

        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73628);ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73629);ObjectInputStream ois = new ObjectInputStream(bis);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73630);ExceptionContext cIn = (ExceptionContext) ois.readObject();

        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73631);Assert.assertTrue(cOut.getMessage().equals(cIn.getMessage()));
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73632);for (String key : cIn.getKeys()) {{
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73633);Assert.assertTrue(cOut.getValue(key).equals(cIn.getValue(key)));
        }
    }}finally{__CLR4_4_11ks91ks9lb90pcgx.R.flushNeeded();}}

    @Test
    public void testSerializeUnserializable() throws Exception {__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceStart(getClass().getName(),73634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs86s31kte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ks91ks9lb90pcgx.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ks91ks9lb90pcgx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.ExceptionContextTest.testSerializeUnserializable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs86s31kte() throws Exception{try{__CLR4_4_11ks91ks9lb90pcgx.R.inc(73634);
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73635);final ExceptionContext cOut = new ExceptionContext(new Exception("Apache Commons Math"));
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73636);cOut.addMessage(LocalizedFormats.SIMPLE_MESSAGE, "OK");
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73637);cOut.addMessage(LocalizedFormats.SIMPLE_MESSAGE, new Unserializable());
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73638);String key = "Key 1";
        __CLR4_4_11ks91ks9lb90pcgx.R.inc(73639);cOut.setValue(key, new Unserializable());

        {
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73640);ByteArrayOutputStream bos = new ByteArrayOutputStream();
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73641);ObjectOutputStream oos = new ObjectOutputStream(bos);
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73642);oos.writeObject(cOut);

            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73643);ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73644);ObjectInputStream ois = new ObjectInputStream(bis);
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73645);ExceptionContext cIn = (ExceptionContext) ois.readObject();

            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73646);String nsObjStr = (String) cIn.getValue(key);
            __CLR4_4_11ks91ks9lb90pcgx.R.inc(73647);Assert.assertTrue(nsObjStr.matches(".*could not be serialized.*"));
        }
    }finally{__CLR4_4_11ks91ks9lb90pcgx.R.flushNeeded();}}

    /**
     * Class used by {@link #testSerializeUnserializable()}.
     */
    private static class Unserializable {
        Unserializable() {try{__CLR4_4_11ks91ks9lb90pcgx.R.inc(73648);}finally{__CLR4_4_11ks91ks9lb90pcgx.R.flushNeeded();}}
    }
}
