package TFC.Entities.Mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.world.World;
import TFC.API.ICausesDamage;
import TFC.API.Enums.EnumDamageType;
import TFC.Core.TFC_MobData;

public class EntitySpidertaur extends EntitySpider implements ICausesDamage
{
	public EntitySpidertaur(World par1World)
	{
		super(par1World);
		this.setSize(1.4F, 0.9F);
	}
	
	@Override
	protected void func_110147_ax()
	{
		super.func_110147_ax();
		this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(TFC_MobData.SpidertaurDamage);
		this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(TFC_MobData.SpidertaurHealth+800);//MaxHealth
	}

	@Override
	public EnumDamageType GetDamageType()
	{
		return EnumDamageType.PIERCING;
	}

}
