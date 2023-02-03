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
package org.apache.commons.math3.stat.descriptive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.DefaultTransformer;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.NumberTransformer;

/**
 * @version $Id$
 */
public class ListUnivariateImpl extends DescriptiveStatistics implements Serializable {public static class __CLR4_4_12ah32ah3lb90pemm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,106957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serializable version identifier */
    private static final long serialVersionUID = -8837442489133392138L;

    /**
     * Holds a reference to a list - GENERICs are going to make
     * our lives easier here as we could only accept List<Number>
     */
    protected List<Object> list;

    /** Number Transformer maps Objects to Number for us. */
    protected NumberTransformer transformer;

    /**
     * No argument Constructor
     */
    public ListUnivariateImpl(){
        this(new ArrayList<Object>());__CLR4_4_12ah32ah3lb90pemm.R.inc(106888);try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106887);
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Construct a ListUnivariate with a specific List.
     * @param list The list that will back this DescriptiveStatistics
     */
    public ListUnivariateImpl(List<Object> list) {
        this(list, new DefaultTransformer());__CLR4_4_12ah32ah3lb90pemm.R.inc(106890);try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106889);
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Construct a ListUnivariate with a specific List.
     * @param list The list that will back this DescriptiveStatistics
     * @param transformer the number transformer used to convert the list items.
     */
    public ListUnivariateImpl(List<Object> list, NumberTransformer transformer) {
        super();__CLR4_4_12ah32ah3lb90pemm.R.inc(106892);try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106891);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106893);this.list = list;
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106894);this.transformer = transformer;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double[] getValues() {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106895);

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106896);int length = list.size();

        // If the window size is not INFINITE_WINDOW AND
        // the current list is larger that the window size, we need to
        // take into account only the last n elements of the list
        // as definied by windowSize

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106897);final int wSize = getWindowSize();
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106898);if ((((wSize != DescriptiveStatistics.INFINITE_WINDOW && wSize < list.size())&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106899)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106900)==0&false))) {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106901);length = list.size() - FastMath.max(0, list.size() - wSize);
        }

        // Create an array to hold all values
        }__CLR4_4_12ah32ah3lb90pemm.R.inc(106902);double[] copiedArray = new double[length];

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106903);for (int i = 0; (((i < copiedArray.length)&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106904)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106905)==0&false)); i++) {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106906);copiedArray[i] = getElement(i);
        }
        }__CLR4_4_12ah32ah3lb90pemm.R.inc(106907);return copiedArray;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public double getElement(int index) {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106908);

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106909);double value = Double.NaN;

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106910);int calcIndex = index;

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106911);final int wSize = getWindowSize();
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106912);if ((((wSize != DescriptiveStatistics.INFINITE_WINDOW && wSize < list.size())&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106913)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106914)==0&false))) {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106915);calcIndex = (list.size() - wSize) + index;
        }


        }__CLR4_4_12ah32ah3lb90pemm.R.inc(106916);try {
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106917);value = transformer.transform(list.get(calcIndex));
        } catch (MathIllegalArgumentException e) {
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106918);e.printStackTrace();
        }

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106919);return value;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public long getN() {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106920);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106921);int n = 0;

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106922);final int wSize = getWindowSize();
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106923);if ((((wSize != DescriptiveStatistics.INFINITE_WINDOW)&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106924)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106925)==0&false))) {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106926);if ((((list.size() > wSize)&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106927)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106928)==0&false))) {{
                __CLR4_4_12ah32ah3lb90pemm.R.inc(106929);n = wSize;
            } }else {{
                __CLR4_4_12ah32ah3lb90pemm.R.inc(106930);n = list.size();
            }
        }} }else {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106931);n = list.size();
        }
        }__CLR4_4_12ah32ah3lb90pemm.R.inc(106932);return n;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addValue(double v) {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106933);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106934);list.add(Double.valueOf(v));
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Adds an object to this list.
     * @param o Object to add to the list
     */
    public void addObject(Object o) {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106935);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106936);list.add(o);
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Clears all statistics.
     * <p>
     * <strong>N.B.: </strong> This method has the side effect of clearing the underlying list.
     */
    @Override
    public void clear() {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106937);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106938);list.clear();
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Apply the given statistic to this univariate collection.
     * @param stat the statistic to apply
     * @return the computed value of the statistic.
     */
    @Override
    public double apply(UnivariateStatistic stat) {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106939);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106940);double[] v = this.getValues();

        __CLR4_4_12ah32ah3lb90pemm.R.inc(106941);if ((((v != null)&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106942)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106943)==0&false))) {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106944);return stat.evaluate(v, 0, v.length);
        }
        }__CLR4_4_12ah32ah3lb90pemm.R.inc(106945);return Double.NaN;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Access the number transformer.
     * @return the number transformer.
     */
    public NumberTransformer getTransformer() {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106946);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106947);return transformer;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /**
     * Modify the number transformer.
     * @param transformer the new number transformer.
     */
    public void setTransformer(NumberTransformer transformer) {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106948);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106949);this.transformer = transformer;
    }finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setWindowSize(int windowSize) {try{__CLR4_4_12ah32ah3lb90pemm.R.inc(106950);
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106951);super.setWindowSize(windowSize);
        //Discard elements from the front of the list if the windowSize is less than
        // the size of the list.
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106952);int extra = list.size() - windowSize;
        __CLR4_4_12ah32ah3lb90pemm.R.inc(106953);for (int i = 0; (((i < extra)&&(__CLR4_4_12ah32ah3lb90pemm.R.iget(106954)!=0|true))||(__CLR4_4_12ah32ah3lb90pemm.R.iget(106955)==0&false)); i++) {{
            __CLR4_4_12ah32ah3lb90pemm.R.inc(106956);list.remove(0);
        }
    }}finally{__CLR4_4_12ah32ah3lb90pemm.R.flushNeeded();}}

}
