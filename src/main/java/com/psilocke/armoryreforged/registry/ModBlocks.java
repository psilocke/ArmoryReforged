package com.psilocke.armoryreforged.registry;

import java.util.function.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	
	public static final RegistryObject<Block> REFORGE_FURNACE_BLOCK = register("reforge_furnace_block", () ->
	new Block(Block.Properties.of(Material.STONE)
				.strength(1,10)
				.requiresCorrectToolForDrops()
				.sound(SoundType.STONE)
		)
	);
	
	public static final RegistryObject<Block> REFORGE_FURNACE_MULTIBLOCK_SHELL = register("reforge_furnace_multiblock_shell", () ->
			new Block(Block.Properties.of(Material.STONE)
					.strength(1,10)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE)
			)
	);
	
	public static final RegistryObject<Block> REFORGE_FURNACE_MULTIBLOCK_CORE = register("reforge_furnace_multiblock_core", () ->
			new Block(Block.Properties.of(Material.STONE)
					.strength(1,10)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE)
			)
	);
	
	
	public static void register() {}


	private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }
	
	private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(Registration.MOD_CREATIVE_TAB)));
        return ret;
    }

}
