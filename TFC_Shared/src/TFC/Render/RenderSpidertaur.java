package TFC.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import TFC.Reference;
import TFC.Entities.Mobs.EntitySpidertaur;
import TFC.Render.Models.ModelSpidertaur;

public class RenderSpidertaur extends RenderLiving
{
	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.ModID, "mob/Spidertaur.png");
	private ModelSpidertaur modelSpidertaur;
	private float scale = 1.0f;
	
	public RenderSpidertaur(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		modelSpidertaur = (ModelSpidertaur) par1ModelBase;
	}

	public void renderSpidertaur (EntitySpidertaur par1EntityDeer, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRenderLiving (par1EntityDeer, par2, par4, par6, par8, par9);
//		scale = par1EntityDeer.size_mod;
	}

	protected void func_25006_b (EntitySpidertaur par1EntityLiving, float f)
	{
	}

	@Override
	protected void preRenderCallback (EntityLivingBase par1EntityLiving, float par2)
	{
		preRenderScale ((EntitySpidertaur) par1EntityLiving, par2);
		func_25006_b ((EntitySpidertaur) par1EntityLiving, par2);
	}

	protected void preRenderScale (EntitySpidertaur par1EntitySpidertaur, float par2)
	{
//		GL11.glScalef (par1EntitySpidertaur.size_mod-0.3f,par1EntitySpidertaur.size_mod-0.3f,par1EntitySpidertaur.size_mod-0.3f);
	}


	@Override
	protected float handleRotationFloat (EntityLivingBase par1EntityLiving, float par2)
	{
		return 1.0f;
	}

	@Override
	public void doRenderLiving (EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		renderSpidertaur ((EntitySpidertaur) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender (Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		renderSpidertaur ((EntitySpidertaur) par1Entity, par2, par4, par6, par8, par9);
	}
	
	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		return TEXTURE;
	}

}
