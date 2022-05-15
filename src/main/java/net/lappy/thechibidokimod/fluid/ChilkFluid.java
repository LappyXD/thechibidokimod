
package net.lappy.thechibidokimod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.lappy.thechibidokimod.init.TheChibidokiModModItems;
import net.lappy.thechibidokimod.init.TheChibidokiModModFluids;
import net.lappy.thechibidokimod.init.TheChibidokiModModBlocks;

public abstract class ChilkFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TheChibidokiModModFluids.CHILK,
			TheChibidokiModModFluids.FLOWING_CHILK,
			FluidAttributes.builder(new ResourceLocation("the_chibidoki_mod:blocks/udha"), new ResourceLocation("the_chibidoki_mod:blocks/udha"))

	).explosionResistance(100f)

			.bucket(TheChibidokiModModItems.CHILK_BUCKET).block(() -> (LiquidBlock) TheChibidokiModModBlocks.CHILK.get());

	private ChilkFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ChilkFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ChilkFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
