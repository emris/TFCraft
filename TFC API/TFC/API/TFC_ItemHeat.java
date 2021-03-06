package TFC.API;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import TFC.Core.Util.StringUtil;

public class TFC_ItemHeat 
{
	public static String getHeatColor(float temp, float meltTemp)
	{
		String phrase = "";
		if(temp < 80)
		{
			phrase = StringUtil.localize("gui.ItemHeat.Warming");
			if(temp>(80 * 0.2))
				phrase = phrase + "\u2605";
			if(temp>(80 * 0.4))
				phrase = phrase + "\u2605";
			if(temp>(80 * 0.6))
				phrase = phrase + "\u2605";
			if(temp>(80 * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 80 && temp < 210)
		{
			phrase = StringUtil.localize("gui.ItemHeat.Hot");
			if(temp>80+((210-80) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>80+((210-80) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>80+((210-80) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>80+((210-80) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 210 &&  temp < 480)
		{
			phrase = StringUtil.localize("gui.ItemHeat.VeryHot");
			if(temp>210+((480-210) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>210+((480-210) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>210+((480-210) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>210+((480-210) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 480 &&  temp < 580)
		{
			phrase = "\2474" + StringUtil.localize("gui.ItemHeat.FaintRed");
			if(temp>480+((580-480) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>480+((580-480) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>480+((580-480) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>480+((580-480) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 580 &&  temp < 730)
		{
			phrase = "\2474" + StringUtil.localize("gui.ItemHeat.DarkRed");
			if(temp>580+((730-580) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>580+((730-580) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>580+((730-580) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>580+((730-580) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 730 &&  temp < 930)
		{
			phrase = "\247c" + StringUtil.localize("gui.ItemHeat.BrightRed");
			if(temp>730+((930-730) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>730+((930-730) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>730+((930-730) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>730+((930-730) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 930 &&  temp < 1100)
		{
			phrase = "\2476" + StringUtil.localize("gui.ItemHeat.Orange");
			if(temp>930+((1100-930) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>930+((1100-930) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>930+((1100-930) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>930+((1100-930) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 1100 &&  temp < 1300)
		{
			phrase = "\247e" + StringUtil.localize("gui.ItemHeat.Yellow");
			if(temp>1100+((1300-1100) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>1100+((1300-1100) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>1100+((1300-1100) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>1100+((1300-1100) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 1300 &&  temp < 1400)
		{
			phrase = "\247e" + StringUtil.localize("gui.ItemHeat.YellowWhite");
			if(temp>1300+((1400-1300) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>1300+((1400-1300) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>1300+((1400-1300) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>1300+((1400-1300) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 1400 &&  temp < 1500)
		{
			phrase = "\247f" + StringUtil.localize("gui.ItemHeat.White");
			if(temp>1400+((1500-1400) * 0.2))
				phrase = phrase + "\u2605";
			if(temp>1400+((1500-1400) * 0.4))
				phrase = phrase + "\u2605";
			if(temp>1400+((1500-1400) * 0.6))
				phrase = phrase + "\u2605";
			if(temp>1400+((1500-1400) * 0.8))
				phrase = phrase + "\u2605";
		}
		else if(temp >= 1500)
			phrase = "\247f" + StringUtil.localize("gui.ItemHeat.BrilliantWhite");

		if(temp > meltTemp)
			phrase = phrase + "\247f - " + StringUtil.localize("gui.ItemHeat.Liquid");

		return phrase;
	}

	public static String getHeatColorFood(float temp, float meltTemp)
	{
		if(temp < meltTemp)
			if(temp < meltTemp*0.1F)
				return StringUtil.localize("gui.FoodHeat.Cold");
			else if(temp >= meltTemp*0.1F && temp < meltTemp*0.4F)
				return "\2474" + StringUtil.localize("gui.FoodHeat.Warm");
			else if(temp >= meltTemp*0.4F && temp < meltTemp*0.8F)
				return "\2474" + StringUtil.localize("gui.ItemHeat.Hot");
			else
				return "\2474" + StringUtil.localize("gui.ItemHeat.VeryHot");

		return StringUtil.localize("gui.ClearSlot");
	}

	public static String getHeatColorTorch(float temp, float meltTemp)
	{
		if(temp < meltTemp)
			if(temp > 0 && temp < meltTemp*0.8F)
				return StringUtil.localize("gui.Torch.CatchingFire");
			else if(temp >= meltTemp*0.8F)
				return "\2474" + StringUtil.localize("gui.Torch.Lit");

		return StringUtil.localize("gui.ClearSlot");
	}

	public static Boolean getIsLiquid(ItemStack is)
	{       
		return GetTemp(is) >= IsCookable(is);
	}

	public static float IsCookable(ItemStack is)
	{       
		HeatRegistry manager = HeatRegistry.getInstance();
		if(is != null && manager!=null)
		{
			HeatIndex hi = manager.findMatchingIndex(is);
			if(hi != null)
				return hi.meltTemp;
			else
				return -1;
		} else
			return -1;
	}

	public static float GetSpecificHeat(ItemStack is)
	{       
		HeatRegistry manager = HeatRegistry.getInstance();
		if(is != null && manager!=null)
		{
			HeatIndex hi = manager.findMatchingIndex(is);
			if(hi != null)
				return hi.specificHeat;
			else
				return 1;
		} else
			return 1;
	}

	public static float IsCookable(Metal m)
	{       
		HeatRegistry manager = HeatRegistry.getInstance();
		if(manager!=null)
		{
			HeatIndex hi = manager.findMatchingIndex(new ItemStack(Item.itemsList[m.MeltedItemID]));
			if(hi != null)
				return hi.meltTemp;
			else
				return -1;
		} else
			return -1;
	}

	public static float GetTemp(ItemStack is)
	{
		if(HasTemp(is))
		{
			return is.getTagCompound().getFloat("temperature");
		} 
		return 0;
	}

	public static boolean HasTemp(ItemStack is)
	{
		if(is != null)
		{
			if(is.hasTagCompound() && is.getTagCompound().hasKey("temperature"))
				return true;
		} 
		return false;
	}

	public static float getTempIncrease(ItemStack is)
	{
		byte debugBump = 0;
		if(TFCOptions.enableDebugMode)
			debugBump = 2;
		return (1*GetSpecificHeat(is)) + debugBump;
	}

	public static float getTempDecrease(ItemStack is)
	{
		if(TFCOptions.enableDebugMode)
			return 0;
		return (1*GetSpecificHeat(is));
	}

	public static void HandleItemHeat(ItemStack is)
	{
		if (is != null)
		{
			if(is.hasTagCompound())
			{
				NBTTagCompound comp = is.getTagCompound();
				if(HasTemp(is))
				{
					float temp = GetTemp(is);
					if(temp > 0)
					{
						temp -= getTempDecrease(is);
						comp.setFloat("temperature",temp);
					}
					if(temp <= 0)
						comp.removeTag("temperature");
					if(comp.getTags().size() == 0)
						is.stackTagCompound = null;
				}
			}
		}
	}

	public static Boolean SetTemp(ItemStack is, float temp)
	{
		if(is != null)
		{
			if(is.hasTagCompound())
				is.getTagCompound().setFloat("temperature", temp);
			else if(IsCookable(is) != -1)
			{
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setFloat("temperature", temp);
				is.setTagCompound(nbt);
			}
		} 
		else return false;

		if(temp <= 0)
			RemoveTempTag(is);


		return true;
	}

	public static void RemoveTempTag(ItemStack is)
	{
		if(is.hasTagCompound() && is.getTagCompound().hasKey("temperature"))
		{
			is.getTagCompound().removeTag("temperature");
		}
		if(is.hasTagCompound() && is.getTagCompound().hasNoTags())
			is.stackTagCompound = null;
	}
}
