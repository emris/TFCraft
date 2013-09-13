package TFC.Blocks.Vanilla;

import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.WEST;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import TFC.TFCBlocks;
import TFC.Blocks.BlockTerraContainer;
import TFC.TileEntities.TileEntityLadder;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCustomLadder extends BlockTerraContainer
{

	public BlockCustomLadder(int par1) {
		super(par1, Material.circuits);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(0.4F);
		this.setStepSound(soundLadderFootstep);
		this.setUnlocalizedName("ladder");
		this.func_111022_d("ladder");
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	/**
	 * Returns the bounding box of the wired rectangular prism to render.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		this.updateLadderBounds(par1IBlockAccess.getBlockMetadata(par2, par3, par4));
	}

	/**
	 * Update the ladder block bounds based on the given metadata value.
	 */
	public void updateLadderBounds(int par1)
	{
		float f = 0.125F;

		if (par1 == 2)
		{
			this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		}

		if (par1 == 3)
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
		}

		if (par1 == 4)
		{
			this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}

		if (par1 == 5)
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
		}
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType()
	{
		return TFCBlocks.ladderRenderId;
	}

	/**
	 * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	 */
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		return par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST ) ||
			   par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST ) ||
			   par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH) ||
			   par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH);
	}

	/**
	 * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	 */
	@Override
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		int j1 = par9;

		if ((j1 == 0 || par5 == 2) && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH))
		{
			j1 = 2;
		}

		if ((j1 == 0 || par5 == 3) && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH))
		{
			j1 = 3;
		}

		if ((j1 == 0 || par5 == 4) && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST))
		{
			j1 = 4;
		}

		if ((j1 == 0 || par5 == 5) && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST))
		{
			j1 = 5;
		}

		return j1;
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor blockID
	 */
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		int i1 = par1World.getBlockMetadata(par2, par3, par4);
		boolean flag = false;

		if (i1 == 2 && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH))
		{
			flag = true;
		}

		if (i1 == 3 && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH))
		{
			flag = true;
		}

		if (i1 == 4 && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST))
		{
			flag = true;
		}

		if (i1 == 5 && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST))
		{
			flag = true;
		}

		if (!flag)
		{
			this.dropBlockAsItem(par1World, par2, par3, par4, i1, 0);
			par1World.setBlockToAir(par2, par3, par4);
		}

		super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	@Override
	public boolean isLadder(World world, int x, int y, int z, EntityLivingBase entity)
	{
		return true;
	}
	
	public TileEntity getBlockEntity() {
		return new TileEntityLadder();
	}

	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new TileEntityLadder();
	}
}
