package TFC.Render.Blocks;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import TFC.Reference;
import TFC.TFCBlocks;
import TFC.Render.Models.ModelFirepit;
import TFC.TileEntities.TileEntityFirepit;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class TileEntityFirepitRenderer extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
	private static final ResourceLocation OFF_TEXTURE = new ResourceLocation(Reference.ModID + ":textures/blocks/devices/Firepit_Off.png");
	private static final ResourceLocation ON_TEXTURE = new ResourceLocation(Reference.ModID + ":textures/blocks/devices/Firepit_On.png");
	private ModelFirepit modelFirepit;
	
	public TileEntityFirepitRenderer()
	{
		modelFirepit = new ModelFirepit();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float f)
	{
		TileEntityFirepit te = (TileEntityFirepit) tileentity;
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d0 + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		if(te.fireTemperature > 10) {
			func_110628_a(ON_TEXTURE);
		} else {
			func_110628_a(OFF_TEXTURE);
		}
		modelFirepit.renderModel(0.0625F,
				te.fireItemStacks[5] != null, te.fireItemStacks[4] != null,
				te.fireItemStacks[3] != null, te.fireItemStacks[0] != null);
		GL11.glPopMatrix();
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return false;
	}

	@Override
	public int getRenderId() {
		return TFCBlocks.FirepitRenderId;
	}
}
