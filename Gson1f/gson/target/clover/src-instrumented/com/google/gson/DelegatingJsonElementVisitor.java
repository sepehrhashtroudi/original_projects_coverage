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

package com.google.gson;

import java.io.IOException;

/**
 * A simple implementation of the {@link JsonElementVisitor} that simply delegates the method
 * invocation onto a {@code delegate} instance of the {@link JsonElementVisitor}.  This object
 * can be used to build a chain of visitors such that each Visitor instance can perform some
 * operation on the {@link JsonElement} and then pass on the input to the delegate.  This kind
 * of pattern is sometimes referred as a "Chain of Responsibility".
 *
 * <p>The following is an example use case:
 *
 * <pre>
 * class JsonEscapingVisitor extends DelegatingJsonElementVisitor {
 *   public JsonEscapingVisitor(JsonElementVisitor) {
 *     super(visitor);
 *   }
 *
 *   public void visitPrimitive(JsonPrimitive primitive) {
 *     JsonPrimitive escapedPrimitive = escapePrimitiveObject(primitive);
 *     super.visitPrimitive(escapedPrimitive);
 *   }
 * }
 *
 * JsonElementVisitor visitor = new JsonEscapingVisitor(new FormattingVisitor());
 * </pre></p>
 *
 * @author Joel Leitch
 */
class DelegatingJsonElementVisitor implements JsonElementVisitor {public static class __CLR4_4_1czczlck0y815{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0047\u0073\u006f\u006e\u0031\u0066\u002f\u0067\u0073\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672979754068L,8589935092L,498,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  private final JsonElementVisitor delegate;

  protected DelegatingJsonElementVisitor(JsonElementVisitor delegate) {try{__CLR4_4_1czczlck0y815.R.inc(467);
    __CLR4_4_1czczlck0y815.R.inc(468);Preconditions.checkNotNull(delegate);
    __CLR4_4_1czczlck0y815.R.inc(469);this.delegate = delegate;
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void endArray(JsonArray array) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(470);
    __CLR4_4_1czczlck0y815.R.inc(471);delegate.endArray(array);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void endObject(JsonObject object) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(472);
    __CLR4_4_1czczlck0y815.R.inc(473);delegate.endObject(object);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void startArray(JsonArray array) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(474);
    __CLR4_4_1czczlck0y815.R.inc(475);delegate.startArray(array);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void startObject(JsonObject object) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(476);
    __CLR4_4_1czczlck0y815.R.inc(477);delegate.startObject(object);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitArrayMember(JsonArray parent, JsonPrimitive member, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(478);
    __CLR4_4_1czczlck0y815.R.inc(479);delegate.visitArrayMember(parent, member, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitArrayMember(JsonArray parent, JsonArray member, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(480);
    __CLR4_4_1czczlck0y815.R.inc(481);delegate.visitArrayMember(parent, member, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitArrayMember(JsonArray parent, JsonObject member, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(482);
    __CLR4_4_1czczlck0y815.R.inc(483);delegate.visitArrayMember(parent, member, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitObjectMember(JsonObject parent, String memberName, JsonPrimitive member, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(484);
    __CLR4_4_1czczlck0y815.R.inc(485);delegate.visitObjectMember(parent, memberName, member, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitObjectMember(JsonObject parent, String memberName, JsonArray member, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(486);
    __CLR4_4_1czczlck0y815.R.inc(487);delegate.visitObjectMember(parent, memberName, member, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitObjectMember(JsonObject parent, String memberName, JsonObject member, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(488);
    __CLR4_4_1czczlck0y815.R.inc(489);delegate.visitObjectMember(parent, memberName, member, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitNullObjectMember(JsonObject parent, String memberName, 
      boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(490);
    __CLR4_4_1czczlck0y815.R.inc(491);delegate.visitNullObjectMember(parent, memberName, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitPrimitive(JsonPrimitive primitive) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(492);
    __CLR4_4_1czczlck0y815.R.inc(493);delegate.visitPrimitive(primitive);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitNull() throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(494);
    __CLR4_4_1czczlck0y815.R.inc(495);delegate.visitNull();
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}

  public void visitNullArrayMember(JsonArray parent, boolean isFirst) throws IOException {try{__CLR4_4_1czczlck0y815.R.inc(496);
    __CLR4_4_1czczlck0y815.R.inc(497);delegate.visitNullArrayMember(parent, isFirst);
  }finally{__CLR4_4_1czczlck0y815.R.flushNeeded();}}
}
