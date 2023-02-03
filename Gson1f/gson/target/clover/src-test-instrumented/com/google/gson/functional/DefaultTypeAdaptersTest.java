/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.functional;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.UUID;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

/**
 * Functional test for Json serialization and deserialization for common classes for which default
 * support is provided in Gson. The tests for Map types are available in {@link MapTest}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class DefaultTypeAdaptersTest extends TestCase {static class __CLR4_4_14z34z3lck0y93k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,6694,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {try{__CLR4_4_14z34z3lck0y93k.R.inc(6447);
    __CLR4_4_14z34z3lck0y93k.R.inc(6448);super.setUp();
    __CLR4_4_14z34z3lck0y93k.R.inc(6449);this.oldTimeZone = TimeZone.getDefault();
    __CLR4_4_14z34z3lck0y93k.R.inc(6450);TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6451);gson = new Gson();
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  @Override
  protected void tearDown() throws Exception {try{__CLR4_4_14z34z3lck0y93k.R.inc(6452);
    __CLR4_4_14z34z3lck0y93k.R.inc(6453);TimeZone.setDefault(oldTimeZone);
    __CLR4_4_14z34z3lck0y93k.R.inc(6454);super.tearDown();
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUrlSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cuolei4zb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cuolei4zb() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6455);
    __CLR4_4_14z34z3lck0y93k.R.inc(6456);String urlValue = "http://google.com/";
    __CLR4_4_14z34z3lck0y93k.R.inc(6457);URL url = new URL(urlValue);
    __CLR4_4_14z34z3lck0y93k.R.inc(6458);assertEquals("\"http://google.com/\"", gson.toJson(url));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUrlDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7y23r4zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7y23r4zf(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6459);
    __CLR4_4_14z34z3lck0y93k.R.inc(6460);String urlValue = "http://google.com/";
    __CLR4_4_14z34z3lck0y93k.R.inc(6461);String json = "'http:\\/\\/google.com\\/'";
    __CLR4_4_14z34z3lck0y93k.R.inc(6462);URL target = gson.fromJson(json, URL.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6463);assertEquals(urlValue, target.toExternalForm());

    __CLR4_4_14z34z3lck0y93k.R.inc(6464);gson.fromJson('"' + urlValue + '"', URL.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6465);assertEquals(urlValue, target.toExternalForm());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUrlNullSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jcoln14zm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlNullSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jcoln14zm() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6466);
    __CLR4_4_14z34z3lck0y93k.R.inc(6467);ClassWithUrlField target = new ClassWithUrlField();
    __CLR4_4_14z34z3lck0y93k.R.inc(6468);assertEquals("{}", gson.toJson(target));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUrlNullDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19lwvci4zp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUrlNullDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19lwvci4zp(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6469);
    __CLR4_4_14z34z3lck0y93k.R.inc(6470);String json = "{}";
    __CLR4_4_14z34z3lck0y93k.R.inc(6471);ClassWithUrlField target = gson.fromJson(json, ClassWithUrlField.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6472);assertNull(target.url);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  private static class ClassWithUrlField {
    URL url;
  }

  public void testUriSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13kveot4zt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13kveot4zt() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6473);
    __CLR4_4_14z34z3lck0y93k.R.inc(6474);String uriValue = "http://google.com/";
    __CLR4_4_14z34z3lck0y93k.R.inc(6475);URI uri = new URI(uriValue);
    __CLR4_4_14z34z3lck0y93k.R.inc(6476);assertEquals("\"http://google.com/\"", gson.toJson(uri));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUriDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rs4mvw4zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUriDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rs4mvw4zx(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6477);
    __CLR4_4_14z34z3lck0y93k.R.inc(6478);String uriValue = "http://google.com/";
    __CLR4_4_14z34z3lck0y93k.R.inc(6479);String json = '"' + uriValue + '"';
    __CLR4_4_14z34z3lck0y93k.R.inc(6480);URI target = gson.fromJson(json, URI.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6481);assertEquals(uriValue, target.toASCIIString());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUuidSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkeiza502();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkeiza502() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6482);
    __CLR4_4_14z34z3lck0y93k.R.inc(6483);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0";
    __CLR4_4_14z34z3lck0y93k.R.inc(6484);UUID uuid = UUID.fromString(uuidValue);
    __CLR4_4_14z34z3lck0y93k.R.inc(6485);assertEquals('"' + uuidValue + '"', gson.toJson(uuid));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testUuidDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy32ll506();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testUuidDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy32ll506(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6486);
    __CLR4_4_14z34z3lck0y93k.R.inc(6487);String uuidValue = "c237bec1-19ef-4858-a98e-521cf0aad4c0";
    __CLR4_4_14z34z3lck0y93k.R.inc(6488);String json = '"' + uuidValue + '"';
    __CLR4_4_14z34z3lck0y93k.R.inc(6489);UUID target = gson.fromJson(json, UUID.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6490);assertEquals(uuidValue, target.toString());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testLocaleSerializationWithLanguage() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d5tx3r50b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d5tx3r50b(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6491);
    __CLR4_4_14z34z3lck0y93k.R.inc(6492);Locale target = new Locale("en");
    __CLR4_4_14z34z3lck0y93k.R.inc(6493);assertEquals("\"en\"", gson.toJson(target));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testLocaleDeserializationWithLanguage() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wcbvc50e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wcbvc50e(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6494);
    __CLR4_4_14z34z3lck0y93k.R.inc(6495);String json = "\"en\"";
    __CLR4_4_14z34z3lck0y93k.R.inc(6496);Locale locale = gson.fromJson(json, Locale.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6497);assertEquals("en", locale.getLanguage());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testLocaleSerializationWithLanguageCountry() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18bjg0r50i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18bjg0r50i(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6498);
    __CLR4_4_14z34z3lck0y93k.R.inc(6499);Locale target = Locale.CANADA_FRENCH;
    __CLR4_4_14z34z3lck0y93k.R.inc(6500);assertEquals("\"fr_CA\"", gson.toJson(target));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testLocaleDeserializationWithLanguageCountry() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w7w0ck50l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountry",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w7w0ck50l(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6501);
    __CLR4_4_14z34z3lck0y93k.R.inc(6502);String json = "\"fr_CA\"";
    __CLR4_4_14z34z3lck0y93k.R.inc(6503);Locale locale = gson.fromJson(json, Locale.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6504);assertEquals(Locale.CANADA_FRENCH, locale);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testLocaleSerializationWithLanguageCountryVariant() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j19gqg50p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleSerializationWithLanguageCountryVariant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j19gqg50p(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6505);
    __CLR4_4_14z34z3lck0y93k.R.inc(6506);Locale target = new Locale("de", "DE", "EURO");
    __CLR4_4_14z34z3lck0y93k.R.inc(6507);String json = gson.toJson(target);
    __CLR4_4_14z34z3lck0y93k.R.inc(6508);assertEquals("\"de_DE_EURO\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testLocaleDeserializationWithLanguageCountryVariant() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ww128950t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testLocaleDeserializationWithLanguageCountryVariant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ww128950t(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6509);
    __CLR4_4_14z34z3lck0y93k.R.inc(6510);String json = "\"de_DE_EURO\"";
    __CLR4_4_14z34z3lck0y93k.R.inc(6511);Locale locale = gson.fromJson(json, Locale.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6512);assertEquals("de", locale.getLanguage());
    __CLR4_4_14z34z3lck0y93k.R.inc(6513);assertEquals("DE", locale.getCountry());
    __CLR4_4_14z34z3lck0y93k.R.inc(6514);assertEquals("EURO", locale.getVariant());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testBigDecimalFieldSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj2ups50z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj2ups50z(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6515);
    __CLR4_4_14z34z3lck0y93k.R.inc(6516);ClassWithBigDecimal target = new ClassWithBigDecimal("-122.01e-21");
    __CLR4_4_14z34z3lck0y93k.R.inc(6517);String json = gson.toJson(target);
    __CLR4_4_14z34z3lck0y93k.R.inc(6518);String actual = json.substring(json.indexOf(':') + 1, json.indexOf('}'));
    __CLR4_4_14z34z3lck0y93k.R.inc(6519);assertEquals(target.value, new BigDecimal(actual));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testBigDecimalFieldDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ewcsg1514();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigDecimalFieldDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ewcsg1514(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6520);
    __CLR4_4_14z34z3lck0y93k.R.inc(6521);ClassWithBigDecimal expected = new ClassWithBigDecimal("-122.01e-21");
    __CLR4_4_14z34z3lck0y93k.R.inc(6522);String json = expected.getExpectedJson();
    __CLR4_4_14z34z3lck0y93k.R.inc(6523);ClassWithBigDecimal actual = gson.fromJson(json, ClassWithBigDecimal.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6524);assertEquals(expected.value, actual.value);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testBadValueForBigDecimalDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gll3ay519();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBadValueForBigDecimalDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gll3ay519(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6525);
    __CLR4_4_14z34z3lck0y93k.R.inc(6526);try {
      __CLR4_4_14z34z3lck0y93k.R.inc(6527);gson.fromJson("{\"value\"=1.5e-1.0031}", ClassWithBigDecimal.class);
      __CLR4_4_14z34z3lck0y93k.R.inc(6528);fail("Exponent of a BigDecimal must be an integer value.");
    } catch (JsonParseException expected) { }
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testBigIntegerFieldSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a92ih951d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a92ih951d(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6529);
    __CLR4_4_14z34z3lck0y93k.R.inc(6530);ClassWithBigInteger target = new ClassWithBigInteger("23232323215323234234324324324324324324");
    __CLR4_4_14z34z3lck0y93k.R.inc(6531);String json = gson.toJson(target);
    __CLR4_4_14z34z3lck0y93k.R.inc(6532);assertEquals(target.getExpectedJson(), json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testBigIntegerFieldDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3g6k451h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testBigIntegerFieldDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3g6k451h(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6533);
    __CLR4_4_14z34z3lck0y93k.R.inc(6534);ClassWithBigInteger expected = new ClassWithBigInteger("879697697697697697697697697697697697");
    __CLR4_4_14z34z3lck0y93k.R.inc(6535);String json = expected.getExpectedJson();
    __CLR4_4_14z34z3lck0y93k.R.inc(6536);ClassWithBigInteger actual = gson.fromJson(json, ClassWithBigInteger.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6537);assertEquals(expected.value, actual.value);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testSetSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1luu9nd51m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testSetSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1luu9nd51m() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6538);
    __CLR4_4_14z34z3lck0y93k.R.inc(6539);Gson gson = new Gson();
    __CLR4_4_14z34z3lck0y93k.R.inc(6540);HashSet<String> s = new HashSet<String>();
    __CLR4_4_14z34z3lck0y93k.R.inc(6541);s.add("blah");
    __CLR4_4_14z34z3lck0y93k.R.inc(6542);String json = gson.toJson(s);
    __CLR4_4_14z34z3lck0y93k.R.inc(6543);assertEquals("[\"blah\"]", json);

    __CLR4_4_14z34z3lck0y93k.R.inc(6544);json = gson.toJson(s, Set.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6545);assertEquals("[\"blah\"]", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultDateSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcwu251u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcwu251u(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6546);
    __CLR4_4_14z34z3lck0y93k.R.inc(6547);Date now = new Date();
    __CLR4_4_14z34z3lck0y93k.R.inc(6548);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6549);assertEquals("\"" + DateFormat.getDateTimeInstance().format(now) + "\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultDateDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqs62h51y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqs62h51y(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6550);
    __CLR4_4_14z34z3lck0y93k.R.inc(6551);String json = "'Dec 13, 2009 07:18:02 AM'";
    __CLR4_4_14z34z3lck0y93k.R.inc(6552);Date extracted = gson.fromJson(json, Date.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6553);assertEqualsDate(extracted, 2009, 11, 13);
    __CLR4_4_14z34z3lck0y93k.R.inc(6554);assertEqualsTime(extracted, 7, 18, 02);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {try{__CLR4_4_14z34z3lck0y93k.R.inc(6555);
      __CLR4_4_14z34z3lck0y93k.R.inc(6556);assertEquals(year-1900, date.getYear());
      __CLR4_4_14z34z3lck0y93k.R.inc(6557);assertEquals(month, date.getMonth());
      __CLR4_4_14z34z3lck0y93k.R.inc(6558);assertEquals(day, date.getDate());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {try{__CLR4_4_14z34z3lck0y93k.R.inc(6559);
    __CLR4_4_14z34z3lck0y93k.R.inc(6560);assertEquals(hours, date.getHours());
    __CLR4_4_14z34z3lck0y93k.R.inc(6561);assertEquals(minutes, date.getMinutes());
    __CLR4_4_14z34z3lck0y93k.R.inc(6562);assertEquals(seconds, date.getSeconds());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultJavaSqlDateSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u8a23052b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u8a23052b(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6563);
    __CLR4_4_14z34z3lck0y93k.R.inc(6564);java.sql.Date instant = new java.sql.Date(1259875082000L);
    __CLR4_4_14z34z3lck0y93k.R.inc(6565);String json = gson.toJson(instant);
    __CLR4_4_14z34z3lck0y93k.R.inc(6566);assertEquals("\"Dec 3, 2009\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultJavaSqlDateDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13jgoad52f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlDateDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13jgoad52f(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6567);
    __CLR4_4_14z34z3lck0y93k.R.inc(6568);String json = "'Dec 3, 2009'";
    __CLR4_4_14z34z3lck0y93k.R.inc(6569);java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6570);assertEqualsDate(extracted, 2009, 11, 3);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultJavaSqlTimestampSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ba8tvi52j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ba8tvi52j(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6571);
    __CLR4_4_14z34z3lck0y93k.R.inc(6572);Timestamp now = new java.sql.Timestamp(1259875082000L);
    __CLR4_4_14z34z3lck0y93k.R.inc(6573);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6574);assertEquals("\"Dec 3, 2009 1:18:02 PM\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultJavaSqlTimestampDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5eqtf52n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimestampDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6575,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5eqtf52n(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6575);
    __CLR4_4_14z34z3lck0y93k.R.inc(6576);String json = "'Dec 3, 2009 1:18:02 PM'";
    __CLR4_4_14z34z3lck0y93k.R.inc(6577);Timestamp extracted = gson.fromJson(json, Timestamp.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6578);assertEqualsDate(extracted, 2009, 11, 3);
    __CLR4_4_14z34z3lck0y93k.R.inc(6579);assertEqualsTime(extracted, 13, 18, 02);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultJavaSqlTimeSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yt6b152s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6580,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yt6b152s(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6580);
    __CLR4_4_14z34z3lck0y93k.R.inc(6581);Time now = new Time(1259875082000L);
    __CLR4_4_14z34z3lck0y93k.R.inc(6582);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6583);assertEquals("\"01:18:02 PM\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultJavaSqlTimeDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b9dtkc52w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultJavaSqlTimeDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b9dtkc52w(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6584);
    __CLR4_4_14z34z3lck0y93k.R.inc(6585);String json = "'1:18:02 PM'";
    __CLR4_4_14z34z3lck0y93k.R.inc(6586);Time extracted = gson.fromJson(json, Time.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6587);assertEqualsTime(extracted, 13, 18, 02);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultDateSerializationUsingBuilder() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g7uk1530();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateSerializationUsingBuilder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g7uk1530() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6588);
    __CLR4_4_14z34z3lck0y93k.R.inc(6589);Gson gson = new GsonBuilder().create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6590);Date now = new Date();
    __CLR4_4_14z34z3lck0y93k.R.inc(6591);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6592);assertEquals("\"" + DateFormat.getDateTimeInstance().format(now) + "\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultDateDeserializationUsingBuilder() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qg3x5c535();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultDateDeserializationUsingBuilder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qg3x5c535() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6593);
    __CLR4_4_14z34z3lck0y93k.R.inc(6594);Gson gson = new GsonBuilder().create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6595);Date now = new Date();
    __CLR4_4_14z34z3lck0y93k.R.inc(6596);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6597);Date extracted = gson.fromJson(json, Date.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6598);assertEquals(now.toString(), extracted.toString());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultCalendarSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gtklau53b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gtklau53b() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6599);
    __CLR4_4_14z34z3lck0y93k.R.inc(6600);Gson gson = new GsonBuilder().create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6601);String json = gson.toJson(Calendar.getInstance());
    __CLR4_4_14z34z3lck0y93k.R.inc(6602);assertTrue(json.contains("year"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6603);assertTrue(json.contains("month"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6604);assertTrue(json.contains("dayOfMonth"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6605);assertTrue(json.contains("hourOfDay"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6606);assertTrue(json.contains("minute"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6607);assertTrue(json.contains("second"));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultCalendarDeserialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qq41pl53k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultCalendarDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qq41pl53k() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6608);
    __CLR4_4_14z34z3lck0y93k.R.inc(6609);Gson gson = new GsonBuilder().create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6610);String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}";
    __CLR4_4_14z34z3lck0y93k.R.inc(6611);Calendar cal = gson.fromJson(json, Calendar.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6612);assertEquals(2009, cal.get(Calendar.YEAR));
    __CLR4_4_14z34z3lck0y93k.R.inc(6613);assertEquals(2, cal.get(Calendar.MONTH));
    __CLR4_4_14z34z3lck0y93k.R.inc(6614);assertEquals(11, cal.get(Calendar.DAY_OF_MONTH));
    __CLR4_4_14z34z3lck0y93k.R.inc(6615);assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
    __CLR4_4_14z34z3lck0y93k.R.inc(6616);assertEquals(29, cal.get(Calendar.MINUTE));
    __CLR4_4_14z34z3lck0y93k.R.inc(6617);assertEquals(23, cal.get(Calendar.SECOND));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultGregorianCalendarSerialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ews2qm53u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultGregorianCalendarSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ews2qm53u() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6618);
    __CLR4_4_14z34z3lck0y93k.R.inc(6619);Gson gson = new GsonBuilder().create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6620);GregorianCalendar cal = new GregorianCalendar();
    __CLR4_4_14z34z3lck0y93k.R.inc(6621);String json = gson.toJson(cal);
    __CLR4_4_14z34z3lck0y93k.R.inc(6622);assertTrue(json.contains("year"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6623);assertTrue(json.contains("month"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6624);assertTrue(json.contains("dayOfMonth"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6625);assertTrue(json.contains("hourOfDay"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6626);assertTrue(json.contains("minute"));
    __CLR4_4_14z34z3lck0y93k.R.inc(6627);assertTrue(json.contains("second"));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDefaultGregorianCalendarDeserialization() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gae469544();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDefaultGregorianCalendarDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gae469544() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6628);
    __CLR4_4_14z34z3lck0y93k.R.inc(6629);Gson gson = new GsonBuilder().create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6630);String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}";
    __CLR4_4_14z34z3lck0y93k.R.inc(6631);GregorianCalendar cal = gson.fromJson(json, GregorianCalendar.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6632);assertEquals(2009, cal.get(Calendar.YEAR));
    __CLR4_4_14z34z3lck0y93k.R.inc(6633);assertEquals(2, cal.get(Calendar.MONTH));
    __CLR4_4_14z34z3lck0y93k.R.inc(6634);assertEquals(11, cal.get(Calendar.DAY_OF_MONTH));
    __CLR4_4_14z34z3lck0y93k.R.inc(6635);assertEquals(14, cal.get(Calendar.HOUR_OF_DAY));
    __CLR4_4_14z34z3lck0y93k.R.inc(6636);assertEquals(29, cal.get(Calendar.MINUTE));
    __CLR4_4_14z34z3lck0y93k.R.inc(6637);assertEquals(23, cal.get(Calendar.SECOND));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDateSerializationWithPattern() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nm5aht54e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nm5aht54e() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6638);
    __CLR4_4_14z34z3lck0y93k.R.inc(6639);String pattern = "yyyy-MM-dd";
    __CLR4_4_14z34z3lck0y93k.R.inc(6640);DateFormat formatter = new SimpleDateFormat(pattern);
    __CLR4_4_14z34z3lck0y93k.R.inc(6641);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6642);Date now = new Date();
    __CLR4_4_14z34z3lck0y93k.R.inc(6643);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6644);assertEquals("\"" + formatter.format(now) + "\"", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  @SuppressWarnings("deprecation")
  public void testDateDeserializationWithPattern() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2uqbm54l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateDeserializationWithPattern",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6645,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2uqbm54l() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6645);
    __CLR4_4_14z34z3lck0y93k.R.inc(6646);String pattern = "yyyy-MM-dd";
    __CLR4_4_14z34z3lck0y93k.R.inc(6647);Gson gson = new GsonBuilder().setDateFormat(DateFormat.FULL).setDateFormat(pattern).create();
    __CLR4_4_14z34z3lck0y93k.R.inc(6648);Date now = new Date();
    __CLR4_4_14z34z3lck0y93k.R.inc(6649);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6650);Date extracted = gson.fromJson(json, Date.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6651);assertEquals(now.getYear(), extracted.getYear());
    __CLR4_4_14z34z3lck0y93k.R.inc(6652);assertEquals(now.getMonth(), extracted.getMonth());
    __CLR4_4_14z34z3lck0y93k.R.inc(6653);assertEquals(now.getDay(), extracted.getDay());
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testDateSerializationWithPatternNotOverridenByTypeAdapter() throws Exception {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ouu4c54u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testDateSerializationWithPatternNotOverridenByTypeAdapter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ouu4c54u() throws Exception{try{__CLR4_4_14z34z3lck0y93k.R.inc(6654);
    __CLR4_4_14z34z3lck0y93k.R.inc(6655);String pattern = "yyyy-MM-dd";
    __CLR4_4_14z34z3lck0y93k.R.inc(6656);DateFormat formatter = new SimpleDateFormat(pattern);
    __CLR4_4_14z34z3lck0y93k.R.inc(6657);Gson gson = new GsonBuilder()
        .setDateFormat(pattern)
        .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
          public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
              throws JsonParseException {try{__CLR4_4_14z34z3lck0y93k.R.inc(6658);
            __CLR4_4_14z34z3lck0y93k.R.inc(6659);return new Date();
          }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
        })
        .create();

    __CLR4_4_14z34z3lck0y93k.R.inc(6660);Date now = new Date();
    __CLR4_4_14z34z3lck0y93k.R.inc(6661);String expectedDateString = "\"" + formatter.format(now) + "\"";
    __CLR4_4_14z34z3lck0y93k.R.inc(6662);String json = gson.toJson(now);
    __CLR4_4_14z34z3lck0y93k.R.inc(6663);assertEquals(expectedDateString, json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() {try{__CLR4_4_14z34z3lck0y93k.R.inc(6664); }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
    ClassWithBigDecimal(String value) {try{__CLR4_4_14z34z3lck0y93k.R.inc(6665);
      __CLR4_4_14z34z3lck0y93k.R.inc(6666);this.value = new BigDecimal(value);
    }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_14z34z3lck0y93k.R.inc(6667);
      __CLR4_4_14z34z3lck0y93k.R.inc(6668);return "{\"value\":" + value.toEngineeringString() + "}";
    }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() {try{__CLR4_4_14z34z3lck0y93k.R.inc(6669); }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
    ClassWithBigInteger(String value) {try{__CLR4_4_14z34z3lck0y93k.R.inc(6670);
      __CLR4_4_14z34z3lck0y93k.R.inc(6671);this.value = new BigInteger(value);
    }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
    String getExpectedJson() {try{__CLR4_4_14z34z3lck0y93k.R.inc(6672);
      __CLR4_4_14z34z3lck0y93k.R.inc(6673);return "{\"value\":" + value + "}";
    }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
  }

  public void testPropertiesSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1skf4pa55e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1skf4pa55e(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6674);
    __CLR4_4_14z34z3lck0y93k.R.inc(6675);Properties props = new Properties();
    __CLR4_4_14z34z3lck0y93k.R.inc(6676);props.setProperty("foo", "bar");
    __CLR4_4_14z34z3lck0y93k.R.inc(6677);String json = gson.toJson(props);
    __CLR4_4_14z34z3lck0y93k.R.inc(6678);String expected = "{\"foo\":\"bar\"}";
    __CLR4_4_14z34z3lck0y93k.R.inc(6679);assertEquals(expected, json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testPropertiesDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxsv7555k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testPropertiesDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6680,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxsv7555k(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6680);
    __CLR4_4_14z34z3lck0y93k.R.inc(6681);String json = "{foo:'bar'}";
    __CLR4_4_14z34z3lck0y93k.R.inc(6682);Properties props = gson.fromJson(json, Properties.class);
    __CLR4_4_14z34z3lck0y93k.R.inc(6683);assertEquals("bar", props.getProperty("foo"));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testTreeSetSerialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqfjj955o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetSerialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqfjj955o(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6684);
    __CLR4_4_14z34z3lck0y93k.R.inc(6685);TreeSet<String> treeSet = new TreeSet<String>();
    __CLR4_4_14z34z3lck0y93k.R.inc(6686);treeSet.add("Value1");
    __CLR4_4_14z34z3lck0y93k.R.inc(6687);String json = gson.toJson(treeSet);
    __CLR4_4_14z34z3lck0y93k.R.inc(6688);assertEquals("[\"Value1\"]", json);
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}

  public void testTreeSetDeserialization() {__CLR4_4_14z34z3lck0y93k.R.globalSliceStart(getClass().getName(),6689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h8qkbo55t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14z34z3lck0y93k.R.rethrow($CLV_t2$);}finally{__CLR4_4_14z34z3lck0y93k.R.globalSliceEnd(getClass().getName(),"com.google.gson.functional.DefaultTypeAdaptersTest.testTreeSetDeserialization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h8qkbo55t(){try{__CLR4_4_14z34z3lck0y93k.R.inc(6689);
    __CLR4_4_14z34z3lck0y93k.R.inc(6690);String json = "['Value1']";
    __CLR4_4_14z34z3lck0y93k.R.inc(6691);Type type = new TypeToken<TreeSet<String>>() {}.getType();
    __CLR4_4_14z34z3lck0y93k.R.inc(6692);TreeSet<String> treeSet = gson.fromJson(json, type);
    __CLR4_4_14z34z3lck0y93k.R.inc(6693);assertTrue(treeSet.contains("Value1"));
  }finally{__CLR4_4_14z34z3lck0y93k.R.flushNeeded();}}
}
