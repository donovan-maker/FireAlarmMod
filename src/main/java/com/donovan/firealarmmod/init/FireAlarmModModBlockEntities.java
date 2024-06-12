
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.donovan.firealarmmod.block.entity.PullstationWBlockEntity;
import com.donovan.firealarmmod.block.entity.PullstationNBlockEntity;
import com.donovan.firealarmmod.block.entity.PullstationEBlockEntity;
import com.donovan.firealarmmod.block.entity.PullstationBlockEntity;
import com.donovan.firealarmmod.FireAlarmModMod;

public class FireAlarmModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FireAlarmModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PULLSTATION = register("pullstation", FireAlarmModModBlocks.PULLSTATION, PullstationBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PULLSTATION_W = register("pullstation_w", FireAlarmModModBlocks.PULLSTATION_W, PullstationWBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PULLSTATION_N = register("pullstation_n", FireAlarmModModBlocks.PULLSTATION_N, PullstationNBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PULLSTATION_E = register("pullstation_e", FireAlarmModModBlocks.PULLSTATION_E, PullstationEBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
