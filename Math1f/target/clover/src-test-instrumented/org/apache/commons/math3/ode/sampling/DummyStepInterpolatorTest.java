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

package org.apache.commons.math3.ode.sampling;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class DummyStepInterpolatorTest {static class __CLR4_4_120og20oglb90pdo8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,94257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testNoReset() throws MaxCountExceededException {__CLR4_4_120og20oglb90pdo8.R.globalSliceStart(getClass().getName(),94192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1enq0v720og();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120og20oglb90pdo8.R.rethrow($CLV_t2$);}finally{__CLR4_4_120og20oglb90pdo8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest.testNoReset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1enq0v720og() throws MaxCountExceededException{try{__CLR4_4_120og20oglb90pdo8.R.inc(94192);

    __CLR4_4_120og20oglb90pdo8.R.inc(94193);double[]   y    =   { 0.0, 1.0, -2.0 };
    __CLR4_4_120og20oglb90pdo8.R.inc(94194);DummyStepInterpolator interpolator = new DummyStepInterpolator(y, new double[y.length], true);
    __CLR4_4_120og20oglb90pdo8.R.inc(94195);interpolator.storeTime(0);
    __CLR4_4_120og20oglb90pdo8.R.inc(94196);interpolator.shift();
    __CLR4_4_120og20oglb90pdo8.R.inc(94197);interpolator.storeTime(1);

    __CLR4_4_120og20oglb90pdo8.R.inc(94198);double[] result = interpolator.getInterpolatedState();
    __CLR4_4_120og20oglb90pdo8.R.inc(94199);for (int i = 0; (((i < result.length)&&(__CLR4_4_120og20oglb90pdo8.R.iget(94200)!=0|true))||(__CLR4_4_120og20oglb90pdo8.R.iget(94201)==0&false)); ++i) {{
      __CLR4_4_120og20oglb90pdo8.R.inc(94202);Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10);
    }

  }}finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}

  @Test
  public void testFixedState() throws MaxCountExceededException {__CLR4_4_120og20oglb90pdo8.R.globalSliceStart(getClass().getName(),94203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1397ok620or();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120og20oglb90pdo8.R.rethrow($CLV_t2$);}finally{__CLR4_4_120og20oglb90pdo8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest.testFixedState",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1397ok620or() throws MaxCountExceededException{try{__CLR4_4_120og20oglb90pdo8.R.inc(94203);

    __CLR4_4_120og20oglb90pdo8.R.inc(94204);double[]   y    =   { 1.0, 3.0, -4.0 };
    __CLR4_4_120og20oglb90pdo8.R.inc(94205);DummyStepInterpolator interpolator = new DummyStepInterpolator(y, new double[y.length], true);
    __CLR4_4_120og20oglb90pdo8.R.inc(94206);interpolator.storeTime(0);
    __CLR4_4_120og20oglb90pdo8.R.inc(94207);interpolator.shift();
    __CLR4_4_120og20oglb90pdo8.R.inc(94208);interpolator.storeTime(1);

    __CLR4_4_120og20oglb90pdo8.R.inc(94209);interpolator.setInterpolatedTime(0.1);
    __CLR4_4_120og20oglb90pdo8.R.inc(94210);double[] result = interpolator.getInterpolatedState();
    __CLR4_4_120og20oglb90pdo8.R.inc(94211);for (int i = 0; (((i < result.length)&&(__CLR4_4_120og20oglb90pdo8.R.iget(94212)!=0|true))||(__CLR4_4_120og20oglb90pdo8.R.iget(94213)==0&false)); ++i) {{
        __CLR4_4_120og20oglb90pdo8.R.inc(94214);Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10);
    }

    }__CLR4_4_120og20oglb90pdo8.R.inc(94215);interpolator.setInterpolatedTime(0.5);
    __CLR4_4_120og20oglb90pdo8.R.inc(94216);result = interpolator.getInterpolatedState();
    __CLR4_4_120og20oglb90pdo8.R.inc(94217);for (int i = 0; (((i < result.length)&&(__CLR4_4_120og20oglb90pdo8.R.iget(94218)!=0|true))||(__CLR4_4_120og20oglb90pdo8.R.iget(94219)==0&false)); ++i) {{
        __CLR4_4_120og20oglb90pdo8.R.inc(94220);Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10);
    }

  }}finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}

  @Test
  public void testSerialization()
  throws IOException, ClassNotFoundException, MaxCountExceededException {__CLR4_4_120og20oglb90pdo8.R.globalSliceStart(getClass().getName(),94221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on920p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120og20oglb90pdo8.R.rethrow($CLV_t2$);}finally{__CLR4_4_120og20oglb90pdo8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on920p9() throws IOException, ClassNotFoundException, MaxCountExceededException{try{__CLR4_4_120og20oglb90pdo8.R.inc(94221);

    __CLR4_4_120og20oglb90pdo8.R.inc(94222);double[]   y    =   { 0.0, 1.0, -2.0 };
    __CLR4_4_120og20oglb90pdo8.R.inc(94223);DummyStepInterpolator interpolator = new DummyStepInterpolator(y, new double[y.length], true);
    __CLR4_4_120og20oglb90pdo8.R.inc(94224);interpolator.storeTime(0);
    __CLR4_4_120og20oglb90pdo8.R.inc(94225);interpolator.shift();
    __CLR4_4_120og20oglb90pdo8.R.inc(94226);interpolator.storeTime(1);

    __CLR4_4_120og20oglb90pdo8.R.inc(94227);ByteArrayOutputStream bos = new ByteArrayOutputStream();
    __CLR4_4_120og20oglb90pdo8.R.inc(94228);ObjectOutputStream    oos = new ObjectOutputStream(bos);
    __CLR4_4_120og20oglb90pdo8.R.inc(94229);oos.writeObject(interpolator);

    __CLR4_4_120og20oglb90pdo8.R.inc(94230);Assert.assertTrue(bos.size () > 300);
    __CLR4_4_120og20oglb90pdo8.R.inc(94231);Assert.assertTrue(bos.size () < 500);

    __CLR4_4_120og20oglb90pdo8.R.inc(94232);ByteArrayInputStream  bis = new ByteArrayInputStream(bos.toByteArray());
    __CLR4_4_120og20oglb90pdo8.R.inc(94233);ObjectInputStream     ois = new ObjectInputStream(bis);
    __CLR4_4_120og20oglb90pdo8.R.inc(94234);DummyStepInterpolator dsi = (DummyStepInterpolator) ois.readObject();

    __CLR4_4_120og20oglb90pdo8.R.inc(94235);dsi.setInterpolatedTime(0.5);
    __CLR4_4_120og20oglb90pdo8.R.inc(94236);double[] result = dsi.getInterpolatedState();
    __CLR4_4_120og20oglb90pdo8.R.inc(94237);for (int i = 0; (((i < result.length)&&(__CLR4_4_120og20oglb90pdo8.R.iget(94238)!=0|true))||(__CLR4_4_120og20oglb90pdo8.R.iget(94239)==0&false)); ++i) {{
        __CLR4_4_120og20oglb90pdo8.R.inc(94240);Assert.assertTrue(FastMath.abs(result[i] - y[i]) < 1.0e-10);
    }

  }}finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}

  @Test
  public void testImpossibleSerialization()
  throws IOException {__CLR4_4_120og20oglb90pdo8.R.globalSliceStart(getClass().getName(),94241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pa8dxs20pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_120og20oglb90pdo8.R.rethrow($CLV_t2$);}finally{__CLR4_4_120og20oglb90pdo8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest.testImpossibleSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),94241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pa8dxs20pt() throws IOException{try{__CLR4_4_120og20oglb90pdo8.R.inc(94241);

    __CLR4_4_120og20oglb90pdo8.R.inc(94242);double[] y = { 0.0, 1.0, -2.0 };
    __CLR4_4_120og20oglb90pdo8.R.inc(94243);AbstractStepInterpolator interpolator = new BadStepInterpolator(y, true);
    __CLR4_4_120og20oglb90pdo8.R.inc(94244);interpolator.storeTime(0);
    __CLR4_4_120og20oglb90pdo8.R.inc(94245);interpolator.shift();
    __CLR4_4_120og20oglb90pdo8.R.inc(94246);interpolator.storeTime(1);

    __CLR4_4_120og20oglb90pdo8.R.inc(94247);ByteArrayOutputStream bos = new ByteArrayOutputStream();
    __CLR4_4_120og20oglb90pdo8.R.inc(94248);ObjectOutputStream    oos = new ObjectOutputStream(bos);
    __CLR4_4_120og20oglb90pdo8.R.inc(94249);try {
        __CLR4_4_120og20oglb90pdo8.R.inc(94250);oos.writeObject(interpolator);
        __CLR4_4_120og20oglb90pdo8.R.inc(94251);Assert.fail("an exception should have been thrown");
    } catch (LocalException le) {
        // expected behavior
    }
  }finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}

  private static class BadStepInterpolator extends DummyStepInterpolator {
      @SuppressWarnings("unused")
      public BadStepInterpolator() {try{__CLR4_4_120og20oglb90pdo8.R.inc(94252);
      }finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}
      public BadStepInterpolator(double[] y, boolean forward) {
          super(y, new double[y.length], forward);__CLR4_4_120og20oglb90pdo8.R.inc(94254);try{__CLR4_4_120og20oglb90pdo8.R.inc(94253);
      }finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}
      @Override
      protected void doFinalize() {try{__CLR4_4_120og20oglb90pdo8.R.inc(94255);
          __CLR4_4_120og20oglb90pdo8.R.inc(94256);throw new LocalException();
      }finally{__CLR4_4_120og20oglb90pdo8.R.flushNeeded();}}
  }

  private static class LocalException extends RuntimeException {
    private static final long serialVersionUID = 1L;
  }

}
