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
	
	public static final RegistryObject<Item> BLAST_BRICK = Registration.ITEMS.register("blast_brick", () ->
			new Item(new Item.Properties()
					.tab(Registration.MOD_CREATIVE_TAB)
					.stacksTo(64)
			)
	);
	
	public static final RegistryObject<Item> GROUT = Registration.ITEMS.register("grout", () ->
	new Item(new Item.Properties()
			.tab(Registration.MOD_CREATIVE_TAB)
			.stacksTo(64)
	)
);
	
	static void register() {}

}
