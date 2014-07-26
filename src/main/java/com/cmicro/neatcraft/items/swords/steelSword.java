package com.cmicro.neatcraft.items.swords;

import com.cmicro.neatcraft.creativetab.CTabNCTools;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class steelSword extends ItemSwordNC
{
    public steelSword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("steelSword");
    }
}
