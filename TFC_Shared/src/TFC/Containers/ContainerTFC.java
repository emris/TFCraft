package TFC.Containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import TFC.API.TFC_ItemHeat;

public class ContainerTFC extends Container
{
	public int bagsSlotNum = 0;
	public EntityPlayer player;
	protected boolean isLoading = false;
	protected boolean doItemSaving = false;



	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		// TODO Auto-generated method stub
		return true;
	}
	/**
	 * Used by containers that represent items and need to save the inventory to that items NBT
	 */
	public void saveContents(ItemStack is) 
	{

	}

	/**
	 * Used by containers that represent items and need to load an item from nbt
	 * @return 
	 */
	public ItemStack loadContents(int slot) 
	{
		return null;
	}

	@Override
	public ItemStack slotClick(int par1, int par2, int par3, EntityPlayer par4EntityPlayer)
	{
		ItemStack is = super.slotClick(par1, par2, par3, par4EntityPlayer);
		saveContents(is);
		return is;
	}

	@Override
	protected boolean mergeItemStack(ItemStack is, int slotStart, int slotFinish, boolean par4)
	{
		boolean var5 = false;
		int slotIndex = slotStart;

		if (par4)
		{
			slotIndex = slotFinish - 1;
		}

		Slot slot;
		ItemStack slotstack;

		if (is.isStackable())
		{
			while (is.stackSize > 0 && (!par4 && slotIndex < slotFinish || par4 && slotIndex >= slotStart))
			{
				slot = (Slot)this.inventorySlots.get(slotIndex);
				slotstack = slot.getStack();

				if (slotstack != null
						&& slotstack.itemID == is.itemID
						//                	&& !is.getHasSubtypes()
						&& is.getItemDamage() == slotstack.getItemDamage()
						&& ItemStack.areItemStackTagsEqual(is, slotstack)
						&& slotstack.stackSize < slot.getSlotStackLimit())
				{
					int mergedStackSize = is.stackSize + getSmaller(slotstack.stackSize, slot.getSlotStackLimit());

					//First we check if we can add the two stacks together and the resulting stack is smaller than the maximum size for the slot or the stack
					if (mergedStackSize <= is.getMaxStackSize() && mergedStackSize <= slot.getSlotStackLimit())
					{
						is.stackSize = 0;
						slotstack.stackSize = mergedStackSize;
						slot.onSlotChanged();
						var5 = true;
					}
					else if (slotstack.stackSize < is.getMaxStackSize())
					{
						is.stackSize -= is.getMaxStackSize() - slotstack.stackSize;
						slotstack.stackSize = is.getMaxStackSize();
						slot.onSlotChanged();
						var5 = true;
					}
				}

				if (par4)
				{
					--slotIndex;
				}
				else
				{
					++slotIndex;
				}
			}
		}

		if (is.stackSize > 0)
		{
			if (par4)
			{
				slotIndex = slotFinish - 1;
			}
			else
			{
				slotIndex = slotStart;
			}

			while (!par4 && slotIndex < slotFinish || par4 && slotIndex >= slotStart)
			{
				slot = (Slot)this.inventorySlots.get(slotIndex);
				slotstack = slot.getStack();
				if (slotstack == null && slot.isItemValid(is) && slot.getSlotStackLimit() < is.stackSize)
				{
					ItemStack copy = is.copy();
					copy.stackSize = slot.getSlotStackLimit();
					is.stackSize -= slot.getSlotStackLimit();
					slot.putStack(copy);
					slot.onSlotChanged();
					var5 = true;
					//this.bagsSlotNum = slotIndex;
					break;
				}
				else if (slotstack == null && slot.isItemValid(is))
				{
					slot.putStack(is.copy());
					slot.onSlotChanged();
					is.stackSize = 0;
					var5 = true;
					break;
				}

				if (par4)
				{
					--slotIndex;
				}
				else
				{
					++slotIndex;
				}
			}
		}

		return var5;
	}

	protected int getSmaller(int i, int j)
	{
		if(i < j) {
			return i;
		} else {
			return j;
		}
	}

	@Override
	public void detectAndSendChanges()
	{
		boolean _shouldSave = false;
		boolean _shouldReload = false;

		for (int i = 0; i < this.inventorySlots.size(); ++i)
		{
			ItemStack itemstack = ((Slot)this.inventorySlots.get(i)).getStack();//the visible slot item
			ItemStack itemstack1 = (ItemStack)this.inventoryItemStacks.get(i);//the real invisible item

			if (!areItemStacksEqual(itemstack1, itemstack))
			{
				if(doItemSaving && i < inventoryItemStacks.size()-36 && !isLoading) 
				{
					_shouldSave = true;
				}

				itemstack1 = itemstack == null ? null : itemstack.copy();
				if(itemstack1 != null && itemstack1.stackSize == 0)
					itemstack1 = null;
				this.inventoryItemStacks.set(i, itemstack1);

				if(_shouldSave) 
				{
					int slotNum = bagsSlotNum + (inventoryItemStacks.size()-36);
					this.saveContents((ItemStack)inventoryItemStacks.get(slotNum));
					player.inventory.setInventorySlotContents(bagsSlotNum, (ItemStack)inventoryItemStacks.get(slotNum));
					for (int j = 0; j < this.crafters.size(); ++j)
					{
						((ICrafting)this.crafters.get(j)).sendSlotContents(this, slotNum, (ItemStack)inventoryItemStacks.get(slotNum));
					}
				}

				for (int j = 0; j < this.crafters.size(); ++j)
				{
					((ICrafting)this.crafters.get(j)).sendSlotContents(this, i, itemstack1);
				}
			}
		}

		for (int i = 0; i < this.inventorySlots.size()-36; ++i)
		{
			ItemStack itemstack = this.loadContents(i);
			ItemStack itemstack1 = (ItemStack)this.inventoryItemStacks.get(i);//the real invisible item
			{
				_shouldReload = true;
			}
		}

		if(_shouldReload && !isLoading)
		{
			reloadContainer();
		}

		this.isLoading = false;
	}	

	/**
	 * This is only used if the container should be reloaded due to some change in information 
	 * that can't be updated in some other way.
	 */
	public void reloadContainer()
	{

	}

	public static boolean areItemStacksEqual(ItemStack is1, ItemStack is2)
	{
		return is1 == null && is2 == null ? true : (is1 != null && is2 != null ? isItemStackEqual(is1, is2) : false);
	}

	public static boolean isItemStackEqual(ItemStack is1, ItemStack is2)
	{
		return is1.stackSize != is2.stackSize ? false : 
			(is1.itemID != is2.itemID ? false : 
				(is1.getItemDamage() != is2.getItemDamage() ? false : 
					(is1.stackTagCompound == null && is2.stackTagCompound != null ? false : 
						is1.stackTagCompound == null || areCompoundsEqual(is1, is2))));
	}

	public static boolean areCompoundsEqual(ItemStack is1, ItemStack is2)
	{
		ItemStack is3 = is1.copy(); 
		ItemStack is4 = is2.copy(); 

		NBTTagCompound is3Tags = is3.getTagCompound();
		NBTTagCompound is4Tags = is4.getTagCompound();

		if (is3Tags == null)
		{
			return (is4Tags == null) || is4Tags.hasNoTags();
		}

		if (is4Tags == null)
		{
			return is3Tags.hasNoTags();
		}

		float temp3 = TFC_ItemHeat.GetTemp(is1);
		float temp4 = TFC_ItemHeat.GetTemp(is2);
		is3Tags.removeTag("temp");
		is4Tags.removeTag("temp");

		return is3Tags.equals(is4Tags) &&  Math.abs(temp3 - temp4) < 5;
	}
}
