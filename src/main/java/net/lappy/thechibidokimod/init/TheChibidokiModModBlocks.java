
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lappy.thechibidokimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.lappy.thechibidokimod.block.ChilkBlock;
import net.lappy.thechibidokimod.block.ChibidimensionPortalBlock;
import net.lappy.thechibidokimod.TheChibidokiModMod;

public class TheChibidokiModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheChibidokiModMod.MODID);
	public static final RegistryObject<Block> CHILK = REGISTRY.register("chilk", () -> new ChilkBlock());
	public static final RegistryObject<Block> CHIBIDIMENSION_PORTAL = REGISTRY.register("chibidimension_portal",
			() -> new ChibidimensionPortalBlock());
}
