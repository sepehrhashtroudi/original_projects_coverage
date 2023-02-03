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

package org.apache.commons.math3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;


import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.linear.FieldMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.stat.inference.ChiSquareTest;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;

/**
 * @version $Id$
 */
public class TestUtils {static class __CLR4_4_11bqf1bqflb90pbr0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,62128,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Collection of static methods used in math unit tests.
     */
    private TestUtils() {
        super();__CLR4_4_11bqf1bqflb90pbr0.R.inc(61864);try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61863);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that expected and actual are within delta, or are both NaN or
     * infinities of the same sign.
     */
    public static void assertEquals(double expected, double actual, double delta) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61865);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61866);Assert.assertEquals(null, expected, actual, delta);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that expected and actual are within delta, or are both NaN or
     * infinities of the same sign.
     */
    public static void assertEquals(String msg, double expected, double actual, double delta) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61867);
        // check for NaN
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61868);if((((Double.isNaN(expected))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61869)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61870)==0&false))){{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61871);Assert.assertTrue("" + actual + " is not NaN.",
                Double.isNaN(actual));
        } }else {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61872);Assert.assertEquals(msg, expected, actual, delta);
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that the two arguments are exactly the same, either
     * both NaN or infinities of same sign, or identical floating point values.
     */
    public static void assertSame(double expected, double actual) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61873);
     __CLR4_4_11bqf1bqflb90pbr0.R.inc(61874);Assert.assertEquals(expected, actual, 0);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that real and imaginary parts of the two complex arguments
     * are exactly the same.  Also ensures that NaN / infinite components match.
     */
    public static void assertSame(Complex expected, Complex actual) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61875);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61876);assertSame(expected.getReal(), actual.getReal());
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61877);assertSame(expected.getImaginary(), actual.getImaginary());
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that real and imaginary parts of the two complex arguments
     * differ by at most delta.  Also ensures that NaN / infinite components match.
     */
    public static void assertEquals(Complex expected, Complex actual, double delta) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61878);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61879);Assert.assertEquals(expected.getReal(), actual.getReal(), delta);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61880);Assert.assertEquals(expected.getImaginary(), actual.getImaginary(), delta);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that two double arrays have equal entries, up to tolerance
     */
    public static void assertEquals(double expected[], double observed[], double tolerance) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61881);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61882);assertEquals("Array comparison failure", expected, observed, tolerance);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Serializes an object to a bytes array and then recovers the object from the bytes array.
     * Returns the deserialized object.
     *
     * @param o  object to serialize and recover
     * @return  the recovered, deserialized object
     */
    public static Object serializeAndRecover(Object o) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61883);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61884);try {
            // serialize the Object
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61885);ByteArrayOutputStream bos = new ByteArrayOutputStream();
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61886);ObjectOutputStream so = new ObjectOutputStream(bos);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61887);so.writeObject(o);

            // deserialize the Object
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61888);ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61889);ObjectInputStream si = new ObjectInputStream(bis);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61890);return si.readObject();
        } catch (IOException ioe) {
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61891);return null;
        } catch (ClassNotFoundException cnfe) {
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61892);return null;
        }
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that serialization preserves equals and hashCode.
     * Serializes the object, then recovers it and checks equals and hash code.
     *
     * @param object  the object to serialize and recover
     */
    public static void checkSerializedEquality(Object object) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61893);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61894);Object object2 = serializeAndRecover(object);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61895);Assert.assertEquals("Equals check", object, object2);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61896);Assert.assertEquals("HashCode check", object.hashCode(), object2.hashCode());
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that the relative error in actual vs. expected is less than or
     * equal to relativeError.  If expected is infinite or NaN, actual must be
     * the same (NaN or infinity of the same sign).
     *
     * @param expected expected value
     * @param actual  observed value
     * @param relativeError  maximum allowable relative error
     */
    public static void assertRelativelyEquals(double expected, double actual,
            double relativeError) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61897);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61898);assertRelativelyEquals(null, expected, actual, relativeError);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Verifies that the relative error in actual vs. expected is less than or
     * equal to relativeError.  If expected is infinite or NaN, actual must be
     * the same (NaN or infinity of the same sign).
     *
     * @param msg  message to return with failure
     * @param expected expected value
     * @param actual  observed value
     * @param relativeError  maximum allowable relative error
     */
    public static void assertRelativelyEquals(String msg, double expected,
            double actual, double relativeError) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61899);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61900);if ((((Double.isNaN(expected))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61901)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61902)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61903);Assert.assertTrue(msg, Double.isNaN(actual));
        } }else {__CLR4_4_11bqf1bqflb90pbr0.R.inc(61904);if ((((Double.isNaN(actual))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61905)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61906)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61907);Assert.assertTrue(msg, Double.isNaN(expected));
        } }else {__CLR4_4_11bqf1bqflb90pbr0.R.inc(61908);if ((((Double.isInfinite(actual) || Double.isInfinite(expected))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61909)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61910)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61911);Assert.assertEquals(expected, actual, relativeError);
        } }else {__CLR4_4_11bqf1bqflb90pbr0.R.inc(61912);if ((((expected == 0.0)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61913)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61914)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61915);Assert.assertEquals(msg, actual, expected, relativeError);
        } }else {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61916);double absError = FastMath.abs(expected) * relativeError;
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61917);Assert.assertEquals(msg, expected, actual, absError);
        }
    }}}}}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Fails iff values does not contain a number within epsilon of z.
     *
     * @param msg  message to return with failure
     * @param values complex array to search
     * @param z  value sought
     * @param epsilon  tolerance
     */
    public static void assertContains(String msg, Complex[] values,
                                      Complex z, double epsilon) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61918);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61919);for (Complex value : values) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61920);if ((((Precision.equals(value.getReal(), z.getReal(), epsilon) &&
                Precision.equals(value.getImaginary(), z.getImaginary(), epsilon))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61921)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61922)==0&false))) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(61923);return;
            }
        }}
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(61924);Assert.fail(msg + " Unable to find " + (new ComplexFormat()).format(z));
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Fails iff values does not contain a number within epsilon of z.
     *
     * @param values complex array to search
     * @param z  value sought
     * @param epsilon  tolerance
     */
    public static void assertContains(Complex[] values,
            Complex z, double epsilon) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61925);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61926);assertContains(null, values, z, epsilon);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Fails iff values does not contain a number within epsilon of x.
     *
     * @param msg  message to return with failure
     * @param values double array to search
     * @param x value sought
     * @param epsilon  tolerance
     */
    public static void assertContains(String msg, double[] values,
            double x, double epsilon) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61927);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61928);for (double value : values) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61929);if ((((Precision.equals(value, x, epsilon))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61930)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61931)==0&false))) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(61932);return;
            }
        }}
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(61933);Assert.fail(msg + " Unable to find " + x);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Fails iff values does not contain a number within epsilon of x.
     *
     * @param values double array to search
     * @param x value sought
     * @param epsilon  tolerance
     */
    public static void assertContains(double[] values, double x,
            double epsilon) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61934);
       __CLR4_4_11bqf1bqflb90pbr0.R.inc(61935);assertContains(null, values, x, epsilon);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Asserts that all entries of the specified vectors are equal to within a
     * positive {@code delta}.
     *
     * @param message the identifying message for the assertion error (can be
     * {@code null})
     * @param expected expected value
     * @param actual actual value
     * @param delta the maximum difference between the entries of the expected
     * and actual vectors for which both entries are still considered equal
     */
    public static void assertEquals(final String message,
        final double[] expected, final RealVector actual, final double delta) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61936);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61937);final String msgAndSep = (((message.equals("") )&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61938)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61939)==0&false))? "" : message + ", ";
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61940);Assert.assertEquals(msgAndSep + "dimension", expected.length,
            actual.getDimension());
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61941);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61942)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61943)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61944);Assert.assertEquals(msgAndSep + "entry #" + i, expected[i],
                actual.getEntry(i), delta);
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Asserts that all entries of the specified vectors are equal to within a
     * positive {@code delta}.
     *
     * @param message the identifying message for the assertion error (can be
     * {@code null})
     * @param expected expected value
     * @param actual actual value
     * @param delta the maximum difference between the entries of the expected
     * and actual vectors for which both entries are still considered equal
     */
    public static void assertEquals(final String message,
        final RealVector expected, final RealVector actual, final double delta) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61945);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61946);final String msgAndSep = (((message.equals("") )&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61947)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61948)==0&false))? "" : message + ", ";
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61949);Assert.assertEquals(msgAndSep + "dimension", expected.getDimension(),
            actual.getDimension());
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61950);final int dim = expected.getDimension();
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61951);for (int i = 0; (((i < dim)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61952)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61953)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61954);Assert.assertEquals(msgAndSep + "entry #" + i,
                expected.getEntry(i), actual.getEntry(i), delta);
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /** verifies that two matrices are close (1-norm) */
    public static void assertEquals(String msg, RealMatrix expected, RealMatrix observed, double tolerance) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61955);

        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61956);Assert.assertNotNull(msg + "\nObserved should not be null",observed);

        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61957);if ((((expected.getColumnDimension() != observed.getColumnDimension() ||
                expected.getRowDimension() != observed.getRowDimension())&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61958)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61959)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61960);StringBuilder messageBuffer = new StringBuilder(msg);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61961);messageBuffer.append("\nObserved has incorrect dimensions.");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61962);messageBuffer.append("\nobserved is " + observed.getRowDimension() +
                    " x " + observed.getColumnDimension());
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61963);messageBuffer.append("\nexpected " + expected.getRowDimension() +
                    " x " + expected.getColumnDimension());
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61964);Assert.fail(messageBuffer.toString());
        }

        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(61965);RealMatrix delta = expected.subtract(observed);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61966);if ((((delta.getNorm() >= tolerance)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61967)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61968)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61969);StringBuilder messageBuffer = new StringBuilder(msg);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61970);messageBuffer.append("\nExpected: " + expected);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61971);messageBuffer.append("\nObserved: " + observed);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61972);messageBuffer.append("\nexpected - observed: " + delta);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61973);Assert.fail(messageBuffer.toString());
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /** verifies that two matrices are equal */
    public static void assertEquals(FieldMatrix<? extends FieldElement<?>> expected,
                                    FieldMatrix<? extends FieldElement<?>> observed) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61974);

        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61975);Assert.assertNotNull("Observed should not be null",observed);

        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61976);if ((((expected.getColumnDimension() != observed.getColumnDimension() ||
                expected.getRowDimension() != observed.getRowDimension())&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61977)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61978)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61979);StringBuilder messageBuffer = new StringBuilder();
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61980);messageBuffer.append("Observed has incorrect dimensions.");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61981);messageBuffer.append("\nobserved is " + observed.getRowDimension() +
                    " x " + observed.getColumnDimension());
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61982);messageBuffer.append("\nexpected " + expected.getRowDimension() +
                    " x " + expected.getColumnDimension());
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61983);Assert.fail(messageBuffer.toString());
        }

        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(61984);for (int i = 0; (((i < expected.getRowDimension())&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61985)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61986)==0&false)); ++i) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61987);for (int j = 0; (((j < expected.getColumnDimension())&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61988)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61989)==0&false)); ++j) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(61990);FieldElement<?> eij = expected.getEntry(i, j);
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(61991);FieldElement<?> oij = observed.getEntry(i, j);
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(61992);Assert.assertEquals(eij, oij);
            }
        }}
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /** verifies that two arrays are close (sup norm) */
    public static void assertEquals(String msg, double[] expected, double[] observed, double tolerance) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(61993);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61994);StringBuilder out = new StringBuilder(msg);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(61995);if ((((expected.length != observed.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61996)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(61997)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61998);out.append("\n Arrays not same length. \n");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(61999);out.append("expected has length ");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62000);out.append(expected.length);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62001);out.append(" observed length = ");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62002);out.append(observed.length);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62003);Assert.fail(out.toString());
        }
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62004);boolean failure = false;
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62005);for (int i=0; (((i < expected.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62006)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62007)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62008);if ((((!Precision.equalsIncludingNaN(expected[i], observed[i], tolerance))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62009)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62010)==0&false))) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62011);failure = true;
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62012);out.append("\n Elements at index ");
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62013);out.append(i);
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62014);out.append(" differ. ");
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62015);out.append(" expected = ");
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62016);out.append(expected[i]);
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62017);out.append(" observed = ");
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62018);out.append(observed[i]);
            }
        }}
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62019);if ((((failure)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62020)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62021)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62022);Assert.fail(out.toString());
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /** verifies that two arrays are equal */
    public static <T extends FieldElement<T>> void assertEquals(T[] m, T[] n) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62023);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62024);if ((((m.length != n.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62025)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62026)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62027);Assert.fail("vectors not same length");
        }
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62028);for (int i = 0; (((i < m.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62029)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62030)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62031);Assert.assertEquals(m[i],n[i]);
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Computes the sum of squared deviations of <values> from <target>
     * @param values array of deviates
     * @param target value to compute deviations from
     *
     * @return sum of squared deviations
     */
    public static double sumSquareDev(double[] values, double target) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62032);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62033);double sumsq = 0d;
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62034);for (int i = 0; (((i < values.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62035)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62036)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62037);final double dev = values[i] - target;
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62038);sumsq += (dev * dev);
        }
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62039);return sumsq;
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test
     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%
     *
     * @param valueLabels labels for the values of the discrete distribution under test
     * @param expected expected counts
     * @param observed observed counts
     * @param alpha significance level of the test
     */
    public static void assertChiSquareAccept(String[] valueLabels, double[] expected, long[] observed, double alpha) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62040);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62041);ChiSquareTest chiSquareTest = new ChiSquareTest();

        // Fail if we can reject null hypothesis that distributions are the same
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62042);if ((((chiSquareTest.chiSquareTest(expected, observed, alpha))&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62043)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62044)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62045);StringBuilder msgBuffer = new StringBuilder();
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62046);DecimalFormat df = new DecimalFormat("#.##");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62047);msgBuffer.append("Chisquare test failed");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62048);msgBuffer.append(" p-value = ");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62049);msgBuffer.append(chiSquareTest.chiSquareTest(expected, observed));
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62050);msgBuffer.append(" chisquare statistic = ");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62051);msgBuffer.append(chiSquareTest.chiSquare(expected, observed));
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62052);msgBuffer.append(". \n");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62053);msgBuffer.append("value\texpected\tobserved\n");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62054);for (int i = 0; (((i < expected.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62055)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62056)==0&false)); i++) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62057);msgBuffer.append(valueLabels[i]);
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62058);msgBuffer.append("\t");
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62059);msgBuffer.append(df.format(expected[i]));
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62060);msgBuffer.append("\t\t");
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62061);msgBuffer.append(observed[i]);
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62062);msgBuffer.append("\n");
            }
            }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62063);msgBuffer.append("This test can fail randomly due to sampling error with probability ");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62064);msgBuffer.append(alpha);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62065);msgBuffer.append(".");
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62066);Assert.fail(msgBuffer.toString());
        }
    }}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test
     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%
     *
     * @param values integer values whose observed and expected counts are being compared
     * @param expected expected counts
     * @param observed observed counts
     * @param alpha significance level of the test
     */
    public static void assertChiSquareAccept(int[] values, double[] expected, long[] observed, double alpha) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62067);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62068);String[] labels = new String[values.length];
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62069);for (int i = 0; (((i < values.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62070)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62071)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62072);labels[i] = Integer.toString(values[i]);
        }
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62073);assertChiSquareAccept(labels, expected, observed, alpha);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Asserts the null hypothesis for a ChiSquare test.  Fails and dumps arguments and test
     * statistics if the null hypothesis can be rejected with confidence 100 * (1 - alpha)%
     *
     * @param expected expected counts
     * @param observed observed counts
     * @param alpha significance level of the test
     */
    public static void assertChiSquareAccept(double[] expected, long[] observed, double alpha) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62074);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62075);String[] labels = new String[expected.length];
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62076);for (int i = 0; (((i < labels.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62077)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62078)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62079);labels[i] = Integer.toString(i + 1);
        }
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62080);assertChiSquareAccept(labels, expected, observed, alpha);
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Computes the 25th, 50th and 75th percentiles of the given distribution and returns
     * these values in an array.
     */
    public static double[] getDistributionQuartiles(RealDistribution distribution) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62081);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62082);double[] quantiles = new double[3];
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62083);quantiles[0] = distribution.inverseCumulativeProbability(0.25d);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62084);quantiles[1] = distribution.inverseCumulativeProbability(0.5d);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62085);quantiles[2] = distribution.inverseCumulativeProbability(0.75d);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62086);return quantiles;
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Updates observed counts of values in quartiles.
     * counts[0] <-> 1st quartile ... counts[3] <-> top quartile
     */
    public static void updateCounts(double value, long[] counts, double[] quartiles) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62087);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62088);if ((((value < quartiles[0])&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62089)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62090)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62091);counts[0]++;
        } }else {__CLR4_4_11bqf1bqflb90pbr0.R.inc(62092);if ((((value > quartiles[2])&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62093)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62094)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62095);counts[3]++;
        } }else {__CLR4_4_11bqf1bqflb90pbr0.R.inc(62096);if ((((value > quartiles[1])&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62097)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62098)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62099);counts[2]++;
        } }else {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62100);counts[1]++;
        }
    }}}}finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}

    /**
     * Eliminates points with zero mass from densityPoints and densityValues parallel
     * arrays.  Returns the number of positive mass points and collapses the arrays so
     * that the first <returned value> elements of the input arrays represent the positive
     * mass points.
     */
    public static int eliminateZeroMassPoints(int[] densityPoints, double[] densityValues) {try{__CLR4_4_11bqf1bqflb90pbr0.R.inc(62101);
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62102);int positiveMassCount = 0;
        __CLR4_4_11bqf1bqflb90pbr0.R.inc(62103);for (int i = 0; (((i < densityValues.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62104)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62105)==0&false)); i++) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62106);if ((((densityValues[i] > 0)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62107)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62108)==0&false))) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62109);positiveMassCount++;
            }
        }}
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62110);if ((((positiveMassCount < densityValues.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62111)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62112)==0&false))) {{
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62113);int[] newPoints = new int[positiveMassCount];
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62114);double[] newValues = new double[positiveMassCount];
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62115);int j = 0;
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62116);for (int i = 0; (((i < densityValues.length)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62117)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62118)==0&false)); i++) {{
                __CLR4_4_11bqf1bqflb90pbr0.R.inc(62119);if ((((densityValues[i] > 0)&&(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62120)!=0|true))||(__CLR4_4_11bqf1bqflb90pbr0.R.iget(62121)==0&false))) {{
                    __CLR4_4_11bqf1bqflb90pbr0.R.inc(62122);newPoints[j] = densityPoints[i];
                    __CLR4_4_11bqf1bqflb90pbr0.R.inc(62123);newValues[j] = densityValues[i];
                    __CLR4_4_11bqf1bqflb90pbr0.R.inc(62124);j++;
                }
            }}
            }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62125);System.arraycopy(newPoints,0,densityPoints,0,positiveMassCount);
            __CLR4_4_11bqf1bqflb90pbr0.R.inc(62126);System.arraycopy(newValues,0,densityValues,0,positiveMassCount);
        }
        }__CLR4_4_11bqf1bqflb90pbr0.R.inc(62127);return positiveMassCount;
    }finally{__CLR4_4_11bqf1bqflb90pbr0.R.flushNeeded();}}
}
