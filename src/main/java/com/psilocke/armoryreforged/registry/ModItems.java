package com.psilocke.armoryreforged.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final RegistryObject<Item> REFORGE_HAMMER = Registration.ITEMS.register("reforge_hammer", () ->
			new Item(new Item.Properties()
				.tab(Registration.MOD_CREATIVE_TAB)
				.stacksTo(1)
				.durability(200)
			)
	);
	
	static void register() {}

}
