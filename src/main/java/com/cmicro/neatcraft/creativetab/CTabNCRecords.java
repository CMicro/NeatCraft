package com.cmicro.neatcraft.creativetab;

import com.cmicro.neatcraft.init.ModRecords;
import com.cmicro.neatcraft.resources.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTabNCRecords
{
    public static final CreativeTabs NC_REC_TAB = new CreativeTabs(References.MOD_ID + "Records") {
        @Override
        public Item getTabIconItem() {
            return ModRecords.recordJGumptionKML;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Neat Craft : Records";
        }
    };
}
