package TFC.Blocks.Vanilla;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import TFC.TFCBlocks;
import TFC.Blocks.BlockTerraContainer;
import TFC.Core.TFC_Core;
import TFC.TileEntities.TileEntityReeds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomReed extends BlockTerraContainer implements IPlantable
{
	public BlockCustomReed(int par1)
	{
		super(par1, Material.plants);
		float var3 = 0.375F;
		this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
		this.setTickRandomly(true);
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		if (par1World.isAirBlock(par2, par3 + 1, par4))
		{
			int l;
			for (l = 1; par1World.getBlockId(par2, par3 - l, par4) == this.blockID; ++l) { ; }
			if (l < 3)
			{
				int i1 = par1World.getBlockMetadata(par2, par3, par4);

				if (i1 == 15)
				{
					par1World.setBlock(par2, par3 + 1, par4, this.blockID);
					par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
				}
				else
				{
					par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 + 1, 4);
				}
			}
		}
	}
	
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		int var5 = par1World.getBlockId(par2, par3 - 1, par4);
		boolean correctSoil = TFC_Core.isSoil(var5) || TFC_Core.isSand(var5);
		return var5 == this.blockID ? true : !correctSoil ? false : par1World.getBlockMaterial(par2 - 1, par3 - 1, par4) == Material.water ? true : par1World.getBlockMaterial(par2 + 1, par3 - 1, par4) == Material.water ? true : par1World.getBlockMaterial(par2, par3 - 1, par4 - 1) == Material.water ? true : par1World.getBlockMaterial(par2, par3 - 1, par4 + 1) == Material.water;
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		this.checkBlockCoordValid(par1World, par2, par3, par4);
	}
	
	/**
	 * Checks if current block pos is valid, if not, breaks the block as dropable item. Used for reed and cactus.
	 */
	protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
	{
		if (!this.canBlockStay(par1World, par2, par3, par4))
		{
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
			par1World.setBlockToAir(par2, par3, par4);
		}
	}

	/**
	 * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
	 */
	@Override
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
	{
		return this.canPlaceBlockAt(par1World, par2, par3, par4);
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Item.reed.itemID;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return TFCBlocks.reedsRenderId;
	}

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return Item.reed.itemID;
	}
	
	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) {
		return EnumPlantType.Beach;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z) {
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z);
	}

	public TileEntity getBlockEntity() {
		return new TileEntityReeds();
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntityReeds();
	}
}
