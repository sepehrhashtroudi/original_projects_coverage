/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.ReadWritableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;

/**
 * This class is a JUnit test for ConverterSet.
 * Mostly for coverage.
 *
 * @author Stephen Colebourne
 */
public class TestConverterSet extends TestCase {static class __CLR4_4_1165j165jlc8azwya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,54724,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final Converter c1 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54631);__CLR4_4_1165j165jlc8azwya.R.inc(54632);return Boolean.class;}finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}
    };
    private static final Converter c2 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54633);__CLR4_4_1165j165jlc8azwya.R.inc(54634);return Character.class;}finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}
    };
    private static final Converter c3 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54635);__CLR4_4_1165j165jlc8azwya.R.inc(54636);return Byte.class;}finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}
    };
    private static final Converter c4 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54637);__CLR4_4_1165j165jlc8azwya.R.inc(54638);return Short.class;}finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}
    };
    private static final Converter c4a = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54639);__CLR4_4_1165j165jlc8azwya.R.inc(54640);return Short.class;}finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}
    };
    private static final Converter c5 = new Converter() {
        public Class getSupportedType() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54641);__CLR4_4_1165j165jlc8azwya.R.inc(54642);return Integer.class;}finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}
    };
    
    public static void main(String[] args) {try{__CLR4_4_1165j165jlc8azwya.R.inc(54643);
        __CLR4_4_1165j165jlc8azwya.R.inc(54644);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1165j165jlc8azwya.R.inc(54645);
        __CLR4_4_1165j165jlc8azwya.R.inc(54646);return new TestSuite(TestConverterSet.class);
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    public TestConverterSet(String name) {
        super(name);__CLR4_4_1165j165jlc8azwya.R.inc(54648);try{__CLR4_4_1165j165jlc8azwya.R.inc(54647);
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testClass() throws Exception {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11x2ulv1661();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11x2ulv1661() throws Exception{try{__CLR4_4_1165j165jlc8azwya.R.inc(54649);
        __CLR4_4_1165j165jlc8azwya.R.inc(54650);Class cls = ConverterSet.class;
        __CLR4_4_1165j165jlc8azwya.R.inc(54651);assertEquals(false, Modifier.isPublic(cls.getModifiers()));
        __CLR4_4_1165j165jlc8azwya.R.inc(54652);assertEquals(false, Modifier.isProtected(cls.getModifiers()));
        __CLR4_4_1165j165jlc8azwya.R.inc(54653);assertEquals(false, Modifier.isPrivate(cls.getModifiers()));
        
        __CLR4_4_1165j165jlc8azwya.R.inc(54654);assertEquals(1, cls.getDeclaredConstructors().length);
        __CLR4_4_1165j165jlc8azwya.R.inc(54655);Constructor con = cls.getDeclaredConstructors()[0];
        __CLR4_4_1165j165jlc8azwya.R.inc(54656);assertEquals(false, Modifier.isPublic(con.getModifiers()));
        __CLR4_4_1165j165jlc8azwya.R.inc(54657);assertEquals(false, Modifier.isProtected(con.getModifiers()));
        __CLR4_4_1165j165jlc8azwya.R.inc(54658);assertEquals(false, Modifier.isPrivate(con.getModifiers()));
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testBigHashtable() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12syz2x166b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testBigHashtable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12syz2x166b(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54659);
        __CLR4_4_1165j165jlc8azwya.R.inc(54660);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54661);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54662);set.select(Boolean.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54663);set.select(Character.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54664);set.select(Byte.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54665);set.select(Short.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54666);set.select(Integer.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54667);set.select(Long.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54668);set.select(Float.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54669);set.select(Double.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54670);set.select(null);
        __CLR4_4_1165j165jlc8azwya.R.inc(54671);set.select(Calendar.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54672);set.select(GregorianCalendar.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54673);set.select(DateTime.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54674);set.select(DateMidnight.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54675);set.select(ReadableInstant.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54676);set.select(ReadableDateTime.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54677);set.select(ReadWritableInstant.class);  // 16
        __CLR4_4_1165j165jlc8azwya.R.inc(54678);set.select(ReadWritableDateTime.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54679);set.select(DateTime.class);
        __CLR4_4_1165j165jlc8azwya.R.inc(54680);assertEquals(4, set.size());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testAddNullRemoved1() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178ww5u166x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178ww5u166x(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54681);
        __CLR4_4_1165j165jlc8azwya.R.inc(54682);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54683);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54684);ConverterSet result = set.add(c5, null);
        __CLR4_4_1165j165jlc8azwya.R.inc(54685);assertEquals(4, set.size());
        __CLR4_4_1165j165jlc8azwya.R.inc(54686);assertEquals(5, result.size());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    public void testAddNullRemoved2() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13zwxdd1673();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54687,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13zwxdd1673(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54687);
        __CLR4_4_1165j165jlc8azwya.R.inc(54688);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54689);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54690);ConverterSet result = set.add(c4, null);
        __CLR4_4_1165j165jlc8azwya.R.inc(54691);assertSame(set, result);
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    public void testAddNullRemoved3() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwykw1678();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testAddNullRemoved3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwykw1678(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54692);
        __CLR4_4_1165j165jlc8azwya.R.inc(54693);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54694);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54695);ConverterSet result = set.add(c4a, null);
        __CLR4_4_1165j165jlc8azwya.R.inc(54696);assertTrue(set != result);
        __CLR4_4_1165j165jlc8azwya.R.inc(54697);assertEquals(4, set.size());
        __CLR4_4_1165j165jlc8azwya.R.inc(54698);assertEquals(4, result.size());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemoveNullRemoved1() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wdhr1n167f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveNullRemoved1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wdhr1n167f(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54699);
        __CLR4_4_1165j165jlc8azwya.R.inc(54700);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54701);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54702);ConverterSet result = set.remove(c3, null);
        __CLR4_4_1165j165jlc8azwya.R.inc(54703);assertEquals(4, set.size());
        __CLR4_4_1165j165jlc8azwya.R.inc(54704);assertEquals(3, result.size());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    public void testRemoveNullRemoved2() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4hs96167l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveNullRemoved2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4hs96167l(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54705);
        __CLR4_4_1165j165jlc8azwya.R.inc(54706);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54707);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54708);ConverterSet result = set.remove(c5, null);
        __CLR4_4_1165j165jlc8azwya.R.inc(54709);assertSame(set, result);
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testRemoveBadIndex1() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lb7lv9167q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveBadIndex1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54710,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lb7lv9167q(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54710);
        __CLR4_4_1165j165jlc8azwya.R.inc(54711);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54712);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54713);try {
            __CLR4_4_1165j165jlc8azwya.R.inc(54714);set.remove(200, null);
            __CLR4_4_1165j165jlc8azwya.R.inc(54715);fail();
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1165j165jlc8azwya.R.inc(54716);assertEquals(4, set.size());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

    public void testRemoveBadIndex2() {__CLR4_4_1165j165jlc8azwya.R.globalSliceStart(getClass().getName(),54717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ok7knq167x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1165j165jlc8azwya.R.rethrow($CLV_t2$);}finally{__CLR4_4_1165j165jlc8azwya.R.globalSliceEnd(getClass().getName(),"org.joda.time.convert.TestConverterSet.testRemoveBadIndex2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),54717,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ok7knq167x(){try{__CLR4_4_1165j165jlc8azwya.R.inc(54717);
        __CLR4_4_1165j165jlc8azwya.R.inc(54718);Converter[] array = new Converter[] {
            c1, c2, c3, c4,
        };
        __CLR4_4_1165j165jlc8azwya.R.inc(54719);ConverterSet set = new ConverterSet(array);
        __CLR4_4_1165j165jlc8azwya.R.inc(54720);try {
            __CLR4_4_1165j165jlc8azwya.R.inc(54721);set.remove(-1, null);
            __CLR4_4_1165j165jlc8azwya.R.inc(54722);fail();
        } catch (IndexOutOfBoundsException ex) {}
        __CLR4_4_1165j165jlc8azwya.R.inc(54723);assertEquals(4, set.size());
    }finally{__CLR4_4_1165j165jlc8azwya.R.flushNeeded();}}

}
