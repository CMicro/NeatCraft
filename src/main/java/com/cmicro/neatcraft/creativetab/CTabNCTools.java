package com.cmicro.neatcraft.creativetab;

import com.cmicro.neatcraft.init.ModItems;
import com.cmicro.neatcraft.resources.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTabNCTools
{
    public static final CreativeTabs NC_TOOL_TAB = new CreativeTabs(References.MOD_ID + "Tools") {
        @Override
        public Item getTabIconItem() {
            return ModItems.eSteelSword;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Neat Craft : Tools";
        }
    };
}
