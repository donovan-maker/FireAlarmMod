
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.donovan.firealarmmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.donovan.firealarmmod.client.gui.PullstationGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FireAlarmModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FireAlarmModModMenus.PULLSTATION_GUI.get(), PullstationGUIScreen::new);
		});
	}
}
