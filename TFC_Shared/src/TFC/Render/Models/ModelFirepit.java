package TFC.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelFirepit extends ModelBase
{
	public ModelRenderer Bottom1;
	public ModelRenderer Bottom2;
	public ModelRenderer Layer1;
	public ModelRenderer Layer2;
	public ModelRenderer Log1;
	public ModelRenderer Log2;
	public ModelRenderer Log3;
	public ModelRenderer Log4;
	public ModelRenderer Shape1;
	public ModelRenderer Shape2;
	public ModelRenderer Shape3;
	public ModelRenderer Shape4;
	
	public ModelFirepit()
	{
		textureWidth = 128;
		textureHeight = 64;

		Bottom1 = new ModelRenderer(this, 0, 0);
		Bottom1.addBox(0F, 0F, 0F, 10, 1, 14);
		Bottom1.setRotationPoint(-5F, 23F, -7F);
		Bottom1.setTextureSize(128, 64);
		Bottom1.mirror = true;
		setRotation(Bottom1, 0F, 0F, 0F);
		Bottom2 = new ModelRenderer(this, 0, 21);
		Bottom2.addBox(0F, 0F, 0F, 14, 1, 10);
		Bottom2.setRotationPoint(-7F, 23F, -5F);
		Bottom2.setTextureSize(128, 64);
		Bottom2.mirror = true;
		setRotation(Bottom2, 0F, 0F, 0F);
		Layer1 = new ModelRenderer(this, 0, 40);
		Layer1.addBox(0F, 0F, 0F, 10, 1, 10);
		Layer1.setRotationPoint(-5F, 22F, -5F);
		Layer1.setTextureSize(128, 64);
		Layer1.mirror = true;
		setRotation(Layer1, 0F, 0F, 0F);
		Layer2 = new ModelRenderer(this, 0, 54);
		Layer2.addBox(0F, 0F, 0F, 6, 1, 6);
		Layer2.setRotationPoint(-3F, 21F, -3F);
		Layer2.setTextureSize(128, 64);
		Layer2.mirror = true;
		setRotation(Layer2, 0F, 0F, 0F);
		Log1 = new ModelRenderer(this, 50, 0);
		Log1.addBox(0F, 0F, 0F, 4, 11, 3);
		Log1.setRotationPoint(0F, 20F, 5F);
		Log1.setTextureSize(128, 64);
		Log1.mirror = true;
		setRotation(Log1, -1.449966F, -0.1115358F, 0F);
		Log2 = new ModelRenderer(this, 50, 15);
		Log2.addBox(0F, 0F, 0F, 4, 11, 3);
		Log2.setRotationPoint(-4F, 17F, 4F);
		Log2.setTextureSize(128, 64);
		Log2.mirror = true;
		setRotation(Log2, -1.189716F, 0.3346075F, 0F);
		Log3 = new ModelRenderer(this, 50, 31);
		Log3.addBox(0F, 0F, 0F, 4, 11, 3);
		Log3.setRotationPoint(-5F, 15F, -2F);
		Log3.setTextureSize(128, 64);
		Log3.mirror = true;
		setRotation(Log3, -1.189716F, -1.003822F, -0.2974289F);
		Log4 = new ModelRenderer(this, 50, 47);
		Log4.addBox(0F, 0F, 0F, 4, 11, 3);
		Log4.setRotationPoint(4F, 12F, -4F);
		Log4.setTextureSize(128, 64);
		Log4.mirror = true;
		setRotation(Log4, -0.9666439F, -2.862753F, -0.2974289F);
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape1.setRotationPoint(5F, 23F, 5F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape2.setRotationPoint(5F, 23F, -6F);
		Shape2.setTextureSize(128, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape3.setRotationPoint(-6F, 23F, 5F);
		Shape3.setTextureSize(128, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape4.setRotationPoint(-6F, 23F, -6F);
		Shape4.setTextureSize(128, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
	}
	
	public void renderModel(float f5, boolean l1, boolean l2, boolean l3, boolean l4)
	{
		Bottom1.render(f5);
		Bottom2.render(f5);
		Layer1.render(f5);
		Layer2.render(f5);
		if (l1) Log1.render(f5);
		if (l2) Log2.render(f5);
		if (l3) Log3.render(f5);
		if (l4) Log4.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
