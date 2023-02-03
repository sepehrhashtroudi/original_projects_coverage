/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.functional;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import junit.framework.TestCase;

import com.google.gson.Gson;

/**
 * Tests for ensuring Gson thread-safety.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ConcurrencyTest extends TestCase {static class __CLR4_4_14nd4ndlck0y90t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14nd4ndlck0y90t.R.inc(6025);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6026);super.setUp();
    __CLR4_4_14nd4ndlck0y90t.R.inc(6027);gson = new Gson();
  }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
  public void testSingleThreadSerialization() {__CLR4_4_14nd4ndlck0y90t.R.globalSliceStart(getClass().getName(),6028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wwhc0d4ng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nd4ndlck0y90t.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nd4ndlck0y90t.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ConcurrencyTest.testSingleThreadSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wwhc0d4ng(){try{__CLR4_4_14nd4ndlck0y90t.R.inc(6028); 
    __CLR4_4_14nd4ndlck0y90t.R.inc(6029);MyObject myObj = new MyObject(); 
    __CLR4_4_14nd4ndlck0y90t.R.inc(6030);for (int i = 0; (((i < 10)&&(__CLR4_4_14nd4ndlck0y90t.R.iget(6031)!=0|true))||(__CLR4_4_14nd4ndlck0y90t.R.iget(6032)==0&false)); i++) {{ 
      __CLR4_4_14nd4ndlck0y90t.R.inc(6033);gson.toJson(myObj); 
    } 
  }}finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}} 

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
  public void testSingleThreadDeserialization() {__CLR4_4_14nd4ndlck0y90t.R.globalSliceStart(getClass().getName(),6034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d8h13i4nm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nd4ndlck0y90t.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nd4ndlck0y90t.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ConcurrencyTest.testSingleThreadDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d8h13i4nm(){try{__CLR4_4_14nd4ndlck0y90t.R.inc(6034); 
    __CLR4_4_14nd4ndlck0y90t.R.inc(6035);for (int i = 0; (((i < 10)&&(__CLR4_4_14nd4ndlck0y90t.R.iget(6036)!=0|true))||(__CLR4_4_14nd4ndlck0y90t.R.iget(6037)==0&false)); i++) {{ 
      __CLR4_4_14nd4ndlck0y90t.R.inc(6038);gson.fromJson("{'a':'hello','b':'world','i':1}", MyObject.class); 
    } 
  }}finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}} 

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
  public void testMultiThreadSerialization() throws InterruptedException {__CLR4_4_14nd4ndlck0y90t.R.globalSliceStart(getClass().getName(),6039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne6gbq4nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nd4ndlck0y90t.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nd4ndlck0y90t.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ConcurrencyTest.testMultiThreadSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne6gbq4nr() throws InterruptedException{try{__CLR4_4_14nd4ndlck0y90t.R.inc(6039);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6040);final CountDownLatch startLatch = new CountDownLatch(1);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6041);final CountDownLatch finishedLatch = new CountDownLatch(10);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6042);final AtomicBoolean failed = new AtomicBoolean(false);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6043);ExecutorService executor = Executors.newFixedThreadPool(10);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6044);for (int taskCount = 0; (((taskCount < 10)&&(__CLR4_4_14nd4ndlck0y90t.R.iget(6045)!=0|true))||(__CLR4_4_14nd4ndlck0y90t.R.iget(6046)==0&false)); taskCount++) {{
      __CLR4_4_14nd4ndlck0y90t.R.inc(6047);executor.execute(new Runnable() {
        public void run() {try{__CLR4_4_14nd4ndlck0y90t.R.inc(6048);
          __CLR4_4_14nd4ndlck0y90t.R.inc(6049);MyObject myObj = new MyObject();
          __CLR4_4_14nd4ndlck0y90t.R.inc(6050);try {
            __CLR4_4_14nd4ndlck0y90t.R.inc(6051);startLatch.await();
            __CLR4_4_14nd4ndlck0y90t.R.inc(6052);for (int i = 0; (((i < 10)&&(__CLR4_4_14nd4ndlck0y90t.R.iget(6053)!=0|true))||(__CLR4_4_14nd4ndlck0y90t.R.iget(6054)==0&false)); i++) {{
              __CLR4_4_14nd4ndlck0y90t.R.inc(6055);gson.toJson(myObj);
            }
          }} catch (Throwable t) {
            __CLR4_4_14nd4ndlck0y90t.R.inc(6056);failed.set(true);
          } finally {
            __CLR4_4_14nd4ndlck0y90t.R.inc(6057);finishedLatch.countDown();
          }
        }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}
      });
    }
    }__CLR4_4_14nd4ndlck0y90t.R.inc(6058);startLatch.countDown();
    __CLR4_4_14nd4ndlck0y90t.R.inc(6059);finishedLatch.await();
    __CLR4_4_14nd4ndlck0y90t.R.inc(6060);assertFalse(failed.get());
  }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
  public void testMultiThreadDeserialization() throws InterruptedException {__CLR4_4_14nd4ndlck0y90t.R.globalSliceStart(getClass().getName(),6061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtsm914od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nd4ndlck0y90t.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nd4ndlck0y90t.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.ConcurrencyTest.testMultiThreadDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtsm914od() throws InterruptedException{try{__CLR4_4_14nd4ndlck0y90t.R.inc(6061);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6062);final CountDownLatch startLatch = new CountDownLatch(1);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6063);final CountDownLatch finishedLatch = new CountDownLatch(10);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6064);final AtomicBoolean failed = new AtomicBoolean(false);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6065);ExecutorService executor = Executors.newFixedThreadPool(10);
    __CLR4_4_14nd4ndlck0y90t.R.inc(6066);for (int taskCount = 0; (((taskCount < 10)&&(__CLR4_4_14nd4ndlck0y90t.R.iget(6067)!=0|true))||(__CLR4_4_14nd4ndlck0y90t.R.iget(6068)==0&false)); taskCount++) {{
      __CLR4_4_14nd4ndlck0y90t.R.inc(6069);executor.execute(new Runnable() {
        public void run() {try{__CLR4_4_14nd4ndlck0y90t.R.inc(6070);
          __CLR4_4_14nd4ndlck0y90t.R.inc(6071);try {
            __CLR4_4_14nd4ndlck0y90t.R.inc(6072);startLatch.await();
            __CLR4_4_14nd4ndlck0y90t.R.inc(6073);for (int i = 0; (((i < 10)&&(__CLR4_4_14nd4ndlck0y90t.R.iget(6074)!=0|true))||(__CLR4_4_14nd4ndlck0y90t.R.iget(6075)==0&false)); i++) {{
              __CLR4_4_14nd4ndlck0y90t.R.inc(6076);gson.fromJson("{'a':'hello','b':'world','i':1}", MyObject.class); 
            }
          }} catch (Throwable t) {
            __CLR4_4_14nd4ndlck0y90t.R.inc(6077);failed.set(true);
          } finally {
            __CLR4_4_14nd4ndlck0y90t.R.inc(6078);finishedLatch.countDown();
          }
        }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}
      });
    }
    }__CLR4_4_14nd4ndlck0y90t.R.inc(6079);startLatch.countDown();
    __CLR4_4_14nd4ndlck0y90t.R.inc(6080);finishedLatch.await();
    __CLR4_4_14nd4ndlck0y90t.R.inc(6081);assertFalse(failed.get());
  }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}
  
  @SuppressWarnings("unused")
  private static class MyObject {
    String a;
    String b;
    int i;

    MyObject() {
      this("hello", "world", 42);__CLR4_4_14nd4ndlck0y90t.R.inc(6083);try{__CLR4_4_14nd4ndlck0y90t.R.inc(6082);
    }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}

    public MyObject(String a, String b, int i) {try{__CLR4_4_14nd4ndlck0y90t.R.inc(6084);
      __CLR4_4_14nd4ndlck0y90t.R.inc(6085);this.a = a;
      __CLR4_4_14nd4ndlck0y90t.R.inc(6086);this.b = b;
      __CLR4_4_14nd4ndlck0y90t.R.inc(6087);this.i = i;
    }finally{__CLR4_4_14nd4ndlck0y90t.R.flushNeeded();}}
  }
}
