package TFC.Handlers;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.ChunkDataEvent;
import TFC.Chunkdata.ChunkData;
import TFC.Chunkdata.ChunkDataManager;

public class ChunkDataEventHandler 
{
	@ForgeSubscribe
	public void onDataLoad(ChunkDataEvent.Load event) 
	{
		if(!event.world.isRemote)
		{
			NBTTagCompound eventTag = event.getData();

			if(eventTag.hasKey("Spawn Protection"))
			{
				NBTTagCompound spawnProtectionTag = eventTag.getCompoundTag("Spawn Protection");
				ChunkData data = new ChunkData(spawnProtectionTag);
				ChunkDataManager.addData(data.chunkX, data.chunkZ, data);
			}
			else
			{
				NBTTagCompound levelTag = eventTag.getCompoundTag("Level");
				ChunkData data = new ChunkData().CreateNew(levelTag.getInteger("xPos"), levelTag.getInteger("zPos"));
				ChunkDataManager.addData(data.chunkX, data.chunkZ, data);
			}
		}
	}

	@ForgeSubscribe
	public void onDataSave(ChunkDataEvent.Save event) 
	{
		if(!event.world.isRemote)
		{
			NBTTagCompound eventTag = event.getData();
			NBTTagCompound levelTag = eventTag.getCompoundTag("Level");

			int x = levelTag.getInteger("xPos");
			int z = levelTag.getInteger("zPos");
			ChunkData data = ChunkDataManager.getData(x, z);

			if(data != null)
			{
				NBTTagCompound spawnProtectionTag = data.getTag();
				eventTag.setCompoundTag("Spawn Protection", spawnProtectionTag);
			} 
			else
			{
				;//System.out.println("Attempting to save Chunkdata that has already been unloaded.");
			}
		}
	}
}
