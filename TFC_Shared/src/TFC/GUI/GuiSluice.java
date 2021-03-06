package TFC.GUI;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import TFC.Reference;
import TFC.Containers.ContainerSluice;
import TFC.Core.TFC_Core;
import TFC.Core.Player.PlayerInventory;
import TFC.Core.Util.StringUtil;
import TFC.TileEntities.TileEntitySluice;


public class GuiSluice extends GuiContainer
{
	private TileEntitySluice sluiceInventory;


	public GuiSluice(InventoryPlayer inventoryplayer, TileEntitySluice tileEntitySluice, World world, int x, int y, int z)
	{
		super(new ContainerSluice(inventoryplayer,tileEntitySluice, world, x, y, z) );
		sluiceInventory = tileEntitySluice;
		xSize = 176;
		ySize = 85+PlayerInventory.invYSize;

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		TFC_Core.bindTexture(new ResourceLocation(Reference.ModID, Reference.AssetPathGui + "gui_sluice.png"));
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
		int s = (width - xSize) / 2;
		int t = (height - ySize) / 2;
		drawTexturedModalRect(s, t, 0, 0, xSize, ySize);
		if(sluiceInventory.waterInput && sluiceInventory.waterOutput)
		{
			int l = 12;//sluiceInventory.getProcessScaled(12); 
			drawTexturedModalRect(s + 80, (t + 36 + 12 - 19) - l, 176, 12 - l, 14, l + 2);
		}
		int i1 = sluiceInventory.getProcessScaled(24);
		drawTexturedModalRect(s + 76, t + 34, 176, 14, i1+1, 16);
		
		PlayerInventory.drawInventory(this, width, height, ySize-PlayerInventory.invYSize);

	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		fontRenderer.drawString(StringUtil.localize("gui.Sluice.Soil") + ": " + sluiceInventory.soilAmount + "/50", 15, 39, 0x404040);
	}

}
