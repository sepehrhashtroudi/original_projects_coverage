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
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JLabel;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.Cluster;
import org.apache.commons.math3.ml.clustering.Clusterable;
import org.apache.commons.math3.ml.clustering.Clusterer;
import org.apache.commons.math3.ml.clustering.DBSCANClusterer;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.SobolSequenceGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.userguide.ExampleUtils.ExampleFrame;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Pair;

/**
 * Plots clustering results for various algorithms and datasets.
 * Based on
 * <a href="http://scikit-learn.org/stable/auto_examples/cluster/plot_cluster_comparison.html">scikit learn</a>.
 */
public class ClusterAlgorithmComparison {public static class __CLR4_4_12dym2dymlb90pev8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static List<Vector2D> makeCircles(int samples, boolean shuffle, double noise, double factor, final RandomGenerator random) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111406);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111407);if ((((factor < 0 || factor > 1)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111408)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111409)==0&false))) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111410);throw new IllegalArgumentException();
        }
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111411);NormalDistribution dist = new NormalDistribution(random, 0.0, noise, 1e-9);

        __CLR4_4_12dym2dymlb90pev8.R.inc(111412);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12dym2dymlb90pev8.R.inc(111413);double range = 2.0 * FastMath.PI;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111414);double step = range / (samples / 2.0 + 1);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111415);for (double angle = 0; (((angle < range)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111416)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111417)==0&false)); angle += step) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111418);Vector2D outerCircle = new Vector2D(FastMath.cos(angle), FastMath.sin(angle));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111419);Vector2D innerCircle = outerCircle.scalarMultiply(factor);
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111420);points.add(outerCircle.add(generateNoiseVector(dist)));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111421);points.add(innerCircle.add(generateNoiseVector(dist)));
        }
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111422);if ((((shuffle)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111423)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111424)==0&false))) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111425);Collections.shuffle(points, new RandomAdaptor(random));
        }

        }__CLR4_4_12dym2dymlb90pev8.R.inc(111426);return points;
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}

    public static List<Vector2D> makeMoons(int samples, boolean shuffle, double noise, RandomGenerator random) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111427);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111428);NormalDistribution dist = new NormalDistribution(random, 0.0, noise, 1e-9);

        __CLR4_4_12dym2dymlb90pev8.R.inc(111429);int nSamplesOut = samples / 2;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111430);int nSamplesIn = samples - nSamplesOut;
        
        __CLR4_4_12dym2dymlb90pev8.R.inc(111431);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12dym2dymlb90pev8.R.inc(111432);double range = FastMath.PI;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111433);double step = range / (nSamplesOut / 2.0);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111434);for (double angle = 0; (((angle < range)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111435)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111436)==0&false)); angle += step) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111437);Vector2D outerCircle = new Vector2D(FastMath.cos(angle), FastMath.sin(angle));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111438);points.add(outerCircle.add(generateNoiseVector(dist)));
        }

        }__CLR4_4_12dym2dymlb90pev8.R.inc(111439);step = range / (nSamplesIn / 2.0);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111440);for (double angle = 0; (((angle < range)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111441)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111442)==0&false)); angle += step) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111443);Vector2D innerCircle = new Vector2D(1 - FastMath.cos(angle), 1 - FastMath.sin(angle) - 0.5);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111444);points.add(innerCircle.add(generateNoiseVector(dist)));
        }
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111445);if ((((shuffle)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111446)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111447)==0&false))) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111448);Collections.shuffle(points, new RandomAdaptor(random));
        }

        }__CLR4_4_12dym2dymlb90pev8.R.inc(111449);return points;
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}

    public static List<Vector2D> makeBlobs(int samples, int centers, double clusterStd,
                                           double min, double max, boolean shuffle, RandomGenerator random) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111450);

        __CLR4_4_12dym2dymlb90pev8.R.inc(111451);NormalDistribution dist = new NormalDistribution(random, 0.0, clusterStd, 1e-9);

        __CLR4_4_12dym2dymlb90pev8.R.inc(111452);double range = max - min;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111453);Vector2D[] centerPoints = new Vector2D[centers];
        __CLR4_4_12dym2dymlb90pev8.R.inc(111454);for (int i = 0; (((i < centers)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111455)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111456)==0&false)); i++) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111457);double x = random.nextDouble() * range + min;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111458);double y = random.nextDouble() * range + min;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111459);centerPoints[i] = new Vector2D(x, y);
        }
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111460);int[] nSamplesPerCenter = new int[centers];
        __CLR4_4_12dym2dymlb90pev8.R.inc(111461);int count = samples / centers;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111462);Arrays.fill(nSamplesPerCenter, count);
        
        __CLR4_4_12dym2dymlb90pev8.R.inc(111463);for (int i = 0; (((i < samples % centers)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111464)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111465)==0&false)); i++) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111466);nSamplesPerCenter[i]++;
        }
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111467);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12dym2dymlb90pev8.R.inc(111468);for (int i = 0; (((i < centers)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111469)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111470)==0&false)); i++) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111471);for (int j = 0; (((j < nSamplesPerCenter[i])&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111472)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111473)==0&false)); j++) {{
                __CLR4_4_12dym2dymlb90pev8.R.inc(111474);Vector2D point = new Vector2D(dist.sample(), dist.sample());
                __CLR4_4_12dym2dymlb90pev8.R.inc(111475);points.add(point.add(centerPoints[i]));
            }
        }}
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111476);if ((((shuffle)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111477)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111478)==0&false))) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111479);Collections.shuffle(points, new RandomAdaptor(random));
        }

        }__CLR4_4_12dym2dymlb90pev8.R.inc(111480);return points;
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}
    
    public static List<Vector2D> makeRandom(int samples) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111481);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111482);SobolSequenceGenerator generator = new SobolSequenceGenerator(2);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111483);generator.skipTo(999999);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111484);List<Vector2D> points = new ArrayList<Vector2D>();
        __CLR4_4_12dym2dymlb90pev8.R.inc(111485);for (double i = 0; (((i < samples)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111486)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111487)==0&false)); i++) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111488);double[] vector = generator.nextVector();
            __CLR4_4_12dym2dymlb90pev8.R.inc(111489);vector[0] = vector[0] * 2 - 1;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111490);vector[1] = vector[1] * 2 - 1;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111491);Vector2D point = new Vector2D(vector);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111492);points.add(point);
        }
        
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111493);return points;
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}

    public static Vector2D generateNoiseVector(NormalDistribution distribution) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111494);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111495);return new Vector2D(distribution.sample(), distribution.sample());
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}
    
    public static List<DoublePoint> normalize(final List<Vector2D> input, double minX, double maxX, double minY, double maxY) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111496);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111497);double rangeX = maxX - minX;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111498);double rangeY = maxY - minY;
        __CLR4_4_12dym2dymlb90pev8.R.inc(111499);List<DoublePoint> points = new ArrayList<DoublePoint>();
        __CLR4_4_12dym2dymlb90pev8.R.inc(111500);for (Vector2D p : input) {{
            __CLR4_4_12dym2dymlb90pev8.R.inc(111501);double[] arr = p.toArray();
            __CLR4_4_12dym2dymlb90pev8.R.inc(111502);arr[0] = (arr[0] - minX) / rangeX * 2 - 1;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111503);arr[1] = (arr[1] - minY) / rangeY * 2 - 1;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111504);points.add(new DoublePoint(arr));
        }
        }__CLR4_4_12dym2dymlb90pev8.R.inc(111505);return points;
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}
    
    @SuppressWarnings("serial")
    public static class Display extends ExampleFrame {
        
        public Display() {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111506);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111507);setTitle("Commons-Math: Cluster algorithm comparison");
            __CLR4_4_12dym2dymlb90pev8.R.inc(111508);setSize(800, 800);
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111509);setLayout(new GridBagLayout());
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111510);int nSamples = 1500;
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111511);RandomGenerator rng = new Well19937c(0);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111512);List<List<DoublePoint>> datasets = new ArrayList<List<DoublePoint>>();

            __CLR4_4_12dym2dymlb90pev8.R.inc(111513);datasets.add(normalize(makeCircles(nSamples, true, 0.04, 0.5, rng), -1, 1, -1, 1));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111514);datasets.add(normalize(makeMoons(nSamples, true, 0.04, rng), -1, 2, -1, 1));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111515);datasets.add(normalize(makeBlobs(nSamples, 3, 1.0, -10, 10, true, rng), -12, 12, -12, 12));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111516);datasets.add(normalize(makeRandom(nSamples), -1, 1, -1, 1));

            __CLR4_4_12dym2dymlb90pev8.R.inc(111517);List<Pair<String, Clusterer<DoublePoint>>> algorithms = new ArrayList<Pair<String, Clusterer<DoublePoint>>>();
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111518);algorithms.add(new Pair<String, Clusterer<DoublePoint>>("KMeans\n(k=2)", new KMeansPlusPlusClusterer<DoublePoint>(2)));            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111519);algorithms.add(new Pair<String, Clusterer<DoublePoint>>("KMeans\n(k=3)", new KMeansPlusPlusClusterer<DoublePoint>(3)));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111520);algorithms.add(new Pair<String, Clusterer<DoublePoint>>("FuzzyKMeans\n(k=3, fuzzy=2)", new FuzzyKMeansClusterer<DoublePoint>(3, 2)));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111521);algorithms.add(new Pair<String, Clusterer<DoublePoint>>("FuzzyKMeans\n(k=3, fuzzy=10)", new FuzzyKMeansClusterer<DoublePoint>(3, 10)));
            __CLR4_4_12dym2dymlb90pev8.R.inc(111522);algorithms.add(new Pair<String, Clusterer<DoublePoint>>("DBSCAN\n(eps=.1, min=3)", new DBSCANClusterer<DoublePoint>(0.1, 3)));
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111523);GridBagConstraints c = new GridBagConstraints();
            __CLR4_4_12dym2dymlb90pev8.R.inc(111524);c.fill = GridBagConstraints.VERTICAL;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111525);c.gridx = 0;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111526);c.gridy = 0;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111527);c.insets = new Insets(2, 2, 2, 2);

            __CLR4_4_12dym2dymlb90pev8.R.inc(111528);for (Pair<String, Clusterer<DoublePoint>> pair : algorithms) {{
                __CLR4_4_12dym2dymlb90pev8.R.inc(111529);JLabel text = new JLabel("<html><body>" + pair.getFirst().replace("\n", "<br>"));
                __CLR4_4_12dym2dymlb90pev8.R.inc(111530);add(text, c);
                __CLR4_4_12dym2dymlb90pev8.R.inc(111531);c.gridx++;
            }
            }__CLR4_4_12dym2dymlb90pev8.R.inc(111532);c.gridy++;

            __CLR4_4_12dym2dymlb90pev8.R.inc(111533);for (List<DoublePoint> dataset : datasets) {{
                __CLR4_4_12dym2dymlb90pev8.R.inc(111534);c.gridx = 0;
                __CLR4_4_12dym2dymlb90pev8.R.inc(111535);for (Pair<String, Clusterer<DoublePoint>> pair : algorithms) {{
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111536);long start = System.currentTimeMillis();
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111537);List<? extends Cluster<DoublePoint>> clusters = pair.getSecond().cluster(dataset);
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111538);long end = System.currentTimeMillis();
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111539);add(new ClusterPlot(clusters, end - start), c);
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111540);c.gridx++;
                }
                }__CLR4_4_12dym2dymlb90pev8.R.inc(111541);c.gridy++;
            }            
        }}finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}

    }

    @SuppressWarnings("serial")
    public static class ClusterPlot extends JComponent {

        private static double PAD = 10;

        private List<? extends Cluster<DoublePoint>> clusters;
        private long duration;

        public ClusterPlot(final List<? extends Cluster<DoublePoint>> clusters, long duration) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111542);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111543);this.clusters = clusters;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111544);this.duration = duration;
        }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}
        
        @Override
        protected void paintComponent(Graphics g) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111545);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111546);super.paintComponent(g);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111547);Graphics2D g2 = (Graphics2D)g;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111548);g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

            __CLR4_4_12dym2dymlb90pev8.R.inc(111549);int w = getWidth();
            __CLR4_4_12dym2dymlb90pev8.R.inc(111550);int h = getHeight();

            __CLR4_4_12dym2dymlb90pev8.R.inc(111551);g2.clearRect(0, 0, w, h);
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111552);g2.setPaint(Color.black);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111553);g2.drawRect(0, 0, w - 1, h - 1);
            
            __CLR4_4_12dym2dymlb90pev8.R.inc(111554);int index = 0;
            __CLR4_4_12dym2dymlb90pev8.R.inc(111555);Color[] colors = new Color[] { Color.red, Color.blue, Color.green.darker() };
            __CLR4_4_12dym2dymlb90pev8.R.inc(111556);for (Cluster<DoublePoint> cluster : clusters) {{
                __CLR4_4_12dym2dymlb90pev8.R.inc(111557);g2.setPaint(colors[index++]);
                __CLR4_4_12dym2dymlb90pev8.R.inc(111558);for (DoublePoint point : cluster.getPoints()) {{
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111559);Clusterable p = transform(point, w, h);
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111560);double[] arr = p.getPoint();
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111561);g2.fill(new Ellipse2D.Double(arr[0] - 1, arr[1] - 1, 3, 3));
                }
                
                }__CLR4_4_12dym2dymlb90pev8.R.inc(111562);if ((((cluster instanceof CentroidCluster)&&(__CLR4_4_12dym2dymlb90pev8.R.iget(111563)!=0|true))||(__CLR4_4_12dym2dymlb90pev8.R.iget(111564)==0&false))) {{
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111565);Clusterable p = transform(((CentroidCluster<?>) cluster).getCenter(), w, h);
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111566);double[] arr = p.getPoint();
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111567);Shape s = new Ellipse2D.Double(arr[0] - 4, arr[1] - 4, 8, 8); 
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111568);g2.fill(s);
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111569);g2.setPaint(Color.black);
                    __CLR4_4_12dym2dymlb90pev8.R.inc(111570);g2.draw(s);
                }
            }}
            
            }__CLR4_4_12dym2dymlb90pev8.R.inc(111571);g2.setPaint(Color.black);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111572);g2.drawString(String.format("%.2f s", duration / 1e3), w - 40, h - 5);
        }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}        
        
        @Override
        public Dimension getPreferredSize() {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111573);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111574);return new Dimension(150, 150);
        }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}

        private Clusterable transform(Clusterable point, int width, int height) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111575);
            __CLR4_4_12dym2dymlb90pev8.R.inc(111576);double[] arr = point.getPoint();
            __CLR4_4_12dym2dymlb90pev8.R.inc(111577);return new DoublePoint(new double[] { PAD + (arr[0] + 1) / 2.0 * (width - 2 * PAD),
                                                  height - PAD - (arr[1] + 1) / 2.0 * (height - 2 * PAD) });
        }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}
    }

    public static void main(String[] args) {try{__CLR4_4_12dym2dymlb90pev8.R.inc(111578);
        __CLR4_4_12dym2dymlb90pev8.R.inc(111579);ExampleUtils.showExampleFrame(new Display());
    }finally{__CLR4_4_12dym2dymlb90pev8.R.flushNeeded();}}
}
