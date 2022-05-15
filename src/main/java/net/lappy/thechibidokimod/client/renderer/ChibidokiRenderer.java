
package net.lappy.thechibidokimod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.lappy.thechibidokimod.entity.ChibidokiEntity;

public class ChibidokiRenderer extends HumanoidMobRenderer<ChibidokiEntity, HumanoidModel<ChibidokiEntity>> {
	public ChibidokiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(ChibidokiEntity entity) {
		return new ResourceLocation("the_chibidoki_mod:textures/abba1e0312bdfb9b.png");
	}
}
