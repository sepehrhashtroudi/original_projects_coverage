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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class ExampleUtils {public static class __CLR4_4_12e3g2e3glb90pevi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,111616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("serial")
    public static class ExampleFrame extends JFrame {
        
        /**
         * Returns the main panel which should be printed by the screenshot action.
         * <p>
         * By default, it returns the content pane of this frame, but can be overriden
         * in case the frame has a global scroll pane which would cut off any offscreen content. 
         *
         * @return the main panel to print
         */
        public Component getMainPanel() {try{__CLR4_4_12e3g2e3glb90pevi.R.inc(111580);
            __CLR4_4_12e3g2e3glb90pevi.R.inc(111581);return getContentPane();
        }finally{__CLR4_4_12e3g2e3glb90pevi.R.flushNeeded();}}
    }

    public static void showExampleFrame(final ExampleFrame frame) {try{__CLR4_4_12e3g2e3glb90pevi.R.inc(111582);
        __CLR4_4_12e3g2e3glb90pevi.R.inc(111583);Runnable r = new Runnable() {
            public void run() {try{__CLR4_4_12e3g2e3glb90pevi.R.inc(111584);
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111585);JMenuItem screenshot = new JMenuItem("Screenshot (png)");
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111586);screenshot.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, InputEvent.CTRL_DOWN_MASK));
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111587);screenshot.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {try{__CLR4_4_12e3g2e3glb90pevi.R.inc(111588);
                        __CLR4_4_12e3g2e3glb90pevi.R.inc(111589);JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
                        __CLR4_4_12e3g2e3glb90pevi.R.inc(111590);if ((((fileChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)&&(__CLR4_4_12e3g2e3glb90pevi.R.iget(111591)!=0|true))||(__CLR4_4_12e3g2e3glb90pevi.R.iget(111592)==0&false))) {{
                          __CLR4_4_12e3g2e3glb90pevi.R.inc(111593);File file = fileChooser.getSelectedFile();
                          __CLR4_4_12e3g2e3glb90pevi.R.inc(111594);BufferedImage img = getScreenShot(frame.getMainPanel());
                          __CLR4_4_12e3g2e3glb90pevi.R.inc(111595);try {
                              // write the image as a PNG
                              __CLR4_4_12e3g2e3glb90pevi.R.inc(111596);ImageIO.write(img, "png", file);
                          } catch (Exception e) {
                              __CLR4_4_12e3g2e3glb90pevi.R.inc(111597);e.printStackTrace();
                          }
                        }
                    }}finally{__CLR4_4_12e3g2e3glb90pevi.R.flushNeeded();}}
                });
                
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111598);JMenuItem exit = new JMenuItem("Exit");
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111599);exit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {try{__CLR4_4_12e3g2e3glb90pevi.R.inc(111600);
                        __CLR4_4_12e3g2e3glb90pevi.R.inc(111601);System.exit(0);
                    }finally{__CLR4_4_12e3g2e3glb90pevi.R.flushNeeded();}}
                });
                
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111602);JMenu menu = new JMenu("File");
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111603);menu.add(screenshot);
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111604);menu.add(exit);
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111605);JMenuBar mb = new JMenuBar();
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111606);mb.add(menu);
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111607);frame.setJMenuBar(mb);

                __CLR4_4_12e3g2e3glb90pevi.R.inc(111608);frame.setLocationRelativeTo(null);
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111609);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                __CLR4_4_12e3g2e3glb90pevi.R.inc(111610);frame.setVisible(true);
            }finally{__CLR4_4_12e3g2e3glb90pevi.R.flushNeeded();}}
        };
        __CLR4_4_12e3g2e3glb90pevi.R.inc(111611);SwingUtilities.invokeLater(r);
    }finally{__CLR4_4_12e3g2e3glb90pevi.R.flushNeeded();}}

    private static BufferedImage getScreenShot(Component component) {try{__CLR4_4_12e3g2e3glb90pevi.R.inc(111612);
        __CLR4_4_12e3g2e3glb90pevi.R.inc(111613);BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        // call the Component's paint method, using the Graphics object of the image.
        __CLR4_4_12e3g2e3glb90pevi.R.inc(111614);component.paint(image.getGraphics());
        __CLR4_4_12e3g2e3glb90pevi.R.inc(111615);return image;
    }finally{__CLR4_4_12e3g2e3glb90pevi.R.flushNeeded();}}

}
