package com.psilocke.armoryreforged.datagen;

import com.psilocke.armoryreforged.ArmoryReforged;
import com.psilocke.armoryreforged.registry.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ArmoryReforged.MOD_ID, exFileHelper);
    }

	@Override
	protected void registerStatesAndModels() {
		horizontalBlock(ModBlocks.REFORGE_FURNACE_BLOCK.get(), 
				modLoc("block/blast_furnace_side"), 
				modLoc("block/blast_furnace_front"), 
				modLoc("block/blast_furnace_top"));
		simpleBlock(ModBlocks.BLAST_BRICK_BLOCK.get());
	}
}
