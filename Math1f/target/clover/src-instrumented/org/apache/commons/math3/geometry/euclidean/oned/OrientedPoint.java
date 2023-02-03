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
package org.apache.commons.math3.geometry.euclidean.oned;

import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;

/** This class represents a 1D oriented hyperplane.
 * <p>An hyperplane in 1D is a simple point, its orientation being a
 * boolean.</p>
 * <p>Instances of this class are guaranteed to be immutable.</p>
 * @version $Id$
 * @since 3.0
 */
public class OrientedPoint implements Hyperplane<Euclidean1D> {public static class __CLR4_4_1cdycdylb90p825{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,16076,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Vector location. */
    private Vector1D location;

    /** Orientation. */
    private boolean direct;

    /** Simple constructor.
     * @param location location of the hyperplane
     * @param direct if true, the plus side of the hyperplane is towards
     * abscissas greater than {@code location}
     */
    public OrientedPoint(final Vector1D location, final boolean direct) {try{__CLR4_4_1cdycdylb90p825.R.inc(16054);
        __CLR4_4_1cdycdylb90p825.R.inc(16055);this.location = location;
        __CLR4_4_1cdycdylb90p825.R.inc(16056);this.direct   = direct;
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** Copy the instance.
     * <p>Since instances are immutable, this method directly returns
     * the instance.</p>
     * @return the instance itself
     */
    public OrientedPoint copySelf() {try{__CLR4_4_1cdycdylb90p825.R.inc(16057);
        __CLR4_4_1cdycdylb90p825.R.inc(16058);return this;
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** {@inheritDoc} */
    public double getOffset(final Vector<Euclidean1D> point) {try{__CLR4_4_1cdycdylb90p825.R.inc(16059);
        __CLR4_4_1cdycdylb90p825.R.inc(16060);final double delta = ((Vector1D) point).getX() - location.getX();
        __CLR4_4_1cdycdylb90p825.R.inc(16061);return (((direct )&&(__CLR4_4_1cdycdylb90p825.R.iget(16062)!=0|true))||(__CLR4_4_1cdycdylb90p825.R.iget(16063)==0&false))? delta : -delta;
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** Build a region covering the whole hyperplane.
     * <p>Since this class represent zero dimension spaces which does
     * not have lower dimension sub-spaces, this method returns a dummy
     * implementation of a {@link
     * org.apache.commons.math3.geometry.partitioning.SubHyperplane SubHyperplane}.
     * This implementation is only used to allow the {@link
     * org.apache.commons.math3.geometry.partitioning.SubHyperplane
     * SubHyperplane} class implementation to work properly, it should
     * <em>not</em> be used otherwise.</p>
     * @return a dummy sub hyperplane
     */
    public SubOrientedPoint wholeHyperplane() {try{__CLR4_4_1cdycdylb90p825.R.inc(16064);
        __CLR4_4_1cdycdylb90p825.R.inc(16065);return new SubOrientedPoint(this, null);
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** Build a region covering the whole space.
     * @return a region containing the instance (really an {@link
     * IntervalsSet IntervalsSet} instance)
     */
    public IntervalsSet wholeSpace() {try{__CLR4_4_1cdycdylb90p825.R.inc(16066);
        __CLR4_4_1cdycdylb90p825.R.inc(16067);return new IntervalsSet();
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** {@inheritDoc} */
    public boolean sameOrientationAs(final Hyperplane<Euclidean1D> other) {try{__CLR4_4_1cdycdylb90p825.R.inc(16068);
        __CLR4_4_1cdycdylb90p825.R.inc(16069);return !(direct ^ ((OrientedPoint) other).direct);
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** Get the hyperplane location on the real line.
     * @return the hyperplane location
     */
    public Vector1D getLocation() {try{__CLR4_4_1cdycdylb90p825.R.inc(16070);
        __CLR4_4_1cdycdylb90p825.R.inc(16071);return location;
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** Check if the hyperplane orientation is direct.
     * @return true if the plus side of the hyperplane is towards
     * abscissae greater than hyperplane location
     */
    public boolean isDirect() {try{__CLR4_4_1cdycdylb90p825.R.inc(16072);
        __CLR4_4_1cdycdylb90p825.R.inc(16073);return direct;
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

    /** Revert the instance.
     */
    public void revertSelf() {try{__CLR4_4_1cdycdylb90p825.R.inc(16074);
        __CLR4_4_1cdycdylb90p825.R.inc(16075);direct = !direct;
    }finally{__CLR4_4_1cdycdylb90p825.R.flushNeeded();}}

}
