package com.psilocke.armoryreforged.registry;

import com.psilocke.armoryreforged.ArmoryReforged;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag.Named;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
	
	public static final class Blocks {

		private static Named<Block> forge(String path) {
			return BlockTags.bind(new ResourceLocation("forge", path).toString());
		}
		
		private static Named<Block> mod(String path) {
			return BlockTags.bind(new ResourceLocation(ArmoryReforged.MOD_ID, path).toString());
		}
	}
    
	public static final class Items {
		public static final Named<Item> TOOL_HAMMER = forge("tools/hammer");

		private static Named<Item> forge(String path) {
			return ItemTags.bind(new ResourceLocation("forge", path).toString());
		}
		
		private static Named<Item> mod(String path) {
			return ItemTags.bind(new ResourceLocation(ArmoryReforged.MOD_ID, path).toString());
		}
	}
}