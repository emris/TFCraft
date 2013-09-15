package TFC.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelRail extends ModelBase
{
	ModelRenderer Wood1;
	ModelRenderer Wood2;
	ModelRenderer Wood3;
	ModelRenderer Wood4;
	ModelRenderer Rail1a;
	ModelRenderer Rail1b;
	ModelRenderer Rail1c;
	ModelRenderer Rail2c;
	ModelRenderer Rail2b;
	ModelRenderer Rail2a;
	
	public ModelRail()
	{
		textureWidth = 64;
		textureHeight = 32;

		Wood1 = new ModelRenderer(this, 0, 0);
		Wood1.addBox(0F, 0F, 0F, 14, 1, 2);
		Wood1.setRotationPoint(-7F, 23F, 5F);
		Wood1.setTextureSize(64, 32);
		Wood1.mirror = true;
		setRotation(Wood1, 0F, 0F, 0F);
		
		Wood2 = new ModelRenderer(this, 0, 3);
		Wood2.addBox(0F, 0F, 0F, 14, 1, 2);
		Wood2.setRotationPoint(-7F, 23F, 1F);
		Wood2.setTextureSize(64, 32);
		Wood2.mirror = true;
		setRotation(Wood2, 0F, 0F, 0F);
		
		Wood3 = new ModelRenderer(this, 0, 6);
		Wood3.addBox(0F, 0F, 0F, 14, 1, 2);
		Wood3.setRotationPoint(-7F, 23F, -3F);
		Wood3.setTextureSize(64, 32);
		Wood3.mirror = true;
		setRotation(Wood3, 0F, 0F, 0F);
		
		Wood4 = new ModelRenderer(this, 0, 9);
		Wood4.addBox(0F, 0F, 0F, 14, 1, 2);
		Wood4.setRotationPoint(-7F, 23F, -7F);
		Wood4.setTextureSize(64, 32);
		Wood4.mirror = true;
		setRotation(Wood4, 0F, 0F, 0F);

		Rail1a = new ModelRenderer(this, 0, 13);
		Rail1a.addBox(0F, 0F, 0F, 16, 1, 2);
		Rail1a.setRotationPoint(-6F, 22F, 8F);
		Rail1a.setTextureSize(64, 32);
		Rail1a.mirror = true;
		setRotation(Rail1a, 0F, 1.570796F, 0F);
		
		Rail1b = new ModelRenderer(this, 0, 16);
		Rail1b.addBox(0F, 0F, 0F, 16, 1, 1);
		Rail1b.setRotationPoint(-5.5F, 21F, 8F);
		Rail1b.setTextureSize(64, 32);
		Rail1b.mirror = true;
		setRotation(Rail1b, 0F, 1.570796F, 0F);
		
		Rail1c = new ModelRenderer(this, 0, 18);
		Rail1c.addBox(0F, 0F, 0F, 16, 1, 2);
		Rail1c.setRotationPoint(-6F, 20F, 8F);
		Rail1c.setTextureSize(64, 32);
		Rail1c.mirror = true;
		setRotation(Rail1c, 0F, 1.570796F, 0F);
		
		Rail2c = new ModelRenderer(this, 0, 22);
		Rail2c.addBox(0F, 0F, 0F, 16, 1, 2);
		Rail2c.setRotationPoint(4F, 20F, 8F);
		Rail2c.setTextureSize(64, 32);
		Rail2c.mirror = true;
		setRotation(Rail2c, 0F, 1.570796F, 0F);
		
		Rail2b = new ModelRenderer(this, 0, 25);
		Rail2b.addBox(0F, 0F, 0F, 16, 1, 1);
		Rail2b.setRotationPoint(4.5F, 21F, 8F);
		Rail2b.setTextureSize(64, 32);
		Rail2b.mirror = true;
		setRotation(Rail2b, 0F, 1.570796F, 0F);
		
		Rail2a = new ModelRenderer(this, 0, 27);
		Rail2a.addBox(0F, 0F, 0F, 16, 1, 2);
		Rail2a.setRotationPoint(4F, 22F, 8F);
		Rail2a.setTextureSize(64, 32);
		Rail2a.mirror = true;
		setRotation(Rail2a, 0F, 1.570796F, 0F);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void renderModel(float f5)
	{
		Wood1.render(f5);
		Wood2.render(f5);
		Wood3.render(f5);
		Wood4.render(f5);
		Rail1a.render(f5);
		Rail1b.render(f5);
		Rail1c.render(f5);
		Rail2c.render(f5);
		Rail2b.render(f5);
		Rail2a.render(f5);
	}
}
