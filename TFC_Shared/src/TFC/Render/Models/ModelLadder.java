package TFC.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelLadder extends ModelBase
{
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;
	public ModelRenderer Shape3;
	public ModelRenderer Shape4;
	public ModelRenderer Shape5;
	public ModelRenderer Shape6;
	
	public ModelLadder()
	{
		textureWidth = 64;
		textureHeight = 32;
		
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 14, 2, 2);
		Shape1.setRotationPoint(-7F, 21F, 4F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 4);
		Shape2.addBox(0F, 0F, 0F, 14, 2, 2);
		Shape2.setRotationPoint(-7F, 17F, 4F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 8);
		Shape3.addBox(0F, 0F, 0F, 14, 2, 2);
		Shape3.setRotationPoint(-7F, 13F, 4F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 12);
		Shape4.addBox(0F, 0F, 0F, 14, 2, 2);
		Shape4.setRotationPoint(-7F, 9F, 4F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 32, 0);
		Shape5.addBox(0F, 0F, 0F, 2, 16, 2);
		Shape5.setRotationPoint(-6F, 8F, 6F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 40, 0);
		Shape6.addBox(0F, 0F, 0F, 2, 16, 2);
		Shape6.setRotationPoint(4F, 8F, 6F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
	}
	
	public void renderModel(float f5)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
