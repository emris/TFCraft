package TFC.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelReeds extends ModelBase
{
	public ModelRenderer Reed1;
	public ModelRenderer Reed1x;
	public ModelRenderer Reed2;
	public ModelRenderer Reed2x;
	public ModelRenderer Reed3;
	public ModelRenderer Reed3x;
	public ModelRenderer Reed4;
	public ModelRenderer Reed4x;
	public ModelRenderer Reed5;
	public ModelRenderer Reed5x;
	public ModelRenderer Leaf1;
	public ModelRenderer Leaf2;
	public ModelRenderer Leaf3;
	public ModelRenderer Leaf4;
	public ModelRenderer Leaf5;
	public ModelRenderer Leaf6;
	public ModelRenderer Leaf7;
	public ModelRenderer Leaf8;
	public ModelRenderer Leaf9;
	public ModelRenderer Leaf10;
	
	public ModelReeds()
	{
		textureWidth = 64;
		textureHeight = 32;
		
		Reed1 = new ModelRenderer(this, 0, 0);
		Reed1.addBox(0F, 0F, 0F, 2, 14, 2);
		Reed1.setRotationPoint(5F, 10F, 5F);
		Reed1.setTextureSize(64, 32);
		Reed1.mirror = true;
		setRotation(Reed1, 0F, 0F, 0F);
		Reed2 = new ModelRenderer(this, 8, 0);
		Reed2.addBox(0F, 0F, 0F, 2, 15, 2);
		Reed2.setRotationPoint(-7F, 9F, 5F);
		Reed2.setTextureSize(64, 32);
		Reed2.mirror = true;
		setRotation(Reed2, 0F, 0F, 0F);
		Reed3 = new ModelRenderer(this, 16, 0);
		Reed3.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed3.setRotationPoint(-1F, 8F, -1F);
		Reed3.setTextureSize(64, 32);
		Reed3.mirror = true;
		setRotation(Reed3, 0F, 0F, 0F);
		Reed4 = new ModelRenderer(this, 24, 0);
		Reed4.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed4.setRotationPoint(5F, 8F, -7F);
		Reed4.setTextureSize(64, 32);
		Reed4.mirror = true;
		setRotation(Reed4, 0F, 0F, 0F);
		Reed5 = new ModelRenderer(this, 32, 0);
		Reed5.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed5.setRotationPoint(-7F, 8F, -7F);
		Reed5.setTextureSize(64, 32);
		Reed5.mirror = true;
		setRotation(Reed5, 0F, 0F, 0F);
		Leaf1 = new ModelRenderer(this, 40, 0);
		Leaf1.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf1.setRotationPoint(-4F, 5F, 0F);
		Leaf1.setTextureSize(64, 32);
		Leaf1.mirror = true;
		setRotation(Leaf1, 0F, 0F, 0F);
		Leaf2 = new ModelRenderer(this, 0, 18);
		Leaf2.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf2.setRotationPoint(2F, 9F, 6F);
		Leaf2.setTextureSize(64, 32);
		Leaf2.mirror = true;
		setRotation(Leaf2, 0F, 0F, 0F);
		Leaf3 = new ModelRenderer(this, 17, 18);
		Leaf3.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf3.setRotationPoint(-10F, 3F, 6F);
		Leaf3.setTextureSize(64, 32);
		Leaf3.mirror = true;
		setRotation(Leaf3, 0F, 0F, 0F);
		Leaf4 = new ModelRenderer(this, 0, 18);
		Leaf4.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf4.setRotationPoint(2F, 2F, -6F);
		Leaf4.setTextureSize(64, 32);
		Leaf4.mirror = true;
		setRotation(Leaf4, 0F, 0F, 0F);
		Leaf5 = new ModelRenderer(this, 17, 18);
		Leaf5.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf5.setRotationPoint(-10F, 3F, -6F);
		Leaf5.setTextureSize(64, 32);
		Leaf5.mirror = true;
		setRotation(Leaf5, 0F, 0F, 0F);
		Leaf6 = new ModelRenderer(this, 0, 18);
		Leaf6.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf6.setRotationPoint(0F, 5F, 4F);
		Leaf6.setTextureSize(64, 32);
		Leaf6.mirror = true;
		setRotation(Leaf6, 0F, 1.570796F, 0F);
		Leaf7 = new ModelRenderer(this, 40, 10);
		Leaf7.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf7.setRotationPoint(-6F, 3F, -2F);
		Leaf7.setTextureSize(64, 32);
		Leaf7.mirror = true;
		setRotation(Leaf7, 0F, 1.570796F, 0F);
		Leaf8 = new ModelRenderer(this, 0, 18);
		Leaf8.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf8.setRotationPoint(6F, 2F, -2F);
		Leaf8.setTextureSize(64, 32);
		Leaf8.mirror = true;
		setRotation(Leaf8, 0F, 1.570796F, 0F);
		Leaf9 = new ModelRenderer(this, 40, 20);
		Leaf9.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf9.setRotationPoint(-6F, 3F, 10F);
		Leaf9.setTextureSize(64, 32);
		Leaf9.mirror = true;
		setRotation(Leaf9, 0F, 1.570796F, 0F);
		Leaf10 = new ModelRenderer(this, 40, 10);
		Leaf10.addBox(0F, 0F, 0F, 8, 9, 0);
		Leaf10.setRotationPoint(6F, 9F, 10F);
		Leaf10.setTextureSize(64, 32);
		Leaf10.mirror = true;
		setRotation(Leaf10, 0F, 1.570796F, 0F);
		
		Reed1x = new ModelRenderer(this, 0, 0);
		Reed1x.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed1x.setRotationPoint(5F, 8F, 5F);
		Reed1x.setTextureSize(64, 32);
		Reed1x.mirror = true;
		setRotation(Reed1x, 0F, 0F, 0F);
		Reed2x = new ModelRenderer(this, 8, 0);
		Reed2x.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed2x.setRotationPoint(-7F, 8F, 5F);
		Reed2x.setTextureSize(64, 32);
		Reed2x.mirror = true;
		setRotation(Reed2x, 0F, 0F, 0F);
		Reed3x = new ModelRenderer(this, 16, 0);
		Reed3x.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed3x.setRotationPoint(-1F, 8F, -1F);
		Reed3x.setTextureSize(64, 32);
		Reed3x.mirror = true;
		setRotation(Reed3x, 0F, 0F, 0F);
		Reed4x = new ModelRenderer(this, 24, 0);
		Reed4x.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed4x.setRotationPoint(5F, 8F, -7F);
		Reed4x.setTextureSize(64, 32);
		Reed4x.mirror = true;
		setRotation(Reed4x, 0F, 0F, 0F);
		Reed5x = new ModelRenderer(this, 32, 0);
		Reed5x.addBox(0F, 0F, 0F, 2, 16, 2);
		Reed5x.setRotationPoint(-7F, 8F, -7F);
		Reed5x.setTextureSize(64, 32);
		Reed5x.mirror = true;
		setRotation(Reed5x, 0F, 0F, 0F);
	}
	
//	@Override
//	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
//	{
//		super.render(entity, f, f1, f2, f3, f4, f5);
//		setRotationAngles(f, f1, f2, f3, f4, f5);
//		Reed1.render(f5);
//		Reed2.render(f5);
//		Reed3.render(f5);
//		Reed4.render(f5);
//		Reed5.render(f5);
//		Leaf1.render(f5);
//		Leaf2.render(f5);
//		Leaf3.render(f5);
//		Leaf4.render(f5);
//		Leaf5.render(f5);
//		Leaf6.render(f5);
//		Leaf7.render(f5);
//		Leaf8.render(f5);
//		Leaf9.render(f5);
//		Leaf10.render(f5);
//	}
	
	public void renderModel(float f5, boolean top)
	{
		if (top)
		{
			Reed1.render(f5);
			Reed2.render(f5);
			Reed3.render(f5);
			Reed4.render(f5);
			Reed5.render(f5);
			Leaf1.render(f5);
			Leaf2.render(f5);
			Leaf3.render(f5);
			Leaf4.render(f5);
			Leaf5.render(f5);
			Leaf6.render(f5);
			Leaf7.render(f5);
			Leaf8.render(f5);
			Leaf9.render(f5);
			Leaf10.render(f5);
		}
		else
		{
			Reed1x.render(f5);
			Reed2x.render(f5);
			Reed3x.render(f5);
			Reed4x.render(f5);
			Reed5x.render(f5);
		}
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
//	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
//	{
//		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
//	}
}
