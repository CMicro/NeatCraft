package com.cmicro.neatcraft.blocks;

import com.cmicro.neatcraft.creativetab.CTabNCResources;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockNC extends Block
{
    public BlockNC(Material material)
    {
        super(material);
        setCreativeTab(CTabNCResources.NC_RES_TAB);
    }

    public BlockNC()
    {
        this(Material.iron);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", References.RESOURCE_PREFIX + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
