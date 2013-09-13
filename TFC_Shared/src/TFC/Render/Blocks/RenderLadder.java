package TFC.Render.Blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import TFC.Reference;
import TFC.TFCBlocks;
import TFC.Render.Models.ModelLadder;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderLadder implements ISimpleBlockRenderingHandler
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.ModID + ":textures/blocks/devices/Ladder.png");
	private ModelLadder modelLadder;

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		modelLadder = new ModelLadder();
		
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(TEXTURE);
		GL11.glRotatef(0f, 0f, 1f, 0f);
		modelLadder.renderModel(0.0625F);
		GL11.glPopMatrix();
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		IBlockAccess blockAccess = renderer.blockAccess;
		int meta = blockAccess.getBlockMetadata(x, y, z);
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
		if(meta == 2) { GL11.glRotatef(180, 0.0F, 1.0F, 0.0F); }
		else if(meta == 3) { GL11.glRotatef(0, 0.0F, 1.0F, 0.0F); }
		else if(meta == 4) { GL11.glRotatef(270, 0.0F, 1.0F, 0.0F); }
		else if(meta == 5) { GL11.glRotatef(90, 0.0F, 1.0F, 0.0F); }
		GL11.glScalef(1.0F, -1F, -1F);
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(TEXTURE);
		modelLadder.renderModel(0.0625F);
		GL11.glPopMatrix();
		
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return true;
	}

	@Override
	public int getRenderId() {
		return TFCBlocks.ladderRenderId;
	}

}
