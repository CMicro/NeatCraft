package com.cmicro.neatcraft.init;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        //Crafting
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
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.rodSteel, 6),
                        " S ",
                        " S ",
                        " S ", 'S', new ItemStack(ModItems.itemSteel)
                );

        //Steel
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelSword),
                        " S ",
                        " S ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelPickaxe),
                        "SSS",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelAxe),
                        "SS ",
                        "SR ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelAxe),
                        " SS",
                        " RS",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelHoe),
                        " SS",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.steelHoe),
                        "SS ",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemHardenedSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelSword),
                        " S ",
                        " S ",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelPickaxe),
                        "SSS",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelAxe),
                        "SS ",
                        "SR ",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelAxe),
                        " SS",
                        " RS",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelShovel),
                        " S ",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelHoe),
                        " SS",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.eSteelHoe),
                        "SS ",
                        " R ",
                        " R ", 'S', new ItemStack(ModItems.itemEnderSteel), 'R', new ItemStack(ModItems.rodSteel)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.gemLonsdaleite),
                        "CCC",
                        "CDC",
                        "CCC", 'C', new ItemStack(ModBlocks.blockCFlintB), 'D', new ItemStack(Items.diamond)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonSword),
                        "ELE",
                        "ELE",
                        " R ", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonPickaxe),
                        "LLL",
                        "ERE",
                        "ERE", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonAxe),
                        "ELL",
                        "ERL",
                        "ERE", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonAxe),
                        "LLE",
                        "LRE",
                        "ERE", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonShovel),
                        "ELE",
                        "ERE",
                        "ERE", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonHoe),
                        "ELL",
                        "ERE",
                        "ERE", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapedRecipe
                (
                        new ItemStack(ModItems.lonHoe),
                        "LLE",
                        "ERE",
                        "ERE", 'L', new ItemStack(ModItems.gemLonsdaleite), 'R', new ItemStack(ModItems.rodSteel), 'E', new ItemStack(Items.ender_eye)
                );
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSteel, 9), new ItemStack(ModBlocks.blockSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemHardenedSteel, 9), new ItemStack(ModBlocks.blockHSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockHSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel), new ItemStack(ModItems.itemHardenedSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockESteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel), new ItemStack(ModItems.itemEnderSteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemEnderSteel, 9), new ItemStack(ModBlocks.blockESteel));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockCFlint1), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint), new ItemStack(Items.flint));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.flint, 9), new ItemStack(ModBlocks.blockCFlint1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blockLon), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite), new ItemStack(ModItems.gemLonsdaleite));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemLonsdaleite, 9), new ItemStack(ModBlocks.blockLon));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModItems.itemSteel), new ItemStack(ModItems.itemHardenedSteel), 1.0F);
        GameRegistry.addSmelting(new ItemStack(ModBlocks.blockCFlint1), new ItemStack(ModBlocks.blockCFlintB), 1.0F);
    }
}
