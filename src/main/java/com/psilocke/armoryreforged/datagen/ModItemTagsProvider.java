package com.psilocke.armoryreforged.datagen;

import com.psilocke.armoryreforged.ArmoryReforged;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(DataGenerator gen, BlockTagsProvider provider, ExistingFileHelper helper) {
		super(gen, provider, ArmoryReforged.MOD_ID, helper);
	}
	
	@Override
    protected void addTags() {
        //copy(ModTags.Blocks.ORES_SILVER, ModTags.Items.ORES_SILVER);/

        //tag(ModTags.Items.INGOTS_SILVER).add(ModItems.SILVER_INGOT.get());/
    }
	
}
