package TFC.Render.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import TFC.TFCBlocks;
import TFC.Blocks.Devices.BlockGunpowderWire;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderGunpowderWire implements ISimpleBlockRenderingHandler
{

	private IBlockAccess blockAccess;

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		blockAccess = renderer.blockAccess;

        Tessellator tessellator = Tessellator.instance;
        int l = blockAccess.getBlockMetadata(x, y, z);
        Icon icon = BlockGunpowderWire.func_94409_b("cross");
        Icon icon1 = BlockGunpowderWire.func_94409_b("line");
        Icon icon2 = BlockGunpowderWire.func_94409_b("cross_overlay");
        Icon icon3 = BlockGunpowderWire.func_94409_b("line_overlay");
        tessellator.setBrightness(block.getMixedBrightnessForBlock(blockAccess, x, y, z));
        float f = 1.0F;
        float f1 = (float)l / 15.0F;
        float f2 = f1 * 0.6F + 0.4F;

        if (l == 0)
        {
            f2 = 0.3F;
        }

        float f3 = f1 * f1 * 0.7F - 0.5F;
        float f4 = f1 * f1 * 0.6F - 0.7F;

        if (f3 < 0.0F)
        {
            f3 = 0.0F;
        }

        if (f4 < 0.0F)
        {
            f4 = 0.0F;
        }

        tessellator.setColorOpaque_F(f2, f3, f4);
        double d0 = 0.015625D;
        double d1 = 0.015625D;
        boolean flag = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x - 1, y, z, 1) || !this.blockAccess.isBlockNormalCube(x - 1, y, z) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x - 1, y - 1, z, -1);
        boolean flag1 = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x + 1, y, z, 3) || !this.blockAccess.isBlockNormalCube(x + 1, y, z) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x + 1, y - 1, z, -1);
        boolean flag2 = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x, y, z - 1, 2) || !this.blockAccess.isBlockNormalCube(x, y, z - 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x, y - 1, z - 1, -1);
        boolean flag3 = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x, y, z + 1, 0) || !this.blockAccess.isBlockNormalCube(x, y, z + 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x, y - 1, z + 1, -1);

        if (!this.blockAccess.isBlockNormalCube(x, y + 1, z))
        {
            if (this.blockAccess.isBlockNormalCube(x - 1, y, z) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x - 1, y + 1, z, -1))
            {
                flag = true;
            }

            if (this.blockAccess.isBlockNormalCube(x + 1, y, z) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x + 1, y + 1, z, -1))
            {
                flag1 = true;
            }

            if (this.blockAccess.isBlockNormalCube(x, y, z - 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x, y + 1, z - 1, -1))
            {
                flag2 = true;
            }

            if (this.blockAccess.isBlockNormalCube(x, y, z + 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, x, y + 1, z + 1, -1))
            {
                flag3 = true;
            }
        }

        float f5 = (float)(x + 0);
        float f6 = (float)(x + 1);
        float f7 = (float)(z + 0);
        float f8 = (float)(z + 1);
        int i1 = 0;

        if ((flag || flag1) && !flag2 && !flag3)
        {
            i1 = 1;
        }

        if ((flag2 || flag3) && !flag1 && !flag)
        {
            i1 = 2;
        }

        if (i1 == 0)
        {
            int j1 = 0;
            int k1 = 0;
            int l1 = 16;
            int i2 = 16;
            boolean flag4 = true;

            if (!flag)
            {
                f5 += 0.3125F;
            }

            if (!flag)
            {
                j1 += 5;
            }

            if (!flag1)
            {
                f6 -= 0.3125F;
            }

            if (!flag1)
            {
                l1 -= 5;
            }

            if (!flag2)
            {
                f7 += 0.3125F;
            }

            if (!flag2)
            {
                k1 += 5;
            }

            if (!flag3)
            {
                f8 -= 0.3125F;
            }

            if (!flag3)
            {
                i2 -= 5;
            }

            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f8, (double)icon.getInterpolatedU((double)l1), (double)icon.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f7, (double)icon.getInterpolatedU((double)l1), (double)icon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)icon.getInterpolatedU((double)j1), (double)icon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f8, (double)icon.getInterpolatedU((double)j1), (double)icon.getInterpolatedV((double)i2));
            tessellator.setColorOpaque_F(f, f, f);
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f8, (double)icon2.getInterpolatedU((double)l1), (double)icon2.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f7, (double)icon2.getInterpolatedU((double)l1), (double)icon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)icon2.getInterpolatedU((double)j1), (double)icon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f8, (double)icon2.getInterpolatedU((double)j1), (double)icon2.getInterpolatedV((double)i2));
        }
        else if (i1 == 1)
        {
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f8, (double)icon1.getMaxU(), (double)icon1.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f7, (double)icon1.getMaxU(), (double)icon1.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)icon1.getMinU(), (double)icon1.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f8, (double)icon1.getMinU(), (double)icon1.getMaxV());
            tessellator.setColorOpaque_F(f, f, f);
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f8, (double)icon3.getMaxU(), (double)icon3.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f7, (double)icon3.getMaxU(), (double)icon3.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)icon3.getMinU(), (double)icon3.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f8, (double)icon3.getMinU(), (double)icon3.getMaxV());
        }
        else
        {
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f8, (double)icon1.getMaxU(), (double)icon1.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f7, (double)icon1.getMinU(), (double)icon1.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)icon1.getMinU(), (double)icon1.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f8, (double)icon1.getMaxU(), (double)icon1.getMinV());
            tessellator.setColorOpaque_F(f, f, f);
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f8, (double)icon3.getMaxU(), (double)icon3.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)y + 0.015625D, (double)f7, (double)icon3.getMinU(), (double)icon3.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)icon3.getMinU(), (double)icon3.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f8, (double)icon3.getMaxU(), (double)icon3.getMinV());
        }

        if (!this.blockAccess.isBlockNormalCube(x, y + 1, z))
        {
            float f9 = 0.021875F;

            if (this.blockAccess.isBlockNormalCube(x - 1, y, z) && this.blockAccess.getBlockId(x - 1, y + 1, z) == TFCBlocks.GunpowderWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 1), (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 0), (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 1), (double)icon3.getMinU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 0), (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)icon3.getMaxU(), (double)icon3.getMaxV());
            }

            if (this.blockAccess.isBlockNormalCube(x + 1, y, z) && this.blockAccess.getBlockId(x + 1, y + 1, z) == TFCBlocks.GunpowderWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 1), (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 0), (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 1), (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)icon3.getMaxU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 0), (double)icon3.getMinU(), (double)icon3.getMinV());
            }

            if (this.blockAccess.isBlockNormalCube(x, y, z - 1) && this.blockAccess.getBlockId(x, y + 1, z - 1) == TFCBlocks.GunpowderWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)z + 0.015625D, (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)z + 0.015625D, (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)z + 0.015625D, (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)z + 0.015625D, (double)icon3.getMinU(), (double)icon3.getMinV());
            }

            if (this.blockAccess.isBlockNormalCube(x, y, z + 1) && this.blockAccess.getBlockId(x, y + 1, z + 1) == TFCBlocks.GunpowderWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)icon3.getMinU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMaxV());
            }
        }

        return true;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return false;
	}

	@Override
	public int getRenderId() {
		return 0;
	}

}
