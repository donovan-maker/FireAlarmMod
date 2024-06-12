package com.donovan.firealarmmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

import com.donovan.firealarmmod.init.FireAlarmModModItems;

public class FireClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == FireAlarmModModItems.PULLSTATION_KEY.get()) {
			world.setBlock(BlockPos.containing(new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:XText") ? ((EditBox) guistate.get("text:XText")).getValue() : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:YText") ? ((EditBox) guistate.get("text:YText")).getValue() : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:ZText") ? ((EditBox) guistate.get("text:ZText")).getValue() : "")), Blocks.AIR.defaultBlockState(), 3);
		} else {
			world.setBlock(BlockPos.containing(new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:XText") ? ((EditBox) guistate.get("text:XText")).getValue() : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:YText") ? ((EditBox) guistate.get("text:YText")).getValue() : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(guistate.containsKey("text:ZText") ? ((EditBox) guistate.get("text:ZText")).getValue() : "")), Blocks.REDSTONE_BLOCK.defaultBlockState(), 3);
		}
	}
}
