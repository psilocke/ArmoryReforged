package com.psilocke.armoryreforged.datagen;

import net.minecraft.data.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import com.psilocke.armoryreforged.ArmoryReforged;
import com.psilocke.armoryreforged.registry.ModBlocks;
import com.psilocke.armoryreforged.registry.ModItems;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }
    
    @Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
    	ShapelessRecipeBuilder.shapeless(ModItems.GROUT.get(), 4)
		        .requires(Blocks.SAND)
		        .requires(Blocks.GRAVEL)
		        .requires(Items.CLAY_BALL, 2)
		        .unlockedBy("has_item", has(Items.CLAY_BALL))
		        .save(consumer);
		
		ShapedRecipeBuilder.shaped(ModItems.REFORGE_HAMMER.get())
		        .define('#', Blocks.IRON_BLOCK)
		        .define('%', Items.STICK)
		        .define('@', Items.LEATHER)
		        .pattern(" #%")
		        .pattern("@%#")
		        .pattern("%@ ")
		        .unlockedBy("has_item", has(Items.IRON_SWORD))
		        .save(consumer);

    	ShapedRecipeBuilder.shaped(ModBlocks.BLAST_BRICK_BLOCK.get())
    			.define('#', ModItems.BLAST_BRICK.get())
    			.pattern("##")
    			.pattern("##")
    			.unlockedBy("has_item", has(Items.CLAY_BALL))
    			.save(consumer);
		
		ShapedRecipeBuilder.shaped(ModBlocks.REFORGE_FURNACE_BLOCK.get())
		        .define('#', ModItems.BLAST_BRICK.get())
		        .pattern("###")
		        .pattern("# #")
		        .pattern("###")
		        .unlockedBy("has_item", has(Items.CLAY_BALL))
		        .save(consumer);
		
		SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModItems.GROUT.get()), ModItems.BLAST_BRICK.get(), 0.7f, 200)
				.unlockedBy("has_item", has(ModItems.GROUT.get()))
				.save(consumer);;
	}

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(ArmoryReforged.MOD_ID, path);
    }
}
