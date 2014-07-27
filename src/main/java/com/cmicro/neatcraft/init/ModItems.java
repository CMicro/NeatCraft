package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.items.*;
import com.cmicro.neatcraft.items.axes.ItemAxeNC;
import com.cmicro.neatcraft.items.axes.steelAxe;
import com.cmicro.neatcraft.items.hoes.ItemHoeNC;
import com.cmicro.neatcraft.items.hoes.steelHoe;
import com.cmicro.neatcraft.items.pickaxes.ItemPickaxeNC;
import com.cmicro.neatcraft.items.pickaxes.steelPickaxe;
import com.cmicro.neatcraft.items.shovels.ItemShovelNC;
import com.cmicro.neatcraft.items.shovels.steelShovel;
import com.cmicro.neatcraft.items.swords.ItemSwordNC;
import com.cmicro.neatcraft.items.swords.steelSword;
import com.cmicro.neatcraft.items.swords.*;
import com.cmicro.neatcraft.items.pickaxes.*;
import com.cmicro.neatcraft.items.axes.*;
import com.cmicro.neatcraft.items.shovels.*;
import com.cmicro.neatcraft.items.hoes.*;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems
{
    public static Item.ToolMaterial HSTEEL = EnumHelper.addToolMaterial("HSTEEL", 7, 2560, 20.0F, 10.0F, 30);
    public static Item.ToolMaterial ESTEEL = EnumHelper.addToolMaterial("ESTEEL", 10, 80000, 30.0F, 20.0F, 40);

    public static final ItemNC itemSteel = new ItemSteel();
    public static final ItemNC itemEnderSteel = new ItemEnderSteel();
    public static final ItemNC itemHardenedSteel = new ItemHardenedSteel();
    public static final ItemNC rodSteel = new rodSteel();
    public static final ItemNC gemLonsdaleite = new gemLonsdaleite();
    public static final ItemSwordNC steelSword = new steelSword(HSTEEL);
    public static final ItemPickaxeNC steelPickaxe = new steelPickaxe(HSTEEL);
    public static final ItemAxeNC steelAxe = new steelAxe(HSTEEL);
    public static final ItemShovelNC steelShovel = new steelShovel(HSTEEL);
    public static final ItemHoeNC steelHoe = new steelHoe(HSTEEL);
    public static final ItemSwordNC eSteelSword = new eSteelSword(ESTEEL);
    public static final ItemPickaxeNC eSteelPickaxe = new eSteelPickaxe(ESTEEL);
    public static final ItemAxeNC eSteelAxe = new eSteelAxe(ESTEEL);
    public static final ItemShovelNC eSteelShovel = new eSteelShovel(ESTEEL);
    public static final ItemHoeNC eSteelHoe = new eSteelHoe(ESTEEL);

    public static void init()
    {
        GameRegistry.registerItem(itemSteel, "ingotSteel");
        GameRegistry.registerItem(itemEnderSteel, "ingotEnderSteel");
        GameRegistry.registerItem(itemHardenedSteel, "ingotHardenedSteel");
        GameRegistry.registerItem(rodSteel, "rodSteel");
        GameRegistry.registerItem(gemLonsdaleite, "gemLonsdaleite");
        GameRegistry.registerItem(steelSword, "steelSword");
        GameRegistry.registerItem(steelPickaxe, "steelPickaxe");
        GameRegistry.registerItem(steelAxe, "steelAxe");
        GameRegistry.registerItem(steelShovel, "steelShovel");
        GameRegistry.registerItem(steelHoe, "steelHoe");
        GameRegistry.registerItem(eSteelSword, "eSteelSword");
        GameRegistry.registerItem(eSteelPickaxe, "eSteelPickaxe");
        GameRegistry.registerItem(eSteelAxe, "eSteelAxe");
        GameRegistry.registerItem(eSteelShovel, "eSteelShovel");
        GameRegistry.registerItem(eSteelHoe, "eSteelHoe");
    }
}
