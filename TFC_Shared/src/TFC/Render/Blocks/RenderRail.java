package TFC.Render.Blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import TFC.Reference;
import TFC.TFCBlocks;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderRail implements ISimpleBlockRenderingHandler
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.ModID + ":textures/blocks/devices/Rail.png");
	private IModelCustom railModel;
	
	public RenderRail()
	{
		railModel = AdvancedModelLoader.loadModel("/assets/terrafirmacraft/models/Rail.tcn");
	}
	
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
//		Minecraft.getMinecraft().renderEngine.func_110577_a(TEXTURE);
//		railModel.renderPart("Wood1");
		GL11.glPopMatrix();

		return true;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return false;
	}

	@Override
	public int getRenderId() {
		return TFCBlocks.railRenderId;
	}

}
