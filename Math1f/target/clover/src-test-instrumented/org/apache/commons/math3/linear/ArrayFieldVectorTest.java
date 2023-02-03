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
package org.apache.commons.math3.linear;

import java.io.Serializable;
import java.lang.reflect.Array;

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the {@link ArrayFieldVector} class.
 *
 * @version $Id$
 */
public class ArrayFieldVectorTest {static class __CLR4_4_11r9n1r9nlb90pczu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,82330,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //
    protected Fraction[][] ma1 = {
            {new Fraction(1), new Fraction(2), new Fraction(3)},
            {new Fraction(4), new Fraction(5), new Fraction(6)},
            {new Fraction(7), new Fraction(8), new Fraction(9)}
    };
    protected Fraction[] vec1 = {new Fraction(1), new Fraction(2), new Fraction(3)};
    protected Fraction[] vec2 = {new Fraction(4), new Fraction(5), new Fraction(6)};
    protected Fraction[] vec3 = {new Fraction(7), new Fraction(8), new Fraction(9)};
    protected Fraction[] vec4 = { new Fraction(1), new Fraction(2), new Fraction(3),
                                  new Fraction(4), new Fraction(5), new Fraction(6),
                                  new Fraction(7), new Fraction(8), new Fraction(9)};
    protected Fraction[] vec_null = {new Fraction(0), new Fraction(0), new Fraction(0)};
    protected Fraction[] dvec1 = {new Fraction(1), new Fraction(2), new Fraction(3),
                                  new Fraction(4), new Fraction(5), new Fraction(6),
                                  new Fraction(7), new Fraction(8), new Fraction(9)};
    protected Fraction[][] mat1 = {
            {new Fraction(1), new Fraction(2), new Fraction(3)},
            {new Fraction(4), new Fraction(5), new Fraction(6)},
            {new Fraction(7), new Fraction(8), new Fraction(9)}
    };

    // Testclass to test the FieldVector<Fraction> interface
    // only with enough content to support the test
    public static class FieldVectorTestImpl<T extends FieldElement<T>>
        implements FieldVector<T>, Serializable {

        private static final long serialVersionUID = 3970959016014158539L;

        private final Field<T> field;

        /** Entries of the vector. */
        protected T[] data;

        /** Build an array of elements.
         * @param length size of the array to build
         * @return a new array
         */
        @SuppressWarnings("unchecked") // field is of type T
        private T[] buildArray(final int length) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(81995);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(81996);return (T[]) Array.newInstance(field.getRuntimeClass(), length);
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVectorTestImpl(T[] d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(81997);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(81998);field = d[0].getField();
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(81999);data = d.clone();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public Field<T> getField() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82000);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82001);return field;
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        private UnsupportedOperationException unsupported() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82002);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82003);return new UnsupportedOperationException("Not supported, unneeded for test purposes");
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> copy() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82004);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82005);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> add(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82006);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82007);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> add(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82008);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82009);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> subtract(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82010);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82011);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> subtract(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82012);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82013);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapAdd(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82014);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82015);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapAddToSelf(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82016);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82017);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapSubtract(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82018);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82019);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapSubtractToSelf(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82020);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82021);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapMultiply(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82022);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82023);T[] out = buildArray(data.length);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82024);for (int i = 0; (((i < data.length)&&(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82025)!=0|true))||(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82026)==0&false)); i++) {{
                __CLR4_4_11r9n1r9nlb90pczu.R.inc(82027);out[i] = data[i].multiply(d);
            }
            }__CLR4_4_11r9n1r9nlb90pczu.R.inc(82028);return new FieldVectorTestImpl<T>(out);
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapMultiplyToSelf(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82029);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82030);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapDivide(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82031);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82032);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapDivideToSelf(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82033);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82034);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapInv() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82035);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82036);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> mapInvToSelf() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82037);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82038);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> ebeMultiply(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82039);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82040);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> ebeMultiply(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82041);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82042);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> ebeDivide(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82043);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82044);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> ebeDivide(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82045);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82046);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public T[] getData() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82047);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82048);return data.clone();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public T dotProduct(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82049);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82050);T dot = field.getZero();
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82051);for (int i = 0; (((i < data.length)&&(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82052)!=0|true))||(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82053)==0&false)); i++) {{
                __CLR4_4_11r9n1r9nlb90pczu.R.inc(82054);dot = dot.add(data[i].multiply(v.getEntry(i)));
            }
            }__CLR4_4_11r9n1r9nlb90pczu.R.inc(82055);return dot;
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public T dotProduct(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82056);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82057);T dot = field.getZero();
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82058);for (int i = 0; (((i < data.length)&&(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82059)!=0|true))||(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82060)==0&false)); i++) {{
                __CLR4_4_11r9n1r9nlb90pczu.R.inc(82061);dot = dot.add(data[i].multiply(v[i]));
            }
            }__CLR4_4_11r9n1r9nlb90pczu.R.inc(82062);return dot;
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> projection(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82063);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82064);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> projection(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82065);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82066);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldMatrix<T> outerProduct(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82067);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82068);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldMatrix<T> outerProduct(T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82069);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82070);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public T getEntry(int index) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82071);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82072);return data[index];
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public int getDimension() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82073);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82074);return data.length;
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> append(FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82075);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82076);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> append(T d) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82077);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82078);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> append(T[] a) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82079);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82080);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public FieldVector<T> getSubVector(int index, int n) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82081);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82082);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public void setEntry(int index, T value) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82083);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82084);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public void setSubVector(int index, FieldVector<T> v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82085);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82086);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public void setSubVector(int index, T[] v) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82087);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82088);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public void set(T value) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82089);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82090);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

        public T[] toArray() {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82091);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82092);throw unsupported();
        }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    }

    @Test
    public void testConstructors() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwxahe1rcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testConstructors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwxahe1rcd(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82093);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82094);ArrayFieldVector<Fraction> v0 = new ArrayFieldVector<Fraction>(FractionField.getInstance());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82095);Assert.assertEquals(0, v0.getDimension());

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82096);ArrayFieldVector<Fraction> v1 = new ArrayFieldVector<Fraction>(FractionField.getInstance(), 7);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82097);Assert.assertEquals(7, v1.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82098);Assert.assertEquals(new Fraction(0), v1.getEntry(6));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82099);ArrayFieldVector<Fraction> v2 = new ArrayFieldVector<Fraction>(5, new Fraction(123, 100));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82100);Assert.assertEquals(5, v2.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82101);Assert.assertEquals(new Fraction(123, 100), v2.getEntry(4));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82102);ArrayFieldVector<Fraction> v3 = new ArrayFieldVector<Fraction>(FractionField.getInstance(), vec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82103);Assert.assertEquals(3, v3.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82104);Assert.assertEquals(new Fraction(2), v3.getEntry(1));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82105);ArrayFieldVector<Fraction> v4 = new ArrayFieldVector<Fraction>(FractionField.getInstance(), vec4, 3, 2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82106);Assert.assertEquals(2, v4.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82107);Assert.assertEquals(new Fraction(4), v4.getEntry(0));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82108);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82109);new ArrayFieldVector<Fraction>(vec4, 8, 3);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82110);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82111);FieldVector<Fraction> v5_i = new ArrayFieldVector<Fraction>(dvec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82112);Assert.assertEquals(9, v5_i.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82113);Assert.assertEquals(new Fraction(9), v5_i.getEntry(8));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82114);ArrayFieldVector<Fraction> v5 = new ArrayFieldVector<Fraction>(dvec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82115);Assert.assertEquals(9, v5.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82116);Assert.assertEquals(new Fraction(9), v5.getEntry(8));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82117);ArrayFieldVector<Fraction> v6 = new ArrayFieldVector<Fraction>(dvec1, 3, 2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82118);Assert.assertEquals(2, v6.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82119);Assert.assertEquals(new Fraction(4), v6.getEntry(0));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82120);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82121);new ArrayFieldVector<Fraction>(dvec1, 8, 3);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82122);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82123);ArrayFieldVector<Fraction> v7 = new ArrayFieldVector<Fraction>(v1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82124);Assert.assertEquals(7, v7.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82125);Assert.assertEquals(new Fraction(0), v7.getEntry(6));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82126);FieldVectorTestImpl<Fraction> v7_i = new FieldVectorTestImpl<Fraction>(vec1);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82127);ArrayFieldVector<Fraction> v7_2 = new ArrayFieldVector<Fraction>(v7_i);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82128);Assert.assertEquals(3, v7_2.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82129);Assert.assertEquals(new Fraction(2), v7_2.getEntry(1));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82130);ArrayFieldVector<Fraction> v8 = new ArrayFieldVector<Fraction>(v1, true);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82131);Assert.assertEquals(7, v8.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82132);Assert.assertEquals(new Fraction(0), v8.getEntry(6));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82133);Assert.assertNotSame("testData not same object ", v1.getDataRef(), v8.getDataRef());

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82134);ArrayFieldVector<Fraction> v8_2 = new ArrayFieldVector<Fraction>(v1, false);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82135);Assert.assertEquals(7, v8_2.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82136);Assert.assertEquals(new Fraction(0), v8_2.getEntry(6));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82137);Assert.assertArrayEquals(v1.getDataRef(), v8_2.getDataRef());

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82138);ArrayFieldVector<Fraction> v9 = new ArrayFieldVector<Fraction>(v1, v3);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82139);Assert.assertEquals(10, v9.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82140);Assert.assertEquals(new Fraction(1), v9.getEntry(7));

    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testDataInOut() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11wdqb01rdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testDataInOut",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11wdqb01rdp(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82141);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82142);ArrayFieldVector<Fraction> v1 = new ArrayFieldVector<Fraction>(vec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82143);ArrayFieldVector<Fraction> v2 = new ArrayFieldVector<Fraction>(vec2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82144);ArrayFieldVector<Fraction> v4 = new ArrayFieldVector<Fraction>(vec4);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82145);FieldVectorTestImpl<Fraction> v2_t = new FieldVectorTestImpl<Fraction>(vec2);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82146);FieldVector<Fraction> v_append_1 = v1.append(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82147);Assert.assertEquals(6, v_append_1.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82148);Assert.assertEquals(new Fraction(4), v_append_1.getEntry(3));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82149);FieldVector<Fraction> v_append_2 = v1.append(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82150);Assert.assertEquals(4, v_append_2.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82151);Assert.assertEquals(new Fraction(2), v_append_2.getEntry(3));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82152);FieldVector<Fraction> v_append_4 = v1.append(v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82153);Assert.assertEquals(6, v_append_4.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82154);Assert.assertEquals(new Fraction(4), v_append_4.getEntry(3));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82155);FieldVector<Fraction> v_copy = v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82156);Assert.assertEquals(3, v_copy.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82157);Assert.assertNotSame("testData not same object ", v1.getDataRef(), v_copy.getData());

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82158);Fraction[] a_frac = v1.toArray();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82159);Assert.assertEquals(3, a_frac.length);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82160);Assert.assertNotSame("testData not same object ", v1.getDataRef(), a_frac);


//      ArrayFieldVector<Fraction> vout4 = (ArrayFieldVector<Fraction>) v1.clone();
//      Assert.assertEquals(3, vout4.getDimension());
//      Assert.assertEquals(v1.getDataRef(), vout4.getDataRef());


        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82161);FieldVector<Fraction> vout5 = v4.getSubVector(3, 3);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82162);Assert.assertEquals(3, vout5.getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82163);Assert.assertEquals(new Fraction(5), vout5.getEntry(1));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82164);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82165);v4.getSubVector(3, 7);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82166);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82167);ArrayFieldVector<Fraction> v_set1 = (ArrayFieldVector<Fraction>) v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82168);v_set1.setEntry(1, new Fraction(11));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82169);Assert.assertEquals(new Fraction(11), v_set1.getEntry(1));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82170);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82171);v_set1.setEntry(3, new Fraction(11));
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82172);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82173);ArrayFieldVector<Fraction> v_set2 = (ArrayFieldVector<Fraction>) v4.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82174);v_set2.set(3, v1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82175);Assert.assertEquals(new Fraction(1), v_set2.getEntry(3));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82176);Assert.assertEquals(new Fraction(7), v_set2.getEntry(6));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82177);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82178);v_set2.set(7, v1);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82179);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82180);ArrayFieldVector<Fraction> v_set3 = (ArrayFieldVector<Fraction>) v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82181);v_set3.set(new Fraction(13));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82182);Assert.assertEquals(new Fraction(13), v_set3.getEntry(2));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82183);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82184);v_set3.getEntry(23);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82185);Assert.fail("ArrayIndexOutOfBoundsException expected");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82186);ArrayFieldVector<Fraction> v_set4 = (ArrayFieldVector<Fraction>) v4.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82187);v_set4.setSubVector(3, v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82188);Assert.assertEquals(new Fraction(4), v_set4.getEntry(3));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82189);Assert.assertEquals(new Fraction(7), v_set4.getEntry(6));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82190);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82191);v_set4.setSubVector(7, v2_t);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82192);Assert.fail("OutOfRangeException expected");
        } catch (OutOfRangeException ex) {
            // expected behavior
        }


        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82193);ArrayFieldVector<Fraction> vout10 = (ArrayFieldVector<Fraction>) v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82194);ArrayFieldVector<Fraction> vout10_2 = (ArrayFieldVector<Fraction>) v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82195);Assert.assertEquals(vout10, vout10_2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82196);vout10_2.setEntry(0, new Fraction(11, 10));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82197);Assert.assertNotSame(vout10, vout10_2);

    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testMapFunctions() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3rudk1rfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testMapFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3rudk1rfa(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82198);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82199);ArrayFieldVector<Fraction> v1 = new ArrayFieldVector<Fraction>(vec1);

        //octave =  v1 .+ 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82200);FieldVector<Fraction> v_mapAdd = v1.mapAdd(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82201);Fraction[] result_mapAdd = {new Fraction(3), new Fraction(4), new Fraction(5)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82202);checkArray("compare vectors" ,result_mapAdd,v_mapAdd.getData());

        //octave =  v1 .+ 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82203);FieldVector<Fraction> v_mapAddToSelf = v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82204);v_mapAddToSelf.mapAddToSelf(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82205);Fraction[] result_mapAddToSelf = {new Fraction(3), new Fraction(4), new Fraction(5)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82206);checkArray("compare vectors" ,result_mapAddToSelf,v_mapAddToSelf.getData());

        //octave =  v1 .- 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82207);FieldVector<Fraction> v_mapSubtract = v1.mapSubtract(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82208);Fraction[] result_mapSubtract = {new Fraction(-1), new Fraction(0), new Fraction(1)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82209);checkArray("compare vectors" ,result_mapSubtract,v_mapSubtract.getData());

        //octave =  v1 .- 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82210);FieldVector<Fraction> v_mapSubtractToSelf = v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82211);v_mapSubtractToSelf.mapSubtractToSelf(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82212);Fraction[] result_mapSubtractToSelf = {new Fraction(-1), new Fraction(0), new Fraction(1)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82213);checkArray("compare vectors" ,result_mapSubtractToSelf,v_mapSubtractToSelf.getData());

        //octave =  v1 .* 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82214);FieldVector<Fraction> v_mapMultiply = v1.mapMultiply(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82215);Fraction[] result_mapMultiply = {new Fraction(2), new Fraction(4), new Fraction(6)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82216);checkArray("compare vectors" ,result_mapMultiply,v_mapMultiply.getData());

        //octave =  v1 .* 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82217);FieldVector<Fraction> v_mapMultiplyToSelf = v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82218);v_mapMultiplyToSelf.mapMultiplyToSelf(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82219);Fraction[] result_mapMultiplyToSelf = {new Fraction(2), new Fraction(4), new Fraction(6)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82220);checkArray("compare vectors" ,result_mapMultiplyToSelf,v_mapMultiplyToSelf.getData());

        //octave =  v1 ./ 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82221);FieldVector<Fraction> v_mapDivide = v1.mapDivide(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82222);Fraction[] result_mapDivide = {new Fraction(1, 2), new Fraction(1), new Fraction(3, 2)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82223);checkArray("compare vectors" ,result_mapDivide,v_mapDivide.getData());

        //octave =  v1 ./ 2.0
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82224);FieldVector<Fraction> v_mapDivideToSelf = v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82225);v_mapDivideToSelf.mapDivideToSelf(new Fraction(2));
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82226);Fraction[] result_mapDivideToSelf = {new Fraction(1, 2), new Fraction(1), new Fraction(3, 2)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82227);checkArray("compare vectors" ,result_mapDivideToSelf,v_mapDivideToSelf.getData());

        //octave =  v1 .^-1
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82228);FieldVector<Fraction> v_mapInv = v1.mapInv();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82229);Fraction[] result_mapInv = {new Fraction(1),new Fraction(1, 2),new Fraction(1, 3)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82230);checkArray("compare vectors" ,result_mapInv,v_mapInv.getData());

        //octave =  v1 .^-1
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82231);FieldVector<Fraction> v_mapInvToSelf = v1.copy();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82232);v_mapInvToSelf.mapInvToSelf();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82233);Fraction[] result_mapInvToSelf = {new Fraction(1),new Fraction(1, 2),new Fraction(1, 3)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82234);checkArray("compare vectors" ,result_mapInvToSelf,v_mapInvToSelf.getData());

    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testBasicFunctions() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dwd5y1rgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testBasicFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dwd5y1rgb(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82235);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82236);ArrayFieldVector<Fraction> v1 = new ArrayFieldVector<Fraction>(vec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82237);ArrayFieldVector<Fraction> v2 = new ArrayFieldVector<Fraction>(vec2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82238);new ArrayFieldVector<Fraction>(vec_null);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82239);FieldVectorTestImpl<Fraction> v2_t = new FieldVectorTestImpl<Fraction>(vec2);

        //octave =  v1 + v2
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82240);ArrayFieldVector<Fraction> v_add = v1.add(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82241);Fraction[] result_add = {new Fraction(5), new Fraction(7), new Fraction(9)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82242);checkArray("compare vect" ,v_add.getData(),result_add);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82243);FieldVectorTestImpl<Fraction> vt2 = new FieldVectorTestImpl<Fraction>(vec2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82244);FieldVector<Fraction> v_add_i = v1.add(vt2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82245);Fraction[] result_add_i = {new Fraction(5), new Fraction(7), new Fraction(9)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82246);checkArray("compare vect" ,v_add_i.getData(),result_add_i);

        //octave =  v1 - v2
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82247);ArrayFieldVector<Fraction> v_subtract = v1.subtract(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82248);Fraction[] result_subtract = {new Fraction(-3), new Fraction(-3), new Fraction(-3)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82249);checkArray("compare vect" ,v_subtract.getData(),result_subtract);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82250);FieldVector<Fraction> v_subtract_i = v1.subtract(vt2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82251);Fraction[] result_subtract_i = {new Fraction(-3), new Fraction(-3), new Fraction(-3)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82252);checkArray("compare vect" ,v_subtract_i.getData(),result_subtract_i);

        // octave v1 .* v2
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82253);ArrayFieldVector<Fraction>  v_ebeMultiply = v1.ebeMultiply(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82254);Fraction[] result_ebeMultiply = {new Fraction(4), new Fraction(10), new Fraction(18)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82255);checkArray("compare vect" ,v_ebeMultiply.getData(),result_ebeMultiply);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82256);FieldVector<Fraction>  v_ebeMultiply_2 = v1.ebeMultiply(v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82257);Fraction[] result_ebeMultiply_2 = {new Fraction(4), new Fraction(10), new Fraction(18)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82258);checkArray("compare vect" ,v_ebeMultiply_2.getData(),result_ebeMultiply_2);

        // octave v1 ./ v2
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82259);ArrayFieldVector<Fraction>  v_ebeDivide = v1.ebeDivide(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82260);Fraction[] result_ebeDivide = {new Fraction(1, 4), new Fraction(2, 5), new Fraction(1, 2)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82261);checkArray("compare vect" ,v_ebeDivide.getData(),result_ebeDivide);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82262);FieldVector<Fraction>  v_ebeDivide_2 = v1.ebeDivide(v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82263);Fraction[] result_ebeDivide_2 = {new Fraction(1, 4), new Fraction(2, 5), new Fraction(1, 2)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82264);checkArray("compare vect" ,v_ebeDivide_2.getData(),result_ebeDivide_2);

        // octave  dot(v1,v2)
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82265);Fraction dot =  v1.dotProduct(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82266);Assert.assertEquals("compare val ",new Fraction(32), dot);

        // octave  dot(v1,v2_t)
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82267);Fraction dot_2 =  v1.dotProduct(v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82268);Assert.assertEquals("compare val ",new Fraction(32), dot_2);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82269);FieldMatrix<Fraction> m_outerProduct = v1.outerProduct(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82270);Assert.assertEquals("compare val ",new Fraction(4), m_outerProduct.getEntry(0,0));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82271);FieldMatrix<Fraction> m_outerProduct_2 = v1.outerProduct(v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82272);Assert.assertEquals("compare val ",new Fraction(4), m_outerProduct_2.getEntry(0,0));

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82273);ArrayFieldVector<Fraction> v_projection = v1.projection(v2);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82274);Fraction[] result_projection = {new Fraction(128, 77), new Fraction(160, 77), new Fraction(192, 77)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82275);checkArray("compare vect", v_projection.getData(), result_projection);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82276);FieldVector<Fraction> v_projection_2 = v1.projection(v2_t);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82277);Fraction[] result_projection_2 = {new Fraction(128, 77), new Fraction(160, 77), new Fraction(192, 77)};
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82278);checkArray("compare vect", v_projection_2.getData(), result_projection_2);

    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testMisc() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mluxnf1rhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testMisc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mluxnf1rhj(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82279);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82280);ArrayFieldVector<Fraction> v1 = new ArrayFieldVector<Fraction>(vec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82281);ArrayFieldVector<Fraction> v4 = new ArrayFieldVector<Fraction>(vec4);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82282);FieldVector<Fraction> v4_2 = new ArrayFieldVector<Fraction>(vec4);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82283);String out1 = v1.toString();
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82284);Assert.assertTrue("some output ",  out1.length()!=0);
        /*
         Fraction[] dout1 = v1.copyOut();
        Assert.assertEquals(3, dout1.length);
        assertNotSame("testData not same object ", v1.getDataRef(), dout1);
         */
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82285);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82286);v1.checkVectorDimensions(2);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82287);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

       __CLR4_4_11r9n1r9nlb90pczu.R.inc(82288);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82289);v1.checkVectorDimensions(v4);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82290);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82291);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82292);v1.checkVectorDimensions(v4_2);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82293);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testSerial()  {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16f44lv1rhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testSerial",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16f44lv1rhy(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82294);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82295);ArrayFieldVector<Fraction> v = new ArrayFieldVector<Fraction>(vec1);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82296);Assert.assertEquals(v,TestUtils.serializeAndRecover(v));
    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testZeroVectors() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xq6fdp1ri1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testZeroVectors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xq6fdp1ri1(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82297);

        // when the field is not specified, array cannot be empty
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82298);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82299);new ArrayFieldVector<Fraction>(new Fraction[0]);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82300);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82301);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82302);new ArrayFieldVector<Fraction>(new Fraction[0], true);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82303);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82304);try {
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82305);new ArrayFieldVector<Fraction>(new Fraction[0], false);
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82306);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }

        // when the field is specified, array can be empty
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82307);Assert.assertEquals(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), new Fraction[0]).getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82308);Assert.assertEquals(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), new Fraction[0], true).getDimension());
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82309);Assert.assertEquals(0, new ArrayFieldVector<Fraction>(FractionField.getInstance(), new Fraction[0], false).getDimension());

    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    @Test
    public void testOuterProduct() {__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceStart(getClass().getName(),82310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd5w431rie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11r9n1r9nlb90pczu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11r9n1r9nlb90pczu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.ArrayFieldVectorTest.testOuterProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd5w431rie(){try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82310);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82311);final ArrayFieldVector<Fraction> u
            = new ArrayFieldVector<Fraction>(FractionField.getInstance(),
                                             new Fraction[] {new Fraction(1),
                                                             new Fraction(2),
                                                             new Fraction(-3)});
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82312);final ArrayFieldVector<Fraction> v
            = new ArrayFieldVector<Fraction>(FractionField.getInstance(),
                                             new Fraction[] {new Fraction(4),
                                                             new Fraction(-2)});

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82313);final FieldMatrix<Fraction> uv = u.outerProduct(v);

        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82314);final double tol = Math.ulp(1d);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82315);Assert.assertEquals(new Fraction(4).doubleValue(), uv.getEntry(0, 0).doubleValue(), tol);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82316);Assert.assertEquals(new Fraction(-2).doubleValue(), uv.getEntry(0, 1).doubleValue(), tol);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82317);Assert.assertEquals(new Fraction(8).doubleValue(), uv.getEntry(1, 0).doubleValue(), tol);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82318);Assert.assertEquals(new Fraction(-4).doubleValue(), uv.getEntry(1, 1).doubleValue(), tol);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82319);Assert.assertEquals(new Fraction(-12).doubleValue(), uv.getEntry(2, 0).doubleValue(), tol);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82320);Assert.assertEquals(new Fraction(6).doubleValue(), uv.getEntry(2, 1).doubleValue(), tol);
    }finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

    /** verifies that two vectors are equals */
    protected void checkArray(String msg, Fraction[] m, Fraction[] n) {try{__CLR4_4_11r9n1r9nlb90pczu.R.inc(82321);
        __CLR4_4_11r9n1r9nlb90pczu.R.inc(82322);if ((((m.length != n.length)&&(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82323)!=0|true))||(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82324)==0&false))) {{
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82325);Assert.fail("vectors have different lengths");
        }
        }__CLR4_4_11r9n1r9nlb90pczu.R.inc(82326);for (int i = 0; (((i < m.length)&&(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82327)!=0|true))||(__CLR4_4_11r9n1r9nlb90pczu.R.iget(82328)==0&false)); i++) {{
            __CLR4_4_11r9n1r9nlb90pczu.R.inc(82329);Assert.assertEquals(msg + " " +  i + " elements differ", m[i],n[i]);
        }
    }}finally{__CLR4_4_11r9n1r9nlb90pczu.R.flushNeeded();}}

}
