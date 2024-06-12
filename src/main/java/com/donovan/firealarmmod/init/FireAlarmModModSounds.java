
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.donovan.firealarmmod.FireAlarmModMod;

public class FireAlarmModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FireAlarmModMod.MODID);
	public static final RegistryObject<SoundEvent> FIRE_ALARM_SOUND = REGISTRY.register("fire_alarm_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fire_alarm_mod", "fire_alarm_sound")));
}
