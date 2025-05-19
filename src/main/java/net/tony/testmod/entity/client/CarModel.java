package net.tony.testmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.tony.testmod.entity.custom.CarEntity;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class CarModel<T extends CarEntity> extends SinglePartEntityModel<T> {
	private final ModelPart car;

	public CarModel(ModelPart root) {
		this.car = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(-2, -2).cuboid(-4.0F, -2.0F, -5.0F, 8.0F, 2.0F, 13.0F, new Dilation(0.0F))
		.uv(-2, 17).cuboid(-4.0F, -4.0F, -2.0F, 8.0F, 2.0F, 7.0F, new Dilation(0.0F))
		.uv(3, 0).cuboid(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData underhood_r1 = bb_main.addChild("underhood_r1", ModelPartBuilder.create().uv(0, 25).cuboid(-4.0F, 3.0F, -4.0F, 8.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -7.0F, 5.0F, 0.2182F, 3.1416F, 0.0F));

		ModelPartData back_r1 = bb_main.addChild("back_r1", ModelPartBuilder.create().uv(2, 15).cuboid(-4.0F, 5.0F, -2.0F, 8.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -8.0F, -4.0F, 0.3927F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(CarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		car.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return car;
	}
}