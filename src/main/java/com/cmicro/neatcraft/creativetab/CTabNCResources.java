package com.cmicro.neatcraft.creativetab;

import com.cmicro.neatcraft.init.ModItems;
import com.cmicro.neatcraft.resources.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTabNCResources
{
    public static final CreativeTabs NC_RES_TAB = new CreativeTabs(References.MOD_ID + "Resources") {
        @Override
        public Item getTabIconItem() {
            return ModItems.itemSteel;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Neat Craft : Resources";
        }
    };
}
