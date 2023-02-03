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
package org.apache.commons.math3.transform;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.function.Sinc;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test case for fast cosine transformer.
 * <p>
 * FCT algorithm is exact, the small tolerance number is used only to account
 * for round-off errors.
 *
 * @version $Id$
 */
@RunWith(value = Parameterized.class)
public final class FastCosineTransformerTest
    extends RealTransformerAbstractTest {static class __CLR4_4_12da02da0lb90petj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,110660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private DctNormalization normalization;

    private final int[] invalidDataSize;

    private final double[] relativeTolerance;

    private final int[] validDataSize;

    public FastCosineTransformerTest(final DctNormalization normalization) {try{__CLR4_4_12da02da0lb90petj.R.inc(110520);
        __CLR4_4_12da02da0lb90petj.R.inc(110521);this.normalization = normalization;
        __CLR4_4_12da02da0lb90petj.R.inc(110522);this.validDataSize = new int[] {
            2, 3, 5, 9, 17, 33, 65, 129
        };
        __CLR4_4_12da02da0lb90petj.R.inc(110523);this.invalidDataSize = new int[] {
            128
        };
        __CLR4_4_12da02da0lb90petj.R.inc(110524);this.relativeTolerance = new double[] {
            1E-15, 1E-15, 1E-14, 1E-13, 1E-13, 1E-12, 1E-11, 1E-10
        };
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    /**
     * Returns an array containing {@code true, false} in order to check both
     * standard and orthogonal DCTs.
     *
     * @return an array of parameters for this parameterized test
     */
    @Parameters
    public static Collection<Object[]> data() {try{__CLR4_4_12da02da0lb90petj.R.inc(110525);
        __CLR4_4_12da02da0lb90petj.R.inc(110526);final DctNormalization[] normalization = DctNormalization.values();
        __CLR4_4_12da02da0lb90petj.R.inc(110527);final Object[][] data = new DctNormalization[normalization.length][1];
        __CLR4_4_12da02da0lb90petj.R.inc(110528);for (int i = 0; (((i < normalization.length)&&(__CLR4_4_12da02da0lb90petj.R.iget(110529)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110530)==0&false)); i++){{
            __CLR4_4_12da02da0lb90petj.R.inc(110531);data[i][0] = normalization[i];
        }
        }__CLR4_4_12da02da0lb90petj.R.inc(110532);return Arrays.asList(data);
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    RealTransformer createRealTransformer() {try{__CLR4_4_12da02da0lb90petj.R.inc(110533);
        __CLR4_4_12da02da0lb90petj.R.inc(110534);return new FastCosineTransformer(normalization);
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    int getInvalidDataSize(final int i) {try{__CLR4_4_12da02da0lb90petj.R.inc(110535);
        __CLR4_4_12da02da0lb90petj.R.inc(110536);return invalidDataSize[i];
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    int getNumberOfInvalidDataSizes() {try{__CLR4_4_12da02da0lb90petj.R.inc(110537);
        __CLR4_4_12da02da0lb90petj.R.inc(110538);return invalidDataSize.length;
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    int getNumberOfValidDataSizes() {try{__CLR4_4_12da02da0lb90petj.R.inc(110539);
        __CLR4_4_12da02da0lb90petj.R.inc(110540);return validDataSize.length;
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    double getRelativeTolerance(final int i) {try{__CLR4_4_12da02da0lb90petj.R.inc(110541);
        __CLR4_4_12da02da0lb90petj.R.inc(110542);return relativeTolerance[i];
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    int getValidDataSize(final int i) {try{__CLR4_4_12da02da0lb90petj.R.inc(110543);
        __CLR4_4_12da02da0lb90petj.R.inc(110544);return validDataSize[i];
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    UnivariateFunction getValidFunction() {try{__CLR4_4_12da02da0lb90petj.R.inc(110545);
        __CLR4_4_12da02da0lb90petj.R.inc(110546);return new Sinc();
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    double getValidLowerBound() {try{__CLR4_4_12da02da0lb90petj.R.inc(110547);
        __CLR4_4_12da02da0lb90petj.R.inc(110548);return 0.0;
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    double getValidUpperBound() {try{__CLR4_4_12da02da0lb90petj.R.inc(110549);
        __CLR4_4_12da02da0lb90petj.R.inc(110550);return FastMath.PI;
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    @Override
    double[] transform(final double[] x, final TransformType type) {try{__CLR4_4_12da02da0lb90petj.R.inc(110551);
        __CLR4_4_12da02da0lb90petj.R.inc(110552);final int n = x.length;
        __CLR4_4_12da02da0lb90petj.R.inc(110553);final double[] y = new double[n];
        __CLR4_4_12da02da0lb90petj.R.inc(110554);final double[] cos = new double[2 * (n - 1)];
        __CLR4_4_12da02da0lb90petj.R.inc(110555);for (int i = 0; (((i < cos.length)&&(__CLR4_4_12da02da0lb90petj.R.iget(110556)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110557)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110558);cos[i] = FastMath.cos(FastMath.PI * i / (n - 1.0));
        }
        }__CLR4_4_12da02da0lb90petj.R.inc(110559);int sgn = 1;
        __CLR4_4_12da02da0lb90petj.R.inc(110560);for (int j = 0; (((j < n)&&(__CLR4_4_12da02da0lb90petj.R.iget(110561)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110562)==0&false)); j++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110563);double yj = 0.5 * (x[0] + sgn * x[n - 1]);
            __CLR4_4_12da02da0lb90petj.R.inc(110564);for (int i = 1; (((i < n - 1)&&(__CLR4_4_12da02da0lb90petj.R.iget(110565)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110566)==0&false)); i++) {{
                __CLR4_4_12da02da0lb90petj.R.inc(110567);yj += x[i] * cos[(i * j) % cos.length];
            }
            }__CLR4_4_12da02da0lb90petj.R.inc(110568);y[j] = yj;
            __CLR4_4_12da02da0lb90petj.R.inc(110569);sgn *= -1;
        }
        }__CLR4_4_12da02da0lb90petj.R.inc(110570);final double s;
        __CLR4_4_12da02da0lb90petj.R.inc(110571);if ((((type == TransformType.FORWARD)&&(__CLR4_4_12da02da0lb90petj.R.iget(110572)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110573)==0&false))) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110574);if ((((normalization == DctNormalization.STANDARD_DCT_I)&&(__CLR4_4_12da02da0lb90petj.R.iget(110575)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110576)==0&false))) {{
                __CLR4_4_12da02da0lb90petj.R.inc(110577);s = 1.0;
            } }else {__CLR4_4_12da02da0lb90petj.R.inc(110578);if ((((normalization == DctNormalization.ORTHOGONAL_DCT_I)&&(__CLR4_4_12da02da0lb90petj.R.iget(110579)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110580)==0&false))) {{
                __CLR4_4_12da02da0lb90petj.R.inc(110581);s = FastMath.sqrt(2.0 / (n - 1.0));
            } }else {{
                __CLR4_4_12da02da0lb90petj.R.inc(110582);throw new MathIllegalStateException();
            }
        }}} }else {__CLR4_4_12da02da0lb90petj.R.inc(110583);if ((((type == TransformType.INVERSE)&&(__CLR4_4_12da02da0lb90petj.R.iget(110584)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110585)==0&false))) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110586);if ((((normalization == DctNormalization.STANDARD_DCT_I)&&(__CLR4_4_12da02da0lb90petj.R.iget(110587)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110588)==0&false))) {{
                __CLR4_4_12da02da0lb90petj.R.inc(110589);s = 2.0 / (n - 1.0);
            } }else {__CLR4_4_12da02da0lb90petj.R.inc(110590);if ((((normalization == DctNormalization.ORTHOGONAL_DCT_I)&&(__CLR4_4_12da02da0lb90petj.R.iget(110591)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110592)==0&false))) {{
                __CLR4_4_12da02da0lb90petj.R.inc(110593);s = FastMath.sqrt(2.0 / (n - 1.0));
            } }else {{
                __CLR4_4_12da02da0lb90petj.R.inc(110594);throw new MathIllegalStateException();
            }
        }}} }else {{
            /*
             * Should never occur. This clause is a safeguard in case other
             * types are used to TransformType (which should not be done).
             */
            __CLR4_4_12da02da0lb90petj.R.inc(110595);throw new MathIllegalStateException();
        }
        }}__CLR4_4_12da02da0lb90petj.R.inc(110596);TransformUtils.scaleArray(y, s);
        __CLR4_4_12da02da0lb90petj.R.inc(110597);return y;
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    /*
     * Additional tests.
     */

    /** Test of transformer for the ad hoc data. */
    @Test
    public void testAdHocData() {__CLR4_4_12da02da0lb90petj.R.globalSliceStart(getClass().getName(),110598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vz0c882dc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12da02da0lb90petj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12da02da0lb90petj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastCosineTransformerTest.testAdHocData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vz0c882dc6(){try{__CLR4_4_12da02da0lb90petj.R.inc(110598);
        __CLR4_4_12da02da0lb90petj.R.inc(110599);FastCosineTransformer transformer;
        __CLR4_4_12da02da0lb90petj.R.inc(110600);transformer = new FastCosineTransformer(DctNormalization.STANDARD_DCT_I);
        __CLR4_4_12da02da0lb90petj.R.inc(110601);double result[], tolerance = 1E-12;

        __CLR4_4_12da02da0lb90petj.R.inc(110602);double x[] = {
            0.0, 1.0, 4.0, 9.0, 16.0, 25.0, 36.0, 49.0, 64.0
        };
        __CLR4_4_12da02da0lb90petj.R.inc(110603);double y[] =
            {
                172.0, -105.096569476353, 27.3137084989848, -12.9593152353742,
                8.0, -5.78585076868676, 4.68629150101524, -4.15826451958632,
                4.0
            };

        __CLR4_4_12da02da0lb90petj.R.inc(110604);result = transformer.transform(x, TransformType.FORWARD);
        __CLR4_4_12da02da0lb90petj.R.inc(110605);for (int i = 0; (((i < result.length)&&(__CLR4_4_12da02da0lb90petj.R.iget(110606)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110607)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110608);Assert.assertEquals(y[i], result[i], tolerance);
        }

        }__CLR4_4_12da02da0lb90petj.R.inc(110609);result = transformer.transform(y, TransformType.INVERSE);
        __CLR4_4_12da02da0lb90petj.R.inc(110610);for (int i = 0; (((i < result.length)&&(__CLR4_4_12da02da0lb90petj.R.iget(110611)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110612)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110613);Assert.assertEquals(x[i], result[i], tolerance);
        }

        }__CLR4_4_12da02da0lb90petj.R.inc(110614);TransformUtils.scaleArray(x, FastMath.sqrt(0.5 * (x.length - 1)));

        __CLR4_4_12da02da0lb90petj.R.inc(110615);transformer = new FastCosineTransformer(DctNormalization.ORTHOGONAL_DCT_I);
        __CLR4_4_12da02da0lb90petj.R.inc(110616);result = transformer.transform(y, TransformType.FORWARD);
        __CLR4_4_12da02da0lb90petj.R.inc(110617);for (int i = 0; (((i < result.length)&&(__CLR4_4_12da02da0lb90petj.R.iget(110618)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110619)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110620);Assert.assertEquals(x[i], result[i], tolerance);
        }

        }__CLR4_4_12da02da0lb90petj.R.inc(110621);result = transformer.transform(x, TransformType.INVERSE);
        __CLR4_4_12da02da0lb90petj.R.inc(110622);for (int i = 0; (((i < result.length)&&(__CLR4_4_12da02da0lb90petj.R.iget(110623)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110624)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110625);Assert.assertEquals(y[i], result[i], tolerance);
        }
    }}finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    /** Test of parameters for the transformer. */
    @Test
    public void testParameters()
        throws Exception {__CLR4_4_12da02da0lb90petj.R.globalSliceStart(getClass().getName(),110626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv2dcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12da02da0lb90petj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12da02da0lb90petj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastCosineTransformerTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110626,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv2dcy() throws Exception{try{__CLR4_4_12da02da0lb90petj.R.inc(110626);
        __CLR4_4_12da02da0lb90petj.R.inc(110627);UnivariateFunction f = new Sin();
        __CLR4_4_12da02da0lb90petj.R.inc(110628);FastCosineTransformer transformer;
        __CLR4_4_12da02da0lb90petj.R.inc(110629);transformer = new FastCosineTransformer(DctNormalization.STANDARD_DCT_I);

        __CLR4_4_12da02da0lb90petj.R.inc(110630);try {
            // bad interval
            __CLR4_4_12da02da0lb90petj.R.inc(110631);transformer.transform(f, 1, -1, 65, TransformType.FORWARD);
            __CLR4_4_12da02da0lb90petj.R.inc(110632);Assert.fail("Expecting IllegalArgumentException - bad interval");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12da02da0lb90petj.R.inc(110633);try {
            // bad samples number
            __CLR4_4_12da02da0lb90petj.R.inc(110634);transformer.transform(f, -1, 1, 1, TransformType.FORWARD);
            __CLR4_4_12da02da0lb90petj.R.inc(110635);Assert
                .fail("Expecting IllegalArgumentException - bad samples number");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12da02da0lb90petj.R.inc(110636);try {
            // bad samples number
            __CLR4_4_12da02da0lb90petj.R.inc(110637);transformer.transform(f, -1, 1, 64, TransformType.FORWARD);
            __CLR4_4_12da02da0lb90petj.R.inc(110638);Assert
                .fail("Expecting IllegalArgumentException - bad samples number");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}

    /** Test of transformer for the sine function. */
    @Test
    public void testSinFunction() {__CLR4_4_12da02da0lb90petj.R.globalSliceStart(getClass().getName(),110639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh72ddb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12da02da0lb90petj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12da02da0lb90petj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastCosineTransformerTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),110639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh72ddb(){try{__CLR4_4_12da02da0lb90petj.R.inc(110639);
        __CLR4_4_12da02da0lb90petj.R.inc(110640);UnivariateFunction f = new Sin();
        __CLR4_4_12da02da0lb90petj.R.inc(110641);FastCosineTransformer transformer;
        __CLR4_4_12da02da0lb90petj.R.inc(110642);transformer = new FastCosineTransformer(DctNormalization.STANDARD_DCT_I);
        __CLR4_4_12da02da0lb90petj.R.inc(110643);double min, max, result[], tolerance = 1E-12;
        __CLR4_4_12da02da0lb90petj.R.inc(110644);int N = 9;

        __CLR4_4_12da02da0lb90petj.R.inc(110645);double expected[] =
            {
                0.0, 3.26197262739567, 0.0, -2.17958042710327, 0.0,
                -0.648846697642915, 0.0, -0.433545502649478, 0.0
            };
        __CLR4_4_12da02da0lb90petj.R.inc(110646);min = 0.0;
        __CLR4_4_12da02da0lb90petj.R.inc(110647);max = 2.0 * FastMath.PI * N / (N - 1);
        __CLR4_4_12da02da0lb90petj.R.inc(110648);result = transformer.transform(f, min, max, N, TransformType.FORWARD);
        __CLR4_4_12da02da0lb90petj.R.inc(110649);for (int i = 0; (((i < N)&&(__CLR4_4_12da02da0lb90petj.R.iget(110650)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110651)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110652);Assert.assertEquals(expected[i], result[i], tolerance);
        }

        }__CLR4_4_12da02da0lb90petj.R.inc(110653);min = -FastMath.PI;
        __CLR4_4_12da02da0lb90petj.R.inc(110654);max = FastMath.PI * (N + 1) / (N - 1);
        __CLR4_4_12da02da0lb90petj.R.inc(110655);result = transformer.transform(f, min, max, N, TransformType.FORWARD);
        __CLR4_4_12da02da0lb90petj.R.inc(110656);for (int i = 0; (((i < N)&&(__CLR4_4_12da02da0lb90petj.R.iget(110657)!=0|true))||(__CLR4_4_12da02da0lb90petj.R.iget(110658)==0&false)); i++) {{
            __CLR4_4_12da02da0lb90petj.R.inc(110659);Assert.assertEquals(-expected[i], result[i], tolerance);
        }
    }}finally{__CLR4_4_12da02da0lb90petj.R.flushNeeded();}}
}
