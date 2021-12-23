package com.psilocke.armoryreforged.datagen;

import com.psilocke.armoryreforged.ArmoryReforged;
import com.psilocke.armoryreforged.registry.ModBlocks;
import com.psilocke.armoryreforged.registry.ModTags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ArmoryReforged.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        //tag(ModTags.Blocks.ORES_SILVER).add(ModBlocks.SILVER_ORE.get());
    }
}
