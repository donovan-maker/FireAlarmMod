
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.donovan.firealarmmod.item.PullstationKeyItem;
import com.donovan.firealarmmod.FireAlarmModMod;

public class FireAlarmModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FireAlarmModMod.MODID);
	public static final RegistryObject<Item> FIRE_ALARM = block(FireAlarmModModBlocks.FIRE_ALARM);
	public static final RegistryObject<Item> PULLSTATION_KEY = REGISTRY.register("pullstation_key", () -> new PullstationKeyItem());
	public static final RegistryObject<Item> PULLSTATION = block(FireAlarmModModBlocks.PULLSTATION);
	public static final RegistryObject<Item> PULLSTATION_W = block(FireAlarmModModBlocks.PULLSTATION_W);
	public static final RegistryObject<Item> PULLSTATION_N = block(FireAlarmModModBlocks.PULLSTATION_N);
	public static final RegistryObject<Item> PULLSTATION_E = block(FireAlarmModModBlocks.PULLSTATION_E);
	public static final RegistryObject<Item> FIRE_ALARM_W = block(FireAlarmModModBlocks.FIRE_ALARM_W);
	public static final RegistryObject<Item> FIRE_ALARM_N = block(FireAlarmModModBlocks.FIRE_ALARM_N);
	public static final RegistryObject<Item> FIRE_ALARM_E = block(FireAlarmModModBlocks.FIRE_ALARM_E);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
