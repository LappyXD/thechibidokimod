
package net.lappy.thechibidokimod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.lappy.thechibidokimod.init.TheChibidokiModModFluids;

public class ChilkItem extends BucketItem {
	public ChilkItem() {
		super(TheChibidokiModModFluids.CHILK,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
