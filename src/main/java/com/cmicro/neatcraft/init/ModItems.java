package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.items.ItemEnderSteel;
import com.cmicro.neatcraft.items.ItemHardenedSteel;
import com.cmicro.neatcraft.items.ItemNC;
import com.cmicro.neatcraft.items.ItemSteel;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems
{
    public static final ItemNC itemSteel = new ItemSteel();
    public static final ItemNC itemEnderSteel = new ItemEnderSteel();
    public static final ItemNC itemHardenedSteel = new ItemHardenedSteel();

    public static void init()
    {
        GameRegistry.registerItem(itemSteel, "ingotSteel");
        GameRegistry.registerItem(itemEnderSteel, "ingotEnderSteel");
        GameRegistry.registerItem(itemHardenedSteel, "ingotHardenedSteel");
    }
}
