package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.items.records.ItemRecordNC;

import com.cmicro.neatcraft.items.records.recordJGumptionKML;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModRecords
{
    public static final ItemRecordNC recordJGumptionKML = new recordJGumptionKML("jGumptionKML");

    public static void init()
    {
        GameRegistry.registerItem(recordJGumptionKML, "recordJGumptionKML");
    }
}
