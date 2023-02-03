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

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.text.MessageFormat;
import java.util.Locale;

/**
 * Class that contains the actual implementation of the functionality mandated
 * by the {@link ExceptionContext} interface.
 * All Commons Math exceptions delegate the interface's methods to this class.
 *
 * @since 3.0
 * @version $Id$
 */
public class ExceptionContext implements Serializable {public static class __CLR4_4_19r49r4lb90p7ou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u004d\u0061\u0074\u0068\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1670137421344L,8589935092L,12745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Serializable version Id. */
    private static final long serialVersionUID = -6024911025449780478L;
    /**
     * The throwable to which this context refers to.
     */
    private Throwable throwable;
    /**
     * Various informations that enrich the informative message.
     */
    private List<Localizable> msgPatterns;
    /**
     * Various informations that enrich the informative message.
     * The arguments will replace the corresponding place-holders in
     * {@link #msgPatterns}.
     */
    private List<Object[]> msgArguments;
    /**
     * Arbitrary context information.
     */
    private Map<String, Object> context;

    /** Simple constructor.
     * @param throwable the exception this context refers too
     */
    public ExceptionContext(final Throwable throwable) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12640);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12641);this.throwable = throwable;
        __CLR4_4_19r49r4lb90p7ou.R.inc(12642);msgPatterns    = new ArrayList<Localizable>();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12643);msgArguments   = new ArrayList<Object[]>();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12644);context        = new HashMap<String, Object>();
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /** Get a reference to the exception to which the context relates.
     * @return a reference to the exception to which the context relates
     */
    public Throwable getThrowable() {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12645);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12646);return throwable;
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Adds a message.
     *
     * @param pattern Message pattern.
     * @param arguments Values for replacing the placeholders in the message
     * pattern.
     */
    public void addMessage(Localizable pattern,
                           Object ... arguments) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12647);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12648);msgPatterns.add(pattern);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12649);msgArguments.add(ArgUtils.flatten(arguments));
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Sets the context (key, value) pair.
     * Keys are assumed to be unique within an instance. If the same key is
     * assigned a new value, the previous one will be lost.
     *
     * @param key Context key (not null).
     * @param value Context value.
     */
    public void setValue(String key, Object value) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12650);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12651);context.put(key, value);
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Gets the value associated to the given context key.
     *
     * @param key Context key.
     * @return the context value or {@code null} if the key does not exist.
     */
    public Object getValue(String key) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12652);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12653);return context.get(key);
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Gets all the keys stored in the exception
     *
     * @return the set of keys.
     */
    public Set<String> getKeys() {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12654);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12655);return context.keySet();
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Gets the default message.
     *
     * @return the message.
     */
    public String getMessage() {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12656);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12657);return getMessage(Locale.US);
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Gets the message in the default locale.
     *
     * @return the localized message.
     */
    public String getLocalizedMessage() {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12658);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12659);return getMessage(Locale.getDefault());
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Gets the message in a specified locale.
     *
     * @param locale Locale in which the message should be translated.
     * @return the localized message.
     */
    public String getMessage(final Locale locale) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12660);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12661);return buildMessage(locale, ": ");
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Gets the message in a specified locale.
     *
     * @param locale Locale in which the message should be translated.
     * @param separator Separator inserted between the message parts.
     * @return the localized message.
     */
    public String getMessage(final Locale locale,
                             final String separator) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12662);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12663);return buildMessage(locale, separator);
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Builds a message string.
     *
     * @param locale Locale in which the message should be translated.
     * @param separator Message separator.
     * @return a localized message string.
     */
    private String buildMessage(Locale locale,
                                String separator) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12664);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12665);final StringBuilder sb = new StringBuilder();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12666);int count = 0;
        __CLR4_4_19r49r4lb90p7ou.R.inc(12667);final int len = msgPatterns.size();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12668);for (int i = 0; (((i < len)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12669)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12670)==0&false)); i++) {{
            __CLR4_4_19r49r4lb90p7ou.R.inc(12671);final Localizable pat = msgPatterns.get(i);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12672);final Object[] args = msgArguments.get(i);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12673);final MessageFormat fmt = new MessageFormat(pat.getLocalizedString(locale),
                                                        locale);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12674);sb.append(fmt.format(args));
            __CLR4_4_19r49r4lb90p7ou.R.inc(12675);if ((((++count < len)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12676)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12677)==0&false))) {{
                // Add a separator if there are other messages.
                __CLR4_4_19r49r4lb90p7ou.R.inc(12678);sb.append(separator);
            }
        }}

        }__CLR4_4_19r49r4lb90p7ou.R.inc(12679);return sb.toString();
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Serialize this object to the given stream.
     *
     * @param out Stream.
     * @throws IOException This should never happen.
     */
    private void writeObject(ObjectOutputStream out)
        throws IOException {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12680);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12681);out.writeObject(throwable);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12682);serializeMessages(out);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12683);serializeContext(out);
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}
    /**
     * Deserialize this object from the given stream.
     *
     * @param in Stream.
     * @throws IOException This should never happen.
     * @throws ClassNotFoundException This should never happen.
     */
    private void readObject(ObjectInputStream in)
        throws IOException,
               ClassNotFoundException {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12684);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12685);throwable = (Throwable) in.readObject();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12686);deSerializeMessages(in);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12687);deSerializeContext(in);
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Serialize  {@link #msgPatterns} and {@link #msgArguments}.
     *
     * @param out Stream.
     * @throws IOException This should never happen.
     */
    private void serializeMessages(ObjectOutputStream out)
        throws IOException {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12688);
        // Step 1.
        __CLR4_4_19r49r4lb90p7ou.R.inc(12689);final int len = msgPatterns.size();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12690);out.writeInt(len);
        // Step 2.
        __CLR4_4_19r49r4lb90p7ou.R.inc(12691);for (int i = 0; (((i < len)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12692)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12693)==0&false)); i++) {{
            __CLR4_4_19r49r4lb90p7ou.R.inc(12694);final Localizable pat = msgPatterns.get(i);
            // Step 3.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12695);out.writeObject(pat);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12696);final Object[] args = msgArguments.get(i);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12697);final int aLen = args.length;
            // Step 4.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12698);out.writeInt(aLen);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12699);for (int j = 0; (((j < aLen)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12700)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12701)==0&false)); j++) {{
                __CLR4_4_19r49r4lb90p7ou.R.inc(12702);if ((((args[j] instanceof Serializable)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12703)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12704)==0&false))) {{
                    // Step 5a.
                    __CLR4_4_19r49r4lb90p7ou.R.inc(12705);out.writeObject(args[j]);
                } }else {{
                    // Step 5b.
                    __CLR4_4_19r49r4lb90p7ou.R.inc(12706);out.writeObject(nonSerializableReplacement(args[j]));
                }
            }}
        }}
    }}finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Deserialize {@link #msgPatterns} and {@link #msgArguments}.
     *
     * @param in Stream.
     * @throws IOException This should never happen.
     * @throws ClassNotFoundException This should never happen.
     */
    private void deSerializeMessages(ObjectInputStream in)
        throws IOException,
               ClassNotFoundException {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12707);
        // Step 1.
        __CLR4_4_19r49r4lb90p7ou.R.inc(12708);final int len = in.readInt();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12709);msgPatterns = new ArrayList<Localizable>(len);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12710);msgArguments = new ArrayList<Object[]>(len);
        // Step 2.
        __CLR4_4_19r49r4lb90p7ou.R.inc(12711);for (int i = 0; (((i < len)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12712)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12713)==0&false)); i++) {{
            // Step 3.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12714);final Localizable pat = (Localizable) in.readObject();
            __CLR4_4_19r49r4lb90p7ou.R.inc(12715);msgPatterns.add(pat);
            // Step 4.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12716);final int aLen = in.readInt();
            __CLR4_4_19r49r4lb90p7ou.R.inc(12717);final Object[] args = new Object[aLen];
            __CLR4_4_19r49r4lb90p7ou.R.inc(12718);for (int j = 0; (((j < aLen)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12719)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12720)==0&false)); j++) {{
                // Step 5.
                __CLR4_4_19r49r4lb90p7ou.R.inc(12721);args[j] = in.readObject();
            }
            }__CLR4_4_19r49r4lb90p7ou.R.inc(12722);msgArguments.add(args);
        }
    }}finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Serialize {@link #context}.
     *
     * @param out Stream.
     * @throws IOException This should never happen.
     */
    private void serializeContext(ObjectOutputStream out)
        throws IOException {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12723);
        // Step 1.
        __CLR4_4_19r49r4lb90p7ou.R.inc(12724);final int len = context.keySet().size();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12725);out.writeInt(len);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12726);for (String key : context.keySet()) {{
            // Step 2.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12727);out.writeObject(key);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12728);final Object value = context.get(key);
            __CLR4_4_19r49r4lb90p7ou.R.inc(12729);if ((((value instanceof Serializable)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12730)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12731)==0&false))) {{
                // Step 3a.
                __CLR4_4_19r49r4lb90p7ou.R.inc(12732);out.writeObject(value);
            } }else {{
                // Step 3b.
                __CLR4_4_19r49r4lb90p7ou.R.inc(12733);out.writeObject(nonSerializableReplacement(value));
            }
        }}
    }}finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Deserialize {@link #context}.
     *
     * @param in Stream.
     * @throws IOException This should never happen.
     * @throws ClassNotFoundException This should never happen.
     */
    private void deSerializeContext(ObjectInputStream in)
        throws IOException,
               ClassNotFoundException {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12734);
        // Step 1.
        __CLR4_4_19r49r4lb90p7ou.R.inc(12735);final int len = in.readInt();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12736);context = new HashMap<String, Object>();
        __CLR4_4_19r49r4lb90p7ou.R.inc(12737);for (int i = 0; (((i < len)&&(__CLR4_4_19r49r4lb90p7ou.R.iget(12738)!=0|true))||(__CLR4_4_19r49r4lb90p7ou.R.iget(12739)==0&false)); i++) {{
            // Step 2.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12740);final String key = (String) in.readObject();
            // Step 3.
            __CLR4_4_19r49r4lb90p7ou.R.inc(12741);final Object value = in.readObject();
            __CLR4_4_19r49r4lb90p7ou.R.inc(12742);context.put(key, value);
        }
    }}finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}

    /**
     * Replaces a non-serializable object with an error message string.
     *
     * @param obj Object that does not implement the {@code Serializable}
     * interface.
     * @return a string that mentions which class could not be serialized.
     */
    private String nonSerializableReplacement(Object obj) {try{__CLR4_4_19r49r4lb90p7ou.R.inc(12743);
        __CLR4_4_19r49r4lb90p7ou.R.inc(12744);return "[Object could not be serialized: " + obj.getClass().getName() + "]";
    }finally{__CLR4_4_19r49r4lb90p7ou.R.flushNeeded();}}
}
