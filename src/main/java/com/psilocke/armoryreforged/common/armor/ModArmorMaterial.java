package com.psilocke.armoryreforged.common.armor;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterial implements ArmorMaterial{
	
	;
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
	private final String name;
	private final int maxDamageFactor;
	private final int[] resistanceArray;
	private final int enchantability;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final Supplier<Ingredient> repairMaterial;
	
	ModArmorMaterial(String name, int maxDamageFactor, int[] resistanceArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial){
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.resistanceArray = resistanceArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return 0;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return 0;
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public SoundEvent getEquipSound() {
		return null;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public float getToughness() {
		return 0;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}

}
