package com.psilocke.armoryreforged.registry;

import com.psilocke.armoryreforged.ArmoryReforged;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
	
	public static final class Blocks {

		private static TagKey<Block> forge(String path) {
			return BlockTags.create(new ResourceLocation("forge", path));
		}
		
		private static TagKey<Block> mod(String path) {
			return BlockTags.create(new ResourceLocation(ArmoryReforged.MOD_ID, path));
		}
	}
    
	public static final class Items {
		public static final TagKey<Item> TOOL_HAMMER = forge("tools/hammer");

		private static TagKey<Item> forge(String path) {
			return ItemTags.create(new ResourceLocation("forge", path));
		}
		
		private static TagKey<Item> mod(String path) {
			return ItemTags.create(new ResourceLocation(ArmoryReforged.MOD_ID, path));
		}
	}
}