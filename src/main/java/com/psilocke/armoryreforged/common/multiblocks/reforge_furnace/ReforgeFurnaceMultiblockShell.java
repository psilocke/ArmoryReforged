package com.psilocke.armoryreforged.common.multiblocks.reforge_furnace;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.extensions.IForgeBlockEntity;
import net.minecraftforge.common.util.LazyOptional;

public class ReforgeFurnaceMultiblockShell extends Block implements IForgeBlockEntity {

	public ReforgeFurnaceMultiblockShell(Properties prop) {
		super(prop);
	}

	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompoundTag getTileData() {
		// TODO Auto-generated method stub
		return null;
	}

}
