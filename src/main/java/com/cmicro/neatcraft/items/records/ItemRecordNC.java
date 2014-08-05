package com.cmicro.neatcraft.items.records;

import com.cmicro.neatcraft.creativetab.CTabNCRecords;
import com.cmicro.neatcraft.creativetab.CTabNCResources;
import com.cmicro.neatcraft.resources.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRecordNC extends ItemRecord
{
    private static final Map records = new HashMap();

    public final String recordName;

    public ItemRecordNC(String recordName)
    {
        super(recordName);

        this.recordName = recordName;
        maxStackSize = 1;
        setCreativeTab(CTabNCRecords.NC_REC_TAB);
        records.put(recordName, this);
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

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if (world.getBlock(x, y, z) == Blocks.jukebox && world.getBlockMetadata(x, y, z) == 0)
        {
            if (world.isRemote)
                return true;
            else
            {
                ((BlockJukebox)Blocks.jukebox).func_149926_b(world, x, y, z, itemStack);
                world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x, y, z, Item.getIdFromItem(this));
                --itemStack.stackSize;
                return true;
            }
        }
        else
            return false;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.getRecordNameLocal());
    }

    @Override
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal(this.getUnlocalizedName() + ".desc");
    }

    @Override
    public EnumRarity getRarity(ItemStack itemStack)
    {
        return EnumRarity.rare;
    }

    public static ItemRecordNC getRecord(String par0Str)
    {
        return (ItemRecordNC)records.get(par0Str);
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation("neatcraft:" + name);
    }
}
