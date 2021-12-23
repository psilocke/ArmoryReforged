package com.psilocke.armoryreforged.datagen;

import com.psilocke.armoryreforged.ArmoryReforged;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ArmoryReforged.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("blast_brick_block", modLoc("block/blast_brick_block"));
        orientable("reforge_furnace_block", 
				modLoc("block/blast_furnace_side"), 
				modLoc("block/blast_furnace_front"), 
				modLoc("block/blast_furnace_top"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        
        builder(itemGenerated, "grout");
        builder(itemGenerated, "blast_brick");
        builder(itemGenerated, "reforge_hammer");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
