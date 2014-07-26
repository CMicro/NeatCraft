package com.cmicro.neatcraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static void init(File configFile)
    {
        //Create config object from the given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            configuration.load();

            //Read config
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Random configValue").getBoolean(true);
        }

        catch (Exception e)
        {
            //Log exception
        }

        finally
        {
            configuration.save();
            //Save config
        }

        System.out.println("Config test: " + configValue);
    }
}
