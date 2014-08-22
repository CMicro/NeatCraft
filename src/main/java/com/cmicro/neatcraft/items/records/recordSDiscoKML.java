package com.cmicro.neatcraft.items.records;

import java.util.HashMap;
import java.util.Map;

public class recordSDiscoKML extends ItemRecordNC
{
    private static final Map records = new HashMap();

    public final String recordName;

    public recordSDiscoKML(String recordName)
    {
        super(recordName);

        this.recordName = recordName;
        setUnlocalizedName("sDiscoKML");
    }
}
