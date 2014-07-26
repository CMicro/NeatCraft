package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.items.*;
import com.cmicro.neatcraft.items.pickaxes.ItemPickaxeNC;
import com.cmicro.neatcraft.items.pickaxes.steelPickaxe;
import com.cmicro.neatcraft.items.swords.ItemSwordNC;
import com.cmicro.neatcraft.items.swords.steelSword;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems
{
    public static Item.ToolMaterial HSTEEL = EnumHelper.addToolMaterial("HSTEEL", 7, 2560, 20.0F, 10.0F, 30);

    public static final ItemNC itemSteel = new ItemSteel();
    public static final ItemNC itemEnderSteel = new ItemEnderSteel();
    public static final ItemNC itemHardenedSteel = new ItemHardenedSteel();
    public static final ItemNC rodSteel = new rodSteel();
    public static final ItemSwordNC steelSword = new steelSword(HSTEEL);
    public static final ItemPickaxeNC steelPickaxe = new steelPickaxe(HSTEEL);

    public static void init()
    {
        GameRegistry.registerItem(itemSteel, "ingotSteel");
        GameRegistry.registerItem(itemEnderSteel, "ingotEnderSteel");
        GameRegistry.registerItem(itemHardenedSteel, "ingotHardenedSteel");
        GameRegistry.registerItem(rodSteel, "rodSteel");
        GameRegistry.registerItem(steelSword, "steelSword");
        GameRegistry.registerItem(steelPickaxe, "steelPickaxe");
    }
}
