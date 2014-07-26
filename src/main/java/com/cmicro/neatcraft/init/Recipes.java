package com.cmicro.neatcraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        //Craftingss
        GameRegistry.addShapedRecipe
        (
                new ItemStack(ModItems.itemSteel),
                "III",
                "FIF",
                "III", 'I', new ItemStack(Items.iron_ingot), 'F', new ItemStack(Items.flint)
        );
        GameRegistry.addShapedRecipe
        (
                new ItemStack(ModItems.itemEnderSteel),
                " E ",
                " I ",
                " E ", 'I', new ItemStack(ModItems.itemHardenedSteel), 'E', Items.ender_eye
        );
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSteel, 9), new ItemStack(ModBlocks.blockSteel));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemHardenedSteel), 1.0F);
    }
}
