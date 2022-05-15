
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lappy.thechibidokimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.lappy.thechibidokimod.world.biome.ChibibiomeBiome;
import net.lappy.thechibidokimod.TheChibidokiModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheChibidokiModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TheChibidokiModMod.MODID);
	public static final RegistryObject<Biome> CHIBIBIOME = REGISTRY.register("chibibiome", () -> ChibibiomeBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ChibibiomeBiome.init();
		});
	}
}
