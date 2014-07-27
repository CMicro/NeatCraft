package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.blocks.BlockHSteel;
import com.cmicro.neatcraft.blocks.BlockNC;
import com.cmicro.neatcraft.blocks.BlockSteel;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModBlocks
{
    public static final BlockNC blockSteel = new BlockSteel();
    public static final BlockNC blockHSteel = new BlockHSteel();

    public static void init()
    {
        GameRegistry.registerBlock(blockSteel, "blockSteel");
        GameRegistry.registerBlock(blockHSteel, "blockHSteel");
    }
}
