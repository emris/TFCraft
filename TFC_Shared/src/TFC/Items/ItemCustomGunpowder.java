package TFC.Items;

import TFC.TFCBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraft.world.World;

public class ItemCustomGunpowder extends Item
{

	public ItemCustomGunpowder(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setPotionEffect(PotionHelper.gunpowderEffect);
		this.func_111206_d("gunpowder");
		this.setUnlocalizedName("sulphur");
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
			int par6, int par7, float par8, float par9, float par10)
	{
		if (par3World.getBlockId(par4, par5, par6) != Block.snow.blockID)
		{
			if (par7 == 0) { --par5; }
			if (par7 == 1) { ++par5; }
			if (par7 == 2) { --par6; }
			if (par7 == 3) { ++par6; }
			if (par7 == 4) { --par4; }
			if (par7 == 5) { ++par4; }
			if (!par3World.isAirBlock(par4, par5, par6)) { return false; }
		}

		if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
		{
			return false;
		}
		else
		{
			if (TFCBlocks.GunpowderWire.canPlaceBlockAt(par3World, par4, par5, par6))
			{
				--par1ItemStack.stackSize;
				par3World.setBlock(par4, par5, par6, TFCBlocks.GunpowderWire.blockID);
			}

			return true;
		}
		
	}

	
}
