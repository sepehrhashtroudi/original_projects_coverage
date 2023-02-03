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

package org.apache.commons.csv;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

public class CSVFormatTest {static class __CLR4_4_1iqiql6l8x0gm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0043\u0073\u0076\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1659992906881L,8589935092L,751,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testImmutalibity() {__CLR4_4_1iqiql6l8x0gm.R.globalSliceStart(getClass().getName(),674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17f3t1iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqiql6l8x0gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqiql6l8x0gm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVFormatTest.testImmutalibity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17f3t1iq(){try{__CLR4_4_1iqiql6l8x0gm.R.inc(674);
        __CLR4_4_1iqiql6l8x0gm.R.inc(675);CSVFormat format = new CSVFormat('!', '!', '!', '!', true, true, "\r\n", null);
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(676);format.withDelimiter('?');
        __CLR4_4_1iqiql6l8x0gm.R.inc(677);format.withEncapsulator('?');
        __CLR4_4_1iqiql6l8x0gm.R.inc(678);format.withCommentStart('?');
        __CLR4_4_1iqiql6l8x0gm.R.inc(679);format.withLineSeparator("?");
        __CLR4_4_1iqiql6l8x0gm.R.inc(680);format.withEscape('?');
        __CLR4_4_1iqiql6l8x0gm.R.inc(681);format.withSurroundingSpacesIgnored(false);
        __CLR4_4_1iqiql6l8x0gm.R.inc(682);format.withEmptyLinesIgnored(false);
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(683);assertEquals('!', format.getDelimiter());
        __CLR4_4_1iqiql6l8x0gm.R.inc(684);assertEquals('!', format.getEncapsulator());
        __CLR4_4_1iqiql6l8x0gm.R.inc(685);assertEquals('!', format.getCommentStart());
        __CLR4_4_1iqiql6l8x0gm.R.inc(686);assertEquals('!', format.getEscape());
        __CLR4_4_1iqiql6l8x0gm.R.inc(687);assertEquals("\r\n", format.getLineSeparator());
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(688);assertTrue(format.isSurroundingSpacesIgnored());
        __CLR4_4_1iqiql6l8x0gm.R.inc(689);assertTrue(format.isEmptyLinesIgnored());
    }finally{__CLR4_4_1iqiql6l8x0gm.R.flushNeeded();}}

    @Test
    public void testMutators() {__CLR4_4_1iqiql6l8x0gm.R.globalSliceStart(getClass().getName(),690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhzphyj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqiql6l8x0gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqiql6l8x0gm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVFormatTest.testMutators",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhzphyj6(){try{__CLR4_4_1iqiql6l8x0gm.R.inc(690);
        __CLR4_4_1iqiql6l8x0gm.R.inc(691);CSVFormat format = new CSVFormat('!', '!', '!', '!', true, true, "\r\n", null);
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(692);assertEquals('?', format.withDelimiter('?').getDelimiter());
        __CLR4_4_1iqiql6l8x0gm.R.inc(693);assertEquals('?', format.withEncapsulator('?').getEncapsulator());
        __CLR4_4_1iqiql6l8x0gm.R.inc(694);assertEquals('?', format.withCommentStart('?').getCommentStart());
        __CLR4_4_1iqiql6l8x0gm.R.inc(695);assertEquals("?", format.withLineSeparator("?").getLineSeparator());
        __CLR4_4_1iqiql6l8x0gm.R.inc(696);assertEquals('?', format.withEscape('?').getEscape());
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(697);assertFalse(format.withSurroundingSpacesIgnored(false).isSurroundingSpacesIgnored());
        __CLR4_4_1iqiql6l8x0gm.R.inc(698);assertFalse(format.withEmptyLinesIgnored(false).isEmptyLinesIgnored());
    }finally{__CLR4_4_1iqiql6l8x0gm.R.flushNeeded();}}

    @Test
    public void testFormat() {__CLR4_4_1iqiql6l8x0gm.R.globalSliceStart(getClass().getName(),699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ezuswjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqiql6l8x0gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqiql6l8x0gm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVFormatTest.testFormat",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ezuswjf(){try{__CLR4_4_1iqiql6l8x0gm.R.inc(699);
        __CLR4_4_1iqiql6l8x0gm.R.inc(700);CSVFormat format = CSVFormat.DEFAULT;
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(701);assertEquals("", format.format());
        __CLR4_4_1iqiql6l8x0gm.R.inc(702);assertEquals("a,b,c", format.format("a", "b", "c"));
        __CLR4_4_1iqiql6l8x0gm.R.inc(703);assertEquals("\"x,y\",z", format.format("x,y", "z"));
    }finally{__CLR4_4_1iqiql6l8x0gm.R.flushNeeded();}}
    
    @Test
    public void testValidation() {__CLR4_4_1iqiql6l8x0gm.R.globalSliceStart(getClass().getName(),704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mmeis2jk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqiql6l8x0gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqiql6l8x0gm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVFormatTest.testValidation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mmeis2jk(){try{__CLR4_4_1iqiql6l8x0gm.R.inc(704);
        __CLR4_4_1iqiql6l8x0gm.R.inc(705);CSVFormat format = CSVFormat.DEFAULT;
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(706);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(707);format.withDelimiter('\n');
            __CLR4_4_1iqiql6l8x0gm.R.inc(708);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(709);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(710);format.withEscape('\r');
            __CLR4_4_1iqiql6l8x0gm.R.inc(711);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(712);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(713);format.withEncapsulator('\n');
            __CLR4_4_1iqiql6l8x0gm.R.inc(714);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(715);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(716);format.withCommentStart('\r');
            __CLR4_4_1iqiql6l8x0gm.R.inc(717);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(718);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(719);format.withDelimiter('!').withEscape('!').validate();
            __CLR4_4_1iqiql6l8x0gm.R.inc(720);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(721);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(722);format.withDelimiter('!').withCommentStart('!').validate();
            __CLR4_4_1iqiql6l8x0gm.R.inc(723);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(724);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(725);format.withEncapsulator('!').withCommentStart('!').validate();
            __CLR4_4_1iqiql6l8x0gm.R.inc(726);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(727);format.withEncapsulator(CSVFormat.DISABLED).withCommentStart(CSVFormat.DISABLED).validate();
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(728);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(729);format.withEscape('!').withCommentStart('!').validate();
            __CLR4_4_1iqiql6l8x0gm.R.inc(730);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(731);format.withEscape(CSVFormat.DISABLED).withCommentStart(CSVFormat.DISABLED).validate();
        
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(732);try {
            __CLR4_4_1iqiql6l8x0gm.R.inc(733);format.withEncapsulator('!').withDelimiter('!').validate();
            __CLR4_4_1iqiql6l8x0gm.R.inc(734);fail();
        } catch (IllegalArgumentException e) {
            // expected
        }
    }finally{__CLR4_4_1iqiql6l8x0gm.R.flushNeeded();}}

    @SuppressWarnings("boxing") // no need to worry about boxing here
    @Test
    public void testSerialization() throws Exception {__CLR4_4_1iqiql6l8x0gm.R.globalSliceStart(getClass().getName(),735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16m1on9kf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iqiql6l8x0gm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iqiql6l8x0gm.R.globalSliceEnd(getClass().getName(),"org.apache.commons.csv.CSVFormatTest.testSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),735,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16m1on9kf() throws Exception{try{__CLR4_4_1iqiql6l8x0gm.R.inc(735);
        __CLR4_4_1iqiql6l8x0gm.R.inc(736);ByteArrayOutputStream out = new ByteArrayOutputStream();
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(737);ObjectOutputStream oos = new ObjectOutputStream(out);
        __CLR4_4_1iqiql6l8x0gm.R.inc(738);oos.writeObject(CSVFormat.DEFAULT);
        __CLR4_4_1iqiql6l8x0gm.R.inc(739);oos.flush();
        __CLR4_4_1iqiql6l8x0gm.R.inc(740);oos.close();
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(741);ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()));
        __CLR4_4_1iqiql6l8x0gm.R.inc(742);CSVFormat format = (CSVFormat) in.readObject();
        
        __CLR4_4_1iqiql6l8x0gm.R.inc(743);assertNotNull(format);
        __CLR4_4_1iqiql6l8x0gm.R.inc(744);assertEquals("delimiter", CSVFormat.DEFAULT.getDelimiter(), format.getDelimiter());
        __CLR4_4_1iqiql6l8x0gm.R.inc(745);assertEquals("encapsulator", CSVFormat.DEFAULT.getEncapsulator(), format.getEncapsulator());
        __CLR4_4_1iqiql6l8x0gm.R.inc(746);assertEquals("comment start", CSVFormat.DEFAULT.getCommentStart(), format.getCommentStart());
        __CLR4_4_1iqiql6l8x0gm.R.inc(747);assertEquals("line separator", CSVFormat.DEFAULT.getLineSeparator(), format.getLineSeparator());
        __CLR4_4_1iqiql6l8x0gm.R.inc(748);assertEquals("escape", CSVFormat.DEFAULT.getEscape(), format.getEscape());
        __CLR4_4_1iqiql6l8x0gm.R.inc(749);assertEquals("trim", CSVFormat.DEFAULT.isSurroundingSpacesIgnored(), format.isSurroundingSpacesIgnored());
        __CLR4_4_1iqiql6l8x0gm.R.inc(750);assertEquals("empty lines", CSVFormat.DEFAULT.isEmptyLinesIgnored(), format.isEmptyLinesIgnored());
    }finally{__CLR4_4_1iqiql6l8x0gm.R.flushNeeded();}}
} 
