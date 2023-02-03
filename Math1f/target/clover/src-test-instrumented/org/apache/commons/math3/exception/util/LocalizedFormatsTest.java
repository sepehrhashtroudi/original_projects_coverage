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
package org.apache.commons.math3.exception.util;


import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Assert;

import org.junit.Test;

public class LocalizedFormatsTest {static class __CLR4_4_11ktt1kttlb90pch0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137428850L,8589935092L,73691,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testMessageNumber() {__CLR4_4_11ktt1kttlb90pch0.R.globalSliceStart(getClass().getName(),73649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14gyhff1ktt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ktt1kttlb90pch0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ktt1kttlb90pch0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.LocalizedFormatsTest.testMessageNumber",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14gyhff1ktt(){try{__CLR4_4_11ktt1kttlb90pch0.R.inc(73649);
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73650);Assert.assertEquals(313, LocalizedFormats.values().length);
    }finally{__CLR4_4_11ktt1kttlb90pch0.R.flushNeeded();}}

    @Test
    public void testAllKeysPresentInPropertiesFiles() {__CLR4_4_11ktt1kttlb90pch0.R.globalSliceStart(getClass().getName(),73651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n02k5u1ktv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ktt1kttlb90pch0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ktt1kttlb90pch0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.LocalizedFormatsTest.testAllKeysPresentInPropertiesFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n02k5u1ktv(){try{__CLR4_4_11ktt1kttlb90pch0.R.inc(73651);
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73652);final String path = LocalizedFormats.class.getName().replaceAll("\\.", "/");
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73653);for (final String language : new String[] { "fr" } ) {{
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73654);ResourceBundle bundle =
                ResourceBundle.getBundle("assets/" + path, new Locale(language));
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73655);for (LocalizedFormats message : LocalizedFormats.values()) {{
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73656);final String messageKey = message.toString();
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73657);boolean keyPresent = false;
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73658);for (final Enumeration<String> keys = bundle.getKeys(); (((keys.hasMoreElements())&&(__CLR4_4_11ktt1kttlb90pch0.R.iget(73659)!=0|true))||(__CLR4_4_11ktt1kttlb90pch0.R.iget(73660)==0&false));) {{
                    __CLR4_4_11ktt1kttlb90pch0.R.inc(73661);keyPresent |= messageKey.equals(keys.nextElement());
                }
                }__CLR4_4_11ktt1kttlb90pch0.R.inc(73662);Assert.assertTrue("missing key \"" + message.name() + "\" for language " + language,
                                  keyPresent);
            }
            }__CLR4_4_11ktt1kttlb90pch0.R.inc(73663);Assert.assertEquals(language, bundle.getLocale().getLanguage());
        }

    }}finally{__CLR4_4_11ktt1kttlb90pch0.R.flushNeeded();}}

    @Test
    public void testAllPropertiesCorrespondToKeys() {__CLR4_4_11ktt1kttlb90pch0.R.globalSliceStart(getClass().getName(),73664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1av8v891ku8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ktt1kttlb90pch0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ktt1kttlb90pch0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.LocalizedFormatsTest.testAllPropertiesCorrespondToKeys",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1av8v891ku8(){try{__CLR4_4_11ktt1kttlb90pch0.R.inc(73664);
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73665);final String path = LocalizedFormats.class.getName().replaceAll("\\.", "/");
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73666);for (final String language : new String[] { "fr" } ) {{
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73667);ResourceBundle bundle =
                ResourceBundle.getBundle("assets/" + path, new Locale(language));
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73668);for (final Enumeration<String> keys = bundle.getKeys(); (((keys.hasMoreElements())&&(__CLR4_4_11ktt1kttlb90pch0.R.iget(73669)!=0|true))||(__CLR4_4_11ktt1kttlb90pch0.R.iget(73670)==0&false));) {{
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73671);final String propertyKey = keys.nextElement();
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73672);try {
                    __CLR4_4_11ktt1kttlb90pch0.R.inc(73673);Assert.assertNotNull(LocalizedFormats.valueOf(propertyKey));
                } catch (IllegalArgumentException iae) {
                    __CLR4_4_11ktt1kttlb90pch0.R.inc(73674);Assert.fail("unknown key \"" + propertyKey + "\" in language " + language);
                }
            }
            }__CLR4_4_11ktt1kttlb90pch0.R.inc(73675);Assert.assertEquals(language, bundle.getLocale().getLanguage());
        }

    }}finally{__CLR4_4_11ktt1kttlb90pch0.R.flushNeeded();}}

    @Test
    public void testNoMissingFrenchTranslation() {__CLR4_4_11ktt1kttlb90pch0.R.globalSliceStart(getClass().getName(),73676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1peqd3f1kuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ktt1kttlb90pch0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ktt1kttlb90pch0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.LocalizedFormatsTest.testNoMissingFrenchTranslation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1peqd3f1kuk(){try{__CLR4_4_11ktt1kttlb90pch0.R.inc(73676);
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73677);for (LocalizedFormats message : LocalizedFormats.values()) {{
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73678);String translated = message.getLocalizedString(Locale.FRENCH);
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73679);Assert.assertFalse(message.name(), translated.toLowerCase().contains("missing translation"));
        }
    }}finally{__CLR4_4_11ktt1kttlb90pch0.R.flushNeeded();}}

    @Test
    public void testNoOpEnglishTranslation() {__CLR4_4_11ktt1kttlb90pch0.R.globalSliceStart(getClass().getName(),73680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhodgc1kuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ktt1kttlb90pch0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ktt1kttlb90pch0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.LocalizedFormatsTest.testNoOpEnglishTranslation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhodgc1kuo(){try{__CLR4_4_11ktt1kttlb90pch0.R.inc(73680);
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73681);for (LocalizedFormats message : LocalizedFormats.values()) {{
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73682);String translated = message.getLocalizedString(Locale.ENGLISH);
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73683);Assert.assertEquals(message.getSourceString(), translated);
        }
    }}finally{__CLR4_4_11ktt1kttlb90pch0.R.flushNeeded();}}

    @Test
    public void testVariablePartsConsistency() {__CLR4_4_11ktt1kttlb90pch0.R.globalSliceStart(getClass().getName(),73684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrvjmb1kus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11ktt1kttlb90pch0.R.rethrow($CLV_t2$);}finally{__CLR4_4_11ktt1kttlb90pch0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.math3.exception.util.LocalizedFormatsTest.testVariablePartsConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),73684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrvjmb1kus(){try{__CLR4_4_11ktt1kttlb90pch0.R.inc(73684);
        __CLR4_4_11ktt1kttlb90pch0.R.inc(73685);for (final String language : new String[] { "fr" } ) {{
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73686);Locale locale = new Locale(language);
            __CLR4_4_11ktt1kttlb90pch0.R.inc(73687);for (LocalizedFormats message : LocalizedFormats.values()) {{
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73688);MessageFormat source     = new MessageFormat(message.getSourceString());
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73689);MessageFormat translated = new MessageFormat(message.getLocalizedString(locale));
                __CLR4_4_11ktt1kttlb90pch0.R.inc(73690);Assert.assertEquals(message.name() + " (" + language + ")",
                                    source.getFormatsByArgumentIndex().length,
                                    translated.getFormatsByArgumentIndex().length);
            }
        }}
    }}finally{__CLR4_4_11ktt1kttlb90pch0.R.flushNeeded();}}

}
