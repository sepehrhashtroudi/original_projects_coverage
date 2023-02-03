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

import org.apache.commons.math3.exception.MathInternalError;

/** Enumerate for {@link EventFilter filtering events}.
 *
 * @version $Id$
 * @since 3.2
 */

@java.lang.SuppressWarnings({"fallthrough"}) public enum FilterType {

    /** Constant for triggering only decreasing events.
     * <p>When this filter is used, the wrapped {@link EventHandler
     * event handler} {@link EventHandler#eventOccurred(double, double[],
     * boolean) eventOccurred} method will be called <em>only</em> with
     * its {@code increasing} argument set to false.</p>
     */
    TRIGGER_ONLY_DECREASING_EVENTS {

        /**  {@inheritDoc} */
        @Override
        protected boolean getTriggeredIncreasing() {try{__CLR4_4_1pcppcplb90p9cv.R.inc(32857);
            __CLR4_4_1pcppcplb90p9cv.R.inc(32858);return false;
        }finally{__CLR4_4_1pcppcplb90p9cv.R.flushNeeded();}}

        /** {@inheritDoc}
         * <p>
         * states scheduling for computing h(t,y) as an altered version of g(t, y)
         * <ul>
         * <li>0 are triggered events for which a zero is produced (here decreasing events)</li>
         * <li>X are ignored events for which zero is masked (here increasing events)</li>
         * </ul>
         * </p>
         * <pre>
         *  g(t)
         *             ___                     ___                     ___
         *            /   \                   /   \                   /   \
         *           /     \                 /     \                 /     \
         *          /  g>0  \               /  g>0  \               /  g>0  \
         *         /         \             /         \             /         \
         *  ----- X --------- 0 --------- X --------- 0 --------- X --------- 0 ---
         *       /             \         /             \         /             \
         *      /               \ g<0   /               \  g<0  /               \ g<0
         *     /                 \     /                 \     /                 \     /
         * ___/                   \___/                   \___/                   \___/
         * </pre>
         * <pre>
         *  h(t,y)) as an alteration of g(t,y)
         *             ___                                 ___         ___
         *    \       /   \                               /   \       /   \
         *     \     /     \ h=+g                        /     \     /     \
         *      \   /       \      h=min(-s,-g,+g)      /       \   /       \
         *       \_/         \                         /         \_/         \
         *  ------ ---------- 0 ----------_---------- 0 --------------------- 0 ---
         *                     \         / \         /                         \
         *   h=max(+s,-g,+g)    \       /   \       /       h=max(+s,-g,+g)     \
         *                       \     /     \     / h=-g                        \     /
         *                        \___/       \___/                               \___/
         * </pre>
         * <p>
         * As shown by the figure above, several expressions are used to compute h,
         * depending on the current state:
         * <ul>
         *   <li>h = max(+s,-g,+g)</li>
         *   <li>h = +g</li>
         *   <li>h = min(-s,-g,+g)</li>
         *   <li>h = -g</li>
         * </ul>
         * where s is a tiny positive value: {@link org.apache.commons.math3.util.Precision#SAFE_MIN}.
         * </p>
         */
        @Override
        protected  Transformer selectTransformer(final Transformer previous,
                                                 final double g, final boolean forward) {try{__CLR4_4_1pcppcplb90p9cv.R.inc(32859);
            __CLR4_4_1pcppcplb90p9cv.R.inc(32860);if ((((forward)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32861)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32862)==0&false))) {{
                boolean __CLB4_4_1_bool0=false;__CLR4_4_1pcppcplb90p9cv.R.inc(32863);switch (previous) {
                    case UNINITIALIZED :if (!__CLB4_4_1_bool0) {__CLR4_4_1pcppcplb90p9cv.R.inc(32864);__CLB4_4_1_bool0=true;}
                        // we are initializing the first point
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32865);if ((((g > 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32866)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32867)==0&false))) {{
                            // initialize as if previous root (i.e. backward one) was an ignored increasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32868);return Transformer.MAX;
                        } }else {__CLR4_4_1pcppcplb90p9cv.R.inc(32869);if ((((g < 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32870)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32871)==0&false))) {{
                            // initialize as if previous root (i.e. backward one) was a triggered decreasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32872);return Transformer.PLUS;
                        } }else {{
                            // we are exactly at a root, we don't know if it is an increasing
                            // or a decreasing event, we remain in uninitialized state
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32873);return Transformer.UNINITIALIZED;
                        }
                    }}case PLUS  :if (!__CLB4_4_1_bool0) {__CLR4_4_1pcppcplb90p9cv.R.inc(32874);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32875);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32876)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32877)==0&false))) {{
                            // we have crossed the zero line on an ignored increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32878);return Transformer.MIN;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32879);return previous;
                        }
                    }case MINUS :if (!__CLB4_4_1_bool0) {__CLR4_4_1pcppcplb90p9cv.R.inc(32880);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32881);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32882)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32883)==0&false))) {{
                            // we have crossed the zero line on an ignored increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32884);return Transformer.MAX;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32885);return previous;
                        }
                    }case MIN   :if (!__CLB4_4_1_bool0) {__CLR4_4_1pcppcplb90p9cv.R.inc(32886);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32887);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32888)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32889)==0&false))) {{
                            // we have crossed the zero line on a triggered decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32890);return Transformer.MINUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32891);return previous;
                        }
                    }case MAX   :if (!__CLB4_4_1_bool0) {__CLR4_4_1pcppcplb90p9cv.R.inc(32892);__CLB4_4_1_bool0=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32893);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32894)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32895)==0&false))) {{
                            // we have crossed the zero line on a triggered decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32896);return Transformer.PLUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32897);return previous;
                        }
                    }default    :if (!__CLB4_4_1_bool0) {__CLR4_4_1pcppcplb90p9cv.R.inc(32898);__CLB4_4_1_bool0=true;}
                        // this should never happen
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32899);throw new MathInternalError();
                }
            } }else {{
                boolean __CLB4_4_1_bool1=false;__CLR4_4_1pcppcplb90p9cv.R.inc(32900);switch (previous) {
                    case UNINITIALIZED :if (!__CLB4_4_1_bool1) {__CLR4_4_1pcppcplb90p9cv.R.inc(32901);__CLB4_4_1_bool1=true;}
                        // we are initializing the first point
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32902);if ((((g > 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32903)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32904)==0&false))) {{
                            // initialize as if previous root (i.e. forward one) was a triggered decreasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32905);return Transformer.MINUS;
                        } }else {__CLR4_4_1pcppcplb90p9cv.R.inc(32906);if ((((g < 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32907)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32908)==0&false))) {{
                            // initialize as if previous root (i.e. forward one) was an ignored increasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32909);return Transformer.MIN;
                        } }else {{
                            // we are exactly at a root, we don't know if it is an increasing
                            // or a decreasing event, we remain in uninitialized state
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32910);return Transformer.UNINITIALIZED;
                        }
                    }}case PLUS  :if (!__CLB4_4_1_bool1) {__CLR4_4_1pcppcplb90p9cv.R.inc(32911);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32912);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32913)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32914)==0&false))) {{
                            // we have crossed the zero line on an ignored increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32915);return Transformer.MAX;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32916);return previous;
                        }
                    }case MINUS :if (!__CLB4_4_1_bool1) {__CLR4_4_1pcppcplb90p9cv.R.inc(32917);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32918);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32919)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32920)==0&false))) {{
                            // we have crossed the zero line on an ignored increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32921);return Transformer.MIN;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32922);return previous;
                        }
                    }case MIN   :if (!__CLB4_4_1_bool1) {__CLR4_4_1pcppcplb90p9cv.R.inc(32923);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32924);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32925)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32926)==0&false))) {{
                            // we have crossed the zero line on a triggered decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32927);return Transformer.PLUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32928);return previous;
                        }
                    }case MAX   :if (!__CLB4_4_1_bool1) {__CLR4_4_1pcppcplb90p9cv.R.inc(32929);__CLB4_4_1_bool1=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32930);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32931)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32932)==0&false))) {{
                            // we have crossed the zero line on a triggered decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32933);return Transformer.MINUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32934);return previous;
                        }
                    }default    :if (!__CLB4_4_1_bool1) {__CLR4_4_1pcppcplb90p9cv.R.inc(32935);__CLB4_4_1_bool1=true;}
                        // this should never happen
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32936);throw new MathInternalError();
                }
            }
        }}finally{__CLR4_4_1pcppcplb90p9cv.R.flushNeeded();}}

    },

    /** Constant for triggering only increasing events.
     * <p>When this filter is used, the wrapped {@link EventHandler
     * event handler} {@link EventHandler#eventOccurred(double, double[],
     * boolean) eventOccurred} method will be called <em>only</em> with
     * its {@code increasing} argument set to true.</p>
     */
    TRIGGER_ONLY_INCREASING_EVENTS {

        /**  {@inheritDoc} */
        @Override
        protected boolean getTriggeredIncreasing() {try{__CLR4_4_1pcppcplb90p9cv.R.inc(32937);
            __CLR4_4_1pcppcplb90p9cv.R.inc(32938);return true;
        }finally{__CLR4_4_1pcppcplb90p9cv.R.flushNeeded();}}

        /** {@inheritDoc}
         * <p>
         * states scheduling for computing h(t,y) as an altered version of g(t, y)
         * <ul>
         * <li>0 are triggered events for which a zero is produced (here increasing events)</li>
         * <li>X are ignored events for which zero is masked (here decreasing events)</li>
         * </ul>
         * </p>
         * <pre>
         *  g(t)
         *             ___                     ___                     ___
         *            /   \                   /   \                   /   \
         *           /     \                 /     \                 /     \
         *          /  g>0  \               /  g>0  \               /  g>0  \
         *         /         \             /         \             /         \
         *  ----- 0 --------- X --------- 0 --------- X --------- 0 --------- X ---
         *       /             \         /             \         /             \
         *      /               \ g<0   /               \  g<0  /               \ g<0
         *     /                 \     /                 \     /                 \     /
         * ___/                   \___/                   \___/                   \___/
         * </pre>
         * <pre>
         *  h(t,y)) as an alteration of g(t,y)
         *                                     ___         ___
         *    \                               /   \       /   \
         *     \ h=-g                        /     \     /     \ h=-g
         *      \      h=min(-s,-g,+g)      /       \   /       \      h=min(-s,-g,+g)
         *       \                         /         \_/         \
         *  ------0 ----------_---------- 0 --------------------- 0 --------- _ ---
         *         \         / \         /                         \         / \
         *          \       /   \       /       h=max(+s,-g,+g)     \       /   \
         *           \     /     \     / h=+g                        \     /     \     /
         *            \___/       \___/                               \___/       \___/
         * </pre>
         * <p>
         * As shown by the figure above, several expressions are used to compute h,
         * depending on the current state:
         * <ul>
         *   <li>h = max(+s,-g,+g)</li>
         *   <li>h = +g</li>
         *   <li>h = min(-s,-g,+g)</li>
         *   <li>h = -g</li>
         * </ul>
         * where s is a tiny positive value: {@link org.apache.commons.math3.util.Precision#SAFE_MIN}.
         * </p>
         */
        @Override
        protected  Transformer selectTransformer(final Transformer previous,
                                                 final double g, final boolean forward) {try{__CLR4_4_1pcppcplb90p9cv.R.inc(32939);
            __CLR4_4_1pcppcplb90p9cv.R.inc(32940);if ((((forward)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32941)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32942)==0&false))) {{
                boolean __CLB4_4_1_bool2=false;__CLR4_4_1pcppcplb90p9cv.R.inc(32943);switch (previous) {
                    case UNINITIALIZED :if (!__CLB4_4_1_bool2) {__CLR4_4_1pcppcplb90p9cv.R.inc(32944);__CLB4_4_1_bool2=true;}
                        // we are initializing the first point
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32945);if ((((g > 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32946)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32947)==0&false))) {{
                            // initialize as if previous root (i.e. backward one) was a triggered increasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32948);return Transformer.PLUS;
                        } }else {__CLR4_4_1pcppcplb90p9cv.R.inc(32949);if ((((g < 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32950)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32951)==0&false))) {{
                            // initialize as if previous root (i.e. backward one) was an ignored decreasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32952);return Transformer.MIN;
                        } }else {{
                            // we are exactly at a root, we don't know if it is an increasing
                            // or a decreasing event, we remain in uninitialized state
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32953);return Transformer.UNINITIALIZED;
                        }
                    }}case PLUS  :if (!__CLB4_4_1_bool2) {__CLR4_4_1pcppcplb90p9cv.R.inc(32954);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32955);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32956)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32957)==0&false))) {{
                            // we have crossed the zero line on an ignored decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32958);return Transformer.MAX;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32959);return previous;
                        }
                    }case MINUS :if (!__CLB4_4_1_bool2) {__CLR4_4_1pcppcplb90p9cv.R.inc(32960);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32961);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32962)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32963)==0&false))) {{
                            // we have crossed the zero line on an ignored decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32964);return Transformer.MIN;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32965);return previous;
                        }
                    }case MIN   :if (!__CLB4_4_1_bool2) {__CLR4_4_1pcppcplb90p9cv.R.inc(32966);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32967);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32968)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32969)==0&false))) {{
                            // we have crossed the zero line on a triggered increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32970);return Transformer.PLUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32971);return previous;
                        }
                    }case MAX   :if (!__CLB4_4_1_bool2) {__CLR4_4_1pcppcplb90p9cv.R.inc(32972);__CLB4_4_1_bool2=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32973);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32974)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32975)==0&false))) {{
                            // we have crossed the zero line on a triggered increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32976);return Transformer.MINUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32977);return previous;
                        }
                    }default    :if (!__CLB4_4_1_bool2) {__CLR4_4_1pcppcplb90p9cv.R.inc(32978);__CLB4_4_1_bool2=true;}
                        // this should never happen
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32979);throw new MathInternalError();
                }
            } }else {{
                boolean __CLB4_4_1_bool3=false;__CLR4_4_1pcppcplb90p9cv.R.inc(32980);switch (previous) {
                    case UNINITIALIZED :if (!__CLB4_4_1_bool3) {__CLR4_4_1pcppcplb90p9cv.R.inc(32981);__CLB4_4_1_bool3=true;}
                        // we are initializing the first point
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32982);if ((((g > 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32983)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32984)==0&false))) {{
                            // initialize as if previous root (i.e. forward one) was an ignored decreasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32985);return Transformer.MAX;
                        } }else {__CLR4_4_1pcppcplb90p9cv.R.inc(32986);if ((((g < 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32987)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32988)==0&false))) {{
                            // initialize as if previous root (i.e. forward one) was a triggered increasing event
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32989);return Transformer.MINUS;
                        } }else {{
                            // we are exactly at a root, we don't know if it is an increasing
                            // or a decreasing event, we remain in uninitialized state
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32990);return Transformer.UNINITIALIZED;
                        }
                    }}case PLUS  :if (!__CLB4_4_1_bool3) {__CLR4_4_1pcppcplb90p9cv.R.inc(32991);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32992);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32993)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(32994)==0&false))) {{
                            // we have crossed the zero line on an ignored decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32995);return Transformer.MIN;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(32996);return previous;
                        }
                    }case MINUS :if (!__CLB4_4_1_bool3) {__CLR4_4_1pcppcplb90p9cv.R.inc(32997);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(32998);if ((((g >= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(32999)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(33000)==0&false))) {{
                            // we have crossed the zero line on an ignored decreasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(33001);return Transformer.MAX;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(33002);return previous;
                        }
                    }case MIN   :if (!__CLB4_4_1_bool3) {__CLR4_4_1pcppcplb90p9cv.R.inc(33003);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(33004);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(33005)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(33006)==0&false))) {{
                            // we have crossed the zero line on a triggered increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(33007);return Transformer.MINUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(33008);return previous;
                        }
                    }case MAX   :if (!__CLB4_4_1_bool3) {__CLR4_4_1pcppcplb90p9cv.R.inc(33009);__CLB4_4_1_bool3=true;}
                        __CLR4_4_1pcppcplb90p9cv.R.inc(33010);if ((((g <= 0)&&(__CLR4_4_1pcppcplb90p9cv.R.iget(33011)!=0|true))||(__CLR4_4_1pcppcplb90p9cv.R.iget(33012)==0&false))) {{
                            // we have crossed the zero line on a triggered increasing event,
                            // we must change the transformer
                            __CLR4_4_1pcppcplb90p9cv.R.inc(33013);return Transformer.PLUS;
                        } }else {{
                            // we are still in the same status
                            __CLR4_4_1pcppcplb90p9cv.R.inc(33014);return previous;
                        }
                    }default    :if (!__CLB4_4_1_bool3) {__CLR4_4_1pcppcplb90p9cv.R.inc(33015);__CLB4_4_1_bool3=true;}
                        // this should never happen
                        __CLR4_4_1pcppcplb90p9cv.R.inc(33016);throw new MathInternalError();
                }
            }
        }}finally{__CLR4_4_1pcppcplb90p9cv.R.flushNeeded();}}

    };

    /** Get the increasing status of triggered events.
     * @return true if triggered events are increasing events
     */
    protected abstract boolean getTriggeredIncreasing();

    /** Get next function transformer in the specified direction.
     * @param previous transformer active on the previous point with respect
     * to integration direction (may be null if no previous point is known)
     * @param g current value of the g function
     * @param forward true if integration goes forward
     * @return next transformer transformer
     */
    protected abstract Transformer selectTransformer(Transformer previous,
                                                     double g, boolean forward);

;public static class __CLR4_4_1pcppcplb90p9cv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,33017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
