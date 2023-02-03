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

package org.apache.commons.math3.ode;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.exception.NoBracketingException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;


public class FirstOrderConverterTest {static class __CLR4_4_11ya71ya7lb90pdhk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,91130,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test
  public void testDoubleDimension() {__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceStart(getClass().getName(),91087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ffl7cm1ya7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ya71ya7lb90pdhk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.FirstOrderConverterTest.testDoubleDimension",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ffl7cm1ya7(){try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91087);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91088);for (int i = 1; (((i < 10)&&(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91089)!=0|true))||(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91090)==0&false)); ++i) {{
      __CLR4_4_11ya71ya7lb90pdhk.R.inc(91091);SecondOrderDifferentialEquations eqn2 = new Equations(i, 0.2);
      __CLR4_4_11ya71ya7lb90pdhk.R.inc(91092);FirstOrderConverter eqn1 = new FirstOrderConverter(eqn2);
      __CLR4_4_11ya71ya7lb90pdhk.R.inc(91093);Assert.assertTrue(eqn1.getDimension() == (2 * eqn2.getDimension()));
    }
  }}finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

  @Test
  public void testDecreasingSteps()
      throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException {__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceStart(getClass().getName(),91094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_186llun1yae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ya71ya7lb90pdhk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.FirstOrderConverterTest.testDecreasingSteps",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_186llun1yae() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91094);

    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91095);double previousError = Double.NaN;
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91096);for (int i = 0; (((i < 10)&&(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91097)!=0|true))||(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91098)==0&false)); ++i) {{

      __CLR4_4_11ya71ya7lb90pdhk.R.inc(91099);double step  = FastMath.pow(2.0, -(i + 1));
      __CLR4_4_11ya71ya7lb90pdhk.R.inc(91100);double error = integrateWithSpecifiedStep(4.0, 0.0, 1.0, step)
                   - FastMath.sin(4.0);
      __CLR4_4_11ya71ya7lb90pdhk.R.inc(91101);if ((((i > 0)&&(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91102)!=0|true))||(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91103)==0&false))) {{
        __CLR4_4_11ya71ya7lb90pdhk.R.inc(91104);Assert.assertTrue(FastMath.abs(error) < FastMath.abs(previousError));
      }
      }__CLR4_4_11ya71ya7lb90pdhk.R.inc(91105);previousError = error;

    }
  }}finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

  @Test
  public void testSmallStep()
      throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException {__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceStart(getClass().getName(),91106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bahza01yaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ya71ya7lb90pdhk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.FirstOrderConverterTest.testSmallStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bahza01yaq() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91106);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91107);double error = integrateWithSpecifiedStep(4.0, 0.0, 1.0, 1.0e-4)
                   - FastMath.sin(4.0);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91108);Assert.assertTrue(FastMath.abs(error) < 1.0e-10);
  }finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

  @Test
  public void testBigStep()
      throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException {__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceStart(getClass().getName(),91109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_160wohr1yat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ya71ya7lb90pdhk.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ya71ya7lb90pdhk.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.ode.FirstOrderConverterTest.testBigStep",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),91109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_160wohr1yat() throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException{try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91109);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91110);double error = integrateWithSpecifiedStep(4.0, 0.0, 1.0, 0.5)
                   - FastMath.sin(4.0);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91111);Assert.assertTrue(FastMath.abs(error) > 0.1);
  }finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

  private static class Equations
    implements SecondOrderDifferentialEquations {

     private int n;

      private double omega2;

      public Equations(int n, double omega) {try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91112);
        __CLR4_4_11ya71ya7lb90pdhk.R.inc(91113);this.n = n;
        __CLR4_4_11ya71ya7lb90pdhk.R.inc(91114);omega2 = omega * omega;
      }finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

      public int getDimension() {try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91115);
        __CLR4_4_11ya71ya7lb90pdhk.R.inc(91116);return n;
      }finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

      public void computeSecondDerivatives(double t, double[] y, double[] yDot,
                                           double[] yDDot) {try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91117);
        __CLR4_4_11ya71ya7lb90pdhk.R.inc(91118);for (int i = 0; (((i < n)&&(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91119)!=0|true))||(__CLR4_4_11ya71ya7lb90pdhk.R.iget(91120)==0&false)); ++i) {{
          __CLR4_4_11ya71ya7lb90pdhk.R.inc(91121);yDDot[i] = -omega2 * y[i];
        }
    }}finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

  }

  private double integrateWithSpecifiedStep(double omega,
                                            double t0, double t,
                                            double step) throws DimensionMismatchException, NumberIsTooSmallException, MaxCountExceededException, NoBracketingException {try{__CLR4_4_11ya71ya7lb90pdhk.R.inc(91122);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91123);double[] y0 = new double[2];
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91124);y0[0] = FastMath.sin(omega * t0);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91125);y0[1] = omega * FastMath.cos(omega * t0);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91126);ClassicalRungeKuttaIntegrator i = new ClassicalRungeKuttaIntegrator(step);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91127);double[] y = new double[2];
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91128);i.integrate(new FirstOrderConverter(new Equations(1, omega)), t0, y0, t, y);
    __CLR4_4_11ya71ya7lb90pdhk.R.inc(91129);return y[0];
  }finally{__CLR4_4_11ya71ya7lb90pdhk.R.flushNeeded();}}

}
