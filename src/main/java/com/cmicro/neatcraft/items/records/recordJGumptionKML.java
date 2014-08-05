package com.cmicro.neatcraft.items.records;

import java.util.HashMap;
import java.util.Map;

public class recordJGumptionKML extends ItemRecordNC
{
    private static final Map records = new HashMap();

    public final String recordName;

    public recordJGumptionKML(String recordName)
    {
        super(recordName);

        this.recordName = recordName;
        setUnlocalizedName("jGumptionKML");
    }
}
