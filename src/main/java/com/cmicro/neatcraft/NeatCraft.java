package com.cmicro.neatcraft;

import com.cmicro.neatcraft.handler.ConfigHandler;
import com.cmicro.neatcraft.init.*;
import com.cmicro.neatcraft.proxy.IProxy;
import com.cmicro.neatcraft.resources.References;
import com.cmicro.neatcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.network.ForgeMessage;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.MOD_VERSION, guiFactory = References.GUI_FACTORY)
public class NeatCraft
{
    @Mod.Instance(References.MOD_ID)
    public static NeatCraft instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static IProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        ModItems.init();
        ModBlocks.init();
        ModRecords.init();
        LogHelper.info("Pre Init Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        VanillaTweaks.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Init Complete!");
    }
}
