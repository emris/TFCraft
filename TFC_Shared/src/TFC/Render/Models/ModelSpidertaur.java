package TFC.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSpidertaur extends ModelBase
{
	//fields
	ModelRenderer HeadTop1;
	ModelRenderer HeadTop2;
	ModelRenderer Head;
	ModelRenderer Nose;
	ModelRenderer ClawR1;
	ModelRenderer ClawR2;
	ModelRenderer ClawL1;
	ModelRenderer ClawL2;
	ModelRenderer Neck;
	ModelRenderer BodyFront;
	ModelRenderer BodyMiddle;
	ModelRenderer BodyBack1;
	ModelRenderer BodyBack2;
	ModelRenderer BodyBack3;
	ModelRenderer BodyBack4;
	ModelRenderer BodyBack5;
	ModelRenderer LegLFront1;
	ModelRenderer LegLFront2;
	ModelRenderer LegLMid1a;
	ModelRenderer LegLMid2a;
	ModelRenderer LegLMid1b;
	ModelRenderer LegLMid2b;
	ModelRenderer LegLBack1;
	ModelRenderer LegLBack2;
	ModelRenderer LegRFront1;
	ModelRenderer LegRFront2;
	ModelRenderer LegRMid1;
	ModelRenderer LegRMid2;
	ModelRenderer LegRMid1b;
	ModelRenderer LegRBack1;
	ModelRenderer LegRBack2;
	ModelRenderer ArmL1;
	ModelRenderer ArmL2;
	ModelRenderer ArmR1;
	ModelRenderer ArmR2;
	ModelRenderer LegRMid2b;
	
	public ModelSpidertaur()
	{
		textureWidth = 128;
		textureHeight = 128;

		HeadTop1 = new ModelRenderer(this, 28, 30);
		HeadTop1.addBox(-2F, 0F, -2F, 4, 2, 5);
		HeadTop1.setRotationPoint(0F, -1F, -9F);
		HeadTop1.setTextureSize(128, 128);
		HeadTop1.mirror = true;
		setRotation(HeadTop1, -3.141593F, 0F, 0F);
		
		HeadTop2 = new ModelRenderer(this, 7, 18);
		HeadTop2.addBox(-1F, 0F, -2F, 2, 2, 3);
		HeadTop2.setRotationPoint(0F, -3F, -10F);
		HeadTop2.setTextureSize(128, 128);
		HeadTop2.mirror = true;
		setRotation(HeadTop2, -3.141593F, 0F, 0F);
		
		Head = new ModelRenderer(this, 40, 38);
		Head.addBox(-3F, 0F, -3F, 6, 6, 6);
		Head.setRotationPoint(0F, 5F, -10F);
		Head.setTextureSize(128, 128);
		Head.mirror = true;
		setRotation(Head, -3.141593F, 0F, 0F);
		
		Nose = new ModelRenderer(this, 0, 13);
		Nose.addBox(0F, 0F, 0F, 4, 2, 1);
		Nose.setRotationPoint(-2F, 2F, -14F);
		Nose.setTextureSize(128, 128);
		Nose.mirror = true;
		setRotation(Nose, 0F, 0F, 0F);
		
		ClawR1 = new ModelRenderer(this, 20, 0);
		ClawR1.addBox(-1F, 0F, -1F, 2, 16, 2);
		ClawR1.setRotationPoint(-1F, 4F, -13F);
		ClawR1.setTextureSize(128, 128);
		ClawR1.mirror = true;
		setRotation(ClawR1, -0.0872665F, 0F, 0.0698132F);
		
		ClawR2 = new ModelRenderer(this, 0, 18);
		ClawR2.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		ClawR2.setRotationPoint(-2F, 19F, -14.8F);
		ClawR2.setTextureSize(128, 128);
		ClawR2.mirror = true;
		setRotation(ClawR2, 0.418879F, 0F, 0.0698132F);
		
		ClawL1 = new ModelRenderer(this, 20, 0);
		ClawL1.addBox(-1F, 0F, -1F, 2, 16, 2);
		ClawL1.setRotationPoint(1F, 4F, -13F);
		ClawL1.setTextureSize(128, 128);
		ClawL1.mirror = true;
		setRotation(ClawL1, -0.0872665F, 0F, -0.0698132F);
		
		ClawL2 = new ModelRenderer(this, 0, 18);
		ClawL2.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		ClawL2.setRotationPoint(2F, 19F, -14.8F);
		ClawL2.setTextureSize(128, 128);
		ClawL2.mirror = true;
		setRotation(ClawL2, 0.418879F, 0F, -0.0698132F);
		
		Neck = new ModelRenderer(this, 23, 38);
		Neck.addBox(-2F, 0F, -2F, 4, 15, 4);
		Neck.setRotationPoint(0F, 19F, -10F);
		Neck.setTextureSize(128, 128);
		Neck.mirror = true;
		setRotation(Neck, -3.141593F, 0F, 0F);
		
		BodyFront = new ModelRenderer(this, 0, 25);
		BodyFront.addBox(0F, 0F, 0F, 6, 6, 6);
		BodyFront.setRotationPoint(-3F, 17F, -12F);
		BodyFront.setTextureSize(128, 128);
		BodyFront.mirror = true;
		setRotation(BodyFront, 0F, 0F, 0F);
		
		BodyMiddle = new ModelRenderer(this, 0, 38);
		BodyMiddle.addBox(0F, 0F, 0F, 4, 4, 7);
		BodyMiddle.setRotationPoint(-2F, 18F, -6F);
		BodyMiddle.setTextureSize(128, 128);
		BodyMiddle.mirror = true;
		setRotation(BodyMiddle, 0F, 0F, 0F);
		
		BodyBack1 = new ModelRenderer(this, 48, 51);
		BodyBack1.addBox(0F, 0F, 0F, 6, 6, 2);
		BodyBack1.setRotationPoint(-3F, 17F, 0F);
		BodyBack1.setTextureSize(128, 128);
		BodyBack1.mirror = true;
		setRotation(BodyBack1, 0F, 0F, 0F);
		
		BodyBack2 = new ModelRenderer(this, 0, 60);
		BodyBack2.addBox(0F, 0F, 0F, 8, 8, 8);
		BodyBack2.setRotationPoint(-4F, 16F, 2F);
		BodyBack2.setTextureSize(128, 128);
		BodyBack2.mirror = true;
		setRotation(BodyBack2, 0F, 0F, 0F);
		
		BodyBack3 = new ModelRenderer(this, 0, 50);
		BodyBack3.addBox(0F, 0F, 0F, 6, 6, 2);
		BodyBack3.setRotationPoint(-3F, 17F, 10F);
		BodyBack3.setTextureSize(128, 128);
		BodyBack3.mirror = true;
		setRotation(BodyBack3, 0F, 0F, 0F);
		
		BodyBack4 = new ModelRenderer(this, 0, 0);
		BodyBack4.addBox(0F, 0F, 0F, 4, 2, 4);
		BodyBack4.setRotationPoint(-2F, 14F, 4F);
		BodyBack4.setTextureSize(128, 128);
		BodyBack4.mirror = true;
		setRotation(BodyBack4, 0F, 0F, 0F);
		
		BodyBack5 = new ModelRenderer(this, 0, 7);
		BodyBack5.addBox(0F, 0F, 0F, 2, 2, 2);
		BodyBack5.setRotationPoint(-1F, 12F, 5F);
		BodyBack5.setTextureSize(128, 128);
		BodyBack5.mirror = true;
		setRotation(BodyBack5, 0F, 0F, 0F);
		
		LegLFront1 = new ModelRenderer(this, 47, 0);
		LegLFront1.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegLFront1.setRotationPoint(2F, 21F, -8F);
		LegLFront1.setTextureSize(128, 128);
		LegLFront1.mirror = true;
		setRotation(LegLFront1, 0F, 0.4014257F, -2.635447F);
		
		LegLFront2 = new ModelRenderer(this, 56, 0);
		LegLFront2.addBox(-1F, 0F, -1F, 2, 29, 2);
		LegLFront2.setRotationPoint(12F, 2F, -12.2F);
		LegLFront2.setTextureSize(128, 128);
		LegLFront2.mirror = true;
		setRotation(LegLFront2, 0F, 0.4014257F, -0.7504916F);
		
		LegLMid1a = new ModelRenderer(this, 74, 0);
		LegLMid1a.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegLMid1a.setRotationPoint(1.5F, 21F, -5F);
		LegLMid1a.setTextureSize(128, 128);
		LegLMid1a.mirror = true;
		setRotation(LegLMid1a, 0F, 0F, -2.443461F);
		
		LegLMid2a = new ModelRenderer(this, 38, 0);
		LegLMid2a.addBox(-1F, 0F, -1F, 2, 24, 2);
		LegLMid2a.setRotationPoint(15.5F, 4.5F, -5F);
		LegLMid2a.setTextureSize(128, 128);
		LegLMid2a.mirror = true;
		setRotation(LegLMid2a, 0F, 0F, -0.6632251F);
		
		LegLMid1b = new ModelRenderer(this, 92, 0);
		LegLMid1b.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegLMid1b.setRotationPoint(1.5F, 21F, -2F);
		LegLMid1b.setTextureSize(128, 128);
		LegLMid1b.mirror = true;
		setRotation(LegLMid1b, 0F, 0F, -2.617994F);
		
		LegLMid2b = new ModelRenderer(this, 83, 0);
		LegLMid2b.addBox(-1F, 0F, -1F, 2, 24, 2);
		LegLMid2b.setRotationPoint(13F, 2F, -2F);
		LegLMid2b.setTextureSize(128, 128);
		LegLMid2b.mirror = true;
		setRotation(LegLMid2b, 0F, 0F, -0.4537856F);
		
		LegLBack1 = new ModelRenderer(this, 65, 0);
		LegLBack1.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegLBack1.setRotationPoint(1F, 21F, 0F);
		LegLBack1.setTextureSize(128, 128);
		LegLBack1.mirror = true;
		setRotation(LegLBack1, 0F, -0.3141593F, -2.443461F);
		
		LegLBack2 = new ModelRenderer(this, 29, 0);
		LegLBack2.addBox(-1F, 0F, -1F, 2, 26, 2);
		LegLBack2.setRotationPoint(14F, 4.5F, 4.2F);
		LegLBack2.setTextureSize(128, 128);
		LegLBack2.mirror = true;
		setRotation(LegLBack2, 0F, -0.3141593F, -0.7679449F);
		
		LegRFront1 = new ModelRenderer(this, 47, 0);
		LegRFront1.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegRFront1.setRotationPoint(-2F, 21F, -8F);
		LegRFront1.setTextureSize(128, 128);
		LegRFront1.mirror = true;
		setRotation(LegRFront1, 0F, -0.3141593F, 2.378502F);
		
		LegRFront2 = new ModelRenderer(this, 56, 0);
		LegRFront2.addBox(-1F, 0F, -1F, 2, 29, 2);
		LegRFront2.setRotationPoint(-16.5F, 5.5F, -12.7F);
		LegRFront2.setTextureSize(128, 128);
		LegRFront2.mirror = true;
		setRotation(LegRFront2, 0F, -0.3141593F, 0.9050926F);
		
		LegRMid1 = new ModelRenderer(this, 74, 0);
		LegRMid1.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegRMid1.setRotationPoint(-1.5F, 20F, -5F);
		LegRMid1.setTextureSize(128, 128);
		LegRMid1.mirror = true;
		setRotation(LegRMid1, 0F, 0F, 2.426937F);
		
		LegRMid2 = new ModelRenderer(this, 38, 0);
		LegRMid2.addBox(-1F, 0F, -1F, 2, 24, 2);
		LegRMid2.setRotationPoint(-16.5F, 3.5F, -5F);
		LegRMid2.setTextureSize(128, 128);
		LegRMid2.mirror = true;
		setRotation(LegRMid2, 0F, 0F, 0.5856664F);
		
		LegRMid1b = new ModelRenderer(this, 92, 0);
		LegRMid1b.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegRMid1b.setRotationPoint(-1.5F, 20F, -2F);
		LegRMid1b.setTextureSize(128, 128);
		LegRMid1b.mirror = true;
		setRotation(LegRMid1b, 0F, 0F, 2.566564F);
		
		LegRBack1 = new ModelRenderer(this, 65, 0);
		LegRBack1.addBox(-1F, 0F, -1F, 2, 22, 2);
		LegRBack1.setRotationPoint(-1F, 20F, 0F);
		LegRBack1.setTextureSize(128, 128);
		LegRBack1.mirror = true;
		setRotation(LegRBack1, 0F, 0.4014257F, 2.445113F);
		
		LegRBack2 = new ModelRenderer(this, 29, 0);
		LegRBack2.addBox(-1F, 0F, -1F, 2, 26, 2);
		LegRBack2.setRotationPoint(-14F, 3F, 5.5F);
		LegRBack2.setTextureSize(128, 128);
		LegRBack2.mirror = true;
		setRotation(LegRBack2, 0F, 0.4014257F, 0.6645677F);
		
		ArmL1 = new ModelRenderer(this, 48, 35);
		ArmL1.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		ArmL1.setRotationPoint(3F, 19F, -11F);
		ArmL1.setTextureSize(128, 128);
		ArmL1.mirror = true;
		setRotation(ArmL1, 0F, 0.7853982F, 0F);
		
		ArmL2 = new ModelRenderer(this, 52, 32);
		ArmL2.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		ArmL2.setRotationPoint(8F, 19F, -16F);
		ArmL2.setTextureSize(128, 128);
		ArmL2.mirror = true;
		setRotation(ArmL2, 0F, 2.094395F, 0F);
		
		ArmR1 = new ModelRenderer(this, 48, 35);
		ArmR1.addBox(0F, -0.5F, -0.5F, 7, 1, 1);
		ArmR1.setRotationPoint(-3F, 19F, -11F);
		ArmR1.setTextureSize(128, 128);
		ArmR1.mirror = true;
		setRotation(ArmR1, 0F, 2.356194F, 0F);
		
		ArmR2 = new ModelRenderer(this, 52, 32);
		ArmR2.addBox(0F, -0.5F, -0.5F, 5, 1, 1);
		ArmR2.setRotationPoint(-8F, 19F, -16F);
		ArmR2.setTextureSize(128, 128);
		ArmR2.mirror = true;
		setRotation(ArmR2, 0F, 1.151917F, 0F);
		
		LegRMid2b = new ModelRenderer(this, 83, 0);
		LegRMid2b.addBox(-1F, 0F, -1F, 2, 24, 2);
		LegRMid2b.setRotationPoint(-14F, 2F, -2F);
		LegRMid2b.setTextureSize(128, 128);
		LegRMid2b.mirror = true;
		setRotation(LegRMid2b, 0F, 0F, 0.4460401F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		HeadTop1.render(f5);
		HeadTop2.render(f5);
		Head.render(f5);
		Nose.render(f5);
		ClawR1.render(f5);
		ClawR2.render(f5);
		ClawL1.render(f5);
		ClawL2.render(f5);
		Neck.render(f5);
		BodyFront.render(f5);
		BodyMiddle.render(f5);
		BodyBack1.render(f5);
		BodyBack2.render(f5);
		BodyBack3.render(f5);
		BodyBack4.render(f5);
		BodyBack5.render(f5);
		LegLFront1.render(f5);
		LegLFront2.render(f5);
		LegLMid1a.render(f5);
		LegLMid2a.render(f5);
		LegLMid1b.render(f5);
		LegLMid2b.render(f5);
		LegLBack1.render(f5);
		LegLBack2.render(f5);
		LegRFront1.render(f5);
		LegRFront2.render(f5);
		LegRMid1.render(f5);
		LegRMid2.render(f5);
		LegRMid1b.render(f5);
		LegRBack1.render(f5);
		LegRBack2.render(f5);
		ArmL1.render(f5);
		ArmL2.render(f5);
		ArmR1.render(f5);
		ArmR2.render(f5);
		LegRMid2b.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}
