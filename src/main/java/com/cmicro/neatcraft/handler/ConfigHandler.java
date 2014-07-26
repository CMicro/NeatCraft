package com.cmicro.neatcraft.handler;

import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        //Create config object from the given config file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event )
    {
        if (event.modID.equalsIgnoreCase(References.MOD_ID))
        {

        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("testValue", "Testing", false, "Testing value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
