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

package org.apache.commons.math3.ode.events;

import java.util.Arrays;

/** Wrapper used to detect only increasing or decreasing events.
 *
 * <p>General {@link EventHandler events} are defined implicitely
 * by a {@link EventHandler#g(double, double[]) g function} crossing
 * zero. This function needs to be continuous in the event neighborhood,
 * and its sign must remain consistent between events. This implies that
 * during an ODE integration, events triggered are alternately events
 * for which the function increases from negative to positive values,
 * and events for which the function decreases from positive to
 * negative values.
 * </p>
 *
 * <p>Sometimes, users are only interested in one type of event (say
 * increasing events for example) and not in the other type. In these
 * cases, looking precisely for all events location and triggering
 * events that will later be ignored is a waste of computing time.</p>
 *
 * <p>Users can wrap a regular {@link EventHandler event handler} in
 * an instance of this class and provide this wrapping instance to
 * the {@link org.apache.commons.math3.ode.FirstOrderIntegrator ODE solver}
 * in order to avoid wasting time looking for uninteresting events.
 * The wrapper will intercept the calls to the {@link
 * EventHandler#g(double, double[]) g function} and to the {@link
 * EventHandler#eventOccurred(double, double[], boolean)
 * eventOccurred} method in order to ignore uninteresting events. The
 * wrapped regular {@link EventHandler event handler} will the see only
 * the interesting events, i.e. either only {@code increasing} events or
 * {@code decreasing} events. the number of calls to the {@link
 * EventHandler#g(double, double[]) g function} will also be reduced.</p>
 *
 * @version $Id$
 * @since 3.2
 */

public class EventFilter implements EventHandler {public static class __CLR4_4_1p6sp6slb90p9bz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,32711,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Number of past transformers updates stored. */
    private static final int HISTORY_SIZE = 100;

    /** Wrapped event handler. */
    private final EventHandler rawHandler;

    /** Filter to use. */
    private final FilterType filter;

    /** Transformers of the g function. */
    private final Transformer[] transformers;

    /** Update time of the transformers. */
    private final double[] updates;

    /** Indicator for forward integration. */
    private boolean forward;

    /** Extreme time encountered so far. */
    private double extremeT;

    /** Wrap an {@link EventHandler event handler}.
     * @param rawHandler event handler to wrap
     * @param filter filter to use
     */
    public EventFilter(final EventHandler rawHandler, final FilterType filter) {try{__CLR4_4_1p6sp6slb90p9bz.R.inc(32644);
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32645);this.rawHandler   = rawHandler;
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32646);this.filter       = filter;
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32647);this.transformers = new Transformer[HISTORY_SIZE];
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32648);this.updates      = new double[HISTORY_SIZE];
    }finally{__CLR4_4_1p6sp6slb90p9bz.R.flushNeeded();}}

    /**  {@inheritDoc} */
    public void init(double t0, double[] y0, double t) {try{__CLR4_4_1p6sp6slb90p9bz.R.inc(32649);

        // delegate to raw handler
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32650);rawHandler.init(t0, y0, t);

        // initialize events triggering logic
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32651);forward  = t >= t0;
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32652);extremeT = (((forward )&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32653)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32654)==0&false))? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32655);Arrays.fill(transformers, Transformer.UNINITIALIZED);
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32656);Arrays.fill(updates, extremeT);

    }finally{__CLR4_4_1p6sp6slb90p9bz.R.flushNeeded();}}

    /**  {@inheritDoc} */
    public double g(double t, double[] y) {try{__CLR4_4_1p6sp6slb90p9bz.R.inc(32657);

        __CLR4_4_1p6sp6slb90p9bz.R.inc(32658);final double rawG = rawHandler.g(t, y);

        // search which transformer should be applied to g
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32659);if ((((forward)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32660)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32661)==0&false))) {{
            __CLR4_4_1p6sp6slb90p9bz.R.inc(32662);final int last = transformers.length - 1;
            __CLR4_4_1p6sp6slb90p9bz.R.inc(32663);if ((((extremeT < t)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32664)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32665)==0&false))) {{
                // we are at the forward end of the history

                // check if a new rough root has been crossed
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32666);final Transformer previous = transformers[last];
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32667);final Transformer next     = filter.selectTransformer(previous, rawG, forward);
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32668);if ((((next != previous)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32669)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32670)==0&false))) {{
                    // there is a root somewhere between extremeT end t
                    // the new transformer, which is valid on both sides of the root,
                    // so it is valid for t (this is how we have just computed it above),
                    // but it was already valid before, so we store the switch at extremeT
                    // for safety, to ensure the previous transformer is not applied too
                    // close of the root
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32671);System.arraycopy(updates,      1, updates,      0, last);
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32672);System.arraycopy(transformers, 1, transformers, 0, last);
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32673);updates[last]      = extremeT;
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32674);transformers[last] = next;
                }

                }__CLR4_4_1p6sp6slb90p9bz.R.inc(32675);extremeT = t;

                // apply the transform
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32676);return next.transformed(rawG);

            } }else {{
                // we are in the middle of the history

                // select the transformer
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32677);for (int i = last; (((i > 0)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32678)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32679)==0&false)); --i) {{
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32680);if ((((updates[i] <= t)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32681)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32682)==0&false))) {{
                        // apply the transform
                        __CLR4_4_1p6sp6slb90p9bz.R.inc(32683);return transformers[i].transformed(rawG);
                    }
                }}

                }__CLR4_4_1p6sp6slb90p9bz.R.inc(32684);return transformers[0].transformed(rawG);

            }
        }} }else {{
            __CLR4_4_1p6sp6slb90p9bz.R.inc(32685);if ((((t < extremeT)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32686)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32687)==0&false))) {{
                // we are at the backward end of the history

                // check if a new rough root has been crossed
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32688);final Transformer previous = transformers[0];
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32689);final Transformer next     = filter.selectTransformer(previous, rawG, forward);
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32690);if ((((next != previous)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32691)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32692)==0&false))) {{
                    // there is a root somewhere between extremeT end t
                    // the new transformer, which is valid on both sides of the root,
                    // so it is valid for t (this is how we have just computed it above),
                    // but it was already valid before, so we store the switch at extremeT
                    // for safety, to ensure the previous transformer is not applied too
                    // close of the root
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32693);System.arraycopy(updates,      0, updates,      1, updates.length - 1);
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32694);System.arraycopy(transformers, 0, transformers, 1, transformers.length - 1);
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32695);updates[0]      = extremeT;
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32696);transformers[0] = next;
                }

                }__CLR4_4_1p6sp6slb90p9bz.R.inc(32697);extremeT = t;

                // apply the transform
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32698);return next.transformed(rawG);

            } }else {{
                // we are in the middle of the history

                // select the transformer
                __CLR4_4_1p6sp6slb90p9bz.R.inc(32699);for (int i = 0; (((i < updates.length - 1)&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32700)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32701)==0&false)); ++i) {{
                    __CLR4_4_1p6sp6slb90p9bz.R.inc(32702);if ((((t <= updates[i])&&(__CLR4_4_1p6sp6slb90p9bz.R.iget(32703)!=0|true))||(__CLR4_4_1p6sp6slb90p9bz.R.iget(32704)==0&false))) {{
                        // apply the transform
                        __CLR4_4_1p6sp6slb90p9bz.R.inc(32705);return transformers[i].transformed(rawG);
                    }
                }}

                }__CLR4_4_1p6sp6slb90p9bz.R.inc(32706);return transformers[updates.length - 1].transformed(rawG);

            }
       }}

    }}finally{__CLR4_4_1p6sp6slb90p9bz.R.flushNeeded();}}

    /**  {@inheritDoc} */
    public Action eventOccurred(double t, double[] y, boolean increasing) {try{__CLR4_4_1p6sp6slb90p9bz.R.inc(32707);
        // delegate to raw handler, fixing increasing status on the fly
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32708);return rawHandler.eventOccurred(t, y, filter.getTriggeredIncreasing());
    }finally{__CLR4_4_1p6sp6slb90p9bz.R.flushNeeded();}}

    /**  {@inheritDoc} */
    public void resetState(double t, double[] y) {try{__CLR4_4_1p6sp6slb90p9bz.R.inc(32709);
        // delegate to raw handler
        __CLR4_4_1p6sp6slb90p9bz.R.inc(32710);rawHandler.resetState(t, y);
    }finally{__CLR4_4_1p6sp6slb90p9bz.R.flushNeeded();}}

}
