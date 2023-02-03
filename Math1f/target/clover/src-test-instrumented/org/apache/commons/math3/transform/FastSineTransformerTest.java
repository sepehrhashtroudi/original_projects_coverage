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
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test case for fast sine transformer.
 * <p>
 * FST algorithm is exact, the small tolerance number is used only
 * to account for round-off errors.
 *
 * @version $Id$
 */
@RunWith(value = Parameterized.class)
public final class FastSineTransformerTest extends RealTransformerAbstractTest {static class __CLR4_4_12dqw2dqwlb90peuj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();

    private final DstNormalization normalization;

    private final int[] invalidDataSize;

    private final double[] relativeTolerance;

    private final int[] validDataSize;

    public FastSineTransformerTest(final DstNormalization normalization) {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111128);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111129);this.normalization = normalization;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111130);this.validDataSize = new int[] {
            1, 2, 4, 8, 16, 32, 64, 128
        };
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111131);this.invalidDataSize = new int[] {
            129
        };
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111132);this.relativeTolerance = new double[] {
            1E-15, 1E-15, 1E-14, 1E-14, 1E-13, 1E-12, 1E-11, 1E-11
        };
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    /**
     * Returns an array containing {@code true, false} in order to check both
     * standard and orthogonal DSTs.
     *
     * @return an array of parameters for this parameterized test
     */
    @Parameters
    public static Collection<Object[]> data() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111133);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111134);final DstNormalization[] normalization = DstNormalization.values();
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111135);final Object[][] data = new DstNormalization[normalization.length][1];
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111136);for (int i = 0; (((i < normalization.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111137)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111138)==0&false)); i++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111139);data[i][0] = normalization[i];
        }
        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111140);return Arrays.asList(data);
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     *
     * Overriding the default implementation allows to ensure that the first
     * element of the data set is zero.
     */
    @Override
    double[] createRealData(final int n) {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111141);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111142);final double[] data = super.createRealData(n);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111143);data[0] = 0.0;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111144);return data;
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    RealTransformer createRealTransformer() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111145);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111146);return new FastSineTransformer(normalization);
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    int getInvalidDataSize(final int i) {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111147);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111148);return invalidDataSize[i];
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    int getNumberOfInvalidDataSizes() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111149);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111150);return invalidDataSize.length;
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    int getNumberOfValidDataSizes() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111151);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111152);return validDataSize.length;
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    double getRelativeTolerance(final int i) {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111153);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111154);return relativeTolerance[i];
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    int getValidDataSize(final int i) {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111155);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111156);return validDataSize[i];
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    UnivariateFunction getValidFunction() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111157);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111158);return new Sinc();
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    double getValidLowerBound() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111159);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111160);return 0.0;
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    double getValidUpperBound() {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111161);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111162);return FastMath.PI;
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    @Override
    double[] transform(final double[] x, final TransformType type) {try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111163);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111164);final int n = x.length;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111165);final double[] y = new double[n];
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111166);final double[] sin = new double[2 * n];
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111167);for (int i = 0; (((i < sin.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111168)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111169)==0&false)); i++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111170);sin[i] = FastMath.sin(FastMath.PI * i / n);
        }
        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111171);for (int j = 0; (((j < n)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111172)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111173)==0&false)); j++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111174);double yj = 0.0;
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111175);for (int i = 0; (((i < n)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111176)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111177)==0&false)); i++) {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111178);yj += x[i] * sin[(i * j) % sin.length];
            }
            }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111179);y[j] = yj;
        }
        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111180);final double s;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111181);if ((((type == TransformType.FORWARD)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111182)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111183)==0&false))) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111184);if ((((normalization == DstNormalization.STANDARD_DST_I)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111185)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111186)==0&false))) {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111187);s = 1.0;
            } }else {__CLR4_4_12dqw2dqwlb90peuj.R.inc(111188);if ((((normalization == DstNormalization.ORTHOGONAL_DST_I)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111189)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111190)==0&false))) {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111191);s = FastMath.sqrt(2.0 / n);
            } }else {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111192);throw new MathIllegalStateException();
            }
        }}} }else {__CLR4_4_12dqw2dqwlb90peuj.R.inc(111193);if ((((type == TransformType.INVERSE)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111194)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111195)==0&false))) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111196);if ((((normalization == DstNormalization.STANDARD_DST_I)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111197)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111198)==0&false))) {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111199);s = 2.0 / n;
            } }else {__CLR4_4_12dqw2dqwlb90peuj.R.inc(111200);if ((((normalization == DstNormalization.ORTHOGONAL_DST_I)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111201)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111202)==0&false))) {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111203);s = FastMath.sqrt(2.0 / n);
            } }else {{
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111204);throw new MathIllegalStateException();
            }
        }}} }else {{
            /*
             * Should never occur. This clause is a safeguard in case other
             * types are used to TransformType (which should not be done).
             */
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111205);throw new MathIllegalStateException();
        }
        }}__CLR4_4_12dqw2dqwlb90peuj.R.inc(111206);TransformUtils.scaleArray(y, s);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111207);return y;
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    /*
     * Additional tests.
     */
    @Test
    public void testTransformRealFirstElementNotZero() {__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceStart(getClass().getName(),111208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xaj2la2dt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dqw2dqwlb90peuj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastSineTransformerTest.testTransformRealFirstElementNotZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xaj2la2dt4(){try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111208);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111209);final TransformType[] type = TransformType.values();
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111210);final double[] data = new double[] {
            1.0, 1.0, 1.0, 1.0
        };
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111211);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111212);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111213)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111214)==0&false)); j++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111215);try {
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111216);transformer.transform(data, type[j]);
                __CLR4_4_12dqw2dqwlb90peuj.R.inc(111217);Assert.fail(type[j].toString());
            } catch (MathIllegalArgumentException e) {
                // Expected: do nothing
            }
        }
    }}finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    /*
     * Additional (legacy) tests.
     */

    /**
     * Test of transformer for the ad hoc data.
     */
    @Test
    public void testAdHocData() {__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceStart(getClass().getName(),111218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vz0c882dte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dqw2dqwlb90peuj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastSineTransformerTest.testAdHocData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vz0c882dte(){try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111218);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111219);FastSineTransformer transformer;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111220);transformer = new FastSineTransformer(DstNormalization.STANDARD_DST_I);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111221);double result[], tolerance = 1E-12;

        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111222);double x[] = { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0 };
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111223);double y[] = { 0.0, 20.1093579685034, -9.65685424949238,
                       5.98642305066196, -4.0, 2.67271455167720,
                      -1.65685424949238, 0.795649469518633 };

        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111224);result = transformer.transform(x, TransformType.FORWARD);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111225);for (int i = 0; (((i < result.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111226)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111227)==0&false)); i++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111228);Assert.assertEquals(y[i], result[i], tolerance);
        }

        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111229);result = transformer.transform(y, TransformType.INVERSE);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111230);for (int i = 0; (((i < result.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111231)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111232)==0&false)); i++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111233);Assert.assertEquals(x[i], result[i], tolerance);
        }

        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111234);TransformUtils.scaleArray(x, FastMath.sqrt(x.length / 2.0));
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111235);transformer = new FastSineTransformer(DstNormalization.ORTHOGONAL_DST_I);

        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111236);result = transformer.transform(y, TransformType.FORWARD);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111237);for (int i = 0; (((i < result.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111238)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111239)==0&false)); i++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111240);Assert.assertEquals(x[i], result[i], tolerance);
        }

        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111241);result = transformer.transform(x, TransformType.INVERSE);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111242);for (int i = 0; (((i < result.length)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111243)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111244)==0&false)); i++) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111245);Assert.assertEquals(y[i], result[i], tolerance);
        }
    }}finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    /**
     * Test of transformer for the sine function.
     */
    @Test
    public void testSinFunction() {__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceStart(getClass().getName(),111246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1doerh72du6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dqw2dqwlb90peuj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastSineTransformerTest.testSinFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1doerh72du6(){try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111246);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111247);UnivariateFunction f = new Sin();
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111248);FastSineTransformer transformer;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111249);transformer = new FastSineTransformer(DstNormalization.STANDARD_DST_I);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111250);double min, max, result[], tolerance = 1E-12; __CLR4_4_12dqw2dqwlb90peuj.R.inc(111251);int N = 1 << 8;

        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111252);min = 0.0; __CLR4_4_12dqw2dqwlb90peuj.R.inc(111253);max = 2.0 * FastMath.PI;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111254);result = transformer.transform(f, min, max, N, TransformType.FORWARD);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111255);Assert.assertEquals(N >> 1, result[2], tolerance);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111256);for (int i = 0; (((i < N)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111257)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111258)==0&false)); i += ((((i == 1 )&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111259)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111260)==0&false))? 2 : 1)) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111261);Assert.assertEquals(0.0, result[i], tolerance);
        }

        }__CLR4_4_12dqw2dqwlb90peuj.R.inc(111262);min = -FastMath.PI; __CLR4_4_12dqw2dqwlb90peuj.R.inc(111263);max = FastMath.PI;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111264);result = transformer.transform(f, min, max, N, TransformType.FORWARD);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111265);Assert.assertEquals(-(N >> 1), result[2], tolerance);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111266);for (int i = 0; (((i < N)&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111267)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111268)==0&false)); i += ((((i == 1 )&&(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111269)!=0|true))||(__CLR4_4_12dqw2dqwlb90peuj.R.iget(111270)==0&false))? 2 : 1)) {{
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111271);Assert.assertEquals(0.0, result[i], tolerance);
        }
    }}finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}

    /**
     * Test of parameters for the transformer.
     */
    @Test
    public void testParameters() throws Exception {__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceStart(getClass().getName(),111272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f58btv2duw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dqw2dqwlb90peuj.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dqw2dqwlb90peuj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.FastSineTransformerTest.testParameters",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f58btv2duw() throws Exception{try{__CLR4_4_12dqw2dqwlb90peuj.R.inc(111272);
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111273);UnivariateFunction f = new Sin();
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111274);FastSineTransformer transformer;
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111275);transformer = new FastSineTransformer(DstNormalization.STANDARD_DST_I);

        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111276);try {
            // bad interval
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111277);transformer.transform(f, 1, -1, 64, TransformType.FORWARD);
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111278);Assert.fail("Expecting IllegalArgumentException - bad interval");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111279);try {
            // bad samples number
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111280);transformer.transform(f, -1, 1, 0, TransformType.FORWARD);
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111281);Assert.fail("Expecting IllegalArgumentException - bad samples number");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        __CLR4_4_12dqw2dqwlb90peuj.R.inc(111282);try {
            // bad samples number
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111283);transformer.transform(f, -1, 1, 100, TransformType.FORWARD);
            __CLR4_4_12dqw2dqwlb90peuj.R.inc(111284);Assert.fail("Expecting IllegalArgumentException - bad samples number");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }finally{__CLR4_4_12dqw2dqwlb90peuj.R.flushNeeded();}}
}
