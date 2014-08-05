package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.items.*;
import com.cmicro.neatcraft.items.axes.ItemAxeNC;
import com.cmicro.neatcraft.items.axes.steelAxe;
import com.cmicro.neatcraft.items.hoes.ItemHoeNC;
import com.cmicro.neatcraft.items.hoes.steelHoe;
import com.cmicro.neatcraft.items.pickaxes.ItemPickaxeNC;
import com.cmicro.neatcraft.items.pickaxes.steelPickaxe;
import com.cmicro.neatcraft.items.records.ItemRecordNC;
import com.cmicro.neatcraft.items.shovels.ItemShovelNC;
import com.cmicro.neatcraft.items.shovels.steelShovel;
import com.cmicro.neatcraft.items.swords.ItemSwordNC;
import com.cmicro.neatcraft.items.swords.steelSword;
import com.cmicro.neatcraft.items.swords.*;
import com.cmicro.neatcraft.items.pickaxes.*;
import com.cmicro.neatcraft.items.axes.*;
import com.cmicro.neatcraft.items.shovels.*;
import com.cmicro.neatcraft.items.hoes.*;
import com.cmicro.neatcraft.items.records.*;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModItems
{
    public static Item.ToolMaterial HSTEEL = EnumHelper.addToolMaterial("HSTEEL", 7, 2560, 20.0F, 10.0F, 30);
    public static Item.ToolMaterial ESTEEL = EnumHelper.addToolMaterial("ESTEEL", 10, 80000, 30.0F, 20.0F, 40);
    public static Item.ToolMaterial GEMLON = EnumHelper.addToolMaterial("GEMLON", 15, 160000, 40.0F, 30.0F, 60);
    public static Item.ToolMaterial GEMRUBY = EnumHelper.addToolMaterial("GEMRUBY", 12, 12000, 35.0F, 25.0F, 50);

    public static final ItemNC itemSteel = new ItemSteel();
    public static final ItemNC itemEnderSteel = new ItemEnderSteel();
    public static final ItemNC itemHardenedSteel = new ItemHardenedSteel();
    public static final ItemNC rodSteel = new rodSteel();
    public static final ItemNC gemLonsdaleite = new gemLonsdaleite();
    public static final ItemNC gemRuby = new gemRuby();
    public static final ItemNC itemHardenedLeather = new ItemHardenedLeather();
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
    public static final ItemSwordNC lonSword = new lonSword(GEMLON);
    public static final ItemPickaxeNC lonPickaxe = new lonPickaxe(GEMLON);
    public static final ItemAxeNC lonAxe = new lonAxe(GEMLON);
    public static final ItemShovelNC lonShovel = new lonShovel(GEMLON);
    public static final ItemHoeNC lonHoe = new lonHoe(GEMLON);
    public static final ItemSwordNC rubySword = new rubySword(GEMRUBY);
    public static final ItemPickaxeNC rubyPickaxe = new  rubyPickaxe(GEMRUBY);


    public static void init()
    {
        GameRegistry.registerItem(itemSteel, "ingotSteel");
        GameRegistry.registerItem(itemEnderSteel, "ingotEnderSteel");
        GameRegistry.registerItem(itemHardenedSteel, "ingotHardenedSteel");
        GameRegistry.registerItem(rodSteel, "rodSteel");
        GameRegistry.registerItem(gemLonsdaleite, "gemLonsdaleite");
        GameRegistry.registerItem(gemRuby, "gemRuby");
        GameRegistry.registerItem(itemHardenedLeather, "itemHardenedLeather");
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
        GameRegistry.registerItem(lonSword, "lonSword");
        GameRegistry.registerItem(lonPickaxe, "lonPickaxe");
        GameRegistry.registerItem(lonAxe, "lonAxe");
        GameRegistry.registerItem(lonShovel, "lonShovel");
        GameRegistry.registerItem(lonHoe, "lonHoe");
        GameRegistry.registerItem(rubySword, "rubySword");
        GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
    }
}
