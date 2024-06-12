
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.donovan.firealarmmod.world.inventory.PullstationGUIMenu;
import com.donovan.firealarmmod.FireAlarmModMod;

public class FireAlarmModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FireAlarmModMod.MODID);
	public static final RegistryObject<MenuType<PullstationGUIMenu>> PULLSTATION_GUI = REGISTRY.register("pullstation_gui", () -> IForgeMenuType.create(PullstationGUIMenu::new));
}
