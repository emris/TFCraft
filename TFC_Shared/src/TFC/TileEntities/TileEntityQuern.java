package TFC.TileEntities;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.packet.Packet;
import TFC.TFCItems;
import TFC.TerraFirmaCraft;
import TFC.API.IFood;
import TFC.Core.TFC_Core;
import TFC.Entities.Mobs.EntityCowTFC;
import TFC.Food.ItemFoodTFC;
import TFC.Handlers.PacketHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityQuern extends NetworkTileEntity implements IInventory {
	public ItemStack[] storage = new ItemStack[3];
	public int rotation = 0;
	public boolean shouldRotate = false;
	public int rotatetimer = 0;
	public boolean hasQuern = false;

	@Override
	public void updateEntity() 
	{
		if(!worldObj.isRemote)
			TFC_Core.handleItemTicking(this, worldObj, xCoord, yCoord, zCoord);

		if(shouldRotate) 
		{
			rotatetimer++;
			//worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);//Disabled this to stop the rendering lag until we have a better solution like the bellows
			if(rotatetimer == 20) 
			{
				if(rotation == 3) 
				{
					rotation = 0;
					shouldRotate = false;
					if(!worldObj.isRemote) 
					{
						if(processItem(TFCItems.WheatGrain, 0, TFCItems.WheatGround, 0, 1))//Wheat Flour
							;
						else if(processItem(TFCItems.RyeGrain, 0, TFCItems.RyeGround, 0, 1))//Rye Flour
							;
						else if(processItem(TFCItems.OatGrain, 0, TFCItems.OatGround, 0, 1))//Oat Flour
							;
						else if(processItem(TFCItems.BarleyGrain, 0, TFCItems.BarleyGround, 0, 1))//Barley Flour
							;
						else if(processItem(TFCItems.RiceGrain, 0, TFCItems.RiceGround, 0, 1))//Rice Flour
							;
						else if(processItem(TFCItems.MaizeEar, 0, TFCItems.CornmealGround, 0, 1))//Cornmeal
							;
						else if(processItem(TFCItems.OreChunk, 16, TFCItems.Powder, 1, 4))//Kaolinite Powder
							;
						else if(processItem(TFCItems.OreChunk, 20, TFCItems.Powder, 2, 4))//Graphite Powder
							;
						else if(processItem(TFCItems.OreChunk, 27, Item.redstone, 0, 8))//Cinnabar to Redstone
							;
						else if(processItem(TFCItems.OreChunk, 28, Item.redstone, 0, 8))//Cryolite to Redstone
							;
						else if(processItem(Item.bone, 0, Item.dyePowder, 15, 2))//Bone Meal
							;
						else if(processItem(TFCItems.OreChunk, 34, TFCItems.Powder, 6, 4))//Lapis Powder
							;
						else if(processItem(TFCItems.SmallOreChunk, 9, TFCItems.Powder, 8, 1))//Small Malachite Powder
							;
						else if(processItem(TFCItems.OreChunk, 58, TFCItems.Powder, 8, 2))//Poor Malachite Powder
							;
						else if(processItem(TFCItems.OreChunk, 9, TFCItems.Powder, 8, 4))//Malachite Powder
							;
						else if(processItem(TFCItems.OreChunk, 44, TFCItems.Powder, 8, 6))//Rich Malachite Powder
							;
						else if(processItem(TFCItems.SmallOreChunk, 3, TFCItems.Powder, 5, 1))//Small Hematite Powder
							;
						else if(processItem(TFCItems.OreChunk, 52, TFCItems.Powder, 5, 2))//Poor Hematite Powder
							;
						else if(processItem(TFCItems.OreChunk, 3, TFCItems.Powder, 5, 4))//Hematite Powder
							;
						else if(processItem(TFCItems.OreChunk, 38, TFCItems.Powder, 5, 6))//Rich Hematite Powder
							;
						else if(processItem(TFCItems.SmallOreChunk, 11, TFCItems.Powder, 7, 1))//Small Limonite Powder
							;
						else if(processItem(TFCItems.OreChunk, 60, TFCItems.Powder, 7, 2))//Poor Limonite Powder
							;
						else if(processItem(TFCItems.OreChunk, 11, TFCItems.Powder, 7, 4))//Limonite Powder
							;
						else if(processItem(TFCItems.OreChunk, 46, TFCItems.Powder, 7, 6))//Rich Limonite Powder
							;
						else if(processItem(TFCItems.OreChunk, 31, TFCItems.Fertilizer, 0, 4))//Sylvite to Fertilizer
							;
						else if(processItem(TFCItems.LooseRock, 5, TFCItems.Powder, 9, 4))//Rock Salt to Salt
							;

						if(storage[2] != null)
							damageStackInSlot(2);
					}
				} else
					rotation++;
				rotatetimer = 0;
			}
		}
	}

	public boolean processItem(Item inputItem, int damageIn, Item outputItem, int damageOut, int amountOut)
	{
		if(storage[0] != null && storage[0].getItem() == inputItem && storage[0].getItemDamage() == damageIn && 
				(storage[1] == null || (storage[1].getItem().itemID == outputItem.itemID && storage[1].getItemDamage() == damageOut)))
		{
			if (inputItem instanceof IFood)
			{
				if(storage[0].hasTagCompound() && storage[0].getTagCompound().hasKey("foodWeight")
						&& storage[0].getTagCompound().hasKey("foodDecay") && storage[1] == null)
				{
					storage [1] = new ItemStack(outputItem, amountOut, damageOut);
					NBTTagCompound grainNBT = storage[0].getTagCompound();
					float flourWeight = grainNBT.getFloat("foodWeight");
					float flourDecay = grainNBT.getFloat("foodDecay");
					ItemFoodTFC.createTag(storage[1], flourWeight, flourDecay);
					storage[0] = null;
					return true;
				}
			}
			else
			{
				if(storage[0].stackSize == 1)
					storage[0] = null;
				else
					storage[0].stackSize--;
				if(storage[1] == null)
					storage[1] = new ItemStack(outputItem,amountOut,damageOut);
				else if(storage[1].stackSize < storage[1].getMaxStackSize())
					storage[1].stackSize += amountOut;
				else
					ejectItem(new ItemStack(outputItem, amountOut, damageOut));
				return true;
			}
		}
		return false;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
		storage = new ItemStack[getSizeInventory()];
		for(int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");
			if(byte0 >= 0 && byte0 < storage.length)
				storage[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
		}
		hasQuern = nbttagcompound.getBoolean("hasQuern");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		NBTTagList nbttaglist = new NBTTagList();
		for(int i = 0; i < storage.length; i++)
			if(storage[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte)i);
				storage[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		nbttagcompound.setTag("Items", nbttaglist);
		nbttagcompound.setBoolean("hasQuern", hasQuern);
	}

	public void damageStackInSlot(int i)
	{
		if(storage[i] != null) 
		{
			storage[i].damageItem(i, new EntityCowTFC(this.worldObj));
			if(storage[i].stackSize == 0 || storage[i].getItemDamage() == storage[i].getMaxDamage()) {
				setInventorySlotContents(i, null);
				TerraFirmaCraft.proxy.sendCustomPacketToPlayersInRange(xCoord, yCoord, zCoord, createUpdatePacket(), 160);
			}
		}
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if(storage[i] != null) {
			if(storage[i].stackSize <= j) {
				ItemStack itemstack = storage[i];
				setInventorySlotContents(i, null);
				return itemstack;
			}
			ItemStack itemstack1 = storage[i].splitStack(j);
			if(storage[i].stackSize == 0)
				setInventorySlotContents(i, null);
			return itemstack1;
		} else
			return null;
	}

	public void ejectContents() {
		float f3 = 0.05F;
		EntityItem entityitem;
		Random rand = new Random();
		float f = rand.nextFloat() * 0.8F + 0.1F;
		float f1 = rand.nextFloat() * 2.0F + 0.4F;
		float f2 = rand.nextFloat() * 0.8F + 0.1F;

		for (int i = 0; i < getSizeInventory(); i++)
			if(storage[i]!= null) {
				entityitem = new EntityItem(worldObj, xCoord + f, yCoord + f1, zCoord + f2, storage[i]);
				entityitem.motionX = (float)rand.nextGaussian() * f3;
				entityitem.motionY = (float)rand.nextGaussian() * f3 + 0.2F;
				entityitem.motionZ = (float)rand.nextGaussian() * f3;
				worldObj.spawnEntityInWorld(entityitem);
			}
	}

	public void ejectItem(ItemStack item) {
		float f3 = 0.05F;
		EntityItem entityitem;
		Random rand = new Random();
		float f = rand.nextFloat() * 0.8F + 0.1F;
		float f1 = rand.nextFloat() * 2.0F + 0.4F;
		float f2 = rand.nextFloat() * 0.8F + 0.1F;

		if(storage[1]!= null) {
			entityitem = new EntityItem(worldObj, xCoord + f, yCoord + f1, zCoord + f2, item);
			entityitem.motionX = (float)rand.nextGaussian() * f3;
			entityitem.motionY = (float)rand.nextGaussian() * f3 + 0.05F;
			entityitem.motionZ = (float)rand.nextGaussian() * f3;
			worldObj.spawnEntityInWorld(entityitem);
		}
	}

	@Override
	public int getSizeInventory() {
		return storage.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return storage[i];
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		storage[i] = itemstack;
		if(itemstack != null && itemstack.stackSize > getInventoryStackLimit())
			itemstack.stackSize = getInventoryStackLimit();
//		TerraFirmaCraft.proxy.sendCustomPacket(createUpdatePacket());
	}

	@Override
	public String getInvName() {
		return "Quern";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		return false;
	}

	@Override
	public void openChest() {
		// TODO Auto-generated method stub
	}

	@Override
	public void closeChest() {
		//TerraFirmaCraft.proxy.sendCustomPacket(createUpdatePacket());
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) {
		return null;
	}

	@Override
	public void createInitPacket(DataOutputStream outStream) throws IOException {
		outStream.writeBoolean(storage[2] != null);
	}

	@Override
	public void handleDataPacket(DataInputStream inStream) throws IOException {
		this.hasQuern = inStream.readBoolean();
		this.shouldRotate = inStream.readBoolean();
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	public Packet createUpdatePacket() {
		ByteArrayOutputStream bos=new ByteArrayOutputStream(140);
		DataOutputStream dos=new DataOutputStream(bos);
		try {
			dos.writeByte(PacketHandler.Packet_Data_Block_Client);
			dos.writeInt(xCoord);
			dos.writeInt(yCoord);
			dos.writeInt(zCoord);
			dos.writeBoolean(storage[2] != null);
			dos.writeBoolean(shouldRotate);
		} catch (IOException e) {
		}
		return this.setupCustomPacketData(bos.toByteArray(), bos.size());
	}

	@Override
	public void handleDataPacketServer(DataInputStream inStream) throws IOException {
		// TODO Auto-generated method stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleInitPacket(DataInputStream inStream) throws IOException {
		this.hasQuern = inStream.readBoolean();
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return false;
	}
}
