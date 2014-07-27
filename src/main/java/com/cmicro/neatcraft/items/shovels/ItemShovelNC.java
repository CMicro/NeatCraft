package com.cmicro.neatcraft.items.shovels;

import com.cmicro.neatcraft.creativetab.CTabNCTools;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemShovelNC extends ItemSpade
{
    public ItemShovelNC(ToolMaterial material)
    {
        super(material);
        setCreativeTab(CTabNCTools.NC_TOOL_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", References.RESOURCE_PREFIX + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", References.RESOURCE_PREFIX + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
