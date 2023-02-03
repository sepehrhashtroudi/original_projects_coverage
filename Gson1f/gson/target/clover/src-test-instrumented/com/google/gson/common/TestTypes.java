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

package com.google.gson.common;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

/**
 * Types used for testing JSON serialization and deserialization
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TestTypes {static class __CLR4_4_1462462lck0y8ym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979755149L,8589935092L,5620,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
  public static class Base {
    public static final String BASE_NAME = Base.class.getSimpleName();
    public static final String BASE_FIELD_KEY = "baseName";
    public static final String SERIALIZER_KEY = "serializerName";
    public String baseName = BASE_NAME;
    public String serializerName;
  }

  public static class Sub extends Base {
    public static final String SUB_NAME = Sub.class.getSimpleName();
    public static final String SUB_FIELD_KEY = "subName";
    public final String subName = SUB_NAME;
  }

  public static class ClassWithBaseField {
    public static final String FIELD_KEY = "base";
    public final Base base;
    @SuppressWarnings("unused")
    private ClassWithBaseField() {
      this(null);__CLR4_4_1462462lck0y8ym.R.inc(5403);try{__CLR4_4_1462462lck0y8ym.R.inc(5402);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    public ClassWithBaseField(Base base) {try{__CLR4_4_1462462lck0y8ym.R.inc(5404);
      __CLR4_4_1462462lck0y8ym.R.inc(5405);this.base = base;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithBaseArrayField {
    public static final String FIELD_KEY = "base";
    public final Base[] base;
    @SuppressWarnings("unused")
    private ClassWithBaseArrayField() {
      this(null);__CLR4_4_1462462lck0y8ym.R.inc(5407);try{__CLR4_4_1462462lck0y8ym.R.inc(5406);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    public ClassWithBaseArrayField(Base[] base) {try{__CLR4_4_1462462lck0y8ym.R.inc(5408);
      __CLR4_4_1462462lck0y8ym.R.inc(5409);this.base = base;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class BaseSerializer implements JsonSerializer<Base> {
    public static final String NAME = BaseSerializer.class.getSimpleName(); 
    public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_1462462lck0y8ym.R.inc(5410);
      __CLR4_4_1462462lck0y8ym.R.inc(5411);JsonObject obj = new JsonObject();
      __CLR4_4_1462462lck0y8ym.R.inc(5412);obj.addProperty(Base.SERIALIZER_KEY, NAME);
      __CLR4_4_1462462lck0y8ym.R.inc(5413);return obj;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}    
  }
  public static class SubSerializer implements JsonSerializer<Sub> {
    public static final String NAME = SubSerializer.class.getSimpleName(); 
    public JsonElement serialize(Sub src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_1462462lck0y8ym.R.inc(5414);
      __CLR4_4_1462462lck0y8ym.R.inc(5415);JsonObject obj = new JsonObject();
      __CLR4_4_1462462lck0y8ym.R.inc(5416);obj.addProperty(Base.SERIALIZER_KEY, NAME);
      __CLR4_4_1462462lck0y8ym.R.inc(5417);return obj;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}    
  }

  public static class StringWrapper {
    public final String someConstantStringInstanceField;

    StringWrapper() {
      this("Blah");__CLR4_4_1462462lck0y8ym.R.inc(5419);try{__CLR4_4_1462462lck0y8ym.R.inc(5418);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public StringWrapper(String value) {try{__CLR4_4_1462462lck0y8ym.R.inc(5420);
      __CLR4_4_1462462lck0y8ym.R.inc(5421);someConstantStringInstanceField = value;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class BagOfPrimitives {
    public static final long DEFAULT_VALUE = 0;
    public long longValue;
    public int intValue;
    public boolean booleanValue;
    public String stringValue;

    public BagOfPrimitives() {
      this(DEFAULT_VALUE, 0, false, "");__CLR4_4_1462462lck0y8ym.R.inc(5423);try{__CLR4_4_1462462lck0y8ym.R.inc(5422);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public BagOfPrimitives(long longValue, int intValue, boolean booleanValue, String stringValue) {try{__CLR4_4_1462462lck0y8ym.R.inc(5424);
      __CLR4_4_1462462lck0y8ym.R.inc(5425);this.longValue = longValue;
      __CLR4_4_1462462lck0y8ym.R.inc(5426);this.intValue = intValue;
      __CLR4_4_1462462lck0y8ym.R.inc(5427);this.booleanValue = booleanValue;
      __CLR4_4_1462462lck0y8ym.R.inc(5428);this.stringValue = stringValue;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public int getIntValue() {try{__CLR4_4_1462462lck0y8ym.R.inc(5429);
      __CLR4_4_1462462lck0y8ym.R.inc(5430);return intValue;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5431);
      __CLR4_4_1462462lck0y8ym.R.inc(5432);StringBuilder sb = new StringBuilder();
      __CLR4_4_1462462lck0y8ym.R.inc(5433);sb.append("{");
      __CLR4_4_1462462lck0y8ym.R.inc(5434);sb.append("\"longValue\":").append(longValue).append(",");
      __CLR4_4_1462462lck0y8ym.R.inc(5435);sb.append("\"intValue\":").append(intValue).append(",");
      __CLR4_4_1462462lck0y8ym.R.inc(5436);sb.append("\"booleanValue\":").append(booleanValue).append(",");
      __CLR4_4_1462462lck0y8ym.R.inc(5437);sb.append("\"stringValue\":\"").append(stringValue).append("\"");
      __CLR4_4_1462462lck0y8ym.R.inc(5438);sb.append("}");
      __CLR4_4_1462462lck0y8ym.R.inc(5439);return sb.toString();
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1462462lck0y8ym.R.inc(5440);
      __CLR4_4_1462462lck0y8ym.R.inc(5441);final int prime = 31;
      __CLR4_4_1462462lck0y8ym.R.inc(5442);int result = 1;
      __CLR4_4_1462462lck0y8ym.R.inc(5443);result = prime * result + ((((booleanValue )&&(__CLR4_4_1462462lck0y8ym.R.iget(5444)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5445)==0&false))? 1231 : 1237);
      __CLR4_4_1462462lck0y8ym.R.inc(5446);result = prime * result + intValue;
      __CLR4_4_1462462lck0y8ym.R.inc(5447);result = prime * result + (int) (longValue ^ (longValue >>> 32));
      __CLR4_4_1462462lck0y8ym.R.inc(5448);result = prime * result + (((((stringValue == null) )&&(__CLR4_4_1462462lck0y8ym.R.iget(5449)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5450)==0&false))? 0 : stringValue.hashCode());
      __CLR4_4_1462462lck0y8ym.R.inc(5451);return result;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1462462lck0y8ym.R.inc(5452);
      __CLR4_4_1462462lck0y8ym.R.inc(5453);if ((((this == obj)&&(__CLR4_4_1462462lck0y8ym.R.iget(5454)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5455)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5456);return true;
      }__CLR4_4_1462462lck0y8ym.R.inc(5457);if ((((obj == null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5458)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5459)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5460);return false;
      }__CLR4_4_1462462lck0y8ym.R.inc(5461);if ((((getClass() != obj.getClass())&&(__CLR4_4_1462462lck0y8ym.R.iget(5462)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5463)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5464);return false;
      }__CLR4_4_1462462lck0y8ym.R.inc(5465);BagOfPrimitives other = (BagOfPrimitives) obj;
      __CLR4_4_1462462lck0y8ym.R.inc(5466);if ((((booleanValue != other.booleanValue)&&(__CLR4_4_1462462lck0y8ym.R.iget(5467)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5468)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5469);return false;
      }__CLR4_4_1462462lck0y8ym.R.inc(5470);if ((((intValue != other.intValue)&&(__CLR4_4_1462462lck0y8ym.R.iget(5471)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5472)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5473);return false;
      }__CLR4_4_1462462lck0y8ym.R.inc(5474);if ((((longValue != other.longValue)&&(__CLR4_4_1462462lck0y8ym.R.iget(5475)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5476)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5477);return false;
      }__CLR4_4_1462462lck0y8ym.R.inc(5478);if ((((stringValue == null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5479)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5480)==0&false))) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5481);if ((((other.stringValue != null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5482)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5483)==0&false)))
          {__CLR4_4_1462462lck0y8ym.R.inc(5484);return false;
      }} }else {__CLR4_4_1462462lck0y8ym.R.inc(5485);if ((((!stringValue.equals(other.stringValue))&&(__CLR4_4_1462462lck0y8ym.R.iget(5486)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5487)==0&false)))
        {__CLR4_4_1462462lck0y8ym.R.inc(5488);return false;
      }}__CLR4_4_1462462lck0y8ym.R.inc(5489);return true;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1462462lck0y8ym.R.inc(5490);
      __CLR4_4_1462462lck0y8ym.R.inc(5491);return String.format("(longValue=%d,intValue=%d,booleanValue=%b,stringValue=%s)",
          longValue, intValue, booleanValue, stringValue);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class BagOfPrimitiveWrappers {
    private final Long longValue;
    private final Integer intValue;
    private final Boolean booleanValue;

    public BagOfPrimitiveWrappers() {
      this(0L, 0, false);__CLR4_4_1462462lck0y8ym.R.inc(5493);try{__CLR4_4_1462462lck0y8ym.R.inc(5492);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public BagOfPrimitiveWrappers(Long longValue, Integer intValue, Boolean booleanValue) {try{__CLR4_4_1462462lck0y8ym.R.inc(5494);
      __CLR4_4_1462462lck0y8ym.R.inc(5495);this.longValue = longValue;
      __CLR4_4_1462462lck0y8ym.R.inc(5496);this.intValue = intValue;
      __CLR4_4_1462462lck0y8ym.R.inc(5497);this.booleanValue = booleanValue;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5498);
      __CLR4_4_1462462lck0y8ym.R.inc(5499);StringBuilder sb = new StringBuilder();
      __CLR4_4_1462462lck0y8ym.R.inc(5500);sb.append("{");
      __CLR4_4_1462462lck0y8ym.R.inc(5501);sb.append("\"longValue\":").append(longValue).append(",");
      __CLR4_4_1462462lck0y8ym.R.inc(5502);sb.append("\"intValue\":").append(intValue).append(",");
      __CLR4_4_1462462lck0y8ym.R.inc(5503);sb.append("\"booleanValue\":").append(booleanValue);
      __CLR4_4_1462462lck0y8ym.R.inc(5504);sb.append("}");
      __CLR4_4_1462462lck0y8ym.R.inc(5505);return sb.toString();
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class PrimitiveArray {
    private final long[] longArray;

    public PrimitiveArray() {
      this(new long[0]);__CLR4_4_1462462lck0y8ym.R.inc(5507);try{__CLR4_4_1462462lck0y8ym.R.inc(5506);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public PrimitiveArray(long[] longArray) {try{__CLR4_4_1462462lck0y8ym.R.inc(5508);
      __CLR4_4_1462462lck0y8ym.R.inc(5509);this.longArray = longArray;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5510);
      __CLR4_4_1462462lck0y8ym.R.inc(5511);StringBuilder sb = new StringBuilder();
      __CLR4_4_1462462lck0y8ym.R.inc(5512);sb.append("{\"longArray\":[");

      __CLR4_4_1462462lck0y8ym.R.inc(5513);boolean first = true;
      __CLR4_4_1462462lck0y8ym.R.inc(5514);for (long l : longArray) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5515);if ((((!first)&&(__CLR4_4_1462462lck0y8ym.R.iget(5516)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5517)==0&false))) {{
          __CLR4_4_1462462lck0y8ym.R.inc(5518);sb.append(",");
        } }else {{
          __CLR4_4_1462462lck0y8ym.R.inc(5519);first = false;
        }
        }__CLR4_4_1462462lck0y8ym.R.inc(5520);sb.append(l);
      }

      }__CLR4_4_1462462lck0y8ym.R.inc(5521);sb.append("]}");
      __CLR4_4_1462462lck0y8ym.R.inc(5522);return sb.toString();
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithNoFields {
    // Nothing here.. .
    @Override
    public boolean equals(Object other) {try{__CLR4_4_1462462lck0y8ym.R.inc(5523);
      __CLR4_4_1462462lck0y8ym.R.inc(5524);return other.getClass() == ClassWithNoFields.class;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class Nested {
    private final BagOfPrimitives primitive1;
    private final BagOfPrimitives primitive2;

    public Nested() {
      this(null, null);__CLR4_4_1462462lck0y8ym.R.inc(5526);try{__CLR4_4_1462462lck0y8ym.R.inc(5525);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public Nested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) {try{__CLR4_4_1462462lck0y8ym.R.inc(5527);
      __CLR4_4_1462462lck0y8ym.R.inc(5528);this.primitive1 = primitive1;
      __CLR4_4_1462462lck0y8ym.R.inc(5529);this.primitive2 = primitive2;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5530);
      __CLR4_4_1462462lck0y8ym.R.inc(5531);StringBuilder sb = new StringBuilder();
      __CLR4_4_1462462lck0y8ym.R.inc(5532);sb.append("{");
      __CLR4_4_1462462lck0y8ym.R.inc(5533);appendFields(sb);
      __CLR4_4_1462462lck0y8ym.R.inc(5534);sb.append("}");
      __CLR4_4_1462462lck0y8ym.R.inc(5535);return sb.toString();
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public void appendFields(StringBuilder sb) {try{__CLR4_4_1462462lck0y8ym.R.inc(5536);
      __CLR4_4_1462462lck0y8ym.R.inc(5537);if ((((primitive1 != null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5538)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5539)==0&false))) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5540);sb.append("\"primitive1\":").append(primitive1.getExpectedJson());
      }
      }__CLR4_4_1462462lck0y8ym.R.inc(5541);if ((((primitive1 != null && primitive2 != null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5542)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5543)==0&false))) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5544);sb.append(",");
      }
      }__CLR4_4_1462462lck0y8ym.R.inc(5545);if ((((primitive2 != null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5546)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5547)==0&false))) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5548);sb.append("\"primitive2\":").append(primitive2.getExpectedJson());
      }
    }}finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithTransientFields<T> {
    public transient T transientT; 
    public final transient long transientLongValue;
    private final long[] longValue;

    public ClassWithTransientFields() {
      this(0L);__CLR4_4_1462462lck0y8ym.R.inc(5550);try{__CLR4_4_1462462lck0y8ym.R.inc(5549);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public ClassWithTransientFields(long value) {try{__CLR4_4_1462462lck0y8ym.R.inc(5551);
      __CLR4_4_1462462lck0y8ym.R.inc(5552);longValue = new long[] { value };
      __CLR4_4_1462462lck0y8ym.R.inc(5553);transientLongValue = value + 1;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5554);
      __CLR4_4_1462462lck0y8ym.R.inc(5555);StringBuilder sb = new StringBuilder();
      __CLR4_4_1462462lck0y8ym.R.inc(5556);sb.append("{");
      __CLR4_4_1462462lck0y8ym.R.inc(5557);sb.append("\"longValue\":[").append(longValue[0]).append("]");
      __CLR4_4_1462462lck0y8ym.R.inc(5558);sb.append("}");
      __CLR4_4_1462462lck0y8ym.R.inc(5559);return sb.toString();
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithCustomTypeConverter {
    private final BagOfPrimitives bag;
    private final int value;

    public ClassWithCustomTypeConverter() {
      this(new BagOfPrimitives(), 10);__CLR4_4_1462462lck0y8ym.R.inc(5561);try{__CLR4_4_1462462lck0y8ym.R.inc(5560);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public ClassWithCustomTypeConverter(int value) {
      this(new BagOfPrimitives(value, value, false, ""), value);__CLR4_4_1462462lck0y8ym.R.inc(5563);try{__CLR4_4_1462462lck0y8ym.R.inc(5562);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public ClassWithCustomTypeConverter(BagOfPrimitives bag, int value) {try{__CLR4_4_1462462lck0y8ym.R.inc(5564);
      __CLR4_4_1462462lck0y8ym.R.inc(5565);this.bag = bag;
      __CLR4_4_1462462lck0y8ym.R.inc(5566);this.value = value;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public BagOfPrimitives getBag() {try{__CLR4_4_1462462lck0y8ym.R.inc(5567);
      __CLR4_4_1462462lck0y8ym.R.inc(5568);return bag;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5569);
      __CLR4_4_1462462lck0y8ym.R.inc(5570);return "{\"url\":\"" + bag.getExpectedJson() + "\",\"value\":" + value + "}";
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public int getValue() {try{__CLR4_4_1462462lck0y8ym.R.inc(5571);
      __CLR4_4_1462462lck0y8ym.R.inc(5572);return value;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ArrayOfObjects {
    private final BagOfPrimitives[] elements;
    public ArrayOfObjects() {try{__CLR4_4_1462462lck0y8ym.R.inc(5573);
      __CLR4_4_1462462lck0y8ym.R.inc(5574);elements = new BagOfPrimitives[3];
      __CLR4_4_1462462lck0y8ym.R.inc(5575);for (int i = 0; (((i < elements.length)&&(__CLR4_4_1462462lck0y8ym.R.iget(5576)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5577)==0&false)); ++i) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5578);elements[i] = new BagOfPrimitives(i, i+2, false, "i"+i);
      }
    }}finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5579);
      __CLR4_4_1462462lck0y8ym.R.inc(5580);StringBuilder sb = new StringBuilder("{\"elements\":[");
      __CLR4_4_1462462lck0y8ym.R.inc(5581);boolean first = true;
      __CLR4_4_1462462lck0y8ym.R.inc(5582);for (BagOfPrimitives element : elements) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5583);if ((((first)&&(__CLR4_4_1462462lck0y8ym.R.iget(5584)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5585)==0&false))) {{
          __CLR4_4_1462462lck0y8ym.R.inc(5586);first = false;
        } }else {{
          __CLR4_4_1462462lck0y8ym.R.inc(5587);sb.append(",");
        }
        }__CLR4_4_1462462lck0y8ym.R.inc(5588);sb.append(element.getExpectedJson());
      }
      }__CLR4_4_1462462lck0y8ym.R.inc(5589);sb.append("]}");
      __CLR4_4_1462462lck0y8ym.R.inc(5590);return sb.toString();
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassOverridingEquals {
    public ClassOverridingEquals ref;

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5591);
      __CLR4_4_1462462lck0y8ym.R.inc(5592);if ((((ref == null)&&(__CLR4_4_1462462lck0y8ym.R.iget(5593)!=0|true))||(__CLR4_4_1462462lck0y8ym.R.iget(5594)==0&false))) {{
        __CLR4_4_1462462lck0y8ym.R.inc(5595);return "{}";
      }
      }__CLR4_4_1462462lck0y8ym.R.inc(5596);return "{\"ref\":" + ref.getExpectedJson() + "}";
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    @Override
    public boolean equals(Object obj) {try{__CLR4_4_1462462lck0y8ym.R.inc(5597);
      __CLR4_4_1462462lck0y8ym.R.inc(5598);return true;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_1462462lck0y8ym.R.inc(5599);
      __CLR4_4_1462462lck0y8ym.R.inc(5600);return 1;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithArray {
    public final Object[] array;
    public ClassWithArray() {try{__CLR4_4_1462462lck0y8ym.R.inc(5601);
      __CLR4_4_1462462lck0y8ym.R.inc(5602);array = null;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public ClassWithArray(Object[] array) {try{__CLR4_4_1462462lck0y8ym.R.inc(5603);
      __CLR4_4_1462462lck0y8ym.R.inc(5604);this.array = array;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithObjects {
    public final BagOfPrimitives bag;
    public ClassWithObjects() {
      this(new BagOfPrimitives());__CLR4_4_1462462lck0y8ym.R.inc(5606);try{__CLR4_4_1462462lck0y8ym.R.inc(5605);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    public ClassWithObjects(BagOfPrimitives bag) {try{__CLR4_4_1462462lck0y8ym.R.inc(5607);
      __CLR4_4_1462462lck0y8ym.R.inc(5608);this.bag = bag;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }

  public static class ClassWithSerializedNameFields {
    @SerializedName("fooBar") public final int f;
    @SerializedName("Another Foo") public final int g;

    public ClassWithSerializedNameFields() {
      this(1, 4);__CLR4_4_1462462lck0y8ym.R.inc(5610);try{__CLR4_4_1462462lck0y8ym.R.inc(5609);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    public ClassWithSerializedNameFields(int f, int g) {try{__CLR4_4_1462462lck0y8ym.R.inc(5611);
      __CLR4_4_1462462lck0y8ym.R.inc(5612);this.f = f;
      __CLR4_4_1462462lck0y8ym.R.inc(5613);this.g = g;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}

    public String getExpectedJson() {try{__CLR4_4_1462462lck0y8ym.R.inc(5614);
      __CLR4_4_1462462lck0y8ym.R.inc(5615);return '{' + "\"fooBar\":" + f + ",\"Another Foo\":" + g + '}';
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
  }
  
  public static class CrazyLongTypeAdapter
      implements JsonSerializer<Long>, JsonDeserializer<Long> {
    public static final long DIFFERENCE = 5L;
    public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context) {try{__CLR4_4_1462462lck0y8ym.R.inc(5616);
      __CLR4_4_1462462lck0y8ym.R.inc(5617);return new JsonPrimitive(src + DIFFERENCE);
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
    
    public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {try{__CLR4_4_1462462lck0y8ym.R.inc(5618);
      __CLR4_4_1462462lck0y8ym.R.inc(5619);return json.getAsLong() - DIFFERENCE;
    }finally{__CLR4_4_1462462lck0y8ym.R.flushNeeded();}}
}
}