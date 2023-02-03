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
package org.apache.commons.math3.userguide;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.random.HaltonSequenceGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomVectorGenerator;
import org.apache.commons.math3.random.SobolSequenceGenerator;
import org.apache.commons.math3.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.UniformRandomGenerator;
import org.apache.commons.math3.userguide.ExampleUtils.ExampleFrame;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Pair;

/**
 * Plots 2D samples drawn from various pseudo / quasi-random generators.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class LowDiscrepancyGeneratorComparison {public static class __CLR4_4_12e4g2e4glb90pevs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111746,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static List<Vector2D> makeCircle(int samples, final RandomVectorGenerator generator) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111616);
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111617);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111618);for (double i = 0; (((i < samples)&&(__CLR4_4_12e4g2e4glb90pevs.R.iget(111619)!=0|true))||(__CLR4_4_12e4g2e4glb90pevs.R.iget(111620)==0&false)); i++) {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111621);double[] vector = generator.nextVector();
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111622);Vector2D point = new Vector2D(vector);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111623);points.add(point);
        }

        // normalize points first
        }__CLR4_4_12e4g2e4glb90pevs.R.inc(111624);points = normalize(points);
        
        // now test if the sample is within the unit circle
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111625);List<Vector2D> circlePoints = new ArrayList<Vector2D>();
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111626);for (Vector2D p : points) {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111627);double criteria = FastMath.pow(p.getX(), 2) + FastMath.pow(p.getY(), 2);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111628);if ((((criteria < 1.0)&&(__CLR4_4_12e4g2e4glb90pevs.R.iget(111629)!=0|true))||(__CLR4_4_12e4g2e4glb90pevs.R.iget(111630)==0&false))) {{
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111631);circlePoints.add(p);
            }
        }}

        }__CLR4_4_12e4g2e4glb90pevs.R.inc(111632);return circlePoints;
    }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}

    public static List<Vector2D> makeRandom(int samples, RandomVectorGenerator generator) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111633);
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111634);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111635);for (double i = 0; (((i < samples)&&(__CLR4_4_12e4g2e4glb90pevs.R.iget(111636)!=0|true))||(__CLR4_4_12e4g2e4glb90pevs.R.iget(111637)==0&false)); i++) {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111638);double[] vector = generator.nextVector();
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111639);Vector2D point = new Vector2D(vector);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111640);points.add(point);
        }
        
        }__CLR4_4_12e4g2e4glb90pevs.R.inc(111641);return normalize(points);
    }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}

    public static List<Vector2D> normalize(final List<Vector2D> input) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111642);
        // find the mininum and maximum x value in the dataset
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111643);double minX = Double.MAX_VALUE;
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111644);double maxX = Double.MIN_VALUE;
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111645);for (Vector2D p : input) {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111646);minX = FastMath.min(minX, p.getX());
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111647);maxX = FastMath.max(maxX, p.getX());
        }
        
        }__CLR4_4_12e4g2e4glb90pevs.R.inc(111648);double minY, maxY;
        
        // use the minimum to detect if we either have input values in the range [0, 1] or [-sqrt(3), sqrt(3)]
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111649);if ((((FastMath.abs(minX) < 0.1)&&(__CLR4_4_12e4g2e4glb90pevs.R.iget(111650)!=0|true))||(__CLR4_4_12e4g2e4glb90pevs.R.iget(111651)==0&false))) {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111652);minX = minY = 0.0;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111653);maxX = maxY = 1.0;
        } }else {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111654);minX = minY = -FastMath.sqrt(3);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111655);maxX = maxY = FastMath.sqrt(3);            
        }

        }__CLR4_4_12e4g2e4glb90pevs.R.inc(111656);double rangeX = maxX - minX;
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111657);double rangeY = maxY - minY;
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111658);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111659);for (Vector2D p : input) {{
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111660);double[] arr = p.toArray();
            // normalize to the range [-1, 1]
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111661);arr[0] = (arr[0] - minX) / rangeX * 2 - 1;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111662);arr[1] = (arr[1] - minY) / rangeY * 2 - 1;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111663);points.add(new Vector2D(arr));
        }
        }__CLR4_4_12e4g2e4glb90pevs.R.inc(111664);return points;
    }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}
    
    @SuppressWarnings("serial")
    public static class Display extends ExampleFrame {
        
        public Display() {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111665);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111666);setTitle("Commons-Math: Pseudo/Quasi-random examples");
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111667);setSize(800, 800);
            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111668);setLayout(new GridBagLayout());
            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111669);int[] datasets = new int[] { 256, 1000, 2500, 1000 };
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111670);List<Pair<String, RandomVectorGenerator>> generators = new ArrayList<Pair<String, RandomVectorGenerator>>();

            __CLR4_4_12e4g2e4glb90pevs.R.inc(111671);generators.add(new Pair<String, RandomVectorGenerator>("Uncorrelated\nUniform(JDK)",
                    new UncorrelatedRandomVectorGenerator(2, new UniformRandomGenerator(new JDKRandomGenerator()))));
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111672);generators.add(new Pair<String, RandomVectorGenerator>("Independent\nRandom(MT)", new RandomVectorGenerator() {

                RandomGenerator[] rngs = new RandomGenerator[] {
                    new MersenneTwister(0),
                    new MersenneTwister(1)
                };
                
                public double[] nextVector() {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111673);
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111674);final double[] vector = new double[2];
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111675);vector[0] = rngs[0].nextDouble();
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111676);vector[1] = rngs[1].nextDouble();
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111677);return vector;
                }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}
                
            }));            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111678);generators.add(new Pair<String, RandomVectorGenerator>("HaltonSequence", new HaltonSequenceGenerator(2)));            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111679);generators.add(new Pair<String, RandomVectorGenerator>("SobolSequence", new SobolSequenceGenerator(2)));            
            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111680);GridBagConstraints c = new GridBagConstraints();
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111681);c.fill = GridBagConstraints.VERTICAL;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111682);c.gridx = 1;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111683);c.gridy = 0;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111684);c.insets = new Insets(2, 2, 2, 2);

            __CLR4_4_12e4g2e4glb90pevs.R.inc(111685);for (Pair<String, RandomVectorGenerator> pair : generators) {{
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111686);JTextArea text = new JTextArea(pair.getFirst());
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111687);text.setEditable(false);
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111688);text.setOpaque(false);
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111689);add(text, c);
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111690);c.gridx++;
            }
            }__CLR4_4_12e4g2e4glb90pevs.R.inc(111691);int saveY = ++c.gridy;
            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111692);c.gridx = 0;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111693);for (int type = 0; (((type < 4)&&(__CLR4_4_12e4g2e4glb90pevs.R.iget(111694)!=0|true))||(__CLR4_4_12e4g2e4glb90pevs.R.iget(111695)==0&false)); type++) {{
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111696);JLabel text = new JLabel("n=" + String.valueOf(datasets[type]));
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111697);text.setOpaque(false);
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111698);add(text, c);
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111699);c.gridy++;
            }

            }__CLR4_4_12e4g2e4glb90pevs.R.inc(111700);c.gridy = saveY;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111701);for (int type = 0; (((type < 4)&&(__CLR4_4_12e4g2e4glb90pevs.R.iget(111702)!=0|true))||(__CLR4_4_12e4g2e4glb90pevs.R.iget(111703)==0&false)); type++) {{
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111704);c.gridx = 1;

                __CLR4_4_12e4g2e4glb90pevs.R.inc(111705);for (Pair<String, RandomVectorGenerator> pair : generators) {{
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111706);List<Vector2D> points = null;
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111707);int samples = datasets[type];
                    boolean __CLB4_4_1_bool0=false;__CLR4_4_12e4g2e4glb90pevs.R.inc(111708);switch (type) {
                        case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_12e4g2e4glb90pevs.R.inc(111709);__CLB4_4_1_bool0=true;}
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111710);points = makeRandom(samples, pair.getValue());
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111711);break;
                        case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_12e4g2e4glb90pevs.R.inc(111712);__CLB4_4_1_bool0=true;}
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111713);points = makeRandom(samples, pair.getValue());
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111714);break;
                        case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_12e4g2e4glb90pevs.R.inc(111715);__CLB4_4_1_bool0=true;}
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111716);points = makeRandom(samples, pair.getValue());
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111717);break;
                        case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_12e4g2e4glb90pevs.R.inc(111718);__CLB4_4_1_bool0=true;}
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111719);points = makeCircle(samples, pair.getValue());
                            __CLR4_4_12e4g2e4glb90pevs.R.inc(111720);break;
                    }
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111721);add(new Plot(points), c);
                    __CLR4_4_12e4g2e4glb90pevs.R.inc(111722);c.gridx++;
                }

                }__CLR4_4_12e4g2e4glb90pevs.R.inc(111723);c.gridy++;
            }            
        }}finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}
    }

    @SuppressWarnings("serial")
    public static class Plot extends JComponent {

        private static double PAD = 10;

        private List<Vector2D> points;

        public Plot(final List<Vector2D> points) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111724);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111725);this.points = points;
        }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}
        
        @Override
        protected void paintComponent(Graphics g) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111726);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111727);super.paintComponent(g);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111728);Graphics2D g2 = (Graphics2D)g;
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111729);g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

            __CLR4_4_12e4g2e4glb90pevs.R.inc(111730);int w = getWidth();
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111731);int h = getHeight();

            __CLR4_4_12e4g2e4glb90pevs.R.inc(111732);g2.clearRect(0, 0, w, h);
            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111733);g2.setPaint(Color.black);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111734);g2.drawRect(0, 0, w - 1, h - 1);
            
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111735);for (Vector2D point : points) {{
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111736);Vector2D p = transform(point, w, h);
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111737);double[] arr = p.toArray();
                __CLR4_4_12e4g2e4glb90pevs.R.inc(111738);g2.draw(new Rectangle2D.Double(arr[0] - 1, arr[1] - 1, 2, 2));
            }
        }}finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}        
        
        @Override
        public Dimension getPreferredSize() {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111739);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111740);return new Dimension(140, 140);
        }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}

        private Vector2D transform(Vector2D point, int width, int height) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111741);
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111742);double[] arr = point.toArray();
            __CLR4_4_12e4g2e4glb90pevs.R.inc(111743);return new Vector2D(new double[] { PAD + (arr[0] + 1) / 2.0 * (width - 2 * PAD),
                                                  height - PAD - (arr[1] + 1) / 2.0 * (height - 2 * PAD) });
        }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}
    }

    public static void main(String[] args) {try{__CLR4_4_12e4g2e4glb90pevs.R.inc(111744);
        __CLR4_4_12e4g2e4glb90pevs.R.inc(111745);ExampleUtils.showExampleFrame(new Display());
    }finally{__CLR4_4_12e4g2e4glb90pevs.R.flushNeeded();}}
}
