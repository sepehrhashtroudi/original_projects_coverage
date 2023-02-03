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

import java.util.Random;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Abstract test for classes implementing the {@link RealTransformer} interface.
 * This abstract test handles the automatic generation of random data of various
 * sizes. For each generated data array, actual values (returned by the
 * transformer to be tested) are compared to expected values, returned by the
 * {@link #transform(double[], TransformType)} (to be implemented by the user:
 * a naive method may be used). Methods are also provided to test that invalid
 * parameters throw the expected exceptions.
 *
 * @since 3.0
 * @version $Id$
 */
public abstract class RealTransformerAbstractTest {static class __CLR4_4_12dv92dv9lb90peus{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111406,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The common seed of all random number generators used in this test. */
    private final static long SEED = 20110119L;

    /**
     * Returns a new instance of the {@link RealTransformer} to be tested.
     *
     * @return a the transformer to be tested
     */
    abstract RealTransformer createRealTransformer();

    /**
     * Returns an invalid data size. Transforms with this data size should
     * trigger a {@link MathIllegalArgumentException}.
     *
     * @param i the index of the invalid data size ({@code 0 <= i <}
     * {@link #getNumberOfInvalidDataSizes()}
     * @return an invalid data size
     */
    abstract int getInvalidDataSize(int i);

    /**
     * Returns the total number of invalid data sizes to be tested. If data
     * array of any
     * size can be handled by the {@link RealTransformer} to be tested, this
     * method should return {@code 0}.
     *
     * @return the total number of invalid data sizes
     */
    abstract int getNumberOfInvalidDataSizes();

    /**
     * Returns the total number of valid data sizes to be tested.
     *
     * @return the total number of valid data sizes
     */
    abstract int getNumberOfValidDataSizes();

    /**
     * Returns the expected relative accuracy for data arrays of size
     * {@code getValidDataSize(i)}.
     *
     * @param i the index of the valid data size
     * @return the expected relative accuracy
     */
    abstract double getRelativeTolerance(int i);

    /**
     * Returns a valid data size. This method allows for data arrays of various
     * sizes to be automatically tested (by allowing multiple values of the
     * specified index).
     *
     * @param i the index of the valid data size ({@code 0 <= i <}
     * {@link #getNumberOfValidDataSizes()}
     * @return a valid data size
     */
    abstract int getValidDataSize(int i);

    /**
     * Returns a function for the accuracy check of
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}
     * and
     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.
     * This function should be valid. In other words, none of the above methods
     * should throw an exception when passed this function.
     *
     * @return a valid function
     */
    abstract UnivariateFunction getValidFunction();

    /**
     * Returns a sampling lower bound for the accuracy check of
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}
     * and
     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.
     * This lower bound should be valid. In other words, none of the above
     * methods should throw an exception when passed this bound.
     *
     * @return a valid lower bound
     */
    abstract double getValidLowerBound();

    /**
     * Returns a sampling upper bound for the accuracy check of
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int)}
     * and
     * {@link RealTransformer#inverseTransform(UnivariateFunction, double, double, int)}.
     * This upper bound should be valid. In other words, none of the above
     * methods should throw an exception when passed this bound.
     *
     * @return a valid bound
     */
    abstract double getValidUpperBound();

    /**
     * Returns the expected transform of the specified real data array.
     *
     * @param x the real data array to be transformed
     * @param type the type of transform (forward, inverse) to be performed
     * @return the expected transform
     */
    abstract double[] transform(double[] x, TransformType type);

    /*
     * Check of preconditions.
     */

    /**
     * {@link RealTransformer#transform(double[], TransformType)} should throw a
     * {@link MathIllegalArgumentException} if data size is invalid.
     */
    @Test
    public void testTransformRealInvalidDataSize() {__CLR4_4_12dv92dv9lb90peus.R.globalSliceStart(getClass().getName(),111285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17s0k4v2dv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dv92dv9lb90peus.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dv92dv9lb90peus.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformRealInvalidDataSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17s0k4v2dv9(){try{__CLR4_4_12dv92dv9lb90peus.R.inc(111285);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111286);final TransformType[] type = TransformType.values();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111287);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111288);for (int i = 0; (((i < getNumberOfInvalidDataSizes())&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111289)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111290)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111291);final int n = getInvalidDataSize(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111292);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111293)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111294)==0&false)); j++) {{
                __CLR4_4_12dv92dv9lb90peus.R.inc(111295);try {
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111296);transformer.transform(createRealData(n), type[j]);
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111297);Assert.fail(type[j] + ", " + n);
                } catch (MathIllegalArgumentException e) {
                    // Expected: do nothing
                }
            }
        }}
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /**
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}
     * should throw a {@link MathIllegalArgumentException} if number of samples
     * is invalid.
     */
    @Test
    public void testTransformFunctionInvalidDataSize() {__CLR4_4_12dv92dv9lb90peus.R.globalSliceStart(getClass().getName(),111298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ippiy12dvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dv92dv9lb90peus.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dv92dv9lb90peus.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunctionInvalidDataSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ippiy12dvm(){try{__CLR4_4_12dv92dv9lb90peus.R.inc(111298);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111299);final TransformType[] type = TransformType.values();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111300);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111301);final UnivariateFunction f = getValidFunction();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111302);final double a = getValidLowerBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111303);final double b = getValidUpperBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111304);for (int i = 0; (((i < getNumberOfInvalidDataSizes())&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111305)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111306)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111307);final int n = getInvalidDataSize(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111308);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111309)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111310)==0&false)); j++) {{
                __CLR4_4_12dv92dv9lb90peus.R.inc(111311);try {
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111312);transformer.transform(f, a, b, n, type[j]);
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111313);Assert.fail(type[j] + ", " + n);
                } catch (MathIllegalArgumentException e) {
                    // Expected: do nothing
                }
            }
        }}
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /**
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}
     * should throw a {@link NotStrictlyPositiveException} if number of samples
     * is not strictly positive.
     */
    @Test
    public void testTransformFunctionNotStrictlyPositiveNumberOfSamples() {__CLR4_4_12dv92dv9lb90peus.R.globalSliceStart(getClass().getName(),111314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jjaqo2dw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dv92dv9lb90peus.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dv92dv9lb90peus.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunctionNotStrictlyPositiveNumberOfSamples",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jjaqo2dw2(){try{__CLR4_4_12dv92dv9lb90peus.R.inc(111314);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111315);final TransformType[] type = TransformType.values();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111316);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111317);final UnivariateFunction f = getValidFunction();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111318);final double a = getValidLowerBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111319);final double b = getValidUpperBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111320);for (int i = 0; (((i < getNumberOfValidDataSizes())&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111321)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111322)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111323);final int n = getValidDataSize(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111324);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111325)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111326)==0&false)); j++) {{
                __CLR4_4_12dv92dv9lb90peus.R.inc(111327);try {
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111328);transformer.transform(f, a, b, -n, type[j]);
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111329);Assert.fail(type[j] + ", " + (-n));
                } catch (NotStrictlyPositiveException e) {
                    // Expected: do nothing
                }
            }
        }}
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /**
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}
     * should throw a {@link NumberIsTooLargeException} if sampling bounds are
     * not correctly ordered.
     */
    @Test
    public void testTransformFunctionInvalidBounds() {__CLR4_4_12dv92dv9lb90peus.R.globalSliceStart(getClass().getName(),111330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uvcthb2dwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dv92dv9lb90peus.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dv92dv9lb90peus.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunctionInvalidBounds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uvcthb2dwi(){try{__CLR4_4_12dv92dv9lb90peus.R.inc(111330);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111331);final TransformType[] type = TransformType.values();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111332);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111333);final UnivariateFunction f = getValidFunction();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111334);final double a = getValidLowerBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111335);final double b = getValidUpperBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111336);for (int i = 0; (((i < getNumberOfValidDataSizes())&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111337)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111338)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111339);final int n = getValidDataSize(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111340);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111341)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111342)==0&false)); j++) {{
                __CLR4_4_12dv92dv9lb90peus.R.inc(111343);try {
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111344);transformer.transform(f, b, a, n, type[j]);
                    __CLR4_4_12dv92dv9lb90peus.R.inc(111345);Assert.fail(type[j] + ", " + b + ", " + a);
                } catch (NumberIsTooLargeException e) {
                    // Expected: do nothing
                }
            }
        }}
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /*
     * Accuracy tests of transform of valid data.
     */

    /**
     * Accuracy check of {@link RealTransformer#transform(double[], TransformType)}.
     * For each valid data size returned by
     * {@link #getValidDataSize(int) getValidDataSize(i)},
     * a random data array is generated with
     * {@link #createRealData(int) createRealData(i)}. The actual
     * transform is computed and compared to the expected transform, return by
     * {@link #transform(double[], TransformType)}. Actual and expected values
     * should be equal to within the relative error returned by
     * {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.
     */
    @Test
    public void testTransformReal() {__CLR4_4_12dv92dv9lb90peus.R.globalSliceStart(getClass().getName(),111346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9fhfj2dwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dv92dv9lb90peus.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dv92dv9lb90peus.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformReal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9fhfj2dwy(){try{__CLR4_4_12dv92dv9lb90peus.R.inc(111346);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111347);final TransformType[] type = TransformType.values();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111348);for (int i = 0; (((i < getNumberOfValidDataSizes())&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111349)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111350)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111351);final int n = getValidDataSize(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111352);final double tol = getRelativeTolerance(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111353);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111354)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111355)==0&false)); j++) {{
                __CLR4_4_12dv92dv9lb90peus.R.inc(111356);doTestTransformReal(n, tol, type[j]);
            }
        }}
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /**
     * Accuracy check of
     * {@link RealTransformer#transform(UnivariateFunction, double, double, int, TransformType)}.
     * For each valid data size returned by
     * {@link #getValidDataSize(int) getValidDataSize(i)},
     * the {@link UnivariateFunction} returned by {@link #getValidFunction()} is
     * sampled. The actual transform is computed and compared to the expected
     * transform, return by {@link #transform(double[], TransformType)}. Actual
     * and expected values should be equal to within the relative error returned
     * by {@link #getRelativeTolerance(int) getRelativeTolerance(i)}.
     */
    @Test
    public void testTransformFunction() {__CLR4_4_12dv92dv9lb90peus.R.globalSliceStart(getClass().getName(),111357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1urojrb2dx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12dv92dv9lb90peus.R.rethrow($CLV_t2$);}finally{__CLR4_4_12dv92dv9lb90peus.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.transform.RealTransformerAbstractTest.testTransformFunction",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),111357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1urojrb2dx9(){try{__CLR4_4_12dv92dv9lb90peus.R.inc(111357);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111358);final TransformType[] type = TransformType.values();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111359);for (int i = 0; (((i < getNumberOfValidDataSizes())&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111360)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111361)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111362);final int n = getValidDataSize(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111363);final double tol = getRelativeTolerance(i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111364);for (int j = 0; (((j < type.length)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111365)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111366)==0&false)); j++) {{
                __CLR4_4_12dv92dv9lb90peus.R.inc(111367);doTestTransformFunction(n, tol, type[j]);
            }
        }}
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /*
     * Utility methods.
     */

    /**
     * Returns a random array of doubles. Random generator always uses the same
     * seed.
     *
     * @param n the size of the array to be returned
     * @return a random array of specified size
     */
    double[] createRealData(final int n) {try{__CLR4_4_12dv92dv9lb90peus.R.inc(111368);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111369);final Random random = new Random(SEED);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111370);final double[] data = new double[n];
        __CLR4_4_12dv92dv9lb90peus.R.inc(111371);for (int i = 0; (((i < n)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111372)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111373)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111374);data[i] = 2.0 * random.nextDouble() - 1.0;
        }
        }__CLR4_4_12dv92dv9lb90peus.R.inc(111375);return data;
    }finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    /*
     * The tests per se.
     */

    private void doTestTransformReal(final int n, final double tol,
        final TransformType type) {try{__CLR4_4_12dv92dv9lb90peus.R.inc(111376);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111377);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111378);final double[] x = createRealData(n);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111379);final double[] expected = transform(x, type);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111380);final double[] actual = transformer.transform(x, type);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111381);for (int i = 0; (((i < n)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111382)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111383)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111384);final String msg = String.format("%d, %d", n, i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111385);final double delta = tol * FastMath.abs(expected[i]);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111386);Assert.assertEquals(msg, expected[i], actual[i], delta);
        }
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}

    private void doTestTransformFunction(final int n, final double tol,
        final TransformType type) {try{__CLR4_4_12dv92dv9lb90peus.R.inc(111387);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111388);final RealTransformer transformer = createRealTransformer();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111389);final UnivariateFunction f = getValidFunction();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111390);final double a = getValidLowerBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111391);final double b = getValidUpperBound();
        __CLR4_4_12dv92dv9lb90peus.R.inc(111392);final double[] x = createRealData(n);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111393);for (int i = 0; (((i < n)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111394)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111395)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111396);final double t = a + i * (b - a) / n;
            __CLR4_4_12dv92dv9lb90peus.R.inc(111397);x[i] = f.value(t);
        }
        }__CLR4_4_12dv92dv9lb90peus.R.inc(111398);final double[] expected = transform(x, type);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111399);final double[] actual = transformer.transform(f, a, b, n, type);
        __CLR4_4_12dv92dv9lb90peus.R.inc(111400);for (int i = 0; (((i < n)&&(__CLR4_4_12dv92dv9lb90peus.R.iget(111401)!=0|true))||(__CLR4_4_12dv92dv9lb90peus.R.iget(111402)==0&false)); i++) {{
            __CLR4_4_12dv92dv9lb90peus.R.inc(111403);final String msg = String.format("%d, %d", n, i);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111404);final double delta = tol * FastMath.abs(expected[i]);
            __CLR4_4_12dv92dv9lb90peus.R.inc(111405);Assert.assertEquals(msg, expected[i], actual[i], delta);
        }
    }}finally{__CLR4_4_12dv92dv9lb90peus.R.flushNeeded();}}
}
