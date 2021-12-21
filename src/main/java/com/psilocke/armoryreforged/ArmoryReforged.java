package com.psilocke.armoryreforged;

import com.psilocke.armoryreforged.registry.Registration;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("armoryreforged")
public class ArmoryReforged{

    public static final String MOD_ID = "armoryreforged";

	public ArmoryReforged() {
    	Registration.register();
		// Register the doClientStuff method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
    }
	
	private void doClientStuff(final FMLClientSetupEvent event) {
	}
	
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
