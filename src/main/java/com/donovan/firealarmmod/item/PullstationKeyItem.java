
package com.donovan.firealarmmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PullstationKeyItem extends Item {
	public PullstationKeyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
