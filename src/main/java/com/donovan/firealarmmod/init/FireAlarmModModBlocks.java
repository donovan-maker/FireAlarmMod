
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.donovan.firealarmmod.block.PullstationWBlock;
import com.donovan.firealarmmod.block.PullstationNBlock;
import com.donovan.firealarmmod.block.PullstationEBlock;
import com.donovan.firealarmmod.block.PullstationBlock;
import com.donovan.firealarmmod.block.FireAlarmWBlock;
import com.donovan.firealarmmod.block.FireAlarmNBlock;
import com.donovan.firealarmmod.block.FireAlarmEBlock;
import com.donovan.firealarmmod.block.FireAlarmBlock;
import com.donovan.firealarmmod.FireAlarmModMod;

public class FireAlarmModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FireAlarmModMod.MODID);
	public static final RegistryObject<Block> FIRE_ALARM = REGISTRY.register("fire_alarm", () -> new FireAlarmBlock());
	public static final RegistryObject<Block> PULLSTATION = REGISTRY.register("pullstation", () -> new PullstationBlock());
	public static final RegistryObject<Block> PULLSTATION_W = REGISTRY.register("pullstation_w", () -> new PullstationWBlock());
	public static final RegistryObject<Block> PULLSTATION_N = REGISTRY.register("pullstation_n", () -> new PullstationNBlock());
	public static final RegistryObject<Block> PULLSTATION_E = REGISTRY.register("pullstation_e", () -> new PullstationEBlock());
	public static final RegistryObject<Block> FIRE_ALARM_W = REGISTRY.register("fire_alarm_w", () -> new FireAlarmWBlock());
	public static final RegistryObject<Block> FIRE_ALARM_N = REGISTRY.register("fire_alarm_n", () -> new FireAlarmNBlock());
	public static final RegistryObject<Block> FIRE_ALARM_E = REGISTRY.register("fire_alarm_e", () -> new FireAlarmEBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
