
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lappy.thechibidokimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.lappy.thechibidokimod.item.CupofchilkItem;
import net.lappy.thechibidokimod.item.ChilkItem;
import net.lappy.thechibidokimod.item.ChibiessenceItem;
import net.lappy.thechibidokimod.item.ChibidimensionItem;
import net.lappy.thechibidokimod.item.ChibidewItem;
import net.lappy.thechibidokimod.item.ChibiSytheItem;
import net.lappy.thechibidokimod.item.ChibiFeetItem;
import net.lappy.thechibidokimod.TheChibidokiModMod;

public class TheChibidokiModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheChibidokiModMod.MODID);
	public static final RegistryObject<Item> CHILK_BUCKET = REGISTRY.register("chilk_bucket", () -> new ChilkItem());
	public static final RegistryObject<Item> CUPOFCHILK = REGISTRY.register("cupofchilk", () -> new CupofchilkItem());
	public static final RegistryObject<Item> CHIBIDOKI = REGISTRY.register("chibidoki_spawn_egg",
			() -> new ForgeSpawnEggItem(TheChibidokiModModEntities.CHIBIDOKI, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CHIBI_FEET_HELMET = REGISTRY.register("chibi_feet_helmet", () -> new ChibiFeetItem.Helmet());
	public static final RegistryObject<Item> CHIBI_FEET_CHESTPLATE = REGISTRY.register("chibi_feet_chestplate", () -> new ChibiFeetItem.Chestplate());
	public static final RegistryObject<Item> CHIBI_FEET_LEGGINGS = REGISTRY.register("chibi_feet_leggings", () -> new ChibiFeetItem.Leggings());
	public static final RegistryObject<Item> CHIBI_FEET_BOOTS = REGISTRY.register("chibi_feet_boots", () -> new ChibiFeetItem.Boots());
	public static final RegistryObject<Item> CHIBIDIMENSION = REGISTRY.register("chibidimension", () -> new ChibidimensionItem());
	public static final RegistryObject<Item> CHIBI_SYTHE = REGISTRY.register("chibi_sythe", () -> new ChibiSytheItem());
	public static final RegistryObject<Item> CHIBIESSENCE = REGISTRY.register("chibiessence", () -> new ChibiessenceItem());
	public static final RegistryObject<Item> CHIBIDEW = REGISTRY.register("chibidew", () -> new ChibidewItem());
}
