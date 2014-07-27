package com.cmicro.neatcraft.init;

import com.cmicro.neatcraft.blocks.*;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(References.MOD_ID)
public class ModBlocks
{
    public static final BlockNC blockSteel = new BlockSteel();
    public static final BlockNC blockHSteel = new BlockHSteel();
    public static final BlockNC blockESteel = new BlockESteel();
    public static final BlockNC blockCFlint1 = new BlockCFlint1();

    public static void init()
    {
        GameRegistry.registerBlock(blockSteel, "blockSteel");
        GameRegistry.registerBlock(blockHSteel, "blockHSteel");
        GameRegistry.registerBlock(blockESteel, "blockESteel");
        GameRegistry.registerBlock(blockCFlint1, "blockCFlint1");
    }
}
