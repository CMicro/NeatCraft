package com.cmicro.neatcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class VanillaTweaks
{
    public static void init()
    {
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(Items.saddle),
                        "LLL",
                        "LIL",
                        "S S", 'L', new ItemStack(ModItems.itemHardenedLeather), 'I', new ItemStack(Items.iron_ingot), 'S', new ItemStack(ModItems.itemSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(Items.iron_horse_armor),
                        "LLL",
                        "IIL",
                        "SIS", 'L', new ItemStack(ModItems.itemHardenedLeather), 'I', new ItemStack(Items.iron_ingot), 'S', new ItemStack(ModItems.itemSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(Items.golden_horse_armor),
                        "LLL",
                        "GGL",
                        "SGS", 'L', new ItemStack(ModItems.itemHardenedLeather), 'G', new ItemStack(Items.gold_ingot), 'S', new ItemStack(ModItems.itemSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(Items.diamond_horse_armor),
                        "LLL",
                        "DDL",
                        "SDS", 'L', new ItemStack(ModItems.itemHardenedLeather), 'D', new ItemStack(Items.diamond), 'S', new ItemStack(ModItems.itemSteel)
                );
    }
}
