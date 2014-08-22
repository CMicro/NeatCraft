package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.items.records.ItemRecordNC;

import com.cmicro.neatcraft.items.records.*;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModRecords
{
    public static final ItemRecordNC recordJGumptionKML = new recordJGumptionKML("jGumptionKML");
    public static final ItemRecordNC recordOvercastKML = new recordOvercastKML("overcastKML");
    public static final ItemRecordNC recordPamgaeaKML = new recordPamgaeaKML("pamgaeaKML");
    public static final ItemRecordNC recordSDiscoKML = new recordSDiscoKML("sDiscoKML");

    public static void init()
    {
        GameRegistry.registerItem(recordJGumptionKML, "recordJGumptionKML");
        GameRegistry.registerItem(recordOvercastKML, "recordOvercastKML");
        GameRegistry.registerItem(recordPamgaeaKML, "recordPamgaeaKML");
        GameRegistry.registerItem(recordSDiscoKML, "recordSDiscoKML");
    }
}
