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
package org.joda.time.field;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 *
 * @author Brian S O'Neill
 */
public class TestFieldUtils extends TestCase {static class __CLR4_4_1175p175plc8azx3w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271031490L,8589935092L,56101,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) {try{__CLR4_4_1175p175plc8azx3w.R.inc(55933);
        __CLR4_4_1175p175plc8azx3w.R.inc(55934);junit.textui.TestRunner.run(suite());
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    public static TestSuite suite() {try{__CLR4_4_1175p175plc8azx3w.R.inc(55935);
        __CLR4_4_1175p175plc8azx3w.R.inc(55936);return new TestSuite(TestFieldUtils.class);
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    public TestFieldUtils(String name) {
        super(name);__CLR4_4_1175p175plc8azx3w.R.inc(55938);try{__CLR4_4_1175p175plc8azx3w.R.inc(55937);
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    public void testSafeAddInt() {__CLR4_4_1175p175plc8azx3w.R.globalSliceStart(getClass().getName(),55939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z10t64175v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1175p175plc8azx3w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1175p175plc8azx3w.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z10t64175v(){try{__CLR4_4_1175p175plc8azx3w.R.inc(55939);
        __CLR4_4_1175p175plc8azx3w.R.inc(55940);assertEquals(0, FieldUtils.safeAdd(0, 0));

        __CLR4_4_1175p175plc8azx3w.R.inc(55941);assertEquals(5, FieldUtils.safeAdd(2, 3));
        __CLR4_4_1175p175plc8azx3w.R.inc(55942);assertEquals(-1, FieldUtils.safeAdd(2, -3));
        __CLR4_4_1175p175plc8azx3w.R.inc(55943);assertEquals(1, FieldUtils.safeAdd(-2, 3));
        __CLR4_4_1175p175plc8azx3w.R.inc(55944);assertEquals(-5, FieldUtils.safeAdd(-2, -3));

        __CLR4_4_1175p175plc8azx3w.R.inc(55945);assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1));
        __CLR4_4_1175p175plc8azx3w.R.inc(55946);assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1));

        __CLR4_4_1175p175plc8azx3w.R.inc(55947);assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE));
        __CLR4_4_1175p175plc8azx3w.R.inc(55948);assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE));

        __CLR4_4_1175p175plc8azx3w.R.inc(55949);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55950);FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
            __CLR4_4_1175p175plc8azx3w.R.inc(55951);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55952);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55953);FieldUtils.safeAdd(Integer.MAX_VALUE, 100);
            __CLR4_4_1175p175plc8azx3w.R.inc(55954);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55955);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55956);FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(55957);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55958);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55959);FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
            __CLR4_4_1175p175plc8azx3w.R.inc(55960);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55961);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55962);FieldUtils.safeAdd(Integer.MIN_VALUE, -100);
            __CLR4_4_1175p175plc8azx3w.R.inc(55963);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55964);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55965);FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(55966);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    public void testSafeAddLong() {__CLR4_4_1175p175plc8azx3w.R.globalSliceStart(getClass().getName(),55967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqfzet176n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1175p175plc8azx3w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1175p175plc8azx3w.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeAddLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqfzet176n(){try{__CLR4_4_1175p175plc8azx3w.R.inc(55967);
        __CLR4_4_1175p175plc8azx3w.R.inc(55968);assertEquals(0L, FieldUtils.safeAdd(0L, 0L));

        __CLR4_4_1175p175plc8azx3w.R.inc(55969);assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(55970);assertEquals(-1L, FieldUtils.safeAdd(2L, -3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(55971);assertEquals(1L, FieldUtils.safeAdd(-2L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(55972);assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L));

        __CLR4_4_1175p175plc8azx3w.R.inc(55973);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(55974);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L));

        __CLR4_4_1175p175plc8azx3w.R.inc(55975);assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE));
        __CLR4_4_1175p175plc8azx3w.R.inc(55976);assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE));

        __CLR4_4_1175p175plc8azx3w.R.inc(55977);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55978);FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
            __CLR4_4_1175p175plc8azx3w.R.inc(55979);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55980);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55981);FieldUtils.safeAdd(Long.MAX_VALUE, 100L);
            __CLR4_4_1175p175plc8azx3w.R.inc(55982);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55983);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55984);FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(55985);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55986);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55987);FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
            __CLR4_4_1175p175plc8azx3w.R.inc(55988);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55989);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55990);FieldUtils.safeAdd(Long.MIN_VALUE, -100L);
            __CLR4_4_1175p175plc8azx3w.R.inc(55991);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(55992);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(55993);FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(55994);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    public void testSafeSubtractLong() {__CLR4_4_1175p175plc8azx3w.R.globalSliceStart(getClass().getName(),55995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hu6o6u177f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1175p175plc8azx3w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1175p175plc8azx3w.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeSubtractLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),55995,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hu6o6u177f(){try{__CLR4_4_1175p175plc8azx3w.R.inc(55995);
        __CLR4_4_1175p175plc8azx3w.R.inc(55996);assertEquals(0L, FieldUtils.safeSubtract(0L, 0L));

        __CLR4_4_1175p175plc8azx3w.R.inc(55997);assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(55998);assertEquals(5L, FieldUtils.safeSubtract(2L, -3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(55999);assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56000);assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L));

        __CLR4_4_1175p175plc8azx3w.R.inc(56001);assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56002);assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L));

        __CLR4_4_1175p175plc8azx3w.R.inc(56003);assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE));
        __CLR4_4_1175p175plc8azx3w.R.inc(56004);assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE));

        __CLR4_4_1175p175plc8azx3w.R.inc(56005);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56006);FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56007);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(56008);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56009);FieldUtils.safeSubtract(Long.MIN_VALUE, 100L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56010);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(56011);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56012);FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56013);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(56014);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56015);FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56016);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(56017);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56018);FieldUtils.safeSubtract(Long.MAX_VALUE, -100L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56019);fail();
        } catch (ArithmeticException e) {
        }

        __CLR4_4_1175p175plc8azx3w.R.inc(56020);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56021);FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56022);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSafeMultiplyLongLong() {__CLR4_4_1175p175plc8azx3w.R.globalSliceStart(getClass().getName(),56023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yrl6xq1787();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1175p175plc8azx3w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1175p175plc8azx3w.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yrl6xq1787(){try{__CLR4_4_1175p175plc8azx3w.R.inc(56023);
        __CLR4_4_1175p175plc8azx3w.R.inc(56024);assertEquals(0L, FieldUtils.safeMultiply(0L, 0L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56025);assertEquals(1L, FieldUtils.safeMultiply(1L, 1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56026);assertEquals(3L, FieldUtils.safeMultiply(1L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56027);assertEquals(3L, FieldUtils.safeMultiply(3L, 1L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56028);assertEquals(6L, FieldUtils.safeMultiply(2L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56029);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56030);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56031);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56032);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56033);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56034);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56035);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56036);FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56037);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56038);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56039);FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56040);fail();
        } catch (ArithmeticException e) {
        }
      
        __CLR4_4_1175p175plc8azx3w.R.inc(56041);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56042);FieldUtils.safeMultiply(Long.MIN_VALUE, 100L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56043);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56044);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56045);FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56046);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56047);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56048);FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56049);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSafeMultiplyLongInt() {__CLR4_4_1175p175plc8azx3w.R.globalSliceStart(getClass().getName(),56050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysa0a1178y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1175p175plc8azx3w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1175p175plc8azx3w.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeMultiplyLongInt",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysa0a1178y(){try{__CLR4_4_1175p175plc8azx3w.R.inc(56050);
        __CLR4_4_1175p175plc8azx3w.R.inc(56051);assertEquals(0L, FieldUtils.safeMultiply(0L, 0));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56052);assertEquals(1L, FieldUtils.safeMultiply(1L, 1));
        __CLR4_4_1175p175plc8azx3w.R.inc(56053);assertEquals(3L, FieldUtils.safeMultiply(1L, 3));
        __CLR4_4_1175p175plc8azx3w.R.inc(56054);assertEquals(3L, FieldUtils.safeMultiply(3L, 1));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56055);assertEquals(6L, FieldUtils.safeMultiply(2L, 3));
        __CLR4_4_1175p175plc8azx3w.R.inc(56056);assertEquals(-6L, FieldUtils.safeMultiply(2L, -3));
        __CLR4_4_1175p175plc8azx3w.R.inc(56057);assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3));
        __CLR4_4_1175p175plc8azx3w.R.inc(56058);assertEquals(6L, FieldUtils.safeMultiply(-2L, -3));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56059);assertEquals(-1L * Integer.MIN_VALUE, FieldUtils.safeMultiply(-1L, Integer.MIN_VALUE));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56060);assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1));
        __CLR4_4_1175p175plc8azx3w.R.inc(56061);assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1));
        __CLR4_4_1175p175plc8azx3w.R.inc(56062);assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56063);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56064);FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
            __CLR4_4_1175p175plc8azx3w.R.inc(56065);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56066);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56067);FieldUtils.safeMultiply(Long.MIN_VALUE, 100);
            __CLR4_4_1175p175plc8azx3w.R.inc(56068);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56069);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56070);FieldUtils.safeMultiply(Long.MIN_VALUE, Integer.MAX_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56071);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56072);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56073);FieldUtils.safeMultiply(Long.MAX_VALUE, Integer.MIN_VALUE);
            __CLR4_4_1175p175plc8azx3w.R.inc(56074);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    public void testSafeDivideLongLong() {__CLR4_4_1175p175plc8azx3w.R.globalSliceStart(getClass().getName(),56075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bc77yv179n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1175p175plc8azx3w.R.rethrow($CLV_t2$);}finally{__CLR4_4_1175p175plc8azx3w.R.globalSliceEnd(getClass().getName(),"org.joda.time.field.TestFieldUtils.testSafeDivideLongLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),56075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bc77yv179n(){try{__CLR4_4_1175p175plc8azx3w.R.inc(56075);
        __CLR4_4_1175p175plc8azx3w.R.inc(56076);assertEquals(1L, FieldUtils.safeDivide(1L, 1L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56077);assertEquals(1L, FieldUtils.safeDivide(3L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56078);assertEquals(0L, FieldUtils.safeDivide(1L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56079);assertEquals(3L, FieldUtils.safeDivide(3L, 1L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56080);assertEquals(1L, FieldUtils.safeDivide(5L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56081);assertEquals(-1L, FieldUtils.safeDivide(5L, -3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56082);assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56083);assertEquals(1L, FieldUtils.safeDivide(-5L, -3L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56084);assertEquals(2L, FieldUtils.safeDivide(6L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56085);assertEquals(-2L, FieldUtils.safeDivide(6L, -3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56086);assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56087);assertEquals(2L, FieldUtils.safeDivide(-6L, -3L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56088);assertEquals(2L, FieldUtils.safeDivide(7L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56089);assertEquals(-2L, FieldUtils.safeDivide(7L, -3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56090);assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56091);assertEquals(2L, FieldUtils.safeDivide(-7L, -3L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56092);assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56093);assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L));
        __CLR4_4_1175p175plc8azx3w.R.inc(56094);assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L));
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56095);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56096);FieldUtils.safeDivide(Long.MIN_VALUE, -1L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56097);fail();
        } catch (ArithmeticException e) {
        }
        
        __CLR4_4_1175p175plc8azx3w.R.inc(56098);try {
            __CLR4_4_1175p175plc8azx3w.R.inc(56099);FieldUtils.safeDivide(1L, 0L);
            __CLR4_4_1175p175plc8azx3w.R.inc(56100);fail();
        } catch (ArithmeticException e) {
        }
    }finally{__CLR4_4_1175p175plc8azx3w.R.flushNeeded();}}

}
