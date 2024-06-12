package com.donovan.firealarmmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import com.donovan.firealarmmod.world.inventory.PullstationGUIMenu;
import com.donovan.firealarmmod.network.PullstationGUIButtonMessage;
import com.donovan.firealarmmod.FireAlarmModMod;

public class PullstationGUIScreen extends AbstractContainerScreen<PullstationGUIMenu> {
	private final static HashMap<String, Object> guistate = PullstationGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox XText;
	EditBox YText;
	EditBox ZText;
	Button button_fire;

	public PullstationGUIScreen(PullstationGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fire_alarm_mod:textures/screens/pullstation_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		XText.render(guiGraphics, mouseX, mouseY, partialTicks);
		YText.render(guiGraphics, mouseX, mouseY, partialTicks);
		ZText.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (XText.isFocused())
			return XText.keyPressed(key, b, c);
		if (YText.isFocused())
			return YText.keyPressed(key, b, c);
		if (ZText.isFocused())
			return ZText.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		XText.tick();
		YText.tick();
		ZText.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fire_alarm_mod.pullstation_gui.label_coordinates_of_redstone_block"), 5, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		XText = new EditBox(this.font, this.leftPos + 28, this.topPos + 35, 118, 18, Component.translatable("gui.fire_alarm_mod.pullstation_gui.XText")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.XText").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.XText").getString());
				else
					setSuggestion(null);
			}
		};
		XText.setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.XText").getString());
		XText.setMaxLength(32767);
		guistate.put("text:XText", XText);
		this.addWidget(this.XText);
		YText = new EditBox(this.font, this.leftPos + 28, this.topPos + 67, 118, 18, Component.translatable("gui.fire_alarm_mod.pullstation_gui.YText")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.YText").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.YText").getString());
				else
					setSuggestion(null);
			}
		};
		YText.setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.YText").getString());
		YText.setMaxLength(32767);
		guistate.put("text:YText", YText);
		this.addWidget(this.YText);
		ZText = new EditBox(this.font, this.leftPos + 27, this.topPos + 104, 118, 18, Component.translatable("gui.fire_alarm_mod.pullstation_gui.ZText")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.ZText").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.ZText").getString());
				else
					setSuggestion(null);
			}
		};
		ZText.setSuggestion(Component.translatable("gui.fire_alarm_mod.pullstation_gui.ZText").getString());
		ZText.setMaxLength(32767);
		guistate.put("text:ZText", ZText);
		this.addWidget(this.ZText);
		button_fire = Button.builder(Component.translatable("gui.fire_alarm_mod.pullstation_gui.button_fire"), e -> {
			if (true) {
				FireAlarmModMod.PACKET_HANDLER.sendToServer(new PullstationGUIButtonMessage(0, x, y, z));
				PullstationGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 62, this.topPos + 134, 46, 20).build();
		guistate.put("button:button_fire", button_fire);
		this.addRenderableWidget(button_fire);
	}
}
