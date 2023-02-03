/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.convert;

import org.joda.time.JodaTimePermission;

/**
 * ConverterManager controls the date and time converters.
 * <p>
 * This class enables additional conversion classes to be added via
 * {@link #addInstantConverter(InstantConverter)}, which may replace an
 * existing converter. Similar methods exist for duration, time period and
 * interval converters.
 * <p>
 * This class is threadsafe, so adding/removing converters can be done at any
 * time. Updating the set of convertors is relatively expensive, and so should
 * not be performed often.
 * <p>
 * The default instant converters are:
 * <ul>
 * <li>ReadableInstant
 * <li>String
 * <li>Calendar
 * <li>Date (includes sql package subclasses)
 * <li>Long (milliseconds)
 * <li>null (now)
 * </ul>
 * 
 * The default partial converters are:
 * <ul>
 * <li>ReadablePartial
 * <li>ReadableInstant
 * <li>String
 * <li>Calendar
 * <li>Date (includes sql package subclasses)
 * <li>Long (milliseconds)
 * <li>null (now)
 * </ul>
 * 
 * The default duration converters are:
 * <ul>
 * <li>ReadableDuration
 * <li>ReadableInterval
 * <li>String
 * <li>Long (milliseconds)
 * <li>null (zero ms)
 * </ul>
 *
 * The default time period converters are:
 * <ul>
 * <li>ReadablePeriod
 * <li>ReadableInterval
 * <li>String
 * <li>null (zero)
 * </ul>
 * 
 * The default interval converters are:
 * <ul>
 * <li>ReadableInterval
 * <li>String
 * <li>null (zero-length from now to now)
 * </ul>
 *
 * @author Stephen Colebourne
 * @author Brian S O'Neill
 * @since 1.0
 */
public final class ConverterManager {public static class __CLR4_4_19js9jslc8azt31{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u006d\u0061\u0073\u0074\u0065\u0072\u0073\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1672271027956L,8589935092L,12591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Singleton instance, lazily loaded to avoid class loading.
     */
    private static ConverterManager INSTANCE;

    public static ConverterManager getInstance() {try{__CLR4_4_19js9jslc8azt31.R.inc(12376);
        __CLR4_4_19js9jslc8azt31.R.inc(12377);if ((((INSTANCE == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12378)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12379)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12380);INSTANCE = new ConverterManager();
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12381);return INSTANCE;
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    private ConverterSet iInstantConverters;
    private ConverterSet iPartialConverters;
    private ConverterSet iDurationConverters;
    private ConverterSet iPeriodConverters;
    private ConverterSet iIntervalConverters;
    
    /**
     * Restricted constructor.
     */
    protected ConverterManager() {
        super();__CLR4_4_19js9jslc8azt31.R.inc(12383);try{__CLR4_4_19js9jslc8azt31.R.inc(12382);

        __CLR4_4_19js9jslc8azt31.R.inc(12384);iInstantConverters = new ConverterSet(new Converter[] {
            ReadableInstantConverter.INSTANCE,
            StringConverter.INSTANCE,
            CalendarConverter.INSTANCE,
            DateConverter.INSTANCE,
            LongConverter.INSTANCE,
            NullConverter.INSTANCE,
        });

        __CLR4_4_19js9jslc8azt31.R.inc(12385);iPartialConverters = new ConverterSet(new Converter[] {
            ReadablePartialConverter.INSTANCE,
            ReadableInstantConverter.INSTANCE,
            StringConverter.INSTANCE,
            CalendarConverter.INSTANCE,
            DateConverter.INSTANCE,
            LongConverter.INSTANCE,
            NullConverter.INSTANCE,
        });

        __CLR4_4_19js9jslc8azt31.R.inc(12386);iDurationConverters = new ConverterSet(new Converter[] {
            ReadableDurationConverter.INSTANCE,
            ReadableIntervalConverter.INSTANCE,
            StringConverter.INSTANCE,
            LongConverter.INSTANCE,
            NullConverter.INSTANCE,
        });

        __CLR4_4_19js9jslc8azt31.R.inc(12387);iPeriodConverters = new ConverterSet(new Converter[] {
            ReadableDurationConverter.INSTANCE,
            ReadablePeriodConverter.INSTANCE,
            ReadableIntervalConverter.INSTANCE,
            StringConverter.INSTANCE,
            NullConverter.INSTANCE,
        });

        __CLR4_4_19js9jslc8azt31.R.inc(12388);iIntervalConverters = new ConverterSet(new Converter[] {
            ReadableIntervalConverter.INSTANCE,
            StringConverter.INSTANCE,
            NullConverter.INSTANCE,
        });
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the best converter for the object specified.
     * 
     * @param object  the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException if multiple converters match the type
     * equally well
     */
    public InstantConverter getInstantConverter(Object object) {try{__CLR4_4_19js9jslc8azt31.R.inc(12389);
        __CLR4_4_19js9jslc8azt31.R.inc(12390);InstantConverter converter =
            (InstantConverter)iInstantConverters.select((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12391)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12392)==0&false))? null : object.getClass());
        __CLR4_4_19js9jslc8azt31.R.inc(12393);if ((((converter != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12394)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12395)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12396);return converter;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12397);throw new IllegalArgumentException("No instant converter found for type: " +
            ((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12398)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12399)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Gets a copy of the set of converters.
     * 
     * @return the converters, a copy of the real data, never null
     */
    public InstantConverter[] getInstantConverters() {try{__CLR4_4_19js9jslc8azt31.R.inc(12400);
        __CLR4_4_19js9jslc8azt31.R.inc(12401);ConverterSet set = iInstantConverters;
        __CLR4_4_19js9jslc8azt31.R.inc(12402);InstantConverter[] converters = new InstantConverter[set.size()];
        __CLR4_4_19js9jslc8azt31.R.inc(12403);set.copyInto(converters);
        __CLR4_4_19js9jslc8azt31.R.inc(12404);return converters;
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevent. The best
     * converter is selected by examining the object hierarchy.
     * 
     * @param converter  the converter to add, null ignored
     * @return replaced converter, or null
     */
    public InstantConverter addInstantConverter(InstantConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12405);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12406);checkAlterInstantConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12407);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12408)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12409)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12410);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12411);InstantConverter[] removed = new InstantConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12412);iInstantConverters = iInstantConverters.add(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12413);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     * 
     * @param converter  the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public InstantConverter removeInstantConverter(InstantConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12414);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12415);checkAlterInstantConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12416);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12417)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12418)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12419);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12420);InstantConverter[] removed = new InstantConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12421);iInstantConverters = iInstantConverters.remove(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12422);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Checks whether the user has permission 'ConverterManager.alterInstantConverters'.
     * 
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterInstantConverters() throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12423);
        __CLR4_4_19js9jslc8azt31.R.inc(12424);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19js9jslc8azt31.R.inc(12425);if ((((sm != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12426)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12427)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12428);sm.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }}finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the best converter for the object specified.
     * 
     * @param object  the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException if multiple converters match the type
     * equally well
     */
    public PartialConverter getPartialConverter(Object object) {try{__CLR4_4_19js9jslc8azt31.R.inc(12429);
        __CLR4_4_19js9jslc8azt31.R.inc(12430);PartialConverter converter =
            (PartialConverter)iPartialConverters.select((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12431)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12432)==0&false))? null : object.getClass());
        __CLR4_4_19js9jslc8azt31.R.inc(12433);if ((((converter != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12434)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12435)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12436);return converter;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12437);throw new IllegalArgumentException("No partial converter found for type: " +
            ((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12438)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12439)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Gets a copy of the set of converters.
     * 
     * @return the converters, a copy of the real data, never null
     */
    public PartialConverter[] getPartialConverters() {try{__CLR4_4_19js9jslc8azt31.R.inc(12440);
        __CLR4_4_19js9jslc8azt31.R.inc(12441);ConverterSet set = iPartialConverters;
        __CLR4_4_19js9jslc8azt31.R.inc(12442);PartialConverter[] converters = new PartialConverter[set.size()];
        __CLR4_4_19js9jslc8azt31.R.inc(12443);set.copyInto(converters);
        __CLR4_4_19js9jslc8azt31.R.inc(12444);return converters;
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevent. The best
     * converter is selected by examining the object hierarchy.
     * 
     * @param converter  the converter to add, null ignored
     * @return replaced converter, or null
     */
    public PartialConverter addPartialConverter(PartialConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12445);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12446);checkAlterPartialConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12447);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12448)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12449)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12450);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12451);PartialConverter[] removed = new PartialConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12452);iPartialConverters = iPartialConverters.add(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12453);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     * 
     * @param converter  the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public PartialConverter removePartialConverter(PartialConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12454);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12455);checkAlterPartialConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12456);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12457)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12458)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12459);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12460);PartialConverter[] removed = new PartialConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12461);iPartialConverters = iPartialConverters.remove(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12462);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Checks whether the user has permission 'ConverterManager.alterPartialConverters'.
     * 
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterPartialConverters() throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12463);
        __CLR4_4_19js9jslc8azt31.R.inc(12464);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19js9jslc8azt31.R.inc(12465);if ((((sm != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12466)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12467)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12468);sm.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }}finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the best converter for the object specified.
     * 
     * @param object  the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException if multiple converters match the type
     * equally well
     */
    public DurationConverter getDurationConverter(Object object) {try{__CLR4_4_19js9jslc8azt31.R.inc(12469);
        __CLR4_4_19js9jslc8azt31.R.inc(12470);DurationConverter converter =
            (DurationConverter)iDurationConverters.select((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12471)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12472)==0&false))? null : object.getClass());
        __CLR4_4_19js9jslc8azt31.R.inc(12473);if ((((converter != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12474)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12475)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12476);return converter;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12477);throw new IllegalArgumentException("No duration converter found for type: " +
            ((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12478)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12479)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Gets a copy of the list of converters.
     * 
     * @return the converters, a copy of the real data, never null
     */
    public DurationConverter[] getDurationConverters() {try{__CLR4_4_19js9jslc8azt31.R.inc(12480);
        __CLR4_4_19js9jslc8azt31.R.inc(12481);ConverterSet set = iDurationConverters;
        __CLR4_4_19js9jslc8azt31.R.inc(12482);DurationConverter[] converters = new DurationConverter[set.size()];
        __CLR4_4_19js9jslc8azt31.R.inc(12483);set.copyInto(converters);
        __CLR4_4_19js9jslc8azt31.R.inc(12484);return converters;
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevent. The best
     * converter is selected by examining the object hierarchy.
     * 
     * @param converter  the converter to add, null ignored
     * @return replaced converter, or null
     */
    public DurationConverter addDurationConverter(DurationConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12485);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12486);checkAlterDurationConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12487);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12488)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12489)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12490);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12491);DurationConverter[] removed = new DurationConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12492);iDurationConverters = iDurationConverters.add(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12493);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     * 
     * @param converter  the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public DurationConverter removeDurationConverter(DurationConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12494);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12495);checkAlterDurationConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12496);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12497)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12498)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12499);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12500);DurationConverter[] removed = new DurationConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12501);iDurationConverters = iDurationConverters.remove(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12502);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Checks whether the user has permission 'ConverterManager.alterDurationConverters'.
     * 
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterDurationConverters() throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12503);
        __CLR4_4_19js9jslc8azt31.R.inc(12504);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19js9jslc8azt31.R.inc(12505);if ((((sm != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12506)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12507)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12508);sm.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }}finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the best converter for the object specified.
     * 
     * @param object  the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException if multiple converters match the type
     * equally well
     */
    public PeriodConverter getPeriodConverter(Object object) {try{__CLR4_4_19js9jslc8azt31.R.inc(12509);
        __CLR4_4_19js9jslc8azt31.R.inc(12510);PeriodConverter converter =
            (PeriodConverter)iPeriodConverters.select((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12511)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12512)==0&false))? null : object.getClass());
        __CLR4_4_19js9jslc8azt31.R.inc(12513);if ((((converter != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12514)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12515)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12516);return converter;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12517);throw new IllegalArgumentException("No period converter found for type: " +
            ((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12518)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12519)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Gets a copy of the list of converters.
     * 
     * @return the converters, a copy of the real data, never null
     */
    public PeriodConverter[] getPeriodConverters() {try{__CLR4_4_19js9jslc8azt31.R.inc(12520);
        __CLR4_4_19js9jslc8azt31.R.inc(12521);ConverterSet set = iPeriodConverters;
        __CLR4_4_19js9jslc8azt31.R.inc(12522);PeriodConverter[] converters = new PeriodConverter[set.size()];
        __CLR4_4_19js9jslc8azt31.R.inc(12523);set.copyInto(converters);
        __CLR4_4_19js9jslc8azt31.R.inc(12524);return converters;
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevent. The best
     * converter is selected by examining the object hierarchy.
     * 
     * @param converter  the converter to add, null ignored
     * @return replaced converter, or null
     */
    public PeriodConverter addPeriodConverter(PeriodConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12525);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12526);checkAlterPeriodConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12527);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12528)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12529)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12530);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12531);PeriodConverter[] removed = new PeriodConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12532);iPeriodConverters = iPeriodConverters.add(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12533);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     * 
     * @param converter  the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public PeriodConverter removePeriodConverter(PeriodConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12534);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12535);checkAlterPeriodConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12536);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12537)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12538)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12539);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12540);PeriodConverter[] removed = new PeriodConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12541);iPeriodConverters = iPeriodConverters.remove(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12542);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Checks whether the user has permission 'ConverterManager.alterPeriodConverters'.
     * 
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterPeriodConverters() throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12543);
        __CLR4_4_19js9jslc8azt31.R.inc(12544);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19js9jslc8azt31.R.inc(12545);if ((((sm != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12546)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12547)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12548);sm.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }}finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the best converter for the object specified.
     * 
     * @param object  the object to convert
     * @return the converter to use
     * @throws IllegalArgumentException if no suitable converter
     * @throws IllegalStateException if multiple converters match the type
     * equally well
     */
    public IntervalConverter getIntervalConverter(Object object) {try{__CLR4_4_19js9jslc8azt31.R.inc(12549);
        __CLR4_4_19js9jslc8azt31.R.inc(12550);IntervalConverter converter =
            (IntervalConverter)iIntervalConverters.select((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12551)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12552)==0&false))? null : object.getClass());
        __CLR4_4_19js9jslc8azt31.R.inc(12553);if ((((converter != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12554)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12555)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12556);return converter;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12557);throw new IllegalArgumentException("No interval converter found for type: " +
            ((((object == null )&&(__CLR4_4_19js9jslc8azt31.R.iget(12558)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12559)==0&false))? "null" : object.getClass().getName()));
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Gets a copy of the list of converters.
     * 
     * @return the converters, a copy of the real data, never null
     */
    public IntervalConverter[] getIntervalConverters() {try{__CLR4_4_19js9jslc8azt31.R.inc(12560);
        __CLR4_4_19js9jslc8azt31.R.inc(12561);ConverterSet set = iIntervalConverters;
        __CLR4_4_19js9jslc8azt31.R.inc(12562);IntervalConverter[] converters = new IntervalConverter[set.size()];
        __CLR4_4_19js9jslc8azt31.R.inc(12563);set.copyInto(converters);
        __CLR4_4_19js9jslc8azt31.R.inc(12564);return converters;
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Adds a converter to the set of converters. If a matching converter is
     * already in the set, the given converter replaces it. If the converter is
     * exactly the same as one already in the set, no changes are made.
     * <p>
     * The order in which converters are added is not relevent. The best
     * converter is selected by examining the object hierarchy.
     * 
     * @param converter  the converter to add, null ignored
     * @return replaced converter, or null
     */
    public IntervalConverter addIntervalConverter(IntervalConverter converter) 
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12565);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12566);checkAlterIntervalConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12567);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12568)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12569)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12570);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12571);IntervalConverter[] removed = new IntervalConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12572);iIntervalConverters = iIntervalConverters.add(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12573);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Removes a converter from the set of converters. If the converter was
     * not in the set, no changes are made.
     * 
     * @param converter  the converter to remove, null ignored
     * @return replaced converter, or null
     */
    public IntervalConverter removeIntervalConverter(IntervalConverter converter)
            throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12574);
        
        __CLR4_4_19js9jslc8azt31.R.inc(12575);checkAlterIntervalConverters();
        __CLR4_4_19js9jslc8azt31.R.inc(12576);if ((((converter == null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12577)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12578)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12579);return null;
        }
        }__CLR4_4_19js9jslc8azt31.R.inc(12580);IntervalConverter[] removed = new IntervalConverter[1];
        __CLR4_4_19js9jslc8azt31.R.inc(12581);iIntervalConverters = iIntervalConverters.remove(converter, removed);
        __CLR4_4_19js9jslc8azt31.R.inc(12582);return removed[0];
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}
    
    /**
     * Checks whether the user has permission 'ConverterManager.alterIntervalConverters'.
     * 
     * @throws SecurityException if the user does not have the permission
     */
    private void checkAlterIntervalConverters() throws SecurityException {try{__CLR4_4_19js9jslc8azt31.R.inc(12583);
        __CLR4_4_19js9jslc8azt31.R.inc(12584);SecurityManager sm = System.getSecurityManager();
        __CLR4_4_19js9jslc8azt31.R.inc(12585);if ((((sm != null)&&(__CLR4_4_19js9jslc8azt31.R.iget(12586)!=0|true))||(__CLR4_4_19js9jslc8azt31.R.iget(12587)==0&false))) {{
            __CLR4_4_19js9jslc8azt31.R.inc(12588);sm.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }}finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets a debug representation of the object.
     */
    public String toString() {try{__CLR4_4_19js9jslc8azt31.R.inc(12589);
        __CLR4_4_19js9jslc8azt31.R.inc(12590);return "ConverterManager[" +
            iInstantConverters.size() + " instant," +
            iPartialConverters.size() + " partial," +
            iDurationConverters.size() + " duration," +
            iPeriodConverters.size() + " period," +
            iIntervalConverters.size() + " interval]";
    }finally{__CLR4_4_19js9jslc8azt31.R.flushNeeded();}}

}
