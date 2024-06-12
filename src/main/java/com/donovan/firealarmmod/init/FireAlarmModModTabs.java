
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.donovan.firealarmmod.FireAlarmModMod;

public class FireAlarmModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FireAlarmModMod.MODID);
	public static final RegistryObject<CreativeModeTab> FIRE_ALARMS = REGISTRY.register("fire_alarms",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fire_alarm_mod.fire_alarms")).icon(() -> new ItemStack(FireAlarmModModBlocks.FIRE_ALARM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FireAlarmModModBlocks.FIRE_ALARM_N.get().asItem());
				tabData.accept(FireAlarmModModBlocks.FIRE_ALARM_E.get().asItem());
				tabData.accept(FireAlarmModModBlocks.FIRE_ALARM.get().asItem());
				tabData.accept(FireAlarmModModBlocks.FIRE_ALARM_W.get().asItem());
				tabData.accept(FireAlarmModModBlocks.PULLSTATION_N.get().asItem());
				tabData.accept(FireAlarmModModBlocks.PULLSTATION_E.get().asItem());
				tabData.accept(FireAlarmModModBlocks.PULLSTATION.get().asItem());
				tabData.accept(FireAlarmModModBlocks.PULLSTATION_W.get().asItem());
				tabData.accept(FireAlarmModModItems.PULLSTATION_KEY.get());
			})

					.build());
}
