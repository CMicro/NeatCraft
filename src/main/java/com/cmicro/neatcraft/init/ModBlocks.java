package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.blocks.BlockNC;
import com.cmicro.neatcraft.blocks.BlockSteel;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModBlocks
{
    public static final BlockNC blockSteel = new BlockSteel();

    public static void init()
    {
        GameRegistry.registerBlock(blockSteel, "blockSteel");
    }
}
