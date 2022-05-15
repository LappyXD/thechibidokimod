
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.lappy.thechibidokimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.lappy.thechibidokimod.fluid.ChilkFluid;
import net.lappy.thechibidokimod.TheChibidokiModMod;

public class TheChibidokiModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TheChibidokiModMod.MODID);
	public static final RegistryObject<Fluid> CHILK = REGISTRY.register("chilk", () -> new ChilkFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CHILK = REGISTRY.register("flowing_chilk", () -> new ChilkFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CHILK.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHILK.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
