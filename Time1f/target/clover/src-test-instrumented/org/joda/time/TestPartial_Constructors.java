/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time;

import java.util.Arrays;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Constructors extends TestCase {static class __CLR4_4_1wxswxslc8azw2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,42886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {try{__CLR4_4_1wxswxslc8azw2y.R.inc(42688);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42689);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1wxswxslc8azw2y.R.inc(42690);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42691);return new TestSuite(TestPartial_Constructors.class);
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    public TestPartial_Constructors(String name) {
        super(name);__CLR4_4_1wxswxslc8azw2y.R.inc(42693);try{__CLR4_4_1wxswxslc8azw2y.R.inc(42692);
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    protected void setUp() throws Exception {try{__CLR4_4_1wxswxslc8azw2y.R.inc(42694);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42695);DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42696);zone = DateTimeZone.getDefault();
        __CLR4_4_1wxswxslc8azw2y.R.inc(42697);DateTimeZone.setDefault(LONDON);
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_4_1wxswxslc8azw2y.R.inc(42698);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42699);DateTimeUtils.setCurrentMillisSystem();
        __CLR4_4_1wxswxslc8azw2y.R.inc(42700);DateTimeZone.setDefault(zone);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42701);zone = null;
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    public void testConstructor() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8hwy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42702,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8hwy6() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42702);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42703);Partial test = new Partial();
        __CLR4_4_1wxswxslc8azw2y.R.inc(42704);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42705);assertEquals(0, test.size());
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    public void testConstructor_Chrono() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nhgl41wya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nhgl41wya() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42706);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42707);Partial test = new Partial((Chronology) null);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42708);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42709);assertEquals(0, test.size());
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42710);test = new Partial(GREGORIAN_PARIS);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42711);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42712);assertEquals(0, test.size());
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    public void testConstructor_Type_int() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y722o8wyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y722o8wyh() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42713);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42714);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42715);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42716);assertEquals(1, test.size());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42717);assertEquals(4, test.getValue(0));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42718);assertEquals(4, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42719);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx1_Type_int() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1775mhywyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_Type_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42720,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1775mhywyo() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42720);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42721);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42722);new Partial(null, 4);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42723);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42724);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx2_Type_int() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rmc61wyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx2_Type_int",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rmc61wyt() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42725);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42726);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42727);new Partial(DateTimeFieldType.dayOfYear(), 0);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42728);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    public void testConstructor_Type_int_Chrono() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3c7wowyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Type_int_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42729,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3c7wowyx() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42729);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42730);Partial test = new Partial(DateTimeFieldType.dayOfYear(), 4, GREGORIAN_PARIS);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42731);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42732);assertEquals(1, test.size());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42733);assertEquals(4, test.getValue(0));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42734);assertEquals(4, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42735);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx_Type_int_Chrono() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gdpqbpwz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Type_int_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gdpqbpwz4() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42736);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42737);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42738);new Partial(null, 4, ISO_UTC);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42739);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42740);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx2_Type_int_Chrono() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tyfacpwz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx2_Type_int_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tyfacpwz9() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42741);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42742);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42743);new Partial(DateTimeFieldType.dayOfYear(), 0, ISO_UTC);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42744);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    public void testConstructor_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ktke0wzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ktke0wzd() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42745);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42746);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfYear()
        };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42747);int[] values = new int[] {2005, 33};
        __CLR4_4_1wxswxslc8azw2y.R.inc(42748);Partial test = new Partial(types, values);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42749);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42750);assertEquals(2, test.size());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42751);assertEquals(2005, test.getValue(0));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42752);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42753);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42754);assertEquals(33, test.getValue(1));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42755);assertEquals(33, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42756);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42757);assertEquals(true, Arrays.equals(test.getFieldTypes(), types));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42758);assertEquals(true, Arrays.equals(test.getValues(), values));
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructor2_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyu7vqwzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor2_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42759,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyu7vqwzr() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42759);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42760);DateTimeFieldType[] types = new DateTimeFieldType[0];
        __CLR4_4_1wxswxslc8azw2y.R.inc(42761);int[] values = new int[0];
        __CLR4_4_1wxswxslc8azw2y.R.inc(42762);Partial test = new Partial(types, values);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42763);assertEquals(ISO_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42764);assertEquals(0, test.size());
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx1_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qakafuwzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx1_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42765,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qakafuwzx() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42765);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42766);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42767);new Partial((DateTimeFieldType[]) null, new int[] {1});
            __CLR4_4_1wxswxslc8azw2y.R.inc(42768);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42769);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx3_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13d9520x02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx3_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42770,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13d9520x02() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42770);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42771);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42772);new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfYear()}, null);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42773);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42774);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx5_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jk20bux07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx5_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jk20bux07() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42775);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42776);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42777);new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfYear()}, new int[2]);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42778);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42779);assertMessageContains(ex, "same length");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx6_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v0pl0rx0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx6_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42780,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v0pl0rx0c() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42780);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42781);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42782);new Partial(new DateTimeFieldType[] {null, DateTimeFieldType.dayOfYear()}, new int[2]);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42783);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42784);assertMessageContains(ex, "contain null");
        }
        __CLR4_4_1wxswxslc8azw2y.R.inc(42785);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42786);new Partial(new DateTimeFieldType[] {DateTimeFieldType.dayOfYear(), null}, new int[2]);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42787);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42788);assertMessageContains(ex, "contain null");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx7_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjqw9gx0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx7_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjqw9gx0l() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42789);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42790);int[] values = new int[] {1, 1, 1};
        __CLR4_4_1wxswxslc8azw2y.R.inc(42791);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(), DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42792);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42793);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42794);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42795);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42796);types = new DateTimeFieldType[] {
            DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.monthOfYear() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42797);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42798);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42799);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42800);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42801);types = new DateTimeFieldType[] {
            DateTimeFieldType.year(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42802);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42803);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42804);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42805);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42806);types = new DateTimeFieldType[] {
            DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.era() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42807);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42808);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42809);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42810);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42811);types = new DateTimeFieldType[] {
            DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfYear() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42812);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42813);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42814);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42815);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42816);types = new DateTimeFieldType[] {
            DateTimeFieldType.yearOfEra(), DateTimeFieldType.year(), DateTimeFieldType.dayOfYear() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42817);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42818);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42819);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42820);assertMessageContains(ex, "must be in order", "largest-smallest");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx8_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h33bkjx1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx8_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h33bkjx1h() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42821);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42822);int[] values = new int[] {1, 1, 1};
        __CLR4_4_1wxswxslc8azw2y.R.inc(42823);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.era(), DateTimeFieldType.year(), DateTimeFieldType.year() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42824);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42825);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42826);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42827);assertMessageContains(ex, "must not", "duplicate");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42828);types = new DateTimeFieldType[] {
            DateTimeFieldType.era(), DateTimeFieldType.era(), DateTimeFieldType.monthOfYear() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42829);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42830);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42831);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42832);assertMessageContains(ex, "must not", "duplicate");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42833);types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42834);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42835);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42836);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42837);assertMessageContains(ex, "must not", "duplicate");
        }
        
        __CLR4_4_1wxswxslc8azw2y.R.inc(42838);types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(), DateTimeFieldType.clockhourOfDay(), DateTimeFieldType.hourOfDay() };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42839);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42840);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42841);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42842);assertMessageContains(ex, "must not", "duplicate");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx9_TypeArray_intArray() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15mfqvmx23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx9_TypeArray_intArray",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15mfqvmx23() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42843);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42844);int[] values = new int[] {3, 0};
        __CLR4_4_1wxswxslc8azw2y.R.inc(42845);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek()};
        __CLR4_4_1wxswxslc8azw2y.R.inc(42846);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42847);new Partial(types, values);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42848);fail();
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    public void testConstructor_TypeArray_intArray_Chrono() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k6limgx29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_TypeArray_intArray_Chrono",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k6limgx29() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42849);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42850);DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfYear()
        };
        __CLR4_4_1wxswxslc8azw2y.R.inc(42851);int[] values = new int[] {2005, 33};
        __CLR4_4_1wxswxslc8azw2y.R.inc(42852);Partial test = new Partial(types, values, GREGORIAN_PARIS);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42853);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42854);assertEquals(2, test.size());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42855);assertEquals(2005, test.getValue(0));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42856);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42857);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42858);assertEquals(33, test.getValue(1));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42859);assertEquals(33, test.get(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42860);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42861);assertEquals(true, Arrays.equals(test.getFieldTypes(), types));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42862);assertEquals(true, Arrays.equals(test.getValues(), values));
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test constructor
     */
    @SuppressWarnings("deprecation")
    public void testConstructor_Partial() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a4d1ypx2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructor_Partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a4d1ypx2n() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42863);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42864);YearMonthDay ymd = new YearMonthDay(2005, 6, 25, GREGORIAN_PARIS);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42865);Partial test = new Partial(ymd);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42866);assertEquals(GREGORIAN_UTC, test.getChronology());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42867);assertEquals(3, test.size());
        __CLR4_4_1wxswxslc8azw2y.R.inc(42868);assertEquals(2005, test.getValue(0));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42869);assertEquals(2005, test.get(DateTimeFieldType.year()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42870);assertEquals(true, test.isSupported(DateTimeFieldType.year()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42871);assertEquals(6, test.getValue(1));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42872);assertEquals(6, test.get(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42873);assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42874);assertEquals(25, test.getValue(2));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42875);assertEquals(25, test.get(DateTimeFieldType.dayOfMonth()));
        __CLR4_4_1wxswxslc8azw2y.R.inc(42876);assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth()));
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Test constructor
     */
    public void testConstructorEx_Partial() throws Throwable {__CLR4_4_1wxswxslc8azw2y.R.globalSliceStart(getClass().getName(),42877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sx26ckx31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wxswxslc8azw2y.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wxswxslc8azw2y.R.globalSliceEnd(getClass().getName(),"org.joda.time.TestPartial_Constructors.testConstructorEx_Partial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42877,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sx26ckx31() throws Throwable{try{__CLR4_4_1wxswxslc8azw2y.R.inc(42877);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42878);try {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42879);new Partial((ReadablePartial) null);
            __CLR4_4_1wxswxslc8azw2y.R.inc(42880);fail();
        } catch (IllegalArgumentException ex) {
            __CLR4_4_1wxswxslc8azw2y.R.inc(42881);assertMessageContains(ex, "must not be null");
        }
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str  the string to check
     */
    private void assertMessageContains(Exception ex, String str) {try{__CLR4_4_1wxswxslc8azw2y.R.inc(42882);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42883);assertEquals(ex.getMessage() + ": " + str, true, ex.getMessage().indexOf(str) >= 0);
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

    /**
     * Checks if the exception message is valid.
     * 
     * @param ex  the exception to check
     * @param str1  the string to check
     * @param str2  the string to check
     */
    private void assertMessageContains(Exception ex, String str1, String str2) {try{__CLR4_4_1wxswxslc8azw2y.R.inc(42884);
        __CLR4_4_1wxswxslc8azw2y.R.inc(42885);assertEquals(ex.getMessage() + ": " + str1 + "/" + str2, true,
            ex.getMessage().indexOf(str1) >= 0 &&
            ex.getMessage().indexOf(str2) >= 0 &&
            ex.getMessage().indexOf(str1) < ex.getMessage().indexOf(str2));
    }finally{__CLR4_4_1wxswxslc8azw2y.R.flushNeeded();}}

}
