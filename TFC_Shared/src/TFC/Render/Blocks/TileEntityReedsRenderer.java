package TFC.Render.Blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import TFC.Reference;
import TFC.Render.Models.ModelReeds;
import TFC.TileEntities.TileEntityReeds;

public class TileEntityReedsRenderer extends TileEntitySpecialRenderer
{
	private static final ResourceLocation TOP_TEXTURE = new ResourceLocation(Reference.ModID + ":textures/blocks/plants/Reed.png");
	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.ModID + ":textures/blocks/plants/Reed1.png");
	private ModelReeds modelReeds;
	
	public TileEntityReedsRenderer() {
		modelReeds = new ModelReeds();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float f) {
		boolean top = true;
		TileEntityReeds te = (TileEntityReeds) tileentity;
		if(te.worldObj.getBlockId(te.xCoord, te.yCoord+1, te.zCoord) == Block.reed.blockID) {
			top = false;
		}
			
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d0 + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(1.0F, -1F, -1F);
		if(top) {
			func_110628_a(TOP_TEXTURE);
		} else {
			func_110628_a(TEXTURE);
		}
		modelReeds.renderModel(0.0625F, top);
		GL11.glPopMatrix();
	}
}
