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

import org.apache.commons.math3.Field;
import org.apache.commons.math3.FieldElement;
import org.apache.commons.math3.util.OpenIntToFieldHashMap;

/**
 * Sparse matrix implementation based on an open addressed map.
 *
 * @param <T> the type of the field elements
 * @version $Id$
 * @since 2.0
 * @deprecated As of version 3.1, this class is deprecated, for reasons exposed
 * in this JIRA
 * <a href="https://issues.apache.org/jira/browse/MATH-870">ticket</a>. This
 * class will be removed in version 4.0.
 *
 */
@Deprecated
public class SparseFieldMatrix<T extends FieldElement<T>> extends AbstractFieldMatrix<T> {public static class __CLR4_4_1ng8ng8lb90p959{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,30461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Storage for (sparse) matrix elements. */
    private final OpenIntToFieldHashMap<T> entries;
    /** Row dimension. */
    private final int rows;
    /** Column dimension. */
    private final int columns;

    /**
     * Create a matrix with no data.
     *
     * @param field Field to which the elements belong.
     */
    public SparseFieldMatrix(final Field<T> field) {
        super(field);__CLR4_4_1ng8ng8lb90p959.R.inc(30393);try{__CLR4_4_1ng8ng8lb90p959.R.inc(30392);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30394);rows = 0;
        __CLR4_4_1ng8ng8lb90p959.R.inc(30395);columns= 0;
        __CLR4_4_1ng8ng8lb90p959.R.inc(30396);entries = new OpenIntToFieldHashMap<T>(field);
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /**
     * Create a new SparseFieldMatrix<T> with the supplied row and column
     * dimensions.
     *
     * @param field Field to which the elements belong.
     * @param rowDimension Number of rows in the new matrix.
     * @param columnDimension Number of columns in the new matrix.
     * @throws org.apache.commons.math3.exception.NotStrictlyPositiveException
     * if row or column dimension is not positive.
     */
    public SparseFieldMatrix(final Field<T> field,
                             final int rowDimension, final int columnDimension) {
        super(field, rowDimension, columnDimension);__CLR4_4_1ng8ng8lb90p959.R.inc(30398);try{__CLR4_4_1ng8ng8lb90p959.R.inc(30397);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30399);this.rows = rowDimension;
        __CLR4_4_1ng8ng8lb90p959.R.inc(30400);this.columns = columnDimension;
        __CLR4_4_1ng8ng8lb90p959.R.inc(30401);entries = new OpenIntToFieldHashMap<T>(field);
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /**
     * Copy constructor.
     *
     * @param other Instance to copy.
     */
    public SparseFieldMatrix(SparseFieldMatrix<T> other) {
        super(other.getField(), other.getRowDimension(), other.getColumnDimension());__CLR4_4_1ng8ng8lb90p959.R.inc(30403);try{__CLR4_4_1ng8ng8lb90p959.R.inc(30402);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30404);rows = other.getRowDimension();
        __CLR4_4_1ng8ng8lb90p959.R.inc(30405);columns = other.getColumnDimension();
        __CLR4_4_1ng8ng8lb90p959.R.inc(30406);entries = new OpenIntToFieldHashMap<T>(other.entries);
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /**
     * Generic copy constructor.
     *
     * @param other Instance to copy.
     */
    public SparseFieldMatrix(FieldMatrix<T> other){
        super(other.getField(), other.getRowDimension(), other.getColumnDimension());__CLR4_4_1ng8ng8lb90p959.R.inc(30408);try{__CLR4_4_1ng8ng8lb90p959.R.inc(30407);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30409);rows = other.getRowDimension();
        __CLR4_4_1ng8ng8lb90p959.R.inc(30410);columns = other.getColumnDimension();
        __CLR4_4_1ng8ng8lb90p959.R.inc(30411);entries = new OpenIntToFieldHashMap<T>(getField());
        __CLR4_4_1ng8ng8lb90p959.R.inc(30412);for (int i = 0; (((i < rows)&&(__CLR4_4_1ng8ng8lb90p959.R.iget(30413)!=0|true))||(__CLR4_4_1ng8ng8lb90p959.R.iget(30414)==0&false)); i++) {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30415);for (int j = 0; (((j < columns)&&(__CLR4_4_1ng8ng8lb90p959.R.iget(30416)!=0|true))||(__CLR4_4_1ng8ng8lb90p959.R.iget(30417)==0&false)); j++) {{
                __CLR4_4_1ng8ng8lb90p959.R.inc(30418);setEntry(i, j, other.getEntry(i, j));
            }
        }}
    }}finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void addToEntry(int row, int column, T increment) {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30419);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30420);checkRowIndex(row);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30421);checkColumnIndex(column);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30422);final int key = computeKey(row, column);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30423);final T value = entries.get(key).add(increment);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30424);if ((((getField().getZero().equals(value))&&(__CLR4_4_1ng8ng8lb90p959.R.iget(30425)!=0|true))||(__CLR4_4_1ng8ng8lb90p959.R.iget(30426)==0&false))) {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30427);entries.remove(key);
        } }else {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30428);entries.put(key, value);
        }
    }}finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> copy() {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30429);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30430);return new SparseFieldMatrix<T>(this);
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public FieldMatrix<T> createMatrix(int rowDimension, int columnDimension) {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30431);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30432);return new SparseFieldMatrix<T>(getField(), rowDimension, columnDimension);
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getColumnDimension() {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30433);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30434);return columns;
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public T getEntry(int row, int column) {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30435);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30436);checkRowIndex(row);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30437);checkColumnIndex(column);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30438);return entries.get(computeKey(row, column));
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public int getRowDimension() {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30439);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30440);return rows;
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void multiplyEntry(int row, int column, T factor) {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30441);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30442);checkRowIndex(row);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30443);checkColumnIndex(column);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30444);final int key = computeKey(row, column);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30445);final T value = entries.get(key).multiply(factor);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30446);if ((((getField().getZero().equals(value))&&(__CLR4_4_1ng8ng8lb90p959.R.iget(30447)!=0|true))||(__CLR4_4_1ng8ng8lb90p959.R.iget(30448)==0&false))) {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30449);entries.remove(key);
        } }else {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30450);entries.put(key, value);
        }

    }}finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /** {@inheritDoc} */
    @Override
    public void setEntry(int row, int column, T value) {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30451);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30452);checkRowIndex(row);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30453);checkColumnIndex(column);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30454);if ((((getField().getZero().equals(value))&&(__CLR4_4_1ng8ng8lb90p959.R.iget(30455)!=0|true))||(__CLR4_4_1ng8ng8lb90p959.R.iget(30456)==0&false))) {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30457);entries.remove(computeKey(row, column));
        } }else {{
            __CLR4_4_1ng8ng8lb90p959.R.inc(30458);entries.put(computeKey(row, column), value);
        }
    }}finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}

    /**
     * Compute the key to access a matrix element.
     *
     * @param row Row index of the matrix element.
     * @param column Column index of the matrix element.
     * @return the key within the map to access the matrix element.
     */
    private int computeKey(int row, int column) {try{__CLR4_4_1ng8ng8lb90p959.R.inc(30459);
        __CLR4_4_1ng8ng8lb90p959.R.inc(30460);return row * columns + column;
    }finally{__CLR4_4_1ng8ng8lb90p959.R.flushNeeded();}}
}
