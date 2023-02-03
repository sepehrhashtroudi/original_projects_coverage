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


import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionConversionException;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.junit.Assert;
import org.junit.Test;


/**
 * Test cases for the {@link SparseFieldVector} class.
 *
 * @version $Id$
 */
public class SparseFieldVectorTest {static class __CLR4_4_11wzv1wzvlb90pddu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,89534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //
    protected Fraction[][] ma1 = {{new Fraction(1), new Fraction(2), new Fraction(3)}, {new Fraction(4), new Fraction(5), new Fraction(6)}, {new Fraction(7), new Fraction(8), new Fraction(9)}};
    protected Fraction[] vec1 = {new Fraction(1), new Fraction(2), new Fraction(3)};
    protected Fraction[] vec2 = {new Fraction(4), new Fraction(5), new Fraction(6)};
    protected Fraction[] vec3 = {new Fraction(7), new Fraction(8), new Fraction(9)};
    protected Fraction[] vec4 = {new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7), new Fraction(8), new Fraction(9)};
    protected Fraction[] vec_null = {new Fraction(0), new Fraction(0), new Fraction(0)};
    protected Fraction[] dvec1 = {new Fraction(1), new Fraction(2), new Fraction(3), new Fraction(4), new Fraction(5), new Fraction(6), new Fraction(7), new Fraction(8),new Fraction(9)};
    protected Fraction[][] mat1 = {{new Fraction(1), new Fraction(2), new Fraction(3)}, {new Fraction(4), new Fraction(5), new Fraction(6)},{ new Fraction(7), new Fraction(8), new Fraction(9)}};

    // tolerances
    protected double entryTolerance = 10E-16;
    protected double normTolerance = 10E-14;

    protected FractionField field = FractionField.getInstance();

    @Test
    public void testMapFunctions() throws FractionConversionException {__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceStart(getClass().getName(),89419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x3rudk1wzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wzv1wzvlb90pddu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldVectorTest.testMapFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x3rudk1wzv() throws FractionConversionException{try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89419);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89420);SparseFieldVector<Fraction> v1 = new SparseFieldVector<Fraction>(field,vec1);

        //octave =  v1 .+ 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89421);FieldVector<Fraction> v_mapAdd = v1.mapAdd(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89422);Fraction[] result_mapAdd = {new Fraction(3), new Fraction(4), new Fraction(5)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89423);Assert.assertArrayEquals("compare vectors" ,result_mapAdd,v_mapAdd.getData());

        //octave =  v1 .+ 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89424);FieldVector<Fraction> v_mapAddToSelf = v1.copy();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89425);v_mapAddToSelf.mapAddToSelf(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89426);Fraction[] result_mapAddToSelf = {new Fraction(3), new Fraction(4), new Fraction(5)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89427);Assert.assertArrayEquals("compare vectors" ,result_mapAddToSelf,v_mapAddToSelf.getData());

        //octave =  v1 .- 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89428);FieldVector<Fraction> v_mapSubtract = v1.mapSubtract(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89429);Fraction[] result_mapSubtract = {new Fraction(-1), new Fraction(0), new Fraction(1)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89430);Assert.assertArrayEquals("compare vectors" ,result_mapSubtract,v_mapSubtract.getData());

        //octave =  v1 .- 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89431);FieldVector<Fraction> v_mapSubtractToSelf = v1.copy();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89432);v_mapSubtractToSelf.mapSubtractToSelf(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89433);Fraction[] result_mapSubtractToSelf = {new Fraction(-1), new Fraction(0), new Fraction(1)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89434);Assert.assertArrayEquals("compare vectors" ,result_mapSubtractToSelf,v_mapSubtractToSelf.getData());

        //octave =  v1 .* 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89435);FieldVector<Fraction> v_mapMultiply = v1.mapMultiply(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89436);Fraction[] result_mapMultiply = {new Fraction(2), new Fraction(4), new Fraction(6)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89437);Assert.assertArrayEquals("compare vectors" ,result_mapMultiply,v_mapMultiply.getData());

        //octave =  v1 .* 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89438);FieldVector<Fraction> v_mapMultiplyToSelf = v1.copy();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89439);v_mapMultiplyToSelf.mapMultiplyToSelf(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89440);Fraction[] result_mapMultiplyToSelf = {new Fraction(2), new Fraction(4), new Fraction(6)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89441);Assert.assertArrayEquals("compare vectors" ,result_mapMultiplyToSelf,v_mapMultiplyToSelf.getData());

        //octave =  v1 ./ 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89442);FieldVector<Fraction> v_mapDivide = v1.mapDivide(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89443);Fraction[] result_mapDivide = {new Fraction(.5d), new Fraction(1), new Fraction(1.5d)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89444);Assert.assertArrayEquals("compare vectors" ,result_mapDivide,v_mapDivide.getData());

        //octave =  v1 ./ 2.0
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89445);FieldVector<Fraction> v_mapDivideToSelf = v1.copy();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89446);v_mapDivideToSelf.mapDivideToSelf(new Fraction(2));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89447);Fraction[] result_mapDivideToSelf = {new Fraction(.5d), new Fraction(1), new Fraction(1.5d)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89448);Assert.assertArrayEquals("compare vectors" ,result_mapDivideToSelf,v_mapDivideToSelf.getData());

        //octave =  v1 .^-1
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89449);FieldVector<Fraction> v_mapInv = v1.mapInv();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89450);Fraction[] result_mapInv = {new Fraction(1),new Fraction(0.5d),new Fraction(3.333333333333333e-01d)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89451);Assert.assertArrayEquals("compare vectors" ,result_mapInv,v_mapInv.getData());

        //octave =  v1 .^-1
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89452);FieldVector<Fraction> v_mapInvToSelf = v1.copy();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89453);v_mapInvToSelf.mapInvToSelf();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89454);Fraction[] result_mapInvToSelf = {new Fraction(1),new Fraction(0.5d),new Fraction(3.333333333333333e-01d)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89455);Assert.assertArrayEquals("compare vectors" ,result_mapInvToSelf,v_mapInvToSelf.getData());


    }finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

    @Test
    public void testBasicFunctions() throws FractionConversionException {__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceStart(getClass().getName(),89456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17dwd5y1x0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wzv1wzvlb90pddu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldVectorTest.testBasicFunctions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17dwd5y1x0w() throws FractionConversionException{try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89456);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89457);SparseFieldVector<Fraction> v1 = new SparseFieldVector<Fraction>(field,vec1);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89458);SparseFieldVector<Fraction> v2 = new SparseFieldVector<Fraction>(field,vec2);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89459);FieldVector<Fraction> v2_t = new ArrayFieldVectorTest.FieldVectorTestImpl<Fraction>(vec2);

        //octave =  v1 + v2
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89460);FieldVector<Fraction> v_add = v1.add(v2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89461);Fraction[] result_add = {new Fraction(5), new Fraction(7), new Fraction(9)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89462);Assert.assertArrayEquals("compare vect" ,v_add.getData(),result_add);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89463);FieldVector<Fraction> vt2 = new ArrayFieldVectorTest.FieldVectorTestImpl<Fraction>(vec2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89464);FieldVector<Fraction> v_add_i = v1.add(vt2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89465);Fraction[] result_add_i = {new Fraction(5), new Fraction(7), new Fraction(9)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89466);Assert.assertArrayEquals("compare vect" ,v_add_i.getData(),result_add_i);

        //octave =  v1 - v2
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89467);SparseFieldVector<Fraction> v_subtract = v1.subtract(v2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89468);Fraction[] result_subtract = {new Fraction(-3), new Fraction(-3), new Fraction(-3)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89469);assertClose("compare vect" ,v_subtract.getData(),result_subtract,normTolerance);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89470);FieldVector<Fraction> v_subtract_i = v1.subtract(vt2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89471);Fraction[] result_subtract_i = {new Fraction(-3), new Fraction(-3), new Fraction(-3)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89472);assertClose("compare vect" ,v_subtract_i.getData(),result_subtract_i,normTolerance);

        // octave v1 .* v2
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89473);FieldVector<Fraction>  v_ebeMultiply = v1.ebeMultiply(v2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89474);Fraction[] result_ebeMultiply = {new Fraction(4), new Fraction(10), new Fraction(18)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89475);assertClose("compare vect" ,v_ebeMultiply.getData(),result_ebeMultiply,normTolerance);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89476);FieldVector<Fraction>  v_ebeMultiply_2 = v1.ebeMultiply(v2_t);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89477);Fraction[] result_ebeMultiply_2 = {new Fraction(4), new Fraction(10), new Fraction(18)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89478);assertClose("compare vect" ,v_ebeMultiply_2.getData(),result_ebeMultiply_2,normTolerance);

        // octave v1 ./ v2
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89479);FieldVector<Fraction>  v_ebeDivide = v1.ebeDivide(v2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89480);Fraction[] result_ebeDivide = {new Fraction(0.25d), new Fraction(0.4d), new Fraction(0.5d)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89481);assertClose("compare vect" ,v_ebeDivide.getData(),result_ebeDivide,normTolerance);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89482);FieldVector<Fraction>  v_ebeDivide_2 = v1.ebeDivide(v2_t);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89483);Fraction[] result_ebeDivide_2 = {new Fraction(0.25d), new Fraction(0.4d), new Fraction(0.5d)};
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89484);assertClose("compare vect" ,v_ebeDivide_2.getData(),result_ebeDivide_2,normTolerance);

        // octave  dot(v1,v2)
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89485);Fraction dot =  v1.dotProduct(v2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89486);Assert.assertEquals("compare val ",new Fraction(32), dot);

        // octave  dot(v1,v2_t)
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89487);Fraction dot_2 =  v1.dotProduct(v2_t);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89488);Assert.assertEquals("compare val ",new Fraction(32), dot_2);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89489);FieldMatrix<Fraction> m_outerProduct = v1.outerProduct(v2);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89490);Assert.assertEquals("compare val ",new Fraction(4), m_outerProduct.getEntry(0,0));

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89491);FieldMatrix<Fraction> m_outerProduct_2 = v1.outerProduct(v2_t);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89492);Assert.assertEquals("compare val ",new Fraction(4), m_outerProduct_2.getEntry(0,0));

    }finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

    @Test
    public void testOuterProduct() {__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceStart(getClass().getName(),89493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gd5w431x1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wzv1wzvlb90pddu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldVectorTest.testOuterProduct",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gd5w431x1x(){try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89493);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89494);final SparseFieldVector<Fraction> u
            = new SparseFieldVector<Fraction>(FractionField.getInstance(),
                                              new Fraction[] {new Fraction(1),
                                                              new Fraction(2),
                                                              new Fraction(-3)});
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89495);final SparseFieldVector<Fraction> v
            = new SparseFieldVector<Fraction>(FractionField.getInstance(),
                                              new Fraction[] {new Fraction(4),
                                                              new Fraction(-2)});

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89496);final FieldMatrix<Fraction> uv = u.outerProduct(v);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89497);final double tol = Math.ulp(1d);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89498);Assert.assertEquals(new Fraction(4).doubleValue(), uv.getEntry(0, 0).doubleValue(), tol);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89499);Assert.assertEquals(new Fraction(-2).doubleValue(), uv.getEntry(0, 1).doubleValue(), tol);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89500);Assert.assertEquals(new Fraction(8).doubleValue(), uv.getEntry(1, 0).doubleValue(), tol);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89501);Assert.assertEquals(new Fraction(-4).doubleValue(), uv.getEntry(1, 1).doubleValue(), tol);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89502);Assert.assertEquals(new Fraction(-12).doubleValue(), uv.getEntry(2, 0).doubleValue(), tol);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89503);Assert.assertEquals(new Fraction(6).doubleValue(), uv.getEntry(2, 1).doubleValue(), tol);
    }finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

    @Test
    public void testMisc() {__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceStart(getClass().getName(),89504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mluxnf1x28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wzv1wzvlb90pddu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldVectorTest.testMisc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mluxnf1x28(){try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89504);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89505);SparseFieldVector<Fraction> v1 = new SparseFieldVector<Fraction>(field,vec1);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89506);String out1 = v1.toString();
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89507);Assert.assertTrue("some output ",  out1.length()!=0);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89508);try {
            __CLR4_4_11wzv1wzvlb90pddu.R.inc(89509);v1.checkVectorDimensions(2);
            __CLR4_4_11wzv1wzvlb90pddu.R.inc(89510);Assert.fail("MathIllegalArgumentException expected");
        } catch (MathIllegalArgumentException ex) {
            // expected behavior
        }


    }finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

    @Test
    public void testPredicates() {__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceStart(getClass().getName(),89511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1svs9ez1x2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11wzv1wzvlb90pddu.R.rethrow($CLV_t2$);}finally{__CLR4_4_11wzv1wzvlb90pddu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.linear.SparseFieldVectorTest.testPredicates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),89511,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1svs9ez1x2f(){try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89511);

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89512);SparseFieldVector<Fraction> v = new SparseFieldVector<Fraction>(field, new Fraction[] { new Fraction(0), new Fraction(1), new Fraction(2) });

        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89513);v.setEntry(0, field.getZero());
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89514);Assert.assertEquals(v, new SparseFieldVector<Fraction>(field, new Fraction[] { new Fraction(0), new Fraction(1), new Fraction(2) }));
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89515);Assert.assertNotSame(v, new SparseFieldVector<Fraction>(field, new Fraction[] { new Fraction(0), new Fraction(1), new Fraction(2), new Fraction(3) }));

    }finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

    /** verifies that two vectors are close (sup norm) */
    protected void assertEquals(String msg, Fraction[] m, Fraction[] n) {try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89516);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89517);if ((((m.length != n.length)&&(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89518)!=0|true))||(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89519)==0&false))) {{
            __CLR4_4_11wzv1wzvlb90pddu.R.inc(89520);Assert.fail("vectors have different lengths");
        }
        }__CLR4_4_11wzv1wzvlb90pddu.R.inc(89521);for (int i = 0; (((i < m.length)&&(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89522)!=0|true))||(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89523)==0&false)); i++) {{
            __CLR4_4_11wzv1wzvlb90pddu.R.inc(89524);Assert.assertEquals(msg + " " +  i + " elements differ", m[i],n[i]);
        }
    }}finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

    /** verifies that two vectors are close (sup norm) */
    protected void assertClose(String msg, Fraction[] m, Fraction[] n, double tolerance) {try{__CLR4_4_11wzv1wzvlb90pddu.R.inc(89525);
        __CLR4_4_11wzv1wzvlb90pddu.R.inc(89526);if ((((m.length != n.length)&&(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89527)!=0|true))||(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89528)==0&false))) {{
            __CLR4_4_11wzv1wzvlb90pddu.R.inc(89529);Assert.fail("vectors have different lengths");
        }
        }__CLR4_4_11wzv1wzvlb90pddu.R.inc(89530);for (int i = 0; (((i < m.length)&&(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89531)!=0|true))||(__CLR4_4_11wzv1wzvlb90pddu.R.iget(89532)==0&false)); i++) {{
            __CLR4_4_11wzv1wzvlb90pddu.R.inc(89533);Assert.assertEquals(msg + " " +  i + " elements differ", m[i].doubleValue(),n[i].doubleValue(), tolerance);
        }
    }}finally{__CLR4_4_11wzv1wzvlb90pddu.R.flushNeeded();}}

}
